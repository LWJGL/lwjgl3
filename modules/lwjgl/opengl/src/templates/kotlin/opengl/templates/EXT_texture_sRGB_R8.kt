/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*
import org.lwjgl.generator.*

val EXT_texture_sRGB_R8 = "EXTTextureSRGBR8".nativeClassGL("EXT_texture_sRGB_R8", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces #SR8_EXT as an acceptable internal format. This allows efficient sRGB sampling for source images stored as a separate texture
        per channel.

        Requires ${GL12.core}.
        """

    IntConstant(
        """
        Accepted by the {@code internalformat} parameters of #TexImage3D(), #TexImage2D(), #TexImage1D(), #TexStorage3D(), #TexStorage2D(), #TexStorage1D(),
        #TextureStorage3D(), #TextureStorage2D(), and #TextureStorage1D().
        """,

        "SR8_EXT"..0x8FBD
    )
}