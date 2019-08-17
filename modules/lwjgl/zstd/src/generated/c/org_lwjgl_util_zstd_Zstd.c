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

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1findFrameCompressedSize(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong srcSize) {
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_findFrameCompressedSize(src, (size_t)srcSize);
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

JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_Zstd_ZSTD_1minCLevel(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)ZSTD_minCLevel();
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

JNIEXPORT void JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1cParam_1getBounds(JNIEnv *__env, jclass clazz, jint cParam, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((ZSTD_bounds*)(intptr_t)__result) = ZSTD_cParam_getBounds((ZSTD_cParameter)cParam);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1CCtx_1setParameter(JNIEnv *__env, jclass clazz, jlong cctxAddress, jint param, jint value) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_setParameter(cctx, (ZSTD_cParameter)param, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1CCtx_1setPledgedSrcSize(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong pledgedSrcSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_setPledgedSrcSize(cctx, (unsigned long long)pledgedSrcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1CCtx_1reset(JNIEnv *__env, jclass clazz, jlong cctxAddress, jint reset) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_reset(cctx, (ZSTD_ResetDirective)reset);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1compress2(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compress2(cctx, dst, (size_t)dstCapacity, src, (size_t)srcSize);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1dParam_1getBounds(JNIEnv *__env, jclass clazz, jint dParam, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((ZSTD_bounds*)(intptr_t)__result) = ZSTD_dParam_getBounds((ZSTD_dParameter)dParam);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1DCtx_1setParameter(JNIEnv *__env, jclass clazz, jlong dctxAddress, jint param, jint value) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_DCtx_setParameter(dctx, (ZSTD_dParameter)param, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1DCtx_1reset(JNIEnv *__env, jclass clazz, jlong dctxAddress, jint reset) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_DCtx_reset(dctx, (ZSTD_ResetDirective)reset);
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

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1compressStream2(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong outputAddress, jlong inputAddress, jint endOp) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    ZSTD_outBuffer *output = (ZSTD_outBuffer *)(intptr_t)outputAddress;
    ZSTD_inBuffer *input = (ZSTD_inBuffer *)(intptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compressStream2(cctx, output, input, (ZSTD_EndDirective)endOp);
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

JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1getDictID_1fromDict(JNIEnv *__env, jclass clazz, jlong dictAddress, jlong dictSize) {
    void const *dict = (void const *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ZSTD_getDictID_fromDict(dict, (size_t)dictSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1getDictID_1fromDDict(JNIEnv *__env, jclass clazz, jlong ddictAddress) {
    ZSTD_DDict const *ddict = (ZSTD_DDict const *)(intptr_t)ddictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ZSTD_getDictID_fromDDict(ddict);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1getDictID_1fromFrame(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong srcSize) {
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ZSTD_getDictID_fromFrame(src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1CCtx_1loadDictionary(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dictAddress, jlong dictSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_loadDictionary(cctx, dict, (size_t)dictSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1CCtx_1refCDict(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong cdictAddress) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    ZSTD_CDict const *cdict = (ZSTD_CDict const *)(intptr_t)cdictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_refCDict(cctx, cdict);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1CCtx_1refPrefix(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong prefixAddress, jlong prefixSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void const *prefix = (void const *)(intptr_t)prefixAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_refPrefix(cctx, prefix, (size_t)prefixSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1DCtx_1loadDictionary(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong dictAddress, jlong dictSize) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_DCtx_loadDictionary(dctx, dict, (size_t)dictSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1DCtx_1refDDict(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong ddictAddress) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    ZSTD_DDict const *ddict = (ZSTD_DDict const *)(intptr_t)ddictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_DCtx_refDDict(dctx, ddict);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1DCtx_1refPrefix(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong prefixAddress, jlong prefixSize) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void const *prefix = (void const *)(intptr_t)prefixAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_DCtx_refPrefix(dctx, prefix, (size_t)prefixSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1sizeof_1CCtx(JNIEnv *__env, jclass clazz, jlong cctxAddress) {
    ZSTD_CCtx const *cctx = (ZSTD_CCtx const *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_sizeof_CCtx(cctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1sizeof_1DCtx(JNIEnv *__env, jclass clazz, jlong dctxAddress) {
    ZSTD_DCtx const *dctx = (ZSTD_DCtx const *)(intptr_t)dctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_sizeof_DCtx(dctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1sizeof_1CStream(JNIEnv *__env, jclass clazz, jlong zcsAddress) {
    ZSTD_CStream const *zcs = (ZSTD_CStream const *)(intptr_t)zcsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_sizeof_CStream(zcs);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1sizeof_1DStream(JNIEnv *__env, jclass clazz, jlong zdsAddress) {
    ZSTD_DStream const *zds = (ZSTD_DStream const *)(intptr_t)zdsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_sizeof_DStream(zds);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1sizeof_1CDict(JNIEnv *__env, jclass clazz, jlong cdictAddress) {
    ZSTD_CDict const *cdict = (ZSTD_CDict const *)(intptr_t)cdictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_sizeof_CDict(cdict);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zstd_nZSTD_1sizeof_1DDict(JNIEnv *__env, jclass clazz, jlong ddictAddress) {
    ZSTD_DDict const *ddict = (ZSTD_DDict const *)(intptr_t)ddictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_sizeof_DDict(ddict);
}

EXTERN_C_EXIT
