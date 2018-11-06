/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to <a target="_blank" href="http://facebook.github.io/zstd/">Zstandard</a> (zstd), a fast lossless compression algorithm, targeting real-time
 * compression scenarios at zlib-level and better compression ratios.
 * 
 * <h3>Introduction</h3>
 * 
 * <p>zstd, short for Zstandard, is a fast lossless compression algorithm, targeting real-time compression scenarios at zlib-level and better compression
 * ratios. The zstd compression library provides in-memory compression and decompression functions.</p>
 * 
 * <p>The library supports regular compression levels from 1 up to {@link #ZSTD_maxCLevel maxCLevel}, which is currently 22. Levels &ge; 20, labeled {@code --ultra}, should be
 * used with caution, as they require more memory. The library also offers negative compression levels, which extend the range of speed vs. ratio
 * preferences. The lower the level, the faster the speed (at the cost of compression).</p>
 * 
 * <p>Compression can be done in:</p>
 * 
 * <ul>
 * <li>a single step (described as Simple API)</li>
 * <li>a single step, reusing a context (described as Explicit context)</li>
 * <li>unbounded multiple steps (described as Streaming compression)</li>
 * </ul>
 * 
 * <p>The compression ratio achievable on small data can be highly improved using a dictionary. Dictionary compression can be performed in:</p>
 * 
 * <ul>
 * <li>a single step (described as Simple dictionary API)</li>
 * <li>a single step, reusing a dictionary (described as Bulk-processing dictionary API)</li>
 * </ul>
 * 
 * <p>Advanced experimental functions can be accessed using {@code #define ZSTD_STATIC_LINKING_ONLY} before including {@code zstd.h}. Advanced experimental
 * APIs should never be used with a dynamically-linked library. They are not "stable", their definitions or signatures may change in the future. Only
 * static linking is allowed.</p>
 * 
 * <h3>Streaming compression - HowTo</h3>
 * 
 * <p>A {@code ZSTD_CStream} object is required to track streaming operation.</p>
 * 
 * <p>Use {@link #ZSTD_createCStream createCStream} and {@link #ZSTD_freeCStream freeCStream} to create/release resources. {@code ZSTD_CStream} objects can be reused multiple times on consecutive
 * compression operations. It is recommended to re-use {@code ZSTD_CStream} in situations where many streaming operations will be achieved consecutively,
 * since it will play nicer with system's memory, by re-using already allocated memory. Use one separate {@code ZSTD_CStream} per thread for parallel
 * execution.</p>
 * 
 * <p>Start a new compression by initializing {@code ZSTD_CStream} context. Use {@link #ZSTD_initCStream initCStream} to start a new compression operation.</p>
 * 
 * <p>Use {@link #ZSTD_compressStream compressStream} as many times as necessary to consume input stream. The function will automatically update both {@code pos} fields within
 * {@code input} and {@code output}. Note that the function may not consume the entire input, for example, because the output buffer is already full, in
 * which case {@code input.pos < input.size}. The caller must check if input has been entirely consumed. If not, the caller must make some room to receive
 * more compressed data, typically by emptying output buffer, or allocating a new output buffer, and then present again remaining input data.</p>
 * 
 * <p>At any moment, it's possible to flush whatever data might remain stuck within internal buffer, using {@link #ZSTD_flushStream flushStream}. {@code output->pos} will be
 * updated. Note that, if {@code output->size} is too small, a single invocation of {@code ZSTD_flushStream()} might not be enough (return code &gt; 0).
 * In which case, make some room to receive more compressed data, and call again {@code ZSTD_flushStream()}.</p>
 * 
 * <p>{@link #ZSTD_endStream endStream} instructs to finish a frame. It will perform a flush and write frame epilogue. The epilogue is required for decoders to consider a frame
 * completed. {@code flush()} operation is the same, and follows same rules as {@code ZSTD_flushStream()}.</p>
 * 
 * <h3>Streaming decompression - HowTo</h3>
 * 
 * <p>A {@code ZSTD_DStream} object is required to track streaming operations.</p>
 * 
 * <p>Use {@link #ZSTD_createDStream createDStream} and {@link #ZSTD_freeDStream freeDStream} to create/release resources. {@code ZSTD_DStream} objects can be re-used multiple times.</p>
 * 
 * <p>Use {@link #ZSTD_initDStream initDStream} to start a new decompression operation, or {@code ZSTD_initDStream_usingDict()} if decompression requires a dictionary.</p>
 * 
 * <p>Use {@link #ZSTD_decompressStream decompressStream} repetitively to consume your input. The function will update both {@code pos} fields. If {@code input.pos < input.size}, some
 * input has not been consumed. It's up to the caller to present again remaining data. If {@code output.pos < output.size}, decoder has flushed everything
 * it could.</p>
 */
public class Zstd {

    /** Version number part. */
    public static final int
        ZSTD_VERSION_MAJOR   = 1,
        ZSTD_VERSION_MINOR   = 3,
        ZSTD_VERSION_RELEASE = 7;

    /** Version number. */
    public static final int ZSTD_VERSION_NUMBER = (ZSTD_VERSION_MAJOR *100*100 + ZSTD_VERSION_MINOR *100 + ZSTD_VERSION_RELEASE);

    /** Version string. */
    public static final String ZSTD_VERSION_STRING = ZSTD_VERSION_MAJOR + "." + ZSTD_VERSION_MINOR + "." + ZSTD_VERSION_RELEASE;

    /** Content size. */
    public static final long
        ZSTD_CONTENTSIZE_UNKNOWN = -1L,
        ZSTD_CONTENTSIZE_ERROR   = -2L;

    /** Default compression level. */
    public static final int ZSTD_CLEVEL_DEFAULT = 3;

    static { LibZstd.initialize(); }

    protected Zstd() {
        throw new UnsupportedOperationException();
    }

    // --- [ ZSTD_versionNumber ] ---

    /** Returns the version number. */
    @NativeType("unsigned")
    public static native int ZSTD_versionNumber();

    // --- [ ZSTD_versionString ] ---

    /** Unsafe version of: {@link #ZSTD_versionString versionString} */
    public static native long nZSTD_versionString();

    /** Returns the version string. */
    @NativeType("char const *")
    public static String ZSTD_versionString() {
        long __result = nZSTD_versionString();
        return memASCII(__result);
    }

    // --- [ ZSTD_compress ] ---

    /** Unsafe version of: {@link #ZSTD_compress compress} */
    public static native long nZSTD_compress(long dst, long dstCapacity, long src, long srcSize, int compressionLevel);

    /**
     * Compresses {@code src} content as a single zstd compressed frame into already allocated {@code dst}.
     * 
     * <p>Hint: compression runs faster if {@code dstCapacity} &ge; {@link #ZSTD_compressBound compressBound}{@code (srcSize)}</p>
     *
     * @return compressed size written into {@code dst} (&le; {@code dstCapacity}), or an error code if it fails (which can be tested using {@link #ZSTD_isError isError}).
     */
    @NativeType("size_t")
    public static long ZSTD_compress(@NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, int compressionLevel) {
        return nZSTD_compress(memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), compressionLevel);
    }

    // --- [ ZSTD_decompress ] ---

    /**
     * Unsafe version of: {@link #ZSTD_decompress decompress}
     *
     * @param dstCapacity    is an upper bound of {@code originalSize} to regenerate. If user cannot imply a maximum upper bound, it's better to use streaming mode to
     *                       decompress data.
     * @param compressedSize must be the <b>exact</b> size of some number of compressed and/or skippable frames
     */
    public static native long nZSTD_decompress(long dst, long dstCapacity, long src, long compressedSize);

    /**
     * @return the number of bytes decompressed into {@code dst} (&le; {@code dstCapacity}), or an {@code errorCode} if it fails (which can be tested using
     *         {@link #ZSTD_isError isError}).
     */
    @NativeType("size_t")
    public static long ZSTD_decompress(@NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src) {
        return nZSTD_decompress(memAddress(dst), dst.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_getFrameContentSize ] ---

    /**
     * Unsafe version of: {@link #ZSTD_getFrameContentSize getFrameContentSize}
     *
     * @param srcSize must be at least as large as the frame header. Hint: any size &ge; {@link ZstdX#ZSTD_FRAMEHEADERSIZE_MAX FRAMEHEADERSIZE_MAX} is large enough.
     */
    public static native long nZSTD_getFrameContentSize(long src, long srcSize);

    /**
     * Notes:
     * 
     * <ol>
     * <li>a 0 return value means the frame is valid but "empty"</li>
     * <li>decompressed size is an optional field, it may not be present, typically in streaming mode. When {@code return==ZSTD_CONTENTSIZE_UNKNOWN}, data to
     * decompress could be any size. In which case, it's necessary to use streaming mode to decompress data. Optionally, application can rely on some
     * implicit limit, as {@link #ZSTD_decompress decompress} only needs an upper bound of decompressed size. (For example, data could be necessarily cut into blocks &le; 16
     * KB).</li>
     * <li>decompressed size is always present when compression is completed using single-pass functions, such as {@link #ZSTD_compress compress}, {@link #ZSTD_compressCCtx compressCCtx},
     * {@link #ZSTD_compress_usingDict compress_usingDict} or {@link #ZSTD_compress_usingCDict compress_usingCDict}.</li>
     * <li>decompressed size can be very large (64-bits value), potentially larger than what local system can handle as a single memory segment. In which
     * case, it's necessary to use streaming mode to decompress data.</li>
     * <li>If source is untrusted, decompressed size could be wrong or intentionally modified. Always ensure return value fits within application's authorized
     * limits. Each application can set its own limits.</li>
     * </ol>
     *
     * @param src should point to the start of a ZSTD encoded frame
     *
     * @return decompressed size of {@code src} frame content, if known
     *         
     *         <ul>
     *         <li>{@link #ZSTD_CONTENTSIZE_UNKNOWN CONTENTSIZE_UNKNOWN} if the size cannot be determined</li>
     *         <li>{@link #ZSTD_CONTENTSIZE_ERROR CONTENTSIZE_ERROR} if an error occurred (e.g. invalid magic number, {@code srcSize} too small)</li>
     *         </ul>
     */
    @NativeType("unsigned long long")
    public static long ZSTD_getFrameContentSize(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_getFrameContentSize(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_compressBound ] ---

    /** Returns the maximum compressed size in worst case single-pass scenario. */
    @NativeType("size_t")
    public static native long ZSTD_compressBound(@NativeType("size_t") long srcSize);

    // --- [ ZSTD_isError ] ---

    /** Unsafe version of: {@link #ZSTD_isError isError} */
    public static native int nZSTD_isError(long code);

    /** Tells if a {@code size_t} function result is an error code. */
    @NativeType("unsigned int")
    public static boolean ZSTD_isError(@NativeType("size_t") long code) {
        return nZSTD_isError(code) != 0;
    }

    // --- [ ZSTD_getErrorName ] ---

    /** Unsafe version of: {@link #ZSTD_getErrorName getErrorName} */
    public static native long nZSTD_getErrorName(long code);

    /** Provides readable string from an error code. */
    @NativeType("char const *")
    public static String ZSTD_getErrorName(@NativeType("size_t") long code) {
        long __result = nZSTD_getErrorName(code);
        return memASCII(__result);
    }

    // --- [ ZSTD_maxCLevel ] ---

    /** Returns the maximum compression level available. */
    public static native int ZSTD_maxCLevel();

    // --- [ ZSTD_createCCtx ] ---

    /**
     * Creates a compression context.
     * 
     * <p>When compressing many times, it is recommended to allocate a context just once, and re-use it for each successive compression operation. This will make
     * workload friendlier for system's memory. Use one context per thread for parallel execution in multi-threaded environments.</p>
     */
    @NativeType("ZSTD_CCtx *")
    public static native long ZSTD_createCCtx();

    // --- [ ZSTD_freeCCtx ] ---

    /** Unsafe version of: {@link #ZSTD_freeCCtx freeCCtx} */
    public static native long nZSTD_freeCCtx(long cctx);

    /** Frees memory allocated by {@link #ZSTD_createCCtx createCCtx}. */
    @NativeType("size_t")
    public static long ZSTD_freeCCtx(@NativeType("ZSTD_CCtx *") long cctx) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_freeCCtx(cctx);
    }

    // --- [ ZSTD_compressCCtx ] ---

    /** Unsafe version of: {@link #ZSTD_compressCCtx compressCCtx} */
    public static native long nZSTD_compressCCtx(long ctx, long dst, long dstCapacity, long src, long srcSize, int compressionLevel);

    /** Same as {@link #ZSTD_compress compress}, requires an allocated {@code ZSTD_CCtx} (see {@link #ZSTD_createCCtx createCCtx}). */
    @NativeType("size_t")
    public static long ZSTD_compressCCtx(@NativeType("ZSTD_CCtx *") long ctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, int compressionLevel) {
        if (CHECKS) {
            check(ctx);
        }
        return nZSTD_compressCCtx(ctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), compressionLevel);
    }

    // --- [ ZSTD_createDCtx ] ---

    /**
     * Creates a decompression context.
     * 
     * <p>When decompressing many times, it is recommended to allocate a context only once, and re-use it for each successive compression operation. This will
     * make workload friendlier for system's memory. Use one context per thread for parallel execution.</p>
     */
    @NativeType("ZSTD_DCtx *")
    public static native long ZSTD_createDCtx();

    // --- [ ZSTD_freeDCtx ] ---

    /** Unsafe version of: {@link #ZSTD_freeDCtx freeDCtx} */
    public static native long nZSTD_freeDCtx(long dctx);

    /** Frees memory allocated by {@link #ZSTD_createDCtx createDCtx}. */
    @NativeType("size_t")
    public static long ZSTD_freeDCtx(@NativeType("ZSTD_DCtx *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_freeDCtx(dctx);
    }

    // --- [ ZSTD_decompressDCtx ] ---

    /** Unsafe version of: {@link #ZSTD_decompressDCtx decompressDCtx} */
    public static native long nZSTD_decompressDCtx(long ctx, long dst, long dstCapacity, long src, long srcSize);

    /** Same as {@link #ZSTD_decompress decompress}, requires an allocated {@code ZSTD_DCtx} (see {@link #ZSTD_createDCtx createDCtx}). */
    @NativeType("size_t")
    public static long ZSTD_decompressDCtx(@NativeType("ZSTD_DCtx *") long ctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(ctx);
        }
        return nZSTD_decompressDCtx(ctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_compress_usingDict ] ---

    /** Unsafe version of: {@link #ZSTD_compress_usingDict compress_usingDict} */
    public static native long nZSTD_compress_usingDict(long ctx, long dst, long dstCapacity, long src, long srcSize, long dict, long dictSize, int compressionLevel);

    /**
     * Compression using a predefined Dictionary (see {@code dictBuilder/zdict.h}).
     * 
     * <p>This function loads the dictionary, resulting in significant startup delay.</p>
     * 
     * <p>When {@code dict == NULL || dictSize < 8} no dictionary is used.</p>
     */
    @NativeType("size_t")
    public static long ZSTD_compress_usingDict(@NativeType("ZSTD_CCtx *") long ctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @Nullable @NativeType("void const *") ByteBuffer dict, int compressionLevel) {
        if (CHECKS) {
            check(ctx);
        }
        return nZSTD_compress_usingDict(ctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), memAddressSafe(dict), remainingSafe(dict), compressionLevel);
    }

    // --- [ ZSTD_decompress_usingDict ] ---

    /** Unsafe version of: {@link #ZSTD_decompress_usingDict decompress_usingDict} */
    public static native long nZSTD_decompress_usingDict(long dctx, long dst, long dstCapacity, long src, long srcSize, long dict, long dictSize);

    /**
     * Decompression using a predefined Dictionary (see {@code dictBuilder/zdict.h}). Dictionary must be identical to the one used during compression.
     * 
     * <p>This function loads the dictionary, resulting in significant startup delay.</p>
     * 
     * <p>When {@code dict == NULL || dictSize < 8} no dictionary is used.</p>
     */
    @NativeType("size_t")
    public static long ZSTD_decompress_usingDict(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @Nullable @NativeType("void const *") ByteBuffer dict) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_decompress_usingDict(dctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), memAddressSafe(dict), remainingSafe(dict));
    }

    // --- [ ZSTD_createCDict ] ---

    /** Unsafe version of: {@link #ZSTD_createCDict createCDict} */
    public static native long nZSTD_createCDict(long dictBuffer, long dictSize, int compressionLevel);

    /**
     * When compressing multiple messages / blocks with the same dictionary, it's recommended to load it just once.
     * 
     * <p>{@code ZSTD_createCDict()} will create a digested dictionary, ready to start future compression operations without startup delay. {@code ZSTD_CDict}
     * can be created once and shared by multiple threads concurrently, since its usage is read-only.</p>
     * 
     * <p>{@code dictBuffer} can be released after {@code ZSTD_CDict} creation, since its content is copied within CDict.</p>
     * 
     * <p>Note: A {@code ZSTD_CDict} can be created with an empty dictionary, but it is inefficient for small data.</p>
     */
    @NativeType("ZSTD_CDict *")
    public static long ZSTD_createCDict(@NativeType("void const *") ByteBuffer dictBuffer, int compressionLevel) {
        return nZSTD_createCDict(memAddress(dictBuffer), dictBuffer.remaining(), compressionLevel);
    }

    // --- [ ZSTD_freeCDict ] ---

    /** Unsafe version of: {@link #ZSTD_freeCDict freeCDict} */
    public static native long nZSTD_freeCDict(long CDict);

    /** Frees memory allocated by {@link #ZSTD_createCDict createCDict}. */
    @NativeType("size_t")
    public static long ZSTD_freeCDict(@NativeType("ZSTD_CDict *") long CDict) {
        if (CHECKS) {
            check(CDict);
        }
        return nZSTD_freeCDict(CDict);
    }

    // --- [ ZSTD_compress_usingCDict ] ---

    /** Unsafe version of: {@link #ZSTD_compress_usingCDict compress_usingCDict} */
    public static native long nZSTD_compress_usingCDict(long cctx, long dst, long dstCapacity, long src, long srcSize, long cdict);

    /**
     * Compression using a digested Dictionary.
     * 
     * <p>Faster startup than {@link #ZSTD_compress_usingDict compress_usingDict}, recommended when same dictionary is used multiple times. Note that compression level is decided during
     * dictionary creation. Frame parameters are hardcoded ({@code dictID=yes, contentSize=yes, checksum=no})</p>
     * 
     * <p>Note: {@code ZSTD_compress_usingCDict()} can be used with a {@code ZSTD_CDict} created from an empty dictionary. But it is inefficient for small data,
     * and it is recommended to use {@link #ZSTD_compressCCtx compressCCtx}.</p>
     */
    @NativeType("size_t")
    public static long ZSTD_compress_usingCDict(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("ZSTD_CDict const *") long cdict) {
        if (CHECKS) {
            check(cctx);
            check(cdict);
        }
        return nZSTD_compress_usingCDict(cctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), cdict);
    }

    // --- [ ZSTD_createDDict ] ---

    /** Unsafe version of: {@link #ZSTD_createDDict createDDict} */
    public static native long nZSTD_createDDict(long dictBuffer, long dictSize);

    /**
     * Creates a digested dictionary, ready to start decompression operation without startup delay.
     * 
     * <p>{@code dictBuffer} can be released after {@code DDict} creation, as its content is copied inside {@code DDict}.</p>
     */
    @NativeType("ZSTD_DDict *")
    public static long ZSTD_createDDict(@NativeType("void const *") ByteBuffer dictBuffer) {
        return nZSTD_createDDict(memAddress(dictBuffer), dictBuffer.remaining());
    }

    // --- [ ZSTD_freeDDict ] ---

    /** Unsafe version of: {@link #ZSTD_freeDDict freeDDict} */
    public static native long nZSTD_freeDDict(long ddict);

    /** Frees memory allocated with {@link #ZSTD_createDDict createDDict}. */
    @NativeType("size_t")
    public static long ZSTD_freeDDict(@NativeType("ZSTD_DDict *") long ddict) {
        if (CHECKS) {
            check(ddict);
        }
        return nZSTD_freeDDict(ddict);
    }

    // --- [ ZSTD_decompress_usingDDict ] ---

    /** Unsafe version of: {@link #ZSTD_decompress_usingDDict decompress_usingDDict} */
    public static native long nZSTD_decompress_usingDDict(long dctx, long dst, long dstCapacity, long src, long srcSize, long ddict);

    /**
     * Decompression using a digested Dictionary.
     * 
     * <p>Faster startup than {@link #ZSTD_decompress_usingDict decompress_usingDict}, recommended when same dictionary is used multiple times.</p>
     */
    @NativeType("size_t")
    public static long ZSTD_decompress_usingDDict(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("ZSTD_DDict const *") long ddict) {
        if (CHECKS) {
            check(dctx);
            check(ddict);
        }
        return nZSTD_decompress_usingDDict(dctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), ddict);
    }

    // --- [ ZSTD_createCStream ] ---

    /**
     * A {@code ZSTD_CStream} object is required to track streaming operation.
     * 
     * <p>Use {@code ZSTD_createCStream()} and {@link #ZSTD_freeCStream freeCStream} to create/release resources.</p>
     * 
     * <p>{@code ZSTD_CStream} objects can be reused multiple times on consecutive compression operations. It is recommended to re-use {@code ZSTD_CStream} in
     * situations where many streaming operations will be achieved consecutively, since it will play nicer with system's memory, by re-using already allocated
     * memory. Use one separate {@code ZSTD_CStream} per thread for parallel execution.</p>
     */
    @NativeType("ZSTD_CStream *")
    public static native long ZSTD_createCStream();

    // --- [ ZSTD_freeCStream ] ---

    /** Unsafe version of: {@link #ZSTD_freeCStream freeCStream} */
    public static native long nZSTD_freeCStream(long zcs);

    /** Frees memory allocated by {@link #ZSTD_createCStream createCStream}. */
    @NativeType("size_t")
    public static long ZSTD_freeCStream(@NativeType("ZSTD_CStream *") long zcs) {
        if (CHECKS) {
            check(zcs);
        }
        return nZSTD_freeCStream(zcs);
    }

    // --- [ ZSTD_initCStream ] ---

    /** Unsafe version of: {@link #ZSTD_initCStream initCStream} */
    public static native long nZSTD_initCStream(long zcs, int compressionLevel);

    /** Use {@code ZSTD_initCStream()} to start a new compression operation. */
    @NativeType("size_t")
    public static long ZSTD_initCStream(@NativeType("ZSTD_CStream *") long zcs, int compressionLevel) {
        if (CHECKS) {
            check(zcs);
        }
        return nZSTD_initCStream(zcs, compressionLevel);
    }

    // --- [ ZSTD_compressStream ] ---

    /** Unsafe version of: {@link #ZSTD_compressStream compressStream} */
    public static native long nZSTD_compressStream(long zcs, long output, long input);

    /**
     * Use {@code ZSTD_compressStream()} as many times as necessary to consume input stream.
     * 
     * <p>The function will automatically update both {@code pos} fields within {@code input} and {@code output}. Note that the function may not consume the
     * entire input, for example, because the output buffer is already full, in which case {@code input.pos < input.size}. The caller must check if input has
     * been entirely consumed. If not, the caller must make some room to receive more compressed data, typically by emptying output buffer, or allocating a
     * new output buffer, and then present again remaining input data.</p>
     *
     * @return a size hint, preferred {@code nb} of bytes to use as input for next function call or an error code, which can be tested using {@link #ZSTD_isError isError}.
     *         
     *         <p>Notes:</p>
     *         
     *         <ol>
     *         <li>it's just a hint, to help latency a little, any other value will work fine</li>
     *         <li>size hint is guaranteed to be &le; {@link #ZSTD_CStreamInSize CStreamInSize}</li>
     *         </ol>
     */
    @NativeType("size_t")
    public static long ZSTD_compressStream(@NativeType("ZSTD_CStream *") long zcs, @NativeType("ZSTD_outBuffer *") ZSTDOutBuffer output, @NativeType("ZSTD_inBuffer *") ZSTDInBuffer input) {
        if (CHECKS) {
            check(zcs);
            ZSTDOutBuffer.validate(output.address());
            ZSTDInBuffer.validate(input.address());
        }
        return nZSTD_compressStream(zcs, output.address(), input.address());
    }

    // --- [ ZSTD_flushStream ] ---

    /** Unsafe version of: {@link #ZSTD_flushStream flushStream} */
    public static native long nZSTD_flushStream(long zcs, long output);

    /**
     * At any moment, it's possible to flush whatever data might remain stuck within internal buffer, using {@code ZSTD_flushStream()}.
     * 
     * <p>{@code output->pos} will be updated. Note that, if {@code output->size} is too small, a single invocation of {@code ZSTD_flushStream()} might not be
enough (return code &gt; 0). In which case, make some room to receive more compressed data, and call again {@code ZSTD_flushStream()}.</p>
     *
     * @return <ul>
     *         <li>0 if internal buffers are entirely flushed,</li>
     *         <li>&gt;0 if some data still present within internal buffer (the value is minimal estimation of remaining size),</li>
     *         <li>or an error code, which can be tested using {@link #ZSTD_isError isError}</li>
     *         </ul>
     */
    @NativeType("size_t")
    public static long ZSTD_flushStream(@NativeType("ZSTD_CStream *") long zcs, @NativeType("ZSTD_outBuffer *") ZSTDOutBuffer output) {
        if (CHECKS) {
            check(zcs);
            ZSTDOutBuffer.validate(output.address());
        }
        return nZSTD_flushStream(zcs, output.address());
    }

    // --- [ ZSTD_endStream ] ---

    /** Unsafe version of: {@link #ZSTD_endStream endStream} */
    public static native long nZSTD_endStream(long zcs, long output);

    /**
     * {@code ZSTD_endStream()} instructs to finish a frame.
     * 
     * <p>It will perform a flush and write frame epilogue. The epilogue is required for decoders to consider a frame completed. {@code flush()} operation is the
same, and follows same rules as {@link #ZSTD_flushStream flushStream}.</p>
     *
     * @return 0 if frame fully completed and fully flushed, or &gt; 0 if some data is still present within internal buffer (value is minimum size estimation for
     *         remaining data to flush, but it could be more) or an error code, which can be tested using {@link #ZSTD_isError isError}
     */
    @NativeType("size_t")
    public static long ZSTD_endStream(@NativeType("ZSTD_CStream *") long zcs, @NativeType("ZSTD_outBuffer *") ZSTDOutBuffer output) {
        if (CHECKS) {
            check(zcs);
            ZSTDOutBuffer.validate(output.address());
        }
        return nZSTD_endStream(zcs, output.address());
    }

    // --- [ ZSTD_CStreamInSize ] ---

    /** Returns the recommended size for input buffer. */
    @NativeType("size_t")
    public static native long ZSTD_CStreamInSize();

    // --- [ ZSTD_CStreamOutSize ] ---

    /** Returns the recommended size for output buffer. Guarantee to successfully flush at least one complete compressed block in all circumstances. */
    @NativeType("size_t")
    public static native long ZSTD_CStreamOutSize();

    // --- [ ZSTD_createDStream ] ---

    /**
     * A {@code ZSTD_DStream} object is required to track streaming operations.
     * 
     * <p>Use {@code ZSTD_createDStream()} and {@link #ZSTD_freeDStream freeDStream} to create/release resources. {@code ZSTD_DStream} objects can be re-used multiple times.</p>
     */
    @NativeType("ZSTD_DStream *")
    public static native long ZSTD_createDStream();

    // --- [ ZSTD_freeDStream ] ---

    /** Unsafe version of: {@link #ZSTD_freeDStream freeDStream} */
    public static native long nZSTD_freeDStream(long zds);

    /** Frees memory allocated by {@link #ZSTD_createDStream createDStream}. */
    @NativeType("size_t")
    public static long ZSTD_freeDStream(@NativeType("ZSTD_DStream *") long zds) {
        if (CHECKS) {
            check(zds);
        }
        return nZSTD_freeDStream(zds);
    }

    // --- [ ZSTD_initDStream ] ---

    /** Unsafe version of: {@link #ZSTD_initDStream initDStream} */
    public static native long nZSTD_initDStream(long zds);

    /**
     * Use {@code ZSTD_initDStream()} to start a new decompression operation.
     *
     * @return recommended first input size
     */
    @NativeType("size_t")
    public static long ZSTD_initDStream(@NativeType("ZSTD_DStream *") long zds) {
        if (CHECKS) {
            check(zds);
        }
        return nZSTD_initDStream(zds);
    }

    // --- [ ZSTD_decompressStream ] ---

    /** Unsafe version of: {@link #ZSTD_decompressStream decompressStream} */
    public static native long nZSTD_decompressStream(long zds, long output, long input);

    /**
     * Use {@code ZSTD_decompressStream()} repetitively to consume your input.
     * 
     * <p>The function will update both {@code pos} fields. If {@code input.pos < input.size}, some input has not been consumed. It's up to the caller to present
     * again remaining data. The function tries to flush all data decoded immediately, respecting buffer sizes.  If {@code output.pos < output.size}, decoder
     * has flushed everything it could. But if {@code output.pos == output.size}, there is no such guarantee, it's likely that some decoded data was not
     * flushed and still remains within internal buffers. In which case, call {@code ZSTD_decompressStream()} again to flush whatever remains in the buffer.
     * When no additional input is provided, amount of data flushed is necessarily &le; {@link ZstdX#ZSTD_BLOCKSIZE_MAX BLOCKSIZE_MAX}.</p>
     *
     * @return 0 when a frame is completely decoded and fully flushed, an error code, which can be tested using {@link #ZSTD_isError isError}, any other value &gt; 0, which means there
     *         is still some decoding to do to complete current frame. The return value is a suggested next input size (a hint to improve latency) that will never
     *         load more than the current frame.
     */
    @NativeType("size_t")
    public static long ZSTD_decompressStream(@NativeType("ZSTD_DStream *") long zds, @NativeType("ZSTD_outBuffer *") ZSTDOutBuffer output, @NativeType("ZSTD_inBuffer *") ZSTDInBuffer input) {
        if (CHECKS) {
            check(zds);
            ZSTDOutBuffer.validate(output.address());
            ZSTDInBuffer.validate(input.address());
        }
        return nZSTD_decompressStream(zds, output.address(), input.address());
    }

    // --- [ ZSTD_DStreamInSize ] ---

    /** Returns the recommended size for input buffer. */
    @NativeType("size_t")
    public static native long ZSTD_DStreamInSize();

    // --- [ ZSTD_DStreamOutSize ] ---

    /** Returns the recommended size for output buffer. Guarantee to successfully flush at least one complete compressed block in all circumstances. */
    @NativeType("size_t")
    public static native long ZSTD_DStreamOutSize();

    /** Pure Java version of {@link #ZSTD_compressBound}. */
    public static long ZSTD_COMPRESSBOUND(long srcSize) {
        /* this formula ensures that bound(A) + bound(B) <= bound(A+B) as long as A and B >= 128 KB */
        return srcSize
            + (srcSize >> 8)
            + (srcSize < (128 << 10)
                ? (128 << 10) - srcSize >> 11 /* margin, from 64 to 0 */
                : 0
            );
    }

}