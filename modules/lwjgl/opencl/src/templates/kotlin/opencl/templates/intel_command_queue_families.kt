/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_command_queue_families = "INTELCommandQueueFamilies".nativeClassCL("intel_command_queue_families", INTEL) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        Some OpenCL devices may support different sets of command queues with different capabilities or execution properties. These sets are described in this
        extension as command queue families. Applications may be able to improve performance or predictability by creating command queues from a specific
        command queue family.

        This extension adds the ability to:
        ${ul(
            "Query the command queue families supported by an OpenCL device and their capabilities.",
            "Create an OpenCL command queue from a specific command queue family.",
            "Query the command queue family and command queue index associated with an OpenCL command queue."
        )}

        Requires ${CL20.link}. 
        """

    IntConstant(
        """
        Accepted value for the {@code param_name} parameter to #GetDeviceInfo() to query the number of command queue families and command queue family
        properties supported by an OpenCL device.
        """,

        "DEVICE_QUEUE_FAMILY_PROPERTIES_INTEL"..0x418B
    )

    IntConstant(
        """
        Accepted as a property name for the {@code properties} parameter to #CreateCommandQueueWithProperties() to specify the command queue family and command
        queue index that this command queue should submit work to; and for the {@code param_name} parameter to #GetCommandQueueInfo() to query the command
        queue family or command queue index associated with a command queue.
        """,

        "QUEUE_FAMILY_INTEL"..0x418C,
        "QUEUE_INDEX_INTEL"..0x418D
    )

    IntConstant(
        """
        Bitfield type describing the capabilities of the queues in a command queue family. Subsequent versions of this extension may add additional queue
        capabilities.
        """,
        
        "QUEUE_DEFAULT_CAPABILITIES_INTEL".."0",
        "QUEUE_CAPABILITY_CREATE_SINGLE_QUEUE_EVENTS_INTEL".."(1 << 0)",
        "QUEUE_CAPABILITY_CREATE_CROSS_QUEUE_EVENTS_INTEL".."(1 << 1)",
        "QUEUE_CAPABILITY_SINGLE_QUEUE_EVENT_WAIT_LIST_INTEL".."(1 << 2)",
        "QUEUE_CAPABILITY_CROSS_QUEUE_EVENT_WAIT_LIST_INTEL".."(1 << 3)",
        "QUEUE_CAPABILITY_TRANSFER_BUFFER_INTEL".."(1 << 8)",
        "QUEUE_CAPABILITY_TRANSFER_BUFFER_RECT_INTEL".."(1 << 9)",
        "QUEUE_CAPABILITY_MAP_BUFFER_INTEL".."(1 << 10)",
        "QUEUE_CAPABILITY_FILL_BUFFER_INTEL".."(1 << 11)",
        "QUEUE_CAPABILITY_TRANSFER_IMAGE_INTEL".."(1 << 12)",
        "QUEUE_CAPABILITY_MAP_IMAGE_INTEL".."(1 << 13)",
        "QUEUE_CAPABILITY_FILL_IMAGE_INTEL".."(1 << 14)",
        "QUEUE_CAPABILITY_TRANSFER_BUFFER_IMAGE_INTEL".."(1 << 15)",
        "QUEUE_CAPABILITY_TRANSFER_IMAGE_BUFFER_INTEL".."(1 << 16)",
        "QUEUE_CAPABILITY_MARKER_INTEL".."(1 << 24)",
        "QUEUE_CAPABILITY_BARRIER_INTEL".."(1 << 25)",
        "QUEUE_CAPABILITY_KERNEL_INTEL".."(1 << 26)"
    )
}
