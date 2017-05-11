/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_platform_base = "EXTPlatformBase".nativeClassEGL("EXT_platform_base", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines functionality and behavior for EGL implementations that support multiple platforms at runtime. For example, on Linux an EGL
        implementation could support X11, Wayland, GBM (Generic Buffer Manager), Surface Flinger, and perhaps other platforms.

        In particular, this extension defines the following:
        ${ol(
            "A mechanism by which an EGL client can detect which platforms the EGL implementation supports.",
            """
            New functions that enable an EGL client to specify to which platform a native resource belongs when creating an EGL resource from that native
            resource. For example, this extension enables an EGL client to specify, when creating an EGLSurface from a native window, that the window belongs
            to X11.
            """,
            """
            That an EGL client is not restricted to interacting with a single platform per process. A client process can create and manage EGL resources from
            multiple platforms.
            """
        )}
        The generic term 'platform' is used throughout this extension specification rather than 'window system' because not all EGL platforms are window
        systems. In particular, those platforms that allow headless rendering without a display server, such as GBM, are not window systems.

        This extension does not specify behavior specific to any platform, nor does it specify the set of platforms that an EGL implementation may support.
        Platform-specific details lie outside this extension's scope and are instead described by extensions layered atop this one.

        Requires ${EGL14.core} and ${registryLink("EXT", "EGL_EXT_client_extensions")} to query its existence without a display.
        """

    EGLDisplay(
        "GetPlatformDisplayEXT",
        "",

        EGLenum.IN("platform", ""),
        opaque_p.IN("native_display", ""),
        nullable..noneTerminated..const..EGLint_p.IN("attrib_list", "")
    )

    EGLSurface(
        "CreatePlatformWindowSurfaceEXT",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLConfig.IN("config", ""),
        opaque_p.IN("native_window", ""),
        nullable..noneTerminated..const..EGLint_p.IN("attrib_list", "")
    )

    EGLSurface(
        "CreatePlatformPixmapSurfaceEXT",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLConfig.IN("config", ""),
        opaque_p.IN("native_pixmap", ""),
        nullable..noneTerminated..const..EGLint_p.IN("attrib_list", "")
    )
}