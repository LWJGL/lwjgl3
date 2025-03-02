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

    IntConstant(
        "VERSION_MAJOR".."1",
        "VERSION_MINOR".."5",
        "VERSION_RELEASE".."7"
    )

    IntConstant("VERSION_NUMBER".."(ZSTD_VERSION_MAJOR *100*100 + ZSTD_VERSION_MINOR *100 + ZSTD_VERSION_RELEASE)")
    StringConstant("VERSION_STRING".."""ZSTD_VERSION_MAJOR + "." + ZSTD_VERSION_MINOR + "." + ZSTD_VERSION_RELEASE""")

    unsigned("versionNumber", void())
    Nonnull..charASCII.const.p("versionString", void())

    IntConstant(
        "CLEVEL_DEFAULT".."3"
    )

    IntConstant("MAGICNUMBER".."0xFD2FB528")
    IntConstant("MAGIC_DICTIONARY".."0xEC30A437")
    IntConstant("MAGIC_SKIPPABLE_START".."0x184D2A50")
    IntConstant("MAGIC_SKIPPABLE_MASK".."0xFFFFFFF0")
    IntConstant("BLOCKSIZELOG_MAX".."17")
    IntConstant("BLOCKSIZE_MAX".."(1<<ZSTD_BLOCKSIZELOG_MAX)")

    LongConstant(
        "CONTENTSIZE_UNKNOWN"..("-1L"),
        "CONTENTSIZE_ERROR"..("-2L")
    )

    EnumConstant(
        "fast".enum("1"),
        "dfast".enum,
        "greedy".enum,
        "lazy".enum,
        "lazy2".enum,
        "btlazy2".enum,
        "btopt".enum,
        "btultra".enum,
        "btultra2".enum
    )

    EnumConstant(
        "c_compressionLevel".enum("100"),
        "c_windowLog".enum,
        "c_hashLog".enum,
        "c_chainLog".enum,
        "c_searchLog".enum,
        "c_minMatch".enum,
        "c_targetLength".enum,
        "c_strategy".enum,
        "c_targetCBlockSize".enum,
        "c_enableLongDistanceMatching".enum("160"),
        "c_ldmHashLog".enum,
        "c_ldmMinMatch".enum,
        "c_ldmBucketSizeLog".enum,
        "c_ldmHashRateLog".enum,
        "c_contentSizeFlag".enum("200"),
        "c_checksumFlag".enum,
        "c_dictIDFlag".enum,
        "c_nbWorkers".enum("400"),
        "c_jobSize".enum,
        "c_overlapLog".enum,
        "c_experimentalParam1".enum("500"),
        "c_experimentalParam2".enum("10"),
        "c_experimentalParam3".enum("1000"),
        "c_experimentalParam4".enum,
        "c_experimentalParam5".enum,
        //"c_experimentalParam6".enum,
        "c_experimentalParam7".enum("1004"),
        "c_experimentalParam8".enum,
        "c_experimentalParam9".enum,
        "c_experimentalParam10".enum,
        "c_experimentalParam11".enum,
        "c_experimentalParam12".enum,
        "c_experimentalParam13".enum,
        "c_experimentalParam14".enum,
        "c_experimentalParam15".enum,
        "c_experimentalParam16".enum,
        "c_experimentalParam17".enum,
        "c_experimentalParam18".enum,
        "c_experimentalParam19".enum,
        "c_experimentalParam20".enum
    )

    EnumConstant(
        "reset_session_only".enum("1"),
        "reset_parameters".enum,
        "reset_session_and_parameters".enum
    )

    EnumConstant(
        "d_windowLogMax".enum("100"),
        "d_experimentalParam1".enum("1000"),
        "d_experimentalParam2".enum,
        "d_experimentalParam3".enum,
        "d_experimentalParam4".enum,
        "d_experimentalParam5".enum,
        "d_experimentalParam6".enum
    )

    EnumConstant(
        "e_continue".enum("0"),
        "e_flush".enum,
        "e_end".enum
    )

    /***************************************
    *  Simple API
    ***************************************/

    val compress = size_t(
        "compress",

        void.p("dst"),
        AutoSize("dst")..size_t("dstCapacity"),
        void.const.p("src"),
        AutoSize("src")..size_t("srcSize"),
        int("compressionLevel")
    )

    size_t(
        "decompress",

        void.p("dst"),
        AutoSize("dst")..size_t("dstCapacity"),
        void.const.p("src"),
        AutoSize("src")..size_t("compressedSize")
    )

    unsigned_long_long(
        "getFrameContentSize",

        void.const.p("src"),
        AutoSize("src")..size_t("srcSize")
    )

    size_t(
        "findFrameCompressedSize",

        void.const.p("src"),
        AutoSize("src")..size_t("srcSize")
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

        size_t("srcSize")
    )

    unsigned_intb(
        "isError",

        size_t("result")
    )

    ZSTD_ErrorCode(
        "getErrorCode",

        size_t("functionResult")
    )

    Nonnull..charASCII.const.p(
        "getErrorName",

        size_t("result")
    )

    int("minCLevel", void())
    int("maxCLevel", void())
    int("defaultCLevel", void())

    /***************************************
    *  Explicit context
    ***************************************/

    ZSTD_CCtx.p(
        "createCCtx",
        void()
    )

    size_t(
        "freeCCtx",

        nullable..ZSTD_CCtx.p("cctx")
    )

    size_t(
        "compressCCtx",

        ZSTD_CCtx.p("ctx"),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        int("compressionLevel")
    )

    ZSTD_DCtx.p(
        "createDCtx",
        void()
    )

    size_t(
        "freeDCtx",

        nullable..ZSTD_DCtx.p("dctx")
    )

    size_t(
        "decompressDCtx",

        ZSTD_DCtx.p("ctx"),
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

        ZSTD_cParameter("cParam")
    )

    size_t(
        "CCtx_setParameter",

        ZSTD_CCtx.p("cctx"),
        ZSTD_cParameter("param"),
        int("value")
    )

    size_t(
        "CCtx_setPledgedSrcSize",

        ZSTD_CCtx.p("cctx"),
        unsigned_long_long("pledgedSrcSize")
    )

    size_t(
        "CCtx_reset",

        ZSTD_CCtx.p("cctx"),
        ZSTD_ResetDirective("reset")
    )

    size_t(
        "compress2",

        ZSTD_CCtx.p("cctx"),
        void.p("dst"),
        AutoSize("dst")..size_t("dstCapacity"),
        void.const.p("src"),
        AutoSize("src")..size_t("srcSize")
    )

    /***************************************
    *  Advanced decompression API
    ***************************************/

    ZSTD_bounds(
        "dParam_getBounds",

        ZSTD_dParameter("dParam")
    )

    size_t(
        "DCtx_setParameter",

        ZSTD_DCtx.p("dctx"),
        ZSTD_dParameter("param"),
        int("value")
    )

    size_t(
        "DCtx_reset",

        ZSTD_DCtx.p("dctx"),
        ZSTD_ResetDirective("reset")
    )

    /****************************
    *  Streaming
    ****************************/

    ZSTD_CStream.p(
        "createCStream",
        void()
    )

    size_t(
        "freeCStream",

        nullable..ZSTD_CStream.p("zcs")
    )

    size_t(
        "compressStream2",

        ZSTD_CCtx.p("cctx"),
        Input..ZSTD_outBuffer.p("output"),
        Input..ZSTD_inBuffer.p("input"),
        ZSTD_EndDirective("endOp")
    )

    size_t(
        "CStreamInSize",
        void()
    )

    size_t(
        "CStreamOutSize",
        void()
    )

    ZSTD_DStream.p(
        "createDStream",
        void()
    )

    size_t(
        "freeDStream",

        nullable..ZSTD_DStream.p("zds")
    )

    size_t(
        "decompressStream",

        ZSTD_DStream.p("zds"),
        Input..ZSTD_outBuffer.p("output"),
        Input..ZSTD_inBuffer.p("input")
    )

    size_t(
        "DStreamInSize",
        void()
    )

    size_t(
        "DStreamOutSize",
        void()
    )

    /**************************
    *  Simple dictionary API
    ***************************/

    size_t(
        "compress_usingDict",

        ZSTD_CCtx.p("ctx"),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        nullable..void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize"),
        int("compressionLevel")
    )

    size_t(
        "decompress_usingDict",

        ZSTD_DCtx.p("dctx"),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        nullable..void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize")
    )

    /**********************************
     *  Bulk processing dictionary API
     *********************************/

    ZSTD_CDict.p(
        "createCDict",

        void.const.p("dictBuffer"),
        AutoSize("dictBuffer")..size_t("dictSize"),
        int("compressionLevel")
    )

    size_t(
        "freeCDict",

        nullable..ZSTD_CDict.p("CDict")
    )

    size_t(
        "compress_usingCDict",

        ZSTD_CCtx.p("cctx"),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        ZSTD_CDict.const.p("cdict")
    )

    ZSTD_DDict.p(
        "createDDict",

        void.const.p("dictBuffer"),
        AutoSize("dictBuffer")..size_t("dictSize")
    )

    size_t(
        "freeDDict",

        nullable..ZSTD_DDict.p("ddict")
    )

    size_t(
        "decompress_usingDDict",

        ZSTD_DCtx.p("dctx"),
        compress["dst"],
        compress["dstCapacity"],
        compress["src"],
        compress["srcSize"],
        ZSTD_DDict.const.p("ddict")
    )

    unsigned_int(
        "getDictID_fromDict",

        void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize")
    )

    unsigned(
        "getDictID_fromCDict",

        ZSTD_CDict.const.p("cdict")
    )

    unsigned_int(
        "getDictID_fromDDict",

        ZSTD_DDict.const.p("ddict")
    )

    unsigned_int(
        "getDictID_fromFrame",

        void.const.p("src"),
        AutoSize("src")..size_t("srcSize")
    )
        size_t(
        "CCtx_loadDictionary",

        ZSTD_CCtx.p("cctx"),
        nullable..void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize")
    )

    size_t(
        "CCtx_refCDict",

        ZSTD_CCtx.p("cctx"),
        nullable..ZSTD_CDict.const.p("cdict")
    )

    size_t(
        "CCtx_refPrefix",

        ZSTD_CCtx.p("cctx"),
        nullable..void.const.p("prefix"),
        AutoSize("prefix")..size_t("prefixSize")
    )

    size_t(
        "DCtx_loadDictionary",

        ZSTD_DCtx.p("dctx"),
        nullable..void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize")
    )

    size_t(
        "DCtx_refDDict",

        ZSTD_DCtx.p("dctx"),
        nullable..ZSTD_DDict.const.p("ddict")
    )

    size_t(
        "DCtx_refPrefix",

        ZSTD_DCtx.p("dctx"),
        void.const.p("prefix"),
        AutoSize("prefix")..size_t("prefixSize")
    )

    size_t("sizeof_CCtx", ZSTD_CCtx.const.p("cctx"))
    size_t("sizeof_DCtx", ZSTD_DCtx.const.p("dctx"))
    size_t("sizeof_CStream", ZSTD_CStream.const.p("zcs"))
    size_t("sizeof_DStream", ZSTD_DStream.const.p("zds"))
    size_t("sizeof_CDict", ZSTD_CDict.const.p("cdict"))
    size_t("sizeof_DDict", ZSTD_DDict.const.p("ddict"))
}