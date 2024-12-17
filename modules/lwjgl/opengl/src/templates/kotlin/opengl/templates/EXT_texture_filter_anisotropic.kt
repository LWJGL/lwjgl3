/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_texture_filter_anisotropic = "EXTTextureFilterAnisotropic".nativeClassGL("EXT_texture_filter_anisotropic", postfix = EXT) {
    IntConstant(
        "TEXTURE_MAX_ANISOTROPY_EXT"..0x84FE
    )

    IntConstant(
        "MAX_TEXTURE_MAX_ANISOTROPY_EXT"..0x84FF
    )
}