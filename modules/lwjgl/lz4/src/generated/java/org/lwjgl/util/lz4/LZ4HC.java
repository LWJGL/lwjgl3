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

/**
 * Native bindings to the high-compression API of <a target="_blank" href="http://lz4.github.io/lz4/">LZ4</a>.
 * 
 * <h3>Streaming Compression - Bufferless synchronous API</h3>
 * 
 * <p>These functions compress data in successive blocks of any size, using previous blocks as dictionary. One key assumption is that previous blocks (up to
 * 64 KB) remain read-accessible while compressing next blocks. There is an exception for ring buffers, which can be smaller than 64 KB. Ring buffers scenario is automatically detected and handled by LZ4_compress_HC_continue().</p>
 * 
 * <p>Before starting compression, state must be properly initialized, using {@link #LZ4_resetStreamHC resetStreamHC}. A first "fictional block" can then be designated as initial
 * dictionary, using {@link #LZ4_loadDictHC loadDictHC} (Optional).</p>
 * 
 * <p>Then, use {@link #LZ4_compress_HC_continue compress_HC_continue} to compress each successive block. Previous memory blocks (including initial dictionary when present) must remain
 * accessible and unmodified during compression. {@code dst} buffer should be sized to handle worst case scenarios (see {@link LZ4#LZ4_compressBound compressBound}), to ensure
 * operation success. Because in case of failure, the API does not guarantee context recovery, and context will have to be reset. If {@code dst} buffer
 * budget cannot be &ge; {@link LZ4#LZ4_compressBound compressBound}, consider using {@link #LZ4_compress_HC_continue_destSize compress_HC_continue_destSize} instead.</p>
 * 
 * <p>If, for any reason, previous data block can't be preserved unmodified in memory for next compression block, you can save it to a more stable memory
 * space, using {@link #LZ4_saveDictHC saveDictHC}. Return value of {@link #LZ4_saveDictHC saveDictHC} is the size of dictionary effectively saved into {@code safeBuffer}.</p>
 */
public class LZ4HC {

    /** Compression level. */
    public static final int
        LZ4HC_CLEVEL_MIN     = 3,
        LZ4HC_CLEVEL_DEFAULT = 9,
        LZ4HC_CLEVEL_OPT_MIN = 10,
        LZ4HC_CLEVEL_MAX     = 12;

    public static final int LZ4HC_DICTIONARY_LOGSIZE = 16;

    public static final int LZ4HC_MAXD = (1 << LZ4HC_DICTIONARY_LOGSIZE);

    public static final int LZ4HC_MAXD_MASK = (LZ4HC_MAXD - 1);

    public static final int LZ4HC_HASH_LOG = 15;

    public static final int LZ4HC_HASHTABLESIZE = (1 << LZ4HC_HASH_LOG);

    public static final int LZ4HC_HASH_MASK = (LZ4HC_HASHTABLESIZE - 1);

    public static final int LZ4_STREAMHCSIZE = (4*LZ4HC_HASHTABLESIZE + 2*LZ4HC_MAXD + 56);

    public static final int LZ4_STREAMHCSIZE_SIZET = (LZ4_STREAMHCSIZE / Pointer.POINTER_SIZE);

    static { LibLZ4.initialize(); }

    protected LZ4HC() {
        throw new UnsupportedOperationException();
    }

    // --- [ LZ4_compress_HC ] ---

    /**
     * Unsafe version of: {@link #LZ4_compress_HC compress_HC}
     *
     * @param srcSize max supported value is {@link LZ4#LZ4_MAX_INPUT_SIZE MAX_INPUT_SIZE}
     */
    public static native int nLZ4_compress_HC(long src, long dst, int srcSize, int dstCapacity, int compressionLevel);

