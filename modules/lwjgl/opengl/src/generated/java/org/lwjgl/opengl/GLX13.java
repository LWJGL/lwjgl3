/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.linux.*;

/** Native bindings to GLX 1.3. */
public class GLX13 extends GLX12 {

    /** Added in GLX 1.3. */
    public static final int
        GLX_WINDOW_BIT              = 0x1,
        GLX_PIXMAP_BIT              = 0x2,
        GLX_PBUFFER_BIT             = 0x4,
        GLX_RGBA_BIT                = 0x1,
        GLX_COLOR_INDEX_BIT         = 0x2,
        GLX_PBUFFER_CLOBBER_MASK    = 0x8000000,
        GLX_FRONT_LEFT_BUFFER_BIT   = 0x1,
        GLX_FRONT_RIGHT_BUFFER_BIT  = 0x2,
        GLX_BACK_LEFT_BUFFER_BIT    = 0x4,
        GLX_BACK_RIGHT_BUFFER_BIT   = 0x8,
        GLX_AUX_BUFFERS_BIT         = 0x10,
        GLX_DEPTH_BUFFER_BIT        = 0x20,
        GLX_STENCIL_BUFFER_BIT      = 0x40,
        GLX_ACCUM_BUFFER_BIT        = 0x80,
        GLX_CONFIG_CAVEAT           = 0x20,
        GLX_X_VISUAL_TYPE           = 0x22,
        GLX_TRANSPARENT_TYPE        = 0x23,
        GLX_TRANSPARENT_INDEX_VALUE = 0x24,
        GLX_TRANSPARENT_RED_VALUE   = 0x25,
        GLX_TRANSPARENT_GREEN_VALUE = 0x26,
        GLX_TRANSPARENT_BLUE_VALUE  = 0x27,
        GLX_TRANSPARENT_ALPHA_VALUE = 0x28,
        GLX_DONT_CARE               = 0xFFFFFFFF,
        GLX_NONE                    = 0x8000,
        GLX_SLOW_CONFIG             = 0x8001,
        GLX_TRUE_COLOR              = 0x8002,
        GLX_DIRECT_COLOR            = 0x8003,
        GLX_PSEUDO_COLOR            = 0x8004,
        GLX_STATIC_COLOR            = 0x8005,
        GLX_GRAY_SCALE              = 0x8006,
        GLX_STATIC_GRAY             = 0x8007,
        GLX_TRANSPARENT_RGB         = 0x8008,
        GLX_TRANSPARENT_INDEX       = 0x8009,
        GLX_VISUAL_ID               = 0x800B,
        GLX_SCREEN                  = 0x800C,
        GLX_NON_CONFORMANT_CONFIG   = 0x800D,
        GLX_DRAWABLE_TYPE           = 0x8010,
        GLX_RENDER_TYPE             = 0x8011,
        GLX_X_RENDERABLE            = 0x8012,
        GLX_FBCONFIG_ID             = 0x8013,
        GLX_RGBA_TYPE               = 0x8014,
        GLX_COLOR_INDEX_TYPE        = 0x8015,
        GLX_MAX_PBUFFER_WIDTH       = 0x8016,
        GLX_MAX_PBUFFER_HEIGHT      = 0x8017,
        GLX_MAX_PBUFFER_PIXELS      = 0x8018,
        GLX_PRESERVED_CONTENTS      = 0x801B,
        GLX_LARGEST_PBUFFER         = 0x801C,
        GLX_WIDTH                   = 0x801D,
        GLX_HEIGHT                  = 0x801E,
        GLX_EVENT_MASK              = 0x801F,
        GLX_DAMAGED                 = 0x8020,
        GLX_SAVED                   = 0x8021,
        GLX_WINDOW                  = 0x8022,
        GLX_PBUFFER                 = 0x8023,
        GLX_PBUFFER_HEIGHT          = 0x8040,
        GLX_PBUFFER_WIDTH           = 0x8041;

