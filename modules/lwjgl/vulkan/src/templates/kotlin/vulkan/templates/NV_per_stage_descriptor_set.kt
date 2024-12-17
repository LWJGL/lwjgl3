/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_per_stage_descriptor_set = "NVPerStageDescriptorSet".nativeClassVK("NV_per_stage_descriptor_set", type = "device", postfix = "NV") {
    IntConstant(
        "NV_PER_STAGE_DESCRIPTOR_SET_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_PER_STAGE_DESCRIPTOR_SET_EXTENSION_NAME".."VK_NV_per_stage_descriptor_set"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PER_STAGE_DESCRIPTOR_SET_FEATURES_NV".."1000516000"
    )

    EnumConstant(
        "DESCRIPTOR_SET_LAYOUT_CREATE_PER_STAGE_BIT_NV".enum(0x00000040)
    )
}