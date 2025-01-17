/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ARM_pipeline_opacity_micromap = "ARMPipelineOpacityMicromap".nativeClassVK("ARM_pipeline_opacity_micromap", type = "device", postfix = "ARM") {
    IntConstant(
        "ARM_PIPELINE_OPACITY_MICROMAP_SPEC_VERSION".."1"
    )

    StringConstant(
        "ARM_PIPELINE_OPACITY_MICROMAP_EXTENSION_NAME".."VK_ARM_pipeline_opacity_micromap"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_OPACITY_MICROMAP_FEATURES_ARM".."1000596000"
    )

    EnumConstantLong(
        "PIPELINE_CREATE_2_DISALLOW_OPACITY_MICROMAP_BIT_ARM".enum(0x2000000000L)
    )
}