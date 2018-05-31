/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import javax.annotation.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The core EGL 1.5 functionality. */
public class EGL15 extends EGL14 {

    public static final int
        EGL_CONTEXT_MAJOR_VERSION                      = 0x3098,
        EGL_CONTEXT_MINOR_VERSION                      = 0x30FB,
        EGL_CONTEXT_OPENGL_PROFILE_MASK                = 0x30FD,
        EGL_CONTEXT_OPENGL_RESET_NOTIFICATION_STRATEGY = 0x31BD,
        EGL_NO_RESET_NOTIFICATION                      = 0x31BE,
        EGL_LOSE_CONTEXT_ON_RESET                      = 0x31BF,
        EGL_CONTEXT_OPENGL_CORE_PROFILE_BIT            = 0x1,
        EGL_CONTEXT_OPENGL_COMPATIBILITY_PROFILE_BIT   = 0x2,
        EGL_CONTEXT_OPENGL_DEBUG                       = 0x31B0,
        EGL_CONTEXT_OPENGL_FORWARD_COMPATIBLE          = 0x31B1,
        EGL_CONTEXT_OPENGL_ROBUST_ACCESS               = 0x31B2,
        EGL_OPENGL_ES3_BIT                             = 0x40,
        EGL_CL_EVENT_HANDLE                            = 0x309C,
        EGL_SYNC_CL_EVENT                              = 0x30FE,
        EGL_SYNC_CL_EVENT_COMPLETE                     = 0x30FF,
        EGL_SYNC_PRIOR_COMMANDS_COMPLETE               = 0x30F0,
        EGL_SYNC_TYPE                                  = 0x30F7,
        EGL_SYNC_STATUS                                = 0x30F1,
        EGL_SYNC_CONDITION                             = 0x30F8,
        EGL_SIGNALED                                   = 0x30F2,
        EGL_UNSIGNALED                                 = 0x30F3,
        EGL_SYNC_FLUSH_COMMANDS_BIT                    = 0x1,
        EGL_TIMEOUT_EXPIRED                            = 0x30F5,
        EGL_CONDITION_SATISFIED                        = 0x30F6,
        EGL_SYNC_FENCE                                 = 0x30F9,
        EGL_GL_COLORSPACE                              = 0x309D,
        EGL_GL_COLORSPACE_SRGB                         = 0x3089,
        EGL_GL_COLORSPACE_LINEAR                       = 0x308A,
        EGL_GL_RENDERBUFFER                            = 0x30B9,
        EGL_GL_TEXTURE_2D                              = 0x30B1,
        EGL_GL_TEXTURE_LEVEL                           = 0x30BC,
        EGL_GL_TEXTURE_3D                              = 0x30B2,
        EGL_GL_TEXTURE_ZOFFSET                         = 0x30BD,
        EGL_GL_TEXTURE_CUBE_MAP_POSITIVE_X             = 0x30B3,
        EGL_GL_TEXTURE_CUBE_MAP_NEGATIVE_X             = 0x30B4,
        EGL_GL_TEXTURE_CUBE_MAP_POSITIVE_Y             = 0x30B5,
        EGL_GL_TEXTURE_CUBE_MAP_NEGATIVE_Y             = 0x30B6,
        EGL_GL_TEXTURE_CUBE_MAP_POSITIVE_Z             = 0x30B7,
        EGL_GL_TEXTURE_CUBE_MAP_NEGATIVE_Z             = 0x30B8,
        EGL_IMAGE_PRESERVED                            = 0x30D2;

    public static final long
        EGL_FOREVER  = 0xFFFFFFFFFFFFFFFFL,
        EGL_NO_SYNC  = 0x0L,
        EGL_NO_IMAGE = 0x0L;

    protected EGL15() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(EGLCapabilities caps) {
        return checkFunctions(
            caps.eglCreateSync, caps.eglDestroySync, caps.eglClientWaitSync, caps.eglGetSyncAttrib, caps.eglCreateImage, caps.eglDestroyImage, 
            caps.eglGetPlatformDisplay, caps.eglCreatePlatformWindowSurface, caps.eglCreatePlatformPixmapSurface, caps.eglWaitSync
        );
    }

    // --- [ eglCreateSync ] ---

