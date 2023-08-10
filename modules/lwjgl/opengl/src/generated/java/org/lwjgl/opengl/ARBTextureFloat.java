/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_float.txt">ARB_texture_float</a> extension.
 * 
 * <p>This extension adds texture internal formats with 16- and 32-bit floating-point components. The 32-bit floating-point components are in the standard
 * IEEE float format. The 16-bit floating-point components have 1 sign bit, 5 exponent bits, and 10 mantissa bits. Floating-point components are clamped to
 * the limits of the range representable by their format.</p>
 * 
 * <p>Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public final class ARBTextureFloat {

    /** Accepted by the {@code value} parameter of GetTexLevelParameter. */
    public static final int
        GL_TEXTURE_RED_TYPE_ARB       = 0x8C10,
        GL_TEXTURE_GREEN_TYPE_ARB     = 0x8C11,
        GL_TEXTURE_BLUE_TYPE_ARB      = 0x8C12,
        GL_TEXTURE_ALPHA_TYPE_ARB     = 0x8C13,
        GL_TEXTURE_LUMINANCE_TYPE_ARB = 0x8C14,
        GL_TEXTURE_INTENSITY_TYPE_ARB = 0x8C15,
        GL_TEXTURE_DEPTH_TYPE_ARB     = 0x8C16;

    /** Returned by the {@code params} parameter of GetTexLevelParameter. */
    public static final int GL_UNSIGNED_NORMALIZED_ARB = 0x8C17;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D. */
    public static final int
        GL_RGBA32F_ARB            = 0x8814,
        GL_RGB32F_ARB             = 0x8815,
        GL_ALPHA32F_ARB           = 0x8816,
        GL_INTENSITY32F_ARB       = 0x8817,
        GL_LUMINANCE32F_ARB       = 0x8818,
        GL_LUMINANCE_ALPHA32F_ARB = 0x8819,
        GL_RGBA16F_ARB            = 0x881A,
        GL_RGB16F_ARB             = 0x881B,
        GL_ALPHA16F_ARB           = 0x881C,
        GL_INTENSITY16F_ARB       = 0x881D,
        GL_LUMINANCE16F_ARB       = 0x881E,
        GL_LUMINANCE_ALPHA16F_ARB = 0x881F;

    private ARBTextureFloat() {}

}