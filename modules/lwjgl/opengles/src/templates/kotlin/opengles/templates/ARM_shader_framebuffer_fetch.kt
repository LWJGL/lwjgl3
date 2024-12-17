/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val ARM_shader_framebuffer_fetch = "ARMShaderFramebufferFetch".nativeClassGLES("ARM_shader_framebuffer_fetch", postfix = ARM) {
    IntConstant(
        "FETCH_PER_SAMPLE_ARM"..0x8F65
    )

    IntConstant(
        "FRAGMENT_SHADER_FRAMEBUFFER_FETCH_MRT_ARM"..0x8F66
    )
}