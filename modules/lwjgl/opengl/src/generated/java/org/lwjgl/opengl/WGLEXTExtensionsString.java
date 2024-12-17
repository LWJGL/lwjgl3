/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class WGLEXTExtensionsString {

    protected WGLEXTExtensionsString() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglGetExtensionsStringEXT ] ---

    /** {@code char const * wglGetExtensionsStringEXT(void)} */
    public static long nwglGetExtensionsStringEXT() {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetExtensionsStringEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

    /** {@code char const * wglGetExtensionsStringEXT(void)} */
    @NativeType("char const *")
    public static @Nullable String wglGetExtensionsStringEXT() {
        long __result = nwglGetExtensionsStringEXT();
        return memASCIISafe(__result);
    }

}