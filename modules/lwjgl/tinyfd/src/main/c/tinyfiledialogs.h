/*_________
 /         \ tinyfiledialogs.h v3.6.6 [Sep 23, 2020] zlib licence
 |tiny file| Unique header file created [November 9, 2014]
 | dialogs | Copyright (c) 2014 - 2020 Guillaume Vareille http://ysengrin.com
 \____  ___/ http://tinyfiledialogs.sourceforge.net
      \|     git clone http://git.code.sf.net/p/tinyfiledialogs/code tinyfd
 ____________________________________________
|                                            |
|   email: tinyfiledialogs at ysengrin.com   |
|____________________________________________|
 ________________________________________________________________________________
|  ____________________________________________________________________________  |
| |                                                                            | |
| | on windows:                                                                | |
| |  - for UTF-16, use the wchar_t functions at the bottom of the header file  | |
| |  - _wfopen() requires wchar_t                                              | |
| |                                                                            | |
| |  - in tinyfiledialogs, char is UTF-8 by default (since v3.6)               | |
| |  - but fopen() expects MBCS (not UTF-8)                                    | |
| |  - if you want char to be MBCS: set tinyfd_winUtf8 to 0                    | |
| |                                                                            | |
| |  - alternatively, tinyfiledialogs provides                                 | |
| |                        functions to convert between UTF-8, UTF-16 and MBCS | |
| |____________________________________________________________________________| |
|________________________________________________________________________________|

If you like tinyfiledialogs, please upvote my stackoverflow answer
https://stackoverflow.com/a/47651444

tiny file dialogs (cross-platform C C++)
InputBox PasswordBox MessageBox ColorPicker
OpenFileDialog SaveFileDialog SelectFolderDialog
Native dialog library for WINDOWS MAC OSX GTK+ QT CONSOLE & more
SSH supported via automatic switch to console mode or X11 forwarding

one C file + a header (add them to your C or C++ project) with 8 functions:
- beep
- notify popup (tray)
- message & question
- input & password
- save file
- open file(s)
- select folder
- color picker

Complements OpenGL Vulkan GLFW GLUT GLUI VTK SFML TGUI
SDL Ogre Unity3d ION OpenCV CEGUI MathGL GLM CPW GLOW
Open3D IMGUI MyGUI GLT NGL STB & GUI less programs

NO INIT
NO MAIN LOOP
NO LINKING
NO INCLUDE

The dialogs can be forced into console mode

Windows (XP to 10) ASCII MBCS UTF-8 UTF-16
- native code & vbs create the graphic dialogs
- enhanced console mode can use dialog.exe from
http://andrear.altervista.org/home/cdialog.php
- basic console input

Unix (command line calls) ASCII UTF-8
- applescript, kdialog, zenity
- python (2 or 3) + tkinter + python-dbus (optional)
- dialog (opens a console if needed)
- basic console input
The same executable can run across desktops & distributions

C89/C18 & C++98/C++20 compliant: tested with C & C++ compilers
VisualStudio MinGW-gcc GCC Clang TinyCC OpenWatcom-v2 BorlandC SunCC ZapCC
on Windows Mac Linux Bsd Solaris Minix Raspbian
using Gnome Kde Enlightenment Mate Cinnamon Budgie Unity Lxde Lxqt Xfce
WindowMaker IceWm Cde Jds OpenBox Awesome Jwm Xdm Cwm

Bindings for LUA and C# dll, Haskell, Fortran
Included in LWJGL(java), Rust, Allegrobasic

- License -

This software is provided 'as-is', without any express or implied
warranty.  In no event will the authors be held liable for any damages
arising from the use of this software.

Permission is granted to anyone to use this software for any purpose,
including commercial applications, and to alter it and redistribute it
freely, subject to the following restrictions:

1. The origin of this software must not be misrepresented; you must not
claim that you wrote the original software.  If you use this software
in a product, an acknowledgment in the product documentation would be
appreciated but is not required.
2. Altered source versions must be plainly marked as such, and must not be
misrepresented as being the original software.
3. This notice may not be removed or altered from any source distribution.
*/

