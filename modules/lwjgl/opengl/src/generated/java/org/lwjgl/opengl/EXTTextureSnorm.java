/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_snorm.txt">EXT_texture_snorm</a> extension.
 * 
 * <p>Fixed-point textures in unextended OpenGL have integer components, but those values are taken to represent floating-point values in the range
 * [0.0,1.0]. These integer components are considered "unsigned normalized" integers. When such a texture is accessed by a shader or by fixed-function
 * fragment processing, floating-point values are returned in the range [0.0,1.0].</p>
 * 
 * <p>This extension provides a set of new "signed normalized" integer texture formats. These are taken to represent a floating-point value in the range
 * [-1.0,1.0] with an exact 0.0.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}.</p>
 */
public final class EXTTextureSnorm {

    /** ccepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D. */
    public static final int
        GL_RED_SNORM                 = 0x8F90,
        GL_RG_SNORM                  = 0x8F91,
        GL_RGB_SNORM                 = 0x8F92,
        GL_RGBA_SNORM                = 0x8F93,
        GL_ALPHA_SNORM               = 0x9010,
        GL_LUMINANCE_SNORM           = 0x9011,
        GL_LUMINANCE_ALPHA_SNORM     = 0x9012,
        GL_INTENSITY_SNORM           = 0x9013,
        GL_R8_SNORM                  = 0x8F94,
        GL_RG8_SNORM                 = 0x8F95,
        GL_RGB8_SNORM                = 0x8F96,
        GL_RGBA8_SNORM               = 0x8F97,
        GL_ALPHA8_SNORM              = 0x9014,
        GL_LUMINANCE8_SNORM          = 0x9015,
        GL_LUMINANCE8_ALPHA8_SNORM   = 0x9016,
        GL_INTENSITY8_SNORM          = 0x9017,
        GL_R16_SNORM                 = 0x8F98,
        GL_RG16_SNORM                = 0x8F99,
        GL_RGB16_SNORM               = 0x8F9A,
        GL_RGBA16_SNORM              = 0x8F9B,
        GL_ALPHA16_SNORM             = 0x9018,
        GL_LUMINANCE16_SNORM         = 0x9019,
        GL_LUMINANCE16_ALPHA16_SNORM = 0x901A,
        GL_INTENSITY16_SNORM         = 0x901B;

    /** Returned by GetTexLevelParmeter. */
    public static final int GL_SIGNED_NORMALIZED = 0x8F9C;

    private EXTTextureSnorm() {}

}