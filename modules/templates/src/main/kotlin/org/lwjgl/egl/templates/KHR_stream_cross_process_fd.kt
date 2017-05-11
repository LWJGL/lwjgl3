/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_stream_cross_process_fd = "KHRStreamCrossProcessFD".nativeClassEGL("KHR_stream_cross_process_fd", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows an EGLStreamKHR object handle to be duplicated into another process so that the EGLStream producer can be in one process while
        the EGLStream consumer can be in another process.

        Duplicating the EGLStreamKHR object handle into another process is peformed in 3 steps
        ${ol(
            "Get a file descriptor associated with the EGLStream.",
            "Duplicate the file descriptor into another process.",
            "Create an EGLStreamKHR from the duplicated file descriptor in the other process."
        )}
        The file descriptor is obtained by calling eglGetStreamFileDescriptorKHR().

        Duplicating the file descriptor into another process is outside the scope of this extension. See issue \\#1 for an example of how to do this on a Linux
        system.

        The EGLStreamKHR object handle is created in the second process by passing the file descriptor to the eglCreateStreamFromFileDescriptorKHR() function.
        This must be done while the EGLStream is in the EGL_STREAM_STATE_CREATED_KHR state.

        Once the EGLStreamKHR object handle is created in the second process, it refers to the same EGLStream as the EGLStreamKHR object handle in the original
        process. A consumer can be associated with the EGLStream from either process. A producer can be associated with the EGLStream from either process.

        Requires ${EGL12.core} and ${KHR_stream.link}.
        """

    IntConstant(
        "",

        "NO_FILE_DESCRIPTOR_KHR".."-1"
    )

    EGLNativeFileDescriptorKHR(
        "GetStreamFileDescriptorKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", "")
    )

    EGLStreamKHR(
        "CreateStreamFromFileDescriptorKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLNativeFileDescriptorKHR.IN("file_descriptor", "")
    )
}