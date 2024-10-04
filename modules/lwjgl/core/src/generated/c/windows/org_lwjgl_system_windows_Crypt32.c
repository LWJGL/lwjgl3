/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

typedef jint (APIENTRY *CryptProtectDataPROC) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t);
typedef jint (APIENTRY *CryptProtectMemoryPROC) (uintptr_t, jint, jint);
typedef jint (APIENTRY *CryptUnprotectDataPROC) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t);
typedef jint (APIENTRY *CryptUnprotectMemoryPROC) (uintptr_t, jint, jint);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_Crypt32_nCryptProtectData(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong pDataInAddress, jlong szDataDescrAddress, jlong pOptionalEntropyAddress, jlong pvReservedAddress, jlong pPromptStructAddress, jint dwFlags, jlong pDataOutAddress, jlong __functionAddress) {
    CryptProtectDataPROC CryptProtectData = (CryptProtectDataPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t pDataIn = (uintptr_t)pDataInAddress;
    uintptr_t szDataDescr = (uintptr_t)szDataDescrAddress;
    uintptr_t pOptionalEntropy = (uintptr_t)pOptionalEntropyAddress;
    uintptr_t pvReserved = (uintptr_t)pvReservedAddress;
    uintptr_t pPromptStruct = (uintptr_t)pPromptStructAddress;
    uintptr_t pDataOut = (uintptr_t)pDataOutAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = CryptProtectData(pDataIn, szDataDescr, pOptionalEntropy, pvReserved, pPromptStruct, dwFlags, pDataOut);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_Crypt32_nCryptProtectMemory(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong pDataInAddress, jint cbDataIn, jint dwFlags, jlong __functionAddress) {
    CryptProtectMemoryPROC CryptProtectMemory = (CryptProtectMemoryPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t pDataIn = (uintptr_t)pDataInAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = CryptProtectMemory(pDataIn, cbDataIn, dwFlags);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_Crypt32_nCryptUnprotectData(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong pDataInAddress, jlong ppszDataDescrAddress, jlong pOptionalEntropyAddress, jlong pvReservedAddress, jlong pPromptStructAddress, jint dwFlags, jlong pDataOutAddress, jlong __functionAddress) {
    CryptUnprotectDataPROC CryptUnprotectData = (CryptUnprotectDataPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t pDataIn = (uintptr_t)pDataInAddress;
    uintptr_t ppszDataDescr = (uintptr_t)ppszDataDescrAddress;
    uintptr_t pOptionalEntropy = (uintptr_t)pOptionalEntropyAddress;
    uintptr_t pvReserved = (uintptr_t)pvReservedAddress;
    uintptr_t pPromptStruct = (uintptr_t)pPromptStructAddress;
    uintptr_t pDataOut = (uintptr_t)pDataOutAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = CryptUnprotectData(pDataIn, ppszDataDescr, pOptionalEntropy, pvReserved, pPromptStruct, dwFlags, pDataOut);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_Crypt32_nCryptUnprotectMemory(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong pDataInAddress, jint cbDataIn, jint dwFlags, jlong __functionAddress) {
    CryptUnprotectMemoryPROC CryptUnprotectMemory = (CryptUnprotectMemoryPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t pDataIn = (uintptr_t)pDataInAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = CryptUnprotectMemory(pDataIn, cbDataIn, dwFlags);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

EXTERN_C_EXIT
