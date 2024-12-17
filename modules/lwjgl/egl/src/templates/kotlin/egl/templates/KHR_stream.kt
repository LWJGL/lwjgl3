/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_stream = "KHRStream".nativeClassEGL("KHR_stream", postfix = KHR) {
    LongConstant(
        "NO_STREAM_KHR"..0L
    )

    IntConstant(
        "CONSUMER_LATENCY_USEC_KHR"..0x3210,
        "PRODUCER_FRAME_KHR"..0x3212,
        "CONSUMER_FRAME_KHR"..0x3213,
        "STREAM_STATE_KHR"..0x3214,
        "STREAM_STATE_CREATED_KHR"..0x3215,
        "STREAM_STATE_CONNECTING_KHR"..0x3216,
        "STREAM_STATE_EMPTY_KHR"..0x3217,
        "STREAM_STATE_NEW_FRAME_AVAILABLE_KHR"..0x3218,
        "STREAM_STATE_OLD_FRAME_AVAILABLE_KHR"..0x3219,
        "STREAM_STATE_DISCONNECTED_KHR"..0x321A,
        "BAD_STREAM_KHR"..0x321B,
        "BAD_STATE_KHR"..0x321C
    )

    EGLStreamKHR(
        "CreateStreamKHR",

        EGLDisplay("dpy"),
        nullable..noneTerminated..EGLint.const.p("attrib_list")
    )

    EGLBoolean(
        "DestroyStreamKHR",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream")
    )

    EGLBoolean(
        "StreamAttribKHR",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream"),
        EGLenum("attribute"),
        EGLint("value")
    )

    EGLBoolean(
        "QueryStreamKHR",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream"),
        EGLenum("attribute"),
        Check(1)..EGLint.p("value")
    )

    EGLBoolean(
        "QueryStreamu64KHR",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream"),
        EGLenum("attribute"),
        Check(1)..EGLuint64KHR.p("value")
    )
}

val KHR_stream_attrib = "KHRStreamAttrib".nativeClassEGL("KHR_stream_attrib", postfix = KHR) {
    EGLStreamKHR(
        "CreateStreamAttribKHR",

        EGLDisplay("dpy"),
        nullable..noneTerminated..EGLAttrib.const.p("attrib_list")
    )

    EGLBoolean(
        "SetStreamAttribKHR",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream"),
        EGLenum("attribute"),
        EGLAttrib("value")
    )

    EGLBoolean(
        "QueryStreamAttribKHR",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream"),
        EGLenum("attribute"),
        Check(1)..EGLAttrib.p("value")
    )

    EGLBoolean(
        "StreamConsumerAcquireAttribKHR",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream"),
        nullable..noneTerminated..EGLAttrib.const.p("attrib_list")
    )

    EGLBoolean(
        "StreamConsumerReleaseAttribKHR",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream"),
        nullable..noneTerminated..EGLAttrib.const.p("attrib_list")
    )
}