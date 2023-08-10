/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_stream_reset.txt">NV_stream_reset</a> extension.
 * 
 * <p>The base stream extension requires that, once the producer inserts the first frame into the stream, at least one frame is always available to be
 * acquired by the consumer until the stream disconnects. However, there are some use cases in which the producer or the consumer may wish to allow the
 * stream to empty without permanently disconnecting.</p>
 * 
 * <p>An example of a use case where the producer may wish to empty the stream is a security or rear-view camera which temporarily stops producing new
 * frames, perhaps due to a hardware reset. Continuing to display the last frame available would produce a false impression of the current state, and
 * should be avoided for safety reasons. A better solution would be to let the consumer know there was no available image, so that it could take
 * appropriate actions, and then recover when the camera begins streaming again.</p>
 * 
 * <p>This use case could be handled with existing functionality by disconnecting and destroying the stream and then recreating and reconnecting it when new
 * frames are available. However, this can be burdensome, particularly when the producer and consumer reside in separate processes.</p>
 * 
 * <p>An example of a use case where the consumer may wish to empty the stream is an image processer which operates on each frame exactly once. After
 * processing, it will not waste resources operating on the same frame a second time. This use case can be handled by carefully monitoring the
 * availability of a new frame before performing an acquire operation. But returning the buffer(s) as soon as they are no longer needed allows for better
 * resource management.</p>
 * 
 * <p>This extension allows a stream to be completely drained of existing frames by the consumer or flushed of existing frames by the producer without
 * disconnecting, so that processing may continue again when new frames are produced.</p>
 * 
 * <p>Requires {@link KHRStream KHR_stream}.</p>
 */
public class NVStreamReset {

    /** Accepted as an attribute in the {@code attrib_list} parameter of {@link KHRStream#eglCreateStreamKHR CreateStreamKHR} and the {@code attrib} parameter of {@link KHRStream#eglQueryStreamKHR QueryStreamKHR}. */
    public static final int
        EGL_SUPPORT_RESET_NV = 0x3334,
        EGL_SUPPORT_REUSE_NV = 0x3335;

    protected NVStreamReset() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglResetStreamNV ] ---

    @NativeType("EGLBoolean")
    public static boolean eglResetStreamNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream) {
        long __functionAddress = EGL.getCapabilities().eglResetStreamNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPI(dpy, stream, __functionAddress) != 0;
    }

}