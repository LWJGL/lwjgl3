/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val ARM_mali_shader_binary = "ARMMaliShaderBinary".nativeClassGLES("ARM_mali_shader_binary", postfix = ARM) {
    IntConstant(
        "MALI_SHADER_BINARY_ARM"..0x8F60
    )
}