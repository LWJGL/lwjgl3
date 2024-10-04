/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

typedef uintptr_t (APIENTRY *wglCreateContextPROC) (uintptr_t);
typedef uintptr_t (APIENTRY *wglCreateLayerContextPROC) (uintptr_t, jint);
typedef jint (APIENTRY *wglCopyContextPROC) (uintptr_t, uintptr_t, jint);
typedef jint (APIENTRY *wglDeleteContextPROC) (uintptr_t);
typedef uintptr_t (APIENTRY *wglGetCurrentContextPROC) (void);
typedef uintptr_t (APIENTRY *wglGetProcAddressPROC) (uintptr_t);
typedef jint (APIENTRY *wglMakeCurrentPROC) (uintptr_t, uintptr_t);
typedef jint (APIENTRY *wglShareListsPROC) (uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGL_nwglCreateContext(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hdcAddress, jlong __functionAddress) {
    wglCreateContextPROC wglCreateContext = (wglCreateContextPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hdc = (uintptr_t)hdcAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)wglCreateContext(hdc);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGL_nwglCreateLayerContext(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hdcAddress, jint layerPlane, jlong __functionAddress) {
    wglCreateLayerContextPROC wglCreateLayerContext = (wglCreateLayerContextPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hdc = (uintptr_t)hdcAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)wglCreateLayerContext(hdc, layerPlane);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGL_nwglCopyContext(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong srcAddress, jlong dstAddress, jint mask, jlong __functionAddress) {
    wglCopyContextPROC wglCopyContext = (wglCopyContextPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t src = (uintptr_t)srcAddress;
    uintptr_t dst = (uintptr_t)dstAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = wglCopyContext(src, dst, mask);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGL_nwglDeleteContext(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong contextAddress, jlong __functionAddress) {
    wglDeleteContextPROC wglDeleteContext = (wglDeleteContextPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t context = (uintptr_t)contextAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = wglDeleteContext(context);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGL_nwglGetCurrentContext(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong __functionAddress) {
    wglGetCurrentContextPROC wglGetCurrentContext = (wglGetCurrentContextPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)wglGetCurrentContext();
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGL_nwglGetProcAddress(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong procAddress, jlong __functionAddress) {
    wglGetProcAddressPROC wglGetProcAddress = (wglGetProcAddressPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t proc = (uintptr_t)procAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)wglGetProcAddress(proc);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGL_nwglMakeCurrent(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hdcAddress, jlong hglrcAddress, jlong __functionAddress) {
    wglMakeCurrentPROC wglMakeCurrent = (wglMakeCurrentPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hdc = (uintptr_t)hdcAddress;
    uintptr_t hglrc = (uintptr_t)hglrcAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = wglMakeCurrent(hdc, hglrc);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGL_nwglShareLists(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hglrc1Address, jlong hglrc2Address, jlong __functionAddress) {
    wglShareListsPROC wglShareLists = (wglShareListsPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hglrc1 = (uintptr_t)hglrc1Address;
    uintptr_t hglrc2 = (uintptr_t)hglrc2Address;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = wglShareLists(hglrc1, hglrc2);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

EXTERN_C_EXIT
