/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_border_clamp = "ARBTextureBorderClamp".nativeClassGL("ARB_texture_border_clamp", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The base OpenGL provides clamping such that the texture coordinates are limited to exactly the range [0,1]. When a texture coordinate is clamped using
        this algorithm, the texture sampling filter straddles the edge of the texture image, taking 1/2 its sample values from within the texture image, and the
        other 1/2 from the texture border. It is sometimes desirable for a texture to be clamped to the border color, rather than to an average of the border
        and edge colors.

        This extension defines an additional texture clamping algorithm. #CLAMP_TO_BORDER_ARB clamps texture coordinates at all mipmap levels such that
        #NEAREST and #LINEAR filters return only the color of the border texels.

        ${GL13.promoted}
        """

    IntConstant(
        """
        Accepted by the {@code param} parameter of #TexParameteri() and #TexParameterf(), and by the {@code params} parameter of #TexParameteriv()
        and #TexParameterfv(), when their {@code pname} parameter is #TEXTURE_WRAP_S, #TEXTURE_WRAP_T, or #TEXTURE_WRAP_R.
        """,

        "CLAMP_TO_BORDER_ARB"..0x812D
    )

}