/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.linux.*;

public class GLX {

    /** Contains the function pointers loaded from {@code GL.getFunctionProvider()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            QueryExtension     = apiGetFunctionAddress(GL.getFunctionProvider(), "glXQueryExtension"),
            QueryVersion       = apiGetFunctionAddress(GL.getFunctionProvider(), "glXQueryVersion"),
            GetConfig          = apiGetFunctionAddress(GL.getFunctionProvider(), "glXGetConfig"),
            ChooseVisual       = apiGetFunctionAddress(GL.getFunctionProvider(), "glXChooseVisual"),
            CreateContext      = apiGetFunctionAddress(GL.getFunctionProvider(), "glXCreateContext"),
            MakeCurrent        = apiGetFunctionAddress(GL.getFunctionProvider(), "glXMakeCurrent"),
            CopyContext        = apiGetFunctionAddress(GL.getFunctionProvider(), "glXCopyContext"),
            IsDirect           = apiGetFunctionAddress(GL.getFunctionProvider(), "glXIsDirect"),
            DestroyContext     = apiGetFunctionAddress(GL.getFunctionProvider(), "glXDestroyContext"),
            GetCurrentContext  = apiGetFunctionAddress(GL.getFunctionProvider(), "glXGetCurrentContext"),
            GetCurrentDrawable = apiGetFunctionAddress(GL.getFunctionProvider(), "glXGetCurrentDrawable"),
            WaitGL             = apiGetFunctionAddress(GL.getFunctionProvider(), "glXWaitGL"),
            WaitX              = apiGetFunctionAddress(GL.getFunctionProvider(), "glXWaitX"),
            SwapBuffers        = apiGetFunctionAddress(GL.getFunctionProvider(), "glXSwapBuffers"),
            UseXFont           = apiGetFunctionAddress(GL.getFunctionProvider(), "glXUseXFont"),
            CreateGLXPixmap    = apiGetFunctionAddress(GL.getFunctionProvider(), "glXCreateGLXPixmap"),
            DestroyGLXPixmap   = apiGetFunctionAddress(GL.getFunctionProvider(), "glXDestroyGLXPixmap");

    }

    public static final int
        GLXBadContext                = 0,
        GLXBadContextState           = 1,
        GLXBadDrawable               = 2,
        GLXBadPixmap                 = 3,
        GLXBadContextTag             = 4,
        GLXBadCurrentWindow          = 5,
        GLXBadRenderRequest          = 6,
        GLXBadLargeRequest           = 7,
        GLXUnsupportedPrivateRequest = 8,
        GLXBadFBConfig               = 9,
        GLXBadPbuffer                = 10,
        GLXBadCurrentDrawable        = 11,
        GLXBadWindow                 = 12;

    public static final int
        GLX_USE_GL           = 1,
        GLX_BUFFER_SIZE      = 2,
        GLX_LEVEL            = 3,
        GLX_RGBA             = 4,
        GLX_DOUBLEBUFFER     = 5,
        GLX_STEREO           = 6,
        GLX_AUX_BUFFERS      = 7,
        GLX_RED_SIZE         = 8,
        GLX_GREEN_SIZE       = 9,
        GLX_BLUE_SIZE        = 10,
        GLX_ALPHA_SIZE       = 11,
        GLX_DEPTH_SIZE       = 12,
        GLX_STENCIL_SIZE     = 13,
        GLX_ACCUM_RED_SIZE   = 14,
        GLX_ACCUM_GREEN_SIZE = 15,
        GLX_ACCUM_BLUE_SIZE  = 16,
        GLX_ACCUM_ALPHA_SIZE = 17;

    public static final int
        GLX_BAD_SCREEN    = 1,
        GLX_BAD_ATTRIBUTE = 2,
        GLX_NO_EXTENSION  = 3,
        GLX_BAD_VISUAL    = 4,
        GLX_BAD_CONTEXT   = 5,
        GLX_BAD_VALUE     = 6,
        GLX_BAD_ENUM      = 7;

    protected GLX() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXQueryExtension ] ---

    /** {@code Bool glXQueryExtension(Display * display, int * error_base, int * event_base)} */
    public static int nglXQueryExtension(long display, long error_base, long event_base) {
        long __functionAddress = Functions.QueryExtension;
        if (CHECKS) {
            check(display);
        }
        return callPPPI(display, error_base, event_base, __functionAddress);
    }

