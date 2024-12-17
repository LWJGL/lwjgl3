/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class GLXNVDelayBeforeSwap {

    protected GLXNVDelayBeforeSwap() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXDelayBeforeSwapNV ] ---

    /** {@code Bool glXDelayBeforeSwapNV(Display * display, GLXDrawable drawable, GLfloat seconds)} */
    @NativeType("Bool")
    public static boolean glXDelayBeforeSwapNV(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, @NativeType("GLfloat") float seconds) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXDelayBeforeSwapNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(drawable);
        }
        return callPPI(display, drawable, seconds, __functionAddress) != 0;
    }

}