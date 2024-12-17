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
    LZ4F_blockSizeID_t("blockSizeID")
    LZ4F_blockMode_t("blockMode")
    LZ4F_contentChecksum_t("contentChecksumFlag")
    LZ4F_frameType_t("frameType")
    unsigned_long_long("contentSize")
    unsigned("dictID")
    LZ4F_blockChecksum_t("blockChecksumFlag")
}

val LZ4F_preferences_t = struct(Module.LZ4, "LZ4FPreferences", nativeName = "LZ4F_preferences_t") {
    LZ4F_frameInfo_t("frameInfo")
    int("compressionLevel")
    unsignedb("autoFlush")
    unsignedb("favorDecSpeed")
    unsigned("reserved")[3]
}

val LZ4F_compressOptions_t = struct(Module.LZ4, "LZ4FCompressOptions", nativeName = "LZ4F_compressOptions_t") {
    unsigned("stableSrc")
    unsigned("reserved")[3]
}

val LZ4F_decompressOptions_t = struct(Module.LZ4, "LZ4FDecompressOptions", nativeName = "LZ4F_decompressOptions_t") {
    unsigned("stableDst")
    unsigned("skipChecksums")
    unsigned("reserved1")
    unsigned("reserved0")
}

val LZ4F_AllocFunction = Module.LZ4.callback {
    void.p(
        "LZ4FAllocFunction",

        opaque_p("opaqueState"),
        size_t("size"),

        nativeType = "LZ4F_AllocFunction"
    )
}

val LZ4F_CallocFunction = Module.LZ4.callback {
    void.p(
        "LZ4FCallocFunction",

        opaque_p("opaqueState"),
        size_t("size"),

        nativeType = "LZ4F_CallocFunction"
    )
}

val LZ4F_FreeFunction = Module.LZ4.callback {
    void.p(
        "LZ4FFreeFunction",

        opaque_p("opaqueState"),
        void.p("address"),

        nativeType = "LZ4F_FreeFunction"
    )
}

val LZ4F_CustomMem = struct(Module.LZ4, "LZ4FCustomMem", nativeName = "LZ4F_CustomMem") {
    LZ4F_AllocFunction("customAlloc")
    nullable..LZ4F_CallocFunction("customCalloc")
    LZ4F_FreeFunction("customFree")
    opaque_p("opaqueState");
}

// lz4frame_static.h

val LZ4F_errorCodes = "LZ4F_errorCodes".enumType

val LZ4F_CDict = "LZ4F_CDict".opaque

// lz4hc.h

val LZ4_streamHC_t = "LZ4_streamHC_t".opaque