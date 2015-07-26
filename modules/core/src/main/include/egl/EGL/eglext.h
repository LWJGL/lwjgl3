#ifndef __eglext_h_
#define __eglext_h_ 1

#ifdef __cplusplus
extern "C" {
#endif

/*
** Copyright (c) 2013-2014 The Khronos Group Inc.
**
** Permission is hereby granted, free of charge, to any person obtaining a
** copy of this software and/or associated documentation files (the
** "Materials"), to deal in the Materials without restriction, including
** without limitation the rights to use, copy, modify, merge, publish,
** distribute, sublicense, and/or sell copies of the Materials, and to
** permit persons to whom the Materials are furnished to do so, subject to
** the following conditions:
**
** The above copyright notice and this permission notice shall be included
** in all copies or substantial portions of the Materials.
**
** THE MATERIALS ARE PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
** EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
** MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
** IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
** CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
** TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
** MATERIALS OR THE USE OR OTHER DEALINGS IN THE MATERIALS.
*/
/*
** This header is generated from the Khronos OpenGL / OpenGL ES XML
** API Registry. The current version of the Registry, generator scripts
** used to make the header, and the header can be found at
**   http://www.opengl.org/registry/
*/

#include <EGL/eglplatform.h>

// EGL_KHR_cl_event2
typedef intptr_t EGLAttribKHR;

// EGL_KHR_fence_sync
typedef void *EGLSyncKHR;
typedef khronos_utime_nanoseconds_t EGLTimeKHR;

// EGL_KHR_image
typedef void *EGLImageKHR;

// EGL_KHR_stream
typedef void *EGLStreamKHR;
typedef khronos_uint64_t EGLuint64KHR;

// EGL_KHR_stream_cross_process_fd
typedef int EGLNativeFileDescriptorKHR;

// EGL_ANDROID_blob_cache
typedef khronos_ssize_t EGLsizeiANDROID;
typedef void (*EGLSetBlobFuncANDROID) (const void *key, EGLsizeiANDROID keySize, const void *value, EGLsizeiANDROID valueSize);
typedef EGLsizeiANDROID (*EGLGetBlobFuncANDROID) (const void *key, EGLsizeiANDROID keySize, void *value, EGLsizeiANDROID valueSize);

// EGL_EXT_device_base
typedef void *EGLDeviceEXT;

// EGL_EXT_output_base
typedef void *EGLOutputLayerEXT;
typedef void *EGLOutputPortEXT;

// EGL_HI_clientpixmap
struct EGLClientPixmapHI {
    void  *pData;
    EGLint iWidth;
    EGLint iHeight;
    EGLint iStride;
};

// EGL_NV_sync
typedef void *EGLSyncNV;
typedef khronos_utime_nanoseconds_t EGLTimeNV;

// EGL_NV_system_time
typedef khronos_utime_nanoseconds_t EGLuint64NV;

#ifdef __cplusplus
}
#endif

#endif
