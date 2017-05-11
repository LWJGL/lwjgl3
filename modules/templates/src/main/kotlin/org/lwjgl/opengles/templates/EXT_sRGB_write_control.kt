/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_sRGB_write_control = "EXTSRGBWriteControl".nativeClassGLES("EXT_sRGB_write_control", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension's intent is to expose new functionality which allows an application the ability to decide if the conversion from linear space to sRGB is
        necessary by enabling or disabling this conversion at framebuffer write or blending time. An application which passes non-linear vector data to a
        shader may not want the color conversion occurring, and by disabling conversion the application can be simplified, sometimes in very significant and
        more optimal ways.

        Requires ${GLES20.core} and ${EXT_sRGB.link} or ${GLES30.core}.
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetFloatv, GetIntegerv and
        GetInteger64v.
        """,

        "FRAMEBUFFER_SRGB_EXT"..0x8DB9
    )
}