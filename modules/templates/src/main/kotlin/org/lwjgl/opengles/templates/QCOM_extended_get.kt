/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

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

        nullable..GLuint_p.OUT("textures", ""),
        AutoSize("textures")..GLint.IN("maxTextures", ""),
        nullable..Check(1)..GLint_p.OUT("numTextures", "")
    )

    void(
        "ExtGetBuffersQCOM",
        "",

        nullable..GLuint_p.OUT("buffers", ""),
        AutoSize("buffers")..GLint.IN("maxBuffers", ""),
        nullable..Check(1)..GLint_p.OUT("numBuffers", "")
    )

    void(
        "ExtGetRenderbuffersQCOM",
        "",

        nullable..GLuint_p.OUT("renderbuffers", ""),
        AutoSize("renderbuffers")..GLint.IN("maxRenderbuffers", ""),
        nullable..Check(1)..GLint_p.OUT("numRenderbuffers", "")
    )

    void(
        "ExtGetFramebuffersQCOM",
        "",

        nullable..GLuint_p.OUT("framebuffers", ""),
        AutoSize("framebuffers")..GLint.IN("maxFramebuffers", ""),
        nullable..Check(1)..GLint_p.OUT("numFramebuffers", "")
    )

    void(
        "ExtGetTexLevelParameterivQCOM",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("face", ""),
        GLint.IN("level", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    void(
        "ExtTexObjectStateOverrideiQCOM",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        GLint.IN("param", "")
    )

    void(
        "ExtGetTexSubImageQCOM",
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
        Unsafe..void_p.OUT("texels", "")
    )

    void(
        "ExtGetBufferPointervQCOM",
        "",

        GLenum.IN("target", ""),
        ReturnParam..Check(1)..void_pp.OUT("params", "")
    )
}