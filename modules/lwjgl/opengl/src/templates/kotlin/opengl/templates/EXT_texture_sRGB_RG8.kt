/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*
import org.lwjgl.generator.*

val EXT_texture_sRGB_RG8 = "EXTTextureSRGBRG8".nativeClassGL("EXT_texture_sRGB_RG8", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces SRG8_EXT as an acceptable internal format. This allows efficient sRGB sampling for source images stored with 2 channels.

        Requires ${GL12.core}.
        """

    IntConstant(
        "",

        "SRG8_EXT"..0x8FBE
    )
}