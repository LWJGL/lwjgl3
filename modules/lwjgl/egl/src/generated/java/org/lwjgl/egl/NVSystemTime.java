/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class NVSystemTime {

    protected NVSystemTime() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglGetSystemTimeFrequencyNV ] ---

    /** {@code EGLuint64NV eglGetSystemTimeFrequencyNV(void)} */
    @NativeType("EGLuint64NV")
    public static long eglGetSystemTimeFrequencyNV() {
        long __functionAddress = EGL.getCapabilities().eglGetSystemTimeFrequencyNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJ(__functionAddress);
    }

    // --- [ eglGetSystemTimeNV ] ---

    /** {@code EGLuint64NV eglGetSystemTimeNV(void)} */
    @NativeType("EGLuint64NV")
    public static long eglGetSystemTimeNV() {
        long __functionAddress = EGL.getCapabilities().eglGetSystemTimeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJ(__functionAddress);
    }

}