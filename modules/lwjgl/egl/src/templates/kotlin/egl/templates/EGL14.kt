/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EGL14 = "EGL14".nativeClassEGL("EGL14", postfix = "") {
    extends = EGL13
    documentation =
        "The core EGL 1.4 functionality."

    IntConstant(
        "",

        "MULTISAMPLE_RESOLVE_BOX_BIT"..0x0200,
        "MULTISAMPLE_RESOLVE"..0x3099,
        "MULTISAMPLE_RESOLVE_DEFAULT"..0x309A,
        "MULTISAMPLE_RESOLVE_BOX"..0x309B,
        "OPENGL_API"..0x30A2,
        "OPENGL_BIT"..0x0008,
        "SWAP_BEHAVIOR_PRESERVED_BIT"..0x0400
    )

    LongConstant(
        "",

        "DEFAULT_DISPLAY"..0L
    )

    EGLContext(
        "GetCurrentContext",
        ""
    )
}