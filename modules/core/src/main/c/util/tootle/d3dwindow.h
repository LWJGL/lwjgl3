/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef D3DWINDOW_H
#define D3DWINDOW_H

#include "d3dwm.h"
#include "gdiwindow.h"
#include "error.h"

class D3DWindow: public GDIWindow
{
public:
    typedef GDIWindow Superclass;
    D3DWindow(void) { d3d = NULL; }
    virtual ~D3DWindow(void) { ; }
    virtual void Destroy(void)
    {
        Superclass::Destroy();

        if (d3d != NULL)
        {
            unsigned int nRef = d3d->Release();

            if (nRef != 0)
            {
                debugf(("D3D RESOURCE LEAK FOUND"));
            }

            d3d = NULL;
        }
    }
    virtual void SetD3DDevice(LPDIRECT3DDEVICE9 d3d) { this->d3d = d3d; }
    virtual LPDIRECT3DDEVICE9 GetD3DDevice(void) const { return d3d; }
    virtual int LostDevice(void) { return 1; }
    virtual int ResetDevice(void) { return 1; }
    virtual int Reset(void) { return D3DWMResetWindow(this); }
protected:
    LPDIRECT3DDEVICE9 d3d;
};

#endif // D3DWINDOW_H
