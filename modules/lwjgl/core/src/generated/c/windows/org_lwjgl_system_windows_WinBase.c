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
    EnvData *envData = (EnvData *)(*__env)->reserved2;
    return envData == NULL ? 0 : envData->LastError;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nGetModuleHandle(JNIEnv *__env, jclass clazz, jlong moduleNameAddress) {
    LPCTSTR moduleName = (LPCTSTR)(uintptr_t)moduleNameAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(uintptr_t)GetModuleHandle(moduleName);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_nGetModuleFileName(JNIEnv *__env, jclass clazz, jlong hModuleAddress, jlong lpFilenameAddress, jint nSize) {
    HMODULE hModule = (HMODULE)(uintptr_t)hModuleAddress;
    LPTSTR lpFilename = (LPTSTR)(uintptr_t)lpFilenameAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)GetModuleFileName(hModule, lpFilename, (DWORD)nSize);
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nLoadLibrary(JNIEnv *__env, jclass clazz, jlong nameAddress) {
    LPCTSTR name = (LPCTSTR)(uintptr_t)nameAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(uintptr_t)LoadLibrary(name);
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nGetProcAddress(JNIEnv *__env, jclass clazz, jlong handleAddress, jlong nameAddress) {
    HMODULE handle = (HMODULE)(uintptr_t)handleAddress;
    LPCSTR name = (LPCSTR)(uintptr_t)nameAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(uintptr_t)GetProcAddress(handle, name);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_nFreeLibrary(JNIEnv *__env, jclass clazz, jlong handleAddress) {
    HMODULE handle = (HMODULE)(uintptr_t)handleAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)FreeLibrary(handle);
    saveLastError();
    return __result;
}

EXTERN_C_EXIT
