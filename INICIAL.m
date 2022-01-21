function varargout = INICIAL(varargin)
%INICIAL MATLAB code file for INICIAL.fig
%      INICIAL, by itself, creates a new INICIAL or raises the existing
%      singleton*.
%
%      H = INICIAL returns the handle to a new INICIAL or the handle to
%      the existing singleton*.
%
%      INICIAL('Property','Value',...) creates a new INICIAL using the
%      given property value pairs. Unrecognized properties are passed via
%      varargin to INICIAL_OpeningFcn.  This calling syntax produces a
%      warning when there is an existing singleton*.
%
%      INICIAL('CALLBACK') and INICIAL('CALLBACK',hObject,...) call the
%      local function named CALLBACK in INICIAL.M with the given input
%      arguments.
%
%      *See GUI Options on GUIDE's Tools menu.  Choose "GUI allows only one
%      instance to run (singleton)".
%
% See also: GUIDE, GUIDATA, GUIHANDLES

% Edit the above text to modify the response to help INICIAL

% Last Modified by GUIDE v2.5 17-Nov-2019 18:50:16

% Begin initialization code - DO NOT EDIT
gui_Singleton = 1;
gui_State = struct('gui_Name',       mfilename, ...
                   'gui_Singleton',  gui_Singleton, ...
                   'gui_OpeningFcn', @INICIAL_OpeningFcn, ...
                   'gui_OutputFcn',  @INICIAL_OutputFcn, ...
                   'gui_LayoutFcn',  [], ...
                   'gui_Callback',   []);
if nargin && ischar(varargin{1})
   gui_State.gui_Callback = str2func(varargin{1});
end

if nargout
    [varargout{1:nargout}] = gui_mainfcn(gui_State, varargin{:});
else
    gui_mainfcn(gui_State, varargin{:});
end
% End initialization code - DO NOT EDIT


% --- Executes just before INICIAL is made visible.
function INICIAL_OpeningFcn(hObject, eventdata, handles, varargin)
% This function has no output args, see OutputFcn.
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
% varargin   unrecognized PropertyName/PropertyValue pairs from the
%            command line (see VARARGIN)

% Choose default command line output for INICIAL
handles.output = hObject;

% Update handles structure
guidata(hObject, handles);

% UIWAIT makes INICIAL wait for user response (see UIRESUME)
% uiwait(handles.figure1);


% --- Outputs from this function are returned to the command line.
function varargout = INICIAL_OutputFcn(hObject, eventdata, handles)
% varargout  cell array for returning output args (see VARARGOUT);
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Get default command line output from handles structure
varargout{1} = handles.output;


% --- Executes on selection change in LISTA.
function LISTA_Callback(hObject, eventdata, handles)
% hObject    handle to LISTA (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: contents = cellstr(get(hObject,'String')) returns LISTA contents as cell array
%        contents{get(hObject,'Value')} returns selected item from LISTA


% --- Executes during object creation, after setting all properties.
function LISTA_CreateFcn(hObject, eventdata, handles)
% hObject    handle to LISTA (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: popupmenu controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end


% --- Executes on button press in Aceptar.
function Aceptar_Callback(hObject, eventdata, handles)
% hObject    handle to Aceptar (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
    if(get(handles.LISTA,'Value')==1)
        
    else
        
    end
