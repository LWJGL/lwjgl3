/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GLXARBCreateContext {

    public static final int
        GLX_CONTEXT_MAJOR_VERSION_ARB = 0x2091,
        GLX_CONTEXT_MINOR_VERSION_ARB = 0x2092,
        GLX_CONTEXT_FLAGS_ARB         = 0x2094;

    public static final int
        GLX_CONTEXT_DEBUG_BIT_ARB              = 0x1,
        GLX_CONTEXT_FORWARD_COMPATIBLE_BIT_ARB = 0x2;

    protected GLXARBCreateContext() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXCreateContextAttribsARB ] ---

    /** {@code GLXContext glXCreateContextAttribsARB(Display * display, GLXFBConfig config, GLXContext share_context, Bool direct, int const * attrib_list)} */
    public static long nglXCreateContextAttribsARB(long display, long config, long share_context, int direct, long attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateContextAttribsARB;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
        }
        return callPPPPP(display, config, share_context, direct, attrib_list, __functionAddress);
    }

    /** {@code GLXContext glXCreateContextAttribsARB(Display * display, GLXFBConfig config, GLXContext share_context, Bool direct, int const * attrib_list)} */
    @NativeType("GLXContext")
    public static long glXCreateContextAttribsARB(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("GLXContext") long share_context, @NativeType("Bool") boolean direct, @NativeType("int const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list);
        }
        return nglXCreateContextAttribsARB(display, config, share_context, direct ? 1 : 0, memAddressSafe(attrib_list));
    }

    /** {@code GLXContext glXCreateContextAttribsARB(Display * display, GLXFBConfig config, GLXContext share_context, Bool direct, int const * attrib_list)} */
    @NativeType("GLXContext")
    public static long glXCreateContextAttribsARB(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("GLXContext") long share_context, @NativeType("Bool") boolean direct, @NativeType("int const *") int @Nullable [] attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateContextAttribsARB;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
            checkNTSafe(attrib_list);
        }
        return callPPPPP(display, config, share_context, direct ? 1 : 0, attrib_list, __functionAddress);
    }

}