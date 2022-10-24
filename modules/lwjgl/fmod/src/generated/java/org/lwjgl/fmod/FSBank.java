/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class FSBank {

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

    public static final int FSBANK_INIT_NORMAL = 0x0;

    public static final int FSBANK_INIT_IGNOREERRORS = 0x1;

    public static final int FSBANK_INIT_WARNINGSASERRORS = 0x2;

    public static final int FSBANK_INIT_CREATEINCLUDEHEADER = 0x4;

    public static final int FSBANK_INIT_DONTLOADCACHEFILES = 0x8;

    public static final int FSBANK_INIT_GENERATEPROGRESSITEMS = 0x10;

    public static final int FSBANK_BUILD_DEFAULT = 0x0;

    public static final int FSBANK_BUILD_DISABLESYNCPOINTS = 0x1;

    public static final int FSBANK_BUILD_DONTLOOP = 0x2;

    public static final int FSBANK_BUILD_FILTERHIGHFREQ = 0x4;

    public static final int FSBANK_BUILD_DISABLESEEKING = 0x8;

    public static final int FSBANK_BUILD_OPTIMIZESAMPLERATE = 0x10;

    public static final int FSBANK_BUILD_FSB5_DONTWRITENAMES = 0x80;

    public static final int FSBANK_BUILD_NOGUID = 0x100;

    public static final int FSBANK_BUILD_WRITEPEAKVOLUME = 0x200;

    public static final int FSBANK_BUILD_OVERRIDE_MASK = FSBANK_BUILD_DISABLESYNCPOINTS | FSBANK_BUILD_DONTLOOP | FSBANK_BUILD_FILTERHIGHFREQ | FSBANK_BUILD_DISABLESEEKING | FSBANK_BUILD_OPTIMIZESAMPLERATE | FSBANK_BUILD_WRITEPEAKVOLUME;

    public static final int FSBANK_BUILD_CACHE_VALIDATION_MASK = FSBANK_BUILD_DONTLOOP | FSBANK_BUILD_FILTERHIGHFREQ | FSBANK_BUILD_OPTIMIZESAMPLERATE;

    /**
     * {@code FSBANK_RESULT}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FSBANK_OK OK}</li>
     * <li>{@link #FSBANK_ERR_CACHE_CHUNKNOTFOUND ERR_CACHE_CHUNKNOTFOUND}</li>
     * <li>{@link #FSBANK_ERR_CANCELLED ERR_CANCELLED}</li>
     * <li>{@link #FSBANK_ERR_CANNOT_CONTINUE ERR_CANNOT_CONTINUE}</li>
     * <li>{@link #FSBANK_ERR_ENCODER ERR_ENCODER}</li>
     * <li>{@link #FSBANK_ERR_ENCODER_INIT ERR_ENCODER_INIT}</li>
     * <li>{@link #FSBANK_ERR_ENCODER_NOTSUPPORTED ERR_ENCODER_NOTSUPPORTED}</li>
     * <li>{@link #FSBANK_ERR_FILE_OS ERR_FILE_OS}</li>
     * <li>{@link #FSBANK_ERR_FILE_NOTFOUND ERR_FILE_NOTFOUND}</li>
     * <li>{@link #FSBANK_ERR_FMOD ERR_FMOD}</li>
     * <li>{@link #FSBANK_ERR_INITIALIZED ERR_INITIALIZED}</li>
     * <li>{@link #FSBANK_ERR_INVALID_FORMAT ERR_INVALID_FORMAT}</li>
     * <li>{@link #FSBANK_ERR_INVALID_PARAM ERR_INVALID_PARAM}</li>
     * <li>{@link #FSBANK_ERR_MEMORY ERR_MEMORY}</li>
     * <li>{@link #FSBANK_ERR_UNINITIALIZED ERR_UNINITIALIZED}</li>
     * <li>{@link #FSBANK_ERR_WRITER_FORMAT ERR_WRITER_FORMAT}</li>
     * <li>{@link #FSBANK_WARN_CANNOTLOOP WARN_CANNOTLOOP}</li>
     * <li>{@link #FSBANK_WARN_IGNORED_FILTERHIGHFREQ WARN_IGNORED_FILTERHIGHFREQ}</li>
     * <li>{@link #FSBANK_WARN_IGNORED_DISABLESEEKING WARN_IGNORED_DISABLESEEKING}</li>
     * <li>{@link #FSBANK_WARN_FORCED_DONTWRITENAMES WARN_FORCED_DONTWRITENAMES}</li>
     * <li>{@link #FSBANK_ERR_ENCODER_FILE_NOTFOUND ERR_ENCODER_FILE_NOTFOUND}</li>
     * <li>{@link #FSBANK_ERR_ENCODER_FILE_BAD ERR_ENCODER_FILE_BAD}</li>
     * </ul>
     */
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
        FSBANK_ERR_ENCODER_FILE_BAD        = 21;

    /**
     * {@code FSBANK_FORMAT}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FSBANK_FORMAT_PCM FORMAT_PCM}</li>
     * <li>{@link #FSBANK_FORMAT_XMA FORMAT_XMA}</li>
     * <li>{@link #FSBANK_FORMAT_AT9 FORMAT_AT9}</li>
     * <li>{@link #FSBANK_FORMAT_VORBIS FORMAT_VORBIS}</li>
     * <li>{@link #FSBANK_FORMAT_FADPCM FORMAT_FADPCM}</li>
     * <li>{@link #FSBANK_FORMAT_OPUS FORMAT_OPUS}</li>
     * <li>{@link #FSBANK_FORMAT_MAX FORMAT_MAX}</li>
     * </ul>
     */
    public static final int
        FSBANK_FORMAT_PCM    = 0,
        FSBANK_FORMAT_XMA    = 1,
        FSBANK_FORMAT_AT9    = 2,
        FSBANK_FORMAT_VORBIS = 3,
        FSBANK_FORMAT_FADPCM = 4,
        FSBANK_FORMAT_OPUS   = 5,
        FSBANK_FORMAT_MAX    = 6;

    /**
     * {@code FSBANK_FSBVERSION}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FSBANK_FSBVERSION_FSB5 FSBVERSION_FSB5}</li>
     * <li>{@link #FSBANK_FSBVERSION_MAX FSBVERSION_MAX}</li>
     * </ul>
     */
    public static final int
        FSBANK_FSBVERSION_FSB5 = 0,
        FSBANK_FSBVERSION_MAX  = 1;

    /**
     * {@code FSBANK_STATE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FSBANK_STATE_DECODING STATE_DECODING}</li>
     * <li>{@link #FSBANK_STATE_ANALYSING STATE_ANALYSING}</li>
     * <li>{@link #FSBANK_STATE_PREPROCESSING STATE_PREPROCESSING}</li>
     * <li>{@link #FSBANK_STATE_ENCODING STATE_ENCODING}</li>
     * <li>{@link #FSBANK_STATE_WRITING STATE_WRITING}</li>
     * <li>{@link #FSBANK_STATE_FINISHED STATE_FINISHED}</li>
     * <li>{@link #FSBANK_STATE_FAILED STATE_FAILED}</li>
     * <li>{@link #FSBANK_STATE_WARNING STATE_WARNING}</li>
     * </ul>
     */
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

    public static int nFSBank_MemoryInit(long userAlloc, long userRealloc, long userFree) {
        long __functionAddress = Functions.MemoryInit;
        return callPPPI(userAlloc, userRealloc, userFree, __functionAddress);
    }

    @NativeType("FSBANK_RESULT")
    public static int FSBank_MemoryInit(@Nullable @NativeType("FSBANK_MEMORY_ALLOC_CALLBACK") FSBANK_MEMORY_ALLOC_CALLBACKI userAlloc, @Nullable @NativeType("FSBANK_MEMORY_REALLOC_CALLBACK") FSBANK_MEMORY_REALLOC_CALLBACKI userRealloc, @Nullable @NativeType("FSBANK_MEMORY_FREE_CALLBACK") FSBANK_MEMORY_FREE_CALLBACKI userFree) {
        return nFSBank_MemoryInit(memAddressSafe(userAlloc), memAddressSafe(userRealloc), memAddressSafe(userFree));
    }

    // --- [ FSBank_Init ] ---

    public static int nFSBank_Init(int version, int flags, int numSimultaneousJobs, long cacheDirectory) {
        long __functionAddress = Functions.Init;
        return callPI(version, flags, numSimultaneousJobs, cacheDirectory, __functionAddress);
    }

    @NativeType("FSBANK_RESULT")
    public static int FSBank_Init(@NativeType("FSBANK_FSBVERSION") int version, @NativeType("FSBANK_INITFLAGS") int flags, @NativeType("unsigned int") int numSimultaneousJobs, @Nullable @NativeType("char const *") ByteBuffer cacheDirectory) {
        if (CHECKS) {
            checkNT1Safe(cacheDirectory);
        }
        return nFSBank_Init(version, flags, numSimultaneousJobs, memAddressSafe(cacheDirectory));
    }

    @NativeType("FSBANK_RESULT")
    public static int FSBank_Init(@NativeType("FSBANK_FSBVERSION") int version, @NativeType("FSBANK_INITFLAGS") int flags, @NativeType("unsigned int") int numSimultaneousJobs, @Nullable @NativeType("char const *") CharSequence cacheDirectory) {
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

    @NativeType("FSBANK_RESULT")
    public static int FSBank_Release() {
        long __functionAddress = Functions.Release;
        return callI(__functionAddress);
    }

    // --- [ FSBank_Build ] ---

    public static int nFSBank_Build(long subSounds, int numSubSounds, int encodeFormat, int buildFlags, int quality, long encryptKey, long outputFileName) {
        long __functionAddress = Functions.Build;
        if (CHECKS) {
            FSBANK_SUBSOUND.validate(subSounds);
        }
        return callPPPI(subSounds, numSubSounds, encodeFormat, buildFlags, quality, encryptKey, outputFileName, __functionAddress);
    }

    @NativeType("FSBANK_RESULT")
    public static int FSBank_Build(@NativeType("FSBANK_SUBSOUND const *") FSBANK_SUBSOUND subSounds, @NativeType("unsigned int") int numSubSounds, @NativeType("FSBANK_FORMAT") int encodeFormat, @NativeType("FSBANK_BUILDFLAGS") int buildFlags, @NativeType("unsigned int") int quality, @Nullable @NativeType("char const *") ByteBuffer encryptKey, @Nullable @NativeType("char const *") ByteBuffer outputFileName) {
        if (CHECKS) {
            checkNT1Safe(encryptKey);
            checkNT1Safe(outputFileName);
        }
        return nFSBank_Build(subSounds.address(), numSubSounds, encodeFormat, buildFlags, quality, memAddressSafe(encryptKey), memAddressSafe(outputFileName));
    }

    @NativeType("FSBANK_RESULT")
    public static int FSBank_Build(@NativeType("FSBANK_SUBSOUND const *") FSBANK_SUBSOUND subSounds, @NativeType("unsigned int") int numSubSounds, @NativeType("FSBANK_FORMAT") int encodeFormat, @NativeType("FSBANK_BUILDFLAGS") int buildFlags, @NativeType("unsigned int") int quality, @Nullable @NativeType("char const *") CharSequence encryptKey, @Nullable @NativeType("char const *") CharSequence outputFileName) {
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

    public static int nFSBank_FetchFSBMemory(long data, long length) {
        long __functionAddress = Functions.FetchFSBMemory;
        return callPPI(data, length, __functionAddress);
    }

    @NativeType("FSBANK_RESULT")
    public static int FSBank_FetchFSBMemory(@NativeType("void const **") PointerBuffer data, @NativeType("unsigned int *") IntBuffer length) {
        if (CHECKS) {
            check(data, 1);
            check(length, 1);
        }
        return nFSBank_FetchFSBMemory(memAddress(data), memAddress(length));
    }

    // --- [ FSBank_BuildCancel ] ---

    @NativeType("FSBANK_RESULT")
    public static int FSBank_BuildCancel() {
        long __functionAddress = Functions.BuildCancel;
        return callI(__functionAddress);
    }

    // --- [ FSBank_FetchNextProgressItem ] ---

    public static int nFSBank_FetchNextProgressItem(long progressItem) {
        long __functionAddress = Functions.FetchNextProgressItem;
        return callPI(progressItem, __functionAddress);
    }

    @NativeType("FSBANK_RESULT")
    public static int FSBank_FetchNextProgressItem(@NativeType("FSBANK_PROGRESSITEM const **") PointerBuffer progressItem) {
        if (CHECKS) {
            check(progressItem, 1);
        }
        return nFSBank_FetchNextProgressItem(memAddress(progressItem));
    }

    // --- [ FSBank_ReleaseProgressItem ] ---

    public static int nFSBank_ReleaseProgressItem(long progressItem) {
        long __functionAddress = Functions.ReleaseProgressItem;
        return callPI(progressItem, __functionAddress);
    }

    @NativeType("FSBANK_RESULT")
    public static int FSBank_ReleaseProgressItem(@NativeType("FSBANK_PROGRESSITEM const *") FSBANK_PROGRESSITEM progressItem) {
        return nFSBank_ReleaseProgressItem(progressItem.address());
    }

    // --- [ FSBank_MemoryGetStats ] ---

    public static int nFSBank_MemoryGetStats(long currentAllocated, long maximumAllocated) {
        long __functionAddress = Functions.MemoryGetStats;
        return callPPI(currentAllocated, maximumAllocated, __functionAddress);
    }

    @NativeType("FSBANK_RESULT")
    public static int FSBank_MemoryGetStats(@Nullable @NativeType("unsigned int *") IntBuffer currentAllocated, @Nullable @NativeType("unsigned int *") IntBuffer maximumAllocated) {
        if (CHECKS) {
            checkSafe(currentAllocated, 1);
            checkSafe(maximumAllocated, 1);
        }
        return nFSBank_MemoryGetStats(memAddressSafe(currentAllocated), memAddressSafe(maximumAllocated));
    }

}