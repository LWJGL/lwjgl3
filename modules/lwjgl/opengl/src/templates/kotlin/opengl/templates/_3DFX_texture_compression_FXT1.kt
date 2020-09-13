/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val _3DFX_texture_compression_FXT1 = "_3DFXTextureCompressionFXT1".nativeClassGL("3DFX_texture_compression_FXT1", postfix = `3DFX`) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension additional texture compression functionality's FXT1 format, specific to 3dfxsubject to all the requirements and limitations described by
        the extension {@code GL_ARB_texture_compression}. The FXT1 texture format supports only 2D and 3D images without borders.

        Because 3dfx expects to make continual improvement to its FXT1 compressor implementation, 3dfx recommends that to achieve best visual quality
        applications adopt the following procedure with respect to reuse of textures compressed by the GL:
        ${ol(
           "Save the RENDERER and VERSION strings along with images compressed by the GL;",
            "Before reuse of the textures, compare the stored strings with strings newly returned from the current GL;",
            "If out-of-date, repeat the compression and storage steps."
        )}
        
        Requires ${ARB_texture_compression.link}.
        """

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, TexImage3D, CopyTexImage3D, and by the {@code internalformat} and
        {@code format} parameters of CompressedTexImage2D_ARB, CompressedTexSubImage2D_ARB, CompressedTexImage3D_ARB, CompressedTexSubImage3D_ARB.
        """,

        "COMPRESSED_RGB_FXT1_3DFX"..0x86B0,
        "COMPRESSED_RGBA_FXT1_3DFX"..0x86B1
    )
}
