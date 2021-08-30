/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.util.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Defines the capabilities of a Vulkan {@code VkDevice}. */
@SuppressWarnings("SimplifiableIfStatement")
public class VKCapabilitiesDevice {

    // VK10
    public final long
        vkGetDeviceProcAddr,
        vkDestroyDevice,
        vkGetDeviceQueue,
        vkQueueSubmit,
        vkQueueWaitIdle,
        vkDeviceWaitIdle,
        vkAllocateMemory,
        vkFreeMemory,
        vkMapMemory,
        vkUnmapMemory,
        vkFlushMappedMemoryRanges,
        vkInvalidateMappedMemoryRanges,
        vkGetDeviceMemoryCommitment,
        vkBindBufferMemory,
        vkBindImageMemory,
        vkGetBufferMemoryRequirements,
        vkGetImageMemoryRequirements,
        vkGetImageSparseMemoryRequirements,
        vkQueueBindSparse,
        vkCreateFence,
        vkDestroyFence,
        vkResetFences,
        vkGetFenceStatus,
        vkWaitForFences,
        vkCreateSemaphore,
        vkDestroySemaphore,
        vkCreateEvent,
        vkDestroyEvent,
        vkGetEventStatus,
        vkSetEvent,
        vkResetEvent,
        vkCreateQueryPool,
        vkDestroyQueryPool,
        vkGetQueryPoolResults,
        vkCreateBuffer,
        vkDestroyBuffer,
        vkCreateBufferView,
        vkDestroyBufferView,
        vkCreateImage,
        vkDestroyImage,
        vkGetImageSubresourceLayout,
        vkCreateImageView,
        vkDestroyImageView,
        vkCreateShaderModule,
        vkDestroyShaderModule,
        vkCreatePipelineCache,
        vkDestroyPipelineCache,
        vkGetPipelineCacheData,
        vkMergePipelineCaches,
        vkCreateGraphicsPipelines,
        vkCreateComputePipelines,
        vkDestroyPipeline,
        vkCreatePipelineLayout,
        vkDestroyPipelineLayout,
        vkCreateSampler,
        vkDestroySampler,
        vkCreateDescriptorSetLayout,
        vkDestroyDescriptorSetLayout,
        vkCreateDescriptorPool,
        vkDestroyDescriptorPool,
        vkResetDescriptorPool,
        vkAllocateDescriptorSets,
        vkFreeDescriptorSets,
        vkUpdateDescriptorSets,
        vkCreateFramebuffer,
        vkDestroyFramebuffer,
        vkCreateRenderPass,
        vkDestroyRenderPass,
        vkGetRenderAreaGranularity,
        vkCreateCommandPool,
        vkDestroyCommandPool,
        vkResetCommandPool,
        vkAllocateCommandBuffers,
        vkFreeCommandBuffers,
        vkBeginCommandBuffer,
        vkEndCommandBuffer,
        vkResetCommandBuffer,
        vkCmdBindPipeline,
        vkCmdSetViewport,
        vkCmdSetScissor,
        vkCmdSetLineWidth,
        vkCmdSetDepthBias,
        vkCmdSetBlendConstants,
        vkCmdSetDepthBounds,
        vkCmdSetStencilCompareMask,
        vkCmdSetStencilWriteMask,
        vkCmdSetStencilReference,
        vkCmdBindDescriptorSets,
        vkCmdBindIndexBuffer,
        vkCmdBindVertexBuffers,
        vkCmdDraw,
        vkCmdDrawIndexed,
        vkCmdDrawIndirect,
        vkCmdDrawIndexedIndirect,
        vkCmdDispatch,
        vkCmdDispatchIndirect,
        vkCmdCopyBuffer,
        vkCmdCopyImage,
        vkCmdBlitImage,
        vkCmdCopyBufferToImage,
        vkCmdCopyImageToBuffer,
        vkCmdUpdateBuffer,
        vkCmdFillBuffer,
        vkCmdClearColorImage,
        vkCmdClearDepthStencilImage,
        vkCmdClearAttachments,
        vkCmdResolveImage,
        vkCmdSetEvent,
        vkCmdResetEvent,
        vkCmdWaitEvents,
        vkCmdPipelineBarrier,
        vkCmdBeginQuery,
        vkCmdEndQuery,
        vkCmdResetQueryPool,
        vkCmdWriteTimestamp,
        vkCmdCopyQueryPoolResults,
        vkCmdPushConstants,
        vkCmdBeginRenderPass,
        vkCmdNextSubpass,
        vkCmdEndRenderPass,
        vkCmdExecuteCommands;

    // VK11
    public final long
        vkBindBufferMemory2,
        vkBindImageMemory2,
        vkGetDeviceGroupPeerMemoryFeatures,
        vkCmdSetDeviceMask,
        vkCmdDispatchBase,
        vkGetImageMemoryRequirements2,
        vkGetBufferMemoryRequirements2,
        vkGetImageSparseMemoryRequirements2,
        vkTrimCommandPool,
        vkGetDeviceQueue2,
        vkCreateSamplerYcbcrConversion,
        vkDestroySamplerYcbcrConversion,
        vkCreateDescriptorUpdateTemplate,
        vkDestroyDescriptorUpdateTemplate,
        vkUpdateDescriptorSetWithTemplate,
        vkGetDescriptorSetLayoutSupport;

    // VK12
    public final long
        vkCmdDrawIndirectCount,
        vkCmdDrawIndexedIndirectCount,
        vkCreateRenderPass2,
        vkCmdBeginRenderPass2,
        vkCmdNextSubpass2,
        vkCmdEndRenderPass2,
        vkResetQueryPool,
        vkGetSemaphoreCounterValue,
        vkWaitSemaphores,
        vkSignalSemaphore,
        vkGetBufferDeviceAddress,
        vkGetBufferOpaqueCaptureAddress,
        vkGetDeviceMemoryOpaqueCaptureAddress;

    // AMD_buffer_marker
    public final long
        vkCmdWriteBufferMarkerAMD;

    // AMD_display_native_hdr
    public final long
        vkSetLocalDimmingAMD;

    // AMD_draw_indirect_count
    public final long
        vkCmdDrawIndirectCountAMD,
        vkCmdDrawIndexedIndirectCountAMD;

    // AMD_shader_info
    public final long
        vkGetShaderInfoAMD;

    // EXT_buffer_device_address
    public final long
        vkGetBufferDeviceAddressEXT;

    // EXT_calibrated_timestamps
    public final long
        vkGetCalibratedTimestampsEXT;

    // EXT_color_write_enable
    public final long
        vkCmdSetColorWriteEnableEXT;

    // EXT_conditional_rendering
    public final long
        vkCmdBeginConditionalRenderingEXT,
        vkCmdEndConditionalRenderingEXT;

    // EXT_debug_marker
    public final long
        vkDebugMarkerSetObjectTagEXT,
        vkDebugMarkerSetObjectNameEXT,
        vkCmdDebugMarkerBeginEXT,
        vkCmdDebugMarkerEndEXT,
        vkCmdDebugMarkerInsertEXT;

    // EXT_debug_utils
    public final long
        vkSetDebugUtilsObjectNameEXT,
        vkSetDebugUtilsObjectTagEXT,
        vkQueueBeginDebugUtilsLabelEXT,
        vkQueueEndDebugUtilsLabelEXT,
        vkQueueInsertDebugUtilsLabelEXT,
        vkCmdBeginDebugUtilsLabelEXT,
        vkCmdEndDebugUtilsLabelEXT,
        vkCmdInsertDebugUtilsLabelEXT;

    // EXT_discard_rectangles
    public final long
        vkCmdSetDiscardRectangleEXT;

    // EXT_display_control
    public final long
        vkDisplayPowerControlEXT,
        vkRegisterDeviceEventEXT,
        vkRegisterDisplayEventEXT,
        vkGetSwapchainCounterEXT;

    // EXT_extended_dynamic_state
    public final long
        vkCmdSetCullModeEXT,
        vkCmdSetFrontFaceEXT,
        vkCmdSetPrimitiveTopologyEXT,
        vkCmdSetViewportWithCountEXT,
        vkCmdSetScissorWithCountEXT,
        vkCmdBindVertexBuffers2EXT,
        vkCmdSetDepthTestEnableEXT,
        vkCmdSetDepthWriteEnableEXT,
        vkCmdSetDepthCompareOpEXT,
        vkCmdSetDepthBoundsTestEnableEXT,
        vkCmdSetStencilTestEnableEXT,
        vkCmdSetStencilOpEXT;

    // EXT_extended_dynamic_state2
    public final long
        vkCmdSetPatchControlPointsEXT,
        vkCmdSetRasterizerDiscardEnableEXT,
        vkCmdSetDepthBiasEnableEXT,
        vkCmdSetLogicOpEXT,
        vkCmdSetPrimitiveRestartEnableEXT;

    // EXT_external_memory_host
    public final long
        vkGetMemoryHostPointerPropertiesEXT;

    // EXT_full_screen_exclusive
    public final long
        vkAcquireFullScreenExclusiveModeEXT,
        vkReleaseFullScreenExclusiveModeEXT,
        vkGetDeviceGroupSurfacePresentModes2EXT;

    // EXT_hdr_metadata
    public final long
        vkSetHdrMetadataEXT;

    // EXT_host_query_reset
    public final long
        vkResetQueryPoolEXT;

    // EXT_image_drm_format_modifier
    public final long
        vkGetImageDrmFormatModifierPropertiesEXT;

    // EXT_line_rasterization
    public final long
        vkCmdSetLineStippleEXT;

    // EXT_multi_draw
    public final long
        vkCmdDrawMultiEXT,
        vkCmdDrawMultiIndexedEXT;

    // EXT_private_data
    public final long
        vkCreatePrivateDataSlotEXT,
        vkDestroyPrivateDataSlotEXT,
        vkSetPrivateDataEXT,
        vkGetPrivateDataEXT;

    // EXT_sample_locations
    public final long
        vkCmdSetSampleLocationsEXT;

    // EXT_transform_feedback
    public final long
        vkCmdBindTransformFeedbackBuffersEXT,
        vkCmdBeginTransformFeedbackEXT,
        vkCmdEndTransformFeedbackEXT,
        vkCmdBeginQueryIndexedEXT,
        vkCmdEndQueryIndexedEXT,
        vkCmdDrawIndirectByteCountEXT;

    // EXT_validation_cache
    public final long
        vkCreateValidationCacheEXT,
        vkDestroyValidationCacheEXT,
        vkMergeValidationCachesEXT,
        vkGetValidationCacheDataEXT;

    // EXT_vertex_input_dynamic_state
    public final long
        vkCmdSetVertexInputEXT;

    // GOOGLE_display_timing
    public final long
        vkGetRefreshCycleDurationGOOGLE,
        vkGetPastPresentationTimingGOOGLE;

    // HUAWEI_invocation_mask
    public final long
        vkCmdBindInvocationMaskHUAWEI;

    // HUAWEI_subpass_shading
    public final long
        vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI,
        vkCmdSubpassShadingHUAWEI;

    // INTEL_performance_query
    public final long
        vkInitializePerformanceApiINTEL,
        vkUninitializePerformanceApiINTEL,
        vkCmdSetPerformanceMarkerINTEL,
        vkCmdSetPerformanceStreamMarkerINTEL,
        vkCmdSetPerformanceOverrideINTEL,
        vkAcquirePerformanceConfigurationINTEL,
        vkReleasePerformanceConfigurationINTEL,
        vkQueueSetPerformanceConfigurationINTEL,
        vkGetPerformanceParameterINTEL;

    // KHR_acceleration_structure
    public final long
        vkCreateAccelerationStructureKHR,
        vkDestroyAccelerationStructureKHR,
        vkCmdBuildAccelerationStructuresKHR,
        vkCmdBuildAccelerationStructuresIndirectKHR,
        vkBuildAccelerationStructuresKHR,
        vkCopyAccelerationStructureKHR,
        vkCopyAccelerationStructureToMemoryKHR,
        vkCopyMemoryToAccelerationStructureKHR,
        vkWriteAccelerationStructuresPropertiesKHR,
        vkCmdCopyAccelerationStructureKHR,
        vkCmdCopyAccelerationStructureToMemoryKHR,
        vkCmdCopyMemoryToAccelerationStructureKHR,
        vkGetAccelerationStructureDeviceAddressKHR,
        vkCmdWriteAccelerationStructuresPropertiesKHR,
        vkGetDeviceAccelerationStructureCompatibilityKHR,
        vkGetAccelerationStructureBuildSizesKHR;

    // KHR_bind_memory2
    public final long
        vkBindBufferMemory2KHR,
        vkBindImageMemory2KHR;

    // KHR_buffer_device_address
    public final long
        vkGetBufferDeviceAddressKHR,
        vkGetBufferOpaqueCaptureAddressKHR,
        vkGetDeviceMemoryOpaqueCaptureAddressKHR;

    // KHR_copy_commands2
    public final long
        vkCmdCopyBuffer2KHR,
        vkCmdCopyImage2KHR,
        vkCmdCopyBufferToImage2KHR,
        vkCmdCopyImageToBuffer2KHR,
        vkCmdBlitImage2KHR,
        vkCmdResolveImage2KHR;

    // KHR_create_renderpass2
    public final long
        vkCreateRenderPass2KHR,
        vkCmdBeginRenderPass2KHR,
        vkCmdNextSubpass2KHR,
        vkCmdEndRenderPass2KHR;

    // KHR_deferred_host_operations
    public final long
        vkCreateDeferredOperationKHR,
        vkDestroyDeferredOperationKHR,
        vkGetDeferredOperationMaxConcurrencyKHR,
        vkGetDeferredOperationResultKHR,
        vkDeferredOperationJoinKHR;

    // KHR_descriptor_update_template
    public final long
        vkCreateDescriptorUpdateTemplateKHR,
        vkDestroyDescriptorUpdateTemplateKHR,
        vkUpdateDescriptorSetWithTemplateKHR,
        vkCmdPushDescriptorSetWithTemplateKHR;

    // KHR_device_group
    public final long
        vkGetDeviceGroupPeerMemoryFeaturesKHR,
        vkCmdSetDeviceMaskKHR,
        vkCmdDispatchBaseKHR,
        vkGetDeviceGroupPresentCapabilitiesKHR,
        vkGetDeviceGroupSurfacePresentModesKHR,
        vkAcquireNextImage2KHR;

    // KHR_display_swapchain
    public final long
        vkCreateSharedSwapchainsKHR;

    // KHR_draw_indirect_count
    public final long
        vkCmdDrawIndirectCountKHR,
        vkCmdDrawIndexedIndirectCountKHR;

    // KHR_external_fence_fd
    public final long
        vkImportFenceFdKHR,
        vkGetFenceFdKHR;

    // KHR_external_fence_win32
    public final long
        vkImportFenceWin32HandleKHR,
        vkGetFenceWin32HandleKHR;

    // KHR_external_memory_fd
    public final long
        vkGetMemoryFdKHR,
        vkGetMemoryFdPropertiesKHR;

    // KHR_external_memory_win32
    public final long
        vkGetMemoryWin32HandleKHR,
        vkGetMemoryWin32HandlePropertiesKHR;

    // KHR_external_semaphore_fd
    public final long
        vkImportSemaphoreFdKHR,
        vkGetSemaphoreFdKHR;

    // KHR_external_semaphore_win32
    public final long
        vkImportSemaphoreWin32HandleKHR,
        vkGetSemaphoreWin32HandleKHR;

    // KHR_fragment_shading_rate
    public final long
        vkCmdSetFragmentShadingRateKHR;

    // KHR_get_memory_requirements2
    public final long
        vkGetImageMemoryRequirements2KHR,
        vkGetBufferMemoryRequirements2KHR,
        vkGetImageSparseMemoryRequirements2KHR;

