/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.stb.templates

import org.lwjgl.generator.*
import org.lwjgl.stb.*

val stb_perlin = "STBPerlin".nativeClass(packageName = STB_PACKAGE, prefix = "STB", prefixMethod = "stb_", library = STB_LIBRARY) {
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

        float.IN("x", "the x coordinate"),
        float.IN("y", "the y coordinate"),
        float.IN("z", "the z coordinate"),
        int.IN("x_wrap", "0, or a power of two value that specifies the x wraparound coordinate"),
        int.IN("y_wrap", "0, or a power of two value that specifies the y wraparound coordinate"),
        int.IN("z_wrap", "0, or a power of two value that specifies the z wraparound coordinate")
    )

    float(
        "perlin_ridge_noise3",
        "Computes ridged noise. Calls #perlin_noise3() {@code octaves} times, so this parameter will affect runtime.",

        float.IN("x", "the x coordinate"),
        float.IN("y", "the y coordinate"),
        float.IN("z", "the z coordinate"),
        float.IN("lacunarity", ""),
        float.IN("gain", ""),
        float.IN("offset", ""),
        int.IN("octaves", ""),
        int.IN("x_wrap", ""),
        int.IN("y_wrap", ""),
        int.IN("z_wrap", "")
    )

    float(
        "perlin_fbm_noise3",
        "Computes Fractal Brownian Motion noise. Calls #perlin_noise3() {@code octaves} times, so this parameter will affect runtime.",

        float.IN("x", "the x coordinate"),
        float.IN("y", "the y coordinate"),
        float.IN("z", "the z coordinate"),
        float.IN("lacunarity", ""),
        float.IN("gain", ""),
        int.IN("octaves", ""),
        int.IN("x_wrap", ""),
        int.IN("y_wrap", ""),
        int.IN("z_wrap", "")
    )

    float(
        "perlin_turbulence_noise3",
        "Computes turbulence noise. Calls #perlin_noise3() {@code octaves} times, so this parameter will affect runtime.",

        float.IN("x", "the x coordinate"),
        float.IN("y", "the y coordinate"),
        float.IN("z", "the z coordinate"),
        float.IN("lacunarity", ""),
        float.IN("gain", ""),
        int.IN("octaves", ""),
        int.IN("x_wrap", ""),
        int.IN("y_wrap", ""),
        int.IN("z_wrap", "")
    )
}