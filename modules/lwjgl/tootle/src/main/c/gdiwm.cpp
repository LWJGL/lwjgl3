/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"
#include <cstdio>
#include "gdiwm.h"
#include "gdiwindow.h"

static WNDCLASSEX GDIWMClass;
static int width = 512, height = 512;

#define MAXWINDOW 256
static GDIWindow* idle[MAXWINDOW];
static int idle_top = 0;

static HWND dlg[MAXWINDOW];
static int dlg_top = 0;

int GDIWMAddDialog(HWND hdlg)
{
    if (dlg_top < MAXWINDOW)
    {
        dlg[dlg_top++] = hdlg;
        return 1;
    }
    else
    {
        return 0;
    }
}

int GDIWMOpen(void)
{
    // Register the window class
    GDIWMClass.cbSize = sizeof(WNDCLASSEX);
    GDIWMClass.style = CS_HREDRAW | CS_VREDRAW | CS_OWNDC;
    GDIWMClass.lpfnWndProc = (WNDPROC) GDIMsgProc;
    GDIWMClass.cbClsExtra = 0L;
    GDIWMClass.cbWndExtra = sizeof(void*);  // room for window object pointer
    GDIWMClass.hInstance = GetModuleHandle(NULL);
    GDIWMClass.hIcon = NULL;
    GDIWMClass.hCursor = LoadCursor(NULL, IDC_ARROW);
    GDIWMClass.hbrBackground = NULL;
    GDIWMClass.lpszMenuName = NULL;
    GDIWMClass.lpszClassName = "GDIWMClass";
    GDIWMClass.hIconSm = NULL;
    RegisterClassEx(&GDIWMClass);
    return 1;
}

HWND GDIWMCreateWindow(const char* name, GDIWindow* window)
{
    RECT r = {0, 0, width, height};
    AdjustWindowRect(&r, WS_OVERLAPPEDWINDOW, false);
    // Create the application's window
    HWND hWnd = CreateWindow("GDIWMClass", name,
                             WS_OVERLAPPEDWINDOW,
                             CW_USEDEFAULT, CW_USEDEFAULT,
                             r.right - r.left, r.bottom - r.top,
                             GetDesktopWindow(),
                             NULL,
                             GDIWMClass.hInstance,
                             NULL);
    // Hang window object on window
    SetWindowLong(hWnd, 0, *(LONG*)(&window));
    window->SetHandle(hWnd);
    window->Create();
    window->Reshape(width, height);

    // Show the window
    ShowWindow(hWnd, SW_SHOWDEFAULT);
    // MoveWindow(hWnd, 1300, 0, r.right-r.left, r.bottom - r.top, FALSE);
    UpdateWindow(hWnd);

    return hWnd;
}

void GDIWMResizeWindow(GDIWindow* window, int width, int height)
{
    RECT r;
    GetWindowRect(window->GetHandle(), &r);
    r.right = r.left + width;
    r.bottom = r.top + height;
    AdjustWindowRect(&r, WS_OVERLAPPEDWINDOW, false);
    MoveWindow(window->GetHandle(), r.left, r.top, r.right - r.left,
               r.bottom - r.top, FALSE);
    UpdateWindow(window->GetHandle());
}


int GDIWMDestroyWindow(GDIWindow* window)
{
    window->Destroy();
    DestroyWindow(window->GetHandle());
    return 1;
}

int GDIWMClose(void)
{
    UnregisterClass("GDIWMClass", GDIWMClass.hInstance);
    return 0;
}

