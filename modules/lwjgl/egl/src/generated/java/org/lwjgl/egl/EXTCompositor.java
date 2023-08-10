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
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_compositor.txt">EXT_compositor</a> extension.
 * 
 * <p>This extension allows for the composition of multiple windows within a multi-partition EGL system. The extension allows a primary EGLContext and window
 * to be created for each display. All other windows are created using non-displayable surfaces. A handle to each off-screen window is provided to the
 * primary EGLContext to allow the composition of all non-displayable windows on a single display.</p>
 * 
 * <p>For each display, there is one EGLContext which has access to create on screen windows, this is call the primary context for this display. All other
 * EGLContexts are referred to as secondary contexts.</p>
 * 
 * <p>This extension requires a multi-partition EGL driver to support asynchronous rendering of off screen surfaces.</p>
 * 
 * <p>Information assurance is provided by preventing context and surface creation by unregistered contexts and by preventing the non-primary contexts and
 * surfaces from rendering to the display.</p>
 */
public class EXTCompositor {

    /** New attributes accepted by the {@code attrib_list} argument of {@link EGL10#eglCreateContext CreateContext}. */
    public static final int EGL_PRIMARY_COMPOSITOR_CONTEXT_EXT = 0x3460;

    /** New attributes accepted by the {@code attrib_list} argument of {@link EGL10#eglCreateContext CreateContext} and {@link EGL10#eglCreateWindowSurface CreateWindowSurface}. */
    public static final int EGL_EXTERNAL_REF_ID_EXT = 0x3461;

    /** New attributes accepted by the {@code policy} argument of {@link #eglCompositorSwapPolicyEXT CompositorSwapPolicyEXT}. */
    public static final int
        EGL_COMPOSITOR_DROP_NEWEST_FRAME_EXT = 0x3462,
        EGL_COMPOSITOR_KEEP_NEWEST_FRAME_EXT = 0x3463;

    protected EXTCompositor() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCompositorSetContextListEXT ] ---

    public static int neglCompositorSetContextListEXT(long external_ref_ids, int num_entries) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetContextListEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_ref_ids, num_entries, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetContextListEXT(@NativeType("EGLint const *") IntBuffer external_ref_ids) {
        return neglCompositorSetContextListEXT(memAddress(external_ref_ids), external_ref_ids.remaining()) != 0;
    }

    // --- [ eglCompositorSetContextAttributesEXT ] ---

    public static int neglCompositorSetContextAttributesEXT(int external_ref_id, long context_attributes, int num_entries) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetContextAttributesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_ref_id, context_attributes, num_entries, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetContextAttributesEXT(@NativeType("EGLint") int external_ref_id, @NativeType("EGLint const *") IntBuffer context_attributes) {
        return neglCompositorSetContextAttributesEXT(external_ref_id, memAddress(context_attributes), context_attributes.remaining()) != 0;
    }

    // --- [ eglCompositorSetWindowListEXT ] ---

    public static int neglCompositorSetWindowListEXT(int external_ref_id, long external_win_ids, int num_entries) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetWindowListEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_ref_id, external_win_ids, num_entries, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetWindowListEXT(@NativeType("EGLint") int external_ref_id, @NativeType("EGLint const *") IntBuffer external_win_ids) {
        return neglCompositorSetWindowListEXT(external_ref_id, memAddress(external_win_ids), external_win_ids.remaining()) != 0;
    }

    // --- [ eglCompositorSetWindowAttributesEXT ] ---

    public static int neglCompositorSetWindowAttributesEXT(int external_win_id, long window_attributes, int num_entries) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetWindowAttributesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_win_id, window_attributes, num_entries, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetWindowAttributesEXT(@NativeType("EGLint") int external_win_id, @NativeType("EGLint const *") IntBuffer window_attributes) {
        return neglCompositorSetWindowAttributesEXT(external_win_id, memAddress(window_attributes), window_attributes.remaining()) != 0;
    }

    // --- [ eglCompositorBindTexWindowEXT ] ---

    @NativeType("EGLBoolean")
    public static boolean eglCompositorBindTexWindowEXT(@NativeType("EGLint") int external_win_id) {
        long __functionAddress = EGL.getCapabilities().eglCompositorBindTexWindowEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(external_win_id, __functionAddress) != 0;
    }

    // --- [ eglCompositorSetSizeEXT ] ---

    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetSizeEXT(@NativeType("EGLint") int external_win_id, @NativeType("EGLint") int width, @NativeType("EGLint") int height) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetSizeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(external_win_id, width, height, __functionAddress) != 0;
    }

    // --- [ eglCompositorSwapPolicyEXT ] ---

    @NativeType("EGLBoolean")
    public static boolean eglCompositorSwapPolicyEXT(@NativeType("EGLint") int external_win_id, @NativeType("EGLint") int policy) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSwapPolicyEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(external_win_id, policy, __functionAddress) != 0;
    }

    /** Array version of: {@link #eglCompositorSetContextListEXT CompositorSetContextListEXT} */
    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetContextListEXT(@NativeType("EGLint const *") int[] external_ref_ids) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetContextListEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_ref_ids, external_ref_ids.length, __functionAddress) != 0;
    }

    /** Array version of: {@link #eglCompositorSetContextAttributesEXT CompositorSetContextAttributesEXT} */
    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetContextAttributesEXT(@NativeType("EGLint") int external_ref_id, @NativeType("EGLint const *") int[] context_attributes) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetContextAttributesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_ref_id, context_attributes, context_attributes.length, __functionAddress) != 0;
    }

    /** Array version of: {@link #eglCompositorSetWindowListEXT CompositorSetWindowListEXT} */
    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetWindowListEXT(@NativeType("EGLint") int external_ref_id, @NativeType("EGLint const *") int[] external_win_ids) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetWindowListEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_ref_id, external_win_ids, external_win_ids.length, __functionAddress) != 0;
    }

    /** Array version of: {@link #eglCompositorSetWindowAttributesEXT CompositorSetWindowAttributesEXT} */
    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetWindowAttributesEXT(@NativeType("EGLint") int external_win_id, @NativeType("EGLint const *") int[] window_attributes) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetWindowAttributesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_win_id, window_attributes, window_attributes.length, __functionAddress) != 0;
    }

}