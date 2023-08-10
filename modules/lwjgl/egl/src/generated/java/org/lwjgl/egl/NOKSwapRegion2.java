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
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NOK/EGL_NOK_swap_region2.txt">NOK_swap_region2</a> extension.
 * 
 * <p>This extension adds a new function which provides an alternative to eglSwapBuffers. eglSwapBuffersRegion2NOK accepts two new parameters in addition to
 * those in eglSwapBuffers. The new parameters consist of a pointer to a list of 4-integer blocks defining rectangles (x, y, width, height) and an integer
 * specifying the number of rectangles in the list.</p>
 * 
 * <p>The new parameters allow users to declare the region of the surface that has been updated. The implementation uses this information to transfer the
 * updated region to the front buffer. Only the pixels within the specified region are copied; any rendering outside that region will not become visible
 * on the window surface. This in contrast with the EGL_NOK_swap_region extension which treats the modified region only as a hint.</p>
 * 
 * <p>This functional change is aimed at further reducing the processing and bandwidth requirements of optimizations of applications whose graphics are
 * commonly subjected to region-based changes. Specifically, this extension enables partial surface updates without requiring the use of preserved swaps.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4}.</p>
 */
public class NOKSwapRegion2 {

    protected NOKSwapRegion2() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglSwapBuffersRegion2NOK ] ---

    public static int neglSwapBuffersRegion2NOK(long dpy, long surface, int numRects, long rects) {
        long __functionAddress = EGL.getCapabilities().eglSwapBuffersRegion2NOK;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, numRects, rects, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglSwapBuffersRegion2NOK(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @Nullable @NativeType("EGLint const *") IntBuffer rects) {
        return neglSwapBuffersRegion2NOK(dpy, surface, remainingSafe(rects), memAddressSafe(rects)) != 0;
    }

    /** Array version of: {@link #eglSwapBuffersRegion2NOK SwapBuffersRegion2NOK} */
    @NativeType("EGLBoolean")
    public static boolean eglSwapBuffersRegion2NOK(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @Nullable @NativeType("EGLint const *") int[] rects) {
        long __functionAddress = EGL.getCapabilities().eglSwapBuffersRegion2NOK;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, lengthSafe(rects), rects, __functionAddress) != 0;
    }

}