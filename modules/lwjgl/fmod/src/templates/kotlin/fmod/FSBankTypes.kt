/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package fmod

import org.lwjgl.generator.*

val FSBANK_BUILDFLAGS = typedef(unsigned_int, "FSBANK_BUILDFLAGS")
val FSBANK_INITFLAGS = typedef(unsigned_int, "FSBANK_INITFLAGS")

val FSBANK_FORMAT = "FSBANK_FORMAT".enumType
val FSBANK_FSBVERSION = "FSBANK_FSBVERSION".enumType
val FSBANK_RESULT = "FSBANK_RESULT".enumType
val FSBANK_STATE = "FSBANK_STATE".enumType

val FSBANK_SUBSOUND = struct(Module.FMOD, "FSBANK_SUBSOUND") {
    charUTF8.const.p.const.p("fileNames")
    void.const.p.const.p("fileData")
    unsigned_int.const.p("fileDataLengths")
    AutoSize(
        "fileNames",
        "fileData",
        "fileDataLengths"
    )..unsigned_int("numFiles")
    FSBANK_BUILDFLAGS("overrideFlags")
    unsigned_int("overrideQuality")
    float("desiredSampleRate")
    float("percentOptimizedRate")
}

val FSBANK_PROGRESSITEM = struct(Module.FMOD, "FSBANK_PROGRESSITEM") {
    int("subSoundIndex")
    int("threadIndex")
    FSBANK_STATE("state")
    nullable..opaque_const_p("stateData")
}

val FSBANK_STATEDATA_FAILED = struct(Module.FMOD, "FSBANK_STATEDATA_FAILED") {
    FSBANK_RESULT("errorCode")
    charASCII("errorString")[256]
}

val FSBANK_STATEDATA_WARNING = struct(Module.FMOD, "FSBANK_STATEDATA_WARNING") {
    FSBANK_RESULT("warnCode")
    charASCII("warningString")[256]
}

val FSBANK_MEMORY_ALLOC_CALLBACK = Module.FMOD.callback {
    void.p(
        "FSBANK_MEMORY_ALLOC_CALLBACK",

        AutoSizeResult..unsigned_int("size"),
        unsigned_int("type"),
        nullable..charUTF8.const.p("sourceStr"),

        nativeType = "FSBANK_MEMORY_ALLOC_CALLBACK"
    )
}

val FSBANK_MEMORY_REALLOC_CALLBACK = Module.FMOD.callback {
    void.p(
        "FSBANK_MEMORY_REALLOC_CALLBACK",

        opaque_p("ptr"),
        AutoSizeResult..unsigned_int("size"),
        unsigned_int("type"),
        nullable..charUTF8.const.p("sourceStr"),

        nativeType = "FSBANK_MEMORY_REALLOC_CALLBACK"
    )
}

val FSBANK_MEMORY_FREE_CALLBACK = Module.FMOD.callback {
    void(
        "FSBANK_MEMORY_FREE_CALLBACK",

        opaque_p("ptr"),
        unsigned_int("type"),
        nullable..charUTF8.const.p("sourceStr"),

        nativeType = "FSBANK_MEMORY_FREE_CALLBACK"
    )
}
