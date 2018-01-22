/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val NV_stream_fifo_synchronous = "NVStreamFIFOSynchronous".nativeClassEGL("NV_stream_fifo_synchronous", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        On platforms which support asynchronous rendering, frames may be inserted into a stream by the producer and become available to the consumer before
        rendering of the images has completed. When this happens, commands issued by the consumer which read from the image must implicitly wait before they
        can be executed. In many use cases, this is desirable behavior. Rendering pipelines are kept full, and frames are created and processed as fast as
        possible.

        However, in the case of a compositor which is consuming frames from multiple producers at once, combining them into a single output image, this can
        slow the compositor to the frame rate of the slowest producer. If the application acquires and uses an image from one producer which requires a long
        time to finish rendering, it will be prevented from presenting new frames from faster producers in a timely fashion. In this case, the compositor would
        prefer to reuse an older frame from the slower producer until the new one is ready.

        This could be handled with existing interfaces by the producer issuing appropriate Finish call before inserting the frame into the stream. However this
        requires the producer to have knowledge of the consumer's use case, and also introduces undesirable bubbles into the producer's pipeline which will
        slow it even further.

        This extension allows streams to be configured to defer the availability of new frames inserted by the producer until they are ready to be used. The
        producer proceeds as normal, but the frames visible to the consumer through query and acquire operations do not update immediately.

        Interactions of this feature with a stream operating in mailbox mode would be hard to define. Because newly inserted frames replace previous unacquired
        ones, it is possible that the consumer would never see a completed frame become available. Therefore this feature is only available for streams
        operating in FIFO mode.

        Requires ${KHR_stream_fifo.link}.
        """

    IntConstant(
        "Accepted as an attribute name in the {@code attrib_list} parameter of #CreateStreamKHR() and a the {@code attribute} parameter of #QueryStreamKHR().",

        "STREAM_FIFO_SYNCHRONOUS_NV"..0x3336
    )
}