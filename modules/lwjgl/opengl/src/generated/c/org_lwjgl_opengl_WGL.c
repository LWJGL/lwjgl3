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
typedef uintptr_t (APIENTRY *wglGetCurrentDCPROC) (void);
typedef uintptr_t (APIENTRY *wglGetProcAddressPROC) (uintptr_t);
typedef jint (APIENTRY *wglMakeCurrentPROC) (uintptr_t, uintptr_t);
typedef jint (APIENTRY *wglShareListsPROC) (uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGL_nwglCreateContext(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong __functionAddress) {
    wglCreateContextPROC wglCreateContext = (wglCreateContextPROC)(uintptr_t)__functionAddress;
    uintptr_t hdc = (uintptr_t)hdcAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)wglCreateContext(hdc);
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGL_nwglCreateLayerContext(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint layerPlane, jlong __functionAddress) {
    wglCreateLayerContextPROC wglCreateLayerContext = (wglCreateLayerContextPROC)(uintptr_t)__functionAddress;
    uintptr_t hdc = (uintptr_t)hdcAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)wglCreateLayerContext(hdc, layerPlane);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGL_nwglCopyContext(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint mask, jlong __functionAddress) {
    wglCopyContextPROC wglCopyContext = (wglCopyContextPROC)(uintptr_t)__functionAddress;
    uintptr_t src = (uintptr_t)srcAddress;
    uintptr_t dst = (uintptr_t)dstAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)wglCopyContext(src, dst, mask);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGL_nwglDeleteContext(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong __functionAddress) {
    wglDeleteContextPROC wglDeleteContext = (wglDeleteContextPROC)(uintptr_t)__functionAddress;
    uintptr_t context = (uintptr_t)contextAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)wglDeleteContext(context);
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGL_nwglGetCurrentContext(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    wglGetCurrentContextPROC wglGetCurrentContext = (wglGetCurrentContextPROC)(uintptr_t)__functionAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)wglGetCurrentContext();
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGL_nwglGetCurrentDC(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    wglGetCurrentDCPROC wglGetCurrentDC = (wglGetCurrentDCPROC)(uintptr_t)__functionAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)wglGetCurrentDC();
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGL_nwglGetProcAddress(JNIEnv *__env, jclass clazz, jlong procAddress, jlong __functionAddress) {
    wglGetProcAddressPROC wglGetProcAddress = (wglGetProcAddressPROC)(uintptr_t)__functionAddress;
    uintptr_t proc = (uintptr_t)procAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)wglGetProcAddress(proc);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGL_nwglMakeCurrent(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong hglrcAddress, jlong __functionAddress) {
    wglMakeCurrentPROC wglMakeCurrent = (wglMakeCurrentPROC)(uintptr_t)__functionAddress;
    uintptr_t hdc = (uintptr_t)hdcAddress;
    uintptr_t hglrc = (uintptr_t)hglrcAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)wglMakeCurrent(hdc, hglrc);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGL_nwglShareLists(JNIEnv *__env, jclass clazz, jlong hglrc1Address, jlong hglrc2Address, jlong __functionAddress) {
    wglShareListsPROC wglShareLists = (wglShareListsPROC)(uintptr_t)__functionAddress;
    uintptr_t hglrc1 = (uintptr_t)hglrc1Address;
    uintptr_t hglrc2 = (uintptr_t)hglrc2Address;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)wglShareLists(hglrc1, hglrc2);
    saveLastError();
    return __result;
}

EXTERN_C_EXIT
