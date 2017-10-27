/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.zstd

import org.lwjgl.generator.*

val ZDICT_params_t = struct(ZSTD_PACKAGE, "ZDICTParams", nativeName = "ZDICT_params_t") {
    int.member("compressionLevel", "0 means default; target a specific zstd compression level")
    unsigned.member("notificationLevel", "write to {@code stderr}; 0 = none (default); 1 = errors; 2 = progression; 3 = details; 4 = debug;")
    unsigned.member("dictID", "0 means auto mode (32-bits random value); other : force {@code dictID} value")
}

val ZDICT_cover_params_t = struct(ZSTD_PACKAGE, "ZDICTCoverParams", nativeName = "ZDICT_cover_params_t") {
    documentation = "For all values 0 means default. {@code k} and {@code d} are the only required parameters."

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