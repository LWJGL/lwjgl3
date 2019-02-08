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

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC(jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint compressionLevel) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    return (jint)LZ4_compress_HC(src, dst, srcSize, dstCapacity, compressionLevel);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC(srcAddress, dstAddress, srcSize, dstCapacity, compressionLevel);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4HC_LZ4_1sizeofStateHC(void) {
    return (jint)LZ4_sizeofStateHC();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_LZ4_1sizeofStateHC(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4HC_LZ4_1sizeofStateHC();
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1extStateHC)(jlong stateAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint maxDstSize, jint compressionLevel) {
    void *state = (void *)(intptr_t)stateAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    return (jint)LZ4_compress_HC_extStateHC(state, src, dst, srcSize, maxDstSize, compressionLevel);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1extStateHC(JNIEnv *__env, jclass clazz, jlong stateAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint maxDstSize, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1extStateHC)(stateAddress, srcAddress, dstAddress, srcSize, maxDstSize, compressionLevel);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4HC_LZ4_1createStreamHC(void) {
    return (jlong)(intptr_t)LZ4_createStreamHC();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4HC_LZ4_1createStreamHC(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4HC_LZ4_1createStreamHC();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1freeStreamHC(jlong streamHCPtrAddress) {
    LZ4_streamHC_t *streamHCPtr = (LZ4_streamHC_t *)(intptr_t)streamHCPtrAddress;
    return (jint)LZ4_freeStreamHC(streamHCPtr);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1freeStreamHC(JNIEnv *__env, jclass clazz, jlong streamHCPtrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1freeStreamHC(streamHCPtrAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1resetStreamHC(jlong streamHCPtrAddress, jint compressionLevel) {
    LZ4_streamHC_t *streamHCPtr = (LZ4_streamHC_t *)(intptr_t)streamHCPtrAddress;
    LZ4_resetStreamHC(streamHCPtr, compressionLevel);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1resetStreamHC(JNIEnv *__env, jclass clazz, jlong streamHCPtrAddress, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1resetStreamHC(streamHCPtrAddress, compressionLevel);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1loadDictHC(jlong streamHCPtrAddress, jlong dictionaryAddress, jint dictSize) {
    LZ4_streamHC_t *streamHCPtr = (LZ4_streamHC_t *)(intptr_t)streamHCPtrAddress;
    char const *dictionary = (char const *)(intptr_t)dictionaryAddress;
    return (jint)LZ4_loadDictHC(streamHCPtr, dictionary, dictSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1loadDictHC(JNIEnv *__env, jclass clazz, jlong streamHCPtrAddress, jlong dictionaryAddress, jint dictSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1loadDictHC(streamHCPtrAddress, dictionaryAddress, dictSize);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1continue(jlong streamHCPtrAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint maxDstSize) {
    LZ4_streamHC_t *streamHCPtr = (LZ4_streamHC_t *)(intptr_t)streamHCPtrAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    return (jint)LZ4_compress_HC_continue(streamHCPtr, src, dst, srcSize, maxDstSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1continue(JNIEnv *__env, jclass clazz, jlong streamHCPtrAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint maxDstSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1continue(streamHCPtrAddress, srcAddress, dstAddress, srcSize, maxDstSize);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1saveDictHC(jlong streamHCPtrAddress, jlong safeBufferAddress, jint maxDictSize) {
    LZ4_streamHC_t *streamHCPtr = (LZ4_streamHC_t *)(intptr_t)streamHCPtrAddress;
    char *safeBuffer = (char *)(intptr_t)safeBufferAddress;
    return (jint)LZ4_saveDictHC(streamHCPtr, safeBuffer, maxDictSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1saveDictHC(JNIEnv *__env, jclass clazz, jlong streamHCPtrAddress, jlong safeBufferAddress, jint maxDictSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1saveDictHC(streamHCPtrAddress, safeBufferAddress, maxDictSize);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1destSize__JJJJII)(jlong LZ4HC_DataAddress, jlong srcAddress, jlong dstAddress, jlong srcSizePtrAddress, jint targetDstSize, jint compressionLevel) {
    void *LZ4HC_Data = (void *)(intptr_t)LZ4HC_DataAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    int *srcSizePtr = (int *)(intptr_t)srcSizePtrAddress;
    return (jint)LZ4_compress_HC_destSize(LZ4HC_Data, src, dst, srcSizePtr, targetDstSize, compressionLevel);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1destSize__JJJJII(JNIEnv *__env, jclass clazz, jlong LZ4HC_DataAddress, jlong srcAddress, jlong dstAddress, jlong srcSizePtrAddress, jint targetDstSize, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1destSize__JJJJII)(LZ4HC_DataAddress, srcAddress, dstAddress, srcSizePtrAddress, targetDstSize, compressionLevel);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1continue_1destSize__JJJJI(jlong LZ4_streamHCPtrAddress, jlong srcAddress, jlong dstAddress, jlong srcSizePtrAddress, jint targetDstSize) {
    LZ4_streamHC_t *LZ4_streamHCPtr = (LZ4_streamHC_t *)(intptr_t)LZ4_streamHCPtrAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    int *srcSizePtr = (int *)(intptr_t)srcSizePtrAddress;
    return (jint)LZ4_compress_HC_continue_destSize(LZ4_streamHCPtr, src, dst, srcSizePtr, targetDstSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1continue_1destSize__JJJJI(JNIEnv *__env, jclass clazz, jlong LZ4_streamHCPtrAddress, jlong srcAddress, jlong dstAddress, jlong srcSizePtrAddress, jint targetDstSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1continue_1destSize__JJJJI(LZ4_streamHCPtrAddress, srcAddress, dstAddress, srcSizePtrAddress, targetDstSize);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1setCompressionLevel(jlong LZ4_streamHCPtrAddress, jint compressionLevel) {
    LZ4_streamHC_t *LZ4_streamHCPtr = (LZ4_streamHC_t *)(intptr_t)LZ4_streamHCPtrAddress;
    LZ4_setCompressionLevel(LZ4_streamHCPtr, compressionLevel);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1setCompressionLevel(JNIEnv *__env, jclass clazz, jlong LZ4_streamHCPtrAddress, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1setCompressionLevel(LZ4_streamHCPtrAddress, compressionLevel);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1favorDecompressionSpeed(jlong LZ4_streamHCPtrAddress, jint favor) {
    LZ4_streamHC_t *LZ4_streamHCPtr = (LZ4_streamHC_t *)(intptr_t)LZ4_streamHCPtrAddress;
    LZ4_favorDecompressionSpeed(LZ4_streamHCPtr, favor);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1favorDecompressionSpeed(JNIEnv *__env, jclass clazz, jlong LZ4_streamHCPtrAddress, jint favor) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1favorDecompressionSpeed(LZ4_streamHCPtrAddress, favor);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1resetStreamHC_1fast(jlong LZ4_streamHCPtrAddress, jint compressionLevel) {
    LZ4_streamHC_t *LZ4_streamHCPtr = (LZ4_streamHC_t *)(intptr_t)LZ4_streamHCPtrAddress;
    LZ4_resetStreamHC_fast(LZ4_streamHCPtr, compressionLevel);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1resetStreamHC_1fast(JNIEnv *__env, jclass clazz, jlong LZ4_streamHCPtrAddress, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1resetStreamHC_1fast(LZ4_streamHCPtrAddress, compressionLevel);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1extStateHC_1fastReset)(jlong stateAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint compressionLevel) {
    void *state = (void *)(intptr_t)stateAddress;
    char * const src = (char * const)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    return (jint)LZ4_compress_HC_extStateHC_fastReset(state, src, dst, srcSize, dstCapacity, compressionLevel);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1extStateHC_1fastReset(JNIEnv *__env, jclass clazz, jlong stateAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_lz4_LZ4HC_nLZ4_1compress_1HC_1extStateHC_1fastReset)(stateAddress, srcAddress, dstAddress, srcSize, dstCapacity, compressionLevel);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1attach_1HC_1dictionary(jlong working_streamAddress, jlong dictionary_streamAddress) {
    LZ4_streamHC_t *working_stream = (LZ4_streamHC_t *)(intptr_t)working_streamAddress;
    LZ4_streamHC_t * const dictionary_stream = (LZ4_streamHC_t * const)(intptr_t)dictionary_streamAddress;
    LZ4_attach_HC_dictionary(working_stream, dictionary_stream);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4HC_nLZ4_1attach_1HC_1dictionary(JNIEnv *__env, jclass clazz, jlong working_streamAddress, jlong dictionary_streamAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_lz4_LZ4HC_nLZ4_1attach_1HC_1dictionary(working_streamAddress, dictionary_streamAddress);
}

EXTERN_C_EXIT
