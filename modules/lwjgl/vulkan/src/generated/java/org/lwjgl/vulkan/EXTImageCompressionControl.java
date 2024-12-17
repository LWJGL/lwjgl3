/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTImageCompressionControl {

    public static final int VK_EXT_IMAGE_COMPRESSION_CONTROL_SPEC_VERSION = 1;

    public static final String VK_EXT_IMAGE_COMPRESSION_CONTROL_EXTENSION_NAME = "VK_EXT_image_compression_control";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT = 1000338000,
        VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT                          = 1000338001,
        VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT                               = 1000338002,
        VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_EXT                                = 1000338003,
        VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT                       = 1000338004;

    public static final int VK_ERROR_COMPRESSION_EXHAUSTED_EXT = -1000338000;

    public static final int
        VK_IMAGE_COMPRESSION_DEFAULT_EXT             = 0,
        VK_IMAGE_COMPRESSION_FIXED_RATE_DEFAULT_EXT  = 0x1,
        VK_IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT = 0x2,
        VK_IMAGE_COMPRESSION_DISABLED_EXT            = 0x4;

    public static final int
        VK_IMAGE_COMPRESSION_FIXED_RATE_NONE_EXT      = 0,
        VK_IMAGE_COMPRESSION_FIXED_RATE_1BPC_BIT_EXT  = 0x1,
        VK_IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT  = 0x2,
        VK_IMAGE_COMPRESSION_FIXED_RATE_3BPC_BIT_EXT  = 0x4,
        VK_IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT  = 0x8,
        VK_IMAGE_COMPRESSION_FIXED_RATE_5BPC_BIT_EXT  = 0x10,
        VK_IMAGE_COMPRESSION_FIXED_RATE_6BPC_BIT_EXT  = 0x20,
        VK_IMAGE_COMPRESSION_FIXED_RATE_7BPC_BIT_EXT  = 0x40,
        VK_IMAGE_COMPRESSION_FIXED_RATE_8BPC_BIT_EXT  = 0x80,
        VK_IMAGE_COMPRESSION_FIXED_RATE_9BPC_BIT_EXT  = 0x100,
        VK_IMAGE_COMPRESSION_FIXED_RATE_10BPC_BIT_EXT = 0x200,
        VK_IMAGE_COMPRESSION_FIXED_RATE_11BPC_BIT_EXT = 0x400,
        VK_IMAGE_COMPRESSION_FIXED_RATE_12BPC_BIT_EXT = 0x800,
        VK_IMAGE_COMPRESSION_FIXED_RATE_13BPC_BIT_EXT = 0x1000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_14BPC_BIT_EXT = 0x2000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_15BPC_BIT_EXT = 0x4000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_16BPC_BIT_EXT = 0x8000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_17BPC_BIT_EXT = 0x10000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_18BPC_BIT_EXT = 0x20000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_19BPC_BIT_EXT = 0x40000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_20BPC_BIT_EXT = 0x80000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_21BPC_BIT_EXT = 0x100000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_22BPC_BIT_EXT = 0x200000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_23BPC_BIT_EXT = 0x400000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_24BPC_BIT_EXT = 0x800000;

    protected EXTImageCompressionControl() {
        throw new UnsupportedOperationException();
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