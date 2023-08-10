/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_stream_dma.txt">NV_stream_dma</a> extension.
 * 
 * <p>This extension provides the framework for performing DMA transfers between opposite ends of a single stream, if there is no shared memory available
 * between them.</p>
 * 
 * <p>In case of cross system streams the buffer contents of one end of the stream is transferred to other end using sockets by {@code EGL_NV_stream_socket}
 * extension. Transferring buffer contents through sockets is slower compared to DMA transfers. Since DMA transfers have higher throughput compared to
 * sockets, using {@code EGL_NV_stream_dma} extension, applications can request EGL to utilize DMA channels to perform buffer copies.</p>
 * 
 * <p>Requires {@link NVStreamRemote NV_stream_remote} and {@code NV_stream_cross_system}.</p>
 */
public final class NVStreamDMA {

    /** Accepted as attribute names in {@link KHRStream#eglCreateStreamKHR CreateStreamKHR}, {@link KHRStreamAttrib#eglCreateStreamAttribKHR CreateStreamAttribKHR}, {@link KHRStream#eglQueryStreamKHR QueryStreamKHR}, and {@link KHRStreamAttrib#eglQueryStreamAttribKHR QueryStreamAttribKHR}. */
    public static final int
        EGL_STREAM_DMA_NV        = 0x3371,
        EGL_STREAM_DMA_SERVER_NV = 0x3372;

    private NVStreamDMA() {}

}