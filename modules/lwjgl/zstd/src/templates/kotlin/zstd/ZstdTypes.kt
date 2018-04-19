/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package zstd

import org.lwjgl.generator.*

const val ZSTD_LIBRARY = "LibZstd.initialize();"

fun config() {
    packageInfo(
        Module.ZSTD,
        """
        Contains bindings to ${url("http://facebook.github.io/zstd/", "Zstandard")} (zstd), a fast lossless compression algorithm, targeting real-time
        compression scenarios at zlib-level and better compression ratios.

        Zstandard is a real-time compression algorithm, providing high compression ratios. It offers a very wide range of compression / speed trade-off, while
        being backed by a very fast decoder. It also offers a special mode for small data, called dictionary compression, and can create dictionaries from any
        sample set.
        """
    )

    Generator.registerLibraryInit(Module.ZSTD, "LibZstd", "zstd")
}

val unsigned_intb = PrimitiveType("unsigned int", PrimitiveMapping.BOOLEAN4)
val unsigned_long_long = IntegerType("unsigned long long", PrimitiveMapping.LONG, unsigned = true)

val ZSTD_CCtx = "ZSTD_CCtx".opaque
val ZSTD_DCtx = "ZSTD_DCtx".opaque
val ZSTD_CDict = "ZSTD_CDict".opaque
val ZSTD_DDict = "ZSTD_DDict".opaque
val ZSTD_CStream = "ZSTD_CStream".opaque

val ZSTD_inBuffer = struct(Module.ZSTD, "ZSTDInBuffer", nativeName = "ZSTD_inBuffer") {
    void.const.p.member("src", "start of input buffer")
    AutoSize("src")..size_t.member("size", "size of input buffer")
    size_t.member("pos", "position where reading stopped. Will be updated. Necessarily {@code 0 <= pos <= size}")
}

val ZSTD_outBuffer = struct(Module.ZSTD, "ZSTDOutBuffer", nativeName = "ZSTD_outBuffer") {
    void.p.member("dst", "start of output buffer")
    AutoSize("dst")..size_t.member("size", "size of output buffer")
    size_t.member("pos", "position where writing stopped. Will be updated. Necessarily {@code 0 <= pos <= size}")
}

val ZSTD_DStream = "ZSTD_DStream".opaque

// Experimental API

val ZSTD_format_e = "ZSTD_format_e".enumType
val ZSTD_cParameter = "ZSTD_cParameter".enumType
val ZSTD_dictLoadMethod_e = "ZSTD_dictLoadMethod_e".enumType
val ZSTD_dictContentType_e = "ZSTD_dictContentType_e".enumType
val ZSTD_EndDirective = "ZSTD_EndDirective".enumType
val ZSTD_frameType_e = "ZSTD_frameType_e".enumType

val ZSTD_CCtx_params = "ZSTD_CCtx_params".opaque

val unsignedb = PrimitiveType("unsigned", PrimitiveMapping.BOOLEAN4)

val ZSTD_allocFunction = Module.ZSTD.callback {
    void.p(
        "ZSTDAllocFunction",
        "",

        opaque_p.IN("opaque", ""),
        size_t.IN("size", ""),

        nativeType = "ZSTD_allocFunction"
    )
}

val ZSTD_freeFunction = Module.ZSTD.callback {
    opaque_p(
        "ZSTDFreeFunction",
        "",

        opaque_p.IN("opaque", ""),
        void.p.IN("address", ""),

        nativeType = "ZSTD_freeFunction"
    )
}

val ZSTD_customMem = struct(Module.ZSTD, "ZSTDCustomMem", nativeName = "ZSTD_customMem") {
    ZSTD_allocFunction.member("customAlloc", "")
    ZSTD_freeFunction.member("customFree", "")
    opaque_p.member("opaque", "")
}

val ZSTD_frameHeader = struct(Module.ZSTD, "ZSTDFrameHeader", nativeName = "ZSTD_frameHeader", mutable = false) {
    unsigned_long_long.member("frameContentSize", "if #CONTENTSIZE_UNKNOWN, it means this field is not available. 0 means \"empty\"")
    unsigned_long_long.member("windowSize", "can be very large, up to &le; {@code frameContentSize}")
    unsigned.member("blockSizeMax", "")
    ZSTD_frameType_e.member("frameType", "if #skippableFrame, {@code frameContentSize} is the size of skippable content")
    unsigned.member("headerSize", "")
    unsigned.member("dictID", "")
    unsigned.member("checksumFlag", "")
}

val ZSTD_frameProgression = struct(Module.ZSTD, "ZSTDFrameProgression", nativeName = "ZSTD_frameProgression", mutable = false) {
    unsigned_long_long.member("ingested", "")
    unsigned_long_long.member("consumed", "")
    unsigned_long_long.member("produced", "")
}

// zstd_errors.h

val ZSTD_ErrorCode = "ZSTD_ErrorCode".enumType