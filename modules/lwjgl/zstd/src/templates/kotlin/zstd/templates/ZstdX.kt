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
    IntConstant("", "HASHLOG3_MAX".."17")

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
        Controls how the literals are compressed (default is {@code auto}).

        The value must be of type {@code ZSTD_literalCompressionMode_e}.
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
    IntConstant("", "d_format".."ZSTD_d_experimentalParam1")

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

        returnDoc = "upper-bound for the decompressed size of all data in all successive frames, or #CONTENTSIZE_ERROR if an error occured"
    )

    size_t(
        "frameHeaderSize",
        "",

        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", "must be &ge; {@link \\#ZSTD_FRAMEHEADERSIZE_PREFIX}"),

        returnDoc = ": size of the Frame Header, or an error code (if srcSize is too small)"
    )

    size_t(
        "getSequences",
        """
        Extract sequences from the sequence store {@code zc} can be used to insert custom compression params.
 
        This function invokes #compress2().
        """,

        ZSTD_CCtx.p("zc", ""),
        ZSTD_Sequence.p("outSeqs", ""),
        AutoSize("outSeqs")..size_t("outSeqsSize", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", ""),

        returnDoc = "number of sequences extracted"
    )

    size_t(
        "estimateCCtxSize",
        """
        Estimages memory usage of a future {@code CCtx}, before its creation.

        {@code ZSTD_estimateCCtxSize()} will provide a budget large enough for any compression level up to selected one. Unlike
        {@code ZSTD_estimateCStreamSize*}, this estimate does not include space for a window buffer, so this estimate is guaranteed to be enough for
        single-shot compressions, but not streaming compressions. It will however assume the input may be arbitrarily large,  which is the worst case. If
        {@code srcSize} is known to always be small, #estimateCCtxSize_usingCParams() can provide a tighter estimation. #estimateCCtxSize_usingCParams() can be
        used in tandem with #getCParams() to create {@code cParams} from compressionLevel. #estimateCCtxSize_usingCCtxParams() can be used in tandem with
        #CCtxParams_setParameter().

        Note: only single-threaded compression is supported. This function will return an error code if #c_nbWorkers is &ge; 1.
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

        ZSTD_CCtx.p("cctx", ""),
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
        "CCtxParams_setParameter",
        """
        Similar to #CCtx_setParameter(). Sets one compression parameter, selected by {@code enum ZSTD_cParameter}.

        Parameters must be applied to a {@code ZSTD_CCtx} using #CCtx_setParametersUsingCCtxParams().
        """,

        ZSTD_CCtx_params.p("params", ""),
        ZSTD_cParameter("param", "", "c_\\w+"),
        int("value", ""),

        returnDoc = "0, or an error code (which can be tested with #isError())"
    )

    size_t(
        "CCtxParams_getParameter",
        """
        Similar to #CCtx_getParameter(). Gets the requested value of one compression parameter, selected by {@code enum ZSTD_cParameter}.
        """,

        ZSTD_CCtx_params.p("params", ""),
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