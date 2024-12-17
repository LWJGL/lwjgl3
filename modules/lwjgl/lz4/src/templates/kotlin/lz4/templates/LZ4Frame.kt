/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4.templates

import org.lwjgl.generator.*
import lz4.*

val LZ4Frame = "LZ4Frame".nativeClass(Module.LZ4, prefix = "LZ4F", prefixMethod = "LZ4F_") {
    nativeDirective(
        """DISABLE_WARNINGS()
#define LZ4F_STATIC_LINKING_ONLY
#include "lz4frame.h"
ENABLE_WARNINGS()""")

    IntConstant(
        "VERSION".."100"
    )

    IntConstant("HEADER_SIZE_MIN".."7")
    IntConstant("HEADER_SIZE_MAX".."19")
    IntConstant("BLOCK_HEADER_SIZE".."4")
    IntConstant("BLOCK_CHECKSUM_SIZE".."4")
    IntConstant("CONTENT_CHECKSUM_SIZE".."4")

    EnumConstant(
        "default".enum,
        "max64KB".enum("4"),
        "max256KB".enum,
        "max1MB".enum,
        "max4MB".enum
    )

    EnumConstant(
        "blockLinked".enum,
        "blockIndependent".enum
    )

    EnumConstant(
        "noContentChecksum".enum,
        "contentChecksumEnabled".enum
    )

    EnumConstant(
        "noBlockChecksum".enum,
        "blockChecksumEnabled".enum
    )

    EnumConstant(
        "frame".enum,
        "skippableFrame".enum
    )

    unsignedb(
        "isError",

        LZ4F_errorCode_t("code")
    )

    charASCII.const.p(
        "getErrorName",

        LZ4F_errorCode_t("code")
    )

    size_t(
        "compressFrame",

        void.p("dstBuffer"),
        AutoSize("dstBuffer")..size_t("dstCapacity"),
        void.const.p("srcBuffer"),
        AutoSize("srcBuffer")..size_t("srcSize"),
        nullable..LZ4F_preferences_t.const.p("preferencesPtr")
    )

    size_t(
        "compressFrameBound",

        size_t("srcSize"),
        nullable..LZ4F_preferences_t.const.p("preferencesPtr")
    )

    int(
        "compressionLevel_max",

        void()
    )

    unsigned("getVersion", void())

    LZ4F_errorCode_t(
        "createCompressionContext",

        Check(1)..LZ4F_cctx.p.p("cctxPtr"),
        unsigned("version")
    )

    LZ4F_errorCode_t(
        "freeCompressionContext",

        nullable..LZ4F_cctx.p("cctx")
    )

    size_t(
        "compressBegin",

        LZ4F_cctx.p("cctx"),
        void.p("dstBuffer"),
        AutoSize("dstBuffer")..size_t("dstCapacity"),
        nullable..LZ4F_preferences_t.const.p("prefsPtr")
    )

    size_t(
        "compressBound",

        size_t("srcSize"),
        nullable..LZ4F_preferences_t.const.p("prefsPtr")
    )

    size_t(
        "compressUpdate",

        LZ4F_cctx.p("cctx"),
        void.p("dstBuffer"),
        AutoSize("dstBuffer")..size_t("dstCapacity"),
        void.const.p("srcBuffer"),
        AutoSize("srcBuffer")..size_t("srcSize"),
        nullable..LZ4F_compressOptions_t.const.p("cOptPtr")
    )

    size_t(
        "flush",

        LZ4F_cctx.p("cctx"),
        void.p("dstBuffer"),
        AutoSize("dstBuffer")..size_t("dstCapacity"),
        nullable..LZ4F_compressOptions_t.const.p("cOptPtr")
    )

    size_t(
        "compressEnd",

        LZ4F_cctx.p("cctx"),
        void.p("dstBuffer"),
        AutoSize("dstBuffer")..size_t("dstCapacity"),
        nullable..LZ4F_compressOptions_t.const.p("cOptPtr")
    )

    LZ4F_errorCode_t(
        "createDecompressionContext",

        Check(1)..LZ4F_dctx.p.p("dctxPtr"),
        unsigned("version")
    )

    LZ4F_errorCode_t(
        "freeDecompressionContext",

        LZ4F_dctx.p("dctx")
    )

    IntConstant("MAGICNUMBER"..0x184D2204)
    IntConstant("MAGIC_SKIPPABLE_START"..0x184D2A50)
    IntConstant("MIN_SIZE_TO_KNOW_HEADER_LENGTH".."5")

    size_t(
        "headerSize",

        void.const.p("src"),
        AutoSize("src")..size_t("srcSize")
    )

    size_t(
        "getFrameInfo",

        LZ4F_dctx.p("dctx"),
        LZ4F_frameInfo_t.p("frameInfoPtr"),
        void.const.p("srcBuffer"),
        AutoSize("srcBuffer")..Check(1)..size_t.p("srcSizePtr")
    )

    size_t(
        "decompress",

        LZ4F_dctx.p("dctx"),
        void.p("dstBuffer"),
        AutoSize("dstBuffer")..Check(1)..size_t.p("dstSizePtr"),
        void.const.p("srcBuffer"),
        AutoSize("srcBuffer")..Check(1)..size_t.p("srcSizePtr"),
        LZ4F_decompressOptions_t.const.p("dOptPtr")
    )

    void(
        "resetDecompressionContext",

        LZ4F_dctx.p("dctx")
    )

    // -----------------------------------------------------

    EnumConstant(
        "OK_NoError".enum,
        "ERROR_GENERIC".enum,
        "ERROR_maxBlockSize_invalid".enum,
        "ERROR_blockMode_invalid".enum,
        "ERROR_parameter_invalid".enum,
        "ERROR_compressionLevel_invalid".enum,
        "ERROR_headerVersion_wrong".enum,
        "ERROR_blockChecksum_invalid".enum,
        "ERROR_reservedFlag_set".enum,
        "ERROR_allocation_failed".enum,
        "ERROR_srcSize_tooLarge".enum,
        "ERROR_dstMaxSize_tooSmall".enum,
        "ERROR_frameHeader_incomplete".enum,
        "ERROR_frameType_unknown".enum,
        "ERROR_frameSize_wrong".enum,
        "ERROR_srcPtr_wrong".enum,
        "ERROR_decompressionFailed".enum,
        "ERROR_headerChecksum_invalid".enum,
        "ERROR_contentChecksum_invalid".enum,
        "ERROR_frameDecoding_alreadyStarted".enum,
        "ERROR_compressionState_uninitialized".enum,
        "ERROR_parameter_null".enum,
        "ERROR_io_write".enum,
        "ERROR_io_read".enum,
        "ERROR_maxCode".enum
    )

    LZ4F_errorCodes(
        "getErrorCode",

        size_t("functionResult")
    )

    size_t(
        "compressBegin_usingDict",

        LZ4F_cctx.p("cctx"),
        void.p("dstBuffer"),
        AutoSize("dstBuffer")..size_t("dstCapacity"),
        void.const.p("dictBuffer"),
        AutoSize("dictBuffer")..size_t("dictSize"),
        nullable..LZ4F_preferences_t.const.p("prefsPtr")
    )

    size_t(
        "decompress_usingDict",

        LZ4F_dctx.p("dctxPtr"),
        void.p("dstBuffer"),
        AutoSize("dstBuffer")..Check(1)..size_t.p("dstSizePtr"),
        void.const.p("srcBuffer"),
        AutoSize("srcBuffer")..Check(1)..size_t.p("srcSizePtr"),
        void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize"),
        LZ4F_decompressOptions_t.const.p("decompressOptionsPtr")
    )

    LZ4F_CDict.p(
        "createCDict",

        void.const.p("dictBuffer"),
        AutoSize("dictBuffer")..size_t("dictSize")
    )

    void(
        "freeCDict",

        LZ4F_CDict.p("CDict")
    )

    size_t(
        "compressFrame_usingCDict",

        LZ4F_cctx.p("cctx"),
        void.p("dst"),
        AutoSize("dst")..size_t("dstCapacity"),
        void.const.p("src"),
        AutoSize("src")..size_t("srcSize"),
        nullable..LZ4F_CDict.const.p("cdict"),
        LZ4F_preferences_t.const.p("preferencesPtr")
    )

    size_t(
        "compressBegin_usingCDict",

        LZ4F_cctx.p("cctx"),
        void.p("dstBuffer"),
        AutoSize("dstBuffer")..size_t("dstCapacity"),
        LZ4F_CDict.const.p("cdict"),
        LZ4F_preferences_t.const.p("prefsPtr")
    )

    size_t(
        "getBlockSize",

        LZ4F_blockSizeID_t("blockSizeID")
    )

    size_t(
        "uncompressedUpdate",

        LZ4F_cctx.p("cctx"),
        void.p("dstBuffer"),
        AutoSize("dstBuffer")..size_t("dstCapacity"),
        void.const.p("srcBuffer"),
        AutoSize("srcBuffer")..size_t("srcSize"),
        nullable..LZ4F_compressOptions_t.const.p("cOptPtr")
    )

    macro..LZ4F_CustomMem("defaultCMem", void())

    LZ4F_cctx.p(
        "createCompressionContext_advanced",

        LZ4F_CustomMem("customMem"),
        unsigned("version")
    )

    LZ4F_dctx.p(
        "createDecompressionContext_advanced",

        LZ4F_CustomMem("customMem"),
        unsigned("version")
    )

    LZ4F_CDict.p(
        "createCDict_advanced",

        LZ4F_CustomMem("customMem"),
        void.const.p("dictBuffer"),
        AutoSize("dictBuffer")..size_t("dictSize")
    )
}