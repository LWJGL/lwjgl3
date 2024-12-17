/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class GLXEXTSwapControl {

    public static final int
        GLX_SWAP_INTERVAL_EXT     = 0x20F1,
        GLX_MAX_SWAP_INTERVAL_EXT = 0x20F2;

    protected GLXEXTSwapControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXSwapIntervalEXT ] ---

    /** {@code void glXSwapIntervalEXT(Display * display, GLXDrawable drawable, int interval)} */
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