    // KHR_maintenance1
    public final long
        vkTrimCommandPoolKHR;

    // KHR_maintenance3
    public final long
        vkGetDescriptorSetLayoutSupportKHR;

    // KHR_performance_query
    public final long
        vkAcquireProfilingLockKHR,
        vkReleaseProfilingLockKHR;

    // KHR_pipeline_executable_properties
    public final long
        vkGetPipelineExecutablePropertiesKHR,
        vkGetPipelineExecutableStatisticsKHR,
        vkGetPipelineExecutableInternalRepresentationsKHR;

    // KHR_present_wait
    public final long
        vkWaitForPresentKHR;

    // KHR_push_descriptor
    public final long
        vkCmdPushDescriptorSetKHR;

    // KHR_ray_tracing_pipeline
    public final long
        vkCmdTraceRaysKHR,
        vkCreateRayTracingPipelinesKHR,
        vkGetRayTracingShaderGroupHandlesKHR,
        vkGetRayTracingCaptureReplayShaderGroupHandlesKHR,
        vkCmdTraceRaysIndirectKHR,
        vkGetRayTracingShaderGroupStackSizeKHR,
        vkCmdSetRayTracingPipelineStackSizeKHR;

    // KHR_sampler_ycbcr_conversion
    public final long
        vkCreateSamplerYcbcrConversionKHR,
        vkDestroySamplerYcbcrConversionKHR;

    // KHR_shared_presentable_image
    public final long
        vkGetSwapchainStatusKHR;

    // KHR_swapchain
    public final long
        vkCreateSwapchainKHR,
        vkDestroySwapchainKHR,
        vkGetSwapchainImagesKHR,
        vkAcquireNextImageKHR,
        vkQueuePresentKHR;

    // KHR_synchronization2
    public final long
        vkCmdSetEvent2KHR,
        vkCmdResetEvent2KHR,
        vkCmdWaitEvents2KHR,
        vkCmdPipelineBarrier2KHR,
        vkCmdWriteTimestamp2KHR,
        vkQueueSubmit2KHR,
        vkCmdWriteBufferMarker2AMD,
        vkGetQueueCheckpointData2NV;

    // KHR_timeline_semaphore
    public final long
        vkGetSemaphoreCounterValueKHR,
        vkWaitSemaphoresKHR,
        vkSignalSemaphoreKHR;

    // KHR_video_decode_queue
    public final long
        vkCmdDecodeVideoKHR;

    // KHR_video_encode_queue
    public final long
        vkCmdEncodeVideoKHR;

    // KHR_video_queue
    public final long
        vkCreateVideoSessionKHR,
        vkDestroyVideoSessionKHR,
        vkGetVideoSessionMemoryRequirementsKHR,
        vkBindVideoSessionMemoryKHR,
        vkCreateVideoSessionParametersKHR,
        vkUpdateVideoSessionParametersKHR,
        vkDestroyVideoSessionParametersKHR,
        vkCmdBeginVideoCodingKHR,
        vkCmdEndVideoCodingKHR,
        vkCmdControlVideoCodingKHR;

    // NV_clip_space_w_scaling
    public final long
        vkCmdSetViewportWScalingNV;

    // NV_device_diagnostic_checkpoints
    public final long
        vkCmdSetCheckpointNV,
        vkGetQueueCheckpointDataNV;

    // NV_device_generated_commands
    public final long
        vkGetGeneratedCommandsMemoryRequirementsNV,
        vkCmdPreprocessGeneratedCommandsNV,
        vkCmdExecuteGeneratedCommandsNV,
        vkCmdBindPipelineShaderGroupNV,
        vkCreateIndirectCommandsLayoutNV,
        vkDestroyIndirectCommandsLayoutNV;

    // NV_external_memory_rdma
    public final long
        vkGetMemoryRemoteAddressNV;

    // NV_external_memory_win32
    public final long
        vkGetMemoryWin32HandleNV;

    // NV_fragment_shading_rate_enums
    public final long
        vkCmdSetFragmentShadingRateEnumNV;

    // NV_mesh_shader
    public final long
        vkCmdDrawMeshTasksNV,
        vkCmdDrawMeshTasksIndirectNV,
        vkCmdDrawMeshTasksIndirectCountNV;

    // NV_ray_tracing
    public final long
        vkCreateAccelerationStructureNV,
        vkDestroyAccelerationStructureNV,
        vkGetAccelerationStructureMemoryRequirementsNV,
        vkBindAccelerationStructureMemoryNV,
        vkCmdBuildAccelerationStructureNV,
        vkCmdCopyAccelerationStructureNV,
        vkCmdTraceRaysNV,
        vkCreateRayTracingPipelinesNV,
        vkGetRayTracingShaderGroupHandlesNV,
        vkGetAccelerationStructureHandleNV,
        vkCmdWriteAccelerationStructuresPropertiesNV,
        vkCompileDeferredNV;

    // NV_scissor_exclusive
    public final long
        vkCmdSetExclusiveScissorNV;

    // NV_shading_rate_image
    public final long
        vkCmdBindShadingRateImageNV,
        vkCmdSetViewportShadingRatePaletteNV,
        vkCmdSetCoarseSampleOrderNV;

    // NVX_binary_import
    public final long
        vkCreateCuModuleNVX,
        vkCreateCuFunctionNVX,
        vkDestroyCuModuleNVX,
        vkDestroyCuFunctionNVX,
        vkCmdCuLaunchKernelNVX;

    // NVX_image_view_handle
    public final long
        vkGetImageViewHandleNVX,
        vkGetImageViewAddressNVX;

    /** The Vulkan API version number. */
    public final int apiVersion;

