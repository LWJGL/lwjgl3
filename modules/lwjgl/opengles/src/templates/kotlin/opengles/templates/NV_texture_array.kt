/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_texture_array = "NVTextureArray".nativeClassGLES("NV_texture_array", postfix = NV) {
    IntConstant(
        "TEXTURE_2D_ARRAY_NV"..0x8C1A
    )

    IntConstant(
        "TEXTURE_BINDING_2D_ARRAY_NV"..0x8C1D,
        "MAX_ARRAY_TEXTURE_LAYERS_NV"..0x88FF
    )

    IntConstant(
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_NV"..0x8CD4
    )

    IntConstant(
        "SAMPLER_2D_ARRAY_NV"..0x8DC1
    )

    IntConstant(
        "UNPACK_SKIP_IMAGES_NV"..0x806D,
        "UNPACK_IMAGE_HEIGHT_NV"..0x806E
    )

    void(
        "TexImage3DNV",

        GLenum("target"),
        GLint("level"),
        GLenum("internalFormat"),
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
        "TexSubImage3DNV",

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
        "CopyTexSubImage3DNV",

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
        "CompressedTexImage3DNV",

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
        "CompressedTexSubImage3DNV",

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
        "FramebufferTextureLayerNV",

        GLenum("target"),
        GLenum("attachment"),
        GLuint("texture"),
        GLint("level"),
        GLint("layer")
    )
}