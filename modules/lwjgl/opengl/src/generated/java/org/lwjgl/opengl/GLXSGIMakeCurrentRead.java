/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class GLXSGIMakeCurrentRead {

    protected GLXSGIMakeCurrentRead() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXMakeCurrentReadSGI ] ---

    /** {@code Bool glXMakeCurrentReadSGI(Display * display, GLXDrawable draw, GLXDrawable read, GLXContext ctx)} */
    @NativeType("Bool")
    public static boolean glXMakeCurrentReadSGI(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw, @NativeType("GLXDrawable") long read, @NativeType("GLXContext") long ctx) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXMakeCurrentReadSGI;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPPPPI(display, draw, read, ctx, __functionAddress) != 0;
    }

    // --- [ glXGetCurrentReadDrawableSGI ] ---

    /** {@code GLXDrawable glXGetCurrentReadDrawableSGI(void)} */
    @NativeType("GLXDrawable")
    public static long glXGetCurrentReadDrawableSGI() {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetCurrentReadDrawableSGI;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

}