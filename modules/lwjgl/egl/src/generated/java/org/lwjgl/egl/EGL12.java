/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The core EGL 1.2 functionality. */
public class EGL12 extends EGL11 {

    public static final int
        EGL_ALPHA_FORMAT          = 0x3088,
        EGL_ALPHA_FORMAT_NONPRE   = 0x308B,
        EGL_ALPHA_FORMAT_PRE      = 0x308C,
        EGL_ALPHA_MASK_SIZE       = 0x303E,
        EGL_BUFFER_PRESERVED      = 0x3094,
        EGL_BUFFER_DESTROYED      = 0x3095,
        EGL_CLIENT_APIS           = 0x308D,
        EGL_COLORSPACE            = 0x3087,
        EGL_COLORSPACE_sRGB       = 0x3089,
        EGL_COLORSPACE_LINEAR     = 0x308A,
        EGL_COLOR_BUFFER_TYPE     = 0x303F,
        EGL_CONTEXT_CLIENT_TYPE   = 0x3097,
        EGL_DISPLAY_SCALING       = 10000,
        EGL_HORIZONTAL_RESOLUTION = 0x3090,
        EGL_LUMINANCE_BUFFER      = 0x308F,
        EGL_LUMINANCE_SIZE        = 0x303D,
        EGL_OPENGL_ES_BIT         = 0x1,
        EGL_OPENVG_BIT            = 0x2,
        EGL_OPENGL_ES_API         = 0x30A0,
        EGL_OPENVG_API            = 0x30A1,
        EGL_OPENVG_IMAGE          = 0x3096,
        EGL_PIXEL_ASPECT_RATIO    = 0x3092,
        EGL_RENDERABLE_TYPE       = 0x3040,
        EGL_RENDER_BUFFER         = 0x3086,
        EGL_RGB_BUFFER            = 0x308E,
        EGL_SINGLE_BUFFER         = 0x3085,
        EGL_SWAP_BEHAVIOR         = 0x3093,
        EGL_UNKNOWN               = -1,
        EGL_VERTICAL_RESOLUTION   = 0x3091;

    protected EGL12() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(EGLCapabilities caps) {
        return checkFunctions(
            caps.eglBindAPI, caps.eglQueryAPI, caps.eglCreatePbufferFromClientBuffer, caps.eglReleaseThread, caps.eglWaitClient
        );
    }

    // --- [ eglBindAPI ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglBindAPI.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglBindAPI(@NativeType("EGLenum") int api) {
        long __functionAddress = EGL.getCapabilities().eglBindAPI;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress, api) != 0;
    }

    // --- [ eglQueryAPI ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglQueryAPI.xhtml">Reference Page</a> */
    @NativeType("EGLenum")
    public static int eglQueryAPI() {
        long __functionAddress = EGL.getCapabilities().eglQueryAPI;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ eglCreatePbufferFromClientBuffer ] ---

    public static long neglCreatePbufferFromClientBuffer(long dpy, int buftype, long buffer, long config, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePbufferFromClientBuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(buffer);
            check(config);
        }
        return callPPPPP(__functionAddress, dpy, buftype, buffer, config, attrib_list);
    }

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreatePbufferFromClientBuffer.xhtml">Reference Page</a> */
    @NativeType("EGLSurface")
    public static long eglCreatePbufferFromClientBuffer(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int buftype, @NativeType("EGLClientBuffer") long buffer, @NativeType("EGLConfig") long config, @Nullable @NativeType("EGLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreatePbufferFromClientBuffer(dpy, buftype, buffer, config, memAddressSafe(attrib_list));
    }

    // --- [ eglReleaseThread ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglReleaseThread.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglReleaseThread() {
        long __functionAddress = EGL.getCapabilities().eglReleaseThread;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress) != 0;
    }

    // --- [ eglWaitClient ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglWaitClient.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglWaitClient() {
        long __functionAddress = EGL.getCapabilities().eglWaitClient;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress) != 0;
    }

    /**
     * Array version of: {@link #eglCreatePbufferFromClientBuffer CreatePbufferFromClientBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglCreatePbufferFromClientBuffer.xhtml">Reference Page</a>
     */
    @NativeType("EGLSurface")
    public static long eglCreatePbufferFromClientBuffer(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int buftype, @NativeType("EGLClientBuffer") long buffer, @NativeType("EGLConfig") long config, @Nullable @NativeType("EGLint const *") int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePbufferFromClientBuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(buffer);
            check(config);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPPP(__functionAddress, dpy, buftype, buffer, config, attrib_list);
    }

}