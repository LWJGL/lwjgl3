/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val APPLE_texture_packed_float = "APPLETexturePackedFloat".nativeClassGLES("APPLE_texture_packed_float", postfix = APPLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds two new 3-component floating-point texture formats that fit within a single 32-bit word called R11F_G11F_B10F and RGB9_E5

        The first RGB format, R11F_G11F_B10F, stores 5 bits of biased exponent per component in the same manner as 16-bit floating-point formats, but rather
        than 10 mantissa bits, the red, green, and blue components have 6, 6, and 5 bits respectively. Each mantissa is assumed to have an implied leading one
        except in the denorm exponent case. There is no sign bit so only non-negative values can be represented. Positive infinity, positivedenorms, and
        positive NaN values are representable. The value of the fourth component returned by a texture fetch is always 1.0.

        The second RGB format, RGB9_E5, stores a single 5-bit exponent (biased up by 15) and three 9-bit mantissas for each respective component. There is no
        sign bit so all three components must be non-negative. The fractional mantissas are stored without an implied 1 to the left of the decimal point.
        Neither infinity nor not-a-number (NaN) are representable in this shared exponent format.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code type} parameter of TexImage2D and TexSubImage2D.",

        "UNSIGNED_INT_10F_11F_11F_REV_APPLE"..0x8C3B,
        "UNSIGNED_INT_5_9_9_9_REV_APPLE"..0x8C3E
    )

    IntConstant(
        "Accepted by the {@code internalformat} parameter of TexStorage2DEXT.",

        "R11F_G11F_B10F_APPLE"..0x8C3A,
        "RGB9_E5_APPLE"..0x8C3D
    )
}