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

/**
 * Native bindings to the dictionary builder API of <a target="_blank" href="http://facebook.github.io/zstd/">Zstandard</a> (zstd).
 * 
 * <h4>Why should I use a dictionary?</h4>
 * 
 * <p>Zstd can use dictionaries to improve compression ratio of small data. Traditionally small files don't compress well because there is very little
 * repetition in a single sample, since it is small. But, if you are compressing many similar files, like a bunch of JSON records that share the same
 * structure, you can train a dictionary on ahead of time on some samples of these files. Then, zstd can use the dictionary to find repetitions that are
 * present across samples. This can vastly improve compression ratio.</p>
 * 
 * <h4>When is a dictionary useful?</h4>
 * 
 * <p>Dictionaries are useful when compressing many small files that are similar. The larger a file is, the less benefit a dictionary will have. Generally,
 * we don't expect dictionary compression to be effective past 100KB. And the smaller a file is, the more we would expect the dictionary to help.</p>
 * 
 * <h4>How do I use a dictionary?</h4>
 * 
 * <p>Simply pass the dictionary to the zstd compressor with {@link Zstd#ZSTD_CCtx_loadDictionary CCtx_loadDictionary}. The same dictionary must then be passed to the decompressor, using
 * {@link Zstd#ZSTD_DCtx_loadDictionary DCtx_loadDictionary}. There are other more advanced functions that allow selecting some options, see {@code zstd.h} for complete documentation.</p>
 * 
 * <h4>What is a zstd dictionary?</h4>
 * 
 * <p>A zstd dictionary has two pieces: Its header, and its content. The header contains a magic number, the dictionary ID, and entropy tables. These entropy
 * tables allow zstd to save on header costs in the compressed file, which really matters for small data. The content is just bytes, which are repeated
 * content that is common across many samples.</p>
 * 
 * <h4>What is a raw content dictionary?</h4>
 * 
 * <p>A raw content dictionary is just bytes. It doesn't have a zstd dictionary header, a dictionary ID, or entropy tables. Any buffer is a valid raw content
 * dictionary.</p>
 * 
 * <h4>How do I train a dictionary?</h4>
 * 
 * <p>Gather samples from your use case. These samples should be similar to each other. If you have several use cases, you could try to train one dictionary
 * per use case.</p>
 * 
 * <p>Pass those samples to {@link #ZDICT_trainFromBuffer trainFromBuffer} and that will train your dictionary. There are a few advanced versions of this function, but this is a great
 * starting point. If you want to further tune your dictionary you could try {@link #ZDICT_optimizeTrainFromBuffer_cover optimizeTrainFromBuffer_cover}. If that is too slow you can try
 * {@link #ZDICT_optimizeTrainFromBuffer_fastCover optimizeTrainFromBuffer_fastCover}.</p>
 * 
 * <p>If the dictionary training function fails, that is likely because you either passed too few samples, or a dictionary would not be effective for your
 * data. Look at the messages that the dictionary trainer printed, if it doesn't say too few samples, then a dictionary would not be effective.</p>
 * 
 * <h4>How large should my dictionary be?</h4>
 * 
 * <p>A reasonable dictionary size, the {@code dictBufferCapacity}, is about 100KB. The zstd CLI defaults to a 110KB dictionary. You likely don't need a
 * dictionary larger than that. But, most use cases can get away with a smaller dictionary. The advanced dictionary builders can automatically shrink the
 * dictionary for you, and select a the smallest size that doesn't hurt compression ratio too much. See the {@code shrinkDict} parameter. A smaller
 * dictionary can save memory, and potentially speed up compression.</p>
 * 
 * <h4>How many samples should I provide to the dictionary builder?</h4>
 * 
 * <p>We generally recommend passing ~100x the size of the dictionary in samples. A few thousand should suffice. Having too few samples can hurt the
 * dictionaries effectiveness. Having more samples will only improve the dictionaries effectiveness. But having too many samples can slow down the
 * dictionary builder.</p>
 * 
 * <h4>How do I determine if a dictionary will be effective?</h4>
 * 
 * <p>Simply train a dictionary and try it out. You can use zstd's built in benchmarking tool to test the dictionary effectiveness.</p>
 * 
 * <pre><code>
 * # Benchmark levels 1-3 without a dictionary
 * zstd -b1e3 -r /path/to/my/files
 * # Benchmark levels 1-3 with a dictionary
 * zstd -b1e3 -r /path/to/my/files -D /path/to/my/dictionary</code></pre>
 * 
 * <h4>When should I retrain a dictionary?</h4>
 * 
 * <p>You should retrain a dictionary when its effectiveness drops. Dictionary effectiveness drops as the data you are compressing changes. Generally, we do
 * expect dictionaries to "decay" over time, as your data changes, but the rate at which they decay depends on your use case. Internally, we regularly
 * retrain dictionaries, and if the new dictionary performs significantly better than the old dictionary, we will ship the new dictionary.</p>
 * 
 * <h4>I have a raw content dictionary, how do I turn it into a zstd dictionary?</h4>
 * 
 * <p>If you have a raw content dictionary, e.g. by manually constructing it, or using a third-party dictionary builder, you can turn it into a zstd
 * dictionary by using {@link #ZDICT_finalizeDictionary finalizeDictionary}. You'll also have to provide some samples of the data. It will add the zstd header to the raw content, which
 * contains a dictionary ID and entropy tables, which will improve compression ratio, and allow zstd to write the dictionary ID into the frame, if you so
 * choose.</p>
 * 
 * <h4>Do I have to use zstd's dictionary builder?</h4>
 * 
 * <p>No! You can construct dictionary content however you please, it is just bytes. It will always be valid as a raw content dictionary. If you want a zstd
 * dictionary, which can improve compression ratio, use {@link #ZDICT_finalizeDictionary finalizeDictionary}.</p>
 * 
 * <h4>What is the attack surface of a zstd dictionary?</h4>
 * 
 * <p>Zstd is heavily fuzz tested, including loading fuzzed dictionaries, so zstd should never crash, or access out-of-bounds memory no matter what the
 * dictionary is. However, if an attacker can control the dictionary during decompression, they can cause zstd to generate arbitrary bytes, just like if
 * they controlled the compressed data.</p>
 */
public class Zdict {

    static { LibZstd.initialize(); }

    public static final int
        ZDICT_CONTENTSIZE_MIN = 128,
        ZDICT_DICTSIZE_MIN    = 256;

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