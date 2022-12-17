/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "lwjgl_malloc.h"
#include "include/nfd.h"

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1FreePath(JNIEnv *__env, jclass clazz, jlong filePathAddress) {
    nfdchar_t *filePath = (nfdchar_t *)(uintptr_t)filePathAddress;
    UNUSED_PARAMS(__env, clazz)
    NFD_FreePath(filePath);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_NFD_1Init(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)NFD_Init();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_NFD_1Quit(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    NFD_Quit();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1OpenDialog(JNIEnv *__env, jclass clazz, jlong outPathAddress, jlong filterListAddress, jint filterCount, jlong defaultPathAddress) {
    nfdchar_t **outPath = (nfdchar_t **)(uintptr_t)outPathAddress;
    nfdfilteritem_t const *filterList = (nfdfilteritem_t const *)(uintptr_t)filterListAddress;
    nfdchar_t const *defaultPath = (nfdchar_t const *)(uintptr_t)defaultPathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)NFD_OpenDialog(outPath, filterList, (nfdfiltersize_t)filterCount, defaultPath);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1OpenDialogMultiple(JNIEnv *__env, jclass clazz, jlong outPathAddress, jlong filterListAddress, jint filterCount, jlong defaultPathAddress) {
    nfdpathset_t const **outPath = (nfdpathset_t const **)(uintptr_t)outPathAddress;
    nfdfilteritem_t const *filterList = (nfdfilteritem_t const *)(uintptr_t)filterListAddress;
    nfdchar_t const *defaultPath = (nfdchar_t const *)(uintptr_t)defaultPathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)NFD_OpenDialogMultiple(outPath, filterList, (nfdfiltersize_t)filterCount, defaultPath);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1SaveDialog(JNIEnv *__env, jclass clazz, jlong outPathAddress, jlong filterListAddress, jint filterCount, jlong defaultPathAddress, jlong defaultNameAddress) {
    nfdchar_t **outPath = (nfdchar_t **)(uintptr_t)outPathAddress;
    nfdfilteritem_t const *filterList = (nfdfilteritem_t const *)(uintptr_t)filterListAddress;
    nfdchar_t const *defaultPath = (nfdchar_t const *)(uintptr_t)defaultPathAddress;
    nfdchar_t const *defaultName = (nfdchar_t const *)(uintptr_t)defaultNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)NFD_SaveDialog(outPath, filterList, (nfdfiltersize_t)filterCount, defaultPath, defaultName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PickFolder(JNIEnv *__env, jclass clazz, jlong outPathAddress, jlong defaultPathAddress) {
    nfdchar_t **outPath = (nfdchar_t **)(uintptr_t)outPathAddress;
    nfdchar_t const *defaultPath = (nfdchar_t const *)(uintptr_t)defaultPathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)NFD_PickFolder(outPath, defaultPath);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1GetError(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)NFD_GetError();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_NFD_1ClearError(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    NFD_ClearError();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1GetCount__JJ(JNIEnv *__env, jclass clazz, jlong pathSetAddress, jlong countAddress) {
    nfdpathset_t const *pathSet = (nfdpathset_t const *)(uintptr_t)pathSetAddress;
    nfdpathsetsize_t *count = (nfdpathsetsize_t *)(uintptr_t)countAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)NFD_PathSet_GetCount(pathSet, count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1GetPath(JNIEnv *__env, jclass clazz, jlong pathSetAddress, jint index, jlong outPathAddress) {
    nfdpathset_t const *pathSet = (nfdpathset_t const *)(uintptr_t)pathSetAddress;
    nfdchar_t **outPath = (nfdchar_t **)(uintptr_t)outPathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)NFD_PathSet_GetPath(pathSet, (nfdpathsetsize_t)index, outPath);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1FreePath(JNIEnv *__env, jclass clazz, jlong filePathAddress) {
    nfdchar_t *filePath = (nfdchar_t *)(uintptr_t)filePathAddress;
    UNUSED_PARAMS(__env, clazz)
    NFD_PathSet_FreePath(filePath);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1GetEnum(JNIEnv *__env, jclass clazz, jlong pathSetAddress, jlong outEnumeratorAddress) {
    nfdpathset_t const *pathSet = (nfdpathset_t const *)(uintptr_t)pathSetAddress;
    nfdpathsetenum_t *outEnumerator = (nfdpathsetenum_t *)(uintptr_t)outEnumeratorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)NFD_PathSet_GetEnum(pathSet, outEnumerator);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1FreeEnum(JNIEnv *__env, jclass clazz, jlong enumeratorAddress) {
    nfdpathsetenum_t *enumerator = (nfdpathsetenum_t *)(uintptr_t)enumeratorAddress;
    UNUSED_PARAMS(__env, clazz)
    NFD_PathSet_FreeEnum(enumerator);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1EnumNext(JNIEnv *__env, jclass clazz, jlong enumeratorAddress, jlong outPathAddress) {
    nfdpathsetenum_t *enumerator = (nfdpathsetenum_t *)(uintptr_t)enumeratorAddress;
    nfdchar_t **outPath = (nfdchar_t **)(uintptr_t)outPathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)NFD_PathSet_EnumNext(enumerator, outPath);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1Free(JNIEnv *__env, jclass clazz, jlong pathSetAddress) {
    nfdpathset_t const *pathSet = (nfdpathset_t const *)(uintptr_t)pathSetAddress;
    UNUSED_PARAMS(__env, clazz)
    NFD_PathSet_Free(pathSet);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1GetCount__J_3I(JNIEnv *__env, jclass clazz, jlong pathSetAddress, jintArray countAddress) {
    nfdpathset_t const *pathSet = (nfdpathset_t const *)(uintptr_t)pathSetAddress;
    jint __result;
    jint *count = (*__env)->GetIntArrayElements(__env, countAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)NFD_PathSet_GetCount(pathSet, (nfdpathsetsize_t *)count);
    (*__env)->ReleaseIntArrayElements(__env, countAddress, count, 0);
    return __result;
}

EXTERN_C_EXIT
