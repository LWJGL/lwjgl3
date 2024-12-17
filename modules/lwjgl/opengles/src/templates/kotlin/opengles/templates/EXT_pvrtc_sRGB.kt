/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_pvrtc_sRGB = "EXTPVRTCSRGB".nativeClassGLES("EXT_pvrtc_sRGB", postfix = EXT) {
    IntConstant(
        "COMPRESSED_SRGB_PVRTC_2BPPV1_EXT"..0x8A54,
        "COMPRESSED_SRGB_PVRTC_4BPPV1_EXT"..0x8A55,
        "COMPRESSED_SRGB_ALPHA_PVRTC_2BPPV1_EXT"..0x8A56,
        "COMPRESSED_SRGB_ALPHA_PVRTC_4BPPV1_EXT"..0x8A57
    )
}