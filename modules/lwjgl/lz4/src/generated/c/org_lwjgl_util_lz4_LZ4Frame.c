/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#define LZ4F_STATIC_LINKING_ONLY
#include "lz4frame.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1isError(JNIEnv *__env, jclass clazz, jlong code) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4F_isError((LZ4F_errorCode_t)code);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1getErrorName(JNIEnv *__env, jclass clazz, jlong code) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)LZ4F_getErrorName((LZ4F_errorCode_t)code);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_LZ4F_1compressionLevel_1max(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4F_compressionLevel_max();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1compressFrameBound(JNIEnv *__env, jclass clazz, jlong srcSize, jlong preferencesPtrAddress) {
    LZ4F_preferences_t const *preferencesPtr = (LZ4F_preferences_t const *)(intptr_t)preferencesPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_compressFrameBound((size_t)srcSize, preferencesPtr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1compressFrame(JNIEnv *__env, jclass clazz, jlong dstBufferAddress, jlong dstCapacity, jlong srcBufferAddress, jlong srcSize, jlong preferencesPtrAddress) {
    void *dstBuffer = (void *)(intptr_t)dstBufferAddress;
    void const *srcBuffer = (void const *)(intptr_t)srcBufferAddress;
    LZ4F_preferences_t const *preferencesPtr = (LZ4F_preferences_t const *)(intptr_t)preferencesPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_compressFrame(dstBuffer, (size_t)dstCapacity, srcBuffer, (size_t)srcSize, preferencesPtr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_LZ4F_1getVersion(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4F_getVersion();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1createCompressionContext(JNIEnv *__env, jclass clazz, jlong cctxPtrAddress, jint version) {
    LZ4F_cctx **cctxPtr = (LZ4F_cctx **)(intptr_t)cctxPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_createCompressionContext(cctxPtr, (unsigned)version);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1freeCompressionContext(JNIEnv *__env, jclass clazz, jlong cctxAddress) {
    LZ4F_cctx *cctx = (LZ4F_cctx *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_freeCompressionContext(cctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1compressBegin(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstBufferAddress, jlong dstCapacity, jlong prefsPtrAddress) {
    LZ4F_cctx *cctx = (LZ4F_cctx *)(intptr_t)cctxAddress;
    void *dstBuffer = (void *)(intptr_t)dstBufferAddress;
    LZ4F_preferences_t const *prefsPtr = (LZ4F_preferences_t const *)(intptr_t)prefsPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_compressBegin(cctx, dstBuffer, (size_t)dstCapacity, prefsPtr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1compressBound(JNIEnv *__env, jclass clazz, jlong srcSize, jlong prefsPtrAddress) {
    LZ4F_preferences_t const *prefsPtr = (LZ4F_preferences_t const *)(intptr_t)prefsPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_compressBound((size_t)srcSize, prefsPtr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1compressUpdate(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstBufferAddress, jlong dstCapacity, jlong srcBufferAddress, jlong srcSize, jlong cOptPtrAddress) {
    LZ4F_cctx *cctx = (LZ4F_cctx *)(intptr_t)cctxAddress;
    void *dstBuffer = (void *)(intptr_t)dstBufferAddress;
    void const *srcBuffer = (void const *)(intptr_t)srcBufferAddress;
    LZ4F_compressOptions_t const *cOptPtr = (LZ4F_compressOptions_t const *)(intptr_t)cOptPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_compressUpdate(cctx, dstBuffer, (size_t)dstCapacity, srcBuffer, (size_t)srcSize, cOptPtr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1flush(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstBufferAddress, jlong dstCapacity, jlong cOptPtrAddress) {
    LZ4F_cctx *cctx = (LZ4F_cctx *)(intptr_t)cctxAddress;
    void *dstBuffer = (void *)(intptr_t)dstBufferAddress;
    LZ4F_compressOptions_t const *cOptPtr = (LZ4F_compressOptions_t const *)(intptr_t)cOptPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_flush(cctx, dstBuffer, (size_t)dstCapacity, cOptPtr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1compressEnd(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstBufferAddress, jlong dstCapacity, jlong cOptPtrAddress) {
    LZ4F_cctx *cctx = (LZ4F_cctx *)(intptr_t)cctxAddress;
    void *dstBuffer = (void *)(intptr_t)dstBufferAddress;
    LZ4F_compressOptions_t const *cOptPtr = (LZ4F_compressOptions_t const *)(intptr_t)cOptPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_compressEnd(cctx, dstBuffer, (size_t)dstCapacity, cOptPtr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1createDecompressionContext(JNIEnv *__env, jclass clazz, jlong dctxPtrAddress, jint version) {
    LZ4F_dctx **dctxPtr = (LZ4F_dctx **)(intptr_t)dctxPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_createDecompressionContext(dctxPtr, (unsigned)version);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1freeDecompressionContext(JNIEnv *__env, jclass clazz, jlong dctxAddress) {
    LZ4F_dctx *dctx = (LZ4F_dctx *)(intptr_t)dctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_freeDecompressionContext(dctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1getFrameInfo(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong frameInfoPtrAddress, jlong srcBufferAddress, jlong srcSizePtrAddress) {
    LZ4F_dctx *dctx = (LZ4F_dctx *)(intptr_t)dctxAddress;
    LZ4F_frameInfo_t *frameInfoPtr = (LZ4F_frameInfo_t *)(intptr_t)frameInfoPtrAddress;
    void const *srcBuffer = (void const *)(intptr_t)srcBufferAddress;
    size_t *srcSizePtr = (size_t *)(intptr_t)srcSizePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_getFrameInfo(dctx, frameInfoPtr, srcBuffer, srcSizePtr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1decompress(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong dstBufferAddress, jlong dstSizePtrAddress, jlong srcBufferAddress, jlong srcSizePtrAddress, jlong dOptPtrAddress) {
    LZ4F_dctx *dctx = (LZ4F_dctx *)(intptr_t)dctxAddress;
    void *dstBuffer = (void *)(intptr_t)dstBufferAddress;
    size_t *dstSizePtr = (size_t *)(intptr_t)dstSizePtrAddress;
    void const *srcBuffer = (void const *)(intptr_t)srcBufferAddress;
    size_t *srcSizePtr = (size_t *)(intptr_t)srcSizePtrAddress;
    LZ4F_decompressOptions_t const *dOptPtr = (LZ4F_decompressOptions_t const *)(intptr_t)dOptPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_decompress(dctx, dstBuffer, dstSizePtr, srcBuffer, srcSizePtr, dOptPtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1resetDecompressionContext(JNIEnv *__env, jclass clazz, jlong dctxAddress) {
    LZ4F_dctx *dctx = (LZ4F_dctx *)(intptr_t)dctxAddress;
    UNUSED_PARAMS(__env, clazz)
    LZ4F_resetDecompressionContext(dctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_LZ4F_1getErrorCode(JNIEnv *__env, jclass clazz, jlong functionResult) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4F_getErrorCode((size_t)functionResult);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1createCDict(JNIEnv *__env, jclass clazz, jlong dictBufferAddress, jlong dictSize) {
    void const *dictBuffer = (void const *)(intptr_t)dictBufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)LZ4F_createCDict(dictBuffer, (size_t)dictSize);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1freeCDict(JNIEnv *__env, jclass clazz, jlong CDictAddress) {
    LZ4F_CDict *CDict = (LZ4F_CDict *)(intptr_t)CDictAddress;
    UNUSED_PARAMS(__env, clazz)
    LZ4F_freeCDict(CDict);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1compressFrame_1usingCDict(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong cdictAddress, jlong preferencesPtrAddress) {
    LZ4F_cctx *cctx = (LZ4F_cctx *)(intptr_t)cctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    LZ4F_CDict const *cdict = (LZ4F_CDict const *)(intptr_t)cdictAddress;
    LZ4F_preferences_t const *preferencesPtr = (LZ4F_preferences_t const *)(intptr_t)preferencesPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_compressFrame_usingCDict(cctx, dst, (size_t)dstCapacity, src, (size_t)srcSize, cdict, preferencesPtr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1compressBegin_1usingCDict(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstBufferAddress, jlong dstCapacity, jlong cdictAddress, jlong prefsPtrAddress) {
    LZ4F_cctx *cctx = (LZ4F_cctx *)(intptr_t)cctxAddress;
    void *dstBuffer = (void *)(intptr_t)dstBufferAddress;
    LZ4F_CDict const *cdict = (LZ4F_CDict const *)(intptr_t)cdictAddress;
    LZ4F_preferences_t const *prefsPtr = (LZ4F_preferences_t const *)(intptr_t)prefsPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)LZ4F_compressBegin_usingCDict(cctx, dstBuffer, (size_t)dstCapacity, cdict, prefsPtr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4Frame_nLZ4F_1decompress_1usingDict(JNIEnv *__env, jclass clazz, jlong dctxPtrAddress, jlong dstBufferAddress, jlong dstSizePtrAddress, jlong srcBufferAddress, jlong srcSizePtrAddress, jlong dictAddress, jlong dictSize, jlong decompressOptionsPtrAddress) {
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
