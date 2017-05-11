/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val ANGLE_texture_compression_dxt1 = "ANGLETextureCompressionDXT1".nativeClassGLES("ANGLE_texture_compression_dxt1", postfix = ANGLE) {
    documentation =
        "Native bindings to the ${registryLink("ANGLE", "ANGLE_texture_compression_dxt")} extension."

    IntConstant(
        "Accepted by the {@code internalformat} parameter of CompressedTexImage2D and the {@code format} parameter of CompressedTexSubImage2D.",

        "COMPRESSED_RGB_S3TC_DXT1_ANGLE"..0x83F0,
        "COMPRESSED_RGBA_S3TC_DXT1_ANGLE"..0x83F1
    )
}

val ANGLE_texture_compression_dxt3 = "ANGLETextureCompressionDXT3".nativeClassGLES("ANGLE_texture_compression_dxt3", postfix = ANGLE) {
    documentation =
        "Native bindings to the ${registryLink("ANGLE", "ANGLE_texture_compression_dxt")} extension."

    IntConstant(
        "Accepted by the {@code internalformat} parameter of CompressedTexImage2D and the {@code format} parameter of CompressedTexSubImage2D.",

        "COMPRESSED_RGBA_S3TC_DXT3_ANGLE"..0x83F2
    )
}

val ANGLE_texture_compression_dxt5 = "ANGLETextureCompressionDXT5".nativeClassGLES("ANGLE_texture_compression_dxt5", postfix = ANGLE) {
    documentation =
        "Native bindings to the ${registryLink("ANGLE", "ANGLE_texture_compression_dxt")} extension."

    IntConstant(
        "Accepted by the {@code internalformat} parameter of CompressedTexImage2D and the {@code format} parameter of CompressedTexSubImage2D.",

        "COMPRESSED_RGBA_S3TC_DXT5_ANGLE"..0x83F3
    )
}