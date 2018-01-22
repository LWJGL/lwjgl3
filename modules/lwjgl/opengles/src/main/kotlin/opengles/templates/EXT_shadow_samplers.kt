/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_shadow_samplers = "EXTShadowSamplers".nativeClassGLES("EXT_shadow_samplers", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension supports comparing the texture R coordinate to a depth texture value returning the result as a float value in the range [0,1]. This can
        be used to implement shadow maps.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv.",

        "TEXTURE_COMPARE_MODE_EXT"..0x884C,
        "TEXTURE_COMPARE_FUNC_EXT"..0x884D
    )

    IntConstant(
        """
        Accepted by the {@code param} parameter of TexParameterf, TexParameteri, TexParameterfv, and TexParameteriv when the {@code pname} parameter is
        TEXTURE_COMPARE_MODE_EXT.
        """,

        "COMPARE_REF_TO_TEXTURE_EXT"..0x884E
    )

    IntConstant(
        "Returned in {@code type} by glGetActiveUniform.",

        "SAMPLER_2D_SHADOW_EXT"..0x8B62
    )
}