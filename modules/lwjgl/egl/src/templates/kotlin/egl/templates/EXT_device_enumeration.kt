/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_device_enumeration = "EXTDeviceEnumeration".nativeClassEGL("EXT_device_enumeration", postfix = EXT) {
    EGLBoolean(
        "QueryDevicesEXT",

        AutoSize("devices")..EGLint("max_devices"),
        nullable..EGLDeviceEXT.p("devices"),
        Check(1)..EGLint.p("num_devices")
    )
}