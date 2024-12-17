/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_filter_anisotropic = "ARBTextureFilterAnisotropic".nativeClassGL("ARB_texture_filter_anisotropic") {
    IntConstant(
        "TEXTURE_MAX_ANISOTROPY"..0x84FE
    )

    IntConstant(
        "MAX_TEXTURE_MAX_ANISOTROPY"..0x84FF
    )
}