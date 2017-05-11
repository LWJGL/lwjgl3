/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_swap_buffers_with_damage = "EXTSwapBuffersWithDamage".nativeClassEGL("EXT_swap_buffers_with_damage", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a means to issue a swap buffers request to display the contents of the current back buffer and also specify a list of damage
        rectangles that can be passed to a system compositor so it can minimize how much it has to recompose.

        This should be used in situations where an application is only animating a small portion of a surface since it enables the compositor to avoid wasting
        time recomposing parts of the surface that haven't changed.

        Requires ${EGL14.core}.
        """

    EGLBoolean(
        "SwapBuffersWithDamageEXT",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSurface.IN("surface", ""),
        nullable..EGLint_p.OUT("rects", ""),
        AutoSize("rects")..EGLint.IN("n_rects", "")
    )
}