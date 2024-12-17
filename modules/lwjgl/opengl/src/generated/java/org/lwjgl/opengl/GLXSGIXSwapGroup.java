/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class GLXSGIXSwapGroup {

    protected GLXSGIXSwapGroup() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXJoinSwapGroupSGIX ] ---

    /** {@code void glXJoinSwapGroupSGIX(Display * display, GLXDrawable drawable, GLXDrawable member)} */
    public static void glXJoinSwapGroupSGIX(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, @NativeType("GLXDrawable") long member) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXJoinSwapGroupSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(drawable);
        }
        callPPPV(display, drawable, member, __functionAddress);
    }

}