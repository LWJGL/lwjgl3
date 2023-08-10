/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/APPLE/APPLE_texture_packed_float.txt">APPLE_texture_packed_float</a> extension.
 * 
 * <p>This extension adds two new 3-component floating-point texture formats that fit within a single 32-bit word called R11F_G11F_B10F and RGB9_E5</p>
 * 
 * <p>The first RGB format, R11F_G11F_B10F, stores 5 bits of biased exponent per component in the same manner as 16-bit floating-point formats, but rather
 * than 10 mantissa bits, the red, green, and blue components have 6, 6, and 5 bits respectively. Each mantissa is assumed to have an implied leading one
 * except in the denorm exponent case. There is no sign bit so only non-negative values can be represented. Positive infinity, positivedenorms, and
 * positive NaN values are representable. The value of the fourth component returned by a texture fetch is always 1.0.</p>
 * 
 * <p>The second RGB format, RGB9_E5, stores a single 5-bit exponent (biased up by 15) and three 9-bit mantissas for each respective component. There is no
 * sign bit so all three components must be non-negative. The fractional mantissas are stored without an implied 1 to the left of the decimal point.
 * Neither infinity nor not-a-number (NaN) are representable in this shared exponent format.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public final class APPLETexturePackedFloat {

    /** Accepted by the {@code type} parameter of TexImage2D and TexSubImage2D. */
    public static final int
        GL_UNSIGNED_INT_10F_11F_11F_REV_APPLE = 0x8C3B,
        GL_UNSIGNED_INT_5_9_9_9_REV_APPLE     = 0x8C3E;

    /** Accepted by the {@code internalformat} parameter of TexStorage2DEXT. */
    public static final int
        GL_R11F_G11F_B10F_APPLE = 0x8C3A,
        GL_RGB9_E5_APPLE        = 0x8C3D;

    private APPLETexturePackedFloat() {}

}