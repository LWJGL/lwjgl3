/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef D3DWM_H
#define D3DWM_H

#include <d3d9.h>

#ifdef _DX11_1_
    #include <DirectXMath.h>
#else
    #include <d3dx9.h>
#endif

class D3DWindow;

int D3DWMOpen(void);
int D3DWMStartIdle(D3DWindow* window);
int D3DWMStopIdle(D3DWindow* window);
HWND D3DWMCreateWindow(const char* name, D3DWindow* window);
LRESULT CALLBACK D3DMsgProc(HWND hWnd, UINT uMsg, UINT wParam, LONG lParam);
int D3DWMResetWindow(D3DWindow* window);
int D3DWMDestroyWindow(D3DWindow* window);
int D3DWMClose(void);

#endif // D3DWM_H
