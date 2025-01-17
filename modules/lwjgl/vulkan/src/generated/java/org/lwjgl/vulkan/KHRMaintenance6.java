/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRMaintenance6 {

    public static final int VK_KHR_MAINTENANCE_6_SPEC_VERSION = 1;

    public static final String VK_KHR_MAINTENANCE_6_EXTENSION_NAME = "VK_KHR_maintenance6";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR        = 1000545000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR      = 1000545001,
        VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR                            = 1000545002,
        VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO_KHR                     = 1000545003,
        VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR                           = 1000545004,
        VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR                      = 1000545005,
        VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO_KHR        = 1000545006,
        VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT            = 1000545007,
        VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT = 1000545008;

    protected KHRMaintenance6() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBindDescriptorSets2KHR ] ---

    /** {@code void vkCmdBindDescriptorSets2KHR(VkCommandBuffer commandBuffer, VkBindDescriptorSetsInfo const * pBindDescriptorSetsInfo)} */
    public static void nvkCmdBindDescriptorSets2KHR(VkCommandBuffer commandBuffer, long pBindDescriptorSetsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorSets2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkBindDescriptorSetsInfo.validate(pBindDescriptorSetsInfo);
        }
        callPPV(commandBuffer.address(), pBindDescriptorSetsInfo, __functionAddress);
    }

    /** {@code void vkCmdBindDescriptorSets2KHR(VkCommandBuffer commandBuffer, VkBindDescriptorSetsInfo const * pBindDescriptorSetsInfo)} */
    public static void vkCmdBindDescriptorSets2KHR(VkCommandBuffer commandBuffer, @NativeType("VkBindDescriptorSetsInfo const *") VkBindDescriptorSetsInfo pBindDescriptorSetsInfo) {
        nvkCmdBindDescriptorSets2KHR(commandBuffer, pBindDescriptorSetsInfo.address());
    }

    // --- [ vkCmdPushConstants2KHR ] ---

    /** {@code void vkCmdPushConstants2KHR(VkCommandBuffer commandBuffer, VkPushConstantsInfo const * pPushConstantsInfo)} */
    public static void nvkCmdPushConstants2KHR(VkCommandBuffer commandBuffer, long pPushConstantsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkPushConstantsInfo.validate(pPushConstantsInfo);
        }
        callPPV(commandBuffer.address(), pPushConstantsInfo, __functionAddress);
    }

    /** {@code void vkCmdPushConstants2KHR(VkCommandBuffer commandBuffer, VkPushConstantsInfo const * pPushConstantsInfo)} */
    public static void vkCmdPushConstants2KHR(VkCommandBuffer commandBuffer, @NativeType("VkPushConstantsInfo const *") VkPushConstantsInfo pPushConstantsInfo) {
        nvkCmdPushConstants2KHR(commandBuffer, pPushConstantsInfo.address());
    }

    // --- [ vkCmdPushDescriptorSet2KHR ] ---

    /** {@code void vkCmdPushDescriptorSet2KHR(VkCommandBuffer commandBuffer, VkPushDescriptorSetInfo const * pPushDescriptorSetInfo)} */
    public static void nvkCmdPushDescriptorSet2KHR(VkCommandBuffer commandBuffer, long pPushDescriptorSetInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSet2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkPushDescriptorSetInfo.validate(pPushDescriptorSetInfo);
        }
        callPPV(commandBuffer.address(), pPushDescriptorSetInfo, __functionAddress);
    }

    /** {@code void vkCmdPushDescriptorSet2KHR(VkCommandBuffer commandBuffer, VkPushDescriptorSetInfo const * pPushDescriptorSetInfo)} */
    public static void vkCmdPushDescriptorSet2KHR(VkCommandBuffer commandBuffer, @NativeType("VkPushDescriptorSetInfo const *") VkPushDescriptorSetInfo pPushDescriptorSetInfo) {
        nvkCmdPushDescriptorSet2KHR(commandBuffer, pPushDescriptorSetInfo.address());
    }

    // --- [ vkCmdPushDescriptorSetWithTemplate2KHR ] ---

    /** {@code void vkCmdPushDescriptorSetWithTemplate2KHR(VkCommandBuffer commandBuffer, VkPushDescriptorSetWithTemplateInfo const * pPushDescriptorSetWithTemplateInfo)} */
    public static void nvkCmdPushDescriptorSetWithTemplate2KHR(VkCommandBuffer commandBuffer, long pPushDescriptorSetWithTemplateInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSetWithTemplate2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkPushDescriptorSetWithTemplateInfo.validate(pPushDescriptorSetWithTemplateInfo);
        }
        callPPV(commandBuffer.address(), pPushDescriptorSetWithTemplateInfo, __functionAddress);
    }

    /** {@code void vkCmdPushDescriptorSetWithTemplate2KHR(VkCommandBuffer commandBuffer, VkPushDescriptorSetWithTemplateInfo const * pPushDescriptorSetWithTemplateInfo)} */
    public static void vkCmdPushDescriptorSetWithTemplate2KHR(VkCommandBuffer commandBuffer, @NativeType("VkPushDescriptorSetWithTemplateInfo const *") VkPushDescriptorSetWithTemplateInfo pPushDescriptorSetWithTemplateInfo) {
        nvkCmdPushDescriptorSetWithTemplate2KHR(commandBuffer, pPushDescriptorSetWithTemplateInfo.address());
    }

    // --- [ vkCmdSetDescriptorBufferOffsets2EXT ] ---

    /** {@code void vkCmdSetDescriptorBufferOffsets2EXT(VkCommandBuffer commandBuffer, VkSetDescriptorBufferOffsetsInfoEXT const * pSetDescriptorBufferOffsetsInfo)} */
    public static void nvkCmdSetDescriptorBufferOffsets2EXT(VkCommandBuffer commandBuffer, long pSetDescriptorBufferOffsetsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDescriptorBufferOffsets2EXT;
        if (CHECKS) {
            check(__functionAddress);
            VkSetDescriptorBufferOffsetsInfoEXT.validate(pSetDescriptorBufferOffsetsInfo);
        }
        callPPV(commandBuffer.address(), pSetDescriptorBufferOffsetsInfo, __functionAddress);
    }

    /** {@code void vkCmdSetDescriptorBufferOffsets2EXT(VkCommandBuffer commandBuffer, VkSetDescriptorBufferOffsetsInfoEXT const * pSetDescriptorBufferOffsetsInfo)} */
    public static void vkCmdSetDescriptorBufferOffsets2EXT(VkCommandBuffer commandBuffer, @NativeType("VkSetDescriptorBufferOffsetsInfoEXT const *") VkSetDescriptorBufferOffsetsInfoEXT pSetDescriptorBufferOffsetsInfo) {
        nvkCmdSetDescriptorBufferOffsets2EXT(commandBuffer, pSetDescriptorBufferOffsetsInfo.address());
    }

    // --- [ vkCmdBindDescriptorBufferEmbeddedSamplers2EXT ] ---

    /** {@code void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT(VkCommandBuffer commandBuffer, VkBindDescriptorBufferEmbeddedSamplersInfoEXT const * pBindDescriptorBufferEmbeddedSamplersInfo)} */
    public static void nvkCmdBindDescriptorBufferEmbeddedSamplers2EXT(VkCommandBuffer commandBuffer, long pBindDescriptorBufferEmbeddedSamplersInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorBufferEmbeddedSamplers2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pBindDescriptorBufferEmbeddedSamplersInfo, __functionAddress);
    }

    /** {@code void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT(VkCommandBuffer commandBuffer, VkBindDescriptorBufferEmbeddedSamplersInfoEXT const * pBindDescriptorBufferEmbeddedSamplersInfo)} */
    public static void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT(VkCommandBuffer commandBuffer, @NativeType("VkBindDescriptorBufferEmbeddedSamplersInfoEXT const *") VkBindDescriptorBufferEmbeddedSamplersInfoEXT pBindDescriptorBufferEmbeddedSamplersInfo) {
        nvkCmdBindDescriptorBufferEmbeddedSamplers2EXT(commandBuffer, pBindDescriptorBufferEmbeddedSamplersInfo.address());
    }

}