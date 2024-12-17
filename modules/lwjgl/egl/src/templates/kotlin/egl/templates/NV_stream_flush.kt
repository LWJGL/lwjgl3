/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*

val NV_stream_flush = "NVStreamFlush".nativeClassEGL("NV_stream_flush", postfix = NV) {
    EGLBoolean(
        "StreamFlushNV",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream")
    )
}