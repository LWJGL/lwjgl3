/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_bindless_texture = "NVBindlessTexture".nativeClassGLES("NV_bindless_texture", postfix = NV) {
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

    void(
        "UniformHandleui64NV",

        GLint("location"),
        GLuint64("value")
    )

    void(
        "UniformHandleui64vNV",

        GLint("location"),
        AutoSize("values")..GLsizei("count"),
        GLuint64.const.p("values")
    )

    void(
        "ProgramUniformHandleui64NV",

        GLuint("program"),
        GLint("location"),
        GLuint64("value")
    )

    void(
        "ProgramUniformHandleui64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize("values")..GLsizei("count"),
        GLuint64.const.p("values")
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