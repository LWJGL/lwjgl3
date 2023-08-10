/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The core EGL 1.0 functionality. */
public class EGL10 {

    public static final int
        EGL_ALPHA_SIZE              = 0x3021,
        EGL_BAD_ACCESS              = 0x3002,
        EGL_BAD_ALLOC               = 0x3003,
        EGL_BAD_ATTRIBUTE           = 0x3004,
        EGL_BAD_CONFIG              = 0x3005,
        EGL_BAD_CONTEXT             = 0x3006,
        EGL_BAD_CURRENT_SURFACE     = 0x3007,
        EGL_BAD_DISPLAY             = 0x3008,
        EGL_BAD_MATCH               = 0x3009,
        EGL_BAD_NATIVE_PIXMAP       = 0x300A,
        EGL_BAD_NATIVE_WINDOW       = 0x300B,
        EGL_BAD_PARAMETER           = 0x300C,
        EGL_BAD_SURFACE             = 0x300D,
        EGL_BLUE_SIZE               = 0x3022,
        EGL_BUFFER_SIZE             = 0x3020,
        EGL_CONFIG_CAVEAT           = 0x3027,
        EGL_CONFIG_ID               = 0x3028,
        EGL_CORE_NATIVE_ENGINE      = 0x305B,
        EGL_DEPTH_SIZE              = 0x3025,
        EGL_DONT_CARE               = -1,
        EGL_DRAW                    = 0x3059,
        EGL_EXTENSIONS              = 0x3055,
        EGL_FALSE                   = 0,
        EGL_GREEN_SIZE              = 0x3023,
        EGL_HEIGHT                  = 0x3056,
        EGL_LARGEST_PBUFFER         = 0x3058,
        EGL_LEVEL                   = 0x3029,
        EGL_MAX_PBUFFER_HEIGHT      = 0x302A,
        EGL_MAX_PBUFFER_PIXELS      = 0x302B,
        EGL_MAX_PBUFFER_WIDTH       = 0x302C,
        EGL_NATIVE_RENDERABLE       = 0x302D,
        EGL_NATIVE_VISUAL_ID        = 0x302E,
        EGL_NATIVE_VISUAL_TYPE      = 0x302F,
        EGL_NONE                    = 0x3038,
        EGL_NON_CONFORMANT_CONFIG   = 0x3051,
        EGL_NOT_INITIALIZED         = 0x3001,
        EGL_PBUFFER_BIT             = 0x1,
        EGL_PIXMAP_BIT              = 0x2,
        EGL_READ                    = 0x305A,
        EGL_RED_SIZE                = 0x3024,
        EGL_SAMPLES                 = 0x3031,
        EGL_SAMPLE_BUFFERS          = 0x3032,
        EGL_SLOW_CONFIG             = 0x3050,
        EGL_STENCIL_SIZE            = 0x3026,
        EGL_SUCCESS                 = 0x3000,
        EGL_SURFACE_TYPE            = 0x3033,
        EGL_TRANSPARENT_BLUE_VALUE  = 0x3035,
        EGL_TRANSPARENT_GREEN_VALUE = 0x3036,
        EGL_TRANSPARENT_RED_VALUE   = 0x3037,
        EGL_TRANSPARENT_RGB         = 0x3052,
        EGL_TRANSPARENT_TYPE        = 0x3034,
        EGL_TRUE                    = 1,
        EGL_VENDOR                  = 0x3053,
        EGL_VERSION                 = 0x3054,
        EGL_WIDTH                   = 0x3057,
        EGL_WINDOW_BIT              = 0x4;

    /** Null values. */
    public static final long
        EGL_NO_CONTEXT = 0x0L,
        EGL_NO_DISPLAY = 0x0L,
        EGL_NO_SURFACE = 0x0L;

