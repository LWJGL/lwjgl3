/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_format_sRGB_override = "EXTTextureFormatSRGBOverride".nativeClassGLES("EXT_texture_format_sRGB_override", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a new texture parameter to override the internal format of a texture object; allowing a non-sRGB format to be overridden to a
        corresponding sRGB format. For example, an RGB8 texture can be overridden to SRGB8. Such an override will cause the RGB components to be "decoded" from
        sRGB color space to linear as part of texture filtering. This can be useful for applications where a texture was written with sRGB data using
        ${EXT_sRGB_write_control.link} or when sampling from an {@code EGLImage} that is known to contain sRGB color values.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameter of TexParameterf, TexParameterfv, TexParameteri, TexParameteriv, TexParameterIiv, TexParameterIuiv,
        TexParameterIivEXT, TexParameterIuivEXT, GetTexParameterfv, GetTexParameteriv, GetTexParameterIiv, GetTexParameterIuiv, GetTexParameterIivEXT,
        GetTexParameterIuivEXT.
        """,

        "TEXTURE_FORMAT_SRGB_OVERRIDE_EXT"..0x8FBF
    )
}