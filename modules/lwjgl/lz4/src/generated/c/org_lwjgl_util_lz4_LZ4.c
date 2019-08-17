/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#define LZ4_STATIC_LINKING_ONLY
#include "lz4.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1versionNumber(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_versionNumber();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1versionString(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)LZ4_versionString();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1default(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_default(src, dst, srcSize, dstCapacity);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint compressedSize, jint dstCapacity) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_safe(src, dst, compressedSize, dstCapacity);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1compressBound(JNIEnv *__env, jclass clazz, jint inputSize) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compressBound(inputSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint acceleration) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_fast(src, dst, srcSize, dstCapacity, acceleration);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1sizeofState(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_sizeofState();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast_1extState(JNIEnv *__env, jclass clazz, jlong stateAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint acceleration) {
    void *state = (void *)(intptr_t)stateAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_fast_extState(state, src, dst, srcSize, dstCapacity, acceleration);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1destSize(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jlong srcSizePtrAddress, jint targetDstSize) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    int *srcSizePtr = (int *)(intptr_t)srcSizePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_destSize(src, dst, srcSizePtr, targetDstSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1partial(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint compressedSize, jint targetOutputSize, jint dstCapacity) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_safe_partial(src, dst, compressedSize, targetOutputSize, dstCapacity);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1createStream(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)LZ4_createStream();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1freeStream(JNIEnv *__env, jclass clazz, jlong streamPtrAddress) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_freeStream(streamPtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1resetStream_1fast(JNIEnv *__env, jclass clazz, jlong streamPtrAddress) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    LZ4_resetStream_fast(streamPtr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1loadDict(JNIEnv *__env, jclass clazz, jlong streamPtrAddress, jlong dictionaryAddress, jint dictSize) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    char const *dictionary = (char const *)(intptr_t)dictionaryAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_loadDict(streamPtr, dictionary, dictSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast_1continue(JNIEnv *__env, jclass clazz, jlong streamPtrAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint acceleration) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_fast_continue(streamPtr, src, dst, srcSize, dstCapacity, acceleration);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1saveDict(JNIEnv *__env, jclass clazz, jlong streamPtrAddress, jlong safeBufferAddress, jint maxDictSize) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    char *safeBuffer = (char *)(intptr_t)safeBufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_saveDict(streamPtr, safeBuffer, maxDictSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1createStreamDecode(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)LZ4_createStreamDecode();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1freeStreamDecode(JNIEnv *__env, jclass clazz, jlong LZ4_streamAddress) {
    LZ4_streamDecode_t *LZ4_stream = (LZ4_streamDecode_t *)(intptr_t)LZ4_streamAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_freeStreamDecode(LZ4_stream);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1setStreamDecode(JNIEnv *__env, jclass clazz, jlong LZ4_streamDecodeAddress, jlong dictionaryAddress, jint dictSize) {
    LZ4_streamDecode_t *LZ4_streamDecode = (LZ4_streamDecode_t *)(intptr_t)LZ4_streamDecodeAddress;
    char const *dictionary = (char const *)(intptr_t)dictionaryAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_setStreamDecode(LZ4_streamDecode, dictionary, dictSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1decoderRingBufferSize(JNIEnv *__env, jclass clazz, jint maxBlockSize) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decoderRingBufferSize(maxBlockSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1continue(JNIEnv *__env, jclass clazz, jlong LZ4_streamDecodeAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity) {
    LZ4_streamDecode_t *LZ4_streamDecode = (LZ4_streamDecode_t *)(intptr_t)LZ4_streamDecodeAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_safe_continue(LZ4_streamDecode, src, dst, srcSize, dstCapacity);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1usingDict(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jlong dictStartAddress, jint dictSize) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    char const *dictStart = (char const *)(intptr_t)dictStartAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_safe_usingDict(src, dst, srcSize, dstCapacity, dictStart, dictSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast_1extState_1fastReset(JNIEnv *__env, jclass clazz, jlong stateAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint acceleration) {
    void *state = (void *)(intptr_t)stateAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_fast_extState_fastReset(state, src, dst, srcSize, dstCapacity, acceleration);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1attach_1dictionary(JNIEnv *__env, jclass clazz, jlong workingStreamAddress, jlong dictionaryStreamAddress) {
    LZ4_stream_t *workingStream = (LZ4_stream_t *)(intptr_t)workingStreamAddress;
    LZ4_stream_t const *dictionaryStream = (LZ4_stream_t const *)(intptr_t)dictionaryStreamAddress;
    UNUSED_PARAMS(__env, clazz)
    LZ4_attach_dictionary(workingStream, dictionaryStream);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1initStream(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong size) {
    void *buffer = (void *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)LZ4_initStream(buffer, (size_t)size);
}

EXTERN_C_EXIT
