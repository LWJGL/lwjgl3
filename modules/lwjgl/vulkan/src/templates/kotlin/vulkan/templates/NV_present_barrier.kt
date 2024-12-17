/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_present_barrier = "NVPresentBarrier".nativeClassVK("NV_present_barrier", type = "device", postfix = "NV") {
    IntConstant(
        "NV_PRESENT_BARRIER_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_PRESENT_BARRIER_EXTENSION_NAME".."VK_NV_present_barrier"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_BARRIER_FEATURES_NV".."1000292000",
        "STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_BARRIER_NV".."1000292001",
        "STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV".."1000292002"
    )
}