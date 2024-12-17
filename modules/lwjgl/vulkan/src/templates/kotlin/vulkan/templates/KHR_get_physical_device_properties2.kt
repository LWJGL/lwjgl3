/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_get_physical_device_properties2 = "KHRGetPhysicalDeviceProperties2".nativeClassVK("KHR_get_physical_device_properties2", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION".."2"
    )

    StringConstant(
        "KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME".."VK_KHR_get_physical_device_properties2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR".."1000059000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2_KHR".."1000059001",
        "STRUCTURE_TYPE_FORMAT_PROPERTIES_2_KHR".."1000059002",
        "STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2_KHR".."1000059003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR".."1000059004",
        "STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2_KHR".."1000059005",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR".."1000059006",
        "STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR".."1000059007",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR".."1000059008"
    )

    void(
        "GetPhysicalDeviceFeatures2KHR",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceFeatures2.p("pFeatures")
    )

    void(
        "GetPhysicalDeviceProperties2KHR",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceProperties2.p("pProperties")
    )

    void(
        "GetPhysicalDeviceFormatProperties2KHR",

        VkPhysicalDevice("physicalDevice"),
        VkFormat("format"),
        VkFormatProperties2.p("pFormatProperties")
    )

    VkResult(
        "GetPhysicalDeviceImageFormatProperties2KHR",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceImageFormatInfo2.const.p("pImageFormatInfo"),
        VkImageFormatProperties2.p("pImageFormatProperties")
    )

    void(
        "GetPhysicalDeviceQueueFamilyProperties2KHR",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pQueueFamilyProperties")..Check(1)..uint32_t.p("pQueueFamilyPropertyCount"),
        nullable..VkQueueFamilyProperties2.p("pQueueFamilyProperties")
    )

    void(
        "GetPhysicalDeviceMemoryProperties2KHR",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceMemoryProperties2.p("pMemoryProperties")
    )

    void(
        "GetPhysicalDeviceSparseImageFormatProperties2KHR",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceSparseImageFormatInfo2.const.p("pFormatInfo"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkSparseImageFormatProperties2.p("pProperties")
    )
}