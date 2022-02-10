/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_stream_consumer_eglimage = "NVStreamConsumerEGLImage".nativeClassEGL("NV_stream_consumer_eglimage", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        An {@code EGLStream} consists of a sequence of image frames. This extension allows these frames to be acquired as {@code EGLImages}. Frames from the
        stream would be used as the content for the EGLImage.

        Requires ${KHR_stream.link} and ${EXT_sync_reuse.link}.
        """

    IntConstant(
        "Accepted by the {@code target} parameter of #CreateImage().",

        "STREAM_CONSUMER_IMAGE_NV"..0x3373
    )

    IntConstant(
        "Returned as an {@code event} from #QueryStreamConsumerEventNV().",

        "STREAM_IMAGE_ADD_NV"..0x3374,
        "STREAM_IMAGE_REMOVE_NV"..0x3375,
        "STREAM_IMAGE_AVAILABLE_NV"..0x3376
    )

    EGLBoolean(
        "StreamImageConsumerConnectNV",
        "",

        EGLDisplay("dpy", ""),
        EGLStreamKHR("stream", ""),
        AutoSize("modifiers")..EGLint("num_modifiers", ""),
        EGLuint64KHR.const.p("modifiers", ""),
        nullable..noneTerminated..EGLAttrib.const.p("attrib_list", "")
    )

    EGLint(
        "QueryStreamConsumerEventNV",
        "",

        EGLDisplay("dpy", ""),
        EGLStreamKHR("stream", ""),
        EGLTime("timeout", ""),
        Check(1)..EGLenum.p("event", ""),
        Check(1)..EGLAttrib.p("aux", "")
    )

    EGLBoolean(
        "StreamAcquireImageNV",
        "",

        EGLDisplay("dpy", ""),
        EGLStreamKHR("stream", ""),
        Check(1)..EGLImage.p("pImage", ""),
        EGLSync("sync", "")
    )

    EGLBoolean(
        "StreamReleaseImageNV",
        "",

        EGLDisplay("dpy", ""),
        EGLStreamKHR("stream", ""),
        EGLImage("image", ""),
        EGLSync("sync", "")
    )
}