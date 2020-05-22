/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to GLX 1.2. */
public class GLX12 extends GLX11 {

    protected GLX12() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXGetCurrentDisplay ] ---

    /** Returns the display associated with the current context and drawable. */
    @NativeType("Display *")
    public static long glXGetCurrentDisplay() {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetCurrentDisplay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

}