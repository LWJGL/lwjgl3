/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class GLXSGISwapControl {

    protected GLXSGISwapControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXSwapIntervalSGI ] ---

    /** {@code GLint glXSwapIntervalSGI(int interval)} */
    @NativeType("GLint")
    public static int glXSwapIntervalSGI(int interval) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXSwapIntervalSGI;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(interval, __functionAddress);
    }

}