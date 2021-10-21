/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package zstd

import org.lwjgl.generator.*

val ZDICT_params_t = struct(Module.ZSTD, "ZDICTParams", nativeName = "ZDICT_params_t") {
    int("compressionLevel", "optimize for a specific zstd compression level; 0 means default")
    unsigned("notificationLevel", "write log to {@code stderr}; 0 = none (default); 1 = errors; 2 = progression; 3 = details; 4 = debug;")
    unsigned(
        "dictID",
        """
        force {@code dictID} value; 0 means auto mode (32-bits random value).
        
        NOTE: The zstd format reserves some dictionary IDs for future use. You may use them in private settings, but be warned that they may be used by zstd in
        a public dictionary registry in the future. These dictionary IDs are:
        ${codeBlock("""
- low range  : <= 32767
- high range : >= (2^31)""")}
        """
    )
}

val ZDICT_cover_params_t = struct(Module.ZSTD, "ZDICTCoverParams", nativeName = "ZDICT_cover_params_t") {
    documentation = "{@code k} and {@code d} are the only required parameters. For others, value 0 means default."

    unsigned("k", "segment size : constraint: {@code 0 < k} : Reasonable range {@code [16, 2048+]}")
    unsigned("d", "{@code dmer} size : constraint: {@code 0 < d <= k} : Reasonable range {@code [6, 16]}")
    unsigned("steps", "Number of steps : Only used for optimization : 0 means default (40) : Higher means more parameters checked")
    unsigned(
        "nbThreads",
        """
        number of threads : constraint: {@code 0 < nbThreads} : 1 means single-threaded : Only used for optimization : Ignored if {@code ZSTD_MULTITHREAD} is
        not defined.
        """
    )
    double(
        "splitPoint",
        """
        percentage of samples used for training: Only used for optimization: the first {@code nbSamples * splitPoint} samples will be used to training, the
        last {@code nbSamples * (1 - splitPoint)} samples will be used for testing, 0 means default (1.0), 1.0 when all samples are used for both training and
        testing.
        """
    )
    ZDICT_params_t("zParams", "")
}

val ZDICT_fastCover_params_t = struct(Module.ZSTD, "ZDICTFastCoverParams", nativeName = "ZDICT_fastCover_params_t") {
    documentation = "{@code k} and {@code d} are the only required parameters. For others, value 0 means default."

    unsigned("k", "segment size : constraint: {@code 0 < k} : Reasonable range {@code [16, 2048+]}")
    unsigned("d", "{@code dmer} size : constraint: {@code 0 < d <= k} : Reasonable range {@code [6, 16]}")
    unsigned("f", "log of size of frequency array : constraint: {@code 0 < f <= 31} : 1 means default(20)")
    unsigned("steps", "Number of steps : Only used for optimization : 0 means default (40) : Higher means more parameters checked")
    unsigned(
        "nbThreads",
        """
        number of threads : constraint: {@code 0 < nbThreads} : 1 means single-threaded : Only used for optimization : Ignored if {@code ZSTD_MULTITHREAD} is
        not defined.
        """
    )
    double(
        "splitPoint",
        """
        percentage of samples used for training: Only used for optimization: the first {@code nbSamples * splitPoint} samples will be used to training, the
        last {@code nbSamples * (1 - splitPoint)} samples will be used for testing, 0 means default (0.75), 1.0 when all samples are used for both training and
        testing.
        """
    )
    unsigned("accel", "acceleration level: constraint: {@code 0 < accel <= 10}, higher means faster and less accurate, 0 means default(1)")
    ZDICT_params_t("zParams", "")
}