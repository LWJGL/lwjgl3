/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_texture_3D = "OESTexture3D".nativeClassGLES("OES_texture_3D", postfix = OES) {
    IntConstant(
        "TEXTURE_3D_OES"..0x806F
    )

    IntConstant(
        "TEXTURE_WRAP_R_OES"..0x8072
    )

    IntConstant(
        "MAX_3D_TEXTURE_SIZE_OES"..0x8073,
        "TEXTURE_BINDING_3D_OES"..0x806A
    )

    void(
        "TexImage3DOES",

        GLenum("target"),
        GLint("level"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLint("border"),
        GLenum("format"),
        GLenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..nullable..void.const.p("pixels")
    )

    void(
        "TexSubImage3DOES",

        GLenum("target"),
        GLint("level"),
        GLint("xoffset"),
        GLint("yoffset"),
        GLint("zoffset"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLenum("format"),
        GLenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p("pixels")
    )

    void(
        "CopyTexSubImage3DOES",

        GLenum("target"),
        GLint("level"),
        GLint("xoffset"),
        GLint("yoffset"),
        GLint("zoffset"),
        GLint("x"),
        GLint("y"),
        GLsizei("width"),
        GLsizei("height")
    )

    void(
        "CompressedTexImage3DOES",

        GLenum("target"),
        GLint("level"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLint("border"),
        AutoSize("data")..GLsizei("imageSize"),
        RawPointer..nullable..void.const.p("data")
    )

    void(
        "CompressedTexSubImage3DOES",

        GLenum("target"),
        GLint("level"),
        GLint("xoffset"),
        GLint("yoffset"),
        GLint("zoffset"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLenum("format"),
        AutoSize("data")..GLsizei("imageSize"),
        RawPointer..void.const.p("data")
    )

    void(
        "FramebufferTexture3DOES",

        GLenum("target"),
        GLenum("attachment"),
        GLenum("textarget"),
        GLuint("texture"),
        GLint("level"),
        GLint("zoffset")
    )
}