    /** {@code Bool glXQueryExtension(Display * display, int * error_base, int * event_base)} */
    @NativeType("Bool")
    public static boolean glXQueryExtension(@NativeType("Display *") long display, @NativeType("int *") IntBuffer error_base, @NativeType("int *") IntBuffer event_base) {
        if (CHECKS) {
            check(error_base, 1);
            check(event_base, 1);
        }
        return nglXQueryExtension(display, memAddress(error_base), memAddress(event_base)) != 0;
    }

    // --- [ glXQueryVersion ] ---

    /** {@code Bool glXQueryVersion(Display * display, int * major, int * minor)} */
    public static int nglXQueryVersion(long display, long major, long minor) {
        long __functionAddress = Functions.QueryVersion;
        if (CHECKS) {
            check(display);
        }
        return callPPPI(display, major, minor, __functionAddress);
    }

    /** {@code Bool glXQueryVersion(Display * display, int * major, int * minor)} */
    @NativeType("Bool")
    public static boolean glXQueryVersion(@NativeType("Display *") long display, @NativeType("int *") IntBuffer major, @NativeType("int *") IntBuffer minor) {
        if (CHECKS) {
            check(major, 1);
            check(minor, 1);
        }
        return nglXQueryVersion(display, memAddress(major), memAddress(minor)) != 0;
    }

    // --- [ glXGetConfig ] ---

    /** {@code int glXGetConfig(Display * display, XVisualInfo * visual, int attribute, int * value)} */
    public static int nglXGetConfig(long display, long visual, int attribute, long value) {
        long __functionAddress = Functions.GetConfig;
        if (CHECKS) {
            check(display);
            XVisualInfo.validate(visual);
        }
        return callPPPI(display, visual, attribute, value, __functionAddress);
    }

    /** {@code int glXGetConfig(Display * display, XVisualInfo * visual, int attribute, int * value)} */
    public static int glXGetConfig(@NativeType("Display *") long display, @NativeType("XVisualInfo *") XVisualInfo visual, int attribute, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nglXGetConfig(display, visual.address(), attribute, memAddress(value));
    }

    // --- [ glXChooseVisual ] ---

    /** {@code XVisualInfo * glXChooseVisual(Display * display, int screen, int * attrib_list)} */
    public static long nglXChooseVisual(long display, int screen, long attrib_list) {
        long __functionAddress = Functions.ChooseVisual;
        if (CHECKS) {
            check(display);
        }
        return callPPP(display, screen, attrib_list, __functionAddress);
    }

    /** {@code XVisualInfo * glXChooseVisual(Display * display, int screen, int * attrib_list)} */
    @NativeType("XVisualInfo *")
    public static @Nullable XVisualInfo glXChooseVisual(@NativeType("Display *") long display, int screen, @NativeType("int *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list);
        }
        long __result = nglXChooseVisual(display, screen, memAddressSafe(attrib_list));
        return XVisualInfo.createSafe(__result);
    }

    // --- [ glXCreateContext ] ---

    /** {@code GLXContext glXCreateContext(Display * display, XVisualInfo * visual, GLXContext share_list, Bool direct)} */
    public static long nglXCreateContext(long display, long visual, long share_list, int direct) {
        long __functionAddress = Functions.CreateContext;
        if (CHECKS) {
            check(display);
            XVisualInfo.validate(visual);
        }
        return callPPPP(display, visual, share_list, direct, __functionAddress);
    }

