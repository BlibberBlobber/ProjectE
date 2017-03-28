function [ tale_f ] = OneSideFFT( inputTale, sampleRate, titel )
%Ensidet fourier-transformation.
%Udfører diskret fourier-transformation.
%inputTale = signalet, der skal behandles
%sampleRate = sample-tid
%titel = titlen på plottet

fs = sampleRate;
N = length(inputTale);
index_t = (0:1:N-1);

figure('Name', titel, 'NumberTitle', 'on');
subplot(2,1,1);
plot(index_t,inputTale);
title('Input i tidsdomænet');
xlabel('Samples n'); ylabel('Lydsignal');

% Amplitude-spektrum
tale_f = abs(fft(inputTale))/N;
tale_f(2:N) = 2*tale_f(2:N);
f = (0:1:N/2)*fs/N;
subplot(2,1,2);
plot(f,tale_f(1:1:N/2+1),'-');
title('En-sidet amplitude-karakteristik');
xlabel('Frekvens (Hz)'); ylabel('Amplitude');

end