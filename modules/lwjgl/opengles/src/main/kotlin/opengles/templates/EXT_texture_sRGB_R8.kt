/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_texture_sRGB_R8 = "EXTTextureSRGBR8".nativeClassGLES("EXT_texture_sRGB_R8", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces SR8_EXT as an acceptable internal format. This allows efficient sRGB sampling for source images stored as a separate texture
        per channel.

        Requires ${GLES30.core}.
        """

    IntConstant(
        "Accepted by the {@code internalformat} parameters of TexImage2D, TexImage3D, TexStorage2D and TexStorage3D.",

        "SR8_EXT"..0x8FBD
    )
}