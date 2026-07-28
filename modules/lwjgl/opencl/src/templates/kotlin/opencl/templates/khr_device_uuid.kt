/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_device_uuid = "KHRDeviceUUID".nativeClassCL("khr_device_uuid", KHR) {
    IntConstant(
        "UUID_SIZE_KHR".."16",
        "LUID_SIZE_KHR".."8"
    )

    IntConstant(
        "DEVICE_UUID_KHR"..0x106A,
        "DRIVER_UUID_KHR"..0x106B,
        "DEVICE_LUID_VALID_KHR"..0x106C,
        "DEVICE_LUID_KHR"..0x106D,
        "DEVICE_NODE_MASK_KHR"..0x106E
    )
}