/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_device_group = "KHRDeviceGroup".nativeClassVK("KHR_device_group", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_DEVICE_GROUP_SPEC_VERSION".."4"
    )

    StringConstant(
        "KHR_DEVICE_GROUP_EXTENSION_NAME".."VK_KHR_device_group"
    )

    EnumConstant(
        "STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHR".."1000060000",
        "STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR".."1000060003",
        "STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR".."1000060004",
        "STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHR".."1000060005",
        "STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHR".."1000060006",
        "STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR".."1000060007",
        "STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR".."1000060008",
        "STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR".."1000060009",
        "STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR".."1000060010",
        "STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR".."1000060011",
        "STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR".."1000060012",
        "STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR".."1000060013",
        "STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR".."1000060014"
    )

    EnumConstant(
        "PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR".enum(0x00000001),
        "PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR".enum(0x00000002),
        "PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR".enum(0x00000004),
        "PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR".enum(0x00000008)
    )

    EnumConstant(
        "MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR".enum(0x00000001)
    )

    EnumConstant(
        "PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR".enum(0x00000008),
        "PIPELINE_CREATE_DISPATCH_BASE_BIT_KHR".enum(0x00000010),
        "PIPELINE_CREATE_DISPATCH_BASE_KHR".enum(0x00000010)
    )

    EnumConstant(
        "DEPENDENCY_DEVICE_GROUP_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        "IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR".enum(0x00000040)
    )

    EnumConstant(
        "SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR".enum(0x00000001)
    )

    void(
        "GetDeviceGroupPeerMemoryFeaturesKHR",

        VkDevice("device"),
        uint32_t("heapIndex"),
        uint32_t("localDeviceIndex"),
        uint32_t("remoteDeviceIndex"),
        Check(1)..VkPeerMemoryFeatureFlags.p("pPeerMemoryFeatures")
    )

    void(
        "CmdSetDeviceMaskKHR",

        VkCommandBuffer("commandBuffer"),
        uint32_t("deviceMask")
    )

    void(
        "CmdDispatchBaseKHR",

        VkCommandBuffer("commandBuffer"),
        uint32_t("baseGroupX"),
        uint32_t("baseGroupY"),
        uint32_t("baseGroupZ"),
        uint32_t("groupCountX"),
        uint32_t("groupCountY"),
        uint32_t("groupCountZ")
    )

    DependsOn("VK_KHR_surface")..VkResult(
        "GetDeviceGroupPresentCapabilitiesKHR",

        VkDevice("device"),
        VkDeviceGroupPresentCapabilitiesKHR.p("pDeviceGroupPresentCapabilities")
    )

    DependsOn("VK_KHR_surface")..VkResult(
        "GetDeviceGroupSurfacePresentModesKHR",

        VkDevice("device"),
        VkSurfaceKHR("surface"),
        Check(1)..VkDeviceGroupPresentModeFlagsKHR.p("pModes")
    )

    DependsOn("VK_KHR_surface")..VkResult(
        "GetPhysicalDevicePresentRectanglesKHR",

        VkPhysicalDevice("physicalDevice"),
        VkSurfaceKHR("surface"),
        AutoSize("pRects")..Check(1)..uint32_t.p("pRectCount"),
        nullable..VkRect2D.p("pRects")
    )

    DependsOn("VK_KHR_swapchain")..VkResult(
        "AcquireNextImage2KHR",

        VkDevice("device"),
        VkAcquireNextImageInfoKHR.const.p("pAcquireInfo"),
        Check(1)..uint32_t.p("pImageIndex")
    )
}