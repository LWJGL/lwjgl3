/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_texture_storage = "EXTTextureStorage".nativeClassGLES("EXT_texture_storage", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The texture image specification commands in OpenGL allow each level to be separately specified with different sizes, formats, types and so on, and only
        imposes consistency checks at draw time. This adds overhead for implementations.

        This extension provides a mechanism for specifying the entire structure of a texture in a single call, allowing certain consistency checks and memory
        allocations to be done up front. Once specified, the format and dimensions of the image array become immutable, to simplify completeness checks in the
        implementation.

        When using this extension, it is no longer possible to supply texture data using TexImage*. Instead, data can be uploaded using TexSubImage*, or
        produced by other means (such as render-to-texture, mipmap generation, or rendering to a sibling EGLImage).

        This extension has complicated interactions with other extensions. The goal of most of these interactions is to ensure that a texture is always mipmap
        complete (and cube complete for cubemap textures).

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code value} parameter of GetTexParameter{if}v.",

        "TEXTURE_IMMUTABLE_FORMAT_EXT"..0x912F
    )

    IntConstant(
        "Accepted by the {@code internalformat} parameter of TexStorage when implemented on OpenGL ES.",

        "ALPHA8_EXT"..0x803C,
        "LUMINANCE8_EXT"..0x8040,
        "LUMINANCE8_ALPHA8_EXT"..0x8045,
        "RGBA32F_EXT"..0x8814,
        "RGB32F_EXT"..0x8815,
        "ALPHA32F_EXT"..0x8816,
        "LUMINANCE32F_EXT"..0x8818,
        "LUMINANCE_ALPHA32F_EXT"..0x8819,
        "RGBA16F_EXT"..0x881A,
        "RGB16F_EXT"..0x881B,
        "ALPHA16F_EXT"..0x881C,
        "LUMINANCE16F_EXT"..0x881E,
        "LUMINANCE_ALPHA16F_EXT"..0x881F,
        "RGB10_A2_EXT"..0x8059,
        "RGB10_EXT"..0x8052,
        "BGRA8_EXT"..0x93A1,
        "R8_EXT"..0x8229,
        "RG8_EXT"..0x822B,
        "R32F_EXT"..0x822E,
        "RG32F_EXT"..0x8230,
        "R16F_EXT"..0x822D,
        "RG16F_EXT"..0x822F,
        "RGB_RAW_422_APPLE"..0x8A51
    )

    void(
        "TexStorage1DEXT",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("levels", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", "")
    )

    void(
        "TexStorage2DEXT",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("levels", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    void(
        "TexStorage3DEXT",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("levels", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", "")
    )

    void(
        "TextureStorage1DEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLsizei.IN("levels", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", "")
    )

    void(
        "TextureStorage2DEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLsizei.IN("levels", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    void(
        "TextureStorage3DEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLsizei.IN("levels", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", "")
    )
}