    protected GLX13() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXGetFBConfigs ] ---

    /**
     * Unsafe version of: {@link #glXGetFBConfigs GetFBConfigs}
     *
     * @param nelements returns the number of GLXFBConfigs in the returned list
     */
    public static long nglXGetFBConfigs(long display, int screen, long nelements) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetFBConfigs;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPPP(display, screen, nelements, __functionAddress);
    }

    /**
     * Returns the list of all GLXFBConfigs that are available on the specified screen.
     *
     * @param display the connection to the X server
     * @param screen  the screen number
     */
    @Nullable
    @NativeType("GLXFBConfig *")
    public static PointerBuffer glXGetFBConfigs(@NativeType("Display *") long display, int screen) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer nelements = stack.callocInt(1);
        try {
            long __result = nglXGetFBConfigs(display, screen, memAddress(nelements));
            return memPointerBufferSafe(__result, nelements.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glXChooseFBConfig ] ---

    /**
     * Unsafe version of: {@link #glXChooseFBConfig ChooseFBConfig}
     *
     * @param nelements returns the number of GLXFBConfigs matched
     */
    public static long nglXChooseFBConfig(long display, int screen, long attrib_list, long nelements) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXChooseFBConfig;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPPPP(display, screen, attrib_list, nelements, __functionAddress);
    }

    /**
     * Returns a list of GLXFBConfigs that match a list of attributes.
     *
     * @param display     the connection to the X server
     * @param screen      the screen number
     * @param attrib_list a list of attributes terminated with {@code None}
     */
    @Nullable
    @NativeType("GLXFBConfig *")
    public static PointerBuffer glXChooseFBConfig(@NativeType("Display *") long display, int screen, @Nullable @NativeType("int const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer nelements = stack.callocInt(1);
        try {
            long __result = nglXChooseFBConfig(display, screen, memAddressSafe(attrib_list), memAddress(nelements));
            return memPointerBufferSafe(__result, nelements.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glXGetFBConfigAttrib ] ---

    /** Unsafe version of: {@link #glXGetFBConfigAttrib GetFBConfigAttrib} */
    public static int nglXGetFBConfigAttrib(long display, long config, int attribute, long value) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetFBConfigAttrib;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
        }
        return callPPPI(display, config, attribute, value, __functionAddress);
    }

    /**
     * Queries the value of a GLX attribute for a GLXFBConfig.
     *
     * @param display   the connection to the X server
     * @param config    the GLXFBConfig being queried
     * @param attribute the attribute to query
     * @param value     the attribute value
     */
    public static int glXGetFBConfigAttrib(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, int attribute, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nglXGetFBConfigAttrib(display, config, attribute, memAddress(value));
    }

    // --- [ glXGetVisualFromFBConfig ] ---

    /** Unsafe version of: {@link #glXGetVisualFromFBConfig GetVisualFromFBConfig} */
    public static long nglXGetVisualFromFBConfig(long display, long config) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetVisualFromFBConfig;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
        }
        return callPPP(display, config, __functionAddress);
    }

    /**
     * Retrieves the associated visual of a GLXFBConfig.
     *
     * @param display the connection to the X server
     * @param config  the GLXFBConfig
     */
    @Nullable
    @NativeType("XVisualInfo *")
    public static XVisualInfo glXGetVisualFromFBConfig(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config) {
        long __result = nglXGetVisualFromFBConfig(display, config);
        return XVisualInfo.createSafe(__result);
    }

    // --- [ glXCreateWindow ] ---

    /** Unsafe version of: {@link #glXCreateWindow CreateWindow} */
    public static long nglXCreateWindow(long display, long config, long win, long attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateWindow;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
        }
        return callPPNPP(display, config, win, attrib_list, __functionAddress);
    }

    /**
     * Create an onscreen rendering area from an X Window and a desired GLXFBConfig.
     *
     * @param display     the connection to the X server
     * @param config      the GLXFBConfig
     * @param win         the X Window
     * @param attrib_list a list of attributes terminated with {@code None}
     */
    @NativeType("GLXWindow")
    public static long glXCreateWindow(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("Window") long win, @Nullable @NativeType("int const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list);
        }
        return nglXCreateWindow(display, config, win, memAddressSafe(attrib_list));
    }

    // --- [ glXCreatePixmap ] ---

    /** Unsafe version of: {@link #glXCreatePixmap CreatePixmap} */
    public static long nglXCreatePixmap(long display, long config, long pixmap, long attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreatePixmap;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
        }
        return callPPNPP(display, config, pixmap, attrib_list, __functionAddress);
    }

    /**
     * Creates a GLXPixmap offscreen rendering area from an X Pixmap and a desired GLXFBConfig.
     *
     * @param display     the connection to the X server
     * @param config      the GLXFBConfig
     * @param pixmap      the X Pixmap
     * @param attrib_list a list of attributes terminated with {@code None}
     */
    @NativeType("GLXPixmap")
    public static long glXCreatePixmap(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("Pixmap") long pixmap, @Nullable @NativeType("int const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list);
        }
        return nglXCreatePixmap(display, config, pixmap, memAddressSafe(attrib_list));
    }

    // --- [ glXDestroyPixmap ] ---

    /**
     * Destroys a GLXPixmap.
     *
     * @param display the connection to the X server
     * @param pixmap  the GLXPixmap to destroy
     */
    public static void glXDestroyPixmap(@NativeType("Display *") long display, @NativeType("GLXPixmap") long pixmap) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXDestroyPixmap;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(pixmap);
        }
        callPPV(display, pixmap, __functionAddress);
    }

    // --- [ glXCreatePbuffer ] ---

    /** Unsafe version of: {@link #glXCreatePbuffer CreatePbuffer} */
    public static long nglXCreatePbuffer(long display, long config, long attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreatePbuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
        }
        return callPPPP(display, config, attrib_list, __functionAddress);
    }

    /**
     * Creates a GLXPbuffer from a GLXFBConfig.
     *
     * @param display     the connection to the X server
     * @param config      the GLXFBConfig
     * @param attrib_list a list of attributes terminated with {@code None}
     */
    @NativeType("GLXPbuffer")
    public static long glXCreatePbuffer(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @Nullable @NativeType("int const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list);
        }
        return nglXCreatePbuffer(display, config, memAddressSafe(attrib_list));
    }

    // --- [ glXDestroyPbuffer ] ---

    /**
     * Destroys a GLXPbuffer.
     *
     * @param display the connection to the X server
     * @param pbuf    the GLXPbuffer to destroy
     */
    public static void glXDestroyPbuffer(@NativeType("Display *") long display, @NativeType("GLXPbuffer") long pbuf) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXDestroyPbuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(pbuf);
        }
        callPPV(display, pbuf, __functionAddress);
    }

    // --- [ glXQueryDrawable ] ---

    /** Unsafe version of: {@link #glXQueryDrawable QueryDrawable} */
    public static void nglXQueryDrawable(long display, long draw, int attribute, long value) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryDrawable;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(draw);
        }
        callPPPV(display, draw, attribute, value, __functionAddress);
    }

    /**
     * Queries an attribute associated with a GLXDrawable.
     *
     * @param display   the connection to the X server
     * @param draw      the GLXDrawable being queried
     * @param attribute the attribute to query
     * @param value     returns the attribute value
     */
    public static void glXQueryDrawable(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw, int attribute, @NativeType("unsigned int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglXQueryDrawable(display, draw, attribute, memAddress(value));
    }

    /**
     * Queries an attribute associated with a GLXDrawable.
     *
     * @param display   the connection to the X server
     * @param draw      the GLXDrawable being queried
     * @param attribute the attribute to query
     */
    @NativeType("void")
    public static int glXQueryDrawable(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw, int attribute) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nglXQueryDrawable(display, draw, attribute, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glXCreateNewContext ] ---

    /**
     * Creates an OpenGL rendering context.
     *
     * @param display     the connection to the X server
     * @param config      the GLXFBConfig
     * @param render_type the render type
     * @param share_list  a GLXContext to share objects with
     * @param direct      whether direct rendering is requested
     */
    @NativeType("GLXContext")
    public static long glXCreateNewContext(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, int render_type, @NativeType("GLXContext") long share_list, @NativeType("Bool") boolean direct) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateNewContext;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
        }
        return callPPPP(display, config, render_type, share_list, direct ? 1 : 0, __functionAddress);
    }

    // --- [ glXMakeContextCurrent ] ---

    /**
     * Makes a GLXContext current in the current thread.
     *
     * @param display the connection to the X server
     * @param draw    the draw GLXDrawable
     * @param read    the read GLXDrawable
     * @param ctx     the GLXContext
     */
    @NativeType("Bool")
    public static boolean glXMakeContextCurrent(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw, @NativeType("GLXDrawable") long read, @NativeType("GLXContext") long ctx) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXMakeContextCurrent;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPPPPI(display, draw, read, ctx, __functionAddress) != 0;
    }

    // --- [ glXGetCurrentReadDrawable ] ---

    /** Returns the current GLXDrawable used for reading in the current thread. */
    @NativeType("GLXDrawable")
    public static long glXGetCurrentReadDrawable() {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetCurrentReadDrawable;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

    // --- [ glXQueryContext ] ---

    /** Unsafe version of: {@link #glXQueryContext QueryContext} */
    public static int nglXQueryContext(long display, long ctx, int attribute, long value) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryContext;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(ctx);
        }
        return callPPPI(display, ctx, attribute, value, __functionAddress);
    }

    /**
     * Queries the value of a GLXContext attribute.
     *
     * @param display   the connection to the X server
     * @param ctx       the GLXContext being queried
     * @param attribute the attribute to query
     * @param value     returns the attribute value
     */
    public static int glXQueryContext(@NativeType("Display *") long display, @NativeType("GLXContext") long ctx, int attribute, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nglXQueryContext(display, ctx, attribute, memAddress(value));
    }

    // --- [ glXSelectEvent ] ---

    /**
     * Selects which GLX events should be received on a GLXDrawable.
     *
     * @param display    the connection to the X server
     * @param draw       the GLXDrawable
     * @param event_mask the selection mask
     */
    public static void glXSelectEvent(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw, @NativeType("unsigned long") long event_mask) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXSelectEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(draw);
        }
        callPPNV(display, draw, event_mask, __functionAddress);
    }

    // --- [ glXGetSelectedEvent ] ---

    /** Unsafe version of: {@link #glXGetSelectedEvent GetSelectedEvent} */
    public static void nglXGetSelectedEvent(long display, long draw, long event_mask) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetSelectedEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(draw);
        }
        callPPPV(display, draw, event_mask, __functionAddress);
    }

    /**
     * Returns which GLX events are selected for a GLXDrawable.
     *
     * @param display    the connection to the X server
     * @param draw       the GLXDrawable
     * @param event_mask returns the selection mask
     */
    public static void glXGetSelectedEvent(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw, @NativeType("unsigned long *") CLongBuffer event_mask) {
        if (CHECKS) {
            check(event_mask, 1);
        }
        nglXGetSelectedEvent(display, draw, memAddress(event_mask));
    }

    /** Array version of: {@link #glXChooseFBConfig ChooseFBConfig} */
    @Nullable
    @NativeType("GLXFBConfig *")
    public static PointerBuffer glXChooseFBConfig(@NativeType("Display *") long display, int screen, @Nullable @NativeType("int const *") int[] attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXChooseFBConfig;
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

    /** Array version of: {@link #glXGetFBConfigAttrib GetFBConfigAttrib} */
    public static int glXGetFBConfigAttrib(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, int attribute, @NativeType("int *") int[] value) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetFBConfigAttrib;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
            check(value, 1);
        }
        return callPPPI(display, config, attribute, value, __functionAddress);
    }

    /** Array version of: {@link #glXCreateWindow CreateWindow} */
    @NativeType("GLXWindow")
    public static long glXCreateWindow(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("Window") long win, @Nullable @NativeType("int const *") int[] attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateWindow;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
            checkNTSafe(attrib_list);
        }
        return callPPNPP(display, config, win, attrib_list, __functionAddress);
    }

    /** Array version of: {@link #glXCreatePixmap CreatePixmap} */
    @NativeType("GLXPixmap")
    public static long glXCreatePixmap(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("Pixmap") long pixmap, @Nullable @NativeType("int const *") int[] attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreatePixmap;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
            checkNTSafe(attrib_list);
        }
        return callPPNPP(display, config, pixmap, attrib_list, __functionAddress);
    }

    /** Array version of: {@link #glXCreatePbuffer CreatePbuffer} */
    @NativeType("GLXPbuffer")
    public static long glXCreatePbuffer(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @Nullable @NativeType("int const *") int[] attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreatePbuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
            checkNTSafe(attrib_list);
        }
        return callPPPP(display, config, attrib_list, __functionAddress);
    }

    /** Array version of: {@link #glXQueryDrawable QueryDrawable} */
    public static void glXQueryDrawable(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw, int attribute, @NativeType("unsigned int *") int[] value) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryDrawable;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(draw);
            check(value, 1);
        }
        callPPPV(display, draw, attribute, value, __functionAddress);
    }

    /** Array version of: {@link #glXQueryContext QueryContext} */
    public static int glXQueryContext(@NativeType("Display *") long display, @NativeType("GLXContext") long ctx, int attribute, @NativeType("int *") int[] value) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryContext;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(ctx);
            check(value, 1);
        }
        return callPPPI(display, ctx, attribute, value, __functionAddress);
    }

}