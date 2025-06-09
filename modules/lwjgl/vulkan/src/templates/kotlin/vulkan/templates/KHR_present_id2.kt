/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_present_id2 = "KHRPresentId2".nativeClassVK("KHR_present_id2", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_PRESENT_ID_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_PRESENT_ID_2_EXTENSION_NAME".."VK_KHR_present_id2"
    )

    EnumConstant(
        "SWAPCHAIN_CREATE_PRESENT_ID_2_BIT_KHR".enum(0x00000040)
    )

    EnumConstant(
        "STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_ID_2_KHR".."1000479000",
        "STRUCTURE_TYPE_PRESENT_ID_2_KHR".."1000479001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_2_FEATURES_KHR".."1000479002"
    )
}