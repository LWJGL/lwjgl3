/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_external_memory_capabilities = "KHRExternalMemoryCapabilities".nativeClassVK("KHR_external_memory_capabilities", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME".."VK_KHR_external_memory_capabilities"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHR".."1000071000",
        "STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHR".."1000071001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHR".."1000071002",
        "STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES_KHR".."1000071003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR".."1000071004"
    )

    EnumConstant(
        "LUID_SIZE_KHR".."8"
    )

    EnumConstant(
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR".enum(0x00000001),
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR".enum(0x00000002),
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR".enum(0x00000004),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR".enum(0x00000008),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR".enum(0x00000010),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR".enum(0x00000020),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR".enum(0x00000040)
    )

    EnumConstant(
        "EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR".enum(0x00000001),
        "EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHR".enum(0x00000002),
        "EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHR".enum(0x00000004)
    )

    void(
        "GetPhysicalDeviceExternalBufferPropertiesKHR",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceExternalBufferInfo.const.p("pExternalBufferInfo"),
        VkExternalBufferProperties.p("pExternalBufferProperties")
    )
}