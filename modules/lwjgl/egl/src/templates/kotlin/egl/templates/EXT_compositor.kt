/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_compositor = "EXTCompositor".nativeClassEGL("EXT_compositor", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows for the composition of multiple windows within a multi-partition EGL system. The extension allows a primary EGLContext and window
        to be created for each display. All other windows are created using non-displayable surfaces. A handle to each off-screen window is provided to the
        primary EGLContext to allow the composition of all non-displayable windows on a single display.

        For each display, there is one EGLContext which has access to create on screen windows, this is call the primary context for this display. All other
        EGLContexts are referred to as secondary contexts.

        This extension requires a multi-partition EGL driver to support asynchronous rendering of off screen surfaces.

        Information assurance is provided by preventing context and surface creation by unregistered contexts and by preventing the non-primary contexts and
        surfaces from rendering to the display.
        """

    IntConstant(
        "New attributes accepted by the {@code attrib_list} argument of #CreateContext().",

        "PRIMARY_COMPOSITOR_CONTEXT_EXT"..0x3460
    )

    IntConstant(
        "New attributes accepted by the {@code attrib_list} argument of #CreateContext() and #CreateWindowSurface().",

        "EXTERNAL_REF_ID_EXT"..0x3461
    )

    IntConstant(
        "New attributes accepted by the {@code policy} argument of #CompositorSwapPolicyEXT().",

        "COMPOSITOR_DROP_NEWEST_FRAME_EXT"..0x3462,
        "COMPOSITOR_KEEP_NEWEST_FRAME_EXT"..0x3463
    )

    EGLBoolean(
        "CompositorSetContextListEXT",
        "",

        EGLint.const.p("external_ref_ids", ""),
        AutoSize("external_ref_ids")..EGLint("num_entries", "")
    )

    EGLBoolean(
        "CompositorSetContextAttributesEXT",
        "",

        EGLint("external_ref_id", ""),
        EGLint.const.p("context_attributes", ""),
        AutoSize("context_attributes")..EGLint("num_entries", "")
    )

    EGLBoolean(
        "CompositorSetWindowListEXT",
        "",

        EGLint("external_ref_id", ""),
        EGLint.const.p("external_win_ids", ""),
        AutoSize("external_win_ids")..EGLint("num_entries", "")
    )

    EGLBoolean(
        "CompositorSetWindowAttributesEXT",
        "",

        EGLint("external_win_id", ""),
        EGLint.const.p("window_attributes", ""),
        AutoSize("window_attributes")..EGLint("num_entries", "")
    )

    EGLBoolean(
        "CompositorBindTexWindowEXT",
        "",

        EGLint("external_win_id", "")
    )

    EGLBoolean(
        "CompositorSetSizeEXT",
        "",

        EGLint("external_win_id", ""),
        EGLint("width", ""),
        EGLint("height", "")
    )

    EGLBoolean(
        "CompositorSwapPolicyEXT",
        "",

        EGLint("external_win_id", ""),
        EGLint("policy", "")
    )
}