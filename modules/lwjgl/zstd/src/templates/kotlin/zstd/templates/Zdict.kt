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

    IntConstant(
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

        void.p("dictBuffer"),
        AutoSize("dictBuffer")..size_t("dictBufferCapacity"),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p("samplesBuffer"),
        size_t.const.p("samplesSizes"),
        AutoSize("samplesSizes")..unsigned_int("nbSamples")
    )

    unsigned_int(
        "getDictID",

        void.const.p("dictBuffer"),
        AutoSize("dictBuffer")..size_t("dictSize")
    )

    unsigned_intb(
        "isError",

        size_t("errorCode")
    )

    charASCII.const.p(
        "getErrorName",

        size_t("errorCode")
    )

    // EXPERIMENTAL

    size_t(
        "trainFromBuffer_cover",

        void.p("dictBuffer"),
        AutoSize("dictBuffer")..size_t("dictBufferCapacity"),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p("samplesBuffer"),
        size_t.const.p("samplesSizes"),
        AutoSize("samplesSizes")..unsigned_int("nbSamples"),
        ZDICT_cover_params_t("parameters")
    )

    size_t(
        "optimizeTrainFromBuffer_cover",

        void.p("dictBuffer"),
        AutoSize("dictBuffer")..size_t("dictBufferCapacity"),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p("samplesBuffer"),
        size_t.const.p("samplesSizes"),
        AutoSize("samplesSizes")..unsigned_int("nbSamples"),
        ZDICT_cover_params_t.p("parameters")
    )

    size_t(
        "trainFromBuffer_fastCover",

        void.p("dictBuffer"),
        AutoSize("dictBuffer")..size_t("dictBufferCapacity"),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p("samplesBuffer"),
        size_t.const.p("samplesSizes"),
        AutoSize("samplesSizes")..unsigned("nbSamples"),
        ZDICT_fastCover_params_t("parameters")
    )

    size_t(
        "optimizeTrainFromBuffer_fastCover",

        void.p("dictBuffer"),
        AutoSize("dictBuffer")..size_t("dictBufferCapacity"),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p("samplesBuffer"),
        size_t.const.p("samplesSizes"),
        AutoSize("samplesSizes")..unsigned_int("nbSamples"),
        ZDICT_fastCover_params_t.p("parameters")
    )

    size_t(
        "finalizeDictionary",

        void.p("dictBuffer"),
        AutoSize("dictBuffer")..size_t("dictBufferCapacity"),
        void.const.p("dictContent"),
        AutoSize("dictContent")..size_t("dictContentSize"),
        Check(
            "getSamplesBufferSize(samplesSizes)", debug = true
        )..void.const.p("samplesBuffer"),
        size_t.const.p("samplesSizes"),
        AutoSize("samplesSizes")..unsigned_int("nbSamples"),
        ZDICT_params_t("parameters")
    )
}