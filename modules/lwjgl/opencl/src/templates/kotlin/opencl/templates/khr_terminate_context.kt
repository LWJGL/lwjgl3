/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_terminate_context = "KHRTerminateContext".nativeClassCL("khr_terminate_context", KHR) {
    IntConstant(
        "DEVICE_TERMINATE_CAPABILITY_KHR"..0x2031
    )

    IntConstant(
        "CONTEXT_TERMINATE_KHR"..0x2032
    )

    IntConstant(
        "DEVICE_TERMINATE_CAPABILITY_CONTEXT_KHR".."1 << 0"
    )

    IntConstant(
        "CONTEXT_TERMINATED_KHR".."-1121"
    )

    cl_int(
        "TerminateContextKHR",

        cl_context("context")
    )
}