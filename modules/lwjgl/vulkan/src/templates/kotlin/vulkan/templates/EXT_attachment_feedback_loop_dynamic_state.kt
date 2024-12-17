/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_attachment_feedback_loop_dynamic_state = "EXTAttachmentFeedbackLoopDynamicState".nativeClassVK("EXT_attachment_feedback_loop_dynamic_state", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_EXTENSION_NAME".."VK_EXT_attachment_feedback_loop_dynamic_state"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT".."1000524000"
    )

    EnumConstant(
        "DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT".."1000524000"
    )

    void(
        "CmdSetAttachmentFeedbackLoopEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkImageAspectFlags("aspectMask")
    )
}