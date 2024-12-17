/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.linux.*;

public class GLXSGIXFBConfig {

    public static final int
        GLX_DRAWABLE_TYPE_SGIX = 0x8010,
        GLX_RENDER_TYPE_SGIX   = 0x8011,
        GLX_X_RENDERABLE_SGIX  = 0x8012;

    public static final int GLX_FBCONFIG_ID_SGIX = 0x8013;

    public static final int GLX_SCREEN_EXT = 0x800C;

    public static final int
        GLX_WINDOW_BIT_SGIX = 0x1,
        GLX_PIXMAP_BIT_SGIX = 0x2;

    public static final int
        GLX_RGBA_BIT_SGIX        = 0x1,
        GLX_COLOR_INDEX_BIT_SGIX = 0x2;

    public static final int
        GLX_RGBA_TYPE_SGIX        = 0x8014,
        GLX_COLOR_INDEX_TYPE_SGIX = 0x8015;

    protected GLXSGIXFBConfig() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXGetFBConfigAttribSGIX ] ---

    /** {@code int glXGetFBConfigAttribSGIX(Display * display, GLXFBConfigSGIX config, int attribute, int * value)} */
    public static int nglXGetFBConfigAttribSGIX(long display, long config, int attribute, long value) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetFBConfigAttribSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
        }
        return callPPPI(display, config, attribute, value, __functionAddress);
    }

    /** {@code int glXGetFBConfigAttribSGIX(Display * display, GLXFBConfigSGIX config, int attribute, int * value)} */
    public static int glXGetFBConfigAttribSGIX(@NativeType("Display *") long display, @NativeType("GLXFBConfigSGIX") long config, int attribute, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nglXGetFBConfigAttribSGIX(display, config, attribute, memAddress(value));
    }

    // --- [ glXChooseFBConfigSGIX ] ---

    /** {@code GLXFBConfigSGIX * glXChooseFBConfigSGIX(Display * display, int screen, int const * attrib_list, int * nelements)} */
    public static long nglXChooseFBConfigSGIX(long display, int screen, long attrib_list, long nelements) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXChooseFBConfigSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPPPP(display, screen, attrib_list, nelements, __functionAddress);
    }

    /** {@code GLXFBConfigSGIX * glXChooseFBConfigSGIX(Display * display, int screen, int const * attrib_list, int * nelements)} */
    @NativeType("GLXFBConfigSGIX *")
    public static @Nullable PointerBuffer glXChooseFBConfigSGIX(@NativeType("Display *") long display, int screen, @NativeType("int const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer nelements = stack.callocInt(1);
        try {
            long __result = nglXChooseFBConfigSGIX(display, screen, memAddressSafe(attrib_list), memAddress(nelements));
            return memPointerBufferSafe(__result, nelements.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glXCreateGLXPixmapWithConfigSGIX ] ---

    /** {@code GLXPixmap glXCreateGLXPixmapWithConfigSGIX(Display * display, GLXFBConfig config, Pixmap pixmap)} */
    @NativeType("GLXPixmap")
    public static long glXCreateGLXPixmapWithConfigSGIX(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("Pixmap") long pixmap) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateGLXPixmapWithConfigSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
        }
        return callPPNP(display, config, pixmap, __functionAddress);
    }

    // --- [ glXCreateContextWithConfigSGIX ] ---

    /** {@code GLXContext glXCreateContextWithConfigSGIX(Display * display, GLXFBConfig config, int render_type, GLXContext share_list, Bool direct)} */
    @NativeType("GLXContext")
    public static long glXCreateContextWithConfigSGIX(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, int render_type, @NativeType("GLXContext") long share_list, @NativeType("Bool") boolean direct) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateContextWithConfigSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
            check(share_list);
        }
        return callPPPP(display, config, render_type, share_list, direct ? 1 : 0, __functionAddress);
    }

    // --- [ glXGetVisualFromFBConfigSGIX ] ---

    /** {@code XVisualInfo * glXGetVisualFromFBConfigSGIX(Display * display, GLXFBConfig config)} */
    public static long nglXGetVisualFromFBConfigSGIX(long display, long config) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetVisualFromFBConfigSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
        }
        return callPPP(display, config, __functionAddress);
    }

    /** {@code XVisualInfo * glXGetVisualFromFBConfigSGIX(Display * display, GLXFBConfig config)} */
    @NativeType("XVisualInfo *")
    public static @Nullable XVisualInfo glXGetVisualFromFBConfigSGIX(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config) {
        long __result = nglXGetVisualFromFBConfigSGIX(display, config);
        return XVisualInfo.createSafe(__result);
    }

    // --- [ glXGetFBConfigFromVisualSGIX ] ---

    /** {@code GLXFBConfigSGIX glXGetFBConfigFromVisualSGIX(Display * display, XVisualInfo * vis)} */
    public static long nglXGetFBConfigFromVisualSGIX(long display, long vis) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetFBConfigFromVisualSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            XVisualInfo.validate(vis);
        }
        return callPPP(display, vis, __functionAddress);
    }

    /** {@code GLXFBConfigSGIX glXGetFBConfigFromVisualSGIX(Display * display, XVisualInfo * vis)} */
    @NativeType("GLXFBConfigSGIX")
    public static long glXGetFBConfigFromVisualSGIX(@NativeType("Display *") long display, @NativeType("XVisualInfo *") XVisualInfo vis) {
        return nglXGetFBConfigFromVisualSGIX(display, vis.address());
    }

    /** {@code int glXGetFBConfigAttribSGIX(Display * display, GLXFBConfigSGIX config, int attribute, int * value)} */
    public static int glXGetFBConfigAttribSGIX(@NativeType("Display *") long display, @NativeType("GLXFBConfigSGIX") long config, int attribute, @NativeType("int *") int[] value) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetFBConfigAttribSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
            check(value, 1);
        }
        return callPPPI(display, config, attribute, value, __functionAddress);
    }

    /** {@code GLXFBConfigSGIX * glXChooseFBConfigSGIX(Display * display, int screen, int const * attrib_list, int * nelements)} */
    @NativeType("GLXFBConfigSGIX *")
    public static @Nullable PointerBuffer glXChooseFBConfigSGIX(@NativeType("Display *") long display, int screen, @NativeType("int const *") int @Nullable [] attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXChooseFBConfigSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            checkNTSafe(attrib_list);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer nelements = stack.callocInt(1);
        try {
            long __result = callPPPP(display, screen, attrib_list, memAddress(nelements), __functionAddress);
            return memPointerBufferSafe(__result, nelements.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}