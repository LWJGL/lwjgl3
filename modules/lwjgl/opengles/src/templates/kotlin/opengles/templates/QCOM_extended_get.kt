/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_extended_get = "QCOMExtendedGet".nativeClassGLES("QCOM_extended_get", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.
        This extension enables instrumenting the driver for debugging of OpenGL ES applications.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of ExtGetTexLevelParameterivQCOM.",

        "TEXTURE_WIDTH_QCOM"..0x8BD2,
        "TEXTURE_HEIGHT_QCOM"..0x8BD3,
        "TEXTURE_DEPTH_QCOM"..0x8BD4,
        "TEXTURE_INTERNAL_FORMAT_QCOM"..0x8BD5,
        "TEXTURE_FORMAT_QCOM"..0x8BD6,
        "TEXTURE_TYPE_QCOM"..0x8BD7,
        "TEXTURE_IMAGE_VALID_QCOM"..0x8BD8,
        "TEXTURE_NUM_LEVELS_QCOM"..0x8BD9,
        "TEXTURE_TARGET_QCOM"..0x8BDA,
        "TEXTURE_OBJECT_VALID_QCOM"..0x8BDB
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of ExtTexObjectStateOverrideiQCOM.",

        "STATE_RESTORE"..0x8BDC
    )

    void(
        "ExtGetTexturesQCOM",
        "",

        nullable..GLuint.p.OUT("textures", ""),
        AutoSize("textures")..GLint("maxTextures", ""),
        nullable..Check(1)..GLint.p.OUT("numTextures", "")
    )

    void(
        "ExtGetBuffersQCOM",
        "",

        nullable..GLuint.p.OUT("buffers", ""),
        AutoSize("buffers")..GLint("maxBuffers", ""),
        nullable..Check(1)..GLint.p.OUT("numBuffers", "")
    )

    void(
        "ExtGetRenderbuffersQCOM",
        "",

        nullable..GLuint.p.OUT("renderbuffers", ""),
        AutoSize("renderbuffers")..GLint("maxRenderbuffers", ""),
        nullable..Check(1)..GLint.p.OUT("numRenderbuffers", "")
    )

    void(
        "ExtGetFramebuffersQCOM",
        "",

        nullable..GLuint.p.OUT("framebuffers", ""),
        AutoSize("framebuffers")..GLint("maxFramebuffers", ""),
        nullable..Check(1)..GLint.p.OUT("numFramebuffers", "")
    )

    void(
        "ExtGetTexLevelParameterivQCOM",
        "",

        GLuint("texture", ""),
        GLenum("face", ""),
        GLint("level", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLint.p.OUT("params", "")
    )

    void(
        "ExtTexObjectStateOverrideiQCOM",
        "",

        GLenum("target", ""),
        GLenum("pname", ""),
        GLint("param", "")
    )

    void(
        "ExtGetTexSubImageQCOM",
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
        Unsafe..void.p.OUT("texels", "")
    )

    void(
        "ExtGetBufferPointervQCOM",
        "",

        GLenum("target", ""),
        ReturnParam..Check(1)..void.p.p.OUT("params", "")
    )
}