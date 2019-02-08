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

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_LZ4_1versionNumber(void) {
    return (jint)LZ4_versionNumber();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1versionNumber(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_LZ4_1versionNumber();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1versionString(void) {
    return (jlong)(intptr_t)LZ4_versionString();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1versionString(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1versionString();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1default(jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    return (jint)LZ4_compress_default(src, dst, srcSize, dstCapacity);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1default(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1default(srcAddress, dstAddress, srcSize, dstCapacity);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe(jlong srcAddress, jlong dstAddress, jint compressedSize, jint dstCapacity) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    return (jint)LZ4_decompress_safe(src, dst, compressedSize, dstCapacity);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint compressedSize, jint dstCapacity) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe(srcAddress, dstAddress, compressedSize, dstCapacity);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_LZ4_1compressBound(jint inputSize) {
    return (jint)LZ4_compressBound(inputSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1compressBound(JNIEnv *__env, jclass clazz, jint inputSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_LZ4_1compressBound(inputSize);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast(jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint acceleration) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    return (jint)LZ4_compress_fast(src, dst, srcSize, dstCapacity, acceleration);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint acceleration) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast(srcAddress, dstAddress, srcSize, dstCapacity, acceleration);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_LZ4_1sizeofState(void) {
    return (jint)LZ4_sizeofState();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1sizeofState(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_LZ4_1sizeofState();
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast_1extState)(jlong stateAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint acceleration) {
    void *state = (void *)(intptr_t)stateAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    return (jint)LZ4_compress_fast_extState(state, src, dst, srcSize, dstCapacity, acceleration);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast_1extState(JNIEnv *__env, jclass clazz, jlong stateAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint acceleration) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast_1extState)(stateAddress, srcAddress, dstAddress, srcSize, dstCapacity, acceleration);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1destSize__JJJI(jlong srcAddress, jlong dstAddress, jlong srcSizePtrAddress, jint targetDstSize) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    int *srcSizePtr = (int *)(intptr_t)srcSizePtrAddress;
    return (jint)LZ4_compress_destSize(src, dst, srcSizePtr, targetDstSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1destSize__JJJI(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jlong srcSizePtrAddress, jint targetDstSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1destSize__JJJI(srcAddress, dstAddress, srcSizePtrAddress, targetDstSize);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1fast(jlong srcAddress, jlong dstAddress, jint originalSize) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    return (jint)LZ4_decompress_fast(src, dst, originalSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1fast(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint originalSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1fast(srcAddress, dstAddress, originalSize);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1partial(jlong srcAddress, jlong dstAddress, jint compressedSize, jint targetOutputSize, jint dstCapacity) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    return (jint)LZ4_decompress_safe_partial(src, dst, compressedSize, targetOutputSize, dstCapacity);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1partial(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint compressedSize, jint targetOutputSize, jint dstCapacity) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1partial(srcAddress, dstAddress, compressedSize, targetOutputSize, dstCapacity);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_LZ4_1createStream(void) {
    return (jlong)(intptr_t)LZ4_createStream();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1createStream(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_LZ4_1createStream();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1freeStream(jlong streamPtrAddress) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    return (jint)LZ4_freeStream(streamPtr);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1freeStream(JNIEnv *__env, jclass clazz, jlong streamPtrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1freeStream(streamPtrAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1resetStream(jlong streamPtrAddress) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    LZ4_resetStream(streamPtr);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1resetStream(JNIEnv *__env, jclass clazz, jlong streamPtrAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1resetStream(streamPtrAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1loadDict(jlong streamPtrAddress, jlong dictionaryAddress, jint dictSize) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    char const *dictionary = (char const *)(intptr_t)dictionaryAddress;
    return (jint)LZ4_loadDict(streamPtr, dictionary, dictSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1loadDict(JNIEnv *__env, jclass clazz, jlong streamPtrAddress, jlong dictionaryAddress, jint dictSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1loadDict(streamPtrAddress, dictionaryAddress, dictSize);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast_1continue)(jlong streamPtrAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint acceleration) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    return (jint)LZ4_compress_fast_continue(streamPtr, src, dst, srcSize, dstCapacity, acceleration);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast_1continue(JNIEnv *__env, jclass clazz, jlong streamPtrAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint acceleration) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast_1continue)(streamPtrAddress, srcAddress, dstAddress, srcSize, dstCapacity, acceleration);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1saveDict(jlong streamPtrAddress, jlong safeBufferAddress, jint maxDictSize) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    char *safeBuffer = (char *)(intptr_t)safeBufferAddress;
    return (jint)LZ4_saveDict(streamPtr, safeBuffer, maxDictSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1saveDict(JNIEnv *__env, jclass clazz, jlong streamPtrAddress, jlong safeBufferAddress, jint maxDictSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1saveDict(streamPtrAddress, safeBufferAddress, maxDictSize);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_LZ4_1createStreamDecode(void) {
    return (jlong)(intptr_t)LZ4_createStreamDecode();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1createStreamDecode(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_LZ4_1createStreamDecode();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1freeStreamDecode(jlong LZ4_streamAddress) {
    LZ4_streamDecode_t *LZ4_stream = (LZ4_streamDecode_t *)(intptr_t)LZ4_streamAddress;
    return (jint)LZ4_freeStreamDecode(LZ4_stream);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1freeStreamDecode(JNIEnv *__env, jclass clazz, jlong LZ4_streamAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1freeStreamDecode(LZ4_streamAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1setStreamDecode(jlong LZ4_streamDecodeAddress, jlong dictionaryAddress, jint dictSize) {
    LZ4_streamDecode_t *LZ4_streamDecode = (LZ4_streamDecode_t *)(intptr_t)LZ4_streamDecodeAddress;
    char const *dictionary = (char const *)(intptr_t)dictionaryAddress;
    return (jint)LZ4_setStreamDecode(LZ4_streamDecode, dictionary, dictSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1setStreamDecode(JNIEnv *__env, jclass clazz, jlong LZ4_streamDecodeAddress, jlong dictionaryAddress, jint dictSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1setStreamDecode(LZ4_streamDecodeAddress, dictionaryAddress, dictSize);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_LZ4_1decoderRingBufferSize(jint maxBlockSize) {
    return (jint)LZ4_decoderRingBufferSize(maxBlockSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1decoderRingBufferSize(JNIEnv *__env, jclass clazz, jint maxBlockSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_LZ4_1decoderRingBufferSize(maxBlockSize);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1continue(jlong LZ4_streamDecodeAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity) {
    LZ4_streamDecode_t *LZ4_streamDecode = (LZ4_streamDecode_t *)(intptr_t)LZ4_streamDecodeAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    return (jint)LZ4_decompress_safe_continue(LZ4_streamDecode, src, dst, srcSize, dstCapacity);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1continue(JNIEnv *__env, jclass clazz, jlong LZ4_streamDecodeAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1continue(LZ4_streamDecodeAddress, srcAddress, dstAddress, srcSize, dstCapacity);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1fast_1continue(jlong LZ4_streamDecodeAddress, jlong srcAddress, jlong dstAddress, jint originalSize) {
    LZ4_streamDecode_t *LZ4_streamDecode = (LZ4_streamDecode_t *)(intptr_t)LZ4_streamDecodeAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    return (jint)LZ4_decompress_fast_continue(LZ4_streamDecode, src, dst, originalSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1fast_1continue(JNIEnv *__env, jclass clazz, jlong LZ4_streamDecodeAddress, jlong srcAddress, jlong dstAddress, jint originalSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1fast_1continue(LZ4_streamDecodeAddress, srcAddress, dstAddress, originalSize);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1usingDict)(jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jlong dictStartAddress, jint dictSize) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    char const *dictStart = (char const *)(intptr_t)dictStartAddress;
    return (jint)LZ4_decompress_safe_usingDict(src, dst, srcSize, dstCapacity, dictStart, dictSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1usingDict(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jlong dictStartAddress, jint dictSize) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1usingDict)(srcAddress, dstAddress, srcSize, dstCapacity, dictStartAddress, dictSize);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1fast_1usingDict(jlong srcAddress, jlong dstAddress, jint originalSize, jlong dictStartAddress, jint dictSize) {
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    char const *dictStart = (char const *)(intptr_t)dictStartAddress;
    return (jint)LZ4_decompress_fast_usingDict(src, dst, originalSize, dictStart, dictSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1fast_1usingDict(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint originalSize, jlong dictStartAddress, jint dictSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1fast_1usingDict(srcAddress, dstAddress, originalSize, dictStartAddress, dictSize);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1resetStream_1fast(jlong streamPtrAddress) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    LZ4_resetStream_fast(streamPtr);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1resetStream_1fast(JNIEnv *__env, jclass clazz, jlong streamPtrAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1resetStream_1fast(streamPtrAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast_1extState_1fastReset)(jlong stateAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint acceleration) {
    void *state = (void *)(intptr_t)stateAddress;
    char const *src = (char const *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    return (jint)LZ4_compress_fast_extState_fastReset(state, src, dst, srcSize, dstCapacity, acceleration);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast_1extState_1fastReset(JNIEnv *__env, jclass clazz, jlong stateAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint acceleration) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast_1extState_1fastReset)(stateAddress, srcAddress, dstAddress, srcSize, dstCapacity, acceleration);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1attach_1dictionary(jlong working_streamAddress, jlong dictionary_streamAddress) {
    LZ4_stream_t *working_stream = (LZ4_stream_t *)(intptr_t)working_streamAddress;
    LZ4_stream_t const *dictionary_stream = (LZ4_stream_t const *)(intptr_t)dictionary_streamAddress;
    LZ4_attach_dictionary(working_stream, dictionary_stream);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1attach_1dictionary(JNIEnv *__env, jclass clazz, jlong working_streamAddress, jlong dictionary_streamAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1attach_1dictionary(working_streamAddress, dictionary_streamAddress);
}

EXTERN_C_EXIT
