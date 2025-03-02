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

    EnumConstant(
        "dct_auto".enum("0"),
        "dct_rawContent".enum,
        "dct_fullDict".enum
    )

    EnumConstant(
        "dlm_byCopy".enum("0"),
        "dlm_byRef".enum
    )

    EnumConstant(
        "f_zstd1".enum("0"),
        "f_zstd1_magicless".enum
    )

    EnumConstant(
        "d_validateChecksum".enum("0"),
        "d_ignoreChecksum".enum
    )

    EnumConstant(
        "rmd_refSingleDDict".enum("0"),
        "rmd_refMultipleDDicts".enum
    )

    EnumConstant(
        "dictDefaultAttach".enum("0"),
        "dictForceAttach".enum,
        "dictForceCopy".enum,
        "dictForceLoad".enum
    )

    EnumConstant(
        "frame".enum("0"),
        "skippableFrame".enum
    )

    EnumConstant(
        "ZSTDnit_frameHeader".enum("0"),
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
    IntConstant("FRAMEHEADERSIZE_MAX".."18")
    IntConstant("SKIPPABLEHEADERSIZE".."8")
    IntConstant("WINDOWLOG_MAX_32".."30")
    IntConstant("WINDOWLOG_MAX_64".."31")
    IntConstant("WINDOWLOG_MAX".."Pointer.POINTER_SIZE == 64 ? ZSTD_WINDOWLOG_MAX_64 : ZSTD_WINDOWLOG_MAX_32")
    IntConstant("WINDOWLOG_MIN".."10")
    IntConstant("HASHLOG_MAX".."ZSTD_WINDOWLOG_MAX < 30 ? ZSTD_WINDOWLOG_MAX : 30")
    IntConstant("HASHLOG_MIN".."6")
    IntConstant("CHAINLOG_MAX_32".."29")
    IntConstant("CHAINLOG_MAX_64".."30")
    IntConstant("CHAINLOG_MAX".."Pointer.POINTER_SIZE == 64 ? ZSTD_CHAINLOG_MAX_64 : ZSTD_CHAINLOG_MAX_32")
    IntConstant("CHAINLOG_MIN".."ZSTD_HASHLOG_MIN")
    IntConstant("SEARCHLOG_MIN".."1")
    IntConstant("MINMATCH_MAX".."7")
    IntConstant("MINMATCH_MIN".."3")
    IntConstant("TARGETLENGTH_MAX".."ZSTD_BLOCKSIZE_MAX")
    IntConstant("TARGETLENGTH_MIN".."0")
    IntConstant("STRATEGY_MIN".."ZSTD_fast")
    IntConstant("STRATEGY_MAX".."ZSTD_btultra2")
    IntConstant(
        "BLOCKSIZE_MAX_MIN".."1 << 10"
    )
    IntConstant("OVERLAPLOG_MIN".."0")
    IntConstant("OVERLAPLOG_MAX".."9")
    IntConstant("WINDOWLOG_LIMIT_DEFAULT".."27")
    IntConstant("LDM_HASHLOG_MIN".."ZSTD_HASHLOG_MIN")
    IntConstant("LDM_HASHLOG_MAX".."ZSTD_HASHLOG_MAX")
    IntConstant("LDM_MINMATCH_MIN".."4")
    IntConstant("LDM_MINMATCH_MAX".."4096")
    IntConstant("LDM_BUCKETSIZELOG_MIN".."1")
    IntConstant("LDM_BUCKETSIZELOG_MAX".."8")
    IntConstant("LDM_HASHRATELOG_MIN".."0")
    IntConstant("TARGETCBLOCKSIZE_MIN".."1340")
    IntConstant("TARGETCBLOCKSIZE_MAX".."ZSTD_BLOCKSIZE_MAX")
    IntConstant("SRCSIZEHINT_MIN".."0")
    IntConstant("SRCSIZEHINT_MAX".."Integer.MAX_VALUE")

    IntConstant("BLOCKSPLITTER_LEVEL_MAX".."6")

    IntConstant(
        "c_rsyncable".."ZSTD_c_experimentalParam1",
        "c_format".."ZSTD_c_experimentalParam2",
        "c_forceMaxWindow".."ZSTD_c_experimentalParam3",
        "c_forceAttachDict".."ZSTD_c_experimentalParam4",
        "c_literalCompressionMode".."ZSTD_c_experimentalParam5",
        "c_srcSizeHint".."ZSTD_c_experimentalParam7",
        "c_enableDedicatedDictSearch".."ZSTD_c_experimentalParam8",
        "c_stableInBuffer".."ZSTD_c_experimentalParam9",
        "c_stableOutBuffer".."ZSTD_c_experimentalParam10",
        "c_blockDelimiters".."ZSTD_c_experimentalParam11",
        "c_validateSequences".."ZSTD_c_experimentalParam12",
        "c_blockSplitterLevel".."ZSTD_c_experimentalParam20",
        "c_splitAfterSequences".."ZSTD_c_experimentalParam13",
        "c_useRowMatchFinder".."ZSTD_c_experimentalParam14",
        "c_deterministicRefPrefix".."ZSTD_c_experimentalParam15",
        "c_prefetchCDictTables".."ZSTD_c_experimentalParam16",
        "c_enableSeqProducerFallback".."ZSTD_c_experimentalParam17",
        "c_maxBlockSize".."ZSTD_c_experimentalParam18",
        "c_repcodeResolution".."ZSTD_c_experimentalParam19"
    )

    IntConstant(
        "d_format".."ZSTD_d_experimentalParam1",
        "d_stableOutBuffer".."ZSTD_d_experimentalParam2",
        "d_forceIgnoreChecksum".."ZSTD_d_experimentalParam3",
        "d_refMultipleDDicts".."ZSTD_d_experimentalParam4",
        "d_disableHuffmanAssembly".."ZSTD_d_experimentalParam5",
        "d_maxBlockSize".."ZSTD_d_experimentalParam6"
    )

    EnumConstant(
        "lcm_auto".enum("0"),
        "lcm_huffman".enum,
        "lcm_uncompressed".enum
    )

    EnumConstant(
        "ps_auto".enum("0"),
        "ps_enable".enum,
        "ps_disable".enum
    )

    unsigned_long_long(
        "findDecompressedSize",

        void.const.p("src"),
        AutoSize("src")..size_t("srcSize")
    )

    unsigned_long_long(
        "decompressBound",

        void.const.p("src"),
        AutoSize("src")..size_t("srcSize")
    )

    size_t(
        "frameHeaderSize",

        void.const.p("src"),
        AutoSize("src")..size_t("srcSize")
    )

    size_t(
        "getFrameHeader",

        ZSTD_FrameHeader.p("zfhPtr"),
        void.const.p("src"),
        AutoSize("src")..size_t("srcSize")
    )

    size_t(
        "getFrameHeader_advanced",

        ZSTD_FrameHeader.p("zfhPtr"),
        void.const.p("src"),
        AutoSize("src")..size_t("srcSize"),
        ZSTD_format_e("format")
    )

    size_t(
        "decompressionMargin",

        void.const.p("src"),
        AutoSize("src")..size_t("srcSize")
    )

    customMethod("""
    /** 
     * Similar to {@link #ZSTD_decompressionMargin decompressionMargin}, but instead of computing the margin from the compressed frame, compute it from the
     * original {@code size} and the {@code blockSizeLog}.
     * 
     * <p>WARNING: This macro does not support multi-frame input, the input must be a single zstd frame. If you need that support use the function, or
     * implement it yourself.</p>
     *
     * @param originalSize the original uncompressed size of the data
     * @param blockSize    the block {@code size == MIN(windowSize, ZSTD_BLOCKSIZE_MAX)}. Unless you explicitly set the {@code windowLog} smaller than
     *                     {@code ZSTD_BLOCKSIZELOG_MAX} you can just use {@code ZSTD_BLOCKSIZE_MAX}.
     */
    public static long ZSTD_DECOMPRESSION_MARGIN(long originalSize, long blockSize) {
        return
            ZSTD_FRAMEHEADERSIZE_MAX                                                              /* Frame header */ +
            4                                                                                         /* checksum */ +
            ((originalSize) == 0 ? 0 : 3 * (((originalSize) + (blockSize) - 1) / blockSize)) /* 3 bytes per block */ +
            (blockSize);                                                                   /* One block of margin */
    }""")

    EnumConstant(
        "sf_noBlockDelimiters".enum("0"),
        "sf_explicitBlockDelimiters".enum
    )

    size_t(
        "sequenceBound",

        size_t("srcSize")
    )

    size_t(
        "mergeBlockDelimiters",
        
        ZSTD_Sequence.p("sequences"),
        AutoSize("sequences")..size_t("seqsSize")
    )

    size_t(
        "compressSequences",

        ZSTD_CCtx.p("cctx"),
        void.p("dst"),
        AutoSize("dst")..size_t("dstCapacity"),
        ZSTD_Sequence.const.p("inSeqs"),
        AutoSize("inSeqs")..size_t("inSeqsSize"),
        void.const.p("src"),
        AutoSize("src")..size_t("srcSize")
    )

    size_t(
        "compressSequencesAndLiterals",

        ZSTD_CCtx.p("cctx"),
        void.p("dst"),
        AutoSize("dst")..size_t("dstCapacity"),
        ZSTD_Sequence.const.p("inSeqs"),
        AutoSize("inSeqs")..size_t("nbSequences"),
        void.const.p("literals"),
        size_t("litSize"),
        AutoSize("literals")..size_t("litBufCapacity"),
        size_t("decompressedSize")
    )

    size_t(
        "writeSkippableFrame",

        void.p("dst"),
        AutoSize("dst")..size_t("dstCapacity"),
        void.const.p("src"),
        AutoSize("src")..size_t("srcSize"),
        unsigned("magicVariant")
    )

    size_t(
        "readSkippableFrame",

        void.p("dst"),
        AutoSize("dst")..size_t("dstCapacity"),
        Check(1)..nullable..unsigned.p("magicVariant"),
        void.const.p("src"),
        AutoSize("src")..size_t("srcSize")
    )

    unsignedb(
        "isSkippableFrame",

        void.const.p("buffer"),
        AutoSize("buffer")..size_t("size")
    )

    size_t(
        "estimateCCtxSize",

        int("maxCompressionLevel")
    )
    size_t("estimateCCtxSize_usingCParams", ZSTD_compressionParameters("cParams"))
    size_t("estimateCCtxSize_usingCCtxParams", ZSTD_CCtx_params.const.p("params"))
    size_t("estimateDCtxSize", void())

    size_t(
        "estimateCStreamSize",

        int("maxCompressionLevel")
    )
    size_t("estimateCStreamSize_usingCParams", ZSTD_compressionParameters("cParams"))
    size_t("estimateCStreamSize_usingCCtxParams", ZSTD_CCtx_params.const.p("params"))
    size_t("estimateDStreamSize", size_t("maxWindowSize"))
    size_t(
        "estimateDStreamSize_fromFrame",

        void.const.p("src"),
        AutoSize("src")..size_t("srcSize")
    )

    size_t(
        "estimateCDictSize",

        size_t("dictSize"),
        int("compressionLevel")
    )
    size_t(
        "estimateCDictSize_advanced",

        size_t("dictSize"),
        ZSTD_compressionParameters("cParams"),
        ZSTD_dictLoadMethod_e("dictLoadMethod")
    )
    size_t(
        "estimateDDictSize",

        size_t("dictSize"),
        ZSTD_dictLoadMethod_e("dictLoadMethod")
    )

    ZSTD_CCtx.p(
        "initStaticCCtx",

        void.p("workspace"),
        AutoSize("workspace")..size_t("workspaceSize")
    )

    ZSTD_CStream.p(
        "initStaticCStream",

        void.p("workspace"),
        AutoSize("workspace")..size_t("workspaceSize")
    )

    ZSTD_DCtx.p(
        "initStaticDCtx",

        void.p("workspace"),
        AutoSize("workspace")..size_t("workspaceSize")
    )

    ZSTD_DStream.p(
        "initStaticDStream",

        void.p("workspace"),
        AutoSize("workspace")..size_t("workspaceSize")
    )

    ZSTD_CDict.const.p(
        "initStaticCDict",

        void.p("workspace"),
        AutoSize("workspace")..size_t("workspaceSize"),
        void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize"),
        ZSTD_dictLoadMethod_e("dictLoadMethod"),
        ZSTD_dictContentType_e("dictContentType"),
        ZSTD_compressionParameters("cParams")
    )

    ZSTD_DDict.const.p(
        "initStaticDDict",

        void.p("workspace"),
        AutoSize("workspace")..size_t("workspaceSize"),
        void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize"),
        ZSTD_dictLoadMethod_e("dictLoadMethod"),
        ZSTD_dictContentType_e("dictContentType")
    )

    ZSTD_CCtx.p(
        "createCCtx_advanced",

        ZSTD_customMem("customMem")
    )

    ZSTD_CStream.p(
        "createCStream_advanced",

        ZSTD_customMem("customMem")
    )

    ZSTD_DCtx.p(
        "createDCtx_advanced",

        ZSTD_customMem("customMem")
    )

    ZSTD_DStream.p(
        "createDStream_advanced",

        ZSTD_customMem("customMem")
    )

    ZSTD_CDict.p(
        "createCDict_advanced",

        void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize"),
        ZSTD_dictLoadMethod_e("dictLoadMethod"),
        ZSTD_dictContentType_e("dictContentType"),
        ZSTD_compressionParameters("cParams"),
        ZSTD_customMem("customMem")
    )

    ZSTD_threadPool.p(
        "createThreadPool",

        size_t("numThreads")
    )

    void(
        "freeThreadPool",

        nullable..ZSTD_threadPool.p("pool")
    )

    size_t(
        "CCtx_refThreadPool",

        ZSTD_CCtx.p("cctx"),
        nullable..ZSTD_threadPool.p("pool")
    )

    ZSTD_CDict.p(
        "createCDict_advanced2",

        void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize"),
        ZSTD_dictLoadMethod_e("dictLoadMethod"),
        ZSTD_dictContentType_e("dictContentType"),
        ZSTD_CCtx_params.const.p("cctxParams"),
        ZSTD_customMem("customMem")
    )

    ZSTD_DDict.p(
        "createDDict_advanced",

        void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize"),
        ZSTD_dictLoadMethod_e("dictLoadMethod"),
        ZSTD_dictContentType_e("dictContentType"),
        ZSTD_customMem("customMem")
    )

    ZSTD_CDict.p(
        "createCDict_byReference",

        void.const.p("dictBuffer"),
        AutoSize("dictBuffer")..size_t("dictSize"),
        int("compressionLevel")
    )

    ZSTD_compressionParameters(
        "getCParams",

        int("compressionLevel"),
        unsigned_long_long("estimatedSrcSize"),
        size_t("dictSize")
    )

    ZSTD_parameters(
        "getParams",

        int("compressionLevel"),
        unsigned_long_long("estimatedSrcSize"),
        size_t("dictSize")
    )

    size_t(
        "checkCParams",

        ZSTD_compressionParameters("params")
    )

    ZSTD_compressionParameters(
        "adjustCParams",

        ZSTD_compressionParameters("cPar"),
        unsigned_long_long("srcSize"),
        size_t("dictSize")
    )

    size_t(
        "CCtx_setCParams",

        ZSTD_CCtx.p("cctx"),
        ZSTD_compressionParameters("cparams")
    )

    size_t(
        "CCtx_setFParams",

        ZSTD_CCtx.p("cctx"),
        ZSTD_frameParameters("fparams"),
    )

    size_t(
        "CCtx_setParams",

        ZSTD_CCtx.p("cctx"),
        ZSTD_parameters("params")
    )

    size_t(
        "CCtx_loadDictionary_byReference",

        ZSTD_CCtx.p("cctx"),
        void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize")
    )

    size_t(
        "CCtx_loadDictionary_advanced",

        ZSTD_CCtx.p("cctx"),
        void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize"),
        ZSTD_dictLoadMethod_e("dictLoadMethod"),
        ZSTD_dictContentType_e("dictContentType")
    )

    size_t(
        "CCtx_refPrefix_advanced",

        ZSTD_CCtx.p("cctx"),
        void.const.p("prefix"),
        AutoSize("prefix")..size_t("prefixSize"),
        ZSTD_dictContentType_e("dictContentType")
    )

    size_t(
        "CCtx_getParameter",

        ZSTD_CCtx.const.p("cctx"),
        ZSTD_cParameter("param"),
        Check(1)..int.p("value")
    )

    ZSTD_CCtx_params.p(
        "createCCtxParams",

        void()
    )

    size_t(
        "freeCCtxParams",

        nullable..ZSTD_CCtx_params.p("params")
    )

    size_t(
        "CCtxParams_reset",

        ZSTD_CCtx_params.p("params")
    )

    size_t(
        "CCtxParams_init",

        ZSTD_CCtx_params.p("cctxParams"),
        int("compressionLevel")
    )

    size_t(
        "CCtxParams_init_advanced",

        ZSTD_CCtx_params.p("cctxParams"),
        ZSTD_parameters("params")
    )

    size_t(
        "CCtxParams_setParameter",

        ZSTD_CCtx_params.p("params"),
        ZSTD_cParameter("param"),
        int("value")
    )

    size_t(
        "CCtxParams_getParameter",

        ZSTD_CCtx_params.const.p("params"),
        ZSTD_cParameter("param"),
        Check(1)..int.p("value")
    )

    size_t(
        "CCtx_setParametersUsingCCtxParams",

        ZSTD_CCtx.p("cctx"),
        ZSTD_CCtx_params.const.p("params")
    )

    size_t(
        "compressStream2_simpleArgs",

        ZSTD_CCtx.p("cctx"),
        void.p("dst"),
        AutoSize("dst")..size_t("dstCapacity"),
        Check(1)..size_t.p("dstPos"),
        void.const.p("src"),
        AutoSize("src")..size_t("srcSize"),
        Check(1)..size_t.p("srcPos"),
        ZSTD_EndDirective("endOp")
    )

    unsigned_intb(
        "isFrame",

        void.const.p("buffer"),
        AutoSize("buffer")..size_t("size")
    )

    ZSTD_DDict.p(
        "createDDict_byReference",

        void.const.p("dictBuffer"),
        AutoSize("dictBuffer")..size_t("dictSize")
    )

    size_t(
        "DCtx_loadDictionary_byReference",

        ZSTD_DCtx.p("dctx"),
        void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize")
    )

    size_t(
        "DCtx_loadDictionary_advanced",

        ZSTD_DCtx.p("dctx"),
        void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize"),
        ZSTD_dictLoadMethod_e("dictLoadMethod"),
        ZSTD_dictContentType_e("dictContentType")
    )

    size_t(
        "DCtx_refPrefix_advanced",

        ZSTD_DCtx.p("dctx"),
        void.const.p("prefix"),
        AutoSize("prefix")..size_t("prefixSize"),
        ZSTD_dictContentType_e("dictContentType")
    )

    size_t(
        "DCtx_setMaxWindowSize",

        ZSTD_DCtx.p("dctx"),
        size_t("maxWindowSize")
    )

    size_t(
        "DCtx_getParameter",

        ZSTD_DCtx.p("dctx"),
        ZSTD_dParameter("param"),
        Check(1)..int.p("value")
    )

    size_t(
        "decompressStream_simpleArgs",

        ZSTD_DCtx.p("dctx"),
        void.p("dst"),
        AutoSize("dst")..size_t("dstCapacity"),
        Check(1)..size_t.p("dstPos"),
        void.const.p("src"),
        AutoSize("src")..size_t("srcSize"),
        Check(1)..size_t.p("srcPos")
    )

    ZSTD_frameProgression(
        "getFrameProgression",

        ZSTD_CCtx.const.p("cctx")
    )

    size_t(
        "toFlushNow",

        ZSTD_CCtx.p("cctx")
    )

    // BLOCK-LEVEL SEQUENCE PRODUCER API

    LongConstant(
        "SEQUENCE_PRODUCER_ERROR".."-1L"
    )

    void(
        "registerSequenceProducer",

        ZSTD_CCtx.p("cctx"),
        nullable..opaque_p("sequenceProducerState"),
        nullable..ZSTD_sequenceProducer_F("sequenceProducer")
    )

    void(
        "CCtxParams_registerSequenceProducer",

        ZSTD_CCtx_params.p("params"),
        nullable..opaque_p("sequenceProducerState"),
        nullable..ZSTD_sequenceProducer_F("sequenceProducer")
    )

    size_t(
        "decodingBufferSize_min",

        unsigned_long_long("windowSize"),
        unsigned_long_long("frameContentSize")
    )

    size_t(
        "decompressBegin",

        ZSTD_DCtx.p("dctx")
    )

    size_t(
        "decompressBegin_usingDict",

        ZSTD_DCtx.p("dctx"),
        void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize")
    )

    size_t(
        "decompressBegin_usingDDict",

        ZSTD_DCtx.p("dctx"),
        ZSTD_DDict.const.p("ddict")
    )

    size_t(
        "nextSrcSizeToDecompress",

        ZSTD_DCtx.p("dctx")
    )

    size_t(
        "decompressContinue",

        ZSTD_DCtx.p("dctx"),
        void.p("dst"),
        AutoSize("dst")..size_t("dstCapacity"),
        void.const.p("src"),
        AutoSize("src")..size_t("srcSize")
    )

    ZSTD_nextInputType_e(
        "nextInputType",

        ZSTD_DCtx.p("dctx")
    )
}