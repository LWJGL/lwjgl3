/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to <a target="_blank" href="http://lz4.github.io/lz4/">LZ4</a>, a lossless compression algorithm, providing compression speed at 400 MB/s per core,
 * scalable with multi-cores CPU. It features an extremely fast decoder, with speed in multiple GB/s per core, typically reaching RAM speed limits on
 * multi-core systems.
 * 
 * <p>Speed can be tuned dynamically, selecting an "acceleration" factor which trades compression ratio for more speed up. On the other end, a high
 * compression derivative, {@code LZ4_HC}, is also provided, trading CPU time for improved compression ratio. All versions feature the same decompression
 * speed.</p>
 * 
 * <p>The raw LZ4 block compression format is detailed within <a href="https://github.com/lz4/lz4/blob/dev/doc/lz4_Block_format.md">lz4_Block_format</a>.</p>
 * 
 * <p>To compress an arbitrarily long file or data stream, multiple blocks are required. Organizing these blocks and providing a common header format to
 * handle their content is the purpose of the Frame format, defined into
 * <a href="https://github.com/lz4/lz4/blob/dev/doc/lz4_Frame_format.md">lz4_Frame_format</a>. Interoperable versions of LZ4 must respect this frame
 * format.</p>
 */
public class LZ4 {

    /** Version number part. */
    public static final int
        LZ4_VERSION_MAJOR   = 1,
        LZ4_VERSION_MINOR   = 8,
        LZ4_VERSION_RELEASE = 2;

    /** Version number. */
    public static final int LZ4_VERSION_NUMBER = (LZ4_VERSION_MAJOR *100*100 + LZ4_VERSION_MINOR *100 + LZ4_VERSION_RELEASE);

    /** Version string. */
    public static final String LZ4_VERSION_STRING = LZ4_VERSION_MAJOR + "." + LZ4_VERSION_MINOR + "." + LZ4_VERSION_RELEASE;

    /** Maximum input size. */
    public static final int LZ4_MAX_INPUT_SIZE = 0x7E000000;

    /**
     * Memory usage formula : {@code N->2^N} Bytes (examples: {@code 10 -> 1KB; 12 -> 4KB ; 16 -> 64KB; 20 -> 1MB;} etc.)
     * 
     * <p>Increasing memory usage improves compression ratio. Reduced memory usage can improve speed, due to cache effect. Default value is 14, for 16KB, which
     * nicely fits into Intel x86 L1 cache.</p>
     */
    public static final int LZ4_MEMORY_USAGE = 14;

    public static final int LZ4_HASHLOG = (LZ4_MEMORY_USAGE - 2);

    public static final int LZ4_HASHTABLESIZE = (1 << LZ4_MEMORY_USAGE);

    public static final int LZ4_HASH_SIZE_U32 = (1 << LZ4_HASHLOG);

    public static final int LZ4_STREAMSIZE_U64 = ((1 << (LZ4_MEMORY_USAGE-3)) + 4);

    public static final int LZ4_STREAMSIZE = (LZ4_STREAMSIZE_U64 * Long.BYTES);

    public static final int LZ4_STREAMDECODESIZE_U64 = 4;

    public static final int LZ4_STREAMDECODESIZE = (LZ4_STREAMDECODESIZE_U64 * Long.BYTES);

    static { LibLZ4.initialize(); }

    protected LZ4() {
        throw new UnsupportedOperationException();
    }

    // --- [ LZ4_versionNumber ] ---

    /** Returns the version number. */
    public static native int LZ4_versionNumber();

    // --- [ LZ4_versionString ] ---

    /** Unsafe version of: {@link #LZ4_versionString versionString} */
    public static native long nLZ4_versionString();

    /** Returns the version string. */
    @NativeType("char const *")
    public static String LZ4_versionString() {
        long __result = nLZ4_versionString();
        return memASCII(__result);
    }

    // --- [ LZ4_compress_default ] ---

    /**
     * Unsafe version of: {@link #LZ4_compress_default compress_default}
     *
     * @param srcSize     max supported value is {@link #LZ4_MAX_INPUT_SIZE MAX_INPUT_SIZE}
     * @param dstCapacity size of buffer {@code dst} (which must be already allocated)
     */
    public static native int nLZ4_compress_default(long src, long dst, int srcSize, int dstCapacity);

