/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_EGL_image_storage = "EXTEGLImageStorage".nativeClassGLES("EXT_EGL_image_storage", postfix = EXT) {
    void(
        "EGLImageTargetTexStorageEXT",

        GLenum("target"),
        GLeglImageOES("image"),
        nullable..NullTerminated..int.const.p("attrib_list")
    )

    DependsOn("hasDSA(ext)")..void(
        "EGLImageTargetTextureStorageEXT",

        GLuint("texture"),
        GLeglImageOES("image"),
        nullable..NullTerminated..int.const.p("attrib_list")
    )
}