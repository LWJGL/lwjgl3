/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

EXTERN_C_ENTER

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_WinBase_GetLastError(void) {
    return (jint)GetLastError();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_GetLastError(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_WinBase_GetLastError();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_WinBase_getLastError(void) {
    return (jint)getLastError();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_getLastError(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_WinBase_getLastError();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_windows_WinBase_nGetModuleHandle(jlong moduleNameAddress) {
    LPCTSTR moduleName = (LPCTSTR)(intptr_t)moduleNameAddress;
    jlong __result;
    __result = (jlong)(intptr_t)GetModuleHandle(moduleName);
    saveLastError();
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nGetModuleHandle(JNIEnv *__env, jclass clazz, jlong moduleNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_WinBase_nGetModuleHandle(moduleNameAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_windows_WinBase_nLoadLibrary(jlong nameAddress) {
    LPCTSTR name = (LPCTSTR)(intptr_t)nameAddress;
    jlong __result;
    __result = (jlong)(intptr_t)LoadLibrary(name);
    saveLastError();
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nLoadLibrary(JNIEnv *__env, jclass clazz, jlong nameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_WinBase_nLoadLibrary(nameAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_windows_WinBase_nGetProcAddress(jlong handleAddress, jlong nameAddress) {
    HMODULE handle = (HMODULE)(intptr_t)handleAddress;
    LPCSTR name = (LPCSTR)(intptr_t)nameAddress;
    jlong __result;
    __result = (jlong)(intptr_t)GetProcAddress(handle, name);
    saveLastError();
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nGetProcAddress(JNIEnv *__env, jclass clazz, jlong handleAddress, jlong nameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_WinBase_nGetProcAddress(handleAddress, nameAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_WinBase_nFreeLibrary(jlong handleAddress) {
    HMODULE handle = (HMODULE)(intptr_t)handleAddress;
    jint __result;
    __result = (jint)FreeLibrary(handle);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_nFreeLibrary(JNIEnv *__env, jclass clazz, jlong handleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_WinBase_nFreeLibrary(handleAddress);
}

EXTERN_C_EXIT
