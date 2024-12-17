/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val IMG_texture_compression_pvrtc = "IMGTextureCompressionPVRTC".nativeClassGLES("IMG_texture_compression_pvrtc", postfix = IMG) {
    IntConstant(
        "COMPRESSED_RGB_PVRTC_4BPPV1_IMG"..0x8C00,
        "COMPRESSED_RGB_PVRTC_2BPPV1_IMG"..0x8C01,
        "COMPRESSED_RGBA_PVRTC_4BPPV1_IMG"..0x8C02,
        "COMPRESSED_RGBA_PVRTC_2BPPV1_IMG"..0x8C03
    )
}