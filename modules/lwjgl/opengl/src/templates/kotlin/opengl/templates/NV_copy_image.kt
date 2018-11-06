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
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
        otherwise configure the rendering pipeline. The WGL and GLX versions allow copying between images in different contexts, even if those contexts are in
        different sharelists or even on different physical devices.
        """

    void(
        "CopyImageSubDataNV",
        "Copies a region of texel data between two image objects. An image object may be either a texture or a renderbuffer.",

        GLuint("srcName", ""),
        GLenum("srcTarget", ""),
        GLint("srcLevel", ""),
        GLint("srcX", ""),
        GLint("srcY", ""),
        GLint("srcZ", ""),
        GLuint("dstName", ""),
        GLenum("dstTarget", ""),
        GLint("dstLevel", ""),
        GLint("dstX", ""),
        GLint("dstY", ""),
        GLint("dstZ", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", "")
    )
}

val GLX_NV_copy_image = "GLXNVCopyImage".nativeClassGLX("GLX_NV_copy_image", NV) {
    documentation =
        """
        Native bindings to the ${registryLink("NV_copy_image")} extension.

        This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
        otherwise configure the rendering pipeline. The GLX version allows copying between images in different contexts, even if those contexts are in different
        sharelists or even on different physical devices.
        """

    void(
        "CopyImageSubDataNV",
        """
        Behaves identically to the core function #CopyImageSubDataNV(), except that the {@code srcCtx} and {@code dstCtx} parameters specify
        the contexts in which to look up the source and destination objects, respectively. A value of #NULL for either context indicates that the value which is
        returned by GLX#glXGetCurrentContext() should be used instead. Both contexts must share the same address space.
        """,

        DISPLAY,
        nullable..GLXContext("srcCtx", "the source context"),
        GLuint("srcName", ""),
        GLenum("srcTarget", ""),
        GLint("srcLevel", ""),
        GLint("srcX", ""),
        GLint("srcY", ""),
        GLint("srcZ", ""),
        nullable..GLXContext("dstCtx", "the destination context"),
        GLuint("dstName", ""),
        GLenum("dstTarget", ""),
        GLint("dstLevel", ""),
        GLint("dstX", ""),
        GLint("dstY", ""),
        GLint("dstZ", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", "")
    )
}

val WGL_NV_copy_image = "WGLNVCopyImage".nativeClassWGL("WGL_NV_copy_image", NV) {
    documentation =
        """
        Native bindings to the ${registryLink("NV_copy_image")} extension.

        This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
        otherwise configure the rendering pipeline. The WGL version allows copying between images in different contexts, even if those contexts are in
        different sharelists or even on different physical devices.
        """

    BOOL(
        "CopyImageSubDataNV",
        """
        Behaves identically to the core function #CopyImageSubDataNV(), except that the {@code srcRC} and {@code dstRC} parameters specify
        the contexts in which to look up the source and destination objects, respectively. A value of zero indicates that the currently bound context should be
        used instead.
        """,

        HGLRC("srcRC", "the source OpenGL context"),
        GLuint("srcName", "the source object"),
        GLenum("srcTarget", "the source object target"),
        GLint("srcLevel", "the source level-of-detail number"),
        GLint("srcX", "the source texel x coordinate"),
        GLint("srcY", "the source texel y coordinate"),
        GLint("srcZ", "the source texel z coordinate"),
        HGLRC("dstRC", "the destination OpenGL context"),
        GLuint("dstName", "the destination object"),
        GLenum("dstTarget", "the destination object target"),
        GLint("dstLevel", "the destination level-of-detail number"),
        GLint("dstX", "the destination texel x coordinate"),
        GLint("dstY", "the destination texel y coordinate"),
        GLint("dstZ", "the destination texel z coordinate"),
        GLsizei("width", "the number of texels to copy in the x-dimension"),
        GLsizei("height", "the number of texels to copy in the y-dimension"),
        GLsizei("depth", "the number of texels to copy in the z-dimension")
    )
}