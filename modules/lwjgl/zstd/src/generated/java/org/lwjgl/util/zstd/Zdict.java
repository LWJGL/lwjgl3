/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the dictionary builder API of <a target="_blank" href="http://facebook.github.io/zstd/">Zstandard</a> (zstd). */
public class Zdict {

    public static final int
        ZDICT_CONTENTSIZE_MIN = 128,
        ZDICT_DICTSIZE_MIN    = 256;

    static { LibZstd.initialize(); }

    protected Zdict() {
        throw new UnsupportedOperationException();
    }

    // --- [ ZDICT_trainFromBuffer ] ---

    /** Unsafe version of: {@link #ZDICT_trainFromBuffer trainFromBuffer} */
    public static native long nZDICT_trainFromBuffer(long dictBuffer, long dictBufferCapacity, long samplesBuffer, long samplesSizes, int nbSamples);

    /**
     * Train a dictionary from an array of samples.
     * 
     * <p>Redirect towards {@link #ZDICT_optimizeTrainFromBuffer_fastCover optimizeTrainFromBuffer_fastCover} single-threaded, with {@code d=8}, {@code steps=4}, {@code f=20}, and {@code accel=1}.</p>
     * 
     * <p>Samples must be stored concatenated in a single flat buffer {@code samplesBuffer}, supplied with an array of sizes {@code samplesSizes}, providing the
     * size of each sample, in order.</p>
     * 
     * <p>The resulting dictionary will be saved into {@code dictBuffer}.</p>
     * 
     * <p>Note: {@code ZDICT_trainFromBuffer()} requires about 9 bytes of memory for each input byte.</p>
     * 
     * <p>Tips:</p>
     * 
     * <ul>
     * <li>In general, a reasonable dictionary has a size of ~ 100 KB.</li>
     * <li>It's possible to select smaller or larger size, just by specifying {@code dictBufferCapacity}.</li>
     * <li>In general, it's recommended to provide a few thousands samples, though this can vary a lot.</li>
     * <li>It's recommended that total size of all samples be about ~x100 times the target size of dictionary.</li>
     * </ul>
     *
     * @return size of dictionary stored into {@code dictBuffer} (&le; {@code dictBufferCapacity}) or an error code, which can be tested with {@link #ZDICT_isError isError}.
     */
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

    /** Unsafe version of: {@link #ZDICT_getDictID getDictID} */
    public static native int nZDICT_getDictID(long dictBuffer, long dictSize);

    /**
     * Extracts {@code dictID}.
     *
     * @return zero if error (not a valid dictionary)
     */
    @NativeType("unsigned int")
    public static int ZDICT_getDictID(@NativeType("void const *") ByteBuffer dictBuffer) {
        return nZDICT_getDictID(memAddress(dictBuffer), dictBuffer.remaining());
    }

    // --- [ ZDICT_isError ] ---

    public static native int nZDICT_isError(long errorCode);

    @NativeType("unsigned int")
    public static boolean ZDICT_isError(@NativeType("size_t") long errorCode) {
        return nZDICT_isError(errorCode) != 0;
    }

    // --- [ ZDICT_getErrorName ] ---

    public static native long nZDICT_getErrorName(long errorCode);

    @Nullable
    @NativeType("char const *")
    public static String ZDICT_getErrorName(@NativeType("size_t") long errorCode) {
        long __result = nZDICT_getErrorName(errorCode);
        return memASCIISafe(__result);
    }

    // --- [ ZDICT_trainFromBuffer_cover ] ---

    /** Unsafe version of: {@link #ZDICT_trainFromBuffer_cover trainFromBuffer_cover} */
    public static native long nZDICT_trainFromBuffer_cover(long dictBuffer, long dictBufferCapacity, long samplesBuffer, long samplesSizes, int nbSamples, long parameters);

    /**
     * Train a dictionary from an array of samples using the COVER algorithm.
     * 
     * <p>Samples must be stored concatenated in a single flat buffer {@code samplesBuffer}, supplied with an array of sizes {@code samplesSizes}, providing the
     * size of each sample, in order.</p>
     * 
     * <p>The resulting dictionary will be saved into {@code dictBuffer}.</p>
     * 
     * <p>Note: {@code ZDICT_trainFromBuffer_cover()} requires about 9 bytes of memory for each input byte.</p>
     * 
     * <p>Tips:</p>
     * 
     * <ul>
     * <li>In general, a reasonable dictionary has a size of ~ 100 KB.</li>
     * <li>It's possible to select smaller or larger szie, just by specifying {@code dictBufferCapacity}.</li>
     * <li>In general, it's recommended to provide a few thousands samples, though this can vary a lot.</li>
     * <li>It's recommended that total size of all samples be about ~x100 times the target size of dictionary.</li>
     * </ul>
     *
     * @return size of dictionary stored into {@code dictBuffer} (&le; {@code dictBufferCapacity}) or an error code, which can be tested with {@link #ZDICT_isError isError}.
     */
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

    /** Unsafe version of: {@link #ZDICT_optimizeTrainFromBuffer_cover optimizeTrainFromBuffer_cover} */
    public static native long nZDICT_optimizeTrainFromBuffer_cover(long dictBuffer, long dictBufferCapacity, long samplesBuffer, long samplesSizes, int nbSamples, long parameters);