    protected EGL10() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglChooseConfig ] ---

    public static int neglChooseConfig(long dpy, long attrib_list, long configs, int config_size, long num_config) {
        long __functionAddress = EGL.getCapabilities().eglChooseConfig;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPPPI(dpy, attrib_list, configs, config_size, num_config, __functionAddress);
    }

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglChooseConfig.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglChooseConfig(@NativeType("EGLDisplay") long dpy, @Nullable @NativeType("EGLint const *") IntBuffer attrib_list, @Nullable @NativeType("EGLConfig *") PointerBuffer configs, @NativeType("EGLint *") IntBuffer num_config) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
            check(num_config, 1);
        }
        return neglChooseConfig(dpy, memAddressSafe(attrib_list), memAddressSafe(configs), remainingSafe(configs), memAddress(num_config)) != 0;
    }

    // --- [ eglCopyBuffers ] ---

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCopyBuffers.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglCopyBuffers(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLNativePixmapType") long target) {
        long __functionAddress = EGL.getCapabilities().eglCopyBuffers;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
            check(target);
        }
        return callPPPI(dpy, surface, target, __functionAddress) != 0;
    }

    // --- [ eglCreateContext ] ---

    public static long neglCreateContext(long dpy, long config, long share_context, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateContext;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
        }
        return callPPPPP(dpy, config, share_context, attrib_list, __functionAddress);
    }

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreateContext.xhtml">Reference Page</a> */
    @NativeType("EGLContext")
    public static long eglCreateContext(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("EGLContext") long share_context, @Nullable @NativeType("EGLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateContext(dpy, config, share_context, memAddressSafe(attrib_list));
    }

    // --- [ eglCreatePbufferSurface ] ---

    public static long neglCreatePbufferSurface(long dpy, long config, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePbufferSurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
        }
        return callPPPP(dpy, config, attrib_list, __functionAddress);
    }

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreatePbufferSurface.xhtml">Reference Page</a> */
    @NativeType("EGLSurface")
    public static long eglCreatePbufferSurface(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @Nullable @NativeType("EGLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreatePbufferSurface(dpy, config, memAddressSafe(attrib_list));
    }

    // --- [ eglCreatePixmapSurface ] ---

    public static long neglCreatePixmapSurface(long dpy, long config, long pixmap, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePixmapSurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(pixmap);
        }
        return callPPPPP(dpy, config, pixmap, attrib_list, __functionAddress);
    }

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreatePixmapSurface.xhtml">Reference Page</a> */
    @NativeType("EGLSurface")
    public static long eglCreatePixmapSurface(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("EGLNativePixmapType") long pixmap, @Nullable @NativeType("EGLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreatePixmapSurface(dpy, config, pixmap, memAddressSafe(attrib_list));
    }

    // --- [ eglCreateWindowSurface ] ---

    public static long neglCreateWindowSurface(long dpy, long config, long win, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateWindowSurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(win);
        }
        return callPPPPP(dpy, config, win, attrib_list, __functionAddress);
    }

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreateWindowSurface.xhtml">Reference Page</a> */
    @NativeType("EGLSurface")
    public static long eglCreateWindowSurface(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("EGLNativeWindowType") long win, @Nullable @NativeType("EGLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateWindowSurface(dpy, config, win, memAddressSafe(attrib_list));
    }

    // --- [ eglDestroyContext ] ---

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglDestroyContext.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglDestroyContext(@NativeType("EGLDisplay") long dpy, @NativeType("EGLContext") long ctx) {
        long __functionAddress = EGL.getCapabilities().eglDestroyContext;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(ctx);
        }
        return callPPI(dpy, ctx, __functionAddress) != 0;
    }

    // --- [ eglDestroySurface ] ---

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglDestroySurface.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglDestroySurface(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface) {
        long __functionAddress = EGL.getCapabilities().eglDestroySurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPI(dpy, surface, __functionAddress) != 0;
    }

    // --- [ eglGetConfigAttrib ] ---

    public static int neglGetConfigAttrib(long dpy, long config, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglGetConfigAttrib;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
        }
        return callPPPI(dpy, config, attribute, value, __functionAddress);
    }

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetConfigAttrib.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglGetConfigAttrib(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("EGLint") int attribute, @NativeType("EGLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglGetConfigAttrib(dpy, config, attribute, memAddress(value)) != 0;
    }

    // --- [ eglGetConfigs ] ---

    public static int neglGetConfigs(long dpy, long configs, int config_size, long num_config) {
        long __functionAddress = EGL.getCapabilities().eglGetConfigs;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPPI(dpy, configs, config_size, num_config, __functionAddress);
    }

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetConfigs.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglGetConfigs(@NativeType("EGLDisplay") long dpy, @Nullable @NativeType("EGLConfig *") PointerBuffer configs, @NativeType("EGLint *") IntBuffer num_config) {
        if (CHECKS) {
            check(num_config, 1);
        }
        return neglGetConfigs(dpy, memAddressSafe(configs), remainingSafe(configs), memAddress(num_config)) != 0;
    }

    // --- [ eglGetCurrentDisplay ] ---

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetCurrentDisplay.xhtml">Reference Page</a> */
    @NativeType("EGLDisplay")
    public static long eglGetCurrentDisplay() {
        long __functionAddress = EGL.getCapabilities().eglGetCurrentDisplay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

    // --- [ eglGetCurrentSurface ] ---

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetCurrentSurface.xhtml">Reference Page</a> */
    @NativeType("EGLSurface")
    public static long eglGetCurrentSurface(@NativeType("EGLint") int readdraw) {
        long __functionAddress = EGL.getCapabilities().eglGetCurrentSurface;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(readdraw, __functionAddress);
    }

    // --- [ eglGetDisplay ] ---

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetDisplay.xhtml">Reference Page</a> */
    @NativeType("EGLDisplay")
    public static long eglGetDisplay(@NativeType("EGLNativeDisplayType") long display_id) {
        long __functionAddress = EGL.getCapabilities().eglGetDisplay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(display_id, __functionAddress);
    }

    // --- [ eglGetError ] ---

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetError.xhtml">Reference Page</a> */
    @NativeType("EGLint")
    public static int eglGetError() {
        long __functionAddress = EGL.getCapabilities().eglGetError;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ eglGetProcAddress ] ---

    public static long neglGetProcAddress(long procname) {
        long __functionAddress = EGL.getCapabilities().eglGetProcAddress;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(procname, __functionAddress);
    }

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetProcAddress.xhtml">Reference Page</a> */
    @NativeType("__eglMustCastToProperFunctionPointerType")
    public static long eglGetProcAddress(@NativeType("char const *") ByteBuffer procname) {
        if (CHECKS) {
            checkNT1(procname);
        }
        return neglGetProcAddress(memAddress(procname));
    }

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetProcAddress.xhtml">Reference Page</a> */
    @NativeType("__eglMustCastToProperFunctionPointerType")
    public static long eglGetProcAddress(@NativeType("char const *") CharSequence procname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(procname, true);
            long procnameEncoded = stack.getPointerAddress();
            return neglGetProcAddress(procnameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ eglInitialize ] ---

    public static int neglInitialize(long dpy, long major, long minor) {
        long __functionAddress = EGL.getCapabilities().eglInitialize;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPPI(dpy, major, minor, __functionAddress);
    }

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglInitialize.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglInitialize(@NativeType("EGLDisplay") long dpy, @Nullable @NativeType("EGLint *") IntBuffer major, @Nullable @NativeType("EGLint *") IntBuffer minor) {
        if (CHECKS) {
            checkSafe(major, 1);
            checkSafe(minor, 1);
        }
        return neglInitialize(dpy, memAddressSafe(major), memAddressSafe(minor)) != 0;
    }

    // --- [ eglMakeCurrent ] ---

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglMakeCurrent.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglMakeCurrent(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long draw, @NativeType("EGLSurface") long read, @NativeType("EGLContext") long ctx) {
        long __functionAddress = EGL.getCapabilities().eglMakeCurrent;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPPPI(dpy, draw, read, ctx, __functionAddress) != 0;
    }

    // --- [ eglQueryContext ] ---

    public static int neglQueryContext(long dpy, long ctx, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryContext;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(ctx);
        }
        return callPPPI(dpy, ctx, attribute, value, __functionAddress);
    }

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglQueryContext.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglQueryContext(@NativeType("EGLDisplay") long dpy, @NativeType("EGLContext") long ctx, @NativeType("EGLint") int attribute, @NativeType("EGLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryContext(dpy, ctx, attribute, memAddress(value)) != 0;
    }

    // --- [ eglQueryString ] ---

    public static long neglQueryString(long dpy, int name) {
        long __functionAddress = EGL.getCapabilities().eglQueryString;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(dpy, name, __functionAddress);
    }

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglQueryString.xhtml">Reference Page</a> */
    @Nullable
    @NativeType("char *")
    public static String eglQueryString(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint") int name) {
        long __result = neglQueryString(dpy, name);
        return memASCIISafe(__result);
    }

    // --- [ eglQuerySurface ] ---

    public static int neglQuerySurface(long dpy, long surface, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQuerySurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, attribute, value, __functionAddress);
    }

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglQuerySurface.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglQuerySurface(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint") int attribute, @NativeType("EGLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQuerySurface(dpy, surface, attribute, memAddress(value)) != 0;
    }

    // --- [ eglSwapBuffers ] ---

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglSwapBuffers.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglSwapBuffers(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface) {
        long __functionAddress = EGL.getCapabilities().eglSwapBuffers;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPI(dpy, surface, __functionAddress) != 0;
    }

    // --- [ eglTerminate ] ---

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglTerminate.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglTerminate(@NativeType("EGLDisplay") long dpy) {
        long __functionAddress = EGL.getCapabilities().eglTerminate;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPI(dpy, __functionAddress) != 0;
    }

    // --- [ eglWaitGL ] ---

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglWaitGL.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglWaitGL() {
        long __functionAddress = EGL.getCapabilities().eglWaitGL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress) != 0;
    }

    // --- [ eglWaitNative ] ---

    /** <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglWaitNative.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglWaitNative(@NativeType("EGLint") int engine) {
        long __functionAddress = EGL.getCapabilities().eglWaitNative;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(engine, __functionAddress) != 0;
    }

    /**
     * Array version of: {@link #eglChooseConfig ChooseConfig}
     * 
     * @see <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglChooseConfig.xhtml">Reference Page</a>
     */
    @NativeType("EGLBoolean")
    public static boolean eglChooseConfig(@NativeType("EGLDisplay") long dpy, @Nullable @NativeType("EGLint const *") int[] attrib_list, @Nullable @NativeType("EGLConfig *") PointerBuffer configs, @NativeType("EGLint *") int[] num_config) {
        long __functionAddress = EGL.getCapabilities().eglChooseConfig;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
            check(num_config, 1);
        }
        return callPPPPI(dpy, attrib_list, memAddressSafe(configs), remainingSafe(configs), num_config, __functionAddress) != 0;
    }

    /**
     * Array version of: {@link #eglCreateContext CreateContext}
     * 
     * @see <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreateContext.xhtml">Reference Page</a>
     */
    @NativeType("EGLContext")
    public static long eglCreateContext(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("EGLContext") long share_context, @Nullable @NativeType("EGLint const *") int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateContext;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPPP(dpy, config, share_context, attrib_list, __functionAddress);
    }

    /**
     * Array version of: {@link #eglCreatePbufferSurface CreatePbufferSurface}
     * 
     * @see <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreatePbufferSurface.xhtml">Reference Page</a>
     */
    @NativeType("EGLSurface")
    public static long eglCreatePbufferSurface(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @Nullable @NativeType("EGLint const *") int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePbufferSurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPP(dpy, config, attrib_list, __functionAddress);
    }

    /**
     * Array version of: {@link #eglCreatePixmapSurface CreatePixmapSurface}
     * 
     * @see <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreatePixmapSurface.xhtml">Reference Page</a>
     */
    @NativeType("EGLSurface")
    public static long eglCreatePixmapSurface(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("EGLNativePixmapType") long pixmap, @Nullable @NativeType("EGLint const *") int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePixmapSurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(pixmap);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPPP(dpy, config, pixmap, attrib_list, __functionAddress);
    }

    /**
     * Array version of: {@link #eglCreateWindowSurface CreateWindowSurface}
     * 
     * @see <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreateWindowSurface.xhtml">Reference Page</a>
     */
    @NativeType("EGLSurface")
    public static long eglCreateWindowSurface(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("EGLNativeWindowType") long win, @Nullable @NativeType("EGLint const *") int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateWindowSurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(win);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPPP(dpy, config, win, attrib_list, __functionAddress);
    }

    /**
     * Array version of: {@link #eglGetConfigAttrib GetConfigAttrib}
     * 
     * @see <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetConfigAttrib.xhtml">Reference Page</a>
     */
    @NativeType("EGLBoolean")
    public static boolean eglGetConfigAttrib(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("EGLint") int attribute, @NativeType("EGLint *") int[] value) {
        long __functionAddress = EGL.getCapabilities().eglGetConfigAttrib;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(value, 1);
        }
        return callPPPI(dpy, config, attribute, value, __functionAddress) != 0;
    }

    /**
     * Array version of: {@link #eglGetConfigs GetConfigs}
     * 
     * @see <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetConfigs.xhtml">Reference Page</a>
     */
    @NativeType("EGLBoolean")
    public static boolean eglGetConfigs(@NativeType("EGLDisplay") long dpy, @Nullable @NativeType("EGLConfig *") PointerBuffer configs, @NativeType("EGLint *") int[] num_config) {
        long __functionAddress = EGL.getCapabilities().eglGetConfigs;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(num_config, 1);
        }
        return callPPPI(dpy, memAddressSafe(configs), remainingSafe(configs), num_config, __functionAddress) != 0;
    }

    /**
     * Array version of: {@link #eglInitialize Initialize}
     * 
     * @see <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglInitialize.xhtml">Reference Page</a>
     */
    @NativeType("EGLBoolean")
    public static boolean eglInitialize(@NativeType("EGLDisplay") long dpy, @Nullable @NativeType("EGLint *") int[] major, @Nullable @NativeType("EGLint *") int[] minor) {
        long __functionAddress = EGL.getCapabilities().eglInitialize;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            checkSafe(major, 1);
            checkSafe(minor, 1);
        }
        return callPPPI(dpy, major, minor, __functionAddress) != 0;
    }

    /**
     * Array version of: {@link #eglQueryContext QueryContext}
     * 
     * @see <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglQueryContext.xhtml">Reference Page</a>
     */
    @NativeType("EGLBoolean")
    public static boolean eglQueryContext(@NativeType("EGLDisplay") long dpy, @NativeType("EGLContext") long ctx, @NativeType("EGLint") int attribute, @NativeType("EGLint *") int[] value) {
        long __functionAddress = EGL.getCapabilities().eglQueryContext;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(ctx);
            check(value, 1);
        }
        return callPPPI(dpy, ctx, attribute, value, __functionAddress) != 0;
    }

    /**
     * Array version of: {@link #eglQuerySurface QuerySurface}
     * 
     * @see <a href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglQuerySurface.xhtml">Reference Page</a>
     */
    @NativeType("EGLBoolean")
    public static boolean eglQuerySurface(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint") int attribute, @NativeType("EGLint *") int[] value) {
        long __functionAddress = EGL.getCapabilities().eglQuerySurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
            check(value, 1);
        }
        return callPPPI(dpy, surface, attribute, value, __functionAddress) != 0;
    }

}