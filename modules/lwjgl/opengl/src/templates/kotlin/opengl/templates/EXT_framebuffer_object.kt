/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_framebuffer_object = "EXTFramebufferObject".nativeClassGL("EXT_framebuffer_object", postfix = EXT) {
    IntConstant(
        "FRAMEBUFFER_EXT"..0x8D40
    )

    IntConstant(
        "RENDERBUFFER_EXT"..0x8D41
    )

    IntConstant(
        "STENCIL_INDEX1_EXT"..0x8D46,
        "STENCIL_INDEX4_EXT"..0x8D47,
        "STENCIL_INDEX8_EXT"..0x8D48,
        "STENCIL_INDEX16_EXT"..0x8D49
    )

    IntConstant(
        "RENDERBUFFER_WIDTH_EXT"..0x8D42,
        "RENDERBUFFER_HEIGHT_EXT"..0x8D43,
        "RENDERBUFFER_INTERNAL_FORMAT_EXT"..0x8D44,
        "RENDERBUFFER_RED_SIZE_EXT"..0x8D50,
        "RENDERBUFFER_GREEN_SIZE_EXT"..0x8D51,
        "RENDERBUFFER_BLUE_SIZE_EXT"..0x8D52,
        "RENDERBUFFER_ALPHA_SIZE_EXT"..0x8D53,
        "RENDERBUFFER_DEPTH_SIZE_EXT"..0x8D54,
        "RENDERBUFFER_STENCIL_SIZE_EXT"..0x8D55
    )

    IntConstant(
        "FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_EXT"..0x8CD0,
        "FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_EXT"..0x8CD1,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_EXT"..0x8CD2,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_EXT"..0x8CD3,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT"..0x8CD4
    )

    IntConstant(
        "COLOR_ATTACHMENT0_EXT"..0x8CE0,
        "COLOR_ATTACHMENT1_EXT"..0x8CE1,
        "COLOR_ATTACHMENT2_EXT"..0x8CE2,
        "COLOR_ATTACHMENT3_EXT"..0x8CE3,
        "COLOR_ATTACHMENT4_EXT"..0x8CE4,
        "COLOR_ATTACHMENT5_EXT"..0x8CE5,
        "COLOR_ATTACHMENT6_EXT"..0x8CE6,
        "COLOR_ATTACHMENT7_EXT"..0x8CE7,
        "COLOR_ATTACHMENT8_EXT"..0x8CE8,
        "COLOR_ATTACHMENT9_EXT"..0x8CE9,
        "COLOR_ATTACHMENT10_EXT"..0x8CEA,
        "COLOR_ATTACHMENT11_EXT"..0x8CEB,
        "COLOR_ATTACHMENT12_EXT"..0x8CEC,
        "COLOR_ATTACHMENT13_EXT"..0x8CED,
        "COLOR_ATTACHMENT14_EXT"..0x8CEE,
        "COLOR_ATTACHMENT15_EXT"..0x8CEF,
        "DEPTH_ATTACHMENT_EXT"..0x8D00,
        "STENCIL_ATTACHMENT_EXT"..0x8D20
    )

    IntConstant(
        "FRAMEBUFFER_COMPLETE_EXT"..0x8CD5,
        "FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT"..0x8CD6,
        "FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT"..0x8CD7,
        "FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT"..0x8CD9,
        "FRAMEBUFFER_INCOMPLETE_FORMATS_EXT"..0x8CDA,
        "FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT"..0x8CDB,
        "FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT"..0x8CDC,
        "FRAMEBUFFER_UNSUPPORTED_EXT"..0x8CDD
    )

    IntConstant(
        "FRAMEBUFFER_BINDING_EXT"..0x8CA6,
        "RENDERBUFFER_BINDING_EXT"..0x8CA7,
        "MAX_COLOR_ATTACHMENTS_EXT"..0x8CDF,
        "MAX_RENDERBUFFER_SIZE_EXT"..0x84E8
    )

    IntConstant(
        "INVALID_FRAMEBUFFER_OPERATION_EXT"..0x0506
    )

    GLboolean(
        "IsRenderbufferEXT",

        GLuint("renderbuffer")
    )

    void(
        "BindRenderbufferEXT",

        GLenum("target"),
        GLuint("renderbuffer")
    )

    void(
        "DeleteRenderbuffersEXT",

        AutoSize("renderbuffers")..GLsizei("n"),
        SingleValue("renderbuffer")..GLuint.const.p("renderbuffers")
    )

    void(
        "GenRenderbuffersEXT",

        AutoSize("renderbuffers")..GLsizei("n"),
        ReturnParam..GLuint.p("renderbuffers")
    )

    void(
        "RenderbufferStorageEXT",

        GLenum("target"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height")
    )

    void(
        "GetRenderbufferParameterivEXT",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    GLboolean(
        "IsFramebufferEXT",

        GLuint("framebuffer")
    )

    void(
        "BindFramebufferEXT",

        GLenum("target"),
        GLuint("framebuffer")
    )

    void(
        "DeleteFramebuffersEXT",

        AutoSize("framebuffers")..GLsizei("n"),
        SingleValue("framebuffer")..GLuint.const.p("framebuffers")
    )

    void(
        "GenFramebuffersEXT",

        AutoSize("framebuffers")..GLsizei("n"),
        ReturnParam..GLuint.p("framebuffers")
    )

    GLenum(
        "CheckFramebufferStatusEXT",

        GLenum("target")
    )

    void(
        "FramebufferTexture1DEXT",

        GLenum("target"),
        GLenum("attachment"),
        GLenum("textarget"),
        GLuint("texture"),
        GLint("level")
    )

    void(
        "FramebufferTexture2DEXT",

        GLenum("target"),
        GLenum("attachment"),
        GLenum("textarget"),
        GLuint("texture"),
        GLint("level")
    )

    void(
        "FramebufferTexture3DEXT",

        GLenum("target"),
        GLenum("attachment"),
        GLenum("textarget"),
        GLuint("texture"),
        GLint("level"),
        GLint("zoffset")
    )

    void(
        "FramebufferRenderbufferEXT",

        GLenum("target"),
        GLenum("attachment"),
        GLenum("renderbuffertarget"),
        GLuint("renderbuffer")
    )

    void(
        "GetFramebufferAttachmentParameterivEXT",

        GLenum("target"),
        GLenum("attachment"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GenerateMipmapEXT",

        GLenum("target")
    )
}