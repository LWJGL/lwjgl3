/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_stream_cross_process_fd = "KHRStreamCrossProcessFD".nativeClassEGL("KHR_stream_cross_process_fd", postfix = KHR) {
    IntConstant(
        "NO_FILE_DESCRIPTOR_KHR".."-1"
    )

    EGLNativeFileDescriptorKHR(
        "GetStreamFileDescriptorKHR",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream")
    )

    EGLStreamKHR(
        "CreateStreamFromFileDescriptorKHR",

        EGLDisplay("dpy"),
        EGLNativeFileDescriptorKHR("file_descriptor")
    )
}