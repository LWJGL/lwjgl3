/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_format_sRGB_override = "EXTTextureFormatSRGBOverride".nativeClassGLES("EXT_texture_format_sRGB_override", postfix = EXT) {
    IntConstant(
        "TEXTURE_FORMAT_SRGB_OVERRIDE_EXT"..0x8FBF
    )
}