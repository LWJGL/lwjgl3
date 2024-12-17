/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class ANDROIDPresentationTime {

    protected ANDROIDPresentationTime() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglPresentationTimeANDROID ] ---

    /** {@code EGLBoolean eglPresentationTimeANDROID(EGLDisplay dpy, EGLSurface surface, EGLnsecsANDROID time)} */
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