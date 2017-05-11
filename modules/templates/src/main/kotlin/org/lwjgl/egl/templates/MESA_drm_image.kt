/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val MESA_drm_image = "MESADRMImage".nativeClassEGL("MESA_drm_image", postfix = MESA) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides entry points for integrating EGLImage with the Linux DRM mode setting and memory management drivers. The extension lets
        applications create EGLImages without a client API resource and lets the application get the DRM buffer handles.

        Requires ${EGL14.core} and ${KHR_image_base.link}.
        """

    IntConstant(
        "",

        "DRM_BUFFER_FORMAT_MESA"..0x31D0,
        "DRM_BUFFER_USE_MESA"..0x31D1,
        "DRM_BUFFER_FORMAT_ARGB32_MESA"..0x31D2,
        "DRM_BUFFER_MESA"..0x31D3,
        "DRM_BUFFER_STRIDE_MESA"..0x31D4,
        "DRM_BUFFER_USE_SCANOUT_MESA"..0x00000001,
        "DRM_BUFFER_USE_SHARE_MESA"..0x00000002
    )

    EGLImageKHR(
        "CreateDRMImageMESA",
        "",

        EGLDisplay.IN("dpy", ""),
        nullable..noneTerminated..const..EGLint_p.IN("attrib_list", "")
    )

    EGLBoolean(
        "ExportDRMImageMESA",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLImageKHR.IN("image", ""),
        nullable..Check(1)..EGLint_p.OUT("name", ""),
        nullable..Check(1)..EGLint_p.OUT("handle", ""),
        nullable..Check(1)..EGLint_p.OUT("stride", "")
    )
}