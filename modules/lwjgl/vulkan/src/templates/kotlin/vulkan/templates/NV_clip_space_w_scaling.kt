/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_clip_space_w_scaling = "NVClipSpaceWScaling".nativeClassVK("NV_clip_space_w_scaling", type = "device", postfix = "NV") {
    IntConstant(
        "NV_CLIP_SPACE_W_SCALING_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME".."VK_NV_clip_space_w_scaling"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV".."1000087000"
    )

    EnumConstant(
        "DYNAMIC_STATE_VIEWPORT_W_SCALING_NV".."1000087000"
    )

    void(
        "CmdSetViewportWScalingNV",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstViewport"),
        AutoSize("pViewportWScalings")..uint32_t("viewportCount"),
        VkViewportWScalingNV.const.p("pViewportWScalings")
    )
}