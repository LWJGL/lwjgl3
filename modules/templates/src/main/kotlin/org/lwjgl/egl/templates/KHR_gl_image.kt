/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_gl_renderbuffer_image = "KHRGLRenderbufferImage".nativeClassEGL("KHR_gl_renderbuffer_image", postfix = KHR) {
    documentation =
        """
        Native bindings to the ${registryLink("KHR", "EGL_KHR_gl_image")} extension.

        This extension provides a mechanism for creating EGLImage objects from OpenGL and OpenGL ES (henceforth referred to collectively as 'GL') render
        buffers.

        Requires ${EGL12.core} and ${KHR_image.link}.
        """

    IntConstant(
        "",

        "GL_RENDERBUFFER_KHR"..0x30B9
    )
}

val KHR_gl_texture_2D_image = "KHRGLTexture2DImage".nativeClassEGL("KHR_gl_texture_2D_image", postfix = KHR) {
    documentation =
        """
        Native bindings to the ${registryLink("KHR", "EGL_KHR_gl_image")} extension.

        This extension provides a mechanism for creating EGLImage objects from OpenGL and OpenGL ES (henceforth referred to collectively as 'GL')
        two-dimensional images.

        Requires ${EGL12.core} and ${KHR_image.link}.
        """

    IntConstant(
        "",

        "GL_TEXTURE_2D_KHR"..0x30B1,
        "GL_TEXTURE_LEVEL_KHR"..0x30BC
    )
}

val KHR_gl_texture_3D_image = "KHRGLTexture3DImage".nativeClassEGL("KHR_gl_texture_3D_image", postfix = KHR) {
    documentation =
        """
        Native bindings to the ${registryLink("KHR", "EGL_KHR_gl_image")} extension.

        This extension provides a mechanism for creating EGLImage objects from OpenGL and OpenGL ES (henceforth referred to collectively as 'GL')
        three-dimensional images.

        Requires ${EGL12.core} and ${KHR_image.link}.
        """

    IntConstant(
        "",

        "GL_TEXTURE_3D_KHR"..0x30B2,
        "GL_TEXTURE_ZOFFSET_KHR"..0x30BD
    )
}

val KHR_gl_texture_cubemap_image = "KHRGLTextureCubemapImage".nativeClassEGL("KHR_gl_texture_cubemap_image", postfix = KHR) {
    documentation =
        """
        Native bindings to the ${registryLink("KHR", "EGL_KHR_gl_image")} extension.

        This extension provides a mechanism for creating EGLImage objects from OpenGL and OpenGL ES (henceforth referred to collectively as 'GL') cube maps.

        Requires ${EGL12.core} and ${KHR_image.link}.
        """

    IntConstant(
        "",

        "GL_TEXTURE_CUBE_MAP_POSITIVE_X_KHR"..0x30B3,
        "GL_TEXTURE_CUBE_MAP_NEGATIVE_X_KHR"..0x30B4,
        "GL_TEXTURE_CUBE_MAP_POSITIVE_Y_KHR"..0x30B5,
        "GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_KHR"..0x30B6,
        "GL_TEXTURE_CUBE_MAP_POSITIVE_Z_KHR"..0x30B7,
        "GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_KHR"..0x30B8
    )
}