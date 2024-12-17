/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val CL21 = "CL21".nativeClassCL("CL21") {
    extends = CL20
    IntConstant(
        "VERSION_2_1".."1"
    )

    IntConstant(
        "PLATFORM_HOST_TIMER_RESOLUTION"..0x0905
    )

    IntConstant(
        "DEVICE_IL_VERSION"..0x105B
    )

    IntConstant(
        "DEVICE_MAX_NUM_SUB_GROUPS"..0x105C
    )

    IntConstant(
        "DEVICE_SUB_GROUP_INDEPENDENT_FORWARD_PROGRESS"..0x105D
    )

    IntConstant(
        "QUEUE_DEVICE_DEFAULT"..0x1095
    )

    IntConstant(
        "UNORM_INT_101010_2"..0x10E0
    )

    IntConstant(
        "PROGRAM_IL"..0x1169
    )

    IntConstant(
        "KERNEL_MAX_NUM_SUB_GROUPS"..0x11B9
    )

    IntConstant(
        "KERNEL_COMPILE_NUM_SUB_GROUPS"..0x11BA
    )

    IntConstant(
        "KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE"..0x2033
    )

    IntConstant(
        "KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE"..0x2034
    )

    IntConstant(
        "KERNEL_LOCAL_SIZE_FOR_SUB_GROUP_COUNT"..0x2034
    )

    cl_int(
        "SetDefaultDeviceCommandQueue",

        cl_context("context"),
        cl_device_id("device"),
        cl_command_queue("command_queue")
    )

    cl_int(
        "GetDeviceAndHostTimer",

        cl_device_id("device"),
        Check(1)..cl_ulong.p("device_timestamp"),
        Check(1)..cl_ulong.p("host_timestamp")
    )

    cl_int(
        "GetHostTimer",

        cl_device_id("device"),
        Check(1)..cl_ulong.p("host_timestamp")
    )

    cl_program(
        "CreateProgramWithIL",

        cl_context("context"),
        void.const.p("il"),
        AutoSize("il")..size_t("length"),
        ERROR_RET
    )

    cl_kernel(
        "CloneKernel",

        cl_kernel("source_kernel"),
        ERROR_RET
    )

    cl_int(
        "GetKernelSubGroupInfo",

        cl_kernel("kernel"),
        nullable..cl_device_id("device"),
        cl_kernel_sub_group_info("param_name"),
        AutoSize("input_value")..size_t("input_value_size"),
        nullable..void.const.p("input_value"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_POINTER)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_int(
        "EnqueueSVMMigrateMem",

        cl_command_queue("command_queue"),
        AutoSize("svm_pointers", "sizes")..cl_uint("num_svm_pointers"),
        void.const.p.p("svm_pointers"),
        nullable..size_t.const.p("sizes"),
        cl_mem_migration_flags("flags"),
        NEWL,
        EWL,
        EVENT
    )
}