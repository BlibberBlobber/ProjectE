clear; clc; close all;
% Illustration af FFT

Fs = 8000;
T = 1/Fs;
t = (0:T:1-T);
Signal = sin(2*pi*2000*t);
N = length(Signal);
subplot(2,1,1), plot((1:1:N),Signal), axis([0 50 -1 1]), xlabel(...
    'N samples');
ylabel('Signal'), title('Tidsdomæne');

%Zero-padding
Signal = [Signal zeros(1,(8192-N))];
N = length(Signal);

%Opret frekvens-akse
f = (0:1:N-1)*Fs/N;

%Lav dobbeltsidet FFT. 
sig_FFT = fft(Signal)/N;
subplot(2,1,2);
plot(f,abs(sig_FFT)), xlabel('Frekvens (Hz)'), ylabel('Amplitude'), 
title('Frekvensdomæne');

% ---------- Med fløjt ----------- %
figure('Name', 'Et fløjt');
filename = 'floejt.dat';
flojt = importdata(filename);
N = length(flojt);
f = (0:1:N-1)*Fs/N;
subplot(2,1,1), plot((1:1:N),flojt), xlabel(...
    'N samples');
ylabel('Signal'), title('Tidsdomæne');
sig_FFT = fft(flojt)/N;
subplot(2,1,2);
plot(f,abs(sig_FFT)), xlabel('Frekvens (Hz)'), ylabel('Amplitude'), 
title('Frekvensdomæne');

