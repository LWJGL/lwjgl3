/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_stream = "KHRStream".nativeClassEGL("KHR_stream", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines a new object, the EGLStream, that can be used to efficiently transfer a sequence of image frames from one API to another. The
        EGLStream has mechanisms that can help keep audio data synchronized to video data.

        Each EGLStream is associated with a "producer" that generates image frames and inserts them into the EGLStream. The producer is responsible for
        inserting each image frame into the EGLStream at the correct time so that the consumer can display the image frame for the appropriate period of time.

        Each EGLStream is also associated with a "consumer" that retrieves image frames from the EGLStream. The consumer is responsible for noticing that an
        image frame is available and displaying it (or otherwise consuming it). The consumer is also responsible for indicating the latency when that is
        possible (the latency is the time that elapses between the time it is retrieved from the EGLStream until the time it is displayed to the user).

        Some APIs are stream oriented (examples: OpenMAX IL, OpenMAX AL). These APIs may be connected directly to an EGLStream as a producer or consumer. Once
        a stream oriented producer is "connected" to an EGLStream and "started" it may insert image frames into the EGLStream automatically with no further
        interaction from the application. Likewise, once a stream oriented consumer is "connected" to an EGLStream and "started" it may retrieve image frames
        from the EGLStream automatically with no further interaction from the application.

        Some APIs are rendering oriented and require interaction with the application during the rendering of each frame (examples: OpenGL, OpenGL ES, OpenVG).
        These APIs will not automatically insert or retrieve image frames into/from the EGLStream. Instead the application must take explicit action to cause a
        rendering oriented producer to insert an image frame or to cause a rendering oriented consumer to retrieve an image frame.

        The EGLStream conceptually operates as a mailbox. When the producer has a new image frame it empties the mailbox (discards the old contents) and
        inserts the new image frame into the mailbox. The consumer retrieves the image frame from the mailbox and examines it. When the consumer is finished
        examining the image frame it is either placed back in the mailbox (if the mailbox is empty) or discarded (if the mailbox is not empty).

        Timing is mainly controlled by the producer. The consumer operated with a fixed latency that it indicates to the producer through the
        EGL_CONSUMER_LATENCY_USEC_KHR attribute. The consumer is expected to notice when a new image frame is available in the EGLStream, retrieve it, and
        display it to the user in the time indicated by EGL_CONSUMER_LATENCY_USEC_KHR. The producer controls when the image frame will be displayed by
        inserting it into the stream at time T - EGL_CONSUMER_LATENCY_USEC_KHR where T is the time that the image frame is intended to appear to the user.

        This extension does not cover the details of how a producer or a consumer works or is "connected" to an EGLStream. Different kinds of producers and
        consumers work differently and are described in additional extension specifications.
        """

    LongConstant(
        "",

        "NO_STREAM_KHR"..0L
    )

    IntConstant(
        "",

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
        "",

        EGLDisplay.IN("dpy", ""),
        nullable..noneTerminated..const..EGLint_p.IN("attrib_list", "")
    )

    EGLBoolean(
        "DestroyStreamKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", "")
    )

    EGLBoolean(
        "StreamAttribKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", ""),
        EGLenum.IN("attribute", ""),
        EGLint.IN("value", "")
    )

    EGLBoolean(
        "QueryStreamKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", ""),
        EGLenum.IN("attribute", ""),
        Check(1)..EGLint_p.OUT("value", "")
    )

    EGLBoolean(
        "QueryStreamu64KHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", ""),
        EGLenum.IN("attribute", ""),
        Check(1)..EGLuint64KHR_p.OUT("value", "")
    )
}

val KHR_stream_attrib = "KHRStreamAttrib".nativeClassEGL("KHR_stream_attrib", postfix = KHR) {
    documentation = "See ${KHR_stream.link}."

    EGLStreamKHR(
        "CreateStreamAttribKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        nullable..noneTerminated..const..EGLAttrib_p.IN("attrib_list", "")
    )

    EGLBoolean(
        "SetStreamAttribKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", ""),
        EGLenum.IN("attribute", ""),
        EGLAttrib.IN("value", "")
    )

    EGLBoolean(
        "QueryStreamAttribKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", ""),
        EGLenum.IN("attribute", ""),
        Check(1)..EGLAttrib_p.OUT("value", "")
    )

    EGLBoolean(
        "StreamConsumerAcquireAttribKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", ""),
        nullable..noneTerminated..const..EGLAttrib_p.IN("attrib_list", "")
    )

    EGLBoolean(
        "StreamConsumerReleaseAttribKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", ""),
        nullable..noneTerminated..const..EGLAttrib_p.IN("attrib_list", "")
    )
}