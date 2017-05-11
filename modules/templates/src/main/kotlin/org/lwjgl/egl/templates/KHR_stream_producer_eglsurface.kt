/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_stream_producer_eglsurface = "KHRStreamProducerEGLSurface".nativeClassEGL("KHR_stream_producer_eglsurface", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows an EGLSurface to be created as a producer of images to an EGLStream. Each call to eglSwapBuffers posts a new image frame into the
        EGLStream.

        Requires ${EGL12.core}.
        """

    IntConstant(
        "",

        "STREAM_BIT_KHR"..0x0800
    )

    EGLSurface(
        "CreateStreamProducerSurfaceKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLConfig.IN("config", ""),
        EGLStreamKHR.IN("stream", ""),
        nullable..noneTerminated..const..EGLint_p.IN("attrib_list", "")
    )
}