/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/SGIX/GLX_SGIX_swap_barrier.txt">GLX_SGIX_swap_barrier</a> extension.
 * 
 * <p>This extension provides the capability to sychronize the buffer swaps of different swap groups.</p>
 * 
 * <p>Requires {@link GLXSGIXSwapGroup GLX_SGIX_swap_group}.</p>
 */
public class GLXSGIXSwapBarrier {

    protected GLXSGIXSwapBarrier() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXBindSwapBarrierSGIX ] ---

    /**
     * Binds the swap group that contains {@code drawable} to {@code barrier}. Subsequent buffer swaps for that group will be subject to this binding, until
     * the group is unbound from {@code barrier}. If {@code barrier} is zero, the group is unbound from its current barrier, if any.
     *
     * @param display  the connection to the X server
     * @param drawable the swap group GLXDrawable
     * @param barrier  the swap barrier
     */
    public static void glXBindSwapBarrierSGIX(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, int barrier) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXBindSwapBarrierSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(drawable);
        }
        callPPV(display, drawable, barrier, __functionAddress);
    }

    // --- [ glXQueryMaxSwapBarriersSGIX ] ---

    /** Unsafe version of: {@link #glXQueryMaxSwapBarriersSGIX QueryMaxSwapBarriersSGIX} */
    public static int nglXQueryMaxSwapBarriersSGIX(long display, int screen, long max) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryMaxSwapBarriersSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPPI(display, screen, max, __functionAddress);
    }

    /**
     * Returns in {@code max} the maximum number of barriers supported by an implementation on {@code screen}.
     *
     * @param display the connection to the X server
     * @param screen  the screen
     * @param max     returns the maximum number of barriers
     */
    @NativeType("Bool")
    public static boolean glXQueryMaxSwapBarriersSGIX(@NativeType("Display *") long display, int screen, @NativeType("int *") IntBuffer max) {
        if (CHECKS) {
            check(max, 1);
        }
        return nglXQueryMaxSwapBarriersSGIX(display, screen, memAddress(max)) != 0;
    }

    /** Array version of: {@link #glXQueryMaxSwapBarriersSGIX QueryMaxSwapBarriersSGIX} */
    @NativeType("Bool")
    public static boolean glXQueryMaxSwapBarriersSGIX(@NativeType("Display *") long display, int screen, @NativeType("int *") int[] max) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryMaxSwapBarriersSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(max, 1);
        }
        return callPPI(display, screen, max, __functionAddress) != 0;
    }

}