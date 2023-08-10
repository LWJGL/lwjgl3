/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/WGL_ARB_extensions_string.txt">WGL_ARB_extensions_string</a> extension.
 * 
 * <p>This extension provides a way for applications to determine which WGL extensions are supported by a device. This is the foundation upon which other WGL
 * extensions are built.</p>
 */
public class WGLARBExtensionsString {

    protected WGLARBExtensionsString() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglGetExtensionsStringARB ] ---

    /** Unsafe version of: {@link #wglGetExtensionsStringARB GetExtensionsStringARB} */
    public static long nwglGetExtensionsStringARB(long hdc) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetExtensionsStringARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
        }
        return callPP(hdc, __functionAddress);
    }

    /**
     * Returns a list of supported extensions to WGL. Although the contents of the string is implementation specific, the string will be {@code NULL} terminated and
     * will contain a space-separated list of extension names. (The extension names themselves do not contain spaces.) If there are no extensions then the
     * empty string is returned.
     *
     * @param hdc the device context to query extensions for
     */
    @Nullable
    @NativeType("char const *")
    public static String wglGetExtensionsStringARB(@NativeType("HDC") long hdc) {
        long __result = nwglGetExtensionsStringARB(hdc);
        return memASCIISafe(__result);
    }

}