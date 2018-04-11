/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_shadow = "ARBShadow".nativeClassGL("ARB_shadow", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension supports comparing the texture R coordinate to a depth texture value in order to produce a boolean texture value. This can be used to
        implement shadow maps.

        The extension is written in generic terms such that other texture comparison modes can be accommodated in the future.

        Requires ${ARB_depth_texture.link}. ${GL14.promoted}
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv.",

        "TEXTURE_COMPARE_MODE_ARB"..0x884C,
        "TEXTURE_COMPARE_FUNC_ARB"..0x884D
    )

    IntConstant(
        """
        Accepted by the {@code param} parameter of TexParameterf, TexParameteri, TexParameterfv, and TexParameteriv when the {@code pname} parameter is
        TEXTURE_COMPARE_MODE_ARB.
        """,

        "COMPARE_R_TO_TEXTURE_ARB"..0x884E
    )
}