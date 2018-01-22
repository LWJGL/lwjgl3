/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_partial_update = "KHRPartialUpdate".nativeClassEGL("KHR_partial_update", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The aim of this extension is to allow efficient partial updates for postable surfaces. It allows implementations to completely avoid processing areas
        of the surface which have not changed between frames, allowing increased efficiency.

        It does so by providing information and guarantees about the content of the current back buffer which allow the application to "repair" only areas that
        have become out of date since the particular back buffer was last used.

        The information provided is in the form of the "age" of the buffer, that is, how many frames ago it was last used as the back buffer for the surface.
        If the application tracks what changes it has made to the surface since this back buffer was last used, it can bring the entire back buffer up to date
        by only re-rendering the areas it knows to be out of date.

        Use of this extension provides a more efficient alternative to EGL_BUFFER_PRESERVED swap behaviour. EGL_BUFFER_PRESERVED typically implies an expensive
        full-frame copy at the beginning of the frame, as well as a dependency on the previous frame. Usage of this extension avoids both and requires only the
        necessary updates to a back buffer to be made.

        Requires ${EGL14.core}.
        """

    IntConstant(
        "",

        "BUFFER_AGE_KHR"..0x313D
    )

    EGLBoolean(
        "SetDamageRegionKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSurface.IN("surface", ""),
        nullable..EGLint_p.OUT("rects", ""),
        AutoSize("rects")..EGLint.IN("n_rects", "")
    )
}