LRESULT CALLBACK GDIMsgProc(HWND hWnd, UINT uMsg, UINT wParam, LONG lParam)
{
    RECT r;
    int y;
    LONG L = GetWindowLong(hWnd, 0);
    GDIWindow* window = *(GDIWindow**)(&L);

    switch (uMsg)
    {
        // Window size change event
        case WM_SIZE:
            window->Reshape(LOWORD(lParam), HIWORD(lParam));
            InvalidateRect(hWnd, NULL, FALSE);
            return 0;

        // Window repaint callback
        case WM_PAINT:
        {
            window->Display();
            ValidateRect(hWnd, NULL);
            return 0;
        }

        // Mouse button events
        case WM_LBUTTONDOWN:
            SetCapture(hWnd);
            GetClientRect(hWnd, &r);
            y = r.bottom - (short) HIWORD(lParam) - 1;
            window->Button(M_LEFT, M_DOWN, (short) LOWORD(lParam), y,
                           (WORD)(((wParam & MK_CONTROL) ? M_CONTROL : 0) |
                                  ((wParam & MK_SHIFT) ? M_SHIFT : 0)));
            return 0;

        case WM_RBUTTONDOWN:
            SetCapture(hWnd);
            GetClientRect(hWnd, &r);
            y = r.bottom - (short) HIWORD(lParam) - 1;
            window->Button(M_RIGHT, M_DOWN, (short) LOWORD(lParam), y,
                           (WORD)(((wParam & MK_CONTROL) ? M_CONTROL : 0) |
                                  ((wParam & MK_SHIFT) ? M_SHIFT : 0)));
            return 0;

        case WM_MBUTTONDOWN:
            SetCapture(hWnd);
            GetClientRect(hWnd, &r);
            y = r.bottom - (short) HIWORD(lParam) - 1;
            window->Button(M_MIDDLE, M_DOWN, (short) LOWORD(lParam), y,
                           (WORD)(((wParam & MK_CONTROL) ? M_CONTROL : 0) |
                                  ((wParam & MK_SHIFT) ? M_SHIFT : 0)));
            return 0;

        case WM_LBUTTONUP:
            ReleaseCapture();
            GetClientRect(hWnd, &r);
            y = r.bottom - (short) HIWORD(lParam) - 1;
            window->Button(M_LEFT, M_UP, (short) LOWORD(lParam), y,
                           (WORD)(((wParam & MK_CONTROL) ? M_CONTROL : 0) |
                                  ((wParam & MK_SHIFT) ? M_SHIFT : 0)));
            return 0;

        case WM_RBUTTONUP:
            ReleaseCapture();
            GetClientRect(hWnd, &r);
            y = r.bottom - (short) HIWORD(lParam) - 1;
            window->Button(M_RIGHT, M_UP, (short) LOWORD(lParam), y,
                           (WORD)(((wParam & MK_CONTROL) ? M_CONTROL : 0) |
                                  ((wParam & MK_SHIFT) ? M_SHIFT : 0)));
            return 0;

        case WM_MBUTTONUP:
            ReleaseCapture();
            GetClientRect(hWnd, &r);
            y = r.bottom - (short) HIWORD(lParam) - 1;
            window->Button(M_MIDDLE, M_UP, (short) LOWORD(lParam), y,
                           (WORD)(((wParam & MK_CONTROL) ? M_CONTROL : 0) |
                                  ((wParam & MK_SHIFT) ? M_SHIFT : 0)));
            return 0;

        case WM_LBUTTONDBLCLK:
            GetClientRect(hWnd, &r);
            y = r.bottom - (short) HIWORD(lParam) - 1;
            window->Button(M_LEFT, M_DOUBLE, (short) LOWORD(lParam), y,
                           (WORD)(((wParam & MK_CONTROL) ? M_CONTROL : 0) |
                                  ((wParam & MK_SHIFT) ? M_SHIFT : 0)));
            return 0;

        case WM_RBUTTONDBLCLK:
            GetClientRect(hWnd, &r);
            y = r.bottom - (short) HIWORD(lParam) - 1;
            window->Button(M_RIGHT, M_DOUBLE, (short) LOWORD(lParam), y,
                           (WORD)(((wParam & MK_CONTROL) ? M_CONTROL : 0) |
                                  ((wParam & MK_SHIFT) ? M_SHIFT : 0)));
            return 0;

        case WM_MBUTTONDBLCLK:
            GetClientRect(hWnd, &r);
            y = r.bottom - (short) HIWORD(lParam) - 1;
            window->Button(M_MIDDLE, M_DOUBLE, (short) LOWORD(lParam), y,
                           (WORD)(((wParam & MK_CONTROL) ? M_CONTROL : 0) |
                                  ((wParam & MK_SHIFT) ? M_SHIFT : 0)));
            return 0;

        // Mouse motion event
        case WM_MOUSEMOVE:
            GetClientRect(hWnd, &r);
            y = r.bottom - (short) HIWORD(lParam) - 1;
            window->Motion((short) LOWORD(lParam), y,
                           (WORD)(((wParam & MK_CONTROL) ? M_CONTROL : 0) |
                                  ((wParam & MK_SHIFT) ? M_SHIFT : 0)));
            return 0;

        // Time to leave the program...
        case WM_DESTROY:
            PostQuitMessage(0);
            return 0;

        // Keyboard event
        case WM_CHAR:
            window->Keyboard((unsigned char) wParam, 0, 0);
            return 0;

        default:
            break;
    }

    // Let the default window procedure handle the event
    if (window) { return window->Default(hWnd, uMsg, wParam, lParam); }
    else { return DefWindowProc(hWnd, uMsg, wParam, lParam); }
}

