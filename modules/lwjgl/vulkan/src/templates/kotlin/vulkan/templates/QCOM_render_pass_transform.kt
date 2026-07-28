/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_render_pass_transform = "QCOMRenderPassTransform".nativeClassVK("QCOM_render_pass_transform", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_RENDER_PASS_TRANSFORM_SPEC_VERSION".."5"
    )

    StringConstant(
        "QCOM_RENDER_PASS_TRANSFORM_EXTENSION_NAME".."VK_QCOM_render_pass_transform"
    )

    EnumConstant(
        "STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM".."1000282000",
        "STRUCTURE_TYPE_RENDER_PASS_TRANSFORM_BEGIN_INFO_QCOM".."1000282001"
    )

    EnumConstant(
        "RENDER_PASS_CREATE_TRANSFORM_BIT_QCOM".enum(0x00000002)
    )
}