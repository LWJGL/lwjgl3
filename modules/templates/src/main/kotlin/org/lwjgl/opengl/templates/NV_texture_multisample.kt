/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

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

        GLenum.IN("target", ""),
        GLsizei.IN("coverageSamples", ""),
        GLsizei.IN("colorSamples", ""),
        GLint.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLboolean.IN("fixedSampleLocations", "")
    )

    void(
        "TexImage3DMultisampleCoverageNV",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("coverageSamples", ""),
        GLsizei.IN("colorSamples", ""),
        GLint.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLboolean.IN("fixedSampleLocations", "")
    )

    void(
        "TextureImage2DMultisampleNV",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLsizei.IN("samples", ""),
        GLint.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLboolean.IN("fixedSampleLocations", "")
    )

    void(
        "TextureImage3DMultisampleNV",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLsizei.IN("samples", ""),
        GLint.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLboolean.IN("fixedSampleLocations", "")
    )

    void(
        "TextureImage2DMultisampleCoverageNV",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLsizei.IN("coverageSamples", ""),
        GLsizei.IN("colorSamples", ""),
        GLint.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLboolean.IN("fixedSampleLocations", "")
    )

    void(
        "TextureImage3DMultisampleCoverageNV",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLsizei.IN("coverageSamples", ""),
        GLsizei.IN("colorSamples", ""),
        GLint.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLboolean.IN("fixedSampleLocations", "")
    )
}