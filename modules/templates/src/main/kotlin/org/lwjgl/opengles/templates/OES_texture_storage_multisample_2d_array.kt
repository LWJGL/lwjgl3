/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_texture_storage_multisample_2d_array = "OESTextureStorageMultisample2DArray".nativeClassGLES("OES_texture_storage_multisample_2d_array", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides support for a new type of immutable texture, two-dimensional multisample array textures. It depends on functionality introduced
        in OpenGL ES 3.1 to support two-dimensional multisample (non-array) textures.
        """

    IntConstant(
        """
        Accepted by the {@code target} parameter of BindTexture, TexStorage3DMultisampleOES, GetInternalformativ, TexParameter{if}*, GetTexParameter{if}v and
        GetTexLevelParameter{if}v. Also, the texture object indicated by the {@code texture} argument to FramebufferTextureLayer can be
        TEXTURE_2D_MULTISAMPLE_ARRAY_OES.
        """,

        "TEXTURE_2D_MULTISAMPLE_ARRAY_OES"..0x9102
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

        "TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY_OES"..0x9105
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "SAMPLER_2D_MULTISAMPLE_ARRAY_OES"..0x910B,
        "INT_SAMPLER_2D_MULTISAMPLE_ARRAY_OES"..0x910C,
        "UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY_OES"..0x910D
    )

    void(
        "TexStorage3DMultisampleOES",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("samples", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLboolean.IN("fixedsamplelocations", "")
    )
}