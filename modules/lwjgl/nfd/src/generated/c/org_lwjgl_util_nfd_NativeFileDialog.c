/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "lwjgl_malloc.h"
#include "nfd_common.h"
#include "nfd.h"

EXTERN_C_ENTER

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1OpenDialog(jlong filterListAddress, jlong defaultPathAddress, jlong outPathAddress) {
    nfdchar_t const *filterList = (nfdchar_t const *)(intptr_t)filterListAddress;
    nfdchar_t const *defaultPath = (nfdchar_t const *)(intptr_t)defaultPathAddress;
    nfdchar_t **outPath = (nfdchar_t **)(intptr_t)outPathAddress;
    return (jint)NFD_OpenDialog(filterList, defaultPath, outPath);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1OpenDialog(JNIEnv *__env, jclass clazz, jlong filterListAddress, jlong defaultPathAddress, jlong outPathAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1OpenDialog(filterListAddress, defaultPathAddress, outPathAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1OpenDialogMultiple(jlong filterListAddress, jlong defaultPathAddress, jlong outPathsAddress) {
    nfdchar_t const *filterList = (nfdchar_t const *)(intptr_t)filterListAddress;
    nfdchar_t const *defaultPath = (nfdchar_t const *)(intptr_t)defaultPathAddress;
    nfdpathset_t *outPaths = (nfdpathset_t *)(intptr_t)outPathsAddress;
    return (jint)NFD_OpenDialogMultiple(filterList, defaultPath, outPaths);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1OpenDialogMultiple(JNIEnv *__env, jclass clazz, jlong filterListAddress, jlong defaultPathAddress, jlong outPathsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1OpenDialogMultiple(filterListAddress, defaultPathAddress, outPathsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1SaveDialog(jlong filterListAddress, jlong defaultPathAddress, jlong outPathAddress) {
    nfdchar_t const *filterList = (nfdchar_t const *)(intptr_t)filterListAddress;
    nfdchar_t const *defaultPath = (nfdchar_t const *)(intptr_t)defaultPathAddress;
    nfdchar_t **outPath = (nfdchar_t **)(intptr_t)outPathAddress;
    return (jint)NFD_SaveDialog(filterList, defaultPath, outPath);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1SaveDialog(JNIEnv *__env, jclass clazz, jlong filterListAddress, jlong defaultPathAddress, jlong outPathAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1SaveDialog(filterListAddress, defaultPathAddress, outPathAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PickFolder(jlong defaultPathAddress, jlong outPathAddress) {
    nfdchar_t const *defaultPath = (nfdchar_t const *)(intptr_t)defaultPathAddress;
    nfdchar_t **outPath = (nfdchar_t **)(intptr_t)outPathAddress;
    return (jint)NFD_PickFolder(defaultPath, outPath);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PickFolder(JNIEnv *__env, jclass clazz, jlong defaultPathAddress, jlong outPathAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PickFolder(defaultPathAddress, outPathAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1GetError(void) {
    return (jlong)(intptr_t)NFD_GetError();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1GetError(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1GetError();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1GetCount(jlong pathSetAddress) {
    nfdpathset_t const *pathSet = (nfdpathset_t const *)(intptr_t)pathSetAddress;
    return (jlong)NFD_PathSet_GetCount(pathSet);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1GetCount(JNIEnv *__env, jclass clazz, jlong pathSetAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1GetCount(pathSetAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1GetPath(jlong pathSetAddress, jlong index) {
    nfdpathset_t const *pathSet = (nfdpathset_t const *)(intptr_t)pathSetAddress;
    return (jlong)(intptr_t)NFD_PathSet_GetPath(pathSet, (size_t)index);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1GetPath(JNIEnv *__env, jclass clazz, jlong pathSetAddress, jlong index) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1GetPath(pathSetAddress, index);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1Free(jlong pathSetAddress) {
    nfdpathset_t *pathSet = (nfdpathset_t *)(intptr_t)pathSetAddress;
    NFD_PathSet_Free(pathSet);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1Free(JNIEnv *__env, jclass clazz, jlong pathSetAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1PathSet_1Free(pathSetAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1Free(jlong outPathAddress) {
    void *outPath = (void *)(intptr_t)outPathAddress;
    NFDi_Free(outPath);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1Free(JNIEnv *__env, jclass clazz, jlong outPathAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_nfd_NativeFileDialog_nNFD_1Free(outPathAddress);
}

EXTERN_C_EXIT
