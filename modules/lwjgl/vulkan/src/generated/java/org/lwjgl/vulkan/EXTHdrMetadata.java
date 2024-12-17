/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTHdrMetadata {

    public static final int VK_EXT_HDR_METADATA_SPEC_VERSION = 3;

    public static final String VK_EXT_HDR_METADATA_EXTENSION_NAME = "VK_EXT_hdr_metadata";

    public static final int VK_STRUCTURE_TYPE_HDR_METADATA_EXT = 1000105000;

    protected EXTHdrMetadata() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkSetHdrMetadataEXT ] ---

    /** {@code void vkSetHdrMetadataEXT(VkDevice device, uint32_t swapchainCount, VkSwapchainKHR const * pSwapchains, VkHdrMetadataEXT const * pMetadata)} */
    public static void nvkSetHdrMetadataEXT(VkDevice device, int swapchainCount, long pSwapchains, long pMetadata) {
        long __functionAddress = device.getCapabilities().vkSetHdrMetadataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), swapchainCount, pSwapchains, pMetadata, __functionAddress);
    }

    /** {@code void vkSetHdrMetadataEXT(VkDevice device, uint32_t swapchainCount, VkSwapchainKHR const * pSwapchains, VkHdrMetadataEXT const * pMetadata)} */
    public static void vkSetHdrMetadataEXT(VkDevice device, @NativeType("VkSwapchainKHR const *") LongBuffer pSwapchains, @NativeType("VkHdrMetadataEXT const *") VkHdrMetadataEXT.Buffer pMetadata) {
        if (CHECKS) {
            check(pMetadata, pSwapchains.remaining());
        }
        nvkSetHdrMetadataEXT(device, pSwapchains.remaining(), memAddress(pSwapchains), pMetadata.address());
    }

    /** {@code void vkSetHdrMetadataEXT(VkDevice device, uint32_t swapchainCount, VkSwapchainKHR const * pSwapchains, VkHdrMetadataEXT const * pMetadata)} */
    public static void vkSetHdrMetadataEXT(VkDevice device, @NativeType("VkSwapchainKHR const *") long[] pSwapchains, @NativeType("VkHdrMetadataEXT const *") VkHdrMetadataEXT.Buffer pMetadata) {
        long __functionAddress = device.getCapabilities().vkSetHdrMetadataEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pMetadata, pSwapchains.length);
        }
        callPPPV(device.address(), pSwapchains.length, pSwapchains, pMetadata.address(), __functionAddress);
    }

}