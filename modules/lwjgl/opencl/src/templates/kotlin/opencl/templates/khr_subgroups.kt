/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_subgroups = "KHRSubgroups".nativeClassCL("khr_subgroups", KHR) {
    IntConstant(
        "KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE_KHR"..0x2033,
        "KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE_KHR"..0x2034
    )

    cl_int(
        "GetKernelSubGroupInfoKHR",

        cl_kernel("kernel"),
        nullable..cl_device_id("device"),
        cl_kernel_sub_group_info("param_name"),
        AutoSize("input_value")..size_t("input_value_size"),
        void.const.p("input_value"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_POINTER)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )
}