int GDIWMStartIdle(GDIWindow* window)
{
    // see if window is already in list
    for (int i = 0; i < idle_top; i++)
        if (idle[i] == window) { return 0; }

    // otherwise add it
    if (idle_top < MAXWINDOW)
    {
        idle[idle_top++] = window;
        InvalidateRect(window->GetHandle(), NULL, TRUE);
        return 1;
    }
    else { return 0; }
}

int GDIWMStopIdle(GDIWindow* window)
{
    // find window in list
    int found;

    for (found = 0; found < idle_top; found++)
        if (idle[found] == window) { break; }

    if (found < idle_top)
    {
        // shift everyone down to remove element
        for (int i = found + 1; i < idle_top; i++)
        {
            idle[i - 1] = idle[i];
        }

        idle_top--;
        return 1;
    }
    else { return 0; }
}

// Enter the message loop
void GDIWMMainLoop(void)
{
    MSG msg;

    // Switch back and forth the blocking GetMessage vs. the
    // non-blocking PeekMessage. That way we don't burn CPU when no window
    // is processing Idle calls.
    while (1)
    {
        BOOL bRet;

        while ((bRet = GetMessage(&msg, NULL, 0U, 0U)) != 0)
        {
            if (bRet == -1) { return; }

            int i = 0;

            while (i < dlg_top)
            {
                if (IsDialogMessage(dlg[i], &msg))
                {
                    break;
                }

                i++;
            }

            if (i >= dlg_top)
            {
                TranslateMessage(&msg);
                DispatchMessage(&msg);
            }

            if (idle_top >= 1) { break; }
        }

        if (msg.message == WM_QUIT) { return; }

        PeekMessage(&msg, NULL, 0U, 0U, PM_NOREMOVE);

        while (msg.message != WM_QUIT)
        {
            if (PeekMessage(&msg, NULL, 0U, 0U, PM_REMOVE))
            {
                int i = 0;

                while (i < dlg_top)
                {
                    if (IsDialogMessage(dlg[i], &msg))
                    {
                        break;
                    }

                    i++;
                }

                if (i >= dlg_top)
                {
                    TranslateMessage(&msg);
                    DispatchMessage(&msg);
                }
            }
            else
            {
                for (int i = 0; i < idle_top; i++)
                {
                    idle[i]->Idle();
                }
            }

            if (idle_top <= 0) { break; }
        }

        if (msg.message == WM_QUIT) { return; }
    }
}
