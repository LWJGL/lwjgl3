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

    documentation =
        """
        Native bindings to stb_perlin.h from the ${url("https://github.com/nothings/stb", "stb library")}.

        Revised Perlin noise (3D input, 1D output).
        """

    float(
        "perlin_noise3",
        """
        Computes a random value at the coordinate (x,y,z).

        Adjacent random values are continuous but the noise fluctuates its randomness with period 1, i.e. takes on wholly unrelated values at integer points.
        Specifically, this implements Ken Perlin's revised noise function from 2002.

        The "wrap" parameters can be used to create wraparound noise that wraps at powers of two. The numbers MUST be powers of two. Specify 0 to mean "don't
        care". (The noise always wraps every 256 due details of the implementation, even if you ask for larger or no wrapping.)
        """,

        float("x", "the x coordinate"),
        float("y", "the y coordinate"),
        float("z", "the z coordinate"),
        int("x_wrap", "0, or a power of two value that specifies the x wraparound coordinate"),
        int("y_wrap", "0, or a power of two value that specifies the y wraparound coordinate"),
        int("z_wrap", "0, or a power of two value that specifies the z wraparound coordinate")
    )

    float(
        "perlin_noise3_seed",
        """
        As #perlin_noise3(), but {@code seed} selects from multiple different variations of the noise function.

        The current implementation only uses the bottom 8 bits of {@code seed}, but possibly in the future more bits will be used.
        """,

        float("x", "the x coordinate"),
        float("y", "the y coordinate"),
        float("z", "the z coordinate"),
        int("x_wrap", "0, or a power of two value that specifies the x wraparound coordinate"),
        int("y_wrap", "0, or a power of two value that specifies the y wraparound coordinate"),
        int("z_wrap", "0, or a power of two value that specifies the z wraparound coordinate"),
        int("seed", "selects from multiple different variations of the noise function")
    )

    float(
        "perlin_ridge_noise3",
        "Computes ridged noise. Calls #perlin_noise3() {@code octaves} times, so this parameter will affect runtime.",

        float("x", "the x coordinate"),
        float("y", "the y coordinate"),
        float("z", "the z coordinate"),
        float("lacunarity", "spacing between successive octaves (use exactly 2.0 for wrapping output)"),
        float("gain", "relative weighting applied to each successive octave"),
        float("offset", "used to invert the ridges, may need to be larger, not sure"),
        int("octaves", "number of \"octaves\" of {@code noise3()} to sum")
    )

    float(
        "perlin_fbm_noise3",
        "Computes Fractal Brownian Motion noise. Calls #perlin_noise3() {@code octaves} times, so this parameter will affect runtime.",

        float("x", "the x coordinate"),
        float("y", "the y coordinate"),
        float("z", "the z coordinate"),
        float("lacunarity", "spacing between successive octaves (use exactly 2.0 for wrapping output)"),
        float("gain", "relative weighting applied to each successive octave"),
        int("octaves", "number of \"octaves\" of {@code noise3()} to sum")
    )

    float(
        "perlin_turbulence_noise3",
        "Computes turbulence noise. Calls #perlin_noise3() {@code octaves} times, so this parameter will affect runtime.",

        float("x", "the x coordinate"),
        float("y", "the y coordinate"),
        float("z", "the z coordinate"),
        float("lacunarity", "spacing between successive octaves (use exactly 2.0 for wrapping output)"),
        float("gain", "relative weighting applied to each successive octave"),
        int("octaves", "number of \"octaves\" of {@code noise3()} to sum")
    )

    float(
        "perlin_noise3_wrap_nonpow2",
        "",

        float("x", ""),
        float("y", ""),
        float("z", ""),
        int("x_wrap", ""),
        int("y_wrap", ""),
        int("z_wrap", ""),
        unsigned_char("seed", "")
    )
}