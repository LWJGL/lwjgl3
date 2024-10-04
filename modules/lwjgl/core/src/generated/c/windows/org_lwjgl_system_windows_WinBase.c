/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nLocalFree(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hMemAddress) {
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    HLOCAL hMem = (HLOCAL)(uintptr_t)hMemAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(uintptr_t)LocalFree(hMem);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_GetLastError(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)GetLastError();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nGetModuleHandle(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong moduleNameAddress) {
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    LPCTSTR moduleName = (LPCTSTR)(uintptr_t)moduleNameAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(uintptr_t)GetModuleHandle(moduleName);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_nGetModuleFileName(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hModuleAddress, jlong lpFilenameAddress, jint nSize) {
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    HMODULE hModule = (HMODULE)(uintptr_t)hModuleAddress;
    LPTSTR lpFilename = (LPTSTR)(uintptr_t)lpFilenameAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)GetModuleFileName(hModule, lpFilename, (DWORD)nSize);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nLoadLibrary(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong nameAddress) {
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    LPCTSTR name = (LPCTSTR)(uintptr_t)nameAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(uintptr_t)LoadLibrary(name);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WinBase_nGetProcAddress(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong handleAddress, jlong nameAddress) {
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    HMODULE handle = (HMODULE)(uintptr_t)handleAddress;
    LPCSTR name = (LPCSTR)(uintptr_t)nameAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(uintptr_t)GetProcAddress(handle, name);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_WinBase_nFreeLibrary(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong handleAddress) {
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    HMODULE handle = (HMODULE)(uintptr_t)handleAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)FreeLibrary(handle);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

EXTERN_C_EXIT
