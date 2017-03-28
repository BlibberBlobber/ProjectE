clear;
% Create a Recorderobject
recObj = audiorecorder(8000, 16, 2);
get(recObj);

% Record your voice for 5 seconds.
recObj = audiorecorder;
disp('Start speaking.')
recordblocking(recObj, 5); 
disp('End of Recording.'); 

% Store data in double-precision array.
myRecording = getaudiodata(recObj); 
save floejt.dat myRecording -ascii