    /**
     * The same requirements as {@link #ZDICT_trainFromBuffer_cover trainFromBuffer_cover} hold for all the parameters except {@code parameters}.
     * 
     * <p>This function tries many parameter combinations and picks the best parameters. {@code *parameters} is filled with the best parameters found, dictionary
     * constructed with those parameters is stored in {@code dictBuffer}.</p>
     * 
     * <ul>
     * <li>All of the parameters {@code d}, {@code k}, {@code steps} are optional.</li>
     * <li>If {@code d} is non-zero then we don't check multiple values of {@code }d, otherwise we check {@code d = {6, 8}}.</li>
     * <li>If {@code steps} is zero it defaults to its default value.</li>
     * <li>If {@code k} is non-zero then we don't check multiple values of {@code k}, otherwise we check steps values in {@code [50, 2000]}.</li>
     * </ul>
     * 
     * <p>Note: {@code ZDICT_optimizeTrainFromBuffer_cover()} requires about 8 bytes of memory for each input byte and additionally another 5 bytes of memory for
     * each byte of memory for each thread.</p>
     *
     * @return size of dictionary stored into {@code dictBuffer} (&le; {@code dictBufferCapacity}) or an error code, which can be tested with {@link #ZDICT_isError isError}. On success
     *         {@code *parameters} contains the parameters selected.
     */
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

    /** Unsafe version of: {@link #ZDICT_trainFromBuffer_fastCover trainFromBuffer_fastCover} */
    public static native long nZDICT_trainFromBuffer_fastCover(long dictBuffer, long dictBufferCapacity, long samplesBuffer, long samplesSizes, int nbSamples, long parameters);

    /**
     * Train a dictionary from an array of samples using a modified version of COVER algorithm.
     * 
     * <p>Samples must be stored concatenated in a single flat buffer {@code samplesBuffer}, supplied with an array of sizes {@code samplesSizes}, providing the
     * size of each sample, in order. {@code d} and {@code k} are required. All other parameters are optional, will use default values if not provided. The
     * resulting dictionary will be saved into {@code dictBuffer}.</p>
     * 
     * <p>Note: {@code ZDICT_trainFromBuffer_fastCover()} requires about 1 bytes of memory for each input byte and additionally another {@code 6 * 2^f} bytes of
     * memory.</p>
     * 
     * <p>Tips: In general, a reasonable dictionary has a size of {@code ~100 KB}. It's possible to select smaller or larger size, just by specifying
     * {@code dictBufferCapacity}. In general, it's recommended to provide a few thousands samples, though this can vary a lot. It's recommended that total
     * size of all samples be about {@code ~x100} times the target size of dictionary.</p>
     *
     * @return size of dictionary stored into {@code dictBuffer} (&le; {@code dictBufferCapacity}) or an error code, which can be tested with {@link #ZDICT_isError isError}.
     */
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

    /** Unsafe version of: {@link #ZDICT_optimizeTrainFromBuffer_fastCover optimizeTrainFromBuffer_fastCover} */
    public static native long nZDICT_optimizeTrainFromBuffer_fastCover(long dictBuffer, long dictBufferCapacity, long samplesBuffer, long samplesSizes, int nbSamples, long parameters);

    /**
     * The same requirements as {@link #ZDICT_trainFromBuffer_fastCover trainFromBuffer_fastCover} hold for all the parameters except {@code parameters}.
     * 
     * <p>This function tries many parameter combinations (specifically, {@code k} and {@code d} combinations) and picks the best parameters. {@code *parameters}
     * is filled with the best parameters found, dictionary constructed with those parameters is stored in {@code dictBuffer}.</p>
     * 
     * <ul>
     * <li>All of the parameters {@code d}, {@code k}, {@code steps}, {@code f}, and {@code accel} are optional.</li>
     * <li>If {@code d} is non-zero then we don't check multiple values of {@code d}, otherwise we check {@code d = {6, 8}}.</li>
     * <li>If {@code steps} is zero it defaults to its default value.</li>
     * <li>If {@code k} is non-zero then we don't check multiple values of {@code k}, otherwise we check steps values in {@code [50, 2000]}.</li>
     * <li>If {@code f} is zero, default value of 20 is used.</li>
     * <li>If {@code accel} is zero, default value of 1 is used.</li>
     * </ul>
     * 
     * <p>Note: {@code ZDICT_optimizeTrainFromBuffer_fastCover()} requires about 1 byte of memory for each input byte and additionally another {@code 6 * 2^f}
     * bytes of memory for each thread.</p>
     *
     * @return size of dictionary stored into {@code dictBuffer} (&le; {@code dictBufferCapacity}) or an error code, which can be tested with {@link #ZDICT_isError isError}. On success
     *         {@code *parameters} contains the parameters selected.
     */
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

    /** Unsafe version of: {@link #ZDICT_finalizeDictionary finalizeDictionary} */
    public static native long nZDICT_finalizeDictionary(long dictBuffer, long dictBufferCapacity, long dictContent, long dictContentSize, long samplesBuffer, long samplesSizes, int nbSamples, long parameters);

    /**
     * Given a custom content as a basis for dictionary, and a set of samples, finalize dictionary by adding headers and statistics.
     * 
     * <p>Samples must be stored concatenated in a flat buffer {@code samplesBuffer}, supplied with an array of sizes {@code samplesSizes}, providing the size of
     * each sample in order.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>{@code dictContentSize} must be &ge; {@link #ZDICT_CONTENTSIZE_MIN CONTENTSIZE_MIN} bytes.</li>
     * <li>{@code maxDictSize} must be &ge; {@code dictContentSize}, and must be &ge; {@link #ZDICT_DICTSIZE_MIN DICTSIZE_MIN} bytes.</li>
     * <li>{@code ZDICT_finalizeDictionary()} will push notifications into {@code stderr} if instructed to, using {@code notificationLevel>0}.</li>
     * <li>{@code dictBuffer} and {@code dictContent} can overlap.</li>
     * </ul>
     *
     * @return size of dictionary stored into {@code dictBuffer} (&le; {@code dictBufferCapacity}) or an error code, which can be tested with {@link #ZDICT_isError isError}.
     */
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