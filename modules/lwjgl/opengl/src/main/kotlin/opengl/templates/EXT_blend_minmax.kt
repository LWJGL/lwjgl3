/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_blend_minmax = "EXTBlendMinmax".nativeClassGL("EXT_blend_minmax", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Blending capability is extended by respecifying the entire blend equation. While this document defines only two new equations, the #BlendEquationEXT()
        procedure that it defines will be used by subsequent extensions to define additional blending equations.

        The two new equations defined by this extension produce the minimum (or maximum) color components of the source and destination colors. Taking the
        maximum is useful for applications such as maximum projection in medical imaging.

        ${GL14.promoted}
        """

    IntConstant(
        "Accepted by the {@code mode} parameter of BlendEquationEXT.",

        "FUNC_ADD_EXT"..0x8006,
        "MIN_EXT"..0x8007,
        "MAX_EXT"..0x8008
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "BLEND_EQUATION_EXT"..0x8009
    )

    void(
        "BlendEquationEXT",
        "",

        GLenum.IN("mode", "")
    )
}