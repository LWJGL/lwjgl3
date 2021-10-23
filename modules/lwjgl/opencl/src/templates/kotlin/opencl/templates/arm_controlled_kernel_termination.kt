/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val arm_controlled_kernel_termination = "ARMControlledKernelTermination".nativeClassCL("arm_controlled_kernel_termination", ARM) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension enables the controlled termination of kernels using a built-in function.
        
        It also enables the termination reason to be queried on devices that support it. This makes it possible to end the execution of a successful search
        kernel early or implement assert-like functionality using {@code printf}.
        """

    IntConstant(
        "Error code to indicate kernel terminated with failure.",

        "COMMAND_TERMINATED_ITSELF_WITH_FAILURE_ARM".."-1108"
    )

    IntConstant(
        "Accepted value for the {@code param_name} parameter to #GetDeviceInfo().",

        "DEVICE_CONTROLLED_TERMINATION_CAPABILITIES_ARM"..0x41EE
    )

    IntConstant(
        "Bit fields for controlled termination feature query.",

        "DEVICE_CONTROLLED_TERMINATION_SUCCESS_ARM".."(1 << 0)",
        "DEVICE_CONTROLLED_TERMINATION_FAILURE_ARM".."(1 << 1)",
        "DEVICE_CONTROLLED_TERMINATION_QUERY_ARM".."(1 << 2)"
    )

    IntConstant(
        "Accepted value for the {@code param_name} parameter to #GetEventInfo().",

        "EVENT_COMMAND_TERMINATION_REASON_ARM"..0x41ED
    )

    IntConstant(
        "Values returned for event termination reason query.",

        "COMMAND_TERMINATION_COMPLETION_ARM".."0",
        "COMMAND_TERMINATION_CONTROLLED_SUCCESS_ARM".."1",
        "COMMAND_TERMINATION_CONTROLLED_FAILURE_ARM".."2",
        "COMMAND_TERMINATION_ERROR_ARM".."3",
    )
}
