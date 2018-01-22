/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_texture_compression_astc_decode_mode = "EXTTextureCompressionASTCDecodeMode".nativeClassGLES("EXT_texture_compression_astc_decode_mode", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Adaptive Scalable Texture Compression (ASTC) is a texture compression technology that is exposed by existing extensions and specifications.

        The existing specifications require that low dynamic range (LDR) textures are decompressed to FP16 values per component. In many cases, decompressing
        LDR textures to a lower precision intermediate result gives acceptable image quality. Source material for LDR textures is typically authored as 8-bit
        UNORM values, so decoding to FP16 values adds little value. On the other hand, reducing precision of the decoded result reduces the size of the
        decompressed data, potentially improving texture cache performance and saving power.

        The goal of this extension is to enable this efficiency gain on existing ASTC texture data. This is achieved by giving the application the ability to
        select the decoding precision.

        Two decoding options are provided by {@code GL_EXT_texture_compression_astc_decode_mode}:
        ${ul(
            "Decode to FP16: This is the default, and matches the required behavior in existing APIs.",
            "Decode to UNORM8: This is provided as an option in LDR mode."
        )}

        If {@code GL_EXT_texture_compression_astc_decode_mode_rgb9e5} is supported, then a third decoding option is provided:
        ${ul(
            """
            Decode to #RGB9_E5: This is provided as an option in both LDR and HDR mode. In this mode, negative values cannot be represented and are clamped to
            zero. The alpha component is ignored, and the results are as if alpha was 1.0.
            """
        )}

        Requires ${GLES30.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameter and GetTexParameter*.",

        "TEXTURE_ASTC_DECODE_PRECISION_EXT"..0x8F69
    )
}