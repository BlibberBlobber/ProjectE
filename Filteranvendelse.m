clear; clc; close all;

% Second order key-Sallen lowpass filter
fc = 3200; % Hz
c2 = 1e-9;
R1 = sqrt(2)/(c2*(2*pi*fc));
R2 = R1;
c1 = 1/(R1*R2*c2*(2*pi*fc)^2);
f = 1:1:1e4;
w = 2*pi*f;
s = j*w;

H = 1./(s.^2*(R1*R2*c1*c2)+s*(R1*c2+R2*c2+R1*c1)+1);

figure();
semilogx(f,20*log10(abs(H))), grid on, title('Lavpasfilter');
ylabel('Amplitude |H|'), xlabel('Hz');
axis([100 1e4 -25 0])
hold on;

f = [1000 2000 3000 4000 5000 6000 7000 8000 9000];
w = 2*pi*f;
s = j*w;
H2 = 1./(s.^2*(R1*R2*c1*c2)+s*(R1*c2+R2*c2+R1*c1)+1);

%HER KOMMER DER NOGLE STREGER
%plot([20*log10(abs(H2(1))),0],[20*log10(abs(H2(1))),1000]), hold on;
stem(f,20*log10(abs(H2)),'o'), legend('Filter','Dæmpning af toner');

%------------- Find filter af høj nok orden ----------%
fc = 3200; % Hz
c2 = 5e-3;
R1 = sqrt(2)/(c2*(2*pi*fc));
R2 = R1;
c1 = 1/(R1*R2*c2*(2*pi*fc)^2);

f = 1:1:1e4;
w = 2*pi*f;
s = j*w;

H = 1./(s.^2*(R1*R2*c1*c2)+s*(R1*c2+R2*c2+R1*c1)+1);
H = H.*H.*H.*H.*H.*H;
20*log10(abs(H(3000)))-20*log10(abs(H(9000)))

figure();
semilogx(f,20*log10(abs(H))), title('12.ordens filter'), grid on, legend('Filter');
%axis([100 1e4 -140 0]);