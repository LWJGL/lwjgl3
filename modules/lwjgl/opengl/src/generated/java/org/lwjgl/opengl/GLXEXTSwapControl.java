/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_swap_control.txt">GLX_EXT_swap_control</a> extension.
 * 
 * <p>This extension allows an application to specify a minimum periodicity of color buffer swaps, measured in video frame periods, for a particular drawable.
 * It also allows an application to query the swap interval and the implementation-dependent maximum swap interval of a drawable.</p>
 */
public class GLXEXTSwapControl {

    /** The current swap interval and implementation-dependent max swap interval for a particular drawable. */
    public static final int
        GLX_SWAP_INTERVAL_EXT     = 0x20F1,
        GLX_MAX_SWAP_INTERVAL_EXT = 0x20F2;

    protected GLXEXTSwapControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXSwapIntervalEXT ] ---

    /**
     * Specifies the minimum number of video frame periods per buffer swap for a particular GLX drawable (e.g. a value of two means that the color buffers will
     * be swapped at most every other video frame). The interval takes effect when {@link GLX#glXSwapBuffers SwapBuffers} is first called on the drawable subsequent to the
     * {@code glXSwapIntervalEXT} call.
     *
     * @param display  the connection to the X server
     * @param drawable the drawable
     * @param interval the swap interval
     */
    public static void glXSwapIntervalEXT(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, int interval) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXSwapIntervalEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(drawable);
        }
        callPPV(display, drawable, interval, __functionAddress);
    }

}