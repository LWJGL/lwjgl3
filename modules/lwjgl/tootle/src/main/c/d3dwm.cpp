/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"

#include "gdiwm.h"
#include "d3dwm.h"
#include "d3dwindow.h"

static LPDIRECT3D9 D3DWMContext = NULL;
static int width = 512, height = 512;

#define CREATE_WINDOW

extern "C" WINBASEAPI HWND WINAPI GetConsoleWindow();

int D3DWMOpen(void)
{
    return (D3DWMContext = Direct3DCreate9(D3D_SDK_VERSION)) != NULL;
}

void D3DWMFillD3DPP(D3DPRESENT_PARAMETERS* d3dpp, HWND hWnd, int w, int h)
{
    ZeroMemory(d3dpp, sizeof(D3DPRESENT_PARAMETERS));
    d3dpp->Windowed = TRUE;
    d3dpp->hDeviceWindow = hWnd;
    d3dpp->SwapEffect = D3DSWAPEFFECT_DISCARD;
    d3dpp->EnableAutoDepthStencil = TRUE;
    d3dpp->AutoDepthStencilFormat = D3DFMT_D16;
    d3dpp->BackBufferFormat = D3DFMT_UNKNOWN;
    d3dpp->BackBufferWidth = w;
    d3dpp->BackBufferHeight = h;
    d3dpp->PresentationInterval = D3DPRESENT_INTERVAL_IMMEDIATE;
    d3dpp->BackBufferCount = 2;
}

int D3DWMResetWindow(D3DWindow* window)
{
    D3DPRESENT_PARAMETERS d3dpp;
    D3DWMFillD3DPP(&d3dpp, window->GetHandle(), window->GetWidth(),
                   window->GetHeight());
    return window->GetD3DDevice()->Reset(&d3dpp) == D3D_OK;
}

HWND D3DWMCreateWindow(const char* name, D3DWindow* window)
{
    RECT r = {0, 0, width, height};
    AdjustWindowRect(&r, WS_OVERLAPPEDWINDOW, false);
    // Create the application's window

#ifdef CREATE_WINDOW
    HWND hWnd = CreateWindowEx(0,
                               "static",
                               NULL, 0x0,
                               CW_USEDEFAULT, CW_USEDEFAULT, 0, 0, NULL, NULL, GetModuleHandle(NULL), NULL);
#else
    HWND hWnd = GetConsoleWindow();
#endif

    // if it is a d3d window, create a D3D device for it
    D3DPRESENT_PARAMETERS d3dpp;
    D3DWMFillD3DPP(&d3dpp, hWnd, width, height);
    HRESULT hr;


    LPDIRECT3DDEVICE9 device;

    if (FAILED(hr = D3DWMContext->CreateDevice(D3DADAPTER_DEFAULT,
                                               D3DDEVTYPE_HAL, hWnd, D3DCREATE_HARDWARE_VERTEXPROCESSING | D3DCREATE_PUREDEVICE | D3DCREATE_FPU_PRESERVE, &d3dpp, &device)))
    {
        return NULL;
    }

    window->SetD3DDevice(device);
    window->SetHandle(hWnd);
    window->Create();
    window->Reshape(width, height);
    window->ResetDevice();
    //SetWindowLong(hWnd, 0, *(LONG *) (&window));
    // Show the window
    //ShowWindow(hWnd, SW_SHOWDEFAULT);
    //UpdateWindow(hWnd);
    return hWnd;
}

int D3DWMDestroyWindow(D3DWindow* window)
{
    window->Destroy();
#ifdef CREATE_WINDOW
    DestroyWindow(window->GetHandle());
#endif
    return 1;
}

int D3DWMClose(void)
{
    if (D3DWMContext)
    {
        D3DWMContext->Release();
        D3DWMContext = NULL;
    }

    return 0;
}

LRESULT CALLBACK D3DMsgProc(HWND hWnd, UINT uMsg, UINT wParam, LONG lParam)
{
    LONG L = GetWindowLong(hWnd, 0);
    D3DWindow* window = *(D3DWindow**)(&L);
    LPDIRECT3DDEVICE9 d3d = window ? window->GetD3DDevice() : NULL;

    switch (uMsg)
    {
        // Window size change event
        case WM_SIZE:
            window->LostDevice();
            window->Reset();
            window->ResetDevice();
            window->Reshape(LOWORD(lParam), HIWORD(lParam));
            InvalidateRect(hWnd, NULL, FALSE);
            return 0;

        // Window repaint callback
        case WM_PAINT:

            // reset device if it was lost
            if (d3d->TestCooperativeLevel() == D3DERR_DEVICENOTRESET)
            {
                window->LostDevice();
                window->Reset();
                window->ResetDevice();
            }

            // present only if window asks for it
            if (window->Display()) { d3d->Present(NULL, NULL, NULL, NULL); }

            ValidateRect(hWnd, NULL);
            return 0;

        // Time to leave the program...
        case WM_DESTROY:
            d3d->Release();
            window->Destroy();
            PostQuitMessage(0);
            return 0;

        default:
            break;
    }

    // Let the superclass window procedure handle the event
    return GDIMsgProc(hWnd, uMsg, wParam, lParam);
}
