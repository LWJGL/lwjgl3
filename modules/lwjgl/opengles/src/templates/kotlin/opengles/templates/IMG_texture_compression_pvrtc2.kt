/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val IMG_texture_compression_pvrtc2 = "IMGTextureCompressionPVRTC2".nativeClassGLES("IMG_texture_compression_pvrtc2", postfix = IMG) {
    IntConstant(
        "COMPRESSED_RGBA_PVRTC_2BPPV2_IMG"..0x9137,
        "COMPRESSED_RGBA_PVRTC_4BPPV2_IMG"..0x9138
    )
}