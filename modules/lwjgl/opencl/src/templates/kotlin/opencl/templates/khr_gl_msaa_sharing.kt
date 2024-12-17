/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_gl_msaa_sharing = "KHRGLMSAASharing".dependsOn(Module.OPENGL, Module.OPENGLES)?.nativeClassCL("khr_gl_msaa_sharing", KHR) {
    IntConstant(
        "GL_NUM_SAMPLES"..0x2012
    )
}