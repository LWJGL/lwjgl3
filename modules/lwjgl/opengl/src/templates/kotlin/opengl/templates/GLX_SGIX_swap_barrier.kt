/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_SGIX_swap_barrier = "GLXSGIXSwapBarrier".nativeClassGLX("GLX_SGIX_swap_barrier", SGIX) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides the capability to sychronize the buffer swaps of different swap groups.

        Requires ${GLX_SGIX_swap_group.link}.
        """

    void(
        "BindSwapBarrierSGIX",
        """
        Binds the swap group that contains {@code drawable} to {@code barrier}. Subsequent buffer swaps for that group will be subject to this binding, until
        the group is unbound from {@code barrier}. If {@code barrier} is zero, the group is unbound from its current barrier, if any.
        """,

        DISPLAY,
        GLXDrawable("drawable", "the swap group GLXDrawable"),
        int("barrier", "the swap barrier")
    )

    Bool(
        "QueryMaxSwapBarriersSGIX",
        "Returns in {@code max} the maximum number of barriers supported by an implementation on {@code screen}.",

        DISPLAY,
        int("screen", "the screen"),
        Check(1)..int.p("max", "returns the maximum number of barriers")
    )

}