/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_command_buffer_multi_device = "KHRCommandBufferMultiDevice".nativeClassCL("khr_command_buffer_multi_device", KHR) {
    IntConstant(
        "PLATFORM_COMMAND_BUFFER_CAPABILITIES_KHR"..0x0908
    )

    IntConstant(
        "COMMAND_BUFFER_PLATFORM_UNIVERSAL_SYNC_KHR".."1 << 0",
        "COMMAND_BUFFER_PLATFORM_REMAP_QUEUES_KHR".."1 << 1",
        "COMMAND_BUFFER_PLATFORM_AUTOMATIC_REMAP_KHR".."1 << 2"
    )

    IntConstant(
        "DEVICE_COMMAND_BUFFER_NUM_SYNC_DEVICES_KHR"..0x12AB,
        "DEVICE_COMMAND_BUFFER_SYNC_DEVICES_KHR"..0x12AC
    )

    IntConstant(
        "COMMAND_BUFFER_CAPABILITY_MULTIPLE_QUEUE_KHR".."1 << 4"
    )

    IntConstant(
        "COMMAND_BUFFER_DEVICE_SIDE_SYNC_KHR".."1 << 2"
    )

    cl_command_buffer_khr(
        "RemapCommandBufferKHR",

        cl_command_buffer_khr("command_buffer"),
        cl_bool("automatic"),
        AutoSize("queues")..cl_uint("num_queues"),
        cl_command_queue.const.p("queues"),
        AutoSize("handles", "handles_ret")..cl_uint("num_handles"),
        nullable..cl_mutable_command_khr.const.p("handles"),
        nullable..cl_mutable_command_khr.p("handles_ret"),
        ERROR_RET
    )
}