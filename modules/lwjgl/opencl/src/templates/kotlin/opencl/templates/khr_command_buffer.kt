/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_command_buffer = "KHRCommandBuffer".nativeClassCL("khr_command_buffer", KHR) {
    IntConstant(
        "DEVICE_COMMAND_BUFFER_CAPABILITIES_KHR"..0x12A9,
        "DEVICE_COMMAND_BUFFER_SUPPORTED_QUEUE_PROPERTIES_KHR"..0x129A,
        "DEVICE_COMMAND_BUFFER_REQUIRED_QUEUE_PROPERTIES_KHR"..0x12AA
    )

    IntConstant(
        "COMMAND_BUFFER_CAPABILITY_KERNEL_PRINTF_KHR".."0x1 << 0",
        "COMMAND_BUFFER_CAPABILITY_DEVICE_SIDE_ENQUEUE_KHR".."0x1 << 1",
        "COMMAND_BUFFER_CAPABILITY_SIMULTANEOUS_USE_KHR".."0x1 << 2"
    )

    IntConstant(
        "COMMAND_BUFFER_STATE_RECORDING_KHR"..0x0,
        "COMMAND_BUFFER_STATE_EXECUTABLE_KHR"..0x1,
        "COMMAND_BUFFER_STATE_PENDING_KHR"..0x2
    )

    IntConstant(
        "INVALID_COMMAND_BUFFER_KHR".."-1138",
        "INVALID_SYNC_POINT_WAIT_LIST_KHR".."-1139",
        "INCOMPATIBLE_COMMAND_QUEUE_KHR".."-1140"
    )

    IntConstant(
        "COMMAND_BUFFER_FLAGS_KHR"..0x1293
    )

    IntConstant(
        "COMMAND_BUFFER_SIMULTANEOUS_USE_KHR".."0x1 << 0"
    )

    IntConstant(
        "COMMAND_BUFFER_QUEUES_KHR"..0x1294,
        "COMMAND_BUFFER_NUM_QUEUES_KHR"..0x1295,
        "COMMAND_BUFFER_REFERENCE_COUNT_KHR"..0x1296,
        "COMMAND_BUFFER_STATE_KHR"..0x1297,
        "COMMAND_BUFFER_PROPERTIES_ARRAY_KHR"..0x1298,
        "COMMAND_BUFFER_CONTEXT_KHR"..0x1299
    )

    IntConstant(
        "COMMAND_COMMAND_BUFFER_KHR"..0x12A8
    )

    cl_command_buffer_khr(
        "CreateCommandBufferKHR",

        AutoSize("queues")..cl_uint("num_queues"),
        cl_command_queue.const.p("queues"),
        nullable..NullTerminated..cl_command_buffer_properties_khr.const.p("properties"),
        ERROR_RET
    )

    cl_int("RetainCommandBufferKHR", cl_command_buffer_khr("command_buffer"))
    cl_int("ReleaseCommandBufferKHR", cl_command_buffer_khr("command_buffer"))
    cl_int("FinalizeCommandBufferKHR", cl_command_buffer_khr("command_buffer"))

    cl_int(
        "EnqueueCommandBufferKHR",

        AutoSize("queues")..cl_uint("num_queues"),
        nullable..cl_command_queue.p("queues"),
        cl_command_buffer_khr("command_buffer"),
        NEWL,
        EWL,
        EVENT
    )

    val CommandBarrierWithWaitListKHR = cl_int(
        "CommandBarrierWithWaitListKHR",

        cl_command_buffer_khr("command_buffer"),
        nullable..cl_command_queue("command_queue"),
        nullable..NullTerminated..cl_command_properties_khr.const.p("properties"),
        AutoSize("sync_point_wait_list")..cl_uint("num_sync_points_in_wait_list"),
        nullable..cl_sync_point_khr.const.p("sync_point_wait_list"),
        Check(1)..nullable..cl_sync_point_khr.p("sync_point"),
        Check(1)..nullable..cl_mutable_command_khr.p("mutable_handle")
    )

    cl_int(
        "CommandCopyBufferKHR",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        nullable..NullTerminated..cl_command_properties_khr.const.p("properties"),
        cl_mem("src_buffer"),
        cl_mem("dst_buffer"),
        size_t("src_offset"),
        size_t("dst_offset"),
        size_t("size"),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"]
    )

    cl_int(
        "CommandCopyBufferRectKHR",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        nullable..NullTerminated..cl_command_properties_khr.const.p("properties"),
        cl_mem("src_buffer"),
        cl_mem("dst_buffer"),
        Check(3)..size_t.const.p("src_origin"),
        Check(3)..size_t.const.p("dst_origin"),
        Check(3)..size_t.const.p("region"),
        size_t("src_row_pitch"),
        size_t("src_slice_pitch"),
        size_t("dst_row_pitch"),
        size_t("dst_slice_pitch"),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"]
    )

    cl_int(
        "CommandCopyBufferToImageKHR",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        nullable..NullTerminated..cl_command_properties_khr.const.p("properties"),
        cl_mem("src_buffer"),
        cl_mem("dst_image"),
        size_t("src_offset"),
        Check(3)..size_t.const.p("dst_origin"),
        Check(3)..size_t.const.p("region"),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"]
    )

    cl_int(
        "CommandCopyImageKHR",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        nullable..NullTerminated..cl_command_properties_khr.const.p("properties"),
        cl_mem("src_image"),
        cl_mem("dst_image"),
        Check(3)..size_t.const.p("src_origin"),
        Check(3)..size_t.const.p("dst_origin"),
        Check(3)..size_t.const.p("region"),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"]
    )

    cl_int(
        "CommandCopyImageToBufferKHR",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        nullable..NullTerminated..cl_command_properties_khr.const.p("properties"),
        cl_mem("src_image"),
        cl_mem("dst_buffer"),
        Check(3)..size_t.const.p("src_origin"),
        Check(3)..size_t.const.p("region"),
        size_t("dst_offset"),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"]
    )

    cl_int(
        "CommandFillBufferKHR",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        nullable..NullTerminated..cl_command_properties_khr.const.p("properties"),
        cl_mem("buffer"),
        void.const.p("pattern"),
        AutoSize("pattern")..size_t("pattern_size"),
        size_t("offset"),
        size_t("size"),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"]
    )

    cl_int(
        "CommandFillImageKHR",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        nullable..NullTerminated..cl_command_properties_khr.const.p("properties"),
        cl_mem("image"),
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Check(4 x 4)..void.const.p("fill_color"),
        Check(3)..size_t.const.p("origin"),
        Check(3)..size_t.const.p("region"),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"]
    )

    cl_int(
        "CommandNDRangeKernelKHR",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        nullable..NullTerminated..cl_ndrange_kernel_command_properties_khr.const.p("properties"),
        cl_kernel("kernel"),
        cl_uint("work_dim"),
        Check("work_dim")..nullable..size_t.const.p("global_work_offset"),
        Check("work_dim")..nullable..size_t.const.p("global_work_size"),
        Check("work_dim")..nullable..size_t.const.p("local_work_size"),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"]
    )

    cl_int(
        "GetCommandBufferInfoKHR",

        cl_command_buffer_khr("command_buffer"),
        cl_command_buffer_info_khr("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_POINTER
        )..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    IgnoreMissing..cl_int(
        "CommandSVMMemcpyKHR",

        cl_command_buffer_khr("command_buffer"),
        cl_command_queue("command_queue"),
        nullable..NullTerminated..cl_command_properties_khr.const.p("properties"),
        void.p("dst_ptr"),
        void.const.p("src_ptr"),
        AutoSize("dst_ptr", "src_ptr")..size_t("size"),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"]
    )

    IgnoreMissing..cl_int(
        "CommandSVMMemFillKHR",

        cl_command_buffer_khr("command_buffer"),
        cl_command_queue("command_queue"),
        nullable..NullTerminated..cl_command_properties_khr.const.p("properties"),
        void.p("svm_ptr"),
        void.const.p("pattern"),
        AutoSize("pattern")..size_t("pattern_size"),
        AutoSize("svm_ptr")..size_t("size"),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"]
    )
}