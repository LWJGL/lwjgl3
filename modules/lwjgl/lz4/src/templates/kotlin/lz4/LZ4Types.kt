/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4

import org.lwjgl.generator.*

val LZ4_i8 = typedef(int8_t, "LZ4_i8")
val LZ4_byte = typedef(uint8_t, "LZ4_byte")
val LZ4_u16 = typedef(uint16_t, "LZ4_u16")
val LZ4_u32 = typedef(uint32_t, "LZ4_u32")

val LZ4_stream_t = "LZ4_stream_t".opaque
val LZ4_streamDecode_t = "LZ4_streamDecode_t".opaque

// lz4frame.h

val LZ4F_errorCode_t = typedef(size_t, "LZ4F_errorCode_t")

val LZ4F_blockSizeID_t = "LZ4F_blockSizeID_t".enumType
val LZ4F_blockMode_t = "LZ4F_blockMode_t".enumType
val LZ4F_contentChecksum_t = "LZ4F_contentChecksum_t".enumType
val LZ4F_frameType_t = "LZ4F_frameType_t".enumType
val LZ4F_blockChecksum_t = "LZ4F_blockChecksum_t".enumType

val LZ4F_cctx = "LZ4F_cctx".opaque
val LZ4F_dctx = "LZ4F_dctx".opaque

val LZ4F_frameInfo_t = struct(Module.LZ4, "LZ4FFrameInfo", nativeName = "LZ4F_frameInfo_t") {
    documentation =
        """
        Makes it possible to set or read frame parameters.

        Structure must be first init to 0, using {@code memset()}, setting all parameters to default. It's then possible to update selectively some parameter.
        """
    LZ4F_blockSizeID_t("blockSizeID", "{@code 0 == default}").links("max\\d+\\w+")
    LZ4F_blockMode_t("blockMode", "{@code 0 == default}").links("block\\w+")
    LZ4F_contentChecksum_t("contentChecksumFlag", "1: frame terminated with 32-bit checksum of decompressed data; 0: disabled (default) ")
    LZ4F_frameType_t("frameType", "read-only field").links("#frame #skippableFrame")
    unsigned_long_long("contentSize", "size of uncompressed content ; {@code 0 == unknown}")
    unsigned("dictID", "dictionary ID, sent by compressor to help decoder select correct dictionary; 0 == no {@code dictID} provided")
    LZ4F_blockChecksum_t("blockChecksumFlag", "1: each block followed by a checksum of block's compressed data; 0: disabled (default)")
}

val LZ4F_preferences_t = struct(Module.LZ4, "LZ4FPreferences", nativeName = "LZ4F_preferences_t") {
    documentation =
        """
        Makes it possible to supply advanced compression instructions to streaming interface. Structure must be first init to 0, using {@code memset()},
        setting all parameters to default. All reserved fields must be set to zero.
        """
    LZ4F_frameInfo_t("frameInfo", "")
    int(
        "compressionLevel",
        "0: default (fast mode); values &gt; #CLEVEL_MAX count as #CLEVEL_MAX; values &gt; 0 trigger \"fast acceleration\""
    )
    unsignedb("autoFlush", "1: always flush, reduces usage of internal buffers")
    unsignedb("favorDecSpeed", "1: parser favors decompression speed vs compression ratio. Only works for high compression modes (&ge; #CLEVEL_OPT_MIN). Since version 1.8.2.")
    unsigned("reserved", "must be zero for forward compatibility")[3]
}

val LZ4F_compressOptions_t = struct(Module.LZ4, "LZ4FCompressOptions", nativeName = "LZ4F_compressOptions_t") {
    unsigned(
        "stableSrc",
        "{@code 1 == src} content will remain present on future calls to {@code LZ4F_compress()}; skip copying {@code src} content within {@code tmp} buffer"
    )
    unsigned("reserved", "")[3]
}

val LZ4F_decompressOptions_t = struct(Module.LZ4, "LZ4FDecompressOptions", nativeName = "LZ4F_decompressOptions_t") {
    unsigned(
        "stableDst",
        "pledges that last 64KB decompressed data will remain available unmodified. This optimization skips storage operations in tmp buffers."
    )
    unsigned("reserved", "must be set to zero for forward compatibility")[3]
}

// lz4frame_static.h

val LZ4F_errorCodes = "LZ4F_errorCodes".enumType

val LZ4F_CDict = "LZ4F_CDict".opaque

// lz4hc.h

val LZ4_streamHC_t = "LZ4_streamHC_t".opaque