    /** {@code GLXContext glXCreateContext(Display * display, XVisualInfo * visual, GLXContext share_list, Bool direct)} */
    @NativeType("GLXContext")
    public static long glXCreateContext(@NativeType("Display *") long display, @NativeType("XVisualInfo *") XVisualInfo visual, @NativeType("GLXContext") long share_list, @NativeType("Bool") boolean direct) {
        return nglXCreateContext(display, visual.address(), share_list, direct ? 1 : 0);
    }

    // --- [ glXMakeCurrent ] ---

    /** {@code Bool glXMakeCurrent(Display * display, GLXDrawable draw, GLXContext ctx)} */
    @NativeType("Bool")
    public static boolean glXMakeCurrent(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw, @NativeType("GLXContext") long ctx) {
        long __functionAddress = Functions.MakeCurrent;
        if (CHECKS) {
            check(display);
        }
        return callPPPI(display, draw, ctx, __functionAddress) != 0;
    }

    // --- [ glXCopyContext ] ---

    /** {@code void glXCopyContext(Display * display, GLXContext source, GLXContext dest, unsigned long mask)} */
    public static void glXCopyContext(@NativeType("Display *") long display, @NativeType("GLXContext") long source, @NativeType("GLXContext") long dest, @NativeType("unsigned long") long mask) {
        long __functionAddress = Functions.CopyContext;
        if (CHECKS) {
            check(display);
            check(source);
            check(dest);
        }
        callPPPNV(display, source, dest, mask, __functionAddress);
    }

    // --- [ glXIsDirect ] ---

    /** {@code Bool glXIsDirect(Display * display, GLXContext ctx)} */
    @NativeType("Bool")
    public static boolean glXIsDirect(@NativeType("Display *") long display, @NativeType("GLXContext") long ctx) {
        long __functionAddress = Functions.IsDirect;
        if (CHECKS) {
            check(display);
            check(ctx);
        }
        return callPPI(display, ctx, __functionAddress) != 0;
    }

    // --- [ glXDestroyContext ] ---

    /** {@code void glXDestroyContext(Display * display, GLXContext ctx)} */
    public static void glXDestroyContext(@NativeType("Display *") long display, @NativeType("GLXContext") long ctx) {
        long __functionAddress = Functions.DestroyContext;
        if (CHECKS) {
            check(display);
            check(ctx);
        }
        callPPV(display, ctx, __functionAddress);
    }

    // --- [ glXGetCurrentContext ] ---

    /** {@code GLXContext glXGetCurrentContext(void)} */
    @NativeType("GLXContext")
    public static long glXGetCurrentContext() {
        long __functionAddress = Functions.GetCurrentContext;
        return callP(__functionAddress);
    }

    // --- [ glXGetCurrentDrawable ] ---

    /** {@code GLXDrawable glXGetCurrentDrawable(void)} */
    @NativeType("GLXDrawable")
    public static long glXGetCurrentDrawable() {
        long __functionAddress = Functions.GetCurrentDrawable;
        return callP(__functionAddress);
    }

    // --- [ glXWaitGL ] ---

    /** {@code void glXWaitGL(void)} */
    public static void glXWaitGL() {
        long __functionAddress = Functions.WaitGL;
        callV(__functionAddress);
    }

    // --- [ glXWaitX ] ---

    /** {@code void glXWaitX(void)} */
    public static void glXWaitX() {
        long __functionAddress = Functions.WaitX;
        callV(__functionAddress);
    }

    // --- [ glXSwapBuffers ] ---

    /** {@code void glXSwapBuffers(Display * display, GLXDrawable draw)} */
    public static void glXSwapBuffers(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw) {
        long __functionAddress = Functions.SwapBuffers;
        if (CHECKS) {
            check(display);
            check(draw);
        }
        callPPV(display, draw, __functionAddress);
    }

    // --- [ glXUseXFont ] ---

