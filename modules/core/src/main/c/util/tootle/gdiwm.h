/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef GDIWM_H
#define GDIWM_H
/* -------------------------------------------------------------------------*\
* This is an abstraction that simplifies window management.
* Instead of implementing a window procedure, we implement the interface
* found in "gdiwindow.h", which is arguably much nicer.
\* -------------------------------------------------------------------------*/
#include <windows.h>

// forward declaration of window class
class GDIWindow;

/* -------------------------------------------------------------------------*\
* Initializes module.
\* -------------------------------------------------------------------------*/
int GDIWMOpen(void);

/* -------------------------------------------------------------------------*\
* Deinitializes module.
\* -------------------------------------------------------------------------*/
int GDIWMClose(void);

/* -------------------------------------------------------------------------*\
* Creates and shows new window with title "pszName" and whose controlling
* object instance is given by the pointer "window".
\* -------------------------------------------------------------------------*/
HWND GDIWMCreateWindow(const char* pszName, GDIWindow* window);

/* -------------------------------------------------------------------------*\
* Destroy window controled by the object instance pointer "window".
\* -------------------------------------------------------------------------*/
int GDIWMDestroyWindow(GDIWindow* window);

/* -------------------------------------------------------------------------*\
* Causes a window to start receiving calls to its Window::Idle method
* whenever the system is not processing other messages.
\* -------------------------------------------------------------------------*/
int GDIWMStartIdle(GDIWindow* window);

/* -------------------------------------------------------------------------*\
* Prevents a window from receiving idle calls.
\* -------------------------------------------------------------------------*/
int GDIWMStopIdle(GDIWindow* window);

/* -------------------------------------------------------------------------*\
* Changes the size of a window.
\* -------------------------------------------------------------------------*/
void GDIWMResizeWindow(GDIWindow* window, int nWidth, int nHeight);

/* -------------------------------------------------------------------------*\
* Starts the message loop. This function blocks until one of the windows
* posts a QUIT message.
\* -------------------------------------------------------------------------*/
void GDIWMMainLoop(void);

/* -------------------------------------------------------------------------*\
* Add a dialog box to the message processing loop.
\* -------------------------------------------------------------------------*/
int GDIWMAddDialog(HWND hDlg);

/* -------------------------------------------------------------------------*\
* Window procedure used by windows created with GDIWMCreate window.
\* -------------------------------------------------------------------------*/
LRESULT CALLBACK GDIMsgProc(HWND hWnd, UINT uMsg, UINT wParam, LONG lParam);

#endif // GDIWM_H
