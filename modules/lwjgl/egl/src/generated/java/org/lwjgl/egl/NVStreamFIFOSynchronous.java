/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_stream_fifo_synchronous.txt">NV_stream_fifo_synchronous</a> extension.
 * 
 * <p>On platforms which support asynchronous rendering, frames may be inserted into a stream by the producer and become available to the consumer before
 * rendering of the images has completed. When this happens, commands issued by the consumer which read from the image must implicitly wait before they
 * can be executed. In many use cases, this is desirable behavior. Rendering pipelines are kept full, and frames are created and processed as fast as
 * possible.</p>
 * 
 * <p>However, in the case of a compositor which is consuming frames from multiple producers at once, combining them into a single output image, this can
 * slow the compositor to the frame rate of the slowest producer. If the application acquires and uses an image from one producer which requires a long
 * time to finish rendering, it will be prevented from presenting new frames from faster producers in a timely fashion. In this case, the compositor would
 * prefer to reuse an older frame from the slower producer until the new one is ready.</p>
 * 
 * <p>This could be handled with existing interfaces by the producer issuing appropriate Finish call before inserting the frame into the stream. However this
 * requires the producer to have knowledge of the consumer's use case, and also introduces undesirable bubbles into the producer's pipeline which will
 * slow it even further.</p>
 * 
 * <p>This extension allows streams to be configured to defer the availability of new frames inserted by the producer until they are ready to be used. The
 * producer proceeds as normal, but the frames visible to the consumer through query and acquire operations do not update immediately.</p>
 * 
 * <p>Interactions of this feature with a stream operating in mailbox mode would be hard to define. Because newly inserted frames replace previous unacquired
 * ones, it is possible that the consumer would never see a completed frame become available. Therefore this feature is only available for streams
 * operating in FIFO mode.</p>
 * 
 * <p>Requires {@link KHRStreamFIFO KHR_stream_fifo}.</p>
 */
public final class NVStreamFIFOSynchronous {

    /** Accepted as an attribute name in the {@code attrib_list} parameter of {@link KHRStream#eglCreateStreamKHR CreateStreamKHR} and a the {@code attribute} parameter of {@link KHRStream#eglQueryStreamKHR QueryStreamKHR}. */
    public static final int EGL_STREAM_FIFO_SYNCHRONOUS_NV = 0x3336;

    private NVStreamFIFOSynchronous() {}

}