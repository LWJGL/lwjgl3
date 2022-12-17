/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * NanoSVG is a simple stupid single-header-file SVG parse. The output of the parser is a list of cubic bezier shapes.
 * 
 * <p>The library suits well for anything from rendering scalable icons in your editor application to prototyping a game.</p>
 * 
 * <p>NanoSVG supports a wide range of SVG features, but something may be missing, feel free to create a pull request!</p>
 * 
 * <p>The shapes in the SVG images are transformed by the viewBox and converted to specified units. That is, you should get the same looking data as your
 * designed in your favorite app.</p>
 * 
 * <p>NanoSVG can return the paths in few different units. For example if you want to render an image, you may choose to get the paths in pixels, or if you
 * are feeding the data into a CNC-cutter, you may want to use millimeters.</p>
 * 
 * <p>The units passed to NanoSVG should be one of: 'px', 'pt', 'pc' 'mm', 'cm', or 'in'. DPI (dots-per-inch) controls how the unit conversion is done.</p>
 * 
 * <p>If you don't know or care about the units stuff, "px" and 96 should get you going.</p>
 */
public class NanoSVG {

    static { LibNanoVG.initialize(); }

    /**
     * NSVGpaintType
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NSVG_PAINT_UNDEF PAINT_UNDEF}</li>
     * <li>{@link #NSVG_PAINT_NONE PAINT_NONE}</li>
     * <li>{@link #NSVG_PAINT_COLOR PAINT_COLOR}</li>
     * <li>{@link #NSVG_PAINT_LINEAR_GRADIENT PAINT_LINEAR_GRADIENT}</li>
     * <li>{@link #NSVG_PAINT_RADIAL_GRADIENT PAINT_RADIAL_GRADIENT}</li>
     * </ul>
     */
    public static final int
        NSVG_PAINT_UNDEF           = -1,
        NSVG_PAINT_NONE            = 0,
        NSVG_PAINT_COLOR           = 1,
        NSVG_PAINT_LINEAR_GRADIENT = 2,
        NSVG_PAINT_RADIAL_GRADIENT = 3;

    /**
     * NSVGspreadType
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NSVG_SPREAD_PAD SPREAD_PAD}</li>
     * <li>{@link #NSVG_SPREAD_REFLECT SPREAD_REFLECT}</li>
     * <li>{@link #NSVG_SPREAD_REPEAT SPREAD_REPEAT}</li>
     * </ul>
     */
    public static final int
        NSVG_SPREAD_PAD     = 0,
        NSVG_SPREAD_REFLECT = 1,
        NSVG_SPREAD_REPEAT  = 2;

    /**
     * NSVGlineJoin
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NSVG_JOIN_MITER JOIN_MITER}</li>
     * <li>{@link #NSVG_JOIN_ROUND JOIN_ROUND}</li>
     * <li>{@link #NSVG_JOIN_BEVEL JOIN_BEVEL}</li>
     * </ul>
     */
    public static final int
        NSVG_JOIN_MITER = 0,
        NSVG_JOIN_ROUND = 1,
        NSVG_JOIN_BEVEL = 2;

    /**
     * NSVGlineCap
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NSVG_CAP_BUTT CAP_BUTT}</li>
     * <li>{@link #NSVG_CAP_ROUND CAP_ROUND}</li>
     * <li>{@link #NSVG_CAP_SQUARE CAP_SQUARE}</li>
     * </ul>
     */
    public static final int
        NSVG_CAP_BUTT   = 0,
        NSVG_CAP_ROUND  = 1,
        NSVG_CAP_SQUARE = 2;

    /**
     * NSVGfillRule
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NSVG_FILLRULE_NONZERO FILLRULE_NONZERO}</li>
     * <li>{@link #NSVG_FILLRULE_EVENODD FILLRULE_EVENODD}</li>
     * </ul>
     */
    public static final int
        NSVG_FILLRULE_NONZERO = 0,
        NSVG_FILLRULE_EVENODD = 1;

    /** NSVGflags */
    public static final int NSVG_FLAGS_VISIBLE = 0x01;

    protected NanoSVG() {
        throw new UnsupportedOperationException();
    }

    // --- [ nsvgParseFromFile ] ---

    /** Unsafe version of: {@link #nsvgParseFromFile ParseFromFile} */
    public static native long nnsvgParseFromFile(long filename, long units, float dpi);

