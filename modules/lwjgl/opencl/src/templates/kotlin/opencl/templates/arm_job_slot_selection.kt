/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val arm_job_slot_selection = "ARMJobSlotSelection".nativeClassCL("arm_job_slot_selection", ARM) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        On devices that support work submission via job slots, this extension provides a way of selecting the job slot that is used to submit work to the
        device as well as a device info query to obtain a list of usable job slots.
        """

    IntConstant(
        "{@code cl_device_info}",

        "DEVICE_JOB_SLOTS_ARM"..0x41E0
    )
}
