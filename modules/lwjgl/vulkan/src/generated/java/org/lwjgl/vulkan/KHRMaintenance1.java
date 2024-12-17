/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRMaintenance1 {

    public static final int VK_KHR_MAINTENANCE_1_SPEC_VERSION = 2;

    public static final String VK_KHR_MAINTENANCE_1_EXTENSION_NAME = "VK_KHR_maintenance1";

    public static final int VK_KHR_MAINTENANCE1_SPEC_VERSION = VK_KHR_MAINTENANCE_1_SPEC_VERSION;

    public static final String VK_KHR_MAINTENANCE1_EXTENSION_NAME = VK_KHR_MAINTENANCE_1_EXTENSION_NAME;

    public static final int VK_ERROR_OUT_OF_POOL_MEMORY_KHR = -1000069000;

    public static final int
        VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR = 0x4000,
        VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR = 0x8000;

    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR = 0x20;

    protected KHRMaintenance1() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkTrimCommandPoolKHR ] ---

    /** {@code void vkTrimCommandPoolKHR(VkDevice device, VkCommandPool commandPool, VkCommandPoolTrimFlags flags)} */
    public static void vkTrimCommandPoolKHR(VkDevice device, @NativeType("VkCommandPool") long commandPool, @NativeType("VkCommandPoolTrimFlags") int flags) {
        long __functionAddress = device.getCapabilities().vkTrimCommandPoolKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(device.address(), commandPool, flags, __functionAddress);
    }

}