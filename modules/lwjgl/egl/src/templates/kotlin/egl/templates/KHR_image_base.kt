/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_image_base = "KHRImageBase".nativeClassEGL("KHR_image_base", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines a new EGL resource type that is suitable for sharing 2D arrays of image data between client APIs, the EGLImage. Although the
        intended purpose is sharing 2D image data, the underlying interface makes no assumptions about the format or purpose of the resource being shared,
        leaving those decisions to the application and associated client APIs.

        Requires ${EGL12.core}.
        """

    IntConstant(
        "",

        "IMAGE_PRESERVED_KHR"..0x30D2
    )

    LongConstant(
        "",

        "NO_IMAGE_KHR"..0L
    )

    EGLImageKHR(
        "CreateImageKHR",
        "",

        EGLDisplay("dpy", ""),
        EGLContext("ctx", ""),
        EGLenum("target", ""),
        EGLClientBuffer("buffer", ""),
        nullable..noneTerminated..EGLint.const.p("attrib_list", "")
    )

    EGLBoolean(
        "DestroyImageKHR",
        "",

        EGLDisplay("dpy", ""),
        EGLImageKHR("image", "")
    )
}