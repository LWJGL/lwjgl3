/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EGL10 = "EGL10".nativeClassEGL("EGL10", postfix = "") {
    documentation =
        "The core EGL 1.0 functionality."

    IntConstant(
        "",

        "ALPHA_SIZE"..0x3021,
        "BAD_ACCESS"..0x3002,
        "BAD_ALLOC"..0x3003,
        "BAD_ATTRIBUTE"..0x3004,
        "BAD_CONFIG"..0x3005,
        "BAD_CONTEXT"..0x3006,
        "BAD_CURRENT_SURFACE"..0x3007,
        "BAD_DISPLAY"..0x3008,
        "BAD_MATCH"..0x3009,
        "BAD_NATIVE_PIXMAP"..0x300A,
        "BAD_NATIVE_WINDOW"..0x300B,
        "BAD_PARAMETER"..0x300C,
        "BAD_SURFACE"..0x300D,
        "BLUE_SIZE"..0x3022,
        "BUFFER_SIZE"..0x3020,
        "CONFIG_CAVEAT"..0x3027,
        "CONFIG_ID"..0x3028,
        "CORE_NATIVE_ENGINE"..0x305B,
        "DEPTH_SIZE"..0x3025,
        "DONT_CARE".."-1",
        "DRAW"..0x3059,
        "EXTENSIONS"..0x3055,
        "FALSE".."0",
        "GREEN_SIZE"..0x3023,
        "HEIGHT"..0x3056,
        "LARGEST_PBUFFER"..0x3058,
        "LEVEL"..0x3029,
        "MAX_PBUFFER_HEIGHT"..0x302A,
        "MAX_PBUFFER_PIXELS"..0x302B,
        "MAX_PBUFFER_WIDTH"..0x302C,
        "NATIVE_RENDERABLE"..0x302D,
        "NATIVE_VISUAL_ID"..0x302E,
        "NATIVE_VISUAL_TYPE"..0x302F,
        "NONE"..0x3038,
        "NON_CONFORMANT_CONFIG"..0x3051,
        "NOT_INITIALIZED"..0x3001,
        "PBUFFER_BIT"..0x0001,
        "PIXMAP_BIT"..0x0002,
        "READ"..0x305A,
        "RED_SIZE"..0x3024,
        "SAMPLES"..0x3031,
        "SAMPLE_BUFFERS"..0x3032,
        "SLOW_CONFIG"..0x3050,
        "STENCIL_SIZE"..0x3026,
        "SUCCESS"..0x3000,
        "SURFACE_TYPE"..0x3033,
        "TRANSPARENT_BLUE_VALUE"..0x3035,
        "TRANSPARENT_GREEN_VALUE"..0x3036,
        "TRANSPARENT_RED_VALUE"..0x3037,
        "TRANSPARENT_RGB"..0x3052,
        "TRANSPARENT_TYPE"..0x3034,
        "TRUE".."1",
        "VENDOR"..0x3053,
        "VERSION"..0x3054,
        "WIDTH"..0x3057,
        "WINDOW_BIT"..0x0004
    )

    LongConstant(
        "Null values.",

        "NO_CONTEXT"..0L,
        "NO_DISPLAY"..0L,
        "NO_SURFACE"..0L
    )

    EGLBoolean(
        "ChooseConfig",
        "",

        EGLDisplay("dpy", ""),
        nullable..noneTerminated..EGLint.const.p("attrib_list", ""),
        nullable..EGLConfig.p("configs", ""),
        AutoSize("configs")..EGLint("config_size", ""),
        Check(1)..EGLint.p("num_config", "")
    )

    EGLBoolean(
        "CopyBuffers",
        "",

        EGLDisplay("dpy", ""),
        EGLSurface("surface", ""),
        EGLNativePixmapType("target", "")
    )

    EGLContext(
        "CreateContext",
        "",

        EGLDisplay("dpy", ""),
        EGLConfig("config", ""),
        nullable..EGLContext("share_context", ""),
        nullable..noneTerminated..EGLint.const.p("attrib_list", "")
    )

    EGLSurface(
        "CreatePbufferSurface",
        "",

        EGLDisplay("dpy", ""),
        EGLConfig("config", ""),
        nullable..noneTerminated..EGLint.const.p("attrib_list", "")
    )

    EGLSurface(
        "CreatePixmapSurface",
        "",

        EGLDisplay("dpy", ""),
        EGLConfig("config", ""),
        EGLNativePixmapType("pixmap", ""),
        nullable..noneTerminated..EGLint.const.p("attrib_list", "")
    )

    EGLSurface(
        "CreateWindowSurface",
        "",

        EGLDisplay("dpy", ""),
        EGLConfig("config", ""),
        EGLNativeWindowType("win", ""),
        nullable..noneTerminated..EGLint.const.p("attrib_list", "")
    )

    EGLBoolean(
        "DestroyContext",
        "",

        EGLDisplay("dpy", ""),
        EGLContext("ctx", "")
    )

    EGLBoolean(
        "DestroySurface",
        "",

        EGLDisplay("dpy", ""),
        EGLSurface("surface", "")
    )

    EGLBoolean(
        "GetConfigAttrib",
        "",

        EGLDisplay("dpy", ""),
        EGLConfig("config", ""),
        EGLint("attribute", ""),
        Check(1)..EGLint.p("value", "")
    )

    EGLBoolean(
        "GetConfigs",
        "",

        EGLDisplay("dpy", ""),
        nullable..EGLConfig.p("configs", ""),
        AutoSize("configs")..EGLint("config_size", ""),
        Check(1)..EGLint.p("num_config", "")
    )

    EGLDisplay("GetCurrentDisplay", "", void())

    EGLSurface(
        "GetCurrentSurface",
        "",

        EGLint("readdraw", "")
    )

    EGLDisplay(
        "GetDisplay",
        "",

        nullable..EGLNativeDisplayType("display_id", "")
    )

    EGLint("GetError", "", void())

    __eglMustCastToProperFunctionPointerType(
        "GetProcAddress",
        "",

        charASCII.const.p("procname", "")
    )

    EGLBoolean(
        "Initialize",
        "",

        EGLDisplay("dpy", ""),
        nullable..Check(1)..EGLint.p("major", ""),
        nullable..Check(1)..EGLint.p("minor", "")
    )

    EGLBoolean(
        "MakeCurrent",
        "",

        EGLDisplay("dpy", ""),
        nullable..EGLSurface("draw", ""),
        nullable..EGLSurface("read", ""),
        nullable..EGLContext("ctx", "")
    )

    EGLBoolean(
        "QueryContext",
        "",

        EGLDisplay("dpy", ""),
        EGLContext("ctx", ""),
        EGLint("attribute", ""),
        Check(1)..EGLint.p("value", "")
    )

    charASCII.p(
        "QueryString",
        "",

        nullable..EGLDisplay("dpy", ""),
        EGLint("name", "")
    )

    EGLBoolean(
        "QuerySurface",
        "",

        EGLDisplay("dpy", ""),
        EGLSurface("surface", ""),
        EGLint("attribute", ""),
        Check(1)..EGLint.p("value", "")
    )

    EGLBoolean(
        "SwapBuffers",
        "",

        EGLDisplay("dpy", ""),
        EGLSurface("surface", "")
    )

    EGLBoolean(
        "Terminate",
        "",

        EGLDisplay("dpy", "")
    )

    EGLBoolean("WaitGL", "", void())

    EGLBoolean(
        "WaitNative",
        "",

        EGLint("engine", "")
    )
}