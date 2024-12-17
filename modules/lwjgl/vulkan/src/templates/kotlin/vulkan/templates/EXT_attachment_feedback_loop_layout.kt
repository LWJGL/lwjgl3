/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_attachment_feedback_loop_layout = "EXTAttachmentFeedbackLoopLayout".nativeClassVK("EXT_attachment_feedback_loop_layout", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_EXTENSION_NAME".."VK_EXT_attachment_feedback_loop_layout"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_FEATURES_EXT".."1000339000"
    )

    EnumConstant(
        "IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT".."1000339000"
    )

    EnumConstant(
        "IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT".enum(0x00080000)
    )

    EnumConstant(
        "PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT".enum(0x02000000),
        "PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT".enum(0x04000000)
    )

    EnumConstant(
        "DEPENDENCY_FEEDBACK_LOOP_BIT_EXT".enum(0x00000008)
    )
}