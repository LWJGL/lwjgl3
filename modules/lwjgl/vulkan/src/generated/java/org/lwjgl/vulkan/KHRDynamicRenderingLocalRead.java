/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRDynamicRenderingLocalRead {

    public static final int VK_KHR_DYNAMIC_RENDERING_LOCAL_READ_SPEC_VERSION = 1;

    public static final String VK_KHR_DYNAMIC_RENDERING_LOCAL_READ_EXTENSION_NAME = "VK_KHR_dynamic_rendering_local_read";

    public static final int VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ_KHR = 1000232000;

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES_KHR = 1000232000,
        VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO_KHR                    = 1000232001,
        VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR                 = 1000232002;

    protected KHRDynamicRenderingLocalRead() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetRenderingAttachmentLocationsKHR ] ---

    /** {@code void vkCmdSetRenderingAttachmentLocationsKHR(VkCommandBuffer commandBuffer, VkRenderingAttachmentLocationInfo const * pLocationInfo)} */
    public static void nvkCmdSetRenderingAttachmentLocationsKHR(VkCommandBuffer commandBuffer, long pLocationInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRenderingAttachmentLocationsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pLocationInfo, __functionAddress);
    }

    /** {@code void vkCmdSetRenderingAttachmentLocationsKHR(VkCommandBuffer commandBuffer, VkRenderingAttachmentLocationInfo const * pLocationInfo)} */
    public static void vkCmdSetRenderingAttachmentLocationsKHR(VkCommandBuffer commandBuffer, @NativeType("VkRenderingAttachmentLocationInfo const *") VkRenderingAttachmentLocationInfo pLocationInfo) {
        nvkCmdSetRenderingAttachmentLocationsKHR(commandBuffer, pLocationInfo.address());
    }

    // --- [ vkCmdSetRenderingInputAttachmentIndicesKHR ] ---

    /** {@code void vkCmdSetRenderingInputAttachmentIndicesKHR(VkCommandBuffer commandBuffer, VkRenderingInputAttachmentIndexInfo const * pInputAttachmentIndexInfo)} */
    public static void nvkCmdSetRenderingInputAttachmentIndicesKHR(VkCommandBuffer commandBuffer, long pInputAttachmentIndexInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRenderingInputAttachmentIndicesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInputAttachmentIndexInfo, __functionAddress);
    }

    /** {@code void vkCmdSetRenderingInputAttachmentIndicesKHR(VkCommandBuffer commandBuffer, VkRenderingInputAttachmentIndexInfo const * pInputAttachmentIndexInfo)} */
    public static void vkCmdSetRenderingInputAttachmentIndicesKHR(VkCommandBuffer commandBuffer, @NativeType("VkRenderingInputAttachmentIndexInfo const *") VkRenderingInputAttachmentIndexInfo pInputAttachmentIndexInfo) {
        nvkCmdSetRenderingInputAttachmentIndicesKHR(commandBuffer, pInputAttachmentIndexInfo.address());
    }

}