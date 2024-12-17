/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_rasterization_order = "AMDRasterizationOrder".nativeClassVK("AMD_rasterization_order", type = "device", postfix = "AMD") {
    IntConstant(
        "AMD_RASTERIZATION_ORDER_SPEC_VERSION".."1"
    )

    StringConstant(
        "AMD_RASTERIZATION_ORDER_EXTENSION_NAME".."VK_AMD_rasterization_order"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD".."1000018000"
    )

    EnumConstant(
        "RASTERIZATION_ORDER_STRICT_AMD".."0",
        "RASTERIZATION_ORDER_RELAXED_AMD".."1"
    )
}