    /**
     * Compresses {@code srcSize} bytes from buffer {@code src} into already allocated {@code dst} buffer of size {@code dstCapacity}.
     * 
     * <p>Compression is guaranteed to succeed if {@code dstCapacity} &ge; {@link #LZ4_compressBound compressBound}{@code (srcSize)}. It also runs faster, so it's a recommended setting.</p>
     * 
     * <p>If the function cannot compress {@code src} into a more limited {@code dst} budget, compression stops <i>immediately</i>, and the function result is
     * zero. As a consequence, {@code dst} content is not valid.</p>
     * 
     * <p>This function is protected against buffer overflow scenarios (never writes outside {@code dst} buffer, nor read outside {@code src} buffer).</p>
     *
     * @param src 
     * @param dst 
     *
     * @return the number of bytes written into buffer {@code dest} (necessarily &le; {@code maxOutputSize}) or 0 if compression fails
     */
    public static int LZ4_compress_default(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst) {
        return nLZ4_compress_default(memAddress(src), memAddress(dst), src.remaining(), dst.remaining());
    }

    // --- [ LZ4_decompress_safe ] ---

    /**
     * Unsafe version of: {@link #LZ4_decompress_safe decompress_safe}
     *
     * @param compressedSize is the exact complete size of the compressed block
     * @param dstCapacity    is the size of destination buffer, which must be already allocated
     */
    public static native int nLZ4_decompress_safe(long src, long dst, int compressedSize, int dstCapacity);

    /**
     * If destination buffer is not large enough, decoding will stop and output an error code (negative value).
     * 
     * <p>If the source stream is detected malformed, the function will stop decoding and return a negative result.</p>
     * 
     * <p>This function is protected against malicious data packets.</p>
     *
     * @param src 
     * @param dst 
     *
     * @return the number of bytes decompressed into destination buffer (necessarily &le; {@code dstCapacity})
     */
    public static int LZ4_decompress_safe(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst) {
        return nLZ4_decompress_safe(memAddress(src), memAddress(dst), src.remaining(), dst.remaining());
    }

    // --- [ LZ4_COMPRESSBOUND ] ---

    /**
     * See {@link #LZ4_compressBound compressBound}.
     *
     * @param isize 
     */
    public static int LZ4_COMPRESSBOUND(int isize) {
        return LZ4_MAX_INPUT_SIZE < isize ? 0 : isize + isize / 255 + 16;
    }

    // --- [ LZ4_compressBound ] ---

    /**
     * Provides the maximum size that LZ4 compression may output in a "worst case" scenario (input data not compressible).
     * 
     * <p>This function is primarily useful for memory allocation purposes (destination buffer size). Macro {@link #LZ4_COMPRESSBOUND COMPRESSBOUND} is also provided for
     * compilation-time evaluation (stack memory allocation for example).</p>
     * 
     * <p>Note that {@link #LZ4_compress_default compress_default} compresses faster when {@code dstCapacity} is &ge; {@link #LZ4_compressBound compressBound}{@code (srcSize)}</p>
     *
     * @param inputSize max supported value is {@link #LZ4_MAX_INPUT_SIZE MAX_INPUT_SIZE}
     *
     * @return maximum output size in a "worst case" scenario or 0, if input size is incorrect (too large or negative)
     */
    public static native int LZ4_compressBound(int inputSize);

    // --- [ LZ4_compress_fast ] ---

    /** Unsafe version of: {@link #LZ4_compress_fast compress_fast} */
    public static native int nLZ4_compress_fast(long src, long dst, int srcSize, int dstCapacity, int acceleration);

