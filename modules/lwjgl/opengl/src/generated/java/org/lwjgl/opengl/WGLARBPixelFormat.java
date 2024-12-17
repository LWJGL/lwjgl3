/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class WGLARBPixelFormat {

    public static final int
        WGL_NUMBER_PIXEL_FORMATS_ARB    = 0x2000,
        WGL_DRAW_TO_WINDOW_ARB          = 0x2001,
        WGL_DRAW_TO_BITMAP_ARB          = 0x2002,
        WGL_ACCELERATION_ARB            = 0x2003,
        WGL_NEED_PALETTE_ARB            = 0x2004,
        WGL_NEED_SYSTEM_PALETTE_ARB     = 0x2005,
        WGL_SWAP_LAYER_BUFFERS_ARB      = 0x2006,
        WGL_SWAP_METHOD_ARB             = 0x2007,
        WGL_NUMBER_OVERLAYS_ARB         = 0x2008,
        WGL_NUMBER_UNDERLAYS_ARB        = 0x2009,
        WGL_TRANSPARENT_ARB             = 0x200A,
        WGL_TRANSPARENT_RED_VALUE_ARB   = 0x2037,
        WGL_TRANSPARENT_GREEN_VALUE_ARB = 0x2038,
        WGL_TRANSPARENT_BLUE_VALUE_ARB  = 0x2039,
        WGL_TRANSPARENT_ALPHA_VALUE_ARB = 0x203A,
        WGL_TRANSPARENT_INDEX_VALUE_ARB = 0x203B,
        WGL_SHARE_DEPTH_ARB             = 0x200C,
        WGL_SHARE_STENCIL_ARB           = 0x200D,
        WGL_SHARE_ACCUM_ARB             = 0x200E,
        WGL_SUPPORT_GDI_ARB             = 0x200F,
        WGL_SUPPORT_OPENGL_ARB          = 0x2010,
        WGL_DOUBLE_BUFFER_ARB           = 0x2011,
        WGL_STEREO_ARB                  = 0x2012,
        WGL_PIXEL_TYPE_ARB              = 0x2013,
        WGL_COLOR_BITS_ARB              = 0x2014,
        WGL_RED_BITS_ARB                = 0x2015,
        WGL_RED_SHIFT_ARB               = 0x2016,
        WGL_GREEN_BITS_ARB              = 0x2017,
        WGL_GREEN_SHIFT_ARB             = 0x2018,
        WGL_BLUE_BITS_ARB               = 0x2019,
        WGL_BLUE_SHIFT_ARB              = 0x201A,
        WGL_ALPHA_BITS_ARB              = 0x201B,
        WGL_ALPHA_SHIFT_ARB             = 0x201C,
        WGL_ACCUM_BITS_ARB              = 0x201D,
        WGL_ACCUM_RED_BITS_ARB          = 0x201E,
        WGL_ACCUM_GREEN_BITS_ARB        = 0x201F,
        WGL_ACCUM_BLUE_BITS_ARB         = 0x2020,
        WGL_ACCUM_ALPHA_BITS_ARB        = 0x2021,
        WGL_DEPTH_BITS_ARB              = 0x2022,
        WGL_STENCIL_BITS_ARB            = 0x2023,
        WGL_AUX_BUFFERS_ARB             = 0x2024;

    public static final int
        WGL_NO_ACCELERATION_ARB      = 0x2025,
        WGL_GENERIC_ACCELERATION_ARB = 0x2026,
        WGL_FULL_ACCELERATION_ARB    = 0x2027,
        WGL_SWAP_EXCHANGE_ARB        = 0x2028,
        WGL_SWAP_COPY_ARB            = 0x2029,
        WGL_SWAP_UNDEFINED_ARB       = 0x202A,
        WGL_TYPE_RGBA_ARB            = 0x202B,
        WGL_TYPE_COLORINDEX_ARB      = 0x202C;

    protected WGLARBPixelFormat() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglGetPixelFormatAttribivARB ] ---

    /** {@code BOOL wglGetPixelFormatAttribivARB(HDC hdc, int pixelFormat, int layerPlane, UINT n, int const * attributes, int * values)} */
    public static int nwglGetPixelFormatAttribivARB(long hdc, int pixelFormat, int layerPlane, int n, long attributes, long values) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetPixelFormatAttribivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
        }
        return callPPPI(hdc, pixelFormat, layerPlane, n, attributes, values, __functionAddress);
    }

    /** {@code BOOL wglGetPixelFormatAttribivARB(HDC hdc, int pixelFormat, int layerPlane, UINT n, int const * attributes, int * values)} */
    @NativeType("BOOL")
    public static boolean wglGetPixelFormatAttribivARB(@NativeType("HDC") long hdc, int pixelFormat, int layerPlane, @NativeType("int const *") IntBuffer attributes, @NativeType("int *") IntBuffer values) {
        if (CHECKS) {
            check(values, attributes.remaining());
        }
        return nwglGetPixelFormatAttribivARB(hdc, pixelFormat, layerPlane, attributes.remaining(), memAddress(attributes), memAddress(values)) != 0;
    }

    /** {@code BOOL wglGetPixelFormatAttribivARB(HDC hdc, int pixelFormat, int layerPlane, UINT n, int const * attributes, int * values)} */
    @NativeType("BOOL")
    public static boolean wglGetPixelFormatAttribiARB(@NativeType("HDC") long hdc, int pixelFormat, int layerPlane, @NativeType("int const *") int attribute, @NativeType("int *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer attributes = stack.ints(attribute);
            return nwglGetPixelFormatAttribivARB(hdc, pixelFormat, layerPlane, 1, memAddress(attributes), memAddress(values)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ wglGetPixelFormatAttribfvARB ] ---

    /** {@code BOOL wglGetPixelFormatAttribfvARB(HDC hdc, int pixelFormat, int layerPlane, UINT n, int const * attributes, FLOAT * values)} */
    public static int nwglGetPixelFormatAttribfvARB(long hdc, int pixelFormat, int layerPlane, int n, long attributes, long values) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetPixelFormatAttribfvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
        }
        return callPPPI(hdc, pixelFormat, layerPlane, n, attributes, values, __functionAddress);
    }

    /** {@code BOOL wglGetPixelFormatAttribfvARB(HDC hdc, int pixelFormat, int layerPlane, UINT n, int const * attributes, FLOAT * values)} */
    @NativeType("BOOL")
    public static boolean wglGetPixelFormatAttribfvARB(@NativeType("HDC") long hdc, int pixelFormat, int layerPlane, @NativeType("int const *") IntBuffer attributes, @NativeType("FLOAT *") FloatBuffer values) {
        if (CHECKS) {
            check(values, attributes.remaining());
        }
        return nwglGetPixelFormatAttribfvARB(hdc, pixelFormat, layerPlane, attributes.remaining(), memAddress(attributes), memAddress(values)) != 0;
    }

    /** {@code BOOL wglGetPixelFormatAttribfvARB(HDC hdc, int pixelFormat, int layerPlane, UINT n, int const * attributes, FLOAT * values)} */
    @NativeType("BOOL")
    public static boolean wglGetPixelFormatAttribfARB(@NativeType("HDC") long hdc, int pixelFormat, int layerPlane, @NativeType("int const *") int attribute, @NativeType("FLOAT *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer attributes = stack.ints(attribute);
            return nwglGetPixelFormatAttribfvARB(hdc, pixelFormat, layerPlane, 1, memAddress(attributes), memAddress(values)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ wglChoosePixelFormatARB ] ---

    /** {@code BOOL wglChoosePixelFormatARB(HDC hdc, int const * attribIList, FLOAT const * attribFList, UINT maxFormats, int * formats, UINT * numFormats)} */
    public static int nwglChoosePixelFormatARB(long hdc, long attribIList, long attribFList, int maxFormats, long formats, long numFormats) {
        long __functionAddress = GL.getCapabilitiesWGL().wglChoosePixelFormatARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
        }
        return callPPPPPI(hdc, attribIList, attribFList, maxFormats, formats, numFormats, __functionAddress);
    }

    /** {@code BOOL wglChoosePixelFormatARB(HDC hdc, int const * attribIList, FLOAT const * attribFList, UINT maxFormats, int * formats, UINT * numFormats)} */
    @NativeType("BOOL")
    public static boolean wglChoosePixelFormatARB(@NativeType("HDC") long hdc, @NativeType("int const *") @Nullable IntBuffer attribIList, @NativeType("FLOAT const *") @Nullable FloatBuffer attribFList, @NativeType("int *") IntBuffer formats, @NativeType("UINT *") IntBuffer numFormats) {
        if (CHECKS) {
            checkNTSafe(attribIList);
            checkNTSafe(attribFList);
            check(numFormats, 1);
        }
        return nwglChoosePixelFormatARB(hdc, memAddressSafe(attribIList), memAddressSafe(attribFList), formats.remaining(), memAddress(formats), memAddress(numFormats)) != 0;
    }

    /** {@code BOOL wglGetPixelFormatAttribivARB(HDC hdc, int pixelFormat, int layerPlane, UINT n, int const * attributes, int * values)} */
    @NativeType("BOOL")
    public static boolean wglGetPixelFormatAttribivARB(@NativeType("HDC") long hdc, int pixelFormat, int layerPlane, @NativeType("int const *") int[] attributes, @NativeType("int *") int[] values) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetPixelFormatAttribivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
            check(values, attributes.length);
        }
        return callPPPI(hdc, pixelFormat, layerPlane, attributes.length, attributes, values, __functionAddress) != 0;
    }

    /** {@code BOOL wglGetPixelFormatAttribfvARB(HDC hdc, int pixelFormat, int layerPlane, UINT n, int const * attributes, FLOAT * values)} */
    @NativeType("BOOL")
    public static boolean wglGetPixelFormatAttribfvARB(@NativeType("HDC") long hdc, int pixelFormat, int layerPlane, @NativeType("int const *") int[] attributes, @NativeType("FLOAT *") float[] values) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetPixelFormatAttribfvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
            check(values, attributes.length);
        }
        return callPPPI(hdc, pixelFormat, layerPlane, attributes.length, attributes, values, __functionAddress) != 0;
    }

    /** {@code BOOL wglChoosePixelFormatARB(HDC hdc, int const * attribIList, FLOAT const * attribFList, UINT maxFormats, int * formats, UINT * numFormats)} */
    @NativeType("BOOL")
    public static boolean wglChoosePixelFormatARB(@NativeType("HDC") long hdc, @NativeType("int const *") int @Nullable [] attribIList, @NativeType("FLOAT const *") float @Nullable [] attribFList, @NativeType("int *") int[] formats, @NativeType("UINT *") int[] numFormats) {
        long __functionAddress = GL.getCapabilitiesWGL().wglChoosePixelFormatARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
            checkNTSafe(attribIList);
            checkNTSafe(attribFList);
            check(numFormats, 1);
        }
        return callPPPPPI(hdc, attribIList, attribFList, formats.length, formats, numFormats, __functionAddress) != 0;
    }

}