/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_kernel_clock = "KHRKernelClock".nativeClassCL("khr_kernel_clock", KHR) {
    IntConstant(
        "DEVICE_KERNEL_CLOCK_CAPABILITIES_KHR"..0x1076
    )

    IntConstant(
        "DEVICE_KERNEL_CLOCK_SCOPE_DEVICE_KHR".."1 << 0",
        "DEVICE_KERNEL_CLOCK_SCOPE_WORK_GROUP_KHR".."1 << 1",
        "DEVICE_KERNEL_CLOCK_SCOPE_SUB_GROUP_KHR".."1 << 2"
    )
}