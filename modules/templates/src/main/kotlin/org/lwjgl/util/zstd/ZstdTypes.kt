/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.zstd

import org.lwjgl.generator.*

val ZSTD_PACKAGE = "org.lwjgl.util.zstd"
val ZSTD_LIBRARY = "LibZstd.initialize();"

fun config() {
    packageInfo(
        ZSTD_PACKAGE,
        """
        Contains bindings to ${url("http://facebook.github.io/zstd/", "Zstandard")} (zstd), a fast lossless compression algorithm, targeting real-time
        compression scenarios at zlib-level and better compression ratios.

        Zstandard is a real-time compression algorithm, providing high compression ratios. It offers a very wide range of compression / speed trade-off, while
        being backed by a very fast decoder. It also offers a special mode for small data, called dictionary compression, and can create dictionaries from any
        sample set.
        """
    )

    Generator.registerLibraryInit(ZSTD_PACKAGE, "LibZstd", "zstd")
}

val unsigned_intb = PrimitiveType("unsigned int", PrimitiveMapping.BOOLEAN4)
val unsigned_long_long = IntegerType("unsigned long long", PrimitiveMapping.LONG, unsigned = true)

val ZSTD_CCtx_p = "ZSTD_CCtx".p
val ZSTD_DCtx_p = "ZSTD_DCtx".p
val ZSTD_CDict_p = "ZSTD_CDict".p
val ZSTD_DDict_p = "ZSTD_DDict".p
val ZSTD_CStream_p = "ZSTD_CStream".p

val ZSTD_inBuffer_p = struct(ZSTD_PACKAGE, "ZSTDInBuffer", nativeName = "ZSTD_inBuffer") {
    const..void_p.member("src", "start of input buffer")
    AutoSize("src")..size_t.member("size", "size of input buffer")
    size_t.member("pos", "position where reading stopped. Will be updated. Necessarily {@code 0 <= pos <= size}")
}.p

val ZSTD_outBuffer_p = struct(ZSTD_PACKAGE, "ZSTDOutBuffer", nativeName = "ZSTD_outBuffer") {
    void_p.member("dst", "start of output buffer")
    AutoSize("dst")..size_t.member("size", "size of output buffer")
    size_t.member("pos", "position where writing stopped. Will be updated. Necessarily {@code 0 <= pos <= size}")
}.p

val ZSTD_DStream_p = "ZSTD_DStream".p

// Experimental API

val ZSTD_format_e = "ZSTD_format_e".enumType
val ZSTD_cParameter = "ZSTD_cParameter".enumType
val ZSTD_dictLoadMethod_e = "ZSTD_dictLoadMethod_e".enumType
val ZSTD_dictMode_e = "ZSTD_dictMode_e".enumType
val ZSTD_EndDirective = "ZSTD_EndDirective".enumType
val ZSTD_frameType_e = "ZSTD_frameType_e".enumType

val ZSTD_CCtx_params_p = "ZSTD_CCtx_params".p

val unsignedb = PrimitiveType("unsigned", PrimitiveMapping.BOOLEAN4)

val ZSTD_allocFunction = "ZSTD_allocFunction".callback(
    ZSTD_PACKAGE, void_p, "ZSTDAllocFunction",
    "",

    opaque_p.IN("opaque", ""),
    size_t.IN("size", "")
)

val ZSTD_freeFunction = "ZSTD_freeFunction".callback(
    ZSTD_PACKAGE, opaque_p, "ZSTDFreeFunction",
    "",

    opaque_p.IN("opaque", ""),
    void_p.IN("address", "")
)

val ZSTD_customMem = struct(ZSTD_PACKAGE, "ZSTDCustomMem", nativeName = "ZSTD_customMem") {
    ZSTD_allocFunction.member("customAlloc", "")
    ZSTD_freeFunction.member("customFree", "")
    opaque_p.member("opaque", "")
}

val ZSTD_frameHeader_p = struct(ZSTD_PACKAGE, "ZSTDFrameHeader", nativeName = "ZSTD_frameHeader", mutable = false) {
    unsigned_long_long.member("frameContentSize", "if #CONTENTSIZE_UNKNOWN, it means this field is not available. 0 means \"empty\"")
    unsigned_long_long.member("windowSize", "can be very large, up to &le; {@code frameContentSize}")
    unsigned.member("blockSizeMax", "")
    ZSTD_frameType_e.member("frameType", "if #skippableFrame, {@code frameContentSize} is the size of skippable content")
    unsigned.member("headerSize", "")
    unsigned.member("dictID", "")
    unsigned.member("checksumFlag", "")
}.p

// zstd_errors.h

val ZSTD_ErrorCode = "ZSTD_ErrorCode".enumType