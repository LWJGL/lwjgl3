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
 * <p>These functions compress data in successive blocks of any size, using previous blocks as dictionary, to improve compression ratio. One key assumption
 * is that previous blocks (up to 64 KB) remain read-accessible while compressing next blocks. There is an exception for ring buffers, which can be
 * smaller than 64 KB. Ring-buffer scenario is automatically detected and handled within {@link #LZ4_compress_HC_continue compress_HC_continue}.</p>
 * 
 * <p>Before starting compression, state must be allocated and properly initialized. {@link #LZ4_createStreamHC createStreamHC} does both, though compression level is set to
 * {@link #LZ4HC_CLEVEL_DEFAULT CLEVEL_DEFAULT}.</p>
 * 
 * <p>Selecting the compression level can be done with {@link #LZ4_resetStreamHC_fast resetStreamHC_fast} (starts a new stream) {@link #LZ4_setCompressionLevel setCompressionLevel} (anytime, between blocks in the
 * same stream) (experimental). {@code LZ4_resetStreamHC_fast()} only works on states which have been properly initialized at least once, which is
 * automatically the case when state is created using {@code LZ4_createStreamHC()}.</p>
 * 
 * <p>After reset, a first "fictional block" can be designated as initial dictionary, using {@link #LZ4_loadDictHC loadDictHC} (Optional).</p>
 * 
 * <p>Invoke {@link #LZ4_compress_HC_continue compress_HC_continue} to compress each successive block. The number of blocks is unlimited. Previous input blocks, including initial
 * dictionary when present, must remain accessible and unmodified during compression.</p>
 * 
 * <p>It's allowed to update compression level anytime between blocks, using {@code LZ4_setCompressionLevel()} (experimental).</p>
 * 
 * <p>{@code dst} buffer should be sized to handle worst case scenarios (see {@link LZ4#LZ4_compressBound compressBound}, it ensures compression success). In case of failure, the API
 * does not guarantee recovery, so the state <em>must</em> be reset. To ensure compression success whenever {@code dst} buffer size cannot be made &ge;
 * {@code LZ4_compressBound()}, consider using {@link #LZ4_compress_HC_continue_destSize compress_HC_continue_destSize}.</p>
 * 
 * <p>Whenever previous input blocks can't be preserved unmodified in-place during compression of next blocks, it's possible to copy the last blocks into a
 * more stable memory space, using {@link #LZ4_saveDictHC saveDictHC}. Return value of {@code LZ4_saveDictHC()} is the size of dictionary effectively saved into
 * {@code safeBuffer} (&le; 64 KB)</p>
 * 
 * <p>After completing a streaming compression, it's possible to start a new stream of blocks, using the same {@code LZ4_streamHC_t} state, just by
 * resetting it, using {@code LZ4_resetStreamHC_fast()}.</p>
 */
public class LZ4HC {

    static { LibLZ4.initialize(); }

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

    public static final int LZ4_STREAMHCSIZE = 262200;

    public static final int LZ4_STREAMHCSIZE_VOIDP = (LZ4_STREAMHCSIZE / Pointer.POINTER_SIZE);

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
     * Compress data from {@code src} into {@code dst}, using the powerful but slower "HC" algorithm.
     * 
     * <p>Compression is guaranteed to succeed if {@code dstCapacity} &ge; {@link LZ4#LZ4_compressBound compressBound}{@code (srcSize)}`</p>
     *
     * @param dst              must be already allocated
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
     */
    public static int LZ4_compress_HC_extStateHC(@NativeType("void *") ByteBuffer state, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int compressionLevel) {
        return nLZ4_compress_HC_extStateHC(memAddress(state), memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), compressionLevel);
    }

    // --- [ LZ4_compress_HC_destSize ] ---

    /**
     * Unsafe version of: {@link #LZ4_compress_HC_destSize compress_HC_destSize}
     *
     * @param srcSizePtr on success, {@code *srcSizePtr} is updated to indicate how much bytes were read from {@code src}
     */
    public static native int nLZ4_compress_HC_destSize(long stateHC, long src, long dst, long srcSizePtr, int targetDstSize, int compressionLevel);

    /**
     * Will compress as much data as possible from {@code src} to fit into {@code targetDstSize} budget.
     *
     * @param srcSizePtr on success, {@code *srcSizePtr} is updated to indicate how much bytes were read from {@code src}
     *
     * @return the number of bytes written into {@code dst} (necessarily &le; {@code targetDstSize}) or 0 if compression fails
     *
     * @since 1.9.0
     */
    public static int LZ4_compress_HC_destSize(@NativeType("void *") ByteBuffer stateHC, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, @NativeType("int *") IntBuffer srcSizePtr, int compressionLevel) {
        if (CHECKS) {
            check(srcSizePtr, 1);
            check(src, srcSizePtr.get(srcSizePtr.position()));
        }
        return nLZ4_compress_HC_destSize(memAddress(stateHC), memAddress(src), memAddress(dst), memAddress(srcSizePtr), dst.remaining(), compressionLevel);
    }

    // --- [ LZ4_createStreamHC ] ---

    /**
     * Creates memory for LZ4 HC streaming state.
     * 
     * <p>Newly created states are automatically initialized. A same state can be used multiple times consecutively, starting with {@link #LZ4_resetStreamHC_fast resetStreamHC_fast} to start
     * a new stream of blocks.</p>
     */
    @NativeType("LZ4_streamHC_t *")
    public static native long LZ4_createStreamHC();

    // --- [ LZ4_freeStreamHC ] ---

    /** Unsafe version of: {@link #LZ4_freeStreamHC freeStreamHC} */
    public static native int nLZ4_freeStreamHC(long streamHCPtr);

    /** Releases memory for LZ4 HC streaming state. */
    public static int LZ4_freeStreamHC(@NativeType("LZ4_streamHC_t *") long streamHCPtr) {
        if (CHECKS) {
            check(streamHCPtr);
        }
        return nLZ4_freeStreamHC(streamHCPtr);
    }

    // --- [ LZ4_resetStreamHC_fast ] ---

    /** Unsafe version of: {@link #LZ4_resetStreamHC_fast resetStreamHC_fast} */
    public static native void nLZ4_resetStreamHC_fast(long LZ4_streamHCPtr, int compressionLevel);

    /**
     * When an {@code LZ4_streamHC_t} is known to be in a internally coherent state, it can often be prepared for a new compression with almost no work, only
     * sometimes falling back to the full, expensive reset that is always required when the stream is in an indeterminate state (i.e., the reset performed by
     * {@link #LZ4_initStreamHC initStreamHC}).
     * 
     * <p>{@code LZ4_streamHC}s are guaranteed to be in a valid state when:</p>
     * 
     * <ul>
     * <li>returned from {@link #LZ4_createStreamHC createStreamHC}</li>
     * <li>reset by {@link #LZ4_initStreamHC initStreamHC}</li>
     * <li>{@code memset(stream, 0, sizeof(LZ4_streamHC_t))}</li>
     * <li>the stream was in a valid state and was reset by {@link #LZ4_resetStreamHC_fast resetStreamHC_fast}</li>
     * <li>the stream was in a valid state and was then used in any compression call that returned success</li>
     * <li>the stream was in an indeterminate state and was used in a compression call that fully reset the state ({@link #LZ4_compress_HC_extStateHC compress_HC_extStateHC}) and that
     * returned success</li>
     * </ul>
     * 
     * <p>Note: A stream that was last used in a compression call that returned an error may be passed to this function. However, it will be fully reset, which
     * will clear any existing history and settings from the context.</p>
     */
    public static void LZ4_resetStreamHC_fast(@NativeType("LZ4_streamHC_t *") long LZ4_streamHCPtr, int compressionLevel) {
        if (CHECKS) {
            check(LZ4_streamHCPtr);
        }
        nLZ4_resetStreamHC_fast(LZ4_streamHCPtr, compressionLevel);
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

    // --- [ LZ4_compress_HC_continue_destSize ] ---

    /**
     * Unsafe version of: {@link #LZ4_compress_HC_continue_destSize compress_HC_continue_destSize}
     *
     * @param srcSizePtr on success, {@code *srcSizePtr} will be updated to indicate how much bytes were read from {@code src}. Note that this function may not consume the
     *                   entire input.
     */
    public static native int nLZ4_compress_HC_continue_destSize(long streamHCPtr, long src, long dst, long srcSizePtr, int targetDstSize);

    /**
     * Similar to {@link #LZ4_compress_HC_continue compress_HC_continue}, but will read as much data as possible from {@code src} to fit into {@code targetDstSize} budget.
     *
     * @param srcSizePtr on success, {@code *srcSizePtr} will be updated to indicate how much bytes were read from {@code src}. Note that this function may not consume the
     *                   entire input.
     *
     * @return the number of bytes written into {@code dst} (necessarily &le; targetDstSize) or 0 if compression fails
     *
     * @since 1.9.0
     */
    public static int LZ4_compress_HC_continue_destSize(@NativeType("LZ4_streamHC_t *") long streamHCPtr, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, @NativeType("int *") IntBuffer srcSizePtr) {
        if (CHECKS) {
            check(streamHCPtr);
            check(srcSizePtr, 1);
            check(src, srcSizePtr.get(srcSizePtr.position()));
        }
        return nLZ4_compress_HC_continue_destSize(streamHCPtr, memAddress(src), memAddress(dst), memAddress(srcSizePtr), dst.remaining());
    }

    // --- [ LZ4_saveDictHC ] ---

    public static native int nLZ4_saveDictHC(long streamHCPtr, long safeBuffer, int maxDictSize);

    public static int LZ4_saveDictHC(@NativeType("LZ4_streamHC_t *") long streamHCPtr, @NativeType("char *") ByteBuffer safeBuffer) {
        if (CHECKS) {
            check(streamHCPtr);
        }
        return nLZ4_saveDictHC(streamHCPtr, memAddress(safeBuffer), safeBuffer.remaining());
    }

    // --- [ LZ4_initStreamHC ] ---

    /** Unsafe version of: {@link #LZ4_initStreamHC initStreamHC} */
    public static native long nLZ4_initStreamHC(long buffer, long size);

    /**
     * Required before first use of a statically allocated {@code LZ4_streamHC_t}.
     *
     * @since 1.9.0
     */
    @NativeType("LZ4_streamHC_t *")
    public static long LZ4_initStreamHC(@NativeType("void *") ByteBuffer buffer) {
        return nLZ4_initStreamHC(memAddress(buffer), buffer.remaining());
    }

    // --- [ LZ4_setCompressionLevel ] ---

    /** Unsafe version of: {@link #LZ4_setCompressionLevel setCompressionLevel} */
    public static native void nLZ4_setCompressionLevel(long LZ4_streamHCPtr, int compressionLevel);

    /** It's possible to change compression level between successive invocations of {@code LZ4_compress_HC_continue*()} for dynamic adaptation. */
    public static void LZ4_setCompressionLevel(@NativeType("LZ4_streamHC_t *") long LZ4_streamHCPtr, int compressionLevel) {
        if (CHECKS) {
            check(LZ4_streamHCPtr);
        }
        nLZ4_setCompressionLevel(LZ4_streamHCPtr, compressionLevel);
    }

    // --- [ LZ4_favorDecompressionSpeed ] ---

    /** Unsafe version of: {@link #LZ4_favorDecompressionSpeed favorDecompressionSpeed} */
    public static native void nLZ4_favorDecompressionSpeed(long LZ4_streamHCPtr, int favor);

    /**
     * Parser will favor decompression speed over compression ratio.
     * 
     * <p>Only applicable to levels &ge; {@link #LZ4HC_CLEVEL_OPT_MIN CLEVEL_OPT_MIN}.</p>
     *
     * @since version 1.8.2 (experimental)
     */
    public static void LZ4_favorDecompressionSpeed(@NativeType("LZ4_streamHC_t *") long LZ4_streamHCPtr, @NativeType("int") boolean favor) {
        if (CHECKS) {
            check(LZ4_streamHCPtr);
        }
        nLZ4_favorDecompressionSpeed(LZ4_streamHCPtr, favor ? 1 : 0);
    }

    // --- [ LZ4_compress_HC_extStateHC_fastReset ] ---

    /** Unsafe version of: {@link #LZ4_compress_HC_extStateHC_fastReset compress_HC_extStateHC_fastReset} */
    public static native int nLZ4_compress_HC_extStateHC_fastReset(long state, long src, long dst, int srcSize, int dstCapacity, int compressionLevel);

    /**
     * A variant of {@link #LZ4_compress_HC_extStateHC compress_HC_extStateHC}.
     * 
     * <p>Using this variant avoids an expensive initialization step. It is only safe to call if the state buffer is known to be correctly initialized already
     * (see comment on {@link #LZ4_resetStreamHC_fast resetStreamHC_fast} for a definition of "correctly initialized"). From a high level, the difference is that this function initializes
     * the provided state with a call to {@link #LZ4_resetStreamHC_fast resetStreamHC_fast} while {@link #LZ4_compress_HC_extStateHC compress_HC_extStateHC} starts with a call to {@link #LZ4_initStreamHC initStreamHC}.</p>
     */
    public static int LZ4_compress_HC_extStateHC_fastReset(@NativeType("void *") ByteBuffer state, @NativeType("char * const") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int compressionLevel) {
        return nLZ4_compress_HC_extStateHC_fastReset(memAddress(state), memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), compressionLevel);
    }

    // --- [ LZ4_attach_HC_dictionary ] ---

    /** Unsafe version of: {@link #LZ4_attach_HC_dictionary attach_HC_dictionary} */
    public static native void nLZ4_attach_HC_dictionary(long working_stream, long dictionary_stream);

    /**
     * This is an experimental API that allows for the efficient use of a static dictionary many times.
     * 
     * <p>Rather than re-loading the dictionary buffer into a working context before each compression, or copying a pre-loaded dictionary's
     * {@code LZ4_streamHC_t} into a working {@code LZ4_streamHC_t}, this function introduces a no-copy setup mechanism, in which the working stream
     * references the dictionary stream in-place.</p>
     * 
     * <p>Several assumptions are made about the state of the dictionary stream. Currently, only streams which have been prepared by {@link #LZ4_loadDictHC loadDictHC} should be
     * expected to work.</p>
     * 
     * <p>Alternatively, the provided dictionary stream pointer may be {@code NULL}, in which case any existing dictionary stream is unset.</p>
     * 
     * <p>A dictionary should only be attached to a stream without any history (i.e., a stream that has just been reset).</p>
     * 
     * <p>The dictionary will remain attached to the working stream only for the current stream session. Calls to {@link #LZ4_resetStreamHC_fast resetStreamHC_fast} will remove the
     * dictionary context association from the working stream. The dictionary stream (and source buffer) must remain in-place / accessible / unchanged through
     * the lifetime of the stream session.</p>
     */
    public static void LZ4_attach_HC_dictionary(@NativeType("LZ4_streamHC_t *") long working_stream, @NativeType("LZ4_streamHC_t * const") long dictionary_stream) {
        if (CHECKS) {
            check(working_stream);
        }
        nLZ4_attach_HC_dictionary(working_stream, dictionary_stream);
    }

}