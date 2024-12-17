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
import static org.lwjgl.system.MemoryUtil.*;

public class GLXSGIXPbuffer {

    public static final int
        GLX_MAX_PBUFFER_WIDTH_SGIX      = 0x8016,
        GLX_MAX_PBUFFER_HEIGHT_SGIX     = 0x8017,
        GLX_MAX_PBUFFER_PIXELS_SGIX     = 0x8018,
        GLX_OPTIMAL_PBUFFER_WIDTH_SGIX  = 0x8019,
        GLX_OPTIMAL_PBUFFER_HEIGHT_SGIX = 0x801A;

    public static final int GLX_PBUFFER_BIT_SGIX = 0x4;

    public static final int
        GLX_PRESERVED_CONTENTS_SGIX = 0x801B,
        GLX_LARGEST_PBUFFER_SGIX    = 0x801C;

    public static final int
        GLX_WIDTH_SGIX      = 0x801D,
        GLX_HEIGHT_SGIX     = 0x801E,
        GLX_EVENT_MASK_SGIX = 0x801F;

    public static final int GLX_BUFFER_CLOBBER_MASK_SGIX = 0x8000000;

    public static final int
        GLX_DAMAGED_SGIX = 0x8020,
        GLX_SAVED_SGIX   = 0x8021;

    public static final int
        GLX_WINDOW_SGIX  = 0x8022,
        GLX_PBUFFER_SGIX = 0x8023;

    public static final int
        GLX_FRONT_LEFT_BUFFER_BIT_SGIX  = 0x1,
        GLX_FRONT_RIGHT_BUFFER_BIT_SGIX = 0x2,
        GLX_BACK_LEFT_BUFFER_BIT_SGIX   = 0x4,
        GLX_BACK_RIGHT_BUFFER_BIT_SGIX  = 0x8,
        GLX_AUX_BUFFERS_BIT_SGIX        = 0x10,
        GLX_DEPTH_BUFFER_BIT_SGIX       = 0x20,
        GLX_STENCIL_BUFFER_BIT_SGIX     = 0x40,
        GLX_ACCUM_BUFFER_BIT_SGIX       = 0x80,
        GLX_SAMPLE_BUFFERS_BIT_SGIX     = 0x100;

    protected GLXSGIXPbuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXCreateGLXPbufferSGIX ] ---

    /** {@code GLXPbuffer glXCreateGLXPbufferSGIX(Display * display, GLXFBConfig config, unsigned int width, unsigned int height, int * attrib_list)} */
    public static long nglXCreateGLXPbufferSGIX(long display, long config, int width, int height, long attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateGLXPbufferSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
        }
        return callPPPP(display, config, width, height, attrib_list, __functionAddress);
    }

    /** {@code GLXPbuffer glXCreateGLXPbufferSGIX(Display * display, GLXFBConfig config, unsigned int width, unsigned int height, int * attrib_list)} */
    @NativeType("GLXPbuffer")
    public static long glXCreateGLXPbufferSGIX(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("int *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list);
        }
        return nglXCreateGLXPbufferSGIX(display, config, width, height, memAddressSafe(attrib_list));
    }

    // --- [ glXDestroyGLXPbufferSGIX ] ---

    /** {@code void glXDestroyGLXPbufferSGIX(Display * display, GLXPbuffer pbuf)} */
    public static void glXDestroyGLXPbufferSGIX(@NativeType("Display *") long display, @NativeType("GLXPbuffer") long pbuf) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXDestroyGLXPbufferSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(pbuf);
        }
        callPPV(display, pbuf, __functionAddress);
    }

    // --- [ glXQueryGLXPbufferSGIX ] ---

    /** {@code void glXQueryGLXPbufferSGIX(Display * display, GLXPbuffer pbuf, int attribute, unsigned int * value)} */
    public static void nglXQueryGLXPbufferSGIX(long display, long pbuf, int attribute, long value) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryGLXPbufferSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(pbuf);
        }
        callPPPV(display, pbuf, attribute, value, __functionAddress);
    }

    /** {@code void glXQueryGLXPbufferSGIX(Display * display, GLXPbuffer pbuf, int attribute, unsigned int * value)} */
    public static void glXQueryGLXPbufferSGIX(@NativeType("Display *") long display, @NativeType("GLXPbuffer") long pbuf, int attribute, @NativeType("unsigned int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglXQueryGLXPbufferSGIX(display, pbuf, attribute, memAddress(value));
    }

    // --- [ glXSelectEventSGIX ] ---

    /** {@code void glXSelectEventSGIX(Display * display, GLXDrawable drawable, unsigned long mask)} */
    public static void glXSelectEventSGIX(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, @NativeType("unsigned long") long mask) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXSelectEventSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(drawable);
        }
        callPPNV(display, drawable, mask, __functionAddress);
    }

    // --- [ glXGetSelectedEventSGIX ] ---

    /** {@code void glXGetSelectedEventSGIX(Display * display, GLXDrawable drawable, unsigned long * mask)} */
    public static void nglXGetSelectedEventSGIX(long display, long drawable, long mask) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetSelectedEventSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(drawable);
        }
        callPPPV(display, drawable, mask, __functionAddress);
    }

    /** {@code void glXGetSelectedEventSGIX(Display * display, GLXDrawable drawable, unsigned long * mask)} */
    public static void glXGetSelectedEventSGIX(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, @NativeType("unsigned long *") CLongBuffer mask) {
        if (CHECKS) {
            check(mask, 1);
        }
        nglXGetSelectedEventSGIX(display, drawable, memAddress(mask));
    }

    /** {@code GLXPbuffer glXCreateGLXPbufferSGIX(Display * display, GLXFBConfig config, unsigned int width, unsigned int height, int * attrib_list)} */
    @NativeType("GLXPbuffer")
    public static long glXCreateGLXPbufferSGIX(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("int *") int @Nullable [] attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateGLXPbufferSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
            checkNTSafe(attrib_list);
        }
        return callPPPP(display, config, width, height, attrib_list, __functionAddress);
    }

    /** {@code void glXQueryGLXPbufferSGIX(Display * display, GLXPbuffer pbuf, int attribute, unsigned int * value)} */
    public static void glXQueryGLXPbufferSGIX(@NativeType("Display *") long display, @NativeType("GLXPbuffer") long pbuf, int attribute, @NativeType("unsigned int *") int[] value) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryGLXPbufferSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(pbuf);
            check(value, 1);
        }
        callPPPV(display, pbuf, attribute, value, __functionAddress);
    }

}