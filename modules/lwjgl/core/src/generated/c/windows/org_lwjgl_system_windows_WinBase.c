/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_GetLastError(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)GetLastError();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_getLastError(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)getLastError();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nGetModuleHandle(JNIEnv *__env, jclass clazz, jlong moduleNameAddress) {
    LPCTSTR moduleName = (LPCTSTR)(intptr_t)moduleNameAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)GetModuleHandle(moduleName);
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nLoadLibrary(JNIEnv *__env, jclass clazz, jlong nameAddress) {
    LPCTSTR name = (LPCTSTR)(intptr_t)nameAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)LoadLibrary(name);
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nGetProcAddress(JNIEnv *__env, jclass clazz, jlong handleAddress, jlong nameAddress) {
    HMODULE handle = (HMODULE)(intptr_t)handleAddress;
    LPCSTR name = (LPCSTR)(intptr_t)nameAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)GetProcAddress(handle, name);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_nFreeLibrary(JNIEnv *__env, jclass clazz, jlong handleAddress) {
    HMODULE handle = (HMODULE)(intptr_t)handleAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)FreeLibrary(handle);
    saveLastError();
    return __result;
}

EXTERN_C_EXIT
