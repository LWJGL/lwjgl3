/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package stb.templates

import org.lwjgl.generator.*
import stb.*

val stb_perlin = "STBPerlin".nativeClass(Module.STB, prefix = "STB", prefixMethod = "stb_") {
    includeSTBAPI(
        """#define STB_PERLIN_IMPLEMENTATION
#include "stb_perlin.h"""")

    float(
        "perlin_noise3",

        float("x"),
        float("y"),
        float("z"),
        int("x_wrap"),
        int("y_wrap"),
        int("z_wrap")
    )

    float(
        "perlin_noise3_seed",

        float("x"),
        float("y"),
        float("z"),
        int("x_wrap"),
        int("y_wrap"),
        int("z_wrap"),
        int("seed")
    )

    float(
        "perlin_ridge_noise3",

        float("x"),
        float("y"),
        float("z"),
        float("lacunarity"),
        float("gain"),
        float("offset"),
        int("octaves")
    )

    float(
        "perlin_fbm_noise3",

        float("x"),
        float("y"),
        float("z"),
        float("lacunarity"),
        float("gain"),
        int("octaves")
    )

    float(
        "perlin_turbulence_noise3",

        float("x"),
        float("y"),
        float("z"),
        float("lacunarity"),
        float("gain"),
        int("octaves")
    )

    float(
        "perlin_noise3_wrap_nonpow2",

        float("x"),
        float("y"),
        float("z"),
        int("x_wrap"),
        int("y_wrap"),
        int("z_wrap"),
        unsigned_char("seed")
    )
}