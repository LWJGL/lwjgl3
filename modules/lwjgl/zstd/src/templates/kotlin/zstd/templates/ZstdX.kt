/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package zstd.templates

import org.lwjgl.generator.*
import zstd.*

val ZstdX = "ZstdX".nativeClass(Module.ZSTD, prefix = "ZSTD", prefixMethod = "ZSTD_") {
    nativeDirective(
        """DISABLE_WARNINGS()
#define ZSTD_STATIC_LINKING_ONLY
#include "zstd.h"
ENABLE_WARNINGS()""")

    documentation =
        "Native bindings to the experimental API of ${url("http://facebook.github.io/zstd/", "Zstandard")} (zstd)."

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
        "{@code ZSTD_cParameter}",

        "c_compressionLevel".enum(
            """
            Update all compression parameters according to pre-defined cLevel table Default level is #CLEVEL_DEFAULT{@code ==3}. Special: value 0 means
            default, which is controlled by {@code ZSTD_CLEVEL_DEFAULT}.

            Note 1: it's possible to pass a negative compression level.

            Note 2 : setting a level sets all default values of other compression parameters
            """,
            "100"
        ),
        "c_windowLog".enum(
            """
            Maximum allowed back-reference distance, expressed as power of 2. Must be clamped between #WINDOWLOG_MIN and #WINDOWLOG_MAX. Special: value
            0 means "use default {@code windowLog}".

            Note: Using a {@code windowLog} greater than #WINDOWLOG_LIMIT_DEFAULT requires explicitly allowing such window size at decompression stage if using
            streaming.
            """
        ),
        "c_hashLog".enum(
            """
            Size of the initial probe table, as a power of 2. Resulting memory usage is (1 &lt;&lt; {@code (hashLog+2)}). Must be clamped between #HASHLOG_MIN and
            HASHLOG_MAX. Larger tables improve compression ratio of strategies &le; dFast, and improve speed of strategies &gt; dFast. Special: value 0
            means "use default {@code hashLog}".
            """
        ),
        "c_chainLog".enum(
            """
            Size of the multi-probe search table, as a power of 2. Resulting memory usage is (1 &lt;&lt; {@code (chainLog+2)}). Must be clamped between
            #CHAINLOG_MIN and #CHAINLOG_MAX. Larger tables result in better and slower compression. This parameter is useless when using "fast"
            strategy. It's still useful when using "dfast" strategy, in which case it defines a secondary probe table. Special: value 0 means "use default
            {@code chainLog}".
            """
        ),
        "c_searchLog".enum(
            """
            Number of search attempts, as a power of 2. More attempts result in better and slower compression. This parameter is useless when using "fast" and
            "dFast" strategies. Special: value 0 means "use default {@code searchLog}".
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
            different value.
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
            automatically the case when using #compress2(), For streaming variants, content size must be provided with #CCtx_setPledgedSrcSize().
            """,
            "200"
        ),
        "c_checksumFlag".enum("A 32-bits checksum of content is written at end of frame (default:0)"),
        "c_dictIDFlag".enum("When applicable, dictionary's ID is written into frame header (default:1)"),
        "c_nbWorkers".enum(
            """
            Select how many threads will be spawned to compress in parallel. When {@code nbWorkers &ge; 1}, triggers asynchronous mode when used with
            {@code ZSTD_compressStream*()}: {@code ZSTD_compressStream*()} consumes input and flush output if possible, but immediately gives back control to
            caller, while compression work is performed in parallel, within worker threads. (note: a strong exception to this rule is when first invocation of
            #compressStream2() sets #e_end: in which case, {@code ZSTD_compressStream2()} delegates to #compress2(), which is always a blocking call). More
            workers improve speed, but also increase memory usage. Default value is {@code 0}, aka "single-threaded mode": no worker is spawned, compression is
            performed inside Caller's thread, all invocations are blocking.
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
        "c_experimentalParam4".enum
    ).javaDocLinks

    val resetDirectives = EnumConstant(
        "{@code ZSTD_ResetDirective}",

        "reset_session_only".enum("", "1"),
        "reset_parameters".enum,
        "reset_session_and_parameters".enum
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
            """,
            "100"
        ),
        "d_experimentalParam1".enum(
            """
            Note: additional experimental parameters are also available within the experimental section of the API. At the time of this writing, they include:
            #c_format

            Note: never ever use {@code experimentalParam}? names directly
            """,
            "1000"
        )
    ).javaDocLinks

    val dictContentTypes = EnumConstant(
        "{@code ZSTD_dictContentType_e}",

        "dct_auto".enum("dictionary is \"full\" when starting with #MAGIC_DICTIONARY, otherwise it is \"rawContent\"", "0"),
        "dct_rawContent".enum("ensures dictionary is always loaded as {@code rawContent}, even if it starts with {@code ZSTD_MAGIC_DICTIONARY}"),
        "dct_fullDict".enum("refuses to load a dictionary if it does not respect Zstandard's specification, starting with {@code ZSTD_MAGIC_DICTIONARY}")
    ).javaDocLinks

    val dictLoadMethods = EnumConstant(
        "{@code ZSTD_dictLoadMethod_e}",

        "dlm_byCopy".enum("Copy dictionary content internally", "0"),
        "dlm_byRef".enum("Reference dictionary content -- the dictionary buffer must outlive its users.")
    ).javaDocLinks

    val formats = EnumConstant(
        "{@code ZSTD_format_e}",

        "f_zstd1".enum("zstd frame format, specified in {@code zstd_compression_format.md} (default)", "0"),
        "f_zstd1_magicless".enum(
            """
            Variant of zstd frame format, without initial 4-bytes magic number. Useful to save 4 bytes per generated frame. Decoder cannot recognise
            automatically this format, requiring this instruction.
            """
        )
    ).javaDocLinks

    EnumConstant(
        "{@code ZSTD_dictAttachPref_e}",

        "dictDefaultAttach".enum("Use the default heuristic.", "0"),
        "dictForceAttach".enum("Never copy the dictionary."),
        "dictForceCopy".enum("Always copy the dictionary.")
    )

    EnumConstant(
        "{@code ZSTD_frameType_e}",

        "frame".enum("", "0"),
        "skippableFrame".enum
    )

    EnumConstant(
        "{@code ZSTD_nextInputType_e}",

        "ZSTDnit_frameHeader".enum("", "0"),
        "ZSTDnit_blockHeader".enum,
        "ZSTDnit_block".enum,
        "ZSTDnit_lastBlock".enum,
        "ZSTDnit_checksum".enum,
        "ZSTDnit_skippableFrame".enum
    ).noPrefix()

    IntConstant("", "MAGICNUMBER".."0xFD2FB528")
    IntConstant("", "MAGIC_DICTIONARY".."0xEC30A437")
    IntConstant("", "MAGIC_SKIPPABLE_START".."0x184D2A50")
    IntConstant("", "MAGIC_SKIPPABLE_MASK".."0xFFFFFFF0")
    IntConstant("", "BLOCKSIZELOG_MAX".."17")
    IntConstant("", "BLOCKSIZE_MAX".."(1<<ZSTD_BLOCKSIZELOG_MAX)")
    IntConstant("", "FRAMEHEADERSIZE_PREFIX".."5")
    IntConstant("", "FRAMEHEADERSIZE_MIN".."6")
    IntConstant("", "FRAMEHEADERSIZE_MAX".."18")
    IntConstant("", "SKIPPABLEHEADERSIZE".."8")
    IntConstant("", "WINDOWLOG_MAX_32".."30")
    IntConstant("", "WINDOWLOG_MAX_64".."31")
    IntConstant("", "WINDOWLOG_MAX".."Pointer.POINTER_SIZE == 64 ? ZSTD_WINDOWLOG_MAX_64 : ZSTD_WINDOWLOG_MAX_32")
    IntConstant("", "WINDOWLOG_MIN".."10")
    IntConstant("", "HASHLOG_MAX".."ZSTD_WINDOWLOG_MAX < 30 ? ZSTD_WINDOWLOG_MAX : 30")
    IntConstant("", "HASHLOG_MIN".."6")
    IntConstant("", "CHAINLOG_MAX_32".."29")
    IntConstant("", "CHAINLOG_MAX_64".."30")
    IntConstant("", "CHAINLOG_MAX".."Pointer.POINTER_SIZE == 64 ? ZSTD_CHAINLOG_MAX_64 : ZSTD_CHAINLOG_MAX_32")
    IntConstant("", "CHAINLOG_MIN".."ZSTD_HASHLOG_MIN")
    IntConstant("", "SEARCHLOG_MIN".."1")
    IntConstant("", "MINMATCH_MAX".."7")
    IntConstant("", "MINMATCH_MIN".."3")
    IntConstant("", "TARGETLENGTH_MAX".."ZSTD_BLOCKSIZE_MAX")
    IntConstant("", "TARGETLENGTH_MIN".."0")
    IntConstant("", "STRATEGY_MIN".."ZSTD_fast")
    IntConstant("", "STRATEGY_MAX".."ZSTD_btultra2")
    IntConstant("", "OVERLAPLOG_MIN".."0")
    IntConstant("", "OVERLAPLOG_MAX".."9")
    IntConstant("", "WINDOWLOG_LIMIT_DEFAULT".."27")
    IntConstant("", "LDM_HASHLOG_MIN".."ZSTD_HASHLOG_MIN")
    IntConstant("", "LDM_HASHLOG_MAX".."ZSTD_HASHLOG_MAX")
    IntConstant("", "LDM_MINMATCH_MIN".."4")
    IntConstant("", "LDM_MINMATCH_MAX".."4096")
    IntConstant("", "LDM_BUCKETSIZELOG_MIN".."1")
    IntConstant("", "LDM_BUCKETSIZELOG_MAX".."8")
    IntConstant("", "LDM_HASHRATELOG_MIN".."0")
    IntConstant("", "HASHLOG3_MAX".."17")
    IntConstant("", "c_rsyncable".."ZSTD_c_experimentalParam1")
    IntConstant("", "c_format".."ZSTD_c_experimentalParam2")
    IntConstant("", "c_forceMaxWindow".."ZSTD_c_experimentalParam3")
    IntConstant("", "c_forceAttachDict".."ZSTD_c_experimentalParam4")
    IntConstant("", "d_format".."ZSTD_d_experimentalParam1")

    int(
        "minCLevel",
        "",

        void()
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

    size_t("sizeof_CCtx", "", ZSTD_CCtx.const.p("cctx", ""))
    size_t("sizeof_DCtx", "", ZSTD_DCtx.const.p("dctx", ""))
    size_t("sizeof_CStream", "", ZSTD_CStream.const.p("zcs", ""))
    size_t("sizeof_DStream", "", ZSTD_DStream.const.p("zds", ""))
    size_t("sizeof_CDict", "", ZSTD_CDict.const.p("cdict", ""))
    size_t("sizeof_DDict", "", ZSTD_DDict.const.p("ddict", ""))

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
        {@code ZSTD_compressStream2(,,,ZSTD_e_end)}, this value is automatically overriden by {@code srcSize} instead.
        """,

        ZSTD_CCtx.p("cctx", ""),
        unsigned_long_long("pledgedSrcSize", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())."
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

        Note that compression parameters are enforced from within CDict, and supercede any compression parameter previously set within {@code CCtx}. The
        dictionary will remain valid for future compressed frames using same {@code CCtx}.

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

    size_t(
        "compressStream2",
        """
        Behaves about the same as #compressStream(), with additional control on end directive.

        - Compression parameters are pushed into {@code CCtx} before starting compression, using {@code ZSTD_CCtx_set*()}.
        - Compression parameters cannot be changed once compression is started (save a list of exceptions in multi-threading mode).
        - {@code outpot->pos} must be &le; {@code dstCapacity}, {@code input->pos} must be &le; {@code srcSize}.
        - {@code outpot->pos} and {@code input->pos} will be updated. They are guaranteed to remain below their respective limit.
        - When {@code nbWorkers==0} (default), function is blocking: it completes its job before returning to caller.
        - When {@code nbWorkers&ge;1}, function is non-blocking: it just acquires a copy of input, and distributes jobs to internal worker threads, flush
        whatever is available, and then immediately returns, just indicating that there is some data remaining to be flushed. The function nonetheless
        guarantees forward progress: it will return only after it reads or write at least 1+ byte.
        - Exception: if the first call requests a #e_end directive and provides enough {@code dstCapacity}, the function delegates to #compress2() which is
        always blocking.
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

    unsigned_long_long(
        "findDecompressedSize",
        """
        Note 1: decompressed size is an optional field, that may not be present, especially in streaming mode. When {@code return==ZSTD_CONTENTSIZE_UNKNOWN},
        data to decompress could be any size. In which case, it's necessary to use streaming mode to decompress data.

        Note 2: decompressed size is always present when compression is done with #compress().

        Note 3: decompressed size can be very large (64-bits value), potentially larger than what local system can handle as a single memory segment. In which
        case, it's necessary to use streaming mode to decompress data.

        Note 4: If source is untrusted, decompressed size could be wrong or intentionally modified. Always ensure result fits within application's authorized
        limits. Each application can set its own limits.

        Note 5: {@code ZSTD_findDecompressedSize} handles multiple frames, and so it must traverse the input to read each contained frame header. This is fast
        as most of the data is skipped, however it does mean that all frame data must be present and valid.
        """,

        void.const.p("src", "should point the start of a series of ZSTD encoded and/or skippable frames"),
        AutoSize("src")..size_t(
            "srcSize",
            "must be the <em>exact</em> size of this series (i.e. there should be a frame boundary exactly at {@code srcSize} bytes after {@code src})"
        ),

        returnDoc =
        """
        ${ul(
            "decompressed size of all data in all successive frames",
            "if the decompressed size cannot be determined: #CONTENTSIZE_UNKNOWN",
            "if an error occurred: #CONTENTSIZE_ERROR"
        )}
        """
    )

    size_t(
        "frameHeaderSize",
        "",

        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", "must be &ge; #FRAMEHEADERSIZE_PREFIX"),

        returnDoc = ": size of the Frame Header, or an error code (if srcSize is too small)"
    )

    size_t(
        "estimateCCtxSize",
        """
        Estimages memory usage of a future {@code CCtx}, before its creation.

        {@code ZSTD_estimateCCtxSize()} will provide a budget large enough for any compression level up to selected one. It will also consider {@code src} size
        to be arbitrarily "large", which is worst case. If {@code srcSize} is known to always be small, #estimateCCtxSize_usingCParams() can provide a tighter
        estimation. #estimateCCtxSize_usingCParams() can be used in tandem with #getCParams() to create {@code cParams} from compressionLevel.
        #estimateCCtxSize_usingCCtxParams() can be used in tandem with #CCtxParam_setParameter(). Only single-threaded compression is supported.

        This function will return an error code if #c_nbWorkers is &ge; 1.

        Note: {@code CCtx} size estimation is only correct for single-threaded compression.
        """,

        int("compressionLevel", "")
    )

    size_t(
        "estimateCCtxSize_usingCParams",
        "",

        ZSTD_compressionParameters("cParams", "")
    )

    size_t(
        "estimateCCtxSize_usingCCtxParams",
        "",

        ZSTD_CCtx_params.const.p("params", "")
    )

    size_t(
        "estimateDCtxSize",
        "",

        void()
    )

    size_t(
        "estimateCStreamSize",
        """
        Provides a budget large enough for any compression level up to selected one.

        It will also consider {@code src} size to be arbitrarily "large", which is worst case. If {@code srcSize} is known to always be small,
        #estimateCStreamSize_usingCParams() can provide a tighter estimation. {@code ZSTD_estimateCStreamSize_usingCParams()} can be used in tandem with
        #getCParams() to create {@code cParams} from compressionLevel. #estimateCStreamSize_usingCCtxParams() can be used in tandem with
        #CCtxParam_setParameter(). Only single-threaded compression is supported.

        This function will return an error code if #c_nbWorkers is &ge; 1.

        Note: {@code CStream} size estimation is only correct for single-threaded compression. {@code ZSTD_DStream} memory budget depends on window
        {@code Size}. This information can be passed manually, using #estimateDStreamSize(), or deducted from a valid frame {@code Header}, using
        #estimateDStreamSize_fromFrame().

        Note: if streaming is init with function {@code ZSTD_init?Stream_usingDict()}, an internal Dict will be created, which additional size is not estimated
        here. In this case, get total size by adding {@code ZSTD_estimate?DictSize}.
        """,

        int("compressionLevel", "")
    )

    size_t(
        "estimateCStreamSize_usingCParams",
        "",

        ZSTD_compressionParameters("cParams", "")
    )

    size_t(
        "estimateCStreamSize_usingCCtxParams",
        "",

        ZSTD_CCtx_params.const.p("params", "")
    )

    size_t(
        "estimateDStreamSize",
        "",

        size_t("windowSize", "")
    )

    size_t(
        "estimateDStreamSize_fromFrame",
        "",

        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", "")
    )

    size_t(
        "estimateCDictSize",
        "",

        size_t("dictSize", ""),
        int("compressionLevel", "")
    )

    size_t(
        "estimateCDictSize_advanced",
        "",

        size_t("dictSize", ""),
        ZSTD_compressionParameters("cParams", ""),
        ZSTD_dictLoadMethod_e("dictLoadMethod", "", dictLoadMethods)
    )

    size_t(
        "estimateDDictSize",
        "",

        size_t("dictSize", ""),
        ZSTD_dictLoadMethod_e("dictLoadMethod", "", dictLoadMethods)
    )

    ZSTD_CCtx.p(
        "initStaticCCtx",
        "",

        void.p("workspace", ""),
        AutoSize("workspace")..size_t("workspaceSize", "")
    )

    ZSTD_CStream.p(
        "initStaticCStream",
        "",

        void.p("workspace", ""),
        AutoSize("workspace")..size_t("workspaceSize", "")
    )

    ZSTD_DCtx.p(
        "initStaticDCtx",
        "",

        void.p("workspace", ""),
        AutoSize("workspace")..size_t("workspaceSize", "")
    )

    ZSTD_DStream.p(
        "initStaticDStream",
        "",

        void.p("workspace", ""),
        AutoSize("workspace")..size_t("workspaceSize", "")
    )

    ZSTD_CDict.const.p(
        "initStaticCDict",
        "",

        void.p("workspace", ""),
        AutoSize("workspace")..size_t("workspaceSize", ""),
        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),
        ZSTD_dictLoadMethod_e("dictLoadMethod", "", dictLoadMethods),
        ZSTD_dictContentType_e("dictContentType", "", dictContentTypes),
        ZSTD_compressionParameters("cParams", "")
    )

    ZSTD_DDict.const.p(
        "initStaticDDict",
        "",

        void.p("workspace", ""),
        AutoSize("workspace")..size_t("workspaceSize", ""),
        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),
        ZSTD_dictLoadMethod_e("dictLoadMethod", "", dictLoadMethods),
        ZSTD_dictContentType_e("dictContentType", "", dictContentTypes)
    )

    ZSTD_CCtx.p(
        "createCCtx_advanced",
        "",

        ZSTD_customMem("customMem", "")
    )

    ZSTD_CStream.p(
        "createCStream_advanced",
        "",

        ZSTD_customMem("customMem", "")
    )

    ZSTD_DCtx.p(
        "createDCtx_advanced",
        "",

        ZSTD_customMem("customMem", "")
    )

    ZSTD_DStream.p(
        "createDStream_advanced",
        "",

        ZSTD_customMem("customMem", "")
    )

    ZSTD_CDict.p(
        "createCDict_advanced",
        "",

        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),
        ZSTD_dictLoadMethod_e("dictLoadMethod", "", dictLoadMethods),
        ZSTD_dictContentType_e("dictContentType", "", dictContentTypes),
        ZSTD_compressionParameters("cParams", ""),
        ZSTD_customMem("customMem", "")
    )

    ZSTD_DDict.p(
        "createDDict_advanced",
        "",

        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),
        ZSTD_dictLoadMethod_e("dictLoadMethod", "", dictLoadMethods),
        ZSTD_dictContentType_e("dictContentType", "", dictContentTypes),
        ZSTD_customMem("customMem", "")
    )

    ZSTD_CDict.p(
        "createCDict_byReference",
        """
        Creates a digested dictionary for compression Dictionary content is just referenced, not duplicated.

        As a consequence, {@code dictBuffer} <b>must</b> outlive {@code CDict}, and its content must remain unmodified throughout the lifetime of
        {@code CDict}.
        """,

        void.const.p("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t("dictSize", ""),
        int("compressionLevel", "")
    )

    ZSTD_compressionParameters(
        "getCParams",
        "Returns {@code ZSTD_compressionParameters} structure for a selected compression level and estimated {@code srcSize}.",

        int("compressionLevel", ""),
        unsigned_long_long("estimatedSrcSize", "optional, select 0 if not known"),
        size_t("dictSize", "")
    )

    ZSTD_parameters(
        "getParams",
        """
        Same as getCParams(), but returns a full {@code ZSTD_parameters} object instead of sub-component {@code ZSTD_compressionParameters}.

        All fields of {@code ZSTD_frameParameters} are set to default: {@code contentSize=1, checksum=0, noDictID=0}.
        """,

        int("compressionLevel", ""),
        unsigned_long_long("estimatedSrcSize", "optional, select 0 if not known"),
        size_t("dictSize", "")
    )

    size_t(
        "checkCParams",
        "Ensures param values remain within authorized range.",

        ZSTD_compressionParameters("params", "")
    )

    ZSTD_compressionParameters(
        "adjustCParams",
        "Optimizes params for a given {@code srcSize} and {@code dictSize}. Both values are optional, select 0 if unknown.",

        ZSTD_compressionParameters("cPar", ""),
        unsigned_long_long("srcSize", ""),
        size_t("dictSize", "")
    )

    size_t(
        "compress_advanced",
        "Same as #compress_usingDict(), with fine-tune control over compression parameters (by structure).",

        ZSTD_CCtx.p("cctx", ""),
        void.p("dst", ""),
        AutoSize("dst")..size_t("dstCapacity", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", ""),
        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),
        ZSTD_parameters("params", "")
    )

    size_t(
        "compress_usingCDict_advanced",
        "Same as #compress_usingCDict(), with fine-tune control over frame parameters.",

        ZSTD_CCtx.p("cctx", ""),
        void.p("dst", ""),
        AutoSize("dst")..size_t("dstCapacity", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", ""),
        ZSTD_CDict.const.p("cdict", ""),
        ZSTD_frameParameters("fParams", "")
    )

    size_t(
        "CCtx_loadDictionary_byReference",
        """
        Same as #CCtx_loadDictionary(), but dictionary content is referenced, instead of being copied into {@code CCtx}.

        It saves some memory, but also requires that {@code dict} outlives its usage within {@code cctx}.
        """,

        ZSTD_CCtx.p("cctx", ""),
        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", "")
    )

    size_t(
        "CCtx_loadDictionary_advanced",
        """
        Same as #CCtx_loadDictionary(), but gives finer control over how to load the dictionary (by copy ? by reference ?) and how to interpret it
        (automatic ? force raw mode ? full mode only ?).
        """,

        ZSTD_CCtx.p("cctx", ""),
        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),
        ZSTD_dictLoadMethod_e("dictLoadMethod", "", dictLoadMethods),
        ZSTD_dictContentType_e("dictContentType", "", dictContentTypes)
    )

    size_t(
        "CCtx_refPrefix_advanced",
        "Same as #CCtx_refPrefix(), but gives finer control over how to interpret prefix content (automatic ? force raw mode (default) ? full mode only ?).",

        ZSTD_CCtx.p("cctx", ""),
        void.const.p("prefix", ""),
        AutoSize("prefix")..size_t("prefixSize", ""),
        ZSTD_dictContentType_e("dictContentType", "", dictContentTypes)
    )

    size_t(
        "CCtx_getParameter",
        "Gets the requested compression parameter value, selected by {@code enum ZSTD_cParameter}, and stores it into {@code int* value}.",

        ZSTD_CCtx.p("cctx", ""),
        ZSTD_cParameter("param", "", cParameters),
        Check(1)..int.p("value", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
    )

    ZSTD_CCtx_params.p(
        "createCCtxParams",
        "Creates a {@code ZSTD_CCtx_params} structure.",

        void()
    )

    size_t(
        "freeCCtxParams",
        "",

        ZSTD_CCtx_params.p("params", "")
    )

    size_t(
        "CCtxParams_reset",
        "Resets params to default values.",

        ZSTD_CCtx_params.p("params", "")
    )

    size_t(
        "CCtxParams_init",
        "Initializes the compression parameters of {@code cctxParams} according to compression level. All other parameters are reset to their default values.",

        ZSTD_CCtx_params.p("cctxParams", ""),
        int("compressionLevel", "")
    )

    size_t(
        "CCtxParams_init_advanced",
        "Initializes the compression and frame parameters of {@code cctxParams} according to params. All other parameters are reset to their default values.",

        ZSTD_CCtx_params.p("cctxParams", ""),
        ZSTD_parameters("params", "")
    )

    size_t(
        "CCtxParam_setParameter",
        """
        Similar to #CCtx_setParameter(). Sets one compression parameter, selected by {@code enum ZSTD_cParameter}.

        Parameters must be applied to a {@code ZSTD_CCtx} using #CCtx_setParametersUsingCCtxParams().
        """,

        ZSTD_CCtx_params.p("params", ""),
        ZSTD_cParameter("param", "", cParameters),
        int("value", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
    )

    size_t(
        "CCtxParam_getParameter",
        """
        Similar to #CCtx_getParameter(). Gets the requested value of one compression parameter, selected by {@code enum ZSTD_cParameter}.
        """,

        ZSTD_CCtx_params.p("params", ""),
        ZSTD_cParameter("param", "", cParameters),
        Check(1)..int.p("value", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
    )

    size_t(
        "CCtx_setParametersUsingCCtxParams",
        """
        Applies a set of {@code ZSTD_CCtx_params} to the compression context.
        
        This can be done even after compression is started, if {@code nbWorkers==0}, this will have no impact until a new compression is started. If
        {@code nbWorkers} &ge; 1, new parameters will be picked up at next job, with a few restrictions (windowLog, pledgedSrcSize, nbWorkers, jobSize, and
        overlapLog are not updated).
        """,

        ZSTD_CCtx.p("cctx", ""),
        ZSTD_CCtx_params.const.p("params", "")
    )

    size_t(
        "compressStream2_simpleArgs",
        """
        Same as #compressStream2(), but using only integral types as arguments.

        This variant might be helpful for binders from dynamic languages which have troubles handling structures containing memory pointers.
        """,

        ZSTD_CCtx.p("cctx", ""),
        void.p("dst", ""),
        AutoSize("dst")..size_t("dstCapacity", ""),
        Check(1)..size_t.p("dstPos", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", ""),
        Check(1)..size_t.p("srcPos", ""),
        ZSTD_EndDirective("endOp", "", endDirectives)
    )

    unsigned_intb(
        "isFrame",
        """
        Tells if the content of {@code buffer} starts with a valid Frame Identifier.

        Notes:
        ${ol(
            "Frame Identifier is 4 bytes. If {@code size < 4}, {@code @return} will always be 0.",
            "Legacy Frame Identifiers are considered valid only if Legacy Support is enabled.",
            "Skippable Frame Identifiers are considered valid."
        )}
        """,

        void.const.p("buffer", ""),
        AutoSize("buffer")..size_t("size", "")
    )

    ZSTD_DDict.p(
        "createDDict_byReference",
        """
        Creates a digested dictionary, ready to start decompression operation without startup delay.

        Dictionary content is referenced, and therefore stays in {@code dictBuffer}. It is important that {@code dictBuffer} outlives {@code DDict}, it must
        remain read accessible throughout the lifetime of {@code DDict}.
        """,

        void.const.p("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t("dictSize", "")
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
        "DCtx_loadDictionary_byReference",
        """
        Same as #DCtx_loadDictionary(), but references {@code dict} content instead of copying it into {@code dctx}.

        This saves memory if {@code dict} remains around. However, it's imperative that {@code dict} remains accessible (and unmodified) while being used, so
        it must outlive decompression.
        """,

        ZSTD_DCtx.p("dctx", ""),
        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", "")
    )

    size_t(
        "DCtx_loadDictionary_advanced",
        """
        Same as #DCtx_loadDictionary(), but gives direct control over how to load the dictionary (by copy ? by reference ?) and how to interpret it
        (automatic ? force raw mode ? full mode only ?).
        """,

        ZSTD_DCtx.p("dctx", ""),
        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),
        ZSTD_dictLoadMethod_e("dictLoadMethod", "", dictLoadMethods),
        ZSTD_dictContentType_e("dictContentType", "", dictContentTypes)
    )

    size_t(
        "DCtx_refPrefix_advanced",
        "Same as #DCtx_refPrefix(), but gives finer control over how to interpret prefix content (automatic ? force raw mode (default) ? full mode only ?).",

        ZSTD_DCtx.p("dctx", ""),
        void.const.p("prefix", ""),
        AutoSize("prefix")..size_t("prefixSize", ""),
        ZSTD_dictContentType_e("dictContentType", "", dictContentTypes)
    )

    size_t(
        "DCtx_setMaxWindowSize",
        """
        Refuses allocating internal buffers for frames requiring a window size larger than provided limit.

        This protects a decoder context from reserving too much memory for itself (potential attack scenario). This parameter is only useful in streaming mode,
        since no internal buffer is allocated in single-pass mode. By default, a decompression context accepts all window sizes &le; (1 &lt;&lt;
        #WINDOWLOG_LIMIT_DEFAULT).
        """,

        ZSTD_DCtx.p("dctx", ""),
        size_t("maxWindowSize", ""),

        returnDoc = "0, or an error code (which can be tested using #isError())"
    )

    size_t(
        "DCtx_setFormat",
        """
        Instructs the decoder context about what kind of data to decode next.

        This instruction is mandatory to decode data without a fully-formed header, such #f_zstd1_magicless for example.
        """,

        ZSTD_DCtx.p("dctx", ""),
        ZSTD_format_e("format", "", formats),

        returnDoc = "0, or an error code (which can be tested using #isError())"
    )

    size_t(
        "decompressStream_simpleArgs",
        """
        Same as #decompressStream(), but using only integral types as arguments.

        This can be helpful for binders from dynamic languages which have troubles handling structures containing memory pointers.
        """,

        ZSTD_DCtx.p("dctx", ""),
        void.p("dst", ""),
        AutoSize("dst")..size_t("dstCapacity", ""),
        Check(1)..size_t.p("dstPos", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", ""),
        Check(1)..size_t.p("srcPos", "")
    )

    size_t(
        "initCStream_srcSize",
        "",

        ZSTD_CStream.p("zcs", ""),
        int("compressionLevel", ""),
        unsigned_long_long("pledgedSrcSize", "")
    )

    size_t(
        "initCStream_usingDict",
        "",

        ZSTD_CStream.p("zcs", ""),
        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),
        int("compressionLevel", "")
    )

    size_t(
        "initCStream_advanced",
        "",

        ZSTD_CStream.p("zcs", ""),
        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),
        ZSTD_parameters("params", ""),
        unsigned_long_long("pledgedSrcSize", "")
    )

    size_t(
        "initCStream_usingCDict",
        "",

        ZSTD_CStream.p("zcs", ""),
        ZSTD_CDict.const.p("cdict", "")
    )

    size_t(
        "initCStream_usingCDict_advanced",
        "",

        ZSTD_CStream.p("zcs", ""),
        ZSTD_CDict.const.p("cdict", ""),
        ZSTD_frameParameters("fParams", ""),
        unsigned_long_long("pledgedSrcSize", "")
    )

    size_t(
        "resetCStream",
        """
        Starts a new frame, using same parameters from previous frame.

        This is typically useful to skip dictionary loading stage, since it will re-use it in-place. Note that {@code zcs} must be init at least once before
        using {@code ZSTD_resetCStream()}.
        """,

        ZSTD_CStream.p("zcs", ""),
        unsigned_long_long(
            "pledgedSrcSize",
            """
            if not known at reset time, use #CONTENTSIZE_UNKNOWN. If &gt; 0, its value must be correct, as it will be written in header, and controlled at the
            end.
            """
        ),

        returnDoc = "0, or an error code (which can be tested using #isError())"
    )

    ZSTD_frameProgression(
        "getFrameProgression",
        """
        Tells how much data has been ingested (read from input) consumed (input actually compressed) and produced (output) for current frame.

        Note: {@code (ingested - consumed)} is amount of input data buffered internally, not yet compressed. Aggregates progression inside active worker
        threads.
        """,

        ZSTD_CCtx.const.p("cctx", "")
    )

    size_t(
        "toFlushNow",
        """
        Tells how many bytes are ready to be flushed immediately.

        Useful for multithreading scenarios ({@code nbWorkers} &ge; 1). Probe the oldest active job, defined as oldest job not yet entirely flushed, and check
        its output buffer.
        """,

        ZSTD_CCtx.p("cctx", ""),

        returnDoc =
        """
        amount of data stored in oldest job and ready to be flushed immediately. If {@code == 0}, it means either:
        ${ul(
            "there is no active job (could be checked with #getFrameProgression()), or",
            """
            oldest job is still actively compressing data, but everything it has produced has also been flushed so far, therefore flush speed is limited by
            production speed of oldest job irrespective of the speed of concurrent (and newer) jobs.
            """
        )}
        """
    )

    size_t(
        "initDStream_usingDict",
        "",

        ZSTD_DStream.p("zds", ""),
        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", "")
    )

    size_t(
        "initDStream_usingDDict",
        "",

        ZSTD_DStream.p("zds", ""),
        ZSTD_DDict.const.p("ddict", "")
    )

    size_t(
        "resetDStream",
        "",

        ZSTD_DStream.p("zds", "")
    )

    size_t(
        "compressBegin",
        "",

        ZSTD_CCtx.p("cctx", ""),
        int("compressionLevel", "")
    )

    size_t(
        "compressBegin_usingDict",
        "",

        ZSTD_CCtx.p("cctx", ""),
        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),
        int("compressionLevel", "")
    )

    size_t(
        "compressBegin_advanced",
        "",

        ZSTD_CCtx.p("cctx", ""),
        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),
        ZSTD_parameters("params", ""),
        unsigned_long_long("pledgedSrcSize", "")
    )

    size_t(
        "compressBegin_usingCDict",
        "",

        ZSTD_CCtx.p("cctx", ""),
        ZSTD_CDict.const.p("cdict", "")
    )

    size_t(
        "compressBegin_usingCDict_advanced",
        "",

        ZSTD_CCtx.p.const("cctx", ""),
        ZSTD_CDict.const.p.const("cdict", ""),
        ZSTD_frameParameters.const("fParams", ""),
        unsigned_long_long.const("pledgedSrcSize", "if not known, use #CONTENTSIZE_UNKNOWN")
    )

    size_t(
        "copyCCtx",
        "",

        ZSTD_CCtx.p("cctx", ""),
        ZSTD_CCtx.const.p("preparedCCtx", ""),
        unsigned_long_long("pledgedSrcSize", "if not known, use #CONTENTSIZE_UNKNOWN")
    )

    size_t(
        "compressContinue",
        "",

        ZSTD_CCtx.p("cctx", ""),
        void.p("dst", ""),
        AutoSize("dst")..size_t("dstCapacity", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", "")
    )

    size_t(
        "compressEnd",
        "",

        ZSTD_CCtx.p("cctx", ""),
        void.p("dst", ""),
        AutoSize("dst")..size_t("dstCapacity", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", "")
    )

    size_t(
        "getFrameHeader",
        "Decode Frame Header, or requires larger {@code srcSize}.",

        ZSTD_frameHeader.p("zfhPtr", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", ""),

        returnDoc =
        """
        0, {@code zfhPtr} is correctly filled, &gt;0, {@code srcSize} is too small, value is wanted {@code srcSize} amount, or an error code, which can be
        tested using #isError()
        """
    )

    size_t(
        "getFrameHeader_advanced",
        "Same as #getFrameHeader(), with added capability to select a format (like #f_zstd1_magicless).",

        ZSTD_frameHeader.p("zfhPtr", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", ""),
        ZSTD_format_e("format", "", formats)
    )

    size_t(
        "decodingBufferSize_min",
        "",

        unsigned_long_long("windowSize", ""),
        unsigned_long_long("frameContentSize", "")
    )

    size_t(
        "decompressBegin",
        "",

        ZSTD_DCtx.p("dctx", "")
    )

    size_t(
        "decompressBegin_usingDict",
        "",

        ZSTD_DCtx.p("dctx", ""),
        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", "")
    )

    size_t(
        "decompressBegin_usingDDict",
        "",

        ZSTD_DCtx.p("dctx", ""),
        ZSTD_DDict.const.p("ddict", "")
    )

    size_t(
        "nextSrcSizeToDecompress",
        "",

        ZSTD_DCtx.p("dctx", "")
    )

    size_t(
        "decompressContinue",
        "",

        ZSTD_DCtx.p("dctx", ""),
        void.p("dst", ""),
        AutoSize("dst")..size_t("dstCapacity", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", "")
    )

    void(
        "copyDCtx",
        "",

        ZSTD_DCtx.p("dctx", ""),
        ZSTD_DCtx.const.p("preparedDCtx", "")
    )

    ZSTD_nextInputType_e(
        "nextInputType",
        "",

        ZSTD_DCtx.p("dctx", "")
    )

    size_t(
        "getBlockSize",
        "",

        ZSTD_CCtx.const.p("cctx", "")
    )

    size_t(
        "compressBlock",
        "",

        ZSTD_CCtx.p("cctx", ""),
        void.p("dst", ""),
        AutoSize("dst")..size_t("dstCapacity", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", "")
    )

    size_t(
        "decompressBlock",
        "",

        ZSTD_DCtx.p("dctx", ""),
        void.p("dst", ""),
        AutoSize("dst")..size_t("dstCapacity", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", "")
    )

    size_t(
        "insertBlock",
        "Insert uncompressed block into {@code dctx} history. Useful for multi-blocks decompression.",

        ZSTD_DCtx.p("dctx", ""),
        void.const.p("blockStart", ""),
        AutoSize("blockStart")..size_t("blockSize", "")
    )
}