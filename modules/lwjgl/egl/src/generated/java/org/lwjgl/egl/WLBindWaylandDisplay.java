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
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/WL/EGL_WL_bind_wayland_display.txt">WL_bind_wayland_display</a> extension.
 * 
 * <p>This extension provides entry points for binding and unbinding the wl_display of a Wayland compositor to an {@code EGLDisplay}. Binding a
 * {@code wl_display} means that the EGL implementation should provide one or more interfaces in the Wayland protocol to allow clients to create
 * {@code wl_buffer} objects. On the server side, this extension also provides a new target for {@link KHRImageBase#eglCreateImageKHR CreateImageKHR}, to create an {@code EGLImage} from a
 * {@code wl_buffer}.</p>
 * 
 * <p>Adding an implementation-specific Wayland interface, allows the EGL implementation to define specific wayland requests and events, needed for buffer
 * sharing in an EGL Wayland platform.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4} and {@link KHRImageBase KHR_image_base}.</p>
 */
public class WLBindWaylandDisplay {

    protected WLBindWaylandDisplay() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglBindWaylandDisplayWL ] ---

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

    public static int neglQueryWaylandBufferWL(long dpy, long buffer, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryWaylandBufferWL;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(buffer);
        }
        return callPPPI(dpy, buffer, attribute, value, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryWaylandBufferWL(@NativeType("EGLDisplay") long dpy, @NativeType("struct wl_resource *") long buffer, @NativeType("EGLint") int attribute, @NativeType("EGLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryWaylandBufferWL(dpy, buffer, attribute, memAddress(value)) != 0;
    }

    /** Array version of: {@link #eglQueryWaylandBufferWL QueryWaylandBufferWL} */
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