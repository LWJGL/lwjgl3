/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

typedef intptr_t (APIENTRY *wglCreateContextPROC) (intptr_t);
typedef intptr_t (APIENTRY *wglCreateLayerContextPROC) (intptr_t, jint);
typedef jint (APIENTRY *wglCopyContextPROC) (intptr_t, intptr_t, jint);
typedef jint (APIENTRY *wglDeleteContextPROC) (intptr_t);
typedef intptr_t (APIENTRY *wglGetCurrentContextPROC) (void);
typedef intptr_t (APIENTRY *wglGetCurrentDCPROC) (void);
typedef intptr_t (APIENTRY *wglGetProcAddressPROC) (intptr_t);
typedef jint (APIENTRY *wglMakeCurrentPROC) (intptr_t, intptr_t);
typedef jint (APIENTRY *wglShareListsPROC) (intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGL_nwglCreateContext(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong __functionAddress) {
    wglCreateContextPROC wglCreateContext = (wglCreateContextPROC)(intptr_t)__functionAddress;
    intptr_t hdc = (intptr_t)hdcAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)wglCreateContext(hdc);
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGL_nwglCreateLayerContext(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint layerPlane, jlong __functionAddress) {
    wglCreateLayerContextPROC wglCreateLayerContext = (wglCreateLayerContextPROC)(intptr_t)__functionAddress;
    intptr_t hdc = (intptr_t)hdcAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)wglCreateLayerContext(hdc, layerPlane);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGL_nwglCopyContext(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint mask, jlong __functionAddress) {
    wglCopyContextPROC wglCopyContext = (wglCopyContextPROC)(intptr_t)__functionAddress;
    intptr_t src = (intptr_t)srcAddress;
    intptr_t dst = (intptr_t)dstAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)wglCopyContext(src, dst, mask);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGL_nwglDeleteContext(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong __functionAddress) {
    wglDeleteContextPROC wglDeleteContext = (wglDeleteContextPROC)(intptr_t)__functionAddress;
    intptr_t context = (intptr_t)contextAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)wglDeleteContext(context);
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGL_nwglGetCurrentContext(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    wglGetCurrentContextPROC wglGetCurrentContext = (wglGetCurrentContextPROC)(intptr_t)__functionAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)wglGetCurrentContext();
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGL_nwglGetCurrentDC(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    wglGetCurrentDCPROC wglGetCurrentDC = (wglGetCurrentDCPROC)(intptr_t)__functionAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)wglGetCurrentDC();
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGL_nwglGetProcAddress(JNIEnv *__env, jclass clazz, jlong procAddress, jlong __functionAddress) {
    wglGetProcAddressPROC wglGetProcAddress = (wglGetProcAddressPROC)(intptr_t)__functionAddress;
    intptr_t proc = (intptr_t)procAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)wglGetProcAddress(proc);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGL_nwglMakeCurrent(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong hglrcAddress, jlong __functionAddress) {
    wglMakeCurrentPROC wglMakeCurrent = (wglMakeCurrentPROC)(intptr_t)__functionAddress;
    intptr_t hdc = (intptr_t)hdcAddress;
    intptr_t hglrc = (intptr_t)hglrcAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)wglMakeCurrent(hdc, hglrc);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGL_nwglShareLists(JNIEnv *__env, jclass clazz, jlong hglrc1Address, jlong hglrc2Address, jlong __functionAddress) {
    wglShareListsPROC wglShareLists = (wglShareListsPROC)(intptr_t)__functionAddress;
    intptr_t hglrc1 = (intptr_t)hglrc1Address;
    intptr_t hglrc2 = (intptr_t)hglrc2Address;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)wglShareLists(hglrc1, hglrc2);
    saveLastError();
    return __result;
}

EXTERN_C_EXIT
