/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_texture_buffer = "OESTextureBuffer".nativeClassGLES("OES_texture_buffer", postfix = OES) {
    IntConstant(
        "TEXTURE_BUFFER_OES"..0x8C2A
    )

    IntConstant(
        "TEXTURE_BUFFER_BINDING_OES"..0x8C2A
    )

    IntConstant(
        "SAMPLER_BUFFER_OES"..0x8DC2,
        "INT_SAMPLER_BUFFER_OES"..0x8DD0,
        "UNSIGNED_INT_SAMPLER_BUFFER_OES"..0x8DD8,
        "IMAGE_BUFFER_OES"..0x9051,
        "INT_IMAGE_BUFFER_OES"..0x905C,
        "UNSIGNED_INT_IMAGE_BUFFER_OES"..0x9067
    )

    IntConstant(
        "TEXTURE_BUFFER_DATA_STORE_BINDING_OES"..0x8C2D,
        "TEXTURE_BUFFER_OFFSET_OES"..0x919D,
        "TEXTURE_BUFFER_SIZE_OES"..0x919E
    )

    void(
        "TexBufferOES",

        GLenum("target"),
        GLenum("internalformat"),
        GLuint("buffer")
    )

    void(
        "TexBufferRangeOES",

        GLenum("target"),
        GLenum("internalformat"),
        GLuint("buffer"),
        GLintptr("offset"),
        GLsizeiptr("size")
    )
}