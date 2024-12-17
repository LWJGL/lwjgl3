/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*
import core.windows.*

val NV_copy_image = "NVCopyImage".nativeClassGL("NV_copy_image", postfix = NV) {
    void(
        "CopyImageSubDataNV",

        GLuint("srcName"),
        GLenum("srcTarget"),
        GLint("srcLevel"),
        GLint("srcX"),
        GLint("srcY"),
        GLint("srcZ"),
        GLuint("dstName"),
        GLenum("dstTarget"),
        GLint("dstLevel"),
        GLint("dstX"),
        GLint("dstY"),
        GLint("dstZ"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth")
    )
}

val GLX_NV_copy_image = "GLXNVCopyImage".nativeClassGLX("GLX_NV_copy_image", NV) {
    void(
        "CopyImageSubDataNV",

        DISPLAY,
        nullable..GLXContext("srcCtx"),
        GLuint("srcName"),
        GLenum("srcTarget"),
        GLint("srcLevel"),
        GLint("srcX"),
        GLint("srcY"),
        GLint("srcZ"),
        nullable..GLXContext("dstCtx"),
        GLuint("dstName"),
        GLenum("dstTarget"),
        GLint("dstLevel"),
        GLint("dstX"),
        GLint("dstY"),
        GLint("dstZ"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth")
    )
}

val WGL_NV_copy_image = "WGLNVCopyImage".nativeClassWGL("WGL_NV_copy_image", NV) {
    BOOL(
        "CopyImageSubDataNV",

        HGLRC("srcRC"),
        GLuint("srcName"),
        GLenum("srcTarget"),
        GLint("srcLevel"),
        GLint("srcX"),
        GLint("srcY"),
        GLint("srcZ"),
        HGLRC("dstRC"),
        GLuint("dstName"),
        GLenum("dstTarget"),
        GLint("dstLevel"),
        GLint("dstX"),
        GLint("dstY"),
        GLint("dstZ"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth")
    )
}