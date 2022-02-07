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
    javaImport("static org.lwjgl.util.zstd.Zstd.*")

    documentation =
        "Native bindings to the experimental API of ${url("http://facebook.github.io/zstd/", "Zstandard")} (zstd)."

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
        "This enum controls #d_forceIgnoreChecksum. {@code ZSTD_forceIgnoreChecksum_e}",

        "d_validateChecksum".enum("", "0"),
        "d_ignoreChecksum".enum
    )

    EnumConstant(
        "This enum controls #d_refMultipleDDicts. {@code ZSTD_refMultipleDDicts_e}",

        "rmd_refSingleDDict".enum("", "0"),
        "rmd_refMultipleDDicts".enum
    )

    EnumConstant(
        "{@code ZSTD_dictAttachPref_e}",

        "dictDefaultAttach".enum("Use the default heuristic.", "0"),
        "dictForceAttach".enum("Never copy the dictionary."),
        "dictForceCopy".enum("Always copy the dictionary."),
        "dictForceLoad".enum("Always reload the dictionary.")
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

    customMethod("""
    public static int ZSTD_FRAMEHEADERSIZE_PREFIX(int format) {
        return format == ZSTD_f_zstd1 ? 5 : 1;
    }

    public static int ZSTD_FRAMEHEADERSIZE_MIN(int format) {
        return format == ZSTD_f_zstd1 ? 6 : 2;
    }""")
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
    IntConstant("", "TARGETCBLOCKSIZE_MIN".."64")
    IntConstant("", "TARGETCBLOCKSIZE_MAX".."ZSTD_BLOCKSIZE_MAX")
    IntConstant("", "SRCSIZEHINT_MIN".."0")
    IntConstant("", "SRCSIZEHINT_MAX".."Integer.MAX_VALUE")

    IntConstant(
        """
        Enables {@code rsyncable mode, which makes compressed files more rsync friendly by adding periodic synchronization points to the compressed data.
        }
        The target average block size is #c_jobSize / 2. It's possible to modify the job size to increase or decrease the granularity of the synchronization
        point. Once the {@code jobSize} is smaller than the window size, it will result in compression ratio degradation.

        NOTE 1: {@code rsyncable} mode only works when multithreading is enabled.

        NOTE 2: {@code rsyncable} performs poorly in combination with long range mode, since it will decrease the effectiveness of synchronization points,
        though mileage may vary.

        NOTE 3: {@code Rsyncable} mode limits maximum compression speed to ~400 MB/s. If the selected compression level is already running significantly
        slower, the overall speed won't be significantly impacted.
        """,

        "c_rsyncable".."ZSTD_c_experimentalParam1"
    )
    IntConstant(
        """
        Select a compression format.

        The value must be of type {@code ZSTD_format_e}.
        """,

        "c_format".."ZSTD_c_experimentalParam2"
    )
    IntConstant(
        "Force back-reference distances to remain &lt; {@code windowSize}, even when referencing into Dictionary content. (default:0)",

        "c_forceMaxWindow".."ZSTD_c_experimentalParam3"
    )
    IntConstant(
        """
        Controls whether the contents of a {@code CDict} are used in place, or copied into the working context.

        Accepts values from the {@code ZSTD_dictAttachPref_e} enum.
        """,

        "c_forceAttachDict".."ZSTD_c_experimentalParam4"
    )
    IntConstant(
        """
        Controlled with {@code ZSTD_paramSwitch_e} enum.
        ${ul(
            "Default is #ps_auto.",
            "Set to #ps_disable to never compress literals.",
            "Set to #ps_enable to always compress literals. (Note: uncompressed literals may still be emitted if huffman is not beneficial to use.)"
        )}

        By default, in {@code ZSTD_ps_auto}, the library will decide at runtime whether to use literals compression based on the compression parameters -
        specifically, negative compression levels do not use literal compression.
        """,
        "c_literalCompressionMode".."ZSTD_c_experimentalParam5"
    )
    IntConstant(
        """
        Tries to fit compressed block size to be around {@code targetCBlockSize}.

        No target when {@code targetCBlockSize == 0}. There is no guarantee on compressed block size. (default:0)
        """,
        "c_targetCBlockSize".."ZSTD_c_experimentalParam6"
    )
    IntConstant(
        """
        User's best guess of source size.

        Hint is not valid when {@code srcSizeHint == 0}. There is no guarantee that hint is close to actual source size, but compression ratio may regress
        significantly if guess considerably underestimates.
        """,
        "c_srcSizeHint".."ZSTD_c_experimentalParam7"
    )
    IntConstant(
        """
        Controls whether the new and experimental "dedicated dictionary search structure" can be used. This feature is still rough around the edges, be
        prepared for surprising behavior!

        <h5>How to use it:</h5>

        When using a {@code CDict}, whether to use this feature or not is controlled at {@code CDict} creation, and it must be set in a {@code CCtxParams} set
        passed into that construction (via #createCDict_advanced2()). A compression will then use the feature or not based on how the {@code CDict} was
        constructed; the value of this param, set in the {@code CCtx}, will have no effect.

        However, when a dictionary buffer is passed into a {@code CCtx}, such as via #CCtx_loadDictionary(), this param can be set on the {@code CCtx} to
        control whether the {@code CDict} that is created internally can use the feature or not.

        <h5>What it does:</h5>

        Normally, the internal data structures of the {@code CDict} are analogous to what would be stored in a {@code CCtx} after compressing the contents of a
        dictionary. To an approximation, a compression using a dictionary can then use those data structures to simply continue what is effectively a streaming
        compression where the simulated compression of the dictionary left off. Which is to say, the search structures in the {@code CDict} are normally the
        same format as in the {@code CCtx}.

        It is possible to do better, since the {@code CDict} is not like a {@code CCtx}: the search structures are written once during {@code CDict} creation,
        and then are only read after that, while the search structures in the {@code CCtx} are both read and written as the compression goes along. This means
        we can choose a search structure for the dictionary that is read-optimized.

        This feature enables the use of that different structure.

        Note that some of the members of the {@code ZSTD_compressionParameters} struct have different semantics and constraints in the dedicated search
        structure. It is highly recommended that you simply set a compression level in the {@code CCtxParams} you pass into the {@code CDict} creation call,
        and avoid messing with the {@code cParams} directly.

        <h5>Effects:</h5>

        This will only have any effect when the selected {@code ZSTD_strategy} implementation supports this feature. Currently, that's limited to #greedy,
        #lazy, and #lazy2.

        Note that this means that the {@code CDict} tables can no longer be copied into the {@code CCtx}, so the {@code dict} attachment mode #dictForceCopy
        will no longer be usable. The dictionary can only be attached or reloaded.

        In general, you should expect compression to be faster--sometimes very much so--and {@code CDict} creation to be slightly slower. Eventually, we will
        probably make this mode the default.
        """,

        "c_enableDedicatedDictSearch".."ZSTD_c_experimentalParam8"
    )
    IntConstant(
        """
        Experimental parameter. Default is {@code 0 == disabled}. Set to 1 to enable.

        Tells the compressor that the {@code ZSTD_inBuffer} will ALWAYS be the same between calls, except for the modifications that zstd makes to pos (the
        caller must not modify pos). This is checked by the compressor, and compression will fail if it ever changes. This means the only flush mode that makes
        sense is #e_end, so zstd will error if {@code ZSTD_e_end} is not used. The data in the {@code ZSTD_inBuffer} in the range {@code [src, src + pos)} MUST
        not be modified during compression or you will get data corruption.

        When this flag is enabled zstd won't allocate an input window buffer, because the user guarantees it can reference the {@code ZSTD_inBuffer} until the
        frame is complete. But, it will still allocate an output buffer large enough to fit a block (see #c_stableOutBuffer). This will also avoid the
        {@code memcpy()} from the input buffer to the input window buffer.

        NOTE: #compressStream2() will error if {@code ZSTD_e_end} is not used. That means this flag cannot be used with {@code ZSTD_compressStream*()}.

        NOTE: So long as the {@code ZSTD_inBuffer} always points to valid memory, using this flag is ALWAYS memory safe, and will never access out-of-bounds
        memory. However, compression WILL fail if you violate the preconditions.

        WARNING: The data in the {@code ZSTD_inBuffer} in the range {@code [dst, dst + pos)} MUST not be modified during compression or you will get data
        corruption. This is because zstd needs to reference data in the {@code ZSTD_inBuffer} to find matches. Normally zstd maintains its own window buffer
        for this purpose, but passing this flag tells zstd to use the user provided buffer.
        """,

        "c_stableInBuffer".."ZSTD_c_experimentalParam9"
    )
    IntConstant(
        """
        Experimental parameter. Default is {@code 0 == disabled}. Set to 1 to enable.

        Tells he compressor that the {@code ZSTD_outBuffer} will not be resized between calls. Specifically: {@code (out.size - out.pos)} will never grow. This
        gives the compressor the freedom to say: If the compressed data doesn't fit in the output buffer then return #error_dstSize_tooSmall. This allows us to
        always decompress directly into the output buffer, instead of decompressing into an internal buffer and copying to the output buffer.

        When this flag is enabled zstd won't allocate an output buffer, because it can write directly to the {@code ZSTD_outBuffer}. It will still allocate the
        input window buffer (see #c_stableInBuffer).

        Zstd will check that {@code (out.size - out.pos)} never grows and return an error if it does. While not strictly necessary, this should prevent
        surprises.
        """,

        "c_stableOutBuffer".."ZSTD_c_experimentalParam10"
    )
    IntConstant(
        """
        Default is {@code 0 == ZSTD_sf_noBlockDelimiters}.

        For use with sequence compression API: #compressSequences().

        Designates whether or not the given array of {@code ZSTD_Sequence} contains block delimiters and last literals, which are defined as sequences with
        {@code offset == 0} and {@code matchLength == 0}. See the definition of {@code ZSTD_Sequence} for more specifics.
        """,

        "c_blockDelimiters".."ZSTD_c_experimentalParam11"
    )
    IntConstant(
        """
        Default is {@code 0 == disabled}. Set to 1 to enable sequence validation.

        For use with sequence compression API: #compressSequences(). Designates whether or not we validate sequences provided to
        {@code ZSTD_compressSequences()} during function execution.

        Without validation, providing a sequence that does not conform to the zstd spec will cause undefined behavior, and may produce a corrupted block.

        With validation enabled, a if sequence is invalid (see {@code doc/zstd_compression_format.md} for specifics regarding
        {@code offset}/{@code matchlength} requirements) then the function will bail out and return an error.       
        """,

        "c_validateSequences".."ZSTD_c_experimentalParam12"
    )
    IntConstant(
        """
        Controlled with {@code ZSTD_paramSwitch_e} enum.
        ${ul(
            "Default is #ps_auto.",
            "Set to #ps_disable to never use block splitter.",
            "Set to #ps_enable to always use block splitter."
        )}

        By default, in {@code ZSTD_ps_auto}, the library will decide at runtime whether to use block splitting based on the compression parameters.       
        """,

        "c_useBlockSplitter".."ZSTD_c_experimentalParam13"
    )
    IntConstant(
        """
        Controlled with {@code ZSTD_paramSwitch_e} enum.
        ${ul(
            "Default is #ps_auto.",
            "Set to #ps_disable to never use row-based matchfinder.",
            "Set to #ps_enable to force usage of row-based matchfinder."
        )}

        By default, in {@code ZSTD_ps_auto}, the library will decide at runtime whether to use the row-based matchfinder based on support for SIMD instructions
        and the window log. Note that this only pertains to compression strategies: {@code greedy}, {@code lazy}, and {@code lazy2}.
        """,

        "c_useRowMatchFinder".."ZSTD_c_experimentalParam14"
    )
    IntConstant(
        """
        Default is {@code 0 == disabled}. Set to 1 to enable.

        Zstd produces different results for prefix compression when the prefix is directly adjacent to the data about to be compressed vs. when it isn't. This
        is because zstd detects that the two buffers are contiguous and it can use a more efficient match finding algorithm. However, this produces different
        results than when the two buffers are non-contiguous. This flag forces zstd to always load the prefix in non-contiguous mode, even if it happens to be
        adjacent to the data, to guarantee determinism.

        If you really care about determinism when using a dictionary or prefix, like when doing delta compression, you should select this option. It comes at a
        speed penalty of about ~2.5% if the dictionary and data happened to be contiguous, and is free if they weren't contiguous. We don't expect that
        intentionally making the dictionary and data contiguous will be worth the cost to {@code memcpy()} the data.
        """,

        "c_deterministicRefPrefix".."ZSTD_c_experimentalParam15"
    )
    IntConstant(
        """
        Experimental parameter.

        Allows selection between {@code ZSTD_format_e} input compression formats.
        """,
        "d_format".."ZSTD_d_experimentalParam1"
    )
    IntConstant(
        """
        Experimental parameter. Default is 0 == disabled. Set to 1 to enable.

        Tells the decompressor that the {@code ZSTD_outBuffer} will ALWAYS be the same between calls, except for the modifications that zstd makes to
        {@code pos} (the caller must not modify {@code pos}). This is checked by the decompressor, and decompression will fail if it ever changes. Therefore
        the {@code ZSTD_outBuffer} MUST be large enough to fit the entire decompressed frame. This will be checked when the frame content size is known. The
        data in the {@code ZSTD_outBuffer} in the range {@code [dst, dst + pos)} MUST not be modified during decompression or you will get data corruption.

        When this flags is enabled zstd won't allocate an output buffer, because it can write directly to the {@code ZSTD_outBuffer}, but it will still
        allocate an input buffer large enough to fit any compressed block. This will also avoid the {@code memcpy()} from the internal output buffer to the
        {@code ZSTD_outBuffer}. If you need to avoid the input buffer allocation use the buffer-less streaming API.

        NOTE: So long as the {@code ZSTD_outBuffer} always points to valid memory, using this flag is ALWAYS memory safe, and will never access out-of-bounds
        memory. However, decompression WILL fail if you violate the preconditions.

        WARNING: The data in the {@code ZSTD_outBuffer} in the range {@code [dst, dst + pos)} MUST not be modified during decompression or you will get data
        corruption. This is because zstd needs to reference data in the {@code ZSTD_outBuffer} to regenerate matches. Normally zstd maintains its own buffer
        for this purpose, but passing this flag tells zstd to use the user provided buffer.
        """,
        "d_stableOutBuffer".."ZSTD_d_experimentalParam2"
    )
    IntConstant(
        """
        Experimental parameter. Default is {@code 0 == disabled}. Set to 1 to enable

        Tells the decompressor to skip checksum validation during decompression, regardless of whether checksumming was specified during compression. This
        offers some slight performance benefits, and may be useful for debugging. Param has values of type {@code ZSTD_forceIgnoreChecksum_e}.
        """,
        "d_forceIgnoreChecksum".."ZSTD_d_experimentalParam3"
    )
    IntConstant(
        """
        Experimental parameter. Default is {@code 0 == disabled}. Set to 1 to enable

        If enabled and {@code dctx} is allocated on the heap, then additional memory will be allocated to store references to multiple {@code ZSTD_DDict}. That
        is, multiple calls of #DCtx_refDDict() using a given {@code ZSTD_DCtx}, rather than overwriting the previous {@code DDict} reference, will instead store all
        references. At decompression time, the appropriate {@code dictID} is selected from the set of {@code DDicts} based on the {@code dictID} in the frame.

        Usage is simply calling {@code ZSTD_DCtx_refDDict()} on multiple dict buffers.

        Param has values of byte {@code ZSTD_refMultipleDDicts_e}.

        WARNING: Enabling this parameter and calling {@code ZSTD_DCtx_refDDict()}, will trigger memory allocation for the hash table. #freeDCtx() also frees
        this memory. Memory is allocated as per {@code ZSTD_DCtx::customMem}.

        Although this function allocates memory for the table, the user is still responsible for memory management of the underlying {@code ZSTD_DDict}
        themselves.
        """,
        "d_refMultipleDDicts".."ZSTD_d_experimentalParam4"
    )

    EnumConstant(
        "{@code ZSTD_literalCompressionMode_e}",

        "lcm_auto".enum(
            """
            Automatically determine the compression mode based on the compression level.

            Negative compression levels will be uncompressed, and positive compression levels will be compressed.
            """,
            "0"
        ),
        "lcm_huffman".enum("Always attempt Huffman compression. Uncompressed literals will still be emitted if Huffman compression is not profitable."),
        "lcm_uncompressed".enum("Always emit uncompressed literals.")
    )

    EnumConstant(
        """
        {@code ZSTD_paramSwitch_e}

        This enum controls features which are conditionally beneficial. Zstd typically will make a final decision on whether or not to enable the feature
        ({@code ZSTD_ps_auto}), but setting the switch to {@code ZSTD_ps_enable} or {@code ZSTD_ps_disable} allow for a force enable/disable the feature.
        """,

        "ps_auto".enum("Let the library automatically determine whether the feature shall be enabled.", "0"),
        "ps_enable".enum("Force-enable the feature."),
        "ps_disable".enum("Do not use the feature.")
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

        void.const.p("src", "should point to the start of a series of ZSTD encoded and/or skippable frames"),
        AutoSize("src")..size_t(
            "srcSize",
            "must be the <em>exact</em> size of this series (i.e. there should be a frame boundary exactly at {@code srcSize} bytes after {@code src + srcSize})"
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

    unsigned_long_long(
        "decompressBound",
        """
        Note 1: an error can occur if {@code src} contains an invalid or incorrectly formatted frame.

        Note 2: the upper-bound is exact when the decompressed size field is available in every ZSTD encoded frame of {@code src}. In this case,
        #findDecompressedSize() and {@code ZSTD_decompressBound} return the same value.

        Note 3: when the decompressed size field isn't available, the upper-bound for that frame is calculated by:
        {@code upper-bound = # blocks * min(128 KB, Window_Size)}
        """,

        void.const.p("src", "should point to the start of a series of ZSTD encoded and/or skippable frames"),
        AutoSize("src")..size_t("srcSize", "must be the <em>exact</em> size of this series (i.e. there should be a frame boundary at {@code src + srcSize})"),

        returnDoc = "upper-bound for the decompressed size of all data in all successive frames, or #CONTENTSIZE_ERROR if an error occurred"
    )

    size_t(
        "frameHeaderSize",
        "",

        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", "must be &ge; {@link \\#ZSTD_FRAMEHEADERSIZE_PREFIX}"),

        returnDoc = ": size of the Frame Header, or an error code (if srcSize is too small)"
    )

    EnumConstant(
        "{@code ZSTD_sequenceFormat_e}",

        "sf_noBlockDelimiters".enum("Representation of {@code ZSTD_Sequence} has no block delimiters, sequences only.", "0"),
        "sf_explicitBlockDelimiters".enum("Representation of {@code ZSTD_Sequence} contains explicit block delimiters.")
    )

    size_t(
        "generateSequences",
        """
        Generate sequences using #compress2(), given a source buffer.

        Each block will end with a dummy sequence with {@code offset == 0}, {@code matchLength == 0}, and {@code litLength == length} of last literals.
        {@code litLength} may be {@code == 0}, and if so, then the sequence of {@code (of: 0 ml: 0 ll: 0)} simply acts as a block delimiter.

        {@code zc} can be used to insert custom compression params. This function invokes #compress2()

        The output of this function can be fed into #compressSequences() with {@code CCtx} setting of #c_blockDelimiters as #sf_explicitBlockDelimiters.
        """,

        ZSTD_CCtx.p("zc", ""),
        ZSTD_Sequence.p("outSeqs", ""),
        AutoSize("outSeqs")..size_t("outSeqsSize", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", ""),

        returnDoc = "number of sequences generated"
    )

    size_t(
        "mergeBlockDelimiters",
        """
        Given an array of {@code ZSTD_Sequence}, remove all sequences that represent block delimiters/last literals by merging them into into the literals of
        the next sequence.

        As such, the final generated result has no explicit representation of block boundaries, and the final last literals segment is not represented in the
        sequences.

        The output of this function can be fed into #compressSequences() with {@code CCtx} setting of #c_blockDelimiters as #sf_noBlockDelimiters.        
        """,

        ZSTD_Sequence.p("sequences", ""),
        AutoSize("sequences")..size_t("seqsSize", ""),

        returnDoc = "number of sequences left after merging"
    )

/*! ZSTD_compressSequences() :

 */
    size_t(
        "compressSequences",
        """
        Compress an array of {@code ZSTD_Sequence}, generated from the original source buffer, into {@code dst}.

        If a dictionary is included, then the {@code cctx} should reference the {@code dict}. (see: #CCtx_refCDict(), #CCtx_loadDictionary(), etc.) The entire
        source is compressed into a single frame.

        The compression behavior changes based on {@code cctx} params. In particular:
        ${ul(
            """
            If {@code ZSTD_c_blockDelimiters == ZSTD_sf_noBlockDelimiters}, the array of {@code ZSTD_Sequence} is expected to contain no block delimiters
            (defined in {@code ZSTD_Sequence}). Block boundaries are roughly determined based on the block size derived from the {@code cctx}, and sequences
            may be split. This is the default setting.
            """,
            """
            If {@code ZSTD_c_blockDelimiters == ZSTD_sf_explicitBlockDelimiters}, the array of {@code ZSTD_Sequence} is expected to contain block delimiters
            (defined in {@code ZSTD_Sequence}). Behavior is undefined if no block delimiters are provided.
            """,
            """
            If {@code ZSTD_c_validateSequences == 0}, this function will blindly accept the sequences provided. Invalid sequences cause undefined behavior. If
            {@code ZSTD_c_validateSequences == 1}, then if sequence is invalid (see {@code doc/zstd_compression_format.md} for specifics regarding
            offset/matchlength requirements) then the function will bail out and return an error.
            """
        )}

        In addition to the two adjustable experimental params, there are other important cctx params.
        ${ul(
            "#c_minMatch MUST be set as less than or equal to the smallest match generated by the match finder. It has a minimum value of #MINMATCH_MIN.",
            "#c_compressionLevel accordingly adjusts the strength of the entropy coder, as it would in typical compression.",
            """
            #c_windowLog affects offset validation: this function will return an error at higher debug levels if a provided offset is larger than what the spec
            allows for a given window log and dictionary (if present). See: {@code doc/zstd_compression_format.md}
            """
        )}

        Note: Repcodes are, as of now, always re-calculated within this function, so {@code ZSTD_Sequence::rep} is unused.

        Note 2: Once we integrate ability to ingest repcodes, the explicit block delims mode must respect those repcodes exactly, and cannot emit an RLE block
        that disagrees with the {@code repcode} history.
        """,

        ZSTD_CCtx.p.const("cctx", ""),
        void.p("dst", ""),
        AutoSize("dst")..size_t("dstSize", ""),
        ZSTD_Sequence.const.p("inSeqs", ""),
        AutoSize("inSeqs")..size_t("inSeqsSize", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", ""),

        returnDoc = "final compressed size or a ZSTD error."
    )

    size_t(
        "writeSkippableFrame",
        """
        Generates a zstd skippable frame containing data given by {@code src}, and writes it to {@code dst} buffer.

        Skippable frames begin with a a 4-byte magic number. There are 16 possible choices of magic number, ranging from #MAGIC_SKIPPABLE_START to
        {@code ZSTD_MAGIC_SKIPPABLE_START+15}. As such, the parameter {@code magicVariant} controls the exact skippable frame magic number variant used, so the
        magic number used will be {@code ZSTD_MAGIC_SKIPPABLE_START + magicVariant}.

        Returns an error if destination buffer is not large enough, if the source size is not representable with a 4-byte unsigned int, or if the parameter
        {@code magicVariant} is greater than 15 (and therefore invalid).
        """,

        void.p("dst", ""),
        AutoSize("dst")..size_t("dstCapacity", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", ""),
        unsigned("magicVariant", ""),

        returnDoc = "number of bytes written or a ZSTD error"
    )

    size_t(
        "readSkippableFrame",
        """
        Retrieves a zstd skippable frame containing data given by {@code src}, and writes it to {@code dst} buffer.

        The parameter {@code magicVariant} will receive the {@code magicVariant} that was supplied when the frame was written, i.e.
        {@code magicNumber - ZSTD_MAGIC_SKIPPABLE_START}. This can be #NULL if the caller is not interested in the {@code magicVariant}.

        Returns an error if destination buffer is not large enough, or if the frame is not skippable.
        """,

        void.p("dst", ""),
        AutoSize("dst")..size_t("dstCapacity", ""),
        Check(1)..nullable..unsigned.p("magicVariant", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", ""),

        returnDoc = "number of bytes written or a ZSTD error"
    )

    unsignedb(
        "isSkippableFrame",
        "Tells if the content of {@code buffer} starts with a valid Frame Identifier for a skippable frame.",

        void.const.p("buffer", ""),
        AutoSize("buffer")..size_t("size", "")
    )

    size_t(
        "estimateCCtxSize",
        """
        Estimages memory usage of a future {@code CCtx}, before its creation.

        {@code ZSTD_estimateCCtxSize()} will provide a memory budget large enough for any compression level up to selected one.

        Note: Unlike {@code ZSTD_estimateCStreamSize*()}, this estimate does not include space for a window buffer. Therefore, the estimation is only
        guaranteed for single-shot compressions, not streaming.

        The estimate will assume the input may be arbitrarily large, which is the worst case.

         When {@code srcSize} can be bound by a known and rather "small" value, this fact can be used to provide a tighter estimation because the CCtx
        compression context will need less memory. This tighter estimation can be provided by more advanced functions #estimateCCtxSize_usingCParams(), which
        can be used in tandem with #getCParams(), and #estimateCCtxSize_usingCCtxParams(), which can be used in tandem with #CCtxParams_setParameter(). Both
        can be used to estimate memory using custom compression parameters and arbitrary {@code srcSize} limits.

        Note 2: only single-threaded compression is supported. #estimateCCtxSize_usingCCtxParams() will return an error code if #c_nbWorkers is &ge; 1.
        """,

        int("compressionLevel", "")
    )
    size_t("estimateCCtxSize_usingCParams", "", ZSTD_compressionParameters("cParams", ""))
    size_t("estimateCCtxSize_usingCCtxParams", "", ZSTD_CCtx_params.const.p("params", ""))
    size_t("estimateDCtxSize", "", void())

    size_t(
        "estimateCStreamSize",
        """
        Provides a budget large enough for any compression level up to selected one.

        It will also consider {@code src} size to be arbitrarily "large", which is worst case. If {@code srcSize} is known to always be small,
        #estimateCStreamSize_usingCParams() can provide a tighter estimation. {@code ZSTD_estimateCStreamSize_usingCParams()} can be used in tandem with
        #getCParams() to create {@code cParams} from compressionLevel. #estimateCStreamSize_usingCCtxParams() can be used in tandem with
        #CCtxParams_setParameter(). Only single-threaded compression is supported.

        This function will return an error code if #c_nbWorkers is &ge; 1.

        Note: {@code CStream} size estimation is only correct for single-threaded compression. {@code ZSTD_DStream} memory budget depends on window
        {@code Size}. This information can be passed manually, using #estimateDStreamSize(), or deducted from a valid frame {@code Header}, using
        #estimateDStreamSize_fromFrame().

        Note: if streaming is init with function {@code ZSTD_init?Stream_usingDict()}, an internal Dict will be created, which additional size is not estimated
        here. In this case, get total size by adding {@code ZSTD_estimate?DictSize}.
        """,

        int("compressionLevel", "")
    )
    size_t("estimateCStreamSize_usingCParams", "", ZSTD_compressionParameters("cParams", ""))
    size_t("estimateCStreamSize_usingCCtxParams", "", ZSTD_CCtx_params.const.p("params", ""))
    size_t("estimateDStreamSize", "", size_t("windowSize", ""))
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

    ZSTD_threadPool.p(
        "createThreadPool",
        """
        Creates a new thread pool with a given number of threads.

        Note that the lifetime of such pool must exist while being used.
        """,

        size_t("numThreads", "")
    )

    void(
        "freeThreadPool",
        "Frees a thread pool.",

        nullable..ZSTD_threadPool.p("pool", "accepts #NULL pointer")
    )

    size_t(
        "CCtx_refThreadPool",
        "Assigns a thread pool to a context (use #NULL argument value to use an internal thread pool).",

        ZSTD_CCtx.p("cctx", ""),
        nullable..ZSTD_threadPool.p("pool", "")
    )

    ZSTD_CDict.p(
        "createCDict_advanced2",
        "",

        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),
        ZSTD_dictLoadMethod_e("dictLoadMethod", "", dictLoadMethods),
        ZSTD_dictContentType_e("dictContentType", "", dictContentTypes),
        ZSTD_CCtx_params.const.p("cctxParams", ""),
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

        Note: equivalent to #createCDict_advanced(), with {@code dictLoadMethod==ZSTD_dlm_byRef}.
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

        ZSTD_compressionParameters("params", ""),

        returnDoc = "0 on success, or an error code (can be checked with #isError())"
    )

    ZSTD_compressionParameters(
        "adjustCParams",
        "Optimizes params for a given {@code srcSize} and {@code dictSize}. Both values are optional, select 0 if unknown.",

        ZSTD_compressionParameters("cPar", ""),
        unsigned_long_long("srcSize", ""),
        size_t("dictSize", "")
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

        ZSTD_CCtx.const.p("cctx", ""),
        ZSTD_cParameter("param", "", "c_\\w+"),
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

        nullable..ZSTD_CCtx_params.p("params", "accepts #NULL pointer")
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
        "CCtxParams_setParameter",
        """
        Similar to #CCtx_setParameter(). Sets one compression parameter, selected by {@code enum ZSTD_cParameter}.

        Parameters must be applied to a {@code ZSTD_CCtx} using #CCtx_setParametersUsingCCtxParams().
        """,

        ZSTD_CCtx_params.p("params", ""),
        ZSTD_cParameter("param", "", "c_\\w+"),
        int("value", ""),

        returnDoc = "a code representing success or failure (which can be tested with #isError())"
    )

    size_t(
        "CCtxParams_getParameter",
        """
        Similar to #CCtx_getParameter(). Gets the requested value of one compression parameter, selected by {@code enum ZSTD_cParameter}.
        """,

        ZSTD_CCtx_params.const.p("params", ""),
        ZSTD_cParameter("param", "", "c_\\w+"),
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
        ZSTD_EndDirective("endOp", "", "e_\\w+")
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
        "DCtx_getParameter",
        "Gets the requested decompression parameter value, selected by enum {@code ZSTD_dParameter}, and store it into {@code int*} value.",

        ZSTD_DCtx.p("dctx", ""),
        ZSTD_dParameter("param", ""),
        Check(1)..int.p("value", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
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
        "compressBegin_usingCDict",
        "",

        ZSTD_CCtx.p("cctx", ""),
        ZSTD_CDict.const.p("cdict", "")
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