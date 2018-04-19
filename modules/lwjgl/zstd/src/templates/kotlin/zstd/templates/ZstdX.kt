/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package zstd.templates

import org.lwjgl.generator.*
import zstd.*

val ZstdX = "ZstdX".nativeClass(Module.ZSTD, prefix = "ZSTD", prefixMethod = "ZSTD_", library = ZSTD_LIBRARY) {
    nativeDirective(
        """DISABLE_WARNINGS()
#define ZSTD_STATIC_LINKING_ONLY
#include "zstd.h"
ENABLE_WARNINGS()""")

    documentation =
        """
        Native bindings to the experimental API of ${url("http://facebook.github.io/zstd/", "Zstandard")} (zstd).

        In this proposal, parameters are pushed one by one into an existing context, and then applied on all subsequent compression jobs. When no parameter is
        ever provided, {@code CCtx} is created with compression level {@code ZSTD_CLEVEL_DEFAULT}.

        This API is intended to replace all others experimental API. It can basically do all other use cases, and even new ones. In constrast with
        {@code _advanced()} variants, it stands a reasonable chance to become "stable", after a good testing period.

        <h3>Block level API</h3>

        Block functions produce and decode raw zstd blocks, without frame metadata.

        Frame metadata cost is typically ~18 bytes, which can be non-negligible for very small blocks (< 100 bytes). User will have to take in charge required
        information to regenerate data, such as compressed and content sizes.

        A few rules to respect:
        ${ul(
            "Compressing and decompressing require a context structure. Use #createCCtx() and #createDCtx().",
            """
            It is necessary to init context before starting
            ${ul(
                "compression : any {@code ZSTD_compressBegin*()} variant, including with dictionary",
                "decompression : any {@code ZSTD_decompressBegin*()} variant, including with dictionary",
                "#copyCCtx() and #copyDCtx() can be used too"
            )}
            """,
            """
            Block size is limited, it must be &le; #getBlockSize() &le; #BLOCKSIZE_MAX == 128 KB
            ${ul(
                "If input is larger than a block size, it's necessary to split input data into multiple blocks.",
                """
                For inputs larger than a single block size, consider using the regular #compress() instead. Frame metadata is not that costly, and quickly
                becomes negligible as source size grows larger.
                """
            )}
            """,
            """
            When a block is considered not compressible enough, #compressBlock() result will be zero. In which case, nothing is produced into {@code dst}.
            ${ul(
                "User must test for such outcome and deal directly with uncompressed data.",
                "#decompressBlock() doesn't accept uncompressed data as input !!!",
                """
                In case of multiple successive blocks, should some of them be uncompressed, decoder must be informed of their existence in order to follow
                proper history. Use #insertBlock() for such a case.
                """
            )}
            """
        )}
        """

    IntConstant(
        "Magic number.",

        "MAGICNUMBER"..0xFD2FB528.i,
        "MAGIC_SKIPPABLE_START"..0x184D2A50L.i,
        "MAGIC_DICTIONARY"..0xEC30A437.i
    )

    IntConstant(
        "Constant.",

        "WINDOWLOG_MAX_32".."30",
        "WINDOWLOG_MAX_64".."31",
        "WINDOWLOG_MAX".."(Pointer.BITS32 ? ZSTD_WINDOWLOG_MAX_32 : ZSTD_WINDOWLOG_MAX_64)",
        "WINDOWLOG_MIN".."10",
        "HASHLOG_MAX".."(ZSTD_WINDOWLOG_MAX < 30) ? ZSTD_WINDOWLOG_MAX : 30",
        "HASHLOG_MIN".."6",
        "CHAINLOG_MAX_32".."29",
        "CHAINLOG_MAX_64".."30",
        "CHAINLOG_MAX".."(Pointer.BITS32 ? ZSTD_CHAINLOG_MAX_32 : ZSTD_CHAINLOG_MAX_64)",
        "CHAINLOG_MIN".."ZSTD_HASHLOG_MIN",
        "HASHLOG3_MAX".."17",
        "SEARCHLOG_MAX".."(ZSTD_WINDOWLOG_MAX-1)",
        "SEARCHLOG_MIN".."1",
        "SEARCHLENGTH_MAX".."7",
        "SEARCHLENGTH_MIN".."3",
        "TARGETLENGTH_MIN".."1",
        "LDM_MINMATCH_MIN".."4",
        "LDM_MINMATCH_MAX".."4096",
        "LDM_BUCKETSIZELOG_MAX".."8",
        "FRAMEHEADERSIZE_PREFIX".."5",
        "FRAMEHEADERSIZE_MIN".."6",
        "FRAMEHEADERSIZE_MAX".."18"
    )

    EnumConstant(
        "Strategies, from faster to stronger. ({@code ZSTD_strategy})",

        "fast".enum("", "1"),
        "dfast".enum,
        "greedy".enum,
        "lazy".enum,
        "lazy2".enum,
        "btlazy2".enum,
        "btopt".enum,
        "btultra".enum
    ).javaDocLinks

    val dictLoadMethods = EnumConstant(
        "{@code ZSTD_dictLoadMethod_e}",

        "dlm_byCopy".enum("Copy dictionary content internally."),
        "dlm_byRef".enum("Reference dictionary content -- the dictionary buffer must outlive its users.")
    ).javaDocLinks

    val dictContentTypes = EnumConstant(
        "{@code ZSTD_dictContentType_e}",

        "dct_auto".enum("dictionary is \"full\" when starting with #MAGIC_DICTIONARY, otherwise it is \"rawContent\""),
        "dct_rawContent".enum("ensures dictionary is always loaded as rawContent, even if it starts with #MAGIC_DICTIONARY"),
        "dct_fullDict".enum("refuses to load a dictionary if it does not respect Zstandard's specification")
    ).javaDocLinks

    EnumConstant(
        "{@code ZSTD_frameType_e}",

        "frame".enum,
        "skippableFrame".enum
    )

    val formats = EnumConstant(
        "{@code ZSTD_format_e}",

        "f_zstd1".enum("zstd frame format, specified in zstd_compression_format.md (default)"),
        "f_zstd1_magicless".enum(
            """
            Variant of zstd frame format, without initial 4-bytes magic number. Useful to save 4 bytes per generated frame. Decoder cannot recognise
            automatically this format, requiring instructions.
            """
        )
    ).javaDocLinks

    val cParameters = EnumConstant(
        "{@code ZSTD_cParameter}",

        /* compression format */
        "p_format".enum("Cast selected format as unsigned for #CCtx_setParameter() compatibility.", "10"),

        /* compression parameters */
        "p_compressionLevel".enum(
            """
            Update all compression parameters according to pre-defined {@code cLevel} table.

            Default level is {@code ZSTD_CLEVEL_DEFAULT==3}.
            Special: value 0 means "do not change {@code cLevel}".

            Notes:
            ${ol(
                "it's possible to pass a negative compression level by casting it to unsigned type.",
                "setting a level sets all default values of other compression parameters.",
                "setting compressionLevel automatically updates #p_compressLiterals."
            )}
            """,
            "100"
        ),
        "p_windowLog".enum(
            """
            Maximum allowed back-reference distance, expressed as power of 2.

            Must be clamped between #WINDOWLOG_MIN and #WINDOWLOG_MAX.

            Special: value 0 means "use default {@code windowLog}".

            Note: Using a window size greater than {@code ZSTD_MAXWINDOWSIZE_DEFAULT} (default: {@code 2^27}) requires explicitly allowing such window size
            during decompression stage.
            """),
        "p_hashLog".enum(
            """
            Size of the initial probe table, as a power of 2.

            Resulting table size is {@code (1 << (hashLog+2))}. Must be clamped between #HASHLOG_MIN and #HASHLOG_MAX. Larger tables improve compression ratio
            of strategies &le; {@code dFast}, and improve speed of strategies &gt; {@code dFast}.

            Special: value 0 means "use default {@code hashLog}".
            """),
        "p_chainLog".enum(
            """
            Size of the multi-probe search table, as a power of 2.

            Resulting table size is {@code (1 << (chainLog+2))}. Must be clamped between #CHAINLOG_MIN and #CHAINLOG_MAX. Larger tables result in better and
            slower compression. This parameter is useless when using "fast" strategy. Note it's still useful when using "dfast" strategy, in which case it
            defines a secondary probe table.

            Special: value 0 means "use default {@code chainLog}".
            """),
        "p_searchLog".enum(
            """
            Number of search attempts, as a power of 2.

            More attempts result in better and slower compression. This parameter is useless when using "fast" and "dFast" strategies.

            Special: value 0 means "use default {@code searchLog}".
            """),
        "p_minMatch".enum(
            """
            Minimum size of searched matches (note: {@code repCode} matches can be smaller).

            Larger values make faster compression and decompression, but decrease ratio. Must be clamped between #SEARCHLENGTH_MIN and #SEARCHLENGTH_MAX.

            Note that currently, for all strategies &lt; {@code btopt}, effective minimum is 4.

            Note that currently, for all strategies &gt; fast, effective maximum is 6.

            Special: value 0 means "use default {@code minMatchLength}".
            """),
        "p_targetLength".enum(
            """
            Impact of this field depends on strategy.

            For strategies {@code btopt} & {@code btultra}:
            ${ul(
                "Length of Match considered \"good enough\" to stop search.",
                "Larger values make compression stronger, and slower."
            )}

            For strategy {@code fast}:
            ${ul(
                "Distance between match sampling.",
                "Larger values make compression faster, and weaker."
            )}

            Special: value 0 means "use default {@code targetLength}".
            """),
        "p_compressionStrategy".enum(
            """
            See {@code ZSTD_strategy} enum definition.

            Cast selected strategy as unsigned for #CCtx_setParameter() compatibility. The higher the value of selected strategy, the more complex it is,
            resulting in stronger and slower compression.

            Special: value 0 means "use default strategy".
            """),
        "p_enableLongDistanceMatching".enum(
            """
            Enable long distance matching.

            This parameter is designed to improve compression ratio for large inputs, by finding large matches at long distance. It increases memory usage and
            window size.

            Note: enabling this parameter increases #p_windowLog to 128 MB except when expressly set to a different value.
            """,
            "160"
        ),
        "p_ldmHashLog".enum(
            """
            Size of the table for long distance matching, as a power of 2.

            Larger values increase memory usage and compression ratio, but decrease compression speed. Must be clamped between #HASHLOG_MIN and #HASHLOG_MAX

            Default: {@code windowlog - 7}.

            Special: value 0 means "automatically determine {@code hashlog}".
            """),
        "p_ldmMinMatch".enum(
            """
            Minimum match size for long distance matcher.

            Larger/too small values usually decrease compression ratio. Must be clamped between #LDM_MINMATCH_MIN and #LDM_MINMATCH_MAX.

            Special: value 0 means "use default value" (default: 64).
            """),
        "p_ldmBucketSizeLog".enum(
            """
            Log size of each bucket in the LDM hash table for collision resolution.

            Larger values improve collision resolution but decrease compression speed. The maximum value is #LDM_BUCKETSIZELOG_MAX .

            Special: value 0 means "use default value" (default: 3).
            """),
        "p_ldmHashEveryLog".enum(
            """
            Frequency of inserting/looking up entries in the LDM hash table.

            Must be clamped between 0 and (#WINDOWLOG_MAX - #HASHLOG_MIN). Default is {@code MAX(0, (windowLog - ldmHashLog))}, optimizing hash table usage.
            Larger values improve compression speed. Deviating far from default value will likely result in a compression ratio decrease.

            Special: value 0 means "automatically determine {@code hashEveryLog}".
            """),

        /* frame parameters */
        "p_contentSizeFlag".enum(
            """
            Content size will be written into frame header <i>whenever known</i> (default:1)

            Content size must be known at the beginning of compression, it is provided using #CCtx_setPledgedSrcSize().
            """,
            "200"),
        "p_checksumFlag".enum("A 32-bits checksum of content is written at end of frame (default:0)."),
        "p_dictIDFlag".enum("When applicable, dictionary's ID is written into frame header (default:1)."),

        /* multi-threading parameters */
        "p_nbWorkers".enum(
            """
            Select how many threads will be spawned to compress in parallel.

            When {@code nbWorkers} &ge; 1, triggers asynchronous mode: #compress_generic() consumes some input, flush some output if possible, and immediately
            gives back control to caller, while compression work is performed in parallel, within worker threads. (note: a strong exception to this rule is
            when first invocation sets #e_end : it becomes a blocking call).

            More workers improve speed, but also increase memory usage.

            Default value is 0, aka "single-threaded mode": no worker is spawned, compression is performed inside Caller's thread, all invocations are
            blocking.
            """,
            "400"),
        "p_nonBlockingMode".enum(
            """
            Single thread mode is by default "blocking": it finishes its job as much as possible, and only then gives back control to caller.

            In contrast, multi-thread is by default "non-blocking": it takes some input, flush some output if available, and immediately gives back control to
            caller. Compression work is performed in parallel, within worker threads. (note : a strong exception to this rule is when first job is called with
            #e_end : it becomes blocking)

            Setting this parameter to 1 will enforce non-blocking mode even when only 1 thread is selected. It allows the caller to do other tasks while the
            worker thread compresses in parallel.
            """),
        "p_jobSize".enum(
            """
            Size of a compression job.

            This value is enforced only in non-blocking mode. Each compression job is completed in parallel, so this value indirectly controls the {@code nb}
            of active threads. 0 means default, which is dynamically determined based on compression parameters. Job size must be a minimum of
            {@code overlapSize}, or 1 MB, whichever is largest. The minimum size is automatically and transparently enforced.
            """),
        "p_overlapSizeLog".enum(
            """
            Size of previous input reloaded at the beginning of each job.
            ${ul(
                "{@code 0: no overlap}",
                "{@code 6(default): use 1/8th of windowSize}",
                "{@code >=9: use full windowSize}"
            )}
            """),

        /* experimental parameters - no stability guaranteed */
        "p_compressLiterals".enum(
            """
            Control huffman compression of literals (enabled) by default.

            Disabling it improves speed and decreases compression ratio by a large amount.

            Note : this setting is automatically updated when changing compression level. Positive compression levels set {@code ZSTD_p_compressLiterals} to 1.
            Negative compression levels set {@code ZSTD_p_compressLiterals} to 0.
            """,
            "1000"
        ),
        "p_forceMaxWindow".enum("Force back-reference distances to remain &lt; windowSize, even when referencing into Dictionary content (default:0)", "1100")
    ).javaDocLinks

    val endDirectives = EnumConstant(
        "{@code ZSTD_EndDirective}",

        "e_continue".enum("collect more data, encoder decides when to output compressed result, for optimal conditions"),
        "e_flush".enum("flush any data provided so far - frame will continue, future data can still reference previous data for better compression"),
        "e_end".enum("flush any remaining data and close current frame. Any additional data starts a new frame")
    ).javaDocLinks

    size_t(
        "findFrameCompressedSize",
        "",

        void.const.p.IN("src", "should point to the start of a ZSTD encoded frame or skippable frame"),
        AutoSize("src")..size_t.IN("srcSize", "must be &ge; first frame size"),

        returnDoc =
        "the compressed size of the first frame starting at {@code src}, suitable to pass to #decompress() or similar, or an error code if input is invalid"
    )

    unsigned_long_long(
        "findDecompressedSize",
        """
        Notes:
        ${ol(
            """
            decompressed size is an optional field, that may not be present, especially in streaming mode. When {@code return==ZSTD_CONTENTSIZE_UNKNOWN}, data
            to decompress could be any size. In which case, it's necessary to use streaming mode to decompress data.
            """,
            "decompressed size is always present when compression is done with #compress().",
            """
            decompressed size can be very large (64-bits value), potentially larger than what local system can handle as a single memory segment. In which
            case, it's necessary to use streaming mode to decompress data.
            """,
            """
            If source is untrusted, decompressed size could be wrong or intentionally modified. Always ensure result fits within application's authorized
            limits. Each application can set its own limits.
            """,
            """
            {@code ZSTD_findDecompressedSize} handles multiple frames, and so it must traverse the input to read each contained frame header. This is fast as
            most of the data is skipped, however it does mean that all frame data must be present and valid.
            """
        )}
        """,

        void.const.p.IN("src", "should point the start of a series of ZSTD encoded and/or skippable frames"),
        AutoSize("src")..size_t.IN(
            "srcSize",
            "must be the <i>exact</i> size of this series (i.e. there should be a frame boundary exactly at {@code srcSize} bytes after {@code src})"
        ),

        returnDoc =
        """
        decompressed size of all data in all successive frames. If the decompressed size cannot be determined: #CONTENTSIZE_UNKNOWN. If an error
        occurred: #CONTENTSIZE_ERROR
        """
    )

    size_t(
        "frameHeaderSize",
        "",

        void.const.p.IN("src", "should point to the start of a ZSTD frame"),
        AutoSize("src")..size_t.IN("srcSize", "must be &ge; #FRAMEHEADERSIZE_PREFIX"),

        returnDoc = "size of the Frame Header or an error code (if {@code srcSize} is too small)"
    )

    size_t(
        "sizeof_CCtx",
        "",

        ZSTD_CCtx.const.p.IN("cctx", "")
    )

    size_t(
        "sizeof_DCtx",
        "",

        ZSTD_DCtx.const.p.IN("dctx", "")
    )

    size_t(
        "sizeof_CStream",
        "",

        ZSTD_CStream.const.p.IN("zcs", "")
    )

    size_t(
        "sizeof_DStream",
        "",

        ZSTD_DStream.const.p.IN("zds", "")
    )

    size_t(
        "sizeof_CDict",
        "",

        ZSTD_CDict.const.p.IN("cdict", "")
    )

    size_t(
        "sizeof_DDict",
        "",

        ZSTD_DDict.const.p.IN("ddict", "")
    )

    size_t(
        "estimateCCtxSize",
        """
        Estimates memory usage of a future {@code CCtx}, before its creation.

        Will provide a budget large enough for any compression level up to selected one. It will also consider {@code src} size to be arbitrarily "large",
        which is worst case. If {@code srcSize} is known to always be small, #estimateCCtxSize_usingCCtxParams() can provide a tighter estimation.

        Note: {@code CCtx} size estimation is only correct for single-threaded compression.
        """,

        int.IN("compressionLevel", "")
    )

    size_t(
        "estimateCCtxSize_usingCCtxParams",
        """
        See #estimateCCtxSize().

        Can be used in tandem with #CCtxParam_setParameter(). Only single-threaded compression is supported. This function will return an error code if
        {@code ZSTD_p_nbWorkers} is &ge; 1.
        """,

        ZSTD_CCtx_params.const.p.IN("params", "")
    )

    size_t(
        "estimateDCtxSize",
        "Estimates memory usage of a future {@code DCtx}, before its creation."
    )

    size_t(
        "estimateCStreamSize",
        """
        Estimates memory usage of a future {@code CStream}, before its creation.

        Will provide a budget large enough for any compression level up to selected one. It will also consider {@code src} size to be arbitrarily "large",
        which is worst case.  If {@code srcSize} is known to always be small, #estimateCStreamSize_usingCCtxParams() can provide a tighter estimation.
        """,

        int.IN("compressionLevel", "")
    )

    size_t(
        "estimateCStreamSize_usingCCtxParams",
        """
        See #estimateCStreamSize().

        Can be used in tandem with #CCtxParam_setParameter(). Only single-threaded compression is supported. This function will return an error code if
        {@code ZSTD_p_nbWorkers} is &ge; 1.
        """,

        ZSTD_CCtx_params.const.p.IN("params", "")
    )

    size_t(
        "estimateDStreamSize",
        """
        Estimates memory usage of a future {@code DStream}, before its creation.

        {@code ZSTD_DStream} memory budget depends on window Size. This information can be passed manually, using {@code ZSTD_estimateDStreamSize}, or deducted
        from a valid frame {@code Header}, using #estimateDStreamSize_fromFrame().
        """,

        size_t.IN("windowSize", "")
    )

    size_t(
        "estimateDStreamSize_fromFrame",
        "See #estimateDStreamSize().",

        void.const.p.IN("src", ""),
        AutoSize("src")..size_t.IN("srcSize", "")
    )

    size_t(
        "estimateCDictSize",
        """
        Estimates memory usage of a future {@code CDict}, before its creation.

        Will bet that {@code src} size is relatively "small", and content is copied, like #createCDict().
        """,

        size_t.IN("dictSize", ""),
        int.IN("compressionLevel", "")
    )

    size_t(
        "estimateDDictSize",
        "Estimates memory usage of a future {@code DDict}, before its creation.",

        size_t.IN("dictSize", ""),
        ZSTD_dictLoadMethod_e.IN("dictLoadMethod", "", dictLoadMethods)
    )

    macro..Address..ZSTD_customMem.p(
        "defaultCMem",
        "Use this constant to defer to stdlib's functions."
    )

    ZSTD_CCtx.p(
        "createCCtx_advanced",
        "Create a ZSTD compression context using external alloc and free functions.",

        ZSTD_customMem.IN("customMem", "")
    )

    ZSTD_CCtx.p(
        "initStaticCCtx",
        """
        Initialize a fixed-size zstd compression context workspace.

        Notes:
        ${ol(
            "zstd will never resize nor {@code malloc()} when using a static {@code cctx}. If it needs more memory than available, it will simply error out.",
            "there is no corresponding \"free\" function. Since workspace was allocated externally, it must be freed externally too."
        )}

        Limitations:
        ${ol(
            "currently not compatible with internal {@code CDict} creation, such as #CCtx_loadDictionary() or {@code ZSTD_initCStream_usingDict()}.",
            "currently not compatible with multi-threading"
        )}
        """,

        void.p.IN("workspace", "the memory area to emplace the context into. Provided pointer must 8-bytes aligned. It must outlive context usage."),
        AutoSize("workspace")..size_t.IN(
            "workspaceSize",
            "use #estimateCCtxSize() or #estimateCStreamSize() to determine how large workspace must be to support scenario"
        ),

        returnDoc = "pointer to {@code ZSTD_CCtx*} (same address as workspace, but different type), or #NULL if error (typically size too small)"
    )

    unsignedb(
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

        void.const.p.IN("buffer", ""),
        AutoSize("buffer")..size_t.IN("size", "")
    )

    ZSTD_DCtx.p(
        "createDCtx_advanced",
        "Create a ZSTD decompression context using external alloc and free functions.",

        ZSTD_customMem.IN("customMem", "")
    )

    ZSTD_DCtx.p(
        "initStaticDCtx",
        """
        Notes:
        ${ol(
            "zstd will never resize nor {@code malloc()} when using a static {@code dctx}. If it needs more memory than available, it will simply error out.",
            "static {@code dctx} is incompatible with legacy support.",
            "there is no corresponding \"free\" function. Since workspace was allocated externally, it must be freed externally."
        )}

        Limitation: currently not compatible with internal {@code DDict} creation, such as {@code ZSTD_initDStream_usingDict()}.
        """,

        void.p.IN("workspace", "The memory area to emplace the context into. Provided pointer must 8-bytes aligned. It must outlive context usage."),
        AutoSize("workspace")..size_t.IN(
            "workspaceSize",
            "use #estimateDCtxSize() or #estimateDStreamSize() to determine how large workspace must be to support scenario"
        ),

        returnDoc = "pointer to {@code ZSTD_DCtx*} (same address as workspace, but different type), or #NULL if error (typically size too small)"
    )

    ZSTD_DDict.p(
        "createDDict_advanced",
        "Create a {@code ZSTD_DDict} using external alloc and free, optionally by reference.",

        void.const.p.IN("dict", ""),
        AutoSize("dict")..size_t.IN("dictSize", ""),
        ZSTD_dictLoadMethod_e.IN("dictLoadMethod", "", dictLoadMethods),
        ZSTD_dictContentType_e.IN("dictContentType", "", dictContentTypes),
        ZSTD_customMem.IN("customMem", "")
    )

    ZSTD_DDict.const.p(
        "initStaticDDict",
        """
        Generate a digested dictionary in provided memory area.

        Note: there is no corresponding "free" function. Since workspace was allocated externally, it must be freed externally.
        """,

        void.p.IN("workspace", "The memory area to emplace the dictionary into. Provided pointer must 8-bytes aligned. It must outlive dictionary usage."),
        AutoSize("workspace")..size_t.IN("workspaceSize", "use #estimateDDictSize() to determine how large workspace must be"),
        void.const.p.IN("dict", ""),
        AutoSize("dict")..size_t.IN("dictSize", ""),
        ZSTD_dictLoadMethod_e.IN("dictLoadMethod", "", dictLoadMethods),
        ZSTD_dictContentType_e.IN("dictContentType", "", dictContentTypes)
    )

    unsigned_int(
        "getDictID_fromDict",
        "Provides the dictID stored within dictionary.",

        void.const.p.IN("dict", ""),
        AutoSize("dict")..size_t.IN("dictSize", ""),

        returnDoc = "if 0, the dictionary is not conformant with Zstandard specification. It can still be loaded, but as a content-only dictionary."
    )

    unsigned_int(
        "getDictID_fromDDict",
        "Provides the {@code dictID} of the dictionary loaded into {@code ddict}.",

        ZSTD_DDict.const.p.IN("ddict", ""),

        returnDoc =
        """
        if @return == 0, the dictionary is not conformant to Zstandard specification, or empty. Non-conformant dictionaries can still be loaded, but as
        content-only dictionaries.
        """
    )

    unsigned_int(
        "getDictID_fromFrame",
        "Provides the {@code dictID} required to decompressed the frame stored within {@code src}.",

        void.const.p.IN("src", ""),
        AutoSize("src")..size_t.IN("srcSize", ""),

        returnDoc =
        """
        if 0, the dictID could not be decoded. This could for one of the following reasons:
        ${ul(
            "The frame does not require a dictionary to be decoded (most common case).",
            """
            The frame was built with {@code dictID} intentionally removed. Whatever dictionary is necessary is a hidden information. Note: this use case also
            happens when using a non-conformant dictionary.
            """,
            "{@code srcSize} is too small, and as a result, the frame header could not be decoded (only possible if {@code srcSize < ZSTD_FRAMEHEADERSIZE_MAX}).",
            "This is not a Zstandard frame."
        )}
        When identifying the exact failure cause, it's possible to use #getFrameHeader(), which will provide a more precise error code.
        """
    )

    ZSTD_CStream.p(
        "createCStream_advanced",
        "",

        ZSTD_customMem.IN("customMem", "")
    )

    ZSTD_CStream.p(
        "initStaticCStream",
        "",

        void.p.IN("workspace", ""),
        AutoSize("workspace")..size_t.IN("workspaceSize", "")
    )

    ZSTD_DStream.p(
        "createDStream_advanced",
        "",

        ZSTD_customMem.IN("customMem", "")
    )

    ZSTD_DStream.p(
        "initStaticDStream",
        "",

        void.p.IN("workspace", ""),
        AutoSize("workspace")..size_t.IN("workspaceSize", "")
    )

    size_t(
        "copyCCtx",
        "",

        ZSTD_CCtx.p.IN("cctx", ""),
        ZSTD_CCtx.const.p.IN("preparedCCtx", ""),
        unsigned_long_long.IN(
            "pledgedSrcSize",
            "can be 0, indicating unknown size. If it is non-zero, it must be accurate. For 0 size frames, use {@code compressBegin_advanced}"
        )
    )

    ZSTD_frameProgression(
        "getFrameProgression",
        """
        Tells how much data has been {@code ingested} (read from input) {@code consumed} (input actually compressed) and {@code produced} (output) for current
        frame. Therefore, {@code (ingested - consumed)} is amount of input data buffered internally, not yet compressed.

        Can report progression inside worker threads (multi-threading and non-blocking mode).
        """,

        ZSTD_CCtx.const.p.IN("cctx", "")
    )

    size_t(
        "getFrameHeader",
        """
        Decode Frame Header, or requires larger {@code srcSize}.

        Doesn't consume input.
        """,

        ZSTD_frameHeader.p.OUT("zfhPtr", ""),
        void.const.p.IN("src", ""),
        AutoSize("src")..size_t.IN("srcSize", ""),

        returnDoc =
        """
        if 0, {@code zfhPtr} is correctly filled. If >0, {@code srcSize} is too small, value is wanted {@code srcSize} amount, or an error code, which can be
        tested using #isError().
        """
    )

    void(
        "copyDCtx",
        "",

        ZSTD_DCtx.p.IN("dctx", ""),
        ZSTD_DCtx.const.p.IN("preparedDCtx", "")
    )

    size_t(
        "CCtx_setParameter",
        """
        Sets one compression parameter, selected by enum {@code ZSTD_cParameter}.

        Setting a parameter is generally only possible during frame initialization (before starting compression). Exception: when using multi-threading mode
        ({@code nbThreads} &ge; 1), following parameters can be updated <em>during</em> compression (within same frame): {@code compressionLevel},
        {@code hashLog}, {@code chainLog}, {@code searchLog}, {@code minMatch}, {@code targetLength} and {@code strategy}. New parameters will be active on
        next job, or after a {@code flush()}.

        Note: when {@code value} type is not unsigned (int, or enum), cast it to unsigned for proper type checking.
        """,

        ZSTD_CCtx.p.IN("cctx", ""),
        ZSTD_cParameter.IN("param", "", cParameters),
        unsigned_int.IN("value", ""),

        returnDoc = "informational value (typically, value being set, correctly clamped), 0, or an error code (which can be tested with #isError())"
    )

    size_t(
        "CCtx_getParameter",
        "Get the requested value of one compression parameter, selected by enum {@code ZSTD_cParameter}.",

        ZSTD_CCtx.p.IN("cctx", ""),
        ZSTD_cParameter.IN("param", "", cParameters),
        Check(1)..unsigned.p.OUT("value", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())."
    )

    size_t(
        "CCtx_setPledgedSrcSize",
        """
        Sets the total input data size to be compressed as a single frame. This value will be controlled at the end, and result in error if not respected.

        Notes:
        ${ol(
            """
            0 means zero, empty.

            In order to mean "unknown content size", pass constant #CONTENTSIZE_UNKNOWN. #CONTENTSIZE_UNKNOWN is default value for any new compression job.
            """,
            "If all data is provided and consumed in a single round, this value is overridden by {@code srcSize} instead."
        )}
        """,

        ZSTD_CCtx.p.IN("cctx", ""),
        unsigned_long_long.IN("pledgedSrcSize", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
    )

    size_t(
        "CCtx_loadDictionary",
        """
        Create an internal CDict from {@code dict} buffer. Decompression will have to use same dictionary.

        Special: Adding a #NULL (or 0-size) dictionary invalidates any previous dictionary, meaning "return to no-dictionary mode".

        Notes:
        ${ol(
            "Dictionary will be used for all future compression jobs. To return to \"no-dictionary\" situation, load a #NULL dictionary.",
            """
            Loading a dictionary involves building tables, which are dependent on compression parameters. For this reason, compression parameters cannot be
            changed anymore after loading a dictionary. It's also a CPU consuming operation, with non-negligible impact on latency.
            """,
            """
            {@code dict} content will be copied internally. Use #CCtx_loadDictionary_byReference() to reference dictionary content instead. In such a case,
            dictionary buffer must outlive its users.
            """,
            "Use #CCtx_loadDictionary_advanced() to precisely select how dictionary content must be interpreted."
        )}
        """,

        ZSTD_CCtx.p.IN("cctx", ""),
        nullable..void.const.p.IN("dict", ""),
        AutoSize("dict")..size_t.IN("dictSize", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
    )

    size_t(
        "CCtx_loadDictionary_byReference",
        "See #CCtx_loadDictionary().",

        ZSTD_CCtx.p.IN("cctx", ""),
        nullable..void.const.p.IN("dict", ""),
        AutoSize("dict")..size_t.IN("dictSize", "")
    )

    size_t(
        "CCtx_loadDictionary_advanced",
        "See #CCtx_loadDictionary().",

        ZSTD_CCtx.p.IN("cctx", ""),
        nullable..void.const.p.IN("dict", ""),
        AutoSize("dict")..size_t.IN("dictSize", ""),
        ZSTD_dictLoadMethod_e.IN("dictLoadMethod", "", dictLoadMethods),
        ZSTD_dictContentType_e.IN("dictContentType", "", dictContentTypes)
    )

    size_t(
        "CCtx_refCDict",
        """
        Reference a prepared dictionary, to be used for all next compression jobs.

        Note that compression parameters are enforced from within {@code CDict}, and supercede any compression parameter previously set within {@code CCtx}.

        The dictionary will remain valid for future compression jobs using same CCtx.

        Special: adding a #NULL {@code CDict} means "return to no-dictionary mode".

        Notes:
        ${ol(
            "Currently, only one dictionary can be managed. Adding a new dictionary effectively \"discards\" any previous one.",
            "{@code CDict} is just referenced, its lifetime must outlive {@code CCtx}."
        )}
        """,

        ZSTD_CCtx.p.IN("cctx", ""),
        nullable..ZSTD_CDict.const.p.IN("cdict", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
    )

    size_t(
        "CCtx_refPrefix",
        """
        Reference a prefix (single-usage dictionary) for next compression job.

        Decompression need same prefix to properly regenerate data. Prefix is <b>only used once</b>. Tables are discarded at end of compression job. Subsequent
        compression jobs will be done without prefix (if none is explicitly referenced). If there is a need to use same prefix multiple times, consider
        embedding it into a {@code ZSTD_CDict} instead.

        Special: Adding any prefix (including #NULL) invalidates any previous prefix or dictionary.

        Notes:
        ${ol(
            "Prefix buffer is referenced. It must outlive compression job.",
            """
            Referencing a prefix involves building tables, which are dependent on compression parameters. It's a CPU consuming operation, with non-negligible
            impact on latency.
            """,
            "By default, the prefix is treated as raw content ({@code ZSTD_dm_rawContent}). Use #CCtx_refPrefix_advanced() to alter {@code dictMode}."
        )}
        """,

        ZSTD_CCtx.p.IN("cctx", ""),
        nullable..void.const.p.IN("prefix", ""),
        AutoSize("prefix")..size_t.IN("prefixSize", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
    )

    size_t(
        "CCtx_refPrefix_advanced",
        "See #CCtx_refPrefix().",

        ZSTD_CCtx.p.IN("cctx", ""),
        nullable..void.const.p.IN("prefix", ""),
        AutoSize("prefix")..size_t.IN("prefixSize", ""),
        ZSTD_dictContentType_e.IN("dictContentType", "", dictContentTypes)
    )

    void(
        "CCtx_reset",
        """
        Return a {@code CCtx} to clean state.

        Useful after an error, or to interrupt an ongoing compression job and start a new one. Any internal data not yet flushed is cancelled. The parameters
        and dictionary are kept unchanged, to reset them use #CCtx_resetParameters().
        """,

        ZSTD_CCtx.p.IN("cctx", "")
    )

    size_t(
        "CCtx_resetParameters",
        """
        All parameters are back to default values (compression level is #CLEVEL_DEFAULT).

        Dictionary (if any) is dropped. Resetting parameters is only possible during frame initialization (before starting compression). To reset the context
        use #CCtx_reset().
        """,

        ZSTD_CCtx.p.IN("cctx", ""),

        returnDoc = "0 or an error code (which can be checked with #isError())."
    )

    size_t(
        "compress_generic",
        """
        Behave about the same as #compressStream().

        Notes:
        ${ul(
            "Compression parameters are pushed into {@code CCtx} before starting compression, using #CCtx_setParameter().",
            "Compression parameters cannot be changed once compression is started.",
            "{@code output->pos} must be &le; {@code dstCapacity}, {@code input->pos} must be &le; {@code srcSize}.",
            "{@code outpot->pos} and {@code input->pos} will be updated. They are guaranteed to remain below their respective limit.",
            "In single-thread mode (default), function is blocking: it completed its job before returning to caller.",
            """
            In multi-thread mode, function is non-blocking: it just acquires a copy of input, and distribute job to internal worker threads, and then
            immediately returns, just indicating that there is some data remaining to be flushed. The function nonetheless guarantees forward progress: it will
            return only after it reads or write at least 1+ byte.
            """,
            """
            Exception: in multi-threading mode, if the first call requests a #e_end directive, it is blocking: it will complete compression before giving back
            control to caller.
            """,
            """
            after a #e_end directive, if internal buffer is not fully flushed (return != 0), only #e_end or #e_flush operations are allowed. Before starting a
            new compression job, or changing compression parameters, it is required to fully flush internal buffers.
            """
        )}
         """,

        ZSTD_CCtx.p.IN("cctx", ""),
        ZSTD_outBuffer.p.IN("output", ""),
        ZSTD_inBuffer.p.IN("input", ""),
        ZSTD_EndDirective.IN("endOp", "", endDirectives),

        returnDoc =
        """
        provides a minimum amount of data remaining to be flushed from internal buffers or an error code, which can be tested using #isError(). If
        {@code @return != 0}, flush is not fully completed, there is still some data left within internal buffers. This is useful for #e_flush, since in this
        case more flushes are necessary to empty all buffers. For #e_end, {@code @return == 0} when internal buffers are fully flushed and frame is completed.
        """
    )

    size_t(
        "compress_generic_simpleArgs",
        "Same as #compress_generic(), but using only integral types as arguments.",

        ZSTD_CCtx.p.IN("cctx", ""),
        void.p.OUT("dst", ""),
        AutoSize("dst")..size_t.IN("dstCapacity", ""),
        Check(1)..size_t.p.INOUT("dstPos", ""),
        void.const.p.IN("src", ""),
        AutoSize("src")..size_t.IN("srcSize", ""),
        Check(1)..size_t.p.INOUT("srcPos", ""),
        ZSTD_EndDirective.IN("endOp", "", endDirectives)
    )

    ZSTD_CCtx_params.p(
        "createCCtxParams",
        "Creates a {@code ZSTD_CCtx_params} structure."
    )

    size_t(
        "freeCCtxParams",
        "Frees memory allocated by #createCCtxParams().",

        ZSTD_CCtx_params.p.IN("params", "")
    )

    size_t(
        "CCtxParams_reset",
        "Reset params to default values.",

        ZSTD_CCtx_params.p.IN("params", "")
    )

    size_t(
        "CCtxParams_init",
        "Initializes the compression parameters of {@code cctxParams} according to compression level. All other parameters are reset to their default values.",

        ZSTD_CCtx_params.p.IN("cctxParams", ""),
        int.IN("compressionLevel", "")
    )

    size_t(
        "CCtxParam_setParameter",
        """
        Similar to #CCtx_setParameter().

        Set one compression parameter, selected by enum {@code ZSTD_cParameter}. Parameters must be applied to a {@code ZSTD_CCtx} using
        #CCtx_setParametersUsingCCtxParams().
        """,

        ZSTD_CCtx_params.p.IN("params", ""),
        ZSTD_cParameter.IN("param", "", cParameters),
        unsigned_int.IN("value", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
    )

    size_t(
        "CCtxParam_getParameter",
        """
        Similar to #CCtx_getParameter().

        Get the requested value of one compression parameter, selected by enum {@code ZSTD_cParameter}.
        """,

        ZSTD_CCtx_params.p.IN("params", ""),
        ZSTD_cParameter.IN("param", "", cParameters),
        Check(1)..unsigned.p.OUT("value", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())."
    )

    size_t(
        "CCtx_setParametersUsingCCtxParams",
        """
        Apply a set of {@code ZSTD_CCtx_params} to the compression context.

        This can be done even after compression is started, if {@code nbWorkers==0}, this will have no impact until a new compression is started. If
        {@code nbWorkers>=1}, new parameters will be picked up at next job, with a few restrictions ({@code windowLog}, {@code pledgedSrcSize},
        {@code nbWorkers}, {@code jobSize}, and {@code overlapLog} are not updated).
        """,

        ZSTD_CCtx.p.IN("cctx", ""),
        ZSTD_CCtx_params.const.p.IN("params", "")
    )

    size_t(
        "DCtx_loadDictionary",
        """
        Create an internal {@code DDict} from dict buffer, to be used to decompress next frames.

        Special: Adding a #NULL (or 0-size) dictionary invalidates any previous dictionary, meaning "return to no-dictionary mode".

        Notes:
        ${ol(
            """
            {@code dict} content will be copied internally. Use #DCtx_loadDictionary_byReference() to reference dictionary content instead. In which case, the
            dictionary buffer must outlive its users.
            """,
            "Loading a dictionary involves building tables, which has a non-negligible impact on CPU usage and latency.",
            "Use #DCtx_loadDictionary_advanced() to select how dictionary content will be interpreted and loaded."
        )}
        """,

        ZSTD_DCtx.p.IN("dctx", ""),
        nullable..void.const.p.IN("dict", ""),
        AutoSize("dict")..size_t.IN("dictSize", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
    )

    size_t(
        "DCtx_loadDictionary_byReference",
        "See #DCtx_loadDictionary().",

        ZSTD_DCtx.p.IN("dctx", ""),
        nullable..void.const.p.IN("dict", ""),
        AutoSize("dict")..size_t.IN("dictSize", "")
    )

    size_t(
        "DCtx_loadDictionary_advanced",
        "See #DCtx_loadDictionary().",

        ZSTD_DCtx.p.IN("dctx", ""),
        nullable..void.const.p.IN("dict", ""),
        AutoSize("dict")..size_t.IN("dictSize", ""),
        ZSTD_dictLoadMethod_e.IN("dictLoadMethod", "", dictLoadMethods),
        ZSTD_dictContentType_e.IN("dictContentType", "", dictContentTypes)
    )

    size_t(
        "DCtx_refDDict",
        """
        Reference a prepared dictionary, to be used to decompress next frames. The dictionary remains active for decompression of future frames using same
        {@code DCtx}.

        Special: adding a #NULL {@code DDict} means "return to no-dictionary mode".

        Notes:
        ${ol(
            "Currently, only one dictionary can be managed. Referencing a new dictionary effectively \"discards\" any previous one.",
            "{@code DDict} is just referenced, its lifetime must outlive its usage from {@code DCtx}."
        )}
        """,

        ZSTD_DCtx.p.IN("dctx", ""),
        ZSTD_DDict.const.p.IN("ddict", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
    )

    size_t(
        "DCtx_refPrefix",
        """
        Reference a prefix (single-usage dictionary) for next compression job.

        Prefix is <b>only used once</b>. It must be explicitly referenced before each frame. If there is a need to use same prefix multiple times, consider
        embedding it into a {@code ZSTD_DDict} instead.

        Notes:
        ${ol(
            "Adding any prefix (including #NULL) invalidates any previously set prefix or dictionary",
            "Prefix buffer is referenced. It must outlive compression job.",
            "By default, the prefix is treated as raw content ({@code ZSTD_dm_rawContent}). Use #CCtx_refPrefix_advanced() to alter {@code dictMode}.",
            "Referencing a raw content prefix has almost no cpu nor memory cost."
        )}
        """,

        ZSTD_DCtx.p.IN("dctx", ""),
        nullable..void.const.p.IN("prefix", ""),
        AutoSize("prefix")..size_t.IN("prefixSize", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
    )

    size_t(
        "DCtx_refPrefix_advanced",
        "See #DCtx_refPrefix().",

        ZSTD_DCtx.p.IN("dctx", ""),
        nullable..void.const.p.IN("prefix", ""),
        AutoSize("prefix")..size_t.IN("prefixSize", ""),
        ZSTD_dictContentType_e.IN("dictContentType", "", dictContentTypes)
    )

    size_t(
        "DCtx_setMaxWindowSize",
        """
        Refuses allocating internal buffers for frames requiring a window size larger than provided limit.

        This is useful to prevent a decoder context from reserving too much memory for itself (potential attack scenario). This parameter is only useful in
        streaming mode, since no internal buffer is allocated in direct mode. By default, a decompression context accepts all window sizes &le;
        {@code (1 << ZSTD_WINDOWLOG_MAX)}
        """,

        ZSTD_DCtx.p.IN("dctx", ""),
        size_t.IN("maxWindowSize", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
    )

    size_t(
        "DCtx_setFormat",
        "",

        ZSTD_DCtx.p.IN("dctx", ""),
        ZSTD_format_e.IN("format", "", formats)
    )

    size_t(
        "getFrameHeader_advanced",
        "Same as #getFrameHeader(), with added capability to select a format (like #f_zstd1_magicless).",

        ZSTD_frameHeader.p.OUT("zfhPtr", ""),
        void.const.p.IN("src", ""),
        AutoSize("src")..size_t.IN("srcSize", ""),
        ZSTD_format_e.IN("format", "", formats)
    )

    size_t(
        "decompress_generic",
        """
        Behave the same as #decompressStream().

        Decompression parameters cannot be changed once decompression is started.
        """,

        ZSTD_DCtx.p.IN("dctx", ""),
        ZSTD_outBuffer.p.IN("output", ""),
        ZSTD_inBuffer.p.IN("input", ""),

        returnDoc =
        """
        an error code, which can be tested using #isError(). If &gt; 0, a hint, {@code nb} of expected input bytes for next invocation. {@code 0} means a frame
        has just been fully decoded and flushed.
        """
    )

    size_t(
        "decompress_generic_simpleArgs",
        "Same as #decompress_generic(), but using only integral types as arguments.",

        ZSTD_DCtx.p.IN("dctx", ""),
        void.p.OUT("dst", ""),
        AutoSize("dst")..size_t.IN("dstCapacity", ""),
        Check(1)..size_t.p.INOUT("dstPos", ""),
        void.const.p.IN("src", ""),
        AutoSize("src")..size_t.IN("srcSize", ""),
        Check(1)..size_t.p.INOUT("srcPos", "")
    )

    void(
        "DCtx_reset",
        """
        Return a {@code DCtx} to clean state.

        If a decompression was ongoing, any internal data not yet flushed is cancelled. All parameters are back to default values, including sticky ones.
        Dictionary (if any) is dropped. Parameters can be modified again after a reset.
        """,

        ZSTD_DCtx.p.IN("dctx", "")
    )

    /* ============================ */
    /**       Block level API       */
    /* ============================ */

    IntConstant(
        "Block size constant.",

        "BLOCKSIZELOG_MAX".."17",
        "BLOCKSIZE_MAX".."(1<<ZSTD_BLOCKSIZELOG_MAX)"
    )

    size_t(
        "getBlockSize",
        "",

        ZSTD_CCtx.const.p.IN("cctx", "")
    )

    size_t(
        "compressBlock",
        "",

        ZSTD_CCtx.p.IN("cctx", ""),
        void.p.OUT("dst", ""),
        AutoSize("dst")..size_t.IN("dstCapacity", ""),
        void.const.p.IN("src", ""),
        AutoSize("src")..size_t.IN("srcSize", "")
    )

    size_t(
        "decompressBlock",
        "",

        ZSTD_DCtx.p.IN("dctx", ""),
        void.p.OUT("dst", ""),
        AutoSize("dst")..size_t.IN("dstCapacity", ""),
        void.const.p.IN("src", ""),
        AutoSize("src")..size_t.IN("srcSize", "")
    )

    size_t(
        "insertBlock",
        "Insert uncompressed block into {@code dctx} history. Useful for multi-blocks decompression.",

        ZSTD_DCtx.p.IN("dctx", ""),
        void.const.p.IN("blockStart", ""),
        AutoSize("blockStart")..size_t.IN("blockSize", "")
    )
}