/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_stream_consumer_gltexture = "KHRStreamConsumerGLTexture".nativeClassEGL("KHR_stream_consumer_gltexture", postfix = KHR) {
    IntConstant(
        "CONSUMER_ACQUIRE_TIMEOUT_USEC_KHR"..0x321E
    )

    EGLBoolean(
        "StreamConsumerGLTextureExternalKHR",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream")
    )

    EGLBoolean(
        "StreamConsumerAcquireKHR",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream")
    )

    EGLBoolean(
        "StreamConsumerReleaseKHR",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream")
    )
}