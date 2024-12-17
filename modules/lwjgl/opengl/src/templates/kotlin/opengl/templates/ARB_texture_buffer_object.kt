/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_buffer_object = "ARBTextureBufferObject".nativeClassGL("ARB_texture_buffer_object", postfix = ARB) {
    IntConstant(
        "TEXTURE_BUFFER_ARB"..0x8C2A
    )

    IntConstant(
        "MAX_TEXTURE_BUFFER_SIZE_ARB"..0x8C2B,
        "TEXTURE_BINDING_BUFFER_ARB"..0x8C2C,
        "TEXTURE_BUFFER_DATA_STORE_BINDING_ARB"..0x8C2D,
        "TEXTURE_BUFFER_FORMAT_ARB"..0x8C2E
    )

    void(
        "TexBufferARB",

        GLenum("target"),
        GLenum("internalformat"),
        GLuint("buffer")
    )
}
