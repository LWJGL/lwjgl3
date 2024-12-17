/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRMaintenance4 {

    public static final int VK_KHR_MAINTENANCE_4_SPEC_VERSION = 2;

    public static final String VK_KHR_MAINTENANCE_4_EXTENSION_NAME = "VK_KHR_maintenance4";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR   = 1000413000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES_KHR = 1000413001,
        VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS_KHR        = 1000413002,
        VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR         = 1000413003;

    public static final int VK_IMAGE_ASPECT_NONE_KHR = 0;

    protected KHRMaintenance4() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetDeviceBufferMemoryRequirementsKHR ] ---

    /** {@code void vkGetDeviceBufferMemoryRequirementsKHR(VkDevice device, VkDeviceBufferMemoryRequirements const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void nvkGetDeviceBufferMemoryRequirementsKHR(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceBufferMemoryRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceBufferMemoryRequirements.validate(pInfo);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetDeviceBufferMemoryRequirementsKHR(VkDevice device, VkDeviceBufferMemoryRequirements const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void vkGetDeviceBufferMemoryRequirementsKHR(VkDevice device, @NativeType("VkDeviceBufferMemoryRequirements const *") VkDeviceBufferMemoryRequirements pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDeviceBufferMemoryRequirementsKHR(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetDeviceImageMemoryRequirementsKHR ] ---

    /** {@code void vkGetDeviceImageMemoryRequirementsKHR(VkDevice device, VkDeviceImageMemoryRequirements const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void nvkGetDeviceImageMemoryRequirementsKHR(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageMemoryRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceImageMemoryRequirements.validate(pInfo);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetDeviceImageMemoryRequirementsKHR(VkDevice device, VkDeviceImageMemoryRequirements const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void vkGetDeviceImageMemoryRequirementsKHR(VkDevice device, @NativeType("VkDeviceImageMemoryRequirements const *") VkDeviceImageMemoryRequirements pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDeviceImageMemoryRequirementsKHR(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetDeviceImageSparseMemoryRequirementsKHR ] ---

    /** {@code void vkGetDeviceImageSparseMemoryRequirementsKHR(VkDevice device, VkDeviceImageMemoryRequirements const * pInfo, uint32_t * pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 * pSparseMemoryRequirements)} */
    public static void nvkGetDeviceImageSparseMemoryRequirementsKHR(VkDevice device, long pInfo, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSparseMemoryRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceImageMemoryRequirements.validate(pInfo);
        }
        callPPPPV(device.address(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetDeviceImageSparseMemoryRequirementsKHR(VkDevice device, VkDeviceImageMemoryRequirements const * pInfo, uint32_t * pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 * pSparseMemoryRequirements)} */
    public static void vkGetDeviceImageSparseMemoryRequirementsKHR(VkDevice device, @NativeType("VkDeviceImageMemoryRequirements const *") VkDeviceImageMemoryRequirements pInfo, @NativeType("uint32_t *") IntBuffer pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.@Nullable Buffer pSparseMemoryRequirements) {
        if (CHECKS) {
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
        }
        nvkGetDeviceImageSparseMemoryRequirementsKHR(device, pInfo.address(), memAddress(pSparseMemoryRequirementCount), memAddressSafe(pSparseMemoryRequirements));
    }

    /** {@code void vkGetDeviceImageSparseMemoryRequirementsKHR(VkDevice device, VkDeviceImageMemoryRequirements const * pInfo, uint32_t * pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 * pSparseMemoryRequirements)} */
    public static void vkGetDeviceImageSparseMemoryRequirementsKHR(VkDevice device, @NativeType("VkDeviceImageMemoryRequirements const *") VkDeviceImageMemoryRequirements pInfo, @NativeType("uint32_t *") int[] pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.@Nullable Buffer pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSparseMemoryRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
            VkDeviceImageMemoryRequirements.validate(pInfo.address());
        }
        callPPPPV(device.address(), pInfo.address(), pSparseMemoryRequirementCount, memAddressSafe(pSparseMemoryRequirements), __functionAddress);
    }

}