    /** When true, {@link VK10} is supported. */
    public final boolean Vulkan10;
    /** When true, {@link VK11} is supported. */
    public final boolean Vulkan11;
    /** When true, {@link VK12} is supported. */
    public final boolean Vulkan12;
    /** When true, {@link AMDBufferMarker} is supported. */
    public final boolean VK_AMD_buffer_marker;
    /** When true, {@link AMDDeviceCoherentMemory} is supported. */
    public final boolean VK_AMD_device_coherent_memory;
    /** When true, {@link AMDDisplayNativeHdr} is supported. */
    public final boolean VK_AMD_display_native_hdr;
    /** When true, {@link AMDDrawIndirectCount} is supported. */
    public final boolean VK_AMD_draw_indirect_count;
    /** When true, {@link AMDGCNShader} is supported. */
    public final boolean VK_AMD_gcn_shader;
    /** When true, {@link AMDGPUShaderHalfFloat} is supported. */
    public final boolean VK_AMD_gpu_shader_half_float;
    /** When true, {@link AMDGPUShaderInt16} is supported. */
    public final boolean VK_AMD_gpu_shader_int16;
    /** When true, {@link AMDMemoryOverallocationBehavior} is supported. */
    public final boolean VK_AMD_memory_overallocation_behavior;
    /** When true, {@link AMDMixedAttachmentSamples} is supported. */
    public final boolean VK_AMD_mixed_attachment_samples;
    /** When true, {@link AMDNegativeViewportHeight} is supported. */
    public final boolean VK_AMD_negative_viewport_height;
    /** When true, {@link AMDPipelineCompilerControl} is supported. */
    public final boolean VK_AMD_pipeline_compiler_control;
    /** When true, {@link AMDRasterizationOrder} is supported. */
    public final boolean VK_AMD_rasterization_order;
    /** When true, {@link AMDShaderBallot} is supported. */
    public final boolean VK_AMD_shader_ballot;
    /** When true, {@link AMDShaderCoreProperties} is supported. */
    public final boolean VK_AMD_shader_core_properties;
    /** When true, {@link AMDShaderCoreProperties2} is supported. */
    public final boolean VK_AMD_shader_core_properties2;
    /** When true, {@link AMDShaderExplicitVertexParameter} is supported. */
    public final boolean VK_AMD_shader_explicit_vertex_parameter;
    /** When true, {@link AMDShaderFragmentMask} is supported. */
    public final boolean VK_AMD_shader_fragment_mask;
    /** When true, {@link AMDShaderImageLoadStoreLod} is supported. */
    public final boolean VK_AMD_shader_image_load_store_lod;
    /** When true, {@link AMDShaderInfo} is supported. */
    public final boolean VK_AMD_shader_info;
    /** When true, {@link AMDShaderTrinaryMinmax} is supported. */
    public final boolean VK_AMD_shader_trinary_minmax;
    /** When true, {@link AMDTextureGatherBiasLod} is supported. */
    public final boolean VK_AMD_texture_gather_bias_lod;
    /** When true, {@link EXT4444Formats} is supported. */
    public final boolean VK_EXT_4444_formats;
    /** When true, {@link EXTAstcDecodeMode} is supported. */
    public final boolean VK_EXT_astc_decode_mode;
    /** When true, {@link EXTBlendOperationAdvanced} is supported. */
    public final boolean VK_EXT_blend_operation_advanced;
    /** When true, {@link EXTBufferDeviceAddress} is supported. */
    public final boolean VK_EXT_buffer_device_address;
    /** When true, {@link EXTCalibratedTimestamps} is supported. */
    public final boolean VK_EXT_calibrated_timestamps;
    /** When true, {@link EXTColorWriteEnable} is supported. */
    public final boolean VK_EXT_color_write_enable;
    /** When true, {@link EXTConditionalRendering} is supported. */
    public final boolean VK_EXT_conditional_rendering;
    /** When true, {@link EXTConservativeRasterization} is supported. */
    public final boolean VK_EXT_conservative_rasterization;
    /** When true, {@link EXTCustomBorderColor} is supported. */
    public final boolean VK_EXT_custom_border_color;
    /** When true, {@link EXTDebugMarker} is supported. */
    public final boolean VK_EXT_debug_marker;
    /** When true, {@link EXTDepthClipEnable} is supported. */
    public final boolean VK_EXT_depth_clip_enable;
    /** When true, {@link EXTDepthRangeUnrestricted} is supported. */
    public final boolean VK_EXT_depth_range_unrestricted;
    /** When true, {@link EXTDescriptorIndexing} is supported. */
    public final boolean VK_EXT_descriptor_indexing;
    /** When true, {@link EXTDeviceMemoryReport} is supported. */
    public final boolean VK_EXT_device_memory_report;
    /** When true, {@link EXTDiscardRectangles} is supported. */
    public final boolean VK_EXT_discard_rectangles;
    /** When true, {@link EXTDisplayControl} is supported. */
    public final boolean VK_EXT_display_control;
    /** When true, {@link EXTExtendedDynamicState} is supported. */
    public final boolean VK_EXT_extended_dynamic_state;
    /** When true, {@link EXTExtendedDynamicState2} is supported. */
    public final boolean VK_EXT_extended_dynamic_state2;
    /** When true, {@link EXTExternalMemoryDmaBuf} is supported. */
    public final boolean VK_EXT_external_memory_dma_buf;
    /** When true, {@link EXTExternalMemoryHost} is supported. */
    public final boolean VK_EXT_external_memory_host;
    /** When true, {@link EXTFilterCubic} is supported. */
    public final boolean VK_EXT_filter_cubic;
    /** When true, {@link EXTFragmentDensityMap} is supported. */
    public final boolean VK_EXT_fragment_density_map;
    /** When true, {@link EXTFragmentDensityMap2} is supported. */
    public final boolean VK_EXT_fragment_density_map2;
    /** When true, {@link EXTFragmentShaderInterlock} is supported. */
    public final boolean VK_EXT_fragment_shader_interlock;
    /** When true, {@link EXTFullScreenExclusive} is supported. */
    public final boolean VK_EXT_full_screen_exclusive;
    /** When true, {@link EXTGlobalPriority} is supported. */
    public final boolean VK_EXT_global_priority;
    /** When true, {@link EXTGlobalPriorityQuery} is supported. */
    public final boolean VK_EXT_global_priority_query;
    /** When true, {@link EXTHdrMetadata} is supported. */
    public final boolean VK_EXT_hdr_metadata;
    /** When true, {@link EXTHostQueryReset} is supported. */
    public final boolean VK_EXT_host_query_reset;
    /** When true, {@link EXTImageDrmFormatModifier} is supported. */
    public final boolean VK_EXT_image_drm_format_modifier;
    /** When true, {@link EXTImageRobustness} is supported. */
    public final boolean VK_EXT_image_robustness;
    /** When true, {@link EXTIndexTypeUint8} is supported. */
    public final boolean VK_EXT_index_type_uint8;
    /** When true, {@link EXTInlineUniformBlock} is supported. */
    public final boolean VK_EXT_inline_uniform_block;
    /** When true, {@link EXTLineRasterization} is supported. */
    public final boolean VK_EXT_line_rasterization;
    /** When true, {@link EXTLoadStoreOpNone} is supported. */
    public final boolean VK_EXT_load_store_op_none;
    /** When true, {@link EXTMemoryBudget} is supported. */
    public final boolean VK_EXT_memory_budget;
    /** When true, {@link EXTMemoryPriority} is supported. */
    public final boolean VK_EXT_memory_priority;
    /** When true, {@link EXTMultiDraw} is supported. */
    public final boolean VK_EXT_multi_draw;
    /** When true, {@link EXTPciBusInfo} is supported. */
    public final boolean VK_EXT_pci_bus_info;
    /** When true, {@link EXTPhysicalDeviceDrm} is supported. */
    public final boolean VK_EXT_physical_device_drm;
    /** When true, {@link EXTPipelineCreationCacheControl} is supported. */
    public final boolean VK_EXT_pipeline_creation_cache_control;
    /** When true, {@link EXTPipelineCreationFeedback} is supported. */
    public final boolean VK_EXT_pipeline_creation_feedback;
    /** When true, {@link EXTPostDepthCoverage} is supported. */
    public final boolean VK_EXT_post_depth_coverage;
    /** When true, {@link EXTPrimitiveTopologyListRestart} is supported. */
    public final boolean VK_EXT_primitive_topology_list_restart;
    /** When true, {@link EXTPrivateData} is supported. */
    public final boolean VK_EXT_private_data;
    /** When true, {@link EXTProvokingVertex} is supported. */
    public final boolean VK_EXT_provoking_vertex;
    /** When true, {@link EXTQueueFamilyForeign} is supported. */
    public final boolean VK_EXT_queue_family_foreign;
    /** When true, {@link EXTRobustness2} is supported. */
    public final boolean VK_EXT_robustness2;
    /** When true, {@link EXTSampleLocations} is supported. */
    public final boolean VK_EXT_sample_locations;
    /** When true, {@link EXTSamplerFilterMinmax} is supported. */
    public final boolean VK_EXT_sampler_filter_minmax;
    /** When true, {@link EXTScalarBlockLayout} is supported. */
    public final boolean VK_EXT_scalar_block_layout;
    /** When true, {@link EXTSeparateStencilUsage} is supported. */
    public final boolean VK_EXT_separate_stencil_usage;
    /** When true, {@link EXTShaderAtomicFloat} is supported. */
    public final boolean VK_EXT_shader_atomic_float;
    /** When true, {@link EXTShaderAtomicFloat2} is supported. */
    public final boolean VK_EXT_shader_atomic_float2;
    /** When true, {@link EXTShaderDemoteToHelperInvocation} is supported. */
    public final boolean VK_EXT_shader_demote_to_helper_invocation;
    /** When true, {@link EXTShaderImageAtomicInt64} is supported. */
    public final boolean VK_EXT_shader_image_atomic_int64;
    /** When true, {@link EXTShaderStencilExport} is supported. */
    public final boolean VK_EXT_shader_stencil_export;
    /** When true, {@link EXTShaderSubgroupBallot} is supported. */
    public final boolean VK_EXT_shader_subgroup_ballot;
    /** When true, {@link EXTShaderSubgroupVote} is supported. */
    public final boolean VK_EXT_shader_subgroup_vote;
    /** When true, {@link EXTShaderViewportIndexLayer} is supported. */
    public final boolean VK_EXT_shader_viewport_index_layer;
    /** When true, {@link EXTSubgroupSizeControl} is supported. */
    public final boolean VK_EXT_subgroup_size_control;
    /** When true, {@link EXTTexelBufferAlignment} is supported. */
    public final boolean VK_EXT_texel_buffer_alignment;
    /** When true, {@link EXTTextureCompressionAstcHdr} is supported. */
    public final boolean VK_EXT_texture_compression_astc_hdr;
    /** When true, {@link EXTToolingInfo} is supported. */
    public final boolean VK_EXT_tooling_info;
    /** When true, {@link EXTTransformFeedback} is supported. */
    public final boolean VK_EXT_transform_feedback;
    /** When true, {@link EXTValidationCache} is supported. */
    public final boolean VK_EXT_validation_cache;
    /** When true, {@link EXTVertexAttributeDivisor} is supported. */
    public final boolean VK_EXT_vertex_attribute_divisor;
    /** When true, {@link EXTVertexInputDynamicState} is supported. */
    public final boolean VK_EXT_vertex_input_dynamic_state;
    /** When true, {@link EXTVideoDecodeH264} is supported. */
    public final boolean VK_EXT_video_decode_h264;
    /** When true, {@link EXTVideoDecodeH265} is supported. */
    public final boolean VK_EXT_video_decode_h265;
    /** When true, {@link EXTVideoEncodeH264} is supported. */
    public final boolean VK_EXT_video_encode_h264;
    /** When true, {@link EXTYcbcr2plane444Formats} is supported. */
    public final boolean VK_EXT_ycbcr_2plane_444_formats;
    /** When true, {@link EXTYcbcrImageArrays} is supported. */
    public final boolean VK_EXT_ycbcr_image_arrays;
    /** When true, {@link GOOGLEDecorateString} is supported. */
    public final boolean VK_GOOGLE_decorate_string;
    /** When true, {@link GOOGLEDisplayTiming} is supported. */
    public final boolean VK_GOOGLE_display_timing;
    /** When true, {@link GOOGLEHlslFunctionality1} is supported. */
    public final boolean VK_GOOGLE_hlsl_functionality1;
    /** When true, {@link GOOGLEUserType} is supported. */
    public final boolean VK_GOOGLE_user_type;
    /** When true, {@link HUAWEIInvocationMask} is supported. */
    public final boolean VK_HUAWEI_invocation_mask;
    /** When true, {@link HUAWEISubpassShading} is supported. */
    public final boolean VK_HUAWEI_subpass_shading;
    /** When true, {@link IMGFilterCubic} is supported. */
    public final boolean VK_IMG_filter_cubic;
    /** When true, {@link IMGFormatPVRTC} is supported. */
    public final boolean VK_IMG_format_pvrtc;
    /** When true, {@link INTELPerformanceQuery} is supported. */
    public final boolean VK_INTEL_performance_query;
    /** When true, {@link INTELShaderIntegerFunctions2} is supported. */
    public final boolean VK_INTEL_shader_integer_functions2;
    /** When true, {@link KHR16bitStorage} is supported. */
    public final boolean VK_KHR_16bit_storage;
    /** When true, {@link KHR8bitStorage} is supported. */
    public final boolean VK_KHR_8bit_storage;
    /** When true, {@link KHRAccelerationStructure} is supported. */
    public final boolean VK_KHR_acceleration_structure;
    /** When true, {@link KHRBindMemory2} is supported. */
    public final boolean VK_KHR_bind_memory2;
    /** When true, {@link KHRBufferDeviceAddress} is supported. */
    public final boolean VK_KHR_buffer_device_address;
    /** When true, {@link KHRCopyCommands2} is supported. */
    public final boolean VK_KHR_copy_commands2;
    /** When true, {@link KHRCreateRenderpass2} is supported. */
    public final boolean VK_KHR_create_renderpass2;
    /** When true, {@link KHRDedicatedAllocation} is supported. */
    public final boolean VK_KHR_dedicated_allocation;
    /** When true, {@link KHRDeferredHostOperations} is supported. */
    public final boolean VK_KHR_deferred_host_operations;
    /** When true, {@link KHRDepthStencilResolve} is supported. */
    public final boolean VK_KHR_depth_stencil_resolve;
    /** When true, {@link KHRDescriptorUpdateTemplate} is supported. */
    public final boolean VK_KHR_descriptor_update_template;
    /** When true, {@link KHRDeviceGroup} is supported. */
    public final boolean VK_KHR_device_group;
    /** When true, {@link KHRDisplaySwapchain} is supported. */
    public final boolean VK_KHR_display_swapchain;
    /** When true, {@link KHRDrawIndirectCount} is supported. */
    public final boolean VK_KHR_draw_indirect_count;
    /** When true, {@link KHRDriverProperties} is supported. */
    public final boolean VK_KHR_driver_properties;
    /** When true, {@link KHRExternalFence} is supported. */
    public final boolean VK_KHR_external_fence;
    /** When true, {@link KHRExternalFenceFd} is supported. */
    public final boolean VK_KHR_external_fence_fd;
    /** When true, {@link KHRExternalFenceWin32} is supported. */
    public final boolean VK_KHR_external_fence_win32;
    /** When true, {@link KHRExternalMemory} is supported. */
    public final boolean VK_KHR_external_memory;
    /** When true, {@link KHRExternalMemoryFd} is supported. */
    public final boolean VK_KHR_external_memory_fd;
    /** When true, {@link KHRExternalMemoryWin32} is supported. */
    public final boolean VK_KHR_external_memory_win32;
    /** When true, {@link KHRExternalSemaphore} is supported. */
    public final boolean VK_KHR_external_semaphore;
    /** When true, {@link KHRExternalSemaphoreFd} is supported. */
    public final boolean VK_KHR_external_semaphore_fd;
    /** When true, {@link KHRExternalSemaphoreWin32} is supported. */
    public final boolean VK_KHR_external_semaphore_win32;
    /** When true, {@link KHRFragmentShadingRate} is supported. */
    public final boolean VK_KHR_fragment_shading_rate;
    /** When true, {@link KHRGetMemoryRequirements2} is supported. */
    public final boolean VK_KHR_get_memory_requirements2;
    /** When true, {@link KHRImageFormatList} is supported. */
    public final boolean VK_KHR_image_format_list;
    /** When true, {@link KHRImagelessFramebuffer} is supported. */
    public final boolean VK_KHR_imageless_framebuffer;
    /** When true, {@link KHRIncrementalPresent} is supported. */
    public final boolean VK_KHR_incremental_present;
    /** When true, {@link KHRMaintenance1} is supported. */
    public final boolean VK_KHR_maintenance1;
    /** When true, {@link KHRMaintenance2} is supported. */
    public final boolean VK_KHR_maintenance2;
    /** When true, {@link KHRMaintenance3} is supported. */
    public final boolean VK_KHR_maintenance3;
    /** When true, {@link KHRMultiview} is supported. */
    public final boolean VK_KHR_multiview;
    /** When true, {@link KHRPerformanceQuery} is supported. */
    public final boolean VK_KHR_performance_query;
    /** When true, {@link KHRPipelineExecutableProperties} is supported. */
    public final boolean VK_KHR_pipeline_executable_properties;
    /** When true, {@link KHRPipelineLibrary} is supported. */
    public final boolean VK_KHR_pipeline_library;
    /** When true, {@link KHRPortabilitySubset} is supported. */
    public final boolean VK_KHR_portability_subset;
    /** When true, {@link KHRPresentId} is supported. */
    public final boolean VK_KHR_present_id;
    /** When true, {@link KHRPresentWait} is supported. */
    public final boolean VK_KHR_present_wait;
    /** When true, {@link KHRPushDescriptor} is supported. */
    public final boolean VK_KHR_push_descriptor;
    /** When true, {@link KHRRayQuery} is supported. */
    public final boolean VK_KHR_ray_query;
    /** When true, {@link KHRRayTracingPipeline} is supported. */
    public final boolean VK_KHR_ray_tracing_pipeline;
    /** When true, {@link KHRRelaxedBlockLayout} is supported. */
    public final boolean VK_KHR_relaxed_block_layout;
    /** When true, {@link KHRSamplerMirrorClampToEdge} is supported. */
    public final boolean VK_KHR_sampler_mirror_clamp_to_edge;
    /** When true, {@link KHRSamplerYcbcrConversion} is supported. */
    public final boolean VK_KHR_sampler_ycbcr_conversion;
    /** When true, {@link KHRSeparateDepthStencilLayouts} is supported. */
    public final boolean VK_KHR_separate_depth_stencil_layouts;
    /** When true, {@link KHRShaderAtomicInt64} is supported. */
    public final boolean VK_KHR_shader_atomic_int64;
    /** When true, {@link KHRShaderClock} is supported. */
    public final boolean VK_KHR_shader_clock;
    /** When true, {@link KHRShaderDrawParameters} is supported. */
    public final boolean VK_KHR_shader_draw_parameters;
    /** When true, {@link KHRShaderFloat16Int8} is supported. */
    public final boolean VK_KHR_shader_float16_int8;
    /** When true, {@link KHRShaderFloatControls} is supported. */
    public final boolean VK_KHR_shader_float_controls;
    /** When true, {@link KHRShaderIntegerDotProduct} is supported. */
    public final boolean VK_KHR_shader_integer_dot_product;
    /** When true, {@link KHRShaderNonSemanticInfo} is supported. */
    public final boolean VK_KHR_shader_non_semantic_info;
    /** When true, {@link KHRShaderSubgroupExtendedTypes} is supported. */
    public final boolean VK_KHR_shader_subgroup_extended_types;
    /** When true, {@link KHRShaderSubgroupUniformControlFlow} is supported. */
    public final boolean VK_KHR_shader_subgroup_uniform_control_flow;
    /** When true, {@link KHRShaderTerminateInvocation} is supported. */
    public final boolean VK_KHR_shader_terminate_invocation;
    /** When true, {@link KHRSharedPresentableImage} is supported. */
    public final boolean VK_KHR_shared_presentable_image;
    /** When true, {@link KHRSpirv14} is supported. */
    public final boolean VK_KHR_spirv_1_4;
    /** When true, {@link KHRStorageBufferStorageClass} is supported. */
    public final boolean VK_KHR_storage_buffer_storage_class;
    /** When true, {@link KHRSwapchain} is supported. */
    public final boolean VK_KHR_swapchain;
    /** When true, {@link KHRSwapchainMutableFormat} is supported. */
    public final boolean VK_KHR_swapchain_mutable_format;
    /** When true, {@link KHRSynchronization2} is supported. */
    public final boolean VK_KHR_synchronization2;
    /** When true, {@link KHRTimelineSemaphore} is supported. */
    public final boolean VK_KHR_timeline_semaphore;
    /** When true, {@link KHRUniformBufferStandardLayout} is supported. */
    public final boolean VK_KHR_uniform_buffer_standard_layout;
    /** When true, {@link KHRVariablePointers} is supported. */
    public final boolean VK_KHR_variable_pointers;
    /** When true, {@link KHRVideoDecodeQueue} is supported. */
    public final boolean VK_KHR_video_decode_queue;
    /** When true, {@link KHRVideoEncodeQueue} is supported. */
    public final boolean VK_KHR_video_encode_queue;
    /** When true, {@link KHRVideoQueue} is supported. */
    public final boolean VK_KHR_video_queue;
    /** When true, {@link KHRVulkanMemoryModel} is supported. */
    public final boolean VK_KHR_vulkan_memory_model;
    /** When true, {@link KHRWin32KeyedMutex} is supported. */
    public final boolean VK_KHR_win32_keyed_mutex;
    /** When true, {@link KHRWorkgroupMemoryExplicitLayout} is supported. */
    public final boolean VK_KHR_workgroup_memory_explicit_layout;
    /** When true, {@link KHRZeroInitializeWorkgroupMemory} is supported. */
    public final boolean VK_KHR_zero_initialize_workgroup_memory;
    /** When true, {@link NVAcquireWinrtDisplay} is supported. */
    public final boolean VK_NV_acquire_winrt_display;
    /** When true, {@link NVClipSpaceWScaling} is supported. */
    public final boolean VK_NV_clip_space_w_scaling;
    /** When true, {@link NVComputeShaderDerivatives} is supported. */
    public final boolean VK_NV_compute_shader_derivatives;
    /** When true, {@link NVCooperativeMatrix} is supported. */
    public final boolean VK_NV_cooperative_matrix;
    /** When true, {@link NVCornerSampledImage} is supported. */
    public final boolean VK_NV_corner_sampled_image;
    /** When true, {@link NVCoverageReductionMode} is supported. */
    public final boolean VK_NV_coverage_reduction_mode;
    /** When true, {@link NVDedicatedAllocation} is supported. */
    public final boolean VK_NV_dedicated_allocation;
    /** When true, {@link NVDedicatedAllocationImageAliasing} is supported. */
    public final boolean VK_NV_dedicated_allocation_image_aliasing;
    /** When true, {@link NVDeviceDiagnosticCheckpoints} is supported. */
    public final boolean VK_NV_device_diagnostic_checkpoints;
    /** When true, {@link NVDeviceDiagnosticsConfig} is supported. */
    public final boolean VK_NV_device_diagnostics_config;
    /** When true, {@link NVDeviceGeneratedCommands} is supported. */
    public final boolean VK_NV_device_generated_commands;
    /** When true, {@link NVExternalMemory} is supported. */
    public final boolean VK_NV_external_memory;
    /** When true, {@link NVExternalMemoryRdma} is supported. */
    public final boolean VK_NV_external_memory_rdma;
    /** When true, {@link NVExternalMemoryWin32} is supported. */
    public final boolean VK_NV_external_memory_win32;
    /** When true, {@link NVFillRectangle} is supported. */
    public final boolean VK_NV_fill_rectangle;
    /** When true, {@link NVFragmentCoverageToColor} is supported. */
    public final boolean VK_NV_fragment_coverage_to_color;
    /** When true, {@link NVFragmentShaderBarycentric} is supported. */
    public final boolean VK_NV_fragment_shader_barycentric;
    /** When true, {@link NVFragmentShadingRateEnums} is supported. */
    public final boolean VK_NV_fragment_shading_rate_enums;
    /** When true, {@link NVFramebufferMixedSamples} is supported. */
    public final boolean VK_NV_framebuffer_mixed_samples;
    /** When true, {@link NVGeometryShaderPassthrough} is supported. */
    public final boolean VK_NV_geometry_shader_passthrough;
    /** When true, {@link NVGLSLShader} is supported. */
    public final boolean VK_NV_glsl_shader;
    /** When true, {@link NVInheritedViewportScissor} is supported. */
    public final boolean VK_NV_inherited_viewport_scissor;
    /** When true, {@link NVMeshShader} is supported. */
    public final boolean VK_NV_mesh_shader;
    /** When true, {@link NVRayTracing} is supported. */
    public final boolean VK_NV_ray_tracing;
    /** When true, {@link NVRayTracingMotionBlur} is supported. */
    public final boolean VK_NV_ray_tracing_motion_blur;
    /** When true, {@link NVRepresentativeFragmentTest} is supported. */
    public final boolean VK_NV_representative_fragment_test;
    /** When true, {@link NVSampleMaskOverrideCoverage} is supported. */
    public final boolean VK_NV_sample_mask_override_coverage;
    /** When true, {@link NVScissorExclusive} is supported. */
    public final boolean VK_NV_scissor_exclusive;
    /** When true, {@link NVShaderImageFootprint} is supported. */
    public final boolean VK_NV_shader_image_footprint;
    /** When true, {@link NVShaderSmBuiltins} is supported. */
    public final boolean VK_NV_shader_sm_builtins;
    /** When true, {@link NVShaderSubgroupPartitioned} is supported. */
    public final boolean VK_NV_shader_subgroup_partitioned;
    /** When true, {@link NVShadingRateImage} is supported. */
    public final boolean VK_NV_shading_rate_image;
    /** When true, {@link NVViewportArray2} is supported. */
    public final boolean VK_NV_viewport_array2;
    /** When true, {@link NVViewportSwizzle} is supported. */
    public final boolean VK_NV_viewport_swizzle;
    /** When true, {@link NVWin32KeyedMutex} is supported. */
    public final boolean VK_NV_win32_keyed_mutex;
    /** When true, {@link NVXBinaryImport} is supported. */
    public final boolean VK_NVX_binary_import;
    /** When true, {@link NVXImageViewHandle} is supported. */
    public final boolean VK_NVX_image_view_handle;
    /** When true, {@link NVXMultiviewPerViewAttributes} is supported. */
    public final boolean VK_NVX_multiview_per_view_attributes;
    /** When true, {@link QCOMRenderPassShaderResolve} is supported. */
    public final boolean VK_QCOM_render_pass_shader_resolve;
    /** When true, {@link QCOMRenderPassStoreOps} is supported. */
    public final boolean VK_QCOM_render_pass_store_ops;
    /** When true, {@link QCOMRenderPassTransform} is supported. */
    public final boolean VK_QCOM_render_pass_transform;
    /** When true, {@link QCOMRotatedCopyCommands} is supported. */
    public final boolean VK_QCOM_rotated_copy_commands;
    /** When true, {@code STD_vulkan_video_codec_h264} is supported. */
    public final boolean VK_STD_vulkan_video_codec_h264;
    /** When true, {@code STD_vulkan_video_codec_h265} is supported. */
    public final boolean VK_STD_vulkan_video_codec_h265;
    /** When true, {@link VALVEMutableDescriptorType} is supported. */
    public final boolean VK_VALVE_mutable_descriptor_type;

