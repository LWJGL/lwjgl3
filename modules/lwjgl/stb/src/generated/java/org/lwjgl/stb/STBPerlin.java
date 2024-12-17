/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

public class STBPerlin {

    static { LibSTB.initialize(); }

    protected STBPerlin() {
        throw new UnsupportedOperationException();
    }

    // --- [ stb_perlin_noise3 ] ---

    /** {@code float stb_perlin_noise3(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap)} */
    public static native float stb_perlin_noise3(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap);

    // --- [ stb_perlin_noise3_seed ] ---

    /** {@code float stb_perlin_noise3_seed(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap, int seed)} */
    public static native float stb_perlin_noise3_seed(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap, int seed);

    // --- [ stb_perlin_ridge_noise3 ] ---

    /** {@code float stb_perlin_ridge_noise3(float x, float y, float z, float lacunarity, float gain, float offset, int octaves)} */
    public static native float stb_perlin_ridge_noise3(float x, float y, float z, float lacunarity, float gain, float offset, int octaves);

    // --- [ stb_perlin_fbm_noise3 ] ---

    /** {@code float stb_perlin_fbm_noise3(float x, float y, float z, float lacunarity, float gain, int octaves)} */
    public static native float stb_perlin_fbm_noise3(float x, float y, float z, float lacunarity, float gain, int octaves);

    // --- [ stb_perlin_turbulence_noise3 ] ---

    /** {@code float stb_perlin_turbulence_noise3(float x, float y, float z, float lacunarity, float gain, int octaves)} */
    public static native float stb_perlin_turbulence_noise3(float x, float y, float z, float lacunarity, float gain, int octaves);

    // --- [ stb_perlin_noise3_wrap_nonpow2 ] ---

    /** {@code float stb_perlin_noise3_wrap_nonpow2(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap, unsigned char seed)} */
    public static native float stb_perlin_noise3_wrap_nonpow2(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap, @NativeType("unsigned char") byte seed);

}