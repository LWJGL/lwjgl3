/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_stream_fifo = "KHRStreamFIFO".nativeClassEGL("KHR_stream_fifo", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows an EGLStream to operate as a fifo rather than as a mailbox.

        The EGL_KHR_stream extension defines the EGLStream object. The EGLStream object works like a 1 entry mailbox, allowing the consumer to consume the
        frame that the producer most recently inserted. If the consumer requests image frames faster than the producer creates them then it gets the most
        recent one over and over until a new one is inserted. If the producer inserts frames faster than the consumer can consume them then the extra frames
        are discarded. The producer is never stalled.

        This extension allows an EGLStream to be placed into fifo mode. In fifo mode no images are discarded. If the producer attempts to insert a frame and
        the fifo is full then the producer will stall until there is room in the fifo. When the consumer retrieves an image frame from the EGLStream it will
        see the image frame that immediately follows the image frame that it last retrieved (unless no such frame has been inserted yet in which case it
        retrieves the same image frame that it retrieved last time).

        Timing of the EGLStream in mailbox mode, as described by the EGL_KHR_stream extension, is the responsibility of the producer (with help from the
        consumer in the form of the EGL_CONSUMER_LATENCY_USEC_KHR hint).

        In contrast, timing of an EGLStream in fifo mode is the responsibility of the consumer. Each image frame in the fifo has an associated timestamp set by
        the producer. The consumer can use this timestamp to determine when the image frame is intended to be displayed to the user.

        Requires ${EGL12.core} and ${KHR_stream.link}.
        """

    IntConstant(
        "",

        "STREAM_FIFO_LENGTH_KHR"..0x31FC,
        "STREAM_TIME_NOW_KHR"..0x31FD,
        "STREAM_TIME_CONSUMER_KHR"..0x31FE,
        "STREAM_TIME_PRODUCER_KHR"..0x31FF
    )

    EGLBoolean(
        "QueryStreamTimeKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", ""),
        EGLenum.IN("attribute", ""),
        Check(1)..EGLTimeKHR_p.OUT("value", "")
    )
}