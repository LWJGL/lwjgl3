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
#include "zstd.h"
ENABLE_WARNINGS()""")

    documentation =
        """
        Native bindings to ${url("http://facebook.github.io/zstd/", "Zstandard")} (zstd), a fast lossless compression algorithm, targeting real-time
        compression scenarios at zlib-level and better compression ratios.

        <h3>Introduction</h3>

        zstd, short for Zstandard, is a fast lossless compression algorithm, targeting real-time compression scenarios at zlib-level and better compression
        ratios. The zstd compression library provides in-memory compression and decompression functions. The library supports compression levels from 1 up to
        #maxCLevel() which is currently 22. Levels &ge; 20, labeled {@code --ultra}, should be used with caution, as they require more memory.

        Compression can be done in:
        ${ul(
            "a single step (described as Simple API)",
            "a single step, reusing a context (described as Explicit context)",
            "unbounded multiple steps (described as Streaming compression)"
        )}

        The compression ratio achievable on small data can be highly improved using a dictionary in:
        ${ul(
            "a single step (described as Simple dictionary API)",
            "a single step, reusing a dictionary (described as Bulk-processing dictionary API)"
        )}

        Advanced experimental functions can be accessed using {@code \#define ZSTD_STATIC_LINKING_ONLY} before including {@code zstd.h}. Advanced experimental
        APIs shall never be used with a dynamic library. They are not "stable", their definition may change in the future. Only static linking is allowed.

        <h3>Streaming compression - HowTo</h3>

        A {@code ZSTD_CStream} object is required to track streaming operation.

        Use #createCStream() and #freeCStream() to create/release resources. {@code ZSTD_CStream} objects can be reused multiple times on consecutive
        compression operations. It is recommended to re-use {@code ZSTD_CStream} in situations where many streaming operations will be achieved consecutively,
        since it will play nicer with system's memory, by re-using already allocated memory. Use one separate {@code ZSTD_CStream} per thread for parallel
        execution.

        Start a new compression by initializing {@code ZSTD_CStream}. Use #initCStream() to start a new compression operation. Use
        {@code ZSTD_initCStream_usingDict()} or {@code ZSTD_initCStream_usingCDict()} for a compression which requires a dictionary (experimental section).

        Use #compressStream() repetitively to consume input stream. The function will automatically update both {@code pos} fields. Note that it may not
        consume the entire input, in which case {@code pos < size}, and it's up to the caller to present again remaining data.

        At any moment, it's possible to flush whatever data remains within internal buffer, using #flushStream(). {@code output->pos} will be updated. Note
        that some content might still be left within internal buffer if {@code output->size} is too small.

        #endStream() instructs to finish a frame. It will perform a flush and write frame epilogue. The epilogue is required for decoders to consider a frame
        completed. #endStream() may not be able to flush full data if {output->size} is too small. In which case, call again #endStream() to complete the
        flush.

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
        "VERSION_RELEASE".."4"
    )

    IntConstant("Version number.", "VERSION_NUMBER".."(ZSTD_VERSION_MAJOR *100*100 + ZSTD_VERSION_MINOR *100 + ZSTD_VERSION_RELEASE)")
    StringConstant("Version string.", "VERSION_STRING".."""ZSTD_VERSION_MAJOR + "." + ZSTD_VERSION_MINOR + "." + ZSTD_VERSION_RELEASE""")

    unsigned("versionNumber", "Returns the version number.")
    Nonnull..charASCII.const.p("versionString", "Returns the version string.")

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

        void.p.OUT("dst", ""),
        AutoSize("dst")..size_t.IN("dstCapacity", ""),
        void.const.p.IN("src", ""),
        AutoSize("src")..size_t.IN("srcSize", ""),
        int.IN("compressionLevel", ""),

        returnDoc = "compressed size written into {@code dst} (&le; {@code dstCapacity}), or an error code if it fails (which can be tested using #isError())."
    )

    size_t(
        "decompress",
        "",

        void.p.OUT("dst", ""),
        AutoSize("dst")..size_t.IN(
            "dstCapacity",
            """
            is an upper bound of {@code originalSize} to regenerate. If user cannot imply a maximum upper bound, it's better to use streaming mode to
            decompress data.
            """
        ),
        void.const.p.IN("src", ""),
        AutoSize("src")..size_t.IN("compressedSize", "must be the <b>exact</b> size of some number of compressed and/or skippable frames"),

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
            implicit limit, as #decompress() only needs an upper bound of decompressed size. (For example, data could be necessarily cut into blocks <= 16 KB).
            """,
            "decompressed size is always present when compression is done with #compress()",
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

        void.const.p.IN("src", "should point to the start of a ZSTD encoded frame"),
        AutoSize("src")..size_t.IN("srcSize", "must be at least as large as the frame header. Hint: any size &ge; #FRAMEHEADERSIZE_MAX is large enough."),

        returnDoc =
        """
        decompressed size of the frame in {@code src}, if known
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

        size_t.IN("srcSize", "")
    )

    unsigned_intb(
        "isError",
        "Tells if a {@code size_t} function result is an error code.",

        size_t.IN("code", "")
    )

    Nonnull..charASCII.const.p(
        "getErrorName",
        "Provides readable string from an error code.",

        size_t.IN("code", "")
    )

    int(
        "maxCLevel",
        "Returns the maximum compression level available."
    )

    /***************************************
    *  Explicit context
    ***************************************/

    ZSTD_CCtx.p(
        "createCCtx",
        """
        Creates a compression context.

        When compressing many times, it is recommended to allocate a context just once, and re-use it for each successive compression operation. This will make
        workload friendlier for system's memory. Use one context per thread for parallel execution in multi-threaded environments.
        """
    )

    size_t(
        "freeCCtx",
        "Frees memory allocated by #createCCtx().",

        ZSTD_CCtx.p.IN("cctx", "")
    )

    size_t(
        "compressCCtx",
        "Same as #compress(), requires an allocated {@code ZSTD_CCtx} (see #createCCtx()).",

        ZSTD_CCtx.p.IN("ctx", ""),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        int.IN("compressionLevel", "")
    )

    ZSTD_DCtx.p(
        "createDCtx",
        """
        Creates a decompression context.

        When decompressing many times, it is recommended to allocate a context only once, and re-use it for each successive compression operation. This will
        make workload friendlier for system's memory. Use one context per thread for parallel execution.
        """
    )

    size_t(
        "freeDCtx",
        "Frees memory allocated by #createDCtx().",

        ZSTD_DCtx.p.IN("dctx", "")
    )

    size_t(
        "decompressDCtx",
        "Same as #decompress(), requires an allocated {@code ZSTD_DCtx} (see #createDCtx()).",

        ZSTD_DCtx.p.IN("ctx", ""),
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

        ZSTD_CCtx.p.IN("ctx", ""),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        nullable..void.const.p.IN("dict", ""),
        AutoSize("dict")..size_t.IN("dictSize", ""),
        int.IN("compressionLevel", "")
    )

    size_t(
        "decompress_usingDict",
        """
        Decompression using a predefined Dictionary (see {@code dictBuilder/zdict.h}). Dictionary must be identical to the one used during compression.

        This function loads the dictionary, resulting in significant startup delay.

        When {@code dict == NULL || dictSize < 8} no dictionary is used.
        """,

        ZSTD_DCtx.p.IN("dctx", ""),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        nullable..void.const.p.IN("dict", ""),
        AutoSize("dict")..size_t.IN("dictSize", "")
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
        """,

        void.const.p.IN("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t.IN("dictSize", ""),
        int.IN("compressionLevel", "")
    )

    size_t(
        "freeCDict",
        "Frees memory allocated by #createCDict().",

        ZSTD_CDict.p.IN("CDict", "")
    )

    size_t(
        "compress_usingCDict",
        """
        Compression using a digested Dictionary.

        Faster startup than #compress_usingDict(), recommended when same dictionary is used multiple times. Note that compression level is decided during
        dictionary creation. Frame parameters are hardcoded ({@code dictID=yes, contentSize=yes, checksum=no})
        """,

        ZSTD_CCtx.p.IN("cctx", ""),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        ZSTD_CDict.const.p.IN("cdict", "")
    )

    ZSTD_DDict.p(
        "createDDict",
        """
        Creates a digested dictionary, ready to start decompression operation without startup delay.

        {@code dictBuffer} can be released after {@code DDict} creation, as its content is copied inside {@code DDict}.
        """,

        void.const.p.IN("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t.IN("dictSize", "")
    )

    size_t(
        "freeDDict",
        "Frees memory allocated with #createDDict().",

        ZSTD_DDict.p.IN("ddict", "")
    )

    size_t(
        "decompress_usingDDict",
        """
        Decompression using a digested Dictionary.

        Faster startup than #decompress_usingDict(), recommended when same dictionary is used multiple times.
        """,

        ZSTD_DCtx.p.IN("dctx", ""),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        ZSTD_DDict.const.p.IN("ddict", "")
    )

    /****************************
    *  Streaming
    ****************************/

    ZSTD_CStream.p(
        "createCStream",
        ""
    )

    size_t(
        "freeCStream",
        "Frees memory allocated by #createCStream().",

        ZSTD_CStream.p.IN("zcs", "")
    )

    size_t(
        "initCStream",
        "",

        ZSTD_CStream.p.IN("zcs", ""),
        int.IN("compressionLevel", "")
    )

    size_t(
        "compressStream",
        "",

        ZSTD_CStream.p.IN("zcs", ""),
        ZSTD_outBuffer.p.IN("output", ""),
        ZSTD_inBuffer.p.IN("input", ""),

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
        "",

        ZSTD_CStream.p.IN("zcs", ""),
        ZSTD_outBuffer.p.IN("output", ""),

        returnDoc = "{@code nb} of bytes still present within internal buffer (0 if it's empty) or an error code, which can be tested using #isError()"
    )

    size_t(
        "endStream",
        "",

        ZSTD_CStream.p.IN("zcs", ""),
        ZSTD_outBuffer.p.IN("output", ""),

        returnDoc =
        """
        0 if frame fully completed and fully flushed, or &gt; 0 if some data is still present within internal buffer (value is minimum size estimation for
        remaining data to flush, but it could be more) or an error code, which can be tested using #isError()
        """
    )

    size_t(
        "CStreamInSize",
        "Returns the recommended size for input buffer."
    )

    size_t(
        "CStreamOutSize",
        "Returns the recommended size for output buffer. Guarantee to successfully flush at least one complete compressed block in all circumstances."
    )

    ZSTD_DStream.p(
        "createDStream",
        ""
    )

    size_t(
        "freeDStream",
        "Frees memory allocated by #createDStream().",

        ZSTD_DStream.p.IN("zds", "")
    )

    size_t(
        "initDStream",
        "",

        ZSTD_DStream.p.IN("zds", ""),

        returnDoc = "recommended first input size"
    )

    size_t(
        "decompressStream",
        "",

        ZSTD_DStream.p.IN("zds", ""),
        ZSTD_outBuffer.p.IN("output", ""),
        ZSTD_inBuffer.p.IN("input", ""),

        returnDoc =
        """
        0 when a frame is completely decoded and fully flushed, an error code, which can be tested using #isError(), any other value &gt; 0, which means there
        is still some decoding to do to complete current frame. The return value is a suggested next input size (a hint to improve latency) that will never
        load more than the current frame.
        """
    )

    size_t(
        "DStreamInSize",
        "Returns the recommended size for input buffer."
    )

    size_t(
        "DStreamOutSize",
        "Returns the recommended size for output buffer. Guarantee to successfully flush at least one complete compressed block in all circumstances."
    )
}