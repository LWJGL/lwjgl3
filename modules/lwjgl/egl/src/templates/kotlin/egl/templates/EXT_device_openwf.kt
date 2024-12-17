/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_device_openwf = "EXTDeviceOpenWF".nativeClassEGL("EXT_device_openwf", postfix = EXT) {
    IntConstant(
        "OPENWF_DEVICE_ID_EXT"..0x3237,
        "OPENWF_DEVICE_EXT"..0x333D
    )
}

val EXT_output_openwf = "EXTOutputOpenWF".nativeClassEGL("EXT_output_openwf", postfix = EXT) {
    IntConstant(
        "OPENWF_PIPELINE_ID_EXT"..0x3238,
        "OPENWF_PORT_ID_EXT"..0x3239
    )
}