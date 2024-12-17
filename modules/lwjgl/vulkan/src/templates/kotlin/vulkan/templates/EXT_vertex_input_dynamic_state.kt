/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_vertex_input_dynamic_state = "EXTVertexInputDynamicState".nativeClassVK("EXT_vertex_input_dynamic_state", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_VERTEX_INPUT_DYNAMIC_STATE_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_VERTEX_INPUT_DYNAMIC_STATE_EXTENSION_NAME".."VK_EXT_vertex_input_dynamic_state"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_INPUT_DYNAMIC_STATE_FEATURES_EXT".."1000352000",
        "STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT".."1000352001",
        "STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT".."1000352002"
    )

    EnumConstant(
        "DYNAMIC_STATE_VERTEX_INPUT_EXT".."1000352000"
    )

    void(
        "CmdSetVertexInputEXT",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pVertexBindingDescriptions")..uint32_t("vertexBindingDescriptionCount"),
        nullable..VkVertexInputBindingDescription2EXT.const.p("pVertexBindingDescriptions"),
        AutoSize("pVertexAttributeDescriptions")..uint32_t("vertexAttributeDescriptionCount"),
        nullable..VkVertexInputAttributeDescription2EXT.const.p("pVertexAttributeDescriptions")
    )
}