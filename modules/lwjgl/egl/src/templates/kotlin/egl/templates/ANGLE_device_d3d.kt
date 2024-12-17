/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ANGLE_device_d3d = "ANGLEDeviceD3D".nativeClassEGL("ANGLE_device_d3d", postfix = ANGLE) {
    IntConstant(
        "D3D9_DEVICE_ANGLE"..0x33A0,
        "D3D11_DEVICE_ANGLE"..0x33A1
    )
}