/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_texture_3D = "OESTexture3D".nativeClassGLES("OES_texture_3D", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds support for 3D textures. The OpenGL ES 2.0 texture wrap modes and mip-mapping is supported for power of two 3D textures. Mip-
        mapping and texture wrap modes other than CLAMP_TO_EDGE are not supported for non-power of two 3D textures.

        The OES_texture_npot extension, if supported, will enable mip-mapping and other wrap modes for non-power of two 3D textures.

        Requires ${GLES20.core}.
        """

    IntConstant(
        """
        Accepted by the {@code target} parameter of TexImage3DOES, TexSubImage3DOES, CopyTexSubImage3DOES, CompressedTexImage3DOES and
        CompressedTexSubImage3DOES, GetTexParameteriv, and GetTexParameterfv.
        """,

        "TEXTURE_3D_OES"..0x806F
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv.",

        "TEXTURE_WRAP_R_OES"..0x8072
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

        "MAX_3D_TEXTURE_SIZE_OES"..0x8073,
        "TEXTURE_BINDING_3D_OES"..0x806A
    )

    void(
        "TexImage3DOES",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLint.IN("border", ""),
        GLenum.IN("format", ""),
        GLenum.IN("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("pixels", "")
    )

    void(
        "TexSubImage3DOES",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLint.IN("yoffset", ""),
        GLint.IN("zoffset", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLenum.IN("format", ""),
        GLenum.IN("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..PIXEL_UNPACK_BUFFER..const..void_p.IN("pixels", "")
    )

    void(
        "CopyTexSubImage3DOES",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLint.IN("yoffset", ""),
        GLint.IN("zoffset", ""),
        GLint.IN("x", ""),
        GLint.IN("y", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    void(
        "CompressedTexImage3DOES",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLint.IN("border", ""),
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("data", "")
    )

    void(
        "CompressedTexSubImage3DOES",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLint.IN("yoffset", ""),
        GLint.IN("zoffset", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLenum.IN("format", ""),
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..const..void_p.IN("data", "")
    )

    void(
        "FramebufferTexture3DOES",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("attachment", ""),
        GLenum.IN("textarget", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLint.IN("zoffset", "")
    )
}