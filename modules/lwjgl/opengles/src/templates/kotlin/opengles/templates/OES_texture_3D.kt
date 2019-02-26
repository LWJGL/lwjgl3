/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

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

        GLenum("target", ""),
        GLint("level", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLint("border", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..nullable..void.const.p("pixels", "")
    )

    void(
        "TexSubImage3DOES",
        "",

        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("zoffset", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p("pixels", "")
    )

    void(
        "CopyTexSubImage3DOES",
        "",

        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("zoffset", ""),
        GLint("x", ""),
        GLint("y", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )

    void(
        "CompressedTexImage3DOES",
        "",

        GLenum("target", ""),
        GLint("level", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLint("border", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..nullable..void.const.p("data", "")
    )

    void(
        "CompressedTexSubImage3DOES",
        "",

        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("zoffset", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLenum("format", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..void.const.p("data", "")
    )

    void(
        "FramebufferTexture3DOES",
        "",

        GLenum("target", ""),
        GLenum("attachment", ""),
        GLenum("textarget", ""),
        GLuint("texture", ""),
        GLint("level", ""),
        GLint("zoffset", "")
    )
}