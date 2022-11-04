/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ktx.templates

import org.lwjgl.generator.*
import ktx.*
import vulkan.*

val ktxvulkan = "KTXVulkan".nativeClass(Module.KTX, prefix = "KTX", binding = KTX_BINDING_DELEGATE) {
    javaImport("org.lwjgl.vulkan.*")

    void(
        "VulkanTexture_Destruct",
        "",

        ktxVulkanTexture.p("This", ""),
        VkDevice("device", ""),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "")
    )

    ktxVulkanDeviceInfo.p(
        "VulkanDeviceInfo_CreateEx",
        "",

        VkInstance("instance", ""),
        VkPhysicalDevice("physicalDevice", ""),
        VkDevice("device", ""),
        VkQueue("queue", ""),
        VkCommandPool("cmdPool", ""),
        nullable..VkAllocationCallbacks.const.p("pAllocator", ""),
        ktxVulkanFunctions.const.p("pFunctions", "")
    )

    ktxVulkanDeviceInfo.p(
        "VulkanDeviceInfo_Create",
        "",

        VkPhysicalDevice("physicalDevice", ""),
        VkDevice("device", ""),
        VkQueue("queue", ""),
        VkCommandPool("cmdPool", ""),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "")
    )

    ktx_error_code_e(
        "VulkanDeviceInfo_Construct",
        "",

        ktxVulkanDeviceInfo.p("This", ""),
        VkPhysicalDevice("physicalDevice", ""),
        VkDevice("device", ""),
        VkQueue("queue", ""),
        VkCommandPool("cmdPool", ""),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "")
    )

    ktx_error_code_e(
        "VulkanDeviceInfo_ConstructEx",
        "",

        ktxVulkanDeviceInfo.p("This", ""),
        VkInstance("instance", ""),
        VkPhysicalDevice("physicalDevice", ""),
        VkDevice("device", ""),
        VkQueue("queue", ""),
        VkCommandPool("cmdPool", ""),
        nullable..VkAllocationCallbacks.const.p("pAllocator", ""),
        ktxVulkanFunctions.const.p("pFunctions", "")
    )

    void(
        "VulkanDeviceInfo_Destruct",
        "",

        ktxVulkanDeviceInfo.p("This", "")
    )

    void(
        "VulkanDeviceInfo_Destroy",
        "",

        ktxVulkanDeviceInfo.p("This", "")
    )

    ktx_error_code_e(
        "Texture_VkUploadEx",
        "",

        ktxTexture.p("This", ""),
        ktxVulkanDeviceInfo.p("vdi", ""),
        ktxVulkanTexture.p("vkTexture", ""),
        VkImageTiling("tiling", ""),
        VkImageUsageFlags("usageFlags", ""),
        VkImageLayout("finalLayout", "")
    )

    ktx_error_code_e(
        "Texture_VkUpload",
        "",

        ktxTexture.p("texture", ""),
        ktxVulkanDeviceInfo.p("vdi", ""),
        ktxVulkanTexture.p("vkTexture", "")
    )

    ktx_error_code_e(
        "Texture1_VkUploadEx",
        "",

        ktxTexture1.p("This", ""),
        ktxVulkanDeviceInfo.p("vdi", ""),
        ktxVulkanTexture.p("vkTexture", ""),
        VkImageTiling("tiling", ""),
        VkImageUsageFlags("usageFlags", ""),
        VkImageLayout("finalLayout", "")
    )

    ktx_error_code_e(
        "Texture1_VkUpload",
        "",

        ktxTexture1.p("texture", ""),
        ktxVulkanDeviceInfo.p("vdi", ""),
        ktxVulkanTexture.p("vkTexture", "")
    )

    ktx_error_code_e(
        "Texture2_VkUploadEx",
        "",

        ktxTexture2.p("This", ""),
        ktxVulkanDeviceInfo.p("vdi", ""),
        ktxVulkanTexture.p("vkTexture", ""),
        VkImageTiling("tiling", ""),
        VkImageUsageFlags("usageFlags", ""),
        VkImageLayout("finalLayout", "")
    )

    ktx_error_code_e(
        "Texture2_VkUpload",
        "",

        ktxTexture2.p("texture", ""),
        ktxVulkanDeviceInfo.p("vdi", ""),
        ktxVulkanTexture.p("vkTexture", "")
    )

    VkFormat(
        "Texture_GetVkFormat",
        "",

        ktxTexture.p("This", "")
    )

    VkFormat(
        "Texture1_GetVkFormat",
        "",

        ktxTexture1.p("This", "")
    )

    VkFormat(
        "Texture2_GetVkFormat",
        "",

        ktxTexture2.p("This", "")
    )
}
