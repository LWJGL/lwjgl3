/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package zstd.templates

import org.lwjgl.generator.*
import zstd.*

val Zstd = "Zstd".nativeClass(Module.ZSTD, prefix = "ZSTD", prefixMethod = "ZSTD_") {
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
        compression operations. It is recommended to re-use {@code ZSTD_CStream} since it will play nicer with system's memory, by re-using already allocated
        memory.

        For parallel execution, use one separate {@code ZSTD_CStream}.

        Since v1.3.0, {@code ZSTD_CStream} and {@code ZSTD_CCtx} are the same thing.

        Parameters are sticky: when starting a new compression on the same context, it will re-use the same sticky parameters as previous compression session.
        When in doubt, it's recommended to fully initialize the context before usage. Use #CCtx_reset() to reset the context and #CCtx_setParameter(),
        #CCtx_setPledgedSrcSize(), or #CCtx_loadDictionary() and friends to set more specific parameters, the pledged source size, or load a dictionary.

        Use #compressStream2() with #e_continue as many times as necessary to consume input stream. The function will automatically update both {@code pos}
        fields within {@code input} and {@code output}. Note that the function may not consume the entire input, for example, because the output buffer is
        already full, in which case {@code input.pos < input.size}. The caller must check if input has been entirely consumed. If not, the caller must make
        some room to receive more compressed data, and then present again remaining input data.

        Note: {@code ZSTD_e_continue} is guaranteed to make some forward progress when called, but doesn't guarantee maximal forward progress. This is
        especially relevant when compressing with multiple threads. The call won't block if it can consume some input, but if it can't it will wait for some,
        but not all, output to be flushed.

        At any moment, it's possible to flush whatever data might remain stuck within internal buffer, using {@code ZSTD_compressStream2()} with #e_flush.
        {@code output->pos} will be updated. Note that, if {@code output->size} is too small, a single invocation with {@code ZSTD_e_flush} might not be enough
        (return code &gt; 0). In which case, make some room to receive more compressed data, and call again {@code ZSTD_compressStream2()} with
        {@code ZSTD_e_flush}. You must continue calling {@code ZSTD_compressStream2()} with {@code ZSTD_e_flush} until it returns 0, at which point you can
        change the operation.

        Note: {@code ZSTD_e_flush} will flush as much output as possible, meaning when compressing with multiple threads, it will block until the flush is
        complete or the output buffer is full.

        Calling {@code ZSTD_compressStream2()} with #e_end instructs to finish a frame. It will perform a flush and write frame epilogue. The epilogue is
        required for decoders to consider a frame completed. Flush operation is the same, and follows same rules as calling {@code ZSTD_compressStream2()} with
        {@code ZSTD_e_flush}. You must continue calling {@code ZSTD_compressStream2()} with {@code ZSTD_e_end} until it returns 0, at which point you are free
        to start a new frame.

        Note: {@code ZSTD_e_end} will flush as much output as possible, meaning when compressing with multiple threads, it will block until the flush is
        complete or the output buffer is full.

        <h3>Streaming decompression - HowTo</h3>

        A {@code ZSTD_DStream} object is required to track streaming operations.

        Use #createDStream() and #freeDStream() to create/release resources. {@code ZSTD_DStream} objects can be re-used multiple times.

        Use #DCtx_reset() and #DCtx_refDDict() to start a new decompression operation. Alternatively, use advanced API to set specific properties.

        Use #decompressStream() repetitively to consume your input. The function will update both {@code pos} fields. If {@code input.pos < input.size}, some
        input has not been consumed. It's up to the caller to present again remaining data. The function tries to flush all data decoded immediately,
        respecting output buffer size. If {@code output.pos < output.size}, decoder has flushed everything it could. But if {@code output.pos == output.size},
        there might be some data left within internal buffers. In which case, call {@code ZSTD_decompressStream()} again to flush whatever remains in the
        buffer.

        Note: with no additional input provided, amount of data flushed is necessarily &le; #BLOCKSIZE_MAX.
        """

    IntConstant(
        "Version number part.",

        "VERSION_MAJOR".."1",
        "VERSION_MINOR".."4",
        "VERSION_RELEASE".."9"
    )

    IntConstant("Version number.", "VERSION_NUMBER".."(ZSTD_VERSION_MAJOR *100*100 + ZSTD_VERSION_MINOR *100 + ZSTD_VERSION_RELEASE)")
    StringConstant("Version string.", "VERSION_STRING".."""ZSTD_VERSION_MAJOR + "." + ZSTD_VERSION_MINOR + "." + ZSTD_VERSION_RELEASE""")

    unsigned("versionNumber", "Returns runtime library version, the value is {@code (MAJOR*100*100 + MINOR*100 + RELEASE)}.", void())
    Nonnull..charASCII.const.p("versionString", "Returns runtime library version, like \"1.4.5\".", void())

    IntConstant(
        "Default compression level.",

        "CLEVEL_DEFAULT".."3"
    )

    IntConstant("", "MAGICNUMBER".."0xFD2FB528")
    IntConstant("", "MAGIC_DICTIONARY".."0xEC30A437")
    IntConstant("", "MAGIC_SKIPPABLE_START".."0x184D2A50")
    IntConstant("", "MAGIC_SKIPPABLE_MASK".."0xFFFFFFF0")
    IntConstant("", "BLOCKSIZELOG_MAX".."17")
    IntConstant("", "BLOCKSIZE_MAX".."(1<<ZSTD_BLOCKSIZELOG_MAX)")

    LongConstant(
        "Content size.",

        "CONTENTSIZE_UNKNOWN"..("-1L"),
        "CONTENTSIZE_ERROR"..("-2L")
    )

    EnumConstant(
        "Compression strategies, listed from fastest to strongest. ({@code ZSTD_strategy})",

        "fast".enum("", "1"),
        "dfast".enum,
        "greedy".enum,
        "lazy".enum,
        "lazy2".enum,
        "btlazy2".enum,
        "btopt".enum,
        "btultra".enum,
        "btultra2".enum
    )

    val cParameters = EnumConstant(
        """
        Compression parameters. ({@code ZSTD_cParameter})

        Note: When compressing with a {@code ZSTD_CDict} these parameters are superseded by the parameters used to construct the {@code ZSTD_CDict}. See
        #CCtx_refCDict() for more info.
        """,

        "c_compressionLevel".enum(
            """
            Set compression parameters according to pre-defined {@code cLevel} table.

            Note that exact compression parameters are dynamically determined, depending on both compression level and {@code srcSize} (when known). Default
            level is #CLEVEL_DEFAULT{@code ==3}. Special: value 0 means default, which is controlled by {@code ZSTD_CLEVEL_DEFAULT}.

            Note 1: it's possible to pass a negative compression level.

            Note 2: setting a level does not automatically set all other compression parameters to default. Setting this will however eventually dynamically
            impact the compression parameters which have not been manually set. The manually set ones will 'stick'.
            """,
            "100"
        ),
        "c_windowLog".enum(
            """
            Maximum allowed back-reference distance, expressed as power of 2.

            This will set a memory budget for streaming decompression, with larger values requiring more memory and typically compressing more. Must be clamped
            between #WINDOWLOG_MIN and #WINDOWLOG_MAX. Special: value 0 means "use default {@code windowLog}".

            Note: Using a {@code windowLog} greater than #WINDOWLOG_LIMIT_DEFAULT requires explicitly allowing such size at streaming decompression stage.
            """
        ),
        "c_hashLog".enum(
            """
            Size of the initial probe table, as a power of 2.

            Resulting memory usage is (1 &lt;&lt; {@code (hashLog+2)}). Must be clamped between #HASHLOG_MIN and #HASHLOG_MAX. Larger tables improve
            compression ratio of strategies &le; dFast, and improve speed of strategies &gt; dFast. Special: value 0 means "use default {@code hashLog}".
            """
        ),
        "c_chainLog".enum(
            """
            Size of the multi-probe search table, as a power of 2.

            Resulting memory usage is (1 &lt;&lt; {@code (chainLog+2)}). Must be clamped between #CHAINLOG_MIN and #CHAINLOG_MAX. Larger tables result in
            better and slower compression. This parameter is useless for "fast" strategy. It's still useful when using "dfast" strategy, in which case it
            defines a secondary probe table. Special: value 0 means "use default {@code chainLog}".
            """
        ),
        "c_searchLog".enum(
            """
            Number of search attempts, as a power of 2.

            More attempts result in better and slower compression. This parameter is useless for "fast" and "dFast" strategies. Special: value 0 means "use
            default {@code searchLog}".
            """
        ),
        "c_minMatch".enum(
            """
            Minimum size of searched matches. Note that Zstandard can still find matches of smaller size, it just tweaks its search algorithm to look for this
            size and larger. Larger values increase compression and decompression speed, but decrease ratio. Must be clamped between #MINMATCH_MIN and
            #MINMATCH_MAX. Note that currently, for all strategies &lt;btopt, effective minimum is 4. , for all strategies &gt; fast, effective maximum is 6.
            Special: value 0 means "use default {@code minMatchLength}".
            """
        ),
        "c_targetLength".enum(
            """
            Impact of this field depends on strategy. For strategies btopt, btultra &amp; btultra2: Length of Match considered "good enough" to stop search.
            Larger values make compression stronger, and slower. For strategy fast: Distance between match sampling. Larger values make compression faster, and
            weaker. Special: value 0 means "use default targetLength".
            """
        ),
        "c_strategy".enum(
            """
            See {@code ZSTD_strategy} enum definition. The higher the value of selected strategy, the more complex it is, resulting in stronger and slower
            compression. Special: value 0 means "use default strategy".
            """
        ),
        "c_enableLongDistanceMatching".enum(
            """
            Enable long distance matching. This parameter is designed to improve compression ratio for large inputs, by finding large matches at long distance.
            It increases memory usage and window size. Note: enabling this parameter increases default #c_windowLog to 128 MB except when expressly set to a
            different value. Note: will be enabled by default if {@code ZSTD_c_windowLog &ge; 128 MB} and compression strategy
            {@code &ge; ZSTD_btopt (== compression level 16+)}.
            """,
            "160"
        ),
        "c_ldmHashLog".enum(
            """
            Size of the table for long distance matching, as a power of 2. Larger values increase memory usage and compression ratio, but decrease compression
            speed. Must be clamped between #HASHLOG_MIN and #HASHLOG_MAX default: windowlog - 7. Special: value 0 means "automatically determine hashlog".
            """
        ),
        "c_ldmMinMatch".enum(
            """
            Minimum match size for long distance matcher. Larger/too small values usually decrease compression ratio. Must be clamped between #LDM_MINMATCH_MIN
            and #LDM_MINMATCH_MAX. Special: value 0 means "use default value" (default: 64).
            """
        ),
        "c_ldmBucketSizeLog".enum(
            """
            Log size of each bucket in the LDM hash table for collision resolution. Larger values improve collision resolution but decrease compression speed.
            The maximum value is #LDM_BUCKETSIZELOG_MAX. Special: value 0 means "use default value" (default: 3).
            """
        ),
        "c_ldmHashRateLog".enum(
            """
            Frequency of inserting/looking up entries into the LDM hash table. Must be clamped between 0 and (#WINDOWLOG_MAX - #HASHLOG_MIN). Default
            is {@code MAX(0, (windowLog - ldmHashLog))}, optimizing hash table usage. Larger values improve compression speed. Deviating far from default value
            will likely result in a compression ratio decrease. Special: value 0 means "automatically determine {@code hashRateLog}".
            """
        ),
        "c_contentSizeFlag".enum(
            """
            Content size will be written into frame header _whenever known_ (default:1) Content size must be known at the beginning of compression. This is
            automatically the case when using #compress2(), For streaming scenarios, content size must be provided with #CCtx_setPledgedSrcSize().
            """,
            "200"
        ),
        "c_checksumFlag".enum("A 32-bits checksum of content is written at end of frame (default:0)"),
        "c_dictIDFlag".enum("When applicable, dictionary's ID is written into frame header (default:1)"),
        "c_nbWorkers".enum(
            """
            Select how many threads will be spawned to compress in parallel.
            
            When {@code nbWorkers &ge; 1}, triggers asynchronous mode when invoking {@code ZSTD_compressStream*()}: {@code ZSTD_compressStream*()} consumes
            input and flush output if possible, but immediately gives back control to caller, while compression work is performed in parallel, within worker
            thread(s). (note: a strong exception to this rule is when first invocation of #compressStream2() sets #e_end: in which case,
            {@code ZSTD_compressStream2()} delegates to #compress2(), which is always a blocking call). More workers improve speed, but also increase memory
            usage.
            
            Default value is {@code 0}, aka "single-threaded mode": no worker is spawned, compression is performed inside Caller's thread, and all invocations
            are blocking.
            """,
            "400"
        ),
        "c_jobSize".enum(
            """
            Size of a compression job. This value is enforced only when {@code nbWorkers &ge; 1}. Each compression job is completed in parallel, so this value
            can indirectly impact the nb of active threads. 0 means default, which is dynamically determined based on compression parameters. Job size must be
            a minimum of overlap size, or 1 MB, whichever is largest. The minimum size is automatically and transparently enforced.
            """
        ),
        "c_overlapLog".enum(
            """
            Control the overlap size, as a fraction of window size. The overlap size is an amount of data reloaded from previous job at the beginning of a new
            job. It helps preserve compression ratio, while each job is compressed in parallel. This value is enforced only when {@code nbWorkers &ge; 1}.
            Larger values increase compression ratio, but decrease speed. Possible values range from 0 to 9:

            ${ul(
                "0 means \"default\" : value will be determined by the library, depending on strategy",
                "1 means \"no overlap\"",
                """
                9 means "full overlap", using a full window size. Each intermediate rank increases/decreases load size by a factor 2: 9: full window; 8: w/2;
                7: w/4; 6: w/8; 5:w/16; 4: w/32; 3:w/64; 2:w/128; 1:no overlap; 0:default default value varies between 6 and 9, depending on strategy
                """
            )}
            """
        ),
        "c_experimentalParam1".enum("", "500"),
        "c_experimentalParam2".enum("", "10"),
        "c_experimentalParam3".enum("", "1000"),
        "c_experimentalParam4".enum,
        "c_experimentalParam5".enum,
        "c_experimentalParam6".enum,
        "c_experimentalParam7".enum,
        "c_experimentalParam8".enum,
        "c_experimentalParam9".enum,
        "c_experimentalParam10".enum,
        "c_experimentalParam11".enum,
        "c_experimentalParam12".enum
    ).javaDocLinks

    val resetDirectives = EnumConstant(
        "{@code ZSTD_ResetDirective}",

        "reset_session_only".enum("", "1"),
        "reset_parameters".enum,
        "reset_session_and_parameters".enum
    ).javaDocLinks

    val dParameters = EnumConstant(
        """
        The advanced API pushes parameters one by one into an existing {@code DCtx} context. Parameters are sticky, and remain valid for all following frames
        using the same {@code DCtx} context. It's possible to reset parameters to default values using #DCtx_reset().

        Note: This API is compatible with existing #decompressDCtx() and #decompressStream(). Therefore, no new decompression function is necessary.

        ({@code ZSTD_dParameter})
        """,

        "d_windowLogMax".enum(
            """
            Select a size limit (in power of 2) beyond which the streaming API will refuse to allocate memory buffer in order to protect the host from
            unreasonable memory requirements.

            This parameter is only useful in streaming mode, since no internal buffer is allocated in single-pass mode. By default, a decompression context
            accepts window sizes &le; (1 &lt;&lt; #WINDOWLOG_LIMIT_DEFAULT)

            Special: value 0 means "use default maximum windowLog".
            """,
            "100"
        ),
        "d_experimentalParam1".enum(
            """
            Note: additional experimental parameters are also available within the experimental section of the API. At the time of this writing, they include:
            ${ul(
                "#d_format",
                "#d_stableOutBuffer"
            )}

            Note: never ever use {@code experimentalParam}? names directly
            """,
            "1000"
        ),
        "d_experimentalParam2".enum,
        "d_experimentalParam3".enum,
        "d_experimentalParam4".enum
    ).javaDocLinks

    val endDirectives = EnumConstant(
        "{@code ZSTD_EndDirective}",

        "e_continue".enum("collect more data, encoder decides when to output compressed result, for optimal compression ratio", "0"),
        "e_flush".enum(
            """
            flush any data provided so far, it creates (at least) one new block, that can be decoded immediately on reception; frame will continue: any future
            data can still reference previously compressed data, improving compression.
            """
        ),
        "e_end".enum(
            """
            flush any remaining data <em>and</em> close current frame. note that frame is only closed after compressed data is fully flushed (return
            {@code value == 0}). After that point, any additional data starts a new frame.

            Note: each frame is independent (does not reference any content from previous frame).
            """
        )
    ).javaDocLinks

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

    size_t(
        "findFrameCompressedSize",
        "",

        void.const.p("src", "should point to the start of a ZSTD frame or skippable frame"),
        AutoSize("src")..size_t("srcSize", "must be &ge; first frame size"),

        returnDoc =
        """
        the compressed size of the first frame starting at {@code src}, suitable to pass as {@code srcSize} to #decompress() or similar, or an error code if
        input is invalid
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

    int("minCLevel", "Returns the minimum compression level available.", void())
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
        """
        Same as #compress(), using an explicit {@code ZSTD_CCtx}.

        Important: in order to behave similarly to {@code ZSTD_compress()}, this function compresses at requested compression level, <b>ignoring any other
        parameter</b>. If any advanced parameter was set using the advanced API, they will all be reset. Only {@code compressionLevel} remains.
        """,

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
        "Same as #decompress(), requires an allocated {@code ZSTD_DCtx}. Compatible with sticky parameters.",

        ZSTD_DCtx.p("ctx", ""),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"]
    )

    /****************************
    *  Advanced compression API
    *****************************/

    ZSTD_bounds(
        "cParam_getBounds",
        "All parameters must belong to an interval with lower and upper bounds, otherwise they will either trigger an error or be automatically clamped.",

        ZSTD_cParameter("cParam", "", cParameters),

        returnDoc =
        """
        a structure, {@code ZSTD_bounds}, which contains
        ${ul(
            "an error status field, which must be tested using #isError()",
            "lower and upper bounds, both inclusive"
        )}
        """
    )

    size_t(
        "CCtx_setParameter",
        """
        Set one compression parameter, selected by enum {@code ZSTD_cParameter}.

        All parameters have valid bounds. Bounds can be queried using #cParam_getBounds(). Providing a value beyond bound will either clamp it, or trigger an
        error (depending on parameter). Setting a parameter is generally only possible during frame initialization (before starting compression). Exception:
        when using multi-threading mode (nbWorkers &ge; 1), the following parameters can be updated <b>during</b> compression (within same frame): =&lt;
        compressionLevel, hashLog, chainLog, searchLog, minMatch, targetLength and strategy. new parameters will be active for next job only (after a
        {@code flush()}).
        """,

        ZSTD_CCtx.p("cctx", ""),
        ZSTD_cParameter("param", "", cParameters),
        int("value", ""),

        returnDoc = "an error code (which can be tested using #isError())"
    )

    size_t(
        "CCtx_setPledgedSrcSize",
        """
        Total input data size to be compressed as a single frame.

        Value will be written in frame header, unless if explicitly forbidden using #c_contentSizeFlag. This value will also be controlled at end of frame, and
        trigger an error if not respected.

        Note 1: {@code pledgedSrcSize==0} actually means zero, aka an empty frame. In order to mean "unknown content size", pass constant #CONTENTSIZE_UNKNOWN.
        {@code ZSTD_CONTENTSIZE_UNKNOWN} is default value for any new frame.

        Note 2: {@code pledgedSrcSize} is only valid once, for the next frame. It's discarded at the end of the frame, and replaced by
        {@code ZSTD_CONTENTSIZE_UNKNOWN}.

        Note 3 : Whenever all input data is provided and consumed in a single round, for example with #compress2(), or invoking immediately
        {@code ZSTD_compressStream2(,,,ZSTD_e_end)}, this value is automatically overridden by {@code srcSize} instead.
        """,

        ZSTD_CCtx.p("cctx", ""),
        unsigned_long_long("pledgedSrcSize", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())."
    )

    size_t(
        "CCtx_reset",
        """
        There are 2 different things that can be reset, independently or jointly :

        ${ul(
            """
            The session: will stop compressing current frame, and make {@code CCtx} ready to start a new one. Useful after an error, or to interrupt any
            ongoing compression. Any internal data not yet flushed is cancelled. Compression parameters and dictionary remain unchanged. They will be used to
            compress next frame. Resetting session never fails.
            """,
            """
            The parameters: changes all parameters back to "default". This removes any reference to any dictionary too. Parameters can only be changed between
            2 sessions (i.e. no compression is currently ongoing) otherwise the reset fails, and function returns an error value (which can be tested using
            #isError())
            """,
            "Both: similar to resetting the session, followed by resetting parameters."
        )}
        """,

        ZSTD_CCtx.p("cctx", ""),
        ZSTD_ResetDirective("reset", "", resetDirectives)
    )

    size_t(
        "compress2",
        """
        Behaves the same as #compressCCtx(), but compression parameters are set using the advanced API.

        {@code ZSTD_compress2()} always starts a new frame. Should cctx hold data from a previously unfinished frame, everything about it is forgotten.

        - Compression parameters are pushed into {@code CCtx} before starting compression, using {@code ZSTD_CCtx_set*()}
        - The function is always blocking, returns when compression is completed. Hint: compression runs faster if {@code dstCapacity} &ge;
        {@code ZSTD_compressBound(srcSize)}.
        """,

        ZSTD_CCtx.p("cctx", ""),
        void.p("dst", ""),
        AutoSize("dst")..size_t("dstCapacity", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", ""),

        returnDoc = "compressed size written into {@code dst} (&le; {@code dstCapacity}), or an error code if it fails (which can be tested using #isError())"
    )

    /***************************************
    *  Advanced decompression API
    ***************************************/

    ZSTD_bounds(
        "dParam_getBounds",
        "All parameters must belong to an interval with lower and upper bounds, otherwise they will either trigger an error or be automatically clamped.",

        ZSTD_dParameter("dParam", ""),

        returnDoc =
        """
        returns a structure, {@code ZSTD_bounds}, which contains - an error status field, which must be tested using #isError() - both lower and upper bounds,
        inclusive
        """
    )

    size_t(
        "DCtx_setParameter",
        """
        Set one compression parameter, selected by {@code enum ZSTD_dParameter}.

        All parameters have valid bounds. Bounds can be queried using #dParam_getBounds(). Providing a value beyond bound will either clamp it, or trigger an
        error (depending on parameter). Setting a parameter is only possible during frame initialization (before starting decompression).
        """,

        ZSTD_DCtx.p("dctx", ""),
        ZSTD_dParameter("param", "", dParameters),
        int("value", ""),

        returnDoc = "0, or an error code (which can be tested using #isError())"
    )

    size_t(
        "DCtx_reset",
        """
        Returns a {@code DCtx} to clean state.

        Session and parameters can be reset jointly or separately. Parameters can only be reset when no active frame is being decompressed.
        """,

        ZSTD_DCtx.p("dctx", ""),
        ZSTD_ResetDirective("reset", "", resetDirectives),

        returnDoc = "0, or an error code, which can be tested with #isError()"
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
        "compressStream2",
        """
        Behaves about the same as {@code ZSTD_compressStream()}, with additional control on end directive.

        ${ul(
            "Compression parameters are pushed into {@code CCtx} before starting compression, using {@code ZSTD_CCtx_set*()}.",
            "Compression parameters cannot be changed once compression is started (save a list of exceptions in multi-threading mode).",
            "{@code outpot->pos} must be &le; {@code dstCapacity}, {@code input->pos} must be &le; {@code srcSize}.",
            "{@code outpot->pos} and {@code input->pos} will be updated. They are guaranteed to remain below their respective limit.",
            "{@code endOp} must be a valid directive.",
            "When {@code nbWorkers==0} (default), function is blocking: it completes its job before returning to caller.",
            """
            When {@code nbWorkers&ge;1}, function is non-blocking: it copies a portion of input, distributes jobs to internal worker threads, flush to output
            whatever is available, and then immediately returns, just indicating that there is some data remaining to be flushed. The function nonetheless
            guarantees forward progress: it will return only after it reads or write at least 1+ byte.
            """,
            """
            Exception: if the first call requests a #e_end directive and provides enough {@code dstCapacity}, the function delegates to #compress2() which is
            always blocking.
            """
        )}
        """,

        ZSTD_CCtx.p("cctx", ""),
        Input..ZSTD_outBuffer.p("output", ""),
        Input..ZSTD_inBuffer.p("input", ""),
        ZSTD_EndDirective("endOp", "", endDirectives),

        returnDoc =
        """
        provides a minimum amount of data remaining to be flushed from internal buffers or an error code, which can be tested using #isError().

        If {@code != 0}, flush is not fully completed, there is still some data left within internal buffers. This is useful for #e_flush, since in this case
        more flushes are necessary to empty all buffers. For #e_end, {@code == 0} when internal buffers are fully flushed and frame is completed.

        - after a {@code ZSTD_e_end} directive, if internal buffer is not fully flushed ({@code != 0}), only {@code ZSTD_e_end} or {@code ZSTD_e_flush}
        operations are allowed. Before starting a new compression job, or changing compression parameters, it is required to fully flush internal buffers.
        """
    )

    size_t(
        "CStreamInSize",
        """
        Returns the recommended size for input buffer.
        
        These buffer sizes are softly recommended. They are not required: {@code ZSTD_compressStream*()} happily accepts any buffer size, for both input and
        output. Respecting the recommended size just makes it a bit easier for {@code ZSTD_compressStream*()}, reducing the amount of memory shuffling and
        buffering, resulting in minor performance savings.

        However, note that these recommendations are from the perspective of a C caller program. If the streaming interface is invoked from some other
        language, especially managed ones such as Java or Go, through a foreign function interface such as jni or cgo, a major performance rule is to reduce
        crossing such interface to an absolute minimum. It's not rare that performance ends being spent more into the interface, rather than compression
        itself. In which cases, prefer using large buffers, as large as practical, for both input and output, to reduce the nb of roundtrips.
        """,
        void()
    )

    size_t(
        "CStreamOutSize",
        "Returns the recommended size for output buffer. Guarantee to successfully flush at least one complete compressed block.",
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
        "decompressStream",
        """
        Use {@code ZSTD_decompressStream()} repetitively to consume your input.

        The function will update both {@code pos} fields. If {@code input.pos < input.size}, some input has not been consumed. It's up to the caller to present
        again remaining data. The function tries to flush all data decoded immediately, respecting output buffer size. If {@code output.pos < output.size},
        decoder has flushed everything it could. But if {@code output.pos == output.size}, there might be some data left within internal buffers. In which
        case, call {@code ZSTD_decompressStream()} again to flush whatever remains in the buffer. With no additional input provided, amount of data flushed is
        necessarily &le; #BLOCKSIZE_MAX.
        """,

        ZSTD_DStream.p("zds", ""),
        Input..ZSTD_outBuffer.p("output", ""),
        Input..ZSTD_inBuffer.p("input", ""),

        returnDoc =
        """
        0 when a frame is completely decoded and fully flushed, an error code, which can be tested using #isError(), any other value &gt; 0, which means there
        is still some decoding to do to complete current frame. The return value is a suggested next input size (just a hint to improve latency) that will
        never request more than the remaining frame size.
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

    /**************************
    *  Simple dictionary API
    ***************************/

    size_t(
        "compress_usingDict",
        """
        Compression at an explicit compression level using a Dictionary.

        A dictionary can be any arbitrary data segment (also called a prefix), or a buffer with specified information (see {@code dictBuilder/zdict.h}).

        This function loads the dictionary, resulting in significant startup delay. It's intended for a dictionary used only once.

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
        Decompression using a known Dictionary. Dictionary must be identical to the one used during compression.

        This function loads the dictionary, resulting in significant startup delay. It's intended for a dictionary used only once.

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
        When compressing multiple messages or blocks using the same dictionary, it's recommended to digest the dictionary only once, since it's a costly
        operation. {@code ZSTD_createCDict()} will create a state from digesting a dictionary.

        The resulting state can be used for future compression operations with very limited startup cost. {@code ZSTD_CDict} can be created once and shared by
        multiple threads concurrently, since its usage is read-only.

        {@code dictBuffer} can be released after {@code ZSTD_CDict} creation, because its content is copied within CDict. Consider experimental function
        #createCDict_byReference() if you prefer to not duplicate {@code dictBuffer} content.

        Note 1: Consider experimental function #createCDict_byReference() if you prefer to not duplicate {@code dictBuffer} content.

        Note 2: A {@code ZSTD_CDict} can be created from an empty {@code dictBuffer}, in which case the only thing that it transports is the
        {@code compressionLevel}. This can be useful in a pipeline featuring #compress_usingCDict() exclusively, expecting a {@code ZSTD_CDict} parameter with
        any data, including those without a known dictionary.
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
        Compression using a digested Dictionary. Recommended when same dictionary is used multiple times.

        Compression level is <b>decided at dictionary creation time</b>, and frame parameters are hardcoded ({@code dictID=yes, contentSize=yes, checksum=no})
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

        Recommended when same dictionary is used multiple times.
        """,

        ZSTD_DCtx.p("dctx", ""),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        ZSTD_DDict.const.p("ddict", "")
    )

    unsigned_int(
        "getDictID_fromDict",
        "Provides the {@code dictID} stored within dictionary.",

        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),

        returnDoc = "if {@code == 0}, the dictionary is not conformant with Zstandard specification. It can still be loaded, but as a content-only dictionary."
    )

    unsigned_int(
        "getDictID_fromDDict",
        "Provides the {@code dictID} of the dictionary loaded into {@code ddict}.",

        ZSTD_DDict.const.p("ddict", ""),

        returnDoc =
        """
        if {@code == 0}, the dictionary is not conformant to Zstandard specification, or empty.

        Non-conformant dictionaries can still be loaded, but as content-only dictionaries.
        """
    )

    unsigned_int(
        "getDictID_fromFrame",
        "Provides the dictID required to decompressed the frame stored within {@code src}.",

        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", ""),

        returnDoc =
        """
        if {@code == 0}, the {@code dictID} could not be decoded. This could for one of the following reasons :

        ${ul(
            "The frame does not require a dictionary to be decoded (most common case).",
            """
            The frame was built with {@code dictID} intentionally removed. Whatever dictionary is necessary is a hidden information.

            Note: this use case also happens when using a non-conformant dictionary.
            """,
            "{@code srcSize} is too small, and as a result, the frame header could not be decoded (only possible if {@code srcSize} &lt; #FRAMEHEADERSIZE_MAX).",
            """
            This is not a Zstandard frame. When identifying the exact failure cause, it's possible to use #getFrameHeader(), which will provide a more precise
            error code.
            """
        )}
        """
    )
        size_t(
        "CCtx_loadDictionary",
        """
        Creates an internal {@code CDict} from {@code dict} buffer. Decompression will have to use same dictionary.

        Special: Loading a #NULL (or 0-size) dictionary invalidates previous dictionary, meaning "return to no-dictionary mode".

        Note 1: Dictionary is sticky, it will be used for all future compressed frames. To return to "no-dictionary" situation, load a #NULL dictionary (or
        reset parameters).

        Note 2: Loading a dictionary involves building tables. It's also a CPU consuming operation, with non-negligible impact on latency. Tables are dependent
        on compression parameters, and for this reason, compression parameters can no longer be changed after loading a dictionary.

        Note 3: {@code dict} content will be copied internally. Use experimental #CCtx_loadDictionary_byReference() to reference content instead. In such a
        case, dictionary buffer must outlive its users.

        Note 4: Use #CCtx_loadDictionary_advanced() to precisely select how dictionary content must be interpreted.
        """,

        ZSTD_CCtx.p("cctx", ""),
        nullable..void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())."
    )

    size_t(
        "CCtx_refCDict",
        """
        References a prepared dictionary, to be used for all next compressed frames.

        Note that compression parameters are enforced from within {@code CDict}, and supercede any compression parameter previously set within {@code CCtx}.
        The parameters ignored are labelled as "superseded-by-cdict" in the {@code ZSTD_cParameter} enum docs. The ignored parameters will be used again if the
        {@code CCtx} is returned to no-dictionary mode. The dictionary will remain valid for future compressed frames using same {@code CCtx}.

        Special: Referencing a #NULL {@code CDict} means "return to no-dictionary mode".

        Note 1: Currently, only one dictionary can be managed. Referencing a new dictionary effectively "discards" any previous one.

        Note 2: {@code CDict} is just referenced, its lifetime must outlive its usage within {@code CCtx}.
        """,

        ZSTD_CCtx.p("cctx", ""),
        nullable..ZSTD_CDict.const.p("cdict", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())."
    )

    size_t(
        "CCtx_refPrefix",
        """
        References a prefix (single-usage dictionary) for next compressed frame.

        A prefix is <b>only used once</b>. Tables are discarded at end of frame (#e_end). Decompression will need same prefix to properly regenerate data.
        Compressing with a prefix is similar in outcome as performing a diff and compressing it, but performs much faster, especially during decompression
        (compression speed is tunable with compression level).

        Special: Adding any prefix (including #NULL) invalidates any previous prefix or dictionary

        Note 1: Prefix buffer is referenced. It <b>must</b> outlive compression. Its content must remain unmodified during compression.

        Note 2: If the intention is to diff some large {@code src} data blob with some prior version of itself, ensure that the window size is large enough to
        contain the entire source. See #c_windowLog.

        Note 3: Referencing a prefix involves building tables, which are dependent on compression parameters. It's a CPU consuming operation, with
        non-negligible impact on latency. If there is a need to use the same prefix multiple times, consider {@code loadDictionary} instead.

        Note 4: By default, the prefix is interpreted as raw content (#dct_rawContent). Use experimental #CCtx_refPrefix_advanced() to alter dictionary
        interpretation.
        """,

        ZSTD_CCtx.p("cctx", ""),
        nullable..void.const.p("prefix", ""),
        AutoSize("prefix")..size_t("prefixSize", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())."
    )

    size_t(
        "DCtx_loadDictionary",
        """
        Create an internal {@code DDict} from {@code dict} buffer, to be used to decompress next frames. The dictionary remains valid for all future frames,
        until explicitly invalidated.

        Special: Adding a #NULL (or 0-size) dictionary invalidates any previous dictionary, meaning "return to no-dictionary mode".

        Note 1: Loading a dictionary involves building tables, which has a non-negligible impact on CPU usage and latency. It's recommended to "load once, use
        many times", to amortize the cost.

        Note 2: {@code dict} content will be copied internally, so {@code dict} can be released after loading. Use #DCtx_loadDictionary_byReference() to
        reference dictionary content instead.

        Note 3: Use #DCtx_loadDictionary_advanced() to take control of how dictionary content is loaded and interpreted.
        """,

        ZSTD_DCtx.p("dctx", ""),
        nullable..void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),

        returnDoc = "0, or an error code (which can be tested with ZSTD_isError())"
    )

    size_t(
        "DCtx_refDDict",
        """
        References a prepared dictionary, to be used to decompress next frames. The dictionary remains active for decompression of future frames using same
        {@code DCtx}.
        
        If called with {@code ZSTD_d_refMultipleDDicts} enabled, repeated calls of this function  will store the {@code DDict} references in a table, and the
        {@code DDict} used for decompression will be determined at decompression time, as per the {@code dict ID} in the frame. The memory for the table is
        allocated on the first call to {@code refDDict}, and can be freed with #freeDCtx().

        Note 1: Currently, only one dictionary can be managed. Referencing a new dictionary effectively "discards" any previous one. Special: referencing a
        #NULL {@code DDict} means "return to no-dictionary mode".

        Note 2: {@code DDict} is just referenced, its lifetime must outlive its usage from {@code DCtx}.
        """,

        ZSTD_DCtx.p("dctx", ""),
        nullable..ZSTD_DDict.const.p("ddict", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
    )

    size_t(
        "DCtx_refPrefix",
        """
        References a prefix (single-usage dictionary) to decompress next frame.

        This is the reverse operation of #CCtx_refPrefix(), and must use the same prefix as the one used during compression. Prefix is <b>only used once</b>.
        Reference is discarded at end of frame. End of frame is reached when #decompressStream() returns 0.

        Note 1: Adding any prefix (including #NULL) invalidates any previously set prefix or dictionary.

        Note 2: Prefix buffer is referenced. It <b>must</b> outlive decompression. Prefix buffer must remain unmodified up to the end of frame, reached when
        {@code ZSTD_decompressStream()} returns 0.

        Note 3: By default, the prefix is treated as raw content (#dct_rawContent). Use #CCtx_refPrefix_advanced() to alter {@code dictMode}.

        Note 4: Referencing a raw content prefix has almost no cpu nor memory cost. A full dictionary is more costly, as it requires building tables.
        """,

        ZSTD_DCtx.p("dctx", ""),
        void.const.p("prefix", ""),
        AutoSize("prefix")..size_t("prefixSize", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
    )

    size_t("sizeof_CCtx", "", ZSTD_CCtx.const.p("cctx", ""))
    size_t("sizeof_DCtx", "", ZSTD_DCtx.const.p("dctx", ""))
    size_t("sizeof_CStream", "", ZSTD_CStream.const.p("zcs", ""))
    size_t("sizeof_DStream", "", ZSTD_DStream.const.p("zds", ""))
    size_t("sizeof_CDict", "", ZSTD_CDict.const.p("cdict", ""))
    size_t("sizeof_DDict", "", ZSTD_DDict.const.p("ddict", ""))
}