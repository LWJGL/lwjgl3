/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_subgroups = "INTELSubgroups".nativeClassCL("intel_subgroups", INTEL) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        The goal of this extension is to allow programmers to improve the performance of their applications by taking advantage of the fact that some work
        items in a work group execute together as a group (a "subgroup"), and that work items in a subgroup can take advantage of hardware features that are
        not available to work items in a work group. Specifically, this extension is designed to allow work items in a subgroup to share data without the use
        of local memory and work group barriers, and to utilize specialized hardware to load and store blocks of data.

        There is a large amount of overlap between the functionality in this extension and the functionality in the Khronos OpenCL 2.0 "cl_khr_subgroups"
        extension, so this extension reuses many of the names, concepts, and functions already described in the cl_khr_subgroups extension. The key differences
        between the Intel subgroups extension and the Khronos subgroups extension are:
        ${ul(
            "The Khronos subgroups extension requires OpenCL 2.0, but the Intel subgroups extension may be available on OpenCL 1.2 devices.",
            """
            The Khronos subgroups extension guarantees that subgroups in a work group will make independent forward progress, but the Intel extension does not
            guarantee that subgroups in a work group will make independent forward progress.
            """,
            """
            The Intel extension adds a rich set of subgroup "shuffle" functions to allow work items within a work group to interchange data without the use of
            local memory and work group barriers.
            """,
            """
            The Intel extension adds a set of subgroup "block read and write" functions to take advantage of specialized hardware to read or write blocks of
            data from or to buffers or images.
            """,
            "The Intel subgroups extension does not include the subgroup pipes functions that are included as part of the Khronos subgroups extension.",
            """
            The Intel subgroups extension does not include the device-side kernel query functions for subgroups that are included as part of the Khronos
            subgroups extension.
            """
        )}
        Requires ${CL12.link}.
        """

    IntConstant(
        "Accepted as the {@code param_name} parameter of #GetKernelSubGroupInfoKHR().",

        "KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE_KHR"..0x2033,
        "KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE_KHR"..0x2034
    )
}