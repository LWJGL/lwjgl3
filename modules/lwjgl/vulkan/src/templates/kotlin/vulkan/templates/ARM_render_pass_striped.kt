/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ARM_render_pass_striped = "ARMRenderPassStriped".nativeClassVK("ARM_render_pass_striped", type = "device", postfix = "ARM") {
    IntConstant(
        "ARM_RENDER_PASS_STRIPED_SPEC_VERSION".."1"
    )

    StringConstant(
        "ARM_RENDER_PASS_STRIPED_EXTENSION_NAME".."VK_ARM_render_pass_striped"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM".."1000424000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM".."1000424001",
        "STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM".."1000424002",
        "STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM".."1000424003",
        "STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM".."1000424004"
    )
}