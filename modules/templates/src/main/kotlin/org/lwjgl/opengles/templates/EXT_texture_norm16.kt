/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_texture_norm16 = "EXTTextureNorm16".nativeClassGLES("EXT_texture_norm16", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        OpenGL ES 3.1 supports 8-bit (signed) normalized textures.

        This extension provides a set of new 16 bit signed normalized and unsigned normalized fixed point texture, renderbuffer and texture buffer formats.

        Requires ${GLES31.core}.
        """

    IntConstant(
        """
        Accepted by the {@code internalFormat} parameter of TexImage2D,TexImage3D, TexStorage2D, TexStorage3D and TexStorage2DMultisample,
        TexStorage3DMultisampleOES, TexBufferEXT, TexBufferRangeEXT, TextureViewEXT, RenderbufferStorage and RenderbufferStorageMultisample.
        """,

        "R16_EXT"..0x822A,
        "RG16_EXT"..0x822C,
        "RGBA16_EXT"..0x805B
    )

    IntConstant(
        """
        Accepted by the {@code internalFormat} parameter of TexImage2D,TexImage3D, TexStorage2D, TexStorage3D, TexStorage2DMultisample,
        TexStorage3DMultisampleOES and TextureViewEXT.
        """,

        "RGB16_EXT"..0x8054,
        "R16_SNORM_EXT"..0x8F98,
        "RG16_SNORM_EXT"..0x8F99,
        "RGB16_SNORM_EXT"..0x8F9A,
        "RGBA16_SNORM_EXT"..0x8F9B
    )
}