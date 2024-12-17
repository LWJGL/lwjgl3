/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_priority_hints = "KHRPriorityHints".nativeClassCL("khr_priority_hints", KHR) {
    IntConstant(
        "QUEUE_PRIORITY_KHR"..0x1096
    )

    IntConstant(
        "QUEUE_PRIORITY_HIGH_KHR".."(1<<0)",
        "QUEUE_PRIORITY_MED_KHR".."(1<<1)",
        "QUEUE_PRIORITY_LOW_KHR".."(1<<2)"
    )
}