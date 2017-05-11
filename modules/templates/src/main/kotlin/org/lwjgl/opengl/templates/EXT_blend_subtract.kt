/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_blend_subtract = "EXTBlendSubtract".nativeClassGL("EXT_blend_subtract", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Two additional blending equations are specified using the interface defined by ${registryLinkTo("EXT", "blend_minmax.link")}. These equations are similar to the default
        blending equation, but produce the difference of its left and right hand sides, rather than the sum.  Image differences are useful in many image
        processing applications.

        ${GL14.promoted}
        """

    IntConstant(
        "Accepted by the {@code mode} parameter of BlendEquationEXT.",

        "FUNC_SUBTRACT_EXT"..0x800A,
        "FUNC_REVERSE_SUBTRACT_EXT"..0x800B
    )
}