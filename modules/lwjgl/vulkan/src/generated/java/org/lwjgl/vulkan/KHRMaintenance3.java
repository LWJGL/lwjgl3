/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRMaintenance3 {

    public static final int VK_KHR_MAINTENANCE_3_SPEC_VERSION = 1;

    public static final String VK_KHR_MAINTENANCE_3_EXTENSION_NAME = "VK_KHR_maintenance3";

    public static final int VK_KHR_MAINTENANCE3_SPEC_VERSION = VK_KHR_MAINTENANCE_3_SPEC_VERSION;

    public static final String VK_KHR_MAINTENANCE3_EXTENSION_NAME = VK_KHR_MAINTENANCE_3_EXTENSION_NAME;

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR = 1000168000,
        VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR            = 1000168001;

    protected KHRMaintenance3() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetDescriptorSetLayoutSupportKHR ] ---

    /** {@code void vkGetDescriptorSetLayoutSupportKHR(VkDevice device, VkDescriptorSetLayoutCreateInfo const * pCreateInfo, VkDescriptorSetLayoutSupport * pSupport)} */
    public static void nvkGetDescriptorSetLayoutSupportKHR(VkDevice device, long pCreateInfo, long pSupport) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutSupportKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDescriptorSetLayoutCreateInfo.validate(pCreateInfo);
        }
        callPPPV(device.address(), pCreateInfo, pSupport, __functionAddress);
    }

    /** {@code void vkGetDescriptorSetLayoutSupportKHR(VkDevice device, VkDescriptorSetLayoutCreateInfo const * pCreateInfo, VkDescriptorSetLayoutSupport * pSupport)} */
    public static void vkGetDescriptorSetLayoutSupportKHR(VkDevice device, @NativeType("VkDescriptorSetLayoutCreateInfo const *") VkDescriptorSetLayoutCreateInfo pCreateInfo, @NativeType("VkDescriptorSetLayoutSupport *") VkDescriptorSetLayoutSupport pSupport) {
        nvkGetDescriptorSetLayoutSupportKHR(device, pCreateInfo.address(), pSupport.address());
    }

}