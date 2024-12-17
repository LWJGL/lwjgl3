/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_filter_anisotropic = "EXTTextureFilterAnisotropic".nativeClassGLES("EXT_texture_filter_anisotropic", postfix = EXT) {
    IntConstant(
        "TEXTURE_MAX_ANISOTROPY_EXT"..0x84FE
    )

    IntConstant(
        "MAX_TEXTURE_MAX_ANISOTROPY_EXT"..0x84FF
    )
}