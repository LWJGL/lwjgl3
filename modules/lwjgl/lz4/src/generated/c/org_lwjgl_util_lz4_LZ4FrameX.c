/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "lz4frame_static.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4FrameX_LZ4F_1getErrorCode(JNIEnv *__env, jclass clazz, jlong functionResult) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4F_getErrorCode((size_t)functionResult);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4FrameX_nLZ4F_1createCDict(JNIEnv *__env, jclass clazz, jlong dictBufferAddress, jlong dictSize) {
    void const *dictBuffer = (void const *)(intptr_t)dictBufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)LZ4F_createCDict(dictBuffer, (size_t)dictSize);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4FrameX_nLZ4F_1freeCDict(JNIEnv *__env, jclass clazz, jlong CDictAddress) {
    LZ4F_CDict *CDict = (LZ4F_CDict *)(intptr_t)CDictAddress;
    UNUSED_PARAMS(__env, clazz)
    LZ4F_freeCDict(CDict);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4FrameX_nLZ4F_1compressFrame_1usingCDict(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong cdictAddress, jlong preferencesPtrAddress) {
    LZ4F_cctx *cctx = (LZ4F_cctx *)(intptr_t)cctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    LZ4F_CDict const *cdict = (LZ4F_CDict const *)(intptr_t)cdictAddress;
    LZ4F_preferences_t const *preferencesPtr = (LZ4F_preferences_t const *)(intptr_t)preferencesPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_compressFrame_usingCDict(cctx, dst, (size_t)dstCapacity, src, (size_t)srcSize, cdict, preferencesPtr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4FrameX_nLZ4F_1compressBegin_1usingCDict(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstBufferAddress, jlong dstCapacity, jlong cdictAddress, jlong prefsPtrAddress) {
    LZ4F_cctx *cctx = (LZ4F_cctx *)(intptr_t)cctxAddress;
    void *dstBuffer = (void *)(intptr_t)dstBufferAddress;
    LZ4F_CDict const *cdict = (LZ4F_CDict const *)(intptr_t)cdictAddress;
    LZ4F_preferences_t const *prefsPtr = (LZ4F_preferences_t const *)(intptr_t)prefsPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_compressBegin_usingCDict(cctx, dstBuffer, (size_t)dstCapacity, cdict, prefsPtr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4FrameX_nLZ4F_1decompress_1usingDict(JNIEnv *__env, jclass clazz, jlong dctxPtrAddress, jlong dstBufferAddress, jlong dstSizePtrAddress, jlong srcBufferAddress, jlong srcSizePtrAddress, jlong dictAddress, jlong dictSize, jlong decompressOptionsPtrAddress) {
    LZ4F_dctx *dctxPtr = (LZ4F_dctx *)(intptr_t)dctxPtrAddress;
    void *dstBuffer = (void *)(intptr_t)dstBufferAddress;
    size_t *dstSizePtr = (size_t *)(intptr_t)dstSizePtrAddress;
    void const *srcBuffer = (void const *)(intptr_t)srcBufferAddress;
    size_t *srcSizePtr = (size_t *)(intptr_t)srcSizePtrAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    LZ4F_decompressOptions_t const *decompressOptionsPtr = (LZ4F_decompressOptions_t const *)(intptr_t)decompressOptionsPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_decompress_usingDict(dctxPtr, dstBuffer, dstSizePtr, srcBuffer, srcSizePtr, dict, (size_t)dictSize, decompressOptionsPtr);
}

EXTERN_C_EXIT
