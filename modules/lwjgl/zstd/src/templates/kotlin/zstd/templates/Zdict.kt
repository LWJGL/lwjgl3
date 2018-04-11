/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package zstd.templates

import org.lwjgl.generator.*
import zstd.*

val Zdict = "Zdict".nativeClass(Module.ZSTD, prefix = "ZDICT", prefixMethod = "ZDICT_", library = ZSTD_LIBRARY) {
    nativeDirective(
        """DISABLE_WARNINGS()
#define ZDICT_STATIC_LINKING_ONLY
#include "zdict.h"
ENABLE_WARNINGS()""")

    documentation =
        "Native bindings to the dictionary builder API of ${url("http://facebook.github.io/zstd/", "Zstandard")} (zstd)."

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

        Redirect towards #optimizeTrainFromBuffer_cover() single-threaded, with {@code d=8} and {@code steps=4}.

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

        void.p.OUT("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t.IN("dictBufferCapacity", ""),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p.IN("samplesBuffer", ""),
        size_t.const.p.IN("samplesSizes", ""),
        AutoSize("samplesSizes")..unsigned_int.IN("nbSamples", ""),

        returnDoc = "size of dictionary stored into {@code dictBuffer} (&le; {@code dictBufferCapacity}) or an error code, which can be tested with #isError()."
    )

    unsigned_int(
        "getDictID",
        "Extracts {@code dictID}.",

        void.const.p.IN("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t.IN("dictSize", ""),

        returnDoc = "zero if error (not a valid dictionary)"
    )

    unsigned_intb(
        "isError",
        "",

        size_t.IN("errorCode", "")
    )

    charASCII.const.p(
        "getErrorName",
        "",

        size_t.IN("errorCode", "")
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

        void.p.OUT("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t.IN("dictBufferCapacity", ""),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p.IN("samplesBuffer", ""),
        size_t.const.p.IN("samplesSizes", ""),
        AutoSize("samplesSizes")..unsigned_int.IN("nbSamples", ""),
        ZDICT_cover_params_t.IN("parameters", ""),

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
            "If {@code d} is non-zero then we don't check multiple values of {@code }d, otherwise we check {@code d = {6, 8, 10, 12, 14, 16}}.",
            "If {@code steps} is zero it defaults to its default value.",
            "If {@code k} is non-zero then we don't check multiple values of {@code k}, otherwise we check steps values in {@code [16, 2048]}."
        )}

        Note: {@code ZDICT_optimizeTrainFromBuffer_cover()} requires about 8 bytes of memory for each input byte and additionally another 5 bytes of memory for
        each byte of memory for each thread.
        """,

        void.p.OUT("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t.IN("dictBufferCapacity", ""),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p.IN("samplesBuffer", ""),
        size_t.const.p.IN("samplesSizes", ""),
        AutoSize("samplesSizes")..unsigned_int.IN("nbSamples", ""),
        ZDICT_cover_params_t.p.IN("parameters", ""),

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
            "{@code dictContentSize} must be &ge; #CONTENTSIZE_MIN bytes.",
            "{@code maxDictSize} must be &ge; {@code dictContentSize}, and must be &ge; #DICTSIZE_MIN bytes.",
            "{@code ZDICT_finalizeDictionary()} will push notifications into {@code stderr} if instructed to, using {@code notificationLevel>0}.",
            "{@code dictBuffer} and {@code dictContent} can overlap."
        )}
        """,

        void.p.OUT("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t.IN("dictBufferCapacity", ""),
        void.const.p.IN("dictContent", ""),
        AutoSize("dictContent")..size_t.IN("dictContentSize", ""),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p.IN("samplesBuffer", ""),
        size_t.const.p.IN("samplesSizes", ""),
        AutoSize("samplesSizes")..unsigned_int.IN("nbSamples", ""),
        ZDICT_params_t.IN("parameters", ""),

        returnDoc = "size of dictionary stored into {@code dictBuffer} (&le; {@code dictBufferCapacity}) or an error code, which can be tested with #isError()."
    )
}