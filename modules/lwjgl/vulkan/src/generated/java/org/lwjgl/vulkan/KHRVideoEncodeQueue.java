/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRVideoEncodeQueue {

    public static final int VK_KHR_VIDEO_ENCODE_QUEUE_SPEC_VERSION = 12;

    public static final String VK_KHR_VIDEO_ENCODE_QUEUE_EXTENSION_NAME = "VK_KHR_video_encode_queue";

    public static final long VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR = 0x8000000L;

    public static final long
        VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR  = 0x2000000000L,
        VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR = 0x4000000000L;

    public static final int
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR                               = 1000299000,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR                  = 1000299001,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR            = 1000299002,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR                       = 1000299003,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR                         = 1000299004,
        VK_STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR    = 1000299005,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR = 1000299006,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR           = 1000299007,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR                 = 1000299008,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR        = 1000299009,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR   = 1000299010;

    public static final int VK_QUEUE_VIDEO_ENCODE_BIT_KHR = 0x40;

    public static final int
        VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR  = 0x2,
        VK_VIDEO_CODING_CONTROL_ENCODE_QUALITY_LEVEL_BIT_KHR = 0x4;

    public static final int
        VK_BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR = 0x8000,
        VK_BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR = 0x10000;

    public static final int
        VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR = 0x2000,
        VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR = 0x4000,
        VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR = 0x8000;

    public static final int
        VK_FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR = 0x8000000,
        VK_FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR   = 0x10000000;

    public static final int VK_VIDEO_SESSION_CREATE_ALLOW_ENCODE_PARAMETER_OPTIMIZATIONS_BIT_KHR = 0x2;

    public static final int
        VK_IMAGE_LAYOUT_VIDEO_ENCODE_DST_KHR = 1000299000,
        VK_IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR = 1000299001,
        VK_IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR = 1000299002;

    public static final int VK_QUERY_TYPE_VIDEO_ENCODE_FEEDBACK_KHR = 1000299000;

    public static final int VK_QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR = -1000299000;

    public static final int VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR = -1000299000;

    public static final long
        VK_FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR = 0x8000000L,
        VK_FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR   = 0x10000000L;

    public static final int
        VK_VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES_BIT_KHR            = 0x1,
        VK_VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR = 0x2;

    public static final int
        VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR      = 0,
        VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR = 0x1,
        VK_VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR      = 0x2,
        VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR      = 0x4;

    public static final int
        VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR = 0x1,
        VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR = 0x2,
        VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES_BIT_KHR = 0x4;

    public static final int
        VK_VIDEO_ENCODE_USAGE_DEFAULT_KHR          = 0,
        VK_VIDEO_ENCODE_USAGE_TRANSCODING_BIT_KHR  = 0x1,
        VK_VIDEO_ENCODE_USAGE_STREAMING_BIT_KHR    = 0x2,
        VK_VIDEO_ENCODE_USAGE_RECORDING_BIT_KHR    = 0x4,
        VK_VIDEO_ENCODE_USAGE_CONFERENCING_BIT_KHR = 0x8;

    public static final int
        VK_VIDEO_ENCODE_CONTENT_DEFAULT_KHR      = 0,
        VK_VIDEO_ENCODE_CONTENT_CAMERA_BIT_KHR   = 0x1,
        VK_VIDEO_ENCODE_CONTENT_DESKTOP_BIT_KHR  = 0x2,
        VK_VIDEO_ENCODE_CONTENT_RENDERED_BIT_KHR = 0x4;

    public static final int
        VK_VIDEO_ENCODE_TUNING_MODE_DEFAULT_KHR           = 0,
        VK_VIDEO_ENCODE_TUNING_MODE_HIGH_QUALITY_KHR      = 1,
        VK_VIDEO_ENCODE_TUNING_MODE_LOW_LATENCY_KHR       = 2,
        VK_VIDEO_ENCODE_TUNING_MODE_ULTRA_LOW_LATENCY_KHR = 3,
        VK_VIDEO_ENCODE_TUNING_MODE_LOSSLESS_KHR          = 4;

    protected KHRVideoEncodeQueue() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR const * pQualityLevelInfo, VkVideoEncodeQualityLevelPropertiesKHR * pQualityLevelProperties)} */
    public static int nvkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(VkPhysicalDevice physicalDevice, long pQualityLevelInfo, long pQualityLevelProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.validate(pQualityLevelInfo);
        }
        return callPPPI(physicalDevice.address(), pQualityLevelInfo, pQualityLevelProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR const * pQualityLevelInfo, VkVideoEncodeQualityLevelPropertiesKHR * pQualityLevelProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR const *") VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pQualityLevelInfo, @NativeType("VkVideoEncodeQualityLevelPropertiesKHR *") VkVideoEncodeQualityLevelPropertiesKHR pQualityLevelProperties) {
        return nvkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(physicalDevice, pQualityLevelInfo.address(), pQualityLevelProperties.address());
    }

    // --- [ vkGetEncodedVideoSessionParametersKHR ] ---

    /** {@code VkResult vkGetEncodedVideoSessionParametersKHR(VkDevice device, VkVideoEncodeSessionParametersGetInfoKHR const * pVideoSessionParametersInfo, VkVideoEncodeSessionParametersFeedbackInfoKHR * pFeedbackInfo, size_t * pDataSize, void * pData)} */
    public static int nvkGetEncodedVideoSessionParametersKHR(VkDevice device, long pVideoSessionParametersInfo, long pFeedbackInfo, long pDataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetEncodedVideoSessionParametersKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPI(device.address(), pVideoSessionParametersInfo, pFeedbackInfo, pDataSize, pData, __functionAddress);
    }

    /** {@code VkResult vkGetEncodedVideoSessionParametersKHR(VkDevice device, VkVideoEncodeSessionParametersGetInfoKHR const * pVideoSessionParametersInfo, VkVideoEncodeSessionParametersFeedbackInfoKHR * pFeedbackInfo, size_t * pDataSize, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetEncodedVideoSessionParametersKHR(VkDevice device, @NativeType("VkVideoEncodeSessionParametersGetInfoKHR const *") VkVideoEncodeSessionParametersGetInfoKHR pVideoSessionParametersInfo, @NativeType("VkVideoEncodeSessionParametersFeedbackInfoKHR *") @Nullable VkVideoEncodeSessionParametersFeedbackInfoKHR pFeedbackInfo, @NativeType("size_t *") PointerBuffer pDataSize, @NativeType("void *") @Nullable ByteBuffer pData) {
        if (CHECKS) {
            check(pDataSize, 1);
            checkSafe(pData, pDataSize.get(pDataSize.position()));
        }
        return nvkGetEncodedVideoSessionParametersKHR(device, pVideoSessionParametersInfo.address(), memAddressSafe(pFeedbackInfo), memAddress(pDataSize), memAddressSafe(pData));
    }

    // --- [ vkCmdEncodeVideoKHR ] ---

    /** {@code void vkCmdEncodeVideoKHR(VkCommandBuffer commandBuffer, VkVideoEncodeInfoKHR const * pEncodeInfo)} */
    public static void nvkCmdEncodeVideoKHR(VkCommandBuffer commandBuffer, long pEncodeInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEncodeVideoKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkVideoEncodeInfoKHR.validate(pEncodeInfo);
        }
        callPPV(commandBuffer.address(), pEncodeInfo, __functionAddress);
    }

    /** {@code void vkCmdEncodeVideoKHR(VkCommandBuffer commandBuffer, VkVideoEncodeInfoKHR const * pEncodeInfo)} */
    public static void vkCmdEncodeVideoKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoEncodeInfoKHR const *") VkVideoEncodeInfoKHR pEncodeInfo) {
        nvkCmdEncodeVideoKHR(commandBuffer, pEncodeInfo.address());
    }

}