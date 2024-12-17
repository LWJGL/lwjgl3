/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val apple_gl_sharing = "APPLEGLSharing".dependsOn(Module.OPENGL, Module.OPENGLES)?.nativeClassCL("APPLE_gl_sharing", APPLE) {
    IntConstant(
        "INVALID_GL_CONTEXT_APPLE".."-1000"
    )

    IntConstant(
        "CONTEXT_PROPERTY_USE_CGL_SHAREGROUP_APPLE"..0x10000000
    )

    IntConstant(
        "CGL_DEVICES_FOR_SUPPORTED_VIRTUAL_SCREENS_APPLE"..0x10000003
    )

    IntConstant(
        "CGL_DEVICE_FOR_CURRENT_VIRTUAL_SCREEN_APPLE"..0x10000002
    )

    cl_int(
        "GetGLContextInfoAPPLE",

        cl_context("context"),
        opaque_p("platform_gl_ctx"),
        cl_gl_platform_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_POINTER)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    // TODO: Add support for clCreateImageFromIOSurface2DAPPLE (requires MacOSX 10.7+)
}