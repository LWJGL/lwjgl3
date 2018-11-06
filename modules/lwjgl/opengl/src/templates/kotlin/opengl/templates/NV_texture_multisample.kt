/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_texture_multisample = "NVTextureMultisample".nativeClassGL("NV_texture_multisample", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This specification extends ${registryLinkTo("NV", "gpu_program4")} to support per-sample fetching from multisample textures described in
        ${ARB_texture_multisample.link}.
    
        Requires ${GL20.core}, ${ARB_texture_multisample.link}.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameter of GetTexLevelParameter.
        """,

        "TEXTURE_COVERAGE_SAMPLES_NV"..0x9045,
        "TEXTURE_COLOR_SAMPLES_NV"..0x9046
    )

    void(
        "TexImage2DMultisampleCoverageNV",
        "",

        GLenum("target", ""),
        GLsizei("coverageSamples", ""),
        GLsizei("colorSamples", ""),
        GLint("internalFormat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLboolean("fixedSampleLocations", "")
    )

    void(
        "TexImage3DMultisampleCoverageNV",
        "",

        GLenum("target", ""),
        GLsizei("coverageSamples", ""),
        GLsizei("colorSamples", ""),
        GLint("internalFormat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLboolean("fixedSampleLocations", "")
    )

    void(
        "TextureImage2DMultisampleNV",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLsizei("samples", ""),
        GLint("internalFormat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLboolean("fixedSampleLocations", "")
    )

    void(
        "TextureImage3DMultisampleNV",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLsizei("samples", ""),
        GLint("internalFormat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLboolean("fixedSampleLocations", "")
    )

    void(
        "TextureImage2DMultisampleCoverageNV",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLsizei("coverageSamples", ""),
        GLsizei("colorSamples", ""),
        GLint("internalFormat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLboolean("fixedSampleLocations", "")
    )

    void(
        "TextureImage3DMultisampleCoverageNV",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLsizei("coverageSamples", ""),
        GLsizei("colorSamples", ""),
        GLint("internalFormat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLboolean("fixedSampleLocations", "")
    )
}