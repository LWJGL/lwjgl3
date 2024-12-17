/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_sample_locations = "EXTSampleLocations".nativeClassVK("EXT_sample_locations", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SAMPLE_LOCATIONS_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SAMPLE_LOCATIONS_EXTENSION_NAME".."VK_EXT_sample_locations"
    )

    EnumConstant(
        "IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT".enum(0x00001000)
    )

    EnumConstant(
        "STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT".."1000143000",
        "STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT".."1000143001",
        "STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT".."1000143002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT".."1000143003",
        "STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT".."1000143004"
    )

    EnumConstant(
        "DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT".."1000143000"
    )

    void(
        "CmdSetSampleLocationsEXT",

        VkCommandBuffer("commandBuffer"),
        VkSampleLocationsInfoEXT.const.p("pSampleLocationsInfo")
    )

    void(
        "GetPhysicalDeviceMultisamplePropertiesEXT",

        VkPhysicalDevice("physicalDevice"),
        VkSampleCountFlagBits("samples"),
        VkMultisamplePropertiesEXT.p("pMultisampleProperties")
    )
}