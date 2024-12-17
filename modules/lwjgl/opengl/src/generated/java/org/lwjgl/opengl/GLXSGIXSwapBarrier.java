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

public class GLXSGIXSwapBarrier {

    protected GLXSGIXSwapBarrier() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXBindSwapBarrierSGIX ] ---

    /** {@code void glXBindSwapBarrierSGIX(Display * display, GLXDrawable drawable, int barrier)} */
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

    /** {@code Bool glXQueryMaxSwapBarriersSGIX(Display * display, int screen, int * max)} */
    public static int nglXQueryMaxSwapBarriersSGIX(long display, int screen, long max) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryMaxSwapBarriersSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPPI(display, screen, max, __functionAddress);
    }

    /** {@code Bool glXQueryMaxSwapBarriersSGIX(Display * display, int screen, int * max)} */
    @NativeType("Bool")
    public static boolean glXQueryMaxSwapBarriersSGIX(@NativeType("Display *") long display, int screen, @NativeType("int *") IntBuffer max) {
        if (CHECKS) {
            check(max, 1);
        }
        return nglXQueryMaxSwapBarriersSGIX(display, screen, memAddress(max)) != 0;
    }

    /** {@code Bool glXQueryMaxSwapBarriersSGIX(Display * display, int screen, int * max)} */
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