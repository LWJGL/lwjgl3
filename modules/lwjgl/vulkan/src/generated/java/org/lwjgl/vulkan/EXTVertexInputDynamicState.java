/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTVertexInputDynamicState {

    public static final int VK_EXT_VERTEX_INPUT_DYNAMIC_STATE_SPEC_VERSION = 2;

    public static final String VK_EXT_VERTEX_INPUT_DYNAMIC_STATE_EXTENSION_NAME = "VK_EXT_vertex_input_dynamic_state";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_INPUT_DYNAMIC_STATE_FEATURES_EXT = 1000352000,
        VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT                  = 1000352001,
        VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT                = 1000352002;

    public static final int VK_DYNAMIC_STATE_VERTEX_INPUT_EXT = 1000352000;

    protected EXTVertexInputDynamicState() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetVertexInputEXT ] ---

    /** {@code void vkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, uint32_t vertexBindingDescriptionCount, VkVertexInputBindingDescription2EXT const * pVertexBindingDescriptions, uint32_t vertexAttributeDescriptionCount, VkVertexInputAttributeDescription2EXT const * pVertexAttributeDescriptions)} */
    public static void nvkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, int vertexBindingDescriptionCount, long pVertexBindingDescriptions, int vertexAttributeDescriptionCount, long pVertexAttributeDescriptions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetVertexInputEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), vertexBindingDescriptionCount, pVertexBindingDescriptions, vertexAttributeDescriptionCount, pVertexAttributeDescriptions, __functionAddress);
    }

    /** {@code void vkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, uint32_t vertexBindingDescriptionCount, VkVertexInputBindingDescription2EXT const * pVertexBindingDescriptions, uint32_t vertexAttributeDescriptionCount, VkVertexInputAttributeDescription2EXT const * pVertexAttributeDescriptions)} */
    public static void vkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, @NativeType("VkVertexInputBindingDescription2EXT const *") VkVertexInputBindingDescription2EXT.@Nullable Buffer pVertexBindingDescriptions, @NativeType("VkVertexInputAttributeDescription2EXT const *") VkVertexInputAttributeDescription2EXT.@Nullable Buffer pVertexAttributeDescriptions) {
        nvkCmdSetVertexInputEXT(commandBuffer, remainingSafe(pVertexBindingDescriptions), memAddressSafe(pVertexBindingDescriptions), remainingSafe(pVertexAttributeDescriptions), memAddressSafe(pVertexAttributeDescriptions));
    }

}