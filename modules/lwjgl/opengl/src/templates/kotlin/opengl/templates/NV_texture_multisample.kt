/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_texture_multisample = "NVTextureMultisample".nativeClassGL("NV_texture_multisample", postfix = NV) {
    IntConstant(
        "TEXTURE_COVERAGE_SAMPLES_NV"..0x9045,
        "TEXTURE_COLOR_SAMPLES_NV"..0x9046
    )

    void(
        "TexImage2DMultisampleCoverageNV",

        GLenum("target"),
        GLsizei("coverageSamples"),
        GLsizei("colorSamples"),
        GLint("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLboolean("fixedSampleLocations")
    )

    void(
        "TexImage3DMultisampleCoverageNV",

        GLenum("target"),
        GLsizei("coverageSamples"),
        GLsizei("colorSamples"),
        GLint("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLboolean("fixedSampleLocations")
    )

    void(
        "TextureImage2DMultisampleNV",

        GLuint("texture"),
        GLenum("target"),
        GLsizei("samples"),
        GLint("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLboolean("fixedSampleLocations")
    )

    void(
        "TextureImage3DMultisampleNV",

        GLuint("texture"),
        GLenum("target"),
        GLsizei("samples"),
        GLint("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLboolean("fixedSampleLocations")
    )

    void(
        "TextureImage2DMultisampleCoverageNV",

        GLuint("texture"),
        GLenum("target"),
        GLsizei("coverageSamples"),
        GLsizei("colorSamples"),
        GLint("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLboolean("fixedSampleLocations")
    )

    void(
        "TextureImage3DMultisampleCoverageNV",

        GLuint("texture"),
        GLenum("target"),
        GLsizei("coverageSamples"),
        GLsizei("colorSamples"),
        GLint("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLboolean("fixedSampleLocations")
    )
}