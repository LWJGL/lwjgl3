/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "dynload.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlLoadLibrary(jlong libpathAddress) {
    char const *libpath = (char const *)(intptr_t)libpathAddress;
    return (jlong)(intptr_t)dlLoadLibrary(libpath);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlLoadLibrary(JNIEnv *__env, jclass clazz, jlong libpathAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlLoadLibrary(libpathAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlFreeLibrary(jlong pLibAddress) {
    DLLib *pLib = (DLLib *)(intptr_t)pLibAddress;
    dlFreeLibrary(pLib);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlFreeLibrary(JNIEnv *__env, jclass clazz, jlong pLibAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlFreeLibrary(pLibAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlFindSymbol(jlong pLibAddress, jlong pSymbolNameAddress) {
    DLLib *pLib = (DLLib *)(intptr_t)pLibAddress;
    char const *pSymbolName = (char const *)(intptr_t)pSymbolNameAddress;
    return (jlong)(intptr_t)dlFindSymbol(pLib, pSymbolName);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlFindSymbol(JNIEnv *__env, jclass clazz, jlong pLibAddress, jlong pSymbolNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlFindSymbol(pLibAddress, pSymbolNameAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlGetLibraryPath(jlong pLibAddress, jlong sOutAddress, jint bufSize) {
    DLLib *pLib = (DLLib *)(intptr_t)pLibAddress;
    char *sOut = (char *)(intptr_t)sOutAddress;
    return (jint)dlGetLibraryPath(pLib, sOut, bufSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlGetLibraryPath(JNIEnv *__env, jclass clazz, jlong pLibAddress, jlong sOutAddress, jint bufSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlGetLibraryPath(pLibAddress, sOutAddress, bufSize);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlSymsInit(jlong libPathAddress) {
    char const *libPath = (char const *)(intptr_t)libPathAddress;
    return (jlong)(intptr_t)dlSymsInit(libPath);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlSymsInit(JNIEnv *__env, jclass clazz, jlong libPathAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlSymsInit(libPathAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlSymsCleanup(jlong pSymsAddress) {
    DLSyms *pSyms = (DLSyms *)(intptr_t)pSymsAddress;
    dlSymsCleanup(pSyms);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlSymsCleanup(JNIEnv *__env, jclass clazz, jlong pSymsAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlSymsCleanup(pSymsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlSymsCount(jlong pSymsAddress) {
    DLSyms *pSyms = (DLSyms *)(intptr_t)pSymsAddress;
    return (jint)dlSymsCount(pSyms);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlSymsCount(JNIEnv *__env, jclass clazz, jlong pSymsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlSymsCount(pSymsAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlSymsName(jlong pSymsAddress, jint index) {
    DLSyms *pSyms = (DLSyms *)(intptr_t)pSymsAddress;
    return (jlong)(intptr_t)dlSymsName(pSyms, index);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlSymsName(JNIEnv *__env, jclass clazz, jlong pSymsAddress, jint index) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlSymsName(pSymsAddress, index);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlSymsNameFromValue(jlong pSymsAddress, jlong valueAddress) {
    DLSyms *pSyms = (DLSyms *)(intptr_t)pSymsAddress;
    void *value = (void *)(intptr_t)valueAddress;
    return (jlong)(intptr_t)dlSymsNameFromValue(pSyms, value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynLoad_ndlSymsNameFromValue(JNIEnv *__env, jclass clazz, jlong pSymsAddress, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynLoad_ndlSymsNameFromValue(pSymsAddress, valueAddress);
}

EXTERN_C_EXIT
