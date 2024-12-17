/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_device_base = "EXTDeviceBase".nativeClassEGL("EXT_device_base", postfix = EXT) {
    IntConstant(
        "BAD_DEVICE_EXT"..0x322B,
        "DEVICE_EXT"..0x322C
    )

    LongConstant(
        "NO_DEVICE_EXT"..0L
    )

    reuse(EXT_device_query, "QueryDeviceAttribEXT")
    reuse(EXT_device_query, "QueryDeviceStringEXT")
    reuse(EXT_device_query, "QueryDisplayAttribEXT")
    reuse(EXT_device_enumeration, "QueryDevicesEXT")
}