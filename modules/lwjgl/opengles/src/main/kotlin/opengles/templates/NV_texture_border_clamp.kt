/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_texture_border_clamp = "NVTextureBorderClamp".nativeClassGLES("NV_texture_border_clamp", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        OpenGL ES provides only a single clamping wrap mode: CLAMP_TO_EDGE. However, the ability to clamp to a constant border color can be useful to quickly
        detect texture coordinates that exceed their expected limits or to dummy out any such accesses with transparency or a neutral color in tiling or light
        maps.

        This extension defines an additional texture clamping algorithm. CLAMP_TO_BORDER_NV clamps texture coordinates at all mipmap levels such that NEAREST
        and LINEAR filters of clamped coordinates return only the constant border color. This does not add the ability for textures to specify borders using
        glTexImage2D, but only to clamp to a constant border value set using glTexParameter.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameteri, TexParameterf, TexParameteriv, and TexParameterfv.",

        "TEXTURE_BORDER_COLOR_NV"..0x1004
    )

    IntConstant(
        """
        Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
        and returned by the {@code params} parameter of GetTexParameteriv and GetTexParameterfv when their {@code pname} parameter is TEXTURE_WRAP_S,
        TEXTURE_WRAP_T, or TEXTURE_WRAP_R_OES.
        """,

        "CLAMP_TO_BORDER_NV"..0x812D
    )
}