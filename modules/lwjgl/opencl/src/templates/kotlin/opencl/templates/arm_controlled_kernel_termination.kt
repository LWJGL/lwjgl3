/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val arm_controlled_kernel_termination = "ARMControlledKernelTermination".nativeClassCL("arm_controlled_kernel_termination", ARM) {
    IntConstant(
        "COMMAND_TERMINATED_ITSELF_WITH_FAILURE_ARM".."-1108"
    )

    IntConstant(
        "DEVICE_CONTROLLED_TERMINATION_CAPABILITIES_ARM"..0x41EE
    )

    IntConstant(
        "DEVICE_CONTROLLED_TERMINATION_SUCCESS_ARM".."(1 << 0)",
        "DEVICE_CONTROLLED_TERMINATION_FAILURE_ARM".."(1 << 1)",
        "DEVICE_CONTROLLED_TERMINATION_QUERY_ARM".."(1 << 2)"
    )

    IntConstant(
        "EVENT_COMMAND_TERMINATION_REASON_ARM"..0x41ED
    )

    IntConstant(
        "COMMAND_TERMINATION_COMPLETION_ARM".."0",
        "COMMAND_TERMINATION_CONTROLLED_SUCCESS_ARM".."1",
        "COMMAND_TERMINATION_CONTROLLED_FAILURE_ARM".."2",
        "COMMAND_TERMINATION_ERROR_ARM".."3",
    )
}
