/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_maintenance11 = "KHRMaintenance11".nativeClassVK("KHR_maintenance11", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_MAINTENANCE_11_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_MAINTENANCE_11_EXTENSION_NAME".."VK_KHR_maintenance11"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_11_FEATURES_KHR".."1000657000",
        "STRUCTURE_TYPE_QUEUE_FAMILY_OPTIMAL_IMAGE_TRANSFER_GRANULARITY_PROPERTIES_KHR".."1000657001"
    )

    EnumConstant(
        "IMAGE_CREATE_ALIAS_SINGLE_LAYER_DESCRIPTOR_BIT_KHR".enum(0x00400000)
    )

    EnumConstant(
        "SHADER_CREATE_INDEPENDENT_SETS_BIT_KHR".enum(0x00040000)
    )

    EnumConstant(
        "PIPELINE_LAYOUT_CREATE_NO_TASK_SHADER_BIT_KHR".enum(0x00000004)
    )
}