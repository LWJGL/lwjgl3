/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_subgroups = "KHRSubgroups".nativeClassCL("khr_subgroups", KHR) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension adds support for implementation-controlled groups of work items, known as subgroups. Subgroups behave similarly to work groups and have
        their own sets of built-ins and synchronization primitives. Subgroups within a work group are independent, may make forward progress with respect to
        each other, and may map to optimized hardware structures where that makes sense.

        Subgroups were promoted to a core feature in OpenCL 2.1, however note that:
        ${ul(
            "The subgroup OpenCL C built-in functions described by this extension must still be accessed as an OpenCL C extension in OpenCL 2.1.",
            "Subgroup independent forward progress is an optional device property in OpenCL 2.1, see #DEVICE_SUB_GROUP_INDEPENDENT_FORWARD_PROGRESS."
        )}
        """

    val KernalSubGroupInfo = IntConstant(
        "Accepted as the {@code param_name} parameter of #GetKernelSubGroupInfoKHR().",

        "KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE_KHR"..0x2033,
        "KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE_KHR"..0x2034
    ).javaDocLinks

    cl_int(
        "GetKernelSubGroupInfoKHR",
        "Returns information about a kernel object.",

        cl_kernel("kernel", "the kernel object being queried"),
        nullable..cl_device_id(
            "device",
            """
            identifies a specific device in the list of devices associated with {@code kernel}. The list of devices is the list of devices in the OpenCL
            context that is associated with {@code kernel}. If the list of devices associated with {@code kernel} is a single device, {@code device} can be a
            #NULL value.
            """
        ),
        cl_kernel_sub_group_info("param_name", "specifies the information to query", KernalSubGroupInfo),
        AutoSize("input_value")..size_t(
            "input_value_size",
            "specifies the size in bytes of memory pointed to by {@code input_value}. This size must be equal to the size of the input type."
        ),
        void.const.p(
            "input_value",
            "a pointer to memory where the appropriate parameterization of the query is passed from. If {@code input_value} is #NULL it is ignored."
        ),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_POINTER)..nullable..void.p("param_value", param_value),
        PARAM_VALUE_SIZE_RET
    )
}