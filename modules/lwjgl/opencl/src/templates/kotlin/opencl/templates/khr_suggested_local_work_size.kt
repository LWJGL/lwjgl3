/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_suggested_local_work_size = "KHRSuggestedLocalWorkSize".nativeClassCL("khr_suggested_local_work_size", KHR) {
    cl_int(
        "GetKernelSuggestedLocalWorkSizeKHR",

        cl_command_queue("command_queue"),
        cl_kernel("kernel"),
        AutoSize("global_work_size", "suggested_local_work_size", "global_work_offset")..cl_uint("work_dim"),
        nullable..size_t.const.p("global_work_offset"),
        size_t.const.p("global_work_size"),
        size_t.p("suggested_local_work_size")
    )
}