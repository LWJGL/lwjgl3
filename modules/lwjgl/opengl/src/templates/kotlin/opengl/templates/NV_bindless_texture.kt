/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_bindless_texture = "NVBindlessTexture".nativeClassGL("NV_bindless_texture", postfix = NV) {
    GLuint64(
        "GetTextureHandleNV",

        GLuint("texture")
    )

    GLuint64(
        "GetTextureSamplerHandleNV",

        GLuint("texture"),
        GLuint("sampler")
    )

    void(
        "MakeTextureHandleResidentNV",

        GLuint64("handle")
    )

    void(
        "MakeTextureHandleNonResidentNV",

        GLuint64("handle")
    )

    GLuint64(
        "GetImageHandleNV",

        GLuint("texture"),
        GLint("level"),
        GLboolean("layered"),
        GLint("layer"),
        GLenum("format")
    )

    void(
        "MakeImageHandleResidentNV",

        GLuint64("handle"),
        GLenum("access")
    )

    void(
        "MakeImageHandleNonResidentNV",

        GLuint64("handle")
    )

    val location = GLint("location")
    val UniformHandleui64NV = void(
        "UniformHandleui64NV",

        location,
        GLuint64("value")
    )

    val UniformHandleui64vNV = void(
        "UniformHandleui64vNV",

        location,
        AutoSize("values")..GLsizei("count"),
        GLuint64.const.p("values")
    )

    void(
        "ProgramUniformHandleui64NV",

        GLuint("program"),
        location,
        UniformHandleui64NV["value"]
    )

    void(
        "ProgramUniformHandleui64vNV",

        GLuint("program"),
        location,
        UniformHandleui64vNV["count"],
        UniformHandleui64vNV["values"]
    )

    GLboolean(
        "IsTextureHandleResidentNV",

        GLuint64("handle")
    )

    GLboolean(
        "IsImageHandleResidentNV",

        GLuint64("handle")
    )

}