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

public class GLX11 extends GLX {

    public static final int
        GLX_VENDOR     = 0x1,
        GLX_VERSION    = 0x2,
        GLX_EXTENSIONS = 0x3;

    protected GLX11() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXQueryExtensionsString ] ---

    /** {@code char const * glXQueryExtensionsString(Display * display, int screen)} */
    public static long nglXQueryExtensionsString(long display, int screen) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryExtensionsString;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPP(display, screen, __functionAddress);
    }

    /** {@code char const * glXQueryExtensionsString(Display * display, int screen)} */
    @NativeType("char const *")
    public static @Nullable String glXQueryExtensionsString(@NativeType("Display *") long display, int screen) {
        long __result = nglXQueryExtensionsString(display, screen);
        return memASCIISafe(__result);
    }

    // --- [ glXGetClientString ] ---

    /** {@code char const * glXGetClientString(Display * display, int name)} */
    public static long nglXGetClientString(long display, int name) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetClientString;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPP(display, name, __functionAddress);
    }

    /** {@code char const * glXGetClientString(Display * display, int name)} */
    @NativeType("char const *")
    public static @Nullable String glXGetClientString(@NativeType("Display *") long display, int name) {
        long __result = nglXGetClientString(display, name);
        return memASCIISafe(__result);
    }

    // --- [ glXQueryServerString ] ---

    /** {@code char const * glXQueryServerString(Display * display, int screen, int name)} */
    public static long nglXQueryServerString(long display, int screen, int name) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryServerString;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPP(display, screen, name, __functionAddress);
    }

    /** {@code char const * glXQueryServerString(Display * display, int screen, int name)} */
    @NativeType("char const *")
    public static @Nullable String glXQueryServerString(@NativeType("Display *") long display, int screen, int name) {
        long __result = nglXQueryServerString(display, screen, name);
        return memASCIISafe(__result);
    }

}