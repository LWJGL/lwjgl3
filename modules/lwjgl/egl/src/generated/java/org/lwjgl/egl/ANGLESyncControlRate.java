/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/ANGLE/EGL_ANGLE_sync_control_rate.txt">ANGLE_sync_control_rate</a> extension.
 * 
 * <p>This extension provides counters which let applications know about the timing of the last vertical retrace. By looking at the system clock, as well as
 * the refresh rate of the monitor, this should enable applications to predict the position of future retraces so as to schedule an optimal workload.</p>
 * 
 * <p>This extension incorporates the use of a counter that provides the necessary synchronization. The graphics Media Stream Counter (or graphics MSC) is a
 * counter that is unique to the graphics subsystem and increments for each vertical retrace that occurs.</p>
 * 
 * <p>By querying the MSC rate for a given surface, the application can accurately predict the timing for the next vertical retraces and schedule rendering
 * accordingly.</p>
 */
public class ANGLESyncControlRate {

    protected ANGLESyncControlRate() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglGetMscRateANGLE ] ---

    public static int neglGetMscRateANGLE(long dpy, long surface, long numerator, long denominator) {
        long __functionAddress = EGL.getCapabilities().eglGetMscRateANGLE;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPPI(dpy, surface, numerator, denominator, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglGetMscRateANGLE(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("int32_t *") IntBuffer numerator, @NativeType("int32_t *") IntBuffer denominator) {
        if (CHECKS) {
            check(numerator, 1);
            check(denominator, 1);
        }
        return neglGetMscRateANGLE(dpy, surface, memAddress(numerator), memAddress(denominator)) != 0;
    }

    /** Array version of: {@link #eglGetMscRateANGLE GetMscRateANGLE} */
    @NativeType("EGLBoolean")
    public static boolean eglGetMscRateANGLE(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("int32_t *") int[] numerator, @NativeType("int32_t *") int[] denominator) {
        long __functionAddress = EGL.getCapabilities().eglGetMscRateANGLE;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
            check(numerator, 1);
            check(denominator, 1);
        }
        return callPPPPI(dpy, surface, numerator, denominator, __functionAddress) != 0;
    }

}