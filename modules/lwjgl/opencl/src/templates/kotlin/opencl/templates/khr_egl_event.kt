/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_egl_event = "KHREGLEvent".dependsOn(Module.EGL)?.nativeClassCL("khr_egl_event", KHR) {
    IntConstant(
        "INVALID_EGL_OBJECT_KHR".."-1093"
    )

    IntConstant(
        "COMMAND_EGL_FENCE_SYNC_OBJECT_KHR"..0x202F
    )

    cl_event(
        "CreateEventFromEGLSyncKHR",

        cl_context("context"),
        CLeglSyncKHR("sync"),
        CLeglDisplayKHR("display"),
        ERROR_RET
    )
}