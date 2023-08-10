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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_partial_update.txt">KHR_partial_update</a> extension.
 * 
 * <p>The aim of this extension is to allow efficient partial updates for postable surfaces. It allows implementations to completely avoid processing areas
 * of the surface which have not changed between frames, allowing increased efficiency.</p>
 * 
 * <p>It does so by providing information and guarantees about the content of the current back buffer which allow the application to "repair" only areas that
 * have become out of date since the particular back buffer was last used.</p>
 * 
 * <p>The information provided is in the form of the "age" of the buffer, that is, how many frames ago it was last used as the back buffer for the surface.
 * If the application tracks what changes it has made to the surface since this back buffer was last used, it can bring the entire back buffer up to date
 * by only re-rendering the areas it knows to be out of date.</p>
 * 
 * <p>Use of this extension provides a more efficient alternative to EGL_BUFFER_PRESERVED swap behaviour. EGL_BUFFER_PRESERVED typically implies an expensive
 * full-frame copy at the beginning of the frame, as well as a dependency on the previous frame. Usage of this extension avoids both and requires only the
 * necessary updates to a back buffer to be made.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4}.</p>
 */
public class KHRPartialUpdate {

    public static final int EGL_BUFFER_AGE_KHR = 0x313D;

    protected KHRPartialUpdate() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglSetDamageRegionKHR ] ---

    public static int neglSetDamageRegionKHR(long dpy, long surface, long rects, int n_rects) {
        long __functionAddress = EGL.getCapabilities().eglSetDamageRegionKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, rects, n_rects, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglSetDamageRegionKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @Nullable @NativeType("EGLint *") IntBuffer rects) {
        return neglSetDamageRegionKHR(dpy, surface, memAddressSafe(rects), remainingSafe(rects)) != 0;
    }

    /** Array version of: {@link #eglSetDamageRegionKHR SetDamageRegionKHR} */
    @NativeType("EGLBoolean")
    public static boolean eglSetDamageRegionKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @Nullable @NativeType("EGLint *") int[] rects) {
        long __functionAddress = EGL.getCapabilities().eglSetDamageRegionKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, rects, lengthSafe(rects), __functionAddress) != 0;
    }

}