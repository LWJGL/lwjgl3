/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EGL12 = "EGL12".nativeClassEGL("EGL12", postfix = "") {
    extends = EGL11
    documentation =
        "The core EGL 1.2 functionality."

    IntConstant(
        "",

        "ALPHA_FORMAT"..0x3088,
        "ALPHA_FORMAT_NONPRE"..0x308B,
        "ALPHA_FORMAT_PRE"..0x308C,
        "ALPHA_MASK_SIZE"..0x303E,
        "BUFFER_PRESERVED"..0x3094,
        "BUFFER_DESTROYED"..0x3095,
        "CLIENT_APIS"..0x308D,
        "COLORSPACE"..0x3087,
        "COLORSPACE_sRGB"..0x3089,
        "COLORSPACE_LINEAR"..0x308A,
        "COLOR_BUFFER_TYPE"..0x303F,
        "CONTEXT_CLIENT_TYPE"..0x3097,
        "DISPLAY_SCALING".."10000",
        "HORIZONTAL_RESOLUTION"..0x3090,
        "LUMINANCE_BUFFER"..0x308F,
        "LUMINANCE_SIZE"..0x303D,
        "OPENGL_ES_BIT"..0x0001,
        "OPENVG_BIT"..0x0002,
        "OPENGL_ES_API"..0x30A0,
        "OPENVG_API"..0x30A1,
        "OPENVG_IMAGE"..0x3096,
        "PIXEL_ASPECT_RATIO"..0x3092,
        "RENDERABLE_TYPE"..0x3040,
        "RENDER_BUFFER"..0x3086,
        "RGB_BUFFER"..0x308E,
        "SINGLE_BUFFER"..0x3085,
        "SWAP_BEHAVIOR"..0x3093,
        "UNKNOWN".."-1",
        "VERTICAL_RESOLUTION"..0x3091
    )

    EGLBoolean(
        "BindAPI",
        "",

        EGLenum.IN("api", "")
    )

    EGLenum(
        "QueryAPI",
        ""
    )

    EGLSurface(
        "CreatePbufferFromClientBuffer",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLenum.IN("buftype", ""),
        EGLClientBuffer.IN("buffer", ""),
        EGLConfig.IN("config", ""),
        nullable..noneTerminated..EGLint.const.p.IN("attrib_list", "")
    )

    EGLBoolean(
        "ReleaseThread",
        ""
    )

    EGLBoolean(
        "WaitClient",
        ""
    )
}