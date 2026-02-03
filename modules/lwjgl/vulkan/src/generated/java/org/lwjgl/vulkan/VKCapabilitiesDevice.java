/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.util.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Reports the enabled capabilities and function pointers of a Vulkan {@code VkDevice}.
 * 
 * <p>The addresses are cached for future use. This class also allows developers to query the capabilities made available to the Vulkan device handle.</p>
 */
@SuppressWarnings("SimplifiableIfStatement")
public class VKCapabilitiesDevice {

    /** Function pointers for VK10 */
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
        vkCreateQueryPool,
        vkDestroyQueryPool,
        vkGetQueryPoolResults,
        vkCreateBuffer,
        vkDestroyBuffer,
        vkCreateImage,
        vkDestroyImage,
        vkGetImageSubresourceLayout,
        vkCreateImageView,
        vkDestroyImageView,
        vkCreateCommandPool,
        vkDestroyCommandPool,
        vkResetCommandPool,
        vkAllocateCommandBuffers,
        vkFreeCommandBuffers,
        vkBeginCommandBuffer,
        vkEndCommandBuffer,
        vkResetCommandBuffer,
        vkCmdCopyBuffer,
        vkCmdCopyImage,
        vkCmdCopyBufferToImage,
        vkCmdCopyImageToBuffer,
        vkCmdUpdateBuffer,
        vkCmdFillBuffer,
        vkCmdPipelineBarrier,
        vkCmdBeginQuery,
        vkCmdEndQuery,
        vkCmdResetQueryPool,
        vkCmdWriteTimestamp,
        vkCmdCopyQueryPoolResults,
        vkCmdExecuteCommands,
        vkCreateEvent,
        vkDestroyEvent,
        vkGetEventStatus,
        vkSetEvent,
        vkResetEvent,
        vkCreateBufferView,
        vkDestroyBufferView,
        vkCreateShaderModule,
        vkDestroyShaderModule,
        vkCreatePipelineCache,
        vkDestroyPipelineCache,
        vkGetPipelineCacheData,
        vkMergePipelineCaches,
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
        vkCmdBindPipeline,
        vkCmdBindDescriptorSets,
        vkCmdClearColorImage,
        vkCmdDispatch,
        vkCmdDispatchIndirect,
        vkCmdSetEvent,
        vkCmdResetEvent,
        vkCmdWaitEvents,
        vkCmdPushConstants,
        vkCreateGraphicsPipelines,
        vkCreateFramebuffer,
        vkDestroyFramebuffer,
        vkCreateRenderPass,
        vkDestroyRenderPass,
        vkGetRenderAreaGranularity,
        vkCmdSetViewport,
        vkCmdSetScissor,
        vkCmdSetLineWidth,
        vkCmdSetDepthBias,
        vkCmdSetBlendConstants,
        vkCmdSetDepthBounds,
        vkCmdSetStencilCompareMask,
        vkCmdSetStencilWriteMask,
        vkCmdSetStencilReference,
        vkCmdBindIndexBuffer,
        vkCmdBindVertexBuffers,
        vkCmdDraw,
        vkCmdDrawIndexed,
        vkCmdDrawIndirect,
        vkCmdDrawIndexedIndirect,
        vkCmdBlitImage,
        vkCmdClearDepthStencilImage,
        vkCmdClearAttachments,
        vkCmdResolveImage,
        vkCmdBeginRenderPass,
        vkCmdNextSubpass,
        vkCmdEndRenderPass;

    /** Function pointers for VK11 */
    public final long
        vkBindBufferMemory2,
        vkBindImageMemory2,
        vkGetDeviceGroupPeerMemoryFeatures,
        vkCmdSetDeviceMask,
        vkGetImageMemoryRequirements2,
        vkGetBufferMemoryRequirements2,
        vkGetImageSparseMemoryRequirements2,
        vkTrimCommandPool,
        vkGetDeviceQueue2,
        vkCmdDispatchBase,
        vkCreateDescriptorUpdateTemplate,
        vkDestroyDescriptorUpdateTemplate,
        vkUpdateDescriptorSetWithTemplate,
        vkGetDescriptorSetLayoutSupport,
        vkCreateSamplerYcbcrConversion,
        vkDestroySamplerYcbcrConversion;

    /** Function pointers for VK12 */
    public final long
        vkResetQueryPool,
        vkGetSemaphoreCounterValue,
        vkWaitSemaphores,
        vkSignalSemaphore,
        vkGetBufferDeviceAddress,
        vkGetBufferOpaqueCaptureAddress,
        vkGetDeviceMemoryOpaqueCaptureAddress,
        vkCmdDrawIndirectCount,
        vkCmdDrawIndexedIndirectCount,
        vkCreateRenderPass2,
        vkCmdBeginRenderPass2,
        vkCmdNextSubpass2,
        vkCmdEndRenderPass2;

    /** Function pointers for VK13 */
    public final long
        vkCreatePrivateDataSlot,
        vkDestroyPrivateDataSlot,
        vkSetPrivateData,
        vkGetPrivateData,
        vkCmdPipelineBarrier2,
        vkCmdWriteTimestamp2,
        vkQueueSubmit2,
        vkCmdCopyBuffer2,
        vkCmdCopyImage2,
        vkCmdCopyBufferToImage2,
        vkCmdCopyImageToBuffer2,
        vkGetDeviceBufferMemoryRequirements,
        vkGetDeviceImageMemoryRequirements,
        vkGetDeviceImageSparseMemoryRequirements,
        vkCmdSetEvent2,
        vkCmdResetEvent2,
        vkCmdWaitEvents2,
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
        vkCmdSetPrimitiveRestartEnable;

    /** Function pointers for VK14 */
    public final long
        vkMapMemory2,
        vkUnmapMemory2,
        vkGetDeviceImageSubresourceLayout,
        vkGetImageSubresourceLayout2,
        vkCopyMemoryToImage,
        vkCopyImageToMemory,
        vkCopyImageToImage,
        vkTransitionImageLayout,
        vkCmdPushDescriptorSet,
        vkCmdPushDescriptorSetWithTemplate,
        vkCmdBindDescriptorSets2,
        vkCmdPushConstants2,
        vkCmdPushDescriptorSet2,
        vkCmdPushDescriptorSetWithTemplate2,
        vkCmdSetLineStipple,
        vkCmdBindIndexBuffer2,
        vkGetRenderingAreaGranularity,
        vkCmdSetRenderingAttachmentLocations,
        vkCmdSetRenderingInputAttachmentIndices;

    /** Function pointers for AMD_anti_lag */
    public final long
        vkAntiLagUpdateAMD;

    /** Function pointers for AMD_buffer_marker */
    public final long
        vkCmdWriteBufferMarkerAMD,
        vkCmdWriteBufferMarker2AMD;

    /** Function pointers for AMD_display_native_hdr */
    public final long
        vkSetLocalDimmingAMD;

    /** Function pointers for AMD_draw_indirect_count */
    public final long
        vkCmdDrawIndirectCountAMD,
        vkCmdDrawIndexedIndirectCountAMD;

    /** Function pointers for AMD_shader_info */
    public final long
        vkGetShaderInfoAMD;

    /** Function pointers for AMDX_shader_enqueue */
    public final long
        vkCreateExecutionGraphPipelinesAMDX,
        vkGetExecutionGraphPipelineScratchSizeAMDX,
        vkGetExecutionGraphPipelineNodeIndexAMDX,
        vkCmdInitializeGraphScratchMemoryAMDX,
        vkCmdDispatchGraphAMDX,
        vkCmdDispatchGraphIndirectAMDX,
        vkCmdDispatchGraphIndirectCountAMDX;

    /** Function pointers for ANDROID_external_memory_android_hardware_buffer */
    public final long
        vkGetAndroidHardwareBufferPropertiesANDROID,
        vkGetMemoryAndroidHardwareBufferANDROID;

    /** Function pointers for ARM_data_graph */
    public final long
        vkCreateDataGraphPipelinesARM,
        vkCreateDataGraphPipelineSessionARM,
        vkGetDataGraphPipelineSessionBindPointRequirementsARM,
        vkGetDataGraphPipelineSessionMemoryRequirementsARM,
        vkBindDataGraphPipelineSessionMemoryARM,
        vkDestroyDataGraphPipelineSessionARM,
        vkCmdDispatchDataGraphARM,
        vkGetDataGraphPipelineAvailablePropertiesARM,
        vkGetDataGraphPipelinePropertiesARM;

    /** Function pointers for ARM_tensors */
    public final long
        vkCreateTensorARM,
        vkDestroyTensorARM,
        vkCreateTensorViewARM,
        vkDestroyTensorViewARM,
        vkGetTensorMemoryRequirementsARM,
        vkBindTensorMemoryARM,
        vkGetDeviceTensorMemoryRequirementsARM,
        vkCmdCopyTensorARM,
        vkGetTensorOpaqueCaptureDescriptorDataARM,
        vkGetTensorViewOpaqueCaptureDescriptorDataARM;

    /** Function pointers for EXT_attachment_feedback_loop_dynamic_state */
    public final long
        vkCmdSetAttachmentFeedbackLoopEnableEXT;

    /** Function pointers for EXT_buffer_device_address */
    public final long
        vkGetBufferDeviceAddressEXT;

    /** Function pointers for EXT_calibrated_timestamps */
    public final long
        vkGetCalibratedTimestampsEXT;

    /** Function pointers for EXT_color_write_enable */
    public final long
        vkCmdSetColorWriteEnableEXT;

    /** Function pointers for EXT_conditional_rendering */
    public final long
        vkCmdBeginConditionalRenderingEXT,
        vkCmdEndConditionalRenderingEXT;

    /** Function pointers for EXT_custom_resolve */
    public final long
        vkCmdBeginCustomResolveEXT;

    /** Function pointers for EXT_debug_marker */
    public final long
        vkDebugMarkerSetObjectTagEXT,
        vkDebugMarkerSetObjectNameEXT,
        vkCmdDebugMarkerBeginEXT,
        vkCmdDebugMarkerEndEXT,
        vkCmdDebugMarkerInsertEXT;

    /** Function pointers for EXT_depth_bias_control */
    public final long
        vkCmdSetDepthBias2EXT;

    /** Function pointers for EXT_depth_clamp_control */
    public final long
        vkCmdSetDepthClampRangeEXT;

    /** Function pointers for EXT_descriptor_buffer */
    public final long
        vkGetDescriptorSetLayoutSizeEXT,
        vkGetDescriptorSetLayoutBindingOffsetEXT,
        vkGetDescriptorEXT,
        vkCmdBindDescriptorBuffersEXT,
        vkCmdSetDescriptorBufferOffsetsEXT,
        vkCmdBindDescriptorBufferEmbeddedSamplersEXT,
        vkGetBufferOpaqueCaptureDescriptorDataEXT,
        vkGetImageOpaqueCaptureDescriptorDataEXT,
        vkGetImageViewOpaqueCaptureDescriptorDataEXT,
        vkGetSamplerOpaqueCaptureDescriptorDataEXT,
        vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT;

    /** Function pointers for EXT_descriptor_heap */
    public final long
        vkWriteSamplerDescriptorsEXT,
        vkWriteResourceDescriptorsEXT,
        vkCmdBindSamplerHeapEXT,
        vkCmdBindResourceHeapEXT,
        vkCmdPushDataEXT,
        vkGetImageOpaqueCaptureDataEXT,
        vkRegisterCustomBorderColorEXT,
        vkUnregisterCustomBorderColorEXT,
        vkGetTensorOpaqueCaptureDataARM;

    /** Function pointers for EXT_device_fault */
    public final long
        vkGetDeviceFaultInfoEXT;

    /** Function pointers for EXT_device_generated_commands */
    public final long
        vkGetGeneratedCommandsMemoryRequirementsEXT,
        vkCmdPreprocessGeneratedCommandsEXT,
        vkCmdExecuteGeneratedCommandsEXT,
        vkCreateIndirectCommandsLayoutEXT,
        vkDestroyIndirectCommandsLayoutEXT,
        vkCreateIndirectExecutionSetEXT,
        vkDestroyIndirectExecutionSetEXT,
        vkUpdateIndirectExecutionSetPipelineEXT,
        vkUpdateIndirectExecutionSetShaderEXT;

    /** Function pointers for EXT_discard_rectangles */
    public final long
        vkCmdSetDiscardRectangleEXT,
        vkCmdSetDiscardRectangleEnableEXT,
        vkCmdSetDiscardRectangleModeEXT;

    /** Function pointers for EXT_display_control */
    public final long
        vkDisplayPowerControlEXT,
        vkRegisterDeviceEventEXT,
        vkRegisterDisplayEventEXT,
        vkGetSwapchainCounterEXT;

    /** Function pointers for EXT_extended_dynamic_state */
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

    /** Function pointers for EXT_extended_dynamic_state2 */
    public final long
        vkCmdSetPatchControlPointsEXT,
        vkCmdSetRasterizerDiscardEnableEXT,
        vkCmdSetDepthBiasEnableEXT,
        vkCmdSetLogicOpEXT,
        vkCmdSetPrimitiveRestartEnableEXT;

    /** Function pointers for EXT_extended_dynamic_state3 */
    public final long
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
        vkCmdSetTessellationDomainOriginEXT,
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

    /** Function pointers for EXT_external_memory_host */
    public final long
        vkGetMemoryHostPointerPropertiesEXT;

    /** Function pointers for EXT_external_memory_metal */
    public final long
        vkGetMemoryMetalHandleEXT,
        vkGetMemoryMetalHandlePropertiesEXT;

    /** Function pointers for EXT_fragment_density_map_offset */
    public final long
        vkCmdEndRendering2EXT;

    /** Function pointers for EXT_full_screen_exclusive */
    public final long
        vkAcquireFullScreenExclusiveModeEXT,
        vkReleaseFullScreenExclusiveModeEXT,
        vkGetDeviceGroupSurfacePresentModes2EXT;

    /** Function pointers for EXT_hdr_metadata */
    public final long
        vkSetHdrMetadataEXT;

    /** Function pointers for EXT_host_image_copy */
    public final long
        vkCopyMemoryToImageEXT,
        vkCopyImageToMemoryEXT,
        vkCopyImageToImageEXT,
        vkTransitionImageLayoutEXT,
        vkGetImageSubresourceLayout2EXT;

    /** Function pointers for EXT_host_query_reset */
    public final long
        vkResetQueryPoolEXT;

    /** Function pointers for EXT_image_drm_format_modifier */
    public final long
        vkGetImageDrmFormatModifierPropertiesEXT;

    /** Function pointers for EXT_line_rasterization */
    public final long
        vkCmdSetLineStippleEXT;

    /** Function pointers for EXT_memory_decompression */
    public final long
        vkCmdDecompressMemoryEXT,
        vkCmdDecompressMemoryIndirectCountEXT;

    /** Function pointers for EXT_mesh_shader */
    public final long
        vkCmdDrawMeshTasksEXT,
        vkCmdDrawMeshTasksIndirectEXT,
        vkCmdDrawMeshTasksIndirectCountEXT;

    /** Function pointers for EXT_metal_objects */
    public final long
        vkExportMetalObjectsEXT;

    /** Function pointers for EXT_multi_draw */
    public final long
        vkCmdDrawMultiEXT,
        vkCmdDrawMultiIndexedEXT;

    /** Function pointers for EXT_opacity_micromap */
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

    /** Function pointers for EXT_pageable_device_local_memory */
    public final long
        vkSetDeviceMemoryPriorityEXT;

    /** Function pointers for EXT_pipeline_properties */
    public final long
        vkGetPipelinePropertiesEXT;

    /** Function pointers for EXT_present_timing */
    public final long
        vkSetSwapchainPresentTimingQueueSizeEXT,
        vkGetSwapchainTimingPropertiesEXT,
        vkGetSwapchainTimeDomainPropertiesEXT,
        vkGetPastPresentationTimingEXT;

    /** Function pointers for EXT_private_data */
    public final long
        vkCreatePrivateDataSlotEXT,
        vkDestroyPrivateDataSlotEXT,
        vkSetPrivateDataEXT,
        vkGetPrivateDataEXT;

    /** Function pointers for EXT_sample_locations */
    public final long
        vkCmdSetSampleLocationsEXT;

    /** Function pointers for EXT_shader_module_identifier */
    public final long
        vkGetShaderModuleIdentifierEXT,
        vkGetShaderModuleCreateInfoIdentifierEXT;

    /** Function pointers for EXT_shader_object */
    public final long
        vkCreateShadersEXT,
        vkDestroyShaderEXT,
        vkGetShaderBinaryDataEXT,
        vkCmdBindShadersEXT,
        vkCmdSetVertexInputEXT;

    /** Function pointers for EXT_swapchain_maintenance1 */
    public final long
        vkReleaseSwapchainImagesEXT;

    /** Function pointers for EXT_transform_feedback */
    public final long
        vkCmdBindTransformFeedbackBuffersEXT,
        vkCmdBeginTransformFeedbackEXT,
        vkCmdEndTransformFeedbackEXT,
        vkCmdBeginQueryIndexedEXT,
        vkCmdEndQueryIndexedEXT,
        vkCmdDrawIndirectByteCountEXT;

    /** Function pointers for EXT_validation_cache */
    public final long
        vkCreateValidationCacheEXT,
        vkDestroyValidationCacheEXT,
        vkMergeValidationCachesEXT,
        vkGetValidationCacheDataEXT;

    /** Function pointers for GOOGLE_display_timing */
    public final long
        vkGetRefreshCycleDurationGOOGLE,
        vkGetPastPresentationTimingGOOGLE;

    /** Function pointers for HUAWEI_cluster_culling_shader */
    public final long
        vkCmdDrawClusterHUAWEI,
        vkCmdDrawClusterIndirectHUAWEI;

    /** Function pointers for HUAWEI_invocation_mask */
    public final long
        vkCmdBindInvocationMaskHUAWEI;

    /** Function pointers for HUAWEI_subpass_shading */
    public final long
        vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI,
        vkCmdSubpassShadingHUAWEI;

    /** Function pointers for INTEL_performance_query */
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

    /** Function pointers for KHR_acceleration_structure */
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

    /** Function pointers for KHR_bind_memory2 */
    public final long
        vkBindBufferMemory2KHR,
        vkBindImageMemory2KHR;

    /** Function pointers for KHR_buffer_device_address */
    public final long
        vkGetBufferDeviceAddressKHR,
        vkGetBufferOpaqueCaptureAddressKHR,
        vkGetDeviceMemoryOpaqueCaptureAddressKHR;

    /** Function pointers for KHR_calibrated_timestamps */
    public final long
        vkGetCalibratedTimestampsKHR;

    /** Function pointers for KHR_copy_commands2 */
    public final long
        vkCmdCopyBuffer2KHR,
        vkCmdCopyImage2KHR,
        vkCmdCopyBufferToImage2KHR,
        vkCmdCopyImageToBuffer2KHR,
        vkCmdBlitImage2KHR,
        vkCmdResolveImage2KHR;

    /** Function pointers for KHR_copy_memory_indirect */
    public final long
        vkCmdCopyMemoryIndirectKHR,
        vkCmdCopyMemoryToImageIndirectKHR;

    /** Function pointers for KHR_create_renderpass2 */
    public final long
        vkCreateRenderPass2KHR,
        vkCmdBeginRenderPass2KHR,
        vkCmdNextSubpass2KHR,
        vkCmdEndRenderPass2KHR;

    /** Function pointers for KHR_deferred_host_operations */
    public final long
        vkCreateDeferredOperationKHR,
        vkDestroyDeferredOperationKHR,
        vkGetDeferredOperationMaxConcurrencyKHR,
        vkGetDeferredOperationResultKHR,
        vkDeferredOperationJoinKHR;

    /** Function pointers for KHR_descriptor_update_template */
    public final long
        vkCreateDescriptorUpdateTemplateKHR,
        vkDestroyDescriptorUpdateTemplateKHR,
        vkUpdateDescriptorSetWithTemplateKHR,
        vkCmdPushDescriptorSetWithTemplateKHR;

    /** Function pointers for KHR_device_group */
    public final long
        vkGetDeviceGroupPeerMemoryFeaturesKHR,
        vkCmdSetDeviceMaskKHR,
        vkCmdDispatchBaseKHR,
        vkGetDeviceGroupPresentCapabilitiesKHR,
        vkGetDeviceGroupSurfacePresentModesKHR,
        vkAcquireNextImage2KHR;

    /** Function pointers for KHR_display_swapchain */
    public final long
        vkCreateSharedSwapchainsKHR;

    /** Function pointers for KHR_draw_indirect_count */
    public final long
        vkCmdDrawIndirectCountKHR,
        vkCmdDrawIndexedIndirectCountKHR;

    /** Function pointers for KHR_dynamic_rendering */
    public final long
        vkCmdBeginRenderingKHR,
        vkCmdEndRenderingKHR;

    /** Function pointers for KHR_dynamic_rendering_local_read */
    public final long
        vkCmdSetRenderingAttachmentLocationsKHR,
        vkCmdSetRenderingInputAttachmentIndicesKHR;

    /** Function pointers for KHR_external_fence_fd */
    public final long
        vkImportFenceFdKHR,
        vkGetFenceFdKHR;

    /** Function pointers for KHR_external_fence_win32 */
    public final long
        vkImportFenceWin32HandleKHR,
        vkGetFenceWin32HandleKHR;

    /** Function pointers for KHR_external_memory_fd */
    public final long
        vkGetMemoryFdKHR,
        vkGetMemoryFdPropertiesKHR;

    /** Function pointers for KHR_external_memory_win32 */
    public final long
        vkGetMemoryWin32HandleKHR,
        vkGetMemoryWin32HandlePropertiesKHR;

    /** Function pointers for KHR_external_semaphore_fd */
    public final long
        vkImportSemaphoreFdKHR,
        vkGetSemaphoreFdKHR;

    /** Function pointers for KHR_external_semaphore_win32 */
    public final long
        vkImportSemaphoreWin32HandleKHR,
        vkGetSemaphoreWin32HandleKHR;

    /** Function pointers for KHR_fragment_shading_rate */
    public final long
        vkCmdSetFragmentShadingRateKHR;

    /** Function pointers for KHR_get_memory_requirements2 */
    public final long
        vkGetImageMemoryRequirements2KHR,
        vkGetBufferMemoryRequirements2KHR,
        vkGetImageSparseMemoryRequirements2KHR;

    /** Function pointers for KHR_line_rasterization */
    public final long
        vkCmdSetLineStippleKHR;

    /** Function pointers for KHR_maintenance1 */
    public final long
        vkTrimCommandPoolKHR;

    /** Function pointers for KHR_maintenance10 */
    public final long
        vkCmdEndRendering2KHR;

    /** Function pointers for KHR_maintenance3 */
    public final long
        vkGetDescriptorSetLayoutSupportKHR;

    /** Function pointers for KHR_maintenance4 */
    public final long
        vkGetDeviceBufferMemoryRequirementsKHR,
        vkGetDeviceImageMemoryRequirementsKHR,
        vkGetDeviceImageSparseMemoryRequirementsKHR;

    /** Function pointers for KHR_maintenance5 */
    public final long
        vkCmdBindIndexBuffer2KHR,
        vkGetRenderingAreaGranularityKHR,
        vkGetDeviceImageSubresourceLayoutKHR,
        vkGetImageSubresourceLayout2KHR;

    /** Function pointers for KHR_maintenance6 */
    public final long
        vkCmdBindDescriptorSets2KHR,
        vkCmdPushConstants2KHR,
        vkCmdPushDescriptorSet2KHR,
        vkCmdPushDescriptorSetWithTemplate2KHR,
        vkCmdSetDescriptorBufferOffsets2EXT,
        vkCmdBindDescriptorBufferEmbeddedSamplers2EXT;

    /** Function pointers for KHR_map_memory2 */
    public final long
        vkMapMemory2KHR,
        vkUnmapMemory2KHR;

    /** Function pointers for KHR_performance_query */
    public final long
        vkAcquireProfilingLockKHR,
        vkReleaseProfilingLockKHR;

    /** Function pointers for KHR_pipeline_binary */
    public final long
        vkCreatePipelineBinariesKHR,
        vkDestroyPipelineBinaryKHR,
        vkGetPipelineKeyKHR,
        vkGetPipelineBinaryDataKHR,
        vkReleaseCapturedPipelineDataKHR;

    /** Function pointers for KHR_pipeline_executable_properties */
    public final long
        vkGetPipelineExecutablePropertiesKHR,
        vkGetPipelineExecutableStatisticsKHR,
        vkGetPipelineExecutableInternalRepresentationsKHR;

    /** Function pointers for KHR_present_wait */
    public final long
        vkWaitForPresentKHR;

    /** Function pointers for KHR_present_wait2 */
    public final long
        vkWaitForPresent2KHR;

    /** Function pointers for KHR_push_descriptor */
    public final long
        vkCmdPushDescriptorSetKHR;

    /** Function pointers for KHR_ray_tracing_maintenance1 */
    public final long
        vkCmdTraceRaysIndirect2KHR;

    /** Function pointers for KHR_ray_tracing_pipeline */
    public final long
        vkCmdTraceRaysKHR,
        vkCreateRayTracingPipelinesKHR,
        vkGetRayTracingShaderGroupHandlesKHR,
        vkGetRayTracingCaptureReplayShaderGroupHandlesKHR,
        vkCmdTraceRaysIndirectKHR,
        vkGetRayTracingShaderGroupStackSizeKHR,
        vkCmdSetRayTracingPipelineStackSizeKHR;

    /** Function pointers for KHR_sampler_ycbcr_conversion */
    public final long
        vkCreateSamplerYcbcrConversionKHR,
        vkDestroySamplerYcbcrConversionKHR;

    /** Function pointers for KHR_shared_presentable_image */
    public final long
        vkGetSwapchainStatusKHR;

    /** Function pointers for KHR_swapchain */
    public final long
        vkCreateSwapchainKHR,
        vkDestroySwapchainKHR,
        vkGetSwapchainImagesKHR,
        vkAcquireNextImageKHR,
        vkQueuePresentKHR;

    /** Function pointers for KHR_swapchain_maintenance1 */
    public final long
        vkReleaseSwapchainImagesKHR;

