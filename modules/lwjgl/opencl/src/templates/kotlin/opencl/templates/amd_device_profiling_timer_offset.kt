/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val amd_device_profiling_timer_offset = "AMDDeviceProfilingTimerOffset".nativeClassCL("amd_device_profiling_timer_offset", AMD) {
    IntConstant(
        "DEVICE_PROFILING_TIMER_OFFSET_AMD"..0x4036
    )
}