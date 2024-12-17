/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Zdict {

    static { LibZstd.initialize(); }

    public static final int
        ZDICT_CONTENTSIZE_MIN = 128,
        ZDICT_DICTSIZE_MIN    = 256;

    protected Zdict() {
        throw new UnsupportedOperationException();
    }

    // --- [ ZDICT_trainFromBuffer ] ---

    /** {@code size_t ZDICT_trainFromBuffer(void * dictBuffer, size_t dictBufferCapacity, void const * samplesBuffer, size_t const * samplesSizes, unsigned int nbSamples)} */
    public static native long nZDICT_trainFromBuffer(long dictBuffer, long dictBufferCapacity, long samplesBuffer, long samplesSizes, int nbSamples);

    /** {@code size_t ZDICT_trainFromBuffer(void * dictBuffer, size_t dictBufferCapacity, void const * samplesBuffer, size_t const * samplesSizes, unsigned int nbSamples)} */
    @NativeType("size_t")
    public static long ZDICT_trainFromBuffer(@NativeType("void *") ByteBuffer dictBuffer, @NativeType("void const *") ByteBuffer samplesBuffer, @NativeType("size_t const *") PointerBuffer samplesSizes) {
        if (CHECKS) {
            if (DEBUG) {
                check(samplesBuffer, getSamplesBufferSize(samplesSizes));
            }
        }
        return nZDICT_trainFromBuffer(memAddress(dictBuffer), dictBuffer.remaining(), memAddress(samplesBuffer), memAddress(samplesSizes), samplesSizes.remaining());
    }

    // --- [ ZDICT_getDictID ] ---

    /** {@code unsigned int ZDICT_getDictID(void const * dictBuffer, size_t dictSize)} */
    public static native int nZDICT_getDictID(long dictBuffer, long dictSize);

    /** {@code unsigned int ZDICT_getDictID(void const * dictBuffer, size_t dictSize)} */
    @NativeType("unsigned int")
    public static int ZDICT_getDictID(@NativeType("void const *") ByteBuffer dictBuffer) {
        return nZDICT_getDictID(memAddress(dictBuffer), dictBuffer.remaining());
    }

    // --- [ ZDICT_isError ] ---

    /** {@code unsigned int ZDICT_isError(size_t errorCode)} */
    public static native int nZDICT_isError(long errorCode);

    /** {@code unsigned int ZDICT_isError(size_t errorCode)} */
    @NativeType("unsigned int")
    public static boolean ZDICT_isError(@NativeType("size_t") long errorCode) {
        return nZDICT_isError(errorCode) != 0;
    }

    // --- [ ZDICT_getErrorName ] ---

    /** {@code char const * ZDICT_getErrorName(size_t errorCode)} */
    public static native long nZDICT_getErrorName(long errorCode);

    /** {@code char const * ZDICT_getErrorName(size_t errorCode)} */
    @NativeType("char const *")
    public static @Nullable String ZDICT_getErrorName(@NativeType("size_t") long errorCode) {
        long __result = nZDICT_getErrorName(errorCode);
        return memASCIISafe(__result);
    }

    // --- [ ZDICT_trainFromBuffer_cover ] ---

    /** {@code size_t ZDICT_trainFromBuffer_cover(void * dictBuffer, size_t dictBufferCapacity, void const * samplesBuffer, size_t const * samplesSizes, unsigned int nbSamples, ZDICT_cover_params_t parameters)} */
    public static native long nZDICT_trainFromBuffer_cover(long dictBuffer, long dictBufferCapacity, long samplesBuffer, long samplesSizes, int nbSamples, long parameters);

    /** {@code size_t ZDICT_trainFromBuffer_cover(void * dictBuffer, size_t dictBufferCapacity, void const * samplesBuffer, size_t const * samplesSizes, unsigned int nbSamples, ZDICT_cover_params_t parameters)} */
    @NativeType("size_t")
    public static long ZDICT_trainFromBuffer_cover(@NativeType("void *") ByteBuffer dictBuffer, @NativeType("void const *") ByteBuffer samplesBuffer, @NativeType("size_t const *") PointerBuffer samplesSizes, @NativeType("ZDICT_cover_params_t") ZDICTCoverParams parameters) {
        if (CHECKS) {
            if (DEBUG) {
                check(samplesBuffer, getSamplesBufferSize(samplesSizes));
            }
        }
        return nZDICT_trainFromBuffer_cover(memAddress(dictBuffer), dictBuffer.remaining(), memAddress(samplesBuffer), memAddress(samplesSizes), samplesSizes.remaining(), parameters.address());
    }

    // --- [ ZDICT_optimizeTrainFromBuffer_cover ] ---

    /** {@code size_t ZDICT_optimizeTrainFromBuffer_cover(void * dictBuffer, size_t dictBufferCapacity, void const * samplesBuffer, size_t const * samplesSizes, unsigned int nbSamples, ZDICT_cover_params_t * parameters)} */
    public static native long nZDICT_optimizeTrainFromBuffer_cover(long dictBuffer, long dictBufferCapacity, long samplesBuffer, long samplesSizes, int nbSamples, long parameters);

    /** {@code size_t ZDICT_optimizeTrainFromBuffer_cover(void * dictBuffer, size_t dictBufferCapacity, void const * samplesBuffer, size_t const * samplesSizes, unsigned int nbSamples, ZDICT_cover_params_t * parameters)} */
    @NativeType("size_t")
    public static long ZDICT_optimizeTrainFromBuffer_cover(@NativeType("void *") ByteBuffer dictBuffer, @NativeType("void const *") ByteBuffer samplesBuffer, @NativeType("size_t const *") PointerBuffer samplesSizes, @NativeType("ZDICT_cover_params_t *") ZDICTCoverParams parameters) {
        if (CHECKS) {
            if (DEBUG) {
                check(samplesBuffer, getSamplesBufferSize(samplesSizes));
            }
        }
        return nZDICT_optimizeTrainFromBuffer_cover(memAddress(dictBuffer), dictBuffer.remaining(), memAddress(samplesBuffer), memAddress(samplesSizes), samplesSizes.remaining(), parameters.address());
    }

    // --- [ ZDICT_trainFromBuffer_fastCover ] ---

    /** {@code size_t ZDICT_trainFromBuffer_fastCover(void * dictBuffer, size_t dictBufferCapacity, void const * samplesBuffer, size_t const * samplesSizes, unsigned nbSamples, ZDICT_fastCover_params_t parameters)} */
    public static native long nZDICT_trainFromBuffer_fastCover(long dictBuffer, long dictBufferCapacity, long samplesBuffer, long samplesSizes, int nbSamples, long parameters);

    /** {@code size_t ZDICT_trainFromBuffer_fastCover(void * dictBuffer, size_t dictBufferCapacity, void const * samplesBuffer, size_t const * samplesSizes, unsigned nbSamples, ZDICT_fastCover_params_t parameters)} */
    @NativeType("size_t")
    public static long ZDICT_trainFromBuffer_fastCover(@NativeType("void *") ByteBuffer dictBuffer, @NativeType("void const *") ByteBuffer samplesBuffer, @NativeType("size_t const *") PointerBuffer samplesSizes, @NativeType("ZDICT_fastCover_params_t") ZDICTFastCoverParams parameters) {
        if (CHECKS) {
            if (DEBUG) {
                check(samplesBuffer, getSamplesBufferSize(samplesSizes));
            }
        }
        return nZDICT_trainFromBuffer_fastCover(memAddress(dictBuffer), dictBuffer.remaining(), memAddress(samplesBuffer), memAddress(samplesSizes), samplesSizes.remaining(), parameters.address());
    }

    // --- [ ZDICT_optimizeTrainFromBuffer_fastCover ] ---

    /** {@code size_t ZDICT_optimizeTrainFromBuffer_fastCover(void * dictBuffer, size_t dictBufferCapacity, void const * samplesBuffer, size_t const * samplesSizes, unsigned int nbSamples, ZDICT_fastCover_params_t * parameters)} */
    public static native long nZDICT_optimizeTrainFromBuffer_fastCover(long dictBuffer, long dictBufferCapacity, long samplesBuffer, long samplesSizes, int nbSamples, long parameters);

    /** {@code size_t ZDICT_optimizeTrainFromBuffer_fastCover(void * dictBuffer, size_t dictBufferCapacity, void const * samplesBuffer, size_t const * samplesSizes, unsigned int nbSamples, ZDICT_fastCover_params_t * parameters)} */
    @NativeType("size_t")
    public static long ZDICT_optimizeTrainFromBuffer_fastCover(@NativeType("void *") ByteBuffer dictBuffer, @NativeType("void const *") ByteBuffer samplesBuffer, @NativeType("size_t const *") PointerBuffer samplesSizes, @NativeType("ZDICT_fastCover_params_t *") ZDICTFastCoverParams parameters) {
        if (CHECKS) {
            if (DEBUG) {
                check(samplesBuffer, getSamplesBufferSize(samplesSizes));
            }
        }
        return nZDICT_optimizeTrainFromBuffer_fastCover(memAddress(dictBuffer), dictBuffer.remaining(), memAddress(samplesBuffer), memAddress(samplesSizes), samplesSizes.remaining(), parameters.address());
    }

    // --- [ ZDICT_finalizeDictionary ] ---

    /** {@code size_t ZDICT_finalizeDictionary(void * dictBuffer, size_t dictBufferCapacity, void const * dictContent, size_t dictContentSize, void const * samplesBuffer, size_t const * samplesSizes, unsigned int nbSamples, ZDICT_params_t parameters)} */
    public static native long nZDICT_finalizeDictionary(long dictBuffer, long dictBufferCapacity, long dictContent, long dictContentSize, long samplesBuffer, long samplesSizes, int nbSamples, long parameters);

    /** {@code size_t ZDICT_finalizeDictionary(void * dictBuffer, size_t dictBufferCapacity, void const * dictContent, size_t dictContentSize, void const * samplesBuffer, size_t const * samplesSizes, unsigned int nbSamples, ZDICT_params_t parameters)} */
    @NativeType("size_t")
    public static long ZDICT_finalizeDictionary(@NativeType("void *") ByteBuffer dictBuffer, @NativeType("void const *") ByteBuffer dictContent, @NativeType("void const *") ByteBuffer samplesBuffer, @NativeType("size_t const *") PointerBuffer samplesSizes, @NativeType("ZDICT_params_t") ZDICTParams parameters) {
        if (CHECKS) {
            if (DEBUG) {
                check(samplesBuffer, getSamplesBufferSize(samplesSizes));
            }
        }
        return nZDICT_finalizeDictionary(memAddress(dictBuffer), dictBuffer.remaining(), memAddress(dictContent), dictContent.remaining(), memAddress(samplesBuffer), memAddress(samplesSizes), samplesSizes.remaining(), parameters.address());
    }

    private static long getSamplesBufferSize(PointerBuffer samplesSizes) {
        long bytes = 0L;
        for (int i = 0; i < samplesSizes.remaining(); i++) {
            bytes += samplesSizes.get(i);
        }
        return bytes;
    }

}