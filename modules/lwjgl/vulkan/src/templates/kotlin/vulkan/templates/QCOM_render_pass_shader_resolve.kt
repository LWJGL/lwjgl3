/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_render_pass_shader_resolve = "QCOMRenderPassShaderResolve".nativeClassVK("QCOM_render_pass_shader_resolve", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_RENDER_PASS_SHADER_RESOLVE_SPEC_VERSION".."4"
    )

    StringConstant(
        "QCOM_RENDER_PASS_SHADER_RESOLVE_EXTENSION_NAME".."VK_QCOM_render_pass_shader_resolve"
    )

    EnumConstant(
        "SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_QCOM".enum(0x00000004),
        "SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM".enum(0x00000008)
    )
}