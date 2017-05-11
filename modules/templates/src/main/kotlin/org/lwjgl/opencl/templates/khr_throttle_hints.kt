/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_throttle_hints = "KHRThrottleHints".nativeClassCL("khr_throttle_hints", KHR) {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension adds throttle hints for OpenCL, but does not specify the throttling behaviour or minimum guarantees. It is expected that the user guide
        associated with each implementation which supports this extension describe the throttling behaviour guaranteed.
        """

    IntConstant(
        "cl_command_queue_properties",

        "QUEUE_THROTTLE_KHR"..0x1097
    )

    IntConstant(
        "cl_queue_throttle_khr",

        "QUEUE_THROTTLE_HIGH_KHR".."(1<<0)",
        "QUEUE_THROTTLE_MED_KHR".."(1<<1)",
        "QUEUE_THROTTLE_LOW_KHR".."(1<<2)"
    )
}