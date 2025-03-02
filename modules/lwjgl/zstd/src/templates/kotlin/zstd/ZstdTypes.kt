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
val ZSTD_FrameType_e = "ZSTD_FrameType_e".enumType
val ZSTD_nextInputType_e = "ZSTD_nextInputType_e".enumType
val ZSTD_strategy = "ZSTD_strategy".enumType

val ZSTD_inBuffer = struct(Module.ZSTD, "ZSTDInBuffer", nativeName = "ZSTD_inBuffer") {
    void.const.p("src")
    AutoSize("src")..size_t("size")
    size_t("pos")
}

val ZSTD_outBuffer = struct(Module.ZSTD, "ZSTDOutBuffer", nativeName = "ZSTD_outBuffer") {
    void.p("dst")
    AutoSize("dst")..size_t("size")
    size_t("pos")
}

val ZSTD_bounds = struct(Module.ZSTD, "ZSTDBounds", nativeName = "ZSTD_bounds", mutable = false) {
    size_t("error")
    int("lowerBound")
    int("upperBound")
}

val ZSTD_Sequence = struct(Module.ZSTD, "ZSTDSequence", nativeName = "ZSTD_Sequence", mutable = false) {
    unsigned_int("offset")
    unsigned_int("litLength")
    unsigned_int("matchLength")
    unsigned_int("rep")
}

val ZSTD_compressionParameters = struct(Module.ZSTD, "ZSTDCompressionParameters", nativeName = "ZSTD_compressionParameters") {
    unsigned_int("windowLog")
    unsigned_int("chainLog")
    unsigned_int("hashLog")
    unsigned_int("searchLog")
    unsigned_int("minMatch")
    unsigned_int("targetLength")
    ZSTD_strategy("strategy")
}

val ZSTD_frameParameters = struct(Module.ZSTD, "ZSTDFrameParameters", nativeName = "ZSTD_frameParameters") {
    int("contentSizeFlag")
    int("checksumFlag")
    int("noDictIDFlag")
}

val ZSTD_parameters = struct(Module.ZSTD, "ZSTDParameters", nativeName = "ZSTD_parameters") {
    ZSTD_compressionParameters("cParams")
    ZSTD_frameParameters("fParams")
}

val ZSTD_allocFunction = Module.ZSTD.callback {
    void.p(
        "ZSTDAllocFunction",

        opaque_p("opaque"),
        size_t("size"),

        nativeType = "ZSTD_allocFunction"
    ) {
    }
}

val ZSTD_freeFunction = Module.ZSTD.callback {
    void(
        "ZSTDFreeFunction",

        opaque_p("opaque"),
        void.p("address"),

        nativeType = "ZSTD_freeFunction"
    ) {
    }
}

val ZSTD_customMem = struct(Module.ZSTD, "ZSTDCustomMem", nativeName = "ZSTD_customMem") {
    ZSTD_allocFunction("customAlloc")
    ZSTD_freeFunction("customFree")
    opaque_p("opaque")
}

val ZSTD_frameProgression = struct(Module.ZSTD, "ZSTDFrameProgression", nativeName = "ZSTD_frameProgression", mutable = false) {
    unsigned_long_long("ingested")
    unsigned_long_long("consumed")
    unsigned_long_long("produced")
    unsigned_long_long("flushed")
    unsigned_int("currentJobID")
    unsigned_int("nbActiveWorkers")
}

val ZSTD_FrameHeader = struct(Module.ZSTD, "ZSTDFrameHeader", nativeName = "ZSTD_FrameHeader", mutable = false) {
    unsigned_long_long("frameContentSize")
    unsigned_long_long("windowSize")
    unsigned_int("blockSizeMax")
    ZSTD_FrameType_e("frameType")
    unsigned_int("headerSize")
    unsigned_int("dictID")
    unsigned_int("checksumFlag")
    unsigned("_reserved1").private()
    unsigned("_reserved2").private()
}

val ZSTD_sequenceProducer_F = Module.ZSTD.callback {
    void.p(
        "ZSTDSequenceProducer",

        nullable..opaque_p("sequenceProducerState"),
        ZSTD_Sequence.p("outSeqs"),
        AutoSize("outSeqs")..size_t("outSeqsCapacity"),
        void.const.p("src"),
        AutoSize("src")..size_t("srcSize"),
        void.const.p("dict"),
        AutoSize("dict")..size_t("dictSize"),
        int("compressionLevel"),
        size_t("windowSize"),

        nativeType = "ZSTD_sequenceProducer_F"
    )
}