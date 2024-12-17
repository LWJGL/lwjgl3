/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_buffer_marker = "AMDBufferMarker".nativeClassVK("AMD_buffer_marker", type = "device", postfix = "AMD") {
    IntConstant(
        "AMD_BUFFER_MARKER_SPEC_VERSION".."1"
    )

    StringConstant(
        "AMD_BUFFER_MARKER_EXTENSION_NAME".."VK_AMD_buffer_marker"
    )

    void(
        "CmdWriteBufferMarkerAMD",

        VkCommandBuffer("commandBuffer"),
        VkPipelineStageFlagBits("pipelineStage"),
        VkBuffer("dstBuffer"),
        VkDeviceSize("dstOffset"),
        uint32_t("marker")
    )

    DependsOn("""ext.contains("Vulkan13") || ext.contains("VK_KHR_synchronization2")""")..void(
        "CmdWriteBufferMarker2AMD",

        VkCommandBuffer("commandBuffer"),
        VkPipelineStageFlags2("stage"),
        VkBuffer("dstBuffer"),
        VkDeviceSize("dstOffset"),
        uint32_t("marker")
    )
}