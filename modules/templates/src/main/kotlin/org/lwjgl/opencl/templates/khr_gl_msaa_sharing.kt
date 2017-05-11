/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_gl_msaa_sharing = "KHRGLMSAASharing".dependsOn(Binding.OPENGL, Binding.OPENGLES)?.nativeClassCL("khr_gl_msaa_sharing", KHR) {
    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "cl_gl_texture_info",

        "GL_NUM_SAMPLES"..0x2012
    )
}