/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_image_base = "KHRImageBase".nativeClassEGL("KHR_image_base", postfix = KHR) {
    IntConstant(
        "IMAGE_PRESERVED_KHR"..0x30D2
    )

    LongConstant(
        "NO_IMAGE_KHR"..0L
    )

    EGLImageKHR(
        "CreateImageKHR",

        EGLDisplay("dpy"),
        EGLContext("ctx"),
        EGLenum("target"),
        EGLClientBuffer("buffer"),
        nullable..noneTerminated..EGLint.const.p("attrib_list")
    )

    EGLBoolean(
        "DestroyImageKHR",

        EGLDisplay("dpy"),
        EGLImageKHR("image")
    )
}