/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package zstd

import org.lwjgl.generator.*

val ZDICT_params_t = struct(Module.ZSTD, "ZDICTParams", nativeName = "ZDICT_params_t") {
    int.member("compressionLevel", "optimize for a specific zstd compression level; 0 means default")
    unsigned.member("notificationLevel", "write log to {@code stderr}; 0 = none (default); 1 = errors; 2 = progression; 3 = details; 4 = debug;")
    unsigned.member("dictID", "force {@code dictID} value; 0 means auto mode (32-bits random value)")
}

val ZDICT_cover_params_t = struct(Module.ZSTD, "ZDICTCoverParams", nativeName = "ZDICT_cover_params_t") {
    documentation = "{@code k} and {@code d} are the only required parameters. For others, value 0 means default."

    unsigned.member("k", "segment size : constraint: {@code 0 < k} : Reasonable range {@code [16, 2048+]}")
    unsigned.member("d", "{@code dmer} size : constraint: {@code 0 < d <= k} : Reasonable range {@code [6, 16]}")
    unsigned.member("steps", "Number of steps : Only used for optimization : 0 means default (40) : Higher means more parameters checked")
    unsigned.member(
        "nbThreads",
        """
        number of threads : constraint: {@code 0 < nbThreads} : 1 means single-threaded : Only used for optimization : Ignored if {@code ZSTD_MULTITHREAD} is
        not defined.
        """
    )
    double.member(
        "splitPoint",
        """
        percentage of samples used for training: Only used for optimization: the first {@code nbSamples * splitPoint} samples will be used to training, the
        last {@code nbSamples * (1 - splitPoint)} samples will be used for testing, 0 means default (1.0), 1.0 when all samples are used for both training and
        testing.
        """
    )
    ZDICT_params_t.member("zParams", "")
}

val ZDICT_fastCover_params_t = struct(Module.ZSTD, "ZDICTFastCoverParams", nativeName = "ZDICT_fastCover_params_t") {
    documentation = "{@code k} and {@code d} are the only required parameters. For others, value 0 means default."

    unsigned.member("k", "segment size : constraint: {@code 0 < k} : Reasonable range {@code [16, 2048+]}")
    unsigned.member("d", "{@code dmer} size : constraint: {@code 0 < d <= k} : Reasonable range {@code [6, 16]}")
    unsigned.member("f", "log of size of frequency array : constraint: {@code 0 < f <= 31} : 1 means default(20)")
    unsigned.member("steps", "Number of steps : Only used for optimization : 0 means default (40) : Higher means more parameters checked")
    unsigned.member(
        "nbThreads",
        """
        number of threads : constraint: {@code 0 < nbThreads} : 1 means single-threaded : Only used for optimization : Ignored if {@code ZSTD_MULTITHREAD} is
        not defined.
        """
    )
    double.member(
        "splitPoint",
        """
        percentage of samples used for training: Only used for optimization: the first {@code nbSamples * splitPoint} samples will be used to training, the
        last {@code nbSamples * (1 - splitPoint)} samples will be used for testing, 0 means default (0.75), 1.0 when all samples are used for both training and
        testing.
        """
    )
    unsigned.member("accel", "acceleration level: constraint: {@code 0 < accel <= 10}, higher means faster and less accurate, 0 means default(1)")
    ZDICT_params_t.member("zParams", "")
}