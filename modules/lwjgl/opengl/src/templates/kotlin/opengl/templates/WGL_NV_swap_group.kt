/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_NV_swap_group = "WGLNVSwapGroup".nativeClassWGL("WGL_NV_swap_group", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides the capability to synchronize the buffer swaps of a group of OpenGL windows. A swap group is created, and windows are added as
        members to the swap group. Buffer swaps to members of the swap group will then take place concurrently.

        This extension also provides the capability to sychronize the buffer swaps of different swap groups, which may reside on distributed systems on a
        network. For this purpose swap groups can be bound to a swap barrier.

        This extension extends the set of conditions that must be met before a buffer swap can take place.
        """

    BOOL(
        "JoinSwapGroupNV",
        "",

        HDC("hDC", ""),
        GLuint("group", "")
    )

    BOOL(
        "BindSwapBarrierNV",
        "",

        GLuint("group", ""),
        GLuint("barrier", "")
    )

    BOOL(
        "QuerySwapGroupNV",
        "",

        HDC("hDC", ""),
        Check(1)..GLuint.p("group", ""),
        Check(1)..GLuint.p("barrier", "")
    )

    BOOL(
        "QueryMaxSwapGroupsNV",
        "",

        HDC("hDC", ""),
        Check(1)..GLuint.p("maxGroups", ""),
        Check(1)..GLuint.p("maxBarriers", "")
    )

    BOOL(
        "QueryFrameCountNV",
        "",

        HDC("hDC", ""),
        Check(1)..GLuint.p("count", "")
    )

    BOOL(
        "ResetFrameCountNV",
        "",

        HDC("hDC", "")
    )
}