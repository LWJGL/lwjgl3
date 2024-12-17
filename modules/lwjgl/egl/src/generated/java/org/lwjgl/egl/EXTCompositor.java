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

public class EXTCompositor {

    public static final int EGL_PRIMARY_COMPOSITOR_CONTEXT_EXT = 0x3460;

    public static final int EGL_EXTERNAL_REF_ID_EXT = 0x3461;

    public static final int
        EGL_COMPOSITOR_DROP_NEWEST_FRAME_EXT = 0x3462,
        EGL_COMPOSITOR_KEEP_NEWEST_FRAME_EXT = 0x3463;

    protected EXTCompositor() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCompositorSetContextListEXT ] ---

    /** {@code EGLBoolean eglCompositorSetContextListEXT(EGLint const * external_ref_ids, EGLint num_entries)} */
    public static int neglCompositorSetContextListEXT(long external_ref_ids, int num_entries) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetContextListEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_ref_ids, num_entries, __functionAddress);
    }

    /** {@code EGLBoolean eglCompositorSetContextListEXT(EGLint const * external_ref_ids, EGLint num_entries)} */
    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetContextListEXT(@NativeType("EGLint const *") IntBuffer external_ref_ids) {
        return neglCompositorSetContextListEXT(memAddress(external_ref_ids), external_ref_ids.remaining()) != 0;
    }

    // --- [ eglCompositorSetContextAttributesEXT ] ---

    /** {@code EGLBoolean eglCompositorSetContextAttributesEXT(EGLint external_ref_id, EGLint const * context_attributes, EGLint num_entries)} */
    public static int neglCompositorSetContextAttributesEXT(int external_ref_id, long context_attributes, int num_entries) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetContextAttributesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_ref_id, context_attributes, num_entries, __functionAddress);
    }

    /** {@code EGLBoolean eglCompositorSetContextAttributesEXT(EGLint external_ref_id, EGLint const * context_attributes, EGLint num_entries)} */
    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetContextAttributesEXT(@NativeType("EGLint") int external_ref_id, @NativeType("EGLint const *") IntBuffer context_attributes) {
        return neglCompositorSetContextAttributesEXT(external_ref_id, memAddress(context_attributes), context_attributes.remaining()) != 0;
    }

    // --- [ eglCompositorSetWindowListEXT ] ---

    /** {@code EGLBoolean eglCompositorSetWindowListEXT(EGLint external_ref_id, EGLint const * external_win_ids, EGLint num_entries)} */
    public static int neglCompositorSetWindowListEXT(int external_ref_id, long external_win_ids, int num_entries) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetWindowListEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_ref_id, external_win_ids, num_entries, __functionAddress);
    }

    /** {@code EGLBoolean eglCompositorSetWindowListEXT(EGLint external_ref_id, EGLint const * external_win_ids, EGLint num_entries)} */
    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetWindowListEXT(@NativeType("EGLint") int external_ref_id, @NativeType("EGLint const *") IntBuffer external_win_ids) {
        return neglCompositorSetWindowListEXT(external_ref_id, memAddress(external_win_ids), external_win_ids.remaining()) != 0;
    }

    // --- [ eglCompositorSetWindowAttributesEXT ] ---

    /** {@code EGLBoolean eglCompositorSetWindowAttributesEXT(EGLint external_win_id, EGLint const * window_attributes, EGLint num_entries)} */
    public static int neglCompositorSetWindowAttributesEXT(int external_win_id, long window_attributes, int num_entries) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetWindowAttributesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_win_id, window_attributes, num_entries, __functionAddress);
    }

    /** {@code EGLBoolean eglCompositorSetWindowAttributesEXT(EGLint external_win_id, EGLint const * window_attributes, EGLint num_entries)} */
    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetWindowAttributesEXT(@NativeType("EGLint") int external_win_id, @NativeType("EGLint const *") IntBuffer window_attributes) {
        return neglCompositorSetWindowAttributesEXT(external_win_id, memAddress(window_attributes), window_attributes.remaining()) != 0;
    }

    // --- [ eglCompositorBindTexWindowEXT ] ---

    /** {@code EGLBoolean eglCompositorBindTexWindowEXT(EGLint external_win_id)} */
    @NativeType("EGLBoolean")
    public static boolean eglCompositorBindTexWindowEXT(@NativeType("EGLint") int external_win_id) {
        long __functionAddress = EGL.getCapabilities().eglCompositorBindTexWindowEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(external_win_id, __functionAddress) != 0;
    }

    // --- [ eglCompositorSetSizeEXT ] ---

    /** {@code EGLBoolean eglCompositorSetSizeEXT(EGLint external_win_id, EGLint width, EGLint height)} */
    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetSizeEXT(@NativeType("EGLint") int external_win_id, @NativeType("EGLint") int width, @NativeType("EGLint") int height) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetSizeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(external_win_id, width, height, __functionAddress) != 0;
    }

    // --- [ eglCompositorSwapPolicyEXT ] ---

    /** {@code EGLBoolean eglCompositorSwapPolicyEXT(EGLint external_win_id, EGLint policy)} */
    @NativeType("EGLBoolean")
    public static boolean eglCompositorSwapPolicyEXT(@NativeType("EGLint") int external_win_id, @NativeType("EGLint") int policy) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSwapPolicyEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(external_win_id, policy, __functionAddress) != 0;
    }

    /** {@code EGLBoolean eglCompositorSetContextListEXT(EGLint const * external_ref_ids, EGLint num_entries)} */
    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetContextListEXT(@NativeType("EGLint const *") int[] external_ref_ids) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetContextListEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_ref_ids, external_ref_ids.length, __functionAddress) != 0;
    }

    /** {@code EGLBoolean eglCompositorSetContextAttributesEXT(EGLint external_ref_id, EGLint const * context_attributes, EGLint num_entries)} */
    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetContextAttributesEXT(@NativeType("EGLint") int external_ref_id, @NativeType("EGLint const *") int[] context_attributes) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetContextAttributesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_ref_id, context_attributes, context_attributes.length, __functionAddress) != 0;
    }

    /** {@code EGLBoolean eglCompositorSetWindowListEXT(EGLint external_ref_id, EGLint const * external_win_ids, EGLint num_entries)} */
    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetWindowListEXT(@NativeType("EGLint") int external_ref_id, @NativeType("EGLint const *") int[] external_win_ids) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetWindowListEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_ref_id, external_win_ids, external_win_ids.length, __functionAddress) != 0;
    }

    /** {@code EGLBoolean eglCompositorSetWindowAttributesEXT(EGLint external_win_id, EGLint const * window_attributes, EGLint num_entries)} */
    @NativeType("EGLBoolean")
    public static boolean eglCompositorSetWindowAttributesEXT(@NativeType("EGLint") int external_win_id, @NativeType("EGLint const *") int[] window_attributes) {
        long __functionAddress = EGL.getCapabilities().eglCompositorSetWindowAttributesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(external_win_id, window_attributes, window_attributes.length, __functionAddress) != 0;
    }

}