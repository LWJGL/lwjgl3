/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package zstd.templates

import org.lwjgl.generator.*
import zstd.*

val Zdict = "Zdict".nativeClass(Module.ZSTD, prefix = "ZDICT", prefixMethod = "ZDICT_") {
    nativeDirective(
        """DISABLE_WARNINGS()
#define ZDICT_STATIC_LINKING_ONLY
#include "zdict.h"
ENABLE_WARNINGS()""")

    documentation =
        """
        Native bindings to the dictionary builder API of ${url("http://facebook.github.io/zstd/", "Zstandard")} (zstd).

        <h4>Why should I use a dictionary?</h4>

        Zstd can use dictionaries to improve compression ratio of small data. Traditionally small files don't compress well because there is very little
        repetition in a single sample, since it is small. But, if you are compressing many similar files, like a bunch of JSON records that share the same
        structure, you can train a dictionary on ahead of time on some samples of these files. Then, zstd can use the dictionary to find repetitions that are
        present across samples. This can vastly improve compression ratio.
 
        <h4>When is a dictionary useful?</h4>

        Dictionaries are useful when compressing many small files that are similar. The larger a file is, the less benefit a dictionary will have. Generally,
        we don't expect dictionary compression to be effective past 100KB. And the smaller a file is, the more we would expect the dictionary to help.
 
        <h4>How do I use a dictionary?</h4>
  
        Simply pass the dictionary to the zstd compressor with #CCtx_loadDictionary(). The same dictionary must then be passed to the decompressor, using
        #DCtx_loadDictionary(). There are other more advanced functions that allow selecting some options, see {@code zstd.h} for complete documentation.
 
        <h4>What is a zstd dictionary?</h4>

        A zstd dictionary has two pieces: Its header, and its content. The header contains a magic number, the dictionary ID, and entropy tables. These entropy
        tables allow zstd to save on header costs in the compressed file, which really matters for small data. The content is just bytes, which are repeated
        content that is common across many samples.
 
        <h4>What is a raw content dictionary?</h4>
  
        A raw content dictionary is just bytes. It doesn't have a zstd dictionary header, a dictionary ID, or entropy tables. Any buffer is a valid raw content
        dictionary.
 
        <h4>How do I train a dictionary?</h4>
  
        Gather samples from your use case. These samples should be similar to each other. If you have several use cases, you could try to train one dictionary
        per use case.
 
        Pass those samples to #trainFromBuffer() and that will train your dictionary. There are a few advanced versions of this function, but this is a great
        starting point. If you want to further tune your dictionary you could try #optimizeTrainFromBuffer_cover(). If that is too slow you can try
        #optimizeTrainFromBuffer_fastCover().
 
        If the dictionary training function fails, that is likely because you either passed too few samples, or a dictionary would not be effective for your
        data. Look at the messages that the dictionary trainer printed, if it doesn't say too few samples, then a dictionary would not be effective.
 
        <h4>How large should my dictionary be?</h4>
  
        A reasonable dictionary size, the {@code dictBufferCapacity}, is about 100KB. The zstd CLI defaults to a 110KB dictionary. You likely don't need a
        dictionary larger than that. But, most use cases can get away with a smaller dictionary. The advanced dictionary builders can automatically shrink the
        dictionary for you, and select a the smallest size that doesn't hurt compression ratio too much. See the {@code shrinkDict} parameter. A smaller
        dictionary can save memory, and potentially speed up compression.
 
        <h4>How many samples should I provide to the dictionary builder?</h4>

        We generally recommend passing ~100x the size of the dictionary in samples. A few thousand should suffice. Having too few samples can hurt the
        dictionaries effectiveness. Having more samples will only improve the dictionaries effectiveness. But having too many samples can slow down the
        dictionary builder.

        <h4>How do I determine if a dictionary will be effective?</h4>

        Simply train a dictionary and try it out. You can use zstd's built in benchmarking tool to test the dictionary effectiveness.
        ${codeBlock("""
# Benchmark levels 1-3 without a dictionary
zstd -b1e3 -r /path/to/my/files
# Benchmark levels 1-3 with a dictionary
zstd -b1e3 -r /path/to/my/files -D /path/to/my/dictionary""")}
 
        <h4>When should I retrain a dictionary?</h4>
  
        You should retrain a dictionary when its effectiveness drops. Dictionary effectiveness drops as the data you are compressing changes. Generally, we do
        expect dictionaries to "decay" over time, as your data changes, but the rate at which they decay depends on your use case. Internally, we regularly
        retrain dictionaries, and if the new dictionary performs significantly better than the old dictionary, we will ship the new dictionary.

        <h4>I have a raw content dictionary, how do I turn it into a zstd dictionary?</h4>

        If you have a raw content dictionary, e.g. by manually constructing it, or using a third-party dictionary builder, you can turn it into a zstd
        dictionary by using #finalizeDictionary(). You'll also have to provide some samples of the data. It will add the zstd header to the raw content, which
        contains a dictionary ID and entropy tables, which will improve compression ratio, and allow zstd to write the dictionary ID into the frame, if you so
        choose.
 
        <h4>Do I have to use zstd's dictionary builder?</h4>

        No! You can construct dictionary content however you please, it is just bytes. It will always be valid as a raw content dictionary. If you want a zstd
        dictionary, which can improve compression ratio, use #finalizeDictionary().
 
        <h4>What is the attack surface of a zstd dictionary?</h4>
  
        Zstd is heavily fuzz tested, including loading fuzzed dictionaries, so zstd should never crash, or access out-of-bounds memory no matter what the
        dictionary is. However, if an attacker can control the dictionary during decompression, they can cause zstd to generate arbitrary bytes, just like if
        they controlled the compressed data.
        """

    IntConstant(
        "",

        "CONTENTSIZE_MIN".."128",
        "DICTSIZE_MIN".."256"
    )

    customMethod("""
    private static long getSamplesBufferSize(PointerBuffer samplesSizes) {
        long bytes = 0L;
        for (int i = 0; i < samplesSizes.remaining(); i++) {
            bytes += samplesSizes.get(i);
        }
        return bytes;
    }""")

    size_t(
        "trainFromBuffer",
        """
        Train a dictionary from an array of samples.

        Redirect towards #optimizeTrainFromBuffer_fastCover() single-threaded, with {@code d=8}, {@code steps=4}, {@code f=20}, and {@code accel=1}.

        Samples must be stored concatenated in a single flat buffer {@code samplesBuffer}, supplied with an array of sizes {@code samplesSizes}, providing the
        size of each sample, in order.

        The resulting dictionary will be saved into {@code dictBuffer}.

        Note: {@code ZDICT_trainFromBuffer()} requires about 9 bytes of memory for each input byte.

        Tips:
        ${ul(
            "In general, a reasonable dictionary has a size of ~ 100 KB.",
            "It's possible to select smaller or larger size, just by specifying {@code dictBufferCapacity}.",
            "In general, it's recommended to provide a few thousands samples, though this can vary a lot.",
            "It's recommended that total size of all samples be about ~x100 times the target size of dictionary."
        )}
        """,

        void.p("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t("dictBufferCapacity", ""),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p("samplesBuffer", ""),
        size_t.const.p("samplesSizes", ""),
        AutoSize("samplesSizes")..unsigned_int("nbSamples", ""),

        returnDoc = "size of dictionary stored into {@code dictBuffer} (&le; {@code dictBufferCapacity}) or an error code, which can be tested with #isError()."
    )

    unsigned_int(
        "getDictID",
        "Extracts {@code dictID}.",

        void.const.p("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t("dictSize", ""),

        returnDoc = "zero if error (not a valid dictionary)"
    )

    unsigned_intb(
        "isError",
        "",

        size_t("errorCode", "")
    )

    charASCII.const.p(
        "getErrorName",
        "",

        size_t("errorCode", "")
    )

    // EXPERIMENTAL

    size_t(
        "trainFromBuffer_cover",
        """
        Train a dictionary from an array of samples using the COVER algorithm.

        Samples must be stored concatenated in a single flat buffer {@code samplesBuffer}, supplied with an array of sizes {@code samplesSizes}, providing the
        size of each sample, in order.

        The resulting dictionary will be saved into {@code dictBuffer}.

        Note: {@code ZDICT_trainFromBuffer_cover()} requires about 9 bytes of memory for each input byte.

        Tips:
        ${ul(
            "In general, a reasonable dictionary has a size of ~ 100 KB.",
            "It's possible to select smaller or larger szie, just by specifying {@code dictBufferCapacity}.",
            "In general, it's recommended to provide a few thousands samples, though this can vary a lot.",
            "It's recommended that total size of all samples be about ~x100 times the target size of dictionary."
        )}
        """,

        void.p("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t("dictBufferCapacity", ""),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p("samplesBuffer", ""),
        size_t.const.p("samplesSizes", ""),
        AutoSize("samplesSizes")..unsigned_int("nbSamples", ""),
        ZDICT_cover_params_t("parameters", ""),

        returnDoc = "size of dictionary stored into {@code dictBuffer} (&le; {@code dictBufferCapacity}) or an error code, which can be tested with #isError()."
    )

    size_t(
        "optimizeTrainFromBuffer_cover",
        """
        The same requirements as #trainFromBuffer_cover() hold for all the parameters except {@code parameters}.

        This function tries many parameter combinations and picks the best parameters. {@code *parameters} is filled with the best parameters found, dictionary
        constructed with those parameters is stored in {@code dictBuffer}.

        ${ul(
            "All of the parameters {@code d}, {@code k}, {@code steps} are optional.",
            "If {@code d} is non-zero then we don't check multiple values of {@code }d, otherwise we check {@code d = {6, 8}}.",
            "If {@code steps} is zero it defaults to its default value.",
            "If {@code k} is non-zero then we don't check multiple values of {@code k}, otherwise we check steps values in {@code [50, 2000]}."
        )}

        Note: {@code ZDICT_optimizeTrainFromBuffer_cover()} requires about 8 bytes of memory for each input byte and additionally another 5 bytes of memory for
        each byte of memory for each thread.
        """,

        void.p("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t("dictBufferCapacity", ""),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p("samplesBuffer", ""),
        size_t.const.p("samplesSizes", ""),
        AutoSize("samplesSizes")..unsigned_int("nbSamples", ""),
        ZDICT_cover_params_t.p("parameters", ""),

        returnDoc =
        """
        size of dictionary stored into {@code dictBuffer} (&le; {@code dictBufferCapacity}) or an error code, which can be tested with #isError(). On success
        {@code *parameters} contains the parameters selected.
        """
    )

    size_t(
        "trainFromBuffer_fastCover",
        """
        Train a dictionary from an array of samples using a modified version of COVER algorithm.

        Samples must be stored concatenated in a single flat buffer {@code samplesBuffer}, supplied with an array of sizes {@code samplesSizes}, providing the
        size of each sample, in order. {@code d} and {@code k} are required. All other parameters are optional, will use default values if not provided. The
        resulting dictionary will be saved into {@code dictBuffer}.

        Note: {@code ZDICT_trainFromBuffer_fastCover()} requires about 1 bytes of memory for each input byte and additionally another {@code 6 * 2^f} bytes of
        memory.

        Tips: In general, a reasonable dictionary has a size of {@code ~100 KB}. It's possible to select smaller or larger size, just by specifying
        {@code dictBufferCapacity}. In general, it's recommended to provide a few thousands samples, though this can vary a lot. It's recommended that total
        size of all samples be about {@code ~x100} times the target size of dictionary.
        """,

        void.p("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t("dictBufferCapacity", ""),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p("samplesBuffer", ""),
        size_t.const.p("samplesSizes", ""),
        AutoSize("samplesSizes")..unsigned("nbSamples", ""),
        ZDICT_fastCover_params_t("parameters", ""),

        returnDoc = "size of dictionary stored into {@code dictBuffer} (&le; {@code dictBufferCapacity}) or an error code, which can be tested with #isError()."
    )

    size_t(
        "optimizeTrainFromBuffer_fastCover",
        """
        The same requirements as #trainFromBuffer_fastCover() hold for all the parameters except {@code parameters}.

        This function tries many parameter combinations (specifically, {@code k} and {@code d} combinations) and picks the best parameters. {@code *parameters}
        is filled with the best parameters found, dictionary constructed with those parameters is stored in {@code dictBuffer}.

        ${ul(
            "All of the parameters {@code d}, {@code k}, {@code steps}, {@code f}, and {@code accel} are optional.",
            "If {@code d} is non-zero then we don't check multiple values of {@code d}, otherwise we check {@code d = {6, 8}}.",
            "If {@code steps} is zero it defaults to its default value.",
            "If {@code k} is non-zero then we don't check multiple values of {@code k}, otherwise we check steps values in {@code [50, 2000]}.",
            "If {@code f} is zero, default value of 20 is used.",
            "If {@code accel} is zero, default value of 1 is used."
        )}

        Note: {@code ZDICT_optimizeTrainFromBuffer_fastCover()} requires about 1 byte of memory for each input byte and additionally another {@code 6 * 2^f}
        bytes of memory for each thread.
        """,

        void.p("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t("dictBufferCapacity", ""),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p("samplesBuffer", ""),
        size_t.const.p("samplesSizes", ""),
        AutoSize("samplesSizes")..unsigned_int("nbSamples", ""),
        ZDICT_fastCover_params_t.p("parameters", ""),

        returnDoc =
        """
        size of dictionary stored into {@code dictBuffer} (&le; {@code dictBufferCapacity}) or an error code, which can be tested with #isError(). On success
        {@code *parameters} contains the parameters selected.
        """
    )

    size_t(
        "finalizeDictionary",
        """
        Given a custom content as a basis for dictionary, and a set of samples, finalize dictionary by adding headers and statistics.

        Samples must be stored concatenated in a flat buffer {@code samplesBuffer}, supplied with an array of sizes {@code samplesSizes}, providing the size of
        each sample in order.

        Notes:
        ${ul(
            "{@code maxDictSize} must be &ge; {@code dictContentSize}, and must be &ge; #DICTSIZE_MIN bytes.",
            "{@code ZDICT_finalizeDictionary()} will push notifications into {@code stderr} if instructed to, using {@code notificationLevel>0}.",
            "{@code dictBuffer} and {@code dictContent} can overlap."
        )}
        """,

        void.p("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t("dictBufferCapacity", ""),
        void.const.p("dictContent", ""),
        AutoSize("dictContent")..size_t("dictContentSize", ""),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p("samplesBuffer", ""),
        size_t.const.p("samplesSizes", ""),
        AutoSize("samplesSizes")..unsigned_int("nbSamples", ""),
        ZDICT_params_t("parameters", ""),

        returnDoc = "size of dictionary stored into {@code dictBuffer} (&le; {@code dictBufferCapacity}) or an error code, which can be tested with #isError()."
    )
}