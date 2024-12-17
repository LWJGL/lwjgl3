/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_egl_image = "KHREGLImage".dependsOn(Module.EGL)?.nativeClassCL("khr_egl_image", KHR) {
    IntConstant(
        "EGL_RESOURCE_NOT_ACQUIRED_KHR".."-1092",
        "INVALID_EGL_OBJECT_KHR".."-1093"
    )

    IntConstant(
        "COMMAND_ACQUIRE_EGL_OBJECTS_KHR"..0x202D,
        "COMMAND_RELEASE_EGL_OBJECTS_KHR"..0x202E
    )

    cl_mem(
        "CreateFromEGLImageKHR",

        cl_context("context"),
        CLeglDisplayKHR("display"),
        CLeglImageKHR("image"),
        cl_mem_flags("flags"),
        nullable..NullTerminated..cl_egl_image_properties_khr.const.p("properties"),
        ERROR_RET
    )

    cl_int(
        "EnqueueAcquireEGLObjectsKHR",

        cl_command_queue("command_queue"),
        AutoSize("mem_objects")..cl_uint("num_objects"),
        cl_mem.const.p("mem_objects"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueReleaseEGLObjectsKHR",

        cl_command_queue("command_queue"),
        AutoSize("mem_objects")..cl_uint("num_objects"),
        SingleValue("mem_object")..cl_mem.const.p("mem_objects"),
        NEWL,
        EWL,
        EVENT
    )
}