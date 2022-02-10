/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_command_buffer = "KHRCommandBuffer".nativeClassCL("khr_command_buffer", KHR) {
    documentation =
        """
        Native bindings to the $extensionName extension.

        Command-buffers enable a reduction in overhead when enqueuing the same workload multiple times. By separating the command-queue setup from dispatch,
        the ability to replay a set of previously created commands is introduced.

        Device-side {@code cl_sync_point_khr} synchronization-points can be used within command-buffers to define command dependencies. This allows the
        commands of a command-buffer to execute out-of-order on a single compatible command-queue. The command-buffer itself has no inherent
        in-order/out-of-order property, this ordering is inferred from the command-queue used on command recording. Out-of-order enqueues without event
        dependencies of both regular commands, such as #EnqueueFillBuffer(), and command-buffers are allowed to execute concurrently, and it is up to the user
        to express any dependencies using events.

        The command-queues a command-buffer will be executed on can be set on replay via parameters to #EnqueueCommandBufferKHR(), provided they are compatible
        with the command-queues used on command-buffer recording.

        Requires ${CL12.link}.
        """

    IntConstant(
        "Accepted values for the {@code param_name} parameter to #GetDeviceInfo().",

        "DEVICE_COMMAND_BUFFER_CAPABILITIES_KHR"..0x12A9,
        "DEVICE_COMMAND_BUFFER_REQUIRED_QUEUE_PROPERTIES_KHR"..0x12AA
    )

    IntConstant(
        "Bits for {@code cl_device_command_buffer_capabilities_khr} bitfield.",

        "COMMAND_BUFFER_CAPABILITY_KERNEL_PRINTF_KHR".."0x1 << 0",
        "COMMAND_BUFFER_CAPABILITY_DEVICE_SIDE_ENQUEUE_KHR".."0x1 << 1",
        "COMMAND_BUFFER_CAPABILITY_SIMULTANEOUS_USE_KHR".."0x1 << 2",
        "COMMAND_BUFFER_CAPABILITY_OUT_OF_ORDER_KHR".."0x1 << 3"
    )

    IntConstant(
        "Values for {@code cl_command_buffer_state_khr}.",

        "COMMAND_BUFFER_STATE_RECORDING_KHR"..0x0,
        "COMMAND_BUFFER_STATE_EXECUTABLE_KHR"..0x1,
        "COMMAND_BUFFER_STATE_PENDING_KHR"..0x2,
        "COMMAND_BUFFER_STATE_INVALID_KHR"..0x3
    )

    IntConstant(
        "Error codes.",

        "INVALID_COMMAND_BUFFER_KHR".."-1138",
        "INVALID_SYNC_POINT_WAIT_LIST_KHR".."-1139",
        "INCOMPATIBLE_COMMAND_QUEUE_KHR".."-1140"
    )

    IntConstant(
        "Bitfield to #CreateCommandBufferKHR().",

        "COMMAND_BUFFER_FLAGS_KHR"..0x1293
    )

    IntConstant(
        "Bits for {@code cl_command_buffer_flags_khr} bitfield.",

        "COMMAND_BUFFER_SIMULTANEOUS_USE_KHR".."0x1 << 0"
    )

    IntConstant(
        "{@code cl_command_buffer_info_khr} queries to #GetCommandBufferInfoKHR().",

        "COMMAND_BUFFER_QUEUES_KHR"..0x1294,
        "COMMAND_BUFFER_NUM_QUEUES_KHR"..0x1295,
        "COMMAND_BUFFER_REFERENCE_COUNT_KHR"..0x1296,
        "COMMAND_BUFFER_STATE_KHR"..0x1297,
        "COMMAND_BUFFER_PROPERTIES_ARRAY_KHR"..0x1298
    )

    IntConstant(
        "{@code cl_event} command-buffer enqueue command type.",

        "COMMAND_COMMAND_BUFFER_KHR"..0x12A8
    )

    cl_command_buffer_khr(
        "CreateCommandBufferKHR",
        "Creates a command-buffer that can record commands to the specified queues.",

        AutoSize("queues")..cl_uint(
            "num_queues",
            "the number of command-queues listed in {@code queues}. This extension only supports a single command-queue, so this <b>must</b> be one."
        ),
        cl_command_queue.const.p(
            "queues",
            "a pointer to a command-queue that the command-buffer commands will be recorded to. {@code queues must} be a non-#NULL value."
        ),
        nullable..NullTerminated..cl_command_buffer_properties_khr.const.p(
            "properties",
            """
            a list of properties for the command-buffer and their corresponding values.
            
            Each property name is immediately followed by the corresponding desired value. The list is terminated with 0. If a supported property and its value
            is not specified in properties, its default value will be used. {@code properties} can be #NULL in which case the default values for supported
            command-buffer properties will be used.
            """
        ),
        ERROR_RET
    )

    cl_int(
        "RetainCommandBufferKHR",
        "Increments the {@code command_buffer} reference count.",

        cl_command_buffer_khr("command_buffer", "the command-buffer to retain")
    )

    cl_int(
        "ReleaseCommandBufferKHR",
        "Decrements the {@code command_buffer} reference count.",

        cl_command_buffer_khr("command_buffer", "the command-buffer to release")
    )

    cl_int(
        "FinalizeCommandBufferKHR",
        "Finalizes command recording ready for enqueuing the command-buffer on a command-queue.",

        cl_command_buffer_khr("command_buffer", "a valid command-buffer object")
    )

    cl_int(
        "EnqueueCommandBufferKHR",
        """
        Enqueues a command-buffer to execute on command-queues specified by {@code queues, or} on default command-queues used during recording if
        {@code queues} is empty.
        """,

        AutoSize("queues")..cl_uint("num_queues", "the number of command-queues listed in {@code queues}"),
        nullable..cl_command_queue.p(
            "queues",
            """
            a pointer to an ordered list of command-queues compatible with the command-queues used on recording.
            
            {@code queues} can be #NULL in which case the default command-queues used on command-buffer creation are used and {@code num_queues} must be 0.
            """
        ),
        cl_command_buffer_khr("command_buffer", "a valid command-buffer object"),
        NEWL,
        EWL,
        EVENT
    )

    val CommandBarrierWithWaitListKHR = cl_int(
        "CommandBarrierWithWaitListKHR",
        "Records a barrier operation used as a synchronization point.",

        cl_command_buffer_khr("command_buffer", "a valid command-buffer object"),
        nullable..cl_command_queue(
            "command_queue",
            """
            the command-queue the command will be recorded to.

            Parameter is unused by this extension as only a single command-queue is supported and <b>must</b> be #NULL.
            """
        ),
        AutoSize("sync_point_wait_list")..cl_uint("num_sync_points_in_wait_list", ""),
        nullable..cl_sync_point_khr.const.p(
            "sync_point_wait_list",
            """
            the synchronization-points that need to complete before this particular command can be executed.

            If {@code sync_point_wait_list} is #NULL, {@code num_sync_points_in_wait_list} must be 0. If {@code sync_point_wait_list} is not #NULL, the list of
            synchronization-points pointed to by {@code sync_point_wait_list} must be valid and {@code num_sync_points_in_wait_list} must be greater than 0.
            The synchronization-points specified in {@code sync_point_wait_list} are <b>device side</b> synchronization-points. The command-buffer associated 
            with synchronization-points in {@code sync_point_wait_list} must be the same as {@code command_buffer}. The memory associated with
            {@code sync_point_wait_list} can be reused or freed after the function returns.

            If {@code sync_point_wait_list} is #NULL, then this particular command waits until all previous recorded commands to {@code command_queue} have
            completed.
            """
        ),
        Check(1)..nullable..cl_sync_point_khr.p(
            "sync_point",
            """
            returns a synchronization-point ID that identifies this particular command.

            Synchronization-point objects are unique and can be used to identify this barrier command later on. {@code sync_point} can be #NULL in which case
            it will not be possible for the application to record a wait for this command to complete. If the {@code sync_point_wait_list} and the
            {@code sync_point} arguments are not #NULL, the {@code sync_point} argument should not refer to an element of the {@code sync_point_wait_list}
            array.
            """
        ),
        Check(1)..nullable..cl_mutable_command_khr.p(
            "mutable_handle",
            """
            returns a handle to the command.

            Handle is unused by this extension and must be passed as #NULL.
            """
        )
    )

    cl_int(
        "CommandCopyBufferKHR",
        "Records a command to copy from one buffer object to another.",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        cl_mem("src_buffer", ""),
        cl_mem("dst_buffer", ""),
        size_t("src_offset", ""),
        size_t("dst_offset", ""),
        size_t("size", ""),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"],
    )

    cl_int(
        "CommandCopyBufferRectKHR",
        "Records a command to copy a rectangular region from a buffer object to another buffer object.",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        cl_mem("src_buffer", ""),
        cl_mem("dst_buffer", ""),
        Check(3)..size_t.const.p("src_origin", ""),
        Check(3)..size_t.const.p("dst_origin", ""),
        Check(3)..size_t.const.p("region", ""),
        size_t("src_row_pitch", ""),
        size_t("src_slice_pitch", ""),
        size_t("dst_row_pitch", ""),
        size_t("dst_slice_pitch", ""),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"],
    )

    cl_int(
        "CommandCopyBufferToImageKHR",
        "Records a command to copy a buffer object to an image object.",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        cl_mem("src_buffer", ""),
        cl_mem("dst_image", ""),
        size_t("src_offset", ""),
        Check(3)..size_t.const.p("dst_origin", ""),
        Check(3)..size_t.const.p("region", ""),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"],
    )

    cl_int(
        "CommandCopyImageKHR",
        "Records a command to copy image objects.",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        cl_mem("src_image", ""),
        cl_mem("dst_image", ""),
        Check(3)..size_t.const.p("src_origin", ""),
        Check(3)..size_t.const.p("dst_origin", ""),
        Check(3)..size_t.const.p("region", ""),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"],
    )

    cl_int(
        "CommandCopyImageToBufferKHR",
        "Records a command to copy an image object to a buffer object.",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        cl_mem("src_image", ""),
        cl_mem("dst_buffer", ""),
        Check(3)..size_t.const.p("src_origin", ""),
        Check(3)..size_t.const.p("region", ""),
        size_t("dst_offset", ""),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"],
    )

    cl_int(
        "CommandFillBufferKHR",
        "Records a command to fill a buffer object with a pattern of a given pattern size.",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        cl_mem("buffer", ""),
        void.const.p("pattern", ""),
        AutoSize("pattern")..size_t("pattern_size", ""),
        size_t("offset", ""),
        size_t("size", ""),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"],
    )

    cl_int(
        "CommandFillImageKHR",
        "Records a command to fill an image object with a specified color.",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        cl_mem("image", ""),
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Check(4 x 4)..void.const.p("fill_color", ""),
        Check(3)..size_t.const.p("origin", ""),
        Check(3)..size_t.const.p("region", ""),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"],
    )

    cl_int(
        "CommandNDRangeKernelKHR",
        "Records a command to execute a kernel on a device.",

        CommandBarrierWithWaitListKHR["command_buffer"],
        CommandBarrierWithWaitListKHR["command_queue"],
        nullable..NullTerminated..cl_ndrange_kernel_command_properties_khr.const.p("properties", ""),
        cl_kernel("kernel", "a valid kernel object"),
        cl_uint("work_dim", ""),
        Check("work_dim")..nullable..size_t.const.p("global_work_offset", ""),
        Check("work_dim")..nullable..size_t.const.p("global_work_size", ""),
        Check("work_dim")..nullable..size_t.const.p("local_work_size", ""),
        CommandBarrierWithWaitListKHR["num_sync_points_in_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point_wait_list"],
        CommandBarrierWithWaitListKHR["sync_point"],
        CommandBarrierWithWaitListKHR["mutable_handle"],
    )

    cl_int(
        "GetCommandBufferInfoKHR",
        "Queries information about a command-buffer.",

        cl_command_buffer_khr("command_buffer", "the command-buffer being queried"),
        cl_command_buffer_info_khr("param_name", "the information to query"),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_POINTER
        )..nullable..void.p("param_value", param_value),
        PARAM_VALUE_SIZE_RET
    )
}