#ifndef TINYFILEDIALOGS_H
#define TINYFILEDIALOGS_H

#ifdef	__cplusplus
extern "C" { /* if tinydialogs.c is compiled as C++ code rather than C code, you may need to comment this out
			    and the corresponding closing bracket near the end of this file. */
#endif

/******************************************************************************************************/
/**************************************** UTF-8 on Windows ********************************************/
/******************************************************************************************************/
#ifdef _WIN32
/* On windows, if you want to use UTF-8 ( instead of the UTF-16/wchar_t functions at the end of this file )
Make sure your code is really prepared for UTF-8 (on windows, functions like fopen() expect MBCS and not UTF-8) */
extern int tinyfd_winUtf8; /* on windows char strings can be 1:UTF-8(default) or 0:MBCS */
/* for MBCS change this to 0, in tinyfiledialogs.c or in your code */

/* Here are some functions to help you convert between UTF-16 UTF-8 MBSC */
char * tinyfd_utf8toMbcs(char const * aUtf8string);
char * tinyfd_utf16toMbcs(wchar_t const * aUtf16string);
wchar_t * tinyfd_mbcsTo16(char const * aMbcsString);
char * tinyfd_mbcsTo8(char const * aMbcsString);
wchar_t * tinyfd_utf8to16(char const * aUtf8string);
char * tinyfd_utf16to8(wchar_t const * aUtf16string);

void tinyfd_setWinUtf8(int aIsUtf8); /* only to be used from C# to set the global variable tinyfd_winUtf8 to 1 or 0 */
#endif
/******************************************************************************************************/
/******************************************************************************************************/
/******************************************************************************************************/

extern char const tinyfd_version[8]; /* contains tinyfd current version number */
extern char const tinyfd_needs[]; /* info about requirements */
extern int tinyfd_verbose; /* 0 (default) or 1 : on unix, prints the command line calls */
extern int tinyfd_silent; /* 1 (default) or 0 : on unix, hide errors and warnings from called dialogs */

/* Curses dialogs are difficult to use, on windows they are only ascii */
/* int const tinyfd_allowCursesDialogs; 0 (default) or 1 : you can change this in tinyfiledialogs.c */

extern int tinyfd_forceConsole;  /* 0 (default) or 1 */
/* for unix & windows: 0 (graphic mode) or 1 (console mode).
0: try to use a graphic solution, if it fails then it uses console mode.
1: forces all dialogs into console mode even when an X server is present,
  if the package dialog (and a console is present) or dialog.exe is installed.
  on windows it only make sense for console applications */

extern char tinyfd_response[1024];
/* if you pass "tinyfd_query" as aTitle,
the functions will not display the dialogs
but will return 0 for console mode, 1 for graphic mode.
tinyfd_response is then filled with the retain solution.
possible values for tinyfd_response are (all lowercase)
for graphic mode:
  windows_wchar windows
  applescript kdialog zenity zenity3 matedialog qarma
  python2-tkinter python3-tkinter python-dbus perl-dbus
  gxmessage gmessage xmessage xdialog gdialog
for console mode:
  dialog whiptail basicinput no_solution */

void tinyfd_beep(void);

int tinyfd_notifyPopup(
	char const * aTitle, /* NULL or "" */
	char const * aMessage, /* NULL or "" may contain \n \t */
	char const * aIconType); /* "info" "warning" "error" */
		/* return has only meaning for tinyfd_query */

int tinyfd_messageBox(
	char const * aTitle , /* NULL or "" */
	char const * aMessage , /* NULL or "" may contain \n \t */
	char const * aDialogType , /* "ok" "okcancel" "yesno" "yesnocancel" */
	char const * aIconType , /* "info" "warning" "error" "question" */
	int aDefaultButton ) ;
		/* 0 for cancel/no , 1 for ok/yes , 2 for no in yesnocancel */

char * tinyfd_inputBox(
	char const * aTitle , /* NULL or "" */
	char const * aMessage , /* NULL or "" may NOT contain \n \t on windows */
	char const * aDefaultInput ) ;  /* "" , if NULL it's a passwordBox */
		/* returns NULL on cancel */

char * tinyfd_saveFileDialog(
	char const * aTitle , /* NULL or "" */
	char const * aDefaultPathAndFile , /* NULL or "" */
	int aNumOfFilterPatterns , /* 0 */
	char const * const * aFilterPatterns , /* NULL | {"*.jpg","*.png"} */
	char const * aSingleFilterDescription ) ; /* NULL | "text files" */
		/* returns NULL on cancel */

char * tinyfd_openFileDialog(
	char const * aTitle , /* NULL or "" */
	char const * aDefaultPathAndFile , /* NULL or "" */
	int aNumOfFilterPatterns , /* 0 */
	char const * const * aFilterPatterns , /* NULL | {"*.jpg","*.png"} */
	char const * aSingleFilterDescription , /* NULL | "image files" */
	int aAllowMultipleSelects ) ; /* 0 or 1 */
		/* in case of multiple files, the separator is | */
		/* returns NULL on cancel */

char * tinyfd_selectFolderDialog(
	char const * aTitle , /* NULL or "" */
	char const * aDefaultPath ) ; /* NULL or "" */
		/* returns NULL on cancel */

char * tinyfd_colorChooser(
	char const * aTitle , /* NULL or "" */
	char const * aDefaultHexRGB , /* NULL or "#FF0000" */
	unsigned char const aDefaultRGB[3] , /* { 0 , 255 , 255 } */
	unsigned char aoResultRGB[3] ) ; /* { 0 , 0 , 0 } */
		/* returns the hexcolor as a string "#FF0000" */
		/* aoResultRGB also contains the result */
		/* aDefaultRGB is used only if aDefaultHexRGB is NULL */
		/* aDefaultRGB and aoResultRGB can be the same array */
		/* returns NULL on cancel */


/************ WINDOWS ONLY SECTION ************************/
#ifdef _WIN32

/* windows only - utf-16 version */
int tinyfd_notifyPopupW(
	wchar_t const * aTitle, /* NULL or L"" */
	wchar_t const * aMessage, /* NULL or L"" may contain \n \t */
	wchar_t const * aIconType); /* L"info" L"warning" L"error" */

/* windows only - utf-16 version */
int tinyfd_messageBoxW(
	wchar_t const * aTitle , /* NULL or L"" */
	wchar_t const * aMessage, /* NULL or L"" may contain \n \t */
	wchar_t const * aDialogType, /* L"ok" L"okcancel" L"yesno" */
	wchar_t const * aIconType, /* L"info" L"warning" L"error" L"question" */
	int aDefaultButton ); /* 0 for cancel/no , 1 for ok/yes */
		/* returns 0 for cancel/no , 1 for ok/yes */

/* windows only - utf-16 version */
wchar_t * tinyfd_inputBoxW(
	wchar_t const * aTitle, /* NULL or L"" */
	wchar_t const * aMessage, /* NULL or L"" may NOT contain \n nor \t */
	wchar_t const * aDefaultInput ); /* L"" , if NULL it's a passwordBox */

/* windows only - utf-16 version */
wchar_t * tinyfd_saveFileDialogW(
	wchar_t const * aTitle, /* NULL or L"" */
	wchar_t const * aDefaultPathAndFile, /* NULL or L"" */
	int aNumOfFilterPatterns, /* 0 */
	wchar_t const * const * aFilterPatterns, /* NULL or {L"*.jpg",L"*.png"} */
	wchar_t const * aSingleFilterDescription); /* NULL or L"image files" */
		/* returns NULL on cancel */

/* windows only - utf-16 version */
wchar_t * tinyfd_openFileDialogW(
	wchar_t const * aTitle, /* NULL or L"" */
	wchar_t const * aDefaultPathAndFile, /* NULL or L"" */
	int aNumOfFilterPatterns , /* 0 */
	wchar_t const * const * aFilterPatterns, /* NULL {L"*.jpg",L"*.png"} */
	wchar_t const * aSingleFilterDescription, /* NULL or L"image files" */
	int aAllowMultipleSelects ) ; /* 0 or 1 */
		/* in case of multiple files, the separator is | */
		/* returns NULL on cancel */

/* windows only - utf-16 version */
wchar_t * tinyfd_selectFolderDialogW(
	wchar_t const * aTitle, /* NULL or L"" */
	wchar_t const * aDefaultPath); /* NULL or L"" */
		/* returns NULL on cancel */

/* windows only - utf-16 version */
wchar_t * tinyfd_colorChooserW(
	wchar_t const * aTitle, /* NULL or L"" */
	wchar_t const * aDefaultHexRGB, /* NULL or L"#FF0000" */
	unsigned char const aDefaultRGB[3] , /* { 0 , 255 , 255 } */
	unsigned char aoResultRGB[3] ) ; /* { 0 , 0 , 0 } */
		/* returns the hexcolor as a string L"#FF0000" */
		/* aoResultRGB also contains the result */
		/* aDefaultRGB is used only if aDefaultHexRGB is NULL */
		/* aDefaultRGB and aoResultRGB can be the same array */
		/* returns NULL on cancel */

#endif /*_WIN32 */

#ifdef	__cplusplus
} /*extern "C"*/
#endif

