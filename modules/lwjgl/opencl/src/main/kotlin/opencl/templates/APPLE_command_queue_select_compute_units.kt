/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val APPLE_command_queue_select_compute_units = "APPLECommandQueueSelectComputeUnits".nativeClassCL("APPLE_command_queue_select_compute_units", APPLE) {
    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "",

        "QUEUE_NUM_COMPUTE_UNITS_APPLE"..0x10000014
    )


    APPLE_command_queue_priority reuse "CreateCommandQueueWithPropertiesAPPLE"
}