/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTSampleLocations {

    public static final int VK_EXT_SAMPLE_LOCATIONS_SPEC_VERSION = 1;

    public static final String VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME = "VK_EXT_sample_locations";

    public static final int VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT = 0x1000;

    public static final int
        VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT                       = 1000143000,
        VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT     = 1000143001,
        VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT = 1000143002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT = 1000143003,
        VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT                      = 1000143004;

    public static final int VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT = 1000143000;

    protected EXTSampleLocations() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetSampleLocationsEXT ] ---

    /** {@code void vkCmdSetSampleLocationsEXT(VkCommandBuffer commandBuffer, VkSampleLocationsInfoEXT const * pSampleLocationsInfo)} */
    public static void nvkCmdSetSampleLocationsEXT(VkCommandBuffer commandBuffer, long pSampleLocationsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetSampleLocationsEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkSampleLocationsInfoEXT.validate(pSampleLocationsInfo);
        }
        callPPV(commandBuffer.address(), pSampleLocationsInfo, __functionAddress);
    }

    /** {@code void vkCmdSetSampleLocationsEXT(VkCommandBuffer commandBuffer, VkSampleLocationsInfoEXT const * pSampleLocationsInfo)} */
    public static void vkCmdSetSampleLocationsEXT(VkCommandBuffer commandBuffer, @NativeType("VkSampleLocationsInfoEXT const *") VkSampleLocationsInfoEXT pSampleLocationsInfo) {
        nvkCmdSetSampleLocationsEXT(commandBuffer, pSampleLocationsInfo.address());
    }

    // --- [ vkGetPhysicalDeviceMultisamplePropertiesEXT ] ---

    /** {@code void vkGetPhysicalDeviceMultisamplePropertiesEXT(VkPhysicalDevice physicalDevice, VkSampleCountFlagBits samples, VkMultisamplePropertiesEXT * pMultisampleProperties)} */
    public static void nvkGetPhysicalDeviceMultisamplePropertiesEXT(VkPhysicalDevice physicalDevice, int samples, long pMultisampleProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceMultisamplePropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(physicalDevice.address(), samples, pMultisampleProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceMultisamplePropertiesEXT(VkPhysicalDevice physicalDevice, VkSampleCountFlagBits samples, VkMultisamplePropertiesEXT * pMultisampleProperties)} */
    public static void vkGetPhysicalDeviceMultisamplePropertiesEXT(VkPhysicalDevice physicalDevice, @NativeType("VkSampleCountFlagBits") int samples, @NativeType("VkMultisamplePropertiesEXT *") VkMultisamplePropertiesEXT pMultisampleProperties) {
        nvkGetPhysicalDeviceMultisamplePropertiesEXT(physicalDevice, samples, pMultisampleProperties.address());
    }

}