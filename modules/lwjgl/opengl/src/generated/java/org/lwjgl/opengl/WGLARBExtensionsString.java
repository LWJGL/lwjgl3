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

public class WGLARBExtensionsString {

    protected WGLARBExtensionsString() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglGetExtensionsStringARB ] ---

    /** {@code char const * wglGetExtensionsStringARB(HDC hdc)} */
    public static long nwglGetExtensionsStringARB(long hdc) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetExtensionsStringARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
        }
        return callPP(hdc, __functionAddress);
    }

    /** {@code char const * wglGetExtensionsStringARB(HDC hdc)} */
    @NativeType("char const *")
    public static @Nullable String wglGetExtensionsStringARB(@NativeType("HDC") long hdc) {
        long __result = nwglGetExtensionsStringARB(hdc);
        return memASCIISafe(__result);
    }

}