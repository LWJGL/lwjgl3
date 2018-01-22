/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_gl_msaa_sharing = "KHRGLMSAASharing".dependsOn(Module.OPENGL, Module.OPENGLES)?.nativeClassCL("khr_gl_msaa_sharing", KHR) {
    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "cl_gl_texture_info",

        "GL_NUM_SAMPLES"..0x2012
    )
}