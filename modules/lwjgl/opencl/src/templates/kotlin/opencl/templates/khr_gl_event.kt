/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*
import opengl.*

val khr_gl_event = "KHRGLEvent".dependsOn(Module.OPENGL, Module.OPENGLES)?.nativeClassCL("khr_gl_event", KHR) {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension allows creating OpenCL event objects linked to OpenGL fence sync objects, potentially improving efficiency of sharing images and buffers
        between the two APIs. The companion {@link org.lwjgl.opengl.ARBCLEvent GL_ARB_cl_event} extension provides the complementary functionality of creating
        an OpenGL sync object from an OpenCL event object.

        In addition, this extension modifies the behavior of #EnqueueAcquireGLObjects() and #EnqueueReleaseGLObjects() to implicitly
        guarantee synchronization with an OpenGL context bound in the same thread as the OpenCL context.
        """

    IntConstant(
        "Returned by #GetEventInfo() when {@code param_name} is #EVENT_COMMAND_TYPE.",

        "COMMAND_GL_FENCE_SYNC_OBJECT_KHR"..0x200D
    )

    cl_event(
        "CreateEventFromGLsyncKHR",
        "Creates an OpenCL event object from an OpenGL fence sync object.",

        cl_context.IN("context", "the OpenCL context in which to create the event object"),
        GLsync.IN("sync", "the OpenGL fence sync object"),
        ERROR_RET
    )
}