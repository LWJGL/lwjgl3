/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_terminate_context = "KHRTerminateContext".nativeClassCL("khr_terminate_context", KHR) {
    IntConstant(
        "DEVICE_TERMINATE_CAPABILITY_KHR"..0x200F
    )

    IntConstant(
        "CONTEXT_TERMINATE_KHR"..0x2010
    )

    // TODO: Find CL_TERMINATED_KHR & CL_CONTEXT_TERMINATED_KHR values.

    cl_int(
        "TerminateContextKHR",

        cl_context("context")
    )

}