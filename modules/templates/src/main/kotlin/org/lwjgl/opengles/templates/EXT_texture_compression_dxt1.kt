/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_texture_compression_dxt1 = "EXTTextureCompressionDXT1".nativeClassGLES("EXT_texture_compression_dxt1", postfix = EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "texture_compression_dxt1")} extension.

        Support of EXT_texture_compression_s3tc is attractive for OpenGL-ES implementations because it provides compressed textures that allow for
        significantly reduced texture storage. Reducing texture storage is advantageous because of the smaller memory capacity of many embedded systems
        compared to desktop systems. Smaller textures also provide a welcome performance advantage since embedded platforms typically provide less performance
        than desktop systems. S3TC compressed textures are widely supported and used by applications. The DXT1 format is used in the vast majority of cases in
        which S3TC compressed textures are used.

        However, EXT_texture_compression_s3tc specifies functionality that is burdensome for an OpenGL-ES implementation. In particular it requires that the
        driver provide the capability to compress textures into S3TC texture formats, as an S3TC texture format is accepted as the {@code internalformat}
        parameter of TexImage2D and CopyTexImage2D. Further, EXT_texture_compression_s3tc may require conversion from one S3TC format to another during
        CompressedTexSubImage2D if the {@code format} parameter does not match the <internalformat> of the texture image previously created by TexImage2D.

        In an OpenGL-ES implementation it is therefore advantageous to support a limited subset of EXT_texture_compression_s3tc: Restrict supported texture
        formats to DXT1 and restrict supported operations to those that do not require texture compression into an S3TC texture format or decompression from an
        S3TC texture format.
        """

    IntConstant(
        "Accepted by the {@code internalformat} parameter of CompressedTexImage2D and the {@code format} parameter of CompressedTexSubImage2D.",

        "COMPRESSED_RGB_S3TC_DXT1_EXT"..0x83F0,
        "COMPRESSED_RGBA_S3TC_DXT1_EXT"..0x83F1
    )
}