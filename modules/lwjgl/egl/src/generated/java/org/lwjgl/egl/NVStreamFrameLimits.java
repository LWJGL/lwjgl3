/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_stream_frame_limits.txt">NV_stream_frame_limits</a> extension.
 * 
 * <p>Some stream consumers may allow more than one frame to be acquired at a time, so that applications can operate on sequences of images rather than
 * individual images. This in turn may lead to producers allocating additional buffers to keep the fifo full while fulfilling the consumer's needs.
 * Applications may wish to limit the resources allocated for a given stream, and some stream implementations may be able to operate more efficiently if
 * they know in advance how many buffers will be used.</p>
 * 
 * <p>This extension defines two new stream attributes which provide hints as to how many frames the application will require, allowing the implementation to
 * plan accordingly.</p>
 * 
 * <p>Requires {@link KHRStream KHR_stream}.</p>
 */
public final class NVStreamFrameLimits {

    /** Accepted as an attribute name in the {@code attrib_list} parameter of {@link KHRStream#eglCreateStreamKHR CreateStreamKHR} and as the {@code attribute} parameter of {@link KHRStream#eglQueryStreamKHR QueryStreamKHR}. */
    public static final int
        EGL_PRODUCER_MAX_FRAME_HINT_NV = 0x3337,
        EGL_CONSUMER_MAX_FRAME_HINT_NV = 0x3338;

    private NVStreamFrameLimits() {}

}