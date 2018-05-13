/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4

import org.lwjgl.generator.*

const val LZ4_LIBRARY = "LibLZ4.initialize();"

fun config() {
    packageInfo(
        Module.LZ4,
        """
        Contains bindings to ${url("http://lz4.github.io/lz4/", "LZ4")}, a lossless compression algorithm, providing compression speed at 400 MB/s per core,
        scalable with multi-cores CPU. It features an extremely fast decoder, with speed in multiple GB/s per core, typically reaching RAM speed limits on
        multi-core systems.

        Speed can be tuned dynamically, selecting an "acceleration" factor which trades compression ratio for more speed up. On the other end, a high
        compression derivative, {@code LZ4_HC}, is also provided, trading CPU time for improved compression ratio. All versions feature the same decompression
        speed.
        """
    )

    Generator.registerLibraryInit(Module.LZ4, "LibLZ4", "lz4")
}

val LZ4_stream_t = "LZ4_stream_t".opaque
val LZ4_streamDecode_t = "LZ4_streamDecode_t".opaque

// lz4frame.h

val unsignedb = PrimitiveType("unsigned", PrimitiveMapping.BOOLEAN4)

val LZ4F_errorCode_t = typedef(size_t, "LZ4F_errorCode_t")

val LZ4F_blockSizeID_t = "LZ4F_blockSizeID_t".enumType
val LZ4F_blockMode_t = "LZ4F_blockMode_t".enumType
val LZ4F_contentChecksum_t = "LZ4F_contentChecksum_t".enumType
val LZ4F_frameType_t = "LZ4F_frameType_t".enumType
val LZ4F_blockChecksum_t = "LZ4F_blockChecksum_t".enumType

val unsigned_long_long = IntegerType("unsigned long long", PrimitiveMapping.LONG, unsigned = true)

val LZ4F_cctx = "LZ4F_cctx".opaque
val LZ4F_dctx = "LZ4F_dctx".opaque

/*! LZ4F_frameInfo_t :
 *  makes it possible to set or read frame parameters.
 *   */
val LZ4F_frameInfo_t = struct(Module.LZ4, "LZ4FFrameInfo", nativeName = "LZ4F_frameInfo_t") {
    documentation =
        """
        Makes it possible to set or read frame parameters.

        It's not required to set all fields, as long as the structure was initially {@code memset()} to zero. For all fields, 0 sets it to default value.
        """
    LZ4F_blockSizeID_t.member("blockSizeID", "{@code 0 == default}").links("max\\d+\\w+")
    LZ4F_blockMode_t.member("blockMode", "{@code 0 == default}").links("block\\w+")
    LZ4F_contentChecksum_t.member("contentChecksumFlag", "1: frame terminated with 32-bit checksum of decompressed data; 0: disabled (default) ")
    LZ4F_frameType_t.member("frameType", "read-only field").links("#frame #skippableFrame")
    unsigned_long_long.member("contentSize", "size of uncompressed content ; {@code 0 == unknown}")
    unsigned.member("dictID", "dictionary ID, sent by compressor to help decoder select correct dictionary; 0 == no {@code dictID} provided")
    LZ4F_blockChecksum_t.member("blockChecksumFlag", "1: each block followed by a checksum of block's compressed data; 0: disabled (default)")
}

/*! LZ4F_preferences_t :
 *  makes it possible to supply detailed compression parameters to the stream interface.
 *  It's not required to set all fields, as long as the structure was initially memset() to zero.
 *  All reserved fields must be set to zero. */
val LZ4F_preferences_t = struct(Module.LZ4, "LZ4FPreferences", nativeName = "LZ4F_preferences_t") {
    LZ4F_frameInfo_t.member("frameInfo", "")
    int.member(
        "compressionLevel",
        "0: default (fast mode); values &gt; #CLEVEL_MAX count as #CLEVEL_MAX; values &gt; 0 trigger \"fast acceleration\""
    )
    unsigned.member("autoFlush", "1: always flush, to reduce usage of internal buffers")
    unsigned.member("favorDecSpeed", "1: parser favors decompression speed vs compression ratio. Only works for high compression modes (&ge; #CLEVEL_OPT_MIN). Since version 1.8.2.")
    unsigned.array("reserved", "must be zero for forward compatibility", size = 3)
}

val LZ4F_compressOptions_t = struct(Module.LZ4, "LZ4FCompressOptions", nativeName = "LZ4F_compressOptions_t") {
    unsigned.member(
        "stableSrc",
        "{@code 1 == src} content will remain present on future calls to {@code LZ4F_compress()}; skip copying {@code src} content within {@code tmp} buffer"
    )
    unsigned.array("reserved", "", size = 3)
}

val LZ4F_decompressOptions_t = struct(Module.LZ4, "LZ4FDecompressOptions", nativeName = "LZ4F_decompressOptions_t") {
    unsigned.member(
        "stableDst",
        "pledges that last 64KB decompressed data will remain available unmodified. This optimization skips storage operations in tmp buffers."
    )
    unsigned.array("reserved", "must be set to zero for forward compatibility", size = 3)
}

// lz4frame_static.h

val LZ4F_errorCodes = "LZ4F_errorCodes".enumType

val LZ4F_CDict = "LZ4F_CDict".opaque

// lz4hc.h

val LZ4_streamHC_t = "LZ4_streamHC_t".opaque