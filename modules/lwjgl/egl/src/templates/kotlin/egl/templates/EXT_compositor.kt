/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_compositor = "EXTCompositor".nativeClassEGL("EXT_compositor", postfix = EXT) {
    IntConstant(
        "PRIMARY_COMPOSITOR_CONTEXT_EXT"..0x3460
    )

    IntConstant(
        "EXTERNAL_REF_ID_EXT"..0x3461
    )

    IntConstant(
        "COMPOSITOR_DROP_NEWEST_FRAME_EXT"..0x3462,
        "COMPOSITOR_KEEP_NEWEST_FRAME_EXT"..0x3463
    )

    EGLBoolean(
        "CompositorSetContextListEXT",

        EGLint.const.p("external_ref_ids"),
        AutoSize("external_ref_ids")..EGLint("num_entries")
    )

    EGLBoolean(
        "CompositorSetContextAttributesEXT",

        EGLint("external_ref_id"),
        EGLint.const.p("context_attributes"),
        AutoSize("context_attributes")..EGLint("num_entries")
    )

    EGLBoolean(
        "CompositorSetWindowListEXT",

        EGLint("external_ref_id"),
        EGLint.const.p("external_win_ids"),
        AutoSize("external_win_ids")..EGLint("num_entries")
    )

    EGLBoolean(
        "CompositorSetWindowAttributesEXT",

        EGLint("external_win_id"),
        EGLint.const.p("window_attributes"),
        AutoSize("window_attributes")..EGLint("num_entries")
    )

    EGLBoolean(
        "CompositorBindTexWindowEXT",

        EGLint("external_win_id")
    )

    EGLBoolean(
        "CompositorSetSizeEXT",

        EGLint("external_win_id"),
        EGLint("width"),
        EGLint("height")
    )

    EGLBoolean(
        "CompositorSwapPolicyEXT",

        EGLint("external_win_id"),
        EGLint("policy")
    )
}