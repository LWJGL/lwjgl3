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

/** Native bindings to GLX 1.1. */
public class GLX11 extends GLX {

    /** Names for attributes to {@link #glXGetClientString GetClientString}. */
    public static final int
        GLX_VENDOR     = 0x1,
        GLX_VERSION    = 0x2,
        GLX_EXTENSIONS = 0x3;

    protected GLX11() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXQueryExtensionsString ] ---

    /** Unsafe version of: {@link #glXQueryExtensionsString QueryExtensionsString} */
    public static long nglXQueryExtensionsString(long display, int screen) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryExtensionsString;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPP(display, screen, __functionAddress);
    }

    /**
     * Returns a string describing which GLX extensions are supported on the connection.
     *
     * @param display the connection to the X server
     * @param screen  the screen number
     */
    @Nullable
    @NativeType("char const *")
    public static String glXQueryExtensionsString(@NativeType("Display *") long display, int screen) {
        long __result = nglXQueryExtensionsString(display, screen);
        return memASCIISafe(__result);
    }

    // --- [ glXGetClientString ] ---

    /** Unsafe version of: {@link #glXGetClientString GetClientString} */
    public static long nglXGetClientString(long display, int name) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetClientString;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPP(display, name, __functionAddress);
    }

    /**
     * Returns a pointer to a string describing some aspect of the client library.
     *
     * @param display the connection to the X server
     * @param name    the string to query
     */
    @Nullable
    @NativeType("char const *")
    public static String glXGetClientString(@NativeType("Display *") long display, int name) {
        long __result = nglXGetClientString(display, name);
        return memASCIISafe(__result);
    }

    // --- [ glXQueryServerString ] ---

    /** Unsafe version of: {@link #glXQueryServerString QueryServerString} */
    public static long nglXQueryServerString(long display, int screen, int name) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryServerString;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPP(display, screen, name, __functionAddress);
    }

    /**
     * Returns a pointer to a string describing some aspect of the server's GLX extension.
     *
     * @param display the connection to the X server
     * @param screen  the screen number
     * @param name    the string to query
     */
    @Nullable
    @NativeType("char const *")
    public static String glXQueryServerString(@NativeType("Display *") long display, int screen, int name) {
        long __result = nglXQueryServerString(display, screen, name);
        return memASCIISafe(__result);
    }

}