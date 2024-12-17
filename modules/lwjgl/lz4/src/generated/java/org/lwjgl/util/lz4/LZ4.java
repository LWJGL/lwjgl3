/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LZ4 {

    static { LibLZ4.initialize(); }

    public static final int
        LZ4_VERSION_MAJOR   = 1,
        LZ4_VERSION_MINOR   = 10,
        LZ4_VERSION_RELEASE = 0;

    public static final int LZ4_VERSION_NUMBER = (LZ4_VERSION_MAJOR *100*100 + LZ4_VERSION_MINOR *100 + LZ4_VERSION_RELEASE);

    public static final String LZ4_VERSION_STRING = LZ4_VERSION_MAJOR + "." + LZ4_VERSION_MINOR + "." + LZ4_VERSION_RELEASE;

    public static final int
        LZ4_MEMORY_USAGE_MIN     = 10,
        LZ4_MEMORY_USAGE_DEFAULT = 14,
        LZ4_MEMORY_USAGE_MAX     = 20;

    public static final int LZ4_MEMORY_USAGE = LZ4_MEMORY_USAGE_DEFAULT;

    public static final int LZ4_MAX_INPUT_SIZE = 0x7E000000;

    public static final int LZ4_HASHLOG = (LZ4_MEMORY_USAGE - 2);

    public static final int LZ4_HASHTABLESIZE = (1 << LZ4_MEMORY_USAGE);

    public static final int LZ4_HASH_SIZE_U32 = (1 << LZ4_HASHLOG);

    public static final int LZ4_STREAM_MINSIZE = (1 << LZ4_MEMORY_USAGE) + 32;

    public static final int LZ4_STREAMDECODE_MINSIZE = 32;

    public static final int LZ4_DISTANCE_MAX = 64;

    protected LZ4() {
        throw new UnsupportedOperationException();
    }

    // --- [ LZ4_versionNumber ] ---

    /** {@code int LZ4_versionNumber(void)} */
    public static native int LZ4_versionNumber();

    // --- [ LZ4_versionString ] ---

    /** {@code char const * LZ4_versionString(void)} */
    public static native long nLZ4_versionString();

    /** {@code char const * LZ4_versionString(void)} */
    @NativeType("char const *")
    public static String LZ4_versionString() {
        long __result = nLZ4_versionString();
        return memASCII(__result);
    }

    // --- [ LZ4_compress_default ] ---

    /** {@code int LZ4_compress_default(char const * src, char * dst, int srcSize, int dstCapacity)} */
    public static native int nLZ4_compress_default(long src, long dst, int srcSize, int dstCapacity);

    /** {@code int LZ4_compress_default(char const * src, char * dst, int srcSize, int dstCapacity)} */
    public static int LZ4_compress_default(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst) {
        return nLZ4_compress_default(memAddress(src), memAddress(dst), src.remaining(), dst.remaining());
    }

    // --- [ LZ4_decompress_safe ] ---

    /** {@code int LZ4_decompress_safe(char const * src, char * dst, int compressedSize, int dstCapacity)} */
    public static native int nLZ4_decompress_safe(long src, long dst, int compressedSize, int dstCapacity);

    /** {@code int LZ4_decompress_safe(char const * src, char * dst, int compressedSize, int dstCapacity)} */
    public static int LZ4_decompress_safe(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst) {
        return nLZ4_decompress_safe(memAddress(src), memAddress(dst), src.remaining(), dst.remaining());
    }

    // --- [ LZ4_COMPRESSBOUND ] ---

    /** {@code int LZ4_COMPRESSBOUND(int isize)} */
    public static int LZ4_COMPRESSBOUND(int isize) {
        return LZ4_MAX_INPUT_SIZE < isize ? 0 : isize + isize / 255 + 16;
    }

    // --- [ LZ4_compressBound ] ---

    /** {@code int LZ4_compressBound(int inputSize)} */
    public static native int LZ4_compressBound(int inputSize);

    // --- [ LZ4_compress_fast ] ---

    /** {@code int LZ4_compress_fast(char const * src, char * dst, int srcSize, int dstCapacity, int acceleration)} */
    public static native int nLZ4_compress_fast(long src, long dst, int srcSize, int dstCapacity, int acceleration);

    /** {@code int LZ4_compress_fast(char const * src, char * dst, int srcSize, int dstCapacity, int acceleration)} */
    public static int LZ4_compress_fast(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int acceleration) {
        return nLZ4_compress_fast(memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), acceleration);
    }

    // --- [ LZ4_sizeofState ] ---

    /** {@code int LZ4_sizeofState(void)} */
    public static native int LZ4_sizeofState();

    // --- [ LZ4_compress_fast_extState ] ---

    /** {@code int LZ4_compress_fast_extState(void * state, char const * src, char * dst, int srcSize, int dstCapacity, int acceleration)} */
    public static native int nLZ4_compress_fast_extState(long state, long src, long dst, int srcSize, int dstCapacity, int acceleration);

    /** {@code int LZ4_compress_fast_extState(void * state, char const * src, char * dst, int srcSize, int dstCapacity, int acceleration)} */
    public static int LZ4_compress_fast_extState(@NativeType("void *") ByteBuffer state, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int acceleration) {
        return nLZ4_compress_fast_extState(memAddress(state), memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), acceleration);
    }

    // --- [ LZ4_compress_destSize ] ---

    /** {@code int LZ4_compress_destSize(char const * src, char * dst, int * srcSizePtr, int targetDstSize)} */
    public static native int nLZ4_compress_destSize(long src, long dst, long srcSizePtr, int targetDstSize);

    /** {@code int LZ4_compress_destSize(char const * src, char * dst, int * srcSizePtr, int targetDstSize)} */
    public static int LZ4_compress_destSize(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, @NativeType("int *") IntBuffer srcSizePtr) {
        if (CHECKS) {
            check(srcSizePtr, 1);
            check(src, srcSizePtr.get(srcSizePtr.position()));
        }
        return nLZ4_compress_destSize(memAddress(src), memAddress(dst), memAddress(srcSizePtr), dst.remaining());
    }

    // --- [ LZ4_decompress_safe_partial ] ---

    /** {@code int LZ4_decompress_safe_partial(char const * src, char * dst, int compressedSize, int targetOutputSize, int dstCapacity)} */
    public static native int nLZ4_decompress_safe_partial(long src, long dst, int compressedSize, int targetOutputSize, int dstCapacity);

    /** {@code int LZ4_decompress_safe_partial(char const * src, char * dst, int compressedSize, int targetOutputSize, int dstCapacity)} */
    public static int LZ4_decompress_safe_partial(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int targetOutputSize) {
        return nLZ4_decompress_safe_partial(memAddress(src), memAddress(dst), src.remaining(), targetOutputSize, dst.remaining());
    }

    // --- [ LZ4_createStream ] ---

    /** {@code LZ4_stream_t * LZ4_createStream(void)} */
    @NativeType("LZ4_stream_t *")
    public static native long LZ4_createStream();

    // --- [ LZ4_freeStream ] ---

    /** {@code int LZ4_freeStream(LZ4_stream_t * streamPtr)} */
    public static native int nLZ4_freeStream(long streamPtr);

    /** {@code int LZ4_freeStream(LZ4_stream_t * streamPtr)} */
    public static int LZ4_freeStream(@NativeType("LZ4_stream_t *") long streamPtr) {
        if (CHECKS) {
            check(streamPtr);
        }
        return nLZ4_freeStream(streamPtr);
    }

    // --- [ LZ4_resetStream_fast ] ---

    /** {@code void LZ4_resetStream_fast(LZ4_stream_t * streamPtr)} */
    public static native void nLZ4_resetStream_fast(long streamPtr);

    /** {@code void LZ4_resetStream_fast(LZ4_stream_t * streamPtr)} */
    public static void LZ4_resetStream_fast(@NativeType("LZ4_stream_t *") long streamPtr) {
        if (CHECKS) {
            check(streamPtr);
        }
        nLZ4_resetStream_fast(streamPtr);
    }

    // --- [ LZ4_loadDict ] ---

    /** {@code int LZ4_loadDict(LZ4_stream_t * streamPtr, char const * dictionary, int dictSize)} */
    public static native int nLZ4_loadDict(long streamPtr, long dictionary, int dictSize);

    /** {@code int LZ4_loadDict(LZ4_stream_t * streamPtr, char const * dictionary, int dictSize)} */
    public static int LZ4_loadDict(@NativeType("LZ4_stream_t *") long streamPtr, @NativeType("char const *") @Nullable ByteBuffer dictionary) {
        if (CHECKS) {
            check(streamPtr);
        }
        return nLZ4_loadDict(streamPtr, memAddressSafe(dictionary), remainingSafe(dictionary));
    }

    // --- [ LZ4_loadDictSlow ] ---

    /** {@code int LZ4_loadDictSlow(LZ4_stream_t * streamPtr, char const * dictionary, int dictSize)} */
    public static native int nLZ4_loadDictSlow(long streamPtr, long dictionary, int dictSize);

    /** {@code int LZ4_loadDictSlow(LZ4_stream_t * streamPtr, char const * dictionary, int dictSize)} */
    public static int LZ4_loadDictSlow(@NativeType("LZ4_stream_t *") long streamPtr, @NativeType("char const *") @Nullable ByteBuffer dictionary) {
        if (CHECKS) {
            check(streamPtr);
        }
        return nLZ4_loadDictSlow(streamPtr, memAddressSafe(dictionary), remainingSafe(dictionary));
    }

    // --- [ LZ4_attach_dictionary ] ---

    /** {@code void LZ4_attach_dictionary(LZ4_stream_t * workingStream, LZ4_stream_t const * dictionaryStream)} */
    public static native void nLZ4_attach_dictionary(long workingStream, long dictionaryStream);

    /** {@code void LZ4_attach_dictionary(LZ4_stream_t * workingStream, LZ4_stream_t const * dictionaryStream)} */
    public static void LZ4_attach_dictionary(@NativeType("LZ4_stream_t *") long workingStream, @NativeType("LZ4_stream_t const *") long dictionaryStream) {
        if (CHECKS) {
            check(workingStream);
        }
        nLZ4_attach_dictionary(workingStream, dictionaryStream);
    }

    // --- [ LZ4_compress_fast_continue ] ---

    /** {@code int LZ4_compress_fast_continue(LZ4_stream_t * streamPtr, char const * src, char * dst, int srcSize, int dstCapacity, int acceleration)} */
    public static native int nLZ4_compress_fast_continue(long streamPtr, long src, long dst, int srcSize, int dstCapacity, int acceleration);

    /** {@code int LZ4_compress_fast_continue(LZ4_stream_t * streamPtr, char const * src, char * dst, int srcSize, int dstCapacity, int acceleration)} */
    public static int LZ4_compress_fast_continue(@NativeType("LZ4_stream_t *") long streamPtr, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int acceleration) {
        if (CHECKS) {
            check(streamPtr);
        }
        return nLZ4_compress_fast_continue(streamPtr, memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), acceleration);
    }

    // --- [ LZ4_saveDict ] ---

    /** {@code int LZ4_saveDict(LZ4_stream_t * streamPtr, char * safeBuffer, int maxDictSize)} */
    public static native int nLZ4_saveDict(long streamPtr, long safeBuffer, int maxDictSize);

    /** {@code int LZ4_saveDict(LZ4_stream_t * streamPtr, char * safeBuffer, int maxDictSize)} */
    public static int LZ4_saveDict(@NativeType("LZ4_stream_t *") long streamPtr, @NativeType("char *") ByteBuffer safeBuffer) {
        if (CHECKS) {
            check(streamPtr);
        }
        return nLZ4_saveDict(streamPtr, memAddress(safeBuffer), safeBuffer.remaining());
    }

    // --- [ LZ4_createStreamDecode ] ---

    /** {@code LZ4_streamDecode_t * LZ4_createStreamDecode(void)} */
    @NativeType("LZ4_streamDecode_t *")
    public static native long LZ4_createStreamDecode();

    // --- [ LZ4_freeStreamDecode ] ---

    /** {@code int LZ4_freeStreamDecode(LZ4_streamDecode_t * LZ4_stream)} */
    public static native int nLZ4_freeStreamDecode(long LZ4_stream);

    /** {@code int LZ4_freeStreamDecode(LZ4_streamDecode_t * LZ4_stream)} */
    public static int LZ4_freeStreamDecode(@NativeType("LZ4_streamDecode_t *") long LZ4_stream) {
        if (CHECKS) {
            check(LZ4_stream);
        }
        return nLZ4_freeStreamDecode(LZ4_stream);
    }

    // --- [ LZ4_setStreamDecode ] ---

    /** {@code int LZ4_setStreamDecode(LZ4_streamDecode_t * LZ4_streamDecode, char const * dictionary, int dictSize)} */
    public static native int nLZ4_setStreamDecode(long LZ4_streamDecode, long dictionary, int dictSize);

    /** {@code int LZ4_setStreamDecode(LZ4_streamDecode_t * LZ4_streamDecode, char const * dictionary, int dictSize)} */
    @NativeType("int")
    public static boolean LZ4_setStreamDecode(@NativeType("LZ4_streamDecode_t *") long LZ4_streamDecode, @NativeType("char const *") ByteBuffer dictionary) {
        if (CHECKS) {
            check(LZ4_streamDecode);
        }
        return nLZ4_setStreamDecode(LZ4_streamDecode, memAddress(dictionary), dictionary.remaining()) != 0;
    }

    // --- [ LZ4_decoderRingBufferSize ] ---

    /** {@code int LZ4_decoderRingBufferSize(int maxBlockSize)} */
    public static native int LZ4_decoderRingBufferSize(int maxBlockSize);

    // --- [ LZ4_decompress_safe_continue ] ---

    /** {@code int LZ4_decompress_safe_continue(LZ4_streamDecode_t * LZ4_streamDecode, char const * src, char * dst, int srcSize, int dstCapacity)} */
    public static native int nLZ4_decompress_safe_continue(long LZ4_streamDecode, long src, long dst, int srcSize, int dstCapacity);

    /** {@code int LZ4_decompress_safe_continue(LZ4_streamDecode_t * LZ4_streamDecode, char const * src, char * dst, int srcSize, int dstCapacity)} */
    public static int LZ4_decompress_safe_continue(@NativeType("LZ4_streamDecode_t *") long LZ4_streamDecode, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst) {
        if (CHECKS) {
            check(LZ4_streamDecode);
        }
        return nLZ4_decompress_safe_continue(LZ4_streamDecode, memAddress(src), memAddress(dst), src.remaining(), dst.remaining());
    }

    // --- [ LZ4_decompress_safe_usingDict ] ---

    /** {@code int LZ4_decompress_safe_usingDict(char const * src, char * dst, int srcSize, int dstCapacity, char const * dictStart, int dictSize)} */
    public static native int nLZ4_decompress_safe_usingDict(long src, long dst, int srcSize, int dstCapacity, long dictStart, int dictSize);

    /** {@code int LZ4_decompress_safe_usingDict(char const * src, char * dst, int srcSize, int dstCapacity, char const * dictStart, int dictSize)} */
    public static int LZ4_decompress_safe_usingDict(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, @NativeType("char const *") ByteBuffer dictStart) {
        return nLZ4_decompress_safe_usingDict(memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), memAddress(dictStart), dictStart.remaining());
    }

    // --- [ LZ4_decompress_safe_partial_usingDict ] ---

    /** {@code int LZ4_decompress_safe_partial_usingDict(char const * src, char * dst, int compressedSize, int targetOutputSize, int maxOutputSize, char const * dictStart, int dictSize)} */
    public static native int nLZ4_decompress_safe_partial_usingDict(long src, long dst, int compressedSize, int targetOutputSize, int maxOutputSize, long dictStart, int dictSize);

    /** {@code int LZ4_decompress_safe_partial_usingDict(char const * src, char * dst, int compressedSize, int targetOutputSize, int maxOutputSize, char const * dictStart, int dictSize)} */
    public static int LZ4_decompress_safe_partial_usingDict(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int targetOutputSize, @NativeType("char const *") ByteBuffer dictStart) {
        return nLZ4_decompress_safe_partial_usingDict(memAddress(src), memAddress(dst), src.remaining(), targetOutputSize, dst.remaining(), memAddress(dictStart), dictStart.remaining());
    }

    // --- [ LZ4_compress_fast_extState_fastReset ] ---

    /** {@code int LZ4_compress_fast_extState_fastReset(void * state, char const * src, char * dst, int srcSize, int dstCapacity, int acceleration)} */
    public static native int nLZ4_compress_fast_extState_fastReset(long state, long src, long dst, int srcSize, int dstCapacity, int acceleration);

    /** {@code int LZ4_compress_fast_extState_fastReset(void * state, char const * src, char * dst, int srcSize, int dstCapacity, int acceleration)} */
    public static int LZ4_compress_fast_extState_fastReset(@NativeType("void *") ByteBuffer state, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int acceleration) {
        return nLZ4_compress_fast_extState_fastReset(memAddress(state), memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), acceleration);
    }

    // --- [ LZ4_compress_destSize_extState ] ---

    /** {@code int LZ4_compress_destSize_extState(void * state, char const * src, char * dst, int * srcSizePtr, int targetDstSize, int acceleration)} */
    public static native int nLZ4_compress_destSize_extState(long state, long src, long dst, long srcSizePtr, int targetDstSize, int acceleration);

    /** {@code int LZ4_compress_destSize_extState(void * state, char const * src, char * dst, int * srcSizePtr, int targetDstSize, int acceleration)} */
    public static int LZ4_compress_destSize_extState(@NativeType("void *") ByteBuffer state, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, @NativeType("int *") IntBuffer srcSizePtr, int acceleration) {
        if (CHECKS) {
            check(srcSizePtr, 1);
            check(src, srcSizePtr.get(srcSizePtr.position()));
        }
        return nLZ4_compress_destSize_extState(memAddress(state), memAddress(src), memAddress(dst), memAddress(srcSizePtr), dst.remaining(), acceleration);
    }

    // --- [ LZ4_initStream ] ---

    /** {@code LZ4_stream_t * LZ4_initStream(void * stateBuffer, size_t size)} */
    public static native long nLZ4_initStream(long stateBuffer, long size);

    /** {@code LZ4_stream_t * LZ4_initStream(void * stateBuffer, size_t size)} */
    @NativeType("LZ4_stream_t *")
    public static long LZ4_initStream(@NativeType("void *") ByteBuffer stateBuffer) {
        return nLZ4_initStream(memAddress(stateBuffer), stateBuffer.remaining());
    }

    // --- [ LZ4_DECOMPRESS_INPLACE_MARGIN ] ---

    /** {@code int LZ4_DECOMPRESS_INPLACE_MARGIN(int compressedSize)} */
    public static int LZ4_DECOMPRESS_INPLACE_MARGIN(int compressedSize) {
        return (compressedSize >>> 8) + 32;
    }

    // --- [ LZ4_DECOMPRESS_INPLACE_BUFFER_SIZE ] ---

    /** {@code int LZ4_DECOMPRESS_INPLACE_BUFFER_SIZE(int decompressedSize)} */
    public static int LZ4_DECOMPRESS_INPLACE_BUFFER_SIZE(int decompressedSize) {
        return decompressedSize + LZ4_DECOMPRESS_INPLACE_MARGIN(decompressedSize);
    }

    // --- [ LZ4_COMPRESS_INPLACE_MARGIN ] ---

    /** {@code int LZ4_COMPRESS_INPLACE_MARGIN(void)} */
    public static int LZ4_COMPRESS_INPLACE_MARGIN() {
        return LZ4_DISTANCE_MAX + 32;
    }

    // --- [ LZ4_COMPRESS_INPLACE_BUFFER_SIZE ] ---

    /** {@code int LZ4_COMPRESS_INPLACE_BUFFER_SIZE(int maxCompressedSize)} */
    public static int LZ4_COMPRESS_INPLACE_BUFFER_SIZE(int maxCompressedSize) {
        return maxCompressedSize + LZ4_COMPRESS_INPLACE_MARGIN();
    }

    /** For static allocation; {@code maxBlockSize} presumed valid. */
    public static int LZ4_DECODER_RING_BUFFER_SIZE(int maxBlockSize) {
        return 65536 + 14 + maxBlockSize;
    }

}