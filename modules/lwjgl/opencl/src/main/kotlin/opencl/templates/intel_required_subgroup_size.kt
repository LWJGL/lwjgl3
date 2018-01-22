/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val intel_required_subgroup_size = "INTELRequiredSubgroupSize".nativeClassCL("intel_required_subgroup_size", INTEL) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        The goal of this extension is to allow programmers to optionally specify the required subgroup size for a kernel function. This information is
        important for the correctness of many subgroup algorithms, and in some cases may be used by the compiler to generate more optimal code.

        Requires ${CL21.link} or ${intel_subgroups.link}.
        """

    IntConstant(
        "Accepted as the {@code param_name} parameter of #GetDeviceInfo().",

        "DEVICE_SUB_GROUP_SIZES_INTEL"..0x4108
    )

    IntConstant(
        "Accepted as the {@code param_name} parameter of #GetKernelWorkGroupInfo().",

        "KERNEL_SPILL_MEM_SIZE_INTEL"..0x4109
    )

    IntConstant(
        "Accepted as the {@code param_name} parameter of #GetKernelSubGroupInfo() and/or #GetKernelSubGroupInfoKHR().",

        "KERNEL_COMPILE_SUB_GROUP_SIZE_INTEL"..0x410A
    )
}