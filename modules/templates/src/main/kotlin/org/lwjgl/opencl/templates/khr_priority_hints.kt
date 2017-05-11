/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_priority_hints = "KHRPriorityHints".nativeClassCL("khr_priority_hints", KHR) {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension adds priority hints for OpenCL, but does not specify the scheduling behavior or minimum guarantees. It is expected that the the user
        guides associated with each implementation which supports this extension describe the scheduling behavior guaranteed.
        """

    IntConstant(
        "cl_command_queue_properties",

        "QUEUE_PRIORITY_KHR"..0x1096
    )

    IntConstant(
        "cl_queue_priority_khr",

        "QUEUE_PRIORITY_HIGH_KHR".."(1<<0)",
        "QUEUE_PRIORITY_MED_KHR".."(1<<1)",
        "QUEUE_PRIORITY_LOW_KHR".."(1<<2)"
    )
}