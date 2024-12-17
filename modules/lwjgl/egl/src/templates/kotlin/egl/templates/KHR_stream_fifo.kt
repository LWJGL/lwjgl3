/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_stream_fifo = "KHRStreamFIFO".nativeClassEGL("KHR_stream_fifo", postfix = KHR) {
    IntConstant(
        "STREAM_FIFO_LENGTH_KHR"..0x31FC,
        "STREAM_TIME_NOW_KHR"..0x31FD,
        "STREAM_TIME_CONSUMER_KHR"..0x31FE,
        "STREAM_TIME_PRODUCER_KHR"..0x31FF
    )

    EGLBoolean(
        "QueryStreamTimeKHR",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream"),
        EGLenum("attribute"),
        Check(1)..EGLTimeKHR.p("value")
    )
}