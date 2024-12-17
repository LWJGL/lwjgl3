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

public class WLBindWaylandDisplay {

    protected WLBindWaylandDisplay() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglBindWaylandDisplayWL ] ---

    /** {@code EGLBoolean eglBindWaylandDisplayWL(EGLDisplay dpy, struct wl_display * display)} */
    @NativeType("EGLBoolean")
    public static boolean eglBindWaylandDisplayWL(@NativeType("EGLDisplay") long dpy, @NativeType("struct wl_display *") long display) {
        long __functionAddress = EGL.getCapabilities().eglBindWaylandDisplayWL;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(display);
        }
        return callPPI(dpy, display, __functionAddress) != 0;
    }

    // --- [ eglUnbindWaylandDisplayWL ] ---

    /** {@code EGLBoolean eglUnbindWaylandDisplayWL(EGLDisplay dpy, struct wl_display * display)} */
    @NativeType("EGLBoolean")
    public static boolean eglUnbindWaylandDisplayWL(@NativeType("EGLDisplay") long dpy, @NativeType("struct wl_display *") long display) {
        long __functionAddress = EGL.getCapabilities().eglUnbindWaylandDisplayWL;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(display);
        }
        return callPPI(dpy, display, __functionAddress) != 0;
    }

    // --- [ eglQueryWaylandBufferWL ] ---

    /** {@code EGLBoolean eglQueryWaylandBufferWL(EGLDisplay dpy, struct wl_resource * buffer, EGLint attribute, EGLint * value)} */
    public static int neglQueryWaylandBufferWL(long dpy, long buffer, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryWaylandBufferWL;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(buffer);
        }
        return callPPPI(dpy, buffer, attribute, value, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryWaylandBufferWL(EGLDisplay dpy, struct wl_resource * buffer, EGLint attribute, EGLint * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryWaylandBufferWL(@NativeType("EGLDisplay") long dpy, @NativeType("struct wl_resource *") long buffer, @NativeType("EGLint") int attribute, @NativeType("EGLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryWaylandBufferWL(dpy, buffer, attribute, memAddress(value)) != 0;
    }

    /** {@code EGLBoolean eglQueryWaylandBufferWL(EGLDisplay dpy, struct wl_resource * buffer, EGLint attribute, EGLint * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryWaylandBufferWL(@NativeType("EGLDisplay") long dpy, @NativeType("struct wl_resource *") long buffer, @NativeType("EGLint") int attribute, @NativeType("EGLint *") int[] value) {
        long __functionAddress = EGL.getCapabilities().eglQueryWaylandBufferWL;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(buffer);
            check(value, 1);
        }
        return callPPPI(dpy, buffer, attribute, value, __functionAddress) != 0;
    }

}