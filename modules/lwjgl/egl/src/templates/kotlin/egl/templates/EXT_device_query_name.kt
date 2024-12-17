/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_device_query_name = "EXTDeviceQueryName".nativeClassEGL("EXT_device_query_name", postfix = EXT) {
    IntConstant(
        "RENDERER_EXT"..0x335F
    )
}