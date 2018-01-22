/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val NV_stream_frame_limits = "NVStreamFrameLimits".nativeClassEGL("NV_stream_frame_limits", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Some stream consumers may allow more than one frame to be acquired at a time, so that applications can operate on sequences of images rather than
        individual images. This in turn may lead to producers allocating additional buffers to keep the fifo full while fulfilling the consumer's needs.
        Applications may wish to limit the resources allocated for a given stream, and some stream implementations may be able to operate more efficiently if
        they know in advance how many buffers will be used.

        This extension defines two new stream attributes which provide hints as to how many frames the application will require, allowing the implementation to
        plan accordingly.

        Requires ${KHR_stream.link}.
        """

    IntConstant(
        "Accepted as an attribute name in the {@code attrib_list} parameter of #CreateStreamKHR() and as the {@code attribute} parameter of #QueryStreamKHR().",

        "PRODUCER_MAX_FRAME_HINT_NV"..0x3337,
        "CONSUMER_MAX_FRAME_HINT_NV"..0x3338
    )
}