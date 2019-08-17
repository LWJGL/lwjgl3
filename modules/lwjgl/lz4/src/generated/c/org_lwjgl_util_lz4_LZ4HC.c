/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#define LZ4_HC_STATIC_LINKING_ONLY
#include "lz4hc.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint compressionLevel) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_HC(src, dst, srcSize, dstCapacity, compressionLevel);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_LZ4_1sizeofStateHC(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_sizeofStateHC();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1extStateHC(JNIEnv *__env, jclass clazz, jlong stateAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint maxDstSize, jint compressionLevel) {
    void *state = (void *)(intptr_t)stateAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_HC_extStateHC(state, src, dst, srcSize, maxDstSize, compressionLevel);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1destSize(JNIEnv *__env, jclass clazz, jlong stateHCAddress, jlong srcAddress, jlong dstAddress, jlong srcSizePtrAddress, jint targetDstSize, jint compressionLevel) {
    void *stateHC = (void *)(intptr_t)stateHCAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    int *srcSizePtr = (int *)(intptr_t)srcSizePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_HC_destSize(stateHC, src, dst, srcSizePtr, targetDstSize, compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4HC_LZ4_1createStreamHC(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)LZ4_createStreamHC();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1freeStreamHC(JNIEnv *__env, jclass clazz, jlong streamHCPtrAddress) {
    LZ4_streamHC_t *streamHCPtr = (LZ4_streamHC_t *)(intptr_t)streamHCPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_freeStreamHC(streamHCPtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1resetStreamHC_1fast(JNIEnv *__env, jclass clazz, jlong LZ4_streamHCPtrAddress, jint compressionLevel) {
    LZ4_streamHC_t *LZ4_streamHCPtr = (LZ4_streamHC_t *)(intptr_t)LZ4_streamHCPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    LZ4_resetStreamHC_fast(LZ4_streamHCPtr, compressionLevel);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1loadDictHC(JNIEnv *__env, jclass clazz, jlong streamHCPtrAddress, jlong dictionaryAddress, jint dictSize) {
    LZ4_streamHC_t *streamHCPtr = (LZ4_streamHC_t *)(intptr_t)streamHCPtrAddress;
    char const *dictionary = (char const *)(intptr_t)dictionaryAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_loadDictHC(streamHCPtr, dictionary, dictSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1continue(JNIEnv *__env, jclass clazz, jlong streamHCPtrAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint maxDstSize) {
    LZ4_streamHC_t *streamHCPtr = (LZ4_streamHC_t *)(intptr_t)streamHCPtrAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_HC_continue(streamHCPtr, src, dst, srcSize, maxDstSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1continue_1destSize(JNIEnv *__env, jclass clazz, jlong streamHCPtrAddress, jlong srcAddress, jlong dstAddress, jlong srcSizePtrAddress, jint targetDstSize) {
    LZ4_streamHC_t *streamHCPtr = (LZ4_streamHC_t *)(intptr_t)streamHCPtrAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    int *srcSizePtr = (int *)(intptr_t)srcSizePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_HC_continue_destSize(streamHCPtr, src, dst, srcSizePtr, targetDstSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1saveDictHC(JNIEnv *__env, jclass clazz, jlong streamHCPtrAddress, jlong safeBufferAddress, jint maxDictSize) {
    LZ4_streamHC_t *streamHCPtr = (LZ4_streamHC_t *)(intptr_t)streamHCPtrAddress;
    char *safeBuffer = (char *)(intptr_t)safeBufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_saveDictHC(streamHCPtr, safeBuffer, maxDictSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1initStreamHC(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong size) {
    void *buffer = (void *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)LZ4_initStreamHC(buffer, (size_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1setCompressionLevel(JNIEnv *__env, jclass clazz, jlong LZ4_streamHCPtrAddress, jint compressionLevel) {
    LZ4_streamHC_t *LZ4_streamHCPtr = (LZ4_streamHC_t *)(intptr_t)LZ4_streamHCPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    LZ4_setCompressionLevel(LZ4_streamHCPtr, compressionLevel);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1favorDecompressionSpeed(JNIEnv *__env, jclass clazz, jlong LZ4_streamHCPtrAddress, jint favor) {
    LZ4_streamHC_t *LZ4_streamHCPtr = (LZ4_streamHC_t *)(intptr_t)LZ4_streamHCPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    LZ4_favorDecompressionSpeed(LZ4_streamHCPtr, favor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1extStateHC_1fastReset(JNIEnv *__env, jclass clazz, jlong stateAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint compressionLevel) {
    void *state = (void *)(intptr_t)stateAddress;
    char * const src = (char * const)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_HC_extStateHC_fastReset(state, src, dst, srcSize, dstCapacity, compressionLevel);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1attach_1HC_1dictionary(JNIEnv *__env, jclass clazz, jlong working_streamAddress, jlong dictionary_streamAddress) {
    LZ4_streamHC_t *working_stream = (LZ4_streamHC_t *)(intptr_t)working_streamAddress;
    LZ4_streamHC_t * const dictionary_stream = (LZ4_streamHC_t * const)(intptr_t)dictionary_streamAddress;
    UNUSED_PARAMS(__env, clazz)
    LZ4_attach_HC_dictionary(working_stream, dictionary_stream);
}

EXTERN_C_EXIT