    /** Function pointers for KHR_synchronization2 */
    public final long
        vkCmdSetEvent2KHR,
        vkCmdResetEvent2KHR,
        vkCmdWaitEvents2KHR,
        vkCmdPipelineBarrier2KHR,
        vkCmdWriteTimestamp2KHR,
        vkQueueSubmit2KHR;

    /** Function pointers for KHR_timeline_semaphore */
    public final long
        vkGetSemaphoreCounterValueKHR,
        vkWaitSemaphoresKHR,
        vkSignalSemaphoreKHR;

    /** Function pointers for KHR_video_decode_queue */
    public final long
        vkCmdDecodeVideoKHR;

    /** Function pointers for KHR_video_encode_queue */
    public final long
        vkGetEncodedVideoSessionParametersKHR,
        vkCmdEncodeVideoKHR;

    /** Function pointers for KHR_video_queue */
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

    /** Function pointers for NV_clip_space_w_scaling */
    public final long
        vkCmdSetViewportWScalingNV;

    /** Function pointers for NV_cluster_acceleration_structure */
    public final long
        vkGetClusterAccelerationStructureBuildSizesNV,
        vkCmdBuildClusterAccelerationStructureIndirectNV;

    /** Function pointers for NV_compute_occupancy_priority */
    public final long
        vkCmdSetComputeOccupancyPriorityNV;

    /** Function pointers for NV_cooperative_vector */
    public final long
        vkConvertCooperativeVectorMatrixNV,
        vkCmdConvertCooperativeVectorMatrixNV;

    /** Function pointers for NV_copy_memory_indirect */
    public final long
        vkCmdCopyMemoryIndirectNV,
        vkCmdCopyMemoryToImageIndirectNV;

    /** Function pointers for NV_cuda_kernel_launch */
    public final long
        vkCreateCudaModuleNV,
        vkGetCudaModuleCacheNV,
        vkCreateCudaFunctionNV,
        vkDestroyCudaModuleNV,
        vkDestroyCudaFunctionNV,
        vkCmdCudaLaunchKernelNV;

    /** Function pointers for NV_device_diagnostic_checkpoints */
    public final long
        vkCmdSetCheckpointNV,
        vkGetQueueCheckpointDataNV,
        vkGetQueueCheckpointData2NV;

    /** Function pointers for NV_device_generated_commands */
    public final long
        vkGetGeneratedCommandsMemoryRequirementsNV,
        vkCmdPreprocessGeneratedCommandsNV,
        vkCmdExecuteGeneratedCommandsNV,
        vkCmdBindPipelineShaderGroupNV,
        vkCreateIndirectCommandsLayoutNV,
        vkDestroyIndirectCommandsLayoutNV;

    /** Function pointers for NV_device_generated_commands_compute */
    public final long
        vkGetPipelineIndirectMemoryRequirementsNV,
        vkCmdUpdatePipelineIndirectBufferNV,
        vkGetPipelineIndirectDeviceAddressNV;

    /** Function pointers for NV_external_compute_queue */
    public final long
        vkCreateExternalComputeQueueNV,
        vkDestroyExternalComputeQueueNV,
        vkGetExternalComputeQueueDataNV;

    /** Function pointers for NV_external_memory_rdma */
    public final long
        vkGetMemoryRemoteAddressNV;

    /** Function pointers for NV_external_memory_win32 */
    public final long
        vkGetMemoryWin32HandleNV;

    /** Function pointers for NV_fragment_shading_rate_enums */
    public final long
        vkCmdSetFragmentShadingRateEnumNV;

    /** Function pointers for NV_low_latency2 */
    public final long
        vkSetLatencySleepModeNV,
        vkLatencySleepNV,
        vkSetLatencyMarkerNV,
        vkGetLatencyTimingsNV,
        vkQueueNotifyOutOfBandNV;

    /** Function pointers for NV_memory_decompression */
    public final long
        vkCmdDecompressMemoryNV,
        vkCmdDecompressMemoryIndirectCountNV;

    /** Function pointers for NV_mesh_shader */
    public final long
        vkCmdDrawMeshTasksNV,
        vkCmdDrawMeshTasksIndirectNV,
        vkCmdDrawMeshTasksIndirectCountNV;

    /** Function pointers for NV_optical_flow */
    public final long
        vkCreateOpticalFlowSessionNV,
        vkDestroyOpticalFlowSessionNV,
        vkBindOpticalFlowSessionImageNV,
        vkCmdOpticalFlowExecuteNV;

    /** Function pointers for NV_partitioned_acceleration_structure */
    public final long
        vkGetPartitionedAccelerationStructuresBuildSizesNV,
        vkCmdBuildPartitionedAccelerationStructuresNV;

    /** Function pointers for NV_ray_tracing */
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

    /** Function pointers for NV_scissor_exclusive */
    public final long
        vkCmdSetExclusiveScissorEnableNV,
        vkCmdSetExclusiveScissorNV;

    /** Function pointers for NV_shading_rate_image */
    public final long
        vkCmdBindShadingRateImageNV,
        vkCmdSetViewportShadingRatePaletteNV,
        vkCmdSetCoarseSampleOrderNV;

    /** Function pointers for NVX_binary_import */
    public final long
        vkCreateCuModuleNVX,
        vkCreateCuFunctionNVX,
        vkDestroyCuModuleNVX,
        vkDestroyCuFunctionNVX,
        vkCmdCuLaunchKernelNVX;

    /** Function pointers for NVX_image_view_handle */
    public final long
        vkGetImageViewHandleNVX,
        vkGetImageViewHandle64NVX,
        vkGetImageViewAddressNVX,
        vkGetDeviceCombinedImageSamplerIndexNVX;

    /** Function pointers for QCOM_tile_memory_heap */
    public final long
        vkCmdBindTileMemoryQCOM;

    /** Function pointers for QCOM_tile_properties */
    public final long
        vkGetFramebufferTilePropertiesQCOM,
        vkGetDynamicRenderingTilePropertiesQCOM;

    /** Function pointers for QCOM_tile_shading */
    public final long
        vkCmdDispatchTileQCOM,
        vkCmdBeginPerTileExecutionQCOM,
        vkCmdEndPerTileExecutionQCOM;

    /** Function pointers for VALVE_descriptor_set_host_mapping */
    public final long
        vkGetDescriptorSetLayoutHostMappingInfoVALVE,
        vkGetDescriptorSetHostMappingVALVE;

    /** The Vulkan API version number. */
    public final int apiVersion;