    /** Parses SVG file from a file, returns SVG image as paths. */
    @Nullable
    @NativeType("NSVGimage *")
    public static NSVGImage nsvgParseFromFile(@NativeType("char const *") ByteBuffer filename, @NativeType("char const *") ByteBuffer units, float dpi) {
        if (CHECKS) {
            checkNT1(filename);
            checkNT1(units);
        }
        long __result = nnsvgParseFromFile(memAddress(filename), memAddress(units), dpi);
        return NSVGImage.createSafe(__result);
    }

    /** Parses SVG file from a file, returns SVG image as paths. */
    @Nullable
    @NativeType("NSVGimage *")
    public static NSVGImage nsvgParseFromFile(@NativeType("char const *") CharSequence filename, @NativeType("char const *") CharSequence units, float dpi) {
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

    /** Unsafe version of: {@link #nsvgParse Parse} */
    public static native long nnsvgParse(long input, long units, float dpi);

    /**
     * Parses SVG file from a null terminated string, returns SVG image as paths.
     * 
     * <p>Important note: changes the string.</p>
     */
    @Nullable
    @NativeType("NSVGimage *")
    public static NSVGImage nsvgParse(@NativeType("char *") ByteBuffer input, @NativeType("char const *") ByteBuffer units, float dpi) {
        if (CHECKS) {
            checkNT1(input);
            checkNT1(units);
        }
        long __result = nnsvgParse(memAddress(input), memAddress(units), dpi);
        return NSVGImage.createSafe(__result);
    }

    /**
     * Parses SVG file from a null terminated string, returns SVG image as paths.
     * 
     * <p>Important note: changes the string.</p>
     */
    @Nullable
    @NativeType("NSVGimage *")
    public static NSVGImage nsvgParse(@NativeType("char *") CharSequence input, @NativeType("char const *") CharSequence units, float dpi) {
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

    /** Unsafe version of: {@link #nsvgDuplicatePath DuplicatePath} */
    public static native long nnsvgDuplicatePath(long p);

    /** Duplicates a path. */
    @Nullable
    @NativeType("NSVGpath *")
    public static NSVGPath nsvgDuplicatePath(@NativeType("NSVGpath *") NSVGPath p) {
        long __result = nnsvgDuplicatePath(p.address());
        return NSVGPath.createSafe(__result);
    }

    // --- [ nsvgDelete ] ---

    /** Unsafe version of: {@link #nsvgDelete Delete} */
    public static native void nnsvgDelete(long image);

    /** Deletes an image. */
    public static void nsvgDelete(@NativeType("NSVGimage *") NSVGImage image) {
        nnsvgDelete(image.address());
    }

    // --- [ nsvgCreateRasterizer ] ---

    /** Allocates rasterizer context. */
    @NativeType("NSVGrasterizer *")
    public static native long nsvgCreateRasterizer();

    // --- [ nsvgRasterize ] ---

    /** Unsafe version of: {@link #nsvgRasterize Rasterize} */
    public static native void nnsvgRasterize(long r, long image, float tx, float ty, float scale, long dst, int w, int h, int stride);

    /**
     * Rasterizes SVG image, returns RGBA image (non-premultiplied alpha).
     *
     * @param r      pointer to rasterizer context
     * @param image  pointer to image to rasterize
     * @param tx     image x offset (applied after scaling)
     * @param ty     image y offset (applied after scaling)
     * @param scale  image scale
     * @param dst    pointer to destination image data, 4 bytes per pixel (RGBA)
     * @param w      width of the image to render
     * @param h      height of the image to render
     * @param stride number of bytes per scaleline in the destination buffer
     */
    public static void nsvgRasterize(@NativeType("NSVGrasterizer *") long r, @NativeType("NSVGimage *") NSVGImage image, float tx, float ty, float scale, @NativeType("unsigned char *") ByteBuffer dst, int w, int h, int stride) {
        if (CHECKS) {
            check(r);
            check(dst, h * stride);
        }
        nnsvgRasterize(r, image.address(), tx, ty, scale, memAddress(dst), w, h, stride);
    }

    // --- [ nsvgDeleteRasterizer ] ---

    /** Unsafe version of: {@link #nsvgDeleteRasterizer DeleteRasterizer} */
    public static native void nnsvgDeleteRasterizer(long rasterizer);

    /**
     * Deletes rasterizer context.
     *
     * @param rasterizer the rasterizer context to delete
     */
    public static void nsvgDeleteRasterizer(@NativeType("NSVGrasterizer *") long rasterizer) {
        if (CHECKS) {
            check(rasterizer);
        }
        nnsvgDeleteRasterizer(rasterizer);
    }

}