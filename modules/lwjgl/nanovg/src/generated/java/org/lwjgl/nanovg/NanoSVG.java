/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NanoSVG {

    static { LibNanoVG.initialize(); }

    public static final int
        NSVG_PAINT_UNDEF           = -1,
        NSVG_PAINT_NONE            = 0,
        NSVG_PAINT_COLOR           = 1,
        NSVG_PAINT_LINEAR_GRADIENT = 2,
        NSVG_PAINT_RADIAL_GRADIENT = 3;

    public static final int
        NSVG_SPREAD_PAD     = 0,
        NSVG_SPREAD_REFLECT = 1,
        NSVG_SPREAD_REPEAT  = 2;

    public static final int
        NSVG_JOIN_MITER = 0,
        NSVG_JOIN_ROUND = 1,
        NSVG_JOIN_BEVEL = 2;

    public static final int
        NSVG_CAP_BUTT   = 0,
        NSVG_CAP_ROUND  = 1,
        NSVG_CAP_SQUARE = 2;

    public static final int
        NSVG_FILLRULE_NONZERO = 0,
        NSVG_FILLRULE_EVENODD = 1;

    public static final int NSVG_FLAGS_VISIBLE = 0x01;

    protected NanoSVG() {
        throw new UnsupportedOperationException();
    }

    // --- [ nsvgParseFromFile ] ---

    /** {@code NSVGimage * nsvgParseFromFile(char const * filename, char const * units, float dpi)} */
    public static native long nnsvgParseFromFile(long filename, long units, float dpi);

    /** {@code NSVGimage * nsvgParseFromFile(char const * filename, char const * units, float dpi)} */
    @NativeType("NSVGimage *")
    public static @Nullable NSVGImage nsvgParseFromFile(@NativeType("char const *") ByteBuffer filename, @NativeType("char const *") ByteBuffer units, float dpi) {
        if (CHECKS) {
            checkNT1(filename);
            checkNT1(units);
        }
        long __result = nnsvgParseFromFile(memAddress(filename), memAddress(units), dpi);
        return NSVGImage.createSafe(__result);
    }

    /** {@code NSVGimage * nsvgParseFromFile(char const * filename, char const * units, float dpi)} */
    @NativeType("NSVGimage *")
    public static @Nullable NSVGImage nsvgParseFromFile(@NativeType("char const *") CharSequence filename, @NativeType("char const *") CharSequence units, float dpi) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            stack.nASCII(units, true);
            long unitsEncoded = stack.getPointerAddress();
            long __result = nnsvgParseFromFile(filenameEncoded, unitsEncoded, dpi);
            return NSVGImage.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nsvgParse ] ---

    /** {@code NSVGimage * nsvgParse(char * input, char const * units, float dpi)} */
    public static native long nnsvgParse(long input, long units, float dpi);

    /** {@code NSVGimage * nsvgParse(char * input, char const * units, float dpi)} */
    @NativeType("NSVGimage *")
    public static @Nullable NSVGImage nsvgParse(@NativeType("char *") ByteBuffer input, @NativeType("char const *") ByteBuffer units, float dpi) {
        if (CHECKS) {
            checkNT1(input);
            checkNT1(units);
        }
        long __result = nnsvgParse(memAddress(input), memAddress(units), dpi);
        return NSVGImage.createSafe(__result);
    }

    /** {@code NSVGimage * nsvgParse(char * input, char const * units, float dpi)} */
    @NativeType("NSVGimage *")
    public static @Nullable NSVGImage nsvgParse(@NativeType("char *") CharSequence input, @NativeType("char const *") CharSequence units, float dpi) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(input, true);
            long inputEncoded = stack.getPointerAddress();
            stack.nASCII(units, true);
            long unitsEncoded = stack.getPointerAddress();
            long __result = nnsvgParse(inputEncoded, unitsEncoded, dpi);
            return NSVGImage.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nsvgDuplicatePath ] ---

    /** {@code NSVGpath * nsvgDuplicatePath(NSVGpath * p)} */
    public static native long nnsvgDuplicatePath(long p);

    /** {@code NSVGpath * nsvgDuplicatePath(NSVGpath * p)} */
    @NativeType("NSVGpath *")
    public static @Nullable NSVGPath nsvgDuplicatePath(@NativeType("NSVGpath *") NSVGPath p) {
        long __result = nnsvgDuplicatePath(p.address());
        return NSVGPath.createSafe(__result);
    }

    // --- [ nsvgDelete ] ---

    /** {@code void nsvgDelete(NSVGimage * image)} */
    public static native void nnsvgDelete(long image);

    /** {@code void nsvgDelete(NSVGimage * image)} */
    public static void nsvgDelete(@NativeType("NSVGimage *") NSVGImage image) {
        nnsvgDelete(image.address());
    }

    // --- [ nsvgCreateRasterizer ] ---

    /** {@code NSVGrasterizer * nsvgCreateRasterizer(void)} */
    @NativeType("NSVGrasterizer *")
    public static native long nsvgCreateRasterizer();

    // --- [ nsvgRasterize ] ---

    /** {@code void nsvgRasterize(NSVGrasterizer * r, NSVGimage * image, float tx, float ty, float scale, unsigned char * dst, int w, int h, int stride)} */
    public static native void nnsvgRasterize(long r, long image, float tx, float ty, float scale, long dst, int w, int h, int stride);

    /** {@code void nsvgRasterize(NSVGrasterizer * r, NSVGimage * image, float tx, float ty, float scale, unsigned char * dst, int w, int h, int stride)} */
    public static void nsvgRasterize(@NativeType("NSVGrasterizer *") long r, @NativeType("NSVGimage *") NSVGImage image, float tx, float ty, float scale, @NativeType("unsigned char *") ByteBuffer dst, int w, int h, int stride) {
        if (CHECKS) {
            check(r);
            check(dst, h * stride);
        }
        nnsvgRasterize(r, image.address(), tx, ty, scale, memAddress(dst), w, h, stride);
    }

    // --- [ nsvgDeleteRasterizer ] ---

    /** {@code void nsvgDeleteRasterizer(NSVGrasterizer * rasterizer)} */
    public static native void nnsvgDeleteRasterizer(long rasterizer);

    /** {@code void nsvgDeleteRasterizer(NSVGrasterizer * rasterizer)} */
    public static void nsvgDeleteRasterizer(@NativeType("NSVGrasterizer *") long rasterizer) {
        if (CHECKS) {
            check(rasterizer);
        }
        nnsvgDeleteRasterizer(rasterizer);
    }

}