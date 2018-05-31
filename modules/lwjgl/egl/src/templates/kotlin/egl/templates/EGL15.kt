/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EGL15 = "EGL15".nativeClassEGL("EGL15", postfix = "") {
    extends = EGL14
    documentation =
        "The core EGL 1.5 functionality."

    IntConstant(
        "",

        "CONTEXT_MAJOR_VERSION"..0x3098,
        "CONTEXT_MINOR_VERSION"..0x30FB,
        "CONTEXT_OPENGL_PROFILE_MASK"..0x30FD,
        "CONTEXT_OPENGL_RESET_NOTIFICATION_STRATEGY"..0x31BD,
        "NO_RESET_NOTIFICATION"..0x31BE,
        "LOSE_CONTEXT_ON_RESET"..0x31BF,
        "CONTEXT_OPENGL_CORE_PROFILE_BIT"..0x00000001,
        "CONTEXT_OPENGL_COMPATIBILITY_PROFILE_BIT"..0x00000002,
        "CONTEXT_OPENGL_DEBUG"..0x31B0,
        "CONTEXT_OPENGL_FORWARD_COMPATIBLE"..0x31B1,
        "CONTEXT_OPENGL_ROBUST_ACCESS"..0x31B2,
        "OPENGL_ES3_BIT"..0x00000040,
        "CL_EVENT_HANDLE"..0x309C,
        "SYNC_CL_EVENT"..0x30FE,
        "SYNC_CL_EVENT_COMPLETE"..0x30FF,
        "SYNC_PRIOR_COMMANDS_COMPLETE"..0x30F0,
        "SYNC_TYPE"..0x30F7,
        "SYNC_STATUS"..0x30F1,
        "SYNC_CONDITION"..0x30F8,
        "SIGNALED"..0x30F2,
        "UNSIGNALED"..0x30F3,
        "SYNC_FLUSH_COMMANDS_BIT"..0x0001,
        "TIMEOUT_EXPIRED"..0x30F5,
        "CONDITION_SATISFIED"..0x30F6,
        "SYNC_FENCE"..0x30F9,
        "GL_COLORSPACE"..0x309D,
        "GL_COLORSPACE_SRGB"..0x3089,
        "GL_COLORSPACE_LINEAR"..0x308A,
        "GL_RENDERBUFFER"..0x30B9,
        "GL_TEXTURE_2D"..0x30B1,
        "GL_TEXTURE_LEVEL"..0x30BC,
        "GL_TEXTURE_3D"..0x30B2,
        "GL_TEXTURE_ZOFFSET"..0x30BD,
        "GL_TEXTURE_CUBE_MAP_POSITIVE_X"..0x30B3,
        "GL_TEXTURE_CUBE_MAP_NEGATIVE_X"..0x30B4,
        "GL_TEXTURE_CUBE_MAP_POSITIVE_Y"..0x30B5,
        "GL_TEXTURE_CUBE_MAP_NEGATIVE_Y"..0x30B6,
        "GL_TEXTURE_CUBE_MAP_POSITIVE_Z"..0x30B7,
        "GL_TEXTURE_CUBE_MAP_NEGATIVE_Z"..0x30B8,
        "IMAGE_PRESERVED"..0x30D2
    )

    LongConstant(
        "",

        "FOREVER".."0xFFFFFFFFFFFFFFFFL",
        "NO_SYNC"..0L,
        "NO_IMAGE"..0L
    )

    EGLSync(
        "CreateSync",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLenum.IN("type", ""),
        noneTerminated..EGLAttrib.const.p.IN("attrib_list", "")
    )

    EGLBoolean(
        "DestroySync",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSync.IN("sync", "")
    )

    EGLint(
        "ClientWaitSync",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSync.IN("sync", ""),
        EGLint.IN("flags", ""),
        EGLTime.IN("timeout", "")
    )

    EGLBoolean(
        "GetSyncAttrib",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSync.IN("sync", ""),
        EGLint.IN("attribute", ""),
        Check(1)..EGLAttrib.const.p.OUT("value", "")
    )

    EGLImage(
        "CreateImage",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLContext.IN("ctx", ""),
        EGLenum.IN("target", ""),
        EGLClientBuffer.IN("buffer", ""),
        nullable..noneTerminated..EGLAttrib.const.p.IN("attrib_list", "")
    )

    EGLBoolean(
        "DestroyImage",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLImage.IN("image", "")
    )

    EGLDisplay(
        "GetPlatformDisplay",
        "",

        EGLenum.IN("platform", ""),
        opaque_p.IN("native_display", ""),
        nullable..noneTerminated..EGLAttrib.const.p.IN("attrib_list", "")
    )

    EGLSurface(
        "CreatePlatformWindowSurface",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLConfig.IN("config", ""),
        opaque_p.IN("native_window", ""),
        nullable..noneTerminated..EGLAttrib.const.p.IN("attrib_list", "")
    )

    EGLSurface(
        "CreatePlatformPixmapSurface",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLConfig.IN("config", ""),
        opaque_p.IN("native_pixmap", ""),
        nullable..noneTerminated..EGLAttrib.const.p.IN("attrib_list", "")
    )

    EGLBoolean(
        "WaitSync",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSync.IN("sync", ""),
        EGLint.IN("flags", "")
    )
}