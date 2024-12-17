/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_texture_buffer_object = "EXTTextureBufferObject".nativeClassGL("EXT_texture_buffer_object", postfix = EXT) {
    IntConstant(
        "TEXTURE_BUFFER_EXT"..0x8C2A
    )

    IntConstant(
        "MAX_TEXTURE_BUFFER_SIZE_EXT"..0x8C2B,
        "TEXTURE_BINDING_BUFFER_EXT"..0x8C2C,
        "TEXTURE_BUFFER_DATA_STORE_BINDING_EXT"..0x8C2D,
        "TEXTURE_BUFFER_FORMAT_EXT"..0x8C2E
    )

    void(
        "TexBufferEXT",

        GLenum("target"),
        GLenum("internalformat"),
        GLuint("buffer")
    )
}