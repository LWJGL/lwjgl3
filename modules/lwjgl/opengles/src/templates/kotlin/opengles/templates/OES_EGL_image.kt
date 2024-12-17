/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_EGL_image = "OESEGLImage".nativeClassGLES("OES_EGL_image", postfix = OES) {
    void(
        "EGLImageTargetTexture2DOES",

        GLenum("target"),
        GLeglImageOES("image")
    )

    void(
        "EGLImageTargetRenderbufferStorageOES",

        GLenum("target"),
        GLeglImageOES("image")
    )
}