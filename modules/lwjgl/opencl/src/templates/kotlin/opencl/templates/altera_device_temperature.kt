/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val altera_device_temperature = "ALTERADeviceTemperature".nativeClassCL("altera_device_temperature", ALTERA) {
    IntConstant(
        "DEVICE_CORE_TEMPERATURE_ALTERA"..0x40F3
    )
}