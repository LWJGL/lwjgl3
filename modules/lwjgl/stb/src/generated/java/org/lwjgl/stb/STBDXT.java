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

/**
 * Native bindings to stb_dxt.h from the <a href="https://github.com/nothings/stb">stb library</a>.
 * 
 * <p>DXT1/DXT5 compressor.</p>
 */
public class STBDXT {

    static { LibSTB.initialize(); }

    public static final int STB_DXT_NORMAL = 0x0;

    /** Use dithering. Was always dubious, now deprecated. Does nothing! */
    public static final int STB_DXT_DITHER = 0x1;

    /** High quality mode, does two refinement steps instead of 1. ~30-40% slower. */
    public static final int STB_DXT_HIGHQUAL = 0x2;

    protected STBDXT() {
        throw new UnsupportedOperationException();
    }

    // --- [ stb_compress_dxt_block ] ---

    /** Unsafe version of: {@link #stb_compress_dxt_block compress_dxt_block} */
    public static native void nstb_compress_dxt_block(long dest, long src_rgba_four_bytes_per_pixel, int alpha, int mode);

    /**
     * Call this function for every block (you must pad).
     * 
     * <p>The source should be a 4x4 block of RGBA data in row-major order. Alpha channel is not stored if you specify {@code alpha=0} (but you must supply some
     * constant alpha in the alpha channel). You can turn on dithering and "high quality" using {@code mode}.</p>
     *
     * @param dest                          a buffer in which to store the compressed block
     * @param src_rgba_four_bytes_per_pixel the block to compress
     * @param alpha                         1 to compress the alpha channel, 0 to ignore it
     * @param mode                          the compression mode. One of:<br><table><tr><td>{@link #STB_DXT_NORMAL DXT_NORMAL}</td><td>{@link #STB_DXT_DITHER DXT_DITHER}</td><td>{@link #STB_DXT_HIGHQUAL DXT_HIGHQUAL}</td></tr></table>
     */
    public static void stb_compress_dxt_block(@NativeType("unsigned char *") ByteBuffer dest, @NativeType("unsigned char const *") ByteBuffer src_rgba_four_bytes_per_pixel, @NativeType("int") boolean alpha, int mode) {
        if (CHECKS) {
            check(dest, alpha ? 16 : 8);
            check(src_rgba_four_bytes_per_pixel, 64);
        }
        nstb_compress_dxt_block(memAddress(dest), memAddress(src_rgba_four_bytes_per_pixel), alpha ? 1 : 0, mode);
    }

    // --- [ stb_compress_bc4_block ] ---

    /** Unsafe version of: {@link #stb_compress_bc4_block compress_bc4_block} */
    public static native void nstb_compress_bc4_block(long dest, long src_r_one_byte_per_pixel);

    /**
     * Call this function for every block (you must pad). The source should be a 4x4 block of A data in row-major order.
     *
     * @param dest                     a buffer in which to store the compressed block
     * @param src_r_one_byte_per_pixel the block to compress
     */
    public static void stb_compress_bc4_block(@NativeType("unsigned char *") ByteBuffer dest, @NativeType("unsigned char const *") ByteBuffer src_r_one_byte_per_pixel) {
        if (CHECKS) {
            check(dest, 8);
            check(src_r_one_byte_per_pixel, 16);
        }
        nstb_compress_bc4_block(memAddress(dest), memAddress(src_r_one_byte_per_pixel));
    }

    // --- [ stb_compress_bc5_block ] ---

    /** Unsafe version of: {@link #stb_compress_bc5_block compress_bc5_block} */
    public static native void nstb_compress_bc5_block(long dest, long src_rg_two_byte_per_pixel);

    /**
     * Call this function for every block (you must pad). The source should be a 4x4 block of RG data in row-major order.
     *
     * @param dest                      a buffer in which to store the compressed block
     * @param src_rg_two_byte_per_pixel the block to compress
     */
    public static void stb_compress_bc5_block(@NativeType("unsigned char *") ByteBuffer dest, @NativeType("unsigned char const *") ByteBuffer src_rg_two_byte_per_pixel) {
        if (CHECKS) {
            check(dest, 16);
            check(src_rg_two_byte_per_pixel, 32);
        }
        nstb_compress_bc5_block(memAddress(dest), memAddress(src_rg_two_byte_per_pixel));
    }

}