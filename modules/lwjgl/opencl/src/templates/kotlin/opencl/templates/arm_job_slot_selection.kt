/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val arm_job_slot_selection = "ARMJobSlotSelection".nativeClassCL("arm_job_slot_selection", ARM) {
    IntConstant(
        "DEVICE_JOB_SLOTS_ARM"..0x41E0
    )
}
