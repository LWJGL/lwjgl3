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

public class KHRVideoQueue {

    public static final int VK_KHR_VIDEO_QUEUE_SPEC_VERSION = 8;

    public static final String VK_KHR_VIDEO_QUEUE_EXTENSION_NAME = "VK_KHR_video_queue";

    public static final int
        VK_STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR                          = 1000023000,
        VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR                          = 1000023001,
        VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR                 = 1000023002,
        VK_STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR           = 1000023003,
        VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR              = 1000023004,
        VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR                   = 1000023005,
        VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR        = 1000023006,
        VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR        = 1000023007,
        VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR                     = 1000023008,
        VK_STRUCTURE_TYPE_VIDEO_END_CODING_INFO_KHR                       = 1000023009,
        VK_STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR                   = 1000023010,
        VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR                   = 1000023011,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR               = 1000023012,
        VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR                     = 1000023013,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR           = 1000023014,
        VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR                     = 1000023015,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR = 1000023016;

    public static final int
        VK_OBJECT_TYPE_VIDEO_SESSION_KHR            = 1000023000,
        VK_OBJECT_TYPE_VIDEO_SESSION_PARAMETERS_KHR = 1000023001;

    public static final int VK_QUERY_TYPE_RESULT_STATUS_ONLY_KHR = 1000023000;

    public static final int VK_QUERY_RESULT_WITH_STATUS_BIT_KHR = 0x10;

    public static final int
        VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR             = -1000023000,
        VK_ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR    = -1000023001,
        VK_ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR = -1000023002,
        VK_ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR    = -1000023003,
        VK_ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR     = -1000023004,
        VK_ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR       = -1000023005;

    public static final int VK_VIDEO_CODEC_OPERATION_NONE_KHR = 0;

    public static final int
        VK_VIDEO_CHROMA_SUBSAMPLING_INVALID_KHR        = 0,
        VK_VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR = 0x1,
        VK_VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR        = 0x2,
        VK_VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR        = 0x4,
        VK_VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR        = 0x8;

    public static final int
        VK_VIDEO_COMPONENT_BIT_DEPTH_INVALID_KHR = 0,
        VK_VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR   = 0x1,
        VK_VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR  = 0x4,
        VK_VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR  = 0x10;

    public static final int
        VK_VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR         = 0x1,
        VK_VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR = 0x2;

    public static final int VK_VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR = 0x1;

    public static final int VK_VIDEO_CODING_CONTROL_RESET_BIT_KHR = 0x1;

    public static final int
        VK_QUERY_RESULT_STATUS_NOT_READY_KHR = 0,
        VK_QUERY_RESULT_STATUS_COMPLETE_KHR  = 1,
        VK_QUERY_RESULT_STATUS_ERROR_KHR     = -1;

