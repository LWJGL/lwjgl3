/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_gl_sharing = "KHRGLSharing".dependsOn(Module.OPENGL, Module.OPENGLES)?.nativeClassCL("khr_gl_sharing", KHR) {
    IntConstant(
        "INVALID_GL_SHAREGROUP_REFERENCE_KHR".."-1000"
    )

    IntConstant(
        "DEVICES_FOR_GL_CONTEXT_KHR"..0x2007
    )

    IntConstant(
        "CURRENT_DEVICE_FOR_GL_CONTEXT_KHR"..0x2006
    )

    IntConstant(
        "GL_CONTEXT_KHR"..0x2008,
        "EGL_DISPLAY_KHR"..0x2009,
        "GLX_DISPLAY_KHR"..0x200A,
        "WGL_HDC_KHR"..0x200B,
        "CGL_SHAREGROUP_KHR"..0x200C
    )

    cl_int(
        "GetGLContextInfoKHR",

        NullTerminated..cl_context_properties.const.p("properties"),
        cl_gl_context_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_POINTER)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )
}