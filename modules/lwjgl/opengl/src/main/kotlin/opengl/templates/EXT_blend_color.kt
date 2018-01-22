/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_blend_color = "EXTBlendColor".nativeClassGL("EXT_blend_color", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Blending capability is extended by defining a constant color that can be included in blending equations. A typical usage is blending two RGB images.
        Without the constant blend factor, one image must have an alpha channel with each pixel set to the desired blend factor.

        ${GL14.promoted}
        """

    IntConstant(
        "Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc.",

        "CONSTANT_COLOR_EXT"..0x8001,
        "ONE_MINUS_CONSTANT_COLOR_EXT"..0x8002,
        "CONSTANT_ALPHA_EXT"..0x8003,
        "ONE_MINUS_CONSTANT_ALPHA_EXT"..0x8004
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "BLEND_COLOR_EXT"..0x8005
    )

    void(
        "BlendColorEXT",
        "",

        GLfloat.IN("red", ""),
        GLfloat.IN("green", ""),
        GLfloat.IN("blue", ""),
        GLfloat.IN("alpha", "")
    )
}