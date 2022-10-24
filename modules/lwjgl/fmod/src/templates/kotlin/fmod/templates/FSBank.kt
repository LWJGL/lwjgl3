/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package fmod.templates

import org.lwjgl.generator.*
import fmod.*

val FSBank = "FSBank".nativeClass(
    Module.FMOD,
    prefix = "FSBANK_",
    prefixMethod = "FSBank_",
    binding = simpleBinding(Module.FMOD, libraryName = "FSBANK", libraryExpression = "Configuration.FMOD_FSBANK_LIBRARY_NAME, \"fsbank\"")
) {

    IntConstant("", "INIT_NORMAL"..0x00000000)
    IntConstant("", "INIT_IGNOREERRORS"..0x00000001)
    IntConstant("", "INIT_WARNINGSASERRORS"..0x00000002)
    IntConstant("", "INIT_CREATEINCLUDEHEADER"..0x00000004)
    IntConstant("", "INIT_DONTLOADCACHEFILES"..0x00000008)
    IntConstant("", "INIT_GENERATEPROGRESSITEMS"..0x00000010)

    IntConstant("", "BUILD_DEFAULT"..0x00000000)
    IntConstant("", "BUILD_DISABLESYNCPOINTS"..0x00000001)
    IntConstant("", "BUILD_DONTLOOP"..0x00000002)
    IntConstant("", "BUILD_FILTERHIGHFREQ"..0x00000004)
    IntConstant("", "BUILD_DISABLESEEKING"..0x00000008)
    IntConstant("", "BUILD_OPTIMIZESAMPLERATE"..0x00000010)
    IntConstant("", "BUILD_FSB5_DONTWRITENAMES"..0x00000080)
    IntConstant("", "BUILD_NOGUID"..0x00000100)
    IntConstant("", "BUILD_WRITEPEAKVOLUME"..0x00000200)

    IntConstant("", "BUILD_OVERRIDE_MASK".."FSBANK_BUILD_DISABLESYNCPOINTS | FSBANK_BUILD_DONTLOOP | FSBANK_BUILD_FILTERHIGHFREQ | FSBANK_BUILD_DISABLESEEKING | FSBANK_BUILD_OPTIMIZESAMPLERATE | FSBANK_BUILD_WRITEPEAKVOLUME")
    IntConstant("", "BUILD_CACHE_VALIDATION_MASK".."FSBANK_BUILD_DONTLOOP | FSBANK_BUILD_FILTERHIGHFREQ | FSBANK_BUILD_OPTIMIZESAMPLERATE")

    EnumConstant(
        "{@code FSBANK_RESULT}",

        "OK".enum("", "0"),
        "ERR_CACHE_CHUNKNOTFOUND".enum,
        "ERR_CANCELLED".enum,
        "ERR_CANNOT_CONTINUE".enum,
        "ERR_ENCODER".enum,
        "ERR_ENCODER_INIT".enum,
        "ERR_ENCODER_NOTSUPPORTED".enum,
        "ERR_FILE_OS".enum,
        "ERR_FILE_NOTFOUND".enum,
        "ERR_FMOD".enum,
        "ERR_INITIALIZED".enum,
        "ERR_INVALID_FORMAT".enum,
        "ERR_INVALID_PARAM".enum,
        "ERR_MEMORY".enum,
        "ERR_UNINITIALIZED".enum,
        "ERR_WRITER_FORMAT".enum,
        "WARN_CANNOTLOOP".enum,
        "WARN_IGNORED_FILTERHIGHFREQ".enum,
        "WARN_IGNORED_DISABLESEEKING".enum,
        "WARN_FORCED_DONTWRITENAMES".enum,
        "ERR_ENCODER_FILE_NOTFOUND".enum,
        "ERR_ENCODER_FILE_BAD".enum
    )

    EnumConstant(
        "{@code FSBANK_FORMAT}",

        "FORMAT_PCM".enum("", "0"),
        "FORMAT_XMA".enum,
        "FORMAT_AT9".enum,
        "FORMAT_VORBIS".enum,
        "FORMAT_FADPCM".enum,
        "FORMAT_OPUS".enum,
        "FORMAT_MAX".enum
    )

    EnumConstant(
        "{@code FSBANK_FSBVERSION}",

        "FSBVERSION_FSB5".enum("", "0"),
        "FSBVERSION_MAX".enum
    )

    EnumConstant(
        "{@code FSBANK_STATE}",

        "STATE_DECODING".enum("", "0"),
        "STATE_ANALYSING".enum,
        "STATE_PREPROCESSING".enum,
        "STATE_ENCODING".enum,
        "STATE_WRITING".enum,
        "STATE_FINISHED".enum,
        "STATE_FAILED".enum,
        "STATE_WARNING".enum
    )

    FSBANK_RESULT(
        "MemoryInit",
        "",

        nullable..FSBANK_MEMORY_ALLOC_CALLBACK("userAlloc", ""),
        nullable..FSBANK_MEMORY_REALLOC_CALLBACK("userRealloc", ""),
        nullable..FSBANK_MEMORY_FREE_CALLBACK("userFree", "")
    )

    FSBANK_RESULT(
        "Init",
        "",

        FSBANK_FSBVERSION("version", ""),
        FSBANK_INITFLAGS("flags", ""),
        unsigned_int("numSimultaneousJobs", ""),
        nullable..charUTF8.const.p("cacheDirectory", "")
    )

    FSBANK_RESULT(
        "Release",
        "",

        void()
    )

    FSBANK_RESULT(
        "Build",
        "",

        FSBANK_SUBSOUND.const.p("subSounds", ""),
        unsigned_int("numSubSounds", ""),
        FSBANK_FORMAT("encodeFormat", ""),
        FSBANK_BUILDFLAGS("buildFlags", ""),
        unsigned_int("quality", ""),
        nullable..charUTF8.const.p("encryptKey", ""),
        nullable..charUTF8.const.p("outputFileName", "")
    )

    FSBANK_RESULT(
        "FetchFSBMemory",
        "",

        Check(1)..void.const.p.p("data", ""),
        Check(1)..unsigned_int.p("length", "")
    )

    FSBANK_RESULT(
        "BuildCancel",
        "",

        void()
    )

    FSBANK_RESULT(
        "FetchNextProgressItem",
        "",

        Check(1)..FSBANK_PROGRESSITEM.const.p.p("progressItem", "")
    )

    FSBANK_RESULT(
        "ReleaseProgressItem",
        "",

        FSBANK_PROGRESSITEM.const.p("progressItem", "")
    )

    FSBANK_RESULT(
        "MemoryGetStats",
        "",

        nullable..Check(1)..unsigned_int.p("currentAllocated", ""),
        nullable..Check(1)..unsigned_int.p("maximumAllocated", "")
    )
}
