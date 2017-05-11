/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_egl_image = "KHREGLImage".dependsOn(Binding.EGL)?.nativeClassCL("khr_egl_image", KHR) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension provides a mechanism for creating derived resources, such as OpenCL image objects, from {@code EGLImages}.
        """

    IntConstant(
        "Error Codes",

        "EGL_RESOURCE_NOT_ACQUIRED_KHR".."-1092",
        "INVALID_EGL_OBJECT_KHR".."-1093"
    )

    IntConstant(
        "Command types.",

        "COMMAND_ACQUIRE_EGL_OBJECTS_KHR"..0x202D,
        "COMMAND_RELEASE_EGL_OBJECTS_KHR"..0x202E
    )

    cl_mem(
        "CreateFromEGLImageKHR",
        "Creates an {@code EGLImage} target of type {@code cl_mem} from the {@code EGLImage} source provided as {@code image}.",

        cl_context.IN("context", ""),
        CLeglDisplayKHR.IN("display", "an {@code EGLDisplay}"),
        CLeglImageKHR.IN("image", "an {@code EGLImageKHR}"),
        cl_mem_flags.IN("flags", "a bit-field that is used to specify usage information about the memory object being created"),
        nullable..NullTerminated..const..cl_egl_image_properties_khr_p.IN("properties", "a list of property names and their corresponding values"),
        ERROR_RET
    )

    cl_int(
        "EnqueueAcquireEGLObjectsKHR",
        """
        Acquires OpenCL memory objects that have been created from EGL resources. The EGL objects are acquired by the OpenCL context associated with
        {@code command_queue} and can therefore be used by all command-queues associated with the OpenCL context.
        """,

        cl_command_queue.IN("command_queue", "a valid command-queue"),
        AutoSize("mem_objects")..cl_uint.IN("num_objects", "the number of memory objects to be acquired in {@code mem_objects}"),
        const..cl_mem_p.IN(
            "mem_objects",
            "a pointer to a list of OpenCL memory objects that were created from EGL resources, within the context associated with {@code command_queue}"
        ),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueReleaseEGLObjectsKHR",
        """
        Releases OpenCL memory objects that have been created from EGL resources. The EGL objects are released by the OpenCL context associated with
        {@code command_queue}.
        """,

        cl_command_queue.IN("command_queue", "a valid command-queue"),
        AutoSize("mem_objects")..cl_uint.IN("num_objects", "the number of memory objects to be released in {@code mem_objects}"),
        SingleValue("mem_object")..const..cl_mem_p.IN(
            "mem_objects",
            "a pointer to a list of OpenCL memory objects that were created from EGL resources, within the context associated with {@code command_queue}"
        ),
        NEWL,
        EWL,
        EVENT
    )
}