/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_command_buffer_mutable_dispatch = "KHRCommandBufferMutableDispatch".nativeClassCL("khr_command_buffer_mutable_dispatch", KHR) {
    IntConstant(
        "COMMAND_BUFFER_MUTABLE_KHR".."1 << 1"
    )

    IntConstant(
        "INVALID_MUTABLE_COMMAND_KHR".."-1141"
    )

    IntConstant(
        "DEVICE_MUTABLE_DISPATCH_CAPABILITIES_KHR"..0x12B0
    )

    IntConstant(
        "MUTABLE_DISPATCH_UPDATABLE_FIELDS_KHR"..0x12B1
    )

    IntConstant(
        "MUTABLE_DISPATCH_GLOBAL_OFFSET_KHR".."1 << 0",
        "MUTABLE_DISPATCH_GLOBAL_SIZE_KHR".."1 << 1",
        "MUTABLE_DISPATCH_LOCAL_SIZE_KHR".."1 << 2",
        "MUTABLE_DISPATCH_ARGUMENTS_KHR".."1 << 3",
        "MUTABLE_DISPATCH_EXEC_INFO_KHR".."1 << 4"
    )

    IntConstant(
        "MUTABLE_COMMAND_COMMAND_QUEUE_KHR"..0x12A0,
        "MUTABLE_COMMAND_COMMAND_BUFFER_KHR"..0x12A1,
        "MUTABLE_COMMAND_COMMAND_TYPE_KHR"..0x12AD,
        "MUTABLE_COMMAND_PROPERTIES_ARRAY_KHR"..0x12A2,
        "MUTABLE_DISPATCH_KERNEL_KHR"..0x12A3,
        "MUTABLE_DISPATCH_DIMENSIONS_KHR"..0x12A4,
        "MUTABLE_DISPATCH_GLOBAL_WORK_OFFSET_KHR"..0x12A5,
        "MUTABLE_DISPATCH_GLOBAL_WORK_SIZE_KHR"..0x12A6,
        "MUTABLE_DISPATCH_LOCAL_WORK_SIZE_KHR"..0x12A7
    )

    IntConstant(
        "STRUCTURE_TYPE_MUTABLE_DISPATCH_CONFIG_KHR"..0
    )

    IntConstant(
        "COMMAND_BUFFER_MUTABLE_DISPATCH_ASSERTS_KHR"..0x12B7
    )

    IntConstant(
        "MUTABLE_DISPATCH_ASSERTS_KHR"..0x12B8
    )

    IntConstant(
        "MUTABLE_DISPATCH_ASSERT_NO_ADDITIONAL_WORK_GROUPS_KHR".."1 << 0"
    )

    cl_int(
        "UpdateMutableCommandsKHR",

        cl_command_buffer_khr("command_buffer"),
        AutoSize("config_types", "configs")..cl_uint("num_configs"),
        nullable..cl_command_buffer_update_type_khr.const.p("config_types"),
        nullable..void.const.p.p("configs")
    )

    cl_int(
        "GetMutableCommandInfoKHR",

        cl_mutable_command_khr("command"),
        cl_mutable_command_info_khr("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_POINTER
        )..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )
}