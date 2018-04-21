/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "dynload.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlLoadLibrary(JNIEnv *__env, jclass clazz, jlong libpathAddress) {
    char const *libpath = (char const *)(intptr_t)libpathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dlLoadLibrary(libpath);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlFreeLibrary(JNIEnv *__env, jclass clazz, jlong pLibAddress) {
    DLLib *pLib = (DLLib *)(intptr_t)pLibAddress;
    UNUSED_PARAMS(__env, clazz)
    dlFreeLibrary(pLib);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlFindSymbol(JNIEnv *__env, jclass clazz, jlong pLibAddress, jlong pSymbolNameAddress) {
    DLLib *pLib = (DLLib *)(intptr_t)pLibAddress;
    char const *pSymbolName = (char const *)(intptr_t)pSymbolNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dlFindSymbol(pLib, pSymbolName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlGetLibraryPath(JNIEnv *__env, jclass clazz, jlong pLibAddress, jlong sOutAddress, jint bufSize) {
    DLLib *pLib = (DLLib *)(intptr_t)pLibAddress;
    char *sOut = (char *)(intptr_t)sOutAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)dlGetLibraryPath(pLib, sOut, bufSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlSymsInit(JNIEnv *__env, jclass clazz, jlong libPathAddress) {
    char const *libPath = (char const *)(intptr_t)libPathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dlSymsInit(libPath);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlSymsCleanup(JNIEnv *__env, jclass clazz, jlong pSymsAddress) {
    DLSyms *pSyms = (DLSyms *)(intptr_t)pSymsAddress;
    UNUSED_PARAMS(__env, clazz)
    dlSymsCleanup(pSyms);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlSymsCount(JNIEnv *__env, jclass clazz, jlong pSymsAddress) {
    DLSyms *pSyms = (DLSyms *)(intptr_t)pSymsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)dlSymsCount(pSyms);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlSymsName(JNIEnv *__env, jclass clazz, jlong pSymsAddress, jint index) {
    DLSyms *pSyms = (DLSyms *)(intptr_t)pSymsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dlSymsName(pSyms, index);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlSymsNameFromValue(JNIEnv *__env, jclass clazz, jlong pSymsAddress, jlong valueAddress) {
    DLSyms *pSyms = (DLSyms *)(intptr_t)pSymsAddress;
    void *value = (void *)(intptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dlSymsNameFromValue(pSyms, value);
}

EXTERN_C_EXIT
