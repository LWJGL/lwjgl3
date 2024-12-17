/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_bindless_texture = "ARBBindlessTexture".nativeClassGL("ARB_bindless_texture", postfix = ARB) {
    IntConstant(
        "UNSIGNED_INT64_ARB"..0x140F
    )

    GLuint64(
        "GetTextureHandleARB",

        GLuint("texture")
    )

    GLuint64(
        "GetTextureSamplerHandleARB",

        GLuint("texture"),
        GLuint("sampler")
    )

    void(
        "MakeTextureHandleResidentARB",

        GLuint64("handle")
    )

    void(
        "MakeTextureHandleNonResidentARB",

        GLuint64("handle")
    )

    GLuint64(
        "GetImageHandleARB",

        GLuint("texture"),
        GLint("level"),
        GLboolean("layered"),
        GLint("layer"),
        GLenum("format")
    )

    void(
        "MakeImageHandleResidentARB",

        GLuint64("handle"),
        GLenum("access")
    )

    void(
        "MakeImageHandleNonResidentARB",

        GLuint64("handle")
    )

    val location = GLint("location")
    val UniformHandleui64ARB = void(
        "UniformHandleui64ARB",

        location,
        GLuint64("value")
    )

    val UniformHandleui64vARB = void(
        "UniformHandleui64vARB",

        location,
        AutoSize("values")..GLsizei("count"),
        GLuint64.const.p("values")
    )

    void(
        "ProgramUniformHandleui64ARB",

        GLuint("program"),
        location,
        UniformHandleui64ARB["value"]
    )

    void(
        "ProgramUniformHandleui64vARB",

        GLuint("program"),
        location,
        UniformHandleui64vARB["count"],
        UniformHandleui64vARB["values"]
    )

    GLboolean(
        "IsTextureHandleResidentARB",

        GLuint64("handle")
    )

    GLboolean(
        "IsImageHandleResidentARB",

        GLuint64("handle")
    )

    void(
        "VertexAttribL1ui64ARB",

        GLuint("index"),
        GLuint64("x")
    )

    void(
        "VertexAttribL1ui64vARB",

        GLuint("index"),
        Check(1)..GLuint64.const.p("v")
    )

    void(
        "GetVertexAttribLui64vARB",

        GLuint("index"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLuint64.p("params")
    )
}