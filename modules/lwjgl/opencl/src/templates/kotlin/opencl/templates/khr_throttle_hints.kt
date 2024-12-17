/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_throttle_hints = "KHRThrottleHints".nativeClassCL("khr_throttle_hints", KHR) {
    IntConstant(
        "QUEUE_THROTTLE_KHR"..0x1097
    )

    IntConstant(
        "QUEUE_THROTTLE_HIGH_KHR".."(1<<0)",
        "QUEUE_THROTTLE_MED_KHR".."(1<<1)",
        "QUEUE_THROTTLE_LOW_KHR".."(1<<2)"
    )
}