    VKCapabilitiesDevice(FunctionProvider provider, VKCapabilitiesInstance capsInstance, int apiVersion, Set<String> ext) {
        this.apiVersion = apiVersion;

        long[] caps = new long[385];

        Vulkan10 = check_VK10(provider, caps, ext);
        Vulkan11 = check_VK11(provider, caps, ext);
        Vulkan12 = check_VK12(provider, caps, ext);
        VK_AMD_buffer_marker = check_AMD_buffer_marker(provider, caps, ext);
        VK_AMD_device_coherent_memory = ext.contains("VK_AMD_device_coherent_memory");
        VK_AMD_display_native_hdr = check_AMD_display_native_hdr(provider, caps, ext);
        VK_AMD_draw_indirect_count = check_AMD_draw_indirect_count(provider, caps, ext);
        VK_AMD_gcn_shader = ext.contains("VK_AMD_gcn_shader");
        VK_AMD_gpu_shader_half_float = ext.contains("VK_AMD_gpu_shader_half_float");
        VK_AMD_gpu_shader_int16 = ext.contains("VK_AMD_gpu_shader_int16");
        VK_AMD_memory_overallocation_behavior = ext.contains("VK_AMD_memory_overallocation_behavior");
        VK_AMD_mixed_attachment_samples = ext.contains("VK_AMD_mixed_attachment_samples");
        VK_AMD_negative_viewport_height = ext.contains("VK_AMD_negative_viewport_height");
        VK_AMD_pipeline_compiler_control = ext.contains("VK_AMD_pipeline_compiler_control");
        VK_AMD_rasterization_order = ext.contains("VK_AMD_rasterization_order");
        VK_AMD_shader_ballot = ext.contains("VK_AMD_shader_ballot");
        VK_AMD_shader_core_properties = ext.contains("VK_AMD_shader_core_properties");
        VK_AMD_shader_core_properties2 = ext.contains("VK_AMD_shader_core_properties2");
        VK_AMD_shader_explicit_vertex_parameter = ext.contains("VK_AMD_shader_explicit_vertex_parameter");
        VK_AMD_shader_fragment_mask = ext.contains("VK_AMD_shader_fragment_mask");
        VK_AMD_shader_image_load_store_lod = ext.contains("VK_AMD_shader_image_load_store_lod");
        VK_AMD_shader_info = check_AMD_shader_info(provider, caps, ext);
        VK_AMD_shader_trinary_minmax = ext.contains("VK_AMD_shader_trinary_minmax");
        VK_AMD_texture_gather_bias_lod = ext.contains("VK_AMD_texture_gather_bias_lod");
        VK_EXT_4444_formats = ext.contains("VK_EXT_4444_formats");
        VK_EXT_astc_decode_mode = ext.contains("VK_EXT_astc_decode_mode");
        VK_EXT_blend_operation_advanced = ext.contains("VK_EXT_blend_operation_advanced");
        VK_EXT_buffer_device_address = check_EXT_buffer_device_address(provider, caps, ext);
        VK_EXT_calibrated_timestamps = check_EXT_calibrated_timestamps(provider, caps, ext);
        VK_EXT_color_write_enable = check_EXT_color_write_enable(provider, caps, ext);
        VK_EXT_conditional_rendering = check_EXT_conditional_rendering(provider, caps, ext);
        VK_EXT_conservative_rasterization = ext.contains("VK_EXT_conservative_rasterization");
        VK_EXT_custom_border_color = ext.contains("VK_EXT_custom_border_color");
        VK_EXT_debug_marker = check_EXT_debug_marker(provider, caps, ext);
        check_EXT_debug_utils(provider, caps, capsInstance);
        VK_EXT_depth_clip_enable = ext.contains("VK_EXT_depth_clip_enable");
        VK_EXT_depth_range_unrestricted = ext.contains("VK_EXT_depth_range_unrestricted");
        VK_EXT_descriptor_indexing = ext.contains("VK_EXT_descriptor_indexing");
        VK_EXT_device_memory_report = ext.contains("VK_EXT_device_memory_report");
        VK_EXT_discard_rectangles = check_EXT_discard_rectangles(provider, caps, ext);
        VK_EXT_display_control = check_EXT_display_control(provider, caps, ext);
        VK_EXT_extended_dynamic_state = check_EXT_extended_dynamic_state(provider, caps, ext);
        VK_EXT_extended_dynamic_state2 = check_EXT_extended_dynamic_state2(provider, caps, ext);
        VK_EXT_external_memory_dma_buf = ext.contains("VK_EXT_external_memory_dma_buf");
        VK_EXT_external_memory_host = check_EXT_external_memory_host(provider, caps, ext);
        VK_EXT_filter_cubic = ext.contains("VK_EXT_filter_cubic");
        VK_EXT_fragment_density_map = ext.contains("VK_EXT_fragment_density_map");
        VK_EXT_fragment_density_map2 = ext.contains("VK_EXT_fragment_density_map2");
        VK_EXT_fragment_shader_interlock = ext.contains("VK_EXT_fragment_shader_interlock");
        VK_EXT_full_screen_exclusive = check_EXT_full_screen_exclusive(provider, caps, ext);
        VK_EXT_global_priority = ext.contains("VK_EXT_global_priority");
        VK_EXT_global_priority_query = ext.contains("VK_EXT_global_priority_query");
        VK_EXT_hdr_metadata = check_EXT_hdr_metadata(provider, caps, ext);
        VK_EXT_host_query_reset = check_EXT_host_query_reset(provider, caps, ext);
        VK_EXT_image_drm_format_modifier = check_EXT_image_drm_format_modifier(provider, caps, ext);
        VK_EXT_image_robustness = ext.contains("VK_EXT_image_robustness");
        VK_EXT_index_type_uint8 = ext.contains("VK_EXT_index_type_uint8");
        VK_EXT_inline_uniform_block = ext.contains("VK_EXT_inline_uniform_block");
        VK_EXT_line_rasterization = check_EXT_line_rasterization(provider, caps, ext);
        VK_EXT_load_store_op_none = ext.contains("VK_EXT_load_store_op_none");
        VK_EXT_memory_budget = ext.contains("VK_EXT_memory_budget");
        VK_EXT_memory_priority = ext.contains("VK_EXT_memory_priority");
        VK_EXT_multi_draw = check_EXT_multi_draw(provider, caps, ext);
        VK_EXT_pci_bus_info = ext.contains("VK_EXT_pci_bus_info");
        VK_EXT_physical_device_drm = ext.contains("VK_EXT_physical_device_drm");
        VK_EXT_pipeline_creation_cache_control = ext.contains("VK_EXT_pipeline_creation_cache_control");
        VK_EXT_pipeline_creation_feedback = ext.contains("VK_EXT_pipeline_creation_feedback");
        VK_EXT_post_depth_coverage = ext.contains("VK_EXT_post_depth_coverage");
        VK_EXT_primitive_topology_list_restart = ext.contains("VK_EXT_primitive_topology_list_restart");
        VK_EXT_private_data = check_EXT_private_data(provider, caps, ext);
        VK_EXT_provoking_vertex = ext.contains("VK_EXT_provoking_vertex");
        VK_EXT_queue_family_foreign = ext.contains("VK_EXT_queue_family_foreign");
        VK_EXT_robustness2 = ext.contains("VK_EXT_robustness2");
        VK_EXT_sample_locations = check_EXT_sample_locations(provider, caps, ext);
        VK_EXT_sampler_filter_minmax = ext.contains("VK_EXT_sampler_filter_minmax");
        VK_EXT_scalar_block_layout = ext.contains("VK_EXT_scalar_block_layout");
        VK_EXT_separate_stencil_usage = ext.contains("VK_EXT_separate_stencil_usage");
        VK_EXT_shader_atomic_float = ext.contains("VK_EXT_shader_atomic_float");
        VK_EXT_shader_atomic_float2 = ext.contains("VK_EXT_shader_atomic_float2");
        VK_EXT_shader_demote_to_helper_invocation = ext.contains("VK_EXT_shader_demote_to_helper_invocation");
        VK_EXT_shader_image_atomic_int64 = ext.contains("VK_EXT_shader_image_atomic_int64");
        VK_EXT_shader_stencil_export = ext.contains("VK_EXT_shader_stencil_export");
        VK_EXT_shader_subgroup_ballot = ext.contains("VK_EXT_shader_subgroup_ballot");
        VK_EXT_shader_subgroup_vote = ext.contains("VK_EXT_shader_subgroup_vote");
        VK_EXT_shader_viewport_index_layer = ext.contains("VK_EXT_shader_viewport_index_layer");
        VK_EXT_subgroup_size_control = ext.contains("VK_EXT_subgroup_size_control");
        VK_EXT_texel_buffer_alignment = ext.contains("VK_EXT_texel_buffer_alignment");
        VK_EXT_texture_compression_astc_hdr = ext.contains("VK_EXT_texture_compression_astc_hdr");
        VK_EXT_tooling_info = ext.contains("VK_EXT_tooling_info");
        VK_EXT_transform_feedback = check_EXT_transform_feedback(provider, caps, ext);
        VK_EXT_validation_cache = check_EXT_validation_cache(provider, caps, ext);
        VK_EXT_vertex_attribute_divisor = ext.contains("VK_EXT_vertex_attribute_divisor");
        VK_EXT_vertex_input_dynamic_state = check_EXT_vertex_input_dynamic_state(provider, caps, ext);
        VK_EXT_video_decode_h264 = ext.contains("VK_EXT_video_decode_h264");
        VK_EXT_video_decode_h265 = ext.contains("VK_EXT_video_decode_h265");
        VK_EXT_video_encode_h264 = ext.contains("VK_EXT_video_encode_h264");
        VK_EXT_ycbcr_2plane_444_formats = ext.contains("VK_EXT_ycbcr_2plane_444_formats");
        VK_EXT_ycbcr_image_arrays = ext.contains("VK_EXT_ycbcr_image_arrays");
        VK_GOOGLE_decorate_string = ext.contains("VK_GOOGLE_decorate_string");
        VK_GOOGLE_display_timing = check_GOOGLE_display_timing(provider, caps, ext);
        VK_GOOGLE_hlsl_functionality1 = ext.contains("VK_GOOGLE_hlsl_functionality1");
        VK_GOOGLE_user_type = ext.contains("VK_GOOGLE_user_type");
        VK_HUAWEI_invocation_mask = check_HUAWEI_invocation_mask(provider, caps, ext);
        VK_HUAWEI_subpass_shading = check_HUAWEI_subpass_shading(provider, caps, ext);
        VK_IMG_filter_cubic = ext.contains("VK_IMG_filter_cubic");
        VK_IMG_format_pvrtc = ext.contains("VK_IMG_format_pvrtc");
        VK_INTEL_performance_query = check_INTEL_performance_query(provider, caps, ext);
        VK_INTEL_shader_integer_functions2 = ext.contains("VK_INTEL_shader_integer_functions2");
        VK_KHR_16bit_storage = ext.contains("VK_KHR_16bit_storage");
        VK_KHR_8bit_storage = ext.contains("VK_KHR_8bit_storage");
        VK_KHR_acceleration_structure = check_KHR_acceleration_structure(provider, caps, ext);
        VK_KHR_bind_memory2 = check_KHR_bind_memory2(provider, caps, ext);
        VK_KHR_buffer_device_address = check_KHR_buffer_device_address(provider, caps, ext);
        VK_KHR_copy_commands2 = check_KHR_copy_commands2(provider, caps, ext);
        VK_KHR_create_renderpass2 = check_KHR_create_renderpass2(provider, caps, ext);
        VK_KHR_dedicated_allocation = ext.contains("VK_KHR_dedicated_allocation");
        VK_KHR_deferred_host_operations = check_KHR_deferred_host_operations(provider, caps, ext);
        VK_KHR_depth_stencil_resolve = ext.contains("VK_KHR_depth_stencil_resolve");
        VK_KHR_descriptor_update_template = check_KHR_descriptor_update_template(provider, caps, ext);
        VK_KHR_device_group = check_KHR_device_group(provider, caps, ext);
        VK_KHR_display_swapchain = check_KHR_display_swapchain(provider, caps, ext);
        VK_KHR_draw_indirect_count = check_KHR_draw_indirect_count(provider, caps, ext);
        VK_KHR_driver_properties = ext.contains("VK_KHR_driver_properties");
        VK_KHR_external_fence = ext.contains("VK_KHR_external_fence");
        VK_KHR_external_fence_fd = check_KHR_external_fence_fd(provider, caps, ext);
        VK_KHR_external_fence_win32 = check_KHR_external_fence_win32(provider, caps, ext);
        VK_KHR_external_memory = ext.contains("VK_KHR_external_memory");
        VK_KHR_external_memory_fd = check_KHR_external_memory_fd(provider, caps, ext);
        VK_KHR_external_memory_win32 = check_KHR_external_memory_win32(provider, caps, ext);
        VK_KHR_external_semaphore = ext.contains("VK_KHR_external_semaphore");
        VK_KHR_external_semaphore_fd = check_KHR_external_semaphore_fd(provider, caps, ext);
        VK_KHR_external_semaphore_win32 = check_KHR_external_semaphore_win32(provider, caps, ext);
        VK_KHR_fragment_shading_rate = check_KHR_fragment_shading_rate(provider, caps, ext);
        VK_KHR_get_memory_requirements2 = check_KHR_get_memory_requirements2(provider, caps, ext);
        VK_KHR_image_format_list = ext.contains("VK_KHR_image_format_list");
        VK_KHR_imageless_framebuffer = ext.contains("VK_KHR_imageless_framebuffer");
        VK_KHR_incremental_present = ext.contains("VK_KHR_incremental_present");
        VK_KHR_maintenance1 = check_KHR_maintenance1(provider, caps, ext);
        VK_KHR_maintenance2 = ext.contains("VK_KHR_maintenance2");
        VK_KHR_maintenance3 = check_KHR_maintenance3(provider, caps, ext);
        VK_KHR_multiview = ext.contains("VK_KHR_multiview");
        VK_KHR_performance_query = check_KHR_performance_query(provider, caps, ext);
        VK_KHR_pipeline_executable_properties = check_KHR_pipeline_executable_properties(provider, caps, ext);
        VK_KHR_pipeline_library = ext.contains("VK_KHR_pipeline_library");
        VK_KHR_portability_subset = ext.contains("VK_KHR_portability_subset");
        VK_KHR_present_id = ext.contains("VK_KHR_present_id");
        VK_KHR_present_wait = check_KHR_present_wait(provider, caps, ext);
        VK_KHR_push_descriptor = check_KHR_push_descriptor(provider, caps, ext);
        VK_KHR_ray_query = ext.contains("VK_KHR_ray_query");
        VK_KHR_ray_tracing_pipeline = check_KHR_ray_tracing_pipeline(provider, caps, ext);
        VK_KHR_relaxed_block_layout = ext.contains("VK_KHR_relaxed_block_layout");
        VK_KHR_sampler_mirror_clamp_to_edge = ext.contains("VK_KHR_sampler_mirror_clamp_to_edge");
        VK_KHR_sampler_ycbcr_conversion = check_KHR_sampler_ycbcr_conversion(provider, caps, ext);
        VK_KHR_separate_depth_stencil_layouts = ext.contains("VK_KHR_separate_depth_stencil_layouts");
        VK_KHR_shader_atomic_int64 = ext.contains("VK_KHR_shader_atomic_int64");
        VK_KHR_shader_clock = ext.contains("VK_KHR_shader_clock");
        VK_KHR_shader_draw_parameters = ext.contains("VK_KHR_shader_draw_parameters");
        VK_KHR_shader_float16_int8 = ext.contains("VK_KHR_shader_float16_int8");
        VK_KHR_shader_float_controls = ext.contains("VK_KHR_shader_float_controls");
        VK_KHR_shader_integer_dot_product = ext.contains("VK_KHR_shader_integer_dot_product");
        VK_KHR_shader_non_semantic_info = ext.contains("VK_KHR_shader_non_semantic_info");
        VK_KHR_shader_subgroup_extended_types = ext.contains("VK_KHR_shader_subgroup_extended_types");
        VK_KHR_shader_subgroup_uniform_control_flow = ext.contains("VK_KHR_shader_subgroup_uniform_control_flow");
        VK_KHR_shader_terminate_invocation = ext.contains("VK_KHR_shader_terminate_invocation");
        VK_KHR_shared_presentable_image = check_KHR_shared_presentable_image(provider, caps, ext);
        VK_KHR_spirv_1_4 = ext.contains("VK_KHR_spirv_1_4");
        VK_KHR_storage_buffer_storage_class = ext.contains("VK_KHR_storage_buffer_storage_class");
        VK_KHR_swapchain = check_KHR_swapchain(provider, caps, ext);
        VK_KHR_swapchain_mutable_format = ext.contains("VK_KHR_swapchain_mutable_format");
        VK_KHR_synchronization2 = check_KHR_synchronization2(provider, caps, ext);
        VK_KHR_timeline_semaphore = check_KHR_timeline_semaphore(provider, caps, ext);
        VK_KHR_uniform_buffer_standard_layout = ext.contains("VK_KHR_uniform_buffer_standard_layout");
        VK_KHR_variable_pointers = ext.contains("VK_KHR_variable_pointers");
        VK_KHR_video_decode_queue = check_KHR_video_decode_queue(provider, caps, ext);
        VK_KHR_video_encode_queue = check_KHR_video_encode_queue(provider, caps, ext);
        VK_KHR_video_queue = check_KHR_video_queue(provider, caps, ext);
        VK_KHR_vulkan_memory_model = ext.contains("VK_KHR_vulkan_memory_model");
        VK_KHR_win32_keyed_mutex = ext.contains("VK_KHR_win32_keyed_mutex");
        VK_KHR_workgroup_memory_explicit_layout = ext.contains("VK_KHR_workgroup_memory_explicit_layout");
        VK_KHR_zero_initialize_workgroup_memory = ext.contains("VK_KHR_zero_initialize_workgroup_memory");
        VK_NV_acquire_winrt_display = ext.contains("VK_NV_acquire_winrt_display");
        VK_NV_clip_space_w_scaling = check_NV_clip_space_w_scaling(provider, caps, ext);
        VK_NV_compute_shader_derivatives = ext.contains("VK_NV_compute_shader_derivatives");
        VK_NV_cooperative_matrix = ext.contains("VK_NV_cooperative_matrix");
        VK_NV_corner_sampled_image = ext.contains("VK_NV_corner_sampled_image");
        VK_NV_coverage_reduction_mode = ext.contains("VK_NV_coverage_reduction_mode");
        VK_NV_dedicated_allocation = ext.contains("VK_NV_dedicated_allocation");
        VK_NV_dedicated_allocation_image_aliasing = ext.contains("VK_NV_dedicated_allocation_image_aliasing");
        VK_NV_device_diagnostic_checkpoints = check_NV_device_diagnostic_checkpoints(provider, caps, ext);
        VK_NV_device_diagnostics_config = ext.contains("VK_NV_device_diagnostics_config");
        VK_NV_device_generated_commands = check_NV_device_generated_commands(provider, caps, ext);
        VK_NV_external_memory = ext.contains("VK_NV_external_memory");
        VK_NV_external_memory_rdma = check_NV_external_memory_rdma(provider, caps, ext);
        VK_NV_external_memory_win32 = check_NV_external_memory_win32(provider, caps, ext);
        VK_NV_fill_rectangle = ext.contains("VK_NV_fill_rectangle");
        VK_NV_fragment_coverage_to_color = ext.contains("VK_NV_fragment_coverage_to_color");
        VK_NV_fragment_shader_barycentric = ext.contains("VK_NV_fragment_shader_barycentric");
        VK_NV_fragment_shading_rate_enums = check_NV_fragment_shading_rate_enums(provider, caps, ext);
        VK_NV_framebuffer_mixed_samples = ext.contains("VK_NV_framebuffer_mixed_samples");
        VK_NV_geometry_shader_passthrough = ext.contains("VK_NV_geometry_shader_passthrough");
        VK_NV_glsl_shader = ext.contains("VK_NV_glsl_shader");
        VK_NV_inherited_viewport_scissor = ext.contains("VK_NV_inherited_viewport_scissor");
        VK_NV_mesh_shader = check_NV_mesh_shader(provider, caps, ext);
        VK_NV_ray_tracing = check_NV_ray_tracing(provider, caps, ext);
        VK_NV_ray_tracing_motion_blur = ext.contains("VK_NV_ray_tracing_motion_blur");
        VK_NV_representative_fragment_test = ext.contains("VK_NV_representative_fragment_test");
        VK_NV_sample_mask_override_coverage = ext.contains("VK_NV_sample_mask_override_coverage");
        VK_NV_scissor_exclusive = check_NV_scissor_exclusive(provider, caps, ext);
        VK_NV_shader_image_footprint = ext.contains("VK_NV_shader_image_footprint");
        VK_NV_shader_sm_builtins = ext.contains("VK_NV_shader_sm_builtins");
        VK_NV_shader_subgroup_partitioned = ext.contains("VK_NV_shader_subgroup_partitioned");
        VK_NV_shading_rate_image = check_NV_shading_rate_image(provider, caps, ext);
        VK_NV_viewport_array2 = ext.contains("VK_NV_viewport_array2");
        VK_NV_viewport_swizzle = ext.contains("VK_NV_viewport_swizzle");
        VK_NV_win32_keyed_mutex = ext.contains("VK_NV_win32_keyed_mutex");
        VK_NVX_binary_import = check_NVX_binary_import(provider, caps, ext);
        VK_NVX_image_view_handle = check_NVX_image_view_handle(provider, caps, ext);
        VK_NVX_multiview_per_view_attributes = ext.contains("VK_NVX_multiview_per_view_attributes");
        VK_QCOM_render_pass_shader_resolve = ext.contains("VK_QCOM_render_pass_shader_resolve");
        VK_QCOM_render_pass_store_ops = ext.contains("VK_QCOM_render_pass_store_ops");
        VK_QCOM_render_pass_transform = ext.contains("VK_QCOM_render_pass_transform");
        VK_QCOM_rotated_copy_commands = ext.contains("VK_QCOM_rotated_copy_commands");
        VK_STD_vulkan_video_codec_h264 = ext.contains("VK_STD_vulkan_video_codec_h264");
        VK_STD_vulkan_video_codec_h265 = ext.contains("VK_STD_vulkan_video_codec_h265");
        VK_VALVE_mutable_descriptor_type = ext.contains("VK_VALVE_mutable_descriptor_type");

        vkGetDeviceProcAddr = caps[0];
        vkDestroyDevice = caps[1];
        vkGetDeviceQueue = caps[2];
        vkQueueSubmit = caps[3];
        vkQueueWaitIdle = caps[4];
        vkDeviceWaitIdle = caps[5];
        vkAllocateMemory = caps[6];
        vkFreeMemory = caps[7];
        vkMapMemory = caps[8];
        vkUnmapMemory = caps[9];
        vkFlushMappedMemoryRanges = caps[10];
        vkInvalidateMappedMemoryRanges = caps[11];
        vkGetDeviceMemoryCommitment = caps[12];
        vkBindBufferMemory = caps[13];
        vkBindImageMemory = caps[14];
        vkGetBufferMemoryRequirements = caps[15];
        vkGetImageMemoryRequirements = caps[16];
        vkGetImageSparseMemoryRequirements = caps[17];
        vkQueueBindSparse = caps[18];
        vkCreateFence = caps[19];
        vkDestroyFence = caps[20];
        vkResetFences = caps[21];
        vkGetFenceStatus = caps[22];
        vkWaitForFences = caps[23];
        vkCreateSemaphore = caps[24];
        vkDestroySemaphore = caps[25];
        vkCreateEvent = caps[26];
        vkDestroyEvent = caps[27];
        vkGetEventStatus = caps[28];
        vkSetEvent = caps[29];
        vkResetEvent = caps[30];
        vkCreateQueryPool = caps[31];
        vkDestroyQueryPool = caps[32];
        vkGetQueryPoolResults = caps[33];
        vkCreateBuffer = caps[34];
        vkDestroyBuffer = caps[35];
        vkCreateBufferView = caps[36];
        vkDestroyBufferView = caps[37];
        vkCreateImage = caps[38];
        vkDestroyImage = caps[39];
        vkGetImageSubresourceLayout = caps[40];
        vkCreateImageView = caps[41];
        vkDestroyImageView = caps[42];
        vkCreateShaderModule = caps[43];
        vkDestroyShaderModule = caps[44];
        vkCreatePipelineCache = caps[45];
        vkDestroyPipelineCache = caps[46];
        vkGetPipelineCacheData = caps[47];
        vkMergePipelineCaches = caps[48];
        vkCreateGraphicsPipelines = caps[49];
        vkCreateComputePipelines = caps[50];
        vkDestroyPipeline = caps[51];
        vkCreatePipelineLayout = caps[52];
        vkDestroyPipelineLayout = caps[53];
        vkCreateSampler = caps[54];
        vkDestroySampler = caps[55];
        vkCreateDescriptorSetLayout = caps[56];
        vkDestroyDescriptorSetLayout = caps[57];
        vkCreateDescriptorPool = caps[58];
        vkDestroyDescriptorPool = caps[59];
        vkResetDescriptorPool = caps[60];
        vkAllocateDescriptorSets = caps[61];
        vkFreeDescriptorSets = caps[62];
        vkUpdateDescriptorSets = caps[63];
        vkCreateFramebuffer = caps[64];
        vkDestroyFramebuffer = caps[65];
        vkCreateRenderPass = caps[66];
        vkDestroyRenderPass = caps[67];
        vkGetRenderAreaGranularity = caps[68];
        vkCreateCommandPool = caps[69];
        vkDestroyCommandPool = caps[70];
        vkResetCommandPool = caps[71];
        vkAllocateCommandBuffers = caps[72];
        vkFreeCommandBuffers = caps[73];
        vkBeginCommandBuffer = caps[74];
        vkEndCommandBuffer = caps[75];
        vkResetCommandBuffer = caps[76];
        vkCmdBindPipeline = caps[77];
        vkCmdSetViewport = caps[78];
        vkCmdSetScissor = caps[79];
        vkCmdSetLineWidth = caps[80];
        vkCmdSetDepthBias = caps[81];
        vkCmdSetBlendConstants = caps[82];
        vkCmdSetDepthBounds = caps[83];
        vkCmdSetStencilCompareMask = caps[84];
        vkCmdSetStencilWriteMask = caps[85];
        vkCmdSetStencilReference = caps[86];
        vkCmdBindDescriptorSets = caps[87];
        vkCmdBindIndexBuffer = caps[88];
        vkCmdBindVertexBuffers = caps[89];
        vkCmdDraw = caps[90];
        vkCmdDrawIndexed = caps[91];
        vkCmdDrawIndirect = caps[92];
        vkCmdDrawIndexedIndirect = caps[93];
        vkCmdDispatch = caps[94];
        vkCmdDispatchIndirect = caps[95];
        vkCmdCopyBuffer = caps[96];
        vkCmdCopyImage = caps[97];
        vkCmdBlitImage = caps[98];
        vkCmdCopyBufferToImage = caps[99];
        vkCmdCopyImageToBuffer = caps[100];
        vkCmdUpdateBuffer = caps[101];
        vkCmdFillBuffer = caps[102];
        vkCmdClearColorImage = caps[103];
        vkCmdClearDepthStencilImage = caps[104];
        vkCmdClearAttachments = caps[105];
        vkCmdResolveImage = caps[106];
        vkCmdSetEvent = caps[107];
        vkCmdResetEvent = caps[108];
        vkCmdWaitEvents = caps[109];
        vkCmdPipelineBarrier = caps[110];
        vkCmdBeginQuery = caps[111];
        vkCmdEndQuery = caps[112];
        vkCmdResetQueryPool = caps[113];
        vkCmdWriteTimestamp = caps[114];
        vkCmdCopyQueryPoolResults = caps[115];
        vkCmdPushConstants = caps[116];
        vkCmdBeginRenderPass = caps[117];
        vkCmdNextSubpass = caps[118];
        vkCmdEndRenderPass = caps[119];
        vkCmdExecuteCommands = caps[120];
        vkBindBufferMemory2 = caps[121];
        vkBindImageMemory2 = caps[122];
        vkGetDeviceGroupPeerMemoryFeatures = caps[123];
        vkCmdSetDeviceMask = caps[124];
        vkCmdDispatchBase = caps[125];
        vkGetImageMemoryRequirements2 = caps[126];
        vkGetBufferMemoryRequirements2 = caps[127];
        vkGetImageSparseMemoryRequirements2 = caps[128];
        vkTrimCommandPool = caps[129];
        vkGetDeviceQueue2 = caps[130];
        vkCreateSamplerYcbcrConversion = caps[131];
        vkDestroySamplerYcbcrConversion = caps[132];
        vkCreateDescriptorUpdateTemplate = caps[133];
        vkDestroyDescriptorUpdateTemplate = caps[134];
        vkUpdateDescriptorSetWithTemplate = caps[135];
        vkGetDescriptorSetLayoutSupport = caps[136];
        vkCmdDrawIndirectCount = caps[137];
        vkCmdDrawIndexedIndirectCount = caps[138];
        vkCreateRenderPass2 = caps[139];
        vkCmdBeginRenderPass2 = caps[140];
        vkCmdNextSubpass2 = caps[141];
        vkCmdEndRenderPass2 = caps[142];
        vkResetQueryPool = caps[143];
        vkGetSemaphoreCounterValue = caps[144];
        vkWaitSemaphores = caps[145];
        vkSignalSemaphore = caps[146];
        vkGetBufferDeviceAddress = caps[147];
        vkGetBufferOpaqueCaptureAddress = caps[148];
        vkGetDeviceMemoryOpaqueCaptureAddress = caps[149];
        vkCmdWriteBufferMarkerAMD = caps[150];
        vkSetLocalDimmingAMD = caps[151];
        vkCmdDrawIndirectCountAMD = caps[152];
        vkCmdDrawIndexedIndirectCountAMD = caps[153];
        vkGetShaderInfoAMD = caps[154];
        vkGetBufferDeviceAddressEXT = caps[155];
        vkGetCalibratedTimestampsEXT = caps[156];
        vkCmdSetColorWriteEnableEXT = caps[157];
        vkCmdBeginConditionalRenderingEXT = caps[158];
        vkCmdEndConditionalRenderingEXT = caps[159];
        vkDebugMarkerSetObjectTagEXT = caps[160];
        vkDebugMarkerSetObjectNameEXT = caps[161];
        vkCmdDebugMarkerBeginEXT = caps[162];
        vkCmdDebugMarkerEndEXT = caps[163];
        vkCmdDebugMarkerInsertEXT = caps[164];
        vkSetDebugUtilsObjectNameEXT = caps[165];
        vkSetDebugUtilsObjectTagEXT = caps[166];
        vkQueueBeginDebugUtilsLabelEXT = caps[167];
        vkQueueEndDebugUtilsLabelEXT = caps[168];
        vkQueueInsertDebugUtilsLabelEXT = caps[169];
        vkCmdBeginDebugUtilsLabelEXT = caps[170];
        vkCmdEndDebugUtilsLabelEXT = caps[171];
        vkCmdInsertDebugUtilsLabelEXT = caps[172];
        vkCmdSetDiscardRectangleEXT = caps[173];
        vkDisplayPowerControlEXT = caps[174];
        vkRegisterDeviceEventEXT = caps[175];
        vkRegisterDisplayEventEXT = caps[176];
        vkGetSwapchainCounterEXT = caps[177];
        vkCmdSetCullModeEXT = caps[178];
        vkCmdSetFrontFaceEXT = caps[179];
        vkCmdSetPrimitiveTopologyEXT = caps[180];
        vkCmdSetViewportWithCountEXT = caps[181];
        vkCmdSetScissorWithCountEXT = caps[182];
        vkCmdBindVertexBuffers2EXT = caps[183];
        vkCmdSetDepthTestEnableEXT = caps[184];
        vkCmdSetDepthWriteEnableEXT = caps[185];
        vkCmdSetDepthCompareOpEXT = caps[186];
        vkCmdSetDepthBoundsTestEnableEXT = caps[187];
        vkCmdSetStencilTestEnableEXT = caps[188];
        vkCmdSetStencilOpEXT = caps[189];
        vkCmdSetPatchControlPointsEXT = caps[190];
        vkCmdSetRasterizerDiscardEnableEXT = caps[191];
        vkCmdSetDepthBiasEnableEXT = caps[192];
        vkCmdSetLogicOpEXT = caps[193];
        vkCmdSetPrimitiveRestartEnableEXT = caps[194];
        vkGetMemoryHostPointerPropertiesEXT = caps[195];
        vkAcquireFullScreenExclusiveModeEXT = caps[196];
        vkReleaseFullScreenExclusiveModeEXT = caps[197];
        vkGetDeviceGroupSurfacePresentModes2EXT = caps[198];
        vkSetHdrMetadataEXT = caps[199];
        vkResetQueryPoolEXT = caps[200];
        vkGetImageDrmFormatModifierPropertiesEXT = caps[201];
        vkCmdSetLineStippleEXT = caps[202];
        vkCmdDrawMultiEXT = caps[203];
        vkCmdDrawMultiIndexedEXT = caps[204];
        vkCreatePrivateDataSlotEXT = caps[205];
        vkDestroyPrivateDataSlotEXT = caps[206];
        vkSetPrivateDataEXT = caps[207];
        vkGetPrivateDataEXT = caps[208];
        vkCmdSetSampleLocationsEXT = caps[209];
        vkCmdBindTransformFeedbackBuffersEXT = caps[210];
        vkCmdBeginTransformFeedbackEXT = caps[211];
        vkCmdEndTransformFeedbackEXT = caps[212];
        vkCmdBeginQueryIndexedEXT = caps[213];
        vkCmdEndQueryIndexedEXT = caps[214];
        vkCmdDrawIndirectByteCountEXT = caps[215];
        vkCreateValidationCacheEXT = caps[216];
        vkDestroyValidationCacheEXT = caps[217];
        vkMergeValidationCachesEXT = caps[218];
        vkGetValidationCacheDataEXT = caps[219];
        vkCmdSetVertexInputEXT = caps[220];
        vkGetRefreshCycleDurationGOOGLE = caps[221];
        vkGetPastPresentationTimingGOOGLE = caps[222];
        vkCmdBindInvocationMaskHUAWEI = caps[223];
        vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = caps[224];
        vkCmdSubpassShadingHUAWEI = caps[225];
        vkInitializePerformanceApiINTEL = caps[226];
        vkUninitializePerformanceApiINTEL = caps[227];
        vkCmdSetPerformanceMarkerINTEL = caps[228];
        vkCmdSetPerformanceStreamMarkerINTEL = caps[229];
        vkCmdSetPerformanceOverrideINTEL = caps[230];
        vkAcquirePerformanceConfigurationINTEL = caps[231];
        vkReleasePerformanceConfigurationINTEL = caps[232];
        vkQueueSetPerformanceConfigurationINTEL = caps[233];
        vkGetPerformanceParameterINTEL = caps[234];
        vkCreateAccelerationStructureKHR = caps[235];
        vkDestroyAccelerationStructureKHR = caps[236];
        vkCmdBuildAccelerationStructuresKHR = caps[237];
        vkCmdBuildAccelerationStructuresIndirectKHR = caps[238];
        vkBuildAccelerationStructuresKHR = caps[239];
        vkCopyAccelerationStructureKHR = caps[240];
        vkCopyAccelerationStructureToMemoryKHR = caps[241];
        vkCopyMemoryToAccelerationStructureKHR = caps[242];
        vkWriteAccelerationStructuresPropertiesKHR = caps[243];
        vkCmdCopyAccelerationStructureKHR = caps[244];
        vkCmdCopyAccelerationStructureToMemoryKHR = caps[245];
        vkCmdCopyMemoryToAccelerationStructureKHR = caps[246];
        vkGetAccelerationStructureDeviceAddressKHR = caps[247];
        vkCmdWriteAccelerationStructuresPropertiesKHR = caps[248];
        vkGetDeviceAccelerationStructureCompatibilityKHR = caps[249];
        vkGetAccelerationStructureBuildSizesKHR = caps[250];
        vkBindBufferMemory2KHR = caps[251];
        vkBindImageMemory2KHR = caps[252];
        vkGetBufferDeviceAddressKHR = caps[253];
        vkGetBufferOpaqueCaptureAddressKHR = caps[254];
        vkGetDeviceMemoryOpaqueCaptureAddressKHR = caps[255];
        vkCmdCopyBuffer2KHR = caps[256];
        vkCmdCopyImage2KHR = caps[257];
        vkCmdCopyBufferToImage2KHR = caps[258];
        vkCmdCopyImageToBuffer2KHR = caps[259];
        vkCmdBlitImage2KHR = caps[260];
        vkCmdResolveImage2KHR = caps[261];
        vkCreateRenderPass2KHR = caps[262];
        vkCmdBeginRenderPass2KHR = caps[263];
        vkCmdNextSubpass2KHR = caps[264];
        vkCmdEndRenderPass2KHR = caps[265];
        vkCreateDeferredOperationKHR = caps[266];
        vkDestroyDeferredOperationKHR = caps[267];
        vkGetDeferredOperationMaxConcurrencyKHR = caps[268];
        vkGetDeferredOperationResultKHR = caps[269];
        vkDeferredOperationJoinKHR = caps[270];
        vkCreateDescriptorUpdateTemplateKHR = caps[271];
        vkDestroyDescriptorUpdateTemplateKHR = caps[272];
        vkUpdateDescriptorSetWithTemplateKHR = caps[273];
        vkCmdPushDescriptorSetWithTemplateKHR = caps[274];
        vkGetDeviceGroupPeerMemoryFeaturesKHR = caps[275];
        vkCmdSetDeviceMaskKHR = caps[276];
        vkCmdDispatchBaseKHR = caps[277];
        vkGetDeviceGroupPresentCapabilitiesKHR = caps[278];
        vkGetDeviceGroupSurfacePresentModesKHR = caps[279];
        vkAcquireNextImage2KHR = caps[280];
        vkCreateSharedSwapchainsKHR = caps[281];
        vkCmdDrawIndirectCountKHR = caps[282];
        vkCmdDrawIndexedIndirectCountKHR = caps[283];
        vkImportFenceFdKHR = caps[284];
        vkGetFenceFdKHR = caps[285];
        vkImportFenceWin32HandleKHR = caps[286];
        vkGetFenceWin32HandleKHR = caps[287];
        vkGetMemoryFdKHR = caps[288];
        vkGetMemoryFdPropertiesKHR = caps[289];
        vkGetMemoryWin32HandleKHR = caps[290];
        vkGetMemoryWin32HandlePropertiesKHR = caps[291];
        vkImportSemaphoreFdKHR = caps[292];
        vkGetSemaphoreFdKHR = caps[293];
        vkImportSemaphoreWin32HandleKHR = caps[294];
        vkGetSemaphoreWin32HandleKHR = caps[295];
        vkCmdSetFragmentShadingRateKHR = caps[296];
        vkGetImageMemoryRequirements2KHR = caps[297];
        vkGetBufferMemoryRequirements2KHR = caps[298];
        vkGetImageSparseMemoryRequirements2KHR = caps[299];
        vkTrimCommandPoolKHR = caps[300];
        vkGetDescriptorSetLayoutSupportKHR = caps[301];
        vkAcquireProfilingLockKHR = caps[302];
        vkReleaseProfilingLockKHR = caps[303];
        vkGetPipelineExecutablePropertiesKHR = caps[304];
        vkGetPipelineExecutableStatisticsKHR = caps[305];
        vkGetPipelineExecutableInternalRepresentationsKHR = caps[306];
        vkWaitForPresentKHR = caps[307];
        vkCmdPushDescriptorSetKHR = caps[308];
        vkCmdTraceRaysKHR = caps[309];
        vkCreateRayTracingPipelinesKHR = caps[310];
        vkGetRayTracingShaderGroupHandlesKHR = caps[311];
        vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = caps[312];
        vkCmdTraceRaysIndirectKHR = caps[313];
        vkGetRayTracingShaderGroupStackSizeKHR = caps[314];
        vkCmdSetRayTracingPipelineStackSizeKHR = caps[315];
        vkCreateSamplerYcbcrConversionKHR = caps[316];
        vkDestroySamplerYcbcrConversionKHR = caps[317];
        vkGetSwapchainStatusKHR = caps[318];
        vkCreateSwapchainKHR = caps[319];
        vkDestroySwapchainKHR = caps[320];
        vkGetSwapchainImagesKHR = caps[321];
        vkAcquireNextImageKHR = caps[322];
        vkQueuePresentKHR = caps[323];
        vkCmdSetEvent2KHR = caps[324];
        vkCmdResetEvent2KHR = caps[325];
        vkCmdWaitEvents2KHR = caps[326];
        vkCmdPipelineBarrier2KHR = caps[327];
        vkCmdWriteTimestamp2KHR = caps[328];
        vkQueueSubmit2KHR = caps[329];
        vkCmdWriteBufferMarker2AMD = caps[330];
        vkGetQueueCheckpointData2NV = caps[331];
        vkGetSemaphoreCounterValueKHR = caps[332];
        vkWaitSemaphoresKHR = caps[333];
        vkSignalSemaphoreKHR = caps[334];
        vkCmdDecodeVideoKHR = caps[335];
        vkCmdEncodeVideoKHR = caps[336];
        vkCreateVideoSessionKHR = caps[337];
        vkDestroyVideoSessionKHR = caps[338];
        vkGetVideoSessionMemoryRequirementsKHR = caps[339];
        vkBindVideoSessionMemoryKHR = caps[340];
        vkCreateVideoSessionParametersKHR = caps[341];
        vkUpdateVideoSessionParametersKHR = caps[342];
        vkDestroyVideoSessionParametersKHR = caps[343];
        vkCmdBeginVideoCodingKHR = caps[344];
        vkCmdEndVideoCodingKHR = caps[345];
        vkCmdControlVideoCodingKHR = caps[346];
        vkCmdSetViewportWScalingNV = caps[347];
        vkCmdSetCheckpointNV = caps[348];
        vkGetQueueCheckpointDataNV = caps[349];
        vkGetGeneratedCommandsMemoryRequirementsNV = caps[350];
        vkCmdPreprocessGeneratedCommandsNV = caps[351];
        vkCmdExecuteGeneratedCommandsNV = caps[352];
        vkCmdBindPipelineShaderGroupNV = caps[353];
        vkCreateIndirectCommandsLayoutNV = caps[354];
        vkDestroyIndirectCommandsLayoutNV = caps[355];
        vkGetMemoryRemoteAddressNV = caps[356];
        vkGetMemoryWin32HandleNV = caps[357];
        vkCmdSetFragmentShadingRateEnumNV = caps[358];
        vkCmdDrawMeshTasksNV = caps[359];
        vkCmdDrawMeshTasksIndirectNV = caps[360];
        vkCmdDrawMeshTasksIndirectCountNV = caps[361];
        vkCreateAccelerationStructureNV = caps[362];
        vkDestroyAccelerationStructureNV = caps[363];
        vkGetAccelerationStructureMemoryRequirementsNV = caps[364];
        vkBindAccelerationStructureMemoryNV = caps[365];
        vkCmdBuildAccelerationStructureNV = caps[366];
        vkCmdCopyAccelerationStructureNV = caps[367];
        vkCmdTraceRaysNV = caps[368];
        vkCreateRayTracingPipelinesNV = caps[369];
        vkGetRayTracingShaderGroupHandlesNV = caps[370];
        vkGetAccelerationStructureHandleNV = caps[371];
        vkCmdWriteAccelerationStructuresPropertiesNV = caps[372];
        vkCompileDeferredNV = caps[373];
        vkCmdSetExclusiveScissorNV = caps[374];
        vkCmdBindShadingRateImageNV = caps[375];
        vkCmdSetViewportShadingRatePaletteNV = caps[376];
        vkCmdSetCoarseSampleOrderNV = caps[377];
        vkCreateCuModuleNVX = caps[378];
        vkCreateCuFunctionNVX = caps[379];
        vkDestroyCuModuleNVX = caps[380];
        vkDestroyCuFunctionNVX = caps[381];
        vkCmdCuLaunchKernelNVX = caps[382];
        vkGetImageViewHandleNVX = caps[383];
        vkGetImageViewAddressNVX = caps[384];
    }

