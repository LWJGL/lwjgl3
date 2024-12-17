/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

import org.lwjgl.system.windows.WinBase;

public class WGLNVDelayBeforeSwap {

    protected WGLNVDelayBeforeSwap() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglDelayBeforeSwapNV ] ---

    /** {@code BOOL wglDelayBeforeSwapNV(HDC hDC, GLfloat seconds)} */
    @NativeType("BOOL")
    public static boolean wglDelayBeforeSwapNV(@NativeType("HDC") long hDC, @NativeType("GLfloat") float seconds) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDelayBeforeSwapNV;
        if (CHECKS) {
            check(__functionAddress);
            check(hDC);
        }
        return callPI(hDC, seconds, __functionAddress) != 0;
    }

}