/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_sRGB_formats = "NVSRGBFormats".nativeClassGLES("NV_sRGB_formats", postfix = NV) {
    IntConstant(
        "SLUMINANCE_NV"..0x8C46,
        "SLUMINANCE_ALPHA_NV"..0x8C44
    )

    IntConstant(
        "SRGB8_NV"..0x8C41
    )

    IntConstant(
        "SLUMINANCE8_NV"..0x8C47,
        "SLUMINANCE8_ALPHA8_NV"..0x8C45
    )

    IntConstant(
        "COMPRESSED_SRGB_S3TC_DXT1_NV"..0x8C4C,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT1_NV"..0x8C4D,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT3_NV"..0x8C4E,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT5_NV"..0x8C4F
    )
}