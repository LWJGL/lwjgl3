/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.linux.*;

/** Native bindings to GLX. */
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

    /** Errors. */
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

    /** Names for attributes to {@link #glXGetConfig GetConfig}. */
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

    /** Error return values from {@link #glXGetConfig GetConfig}. Success is indicated by a value of 0. */
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

    /** Unsafe version of: {@link #glXQueryExtension QueryExtension} */
    public static int nglXQueryExtension(long display, long error_base, long event_base) {
        long __functionAddress = Functions.QueryExtension;
        if (CHECKS) {
            check(display);
        }
        return callPPPI(display, error_base, event_base, __functionAddress);
    }

    /**
     * Ascertains if the GLX extension is defined for an X server.
     *
     * @param display    the connection to the X server
     * @param error_base returns the value of the first error code
     * @param event_base returns the value of the first event code
     */
    @NativeType("Bool")
    public static boolean glXQueryExtension(@NativeType("Display *") long display, @NativeType("int *") IntBuffer error_base, @NativeType("int *") IntBuffer event_base) {
        if (CHECKS) {
            check(error_base, 1);
            check(event_base, 1);
        }
        return nglXQueryExtension(display, memAddress(error_base), memAddress(event_base)) != 0;
    }

    // --- [ glXQueryVersion ] ---

    /** Unsafe version of: {@link #glXQueryVersion QueryVersion} */
    public static int nglXQueryVersion(long display, long major, long minor) {
        long __functionAddress = Functions.QueryVersion;
        if (CHECKS) {
            check(display);
        }
        return callPPPI(display, major, minor, __functionAddress);
    }

    /**
     * Queries the GLX version supported.
     *
     * @param display the connection to the X server
     * @param major   returns the major version
     * @param minor   returns the minor version
     */
    @NativeType("Bool")
    public static boolean glXQueryVersion(@NativeType("Display *") long display, @NativeType("int *") IntBuffer major, @NativeType("int *") IntBuffer minor) {
        if (CHECKS) {
            check(major, 1);
            check(minor, 1);
        }
        return nglXQueryVersion(display, memAddress(major), memAddress(minor)) != 0;
    }

    // --- [ glXGetConfig ] ---

    /** Unsafe version of: {@link #glXGetConfig GetConfig} */
    public static int nglXGetConfig(long display, long visual, int attribute, long value) {
        long __functionAddress = Functions.GetConfig;
        if (CHECKS) {
            check(display);
            XVisualInfo.validate(visual);
        }
        return callPPPI(display, visual, attribute, value, __functionAddress);
    }

    /**
     * Returns a description of an OpenGL attribute exported by a Visual.
     *
     * @param display   the connection to the X server
     * @param visual    a pointer to an {@link XVisualInfo} structure
     * @param attribute the attribute to query
     * @param value     returns the attribute value
     */
    public static int glXGetConfig(@NativeType("Display *") long display, @NativeType("XVisualInfo *") XVisualInfo visual, int attribute, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nglXGetConfig(display, visual.address(), attribute, memAddress(value));
    }

    // --- [ glXChooseVisual ] ---

    /** Unsafe version of: {@link #glXChooseVisual ChooseVisual} */
    public static long nglXChooseVisual(long display, int screen, long attrib_list) {
        long __functionAddress = Functions.ChooseVisual;
        if (CHECKS) {
            check(display);
        }
        return callPPP(display, screen, attrib_list, __functionAddress);
    }

    /**
     * Finds a visual that matches the client’s specified attributes.
     *
     * @param display     the connection to the X server
     * @param screen      the screen number
     * @param attrib_list a list of attributes terminated with {@code None}
     *
     * @return a pointer to an {@code XVisualInfo} structure describing the visual that best matches the specified attributes. If no matching visual exists, {@code NULL} is
     *         returned.
     */
    @Nullable
    @NativeType("XVisualInfo *")
    public static XVisualInfo glXChooseVisual(@NativeType("Display *") long display, int screen, @Nullable @NativeType("int *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list);
        }
        long __result = nglXChooseVisual(display, screen, memAddressSafe(attrib_list));
        return XVisualInfo.createSafe(__result);
    }

    // --- [ glXCreateContext ] ---

    /** Unsafe version of: {@link #glXCreateContext CreateContext} */
    public static long nglXCreateContext(long display, long visual, long share_list, int direct) {
        long __functionAddress = Functions.CreateContext;
        if (CHECKS) {
            check(display);
            XVisualInfo.validate(visual);
        }
        return callPPPP(display, visual, share_list, direct, __functionAddress);
    }

    /**
     * Creates an OpenGL context.
     *
     * @param display    the connection to the X server
     * @param visual     a pointer to an {@link XVisualInfo} structure
     * @param share_list the GLXContext to share objects with
     * @param direct     whether direct rendering is requested
     */
    @NativeType("GLXContext")
    public static long glXCreateContext(@NativeType("Display *") long display, @NativeType("XVisualInfo *") XVisualInfo visual, @NativeType("GLXContext") long share_list, @NativeType("Bool") boolean direct) {
        return nglXCreateContext(display, visual.address(), share_list, direct ? 1 : 0);
    }

    // --- [ glXMakeCurrent ] ---

    /**
     * Makes a context current in the current thread
     *
     * @param display the connection to the X server
     * @param draw    the draw GLXdrawable
     * @param ctx     the GLXContext to make current
     */
    @NativeType("Bool")
    public static boolean glXMakeCurrent(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw, @NativeType("GLXContext") long ctx) {
        long __functionAddress = Functions.MakeCurrent;
        if (CHECKS) {
            check(display);
        }
        return callPPPI(display, draw, ctx, __functionAddress) != 0;
    }

    // --- [ glXCopyContext ] ---

    /**
     * Copies OpenGL rendering state from one context to another.
     *
     * @param display the connection to the X server
     * @param source  the source GLXContext
     * @param dest    the destination GLXContext
     * @param mask    indicates which groups of state variables are to be copied; it contains the bitwise OR of the symbolic names for the attribute groups
     */
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

    /**
     * Determines if an OpenGL rendering context is direct.
     *
     * @param display the connection to the X server
     * @param ctx     the GLXContext to query
     */
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

    /**
     * Destroys an OpenGL context.
     * 
     * <p>If {@code ctx} is still current to any thread, {@code ctx} is not destroyed until it is no longer current. In any event, the associated XID will be
     * destroyed and {@code ctx} cannot subsequently be made current to any thread.</p>
     *
     * @param display the connection to the X server
     * @param ctx     the GLXContext to destroy
     */
    public static void glXDestroyContext(@NativeType("Display *") long display, @NativeType("GLXContext") long ctx) {
        long __functionAddress = Functions.DestroyContext;
        if (CHECKS) {
            check(display);
            check(ctx);
        }
        callPPV(display, ctx, __functionAddress);
    }

    // --- [ glXGetCurrentContext ] ---

    /** Returns the GLXContext that is current in the current thread. */
    @NativeType("GLXContext")
    public static long glXGetCurrentContext() {
        long __functionAddress = Functions.GetCurrentContext;
        return callP(__functionAddress);
    }

    // --- [ glXGetCurrentDrawable ] ---

    /** Returns the XID of the current drawable used for rendering. */
    @NativeType("GLXDrawable")
    public static long glXGetCurrentDrawable() {
        long __functionAddress = Functions.GetCurrentDrawable;
        return callP(__functionAddress);
    }

    // --- [ glXWaitGL ] ---

    /**
     * Prevents X requests from executing until any outstanding OpenGL rendering is done.
     * 
     * <p>OpenGL calls made prior to {@code glXWaitGL} are guaranteed to be executed before X rendering calls made after {@code glXWaitGL}. While the same result
     * can be achieved using {@link GL11C#glFinish Finish}, {@code glXWaitGL} does not require a round trip to the server, and is therefore more efficient in cases
     * where the client and server are on separate machines.</p>
     */
    public static void glXWaitGL() {
        long __functionAddress = Functions.WaitGL;
        callV(__functionAddress);
    }

    // --- [ glXWaitX ] ---

    /**
     * Prevents the OpenGL command sequence from executing until any outstanding X requests are completed.
     * 
     * <p>X rendering calls made prior to {@code glXWaitX} are guaranteed to be executed before OpenGL rendering calls made after {@code glXWaitX}. While the same
     * result can be achieved using {@code XSync()}, {@code glXWaitX} does not require a round trip to the server, and may therefore be more efficient.</p>
     */
    public static void glXWaitX() {
        long __functionAddress = Functions.WaitX;
        callV(__functionAddress);
    }

    // --- [ glXSwapBuffers ] ---

    /**
     * For drawables that are double buffered, makes the contexts of the back buffer potentially visible (i.e., become the contents of the front buffer).
     * 
     * <p>The contents of the back buffer then become undefined. This operation is a no-op if draw was created with a non-double-buffered GLXFBConfig, or if draw
     * is a GLXPixmap.</p>
     *
     * @param display the connection to the X server
     * @param draw    a double buffered GLXDrawable
     */
    public static void glXSwapBuffers(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw) {
        long __functionAddress = Functions.SwapBuffers;
        if (CHECKS) {
            check(display);
            check(draw);
        }
        callPPV(display, draw, __functionAddress);
    }

    // --- [ glXUseXFont ] ---

    /**
     * Provides a shortcut for using X fonts.
     *
     * @param font      the font to use
     * @param first     the first glyph in the font to use
     * @param count     the number of display lists to define
     * @param list_base the base list number
     */
    public static void glXUseXFont(@NativeType("Font") long font, int first, int count, int list_base) {
        long __functionAddress = Functions.UseXFont;
        callNV(font, first, count, list_base, __functionAddress);
    }

    // --- [ glXCreateGLXPixmap ] ---

    /** Unsafe version of: {@link #glXCreateGLXPixmap CreateGLXPixmap} */
    public static long nglXCreateGLXPixmap(long display, long visual, long pixmap) {
        long __functionAddress = Functions.CreateGLXPixmap;
        if (CHECKS) {
            check(display);
            XVisualInfo.validate(visual);
        }
        return callPPNP(display, visual, pixmap, __functionAddress);
    }

    /**
     * Creates a GLXPixmap from a Pixmap.
     *
     * @param display the connection to the X server
     * @param visual  a pointer to a {@link XVisualInfo} structure
     * @param pixmap  the Pixmap
     */
    @NativeType("GLXPixmap")
    public static long glXCreateGLXPixmap(@NativeType("Display *") long display, @NativeType("XVisualInfo *") XVisualInfo visual, @NativeType("Pixmap") long pixmap) {
        return nglXCreateGLXPixmap(display, visual.address(), pixmap);
    }

    // --- [ glXDestroyGLXPixmap ] ---

    /**
     * Destroys a GLXPixmap.
     *
     * @param display the connection to the X server
     * @param pixmap  the GLXPixmap to destroy.
     */
    public static void glXDestroyGLXPixmap(@NativeType("Display *") long display, @NativeType("GLXPixmap") long pixmap) {
        long __functionAddress = Functions.DestroyGLXPixmap;
        if (CHECKS) {
            check(display);
            check(pixmap);
        }
        callPPV(display, pixmap, __functionAddress);
    }

    /** Array version of: {@link #glXQueryExtension QueryExtension} */
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

    /** Array version of: {@link #glXQueryVersion QueryVersion} */
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

    /** Array version of: {@link #glXGetConfig GetConfig} */
    public static int glXGetConfig(@NativeType("Display *") long display, @NativeType("XVisualInfo *") XVisualInfo visual, int attribute, @NativeType("int *") int[] value) {
        long __functionAddress = Functions.GetConfig;
        if (CHECKS) {
            check(display);
            check(value, 1);
            XVisualInfo.validate(visual.address());
        }
        return callPPPI(display, visual.address(), attribute, value, __functionAddress);
    }

    /** Array version of: {@link #glXChooseVisual ChooseVisual} */
    @Nullable
    @NativeType("XVisualInfo *")
    public static XVisualInfo glXChooseVisual(@NativeType("Display *") long display, int screen, @Nullable @NativeType("int *") int[] attrib_list) {
        long __functionAddress = Functions.ChooseVisual;
        if (CHECKS) {
            check(display);
            checkNTSafe(attrib_list);
        }
        long __result = callPPP(display, screen, attrib_list, __functionAddress);
        return XVisualInfo.createSafe(__result);
    }

}