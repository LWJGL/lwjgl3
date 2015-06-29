/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */

// WGL definitions

#ifndef __LWJGL_WGL_H__
#define __LWJGL_WGL_H__

// WGL_ARB_pbuffer
DECLARE_HANDLE(HPBUFFERARB);

// WGL_NV_gpu_affinity
DECLARE_HANDLE(HGPUNV);

typedef struct _GPU_DEVICE {
	DWORD   cb;
	CHAR    DeviceName[32];
	CHAR    DeviceString[128];
	DWORD   Flags;
	RECT    rcVirtualScreen;
} GPU_DEVICE, *PGPU_DEVICE;

#endif
