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
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_stream_flush.txt">NV_stream_flush</a> extension.
 * 
 * <p>The {@code EGL_KHR_stream_cross_process_fd} and {@code EGL_NV_stream_remote} extensions do not guarantee that when the state of the {@code EGLStream}
 * object representing one endpoint of the stream changes, the state of the other endpoint will immediately reflect that change. Depending on the
 * implementation, there may be some latency in the propagation of state changes.</p>
 * 
 * <p>This latency will not affect any applications which rely solely on the stream itself for communication. State changes made on one side will eventually
 * be visible on the other side, and can then be responded to.</p>
 * 
 * <p>This only affects applications which use some additional means of communication outside of the stream itself, which may encounter race conditions. In
 * particular, if an application inserts a frame into a stream, then sends a message to the other side indicating that the frame is ready, the other side
 * may encounter an error if it tries to acquire the frame and it is not yet available.</p>
 * 
 * <p>One solution is to force all operations that change state of one endpoint to behave synchronously, and not return until the change is reflected on the
 * other endpoint. However this adds undesirable delays for the majority of applications and operations where such synchronization is not required. This
 * extension instead provides a means for applications to explicitly invoke such synchronization only where required.</p>
 * 
 * <p>Requires the {@link KHRStream KHR_stream} extension and either the {@link KHRStreamCrossProcessFD KHR_stream_cross_process_fd} or {@link NVStreamRemote NV_stream_remote} extensions.</p>
 */
public class NVStreamFlush {

    protected NVStreamFlush() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglStreamFlush ] ---

    @NativeType("EGLBoolean")
    public static boolean eglStreamFlush(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream) {
        long __functionAddress = EGL.getCapabilities().eglStreamFlush;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPI(dpy, stream, __functionAddress) != 0;
    }

}