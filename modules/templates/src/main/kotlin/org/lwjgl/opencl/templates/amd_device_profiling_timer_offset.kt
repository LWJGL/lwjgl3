/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val amd_device_profiling_timer_offset = "AMDDeviceProfilingTimerOffset".nativeClassCL("amd_device_profiling_timer_offset", AMD) {
    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "Accepted as the {@code param_name} parameter of #GetDeviceInfo(). Returns the offset in nanoseconds between event timestamps.",

        "DEVICE_PROFILING_TIMER_OFFSET_AMD"..0x4036
    )
}