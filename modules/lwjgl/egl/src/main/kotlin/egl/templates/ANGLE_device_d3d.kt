/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val ANGLE_device_d3d = "ANGLEDeviceD3D".nativeClassEGL("ANGLE_device_d3d", postfix = ANGLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        ANGLE has the ability to run GPU commands on a native D3D device. This extension defines a mapping from an EGL device to a D3D device, after it's
        queried from an EGL display.

        Requires ${EXT_device_query.link}.
        """

    IntConstant(
        "",

        "D3D9_DEVICE_ANGLE"..0x33A0,
        "D3D11_DEVICE_ANGLE"..0x33A1
    )
}