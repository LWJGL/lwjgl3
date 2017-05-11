/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_lock_surface3 = "KHRLockSurface3".nativeClassEGL("KHR_lock_surface3", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows mapping color buffers of EGL surfaces into the client address space. This is useful primarily for software rendering on low-end
        devices which do not support EGL client rendering APIs, although it may be implemented efficiently on more capable devices as well.

        Requires ${EGL14.core}.
        """

    IntConstant(
        "",

        "READ_SURFACE_BIT_KHR"..0x0001,
        "WRITE_SURFACE_BIT_KHR"..0x0002,
        "LOCK_SURFACE_BIT_KHR"..0x0080,
        "OPTIMAL_FORMAT_BIT_KHR"..0x0100,
        "MATCH_FORMAT_KHR"..0x3043,
        "FORMAT_RGB_565_EXACT_KHR"..0x30C0,
        "FORMAT_RGB_565_KHR"..0x30C1,
        "FORMAT_RGBA_8888_EXACT_KHR"..0x30C2,
        "FORMAT_RGBA_8888_KHR"..0x30C3,
        "MAP_PRESERVE_PIXELS_KHR"..0x30C4,
        "LOCK_USAGE_HINT_KHR"..0x30C5,
        "BITMAP_PITCH_KHR"..0x30C7,
        "BITMAP_ORIGIN_KHR"..0x30C8,
        "BITMAP_PIXEL_RED_OFFSET_KHR"..0x30C9,
        "BITMAP_PIXEL_GREEN_OFFSET_KHR"..0x30CA,
        "BITMAP_PIXEL_BLUE_OFFSET_KHR"..0x30CB,
        "BITMAP_PIXEL_ALPHA_OFFSET_KHR"..0x30CC,
        "BITMAP_PIXEL_LUMINANCE_OFFSET_KHR"..0x30CD,
        "BITMAP_PIXEL_SIZE_KHR"..0x3110,
        "BITMAP_POINTER_KHR"..0x30C6,
        "LOWER_LEFT_KHR"..0x30CE,
        "UPPER_LEFT_KHR"..0x30CF
    )

    EGLBoolean(
        "LockSurfaceKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSurface.IN("surface", ""),
        nullable..noneTerminated..const..EGLint_p.IN("attrib_list", "")
    )

    EGLBoolean(
        "UnlockSurfaceKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSurface.IN("surface", "")
    )

    EGLBoolean(
        "QuerySurface64KHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSurface.IN("surface", ""),
        EGLint.IN("attribute", ""),
        Check(1)..EGLAttribKHR_p.OUT("value", "")
    )
}