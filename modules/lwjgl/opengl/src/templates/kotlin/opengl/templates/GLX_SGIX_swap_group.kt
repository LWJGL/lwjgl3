/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_SGIX_swap_group = "GLXSGIXSwapGroup".nativeClassGLX("GLX_SGIX_swap_group", SGIX) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides the capability to synchronize the buffer swaps of a group of GLX drawables.  A swap group is created, and drawables are added as
        members to the swap group. Buffer swaps to members of the swap group will then take place concurrently.

        This extension extends the set of conditions that must be met before a buffer swap can take place.
        """

    void(
        "JoinSwapGroupSGIX",
        """
        Adds {@code drawable} to the swap group containing {@code member} as a member. If {@code drawable} is already a member of a different group, it is
        implicitly removed from that group first. If {@code member} is {@code None}, {@code drawable} is removed from the swap group that it belongs to, if
        any.
        """,

        DISPLAY,
        GLXDrawable.IN("drawable", "the GLXDrawable to add to the swap group"),
        nullable..GLXDrawable.IN("member", "a member of the swap group or {@code None}")
    )

}