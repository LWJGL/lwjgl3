/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EGL11 = "EGL11".nativeClassEGL("EGL11", postfix = "") {
    extends = EGL10
    documentation =
        "The core EGL 1.1 functionality."

    IntConstant(
        "",

        "BACK_BUFFER"..0x3084,
        "BIND_TO_TEXTURE_RGB"..0x3039,
        "BIND_TO_TEXTURE_RGBA"..0x303A,
        "CONTEXT_LOST"..0x300E,
        "MIN_SWAP_INTERVAL"..0x303B,
        "MAX_SWAP_INTERVAL"..0x303C,
        "MIPMAP_TEXTURE"..0x3082,
        "MIPMAP_LEVEL"..0x3083,
        "NO_TEXTURE"..0x305C,
        "TEXTURE_2D"..0x305F,
        "TEXTURE_FORMAT"..0x3080,
        "TEXTURE_RGB"..0x305D,
        "TEXTURE_RGBA"..0x305E,
        "TEXTURE_TARGET"..0x3081
    )

    EGLBoolean(
        "BindTexImage",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSurface.IN("surface", ""),
        EGLint.IN("buffer", "")
    )

    EGLBoolean(
        "ReleaseTexImage",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSurface.IN("surface", ""),
        EGLint.IN("buffer", "")
    )

    EGLBoolean(
        "SurfaceAttrib",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSurface.IN("surface", ""),
        EGLint.IN("attribute", ""),
        EGLint.IN("value", "")
    )

    EGLBoolean(
        "SwapInterval",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLint.IN("interval", "")
    )
}