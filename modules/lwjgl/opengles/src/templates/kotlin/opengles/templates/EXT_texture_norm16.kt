/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_norm16 = "EXTTextureNorm16".nativeClassGLES("EXT_texture_norm16", postfix = EXT) {
    IntConstant(
        "R16_EXT"..0x822A,
        "RG16_EXT"..0x822C,
        "RGBA16_EXT"..0x805B
    )

    IntConstant(
        "RGB16_EXT"..0x8054,
        "R16_SNORM_EXT"..0x8F98,
        "RG16_SNORM_EXT"..0x8F99,
        "RGB16_SNORM_EXT"..0x8F9A,
        "RGBA16_SNORM_EXT"..0x8F9B
    )
}