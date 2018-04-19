/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4.templates

import org.lwjgl.generator.*
import lz4.*

val LZ4FrameX = "LZ4FrameX".nativeClass(Module.LZ4, prefix = "LZ4F", prefixMethod = "LZ4F_", library = LZ4_LIBRARY) {
    nativeDirective(
        """DISABLE_WARNINGS()
#include "lz4frame_static.h"
ENABLE_WARNINGS()""")

    documentation = "Native bindings to the experimental frame API of ${url("http://lz4.github.io/lz4/", "LZ4")}."

    EnumConstant(
        "Error code.",

        "OK_NoError".enum,
        "ERROR_GENERIC".enum,
        "ERROR_maxBlockSize_invalid".enum,
        "ERROR_blockMode_invalid".enum,
        "ERROR_contentChecksumFlag_invalid".enum,
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
        "ERROR_maxCode".enum
    )

    LZ4F_errorCodes(
        "getErrorCode",
        "",

        size_t.IN("functionResult", "")
    )

    LZ4F_CDict.p(
        "createCDict",
        """
        When compressing multiple messages / blocks with the same dictionary, it's recommended to load it just once. {@code LZ4_createCDict()} will create a
        digested dictionary, ready to start future compression operations without startup delay.

        {@code LZ4_CDict} can be created once and shared by multiple threads concurrently, since its usage is read-only.

        {@code dictBuffer} can be released after {@code LZ4_CDict} creation, since its content is copied within {@code CDict}.
        """,

        void.const.p.IN("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t.IN("dictSize", "")
    )

    void(
        "freeCDict",
        "",

        LZ4F_CDict.p.IN("CDict", "")
    )

    size_t(
        "compressFrame_usingCDict",
        """
        Compress an entire {@code srcBuffer} into a valid LZ4 frame using a digested Dictionary.

        {@code dst} MUST be &ge; #compressFrameBound(){@code (srcSize, preferencesPtr)}. If this condition is not respected, function will fail (return an
        {@code errorCode}).
        """,

        LZ4F_cctx.p.IN("cctx", "must point to a context created by #createCompressionContext()."),
        void.p.OUT("dst", ""),
        AutoSize("dst")..size_t.IN("dstCapacity", ""),
        void.const.p.IN("src", ""),
        AutoSize("src")..size_t.IN("srcSize", ""),
        nullable..LZ4F_CDict.const.p.IN("cdict", "if #NULL, compress without a dictionary"),
        LZ4F_preferences_t.const.p.IN(
            "preferencesPtr",
            "optional: you may provide #NULL as argument, but it's not recommended, as it's the only way to provide {@code dictID} in the frame header"
        ),

        returnDoc = "number of bytes written into {@code dstBuffer} or an error code if it fails (can be tested using #isError())"
    )

    size_t(
        "compressBegin_usingCDict",
        """
        Inits streaming dictionary compression, and writes the frame header into {@code dstBuffer}.

        {@code dstCapacity} must be &ge; #HEADER_SIZE_MAX bytes.
        """,

        LZ4F_cctx.p.IN("cctx", ""),
        void.p.OUT("dstBuffer", ""),
        AutoSize("dstBuffer")..size_t.IN("dstCapacity", ""),
        LZ4F_CDict.const.p.IN("cdict", ""),
        LZ4F_preferences_t.const.p.IN(
            "prefsPtr",
            "optional: you may provide #NULL as argument, however, it's the only way to provide {@code dictID} in the frame header"
        ),

        returnDoc = "number of bytes written into {@code dstBuffer} for the header, or an error code (which can be tested using #isError())"
    )

    size_t(
        "decompress_usingDict",
        """
        Same as #decompress(), using a predefined dictionary.

        Dictionary is used "in place", without any preprocessing. It must remain accessible throughout the entire frame decoding.
        """,

        LZ4F_dctx.p.IN("dctxPtr", ""),
        void.p.OUT("dstBuffer", ""),
        AutoSize("dstBuffer")..Check(1)..size_t.p.INOUT("dstSizePtr", ""),
        void.const.p.IN("srcBuffer", ""),
        AutoSize("srcBuffer")..Check(1)..size_t.p.INOUT("srcSizePtr", ""),
        void.const.p.IN("dict", ""),
        AutoSize("dict")..size_t.IN("dictSize", ""),
        LZ4F_decompressOptions_t.const.p.IN("decompressOptionsPtr", "")
    )
}