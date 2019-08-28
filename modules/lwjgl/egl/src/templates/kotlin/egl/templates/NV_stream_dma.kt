/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_stream_dma = "NVStreamDMA".nativeClassEGL("NV_stream_dma", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides the framework for performing DMA transfers between opposite ends of a single stream, if there is no shared memory available
        between them. 

        In case of cross system streams the buffer contents of one end of the stream is transferred to other end using sockets by {@code EGL_NV_stream_socket}
        extension. Transferring buffer contents through sockets is slower compared to DMA transfers. Since DMA transfers have higher throughput compared to
        sockets, using {@code EGL_NV_stream_dma} extension, applications can request EGL to utilize DMA channels to perform buffer copies.        

        Requires ${NV_stream_remote.link} and {@code NV_stream_cross_system}.
        """

    IntConstant(
        "Accepted as attribute names in #CreateStreamKHR(), #CreateStreamAttribKHR(), #QueryStreamKHR(), and #QueryStreamAttribKHR().",

        "STREAM_DMA_NV"..0x3371,
        "STREAM_DMA_SERVER_NV"..0x3372
    )
}