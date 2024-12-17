/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_buffer = "EXTTextureBuffer".nativeClassGLES("EXT_texture_buffer", postfix = EXT) {
    IntConstant(
        "TEXTURE_BUFFER_EXT"..0x8C2A
    )

    IntConstant(
        "TEXTURE_BUFFER_BINDING_EXT"..0x8C2A,
        "MAX_TEXTURE_BUFFER_SIZE_EXT"..0x8C2B,
        "TEXTURE_BINDING_BUFFER_EXT"..0x8C2C,
        "TEXTURE_BUFFER_OFFSET_ALIGNMENT_EXT"..0x919F
    )

    IntConstant(
        "SAMPLER_BUFFER_EXT"..0x8DC2,
        "INT_SAMPLER_BUFFER_EXT"..0x8DD0,
        "UNSIGNED_INT_SAMPLER_BUFFER_EXT"..0x8DD8,
        "IMAGE_BUFFER_EXT"..0x9051,
        "INT_IMAGE_BUFFER_EXT"..0x905C,
        "UNSIGNED_INT_IMAGE_BUFFER_EXT"..0x9067
    )

    IntConstant(
        "TEXTURE_BUFFER_DATA_STORE_BINDING_EXT"..0x8C2D,
        "TEXTURE_BUFFER_OFFSET_EXT"..0x919D,
        "TEXTURE_BUFFER_SIZE_EXT"..0x919E
    )

    void(
        "TexBufferEXT",

        GLenum("target"),
        GLenum("internalformat"),
        GLuint("buffer")
    )

    void(
        "TexBufferRangeEXT",

        GLenum("target"),
        GLenum("internalformat"),
        GLuint("buffer"),
        GLintptr("offset"),
        GLsizeiptr("size")
    )
}