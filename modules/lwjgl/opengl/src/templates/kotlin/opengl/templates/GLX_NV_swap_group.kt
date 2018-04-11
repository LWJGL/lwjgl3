/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_NV_swap_group = "GLXNVSwapGroup".nativeClassGLX("GLX_NV_swap_group", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides the capability to synchronize the buffer swaps of a group of OpenGL windows. A swap group is created, and windows are added as
        members to the swap group. Buffer swaps to members of the swap group will then take place concurrently.

        This extension also provides the capability to sychronize the buffer swaps of different swap groups, which may reside on distributed systems on a
        network. For this purpose swap groups can be bound to a swap barrier.

        This extension extends the set of conditions that must be met before a buffer swap can take place.
        """

    Bool(
        "JoinSwapGroupNV",
        "",

        DISPLAY,
        GLXDrawable.IN("drawable", ""),
        GLuint.IN("group", "")
    )

    Bool(
        "BindSwapBarrierNV",
        "",

        DISPLAY,
        GLuint.IN("group", ""),
        GLuint.IN("barrier", "")
    )

    Bool(
        "QuerySwapGroupNV",
        "",

        DISPLAY,
        GLXDrawable.IN("drawable", ""),
        Check(1)..GLuint.p.OUT("group", ""),
        Check(1)..GLuint.p.OUT("barrier", "")
    )

    Bool(
        "QueryMaxSwapGroupsNV",
        "",

        DISPLAY,
        int.IN("screen", ""),
        Check(1)..GLuint.p.OUT("maxGroups", ""),
        Check(1)..GLuint.p.OUT("maxBarriers", "")
    )

    Bool(
        "QueryFrameCountNV",
        "",

        DISPLAY,
        int.IN("screen", ""),
        Check(1)..GLuint.p.OUT("count", "")
    )

    Bool(
        "ResetFrameCountNV",
        "",

        DISPLAY,
        int.IN("screen", "")
    )
}