/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val APPLE_command_queue_priority = "APPLECommandQueuePriority".nativeClassCL("APPLE_command_queue_priority", APPLE) {
    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "",

        "QUEUE_PRIORITY_APPLE"..0x10000013,
        "QUEUE_PRIORITY_BACKGROUND_APPLE"..0x10000015,
        "QUEUE_PRIORITY_DEFAULT_APPLE"..0x10000017
    )

    cl_command_queue(
        "CreateCommandQueueWithPropertiesAPPLE",
        "",

        cl_context.IN("context", ""),
        cl_device_id.IN("device", ""),
        NullTerminated..cl_queue_properties_APPLE.const.p.IN("properties", ""),
        ERROR_RET
    )
}