/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_device_persistent_id = "EXTDevicePersistentID".nativeClassEGL("EXT_device_persistent_id", postfix = EXT) {
    IntConstant(
        "DRIVER_NAME_EXT"..0x335E
    )

    IntConstant(
        "DEVICE_UUID_EXT"..0x335C,
        "DRIVER_UUID_EXT"..0x335D
    )

    EGLBoolean(
        "QueryDeviceBinaryEXT",

        EGLDeviceEXT("device"),
        EGLint("name"),
        AutoSize("value")..EGLint("max_size"),
        nullable..void.p("value"),
        Check(1)..EGLint.p("size")
    )
}