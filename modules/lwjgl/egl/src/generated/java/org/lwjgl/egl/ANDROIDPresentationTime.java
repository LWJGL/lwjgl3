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
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/ANDROID/EGL_ANDROID_presentation_time.txt">ANDROID_presentation_time</a> extension.
 * 
 * <p>Often when rendering a sequence of images, there is some time at which each image is intended to be presented to the viewer. This extension allows this
 * desired presentation time to be specified for each frame rendered to an {@code EGLSurface}, allowing the native window system to use it.</p>
 */
public class ANDROIDPresentationTime {

    protected ANDROIDPresentationTime() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglPresentationTimeANDROID ] ---

    /**
     * Specifies the time at which the current color buffer of {@code surface} should be presented to the viewer. The {@code time} parameter should be a time
     * in nanoseconds, but the exact meaning of the time depends on the native window system's use of the presentation time. In situations where an absolute
     * time is needed such as displaying the color buffer on a display device, the time should correspond to the system monotonic up-time clock. For situations
     * in which an absolute time is not needed such as using the color buffer for video encoding, the presentation time of the first frame may be arbitrarily
     * chosen and those of subsequent frames chosen relative to that of the first frame.
     * 
     * <p>The presentation time may be set multiple times, with each call to {@code eglPresentationTimeANDROID} overriding prior calls. Setting the presentation
     * time alone does not cause the color buffer to be made visible, but if the color buffer is subsequently posted to a native window or copied to a native
     * pixmap then the presentation time of the surface at that time may be passed along for the native window system to use.</p>
     * 
     * <p>If the surface presentation time is successfully set, {@link EGL10#EGL_TRUE TRUE} is returned. Otherwise {@link EGL10#EGL_FALSE FALSE} is returned and an appropriate error is set. If {@code dpy}
     * is not the name of a valid, initialized {@code EGLDisplay}, an {@link EGL10#EGL_BAD_DISPLAY BAD_DISPLAY} error is generated. If {@code surface} is not a valid {@code EGLSurface}
     * then an {@link EGL10#EGL_BAD_SURFACE BAD_SURFACE} error is generated.</p>
     *
     * @param dpy     the {@code EGLDisplay}
     * @param surface the {@code EGLSurface}
     * @param time    the presentation time
     */
    @NativeType("EGLBoolean")
    public static boolean eglPresentationTimeANDROID(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLnsecsANDROID") long time) {
        long __functionAddress = EGL.getCapabilities().eglPresentationTimeANDROID;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPJI(dpy, surface, time, __functionAddress) != 0;
    }

}