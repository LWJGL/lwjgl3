/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_gl_event = "KHRGLEvent".dependsOn(Module.OPENGL, Module.OPENGLES)?.nativeClassCL("khr_gl_event", KHR) {
    IntConstant(
        "COMMAND_GL_FENCE_SYNC_OBJECT_KHR"..0x200D
    )

    cl_event(
        "CreateEventFromGLsyncKHR",

        cl_context("context"),
        GLsync("sync"),
        ERROR_RET
    )
}