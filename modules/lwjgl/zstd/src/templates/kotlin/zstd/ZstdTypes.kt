/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package zstd

import org.lwjgl.generator.*

val ZSTD_CCtx = "ZSTD_CCtx".opaque
val ZSTD_CCtx_params = "ZSTD_CCtx_params".opaque
val ZSTD_CDict = "ZSTD_CDict".opaque
val ZSTD_CStream = typedef(ZSTD_CCtx, "ZSTD_CStream")
val ZSTD_DCtx = "ZSTD_DCtx".opaque
val ZSTD_DDict = "ZSTD_DDict".opaque
val ZSTD_DStream = typedef(ZSTD_DCtx, "ZSTD_DStream")
val ZSTD_threadPool = "ZSTD_threadPool".opaque

val ZSTD_ErrorCode = "ZSTD_ErrorCode".enumType

val ZSTD_EndDirective = "ZSTD_EndDirective".enumType
val ZSTD_ResetDirective = "ZSTD_ResetDirective".enumType
val ZSTD_cParameter = "ZSTD_cParameter".enumType
val ZSTD_dParameter = "ZSTD_dParameter".enumType
val ZSTD_dictAttachPref_e = "ZSTD_dictAttachPref_e".enumType
val ZSTD_dictContentType_e = "ZSTD_dictContentType_e".enumType
val ZSTD_dictLoadMethod_e = "ZSTD_dictLoadMethod_e".enumType
val ZSTD_format_e = "ZSTD_format_e".enumType
val ZSTD_frameType_e = "ZSTD_frameType_e".enumType
val ZSTD_nextInputType_e = "ZSTD_nextInputType_e".enumType
val ZSTD_strategy = "ZSTD_strategy".enumType

val ZSTD_inBuffer = struct(Module.ZSTD, "ZSTDInBuffer", nativeName = "ZSTD_inBuffer") {
    void.const.p("src", "start of input buffer")
    AutoSize("src")..size_t("size", "size of input buffer")
    size_t("pos", "position where reading stopped. Will be updated. Necessarily 0 &le; {@code pos} &le; {@code size}")
}

val ZSTD_outBuffer = struct(Module.ZSTD, "ZSTDOutBuffer", nativeName = "ZSTD_outBuffer") {
    documentation = ""

    void.p("dst", "start of output buffer")
    AutoSize("dst")..size_t("size", "size of output buffer")
    size_t("pos", "position where writing stopped. Will be updated. Necessarily 0 &le; {@code pos} &le; {@code size}")
}

val ZSTD_bounds = struct(Module.ZSTD, "ZSTDBounds", nativeName = "ZSTD_bounds", mutable = false) {
    documentation = ""

    size_t("error", "")
    int("lowerBound", "")
    int("upperBound", "")
}

val ZSTD_Sequence = struct(Module.ZSTD, "ZSTDSequence", nativeName = "ZSTD_Sequence", mutable = false) {
    unsigned_int(
        "offset",
        """
        the offset of the match. (NOT the same as the offset code)

        If {@code offset == 0} and {@code matchLength == 0}, this sequence represents the last literals in the block of {@code litLength} size.
        """
    )
    unsigned_int("litLength", "literal length of the sequence")
    unsigned_int(
        "matchLength",
        """
        match length of the sequence.
        
        Note: Users of this API may provide a sequence with {@code matchLength == litLength == offset == 0}. In this case, we will treat the sequence as a
        marker for a block boundary.
        """
    )
    unsigned_int(
        "rep",
        """
        Represents which repeat offset is represented by the field {@code offset}. Ranges from {@code [0, 3]}.

        Repeat offsets are essentially previous offsets from previous sequences sorted in recency order. For more detail, see
        {@code doc/zstd_compression_format.md}.

        ${codeBlock("""
If rep == 0, then offset does not contain a repeat offset.
If rep > 0:
    If litLength != 0:
        rep == 1 --> offset == repeat_offset_1
        rep == 2 --> offset == repeat_offset_2
        rep == 3 --> offset == repeat_offset_3
    If litLength == 0:
        rep == 1 --> offset == repeat_offset_2
        rep == 2 --> offset == repeat_offset_3
        rep == 3 --> offset == repeat_offset_1 - 1""")}
        
        Note: This field is optional. #generateSequences() will calculate the value of {@code rep}, but repeat offsets do not necessarily need to be calculated
        from an external sequence provider's perspective. For example, #compressSequences() does not use this {@code rep} field at all (as of now).
        """
    )
}

