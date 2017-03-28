clear; clc; close all;
% En mandestemme og en kvindestemme er optaget og gemt som .dat-filer 
% Optagelserne er lavet med Optager.m

% Indhent mandlig tale-fil
filenameM = 'taleMand.dat';
mandeStemme = importdata(filenameM);
mandeStemme = mandeStemme';
figure('name','Spektrogram for mandestemme');
spectrogram(mandeStemme,2048,250,[],8000,'yaxis'); 
OneSideFFT(mandeStemme,8000,'Mand');

% Indhent kvindetale-fil 
filenameK = 'taleKvinde.dat';
kvindeStemme = importdata(filenameK);
kvindeStemme = kvindeStemme';
figure('name','Spektrogram for kvindestemme');
spectrogram(kvindeStemme,2048,250,[],8000,'yaxis'); 
%(signal, bredde af tidsbånd, overlap, [](?), fs, y-akse eller x-akse)
OneSideFFT(kvindeStemme,8000,'Kvinde');