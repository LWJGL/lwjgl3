/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val NV_stream_reset = "NVStreamReset".nativeClassEGL("NV_stream_reset", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The base stream extension requires that, once the producer inserts the first frame into the stream, at least one frame is always available to be
        acquired by the consumer until the stream disconnects. However, there are some use cases in which the producer or the consumer may wish to allow the
        stream to empty without permanently disconnecting.

        An example of a use case where the producer may wish to empty the stream is a security or rear-view camera which temporarily stops producing new
        frames, perhaps due to a hardware reset. Continuing to display the last frame available would produce a false impression of the current state, and
        should be avoided for safety reasons. A better solution would be to let the consumer know there was no available image, so that it could take
        appropriate actions, and then recover when the camera begins streaming again.

        This use case could be handled with existing functionality by disconnecting and destroying the stream and then recreating and reconnecting it when new
        frames are available. However, this can be burdensome, particularly when the producer and consumer reside in separate processes.

        An example of a use case where the consumer may wish to empty the stream is an image processer which operates on each frame exactly once. After
        processing, it will not waste resources operating on the same frame a second time. This use case can be handled by carefully monitoring the
        availability of a new frame before performing an acquire operation. But returning the buffer(s) as soon as they are no longer needed allows for better
        resource management.

        This extension allows a stream to be completely drained of existing frames by the consumer or flushed of existing frames by the producer without
        disconnecting, so that processing may continue again when new frames are produced.

        Requires ${KHR_stream.link}.
        """

    IntConstant(
        "Accepted as an attribute in the {@code attrib_list} parameter of #CreateStreamKHR() and the {@code attrib} parameter of #QueryStreamKHR().",

        "SUPPORT_RESET_NV"..0x3334,
        "SUPPORT_REUSE_NV"..0x3335
    )

    EGLBoolean(
        "ResetStreamNV",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", "")
    )
}