#endif /* TINYFILEDIALOGS_H */

/*
- This is not for ios nor android (it works in termux though).
- The code is pure C, perfectly compatible with C++.
- windows is fully supported from XP to 10 (maybe even older versions)
- C# & LUA via dll, see files in the folder EXTRAS
- OSX supported from 10.4 to latest (maybe even older versions)
- Avoid using " and ' in titles and messages.
- There's one file filter only, it may contain several patterns.
- If no filter description is provided,
  the list of patterns will become the description.
- char const * filterPatterns[3] = { "*.obj" , "*.stl" , "*.dxf" } ;
- On windows char defaults to UTF-8, set tinyfd_winUtf8=0 to use MBCS
- On windows link against Comdlg32.lib and Ole32.lib
  (on windows the no linking claim is a lie)
  This linking is not compulsary for console mode (see header file).
- On unix: it tries command line calls, so no such need (NO LINKING).
- On unix you need one of the following:
  applescript, kdialog, zenity, matedialog, shellementary, qarma,
  python (2 or 3)/tkinter/python-dbus (optional), Xdialog
  or dialog (opens terminal if running without console) or xterm.
- One of those is already included on most (if not all) desktops.
- In the absence of those it will use gdialog, gxmessage or whiptail
  with a textinputbox.
- If nothing is found, it switches to basic console input,
  it opens a console if needed (requires xterm + bash).
- Use windows separators on windows and unix separators on unix.
- String memory is preallocated statically for all the returned values.
- File and path names are tested before return, they are valid.
- If you pass only a path instead of path + filename,
  make sure it ends with a separator.
- tinyfd_forceConsole=1; at run time, forces dialogs into console mode.
- On windows, console mode only make sense for console applications.
- On windows, Console mode is not implemented for wchar_T UTF-16.
- Mutiple selects are not allowed in console mode.
- The package dialog must be installed to run in enhanced console mode.
  It is already installed on most unix systems.
- On osx, the package dialog can be installed via
  http://macappstore.org/dialog or http://macports.org
- On windows, for enhanced console mode,
  dialog.exe should be copied somewhere on your executable path.
  It can be found at the bottom of the following page:
  http://andrear.altervista.org/home/cdialog.php
- If dialog is missing, it will switch to basic console input.
- You can query the type of dialog that will be use (pass "tinyfd_query" as aTitle)
*/
