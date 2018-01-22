/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_device_base = "EXTDeviceBase".nativeClassEGL("EXT_device_base", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
        windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
        native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
        solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
        without the use of any underlying "native" APIs or functionality.

        This extension defines the first step of this bootstrapping process: Device enumeration.
        """

    IntConstant(
        "",

        "BAD_DEVICE_EXT"..0x322B,
        "DEVICE_EXT"..0x322C
    )

    LongConstant(
        "",

        "NO_DEVICE_EXT"..0L
    )

    EXT_device_query reuse "QueryDeviceAttribEXT"
    EXT_device_query reuse "QueryDeviceStringEXT"
    EXT_device_query reuse "QueryDisplayAttribEXT"
    EXT_device_enumeration reuse "QueryDevicesEXT"
}