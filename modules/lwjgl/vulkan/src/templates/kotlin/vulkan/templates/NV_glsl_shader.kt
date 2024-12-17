/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_glsl_shader = "NVGLSLShader".nativeClassVK("NV_glsl_shader", type = "device", postfix = "NV") {
    IntConstant(
        "NV_GLSL_SHADER_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_GLSL_SHADER_EXTENSION_NAME".."VK_NV_glsl_shader"
    )

    EnumConstant(
        "ERROR_INVALID_SHADER_NV".."-1000012000"
    )
}