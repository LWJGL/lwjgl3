/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_stream_reset = "NVStreamReset".nativeClassEGL("NV_stream_reset", postfix = NV) {
    IntConstant(
        "SUPPORT_RESET_NV"..0x3334,
        "SUPPORT_REUSE_NV"..0x3335
    )

    EGLBoolean(
        "ResetStreamNV",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream")
    )
}