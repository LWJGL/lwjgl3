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
    unsigned.member("steps", "Number of steps : Only used for optimization : 0 means default (32) : Higher means more parameters checked")
    unsigned.member(
        "nbThreads",
        """
        Number of threads : constraint: {@code 0 < nbThreads} : 1 means single-threaded : Only used for optimization : Ignored if {@code ZSTD_MULTITHREAD} is
        not defined.
        """
    )
    ZDICT_params_t.member("zParams", "")
}