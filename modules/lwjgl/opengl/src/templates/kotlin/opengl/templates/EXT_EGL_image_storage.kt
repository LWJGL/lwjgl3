/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_EGL_image_storage = "EXTEGLImageStorage".nativeClassGL("EXT_EGL_image_storage", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The OpenGL ES extension {@code OES_EGL_image} provides a mechanism for creating GL textures sharing storage with {@code EGLImage} objects (in other
        words, creating GL texture {@code EGLImage} targets). The extension was written against the OpenGL ES 2.0 specification, which does not have the
        concept of immutable textures. As a result, it specifies that respecification of a texture by calling {@code TexImage*} on a texture that is an
        {@code EGLImage} target causes it to be implicitly orphaned. In most cases, this is not the desired behavior, but rather a result of an application
        error.

        This extension provides a mechanism for creating texture objects that are both {@code EGLImage} targets and immutable. Since immutable textures cannot
        be respecified, they also cannot accidentally be orphaned, and attempts to do so generate errors instead of resulting in well-defined, but often
        undesirable and surprising behavior. It provides a strong guarantee that texture data that is intended to be shared will remain shared.

        Requires ${GL42.core} or ${ARB_texture_storage.link}. Requires EGL 1.4 and either the {@code EGL_KHR_image} or {@code EGL_KHR_image_base} extensions.
        """

    void(
        "EGLImageTargetTexStorageEXT",
        "",

        GLenum("target", ""),
        GLeglImageOES("image", ""),
        nullable..NullTerminated..int.const.p("attrib_list", "")
    )

    DependsOn("hasDSA(ext)")..void(
        "EGLImageTargetTextureStorageEXT",
        "",

        GLuint("texture", ""),
        GLeglImageOES("image", ""),
        nullable..NullTerminated..int.const.p("attrib_list", "")
    )
}