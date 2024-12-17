/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_create_command_queue = "KHRCreateCommandQueue".nativeClassCL("khr_create_command_queue", KHR) {
    cl_command_queue(
        "CreateCommandQueueWithPropertiesKHR",

        cl_context("context"),
        cl_device_id("device"),
        nullable..NullTerminated..cl_queue_properties_khr.const.p("properties"),
        ERROR_RET
    )
}