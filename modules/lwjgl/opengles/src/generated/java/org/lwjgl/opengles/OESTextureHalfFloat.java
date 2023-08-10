/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_texture_float.txt">OES_texture_half_float</a> extension.
 * 
 * <p>These extensions add texture formats with 16- (aka half float) and 32-bit floating-point components. The 32-bit floating-point components are in the
 * standard IEEE float format. The 16-bit floating-point components have 1 sign bit, 5 exponent bits, and 10 mantissa bits. Floating-point components are
 * clamped to the limits of the range representable by their format.</p>
 * 
 * <p>The OES_texture_half_float extension string indicates that the implementation supports 16-bit floating pt texture formats.</p>
 * 
 * <p>Both these extensions only require NEAREST magnification filter and NEAREST, and NEAREST_MIPMAP_NEAREST minification filters to be supported.</p>
 */
public final class OESTextureHalfFloat {

    /** Accepted by the {@code type} parameter of TexImage2D, TexSubImage2D, TexImage3D, and TexSubImage3D. */
    public static final int GL_HALF_FLOAT_OES = 0x8D61;

    private OESTextureHalfFloat() {}

}