    /** {@code void glXUseXFont(Font font, int first, int count, int list_base)} */
    public static void glXUseXFont(@NativeType("Font") long font, int first, int count, int list_base) {
        long __functionAddress = Functions.UseXFont;
        callNV(font, first, count, list_base, __functionAddress);
    }

    // --- [ glXCreateGLXPixmap ] ---

    /** {@code GLXPixmap glXCreateGLXPixmap(Display * display, XVisualInfo * visual, Pixmap pixmap)} */
    public static long nglXCreateGLXPixmap(long display, long visual, long pixmap) {
        long __functionAddress = Functions.CreateGLXPixmap;
        if (CHECKS) {
            check(display);
            XVisualInfo.validate(visual);
        }
        return callPPNP(display, visual, pixmap, __functionAddress);
    }

    /** {@code GLXPixmap glXCreateGLXPixmap(Display * display, XVisualInfo * visual, Pixmap pixmap)} */
    @NativeType("GLXPixmap")
    public static long glXCreateGLXPixmap(@NativeType("Display *") long display, @NativeType("XVisualInfo *") XVisualInfo visual, @NativeType("Pixmap") long pixmap) {
        return nglXCreateGLXPixmap(display, visual.address(), pixmap);
    }

    // --- [ glXDestroyGLXPixmap ] ---

    /** {@code void glXDestroyGLXPixmap(Display * display, GLXPixmap pixmap)} */
    public static void glXDestroyGLXPixmap(@NativeType("Display *") long display, @NativeType("GLXPixmap") long pixmap) {
        long __functionAddress = Functions.DestroyGLXPixmap;
        if (CHECKS) {
            check(display);
            check(pixmap);
        }
        callPPV(display, pixmap, __functionAddress);
    }

    /** {@code Bool glXQueryExtension(Display * display, int * error_base, int * event_base)} */
    @NativeType("Bool")
    public static boolean glXQueryExtension(@NativeType("Display *") long display, @NativeType("int *") int[] error_base, @NativeType("int *") int[] event_base) {
        long __functionAddress = Functions.QueryExtension;
        if (CHECKS) {
            check(display);
            check(error_base, 1);
            check(event_base, 1);
        }
        return callPPPI(display, error_base, event_base, __functionAddress) != 0;
    }

    /** {@code Bool glXQueryVersion(Display * display, int * major, int * minor)} */
    @NativeType("Bool")
    public static boolean glXQueryVersion(@NativeType("Display *") long display, @NativeType("int *") int[] major, @NativeType("int *") int[] minor) {
        long __functionAddress = Functions.QueryVersion;
        if (CHECKS) {
            check(display);
            check(major, 1);
            check(minor, 1);
        }
        return callPPPI(display, major, minor, __functionAddress) != 0;
    }

    /** {@code int glXGetConfig(Display * display, XVisualInfo * visual, int attribute, int * value)} */
    public static int glXGetConfig(@NativeType("Display *") long display, @NativeType("XVisualInfo *") XVisualInfo visual, int attribute, @NativeType("int *") int[] value) {
        long __functionAddress = Functions.GetConfig;
        if (CHECKS) {
            check(display);
            check(value, 1);
            XVisualInfo.validate(visual.address());
        }
        return callPPPI(display, visual.address(), attribute, value, __functionAddress);
    }

    /** {@code XVisualInfo * glXChooseVisual(Display * display, int screen, int * attrib_list)} */
    @NativeType("XVisualInfo *")
    public static @Nullable XVisualInfo glXChooseVisual(@NativeType("Display *") long display, int screen, @NativeType("int *") int @Nullable [] attrib_list) {
        long __functionAddress = Functions.ChooseVisual;
        if (CHECKS) {
            check(display);
            checkNTSafe(attrib_list);
        }
        long __result = callPPP(display, screen, attrib_list, __functionAddress);
        return XVisualInfo.createSafe(__result);
    }

}