    /** When true, {@code VK10} is supported. */
    public final boolean Vulkan10;
    /** When true, {@code VK11} is supported. */
    public final boolean Vulkan11;
    /** When true, {@code VK12} is supported. */
    public final boolean Vulkan12;
    /** When true, {@code VK13} is supported. */
    public final boolean Vulkan13;
    /** When true, {@code VK14} is supported. */
    public final boolean Vulkan14;
    /** When true, {@code AMD_anti_lag} is supported. */
    public final boolean VK_AMD_anti_lag;
    /** When true, {@code AMD_buffer_marker} is supported. */
    public final boolean VK_AMD_buffer_marker;
    /** When true, {@code AMD_device_coherent_memory} is supported. */
    public final boolean VK_AMD_device_coherent_memory;
    /** When true, {@code AMD_display_native_hdr} is supported. */
    public final boolean VK_AMD_display_native_hdr;
    /** When true, {@code AMD_draw_indirect_count} is supported. */
    public final boolean VK_AMD_draw_indirect_count;
    /** When true, {@code AMD_gcn_shader} is supported. */
    public final boolean VK_AMD_gcn_shader;
    /** When true, {@code AMD_gpu_shader_half_float} is supported. */
    public final boolean VK_AMD_gpu_shader_half_float;
    /** When true, {@code AMD_gpu_shader_int16} is supported. */
    public final boolean VK_AMD_gpu_shader_int16;
    /** When true, {@code AMD_memory_overallocation_behavior} is supported. */
    public final boolean VK_AMD_memory_overallocation_behavior;
    /** When true, {@code AMD_mixed_attachment_samples} is supported. */
    public final boolean VK_AMD_mixed_attachment_samples;
    /** When true, {@code AMD_negative_viewport_height} is supported. */
    public final boolean VK_AMD_negative_viewport_height;
    /** When true, {@code AMD_pipeline_compiler_control} is supported. */
    public final boolean VK_AMD_pipeline_compiler_control;
    /** When true, {@code AMD_rasterization_order} is supported. */
    public final boolean VK_AMD_rasterization_order;
    /** When true, {@code AMD_shader_ballot} is supported. */
    public final boolean VK_AMD_shader_ballot;
    /** When true, {@code AMD_shader_core_properties} is supported. */
    public final boolean VK_AMD_shader_core_properties;
    /** When true, {@code AMD_shader_core_properties2} is supported. */
    public final boolean VK_AMD_shader_core_properties2;
    /** When true, {@code AMD_shader_early_and_late_fragment_tests} is supported. */
    public final boolean VK_AMD_shader_early_and_late_fragment_tests;
    /** When true, {@code AMD_shader_explicit_vertex_parameter} is supported. */
    public final boolean VK_AMD_shader_explicit_vertex_parameter;
    /** When true, {@code AMD_shader_fragment_mask} is supported. */
    public final boolean VK_AMD_shader_fragment_mask;
    /** When true, {@code AMD_shader_image_load_store_lod} is supported. */
    public final boolean VK_AMD_shader_image_load_store_lod;
    /** When true, {@code AMD_shader_info} is supported. */
    public final boolean VK_AMD_shader_info;
    /** When true, {@code AMD_shader_trinary_minmax} is supported. */
    public final boolean VK_AMD_shader_trinary_minmax;
    /** When true, {@code AMD_texture_gather_bias_lod} is supported. */
    public final boolean VK_AMD_texture_gather_bias_lod;
    /** When true, {@code AMDX_dense_geometry_format} is supported. */
    public final boolean VK_AMDX_dense_geometry_format;
    /** When true, {@code AMDX_shader_enqueue} is supported. */
    public final boolean VK_AMDX_shader_enqueue;
    /** When true, {@code ANDROID_external_format_resolve} is supported. */
    public final boolean VK_ANDROID_external_format_resolve;
    /** When true, {@code ANDROID_external_memory_android_hardware_buffer} is supported. */
    public final boolean VK_ANDROID_external_memory_android_hardware_buffer;
    /** When true, {@code ARM_data_graph} is supported. */
    public final boolean VK_ARM_data_graph;
    /** When true, {@code ARM_format_pack} is supported. */
    public final boolean VK_ARM_format_pack;
    /** When true, {@code ARM_performance_counters_by_region} is supported. */
    public final boolean VK_ARM_performance_counters_by_region;
    /** When true, {@code ARM_pipeline_opacity_micromap} is supported. */
    public final boolean VK_ARM_pipeline_opacity_micromap;
    /** When true, {@code ARM_rasterization_order_attachment_access} is supported. */
    public final boolean VK_ARM_rasterization_order_attachment_access;
    /** When true, {@code ARM_render_pass_striped} is supported. */
    public final boolean VK_ARM_render_pass_striped;
    /** When true, {@code ARM_scheduling_controls} is supported. */
    public final boolean VK_ARM_scheduling_controls;
    /** When true, {@code ARM_shader_core_builtins} is supported. */
    public final boolean VK_ARM_shader_core_builtins;
    /** When true, {@code ARM_shader_core_properties} is supported. */
    public final boolean VK_ARM_shader_core_properties;
    /** When true, {@code ARM_tensors} is supported. */
    public final boolean VK_ARM_tensors;
    /** When true, {@code EXT_4444_formats} is supported. */
    public final boolean VK_EXT_4444_formats;
    /** When true, {@code EXT_astc_decode_mode} is supported. */
    public final boolean VK_EXT_astc_decode_mode;
    /** When true, {@code EXT_attachment_feedback_loop_dynamic_state} is supported. */
    public final boolean VK_EXT_attachment_feedback_loop_dynamic_state;
    /** When true, {@code EXT_attachment_feedback_loop_layout} is supported. */
    public final boolean VK_EXT_attachment_feedback_loop_layout;
    /** When true, {@code EXT_blend_operation_advanced} is supported. */
    public final boolean VK_EXT_blend_operation_advanced;
    /** When true, {@code EXT_border_color_swizzle} is supported. */
    public final boolean VK_EXT_border_color_swizzle;
    /** When true, {@code EXT_buffer_device_address} is supported. */
    public final boolean VK_EXT_buffer_device_address;
    /** When true, {@code EXT_calibrated_timestamps} is supported. */
    public final boolean VK_EXT_calibrated_timestamps;
    /** When true, {@code EXT_color_write_enable} is supported. */
    public final boolean VK_EXT_color_write_enable;
    /** When true, {@code EXT_conditional_rendering} is supported. */
    public final boolean VK_EXT_conditional_rendering;
    /** When true, {@code EXT_conservative_rasterization} is supported. */
    public final boolean VK_EXT_conservative_rasterization;
    /** When true, {@code EXT_custom_border_color} is supported. */
    public final boolean VK_EXT_custom_border_color;
    /** When true, {@code EXT_custom_resolve} is supported. */
    public final boolean VK_EXT_custom_resolve;
    /** When true, {@code EXT_debug_marker} is supported. */
    public final boolean VK_EXT_debug_marker;
    /** When true, {@code EXT_depth_bias_control} is supported. */
    public final boolean VK_EXT_depth_bias_control;
    /** When true, {@code EXT_depth_clamp_control} is supported. */
    public final boolean VK_EXT_depth_clamp_control;
    /** When true, {@code EXT_depth_clamp_zero_one} is supported. */
    public final boolean VK_EXT_depth_clamp_zero_one;
    /** When true, {@code EXT_depth_clip_control} is supported. */
    public final boolean VK_EXT_depth_clip_control;
    /** When true, {@code EXT_depth_clip_enable} is supported. */
    public final boolean VK_EXT_depth_clip_enable;
    /** When true, {@code EXT_depth_range_unrestricted} is supported. */
    public final boolean VK_EXT_depth_range_unrestricted;
    /** When true, {@code EXT_descriptor_buffer} is supported. */
    public final boolean VK_EXT_descriptor_buffer;
    /** When true, {@code EXT_descriptor_heap} is supported. */
    public final boolean VK_EXT_descriptor_heap;
    /** When true, {@code EXT_descriptor_indexing} is supported. */
    public final boolean VK_EXT_descriptor_indexing;
    /** When true, {@code EXT_device_address_binding_report} is supported. */
    public final boolean VK_EXT_device_address_binding_report;
    /** When true, {@code EXT_device_fault} is supported. */
    public final boolean VK_EXT_device_fault;
    /** When true, {@code EXT_device_generated_commands} is supported. */
    public final boolean VK_EXT_device_generated_commands;
    /** When true, {@code EXT_device_memory_report} is supported. */
    public final boolean VK_EXT_device_memory_report;
    /** When true, {@code EXT_discard_rectangles} is supported. */
    public final boolean VK_EXT_discard_rectangles;
    /** When true, {@code EXT_display_control} is supported. */
    public final boolean VK_EXT_display_control;
    /** When true, {@code EXT_dynamic_rendering_unused_attachments} is supported. */
    public final boolean VK_EXT_dynamic_rendering_unused_attachments;
    /** When true, {@code EXT_extended_dynamic_state} is supported. */
    public final boolean VK_EXT_extended_dynamic_state;
    /** When true, {@code EXT_extended_dynamic_state2} is supported. */
    public final boolean VK_EXT_extended_dynamic_state2;
    /** When true, {@code EXT_extended_dynamic_state3} is supported. */
    public final boolean VK_EXT_extended_dynamic_state3;
    /** When true, {@code EXT_external_memory_acquire_unmodified} is supported. */
    public final boolean VK_EXT_external_memory_acquire_unmodified;
    /** When true, {@code EXT_external_memory_dma_buf} is supported. */
    public final boolean VK_EXT_external_memory_dma_buf;
    /** When true, {@code EXT_external_memory_host} is supported. */
    public final boolean VK_EXT_external_memory_host;
    /** When true, {@code EXT_external_memory_metal} is supported. */
    public final boolean VK_EXT_external_memory_metal;
    /** When true, {@code EXT_filter_cubic} is supported. */
    public final boolean VK_EXT_filter_cubic;
    /** When true, {@code EXT_fragment_density_map} is supported. */
    public final boolean VK_EXT_fragment_density_map;
    /** When true, {@code EXT_fragment_density_map2} is supported. */
    public final boolean VK_EXT_fragment_density_map2;
    /** When true, {@code EXT_fragment_density_map_offset} is supported. */
    public final boolean VK_EXT_fragment_density_map_offset;
    /** When true, {@code EXT_fragment_shader_interlock} is supported. */
    public final boolean VK_EXT_fragment_shader_interlock;
    /** When true, {@code EXT_frame_boundary} is supported. */
    public final boolean VK_EXT_frame_boundary;
    /** When true, {@code EXT_full_screen_exclusive} is supported. */
    public final boolean VK_EXT_full_screen_exclusive;
    /** When true, {@code EXT_global_priority} is supported. */
    public final boolean VK_EXT_global_priority;
    /** When true, {@code EXT_global_priority_query} is supported. */
    public final boolean VK_EXT_global_priority_query;
    /** When true, {@code EXT_graphics_pipeline_library} is supported. */
    public final boolean VK_EXT_graphics_pipeline_library;
    /** When true, {@code EXT_hdr_metadata} is supported. */
    public final boolean VK_EXT_hdr_metadata;
    /** When true, {@code EXT_host_image_copy} is supported. */
    public final boolean VK_EXT_host_image_copy;
    /** When true, {@code EXT_host_query_reset} is supported. */
    public final boolean VK_EXT_host_query_reset;
    /** When true, {@code EXT_image_2d_view_of_3d} is supported. */
    public final boolean VK_EXT_image_2d_view_of_3d;
    /** When true, {@code EXT_image_compression_control} is supported. */
    public final boolean VK_EXT_image_compression_control;
    /** When true, {@code EXT_image_compression_control_swapchain} is supported. */
    public final boolean VK_EXT_image_compression_control_swapchain;
    /** When true, {@code EXT_image_drm_format_modifier} is supported. */
    public final boolean VK_EXT_image_drm_format_modifier;
    /** When true, {@code EXT_image_robustness} is supported. */
    public final boolean VK_EXT_image_robustness;
    /** When true, {@code EXT_image_sliced_view_of_3d} is supported. */
    public final boolean VK_EXT_image_sliced_view_of_3d;
    /** When true, {@code EXT_image_view_min_lod} is supported. */
    public final boolean VK_EXT_image_view_min_lod;
    /** When true, {@code EXT_index_type_uint8} is supported. */
    public final boolean VK_EXT_index_type_uint8;
    /** When true, {@code EXT_inline_uniform_block} is supported. */
    public final boolean VK_EXT_inline_uniform_block;
    /** When true, {@code EXT_legacy_dithering} is supported. */
    public final boolean VK_EXT_legacy_dithering;
    /** When true, {@code EXT_legacy_vertex_attributes} is supported. */
    public final boolean VK_EXT_legacy_vertex_attributes;
    /** When true, {@code EXT_line_rasterization} is supported. */
    public final boolean VK_EXT_line_rasterization;
    /** When true, {@code EXT_load_store_op_none} is supported. */
    public final boolean VK_EXT_load_store_op_none;
    /** When true, {@code EXT_map_memory_placed} is supported. */
    public final boolean VK_EXT_map_memory_placed;
    /** When true, {@code EXT_memory_budget} is supported. */
    public final boolean VK_EXT_memory_budget;
    /** When true, {@code EXT_memory_decompression} is supported. */
    public final boolean VK_EXT_memory_decompression;
    /** When true, {@code EXT_memory_priority} is supported. */
    public final boolean VK_EXT_memory_priority;
    /** When true, {@code EXT_mesh_shader} is supported. */
    public final boolean VK_EXT_mesh_shader;
    /** When true, {@code EXT_metal_objects} is supported. */
    public final boolean VK_EXT_metal_objects;
    /** When true, {@code EXT_multi_draw} is supported. */
    public final boolean VK_EXT_multi_draw;
    /** When true, {@code EXT_multisampled_render_to_single_sampled} is supported. */
    public final boolean VK_EXT_multisampled_render_to_single_sampled;
    /** When true, {@code EXT_mutable_descriptor_type} is supported. */
    public final boolean VK_EXT_mutable_descriptor_type;
    /** When true, {@code EXT_nested_command_buffer} is supported. */
    public final boolean VK_EXT_nested_command_buffer;
    /** When true, {@code EXT_non_seamless_cube_map} is supported. */
    public final boolean VK_EXT_non_seamless_cube_map;
    /** When true, {@code EXT_opacity_micromap} is supported. */
    public final boolean VK_EXT_opacity_micromap;
    /** When true, {@code EXT_pageable_device_local_memory} is supported. */
    public final boolean VK_EXT_pageable_device_local_memory;
    /** When true, {@code EXT_pci_bus_info} is supported. */
    public final boolean VK_EXT_pci_bus_info;
    /** When true, {@code EXT_physical_device_drm} is supported. */
    public final boolean VK_EXT_physical_device_drm;
    /** When true, {@code EXT_pipeline_creation_cache_control} is supported. */
    public final boolean VK_EXT_pipeline_creation_cache_control;
    /** When true, {@code EXT_pipeline_creation_feedback} is supported. */
    public final boolean VK_EXT_pipeline_creation_feedback;
    /** When true, {@code EXT_pipeline_library_group_handles} is supported. */
    public final boolean VK_EXT_pipeline_library_group_handles;
    /** When true, {@code EXT_pipeline_properties} is supported. */
    public final boolean VK_EXT_pipeline_properties;
    /** When true, {@code EXT_pipeline_protected_access} is supported. */
    public final boolean VK_EXT_pipeline_protected_access;
    /** When true, {@code EXT_pipeline_robustness} is supported. */
    public final boolean VK_EXT_pipeline_robustness;
    /** When true, {@code EXT_post_depth_coverage} is supported. */
    public final boolean VK_EXT_post_depth_coverage;
    /** When true, {@code EXT_present_mode_fifo_latest_ready} is supported. */
    public final boolean VK_EXT_present_mode_fifo_latest_ready;
    /** When true, {@code EXT_present_timing} is supported. */
    public final boolean VK_EXT_present_timing;
    /** When true, {@code EXT_primitive_topology_list_restart} is supported. */
    public final boolean VK_EXT_primitive_topology_list_restart;
    /** When true, {@code EXT_primitives_generated_query} is supported. */
    public final boolean VK_EXT_primitives_generated_query;
    /** When true, {@code EXT_private_data} is supported. */
    public final boolean VK_EXT_private_data;
    /** When true, {@code EXT_provoking_vertex} is supported. */
    public final boolean VK_EXT_provoking_vertex;
    /** When true, {@code EXT_queue_family_foreign} is supported. */
    public final boolean VK_EXT_queue_family_foreign;
    /** When true, {@code EXT_rasterization_order_attachment_access} is supported. */
    public final boolean VK_EXT_rasterization_order_attachment_access;
    /** When true, {@code EXT_ray_tracing_invocation_reorder} is supported. */
    public final boolean VK_EXT_ray_tracing_invocation_reorder;
    /** When true, {@code EXT_rgba10x6_formats} is supported. */
    public final boolean VK_EXT_rgba10x6_formats;
    /** When true, {@code EXT_robustness2} is supported. */
    public final boolean VK_EXT_robustness2;
    /** When true, {@code EXT_sample_locations} is supported. */
    public final boolean VK_EXT_sample_locations;
    /** When true, {@code EXT_sampler_filter_minmax} is supported. */
    public final boolean VK_EXT_sampler_filter_minmax;
    /** When true, {@code EXT_scalar_block_layout} is supported. */
    public final boolean VK_EXT_scalar_block_layout;
    /** When true, {@code EXT_separate_stencil_usage} is supported. */
    public final boolean VK_EXT_separate_stencil_usage;
    /** When true, {@code EXT_shader_64bit_indexing} is supported. */
    public final boolean VK_EXT_shader_64bit_indexing;
    /** When true, {@code EXT_shader_atomic_float} is supported. */
    public final boolean VK_EXT_shader_atomic_float;
    /** When true, {@code EXT_shader_atomic_float2} is supported. */
    public final boolean VK_EXT_shader_atomic_float2;
    /** When true, {@code EXT_shader_demote_to_helper_invocation} is supported. */
    public final boolean VK_EXT_shader_demote_to_helper_invocation;
    /** When true, {@code EXT_shader_float8} is supported. */
    public final boolean VK_EXT_shader_float8;
    /** When true, {@code EXT_shader_image_atomic_int64} is supported. */
    public final boolean VK_EXT_shader_image_atomic_int64;
    /** When true, {@code EXT_shader_long_vector} is supported. */
    public final boolean VK_EXT_shader_long_vector;
    /** When true, {@code EXT_shader_module_identifier} is supported. */
    public final boolean VK_EXT_shader_module_identifier;
    /** When true, {@code EXT_shader_object} is supported. */
    public final boolean VK_EXT_shader_object;
    /** When true, {@code EXT_shader_replicated_composites} is supported. */
    public final boolean VK_EXT_shader_replicated_composites;
    /** When true, {@code EXT_shader_stencil_export} is supported. */
    public final boolean VK_EXT_shader_stencil_export;
    /** When true, {@code EXT_shader_subgroup_ballot} is supported. */
    public final boolean VK_EXT_shader_subgroup_ballot;
    /** When true, {@code EXT_shader_subgroup_partitioned} is supported. */
    public final boolean VK_EXT_shader_subgroup_partitioned;
    /** When true, {@code EXT_shader_subgroup_vote} is supported. */
    public final boolean VK_EXT_shader_subgroup_vote;
    /** When true, {@code EXT_shader_tile_image} is supported. */
    public final boolean VK_EXT_shader_tile_image;
    /** When true, {@code EXT_shader_uniform_buffer_unsized_array} is supported. */
    public final boolean VK_EXT_shader_uniform_buffer_unsized_array;
    /** When true, {@code EXT_shader_viewport_index_layer} is supported. */
    public final boolean VK_EXT_shader_viewport_index_layer;
    /** When true, {@code EXT_subgroup_size_control} is supported. */
    public final boolean VK_EXT_subgroup_size_control;
    /** When true, {@code EXT_subpass_merge_feedback} is supported. */
    public final boolean VK_EXT_subpass_merge_feedback;
    /** When true, {@code EXT_swapchain_maintenance1} is supported. */
    public final boolean VK_EXT_swapchain_maintenance1;
    /** When true, {@code EXT_texel_buffer_alignment} is supported. */
    public final boolean VK_EXT_texel_buffer_alignment;
    /** When true, {@code EXT_texture_compression_astc_3d} is supported. */
    public final boolean VK_EXT_texture_compression_astc_3d;
    /** When true, {@code EXT_texture_compression_astc_hdr} is supported. */
    public final boolean VK_EXT_texture_compression_astc_hdr;
    /** When true, {@code EXT_tooling_info} is supported. */
    public final boolean VK_EXT_tooling_info;
    /** When true, {@code EXT_transform_feedback} is supported. */
    public final boolean VK_EXT_transform_feedback;
    /** When true, {@code EXT_validation_cache} is supported. */
    public final boolean VK_EXT_validation_cache;
    /** When true, {@code EXT_vertex_attribute_divisor} is supported. */
    public final boolean VK_EXT_vertex_attribute_divisor;
    /** When true, {@code EXT_vertex_attribute_robustness} is supported. */
    public final boolean VK_EXT_vertex_attribute_robustness;
    /** When true, {@code EXT_vertex_input_dynamic_state} is supported. */
    public final boolean VK_EXT_vertex_input_dynamic_state;
    /** When true, {@code EXT_ycbcr_2plane_444_formats} is supported. */
    public final boolean VK_EXT_ycbcr_2plane_444_formats;
    /** When true, {@code EXT_ycbcr_image_arrays} is supported. */
    public final boolean VK_EXT_ycbcr_image_arrays;
    /** When true, {@code EXT_zero_initialize_device_memory} is supported. */
    public final boolean VK_EXT_zero_initialize_device_memory;
    /** When true, {@code GOOGLE_decorate_string} is supported. */
    public final boolean VK_GOOGLE_decorate_string;
    /** When true, {@code GOOGLE_display_timing} is supported. */
    public final boolean VK_GOOGLE_display_timing;
    /** When true, {@code GOOGLE_hlsl_functionality1} is supported. */
    public final boolean VK_GOOGLE_hlsl_functionality1;
    /** When true, {@code GOOGLE_user_type} is supported. */
    public final boolean VK_GOOGLE_user_type;
    /** When true, {@code HUAWEI_cluster_culling_shader} is supported. */
    public final boolean VK_HUAWEI_cluster_culling_shader;
    /** When true, {@code HUAWEI_hdr_vivid} is supported. */
    public final boolean VK_HUAWEI_hdr_vivid;
    /** When true, {@code HUAWEI_invocation_mask} is supported. */
    public final boolean VK_HUAWEI_invocation_mask;
    /** When true, {@code HUAWEI_subpass_shading} is supported. */
    public final boolean VK_HUAWEI_subpass_shading;
    /** When true, {@code IMG_filter_cubic} is supported. */
    public final boolean VK_IMG_filter_cubic;
    /** When true, {@code IMG_format_pvrtc} is supported. */
    public final boolean VK_IMG_format_pvrtc;
    /** When true, {@code IMG_relaxed_line_rasterization} is supported. */
    public final boolean VK_IMG_relaxed_line_rasterization;
    /** When true, {@code INTEL_performance_query} is supported. */
    public final boolean VK_INTEL_performance_query;
    /** When true, {@code INTEL_shader_integer_functions2} is supported. */
    public final boolean VK_INTEL_shader_integer_functions2;
    /** When true, {@code KHR_16bit_storage} is supported. */
    public final boolean VK_KHR_16bit_storage;
    /** When true, {@code KHR_8bit_storage} is supported. */
    public final boolean VK_KHR_8bit_storage;
    /** When true, {@code KHR_acceleration_structure} is supported. */
    public final boolean VK_KHR_acceleration_structure;
    /** When true, {@code KHR_bind_memory2} is supported. */
    public final boolean VK_KHR_bind_memory2;
    /** When true, {@code KHR_buffer_device_address} is supported. */
    public final boolean VK_KHR_buffer_device_address;
    /** When true, {@code KHR_calibrated_timestamps} is supported. */
    public final boolean VK_KHR_calibrated_timestamps;
    /** When true, {@code KHR_compute_shader_derivatives} is supported. */
    public final boolean VK_KHR_compute_shader_derivatives;
    /** When true, {@code KHR_cooperative_matrix} is supported. */
    public final boolean VK_KHR_cooperative_matrix;
    /** When true, {@code KHR_copy_commands2} is supported. */
    public final boolean VK_KHR_copy_commands2;
    /** When true, {@code KHR_copy_memory_indirect} is supported. */
    public final boolean VK_KHR_copy_memory_indirect;
    /** When true, {@code KHR_create_renderpass2} is supported. */
    public final boolean VK_KHR_create_renderpass2;
    /** When true, {@code KHR_dedicated_allocation} is supported. */
    public final boolean VK_KHR_dedicated_allocation;
    /** When true, {@code KHR_deferred_host_operations} is supported. */
    public final boolean VK_KHR_deferred_host_operations;
    /** When true, {@code KHR_depth_clamp_zero_one} is supported. */
    public final boolean VK_KHR_depth_clamp_zero_one;
    /** When true, {@code KHR_depth_stencil_resolve} is supported. */
    public final boolean VK_KHR_depth_stencil_resolve;
    /** When true, {@code KHR_descriptor_update_template} is supported. */
    public final boolean VK_KHR_descriptor_update_template;
    /** When true, {@code KHR_device_group} is supported. */
    public final boolean VK_KHR_device_group;
    /** When true, {@code KHR_display_swapchain} is supported. */
    public final boolean VK_KHR_display_swapchain;
    /** When true, {@code KHR_draw_indirect_count} is supported. */
    public final boolean VK_KHR_draw_indirect_count;
    /** When true, {@code KHR_driver_properties} is supported. */
    public final boolean VK_KHR_driver_properties;
    /** When true, {@code KHR_dynamic_rendering} is supported. */
    public final boolean VK_KHR_dynamic_rendering;
    /** When true, {@code KHR_dynamic_rendering_local_read} is supported. */
    public final boolean VK_KHR_dynamic_rendering_local_read;
    /** When true, {@code KHR_external_fence} is supported. */
    public final boolean VK_KHR_external_fence;
    /** When true, {@code KHR_external_fence_fd} is supported. */
    public final boolean VK_KHR_external_fence_fd;
    /** When true, {@code KHR_external_fence_win32} is supported. */
    public final boolean VK_KHR_external_fence_win32;
    /** When true, {@code KHR_external_memory} is supported. */
    public final boolean VK_KHR_external_memory;
    /** When true, {@code KHR_external_memory_fd} is supported. */
    public final boolean VK_KHR_external_memory_fd;
    /** When true, {@code KHR_external_memory_win32} is supported. */
    public final boolean VK_KHR_external_memory_win32;
    /** When true, {@code KHR_external_semaphore} is supported. */
    public final boolean VK_KHR_external_semaphore;
    /** When true, {@code KHR_external_semaphore_fd} is supported. */
    public final boolean VK_KHR_external_semaphore_fd;
    /** When true, {@code KHR_external_semaphore_win32} is supported. */
    public final boolean VK_KHR_external_semaphore_win32;
    /** When true, {@code KHR_format_feature_flags2} is supported. */
    public final boolean VK_KHR_format_feature_flags2;
    /** When true, {@code KHR_fragment_shader_barycentric} is supported. */
    public final boolean VK_KHR_fragment_shader_barycentric;
    /** When true, {@code KHR_fragment_shading_rate} is supported. */
    public final boolean VK_KHR_fragment_shading_rate;
    /** When true, {@code KHR_get_memory_requirements2} is supported. */
    public final boolean VK_KHR_get_memory_requirements2;
    /** When true, {@code KHR_global_priority} is supported. */
    public final boolean VK_KHR_global_priority;
    /** When true, {@code KHR_image_format_list} is supported. */
    public final boolean VK_KHR_image_format_list;
    /** When true, {@code KHR_imageless_framebuffer} is supported. */
    public final boolean VK_KHR_imageless_framebuffer;
    /** When true, {@code KHR_incremental_present} is supported. */
    public final boolean VK_KHR_incremental_present;
    /** When true, {@code KHR_index_type_uint8} is supported. */
    public final boolean VK_KHR_index_type_uint8;
    /** When true, {@code KHR_internally_synchronized_queues} is supported. */
    public final boolean VK_KHR_internally_synchronized_queues;
    /** When true, {@code KHR_line_rasterization} is supported. */
    public final boolean VK_KHR_line_rasterization;
    /** When true, {@code KHR_load_store_op_none} is supported. */
    public final boolean VK_KHR_load_store_op_none;
    /** When true, {@code KHR_maintenance1} is supported. */
    public final boolean VK_KHR_maintenance1;
    /** When true, {@code KHR_maintenance10} is supported. */
    public final boolean VK_KHR_maintenance10;
    /** When true, {@code KHR_maintenance2} is supported. */
    public final boolean VK_KHR_maintenance2;
    /** When true, {@code KHR_maintenance3} is supported. */
    public final boolean VK_KHR_maintenance3;
    /** When true, {@code KHR_maintenance4} is supported. */
    public final boolean VK_KHR_maintenance4;
    /** When true, {@code KHR_maintenance5} is supported. */
    public final boolean VK_KHR_maintenance5;
    /** When true, {@code KHR_maintenance6} is supported. */
    public final boolean VK_KHR_maintenance6;
    /** When true, {@code KHR_maintenance7} is supported. */
    public final boolean VK_KHR_maintenance7;
    /** When true, {@code KHR_maintenance8} is supported. */
    public final boolean VK_KHR_maintenance8;
    /** When true, {@code KHR_maintenance9} is supported. */
    public final boolean VK_KHR_maintenance9;
    /** When true, {@code KHR_map_memory2} is supported. */
    public final boolean VK_KHR_map_memory2;
    /** When true, {@code KHR_multiview} is supported. */
    public final boolean VK_KHR_multiview;
    /** When true, {@code KHR_performance_query} is supported. */
    public final boolean VK_KHR_performance_query;
    /** When true, {@code KHR_pipeline_binary} is supported. */
    public final boolean VK_KHR_pipeline_binary;
    /** When true, {@code KHR_pipeline_executable_properties} is supported. */
    public final boolean VK_KHR_pipeline_executable_properties;
    /** When true, {@code KHR_pipeline_library} is supported. */
    public final boolean VK_KHR_pipeline_library;
    /** When true, {@code KHR_portability_subset} is supported. */
    public final boolean VK_KHR_portability_subset;
    /** When true, {@code KHR_present_id} is supported. */
    public final boolean VK_KHR_present_id;
    /** When true, {@code KHR_present_id2} is supported. */
    public final boolean VK_KHR_present_id2;
    /** When true, {@code KHR_present_mode_fifo_latest_ready} is supported. */
    public final boolean VK_KHR_present_mode_fifo_latest_ready;
    /** When true, {@code KHR_present_wait} is supported. */
    public final boolean VK_KHR_present_wait;
    /** When true, {@code KHR_present_wait2} is supported. */
    public final boolean VK_KHR_present_wait2;
    /** When true, {@code KHR_push_descriptor} is supported. */
    public final boolean VK_KHR_push_descriptor;
    /** When true, {@code KHR_ray_query} is supported. */
    public final boolean VK_KHR_ray_query;
    /** When true, {@code KHR_ray_tracing_maintenance1} is supported. */
    public final boolean VK_KHR_ray_tracing_maintenance1;
    /** When true, {@code KHR_ray_tracing_pipeline} is supported. */
    public final boolean VK_KHR_ray_tracing_pipeline;
    /** When true, {@code KHR_ray_tracing_position_fetch} is supported. */
    public final boolean VK_KHR_ray_tracing_position_fetch;
    /** When true, {@code KHR_relaxed_block_layout} is supported. */
    public final boolean VK_KHR_relaxed_block_layout;
    /** When true, {@code KHR_robustness2} is supported. */
    public final boolean VK_KHR_robustness2;
    /** When true, {@code KHR_sampler_mirror_clamp_to_edge} is supported. */
    public final boolean VK_KHR_sampler_mirror_clamp_to_edge;
    /** When true, {@code KHR_sampler_ycbcr_conversion} is supported. */
    public final boolean VK_KHR_sampler_ycbcr_conversion;
    /** When true, {@code KHR_separate_depth_stencil_layouts} is supported. */
    public final boolean VK_KHR_separate_depth_stencil_layouts;
    /** When true, {@code KHR_shader_atomic_int64} is supported. */
    public final boolean VK_KHR_shader_atomic_int64;
    /** When true, {@code KHR_shader_bfloat16} is supported. */
    public final boolean VK_KHR_shader_bfloat16;
    /** When true, {@code KHR_shader_clock} is supported. */
    public final boolean VK_KHR_shader_clock;
    /** When true, {@code KHR_shader_draw_parameters} is supported. */
    public final boolean VK_KHR_shader_draw_parameters;
    /** When true, {@code KHR_shader_expect_assume} is supported. */
    public final boolean VK_KHR_shader_expect_assume;
    /** When true, {@code KHR_shader_float16_int8} is supported. */
    public final boolean VK_KHR_shader_float16_int8;
    /** When true, {@code KHR_shader_float_controls} is supported. */
    public final boolean VK_KHR_shader_float_controls;
    /** When true, {@code KHR_shader_float_controls2} is supported. */
    public final boolean VK_KHR_shader_float_controls2;
    /** When true, {@code KHR_shader_fma} is supported. */
    public final boolean VK_KHR_shader_fma;
    /** When true, {@code KHR_shader_integer_dot_product} is supported. */
    public final boolean VK_KHR_shader_integer_dot_product;
    /** When true, {@code KHR_shader_maximal_reconvergence} is supported. */
    public final boolean VK_KHR_shader_maximal_reconvergence;
    /** When true, {@code KHR_shader_non_semantic_info} is supported. */
    public final boolean VK_KHR_shader_non_semantic_info;
    /** When true, {@code KHR_shader_quad_control} is supported. */
    public final boolean VK_KHR_shader_quad_control;
    /** When true, {@code KHR_shader_relaxed_extended_instruction} is supported. */
    public final boolean VK_KHR_shader_relaxed_extended_instruction;
    /** When true, {@code KHR_shader_subgroup_extended_types} is supported. */
    public final boolean VK_KHR_shader_subgroup_extended_types;
    /** When true, {@code KHR_shader_subgroup_rotate} is supported. */
    public final boolean VK_KHR_shader_subgroup_rotate;
    /** When true, {@code KHR_shader_subgroup_uniform_control_flow} is supported. */
    public final boolean VK_KHR_shader_subgroup_uniform_control_flow;
    /** When true, {@code KHR_shader_terminate_invocation} is supported. */
    public final boolean VK_KHR_shader_terminate_invocation;
    /** When true, {@code KHR_shader_untyped_pointers} is supported. */
    public final boolean VK_KHR_shader_untyped_pointers;
    /** When true, {@code KHR_shared_presentable_image} is supported. */
    public final boolean VK_KHR_shared_presentable_image;
    /** When true, {@code KHR_spirv_1_4} is supported. */
    public final boolean VK_KHR_spirv_1_4;
    /** When true, {@code KHR_storage_buffer_storage_class} is supported. */
    public final boolean VK_KHR_storage_buffer_storage_class;
    /** When true, {@code KHR_swapchain} is supported. */
    public final boolean VK_KHR_swapchain;
    /** When true, {@code KHR_swapchain_maintenance1} is supported. */
    public final boolean VK_KHR_swapchain_maintenance1;
    /** When true, {@code KHR_swapchain_mutable_format} is supported. */
    public final boolean VK_KHR_swapchain_mutable_format;
    /** When true, {@code KHR_synchronization2} is supported. */
    public final boolean VK_KHR_synchronization2;
    /** When true, {@code KHR_timeline_semaphore} is supported. */
    public final boolean VK_KHR_timeline_semaphore;
    /** When true, {@code KHR_unified_image_layouts} is supported. */
    public final boolean VK_KHR_unified_image_layouts;
    /** When true, {@code KHR_uniform_buffer_standard_layout} is supported. */
    public final boolean VK_KHR_uniform_buffer_standard_layout;
    /** When true, {@code KHR_variable_pointers} is supported. */
    public final boolean VK_KHR_variable_pointers;
    /** When true, {@code KHR_vertex_attribute_divisor} is supported. */
    public final boolean VK_KHR_vertex_attribute_divisor;
    /** When true, {@code KHR_video_decode_av1} is supported. */
    public final boolean VK_KHR_video_decode_av1;
    /** When true, {@code KHR_video_decode_h264} is supported. */
    public final boolean VK_KHR_video_decode_h264;
    /** When true, {@code KHR_video_decode_h265} is supported. */
    public final boolean VK_KHR_video_decode_h265;
    /** When true, {@code KHR_video_decode_queue} is supported. */
    public final boolean VK_KHR_video_decode_queue;
    /** When true, {@code KHR_video_decode_vp9} is supported. */
    public final boolean VK_KHR_video_decode_vp9;
    /** When true, {@code KHR_video_encode_av1} is supported. */
    public final boolean VK_KHR_video_encode_av1;
    /** When true, {@code KHR_video_encode_h264} is supported. */
    public final boolean VK_KHR_video_encode_h264;
    /** When true, {@code KHR_video_encode_h265} is supported. */
    public final boolean VK_KHR_video_encode_h265;
    /** When true, {@code KHR_video_encode_intra_refresh} is supported. */
    public final boolean VK_KHR_video_encode_intra_refresh;
    /** When true, {@code KHR_video_encode_quantization_map} is supported. */
    public final boolean VK_KHR_video_encode_quantization_map;
    /** When true, {@code KHR_video_encode_queue} is supported. */
    public final boolean VK_KHR_video_encode_queue;
    /** When true, {@code KHR_video_maintenance1} is supported. */
    public final boolean VK_KHR_video_maintenance1;
    /** When true, {@code KHR_video_maintenance2} is supported. */
    public final boolean VK_KHR_video_maintenance2;
    /** When true, {@code KHR_video_queue} is supported. */
    public final boolean VK_KHR_video_queue;
    /** When true, {@code KHR_vulkan_memory_model} is supported. */
    public final boolean VK_KHR_vulkan_memory_model;
    /** When true, {@code KHR_win32_keyed_mutex} is supported. */
    public final boolean VK_KHR_win32_keyed_mutex;
    /** When true, {@code KHR_workgroup_memory_explicit_layout} is supported. */
    public final boolean VK_KHR_workgroup_memory_explicit_layout;
    /** When true, {@code KHR_zero_initialize_workgroup_memory} is supported. */
    public final boolean VK_KHR_zero_initialize_workgroup_memory;
    /** When true, {@code MESA_image_alignment_control} is supported. */
    public final boolean VK_MESA_image_alignment_control;
    /** When true, {@code MSFT_layered_driver} is supported. */
    public final boolean VK_MSFT_layered_driver;
    /** When true, {@code NV_acquire_winrt_display} is supported. */
    public final boolean VK_NV_acquire_winrt_display;
    /** When true, {@code NV_clip_space_w_scaling} is supported. */
    public final boolean VK_NV_clip_space_w_scaling;
    /** When true, {@code NV_cluster_acceleration_structure} is supported. */
    public final boolean VK_NV_cluster_acceleration_structure;
    /** When true, {@code NV_command_buffer_inheritance} is supported. */
    public final boolean VK_NV_command_buffer_inheritance;
    /** When true, {@code NV_compute_occupancy_priority} is supported. */
    public final boolean VK_NV_compute_occupancy_priority;
    /** When true, {@code NV_compute_shader_derivatives} is supported. */
    public final boolean VK_NV_compute_shader_derivatives;
    /** When true, {@code NV_cooperative_matrix} is supported. */
    public final boolean VK_NV_cooperative_matrix;
    /** When true, {@code NV_cooperative_matrix2} is supported. */
    public final boolean VK_NV_cooperative_matrix2;
    /** When true, {@code NV_cooperative_vector} is supported. */
    public final boolean VK_NV_cooperative_vector;
    /** When true, {@code NV_copy_memory_indirect} is supported. */
    public final boolean VK_NV_copy_memory_indirect;
    /** When true, {@code NV_corner_sampled_image} is supported. */
    public final boolean VK_NV_corner_sampled_image;
    /** When true, {@code NV_coverage_reduction_mode} is supported. */
    public final boolean VK_NV_coverage_reduction_mode;
    /** When true, {@code NV_cuda_kernel_launch} is supported. */
    public final boolean VK_NV_cuda_kernel_launch;
    /** When true, {@code NV_dedicated_allocation} is supported. */
    public final boolean VK_NV_dedicated_allocation;
    /** When true, {@code NV_dedicated_allocation_image_aliasing} is supported. */
    public final boolean VK_NV_dedicated_allocation_image_aliasing;
    /** When true, {@code NV_descriptor_pool_overallocation} is supported. */
    public final boolean VK_NV_descriptor_pool_overallocation;
    /** When true, {@code NV_device_diagnostic_checkpoints} is supported. */
    public final boolean VK_NV_device_diagnostic_checkpoints;
    /** When true, {@code NV_device_diagnostics_config} is supported. */
    public final boolean VK_NV_device_diagnostics_config;
    /** When true, {@code NV_device_generated_commands} is supported. */
    public final boolean VK_NV_device_generated_commands;
    /** When true, {@code NV_device_generated_commands_compute} is supported. */
    public final boolean VK_NV_device_generated_commands_compute;
    /** When true, {@code NV_displacement_micromap} is supported. */
    public final boolean VK_NV_displacement_micromap;
    /** When true, {@code NV_extended_sparse_address_space} is supported. */
    public final boolean VK_NV_extended_sparse_address_space;
    /** When true, {@code NV_external_compute_queue} is supported. */
    public final boolean VK_NV_external_compute_queue;
    /** When true, {@code NV_external_memory} is supported. */
    public final boolean VK_NV_external_memory;
    /** When true, {@code NV_external_memory_rdma} is supported. */
    public final boolean VK_NV_external_memory_rdma;
    /** When true, {@code NV_external_memory_win32} is supported. */
    public final boolean VK_NV_external_memory_win32;
    /** When true, {@code NV_fill_rectangle} is supported. */
    public final boolean VK_NV_fill_rectangle;
    /** When true, {@code NV_fragment_coverage_to_color} is supported. */
    public final boolean VK_NV_fragment_coverage_to_color;
    /** When true, {@code NV_fragment_shader_barycentric} is supported. */
    public final boolean VK_NV_fragment_shader_barycentric;
    /** When true, {@code NV_fragment_shading_rate_enums} is supported. */
    public final boolean VK_NV_fragment_shading_rate_enums;
    /** When true, {@code NV_framebuffer_mixed_samples} is supported. */
    public final boolean VK_NV_framebuffer_mixed_samples;
    /** When true, {@code NV_geometry_shader_passthrough} is supported. */
    public final boolean VK_NV_geometry_shader_passthrough;
    /** When true, {@code NV_glsl_shader} is supported. */
    public final boolean VK_NV_glsl_shader;
    /** When true, {@code NV_inherited_viewport_scissor} is supported. */
    public final boolean VK_NV_inherited_viewport_scissor;
    /** When true, {@code NV_linear_color_attachment} is supported. */
    public final boolean VK_NV_linear_color_attachment;
    /** When true, {@code NV_low_latency} is supported. */
    public final boolean VK_NV_low_latency;
    /** When true, {@code NV_low_latency2} is supported. */
    public final boolean VK_NV_low_latency2;
    /** When true, {@code NV_memory_decompression} is supported. */
    public final boolean VK_NV_memory_decompression;
    /** When true, {@code NV_mesh_shader} is supported. */
    public final boolean VK_NV_mesh_shader;
    /** When true, {@code NV_optical_flow} is supported. */
    public final boolean VK_NV_optical_flow;
    /** When true, {@code NV_partitioned_acceleration_structure} is supported. */
    public final boolean VK_NV_partitioned_acceleration_structure;
    /** When true, {@code NV_per_stage_descriptor_set} is supported. */
    public final boolean VK_NV_per_stage_descriptor_set;
    /** When true, {@code NV_present_barrier} is supported. */
    public final boolean VK_NV_present_barrier;
    /** When true, {@code NV_present_metering} is supported. */
    public final boolean VK_NV_present_metering;
    /** When true, {@code NV_push_constant_bank} is supported. */
    public final boolean VK_NV_push_constant_bank;
    /** When true, {@code NV_raw_access_chains} is supported. */
    public final boolean VK_NV_raw_access_chains;
    /** When true, {@code NV_ray_tracing} is supported. */
    public final boolean VK_NV_ray_tracing;
    /** When true, {@code NV_ray_tracing_invocation_reorder} is supported. */
    public final boolean VK_NV_ray_tracing_invocation_reorder;
    /** When true, {@code NV_ray_tracing_linear_swept_spheres} is supported. */
    public final boolean VK_NV_ray_tracing_linear_swept_spheres;
    /** When true, {@code NV_ray_tracing_motion_blur} is supported. */
    public final boolean VK_NV_ray_tracing_motion_blur;
    /** When true, {@code NV_ray_tracing_validation} is supported. */
    public final boolean VK_NV_ray_tracing_validation;
    /** When true, {@code NV_representative_fragment_test} is supported. */
    public final boolean VK_NV_representative_fragment_test;
    /** When true, {@code NV_sample_mask_override_coverage} is supported. */
    public final boolean VK_NV_sample_mask_override_coverage;
    /** When true, {@code NV_scissor_exclusive} is supported. */
    public final boolean VK_NV_scissor_exclusive;
    /** When true, {@code NV_shader_atomic_float16_vector} is supported. */
    public final boolean VK_NV_shader_atomic_float16_vector;
    /** When true, {@code NV_shader_image_footprint} is supported. */
    public final boolean VK_NV_shader_image_footprint;
    /** When true, {@code NV_shader_sm_builtins} is supported. */
    public final boolean VK_NV_shader_sm_builtins;
    /** When true, {@code NV_shader_subgroup_partitioned} is supported. */
    public final boolean VK_NV_shader_subgroup_partitioned;
    /** When true, {@code NV_shading_rate_image} is supported. */
    public final boolean VK_NV_shading_rate_image;
    /** When true, {@code NV_viewport_array2} is supported. */
    public final boolean VK_NV_viewport_array2;
    /** When true, {@code NV_viewport_swizzle} is supported. */
    public final boolean VK_NV_viewport_swizzle;
    /** When true, {@code NV_win32_keyed_mutex} is supported. */
    public final boolean VK_NV_win32_keyed_mutex;
    /** When true, {@code NVX_binary_import} is supported. */
    public final boolean VK_NVX_binary_import;
    /** When true, {@code NVX_image_view_handle} is supported. */
    public final boolean VK_NVX_image_view_handle;
    /** When true, {@code NVX_multiview_per_view_attributes} is supported. */
    public final boolean VK_NVX_multiview_per_view_attributes;
    /** When true, {@code QCOM_cooperative_matrix_conversion} is supported. */
    public final boolean VK_QCOM_cooperative_matrix_conversion;
    /** When true, {@code QCOM_data_graph_model} is supported. */
    public final boolean VK_QCOM_data_graph_model;
    /** When true, {@code QCOM_filter_cubic_clamp} is supported. */
    public final boolean VK_QCOM_filter_cubic_clamp;
    /** When true, {@code QCOM_filter_cubic_weights} is supported. */
    public final boolean VK_QCOM_filter_cubic_weights;
    /** When true, {@code QCOM_fragment_density_map_offset} is supported. */
    public final boolean VK_QCOM_fragment_density_map_offset;
    /** When true, {@code QCOM_image_processing} is supported. */
    public final boolean VK_QCOM_image_processing;
    /** When true, {@code QCOM_image_processing2} is supported. */
    public final boolean VK_QCOM_image_processing2;
    /** When true, {@code QCOM_multiview_per_view_render_areas} is supported. */
    public final boolean VK_QCOM_multiview_per_view_render_areas;
    /** When true, {@code QCOM_multiview_per_view_viewports} is supported. */
    public final boolean VK_QCOM_multiview_per_view_viewports;
    /** When true, {@code QCOM_render_pass_shader_resolve} is supported. */
    public final boolean VK_QCOM_render_pass_shader_resolve;
    /** When true, {@code QCOM_render_pass_store_ops} is supported. */
    public final boolean VK_QCOM_render_pass_store_ops;
    /** When true, {@code QCOM_render_pass_transform} is supported. */
    public final boolean VK_QCOM_render_pass_transform;
    /** When true, {@code QCOM_rotated_copy_commands} is supported. */
    public final boolean VK_QCOM_rotated_copy_commands;
    /** When true, {@code QCOM_tile_memory_heap} is supported. */
    public final boolean VK_QCOM_tile_memory_heap;
    /** When true, {@code QCOM_tile_properties} is supported. */
    public final boolean VK_QCOM_tile_properties;
    /** When true, {@code QCOM_tile_shading} is supported. */
    public final boolean VK_QCOM_tile_shading;
    /** When true, {@code QCOM_ycbcr_degamma} is supported. */
    public final boolean VK_QCOM_ycbcr_degamma;
    /** When true, {@code SEC_amigo_profiling} is supported. */
    public final boolean VK_SEC_amigo_profiling;
    /** When true, {@code SEC_pipeline_cache_incremental_mode} is supported. */
    public final boolean VK_SEC_pipeline_cache_incremental_mode;
    /** When true, {@code STD_vulkan_video_codec_av1} is supported. */
    public final boolean STD_VIDEO_STD_vulkan_video_codec_av1;
    /** When true, {@code STD_vulkan_video_codec_h264} is supported. */
    public final boolean STD_VIDEO_STD_vulkan_video_codec_h264;
    /** When true, {@code STD_vulkan_video_codec_h265} is supported. */
    public final boolean STD_VIDEO_STD_vulkan_video_codec_h265;
    /** When true, {@code STD_vulkan_video_codec_vp9} is supported. */
    public final boolean STD_VIDEO_STD_vulkan_video_codec_vp9;
    /** When true, {@code VALVE_descriptor_set_host_mapping} is supported. */
    public final boolean VK_VALVE_descriptor_set_host_mapping;
    /** When true, {@code VALVE_fragment_density_map_layered} is supported. */
    public final boolean VK_VALVE_fragment_density_map_layered;
    /** When true, {@code VALVE_mutable_descriptor_type} is supported. */
    public final boolean VK_VALVE_mutable_descriptor_type;
    /** When true, {@code VALVE_video_encode_rgb_conversion} is supported. */
    public final boolean VK_VALVE_video_encode_rgb_conversion;

