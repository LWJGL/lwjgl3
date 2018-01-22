/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_gl_depth_images = "KHRGLDepthImages".dependsOn(Binding.OPENGL, Binding.OPENGLES)?.nativeClassCL("khr_gl_depth_images", KHR) {
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