    public static long neglCreateSync(long dpy, int type, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateSync;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPP(__functionAddress, dpy, type, attrib_list);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreateSync.xhtml">Reference Page</a> */
    @NativeType("EGLSync")
    public static long eglCreateSync(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int type, @NativeType("EGLAttrib const *") PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNT(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateSync(dpy, type, memAddress(attrib_list));
    }

    // --- [ eglDestroySync ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglDestroySync.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglDestroySync(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSync") long sync) {
        long __functionAddress = EGL.getCapabilities().eglDestroySync;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
        }
        return callPPI(__functionAddress, dpy, sync) != 0;
    }

    // --- [ eglClientWaitSync ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglClientWaitSync.xhtml">Reference Page</a> */
    @NativeType("EGLint")
    public static int eglClientWaitSync(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSync") long sync, @NativeType("EGLint") int flags, @NativeType("EGLTime") long timeout) {
        long __functionAddress = EGL.getCapabilities().eglClientWaitSync;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
        }
        return callPPJI(__functionAddress, dpy, sync, flags, timeout);
    }

    // --- [ eglGetSyncAttrib ] ---

    public static int neglGetSyncAttrib(long dpy, long sync, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglGetSyncAttrib;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
        }
        return callPPPI(__functionAddress, dpy, sync, attribute, value);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetSyncAttrib.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglGetSyncAttrib(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSync") long sync, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib const *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglGetSyncAttrib(dpy, sync, attribute, memAddress(value)) != 0;
    }

    // --- [ eglCreateImage ] ---

    public static long neglCreateImage(long dpy, long ctx, int target, long buffer, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateImage;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(ctx);
            check(buffer);
        }
        return callPPPPP(__functionAddress, dpy, ctx, target, buffer, attrib_list);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreateImage.xhtml">Reference Page</a> */
    @NativeType("EGLImage")
    public static long eglCreateImage(@NativeType("EGLDisplay") long dpy, @NativeType("EGLContext") long ctx, @NativeType("EGLenum") int target, @NativeType("EGLClientBuffer") long buffer, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateImage(dpy, ctx, target, buffer, memAddressSafe(attrib_list));
    }

    // --- [ eglDestroyImage ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglDestroyImage.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglDestroyImage(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImage") long image) {
        long __functionAddress = EGL.getCapabilities().eglDestroyImage;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(image);
        }
        return callPPI(__functionAddress, dpy, image) != 0;
    }

    // --- [ eglGetPlatformDisplay ] ---

    public static long neglGetPlatformDisplay(int platform, long native_display, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglGetPlatformDisplay;
        if (CHECKS) {
            check(__functionAddress);
            check(native_display);
        }
        return callPPP(__functionAddress, platform, native_display, attrib_list);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetPlatformDisplay.xhtml">Reference Page</a> */
    @NativeType("EGLDisplay")
    public static long eglGetPlatformDisplay(@NativeType("EGLenum") int platform, @NativeType("void *") long native_display, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglGetPlatformDisplay(platform, native_display, memAddressSafe(attrib_list));
    }

    // --- [ eglCreatePlatformWindowSurface ] ---

    public static long neglCreatePlatformWindowSurface(long dpy, long config, long native_window, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePlatformWindowSurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(native_window);
        }
        return callPPPPP(__functionAddress, dpy, config, native_window, attrib_list);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreatePlatformWindowSurface.xhtml">Reference Page</a> */
    @NativeType("EGLSurface")
    public static long eglCreatePlatformWindowSurface(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("void *") long native_window, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreatePlatformWindowSurface(dpy, config, native_window, memAddressSafe(attrib_list));
    }

    // --- [ eglCreatePlatformPixmapSurface ] ---

    public static long neglCreatePlatformPixmapSurface(long dpy, long config, long native_pixmap, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePlatformPixmapSurface;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(native_pixmap);
        }
        return callPPPPP(__functionAddress, dpy, config, native_pixmap, attrib_list);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreatePlatformPixmapSurface.xhtml">Reference Page</a> */
    @NativeType("EGLSurface")
    public static long eglCreatePlatformPixmapSurface(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("void *") long native_pixmap, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreatePlatformPixmapSurface(dpy, config, native_pixmap, memAddressSafe(attrib_list));
    }

    // --- [ eglWaitSync ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglWaitSync.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglWaitSync(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSync") long sync, @NativeType("EGLint") int flags) {
        long __functionAddress = EGL.getCapabilities().eglWaitSync;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
        }
        return callPPI(__functionAddress, dpy, sync, flags) != 0;
    }

}