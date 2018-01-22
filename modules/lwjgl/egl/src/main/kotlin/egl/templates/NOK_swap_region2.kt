/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val NOK_swap_region2 = "NOKSwapRegion2".nativeClassEGL("NOK_swap_region2", postfix = NOK) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds a new function which provides an alternative to eglSwapBuffers. eglSwapBuffersRegion2NOK accepts two new parameters in addition to
        those in eglSwapBuffers. The new parameters consist of a pointer to a list of 4-integer blocks defining rectangles (x, y, width, height) and an integer
        specifying the number of rectangles in the list.

        The new parameters allow users to declare the region of the surface that has been updated. The implementation uses this information to transfer the
        updated region to the front buffer. Only the pixels within the specified region are copied; any rendering outside that region will not become visible
        on the window surface. This in contrast with the EGL_NOK_swap_region extension which treats the modified region only as a hint.

        This functional change is aimed at further reducing the processing and bandwidth requirements of optimizations of applications whose graphics are
        commonly subjected to region-based changes. Specifically, this extension enables partial surface updates without requiring the use of preserved swaps.

        Requires ${EGL14.core}.
        """

    EGLBoolean(
        "SwapBuffersRegion2NOK",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSurface.IN("surface", ""),
        AutoSize("rects")..EGLint.IN("numRects", ""),
        nullable..const..EGLint_p.IN("rects", "")
    )
}