val ZSTD_compressionParameters = struct(Module.ZSTD, "ZSTDCompressionParameters", nativeName = "ZSTD_compressionParameters") {
    documentation = ""

    unsigned_int("windowLog", "largest match distance: larger == more compression, more memory needed during decompression")
    unsigned_int("chainLog", "fully searched segment: larger == more compression, slower, more memory (useless for fast)")
    unsigned_int("hashLog", "dispatch table: larger == faster, more memory")
    unsigned_int("searchLog", "nb of searches: larger == more compression, slower")
    unsigned_int("minMatch", "match length searched: larger == faster decompression, sometimes less compression")
    unsigned_int("targetLength", "acceptable match size for optimal parser (only): larger == more compression, slower")
    ZSTD_strategy("strategy", "see {@code ZSTD_strategy} definition")
}

val ZSTD_frameParameters = struct(Module.ZSTD, "ZSTDFrameParameters", nativeName = "ZSTD_frameParameters") {
    documentation = ""

    int("contentSizeFlag", "1: content size will be in frame header (when known)")
    int("checksumFlag", "1: generate a 32-bits checksum using XXH64 algorithm at end of frame, for error detection")
    int("noDictIDFlag", "1: no {@code dictID} will be saved into frame header ({@code dictID} is only useful for dictionary compression)")
}

val ZSTD_parameters = struct(Module.ZSTD, "ZSTDParameters", nativeName = "ZSTD_parameters") {
    documentation = ""

    ZSTD_compressionParameters("cParams", "")
    ZSTD_frameParameters("fParams", "")
}

val ZSTD_allocFunction = Module.ZSTD.callback {
    void.p(
        "ZSTDAllocFunction",
        "",

        opaque_p("opaque", ""),
        size_t("size", ""),

        nativeType = "ZSTD_allocFunction"
    ) {
        documentation = "Instances of this interface may be passed to the ##ZSTDCustomMem struct."
    }
}

val ZSTD_freeFunction = Module.ZSTD.callback {
    void(
        "ZSTDFreeFunction",
        "",

        opaque_p("opaque", ""),
        void.p("address", ""),

        nativeType = "ZSTD_freeFunction"
    ) {
        documentation = "Instances of this interface may be passed to the ##ZSTDCustomMem struct."
    }
}

val ZSTD_customMem = struct(Module.ZSTD, "ZSTDCustomMem", nativeName = "ZSTD_customMem") {
    ZSTD_allocFunction("customAlloc", "")
    ZSTD_freeFunction("customFree", "")
    opaque_p("opaque", "")
}

val ZSTD_frameProgression = struct(Module.ZSTD, "ZSTDFrameProgression", nativeName = "ZSTD_frameProgression", mutable = false) {
    unsigned_long_long("ingested", "nb input bytes read and buffered")
    unsigned_long_long("consumed", "nb input bytes actually compressed")
    unsigned_long_long("produced", "nb of compressed bytes generated and buffered")
    unsigned_long_long("flushed", "nb of compressed bytes flushed: not provided; can be tracked from caller side")
    unsigned_int("currentJobID", "mT only: latest started job nb")
    unsigned_int("nbActiveWorkers", "mT only: nb of workers actively compressing at probe time")
}

val ZSTD_frameHeader = struct(Module.ZSTD, "ZSTDFrameHeader", nativeName = "ZSTD_frameHeader", mutable = false) {
    unsigned_long_long("frameContentSize", "if == #CONTENTSIZE_UNKNOWN, it means this field is not available. 0 means \"empty\"")
    unsigned_long_long("windowSize", "can be very large, up to &le; {@code frameContentSize}")
    unsigned_int("blockSizeMax", "")
    ZSTD_frameType_e("frameType", "if == #skippableFrame, {@code frameContentSize} is the size of skippable content")
    unsigned_int("headerSize", "")
    unsigned_int("dictID", "")
    unsigned_int("checksumFlag", "")
}