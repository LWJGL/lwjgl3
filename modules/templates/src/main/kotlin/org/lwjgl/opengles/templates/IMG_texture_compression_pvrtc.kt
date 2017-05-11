/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val IMG_texture_compression_pvrtc = "IMGTextureCompressionPVRTC".nativeClassGLES("IMG_texture_compression_pvrtc", postfix = IMG) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides additional texture compression functionality specific to Imagination Technologies PowerVR Texture compression format (called
        PVRTC) subject to all the requirements and limitations described by the OpenGL 1.3 specifications.

        This extension supports 4 and 2 bit per pixel texture compression formats. Because the compression of PVRTC is very CPU intensive, it is not
        appropriate to carry out compression on the target platform. Therefore this extension only supports the loading of compressed texture data.
        """

    IntConstant(
        "Accepted by the {@code internalformat} parameter of CompressedTexImage2D and the {@code format} parameter of CompressedTexSubImage2D.",

        "COMPRESSED_RGB_PVRTC_4BPPV1_IMG"..0x8C00,
        "COMPRESSED_RGB_PVRTC_2BPPV1_IMG"..0x8C01,
        "COMPRESSED_RGBA_PVRTC_4BPPV1_IMG"..0x8C02,
        "COMPRESSED_RGBA_PVRTC_2BPPV1_IMG"..0x8C03
    )
}