    VKCapabilitiesDevice(FunctionProvider provider, VKCapabilitiesInstance capsInstance, int apiVersion, Set<String> ext) {
        this.apiVersion = apiVersion;

        long[] caps = new long[647];

        Vulkan10 = check_VK10(provider, caps, ext);
        Vulkan11 = check_VK11(provider, caps, ext);
        Vulkan12 = check_VK12(provider, caps, ext);
        Vulkan13 = check_VK13(provider, caps, ext);
        Vulkan14 = check_VK14(provider, caps, ext);
        VK_AMD_anti_lag = check_AMD_anti_lag(provider, caps, ext);
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
        VK_AMDX_dense_geometry_format = ext.contains("VK_AMDX_dense_geometry_format");
        VK_AMDX_shader_enqueue = check_AMDX_shader_enqueue(provider, caps, ext);
        VK_ANDROID_external_format_resolve = ext.contains("VK_ANDROID_external_format_resolve");
        VK_ANDROID_external_memory_android_hardware_buffer = check_ANDROID_external_memory_android_hardware_buffer(provider, caps, ext);
        VK_ARM_data_graph = check_ARM_data_graph(provider, caps, ext);
        VK_ARM_format_pack = ext.contains("VK_ARM_format_pack");
        VK_ARM_performance_counters_by_region = ext.contains("VK_ARM_performance_counters_by_region");
        VK_ARM_pipeline_opacity_micromap = ext.contains("VK_ARM_pipeline_opacity_micromap");
        VK_ARM_rasterization_order_attachment_access = ext.contains("VK_ARM_rasterization_order_attachment_access");
        VK_ARM_render_pass_striped = ext.contains("VK_ARM_render_pass_striped");
        VK_ARM_scheduling_controls = ext.contains("VK_ARM_scheduling_controls");
        VK_ARM_shader_core_builtins = ext.contains("VK_ARM_shader_core_builtins");
        VK_ARM_shader_core_properties = ext.contains("VK_ARM_shader_core_properties");
        VK_ARM_tensors = check_ARM_tensors(provider, caps, ext);
        VK_EXT_4444_formats = ext.contains("VK_EXT_4444_formats");
        VK_EXT_astc_decode_mode = ext.contains("VK_EXT_astc_decode_mode");
        VK_EXT_attachment_feedback_loop_dynamic_state = check_EXT_attachment_feedback_loop_dynamic_state(provider, caps, ext);
        VK_EXT_attachment_feedback_loop_layout = ext.contains("VK_EXT_attachment_feedback_loop_layout");
        VK_EXT_blend_operation_advanced = ext.contains("VK_EXT_blend_operation_advanced");
        VK_EXT_border_color_swizzle = ext.contains("VK_EXT_border_color_swizzle");
        VK_EXT_buffer_device_address = check_EXT_buffer_device_address(provider, caps, ext);
        VK_EXT_calibrated_timestamps = check_EXT_calibrated_timestamps(provider, caps, ext);
        VK_EXT_color_write_enable = check_EXT_color_write_enable(provider, caps, ext);
        VK_EXT_conditional_rendering = check_EXT_conditional_rendering(provider, caps, ext);
        VK_EXT_conservative_rasterization = ext.contains("VK_EXT_conservative_rasterization");
        VK_EXT_custom_border_color = ext.contains("VK_EXT_custom_border_color");
        VK_EXT_custom_resolve = check_EXT_custom_resolve(provider, caps, ext);
        VK_EXT_debug_marker = check_EXT_debug_marker(provider, caps, ext);
        VK_EXT_depth_bias_control = check_EXT_depth_bias_control(provider, caps, ext);
        VK_EXT_depth_clamp_control = check_EXT_depth_clamp_control(provider, caps, ext);
        VK_EXT_depth_clamp_zero_one = ext.contains("VK_EXT_depth_clamp_zero_one");
        VK_EXT_depth_clip_control = ext.contains("VK_EXT_depth_clip_control");
        VK_EXT_depth_clip_enable = ext.contains("VK_EXT_depth_clip_enable");
        VK_EXT_depth_range_unrestricted = ext.contains("VK_EXT_depth_range_unrestricted");
        VK_EXT_descriptor_buffer = check_EXT_descriptor_buffer(provider, caps, ext);
        VK_EXT_descriptor_heap = check_EXT_descriptor_heap(provider, caps, ext);
        VK_EXT_descriptor_indexing = ext.contains("VK_EXT_descriptor_indexing");
        VK_EXT_device_address_binding_report = ext.contains("VK_EXT_device_address_binding_report");
        VK_EXT_device_fault = check_EXT_device_fault(provider, caps, ext);
        VK_EXT_device_generated_commands = check_EXT_device_generated_commands(provider, caps, ext);
        VK_EXT_device_memory_report = ext.contains("VK_EXT_device_memory_report");
        VK_EXT_discard_rectangles = check_EXT_discard_rectangles(provider, caps, ext);
        VK_EXT_display_control = check_EXT_display_control(provider, caps, ext);
        VK_EXT_dynamic_rendering_unused_attachments = ext.contains("VK_EXT_dynamic_rendering_unused_attachments");
        VK_EXT_extended_dynamic_state = check_EXT_extended_dynamic_state(provider, caps, ext);
        VK_EXT_extended_dynamic_state2 = check_EXT_extended_dynamic_state2(provider, caps, ext);
        VK_EXT_extended_dynamic_state3 = check_EXT_extended_dynamic_state3(provider, caps, ext);
        VK_EXT_external_memory_acquire_unmodified = ext.contains("VK_EXT_external_memory_acquire_unmodified");
        VK_EXT_external_memory_dma_buf = ext.contains("VK_EXT_external_memory_dma_buf");
        VK_EXT_external_memory_host = check_EXT_external_memory_host(provider, caps, ext);
        VK_EXT_external_memory_metal = check_EXT_external_memory_metal(provider, caps, ext);
        VK_EXT_filter_cubic = ext.contains("VK_EXT_filter_cubic");
        VK_EXT_fragment_density_map = ext.contains("VK_EXT_fragment_density_map");
        VK_EXT_fragment_density_map2 = ext.contains("VK_EXT_fragment_density_map2");
        VK_EXT_fragment_density_map_offset = check_EXT_fragment_density_map_offset(provider, caps, ext);
        VK_EXT_fragment_shader_interlock = ext.contains("VK_EXT_fragment_shader_interlock");
        VK_EXT_frame_boundary = ext.contains("VK_EXT_frame_boundary");
        VK_EXT_full_screen_exclusive = check_EXT_full_screen_exclusive(provider, caps, ext);
        VK_EXT_global_priority = ext.contains("VK_EXT_global_priority");
        VK_EXT_global_priority_query = ext.contains("VK_EXT_global_priority_query");
        VK_EXT_graphics_pipeline_library = ext.contains("VK_EXT_graphics_pipeline_library");
        VK_EXT_hdr_metadata = check_EXT_hdr_metadata(provider, caps, ext);
        VK_EXT_host_image_copy = check_EXT_host_image_copy(provider, caps, ext);
        VK_EXT_host_query_reset = check_EXT_host_query_reset(provider, caps, ext);
        VK_EXT_image_2d_view_of_3d = ext.contains("VK_EXT_image_2d_view_of_3d");
        VK_EXT_image_compression_control = check_EXT_image_compression_control(provider, caps, ext);
        VK_EXT_image_compression_control_swapchain = ext.contains("VK_EXT_image_compression_control_swapchain");
        VK_EXT_image_drm_format_modifier = check_EXT_image_drm_format_modifier(provider, caps, ext);
        VK_EXT_image_robustness = ext.contains("VK_EXT_image_robustness");
        VK_EXT_image_sliced_view_of_3d = ext.contains("VK_EXT_image_sliced_view_of_3d");
        VK_EXT_image_view_min_lod = ext.contains("VK_EXT_image_view_min_lod");
        VK_EXT_index_type_uint8 = ext.contains("VK_EXT_index_type_uint8");
        VK_EXT_inline_uniform_block = ext.contains("VK_EXT_inline_uniform_block");
        VK_EXT_legacy_dithering = ext.contains("VK_EXT_legacy_dithering");
        VK_EXT_legacy_vertex_attributes = ext.contains("VK_EXT_legacy_vertex_attributes");
        VK_EXT_line_rasterization = check_EXT_line_rasterization(provider, caps, ext);
        VK_EXT_load_store_op_none = ext.contains("VK_EXT_load_store_op_none");
        VK_EXT_map_memory_placed = ext.contains("VK_EXT_map_memory_placed");
        VK_EXT_memory_budget = ext.contains("VK_EXT_memory_budget");
        VK_EXT_memory_decompression = check_EXT_memory_decompression(provider, caps, ext);
        VK_EXT_memory_priority = ext.contains("VK_EXT_memory_priority");
        VK_EXT_mesh_shader = check_EXT_mesh_shader(provider, caps, ext);
        VK_EXT_metal_objects = check_EXT_metal_objects(provider, caps, ext);
        VK_EXT_multi_draw = check_EXT_multi_draw(provider, caps, ext);
        VK_EXT_multisampled_render_to_single_sampled = ext.contains("VK_EXT_multisampled_render_to_single_sampled");
        VK_EXT_mutable_descriptor_type = ext.contains("VK_EXT_mutable_descriptor_type");
        VK_EXT_nested_command_buffer = ext.contains("VK_EXT_nested_command_buffer");
        VK_EXT_non_seamless_cube_map = ext.contains("VK_EXT_non_seamless_cube_map");
        VK_EXT_opacity_micromap = check_EXT_opacity_micromap(provider, caps, ext);
        VK_EXT_pageable_device_local_memory = check_EXT_pageable_device_local_memory(provider, caps, ext);
        VK_EXT_pci_bus_info = ext.contains("VK_EXT_pci_bus_info");
        VK_EXT_physical_device_drm = ext.contains("VK_EXT_physical_device_drm");
        VK_EXT_pipeline_creation_cache_control = ext.contains("VK_EXT_pipeline_creation_cache_control");
        VK_EXT_pipeline_creation_feedback = ext.contains("VK_EXT_pipeline_creation_feedback");
        VK_EXT_pipeline_library_group_handles = ext.contains("VK_EXT_pipeline_library_group_handles");
        VK_EXT_pipeline_properties = check_EXT_pipeline_properties(provider, caps, ext);
        VK_EXT_pipeline_protected_access = ext.contains("VK_EXT_pipeline_protected_access");
        VK_EXT_pipeline_robustness = ext.contains("VK_EXT_pipeline_robustness");
        VK_EXT_post_depth_coverage = ext.contains("VK_EXT_post_depth_coverage");
        VK_EXT_present_mode_fifo_latest_ready = ext.contains("VK_EXT_present_mode_fifo_latest_ready");
        VK_EXT_present_timing = check_EXT_present_timing(provider, caps, ext);
        VK_EXT_primitive_topology_list_restart = ext.contains("VK_EXT_primitive_topology_list_restart");
        VK_EXT_primitives_generated_query = ext.contains("VK_EXT_primitives_generated_query");
        VK_EXT_private_data = check_EXT_private_data(provider, caps, ext);
        VK_EXT_provoking_vertex = ext.contains("VK_EXT_provoking_vertex");
        VK_EXT_queue_family_foreign = ext.contains("VK_EXT_queue_family_foreign");
        VK_EXT_rasterization_order_attachment_access = ext.contains("VK_EXT_rasterization_order_attachment_access");
        VK_EXT_ray_tracing_invocation_reorder = ext.contains("VK_EXT_ray_tracing_invocation_reorder");
        VK_EXT_rgba10x6_formats = ext.contains("VK_EXT_rgba10x6_formats");
        VK_EXT_robustness2 = ext.contains("VK_EXT_robustness2");
        VK_EXT_sample_locations = check_EXT_sample_locations(provider, caps, ext);
        VK_EXT_sampler_filter_minmax = ext.contains("VK_EXT_sampler_filter_minmax");
        VK_EXT_scalar_block_layout = ext.contains("VK_EXT_scalar_block_layout");
        VK_EXT_separate_stencil_usage = ext.contains("VK_EXT_separate_stencil_usage");
        VK_EXT_shader_64bit_indexing = ext.contains("VK_EXT_shader_64bit_indexing");
        VK_EXT_shader_atomic_float = ext.contains("VK_EXT_shader_atomic_float");
        VK_EXT_shader_atomic_float2 = ext.contains("VK_EXT_shader_atomic_float2");
        VK_EXT_shader_demote_to_helper_invocation = ext.contains("VK_EXT_shader_demote_to_helper_invocation");
        VK_EXT_shader_float8 = ext.contains("VK_EXT_shader_float8");
        VK_EXT_shader_image_atomic_int64 = ext.contains("VK_EXT_shader_image_atomic_int64");
        VK_EXT_shader_long_vector = ext.contains("VK_EXT_shader_long_vector");
        VK_EXT_shader_module_identifier = check_EXT_shader_module_identifier(provider, caps, ext);
        VK_EXT_shader_object = check_EXT_shader_object(provider, caps, ext);
        VK_EXT_shader_replicated_composites = ext.contains("VK_EXT_shader_replicated_composites");
        VK_EXT_shader_stencil_export = ext.contains("VK_EXT_shader_stencil_export");
        VK_EXT_shader_subgroup_ballot = ext.contains("VK_EXT_shader_subgroup_ballot");
        VK_EXT_shader_subgroup_partitioned = ext.contains("VK_EXT_shader_subgroup_partitioned");
        VK_EXT_shader_subgroup_vote = ext.contains("VK_EXT_shader_subgroup_vote");
        VK_EXT_shader_tile_image = ext.contains("VK_EXT_shader_tile_image");
        VK_EXT_shader_uniform_buffer_unsized_array = ext.contains("VK_EXT_shader_uniform_buffer_unsized_array");
        VK_EXT_shader_viewport_index_layer = ext.contains("VK_EXT_shader_viewport_index_layer");
        VK_EXT_subgroup_size_control = ext.contains("VK_EXT_subgroup_size_control");
        VK_EXT_subpass_merge_feedback = ext.contains("VK_EXT_subpass_merge_feedback");
        VK_EXT_swapchain_maintenance1 = check_EXT_swapchain_maintenance1(provider, caps, ext);
        VK_EXT_texel_buffer_alignment = ext.contains("VK_EXT_texel_buffer_alignment");
        VK_EXT_texture_compression_astc_3d = ext.contains("VK_EXT_texture_compression_astc_3d");
        VK_EXT_texture_compression_astc_hdr = ext.contains("VK_EXT_texture_compression_astc_hdr");
        VK_EXT_tooling_info = ext.contains("VK_EXT_tooling_info");
        VK_EXT_transform_feedback = check_EXT_transform_feedback(provider, caps, ext);
        VK_EXT_validation_cache = check_EXT_validation_cache(provider, caps, ext);
        VK_EXT_vertex_attribute_divisor = ext.contains("VK_EXT_vertex_attribute_divisor");
        VK_EXT_vertex_attribute_robustness = ext.contains("VK_EXT_vertex_attribute_robustness");
        VK_EXT_vertex_input_dynamic_state = check_EXT_vertex_input_dynamic_state(provider, caps, ext);
        VK_EXT_ycbcr_2plane_444_formats = ext.contains("VK_EXT_ycbcr_2plane_444_formats");
        VK_EXT_ycbcr_image_arrays = ext.contains("VK_EXT_ycbcr_image_arrays");
        VK_EXT_zero_initialize_device_memory = ext.contains("VK_EXT_zero_initialize_device_memory");
        VK_GOOGLE_decorate_string = ext.contains("VK_GOOGLE_decorate_string");
        VK_GOOGLE_display_timing = check_GOOGLE_display_timing(provider, caps, ext);
        VK_GOOGLE_hlsl_functionality1 = ext.contains("VK_GOOGLE_hlsl_functionality1");
        VK_GOOGLE_user_type = ext.contains("VK_GOOGLE_user_type");
        VK_HUAWEI_cluster_culling_shader = check_HUAWEI_cluster_culling_shader(provider, caps, ext);
        VK_HUAWEI_hdr_vivid = ext.contains("VK_HUAWEI_hdr_vivid");
        VK_HUAWEI_invocation_mask = check_HUAWEI_invocation_mask(provider, caps, ext);
        VK_HUAWEI_subpass_shading = check_HUAWEI_subpass_shading(provider, caps, ext);
        VK_IMG_filter_cubic = ext.contains("VK_IMG_filter_cubic");
        VK_IMG_format_pvrtc = ext.contains("VK_IMG_format_pvrtc");
        VK_IMG_relaxed_line_rasterization = ext.contains("VK_IMG_relaxed_line_rasterization");
        VK_INTEL_performance_query = check_INTEL_performance_query(provider, caps, ext);
        VK_INTEL_shader_integer_functions2 = ext.contains("VK_INTEL_shader_integer_functions2");
        VK_KHR_16bit_storage = ext.contains("VK_KHR_16bit_storage");
        VK_KHR_8bit_storage = ext.contains("VK_KHR_8bit_storage");
        VK_KHR_acceleration_structure = check_KHR_acceleration_structure(provider, caps, ext);
        VK_KHR_bind_memory2 = check_KHR_bind_memory2(provider, caps, ext);
        VK_KHR_buffer_device_address = check_KHR_buffer_device_address(provider, caps, ext);
        VK_KHR_calibrated_timestamps = check_KHR_calibrated_timestamps(provider, caps, ext);
        VK_KHR_compute_shader_derivatives = ext.contains("VK_KHR_compute_shader_derivatives");
        VK_KHR_cooperative_matrix = ext.contains("VK_KHR_cooperative_matrix");
        VK_KHR_copy_commands2 = check_KHR_copy_commands2(provider, caps, ext);
        VK_KHR_copy_memory_indirect = check_KHR_copy_memory_indirect(provider, caps, ext);
        VK_KHR_create_renderpass2 = check_KHR_create_renderpass2(provider, caps, ext);
        VK_KHR_dedicated_allocation = ext.contains("VK_KHR_dedicated_allocation");
        VK_KHR_deferred_host_operations = check_KHR_deferred_host_operations(provider, caps, ext);
        VK_KHR_depth_clamp_zero_one = ext.contains("VK_KHR_depth_clamp_zero_one");
        VK_KHR_depth_stencil_resolve = ext.contains("VK_KHR_depth_stencil_resolve");
        VK_KHR_descriptor_update_template = check_KHR_descriptor_update_template(provider, caps, ext);
        VK_KHR_device_group = check_KHR_device_group(provider, caps, ext);
        VK_KHR_display_swapchain = check_KHR_display_swapchain(provider, caps, ext);
        VK_KHR_draw_indirect_count = check_KHR_draw_indirect_count(provider, caps, ext);
        VK_KHR_driver_properties = ext.contains("VK_KHR_driver_properties");
        VK_KHR_dynamic_rendering = check_KHR_dynamic_rendering(provider, caps, ext);
        VK_KHR_dynamic_rendering_local_read = check_KHR_dynamic_rendering_local_read(provider, caps, ext);
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
        VK_KHR_index_type_uint8 = ext.contains("VK_KHR_index_type_uint8");
        VK_KHR_internally_synchronized_queues = ext.contains("VK_KHR_internally_synchronized_queues");
        VK_KHR_line_rasterization = check_KHR_line_rasterization(provider, caps, ext);
        VK_KHR_load_store_op_none = ext.contains("VK_KHR_load_store_op_none");
        VK_KHR_maintenance1 = check_KHR_maintenance1(provider, caps, ext);
        VK_KHR_maintenance10 = check_KHR_maintenance10(provider, caps, ext);
        VK_KHR_maintenance2 = ext.contains("VK_KHR_maintenance2");
        VK_KHR_maintenance3 = check_KHR_maintenance3(provider, caps, ext);
        VK_KHR_maintenance4 = check_KHR_maintenance4(provider, caps, ext);
        VK_KHR_maintenance5 = check_KHR_maintenance5(provider, caps, ext);
        VK_KHR_maintenance6 = check_KHR_maintenance6(provider, caps, ext);
        VK_KHR_maintenance7 = ext.contains("VK_KHR_maintenance7");
        VK_KHR_maintenance8 = ext.contains("VK_KHR_maintenance8");
        VK_KHR_maintenance9 = ext.contains("VK_KHR_maintenance9");
        VK_KHR_map_memory2 = check_KHR_map_memory2(provider, caps, ext);
        VK_KHR_multiview = ext.contains("VK_KHR_multiview");
        VK_KHR_performance_query = check_KHR_performance_query(provider, caps, ext);
        VK_KHR_pipeline_binary = check_KHR_pipeline_binary(provider, caps, ext);
        VK_KHR_pipeline_executable_properties = check_KHR_pipeline_executable_properties(provider, caps, ext);
        VK_KHR_pipeline_library = ext.contains("VK_KHR_pipeline_library");
        VK_KHR_portability_subset = ext.contains("VK_KHR_portability_subset");
        VK_KHR_present_id = ext.contains("VK_KHR_present_id");
        VK_KHR_present_id2 = ext.contains("VK_KHR_present_id2");
        VK_KHR_present_mode_fifo_latest_ready = ext.contains("VK_KHR_present_mode_fifo_latest_ready");
        VK_KHR_present_wait = check_KHR_present_wait(provider, caps, ext);
        VK_KHR_present_wait2 = check_KHR_present_wait2(provider, caps, ext);
        VK_KHR_push_descriptor = check_KHR_push_descriptor(provider, caps, ext);
        VK_KHR_ray_query = ext.contains("VK_KHR_ray_query");
        VK_KHR_ray_tracing_maintenance1 = check_KHR_ray_tracing_maintenance1(provider, caps, ext);
        VK_KHR_ray_tracing_pipeline = check_KHR_ray_tracing_pipeline(provider, caps, ext);
        VK_KHR_ray_tracing_position_fetch = ext.contains("VK_KHR_ray_tracing_position_fetch");
        VK_KHR_relaxed_block_layout = ext.contains("VK_KHR_relaxed_block_layout");
        VK_KHR_robustness2 = ext.contains("VK_KHR_robustness2");
        VK_KHR_sampler_mirror_clamp_to_edge = ext.contains("VK_KHR_sampler_mirror_clamp_to_edge");
        VK_KHR_sampler_ycbcr_conversion = check_KHR_sampler_ycbcr_conversion(provider, caps, ext);
        VK_KHR_separate_depth_stencil_layouts = ext.contains("VK_KHR_separate_depth_stencil_layouts");
        VK_KHR_shader_atomic_int64 = ext.contains("VK_KHR_shader_atomic_int64");
        VK_KHR_shader_bfloat16 = ext.contains("VK_KHR_shader_bfloat16");
        VK_KHR_shader_clock = ext.contains("VK_KHR_shader_clock");
        VK_KHR_shader_draw_parameters = ext.contains("VK_KHR_shader_draw_parameters");
        VK_KHR_shader_expect_assume = ext.contains("VK_KHR_shader_expect_assume");
        VK_KHR_shader_float16_int8 = ext.contains("VK_KHR_shader_float16_int8");
        VK_KHR_shader_float_controls = ext.contains("VK_KHR_shader_float_controls");
        VK_KHR_shader_float_controls2 = ext.contains("VK_KHR_shader_float_controls2");
        VK_KHR_shader_fma = ext.contains("VK_KHR_shader_fma");
        VK_KHR_shader_integer_dot_product = ext.contains("VK_KHR_shader_integer_dot_product");
        VK_KHR_shader_maximal_reconvergence = ext.contains("VK_KHR_shader_maximal_reconvergence");
        VK_KHR_shader_non_semantic_info = ext.contains("VK_KHR_shader_non_semantic_info");
        VK_KHR_shader_quad_control = ext.contains("VK_KHR_shader_quad_control");
        VK_KHR_shader_relaxed_extended_instruction = ext.contains("VK_KHR_shader_relaxed_extended_instruction");
        VK_KHR_shader_subgroup_extended_types = ext.contains("VK_KHR_shader_subgroup_extended_types");
        VK_KHR_shader_subgroup_rotate = ext.contains("VK_KHR_shader_subgroup_rotate");
        VK_KHR_shader_subgroup_uniform_control_flow = ext.contains("VK_KHR_shader_subgroup_uniform_control_flow");
        VK_KHR_shader_terminate_invocation = ext.contains("VK_KHR_shader_terminate_invocation");
        VK_KHR_shader_untyped_pointers = ext.contains("VK_KHR_shader_untyped_pointers");
        VK_KHR_shared_presentable_image = check_KHR_shared_presentable_image(provider, caps, ext);
        VK_KHR_spirv_1_4 = ext.contains("VK_KHR_spirv_1_4");
        VK_KHR_storage_buffer_storage_class = ext.contains("VK_KHR_storage_buffer_storage_class");
        VK_KHR_swapchain = check_KHR_swapchain(provider, caps, ext);
        VK_KHR_swapchain_maintenance1 = check_KHR_swapchain_maintenance1(provider, caps, ext);
        VK_KHR_swapchain_mutable_format = ext.contains("VK_KHR_swapchain_mutable_format");
        VK_KHR_synchronization2 = check_KHR_synchronization2(provider, caps, ext);
        VK_KHR_timeline_semaphore = check_KHR_timeline_semaphore(provider, caps, ext);
        VK_KHR_unified_image_layouts = ext.contains("VK_KHR_unified_image_layouts");
        VK_KHR_uniform_buffer_standard_layout = ext.contains("VK_KHR_uniform_buffer_standard_layout");
        VK_KHR_variable_pointers = ext.contains("VK_KHR_variable_pointers");
        VK_KHR_vertex_attribute_divisor = ext.contains("VK_KHR_vertex_attribute_divisor");
        VK_KHR_video_decode_av1 = ext.contains("VK_KHR_video_decode_av1");
        VK_KHR_video_decode_h264 = ext.contains("VK_KHR_video_decode_h264");
        VK_KHR_video_decode_h265 = ext.contains("VK_KHR_video_decode_h265");
        VK_KHR_video_decode_queue = check_KHR_video_decode_queue(provider, caps, ext);
        VK_KHR_video_decode_vp9 = ext.contains("VK_KHR_video_decode_vp9");
        VK_KHR_video_encode_av1 = ext.contains("VK_KHR_video_encode_av1");
        VK_KHR_video_encode_h264 = ext.contains("VK_KHR_video_encode_h264");
        VK_KHR_video_encode_h265 = ext.contains("VK_KHR_video_encode_h265");
        VK_KHR_video_encode_intra_refresh = ext.contains("VK_KHR_video_encode_intra_refresh");
        VK_KHR_video_encode_quantization_map = ext.contains("VK_KHR_video_encode_quantization_map");
        VK_KHR_video_encode_queue = check_KHR_video_encode_queue(provider, caps, ext);
        VK_KHR_video_maintenance1 = ext.contains("VK_KHR_video_maintenance1");
        VK_KHR_video_maintenance2 = ext.contains("VK_KHR_video_maintenance2");
        VK_KHR_video_queue = check_KHR_video_queue(provider, caps, ext);
        VK_KHR_vulkan_memory_model = ext.contains("VK_KHR_vulkan_memory_model");
        VK_KHR_win32_keyed_mutex = ext.contains("VK_KHR_win32_keyed_mutex");
        VK_KHR_workgroup_memory_explicit_layout = ext.contains("VK_KHR_workgroup_memory_explicit_layout");
        VK_KHR_zero_initialize_workgroup_memory = ext.contains("VK_KHR_zero_initialize_workgroup_memory");
        VK_MESA_image_alignment_control = ext.contains("VK_MESA_image_alignment_control");
        VK_MSFT_layered_driver = ext.contains("VK_MSFT_layered_driver");
        VK_NV_acquire_winrt_display = ext.contains("VK_NV_acquire_winrt_display");
        VK_NV_clip_space_w_scaling = check_NV_clip_space_w_scaling(provider, caps, ext);
        VK_NV_cluster_acceleration_structure = check_NV_cluster_acceleration_structure(provider, caps, ext);
        VK_NV_command_buffer_inheritance = ext.contains("VK_NV_command_buffer_inheritance");
        VK_NV_compute_occupancy_priority = check_NV_compute_occupancy_priority(provider, caps, ext);
        VK_NV_compute_shader_derivatives = ext.contains("VK_NV_compute_shader_derivatives");
        VK_NV_cooperative_matrix = ext.contains("VK_NV_cooperative_matrix");
        VK_NV_cooperative_matrix2 = ext.contains("VK_NV_cooperative_matrix2");
        VK_NV_cooperative_vector = check_NV_cooperative_vector(provider, caps, ext);
        VK_NV_copy_memory_indirect = check_NV_copy_memory_indirect(provider, caps, ext);
        VK_NV_corner_sampled_image = ext.contains("VK_NV_corner_sampled_image");
        VK_NV_coverage_reduction_mode = ext.contains("VK_NV_coverage_reduction_mode");
        VK_NV_cuda_kernel_launch = check_NV_cuda_kernel_launch(provider, caps, ext);
        VK_NV_dedicated_allocation = ext.contains("VK_NV_dedicated_allocation");
        VK_NV_dedicated_allocation_image_aliasing = ext.contains("VK_NV_dedicated_allocation_image_aliasing");
        VK_NV_descriptor_pool_overallocation = ext.contains("VK_NV_descriptor_pool_overallocation");
        VK_NV_device_diagnostic_checkpoints = check_NV_device_diagnostic_checkpoints(provider, caps, ext);
        VK_NV_device_diagnostics_config = ext.contains("VK_NV_device_diagnostics_config");
        VK_NV_device_generated_commands = check_NV_device_generated_commands(provider, caps, ext);
        VK_NV_device_generated_commands_compute = check_NV_device_generated_commands_compute(provider, caps, ext);
        VK_NV_displacement_micromap = ext.contains("VK_NV_displacement_micromap");
        VK_NV_extended_sparse_address_space = ext.contains("VK_NV_extended_sparse_address_space");
        VK_NV_external_compute_queue = check_NV_external_compute_queue(provider, caps, ext);
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
        VK_NV_low_latency = ext.contains("VK_NV_low_latency");
        VK_NV_low_latency2 = check_NV_low_latency2(provider, caps, ext);
        VK_NV_memory_decompression = check_NV_memory_decompression(provider, caps, ext);
        VK_NV_mesh_shader = check_NV_mesh_shader(provider, caps, ext);
        VK_NV_optical_flow = check_NV_optical_flow(provider, caps, ext);
        VK_NV_partitioned_acceleration_structure = check_NV_partitioned_acceleration_structure(provider, caps, ext);
        VK_NV_per_stage_descriptor_set = ext.contains("VK_NV_per_stage_descriptor_set");
        VK_NV_present_barrier = ext.contains("VK_NV_present_barrier");
        VK_NV_present_metering = ext.contains("VK_NV_present_metering");
        VK_NV_push_constant_bank = ext.contains("VK_NV_push_constant_bank");
        VK_NV_raw_access_chains = ext.contains("VK_NV_raw_access_chains");
        VK_NV_ray_tracing = check_NV_ray_tracing(provider, caps, ext);
        VK_NV_ray_tracing_invocation_reorder = ext.contains("VK_NV_ray_tracing_invocation_reorder");
        VK_NV_ray_tracing_linear_swept_spheres = ext.contains("VK_NV_ray_tracing_linear_swept_spheres");
        VK_NV_ray_tracing_motion_blur = ext.contains("VK_NV_ray_tracing_motion_blur");
        VK_NV_ray_tracing_validation = ext.contains("VK_NV_ray_tracing_validation");
        VK_NV_representative_fragment_test = ext.contains("VK_NV_representative_fragment_test");
        VK_NV_sample_mask_override_coverage = ext.contains("VK_NV_sample_mask_override_coverage");
        VK_NV_scissor_exclusive = check_NV_scissor_exclusive(provider, caps, ext);
        VK_NV_shader_atomic_float16_vector = ext.contains("VK_NV_shader_atomic_float16_vector");
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
        VK_QCOM_cooperative_matrix_conversion = ext.contains("VK_QCOM_cooperative_matrix_conversion");
        VK_QCOM_data_graph_model = ext.contains("VK_QCOM_data_graph_model");
        VK_QCOM_filter_cubic_clamp = ext.contains("VK_QCOM_filter_cubic_clamp");
        VK_QCOM_filter_cubic_weights = ext.contains("VK_QCOM_filter_cubic_weights");
        VK_QCOM_fragment_density_map_offset = ext.contains("VK_QCOM_fragment_density_map_offset");
        VK_QCOM_image_processing = ext.contains("VK_QCOM_image_processing");
        VK_QCOM_image_processing2 = ext.contains("VK_QCOM_image_processing2");
        VK_QCOM_multiview_per_view_render_areas = ext.contains("VK_QCOM_multiview_per_view_render_areas");
        VK_QCOM_multiview_per_view_viewports = ext.contains("VK_QCOM_multiview_per_view_viewports");
        VK_QCOM_render_pass_shader_resolve = ext.contains("VK_QCOM_render_pass_shader_resolve");
        VK_QCOM_render_pass_store_ops = ext.contains("VK_QCOM_render_pass_store_ops");
        VK_QCOM_render_pass_transform = ext.contains("VK_QCOM_render_pass_transform");
        VK_QCOM_rotated_copy_commands = ext.contains("VK_QCOM_rotated_copy_commands");
        VK_QCOM_tile_memory_heap = check_QCOM_tile_memory_heap(provider, caps, ext);
        VK_QCOM_tile_properties = check_QCOM_tile_properties(provider, caps, ext);
        VK_QCOM_tile_shading = check_QCOM_tile_shading(provider, caps, ext);
        VK_QCOM_ycbcr_degamma = ext.contains("VK_QCOM_ycbcr_degamma");
        VK_SEC_amigo_profiling = ext.contains("VK_SEC_amigo_profiling");
        VK_SEC_pipeline_cache_incremental_mode = ext.contains("VK_SEC_pipeline_cache_incremental_mode");
        STD_VIDEO_STD_vulkan_video_codec_av1 = ext.contains("STD_VIDEO_STD_vulkan_video_codec_av1");
        STD_VIDEO_STD_vulkan_video_codec_h264 = ext.contains("STD_VIDEO_STD_vulkan_video_codec_h264");
        STD_VIDEO_STD_vulkan_video_codec_h265 = ext.contains("STD_VIDEO_STD_vulkan_video_codec_h265");
        STD_VIDEO_STD_vulkan_video_codec_vp9 = ext.contains("STD_VIDEO_STD_vulkan_video_codec_vp9");
        VK_VALVE_descriptor_set_host_mapping = check_VALVE_descriptor_set_host_mapping(provider, caps, ext);
        VK_VALVE_fragment_density_map_layered = ext.contains("VK_VALVE_fragment_density_map_layered");
        VK_VALVE_mutable_descriptor_type = ext.contains("VK_VALVE_mutable_descriptor_type");
        VK_VALVE_video_encode_rgb_conversion = ext.contains("VK_VALVE_video_encode_rgb_conversion");

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
        vkCreateQueryPool = caps[26];
        vkDestroyQueryPool = caps[27];
        vkGetQueryPoolResults = caps[28];
        vkCreateBuffer = caps[29];
        vkDestroyBuffer = caps[30];
        vkCreateImage = caps[31];
        vkDestroyImage = caps[32];
        vkGetImageSubresourceLayout = caps[33];
        vkCreateImageView = caps[34];
        vkDestroyImageView = caps[35];
        vkCreateCommandPool = caps[36];
        vkDestroyCommandPool = caps[37];
        vkResetCommandPool = caps[38];
        vkAllocateCommandBuffers = caps[39];
        vkFreeCommandBuffers = caps[40];
        vkBeginCommandBuffer = caps[41];
        vkEndCommandBuffer = caps[42];
        vkResetCommandBuffer = caps[43];
        vkCmdCopyBuffer = caps[44];
        vkCmdCopyImage = caps[45];
        vkCmdCopyBufferToImage = caps[46];
        vkCmdCopyImageToBuffer = caps[47];
        vkCmdUpdateBuffer = caps[48];
        vkCmdFillBuffer = caps[49];
        vkCmdPipelineBarrier = caps[50];
        vkCmdBeginQuery = caps[51];
        vkCmdEndQuery = caps[52];
        vkCmdResetQueryPool = caps[53];
        vkCmdWriteTimestamp = caps[54];
        vkCmdCopyQueryPoolResults = caps[55];
        vkCmdExecuteCommands = caps[56];
        vkCreateEvent = caps[57];
        vkDestroyEvent = caps[58];
        vkGetEventStatus = caps[59];
        vkSetEvent = caps[60];
        vkResetEvent = caps[61];
        vkCreateBufferView = caps[62];
        vkDestroyBufferView = caps[63];
        vkCreateShaderModule = caps[64];
        vkDestroyShaderModule = caps[65];
        vkCreatePipelineCache = caps[66];
        vkDestroyPipelineCache = caps[67];
        vkGetPipelineCacheData = caps[68];
        vkMergePipelineCaches = caps[69];
        vkCreateComputePipelines = caps[70];
        vkDestroyPipeline = caps[71];
        vkCreatePipelineLayout = caps[72];
        vkDestroyPipelineLayout = caps[73];
        vkCreateSampler = caps[74];
        vkDestroySampler = caps[75];
        vkCreateDescriptorSetLayout = caps[76];
        vkDestroyDescriptorSetLayout = caps[77];
        vkCreateDescriptorPool = caps[78];
        vkDestroyDescriptorPool = caps[79];
        vkResetDescriptorPool = caps[80];
        vkAllocateDescriptorSets = caps[81];
        vkFreeDescriptorSets = caps[82];
        vkUpdateDescriptorSets = caps[83];
        vkCmdBindPipeline = caps[84];
        vkCmdBindDescriptorSets = caps[85];
        vkCmdClearColorImage = caps[86];
        vkCmdDispatch = caps[87];
        vkCmdDispatchIndirect = caps[88];
        vkCmdSetEvent = caps[89];
        vkCmdResetEvent = caps[90];
        vkCmdWaitEvents = caps[91];
        vkCmdPushConstants = caps[92];
        vkCreateGraphicsPipelines = caps[93];
        vkCreateFramebuffer = caps[94];
        vkDestroyFramebuffer = caps[95];
        vkCreateRenderPass = caps[96];
        vkDestroyRenderPass = caps[97];
        vkGetRenderAreaGranularity = caps[98];
        vkCmdSetViewport = caps[99];
        vkCmdSetScissor = caps[100];
        vkCmdSetLineWidth = caps[101];
        vkCmdSetDepthBias = caps[102];
        vkCmdSetBlendConstants = caps[103];
        vkCmdSetDepthBounds = caps[104];
        vkCmdSetStencilCompareMask = caps[105];
        vkCmdSetStencilWriteMask = caps[106];
        vkCmdSetStencilReference = caps[107];
        vkCmdBindIndexBuffer = caps[108];
        vkCmdBindVertexBuffers = caps[109];
        vkCmdDraw = caps[110];
        vkCmdDrawIndexed = caps[111];
        vkCmdDrawIndirect = caps[112];
        vkCmdDrawIndexedIndirect = caps[113];
        vkCmdBlitImage = caps[114];
        vkCmdClearDepthStencilImage = caps[115];
        vkCmdClearAttachments = caps[116];
        vkCmdResolveImage = caps[117];
        vkCmdBeginRenderPass = caps[118];
        vkCmdNextSubpass = caps[119];
        vkCmdEndRenderPass = caps[120];
        vkBindBufferMemory2 = caps[121];
        vkBindImageMemory2 = caps[122];
        vkGetDeviceGroupPeerMemoryFeatures = caps[123];
        vkCmdSetDeviceMask = caps[124];
        vkGetImageMemoryRequirements2 = caps[125];
        vkGetBufferMemoryRequirements2 = caps[126];
        vkGetImageSparseMemoryRequirements2 = caps[127];
        vkTrimCommandPool = caps[128];
        vkGetDeviceQueue2 = caps[129];
        vkCmdDispatchBase = caps[130];
        vkCreateDescriptorUpdateTemplate = caps[131];
        vkDestroyDescriptorUpdateTemplate = caps[132];
        vkUpdateDescriptorSetWithTemplate = caps[133];
        vkGetDescriptorSetLayoutSupport = caps[134];
        vkCreateSamplerYcbcrConversion = caps[135];
        vkDestroySamplerYcbcrConversion = caps[136];
        vkResetQueryPool = caps[137];
        vkGetSemaphoreCounterValue = caps[138];
        vkWaitSemaphores = caps[139];
        vkSignalSemaphore = caps[140];
        vkGetBufferDeviceAddress = caps[141];
        vkGetBufferOpaqueCaptureAddress = caps[142];
        vkGetDeviceMemoryOpaqueCaptureAddress = caps[143];
        vkCmdDrawIndirectCount = caps[144];
        vkCmdDrawIndexedIndirectCount = caps[145];
        vkCreateRenderPass2 = caps[146];
        vkCmdBeginRenderPass2 = caps[147];
        vkCmdNextSubpass2 = caps[148];
        vkCmdEndRenderPass2 = caps[149];
        vkCreatePrivateDataSlot = caps[150];
        vkDestroyPrivateDataSlot = caps[151];
        vkSetPrivateData = caps[152];
        vkGetPrivateData = caps[153];
        vkCmdPipelineBarrier2 = caps[154];
        vkCmdWriteTimestamp2 = caps[155];
        vkQueueSubmit2 = caps[156];
        vkCmdCopyBuffer2 = caps[157];
        vkCmdCopyImage2 = caps[158];
        vkCmdCopyBufferToImage2 = caps[159];
        vkCmdCopyImageToBuffer2 = caps[160];
        vkGetDeviceBufferMemoryRequirements = caps[161];
        vkGetDeviceImageMemoryRequirements = caps[162];
        vkGetDeviceImageSparseMemoryRequirements = caps[163];
        vkCmdSetEvent2 = caps[164];
        vkCmdResetEvent2 = caps[165];
        vkCmdWaitEvents2 = caps[166];
        vkCmdBlitImage2 = caps[167];
        vkCmdResolveImage2 = caps[168];
        vkCmdBeginRendering = caps[169];
        vkCmdEndRendering = caps[170];
        vkCmdSetCullMode = caps[171];
        vkCmdSetFrontFace = caps[172];
        vkCmdSetPrimitiveTopology = caps[173];
        vkCmdSetViewportWithCount = caps[174];
        vkCmdSetScissorWithCount = caps[175];
        vkCmdBindVertexBuffers2 = caps[176];
        vkCmdSetDepthTestEnable = caps[177];
        vkCmdSetDepthWriteEnable = caps[178];
        vkCmdSetDepthCompareOp = caps[179];
        vkCmdSetDepthBoundsTestEnable = caps[180];
        vkCmdSetStencilTestEnable = caps[181];
        vkCmdSetStencilOp = caps[182];
        vkCmdSetRasterizerDiscardEnable = caps[183];
        vkCmdSetDepthBiasEnable = caps[184];
        vkCmdSetPrimitiveRestartEnable = caps[185];
        vkMapMemory2 = caps[186];
        vkUnmapMemory2 = caps[187];
        vkGetDeviceImageSubresourceLayout = caps[188];
        vkGetImageSubresourceLayout2 = caps[189];
        vkCopyMemoryToImage = caps[190];
        vkCopyImageToMemory = caps[191];
        vkCopyImageToImage = caps[192];
        vkTransitionImageLayout = caps[193];
        vkCmdPushDescriptorSet = caps[194];
        vkCmdPushDescriptorSetWithTemplate = caps[195];
        vkCmdBindDescriptorSets2 = caps[196];
        vkCmdPushConstants2 = caps[197];
        vkCmdPushDescriptorSet2 = caps[198];
        vkCmdPushDescriptorSetWithTemplate2 = caps[199];
        vkCmdSetLineStipple = caps[200];
        vkCmdBindIndexBuffer2 = caps[201];
        vkGetRenderingAreaGranularity = caps[202];
        vkCmdSetRenderingAttachmentLocations = caps[203];
        vkCmdSetRenderingInputAttachmentIndices = caps[204];
        vkAntiLagUpdateAMD = caps[205];
        vkCmdWriteBufferMarkerAMD = caps[206];
        vkCmdWriteBufferMarker2AMD = caps[207];
        vkSetLocalDimmingAMD = caps[208];
        vkCmdDrawIndirectCountAMD = caps[209];
        vkCmdDrawIndexedIndirectCountAMD = caps[210];
        vkGetShaderInfoAMD = caps[211];
        vkCreateExecutionGraphPipelinesAMDX = caps[212];
        vkGetExecutionGraphPipelineScratchSizeAMDX = caps[213];
        vkGetExecutionGraphPipelineNodeIndexAMDX = caps[214];
        vkCmdInitializeGraphScratchMemoryAMDX = caps[215];
        vkCmdDispatchGraphAMDX = caps[216];
        vkCmdDispatchGraphIndirectAMDX = caps[217];
        vkCmdDispatchGraphIndirectCountAMDX = caps[218];
        vkGetAndroidHardwareBufferPropertiesANDROID = caps[219];
        vkGetMemoryAndroidHardwareBufferANDROID = caps[220];
        vkCreateDataGraphPipelinesARM = caps[221];
        vkCreateDataGraphPipelineSessionARM = caps[222];
        vkGetDataGraphPipelineSessionBindPointRequirementsARM = caps[223];
        vkGetDataGraphPipelineSessionMemoryRequirementsARM = caps[224];
        vkBindDataGraphPipelineSessionMemoryARM = caps[225];
        vkDestroyDataGraphPipelineSessionARM = caps[226];
        vkCmdDispatchDataGraphARM = caps[227];
        vkGetDataGraphPipelineAvailablePropertiesARM = caps[228];
        vkGetDataGraphPipelinePropertiesARM = caps[229];
        vkCreateTensorARM = caps[230];
        vkDestroyTensorARM = caps[231];
        vkCreateTensorViewARM = caps[232];
        vkDestroyTensorViewARM = caps[233];
        vkGetTensorMemoryRequirementsARM = caps[234];
        vkBindTensorMemoryARM = caps[235];
        vkGetDeviceTensorMemoryRequirementsARM = caps[236];
        vkCmdCopyTensorARM = caps[237];
        vkGetTensorOpaqueCaptureDescriptorDataARM = caps[238];
        vkGetTensorViewOpaqueCaptureDescriptorDataARM = caps[239];
        vkCmdSetAttachmentFeedbackLoopEnableEXT = caps[240];
        vkGetBufferDeviceAddressEXT = caps[241];
        vkGetCalibratedTimestampsEXT = caps[242];
        vkCmdSetColorWriteEnableEXT = caps[243];
        vkCmdBeginConditionalRenderingEXT = caps[244];
        vkCmdEndConditionalRenderingEXT = caps[245];
        vkCmdBeginCustomResolveEXT = caps[246];
        vkDebugMarkerSetObjectTagEXT = caps[247];
        vkDebugMarkerSetObjectNameEXT = caps[248];
        vkCmdDebugMarkerBeginEXT = caps[249];
        vkCmdDebugMarkerEndEXT = caps[250];
        vkCmdDebugMarkerInsertEXT = caps[251];
        vkCmdSetDepthBias2EXT = caps[252];
        vkCmdSetDepthClampRangeEXT = caps[253];
        vkGetDescriptorSetLayoutSizeEXT = caps[254];
        vkGetDescriptorSetLayoutBindingOffsetEXT = caps[255];
        vkGetDescriptorEXT = caps[256];
        vkCmdBindDescriptorBuffersEXT = caps[257];
        vkCmdSetDescriptorBufferOffsetsEXT = caps[258];
        vkCmdBindDescriptorBufferEmbeddedSamplersEXT = caps[259];
        vkGetBufferOpaqueCaptureDescriptorDataEXT = caps[260];
        vkGetImageOpaqueCaptureDescriptorDataEXT = caps[261];
        vkGetImageViewOpaqueCaptureDescriptorDataEXT = caps[262];
        vkGetSamplerOpaqueCaptureDescriptorDataEXT = caps[263];
        vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = caps[264];
        vkWriteSamplerDescriptorsEXT = caps[265];
        vkWriteResourceDescriptorsEXT = caps[266];
        vkCmdBindSamplerHeapEXT = caps[267];
        vkCmdBindResourceHeapEXT = caps[268];
        vkCmdPushDataEXT = caps[269];
        vkGetImageOpaqueCaptureDataEXT = caps[270];
        vkRegisterCustomBorderColorEXT = caps[271];
        vkUnregisterCustomBorderColorEXT = caps[272];
        vkGetTensorOpaqueCaptureDataARM = caps[273];
        vkGetDeviceFaultInfoEXT = caps[274];
        vkGetGeneratedCommandsMemoryRequirementsEXT = caps[275];
        vkCmdPreprocessGeneratedCommandsEXT = caps[276];
        vkCmdExecuteGeneratedCommandsEXT = caps[277];
        vkCreateIndirectCommandsLayoutEXT = caps[278];
        vkDestroyIndirectCommandsLayoutEXT = caps[279];
        vkCreateIndirectExecutionSetEXT = caps[280];
        vkDestroyIndirectExecutionSetEXT = caps[281];
        vkUpdateIndirectExecutionSetPipelineEXT = caps[282];
        vkUpdateIndirectExecutionSetShaderEXT = caps[283];
        vkCmdSetDiscardRectangleEXT = caps[284];
        vkCmdSetDiscardRectangleEnableEXT = caps[285];
        vkCmdSetDiscardRectangleModeEXT = caps[286];
        vkDisplayPowerControlEXT = caps[287];
        vkRegisterDeviceEventEXT = caps[288];
        vkRegisterDisplayEventEXT = caps[289];
        vkGetSwapchainCounterEXT = caps[290];
        vkCmdSetCullModeEXT = caps[291];
        vkCmdSetFrontFaceEXT = caps[292];
        vkCmdSetPrimitiveTopologyEXT = caps[293];
        vkCmdSetViewportWithCountEXT = caps[294];
        vkCmdSetScissorWithCountEXT = caps[295];
        vkCmdBindVertexBuffers2EXT = caps[296];
        vkCmdSetDepthTestEnableEXT = caps[297];
        vkCmdSetDepthWriteEnableEXT = caps[298];
        vkCmdSetDepthCompareOpEXT = caps[299];
        vkCmdSetDepthBoundsTestEnableEXT = caps[300];
        vkCmdSetStencilTestEnableEXT = caps[301];
        vkCmdSetStencilOpEXT = caps[302];
        vkCmdSetPatchControlPointsEXT = caps[303];
        vkCmdSetRasterizerDiscardEnableEXT = caps[304];
        vkCmdSetDepthBiasEnableEXT = caps[305];
        vkCmdSetLogicOpEXT = caps[306];
        vkCmdSetPrimitiveRestartEnableEXT = caps[307];
        vkCmdSetDepthClampEnableEXT = caps[308];
        vkCmdSetPolygonModeEXT = caps[309];
        vkCmdSetRasterizationSamplesEXT = caps[310];
        vkCmdSetSampleMaskEXT = caps[311];
        vkCmdSetAlphaToCoverageEnableEXT = caps[312];
        vkCmdSetAlphaToOneEnableEXT = caps[313];
        vkCmdSetLogicOpEnableEXT = caps[314];
        vkCmdSetColorBlendEnableEXT = caps[315];
        vkCmdSetColorBlendEquationEXT = caps[316];
        vkCmdSetColorWriteMaskEXT = caps[317];
        vkCmdSetTessellationDomainOriginEXT = caps[318];
        vkCmdSetRasterizationStreamEXT = caps[319];
        vkCmdSetConservativeRasterizationModeEXT = caps[320];
        vkCmdSetExtraPrimitiveOverestimationSizeEXT = caps[321];
        vkCmdSetDepthClipEnableEXT = caps[322];
        vkCmdSetSampleLocationsEnableEXT = caps[323];
        vkCmdSetColorBlendAdvancedEXT = caps[324];
        vkCmdSetProvokingVertexModeEXT = caps[325];
        vkCmdSetLineRasterizationModeEXT = caps[326];
        vkCmdSetLineStippleEnableEXT = caps[327];
        vkCmdSetDepthClipNegativeOneToOneEXT = caps[328];
        vkCmdSetViewportWScalingEnableNV = caps[329];
        vkCmdSetViewportSwizzleNV = caps[330];
        vkCmdSetCoverageToColorEnableNV = caps[331];
        vkCmdSetCoverageToColorLocationNV = caps[332];
        vkCmdSetCoverageModulationModeNV = caps[333];
        vkCmdSetCoverageModulationTableEnableNV = caps[334];
        vkCmdSetCoverageModulationTableNV = caps[335];
        vkCmdSetShadingRateImageEnableNV = caps[336];
        vkCmdSetRepresentativeFragmentTestEnableNV = caps[337];
        vkCmdSetCoverageReductionModeNV = caps[338];
        vkGetMemoryHostPointerPropertiesEXT = caps[339];
        vkGetMemoryMetalHandleEXT = caps[340];
        vkGetMemoryMetalHandlePropertiesEXT = caps[341];
        vkCmdEndRendering2EXT = caps[342];
        vkAcquireFullScreenExclusiveModeEXT = caps[343];
        vkReleaseFullScreenExclusiveModeEXT = caps[344];
        vkGetDeviceGroupSurfacePresentModes2EXT = caps[345];
        vkSetHdrMetadataEXT = caps[346];
        vkCopyMemoryToImageEXT = caps[347];
        vkCopyImageToMemoryEXT = caps[348];
        vkCopyImageToImageEXT = caps[349];
        vkTransitionImageLayoutEXT = caps[350];
        vkGetImageSubresourceLayout2EXT = caps[351];
        vkResetQueryPoolEXT = caps[352];
        vkGetImageDrmFormatModifierPropertiesEXT = caps[353];
        vkCmdSetLineStippleEXT = caps[354];
        vkCmdDecompressMemoryEXT = caps[355];
        vkCmdDecompressMemoryIndirectCountEXT = caps[356];
        vkCmdDrawMeshTasksEXT = caps[357];
        vkCmdDrawMeshTasksIndirectEXT = caps[358];
        vkCmdDrawMeshTasksIndirectCountEXT = caps[359];
        vkExportMetalObjectsEXT = caps[360];
        vkCmdDrawMultiEXT = caps[361];
        vkCmdDrawMultiIndexedEXT = caps[362];
        vkCreateMicromapEXT = caps[363];
        vkDestroyMicromapEXT = caps[364];
        vkCmdBuildMicromapsEXT = caps[365];
        vkBuildMicromapsEXT = caps[366];
        vkCopyMicromapEXT = caps[367];
        vkCopyMicromapToMemoryEXT = caps[368];
        vkCopyMemoryToMicromapEXT = caps[369];
        vkWriteMicromapsPropertiesEXT = caps[370];
        vkCmdCopyMicromapEXT = caps[371];
        vkCmdCopyMicromapToMemoryEXT = caps[372];
        vkCmdCopyMemoryToMicromapEXT = caps[373];
        vkCmdWriteMicromapsPropertiesEXT = caps[374];
        vkGetDeviceMicromapCompatibilityEXT = caps[375];
        vkGetMicromapBuildSizesEXT = caps[376];
        vkSetDeviceMemoryPriorityEXT = caps[377];
        vkGetPipelinePropertiesEXT = caps[378];
        vkSetSwapchainPresentTimingQueueSizeEXT = caps[379];
        vkGetSwapchainTimingPropertiesEXT = caps[380];
        vkGetSwapchainTimeDomainPropertiesEXT = caps[381];
        vkGetPastPresentationTimingEXT = caps[382];
        vkCreatePrivateDataSlotEXT = caps[383];
        vkDestroyPrivateDataSlotEXT = caps[384];
        vkSetPrivateDataEXT = caps[385];
        vkGetPrivateDataEXT = caps[386];
        vkCmdSetSampleLocationsEXT = caps[387];
        vkGetShaderModuleIdentifierEXT = caps[388];
        vkGetShaderModuleCreateInfoIdentifierEXT = caps[389];
        vkCreateShadersEXT = caps[390];
        vkDestroyShaderEXT = caps[391];
        vkGetShaderBinaryDataEXT = caps[392];
        vkCmdBindShadersEXT = caps[393];
        vkCmdSetVertexInputEXT = caps[394];
        vkReleaseSwapchainImagesEXT = caps[395];
        vkCmdBindTransformFeedbackBuffersEXT = caps[396];
        vkCmdBeginTransformFeedbackEXT = caps[397];
        vkCmdEndTransformFeedbackEXT = caps[398];
        vkCmdBeginQueryIndexedEXT = caps[399];
        vkCmdEndQueryIndexedEXT = caps[400];
        vkCmdDrawIndirectByteCountEXT = caps[401];
        vkCreateValidationCacheEXT = caps[402];
        vkDestroyValidationCacheEXT = caps[403];
        vkMergeValidationCachesEXT = caps[404];
        vkGetValidationCacheDataEXT = caps[405];
        vkGetRefreshCycleDurationGOOGLE = caps[406];
        vkGetPastPresentationTimingGOOGLE = caps[407];
        vkCmdDrawClusterHUAWEI = caps[408];
        vkCmdDrawClusterIndirectHUAWEI = caps[409];
        vkCmdBindInvocationMaskHUAWEI = caps[410];
        vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = caps[411];
        vkCmdSubpassShadingHUAWEI = caps[412];
        vkInitializePerformanceApiINTEL = caps[413];
        vkUninitializePerformanceApiINTEL = caps[414];
        vkCmdSetPerformanceMarkerINTEL = caps[415];
        vkCmdSetPerformanceStreamMarkerINTEL = caps[416];
        vkCmdSetPerformanceOverrideINTEL = caps[417];
        vkAcquirePerformanceConfigurationINTEL = caps[418];
        vkReleasePerformanceConfigurationINTEL = caps[419];
        vkQueueSetPerformanceConfigurationINTEL = caps[420];
        vkGetPerformanceParameterINTEL = caps[421];
        vkCreateAccelerationStructureKHR = caps[422];
        vkDestroyAccelerationStructureKHR = caps[423];
        vkCmdBuildAccelerationStructuresKHR = caps[424];
        vkCmdBuildAccelerationStructuresIndirectKHR = caps[425];
        vkBuildAccelerationStructuresKHR = caps[426];
        vkCopyAccelerationStructureKHR = caps[427];
        vkCopyAccelerationStructureToMemoryKHR = caps[428];
        vkCopyMemoryToAccelerationStructureKHR = caps[429];
        vkWriteAccelerationStructuresPropertiesKHR = caps[430];
        vkCmdCopyAccelerationStructureKHR = caps[431];
        vkCmdCopyAccelerationStructureToMemoryKHR = caps[432];
        vkCmdCopyMemoryToAccelerationStructureKHR = caps[433];
        vkGetAccelerationStructureDeviceAddressKHR = caps[434];
        vkCmdWriteAccelerationStructuresPropertiesKHR = caps[435];
        vkGetDeviceAccelerationStructureCompatibilityKHR = caps[436];
        vkGetAccelerationStructureBuildSizesKHR = caps[437];
        vkBindBufferMemory2KHR = caps[438];
        vkBindImageMemory2KHR = caps[439];
        vkGetBufferDeviceAddressKHR = caps[440];
        vkGetBufferOpaqueCaptureAddressKHR = caps[441];
        vkGetDeviceMemoryOpaqueCaptureAddressKHR = caps[442];
        vkGetCalibratedTimestampsKHR = caps[443];
        vkCmdCopyBuffer2KHR = caps[444];
        vkCmdCopyImage2KHR = caps[445];
        vkCmdCopyBufferToImage2KHR = caps[446];
        vkCmdCopyImageToBuffer2KHR = caps[447];
        vkCmdBlitImage2KHR = caps[448];
        vkCmdResolveImage2KHR = caps[449];
        vkCmdCopyMemoryIndirectKHR = caps[450];
        vkCmdCopyMemoryToImageIndirectKHR = caps[451];
        vkCreateRenderPass2KHR = caps[452];
        vkCmdBeginRenderPass2KHR = caps[453];
        vkCmdNextSubpass2KHR = caps[454];
        vkCmdEndRenderPass2KHR = caps[455];
        vkCreateDeferredOperationKHR = caps[456];
        vkDestroyDeferredOperationKHR = caps[457];
        vkGetDeferredOperationMaxConcurrencyKHR = caps[458];
        vkGetDeferredOperationResultKHR = caps[459];
        vkDeferredOperationJoinKHR = caps[460];
        vkCreateDescriptorUpdateTemplateKHR = caps[461];
        vkDestroyDescriptorUpdateTemplateKHR = caps[462];
        vkUpdateDescriptorSetWithTemplateKHR = caps[463];
        vkCmdPushDescriptorSetWithTemplateKHR = caps[464];
        vkGetDeviceGroupPeerMemoryFeaturesKHR = caps[465];
        vkCmdSetDeviceMaskKHR = caps[466];
        vkCmdDispatchBaseKHR = caps[467];
        vkGetDeviceGroupPresentCapabilitiesKHR = caps[468];
        vkGetDeviceGroupSurfacePresentModesKHR = caps[469];
        vkAcquireNextImage2KHR = caps[470];
        vkCreateSharedSwapchainsKHR = caps[471];
        vkCmdDrawIndirectCountKHR = caps[472];
        vkCmdDrawIndexedIndirectCountKHR = caps[473];
        vkCmdBeginRenderingKHR = caps[474];
        vkCmdEndRenderingKHR = caps[475];
        vkCmdSetRenderingAttachmentLocationsKHR = caps[476];
        vkCmdSetRenderingInputAttachmentIndicesKHR = caps[477];
        vkImportFenceFdKHR = caps[478];
        vkGetFenceFdKHR = caps[479];
        vkImportFenceWin32HandleKHR = caps[480];
        vkGetFenceWin32HandleKHR = caps[481];
        vkGetMemoryFdKHR = caps[482];
        vkGetMemoryFdPropertiesKHR = caps[483];
        vkGetMemoryWin32HandleKHR = caps[484];
        vkGetMemoryWin32HandlePropertiesKHR = caps[485];
        vkImportSemaphoreFdKHR = caps[486];
        vkGetSemaphoreFdKHR = caps[487];
        vkImportSemaphoreWin32HandleKHR = caps[488];
        vkGetSemaphoreWin32HandleKHR = caps[489];
        vkCmdSetFragmentShadingRateKHR = caps[490];
        vkGetImageMemoryRequirements2KHR = caps[491];
        vkGetBufferMemoryRequirements2KHR = caps[492];
        vkGetImageSparseMemoryRequirements2KHR = caps[493];
        vkCmdSetLineStippleKHR = caps[494];
        vkTrimCommandPoolKHR = caps[495];
        vkCmdEndRendering2KHR = caps[496];
        vkGetDescriptorSetLayoutSupportKHR = caps[497];
        vkGetDeviceBufferMemoryRequirementsKHR = caps[498];
        vkGetDeviceImageMemoryRequirementsKHR = caps[499];
        vkGetDeviceImageSparseMemoryRequirementsKHR = caps[500];
        vkCmdBindIndexBuffer2KHR = caps[501];
        vkGetRenderingAreaGranularityKHR = caps[502];
        vkGetDeviceImageSubresourceLayoutKHR = caps[503];
        vkGetImageSubresourceLayout2KHR = caps[504];
        vkCmdBindDescriptorSets2KHR = caps[505];
        vkCmdPushConstants2KHR = caps[506];
        vkCmdPushDescriptorSet2KHR = caps[507];
        vkCmdPushDescriptorSetWithTemplate2KHR = caps[508];
        vkCmdSetDescriptorBufferOffsets2EXT = caps[509];
        vkCmdBindDescriptorBufferEmbeddedSamplers2EXT = caps[510];
        vkMapMemory2KHR = caps[511];
        vkUnmapMemory2KHR = caps[512];
        vkAcquireProfilingLockKHR = caps[513];
        vkReleaseProfilingLockKHR = caps[514];
        vkCreatePipelineBinariesKHR = caps[515];
        vkDestroyPipelineBinaryKHR = caps[516];
        vkGetPipelineKeyKHR = caps[517];
        vkGetPipelineBinaryDataKHR = caps[518];
        vkReleaseCapturedPipelineDataKHR = caps[519];
        vkGetPipelineExecutablePropertiesKHR = caps[520];
        vkGetPipelineExecutableStatisticsKHR = caps[521];
        vkGetPipelineExecutableInternalRepresentationsKHR = caps[522];
        vkWaitForPresentKHR = caps[523];
        vkWaitForPresent2KHR = caps[524];
        vkCmdPushDescriptorSetKHR = caps[525];
        vkCmdTraceRaysIndirect2KHR = caps[526];
        vkCmdTraceRaysKHR = caps[527];
        vkCreateRayTracingPipelinesKHR = caps[528];
        vkGetRayTracingShaderGroupHandlesKHR = caps[529];
        vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = caps[530];
        vkCmdTraceRaysIndirectKHR = caps[531];
        vkGetRayTracingShaderGroupStackSizeKHR = caps[532];
        vkCmdSetRayTracingPipelineStackSizeKHR = caps[533];
        vkCreateSamplerYcbcrConversionKHR = caps[534];
        vkDestroySamplerYcbcrConversionKHR = caps[535];
        vkGetSwapchainStatusKHR = caps[536];
        vkCreateSwapchainKHR = caps[537];
        vkDestroySwapchainKHR = caps[538];
        vkGetSwapchainImagesKHR = caps[539];
        vkAcquireNextImageKHR = caps[540];
        vkQueuePresentKHR = caps[541];
        vkReleaseSwapchainImagesKHR = caps[542];
        vkCmdSetEvent2KHR = caps[543];
        vkCmdResetEvent2KHR = caps[544];
        vkCmdWaitEvents2KHR = caps[545];
        vkCmdPipelineBarrier2KHR = caps[546];
        vkCmdWriteTimestamp2KHR = caps[547];
        vkQueueSubmit2KHR = caps[548];
        vkGetSemaphoreCounterValueKHR = caps[549];
        vkWaitSemaphoresKHR = caps[550];
        vkSignalSemaphoreKHR = caps[551];
        vkCmdDecodeVideoKHR = caps[552];
        vkGetEncodedVideoSessionParametersKHR = caps[553];
        vkCmdEncodeVideoKHR = caps[554];
        vkCreateVideoSessionKHR = caps[555];
        vkDestroyVideoSessionKHR = caps[556];
        vkGetVideoSessionMemoryRequirementsKHR = caps[557];
        vkBindVideoSessionMemoryKHR = caps[558];
        vkCreateVideoSessionParametersKHR = caps[559];
        vkUpdateVideoSessionParametersKHR = caps[560];
        vkDestroyVideoSessionParametersKHR = caps[561];
        vkCmdBeginVideoCodingKHR = caps[562];
        vkCmdEndVideoCodingKHR = caps[563];
        vkCmdControlVideoCodingKHR = caps[564];
        vkCmdSetViewportWScalingNV = caps[565];
        vkGetClusterAccelerationStructureBuildSizesNV = caps[566];
        vkCmdBuildClusterAccelerationStructureIndirectNV = caps[567];
        vkCmdSetComputeOccupancyPriorityNV = caps[568];
        vkConvertCooperativeVectorMatrixNV = caps[569];
        vkCmdConvertCooperativeVectorMatrixNV = caps[570];
        vkCmdCopyMemoryIndirectNV = caps[571];
        vkCmdCopyMemoryToImageIndirectNV = caps[572];
        vkCreateCudaModuleNV = caps[573];
        vkGetCudaModuleCacheNV = caps[574];
        vkCreateCudaFunctionNV = caps[575];
        vkDestroyCudaModuleNV = caps[576];
        vkDestroyCudaFunctionNV = caps[577];
        vkCmdCudaLaunchKernelNV = caps[578];
        vkCmdSetCheckpointNV = caps[579];
        vkGetQueueCheckpointDataNV = caps[580];
        vkGetQueueCheckpointData2NV = caps[581];
        vkGetGeneratedCommandsMemoryRequirementsNV = caps[582];
        vkCmdPreprocessGeneratedCommandsNV = caps[583];
        vkCmdExecuteGeneratedCommandsNV = caps[584];
        vkCmdBindPipelineShaderGroupNV = caps[585];
        vkCreateIndirectCommandsLayoutNV = caps[586];
        vkDestroyIndirectCommandsLayoutNV = caps[587];
        vkGetPipelineIndirectMemoryRequirementsNV = caps[588];
        vkCmdUpdatePipelineIndirectBufferNV = caps[589];
        vkGetPipelineIndirectDeviceAddressNV = caps[590];
        vkCreateExternalComputeQueueNV = caps[591];
        vkDestroyExternalComputeQueueNV = caps[592];
        vkGetExternalComputeQueueDataNV = caps[593];
        vkGetMemoryRemoteAddressNV = caps[594];
        vkGetMemoryWin32HandleNV = caps[595];
        vkCmdSetFragmentShadingRateEnumNV = caps[596];
        vkSetLatencySleepModeNV = caps[597];
        vkLatencySleepNV = caps[598];
        vkSetLatencyMarkerNV = caps[599];
        vkGetLatencyTimingsNV = caps[600];
        vkQueueNotifyOutOfBandNV = caps[601];
        vkCmdDecompressMemoryNV = caps[602];
        vkCmdDecompressMemoryIndirectCountNV = caps[603];
        vkCmdDrawMeshTasksNV = caps[604];
        vkCmdDrawMeshTasksIndirectNV = caps[605];
        vkCmdDrawMeshTasksIndirectCountNV = caps[606];
        vkCreateOpticalFlowSessionNV = caps[607];
        vkDestroyOpticalFlowSessionNV = caps[608];
        vkBindOpticalFlowSessionImageNV = caps[609];
        vkCmdOpticalFlowExecuteNV = caps[610];
        vkGetPartitionedAccelerationStructuresBuildSizesNV = caps[611];
        vkCmdBuildPartitionedAccelerationStructuresNV = caps[612];
        vkCreateAccelerationStructureNV = caps[613];
        vkDestroyAccelerationStructureNV = caps[614];
        vkGetAccelerationStructureMemoryRequirementsNV = caps[615];
        vkBindAccelerationStructureMemoryNV = caps[616];
        vkCmdBuildAccelerationStructureNV = caps[617];
        vkCmdCopyAccelerationStructureNV = caps[618];
        vkCmdTraceRaysNV = caps[619];
        vkCreateRayTracingPipelinesNV = caps[620];
        vkGetRayTracingShaderGroupHandlesNV = caps[621];
        vkGetAccelerationStructureHandleNV = caps[622];
        vkCmdWriteAccelerationStructuresPropertiesNV = caps[623];
        vkCompileDeferredNV = caps[624];
        vkCmdSetExclusiveScissorEnableNV = caps[625];
        vkCmdSetExclusiveScissorNV = caps[626];
        vkCmdBindShadingRateImageNV = caps[627];
        vkCmdSetViewportShadingRatePaletteNV = caps[628];
        vkCmdSetCoarseSampleOrderNV = caps[629];
        vkCreateCuModuleNVX = caps[630];
        vkCreateCuFunctionNVX = caps[631];
        vkDestroyCuModuleNVX = caps[632];
        vkDestroyCuFunctionNVX = caps[633];
        vkCmdCuLaunchKernelNVX = caps[634];
        vkGetImageViewHandleNVX = caps[635];
        vkGetImageViewHandle64NVX = caps[636];
        vkGetImageViewAddressNVX = caps[637];
        vkGetDeviceCombinedImageSamplerIndexNVX = caps[638];
        vkCmdBindTileMemoryQCOM = caps[639];
        vkGetFramebufferTilePropertiesQCOM = caps[640];
        vkGetDynamicRenderingTilePropertiesQCOM = caps[641];
        vkCmdDispatchTileQCOM = caps[642];
        vkCmdBeginPerTileExecutionQCOM = caps[643];
        vkCmdEndPerTileExecutionQCOM = caps[644];
        vkGetDescriptorSetLayoutHostMappingInfoVALVE = caps[645];
        vkGetDescriptorSetHostMappingVALVE = caps[646];
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
            "vkDestroySemaphore", "vkCreateQueryPool", "vkDestroyQueryPool", "vkGetQueryPoolResults", "vkCreateBuffer", "vkDestroyBuffer", "vkCreateImage", 
            "vkDestroyImage", "vkGetImageSubresourceLayout", "vkCreateImageView", "vkDestroyImageView", "vkCreateCommandPool", "vkDestroyCommandPool", 
            "vkResetCommandPool", "vkAllocateCommandBuffers", "vkFreeCommandBuffers", "vkBeginCommandBuffer", "vkEndCommandBuffer", "vkResetCommandBuffer", 
            "vkCmdCopyBuffer", "vkCmdCopyImage", "vkCmdCopyBufferToImage", "vkCmdCopyImageToBuffer", "vkCmdUpdateBuffer", "vkCmdFillBuffer", 
            "vkCmdPipelineBarrier", "vkCmdBeginQuery", "vkCmdEndQuery", "vkCmdResetQueryPool", "vkCmdWriteTimestamp", "vkCmdCopyQueryPoolResults", 
            "vkCmdExecuteCommands", "vkCreateEvent", "vkDestroyEvent", "vkGetEventStatus", "vkSetEvent", "vkResetEvent", "vkCreateBufferView", 
            "vkDestroyBufferView", "vkCreateShaderModule", "vkDestroyShaderModule", "vkCreatePipelineCache", "vkDestroyPipelineCache", "vkGetPipelineCacheData", 
            "vkMergePipelineCaches", "vkCreateComputePipelines", "vkDestroyPipeline", "vkCreatePipelineLayout", "vkDestroyPipelineLayout", "vkCreateSampler", 
            "vkDestroySampler", "vkCreateDescriptorSetLayout", "vkDestroyDescriptorSetLayout", "vkCreateDescriptorPool", "vkDestroyDescriptorPool", 
            "vkResetDescriptorPool", "vkAllocateDescriptorSets", "vkFreeDescriptorSets", "vkUpdateDescriptorSets", "vkCmdBindPipeline", 
            "vkCmdBindDescriptorSets", "vkCmdClearColorImage", "vkCmdDispatch", "vkCmdDispatchIndirect", "vkCmdSetEvent", "vkCmdResetEvent", "vkCmdWaitEvents", 
            "vkCmdPushConstants", "vkCreateGraphicsPipelines", "vkCreateFramebuffer", "vkDestroyFramebuffer", "vkCreateRenderPass", "vkDestroyRenderPass", 
            "vkGetRenderAreaGranularity", "vkCmdSetViewport", "vkCmdSetScissor", "vkCmdSetLineWidth", "vkCmdSetDepthBias", "vkCmdSetBlendConstants", 
            "vkCmdSetDepthBounds", "vkCmdSetStencilCompareMask", "vkCmdSetStencilWriteMask", "vkCmdSetStencilReference", "vkCmdBindIndexBuffer", 
            "vkCmdBindVertexBuffers", "vkCmdDraw", "vkCmdDrawIndexed", "vkCmdDrawIndirect", "vkCmdDrawIndexedIndirect", "vkCmdBlitImage", 
            "vkCmdClearDepthStencilImage", "vkCmdClearAttachments", "vkCmdResolveImage", "vkCmdBeginRenderPass", "vkCmdNextSubpass", "vkCmdEndRenderPass"
        ) || reportMissing("VK", "Vulkan10");
    }

    private static boolean check_VK11(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan11")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136
        },
            "vkBindBufferMemory2", "vkBindImageMemory2", "vkGetDeviceGroupPeerMemoryFeatures", "vkCmdSetDeviceMask", "vkGetImageMemoryRequirements2", 
            "vkGetBufferMemoryRequirements2", "vkGetImageSparseMemoryRequirements2", "vkTrimCommandPool", "vkGetDeviceQueue2", "vkCmdDispatchBase", 
            "vkCreateDescriptorUpdateTemplate", "vkDestroyDescriptorUpdateTemplate", "vkUpdateDescriptorSetWithTemplate", "vkGetDescriptorSetLayoutSupport", 
            "vkCreateSamplerYcbcrConversion", "vkDestroySamplerYcbcrConversion"
        ) || reportMissing("VK", "Vulkan11");
    }

    private static boolean check_VK12(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan12")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149
        },
            "vkResetQueryPool", "vkGetSemaphoreCounterValue", "vkWaitSemaphores", "vkSignalSemaphore", "vkGetBufferDeviceAddress", 
            "vkGetBufferOpaqueCaptureAddress", "vkGetDeviceMemoryOpaqueCaptureAddress", "vkCmdDrawIndirectCount", "vkCmdDrawIndexedIndirectCount", 
            "vkCreateRenderPass2", "vkCmdBeginRenderPass2", "vkCmdNextSubpass2", "vkCmdEndRenderPass2"
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
            "vkCreatePrivateDataSlot", "vkDestroyPrivateDataSlot", "vkSetPrivateData", "vkGetPrivateData", "vkCmdPipelineBarrier2", "vkCmdWriteTimestamp2", 
            "vkQueueSubmit2", "vkCmdCopyBuffer2", "vkCmdCopyImage2", "vkCmdCopyBufferToImage2", "vkCmdCopyImageToBuffer2", 
            "vkGetDeviceBufferMemoryRequirements", "vkGetDeviceImageMemoryRequirements", "vkGetDeviceImageSparseMemoryRequirements", "vkCmdSetEvent2", 
            "vkCmdResetEvent2", "vkCmdWaitEvents2", "vkCmdBlitImage2", "vkCmdResolveImage2", "vkCmdBeginRendering", "vkCmdEndRendering", "vkCmdSetCullMode", 
            "vkCmdSetFrontFace", "vkCmdSetPrimitiveTopology", "vkCmdSetViewportWithCount", "vkCmdSetScissorWithCount", "vkCmdBindVertexBuffers2", 
            "vkCmdSetDepthTestEnable", "vkCmdSetDepthWriteEnable", "vkCmdSetDepthCompareOp", "vkCmdSetDepthBoundsTestEnable", "vkCmdSetStencilTestEnable", 
            "vkCmdSetStencilOp", "vkCmdSetRasterizerDiscardEnable", "vkCmdSetDepthBiasEnable", "vkCmdSetPrimitiveRestartEnable"
        ) || reportMissing("VK", "Vulkan13");
    }

    private static boolean check_VK14(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan14")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204
        },
            "vkMapMemory2", "vkUnmapMemory2", "vkGetDeviceImageSubresourceLayout", "vkGetImageSubresourceLayout2", "vkCopyMemoryToImage", "vkCopyImageToMemory", 
            "vkCopyImageToImage", "vkTransitionImageLayout", "vkCmdPushDescriptorSet", "vkCmdPushDescriptorSetWithTemplate", "vkCmdBindDescriptorSets2", 
            "vkCmdPushConstants2", "vkCmdPushDescriptorSet2", "vkCmdPushDescriptorSetWithTemplate2", "vkCmdSetLineStipple", "vkCmdBindIndexBuffer2", 
            "vkGetRenderingAreaGranularity", "vkCmdSetRenderingAttachmentLocations", "vkCmdSetRenderingInputAttachmentIndices"
        ) || reportMissing("VK", "Vulkan14");
    }

    private static boolean check_AMD_anti_lag(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_anti_lag")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            205
        },
            "vkAntiLagUpdateAMD"
        ) || reportMissing("VK", "VK_AMD_anti_lag");
    }

    private static boolean check_AMD_buffer_marker(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_buffer_marker")) {
            return false;
        }

        int flag0 = ext.contains("Vulkan13") || ext.contains("VK_KHR_synchronization2") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            206, flag0 + 207
        },
            "vkCmdWriteBufferMarkerAMD", "vkCmdWriteBufferMarker2AMD"
        ) || reportMissing("VK", "VK_AMD_buffer_marker");
    }

    private static boolean check_AMD_display_native_hdr(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_display_native_hdr")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            208
        },
            "vkSetLocalDimmingAMD"
        ) || reportMissing("VK", "VK_AMD_display_native_hdr");
    }

    private static boolean check_AMD_draw_indirect_count(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_draw_indirect_count")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            209, 210
        },
            "vkCmdDrawIndirectCountAMD", "vkCmdDrawIndexedIndirectCountAMD"
        ) || reportMissing("VK", "VK_AMD_draw_indirect_count");
    }

    private static boolean check_AMD_shader_info(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_shader_info")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            211
        },
            "vkGetShaderInfoAMD"
        ) || reportMissing("VK", "VK_AMD_shader_info");
    }

    private static boolean check_AMDX_shader_enqueue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMDX_shader_enqueue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            212, 213, 214, 215, 216, 217, 218
        },
            "vkCreateExecutionGraphPipelinesAMDX", "vkGetExecutionGraphPipelineScratchSizeAMDX", "vkGetExecutionGraphPipelineNodeIndexAMDX", 
            "vkCmdInitializeGraphScratchMemoryAMDX", "vkCmdDispatchGraphAMDX", "vkCmdDispatchGraphIndirectAMDX", "vkCmdDispatchGraphIndirectCountAMDX"
        ) || reportMissing("VK", "VK_AMDX_shader_enqueue");
    }

    private static boolean check_ANDROID_external_memory_android_hardware_buffer(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_ANDROID_external_memory_android_hardware_buffer")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            219, 220
        },
            "vkGetAndroidHardwareBufferPropertiesANDROID", "vkGetMemoryAndroidHardwareBufferANDROID"
        ) || reportMissing("VK", "VK_ANDROID_external_memory_android_hardware_buffer");
    }

    private static boolean check_ARM_data_graph(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_ARM_data_graph")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            221, 222, 223, 224, 225, 226, 227, 228, 229
        },
            "vkCreateDataGraphPipelinesARM", "vkCreateDataGraphPipelineSessionARM", "vkGetDataGraphPipelineSessionBindPointRequirementsARM", 
            "vkGetDataGraphPipelineSessionMemoryRequirementsARM", "vkBindDataGraphPipelineSessionMemoryARM", "vkDestroyDataGraphPipelineSessionARM", 
            "vkCmdDispatchDataGraphARM", "vkGetDataGraphPipelineAvailablePropertiesARM", "vkGetDataGraphPipelinePropertiesARM"
        ) || reportMissing("VK", "VK_ARM_data_graph");
    }

    private static boolean check_ARM_tensors(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_ARM_tensors")) {
            return false;
        }

        int flag0 = ext.contains("VK_EXT_descriptor_buffer") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            230, 231, 232, 233, 234, 235, 236, 237, flag0 + 238, flag0 + 239
        },
            "vkCreateTensorARM", "vkDestroyTensorARM", "vkCreateTensorViewARM", "vkDestroyTensorViewARM", "vkGetTensorMemoryRequirementsARM", 
            "vkBindTensorMemoryARM", "vkGetDeviceTensorMemoryRequirementsARM", "vkCmdCopyTensorARM", "vkGetTensorOpaqueCaptureDescriptorDataARM", 
            "vkGetTensorViewOpaqueCaptureDescriptorDataARM"
        ) || reportMissing("VK", "VK_ARM_tensors");
    }

    private static boolean check_EXT_attachment_feedback_loop_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_attachment_feedback_loop_dynamic_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            240
        },
            "vkCmdSetAttachmentFeedbackLoopEnableEXT"
        ) || reportMissing("VK", "VK_EXT_attachment_feedback_loop_dynamic_state");
    }

    private static boolean check_EXT_buffer_device_address(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_buffer_device_address")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            241
        },
            "vkGetBufferDeviceAddressEXT"
        ) || reportMissing("VK", "VK_EXT_buffer_device_address");
    }

    private static boolean check_EXT_calibrated_timestamps(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_calibrated_timestamps")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            242
        },
            "vkGetCalibratedTimestampsEXT"
        ) || reportMissing("VK", "VK_EXT_calibrated_timestamps");
    }

    private static boolean check_EXT_color_write_enable(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_color_write_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            243
        },
            "vkCmdSetColorWriteEnableEXT"
        ) || reportMissing("VK", "VK_EXT_color_write_enable");
    }

    private static boolean check_EXT_conditional_rendering(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_conditional_rendering")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            244, 245
        },
            "vkCmdBeginConditionalRenderingEXT", "vkCmdEndConditionalRenderingEXT"
        ) || reportMissing("VK", "VK_EXT_conditional_rendering");
    }

    private static boolean check_EXT_custom_resolve(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_custom_resolve")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_dynamic_rendering") || ext.contains("Vulkan13") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            flag0 + 246
        },
            "vkCmdBeginCustomResolveEXT"
        ) || reportMissing("VK", "VK_EXT_custom_resolve");
    }

    private static boolean check_EXT_debug_marker(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_debug_marker")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            247, 248, 249, 250, 251
        },
            "vkDebugMarkerSetObjectTagEXT", "vkDebugMarkerSetObjectNameEXT", "vkCmdDebugMarkerBeginEXT", "vkCmdDebugMarkerEndEXT", "vkCmdDebugMarkerInsertEXT"
        ) || reportMissing("VK", "VK_EXT_debug_marker");
    }

    private static boolean check_EXT_depth_bias_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_depth_bias_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            252
        },
            "vkCmdSetDepthBias2EXT"
        ) || reportMissing("VK", "VK_EXT_depth_bias_control");
    }

    private static boolean check_EXT_depth_clamp_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_depth_clamp_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            253
        },
            "vkCmdSetDepthClampRangeEXT"
        ) || reportMissing("VK", "VK_EXT_depth_clamp_control");
    }

    private static boolean check_EXT_descriptor_buffer(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_descriptor_buffer")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_acceleration_structure") || ext.contains("VK_NV_ray_tracing") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            254, 255, 256, 257, 258, 259, 260, 261, 262, 263, flag0 + 264
        },
            "vkGetDescriptorSetLayoutSizeEXT", "vkGetDescriptorSetLayoutBindingOffsetEXT", "vkGetDescriptorEXT", "vkCmdBindDescriptorBuffersEXT", 
            "vkCmdSetDescriptorBufferOffsetsEXT", "vkCmdBindDescriptorBufferEmbeddedSamplersEXT", "vkGetBufferOpaqueCaptureDescriptorDataEXT", 
            "vkGetImageOpaqueCaptureDescriptorDataEXT", "vkGetImageViewOpaqueCaptureDescriptorDataEXT", "vkGetSamplerOpaqueCaptureDescriptorDataEXT", 
            "vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT"
        ) || reportMissing("VK", "VK_EXT_descriptor_buffer");
    }

    private static boolean check_EXT_descriptor_heap(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_descriptor_heap")) {
            return false;
        }

        int flag0 = ext.contains("VK_EXT_custom_border_color") ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains("VK_ARM_tensors") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            265, 266, 267, 268, 269, 270, flag0 + 271, flag0 + 272, flag2 + 273
        },
            "vkWriteSamplerDescriptorsEXT", "vkWriteResourceDescriptorsEXT", "vkCmdBindSamplerHeapEXT", "vkCmdBindResourceHeapEXT", "vkCmdPushDataEXT", 
            "vkGetImageOpaqueCaptureDataEXT", "vkRegisterCustomBorderColorEXT", "vkUnregisterCustomBorderColorEXT", "vkGetTensorOpaqueCaptureDataARM"
        ) || reportMissing("VK", "VK_EXT_descriptor_heap");
    }

    private static boolean check_EXT_device_fault(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_device_fault")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            274
        },
            "vkGetDeviceFaultInfoEXT"
        ) || reportMissing("VK", "VK_EXT_device_fault");
    }

    private static boolean check_EXT_device_generated_commands(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_device_generated_commands")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            275, 276, 277, 278, 279, 280, 281, 282, 283
        },
            "vkGetGeneratedCommandsMemoryRequirementsEXT", "vkCmdPreprocessGeneratedCommandsEXT", "vkCmdExecuteGeneratedCommandsEXT", 
            "vkCreateIndirectCommandsLayoutEXT", "vkDestroyIndirectCommandsLayoutEXT", "vkCreateIndirectExecutionSetEXT", "vkDestroyIndirectExecutionSetEXT", 
            "vkUpdateIndirectExecutionSetPipelineEXT", "vkUpdateIndirectExecutionSetShaderEXT"
        ) || reportMissing("VK", "VK_EXT_device_generated_commands");
    }

    private static boolean check_EXT_discard_rectangles(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_discard_rectangles")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            284, 285, 286
        },
            "vkCmdSetDiscardRectangleEXT", "vkCmdSetDiscardRectangleEnableEXT", "vkCmdSetDiscardRectangleModeEXT"
        ) || reportMissing("VK", "VK_EXT_discard_rectangles");
    }

    private static boolean check_EXT_display_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_display_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            287, 288, 289, 290
        },
            "vkDisplayPowerControlEXT", "vkRegisterDeviceEventEXT", "vkRegisterDisplayEventEXT", "vkGetSwapchainCounterEXT"
        ) || reportMissing("VK", "VK_EXT_display_control");
    }

    private static boolean check_EXT_extended_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_extended_dynamic_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302
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
            303, 304, 305, 306, 307
        },
            "vkCmdSetPatchControlPointsEXT", "vkCmdSetRasterizerDiscardEnableEXT", "vkCmdSetDepthBiasEnableEXT", "vkCmdSetLogicOpEXT", 
            "vkCmdSetPrimitiveRestartEnableEXT"
        ) || reportMissing("VK", "VK_EXT_extended_dynamic_state2");
    }

    private static boolean check_EXT_extended_dynamic_state3(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_extended_dynamic_state3")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_maintenance2") || ext.contains("Vulkan11") ? 0 : Integer.MIN_VALUE;
        int flag1 = ext.contains("VK_EXT_transform_feedback") ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains("VK_EXT_conservative_rasterization") ? 0 : Integer.MIN_VALUE;
        int flag4 = ext.contains("VK_EXT_depth_clip_enable") ? 0 : Integer.MIN_VALUE;
        int flag5 = ext.contains("VK_EXT_sample_locations") ? 0 : Integer.MIN_VALUE;
        int flag6 = ext.contains("VK_EXT_blend_operation_advanced") ? 0 : Integer.MIN_VALUE;
        int flag7 = ext.contains("VK_EXT_provoking_vertex") ? 0 : Integer.MIN_VALUE;
        int flag8 = ext.contains("VK_EXT_line_rasterization") ? 0 : Integer.MIN_VALUE;
        int flag10 = ext.contains("VK_EXT_depth_clip_control") ? 0 : Integer.MIN_VALUE;
        int flag11 = ext.contains("VK_NV_clip_space_w_scaling") ? 0 : Integer.MIN_VALUE;
        int flag12 = ext.contains("VK_NV_viewport_swizzle") ? 0 : Integer.MIN_VALUE;
        int flag13 = ext.contains("VK_NV_fragment_coverage_to_color") ? 0 : Integer.MIN_VALUE;
        int flag15 = ext.contains("VK_NV_framebuffer_mixed_samples") ? 0 : Integer.MIN_VALUE;
        int flag18 = ext.contains("VK_NV_shading_rate_image") ? 0 : Integer.MIN_VALUE;
        int flag19 = ext.contains("VK_NV_representative_fragment_test") ? 0 : Integer.MIN_VALUE;
        int flag20 = ext.contains("VK_NV_coverage_reduction_mode") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            308, 309, 310, 311, 312, 313, 314, 315, 316, 317, flag0 + 318, flag1 + 319, flag2 + 320, flag2 + 321, flag4 + 322, flag5 + 323, flag6 + 324, 
            flag7 + 325, flag8 + 326, flag8 + 327, flag10 + 328, flag11 + 329, flag12 + 330, flag13 + 331, flag13 + 332, flag15 + 333, flag15 + 334, 
            flag15 + 335, flag18 + 336, flag19 + 337, flag20 + 338
        },
            "vkCmdSetDepthClampEnableEXT", "vkCmdSetPolygonModeEXT", "vkCmdSetRasterizationSamplesEXT", "vkCmdSetSampleMaskEXT", 
            "vkCmdSetAlphaToCoverageEnableEXT", "vkCmdSetAlphaToOneEnableEXT", "vkCmdSetLogicOpEnableEXT", "vkCmdSetColorBlendEnableEXT", 
            "vkCmdSetColorBlendEquationEXT", "vkCmdSetColorWriteMaskEXT", "vkCmdSetTessellationDomainOriginEXT", "vkCmdSetRasterizationStreamEXT", 
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
            339
        },
            "vkGetMemoryHostPointerPropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_external_memory_host");
    }

    private static boolean check_EXT_external_memory_metal(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_external_memory_metal")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            340, 341
        },
            "vkGetMemoryMetalHandleEXT", "vkGetMemoryMetalHandlePropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_external_memory_metal");
    }

    private static boolean check_EXT_fragment_density_map_offset(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_fragment_density_map_offset")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            342
        },
            "vkCmdEndRendering2EXT"
        ) || reportMissing("VK", "VK_EXT_fragment_density_map_offset");
    }

    private static boolean check_EXT_full_screen_exclusive(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_full_screen_exclusive")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_device_group") || ext.contains("Vulkan11") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            343, 344, flag0 + 345
        },
            "vkAcquireFullScreenExclusiveModeEXT", "vkReleaseFullScreenExclusiveModeEXT", "vkGetDeviceGroupSurfacePresentModes2EXT"
        ) || reportMissing("VK", "VK_EXT_full_screen_exclusive");
    }

    private static boolean check_EXT_hdr_metadata(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_hdr_metadata")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            346
        },
            "vkSetHdrMetadataEXT"
        ) || reportMissing("VK", "VK_EXT_hdr_metadata");
    }

    private static boolean check_EXT_host_image_copy(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_host_image_copy")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            347, 348, 349, 350, 351
        },
            "vkCopyMemoryToImageEXT", "vkCopyImageToMemoryEXT", "vkCopyImageToImageEXT", "vkTransitionImageLayoutEXT", "vkGetImageSubresourceLayout2EXT"
        ) || reportMissing("VK", "VK_EXT_host_image_copy");
    }

    private static boolean check_EXT_host_query_reset(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_host_query_reset")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            352
        },
            "vkResetQueryPoolEXT"
        ) || reportMissing("VK", "VK_EXT_host_query_reset");
    }

    private static boolean check_EXT_image_compression_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_image_compression_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            351
        },
            "vkGetImageSubresourceLayout2EXT"
        ) || reportMissing("VK", "VK_EXT_image_compression_control");
    }

    private static boolean check_EXT_image_drm_format_modifier(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_image_drm_format_modifier")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            353
        },
            "vkGetImageDrmFormatModifierPropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_image_drm_format_modifier");
    }

    private static boolean check_EXT_line_rasterization(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_line_rasterization")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            354
        },
            "vkCmdSetLineStippleEXT"
        ) || reportMissing("VK", "VK_EXT_line_rasterization");
    }

    private static boolean check_EXT_memory_decompression(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_memory_decompression")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            355, 356
        },
            "vkCmdDecompressMemoryEXT", "vkCmdDecompressMemoryIndirectCountEXT"
        ) || reportMissing("VK", "VK_EXT_memory_decompression");
    }

    private static boolean check_EXT_mesh_shader(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_mesh_shader")) {
            return false;
        }

        int flag0 = ext.contains("Vulkan12") || ext.contains("VK_KHR_draw_indirect_count") || ext.contains("VK_AMD_draw_indirect_count") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            357, 358, flag0 + 359
        },
            "vkCmdDrawMeshTasksEXT", "vkCmdDrawMeshTasksIndirectEXT", "vkCmdDrawMeshTasksIndirectCountEXT"
        ) || reportMissing("VK", "VK_EXT_mesh_shader");
    }

    private static boolean check_EXT_metal_objects(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_metal_objects")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            360
        },
            "vkExportMetalObjectsEXT"
        ) || reportMissing("VK", "VK_EXT_metal_objects");
    }

    private static boolean check_EXT_multi_draw(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_multi_draw")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            361, 362
        },
            "vkCmdDrawMultiEXT", "vkCmdDrawMultiIndexedEXT"
        ) || reportMissing("VK", "VK_EXT_multi_draw");
    }

    private static boolean check_EXT_opacity_micromap(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_opacity_micromap")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373, 374, 375, 376
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
            377
        },
            "vkSetDeviceMemoryPriorityEXT"
        ) || reportMissing("VK", "VK_EXT_pageable_device_local_memory");
    }

    private static boolean check_EXT_pipeline_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_pipeline_properties")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            378
        },
            "vkGetPipelinePropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_pipeline_properties");
    }

    private static boolean check_EXT_present_timing(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_present_timing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            379, 380, 381, 382
        },
            "vkSetSwapchainPresentTimingQueueSizeEXT", "vkGetSwapchainTimingPropertiesEXT", "vkGetSwapchainTimeDomainPropertiesEXT", 
            "vkGetPastPresentationTimingEXT"
        ) || reportMissing("VK", "VK_EXT_present_timing");
    }

    private static boolean check_EXT_private_data(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_private_data")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            383, 384, 385, 386
        },
            "vkCreatePrivateDataSlotEXT", "vkDestroyPrivateDataSlotEXT", "vkSetPrivateDataEXT", "vkGetPrivateDataEXT"
        ) || reportMissing("VK", "VK_EXT_private_data");
    }

    private static boolean check_EXT_sample_locations(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_sample_locations")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            387
        },
            "vkCmdSetSampleLocationsEXT"
        ) || reportMissing("VK", "VK_EXT_sample_locations");
    }

    private static boolean check_EXT_shader_module_identifier(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_shader_module_identifier")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            388, 389
        },
            "vkGetShaderModuleIdentifierEXT", "vkGetShaderModuleCreateInfoIdentifierEXT"
        ) || reportMissing("VK", "VK_EXT_shader_module_identifier");
    }

    private static boolean check_EXT_shader_object(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_shader_object")) {
            return false;
        }

        int flag0 = ext.contains("VK_EXT_transform_feedback") ? 0 : Integer.MIN_VALUE;
        int flag1 = ext.contains("VK_EXT_conservative_rasterization") ? 0 : Integer.MIN_VALUE;
        int flag3 = ext.contains("VK_EXT_depth_clip_enable") ? 0 : Integer.MIN_VALUE;
        int flag4 = ext.contains("VK_EXT_sample_locations") ? 0 : Integer.MIN_VALUE;
        int flag5 = ext.contains("VK_EXT_blend_operation_advanced") ? 0 : Integer.MIN_VALUE;
        int flag6 = ext.contains("VK_EXT_provoking_vertex") ? 0 : Integer.MIN_VALUE;
        int flag7 = ext.contains("VK_EXT_line_rasterization") ? 0 : Integer.MIN_VALUE;
        int flag9 = ext.contains("VK_EXT_depth_clip_control") ? 0 : Integer.MIN_VALUE;
        int flag10 = ext.contains("VK_NV_clip_space_w_scaling") ? 0 : Integer.MIN_VALUE;
        int flag11 = ext.contains("VK_NV_viewport_swizzle") ? 0 : Integer.MIN_VALUE;
        int flag12 = ext.contains("VK_NV_fragment_coverage_to_color") ? 0 : Integer.MIN_VALUE;
        int flag14 = ext.contains("VK_NV_framebuffer_mixed_samples") ? 0 : Integer.MIN_VALUE;
        int flag17 = ext.contains("VK_NV_shading_rate_image") ? 0 : Integer.MIN_VALUE;
        int flag18 = ext.contains("VK_NV_representative_fragment_test") ? 0 : Integer.MIN_VALUE;
        int flag19 = ext.contains("VK_NV_coverage_reduction_mode") ? 0 : Integer.MIN_VALUE;
        int flag20 = ext.contains("VK_EXT_depth_clamp_control") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            390, 391, 392, 393, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 394, 303, 304, 305, 306, 307, 318, 308, 309, 310, 311, 312, 313, 
            314, 315, 316, 317, flag0 + 319, flag1 + 320, flag1 + 321, flag3 + 322, flag4 + 323, flag5 + 324, flag6 + 325, flag7 + 326, flag7 + 327, 
            flag9 + 328, flag10 + 329, flag11 + 330, flag12 + 331, flag12 + 332, flag14 + 333, flag14 + 334, flag14 + 335, flag17 + 336, flag18 + 337, 
            flag19 + 338, flag20 + 253
        },
            "vkCreateShadersEXT", "vkDestroyShaderEXT", "vkGetShaderBinaryDataEXT", "vkCmdBindShadersEXT", "vkCmdSetCullModeEXT", "vkCmdSetFrontFaceEXT", 
            "vkCmdSetPrimitiveTopologyEXT", "vkCmdSetViewportWithCountEXT", "vkCmdSetScissorWithCountEXT", "vkCmdBindVertexBuffers2EXT", 
            "vkCmdSetDepthTestEnableEXT", "vkCmdSetDepthWriteEnableEXT", "vkCmdSetDepthCompareOpEXT", "vkCmdSetDepthBoundsTestEnableEXT", 
            "vkCmdSetStencilTestEnableEXT", "vkCmdSetStencilOpEXT", "vkCmdSetVertexInputEXT", "vkCmdSetPatchControlPointsEXT", 
            "vkCmdSetRasterizerDiscardEnableEXT", "vkCmdSetDepthBiasEnableEXT", "vkCmdSetLogicOpEXT", "vkCmdSetPrimitiveRestartEnableEXT", 
            "vkCmdSetTessellationDomainOriginEXT", "vkCmdSetDepthClampEnableEXT", "vkCmdSetPolygonModeEXT", "vkCmdSetRasterizationSamplesEXT", 
            "vkCmdSetSampleMaskEXT", "vkCmdSetAlphaToCoverageEnableEXT", "vkCmdSetAlphaToOneEnableEXT", "vkCmdSetLogicOpEnableEXT", 
            "vkCmdSetColorBlendEnableEXT", "vkCmdSetColorBlendEquationEXT", "vkCmdSetColorWriteMaskEXT", "vkCmdSetRasterizationStreamEXT", 
            "vkCmdSetConservativeRasterizationModeEXT", "vkCmdSetExtraPrimitiveOverestimationSizeEXT", "vkCmdSetDepthClipEnableEXT", 
            "vkCmdSetSampleLocationsEnableEXT", "vkCmdSetColorBlendAdvancedEXT", "vkCmdSetProvokingVertexModeEXT", "vkCmdSetLineRasterizationModeEXT", 
            "vkCmdSetLineStippleEnableEXT", "vkCmdSetDepthClipNegativeOneToOneEXT", "vkCmdSetViewportWScalingEnableNV", "vkCmdSetViewportSwizzleNV", 
            "vkCmdSetCoverageToColorEnableNV", "vkCmdSetCoverageToColorLocationNV", "vkCmdSetCoverageModulationModeNV", 
            "vkCmdSetCoverageModulationTableEnableNV", "vkCmdSetCoverageModulationTableNV", "vkCmdSetShadingRateImageEnableNV", 
            "vkCmdSetRepresentativeFragmentTestEnableNV", "vkCmdSetCoverageReductionModeNV", "vkCmdSetDepthClampRangeEXT"
        ) || reportMissing("VK", "VK_EXT_shader_object");
    }

    private static boolean check_EXT_swapchain_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_swapchain_maintenance1")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            395
        },
            "vkReleaseSwapchainImagesEXT"
        ) || reportMissing("VK", "VK_EXT_swapchain_maintenance1");
    }

    private static boolean check_EXT_transform_feedback(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_transform_feedback")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            396, 397, 398, 399, 400, 401
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
            402, 403, 404, 405
        },
            "vkCreateValidationCacheEXT", "vkDestroyValidationCacheEXT", "vkMergeValidationCachesEXT", "vkGetValidationCacheDataEXT"
        ) || reportMissing("VK", "VK_EXT_validation_cache");
    }

    private static boolean check_EXT_vertex_input_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_vertex_input_dynamic_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            394
        },
            "vkCmdSetVertexInputEXT"
        ) || reportMissing("VK", "VK_EXT_vertex_input_dynamic_state");
    }

    private static boolean check_GOOGLE_display_timing(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_GOOGLE_display_timing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            406, 407
        },
            "vkGetRefreshCycleDurationGOOGLE", "vkGetPastPresentationTimingGOOGLE"
        ) || reportMissing("VK", "VK_GOOGLE_display_timing");
    }

    private static boolean check_HUAWEI_cluster_culling_shader(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_HUAWEI_cluster_culling_shader")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            408, 409
        },
            "vkCmdDrawClusterHUAWEI", "vkCmdDrawClusterIndirectHUAWEI"
        ) || reportMissing("VK", "VK_HUAWEI_cluster_culling_shader");
    }

    private static boolean check_HUAWEI_invocation_mask(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_HUAWEI_invocation_mask")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            410
        },
            "vkCmdBindInvocationMaskHUAWEI"
        ) || reportMissing("VK", "VK_HUAWEI_invocation_mask");
    }

    private static boolean check_HUAWEI_subpass_shading(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_HUAWEI_subpass_shading")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            411, 412
        },
            "vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI", "vkCmdSubpassShadingHUAWEI"
        ) || reportMissing("VK", "VK_HUAWEI_subpass_shading");
    }

    private static boolean check_INTEL_performance_query(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_INTEL_performance_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            413, 414, 415, 416, 417, 418, 419, 420, 421
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
            422, 423, 424, 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 436, 437
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
            438, 439
        },
            "vkBindBufferMemory2KHR", "vkBindImageMemory2KHR"
        ) || reportMissing("VK", "VK_KHR_bind_memory2");
    }

    private static boolean check_KHR_buffer_device_address(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_buffer_device_address")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            440, 441, 442
        },
            "vkGetBufferDeviceAddressKHR", "vkGetBufferOpaqueCaptureAddressKHR", "vkGetDeviceMemoryOpaqueCaptureAddressKHR"
        ) || reportMissing("VK", "VK_KHR_buffer_device_address");
    }

    private static boolean check_KHR_calibrated_timestamps(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_calibrated_timestamps")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            443
        },
            "vkGetCalibratedTimestampsKHR"
        ) || reportMissing("VK", "VK_KHR_calibrated_timestamps");
    }

    private static boolean check_KHR_copy_commands2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_copy_commands2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            444, 445, 446, 447, 448, 449
        },
            "vkCmdCopyBuffer2KHR", "vkCmdCopyImage2KHR", "vkCmdCopyBufferToImage2KHR", "vkCmdCopyImageToBuffer2KHR", "vkCmdBlitImage2KHR", 
            "vkCmdResolveImage2KHR"
        ) || reportMissing("VK", "VK_KHR_copy_commands2");
    }

    private static boolean check_KHR_copy_memory_indirect(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_copy_memory_indirect")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            450, 451
        },
            "vkCmdCopyMemoryIndirectKHR", "vkCmdCopyMemoryToImageIndirectKHR"
        ) || reportMissing("VK", "VK_KHR_copy_memory_indirect");
    }

    private static boolean check_KHR_create_renderpass2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_create_renderpass2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            452, 453, 454, 455
        },
            "vkCreateRenderPass2KHR", "vkCmdBeginRenderPass2KHR", "vkCmdNextSubpass2KHR", "vkCmdEndRenderPass2KHR"
        ) || reportMissing("VK", "VK_KHR_create_renderpass2");
    }

    private static boolean check_KHR_deferred_host_operations(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_deferred_host_operations")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            456, 457, 458, 459, 460
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
            461, 462, 463, flag0 + 464
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
            465, 466, 467, flag0 + 468, flag0 + 469, flag2 + 470
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
            471
        },
            "vkCreateSharedSwapchainsKHR"
        ) || reportMissing("VK", "VK_KHR_display_swapchain");
    }

    private static boolean check_KHR_draw_indirect_count(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_draw_indirect_count")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            472, 473
        },
            "vkCmdDrawIndirectCountKHR", "vkCmdDrawIndexedIndirectCountKHR"
        ) || reportMissing("VK", "VK_KHR_draw_indirect_count");
    }

    private static boolean check_KHR_dynamic_rendering(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_dynamic_rendering")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            474, 475
        },
            "vkCmdBeginRenderingKHR", "vkCmdEndRenderingKHR"
        ) || reportMissing("VK", "VK_KHR_dynamic_rendering");
    }

    private static boolean check_KHR_dynamic_rendering_local_read(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_dynamic_rendering_local_read")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            476, 477
        },
            "vkCmdSetRenderingAttachmentLocationsKHR", "vkCmdSetRenderingInputAttachmentIndicesKHR"
        ) || reportMissing("VK", "VK_KHR_dynamic_rendering_local_read");
    }

    private static boolean check_KHR_external_fence_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_fence_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            478, 479
        },
            "vkImportFenceFdKHR", "vkGetFenceFdKHR"
        ) || reportMissing("VK", "VK_KHR_external_fence_fd");
    }

    private static boolean check_KHR_external_fence_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_fence_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            480, 481
        },
            "vkImportFenceWin32HandleKHR", "vkGetFenceWin32HandleKHR"
        ) || reportMissing("VK", "VK_KHR_external_fence_win32");
    }

    private static boolean check_KHR_external_memory_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_memory_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            482, 483
        },
            "vkGetMemoryFdKHR", "vkGetMemoryFdPropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_memory_fd");
    }

    private static boolean check_KHR_external_memory_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_memory_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            484, 485
        },
            "vkGetMemoryWin32HandleKHR", "vkGetMemoryWin32HandlePropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_memory_win32");
    }

    private static boolean check_KHR_external_semaphore_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_semaphore_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            486, 487
        },
            "vkImportSemaphoreFdKHR", "vkGetSemaphoreFdKHR"
        ) || reportMissing("VK", "VK_KHR_external_semaphore_fd");
    }

    private static boolean check_KHR_external_semaphore_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_semaphore_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            488, 489
        },
            "vkImportSemaphoreWin32HandleKHR", "vkGetSemaphoreWin32HandleKHR"
        ) || reportMissing("VK", "VK_KHR_external_semaphore_win32");
    }

    private static boolean check_KHR_fragment_shading_rate(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_fragment_shading_rate")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            490
        },
            "vkCmdSetFragmentShadingRateKHR"
        ) || reportMissing("VK", "VK_KHR_fragment_shading_rate");
    }

    private static boolean check_KHR_get_memory_requirements2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_get_memory_requirements2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            491, 492, 493
        },
            "vkGetImageMemoryRequirements2KHR", "vkGetBufferMemoryRequirements2KHR", "vkGetImageSparseMemoryRequirements2KHR"
        ) || reportMissing("VK", "VK_KHR_get_memory_requirements2");
    }

    private static boolean check_KHR_line_rasterization(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_line_rasterization")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            494
        },
            "vkCmdSetLineStippleKHR"
        ) || reportMissing("VK", "VK_KHR_line_rasterization");
    }

    private static boolean check_KHR_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance1")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            495
        },
            "vkTrimCommandPoolKHR"
        ) || reportMissing("VK", "VK_KHR_maintenance1");
    }

    private static boolean check_KHR_maintenance10(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance10")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            496
        },
            "vkCmdEndRendering2KHR"
        ) || reportMissing("VK", "VK_KHR_maintenance10");
    }

    private static boolean check_KHR_maintenance3(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance3")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            497
        },
            "vkGetDescriptorSetLayoutSupportKHR"
        ) || reportMissing("VK", "VK_KHR_maintenance3");
    }

    private static boolean check_KHR_maintenance4(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance4")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            498, 499, 500
        },
            "vkGetDeviceBufferMemoryRequirementsKHR", "vkGetDeviceImageMemoryRequirementsKHR", "vkGetDeviceImageSparseMemoryRequirementsKHR"
        ) || reportMissing("VK", "VK_KHR_maintenance4");
    }

    private static boolean check_KHR_maintenance5(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance5")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            501, 502, 503, 504
        },
            "vkCmdBindIndexBuffer2KHR", "vkGetRenderingAreaGranularityKHR", "vkGetDeviceImageSubresourceLayoutKHR", "vkGetImageSubresourceLayout2KHR"
        ) || reportMissing("VK", "VK_KHR_maintenance5");
    }

    private static boolean check_KHR_maintenance6(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance6")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_push_descriptor") ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains("VK_EXT_descriptor_buffer") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            505, 506, flag0 + 507, flag0 + 508, flag2 + 509, flag2 + 510
        },
            "vkCmdBindDescriptorSets2KHR", "vkCmdPushConstants2KHR", "vkCmdPushDescriptorSet2KHR", "vkCmdPushDescriptorSetWithTemplate2KHR", 
            "vkCmdSetDescriptorBufferOffsets2EXT", "vkCmdBindDescriptorBufferEmbeddedSamplers2EXT"
        ) || reportMissing("VK", "VK_KHR_maintenance6");
    }

    private static boolean check_KHR_map_memory2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_map_memory2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            511, 512
        },
            "vkMapMemory2KHR", "vkUnmapMemory2KHR"
        ) || reportMissing("VK", "VK_KHR_map_memory2");
    }

    private static boolean check_KHR_performance_query(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_performance_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            513, 514
        },
            "vkAcquireProfilingLockKHR", "vkReleaseProfilingLockKHR"
        ) || reportMissing("VK", "VK_KHR_performance_query");
    }

    private static boolean check_KHR_pipeline_binary(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_pipeline_binary")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            515, 516, 517, 518, 519
        },
            "vkCreatePipelineBinariesKHR", "vkDestroyPipelineBinaryKHR", "vkGetPipelineKeyKHR", "vkGetPipelineBinaryDataKHR", 
            "vkReleaseCapturedPipelineDataKHR"
        ) || reportMissing("VK", "VK_KHR_pipeline_binary");
    }

    private static boolean check_KHR_pipeline_executable_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_pipeline_executable_properties")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            520, 521, 522
        },
            "vkGetPipelineExecutablePropertiesKHR", "vkGetPipelineExecutableStatisticsKHR", "vkGetPipelineExecutableInternalRepresentationsKHR"
        ) || reportMissing("VK", "VK_KHR_pipeline_executable_properties");
    }

    private static boolean check_KHR_present_wait(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_present_wait")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            523
        },
            "vkWaitForPresentKHR"
        ) || reportMissing("VK", "VK_KHR_present_wait");
    }

    private static boolean check_KHR_present_wait2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_present_wait2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            524
        },
            "vkWaitForPresent2KHR"
        ) || reportMissing("VK", "VK_KHR_present_wait2");
    }

    private static boolean check_KHR_push_descriptor(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_push_descriptor")) {
            return false;
        }

        int flag0 = ext.contains("Vulkan11") || ext.contains("VK_KHR_descriptor_update_template") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            525, flag0 + 464
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
            flag0 + 526
        },
            "vkCmdTraceRaysIndirect2KHR"
        ) || reportMissing("VK", "VK_KHR_ray_tracing_maintenance1");
    }

    private static boolean check_KHR_ray_tracing_pipeline(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_ray_tracing_pipeline")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            527, 528, 529, 530, 531, 532, 533
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
            534, 535
        },
            "vkCreateSamplerYcbcrConversionKHR", "vkDestroySamplerYcbcrConversionKHR"
        ) || reportMissing("VK", "VK_KHR_sampler_ycbcr_conversion");
    }

    private static boolean check_KHR_shared_presentable_image(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_shared_presentable_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            536
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
            537, 538, 539, 540, 541, flag0 + 468, flag0 + 469, flag0 + 470
        },
            "vkCreateSwapchainKHR", "vkDestroySwapchainKHR", "vkGetSwapchainImagesKHR", "vkAcquireNextImageKHR", "vkQueuePresentKHR", 
            "vkGetDeviceGroupPresentCapabilitiesKHR", "vkGetDeviceGroupSurfacePresentModesKHR", "vkAcquireNextImage2KHR"
        ) || reportMissing("VK", "VK_KHR_swapchain");
    }

    private static boolean check_KHR_swapchain_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_swapchain_maintenance1")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            542
        },
            "vkReleaseSwapchainImagesKHR"
        ) || reportMissing("VK", "VK_KHR_swapchain_maintenance1");
    }

    private static boolean check_KHR_synchronization2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_synchronization2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            543, 544, 545, 546, 547, 548
        },
            "vkCmdSetEvent2KHR", "vkCmdResetEvent2KHR", "vkCmdWaitEvents2KHR", "vkCmdPipelineBarrier2KHR", "vkCmdWriteTimestamp2KHR", "vkQueueSubmit2KHR"
        ) || reportMissing("VK", "VK_KHR_synchronization2");
    }

    private static boolean check_KHR_timeline_semaphore(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_timeline_semaphore")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            549, 550, 551
        },
            "vkGetSemaphoreCounterValueKHR", "vkWaitSemaphoresKHR", "vkSignalSemaphoreKHR"
        ) || reportMissing("VK", "VK_KHR_timeline_semaphore");
    }

    private static boolean check_KHR_video_decode_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_decode_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            552
        },
            "vkCmdDecodeVideoKHR"
        ) || reportMissing("VK", "VK_KHR_video_decode_queue");
    }

    private static boolean check_KHR_video_encode_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_encode_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            553, 554
        },
            "vkGetEncodedVideoSessionParametersKHR", "vkCmdEncodeVideoKHR"
        ) || reportMissing("VK", "VK_KHR_video_encode_queue");
    }

    private static boolean check_KHR_video_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            555, 556, 557, 558, 559, 560, 561, 562, 563, 564
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
            565
        },
            "vkCmdSetViewportWScalingNV"
        ) || reportMissing("VK", "VK_NV_clip_space_w_scaling");
    }

    private static boolean check_NV_cluster_acceleration_structure(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_cluster_acceleration_structure")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            566, 567
        },
            "vkGetClusterAccelerationStructureBuildSizesNV", "vkCmdBuildClusterAccelerationStructureIndirectNV"
        ) || reportMissing("VK", "VK_NV_cluster_acceleration_structure");
    }

    private static boolean check_NV_compute_occupancy_priority(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_compute_occupancy_priority")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            568
        },
            "vkCmdSetComputeOccupancyPriorityNV"
        ) || reportMissing("VK", "VK_NV_compute_occupancy_priority");
    }

    private static boolean check_NV_cooperative_vector(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_cooperative_vector")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            569, 570
        },
            "vkConvertCooperativeVectorMatrixNV", "vkCmdConvertCooperativeVectorMatrixNV"
        ) || reportMissing("VK", "VK_NV_cooperative_vector");
    }

    private static boolean check_NV_copy_memory_indirect(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_copy_memory_indirect")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            571, 572
        },
            "vkCmdCopyMemoryIndirectNV", "vkCmdCopyMemoryToImageIndirectNV"
        ) || reportMissing("VK", "VK_NV_copy_memory_indirect");
    }

    private static boolean check_NV_cuda_kernel_launch(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_cuda_kernel_launch")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            573, 574, 575, 576, 577, 578
        },
            "vkCreateCudaModuleNV", "vkGetCudaModuleCacheNV", "vkCreateCudaFunctionNV", "vkDestroyCudaModuleNV", "vkDestroyCudaFunctionNV", 
            "vkCmdCudaLaunchKernelNV"
        ) || reportMissing("VK", "VK_NV_cuda_kernel_launch");
    }

    private static boolean check_NV_device_diagnostic_checkpoints(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_device_diagnostic_checkpoints")) {
            return false;
        }

        int flag0 = ext.contains("Vulkan13") || ext.contains("VK_KHR_synchronization2") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            579, 580, flag0 + 581
        },
            "vkCmdSetCheckpointNV", "vkGetQueueCheckpointDataNV", "vkGetQueueCheckpointData2NV"
        ) || reportMissing("VK", "VK_NV_device_diagnostic_checkpoints");
    }

    private static boolean check_NV_device_generated_commands(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_device_generated_commands")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            582, 583, 584, 585, 586, 587
        },
            "vkGetGeneratedCommandsMemoryRequirementsNV", "vkCmdPreprocessGeneratedCommandsNV", "vkCmdExecuteGeneratedCommandsNV", 
            "vkCmdBindPipelineShaderGroupNV", "vkCreateIndirectCommandsLayoutNV", "vkDestroyIndirectCommandsLayoutNV"
        ) || reportMissing("VK", "VK_NV_device_generated_commands");
    }

    private static boolean check_NV_device_generated_commands_compute(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_device_generated_commands_compute")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            588, 589, 590
        },
            "vkGetPipelineIndirectMemoryRequirementsNV", "vkCmdUpdatePipelineIndirectBufferNV", "vkGetPipelineIndirectDeviceAddressNV"
        ) || reportMissing("VK", "VK_NV_device_generated_commands_compute");
    }

    private static boolean check_NV_external_compute_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_external_compute_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            591, 592, 593
        },
            "vkCreateExternalComputeQueueNV", "vkDestroyExternalComputeQueueNV", "vkGetExternalComputeQueueDataNV"
        ) || reportMissing("VK", "VK_NV_external_compute_queue");
    }

    private static boolean check_NV_external_memory_rdma(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_external_memory_rdma")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            594
        },
            "vkGetMemoryRemoteAddressNV"
        ) || reportMissing("VK", "VK_NV_external_memory_rdma");
    }

    private static boolean check_NV_external_memory_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_external_memory_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            595
        },
            "vkGetMemoryWin32HandleNV"
        ) || reportMissing("VK", "VK_NV_external_memory_win32");
    }

    private static boolean check_NV_fragment_shading_rate_enums(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_fragment_shading_rate_enums")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            596
        },
            "vkCmdSetFragmentShadingRateEnumNV"
        ) || reportMissing("VK", "VK_NV_fragment_shading_rate_enums");
    }

    private static boolean check_NV_low_latency2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_low_latency2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            597, 598, 599, 600, 601
        },
            "vkSetLatencySleepModeNV", "vkLatencySleepNV", "vkSetLatencyMarkerNV", "vkGetLatencyTimingsNV", "vkQueueNotifyOutOfBandNV"
        ) || reportMissing("VK", "VK_NV_low_latency2");
    }

    private static boolean check_NV_memory_decompression(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_memory_decompression")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            602, 603
        },
            "vkCmdDecompressMemoryNV", "vkCmdDecompressMemoryIndirectCountNV"
        ) || reportMissing("VK", "VK_NV_memory_decompression");
    }

    private static boolean check_NV_mesh_shader(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_mesh_shader")) {
            return false;
        }

        int flag0 = ext.contains("Vulkan12") || ext.contains("VK_KHR_draw_indirect_count") || ext.contains("VK_AMD_draw_indirect_count") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            604, 605, flag0 + 606
        },
            "vkCmdDrawMeshTasksNV", "vkCmdDrawMeshTasksIndirectNV", "vkCmdDrawMeshTasksIndirectCountNV"
        ) || reportMissing("VK", "VK_NV_mesh_shader");
    }

    private static boolean check_NV_optical_flow(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_optical_flow")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            607, 608, 609, 610
        },
            "vkCreateOpticalFlowSessionNV", "vkDestroyOpticalFlowSessionNV", "vkBindOpticalFlowSessionImageNV", "vkCmdOpticalFlowExecuteNV"
        ) || reportMissing("VK", "VK_NV_optical_flow");
    }

    private static boolean check_NV_partitioned_acceleration_structure(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_partitioned_acceleration_structure")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            611, 612
        },
            "vkGetPartitionedAccelerationStructuresBuildSizesNV", "vkCmdBuildPartitionedAccelerationStructuresNV"
        ) || reportMissing("VK", "VK_NV_partitioned_acceleration_structure");
    }

    private static boolean check_NV_ray_tracing(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_ray_tracing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624
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
            625, 626
        },
            "vkCmdSetExclusiveScissorEnableNV", "vkCmdSetExclusiveScissorNV"
        ) || reportMissing("VK", "VK_NV_scissor_exclusive");
    }

    private static boolean check_NV_shading_rate_image(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_shading_rate_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            627, 628, 629
        },
            "vkCmdBindShadingRateImageNV", "vkCmdSetViewportShadingRatePaletteNV", "vkCmdSetCoarseSampleOrderNV"
        ) || reportMissing("VK", "VK_NV_shading_rate_image");
    }

    private static boolean check_NVX_binary_import(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NVX_binary_import")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            630, 631, 632, 633, 634
        },
            "vkCreateCuModuleNVX", "vkCreateCuFunctionNVX", "vkDestroyCuModuleNVX", "vkDestroyCuFunctionNVX", "vkCmdCuLaunchKernelNVX"
        ) || reportMissing("VK", "VK_NVX_binary_import");
    }

    private static boolean check_NVX_image_view_handle(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NVX_image_view_handle")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            635, 636, 637, 638
        },
            "vkGetImageViewHandleNVX", "vkGetImageViewHandle64NVX", "vkGetImageViewAddressNVX", "vkGetDeviceCombinedImageSamplerIndexNVX"
        ) || reportMissing("VK", "VK_NVX_image_view_handle");
    }

    private static boolean check_QCOM_tile_memory_heap(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_QCOM_tile_memory_heap")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            639
        },
            "vkCmdBindTileMemoryQCOM"
        ) || reportMissing("VK", "VK_QCOM_tile_memory_heap");
    }

    private static boolean check_QCOM_tile_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_QCOM_tile_properties")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            640, 641
        },
            "vkGetFramebufferTilePropertiesQCOM", "vkGetDynamicRenderingTilePropertiesQCOM"
        ) || reportMissing("VK", "VK_QCOM_tile_properties");
    }

    private static boolean check_QCOM_tile_shading(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_QCOM_tile_shading")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            642, 643, 644
        },
            "vkCmdDispatchTileQCOM", "vkCmdBeginPerTileExecutionQCOM", "vkCmdEndPerTileExecutionQCOM"
        ) || reportMissing("VK", "VK_QCOM_tile_shading");
    }

    private static boolean check_VALVE_descriptor_set_host_mapping(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_VALVE_descriptor_set_host_mapping")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            645, 646
        },
            "vkGetDescriptorSetLayoutHostMappingInfoVALVE", "vkGetDescriptorSetHostMappingVALVE"
        ) || reportMissing("VK", "VK_VALVE_descriptor_set_host_mapping");
    }

}
