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
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_system_time.txt">NV_system_time</a> extension.
 * 
 * <p>This extension exposes an alternative method of querying the system time from the driver instead of the operating system.</p>
 * 
 * <p>Requires {@link EGL12 EGL 1.2}.</p>
 */
public class NVSystemTime {

    protected NVSystemTime() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglGetSystemTimeFrequencyNV ] ---

    @NativeType("EGLuint64NV")
    public static long eglGetSystemTimeFrequencyNV() {
        long __functionAddress = EGL.getCapabilities().eglGetSystemTimeFrequencyNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJ(__functionAddress);
    }

    // --- [ eglGetSystemTimeNV ] ---

    @NativeType("EGLuint64NV")
    public static long eglGetSystemTimeNV() {
        long __functionAddress = EGL.getCapabilities().eglGetSystemTimeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJ(__functionAddress);
    }

}