/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_command_queue_families = "INTELCommandQueueFamilies".nativeClassCL("intel_command_queue_families", INTEL) {
    IntConstant(
        "DEVICE_QUEUE_FAMILY_PROPERTIES_INTEL"..0x418B
    )

    LongConstant(
        "QUEUE_FAMILY_INTEL"..0x418CL,
        "QUEUE_INDEX_INTEL"..0x418DL
    )

    LongConstant(
        "QUEUE_DEFAULT_CAPABILITIES_INTEL".."0L",
        "QUEUE_CAPABILITY_CREATE_SINGLE_QUEUE_EVENTS_INTEL".."(1L << 0)",
        "QUEUE_CAPABILITY_CREATE_CROSS_QUEUE_EVENTS_INTEL".."(1L << 1)",
        "QUEUE_CAPABILITY_SINGLE_QUEUE_EVENT_WAIT_LIST_INTEL".."(1L << 2)",
        "QUEUE_CAPABILITY_CROSS_QUEUE_EVENT_WAIT_LIST_INTEL".."(1L << 3)",
        "QUEUE_CAPABILITY_TRANSFER_BUFFER_INTEL".."(1L << 8)",
        "QUEUE_CAPABILITY_TRANSFER_BUFFER_RECT_INTEL".."(1L << 9)",
        "QUEUE_CAPABILITY_MAP_BUFFER_INTEL".."(1L << 10)",
        "QUEUE_CAPABILITY_FILL_BUFFER_INTEL".."(1L << 11)",
        "QUEUE_CAPABILITY_TRANSFER_IMAGE_INTEL".."(1L << 12)",
        "QUEUE_CAPABILITY_MAP_IMAGE_INTEL".."(1L << 13)",
        "QUEUE_CAPABILITY_FILL_IMAGE_INTEL".."(1L << 14)",
        "QUEUE_CAPABILITY_TRANSFER_BUFFER_IMAGE_INTEL".."(1L << 15)",
        "QUEUE_CAPABILITY_TRANSFER_IMAGE_BUFFER_INTEL".."(1L << 16)",
        "QUEUE_CAPABILITY_MARKER_INTEL".."(1L << 24)",
        "QUEUE_CAPABILITY_BARRIER_INTEL".."(1L << 25)",
        "QUEUE_CAPABILITY_KERNEL_INTEL".."(1L << 26)"
    )
}
