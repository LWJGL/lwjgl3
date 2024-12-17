/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_pipeline_creation_feedback = "EXTPipelineCreationFeedback".nativeClassVK("EXT_pipeline_creation_feedback", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_PIPELINE_CREATION_FEEDBACK_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_PIPELINE_CREATION_FEEDBACK_EXTENSION_NAME".."VK_EXT_pipeline_creation_feedback"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO_EXT".."1000192000"
    )

    EnumConstant(
        "PIPELINE_CREATION_FEEDBACK_VALID_BIT_EXT".enum(0x00000001),
        "PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT_EXT".enum(0x00000002),
        "PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT_EXT".enum(0x00000004)
    )
}