/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LZ4HC {

    static { LibLZ4.initialize(); }

    public static final int
        LZ4HC_CLEVEL_MIN     = 2,
        LZ4HC_CLEVEL_DEFAULT = 9,
        LZ4HC_CLEVEL_OPT_MIN = 10,
        LZ4HC_CLEVEL_MAX     = 12;

    public static final int LZ4HC_DICTIONARY_LOGSIZE = 16;

    public static final int LZ4HC_MAXD = (1 << LZ4HC_DICTIONARY_LOGSIZE);

    public static final int LZ4HC_MAXD_MASK = (LZ4HC_MAXD - 1);

    public static final int LZ4HC_HASH_LOG = 15;

    public static final int LZ4HC_HASHTABLESIZE = (1 << LZ4HC_HASH_LOG);

    public static final int LZ4HC_HASH_MASK = (LZ4HC_HASHTABLESIZE - 1);

    public static final int LZ4_STREAMHC_MINSIZE = 262200;

    protected LZ4HC() {
        throw new UnsupportedOperationException();
    }

    // --- [ LZ4_compress_HC ] ---

    /** {@code int LZ4_compress_HC(char const * src, char * dst, int srcSize, int dstCapacity, int compressionLevel)} */
    public static native int nLZ4_compress_HC(long src, long dst, int srcSize, int dstCapacity, int compressionLevel);

    /** {@code int LZ4_compress_HC(char const * src, char * dst, int srcSize, int dstCapacity, int compressionLevel)} */
    public static int LZ4_compress_HC(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int compressionLevel) {
        return nLZ4_compress_HC(memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), compressionLevel);
    }

    // --- [ LZ4_sizeofStateHC ] ---

    /** {@code int LZ4_sizeofStateHC(void)} */
    public static native int LZ4_sizeofStateHC();

    // --- [ LZ4_compress_HC_extStateHC ] ---

    /** {@code int LZ4_compress_HC_extStateHC(void * state, char const * src, char * dst, int srcSize, int maxDstSize, int compressionLevel)} */
    public static native int nLZ4_compress_HC_extStateHC(long state, long src, long dst, int srcSize, int maxDstSize, int compressionLevel);

    /** {@code int LZ4_compress_HC_extStateHC(void * state, char const * src, char * dst, int srcSize, int maxDstSize, int compressionLevel)} */
    public static int LZ4_compress_HC_extStateHC(@NativeType("void *") ByteBuffer state, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int compressionLevel) {
        return nLZ4_compress_HC_extStateHC(memAddress(state), memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), compressionLevel);
    }

    // --- [ LZ4_compress_HC_destSize ] ---

    /** {@code int LZ4_compress_HC_destSize(void * stateHC, char const * src, char * dst, int * srcSizePtr, int targetDstSize, int compressionLevel)} */
    public static native int nLZ4_compress_HC_destSize(long stateHC, long src, long dst, long srcSizePtr, int targetDstSize, int compressionLevel);

    /** {@code int LZ4_compress_HC_destSize(void * stateHC, char const * src, char * dst, int * srcSizePtr, int targetDstSize, int compressionLevel)} */
    public static int LZ4_compress_HC_destSize(@NativeType("void *") ByteBuffer stateHC, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, @NativeType("int *") IntBuffer srcSizePtr, int compressionLevel) {
        if (CHECKS) {
            check(srcSizePtr, 1);
            check(src, srcSizePtr.get(srcSizePtr.position()));
        }
        return nLZ4_compress_HC_destSize(memAddress(stateHC), memAddress(src), memAddress(dst), memAddress(srcSizePtr), dst.remaining(), compressionLevel);
    }

    // --- [ LZ4_createStreamHC ] ---

    /** {@code LZ4_streamHC_t * LZ4_createStreamHC(void)} */
    @NativeType("LZ4_streamHC_t *")
    public static native long LZ4_createStreamHC();

    // --- [ LZ4_freeStreamHC ] ---

    /** {@code int LZ4_freeStreamHC(LZ4_streamHC_t * streamHCPtr)} */
    public static native int nLZ4_freeStreamHC(long streamHCPtr);

    /** {@code int LZ4_freeStreamHC(LZ4_streamHC_t * streamHCPtr)} */
    public static int LZ4_freeStreamHC(@NativeType("LZ4_streamHC_t *") long streamHCPtr) {
        if (CHECKS) {
            check(streamHCPtr);
        }
        return nLZ4_freeStreamHC(streamHCPtr);
    }

    // --- [ LZ4_resetStreamHC_fast ] ---

    /** {@code void LZ4_resetStreamHC_fast(LZ4_streamHC_t * LZ4_streamHCPtr, int compressionLevel)} */
    public static native void nLZ4_resetStreamHC_fast(long LZ4_streamHCPtr, int compressionLevel);

    /** {@code void LZ4_resetStreamHC_fast(LZ4_streamHC_t * LZ4_streamHCPtr, int compressionLevel)} */
    public static void LZ4_resetStreamHC_fast(@NativeType("LZ4_streamHC_t *") long LZ4_streamHCPtr, int compressionLevel) {
        if (CHECKS) {
            check(LZ4_streamHCPtr);
        }
        nLZ4_resetStreamHC_fast(LZ4_streamHCPtr, compressionLevel);
    }

    // --- [ LZ4_loadDictHC ] ---

    /** {@code int LZ4_loadDictHC(LZ4_streamHC_t * streamHCPtr, char const * dictionary, int dictSize)} */
    public static native int nLZ4_loadDictHC(long streamHCPtr, long dictionary, int dictSize);

    /** {@code int LZ4_loadDictHC(LZ4_streamHC_t * streamHCPtr, char const * dictionary, int dictSize)} */
    public static int LZ4_loadDictHC(@NativeType("LZ4_streamHC_t *") long streamHCPtr, @NativeType("char const *") ByteBuffer dictionary) {
        if (CHECKS) {
            check(streamHCPtr);
        }
        return nLZ4_loadDictHC(streamHCPtr, memAddress(dictionary), dictionary.remaining());
    }

    // --- [ LZ4_compress_HC_continue ] ---

    /** {@code int LZ4_compress_HC_continue(LZ4_streamHC_t * streamHCPtr, char const * src, char * dst, int srcSize, int maxDstSize)} */
    public static native int nLZ4_compress_HC_continue(long streamHCPtr, long src, long dst, int srcSize, int maxDstSize);

    /** {@code int LZ4_compress_HC_continue(LZ4_streamHC_t * streamHCPtr, char const * src, char * dst, int srcSize, int maxDstSize)} */
    public static int LZ4_compress_HC_continue(@NativeType("LZ4_streamHC_t *") long streamHCPtr, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst) {
        if (CHECKS) {
            check(streamHCPtr);
        }
        return nLZ4_compress_HC_continue(streamHCPtr, memAddress(src), memAddress(dst), src.remaining(), dst.remaining());
    }

    // --- [ LZ4_compress_HC_continue_destSize ] ---

    /** {@code int LZ4_compress_HC_continue_destSize(LZ4_streamHC_t * streamHCPtr, char const * src, char * dst, int * srcSizePtr, int targetDstSize)} */
    public static native int nLZ4_compress_HC_continue_destSize(long streamHCPtr, long src, long dst, long srcSizePtr, int targetDstSize);

    /** {@code int LZ4_compress_HC_continue_destSize(LZ4_streamHC_t * streamHCPtr, char const * src, char * dst, int * srcSizePtr, int targetDstSize)} */
    public static int LZ4_compress_HC_continue_destSize(@NativeType("LZ4_streamHC_t *") long streamHCPtr, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, @NativeType("int *") IntBuffer srcSizePtr) {
        if (CHECKS) {
            check(streamHCPtr);
            check(srcSizePtr, 1);
            check(src, srcSizePtr.get(srcSizePtr.position()));
        }
        return nLZ4_compress_HC_continue_destSize(streamHCPtr, memAddress(src), memAddress(dst), memAddress(srcSizePtr), dst.remaining());
    }

    // --- [ LZ4_saveDictHC ] ---

    /** {@code int LZ4_saveDictHC(LZ4_streamHC_t * streamHCPtr, char * safeBuffer, int maxDictSize)} */
    public static native int nLZ4_saveDictHC(long streamHCPtr, long safeBuffer, int maxDictSize);

    /** {@code int LZ4_saveDictHC(LZ4_streamHC_t * streamHCPtr, char * safeBuffer, int maxDictSize)} */
    public static int LZ4_saveDictHC(@NativeType("LZ4_streamHC_t *") long streamHCPtr, @NativeType("char *") ByteBuffer safeBuffer) {
        if (CHECKS) {
            check(streamHCPtr);
        }
        return nLZ4_saveDictHC(streamHCPtr, memAddress(safeBuffer), safeBuffer.remaining());
    }

    // --- [ LZ4_attach_HC_dictionary ] ---

    /** {@code void LZ4_attach_HC_dictionary(LZ4_streamHC_t * working_stream, LZ4_streamHC_t * const dictionary_stream)} */
    public static native void nLZ4_attach_HC_dictionary(long working_stream, long dictionary_stream);

    /** {@code void LZ4_attach_HC_dictionary(LZ4_streamHC_t * working_stream, LZ4_streamHC_t * const dictionary_stream)} */
    public static void LZ4_attach_HC_dictionary(@NativeType("LZ4_streamHC_t *") long working_stream, @NativeType("LZ4_streamHC_t * const") long dictionary_stream) {
        if (CHECKS) {
            check(working_stream);
        }
        nLZ4_attach_HC_dictionary(working_stream, dictionary_stream);
    }

    // --- [ LZ4_initStreamHC ] ---

    /** {@code LZ4_streamHC_t * LZ4_initStreamHC(void * buffer, size_t size)} */
    public static native long nLZ4_initStreamHC(long buffer, long size);

    /** {@code LZ4_streamHC_t * LZ4_initStreamHC(void * buffer, size_t size)} */
    @NativeType("LZ4_streamHC_t *")
    public static long LZ4_initStreamHC(@NativeType("void *") ByteBuffer buffer) {
        return nLZ4_initStreamHC(memAddress(buffer), buffer.remaining());
    }

    // --- [ LZ4_setCompressionLevel ] ---

    /** {@code void LZ4_setCompressionLevel(LZ4_streamHC_t * LZ4_streamHCPtr, int compressionLevel)} */
    public static native void nLZ4_setCompressionLevel(long LZ4_streamHCPtr, int compressionLevel);

    /** {@code void LZ4_setCompressionLevel(LZ4_streamHC_t * LZ4_streamHCPtr, int compressionLevel)} */
    public static void LZ4_setCompressionLevel(@NativeType("LZ4_streamHC_t *") long LZ4_streamHCPtr, int compressionLevel) {
        if (CHECKS) {
            check(LZ4_streamHCPtr);
        }
        nLZ4_setCompressionLevel(LZ4_streamHCPtr, compressionLevel);
    }

    // --- [ LZ4_favorDecompressionSpeed ] ---

    /** {@code void LZ4_favorDecompressionSpeed(LZ4_streamHC_t * LZ4_streamHCPtr, int favor)} */
    public static native void nLZ4_favorDecompressionSpeed(long LZ4_streamHCPtr, int favor);

    /** {@code void LZ4_favorDecompressionSpeed(LZ4_streamHC_t * LZ4_streamHCPtr, int favor)} */
    public static void LZ4_favorDecompressionSpeed(@NativeType("LZ4_streamHC_t *") long LZ4_streamHCPtr, @NativeType("int") boolean favor) {
        if (CHECKS) {
            check(LZ4_streamHCPtr);
        }
        nLZ4_favorDecompressionSpeed(LZ4_streamHCPtr, favor ? 1 : 0);
    }

    // --- [ LZ4_compress_HC_extStateHC_fastReset ] ---

    /** {@code int LZ4_compress_HC_extStateHC_fastReset(void * state, char * const src, char * dst, int srcSize, int dstCapacity, int compressionLevel)} */
    public static native int nLZ4_compress_HC_extStateHC_fastReset(long state, long src, long dst, int srcSize, int dstCapacity, int compressionLevel);

    /** {@code int LZ4_compress_HC_extStateHC_fastReset(void * state, char * const src, char * dst, int srcSize, int dstCapacity, int compressionLevel)} */
    public static int LZ4_compress_HC_extStateHC_fastReset(@NativeType("void *") ByteBuffer state, @NativeType("char * const") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int compressionLevel) {
        return nLZ4_compress_HC_extStateHC_fastReset(memAddress(state), memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), compressionLevel);
    }

}