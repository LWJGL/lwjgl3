/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_stream_sync = "NVStreamSync".nativeClassEGL("NV_stream_sync", postfix = NV) {
    IntConstant(
        "SYNC_TYPE_KHR"..0x30F7,
        "SYNC_NEW_FRAME_NV"..0x321F
    )

    EGLSyncKHR(
        "CreateStreamSyncNV",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream"),
        EGLenum("type"),
        noneTerminated..EGLint.const.p("attrib_list")
    )
}