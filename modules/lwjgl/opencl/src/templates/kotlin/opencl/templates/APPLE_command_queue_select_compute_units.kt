/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val APPLE_command_queue_select_compute_units = "APPLECommandQueueSelectComputeUnits".nativeClassCL("APPLE_command_queue_select_compute_units", APPLE) {
    IntConstant(
        "QUEUE_NUM_COMPUTE_UNITS_APPLE"..0x10000014
    )


    reuse(APPLE_command_queue_priority, "CreateCommandQueueWithPropertiesAPPLE")
}