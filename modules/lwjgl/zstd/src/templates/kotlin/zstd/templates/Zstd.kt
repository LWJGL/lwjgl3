/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package zstd.templates

import org.lwjgl.generator.*
import zstd.*

val Zstd = "Zstd".nativeClass(Module.ZSTD, prefix = "ZSTD", prefixMethod = "ZSTD_", library = ZSTD_LIBRARY) {
    nativeDirective(
        """DISABLE_WARNINGS()
#define ZSTD_STATIC_LINKING_ONLY
#include "zstd.h"
ENABLE_WARNINGS()""")

    documentation =
        """
        Native bindings to ${url("http://facebook.github.io/zstd/", "Zstandard")} (zstd), a fast lossless compression algorithm, targeting real-time
        compression scenarios at zlib-level and better compression ratios.

        <h3>Introduction</h3>

        zstd, short for Zstandard, is a fast lossless compression algorithm, targeting real-time compression scenarios at zlib-level and better compression
        ratios. The zstd compression library provides in-memory compression and decompression functions.

        The library supports regular compression levels from 1 up to #maxCLevel(), which is currently 22. Levels &ge; 20, labeled {@code --ultra}, should be
        used with caution, as they require more memory. The library also offers negative compression levels, which extend the range of speed vs. ratio
        preferences. The lower the level, the faster the speed (at the cost of compression).

        Compression can be done in:
        ${ul(
            "a single step (described as Simple API)",
            "a single step, reusing a context (described as Explicit context)",
            "unbounded multiple steps (described as Streaming compression)"
        )}

        The compression ratio achievable on small data can be highly improved using a dictionary. Dictionary compression can be performed in:
        ${ul(
            "a single step (described as Simple dictionary API)",
            "a single step, reusing a dictionary (described as Bulk-processing dictionary API)"
        )}

        Advanced experimental functions can be accessed using {@code \#define ZSTD_STATIC_LINKING_ONLY} before including {@code zstd.h}. Advanced experimental
        APIs should never be used with a dynamically-linked library. They are not "stable", their definitions or signatures may change in the future. Only
        static linking is allowed.

        <h3>Streaming compression - HowTo</h3>

        A {@code ZSTD_CStream} object is required to track streaming operation.

        Use #createCStream() and #freeCStream() to create/release resources. {@code ZSTD_CStream} objects can be reused multiple times on consecutive
        compression operations. It is recommended to re-use {@code ZSTD_CStream} in situations where many streaming operations will be achieved consecutively,
        since it will play nicer with system's memory, by re-using already allocated memory. Use one separate {@code ZSTD_CStream} per thread for parallel
        execution.

        Start a new compression by initializing {@code ZSTD_CStream} context. Use #initCStream() to start a new compression operation.

        Use #compressStream() as many times as necessary to consume input stream. The function will automatically update both {@code pos} fields within
        {@code input} and {@code output}. Note that the function may not consume the entire input, for example, because the output buffer is already full, in
        which case {@code input.pos < input.size}. The caller must check if input has been entirely consumed. If not, the caller must make some room to receive
        more compressed data, typically by emptying output buffer, or allocating a new output buffer, and then present again remaining input data.

        At any moment, it's possible to flush whatever data might remain stuck within internal buffer, using #flushStream(). {@code output->pos} will be
        updated. Note that, if {@code output->size} is too small, a single invocation of {@code ZSTD_flushStream()} might not be enough (return code &gt; 0).
        In which case, make some room to receive more compressed data, and call again {@code ZSTD_flushStream()}.

        #endStream() instructs to finish a frame. It will perform a flush and write frame epilogue. The epilogue is required for decoders to consider a frame
        completed. {@code flush()} operation is the same, and follows same rules as {@code ZSTD_flushStream()}.

        <h3>Streaming decompression - HowTo</h3>

        A {@code ZSTD_DStream} object is required to track streaming operations.

        Use #createDStream() and #freeDStream() to create/release resources. {@code ZSTD_DStream} objects can be re-used multiple times.

        Use #initDStream() to start a new decompression operation, or {@code ZSTD_initDStream_usingDict()} if decompression requires a dictionary.

        Use #decompressStream() repetitively to consume your input. The function will update both {@code pos} fields. If {@code input.pos < input.size}, some
        input has not been consumed. It's up to the caller to present again remaining data. If {@code output.pos < output.size}, decoder has flushed everything
        it could.
        """

    IntConstant(
        "Version number part.",

        "VERSION_MAJOR".."1",
        "VERSION_MINOR".."3",
        "VERSION_RELEASE".."7"
    )

    IntConstant("Version number.", "VERSION_NUMBER".."(ZSTD_VERSION_MAJOR *100*100 + ZSTD_VERSION_MINOR *100 + ZSTD_VERSION_RELEASE)")
    StringConstant("Version string.", "VERSION_STRING".."""ZSTD_VERSION_MAJOR + "." + ZSTD_VERSION_MINOR + "." + ZSTD_VERSION_RELEASE""")

    unsigned("versionNumber", "Returns the version number.", void())
    Nonnull..charASCII.const.p("versionString", "Returns the version string.", void())

    LongConstant(
        "Content size.",

        "CONTENTSIZE_UNKNOWN"..("-1L"),
        "CONTENTSIZE_ERROR"..("-2L")
    )

    IntConstant(
        "Default compression level.",

        "CLEVEL_DEFAULT".."3"
    )

    /***************************************
    *  Simple API
    ***************************************/

    val compress = size_t(
        "compress",
        """
        Compresses {@code src} content as a single zstd compressed frame into already allocated {@code dst}.

        Hint: compression runs faster if {@code dstCapacity} &ge; #compressBound(){@code (srcSize)}
        """,

        void.p("dst", ""),
        AutoSize("dst")..size_t("dstCapacity", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", ""),
        int("compressionLevel", ""),

        returnDoc = "compressed size written into {@code dst} (&le; {@code dstCapacity}), or an error code if it fails (which can be tested using #isError())."
    )

    size_t(
        "decompress",
        "",

        void.p("dst", ""),
        AutoSize("dst")..size_t(
            "dstCapacity",
            """
            is an upper bound of {@code originalSize} to regenerate. If user cannot imply a maximum upper bound, it's better to use streaming mode to
            decompress data.
            """
        ),
        void.const.p("src", ""),
        AutoSize("src")..size_t("compressedSize", "must be the <b>exact</b> size of some number of compressed and/or skippable frames"),

        returnDoc =
        """
        the number of bytes decompressed into {@code dst} (&le; {@code dstCapacity}), or an {@code errorCode} if it fails (which can be tested using
        #isError()).
        """
    )

    unsigned_long_long(
        "getFrameContentSize",
        """
        Notes:
        ${ol(
            "a 0 return value means the frame is valid but \"empty\"",
            """
            decompressed size is an optional field, it may not be present, typically in streaming mode. When {@code return==ZSTD_CONTENTSIZE_UNKNOWN}, data to
            decompress could be any size. In which case, it's necessary to use streaming mode to decompress data. Optionally, application can rely on some
            implicit limit, as #decompress() only needs an upper bound of decompressed size. (For example, data could be necessarily cut into blocks &le; 16
            KB).
            """,
            """
            decompressed size is always present when compression is completed using single-pass functions, such as #compress(), #compressCCtx(),
            #compress_usingDict() or #compress_usingCDict().
            """,
            """
            decompressed size can be very large (64-bits value), potentially larger than what local system can handle as a single memory segment. In which
            case, it's necessary to use streaming mode to decompress data.
            """,
            """
            If source is untrusted, decompressed size could be wrong or intentionally modified. Always ensure return value fits within application's authorized
            limits. Each application can set its own limits.
            """
        )}
        """,

        void.const.p("src", "should point to the start of a ZSTD encoded frame"),
        AutoSize("src")..size_t("srcSize", "must be at least as large as the frame header. Hint: any size &ge; #FRAMEHEADERSIZE_MAX is large enough."),

        returnDoc =
        """
        decompressed size of {@code src} frame content, if known
        ${ul(
            "#CONTENTSIZE_UNKNOWN if the size cannot be determined",
            "#CONTENTSIZE_ERROR if an error occurred (e.g. invalid magic number, {@code srcSize} too small)"
        )}
        """
    )

    customMethod("""
    /** Pure Java version of {@link #ZSTD_compressBound}. */
    public static long ZSTD_COMPRESSBOUND(long srcSize) {
        /* this formula ensures that bound(A) + bound(B) <= bound(A+B) as long as A and B >= 128 KB */
        return srcSize
            + (srcSize >> 8)
            + (srcSize < (128 << 10)
                ? (128 << 10) - srcSize >> 11 /* margin, from 64 to 0 */
                : 0
            );
    }""")

    size_t(
        "compressBound",
        "Returns the maximum compressed size in worst case single-pass scenario.",

        size_t("srcSize", "")
    )

    unsigned_intb(
        "isError",
        "Tells if a {@code size_t} function result is an error code.",

        size_t("code", "")
    )

    Nonnull..charASCII.const.p(
        "getErrorName",
        "Provides readable string from an error code.",

        size_t("code", "")
    )

    int("maxCLevel", "Returns the maximum compression level available.", void())

    /***************************************
    *  Explicit context
    ***************************************/

    ZSTD_CCtx.p(
        "createCCtx",
        """
        Creates a compression context.

        When compressing many times, it is recommended to allocate a context just once, and re-use it for each successive compression operation. This will make
        workload friendlier for system's memory. Use one context per thread for parallel execution in multi-threaded environments.
        """,
        void()
    )

    size_t(
        "freeCCtx",
        "Frees memory allocated by #createCCtx().",

        ZSTD_CCtx.p("cctx", "")
    )

    size_t(
        "compressCCtx",
        "Same as #compress(), requires an allocated {@code ZSTD_CCtx} (see #createCCtx()).",

        ZSTD_CCtx.p("ctx", ""),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        int("compressionLevel", "")
    )

    ZSTD_DCtx.p(
        "createDCtx",
        """
        Creates a decompression context.

        When decompressing many times, it is recommended to allocate a context only once, and re-use it for each successive compression operation. This will
        make workload friendlier for system's memory. Use one context per thread for parallel execution.
        """,
        void()
    )

    size_t(
        "freeDCtx",
        "Frees memory allocated by #createDCtx().",

        ZSTD_DCtx.p("dctx", "")
    )

    size_t(
        "decompressDCtx",
        "Same as #decompress(), requires an allocated {@code ZSTD_DCtx} (see #createDCtx()).",

        ZSTD_DCtx.p("ctx", ""),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"]
    )

    /**************************
    *  Simple dictionary API
    ***************************/

    size_t(
        "compress_usingDict",
        """
        Compression using a predefined Dictionary (see {@code dictBuilder/zdict.h}).

        This function loads the dictionary, resulting in significant startup delay.

        When {@code dict == NULL || dictSize < 8} no dictionary is used.
        """,

        ZSTD_CCtx.p("ctx", ""),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        nullable..void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),
        int("compressionLevel", "")
    )

    size_t(
        "decompress_usingDict",
        """
        Decompression using a predefined Dictionary (see {@code dictBuilder/zdict.h}). Dictionary must be identical to the one used during compression.

        This function loads the dictionary, resulting in significant startup delay.

        When {@code dict == NULL || dictSize < 8} no dictionary is used.
        """,

        ZSTD_DCtx.p("dctx", ""),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        nullable..void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", "")
    )

    /**********************************
     *  Bulk processing dictionary API
     *********************************/

    ZSTD_CDict.p(
        "createCDict",
        """
        When compressing multiple messages / blocks with the same dictionary, it's recommended to load it just once.

        {@code ZSTD_createCDict()} will create a digested dictionary, ready to start future compression operations without startup delay. {@code ZSTD_CDict}
        can be created once and shared by multiple threads concurrently, since its usage is read-only.

        {@code dictBuffer} can be released after {@code ZSTD_CDict} creation, since its content is copied within CDict.

        Note: A {@code ZSTD_CDict} can be created with an empty dictionary, but it is inefficient for small data.
        """,

        void.const.p("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t("dictSize", ""),
        int("compressionLevel", "")
    )

    size_t(
        "freeCDict",
        "Frees memory allocated by #createCDict().",

        ZSTD_CDict.p("CDict", "")
    )

    size_t(
        "compress_usingCDict",
        """
        Compression using a digested Dictionary.

        Faster startup than #compress_usingDict(), recommended when same dictionary is used multiple times. Note that compression level is decided during
        dictionary creation. Frame parameters are hardcoded ({@code dictID=yes, contentSize=yes, checksum=no})

        Note: {@code ZSTD_compress_usingCDict()} can be used with a {@code ZSTD_CDict} created from an empty dictionary. But it is inefficient for small data,
        and it is recommended to use #compressCCtx().
        """,

        ZSTD_CCtx.p("cctx", ""),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        ZSTD_CDict.const.p("cdict", "")
    )

    ZSTD_DDict.p(
        "createDDict",
        """
        Creates a digested dictionary, ready to start decompression operation without startup delay.

        {@code dictBuffer} can be released after {@code DDict} creation, as its content is copied inside {@code DDict}.
        """,

        void.const.p("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t("dictSize", "")
    )

    size_t(
        "freeDDict",
        "Frees memory allocated with #createDDict().",

        ZSTD_DDict.p("ddict", "")
    )

    size_t(
        "decompress_usingDDict",
        """
        Decompression using a digested Dictionary.

        Faster startup than #decompress_usingDict(), recommended when same dictionary is used multiple times.
        """,

        ZSTD_DCtx.p("dctx", ""),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        ZSTD_DDict.const.p("ddict", "")
    )

    /****************************
    *  Streaming
    ****************************/

    ZSTD_CStream.p(
        "createCStream",
        """
        A {@code ZSTD_CStream} object is required to track streaming operation.

        Use {@code ZSTD_createCStream()} and #freeCStream() to create/release resources.

        {@code ZSTD_CStream} objects can be reused multiple times on consecutive compression operations. It is recommended to re-use {@code ZSTD_CStream} in
        situations where many streaming operations will be achieved consecutively, since it will play nicer with system's memory, by re-using already allocated
        memory. Use one separate {@code ZSTD_CStream} per thread for parallel execution.
        """,
        void()
    )

    size_t(
        "freeCStream",
        "Frees memory allocated by #createCStream().",

        ZSTD_CStream.p("zcs", "")
    )

    size_t(
        "initCStream",
        "Use {@code ZSTD_initCStream()} to start a new compression operation.",

        ZSTD_CStream.p("zcs", ""),
        int("compressionLevel", "")
    )

    size_t(
        "compressStream",
        """
        Use {@code ZSTD_compressStream()} as many times as necessary to consume input stream.

        The function will automatically update both {@code pos} fields within {@code input} and {@code output}. Note that the function may not consume the
        entire input, for example, because the output buffer is already full, in which case {@code input.pos < input.size}. The caller must check if input has
        been entirely consumed. If not, the caller must make some room to receive more compressed data, typically by emptying output buffer, or allocating a
        new output buffer, and then present again remaining input data.
        """,

        ZSTD_CStream.p("zcs", ""),
        Input..ZSTD_outBuffer.p("output", ""),
        Input..ZSTD_inBuffer.p("input", ""),

        returnDoc =
        """
        a size hint, preferred {@code nb} of bytes to use as input for next function call or an error code, which can be tested using #isError().

        Notes:
        ${ol(
            "it's just a hint, to help latency a little, any other value will work fine",
            "size hint is guaranteed to be &le; #CStreamInSize()"
        )}
        """
    )

    size_t(
        "flushStream",
        """
        At any moment, it's possible to flush whatever data might remain stuck within internal buffer, using {@code ZSTD_flushStream()}.

        {@code output->pos} will be updated. Note that, if {@code output->size} is too small, a single invocation of {@code ZSTD_flushStream()} might not be
        enough (return code &gt; 0). In which case, make some room to receive more compressed data, and call again {@code ZSTD_flushStream()}.
        """.trimIndent(),

        ZSTD_CStream.p("zcs", ""),
        Input..ZSTD_outBuffer.p("output", ""),

        returnDoc =
        """
        ${ul(
            "0 if internal buffers are entirely flushed,",
            "&gt;0 if some data still present within internal buffer (the value is minimal estimation of remaining size),",
            "or an error code, which can be tested using #isError()"
        )}
        """
    )

    size_t(
        "endStream",
        """
        {@code ZSTD_endStream()} instructs to finish a frame.

        It will perform a flush and write frame epilogue. The epilogue is required for decoders to consider a frame completed. {@code flush()} operation is the
        same, and follows same rules as #flushStream().
        """.trimIndent(),

        ZSTD_CStream.p("zcs", ""),
        Input..ZSTD_outBuffer.p("output", ""),

        returnDoc =
        """
        0 if frame fully completed and fully flushed, or &gt; 0 if some data is still present within internal buffer (value is minimum size estimation for
        remaining data to flush, but it could be more) or an error code, which can be tested using #isError()
        """
    )

    size_t(
        "CStreamInSize",
        "Returns the recommended size for input buffer.",
        void()
    )

    size_t(
        "CStreamOutSize",
        "Returns the recommended size for output buffer. Guarantee to successfully flush at least one complete compressed block in all circumstances.",
        void()
    )

    ZSTD_DStream.p(
        "createDStream",
        """
        A {@code ZSTD_DStream} object is required to track streaming operations.

        Use {@code ZSTD_createDStream()} and #freeDStream() to create/release resources. {@code ZSTD_DStream} objects can be re-used multiple times.
        """,
        void()
    )

    size_t(
        "freeDStream",
        "Frees memory allocated by #createDStream().",

        ZSTD_DStream.p("zds", "")
    )

    size_t(
        "initDStream",
        "Use {@code ZSTD_initDStream()} to start a new decompression operation.",

        ZSTD_DStream.p("zds", ""),

        returnDoc = "recommended first input size"
    )

    size_t(
        "decompressStream",
        """
        Use {@code ZSTD_decompressStream()} repetitively to consume your input.

        The function will update both {@code pos} fields. If {@code input.pos < input.size}, some input has not been consumed. It's up to the caller to present
        again remaining data. The function tries to flush all data decoded immediately, respecting buffer sizes.  If {@code output.pos < output.size}, decoder
        has flushed everything it could. But if {@code output.pos == output.size}, there is no such guarantee, it's likely that some decoded data was not
        flushed and still remains within internal buffers. In which case, call {@code ZSTD_decompressStream()} again to flush whatever remains in the buffer.
        When no additional input is provided, amount of data flushed is necessarily &le; #BLOCKSIZE_MAX.
        """,

        ZSTD_DStream.p("zds", ""),
        Input..ZSTD_outBuffer.p("output", ""),
        Input..ZSTD_inBuffer.p("input", ""),

        returnDoc =
        """
        0 when a frame is completely decoded and fully flushed, an error code, which can be tested using #isError(), any other value &gt; 0, which means there
        is still some decoding to do to complete current frame. The return value is a suggested next input size (a hint to improve latency) that will never
        load more than the current frame.
        """
    )

    size_t(
        "DStreamInSize",
        "Returns the recommended size for input buffer.",
        void()
    )

    size_t(
        "DStreamOutSize",
        "Returns the recommended size for output buffer. Guarantee to successfully flush at least one complete compressed block in all circumstances.",
        void()
    )
}