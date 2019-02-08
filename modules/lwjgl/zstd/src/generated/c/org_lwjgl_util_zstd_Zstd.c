/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#define ZSTD_STATIC_LINKING_ONLY
#include "zstd.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1versionNumber(void) {
    return (jint)ZSTD_versionNumber();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1versionNumber(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1versionNumber();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1versionString(void) {
    return (jlong)(intptr_t)ZSTD_versionString();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1versionString(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1versionString();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1compress(jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jint compressionLevel) {
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    return (jlong)ZSTD_compress(dst, (size_t)dstCapacity, src, (size_t)srcSize, compressionLevel);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1compress(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1compress(dstAddress, dstCapacity, srcAddress, srcSize, compressionLevel);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1decompress(jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong compressedSize) {
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    return (jlong)ZSTD_decompress(dst, (size_t)dstCapacity, src, (size_t)compressedSize);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1decompress(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong compressedSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1decompress(dstAddress, dstCapacity, srcAddress, compressedSize);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1getFrameContentSize(jlong srcAddress, jlong srcSize) {
    void const *src = (void const *)(intptr_t)srcAddress;
    return (jlong)ZSTD_getFrameContentSize(src, (size_t)srcSize);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1getFrameContentSize(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong srcSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1getFrameContentSize(srcAddress, srcSize);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1compressBound(jlong srcSize) {
    return (jlong)ZSTD_compressBound((size_t)srcSize);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1compressBound(JNIEnv *__env, jclass clazz, jlong srcSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1compressBound(srcSize);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1isError(jlong code) {
    return (jint)ZSTD_isError((size_t)code);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1isError(JNIEnv *__env, jclass clazz, jlong code) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1isError(code);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1getErrorName(jlong code) {
    return (jlong)(intptr_t)ZSTD_getErrorName((size_t)code);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1getErrorName(JNIEnv *__env, jclass clazz, jlong code) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1getErrorName(code);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1maxCLevel(void) {
    return (jint)ZSTD_maxCLevel();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1maxCLevel(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1maxCLevel();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1createCCtx(void) {
    return (jlong)(intptr_t)ZSTD_createCCtx();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1createCCtx(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1createCCtx();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1freeCCtx(jlong cctxAddress) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    return (jlong)ZSTD_freeCCtx(cctx);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1freeCCtx(JNIEnv *__env, jclass clazz, jlong cctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1freeCCtx(cctxAddress);
}

JNIEXPORT_CRITICAL jlong JNICALL CRITICAL(org_lwjgl_util_zstd_Zstd_nZSTD_1compressCCtx)(jlong ctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jint compressionLevel) {
    ZSTD_CCtx *ctx = (ZSTD_CCtx *)(intptr_t)ctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    return (jlong)ZSTD_compressCCtx(ctx, dst, (size_t)dstCapacity, src, (size_t)srcSize, compressionLevel);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1compressCCtx(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_zstd_Zstd_nZSTD_1compressCCtx)(ctxAddress, dstAddress, dstCapacity, srcAddress, srcSize, compressionLevel);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1createDCtx(void) {
    return (jlong)(intptr_t)ZSTD_createDCtx();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1createDCtx(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1createDCtx();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1freeDCtx(jlong dctxAddress) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    return (jlong)ZSTD_freeDCtx(dctx);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1freeDCtx(JNIEnv *__env, jclass clazz, jlong dctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1freeDCtx(dctxAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1decompressDCtx(jlong ctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize) {
    ZSTD_DCtx *ctx = (ZSTD_DCtx *)(intptr_t)ctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    return (jlong)ZSTD_decompressDCtx(ctx, dst, (size_t)dstCapacity, src, (size_t)srcSize);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1decompressDCtx(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1decompressDCtx(ctxAddress, dstAddress, dstCapacity, srcAddress, srcSize);
}

JNIEXPORT_CRITICAL jlong JNICALL CRITICAL(org_lwjgl_util_zstd_Zstd_nZSTD_1compress_1usingDict)(jlong ctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong dictAddress, jlong dictSize, jint compressionLevel) {
    ZSTD_CCtx *ctx = (ZSTD_CCtx *)(intptr_t)ctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    return (jlong)ZSTD_compress_usingDict(ctx, dst, (size_t)dstCapacity, src, (size_t)srcSize, dict, (size_t)dictSize, compressionLevel);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1compress_1usingDict(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong dictAddress, jlong dictSize, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_zstd_Zstd_nZSTD_1compress_1usingDict)(ctxAddress, dstAddress, dstCapacity, srcAddress, srcSize, dictAddress, dictSize, compressionLevel);
}

JNIEXPORT_CRITICAL jlong JNICALL CRITICAL(org_lwjgl_util_zstd_Zstd_nZSTD_1decompress_1usingDict)(jlong dctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong dictAddress, jlong dictSize) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    return (jlong)ZSTD_decompress_usingDict(dctx, dst, (size_t)dstCapacity, src, (size_t)srcSize, dict, (size_t)dictSize);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1decompress_1usingDict(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong dictAddress, jlong dictSize) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_zstd_Zstd_nZSTD_1decompress_1usingDict)(dctxAddress, dstAddress, dstCapacity, srcAddress, srcSize, dictAddress, dictSize);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1createCDict(jlong dictBufferAddress, jlong dictSize, jint compressionLevel) {
    void const *dictBuffer = (void const *)(intptr_t)dictBufferAddress;
    return (jlong)(intptr_t)ZSTD_createCDict(dictBuffer, (size_t)dictSize, compressionLevel);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1createCDict(JNIEnv *__env, jclass clazz, jlong dictBufferAddress, jlong dictSize, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1createCDict(dictBufferAddress, dictSize, compressionLevel);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1freeCDict(jlong CDictAddress) {
    ZSTD_CDict *CDict = (ZSTD_CDict *)(intptr_t)CDictAddress;
    return (jlong)ZSTD_freeCDict(CDict);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1freeCDict(JNIEnv *__env, jclass clazz, jlong CDictAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1freeCDict(CDictAddress);
}

JNIEXPORT_CRITICAL jlong JNICALL CRITICAL(org_lwjgl_util_zstd_Zstd_nZSTD_1compress_1usingCDict)(jlong cctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong cdictAddress) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    ZSTD_CDict const *cdict = (ZSTD_CDict const *)(intptr_t)cdictAddress;
    return (jlong)ZSTD_compress_usingCDict(cctx, dst, (size_t)dstCapacity, src, (size_t)srcSize, cdict);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1compress_1usingCDict(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong cdictAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_zstd_Zstd_nZSTD_1compress_1usingCDict)(cctxAddress, dstAddress, dstCapacity, srcAddress, srcSize, cdictAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1createDDict(jlong dictBufferAddress, jlong dictSize) {
    void const *dictBuffer = (void const *)(intptr_t)dictBufferAddress;
    return (jlong)(intptr_t)ZSTD_createDDict(dictBuffer, (size_t)dictSize);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1createDDict(JNIEnv *__env, jclass clazz, jlong dictBufferAddress, jlong dictSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1createDDict(dictBufferAddress, dictSize);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1freeDDict(jlong ddictAddress) {
    ZSTD_DDict *ddict = (ZSTD_DDict *)(intptr_t)ddictAddress;
    return (jlong)ZSTD_freeDDict(ddict);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1freeDDict(JNIEnv *__env, jclass clazz, jlong ddictAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1freeDDict(ddictAddress);
}

JNIEXPORT_CRITICAL jlong JNICALL CRITICAL(org_lwjgl_util_zstd_Zstd_nZSTD_1decompress_1usingDDict)(jlong dctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong ddictAddress) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    ZSTD_DDict const *ddict = (ZSTD_DDict const *)(intptr_t)ddictAddress;
    return (jlong)ZSTD_decompress_usingDDict(dctx, dst, (size_t)dstCapacity, src, (size_t)srcSize, ddict);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1decompress_1usingDDict(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong ddictAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_zstd_Zstd_nZSTD_1decompress_1usingDDict)(dctxAddress, dstAddress, dstCapacity, srcAddress, srcSize, ddictAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1createCStream(void) {
    return (jlong)(intptr_t)ZSTD_createCStream();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1createCStream(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1createCStream();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1freeCStream(jlong zcsAddress) {
    ZSTD_CStream *zcs = (ZSTD_CStream *)(intptr_t)zcsAddress;
    return (jlong)ZSTD_freeCStream(zcs);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1freeCStream(JNIEnv *__env, jclass clazz, jlong zcsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1freeCStream(zcsAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1initCStream(jlong zcsAddress, jint compressionLevel) {
    ZSTD_CStream *zcs = (ZSTD_CStream *)(intptr_t)zcsAddress;
    return (jlong)ZSTD_initCStream(zcs, compressionLevel);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1initCStream(JNIEnv *__env, jclass clazz, jlong zcsAddress, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1initCStream(zcsAddress, compressionLevel);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1compressStream(jlong zcsAddress, jlong outputAddress, jlong inputAddress) {
    ZSTD_CStream *zcs = (ZSTD_CStream *)(intptr_t)zcsAddress;
    ZSTD_outBuffer *output = (ZSTD_outBuffer *)(intptr_t)outputAddress;
    ZSTD_inBuffer *input = (ZSTD_inBuffer *)(intptr_t)inputAddress;
    return (jlong)ZSTD_compressStream(zcs, output, input);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1compressStream(JNIEnv *__env, jclass clazz, jlong zcsAddress, jlong outputAddress, jlong inputAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1compressStream(zcsAddress, outputAddress, inputAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1flushStream(jlong zcsAddress, jlong outputAddress) {
    ZSTD_CStream *zcs = (ZSTD_CStream *)(intptr_t)zcsAddress;
    ZSTD_outBuffer *output = (ZSTD_outBuffer *)(intptr_t)outputAddress;
    return (jlong)ZSTD_flushStream(zcs, output);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1flushStream(JNIEnv *__env, jclass clazz, jlong zcsAddress, jlong outputAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1flushStream(zcsAddress, outputAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1endStream(jlong zcsAddress, jlong outputAddress) {
    ZSTD_CStream *zcs = (ZSTD_CStream *)(intptr_t)zcsAddress;
    ZSTD_outBuffer *output = (ZSTD_outBuffer *)(intptr_t)outputAddress;
    return (jlong)ZSTD_endStream(zcs, output);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1endStream(JNIEnv *__env, jclass clazz, jlong zcsAddress, jlong outputAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1endStream(zcsAddress, outputAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1CStreamInSize(void) {
    return (jlong)ZSTD_CStreamInSize();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1CStreamInSize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1CStreamInSize();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1CStreamOutSize(void) {
    return (jlong)ZSTD_CStreamOutSize();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1CStreamOutSize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1CStreamOutSize();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1createDStream(void) {
    return (jlong)(intptr_t)ZSTD_createDStream();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1createDStream(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1createDStream();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1freeDStream(jlong zdsAddress) {
    ZSTD_DStream *zds = (ZSTD_DStream *)(intptr_t)zdsAddress;
    return (jlong)ZSTD_freeDStream(zds);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1freeDStream(JNIEnv *__env, jclass clazz, jlong zdsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1freeDStream(zdsAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1initDStream(jlong zdsAddress) {
    ZSTD_DStream *zds = (ZSTD_DStream *)(intptr_t)zdsAddress;
    return (jlong)ZSTD_initDStream(zds);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1initDStream(JNIEnv *__env, jclass clazz, jlong zdsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1initDStream(zdsAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1decompressStream(jlong zdsAddress, jlong outputAddress, jlong inputAddress) {
    ZSTD_DStream *zds = (ZSTD_DStream *)(intptr_t)zdsAddress;
    ZSTD_outBuffer *output = (ZSTD_outBuffer *)(intptr_t)outputAddress;
    ZSTD_inBuffer *input = (ZSTD_inBuffer *)(intptr_t)inputAddress;
    return (jlong)ZSTD_decompressStream(zds, output, input);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1decompressStream(JNIEnv *__env, jclass clazz, jlong zdsAddress, jlong outputAddress, jlong inputAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_nZSTD_1decompressStream(zdsAddress, outputAddress, inputAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1DStreamInSize(void) {
    return (jlong)ZSTD_DStreamInSize();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1DStreamInSize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1DStreamInSize();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1DStreamOutSize(void) {
    return (jlong)ZSTD_DStreamOutSize();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1DStreamOutSize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_zstd_Zstd_ZSTD_1DStreamOutSize();
}

EXTERN_C_EXIT
