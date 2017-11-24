/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef GDIWINDOW_H
#define GDIWINDOW_H

#include "gdiwm.h"
#include "window.h"

class GDIWindow: public Window
{
public:
    typedef Window Superclass;
    GDIWindow() { m_hWnd = NULL; }
    virtual ~GDIWindow(void) { ; }
    virtual void Destroy(void)
    {
        Superclass::Destroy();
        m_hWnd = NULL;
    }
    virtual HWND GetHandle(void) { return m_hWnd; }
    virtual void SetHandle(HWND hWnd) { this->m_hWnd = hWnd; }
    virtual void Keyboard(unsigned char c, int x, int y)
    {
        (void) x; (void) y;

        if (c == 'q' || c == 'Q') { PostQuitMessage(0); }
    }
    virtual void StartIdle(void) { GDIWMStartIdle(this); }
    virtual void StopIdle(void) { GDIWMStopIdle(this); }
    virtual void PostRedisplay(void) { InvalidateRect(m_hWnd, NULL, FALSE); }
    virtual LRESULT Default(HWND hWnd, UINT uMsg, WPARAM wParam, LPARAM lParam)
    {
        return DefWindowProc(hWnd, uMsg, wParam, lParam);
    }
protected:
    HWND m_hWnd;
};

#endif // GDIWINDOW_H
