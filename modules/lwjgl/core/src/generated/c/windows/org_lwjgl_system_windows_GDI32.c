/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

typedef jint (APIENTRY *ChoosePixelFormatPROC) (uintptr_t, uintptr_t);
typedef jint (APIENTRY *DescribePixelFormatPROC) (uintptr_t, jint, jint, uintptr_t);
typedef jint (APIENTRY *GetPixelFormatPROC) (uintptr_t);
typedef jint (APIENTRY *SetPixelFormatPROC) (uintptr_t, jint, uintptr_t);
typedef jint (APIENTRY *SwapBuffersPROC) (uintptr_t);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GDI32_nChoosePixelFormat(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong pixelFormatDescriptorAddress, jlong __functionAddress) {
    ChoosePixelFormatPROC ChoosePixelFormat = (ChoosePixelFormatPROC)(uintptr_t)__functionAddress;
    uintptr_t hdc = (uintptr_t)hdcAddress;
    uintptr_t pixelFormatDescriptor = (uintptr_t)pixelFormatDescriptorAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ChoosePixelFormat(hdc, pixelFormatDescriptor);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GDI32_nDescribePixelFormat(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint pixelFormat, jint bytes, jlong pixelFormatDescriptorAddress, jlong __functionAddress) {
    DescribePixelFormatPROC DescribePixelFormat = (DescribePixelFormatPROC)(uintptr_t)__functionAddress;
    uintptr_t hdc = (uintptr_t)hdcAddress;
    uintptr_t pixelFormatDescriptor = (uintptr_t)pixelFormatDescriptorAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)DescribePixelFormat(hdc, pixelFormat, bytes, pixelFormatDescriptor);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GDI32_nGetPixelFormat(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong __functionAddress) {
    GetPixelFormatPROC GetPixelFormat = (GetPixelFormatPROC)(uintptr_t)__functionAddress;
    uintptr_t hdc = (uintptr_t)hdcAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)GetPixelFormat(hdc);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GDI32_nSetPixelFormat(JNIEnv *__env, jclass clazz, jlong hdcAddress, jint pixelFormat, jlong pixelFormatDescriptorAddress, jlong __functionAddress) {
    SetPixelFormatPROC SetPixelFormat = (SetPixelFormatPROC)(uintptr_t)__functionAddress;
    uintptr_t hdc = (uintptr_t)hdcAddress;
    uintptr_t pixelFormatDescriptor = (uintptr_t)pixelFormatDescriptorAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)SetPixelFormat(hdc, pixelFormat, pixelFormatDescriptor);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_GDI32_nSwapBuffers(JNIEnv *__env, jclass clazz, jlong dcAddress, jlong __functionAddress) {
    SwapBuffersPROC SwapBuffers = (SwapBuffersPROC)(uintptr_t)__functionAddress;
    uintptr_t dc = (uintptr_t)dcAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)SwapBuffers(dc);
    saveLastError();
    return __result;
}

EXTERN_C_EXIT
