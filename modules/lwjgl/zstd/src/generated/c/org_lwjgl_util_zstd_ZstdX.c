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

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1findDecompressedSize(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong srcSize) {
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_findDecompressedSize(src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1decompressBound(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong srcSize) {
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decompressBound(src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1frameHeaderSize(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong srcSize) {
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_frameHeaderSize(src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_ZSTD_1estimateCCtxSize(JNIEnv *__env, jclass clazz, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateCCtxSize(compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1estimateCCtxSize_1usingCParams(JNIEnv *__env, jclass clazz, jlong cParamsAddress) {
    ZSTD_compressionParameters *cParams = (ZSTD_compressionParameters *)(intptr_t)cParamsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateCCtxSize_usingCParams(*cParams);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1estimateCCtxSize_1usingCCtxParams(JNIEnv *__env, jclass clazz, jlong paramsAddress) {
    ZSTD_CCtx_params const *params = (ZSTD_CCtx_params const *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateCCtxSize_usingCCtxParams(params);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_ZSTD_1estimateDCtxSize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateDCtxSize();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_ZSTD_1estimateCStreamSize(JNIEnv *__env, jclass clazz, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateCStreamSize(compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1estimateCStreamSize_1usingCParams(JNIEnv *__env, jclass clazz, jlong cParamsAddress) {
    ZSTD_compressionParameters *cParams = (ZSTD_compressionParameters *)(intptr_t)cParamsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateCStreamSize_usingCParams(*cParams);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1estimateCStreamSize_1usingCCtxParams(JNIEnv *__env, jclass clazz, jlong paramsAddress) {
    ZSTD_CCtx_params const *params = (ZSTD_CCtx_params const *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateCStreamSize_usingCCtxParams(params);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_ZSTD_1estimateDStreamSize(JNIEnv *__env, jclass clazz, jlong windowSize) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateDStreamSize((size_t)windowSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1estimateDStreamSize_1fromFrame(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong srcSize) {
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateDStreamSize_fromFrame(src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_ZSTD_1estimateCDictSize(JNIEnv *__env, jclass clazz, jlong dictSize, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateCDictSize((size_t)dictSize, compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1estimateCDictSize_1advanced(JNIEnv *__env, jclass clazz, jlong dictSize, jlong cParamsAddress, jint dictLoadMethod) {
    ZSTD_compressionParameters *cParams = (ZSTD_compressionParameters *)(intptr_t)cParamsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateCDictSize_advanced((size_t)dictSize, *cParams, (ZSTD_dictLoadMethod_e)dictLoadMethod);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_ZSTD_1estimateDDictSize(JNIEnv *__env, jclass clazz, jlong dictSize, jint dictLoadMethod) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateDDictSize((size_t)dictSize, (ZSTD_dictLoadMethod_e)dictLoadMethod);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1initStaticCCtx(JNIEnv *__env, jclass clazz, jlong workspaceAddress, jlong workspaceSize) {
    void *workspace = (void *)(intptr_t)workspaceAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_initStaticCCtx(workspace, (size_t)workspaceSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1initStaticCStream(JNIEnv *__env, jclass clazz, jlong workspaceAddress, jlong workspaceSize) {
    void *workspace = (void *)(intptr_t)workspaceAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_initStaticCStream(workspace, (size_t)workspaceSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1initStaticDCtx(JNIEnv *__env, jclass clazz, jlong workspaceAddress, jlong workspaceSize) {
    void *workspace = (void *)(intptr_t)workspaceAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_initStaticDCtx(workspace, (size_t)workspaceSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1initStaticDStream(JNIEnv *__env, jclass clazz, jlong workspaceAddress, jlong workspaceSize) {
    void *workspace = (void *)(intptr_t)workspaceAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_initStaticDStream(workspace, (size_t)workspaceSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1initStaticCDict(JNIEnv *__env, jclass clazz, jlong workspaceAddress, jlong workspaceSize, jlong dictAddress, jlong dictSize, jint dictLoadMethod, jint dictContentType, jlong cParamsAddress) {
    void *workspace = (void *)(intptr_t)workspaceAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    ZSTD_compressionParameters *cParams = (ZSTD_compressionParameters *)(intptr_t)cParamsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_initStaticCDict(workspace, (size_t)workspaceSize, dict, (size_t)dictSize, (ZSTD_dictLoadMethod_e)dictLoadMethod, (ZSTD_dictContentType_e)dictContentType, *cParams);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1initStaticDDict(JNIEnv *__env, jclass clazz, jlong workspaceAddress, jlong workspaceSize, jlong dictAddress, jlong dictSize, jint dictLoadMethod, jint dictContentType) {
    void *workspace = (void *)(intptr_t)workspaceAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_initStaticDDict(workspace, (size_t)workspaceSize, dict, (size_t)dictSize, (ZSTD_dictLoadMethod_e)dictLoadMethod, (ZSTD_dictContentType_e)dictContentType);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1createCCtx_1advanced(JNIEnv *__env, jclass clazz, jlong customMemAddress) {
    ZSTD_customMem *customMem = (ZSTD_customMem *)(intptr_t)customMemAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createCCtx_advanced(*customMem);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1createCStream_1advanced(JNIEnv *__env, jclass clazz, jlong customMemAddress) {
    ZSTD_customMem *customMem = (ZSTD_customMem *)(intptr_t)customMemAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createCStream_advanced(*customMem);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1createDCtx_1advanced(JNIEnv *__env, jclass clazz, jlong customMemAddress) {
    ZSTD_customMem *customMem = (ZSTD_customMem *)(intptr_t)customMemAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createDCtx_advanced(*customMem);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1createDStream_1advanced(JNIEnv *__env, jclass clazz, jlong customMemAddress) {
    ZSTD_customMem *customMem = (ZSTD_customMem *)(intptr_t)customMemAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createDStream_advanced(*customMem);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1createCDict_1advanced(JNIEnv *__env, jclass clazz, jlong dictAddress, jlong dictSize, jint dictLoadMethod, jint dictContentType, jlong cParamsAddress, jlong customMemAddress) {
    void const *dict = (void const *)(intptr_t)dictAddress;
    ZSTD_compressionParameters *cParams = (ZSTD_compressionParameters *)(intptr_t)cParamsAddress;
    ZSTD_customMem *customMem = (ZSTD_customMem *)(intptr_t)customMemAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createCDict_advanced(dict, (size_t)dictSize, (ZSTD_dictLoadMethod_e)dictLoadMethod, (ZSTD_dictContentType_e)dictContentType, *cParams, *customMem);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1createDDict_1advanced(JNIEnv *__env, jclass clazz, jlong dictAddress, jlong dictSize, jint dictLoadMethod, jint dictContentType, jlong customMemAddress) {
    void const *dict = (void const *)(intptr_t)dictAddress;
    ZSTD_customMem *customMem = (ZSTD_customMem *)(intptr_t)customMemAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createDDict_advanced(dict, (size_t)dictSize, (ZSTD_dictLoadMethod_e)dictLoadMethod, (ZSTD_dictContentType_e)dictContentType, *customMem);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1createCDict_1byReference(JNIEnv *__env, jclass clazz, jlong dictBufferAddress, jlong dictSize, jint compressionLevel) {
    void const *dictBuffer = (void const *)(intptr_t)dictBufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createCDict_byReference(dictBuffer, (size_t)dictSize, compressionLevel);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1getCParams(JNIEnv *__env, jclass clazz, jint compressionLevel, jlong estimatedSrcSize, jlong dictSize, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((ZSTD_compressionParameters*)(intptr_t)__result) = ZSTD_getCParams(compressionLevel, (unsigned long long)estimatedSrcSize, (size_t)dictSize);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1getParams(JNIEnv *__env, jclass clazz, jint compressionLevel, jlong estimatedSrcSize, jlong dictSize, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((ZSTD_parameters*)(intptr_t)__result) = ZSTD_getParams(compressionLevel, (unsigned long long)estimatedSrcSize, (size_t)dictSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1checkCParams(JNIEnv *__env, jclass clazz, jlong paramsAddress) {
    ZSTD_compressionParameters *params = (ZSTD_compressionParameters *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_checkCParams(*params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1adjustCParams(JNIEnv *__env, jclass clazz, jlong cParAddress, jlong srcSize, jlong dictSize, jlong __result) {
    ZSTD_compressionParameters *cPar = (ZSTD_compressionParameters *)(intptr_t)cParAddress;
    UNUSED_PARAMS(__env, clazz)
    *((ZSTD_compressionParameters*)(intptr_t)__result) = ZSTD_adjustCParams(*cPar, (unsigned long long)srcSize, (size_t)dictSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1compress_1advanced(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong dictAddress, jlong dictSize, jlong paramsAddress) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    ZSTD_parameters *params = (ZSTD_parameters *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compress_advanced(cctx, dst, (size_t)dstCapacity, src, (size_t)srcSize, dict, (size_t)dictSize, *params);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1compress_1usingCDict_1advanced(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize, jlong cdictAddress, jlong fParamsAddress) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    ZSTD_CDict const *cdict = (ZSTD_CDict const *)(intptr_t)cdictAddress;
    ZSTD_frameParameters *fParams = (ZSTD_frameParameters *)(intptr_t)fParamsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compress_usingCDict_advanced(cctx, dst, (size_t)dstCapacity, src, (size_t)srcSize, cdict, *fParams);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtx_1loadDictionary_1byReference(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dictAddress, jlong dictSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_loadDictionary_byReference(cctx, dict, (size_t)dictSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtx_1loadDictionary_1advanced(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dictAddress, jlong dictSize, jint dictLoadMethod, jint dictContentType) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_loadDictionary_advanced(cctx, dict, (size_t)dictSize, (ZSTD_dictLoadMethod_e)dictLoadMethod, (ZSTD_dictContentType_e)dictContentType);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtx_1refPrefix_1advanced(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong prefixAddress, jlong prefixSize, jint dictContentType) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void const *prefix = (void const *)(intptr_t)prefixAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_refPrefix_advanced(cctx, prefix, (size_t)prefixSize, (ZSTD_dictContentType_e)dictContentType);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtx_1getParameter(JNIEnv *__env, jclass clazz, jlong cctxAddress, jint param, jlong valueAddress) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    int *value = (int *)(intptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_getParameter(cctx, (ZSTD_cParameter)param, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_ZSTD_1createCCtxParams(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createCCtxParams();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1freeCCtxParams(JNIEnv *__env, jclass clazz, jlong paramsAddress) {
    ZSTD_CCtx_params *params = (ZSTD_CCtx_params *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_freeCCtxParams(params);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtxParams_1reset(JNIEnv *__env, jclass clazz, jlong paramsAddress) {
    ZSTD_CCtx_params *params = (ZSTD_CCtx_params *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtxParams_reset(params);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtxParams_1init(JNIEnv *__env, jclass clazz, jlong cctxParamsAddress, jint compressionLevel) {
    ZSTD_CCtx_params *cctxParams = (ZSTD_CCtx_params *)(intptr_t)cctxParamsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtxParams_init(cctxParams, compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtxParams_1init_1advanced(JNIEnv *__env, jclass clazz, jlong cctxParamsAddress, jlong paramsAddress) {
    ZSTD_CCtx_params *cctxParams = (ZSTD_CCtx_params *)(intptr_t)cctxParamsAddress;
    ZSTD_parameters *params = (ZSTD_parameters *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtxParams_init_advanced(cctxParams, *params);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtxParams_1setParameter(JNIEnv *__env, jclass clazz, jlong paramsAddress, jint param, jint value) {
    ZSTD_CCtx_params *params = (ZSTD_CCtx_params *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtxParams_setParameter(params, (ZSTD_cParameter)param, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtxParams_1getParameter(JNIEnv *__env, jclass clazz, jlong paramsAddress, jint param, jlong valueAddress) {
    ZSTD_CCtx_params *params = (ZSTD_CCtx_params *)(intptr_t)paramsAddress;
    int *value = (int *)(intptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtxParams_getParameter(params, (ZSTD_cParameter)param, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtx_1setParametersUsingCCtxParams(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong paramsAddress) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    ZSTD_CCtx_params const *params = (ZSTD_CCtx_params const *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_setParametersUsingCCtxParams(cctx, params);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1compressStream2_1simpleArgs(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstAddress, jlong dstCapacity, jlong dstPosAddress, jlong srcAddress, jlong srcSize, jlong srcPosAddress, jint endOp) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    size_t *dstPos = (size_t *)(intptr_t)dstPosAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    size_t *srcPos = (size_t *)(intptr_t)srcPosAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compressStream2_simpleArgs(cctx, dst, (size_t)dstCapacity, dstPos, src, (size_t)srcSize, srcPos, (ZSTD_EndDirective)endOp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1isFrame(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong size) {
    void const *buffer = (void const *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ZSTD_isFrame(buffer, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1createDDict_1byReference(JNIEnv *__env, jclass clazz, jlong dictBufferAddress, jlong dictSize) {
    void const *dictBuffer = (void const *)(intptr_t)dictBufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createDDict_byReference(dictBuffer, (size_t)dictSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1DCtx_1loadDictionary_1byReference(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong dictAddress, jlong dictSize) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_DCtx_loadDictionary_byReference(dctx, dict, (size_t)dictSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1DCtx_1loadDictionary_1advanced(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong dictAddress, jlong dictSize, jint dictLoadMethod, jint dictContentType) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_DCtx_loadDictionary_advanced(dctx, dict, (size_t)dictSize, (ZSTD_dictLoadMethod_e)dictLoadMethod, (ZSTD_dictContentType_e)dictContentType);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1DCtx_1refPrefix_1advanced(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong prefixAddress, jlong prefixSize, jint dictContentType) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void const *prefix = (void const *)(intptr_t)prefixAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_DCtx_refPrefix_advanced(dctx, prefix, (size_t)prefixSize, (ZSTD_dictContentType_e)dictContentType);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1DCtx_1setMaxWindowSize(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong maxWindowSize) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_DCtx_setMaxWindowSize(dctx, (size_t)maxWindowSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1DCtx_1setFormat(JNIEnv *__env, jclass clazz, jlong dctxAddress, jint format) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_DCtx_setFormat(dctx, (ZSTD_format_e)format);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1decompressStream_1simpleArgs(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong dstAddress, jlong dstCapacity, jlong dstPosAddress, jlong srcAddress, jlong srcSize, jlong srcPosAddress) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    size_t *dstPos = (size_t *)(intptr_t)dstPosAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    size_t *srcPos = (size_t *)(intptr_t)srcPosAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decompressStream_simpleArgs(dctx, dst, (size_t)dstCapacity, dstPos, src, (size_t)srcSize, srcPos);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1getFrameProgression(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong __result) {
    ZSTD_CCtx const *cctx = (ZSTD_CCtx const *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((ZSTD_frameProgression*)(intptr_t)__result) = ZSTD_getFrameProgression(cctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1toFlushNow(JNIEnv *__env, jclass clazz, jlong cctxAddress) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_toFlushNow(cctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1compressBegin(JNIEnv *__env, jclass clazz, jlong cctxAddress, jint compressionLevel) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compressBegin(cctx, compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1compressBegin_1usingDict(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dictAddress, jlong dictSize, jint compressionLevel) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compressBegin_usingDict(cctx, dict, (size_t)dictSize, compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1compressBegin_1advanced(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dictAddress, jlong dictSize, jlong paramsAddress, jlong pledgedSrcSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    ZSTD_parameters *params = (ZSTD_parameters *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compressBegin_advanced(cctx, dict, (size_t)dictSize, *params, (unsigned long long)pledgedSrcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1compressBegin_1usingCDict(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong cdictAddress) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    ZSTD_CDict const *cdict = (ZSTD_CDict const *)(intptr_t)cdictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compressBegin_usingCDict(cctx, cdict);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1compressBegin_1usingCDict_1advanced(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong cdictAddress, jlong fParamsAddress, jlong pledgedSrcSize) {
    ZSTD_CCtx * const cctx = (ZSTD_CCtx * const)(intptr_t)cctxAddress;
    ZSTD_CDict const * const cdict = (ZSTD_CDict const * const)(intptr_t)cdictAddress;
    ZSTD_frameParameters const *fParams = (ZSTD_frameParameters const *)(intptr_t)fParamsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compressBegin_usingCDict_advanced(cctx, cdict, *fParams, (unsigned long long const)pledgedSrcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1copyCCtx(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong preparedCCtxAddress, jlong pledgedSrcSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    ZSTD_CCtx const *preparedCCtx = (ZSTD_CCtx const *)(intptr_t)preparedCCtxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_copyCCtx(cctx, preparedCCtx, (unsigned long long)pledgedSrcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1compressContinue(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compressContinue(cctx, dst, (size_t)dstCapacity, src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1compressEnd(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compressEnd(cctx, dst, (size_t)dstCapacity, src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1getFrameHeader(JNIEnv *__env, jclass clazz, jlong zfhPtrAddress, jlong srcAddress, jlong srcSize) {
    ZSTD_frameHeader *zfhPtr = (ZSTD_frameHeader *)(intptr_t)zfhPtrAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_getFrameHeader(zfhPtr, src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1getFrameHeader_1advanced(JNIEnv *__env, jclass clazz, jlong zfhPtrAddress, jlong srcAddress, jlong srcSize, jint format) {
    ZSTD_frameHeader *zfhPtr = (ZSTD_frameHeader *)(intptr_t)zfhPtrAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_getFrameHeader_advanced(zfhPtr, src, (size_t)srcSize, (ZSTD_format_e)format);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_ZSTD_1decodingBufferSize_1min(JNIEnv *__env, jclass clazz, jlong windowSize, jlong frameContentSize) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decodingBufferSize_min((unsigned long long)windowSize, (unsigned long long)frameContentSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1decompressBegin(JNIEnv *__env, jclass clazz, jlong dctxAddress) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decompressBegin(dctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1decompressBegin_1usingDict(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong dictAddress, jlong dictSize) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void const *dict = (void const *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decompressBegin_usingDict(dctx, dict, (size_t)dictSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1decompressBegin_1usingDDict(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong ddictAddress) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    ZSTD_DDict const *ddict = (ZSTD_DDict const *)(intptr_t)ddictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decompressBegin_usingDDict(dctx, ddict);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1nextSrcSizeToDecompress(JNIEnv *__env, jclass clazz, jlong dctxAddress) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_nextSrcSizeToDecompress(dctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1decompressContinue(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decompressContinue(dctx, dst, (size_t)dstCapacity, src, (size_t)srcSize);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1copyDCtx(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong preparedDCtxAddress) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    ZSTD_DCtx const *preparedDCtx = (ZSTD_DCtx const *)(intptr_t)preparedDCtxAddress;
    UNUSED_PARAMS(__env, clazz)
    ZSTD_copyDCtx(dctx, preparedDCtx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1nextInputType(JNIEnv *__env, jclass clazz, jlong dctxAddress) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ZSTD_nextInputType(dctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1getBlockSize(JNIEnv *__env, jclass clazz, jlong cctxAddress) {
    ZSTD_CCtx const *cctx = (ZSTD_CCtx const *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_getBlockSize(cctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1compressBlock(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compressBlock(cctx, dst, (size_t)dstCapacity, src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1decompressBlock(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decompressBlock(dctx, dst, (size_t)dstCapacity, src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1insertBlock(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong blockStartAddress, jlong blockSize) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void const *blockStart = (void const *)(intptr_t)blockStartAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_insertBlock(dctx, blockStart, (size_t)blockSize);
}

EXTERN_C_EXIT
