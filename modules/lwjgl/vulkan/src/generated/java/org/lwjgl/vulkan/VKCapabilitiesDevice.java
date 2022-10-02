/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.util.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Defines the enabled capabilities of a Vulkan {@code VkDevice}. */
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

    // VK13
    public final long
        vkCreatePrivateDataSlot,
        vkDestroyPrivateDataSlot,
        vkSetPrivateData,
        vkGetPrivateData,
        vkCmdSetEvent2,
        vkCmdResetEvent2,
        vkCmdWaitEvents2,
        vkCmdPipelineBarrier2,
        vkCmdWriteTimestamp2,
        vkQueueSubmit2,
        vkCmdCopyBuffer2,
        vkCmdCopyImage2,
        vkCmdCopyBufferToImage2,
        vkCmdCopyImageToBuffer2,
        vkCmdBlitImage2,
        vkCmdResolveImage2,
        vkCmdBeginRendering,
        vkCmdEndRendering,
        vkCmdSetCullMode,
        vkCmdSetFrontFace,
        vkCmdSetPrimitiveTopology,
        vkCmdSetViewportWithCount,
        vkCmdSetScissorWithCount,
        vkCmdBindVertexBuffers2,
        vkCmdSetDepthTestEnable,
        vkCmdSetDepthWriteEnable,
        vkCmdSetDepthCompareOp,
        vkCmdSetDepthBoundsTestEnable,
        vkCmdSetStencilTestEnable,
        vkCmdSetStencilOp,
        vkCmdSetRasterizerDiscardEnable,
        vkCmdSetDepthBiasEnable,
        vkCmdSetPrimitiveRestartEnable,
        vkGetDeviceBufferMemoryRequirements,
        vkGetDeviceImageMemoryRequirements,
        vkGetDeviceImageSparseMemoryRequirements;

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

    // EXT_device_fault
    public final long
        vkGetDeviceFaultInfoEXT;

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

    // EXT_extended_dynamic_state3
    public final long
        vkCmdSetTessellationDomainOriginEXT,
        vkCmdSetDepthClampEnableEXT,
        vkCmdSetPolygonModeEXT,
        vkCmdSetRasterizationSamplesEXT,
        vkCmdSetSampleMaskEXT,
        vkCmdSetAlphaToCoverageEnableEXT,
        vkCmdSetAlphaToOneEnableEXT,
        vkCmdSetLogicOpEnableEXT,
        vkCmdSetColorBlendEnableEXT,
        vkCmdSetColorBlendEquationEXT,
        vkCmdSetColorWriteMaskEXT,
        vkCmdSetRasterizationStreamEXT,
        vkCmdSetConservativeRasterizationModeEXT,
        vkCmdSetExtraPrimitiveOverestimationSizeEXT,
        vkCmdSetDepthClipEnableEXT,
        vkCmdSetSampleLocationsEnableEXT,
        vkCmdSetColorBlendAdvancedEXT,
        vkCmdSetProvokingVertexModeEXT,
        vkCmdSetLineRasterizationModeEXT,
        vkCmdSetLineStippleEnableEXT,
        vkCmdSetDepthClipNegativeOneToOneEXT,
        vkCmdSetViewportWScalingEnableNV,
        vkCmdSetViewportSwizzleNV,
        vkCmdSetCoverageToColorEnableNV,
        vkCmdSetCoverageToColorLocationNV,
        vkCmdSetCoverageModulationModeNV,
        vkCmdSetCoverageModulationTableEnableNV,
        vkCmdSetCoverageModulationTableNV,
        vkCmdSetShadingRateImageEnableNV,
        vkCmdSetRepresentativeFragmentTestEnableNV,
        vkCmdSetCoverageReductionModeNV;

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

    // EXT_image_compression_control
    public final long
        vkGetImageSubresourceLayout2EXT;

    // EXT_image_drm_format_modifier
    public final long
        vkGetImageDrmFormatModifierPropertiesEXT;

    // EXT_line_rasterization
    public final long
        vkCmdSetLineStippleEXT;

    // EXT_mesh_shader
    public final long
        vkCmdDrawMeshTasksEXT,
        vkCmdDrawMeshTasksIndirectEXT,
        vkCmdDrawMeshTasksIndirectCountEXT;

    // EXT_metal_objects
    public final long
        vkExportMetalObjectsEXT;

    // EXT_multi_draw
    public final long
        vkCmdDrawMultiEXT,
        vkCmdDrawMultiIndexedEXT;

    // EXT_opacity_micromap
    public final long
        vkCreateMicromapEXT,
        vkDestroyMicromapEXT,
        vkCmdBuildMicromapsEXT,
        vkBuildMicromapsEXT,
        vkCopyMicromapEXT,
        vkCopyMicromapToMemoryEXT,
        vkCopyMemoryToMicromapEXT,
        vkWriteMicromapsPropertiesEXT,
        vkCmdCopyMicromapEXT,
        vkCmdCopyMicromapToMemoryEXT,
        vkCmdCopyMemoryToMicromapEXT,
        vkCmdWriteMicromapsPropertiesEXT,
        vkGetDeviceMicromapCompatibilityEXT,
        vkGetMicromapBuildSizesEXT;

    // EXT_pageable_device_local_memory
    public final long
        vkSetDeviceMemoryPriorityEXT;

    // EXT_pipeline_properties
    public final long
        vkGetPipelinePropertiesEXT;

    // EXT_private_data
    public final long
        vkCreatePrivateDataSlotEXT,
        vkDestroyPrivateDataSlotEXT,
        vkSetPrivateDataEXT,
        vkGetPrivateDataEXT;

    // EXT_sample_locations
    public final long
        vkCmdSetSampleLocationsEXT;

    // EXT_shader_module_identifier
    public final long
        vkGetShaderModuleIdentifierEXT,
        vkGetShaderModuleCreateInfoIdentifierEXT;

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

    // KHR_dynamic_rendering
    public final long
        vkCmdBeginRenderingKHR,
        vkCmdEndRenderingKHR;

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

    // KHR_maintenance4
    public final long
        vkGetDeviceBufferMemoryRequirementsKHR,
        vkGetDeviceImageMemoryRequirementsKHR,
        vkGetDeviceImageSparseMemoryRequirementsKHR;

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

    // KHR_ray_tracing_maintenance1
    public final long
        vkCmdTraceRaysIndirect2KHR;

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

    // NV_optical_flow
    public final long
        vkCreateOpticalFlowSessionNV,
        vkDestroyOpticalFlowSessionNV,
        vkBindOpticalFlowSessionImageNV,
        vkCmdOpticalFlowExecuteNV;

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

    // QCOM_tile_properties
    public final long
        vkGetFramebufferTilePropertiesQCOM,
        vkGetDynamicRenderingTilePropertiesQCOM;

    // VALVE_descriptor_set_host_mapping
    public final long
        vkGetDescriptorSetLayoutHostMappingInfoVALVE,
        vkGetDescriptorSetHostMappingVALVE;

    /** The Vulkan API version number. */
    public final int apiVersion;

    /** When true, {@link VK10} is supported. */
    public final boolean Vulkan10;
    /** When true, {@link VK11} is supported. */
    public final boolean Vulkan11;
    /** When true, {@link VK12} is supported. */
    public final boolean Vulkan12;
    /** When true, {@link VK13} is supported. */
    public final boolean Vulkan13;
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
    /** When true, {@link AMDShaderEarlyAndLateFragmentTests} is supported. */
    public final boolean VK_AMD_shader_early_and_late_fragment_tests;
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
    /** When true, {@link ARMRasterizationOrderAttachmentAccess} is supported. */
    public final boolean VK_ARM_rasterization_order_attachment_access;
    /** When true, {@link EXT4444Formats} is supported. */
    public final boolean VK_EXT_4444_formats;
    /** When true, {@link EXTAstcDecodeMode} is supported. */
    public final boolean VK_EXT_astc_decode_mode;
    /** When true, {@link EXTAttachmentFeedbackLoopLayout} is supported. */
    public final boolean VK_EXT_attachment_feedback_loop_layout;
    /** When true, {@link EXTBlendOperationAdvanced} is supported. */
    public final boolean VK_EXT_blend_operation_advanced;
    /** When true, {@link EXTBorderColorSwizzle} is supported. */
    public final boolean VK_EXT_border_color_swizzle;
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
    /** When true, {@link EXTDepthClampZeroOne} is supported. */
    public final boolean VK_EXT_depth_clamp_zero_one;
    /** When true, {@link EXTDepthClipControl} is supported. */
    public final boolean VK_EXT_depth_clip_control;
    /** When true, {@link EXTDepthClipEnable} is supported. */
    public final boolean VK_EXT_depth_clip_enable;
    /** When true, {@link EXTDepthRangeUnrestricted} is supported. */
    public final boolean VK_EXT_depth_range_unrestricted;
    /** When true, {@link EXTDescriptorIndexing} is supported. */
    public final boolean VK_EXT_descriptor_indexing;
    /** When true, {@link EXTDeviceAddressBindingReport} is supported. */
    public final boolean VK_EXT_device_address_binding_report;
    /** When true, {@link EXTDeviceFault} is supported. */
    public final boolean VK_EXT_device_fault;
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
    /** When true, {@link EXTExtendedDynamicState3} is supported. */
    public final boolean VK_EXT_extended_dynamic_state3;
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
    /** When true, {@link EXTGraphicsPipelineLibrary} is supported. */
    public final boolean VK_EXT_graphics_pipeline_library;
    /** When true, {@link EXTHdrMetadata} is supported. */
    public final boolean VK_EXT_hdr_metadata;
    /** When true, {@link EXTHostQueryReset} is supported. */
    public final boolean VK_EXT_host_query_reset;
    /** When true, {@link EXTImage2dViewOf3d} is supported. */
    public final boolean VK_EXT_image_2d_view_of_3d;
    /** When true, {@link EXTImageCompressionControl} is supported. */
    public final boolean VK_EXT_image_compression_control;
    /** When true, {@link EXTImageCompressionControlSwapchain} is supported. */
    public final boolean VK_EXT_image_compression_control_swapchain;
    /** When true, {@link EXTImageDrmFormatModifier} is supported. */
    public final boolean VK_EXT_image_drm_format_modifier;
    /** When true, {@link EXTImageRobustness} is supported. */
    public final boolean VK_EXT_image_robustness;
    /** When true, {@link EXTImageViewMinLod} is supported. */
    public final boolean VK_EXT_image_view_min_lod;
    /** When true, {@link EXTIndexTypeUint8} is supported. */
    public final boolean VK_EXT_index_type_uint8;
    /** When true, {@link EXTInlineUniformBlock} is supported. */
    public final boolean VK_EXT_inline_uniform_block;
    /** When true, {@link EXTLegacyDithering} is supported. */
    public final boolean VK_EXT_legacy_dithering;
    /** When true, {@link EXTLineRasterization} is supported. */
    public final boolean VK_EXT_line_rasterization;
    /** When true, {@link EXTLoadStoreOpNone} is supported. */
    public final boolean VK_EXT_load_store_op_none;
    /** When true, {@link EXTMemoryBudget} is supported. */
    public final boolean VK_EXT_memory_budget;
    /** When true, {@link EXTMemoryPriority} is supported. */
    public final boolean VK_EXT_memory_priority;
    /** When true, {@link EXTMeshShader} is supported. */
    public final boolean VK_EXT_mesh_shader;
    /** When true, {@link EXTMetalObjects} is supported. */
    public final boolean VK_EXT_metal_objects;
    /** When true, {@link EXTMultiDraw} is supported. */
    public final boolean VK_EXT_multi_draw;
    /** When true, {@link EXTMultisampledRenderToSingleSampled} is supported. */
    public final boolean VK_EXT_multisampled_render_to_single_sampled;
    /** When true, {@link EXTMutableDescriptorType} is supported. */
    public final boolean VK_EXT_mutable_descriptor_type;
    /** When true, {@link EXTNonSeamlessCubeMap} is supported. */
    public final boolean VK_EXT_non_seamless_cube_map;
    /** When true, {@link EXTOpacityMicromap} is supported. */
    public final boolean VK_EXT_opacity_micromap;
    /** When true, {@link EXTPageableDeviceLocalMemory} is supported. */
    public final boolean VK_EXT_pageable_device_local_memory;
    /** When true, {@link EXTPciBusInfo} is supported. */
    public final boolean VK_EXT_pci_bus_info;
    /** When true, {@link EXTPhysicalDeviceDrm} is supported. */
    public final boolean VK_EXT_physical_device_drm;
    /** When true, {@link EXTPipelineCreationCacheControl} is supported. */
    public final boolean VK_EXT_pipeline_creation_cache_control;
    /** When true, {@link EXTPipelineCreationFeedback} is supported. */
    public final boolean VK_EXT_pipeline_creation_feedback;
    /** When true, {@link EXTPipelineProperties} is supported. */
    public final boolean VK_EXT_pipeline_properties;
    /** When true, {@link EXTPipelineProtectedAccess} is supported. */
    public final boolean VK_EXT_pipeline_protected_access;
    /** When true, {@link EXTPipelineRobustness} is supported. */
    public final boolean VK_EXT_pipeline_robustness;
    /** When true, {@link EXTPostDepthCoverage} is supported. */
    public final boolean VK_EXT_post_depth_coverage;
    /** When true, {@link EXTPrimitiveTopologyListRestart} is supported. */
    public final boolean VK_EXT_primitive_topology_list_restart;
    /** When true, {@link EXTPrimitivesGeneratedQuery} is supported. */
    public final boolean VK_EXT_primitives_generated_query;
    /** When true, {@link EXTPrivateData} is supported. */
    public final boolean VK_EXT_private_data;
    /** When true, {@link EXTProvokingVertex} is supported. */
    public final boolean VK_EXT_provoking_vertex;
    /** When true, {@link EXTQueueFamilyForeign} is supported. */
    public final boolean VK_EXT_queue_family_foreign;
    /** When true, {@link EXTRasterizationOrderAttachmentAccess} is supported. */
    public final boolean VK_EXT_rasterization_order_attachment_access;
    /** When true, {@link EXTRgba10x6Formats} is supported. */
    public final boolean VK_EXT_rgba10x6_formats;
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
    /** When true, {@link EXTShaderModuleIdentifier} is supported. */
    public final boolean VK_EXT_shader_module_identifier;
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
    /** When true, {@link EXTSubpassMergeFeedback} is supported. */
    public final boolean VK_EXT_subpass_merge_feedback;
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
    /** When true, {@link EXTVideoEncodeH265} is supported. */
    public final boolean VK_EXT_video_encode_h265;
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
    /** When true, {@link KHRDynamicRendering} is supported. */
    public final boolean VK_KHR_dynamic_rendering;
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
    /** When true, {@link KHRFormatFeatureFlags2} is supported. */
    public final boolean VK_KHR_format_feature_flags2;
    /** When true, {@link KHRFragmentShaderBarycentric} is supported. */
    public final boolean VK_KHR_fragment_shader_barycentric;
    /** When true, {@link KHRFragmentShadingRate} is supported. */
    public final boolean VK_KHR_fragment_shading_rate;
    /** When true, {@link KHRGetMemoryRequirements2} is supported. */
    public final boolean VK_KHR_get_memory_requirements2;
    /** When true, {@link KHRGlobalPriority} is supported. */
    public final boolean VK_KHR_global_priority;
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
    /** When true, {@link KHRMaintenance4} is supported. */
    public final boolean VK_KHR_maintenance4;
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
    /** When true, {@link KHRRayTracingMaintenance1} is supported. */
    public final boolean VK_KHR_ray_tracing_maintenance1;
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
    /** When true, {@link NVLinearColorAttachment} is supported. */
    public final boolean VK_NV_linear_color_attachment;
    /** When true, {@link NVMeshShader} is supported. */
    public final boolean VK_NV_mesh_shader;
    /** When true, {@link NVOpticalFlow} is supported. */
    public final boolean VK_NV_optical_flow;
    /** When true, {@link NVPresentBarrier} is supported. */
    public final boolean VK_NV_present_barrier;
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
    /** When true, {@link QCOMFragmentDensityMapOffset} is supported. */
    public final boolean VK_QCOM_fragment_density_map_offset;
    /** When true, {@link QCOMImageProcessing} is supported. */
    public final boolean VK_QCOM_image_processing;
    /** When true, {@link QCOMRenderPassShaderResolve} is supported. */
    public final boolean VK_QCOM_render_pass_shader_resolve;
    /** When true, {@link QCOMRenderPassStoreOps} is supported. */
    public final boolean VK_QCOM_render_pass_store_ops;
    /** When true, {@link QCOMRenderPassTransform} is supported. */
    public final boolean VK_QCOM_render_pass_transform;
    /** When true, {@link QCOMRotatedCopyCommands} is supported. */
    public final boolean VK_QCOM_rotated_copy_commands;
    /** When true, {@link QCOMTileProperties} is supported. */
    public final boolean VK_QCOM_tile_properties;
    /** When true, {@link SECAmigoProfiling} is supported. */
    public final boolean VK_SEC_amigo_profiling;
    /** When true, {@code STD_vulkan_video_codec_h264} is supported. */
    public final boolean STD_vulkan_video_codec_h264;
    /** When true, {@code STD_vulkan_video_codec_h265} is supported. */
    public final boolean STD_vulkan_video_codec_h265;
    /** When true, {@link VALVEDescriptorSetHostMapping} is supported. */
    public final boolean VK_VALVE_descriptor_set_host_mapping;
    /** When true, {@link VALVEMutableDescriptorType} is supported. */
    public final boolean VK_VALVE_mutable_descriptor_type;

    VKCapabilitiesDevice(FunctionProvider provider, VKCapabilitiesInstance capsInstance, int apiVersion, Set<String> ext) {
        this.apiVersion = apiVersion;

        long[] caps = new long[482];

        Vulkan10 = check_VK10(provider, caps, ext);
        Vulkan11 = check_VK11(provider, caps, ext);
        Vulkan12 = check_VK12(provider, caps, ext);
        Vulkan13 = check_VK13(provider, caps, ext);
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
        VK_AMD_shader_early_and_late_fragment_tests = ext.contains("VK_AMD_shader_early_and_late_fragment_tests");
        VK_AMD_shader_explicit_vertex_parameter = ext.contains("VK_AMD_shader_explicit_vertex_parameter");
        VK_AMD_shader_fragment_mask = ext.contains("VK_AMD_shader_fragment_mask");
        VK_AMD_shader_image_load_store_lod = ext.contains("VK_AMD_shader_image_load_store_lod");
        VK_AMD_shader_info = check_AMD_shader_info(provider, caps, ext);
        VK_AMD_shader_trinary_minmax = ext.contains("VK_AMD_shader_trinary_minmax");
        VK_AMD_texture_gather_bias_lod = ext.contains("VK_AMD_texture_gather_bias_lod");
        VK_ARM_rasterization_order_attachment_access = ext.contains("VK_ARM_rasterization_order_attachment_access");
        VK_EXT_4444_formats = ext.contains("VK_EXT_4444_formats");
        VK_EXT_astc_decode_mode = ext.contains("VK_EXT_astc_decode_mode");
        VK_EXT_attachment_feedback_loop_layout = ext.contains("VK_EXT_attachment_feedback_loop_layout");
        VK_EXT_blend_operation_advanced = ext.contains("VK_EXT_blend_operation_advanced");
        VK_EXT_border_color_swizzle = ext.contains("VK_EXT_border_color_swizzle");
        VK_EXT_buffer_device_address = check_EXT_buffer_device_address(provider, caps, ext);
        VK_EXT_calibrated_timestamps = check_EXT_calibrated_timestamps(provider, caps, ext);
        VK_EXT_color_write_enable = check_EXT_color_write_enable(provider, caps, ext);
        VK_EXT_conditional_rendering = check_EXT_conditional_rendering(provider, caps, ext);
        VK_EXT_conservative_rasterization = ext.contains("VK_EXT_conservative_rasterization");
        VK_EXT_custom_border_color = ext.contains("VK_EXT_custom_border_color");
        VK_EXT_debug_marker = check_EXT_debug_marker(provider, caps, ext);
        VK_EXT_depth_clamp_zero_one = ext.contains("VK_EXT_depth_clamp_zero_one");
        VK_EXT_depth_clip_control = ext.contains("VK_EXT_depth_clip_control");
        VK_EXT_depth_clip_enable = ext.contains("VK_EXT_depth_clip_enable");
        VK_EXT_depth_range_unrestricted = ext.contains("VK_EXT_depth_range_unrestricted");
        VK_EXT_descriptor_indexing = ext.contains("VK_EXT_descriptor_indexing");
        VK_EXT_device_address_binding_report = ext.contains("VK_EXT_device_address_binding_report");
        VK_EXT_device_fault = check_EXT_device_fault(provider, caps, ext);
        VK_EXT_device_memory_report = ext.contains("VK_EXT_device_memory_report");
        VK_EXT_discard_rectangles = check_EXT_discard_rectangles(provider, caps, ext);
        VK_EXT_display_control = check_EXT_display_control(provider, caps, ext);
        VK_EXT_extended_dynamic_state = check_EXT_extended_dynamic_state(provider, caps, ext);
        VK_EXT_extended_dynamic_state2 = check_EXT_extended_dynamic_state2(provider, caps, ext);
        VK_EXT_extended_dynamic_state3 = check_EXT_extended_dynamic_state3(provider, caps, ext);
        VK_EXT_external_memory_dma_buf = ext.contains("VK_EXT_external_memory_dma_buf");
        VK_EXT_external_memory_host = check_EXT_external_memory_host(provider, caps, ext);
        VK_EXT_filter_cubic = ext.contains("VK_EXT_filter_cubic");
        VK_EXT_fragment_density_map = ext.contains("VK_EXT_fragment_density_map");
        VK_EXT_fragment_density_map2 = ext.contains("VK_EXT_fragment_density_map2");
        VK_EXT_fragment_shader_interlock = ext.contains("VK_EXT_fragment_shader_interlock");
        VK_EXT_full_screen_exclusive = check_EXT_full_screen_exclusive(provider, caps, ext);
        VK_EXT_global_priority = ext.contains("VK_EXT_global_priority");
        VK_EXT_global_priority_query = ext.contains("VK_EXT_global_priority_query");
        VK_EXT_graphics_pipeline_library = ext.contains("VK_EXT_graphics_pipeline_library");
        VK_EXT_hdr_metadata = check_EXT_hdr_metadata(provider, caps, ext);
        VK_EXT_host_query_reset = check_EXT_host_query_reset(provider, caps, ext);
        VK_EXT_image_2d_view_of_3d = ext.contains("VK_EXT_image_2d_view_of_3d");
        VK_EXT_image_compression_control = check_EXT_image_compression_control(provider, caps, ext);
        VK_EXT_image_compression_control_swapchain = ext.contains("VK_EXT_image_compression_control_swapchain");
        VK_EXT_image_drm_format_modifier = check_EXT_image_drm_format_modifier(provider, caps, ext);
        VK_EXT_image_robustness = ext.contains("VK_EXT_image_robustness");
        VK_EXT_image_view_min_lod = ext.contains("VK_EXT_image_view_min_lod");
        VK_EXT_index_type_uint8 = ext.contains("VK_EXT_index_type_uint8");
        VK_EXT_inline_uniform_block = ext.contains("VK_EXT_inline_uniform_block");
        VK_EXT_legacy_dithering = ext.contains("VK_EXT_legacy_dithering");
        VK_EXT_line_rasterization = check_EXT_line_rasterization(provider, caps, ext);
        VK_EXT_load_store_op_none = ext.contains("VK_EXT_load_store_op_none");
        VK_EXT_memory_budget = ext.contains("VK_EXT_memory_budget");
        VK_EXT_memory_priority = ext.contains("VK_EXT_memory_priority");
        VK_EXT_mesh_shader = check_EXT_mesh_shader(provider, caps, ext);
        VK_EXT_metal_objects = check_EXT_metal_objects(provider, caps, ext);
        VK_EXT_multi_draw = check_EXT_multi_draw(provider, caps, ext);
        VK_EXT_multisampled_render_to_single_sampled = ext.contains("VK_EXT_multisampled_render_to_single_sampled");
        VK_EXT_mutable_descriptor_type = ext.contains("VK_EXT_mutable_descriptor_type");
        VK_EXT_non_seamless_cube_map = ext.contains("VK_EXT_non_seamless_cube_map");
        VK_EXT_opacity_micromap = check_EXT_opacity_micromap(provider, caps, ext);
        VK_EXT_pageable_device_local_memory = check_EXT_pageable_device_local_memory(provider, caps, ext);
        VK_EXT_pci_bus_info = ext.contains("VK_EXT_pci_bus_info");
        VK_EXT_physical_device_drm = ext.contains("VK_EXT_physical_device_drm");
        VK_EXT_pipeline_creation_cache_control = ext.contains("VK_EXT_pipeline_creation_cache_control");
        VK_EXT_pipeline_creation_feedback = ext.contains("VK_EXT_pipeline_creation_feedback");
        VK_EXT_pipeline_properties = check_EXT_pipeline_properties(provider, caps, ext);
        VK_EXT_pipeline_protected_access = ext.contains("VK_EXT_pipeline_protected_access");
        VK_EXT_pipeline_robustness = ext.contains("VK_EXT_pipeline_robustness");
        VK_EXT_post_depth_coverage = ext.contains("VK_EXT_post_depth_coverage");
        VK_EXT_primitive_topology_list_restart = ext.contains("VK_EXT_primitive_topology_list_restart");
        VK_EXT_primitives_generated_query = ext.contains("VK_EXT_primitives_generated_query");
        VK_EXT_private_data = check_EXT_private_data(provider, caps, ext);
        VK_EXT_provoking_vertex = ext.contains("VK_EXT_provoking_vertex");
        VK_EXT_queue_family_foreign = ext.contains("VK_EXT_queue_family_foreign");
        VK_EXT_rasterization_order_attachment_access = ext.contains("VK_EXT_rasterization_order_attachment_access");
        VK_EXT_rgba10x6_formats = ext.contains("VK_EXT_rgba10x6_formats");
        VK_EXT_robustness2 = ext.contains("VK_EXT_robustness2");
        VK_EXT_sample_locations = check_EXT_sample_locations(provider, caps, ext);
        VK_EXT_sampler_filter_minmax = ext.contains("VK_EXT_sampler_filter_minmax");
        VK_EXT_scalar_block_layout = ext.contains("VK_EXT_scalar_block_layout");
        VK_EXT_separate_stencil_usage = ext.contains("VK_EXT_separate_stencil_usage");
        VK_EXT_shader_atomic_float = ext.contains("VK_EXT_shader_atomic_float");
        VK_EXT_shader_atomic_float2 = ext.contains("VK_EXT_shader_atomic_float2");
        VK_EXT_shader_demote_to_helper_invocation = ext.contains("VK_EXT_shader_demote_to_helper_invocation");
        VK_EXT_shader_image_atomic_int64 = ext.contains("VK_EXT_shader_image_atomic_int64");
        VK_EXT_shader_module_identifier = check_EXT_shader_module_identifier(provider, caps, ext);
        VK_EXT_shader_stencil_export = ext.contains("VK_EXT_shader_stencil_export");
        VK_EXT_shader_subgroup_ballot = ext.contains("VK_EXT_shader_subgroup_ballot");
        VK_EXT_shader_subgroup_vote = ext.contains("VK_EXT_shader_subgroup_vote");
        VK_EXT_shader_viewport_index_layer = ext.contains("VK_EXT_shader_viewport_index_layer");
        VK_EXT_subgroup_size_control = ext.contains("VK_EXT_subgroup_size_control");
        VK_EXT_subpass_merge_feedback = ext.contains("VK_EXT_subpass_merge_feedback");
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
        VK_EXT_video_encode_h265 = ext.contains("VK_EXT_video_encode_h265");
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
        VK_KHR_dynamic_rendering = check_KHR_dynamic_rendering(provider, caps, ext);
        VK_KHR_external_fence = ext.contains("VK_KHR_external_fence");
        VK_KHR_external_fence_fd = check_KHR_external_fence_fd(provider, caps, ext);
        VK_KHR_external_fence_win32 = check_KHR_external_fence_win32(provider, caps, ext);
        VK_KHR_external_memory = ext.contains("VK_KHR_external_memory");
        VK_KHR_external_memory_fd = check_KHR_external_memory_fd(provider, caps, ext);
        VK_KHR_external_memory_win32 = check_KHR_external_memory_win32(provider, caps, ext);
        VK_KHR_external_semaphore = ext.contains("VK_KHR_external_semaphore");
        VK_KHR_external_semaphore_fd = check_KHR_external_semaphore_fd(provider, caps, ext);
        VK_KHR_external_semaphore_win32 = check_KHR_external_semaphore_win32(provider, caps, ext);
        VK_KHR_format_feature_flags2 = ext.contains("VK_KHR_format_feature_flags2");
        VK_KHR_fragment_shader_barycentric = ext.contains("VK_KHR_fragment_shader_barycentric");
        VK_KHR_fragment_shading_rate = check_KHR_fragment_shading_rate(provider, caps, ext);
        VK_KHR_get_memory_requirements2 = check_KHR_get_memory_requirements2(provider, caps, ext);
        VK_KHR_global_priority = ext.contains("VK_KHR_global_priority");
        VK_KHR_image_format_list = ext.contains("VK_KHR_image_format_list");
        VK_KHR_imageless_framebuffer = ext.contains("VK_KHR_imageless_framebuffer");
        VK_KHR_incremental_present = ext.contains("VK_KHR_incremental_present");
        VK_KHR_maintenance1 = check_KHR_maintenance1(provider, caps, ext);
        VK_KHR_maintenance2 = ext.contains("VK_KHR_maintenance2");
        VK_KHR_maintenance3 = check_KHR_maintenance3(provider, caps, ext);
        VK_KHR_maintenance4 = check_KHR_maintenance4(provider, caps, ext);
        VK_KHR_multiview = ext.contains("VK_KHR_multiview");
        VK_KHR_performance_query = check_KHR_performance_query(provider, caps, ext);
        VK_KHR_pipeline_executable_properties = check_KHR_pipeline_executable_properties(provider, caps, ext);
        VK_KHR_pipeline_library = ext.contains("VK_KHR_pipeline_library");
        VK_KHR_portability_subset = ext.contains("VK_KHR_portability_subset");
        VK_KHR_present_id = ext.contains("VK_KHR_present_id");
        VK_KHR_present_wait = check_KHR_present_wait(provider, caps, ext);
        VK_KHR_push_descriptor = check_KHR_push_descriptor(provider, caps, ext);
        VK_KHR_ray_query = ext.contains("VK_KHR_ray_query");
        VK_KHR_ray_tracing_maintenance1 = check_KHR_ray_tracing_maintenance1(provider, caps, ext);
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
        VK_NV_linear_color_attachment = ext.contains("VK_NV_linear_color_attachment");
        VK_NV_mesh_shader = check_NV_mesh_shader(provider, caps, ext);
        VK_NV_optical_flow = check_NV_optical_flow(provider, caps, ext);
        VK_NV_present_barrier = ext.contains("VK_NV_present_barrier");
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
        VK_QCOM_fragment_density_map_offset = ext.contains("VK_QCOM_fragment_density_map_offset");
        VK_QCOM_image_processing = ext.contains("VK_QCOM_image_processing");
        VK_QCOM_render_pass_shader_resolve = ext.contains("VK_QCOM_render_pass_shader_resolve");
        VK_QCOM_render_pass_store_ops = ext.contains("VK_QCOM_render_pass_store_ops");
        VK_QCOM_render_pass_transform = ext.contains("VK_QCOM_render_pass_transform");
        VK_QCOM_rotated_copy_commands = ext.contains("VK_QCOM_rotated_copy_commands");
        VK_QCOM_tile_properties = check_QCOM_tile_properties(provider, caps, ext);
        VK_SEC_amigo_profiling = ext.contains("VK_SEC_amigo_profiling");
        STD_vulkan_video_codec_h264 = ext.contains("STD_vulkan_video_codec_h264");
        STD_vulkan_video_codec_h265 = ext.contains("STD_vulkan_video_codec_h265");
        VK_VALVE_descriptor_set_host_mapping = check_VALVE_descriptor_set_host_mapping(provider, caps, ext);
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
        vkCreatePrivateDataSlot = caps[150];
        vkDestroyPrivateDataSlot = caps[151];
        vkSetPrivateData = caps[152];
        vkGetPrivateData = caps[153];
        vkCmdSetEvent2 = caps[154];
        vkCmdResetEvent2 = caps[155];
        vkCmdWaitEvents2 = caps[156];
        vkCmdPipelineBarrier2 = caps[157];
        vkCmdWriteTimestamp2 = caps[158];
        vkQueueSubmit2 = caps[159];
        vkCmdCopyBuffer2 = caps[160];
        vkCmdCopyImage2 = caps[161];
        vkCmdCopyBufferToImage2 = caps[162];
        vkCmdCopyImageToBuffer2 = caps[163];
        vkCmdBlitImage2 = caps[164];
        vkCmdResolveImage2 = caps[165];
        vkCmdBeginRendering = caps[166];
        vkCmdEndRendering = caps[167];
        vkCmdSetCullMode = caps[168];
        vkCmdSetFrontFace = caps[169];
        vkCmdSetPrimitiveTopology = caps[170];
        vkCmdSetViewportWithCount = caps[171];
        vkCmdSetScissorWithCount = caps[172];
        vkCmdBindVertexBuffers2 = caps[173];
        vkCmdSetDepthTestEnable = caps[174];
        vkCmdSetDepthWriteEnable = caps[175];
        vkCmdSetDepthCompareOp = caps[176];
        vkCmdSetDepthBoundsTestEnable = caps[177];
        vkCmdSetStencilTestEnable = caps[178];
        vkCmdSetStencilOp = caps[179];
        vkCmdSetRasterizerDiscardEnable = caps[180];
        vkCmdSetDepthBiasEnable = caps[181];
        vkCmdSetPrimitiveRestartEnable = caps[182];
        vkGetDeviceBufferMemoryRequirements = caps[183];
        vkGetDeviceImageMemoryRequirements = caps[184];
        vkGetDeviceImageSparseMemoryRequirements = caps[185];
        vkCmdWriteBufferMarkerAMD = caps[186];
        vkSetLocalDimmingAMD = caps[187];
        vkCmdDrawIndirectCountAMD = caps[188];
        vkCmdDrawIndexedIndirectCountAMD = caps[189];
        vkGetShaderInfoAMD = caps[190];
        vkGetBufferDeviceAddressEXT = caps[191];
        vkGetCalibratedTimestampsEXT = caps[192];
        vkCmdSetColorWriteEnableEXT = caps[193];
        vkCmdBeginConditionalRenderingEXT = caps[194];
        vkCmdEndConditionalRenderingEXT = caps[195];
        vkDebugMarkerSetObjectTagEXT = caps[196];
        vkDebugMarkerSetObjectNameEXT = caps[197];
        vkCmdDebugMarkerBeginEXT = caps[198];
        vkCmdDebugMarkerEndEXT = caps[199];
        vkCmdDebugMarkerInsertEXT = caps[200];
        vkGetDeviceFaultInfoEXT = caps[201];
        vkCmdSetDiscardRectangleEXT = caps[202];
        vkDisplayPowerControlEXT = caps[203];
        vkRegisterDeviceEventEXT = caps[204];
        vkRegisterDisplayEventEXT = caps[205];
        vkGetSwapchainCounterEXT = caps[206];
        vkCmdSetCullModeEXT = caps[207];
        vkCmdSetFrontFaceEXT = caps[208];
        vkCmdSetPrimitiveTopologyEXT = caps[209];
        vkCmdSetViewportWithCountEXT = caps[210];
        vkCmdSetScissorWithCountEXT = caps[211];
        vkCmdBindVertexBuffers2EXT = caps[212];
        vkCmdSetDepthTestEnableEXT = caps[213];
        vkCmdSetDepthWriteEnableEXT = caps[214];
        vkCmdSetDepthCompareOpEXT = caps[215];
        vkCmdSetDepthBoundsTestEnableEXT = caps[216];
        vkCmdSetStencilTestEnableEXT = caps[217];
        vkCmdSetStencilOpEXT = caps[218];
        vkCmdSetPatchControlPointsEXT = caps[219];
        vkCmdSetRasterizerDiscardEnableEXT = caps[220];
        vkCmdSetDepthBiasEnableEXT = caps[221];
        vkCmdSetLogicOpEXT = caps[222];
        vkCmdSetPrimitiveRestartEnableEXT = caps[223];
        vkCmdSetTessellationDomainOriginEXT = caps[224];
        vkCmdSetDepthClampEnableEXT = caps[225];
        vkCmdSetPolygonModeEXT = caps[226];
        vkCmdSetRasterizationSamplesEXT = caps[227];
        vkCmdSetSampleMaskEXT = caps[228];
        vkCmdSetAlphaToCoverageEnableEXT = caps[229];
        vkCmdSetAlphaToOneEnableEXT = caps[230];
        vkCmdSetLogicOpEnableEXT = caps[231];
        vkCmdSetColorBlendEnableEXT = caps[232];
        vkCmdSetColorBlendEquationEXT = caps[233];
        vkCmdSetColorWriteMaskEXT = caps[234];
        vkCmdSetRasterizationStreamEXT = caps[235];
        vkCmdSetConservativeRasterizationModeEXT = caps[236];
        vkCmdSetExtraPrimitiveOverestimationSizeEXT = caps[237];
        vkCmdSetDepthClipEnableEXT = caps[238];
        vkCmdSetSampleLocationsEnableEXT = caps[239];
        vkCmdSetColorBlendAdvancedEXT = caps[240];
        vkCmdSetProvokingVertexModeEXT = caps[241];
        vkCmdSetLineRasterizationModeEXT = caps[242];
        vkCmdSetLineStippleEnableEXT = caps[243];
        vkCmdSetDepthClipNegativeOneToOneEXT = caps[244];
        vkCmdSetViewportWScalingEnableNV = caps[245];
        vkCmdSetViewportSwizzleNV = caps[246];
        vkCmdSetCoverageToColorEnableNV = caps[247];
        vkCmdSetCoverageToColorLocationNV = caps[248];
        vkCmdSetCoverageModulationModeNV = caps[249];
        vkCmdSetCoverageModulationTableEnableNV = caps[250];
        vkCmdSetCoverageModulationTableNV = caps[251];
        vkCmdSetShadingRateImageEnableNV = caps[252];
        vkCmdSetRepresentativeFragmentTestEnableNV = caps[253];
        vkCmdSetCoverageReductionModeNV = caps[254];
        vkGetMemoryHostPointerPropertiesEXT = caps[255];
        vkAcquireFullScreenExclusiveModeEXT = caps[256];
        vkReleaseFullScreenExclusiveModeEXT = caps[257];
        vkGetDeviceGroupSurfacePresentModes2EXT = caps[258];
        vkSetHdrMetadataEXT = caps[259];
        vkResetQueryPoolEXT = caps[260];
        vkGetImageSubresourceLayout2EXT = caps[261];
        vkGetImageDrmFormatModifierPropertiesEXT = caps[262];
        vkCmdSetLineStippleEXT = caps[263];
        vkCmdDrawMeshTasksEXT = caps[264];
        vkCmdDrawMeshTasksIndirectEXT = caps[265];
        vkCmdDrawMeshTasksIndirectCountEXT = caps[266];
        vkExportMetalObjectsEXT = caps[267];
        vkCmdDrawMultiEXT = caps[268];
        vkCmdDrawMultiIndexedEXT = caps[269];
        vkCreateMicromapEXT = caps[270];
        vkDestroyMicromapEXT = caps[271];
        vkCmdBuildMicromapsEXT = caps[272];
        vkBuildMicromapsEXT = caps[273];
        vkCopyMicromapEXT = caps[274];
        vkCopyMicromapToMemoryEXT = caps[275];
        vkCopyMemoryToMicromapEXT = caps[276];
        vkWriteMicromapsPropertiesEXT = caps[277];
        vkCmdCopyMicromapEXT = caps[278];
        vkCmdCopyMicromapToMemoryEXT = caps[279];
        vkCmdCopyMemoryToMicromapEXT = caps[280];
        vkCmdWriteMicromapsPropertiesEXT = caps[281];
        vkGetDeviceMicromapCompatibilityEXT = caps[282];
        vkGetMicromapBuildSizesEXT = caps[283];
        vkSetDeviceMemoryPriorityEXT = caps[284];
        vkGetPipelinePropertiesEXT = caps[285];
        vkCreatePrivateDataSlotEXT = caps[286];
        vkDestroyPrivateDataSlotEXT = caps[287];
        vkSetPrivateDataEXT = caps[288];
        vkGetPrivateDataEXT = caps[289];
        vkCmdSetSampleLocationsEXT = caps[290];
        vkGetShaderModuleIdentifierEXT = caps[291];
        vkGetShaderModuleCreateInfoIdentifierEXT = caps[292];
        vkCmdBindTransformFeedbackBuffersEXT = caps[293];
        vkCmdBeginTransformFeedbackEXT = caps[294];
        vkCmdEndTransformFeedbackEXT = caps[295];
        vkCmdBeginQueryIndexedEXT = caps[296];
        vkCmdEndQueryIndexedEXT = caps[297];
        vkCmdDrawIndirectByteCountEXT = caps[298];
        vkCreateValidationCacheEXT = caps[299];
        vkDestroyValidationCacheEXT = caps[300];
        vkMergeValidationCachesEXT = caps[301];
        vkGetValidationCacheDataEXT = caps[302];
        vkCmdSetVertexInputEXT = caps[303];
        vkGetRefreshCycleDurationGOOGLE = caps[304];
        vkGetPastPresentationTimingGOOGLE = caps[305];
        vkCmdBindInvocationMaskHUAWEI = caps[306];
        vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = caps[307];
        vkCmdSubpassShadingHUAWEI = caps[308];
        vkInitializePerformanceApiINTEL = caps[309];
        vkUninitializePerformanceApiINTEL = caps[310];
        vkCmdSetPerformanceMarkerINTEL = caps[311];
        vkCmdSetPerformanceStreamMarkerINTEL = caps[312];
        vkCmdSetPerformanceOverrideINTEL = caps[313];
        vkAcquirePerformanceConfigurationINTEL = caps[314];
        vkReleasePerformanceConfigurationINTEL = caps[315];
        vkQueueSetPerformanceConfigurationINTEL = caps[316];
        vkGetPerformanceParameterINTEL = caps[317];
        vkCreateAccelerationStructureKHR = caps[318];
        vkDestroyAccelerationStructureKHR = caps[319];
        vkCmdBuildAccelerationStructuresKHR = caps[320];
        vkCmdBuildAccelerationStructuresIndirectKHR = caps[321];
        vkBuildAccelerationStructuresKHR = caps[322];
        vkCopyAccelerationStructureKHR = caps[323];
        vkCopyAccelerationStructureToMemoryKHR = caps[324];
        vkCopyMemoryToAccelerationStructureKHR = caps[325];
        vkWriteAccelerationStructuresPropertiesKHR = caps[326];
        vkCmdCopyAccelerationStructureKHR = caps[327];
        vkCmdCopyAccelerationStructureToMemoryKHR = caps[328];
        vkCmdCopyMemoryToAccelerationStructureKHR = caps[329];
        vkGetAccelerationStructureDeviceAddressKHR = caps[330];
        vkCmdWriteAccelerationStructuresPropertiesKHR = caps[331];
        vkGetDeviceAccelerationStructureCompatibilityKHR = caps[332];
        vkGetAccelerationStructureBuildSizesKHR = caps[333];
        vkBindBufferMemory2KHR = caps[334];
        vkBindImageMemory2KHR = caps[335];
        vkGetBufferDeviceAddressKHR = caps[336];
        vkGetBufferOpaqueCaptureAddressKHR = caps[337];
        vkGetDeviceMemoryOpaqueCaptureAddressKHR = caps[338];
        vkCmdCopyBuffer2KHR = caps[339];
        vkCmdCopyImage2KHR = caps[340];
        vkCmdCopyBufferToImage2KHR = caps[341];
        vkCmdCopyImageToBuffer2KHR = caps[342];
        vkCmdBlitImage2KHR = caps[343];
        vkCmdResolveImage2KHR = caps[344];
        vkCreateRenderPass2KHR = caps[345];
        vkCmdBeginRenderPass2KHR = caps[346];
        vkCmdNextSubpass2KHR = caps[347];
        vkCmdEndRenderPass2KHR = caps[348];
        vkCreateDeferredOperationKHR = caps[349];
        vkDestroyDeferredOperationKHR = caps[350];
        vkGetDeferredOperationMaxConcurrencyKHR = caps[351];
        vkGetDeferredOperationResultKHR = caps[352];
        vkDeferredOperationJoinKHR = caps[353];
        vkCreateDescriptorUpdateTemplateKHR = caps[354];
        vkDestroyDescriptorUpdateTemplateKHR = caps[355];
        vkUpdateDescriptorSetWithTemplateKHR = caps[356];
        vkCmdPushDescriptorSetWithTemplateKHR = caps[357];
        vkGetDeviceGroupPeerMemoryFeaturesKHR = caps[358];
        vkCmdSetDeviceMaskKHR = caps[359];
        vkCmdDispatchBaseKHR = caps[360];
        vkGetDeviceGroupPresentCapabilitiesKHR = caps[361];
        vkGetDeviceGroupSurfacePresentModesKHR = caps[362];
        vkAcquireNextImage2KHR = caps[363];
        vkCreateSharedSwapchainsKHR = caps[364];
        vkCmdDrawIndirectCountKHR = caps[365];
        vkCmdDrawIndexedIndirectCountKHR = caps[366];
        vkCmdBeginRenderingKHR = caps[367];
        vkCmdEndRenderingKHR = caps[368];
        vkImportFenceFdKHR = caps[369];
        vkGetFenceFdKHR = caps[370];
        vkImportFenceWin32HandleKHR = caps[371];
        vkGetFenceWin32HandleKHR = caps[372];
        vkGetMemoryFdKHR = caps[373];
        vkGetMemoryFdPropertiesKHR = caps[374];
        vkGetMemoryWin32HandleKHR = caps[375];
        vkGetMemoryWin32HandlePropertiesKHR = caps[376];
        vkImportSemaphoreFdKHR = caps[377];
        vkGetSemaphoreFdKHR = caps[378];
        vkImportSemaphoreWin32HandleKHR = caps[379];
        vkGetSemaphoreWin32HandleKHR = caps[380];
        vkCmdSetFragmentShadingRateKHR = caps[381];
        vkGetImageMemoryRequirements2KHR = caps[382];
        vkGetBufferMemoryRequirements2KHR = caps[383];
        vkGetImageSparseMemoryRequirements2KHR = caps[384];
        vkTrimCommandPoolKHR = caps[385];
        vkGetDescriptorSetLayoutSupportKHR = caps[386];
        vkGetDeviceBufferMemoryRequirementsKHR = caps[387];
        vkGetDeviceImageMemoryRequirementsKHR = caps[388];
        vkGetDeviceImageSparseMemoryRequirementsKHR = caps[389];
        vkAcquireProfilingLockKHR = caps[390];
        vkReleaseProfilingLockKHR = caps[391];
        vkGetPipelineExecutablePropertiesKHR = caps[392];
        vkGetPipelineExecutableStatisticsKHR = caps[393];
        vkGetPipelineExecutableInternalRepresentationsKHR = caps[394];
        vkWaitForPresentKHR = caps[395];
        vkCmdPushDescriptorSetKHR = caps[396];
        vkCmdTraceRaysIndirect2KHR = caps[397];
        vkCmdTraceRaysKHR = caps[398];
        vkCreateRayTracingPipelinesKHR = caps[399];
        vkGetRayTracingShaderGroupHandlesKHR = caps[400];
        vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = caps[401];
        vkCmdTraceRaysIndirectKHR = caps[402];
        vkGetRayTracingShaderGroupStackSizeKHR = caps[403];
        vkCmdSetRayTracingPipelineStackSizeKHR = caps[404];
        vkCreateSamplerYcbcrConversionKHR = caps[405];
        vkDestroySamplerYcbcrConversionKHR = caps[406];
        vkGetSwapchainStatusKHR = caps[407];
        vkCreateSwapchainKHR = caps[408];
        vkDestroySwapchainKHR = caps[409];
        vkGetSwapchainImagesKHR = caps[410];
        vkAcquireNextImageKHR = caps[411];
        vkQueuePresentKHR = caps[412];
        vkCmdSetEvent2KHR = caps[413];
        vkCmdResetEvent2KHR = caps[414];
        vkCmdWaitEvents2KHR = caps[415];
        vkCmdPipelineBarrier2KHR = caps[416];
        vkCmdWriteTimestamp2KHR = caps[417];
        vkQueueSubmit2KHR = caps[418];
        vkCmdWriteBufferMarker2AMD = caps[419];
        vkGetQueueCheckpointData2NV = caps[420];
        vkGetSemaphoreCounterValueKHR = caps[421];
        vkWaitSemaphoresKHR = caps[422];
        vkSignalSemaphoreKHR = caps[423];
        vkCmdDecodeVideoKHR = caps[424];
        vkCmdEncodeVideoKHR = caps[425];
        vkCreateVideoSessionKHR = caps[426];
        vkDestroyVideoSessionKHR = caps[427];
        vkGetVideoSessionMemoryRequirementsKHR = caps[428];
        vkBindVideoSessionMemoryKHR = caps[429];
        vkCreateVideoSessionParametersKHR = caps[430];
        vkUpdateVideoSessionParametersKHR = caps[431];
        vkDestroyVideoSessionParametersKHR = caps[432];
        vkCmdBeginVideoCodingKHR = caps[433];
        vkCmdEndVideoCodingKHR = caps[434];
        vkCmdControlVideoCodingKHR = caps[435];
        vkCmdSetViewportWScalingNV = caps[436];
        vkCmdSetCheckpointNV = caps[437];
        vkGetQueueCheckpointDataNV = caps[438];
        vkGetGeneratedCommandsMemoryRequirementsNV = caps[439];
        vkCmdPreprocessGeneratedCommandsNV = caps[440];
        vkCmdExecuteGeneratedCommandsNV = caps[441];
        vkCmdBindPipelineShaderGroupNV = caps[442];
        vkCreateIndirectCommandsLayoutNV = caps[443];
        vkDestroyIndirectCommandsLayoutNV = caps[444];
        vkGetMemoryRemoteAddressNV = caps[445];
        vkGetMemoryWin32HandleNV = caps[446];
        vkCmdSetFragmentShadingRateEnumNV = caps[447];
        vkCmdDrawMeshTasksNV = caps[448];
        vkCmdDrawMeshTasksIndirectNV = caps[449];
        vkCmdDrawMeshTasksIndirectCountNV = caps[450];
        vkCreateOpticalFlowSessionNV = caps[451];
        vkDestroyOpticalFlowSessionNV = caps[452];
        vkBindOpticalFlowSessionImageNV = caps[453];
        vkCmdOpticalFlowExecuteNV = caps[454];
        vkCreateAccelerationStructureNV = caps[455];
        vkDestroyAccelerationStructureNV = caps[456];
        vkGetAccelerationStructureMemoryRequirementsNV = caps[457];
        vkBindAccelerationStructureMemoryNV = caps[458];
        vkCmdBuildAccelerationStructureNV = caps[459];
        vkCmdCopyAccelerationStructureNV = caps[460];
        vkCmdTraceRaysNV = caps[461];
        vkCreateRayTracingPipelinesNV = caps[462];
        vkGetRayTracingShaderGroupHandlesNV = caps[463];
        vkGetAccelerationStructureHandleNV = caps[464];
        vkCmdWriteAccelerationStructuresPropertiesNV = caps[465];
        vkCompileDeferredNV = caps[466];
        vkCmdSetExclusiveScissorNV = caps[467];
        vkCmdBindShadingRateImageNV = caps[468];
        vkCmdSetViewportShadingRatePaletteNV = caps[469];
        vkCmdSetCoarseSampleOrderNV = caps[470];
        vkCreateCuModuleNVX = caps[471];
        vkCreateCuFunctionNVX = caps[472];
        vkDestroyCuModuleNVX = caps[473];
        vkDestroyCuFunctionNVX = caps[474];
        vkCmdCuLaunchKernelNVX = caps[475];
        vkGetImageViewHandleNVX = caps[476];
        vkGetImageViewAddressNVX = caps[477];
        vkGetFramebufferTilePropertiesQCOM = caps[478];
        vkGetDynamicRenderingTilePropertiesQCOM = caps[479];
        vkGetDescriptorSetLayoutHostMappingInfoVALVE = caps[480];
        vkGetDescriptorSetHostMappingVALVE = caps[481];
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

    private static boolean check_VK13(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan13")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 
            179, 180, 181, 182, 183, 184, 185
        },
            "vkCreatePrivateDataSlot", "vkDestroyPrivateDataSlot", "vkSetPrivateData", "vkGetPrivateData", "vkCmdSetEvent2", "vkCmdResetEvent2", 
            "vkCmdWaitEvents2", "vkCmdPipelineBarrier2", "vkCmdWriteTimestamp2", "vkQueueSubmit2", "vkCmdCopyBuffer2", "vkCmdCopyImage2", 
            "vkCmdCopyBufferToImage2", "vkCmdCopyImageToBuffer2", "vkCmdBlitImage2", "vkCmdResolveImage2", "vkCmdBeginRendering", "vkCmdEndRendering", 
            "vkCmdSetCullMode", "vkCmdSetFrontFace", "vkCmdSetPrimitiveTopology", "vkCmdSetViewportWithCount", "vkCmdSetScissorWithCount", 
            "vkCmdBindVertexBuffers2", "vkCmdSetDepthTestEnable", "vkCmdSetDepthWriteEnable", "vkCmdSetDepthCompareOp", "vkCmdSetDepthBoundsTestEnable", 
            "vkCmdSetStencilTestEnable", "vkCmdSetStencilOp", "vkCmdSetRasterizerDiscardEnable", "vkCmdSetDepthBiasEnable", "vkCmdSetPrimitiveRestartEnable", 
            "vkGetDeviceBufferMemoryRequirements", "vkGetDeviceImageMemoryRequirements", "vkGetDeviceImageSparseMemoryRequirements"
        ) || reportMissing("VK", "Vulkan13");
    }

    private static boolean check_AMD_buffer_marker(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_buffer_marker")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            186
        },
            "vkCmdWriteBufferMarkerAMD"
        ) || reportMissing("VK", "VK_AMD_buffer_marker");
    }

    private static boolean check_AMD_display_native_hdr(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_display_native_hdr")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            187
        },
            "vkSetLocalDimmingAMD"
        ) || reportMissing("VK", "VK_AMD_display_native_hdr");
    }

    private static boolean check_AMD_draw_indirect_count(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_draw_indirect_count")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            188, 189
        },
            "vkCmdDrawIndirectCountAMD", "vkCmdDrawIndexedIndirectCountAMD"
        ) || reportMissing("VK", "VK_AMD_draw_indirect_count");
    }

    private static boolean check_AMD_shader_info(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_shader_info")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            190
        },
            "vkGetShaderInfoAMD"
        ) || reportMissing("VK", "VK_AMD_shader_info");
    }

    private static boolean check_EXT_buffer_device_address(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_buffer_device_address")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            191
        },
            "vkGetBufferDeviceAddressEXT"
        ) || reportMissing("VK", "VK_EXT_buffer_device_address");
    }

    private static boolean check_EXT_calibrated_timestamps(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_calibrated_timestamps")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            192
        },
            "vkGetCalibratedTimestampsEXT"
        ) || reportMissing("VK", "VK_EXT_calibrated_timestamps");
    }

    private static boolean check_EXT_color_write_enable(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_color_write_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            193
        },
            "vkCmdSetColorWriteEnableEXT"
        ) || reportMissing("VK", "VK_EXT_color_write_enable");
    }

    private static boolean check_EXT_conditional_rendering(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_conditional_rendering")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            194, 195
        },
            "vkCmdBeginConditionalRenderingEXT", "vkCmdEndConditionalRenderingEXT"
        ) || reportMissing("VK", "VK_EXT_conditional_rendering");
    }

    private static boolean check_EXT_debug_marker(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_debug_marker")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            196, 197, 198, 199, 200
        },
            "vkDebugMarkerSetObjectTagEXT", "vkDebugMarkerSetObjectNameEXT", "vkCmdDebugMarkerBeginEXT", "vkCmdDebugMarkerEndEXT", "vkCmdDebugMarkerInsertEXT"
        ) || reportMissing("VK", "VK_EXT_debug_marker");
    }

    private static boolean check_EXT_device_fault(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_device_fault")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            201
        },
            "vkGetDeviceFaultInfoEXT"
        ) || reportMissing("VK", "VK_EXT_device_fault");
    }

    private static boolean check_EXT_discard_rectangles(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_discard_rectangles")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            202
        },
            "vkCmdSetDiscardRectangleEXT"
        ) || reportMissing("VK", "VK_EXT_discard_rectangles");
    }

    private static boolean check_EXT_display_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_display_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            203, 204, 205, 206
        },
            "vkDisplayPowerControlEXT", "vkRegisterDeviceEventEXT", "vkRegisterDisplayEventEXT", "vkGetSwapchainCounterEXT"
        ) || reportMissing("VK", "VK_EXT_display_control");
    }

    private static boolean check_EXT_extended_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_extended_dynamic_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218
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
            219, 220, 221, 222, 223
        },
            "vkCmdSetPatchControlPointsEXT", "vkCmdSetRasterizerDiscardEnableEXT", "vkCmdSetDepthBiasEnableEXT", "vkCmdSetLogicOpEXT", 
            "vkCmdSetPrimitiveRestartEnableEXT"
        ) || reportMissing("VK", "VK_EXT_extended_dynamic_state2");
    }

    private static boolean check_EXT_extended_dynamic_state3(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_extended_dynamic_state3")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 
            253, 254
        },
            "vkCmdSetTessellationDomainOriginEXT", "vkCmdSetDepthClampEnableEXT", "vkCmdSetPolygonModeEXT", "vkCmdSetRasterizationSamplesEXT", 
            "vkCmdSetSampleMaskEXT", "vkCmdSetAlphaToCoverageEnableEXT", "vkCmdSetAlphaToOneEnableEXT", "vkCmdSetLogicOpEnableEXT", 
            "vkCmdSetColorBlendEnableEXT", "vkCmdSetColorBlendEquationEXT", "vkCmdSetColorWriteMaskEXT", "vkCmdSetRasterizationStreamEXT", 
            "vkCmdSetConservativeRasterizationModeEXT", "vkCmdSetExtraPrimitiveOverestimationSizeEXT", "vkCmdSetDepthClipEnableEXT", 
            "vkCmdSetSampleLocationsEnableEXT", "vkCmdSetColorBlendAdvancedEXT", "vkCmdSetProvokingVertexModeEXT", "vkCmdSetLineRasterizationModeEXT", 
            "vkCmdSetLineStippleEnableEXT", "vkCmdSetDepthClipNegativeOneToOneEXT", "vkCmdSetViewportWScalingEnableNV", "vkCmdSetViewportSwizzleNV", 
            "vkCmdSetCoverageToColorEnableNV", "vkCmdSetCoverageToColorLocationNV", "vkCmdSetCoverageModulationModeNV", 
            "vkCmdSetCoverageModulationTableEnableNV", "vkCmdSetCoverageModulationTableNV", "vkCmdSetShadingRateImageEnableNV", 
            "vkCmdSetRepresentativeFragmentTestEnableNV", "vkCmdSetCoverageReductionModeNV"
        ) || reportMissing("VK", "VK_EXT_extended_dynamic_state3");
    }

    private static boolean check_EXT_external_memory_host(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_external_memory_host")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            255
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
            256, 257, flag0 + 258
        },
            "vkAcquireFullScreenExclusiveModeEXT", "vkReleaseFullScreenExclusiveModeEXT", "vkGetDeviceGroupSurfacePresentModes2EXT"
        ) || reportMissing("VK", "VK_EXT_full_screen_exclusive");
    }

    private static boolean check_EXT_hdr_metadata(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_hdr_metadata")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            259
        },
            "vkSetHdrMetadataEXT"
        ) || reportMissing("VK", "VK_EXT_hdr_metadata");
    }

    private static boolean check_EXT_host_query_reset(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_host_query_reset")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            260
        },
            "vkResetQueryPoolEXT"
        ) || reportMissing("VK", "VK_EXT_host_query_reset");
    }

    private static boolean check_EXT_image_compression_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_image_compression_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            261
        },
            "vkGetImageSubresourceLayout2EXT"
        ) || reportMissing("VK", "VK_EXT_image_compression_control");
    }

    private static boolean check_EXT_image_drm_format_modifier(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_image_drm_format_modifier")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            262
        },
            "vkGetImageDrmFormatModifierPropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_image_drm_format_modifier");
    }

    private static boolean check_EXT_line_rasterization(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_line_rasterization")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            263
        },
            "vkCmdSetLineStippleEXT"
        ) || reportMissing("VK", "VK_EXT_line_rasterization");
    }

    private static boolean check_EXT_mesh_shader(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_mesh_shader")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            264, 265, 266
        },
            "vkCmdDrawMeshTasksEXT", "vkCmdDrawMeshTasksIndirectEXT", "vkCmdDrawMeshTasksIndirectCountEXT"
        ) || reportMissing("VK", "VK_EXT_mesh_shader");
    }

    private static boolean check_EXT_metal_objects(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_metal_objects")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            267
        },
            "vkExportMetalObjectsEXT"
        ) || reportMissing("VK", "VK_EXT_metal_objects");
    }

    private static boolean check_EXT_multi_draw(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_multi_draw")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            268, 269
        },
            "vkCmdDrawMultiEXT", "vkCmdDrawMultiIndexedEXT"
        ) || reportMissing("VK", "VK_EXT_multi_draw");
    }

    private static boolean check_EXT_opacity_micromap(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_opacity_micromap")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283
        },
            "vkCreateMicromapEXT", "vkDestroyMicromapEXT", "vkCmdBuildMicromapsEXT", "vkBuildMicromapsEXT", "vkCopyMicromapEXT", "vkCopyMicromapToMemoryEXT", 
            "vkCopyMemoryToMicromapEXT", "vkWriteMicromapsPropertiesEXT", "vkCmdCopyMicromapEXT", "vkCmdCopyMicromapToMemoryEXT", 
            "vkCmdCopyMemoryToMicromapEXT", "vkCmdWriteMicromapsPropertiesEXT", "vkGetDeviceMicromapCompatibilityEXT", "vkGetMicromapBuildSizesEXT"
        ) || reportMissing("VK", "VK_EXT_opacity_micromap");
    }

    private static boolean check_EXT_pageable_device_local_memory(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_pageable_device_local_memory")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            284
        },
            "vkSetDeviceMemoryPriorityEXT"
        ) || reportMissing("VK", "VK_EXT_pageable_device_local_memory");
    }

    private static boolean check_EXT_pipeline_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_pipeline_properties")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            285
        },
            "vkGetPipelinePropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_pipeline_properties");
    }

    private static boolean check_EXT_private_data(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_private_data")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            286, 287, 288, 289
        },
            "vkCreatePrivateDataSlotEXT", "vkDestroyPrivateDataSlotEXT", "vkSetPrivateDataEXT", "vkGetPrivateDataEXT"
        ) || reportMissing("VK", "VK_EXT_private_data");
    }

    private static boolean check_EXT_sample_locations(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_sample_locations")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            290
        },
            "vkCmdSetSampleLocationsEXT"
        ) || reportMissing("VK", "VK_EXT_sample_locations");
    }

    private static boolean check_EXT_shader_module_identifier(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_shader_module_identifier")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            291, 292
        },
            "vkGetShaderModuleIdentifierEXT", "vkGetShaderModuleCreateInfoIdentifierEXT"
        ) || reportMissing("VK", "VK_EXT_shader_module_identifier");
    }

    private static boolean check_EXT_transform_feedback(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_transform_feedback")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            293, 294, 295, 296, 297, 298
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
            299, 300, 301, 302
        },
            "vkCreateValidationCacheEXT", "vkDestroyValidationCacheEXT", "vkMergeValidationCachesEXT", "vkGetValidationCacheDataEXT"
        ) || reportMissing("VK", "VK_EXT_validation_cache");
    }

    private static boolean check_EXT_vertex_input_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_vertex_input_dynamic_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            303
        },
            "vkCmdSetVertexInputEXT"
        ) || reportMissing("VK", "VK_EXT_vertex_input_dynamic_state");
    }

    private static boolean check_GOOGLE_display_timing(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_GOOGLE_display_timing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            304, 305
        },
            "vkGetRefreshCycleDurationGOOGLE", "vkGetPastPresentationTimingGOOGLE"
        ) || reportMissing("VK", "VK_GOOGLE_display_timing");
    }

    private static boolean check_HUAWEI_invocation_mask(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_HUAWEI_invocation_mask")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            306
        },
            "vkCmdBindInvocationMaskHUAWEI"
        ) || reportMissing("VK", "VK_HUAWEI_invocation_mask");
    }

    private static boolean check_HUAWEI_subpass_shading(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_HUAWEI_subpass_shading")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            307, 308
        },
            "vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI", "vkCmdSubpassShadingHUAWEI"
        ) || reportMissing("VK", "VK_HUAWEI_subpass_shading");
    }

    private static boolean check_INTEL_performance_query(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_INTEL_performance_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            309, 310, 311, 312, 313, 314, 315, 316, 317
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
            318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333
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
            334, 335
        },
            "vkBindBufferMemory2KHR", "vkBindImageMemory2KHR"
        ) || reportMissing("VK", "VK_KHR_bind_memory2");
    }

    private static boolean check_KHR_buffer_device_address(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_buffer_device_address")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            336, 337, 338
        },
            "vkGetBufferDeviceAddressKHR", "vkGetBufferOpaqueCaptureAddressKHR", "vkGetDeviceMemoryOpaqueCaptureAddressKHR"
        ) || reportMissing("VK", "VK_KHR_buffer_device_address");
    }

    private static boolean check_KHR_copy_commands2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_copy_commands2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            339, 340, 341, 342, 343, 344
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
            345, 346, 347, 348
        },
            "vkCreateRenderPass2KHR", "vkCmdBeginRenderPass2KHR", "vkCmdNextSubpass2KHR", "vkCmdEndRenderPass2KHR"
        ) || reportMissing("VK", "VK_KHR_create_renderpass2");
    }

    private static boolean check_KHR_deferred_host_operations(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_deferred_host_operations")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            349, 350, 351, 352, 353
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
            354, 355, 356, flag0 + 357
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
            358, 359, 360, flag0 + 361, flag0 + 362, flag2 + 363
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
            364
        },
            "vkCreateSharedSwapchainsKHR"
        ) || reportMissing("VK", "VK_KHR_display_swapchain");
    }

    private static boolean check_KHR_draw_indirect_count(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_draw_indirect_count")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            365, 366
        },
            "vkCmdDrawIndirectCountKHR", "vkCmdDrawIndexedIndirectCountKHR"
        ) || reportMissing("VK", "VK_KHR_draw_indirect_count");
    }

    private static boolean check_KHR_dynamic_rendering(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_dynamic_rendering")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            367, 368
        },
            "vkCmdBeginRenderingKHR", "vkCmdEndRenderingKHR"
        ) || reportMissing("VK", "VK_KHR_dynamic_rendering");
    }

    private static boolean check_KHR_external_fence_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_fence_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            369, 370
        },
            "vkImportFenceFdKHR", "vkGetFenceFdKHR"
        ) || reportMissing("VK", "VK_KHR_external_fence_fd");
    }

    private static boolean check_KHR_external_fence_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_fence_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            371, 372
        },
            "vkImportFenceWin32HandleKHR", "vkGetFenceWin32HandleKHR"
        ) || reportMissing("VK", "VK_KHR_external_fence_win32");
    }

    private static boolean check_KHR_external_memory_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_memory_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            373, 374
        },
            "vkGetMemoryFdKHR", "vkGetMemoryFdPropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_memory_fd");
    }

    private static boolean check_KHR_external_memory_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_memory_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            375, 376
        },
            "vkGetMemoryWin32HandleKHR", "vkGetMemoryWin32HandlePropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_memory_win32");
    }

    private static boolean check_KHR_external_semaphore_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_semaphore_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            377, 378
        },
            "vkImportSemaphoreFdKHR", "vkGetSemaphoreFdKHR"
        ) || reportMissing("VK", "VK_KHR_external_semaphore_fd");
    }

    private static boolean check_KHR_external_semaphore_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_semaphore_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            379, 380
        },
            "vkImportSemaphoreWin32HandleKHR", "vkGetSemaphoreWin32HandleKHR"
        ) || reportMissing("VK", "VK_KHR_external_semaphore_win32");
    }

    private static boolean check_KHR_fragment_shading_rate(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_fragment_shading_rate")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            381
        },
            "vkCmdSetFragmentShadingRateKHR"
        ) || reportMissing("VK", "VK_KHR_fragment_shading_rate");
    }

    private static boolean check_KHR_get_memory_requirements2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_get_memory_requirements2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            382, 383, 384
        },
            "vkGetImageMemoryRequirements2KHR", "vkGetBufferMemoryRequirements2KHR", "vkGetImageSparseMemoryRequirements2KHR"
        ) || reportMissing("VK", "VK_KHR_get_memory_requirements2");
    }

    private static boolean check_KHR_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance1")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            385
        },
            "vkTrimCommandPoolKHR"
        ) || reportMissing("VK", "VK_KHR_maintenance1");
    }

    private static boolean check_KHR_maintenance3(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance3")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            386
        },
            "vkGetDescriptorSetLayoutSupportKHR"
        ) || reportMissing("VK", "VK_KHR_maintenance3");
    }

    private static boolean check_KHR_maintenance4(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance4")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            387, 388, 389
        },
            "vkGetDeviceBufferMemoryRequirementsKHR", "vkGetDeviceImageMemoryRequirementsKHR", "vkGetDeviceImageSparseMemoryRequirementsKHR"
        ) || reportMissing("VK", "VK_KHR_maintenance4");
    }

    private static boolean check_KHR_performance_query(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_performance_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            390, 391
        },
            "vkAcquireProfilingLockKHR", "vkReleaseProfilingLockKHR"
        ) || reportMissing("VK", "VK_KHR_performance_query");
    }

    private static boolean check_KHR_pipeline_executable_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_pipeline_executable_properties")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            392, 393, 394
        },
            "vkGetPipelineExecutablePropertiesKHR", "vkGetPipelineExecutableStatisticsKHR", "vkGetPipelineExecutableInternalRepresentationsKHR"
        ) || reportMissing("VK", "VK_KHR_pipeline_executable_properties");
    }

    private static boolean check_KHR_present_wait(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_present_wait")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            395
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
            396, flag0 + 357
        },
            "vkCmdPushDescriptorSetKHR", "vkCmdPushDescriptorSetWithTemplateKHR"
        ) || reportMissing("VK", "VK_KHR_push_descriptor");
    }

    private static boolean check_KHR_ray_tracing_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_ray_tracing_maintenance1")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_ray_tracing_pipeline") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            flag0 + 397
        },
            "vkCmdTraceRaysIndirect2KHR"
        ) || reportMissing("VK", "VK_KHR_ray_tracing_maintenance1");
    }

    private static boolean check_KHR_ray_tracing_pipeline(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_ray_tracing_pipeline")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            398, 399, 400, 401, 402, 403, 404
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
            405, 406
        },
            "vkCreateSamplerYcbcrConversionKHR", "vkDestroySamplerYcbcrConversionKHR"
        ) || reportMissing("VK", "VK_KHR_sampler_ycbcr_conversion");
    }

    private static boolean check_KHR_shared_presentable_image(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_shared_presentable_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            407
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
            408, 409, 410, 411, 412, flag0 + 361, flag0 + 362, flag0 + 363
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
            413, 414, 415, 416, 417, 418, flag0 + 419, flag1 + 420
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
            421, 422, 423
        },
            "vkGetSemaphoreCounterValueKHR", "vkWaitSemaphoresKHR", "vkSignalSemaphoreKHR"
        ) || reportMissing("VK", "VK_KHR_timeline_semaphore");
    }

    private static boolean check_KHR_video_decode_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_decode_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            424
        },
            "vkCmdDecodeVideoKHR"
        ) || reportMissing("VK", "VK_KHR_video_decode_queue");
    }

    private static boolean check_KHR_video_encode_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_encode_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            425
        },
            "vkCmdEncodeVideoKHR"
        ) || reportMissing("VK", "VK_KHR_video_encode_queue");
    }

    private static boolean check_KHR_video_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            426, 427, 428, 429, 430, 431, 432, 433, 434, 435
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
            436
        },
            "vkCmdSetViewportWScalingNV"
        ) || reportMissing("VK", "VK_NV_clip_space_w_scaling");
    }

    private static boolean check_NV_device_diagnostic_checkpoints(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_device_diagnostic_checkpoints")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            437, 438
        },
            "vkCmdSetCheckpointNV", "vkGetQueueCheckpointDataNV"
        ) || reportMissing("VK", "VK_NV_device_diagnostic_checkpoints");
    }

    private static boolean check_NV_device_generated_commands(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_device_generated_commands")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            439, 440, 441, 442, 443, 444
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
            445
        },
            "vkGetMemoryRemoteAddressNV"
        ) || reportMissing("VK", "VK_NV_external_memory_rdma");
    }

    private static boolean check_NV_external_memory_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_external_memory_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            446
        },
            "vkGetMemoryWin32HandleNV"
        ) || reportMissing("VK", "VK_NV_external_memory_win32");
    }

    private static boolean check_NV_fragment_shading_rate_enums(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_fragment_shading_rate_enums")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            447
        },
            "vkCmdSetFragmentShadingRateEnumNV"
        ) || reportMissing("VK", "VK_NV_fragment_shading_rate_enums");
    }

    private static boolean check_NV_mesh_shader(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_mesh_shader")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            448, 449, 450
        },
            "vkCmdDrawMeshTasksNV", "vkCmdDrawMeshTasksIndirectNV", "vkCmdDrawMeshTasksIndirectCountNV"
        ) || reportMissing("VK", "VK_NV_mesh_shader");
    }

    private static boolean check_NV_optical_flow(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_optical_flow")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            451, 452, 453, 454
        },
            "vkCreateOpticalFlowSessionNV", "vkDestroyOpticalFlowSessionNV", "vkBindOpticalFlowSessionImageNV", "vkCmdOpticalFlowExecuteNV"
        ) || reportMissing("VK", "VK_NV_optical_flow");
    }

    private static boolean check_NV_ray_tracing(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_ray_tracing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            455, 456, 457, 458, 459, 460, 461, 462, 463, 464, 465, 466
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
            467
        },
            "vkCmdSetExclusiveScissorNV"
        ) || reportMissing("VK", "VK_NV_scissor_exclusive");
    }

    private static boolean check_NV_shading_rate_image(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_shading_rate_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            468, 469, 470
        },
            "vkCmdBindShadingRateImageNV", "vkCmdSetViewportShadingRatePaletteNV", "vkCmdSetCoarseSampleOrderNV"
        ) || reportMissing("VK", "VK_NV_shading_rate_image");
    }

    private static boolean check_NVX_binary_import(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NVX_binary_import")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            471, 472, 473, 474, 475
        },
            "vkCreateCuModuleNVX", "vkCreateCuFunctionNVX", "vkDestroyCuModuleNVX", "vkDestroyCuFunctionNVX", "vkCmdCuLaunchKernelNVX"
        ) || reportMissing("VK", "VK_NVX_binary_import");
    }

    private static boolean check_NVX_image_view_handle(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NVX_image_view_handle")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            476, 477
        },
            "vkGetImageViewHandleNVX", "vkGetImageViewAddressNVX"
        ) || reportMissing("VK", "VK_NVX_image_view_handle");
    }

    private static boolean check_QCOM_tile_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_QCOM_tile_properties")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            478, 479
        },
            "vkGetFramebufferTilePropertiesQCOM", "vkGetDynamicRenderingTilePropertiesQCOM"
        ) || reportMissing("VK", "VK_QCOM_tile_properties");
    }

    private static boolean check_VALVE_descriptor_set_host_mapping(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_VALVE_descriptor_set_host_mapping")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            480, 481
        },
            "vkGetDescriptorSetLayoutHostMappingInfoVALVE", "vkGetDescriptorSetHostMappingVALVE"
        ) || reportMissing("VK", "VK_VALVE_descriptor_set_host_mapping");
    }

}
