/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

/**
 * Native bindings to stb_perlin.h from the <a href="https://github.com/nothings/stb">stb library</a>.
 * 
 * <p>Revised Perlin noise (3D input, 1D output).</p>
 */
public class STBPerlin {

    static { LibSTB.initialize(); }

    protected STBPerlin() {
        throw new UnsupportedOperationException();
    }

    // --- [ stb_perlin_noise3 ] ---

    /**
     * Computes a random value at the coordinate (x,y,z).
     * 
     * <p>Adjacent random values are continuous but the noise fluctuates its randomness with period 1, i.e. takes on wholly unrelated values at integer points.
     * Specifically, this implements Ken Perlin's revised noise function from 2002.</p>
     * 
     * <p>The "wrap" parameters can be used to create wraparound noise that wraps at powers of two. The numbers MUST be powers of two. Specify 0 to mean "don't
     * care". (The noise always wraps every 256 due details of the implementation, even if you ask for larger or no wrapping.)</p>
     *
     * @param x      the x coordinate
     * @param y      the y coordinate
     * @param z      the z coordinate
     * @param x_wrap 0, or a power of two value that specifies the x wraparound coordinate
     * @param y_wrap 0, or a power of two value that specifies the y wraparound coordinate
     * @param z_wrap 0, or a power of two value that specifies the z wraparound coordinate
     */
    public static native float stb_perlin_noise3(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap);

    // --- [ stb_perlin_noise3_seed ] ---

    /**
     * As {@link #stb_perlin_noise3 perlin_noise3}, but {@code seed} selects from multiple different variations of the noise function.
     * 
     * <p>The current implementation only uses the bottom 8 bits of {@code seed}, but possibly in the future more bits will be used.</p>
     *
     * @param x      the x coordinate
     * @param y      the y coordinate
     * @param z      the z coordinate
     * @param x_wrap 0, or a power of two value that specifies the x wraparound coordinate
     * @param y_wrap 0, or a power of two value that specifies the y wraparound coordinate
     * @param z_wrap 0, or a power of two value that specifies the z wraparound coordinate
     * @param seed   selects from multiple different variations of the noise function
     */
    public static native float stb_perlin_noise3_seed(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap, int seed);

    // --- [ stb_perlin_ridge_noise3 ] ---

    /**
     * Computes ridged noise. Calls {@link #stb_perlin_noise3 perlin_noise3} {@code octaves} times, so this parameter will affect runtime.
     *
     * @param x          the x coordinate
     * @param y          the y coordinate
     * @param z          the z coordinate
     * @param lacunarity spacing between successive octaves (use exactly 2.0 for wrapping output)
     * @param gain       relative weighting applied to each successive octave
     * @param offset     used to invert the ridges, may need to be larger, not sure
     * @param octaves    number of "octaves" of {@code noise3()} to sum
     */
    public static native float stb_perlin_ridge_noise3(float x, float y, float z, float lacunarity, float gain, float offset, int octaves);

    // --- [ stb_perlin_fbm_noise3 ] ---

    /**
     * Computes Fractal Brownian Motion noise. Calls {@link #stb_perlin_noise3 perlin_noise3} {@code octaves} times, so this parameter will affect runtime.
     *
     * @param x          the x coordinate
     * @param y          the y coordinate
     * @param z          the z coordinate
     * @param lacunarity spacing between successive octaves (use exactly 2.0 for wrapping output)
     * @param gain       relative weighting applied to each successive octave
     * @param octaves    number of "octaves" of {@code noise3()} to sum
     */
    public static native float stb_perlin_fbm_noise3(float x, float y, float z, float lacunarity, float gain, int octaves);

    // --- [ stb_perlin_turbulence_noise3 ] ---

    /**
     * Computes turbulence noise. Calls {@link #stb_perlin_noise3 perlin_noise3} {@code octaves} times, so this parameter will affect runtime.
     *
     * @param x          the x coordinate
     * @param y          the y coordinate
     * @param z          the z coordinate
     * @param lacunarity spacing between successive octaves (use exactly 2.0 for wrapping output)
     * @param gain       relative weighting applied to each successive octave
     * @param octaves    number of "octaves" of {@code noise3()} to sum
     */
    public static native float stb_perlin_turbulence_noise3(float x, float y, float z, float lacunarity, float gain, int octaves);

    // --- [ stb_perlin_noise3_wrap_nonpow2 ] ---

    public static native float stb_perlin_noise3_wrap_nonpow2(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap, @NativeType("unsigned char") byte seed);

}