    /**
     * Compress data from {@code src} into {@code dst}, using the more powerful but slower "HC" algorithm. {@code dst} must be already allocated.
     * 
     * <p>Compression is guaranteed to succeed if {@code dstCapacity} &ge; {@link LZ4#LZ4_compressBound compressBound}{@code (srcSize)}`</p>
     *
     * @param src              
     * @param dst              
     * @param compressionLevel any value between 1 and {@link #LZ4HC_CLEVEL_MAX CLEVEL_MAX} will work. Values &gt; {@link #LZ4HC_CLEVEL_MAX CLEVEL_MAX} behave the same as {@link #LZ4HC_CLEVEL_MAX CLEVEL_MAX}.
     *
     * @return the number of bytes written into {@code dst} or 0 if compression fails
     */
    public static int LZ4_compress_HC(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int compressionLevel) {
        return nLZ4_compress_HC(memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), compressionLevel);
    }

    // --- [ LZ4_sizeofStateHC ] ---

    public static native int LZ4_sizeofStateHC();

    // --- [ LZ4_compress_HC_extStateHC ] ---

    /** Unsafe version of: {@link #LZ4_compress_HC_extStateHC compress_HC_extStateHC} */
    public static native int nLZ4_compress_HC_extStateHC(long state, long src, long dst, int srcSize, int maxDstSize, int compressionLevel);

    /**
     * Same as {@link #LZ4_compress_HC compress_HC}, but using an externally allocated memory segment for {@code state}.
     * 
     * <p>{@code state} size is provided by {@link #LZ4_sizeofStateHC sizeofStateHC}. Memory segment must be aligned on 8-bytes boundaries (which a normal {@code malloc()} should do
     * properly).</p>
     *
     * @param state            
     * @param src              
     * @param dst              
     * @param compressionLevel 
     */
    public static int LZ4_compress_HC_extStateHC(@NativeType("void *") ByteBuffer state, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int compressionLevel) {
        return nLZ4_compress_HC_extStateHC(memAddress(state), memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), compressionLevel);
    }

    // --- [ LZ4_createStreamHC ] ---

    /**
     * Creates memory for LZ4 HC streaming state.
     * 
     * <p>Newly created states are automatically initialized. Existing states can be re-used several times, using {@link #LZ4_resetStreamHC resetStreamHC}.</p>
     */
    @NativeType("LZ4_streamHC_t *")
    public static native long LZ4_createStreamHC();

    // --- [ LZ4_freeStreamHC ] ---

    /** Unsafe version of: {@link #LZ4_freeStreamHC freeStreamHC} */
    public static native int nLZ4_freeStreamHC(long streamHCPtr);

    /**
     * Releases memory for LZ4 HC streaming state.
     *
     * @param streamHCPtr 
     */
    public static int LZ4_freeStreamHC(@NativeType("LZ4_streamHC_t *") long streamHCPtr) {
        if (CHECKS) {
            check(streamHCPtr);
        }
        return nLZ4_freeStreamHC(streamHCPtr);
    }

    // --- [ LZ4_resetStreamHC ] ---

    public static native void nLZ4_resetStreamHC(long streamHCPtr, int compressionLevel);

    public static void LZ4_resetStreamHC(@NativeType("LZ4_streamHC_t *") long streamHCPtr, int compressionLevel) {
        if (CHECKS) {
            check(streamHCPtr);
        }
        nLZ4_resetStreamHC(streamHCPtr, compressionLevel);
    }

    // --- [ LZ4_loadDictHC ] ---

    public static native int nLZ4_loadDictHC(long streamHCPtr, long dictionary, int dictSize);

    public static int LZ4_loadDictHC(@NativeType("LZ4_streamHC_t *") long streamHCPtr, @NativeType("char const *") ByteBuffer dictionary) {
        if (CHECKS) {
            check(streamHCPtr);
        }
        return nLZ4_loadDictHC(streamHCPtr, memAddress(dictionary), dictionary.remaining());
    }

    // --- [ LZ4_compress_HC_continue ] ---

    public static native int nLZ4_compress_HC_continue(long streamHCPtr, long src, long dst, int srcSize, int maxDstSize);

    public static int LZ4_compress_HC_continue(@NativeType("LZ4_streamHC_t *") long streamHCPtr, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst) {
        if (CHECKS) {
            check(streamHCPtr);
        }
        return nLZ4_compress_HC_continue(streamHCPtr, memAddress(src), memAddress(dst), src.remaining(), dst.remaining());
    }

    // --- [ LZ4_saveDictHC ] ---

    public static native int nLZ4_saveDictHC(long streamHCPtr, long safeBuffer, int maxDictSize);

    public static int LZ4_saveDictHC(@NativeType("LZ4_streamHC_t *") long streamHCPtr, @NativeType("char *") ByteBuffer safeBuffer) {
        if (CHECKS) {
            check(streamHCPtr);
        }
        return nLZ4_saveDictHC(streamHCPtr, memAddress(safeBuffer), safeBuffer.remaining());
    }

    // --- [ LZ4_compress_HC_destSize ] ---

    /**
     * Unsafe version of: {@link #LZ4_compress_HC_destSize compress_HC_destSize}
     *
     * @param srcSizePtr value will be updated to indicate how much bytes were read from {@code src}
     */
    public static native int nLZ4_compress_HC_destSize(long LZ4HC_Data, long src, long dst, long srcSizePtr, int targetDstSize, int compressionLevel);

    /**
     * Will try to compress as much data from {@code src} as possible that can fit into {@code targetDstSize} budget.
     *
     * @param LZ4HC_Data       
     * @param src              
     * @param dst              
     * @param srcSizePtr       value will be updated to indicate how much bytes were read from {@code src}
     * @param compressionLevel 
     *
     * @return the number of bytes written into {@code dst} or 0 if compression fails
     */
    public static int LZ4_compress_HC_destSize(@NativeType("void *") ByteBuffer LZ4HC_Data, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, @NativeType("int *") IntBuffer srcSizePtr, int compressionLevel) {
        if (CHECKS) {
            check(srcSizePtr, 1);
            check(src, srcSizePtr.get(srcSizePtr.position()));
        }
        return nLZ4_compress_HC_destSize(memAddress(LZ4HC_Data), memAddress(src), memAddress(dst), memAddress(srcSizePtr), dst.remaining(), compressionLevel);
    }

    // --- [ LZ4_compress_HC_continue_destSize ] ---

    /**
     * Unsafe version of: {@link #LZ4_compress_HC_continue_destSize compress_HC_continue_destSize}
     *
     * @param srcSizePtr value will be updated to indicate how much bytes were read from {@code src}
     */
    public static native int nLZ4_compress_HC_continue_destSize(long LZ4_streamHCPtr, long src, long dst, long srcSizePtr, int targetDstSize);

    /**
     * Similar as {@link #LZ4_compress_HC_continue compress_HC_continue}, but will read a variable nb of bytes from {@code src} to fit into {@code targetDstSize} budget.
     *
     * @param LZ4_streamHCPtr 
     * @param src             
     * @param dst             
     * @param srcSizePtr      value will be updated to indicate how much bytes were read from {@code src}
     *
     * @return the number of bytes written into {@code dst} or 0 if compression fails
     */
    public static int LZ4_compress_HC_continue_destSize(@NativeType("LZ4_streamHC_t *") long LZ4_streamHCPtr, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, @NativeType("int *") IntBuffer srcSizePtr) {
        if (CHECKS) {
            check(LZ4_streamHCPtr);
            check(srcSizePtr, 1);
            check(src, srcSizePtr.get(srcSizePtr.position()));
        }
        return nLZ4_compress_HC_continue_destSize(LZ4_streamHCPtr, memAddress(src), memAddress(dst), memAddress(srcSizePtr), dst.remaining());
    }

    // --- [ LZ4_setCompressionLevel ] ---

    /** Unsafe version of: {@link #LZ4_setCompressionLevel setCompressionLevel} */
    public static native void nLZ4_setCompressionLevel(long LZ4_streamHCPtr, int compressionLevel);

    /**
     * It's possible to change compression level between 2 invocations of {@code LZ4_compress_HC_continue*()}.
     *
     * @param LZ4_streamHCPtr  
     * @param compressionLevel 
     */
    public static void LZ4_setCompressionLevel(@NativeType("LZ4_streamHC_t *") long LZ4_streamHCPtr, int compressionLevel) {
        if (CHECKS) {
            check(LZ4_streamHCPtr);
        }
        nLZ4_setCompressionLevel(LZ4_streamHCPtr, compressionLevel);
    }

}