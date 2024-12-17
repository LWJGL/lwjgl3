/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_stream_producer_eglsurface = "KHRStreamProducerEGLSurface".nativeClassEGL("KHR_stream_producer_eglsurface", postfix = KHR) {
    IntConstant(
        "STREAM_BIT_KHR"..0x0800
    )

    EGLSurface(
        "CreateStreamProducerSurfaceKHR",

        EGLDisplay("dpy"),
        EGLConfig("config"),
        EGLStreamKHR("stream"),
        nullable..noneTerminated..EGLint.const.p("attrib_list")
    )
}