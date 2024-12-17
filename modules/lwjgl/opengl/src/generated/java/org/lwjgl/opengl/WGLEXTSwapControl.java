/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class WGLEXTSwapControl {

    protected WGLEXTSwapControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglSwapIntervalEXT ] ---

    /** {@code BOOL wglSwapIntervalEXT(int interval)} */
    @NativeType("BOOL")
    public static boolean wglSwapIntervalEXT(int interval) {
        long __functionAddress = GL.getCapabilitiesWGL().wglSwapIntervalEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(interval, __functionAddress) != 0;
    }

    // --- [ wglGetSwapIntervalEXT ] ---

    /** {@code int wglGetSwapIntervalEXT(void)} */
    public static int wglGetSwapIntervalEXT() {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetSwapIntervalEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

}