/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_stream_fifo_next.txt">NV_stream_fifo_next</a> extension.
 * 
 * <p>When operating on a FIFO stream, a consumer may need to know the timestamp associated with the next frame in the stream before deciding whether to
 * acquire it or reuse the previous frame. In the case of a FIFO size of 1, the {@link KHRStreamFIFO#EGL_STREAM_TIME_PRODUCER_KHR STREAM_TIME_PRODUCER_KHR} attribute is sufficient to determine this.
 * However, when the size is greater than 1, there may be frames available with earlier time stamps than the one most recently inserted by the producer.
 * This extension enables querying of the next pending frame in a stream.</p>
 * 
 * <p>Requires {@link KHRStreamFIFO KHR_stream_fifo}.</p>
 */
public final class NVStreamFIFONext {

    /** Accepted as the {@code attribute} parameter of {@link KHRStream#eglQueryStreamu64KHR QueryStreamu64KHR}. */
    public static final int EGL_PENDING_FRAME_NV = 0x3329;

    /** Accepted as the {@code attribute} parameter of {@link KHRStreamFIFO#eglQueryStreamTimeKHR QueryStreamTimeKHR}. */
    public static final int EGL_STREAM_TIME_PENDING_NV = 0x332A;

    private NVStreamFIFONext() {}

}