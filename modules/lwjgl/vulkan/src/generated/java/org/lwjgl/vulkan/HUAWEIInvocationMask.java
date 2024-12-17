/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class HUAWEIInvocationMask {

    public static final int VK_HUAWEI_INVOCATION_MASK_SPEC_VERSION = 1;

    public static final String VK_HUAWEI_INVOCATION_MASK_EXTENSION_NAME = "VK_HUAWEI_invocation_mask";

    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI = 1000370000;

    public static final long VK_ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI = 0x8000000000L;

    public static final int VK_IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI = 0x40000;

    public static final long VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI = 0x10000000000L;

    protected HUAWEIInvocationMask() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBindInvocationMaskHUAWEI ] ---

    /** {@code void vkCmdBindInvocationMaskHUAWEI(VkCommandBuffer commandBuffer, VkImageView imageView, VkImageLayout imageLayout)} */
    public static void vkCmdBindInvocationMaskHUAWEI(VkCommandBuffer commandBuffer, @NativeType("VkImageView") long imageView, @NativeType("VkImageLayout") int imageLayout) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindInvocationMaskHUAWEI;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), imageView, imageLayout, __functionAddress);
    }

}