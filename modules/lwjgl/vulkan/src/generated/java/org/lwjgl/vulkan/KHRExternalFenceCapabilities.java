/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRExternalFenceCapabilities {

    public static final int VK_KHR_EXTERNAL_FENCE_CAPABILITIES_SPEC_VERSION = 1;

    public static final String VK_KHR_EXTERNAL_FENCE_CAPABILITIES_EXTENSION_NAME = "VK_KHR_external_fence_capabilities";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR       = 1000071004,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR = 1000112000,
        VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES_KHR           = 1000112001;

    public static final int VK_LUID_SIZE_KHR = 8;

    public static final int
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR        = 0x1,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR     = 0x2,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = 0x4,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR          = 0x8;

    public static final int
        VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR = 0x1,
        VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR = 0x2;

    protected KHRExternalFenceCapabilities() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceExternalFencePropertiesKHR ] ---

    /** {@code void vkGetPhysicalDeviceExternalFencePropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalFenceInfo const * pExternalFenceInfo, VkExternalFenceProperties * pExternalFenceProperties)} */
    public static void nvkGetPhysicalDeviceExternalFencePropertiesKHR(VkPhysicalDevice physicalDevice, long pExternalFenceInfo, long pExternalFenceProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalFencePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(physicalDevice.address(), pExternalFenceInfo, pExternalFenceProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceExternalFencePropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalFenceInfo const * pExternalFenceInfo, VkExternalFenceProperties * pExternalFenceProperties)} */
    public static void vkGetPhysicalDeviceExternalFencePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceExternalFenceInfo const *") VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo, @NativeType("VkExternalFenceProperties *") VkExternalFenceProperties pExternalFenceProperties) {
        nvkGetPhysicalDeviceExternalFencePropertiesKHR(physicalDevice, pExternalFenceInfo.address(), pExternalFenceProperties.address());
    }

}