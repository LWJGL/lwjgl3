/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*

val NV_stream_flush = "NVStreamFlush".nativeClassEGL("NV_stream_flush", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The {@code EGL_KHR_stream_cross_process_fd} and {@code EGL_NV_stream_remote} extensions do not guarantee that when the state of the {@code EGLStream}
        object representing one endpoint of the stream changes, the state of the other endpoint will immediately reflect that change. Depending on the
        implementation, there may be some latency in the propagation of state changes.

        This latency will not affect any applications which rely solely on the stream itself for communication. State changes made on one side will eventually
        be visible on the other side, and can then be responded to.

        This only affects applications which use some additional means of communication outside of the stream itself, which may encounter race conditions. In
        particular, if an application inserts a frame into a stream, then sends a message to the other side indicating that the frame is ready, the other side
        may encounter an error if it tries to acquire the frame and it is not yet available.

        One solution is to force all operations that change state of one endpoint to behave synchronously, and not return until the change is reflected on the
        other endpoint. However this adds undesirable delays for the majority of applications and operations where such synchronization is not required. This
        extension instead provides a means for applications to explicitly invoke such synchronization only where required.

        Requires the ${KHR_stream.link} extension and either the ${KHR_stream_cross_process_fd.link} or ${NV_stream_remote.link} extensions.
        """

    EGLBoolean(
        "StreamFlush",
        "",

        EGLDisplay("dpy", ""),
        EGLStreamKHR("stream", "")
    )
}