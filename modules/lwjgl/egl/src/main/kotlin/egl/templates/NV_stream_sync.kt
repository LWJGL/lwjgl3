/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val NV_stream_sync = "NVStreamSync".nativeClassEGL("NV_stream_sync", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines a new type of reusable sync object. This sync object will be signaled each time a new image frame becomes available in an
        EGLStream for the consumer to consume.

        Requires ${EGL12.core}, ${KHR_stream.link} and ${KHR_reusable_sync.link}.
        """

    IntConstant(
        "",

        "SYNC_TYPE_KHR"..0x30F7,
        "SYNC_NEW_FRAME_NV"..0x321F
    )

    EGLSyncKHR(
        "CreateStreamSyncNV",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", ""),
        EGLenum.IN("type", ""),
        noneTerminated..const..EGLint_p.IN("attrib_list", "")
    )
}