/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_external_memory_capabilities = "NVExternalMemoryCapabilities".nativeClassVK("NV_external_memory_capabilities", type = "instance", postfix = "NV") {
    IntConstant(
        "NV_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME".."VK_NV_external_memory_capabilities"
    )

    EnumConstant(
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV".enum(0x00000001),
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV".enum(0x00000002),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV".enum(0x00000004),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV".enum(0x00000008)
    )

    EnumConstant(
        "EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV".enum(0x00000001),
        "EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV".enum(0x00000002),
        "EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV".enum(0x00000004)
    )

    VkResult(
        "GetPhysicalDeviceExternalImageFormatPropertiesNV",

        VkPhysicalDevice("physicalDevice"),
        VkFormat("format"),
        VkImageType("type"),
        VkImageTiling("tiling"),
        VkImageUsageFlags("usage"),
        VkImageCreateFlags("flags"),
        VkExternalMemoryHandleTypeFlagsNV("externalHandleType"),
        VkExternalImageFormatPropertiesNV.p("pExternalImageFormatProperties")
    )
}