    /**
     * Same as {@link #LZ4_compress_default compress_default}, but allows selection of "acceleration" factor.
     * 
     * <p>The larger the acceleration value, the faster the algorithm, but also the lesser the compression. It's a trade-off. It can be fine tuned, with each
     * successive value providing roughly +~3% to speed. An acceleration value of "1" is the same as regular {@link #LZ4_compress_default compress_default}. Values &le; 0 will be
     * replaced by {@code ACCELERATION_DEFAULT} (currently == 1, see lz4.c).</p>
     *
     * @param src          
     * @param dst          
     * @param acceleration 
     */
    public static int LZ4_compress_fast(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int acceleration) {
        return nLZ4_compress_fast(memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), acceleration);
    }

    // --- [ LZ4_sizeofState ] ---

    public static native int LZ4_sizeofState();

    // --- [ LZ4_compress_fast_extState ] ---

    /** Unsafe version of: {@link #LZ4_compress_fast_extState compress_fast_extState} */
    public static native int nLZ4_compress_fast_extState(long state, long src, long dst, int srcSize, int dstCapacity, int acceleration);

    /**
     * Same as {@link #LZ4_compress_fast compress_fast}, just using an externally allocated memory space to store compression state.
     * 
     * <p>Use {@link #LZ4_sizeofState sizeofState} to know how much memory must be allocated, and allocate it on 8-bytes boundaries (using {@code malloc()} typically). Then, provide
     * it as {@code void* state} to compression function.</p>
     *
     * @param state        
     * @param src          
     * @param dst          
     * @param acceleration 
     */
    public static int LZ4_compress_fast_extState(@NativeType("void *") ByteBuffer state, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int acceleration) {
        return nLZ4_compress_fast_extState(memAddress(state), memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), acceleration);
    }

    // --- [ LZ4_compress_destSize ] ---

    /**
     * Unsafe version of: {@link #LZ4_compress_destSize compress_destSize}
     *
     * @param srcSizePtr will be modified to indicate how many bytes where read from {@code source} to fill {@code dest}. New value is necessarily &le; old value.
     */
    public static native int nLZ4_compress_destSize(long src, long dst, long srcSizePtr, int targetDstSize);

    /**
     * Reverse the logic: compresses as much data as possible from {@code src} buffer into already allocated buffer {@code dst} of size
     * {@code targetDstSize}.
     * 
     * <p>This function either compresses the entire {@code src} content into {@code dst} if it's large enough, or fill {@code dst} buffer completely with as
     * much data as possible from {@code src}.</p>
     *
     * @param src        
     * @param dst        
     * @param srcSizePtr will be modified to indicate how many bytes where read from {@code source} to fill {@code dest}. New value is necessarily &le; old value.
     *
     * @return nb bytes written into {@code dest} (necessarily &le; {@code targetDestSize}) or 0 if compression fails
     */
    public static int LZ4_compress_destSize(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, @NativeType("int *") IntBuffer srcSizePtr) {
        if (CHECKS) {
            check(srcSizePtr, 1);
            check(src, srcSizePtr.get(srcSizePtr.position()));
        }
        return nLZ4_compress_destSize(memAddress(src), memAddress(dst), memAddress(srcSizePtr), dst.remaining());
    }

    // --- [ LZ4_decompress_fast ] ---

    /**
     * Unsafe version of: {@link #LZ4_decompress_fast decompress_fast}
     *
     * @param originalSize is the uncompressed size to regenerate. Destination buffer must be already allocated, and its size must be &ge; {@code originalSize} bytes.
     */
    public static native int nLZ4_decompress_fast(long src, long dst, int originalSize);

    /**
     * This function is a bit faster than {@link #LZ4_decompress_safe decompress_safe}, but doesn't provide any security guarantee.
     * 
     * <p>This function respects memory boundaries for <i>properly formed</i> compressed data. However, it does not provide any protection against malicious
     * input. It also doesn't know {@code src} size, and implies it's &ge; compressed size. Use this function in trusted environment <b>only</b>.</p>
     *
     * @param src 
     * @param dst 
     *
     * @return the number of bytes read from the source buffer (== the compressed size). If the source stream is detected malformed, the function stops decoding and
     *         return a negative result. Destination buffer must be already allocated. Its size must be &ge; {@code originalSize} bytes.
     */
    public static int LZ4_decompress_fast(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst) {
        return nLZ4_decompress_fast(memAddress(src), memAddress(dst), dst.remaining());
    }

    // --- [ LZ4_decompress_safe_partial ] ---

    /** Unsafe version of: {@link #LZ4_decompress_safe_partial decompress_safe_partial} */
    public static native int nLZ4_decompress_safe_partial(long src, long dst, int compressedSize, int targetOutputSize, int dstCapacity);

    /**
     * This function decompress a compressed block of size {@code compressedSize} at position {@code src} into destination buffer {@code dst} of size
     * {@code dstCapacity}.
     * 
     * <p>The function will decompress a minimum of {@code targetOutputSize} bytes, and stop after that. However, it's not accurate, and may write more than
     * {@code targetOutputSize} (but always &le; {@code dstCapacity}).</p>
     * 
     * <p>This function never writes outside of output buffer, and never reads outside of input buffer. It is therefore protected against malicious data packets.</p>
     *
     * @param src              
     * @param dst              
     * @param targetOutputSize 
     *
     * @return the number of bytes decoded in the destination buffer (necessarily &le; {@code dstCapacity})
     *         
     *         <p>Note: this number can also be &lt; {@code targetOutputSize}, if compressed block contains less data. Therefore, always control how many bytes were
     *         decoded. If source stream is detected malformed, function returns a negative result. This function is protected against malicious data packets.</p>
     */
    public static int LZ4_decompress_safe_partial(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int targetOutputSize) {
        return nLZ4_decompress_safe_partial(memAddress(src), memAddress(dst), src.remaining(), targetOutputSize, dst.remaining());
    }

    // --- [ LZ4_createStream ] ---

    /** Allocates and initializes an {@code LZ4_stream_t} structure. */
    @NativeType("LZ4_stream_t *")
    public static native long LZ4_createStream();

    // --- [ LZ4_freeStream ] ---

    /** Unsafe version of: {@link #LZ4_freeStream freeStream} */
    public static native int nLZ4_freeStream(long streamPtr);

    /**
     * Releases memory of an {@code LZ4_stream_t} structure.
     *
     * @param streamPtr 
     */
    public static int LZ4_freeStream(@NativeType("LZ4_stream_t *") long streamPtr) {
        if (CHECKS) {
            check(streamPtr);
        }
        return nLZ4_freeStream(streamPtr);
    }

    // --- [ LZ4_resetStream ] ---

    /** Unsafe version of: {@link #LZ4_resetStream resetStream} */
    public static native void nLZ4_resetStream(long streamPtr);

    /**
     * An {@code LZ4_stream_t} structure can be allocated once and re-used multiple times. Use this function to start compressing a new stream.
     *
     * @param streamPtr 
     */
    public static void LZ4_resetStream(@NativeType("LZ4_stream_t *") long streamPtr) {
        if (CHECKS) {
            check(streamPtr);
        }
        nLZ4_resetStream(streamPtr);
    }

    // --- [ LZ4_loadDict ] ---

    /** Unsafe version of: {@link #LZ4_loadDict loadDict} */
    public static native int nLZ4_loadDict(long streamPtr, long dictionary, int dictSize);

    /**
     * Use this function to load a static dictionary into {@code LZ4_stream_t}.
     * 
     * <p>Any previous data will be forgotten, only {@code dictionary} will remain in memory. Loading a size of 0 is allowed, and is the same as reset.</p>
     *
     * @param streamPtr  
     * @param dictionary 
     */
    public static int LZ4_loadDict(@NativeType("LZ4_stream_t *") long streamPtr, @Nullable @NativeType("char const *") ByteBuffer dictionary) {
        if (CHECKS) {
            check(streamPtr);
        }
        return nLZ4_loadDict(streamPtr, memAddressSafe(dictionary), remainingSafe(dictionary));
    }

    // --- [ LZ4_compress_fast_continue ] ---

    /** Unsafe version of: {@link #LZ4_compress_fast_continue compress_fast_continue} */
    public static native int nLZ4_compress_fast_continue(long streamPtr, long src, long dst, int srcSize, int dstCapacity, int acceleration);

    /**
     * Compress {@code src} content using data from previously compressed blocks, for better compression ratio.
     * 
     * <p>{@code dst} buffer must be already allocated. If {@code dstCapacity} &ge; {@link #LZ4_compressBound compressBound}{@code (srcSize)}, compression is guaranteed to succeed, and
     * runs faster.</p>
     * 
     * <p>Important: The previous 64KB of compressed data is assumed to remain present and unmodified in memory! If less than 64KB has been compressed all the
     * data must be present.</p>
     * 
     * <p>Special:</p>
     * 
     * <ol>
     * <li>When input is a double-buffer, they can have any size, including &lt; 64 KB. Make sure that buffers are separated by at least one byte. This way,
     * each block only depends on previous block.</li>
     * <li>If input buffer is a ring-buffer, it can have any size, including &lt; 64 KB.</li>
     * </ol>
     *
     * @param streamPtr    
     * @param src          
     * @param dst          
     * @param acceleration 
     *
     * @return size of compressed block or 0 if there is an error (typically, cannot fit into {@code dst}). After an error, the stream status is invalid, it can only
     *         be reset or freed.
     */
    public static int LZ4_compress_fast_continue(@NativeType("LZ4_stream_t *") long streamPtr, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int acceleration) {
        if (CHECKS) {
            check(streamPtr);
        }
        return nLZ4_compress_fast_continue(streamPtr, memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), acceleration);
    }

    // --- [ LZ4_saveDict ] ---

    /** Unsafe version of: {@link #LZ4_saveDict saveDict} */
    public static native int nLZ4_saveDict(long streamPtr, long safeBuffer, int maxDictSize);

    /**
     * If last 64KB data cannot be guaranteed to remain available at its current memory location, save it into a safer place ({@code char* safeBuffer}).
     * 
     * <p>This is schematically equivalent to a {@code memcpy()} followed by {@link #LZ4_loadDict loadDict}, but is much faster, because {@code LZ4_saveDict()} doesn't need to
     * rebuild tables.</p>
     *
     * @param streamPtr  
     * @param safeBuffer 
     *
     * @return saved dictionary size in bytes (necessarily &le; {@code maxDictSize}), or 0 if error
     */
    public static int LZ4_saveDict(@NativeType("LZ4_stream_t *") long streamPtr, @NativeType("char *") ByteBuffer safeBuffer) {
        if (CHECKS) {
            check(streamPtr);
        }
        return nLZ4_saveDict(streamPtr, memAddress(safeBuffer), safeBuffer.remaining());
    }

    // --- [ LZ4_createStreamDecode ] ---

    /**
     * Creates a streaming decompression tracking structure.
     * 
     * <p>A tracking structure can be re-used multiple times sequentially.</p>
     */
    @NativeType("LZ4_streamDecode_t *")
    public static native long LZ4_createStreamDecode();

    // --- [ LZ4_freeStreamDecode ] ---

    /** Unsafe version of: {@link #LZ4_freeStreamDecode freeStreamDecode} */
    public static native int nLZ4_freeStreamDecode(long LZ4_stream);

    /**
     * Frees a streaming decompression tracking structure.
     *
     * @param LZ4_stream 
     */
    public static int LZ4_freeStreamDecode(@NativeType("LZ4_streamDecode_t *") long LZ4_stream) {
        if (CHECKS) {
            check(LZ4_stream);
        }
        return nLZ4_freeStreamDecode(LZ4_stream);
    }

    // --- [ LZ4_setStreamDecode ] ---

    /** Unsafe version of: {@link #LZ4_setStreamDecode setStreamDecode} */
    public static native int nLZ4_setStreamDecode(long LZ4_streamDecode, long dictionary, int dictSize);

    /**
     * An {@code LZ4_streamDecode_t} structure can be allocated once and re-used multiple times. Use this function to start decompression of a new stream of
     * blocks.
     * 
     * <p>A dictionary can optionnally be set. Use {@code NULL} or size 0 for a reset order.</p>
     *
     * @param LZ4_streamDecode 
     * @param dictionary       
     *
     * @return 1 if OK, 0 if error
     */
    @NativeType("int")
    public static boolean LZ4_setStreamDecode(@NativeType("LZ4_streamDecode_t *") long LZ4_streamDecode, @NativeType("char const *") ByteBuffer dictionary) {
        if (CHECKS) {
            check(LZ4_streamDecode);
        }
        return nLZ4_setStreamDecode(LZ4_streamDecode, memAddress(dictionary), dictionary.remaining()) != 0;
    }

    // --- [ LZ4_decompress_safe_continue ] ---

    /** Unsafe version of: {@link #LZ4_decompress_safe_continue decompress_safe_continue} */
    public static native int nLZ4_decompress_safe_continue(long LZ4_streamDecode, long src, long dst, int srcSize, int dstCapacity);

    /**
     * These decoding functions allow decompression of consecutive blocks in "streaming" mode.
     * 
     * <p>A block is an unsplittable entity, it must be presented entirely to a decompression function. Decompression functions only accept one block at a time.
     * The last 64KB of previously decoded data <i>must</i> remain available and unmodified at the memory position where they were decoded. If less than 64KB
     * of data has been decoded all the data must be present.</p>
     * 
     * <p>Special: if application sets a ring buffer for decompression, it must respect one of the following conditions:</p>
     * 
     * <ul>
     * <li>Exactly same size as encoding buffer, with same update rule (block boundaries at same positions) In which case, the decoding &amp; encoding ring
     * buffer can have any size, including very small ones ( &lt; 64 KB).</li>
     * <li>Larger than encoding buffer, by a minimum of {@code maxBlockSize} more bytes.
     * 
     * <p>{@code maxBlockSize} is implementation dependent. It's the maximum size of any single block. In which case, encoding and decoding buffers do not
     * need to be synchronized, and encoding ring buffer can have any size, including small ones ( &lt; 64 KB).</p></li>
     * <li><i>At least</i> {@code 64 KB + 8 bytes + maxBlockSize}.
     * 
     * <p>In which case, encoding and decoding buffers do not need to be synchronized, and encoding ring buffer can have any size, including larger than
     * decoding buffer.</p></li>
     * </ul>
     * 
     * <p>Whenever these conditions are not possible, save the last 64KB of decoded data into a safe buffer, and indicate where it is saved using
     * {@link #LZ4_setStreamDecode setStreamDecode} before decompressing next block.</p>
     *
     * @param LZ4_streamDecode 
     * @param src              
     * @param dst              
     */
    public static int LZ4_decompress_safe_continue(@NativeType("LZ4_streamDecode_t *") long LZ4_streamDecode, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst) {
        if (CHECKS) {
            check(LZ4_streamDecode);
        }
        return nLZ4_decompress_safe_continue(LZ4_streamDecode, memAddress(src), memAddress(dst), src.remaining(), dst.remaining());
    }

    // --- [ LZ4_decompress_fast_continue ] ---

    /** Unsafe version of: {@link #LZ4_decompress_fast_continue decompress_fast_continue} */
    public static native int nLZ4_decompress_fast_continue(long LZ4_streamDecode, long src, long dst, int originalSize);

    /**
     * See {@link #LZ4_decompress_safe_continue decompress_safe_continue}.
     *
     * @param LZ4_streamDecode 
     * @param src              
     * @param dst              
     */
    public static int LZ4_decompress_fast_continue(@NativeType("LZ4_streamDecode_t *") long LZ4_streamDecode, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst) {
        if (CHECKS) {
            check(LZ4_streamDecode);
        }
        return nLZ4_decompress_fast_continue(LZ4_streamDecode, memAddress(src), memAddress(dst), dst.remaining());
    }

    // --- [ LZ4_decompress_safe_usingDict ] ---

    /** Unsafe version of: {@link #LZ4_decompress_safe_usingDict decompress_safe_usingDict} */
    public static native int nLZ4_decompress_safe_usingDict(long src, long dst, int srcSize, int dstCapacity, long dictStart, int dictSize);

    /**
     * These decoding functions work the same as a combination of {@link #LZ4_setStreamDecode setStreamDecode} followed by {@code LZ4_decompress_*_continue()}. They are stand-alone,
     * and don't need an {@code LZ4_streamDecode_t} structure.
     *
     * @param src       
     * @param dst       
     * @param dictStart 
     */
    public static int LZ4_decompress_safe_usingDict(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, @NativeType("char const *") ByteBuffer dictStart) {
        return nLZ4_decompress_safe_usingDict(memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), memAddress(dictStart), dictStart.remaining());
    }

    // --- [ LZ4_decompress_fast_usingDict ] ---

    /** Unsafe version of: {@link #LZ4_decompress_fast_usingDict decompress_fast_usingDict} */
    public static native int nLZ4_decompress_fast_usingDict(long src, long dst, int originalSize, long dictStart, int dictSize);

    /**
     * See {@code decompress_safe_usingDict}.
     *
     * @param src       
     * @param dst       
     * @param dictStart 
     */
    public static int LZ4_decompress_fast_usingDict(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, @NativeType("char const *") ByteBuffer dictStart) {
        return nLZ4_decompress_fast_usingDict(memAddress(src), memAddress(dst), dst.remaining(), memAddress(dictStart), dictStart.remaining());
    }

    // --- [ LZ4_resetStream_fast ] ---

    /** Unsafe version of: {@link #LZ4_resetStream_fast resetStream_fast} */
    public static native void nLZ4_resetStream_fast(long streamPtr);

    /**
     * When an {@code LZ4_stream_t} is known to be in a internally coherent state, it can often be prepared for a new compression with almost no work, only
     * sometimes falling back to the full, expensive reset that is always required when the stream is in an indeterminate state (i.e., the reset performed b
     * {@link #LZ4_resetStream resetStream}).
     * 
     * <p>{@code LZ4_streams} are guaranteed to be in a valid state when:</p>
     * 
     * <ul>
     * <li>returned from {@link #LZ4_createStream createStream}</li>
     * <li>reset by {@link #LZ4_resetStream resetStream}</li>
     * <li>{@code memset(stream, 0, sizeof(LZ4_stream_t))}</li>
     * <li>the stream was in a valid state and was reset by {@link #LZ4_resetStream_fast resetStream_fast}</li>
     * <li>the stream was in a valid state and was then used in any compression call that returned success</li>
     * <li>the stream was in an indeterminate state and was used in a compression call that fully reset the state ({@link #LZ4_compress_fast_extState compress_fast_extState}) and that
     * returned success</li>
     * </ul>
     *
     * @param streamPtr 
     */
    public static void LZ4_resetStream_fast(@NativeType("LZ4_stream_t *") long streamPtr) {
        if (CHECKS) {
            check(streamPtr);
        }
        nLZ4_resetStream_fast(streamPtr);
    }

    // --- [ LZ4_compress_fast_extState_fastReset ] ---

    /** Unsafe version of: {@link #LZ4_compress_fast_extState_fastReset compress_fast_extState_fastReset} */
    public static native int nLZ4_compress_fast_extState_fastReset(long state, long src, long dst, int srcSize, int dstCapacity, int acceleration);

    /**
     * A variant of {@link #LZ4_compress_fast_extState compress_fast_extState}.
     * 
     * <p>Using this variant avoids an expensive initialization step. It is only safe to call if the state buffer is known to be correctly initialized already
     * (see above comment on {@link #LZ4_resetStream_fast resetStream_fast} for a definition of "correctly initialized"). From a high level, the difference is that this function
     * initializes the provided state with a call to {@link #LZ4_resetStream_fast resetStream_fast} while {@link #LZ4_compress_fast_extState compress_fast_extState} starts with a call to {@link #LZ4_resetStream resetStream}.</p>
     *
     * @param state        
     * @param src          
     * @param dst          
     * @param acceleration 
     */
    public static int LZ4_compress_fast_extState_fastReset(@NativeType("void *") ByteBuffer state, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int acceleration) {
        return nLZ4_compress_fast_extState_fastReset(memAddress(state), memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), acceleration);
    }

    // --- [ LZ4_attach_dictionary ] ---

    /** Unsafe version of: {@link #LZ4_attach_dictionary attach_dictionary} */
    public static native void nLZ4_attach_dictionary(long working_stream, long dictionary_stream);

    /**
     * This is an experimental API that allows for the efficient use of a static dictionary many times.
     * 
     * <p>Rather than re-loading the dictionary buffer into a working context before each compression, or copying a pre-loaded dictionary's {@code LZ4_stream_t}
     * into a working {@code LZ4_stream_t}, this function introduces a no-copy setup mechanism, in which the working stream references the dictionary stream
     * in-place.</p>
     * 
     * <p>Several assumptions are made about the state of the dictionary stream. Currently, only streams which have been prepared by {@link #LZ4_loadDict loadDict} should be
     * expected to work.</p>
     * 
     * <p>Alternatively, the provided dictionary stream pointer may be {@code NULL}, in which case any existing dictionary stream is unset.</p>
     * 
     * <p>If a dictionary is provided, it replaces any pre-existing stream history. The dictionary contents are the only history that can be referenced and
     * logically immediately precede the data compressed in the first subsequent compression call.</p>
     * 
     * <p>The dictionary will only remain attached to the working stream through the first compression call, at the end of which it is cleared. The dictionary
     * stream (and source buffer) must remain in-place / accessible / unchanged through the completion of the first compression call on the stream.</p>
     *
     * @param working_stream    
     * @param dictionary_stream 
     */
    public static void LZ4_attach_dictionary(@NativeType("LZ4_stream_t *") long working_stream, @NativeType("LZ4_stream_t const *") long dictionary_stream) {
        if (CHECKS) {
            check(working_stream);
        }
        nLZ4_attach_dictionary(working_stream, dictionary_stream);
    }

}