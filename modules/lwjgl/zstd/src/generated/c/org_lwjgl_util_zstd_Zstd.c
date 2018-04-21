/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "zstd.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1versionNumber(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)ZSTD_versionNumber();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1versionString(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_versionString();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1compress(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jint compressionLevel) {
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compress(dst, (size_t)dstCapacity, src, (size_t)srcSize, compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1decompress(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong compressedSize) {
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decompress(dst, (size_t)dstCapacity, src, (size_t)compressedSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1getFrameContentSize(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong srcSize) {
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_getFrameContentSize(src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1compressBound(JNIEnv *__env, jclass clazz, jlong srcSize) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compressBound((size_t)srcSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1isError(JNIEnv *__env, jclass clazz, jlong code) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)ZSTD_isError((size_t)code);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1getErrorName(JNIEnv *__env, jclass clazz, jlong code) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_getErrorName((size_t)code);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1maxCLevel(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)ZSTD_maxCLevel();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1createCCtx(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createCCtx();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1freeCCtx(JNIEnv *__env, jclass clazz, jlong cctxAddress) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_freeCCtx(cctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1compressCCtx(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jint compressionLevel) {
    ZSTD_CCtx *ctx = (ZSTD_CCtx *)(intptr_t)ctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compressCCtx(ctx, dst, (size_t)dstCapacity, src, (size_t)srcSize, compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1createDCtx(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createDCtx();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1freeDCtx(JNIEnv *__env, jclass clazz, jlong dctxAddress) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_freeDCtx(dctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1decompressDCtx(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize) {
    ZSTD_DCtx *ctx = (ZSTD_DCtx *)(intptr_t)ctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decompressDCtx(ctx, dst, (size_t)dstCapacity, src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1compress_1usingDict(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong dictAddress, jlong dictSize, jint compressionLevel) {
    ZSTD_CCtx *ctx = (ZSTD_CCtx *)(intptr_t)ctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compress_usingDict(ctx, dst, (size_t)dstCapacity, src, (size_t)srcSize, dict, (size_t)dictSize, compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1decompress_1usingDict(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong dictAddress, jlong dictSize) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decompress_usingDict(dctx, dst, (size_t)dstCapacity, src, (size_t)srcSize, dict, (size_t)dictSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1createCDict(JNIEnv *__env, jclass clazz, jlong dictBufferAddress, jlong dictSize, jint compressionLevel) {
    void const *dictBuffer = (void const *)(intptr_t)dictBufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createCDict(dictBuffer, (size_t)dictSize, compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1freeCDict(JNIEnv *__env, jclass clazz, jlong CDictAddress) {
    ZSTD_CDict *CDict = (ZSTD_CDict *)(intptr_t)CDictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_freeCDict(CDict);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1compress_1usingCDict(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong cdictAddress) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    ZSTD_CDict const *cdict = (ZSTD_CDict const *)(intptr_t)cdictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compress_usingCDict(cctx, dst, (size_t)dstCapacity, src, (size_t)srcSize, cdict);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1createDDict(JNIEnv *__env, jclass clazz, jlong dictBufferAddress, jlong dictSize) {
    void const *dictBuffer = (void const *)(intptr_t)dictBufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createDDict(dictBuffer, (size_t)dictSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1freeDDict(JNIEnv *__env, jclass clazz, jlong ddictAddress) {
    ZSTD_DDict *ddict = (ZSTD_DDict *)(intptr_t)ddictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_freeDDict(ddict);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1decompress_1usingDDict(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong ddictAddress) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    ZSTD_DDict const *ddict = (ZSTD_DDict const *)(intptr_t)ddictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decompress_usingDDict(dctx, dst, (size_t)dstCapacity, src, (size_t)srcSize, ddict);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1createCStream(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createCStream();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1freeCStream(JNIEnv *__env, jclass clazz, jlong zcsAddress) {
    ZSTD_CStream *zcs = (ZSTD_CStream *)(intptr_t)zcsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_freeCStream(zcs);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1initCStream(JNIEnv *__env, jclass clazz, jlong zcsAddress, jint compressionLevel) {
    ZSTD_CStream *zcs = (ZSTD_CStream *)(intptr_t)zcsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_initCStream(zcs, compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1compressStream(JNIEnv *__env, jclass clazz, jlong zcsAddress, jlong outputAddress, jlong inputAddress) {
    ZSTD_CStream *zcs = (ZSTD_CStream *)(intptr_t)zcsAddress;
    ZSTD_outBuffer *output = (ZSTD_outBuffer *)(intptr_t)outputAddress;
    ZSTD_inBuffer *input = (ZSTD_inBuffer *)(intptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compressStream(zcs, output, input);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1flushStream(JNIEnv *__env, jclass clazz, jlong zcsAddress, jlong outputAddress) {
    ZSTD_CStream *zcs = (ZSTD_CStream *)(intptr_t)zcsAddress;
    ZSTD_outBuffer *output = (ZSTD_outBuffer *)(intptr_t)outputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_flushStream(zcs, output);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1endStream(JNIEnv *__env, jclass clazz, jlong zcsAddress, jlong outputAddress) {
    ZSTD_CStream *zcs = (ZSTD_CStream *)(intptr_t)zcsAddress;
    ZSTD_outBuffer *output = (ZSTD_outBuffer *)(intptr_t)outputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_endStream(zcs, output);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1CStreamInSize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CStreamInSize();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1CStreamOutSize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CStreamOutSize();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1createDStream(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createDStream();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1freeDStream(JNIEnv *__env, jclass clazz, jlong zdsAddress) {
    ZSTD_DStream *zds = (ZSTD_DStream *)(intptr_t)zdsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_freeDStream(zds);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1initDStream(JNIEnv *__env, jclass clazz, jlong zdsAddress) {
    ZSTD_DStream *zds = (ZSTD_DStream *)(intptr_t)zdsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_initDStream(zds);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1decompressStream(JNIEnv *__env, jclass clazz, jlong zdsAddress, jlong outputAddress, jlong inputAddress) {
    ZSTD_DStream *zds = (ZSTD_DStream *)(intptr_t)zdsAddress;
    ZSTD_outBuffer *output = (ZSTD_outBuffer *)(intptr_t)outputAddress;
    ZSTD_inBuffer *input = (ZSTD_inBuffer *)(intptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decompressStream(zds, output, input);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1DStreamInSize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_DStreamInSize();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1DStreamOutSize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_DStreamOutSize();
}

EXTERN_C_EXIT
