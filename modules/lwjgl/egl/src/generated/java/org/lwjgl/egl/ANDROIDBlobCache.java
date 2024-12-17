/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class ANDROIDBlobCache {

    protected ANDROIDBlobCache() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglSetBlobCacheFuncsANDROID ] ---

    /** {@code void eglSetBlobCacheFuncsANDROID(EGLDisplay dpy, EGLSetBlobFuncANDROID set, EGLGetBlobFuncANDROID get)} */
    public static void neglSetBlobCacheFuncsANDROID(long dpy, long set, long get) {
        long __functionAddress = EGL.getCapabilities().eglSetBlobCacheFuncsANDROID;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        callPPPV(dpy, set, get, __functionAddress);
    }

    /** {@code void eglSetBlobCacheFuncsANDROID(EGLDisplay dpy, EGLSetBlobFuncANDROID set, EGLGetBlobFuncANDROID get)} */
    public static void eglSetBlobCacheFuncsANDROID(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSetBlobFuncANDROID") EGLSetBlobFuncANDROIDI set, @NativeType("EGLGetBlobFuncANDROID") EGLGetBlobFuncANDROIDI get) {
        neglSetBlobCacheFuncsANDROID(dpy, set.address(), get.address());
    }

}