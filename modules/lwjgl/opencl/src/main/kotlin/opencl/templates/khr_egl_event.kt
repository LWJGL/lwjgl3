/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_egl_event = "KHREGLEvent".dependsOn(Binding.EGL)?.nativeClassCL("khr_egl_event", KHR) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension allows creating OpenCL event objects linked to EGL fence sync objects, potentially improving efficiency of sharing images and buffers
        between the two APIs. The companion {@code EGL_KHR_cl_event} extension provides the complementary functionality of creating an EGL sync object from an
        OpenCL event object.
        """

    IntConstant(
        "Returned by clCreateEventFromEGLSyncKHR if sync is not a valid EGLSyncKHR handle created with respect to EGLDisplay display.",

        "INVALID_EGL_OBJECT_KHR".."-1093"
    )

    IntConstant(
        "Returned by #GetEventInfo() when param_name is #EVENT_COMMAND_TYPE.",

        "COMMAND_EGL_FENCE_SYNC_OBJECT_KHR"..0x202F
    )

    cl_event(
        "CreateEventFromEGLSyncKHR",
        "Creates a linked event object.",

        cl_context.IN("context", "a valid OpenCL context"),
        CLeglSyncKHR.IN("sync", "the name of a sync object of type org.lwjgl.egl.EGL15#EGL_SYNC_FENCE created with respect to {@code EGLDisplay display}."),
        CLeglDisplayKHR.IN("display", "an {@code EGLDisplay}"),
        ERROR_RET
    )
}