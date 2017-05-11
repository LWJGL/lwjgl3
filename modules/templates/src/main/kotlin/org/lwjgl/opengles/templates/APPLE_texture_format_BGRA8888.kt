/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val APPLE_texture_format_BGRA8888 = "APPLETextureFormatBGRA8888".nativeClassGLES("APPLE_texture_format_BGRA8888", postfix = APPLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces BGRA_EXT as an acceptable external format. This avoids byte swizzling when loading RGBA internal format textures, which may
        be stored in BGRA order internally.
        """

    IntConstant(
        "Accepted by the {@code format} parameters of TexImage2D and TexSubImage2D.",

        "BGRA_EXT"..0x80E1
    )

    IntConstant(
        "Accepted by the {@code internalformat} parameters of TexStorage2D and TexStorage3D.",

        "BGRA8_EXT"..0x93A1
    )
}