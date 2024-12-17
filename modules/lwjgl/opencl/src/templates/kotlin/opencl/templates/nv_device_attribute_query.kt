/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val nv_device_attribute_query = "NVDeviceAttributeQuery".nativeClassCL("nv_device_attribute_query", NV) {

    IntConstant(
        "DEVICE_COMPUTE_CAPABILITY_MAJOR_NV"..0x4000
    )

    IntConstant(
        "DEVICE_COMPUTE_CAPABILITY_MINOR_NV"..0x4001
    )

    IntConstant(
        "DEVICE_REGISTERS_PER_BLOCK_NV"..0x4002
    )

    IntConstant(
        "DEVICE_WARP_SIZE_NV"..0x4003
    )

    IntConstant(
        "DEVICE_GPU_OVERLAP_NV"..0x4004
    )

    IntConstant(
        "DEVICE_KERNEL_EXEC_TIMEOUT_NV"..0x4005
    )

    IntConstant(
        "DEVICE_INTEGRATED_MEMORY_NV"..0x4006
    )

}