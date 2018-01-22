/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val IMG_texture_compression_pvrtc2 = "IMGTextureCompressionPVRTC2".nativeClassGLES("IMG_texture_compression_pvrtc2", postfix = IMG) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides additional texture compression functionality specific to Imagination Technologies PowerVR Texture compression format (called
        PVRTC2) subject to all the requirements and limitations described by the OpenGL ES 2.0 specification.

        This extension supports 4 and 2 bit per pixel texture compression formats. Because the compression of PVRTC2 is CPU intensive, it is not appropriate to
        carry out compression on the target platform. Therefore this extension only supports the loading of compressed texture data.

        Requires ${GLES20.core} and ${OES_texture_npot.capLink}.
        """

    IntConstant(
        "Accepted by the {@code internalformat} parameter of CompressedTexImage2D and the {@code format} parameter of CompressedTexSubImage2D.",

        "COMPRESSED_RGBA_PVRTC_2BPPV2_IMG"..0x9137,
        "COMPRESSED_RGBA_PVRTC_4BPPV2_IMG"..0x9138
    )
}