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
 * Native bindings to <a target="_blank" href="http://lz4.github.io/lz4/">LZ4</a>, a lossless compression algorithm, providing compression speed &gt; 500 MB/s per core,
 * scalable with multi-cores CPU. It features an extremely fast decoder, with speed in multiple GB/s per core, typically reaching RAM speed limits on
 * multi-core systems.
 * 
 * <p>Speed can be tuned dynamically, selecting an "acceleration" factor which trades compression ratio for faster speed. On the other end, a high
 * compression derivative, {@code LZ4_HC}, is also provided, trading CPU time for improved compression ratio. All versions feature the same decompression
 * speed.</p>
 * 
 * <p>LZ4 is also compatible with <a target="_blank" href="https://github.com/facebook/zstd#the-case-for-small-data-compression">dictionary compression</a>, and can ingest
 * any input file as dictionary, including those created by <a target="_blank" href="https://github.com/facebook/zstd/blob/v1.3.5/programs/zstd.1.md#dictionary-builder">Zstandard Dictionary Builder</a>. (note: only the final 64KB are used).</p>
 * 
 * <p>The raw LZ4 block compression format is detailed within <a href="https://github.com/lz4/lz4/blob/dev/doc/lz4_Block_format.md">lz4_Block_format</a>.</p>
 * 
 * <p>Arbitrarily long files or data streams are compressed using multiple blocks, for streaming requirements. These blocks are organized into a frame,
 * defined into <a target="_blank" href="https://github.com/lz4/lz4/blob/dev/doc/lz4_Frame_format.md">lz4_Frame_format</a>. Interoperable versions of LZ4 must also respect
 * the frame format.</p>
 * 
 * <h3>In-place compression and decompression</h3>
 * 
 * <p>It's possible to have input and output sharing the same buffer, for highly contrained memory environments. In both cases, it requires input to lay at
 * the end of the buffer, and decompression to start at beginning of the buffer. Buffer size must feature some margin, hence be larger than final size.</p>
 * 
 * <pre><code>
 * |&lt;------------------------buffer---------------------------------&gt;|
 *                             |&lt;-----------compressed data---------&gt;|
 * |&lt;-----------decompressed size------------------&gt;|
 *                                                  |&lt;----margin----&gt;|</code></pre>
 * 
 * <p>This technique is more useful for decompression, since decompressed size is typically larger, and margin is short.</p>
 * 
 * <p>In-place decompression will work inside any buffer which size is &ge; {@code LZ4_DECOMPRESS_INPLACE_BUFFER_SIZE(decompressedSize)}. This presumes that
 * {@code decompressedSize} &gt; {@code compressedSize}. Otherwise, it means compression actually expanded data, and it would be more efficient to store
 * such data with a flag indicating it's not compressed. This can happen when data is not compressible (already compressed, or encrypted).</p>
 * 
 * <p>For in-place compression, margin is larger, as it must be able to cope with both history preservation, requiring input data to remain unmodified up to
 * {@link #LZ4_DISTANCE_MAX DISTANCE_MAX}, and data expansion, which can happen when input is not compressible. As a consequence, buffer size requirements are much higher, and
 * memory savings offered by in-place compression are more limited.</p>
 * 
 * <p>There are ways to limit this cost for compression:</p>
 * 
 * <ul>
 * <li>Reduce history size, by modifying {@code LZ4_DISTANCE_MAX}. Note that it is a compile-time constant, so all compressions will apply this limit.
 * Lower values will reduce compression ratio, except when input_size &lt; {@code LZ4_DISTANCE_MAX}, so it's a reasonable trick when inputs are known
 * to be small.</li>
 * <li>Require the compressor to deliver a "maximum compressed size". This is the {@code dstCapacity} parameter in {@code LZ4_compress*()}. When this size
 * is &lt; {@code LZ4_COMPRESSBOUND(inputSize)}, then compression can fail, in which case, the return code will be 0 (zero). The caller must be ready
 * for these cases to happen, and typically design a backup scheme to send data uncompressed.</li>
 * </ul>
 * 
 * <p>The combination of both techniques can significantly reduce the amount of margin required for in-place compression.</p>
 * 
 * <p>In-place compression can work in any buffer which size is &ge; {@code (maxCompressedSize)} with {@code maxCompressedSize == LZ4_COMPRESSBOUND(srcSize)}
 * for guaranteed compression success. {@link #LZ4_COMPRESS_INPLACE_BUFFER_SIZE COMPRESS_INPLACE_BUFFER_SIZE} depends on both {@code maxCompressedSize} and {@code LZ4_DISTANCE_MAX}, so it's
 * possible to reduce memory requirements by playing with them.</p>
 */
public class LZ4 {

    static { LibLZ4.initialize(); }

    /** Version number part. */
    public static final int
        LZ4_VERSION_MAJOR   = 1,
        LZ4_VERSION_MINOR   = 9,
        LZ4_VERSION_RELEASE = 3;

    /** Version number. */
    public static final int LZ4_VERSION_NUMBER = (LZ4_VERSION_MAJOR *100*100 + LZ4_VERSION_MINOR *100 + LZ4_VERSION_RELEASE);

    /** Version string. */
    public static final String LZ4_VERSION_STRING = LZ4_VERSION_MAJOR + "." + LZ4_VERSION_MINOR + "." + LZ4_VERSION_RELEASE;

    /** Maximum input size. */
    public static final int LZ4_MAX_INPUT_SIZE = 0x7E000000;

    /**
     * Memory usage formula : {@code N->2^N} Bytes (examples: {@code 10 -> 1KB; 12 -> 4KB ; 16 -> 64KB; 20 -> 1MB;} etc.)
     * 
     * <p>Increasing memory usage improves compression ratio. Reduced memory usage may improve speed, thanks to better cache locality. Default value is 14, for
     * 16KB, which nicely fits into Intel x86 L1 cache.</p>
     */
    public static final int LZ4_MEMORY_USAGE = 14;

    public static final int LZ4_HASHLOG = (LZ4_MEMORY_USAGE - 2);

    public static final int LZ4_HASHTABLESIZE = (1 << LZ4_MEMORY_USAGE);

    public static final int LZ4_HASH_SIZE_U32 = (1 << LZ4_HASHLOG);

    public static final int LZ4_STREAMSIZE = 16416;

    public static final int LZ4_STREAMSIZE_VOIDP = LZ4_STREAMSIZE / Pointer.POINTER_SIZE;

    public static final int LZ4_STREAMDECODESIZE_U64 = 4 + (Pointer.POINTER_SIZE == 16 ? 2 : 0);

    public static final int LZ4_STREAMDECODESIZE = (LZ4_STREAMDECODESIZE_U64 * Long.BYTES);

    /** History window size; can be user-defined at compile time. */
    public static final int LZ4_DISTANCE_MAX = 64;

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
     * zero. In which case, {@code dst} content is undefined (invalid).</p>
     * 
     * <p>This function is protected against buffer overflow scenarios (never writes outside {@code dst} buffer, nor read outside {@code src} buffer).</p>
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
     * @param dstCapacity    is the size of destination buffer (which must be already allocated), presumed an upper bound of decompressed size
     */
    public static native int nLZ4_decompress_safe(long src, long dst, int compressedSize, int dstCapacity);

    /**
     * If destination buffer is not large enough, decoding will stop and output an error code (negative value).
     * 
     * <p>If the source stream is detected malformed, the function will stop decoding and return a negative result.</p>
     * 
     * <p>Note 1: This function is protected against malicious data packets: it will never write outside {@code dst} buffer, nor read outside {@code source}
     * buffer, even if the compressed block is maliciously modified to order the decoder to do these actions. In such case, the decoder stops immediately, and
     * considers the compressed block malformed.</p>
     * 
     * <p>Note 2: {@code compressedSize} and {@code dstCapacity} must be provided to the function, the compressed block does not contain them. The implementation
     * is free to send / store / derive this information in whichever way is most beneficial. If there is a need for a different format which bundles together
     * both compressed data and its metadata, consider looking at {@code lz4frame.h} instead.</p>
     *
     * @return the number of bytes decompressed into destination buffer (necessarily &le; {@code dstCapacity})
     */
    public static int LZ4_decompress_safe(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst) {
        return nLZ4_decompress_safe(memAddress(src), memAddress(dst), src.remaining(), dst.remaining());
    }

    // --- [ LZ4_COMPRESSBOUND ] ---

    /** See {@link #LZ4_compressBound compressBound}. */
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
     * replaced by {@code LZ4_ACCELERATION_DEFAULT} (currently == 1, see lz4.c). Values &gt; {@code LZ4_ACCELERATION_MAX} will be replaced by
     * {@code LZ4_ACCELERATION_MAX} (currently {@code == 65537}, see lz4.c).</p>
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
     * Same as {@link #LZ4_compress_fast compress_fast}, using an externally allocated memory space for its state.
     * 
     * <p>Use {@link #LZ4_sizeofState sizeofState} to know how much memory must be allocated, and allocate it on 8-bytes boundaries (using {@code malloc()} typically). Then, provide
     * it as {@code void* state} to compression function.</p>
     */
    public static int LZ4_compress_fast_extState(@NativeType("void *") ByteBuffer state, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int acceleration) {
        return nLZ4_compress_fast_extState(memAddress(state), memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), acceleration);
    }

    // --- [ LZ4_compress_destSize ] ---

    /**
     * Unsafe version of: {@link #LZ4_compress_destSize compress_destSize}
     *
     * @param srcSizePtr will be modified to indicate how many bytes where read from {@code source} to fill {@code dest}. New value is necessarily &le; input value.
     */
    public static native int nLZ4_compress_destSize(long src, long dst, long srcSizePtr, int targetDstSize);

    /**
     * Reverse the logic: compresses as much data as possible from {@code src} buffer into already allocated buffer {@code dst} of size
     * {@code targetDstSize}.
     * 
     * <p>This function either compresses the entire {@code src} content into {@code dst} if it's large enough, or fill {@code dst} buffer completely with as
     * much data as possible from {@code src}. Note: acceleration parameter is fixed to {@code "default"}.</p>
     *
     * @param srcSizePtr will be modified to indicate how many bytes where read from {@code source} to fill {@code dest}. New value is necessarily &le; input value.
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

    // --- [ LZ4_decompress_safe_partial ] ---

    /** Unsafe version of: {@link #LZ4_decompress_safe_partial decompress_safe_partial} */
    public static native int nLZ4_decompress_safe_partial(long src, long dst, int compressedSize, int targetOutputSize, int dstCapacity);

    /**
     * Decompresses an LZ4 compressed block, of size {@code srcSize} at position {@code src}, into destination buffer {@code dst} of size {@code dstCapacity}.
     * 
     * <p>Up to {@code targetOutputSize} bytes will be decoded. The function stops decoding on reaching this objective. This can be useful to boost performance
     * whenever only the beginning of a block is required.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ol>
     * <li>result can be &lt; {@code targetOutputSize}, if compressed block contains less data.</li>
     * <li>{@code targetOutputSize} must be &le; {@code dstCapacity}</li>
     * <li>this function effectively stops decoding on reaching {@code targetOutputSize}, so {@code dstCapacity} is kind of redundant. This is because in
     * older versions of this function, decoding operation would still write complete sequences. Therefore, there was no guarantee that it would stop
     * writing at exactly {@code targetOutputSize}, it could write more bytes, though only up to {@code dstCapacity}. Some "margin" used to be required
     * for this operation to work properly. Thankfully, this is no longer necessary. The function nonetheless keeps the same signature, in an effort to
     * preserve API compatibility.</li>
     * <li>if {@code srcSize} is the exact size of the block, then {@code targetOutputSize} can be any value, including larger than the block's decompressed
     * size. The function will, at most, generate block's decompressed size.</li>
     * <li>if {@code srcSize} is <em>larger</em> than block's compressed size, then {@code targetOutputSize} <b>MUST</b> be &le; block's decompressed size.
     * Otherwise, <em>silent corruption will occur</em>.</li>
     * </ol>
     *
     * @return the number of bytes decoded in {@code dst} (necessarily &le; {@code targetOutputSize}). If source stream is detected malformed, function returns a
     *         negative result.
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

    /** Releases memory of an {@code LZ4_stream_t} structure. */
    public static int LZ4_freeStream(@NativeType("LZ4_stream_t *") long streamPtr) {
        if (CHECKS) {
            check(streamPtr);
        }
        return nLZ4_freeStream(streamPtr);
    }

    // --- [ LZ4_resetStream_fast ] ---

    /** Unsafe version of: {@link #LZ4_resetStream_fast resetStream_fast} */
    public static native void nLZ4_resetStream_fast(long streamPtr);

    /**
     * Use this to prepare an {@code LZ4_stream_t} for a new chain of dependent blocks (e.g., {@link #LZ4_compress_fast_continue compress_fast_continue}).
     * 
     * <p>An {@code LZ4_stream_t} must be initialized once before usage. This is automatically done when created by {@link #LZ4_createStream createStream}. However, should the
     * {@code LZ4_stream_t} be simply declared on stack (for example), it's necessary to initialize it first, using {@link #LZ4_initStream initStream}.</p>
     * 
     * <p>After init, start any new stream with {@code LZ4_resetStream_fast()}. A same {@code LZ4_stream_t} can be re-used multiple times consecutively and
     * compress multiple streams, provided that it starts each new stream with {@code LZ4_resetStream_fast()}.</p>
     * 
     * <p>{@code LZ4_resetStream_fast()} is much faster than {@code LZ4_initStream()}, but is not compatible with memory regions containing garbage data.</p>
     * 
     * <p>Note: it's only useful to call {@code LZ4_resetStream_fast()} in the context of streaming compression. The {@code extState} functions perform their own
     * resets. Invoking {@code LZ4_resetStream_fast()} before is redundant, and even counterproductive.</p>
     *
     * @since version 1.9.0
     */
    public static void LZ4_resetStream_fast(@NativeType("LZ4_stream_t *") long streamPtr) {
        if (CHECKS) {
            check(streamPtr);
        }
        nLZ4_resetStream_fast(streamPtr);
    }

    // --- [ LZ4_loadDict ] ---

    /** Unsafe version of: {@link #LZ4_loadDict loadDict} */
    public static native int nLZ4_loadDict(long streamPtr, long dictionary, int dictSize);

    /**
     * Use this function to reference a static dictionary into {@code LZ4_stream_t}.
     * 
     * <p>The dictionary must remain available during compression. {@code LZ4_loadDict()} triggers a reset, so any previous data will be forgotten. The same
     * dictionary will have to be loaded on decompression side for successful decoding. Dictionarys are useful for better compression of small data (KB
     * range). While LZ4 accepts any input as dictionary, results are generally better when using Zstandard's Dictionary Builder. Loading a size of 0 is
     * allowed, and is the same as reset.</p>
     *
     * @return loaded dictionary size, in bytes (necessarily &le; 64 KB)
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
     * <p>Note 1: Each invocation to {@code LZ4_compress_fast_continue()} generates a new block. Each block has precise boundaries. Each block must be
     * decompressed separately, calling {@code LZ4_decompress_*()} with relevant metadata. It's not possible to append blocks together and expect a single
     * invocation of {@code LZ4_decompress_*()} to decompress them together.</p>
     * 
     * <p>Note 2: The previous 64KB of source data is <em>assumed</em> to remain present, unmodified, at same address in memory!</p>
     * 
     * <p>Note 3: When input is structured as a double-buffer, each buffer can have any size, including &lt; 64 KB. Make sure that buffers are separated, by at
     * least one byte. This construction ensures that each block only depends on previous block.</p>
     * 
     * <p>Note 4: If input buffer is a ring-buffer, it can have any size, including &lt; 64 KB.</p>
     *
     * @return size of compressed block or 0 if there is an error (typically, cannot fit into {@code dst}). After an error, the stream status is undefined (invalid),
     *         it can only be reset or freed.
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
     * Creates a streaming decompression tracking context.
     * 
     * <p>A tracking context can be re-used multiple times.</p>
     */
    @NativeType("LZ4_streamDecode_t *")
    public static native long LZ4_createStreamDecode();

    // --- [ LZ4_freeStreamDecode ] ---

    /** Unsafe version of: {@link #LZ4_freeStreamDecode freeStreamDecode} */
    public static native int nLZ4_freeStreamDecode(long LZ4_stream);

    /** Frees a streaming decompression tracking context. */
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
     * An {@code LZ4_streamDecode_t} context can be allocated once and re-used multiple times. Use this function to start decompression of a new stream of
     * blocks.
     * 
     * <p>A dictionary can optionally be set. Use {@code NULL} or size 0 for a reset order. Dictionary is presumed stable: it must remain accessible and unmodified
     * during next decompression.</p>
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

    // --- [ LZ4_decoderRingBufferSize ] ---

    /**
     * In a ring buffer scenario (optional), blocks are presumed decompressed next to each other up to the moment there is not enough remaining space for next
     * block ({@code remainingSize &lt; maxBlockSize}), at which stage it resumes from beginning of ring buffer. When setting such a ring buffer for streaming
     * decompression, provides the minimum size of this ring buffer to be compatible with any source respecting {@code maxBlockSize} condition.
     *
     * @return minimum ring buffer size, or 0 if there is an error (invalid {@code maxBlockSize})
     *
     * @since version 1.8.2
     */
    public static native int LZ4_decoderRingBufferSize(int maxBlockSize);

    // --- [ LZ4_decompress_safe_continue ] ---

    /** Unsafe version of: {@link #LZ4_decompress_safe_continue decompress_safe_continue} */
    public static native int nLZ4_decompress_safe_continue(long LZ4_streamDecode, long src, long dst, int srcSize, int dstCapacity);

    /**
     * These decoding functions allow decompression of consecutive blocks in "streaming" mode.
     * 
     * <p>A block is an unsplittable entity, it must be presented entirely to a decompression function. Decompression functions only accept one block at a time.
     * The last 64KB of previously decoded data <i>must</i> remain available and unmodified at the memory position where they were decoded. If less than 64KB
     * of data has been decoded, all the data must be present.</p>
     * 
     * <p>Special: if decompression side sets a ring buffer, it must respect one of the following conditions:</p>
     * 
     * <ul>
     * <li>Decompression buffer size is <i>at least</i> {@link #LZ4_decoderRingBufferSize decoderRingBufferSize}({@code maxBlockSize}). {@code maxBlockSize} is the maximum size of any single
     * block. It can have any value &gt; 16 bytes. In which case, encoding and decoding buffers do not need to be synchronized. Actually, data can be
     * produced by any source compliant with LZ4 format specification, and respecting {@code maxBlockSize}.</li>
     * <li>Synchronized mode:  Decompression buffer size is <i>exactly</i> the same as compression buffer size, and follows exactly same update rule (block
     * boundaries at same positions), and decoding function is provided with exact decompressed size of each block (exception for last block of the
     * stream), <i>then</i> decoding &amp; encoding ring buffer can have any size, including small ones ( &lt; 64 KB).</li>
     * <li>Decompression buffer is larger than encoding buffer, by a minimum of {@code maxBlockSize} more bytes. In which case, encoding and decoding buffers
     * do not need to be synchronized, and encoding ring buffer can have any size, including small ones ( &lt; 64 KB).</li>
     * </ul>
     * 
     * <p>Whenever these conditions are not possible, save the last 64KB of decoded data into a safe buffer where it can't be modified during decompression, then
     * indicate where this data is saved using {@link #LZ4_setStreamDecode setStreamDecode}, before decompressing next block.</p>
     */
    public static int LZ4_decompress_safe_continue(@NativeType("LZ4_streamDecode_t *") long LZ4_streamDecode, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst) {
        if (CHECKS) {
            check(LZ4_streamDecode);
        }
        return nLZ4_decompress_safe_continue(LZ4_streamDecode, memAddress(src), memAddress(dst), src.remaining(), dst.remaining());
    }

    // --- [ LZ4_decompress_safe_usingDict ] ---

    /** Unsafe version of: {@link #LZ4_decompress_safe_usingDict decompress_safe_usingDict} */
    public static native int nLZ4_decompress_safe_usingDict(long src, long dst, int srcSize, int dstCapacity, long dictStart, int dictSize);

    /**
     * These decoding functions work the same as a combination of {@link #LZ4_setStreamDecode setStreamDecode} followed by {@code LZ4_decompress_*_continue()}. They are stand-alone,
     * and don't need an {@code LZ4_streamDecode_t} structure.
     * 
     * <p>Dictionary is presumed stable: it must remain accessible and unmodified during decompression.</p>
     * 
     * <p>Performance tip: Decompression speed can be substantially increased when {@code dst == dictStart + dictSize}.</p>
     */
    public static int LZ4_decompress_safe_usingDict(@NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, @NativeType("char const *") ByteBuffer dictStart) {
        return nLZ4_decompress_safe_usingDict(memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), memAddress(dictStart), dictStart.remaining());
    }

    // --- [ LZ4_compress_fast_extState_fastReset ] ---

    /** Unsafe version of: {@link #LZ4_compress_fast_extState_fastReset compress_fast_extState_fastReset} */
    public static native int nLZ4_compress_fast_extState_fastReset(long state, long src, long dst, int srcSize, int dstCapacity, int acceleration);

    /**
     * A variant of {@link #LZ4_compress_fast_extState compress_fast_extState}.
     * 
     * <p>Using this variant avoids an expensive initialization step. It is only safe to call if the state buffer is known to be correctly initialized already
     * (see above comment on {@link #LZ4_resetStream_fast resetStream_fast} for a definition of "correctly initialized"). From a high level, the difference is that this function
     * initializes the provided state with a call to something like {@link #LZ4_resetStream_fast resetStream_fast} while {@link #LZ4_compress_fast_extState compress_fast_extState} starts with a call to {@link #LZ4_initStream initStream}.</p>
     */
    public static int LZ4_compress_fast_extState_fastReset(@NativeType("void *") ByteBuffer state, @NativeType("char const *") ByteBuffer src, @NativeType("char *") ByteBuffer dst, int acceleration) {
        return nLZ4_compress_fast_extState_fastReset(memAddress(state), memAddress(src), memAddress(dst), src.remaining(), dst.remaining(), acceleration);
    }

    // --- [ LZ4_attach_dictionary ] ---

    /** Unsafe version of: {@link #LZ4_attach_dictionary attach_dictionary} */
    public static native void nLZ4_attach_dictionary(long workingStream, long dictionaryStream);

    /**
     * This is an experimental API that allows efficient use of a static dictionary many times.
     * 
     * <p>Rather than re-loading the dictionary buffer into a working context before each compression, or copying a pre-loaded dictionary's {@code LZ4_stream_t}
     * into a working {@code LZ4_stream_t}, this function introduces a no-copy setup mechanism, in which the working stream references the dictionary stream
     * in-place.</p>
     * 
     * <p>Several assumptions are made about the state of the dictionary stream. Currently, only streams which have been prepared by {@link #LZ4_loadDict loadDict} should be
     * expected to work.</p>
     * 
     * <p>Alternatively, the provided {@code dictionaryStream} may be {@code NULL}, in which case any existing dictionary stream is unset.</p>
     * 
     * <p>If a dictionary is provided, it replaces any pre-existing stream history. The dictionary contents are the only history that can be referenced and
     * logically immediately precede the data compressed in the first subsequent compression call.</p>
     * 
     * <p>The dictionary will only remain attached to the working stream through the first compression call, at the end of which it is cleared. The dictionary
     * stream (and source buffer) must remain in-place / accessible / unchanged through the completion of the first compression call on the stream.</p>
     */
    public static void LZ4_attach_dictionary(@NativeType("LZ4_stream_t *") long workingStream, @NativeType("LZ4_stream_t const *") long dictionaryStream) {
        if (CHECKS) {
            check(workingStream);
        }
        nLZ4_attach_dictionary(workingStream, dictionaryStream);
    }

    // --- [ LZ4_initStream ] ---

    /** Unsafe version of: {@link #LZ4_initStream initStream} */
    public static native long nLZ4_initStream(long buffer, long size);

    /**
     * An {@code LZ4_stream_t} structure must be initialized at least once. This is automatically done when invoking createStream(), but it's not when the
     * structure is simply declared on stack (for example).
     * 
     * <p>Use {@code LZ4_initStream()} to properly initialize a newly declared {@code LZ4_stream_t}. It can also initialize any arbitrary buffer of sufficient
     * size, and will return a pointer of proper type upon initialization.</p>
     * 
     * <p>Note: initialization fails if size and alignment conditions are not respected. In which case, the function will {@code NULL}.</p>
     * 
     * <p>Note 2: An {@code LZ4_stream_t} structure guarantees correct alignment and size.</p>
     *
     * @since 1.9.0
     */
    @NativeType("LZ4_stream_t *")
    public static long LZ4_initStream(@NativeType("void *") ByteBuffer buffer) {
        return nLZ4_initStream(memAddress(buffer), buffer.remaining());
    }

    // --- [ LZ4_DECOMPRESS_INPLACE_MARGIN ] ---

    public static int LZ4_DECOMPRESS_INPLACE_MARGIN(int compressedSize) {
        return (compressedSize >>> 8) + 32;
    }

    // --- [ LZ4_DECOMPRESS_INPLACE_BUFFER_SIZE ] ---

    /**
     * Note: presumes that {@code compressedSize} &lt; {@code decompressedSize}.
     * 
     * <p>Note 2: margin is overestimated a bit, since it could use {@code compressedSize instead}.</p>
     */
    public static int LZ4_DECOMPRESS_INPLACE_BUFFER_SIZE(int decompressedSize) {
        return decompressedSize + LZ4_DECOMPRESS_INPLACE_MARGIN(decompressedSize);
    }

    // --- [ LZ4_COMPRESS_INPLACE_MARGIN ] ---

    public static int LZ4_COMPRESS_INPLACE_MARGIN() {
        return LZ4_DISTANCE_MAX + 32;
    }

    // --- [ LZ4_COMPRESS_INPLACE_BUFFER_SIZE ] ---

    /** @param maxCompressedSize is generally {@link #LZ4_COMPRESSBOUND COMPRESSBOUND}{@code (inputSize)}, but can be set to any lower value, with the risk that compression can fail (return code 0) */
    public static int LZ4_COMPRESS_INPLACE_BUFFER_SIZE(int maxCompressedSize) {
        return maxCompressedSize + LZ4_COMPRESS_INPLACE_MARGIN();
    }

    /** For static allocation; {@code maxBlockSize} presumed valid. */
    public static int LZ4_DECODER_RING_BUFFER_SIZE(int maxBlockSize) {
        return 65536 + 14 + maxBlockSize;
    }

}