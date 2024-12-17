/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_descriptor_pool_overallocation = "NVDescriptorPoolOverallocation".nativeClassVK("NV_descriptor_pool_overallocation", type = "device", postfix = "NV") {
    IntConstant(
        "NV_DESCRIPTOR_POOL_OVERALLOCATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_DESCRIPTOR_POOL_OVERALLOCATION_EXTENSION_NAME".."VK_NV_descriptor_pool_overallocation"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV".."1000546000"
    )

    EnumConstant(
        "DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_SETS_BIT_NV".enum(0x00000008),
        "DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_POOLS_BIT_NV".enum(0x00000010)
    )
}