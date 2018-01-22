/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val NV_stream_fifo_next = "NVStreamFIFONext".nativeClassEGL("NV_stream_fifo_next", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        When operating on a FIFO stream, a consumer may need to know the timestamp associated with the next frame in the stream before deciding whether to
        acquire it or reuse the previous frame. In the case of a FIFO size of 1, the #STREAM_TIME_PRODUCER_KHR attribute is sufficient to determine this.
        However, when the size is greater than 1, there may be frames available with earlier time stamps than the one most recently inserted by the producer.
        This extension enables querying of the next pending frame in a stream.

        Requires ${KHR_stream_fifo.link}.
        """

    IntConstant(
        "Accepted as the {@code attribute} parameter of #QueryStreamu64KHR().",

        "PENDING_FRAME_NV"..0x3329
    )

    IntConstant(
        "Accepted as the {@code attribute} parameter of #QueryStreamTimeKHR().",

        "STREAM_TIME_PENDING_NV"..0x332A
    )
}