    protected KHRVideoQueue() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceVideoCapabilitiesKHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceVideoCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkVideoProfileInfoKHR const * pVideoProfile, VkVideoCapabilitiesKHR * pCapabilities)} */
    public static int nvkGetPhysicalDeviceVideoCapabilitiesKHR(VkPhysicalDevice physicalDevice, long pVideoProfile, long pCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceVideoCapabilitiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pVideoProfile, pCapabilities, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceVideoCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkVideoProfileInfoKHR const * pVideoProfile, VkVideoCapabilitiesKHR * pCapabilities)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoCapabilitiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkVideoProfileInfoKHR const *") VkVideoProfileInfoKHR pVideoProfile, @NativeType("VkVideoCapabilitiesKHR *") VkVideoCapabilitiesKHR pCapabilities) {
        return nvkGetPhysicalDeviceVideoCapabilitiesKHR(physicalDevice, pVideoProfile.address(), pCapabilities.address());
    }

    // --- [ vkGetPhysicalDeviceVideoFormatPropertiesKHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceVideoFormatPropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceVideoFormatInfoKHR const * pVideoFormatInfo, uint32_t * pVideoFormatPropertyCount, VkVideoFormatPropertiesKHR * pVideoFormatProperties)} */
    public static int nvkGetPhysicalDeviceVideoFormatPropertiesKHR(VkPhysicalDevice physicalDevice, long pVideoFormatInfo, long pVideoFormatPropertyCount, long pVideoFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceVideoFormatPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(physicalDevice.address(), pVideoFormatInfo, pVideoFormatPropertyCount, pVideoFormatProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceVideoFormatPropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceVideoFormatInfoKHR const * pVideoFormatInfo, uint32_t * pVideoFormatPropertyCount, VkVideoFormatPropertiesKHR * pVideoFormatProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoFormatPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceVideoFormatInfoKHR const *") VkPhysicalDeviceVideoFormatInfoKHR pVideoFormatInfo, @NativeType("uint32_t *") IntBuffer pVideoFormatPropertyCount, @NativeType("VkVideoFormatPropertiesKHR *") VkVideoFormatPropertiesKHR.@Nullable Buffer pVideoFormatProperties) {
        if (CHECKS) {
            check(pVideoFormatPropertyCount, 1);
            checkSafe(pVideoFormatProperties, pVideoFormatPropertyCount.get(pVideoFormatPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceVideoFormatPropertiesKHR(physicalDevice, pVideoFormatInfo.address(), memAddress(pVideoFormatPropertyCount), memAddressSafe(pVideoFormatProperties));
    }

    // --- [ vkCreateVideoSessionKHR ] ---

    /** {@code VkResult vkCreateVideoSessionKHR(VkDevice device, VkVideoSessionCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkVideoSessionKHR * pVideoSession)} */
    public static int nvkCreateVideoSessionKHR(VkDevice device, long pCreateInfo, long pAllocator, long pVideoSession) {
        long __functionAddress = device.getCapabilities().vkCreateVideoSessionKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkVideoSessionCreateInfoKHR.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pVideoSession, __functionAddress);
    }

    /** {@code VkResult vkCreateVideoSessionKHR(VkDevice device, VkVideoSessionCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkVideoSessionKHR * pVideoSession)} */
    @NativeType("VkResult")
    public static int vkCreateVideoSessionKHR(VkDevice device, @NativeType("VkVideoSessionCreateInfoKHR const *") VkVideoSessionCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkVideoSessionKHR *") LongBuffer pVideoSession) {
        if (CHECKS) {
            check(pVideoSession, 1);
        }
        return nvkCreateVideoSessionKHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pVideoSession));
    }

    // --- [ vkDestroyVideoSessionKHR ] ---

    /** {@code void vkDestroyVideoSessionKHR(VkDevice device, VkVideoSessionKHR videoSession, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyVideoSessionKHR(VkDevice device, long videoSession, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyVideoSessionKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), videoSession, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyVideoSessionKHR(VkDevice device, VkVideoSessionKHR videoSession, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyVideoSessionKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyVideoSessionKHR(device, videoSession, memAddressSafe(pAllocator));
    }

    // --- [ vkGetVideoSessionMemoryRequirementsKHR ] ---

    /** {@code VkResult vkGetVideoSessionMemoryRequirementsKHR(VkDevice device, VkVideoSessionKHR videoSession, uint32_t * pMemoryRequirementsCount, VkVideoSessionMemoryRequirementsKHR * pMemoryRequirements)} */
    public static int nvkGetVideoSessionMemoryRequirementsKHR(VkDevice device, long videoSession, long pMemoryRequirementsCount, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetVideoSessionMemoryRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), videoSession, pMemoryRequirementsCount, pMemoryRequirements, __functionAddress);
    }

    /** {@code VkResult vkGetVideoSessionMemoryRequirementsKHR(VkDevice device, VkVideoSessionKHR videoSession, uint32_t * pMemoryRequirementsCount, VkVideoSessionMemoryRequirementsKHR * pMemoryRequirements)} */
    @NativeType("VkResult")
    public static int vkGetVideoSessionMemoryRequirementsKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @NativeType("uint32_t *") IntBuffer pMemoryRequirementsCount, @NativeType("VkVideoSessionMemoryRequirementsKHR *") VkVideoSessionMemoryRequirementsKHR.@Nullable Buffer pMemoryRequirements) {
        if (CHECKS) {
            check(pMemoryRequirementsCount, 1);
            checkSafe(pMemoryRequirements, pMemoryRequirementsCount.get(pMemoryRequirementsCount.position()));
        }
        return nvkGetVideoSessionMemoryRequirementsKHR(device, videoSession, memAddress(pMemoryRequirementsCount), memAddressSafe(pMemoryRequirements));
    }

    // --- [ vkBindVideoSessionMemoryKHR ] ---

    /** {@code VkResult vkBindVideoSessionMemoryKHR(VkDevice device, VkVideoSessionKHR videoSession, uint32_t bindSessionMemoryInfoCount, VkBindVideoSessionMemoryInfoKHR const * pBindSessionMemoryInfos)} */
    public static int nvkBindVideoSessionMemoryKHR(VkDevice device, long videoSession, int bindSessionMemoryInfoCount, long pBindSessionMemoryInfos) {
        long __functionAddress = device.getCapabilities().vkBindVideoSessionMemoryKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), videoSession, bindSessionMemoryInfoCount, pBindSessionMemoryInfos, __functionAddress);
    }

    /** {@code VkResult vkBindVideoSessionMemoryKHR(VkDevice device, VkVideoSessionKHR videoSession, uint32_t bindSessionMemoryInfoCount, VkBindVideoSessionMemoryInfoKHR const * pBindSessionMemoryInfos)} */
    @NativeType("VkResult")
    public static int vkBindVideoSessionMemoryKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @NativeType("VkBindVideoSessionMemoryInfoKHR const *") VkBindVideoSessionMemoryInfoKHR.Buffer pBindSessionMemoryInfos) {
        return nvkBindVideoSessionMemoryKHR(device, videoSession, pBindSessionMemoryInfos.remaining(), pBindSessionMemoryInfos.address());
    }

    // --- [ vkCreateVideoSessionParametersKHR ] ---

    /** {@code VkResult vkCreateVideoSessionParametersKHR(VkDevice device, VkVideoSessionParametersCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkVideoSessionParametersKHR * pVideoSessionParameters)} */
    public static int nvkCreateVideoSessionParametersKHR(VkDevice device, long pCreateInfo, long pAllocator, long pVideoSessionParameters) {
        long __functionAddress = device.getCapabilities().vkCreateVideoSessionParametersKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pVideoSessionParameters, __functionAddress);
    }

    /** {@code VkResult vkCreateVideoSessionParametersKHR(VkDevice device, VkVideoSessionParametersCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkVideoSessionParametersKHR * pVideoSessionParameters)} */
    @NativeType("VkResult")
    public static int vkCreateVideoSessionParametersKHR(VkDevice device, @NativeType("VkVideoSessionParametersCreateInfoKHR const *") VkVideoSessionParametersCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkVideoSessionParametersKHR *") LongBuffer pVideoSessionParameters) {
        if (CHECKS) {
            check(pVideoSessionParameters, 1);
        }
        return nvkCreateVideoSessionParametersKHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pVideoSessionParameters));
    }

    // --- [ vkUpdateVideoSessionParametersKHR ] ---

    /** {@code VkResult vkUpdateVideoSessionParametersKHR(VkDevice device, VkVideoSessionParametersKHR videoSessionParameters, VkVideoSessionParametersUpdateInfoKHR const * pUpdateInfo)} */
    public static int nvkUpdateVideoSessionParametersKHR(VkDevice device, long videoSessionParameters, long pUpdateInfo) {
        long __functionAddress = device.getCapabilities().vkUpdateVideoSessionParametersKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), videoSessionParameters, pUpdateInfo, __functionAddress);
    }

    /** {@code VkResult vkUpdateVideoSessionParametersKHR(VkDevice device, VkVideoSessionParametersKHR videoSessionParameters, VkVideoSessionParametersUpdateInfoKHR const * pUpdateInfo)} */
    @NativeType("VkResult")
    public static int vkUpdateVideoSessionParametersKHR(VkDevice device, @NativeType("VkVideoSessionParametersKHR") long videoSessionParameters, @NativeType("VkVideoSessionParametersUpdateInfoKHR const *") VkVideoSessionParametersUpdateInfoKHR pUpdateInfo) {
        return nvkUpdateVideoSessionParametersKHR(device, videoSessionParameters, pUpdateInfo.address());
    }

    // --- [ vkDestroyVideoSessionParametersKHR ] ---

    /** {@code void vkDestroyVideoSessionParametersKHR(VkDevice device, VkVideoSessionParametersKHR videoSessionParameters, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyVideoSessionParametersKHR(VkDevice device, long videoSessionParameters, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyVideoSessionParametersKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), videoSessionParameters, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyVideoSessionParametersKHR(VkDevice device, VkVideoSessionParametersKHR videoSessionParameters, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyVideoSessionParametersKHR(VkDevice device, @NativeType("VkVideoSessionParametersKHR") long videoSessionParameters, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyVideoSessionParametersKHR(device, videoSessionParameters, memAddressSafe(pAllocator));
    }

    // --- [ vkCmdBeginVideoCodingKHR ] ---

    /** {@code void vkCmdBeginVideoCodingKHR(VkCommandBuffer commandBuffer, VkVideoBeginCodingInfoKHR const * pBeginInfo)} */
    public static void nvkCmdBeginVideoCodingKHR(VkCommandBuffer commandBuffer, long pBeginInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginVideoCodingKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkVideoBeginCodingInfoKHR.validate(pBeginInfo);
        }
        callPPV(commandBuffer.address(), pBeginInfo, __functionAddress);
    }

    /** {@code void vkCmdBeginVideoCodingKHR(VkCommandBuffer commandBuffer, VkVideoBeginCodingInfoKHR const * pBeginInfo)} */
    public static void vkCmdBeginVideoCodingKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoBeginCodingInfoKHR const *") VkVideoBeginCodingInfoKHR pBeginInfo) {
        nvkCmdBeginVideoCodingKHR(commandBuffer, pBeginInfo.address());
    }

    // --- [ vkCmdEndVideoCodingKHR ] ---

    /** {@code void vkCmdEndVideoCodingKHR(VkCommandBuffer commandBuffer, VkVideoEndCodingInfoKHR const * pEndCodingInfo)} */
    public static void nvkCmdEndVideoCodingKHR(VkCommandBuffer commandBuffer, long pEndCodingInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndVideoCodingKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pEndCodingInfo, __functionAddress);
    }

    /** {@code void vkCmdEndVideoCodingKHR(VkCommandBuffer commandBuffer, VkVideoEndCodingInfoKHR const * pEndCodingInfo)} */
    public static void vkCmdEndVideoCodingKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoEndCodingInfoKHR const *") VkVideoEndCodingInfoKHR pEndCodingInfo) {
        nvkCmdEndVideoCodingKHR(commandBuffer, pEndCodingInfo.address());
    }

    // --- [ vkCmdControlVideoCodingKHR ] ---

    /** {@code void vkCmdControlVideoCodingKHR(VkCommandBuffer commandBuffer, VkVideoCodingControlInfoKHR const * pCodingControlInfo)} */
    public static void nvkCmdControlVideoCodingKHR(VkCommandBuffer commandBuffer, long pCodingControlInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdControlVideoCodingKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pCodingControlInfo, __functionAddress);
    }

    /** {@code void vkCmdControlVideoCodingKHR(VkCommandBuffer commandBuffer, VkVideoCodingControlInfoKHR const * pCodingControlInfo)} */
    public static void vkCmdControlVideoCodingKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoCodingControlInfoKHR const *") VkVideoCodingControlInfoKHR pCodingControlInfo) {
        nvkCmdControlVideoCodingKHR(commandBuffer, pCodingControlInfo.address());
    }

    /** {@code VkResult vkGetPhysicalDeviceVideoFormatPropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceVideoFormatInfoKHR const * pVideoFormatInfo, uint32_t * pVideoFormatPropertyCount, VkVideoFormatPropertiesKHR * pVideoFormatProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoFormatPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceVideoFormatInfoKHR const *") VkPhysicalDeviceVideoFormatInfoKHR pVideoFormatInfo, @NativeType("uint32_t *") int[] pVideoFormatPropertyCount, @NativeType("VkVideoFormatPropertiesKHR *") VkVideoFormatPropertiesKHR.@Nullable Buffer pVideoFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceVideoFormatPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pVideoFormatPropertyCount, 1);
            checkSafe(pVideoFormatProperties, pVideoFormatPropertyCount[0]);
        }
        return callPPPPI(physicalDevice.address(), pVideoFormatInfo.address(), pVideoFormatPropertyCount, memAddressSafe(pVideoFormatProperties), __functionAddress);
    }

    /** {@code VkResult vkCreateVideoSessionKHR(VkDevice device, VkVideoSessionCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkVideoSessionKHR * pVideoSession)} */
    @NativeType("VkResult")
    public static int vkCreateVideoSessionKHR(VkDevice device, @NativeType("VkVideoSessionCreateInfoKHR const *") VkVideoSessionCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkVideoSessionKHR *") long[] pVideoSession) {
        long __functionAddress = device.getCapabilities().vkCreateVideoSessionKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pVideoSession, 1);
            VkVideoSessionCreateInfoKHR.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pVideoSession, __functionAddress);
    }

    /** {@code VkResult vkGetVideoSessionMemoryRequirementsKHR(VkDevice device, VkVideoSessionKHR videoSession, uint32_t * pMemoryRequirementsCount, VkVideoSessionMemoryRequirementsKHR * pMemoryRequirements)} */
    @NativeType("VkResult")
    public static int vkGetVideoSessionMemoryRequirementsKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @NativeType("uint32_t *") int[] pMemoryRequirementsCount, @NativeType("VkVideoSessionMemoryRequirementsKHR *") VkVideoSessionMemoryRequirementsKHR.@Nullable Buffer pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetVideoSessionMemoryRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pMemoryRequirementsCount, 1);
            checkSafe(pMemoryRequirements, pMemoryRequirementsCount[0]);
        }
        return callPJPPI(device.address(), videoSession, pMemoryRequirementsCount, memAddressSafe(pMemoryRequirements), __functionAddress);
    }

    /** {@code VkResult vkCreateVideoSessionParametersKHR(VkDevice device, VkVideoSessionParametersCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkVideoSessionParametersKHR * pVideoSessionParameters)} */
    @NativeType("VkResult")
    public static int vkCreateVideoSessionParametersKHR(VkDevice device, @NativeType("VkVideoSessionParametersCreateInfoKHR const *") VkVideoSessionParametersCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkVideoSessionParametersKHR *") long[] pVideoSessionParameters) {
        long __functionAddress = device.getCapabilities().vkCreateVideoSessionParametersKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pVideoSessionParameters, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pVideoSessionParameters, __functionAddress);
    }

}