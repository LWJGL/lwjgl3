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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/SGIX/GLX_SGIX_fbconfig.txt">GLX_SGIX_fbconfig</a> extension.
 * 
 * <p>This extension introduces a new way to describe the capabilities of a GLX drawable (i.e., to describe the depth of color buffer components and the type
 * and size of ancillary buffers), removes the "similarity" requirement when making a context current to a drawable, and supports  RGBA rendering to
 * one-and two-component Windows and GLX Pixmaps.</p>
 */
public class GLXSGIXFBConfig {

    /** Accepted by the {@code attribute} parameter of {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX}, and by the {@code attrib_list} parameter of {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX}. */
    public static final int
        GLX_DRAWABLE_TYPE_SGIX = 0x8010,
        GLX_RENDER_TYPE_SGIX   = 0x8011,
        GLX_X_RENDERABLE_SGIX  = 0x8012;

    /**
     * Accepted by the {@code attribute} parameter of {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX}, the {@code attrib_list} parameter of {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX},
     * by the {@code attribute} parameter of {@link GLXSGIXPbuffer#glXQueryGLXPbufferSGIX QueryGLXPbufferSGIX} and by the {@code attribute} parameter of
     * {@link GLXEXTImportContext#glXQueryContextInfoEXT QueryContextInfoEXT}.
     */
    public static final int GLX_FBCONFIG_ID_SGIX = 0x8013;

    /** Accepted by the {@code attribute} parameter of {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX}. */
    public static final int GLX_SCREEN_EXT = 0x800C;

    /**
     * Returned by {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX} (when {@code attribute} is set to {@link #GLX_DRAWABLE_TYPE_SGIX DRAWABLE_TYPE_SGIX}) and accepted by the {@code attrib_list}
     * parameter of {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX} (following the {@link #GLX_DRAWABLE_TYPE_SGIX DRAWABLE_TYPE_SGIX} token).
     */
    public static final int
        GLX_WINDOW_BIT_SGIX = 0x1,
        GLX_PIXMAP_BIT_SGIX = 0x2;

    /**
     * Returned by {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX} (when {@code attribute} is set to {@link #GLX_RENDER_TYPE_SGIX RENDER_TYPE_SGIX}) and accepted by the {@code attrib_list}
     * parameter of {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX} (following the {@link #GLX_RENDER_TYPE_SGIX RENDER_TYPE_SGIX} token).
     */
    public static final int
        GLX_RGBA_BIT_SGIX        = 0x1,
        GLX_COLOR_INDEX_BIT_SGIX = 0x2;

    /** Accepted by the {@code render_type} parameter of {@link #glXCreateContextWithConfigSGIX CreateContextWithConfigSGIX}. */
    public static final int
        GLX_RGBA_TYPE_SGIX        = 0x8014,
        GLX_COLOR_INDEX_TYPE_SGIX = 0x8015;

    protected GLXSGIXFBConfig() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXGetFBConfigAttribSGIX ] ---

    /** Unsafe version of: {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX} */
    public static int nglXGetFBConfigAttribSGIX(long display, long config, int attribute, long value) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetFBConfigAttribSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
        }
        return callPPPI(display, config, attribute, value, __functionAddress);
    }

    /**
     * Gets the value of a GLX attribute for a {@code GLXFBConfigSGIX}.
     *
     * @param display   the connection to the X server
     * @param config    the {@code GLXFBConfigSGIX} being queried
     * @param attribute the attribute to query
     * @param value     returns the attribute value
     */
    public static int glXGetFBConfigAttribSGIX(@NativeType("Display *") long display, @NativeType("GLXFBConfigSGIX") long config, int attribute, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nglXGetFBConfigAttribSGIX(display, config, attribute, memAddress(value));
    }

    // --- [ glXChooseFBConfigSGIX ] ---

    /**
     * Unsafe version of: {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX}
     *
     * @param nelements the number of {@code GLXFBConfigSGIX} returned
     */
    public static long nglXChooseFBConfigSGIX(long display, int screen, long attrib_list, long nelements) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXChooseFBConfigSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPPPP(display, screen, attrib_list, nelements, __functionAddress);
    }

    /**
     * Gets {@code GLXFBConfigSGIX}s that match a list of attributes or to get the list of GLXFBConfigSGIXs that are available on the specified screen.
     *
     * @param display     the connection to the X server
     * @param screen      the screen number
     * @param attrib_list an optional list of attributes, terminated with org.lwjgl.system.linux.{@code None}
     */
    @Nullable
    @NativeType("GLXFBConfigSGIX *")
    public static PointerBuffer glXChooseFBConfigSGIX(@NativeType("Display *") long display, int screen, @Nullable @NativeType("int const *") IntBuffer attrib_list) {
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

    /**
     * Creates a GLX pixmap using a {@code GLXFBConfigSGIX}.
     *
     * @param display the connection to the X server
     * @param config  the {@code GLXFBConfigSGIX}
     * @param pixmap  the pixmap
     */
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

    /**
     * Creates a GLX context using a {@code GLXFBConfigSGIX}.
     *
     * @param display     the connection to the X server
     * @param config      the {@code GLXFBConfigSGIX}
     * @param render_type the render type. One of:<br><table><tr><td>{@link #GLX_RGBA_TYPE_SGIX RGBA_TYPE_SGIX}</td><td>{@link #GLX_COLOR_INDEX_TYPE_SGIX COLOR_INDEX_TYPE_SGIX}</td></tr></table>
     * @param share_list  the GLX context to share objects with
     * @param direct      direct rendering request
     */
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

    /** Unsafe version of: {@link #glXGetVisualFromFBConfigSGIX GetVisualFromFBConfigSGIX} */
    public static long nglXGetVisualFromFBConfigSGIX(long display, long config) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetVisualFromFBConfigSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
        }
        return callPPP(display, config, __functionAddress);
    }

    /**
     * Retrieves the associated visual of a {@code GLXFBConfigSGIX}.
     *
     * @param display the connection to the X server
     * @param config  the {@code GLXFBConfigSGIX}
     */
    @Nullable
    @NativeType("XVisualInfo *")
    public static XVisualInfo glXGetVisualFromFBConfigSGIX(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config) {
        long __result = nglXGetVisualFromFBConfigSGIX(display, config);
        return XVisualInfo.createSafe(__result);
    }

    // --- [ glXGetFBConfigFromVisualSGIX ] ---

    /** Unsafe version of: {@link #glXGetFBConfigFromVisualSGIX GetFBConfigFromVisualSGIX} */
    public static long nglXGetFBConfigFromVisualSGIX(long display, long vis) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetFBConfigFromVisualSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            XVisualInfo.validate(vis);
        }
        return callPPP(display, vis, __functionAddress);
    }

    /**
     * Retrieves the {@code GLXFBConfigSGIX} associated with a visual.
     *
     * @param display the connection to the X server
     * @param vis     the visual
     */
    @NativeType("GLXFBConfigSGIX")
    public static long glXGetFBConfigFromVisualSGIX(@NativeType("Display *") long display, @NativeType("XVisualInfo *") XVisualInfo vis) {
        return nglXGetFBConfigFromVisualSGIX(display, vis.address());
    }

    /** Array version of: {@link #glXGetFBConfigAttribSGIX GetFBConfigAttribSGIX} */
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

    /** Array version of: {@link #glXChooseFBConfigSGIX ChooseFBConfigSGIX} */
    @Nullable
    @NativeType("GLXFBConfigSGIX *")
    public static PointerBuffer glXChooseFBConfigSGIX(@NativeType("Display *") long display, int screen, @Nullable @NativeType("int const *") int[] attrib_list) {
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