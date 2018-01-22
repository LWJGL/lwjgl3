/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_platform_device = "EXTPlatformDevice".nativeClassEGL("EXT_platform_device", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
        windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
        native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
        solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
        without the use of any underlying "native" APIs or functionality.

        This extension defines a method to create an EGLDisplay from an EGLDeviceEXT by treating the EGLDeviceEXT as an EGLNativeDisplay object.

        Requires ${EXT_device_base.link} and ${EXT_platform_base.link} or ${EGL15.core}.
        """

    IntConstant(
        "",

        "PLATFORM_DEVICE_EXT"..0x313F
    )
}