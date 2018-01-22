/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_gl_depth_images = "KHRGLDepthImages".dependsOn(Module.OPENGL, Module.OPENGLES)?.nativeClassCL("khr_gl_depth_images", KHR) {
    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "cl_channel_order",

        "DEPTH_STENCIL"..0x10BE
    )

    IntConstant(
        "cl_channel_type",

        "UNORM_INT24"..0x10DF
    )
}