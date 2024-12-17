/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package zstd

import org.lwjgl.generator.*

val ZDICT_params_t = struct(Module.ZSTD, "ZDICTParams", nativeName = "ZDICT_params_t") {
    int("compressionLevel")
    unsigned("notificationLevel")
    unsigned("dictID")
}

val ZDICT_cover_params_t = struct(Module.ZSTD, "ZDICTCoverParams", nativeName = "ZDICT_cover_params_t") {
    unsigned("k")
    unsigned("d")
    unsigned("steps")
    unsigned("nbThreads")
    double("splitPoint")
    ZDICT_params_t("zParams")
}

val ZDICT_fastCover_params_t = struct(Module.ZSTD, "ZDICTFastCoverParams", nativeName = "ZDICT_fastCover_params_t") {
    unsigned("k")
    unsigned("d")
    unsigned("f")
    unsigned("steps")
    unsigned("nbThreads")
    double("splitPoint")
    unsigned("accel")
    ZDICT_params_t("zParams")
}