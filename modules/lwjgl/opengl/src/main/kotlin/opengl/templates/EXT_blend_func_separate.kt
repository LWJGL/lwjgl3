/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_blend_func_separate = "EXTBlendFuncSeparate".nativeClassGL("EXT_blend_func_separate", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Blending capability is extended by defining a function that allows independent setting of the RGB and alpha blend factors for blend operations that
        require source and destination blend factors. It is not always desired that the blending used for RGB is also applied to alpha.

        ${GL14.promoted}
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "BLEND_DST_RGB_EXT"..0x80C8,
        "BLEND_SRC_RGB_EXT"..0x80C9,
        "BLEND_DST_ALPHA_EXT"..0x80CA,
        "BLEND_SRC_ALPHA_EXT"..0x80CB
    )

    void(
        "BlendFuncSeparateEXT",
        "",

        GLenum.IN("sfactorRGB", ""),
        GLenum.IN("dfactorRGB", ""),
        GLenum.IN("sfactorAlpha", ""),
        GLenum.IN("dfactorAlpha", "")
    )
}