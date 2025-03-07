/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_pipeline_robustness = "EXTPipelineRobustness".nativeClassVK("EXT_pipeline_robustness", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_PIPELINE_ROBUSTNESS_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_PIPELINE_ROBUSTNESS_EXTENSION_NAME".."VK_EXT_pipeline_robustness"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO_EXT".."1000068000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES_EXT".."1000068001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES_EXT".."1000068002"
    )

    EnumConstant(
        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT_EXT".."0",
        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED_EXT".."1",
        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT".."2",
        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT".."3"
    )

    EnumConstant(
        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT_EXT".."0",
        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED_EXT".."1",
        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_EXT".."2",
        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2_EXT".."3"
    )
}