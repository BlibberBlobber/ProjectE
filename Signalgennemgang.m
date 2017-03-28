clear; close all; clc;
% Uønsket signalgennemgang
figure();
subplot(2,1,1);
Tsample =8000; %Hz
T = 1/Tsample;
t = (0:T:1-T);
sigTest = 1 * sin(2*pi*9000*t); 
N = length(sigTest);
n = (0:1:length(sigTest)-1);

%soundsc(sigTest,Tsample);

stem(n, sigTest); grid on;
axis([0 50 -1 1]);
title('Tidsdomæne');
xlabel('Samples (n)'); ylabel('Amplitude'), legend('9 kHz signal');

sigTestFFT = abs(fft(sigTest))/N;
sigTestFFT(2:N) = 2*sigTestFFT(2:N);

f = (0:1:N/2)*Tsample/N;

subplot(2,1,2);
plot(f,sigTestFFT(1:1:N/2+1), 'o-'), grid on;
axis([0 4000 0 1.5]);
title('Frekvensdomæne');
xlabel('Frekvens (Hz)'); ylabel('|X(k)|');