/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_texture_snorm = "EXTTextureSnorm".nativeClassGL("EXT_texture_snorm", postfix = EXT) {
    IntConstant(
        "RED_SNORM"..0x8F90,
        "RG_SNORM"..0x8F91,
        "RGB_SNORM"..0x8F92,
        "RGBA_SNORM"..0x8F93,
        "ALPHA_SNORM"..0x9010,
        "LUMINANCE_SNORM"..0x9011,
        "LUMINANCE_ALPHA_SNORM"..0x9012,
        "INTENSITY_SNORM"..0x9013,
        "R8_SNORM"..0x8F94,
        "RG8_SNORM"..0x8F95,
        "RGB8_SNORM"..0x8F96,
        "RGBA8_SNORM"..0x8F97,
        "ALPHA8_SNORM"..0x9014,
        "LUMINANCE8_SNORM"..0x9015,
        "LUMINANCE8_ALPHA8_SNORM"..0x9016,
        "INTENSITY8_SNORM"..0x9017,
        "R16_SNORM"..0x8F98,
        "RG16_SNORM"..0x8F99,
        "RGB16_SNORM"..0x8F9A,
        "RGBA16_SNORM"..0x8F9B,
        "ALPHA16_SNORM"..0x9018,
        "LUMINANCE16_SNORM"..0x9019,
        "LUMINANCE16_ALPHA16_SNORM"..0x901A,
        "INTENSITY16_SNORM"..0x901B
    )

    IntConstant(
        "SIGNED_NORMALIZED"..0x8F9C
    )
}