/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTHostImageCopy {

    public static final int VK_EXT_HOST_IMAGE_COPY_SPEC_VERSION = 1;

    public static final String VK_EXT_HOST_IMAGE_COPY_EXTENSION_NAME = "VK_EXT_host_image_copy";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT   = 1000270000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT = 1000270001,
        VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT                       = 1000270002,
        VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY_EXT                       = 1000270003,
        VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT                  = 1000270004,
        VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO_EXT                  = 1000270005,
        VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT          = 1000270006,
        VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO_EXT                   = 1000270007,
        VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT               = 1000270008,
        VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT   = 1000270009;

    public static final int VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT = 0x400000;

    public static final long VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT_EXT = 0x400000000000L;

    public static final int VK_HOST_IMAGE_COPY_MEMCPY_EXT = 0x1;

    protected EXTHostImageCopy() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCopyMemoryToImageEXT ] ---

    /** {@code VkResult vkCopyMemoryToImageEXT(VkDevice device, VkCopyMemoryToImageInfo const * pCopyMemoryToImageInfo)} */
    public static int nvkCopyMemoryToImageEXT(VkDevice device, long pCopyMemoryToImageInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMemoryToImageEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyMemoryToImageInfo.validate(pCopyMemoryToImageInfo);
        }
        return callPPI(device.address(), pCopyMemoryToImageInfo, __functionAddress);
    }

    /** {@code VkResult vkCopyMemoryToImageEXT(VkDevice device, VkCopyMemoryToImageInfo const * pCopyMemoryToImageInfo)} */
    @NativeType("VkResult")
    public static int vkCopyMemoryToImageEXT(VkDevice device, @NativeType("VkCopyMemoryToImageInfo const *") VkCopyMemoryToImageInfo pCopyMemoryToImageInfo) {
        return nvkCopyMemoryToImageEXT(device, pCopyMemoryToImageInfo.address());
    }

    // --- [ vkCopyImageToMemoryEXT ] ---

    /** {@code VkResult vkCopyImageToMemoryEXT(VkDevice device, VkCopyImageToMemoryInfo const * pCopyImageToMemoryInfo)} */
    public static int nvkCopyImageToMemoryEXT(VkDevice device, long pCopyImageToMemoryInfo) {
        long __functionAddress = device.getCapabilities().vkCopyImageToMemoryEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageToMemoryInfo.validate(pCopyImageToMemoryInfo);
        }
        return callPPI(device.address(), pCopyImageToMemoryInfo, __functionAddress);
    }

    /** {@code VkResult vkCopyImageToMemoryEXT(VkDevice device, VkCopyImageToMemoryInfo const * pCopyImageToMemoryInfo)} */
    @NativeType("VkResult")
    public static int vkCopyImageToMemoryEXT(VkDevice device, @NativeType("VkCopyImageToMemoryInfo const *") VkCopyImageToMemoryInfo pCopyImageToMemoryInfo) {
        return nvkCopyImageToMemoryEXT(device, pCopyImageToMemoryInfo.address());
    }

    // --- [ vkCopyImageToImageEXT ] ---

    /** {@code VkResult vkCopyImageToImageEXT(VkDevice device, VkCopyImageToImageInfo const * pCopyImageToImageInfo)} */
    public static int nvkCopyImageToImageEXT(VkDevice device, long pCopyImageToImageInfo) {
        long __functionAddress = device.getCapabilities().vkCopyImageToImageEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageToImageInfo.validate(pCopyImageToImageInfo);
        }
        return callPPI(device.address(), pCopyImageToImageInfo, __functionAddress);
    }

    /** {@code VkResult vkCopyImageToImageEXT(VkDevice device, VkCopyImageToImageInfo const * pCopyImageToImageInfo)} */
    @NativeType("VkResult")
    public static int vkCopyImageToImageEXT(VkDevice device, @NativeType("VkCopyImageToImageInfo const *") VkCopyImageToImageInfo pCopyImageToImageInfo) {
        return nvkCopyImageToImageEXT(device, pCopyImageToImageInfo.address());
    }

    // --- [ vkTransitionImageLayoutEXT ] ---

    /** {@code VkResult vkTransitionImageLayoutEXT(VkDevice device, uint32_t transitionCount, VkHostImageLayoutTransitionInfo const * pTransitions)} */
    public static int nvkTransitionImageLayoutEXT(VkDevice device, int transitionCount, long pTransitions) {
        long __functionAddress = device.getCapabilities().vkTransitionImageLayoutEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), transitionCount, pTransitions, __functionAddress);
    }

    /** {@code VkResult vkTransitionImageLayoutEXT(VkDevice device, uint32_t transitionCount, VkHostImageLayoutTransitionInfo const * pTransitions)} */
    @NativeType("VkResult")
    public static int vkTransitionImageLayoutEXT(VkDevice device, @NativeType("VkHostImageLayoutTransitionInfo const *") VkHostImageLayoutTransitionInfo.Buffer pTransitions) {
        return nvkTransitionImageLayoutEXT(device, pTransitions.remaining(), pTransitions.address());
    }

    // --- [ vkGetImageSubresourceLayout2EXT ] ---

    /** {@code void vkGetImageSubresourceLayout2EXT(VkDevice device, VkImage image, VkImageSubresource2 const * pSubresource, VkSubresourceLayout2 * pLayout)} */
    public static void nvkGetImageSubresourceLayout2EXT(VkDevice device, long image, long pSubresource, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetImageSubresourceLayout2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPPV(device.address(), image, pSubresource, pLayout, __functionAddress);
    }

    /** {@code void vkGetImageSubresourceLayout2EXT(VkDevice device, VkImage image, VkImageSubresource2 const * pSubresource, VkSubresourceLayout2 * pLayout)} */
    public static void vkGetImageSubresourceLayout2EXT(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageSubresource2 const *") VkImageSubresource2 pSubresource, @NativeType("VkSubresourceLayout2 *") VkSubresourceLayout2 pLayout) {
        nvkGetImageSubresourceLayout2EXT(device, image, pSubresource.address(), pLayout.address());
    }

}