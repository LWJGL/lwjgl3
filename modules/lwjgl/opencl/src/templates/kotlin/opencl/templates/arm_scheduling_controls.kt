/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val arm_scheduling_controls = "ARMSchedulingControls".nativeClassCL("arm_scheduling_controls", ARM) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension gives applications explicit control over some aspects of work scheduling. It can be used for performance tuning or debugging.

        Requires {@link CL20 OpenCL 2.0}.
        """

    IntConstant(
        """
        Accepted value for the {@code param_name} parameter to #GetDeviceInfo().

        Returns a {@code bitfield} of the scheduling controls this device supports:
        ${ul(
            "#DEVICE_SCHEDULING_KERNEL_BATCHING_ARM is set when the device supports #QUEUE_KERNEL_BATCHING_ARM.",
            "#DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_ARM is set when the device supports #KERNEL_EXEC_INFO_WORKGROUP_BATCH_SIZE_ARM.",
            "#DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_MODIFIER_ARM is set when the device supports #KERNEL_EXEC_INFO_WORKGROUP_BATCH_SIZE_MODIFIER_ARM."
        )}
        """,

        "DEVICE_SCHEDULING_CONTROLS_CAPABILITIES_ARM"..0x41E4
    )

    IntConstant(
        "Bits of the {@code bitfield} returned by the #DEVICE_SCHEDULING_CONTROLS_CAPABILITIES_ARM query.",

        "DEVICE_SCHEDULING_KERNEL_BATCHING_ARM".."(1 << 0)",
        "DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_ARM".."(1 << 1)",
        "DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_MODIFIER_ARM".."(1 << 2)",
        "DEVICE_SCHEDULING_DEFERRED_FLUSH_ARM".."(1 << 3)",
        "DEVICE_SCHEDULING_REGISTER_ALLOCATION_ARM".."(1 << 4)",
        "DEVICE_SCHEDULING_WARP_THROTTLING_ARM".."(1 << 5)",
        "DEVICE_SCHEDULING_COMPUTE_UNIT_BATCH_QUEUE_SIZE_ARM".."(1 << 6)",
        "DEVICE_SCHEDULING_COMPUTE_UNIT_LIMIT_ARM".."(1 << 7)"
    )

    IntConstant(
        "Accepted value for the {@code param_name} parameter to #GetDeviceInfo().",

        "DEVICE_SUPPORTED_REGISTER_ALLOCATIONS_ARM"..0x41EB,
        "DEVICE_MAX_WARP_COUNT_ARM"..0x41EA
    )

    IntConstant(
        "Accepted value for the {@code param_name} parameter to #SetKernelExecInfo().",

        "KERNEL_EXEC_INFO_WORKGROUP_BATCH_SIZE_ARM"..0x41E5,
        "KERNEL_EXEC_INFO_WORKGROUP_BATCH_SIZE_MODIFIER_ARM"..0x41E6,
        "KERNEL_EXEC_INFO_WARP_COUNT_LIMIT_ARM"..0x41E8,
        "KERNEL_EXEC_INFO_COMPUTE_UNIT_MAX_QUEUED_BATCHES_ARM"..0x41F1
    )

    IntConstant(
        "Accepted value for the {@code properties} parameter to #CreateCommandQueueWithProperties().",

        "QUEUE_KERNEL_BATCHING_ARM"..0x41E7,
        "QUEUE_DEFERRED_FLUSH_ARM"..0x41EC,
        "QUEUE_COMPUTE_UNIT_LIMIT_ARM "..0x41F3
    )

    IntConstant(
        "Accepted value for the param_name parameter to #GetKernelInfo().",

        "KERNEL_MAX_WARP_COUNT_ARM"..0x41E9
    )

}
