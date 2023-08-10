/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_shared_exponent.txt">EXT_texture_shared_exponent</a> extension.
 * 
 * <p>Existing texture formats provide either fixed-point formats with limited range and precision but with compact encodings (allowing 32 or fewer bits per
 * multi-component texel), or floating-point formats with tremendous range and precision but without compact encodings (typically 16 or 32 bits per
 * component).</p>
 * 
 * <p>This extension adds a new packed format and new internal texture format for encoding 3-component vectors (typically RGB colors) with a single 5-bit
 * exponent (biased up by 15) and three 9-bit mantissas for each respective component. There is no sign bit so all three components must be non-negative.
 * The fractional mantissas are stored without an implied 1 to the left of the decimal point. Neither infinity nor not-a-number (NaN) are representable in
 * this shared exponent format.</p>
 * 
 * <p>This 32 bits/texel shared exponent format is particularly well-suited to high dynamic range (HDR) applications where light intensity is typically stored
 * as non-negative red, green, and blue components with considerable range.</p>
 * 
 * <p>Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public final class EXTTextureSharedExponent {

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorageEXT. */
    public static final int GL_RGB9_E5_EXT = 0x8C3D;

    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
     * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
     * GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
     */
    public static final int GL_UNSIGNED_INT_5_9_9_9_REV_EXT = 0x8C3E;

    /** Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv. */
    public static final int GL_TEXTURE_SHARED_SIZE_EXT = 0x8C3F;

    private EXTTextureSharedExponent() {}

}