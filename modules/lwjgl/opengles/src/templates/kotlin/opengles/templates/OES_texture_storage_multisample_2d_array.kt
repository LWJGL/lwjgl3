/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_texture_storage_multisample_2d_array = "OESTextureStorageMultisample2DArray".nativeClassGLES("OES_texture_storage_multisample_2d_array", postfix = OES) {
    IntConstant(
        "TEXTURE_2D_MULTISAMPLE_ARRAY_OES"..0x9102
    )

    IntConstant(
        "TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY_OES"..0x9105
    )

    IntConstant(
        "SAMPLER_2D_MULTISAMPLE_ARRAY_OES"..0x910B,
        "INT_SAMPLER_2D_MULTISAMPLE_ARRAY_OES"..0x910C,
        "UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY_OES"..0x910D
    )

    void(
        "TexStorage3DMultisampleOES",

        GLenum("target"),
        GLsizei("samples"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLboolean("fixedsamplelocations")
    )
}