/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class STBDXT {

    static { LibSTB.initialize(); }

    public static final int
        STB_DXT_NORMAL   = 0x0,
        STB_DXT_DITHER   = 0x1,
        STB_DXT_HIGHQUAL = 0x2;

    protected STBDXT() {
        throw new UnsupportedOperationException();
    }

    // --- [ stb_compress_dxt_block ] ---

    /** {@code void stb_compress_dxt_block(unsigned char * dest, unsigned char const * src_rgba_four_bytes_per_pixel, int alpha, int mode)} */
    public static native void nstb_compress_dxt_block(long dest, long src_rgba_four_bytes_per_pixel, int alpha, int mode);

    /** {@code void stb_compress_dxt_block(unsigned char * dest, unsigned char const * src_rgba_four_bytes_per_pixel, int alpha, int mode)} */
    public static void stb_compress_dxt_block(@NativeType("unsigned char *") ByteBuffer dest, @NativeType("unsigned char const *") ByteBuffer src_rgba_four_bytes_per_pixel, @NativeType("int") boolean alpha, int mode) {
        if (CHECKS) {
            check(dest, alpha ? 16 : 8);
            check(src_rgba_four_bytes_per_pixel, 64);
        }
        nstb_compress_dxt_block(memAddress(dest), memAddress(src_rgba_four_bytes_per_pixel), alpha ? 1 : 0, mode);
    }

    // --- [ stb_compress_bc4_block ] ---

    /** {@code void stb_compress_bc4_block(unsigned char * dest, unsigned char const * src_r_one_byte_per_pixel)} */
    public static native void nstb_compress_bc4_block(long dest, long src_r_one_byte_per_pixel);

    /** {@code void stb_compress_bc4_block(unsigned char * dest, unsigned char const * src_r_one_byte_per_pixel)} */
    public static void stb_compress_bc4_block(@NativeType("unsigned char *") ByteBuffer dest, @NativeType("unsigned char const *") ByteBuffer src_r_one_byte_per_pixel) {
        if (CHECKS) {
            check(dest, 8);
            check(src_r_one_byte_per_pixel, 16);
        }
        nstb_compress_bc4_block(memAddress(dest), memAddress(src_r_one_byte_per_pixel));
    }

    // --- [ stb_compress_bc5_block ] ---

    /** {@code void stb_compress_bc5_block(unsigned char * dest, unsigned char const * src_rg_two_byte_per_pixel)} */
    public static native void nstb_compress_bc5_block(long dest, long src_rg_two_byte_per_pixel);

    /** {@code void stb_compress_bc5_block(unsigned char * dest, unsigned char const * src_rg_two_byte_per_pixel)} */
    public static void stb_compress_bc5_block(@NativeType("unsigned char *") ByteBuffer dest, @NativeType("unsigned char const *") ByteBuffer src_rg_two_byte_per_pixel) {
        if (CHECKS) {
            check(dest, 16);
            check(src_rg_two_byte_per_pixel, 32);
        }
        nstb_compress_bc5_block(memAddress(dest), memAddress(src_rg_two_byte_per_pixel));
    }

}