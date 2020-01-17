/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.util.*;
import org.lwjgl.system.*;

/** Defines the capabilities of a Vulkan {@code VkDevice}. */
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

    // GOOGLE_display_timing
    public final long
        vkGetRefreshCycleDurationGOOGLE,
        vkGetPastPresentationTimingGOOGLE;

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

    // KHR_bind_memory2
    public final long
        vkBindBufferMemory2KHR,
        vkBindImageMemory2KHR;

    // KHR_buffer_device_address
    public final long
        vkGetBufferDeviceAddressKHR,
        vkGetBufferOpaqueCaptureAddressKHR,
        vkGetDeviceMemoryOpaqueCaptureAddressKHR;

    // KHR_create_renderpass2
    public final long
        vkCreateRenderPass2KHR,
        vkCmdBeginRenderPass2KHR,
        vkCmdNextSubpass2KHR,
        vkCmdEndRenderPass2KHR;

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

    // KHR_push_descriptor
    public final long
        vkCmdPushDescriptorSetKHR;

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

    // KHR_timeline_semaphore
    public final long
        vkGetSemaphoreCounterValueKHR,
        vkWaitSemaphoresKHR,
        vkSignalSemaphoreKHR;

    // NV_clip_space_w_scaling
    public final long
        vkCmdSetViewportWScalingNV;

    // NV_device_diagnostic_checkpoints
    public final long
        vkCmdSetCheckpointNV,
        vkGetQueueCheckpointDataNV;

    // NV_external_memory_win32
    public final long
        vkGetMemoryWin32HandleNV;

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

    // NVX_device_generated_commands
    public final long
        vkCmdProcessCommandsNVX,
        vkCmdReserveSpaceForCommandsNVX,
        vkCreateIndirectCommandsLayoutNVX,
        vkDestroyIndirectCommandsLayoutNVX,
        vkCreateObjectTableNVX,
        vkDestroyObjectTableNVX,
        vkRegisterObjectsNVX,
        vkUnregisterObjectsNVX;

    // NVX_image_view_handle
    public final long
        vkGetImageViewHandleNVX;

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
    /** When true, {@link EXTAstcDecodeMode} is supported. */
    public final boolean VK_EXT_astc_decode_mode;
    /** When true, {@link EXTBlendOperationAdvanced} is supported. */
    public final boolean VK_EXT_blend_operation_advanced;
    /** When true, {@link EXTBufferDeviceAddress} is supported. */
    public final boolean VK_EXT_buffer_device_address;
    /** When true, {@link EXTCalibratedTimestamps} is supported. */
    public final boolean VK_EXT_calibrated_timestamps;
    /** When true, {@link EXTConditionalRendering} is supported. */
    public final boolean VK_EXT_conditional_rendering;
    /** When true, {@link EXTConservativeRasterization} is supported. */
    public final boolean VK_EXT_conservative_rasterization;
    /** When true, {@link EXTDebugMarker} is supported. */
    public final boolean VK_EXT_debug_marker;
    /** When true, {@link EXTDepthClipEnable} is supported. */
    public final boolean VK_EXT_depth_clip_enable;
    /** When true, {@link EXTDepthRangeUnrestricted} is supported. */
    public final boolean VK_EXT_depth_range_unrestricted;
    /** When true, {@link EXTDescriptorIndexing} is supported. */
    public final boolean VK_EXT_descriptor_indexing;
    /** When true, {@link EXTDiscardRectangles} is supported. */
    public final boolean VK_EXT_discard_rectangles;
    /** When true, {@link EXTDisplayControl} is supported. */
    public final boolean VK_EXT_display_control;
    /** When true, {@link EXTExternalMemoryDmaBuf} is supported. */
    public final boolean VK_EXT_external_memory_dma_buf;
    /** When true, {@link EXTExternalMemoryHost} is supported. */
    public final boolean VK_EXT_external_memory_host;
    /** When true, {@link EXTFilterCubic} is supported. */
    public final boolean VK_EXT_filter_cubic;
    /** When true, {@link EXTFragmentDensityMap} is supported. */
    public final boolean VK_EXT_fragment_density_map;
    /** When true, {@link EXTFragmentShaderInterlock} is supported. */
    public final boolean VK_EXT_fragment_shader_interlock;
    /** When true, {@link EXTFullScreenExclusive} is supported. */
    public final boolean VK_EXT_full_screen_exclusive;
    /** When true, {@link EXTGlobalPriority} is supported. */
    public final boolean VK_EXT_global_priority;
    /** When true, {@link EXTHdrMetadata} is supported. */
    public final boolean VK_EXT_hdr_metadata;
    /** When true, {@link EXTHostQueryReset} is supported. */
    public final boolean VK_EXT_host_query_reset;
    /** When true, {@link EXTImageDrmFormatModifier} is supported. */
    public final boolean VK_EXT_image_drm_format_modifier;
    /** When true, {@link EXTIndexTypeUint8} is supported. */
    public final boolean VK_EXT_index_type_uint8;
    /** When true, {@link EXTInlineUniformBlock} is supported. */
    public final boolean VK_EXT_inline_uniform_block;
    /** When true, {@link EXTLineRasterization} is supported. */
    public final boolean VK_EXT_line_rasterization;
    /** When true, {@link EXTMemoryBudget} is supported. */
    public final boolean VK_EXT_memory_budget;
    /** When true, {@link EXTMemoryPriority} is supported. */
    public final boolean VK_EXT_memory_priority;
    /** When true, {@link EXTPciBusInfo} is supported. */
    public final boolean VK_EXT_pci_bus_info;
    /** When true, {@link EXTPipelineCreationFeedback} is supported. */
    public final boolean VK_EXT_pipeline_creation_feedback;
    /** When true, {@link EXTPostDepthCoverage} is supported. */
    public final boolean VK_EXT_post_depth_coverage;
    /** When true, {@link EXTQueueFamilyForeign} is supported. */
    public final boolean VK_EXT_queue_family_foreign;
    /** When true, {@link EXTSampleLocations} is supported. */
    public final boolean VK_EXT_sample_locations;
    /** When true, {@link EXTSamplerFilterMinmax} is supported. */
    public final boolean VK_EXT_sampler_filter_minmax;
    /** When true, {@link EXTScalarBlockLayout} is supported. */
    public final boolean VK_EXT_scalar_block_layout;
    /** When true, {@link EXTSeparateStencilUsage} is supported. */
    public final boolean VK_EXT_separate_stencil_usage;
    /** When true, {@link EXTShaderDemoteToHelperInvocation} is supported. */
    public final boolean VK_EXT_shader_demote_to_helper_invocation;
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
    /** When true, {@link KHRBindMemory2} is supported. */
    public final boolean VK_KHR_bind_memory2;
    /** When true, {@link KHRBufferDeviceAddress} is supported. */
    public final boolean VK_KHR_buffer_device_address;
    /** When true, {@link KHRCreateRenderpass2} is supported. */
    public final boolean VK_KHR_create_renderpass2;
    /** When true, {@link KHRDedicatedAllocation} is supported. */
    public final boolean VK_KHR_dedicated_allocation;
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
    /** When true, {@link KHRPushDescriptor} is supported. */
    public final boolean VK_KHR_push_descriptor;
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
    /** When true, {@link KHRShaderSubgroupExtendedTypes} is supported. */
    public final boolean VK_KHR_shader_subgroup_extended_types;
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
    /** When true, {@link KHRTimelineSemaphore} is supported. */
    public final boolean VK_KHR_timeline_semaphore;
    /** When true, {@link KHRUniformBufferStandardLayout} is supported. */
    public final boolean VK_KHR_uniform_buffer_standard_layout;
    /** When true, {@link KHRVariablePointers} is supported. */
    public final boolean VK_KHR_variable_pointers;
    /** When true, {@link KHRVulkanMemoryModel} is supported. */
    public final boolean VK_KHR_vulkan_memory_model;
    /** When true, {@link KHRWin32KeyedMutex} is supported. */
    public final boolean VK_KHR_win32_keyed_mutex;
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
    /** When true, {@link NVExternalMemory} is supported. */
    public final boolean VK_NV_external_memory;
    /** When true, {@link NVExternalMemoryWin32} is supported. */
    public final boolean VK_NV_external_memory_win32;
    /** When true, {@link NVFillRectangle} is supported. */
    public final boolean VK_NV_fill_rectangle;
    /** When true, {@link NVFragmentCoverageToColor} is supported. */
    public final boolean VK_NV_fragment_coverage_to_color;
    /** When true, {@link NVFragmentShaderBarycentric} is supported. */
    public final boolean VK_NV_fragment_shader_barycentric;
    /** When true, {@link NVFramebufferMixedSamples} is supported. */
    public final boolean VK_NV_framebuffer_mixed_samples;
    /** When true, {@link NVGeometryShaderPassthrough} is supported. */
    public final boolean VK_NV_geometry_shader_passthrough;
    /** When true, {@link NVGLSLShader} is supported. */
    public final boolean VK_NV_glsl_shader;
    /** When true, {@link NVMeshShader} is supported. */
    public final boolean VK_NV_mesh_shader;
    /** When true, {@link NVRayTracing} is supported. */
    public final boolean VK_NV_ray_tracing;
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
    /** When true, {@link NVXDeviceGeneratedCommands} is supported. */
    public final boolean VK_NVX_device_generated_commands;
    /** When true, {@link NVXImageViewHandle} is supported. */
    public final boolean VK_NVX_image_view_handle;
    /** When true, {@link NVXMultiviewPerViewAttributes} is supported. */
    public final boolean VK_NVX_multiview_per_view_attributes;

    VKCapabilitiesDevice(FunctionProvider provider, VKCapabilitiesInstance capsInstance, Set<String> ext) {
        this.apiVersion = capsInstance.apiVersion;

        Map<String, Long> caps = new HashMap<>(295);

        Vulkan10 = VK10.checkCapsDevice(provider, caps, ext);
        Vulkan11 = VK11.checkCapsDevice(provider, caps, ext);
        Vulkan12 = VK12.checkCapsDevice(provider, caps, ext);
        VK_AMD_buffer_marker = AMDBufferMarker.checkCapsDevice(provider, caps, ext);
        VK_AMD_device_coherent_memory = ext.contains("VK_AMD_device_coherent_memory");
        VK_AMD_display_native_hdr = AMDDisplayNativeHdr.checkCapsDevice(provider, caps, ext);
        VK_AMD_draw_indirect_count = AMDDrawIndirectCount.checkCapsDevice(provider, caps, ext);
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
        VK_AMD_shader_info = AMDShaderInfo.checkCapsDevice(provider, caps, ext);
        VK_AMD_shader_trinary_minmax = ext.contains("VK_AMD_shader_trinary_minmax");
        VK_AMD_texture_gather_bias_lod = ext.contains("VK_AMD_texture_gather_bias_lod");
        VK_EXT_astc_decode_mode = ext.contains("VK_EXT_astc_decode_mode");
        VK_EXT_blend_operation_advanced = ext.contains("VK_EXT_blend_operation_advanced");
        VK_EXT_buffer_device_address = EXTBufferDeviceAddress.checkCapsDevice(provider, caps, ext);
        VK_EXT_calibrated_timestamps = EXTCalibratedTimestamps.checkCapsDevice(provider, caps, ext);
        VK_EXT_conditional_rendering = EXTConditionalRendering.checkCapsDevice(provider, caps, ext);
        VK_EXT_conservative_rasterization = ext.contains("VK_EXT_conservative_rasterization");
        VK_EXT_debug_marker = EXTDebugMarker.checkCapsDevice(provider, caps, ext);
        EXTDebugUtils.checkCapsDevice(provider, caps, capsInstance);
        VK_EXT_depth_clip_enable = ext.contains("VK_EXT_depth_clip_enable");
        VK_EXT_depth_range_unrestricted = ext.contains("VK_EXT_depth_range_unrestricted");
        VK_EXT_descriptor_indexing = ext.contains("VK_EXT_descriptor_indexing");
        VK_EXT_discard_rectangles = EXTDiscardRectangles.checkCapsDevice(provider, caps, ext);
        VK_EXT_display_control = EXTDisplayControl.checkCapsDevice(provider, caps, ext);
        VK_EXT_external_memory_dma_buf = ext.contains("VK_EXT_external_memory_dma_buf");
        VK_EXT_external_memory_host = EXTExternalMemoryHost.checkCapsDevice(provider, caps, ext);
        VK_EXT_filter_cubic = ext.contains("VK_EXT_filter_cubic");
        VK_EXT_fragment_density_map = ext.contains("VK_EXT_fragment_density_map");
        VK_EXT_fragment_shader_interlock = ext.contains("VK_EXT_fragment_shader_interlock");
        VK_EXT_full_screen_exclusive = EXTFullScreenExclusive.checkCapsDevice(provider, caps, ext);
        VK_EXT_global_priority = ext.contains("VK_EXT_global_priority");
        VK_EXT_hdr_metadata = EXTHdrMetadata.checkCapsDevice(provider, caps, ext);
        VK_EXT_host_query_reset = EXTHostQueryReset.checkCapsDevice(provider, caps, ext);
        VK_EXT_image_drm_format_modifier = EXTImageDrmFormatModifier.checkCapsDevice(provider, caps, ext);
        VK_EXT_index_type_uint8 = ext.contains("VK_EXT_index_type_uint8");
        VK_EXT_inline_uniform_block = ext.contains("VK_EXT_inline_uniform_block");
        VK_EXT_line_rasterization = EXTLineRasterization.checkCapsDevice(provider, caps, ext);
        VK_EXT_memory_budget = ext.contains("VK_EXT_memory_budget");
        VK_EXT_memory_priority = ext.contains("VK_EXT_memory_priority");
        VK_EXT_pci_bus_info = ext.contains("VK_EXT_pci_bus_info");
        VK_EXT_pipeline_creation_feedback = ext.contains("VK_EXT_pipeline_creation_feedback");
        VK_EXT_post_depth_coverage = ext.contains("VK_EXT_post_depth_coverage");
        VK_EXT_queue_family_foreign = ext.contains("VK_EXT_queue_family_foreign");
        VK_EXT_sample_locations = EXTSampleLocations.checkCapsDevice(provider, caps, ext);
        VK_EXT_sampler_filter_minmax = ext.contains("VK_EXT_sampler_filter_minmax");
        VK_EXT_scalar_block_layout = ext.contains("VK_EXT_scalar_block_layout");
        VK_EXT_separate_stencil_usage = ext.contains("VK_EXT_separate_stencil_usage");
        VK_EXT_shader_demote_to_helper_invocation = ext.contains("VK_EXT_shader_demote_to_helper_invocation");
        VK_EXT_shader_stencil_export = ext.contains("VK_EXT_shader_stencil_export");
        VK_EXT_shader_subgroup_ballot = ext.contains("VK_EXT_shader_subgroup_ballot");
        VK_EXT_shader_subgroup_vote = ext.contains("VK_EXT_shader_subgroup_vote");
        VK_EXT_shader_viewport_index_layer = ext.contains("VK_EXT_shader_viewport_index_layer");
        VK_EXT_subgroup_size_control = ext.contains("VK_EXT_subgroup_size_control");
        VK_EXT_texel_buffer_alignment = ext.contains("VK_EXT_texel_buffer_alignment");
        VK_EXT_texture_compression_astc_hdr = ext.contains("VK_EXT_texture_compression_astc_hdr");
        VK_EXT_tooling_info = ext.contains("VK_EXT_tooling_info");
        VK_EXT_transform_feedback = EXTTransformFeedback.checkCapsDevice(provider, caps, ext);
        VK_EXT_validation_cache = EXTValidationCache.checkCapsDevice(provider, caps, ext);
        VK_EXT_vertex_attribute_divisor = ext.contains("VK_EXT_vertex_attribute_divisor");
        VK_EXT_ycbcr_image_arrays = ext.contains("VK_EXT_ycbcr_image_arrays");
        VK_GOOGLE_decorate_string = ext.contains("VK_GOOGLE_decorate_string");
        VK_GOOGLE_display_timing = GOOGLEDisplayTiming.checkCapsDevice(provider, caps, ext);
        VK_GOOGLE_hlsl_functionality1 = ext.contains("VK_GOOGLE_hlsl_functionality1");
        VK_GOOGLE_user_type = ext.contains("VK_GOOGLE_user_type");
        VK_IMG_filter_cubic = ext.contains("VK_IMG_filter_cubic");
        VK_IMG_format_pvrtc = ext.contains("VK_IMG_format_pvrtc");
        VK_INTEL_performance_query = INTELPerformanceQuery.checkCapsDevice(provider, caps, ext);
        VK_INTEL_shader_integer_functions2 = ext.contains("VK_INTEL_shader_integer_functions2");
        VK_KHR_16bit_storage = ext.contains("VK_KHR_16bit_storage");
        VK_KHR_8bit_storage = ext.contains("VK_KHR_8bit_storage");
        VK_KHR_bind_memory2 = KHRBindMemory2.checkCapsDevice(provider, caps, ext);
        VK_KHR_buffer_device_address = KHRBufferDeviceAddress.checkCapsDevice(provider, caps, ext);
        VK_KHR_create_renderpass2 = KHRCreateRenderpass2.checkCapsDevice(provider, caps, ext);
        VK_KHR_dedicated_allocation = ext.contains("VK_KHR_dedicated_allocation");
        VK_KHR_depth_stencil_resolve = ext.contains("VK_KHR_depth_stencil_resolve");
        VK_KHR_descriptor_update_template = KHRDescriptorUpdateTemplate.checkCapsDevice(provider, caps, ext);
        VK_KHR_device_group = KHRDeviceGroup.checkCapsDevice(provider, caps, ext);
        VK_KHR_display_swapchain = KHRDisplaySwapchain.checkCapsDevice(provider, caps, ext);
        VK_KHR_draw_indirect_count = KHRDrawIndirectCount.checkCapsDevice(provider, caps, ext);
        VK_KHR_driver_properties = ext.contains("VK_KHR_driver_properties");
        VK_KHR_external_fence = ext.contains("VK_KHR_external_fence");
        VK_KHR_external_fence_fd = KHRExternalFenceFd.checkCapsDevice(provider, caps, ext);
        VK_KHR_external_fence_win32 = KHRExternalFenceWin32.checkCapsDevice(provider, caps, ext);
        VK_KHR_external_memory = ext.contains("VK_KHR_external_memory");
        VK_KHR_external_memory_fd = KHRExternalMemoryFd.checkCapsDevice(provider, caps, ext);
        VK_KHR_external_memory_win32 = KHRExternalMemoryWin32.checkCapsDevice(provider, caps, ext);
        VK_KHR_external_semaphore = ext.contains("VK_KHR_external_semaphore");
        VK_KHR_external_semaphore_fd = KHRExternalSemaphoreFd.checkCapsDevice(provider, caps, ext);
        VK_KHR_external_semaphore_win32 = KHRExternalSemaphoreWin32.checkCapsDevice(provider, caps, ext);
        VK_KHR_get_memory_requirements2 = KHRGetMemoryRequirements2.checkCapsDevice(provider, caps, ext);
        VK_KHR_image_format_list = ext.contains("VK_KHR_image_format_list");
        VK_KHR_imageless_framebuffer = ext.contains("VK_KHR_imageless_framebuffer");
        VK_KHR_incremental_present = ext.contains("VK_KHR_incremental_present");
        VK_KHR_maintenance1 = KHRMaintenance1.checkCapsDevice(provider, caps, ext);
        VK_KHR_maintenance2 = ext.contains("VK_KHR_maintenance2");
        VK_KHR_maintenance3 = KHRMaintenance3.checkCapsDevice(provider, caps, ext);
        VK_KHR_multiview = ext.contains("VK_KHR_multiview");
        VK_KHR_performance_query = KHRPerformanceQuery.checkCapsDevice(provider, caps, ext);
        VK_KHR_pipeline_executable_properties = KHRPipelineExecutableProperties.checkCapsDevice(provider, caps, ext);
        VK_KHR_push_descriptor = KHRPushDescriptor.checkCapsDevice(provider, caps, ext);
        VK_KHR_relaxed_block_layout = ext.contains("VK_KHR_relaxed_block_layout");
        VK_KHR_sampler_mirror_clamp_to_edge = ext.contains("VK_KHR_sampler_mirror_clamp_to_edge");
        VK_KHR_sampler_ycbcr_conversion = KHRSamplerYcbcrConversion.checkCapsDevice(provider, caps, ext);
        VK_KHR_separate_depth_stencil_layouts = ext.contains("VK_KHR_separate_depth_stencil_layouts");
        VK_KHR_shader_atomic_int64 = ext.contains("VK_KHR_shader_atomic_int64");
        VK_KHR_shader_clock = ext.contains("VK_KHR_shader_clock");
        VK_KHR_shader_draw_parameters = ext.contains("VK_KHR_shader_draw_parameters");
        VK_KHR_shader_float16_int8 = ext.contains("VK_KHR_shader_float16_int8");
        VK_KHR_shader_float_controls = ext.contains("VK_KHR_shader_float_controls");
        VK_KHR_shader_subgroup_extended_types = ext.contains("VK_KHR_shader_subgroup_extended_types");
        VK_KHR_shared_presentable_image = KHRSharedPresentableImage.checkCapsDevice(provider, caps, ext);
        VK_KHR_spirv_1_4 = ext.contains("VK_KHR_spirv_1_4");
        VK_KHR_storage_buffer_storage_class = ext.contains("VK_KHR_storage_buffer_storage_class");
        VK_KHR_swapchain = KHRSwapchain.checkCapsDevice(provider, caps, ext);
        VK_KHR_swapchain_mutable_format = ext.contains("VK_KHR_swapchain_mutable_format");
        VK_KHR_timeline_semaphore = KHRTimelineSemaphore.checkCapsDevice(provider, caps, ext);
        VK_KHR_uniform_buffer_standard_layout = ext.contains("VK_KHR_uniform_buffer_standard_layout");
        VK_KHR_variable_pointers = ext.contains("VK_KHR_variable_pointers");
        VK_KHR_vulkan_memory_model = ext.contains("VK_KHR_vulkan_memory_model");
        VK_KHR_win32_keyed_mutex = ext.contains("VK_KHR_win32_keyed_mutex");
        VK_NV_clip_space_w_scaling = NVClipSpaceWScaling.checkCapsDevice(provider, caps, ext);
        VK_NV_compute_shader_derivatives = ext.contains("VK_NV_compute_shader_derivatives");
        VK_NV_cooperative_matrix = ext.contains("VK_NV_cooperative_matrix");
        VK_NV_corner_sampled_image = ext.contains("VK_NV_corner_sampled_image");
        VK_NV_coverage_reduction_mode = ext.contains("VK_NV_coverage_reduction_mode");
        VK_NV_dedicated_allocation = ext.contains("VK_NV_dedicated_allocation");
        VK_NV_dedicated_allocation_image_aliasing = ext.contains("VK_NV_dedicated_allocation_image_aliasing");
        VK_NV_device_diagnostic_checkpoints = NVDeviceDiagnosticCheckpoints.checkCapsDevice(provider, caps, ext);
        VK_NV_external_memory = ext.contains("VK_NV_external_memory");
        VK_NV_external_memory_win32 = NVExternalMemoryWin32.checkCapsDevice(provider, caps, ext);
        VK_NV_fill_rectangle = ext.contains("VK_NV_fill_rectangle");
        VK_NV_fragment_coverage_to_color = ext.contains("VK_NV_fragment_coverage_to_color");
        VK_NV_fragment_shader_barycentric = ext.contains("VK_NV_fragment_shader_barycentric");
        VK_NV_framebuffer_mixed_samples = ext.contains("VK_NV_framebuffer_mixed_samples");
        VK_NV_geometry_shader_passthrough = ext.contains("VK_NV_geometry_shader_passthrough");
        VK_NV_glsl_shader = ext.contains("VK_NV_glsl_shader");
        VK_NV_mesh_shader = NVMeshShader.checkCapsDevice(provider, caps, ext);
        VK_NV_ray_tracing = NVRayTracing.checkCapsDevice(provider, caps, ext);
        VK_NV_representative_fragment_test = ext.contains("VK_NV_representative_fragment_test");
        VK_NV_sample_mask_override_coverage = ext.contains("VK_NV_sample_mask_override_coverage");
        VK_NV_scissor_exclusive = NVScissorExclusive.checkCapsDevice(provider, caps, ext);
        VK_NV_shader_image_footprint = ext.contains("VK_NV_shader_image_footprint");
        VK_NV_shader_sm_builtins = ext.contains("VK_NV_shader_sm_builtins");
        VK_NV_shader_subgroup_partitioned = ext.contains("VK_NV_shader_subgroup_partitioned");
        VK_NV_shading_rate_image = NVShadingRateImage.checkCapsDevice(provider, caps, ext);
        VK_NV_viewport_array2 = ext.contains("VK_NV_viewport_array2");
        VK_NV_viewport_swizzle = ext.contains("VK_NV_viewport_swizzle");
        VK_NV_win32_keyed_mutex = ext.contains("VK_NV_win32_keyed_mutex");
        VK_NVX_device_generated_commands = NVXDeviceGeneratedCommands.checkCapsDevice(provider, caps, ext);
        VK_NVX_image_view_handle = NVXImageViewHandle.checkCapsDevice(provider, caps, ext);
        VK_NVX_multiview_per_view_attributes = ext.contains("VK_NVX_multiview_per_view_attributes");

        vkGetDeviceProcAddr = VK.get(caps, "vkGetDeviceProcAddr");
        vkDestroyDevice = VK.get(caps, "vkDestroyDevice");
        vkGetDeviceQueue = VK.get(caps, "vkGetDeviceQueue");
        vkQueueSubmit = VK.get(caps, "vkQueueSubmit");
        vkQueueWaitIdle = VK.get(caps, "vkQueueWaitIdle");
        vkDeviceWaitIdle = VK.get(caps, "vkDeviceWaitIdle");
        vkAllocateMemory = VK.get(caps, "vkAllocateMemory");
        vkFreeMemory = VK.get(caps, "vkFreeMemory");
        vkMapMemory = VK.get(caps, "vkMapMemory");
        vkUnmapMemory = VK.get(caps, "vkUnmapMemory");
        vkFlushMappedMemoryRanges = VK.get(caps, "vkFlushMappedMemoryRanges");
        vkInvalidateMappedMemoryRanges = VK.get(caps, "vkInvalidateMappedMemoryRanges");
        vkGetDeviceMemoryCommitment = VK.get(caps, "vkGetDeviceMemoryCommitment");
        vkBindBufferMemory = VK.get(caps, "vkBindBufferMemory");
        vkBindImageMemory = VK.get(caps, "vkBindImageMemory");
        vkGetBufferMemoryRequirements = VK.get(caps, "vkGetBufferMemoryRequirements");
        vkGetImageMemoryRequirements = VK.get(caps, "vkGetImageMemoryRequirements");
        vkGetImageSparseMemoryRequirements = VK.get(caps, "vkGetImageSparseMemoryRequirements");
        vkQueueBindSparse = VK.get(caps, "vkQueueBindSparse");
        vkCreateFence = VK.get(caps, "vkCreateFence");
        vkDestroyFence = VK.get(caps, "vkDestroyFence");
        vkResetFences = VK.get(caps, "vkResetFences");
        vkGetFenceStatus = VK.get(caps, "vkGetFenceStatus");
        vkWaitForFences = VK.get(caps, "vkWaitForFences");
        vkCreateSemaphore = VK.get(caps, "vkCreateSemaphore");
        vkDestroySemaphore = VK.get(caps, "vkDestroySemaphore");
        vkCreateEvent = VK.get(caps, "vkCreateEvent");
        vkDestroyEvent = VK.get(caps, "vkDestroyEvent");
        vkGetEventStatus = VK.get(caps, "vkGetEventStatus");
        vkSetEvent = VK.get(caps, "vkSetEvent");
        vkResetEvent = VK.get(caps, "vkResetEvent");
        vkCreateQueryPool = VK.get(caps, "vkCreateQueryPool");
        vkDestroyQueryPool = VK.get(caps, "vkDestroyQueryPool");
        vkGetQueryPoolResults = VK.get(caps, "vkGetQueryPoolResults");
        vkCreateBuffer = VK.get(caps, "vkCreateBuffer");
        vkDestroyBuffer = VK.get(caps, "vkDestroyBuffer");
        vkCreateBufferView = VK.get(caps, "vkCreateBufferView");
        vkDestroyBufferView = VK.get(caps, "vkDestroyBufferView");
        vkCreateImage = VK.get(caps, "vkCreateImage");
        vkDestroyImage = VK.get(caps, "vkDestroyImage");
        vkGetImageSubresourceLayout = VK.get(caps, "vkGetImageSubresourceLayout");
        vkCreateImageView = VK.get(caps, "vkCreateImageView");
        vkDestroyImageView = VK.get(caps, "vkDestroyImageView");
        vkCreateShaderModule = VK.get(caps, "vkCreateShaderModule");
        vkDestroyShaderModule = VK.get(caps, "vkDestroyShaderModule");
        vkCreatePipelineCache = VK.get(caps, "vkCreatePipelineCache");
        vkDestroyPipelineCache = VK.get(caps, "vkDestroyPipelineCache");
        vkGetPipelineCacheData = VK.get(caps, "vkGetPipelineCacheData");
        vkMergePipelineCaches = VK.get(caps, "vkMergePipelineCaches");
        vkCreateGraphicsPipelines = VK.get(caps, "vkCreateGraphicsPipelines");
        vkCreateComputePipelines = VK.get(caps, "vkCreateComputePipelines");
        vkDestroyPipeline = VK.get(caps, "vkDestroyPipeline");
        vkCreatePipelineLayout = VK.get(caps, "vkCreatePipelineLayout");
        vkDestroyPipelineLayout = VK.get(caps, "vkDestroyPipelineLayout");
        vkCreateSampler = VK.get(caps, "vkCreateSampler");
        vkDestroySampler = VK.get(caps, "vkDestroySampler");
        vkCreateDescriptorSetLayout = VK.get(caps, "vkCreateDescriptorSetLayout");
        vkDestroyDescriptorSetLayout = VK.get(caps, "vkDestroyDescriptorSetLayout");
        vkCreateDescriptorPool = VK.get(caps, "vkCreateDescriptorPool");
        vkDestroyDescriptorPool = VK.get(caps, "vkDestroyDescriptorPool");
        vkResetDescriptorPool = VK.get(caps, "vkResetDescriptorPool");
        vkAllocateDescriptorSets = VK.get(caps, "vkAllocateDescriptorSets");
        vkFreeDescriptorSets = VK.get(caps, "vkFreeDescriptorSets");
        vkUpdateDescriptorSets = VK.get(caps, "vkUpdateDescriptorSets");
        vkCreateFramebuffer = VK.get(caps, "vkCreateFramebuffer");
        vkDestroyFramebuffer = VK.get(caps, "vkDestroyFramebuffer");
        vkCreateRenderPass = VK.get(caps, "vkCreateRenderPass");
        vkDestroyRenderPass = VK.get(caps, "vkDestroyRenderPass");
        vkGetRenderAreaGranularity = VK.get(caps, "vkGetRenderAreaGranularity");
        vkCreateCommandPool = VK.get(caps, "vkCreateCommandPool");
        vkDestroyCommandPool = VK.get(caps, "vkDestroyCommandPool");
        vkResetCommandPool = VK.get(caps, "vkResetCommandPool");
        vkAllocateCommandBuffers = VK.get(caps, "vkAllocateCommandBuffers");
        vkFreeCommandBuffers = VK.get(caps, "vkFreeCommandBuffers");
        vkBeginCommandBuffer = VK.get(caps, "vkBeginCommandBuffer");
        vkEndCommandBuffer = VK.get(caps, "vkEndCommandBuffer");
        vkResetCommandBuffer = VK.get(caps, "vkResetCommandBuffer");
        vkCmdBindPipeline = VK.get(caps, "vkCmdBindPipeline");
        vkCmdSetViewport = VK.get(caps, "vkCmdSetViewport");
        vkCmdSetScissor = VK.get(caps, "vkCmdSetScissor");
        vkCmdSetLineWidth = VK.get(caps, "vkCmdSetLineWidth");
        vkCmdSetDepthBias = VK.get(caps, "vkCmdSetDepthBias");
        vkCmdSetBlendConstants = VK.get(caps, "vkCmdSetBlendConstants");
        vkCmdSetDepthBounds = VK.get(caps, "vkCmdSetDepthBounds");
        vkCmdSetStencilCompareMask = VK.get(caps, "vkCmdSetStencilCompareMask");
        vkCmdSetStencilWriteMask = VK.get(caps, "vkCmdSetStencilWriteMask");
        vkCmdSetStencilReference = VK.get(caps, "vkCmdSetStencilReference");
        vkCmdBindDescriptorSets = VK.get(caps, "vkCmdBindDescriptorSets");
        vkCmdBindIndexBuffer = VK.get(caps, "vkCmdBindIndexBuffer");
        vkCmdBindVertexBuffers = VK.get(caps, "vkCmdBindVertexBuffers");
        vkCmdDraw = VK.get(caps, "vkCmdDraw");
        vkCmdDrawIndexed = VK.get(caps, "vkCmdDrawIndexed");
        vkCmdDrawIndirect = VK.get(caps, "vkCmdDrawIndirect");
        vkCmdDrawIndexedIndirect = VK.get(caps, "vkCmdDrawIndexedIndirect");
        vkCmdDispatch = VK.get(caps, "vkCmdDispatch");
        vkCmdDispatchIndirect = VK.get(caps, "vkCmdDispatchIndirect");
        vkCmdCopyBuffer = VK.get(caps, "vkCmdCopyBuffer");
        vkCmdCopyImage = VK.get(caps, "vkCmdCopyImage");
        vkCmdBlitImage = VK.get(caps, "vkCmdBlitImage");
        vkCmdCopyBufferToImage = VK.get(caps, "vkCmdCopyBufferToImage");
        vkCmdCopyImageToBuffer = VK.get(caps, "vkCmdCopyImageToBuffer");
        vkCmdUpdateBuffer = VK.get(caps, "vkCmdUpdateBuffer");
        vkCmdFillBuffer = VK.get(caps, "vkCmdFillBuffer");
        vkCmdClearColorImage = VK.get(caps, "vkCmdClearColorImage");
        vkCmdClearDepthStencilImage = VK.get(caps, "vkCmdClearDepthStencilImage");
        vkCmdClearAttachments = VK.get(caps, "vkCmdClearAttachments");
        vkCmdResolveImage = VK.get(caps, "vkCmdResolveImage");
        vkCmdSetEvent = VK.get(caps, "vkCmdSetEvent");
        vkCmdResetEvent = VK.get(caps, "vkCmdResetEvent");
        vkCmdWaitEvents = VK.get(caps, "vkCmdWaitEvents");
        vkCmdPipelineBarrier = VK.get(caps, "vkCmdPipelineBarrier");
        vkCmdBeginQuery = VK.get(caps, "vkCmdBeginQuery");
        vkCmdEndQuery = VK.get(caps, "vkCmdEndQuery");
        vkCmdResetQueryPool = VK.get(caps, "vkCmdResetQueryPool");
        vkCmdWriteTimestamp = VK.get(caps, "vkCmdWriteTimestamp");
        vkCmdCopyQueryPoolResults = VK.get(caps, "vkCmdCopyQueryPoolResults");
        vkCmdPushConstants = VK.get(caps, "vkCmdPushConstants");
        vkCmdBeginRenderPass = VK.get(caps, "vkCmdBeginRenderPass");
        vkCmdNextSubpass = VK.get(caps, "vkCmdNextSubpass");
        vkCmdEndRenderPass = VK.get(caps, "vkCmdEndRenderPass");
        vkCmdExecuteCommands = VK.get(caps, "vkCmdExecuteCommands");
        vkBindBufferMemory2 = VK.get(caps, "vkBindBufferMemory2");
        vkBindImageMemory2 = VK.get(caps, "vkBindImageMemory2");
        vkGetDeviceGroupPeerMemoryFeatures = VK.get(caps, "vkGetDeviceGroupPeerMemoryFeatures");
        vkCmdSetDeviceMask = VK.get(caps, "vkCmdSetDeviceMask");
        vkCmdDispatchBase = VK.get(caps, "vkCmdDispatchBase");
        vkGetImageMemoryRequirements2 = VK.get(caps, "vkGetImageMemoryRequirements2");
        vkGetBufferMemoryRequirements2 = VK.get(caps, "vkGetBufferMemoryRequirements2");
        vkGetImageSparseMemoryRequirements2 = VK.get(caps, "vkGetImageSparseMemoryRequirements2");
        vkTrimCommandPool = VK.get(caps, "vkTrimCommandPool");
        vkGetDeviceQueue2 = VK.get(caps, "vkGetDeviceQueue2");
        vkCreateSamplerYcbcrConversion = VK.get(caps, "vkCreateSamplerYcbcrConversion");
        vkDestroySamplerYcbcrConversion = VK.get(caps, "vkDestroySamplerYcbcrConversion");
        vkCreateDescriptorUpdateTemplate = VK.get(caps, "vkCreateDescriptorUpdateTemplate");
        vkDestroyDescriptorUpdateTemplate = VK.get(caps, "vkDestroyDescriptorUpdateTemplate");
        vkUpdateDescriptorSetWithTemplate = VK.get(caps, "vkUpdateDescriptorSetWithTemplate");
        vkGetDescriptorSetLayoutSupport = VK.get(caps, "vkGetDescriptorSetLayoutSupport");
        vkCmdDrawIndirectCount = VK.get(caps, "vkCmdDrawIndirectCount");
        vkCmdDrawIndexedIndirectCount = VK.get(caps, "vkCmdDrawIndexedIndirectCount");
        vkCreateRenderPass2 = VK.get(caps, "vkCreateRenderPass2");
        vkCmdBeginRenderPass2 = VK.get(caps, "vkCmdBeginRenderPass2");
        vkCmdNextSubpass2 = VK.get(caps, "vkCmdNextSubpass2");
        vkCmdEndRenderPass2 = VK.get(caps, "vkCmdEndRenderPass2");
        vkResetQueryPool = VK.get(caps, "vkResetQueryPool");
        vkGetSemaphoreCounterValue = VK.get(caps, "vkGetSemaphoreCounterValue");
        vkWaitSemaphores = VK.get(caps, "vkWaitSemaphores");
        vkSignalSemaphore = VK.get(caps, "vkSignalSemaphore");
        vkGetBufferDeviceAddress = VK.get(caps, "vkGetBufferDeviceAddress");
        vkGetBufferOpaqueCaptureAddress = VK.get(caps, "vkGetBufferOpaqueCaptureAddress");
        vkGetDeviceMemoryOpaqueCaptureAddress = VK.get(caps, "vkGetDeviceMemoryOpaqueCaptureAddress");
        vkCmdWriteBufferMarkerAMD = VK.get(caps, "vkCmdWriteBufferMarkerAMD");
        vkSetLocalDimmingAMD = VK.get(caps, "vkSetLocalDimmingAMD");
        vkCmdDrawIndirectCountAMD = VK.get(caps, "vkCmdDrawIndirectCountAMD");
        vkCmdDrawIndexedIndirectCountAMD = VK.get(caps, "vkCmdDrawIndexedIndirectCountAMD");
        vkGetShaderInfoAMD = VK.get(caps, "vkGetShaderInfoAMD");
        vkGetBufferDeviceAddressEXT = VK.get(caps, "vkGetBufferDeviceAddressEXT");
        vkGetCalibratedTimestampsEXT = VK.get(caps, "vkGetCalibratedTimestampsEXT");
        vkCmdBeginConditionalRenderingEXT = VK.get(caps, "vkCmdBeginConditionalRenderingEXT");
        vkCmdEndConditionalRenderingEXT = VK.get(caps, "vkCmdEndConditionalRenderingEXT");
        vkDebugMarkerSetObjectTagEXT = VK.get(caps, "vkDebugMarkerSetObjectTagEXT");
        vkDebugMarkerSetObjectNameEXT = VK.get(caps, "vkDebugMarkerSetObjectNameEXT");
        vkCmdDebugMarkerBeginEXT = VK.get(caps, "vkCmdDebugMarkerBeginEXT");
        vkCmdDebugMarkerEndEXT = VK.get(caps, "vkCmdDebugMarkerEndEXT");
        vkCmdDebugMarkerInsertEXT = VK.get(caps, "vkCmdDebugMarkerInsertEXT");
        vkSetDebugUtilsObjectNameEXT = VK.get(caps, "vkSetDebugUtilsObjectNameEXT");
        vkSetDebugUtilsObjectTagEXT = VK.get(caps, "vkSetDebugUtilsObjectTagEXT");
        vkQueueBeginDebugUtilsLabelEXT = VK.get(caps, "vkQueueBeginDebugUtilsLabelEXT");
        vkQueueEndDebugUtilsLabelEXT = VK.get(caps, "vkQueueEndDebugUtilsLabelEXT");
        vkQueueInsertDebugUtilsLabelEXT = VK.get(caps, "vkQueueInsertDebugUtilsLabelEXT");
        vkCmdBeginDebugUtilsLabelEXT = VK.get(caps, "vkCmdBeginDebugUtilsLabelEXT");
        vkCmdEndDebugUtilsLabelEXT = VK.get(caps, "vkCmdEndDebugUtilsLabelEXT");
        vkCmdInsertDebugUtilsLabelEXT = VK.get(caps, "vkCmdInsertDebugUtilsLabelEXT");
        vkCmdSetDiscardRectangleEXT = VK.get(caps, "vkCmdSetDiscardRectangleEXT");
        vkDisplayPowerControlEXT = VK.get(caps, "vkDisplayPowerControlEXT");
        vkRegisterDeviceEventEXT = VK.get(caps, "vkRegisterDeviceEventEXT");
        vkRegisterDisplayEventEXT = VK.get(caps, "vkRegisterDisplayEventEXT");
        vkGetSwapchainCounterEXT = VK.get(caps, "vkGetSwapchainCounterEXT");
        vkGetMemoryHostPointerPropertiesEXT = VK.get(caps, "vkGetMemoryHostPointerPropertiesEXT");
        vkAcquireFullScreenExclusiveModeEXT = VK.get(caps, "vkAcquireFullScreenExclusiveModeEXT");
        vkReleaseFullScreenExclusiveModeEXT = VK.get(caps, "vkReleaseFullScreenExclusiveModeEXT");
        vkGetDeviceGroupSurfacePresentModes2EXT = VK.get(caps, "vkGetDeviceGroupSurfacePresentModes2EXT");
        vkSetHdrMetadataEXT = VK.get(caps, "vkSetHdrMetadataEXT");
        vkResetQueryPoolEXT = VK.get(caps, "vkResetQueryPoolEXT");
        vkGetImageDrmFormatModifierPropertiesEXT = VK.get(caps, "vkGetImageDrmFormatModifierPropertiesEXT");
        vkCmdSetLineStippleEXT = VK.get(caps, "vkCmdSetLineStippleEXT");
        vkCmdSetSampleLocationsEXT = VK.get(caps, "vkCmdSetSampleLocationsEXT");
        vkCmdBindTransformFeedbackBuffersEXT = VK.get(caps, "vkCmdBindTransformFeedbackBuffersEXT");
        vkCmdBeginTransformFeedbackEXT = VK.get(caps, "vkCmdBeginTransformFeedbackEXT");
        vkCmdEndTransformFeedbackEXT = VK.get(caps, "vkCmdEndTransformFeedbackEXT");
        vkCmdBeginQueryIndexedEXT = VK.get(caps, "vkCmdBeginQueryIndexedEXT");
        vkCmdEndQueryIndexedEXT = VK.get(caps, "vkCmdEndQueryIndexedEXT");
        vkCmdDrawIndirectByteCountEXT = VK.get(caps, "vkCmdDrawIndirectByteCountEXT");
        vkCreateValidationCacheEXT = VK.get(caps, "vkCreateValidationCacheEXT");
        vkDestroyValidationCacheEXT = VK.get(caps, "vkDestroyValidationCacheEXT");
        vkMergeValidationCachesEXT = VK.get(caps, "vkMergeValidationCachesEXT");
        vkGetValidationCacheDataEXT = VK.get(caps, "vkGetValidationCacheDataEXT");
        vkGetRefreshCycleDurationGOOGLE = VK.get(caps, "vkGetRefreshCycleDurationGOOGLE");
        vkGetPastPresentationTimingGOOGLE = VK.get(caps, "vkGetPastPresentationTimingGOOGLE");
        vkInitializePerformanceApiINTEL = VK.get(caps, "vkInitializePerformanceApiINTEL");
        vkUninitializePerformanceApiINTEL = VK.get(caps, "vkUninitializePerformanceApiINTEL");
        vkCmdSetPerformanceMarkerINTEL = VK.get(caps, "vkCmdSetPerformanceMarkerINTEL");
        vkCmdSetPerformanceStreamMarkerINTEL = VK.get(caps, "vkCmdSetPerformanceStreamMarkerINTEL");
        vkCmdSetPerformanceOverrideINTEL = VK.get(caps, "vkCmdSetPerformanceOverrideINTEL");
        vkAcquirePerformanceConfigurationINTEL = VK.get(caps, "vkAcquirePerformanceConfigurationINTEL");
        vkReleasePerformanceConfigurationINTEL = VK.get(caps, "vkReleasePerformanceConfigurationINTEL");
        vkQueueSetPerformanceConfigurationINTEL = VK.get(caps, "vkQueueSetPerformanceConfigurationINTEL");
        vkGetPerformanceParameterINTEL = VK.get(caps, "vkGetPerformanceParameterINTEL");
        vkBindBufferMemory2KHR = VK.get(caps, "vkBindBufferMemory2KHR");
        vkBindImageMemory2KHR = VK.get(caps, "vkBindImageMemory2KHR");
        vkGetBufferDeviceAddressKHR = VK.get(caps, "vkGetBufferDeviceAddressKHR");
        vkGetBufferOpaqueCaptureAddressKHR = VK.get(caps, "vkGetBufferOpaqueCaptureAddressKHR");
        vkGetDeviceMemoryOpaqueCaptureAddressKHR = VK.get(caps, "vkGetDeviceMemoryOpaqueCaptureAddressKHR");
        vkCreateRenderPass2KHR = VK.get(caps, "vkCreateRenderPass2KHR");
        vkCmdBeginRenderPass2KHR = VK.get(caps, "vkCmdBeginRenderPass2KHR");
        vkCmdNextSubpass2KHR = VK.get(caps, "vkCmdNextSubpass2KHR");
        vkCmdEndRenderPass2KHR = VK.get(caps, "vkCmdEndRenderPass2KHR");
        vkCreateDescriptorUpdateTemplateKHR = VK.get(caps, "vkCreateDescriptorUpdateTemplateKHR");
        vkDestroyDescriptorUpdateTemplateKHR = VK.get(caps, "vkDestroyDescriptorUpdateTemplateKHR");
        vkUpdateDescriptorSetWithTemplateKHR = VK.get(caps, "vkUpdateDescriptorSetWithTemplateKHR");
        vkCmdPushDescriptorSetWithTemplateKHR = VK.get(caps, "vkCmdPushDescriptorSetWithTemplateKHR");
        vkGetDeviceGroupPeerMemoryFeaturesKHR = VK.get(caps, "vkGetDeviceGroupPeerMemoryFeaturesKHR");
        vkCmdSetDeviceMaskKHR = VK.get(caps, "vkCmdSetDeviceMaskKHR");
        vkCmdDispatchBaseKHR = VK.get(caps, "vkCmdDispatchBaseKHR");
        vkGetDeviceGroupPresentCapabilitiesKHR = VK.get(caps, "vkGetDeviceGroupPresentCapabilitiesKHR");
        vkGetDeviceGroupSurfacePresentModesKHR = VK.get(caps, "vkGetDeviceGroupSurfacePresentModesKHR");
        vkAcquireNextImage2KHR = VK.get(caps, "vkAcquireNextImage2KHR");
        vkCreateSharedSwapchainsKHR = VK.get(caps, "vkCreateSharedSwapchainsKHR");
        vkCmdDrawIndirectCountKHR = VK.get(caps, "vkCmdDrawIndirectCountKHR");
        vkCmdDrawIndexedIndirectCountKHR = VK.get(caps, "vkCmdDrawIndexedIndirectCountKHR");
        vkImportFenceFdKHR = VK.get(caps, "vkImportFenceFdKHR");
        vkGetFenceFdKHR = VK.get(caps, "vkGetFenceFdKHR");
        vkImportFenceWin32HandleKHR = VK.get(caps, "vkImportFenceWin32HandleKHR");
        vkGetFenceWin32HandleKHR = VK.get(caps, "vkGetFenceWin32HandleKHR");
        vkGetMemoryFdKHR = VK.get(caps, "vkGetMemoryFdKHR");
        vkGetMemoryFdPropertiesKHR = VK.get(caps, "vkGetMemoryFdPropertiesKHR");
        vkGetMemoryWin32HandleKHR = VK.get(caps, "vkGetMemoryWin32HandleKHR");
        vkGetMemoryWin32HandlePropertiesKHR = VK.get(caps, "vkGetMemoryWin32HandlePropertiesKHR");
        vkImportSemaphoreFdKHR = VK.get(caps, "vkImportSemaphoreFdKHR");
        vkGetSemaphoreFdKHR = VK.get(caps, "vkGetSemaphoreFdKHR");
        vkImportSemaphoreWin32HandleKHR = VK.get(caps, "vkImportSemaphoreWin32HandleKHR");
        vkGetSemaphoreWin32HandleKHR = VK.get(caps, "vkGetSemaphoreWin32HandleKHR");
        vkGetImageMemoryRequirements2KHR = VK.get(caps, "vkGetImageMemoryRequirements2KHR");
        vkGetBufferMemoryRequirements2KHR = VK.get(caps, "vkGetBufferMemoryRequirements2KHR");
        vkGetImageSparseMemoryRequirements2KHR = VK.get(caps, "vkGetImageSparseMemoryRequirements2KHR");
        vkTrimCommandPoolKHR = VK.get(caps, "vkTrimCommandPoolKHR");
        vkGetDescriptorSetLayoutSupportKHR = VK.get(caps, "vkGetDescriptorSetLayoutSupportKHR");
        vkAcquireProfilingLockKHR = VK.get(caps, "vkAcquireProfilingLockKHR");
        vkReleaseProfilingLockKHR = VK.get(caps, "vkReleaseProfilingLockKHR");
        vkGetPipelineExecutablePropertiesKHR = VK.get(caps, "vkGetPipelineExecutablePropertiesKHR");
        vkGetPipelineExecutableStatisticsKHR = VK.get(caps, "vkGetPipelineExecutableStatisticsKHR");
        vkGetPipelineExecutableInternalRepresentationsKHR = VK.get(caps, "vkGetPipelineExecutableInternalRepresentationsKHR");
        vkCmdPushDescriptorSetKHR = VK.get(caps, "vkCmdPushDescriptorSetKHR");
        vkCreateSamplerYcbcrConversionKHR = VK.get(caps, "vkCreateSamplerYcbcrConversionKHR");
        vkDestroySamplerYcbcrConversionKHR = VK.get(caps, "vkDestroySamplerYcbcrConversionKHR");
        vkGetSwapchainStatusKHR = VK.get(caps, "vkGetSwapchainStatusKHR");
        vkCreateSwapchainKHR = VK.get(caps, "vkCreateSwapchainKHR");
        vkDestroySwapchainKHR = VK.get(caps, "vkDestroySwapchainKHR");
        vkGetSwapchainImagesKHR = VK.get(caps, "vkGetSwapchainImagesKHR");
        vkAcquireNextImageKHR = VK.get(caps, "vkAcquireNextImageKHR");
        vkQueuePresentKHR = VK.get(caps, "vkQueuePresentKHR");
        vkGetSemaphoreCounterValueKHR = VK.get(caps, "vkGetSemaphoreCounterValueKHR");
        vkWaitSemaphoresKHR = VK.get(caps, "vkWaitSemaphoresKHR");
        vkSignalSemaphoreKHR = VK.get(caps, "vkSignalSemaphoreKHR");
        vkCmdSetViewportWScalingNV = VK.get(caps, "vkCmdSetViewportWScalingNV");
        vkCmdSetCheckpointNV = VK.get(caps, "vkCmdSetCheckpointNV");
        vkGetQueueCheckpointDataNV = VK.get(caps, "vkGetQueueCheckpointDataNV");
        vkGetMemoryWin32HandleNV = VK.get(caps, "vkGetMemoryWin32HandleNV");
        vkCmdDrawMeshTasksNV = VK.get(caps, "vkCmdDrawMeshTasksNV");
        vkCmdDrawMeshTasksIndirectNV = VK.get(caps, "vkCmdDrawMeshTasksIndirectNV");
        vkCmdDrawMeshTasksIndirectCountNV = VK.get(caps, "vkCmdDrawMeshTasksIndirectCountNV");
        vkCreateAccelerationStructureNV = VK.get(caps, "vkCreateAccelerationStructureNV");
        vkDestroyAccelerationStructureNV = VK.get(caps, "vkDestroyAccelerationStructureNV");
        vkGetAccelerationStructureMemoryRequirementsNV = VK.get(caps, "vkGetAccelerationStructureMemoryRequirementsNV");
        vkBindAccelerationStructureMemoryNV = VK.get(caps, "vkBindAccelerationStructureMemoryNV");
        vkCmdBuildAccelerationStructureNV = VK.get(caps, "vkCmdBuildAccelerationStructureNV");
        vkCmdCopyAccelerationStructureNV = VK.get(caps, "vkCmdCopyAccelerationStructureNV");
        vkCmdTraceRaysNV = VK.get(caps, "vkCmdTraceRaysNV");
        vkCreateRayTracingPipelinesNV = VK.get(caps, "vkCreateRayTracingPipelinesNV");
        vkGetRayTracingShaderGroupHandlesNV = VK.get(caps, "vkGetRayTracingShaderGroupHandlesNV");
        vkGetAccelerationStructureHandleNV = VK.get(caps, "vkGetAccelerationStructureHandleNV");
        vkCmdWriteAccelerationStructuresPropertiesNV = VK.get(caps, "vkCmdWriteAccelerationStructuresPropertiesNV");
        vkCompileDeferredNV = VK.get(caps, "vkCompileDeferredNV");
        vkCmdSetExclusiveScissorNV = VK.get(caps, "vkCmdSetExclusiveScissorNV");
        vkCmdBindShadingRateImageNV = VK.get(caps, "vkCmdBindShadingRateImageNV");
        vkCmdSetViewportShadingRatePaletteNV = VK.get(caps, "vkCmdSetViewportShadingRatePaletteNV");
        vkCmdSetCoarseSampleOrderNV = VK.get(caps, "vkCmdSetCoarseSampleOrderNV");
        vkCmdProcessCommandsNVX = VK.get(caps, "vkCmdProcessCommandsNVX");
        vkCmdReserveSpaceForCommandsNVX = VK.get(caps, "vkCmdReserveSpaceForCommandsNVX");
        vkCreateIndirectCommandsLayoutNVX = VK.get(caps, "vkCreateIndirectCommandsLayoutNVX");
        vkDestroyIndirectCommandsLayoutNVX = VK.get(caps, "vkDestroyIndirectCommandsLayoutNVX");
        vkCreateObjectTableNVX = VK.get(caps, "vkCreateObjectTableNVX");
        vkDestroyObjectTableNVX = VK.get(caps, "vkDestroyObjectTableNVX");
        vkRegisterObjectsNVX = VK.get(caps, "vkRegisterObjectsNVX");
        vkUnregisterObjectsNVX = VK.get(caps, "vkUnregisterObjectsNVX");
        vkGetImageViewHandleNVX = VK.get(caps, "vkGetImageViewHandleNVX");
    }

}
