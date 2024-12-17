/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val amd_device_board_name = "AMDDeviceBoardName".nativeClassCL("amd_device_board_name", AMD) {
    IntConstant(
        "DEVICE_BOARD_NAME_AMD"..0x4038
    )
}