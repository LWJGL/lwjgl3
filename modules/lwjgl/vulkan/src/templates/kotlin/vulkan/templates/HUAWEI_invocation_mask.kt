/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val HUAWEI_invocation_mask = "HUAWEIInvocationMask".nativeClassVK("HUAWEI_invocation_mask", type = "device", postfix = "HUAWEI") {
    IntConstant(
        "HUAWEI_INVOCATION_MASK_SPEC_VERSION".."1"
    )

    StringConstant(
        "HUAWEI_INVOCATION_MASK_EXTENSION_NAME".."VK_HUAWEI_invocation_mask"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI".."1000370000"
    )

    EnumConstantLong(
        "ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI".enum(0x8000000000L)
    )

    EnumConstant(
        "IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI".enum(0x00040000)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI".enum(0x10000000000L)
    )

    void(
        "CmdBindInvocationMaskHUAWEI",

        VkCommandBuffer("commandBuffer"),
        VkImageView("imageView"),
        VkImageLayout("imageLayout")
    )
}