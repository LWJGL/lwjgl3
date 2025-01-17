/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_external_semaphore_capabilities = "KHRExternalSemaphoreCapabilities".nativeClassVK("KHR_external_semaphore_capabilities", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_EXTENSION_NAME".."VK_KHR_external_semaphore_capabilities"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR".."1000071004",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHR".."1000076000",
        "STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES_KHR".."1000076001"
    )

    EnumConstant(
        "LUID_SIZE_KHR".."8"
    )

    EnumConstant(
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR".enum(0x00000001),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR".enum(0x00000002),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR".enum(0x00000004),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR".enum(0x00000008),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR".enum(0x00000010)
    )

    EnumConstant(
        "EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR".enum(0x00000001),
        "EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR".enum(0x00000002)
    )

    void(
        "GetPhysicalDeviceExternalSemaphorePropertiesKHR",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceExternalSemaphoreInfo.const.p("pExternalSemaphoreInfo"),
        VkExternalSemaphoreProperties.p("pExternalSemaphoreProperties")
    )
}