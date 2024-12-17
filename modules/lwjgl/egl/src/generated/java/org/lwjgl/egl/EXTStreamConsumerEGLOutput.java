/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTStreamConsumerEGLOutput {

    protected EXTStreamConsumerEGLOutput() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglStreamConsumerOutputEXT ] ---

    /** {@code EGLBoolean eglStreamConsumerOutputEXT(EGLDisplay dpy, EGLStreamKHR stream, EGLOutputLayerEXT layer)} */
    @NativeType("EGLBoolean")
    public static boolean eglStreamConsumerOutputEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLOutputLayerEXT") long layer) {
        long __functionAddress = EGL.getCapabilities().eglStreamConsumerOutputEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
            check(layer);
        }
        return callPPPI(dpy, stream, layer, __functionAddress) != 0;
    }

}