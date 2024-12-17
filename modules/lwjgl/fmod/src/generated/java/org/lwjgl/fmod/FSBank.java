/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class FSBank {

    static {
        // Make sure fmod is loaded first, fsbank depends on it.
        FMOD.getLibrary();
    }

    private static final SharedLibrary FSBANK = Library.loadNative(FSBank.class, "org.lwjgl.fmod", Configuration.FMOD_FSBANK_LIBRARY_NAME, "fsbank");

    /** Contains the function pointers loaded from the FSBANK {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MemoryInit            = apiGetFunctionAddress(FSBANK, "FSBank_MemoryInit"),
            Init                  = apiGetFunctionAddress(FSBANK, "FSBank_Init"),
            Release               = apiGetFunctionAddress(FSBANK, "FSBank_Release"),
            Build                 = apiGetFunctionAddress(FSBANK, "FSBank_Build"),
            FetchFSBMemory        = apiGetFunctionAddress(FSBANK, "FSBank_FetchFSBMemory"),
            BuildCancel           = apiGetFunctionAddress(FSBANK, "FSBank_BuildCancel"),
            FetchNextProgressItem = apiGetFunctionAddress(FSBANK, "FSBank_FetchNextProgressItem"),
            ReleaseProgressItem   = apiGetFunctionAddress(FSBANK, "FSBank_ReleaseProgressItem"),
            MemoryGetStats        = apiGetFunctionAddress(FSBANK, "FSBank_MemoryGetStats");

    }

    /** Returns the FSBANK {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return FSBANK;
    }

    public static final int
        FSBANK_INIT_NORMAL                = 0x0,
        FSBANK_INIT_IGNOREERRORS          = 0x1,
        FSBANK_INIT_WARNINGSASERRORS      = 0x2,
        FSBANK_INIT_CREATEINCLUDEHEADER   = 0x4,
        FSBANK_INIT_DONTLOADCACHEFILES    = 0x8,
        FSBANK_INIT_GENERATEPROGRESSITEMS = 0x10;

    public static final int
        FSBANK_BUILD_DEFAULT               = 0x0,
        FSBANK_BUILD_DISABLESYNCPOINTS     = 0x1,
        FSBANK_BUILD_DONTLOOP              = 0x2,
        FSBANK_BUILD_FILTERHIGHFREQ        = 0x4,
        FSBANK_BUILD_DISABLESEEKING        = 0x8,
        FSBANK_BUILD_OPTIMIZESAMPLERATE    = 0x10,
        FSBANK_BUILD_FSB5_DONTWRITENAMES   = 0x80,
        FSBANK_BUILD_NOGUID                = 0x100,
        FSBANK_BUILD_WRITEPEAKVOLUME       = 0x200,
        FSBANK_BUILD_ALIGN4K               = 0x400,
        FSBANK_BUILD_OVERRIDE_MASK         = FSBANK_BUILD_DISABLESYNCPOINTS | FSBANK_BUILD_DONTLOOP | FSBANK_BUILD_FILTERHIGHFREQ | FSBANK_BUILD_DISABLESEEKING | FSBANK_BUILD_OPTIMIZESAMPLERATE | FSBANK_BUILD_WRITEPEAKVOLUME,
        FSBANK_BUILD_CACHE_VALIDATION_MASK = FSBANK_BUILD_DONTLOOP | FSBANK_BUILD_FILTERHIGHFREQ | FSBANK_BUILD_OPTIMIZESAMPLERATE;

    public static final int
        FSBANK_OK                          = 0,
        FSBANK_ERR_CACHE_CHUNKNOTFOUND     = 1,
        FSBANK_ERR_CANCELLED               = 2,
        FSBANK_ERR_CANNOT_CONTINUE         = 3,
        FSBANK_ERR_ENCODER                 = 4,
        FSBANK_ERR_ENCODER_INIT            = 5,
        FSBANK_ERR_ENCODER_NOTSUPPORTED    = 6,
        FSBANK_ERR_FILE_OS                 = 7,
        FSBANK_ERR_FILE_NOTFOUND           = 8,
        FSBANK_ERR_FMOD                    = 9,
        FSBANK_ERR_INITIALIZED             = 10,
        FSBANK_ERR_INVALID_FORMAT          = 11,
        FSBANK_ERR_INVALID_PARAM           = 12,
        FSBANK_ERR_MEMORY                  = 13,
        FSBANK_ERR_UNINITIALIZED           = 14,
        FSBANK_ERR_WRITER_FORMAT           = 15,
        FSBANK_WARN_CANNOTLOOP             = 16,
        FSBANK_WARN_IGNORED_FILTERHIGHFREQ = 17,
        FSBANK_WARN_IGNORED_DISABLESEEKING = 18,
        FSBANK_WARN_FORCED_DONTWRITENAMES  = 19,
        FSBANK_ERR_ENCODER_FILE_NOTFOUND   = 20,
        FSBANK_ERR_ENCODER_FILE_BAD        = 21,
        FSBANK_WARN_IGNORED_ALIGN4K        = 22;

    public static final int
        FSBANK_FORMAT_PCM    = 0,
        FSBANK_FORMAT_XMA    = 1,
        FSBANK_FORMAT_AT9    = 2,
        FSBANK_FORMAT_VORBIS = 3,
        FSBANK_FORMAT_FADPCM = 4,
        FSBANK_FORMAT_OPUS   = 5,
        FSBANK_FORMAT_MAX    = 6;

    public static final int
        FSBANK_FSBVERSION_FSB5 = 0,
        FSBANK_FSBVERSION_MAX  = 1;

    public static final int
        FSBANK_STATE_DECODING      = 0,
        FSBANK_STATE_ANALYSING     = 1,
        FSBANK_STATE_PREPROCESSING = 2,
        FSBANK_STATE_ENCODING      = 3,
        FSBANK_STATE_WRITING       = 4,
        FSBANK_STATE_FINISHED      = 5,
        FSBANK_STATE_FAILED        = 6,
        FSBANK_STATE_WARNING       = 7;

    protected FSBank() {
        throw new UnsupportedOperationException();
    }

    // --- [ FSBank_MemoryInit ] ---

    /** {@code FSBANK_RESULT FSBank_MemoryInit(FSBANK_MEMORY_ALLOC_CALLBACK userAlloc, FSBANK_MEMORY_REALLOC_CALLBACK userRealloc, FSBANK_MEMORY_FREE_CALLBACK userFree)} */
    public static int nFSBank_MemoryInit(long userAlloc, long userRealloc, long userFree) {
        long __functionAddress = Functions.MemoryInit;
        return callPPPI(userAlloc, userRealloc, userFree, __functionAddress);
    }

    /** {@code FSBANK_RESULT FSBank_MemoryInit(FSBANK_MEMORY_ALLOC_CALLBACK userAlloc, FSBANK_MEMORY_REALLOC_CALLBACK userRealloc, FSBANK_MEMORY_FREE_CALLBACK userFree)} */
    @NativeType("FSBANK_RESULT")
    public static int FSBank_MemoryInit(@NativeType("FSBANK_MEMORY_ALLOC_CALLBACK") @Nullable FSBANK_MEMORY_ALLOC_CALLBACKI userAlloc, @NativeType("FSBANK_MEMORY_REALLOC_CALLBACK") @Nullable FSBANK_MEMORY_REALLOC_CALLBACKI userRealloc, @NativeType("FSBANK_MEMORY_FREE_CALLBACK") @Nullable FSBANK_MEMORY_FREE_CALLBACKI userFree) {
        return nFSBank_MemoryInit(memAddressSafe(userAlloc), memAddressSafe(userRealloc), memAddressSafe(userFree));
    }

    // --- [ FSBank_Init ] ---

    /** {@code FSBANK_RESULT FSBank_Init(FSBANK_FSBVERSION version, FSBANK_INITFLAGS flags, unsigned int numSimultaneousJobs, char const * cacheDirectory)} */
    public static int nFSBank_Init(int version, int flags, int numSimultaneousJobs, long cacheDirectory) {
        long __functionAddress = Functions.Init;
        return callPI(version, flags, numSimultaneousJobs, cacheDirectory, __functionAddress);
    }

    /** {@code FSBANK_RESULT FSBank_Init(FSBANK_FSBVERSION version, FSBANK_INITFLAGS flags, unsigned int numSimultaneousJobs, char const * cacheDirectory)} */
    @NativeType("FSBANK_RESULT")
    public static int FSBank_Init(@NativeType("FSBANK_FSBVERSION") int version, @NativeType("FSBANK_INITFLAGS") int flags, @NativeType("unsigned int") int numSimultaneousJobs, @NativeType("char const *") @Nullable ByteBuffer cacheDirectory) {
        if (CHECKS) {
            checkNT1Safe(cacheDirectory);
        }
        return nFSBank_Init(version, flags, numSimultaneousJobs, memAddressSafe(cacheDirectory));
    }

    /** {@code FSBANK_RESULT FSBank_Init(FSBANK_FSBVERSION version, FSBANK_INITFLAGS flags, unsigned int numSimultaneousJobs, char const * cacheDirectory)} */
    @NativeType("FSBANK_RESULT")
    public static int FSBank_Init(@NativeType("FSBANK_FSBVERSION") int version, @NativeType("FSBANK_INITFLAGS") int flags, @NativeType("unsigned int") int numSimultaneousJobs, @NativeType("char const *") @Nullable CharSequence cacheDirectory) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(cacheDirectory, true);
            long cacheDirectoryEncoded = cacheDirectory == null ? NULL : stack.getPointerAddress();
            return nFSBank_Init(version, flags, numSimultaneousJobs, cacheDirectoryEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FSBank_Release ] ---

    /** {@code FSBANK_RESULT FSBank_Release(void)} */
    @NativeType("FSBANK_RESULT")
    public static int FSBank_Release() {
        long __functionAddress = Functions.Release;
        return callI(__functionAddress);
    }

    // --- [ FSBank_Build ] ---

    /** {@code FSBANK_RESULT FSBank_Build(FSBANK_SUBSOUND const * subSounds, unsigned int numSubSounds, FSBANK_FORMAT encodeFormat, FSBANK_BUILDFLAGS buildFlags, unsigned int quality, char const * encryptKey, char const * outputFileName)} */
    public static int nFSBank_Build(long subSounds, int numSubSounds, int encodeFormat, int buildFlags, int quality, long encryptKey, long outputFileName) {
        long __functionAddress = Functions.Build;
        if (CHECKS) {
            FSBANK_SUBSOUND.validate(subSounds);
        }
        return callPPPI(subSounds, numSubSounds, encodeFormat, buildFlags, quality, encryptKey, outputFileName, __functionAddress);
    }

    /** {@code FSBANK_RESULT FSBank_Build(FSBANK_SUBSOUND const * subSounds, unsigned int numSubSounds, FSBANK_FORMAT encodeFormat, FSBANK_BUILDFLAGS buildFlags, unsigned int quality, char const * encryptKey, char const * outputFileName)} */
    @NativeType("FSBANK_RESULT")
    public static int FSBank_Build(@NativeType("FSBANK_SUBSOUND const *") FSBANK_SUBSOUND subSounds, @NativeType("unsigned int") int numSubSounds, @NativeType("FSBANK_FORMAT") int encodeFormat, @NativeType("FSBANK_BUILDFLAGS") int buildFlags, @NativeType("unsigned int") int quality, @NativeType("char const *") @Nullable ByteBuffer encryptKey, @NativeType("char const *") @Nullable ByteBuffer outputFileName) {
        if (CHECKS) {
            checkNT1Safe(encryptKey);
            checkNT1Safe(outputFileName);
        }
        return nFSBank_Build(subSounds.address(), numSubSounds, encodeFormat, buildFlags, quality, memAddressSafe(encryptKey), memAddressSafe(outputFileName));
    }

    /** {@code FSBANK_RESULT FSBank_Build(FSBANK_SUBSOUND const * subSounds, unsigned int numSubSounds, FSBANK_FORMAT encodeFormat, FSBANK_BUILDFLAGS buildFlags, unsigned int quality, char const * encryptKey, char const * outputFileName)} */
    @NativeType("FSBANK_RESULT")
    public static int FSBank_Build(@NativeType("FSBANK_SUBSOUND const *") FSBANK_SUBSOUND subSounds, @NativeType("unsigned int") int numSubSounds, @NativeType("FSBANK_FORMAT") int encodeFormat, @NativeType("FSBANK_BUILDFLAGS") int buildFlags, @NativeType("unsigned int") int quality, @NativeType("char const *") @Nullable CharSequence encryptKey, @NativeType("char const *") @Nullable CharSequence outputFileName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(encryptKey, true);
            long encryptKeyEncoded = encryptKey == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(outputFileName, true);
            long outputFileNameEncoded = outputFileName == null ? NULL : stack.getPointerAddress();
            return nFSBank_Build(subSounds.address(), numSubSounds, encodeFormat, buildFlags, quality, encryptKeyEncoded, outputFileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FSBank_FetchFSBMemory ] ---

    /** {@code FSBANK_RESULT FSBank_FetchFSBMemory(void const ** data, unsigned int * length)} */
    public static int nFSBank_FetchFSBMemory(long data, long length) {
        long __functionAddress = Functions.FetchFSBMemory;
        return callPPI(data, length, __functionAddress);
    }

    /** {@code FSBANK_RESULT FSBank_FetchFSBMemory(void const ** data, unsigned int * length)} */
    @NativeType("FSBANK_RESULT")
    public static int FSBank_FetchFSBMemory(@NativeType("void const **") PointerBuffer data, @NativeType("unsigned int *") IntBuffer length) {
        if (CHECKS) {
            check(data, 1);
            check(length, 1);
        }
        return nFSBank_FetchFSBMemory(memAddress(data), memAddress(length));
    }

    // --- [ FSBank_BuildCancel ] ---

    /** {@code FSBANK_RESULT FSBank_BuildCancel(void)} */
    @NativeType("FSBANK_RESULT")
    public static int FSBank_BuildCancel() {
        long __functionAddress = Functions.BuildCancel;
        return callI(__functionAddress);
    }

    // --- [ FSBank_FetchNextProgressItem ] ---

    /** {@code FSBANK_RESULT FSBank_FetchNextProgressItem(FSBANK_PROGRESSITEM const ** progressItem)} */
    public static int nFSBank_FetchNextProgressItem(long progressItem) {
        long __functionAddress = Functions.FetchNextProgressItem;
        return callPI(progressItem, __functionAddress);
    }

    /** {@code FSBANK_RESULT FSBank_FetchNextProgressItem(FSBANK_PROGRESSITEM const ** progressItem)} */
    @NativeType("FSBANK_RESULT")
    public static int FSBank_FetchNextProgressItem(@NativeType("FSBANK_PROGRESSITEM const **") PointerBuffer progressItem) {
        if (CHECKS) {
            check(progressItem, 1);
        }
        return nFSBank_FetchNextProgressItem(memAddress(progressItem));
    }

    // --- [ FSBank_ReleaseProgressItem ] ---

    /** {@code FSBANK_RESULT FSBank_ReleaseProgressItem(FSBANK_PROGRESSITEM const * progressItem)} */
    public static int nFSBank_ReleaseProgressItem(long progressItem) {
        long __functionAddress = Functions.ReleaseProgressItem;
        return callPI(progressItem, __functionAddress);
    }

    /** {@code FSBANK_RESULT FSBank_ReleaseProgressItem(FSBANK_PROGRESSITEM const * progressItem)} */
    @NativeType("FSBANK_RESULT")
    public static int FSBank_ReleaseProgressItem(@NativeType("FSBANK_PROGRESSITEM const *") FSBANK_PROGRESSITEM progressItem) {
        return nFSBank_ReleaseProgressItem(progressItem.address());
    }

    // --- [ FSBank_MemoryGetStats ] ---

    /** {@code FSBANK_RESULT FSBank_MemoryGetStats(unsigned int * currentAllocated, unsigned int * maximumAllocated)} */
    public static int nFSBank_MemoryGetStats(long currentAllocated, long maximumAllocated) {
        long __functionAddress = Functions.MemoryGetStats;
        return callPPI(currentAllocated, maximumAllocated, __functionAddress);
    }

    /** {@code FSBANK_RESULT FSBank_MemoryGetStats(unsigned int * currentAllocated, unsigned int * maximumAllocated)} */
    @NativeType("FSBANK_RESULT")
    public static int FSBank_MemoryGetStats(@NativeType("unsigned int *") @Nullable IntBuffer currentAllocated, @NativeType("unsigned int *") @Nullable IntBuffer maximumAllocated) {
        if (CHECKS) {
            checkSafe(currentAllocated, 1);
            checkSafe(maximumAllocated, 1);
        }
        return nFSBank_MemoryGetStats(memAddressSafe(currentAllocated), memAddressSafe(maximumAllocated));
    }

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
    }

}