    private static boolean check_VK10(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan10")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
            39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 
            76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 
            110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120
        },
            "vkGetDeviceProcAddr", "vkDestroyDevice", "vkGetDeviceQueue", "vkQueueSubmit", "vkQueueWaitIdle", "vkDeviceWaitIdle", "vkAllocateMemory", 
            "vkFreeMemory", "vkMapMemory", "vkUnmapMemory", "vkFlushMappedMemoryRanges", "vkInvalidateMappedMemoryRanges", "vkGetDeviceMemoryCommitment", 
            "vkBindBufferMemory", "vkBindImageMemory", "vkGetBufferMemoryRequirements", "vkGetImageMemoryRequirements", "vkGetImageSparseMemoryRequirements", 
            "vkQueueBindSparse", "vkCreateFence", "vkDestroyFence", "vkResetFences", "vkGetFenceStatus", "vkWaitForFences", "vkCreateSemaphore", 
            "vkDestroySemaphore", "vkCreateEvent", "vkDestroyEvent", "vkGetEventStatus", "vkSetEvent", "vkResetEvent", "vkCreateQueryPool", 
            "vkDestroyQueryPool", "vkGetQueryPoolResults", "vkCreateBuffer", "vkDestroyBuffer", "vkCreateBufferView", "vkDestroyBufferView", "vkCreateImage", 
            "vkDestroyImage", "vkGetImageSubresourceLayout", "vkCreateImageView", "vkDestroyImageView", "vkCreateShaderModule", "vkDestroyShaderModule", 
            "vkCreatePipelineCache", "vkDestroyPipelineCache", "vkGetPipelineCacheData", "vkMergePipelineCaches", "vkCreateGraphicsPipelines", 
            "vkCreateComputePipelines", "vkDestroyPipeline", "vkCreatePipelineLayout", "vkDestroyPipelineLayout", "vkCreateSampler", "vkDestroySampler", 
            "vkCreateDescriptorSetLayout", "vkDestroyDescriptorSetLayout", "vkCreateDescriptorPool", "vkDestroyDescriptorPool", "vkResetDescriptorPool", 
            "vkAllocateDescriptorSets", "vkFreeDescriptorSets", "vkUpdateDescriptorSets", "vkCreateFramebuffer", "vkDestroyFramebuffer", "vkCreateRenderPass", 
            "vkDestroyRenderPass", "vkGetRenderAreaGranularity", "vkCreateCommandPool", "vkDestroyCommandPool", "vkResetCommandPool", 
            "vkAllocateCommandBuffers", "vkFreeCommandBuffers", "vkBeginCommandBuffer", "vkEndCommandBuffer", "vkResetCommandBuffer", "vkCmdBindPipeline", 
            "vkCmdSetViewport", "vkCmdSetScissor", "vkCmdSetLineWidth", "vkCmdSetDepthBias", "vkCmdSetBlendConstants", "vkCmdSetDepthBounds", 
            "vkCmdSetStencilCompareMask", "vkCmdSetStencilWriteMask", "vkCmdSetStencilReference", "vkCmdBindDescriptorSets", "vkCmdBindIndexBuffer", 
            "vkCmdBindVertexBuffers", "vkCmdDraw", "vkCmdDrawIndexed", "vkCmdDrawIndirect", "vkCmdDrawIndexedIndirect", "vkCmdDispatch", 
            "vkCmdDispatchIndirect", "vkCmdCopyBuffer", "vkCmdCopyImage", "vkCmdBlitImage", "vkCmdCopyBufferToImage", "vkCmdCopyImageToBuffer", 
            "vkCmdUpdateBuffer", "vkCmdFillBuffer", "vkCmdClearColorImage", "vkCmdClearDepthStencilImage", "vkCmdClearAttachments", "vkCmdResolveImage", 
            "vkCmdSetEvent", "vkCmdResetEvent", "vkCmdWaitEvents", "vkCmdPipelineBarrier", "vkCmdBeginQuery", "vkCmdEndQuery", "vkCmdResetQueryPool", 
            "vkCmdWriteTimestamp", "vkCmdCopyQueryPoolResults", "vkCmdPushConstants", "vkCmdBeginRenderPass", "vkCmdNextSubpass", "vkCmdEndRenderPass", 
            "vkCmdExecuteCommands"
        ) || reportMissing("VK", "Vulkan10");
    }

    private static boolean check_VK11(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan11")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136
        },
            "vkBindBufferMemory2", "vkBindImageMemory2", "vkGetDeviceGroupPeerMemoryFeatures", "vkCmdSetDeviceMask", "vkCmdDispatchBase", 
            "vkGetImageMemoryRequirements2", "vkGetBufferMemoryRequirements2", "vkGetImageSparseMemoryRequirements2", "vkTrimCommandPool", "vkGetDeviceQueue2", 
            "vkCreateSamplerYcbcrConversion", "vkDestroySamplerYcbcrConversion", "vkCreateDescriptorUpdateTemplate", "vkDestroyDescriptorUpdateTemplate", 
            "vkUpdateDescriptorSetWithTemplate", "vkGetDescriptorSetLayoutSupport"
        ) || reportMissing("VK", "Vulkan11");
    }

    private static boolean check_VK12(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan12")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149
        },
            "vkCmdDrawIndirectCount", "vkCmdDrawIndexedIndirectCount", "vkCreateRenderPass2", "vkCmdBeginRenderPass2", "vkCmdNextSubpass2", 
            "vkCmdEndRenderPass2", "vkResetQueryPool", "vkGetSemaphoreCounterValue", "vkWaitSemaphores", "vkSignalSemaphore", "vkGetBufferDeviceAddress", 
            "vkGetBufferOpaqueCaptureAddress", "vkGetDeviceMemoryOpaqueCaptureAddress"
        ) || reportMissing("VK", "Vulkan12");
    }

    private static boolean check_AMD_buffer_marker(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_buffer_marker")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            150
        },
            "vkCmdWriteBufferMarkerAMD"
        ) || reportMissing("VK", "VK_AMD_buffer_marker");
    }

    private static boolean check_AMD_display_native_hdr(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_display_native_hdr")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            151
        },
            "vkSetLocalDimmingAMD"
        ) || reportMissing("VK", "VK_AMD_display_native_hdr");
    }

    private static boolean check_AMD_draw_indirect_count(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_draw_indirect_count")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            152, 153
        },
            "vkCmdDrawIndirectCountAMD", "vkCmdDrawIndexedIndirectCountAMD"
        ) || reportMissing("VK", "VK_AMD_draw_indirect_count");
    }

    private static boolean check_AMD_shader_info(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_shader_info")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            154
        },
            "vkGetShaderInfoAMD"
        ) || reportMissing("VK", "VK_AMD_shader_info");
    }

    private static boolean check_EXT_buffer_device_address(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_buffer_device_address")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            155
        },
            "vkGetBufferDeviceAddressEXT"
        ) || reportMissing("VK", "VK_EXT_buffer_device_address");
    }

    private static boolean check_EXT_calibrated_timestamps(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_calibrated_timestamps")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            156
        },
            "vkGetCalibratedTimestampsEXT"
        ) || reportMissing("VK", "VK_EXT_calibrated_timestamps");
    }

    private static boolean check_EXT_color_write_enable(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_color_write_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            157
        },
            "vkCmdSetColorWriteEnableEXT"
        ) || reportMissing("VK", "VK_EXT_color_write_enable");
    }

    private static boolean check_EXT_conditional_rendering(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_conditional_rendering")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            158, 159
        },
            "vkCmdBeginConditionalRenderingEXT", "vkCmdEndConditionalRenderingEXT"
        ) || reportMissing("VK", "VK_EXT_conditional_rendering");
    }

    private static boolean check_EXT_debug_marker(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_debug_marker")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            160, 161, 162, 163, 164
        },
            "vkDebugMarkerSetObjectTagEXT", "vkDebugMarkerSetObjectNameEXT", "vkCmdDebugMarkerBeginEXT", "vkCmdDebugMarkerEndEXT", "vkCmdDebugMarkerInsertEXT"
        ) || reportMissing("VK", "VK_EXT_debug_marker");
    }

    private static boolean check_EXT_debug_utils(FunctionProvider provider, long[] caps, VKCapabilitiesInstance capsInstance) {
        if (!capsInstance.VK_EXT_debug_utils) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            165, 166, 167, 168, 169, 170, 171, 172
        },
            "vkSetDebugUtilsObjectNameEXT", "vkSetDebugUtilsObjectTagEXT", "vkQueueBeginDebugUtilsLabelEXT", "vkQueueEndDebugUtilsLabelEXT", 
            "vkQueueInsertDebugUtilsLabelEXT", "vkCmdBeginDebugUtilsLabelEXT", "vkCmdEndDebugUtilsLabelEXT", "vkCmdInsertDebugUtilsLabelEXT"
        ) || reportMissing("VK", "VK_EXT_debug_utils");
    }

    private static boolean check_EXT_discard_rectangles(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_discard_rectangles")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            173
        },
            "vkCmdSetDiscardRectangleEXT"
        ) || reportMissing("VK", "VK_EXT_discard_rectangles");
    }

    private static boolean check_EXT_display_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_display_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            174, 175, 176, 177
        },
            "vkDisplayPowerControlEXT", "vkRegisterDeviceEventEXT", "vkRegisterDisplayEventEXT", "vkGetSwapchainCounterEXT"
        ) || reportMissing("VK", "VK_EXT_display_control");
    }

    private static boolean check_EXT_extended_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_extended_dynamic_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189
        },
            "vkCmdSetCullModeEXT", "vkCmdSetFrontFaceEXT", "vkCmdSetPrimitiveTopologyEXT", "vkCmdSetViewportWithCountEXT", "vkCmdSetScissorWithCountEXT", 
            "vkCmdBindVertexBuffers2EXT", "vkCmdSetDepthTestEnableEXT", "vkCmdSetDepthWriteEnableEXT", "vkCmdSetDepthCompareOpEXT", 
            "vkCmdSetDepthBoundsTestEnableEXT", "vkCmdSetStencilTestEnableEXT", "vkCmdSetStencilOpEXT"
        ) || reportMissing("VK", "VK_EXT_extended_dynamic_state");
    }

    private static boolean check_EXT_extended_dynamic_state2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_extended_dynamic_state2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            190, 191, 192, 193, 194
        },
            "vkCmdSetPatchControlPointsEXT", "vkCmdSetRasterizerDiscardEnableEXT", "vkCmdSetDepthBiasEnableEXT", "vkCmdSetLogicOpEXT", 
            "vkCmdSetPrimitiveRestartEnableEXT"
        ) || reportMissing("VK", "VK_EXT_extended_dynamic_state2");
    }

    private static boolean check_EXT_external_memory_host(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_external_memory_host")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            195
        },
            "vkGetMemoryHostPointerPropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_external_memory_host");
    }

    private static boolean check_EXT_full_screen_exclusive(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_full_screen_exclusive")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_device_group") || ext.contains("Vulkan11") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            196, 197, flag0 + 198
        },
            "vkAcquireFullScreenExclusiveModeEXT", "vkReleaseFullScreenExclusiveModeEXT", "vkGetDeviceGroupSurfacePresentModes2EXT"
        ) || reportMissing("VK", "VK_EXT_full_screen_exclusive");
    }

    private static boolean check_EXT_hdr_metadata(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_hdr_metadata")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            199
        },
            "vkSetHdrMetadataEXT"
        ) || reportMissing("VK", "VK_EXT_hdr_metadata");
    }

    private static boolean check_EXT_host_query_reset(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_host_query_reset")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            200
        },
            "vkResetQueryPoolEXT"
        ) || reportMissing("VK", "VK_EXT_host_query_reset");
    }

    private static boolean check_EXT_image_drm_format_modifier(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_image_drm_format_modifier")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            201
        },
            "vkGetImageDrmFormatModifierPropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_image_drm_format_modifier");
    }

    private static boolean check_EXT_line_rasterization(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_line_rasterization")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            202
        },
            "vkCmdSetLineStippleEXT"
        ) || reportMissing("VK", "VK_EXT_line_rasterization");
    }

    private static boolean check_EXT_multi_draw(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_multi_draw")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            203, 204
        },
            "vkCmdDrawMultiEXT", "vkCmdDrawMultiIndexedEXT"
        ) || reportMissing("VK", "VK_EXT_multi_draw");
    }

    private static boolean check_EXT_private_data(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_private_data")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            205, 206, 207, 208
        },
            "vkCreatePrivateDataSlotEXT", "vkDestroyPrivateDataSlotEXT", "vkSetPrivateDataEXT", "vkGetPrivateDataEXT"
        ) || reportMissing("VK", "VK_EXT_private_data");
    }

    private static boolean check_EXT_sample_locations(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_sample_locations")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            209
        },
            "vkCmdSetSampleLocationsEXT"
        ) || reportMissing("VK", "VK_EXT_sample_locations");
    }

    private static boolean check_EXT_transform_feedback(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_transform_feedback")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            210, 211, 212, 213, 214, 215
        },
            "vkCmdBindTransformFeedbackBuffersEXT", "vkCmdBeginTransformFeedbackEXT", "vkCmdEndTransformFeedbackEXT", "vkCmdBeginQueryIndexedEXT", 
            "vkCmdEndQueryIndexedEXT", "vkCmdDrawIndirectByteCountEXT"
        ) || reportMissing("VK", "VK_EXT_transform_feedback");
    }

    private static boolean check_EXT_validation_cache(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_validation_cache")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            216, 217, 218, 219
        },
            "vkCreateValidationCacheEXT", "vkDestroyValidationCacheEXT", "vkMergeValidationCachesEXT", "vkGetValidationCacheDataEXT"
        ) || reportMissing("VK", "VK_EXT_validation_cache");
    }

    private static boolean check_EXT_vertex_input_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_vertex_input_dynamic_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            220
        },
            "vkCmdSetVertexInputEXT"
        ) || reportMissing("VK", "VK_EXT_vertex_input_dynamic_state");
    }

    private static boolean check_GOOGLE_display_timing(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_GOOGLE_display_timing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            221, 222
        },
            "vkGetRefreshCycleDurationGOOGLE", "vkGetPastPresentationTimingGOOGLE"
        ) || reportMissing("VK", "VK_GOOGLE_display_timing");
    }

    private static boolean check_HUAWEI_invocation_mask(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_HUAWEI_invocation_mask")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            223
        },
            "vkCmdBindInvocationMaskHUAWEI"
        ) || reportMissing("VK", "VK_HUAWEI_invocation_mask");
    }

    private static boolean check_HUAWEI_subpass_shading(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_HUAWEI_subpass_shading")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            224, 225
        },
            "vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI", "vkCmdSubpassShadingHUAWEI"
        ) || reportMissing("VK", "VK_HUAWEI_subpass_shading");
    }

    private static boolean check_INTEL_performance_query(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_INTEL_performance_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            226, 227, 228, 229, 230, 231, 232, 233, 234
        },
            "vkInitializePerformanceApiINTEL", "vkUninitializePerformanceApiINTEL", "vkCmdSetPerformanceMarkerINTEL", "vkCmdSetPerformanceStreamMarkerINTEL", 
            "vkCmdSetPerformanceOverrideINTEL", "vkAcquirePerformanceConfigurationINTEL", "vkReleasePerformanceConfigurationINTEL", 
            "vkQueueSetPerformanceConfigurationINTEL", "vkGetPerformanceParameterINTEL"
        ) || reportMissing("VK", "VK_INTEL_performance_query");
    }

    private static boolean check_KHR_acceleration_structure(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_acceleration_structure")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250
        },
            "vkCreateAccelerationStructureKHR", "vkDestroyAccelerationStructureKHR", "vkCmdBuildAccelerationStructuresKHR", 
            "vkCmdBuildAccelerationStructuresIndirectKHR", "vkBuildAccelerationStructuresKHR", "vkCopyAccelerationStructureKHR", 
            "vkCopyAccelerationStructureToMemoryKHR", "vkCopyMemoryToAccelerationStructureKHR", "vkWriteAccelerationStructuresPropertiesKHR", 
            "vkCmdCopyAccelerationStructureKHR", "vkCmdCopyAccelerationStructureToMemoryKHR", "vkCmdCopyMemoryToAccelerationStructureKHR", 
            "vkGetAccelerationStructureDeviceAddressKHR", "vkCmdWriteAccelerationStructuresPropertiesKHR", "vkGetDeviceAccelerationStructureCompatibilityKHR", 
            "vkGetAccelerationStructureBuildSizesKHR"
        ) || reportMissing("VK", "VK_KHR_acceleration_structure");
    }

    private static boolean check_KHR_bind_memory2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_bind_memory2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            251, 252
        },
            "vkBindBufferMemory2KHR", "vkBindImageMemory2KHR"
        ) || reportMissing("VK", "VK_KHR_bind_memory2");
    }

    private static boolean check_KHR_buffer_device_address(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_buffer_device_address")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            253, 254, 255
        },
            "vkGetBufferDeviceAddressKHR", "vkGetBufferOpaqueCaptureAddressKHR", "vkGetDeviceMemoryOpaqueCaptureAddressKHR"
        ) || reportMissing("VK", "VK_KHR_buffer_device_address");
    }

    private static boolean check_KHR_copy_commands2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_copy_commands2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            256, 257, 258, 259, 260, 261
        },
            "vkCmdCopyBuffer2KHR", "vkCmdCopyImage2KHR", "vkCmdCopyBufferToImage2KHR", "vkCmdCopyImageToBuffer2KHR", "vkCmdBlitImage2KHR", 
            "vkCmdResolveImage2KHR"
        ) || reportMissing("VK", "VK_KHR_copy_commands2");
    }

    private static boolean check_KHR_create_renderpass2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_create_renderpass2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            262, 263, 264, 265
        },
            "vkCreateRenderPass2KHR", "vkCmdBeginRenderPass2KHR", "vkCmdNextSubpass2KHR", "vkCmdEndRenderPass2KHR"
        ) || reportMissing("VK", "VK_KHR_create_renderpass2");
    }

    private static boolean check_KHR_deferred_host_operations(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_deferred_host_operations")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            266, 267, 268, 269, 270
        },
            "vkCreateDeferredOperationKHR", "vkDestroyDeferredOperationKHR", "vkGetDeferredOperationMaxConcurrencyKHR", "vkGetDeferredOperationResultKHR", 
            "vkDeferredOperationJoinKHR"
        ) || reportMissing("VK", "VK_KHR_deferred_host_operations");
    }

    private static boolean check_KHR_descriptor_update_template(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_descriptor_update_template")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_push_descriptor") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            271, 272, 273, flag0 + 274
        },
            "vkCreateDescriptorUpdateTemplateKHR", "vkDestroyDescriptorUpdateTemplateKHR", "vkUpdateDescriptorSetWithTemplateKHR", 
            "vkCmdPushDescriptorSetWithTemplateKHR"
        ) || reportMissing("VK", "VK_KHR_descriptor_update_template");
    }

    private static boolean check_KHR_device_group(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_device_group")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_surface") ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains("VK_KHR_swapchain") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            275, 276, 277, flag0 + 278, flag0 + 279, flag2 + 280
        },
            "vkGetDeviceGroupPeerMemoryFeaturesKHR", "vkCmdSetDeviceMaskKHR", "vkCmdDispatchBaseKHR", "vkGetDeviceGroupPresentCapabilitiesKHR", 
            "vkGetDeviceGroupSurfacePresentModesKHR", "vkAcquireNextImage2KHR"
        ) || reportMissing("VK", "VK_KHR_device_group");
    }

    private static boolean check_KHR_display_swapchain(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_display_swapchain")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            281
        },
            "vkCreateSharedSwapchainsKHR"
        ) || reportMissing("VK", "VK_KHR_display_swapchain");
    }

    private static boolean check_KHR_draw_indirect_count(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_draw_indirect_count")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            282, 283
        },
            "vkCmdDrawIndirectCountKHR", "vkCmdDrawIndexedIndirectCountKHR"
        ) || reportMissing("VK", "VK_KHR_draw_indirect_count");
    }

    private static boolean check_KHR_external_fence_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_fence_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            284, 285
        },
            "vkImportFenceFdKHR", "vkGetFenceFdKHR"
        ) || reportMissing("VK", "VK_KHR_external_fence_fd");
    }

    private static boolean check_KHR_external_fence_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_fence_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            286, 287
        },
            "vkImportFenceWin32HandleKHR", "vkGetFenceWin32HandleKHR"
        ) || reportMissing("VK", "VK_KHR_external_fence_win32");
    }

    private static boolean check_KHR_external_memory_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_memory_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            288, 289
        },
            "vkGetMemoryFdKHR", "vkGetMemoryFdPropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_memory_fd");
    }

    private static boolean check_KHR_external_memory_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_memory_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            290, 291
        },
            "vkGetMemoryWin32HandleKHR", "vkGetMemoryWin32HandlePropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_memory_win32");
    }

    private static boolean check_KHR_external_semaphore_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_semaphore_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            292, 293
        },
            "vkImportSemaphoreFdKHR", "vkGetSemaphoreFdKHR"
        ) || reportMissing("VK", "VK_KHR_external_semaphore_fd");
    }

    private static boolean check_KHR_external_semaphore_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_semaphore_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            294, 295
        },
            "vkImportSemaphoreWin32HandleKHR", "vkGetSemaphoreWin32HandleKHR"
        ) || reportMissing("VK", "VK_KHR_external_semaphore_win32");
    }

    private static boolean check_KHR_fragment_shading_rate(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_fragment_shading_rate")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            296
        },
            "vkCmdSetFragmentShadingRateKHR"
        ) || reportMissing("VK", "VK_KHR_fragment_shading_rate");
    }

    private static boolean check_KHR_get_memory_requirements2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_get_memory_requirements2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            297, 298, 299
        },
            "vkGetImageMemoryRequirements2KHR", "vkGetBufferMemoryRequirements2KHR", "vkGetImageSparseMemoryRequirements2KHR"
        ) || reportMissing("VK", "VK_KHR_get_memory_requirements2");
    }

    private static boolean check_KHR_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance1")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            300
        },
            "vkTrimCommandPoolKHR"
        ) || reportMissing("VK", "VK_KHR_maintenance1");
    }

    private static boolean check_KHR_maintenance3(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance3")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            301
        },
            "vkGetDescriptorSetLayoutSupportKHR"
        ) || reportMissing("VK", "VK_KHR_maintenance3");
    }

    private static boolean check_KHR_performance_query(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_performance_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            302, 303
        },
            "vkAcquireProfilingLockKHR", "vkReleaseProfilingLockKHR"
        ) || reportMissing("VK", "VK_KHR_performance_query");
    }

    private static boolean check_KHR_pipeline_executable_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_pipeline_executable_properties")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            304, 305, 306
        },
            "vkGetPipelineExecutablePropertiesKHR", "vkGetPipelineExecutableStatisticsKHR", "vkGetPipelineExecutableInternalRepresentationsKHR"
        ) || reportMissing("VK", "VK_KHR_pipeline_executable_properties");
    }

    private static boolean check_KHR_present_wait(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_present_wait")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            307
        },
            "vkWaitForPresentKHR"
        ) || reportMissing("VK", "VK_KHR_present_wait");
    }

    private static boolean check_KHR_push_descriptor(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_push_descriptor")) {
            return false;
        }

        int flag0 = ext.contains("Vulkan11") || ext.contains("VK_KHR_descriptor_update_template") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            308, flag0 + 274
        },
            "vkCmdPushDescriptorSetKHR", "vkCmdPushDescriptorSetWithTemplateKHR"
        ) || reportMissing("VK", "VK_KHR_push_descriptor");
    }

    private static boolean check_KHR_ray_tracing_pipeline(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_ray_tracing_pipeline")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            309, 310, 311, 312, 313, 314, 315
        },
            "vkCmdTraceRaysKHR", "vkCreateRayTracingPipelinesKHR", "vkGetRayTracingShaderGroupHandlesKHR", "vkGetRayTracingCaptureReplayShaderGroupHandlesKHR", 
            "vkCmdTraceRaysIndirectKHR", "vkGetRayTracingShaderGroupStackSizeKHR", "vkCmdSetRayTracingPipelineStackSizeKHR"
        ) || reportMissing("VK", "VK_KHR_ray_tracing_pipeline");
    }

    private static boolean check_KHR_sampler_ycbcr_conversion(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_sampler_ycbcr_conversion")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            316, 317
        },
            "vkCreateSamplerYcbcrConversionKHR", "vkDestroySamplerYcbcrConversionKHR"
        ) || reportMissing("VK", "VK_KHR_sampler_ycbcr_conversion");
    }

    private static boolean check_KHR_shared_presentable_image(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_shared_presentable_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            318
        },
            "vkGetSwapchainStatusKHR"
        ) || reportMissing("VK", "VK_KHR_shared_presentable_image");
    }

    private static boolean check_KHR_swapchain(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_swapchain")) {
            return false;
        }

        int flag0 = ext.contains("Vulkan11") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            319, 320, 321, 322, 323, flag0 + 278, flag0 + 279, flag0 + 280
        },
            "vkCreateSwapchainKHR", "vkDestroySwapchainKHR", "vkGetSwapchainImagesKHR", "vkAcquireNextImageKHR", "vkQueuePresentKHR", 
            "vkGetDeviceGroupPresentCapabilitiesKHR", "vkGetDeviceGroupSurfacePresentModesKHR", "vkAcquireNextImage2KHR"
        ) || reportMissing("VK", "VK_KHR_swapchain");
    }

    private static boolean check_KHR_synchronization2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_synchronization2")) {
            return false;
        }

        int flag0 = ext.contains("VK_AMD_buffer_marker") ? 0 : Integer.MIN_VALUE;
        int flag1 = ext.contains("VK_NV_device_diagnostic_checkpoints") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            324, 325, 326, 327, 328, 329, flag0 + 330, flag1 + 331
        },
            "vkCmdSetEvent2KHR", "vkCmdResetEvent2KHR", "vkCmdWaitEvents2KHR", "vkCmdPipelineBarrier2KHR", "vkCmdWriteTimestamp2KHR", "vkQueueSubmit2KHR", 
            "vkCmdWriteBufferMarker2AMD", "vkGetQueueCheckpointData2NV"
        ) || reportMissing("VK", "VK_KHR_synchronization2");
    }

    private static boolean check_KHR_timeline_semaphore(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_timeline_semaphore")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            332, 333, 334
        },
            "vkGetSemaphoreCounterValueKHR", "vkWaitSemaphoresKHR", "vkSignalSemaphoreKHR"
        ) || reportMissing("VK", "VK_KHR_timeline_semaphore");
    }

    private static boolean check_KHR_video_decode_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_decode_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            335
        },
            "vkCmdDecodeVideoKHR"
        ) || reportMissing("VK", "VK_KHR_video_decode_queue");
    }

    private static boolean check_KHR_video_encode_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_encode_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            336
        },
            "vkCmdEncodeVideoKHR"
        ) || reportMissing("VK", "VK_KHR_video_encode_queue");
    }

    private static boolean check_KHR_video_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            337, 338, 339, 340, 341, 342, 343, 344, 345, 346
        },
            "vkCreateVideoSessionKHR", "vkDestroyVideoSessionKHR", "vkGetVideoSessionMemoryRequirementsKHR", "vkBindVideoSessionMemoryKHR", 
            "vkCreateVideoSessionParametersKHR", "vkUpdateVideoSessionParametersKHR", "vkDestroyVideoSessionParametersKHR", "vkCmdBeginVideoCodingKHR", 
            "vkCmdEndVideoCodingKHR", "vkCmdControlVideoCodingKHR"
        ) || reportMissing("VK", "VK_KHR_video_queue");
    }

    private static boolean check_NV_clip_space_w_scaling(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_clip_space_w_scaling")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            347
        },
            "vkCmdSetViewportWScalingNV"
        ) || reportMissing("VK", "VK_NV_clip_space_w_scaling");
    }

    private static boolean check_NV_device_diagnostic_checkpoints(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_device_diagnostic_checkpoints")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            348, 349
        },
            "vkCmdSetCheckpointNV", "vkGetQueueCheckpointDataNV"
        ) || reportMissing("VK", "VK_NV_device_diagnostic_checkpoints");
    }

    private static boolean check_NV_device_generated_commands(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_device_generated_commands")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            350, 351, 352, 353, 354, 355
        },
            "vkGetGeneratedCommandsMemoryRequirementsNV", "vkCmdPreprocessGeneratedCommandsNV", "vkCmdExecuteGeneratedCommandsNV", 
            "vkCmdBindPipelineShaderGroupNV", "vkCreateIndirectCommandsLayoutNV", "vkDestroyIndirectCommandsLayoutNV"
        ) || reportMissing("VK", "VK_NV_device_generated_commands");
    }

    private static boolean check_NV_external_memory_rdma(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_external_memory_rdma")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            356
        },
            "vkGetMemoryRemoteAddressNV"
        ) || reportMissing("VK", "VK_NV_external_memory_rdma");
    }

    private static boolean check_NV_external_memory_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_external_memory_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            357
        },
            "vkGetMemoryWin32HandleNV"
        ) || reportMissing("VK", "VK_NV_external_memory_win32");
    }

    private static boolean check_NV_fragment_shading_rate_enums(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_fragment_shading_rate_enums")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            358
        },
            "vkCmdSetFragmentShadingRateEnumNV"
        ) || reportMissing("VK", "VK_NV_fragment_shading_rate_enums");
    }

    private static boolean check_NV_mesh_shader(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_mesh_shader")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            359, 360, 361
        },
            "vkCmdDrawMeshTasksNV", "vkCmdDrawMeshTasksIndirectNV", "vkCmdDrawMeshTasksIndirectCountNV"
        ) || reportMissing("VK", "VK_NV_mesh_shader");
    }

    private static boolean check_NV_ray_tracing(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_ray_tracing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373
        },
            "vkCreateAccelerationStructureNV", "vkDestroyAccelerationStructureNV", "vkGetAccelerationStructureMemoryRequirementsNV", 
            "vkBindAccelerationStructureMemoryNV", "vkCmdBuildAccelerationStructureNV", "vkCmdCopyAccelerationStructureNV", "vkCmdTraceRaysNV", 
            "vkCreateRayTracingPipelinesNV", "vkGetRayTracingShaderGroupHandlesNV", "vkGetAccelerationStructureHandleNV", 
            "vkCmdWriteAccelerationStructuresPropertiesNV", "vkCompileDeferredNV"
        ) || reportMissing("VK", "VK_NV_ray_tracing");
    }

    private static boolean check_NV_scissor_exclusive(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_scissor_exclusive")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            374
        },
            "vkCmdSetExclusiveScissorNV"
        ) || reportMissing("VK", "VK_NV_scissor_exclusive");
    }

    private static boolean check_NV_shading_rate_image(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_shading_rate_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            375, 376, 377
        },
            "vkCmdBindShadingRateImageNV", "vkCmdSetViewportShadingRatePaletteNV", "vkCmdSetCoarseSampleOrderNV"
        ) || reportMissing("VK", "VK_NV_shading_rate_image");
    }

    private static boolean check_NVX_binary_import(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NVX_binary_import")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            378, 379, 380, 381, 382
        },
            "vkCreateCuModuleNVX", "vkCreateCuFunctionNVX", "vkDestroyCuModuleNVX", "vkDestroyCuFunctionNVX", "vkCmdCuLaunchKernelNVX"
        ) || reportMissing("VK", "VK_NVX_binary_import");
    }

    private static boolean check_NVX_image_view_handle(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NVX_image_view_handle")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            383, 384
        },
            "vkGetImageViewHandleNVX", "vkGetImageViewAddressNVX"
        ) || reportMissing("VK", "VK_NVX_image_view_handle");
    }

}
