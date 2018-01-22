/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_EGL_image = "OESEGLImage".nativeClassGLES("OES_EGL_image", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a mechanism for creating texture and renderbuffer objects sharing storage with specified EGLImage objects (such objects are
        referred to as "EGLImage targets").

        The companion EGL_KHR_image_base and EGL_KHR_image extensions provide the definition and rationale for EGLImage objects.

        Other EGL extensions, such as EGL_KHR_gl_texture_2D_image, EGL_KHR_gl_texture_cubemap_image, EGL_KHR_gl_texture_3D_image,
        EGL_KHR_gl_renderbuffer_image, and EGL_KHR_vg_parent_image, define the related functionality of creating EGLImage objects from "EGLImage sources" such
        as OpenGL ES texture or renderbuffers or OpenVG VGImage objects.
        """

    void(
        "EGLImageTargetTexture2DOES",
        "",

        GLenum.IN("target", ""),
        GLeglImageOES.IN("image", "")
    )

    void(
        "EGLImageTargetRenderbufferStorageOES",
        "",

        GLenum.IN("target", ""),
        GLeglImageOES.IN("image", "")
    )
}