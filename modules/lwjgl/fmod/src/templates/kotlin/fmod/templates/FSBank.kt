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
    binding = simpleBinding(
        Module.FMOD,
        libraryName = "FSBANK",
        libraryExpression = "Configuration.FMOD_FSBANK_LIBRARY_NAME, \"fsbank\"",
        preamble = """
    static {
        // Make sure fmod is loaded first, fsbank depends on it.
        FMOD.getLibrary();
    }""")
) {

    IntConstant(
        "INIT_NORMAL"..0x00000000,
        "INIT_IGNOREERRORS"..0x00000001,
        "INIT_WARNINGSASERRORS"..0x00000002,
        "INIT_CREATEINCLUDEHEADER"..0x00000004,
        "INIT_DONTLOADCACHEFILES"..0x00000008,
        "INIT_GENERATEPROGRESSITEMS"..0x00000010
    )

    IntConstant(
        "BUILD_DEFAULT"..0x00000000,
        "BUILD_DISABLESYNCPOINTS"..0x00000001,
        "BUILD_DONTLOOP"..0x00000002,
        "BUILD_FILTERHIGHFREQ"..0x00000004,
        "BUILD_DISABLESEEKING"..0x00000008,
        "BUILD_OPTIMIZESAMPLERATE"..0x00000010,
        "BUILD_FSB5_DONTWRITENAMES"..0x00000080,
        "BUILD_NOGUID"..0x00000100,
        "BUILD_WRITEPEAKVOLUME"..0x00000200,
        "BUILD_ALIGN4K"..0x00000400,
        "BUILD_OVERRIDE_MASK".."FSBANK_BUILD_DISABLESYNCPOINTS | FSBANK_BUILD_DONTLOOP | FSBANK_BUILD_FILTERHIGHFREQ | FSBANK_BUILD_DISABLESEEKING | FSBANK_BUILD_OPTIMIZESAMPLERATE | FSBANK_BUILD_WRITEPEAKVOLUME",
        "BUILD_CACHE_VALIDATION_MASK".."FSBANK_BUILD_DONTLOOP | FSBANK_BUILD_FILTERHIGHFREQ | FSBANK_BUILD_OPTIMIZESAMPLERATE"
    )

    EnumConstant(
        "OK".enum("0"),
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
        "ERR_ENCODER_FILE_BAD".enum,
        "WARN_IGNORED_ALIGN4K".enum
    )

    EnumConstant(
        "FORMAT_PCM".enum("0"),
        "FORMAT_XMA".enum,
        "FORMAT_AT9".enum,
        "FORMAT_VORBIS".enum,
        "FORMAT_FADPCM".enum,
        "FORMAT_OPUS".enum,
        "FORMAT_MAX".enum
    )

    EnumConstant(
        "FSBVERSION_FSB5".enum("0"),
        "FSBVERSION_MAX".enum
    )

    EnumConstant(
        "STATE_DECODING".enum("0"),
        "STATE_ANALYSING".enum,
        "STATE_PREPROCESSING".enum,
        "STATE_ENCODING".enum,
        "STATE_WRITING".enum,
        "STATE_FINISHED".enum,
        "STATE_FAILED".enum,
        "STATE_WARNING".enum
    )

    customMethod("""
    public static String FSBank_ErrorString(@NativeType("FSBANK_RESULT") int result) {
        switch (result) {
            case FSBANK_OK:                                 return "No errors.";
            case FSBANK_ERR_CACHE_CHUNKNOTFOUND:            return "An expected chunk is missing from the cache, perhaps try deleting cache files.";
            case FSBANK_ERR_CANCELLED:                      return "The build process was cancelled during compilation by the user.";
            case FSBANK_ERR_CANNOT_CONTINUE:                return "The build process cannot continue due to previously ignored errors.";
            case FSBANK_ERR_ENCODER:                        return "Encoder for chosen format has encountered an unexpected error.";
            case FSBANK_ERR_ENCODER_INIT:                   return "Encoder initialization failed.";
            case FSBANK_ERR_ENCODER_NOTSUPPORTED:           return "Encoder for chosen format is not supported on this platform.";
            case FSBANK_ERR_FILE_OS:                        return "An operating system based file error was encountered.";
            case FSBANK_ERR_FILE_NOTFOUND:                  return "A specified file could not be found.";
            case FSBANK_ERR_FMOD:                           return "Internal error from FMOD sub-system.";
            case FSBANK_ERR_INITIALIZED:                    return "Already initialized.";
            case FSBANK_ERR_INVALID_FORMAT:                 return "The format of the source file is invalid.";
            case FSBANK_ERR_INVALID_PARAM:                  return "An invalid parameter has been passed to this function.";
            case FSBANK_ERR_MEMORY:                         return "Run out of memory.";
            case FSBANK_ERR_UNINITIALIZED:                  return "Not initialized yet.";
            case FSBANK_ERR_WRITER_FORMAT:                  return "Chosen encode format is not supported by this FSB version.";
            case FSBANK_WARN_CANNOTLOOP:                    return "Source file is too short for seamless looping. Looping disabled.";
            case FSBANK_WARN_IGNORED_FILTERHIGHFREQ:        return "FSBANK_BUILD_FILTERHIGHFREQ flag ignored: feature only supported by XMA format.";
            case FSBANK_WARN_IGNORED_DISABLESEEKING:        return "FSBANK_BUILD_DISABLESEEKING flag ignored: feature only supported by XMA format.";
            case FSBANK_WARN_FORCED_DONTWRITENAMES:         return "FSBANK_BUILD_FSB5_DONTWRITENAMES flag forced: cannot write names when source is from memory.";
            case FSBANK_ERR_ENCODER_FILE_NOTFOUND:          return "External encoder dynamic library not found.";
            case FSBANK_ERR_ENCODER_FILE_BAD:               return "External encoder dynamic library could not be loaded, possibly incorrect binary format, incorrect architecture, or file corruption.";
            case FSBANK_WARN_IGNORED_ALIGN4K:               return "FSBANK_BUILD_ALIGN4K flag ignored: feature only supported by Opus, Vorbis, and FADPCM formats.";
            default:                                        return "Unknown error.";
        }
    }""")

    FSBANK_RESULT(
        "MemoryInit",

        nullable..FSBANK_MEMORY_ALLOC_CALLBACK("userAlloc"),
        nullable..FSBANK_MEMORY_REALLOC_CALLBACK("userRealloc"),
        nullable..FSBANK_MEMORY_FREE_CALLBACK("userFree")
    )

    FSBANK_RESULT(
        "Init",

        FSBANK_FSBVERSION("version"),
        FSBANK_INITFLAGS("flags"),
        unsigned_int("numSimultaneousJobs"),
        nullable..charUTF8.const.p("cacheDirectory")
    )

    FSBANK_RESULT(
        "Release",

        void()
    )

    FSBANK_RESULT(
        "Build",

        FSBANK_SUBSOUND.const.p("subSounds"),
        unsigned_int("numSubSounds"),
        FSBANK_FORMAT("encodeFormat"),
        FSBANK_BUILDFLAGS("buildFlags"),
        unsigned_int("quality"),
        nullable..charUTF8.const.p("encryptKey"),
        nullable..charUTF8.const.p("outputFileName")
    )

    FSBANK_RESULT(
        "FetchFSBMemory",

        Check(1)..void.const.p.p("data"),
        Check(1)..unsigned_int.p("length")
    )

    FSBANK_RESULT(
        "BuildCancel",

        void()
    )

    FSBANK_RESULT(
        "FetchNextProgressItem",

        Check(1)..FSBANK_PROGRESSITEM.const.p.p("progressItem")
    )

    FSBANK_RESULT(
        "ReleaseProgressItem",

        FSBANK_PROGRESSITEM.const.p("progressItem")
    )

    FSBANK_RESULT(
        "MemoryGetStats",

        nullable..Check(1)..unsigned_int.p("currentAllocated"),
        nullable..Check(1)..unsigned_int.p("maximumAllocated")
    )
}
