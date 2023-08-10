/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ATI/WGL_ATI_pixel_format_float.txt">WGL_ATI_pixel_format_float</a> extension.
 * 
 * <p>This extension adds pixel formats with floating-point RGBA color components.</p>
 * 
 * <p>The size of each float components is specified using the same WGL_RED_BITS_ARB, WGL_GREEN_BITS_ARB, WGL_BLUE_BITS_ARB and WGL_ALPHA_BITS_ARB pixel
 * format attributes that are used for defining the size of fixed-point components. 32 bit floating- point components are in the standard IEEE float
 * format. 16 bit floating-point components have 1 sign bit, 5 exponent bits, and 10 mantissa bits.</p>
 * 
 * <p>In standard OpenGL RGBA color components are normally clamped to the range [0,1]. The color components of a float buffer are clamped to the limits of
 * the range representable by their format.</p>
 * 
 * <p>Requires {@link WGLARBPixelFormat WGL_ARB_pixel_format}.</p>
 */
public final class WGLATIPixelFormatFloat {

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        WGL_RGBA_FLOAT_MODE_ATI             = 0x8820,
        WGL_COLOR_CLEAR_UNCLAMPED_VALUE_ATI = 0x8835;

    /**
     * Accepted as a value in the {@code piAttribIList} and {@code pfAttribFList} parameter arrays of wglChoosePixelFormatARB, and returned in the
     * {@code piValues} parameter array of wglGetPixelFormatAttribivARB, and the {@code pfValues} parameter array of wglGetPixelFormatAttribfvARB.
     */
    public static final int WGL_TYPE_RGBA_FLOAT_ATI = 0x21A0;

    private WGLATIPixelFormatFloat() {}

}