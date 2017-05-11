/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*
import org.lwjgl.system.windows.*

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

        GLuint.IN("srcName", ""),
        GLenum.IN("srcTarget", ""),
        GLint.IN("srcLevel", ""),
        GLint.IN("srcX", ""),
        GLint.IN("srcY", ""),
        GLint.IN("srcZ", ""),
        GLuint.IN("dstName", ""),
        GLenum.IN("dstTarget", ""),
        GLint.IN("dstLevel", ""),
        GLint.IN("dstX", ""),
        GLint.IN("dstY", ""),
        GLint.IN("dstZ", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", "")
    )
}

val GLX_NV_copy_image = "GLXNVCopyImage".nativeClassGLX("GLX_NV_copy_image", NV) {
    documentation =
        """
        Native bindings to the ${registryLink("NV", "copy_image")} extension.

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
        nullable..GLXContext.IN("srcCtx", "the source context"),
        GLuint.IN("srcName", ""),
        GLenum.IN("srcTarget", ""),
        GLint.IN("srcLevel", ""),
        GLint.IN("srcX", ""),
        GLint.IN("srcY", ""),
        GLint.IN("srcZ", ""),
        nullable..GLXContext.IN("dstCtx", "the destination context"),
        GLuint.IN("dstName", ""),
        GLenum.IN("dstTarget", ""),
        GLint.IN("dstLevel", ""),
        GLint.IN("dstX", ""),
        GLint.IN("dstY", ""),
        GLint.IN("dstZ", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", "")
    )
}

val WGL_NV_copy_image = "WGLNVCopyImage".nativeClassWGL("WGL_NV_copy_image", NV) {
    documentation =
        """
        Native bindings to the ${registryLink("NV", "copy_image")} extension.

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

        HGLRC.IN("srcRC", "the source OpenGL context"),
        GLuint.IN("srcName", "the source object"),
        GLenum.IN("srcTarget", "the source object target"),
        GLint.IN("srcLevel", "the source level-of-detail number"),
        GLint.IN("srcX", "the source texel x coordinate"),
        GLint.IN("srcY", "the source texel y coordinate"),
        GLint.IN("srcZ", "the source texel z coordinate"),
        HGLRC.IN("dstRC", "the destination OpenGL context"),
        GLuint.IN("dstName", "the destination object"),
        GLenum.IN("dstTarget", "the destination object target"),
        GLint.IN("dstLevel", "the destination level-of-detail number"),
        GLint.IN("dstX", "the destination texel x coordinate"),
        GLint.IN("dstY", "the destination texel y coordinate"),
        GLint.IN("dstZ", "the destination texel z coordinate"),
        GLsizei.IN("width", "the number of texels to copy in the x-dimension"),
        GLsizei.IN("height", "the number of texels to copy in the y-dimension"),
        GLsizei.IN("depth", "the number of texels to copy in the z-dimension")
    )
}