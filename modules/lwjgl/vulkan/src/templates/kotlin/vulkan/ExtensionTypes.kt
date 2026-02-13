/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan

import org.lwjgl.generator.*
import core.linux.*
import core.windows.*

// Handle types
val VkSurfaceKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSurfaceKHR")
val VkSwapchainKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSwapchainKHR")
val VkDisplayKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDisplayKHR")
val VkDisplayModeKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDisplayModeKHR")
val VkDebugReportCallbackEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDebugReportCallbackEXT")
val VkVideoSessionKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkVideoSessionKHR")
val VkVideoSessionParametersKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkVideoSessionParametersKHR")
val VkCuModuleNVX = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkCuModuleNVX")
val VkCuFunctionNVX = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkCuFunctionNVX")
val VkDescriptorUpdateTemplateKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDescriptorUpdateTemplateKHR")
val VkDebugUtilsMessengerEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDebugUtilsMessengerEXT")
val VkTensorARM = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkTensorARM")
val VkAccelerationStructureKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkAccelerationStructureKHR")
val VkDeferredOperationKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDeferredOperationKHR")
val VkSamplerYcbcrConversionKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSamplerYcbcrConversionKHR")
val VkValidationCacheEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkValidationCacheEXT")
val VkAccelerationStructureNV = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkAccelerationStructureNV")
val VkPerformanceConfigurationINTEL = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkPerformanceConfigurationINTEL")
val VkIndirectCommandsLayoutNV = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkIndirectCommandsLayoutNV")
val VkPrivateDataSlotEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkPrivateDataSlotEXT")
val VkCudaModuleNV = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkCudaModuleNV")
val VkCudaFunctionNV = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkCudaFunctionNV")
val VkMicromapEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkMicromapEXT")
val VkTensorViewARM = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkTensorViewARM")
val VkOpticalFlowSessionNV = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkOpticalFlowSessionNV")
val VkShaderEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkShaderEXT")
val VkPipelineBinaryKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkPipelineBinaryKHR")
val VkDataGraphPipelineSessionARM = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDataGraphPipelineSessionARM")
val VkExternalComputeQueueNV = VK_DEFINE_HANDLE("VkExternalComputeQueueNV")
val VkIndirectExecutionSetEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkIndirectExecutionSetEXT")
val VkIndirectCommandsLayoutEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkIndirectCommandsLayoutEXT")

// Enum types
val VkSurfaceTransformFlagBitsKHR = "VkSurfaceTransformFlagBitsKHR".enumType
val VkPresentModeKHR = "VkPresentModeKHR".enumType
val VkColorSpaceKHR = "VkColorSpaceKHR".enumType
val VkCompositeAlphaFlagBitsKHR = "VkCompositeAlphaFlagBitsKHR".enumType
val VkSwapchainCreateFlagBitsKHR = "VkSwapchainCreateFlagBitsKHR".enumType
val VkDeviceGroupPresentModeFlagBitsKHR = "VkDeviceGroupPresentModeFlagBitsKHR".enumType
val VkDisplayPlaneAlphaFlagBitsKHR = "VkDisplayPlaneAlphaFlagBitsKHR".enumType
val VkDebugReportObjectTypeEXT = "VkDebugReportObjectTypeEXT".enumType
val VkDebugReportFlagBitsEXT = "VkDebugReportFlagBitsEXT".enumType
val VkRasterizationOrderAMD = "VkRasterizationOrderAMD".enumType
val VkVideoCodecOperationFlagBitsKHR = "VkVideoCodecOperationFlagBitsKHR".enumType
val VkVideoChromaSubsamplingFlagBitsKHR = "VkVideoChromaSubsamplingFlagBitsKHR".enumType
val VkVideoComponentBitDepthFlagBitsKHR = "VkVideoComponentBitDepthFlagBitsKHR".enumType
val VkVideoCapabilityFlagBitsKHR = "VkVideoCapabilityFlagBitsKHR".enumType
val VkVideoSessionCreateFlagBitsKHR = "VkVideoSessionCreateFlagBitsKHR".enumType
val VkVideoCodingControlFlagBitsKHR = "VkVideoCodingControlFlagBitsKHR".enumType
val VkQueryResultStatusKHR = "VkQueryResultStatusKHR".enumType
val VkVideoDecodeCapabilityFlagBitsKHR = "VkVideoDecodeCapabilityFlagBitsKHR".enumType
val VkVideoDecodeUsageFlagBitsKHR = "VkVideoDecodeUsageFlagBitsKHR".enumType
val VkVideoEncodeH264CapabilityFlagBitsKHR = "VkVideoEncodeH264CapabilityFlagBitsKHR".enumType
val VkVideoEncodeH264StdFlagBitsKHR = "VkVideoEncodeH264StdFlagBitsKHR".enumType
val VkVideoEncodeH264RateControlFlagBitsKHR = "VkVideoEncodeH264RateControlFlagBitsKHR".enumType
val VkVideoEncodeH265CapabilityFlagBitsKHR = "VkVideoEncodeH265CapabilityFlagBitsKHR".enumType
val VkVideoEncodeH265StdFlagBitsKHR = "VkVideoEncodeH265StdFlagBitsKHR".enumType
val VkVideoEncodeH265CtbSizeFlagBitsKHR = "VkVideoEncodeH265CtbSizeFlagBitsKHR".enumType
val VkVideoEncodeH265TransformBlockSizeFlagBitsKHR = "VkVideoEncodeH265TransformBlockSizeFlagBitsKHR".enumType
val VkVideoEncodeH265RateControlFlagBitsKHR = "VkVideoEncodeH265RateControlFlagBitsKHR".enumType
val VkVideoDecodeH264PictureLayoutFlagBitsKHR = "VkVideoDecodeH264PictureLayoutFlagBitsKHR".enumType
val VkShaderInfoTypeAMD = "VkShaderInfoTypeAMD".enumType
val VkRenderingFlagBitsKHR = "VkRenderingFlagBitsKHR".enumType
val VkExternalMemoryHandleTypeFlagBitsNV = "VkExternalMemoryHandleTypeFlagBitsNV".enumType
val VkExternalMemoryFeatureFlagBitsNV = "VkExternalMemoryFeatureFlagBitsNV".enumType
val VkPeerMemoryFeatureFlagBitsKHR = "VkPeerMemoryFeatureFlagBitsKHR".enumType
val VkMemoryAllocateFlagBitsKHR = "VkMemoryAllocateFlagBitsKHR".enumType
val VkValidationCheckEXT = "VkValidationCheckEXT".enumType
val VkPipelineRobustnessBufferBehaviorEXT = "VkPipelineRobustnessBufferBehaviorEXT".enumType
val VkPipelineRobustnessImageBehaviorEXT = "VkPipelineRobustnessImageBehaviorEXT".enumType
val VkExternalMemoryHandleTypeFlagBitsKHR = "VkExternalMemoryHandleTypeFlagBitsKHR".enumType
val VkExternalMemoryFeatureFlagBitsKHR = "VkExternalMemoryFeatureFlagBitsKHR".enumType
val VkExternalSemaphoreHandleTypeFlagBitsKHR = "VkExternalSemaphoreHandleTypeFlagBitsKHR".enumType
val VkExternalSemaphoreFeatureFlagBitsKHR = "VkExternalSemaphoreFeatureFlagBitsKHR".enumType
val VkSemaphoreImportFlagBitsKHR = "VkSemaphoreImportFlagBitsKHR".enumType
val VkConditionalRenderingFlagBitsEXT = "VkConditionalRenderingFlagBitsEXT".enumType
val VkDescriptorUpdateTemplateTypeKHR = "VkDescriptorUpdateTemplateTypeKHR".enumType
val VkSurfaceCounterFlagBitsEXT = "VkSurfaceCounterFlagBitsEXT".enumType
val VkDisplayPowerStateEXT = "VkDisplayPowerStateEXT".enumType
val VkDeviceEventTypeEXT = "VkDeviceEventTypeEXT".enumType
val VkDisplayEventTypeEXT = "VkDisplayEventTypeEXT".enumType
val VkViewportCoordinateSwizzleNV = "VkViewportCoordinateSwizzleNV".enumType
val VkDiscardRectangleModeEXT = "VkDiscardRectangleModeEXT".enumType
val VkConservativeRasterizationModeEXT = "VkConservativeRasterizationModeEXT".enumType
val VkExternalFenceHandleTypeFlagBitsKHR = "VkExternalFenceHandleTypeFlagBitsKHR".enumType
val VkExternalFenceFeatureFlagBitsKHR = "VkExternalFenceFeatureFlagBitsKHR".enumType
val VkFenceImportFlagBitsKHR = "VkFenceImportFlagBitsKHR".enumType
val VkPerformanceCounterUnitKHR = "VkPerformanceCounterUnitKHR".enumType
val VkPerformanceCounterScopeKHR = "VkPerformanceCounterScopeKHR".enumType
val VkPerformanceCounterStorageKHR = "VkPerformanceCounterStorageKHR".enumType
val VkPerformanceCounterDescriptionFlagBitsKHR = "VkPerformanceCounterDescriptionFlagBitsKHR".enumType
val VkAcquireProfilingLockFlagBitsKHR = "VkAcquireProfilingLockFlagBitsKHR".enumType
val VkPointClippingBehaviorKHR = "VkPointClippingBehaviorKHR".enumType
val VkTessellationDomainOriginKHR = "VkTessellationDomainOriginKHR".enumType
val VkDebugUtilsMessageSeverityFlagBitsEXT = "VkDebugUtilsMessageSeverityFlagBitsEXT".enumType
val VkDebugUtilsMessageTypeFlagBitsEXT = "VkDebugUtilsMessageTypeFlagBitsEXT".enumType
val VkSamplerReductionModeEXT = "VkSamplerReductionModeEXT".enumType
val VkDescriptorMappingSourceEXT = "VkDescriptorMappingSourceEXT".enumType
val VkSpirvResourceTypeFlagBitsEXT = "VkSpirvResourceTypeFlagBitsEXT".enumType
val VkBlendOverlapEXT = "VkBlendOverlapEXT".enumType
val VkAccelerationStructureTypeKHR = "VkAccelerationStructureTypeKHR".enumType
val VkBuildAccelerationStructureModeKHR = "VkBuildAccelerationStructureModeKHR".enumType
val VkGeometryTypeKHR = "VkGeometryTypeKHR".enumType
val VkAccelerationStructureBuildTypeKHR = "VkAccelerationStructureBuildTypeKHR".enumType
val VkGeometryFlagBitsKHR = "VkGeometryFlagBitsKHR".enumType
val VkGeometryInstanceFlagBitsKHR = "VkGeometryInstanceFlagBitsKHR".enumType
val VkBuildAccelerationStructureFlagBitsKHR = "VkBuildAccelerationStructureFlagBitsKHR".enumType
val VkCopyAccelerationStructureModeKHR = "VkCopyAccelerationStructureModeKHR".enumType
val VkAccelerationStructureCompatibilityKHR = "VkAccelerationStructureCompatibilityKHR".enumType
val VkAccelerationStructureCreateFlagBitsKHR = "VkAccelerationStructureCreateFlagBitsKHR".enumType
val VkRayTracingShaderGroupTypeKHR = "VkRayTracingShaderGroupTypeKHR".enumType
val VkShaderGroupShaderKHR = "VkShaderGroupShaderKHR".enumType
val VkCoverageModulationModeNV = "VkCoverageModulationModeNV".enumType
val VkSamplerYcbcrModelConversionKHR = "VkSamplerYcbcrModelConversionKHR".enumType
val VkSamplerYcbcrRangeKHR = "VkSamplerYcbcrRangeKHR".enumType
val VkChromaLocationKHR = "VkChromaLocationKHR".enumType
val VkValidationCacheHeaderVersionEXT = "VkValidationCacheHeaderVersionEXT".enumType
val VkDescriptorBindingFlagBitsEXT = "VkDescriptorBindingFlagBitsEXT".enumType
val VkShadingRatePaletteEntryNV = "VkShadingRatePaletteEntryNV".enumType
val VkCoarseSampleOrderTypeNV = "VkCoarseSampleOrderTypeNV".enumType
val VkRayTracingShaderGroupTypeNV = "VkRayTracingShaderGroupTypeNV".enumType
val VkGeometryTypeNV = "VkGeometryTypeNV".enumType
val VkAccelerationStructureTypeNV = "VkAccelerationStructureTypeNV".enumType
val VkGeometryFlagBitsNV = "VkGeometryFlagBitsNV".enumType
val VkGeometryInstanceFlagBitsNV = "VkGeometryInstanceFlagBitsNV".enumType
val VkBuildAccelerationStructureFlagBitsNV = "VkBuildAccelerationStructureFlagBitsNV".enumType
val VkCopyAccelerationStructureModeNV = "VkCopyAccelerationStructureModeNV".enumType
val VkAccelerationStructureMemoryRequirementsTypeNV = "VkAccelerationStructureMemoryRequirementsTypeNV".enumType
val VkQueueGlobalPriorityEXT = "VkQueueGlobalPriorityEXT".enumType
val VkPipelineCompilerControlFlagBitsAMD = "VkPipelineCompilerControlFlagBitsAMD".enumType
val VkTimeDomainEXT = "VkTimeDomainEXT".enumType
val VkTimeDomainKHR = "VkTimeDomainKHR".enumType
val VkQueueGlobalPriorityKHR = "VkQueueGlobalPriorityKHR".enumType
val VkMemoryOverallocationBehaviorAMD = "VkMemoryOverallocationBehaviorAMD".enumType
val VkPipelineCreationFeedbackFlagBitsEXT = "VkPipelineCreationFeedbackFlagBitsEXT".enumType
val VkDriverIdKHR = "VkDriverIdKHR".enumType
val VkShaderFloatControlsIndependenceKHR = "VkShaderFloatControlsIndependenceKHR".enumType
val VkResolveModeFlagBitsKHR = "VkResolveModeFlagBitsKHR".enumType
val VkSemaphoreTypeKHR = "VkSemaphoreTypeKHR".enumType
val VkSemaphoreWaitFlagBitsKHR = "VkSemaphoreWaitFlagBitsKHR".enumType
val VkPresentStageFlagBitsEXT = "VkPresentStageFlagBitsEXT".enumType
val VkPresentTimingInfoFlagBitsEXT = "VkPresentTimingInfoFlagBitsEXT".enumType
val VkPastPresentationTimingFlagBitsEXT = "VkPastPresentationTimingFlagBitsEXT".enumType
val VkPerformanceConfigurationTypeINTEL = "VkPerformanceConfigurationTypeINTEL".enumType
val VkQueryPoolSamplingModeINTEL = "VkQueryPoolSamplingModeINTEL".enumType
val VkPerformanceOverrideTypeINTEL = "VkPerformanceOverrideTypeINTEL".enumType
val VkPerformanceParameterTypeINTEL = "VkPerformanceParameterTypeINTEL".enumType
val VkPerformanceValueTypeINTEL = "VkPerformanceValueTypeINTEL".enumType
val VkFragmentShadingRateCombinerOpKHR = "VkFragmentShadingRateCombinerOpKHR".enumType
val VkShaderCorePropertiesFlagBitsAMD = "VkShaderCorePropertiesFlagBitsAMD".enumType
val VkToolPurposeFlagBitsEXT = "VkToolPurposeFlagBitsEXT".enumType
val VkValidationFeatureEnableEXT = "VkValidationFeatureEnableEXT".enumType
val VkValidationFeatureDisableEXT = "VkValidationFeatureDisableEXT".enumType
val VkComponentTypeNV = "VkComponentTypeNV".enumType
val VkScopeNV = "VkScopeNV".enumType
val VkCoverageReductionModeNV = "VkCoverageReductionModeNV".enumType
val VkProvokingVertexModeEXT = "VkProvokingVertexModeEXT".enumType
val VkFullScreenExclusiveEXT = "VkFullScreenExclusiveEXT".enumType
val VkLineRasterizationModeEXT = "VkLineRasterizationModeEXT".enumType
val VkPipelineExecutableStatisticFormatKHR = "VkPipelineExecutableStatisticFormatKHR".enumType
val VkHostImageCopyFlagBitsEXT = "VkHostImageCopyFlagBitsEXT".enumType
val VkMemoryUnmapFlagBitsKHR = "VkMemoryUnmapFlagBitsKHR".enumType
val VkPresentScalingFlagBitsEXT = "VkPresentScalingFlagBitsEXT".enumType
val VkPresentGravityFlagBitsEXT = "VkPresentGravityFlagBitsEXT".enumType
val VkIndirectStateFlagBitsNV = "VkIndirectStateFlagBitsNV".enumType
val VkIndirectCommandsTokenTypeNV = "VkIndirectCommandsTokenTypeNV".enumType
val VkIndirectCommandsLayoutUsageFlagBitsNV = "VkIndirectCommandsLayoutUsageFlagBitsNV".enumType
val VkDepthBiasRepresentationEXT = "VkDepthBiasRepresentationEXT".enumType
val VkDeviceMemoryReportEventTypeEXT = "VkDeviceMemoryReportEventTypeEXT".enumType
val VkVideoEncodeCapabilityFlagBitsKHR = "VkVideoEncodeCapabilityFlagBitsKHR".enumType
val VkVideoEncodeFeedbackFlagBitsKHR = "VkVideoEncodeFeedbackFlagBitsKHR".enumType
val VkVideoEncodeUsageFlagBitsKHR = "VkVideoEncodeUsageFlagBitsKHR".enumType
val VkVideoEncodeContentFlagBitsKHR = "VkVideoEncodeContentFlagBitsKHR".enumType
val VkVideoEncodeTuningModeKHR = "VkVideoEncodeTuningModeKHR".enumType
val VkVideoEncodeRateControlModeFlagBitsKHR = "VkVideoEncodeRateControlModeFlagBitsKHR".enumType
val VkDeviceDiagnosticsConfigFlagBitsNV = "VkDeviceDiagnosticsConfigFlagBitsNV".enumType
val VkTileShadingRenderPassFlagBitsQCOM = "VkTileShadingRenderPassFlagBitsQCOM".enumType
val VkExportMetalObjectTypeFlagBitsEXT = "VkExportMetalObjectTypeFlagBitsEXT".enumType
val VkPipelineStageFlagBits2KHR = "VkPipelineStageFlagBits2KHR".enumType
val VkAccessFlagBits2KHR = "VkAccessFlagBits2KHR".enumType
val VkSubmitFlagBitsKHR = "VkSubmitFlagBitsKHR".enumType
val VkGraphicsPipelineLibraryFlagBitsEXT = "VkGraphicsPipelineLibraryFlagBitsEXT".enumType
val VkPipelineLayoutCreateFlagBits = "VkPipelineLayoutCreateFlagBits".enumType
val VkFragmentShadingRateTypeNV = "VkFragmentShadingRateTypeNV".enumType
val VkFragmentShadingRateNV = "VkFragmentShadingRateNV".enumType
val VkAccelerationStructureMotionInstanceTypeNV = "VkAccelerationStructureMotionInstanceTypeNV".enumType
val VkImageCompressionFlagBitsEXT = "VkImageCompressionFlagBitsEXT".enumType
val VkImageCompressionFixedRateFlagBitsEXT = "VkImageCompressionFixedRateFlagBitsEXT".enumType
val VkDeviceFaultAddressTypeEXT = "VkDeviceFaultAddressTypeEXT".enumType
val VkDeviceFaultVendorBinaryHeaderVersionEXT = "VkDeviceFaultVendorBinaryHeaderVersionEXT".enumType
val VkDeviceAddressBindingTypeEXT = "VkDeviceAddressBindingTypeEXT".enumType
val VkDeviceAddressBindingFlagBitsEXT = "VkDeviceAddressBindingFlagBitsEXT".enumType
val VkFormatFeatureFlagBits2KHR = "VkFormatFeatureFlagBits2KHR".enumType
val VkFrameBoundaryFlagBitsEXT = "VkFrameBoundaryFlagBitsEXT".enumType
val VkVideoEncodeRgbModelConversionFlagBitsVALVE = "VkVideoEncodeRgbModelConversionFlagBitsVALVE".enumType
val VkVideoEncodeRgbRangeCompressionFlagBitsVALVE = "VkVideoEncodeRgbRangeCompressionFlagBitsVALVE".enumType
val VkVideoEncodeRgbChromaOffsetFlagBitsVALVE = "VkVideoEncodeRgbChromaOffsetFlagBitsVALVE".enumType
val VkMicromapTypeEXT = "VkMicromapTypeEXT".enumType
val VkBuildMicromapModeEXT = "VkBuildMicromapModeEXT".enumType
val VkBuildMicromapFlagBitsEXT = "VkBuildMicromapFlagBitsEXT".enumType
val VkCopyMicromapModeEXT = "VkCopyMicromapModeEXT".enumType
val VkMicromapCreateFlagBitsEXT = "VkMicromapCreateFlagBitsEXT".enumType
val VkOpacityMicromapFormatEXT = "VkOpacityMicromapFormatEXT".enumType
val VkOpacityMicromapSpecialIndexEXT = "VkOpacityMicromapSpecialIndexEXT".enumType
val VkDisplacementMicromapFormatNV = "VkDisplacementMicromapFormatNV".enumType
val VkPhysicalDeviceSchedulingControlsFlagBitsARM = "VkPhysicalDeviceSchedulingControlsFlagBitsARM".enumType
val VkMemoryDecompressionMethodFlagBitsNV = "VkMemoryDecompressionMethodFlagBitsNV".enumType
val VkRayTracingLssIndexingModeNV = "VkRayTracingLssIndexingModeNV".enumType
val VkRayTracingLssPrimitiveEndCapsModeNV = "VkRayTracingLssPrimitiveEndCapsModeNV".enumType
val VkSubpassMergeStatusEXT = "VkSubpassMergeStatusEXT".enumType
val VkDirectDriverLoadingModeLUNARG = "VkDirectDriverLoadingModeLUNARG".enumType
val VkTensorCreateFlagBitsARM = "VkTensorCreateFlagBitsARM".enumType
val VkTensorViewCreateFlagBitsARM = "VkTensorViewCreateFlagBitsARM".enumType
val VkTensorUsageFlagBitsARM = "VkTensorUsageFlagBitsARM".enumType
val VkTensorTilingARM = "VkTensorTilingARM".enumType
val VkPipelineColorBlendStateCreateFlagBits = "VkPipelineColorBlendStateCreateFlagBits".enumType
val VkPipelineDepthStencilStateCreateFlagBits = "VkPipelineDepthStencilStateCreateFlagBits".enumType
val VkOpticalFlowUsageFlagBitsNV = "VkOpticalFlowUsageFlagBitsNV".enumType
val VkOpticalFlowGridSizeFlagBitsNV = "VkOpticalFlowGridSizeFlagBitsNV".enumType
val VkOpticalFlowPerformanceLevelNV = "VkOpticalFlowPerformanceLevelNV".enumType
val VkOpticalFlowSessionBindingPointNV = "VkOpticalFlowSessionBindingPointNV".enumType
val VkOpticalFlowSessionCreateFlagBitsNV = "VkOpticalFlowSessionCreateFlagBitsNV".enumType
val VkOpticalFlowExecuteFlagBitsNV = "VkOpticalFlowExecuteFlagBitsNV".enumType
val VkPipelineCreateFlagBits2KHR = "VkPipelineCreateFlagBits2KHR".enumType
val VkBufferUsageFlagBits2KHR = "VkBufferUsageFlagBits2KHR".enumType
val VkAntiLagModeAMD = "VkAntiLagModeAMD".enumType
val VkAntiLagStageAMD = "VkAntiLagStageAMD".enumType
val VkCompressedTriangleFormatAMDX = "VkCompressedTriangleFormatAMDX".enumType
val VkShaderCreateFlagBitsEXT = "VkShaderCreateFlagBitsEXT".enumType
val VkShaderCodeTypeEXT = "VkShaderCodeTypeEXT".enumType
val VkDepthClampModeEXT = "VkDepthClampModeEXT".enumType
val VkPresentScalingFlagBitsKHR = "VkPresentScalingFlagBitsKHR".enumType
val VkPresentGravityFlagBitsKHR = "VkPresentGravityFlagBitsKHR".enumType
val VkRayTracingInvocationReorderModeNV = "VkRayTracingInvocationReorderModeNV".enumType
val VkRayTracingInvocationReorderModeEXT = "VkRayTracingInvocationReorderModeEXT".enumType
val VkCooperativeVectorMatrixLayoutNV = "VkCooperativeVectorMatrixLayoutNV".enumType
val VkLayerSettingTypeEXT = "VkLayerSettingTypeEXT".enumType
val VkLatencyMarkerNV = "VkLatencyMarkerNV".enumType
val VkOutOfBandQueueTypeNV = "VkOutOfBandQueueTypeNV".enumType
val VkComponentTypeKHR = "VkComponentTypeKHR".enumType
val VkScopeKHR = "VkScopeKHR".enumType
val VkDataGraphPipelineSessionBindPointARM = "VkDataGraphPipelineSessionBindPointARM".enumType
val VkDataGraphPipelineSessionBindPointTypeARM = "VkDataGraphPipelineSessionBindPointTypeARM".enumType
val VkDataGraphPipelineSessionCreateFlagBitsARM = "VkDataGraphPipelineSessionCreateFlagBitsARM".enumType
val VkDataGraphPipelinePropertyARM = "VkDataGraphPipelinePropertyARM".enumType
val VkDataGraphPipelineDispatchFlagBitsARM = "VkDataGraphPipelineDispatchFlagBitsARM".enumType
val VkPhysicalDeviceDataGraphProcessingEngineTypeARM = "VkPhysicalDeviceDataGraphProcessingEngineTypeARM".enumType
val VkPhysicalDeviceDataGraphOperationTypeARM = "VkPhysicalDeviceDataGraphOperationTypeARM".enumType
val VkVideoEncodeAV1PredictionModeKHR = "VkVideoEncodeAV1PredictionModeKHR".enumType
val VkVideoEncodeAV1RateControlGroupKHR = "VkVideoEncodeAV1RateControlGroupKHR".enumType
val VkVideoEncodeAV1CapabilityFlagBitsKHR = "VkVideoEncodeAV1CapabilityFlagBitsKHR".enumType
val VkVideoEncodeAV1StdFlagBitsKHR = "VkVideoEncodeAV1StdFlagBitsKHR".enumType
val VkVideoEncodeAV1SuperblockSizeFlagBitsKHR = "VkVideoEncodeAV1SuperblockSizeFlagBitsKHR".enumType
val VkVideoEncodeAV1RateControlFlagBitsKHR = "VkVideoEncodeAV1RateControlFlagBitsKHR".enumType
val VkBlockMatchWindowCompareModeQCOM = "VkBlockMatchWindowCompareModeQCOM".enumType
val VkCubicFilterWeightsQCOM = "VkCubicFilterWeightsQCOM".enumType
val VkLayeredDriverUnderlyingApiMSFT = "VkLayeredDriverUnderlyingApiMSFT".enumType
val VkLineRasterizationModeKHR = "VkLineRasterizationModeKHR".enumType
val VkAddressCopyFlagBitsKHR = "VkAddressCopyFlagBitsKHR".enumType
val VkMemoryDecompressionMethodFlagBitsEXT = "VkMemoryDecompressionMethodFlagBitsEXT".enumType
val VkDisplaySurfaceStereoTypeNV = "VkDisplaySurfaceStereoTypeNV".enumType
val VkVideoEncodeIntraRefreshModeFlagBitsKHR = "VkVideoEncodeIntraRefreshModeFlagBitsKHR".enumType
val VkVideoEncodeFlagBitsKHR = "VkVideoEncodeFlagBitsKHR".enumType
val VkVideoSessionParametersCreateFlagBitsKHR = "VkVideoSessionParametersCreateFlagBitsKHR".enumType
val VkPhysicalDeviceLayeredApiKHR = "VkPhysicalDeviceLayeredApiKHR".enumType
val VkClusterAccelerationStructureTypeNV = "VkClusterAccelerationStructureTypeNV".enumType
val VkClusterAccelerationStructureOpTypeNV = "VkClusterAccelerationStructureOpTypeNV".enumType
val VkClusterAccelerationStructureOpModeNV = "VkClusterAccelerationStructureOpModeNV".enumType
val VkClusterAccelerationStructureClusterFlagBitsNV = "VkClusterAccelerationStructureClusterFlagBitsNV".enumType
val VkClusterAccelerationStructureGeometryFlagBitsNV = "VkClusterAccelerationStructureGeometryFlagBitsNV".enumType
val VkClusterAccelerationStructureAddressResolutionFlagBitsNV = "VkClusterAccelerationStructureAddressResolutionFlagBitsNV".enumType
val VkClusterAccelerationStructureIndexFormatFlagBitsNV = "VkClusterAccelerationStructureIndexFormatFlagBitsNV".enumType
val VkPartitionedAccelerationStructureOpTypeNV = "VkPartitionedAccelerationStructureOpTypeNV".enumType
val VkPartitionedAccelerationStructureInstanceFlagBitsNV = "VkPartitionedAccelerationStructureInstanceFlagBitsNV".enumType
val VkIndirectExecutionSetInfoTypeEXT = "VkIndirectExecutionSetInfoTypeEXT".enumType
val VkIndirectCommandsTokenTypeEXT = "VkIndirectCommandsTokenTypeEXT".enumType
val VkIndirectCommandsInputModeFlagBitsEXT = "VkIndirectCommandsInputModeFlagBitsEXT".enumType
val VkIndirectCommandsLayoutUsageFlagBitsEXT = "VkIndirectCommandsLayoutUsageFlagBitsEXT".enumType
val VkAccessFlagBits3KHR = "VkAccessFlagBits3KHR".enumType
val VkDefaultVertexAttributeValueKHR = "VkDefaultVertexAttributeValueKHR".enumType
val VkDataGraphModelCacheTypeQCOM = "VkDataGraphModelCacheTypeQCOM".enumType
val VkRenderingAttachmentFlagBitsKHR = "VkRenderingAttachmentFlagBitsKHR".enumType
val VkResolveImageFlagBitsKHR = "VkResolveImageFlagBitsKHR".enumType

// Bitmask types
val VkCompositeAlphaFlagsKHR = typedef(VkFlags, "VkCompositeAlphaFlagsKHR")
val VkSurfaceTransformFlagsKHR = typedef(VkFlags, "VkSurfaceTransformFlagsKHR")
val VkSwapchainCreateFlagsKHR = typedef(VkFlags, "VkSwapchainCreateFlagsKHR")
val VkDeviceGroupPresentModeFlagsKHR = typedef(VkFlags, "VkDeviceGroupPresentModeFlagsKHR")
val VkDisplayModeCreateFlagsKHR = typedef(VkFlags, "VkDisplayModeCreateFlagsKHR")
val VkDisplayPlaneAlphaFlagsKHR = typedef(VkFlags, "VkDisplayPlaneAlphaFlagsKHR")
val VkDisplaySurfaceCreateFlagsKHR = typedef(VkFlags, "VkDisplaySurfaceCreateFlagsKHR")
val VkXlibSurfaceCreateFlagsKHR = typedef(VkFlags, "VkXlibSurfaceCreateFlagsKHR")
val VkXcbSurfaceCreateFlagsKHR = typedef(VkFlags, "VkXcbSurfaceCreateFlagsKHR")
val VkWaylandSurfaceCreateFlagsKHR = typedef(VkFlags, "VkWaylandSurfaceCreateFlagsKHR")
val VkAndroidSurfaceCreateFlagsKHR = typedef(VkFlags, "VkAndroidSurfaceCreateFlagsKHR")
val VkWin32SurfaceCreateFlagsKHR = typedef(VkFlags, "VkWin32SurfaceCreateFlagsKHR")
val VkDebugReportFlagsEXT = typedef(VkFlags, "VkDebugReportFlagsEXT")
val VkVideoCodecOperationFlagsKHR = typedef(VkFlags, "VkVideoCodecOperationFlagsKHR")
val VkVideoChromaSubsamplingFlagsKHR = typedef(VkFlags, "VkVideoChromaSubsamplingFlagsKHR")
val VkVideoComponentBitDepthFlagsKHR = typedef(VkFlags, "VkVideoComponentBitDepthFlagsKHR")
val VkVideoCapabilityFlagsKHR = typedef(VkFlags, "VkVideoCapabilityFlagsKHR")
val VkVideoSessionCreateFlagsKHR = typedef(VkFlags, "VkVideoSessionCreateFlagsKHR")
val VkVideoSessionParametersCreateFlagsKHR = typedef(VkFlags, "VkVideoSessionParametersCreateFlagsKHR")
val VkVideoBeginCodingFlagsKHR = typedef(VkFlags, "VkVideoBeginCodingFlagsKHR")
val VkVideoEndCodingFlagsKHR = typedef(VkFlags, "VkVideoEndCodingFlagsKHR")
val VkVideoCodingControlFlagsKHR = typedef(VkFlags, "VkVideoCodingControlFlagsKHR")
val VkVideoDecodeCapabilityFlagsKHR = typedef(VkFlags, "VkVideoDecodeCapabilityFlagsKHR")
val VkVideoDecodeUsageFlagsKHR = typedef(VkFlags, "VkVideoDecodeUsageFlagsKHR")
val VkVideoDecodeFlagsKHR = typedef(VkFlags, "VkVideoDecodeFlagsKHR")
val VkPipelineRasterizationStateStreamCreateFlagsEXT = typedef(VkFlags, "VkPipelineRasterizationStateStreamCreateFlagsEXT")
val VkVideoEncodeH264CapabilityFlagsKHR = typedef(VkFlags, "VkVideoEncodeH264CapabilityFlagsKHR")
val VkVideoEncodeH264StdFlagsKHR = typedef(VkFlags, "VkVideoEncodeH264StdFlagsKHR")
val VkVideoEncodeH264RateControlFlagsKHR = typedef(VkFlags, "VkVideoEncodeH264RateControlFlagsKHR")
val VkVideoEncodeH265CapabilityFlagsKHR = typedef(VkFlags, "VkVideoEncodeH265CapabilityFlagsKHR")
val VkVideoEncodeH265StdFlagsKHR = typedef(VkFlags, "VkVideoEncodeH265StdFlagsKHR")
val VkVideoEncodeH265CtbSizeFlagsKHR = typedef(VkFlags, "VkVideoEncodeH265CtbSizeFlagsKHR")
val VkVideoEncodeH265TransformBlockSizeFlagsKHR = typedef(VkFlags, "VkVideoEncodeH265TransformBlockSizeFlagsKHR")
val VkVideoEncodeH265RateControlFlagsKHR = typedef(VkFlags, "VkVideoEncodeH265RateControlFlagsKHR")
val VkVideoDecodeH264PictureLayoutFlagsKHR = typedef(VkFlags, "VkVideoDecodeH264PictureLayoutFlagsKHR")
val VkRenderingFlagsKHR = typedef(VkFlags, "VkRenderingFlagsKHR")
val VkExternalMemoryHandleTypeFlagsNV = typedef(VkFlags, "VkExternalMemoryHandleTypeFlagsNV")
val VkExternalMemoryFeatureFlagsNV = typedef(VkFlags, "VkExternalMemoryFeatureFlagsNV")
val VkPeerMemoryFeatureFlagsKHR = typedef(VkFlags, "VkPeerMemoryFeatureFlagsKHR")
val VkMemoryAllocateFlagsKHR = typedef(VkFlags, "VkMemoryAllocateFlagsKHR")
val VkCommandPoolTrimFlagsKHR = typedef(VkFlags, "VkCommandPoolTrimFlagsKHR")
val VkExternalMemoryHandleTypeFlagsKHR = typedef(VkFlags, "VkExternalMemoryHandleTypeFlagsKHR")
val VkExternalMemoryFeatureFlagsKHR = typedef(VkFlags, "VkExternalMemoryFeatureFlagsKHR")
val VkExternalSemaphoreHandleTypeFlagsKHR = typedef(VkFlags, "VkExternalSemaphoreHandleTypeFlagsKHR")
val VkExternalSemaphoreFeatureFlagsKHR = typedef(VkFlags, "VkExternalSemaphoreFeatureFlagsKHR")
val VkSemaphoreImportFlagsKHR = typedef(VkFlags, "VkSemaphoreImportFlagsKHR")
val VkConditionalRenderingFlagsEXT = typedef(VkFlags, "VkConditionalRenderingFlagsEXT")
val VkDescriptorUpdateTemplateCreateFlagsKHR = typedef(VkFlags, "VkDescriptorUpdateTemplateCreateFlagsKHR")
val VkSurfaceCounterFlagsEXT = typedef(VkFlags, "VkSurfaceCounterFlagsEXT")
val VkPipelineViewportSwizzleStateCreateFlagsNV = typedef(VkFlags, "VkPipelineViewportSwizzleStateCreateFlagsNV")
val VkPipelineDiscardRectangleStateCreateFlagsEXT = typedef(VkFlags, "VkPipelineDiscardRectangleStateCreateFlagsEXT")
val VkPipelineRasterizationConservativeStateCreateFlagsEXT = typedef(VkFlags, "VkPipelineRasterizationConservativeStateCreateFlagsEXT")
val VkPipelineRasterizationDepthClipStateCreateFlagsEXT = typedef(VkFlags, "VkPipelineRasterizationDepthClipStateCreateFlagsEXT")
val VkExternalFenceHandleTypeFlagsKHR = typedef(VkFlags, "VkExternalFenceHandleTypeFlagsKHR")
val VkExternalFenceFeatureFlagsKHR = typedef(VkFlags, "VkExternalFenceFeatureFlagsKHR")
val VkFenceImportFlagsKHR = typedef(VkFlags, "VkFenceImportFlagsKHR")
val VkPerformanceCounterDescriptionFlagsKHR = typedef(VkFlags, "VkPerformanceCounterDescriptionFlagsKHR")
val VkAcquireProfilingLockFlagsKHR = typedef(VkFlags, "VkAcquireProfilingLockFlagsKHR")
val VkMacOSSurfaceCreateFlagsMVK = typedef(VkFlags, "VkMacOSSurfaceCreateFlagsMVK")
val VkDebugUtilsMessageTypeFlagsEXT = typedef(VkFlags, "VkDebugUtilsMessageTypeFlagsEXT")
val VkDebugUtilsMessengerCallbackDataFlagsEXT = typedef(VkFlags, "VkDebugUtilsMessengerCallbackDataFlagsEXT")
val VkDebugUtilsMessageSeverityFlagsEXT = typedef(VkFlags, "VkDebugUtilsMessageSeverityFlagsEXT")
val VkDebugUtilsMessengerCreateFlagsEXT = typedef(VkFlags, "VkDebugUtilsMessengerCreateFlagsEXT")
val VkTensorViewCreateFlagsARM = typedef(VkFlags64, "VkTensorViewCreateFlagsARM")
val VkSpirvResourceTypeFlagsEXT = typedef(VkFlags, "VkSpirvResourceTypeFlagsEXT")
val VkPipelineCoverageToColorStateCreateFlagsNV = typedef(VkFlags, "VkPipelineCoverageToColorStateCreateFlagsNV")
val VkBuildAccelerationStructureFlagsKHR = typedef(VkFlags, "VkBuildAccelerationStructureFlagsKHR")
val VkGeometryFlagsKHR = typedef(VkFlags, "VkGeometryFlagsKHR")
val VkGeometryInstanceFlagsKHR = typedef(VkFlags, "VkGeometryInstanceFlagsKHR")
val VkAccelerationStructureCreateFlagsKHR = typedef(VkFlags, "VkAccelerationStructureCreateFlagsKHR")
val VkPipelineCoverageModulationStateCreateFlagsNV = typedef(VkFlags, "VkPipelineCoverageModulationStateCreateFlagsNV")
val VkValidationCacheCreateFlagsEXT = typedef(VkFlags, "VkValidationCacheCreateFlagsEXT")
val VkDescriptorBindingFlagsEXT = typedef(VkFlags, "VkDescriptorBindingFlagsEXT")
val VkGeometryFlagsNV = typedef(VkFlags, "VkGeometryFlagsNV")
val VkGeometryInstanceFlagsNV = typedef(VkFlags, "VkGeometryInstanceFlagsNV")
val VkBuildAccelerationStructureFlagsNV = typedef(VkFlags, "VkBuildAccelerationStructureFlagsNV")
val VkPipelineCompilerControlFlagsAMD = typedef(VkFlags, "VkPipelineCompilerControlFlagsAMD")
val VkPipelineCreationFeedbackFlagsEXT = typedef(VkFlags, "VkPipelineCreationFeedbackFlagsEXT")
val VkResolveModeFlagsKHR = typedef(VkFlags, "VkResolveModeFlagsKHR")
val VkSemaphoreWaitFlagsKHR = typedef(VkFlags, "VkSemaphoreWaitFlagsKHR")
val VkPresentStageFlagsEXT = typedef(VkFlags, "VkPresentStageFlagsEXT")
val VkPastPresentationTimingFlagsEXT = typedef(VkFlags, "VkPastPresentationTimingFlagsEXT")
val VkPresentTimingInfoFlagsEXT = typedef(VkFlags, "VkPresentTimingInfoFlagsEXT")
val VkMetalSurfaceCreateFlagsEXT = typedef(VkFlags, "VkMetalSurfaceCreateFlagsEXT")
val VkShaderCorePropertiesFlagsAMD = typedef(VkFlags, "VkShaderCorePropertiesFlagsAMD")
val VkToolPurposeFlagsEXT = typedef(VkFlags, "VkToolPurposeFlagsEXT")
val VkPipelineCoverageReductionStateCreateFlagsNV = typedef(VkFlags, "VkPipelineCoverageReductionStateCreateFlagsNV")
val VkHeadlessSurfaceCreateFlagsEXT = typedef(VkFlags, "VkHeadlessSurfaceCreateFlagsEXT")
val VkHostImageCopyFlagsEXT = typedef(VkFlags, "VkHostImageCopyFlagsEXT")
val VkMemoryUnmapFlagsKHR = typedef(VkFlags, "VkMemoryUnmapFlagsKHR")
val VkPresentScalingFlagsEXT = typedef(VkFlags, "VkPresentScalingFlagsEXT")
val VkPresentGravityFlagsEXT = typedef(VkFlags, "VkPresentGravityFlagsEXT")
val VkPresentScalingFlagsKHR = typedef(VkFlags, "VkPresentScalingFlagsKHR")
val VkPresentGravityFlagsKHR = typedef(VkFlags, "VkPresentGravityFlagsKHR")
val VkIndirectStateFlagsNV = typedef(VkFlags, "VkIndirectStateFlagsNV")
val VkIndirectCommandsLayoutUsageFlagsNV = typedef(VkFlags, "VkIndirectCommandsLayoutUsageFlagsNV")
val VkDeviceMemoryReportFlagsEXT = typedef(VkFlags, "VkDeviceMemoryReportFlagsEXT")
val VkPrivateDataSlotCreateFlagsEXT = typedef(VkFlags, "VkPrivateDataSlotCreateFlagsEXT")
val VkVideoEncodeFlagsKHR = typedef(VkFlags, "VkVideoEncodeFlagsKHR")
val VkVideoEncodeCapabilityFlagsKHR = typedef(VkFlags, "VkVideoEncodeCapabilityFlagsKHR")
val VkVideoEncodeRateControlModeFlagsKHR = typedef(VkFlags, "VkVideoEncodeRateControlModeFlagsKHR")
val VkVideoEncodeFeedbackFlagsKHR = typedef(VkFlags, "VkVideoEncodeFeedbackFlagsKHR")
val VkVideoEncodeUsageFlagsKHR = typedef(VkFlags, "VkVideoEncodeUsageFlagsKHR")
val VkVideoEncodeContentFlagsKHR = typedef(VkFlags, "VkVideoEncodeContentFlagsKHR")
val VkVideoEncodeRateControlFlagsKHR = typedef(VkFlags, "VkVideoEncodeRateControlFlagsKHR")
val VkDeviceDiagnosticsConfigFlagsNV = typedef(VkFlags, "VkDeviceDiagnosticsConfigFlagsNV")
val VkTileShadingRenderPassFlagsQCOM = typedef(VkFlags, "VkTileShadingRenderPassFlagsQCOM")
val VkExportMetalObjectTypeFlagsEXT = typedef(VkFlags, "VkExportMetalObjectTypeFlagsEXT")
val VkPipelineStageFlags2KHR = typedef(VkFlags64, "VkPipelineStageFlags2KHR")
val VkAccessFlags2KHR = typedef(VkFlags64, "VkAccessFlags2KHR")
val VkSubmitFlagsKHR = typedef(VkFlags, "VkSubmitFlagsKHR")
val VkGraphicsPipelineLibraryFlagsEXT = typedef(VkFlags, "VkGraphicsPipelineLibraryFlagsEXT")
val VkAccelerationStructureMotionInfoFlagsNV = typedef(VkFlags, "VkAccelerationStructureMotionInfoFlagsNV")
val VkAccelerationStructureMotionInstanceFlagsNV = typedef(VkFlags, "VkAccelerationStructureMotionInstanceFlagsNV")
val VkImageCompressionFlagsEXT = typedef(VkFlags, "VkImageCompressionFlagsEXT")
val VkImageCompressionFixedRateFlagsEXT = typedef(VkFlags, "VkImageCompressionFixedRateFlagsEXT")
val VkDirectFBSurfaceCreateFlagsEXT = typedef(VkFlags, "VkDirectFBSurfaceCreateFlagsEXT")
val VkDeviceAddressBindingFlagsEXT = typedef(VkFlags, "VkDeviceAddressBindingFlagsEXT")
val VkFormatFeatureFlags2KHR = typedef(VkFlags64, "VkFormatFeatureFlags2KHR")
val VkFrameBoundaryFlagsEXT = typedef(VkFlags, "VkFrameBoundaryFlagsEXT")
val VkVideoEncodeRgbModelConversionFlagsVALVE = typedef(VkFlags, "VkVideoEncodeRgbModelConversionFlagsVALVE")
val VkVideoEncodeRgbRangeCompressionFlagsVALVE = typedef(VkFlags, "VkVideoEncodeRgbRangeCompressionFlagsVALVE")
val VkVideoEncodeRgbChromaOffsetFlagsVALVE = typedef(VkFlags, "VkVideoEncodeRgbChromaOffsetFlagsVALVE")
val VkBuildMicromapFlagsEXT = typedef(VkFlags, "VkBuildMicromapFlagsEXT")
val VkMicromapCreateFlagsEXT = typedef(VkFlags, "VkMicromapCreateFlagsEXT")
val VkPhysicalDeviceSchedulingControlsFlagsARM = typedef(VkFlags64, "VkPhysicalDeviceSchedulingControlsFlagsARM")
val VkMemoryDecompressionMethodFlagsNV = typedef(VkFlags64, "VkMemoryDecompressionMethodFlagsNV")
val VkMemoryDecompressionMethodFlagsEXT = typedef(VkFlags64, "VkMemoryDecompressionMethodFlagsEXT")
val VkDirectDriverLoadingFlagsLUNARG = typedef(VkFlags, "VkDirectDriverLoadingFlagsLUNARG")
val VkTensorCreateFlagsARM = typedef(VkFlags64, "VkTensorCreateFlagsARM")
val VkTensorUsageFlagsARM = typedef(VkFlags64, "VkTensorUsageFlagsARM")
val VkOpticalFlowGridSizeFlagsNV = typedef(VkFlags, "VkOpticalFlowGridSizeFlagsNV")
val VkOpticalFlowUsageFlagsNV = typedef(VkFlags, "VkOpticalFlowUsageFlagsNV")
val VkOpticalFlowSessionCreateFlagsNV = typedef(VkFlags, "VkOpticalFlowSessionCreateFlagsNV")
val VkOpticalFlowExecuteFlagsNV = typedef(VkFlags, "VkOpticalFlowExecuteFlagsNV")
val VkPipelineCreateFlags2KHR = typedef(VkFlags64, "VkPipelineCreateFlags2KHR")
val VkBufferUsageFlags2KHR = typedef(VkFlags64, "VkBufferUsageFlags2KHR")
val VkShaderCreateFlagsEXT = typedef(VkFlags, "VkShaderCreateFlagsEXT")
val VkDataGraphPipelineSessionCreateFlagsARM = typedef(VkFlags64, "VkDataGraphPipelineSessionCreateFlagsARM")
val VkDataGraphPipelineDispatchFlagsARM = typedef(VkFlags64, "VkDataGraphPipelineDispatchFlagsARM")
val VkVideoEncodeAV1CapabilityFlagsKHR = typedef(VkFlags, "VkVideoEncodeAV1CapabilityFlagsKHR")
val VkVideoEncodeAV1StdFlagsKHR = typedef(VkFlags, "VkVideoEncodeAV1StdFlagsKHR")
val VkVideoEncodeAV1SuperblockSizeFlagsKHR = typedef(VkFlags, "VkVideoEncodeAV1SuperblockSizeFlagsKHR")
val VkVideoEncodeAV1RateControlFlagsKHR = typedef(VkFlags, "VkVideoEncodeAV1RateControlFlagsKHR")
val VkAddressCopyFlagsKHR = typedef(VkFlags, "VkAddressCopyFlagsKHR")
val VkVideoEncodeIntraRefreshModeFlagsKHR = typedef(VkFlags, "VkVideoEncodeIntraRefreshModeFlagsKHR")
val VkClusterAccelerationStructureAddressResolutionFlagsNV = typedef(VkFlags, "VkClusterAccelerationStructureAddressResolutionFlagsNV")
val VkClusterAccelerationStructureClusterFlagsNV = typedef(VkFlags, "VkClusterAccelerationStructureClusterFlagsNV")
val VkClusterAccelerationStructureGeometryFlagsNV = typedef(VkFlags, "VkClusterAccelerationStructureGeometryFlagsNV")
val VkClusterAccelerationStructureIndexFormatFlagsNV = typedef(VkFlags, "VkClusterAccelerationStructureIndexFormatFlagsNV")
val VkPartitionedAccelerationStructureInstanceFlagsNV = typedef(VkFlags, "VkPartitionedAccelerationStructureInstanceFlagsNV")
val VkIndirectCommandsInputModeFlagsEXT = typedef(VkFlags, "VkIndirectCommandsInputModeFlagsEXT")
val VkIndirectCommandsLayoutUsageFlagsEXT = typedef(VkFlags, "VkIndirectCommandsLayoutUsageFlagsEXT")
val VkAccessFlags3KHR = typedef(VkFlags64, "VkAccessFlags3KHR")
val VkPerformanceCounterDescriptionFlagsARM = typedef(VkFlags, "VkPerformanceCounterDescriptionFlagsARM")
val VkRenderingAttachmentFlagsKHR = typedef(VkFlags, "VkRenderingAttachmentFlagsKHR")
val VkResolveImageFlagsKHR = typedef(VkFlags, "VkResolveImageFlagsKHR")
val VkUbmSurfaceCreateFlagsSEC = typedef(VkFlags, "VkUbmSurfaceCreateFlagsSEC")

// Function pointer types
val PFN_vkDebugReportCallbackEXT = Module.VULKAN.callback {
    VkBool32(
        "VkDebugReportCallbackEXT",

        VkDebugReportFlagsEXT("flags"),
        VkDebugReportObjectTypeEXT("objectType"),
        uint64_t("object"),
        size_t("location"),
        int32_t("messageCode"),
        charUTF8.const.p("pLayerPrefix"),
        charUTF8.const.p("pMessage"),
        opaque_p("pUserData"),

        nativeType = "PFN_vkDebugReportCallbackEXT"
    ) {}
}

val _VkDebugUtilsMessengerCallbackDataEXT = struct(Module.VULKAN, "VkDebugUtilsMessengerCallbackDataEXT")
val PFN_vkDebugUtilsMessengerCallbackEXT = Module.VULKAN.callback {
    VkBool32(
        "VkDebugUtilsMessengerCallbackEXT",

        VkDebugUtilsMessageSeverityFlagBitsEXT("messageSeverity"),
        VkDebugUtilsMessageTypeFlagsEXT("messageTypes"),
        _VkDebugUtilsMessengerCallbackDataEXT.const.p("pCallbackData"),
        opaque_p("pUserData"),

        nativeType = "PFN_vkDebugUtilsMessengerCallbackEXT"
    ) {}
}

val _VkDeviceMemoryReportCallbackDataEXT = struct(Module.VULKAN, "VkDeviceMemoryReportCallbackDataEXT")
val PFN_vkDeviceMemoryReportCallbackEXT = Module.VULKAN.callback {
    void(
        "VkDeviceMemoryReportCallbackEXT",

        _VkDeviceMemoryReportCallbackDataEXT.const.p("pCallbackData"),
        opaque_p("pUserData"),

        nativeType = "PFN_vkDeviceMemoryReportCallbackEXT"
    ) {}
}

// Struct types
val VkSurfaceCapabilitiesKHR = struct(Module.VULKAN, "VkSurfaceCapabilitiesKHR", mutable = false) {
    uint32_t("minImageCount")
    uint32_t("maxImageCount")
    VkExtent2D("currentExtent")
    VkExtent2D("minImageExtent")
    VkExtent2D("maxImageExtent")
    uint32_t("maxImageArrayLayers")
    VkSurfaceTransformFlagsKHR("supportedTransforms")
    VkSurfaceTransformFlagBitsKHR("currentTransform")
    VkCompositeAlphaFlagsKHR("supportedCompositeAlpha")
    VkImageUsageFlags("supportedUsageFlags")
}

val VkSurfaceFormatKHR = struct(Module.VULKAN, "VkSurfaceFormatKHR", mutable = false) {
    VkFormat("format")
    VkColorSpaceKHR("colorSpace")
}

val VkSwapchainCreateInfoKHR = struct(Module.VULKAN, "VkSwapchainCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkDeviceGroupSwapchainCreateInfoKHR", "VkImageCompressionControlEXT", "VkImageFormatListCreateInfo", "VkImageFormatListCreateInfoKHR", "VkSurfaceFullScreenExclusiveInfoEXT", "VkSurfaceFullScreenExclusiveWin32InfoEXT", "VkSwapchainCounterCreateInfoEXT", "VkSwapchainDisplayNativeHdrCreateInfoAMD", "VkSwapchainLatencyCreateInfoNV", "VkSwapchainPresentBarrierCreateInfoNV", "VkSwapchainPresentModesCreateInfoEXT", "VkSwapchainPresentModesCreateInfoKHR", "VkSwapchainPresentScalingCreateInfoEXT", "VkSwapchainPresentScalingCreateInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkSwapchainCreateFlagsKHR("flags")
    VkSurfaceKHR("surface")
    uint32_t("minImageCount")
    VkFormat("imageFormat")
    VkColorSpaceKHR("imageColorSpace")
    VkExtent2D("imageExtent")
    uint32_t("imageArrayLayers")
    VkImageUsageFlags("imageUsage")
    VkSharingMode("imageSharingMode")
    AutoSize("pQueueFamilyIndices", optional = true)..uint32_t("queueFamilyIndexCount")
    nullable..uint32_t.const.p("pQueueFamilyIndices")
    VkSurfaceTransformFlagBitsKHR("preTransform")
    VkCompositeAlphaFlagBitsKHR("compositeAlpha")
    VkPresentModeKHR("presentMode")
    VkBool32("clipped")
    VkSwapchainKHR("oldSwapchain")
}

val VkPresentInfoKHR = struct(Module.VULKAN, "VkPresentInfoKHR") {
    Expression("#STRUCTURE_TYPE_PRESENT_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkDeviceGroupPresentInfoKHR", "VkDisplayPresentInfoKHR", "VkFrameBoundaryEXT", "VkFrameBoundaryTensorsARM", "VkPresentId2KHR", "VkPresentIdKHR", "VkPresentRegionsKHR", "VkPresentTimesInfoGOOGLE", "VkPresentTimingsInfoEXT", "VkSetPresentConfigNV", "VkSwapchainPresentFenceInfoEXT", "VkSwapchainPresentFenceInfoKHR", "VkSwapchainPresentModeInfoEXT", "VkSwapchainPresentModeInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    AutoSize("pWaitSemaphores", optional = true)..uint32_t("waitSemaphoreCount")
    VkSemaphore.const.p("pWaitSemaphores")
    AutoSize("pSwapchains", "pImageIndices", "pResults")..uint32_t("swapchainCount")
    VkSwapchainKHR.const.p("pSwapchains")
    uint32_t.const.p("pImageIndices")
    nullable..VkResult.p("pResults")
}

val VkImageSwapchainCreateInfoKHR = struct(Module.VULKAN, "VkImageSwapchainCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSwapchainKHR("swapchain")
}

val VkBindImageMemorySwapchainInfoKHR = struct(Module.VULKAN, "VkBindImageMemorySwapchainInfoKHR") {
    Expression("#STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSwapchainKHR("swapchain")
    uint32_t("imageIndex")
}

val VkAcquireNextImageInfoKHR = struct(Module.VULKAN, "VkAcquireNextImageInfoKHR") {
    Expression("#STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSwapchainKHR("swapchain")
    uint64_t("timeout")
    VkSemaphore("semaphore")
    VkFence("fence")
    uint32_t("deviceMask")
}

val VkDeviceGroupPresentCapabilitiesKHR = struct(Module.VULKAN, "VkDeviceGroupPresentCapabilitiesKHR", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK11.*")
    Expression("#STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("presentMask")["VK_MAX_DEVICE_GROUP_SIZE"]
    VkDeviceGroupPresentModeFlagsKHR("modes")
}

val VkDeviceGroupPresentInfoKHR = struct(Module.VULKAN, "VkDeviceGroupPresentInfoKHR") {
    Expression("#STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pDeviceMasks", optional = true)..uint32_t("swapchainCount")
    uint32_t.const.p("pDeviceMasks")
    VkDeviceGroupPresentModeFlagBitsKHR("mode")
}

val VkDeviceGroupSwapchainCreateInfoKHR = struct(Module.VULKAN, "VkDeviceGroupSwapchainCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceGroupPresentModeFlagsKHR("modes")
}

val VkDisplayModeParametersKHR = struct(Module.VULKAN, "VkDisplayModeParametersKHR") {
    VkExtent2D("visibleRegion")
    uint32_t("refreshRate")
}

val VkDisplayModeCreateInfoKHR = struct(Module.VULKAN, "VkDisplayModeCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDisplayModeCreateFlagsKHR("flags")
    VkDisplayModeParametersKHR("parameters")
}

val VkDisplayModePropertiesKHR = struct(Module.VULKAN, "VkDisplayModePropertiesKHR", mutable = false) {
    VkDisplayModeKHR("displayMode")
    VkDisplayModeParametersKHR("parameters")
}

val VkDisplayPlaneCapabilitiesKHR = struct(Module.VULKAN, "VkDisplayPlaneCapabilitiesKHR", mutable = false) {
    VkDisplayPlaneAlphaFlagsKHR("supportedAlpha")
    VkOffset2D("minSrcPosition")
    VkOffset2D("maxSrcPosition")
    VkExtent2D("minSrcExtent")
    VkExtent2D("maxSrcExtent")
    VkOffset2D("minDstPosition")
    VkOffset2D("maxDstPosition")
    VkExtent2D("minDstExtent")
    VkExtent2D("maxDstExtent")
}

val VkDisplayPlanePropertiesKHR = struct(Module.VULKAN, "VkDisplayPlanePropertiesKHR", mutable = false) {
    VkDisplayKHR("currentDisplay")
    uint32_t("currentStackIndex")
}

val VkDisplayPropertiesKHR = struct(Module.VULKAN, "VkDisplayPropertiesKHR", mutable = false) {
    VkDisplayKHR("display")
    charUTF8.const.p("displayName")
    VkExtent2D("physicalDimensions")
    VkExtent2D("physicalResolution")
    VkSurfaceTransformFlagsKHR("supportedTransforms")
    VkBool32("planeReorderPossible")
    VkBool32("persistentContent")
}

val VkDisplaySurfaceCreateInfoKHR = struct(Module.VULKAN, "VkDisplaySurfaceCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkDisplaySurfaceStereoCreateInfoNV",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDisplaySurfaceCreateFlagsKHR("flags")
    VkDisplayModeKHR("displayMode")
    uint32_t("planeIndex")
    uint32_t("planeStackIndex")
    VkSurfaceTransformFlagBitsKHR("transform")
    float("globalAlpha")
    VkDisplayPlaneAlphaFlagBitsKHR("alphaMode")
    VkExtent2D("imageExtent")
}

val VkDisplayPresentInfoKHR = struct(Module.VULKAN, "VkDisplayPresentInfoKHR") {
    Expression("#STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkRect2D("srcRect")
    VkRect2D("dstRect")
    VkBool32("persistent")
}

val VkXlibSurfaceCreateInfoKHR = struct(Module.VULKAN, "VkXlibSurfaceCreateInfoKHR") {
    javaImport("org.lwjgl.system.linux.*")
    Expression("#STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkXlibSurfaceCreateFlagsKHR("flags")
    nullable..Display.p("dpy")
    Window("window")
}

val VkXcbSurfaceCreateInfoKHR = struct(Module.VULKAN, "VkXcbSurfaceCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkXcbSurfaceCreateFlagsKHR("flags")
    nullable..xcb_connection_t.p("connection")
    xcb_window_t("window")
}

val VkWaylandSurfaceCreateInfoKHR = struct(Module.VULKAN, "VkWaylandSurfaceCreateInfoKHR") {
    javaImport("org.lwjgl.system.linux.*")
    Expression("#STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkWaylandSurfaceCreateFlagsKHR("flags")
    nullable..wl_display.p("display")
    nullable..wl_surface.p("surface")
}

val VkAndroidSurfaceCreateInfoKHR = struct(Module.VULKAN, "VkAndroidSurfaceCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAndroidSurfaceCreateFlagsKHR("flags")
    nullable..ANativeWindow.p("window")
}

val VkWin32SurfaceCreateInfoKHR = struct(Module.VULKAN, "VkWin32SurfaceCreateInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    Expression("#STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkWin32SurfaceCreateFlagsKHR("flags")
    HINSTANCE("hinstance")
    HWND("hwnd")
}

val VkDebugReportCallbackCreateInfoEXT = struct(Module.VULKAN, "VkDebugReportCallbackCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDebugReportFlagsEXT("flags")
    PFN_vkDebugReportCallbackEXT("pfnCallback")
    nullable..opaque_p("pUserData")
}

val VkPipelineRasterizationStateRasterizationOrderAMD = struct(Module.VULKAN, "VkPipelineRasterizationStateRasterizationOrderAMD") {
    Expression("#STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkRasterizationOrderAMD("rasterizationOrder")
}

val VkDebugMarkerObjectNameInfoEXT = struct(Module.VULKAN, "VkDebugMarkerObjectNameInfoEXT") {
    Expression("#STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDebugReportObjectTypeEXT("objectType")
    uint64_t("object")
    charUTF8.const.p("pObjectName")
}

val VkDebugMarkerObjectTagInfoEXT = struct(Module.VULKAN, "VkDebugMarkerObjectTagInfoEXT") {
    Expression("#STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDebugReportObjectTypeEXT("objectType")
    uint64_t("object")
    uint64_t("tagName")
    AutoSize("pTag")..size_t("tagSize")
    void.const.p("pTag")
}

val VkDebugMarkerMarkerInfoEXT = struct(Module.VULKAN, "VkDebugMarkerMarkerInfoEXT") {
    Expression("#STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    charUTF8.const.p("pMarkerName")
    float("color")[4]
}

val VkQueueFamilyQueryResultStatusPropertiesKHR = struct(Module.VULKAN, "VkQueueFamilyQueryResultStatusPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("queryResultStatusSupport")
}

val VkQueueFamilyVideoPropertiesKHR = struct(Module.VULKAN, "VkQueueFamilyVideoPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkVideoCodecOperationFlagsKHR("videoCodecOperations")
}

val VkVideoProfileInfoKHR = struct(Module.VULKAN, "VkVideoProfileInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkVideoDecodeAV1ProfileInfoKHR", "VkVideoDecodeH264ProfileInfoKHR", "VkVideoDecodeH265ProfileInfoKHR", "VkVideoDecodeUsageInfoKHR", "VkVideoDecodeVP9ProfileInfoKHR", "VkVideoEncodeAV1ProfileInfoKHR", "VkVideoEncodeH264ProfileInfoKHR", "VkVideoEncodeH265ProfileInfoKHR", "VkVideoEncodeProfileRgbConversionInfoVALVE", "VkVideoEncodeUsageInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkVideoCodecOperationFlagBitsKHR("videoCodecOperation")
    VkVideoChromaSubsamplingFlagsKHR("chromaSubsampling")
    VkVideoComponentBitDepthFlagsKHR("lumaBitDepth")
    VkVideoComponentBitDepthFlagsKHR("chromaBitDepth")
}

val VkVideoProfileListInfoKHR = struct(Module.VULKAN, "VkVideoProfileListInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pProfiles", optional = true)..uint32_t("profileCount")
    VkVideoProfileInfoKHR.const.p("pProfiles")
}

val VkVideoCapabilitiesKHR = struct(Module.VULKAN, "VkVideoCapabilitiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkVideoDecodeAV1CapabilitiesKHR", "VkVideoDecodeCapabilitiesKHR", "VkVideoDecodeH264CapabilitiesKHR", "VkVideoDecodeH265CapabilitiesKHR", "VkVideoDecodeVP9CapabilitiesKHR", "VkVideoEncodeAV1CapabilitiesKHR", "VkVideoEncodeAV1QuantizationMapCapabilitiesKHR", "VkVideoEncodeCapabilitiesKHR", "VkVideoEncodeH264CapabilitiesKHR", "VkVideoEncodeH264QuantizationMapCapabilitiesKHR", "VkVideoEncodeH265CapabilitiesKHR", "VkVideoEncodeH265QuantizationMapCapabilitiesKHR", "VkVideoEncodeIntraRefreshCapabilitiesKHR", "VkVideoEncodeQuantizationMapCapabilitiesKHR", "VkVideoEncodeRgbConversionCapabilitiesVALVE",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkVideoCapabilityFlagsKHR("flags")
    VkDeviceSize("minBitstreamBufferOffsetAlignment")
    VkDeviceSize("minBitstreamBufferSizeAlignment")
    VkExtent2D("pictureAccessGranularity")
    VkExtent2D("minCodedExtent")
    VkExtent2D("maxCodedExtent")
    uint32_t("maxDpbSlots")
    uint32_t("maxActiveReferencePictures")
    VkExtensionProperties("stdHeaderVersion")
}

val VkPhysicalDeviceVideoFormatInfoKHR = struct(Module.VULKAN, "VkPhysicalDeviceVideoFormatInfoKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkVideoProfileListInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkImageUsageFlags("imageUsage")
}

val VkVideoFormatPropertiesKHR = struct(Module.VULKAN, "VkVideoFormatPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkVideoFormatAV1QuantizationMapPropertiesKHR", "VkVideoFormatH265QuantizationMapPropertiesKHR", "VkVideoFormatQuantizationMapPropertiesKHR",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkFormat("format")
    VkComponentMapping("componentMapping")
    VkImageCreateFlags("imageCreateFlags")
    VkImageType("imageType")
    VkImageTiling("imageTiling")
    VkImageUsageFlags("imageUsageFlags")
}

val VkVideoPictureResourceInfoKHR = struct(Module.VULKAN, "VkVideoPictureResourceInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkOffset2D("codedOffset")
    VkExtent2D("codedExtent")
    uint32_t("baseArrayLayer")
    VkImageView("imageViewBinding")
}

val VkVideoReferenceSlotInfoKHR = struct(Module.VULKAN, "VkVideoReferenceSlotInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkVideoDecodeAV1DpbSlotInfoKHR", "VkVideoDecodeH264DpbSlotInfoKHR", "VkVideoDecodeH265DpbSlotInfoKHR", "VkVideoEncodeAV1DpbSlotInfoKHR", "VkVideoEncodeH264DpbSlotInfoKHR", "VkVideoEncodeH265DpbSlotInfoKHR", "VkVideoReferenceIntraRefreshInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    int32_t("slotIndex")
    nullable..VkVideoPictureResourceInfoKHR.const.p("pPictureResource")
}

val VkVideoSessionMemoryRequirementsKHR = struct(Module.VULKAN, "VkVideoSessionMemoryRequirementsKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("memoryBindIndex")
    VkMemoryRequirements("memoryRequirements")
}

val VkBindVideoSessionMemoryInfoKHR = struct(Module.VULKAN, "VkBindVideoSessionMemoryInfoKHR") {
    Expression("#STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("memoryBindIndex")
    VkDeviceMemory("memory")
    VkDeviceSize("memoryOffset")
    VkDeviceSize("memorySize")
}

val VkVideoSessionCreateInfoKHR = struct(Module.VULKAN, "VkVideoSessionCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkVideoEncodeAV1SessionCreateInfoKHR", "VkVideoEncodeH264SessionCreateInfoKHR", "VkVideoEncodeH265SessionCreateInfoKHR", "VkVideoEncodeSessionIntraRefreshCreateInfoKHR", "VkVideoEncodeSessionRgbConversionCreateInfoVALVE",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    uint32_t("queueFamilyIndex")
    VkVideoSessionCreateFlagsKHR("flags")
    VkVideoProfileInfoKHR.const.p("pVideoProfile")
    VkFormat("pictureFormat")
    VkExtent2D("maxCodedExtent")
    VkFormat("referencePictureFormat")
    uint32_t("maxDpbSlots")
    uint32_t("maxActiveReferencePictures")
    VkExtensionProperties.const.p("pStdHeaderVersion")
}

val VkVideoSessionParametersCreateInfoKHR = struct(Module.VULKAN, "VkVideoSessionParametersCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkVideoDecodeAV1SessionParametersCreateInfoKHR", "VkVideoDecodeH264SessionParametersCreateInfoKHR", "VkVideoDecodeH265SessionParametersCreateInfoKHR", "VkVideoEncodeAV1SessionParametersCreateInfoKHR", "VkVideoEncodeH264SessionParametersCreateInfoKHR", "VkVideoEncodeH265SessionParametersCreateInfoKHR", "VkVideoEncodeQualityLevelInfoKHR", "VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkVideoSessionParametersCreateFlagsKHR("flags")
    VkVideoSessionParametersKHR("videoSessionParametersTemplate")
    VkVideoSessionKHR("videoSession")
}

val VkVideoSessionParametersUpdateInfoKHR = struct(Module.VULKAN, "VkVideoSessionParametersUpdateInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkVideoDecodeH264SessionParametersAddInfoKHR", "VkVideoDecodeH265SessionParametersAddInfoKHR", "VkVideoEncodeH264SessionParametersAddInfoKHR", "VkVideoEncodeH265SessionParametersAddInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    uint32_t("updateSequenceCount")
}

val VkVideoBeginCodingInfoKHR = struct(Module.VULKAN, "VkVideoBeginCodingInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkVideoEncodeAV1GopRemainingFrameInfoKHR", "VkVideoEncodeAV1RateControlInfoKHR", "VkVideoEncodeH264GopRemainingFrameInfoKHR", "VkVideoEncodeH264RateControlInfoKHR", "VkVideoEncodeH265GopRemainingFrameInfoKHR", "VkVideoEncodeH265RateControlInfoKHR", "VkVideoEncodeRateControlInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkVideoBeginCodingFlagsKHR("flags")
    VkVideoSessionKHR("videoSession")
    VkVideoSessionParametersKHR("videoSessionParameters")
    AutoSize("pReferenceSlots", optional = true)..uint32_t("referenceSlotCount")
    VkVideoReferenceSlotInfoKHR.const.p("pReferenceSlots")
}

val VkVideoEndCodingInfoKHR = struct(Module.VULKAN, "VkVideoEndCodingInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_END_CODING_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkVideoEndCodingFlagsKHR("flags")
}

val VkVideoCodingControlInfoKHR = struct(Module.VULKAN, "VkVideoCodingControlInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkVideoEncodeAV1RateControlInfoKHR", "VkVideoEncodeH264RateControlInfoKHR", "VkVideoEncodeH265RateControlInfoKHR", "VkVideoEncodeQualityLevelInfoKHR", "VkVideoEncodeRateControlInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkVideoCodingControlFlagsKHR("flags")
}

val VkVideoDecodeCapabilitiesKHR = struct(Module.VULKAN, "VkVideoDecodeCapabilitiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkVideoDecodeCapabilityFlagsKHR("flags")
}

val VkVideoDecodeUsageInfoKHR = struct(Module.VULKAN, "VkVideoDecodeUsageInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkVideoDecodeUsageFlagsKHR("videoUsageHints")
}

val VkVideoDecodeInfoKHR = struct(Module.VULKAN, "VkVideoDecodeInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkVideoDecodeAV1InlineSessionParametersInfoKHR", "VkVideoDecodeAV1PictureInfoKHR", "VkVideoDecodeH264InlineSessionParametersInfoKHR", "VkVideoDecodeH264PictureInfoKHR", "VkVideoDecodeH265InlineSessionParametersInfoKHR", "VkVideoDecodeH265PictureInfoKHR", "VkVideoDecodeVP9PictureInfoKHR", "VkVideoInlineQueryInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkVideoDecodeFlagsKHR("flags")
    VkBuffer("srcBuffer")
    VkDeviceSize("srcBufferOffset")
    VkDeviceSize("srcBufferRange")
    VkVideoPictureResourceInfoKHR("dstPictureResource")
    nullable..VkVideoReferenceSlotInfoKHR.const.p("pSetupReferenceSlot")
    AutoSize("pReferenceSlots", optional = true)..uint32_t("referenceSlotCount")
    VkVideoReferenceSlotInfoKHR.const.p("pReferenceSlots")
}

val VkDedicatedAllocationImageCreateInfoNV = struct(Module.VULKAN, "VkDedicatedAllocationImageCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("dedicatedAllocation")
}

val VkDedicatedAllocationBufferCreateInfoNV = struct(Module.VULKAN, "VkDedicatedAllocationBufferCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("dedicatedAllocation")
}

val VkDedicatedAllocationMemoryAllocateInfoNV = struct(Module.VULKAN, "VkDedicatedAllocationMemoryAllocateInfoNV") {
    Expression("#STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("image")
    VkBuffer("buffer")
}

val VkPhysicalDeviceTransformFeedbackFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceTransformFeedbackFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("transformFeedback")
    VkBool32("geometryStreams")
}

val VkPhysicalDeviceTransformFeedbackPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceTransformFeedbackPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxTransformFeedbackStreams")
    uint32_t("maxTransformFeedbackBuffers")
    VkDeviceSize("maxTransformFeedbackBufferSize")
    uint32_t("maxTransformFeedbackStreamDataSize")
    uint32_t("maxTransformFeedbackBufferDataSize")
    uint32_t("maxTransformFeedbackBufferDataStride")
    VkBool32("transformFeedbackQueries")
    VkBool32("transformFeedbackStreamsLinesTriangles")
    VkBool32("transformFeedbackRasterizationStreamSelect")
    VkBool32("transformFeedbackDraw")
}

val VkPipelineRasterizationStateStreamCreateInfoEXT = struct(Module.VULKAN, "VkPipelineRasterizationStateStreamCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineRasterizationStateStreamCreateFlagsEXT("flags")
    uint32_t("rasterizationStream")
}

val VkCuModuleCreateInfoNVX = struct(Module.VULKAN, "VkCuModuleCreateInfoNVX") {
    Expression("#STRUCTURE_TYPE_CU_MODULE_CREATE_INFO_NVX")..VkStructureType("sType")
    PointerSetter(
        "VkCuModuleTexturingModeCreateInfoNVX",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    AutoSize("pData", optional = true)..size_t("dataSize")
    void.const.p("pData")
}

val VkCuModuleTexturingModeCreateInfoNVX = struct(Module.VULKAN, "VkCuModuleTexturingModeCreateInfoNVX") {
    Expression("#STRUCTURE_TYPE_CU_MODULE_TEXTURING_MODE_CREATE_INFO_NVX")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("use64bitTexturing")
}

val VkCuFunctionCreateInfoNVX = struct(Module.VULKAN, "VkCuFunctionCreateInfoNVX") {
    Expression("#STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkCuModuleNVX("module")
    charUTF8.const.p("pName")
}

val VkCuLaunchInfoNVX = struct(Module.VULKAN, "VkCuLaunchInfoNVX") {
    Expression("#STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkCuFunctionNVX("function")
    uint32_t("gridDimX")
    uint32_t("gridDimY")
    uint32_t("gridDimZ")
    uint32_t("blockDimX")
    uint32_t("blockDimY")
    uint32_t("blockDimZ")
    uint32_t("sharedMemBytes")
    AutoSize("pParams", optional = true)..size_t("paramCount")
    void.const.p.const.p("pParams")
    AutoSize("pExtras", optional = true)..size_t("extraCount")
    void.const.p.const.p("pExtras")
}

val VkImageViewHandleInfoNVX = struct(Module.VULKAN, "VkImageViewHandleInfoNVX") {
    Expression("#STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageView("imageView")
    VkDescriptorType("descriptorType")
    VkSampler("sampler")
}

val VkImageViewAddressPropertiesNVX = struct(Module.VULKAN, "VkImageViewAddressPropertiesNVX", mutable = false) {
    Expression("#STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceAddress("deviceAddress")
    VkDeviceSize("size")
}

val VkVideoEncodeH264CapabilitiesKHR = struct(Module.VULKAN, "VkVideoEncodeH264CapabilitiesKHR", mutable = false) {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkVideoEncodeH264CapabilityFlagsKHR("flags")
    StdVideoH264LevelIdc("maxLevelIdc")
    uint32_t("maxSliceCount")
    uint32_t("maxPPictureL0ReferenceCount")
    uint32_t("maxBPictureL0ReferenceCount")
    uint32_t("maxL1ReferenceCount")
    uint32_t("maxTemporalLayerCount")
    VkBool32("expectDyadicTemporalLayerPattern")
    int32_t("minQp")
    int32_t("maxQp")
    VkBool32("prefersGopRemainingFrames")
    VkBool32("requiresGopRemainingFrames")
    VkVideoEncodeH264StdFlagsKHR("stdSyntaxFlags")
}

val VkVideoEncodeH264QpKHR = struct(Module.VULKAN, "VkVideoEncodeH264QpKHR") {
    int32_t("qpI")
    int32_t("qpP")
    int32_t("qpB")
}

val VkVideoEncodeH264QualityLevelPropertiesKHR = struct(Module.VULKAN, "VkVideoEncodeH264QualityLevelPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUALITY_LEVEL_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkVideoEncodeH264RateControlFlagsKHR("preferredRateControlFlags")
    uint32_t("preferredGopFrameCount")
    uint32_t("preferredIdrPeriod")
    uint32_t("preferredConsecutiveBFrameCount")
    uint32_t("preferredTemporalLayerCount")
    VkVideoEncodeH264QpKHR("preferredConstantQp")
    uint32_t("preferredMaxL0ReferenceCount")
    uint32_t("preferredMaxL1ReferenceCount")
    VkBool32("preferredStdEntropyCodingModeFlag")
}

val VkVideoEncodeH264SessionCreateInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH264SessionCreateInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("useMaxLevelIdc")
    StdVideoH264LevelIdc("maxLevelIdc")
}

val VkVideoEncodeH264SessionParametersAddInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH264SessionParametersAddInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pStdSPSs", optional = true)..uint32_t("stdSPSCount")
    nullable..StdVideoH264SequenceParameterSet.const.p("pStdSPSs")
    AutoSize("pStdPPSs", optional = true)..uint32_t("stdPPSCount")
    nullable..StdVideoH264PictureParameterSet.const.p("pStdPPSs")
}

val VkVideoEncodeH264SessionParametersCreateInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH264SessionParametersCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("maxStdSPSCount")
    uint32_t("maxStdPPSCount")
    nullable..VkVideoEncodeH264SessionParametersAddInfoKHR.const.p("pParametersAddInfo")
}

val VkVideoEncodeH264SessionParametersGetInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH264SessionParametersGetInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("writeStdSPS")
    VkBool32("writeStdPPS")
    uint32_t("stdSPSId")
    uint32_t("stdPPSId")
}

val VkVideoEncodeH264SessionParametersFeedbackInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH264SessionParametersFeedbackInfoKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("hasStdSPSOverrides")
    VkBool32("hasStdPPSOverrides")
}

val VkVideoEncodeH264NaluSliceInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH264NaluSliceInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    int32_t("constantQp")
    StdVideoEncodeH264SliceHeader.const.p("pStdSliceHeader")
}

val VkVideoEncodeH264PictureInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH264PictureInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pNaluSliceEntries")..uint32_t("naluSliceEntryCount")
    VkVideoEncodeH264NaluSliceInfoKHR.const.p("pNaluSliceEntries")
    StdVideoEncodeH264PictureInfo.const.p("pStdPictureInfo")
    VkBool32("generatePrefixNalu")
}

val VkVideoEncodeH264DpbSlotInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH264DpbSlotInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoEncodeH264ReferenceInfo.const.p("pStdReferenceInfo")
}

val VkVideoEncodeH264ProfileInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH264ProfileInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H264_PROFILE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoH264ProfileIdc("stdProfileIdc")
}

val VkVideoEncodeH264RateControlInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH264RateControlInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkVideoEncodeH264RateControlFlagsKHR("flags")
    uint32_t("gopFrameCount")
    uint32_t("idrPeriod")
    uint32_t("consecutiveBFrameCount")
    uint32_t("temporalLayerCount")
}

val VkVideoEncodeH264FrameSizeKHR = struct(Module.VULKAN, "VkVideoEncodeH264FrameSizeKHR") {
    uint32_t("frameISize")
    uint32_t("framePSize")
    uint32_t("frameBSize")
}

val VkVideoEncodeH264RateControlLayerInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH264RateControlLayerInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("useMinQp")
    VkVideoEncodeH264QpKHR("minQp")
    VkBool32("useMaxQp")
    VkVideoEncodeH264QpKHR("maxQp")
    VkBool32("useMaxFrameSize")
    VkVideoEncodeH264FrameSizeKHR("maxFrameSize")
}

val VkVideoEncodeH264GopRemainingFrameInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH264GopRemainingFrameInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H264_GOP_REMAINING_FRAME_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("useGopRemainingFrames")
    uint32_t("gopRemainingI")
    uint32_t("gopRemainingP")
    uint32_t("gopRemainingB")
}

val VkVideoEncodeH265CapabilitiesKHR = struct(Module.VULKAN, "VkVideoEncodeH265CapabilitiesKHR", mutable = false) {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkVideoEncodeH265CapabilityFlagsKHR("flags")
    StdVideoH265LevelIdc("maxLevelIdc")
    uint32_t("maxSliceSegmentCount")
    VkExtent2D("maxTiles")
    VkVideoEncodeH265CtbSizeFlagsKHR("ctbSizes")
    VkVideoEncodeH265TransformBlockSizeFlagsKHR("transformBlockSizes")
    uint32_t("maxPPictureL0ReferenceCount")
    uint32_t("maxBPictureL0ReferenceCount")
    uint32_t("maxL1ReferenceCount")
    uint32_t("maxSubLayerCount")
    VkBool32("expectDyadicTemporalSubLayerPattern")
    int32_t("minQp")
    int32_t("maxQp")
    VkBool32("prefersGopRemainingFrames")
    VkBool32("requiresGopRemainingFrames")
    VkVideoEncodeH265StdFlagsKHR("stdSyntaxFlags")
}

val VkVideoEncodeH265SessionCreateInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH265SessionCreateInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("useMaxLevelIdc")
    StdVideoH265LevelIdc("maxLevelIdc")
}

val VkVideoEncodeH265QpKHR = struct(Module.VULKAN, "VkVideoEncodeH265QpKHR") {
    int32_t("qpI")
    int32_t("qpP")
    int32_t("qpB")
}

val VkVideoEncodeH265QualityLevelPropertiesKHR = struct(Module.VULKAN, "VkVideoEncodeH265QualityLevelPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkVideoEncodeH265RateControlFlagsKHR("preferredRateControlFlags")
    uint32_t("preferredGopFrameCount")
    uint32_t("preferredIdrPeriod")
    uint32_t("preferredConsecutiveBFrameCount")
    uint32_t("preferredSubLayerCount")
    VkVideoEncodeH265QpKHR("preferredConstantQp")
    uint32_t("preferredMaxL0ReferenceCount")
    uint32_t("preferredMaxL1ReferenceCount")
}

val VkVideoEncodeH265SessionParametersAddInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH265SessionParametersAddInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pStdVPSs", optional = true)..uint32_t("stdVPSCount")
    nullable..StdVideoH265VideoParameterSet.const.p("pStdVPSs")
    AutoSize("pStdSPSs", optional = true)..uint32_t("stdSPSCount")
    nullable..StdVideoH265SequenceParameterSet.const.p("pStdSPSs")
    AutoSize("pStdPPSs", optional = true)..uint32_t("stdPPSCount")
    nullable..StdVideoH265PictureParameterSet.const.p("pStdPPSs")
}

val VkVideoEncodeH265SessionParametersCreateInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH265SessionParametersCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("maxStdVPSCount")
    uint32_t("maxStdSPSCount")
    uint32_t("maxStdPPSCount")
    nullable..VkVideoEncodeH265SessionParametersAddInfoKHR.const.p("pParametersAddInfo")
}

val VkVideoEncodeH265SessionParametersGetInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH265SessionParametersGetInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("writeStdVPS")
    VkBool32("writeStdSPS")
    VkBool32("writeStdPPS")
    uint32_t("stdVPSId")
    uint32_t("stdSPSId")
    uint32_t("stdPPSId")
}

val VkVideoEncodeH265SessionParametersFeedbackInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH265SessionParametersFeedbackInfoKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("hasStdVPSOverrides")
    VkBool32("hasStdSPSOverrides")
    VkBool32("hasStdPPSOverrides")
}

val VkVideoEncodeH265NaluSliceSegmentInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH265NaluSliceSegmentInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    int32_t("constantQp")
    StdVideoEncodeH265SliceSegmentHeader.const.p("pStdSliceSegmentHeader")
}

val VkVideoEncodeH265PictureInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH265PictureInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pNaluSliceSegmentEntries")..uint32_t("naluSliceSegmentEntryCount")
    VkVideoEncodeH265NaluSliceSegmentInfoKHR.const.p("pNaluSliceSegmentEntries")
    StdVideoEncodeH265PictureInfo.const.p("pStdPictureInfo")
}

val VkVideoEncodeH265DpbSlotInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH265DpbSlotInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoEncodeH265ReferenceInfo.const.p("pStdReferenceInfo")
}

val VkVideoEncodeH265ProfileInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH265ProfileInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H265_PROFILE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoH265ProfileIdc("stdProfileIdc")
}

val VkVideoEncodeH265RateControlInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH265RateControlInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkVideoEncodeH265RateControlFlagsKHR("flags")
    uint32_t("gopFrameCount")
    uint32_t("idrPeriod")
    uint32_t("consecutiveBFrameCount")
    uint32_t("subLayerCount")
}

val VkVideoEncodeH265FrameSizeKHR = struct(Module.VULKAN, "VkVideoEncodeH265FrameSizeKHR") {
    uint32_t("frameISize")
    uint32_t("framePSize")
    uint32_t("frameBSize")
}

val VkVideoEncodeH265RateControlLayerInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH265RateControlLayerInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("useMinQp")
    VkVideoEncodeH265QpKHR("minQp")
    VkBool32("useMaxQp")
    VkVideoEncodeH265QpKHR("maxQp")
    VkBool32("useMaxFrameSize")
    VkVideoEncodeH265FrameSizeKHR("maxFrameSize")
}

val VkVideoEncodeH265GopRemainingFrameInfoKHR = struct(Module.VULKAN, "VkVideoEncodeH265GopRemainingFrameInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("useGopRemainingFrames")
    uint32_t("gopRemainingI")
    uint32_t("gopRemainingP")
    uint32_t("gopRemainingB")
}

val VkVideoDecodeH264ProfileInfoKHR = struct(Module.VULKAN, "VkVideoDecodeH264ProfileInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoH264ProfileIdc("stdProfileIdc")
    VkVideoDecodeH264PictureLayoutFlagBitsKHR("pictureLayout")
}

val VkVideoDecodeH264CapabilitiesKHR = struct(Module.VULKAN, "VkVideoDecodeH264CapabilitiesKHR", mutable = false) {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    StdVideoH264LevelIdc("maxLevelIdc")
    VkOffset2D("fieldOffsetGranularity")
}

val VkVideoDecodeH264SessionParametersAddInfoKHR = struct(Module.VULKAN, "VkVideoDecodeH264SessionParametersAddInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pStdSPSs", optional = true)..uint32_t("stdSPSCount")
    StdVideoH264SequenceParameterSet.const.p("pStdSPSs")
    AutoSize("pStdPPSs", optional = true)..uint32_t("stdPPSCount")
    StdVideoH264PictureParameterSet.const.p("pStdPPSs")
}

val VkVideoDecodeH264SessionParametersCreateInfoKHR = struct(Module.VULKAN, "VkVideoDecodeH264SessionParametersCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("maxStdSPSCount")
    uint32_t("maxStdPPSCount")
    nullable..VkVideoDecodeH264SessionParametersAddInfoKHR.const.p("pParametersAddInfo")
}

val VkVideoDecodeH264PictureInfoKHR = struct(Module.VULKAN, "VkVideoDecodeH264PictureInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoDecodeH264PictureInfo.const.p("pStdPictureInfo")
    AutoSize("pSliceOffsets")..uint32_t("sliceCount")
    uint32_t.const.p("pSliceOffsets")
}

val VkVideoDecodeH264DpbSlotInfoKHR = struct(Module.VULKAN, "VkVideoDecodeH264DpbSlotInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoDecodeH264ReferenceInfo.const.p("pStdReferenceInfo")
}

val VkTextureLODGatherFormatPropertiesAMD = struct(Module.VULKAN, "VkTextureLODGatherFormatPropertiesAMD", mutable = false) {
    Expression("#STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("supportsTextureGatherLODBiasAMD")
}

val VkShaderResourceUsageAMD = struct(Module.VULKAN, "VkShaderResourceUsageAMD", mutable = false) {
    uint32_t("numUsedVgprs")
    uint32_t("numUsedSgprs")
    uint32_t("ldsSizePerLocalWorkGroup")
    size_t("ldsUsageSizeInBytes")
    size_t("scratchMemUsageInBytes")
}

val VkShaderStatisticsInfoAMD = struct(Module.VULKAN, "VkShaderStatisticsInfoAMD", mutable = false) {
    VkShaderStageFlags("shaderStageMask")
    VkShaderResourceUsageAMD("resourceUsage")
    uint32_t("numPhysicalVgprs")
    uint32_t("numPhysicalSgprs")
    uint32_t("numAvailableVgprs")
    uint32_t("numAvailableSgprs")
    uint32_t("computeWorkGroupSize")[3]
}

val VkRenderingInfoKHR = struct(Module.VULKAN, "VkRenderingInfoKHR", alias = VkRenderingInfo) {
    Expression("#STRUCTURE_TYPE_RENDERING_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkRenderingFlags("flags")
    VkRect2D("renderArea")
    uint32_t("layerCount")
    uint32_t("viewMask")
    AutoSize("pColorAttachments", optional = true)..uint32_t("colorAttachmentCount")
    VkRenderingAttachmentInfo.const.p("pColorAttachments")
    nullable..VkRenderingAttachmentInfo.const.p("pDepthAttachment")
    nullable..VkRenderingAttachmentInfo.const.p("pStencilAttachment")
}

val VkRenderingAttachmentInfoKHR = struct(Module.VULKAN, "VkRenderingAttachmentInfoKHR", alias = VkRenderingAttachmentInfo) {
    Expression("#STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageView("imageView")
    VkImageLayout("imageLayout")
    VkResolveModeFlagBits("resolveMode")
    VkImageView("resolveImageView")
    VkImageLayout("resolveImageLayout")
    VkAttachmentLoadOp("loadOp")
    VkAttachmentStoreOp("storeOp")
    VkClearValue("clearValue")
}

val VkPipelineRenderingCreateInfoKHR = struct(Module.VULKAN, "VkPipelineRenderingCreateInfoKHR", alias = VkPipelineRenderingCreateInfo) {
    Expression("#STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("viewMask")
    AutoSize("pColorAttachmentFormats", optional = true)..uint32_t("colorAttachmentCount")
    nullable..VkFormat.const.p("pColorAttachmentFormats")
    VkFormat("depthAttachmentFormat")
    VkFormat("stencilAttachmentFormat")
}

val VkPhysicalDeviceDynamicRenderingFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceDynamicRenderingFeaturesKHR", alias = VkPhysicalDeviceDynamicRenderingFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("dynamicRendering")
}

val VkCommandBufferInheritanceRenderingInfoKHR = struct(Module.VULKAN, "VkCommandBufferInheritanceRenderingInfoKHR", alias = VkCommandBufferInheritanceRenderingInfo) {
    Expression("#STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkRenderingFlags("flags")
    uint32_t("viewMask")
    AutoSize("pColorAttachmentFormats", optional = true)..uint32_t("colorAttachmentCount")
    VkFormat.const.p("pColorAttachmentFormats")
    VkFormat("depthAttachmentFormat")
    VkFormat("stencilAttachmentFormat")
    VkSampleCountFlagBits("rasterizationSamples")
}

val VkPhysicalDeviceCornerSampledImageFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceCornerSampledImageFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_CORNER_SAMPLED_IMAGE_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("cornerSampledImage")
}

val VkRenderPassMultiviewCreateInfoKHR = struct(Module.VULKAN, "VkRenderPassMultiviewCreateInfoKHR", alias = VkRenderPassMultiviewCreateInfo) {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pViewMasks", optional = true)..uint32_t("subpassCount")
    uint32_t.const.p("pViewMasks")
    AutoSize("pViewOffsets", optional = true)..uint32_t("dependencyCount")
    int32_t.const.p("pViewOffsets")
    AutoSize("pCorrelationMasks", optional = true)..uint32_t("correlationMaskCount")
    uint32_t.const.p("pCorrelationMasks")
}

val VkPhysicalDeviceMultiviewFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMultiviewFeaturesKHR", alias = VkPhysicalDeviceMultiviewFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("multiview")
    VkBool32("multiviewGeometryShader")
    VkBool32("multiviewTessellationShader")
}

val VkPhysicalDeviceMultiviewPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMultiviewPropertiesKHR", mutable = false, alias = VkPhysicalDeviceMultiviewProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxMultiviewViewCount")
    uint32_t("maxMultiviewInstanceIndex")
}

val VkExternalImageFormatPropertiesNV = struct(Module.VULKAN, "VkExternalImageFormatPropertiesNV", mutable = false) {
    VkImageFormatProperties("imageFormatProperties")
    VkExternalMemoryFeatureFlagsNV("externalMemoryFeatures")
    VkExternalMemoryHandleTypeFlagsNV("exportFromImportedHandleTypes")
    VkExternalMemoryHandleTypeFlagsNV("compatibleHandleTypes")
}

val VkExternalMemoryImageCreateInfoNV = struct(Module.VULKAN, "VkExternalMemoryImageCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlagsNV("handleTypes")
}

val VkExportMemoryAllocateInfoNV = struct(Module.VULKAN, "VkExportMemoryAllocateInfoNV") {
    Expression("#STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlagsNV("handleTypes")
}

val VkImportMemoryWin32HandleInfoNV = struct(Module.VULKAN, "VkImportMemoryWin32HandleInfoNV") {
    javaImport("org.lwjgl.system.windows.*")
    Expression("#STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlagsNV("handleType")
    HANDLE("handle")
}

val VkExportMemoryWin32HandleInfoNV = struct(Module.VULKAN, "VkExportMemoryWin32HandleInfoNV") {
    javaImport("org.lwjgl.system.windows.*")
    Expression("#STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    nullable..SECURITY_ATTRIBUTES.const.p("pAttributes")
    DWORD("dwAccess")
}

val VkWin32KeyedMutexAcquireReleaseInfoNV = struct(Module.VULKAN, "VkWin32KeyedMutexAcquireReleaseInfoNV") {
    Expression("#STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pAcquireSyncs", "pAcquireKeys", "pAcquireTimeoutMilliseconds", optional = true)..uint32_t("acquireCount")
    VkDeviceMemory.const.p("pAcquireSyncs")
    uint64_t.const.p("pAcquireKeys")
    uint32_t.const.p("pAcquireTimeoutMilliseconds")
    AutoSize("pReleaseSyncs", "pReleaseKeys", optional = true)..uint32_t("releaseCount")
    VkDeviceMemory.const.p("pReleaseSyncs")
    uint64_t.const.p("pReleaseKeys")
}

val VkPhysicalDeviceFeatures2KHR = struct(Module.VULKAN, "VkPhysicalDeviceFeatures2KHR", alias = VkPhysicalDeviceFeatures2) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkPhysicalDeviceFeatures("features")
}

val VkPhysicalDeviceProperties2KHR = struct(Module.VULKAN, "VkPhysicalDeviceProperties2KHR", mutable = false, alias = VkPhysicalDeviceProperties2) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPhysicalDeviceProperties("properties")
}

val VkFormatProperties2KHR = struct(Module.VULKAN, "VkFormatProperties2KHR", mutable = false, alias = VkFormatProperties2) {
    Expression("#STRUCTURE_TYPE_FORMAT_PROPERTIES_2")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkFormatProperties("formatProperties")
}

val VkImageFormatProperties2KHR = struct(Module.VULKAN, "VkImageFormatProperties2KHR", mutable = false, alias = VkImageFormatProperties2) {
    Expression("#STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkImageFormatProperties("imageFormatProperties")
}

val VkPhysicalDeviceImageFormatInfo2KHR = struct(Module.VULKAN, "VkPhysicalDeviceImageFormatInfo2KHR", alias = VkPhysicalDeviceImageFormatInfo2) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkFormat("format")
    VkImageType("type")
    VkImageTiling("tiling")
    VkImageUsageFlags("usage")
    VkImageCreateFlags("flags")
}

val VkQueueFamilyProperties2KHR = struct(Module.VULKAN, "VkQueueFamilyProperties2KHR", mutable = false, alias = VkQueueFamilyProperties2) {
    Expression("#STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkQueueFamilyProperties("queueFamilyProperties")
}

val VkPhysicalDeviceMemoryProperties2KHR = struct(Module.VULKAN, "VkPhysicalDeviceMemoryProperties2KHR", mutable = false, alias = VkPhysicalDeviceMemoryProperties2) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPhysicalDeviceMemoryProperties("memoryProperties")
}

val VkSparseImageFormatProperties2KHR = struct(Module.VULKAN, "VkSparseImageFormatProperties2KHR", mutable = false, alias = VkSparseImageFormatProperties2) {
    Expression("#STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkSparseImageFormatProperties("properties")
}

val VkPhysicalDeviceSparseImageFormatInfo2KHR = struct(Module.VULKAN, "VkPhysicalDeviceSparseImageFormatInfo2KHR", alias = VkPhysicalDeviceSparseImageFormatInfo2) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkFormat("format")
    VkImageType("type")
    VkSampleCountFlagBits("samples")
    VkImageUsageFlags("usage")
    VkImageTiling("tiling")
}

val VkMemoryAllocateFlagsInfoKHR = struct(Module.VULKAN, "VkMemoryAllocateFlagsInfoKHR", alias = VkMemoryAllocateFlagsInfo) {
    Expression("#STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkMemoryAllocateFlags("flags")
    uint32_t("deviceMask")
}

val VkDeviceGroupRenderPassBeginInfoKHR = struct(Module.VULKAN, "VkDeviceGroupRenderPassBeginInfoKHR", alias = VkDeviceGroupRenderPassBeginInfo) {
    Expression("#STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("deviceMask")
    AutoSize("pDeviceRenderAreas", optional = true)..uint32_t("deviceRenderAreaCount")
    VkRect2D.const.p("pDeviceRenderAreas")
}

val VkDeviceGroupCommandBufferBeginInfoKHR = struct(Module.VULKAN, "VkDeviceGroupCommandBufferBeginInfoKHR", alias = VkDeviceGroupCommandBufferBeginInfo) {
    Expression("#STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("deviceMask")
}

val VkDeviceGroupSubmitInfoKHR = struct(Module.VULKAN, "VkDeviceGroupSubmitInfoKHR", alias = VkDeviceGroupSubmitInfo) {
    Expression("#STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pWaitSemaphoreDeviceIndices", optional = true)..uint32_t("waitSemaphoreCount")
    uint32_t.const.p("pWaitSemaphoreDeviceIndices")
    AutoSize("pCommandBufferDeviceMasks", optional = true)..uint32_t("commandBufferCount")
    uint32_t.const.p("pCommandBufferDeviceMasks")
    AutoSize("pSignalSemaphoreDeviceIndices", optional = true)..uint32_t("signalSemaphoreCount")
    uint32_t.const.p("pSignalSemaphoreDeviceIndices")
}

val VkDeviceGroupBindSparseInfoKHR = struct(Module.VULKAN, "VkDeviceGroupBindSparseInfoKHR", alias = VkDeviceGroupBindSparseInfo) {
    Expression("#STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("resourceDeviceIndex")
    uint32_t("memoryDeviceIndex")
}

val VkBindBufferMemoryDeviceGroupInfoKHR = struct(Module.VULKAN, "VkBindBufferMemoryDeviceGroupInfoKHR", alias = VkBindBufferMemoryDeviceGroupInfo) {
    Expression("#STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pDeviceIndices", optional = true)..uint32_t("deviceIndexCount")
    uint32_t.const.p("pDeviceIndices")
}

val VkBindImageMemoryDeviceGroupInfoKHR = struct(Module.VULKAN, "VkBindImageMemoryDeviceGroupInfoKHR", alias = VkBindImageMemoryDeviceGroupInfo) {
    Expression("#STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pDeviceIndices", optional = true)..uint32_t("deviceIndexCount")
    uint32_t.const.p("pDeviceIndices")
    AutoSize("pSplitInstanceBindRegions", optional = true)..uint32_t("splitInstanceBindRegionCount")
    VkRect2D.const.p("pSplitInstanceBindRegions")
}

val VkValidationFlagsEXT = struct(Module.VULKAN, "VkValidationFlagsEXT") {
    Expression("#STRUCTURE_TYPE_VALIDATION_FLAGS_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pDisabledValidationChecks")..uint32_t("disabledValidationCheckCount")
    VkValidationCheckEXT.const.p("pDisabledValidationChecks")
}

val VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT", alias = VkPhysicalDeviceTextureCompressionASTCHDRFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("textureCompressionASTC_HDR")
}

val VkImageViewASTCDecodeModeEXT = struct(Module.VULKAN, "VkImageViewASTCDecodeModeEXT") {
    Expression("#STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkFormat("decodeMode")
}

val VkPhysicalDeviceASTCDecodeFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceASTCDecodeFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ASTC_DECODE_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("decodeModeSharedExponent")
}

val VkPhysicalDevicePipelineRobustnessFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDevicePipelineRobustnessFeaturesEXT", alias = VkPhysicalDevicePipelineRobustnessFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("pipelineRobustness")
}

val VkPhysicalDevicePipelineRobustnessPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDevicePipelineRobustnessPropertiesEXT", mutable = false, alias = VkPhysicalDevicePipelineRobustnessProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPipelineRobustnessBufferBehavior("defaultRobustnessStorageBuffers")
    VkPipelineRobustnessBufferBehavior("defaultRobustnessUniformBuffers")
    VkPipelineRobustnessBufferBehavior("defaultRobustnessVertexInputs")
    VkPipelineRobustnessImageBehavior("defaultRobustnessImages")
}

val VkPipelineRobustnessCreateInfoEXT = struct(Module.VULKAN, "VkPipelineRobustnessCreateInfoEXT", alias = VkPipelineRobustnessCreateInfo) {
    Expression("#STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineRobustnessBufferBehavior("storageBuffers")
    VkPipelineRobustnessBufferBehavior("uniformBuffers")
    VkPipelineRobustnessBufferBehavior("vertexInputs")
    VkPipelineRobustnessImageBehavior("images")
}

val VkPhysicalDeviceGroupPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceGroupPropertiesKHR", mutable = false, alias = VkPhysicalDeviceGroupProperties) {
    javaImport("static org.lwjgl.vulkan.VK11.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    AutoSize("physicalDevices")..uint32_t("physicalDeviceCount")
    VkPhysicalDevice("physicalDevices")["VK_MAX_DEVICE_GROUP_SIZE"]
    VkBool32("subsetAllocation")
}

val VkDeviceGroupDeviceCreateInfoKHR = struct(Module.VULKAN, "VkDeviceGroupDeviceCreateInfoKHR", alias = VkDeviceGroupDeviceCreateInfo) {
    Expression("#STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pPhysicalDevices", optional = true)..uint32_t("physicalDeviceCount")
    VkPhysicalDevice.const.p("pPhysicalDevices")
}

val VkExternalMemoryPropertiesKHR = struct(Module.VULKAN, "VkExternalMemoryPropertiesKHR", mutable = false, alias = VkExternalMemoryProperties) {
    VkExternalMemoryFeatureFlags("externalMemoryFeatures")
    VkExternalMemoryHandleTypeFlags("exportFromImportedHandleTypes")
    VkExternalMemoryHandleTypeFlags("compatibleHandleTypes")
}

val VkPhysicalDeviceExternalImageFormatInfoKHR = struct(Module.VULKAN, "VkPhysicalDeviceExternalImageFormatInfoKHR", alias = VkPhysicalDeviceExternalImageFormatInfo) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlagBits("handleType")
}

val VkExternalImageFormatPropertiesKHR = struct(Module.VULKAN, "VkExternalImageFormatPropertiesKHR", mutable = false, alias = VkExternalImageFormatProperties) {
    Expression("#STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExternalMemoryProperties("externalMemoryProperties")
}

val VkPhysicalDeviceExternalBufferInfoKHR = struct(Module.VULKAN, "VkPhysicalDeviceExternalBufferInfoKHR", alias = VkPhysicalDeviceExternalBufferInfo) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBufferCreateFlags("flags")
    VkBufferUsageFlags("usage")
    VkExternalMemoryHandleTypeFlagBits("handleType")
}

val VkExternalBufferPropertiesKHR = struct(Module.VULKAN, "VkExternalBufferPropertiesKHR", mutable = false, alias = VkExternalBufferProperties) {
    Expression("#STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExternalMemoryProperties("externalMemoryProperties")
}

val VkPhysicalDeviceIDPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceIDPropertiesKHR", mutable = false, alias = VkPhysicalDeviceIDProperties) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    javaImport("static org.lwjgl.vulkan.VK11.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint8_t("deviceUUID")["VK_UUID_SIZE"]
    uint8_t("driverUUID")["VK_UUID_SIZE"]
    uint8_t("deviceLUID")["VK_LUID_SIZE"]
    uint32_t("deviceNodeMask")
    VkBool32("deviceLUIDValid")
}

val VkExternalMemoryImageCreateInfoKHR = struct(Module.VULKAN, "VkExternalMemoryImageCreateInfoKHR", alias = VkExternalMemoryImageCreateInfo) {
    Expression("#STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlags("handleTypes")
}

val VkExternalMemoryBufferCreateInfoKHR = struct(Module.VULKAN, "VkExternalMemoryBufferCreateInfoKHR", alias = VkExternalMemoryBufferCreateInfo) {
    Expression("#STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlags("handleTypes")
}

val VkExportMemoryAllocateInfoKHR = struct(Module.VULKAN, "VkExportMemoryAllocateInfoKHR", alias = VkExportMemoryAllocateInfo) {
    Expression("#STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlags("handleTypes")
}

val VkImportMemoryWin32HandleInfoKHR = struct(Module.VULKAN, "VkImportMemoryWin32HandleInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    Expression("#STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlagBits("handleType")
    HANDLE("handle")
    LPCWSTR("name")
}

val VkExportMemoryWin32HandleInfoKHR = struct(Module.VULKAN, "VkExportMemoryWin32HandleInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    Expression("#STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    nullable..SECURITY_ATTRIBUTES.const.p("pAttributes")
    DWORD("dwAccess")
    LPCWSTR("name")
}

val VkMemoryWin32HandlePropertiesKHR = struct(Module.VULKAN, "VkMemoryWin32HandlePropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("memoryTypeBits")
}

val VkMemoryGetWin32HandleInfoKHR = struct(Module.VULKAN, "VkMemoryGetWin32HandleInfoKHR") {
    Expression("#STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceMemory("memory")
    VkExternalMemoryHandleTypeFlagBits("handleType")
}

val VkImportMemoryFdInfoKHR = struct(Module.VULKAN, "VkImportMemoryFdInfoKHR") {
    Expression("#STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlagBits("handleType")
    int("fd")
}

val VkMemoryFdPropertiesKHR = struct(Module.VULKAN, "VkMemoryFdPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("memoryTypeBits")
}

val VkMemoryGetFdInfoKHR = struct(Module.VULKAN, "VkMemoryGetFdInfoKHR") {
    Expression("#STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceMemory("memory")
    VkExternalMemoryHandleTypeFlagBits("handleType")
}

val VkWin32KeyedMutexAcquireReleaseInfoKHR = struct(Module.VULKAN, "VkWin32KeyedMutexAcquireReleaseInfoKHR") {
    Expression("#STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pAcquireSyncs", "pAcquireKeys", "pAcquireTimeouts", optional = true)..uint32_t("acquireCount")
    VkDeviceMemory.const.p("pAcquireSyncs")
    uint64_t.const.p("pAcquireKeys")
    uint32_t.const.p("pAcquireTimeouts")
    AutoSize("pReleaseSyncs", "pReleaseKeys", optional = true)..uint32_t("releaseCount")
    VkDeviceMemory.const.p("pReleaseSyncs")
    uint64_t.const.p("pReleaseKeys")
}

val VkPhysicalDeviceExternalSemaphoreInfoKHR = struct(Module.VULKAN, "VkPhysicalDeviceExternalSemaphoreInfoKHR", alias = VkPhysicalDeviceExternalSemaphoreInfo) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalSemaphoreHandleTypeFlagBits("handleType")
}

val VkExternalSemaphorePropertiesKHR = struct(Module.VULKAN, "VkExternalSemaphorePropertiesKHR", mutable = false, alias = VkExternalSemaphoreProperties) {
    Expression("#STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExternalSemaphoreHandleTypeFlags("exportFromImportedHandleTypes")
    VkExternalSemaphoreHandleTypeFlags("compatibleHandleTypes")
    VkExternalSemaphoreFeatureFlags("externalSemaphoreFeatures")
}

val VkExportSemaphoreCreateInfoKHR = struct(Module.VULKAN, "VkExportSemaphoreCreateInfoKHR", alias = VkExportSemaphoreCreateInfo) {
    Expression("#STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalSemaphoreHandleTypeFlags("handleTypes")
}

val VkImportSemaphoreWin32HandleInfoKHR = struct(Module.VULKAN, "VkImportSemaphoreWin32HandleInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    Expression("#STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSemaphore("semaphore")
    VkSemaphoreImportFlags("flags")
    VkExternalSemaphoreHandleTypeFlagBits("handleType")
    HANDLE("handle")
    LPCWSTR("name")
}

val VkExportSemaphoreWin32HandleInfoKHR = struct(Module.VULKAN, "VkExportSemaphoreWin32HandleInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    Expression("#STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    nullable..SECURITY_ATTRIBUTES.const.p("pAttributes")
    DWORD("dwAccess")
    LPCWSTR("name")
}

val VkD3D12FenceSubmitInfoKHR = struct(Module.VULKAN, "VkD3D12FenceSubmitInfoKHR") {
    Expression("#STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pWaitSemaphoreValues", optional = true)..uint32_t("waitSemaphoreValuesCount")
    nullable..uint64_t.const.p("pWaitSemaphoreValues")
    AutoSize("pSignalSemaphoreValues", optional = true)..uint32_t("signalSemaphoreValuesCount")
    nullable..uint64_t.const.p("pSignalSemaphoreValues")
}

val VkSemaphoreGetWin32HandleInfoKHR = struct(Module.VULKAN, "VkSemaphoreGetWin32HandleInfoKHR") {
    Expression("#STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSemaphore("semaphore")
    VkExternalSemaphoreHandleTypeFlagBits("handleType")
}

val VkImportSemaphoreFdInfoKHR = struct(Module.VULKAN, "VkImportSemaphoreFdInfoKHR") {
    Expression("#STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSemaphore("semaphore")
    VkSemaphoreImportFlags("flags")
    VkExternalSemaphoreHandleTypeFlagBits("handleType")
    int("fd")
}

val VkSemaphoreGetFdInfoKHR = struct(Module.VULKAN, "VkSemaphoreGetFdInfoKHR") {
    Expression("#STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSemaphore("semaphore")
    VkExternalSemaphoreHandleTypeFlagBits("handleType")
}

val VkPhysicalDevicePushDescriptorPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDevicePushDescriptorPropertiesKHR", mutable = false, alias = VkPhysicalDevicePushDescriptorProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxPushDescriptors")
}

val VkConditionalRenderingBeginInfoEXT = struct(Module.VULKAN, "VkConditionalRenderingBeginInfoEXT") {
    Expression("#STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBuffer("buffer")
    VkDeviceSize("offset")
    VkConditionalRenderingFlagsEXT("flags")
}

val VkPhysicalDeviceConditionalRenderingFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceConditionalRenderingFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("conditionalRendering")
    VkBool32("inheritedConditionalRendering")
}

val VkCommandBufferInheritanceConditionalRenderingInfoEXT = struct(Module.VULKAN, "VkCommandBufferInheritanceConditionalRenderingInfoEXT") {
    Expression("#STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("conditionalRenderingEnable")
}

val VkPhysicalDeviceShaderFloat16Int8FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderFloat16Int8FeaturesKHR", alias = VkPhysicalDeviceShaderFloat16Int8Features) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderFloat16")
    VkBool32("shaderInt8")
}

val VkPhysicalDeviceFloat16Int8FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceFloat16Int8FeaturesKHR", alias = VkPhysicalDeviceShaderFloat16Int8Features) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderFloat16")
    VkBool32("shaderInt8")
}

val VkPhysicalDevice16BitStorageFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevice16BitStorageFeaturesKHR", alias = VkPhysicalDevice16BitStorageFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("storageBuffer16BitAccess")
    VkBool32("uniformAndStorageBuffer16BitAccess")
    VkBool32("storagePushConstant16")
    VkBool32("storageInputOutput16")
}

val VkRectLayerKHR = struct(Module.VULKAN, "VkRectLayerKHR") {
    VkOffset2D("offset")
    VkExtent2D("extent")
    uint32_t("layer")
}

val VkPresentRegionKHR = struct(Module.VULKAN, "VkPresentRegionKHR") {
    AutoSize("pRectangles", optional = true)..uint32_t("rectangleCount")
    nullable..VkRectLayerKHR.const.p("pRectangles")
}

val VkPresentRegionsKHR = struct(Module.VULKAN, "VkPresentRegionsKHR") {
    Expression("#STRUCTURE_TYPE_PRESENT_REGIONS_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pRegions", optional = true)..uint32_t("swapchainCount")
    nullable..VkPresentRegionKHR.const.p("pRegions")
}

val VkDescriptorUpdateTemplateEntryKHR = struct(Module.VULKAN, "VkDescriptorUpdateTemplateEntryKHR", alias = VkDescriptorUpdateTemplateEntry) {
    uint32_t("dstBinding")
    uint32_t("dstArrayElement")
    uint32_t("descriptorCount")
    VkDescriptorType("descriptorType")
    size_t("offset")
    size_t("stride")
}

val VkDescriptorUpdateTemplateCreateInfoKHR = struct(Module.VULKAN, "VkDescriptorUpdateTemplateCreateInfoKHR", alias = VkDescriptorUpdateTemplateCreateInfo) {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDescriptorUpdateTemplateCreateFlags("flags")
    AutoSize("pDescriptorUpdateEntries")..uint32_t("descriptorUpdateEntryCount")
    VkDescriptorUpdateTemplateEntry.const.p("pDescriptorUpdateEntries")
    VkDescriptorUpdateTemplateType("templateType")
    VkDescriptorSetLayout("descriptorSetLayout")
    VkPipelineBindPoint("pipelineBindPoint")
    VkPipelineLayout("pipelineLayout")
    uint32_t("set")
}

val VkViewportWScalingNV = struct(Module.VULKAN, "VkViewportWScalingNV") {
    float("xcoeff")
    float("ycoeff")
}

val VkPipelineViewportWScalingStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineViewportWScalingStateCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("viewportWScalingEnable")
    AutoSize("pViewportWScalings", optional = true)..uint32_t("viewportCount")
    nullable..VkViewportWScalingNV.const.p("pViewportWScalings")
}

val VkSurfaceCapabilities2EXT = struct(Module.VULKAN, "VkSurfaceCapabilities2EXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("minImageCount")
    uint32_t("maxImageCount")
    VkExtent2D("currentExtent")
    VkExtent2D("minImageExtent")
    VkExtent2D("maxImageExtent")
    uint32_t("maxImageArrayLayers")
    VkSurfaceTransformFlagsKHR("supportedTransforms")
    VkSurfaceTransformFlagBitsKHR("currentTransform")
    VkCompositeAlphaFlagsKHR("supportedCompositeAlpha")
    VkImageUsageFlags("supportedUsageFlags")
    VkSurfaceCounterFlagsEXT("supportedSurfaceCounters")
}

val VkDisplayPowerInfoEXT = struct(Module.VULKAN, "VkDisplayPowerInfoEXT") {
    Expression("#STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDisplayPowerStateEXT("powerState")
}

val VkDeviceEventInfoEXT = struct(Module.VULKAN, "VkDeviceEventInfoEXT") {
    Expression("#STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceEventTypeEXT("deviceEvent")
}

val VkDisplayEventInfoEXT = struct(Module.VULKAN, "VkDisplayEventInfoEXT") {
    Expression("#STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDisplayEventTypeEXT("displayEvent")
}

val VkSwapchainCounterCreateInfoEXT = struct(Module.VULKAN, "VkSwapchainCounterCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSurfaceCounterFlagsEXT("surfaceCounters")
}

val VkRefreshCycleDurationGOOGLE = struct(Module.VULKAN, "VkRefreshCycleDurationGOOGLE", mutable = false) {
    uint64_t("refreshDuration")
}

val VkPastPresentationTimingGOOGLE = struct(Module.VULKAN, "VkPastPresentationTimingGOOGLE", mutable = false) {
    uint32_t("presentID")
    uint64_t("desiredPresentTime")
    uint64_t("actualPresentTime")
    uint64_t("earliestPresentTime")
    uint64_t("presentMargin")
}

val VkPresentTimeGOOGLE = struct(Module.VULKAN, "VkPresentTimeGOOGLE") {
    uint32_t("presentID")
    uint64_t("desiredPresentTime")
}

val VkPresentTimesInfoGOOGLE = struct(Module.VULKAN, "VkPresentTimesInfoGOOGLE") {
    Expression("#STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pTimes", optional = true)..uint32_t("swapchainCount")
    nullable..VkPresentTimeGOOGLE.const.p("pTimes")
}

val VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX = struct(Module.VULKAN, "VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("perViewPositionAllComponents")
}

val VkMultiviewPerViewAttributesInfoNVX = struct(Module.VULKAN, "VkMultiviewPerViewAttributesInfoNVX") {
    Expression("#STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("perViewAttributes")
    VkBool32("perViewAttributesPositionXOnly")
}

val VkViewportSwizzleNV = struct(Module.VULKAN, "VkViewportSwizzleNV") {
    VkViewportCoordinateSwizzleNV("x")
    VkViewportCoordinateSwizzleNV("y")
    VkViewportCoordinateSwizzleNV("z")
    VkViewportCoordinateSwizzleNV("w")
}

val VkPipelineViewportSwizzleStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineViewportSwizzleStateCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineViewportSwizzleStateCreateFlagsNV("flags")
    AutoSize("pViewportSwizzles")..uint32_t("viewportCount")
    VkViewportSwizzleNV.const.p("pViewportSwizzles")
}

val VkPhysicalDeviceDiscardRectanglePropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDiscardRectanglePropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxDiscardRectangles")
}

val VkPipelineDiscardRectangleStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineDiscardRectangleStateCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineDiscardRectangleStateCreateFlagsEXT("flags")
    VkDiscardRectangleModeEXT("discardRectangleMode")
    AutoSize("pDiscardRectangles", optional = true)..uint32_t("discardRectangleCount")
    nullable..VkRect2D.const.p("pDiscardRectangles")
}

val VkPhysicalDeviceConservativeRasterizationPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceConservativeRasterizationPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    float("primitiveOverestimationSize")
    float("maxExtraPrimitiveOverestimationSize")
    float("extraPrimitiveOverestimationSizeGranularity")
    VkBool32("primitiveUnderestimation")
    VkBool32("conservativePointAndLineRasterization")
    VkBool32("degenerateTrianglesRasterized")
    VkBool32("degenerateLinesRasterized")
    VkBool32("fullyCoveredFragmentShaderInputVariable")
    VkBool32("conservativeRasterizationPostDepthCoverage")
}

val VkPipelineRasterizationConservativeStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineRasterizationConservativeStateCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineRasterizationConservativeStateCreateFlagsEXT("flags")
    VkConservativeRasterizationModeEXT("conservativeRasterizationMode")
    float("extraPrimitiveOverestimationSize")
}

val VkPhysicalDeviceDepthClipEnableFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDepthClipEnableFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("depthClipEnable")
}

val VkPipelineRasterizationDepthClipStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineRasterizationDepthClipStateCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineRasterizationDepthClipStateCreateFlagsEXT("flags")
    VkBool32("depthClipEnable")
}

val VkXYColorEXT = struct(Module.VULKAN, "VkXYColorEXT") {
    float("x")
    float("y")
}

val VkHdrMetadataEXT = struct(Module.VULKAN, "VkHdrMetadataEXT") {
    Expression("#STRUCTURE_TYPE_HDR_METADATA_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkHdrVividDynamicMetadataHUAWEI",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkXYColorEXT("displayPrimaryRed")
    VkXYColorEXT("displayPrimaryGreen")
    VkXYColorEXT("displayPrimaryBlue")
    VkXYColorEXT("whitePoint")
    float("maxLuminance")
    float("minLuminance")
    float("maxContentLightLevel")
    float("maxFrameAverageLightLevel")
}

val VkPhysicalDeviceImagelessFramebufferFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceImagelessFramebufferFeaturesKHR", alias = VkPhysicalDeviceImagelessFramebufferFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("imagelessFramebuffer")
}

val VkFramebufferAttachmentsCreateInfoKHR = struct(Module.VULKAN, "VkFramebufferAttachmentsCreateInfoKHR", alias = VkFramebufferAttachmentsCreateInfo) {
    Expression("#STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pAttachmentImageInfos", optional = true)..uint32_t("attachmentImageInfoCount")
    VkFramebufferAttachmentImageInfo.const.p("pAttachmentImageInfos")
}

val VkFramebufferAttachmentImageInfoKHR = struct(Module.VULKAN, "VkFramebufferAttachmentImageInfoKHR", alias = VkFramebufferAttachmentImageInfo) {
    Expression("#STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageCreateFlags("flags")
    VkImageUsageFlags("usage")
    uint32_t("width")
    uint32_t("height")
    uint32_t("layerCount")
    AutoSize("pViewFormats", optional = true)..uint32_t("viewFormatCount")
    VkFormat.const.p("pViewFormats")
}

val VkRenderPassAttachmentBeginInfoKHR = struct(Module.VULKAN, "VkRenderPassAttachmentBeginInfoKHR", alias = VkRenderPassAttachmentBeginInfo) {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pAttachments", optional = true)..uint32_t("attachmentCount")
    VkImageView.const.p("pAttachments")
}

val VkRenderPassCreateInfo2KHR = struct(Module.VULKAN, "VkRenderPassCreateInfo2KHR", alias = VkRenderPassCreateInfo2) {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkRenderPassCreateFlags("flags")
    AutoSize("pAttachments", optional = true)..uint32_t("attachmentCount")
    VkAttachmentDescription2.const.p("pAttachments")
    AutoSize("pSubpasses")..uint32_t("subpassCount")
    VkSubpassDescription2.const.p("pSubpasses")
    AutoSize("pDependencies", optional = true)..uint32_t("dependencyCount")
    VkSubpassDependency2.const.p("pDependencies")
    AutoSize("pCorrelatedViewMasks", optional = true)..uint32_t("correlatedViewMaskCount")
    uint32_t.const.p("pCorrelatedViewMasks")
}

val VkAttachmentDescription2KHR = struct(Module.VULKAN, "VkAttachmentDescription2KHR", alias = VkAttachmentDescription2) {
    Expression("#STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAttachmentDescriptionFlags("flags")
    VkFormat("format")
    VkSampleCountFlagBits("samples")
    VkAttachmentLoadOp("loadOp")
    VkAttachmentStoreOp("storeOp")
    VkAttachmentLoadOp("stencilLoadOp")
    VkAttachmentStoreOp("stencilStoreOp")
    VkImageLayout("initialLayout")
    VkImageLayout("finalLayout")
}

val VkAttachmentReference2KHR = struct(Module.VULKAN, "VkAttachmentReference2KHR", alias = VkAttachmentReference2) {
    Expression("#STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("attachment")
    VkImageLayout("layout")
    VkImageAspectFlags("aspectMask")
}

val VkSubpassDescription2KHR = struct(Module.VULKAN, "VkSubpassDescription2KHR", alias = VkSubpassDescription2) {
    Expression("#STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSubpassDescriptionFlags("flags")
    VkPipelineBindPoint("pipelineBindPoint")
    uint32_t("viewMask")
    AutoSize("pInputAttachments", optional = true)..uint32_t("inputAttachmentCount")
    VkAttachmentReference2.const.p("pInputAttachments")
    AutoSize("pColorAttachments", "pResolveAttachments", optional = true)..uint32_t("colorAttachmentCount")
    VkAttachmentReference2.const.p("pColorAttachments")
    nullable..VkAttachmentReference2.const.p("pResolveAttachments")
    nullable..VkAttachmentReference2.const.p("pDepthStencilAttachment")
    AutoSize("pPreserveAttachments", optional = true)..uint32_t("preserveAttachmentCount")
    uint32_t.const.p("pPreserveAttachments")
}

val VkSubpassDependency2KHR = struct(Module.VULKAN, "VkSubpassDependency2KHR", alias = VkSubpassDependency2) {
    Expression("#STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("srcSubpass")
    uint32_t("dstSubpass")
    VkPipelineStageFlags("srcStageMask")
    VkPipelineStageFlags("dstStageMask")
    VkAccessFlags("srcAccessMask")
    VkAccessFlags("dstAccessMask")
    VkDependencyFlags("dependencyFlags")
    int32_t("viewOffset")
}

val VkSubpassBeginInfoKHR = struct(Module.VULKAN, "VkSubpassBeginInfoKHR", alias = VkSubpassBeginInfo) {
    Expression("#STRUCTURE_TYPE_SUBPASS_BEGIN_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSubpassContents("contents")
}

val VkSubpassEndInfoKHR = struct(Module.VULKAN, "VkSubpassEndInfoKHR", alias = VkSubpassEndInfo) {
    Expression("#STRUCTURE_TYPE_SUBPASS_END_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
}

val VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG = struct(Module.VULKAN, "VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RELAXED_LINE_RASTERIZATION_FEATURES_IMG")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("relaxedLineRasterization")
}

val VkSharedPresentSurfaceCapabilitiesKHR = struct(Module.VULKAN, "VkSharedPresentSurfaceCapabilitiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkImageUsageFlags("sharedPresentSupportedUsageFlags")
}

val VkPhysicalDeviceExternalFenceInfoKHR = struct(Module.VULKAN, "VkPhysicalDeviceExternalFenceInfoKHR", alias = VkPhysicalDeviceExternalFenceInfo) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalFenceHandleTypeFlagBits("handleType")
}

val VkExternalFencePropertiesKHR = struct(Module.VULKAN, "VkExternalFencePropertiesKHR", mutable = false, alias = VkExternalFenceProperties) {
    Expression("#STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExternalFenceHandleTypeFlags("exportFromImportedHandleTypes")
    VkExternalFenceHandleTypeFlags("compatibleHandleTypes")
    VkExternalFenceFeatureFlags("externalFenceFeatures")
}

val VkExportFenceCreateInfoKHR = struct(Module.VULKAN, "VkExportFenceCreateInfoKHR", alias = VkExportFenceCreateInfo) {
    Expression("#STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalFenceHandleTypeFlags("handleTypes")
}

val VkImportFenceWin32HandleInfoKHR = struct(Module.VULKAN, "VkImportFenceWin32HandleInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    Expression("#STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkFence("fence")
    VkFenceImportFlags("flags")
    VkExternalFenceHandleTypeFlagBits("handleType")
    HANDLE("handle")
    LPCWSTR("name")
}

val VkExportFenceWin32HandleInfoKHR = struct(Module.VULKAN, "VkExportFenceWin32HandleInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    Expression("#STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    nullable..SECURITY_ATTRIBUTES.const.p("pAttributes")
    DWORD("dwAccess")
    LPCWSTR("name")
}

val VkFenceGetWin32HandleInfoKHR = struct(Module.VULKAN, "VkFenceGetWin32HandleInfoKHR") {
    Expression("#STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkFence("fence")
    VkExternalFenceHandleTypeFlagBits("handleType")
}

val VkImportFenceFdInfoKHR = struct(Module.VULKAN, "VkImportFenceFdInfoKHR") {
    Expression("#STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkFence("fence")
    VkFenceImportFlags("flags")
    VkExternalFenceHandleTypeFlagBits("handleType")
    int("fd")
}

val VkFenceGetFdInfoKHR = struct(Module.VULKAN, "VkFenceGetFdInfoKHR") {
    Expression("#STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkFence("fence")
    VkExternalFenceHandleTypeFlagBits("handleType")
}

val VkPhysicalDevicePerformanceQueryFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevicePerformanceQueryFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("performanceCounterQueryPools")
    VkBool32("performanceCounterMultipleQueryPools")
}

val VkPhysicalDevicePerformanceQueryPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDevicePerformanceQueryPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("allowCommandBufferQueryCopies")
}

val VkPerformanceCounterKHR = struct(Module.VULKAN, "VkPerformanceCounterKHR", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPerformanceCounterUnitKHR("unit")
    VkPerformanceCounterScopeKHR("scope")
    VkPerformanceCounterStorageKHR("storage")
    uint8_t("uuid")["VK_UUID_SIZE"]
}

val VkPerformanceCounterDescriptionKHR = struct(Module.VULKAN, "VkPerformanceCounterDescriptionKHR", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPerformanceCounterDescriptionFlagsKHR("flags")
    charUTF8("name")["VK_MAX_DESCRIPTION_SIZE"]
    charUTF8("category")["VK_MAX_DESCRIPTION_SIZE"]
    charUTF8("description")["VK_MAX_DESCRIPTION_SIZE"]
}

val VkQueryPoolPerformanceCreateInfoKHR = struct(Module.VULKAN, "VkQueryPoolPerformanceCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("queueFamilyIndex")
    AutoSize("pCounterIndices")..uint32_t("counterIndexCount")
    uint32_t.const.p("pCounterIndices")
}

val VkPerformanceCounterResultKHR = union(Module.VULKAN, "VkPerformanceCounterResultKHR") {
    int32_t("int32")
    int64_t("int64")
    uint32_t("uint32")
    uint64_t("uint64")
    float("float32")
    double("float64")
}

val VkAcquireProfilingLockInfoKHR = struct(Module.VULKAN, "VkAcquireProfilingLockInfoKHR") {
    Expression("#STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAcquireProfilingLockFlagsKHR("flags")
    uint64_t("timeout")
}

val VkPerformanceQuerySubmitInfoKHR = struct(Module.VULKAN, "VkPerformanceQuerySubmitInfoKHR") {
    Expression("#STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("counterPassIndex")
}

val VkPhysicalDevicePointClippingPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDevicePointClippingPropertiesKHR", mutable = false, alias = VkPhysicalDevicePointClippingProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPointClippingBehavior("pointClippingBehavior")
}

val VkRenderPassInputAttachmentAspectCreateInfoKHR = struct(Module.VULKAN, "VkRenderPassInputAttachmentAspectCreateInfoKHR", alias = VkRenderPassInputAttachmentAspectCreateInfo) {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pAspectReferences")..uint32_t("aspectReferenceCount")
    VkInputAttachmentAspectReference.const.p("pAspectReferences")
}

val VkInputAttachmentAspectReferenceKHR = struct(Module.VULKAN, "VkInputAttachmentAspectReferenceKHR", alias = VkInputAttachmentAspectReference) {
    uint32_t("subpass")
    uint32_t("inputAttachmentIndex")
    VkImageAspectFlags("aspectMask")
}

val VkImageViewUsageCreateInfoKHR = struct(Module.VULKAN, "VkImageViewUsageCreateInfoKHR", alias = VkImageViewUsageCreateInfo) {
    Expression("#STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageUsageFlags("usage")
}

val VkPipelineTessellationDomainOriginStateCreateInfoKHR = struct(Module.VULKAN, "VkPipelineTessellationDomainOriginStateCreateInfoKHR", alias = VkPipelineTessellationDomainOriginStateCreateInfo) {
    Expression("#STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkTessellationDomainOrigin("domainOrigin")
}

val VkPhysicalDeviceSurfaceInfo2KHR = struct(Module.VULKAN, "VkPhysicalDeviceSurfaceInfo2KHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkSurfaceFullScreenExclusiveInfoEXT", "VkSurfaceFullScreenExclusiveWin32InfoEXT", "VkSurfacePresentModeEXT", "VkSurfacePresentModeKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkSurfaceKHR("surface")
}

val VkSurfaceCapabilities2KHR = struct(Module.VULKAN, "VkSurfaceCapabilities2KHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkDisplayNativeHdrSurfaceCapabilitiesAMD", "VkLatencySurfaceCapabilitiesNV", "VkPresentTimingSurfaceCapabilitiesEXT", "VkSharedPresentSurfaceCapabilitiesKHR", "VkSurfaceCapabilitiesFullScreenExclusiveEXT", "VkSurfaceCapabilitiesPresentBarrierNV", "VkSurfaceCapabilitiesPresentId2KHR", "VkSurfaceCapabilitiesPresentWait2KHR", "VkSurfacePresentModeCompatibilityEXT", "VkSurfacePresentModeCompatibilityKHR", "VkSurfacePresentScalingCapabilitiesEXT", "VkSurfacePresentScalingCapabilitiesKHR", "VkSurfaceProtectedCapabilitiesKHR",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkSurfaceCapabilitiesKHR("surfaceCapabilities")
}

val VkSurfaceFormat2KHR = struct(Module.VULKAN, "VkSurfaceFormat2KHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkImageCompressionPropertiesEXT",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkSurfaceFormatKHR("surfaceFormat")
}

val VkPhysicalDeviceVariablePointerFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVariablePointerFeaturesKHR", alias = VkPhysicalDeviceVariablePointersFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("variablePointersStorageBuffer")
    VkBool32("variablePointers")
}

val VkPhysicalDeviceVariablePointersFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVariablePointersFeaturesKHR", alias = VkPhysicalDeviceVariablePointersFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("variablePointersStorageBuffer")
    VkBool32("variablePointers")
}

val VkDisplayProperties2KHR = struct(Module.VULKAN, "VkDisplayProperties2KHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDisplayPropertiesKHR("displayProperties")
}

val VkDisplayPlaneProperties2KHR = struct(Module.VULKAN, "VkDisplayPlaneProperties2KHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDisplayPlanePropertiesKHR("displayPlaneProperties")
}

val VkDisplayModeProperties2KHR = struct(Module.VULKAN, "VkDisplayModeProperties2KHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkDisplayModeStereoPropertiesNV",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkDisplayModePropertiesKHR("displayModeProperties")
}

val VkDisplayPlaneInfo2KHR = struct(Module.VULKAN, "VkDisplayPlaneInfo2KHR") {
    Expression("#STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDisplayModeKHR("mode")
    uint32_t("planeIndex")
}

val VkDisplayPlaneCapabilities2KHR = struct(Module.VULKAN, "VkDisplayPlaneCapabilities2KHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDisplayPlaneCapabilitiesKHR("capabilities")
}

val VkMacOSSurfaceCreateInfoMVK = struct(Module.VULKAN, "VkMacOSSurfaceCreateInfoMVK") {
    Expression("#STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkMacOSSurfaceCreateFlagsMVK("flags")
    nullable..opaque_const_p("pView")
}

val VkMemoryDedicatedRequirementsKHR = struct(Module.VULKAN, "VkMemoryDedicatedRequirementsKHR", mutable = false, alias = VkMemoryDedicatedRequirements) {
    Expression("#STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("prefersDedicatedAllocation")
    VkBool32("requiresDedicatedAllocation")
}

val VkMemoryDedicatedAllocateInfoKHR = struct(Module.VULKAN, "VkMemoryDedicatedAllocateInfoKHR", alias = VkMemoryDedicatedAllocateInfo) {
    Expression("#STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("image")
    VkBuffer("buffer")
}

val VkDebugUtilsLabelEXT = struct(Module.VULKAN, "VkDebugUtilsLabelEXT") {
    Expression("#STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    charUTF8.const.p("pLabelName")
    float("color")[4]
}

val VkDebugUtilsObjectNameInfoEXT = struct(Module.VULKAN, "VkDebugUtilsObjectNameInfoEXT") {
    Expression("#STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkObjectType("objectType")
    uint64_t("objectHandle")
    nullable..charUTF8.const.p("pObjectName")
}

val VkDebugUtilsMessengerCallbackDataEXT = struct(Module.VULKAN, "VkDebugUtilsMessengerCallbackDataEXT") {
    Expression("#STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkDeviceAddressBindingCallbackDataEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDebugUtilsMessengerCallbackDataFlagsEXT("flags")
    nullable..charUTF8.const.p("pMessageIdName")
    int32_t("messageIdNumber")
    nullable..charUTF8.const.p("pMessage")
    AutoSize("pQueueLabels", optional = true)..uint32_t("queueLabelCount")
    VkDebugUtilsLabelEXT.const.p("pQueueLabels")
    AutoSize("pCmdBufLabels", optional = true)..uint32_t("cmdBufLabelCount")
    VkDebugUtilsLabelEXT.const.p("pCmdBufLabels")
    AutoSize("pObjects", optional = true)..uint32_t("objectCount")
    VkDebugUtilsObjectNameInfoEXT.const.p("pObjects")
}

val VkDebugUtilsMessengerCreateInfoEXT = struct(Module.VULKAN, "VkDebugUtilsMessengerCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDebugUtilsMessengerCreateFlagsEXT("flags")
    VkDebugUtilsMessageSeverityFlagsEXT("messageSeverity")
    VkDebugUtilsMessageTypeFlagsEXT("messageType")
    PFN_vkDebugUtilsMessengerCallbackEXT("pfnUserCallback")
    nullable..opaque_p("pUserData")
}

val VkDebugUtilsObjectTagInfoEXT = struct(Module.VULKAN, "VkDebugUtilsObjectTagInfoEXT") {
    Expression("#STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkObjectType("objectType")
    uint64_t("objectHandle")
    uint64_t("tagName")
    AutoSize("pTag")..size_t("tagSize")
    void.const.p("pTag")
}

val VkAndroidHardwareBufferUsageANDROID = struct(Module.VULKAN, "VkAndroidHardwareBufferUsageANDROID", mutable = false) {
    Expression("#STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint64_t("androidHardwareBufferUsage")
}

val VkAndroidHardwareBufferPropertiesANDROID = struct(Module.VULKAN, "VkAndroidHardwareBufferPropertiesANDROID", mutable = false) {
    Expression("#STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkAndroidHardwareBufferFormatProperties2ANDROID", "VkAndroidHardwareBufferFormatPropertiesANDROID", "VkAndroidHardwareBufferFormatResolvePropertiesANDROID",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkDeviceSize("allocationSize")
    uint32_t("memoryTypeBits")
}

val VkAndroidHardwareBufferFormatPropertiesANDROID = struct(Module.VULKAN, "VkAndroidHardwareBufferFormatPropertiesANDROID", mutable = false) {
    Expression("#STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkFormat("format")
    uint64_t("externalFormat")
    VkFormatFeatureFlags("formatFeatures")
    VkComponentMapping("samplerYcbcrConversionComponents")
    VkSamplerYcbcrModelConversion("suggestedYcbcrModel")
    VkSamplerYcbcrRange("suggestedYcbcrRange")
    VkChromaLocation("suggestedXChromaOffset")
    VkChromaLocation("suggestedYChromaOffset")
}

val VkImportAndroidHardwareBufferInfoANDROID = struct(Module.VULKAN, "VkImportAndroidHardwareBufferInfoANDROID") {
    Expression("#STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AHardwareBuffer.p("buffer")
}

val VkMemoryGetAndroidHardwareBufferInfoANDROID = struct(Module.VULKAN, "VkMemoryGetAndroidHardwareBufferInfoANDROID") {
    Expression("#STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceMemory("memory")
}

val VkExternalFormatANDROID = struct(Module.VULKAN, "VkExternalFormatANDROID") {
    Expression("#STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    uint64_t("externalFormat")
}

val VkAndroidHardwareBufferFormatProperties2ANDROID = struct(Module.VULKAN, "VkAndroidHardwareBufferFormatProperties2ANDROID", mutable = false) {
    Expression("#STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkFormat("format")
    uint64_t("externalFormat")
    VkFormatFeatureFlags2("formatFeatures")
    VkComponentMapping("samplerYcbcrConversionComponents")
    VkSamplerYcbcrModelConversion("suggestedYcbcrModel")
    VkSamplerYcbcrRange("suggestedYcbcrRange")
    VkChromaLocation("suggestedXChromaOffset")
    VkChromaLocation("suggestedYChromaOffset")
}

val VkSamplerReductionModeCreateInfoEXT = struct(Module.VULKAN, "VkSamplerReductionModeCreateInfoEXT", alias = VkSamplerReductionModeCreateInfo) {
    Expression("#STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSamplerReductionMode("reductionMode")
}

val VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT", mutable = false, alias = VkPhysicalDeviceSamplerFilterMinmaxProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("filterMinmaxSingleComponentFormats")
    VkBool32("filterMinmaxImageComponentMapping")
}

val VkPhysicalDeviceShaderEnqueueFeaturesAMDX = struct(Module.VULKAN, "VkPhysicalDeviceShaderEnqueueFeaturesAMDX") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderEnqueue")
    VkBool32("shaderMeshEnqueue")
}

val VkPhysicalDeviceShaderEnqueuePropertiesAMDX = struct(Module.VULKAN, "VkPhysicalDeviceShaderEnqueuePropertiesAMDX", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxExecutionGraphDepth")
    uint32_t("maxExecutionGraphShaderOutputNodes")
    uint32_t("maxExecutionGraphShaderPayloadSize")
    uint32_t("maxExecutionGraphShaderPayloadCount")
    uint32_t("executionGraphDispatchAddressAlignment")
    uint32_t("maxExecutionGraphWorkgroupCount")[3]
    uint32_t("maxExecutionGraphWorkgroups")
}

val VkExecutionGraphPipelineScratchSizeAMDX = struct(Module.VULKAN, "VkExecutionGraphPipelineScratchSizeAMDX") {
    Expression("#STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkDeviceSize("minSize")
    VkDeviceSize("maxSize")
    VkDeviceSize("sizeGranularity")
}

val VkPipelineLibraryCreateInfoKHR = struct(Module.VULKAN, "VkPipelineLibraryCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pLibraries", optional = true)..uint32_t("libraryCount")
    VkPipeline.const.p("pLibraries")
}

val VkExecutionGraphPipelineCreateInfoAMDX = struct(Module.VULKAN, "VkExecutionGraphPipelineCreateInfoAMDX") {
    Expression("#STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX")..VkStructureType("sType")
    PointerSetter(
        "VkPipelineCompilerControlCreateInfoAMD", "VkPipelineCreationFeedbackCreateInfo", "VkPipelineCreationFeedbackCreateInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineCreateFlags("flags")
    AutoSize("pStages", optional = true)..uint32_t("stageCount")
    nullable..VkPipelineShaderStageCreateInfo.const.p("pStages")
    nullable..VkPipelineLibraryCreateInfoKHR.const.p("pLibraryInfo")
    VkPipelineLayout("layout")
    VkPipeline("basePipelineHandle")
    int32_t("basePipelineIndex")
}

val VkDeviceOrHostAddressConstAMDX = union(Module.VULKAN, "VkDeviceOrHostAddressConstAMDX") {
    VkDeviceAddress("deviceAddress")
    nullable..opaque_const_p("hostAddress")
}

val VkDispatchGraphInfoAMDX = struct(Module.VULKAN, "VkDispatchGraphInfoAMDX") {
    uint32_t("nodeIndex")
    uint32_t("payloadCount")
    VkDeviceOrHostAddressConstAMDX("payloads")
    uint64_t("payloadStride")
}

val VkDispatchGraphCountInfoAMDX = struct(Module.VULKAN, "VkDispatchGraphCountInfoAMDX") {
    uint32_t("count")
    VkDeviceOrHostAddressConstAMDX("infos")
    uint64_t("stride")
}

val VkPipelineShaderStageNodeCreateInfoAMDX = struct(Module.VULKAN, "VkPipelineShaderStageNodeCreateInfoAMDX") {
    Expression("#STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    nullable..charUTF8.const.p("pName")
    uint32_t("index")
}

val VkHostAddressRangeEXT = struct(Module.VULKAN, "VkHostAddressRangeEXT") {
    void.p("address")
    AutoSize("address")..size_t("size")
}

val VkHostAddressRangeConstEXT = struct(Module.VULKAN, "VkHostAddressRangeConstEXT") {
    void.const.p("address")
    AutoSize("address")..size_t("size")
}

val VkDeviceAddressRangeEXT = struct(Module.VULKAN, "VkDeviceAddressRangeEXT") {
    VkDeviceAddress("address")
    VkDeviceSize("size")
}

val VkTexelBufferDescriptorInfoEXT = struct(Module.VULKAN, "VkTexelBufferDescriptorInfoEXT") {
    Expression("#STRUCTURE_TYPE_TEXEL_BUFFER_DESCRIPTOR_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkFormat("format")
    VkDeviceAddressRangeEXT("addressRange")
}

val VkImageDescriptorInfoEXT = struct(Module.VULKAN, "VkImageDescriptorInfoEXT") {
    Expression("#STRUCTURE_TYPE_IMAGE_DESCRIPTOR_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageViewCreateInfo.const.p("pView")
    VkImageLayout("layout")
}

val VkTensorViewCreateInfoARM = struct(Module.VULKAN, "VkTensorViewCreateInfoARM") {
    Expression("#STRUCTURE_TYPE_TENSOR_VIEW_CREATE_INFO_ARM")..VkStructureType("sType")
    PointerSetter(
        "VkOpaqueCaptureDescriptorDataCreateInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkTensorViewCreateFlagsARM("flags")
    VkTensorARM("tensor")
    VkFormat("format")
}

val VkResourceDescriptorDataEXT = union(Module.VULKAN, "VkResourceDescriptorDataEXT") {
    nullable..VkImageDescriptorInfoEXT.const.p("pImage")
    nullable..VkTexelBufferDescriptorInfoEXT.const.p("pTexelBuffer")
    nullable..VkDeviceAddressRangeEXT.const.p("pAddressRange")
    nullable..VkTensorViewCreateInfoARM.const.p("pTensorARM")
}

val VkResourceDescriptorInfoEXT = struct(Module.VULKAN, "VkResourceDescriptorInfoEXT") {
    Expression("#STRUCTURE_TYPE_RESOURCE_DESCRIPTOR_INFO_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkDebugUtilsObjectNameInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDescriptorType("type")
    VkResourceDescriptorDataEXT("data")
}

val VkBindHeapInfoEXT = struct(Module.VULKAN, "VkBindHeapInfoEXT") {
    Expression("#STRUCTURE_TYPE_BIND_HEAP_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceAddressRangeEXT("heapRange")
    VkDeviceSize("reservedRangeOffset")
    VkDeviceSize("reservedRangeSize")
}

val VkPushDataInfoEXT = struct(Module.VULKAN, "VkPushDataInfoEXT") {
    Expression("#STRUCTURE_TYPE_PUSH_DATA_INFO_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkPushConstantBankInfoNV",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    uint32_t("offset")
    VkHostAddressRangeConstEXT("data")
}

val VkDescriptorMappingSourceConstantOffsetEXT = struct(Module.VULKAN, "VkDescriptorMappingSourceConstantOffsetEXT") {
    uint32_t("heapOffset")
    uint32_t("heapArrayStride")
    nullable..VkSamplerCreateInfo.const.p("pEmbeddedSampler")
    uint32_t("samplerHeapOffset")
    uint32_t("samplerHeapArrayStride")
}

val VkDescriptorMappingSourcePushIndexEXT = struct(Module.VULKAN, "VkDescriptorMappingSourcePushIndexEXT") {
    uint32_t("heapOffset")
    uint32_t("pushOffset")
    uint32_t("heapIndexStride")
    uint32_t("heapArrayStride")
    nullable..VkSamplerCreateInfo.const.p("pEmbeddedSampler")
    VkBool32("useCombinedImageSamplerIndex")
    uint32_t("samplerHeapOffset")
    uint32_t("samplerPushOffset")
    uint32_t("samplerHeapIndexStride")
    uint32_t("samplerHeapArrayStride")
}

val VkDescriptorMappingSourceIndirectIndexEXT = struct(Module.VULKAN, "VkDescriptorMappingSourceIndirectIndexEXT") {
    uint32_t("heapOffset")
    uint32_t("pushOffset")
    uint32_t("addressOffset")
    uint32_t("heapIndexStride")
    uint32_t("heapArrayStride")
    nullable..VkSamplerCreateInfo.const.p("pEmbeddedSampler")
    VkBool32("useCombinedImageSamplerIndex")
    uint32_t("samplerHeapOffset")
    uint32_t("samplerPushOffset")
    uint32_t("samplerAddressOffset")
    uint32_t("samplerHeapIndexStride")
    uint32_t("samplerHeapArrayStride")
}

val VkDescriptorMappingSourceHeapDataEXT = struct(Module.VULKAN, "VkDescriptorMappingSourceHeapDataEXT") {
    uint32_t("heapOffset")
    uint32_t("pushOffset")
}

val VkDescriptorMappingSourceIndirectAddressEXT = struct(Module.VULKAN, "VkDescriptorMappingSourceIndirectAddressEXT") {
    uint32_t("pushOffset")
    uint32_t("addressOffset")
}

val VkDescriptorMappingSourceShaderRecordIndexEXT = struct(Module.VULKAN, "VkDescriptorMappingSourceShaderRecordIndexEXT") {
    uint32_t("heapOffset")
    uint32_t("shaderRecordOffset")
    uint32_t("heapIndexStride")
    uint32_t("heapArrayStride")
    nullable..VkSamplerCreateInfo.const.p("pEmbeddedSampler")
    VkBool32("useCombinedImageSamplerIndex")
    uint32_t("samplerHeapOffset")
    uint32_t("samplerShaderRecordOffset")
    uint32_t("samplerHeapIndexStride")
    uint32_t("samplerHeapArrayStride")
}

val VkDescriptorMappingSourceIndirectIndexArrayEXT = struct(Module.VULKAN, "VkDescriptorMappingSourceIndirectIndexArrayEXT") {
    uint32_t("heapOffset")
    uint32_t("pushOffset")
    uint32_t("addressOffset")
    uint32_t("heapIndexStride")
    nullable..VkSamplerCreateInfo.const.p("pEmbeddedSampler")
    VkBool32("useCombinedImageSamplerIndex")
    uint32_t("samplerHeapOffset")
    uint32_t("samplerPushOffset")
    uint32_t("samplerAddressOffset")
    uint32_t("samplerHeapIndexStride")
}

val VkDescriptorMappingSourceDataEXT = union(Module.VULKAN, "VkDescriptorMappingSourceDataEXT") {
    VkDescriptorMappingSourceConstantOffsetEXT("constantOffset")
    VkDescriptorMappingSourcePushIndexEXT("pushIndex")
    VkDescriptorMappingSourceIndirectIndexEXT("indirectIndex")
    VkDescriptorMappingSourceIndirectIndexArrayEXT("indirectIndexArray")
    VkDescriptorMappingSourceHeapDataEXT("heapData")
    uint32_t("pushDataOffset")
    uint32_t("pushAddressOffset")
    VkDescriptorMappingSourceIndirectAddressEXT("indirectAddress")
    VkDescriptorMappingSourceShaderRecordIndexEXT("shaderRecordIndex")
    uint32_t("shaderRecordDataOffset")
    uint32_t("shaderRecordAddressOffset")
}

val VkDescriptorSetAndBindingMappingEXT = struct(Module.VULKAN, "VkDescriptorSetAndBindingMappingEXT") {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_SET_AND_BINDING_MAPPING_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkPushConstantBankInfoNV",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    uint32_t("descriptorSet")
    uint32_t("firstBinding")
    uint32_t("bindingCount")
    VkSpirvResourceTypeFlagsEXT("resourceMask")
    VkDescriptorMappingSourceEXT("source")
    VkDescriptorMappingSourceDataEXT("sourceData")
}

val VkShaderDescriptorSetAndBindingMappingInfoEXT = struct(Module.VULKAN, "VkShaderDescriptorSetAndBindingMappingInfoEXT") {
    Expression("#STRUCTURE_TYPE_SHADER_DESCRIPTOR_SET_AND_BINDING_MAPPING_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pMappings", optional = true)..uint32_t("mappingCount")
    VkDescriptorSetAndBindingMappingEXT.const.p("pMappings")
}

val VkOpaqueCaptureDataCreateInfoEXT = struct(Module.VULKAN, "VkOpaqueCaptureDataCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_OPAQUE_CAPTURE_DATA_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    nullable..VkHostAddressRangeConstEXT.const.p("pData")
}

val VkPhysicalDeviceDescriptorHeapFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorHeapFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("descriptorHeap")
    VkBool32("descriptorHeapCaptureReplay")
}

val VkPhysicalDeviceDescriptorHeapPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorHeapPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceSize("samplerHeapAlignment")
    VkDeviceSize("resourceHeapAlignment")
    VkDeviceSize("maxSamplerHeapSize")
    VkDeviceSize("maxResourceHeapSize")
    VkDeviceSize("minSamplerHeapReservedRange")
    VkDeviceSize("minSamplerHeapReservedRangeWithEmbedded")
    VkDeviceSize("minResourceHeapReservedRange")
    VkDeviceSize("samplerDescriptorSize")
    VkDeviceSize("imageDescriptorSize")
    VkDeviceSize("bufferDescriptorSize")
    VkDeviceSize("samplerDescriptorAlignment")
    VkDeviceSize("imageDescriptorAlignment")
    VkDeviceSize("bufferDescriptorAlignment")
    VkDeviceSize("maxPushDataSize")
    size_t("imageCaptureReplayOpaqueDataSize")
    uint32_t("maxDescriptorHeapEmbeddedSamplers")
    uint32_t("samplerYcbcrConversionCount")
    VkBool32("sparseDescriptorHeaps")
    VkBool32("protectedDescriptorHeaps")
}

val VkCommandBufferInheritanceDescriptorHeapInfoEXT = struct(Module.VULKAN, "VkCommandBufferInheritanceDescriptorHeapInfoEXT") {
    Expression("#STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_DESCRIPTOR_HEAP_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    nullable..VkBindHeapInfoEXT.const.p("pSamplerHeapBindInfo")
    nullable..VkBindHeapInfoEXT.const.p("pResourceHeapBindInfo")
}

val VkSamplerCustomBorderColorIndexCreateInfoEXT = struct(Module.VULKAN, "VkSamplerCustomBorderColorIndexCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_INDEX_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("index")
}

val VkSamplerCustomBorderColorCreateInfoEXT = struct(Module.VULKAN, "VkSamplerCustomBorderColorCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkClearColorValue("customBorderColor")
    VkFormat("format")
}

val VkIndirectCommandsLayoutPushDataTokenNV = struct(Module.VULKAN, "VkIndirectCommandsLayoutPushDataTokenNV") {
    Expression("#STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_PUSH_DATA_TOKEN_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("pushDataOffset")
    uint32_t("pushDataSize")
}

val VkSubsampledImageFormatPropertiesEXT = struct(Module.VULKAN, "VkSubsampledImageFormatPropertiesEXT") {
    Expression("#STRUCTURE_TYPE_SUBSAMPLED_IMAGE_FORMAT_PROPERTIES_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("subsampledImageDescriptorCount")
}

val VkPhysicalDeviceDescriptorHeapTensorPropertiesARM = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorHeapTensorPropertiesARM", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_TENSOR_PROPERTIES_ARM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceSize("tensorDescriptorSize")
    VkDeviceSize("tensorDescriptorAlignment")
    size_t("tensorCaptureReplayOpaqueDataSize")
}

val VkAttachmentSampleCountInfoAMD = struct(Module.VULKAN, "VkAttachmentSampleCountInfoAMD") {
    Expression("#STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pColorAttachmentSamples", optional = true)..uint32_t("colorAttachmentCount")
    nullable..VkSampleCountFlagBits.const.p("pColorAttachmentSamples")
    VkSampleCountFlagBits("depthStencilAttachmentSamples")
}

val VkPhysicalDeviceInlineUniformBlockFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceInlineUniformBlockFeaturesEXT", alias = VkPhysicalDeviceInlineUniformBlockFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("inlineUniformBlock")
    VkBool32("descriptorBindingInlineUniformBlockUpdateAfterBind")
}

val VkPhysicalDeviceInlineUniformBlockPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceInlineUniformBlockPropertiesEXT", mutable = false, alias = VkPhysicalDeviceInlineUniformBlockProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxInlineUniformBlockSize")
    uint32_t("maxPerStageDescriptorInlineUniformBlocks")
    uint32_t("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks")
    uint32_t("maxDescriptorSetInlineUniformBlocks")
    uint32_t("maxDescriptorSetUpdateAfterBindInlineUniformBlocks")
}

val VkWriteDescriptorSetInlineUniformBlockEXT = struct(Module.VULKAN, "VkWriteDescriptorSetInlineUniformBlockEXT", alias = VkWriteDescriptorSetInlineUniformBlock) {
    Expression("#STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pData")..uint32_t("dataSize")
    void.const.p("pData")
}

val VkDescriptorPoolInlineUniformBlockCreateInfoEXT = struct(Module.VULKAN, "VkDescriptorPoolInlineUniformBlockCreateInfoEXT", alias = VkDescriptorPoolInlineUniformBlockCreateInfo) {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("maxInlineUniformBlockBindings")
}

val VkPhysicalDeviceShaderBfloat16FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderBfloat16FeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_BFLOAT16_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderBFloat16Type")
    VkBool32("shaderBFloat16DotProduct")
    VkBool32("shaderBFloat16CooperativeMatrix")
}

val VkSampleLocationEXT = struct(Module.VULKAN, "VkSampleLocationEXT") {
    float("x")
    float("y")
}

val VkSampleLocationsInfoEXT = struct(Module.VULKAN, "VkSampleLocationsInfoEXT") {
    Expression("#STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSampleCountFlagBits("sampleLocationsPerPixel")
    VkExtent2D("sampleLocationGridSize")
    AutoSize("pSampleLocations", optional = true)..uint32_t("sampleLocationsCount")
    VkSampleLocationEXT.const.p("pSampleLocations")
}

val VkAttachmentSampleLocationsEXT = struct(Module.VULKAN, "VkAttachmentSampleLocationsEXT") {
    uint32_t("attachmentIndex")
    VkSampleLocationsInfoEXT("sampleLocationsInfo")
}

val VkSubpassSampleLocationsEXT = struct(Module.VULKAN, "VkSubpassSampleLocationsEXT") {
    uint32_t("subpassIndex")
    VkSampleLocationsInfoEXT("sampleLocationsInfo")
}

val VkRenderPassSampleLocationsBeginInfoEXT = struct(Module.VULKAN, "VkRenderPassSampleLocationsBeginInfoEXT") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pAttachmentInitialSampleLocations", optional = true)..uint32_t("attachmentInitialSampleLocationsCount")
    VkAttachmentSampleLocationsEXT.const.p("pAttachmentInitialSampleLocations")
    AutoSize("pPostSubpassSampleLocations", optional = true)..uint32_t("postSubpassSampleLocationsCount")
    VkSubpassSampleLocationsEXT.const.p("pPostSubpassSampleLocations")
}

val VkPipelineSampleLocationsStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineSampleLocationsStateCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("sampleLocationsEnable")
    VkSampleLocationsInfoEXT("sampleLocationsInfo")
}

val VkPhysicalDeviceSampleLocationsPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceSampleLocationsPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkSampleCountFlags("sampleLocationSampleCounts")
    VkExtent2D("maxSampleLocationGridSize")
    float("sampleLocationCoordinateRange")[2]
    uint32_t("sampleLocationSubPixelBits")
    VkBool32("variableSampleLocations")
}

val VkMultisamplePropertiesEXT = struct(Module.VULKAN, "VkMultisamplePropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExtent2D("maxSampleLocationGridSize")
}

val VkBufferMemoryRequirementsInfo2KHR = struct(Module.VULKAN, "VkBufferMemoryRequirementsInfo2KHR", alias = VkBufferMemoryRequirementsInfo2) {
    Expression("#STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBuffer("buffer")
}

val VkImageMemoryRequirementsInfo2KHR = struct(Module.VULKAN, "VkImageMemoryRequirementsInfo2KHR", alias = VkImageMemoryRequirementsInfo2) {
    Expression("#STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("image")
}

val VkImageSparseMemoryRequirementsInfo2KHR = struct(Module.VULKAN, "VkImageSparseMemoryRequirementsInfo2KHR", alias = VkImageSparseMemoryRequirementsInfo2) {
    Expression("#STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("image")
}

val VkMemoryRequirements2KHR = struct(Module.VULKAN, "VkMemoryRequirements2KHR", mutable = false, alias = VkMemoryRequirements2) {
    Expression("#STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkMemoryRequirements("memoryRequirements")
}

val VkSparseImageMemoryRequirements2KHR = struct(Module.VULKAN, "VkSparseImageMemoryRequirements2KHR", mutable = false, alias = VkSparseImageMemoryRequirements2) {
    Expression("#STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkSparseImageMemoryRequirements("memoryRequirements")
}

val VkImageFormatListCreateInfoKHR = struct(Module.VULKAN, "VkImageFormatListCreateInfoKHR", alias = VkImageFormatListCreateInfo) {
    Expression("#STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pViewFormats", optional = true)..uint32_t("viewFormatCount")
    VkFormat.const.p("pViewFormats")
}

val VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("advancedBlendCoherentOperations")
}

val VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("advancedBlendMaxColorAttachments")
    VkBool32("advancedBlendIndependentBlend")
    VkBool32("advancedBlendNonPremultipliedSrcColor")
    VkBool32("advancedBlendNonPremultipliedDstColor")
    VkBool32("advancedBlendCorrelatedOverlap")
    VkBool32("advancedBlendAllOperations")
}

val VkPipelineColorBlendAdvancedStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineColorBlendAdvancedStateCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("srcPremultiplied")
    VkBool32("dstPremultiplied")
    VkBlendOverlapEXT("blendOverlap")
}

val VkPipelineCoverageToColorStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineCoverageToColorStateCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineCoverageToColorStateCreateFlagsNV("flags")
    VkBool32("coverageToColorEnable")
    uint32_t("coverageToColorLocation")
}

val VkDeviceOrHostAddressKHR = union(Module.VULKAN, "VkDeviceOrHostAddressKHR") {
    VkDeviceAddress("deviceAddress")
    nullable..opaque_p("hostAddress")
}

val VkDeviceOrHostAddressConstKHR = union(Module.VULKAN, "VkDeviceOrHostAddressConstKHR") {
    VkDeviceAddress("deviceAddress")
    nullable..opaque_const_p("hostAddress")
}

val VkAccelerationStructureBuildRangeInfoKHR = struct(Module.VULKAN, "VkAccelerationStructureBuildRangeInfoKHR") {
    uint32_t("primitiveCount")
    uint32_t("primitiveOffset")
    uint32_t("firstVertex")
    uint32_t("transformOffset")
}

val VkAabbPositionsKHR = struct(Module.VULKAN, "VkAabbPositionsKHR") {
    float("minX")
    float("minY")
    float("minZ")
    float("maxX")
    float("maxY")
    float("maxZ")
}

val VkAccelerationStructureGeometryTrianglesDataKHR = struct(Module.VULKAN, "VkAccelerationStructureGeometryTrianglesDataKHR") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkAccelerationStructureGeometryMotionTrianglesDataNV", "VkAccelerationStructureTrianglesDisplacementMicromapNV", "VkAccelerationStructureTrianglesOpacityMicromapEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkFormat("vertexFormat")
    VkDeviceOrHostAddressConstKHR("vertexData")
    VkDeviceSize("vertexStride")
    uint32_t("maxVertex")
    VkIndexType("indexType")
    VkDeviceOrHostAddressConstKHR("indexData")
    VkDeviceOrHostAddressConstKHR("transformData")
}

val VkTransformMatrixKHR = struct(Module.VULKAN, "VkTransformMatrixKHR") {
    float("matrix")[3][4]
}

val VkAccelerationStructureGeometryAabbsDataKHR = struct(Module.VULKAN, "VkAccelerationStructureGeometryAabbsDataKHR") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceOrHostAddressConstKHR("data")
    VkDeviceSize("stride")
}

val VkAccelerationStructureGeometryInstancesDataKHR = struct(Module.VULKAN, "VkAccelerationStructureGeometryInstancesDataKHR") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("arrayOfPointers")
    VkDeviceOrHostAddressConstKHR("data")
}

val VkAccelerationStructureGeometryDataKHR = union(Module.VULKAN, "VkAccelerationStructureGeometryDataKHR") {
    VkAccelerationStructureGeometryTrianglesDataKHR("triangles")
    VkAccelerationStructureGeometryAabbsDataKHR("aabbs")
    VkAccelerationStructureGeometryInstancesDataKHR("instances")
}

val VkAccelerationStructureGeometryKHR = struct(Module.VULKAN, "VkAccelerationStructureGeometryKHR") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX", "VkAccelerationStructureGeometryLinearSweptSpheresDataNV", "VkAccelerationStructureGeometrySpheresDataNV",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkGeometryTypeKHR("geometryType")
    VkAccelerationStructureGeometryDataKHR("geometry")
    VkGeometryFlagsKHR("flags")
}

val VkAccelerationStructureBuildGeometryInfoKHR = struct(Module.VULKAN, "VkAccelerationStructureBuildGeometryInfoKHR") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAccelerationStructureTypeKHR("type")
    VkBuildAccelerationStructureFlagsKHR("flags")
    VkBuildAccelerationStructureModeKHR("mode")
    VkAccelerationStructureKHR("srcAccelerationStructure")
    VkAccelerationStructureKHR("dstAccelerationStructure")
    AutoSize("pGeometries", "ppGeometries", optional = true)..uint32_t("geometryCount")
    nullable..VkAccelerationStructureGeometryKHR.const.p("pGeometries")
    nullable..VkAccelerationStructureGeometryKHR.const.p.const.p("ppGeometries")
    VkDeviceOrHostAddressKHR("scratchData")
}

val VkAccelerationStructureInstanceKHR = struct(Module.VULKAN, "VkAccelerationStructureInstanceKHR") {
    VkTransformMatrixKHR("transform")
    uint32_t("instanceCustomIndex", bits = 24)
    uint32_t("mask", bits = 8)
    uint32_t("instanceShaderBindingTableRecordOffset", bits = 24)
    VkGeometryInstanceFlagsKHR("flags", bits = 8)
    uint64_t("accelerationStructureReference")
}

val VkAccelerationStructureCreateInfoKHR = struct(Module.VULKAN, "VkAccelerationStructureCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkAccelerationStructureMotionInfoNV", "VkOpaqueCaptureDescriptorDataCreateInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkAccelerationStructureCreateFlagsKHR("createFlags")
    VkBuffer("buffer")
    VkDeviceSize("offset")
    VkDeviceSize("size")
    VkAccelerationStructureTypeKHR("type")
    VkDeviceAddress("deviceAddress")
}

val VkWriteDescriptorSetAccelerationStructureKHR = struct(Module.VULKAN, "VkWriteDescriptorSetAccelerationStructureKHR") {
    Expression("#STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pAccelerationStructures", optional = true)..uint32_t("accelerationStructureCount")
    nullable..VkAccelerationStructureKHR.const.p("pAccelerationStructures")
}

val VkPhysicalDeviceAccelerationStructureFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceAccelerationStructureFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("accelerationStructure")
    VkBool32("accelerationStructureCaptureReplay")
    VkBool32("accelerationStructureIndirectBuild")
    VkBool32("accelerationStructureHostCommands")
    VkBool32("descriptorBindingAccelerationStructureUpdateAfterBind")
}

val VkPhysicalDeviceAccelerationStructurePropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceAccelerationStructurePropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint64_t("maxGeometryCount")
    uint64_t("maxInstanceCount")
    uint64_t("maxPrimitiveCount")
    uint32_t("maxPerStageDescriptorAccelerationStructures")
    uint32_t("maxPerStageDescriptorUpdateAfterBindAccelerationStructures")
    uint32_t("maxDescriptorSetAccelerationStructures")
    uint32_t("maxDescriptorSetUpdateAfterBindAccelerationStructures")
    uint32_t("minAccelerationStructureScratchOffsetAlignment")
}

val VkAccelerationStructureDeviceAddressInfoKHR = struct(Module.VULKAN, "VkAccelerationStructureDeviceAddressInfoKHR") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAccelerationStructureKHR("accelerationStructure")
}

val VkAccelerationStructureVersionInfoKHR = struct(Module.VULKAN, "VkAccelerationStructureVersionInfoKHR") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint8_t.const.p("pVersionData")
}

val VkCopyAccelerationStructureToMemoryInfoKHR = struct(Module.VULKAN, "VkCopyAccelerationStructureToMemoryInfoKHR") {
    Expression("#STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAccelerationStructureKHR("src")
    VkDeviceOrHostAddressKHR("dst")
    VkCopyAccelerationStructureModeKHR("mode")
}

val VkCopyMemoryToAccelerationStructureInfoKHR = struct(Module.VULKAN, "VkCopyMemoryToAccelerationStructureInfoKHR") {
    Expression("#STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceOrHostAddressConstKHR("src")
    VkAccelerationStructureKHR("dst")
    VkCopyAccelerationStructureModeKHR("mode")
}

val VkCopyAccelerationStructureInfoKHR = struct(Module.VULKAN, "VkCopyAccelerationStructureInfoKHR") {
    Expression("#STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAccelerationStructureKHR("src")
    VkAccelerationStructureKHR("dst")
    VkCopyAccelerationStructureModeKHR("mode")
}

val VkAccelerationStructureBuildSizesInfoKHR = struct(Module.VULKAN, "VkAccelerationStructureBuildSizesInfoKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceSize("accelerationStructureSize")
    VkDeviceSize("updateScratchSize")
    VkDeviceSize("buildScratchSize")
}

val VkRayTracingShaderGroupCreateInfoKHR = struct(Module.VULKAN, "VkRayTracingShaderGroupCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkRayTracingShaderGroupTypeKHR("type")
    uint32_t("generalShader")
    uint32_t("closestHitShader")
    uint32_t("anyHitShader")
    uint32_t("intersectionShader")
    nullable..opaque_const_p("pShaderGroupCaptureReplayHandle")
}

val VkRayTracingPipelineInterfaceCreateInfoKHR = struct(Module.VULKAN, "VkRayTracingPipelineInterfaceCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("maxPipelineRayPayloadSize")
    uint32_t("maxPipelineRayHitAttributeSize")
}

val VkRayTracingPipelineCreateInfoKHR = struct(Module.VULKAN, "VkRayTracingPipelineCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkPipelineBinaryInfoKHR", "VkPipelineCreateFlags2CreateInfo", "VkPipelineCreateFlags2CreateInfoKHR", "VkPipelineCreationFeedbackCreateInfo", "VkPipelineCreationFeedbackCreateInfoEXT", "VkPipelineRobustnessCreateInfo", "VkPipelineRobustnessCreateInfoEXT", "VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineCreateFlags("flags")
    AutoSize("pStages", optional = true)..uint32_t("stageCount")
    VkPipelineShaderStageCreateInfo.const.p("pStages")
    AutoSize("pGroups", optional = true)..uint32_t("groupCount")
    VkRayTracingShaderGroupCreateInfoKHR.const.p("pGroups")
    uint32_t("maxPipelineRayRecursionDepth")
    nullable..VkPipelineLibraryCreateInfoKHR.const.p("pLibraryInfo")
    nullable..VkRayTracingPipelineInterfaceCreateInfoKHR.const.p("pLibraryInterface")
    nullable..VkPipelineDynamicStateCreateInfo.const.p("pDynamicState")
    VkPipelineLayout("layout")
    VkPipeline("basePipelineHandle")
    int32_t("basePipelineIndex")
}

val VkPhysicalDeviceRayTracingPipelineFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingPipelineFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("rayTracingPipeline")
    VkBool32("rayTracingPipelineShaderGroupHandleCaptureReplay")
    VkBool32("rayTracingPipelineShaderGroupHandleCaptureReplayMixed")
    VkBool32("rayTracingPipelineTraceRaysIndirect")
    VkBool32("rayTraversalPrimitiveCulling")
}

val VkPhysicalDeviceRayTracingPipelinePropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingPipelinePropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("shaderGroupHandleSize")
    uint32_t("maxRayRecursionDepth")
    uint32_t("maxShaderGroupStride")
    uint32_t("shaderGroupBaseAlignment")
    uint32_t("shaderGroupHandleCaptureReplaySize")
    uint32_t("maxRayDispatchInvocationCount")
    uint32_t("shaderGroupHandleAlignment")
    uint32_t("maxRayHitAttributeSize")
}

val VkStridedDeviceAddressRegionKHR = struct(Module.VULKAN, "VkStridedDeviceAddressRegionKHR") {
    VkDeviceAddress("deviceAddress")
    VkDeviceSize("stride")
    VkDeviceSize("size")
}

val VkTraceRaysIndirectCommandKHR = struct(Module.VULKAN, "VkTraceRaysIndirectCommandKHR") {
    uint32_t("width")
    uint32_t("height")
    uint32_t("depth")
}

val VkPhysicalDeviceRayQueryFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceRayQueryFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_QUERY_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("rayQuery")
}

val VkPipelineCoverageModulationStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineCoverageModulationStateCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineCoverageModulationStateCreateFlagsNV("flags")
    VkCoverageModulationModeNV("coverageModulationMode")
    VkBool32("coverageModulationTableEnable")
    AutoSize("pCoverageModulationTable", optional = true)..uint32_t("coverageModulationTableCount")
    nullable..float.const.p("pCoverageModulationTable")
}

val VkAttachmentSampleCountInfoNV = struct(Module.VULKAN, "VkAttachmentSampleCountInfoNV", alias = VkAttachmentSampleCountInfoAMD) {
    Expression("#STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pColorAttachmentSamples", optional = true)..uint32_t("colorAttachmentCount")
    nullable..VkSampleCountFlagBits.const.p("pColorAttachmentSamples")
    VkSampleCountFlagBits("depthStencilAttachmentSamples")
}

val VkPhysicalDeviceShaderSMBuiltinsPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceShaderSMBuiltinsPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("shaderSMCount")
    uint32_t("shaderWarpsPerSM")
}

val VkPhysicalDeviceShaderSMBuiltinsFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceShaderSMBuiltinsFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderSMBuiltins")
}

val VkSamplerYcbcrConversionCreateInfoKHR = struct(Module.VULKAN, "VkSamplerYcbcrConversionCreateInfoKHR", alias = VkSamplerYcbcrConversionCreateInfo) {
    Expression("#STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkFormat("format")
    VkSamplerYcbcrModelConversion("ycbcrModel")
    VkSamplerYcbcrRange("ycbcrRange")
    VkComponentMapping("components")
    VkChromaLocation("xChromaOffset")
    VkChromaLocation("yChromaOffset")
    VkFilter("chromaFilter")
    VkBool32("forceExplicitReconstruction")
}

val VkSamplerYcbcrConversionInfoKHR = struct(Module.VULKAN, "VkSamplerYcbcrConversionInfoKHR", alias = VkSamplerYcbcrConversionInfo) {
    Expression("#STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSamplerYcbcrConversion("conversion")
}

val VkBindImagePlaneMemoryInfoKHR = struct(Module.VULKAN, "VkBindImagePlaneMemoryInfoKHR", alias = VkBindImagePlaneMemoryInfo) {
    Expression("#STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageAspectFlagBits("planeAspect")
}

val VkImagePlaneMemoryRequirementsInfoKHR = struct(Module.VULKAN, "VkImagePlaneMemoryRequirementsInfoKHR", alias = VkImagePlaneMemoryRequirementsInfo) {
    Expression("#STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageAspectFlagBits("planeAspect")
}

val VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR", alias = VkPhysicalDeviceSamplerYcbcrConversionFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("samplerYcbcrConversion")
}

val VkSamplerYcbcrConversionImageFormatPropertiesKHR = struct(Module.VULKAN, "VkSamplerYcbcrConversionImageFormatPropertiesKHR", mutable = false, alias = VkSamplerYcbcrConversionImageFormatProperties) {
    Expression("#STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("combinedImageSamplerDescriptorCount")
}

val VkBindBufferMemoryInfoKHR = struct(Module.VULKAN, "VkBindBufferMemoryInfoKHR", alias = VkBindBufferMemoryInfo) {
    Expression("#STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBuffer("buffer")
    VkDeviceMemory("memory")
    VkDeviceSize("memoryOffset")
}

val VkBindImageMemoryInfoKHR = struct(Module.VULKAN, "VkBindImageMemoryInfoKHR", alias = VkBindImageMemoryInfo) {
    Expression("#STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("image")
    VkDeviceMemory("memory")
    VkDeviceSize("memoryOffset")
}

val VkDrmFormatModifierPropertiesEXT = struct(Module.VULKAN, "VkDrmFormatModifierPropertiesEXT", mutable = false) {
    uint64_t("drmFormatModifier")
    uint32_t("drmFormatModifierPlaneCount")
    VkFormatFeatureFlags("drmFormatModifierTilingFeatures")
}

val VkDrmFormatModifierPropertiesListEXT = struct(Module.VULKAN, "VkDrmFormatModifierPropertiesListEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    AutoSize("pDrmFormatModifierProperties", optional = true)..uint32_t("drmFormatModifierCount")
    nullable..VkDrmFormatModifierPropertiesEXT.p("pDrmFormatModifierProperties")
}

val VkPhysicalDeviceImageDrmFormatModifierInfoEXT = struct(Module.VULKAN, "VkPhysicalDeviceImageDrmFormatModifierInfoEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint64_t("drmFormatModifier")
    VkSharingMode("sharingMode")
    AutoSize("pQueueFamilyIndices", optional = true)..uint32_t("queueFamilyIndexCount")
    nullable..uint32_t.const.p("pQueueFamilyIndices")
}

val VkImageDrmFormatModifierListCreateInfoEXT = struct(Module.VULKAN, "VkImageDrmFormatModifierListCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pDrmFormatModifiers")..uint32_t("drmFormatModifierCount")
    uint64_t.const.p("pDrmFormatModifiers")
}

val VkImageDrmFormatModifierExplicitCreateInfoEXT = struct(Module.VULKAN, "VkImageDrmFormatModifierExplicitCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint64_t("drmFormatModifier")
    AutoSize("pPlaneLayouts")..uint32_t("drmFormatModifierPlaneCount")
    VkSubresourceLayout.const.p("pPlaneLayouts")
}

val VkImageDrmFormatModifierPropertiesEXT = struct(Module.VULKAN, "VkImageDrmFormatModifierPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint64_t("drmFormatModifier")
}

val VkDrmFormatModifierProperties2EXT = struct(Module.VULKAN, "VkDrmFormatModifierProperties2EXT", mutable = false) {
    uint64_t("drmFormatModifier")
    uint32_t("drmFormatModifierPlaneCount")
    VkFormatFeatureFlags2("drmFormatModifierTilingFeatures")
}

val VkDrmFormatModifierPropertiesList2EXT = struct(Module.VULKAN, "VkDrmFormatModifierPropertiesList2EXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    AutoSize("pDrmFormatModifierProperties", optional = true)..uint32_t("drmFormatModifierCount")
    nullable..VkDrmFormatModifierProperties2EXT.p("pDrmFormatModifierProperties")
}

val VkValidationCacheCreateInfoEXT = struct(Module.VULKAN, "VkValidationCacheCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkValidationCacheCreateFlagsEXT("flags")
    AutoSize("pInitialData", optional = true)..size_t("initialDataSize")
    void.const.p("pInitialData")
}

val VkShaderModuleValidationCacheCreateInfoEXT = struct(Module.VULKAN, "VkShaderModuleValidationCacheCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkValidationCacheEXT("validationCache")
}

val VkDescriptorSetLayoutBindingFlagsCreateInfoEXT = struct(Module.VULKAN, "VkDescriptorSetLayoutBindingFlagsCreateInfoEXT", alias = VkDescriptorSetLayoutBindingFlagsCreateInfo) {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pBindingFlags", optional = true)..uint32_t("bindingCount")
    nullable..VkDescriptorBindingFlags.const.p("pBindingFlags")
}

val VkPhysicalDeviceDescriptorIndexingFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorIndexingFeaturesEXT", alias = VkPhysicalDeviceDescriptorIndexingFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderInputAttachmentArrayDynamicIndexing")
    VkBool32("shaderUniformTexelBufferArrayDynamicIndexing")
    VkBool32("shaderStorageTexelBufferArrayDynamicIndexing")
    VkBool32("shaderUniformBufferArrayNonUniformIndexing")
    VkBool32("shaderSampledImageArrayNonUniformIndexing")
    VkBool32("shaderStorageBufferArrayNonUniformIndexing")
    VkBool32("shaderStorageImageArrayNonUniformIndexing")
    VkBool32("shaderInputAttachmentArrayNonUniformIndexing")
    VkBool32("shaderUniformTexelBufferArrayNonUniformIndexing")
    VkBool32("shaderStorageTexelBufferArrayNonUniformIndexing")
    VkBool32("descriptorBindingUniformBufferUpdateAfterBind")
    VkBool32("descriptorBindingSampledImageUpdateAfterBind")
    VkBool32("descriptorBindingStorageImageUpdateAfterBind")
    VkBool32("descriptorBindingStorageBufferUpdateAfterBind")
    VkBool32("descriptorBindingUniformTexelBufferUpdateAfterBind")
    VkBool32("descriptorBindingStorageTexelBufferUpdateAfterBind")
    VkBool32("descriptorBindingUpdateUnusedWhilePending")
    VkBool32("descriptorBindingPartiallyBound")
    VkBool32("descriptorBindingVariableDescriptorCount")
    VkBool32("runtimeDescriptorArray")
}

val VkPhysicalDeviceDescriptorIndexingPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorIndexingPropertiesEXT", mutable = false, alias = VkPhysicalDeviceDescriptorIndexingProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxUpdateAfterBindDescriptorsInAllPools")
    VkBool32("shaderUniformBufferArrayNonUniformIndexingNative")
    VkBool32("shaderSampledImageArrayNonUniformIndexingNative")
    VkBool32("shaderStorageBufferArrayNonUniformIndexingNative")
    VkBool32("shaderStorageImageArrayNonUniformIndexingNative")
    VkBool32("shaderInputAttachmentArrayNonUniformIndexingNative")
    VkBool32("robustBufferAccessUpdateAfterBind")
    VkBool32("quadDivergentImplicitLod")
    uint32_t("maxPerStageDescriptorUpdateAfterBindSamplers")
    uint32_t("maxPerStageDescriptorUpdateAfterBindUniformBuffers")
    uint32_t("maxPerStageDescriptorUpdateAfterBindStorageBuffers")
    uint32_t("maxPerStageDescriptorUpdateAfterBindSampledImages")
    uint32_t("maxPerStageDescriptorUpdateAfterBindStorageImages")
    uint32_t("maxPerStageDescriptorUpdateAfterBindInputAttachments")
    uint32_t("maxPerStageUpdateAfterBindResources")
    uint32_t("maxDescriptorSetUpdateAfterBindSamplers")
    uint32_t("maxDescriptorSetUpdateAfterBindUniformBuffers")
    uint32_t("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageBuffers")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic")
    uint32_t("maxDescriptorSetUpdateAfterBindSampledImages")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageImages")
    uint32_t("maxDescriptorSetUpdateAfterBindInputAttachments")
}

val VkDescriptorSetVariableDescriptorCountAllocateInfoEXT = struct(Module.VULKAN, "VkDescriptorSetVariableDescriptorCountAllocateInfoEXT", alias = VkDescriptorSetVariableDescriptorCountAllocateInfo) {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pDescriptorCounts", optional = true)..uint32_t("descriptorSetCount")
    uint32_t.const.p("pDescriptorCounts")
}

val VkDescriptorSetVariableDescriptorCountLayoutSupportEXT = struct(Module.VULKAN, "VkDescriptorSetVariableDescriptorCountLayoutSupportEXT", mutable = false, alias = VkDescriptorSetVariableDescriptorCountLayoutSupport) {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxVariableDescriptorCount")
}

val VkPhysicalDevicePortabilitySubsetFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevicePortabilitySubsetFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("constantAlphaColorBlendFactors")
    VkBool32("events")
    VkBool32("imageViewFormatReinterpretation")
    VkBool32("imageViewFormatSwizzle")
    VkBool32("imageView2DOn3DImage")
    VkBool32("multisampleArrayImage")
    VkBool32("mutableComparisonSamplers")
    VkBool32("pointPolygons")
    VkBool32("samplerMipLodBias")
    VkBool32("separateStencilMaskRef")
    VkBool32("shaderSampleRateInterpolationFunctions")
    VkBool32("tessellationIsolines")
    VkBool32("tessellationPointMode")
    VkBool32("triangleFans")
    VkBool32("vertexAttributeAccessBeyondStride")
}

val VkPhysicalDevicePortabilitySubsetPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDevicePortabilitySubsetPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("minVertexInputBindingStrideAlignment")
}

val VkShadingRatePaletteNV = struct(Module.VULKAN, "VkShadingRatePaletteNV") {
    AutoSize("pShadingRatePaletteEntries")..uint32_t("shadingRatePaletteEntryCount")
    VkShadingRatePaletteEntryNV.const.p("pShadingRatePaletteEntries")
}

val VkPipelineViewportShadingRateImageStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineViewportShadingRateImageStateCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("shadingRateImageEnable")
    AutoSize("pShadingRatePalettes", optional = true)..uint32_t("viewportCount")
    nullable..VkShadingRatePaletteNV.const.p("pShadingRatePalettes")
}

val VkPhysicalDeviceShadingRateImageFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceShadingRateImageFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shadingRateImage")
    VkBool32("shadingRateCoarseSampleOrder")
}

val VkPhysicalDeviceShadingRateImagePropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceShadingRateImagePropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExtent2D("shadingRateTexelSize")
    uint32_t("shadingRatePaletteSize")
    uint32_t("shadingRateMaxCoarseSamples")
}

val VkCoarseSampleLocationNV = struct(Module.VULKAN, "VkCoarseSampleLocationNV") {
    uint32_t("pixelX")
    uint32_t("pixelY")
    uint32_t("sample")
}

val VkCoarseSampleOrderCustomNV = struct(Module.VULKAN, "VkCoarseSampleOrderCustomNV") {
    VkShadingRatePaletteEntryNV("shadingRate")
    uint32_t("sampleCount")
    AutoSize("pSampleLocations")..uint32_t("sampleLocationCount")
    VkCoarseSampleLocationNV.const.p("pSampleLocations")
}

val VkPipelineViewportCoarseSampleOrderStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineViewportCoarseSampleOrderStateCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkCoarseSampleOrderTypeNV("sampleOrderType")
    AutoSize("pCustomSampleOrders", optional = true)..uint32_t("customSampleOrderCount")
    VkCoarseSampleOrderCustomNV.const.p("pCustomSampleOrders")
}

val VkRayTracingShaderGroupCreateInfoNV = struct(Module.VULKAN, "VkRayTracingShaderGroupCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkRayTracingShaderGroupTypeKHR("type")
    uint32_t("generalShader")
    uint32_t("closestHitShader")
    uint32_t("anyHitShader")
    uint32_t("intersectionShader")
}

val VkRayTracingPipelineCreateInfoNV = struct(Module.VULKAN, "VkRayTracingPipelineCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV")..VkStructureType("sType")
    PointerSetter(
        "VkPipelineCreateFlags2CreateInfo", "VkPipelineCreateFlags2CreateInfoKHR", "VkPipelineCreationFeedbackCreateInfo", "VkPipelineCreationFeedbackCreateInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineCreateFlags("flags")
    AutoSize("pStages")..uint32_t("stageCount")
    VkPipelineShaderStageCreateInfo.const.p("pStages")
    AutoSize("pGroups")..uint32_t("groupCount")
    VkRayTracingShaderGroupCreateInfoNV.const.p("pGroups")
    uint32_t("maxRecursionDepth")
    VkPipelineLayout("layout")
    VkPipeline("basePipelineHandle")
    int32_t("basePipelineIndex")
}

val VkGeometryTrianglesNV = struct(Module.VULKAN, "VkGeometryTrianglesNV") {
    Expression("#STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBuffer("vertexData")
    VkDeviceSize("vertexOffset")
    uint32_t("vertexCount")
    VkDeviceSize("vertexStride")
    VkFormat("vertexFormat")
    VkBuffer("indexData")
    VkDeviceSize("indexOffset")
    uint32_t("indexCount")
    VkIndexType("indexType")
    VkBuffer("transformData")
    VkDeviceSize("transformOffset")
}

val VkGeometryAABBNV = struct(Module.VULKAN, "VkGeometryAABBNV") {
    Expression("#STRUCTURE_TYPE_GEOMETRY_AABB_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBuffer("aabbData")
    uint32_t("numAABBs")
    uint32_t("stride")
    VkDeviceSize("offset")
}

val VkGeometryDataNV = struct(Module.VULKAN, "VkGeometryDataNV") {
    VkGeometryTrianglesNV("triangles")
    VkGeometryAABBNV("aabbs")
}

val VkGeometryNV = struct(Module.VULKAN, "VkGeometryNV") {
    Expression("#STRUCTURE_TYPE_GEOMETRY_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkGeometryTypeKHR("geometryType")
    VkGeometryDataNV("geometry")
    VkGeometryFlagsKHR("flags")
}

val VkAccelerationStructureInfoNV = struct(Module.VULKAN, "VkAccelerationStructureInfoNV") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAccelerationStructureTypeNV("type")
    VkBuildAccelerationStructureFlagsNV("flags")
    uint32_t("instanceCount")
    AutoSize("pGeometries", optional = true)..uint32_t("geometryCount")
    VkGeometryNV.const.p("pGeometries")
}

val VkAccelerationStructureCreateInfoNV = struct(Module.VULKAN, "VkAccelerationStructureCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV")..VkStructureType("sType")
    PointerSetter(
        "VkOpaqueCaptureDescriptorDataCreateInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDeviceSize("compactedSize")
    VkAccelerationStructureInfoNV("info")
}

val VkBindAccelerationStructureMemoryInfoNV = struct(Module.VULKAN, "VkBindAccelerationStructureMemoryInfoNV") {
    Expression("#STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAccelerationStructureNV("accelerationStructure")
    VkDeviceMemory("memory")
    VkDeviceSize("memoryOffset")
    AutoSize("pDeviceIndices", optional = true)..uint32_t("deviceIndexCount")
    uint32_t.const.p("pDeviceIndices")
}

val VkWriteDescriptorSetAccelerationStructureNV = struct(Module.VULKAN, "VkWriteDescriptorSetAccelerationStructureNV") {
    Expression("#STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pAccelerationStructures", optional = true)..uint32_t("accelerationStructureCount")
    nullable..VkAccelerationStructureNV.const.p("pAccelerationStructures")
}

val VkAccelerationStructureMemoryRequirementsInfoNV = struct(Module.VULKAN, "VkAccelerationStructureMemoryRequirementsInfoNV") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAccelerationStructureMemoryRequirementsTypeNV("type")
    VkAccelerationStructureNV("accelerationStructure")
}

val VkPhysicalDeviceRayTracingPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("shaderGroupHandleSize")
    uint32_t("maxRecursionDepth")
    uint32_t("maxShaderGroupStride")
    uint32_t("shaderGroupBaseAlignment")
    uint64_t("maxGeometryCount")
    uint64_t("maxInstanceCount")
    uint64_t("maxTriangleCount")
    uint32_t("maxDescriptorSetAccelerationStructures")
}

val VkTransformMatrixNV = struct(Module.VULKAN, "VkTransformMatrixNV", alias = VkTransformMatrixKHR) {
    float("matrix")[3][4]
}

val VkAabbPositionsNV = struct(Module.VULKAN, "VkAabbPositionsNV", alias = VkAabbPositionsKHR) {
    float("minX")
    float("minY")
    float("minZ")
    float("maxX")
    float("maxY")
    float("maxZ")
}

val VkAccelerationStructureInstanceNV = struct(Module.VULKAN, "VkAccelerationStructureInstanceNV", alias = VkAccelerationStructureInstanceKHR) {
    VkTransformMatrixKHR("transform")
    uint32_t("instanceCustomIndex", bits = 24)
    uint32_t("mask", bits = 8)
    uint32_t("instanceShaderBindingTableRecordOffset", bits = 24)
    VkGeometryInstanceFlagsKHR("flags", bits = 8)
    uint64_t("accelerationStructureReference")
}

val VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("representativeFragmentTest")
}

val VkPipelineRepresentativeFragmentTestStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineRepresentativeFragmentTestStateCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("representativeFragmentTestEnable")
}

val VkPhysicalDeviceMaintenance3PropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance3PropertiesKHR", mutable = false, alias = VkPhysicalDeviceMaintenance3Properties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxPerSetDescriptors")
    VkDeviceSize("maxMemoryAllocationSize")
}

val VkDescriptorSetLayoutSupportKHR = struct(Module.VULKAN, "VkDescriptorSetLayoutSupportKHR", mutable = false, alias = VkDescriptorSetLayoutSupport) {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("supported")
}

val VkPhysicalDeviceImageViewImageFormatInfoEXT = struct(Module.VULKAN, "VkPhysicalDeviceImageViewImageFormatInfoEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkImageViewType("imageViewType")
}

val VkFilterCubicImageViewImageFormatPropertiesEXT = struct(Module.VULKAN, "VkFilterCubicImageViewImageFormatPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("filterCubic")
    VkBool32("filterCubicMinmax")
}

val VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_CONVERSION_FEATURES_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("cooperativeMatrixConversion")
}

val VkDeviceQueueGlobalPriorityCreateInfoEXT = struct(Module.VULKAN, "VkDeviceQueueGlobalPriorityCreateInfoEXT", alias = VkDeviceQueueGlobalPriorityCreateInfo) {
    Expression("#STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkQueueGlobalPriority("globalPriority")
}

val VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR", alias = VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderSubgroupExtendedTypes")
}

val VkPhysicalDevice8BitStorageFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevice8BitStorageFeaturesKHR", alias = VkPhysicalDevice8BitStorageFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("storageBuffer8BitAccess")
    VkBool32("uniformAndStorageBuffer8BitAccess")
    VkBool32("storagePushConstant8")
}

val VkImportMemoryHostPointerInfoEXT = struct(Module.VULKAN, "VkImportMemoryHostPointerInfoEXT") {
    Expression("#STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlagBits("handleType")
    opaque_p("pHostPointer")
}

val VkMemoryHostPointerPropertiesEXT = struct(Module.VULKAN, "VkMemoryHostPointerPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("memoryTypeBits")
}

val VkPhysicalDeviceExternalMemoryHostPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceExternalMemoryHostPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceSize("minImportedHostPointerAlignment")
}

val VkPhysicalDeviceShaderAtomicInt64FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderAtomicInt64FeaturesKHR", alias = VkPhysicalDeviceShaderAtomicInt64Features) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderBufferInt64Atomics")
    VkBool32("shaderSharedInt64Atomics")
}

val VkPhysicalDeviceShaderClockFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderClockFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderSubgroupClock")
    VkBool32("shaderDeviceClock")
}

val VkPipelineCompilerControlCreateInfoAMD = struct(Module.VULKAN, "VkPipelineCompilerControlCreateInfoAMD") {
    Expression("#STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineCompilerControlFlagsAMD("compilerControlFlags")
}

val _VkCalibratedTimestampInfoKHR = struct(Module.VULKAN, "VkCalibratedTimestampInfoKHR")
val VkCalibratedTimestampInfoEXT = struct(Module.VULKAN, "VkCalibratedTimestampInfoEXT", alias = _VkCalibratedTimestampInfoKHR) {
    Expression("#STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkTimeDomainKHR("timeDomain")
}

val VkCalibratedTimestampInfoKHR = struct(Module.VULKAN, "VkCalibratedTimestampInfoKHR") {
    Expression("#STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkSwapchainCalibratedTimestampInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkTimeDomainKHR("timeDomain")
}

val VkPhysicalDeviceShaderCorePropertiesAMD = struct(Module.VULKAN, "VkPhysicalDeviceShaderCorePropertiesAMD", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("shaderEngineCount")
    uint32_t("shaderArraysPerEngineCount")
    uint32_t("computeUnitsPerShaderArray")
    uint32_t("simdPerComputeUnit")
    uint32_t("wavefrontsPerSimd")
    uint32_t("wavefrontSize")
    uint32_t("sgprsPerSimd")
    uint32_t("minSgprAllocation")
    uint32_t("maxSgprAllocation")
    uint32_t("sgprAllocationGranularity")
    uint32_t("vgprsPerSimd")
    uint32_t("minVgprAllocation")
    uint32_t("maxVgprAllocation")
    uint32_t("vgprAllocationGranularity")
}

val VkVideoDecodeH265ProfileInfoKHR = struct(Module.VULKAN, "VkVideoDecodeH265ProfileInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoH265ProfileIdc("stdProfileIdc")
}

val VkVideoDecodeH265CapabilitiesKHR = struct(Module.VULKAN, "VkVideoDecodeH265CapabilitiesKHR", mutable = false) {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_H265_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    StdVideoH265LevelIdc("maxLevelIdc")
}

val VkVideoDecodeH265SessionParametersAddInfoKHR = struct(Module.VULKAN, "VkVideoDecodeH265SessionParametersAddInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pStdVPSs", optional = true)..uint32_t("stdVPSCount")
    StdVideoH265VideoParameterSet.const.p("pStdVPSs")
    AutoSize("pStdSPSs", optional = true)..uint32_t("stdSPSCount")
    StdVideoH265SequenceParameterSet.const.p("pStdSPSs")
    AutoSize("pStdPPSs", optional = true)..uint32_t("stdPPSCount")
    StdVideoH265PictureParameterSet.const.p("pStdPPSs")
}

val VkVideoDecodeH265SessionParametersCreateInfoKHR = struct(Module.VULKAN, "VkVideoDecodeH265SessionParametersCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("maxStdVPSCount")
    uint32_t("maxStdSPSCount")
    uint32_t("maxStdPPSCount")
    nullable..VkVideoDecodeH265SessionParametersAddInfoKHR.const.p("pParametersAddInfo")
}

val VkVideoDecodeH265PictureInfoKHR = struct(Module.VULKAN, "VkVideoDecodeH265PictureInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoDecodeH265PictureInfo.const.p("pStdPictureInfo")
    AutoSize("pSliceSegmentOffsets")..uint32_t("sliceSegmentCount")
    uint32_t.const.p("pSliceSegmentOffsets")
}

val VkVideoDecodeH265DpbSlotInfoKHR = struct(Module.VULKAN, "VkVideoDecodeH265DpbSlotInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoDecodeH265ReferenceInfo.const.p("pStdReferenceInfo")
}

val VkDeviceQueueGlobalPriorityCreateInfoKHR = struct(Module.VULKAN, "VkDeviceQueueGlobalPriorityCreateInfoKHR", alias = VkDeviceQueueGlobalPriorityCreateInfo) {
    Expression("#STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkQueueGlobalPriority("globalPriority")
}

val VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR", alias = VkPhysicalDeviceGlobalPriorityQueryFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("globalPriorityQuery")
}

val VkQueueFamilyGlobalPriorityPropertiesKHR = struct(Module.VULKAN, "VkQueueFamilyGlobalPriorityPropertiesKHR", mutable = false, alias = VkQueueFamilyGlobalPriorityProperties) {
    javaImport("static org.lwjgl.vulkan.VK14.*")
    Expression("#STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    AutoSize("priorities")..uint32_t("priorityCount")
    VkQueueGlobalPriority("priorities")["VK_MAX_GLOBAL_PRIORITY_SIZE"]
}

val VkDeviceMemoryOverallocationCreateInfoAMD = struct(Module.VULKAN, "VkDeviceMemoryOverallocationCreateInfoAMD") {
    Expression("#STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkMemoryOverallocationBehaviorAMD("overallocationBehavior")
}

val VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxVertexAttribDivisor")
}

val VkVertexInputBindingDivisorDescriptionEXT = struct(Module.VULKAN, "VkVertexInputBindingDivisorDescriptionEXT", alias = VkVertexInputBindingDivisorDescription) {
    uint32_t("binding")
    uint32_t("divisor")
}

val VkPipelineVertexInputDivisorStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineVertexInputDivisorStateCreateInfoEXT", alias = VkPipelineVertexInputDivisorStateCreateInfo) {
    Expression("#STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pVertexBindingDivisors")..uint32_t("vertexBindingDivisorCount")
    VkVertexInputBindingDivisorDescription.const.p("pVertexBindingDivisors")
}

val VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT", alias = VkPhysicalDeviceVertexAttributeDivisorFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("vertexAttributeInstanceRateDivisor")
    VkBool32("vertexAttributeInstanceRateZeroDivisor")
}

val VkPipelineCreationFeedbackCreateInfoEXT = struct(Module.VULKAN, "VkPipelineCreationFeedbackCreateInfoEXT", alias = VkPipelineCreationFeedbackCreateInfo) {
    Expression("#STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineCreationFeedback.p("pPipelineCreationFeedback")
    AutoSize("pPipelineStageCreationFeedbacks", optional = true)..uint32_t("pipelineStageCreationFeedbackCount")
    VkPipelineCreationFeedback.p("pPipelineStageCreationFeedbacks")
}

val VkPipelineCreationFeedbackEXT = struct(Module.VULKAN, "VkPipelineCreationFeedbackEXT", mutable = false, alias = VkPipelineCreationFeedback) {
    VkPipelineCreationFeedbackFlags("flags")
    uint64_t("duration")
}

val VkConformanceVersionKHR = struct(Module.VULKAN, "VkConformanceVersionKHR", alias = VkConformanceVersion) {
    uint8_t("major")
    uint8_t("minor")
    uint8_t("subminor")
    uint8_t("patch")
}

val VkPhysicalDeviceDriverPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceDriverPropertiesKHR", mutable = false, alias = VkPhysicalDeviceDriverProperties) {
    javaImport("static org.lwjgl.vulkan.VK12.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDriverId("driverID")
    charUTF8("driverName")["VK_MAX_DRIVER_NAME_SIZE"]
    charUTF8("driverInfo")["VK_MAX_DRIVER_INFO_SIZE"]
    VkConformanceVersion("conformanceVersion")
}

val VkPhysicalDeviceFloatControlsPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceFloatControlsPropertiesKHR", mutable = false, alias = VkPhysicalDeviceFloatControlsProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkShaderFloatControlsIndependence("denormBehaviorIndependence")
    VkShaderFloatControlsIndependence("roundingModeIndependence")
    VkBool32("shaderSignedZeroInfNanPreserveFloat16")
    VkBool32("shaderSignedZeroInfNanPreserveFloat32")
    VkBool32("shaderSignedZeroInfNanPreserveFloat64")
    VkBool32("shaderDenormPreserveFloat16")
    VkBool32("shaderDenormPreserveFloat32")
    VkBool32("shaderDenormPreserveFloat64")
    VkBool32("shaderDenormFlushToZeroFloat16")
    VkBool32("shaderDenormFlushToZeroFloat32")
    VkBool32("shaderDenormFlushToZeroFloat64")
    VkBool32("shaderRoundingModeRTEFloat16")
    VkBool32("shaderRoundingModeRTEFloat32")
    VkBool32("shaderRoundingModeRTEFloat64")
    VkBool32("shaderRoundingModeRTZFloat16")
    VkBool32("shaderRoundingModeRTZFloat32")
    VkBool32("shaderRoundingModeRTZFloat64")
}

val VkSubpassDescriptionDepthStencilResolveKHR = struct(Module.VULKAN, "VkSubpassDescriptionDepthStencilResolveKHR", alias = VkSubpassDescriptionDepthStencilResolve) {
    Expression("#STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkResolveModeFlagBits("depthResolveMode")
    VkResolveModeFlagBits("stencilResolveMode")
    nullable..VkAttachmentReference2.const.p("pDepthStencilResolveAttachment")
}

val VkPhysicalDeviceDepthStencilResolvePropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceDepthStencilResolvePropertiesKHR", mutable = false, alias = VkPhysicalDeviceDepthStencilResolveProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkResolveModeFlags("supportedDepthResolveModes")
    VkResolveModeFlags("supportedStencilResolveModes")
    VkBool32("independentResolveNone")
    VkBool32("independentResolve")
}

val _VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR")
val VkPhysicalDeviceComputeShaderDerivativesFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceComputeShaderDerivativesFeaturesNV", alias = _VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("computeDerivativeGroupQuads")
    VkBool32("computeDerivativeGroupLinear")
}

val VkPhysicalDeviceMeshShaderFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceMeshShaderFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("taskShader")
    VkBool32("meshShader")
}

val VkPhysicalDeviceMeshShaderPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceMeshShaderPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxDrawMeshTasksCount")
    uint32_t("maxTaskWorkGroupInvocations")
    uint32_t("maxTaskWorkGroupSize")[3]
    uint32_t("maxTaskTotalMemorySize")
    uint32_t("maxTaskOutputCount")
    uint32_t("maxMeshWorkGroupInvocations")
    uint32_t("maxMeshWorkGroupSize")[3]
    uint32_t("maxMeshTotalMemorySize")
    uint32_t("maxMeshOutputVertices")
    uint32_t("maxMeshOutputPrimitives")
    uint32_t("maxMeshMultiviewViewCount")
    uint32_t("meshOutputPerVertexGranularity")
    uint32_t("meshOutputPerPrimitiveGranularity")
}

val VkDrawMeshTasksIndirectCommandNV = struct(Module.VULKAN, "VkDrawMeshTasksIndirectCommandNV") {
    uint32_t("taskCount")
    uint32_t("firstTask")
}

val _VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR")
val VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV", alias = _VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("fragmentShaderBarycentric")
}

val VkPhysicalDeviceShaderImageFootprintFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceShaderImageFootprintFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("imageFootprint")
}

val VkPipelineViewportExclusiveScissorStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineViewportExclusiveScissorStateCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pExclusiveScissors", optional = true)..uint32_t("exclusiveScissorCount")
    nullable..VkRect2D.const.p("pExclusiveScissors")
}

val VkPhysicalDeviceExclusiveScissorFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceExclusiveScissorFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("exclusiveScissor")
}

val VkQueueFamilyCheckpointPropertiesNV = struct(Module.VULKAN, "VkQueueFamilyCheckpointPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPipelineStageFlags("checkpointExecutionStageMask")
}

val VkCheckpointDataNV = struct(Module.VULKAN, "VkCheckpointDataNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_CHECKPOINT_DATA_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPipelineStageFlagBits("stage")
    nullable..opaque_p("pCheckpointMarker")
}

val VkQueueFamilyCheckpointProperties2NV = struct(Module.VULKAN, "VkQueueFamilyCheckpointProperties2NV", mutable = false) {
    Expression("#STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPipelineStageFlags2("checkpointExecutionStageMask")
}

val VkCheckpointData2NV = struct(Module.VULKAN, "VkCheckpointData2NV", mutable = false) {
    Expression("#STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPipelineStageFlags2("stage")
    nullable..opaque_p("pCheckpointMarker")
}

val VkPhysicalDeviceTimelineSemaphoreFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceTimelineSemaphoreFeaturesKHR", alias = VkPhysicalDeviceTimelineSemaphoreFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("timelineSemaphore")
}

val VkPhysicalDeviceTimelineSemaphorePropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceTimelineSemaphorePropertiesKHR", mutable = false, alias = VkPhysicalDeviceTimelineSemaphoreProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint64_t("maxTimelineSemaphoreValueDifference")
}

val VkSemaphoreTypeCreateInfoKHR = struct(Module.VULKAN, "VkSemaphoreTypeCreateInfoKHR", alias = VkSemaphoreTypeCreateInfo) {
    Expression("#STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSemaphoreType("semaphoreType")
    uint64_t("initialValue")
}

val VkTimelineSemaphoreSubmitInfoKHR = struct(Module.VULKAN, "VkTimelineSemaphoreSubmitInfoKHR", alias = VkTimelineSemaphoreSubmitInfo) {
    Expression("#STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pWaitSemaphoreValues", optional = true)..uint32_t("waitSemaphoreValueCount")
    nullable..uint64_t.const.p("pWaitSemaphoreValues")
    AutoSize("pSignalSemaphoreValues", optional = true)..uint32_t("signalSemaphoreValueCount")
    nullable..uint64_t.const.p("pSignalSemaphoreValues")
}

val VkSemaphoreWaitInfoKHR = struct(Module.VULKAN, "VkSemaphoreWaitInfoKHR", alias = VkSemaphoreWaitInfo) {
    Expression("#STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSemaphoreWaitFlags("flags")
    AutoSize("pSemaphores", "pValues")..uint32_t("semaphoreCount")
    VkSemaphore.const.p("pSemaphores")
    uint64_t.const.p("pValues")
}

val VkSemaphoreSignalInfoKHR = struct(Module.VULKAN, "VkSemaphoreSignalInfoKHR", alias = VkSemaphoreSignalInfo) {
    Expression("#STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSemaphore("semaphore")
    uint64_t("value")
}

val VkPhysicalDevicePresentTimingFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDevicePresentTimingFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_TIMING_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("presentTiming")
    VkBool32("presentAtAbsoluteTime")
    VkBool32("presentAtRelativeTime")
}

val VkPresentTimingSurfaceCapabilitiesEXT = struct(Module.VULKAN, "VkPresentTimingSurfaceCapabilitiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("presentTimingSupported")
    VkBool32("presentAtAbsoluteTimeSupported")
    VkBool32("presentAtRelativeTimeSupported")
    VkPresentStageFlagsEXT("presentStageQueries")
}

val VkSwapchainCalibratedTimestampInfoEXT = struct(Module.VULKAN, "VkSwapchainCalibratedTimestampInfoEXT") {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSwapchainKHR("swapchain")
    VkPresentStageFlagsEXT("presentStage")
    uint64_t("timeDomainId")
}

val VkSwapchainTimingPropertiesEXT = struct(Module.VULKAN, "VkSwapchainTimingPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_TIMING_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint64_t("refreshDuration")
    uint64_t("refreshInterval")
}

val VkSwapchainTimeDomainPropertiesEXT = struct(Module.VULKAN, "VkSwapchainTimeDomainPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    AutoSize("pTimeDomains", "pTimeDomainIds", optional = true)..uint32_t("timeDomainCount")
    nullable..VkTimeDomainKHR.p("pTimeDomains")
    nullable..uint64_t.p("pTimeDomainIds")
}

val VkPastPresentationTimingInfoEXT = struct(Module.VULKAN, "VkPastPresentationTimingInfoEXT") {
    Expression("#STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPastPresentationTimingFlagsEXT("flags")
    VkSwapchainKHR("swapchain")
}

val VkPresentStageTimeEXT = struct(Module.VULKAN, "VkPresentStageTimeEXT", mutable = false) {
    VkPresentStageFlagsEXT("stage")
    uint64_t("time")
}

val VkPastPresentationTimingEXT = struct(Module.VULKAN, "VkPastPresentationTimingEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint64_t("presentId")
    uint64_t("targetTime")
    AutoSize("pPresentStages")..uint32_t("presentStageCount")
    VkPresentStageTimeEXT.p("pPresentStages")
    VkTimeDomainKHR("timeDomain")
    uint64_t("timeDomainId")
    VkBool32("reportComplete")
}

val VkPastPresentationTimingPropertiesEXT = struct(Module.VULKAN, "VkPastPresentationTimingPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint64_t("timingPropertiesCounter")
    uint64_t("timeDomainsCounter")
    AutoSize("pPresentationTimings")..uint32_t("presentationTimingCount")
    VkPastPresentationTimingEXT.p("pPresentationTimings")
}

val VkPresentTimingInfoEXT = struct(Module.VULKAN, "VkPresentTimingInfoEXT") {
    Expression("#STRUCTURE_TYPE_PRESENT_TIMING_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPresentTimingInfoFlagsEXT("flags")
    uint64_t("targetTime")
    uint64_t("timeDomainId")
    VkPresentStageFlagsEXT("presentStageQueries")
    VkPresentStageFlagsEXT("targetTimeDomainPresentStage")
}

val VkPresentTimingsInfoEXT = struct(Module.VULKAN, "VkPresentTimingsInfoEXT") {
    Expression("#STRUCTURE_TYPE_PRESENT_TIMINGS_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pTimingInfos", optional = true)..uint32_t("swapchainCount")
    nullable..VkPresentTimingInfoEXT.const.p("pTimingInfos")
}

val VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL = struct(Module.VULKAN, "VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderIntegerFunctions2")
}

val VkPerformanceValueDataINTEL = union(Module.VULKAN, "VkPerformanceValueDataINTEL") {
    uint32_t("value32")
    uint64_t("value64")
    float("valueFloat")
    VkBool32("valueBool")
    charUTF8.const.p("valueString")
}

val VkPerformanceValueINTEL = struct(Module.VULKAN, "VkPerformanceValueINTEL", mutable = false) {
    VkPerformanceValueTypeINTEL("type")
    VkPerformanceValueDataINTEL("data")
}

val VkInitializePerformanceApiInfoINTEL = struct(Module.VULKAN, "VkInitializePerformanceApiInfoINTEL") {
    Expression("#STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    nullable..opaque_p("pUserData")
}

val _VkQueryPoolPerformanceQueryCreateInfoINTEL = struct(Module.VULKAN, "VkQueryPoolPerformanceQueryCreateInfoINTEL")
val VkQueryPoolCreateInfoINTEL = struct(Module.VULKAN, "VkQueryPoolCreateInfoINTEL", alias = _VkQueryPoolPerformanceQueryCreateInfoINTEL) {
    Expression("#STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkQueryPoolSamplingModeINTEL("performanceCountersSampling")
}

val VkQueryPoolPerformanceQueryCreateInfoINTEL = struct(Module.VULKAN, "VkQueryPoolPerformanceQueryCreateInfoINTEL") {
    Expression("#STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkQueryPoolSamplingModeINTEL("performanceCountersSampling")
}

val VkPerformanceMarkerInfoINTEL = struct(Module.VULKAN, "VkPerformanceMarkerInfoINTEL") {
    Expression("#STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint64_t("marker")
}

val VkPerformanceStreamMarkerInfoINTEL = struct(Module.VULKAN, "VkPerformanceStreamMarkerInfoINTEL") {
    Expression("#STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("marker")
}

val VkPerformanceOverrideInfoINTEL = struct(Module.VULKAN, "VkPerformanceOverrideInfoINTEL") {
    Expression("#STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPerformanceOverrideTypeINTEL("type")
    VkBool32("enable")
    uint64_t("parameter")
}

val VkPerformanceConfigurationAcquireInfoINTEL = struct(Module.VULKAN, "VkPerformanceConfigurationAcquireInfoINTEL") {
    Expression("#STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPerformanceConfigurationTypeINTEL("type")
}

val VkPhysicalDeviceVulkanMemoryModelFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVulkanMemoryModelFeaturesKHR", alias = VkPhysicalDeviceVulkanMemoryModelFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("vulkanMemoryModel")
    VkBool32("vulkanMemoryModelDeviceScope")
    VkBool32("vulkanMemoryModelAvailabilityVisibilityChains")
}

val VkPhysicalDevicePCIBusInfoPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDevicePCIBusInfoPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("pciDomain")
    uint32_t("pciBus")
    uint32_t("pciDevice")
    uint32_t("pciFunction")
}

val VkDisplayNativeHdrSurfaceCapabilitiesAMD = struct(Module.VULKAN, "VkDisplayNativeHdrSurfaceCapabilitiesAMD", mutable = false) {
    Expression("#STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("localDimmingSupport")
}

val VkSwapchainDisplayNativeHdrCreateInfoAMD = struct(Module.VULKAN, "VkSwapchainDisplayNativeHdrCreateInfoAMD") {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("localDimmingEnable")
}

val VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR", alias = VkPhysicalDeviceShaderTerminateInvocationFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderTerminateInvocation")
}

val VkMetalSurfaceCreateInfoEXT = struct(Module.VULKAN, "VkMetalSurfaceCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkMetalSurfaceCreateFlagsEXT("flags")
    nullable..CAMetalLayer.const.p("pLayer")
}

val VkPhysicalDeviceFragmentDensityMapFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMapFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("fragmentDensityMap")
    VkBool32("fragmentDensityMapDynamic")
    VkBool32("fragmentDensityMapNonSubsampledImages")
}

val VkPhysicalDeviceFragmentDensityMapPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMapPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExtent2D("minFragmentDensityTexelSize")
    VkExtent2D("maxFragmentDensityTexelSize")
    VkBool32("fragmentDensityInvocations")
}

val VkRenderPassFragmentDensityMapCreateInfoEXT = struct(Module.VULKAN, "VkRenderPassFragmentDensityMapCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAttachmentReference("fragmentDensityMapAttachment")
}

val VkRenderingFragmentDensityMapAttachmentInfoEXT = struct(Module.VULKAN, "VkRenderingFragmentDensityMapAttachmentInfoEXT") {
    Expression("#STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageView("imageView")
    VkImageLayout("imageLayout")
}

val VkPhysicalDeviceScalarBlockLayoutFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceScalarBlockLayoutFeaturesEXT", alias = VkPhysicalDeviceScalarBlockLayoutFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("scalarBlockLayout")
}

val VkPhysicalDeviceSubgroupSizeControlFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceSubgroupSizeControlFeaturesEXT", alias = VkPhysicalDeviceSubgroupSizeControlFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("subgroupSizeControl")
    VkBool32("computeFullSubgroups")
}

val VkPhysicalDeviceSubgroupSizeControlPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceSubgroupSizeControlPropertiesEXT", mutable = false, alias = VkPhysicalDeviceSubgroupSizeControlProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("minSubgroupSize")
    uint32_t("maxSubgroupSize")
    uint32_t("maxComputeWorkgroupSubgroups")
    VkShaderStageFlags("requiredSubgroupSizeStages")
}

val VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT = struct(Module.VULKAN, "VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT", alias = VkPipelineShaderStageRequiredSubgroupSizeCreateInfo) {
    Expression("#STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("requiredSubgroupSize")
}

val VkFragmentShadingRateAttachmentInfoKHR = struct(Module.VULKAN, "VkFragmentShadingRateAttachmentInfoKHR") {
    Expression("#STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    nullable..VkAttachmentReference2.const.p("pFragmentShadingRateAttachment")
    VkExtent2D("shadingRateAttachmentTexelSize")
}

val VkPipelineFragmentShadingRateStateCreateInfoKHR = struct(Module.VULKAN, "VkPipelineFragmentShadingRateStateCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExtent2D("fragmentSize")
    VkFragmentShadingRateCombinerOpKHR("combinerOps")[2]
}

val VkPhysicalDeviceFragmentShadingRateFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShadingRateFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("pipelineFragmentShadingRate")
    VkBool32("primitiveFragmentShadingRate")
    VkBool32("attachmentFragmentShadingRate")
}

val VkPhysicalDeviceFragmentShadingRatePropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShadingRatePropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExtent2D("minFragmentShadingRateAttachmentTexelSize")
    VkExtent2D("maxFragmentShadingRateAttachmentTexelSize")
    uint32_t("maxFragmentShadingRateAttachmentTexelSizeAspectRatio")
    VkBool32("primitiveFragmentShadingRateWithMultipleViewports")
    VkBool32("layeredShadingRateAttachments")
    VkBool32("fragmentShadingRateNonTrivialCombinerOps")
    VkExtent2D("maxFragmentSize")
    uint32_t("maxFragmentSizeAspectRatio")
    uint32_t("maxFragmentShadingRateCoverageSamples")
    VkSampleCountFlagBits("maxFragmentShadingRateRasterizationSamples")
    VkBool32("fragmentShadingRateWithShaderDepthStencilWrites")
    VkBool32("fragmentShadingRateWithSampleMask")
    VkBool32("fragmentShadingRateWithShaderSampleMask")
    VkBool32("fragmentShadingRateWithConservativeRasterization")
    VkBool32("fragmentShadingRateWithFragmentShaderInterlock")
    VkBool32("fragmentShadingRateWithCustomSampleLocations")
    VkBool32("fragmentShadingRateStrictMultiplyCombiner")
}

val VkPhysicalDeviceFragmentShadingRateKHR = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShadingRateKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkSampleCountFlags("sampleCounts")
    VkExtent2D("fragmentSize")
}

val VkRenderingFragmentShadingRateAttachmentInfoKHR = struct(Module.VULKAN, "VkRenderingFragmentShadingRateAttachmentInfoKHR") {
    Expression("#STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageView("imageView")
    VkImageLayout("imageLayout")
    VkExtent2D("shadingRateAttachmentTexelSize")
}

val VkPhysicalDeviceShaderCoreProperties2AMD = struct(Module.VULKAN, "VkPhysicalDeviceShaderCoreProperties2AMD", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2_AMD")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkShaderCorePropertiesFlagsAMD("shaderCoreFeatures")
    uint32_t("activeComputeUnitCount")
}

val VkPhysicalDeviceCoherentMemoryFeaturesAMD = struct(Module.VULKAN, "VkPhysicalDeviceCoherentMemoryFeaturesAMD") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("deviceCoherentMemory")
}

val VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR", alias = VkPhysicalDeviceDynamicRenderingLocalReadFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("dynamicRenderingLocalRead")
}

val VkRenderingAttachmentLocationInfoKHR = struct(Module.VULKAN, "VkRenderingAttachmentLocationInfoKHR", alias = VkRenderingAttachmentLocationInfo) {
    Expression("#STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pColorAttachmentLocations", optional = true)..uint32_t("colorAttachmentCount")
    nullable..uint32_t.const.p("pColorAttachmentLocations")
}

val VkRenderingInputAttachmentIndexInfoKHR = struct(Module.VULKAN, "VkRenderingInputAttachmentIndexInfoKHR", alias = VkRenderingInputAttachmentIndexInfo) {
    Expression("#STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pColorAttachmentInputIndices", optional = true)..uint32_t("colorAttachmentCount")
    nullable..uint32_t.const.p("pColorAttachmentInputIndices")
    nullable..uint32_t.const.p("pDepthInputAttachmentIndex")
    nullable..uint32_t.const.p("pStencilInputAttachmentIndex")
}

val VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderImageInt64Atomics")
    VkBool32("sparseImageInt64Atomics")
}

val VkPhysicalDeviceShaderQuadControlFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderQuadControlFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_QUAD_CONTROL_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderQuadControl")
}

val VkPhysicalDeviceMemoryBudgetPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMemoryBudgetPropertiesEXT", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceSize("heapBudget")["VK_MAX_MEMORY_HEAPS"]
    VkDeviceSize("heapUsage")["VK_MAX_MEMORY_HEAPS"]
}

val VkPhysicalDeviceMemoryPriorityFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMemoryPriorityFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("memoryPriority")
}

val VkMemoryPriorityAllocateInfoEXT = struct(Module.VULKAN, "VkMemoryPriorityAllocateInfoEXT") {
    Expression("#STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    float("priority")
}

val VkSurfaceProtectedCapabilitiesKHR = struct(Module.VULKAN, "VkSurfaceProtectedCapabilitiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_SURFACE_PROTECTED_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("supportsProtected")
}

val VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("dedicatedAllocationImageAliasing")
}

val VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR", alias = VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("separateDepthStencilLayouts")
}

val VkAttachmentReferenceStencilLayoutKHR = struct(Module.VULKAN, "VkAttachmentReferenceStencilLayoutKHR", alias = VkAttachmentReferenceStencilLayout) {
    Expression("#STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkImageLayout("stencilLayout")
}

val VkAttachmentDescriptionStencilLayoutKHR = struct(Module.VULKAN, "VkAttachmentDescriptionStencilLayoutKHR", alias = VkAttachmentDescriptionStencilLayout) {
    Expression("#STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkImageLayout("stencilInitialLayout")
    VkImageLayout("stencilFinalLayout")
}

val _VkPhysicalDeviceBufferDeviceAddressFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceBufferDeviceAddressFeaturesEXT")
val VkPhysicalDeviceBufferAddressFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceBufferAddressFeaturesEXT", alias = _VkPhysicalDeviceBufferDeviceAddressFeaturesEXT) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("bufferDeviceAddress")
    VkBool32("bufferDeviceAddressCaptureReplay")
    VkBool32("bufferDeviceAddressMultiDevice")
}

val VkPhysicalDeviceBufferDeviceAddressFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceBufferDeviceAddressFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("bufferDeviceAddress")
    VkBool32("bufferDeviceAddressCaptureReplay")
    VkBool32("bufferDeviceAddressMultiDevice")
}

val VkBufferDeviceAddressInfoEXT = struct(Module.VULKAN, "VkBufferDeviceAddressInfoEXT", alias = VkBufferDeviceAddressInfo) {
    Expression("#STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBuffer("buffer")
}

val VkBufferDeviceAddressCreateInfoEXT = struct(Module.VULKAN, "VkBufferDeviceAddressCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceAddress("deviceAddress")
}

val VkPhysicalDeviceToolPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceToolPropertiesEXT", mutable = false, alias = VkPhysicalDeviceToolProperties) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    charUTF8("name")["VK_MAX_EXTENSION_NAME_SIZE"]
    charUTF8("version")["VK_MAX_EXTENSION_NAME_SIZE"]
    VkToolPurposeFlags("purposes")
    charUTF8("description")["VK_MAX_DESCRIPTION_SIZE"]
    charUTF8("layer")["VK_MAX_EXTENSION_NAME_SIZE"]
}

val VkImageStencilUsageCreateInfoEXT = struct(Module.VULKAN, "VkImageStencilUsageCreateInfoEXT", alias = VkImageStencilUsageCreateInfo) {
    Expression("#STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageUsageFlags("stencilUsage")
}

val VkValidationFeaturesEXT = struct(Module.VULKAN, "VkValidationFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_VALIDATION_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pEnabledValidationFeatures", optional = true)..uint32_t("enabledValidationFeatureCount")
    VkValidationFeatureEnableEXT.const.p("pEnabledValidationFeatures")
    AutoSize("pDisabledValidationFeatures", optional = true)..uint32_t("disabledValidationFeatureCount")
    VkValidationFeatureDisableEXT.const.p("pDisabledValidationFeatures")
}

val VkPhysicalDevicePresentWaitFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevicePresentWaitFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("presentWait")
}

val VkCooperativeMatrixPropertiesNV = struct(Module.VULKAN, "VkCooperativeMatrixPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("MSize")
    uint32_t("NSize")
    uint32_t("KSize")
    VkComponentTypeNV("AType")
    VkComponentTypeNV("BType")
    VkComponentTypeNV("CType")
    VkComponentTypeNV("DType")
    VkScopeNV("scope")
}

val VkPhysicalDeviceCooperativeMatrixFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceCooperativeMatrixFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("cooperativeMatrix")
    VkBool32("cooperativeMatrixRobustBufferAccess")
}

val VkPhysicalDeviceCooperativeMatrixPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceCooperativeMatrixPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkShaderStageFlags("cooperativeMatrixSupportedStages")
}

val VkPhysicalDeviceCoverageReductionModeFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceCoverageReductionModeFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("coverageReductionMode")
}

val VkPipelineCoverageReductionStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineCoverageReductionStateCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineCoverageReductionStateCreateFlagsNV("flags")
    VkCoverageReductionModeNV("coverageReductionMode")
}

val VkFramebufferMixedSamplesCombinationNV = struct(Module.VULKAN, "VkFramebufferMixedSamplesCombinationNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkCoverageReductionModeNV("coverageReductionMode")
    VkSampleCountFlagBits("rasterizationSamples")
    VkSampleCountFlags("depthStencilSamples")
    VkSampleCountFlags("colorSamples")
}

val VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("fragmentShaderSampleInterlock")
    VkBool32("fragmentShaderPixelInterlock")
    VkBool32("fragmentShaderShadingRateInterlock")
}

val VkPhysicalDeviceYcbcrImageArraysFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceYcbcrImageArraysFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("ycbcrImageArrays")
}

val VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR", alias = VkPhysicalDeviceUniformBufferStandardLayoutFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("uniformBufferStandardLayout")
}

val VkPhysicalDeviceProvokingVertexFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceProvokingVertexFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("provokingVertexLast")
    VkBool32("transformFeedbackPreservesProvokingVertex")
}

val VkPhysicalDeviceProvokingVertexPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceProvokingVertexPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("provokingVertexModePerPipeline")
    VkBool32("transformFeedbackPreservesTriangleFanProvokingVertex")
}

val VkPipelineRasterizationProvokingVertexStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineRasterizationProvokingVertexStateCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkProvokingVertexModeEXT("provokingVertexMode")
}

val VkSurfaceFullScreenExclusiveInfoEXT = struct(Module.VULKAN, "VkSurfaceFullScreenExclusiveInfoEXT") {
    Expression("#STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkFullScreenExclusiveEXT("fullScreenExclusive")
}

val VkSurfaceCapabilitiesFullScreenExclusiveEXT = struct(Module.VULKAN, "VkSurfaceCapabilitiesFullScreenExclusiveEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("fullScreenExclusiveSupported")
}

val VkSurfaceFullScreenExclusiveWin32InfoEXT = struct(Module.VULKAN, "VkSurfaceFullScreenExclusiveWin32InfoEXT") {
    javaImport("org.lwjgl.system.windows.*")
    Expression("#STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    HMONITOR("hmonitor")
}

val VkHeadlessSurfaceCreateInfoEXT = struct(Module.VULKAN, "VkHeadlessSurfaceCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_HEADLESS_SURFACE_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkHeadlessSurfaceCreateFlagsEXT("flags")
}

val VkPhysicalDeviceBufferDeviceAddressFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceBufferDeviceAddressFeaturesKHR", alias = VkPhysicalDeviceBufferDeviceAddressFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("bufferDeviceAddress")
    VkBool32("bufferDeviceAddressCaptureReplay")
    VkBool32("bufferDeviceAddressMultiDevice")
}

val VkBufferDeviceAddressInfoKHR = struct(Module.VULKAN, "VkBufferDeviceAddressInfoKHR", alias = VkBufferDeviceAddressInfo) {
    Expression("#STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBuffer("buffer")
}

val VkBufferOpaqueCaptureAddressCreateInfoKHR = struct(Module.VULKAN, "VkBufferOpaqueCaptureAddressCreateInfoKHR", alias = VkBufferOpaqueCaptureAddressCreateInfo) {
    Expression("#STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint64_t("opaqueCaptureAddress")
}

val VkMemoryOpaqueCaptureAddressAllocateInfoKHR = struct(Module.VULKAN, "VkMemoryOpaqueCaptureAddressAllocateInfoKHR", alias = VkMemoryOpaqueCaptureAddressAllocateInfo) {
    Expression("#STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint64_t("opaqueCaptureAddress")
}

val VkDeviceMemoryOpaqueCaptureAddressInfoKHR = struct(Module.VULKAN, "VkDeviceMemoryOpaqueCaptureAddressInfoKHR", alias = VkDeviceMemoryOpaqueCaptureAddressInfo) {
    Expression("#STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceMemory("memory")
}

val VkPhysicalDeviceLineRasterizationFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceLineRasterizationFeaturesEXT", alias = VkPhysicalDeviceLineRasterizationFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("rectangularLines")
    VkBool32("bresenhamLines")
    VkBool32("smoothLines")
    VkBool32("stippledRectangularLines")
    VkBool32("stippledBresenhamLines")
    VkBool32("stippledSmoothLines")
}

val VkPhysicalDeviceLineRasterizationPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceLineRasterizationPropertiesEXT", mutable = false, alias = VkPhysicalDeviceLineRasterizationProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("lineSubPixelPrecisionBits")
}

val VkPipelineRasterizationLineStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineRasterizationLineStateCreateInfoEXT", alias = VkPipelineRasterizationLineStateCreateInfo) {
    Expression("#STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkLineRasterizationMode("lineRasterizationMode")
    VkBool32("stippledLineEnable")
    uint32_t("lineStippleFactor")
    uint16_t("lineStipplePattern")
}

val VkPhysicalDeviceShaderAtomicFloatFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderAtomicFloatFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderBufferFloat32Atomics")
    VkBool32("shaderBufferFloat32AtomicAdd")
    VkBool32("shaderBufferFloat64Atomics")
    VkBool32("shaderBufferFloat64AtomicAdd")
    VkBool32("shaderSharedFloat32Atomics")
    VkBool32("shaderSharedFloat32AtomicAdd")
    VkBool32("shaderSharedFloat64Atomics")
    VkBool32("shaderSharedFloat64AtomicAdd")
    VkBool32("shaderImageFloat32Atomics")
    VkBool32("shaderImageFloat32AtomicAdd")
    VkBool32("sparseImageFloat32Atomics")
    VkBool32("sparseImageFloat32AtomicAdd")
}

val VkPhysicalDeviceHostQueryResetFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceHostQueryResetFeaturesEXT", alias = VkPhysicalDeviceHostQueryResetFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("hostQueryReset")
}

val VkPhysicalDeviceIndexTypeUint8FeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceIndexTypeUint8FeaturesEXT", alias = VkPhysicalDeviceIndexTypeUint8Features) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("indexTypeUint8")
}

val VkPhysicalDeviceExtendedDynamicStateFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceExtendedDynamicStateFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("extendedDynamicState")
}

val VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("pipelineExecutableInfo")
}

val VkPipelineInfoKHR = struct(Module.VULKAN, "VkPipelineInfoKHR") {
    Expression("#STRUCTURE_TYPE_PIPELINE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipeline("pipeline")
}

val VkPipelineExecutablePropertiesKHR = struct(Module.VULKAN, "VkPipelineExecutablePropertiesKHR", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkShaderStageFlags("stages")
    charUTF8("name")["VK_MAX_DESCRIPTION_SIZE"]
    charUTF8("description")["VK_MAX_DESCRIPTION_SIZE"]
    uint32_t("subgroupSize")
}

val VkPipelineExecutableInfoKHR = struct(Module.VULKAN, "VkPipelineExecutableInfoKHR") {
    Expression("#STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipeline("pipeline")
    uint32_t("executableIndex")
}

val VkPipelineExecutableStatisticValueKHR = union(Module.VULKAN, "VkPipelineExecutableStatisticValueKHR", mutable = false) {
    VkBool32("b32")
    int64_t("i64")
    uint64_t("u64")
    double("f64")
}

val VkPipelineExecutableStatisticKHR = struct(Module.VULKAN, "VkPipelineExecutableStatisticKHR", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    charUTF8("name")["VK_MAX_DESCRIPTION_SIZE"]
    charUTF8("description")["VK_MAX_DESCRIPTION_SIZE"]
    VkPipelineExecutableStatisticFormatKHR("format")
    VkPipelineExecutableStatisticValueKHR("value")
}

val VkPipelineExecutableInternalRepresentationKHR = struct(Module.VULKAN, "VkPipelineExecutableInternalRepresentationKHR", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    charUTF8("name")["VK_MAX_DESCRIPTION_SIZE"]
    charUTF8("description")["VK_MAX_DESCRIPTION_SIZE"]
    VkBool32("isText")
    AutoSize("pData", optional = true)..size_t("dataSize")
    nullable..void.p("pData")
}

val VkPhysicalDeviceHostImageCopyFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceHostImageCopyFeaturesEXT", alias = VkPhysicalDeviceHostImageCopyFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("hostImageCopy")
}

val VkPhysicalDeviceHostImageCopyPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceHostImageCopyPropertiesEXT", alias = VkPhysicalDeviceHostImageCopyProperties) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    AutoSize("pCopySrcLayouts", optional = true)..uint32_t("copySrcLayoutCount")
    nullable..VkImageLayout.p("pCopySrcLayouts")
    AutoSize("pCopyDstLayouts", optional = true)..uint32_t("copyDstLayoutCount")
    nullable..VkImageLayout.p("pCopyDstLayouts")
    uint8_t("optimalTilingLayoutUUID")["VK_UUID_SIZE"]
    VkBool32("identicalMemoryTypeRequirements")
}

val VkMemoryToImageCopyEXT = struct(Module.VULKAN, "VkMemoryToImageCopyEXT", alias = VkMemoryToImageCopy) {
    Expression("#STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    opaque_const_p("pHostPointer")
    uint32_t("memoryRowLength")
    uint32_t("memoryImageHeight")
    VkImageSubresourceLayers("imageSubresource")
    VkOffset3D("imageOffset")
    VkExtent3D("imageExtent")
}

val VkImageToMemoryCopyEXT = struct(Module.VULKAN, "VkImageToMemoryCopyEXT", alias = VkImageToMemoryCopy) {
    Expression("#STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    opaque_p("pHostPointer")
    uint32_t("memoryRowLength")
    uint32_t("memoryImageHeight")
    VkImageSubresourceLayers("imageSubresource")
    VkOffset3D("imageOffset")
    VkExtent3D("imageExtent")
}

val VkCopyMemoryToImageInfoEXT = struct(Module.VULKAN, "VkCopyMemoryToImageInfoEXT", alias = VkCopyMemoryToImageInfo) {
    Expression("#STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkHostImageCopyFlags("flags")
    VkImage("dstImage")
    VkImageLayout("dstImageLayout")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkMemoryToImageCopy.const.p("pRegions")
}

val VkCopyImageToMemoryInfoEXT = struct(Module.VULKAN, "VkCopyImageToMemoryInfoEXT", alias = VkCopyImageToMemoryInfo) {
    Expression("#STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkHostImageCopyFlags("flags")
    VkImage("srcImage")
    VkImageLayout("srcImageLayout")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkImageToMemoryCopy.const.p("pRegions")
}

val VkCopyImageToImageInfoEXT = struct(Module.VULKAN, "VkCopyImageToImageInfoEXT", alias = VkCopyImageToImageInfo) {
    Expression("#STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkHostImageCopyFlags("flags")
    VkImage("srcImage")
    VkImageLayout("srcImageLayout")
    VkImage("dstImage")
    VkImageLayout("dstImageLayout")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkImageCopy2.const.p("pRegions")
}

val VkHostImageLayoutTransitionInfoEXT = struct(Module.VULKAN, "VkHostImageLayoutTransitionInfoEXT", alias = VkHostImageLayoutTransitionInfo) {
    Expression("#STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("image")
    VkImageLayout("oldLayout")
    VkImageLayout("newLayout")
    VkImageSubresourceRange("subresourceRange")
}

val VkSubresourceHostMemcpySizeEXT = struct(Module.VULKAN, "VkSubresourceHostMemcpySizeEXT", mutable = false, alias = VkSubresourceHostMemcpySize) {
    Expression("#STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceSize("size")
}

val VkHostImageCopyDevicePerformanceQueryEXT = struct(Module.VULKAN, "VkHostImageCopyDevicePerformanceQueryEXT", mutable = false, alias = VkHostImageCopyDevicePerformanceQuery) {
    Expression("#STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("optimalDeviceAccess")
    VkBool32("identicalMemoryLayout")
}

val VkSubresourceLayout2EXT = struct(Module.VULKAN, "VkSubresourceLayout2EXT", mutable = false, alias = VkSubresourceLayout2) {
    Expression("#STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkSubresourceLayout("subresourceLayout")
}

val VkImageSubresource2EXT = struct(Module.VULKAN, "VkImageSubresource2EXT", alias = VkImageSubresource2) {
    Expression("#STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkImageSubresource("imageSubresource")
}

val VkMemoryMapInfoKHR = struct(Module.VULKAN, "VkMemoryMapInfoKHR", alias = VkMemoryMapInfo) {
    Expression("#STRUCTURE_TYPE_MEMORY_MAP_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkMemoryMapFlags("flags")
    VkDeviceMemory("memory")
    VkDeviceSize("offset")
    VkDeviceSize("size")
}

val VkMemoryUnmapInfoKHR = struct(Module.VULKAN, "VkMemoryUnmapInfoKHR", alias = VkMemoryUnmapInfo) {
    Expression("#STRUCTURE_TYPE_MEMORY_UNMAP_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkMemoryUnmapFlags("flags")
    VkDeviceMemory("memory")
}

val VkPhysicalDeviceMapMemoryPlacedFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMapMemoryPlacedFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("memoryMapPlaced")
    VkBool32("memoryMapRangePlaced")
    VkBool32("memoryUnmapReserve")
}

val VkPhysicalDeviceMapMemoryPlacedPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMapMemoryPlacedPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceSize("minPlacedMemoryMapAlignment")
}

val VkMemoryMapPlacedInfoEXT = struct(Module.VULKAN, "VkMemoryMapPlacedInfoEXT") {
    Expression("#STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    nullable..opaque_p("pPlacedAddress")
}

val VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderBufferFloat16Atomics")
    VkBool32("shaderBufferFloat16AtomicAdd")
    VkBool32("shaderBufferFloat16AtomicMinMax")
    VkBool32("shaderBufferFloat32AtomicMinMax")
    VkBool32("shaderBufferFloat64AtomicMinMax")
    VkBool32("shaderSharedFloat16Atomics")
    VkBool32("shaderSharedFloat16AtomicAdd")
    VkBool32("shaderSharedFloat16AtomicMinMax")
    VkBool32("shaderSharedFloat32AtomicMinMax")
    VkBool32("shaderSharedFloat64AtomicMinMax")
    VkBool32("shaderImageFloat32AtomicMinMax")
    VkBool32("sparseImageFloat32AtomicMinMax")
}

val _VkSurfacePresentModeKHR = struct(Module.VULKAN, "VkSurfacePresentModeKHR")
val VkSurfacePresentModeEXT = struct(Module.VULKAN, "VkSurfacePresentModeEXT", alias = _VkSurfacePresentModeKHR) {
    Expression("#STRUCTURE_TYPE_SURFACE_PRESENT_MODE_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkPresentModeKHR("presentMode")
}

val _VkSurfacePresentScalingCapabilitiesKHR = struct(Module.VULKAN, "VkSurfacePresentScalingCapabilitiesKHR")
val VkSurfacePresentScalingCapabilitiesEXT = struct(Module.VULKAN, "VkSurfacePresentScalingCapabilitiesEXT", alias = _VkSurfacePresentScalingCapabilitiesKHR) {
    Expression("#STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkPresentScalingFlagsKHR("supportedPresentScaling")
    VkPresentGravityFlagsKHR("supportedPresentGravityX")
    VkPresentGravityFlagsKHR("supportedPresentGravityY")
    VkExtent2D("minScaledImageExtent")
    VkExtent2D("maxScaledImageExtent")
}

val _VkSurfacePresentModeCompatibilityKHR = struct(Module.VULKAN, "VkSurfacePresentModeCompatibilityKHR")
val VkSurfacePresentModeCompatibilityEXT = struct(Module.VULKAN, "VkSurfacePresentModeCompatibilityEXT", alias = _VkSurfacePresentModeCompatibilityKHR) {
    Expression("#STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    AutoSize("pPresentModes", optional = true)..uint32_t("presentModeCount")
    nullable..VkPresentModeKHR.p("pPresentModes")
}

val _VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR")
val VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT", alias = _VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("swapchainMaintenance1")
}

val _VkSwapchainPresentFenceInfoKHR = struct(Module.VULKAN, "VkSwapchainPresentFenceInfoKHR")
val VkSwapchainPresentFenceInfoEXT = struct(Module.VULKAN, "VkSwapchainPresentFenceInfoEXT", alias = _VkSwapchainPresentFenceInfoKHR) {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pFences", optional = true)..uint32_t("swapchainCount")
    nullable..VkFence.const.p("pFences")
}

val _VkSwapchainPresentModesCreateInfoKHR = struct(Module.VULKAN, "VkSwapchainPresentModesCreateInfoKHR")
val VkSwapchainPresentModesCreateInfoEXT = struct(Module.VULKAN, "VkSwapchainPresentModesCreateInfoEXT", alias = _VkSwapchainPresentModesCreateInfoKHR) {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pPresentModes")..uint32_t("presentModeCount")
    VkPresentModeKHR.const.p("pPresentModes")
}

val _VkSwapchainPresentModeInfoKHR = struct(Module.VULKAN, "VkSwapchainPresentModeInfoKHR")
val VkSwapchainPresentModeInfoEXT = struct(Module.VULKAN, "VkSwapchainPresentModeInfoEXT", alias = _VkSwapchainPresentModeInfoKHR) {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pPresentModes")..uint32_t("swapchainCount")
    VkPresentModeKHR.const.p("pPresentModes")
}

val _VkSwapchainPresentScalingCreateInfoKHR = struct(Module.VULKAN, "VkSwapchainPresentScalingCreateInfoKHR")
val VkSwapchainPresentScalingCreateInfoEXT = struct(Module.VULKAN, "VkSwapchainPresentScalingCreateInfoEXT", alias = _VkSwapchainPresentScalingCreateInfoKHR) {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPresentScalingFlagsKHR("scalingBehavior")
    VkPresentGravityFlagsKHR("presentGravityX")
    VkPresentGravityFlagsKHR("presentGravityY")
}

val _VkReleaseSwapchainImagesInfoKHR = struct(Module.VULKAN, "VkReleaseSwapchainImagesInfoKHR")
val VkReleaseSwapchainImagesInfoEXT = struct(Module.VULKAN, "VkReleaseSwapchainImagesInfoEXT", alias = _VkReleaseSwapchainImagesInfoKHR) {
    Expression("#STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSwapchainKHR("swapchain")
    AutoSize("pImageIndices")..uint32_t("imageIndexCount")
    uint32_t.const.p("pImageIndices")
}

val VkReleaseSwapchainImagesInfoKHR = struct(Module.VULKAN, "VkReleaseSwapchainImagesInfoKHR") {
    Expression("#STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSwapchainKHR("swapchain")
    AutoSize("pImageIndices")..uint32_t("imageIndexCount")
    uint32_t.const.p("pImageIndices")
}

val VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT", alias = VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderDemoteToHelperInvocation")
}

val VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxGraphicsShaderGroupCount")
    uint32_t("maxIndirectSequenceCount")
    uint32_t("maxIndirectCommandsTokenCount")
    uint32_t("maxIndirectCommandsStreamCount")
    uint32_t("maxIndirectCommandsTokenOffset")
    uint32_t("maxIndirectCommandsStreamStride")
    uint32_t("minSequencesCountBufferOffsetAlignment")
    uint32_t("minSequencesIndexBufferOffsetAlignment")
    uint32_t("minIndirectCommandsBufferOffsetAlignment")
}

val VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("deviceGeneratedCommands")
}

val VkGraphicsShaderGroupCreateInfoNV = struct(Module.VULKAN, "VkGraphicsShaderGroupCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pStages")..uint32_t("stageCount")
    VkPipelineShaderStageCreateInfo.const.p("pStages")
    nullable..VkPipelineVertexInputStateCreateInfo.const.p("pVertexInputState")
    nullable..VkPipelineTessellationStateCreateInfo.const.p("pTessellationState")
}

val VkGraphicsPipelineShaderGroupsCreateInfoNV = struct(Module.VULKAN, "VkGraphicsPipelineShaderGroupsCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pGroups", optional = true)..uint32_t("groupCount")
    VkGraphicsShaderGroupCreateInfoNV.const.p("pGroups")
    AutoSize("pPipelines", optional = true)..uint32_t("pipelineCount")
    VkPipeline.const.p("pPipelines")
}

val VkBindShaderGroupIndirectCommandNV = struct(Module.VULKAN, "VkBindShaderGroupIndirectCommandNV") {
    uint32_t("groupIndex")
}

val VkBindIndexBufferIndirectCommandNV = struct(Module.VULKAN, "VkBindIndexBufferIndirectCommandNV") {
    VkDeviceAddress("bufferAddress")
    uint32_t("size")
    VkIndexType("indexType")
}

val VkBindVertexBufferIndirectCommandNV = struct(Module.VULKAN, "VkBindVertexBufferIndirectCommandNV") {
    VkDeviceAddress("bufferAddress")
    uint32_t("size")
    uint32_t("stride")
}

val VkSetStateFlagsIndirectCommandNV = struct(Module.VULKAN, "VkSetStateFlagsIndirectCommandNV") {
    uint32_t("data")
}

val VkIndirectCommandsStreamNV = struct(Module.VULKAN, "VkIndirectCommandsStreamNV") {
    VkBuffer("buffer")
    VkDeviceSize("offset")
}

val VkIndirectCommandsLayoutTokenNV = struct(Module.VULKAN, "VkIndirectCommandsLayoutTokenNV") {
    Expression("#STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV")..VkStructureType("sType")
    PointerSetter(
        "VkIndirectCommandsLayoutPushDataTokenNV",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkIndirectCommandsTokenTypeNV("tokenType")
    uint32_t("stream")
    uint32_t("offset")
    uint32_t("vertexBindingUnit")
    VkBool32("vertexDynamicStride")
    VkPipelineLayout("pushconstantPipelineLayout")
    VkShaderStageFlags("pushconstantShaderStageFlags")
    uint32_t("pushconstantOffset")
    uint32_t("pushconstantSize")
    VkIndirectStateFlagsNV("indirectStateFlags")
    AutoSize("pIndexTypes", "pIndexTypeValues", optional = true)..uint32_t("indexTypeCount")
    VkIndexType.const.p("pIndexTypes")
    uint32_t.const.p("pIndexTypeValues")
}

val VkIndirectCommandsLayoutCreateInfoNV = struct(Module.VULKAN, "VkIndirectCommandsLayoutCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkIndirectCommandsLayoutUsageFlagsNV("flags")
    VkPipelineBindPoint("pipelineBindPoint")
    AutoSize("pTokens")..uint32_t("tokenCount")
    VkIndirectCommandsLayoutTokenNV.const.p("pTokens")
    AutoSize("pStreamStrides")..uint32_t("streamCount")
    uint32_t.const.p("pStreamStrides")
}

val VkGeneratedCommandsInfoNV = struct(Module.VULKAN, "VkGeneratedCommandsInfoNV") {
    Expression("#STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineBindPoint("pipelineBindPoint")
    VkPipeline("pipeline")
    VkIndirectCommandsLayoutNV("indirectCommandsLayout")
    AutoSize("pStreams")..uint32_t("streamCount")
    VkIndirectCommandsStreamNV.const.p("pStreams")
    uint32_t("sequencesCount")
    VkBuffer("preprocessBuffer")
    VkDeviceSize("preprocessOffset")
    VkDeviceSize("preprocessSize")
    VkBuffer("sequencesCountBuffer")
    VkDeviceSize("sequencesCountOffset")
    VkBuffer("sequencesIndexBuffer")
    VkDeviceSize("sequencesIndexOffset")
}

val VkGeneratedCommandsMemoryRequirementsInfoNV = struct(Module.VULKAN, "VkGeneratedCommandsMemoryRequirementsInfoNV") {
    Expression("#STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineBindPoint("pipelineBindPoint")
    VkPipeline("pipeline")
    VkIndirectCommandsLayoutNV("indirectCommandsLayout")
    uint32_t("maxSequencesCount")
}

val VkPhysicalDeviceInheritedViewportScissorFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceInheritedViewportScissorFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_INHERITED_VIEWPORT_SCISSOR_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("inheritedViewportScissor2D")
}

val VkCommandBufferInheritanceViewportScissorInfoNV = struct(Module.VULKAN, "VkCommandBufferInheritanceViewportScissorInfoNV") {
    Expression("#STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("viewportScissor2D")
    uint32_t("viewportDepthCount")
    nullable..VkViewport.const.p("pViewportDepths")
}

val VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR", alias = VkPhysicalDeviceShaderIntegerDotProductFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderIntegerDotProduct")
}

val VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR", mutable = false, alias = VkPhysicalDeviceShaderIntegerDotProductProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("integerDotProduct8BitUnsignedAccelerated")
    VkBool32("integerDotProduct8BitSignedAccelerated")
    VkBool32("integerDotProduct8BitMixedSignednessAccelerated")
    VkBool32("integerDotProduct4x8BitPackedUnsignedAccelerated")
    VkBool32("integerDotProduct4x8BitPackedSignedAccelerated")
    VkBool32("integerDotProduct4x8BitPackedMixedSignednessAccelerated")
    VkBool32("integerDotProduct16BitUnsignedAccelerated")
    VkBool32("integerDotProduct16BitSignedAccelerated")
    VkBool32("integerDotProduct16BitMixedSignednessAccelerated")
    VkBool32("integerDotProduct32BitUnsignedAccelerated")
    VkBool32("integerDotProduct32BitSignedAccelerated")
    VkBool32("integerDotProduct32BitMixedSignednessAccelerated")
    VkBool32("integerDotProduct64BitUnsignedAccelerated")
    VkBool32("integerDotProduct64BitSignedAccelerated")
    VkBool32("integerDotProduct64BitMixedSignednessAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating8BitSignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating16BitSignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating32BitSignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating64BitSignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated")
}

val VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("texelBufferAlignment")
}

val VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT", mutable = false, alias = VkPhysicalDeviceTexelBufferAlignmentProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceSize("storageTexelBufferOffsetAlignmentBytes")
    VkBool32("storageTexelBufferOffsetSingleTexelAlignment")
    VkDeviceSize("uniformTexelBufferOffsetAlignmentBytes")
    VkBool32("uniformTexelBufferOffsetSingleTexelAlignment")
}

val VkRenderPassTransformBeginInfoQCOM = struct(Module.VULKAN, "VkRenderPassTransformBeginInfoQCOM") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_TRANSFORM_BEGIN_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSurfaceTransformFlagBitsKHR("transform")
}

val VkCommandBufferInheritanceRenderPassTransformInfoQCOM = struct(Module.VULKAN, "VkCommandBufferInheritanceRenderPassTransformInfoQCOM") {
    Expression("#STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSurfaceTransformFlagBitsKHR("transform")
    VkRect2D("renderArea")
}

val VkPhysicalDeviceDepthBiasControlFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDepthBiasControlFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("depthBiasControl")
    VkBool32("leastRepresentableValueForceUnormRepresentation")
    VkBool32("floatRepresentation")
    VkBool32("depthBiasExact")
}

val VkDepthBiasInfoEXT = struct(Module.VULKAN, "VkDepthBiasInfoEXT") {
    Expression("#STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkDepthBiasRepresentationInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    float("depthBiasConstantFactor")
    float("depthBiasClamp")
    float("depthBiasSlopeFactor")
}

val VkDepthBiasRepresentationInfoEXT = struct(Module.VULKAN, "VkDepthBiasRepresentationInfoEXT") {
    Expression("#STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDepthBiasRepresentationEXT("depthBiasRepresentation")
    VkBool32("depthBiasExact")
}

val VkPhysicalDeviceDeviceMemoryReportFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDeviceMemoryReportFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("deviceMemoryReport")
}

val VkDeviceMemoryReportCallbackDataEXT = struct(Module.VULKAN, "VkDeviceMemoryReportCallbackDataEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceMemoryReportFlagsEXT("flags")
    VkDeviceMemoryReportEventTypeEXT("type")
    uint64_t("memoryObjectId")
    VkDeviceSize("size")
    VkObjectType("objectType")
    uint64_t("objectHandle")
    uint32_t("heapIndex")
}

val VkDeviceDeviceMemoryReportCreateInfoEXT = struct(Module.VULKAN, "VkDeviceDeviceMemoryReportCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceMemoryReportFlagsEXT("flags")
    PFN_vkDeviceMemoryReportCallbackEXT("pfnUserCallback")
    nullable..opaque_p("pUserData")
}

val _VkPhysicalDeviceRobustness2FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceRobustness2FeaturesKHR")
val VkPhysicalDeviceRobustness2FeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceRobustness2FeaturesEXT", alias = _VkPhysicalDeviceRobustness2FeaturesKHR) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("robustBufferAccess2")
    VkBool32("robustImageAccess2")
    VkBool32("nullDescriptor")
}

val _VkPhysicalDeviceRobustness2PropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceRobustness2PropertiesKHR")
val VkPhysicalDeviceRobustness2PropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceRobustness2PropertiesEXT", mutable = false, alias = _VkPhysicalDeviceRobustness2PropertiesKHR) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceSize("robustStorageBufferAccessSizeAlignment")
    VkDeviceSize("robustUniformBufferAccessSizeAlignment")
}

val VkPhysicalDeviceCustomBorderColorPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceCustomBorderColorPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxCustomBorderColorSamplers")
}

val VkPhysicalDeviceCustomBorderColorFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceCustomBorderColorFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("customBorderColors")
    VkBool32("customBorderColorWithoutFormat")
}

val VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_3D_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("textureCompressionASTC_3D")
}

val VkPhysicalDevicePresentBarrierFeaturesNV = struct(Module.VULKAN, "VkPhysicalDevicePresentBarrierFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_BARRIER_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("presentBarrier")
}

val VkSurfaceCapabilitiesPresentBarrierNV = struct(Module.VULKAN, "VkSurfaceCapabilitiesPresentBarrierNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_BARRIER_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("presentBarrierSupported")
}

val VkSwapchainPresentBarrierCreateInfoNV = struct(Module.VULKAN, "VkSwapchainPresentBarrierCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("presentBarrierEnable")
}

val VkPresentIdKHR = struct(Module.VULKAN, "VkPresentIdKHR") {
    Expression("#STRUCTURE_TYPE_PRESENT_ID_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pPresentIds", optional = true)..uint32_t("swapchainCount")
    nullable..uint64_t.const.p("pPresentIds")
}

val VkPhysicalDevicePresentIdFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevicePresentIdFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("presentId")
}

val VkPhysicalDevicePrivateDataFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDevicePrivateDataFeaturesEXT", alias = VkPhysicalDevicePrivateDataFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("privateData")
}

val VkDevicePrivateDataCreateInfoEXT = struct(Module.VULKAN, "VkDevicePrivateDataCreateInfoEXT", alias = VkDevicePrivateDataCreateInfo) {
    Expression("#STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("privateDataSlotRequestCount")
}

val VkPrivateDataSlotCreateInfoEXT = struct(Module.VULKAN, "VkPrivateDataSlotCreateInfoEXT", alias = VkPrivateDataSlotCreateInfo) {
    Expression("#STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPrivateDataSlotCreateFlags("flags")
}

val VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT", alias = VkPhysicalDevicePipelineCreationCacheControlFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("pipelineCreationCacheControl")
}

val VkVideoEncodeInfoKHR = struct(Module.VULKAN, "VkVideoEncodeInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkVideoEncodeAV1PictureInfoKHR", "VkVideoEncodeH264PictureInfoKHR", "VkVideoEncodeH265PictureInfoKHR", "VkVideoEncodeIntraRefreshInfoKHR", "VkVideoEncodeQuantizationMapInfoKHR", "VkVideoInlineQueryInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkVideoEncodeFlagsKHR("flags")
    VkBuffer("dstBuffer")
    VkDeviceSize("dstBufferOffset")
    VkDeviceSize("dstBufferRange")
    VkVideoPictureResourceInfoKHR("srcPictureResource")
    nullable..VkVideoReferenceSlotInfoKHR.const.p("pSetupReferenceSlot")
    AutoSize("pReferenceSlots", optional = true)..uint32_t("referenceSlotCount")
    VkVideoReferenceSlotInfoKHR.const.p("pReferenceSlots")
    uint32_t("precedingExternallyEncodedBytes")
}

val VkVideoEncodeCapabilitiesKHR = struct(Module.VULKAN, "VkVideoEncodeCapabilitiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkVideoEncodeCapabilityFlagsKHR("flags")
    VkVideoEncodeRateControlModeFlagsKHR("rateControlModes")
    uint32_t("maxRateControlLayers")
    uint64_t("maxBitrate")
    uint32_t("maxQualityLevels")
    VkExtent2D("encodeInputPictureGranularity")
    VkVideoEncodeFeedbackFlagsKHR("supportedEncodeFeedbackFlags")
}

val VkQueryPoolVideoEncodeFeedbackCreateInfoKHR = struct(Module.VULKAN, "VkQueryPoolVideoEncodeFeedbackCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkVideoEncodeFeedbackFlagsKHR("encodeFeedbackFlags")
}

val VkVideoEncodeUsageInfoKHR = struct(Module.VULKAN, "VkVideoEncodeUsageInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkVideoEncodeUsageFlagsKHR("videoUsageHints")
    VkVideoEncodeContentFlagsKHR("videoContentHints")
    VkVideoEncodeTuningModeKHR("tuningMode")
}

val VkVideoEncodeRateControlLayerInfoKHR = struct(Module.VULKAN, "VkVideoEncodeRateControlLayerInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkVideoEncodeAV1RateControlLayerInfoKHR", "VkVideoEncodeH264RateControlLayerInfoKHR", "VkVideoEncodeH265RateControlLayerInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    uint64_t("averageBitrate")
    uint64_t("maxBitrate")
    uint32_t("frameRateNumerator")
    uint32_t("frameRateDenominator")
}

val VkVideoEncodeRateControlInfoKHR = struct(Module.VULKAN, "VkVideoEncodeRateControlInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkVideoEncodeRateControlFlagsKHR("flags")
    VkVideoEncodeRateControlModeFlagBitsKHR("rateControlMode")
    AutoSize("pLayers", optional = true)..uint32_t("layerCount")
    VkVideoEncodeRateControlLayerInfoKHR.const.p("pLayers")
    uint32_t("virtualBufferSizeInMs")
    uint32_t("initialVirtualBufferSizeInMs")
}

val VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR = struct(Module.VULKAN, "VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkVideoProfileInfoKHR.const.p("pVideoProfile")
    uint32_t("qualityLevel")
}

val VkVideoEncodeQualityLevelPropertiesKHR = struct(Module.VULKAN, "VkVideoEncodeQualityLevelPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkVideoEncodeAV1QualityLevelPropertiesKHR", "VkVideoEncodeH264QualityLevelPropertiesKHR", "VkVideoEncodeH265QualityLevelPropertiesKHR",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkVideoEncodeRateControlModeFlagBitsKHR("preferredRateControlMode")
    uint32_t("preferredRateControlLayerCount")
}

val VkVideoEncodeQualityLevelInfoKHR = struct(Module.VULKAN, "VkVideoEncodeQualityLevelInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("qualityLevel")
}

val VkVideoEncodeSessionParametersGetInfoKHR = struct(Module.VULKAN, "VkVideoEncodeSessionParametersGetInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkVideoEncodeH264SessionParametersGetInfoKHR", "VkVideoEncodeH265SessionParametersGetInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkVideoSessionParametersKHR("videoSessionParameters")
}

val VkVideoEncodeSessionParametersFeedbackInfoKHR = struct(Module.VULKAN, "VkVideoEncodeSessionParametersFeedbackInfoKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkVideoEncodeH264SessionParametersFeedbackInfoKHR", "VkVideoEncodeH265SessionParametersFeedbackInfoKHR",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkBool32("hasOverrides")
}

val VkPhysicalDeviceDiagnosticsConfigFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceDiagnosticsConfigFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("diagnosticsConfig")
}

val VkDeviceDiagnosticsConfigCreateInfoNV = struct(Module.VULKAN, "VkDeviceDiagnosticsConfigCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_DEVICE_DIAGNOSTICS_CONFIG_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceDiagnosticsConfigFlagsNV("flags")
}

val VkCudaModuleCreateInfoNV = struct(Module.VULKAN, "VkCudaModuleCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pData")..size_t("dataSize")
    void.const.p("pData")
}

val VkCudaFunctionCreateInfoNV = struct(Module.VULKAN, "VkCudaFunctionCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkCudaModuleNV("module")
    charUTF8.const.p("pName")
}

val VkCudaLaunchInfoNV = struct(Module.VULKAN, "VkCudaLaunchInfoNV") {
    Expression("#STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkCudaFunctionNV("function")
    uint32_t("gridDimX")
    uint32_t("gridDimY")
    uint32_t("gridDimZ")
    uint32_t("blockDimX")
    uint32_t("blockDimY")
    uint32_t("blockDimZ")
    uint32_t("sharedMemBytes")
    AutoSize("pParams", optional = true)..size_t("paramCount")
    nullable..void.const.p.const.p("pParams")
    AutoSize("pExtras", optional = true)..size_t("extraCount")
    nullable..void.const.p.const.p("pExtras")
}

val VkPhysicalDeviceCudaKernelLaunchFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceCudaKernelLaunchFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("cudaKernelLaunchFeatures")
}

val VkPhysicalDeviceCudaKernelLaunchPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceCudaKernelLaunchPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("computeCapabilityMinor")
    uint32_t("computeCapabilityMajor")
}

val VkPhysicalDeviceTileShadingFeaturesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceTileShadingFeaturesQCOM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("tileShading")
    VkBool32("tileShadingFragmentStage")
    VkBool32("tileShadingColorAttachments")
    VkBool32("tileShadingDepthAttachments")
    VkBool32("tileShadingStencilAttachments")
    VkBool32("tileShadingInputAttachments")
    VkBool32("tileShadingSampledAttachments")
    VkBool32("tileShadingPerTileDraw")
    VkBool32("tileShadingPerTileDispatch")
    VkBool32("tileShadingDispatchTile")
    VkBool32("tileShadingApron")
    VkBool32("tileShadingAnisotropicApron")
    VkBool32("tileShadingAtomicOps")
    VkBool32("tileShadingImageProcessing")
}

val VkPhysicalDeviceTileShadingPropertiesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceTileShadingPropertiesQCOM", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxApronSize")
    VkBool32("preferNonCoherent")
    VkExtent2D("tileGranularity")
    VkExtent2D("maxTileShadingRate")
}

val VkRenderPassTileShadingCreateInfoQCOM = struct(Module.VULKAN, "VkRenderPassTileShadingCreateInfoQCOM") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_TILE_SHADING_CREATE_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkTileShadingRenderPassFlagsQCOM("flags")
    VkExtent2D("tileApronSize")
}

val VkPerTileBeginInfoQCOM = struct(Module.VULKAN, "VkPerTileBeginInfoQCOM") {
    Expression("#STRUCTURE_TYPE_PER_TILE_BEGIN_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
}

val VkPerTileEndInfoQCOM = struct(Module.VULKAN, "VkPerTileEndInfoQCOM") {
    Expression("#STRUCTURE_TYPE_PER_TILE_END_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
}

val VkDispatchTileInfoQCOM = struct(Module.VULKAN, "VkDispatchTileInfoQCOM") {
    Expression("#STRUCTURE_TYPE_DISPATCH_TILE_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
}

val VkQueryLowLatencySupportNV = struct(Module.VULKAN, "VkQueryLowLatencySupportNV") {
    Expression("#STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    opaque_p("pQueriedLowLatencyData")
}

val VkExportMetalObjectCreateInfoEXT = struct(Module.VULKAN, "VkExportMetalObjectCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExportMetalObjectTypeFlagBitsEXT("exportObjectType")
}

val VkExportMetalObjectsInfoEXT = struct(Module.VULKAN, "VkExportMetalObjectsInfoEXT") {
    Expression("#STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkExportMetalBufferInfoEXT", "VkExportMetalCommandQueueInfoEXT", "VkExportMetalDeviceInfoEXT", "VkExportMetalIOSurfaceInfoEXT", "VkExportMetalSharedEventInfoEXT", "VkExportMetalTextureInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
}

val VkExportMetalDeviceInfoEXT = struct(Module.VULKAN, "VkExportMetalDeviceInfoEXT") {
    Expression("#STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    MTLDevice_id("mtlDevice")
}

val VkExportMetalCommandQueueInfoEXT = struct(Module.VULKAN, "VkExportMetalCommandQueueInfoEXT") {
    Expression("#STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkQueue("queue")
    MTLCommandQueue_id("mtlCommandQueue")
}

val VkExportMetalBufferInfoEXT = struct(Module.VULKAN, "VkExportMetalBufferInfoEXT") {
    Expression("#STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceMemory("memory")
    MTLBuffer_id("mtlBuffer")
}

val VkImportMetalBufferInfoEXT = struct(Module.VULKAN, "VkImportMetalBufferInfoEXT") {
    Expression("#STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    MTLBuffer_id("mtlBuffer")
}

val VkExportMetalTextureInfoEXT = struct(Module.VULKAN, "VkExportMetalTextureInfoEXT") {
    Expression("#STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("image")
    VkImageView("imageView")
    VkBufferView("bufferView")
    VkImageAspectFlagBits("plane")
    MTLTexture_id("mtlTexture")
}

val VkImportMetalTextureInfoEXT = struct(Module.VULKAN, "VkImportMetalTextureInfoEXT") {
    Expression("#STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageAspectFlagBits("plane")
    MTLTexture_id("mtlTexture")
}

val VkExportMetalIOSurfaceInfoEXT = struct(Module.VULKAN, "VkExportMetalIOSurfaceInfoEXT") {
    Expression("#STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("image")
    IOSurfaceRef("ioSurface")
}

val VkImportMetalIOSurfaceInfoEXT = struct(Module.VULKAN, "VkImportMetalIOSurfaceInfoEXT") {
    Expression("#STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    IOSurfaceRef("ioSurface")
}

val VkExportMetalSharedEventInfoEXT = struct(Module.VULKAN, "VkExportMetalSharedEventInfoEXT") {
    Expression("#STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSemaphore("semaphore")
    VkEvent("event")
    MTLSharedEvent_id("mtlSharedEvent")
}

val VkImportMetalSharedEventInfoEXT = struct(Module.VULKAN, "VkImportMetalSharedEventInfoEXT") {
    Expression("#STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    MTLSharedEvent_id("mtlSharedEvent")
}

val VkMemoryBarrier2KHR = struct(Module.VULKAN, "VkMemoryBarrier2KHR", alias = VkMemoryBarrier2) {
    Expression("#STRUCTURE_TYPE_MEMORY_BARRIER_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineStageFlags2("srcStageMask")
    VkAccessFlags2("srcAccessMask")
    VkPipelineStageFlags2("dstStageMask")
    VkAccessFlags2("dstAccessMask")
}

val VkBufferMemoryBarrier2KHR = struct(Module.VULKAN, "VkBufferMemoryBarrier2KHR", alias = VkBufferMemoryBarrier2) {
    Expression("#STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineStageFlags2("srcStageMask")
    VkAccessFlags2("srcAccessMask")
    VkPipelineStageFlags2("dstStageMask")
    VkAccessFlags2("dstAccessMask")
    uint32_t("srcQueueFamilyIndex")
    uint32_t("dstQueueFamilyIndex")
    VkBuffer("buffer")
    VkDeviceSize("offset")
    VkDeviceSize("size")
}

val VkImageMemoryBarrier2KHR = struct(Module.VULKAN, "VkImageMemoryBarrier2KHR", alias = VkImageMemoryBarrier2) {
    Expression("#STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineStageFlags2("srcStageMask")
    VkAccessFlags2("srcAccessMask")
    VkPipelineStageFlags2("dstStageMask")
    VkAccessFlags2("dstAccessMask")
    VkImageLayout("oldLayout")
    VkImageLayout("newLayout")
    uint32_t("srcQueueFamilyIndex")
    uint32_t("dstQueueFamilyIndex")
    VkImage("image")
    VkImageSubresourceRange("subresourceRange")
}

val VkDependencyInfoKHR = struct(Module.VULKAN, "VkDependencyInfoKHR", alias = VkDependencyInfo) {
    Expression("#STRUCTURE_TYPE_DEPENDENCY_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDependencyFlags("dependencyFlags")
    AutoSize("pMemoryBarriers", optional = true)..uint32_t("memoryBarrierCount")
    VkMemoryBarrier2.const.p("pMemoryBarriers")
    AutoSize("pBufferMemoryBarriers", optional = true)..uint32_t("bufferMemoryBarrierCount")
    VkBufferMemoryBarrier2.const.p("pBufferMemoryBarriers")
    AutoSize("pImageMemoryBarriers", optional = true)..uint32_t("imageMemoryBarrierCount")
    VkImageMemoryBarrier2.const.p("pImageMemoryBarriers")
}

val VkSubmitInfo2KHR = struct(Module.VULKAN, "VkSubmitInfo2KHR", alias = VkSubmitInfo2) {
    Expression("#STRUCTURE_TYPE_SUBMIT_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSubmitFlags("flags")
    AutoSize("pWaitSemaphoreInfos", optional = true)..uint32_t("waitSemaphoreInfoCount")
    VkSemaphoreSubmitInfo.const.p("pWaitSemaphoreInfos")
    AutoSize("pCommandBufferInfos", optional = true)..uint32_t("commandBufferInfoCount")
    VkCommandBufferSubmitInfo.const.p("pCommandBufferInfos")
    AutoSize("pSignalSemaphoreInfos", optional = true)..uint32_t("signalSemaphoreInfoCount")
    VkSemaphoreSubmitInfo.const.p("pSignalSemaphoreInfos")
}

val VkSemaphoreSubmitInfoKHR = struct(Module.VULKAN, "VkSemaphoreSubmitInfoKHR", alias = VkSemaphoreSubmitInfo) {
    Expression("#STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSemaphore("semaphore")
    uint64_t("value")
    VkPipelineStageFlags2("stageMask")
    uint32_t("deviceIndex")
}

val VkCommandBufferSubmitInfoKHR = struct(Module.VULKAN, "VkCommandBufferSubmitInfoKHR", alias = VkCommandBufferSubmitInfo) {
    Expression("#STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkCommandBuffer("commandBuffer")
    uint32_t("deviceMask")
}

val VkPhysicalDeviceSynchronization2FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceSynchronization2FeaturesKHR", alias = VkPhysicalDeviceSynchronization2Features) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("synchronization2")
}

val VkPhysicalDeviceDescriptorBufferPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorBufferPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("combinedImageSamplerDescriptorSingleArray")
    VkBool32("bufferlessPushDescriptors")
    VkBool32("allowSamplerImageViewPostSubmitCreation")
    VkDeviceSize("descriptorBufferOffsetAlignment")
    uint32_t("maxDescriptorBufferBindings")
    uint32_t("maxResourceDescriptorBufferBindings")
    uint32_t("maxSamplerDescriptorBufferBindings")
    uint32_t("maxEmbeddedImmutableSamplerBindings")
    uint32_t("maxEmbeddedImmutableSamplers")
    size_t("bufferCaptureReplayDescriptorDataSize")
    size_t("imageCaptureReplayDescriptorDataSize")
    size_t("imageViewCaptureReplayDescriptorDataSize")
    size_t("samplerCaptureReplayDescriptorDataSize")
    size_t("accelerationStructureCaptureReplayDescriptorDataSize")
    size_t("samplerDescriptorSize")
    size_t("combinedImageSamplerDescriptorSize")
    size_t("sampledImageDescriptorSize")
    size_t("storageImageDescriptorSize")
    size_t("uniformTexelBufferDescriptorSize")
    size_t("robustUniformTexelBufferDescriptorSize")
    size_t("storageTexelBufferDescriptorSize")
    size_t("robustStorageTexelBufferDescriptorSize")
    size_t("uniformBufferDescriptorSize")
    size_t("robustUniformBufferDescriptorSize")
    size_t("storageBufferDescriptorSize")
    size_t("robustStorageBufferDescriptorSize")
    size_t("inputAttachmentDescriptorSize")
    size_t("accelerationStructureDescriptorSize")
    VkDeviceSize("maxSamplerDescriptorBufferRange")
    VkDeviceSize("maxResourceDescriptorBufferRange")
    VkDeviceSize("samplerDescriptorBufferAddressSpaceSize")
    VkDeviceSize("resourceDescriptorBufferAddressSpaceSize")
    VkDeviceSize("descriptorBufferAddressSpaceSize")
}

val VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_DENSITY_MAP_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    size_t("combinedImageSamplerDensityMapDescriptorSize")
}

val VkPhysicalDeviceDescriptorBufferFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorBufferFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("descriptorBuffer")
    VkBool32("descriptorBufferCaptureReplay")
    VkBool32("descriptorBufferImageLayoutIgnored")
    VkBool32("descriptorBufferPushDescriptors")
}

val VkDescriptorAddressInfoEXT = struct(Module.VULKAN, "VkDescriptorAddressInfoEXT") {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkDeviceAddress("address")
    VkDeviceSize("range")
    VkFormat("format")
}

val VkDescriptorBufferBindingInfoEXT = struct(Module.VULKAN, "VkDescriptorBufferBindingInfoEXT") {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkBufferUsageFlags2CreateInfo", "VkBufferUsageFlags2CreateInfoKHR", "VkDescriptorBufferBindingPushDescriptorBufferHandleEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDeviceAddress("address")
    VkBufferUsageFlags("usage")
}

val VkDescriptorBufferBindingPushDescriptorBufferHandleEXT = struct(Module.VULKAN, "VkDescriptorBufferBindingPushDescriptorBufferHandleEXT") {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBuffer("buffer")
}

val VkDescriptorDataEXT = union(Module.VULKAN, "VkDescriptorDataEXT") {
    VkSampler.const.p("pSampler")
    VkDescriptorImageInfo.const.p("pCombinedImageSampler")
    VkDescriptorImageInfo.const.p("pInputAttachmentImage")
    nullable..VkDescriptorImageInfo.const.p("pSampledImage")
    nullable..VkDescriptorImageInfo.const.p("pStorageImage")
    nullable..VkDescriptorAddressInfoEXT.const.p("pUniformTexelBuffer")
    nullable..VkDescriptorAddressInfoEXT.const.p("pStorageTexelBuffer")
    nullable..VkDescriptorAddressInfoEXT.const.p("pUniformBuffer")
    nullable..VkDescriptorAddressInfoEXT.const.p("pStorageBuffer")
    VkDeviceAddress("accelerationStructure")
}

val VkDescriptorGetInfoEXT = struct(Module.VULKAN, "VkDescriptorGetInfoEXT") {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkDescriptorGetTensorInfoARM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDescriptorType("type")
    VkDescriptorDataEXT("data")
}

val VkBufferCaptureDescriptorDataInfoEXT = struct(Module.VULKAN, "VkBufferCaptureDescriptorDataInfoEXT") {
    Expression("#STRUCTURE_TYPE_BUFFER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBuffer("buffer")
}

val VkImageCaptureDescriptorDataInfoEXT = struct(Module.VULKAN, "VkImageCaptureDescriptorDataInfoEXT") {
    Expression("#STRUCTURE_TYPE_IMAGE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("image")
}

val VkImageViewCaptureDescriptorDataInfoEXT = struct(Module.VULKAN, "VkImageViewCaptureDescriptorDataInfoEXT") {
    Expression("#STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageView("imageView")
}

val VkSamplerCaptureDescriptorDataInfoEXT = struct(Module.VULKAN, "VkSamplerCaptureDescriptorDataInfoEXT") {
    Expression("#STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSampler("sampler")
}

val VkOpaqueCaptureDescriptorDataCreateInfoEXT = struct(Module.VULKAN, "VkOpaqueCaptureDescriptorDataCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    opaque_const_p("opaqueCaptureDescriptorData")
}

val VkAccelerationStructureCaptureDescriptorDataInfoEXT = struct(Module.VULKAN, "VkAccelerationStructureCaptureDescriptorDataInfoEXT") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAccelerationStructureKHR("accelerationStructure")
    VkAccelerationStructureNV("accelerationStructureNV")
}

val VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("graphicsPipelineLibrary")
}

val VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("graphicsPipelineLibraryFastLinking")
    VkBool32("graphicsPipelineLibraryIndependentInterpolationDecoration")
}

val VkGraphicsPipelineLibraryCreateInfoEXT = struct(Module.VULKAN, "VkGraphicsPipelineLibraryCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_GRAPHICS_PIPELINE_LIBRARY_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkGraphicsPipelineLibraryFlagsEXT("flags")
}

val VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD = struct(Module.VULKAN, "VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderEarlyAndLateFragmentTests")
}

val VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("fragmentShaderBarycentric")
}

val VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("triStripVertexOrderIndependentOfProvokingVertex")
}

val VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_UNIFORM_CONTROL_FLOW_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderSubgroupUniformControlFlow")
}

val VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR", alias = VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderZeroInitializeWorkgroupMemory")
}

val VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("fragmentShadingRateEnums")
    VkBool32("supersampleFragmentShadingRates")
    VkBool32("noInvocationFragmentShadingRates")
}

val VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkSampleCountFlagBits("maxFragmentShadingRateInvocationCount")
}

val VkPipelineFragmentShadingRateEnumStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineFragmentShadingRateEnumStateCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkFragmentShadingRateTypeNV("shadingRateType")
    VkFragmentShadingRateNV("shadingRate")
    VkFragmentShadingRateCombinerOpKHR("combinerOps")[2]
}

val VkAccelerationStructureGeometryMotionTrianglesDataNV = struct(Module.VULKAN, "VkAccelerationStructureGeometryMotionTrianglesDataNV") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceOrHostAddressConstKHR("vertexData")
}

val VkAccelerationStructureMotionInfoNV = struct(Module.VULKAN, "VkAccelerationStructureMotionInfoNV") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("maxInstances")
    VkAccelerationStructureMotionInfoFlagsNV("flags")
}

val VkAccelerationStructureMatrixMotionInstanceNV = struct(Module.VULKAN, "VkAccelerationStructureMatrixMotionInstanceNV") {
    VkTransformMatrixKHR("transformT0")
    VkTransformMatrixKHR("transformT1")
    uint32_t("instanceCustomIndex", bits = 24)
    uint32_t("mask", bits = 8)
    uint32_t("instanceShaderBindingTableRecordOffset", bits = 24)
    VkGeometryInstanceFlagsKHR("flags", bits = 8)
    uint64_t("accelerationStructureReference")
}

val VkSRTDataNV = struct(Module.VULKAN, "VkSRTDataNV") {
    float("sx")
    float("a")
    float("b")
    float("pvx")
    float("sy")
    float("c")
    float("pvy")
    float("sz")
    float("pvz")
    float("qx")
    float("qy")
    float("qz")
    float("qw")
    float("tx")
    float("ty")
    float("tz")
}

val VkAccelerationStructureSRTMotionInstanceNV = struct(Module.VULKAN, "VkAccelerationStructureSRTMotionInstanceNV") {
    VkSRTDataNV("transformT0")
    VkSRTDataNV("transformT1")
    uint32_t("instanceCustomIndex", bits = 24)
    uint32_t("mask", bits = 8)
    uint32_t("instanceShaderBindingTableRecordOffset", bits = 24)
    VkGeometryInstanceFlagsKHR("flags", bits = 8)
    uint64_t("accelerationStructureReference")
}

val VkAccelerationStructureMotionInstanceDataNV = union(Module.VULKAN, "VkAccelerationStructureMotionInstanceDataNV") {
    VkAccelerationStructureInstanceKHR("staticInstance")
    VkAccelerationStructureMatrixMotionInstanceNV("matrixMotionInstance")
    VkAccelerationStructureSRTMotionInstanceNV("srtMotionInstance")
}

val VkAccelerationStructureMotionInstanceNV = struct(Module.VULKAN, "VkAccelerationStructureMotionInstanceNV") {
    VkAccelerationStructureMotionInstanceTypeNV("type")
    VkAccelerationStructureMotionInstanceFlagsNV("flags")
    VkAccelerationStructureMotionInstanceDataNV("data")
}

val VkPhysicalDeviceRayTracingMotionBlurFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingMotionBlurFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("rayTracingMotionBlur")
    VkBool32("rayTracingMotionBlurPipelineTraceRaysIndirect")
}

val VkPhysicalDeviceMeshShaderFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMeshShaderFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("taskShader")
    VkBool32("meshShader")
    VkBool32("multiviewMeshShader")
    VkBool32("primitiveFragmentShadingRateMeshShader")
    VkBool32("meshShaderQueries")
}

val VkPhysicalDeviceMeshShaderPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMeshShaderPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxTaskWorkGroupTotalCount")
    uint32_t("maxTaskWorkGroupCount")[3]
    uint32_t("maxTaskWorkGroupInvocations")
    uint32_t("maxTaskWorkGroupSize")[3]
    uint32_t("maxTaskPayloadSize")
    uint32_t("maxTaskSharedMemorySize")
    uint32_t("maxTaskPayloadAndSharedMemorySize")
    uint32_t("maxMeshWorkGroupTotalCount")
    uint32_t("maxMeshWorkGroupCount")[3]
    uint32_t("maxMeshWorkGroupInvocations")
    uint32_t("maxMeshWorkGroupSize")[3]
    uint32_t("maxMeshSharedMemorySize")
    uint32_t("maxMeshPayloadAndSharedMemorySize")
    uint32_t("maxMeshOutputMemorySize")
    uint32_t("maxMeshPayloadAndOutputMemorySize")
    uint32_t("maxMeshOutputComponents")
    uint32_t("maxMeshOutputVertices")
    uint32_t("maxMeshOutputPrimitives")
    uint32_t("maxMeshOutputLayers")
    uint32_t("maxMeshMultiviewViewCount")
    uint32_t("meshOutputPerVertexGranularity")
    uint32_t("meshOutputPerPrimitiveGranularity")
    uint32_t("maxPreferredTaskWorkGroupInvocations")
    uint32_t("maxPreferredMeshWorkGroupInvocations")
    VkBool32("prefersLocalInvocationVertexOutput")
    VkBool32("prefersLocalInvocationPrimitiveOutput")
    VkBool32("prefersCompactVertexOutput")
    VkBool32("prefersCompactPrimitiveOutput")
}

val VkDrawMeshTasksIndirectCommandEXT = struct(Module.VULKAN, "VkDrawMeshTasksIndirectCommandEXT") {
    uint32_t("groupCountX")
    uint32_t("groupCountY")
    uint32_t("groupCountZ")
}

val VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("ycbcr2plane444Formats")
}

val VkPhysicalDeviceFragmentDensityMap2FeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMap2FeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("fragmentDensityMapDeferred")
}

val VkPhysicalDeviceFragmentDensityMap2PropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMap2PropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("subsampledLoads")
    VkBool32("subsampledCoarseReconstructionEarlyAccess")
    uint32_t("maxSubsampledArrayLayers")
    uint32_t("maxDescriptorSetSubsampledSamplers")
}

val VkCopyCommandTransformInfoQCOM = struct(Module.VULKAN, "VkCopyCommandTransformInfoQCOM") {
    Expression("#STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSurfaceTransformFlagBitsKHR("transform")
}

val VkPhysicalDeviceImageRobustnessFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceImageRobustnessFeaturesEXT", alias = VkPhysicalDeviceImageRobustnessFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("robustImageAccess")
}

val VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("workgroupMemoryExplicitLayout")
    VkBool32("workgroupMemoryExplicitLayoutScalarBlockLayout")
    VkBool32("workgroupMemoryExplicitLayout8BitAccess")
    VkBool32("workgroupMemoryExplicitLayout16BitAccess")
}

val VkCopyBufferInfo2KHR = struct(Module.VULKAN, "VkCopyBufferInfo2KHR", alias = VkCopyBufferInfo2) {
    Expression("#STRUCTURE_TYPE_COPY_BUFFER_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBuffer("srcBuffer")
    VkBuffer("dstBuffer")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkBufferCopy2.const.p("pRegions")
}

val VkCopyImageInfo2KHR = struct(Module.VULKAN, "VkCopyImageInfo2KHR", alias = VkCopyImageInfo2) {
    Expression("#STRUCTURE_TYPE_COPY_IMAGE_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("srcImage")
    VkImageLayout("srcImageLayout")
    VkImage("dstImage")
    VkImageLayout("dstImageLayout")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkImageCopy2.const.p("pRegions")
}

val VkCopyBufferToImageInfo2KHR = struct(Module.VULKAN, "VkCopyBufferToImageInfo2KHR", alias = VkCopyBufferToImageInfo2) {
    Expression("#STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBuffer("srcBuffer")
    VkImage("dstImage")
    VkImageLayout("dstImageLayout")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkBufferImageCopy2.const.p("pRegions")
}

val VkCopyImageToBufferInfo2KHR = struct(Module.VULKAN, "VkCopyImageToBufferInfo2KHR", alias = VkCopyImageToBufferInfo2) {
    Expression("#STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("srcImage")
    VkImageLayout("srcImageLayout")
    VkBuffer("dstBuffer")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkBufferImageCopy2.const.p("pRegions")
}

val VkBlitImageInfo2KHR = struct(Module.VULKAN, "VkBlitImageInfo2KHR", alias = VkBlitImageInfo2) {
    Expression("#STRUCTURE_TYPE_BLIT_IMAGE_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("srcImage")
    VkImageLayout("srcImageLayout")
    VkImage("dstImage")
    VkImageLayout("dstImageLayout")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkImageBlit2.const.p("pRegions")
    VkFilter("filter")
}

val VkResolveImageInfo2KHR = struct(Module.VULKAN, "VkResolveImageInfo2KHR", alias = VkResolveImageInfo2) {
    Expression("#STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("srcImage")
    VkImageLayout("srcImageLayout")
    VkImage("dstImage")
    VkImageLayout("dstImageLayout")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkImageResolve2.const.p("pRegions")
}

val VkBufferCopy2KHR = struct(Module.VULKAN, "VkBufferCopy2KHR", alias = VkBufferCopy2) {
    Expression("#STRUCTURE_TYPE_BUFFER_COPY_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceSize("srcOffset")
    VkDeviceSize("dstOffset")
    VkDeviceSize("size")
}

val VkImageCopy2KHR = struct(Module.VULKAN, "VkImageCopy2KHR", alias = VkImageCopy2) {
    Expression("#STRUCTURE_TYPE_IMAGE_COPY_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageSubresourceLayers("srcSubresource")
    VkOffset3D("srcOffset")
    VkImageSubresourceLayers("dstSubresource")
    VkOffset3D("dstOffset")
    VkExtent3D("extent")
}

val VkImageBlit2KHR = struct(Module.VULKAN, "VkImageBlit2KHR", alias = VkImageBlit2) {
    Expression("#STRUCTURE_TYPE_IMAGE_BLIT_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageSubresourceLayers("srcSubresource")
    VkOffset3D("srcOffsets")[2]
    VkImageSubresourceLayers("dstSubresource")
    VkOffset3D("dstOffsets")[2]
}

val VkBufferImageCopy2KHR = struct(Module.VULKAN, "VkBufferImageCopy2KHR", alias = VkBufferImageCopy2) {
    Expression("#STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceSize("bufferOffset")
    uint32_t("bufferRowLength")
    uint32_t("bufferImageHeight")
    VkImageSubresourceLayers("imageSubresource")
    VkOffset3D("imageOffset")
    VkExtent3D("imageExtent")
}

val VkImageResolve2KHR = struct(Module.VULKAN, "VkImageResolve2KHR", alias = VkImageResolve2) {
    Expression("#STRUCTURE_TYPE_IMAGE_RESOLVE_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageSubresourceLayers("srcSubresource")
    VkOffset3D("srcOffset")
    VkImageSubresourceLayers("dstSubresource")
    VkOffset3D("dstOffset")
    VkExtent3D("extent")
}

val VkPhysicalDeviceImageCompressionControlFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceImageCompressionControlFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("imageCompressionControl")
}

val VkImageCompressionControlEXT = struct(Module.VULKAN, "VkImageCompressionControlEXT") {
    Expression("#STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageCompressionFlagsEXT("flags")
    AutoSize("pFixedRateFlags", optional = true)..uint32_t("compressionControlPlaneCount")
    nullable..VkImageCompressionFixedRateFlagsEXT.p("pFixedRateFlags")
}

val VkImageCompressionPropertiesEXT = struct(Module.VULKAN, "VkImageCompressionPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkImageCompressionFlagsEXT("imageCompressionFlags")
    VkImageCompressionFixedRateFlagsEXT("imageCompressionFixedRateFlags")
}

val VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("attachmentFeedbackLoopLayout")
}

val VkPhysicalDevice4444FormatsFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDevice4444FormatsFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("formatA4R4G4B4")
    VkBool32("formatA4B4G4R4")
}

val VkPhysicalDeviceFaultFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFaultFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("deviceFault")
    VkBool32("deviceFaultVendorBinary")
}

val VkDeviceFaultCountsEXT = struct(Module.VULKAN, "VkDeviceFaultCountsEXT") {
    Expression("#STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    uint32_t("addressInfoCount")
    uint32_t("vendorInfoCount")
    VkDeviceSize("vendorBinarySize")
}

val VkDeviceFaultAddressInfoEXT = struct(Module.VULKAN, "VkDeviceFaultAddressInfoEXT") {
    VkDeviceFaultAddressTypeEXT("addressType")
    VkDeviceAddress("reportedAddress")
    VkDeviceSize("addressPrecision")
}

val VkDeviceFaultVendorInfoEXT = struct(Module.VULKAN, "VkDeviceFaultVendorInfoEXT") {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    charUTF8("description")["VK_MAX_DESCRIPTION_SIZE"]
    uint64_t("vendorFaultCode")
    uint64_t("vendorFaultData")
}

val VkDeviceFaultInfoEXT = struct(Module.VULKAN, "VkDeviceFaultInfoEXT", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    charUTF8("description")["VK_MAX_DESCRIPTION_SIZE"]
    nullable..VkDeviceFaultAddressInfoEXT.p("pAddressInfos")
    nullable..VkDeviceFaultVendorInfoEXT.p("pVendorInfos")
    nullable..opaque_p("pVendorBinaryData")
}

val VkDeviceFaultVendorBinaryHeaderVersionOneEXT = struct(Module.VULKAN, "VkDeviceFaultVendorBinaryHeaderVersionOneEXT") {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    uint32_t("headerSize")
    VkDeviceFaultVendorBinaryHeaderVersionEXT("headerVersion")
    uint32_t("vendorID")
    uint32_t("deviceID")
    uint32_t("driverVersion")
    uint8_t("pipelineCacheUUID")["VK_UUID_SIZE"]
    uint32_t("applicationNameOffset")
    uint32_t("applicationVersion")
    uint32_t("engineNameOffset")
    uint32_t("engineVersion")
    uint32_t("apiVersion")
}

val _VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT")
val VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM = struct(Module.VULKAN, "VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM", alias = _VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("rasterizationOrderColorAttachmentAccess")
    VkBool32("rasterizationOrderDepthAttachmentAccess")
    VkBool32("rasterizationOrderStencilAttachmentAccess")
}

val VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("formatRgba10x6WithoutYCbCrSampler")
}

val VkDirectFBSurfaceCreateInfoEXT = struct(Module.VULKAN, "VkDirectFBSurfaceCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_DIRECTFB_SURFACE_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDirectFBSurfaceCreateFlagsEXT("flags")
    nullable..IDirectFB.p("dfb")
    nullable..IDirectFBSurface.p("surface")
}

val _VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT")
val VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE = struct(Module.VULKAN, "VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE", alias = _VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("mutableDescriptorType")
}

val _VkMutableDescriptorTypeListEXT = struct(Module.VULKAN, "VkMutableDescriptorTypeListEXT")
val VkMutableDescriptorTypeListVALVE = struct(Module.VULKAN, "VkMutableDescriptorTypeListVALVE", alias = _VkMutableDescriptorTypeListEXT) {
    AutoSize("pDescriptorTypes", optional = true)..uint32_t("descriptorTypeCount")
    VkDescriptorType.const.p("pDescriptorTypes")
}

val VkMutableDescriptorTypeListEXT = struct(Module.VULKAN, "VkMutableDescriptorTypeListEXT") {
    AutoSize("pDescriptorTypes", optional = true)..uint32_t("descriptorTypeCount")
    VkDescriptorType.const.p("pDescriptorTypes")
}

val _VkMutableDescriptorTypeCreateInfoEXT = struct(Module.VULKAN, "VkMutableDescriptorTypeCreateInfoEXT")
val VkMutableDescriptorTypeCreateInfoVALVE = struct(Module.VULKAN, "VkMutableDescriptorTypeCreateInfoVALVE", alias = _VkMutableDescriptorTypeCreateInfoEXT) {
    Expression("#STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pMutableDescriptorTypeLists", optional = true)..uint32_t("mutableDescriptorTypeListCount")
    VkMutableDescriptorTypeListEXT.const.p("pMutableDescriptorTypeLists")
}

val VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_INPUT_DYNAMIC_STATE_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("vertexInputDynamicState")
}

val VkVertexInputBindingDescription2EXT = struct(Module.VULKAN, "VkVertexInputBindingDescription2EXT") {
    Expression("#STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    uint32_t("binding")
    uint32_t("stride")
    VkVertexInputRate("inputRate")
    uint32_t("divisor")
}

val VkVertexInputAttributeDescription2EXT = struct(Module.VULKAN, "VkVertexInputAttributeDescription2EXT") {
    Expression("#STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    uint32_t("location")
    uint32_t("binding")
    VkFormat("format")
    uint32_t("offset")
}

val VkPhysicalDeviceDrmPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDrmPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("hasPrimary")
    VkBool32("hasRender")
    int64_t("primaryMajor")
    int64_t("primaryMinor")
    int64_t("renderMajor")
    int64_t("renderMinor")
}

val VkPhysicalDeviceAddressBindingReportFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceAddressBindingReportFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("reportAddressBinding")
}

val VkDeviceAddressBindingCallbackDataEXT = struct(Module.VULKAN, "VkDeviceAddressBindingCallbackDataEXT") {
    Expression("#STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkDeviceAddressBindingFlagsEXT("flags")
    VkDeviceAddress("baseAddress")
    VkDeviceSize("size")
    VkDeviceAddressBindingTypeEXT("bindingType")
}

val VkPhysicalDeviceDepthClipControlFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDepthClipControlFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_CONTROL_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("depthClipControl")
}

val VkPipelineViewportDepthClipControlCreateInfoEXT = struct(Module.VULKAN, "VkPipelineViewportDepthClipControlCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("negativeOneToOne")
}

val VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVE_TOPOLOGY_LIST_RESTART_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("primitiveTopologyListRestart")
    VkBool32("primitiveTopologyPatchListRestart")
}

val VkFormatProperties3KHR = struct(Module.VULKAN, "VkFormatProperties3KHR", mutable = false, alias = VkFormatProperties3) {
    Expression("#STRUCTURE_TYPE_FORMAT_PROPERTIES_3")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkFormatFeatureFlags2("linearTilingFeatures")
    VkFormatFeatureFlags2("optimalTilingFeatures")
    VkFormatFeatureFlags2("bufferFeatures")
}

val _VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR")
val VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT", alias = _VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_MODE_FIFO_LATEST_READY_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("presentModeFifoLatestReady")
}

val VkSubpassShadingPipelineCreateInfoHUAWEI = struct(Module.VULKAN, "VkSubpassShadingPipelineCreateInfoHUAWEI") {
    Expression("#STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkRenderPass("renderPass")
    uint32_t("subpass")
}

val VkPhysicalDeviceSubpassShadingFeaturesHUAWEI = struct(Module.VULKAN, "VkPhysicalDeviceSubpassShadingFeaturesHUAWEI") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("subpassShading")
}

val VkPhysicalDeviceSubpassShadingPropertiesHUAWEI = struct(Module.VULKAN, "VkPhysicalDeviceSubpassShadingPropertiesHUAWEI", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxSubpassShadingWorkgroupSizeAspectRatio")
}

val VkPhysicalDeviceInvocationMaskFeaturesHUAWEI = struct(Module.VULKAN, "VkPhysicalDeviceInvocationMaskFeaturesHUAWEI") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("invocationMask")
}

val VkMemoryGetRemoteAddressInfoNV = struct(Module.VULKAN, "VkMemoryGetRemoteAddressInfoNV") {
    Expression("#STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceMemory("memory")
    VkExternalMemoryHandleTypeFlagBits("handleType")
}

val VkPhysicalDeviceExternalMemoryRDMAFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceExternalMemoryRDMAFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("externalMemoryRDMA")
}

val VkPipelineInfoEXT = struct(Module.VULKAN, "VkPipelineInfoEXT", alias = VkPipelineInfoKHR) {
    Expression("#STRUCTURE_TYPE_PIPELINE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipeline("pipeline")
}

val VkPipelinePropertiesIdentifierEXT = struct(Module.VULKAN, "VkPipelinePropertiesIdentifierEXT", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint8_t("pipelineIdentifier")["VK_UUID_SIZE"]
}

val VkPhysicalDevicePipelinePropertiesFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDevicePipelinePropertiesFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("pipelinePropertiesIdentifier")
}

val VkPhysicalDeviceFrameBoundaryFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFrameBoundaryFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("frameBoundary")
}

val VkFrameBoundaryEXT = struct(Module.VULKAN, "VkFrameBoundaryEXT") {
    Expression("#STRUCTURE_TYPE_FRAME_BOUNDARY_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkFrameBoundaryFlagsEXT("flags")
    uint64_t("frameID")
    AutoSize("pImages", optional = true)..uint32_t("imageCount")
    nullable..VkImage.const.p("pImages")
    AutoSize("pBuffers", optional = true)..uint32_t("bufferCount")
    nullable..VkBuffer.const.p("pBuffers")
    uint64_t("tagName")
    AutoSize("pTag", optional = true)..size_t("tagSize")
    nullable..void.const.p("pTag")
}

val VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("multisampledRenderToSingleSampled")
}

val VkSubpassResolvePerformanceQueryEXT = struct(Module.VULKAN, "VkSubpassResolvePerformanceQueryEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_SUBPASS_RESOLVE_PERFORMANCE_QUERY_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("optimal")
}

val VkMultisampledRenderToSingleSampledInfoEXT = struct(Module.VULKAN, "VkMultisampledRenderToSingleSampledInfoEXT") {
    Expression("#STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("multisampledRenderToSingleSampledEnable")
    VkSampleCountFlagBits("rasterizationSamples")
}

val VkPhysicalDeviceExtendedDynamicState2FeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceExtendedDynamicState2FeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("extendedDynamicState2")
    VkBool32("extendedDynamicState2LogicOp")
    VkBool32("extendedDynamicState2PatchControlPoints")
}

val VkPhysicalDeviceColorWriteEnableFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceColorWriteEnableFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("colorWriteEnable")
}

val VkPipelineColorWriteCreateInfoEXT = struct(Module.VULKAN, "VkPipelineColorWriteCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pColorWriteEnables", optional = true)..uint32_t("attachmentCount")
    VkBool32.const.p("pColorWriteEnables")
}

val VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVES_GENERATED_QUERY_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("primitivesGeneratedQuery")
    VkBool32("primitivesGeneratedQueryWithRasterizerDiscard")
    VkBool32("primitivesGeneratedQueryWithNonZeroStreams")
}

val VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("rayTracingMaintenance1")
    VkBool32("rayTracingPipelineTraceRaysIndirect2")
}

val VkTraceRaysIndirectCommand2KHR = struct(Module.VULKAN, "VkTraceRaysIndirectCommand2KHR") {
    VkDeviceAddress("raygenShaderRecordAddress")
    VkDeviceSize("raygenShaderRecordSize")
    VkDeviceAddress("missShaderBindingTableAddress")
    VkDeviceSize("missShaderBindingTableSize")
    VkDeviceSize("missShaderBindingTableStride")
    VkDeviceAddress("hitShaderBindingTableAddress")
    VkDeviceSize("hitShaderBindingTableSize")
    VkDeviceSize("hitShaderBindingTableStride")
    VkDeviceAddress("callableShaderBindingTableAddress")
    VkDeviceSize("callableShaderBindingTableSize")
    VkDeviceSize("callableShaderBindingTableStride")
    uint32_t("width")
    uint32_t("height")
    uint32_t("depth")
}

val VkPhysicalDeviceShaderUntypedPointersFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderUntypedPointersFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_UNTYPED_POINTERS_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderUntypedPointers")
}

val VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT", alias = VkPhysicalDeviceGlobalPriorityQueryFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("globalPriorityQuery")
}

val VkQueueFamilyGlobalPriorityPropertiesEXT = struct(Module.VULKAN, "VkQueueFamilyGlobalPriorityPropertiesEXT", mutable = false, alias = VkQueueFamilyGlobalPriorityProperties) {
    javaImport("static org.lwjgl.vulkan.VK14.*")
    Expression("#STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    AutoSize("priorities")..uint32_t("priorityCount")
    VkQueueGlobalPriority("priorities")["VK_MAX_GLOBAL_PRIORITY_SIZE"]
}

val VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE = struct(Module.VULKAN, "VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_RGB_CONVERSION_FEATURES_VALVE")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("videoEncodeRgbConversion")
}

val VkVideoEncodeRgbConversionCapabilitiesVALVE = struct(Module.VULKAN, "VkVideoEncodeRgbConversionCapabilitiesVALVE", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_RGB_CONVERSION_CAPABILITIES_VALVE")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkVideoEncodeRgbModelConversionFlagsVALVE("rgbModels")
    VkVideoEncodeRgbRangeCompressionFlagsVALVE("rgbRanges")
    VkVideoEncodeRgbChromaOffsetFlagsVALVE("xChromaOffsets")
    VkVideoEncodeRgbChromaOffsetFlagsVALVE("yChromaOffsets")
}

val VkVideoEncodeProfileRgbConversionInfoVALVE = struct(Module.VULKAN, "VkVideoEncodeProfileRgbConversionInfoVALVE") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_PROFILE_RGB_CONVERSION_INFO_VALVE")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("performEncodeRgbConversion")
}

val VkVideoEncodeSessionRgbConversionCreateInfoVALVE = struct(Module.VULKAN, "VkVideoEncodeSessionRgbConversionCreateInfoVALVE") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_RGB_CONVERSION_CREATE_INFO_VALVE")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkVideoEncodeRgbModelConversionFlagBitsVALVE("rgbModel")
    VkVideoEncodeRgbRangeCompressionFlagBitsVALVE("rgbRange")
    VkVideoEncodeRgbChromaOffsetFlagBitsVALVE("xChromaOffset")
    VkVideoEncodeRgbChromaOffsetFlagBitsVALVE("yChromaOffset")
}

val VkPhysicalDeviceImageViewMinLodFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceImageViewMinLodFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_MIN_LOD_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("minLod")
}

val VkImageViewMinLodCreateInfoEXT = struct(Module.VULKAN, "VkImageViewMinLodCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    float("minLod")
}

val VkPhysicalDeviceMultiDrawFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMultiDrawFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("multiDraw")
}

val VkPhysicalDeviceMultiDrawPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMultiDrawPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxMultiDrawCount")
}

val VkMultiDrawInfoEXT = struct(Module.VULKAN, "VkMultiDrawInfoEXT") {
    uint32_t("firstVertex")
    uint32_t("vertexCount")
}

val VkMultiDrawIndexedInfoEXT = struct(Module.VULKAN, "VkMultiDrawIndexedInfoEXT") {
    uint32_t("firstIndex")
    uint32_t("indexCount")
    int32_t("vertexOffset")
}

val VkPhysicalDeviceImage2DViewOf3DFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceImage2DViewOf3DFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("image2DViewOf3D")
    VkBool32("sampler2DViewOf3D")
}

val VkPhysicalDeviceShaderTileImageFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderTileImageFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderTileImageColorReadAccess")
    VkBool32("shaderTileImageDepthReadAccess")
    VkBool32("shaderTileImageStencilReadAccess")
}

val VkPhysicalDeviceShaderTileImagePropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderTileImagePropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("shaderTileImageCoherentReadAccelerated")
    VkBool32("shaderTileImageReadSampleFromPixelRateInvocation")
    VkBool32("shaderTileImageReadFromHelperInvocation")
}

val VkMicromapUsageEXT = struct(Module.VULKAN, "VkMicromapUsageEXT") {
    uint32_t("count")
    uint32_t("subdivisionLevel")
    uint32_t("format")
}

val VkMicromapBuildInfoEXT = struct(Module.VULKAN, "VkMicromapBuildInfoEXT") {
    Expression("#STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkMicromapTypeEXT("type")
    VkBuildMicromapFlagsEXT("flags")
    VkBuildMicromapModeEXT("mode")
    VkMicromapEXT("dstMicromap")
    AutoSize("pUsageCounts", "ppUsageCounts", optional = true)..uint32_t("usageCountsCount")
    nullable..VkMicromapUsageEXT.const.p("pUsageCounts")
    nullable..VkMicromapUsageEXT.const.p.const.p("ppUsageCounts")
    VkDeviceOrHostAddressConstKHR("data")
    VkDeviceOrHostAddressKHR("scratchData")
    VkDeviceOrHostAddressConstKHR("triangleArray")
    VkDeviceSize("triangleArrayStride")
}

val VkMicromapCreateInfoEXT = struct(Module.VULKAN, "VkMicromapCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkMicromapCreateFlagsEXT("createFlags")
    VkBuffer("buffer")
    VkDeviceSize("offset")
    VkDeviceSize("size")
    VkMicromapTypeEXT("type")
    VkDeviceAddress("deviceAddress")
}

val VkPhysicalDeviceOpacityMicromapFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceOpacityMicromapFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("micromap")
    VkBool32("micromapCaptureReplay")
    VkBool32("micromapHostCommands")
}

val VkPhysicalDeviceOpacityMicromapPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceOpacityMicromapPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxOpacity2StateSubdivisionLevel")
    uint32_t("maxOpacity4StateSubdivisionLevel")
}

val VkMicromapVersionInfoEXT = struct(Module.VULKAN, "VkMicromapVersionInfoEXT") {
    Expression("#STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint8_t.const.p("pVersionData")
}

val VkCopyMicromapToMemoryInfoEXT = struct(Module.VULKAN, "VkCopyMicromapToMemoryInfoEXT") {
    Expression("#STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkMicromapEXT("src")
    VkDeviceOrHostAddressKHR("dst")
    VkCopyMicromapModeEXT("mode")
}

val VkCopyMemoryToMicromapInfoEXT = struct(Module.VULKAN, "VkCopyMemoryToMicromapInfoEXT") {
    Expression("#STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceOrHostAddressConstKHR("src")
    VkMicromapEXT("dst")
    VkCopyMicromapModeEXT("mode")
}

val VkCopyMicromapInfoEXT = struct(Module.VULKAN, "VkCopyMicromapInfoEXT") {
    Expression("#STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkMicromapEXT("src")
    VkMicromapEXT("dst")
    VkCopyMicromapModeEXT("mode")
}

val VkMicromapBuildSizesInfoEXT = struct(Module.VULKAN, "VkMicromapBuildSizesInfoEXT") {
    Expression("#STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceSize("micromapSize")
    VkDeviceSize("buildScratchSize")
    VkBool32("discardable")
}

val VkAccelerationStructureTrianglesOpacityMicromapEXT = struct(Module.VULKAN, "VkAccelerationStructureTrianglesOpacityMicromapEXT") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkIndexType("indexType")
    VkDeviceOrHostAddressConstKHR("indexBuffer")
    VkDeviceSize("indexStride")
    uint32_t("baseTriangle")
    AutoSize("pUsageCounts", "ppUsageCounts", optional = true)..uint32_t("usageCountsCount")
    nullable..VkMicromapUsageEXT.const.p("pUsageCounts")
    nullable..VkMicromapUsageEXT.const.p.const.p("ppUsageCounts")
    VkMicromapEXT("micromap")
}

val VkMicromapTriangleEXT = struct(Module.VULKAN, "VkMicromapTriangleEXT") {
    uint32_t("dataOffset")
    uint16_t("subdivisionLevel")
    uint16_t("format")
}

val VkPhysicalDeviceDisplacementMicromapFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceDisplacementMicromapFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("displacementMicromap")
}

val VkPhysicalDeviceDisplacementMicromapPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceDisplacementMicromapPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxDisplacementMicromapSubdivisionLevel")
}

val VkAccelerationStructureTrianglesDisplacementMicromapNV = struct(Module.VULKAN, "VkAccelerationStructureTrianglesDisplacementMicromapNV") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkFormat("displacementBiasAndScaleFormat")
    VkFormat("displacementVectorFormat")
    VkDeviceOrHostAddressConstKHR("displacementBiasAndScaleBuffer")
    VkDeviceSize("displacementBiasAndScaleStride")
    VkDeviceOrHostAddressConstKHR("displacementVectorBuffer")
    VkDeviceSize("displacementVectorStride")
    VkDeviceOrHostAddressConstKHR("displacedMicromapPrimitiveFlags")
    VkDeviceSize("displacedMicromapPrimitiveFlagsStride")
    VkIndexType("indexType")
    VkDeviceOrHostAddressConstKHR("indexBuffer")
    VkDeviceSize("indexStride")
    uint32_t("baseTriangle")
    AutoSize("pUsageCounts", "ppUsageCounts", optional = true)..uint32_t("usageCountsCount")
    nullable..VkMicromapUsageEXT.const.p("pUsageCounts")
    nullable..VkMicromapUsageEXT.const.p.const.p("ppUsageCounts")
    VkMicromapEXT("micromap")
}

val VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI = struct(Module.VULKAN, "VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI")..VkStructureType("sType")
    PointerSetter(
        "VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI",
        prepend = true
    )..nullable..opaque_p("pNext")
    VkBool32("clustercullingShader")
    VkBool32("multiviewClusterCullingShader")
}

val VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI = struct(Module.VULKAN, "VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxWorkGroupCount")[3]
    uint32_t("maxWorkGroupSize")[3]
    uint32_t("maxOutputClusterCount")
    VkDeviceSize("indirectBufferOffsetAlignment")
}

val VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI = struct(Module.VULKAN, "VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("clusterShadingRate")
}

val VkPhysicalDeviceBorderColorSwizzleFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceBorderColorSwizzleFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("borderColorSwizzle")
    VkBool32("borderColorSwizzleFromImage")
}

val VkSamplerBorderColorComponentMappingCreateInfoEXT = struct(Module.VULKAN, "VkSamplerBorderColorComponentMappingCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkComponentMapping("components")
    VkBool32("srgb")
}

val VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("pageableDeviceLocalMemory")
}

val VkPhysicalDeviceMaintenance4FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance4FeaturesKHR", alias = VkPhysicalDeviceMaintenance4Features) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("maintenance4")
}

val VkPhysicalDeviceMaintenance4PropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance4PropertiesKHR", mutable = false, alias = VkPhysicalDeviceMaintenance4Properties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceSize("maxBufferSize")
}

val VkDeviceBufferMemoryRequirementsKHR = struct(Module.VULKAN, "VkDeviceBufferMemoryRequirementsKHR", alias = VkDeviceBufferMemoryRequirements) {
    Expression("#STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBufferCreateInfo.const.p("pCreateInfo")
}

val VkDeviceImageMemoryRequirementsKHR = struct(Module.VULKAN, "VkDeviceImageMemoryRequirementsKHR", alias = VkDeviceImageMemoryRequirements) {
    Expression("#STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageCreateInfo.const.p("pCreateInfo")
    VkImageAspectFlagBits("planeAspect")
}

val VkPhysicalDeviceShaderCorePropertiesARM = struct(Module.VULKAN, "VkPhysicalDeviceShaderCorePropertiesARM", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("pixelRate")
    uint32_t("texelRate")
    uint32_t("fmaRate")
}

val VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR", alias = VkPhysicalDeviceShaderSubgroupRotateFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderSubgroupRotate")
    VkBool32("shaderSubgroupRotateClustered")
}

val VkDeviceQueueShaderCoreControlCreateInfoARM = struct(Module.VULKAN, "VkDeviceQueueShaderCoreControlCreateInfoARM") {
    Expression("#STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    uint32_t("shaderCoreCount")
}

val VkPhysicalDeviceSchedulingControlsFeaturesARM = struct(Module.VULKAN, "VkPhysicalDeviceSchedulingControlsFeaturesARM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("schedulingControls")
}

val VkPhysicalDeviceSchedulingControlsPropertiesARM = struct(Module.VULKAN, "VkPhysicalDeviceSchedulingControlsPropertiesARM", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPhysicalDeviceSchedulingControlsFlagsARM("schedulingControlsFlags")
}

val VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("imageSlicedViewOf3D")
}

val VkImageViewSlicedCreateInfoEXT = struct(Module.VULKAN, "VkImageViewSlicedCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("sliceOffset")
    uint32_t("sliceCount")
}

val VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("descriptorSetHostMapping")
}

val VkDescriptorSetBindingReferenceVALVE = struct(Module.VULKAN, "VkDescriptorSetBindingReferenceVALVE") {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDescriptorSetLayout("descriptorSetLayout")
    uint32_t("binding")
}

val VkDescriptorSetLayoutHostMappingInfoVALVE = struct(Module.VULKAN, "VkDescriptorSetLayoutHostMappingInfoVALVE") {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    size_t("descriptorOffset")
    uint32_t("descriptorSize")
}

val _VkPhysicalDeviceDepthClampZeroOneFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceDepthClampZeroOneFeaturesKHR")
val VkPhysicalDeviceDepthClampZeroOneFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDepthClampZeroOneFeaturesEXT", alias = _VkPhysicalDeviceDepthClampZeroOneFeaturesKHR) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("depthClampZeroOne")
}

val VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_NON_SEAMLESS_CUBE_MAP_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("nonSeamlessCubeMap")
}

val VkPhysicalDeviceRenderPassStripedFeaturesARM = struct(Module.VULKAN, "VkPhysicalDeviceRenderPassStripedFeaturesARM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("renderPassStriped")
}

val VkPhysicalDeviceRenderPassStripedPropertiesARM = struct(Module.VULKAN, "VkPhysicalDeviceRenderPassStripedPropertiesARM", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExtent2D("renderPassStripeGranularity")
    uint32_t("maxRenderPassStripes")
}

val VkRenderPassStripeInfoARM = struct(Module.VULKAN, "VkRenderPassStripeInfoARM") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkRect2D("stripeArea")
}

val VkRenderPassStripeBeginInfoARM = struct(Module.VULKAN, "VkRenderPassStripeBeginInfoARM") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pStripeInfos")..uint32_t("stripeInfoCount")
    VkRenderPassStripeInfoARM.const.p("pStripeInfos")
}

val VkRenderPassStripeSubmitInfoARM = struct(Module.VULKAN, "VkRenderPassStripeSubmitInfoARM") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pStripeSemaphoreInfos")..uint32_t("stripeSemaphoreInfoCount")
    VkSemaphoreSubmitInfo.const.p("pStripeSemaphoreInfos")
}

val _VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT")
val VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM", alias = _VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("fragmentDensityMapOffset")
}

val _VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT")
val VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM", mutable = false, alias = _VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExtent2D("fragmentDensityOffsetGranularity")
}

val _VkRenderPassFragmentDensityMapOffsetEndInfoEXT = struct(Module.VULKAN, "VkRenderPassFragmentDensityMapOffsetEndInfoEXT")
val VkSubpassFragmentDensityMapOffsetEndInfoQCOM = struct(Module.VULKAN, "VkSubpassFragmentDensityMapOffsetEndInfoQCOM", alias = _VkRenderPassFragmentDensityMapOffsetEndInfoEXT) {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pFragmentDensityOffsets", optional = true)..uint32_t("fragmentDensityOffsetCount")
    VkOffset2D.const.p("pFragmentDensityOffsets")
}

val _VkCopyMemoryIndirectCommandKHR = struct(Module.VULKAN, "VkCopyMemoryIndirectCommandKHR")
val VkCopyMemoryIndirectCommandNV = struct(Module.VULKAN, "VkCopyMemoryIndirectCommandNV", alias = _VkCopyMemoryIndirectCommandKHR) {
    VkDeviceAddress("srcAddress")
    VkDeviceAddress("dstAddress")
    VkDeviceSize("size")
}

val _VkCopyMemoryToImageIndirectCommandKHR = struct(Module.VULKAN, "VkCopyMemoryToImageIndirectCommandKHR")
val VkCopyMemoryToImageIndirectCommandNV = struct(Module.VULKAN, "VkCopyMemoryToImageIndirectCommandNV", alias = _VkCopyMemoryToImageIndirectCommandKHR) {
    VkDeviceAddress("srcAddress")
    uint32_t("bufferRowLength")
    uint32_t("bufferImageHeight")
    VkImageSubresourceLayers("imageSubresource")
    VkOffset3D("imageOffset")
    VkExtent3D("imageExtent")
}

val VkPhysicalDeviceCopyMemoryIndirectFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceCopyMemoryIndirectFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("indirectCopy")
}

val _VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR")
val VkPhysicalDeviceCopyMemoryIndirectPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceCopyMemoryIndirectPropertiesNV", mutable = false, alias = _VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkQueueFlags("supportedQueues")
}

val VkDecompressMemoryRegionNV = struct(Module.VULKAN, "VkDecompressMemoryRegionNV") {
    VkDeviceAddress("srcAddress")
    VkDeviceAddress("dstAddress")
    VkDeviceSize("compressedSize")
    VkDeviceSize("decompressedSize")
    VkMemoryDecompressionMethodFlagsNV("decompressionMethod")
}

val _VkPhysicalDeviceMemoryDecompressionFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMemoryDecompressionFeaturesEXT")
val VkPhysicalDeviceMemoryDecompressionFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceMemoryDecompressionFeaturesNV", alias = _VkPhysicalDeviceMemoryDecompressionFeaturesEXT) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("memoryDecompression")
}

val _VkPhysicalDeviceMemoryDecompressionPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMemoryDecompressionPropertiesEXT")
val VkPhysicalDeviceMemoryDecompressionPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceMemoryDecompressionPropertiesNV", mutable = false, alias = _VkPhysicalDeviceMemoryDecompressionPropertiesEXT) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkMemoryDecompressionMethodFlagsEXT("decompressionMethods")
    uint64_t("maxDecompressionIndirectCount")
}

val VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("deviceGeneratedCompute")
    VkBool32("deviceGeneratedComputePipelines")
    VkBool32("deviceGeneratedComputeCaptureReplay")
}

val VkComputePipelineIndirectBufferInfoNV = struct(Module.VULKAN, "VkComputePipelineIndirectBufferInfoNV") {
    Expression("#STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceAddress("deviceAddress")
    VkDeviceSize("size")
    VkDeviceAddress("pipelineDeviceAddressCaptureReplay")
}

val VkPipelineIndirectDeviceAddressInfoNV = struct(Module.VULKAN, "VkPipelineIndirectDeviceAddressInfoNV") {
    Expression("#STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineBindPoint("pipelineBindPoint")
    VkPipeline("pipeline")
}

val VkBindPipelineIndirectCommandNV = struct(Module.VULKAN, "VkBindPipelineIndirectCommandNV") {
    VkDeviceAddress("pipelineAddress")
}

val VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_LINEAR_SWEPT_SPHERES_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("spheres")
    VkBool32("linearSweptSpheres")
}

val VkAccelerationStructureGeometryLinearSweptSpheresDataNV = struct(Module.VULKAN, "VkAccelerationStructureGeometryLinearSweptSpheresDataNV") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkFormat("vertexFormat")
    VkDeviceOrHostAddressConstKHR("vertexData")
    VkDeviceSize("vertexStride")
    VkFormat("radiusFormat")
    VkDeviceOrHostAddressConstKHR("radiusData")
    VkDeviceSize("radiusStride")
    VkIndexType("indexType")
    VkDeviceOrHostAddressConstKHR("indexData")
    VkDeviceSize("indexStride")
    VkRayTracingLssIndexingModeNV("indexingMode")
    VkRayTracingLssPrimitiveEndCapsModeNV("endCapsMode")
}

val VkAccelerationStructureGeometrySpheresDataNV = struct(Module.VULKAN, "VkAccelerationStructureGeometrySpheresDataNV") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_SPHERES_DATA_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkFormat("vertexFormat")
    VkDeviceOrHostAddressConstKHR("vertexData")
    VkDeviceSize("vertexStride")
    VkFormat("radiusFormat")
    VkDeviceOrHostAddressConstKHR("radiusData")
    VkDeviceSize("radiusStride")
    VkIndexType("indexType")
    VkDeviceOrHostAddressConstKHR("indexData")
    VkDeviceSize("indexStride")
}

val VkPhysicalDeviceLinearColorAttachmentFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceLinearColorAttachmentFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_LINEAR_COLOR_ATTACHMENT_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("linearColorAttachment")
}

val VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MAXIMAL_RECONVERGENCE_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderMaximalReconvergence")
}

val VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("imageCompressionControlSwapchain")
}

val VkImageViewSampleWeightCreateInfoQCOM = struct(Module.VULKAN, "VkImageViewSampleWeightCreateInfoQCOM") {
    Expression("#STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkOffset2D("filterCenter")
    VkExtent2D("filterSize")
    uint32_t("numPhases")
}

val VkPhysicalDeviceImageProcessingFeaturesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceImageProcessingFeaturesQCOM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("textureSampleWeighted")
    VkBool32("textureBoxFilter")
    VkBool32("textureBlockMatch")
}

val VkPhysicalDeviceImageProcessingPropertiesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceImageProcessingPropertiesQCOM", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxWeightFilterPhases")
    VkExtent2D("maxWeightFilterDimension")
    VkExtent2D("maxBlockMatchRegion")
    VkExtent2D("maxBoxFilterBlockSize")
}

val VkPhysicalDeviceNestedCommandBufferFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceNestedCommandBufferFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("nestedCommandBuffer")
    VkBool32("nestedCommandBufferRendering")
    VkBool32("nestedCommandBufferSimultaneousUse")
}

val VkPhysicalDeviceNestedCommandBufferPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceNestedCommandBufferPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxCommandBufferNestingLevel")
}

val VkExternalMemoryAcquireUnmodifiedEXT = struct(Module.VULKAN, "VkExternalMemoryAcquireUnmodifiedEXT") {
    Expression("#STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("acquireUnmodifiedMemory")
}

val VkPhysicalDeviceExtendedDynamicState3FeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceExtendedDynamicState3FeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("extendedDynamicState3TessellationDomainOrigin")
    VkBool32("extendedDynamicState3DepthClampEnable")
    VkBool32("extendedDynamicState3PolygonMode")
    VkBool32("extendedDynamicState3RasterizationSamples")
    VkBool32("extendedDynamicState3SampleMask")
    VkBool32("extendedDynamicState3AlphaToCoverageEnable")
    VkBool32("extendedDynamicState3AlphaToOneEnable")
    VkBool32("extendedDynamicState3LogicOpEnable")
    VkBool32("extendedDynamicState3ColorBlendEnable")
    VkBool32("extendedDynamicState3ColorBlendEquation")
    VkBool32("extendedDynamicState3ColorWriteMask")
    VkBool32("extendedDynamicState3RasterizationStream")
    VkBool32("extendedDynamicState3ConservativeRasterizationMode")
    VkBool32("extendedDynamicState3ExtraPrimitiveOverestimationSize")
    VkBool32("extendedDynamicState3DepthClipEnable")
    VkBool32("extendedDynamicState3SampleLocationsEnable")
    VkBool32("extendedDynamicState3ColorBlendAdvanced")
    VkBool32("extendedDynamicState3ProvokingVertexMode")
    VkBool32("extendedDynamicState3LineRasterizationMode")
    VkBool32("extendedDynamicState3LineStippleEnable")
    VkBool32("extendedDynamicState3DepthClipNegativeOneToOne")
    VkBool32("extendedDynamicState3ViewportWScalingEnable")
    VkBool32("extendedDynamicState3ViewportSwizzle")
    VkBool32("extendedDynamicState3CoverageToColorEnable")
    VkBool32("extendedDynamicState3CoverageToColorLocation")
    VkBool32("extendedDynamicState3CoverageModulationMode")
    VkBool32("extendedDynamicState3CoverageModulationTableEnable")
    VkBool32("extendedDynamicState3CoverageModulationTable")
    VkBool32("extendedDynamicState3CoverageReductionMode")
    VkBool32("extendedDynamicState3RepresentativeFragmentTestEnable")
    VkBool32("extendedDynamicState3ShadingRateImageEnable")
}

val VkPhysicalDeviceExtendedDynamicState3PropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceExtendedDynamicState3PropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("dynamicPrimitiveTopologyUnrestricted")
}

val VkColorBlendEquationEXT = struct(Module.VULKAN, "VkColorBlendEquationEXT") {
    VkBlendFactor("srcColorBlendFactor")
    VkBlendFactor("dstColorBlendFactor")
    VkBlendOp("colorBlendOp")
    VkBlendFactor("srcAlphaBlendFactor")
    VkBlendFactor("dstAlphaBlendFactor")
    VkBlendOp("alphaBlendOp")
}

val VkColorBlendAdvancedEXT = struct(Module.VULKAN, "VkColorBlendAdvancedEXT") {
    VkBlendOp("advancedBlendOp")
    VkBool32("srcPremultiplied")
    VkBool32("dstPremultiplied")
    VkBlendOverlapEXT("blendOverlap")
    VkBool32("clampResults")
}

val VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_MERGE_FEEDBACK_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("subpassMergeFeedback")
}

val VkRenderPassCreationControlEXT = struct(Module.VULKAN, "VkRenderPassCreationControlEXT") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_CREATION_CONTROL_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("disallowMerging")
}

val VkRenderPassCreationFeedbackInfoEXT = struct(Module.VULKAN, "VkRenderPassCreationFeedbackInfoEXT", mutable = false) {
    uint32_t("postMergeSubpassCount")
}

val VkRenderPassCreationFeedbackCreateInfoEXT = struct(Module.VULKAN, "VkRenderPassCreationFeedbackCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkRenderPassCreationFeedbackInfoEXT.p("pRenderPassFeedback")
}

val VkRenderPassSubpassFeedbackInfoEXT = struct(Module.VULKAN, "VkRenderPassSubpassFeedbackInfoEXT", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    VkSubpassMergeStatusEXT("subpassMergeStatus")
    charUTF8("description")["VK_MAX_DESCRIPTION_SIZE"]
    uint32_t("postMergeIndex")
}

val VkRenderPassSubpassFeedbackCreateInfoEXT = struct(Module.VULKAN, "VkRenderPassSubpassFeedbackCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkRenderPassSubpassFeedbackInfoEXT.p("pSubpassFeedback")
}

val VkDirectDriverLoadingInfoLUNARG = struct(Module.VULKAN, "VkDirectDriverLoadingInfoLUNARG") {
    Expression("#STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkDirectDriverLoadingFlagsLUNARG("flags")
    PFN_vkGetInstanceProcAddrLUNARG("pfnGetInstanceProcAddr")
}

val VkDirectDriverLoadingListLUNARG = struct(Module.VULKAN, "VkDirectDriverLoadingListLUNARG") {
    Expression("#STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDirectDriverLoadingModeLUNARG("mode")
    AutoSize("pDrivers")..uint32_t("driverCount")
    VkDirectDriverLoadingInfoLUNARG.const.p("pDrivers")
}

val VkTensorDescriptionARM = struct(Module.VULKAN, "VkTensorDescriptionARM") {
    Expression("#STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkTensorTilingARM("tiling")
    VkFormat("format")
    AutoSize("pDimensions", "pStrides")..uint32_t("dimensionCount")
    int64_t.const.p("pDimensions")
    nullable..int64_t.const.p("pStrides")
    VkTensorUsageFlagsARM("usage")
}

val VkTensorCreateInfoARM = struct(Module.VULKAN, "VkTensorCreateInfoARM") {
    Expression("#STRUCTURE_TYPE_TENSOR_CREATE_INFO_ARM")..VkStructureType("sType")
    PointerSetter(
        "VkExternalMemoryTensorCreateInfoARM", "VkOpaqueCaptureDataCreateInfoEXT", "VkOpaqueCaptureDescriptorDataCreateInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkTensorCreateFlagsARM("flags")
    VkTensorDescriptionARM.const.p("pDescription")
    VkSharingMode("sharingMode")
    AutoSize("pQueueFamilyIndices", optional = true)..uint32_t("queueFamilyIndexCount")
    nullable..uint32_t.const.p("pQueueFamilyIndices")
}

val VkTensorMemoryRequirementsInfoARM = struct(Module.VULKAN, "VkTensorMemoryRequirementsInfoARM") {
    Expression("#STRUCTURE_TYPE_TENSOR_MEMORY_REQUIREMENTS_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkTensorARM("tensor")
}

val VkBindTensorMemoryInfoARM = struct(Module.VULKAN, "VkBindTensorMemoryInfoARM") {
    Expression("#STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkTensorARM("tensor")
    VkDeviceMemory("memory")
    VkDeviceSize("memoryOffset")
}

val VkWriteDescriptorSetTensorARM = struct(Module.VULKAN, "VkWriteDescriptorSetTensorARM") {
    Expression("#STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pTensorViews", optional = true)..uint32_t("tensorViewCount")
    nullable..VkTensorViewARM.const.p("pTensorViews")
}

val VkTensorFormatPropertiesARM = struct(Module.VULKAN, "VkTensorFormatPropertiesARM", mutable = false) {
    Expression("#STRUCTURE_TYPE_TENSOR_FORMAT_PROPERTIES_ARM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkFormatFeatureFlags2("optimalTilingTensorFeatures")
    VkFormatFeatureFlags2("linearTilingTensorFeatures")
}

val VkPhysicalDeviceTensorPropertiesARM = struct(Module.VULKAN, "VkPhysicalDeviceTensorPropertiesARM", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxTensorDimensionCount")
    uint64_t("maxTensorElements")
    uint64_t("maxPerDimensionTensorElements")
    int64_t("maxTensorStride")
    uint64_t("maxTensorSize")
    uint32_t("maxTensorShaderAccessArrayLength")
    uint32_t("maxTensorShaderAccessSize")
    uint32_t("maxDescriptorSetStorageTensors")
    uint32_t("maxPerStageDescriptorSetStorageTensors")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageTensors")
    uint32_t("maxPerStageDescriptorUpdateAfterBindStorageTensors")
    VkBool32("shaderStorageTensorArrayNonUniformIndexingNative")
    VkShaderStageFlags("shaderTensorSupportedStages")
}

val VkTensorMemoryBarrierARM = struct(Module.VULKAN, "VkTensorMemoryBarrierARM") {
    Expression("#STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineStageFlags2("srcStageMask")
    VkAccessFlags2("srcAccessMask")
    VkPipelineStageFlags2("dstStageMask")
    VkAccessFlags2("dstAccessMask")
    uint32_t("srcQueueFamilyIndex")
    uint32_t("dstQueueFamilyIndex")
    VkTensorARM("tensor")
}

val VkTensorDependencyInfoARM = struct(Module.VULKAN, "VkTensorDependencyInfoARM") {
    Expression("#STRUCTURE_TYPE_TENSOR_DEPENDENCY_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("tensorMemoryBarrierCount")
    VkTensorMemoryBarrierARM.const.p("pTensorMemoryBarriers")
}

val VkPhysicalDeviceTensorFeaturesARM = struct(Module.VULKAN, "VkPhysicalDeviceTensorFeaturesARM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("tensorNonPacked")
    VkBool32("shaderTensorAccess")
    VkBool32("shaderStorageTensorArrayDynamicIndexing")
    VkBool32("shaderStorageTensorArrayNonUniformIndexing")
    VkBool32("descriptorBindingStorageTensorUpdateAfterBind")
    VkBool32("tensors")
}

val VkDeviceTensorMemoryRequirementsARM = struct(Module.VULKAN, "VkDeviceTensorMemoryRequirementsARM") {
    Expression("#STRUCTURE_TYPE_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkTensorCreateInfoARM.const.p("pCreateInfo")
}

val VkTensorCopyARM = struct(Module.VULKAN, "VkTensorCopyARM") {
    Expression("#STRUCTURE_TYPE_TENSOR_COPY_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pSrcOffset", "pDstOffset", "pExtent", optional = true)..uint32_t("dimensionCount")
    nullable..uint64_t.const.p("pSrcOffset")
    nullable..uint64_t.const.p("pDstOffset")
    nullable..uint64_t.const.p("pExtent")
}

val VkCopyTensorInfoARM = struct(Module.VULKAN, "VkCopyTensorInfoARM") {
    Expression("#STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkTensorARM("srcTensor")
    VkTensorARM("dstTensor")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkTensorCopyARM.const.p("pRegions")
}

val VkMemoryDedicatedAllocateInfoTensorARM = struct(Module.VULKAN, "VkMemoryDedicatedAllocateInfoTensorARM") {
    Expression("#STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO_TENSOR_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkTensorARM("tensor")
}

val VkPhysicalDeviceExternalTensorInfoARM = struct(Module.VULKAN, "VkPhysicalDeviceExternalTensorInfoARM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkTensorCreateFlagsARM("flags")
    VkTensorDescriptionARM.const.p("pDescription")
    VkExternalMemoryHandleTypeFlagBits("handleType")
}

val VkExternalTensorPropertiesARM = struct(Module.VULKAN, "VkExternalTensorPropertiesARM") {
    Expression("#STRUCTURE_TYPE_EXTERNAL_TENSOR_PROPERTIES_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryProperties("externalMemoryProperties")
}

val VkExternalMemoryTensorCreateInfoARM = struct(Module.VULKAN, "VkExternalMemoryTensorCreateInfoARM") {
    Expression("#STRUCTURE_TYPE_EXTERNAL_MEMORY_TENSOR_CREATE_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlags("handleTypes")
}

val VkPhysicalDeviceDescriptorBufferTensorFeaturesARM = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorBufferTensorFeaturesARM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("descriptorBufferTensorDescriptors")
}

val VkPhysicalDeviceDescriptorBufferTensorPropertiesARM = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorBufferTensorPropertiesARM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    size_t("tensorCaptureReplayDescriptorDataSize")
    size_t("tensorViewCaptureReplayDescriptorDataSize")
    size_t("tensorDescriptorSize")
}

val VkDescriptorGetTensorInfoARM = struct(Module.VULKAN, "VkDescriptorGetTensorInfoARM") {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_GET_TENSOR_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkTensorViewARM("tensorView")
}

val VkTensorCaptureDescriptorDataInfoARM = struct(Module.VULKAN, "VkTensorCaptureDescriptorDataInfoARM") {
    Expression("#STRUCTURE_TYPE_TENSOR_CAPTURE_DESCRIPTOR_DATA_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkTensorARM("tensor")
}

val VkTensorViewCaptureDescriptorDataInfoARM = struct(Module.VULKAN, "VkTensorViewCaptureDescriptorDataInfoARM") {
    Expression("#STRUCTURE_TYPE_TENSOR_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkTensorViewARM("tensorView")
}

val VkFrameBoundaryTensorsARM = struct(Module.VULKAN, "VkFrameBoundaryTensorsARM") {
    Expression("#STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pTensors")..uint32_t("tensorCount")
    VkTensorARM.const.p("pTensors")
}

val VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderModuleIdentifier")
}

val VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint8_t("shaderModuleIdentifierAlgorithmUUID")["VK_UUID_SIZE"]
}

val VkPipelineShaderStageModuleIdentifierCreateInfoEXT = struct(Module.VULKAN, "VkPipelineShaderStageModuleIdentifierCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pIdentifier", optional = true)..uint32_t("identifierSize")
    uint8_t.const.p("pIdentifier")
}

val VkShaderModuleIdentifierEXT = struct(Module.VULKAN, "VkShaderModuleIdentifierEXT", mutable = false) {
    javaImport("static org.lwjgl.vulkan.EXTShaderModuleIdentifier.*")
    Expression("#STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    AutoSize("identifier")..uint32_t("identifierSize")
    uint8_t("identifier")["VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT"]
}

val VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("rasterizationOrderColorAttachmentAccess")
    VkBool32("rasterizationOrderDepthAttachmentAccess")
    VkBool32("rasterizationOrderStencilAttachmentAccess")
}

val VkPhysicalDeviceOpticalFlowFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceOpticalFlowFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("opticalFlow")
}

val VkPhysicalDeviceOpticalFlowPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceOpticalFlowPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkOpticalFlowGridSizeFlagsNV("supportedOutputGridSizes")
    VkOpticalFlowGridSizeFlagsNV("supportedHintGridSizes")
    VkBool32("hintSupported")
    VkBool32("costSupported")
    VkBool32("bidirectionalFlowSupported")
    VkBool32("globalFlowSupported")
    uint32_t("minWidth")
    uint32_t("minHeight")
    uint32_t("maxWidth")
    uint32_t("maxHeight")
    uint32_t("maxNumRegionsOfInterest")
}

val VkOpticalFlowImageFormatInfoNV = struct(Module.VULKAN, "VkOpticalFlowImageFormatInfoNV") {
    Expression("#STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkOpticalFlowUsageFlagsNV("usage")
}

val VkOpticalFlowImageFormatPropertiesNV = struct(Module.VULKAN, "VkOpticalFlowImageFormatPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkFormat("format")
}

val VkOpticalFlowSessionCreateInfoNV = struct(Module.VULKAN, "VkOpticalFlowSessionCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV")..VkStructureType("sType")
    PointerSetter(
        "VkOpticalFlowSessionCreatePrivateDataInfoNV",
        prepend = true
    )..nullable..opaque_p("pNext")
    uint32_t("width")
    uint32_t("height")
    VkFormat("imageFormat")
    VkFormat("flowVectorFormat")
    VkFormat("costFormat")
    VkOpticalFlowGridSizeFlagsNV("outputGridSize")
    VkOpticalFlowGridSizeFlagsNV("hintGridSize")
    VkOpticalFlowPerformanceLevelNV("performanceLevel")
    VkOpticalFlowSessionCreateFlagsNV("flags")
}

val VkOpticalFlowSessionCreatePrivateDataInfoNV = struct(Module.VULKAN, "VkOpticalFlowSessionCreatePrivateDataInfoNV") {
    Expression("#STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    uint32_t("id")
    uint32_t("size")
    opaque_const_p("pPrivateData")
}

val VkOpticalFlowExecuteInfoNV = struct(Module.VULKAN, "VkOpticalFlowExecuteInfoNV") {
    Expression("#STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkOpticalFlowExecuteFlagsNV("flags")
    AutoSize("pRegions", optional = true)..uint32_t("regionCount")
    VkRect2D.const.p("pRegions")
}

val VkPhysicalDeviceLegacyDitheringFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceLegacyDitheringFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_DITHERING_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("legacyDithering")
}

val VkPhysicalDevicePipelineProtectedAccessFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDevicePipelineProtectedAccessFeaturesEXT", alias = VkPhysicalDevicePipelineProtectedAccessFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("pipelineProtectedAccess")
}

val VkPhysicalDeviceExternalFormatResolveFeaturesANDROID = struct(Module.VULKAN, "VkPhysicalDeviceExternalFormatResolveFeaturesANDROID") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_FEATURES_ANDROID")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("externalFormatResolve")
}

val VkPhysicalDeviceExternalFormatResolvePropertiesANDROID = struct(Module.VULKAN, "VkPhysicalDeviceExternalFormatResolvePropertiesANDROID", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_PROPERTIES_ANDROID")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("nullColorAttachmentWithExternalFormatResolve")
    VkChromaLocation("externalFormatResolveChromaOffsetX")
    VkChromaLocation("externalFormatResolveChromaOffsetY")
}

val VkAndroidHardwareBufferFormatResolvePropertiesANDROID = struct(Module.VULKAN, "VkAndroidHardwareBufferFormatResolvePropertiesANDROID", mutable = false) {
    Expression("#STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_RESOLVE_PROPERTIES_ANDROID")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkFormat("colorAttachmentFormat")
}

val VkPhysicalDeviceMaintenance5FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance5FeaturesKHR", alias = VkPhysicalDeviceMaintenance5Features) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("maintenance5")
}

val VkPhysicalDeviceMaintenance5PropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance5PropertiesKHR", mutable = false, alias = VkPhysicalDeviceMaintenance5Properties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("earlyFragmentMultisampleCoverageAfterSampleCounting")
    VkBool32("earlyFragmentSampleMaskTestBeforeSampleCounting")
    VkBool32("depthStencilSwizzleOneSupport")
    VkBool32("polygonModePointSize")
    VkBool32("nonStrictSinglePixelWideLinesUseParallelogram")
    VkBool32("nonStrictWideLinesUseParallelogram")
}

val VkRenderingAreaInfoKHR = struct(Module.VULKAN, "VkRenderingAreaInfoKHR", alias = VkRenderingAreaInfo) {
    Expression("#STRUCTURE_TYPE_RENDERING_AREA_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("viewMask")
    AutoSize("pColorAttachmentFormats", optional = true)..uint32_t("colorAttachmentCount")
    nullable..VkFormat.const.p("pColorAttachmentFormats")
    VkFormat("depthAttachmentFormat")
    VkFormat("stencilAttachmentFormat")
}

val VkDeviceImageSubresourceInfoKHR = struct(Module.VULKAN, "VkDeviceImageSubresourceInfoKHR", alias = VkDeviceImageSubresourceInfo) {
    Expression("#STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageCreateInfo.const.p("pCreateInfo")
    VkImageSubresource2.const.p("pSubresource")
}

val VkImageSubresource2KHR = struct(Module.VULKAN, "VkImageSubresource2KHR", alias = VkImageSubresource2) {
    Expression("#STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkImageSubresource("imageSubresource")
}

val VkSubresourceLayout2KHR = struct(Module.VULKAN, "VkSubresourceLayout2KHR", mutable = false, alias = VkSubresourceLayout2) {
    Expression("#STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkSubresourceLayout("subresourceLayout")
}

val VkPipelineCreateFlags2CreateInfoKHR = struct(Module.VULKAN, "VkPipelineCreateFlags2CreateInfoKHR", alias = VkPipelineCreateFlags2CreateInfo) {
    Expression("#STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineCreateFlags2("flags")
}

val VkBufferUsageFlags2CreateInfoKHR = struct(Module.VULKAN, "VkBufferUsageFlags2CreateInfoKHR", alias = VkBufferUsageFlags2CreateInfo) {
    Expression("#STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBufferUsageFlags2("usage")
}

val VkPhysicalDeviceAntiLagFeaturesAMD = struct(Module.VULKAN, "VkPhysicalDeviceAntiLagFeaturesAMD") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("antiLag")
}

val VkAntiLagPresentationInfoAMD = struct(Module.VULKAN, "VkAntiLagPresentationInfoAMD") {
    Expression("#STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkAntiLagStageAMD("stage")
    uint64_t("frameIndex")
}

val VkAntiLagDataAMD = struct(Module.VULKAN, "VkAntiLagDataAMD") {
    Expression("#STRUCTURE_TYPE_ANTI_LAG_DATA_AMD")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAntiLagModeAMD("mode")
    uint32_t("maxFPS")
    nullable..VkAntiLagPresentationInfoAMD.const.p("pPresentationInfo")
}

val VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX = struct(Module.VULKAN, "VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DENSE_GEOMETRY_FORMAT_FEATURES_AMDX")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("denseGeometryFormat")
}

val VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX = struct(Module.VULKAN, "VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX") {
    Expression("#STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DENSE_GEOMETRY_FORMAT_TRIANGLES_DATA_AMDX")..VkStructureType("sType")
    PointerSetter(
        "VkAccelerationStructureTrianglesOpacityMicromapEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDeviceOrHostAddressConstKHR("compressedData")
    VkDeviceSize("dataSize")
    uint32_t("numTriangles")
    uint32_t("numVertices")
    uint32_t("maxPrimitiveIndex")
    uint32_t("maxGeometryIndex")
    VkCompressedTriangleFormatAMDX("format")
}

val VkSurfaceCapabilitiesPresentId2KHR = struct(Module.VULKAN, "VkSurfaceCapabilitiesPresentId2KHR") {
    Expression("#STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_ID_2_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("presentId2Supported")
}

val VkPresentId2KHR = struct(Module.VULKAN, "VkPresentId2KHR") {
    Expression("#STRUCTURE_TYPE_PRESENT_ID_2_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pPresentIds", optional = true)..uint32_t("swapchainCount")
    nullable..uint64_t.const.p("pPresentIds")
}

val VkPhysicalDevicePresentId2FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevicePresentId2FeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_2_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("presentId2")
}

val VkSurfaceCapabilitiesPresentWait2KHR = struct(Module.VULKAN, "VkSurfaceCapabilitiesPresentWait2KHR") {
    Expression("#STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_WAIT_2_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("presentWait2Supported")
}

val VkPhysicalDevicePresentWait2FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevicePresentWait2FeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_2_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("presentWait2")
}

val VkPresentWait2InfoKHR = struct(Module.VULKAN, "VkPresentWait2InfoKHR") {
    Expression("#STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint64_t("presentId")
    uint64_t("timeout")
}

val VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_POSITION_FETCH_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("rayTracingPositionFetch")
}

val VkPhysicalDeviceShaderObjectFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderObjectFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderObject")
}

val VkPhysicalDeviceShaderObjectPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderObjectPropertiesEXT", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint8_t("shaderBinaryUUID")["VK_UUID_SIZE"]
    uint32_t("shaderBinaryVersion")
}

val VkShaderCreateInfoEXT = struct(Module.VULKAN, "VkShaderCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkCustomResolveCreateInfoEXT", "VkPipelineShaderStageRequiredSubgroupSizeCreateInfo", "VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT", "VkShaderDescriptorSetAndBindingMappingInfoEXT", "VkShaderRequiredSubgroupSizeCreateInfoEXT", "VkValidationFeaturesEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkShaderCreateFlagsEXT("flags")
    VkShaderStageFlagBits("stage")
    VkShaderStageFlags("nextStage")
    VkShaderCodeTypeEXT("codeType")
    AutoSize("pCode")..size_t("codeSize")
    void.const.p("pCode")
    nullable..charUTF8.const.p("pName")
    AutoSize("pSetLayouts", optional = true)..uint32_t("setLayoutCount")
    nullable..VkDescriptorSetLayout.const.p("pSetLayouts")
    AutoSize("pPushConstantRanges", optional = true)..uint32_t("pushConstantRangeCount")
    nullable..VkPushConstantRange.const.p("pPushConstantRanges")
    nullable..VkSpecializationInfo.const.p("pSpecializationInfo")
}

val VkShaderRequiredSubgroupSizeCreateInfoEXT = struct(Module.VULKAN, "VkShaderRequiredSubgroupSizeCreateInfoEXT", alias = VkPipelineShaderStageRequiredSubgroupSizeCreateInfo) {
    Expression("#STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("requiredSubgroupSize")
}

val VkDepthClampRangeEXT = struct(Module.VULKAN, "VkDepthClampRangeEXT") {
    float("minDepthClamp")
    float("maxDepthClamp")
}

val VkPhysicalDevicePipelineBinaryFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevicePipelineBinaryFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("pipelineBinaries")
}

val VkPhysicalDevicePipelineBinaryPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDevicePipelineBinaryPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("pipelineBinaryInternalCache")
    VkBool32("pipelineBinaryInternalCacheControl")
    VkBool32("pipelineBinaryPrefersInternalCache")
    VkBool32("pipelineBinaryPrecompiledInternalCache")
    VkBool32("pipelineBinaryCompressedData")
}

val VkDevicePipelineBinaryInternalCacheControlKHR = struct(Module.VULKAN, "VkDevicePipelineBinaryInternalCacheControlKHR") {
    Expression("#STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("disableInternalCache")
}

val VkPipelineBinaryKeyKHR = struct(Module.VULKAN, "VkPipelineBinaryKeyKHR") {
    javaImport("static org.lwjgl.vulkan.KHRPipelineBinary.*")
    Expression("#STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    uint32_t("keySize")
    uint8_t("key")["VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR"]
}

val VkPipelineBinaryDataKHR = struct(Module.VULKAN, "VkPipelineBinaryDataKHR") {
    AutoSize("pData")..size_t("dataSize")
    void.p("pData")
}

val VkPipelineBinaryKeysAndDataKHR = struct(Module.VULKAN, "VkPipelineBinaryKeysAndDataKHR") {
    AutoSize("pPipelineBinaryKeys", "pPipelineBinaryData")..uint32_t("binaryCount")
    VkPipelineBinaryKeyKHR.const.p("pPipelineBinaryKeys")
    VkPipelineBinaryDataKHR.const.p("pPipelineBinaryData")
}

val VkPipelineCreateInfoKHR = struct(Module.VULKAN, "VkPipelineCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_PIPELINE_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
}

val VkPipelineBinaryCreateInfoKHR = struct(Module.VULKAN, "VkPipelineBinaryCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    nullable..VkPipelineBinaryKeysAndDataKHR.const.p("pKeysAndDataInfo")
    VkPipeline("pipeline")
    nullable..VkPipelineCreateInfoKHR.const.p("pPipelineCreateInfo")
}

val VkPipelineBinaryInfoKHR = struct(Module.VULKAN, "VkPipelineBinaryInfoKHR") {
    Expression("#STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pPipelineBinaries", optional = true)..uint32_t("binaryCount")
    VkPipelineBinaryKHR.const.p("pPipelineBinaries")
}

val VkReleaseCapturedPipelineDataInfoKHR = struct(Module.VULKAN, "VkReleaseCapturedPipelineDataInfoKHR") {
    Expression("#STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkPipeline("pipeline")
}

val VkPipelineBinaryDataInfoKHR = struct(Module.VULKAN, "VkPipelineBinaryDataInfoKHR") {
    Expression("#STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkPipelineBinaryKHR("pipelineBinary")
}

val VkPipelineBinaryHandlesInfoKHR = struct(Module.VULKAN, "VkPipelineBinaryHandlesInfoKHR") {
    Expression("#STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pPipelineBinaries", optional = true)..uint32_t("pipelineBinaryCount")
    nullable..VkPipelineBinaryKHR.p("pPipelineBinaries")
}

val VkPhysicalDeviceTilePropertiesFeaturesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceTilePropertiesFeaturesQCOM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("tileProperties")
}

val VkTilePropertiesQCOM = struct(Module.VULKAN, "VkTilePropertiesQCOM") {
    Expression("#STRUCTURE_TYPE_TILE_PROPERTIES_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkExtent3D("tileSize")
    VkExtent2D("apronSize")
    VkOffset2D("origin")
}

val VkPhysicalDeviceAmigoProfilingFeaturesSEC = struct(Module.VULKAN, "VkPhysicalDeviceAmigoProfilingFeaturesSEC") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("amigoProfiling")
}

val VkAmigoProfilingSubmitInfoSEC = struct(Module.VULKAN, "VkAmigoProfilingSubmitInfoSEC") {
    Expression("#STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint64_t("firstDrawTimestamp")
    uint64_t("swapBufferTimestamp")
}

val VkSurfacePresentModeKHR = struct(Module.VULKAN, "VkSurfacePresentModeKHR") {
    Expression("#STRUCTURE_TYPE_SURFACE_PRESENT_MODE_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkPresentModeKHR("presentMode")
}

val VkSurfacePresentScalingCapabilitiesKHR = struct(Module.VULKAN, "VkSurfacePresentScalingCapabilitiesKHR") {
    Expression("#STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkPresentScalingFlagsKHR("supportedPresentScaling")
    VkPresentGravityFlagsKHR("supportedPresentGravityX")
    VkPresentGravityFlagsKHR("supportedPresentGravityY")
    VkExtent2D("minScaledImageExtent")
    VkExtent2D("maxScaledImageExtent")
}

val VkSurfacePresentModeCompatibilityKHR = struct(Module.VULKAN, "VkSurfacePresentModeCompatibilityKHR") {
    Expression("#STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    AutoSize("pPresentModes", optional = true)..uint32_t("presentModeCount")
    nullable..VkPresentModeKHR.p("pPresentModes")
}

val VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("swapchainMaintenance1")
}

val VkSwapchainPresentFenceInfoKHR = struct(Module.VULKAN, "VkSwapchainPresentFenceInfoKHR") {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pFences", optional = true)..uint32_t("swapchainCount")
    nullable..VkFence.const.p("pFences")
}

val VkSwapchainPresentModesCreateInfoKHR = struct(Module.VULKAN, "VkSwapchainPresentModesCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pPresentModes")..uint32_t("presentModeCount")
    VkPresentModeKHR.const.p("pPresentModes")
}

val VkSwapchainPresentModeInfoKHR = struct(Module.VULKAN, "VkSwapchainPresentModeInfoKHR") {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pPresentModes")..uint32_t("swapchainCount")
    VkPresentModeKHR.const.p("pPresentModes")
}

val VkSwapchainPresentScalingCreateInfoKHR = struct(Module.VULKAN, "VkSwapchainPresentScalingCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPresentScalingFlagsKHR("scalingBehavior")
    VkPresentGravityFlagsKHR("presentGravityX")
    VkPresentGravityFlagsKHR("presentGravityY")
}

val VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("multiviewPerViewViewports")
}

val VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkRayTracingInvocationReorderModeEXT("rayTracingInvocationReorderReorderingHint")
}

val VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("rayTracingInvocationReorder")
}

val VkPhysicalDeviceCooperativeVectorPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceCooperativeVectorPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkShaderStageFlags("cooperativeVectorSupportedStages")
    VkBool32("cooperativeVectorTrainingFloat16Accumulation")
    VkBool32("cooperativeVectorTrainingFloat32Accumulation")
    uint32_t("maxCooperativeVectorComponents")
}

val VkPhysicalDeviceCooperativeVectorFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceCooperativeVectorFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("cooperativeVector")
    VkBool32("cooperativeVectorTraining")
}

val VkCooperativeVectorPropertiesNV = struct(Module.VULKAN, "VkCooperativeVectorPropertiesNV") {
    Expression("#STRUCTURE_TYPE_COOPERATIVE_VECTOR_PROPERTIES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkComponentTypeNV("inputType")
    VkComponentTypeNV("inputInterpretation")
    VkComponentTypeNV("matrixInterpretation")
    VkComponentTypeNV("biasInterpretation")
    VkComponentTypeNV("resultType")
    VkBool32("transpose")
}

val VkConvertCooperativeVectorMatrixInfoNV = struct(Module.VULKAN, "VkConvertCooperativeVectorMatrixInfoNV") {
    Expression("#STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    size_t("srcSize")
    VkDeviceOrHostAddressConstKHR("srcData")
    nullable..size_t.p("pDstSize")
    VkDeviceOrHostAddressKHR("dstData")
    VkComponentTypeNV("srcComponentType")
    VkComponentTypeNV("dstComponentType")
    uint32_t("numRows")
    uint32_t("numColumns")
    VkCooperativeVectorMatrixLayoutNV("srcLayout")
    size_t("srcStride")
    VkCooperativeVectorMatrixLayoutNV("dstLayout")
    size_t("dstStride")
}

val VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("extendedSparseAddressSpace")
}

val VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceSize("extendedSparseAddressSpaceSize")
    VkImageUsageFlags("extendedSparseImageUsageFlags")
    VkBufferUsageFlags("extendedSparseBufferUsageFlags")
}

val VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("mutableDescriptorType")
}

val VkMutableDescriptorTypeCreateInfoEXT = struct(Module.VULKAN, "VkMutableDescriptorTypeCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pMutableDescriptorTypeLists", optional = true)..uint32_t("mutableDescriptorTypeListCount")
    VkMutableDescriptorTypeListEXT.const.p("pMutableDescriptorTypeLists")
}

val VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("legacyVertexAttributes")
}

val VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("nativeUnalignedPerformance")
}

val VkLayerSettingEXT = struct(Module.VULKAN, "VkLayerSettingEXT") {
    charUTF8.const.p("pLayerName")
    charUTF8.const.p("pSettingName")
    VkLayerSettingTypeEXT("type")
    AutoSize("pValues", optional = true)..uint32_t("valueCount")
    nullable..void.const.p("pValues")
}

val VkLayerSettingsCreateInfoEXT = struct(Module.VULKAN, "VkLayerSettingsCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pSettings", optional = true)..uint32_t("settingCount")
    VkLayerSettingEXT.const.p("pSettings")
}

val VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM = struct(Module.VULKAN, "VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_FEATURES_ARM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderCoreBuiltins")
}

val VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM = struct(Module.VULKAN, "VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint64_t("shaderCoreMask")
    uint32_t("shaderCoreCount")
    uint32_t("shaderWarpsPerCore")
}

val VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_LIBRARY_GROUP_HANDLES_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("pipelineLibraryGroupHandles")
}

val VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("dynamicRenderingUnusedAttachments")
}

val VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_INTERNALLY_SYNCHRONIZED_QUEUES_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("internallySynchronizedQueues")
}

val VkLatencySleepModeInfoNV = struct(Module.VULKAN, "VkLatencySleepModeInfoNV") {
    Expression("#STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("lowLatencyMode")
    VkBool32("lowLatencyBoost")
    uint32_t("minimumIntervalUs")
}

val VkLatencySleepInfoNV = struct(Module.VULKAN, "VkLatencySleepInfoNV") {
    Expression("#STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSemaphore("signalSemaphore")
    uint64_t("value")
}

val VkSetLatencyMarkerInfoNV = struct(Module.VULKAN, "VkSetLatencyMarkerInfoNV") {
    Expression("#STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint64_t("presentID")
    VkLatencyMarkerNV("marker")
}

val VkLatencyTimingsFrameReportNV = struct(Module.VULKAN, "VkLatencyTimingsFrameReportNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint64_t("presentID")
    uint64_t("inputSampleTimeUs")
    uint64_t("simStartTimeUs")
    uint64_t("simEndTimeUs")
    uint64_t("renderSubmitStartTimeUs")
    uint64_t("renderSubmitEndTimeUs")
    uint64_t("presentStartTimeUs")
    uint64_t("presentEndTimeUs")
    uint64_t("driverStartTimeUs")
    uint64_t("driverEndTimeUs")
    uint64_t("osRenderQueueStartTimeUs")
    uint64_t("osRenderQueueEndTimeUs")
    uint64_t("gpuRenderStartTimeUs")
    uint64_t("gpuRenderEndTimeUs")
}

val VkGetLatencyMarkerInfoNV = struct(Module.VULKAN, "VkGetLatencyMarkerInfoNV") {
    Expression("#STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pTimings", optional = true)..uint32_t("timingCount")
    nullable..VkLatencyTimingsFrameReportNV.p("pTimings")
}

val VkLatencySubmissionPresentIdNV = struct(Module.VULKAN, "VkLatencySubmissionPresentIdNV") {
    Expression("#STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint64_t("presentID")
}

val VkSwapchainLatencyCreateInfoNV = struct(Module.VULKAN, "VkSwapchainLatencyCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("latencyModeEnable")
}

val VkOutOfBandQueueTypeInfoNV = struct(Module.VULKAN, "VkOutOfBandQueueTypeInfoNV") {
    Expression("#STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkOutOfBandQueueTypeNV("queueType")
}

val VkLatencySurfaceCapabilitiesNV = struct(Module.VULKAN, "VkLatencySurfaceCapabilitiesNV") {
    Expression("#STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pPresentModes", optional = true)..uint32_t("presentModeCount")
    nullable..VkPresentModeKHR.p("pPresentModes")
}

val VkCooperativeMatrixPropertiesKHR = struct(Module.VULKAN, "VkCooperativeMatrixPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("MSize")
    uint32_t("NSize")
    uint32_t("KSize")
    VkComponentTypeKHR("AType")
    VkComponentTypeKHR("BType")
    VkComponentTypeKHR("CType")
    VkComponentTypeKHR("ResultType")
    VkBool32("saturatingAccumulation")
    VkScopeKHR("scope")
}

val VkPhysicalDeviceCooperativeMatrixFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceCooperativeMatrixFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("cooperativeMatrix")
    VkBool32("cooperativeMatrixRobustBufferAccess")
}

val VkPhysicalDeviceCooperativeMatrixPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceCooperativeMatrixPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkShaderStageFlags("cooperativeMatrixSupportedStages")
}

val VkPhysicalDeviceDataGraphFeaturesARM = struct(Module.VULKAN, "VkPhysicalDeviceDataGraphFeaturesARM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("dataGraph")
    VkBool32("dataGraphUpdateAfterBind")
    VkBool32("dataGraphSpecializationConstants")
    VkBool32("dataGraphDescriptorBuffer")
    VkBool32("dataGraphShaderModule")
}

val VkDataGraphPipelineConstantARM = struct(Module.VULKAN, "VkDataGraphPipelineConstantARM") {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM")..VkStructureType("sType")
    PointerSetter(
        "VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM", "VkTensorDescriptionARM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    uint32_t("id")
    opaque_const_p("pConstantData")
}

val VkDataGraphPipelineResourceInfoARM = struct(Module.VULKAN, "VkDataGraphPipelineResourceInfoARM") {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM")..VkStructureType("sType")
    PointerSetter(
        "VkTensorDescriptionARM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    uint32_t("descriptorSet")
    uint32_t("binding")
    uint32_t("arrayElement")
}

val VkDataGraphPipelineCompilerControlCreateInfoARM = struct(Module.VULKAN, "VkDataGraphPipelineCompilerControlCreateInfoARM") {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    charUTF8.const.p("pVendorOptions")
}

val VkDataGraphPipelineCreateInfoARM = struct(Module.VULKAN, "VkDataGraphPipelineCreateInfoARM") {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CREATE_INFO_ARM")..VkStructureType("sType")
    PointerSetter(
        "VkDataGraphPipelineBuiltinModelCreateInfoQCOM", "VkDataGraphPipelineCompilerControlCreateInfoARM", "VkDataGraphPipelineIdentifierCreateInfoARM", "VkDataGraphPipelineShaderModuleCreateInfoARM", "VkDataGraphProcessingEngineCreateInfoARM", "VkPipelineCreationFeedbackCreateInfo", "VkPipelineCreationFeedbackCreateInfoEXT", "VkShaderModuleCreateInfo",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineCreateFlags2KHR("flags")
    VkPipelineLayout("layout")
    AutoSize("pResourceInfos", optional = true)..uint32_t("resourceInfoCount")
    VkDataGraphPipelineResourceInfoARM.const.p("pResourceInfos")
}

val VkDataGraphPipelineShaderModuleCreateInfoARM = struct(Module.VULKAN, "VkDataGraphPipelineShaderModuleCreateInfoARM") {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkShaderModule("module")
    charUTF8.const.p("pName")
    nullable..VkSpecializationInfo.const.p("pSpecializationInfo")
    AutoSize("pConstants", optional = true)..uint32_t("constantCount")
    nullable..VkDataGraphPipelineConstantARM.const.p("pConstants")
}

val VkDataGraphPipelineSessionCreateInfoARM = struct(Module.VULKAN, "VkDataGraphPipelineSessionCreateInfoARM") {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDataGraphPipelineSessionCreateFlagsARM("flags")
    VkPipeline("dataGraphPipeline")
}

val VkDataGraphPipelineSessionBindPointRequirementsInfoARM = struct(Module.VULKAN, "VkDataGraphPipelineSessionBindPointRequirementsInfoARM") {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDataGraphPipelineSessionARM("session")
}

val VkDataGraphPipelineSessionBindPointRequirementARM = struct(Module.VULKAN, "VkDataGraphPipelineSessionBindPointRequirementARM", mutable = false) {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENT_ARM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDataGraphPipelineSessionBindPointARM("bindPoint")
    VkDataGraphPipelineSessionBindPointTypeARM("bindPointType")
    uint32_t("numObjects")
}

val VkDataGraphPipelineSessionMemoryRequirementsInfoARM = struct(Module.VULKAN, "VkDataGraphPipelineSessionMemoryRequirementsInfoARM") {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDataGraphPipelineSessionARM("session")
    VkDataGraphPipelineSessionBindPointARM("bindPoint")
    uint32_t("objectIndex")
}

val VkBindDataGraphPipelineSessionMemoryInfoARM = struct(Module.VULKAN, "VkBindDataGraphPipelineSessionMemoryInfoARM") {
    Expression("#STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDataGraphPipelineSessionARM("session")
    VkDataGraphPipelineSessionBindPointARM("bindPoint")
    uint32_t("objectIndex")
    VkDeviceMemory("memory")
    VkDeviceSize("memoryOffset")
}

val VkDataGraphPipelineInfoARM = struct(Module.VULKAN, "VkDataGraphPipelineInfoARM") {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipeline("dataGraphPipeline")
}

val VkDataGraphPipelinePropertyQueryResultARM = struct(Module.VULKAN, "VkDataGraphPipelinePropertyQueryResultARM") {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkDataGraphPipelinePropertyARM("property")
    VkBool32("isText")
    AutoSize("pData", optional = true)..size_t("dataSize")
    nullable..void.p("pData")
}

val VkDataGraphPipelineIdentifierCreateInfoARM = struct(Module.VULKAN, "VkDataGraphPipelineIdentifierCreateInfoARM") {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_IDENTIFIER_CREATE_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pIdentifier")..uint32_t("identifierSize")
    uint8_t.const.p("pIdentifier")
}

val VkDataGraphPipelineDispatchInfoARM = struct(Module.VULKAN, "VkDataGraphPipelineDispatchInfoARM") {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_DISPATCH_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkDataGraphPipelineDispatchFlagsARM("flags")
}

val VkPhysicalDeviceDataGraphProcessingEngineARM = struct(Module.VULKAN, "VkPhysicalDeviceDataGraphProcessingEngineARM") {
    VkPhysicalDeviceDataGraphProcessingEngineTypeARM("type")
    VkBool32("isForeign")
}

val VkPhysicalDeviceDataGraphOperationSupportARM = struct(Module.VULKAN, "VkPhysicalDeviceDataGraphOperationSupportARM") {
    javaImport("static org.lwjgl.vulkan.ARMDataGraph.*")
    VkPhysicalDeviceDataGraphOperationTypeARM("operationType")
    charUTF8("name")["VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM"]
    uint32_t("version")
}

val VkQueueFamilyDataGraphPropertiesARM = struct(Module.VULKAN, "VkQueueFamilyDataGraphPropertiesARM", mutable = false) {
    Expression("#STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPhysicalDeviceDataGraphProcessingEngineARM("engine")
    VkPhysicalDeviceDataGraphOperationSupportARM("operation")
}

val VkDataGraphProcessingEngineCreateInfoARM = struct(Module.VULKAN, "VkDataGraphProcessingEngineCreateInfoARM") {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pProcessingEngines")..uint32_t("processingEngineCount")
    VkPhysicalDeviceDataGraphProcessingEngineARM.p("pProcessingEngines")
}

val VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM = struct(Module.VULKAN, "VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("queueFamilyIndex")
    VkPhysicalDeviceDataGraphProcessingEngineTypeARM("engineType")
}

val VkQueueFamilyDataGraphProcessingEnginePropertiesARM = struct(Module.VULKAN, "VkQueueFamilyDataGraphProcessingEnginePropertiesARM", mutable = false) {
    Expression("#STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExternalSemaphoreHandleTypeFlags("foreignSemaphoreHandleTypes")
    VkExternalMemoryHandleTypeFlags("foreignMemoryHandleTypes")
}

val VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM = struct(Module.VULKAN, "VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM") {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_TENSOR_SEMI_STRUCTURED_SPARSITY_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("dimension")
    uint32_t("zeroCount")
    uint32_t("groupSize")
}

val VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_RENDER_AREAS_FEATURES_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("multiviewPerViewRenderAreas")
}

val VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM = struct(Module.VULKAN, "VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM") {
    Expression("#STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pPerViewRenderAreas", optional = true)..uint32_t("perViewRenderAreaCount")
    VkRect2D.const.p("pPerViewRenderAreas")
}

val VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("computeDerivativeGroupQuads")
    VkBool32("computeDerivativeGroupLinear")
}

val VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("meshAndTaskShaderDerivatives")
}

val VkVideoDecodeAV1ProfileInfoKHR = struct(Module.VULKAN, "VkVideoDecodeAV1ProfileInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_AV1_PROFILE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoAV1Profile("stdProfile")
    VkBool32("filmGrainSupport")
}

val VkVideoDecodeAV1CapabilitiesKHR = struct(Module.VULKAN, "VkVideoDecodeAV1CapabilitiesKHR", mutable = false) {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_AV1_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    StdVideoAV1Level("maxLevel")
}

val VkVideoDecodeAV1SessionParametersCreateInfoKHR = struct(Module.VULKAN, "VkVideoDecodeAV1SessionParametersCreateInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoAV1SequenceHeader.const.p("pStdSequenceHeader")
}

val VkVideoDecodeAV1PictureInfoKHR = struct(Module.VULKAN, "VkVideoDecodeAV1PictureInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    javaImport("static org.lwjgl.vulkan.KHRVideoEncodeAV1.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoDecodeAV1PictureInfo.const.p("pStdPictureInfo")
    int32_t("referenceNameSlotIndices")["VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR"]
    uint32_t("frameHeaderOffset")
    AutoSize("pTileOffsets", "pTileSizes")..uint32_t("tileCount")
    uint32_t.const.p("pTileOffsets")
    uint32_t.const.p("pTileSizes")
}

val VkVideoDecodeAV1DpbSlotInfoKHR = struct(Module.VULKAN, "VkVideoDecodeAV1DpbSlotInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_AV1_DPB_SLOT_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoDecodeAV1ReferenceInfo.const.p("pStdReferenceInfo")
}

val VkPhysicalDeviceVideoEncodeAV1FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVideoEncodeAV1FeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_AV1_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("videoEncodeAV1")
}

val VkVideoEncodeAV1CapabilitiesKHR = struct(Module.VULKAN, "VkVideoEncodeAV1CapabilitiesKHR", mutable = false) {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkVideoEncodeAV1CapabilityFlagsKHR("flags")
    StdVideoAV1Level("maxLevel")
    VkExtent2D("codedPictureAlignment")
    VkExtent2D("maxTiles")
    VkExtent2D("minTileSize")
    VkExtent2D("maxTileSize")
    VkVideoEncodeAV1SuperblockSizeFlagsKHR("superblockSizes")
    uint32_t("maxSingleReferenceCount")
    uint32_t("singleReferenceNameMask")
    uint32_t("maxUnidirectionalCompoundReferenceCount")
    uint32_t("maxUnidirectionalCompoundGroup1ReferenceCount")
    uint32_t("unidirectionalCompoundReferenceNameMask")
    uint32_t("maxBidirectionalCompoundReferenceCount")
    uint32_t("maxBidirectionalCompoundGroup1ReferenceCount")
    uint32_t("maxBidirectionalCompoundGroup2ReferenceCount")
    uint32_t("bidirectionalCompoundReferenceNameMask")
    uint32_t("maxTemporalLayerCount")
    uint32_t("maxSpatialLayerCount")
    uint32_t("maxOperatingPoints")
    uint32_t("minQIndex")
    uint32_t("maxQIndex")
    VkBool32("prefersGopRemainingFrames")
    VkBool32("requiresGopRemainingFrames")
    VkVideoEncodeAV1StdFlagsKHR("stdSyntaxFlags")
}

val VkVideoEncodeAV1QIndexKHR = struct(Module.VULKAN, "VkVideoEncodeAV1QIndexKHR") {
    uint32_t("intraQIndex")
    uint32_t("predictiveQIndex")
    uint32_t("bipredictiveQIndex")
}

val VkVideoEncodeAV1QualityLevelPropertiesKHR = struct(Module.VULKAN, "VkVideoEncodeAV1QualityLevelPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkVideoEncodeAV1RateControlFlagsKHR("preferredRateControlFlags")
    uint32_t("preferredGopFrameCount")
    uint32_t("preferredKeyFramePeriod")
    uint32_t("preferredConsecutiveBipredictiveFrameCount")
    uint32_t("preferredTemporalLayerCount")
    VkVideoEncodeAV1QIndexKHR("preferredConstantQIndex")
    uint32_t("preferredMaxSingleReferenceCount")
    uint32_t("preferredSingleReferenceNameMask")
    uint32_t("preferredMaxUnidirectionalCompoundReferenceCount")
    uint32_t("preferredMaxUnidirectionalCompoundGroup1ReferenceCount")
    uint32_t("preferredUnidirectionalCompoundReferenceNameMask")
    uint32_t("preferredMaxBidirectionalCompoundReferenceCount")
    uint32_t("preferredMaxBidirectionalCompoundGroup1ReferenceCount")
    uint32_t("preferredMaxBidirectionalCompoundGroup2ReferenceCount")
    uint32_t("preferredBidirectionalCompoundReferenceNameMask")
}

val VkVideoEncodeAV1SessionCreateInfoKHR = struct(Module.VULKAN, "VkVideoEncodeAV1SessionCreateInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("useMaxLevel")
    StdVideoAV1Level("maxLevel")
}

val VkVideoEncodeAV1SessionParametersCreateInfoKHR = struct(Module.VULKAN, "VkVideoEncodeAV1SessionParametersCreateInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoAV1SequenceHeader.const.p("pStdSequenceHeader")
    nullable..StdVideoEncodeAV1DecoderModelInfo.const.p("pStdDecoderModelInfo")
    AutoSize("pStdOperatingPoints", optional = true)..uint32_t("stdOperatingPointCount")
    nullable..StdVideoEncodeAV1OperatingPointInfo.const.p("pStdOperatingPoints")
}

val VkVideoEncodeAV1PictureInfoKHR = struct(Module.VULKAN, "VkVideoEncodeAV1PictureInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    javaImport("static org.lwjgl.vulkan.KHRVideoEncodeAV1.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkVideoEncodeAV1PredictionModeKHR("predictionMode")
    VkVideoEncodeAV1RateControlGroupKHR("rateControlGroup")
    uint32_t("constantQIndex")
    StdVideoEncodeAV1PictureInfo.const.p("pStdPictureInfo")
    int32_t("referenceNameSlotIndices")["VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR"]
    VkBool32("primaryReferenceCdfOnly")
    VkBool32("generateObuExtensionHeader")
}

val VkVideoEncodeAV1DpbSlotInfoKHR = struct(Module.VULKAN, "VkVideoEncodeAV1DpbSlotInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoEncodeAV1ReferenceInfo.const.p("pStdReferenceInfo")
}

val VkVideoEncodeAV1ProfileInfoKHR = struct(Module.VULKAN, "VkVideoEncodeAV1ProfileInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PROFILE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoAV1Profile("stdProfile")
}

val VkVideoEncodeAV1FrameSizeKHR = struct(Module.VULKAN, "VkVideoEncodeAV1FrameSizeKHR") {
    uint32_t("intraFrameSize")
    uint32_t("predictiveFrameSize")
    uint32_t("bipredictiveFrameSize")
}

val VkVideoEncodeAV1GopRemainingFrameInfoKHR = struct(Module.VULKAN, "VkVideoEncodeAV1GopRemainingFrameInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("useGopRemainingFrames")
    uint32_t("gopRemainingIntra")
    uint32_t("gopRemainingPredictive")
    uint32_t("gopRemainingBipredictive")
}

val VkVideoEncodeAV1RateControlInfoKHR = struct(Module.VULKAN, "VkVideoEncodeAV1RateControlInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkVideoEncodeAV1RateControlFlagsKHR("flags")
    uint32_t("gopFrameCount")
    uint32_t("keyFramePeriod")
    uint32_t("consecutiveBipredictiveFrameCount")
    uint32_t("temporalLayerCount")
}

val VkVideoEncodeAV1RateControlLayerInfoKHR = struct(Module.VULKAN, "VkVideoEncodeAV1RateControlLayerInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("useMinQIndex")
    VkVideoEncodeAV1QIndexKHR("minQIndex")
    VkBool32("useMaxQIndex")
    VkVideoEncodeAV1QIndexKHR("maxQIndex")
    VkBool32("useMaxFrameSize")
    VkVideoEncodeAV1FrameSizeKHR("maxFrameSize")
}

val VkPhysicalDeviceVideoDecodeVP9FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVideoDecodeVP9FeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_DECODE_VP9_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("videoDecodeVP9")
}

val VkVideoDecodeVP9ProfileInfoKHR = struct(Module.VULKAN, "VkVideoDecodeVP9ProfileInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_VP9_PROFILE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoVP9Profile("stdProfile")
}

val VkVideoDecodeVP9CapabilitiesKHR = struct(Module.VULKAN, "VkVideoDecodeVP9CapabilitiesKHR", mutable = false) {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_VP9_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    StdVideoVP9Level("maxLevel")
}

val VkVideoDecodeVP9PictureInfoKHR = struct(Module.VULKAN, "VkVideoDecodeVP9PictureInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    javaImport("static org.lwjgl.vulkan.KHRVideoDecodeVP9.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_VP9_PICTURE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    StdVideoDecodeVP9PictureInfo.const.p("pStdPictureInfo")
    int32_t("referenceNameSlotIndices")["VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR"]
    uint32_t("uncompressedHeaderOffset")
    uint32_t("compressedHeaderOffset")
    uint32_t("tilesOffset")
}

val VkPhysicalDeviceVideoMaintenance1FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVideoMaintenance1FeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_MAINTENANCE_1_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("videoMaintenance1")
}

val VkVideoInlineQueryInfoKHR = struct(Module.VULKAN, "VkVideoInlineQueryInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkQueryPool("queryPool")
    uint32_t("firstQuery")
    uint32_t("queryCount")
}

val VkPhysicalDevicePerStageDescriptorSetFeaturesNV = struct(Module.VULKAN, "VkPhysicalDevicePerStageDescriptorSetFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PER_STAGE_DESCRIPTOR_SET_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("perStageDescriptorSet")
    VkBool32("dynamicPipelineLayout")
}

val VkPhysicalDeviceImageProcessing2FeaturesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceImageProcessing2FeaturesQCOM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("textureBlockMatch2")
}

val VkPhysicalDeviceImageProcessing2PropertiesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceImageProcessing2PropertiesQCOM", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExtent2D("maxBlockMatchWindow")
}

val VkSamplerBlockMatchWindowCreateInfoQCOM = struct(Module.VULKAN, "VkSamplerBlockMatchWindowCreateInfoQCOM") {
    Expression("#STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExtent2D("windowExtent")
    VkBlockMatchWindowCompareModeQCOM("windowCompareMode")
}

val VkPhysicalDeviceCubicWeightsFeaturesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceCubicWeightsFeaturesQCOM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("selectableCubicWeights")
}

val VkSamplerCubicWeightsCreateInfoQCOM = struct(Module.VULKAN, "VkSamplerCubicWeightsCreateInfoQCOM") {
    Expression("#STRUCTURE_TYPE_SAMPLER_CUBIC_WEIGHTS_CREATE_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkCubicFilterWeightsQCOM("cubicWeights")
}

val VkBlitImageCubicWeightsInfoQCOM = struct(Module.VULKAN, "VkBlitImageCubicWeightsInfoQCOM") {
    Expression("#STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkCubicFilterWeightsQCOM("cubicWeights")
}

val VkPhysicalDeviceYcbcrDegammaFeaturesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceYcbcrDegammaFeaturesQCOM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("ycbcrDegamma")
}

val VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM = struct(Module.VULKAN, "VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM") {
    Expression("#STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("enableYDegamma")
    VkBool32("enableCbCrDegamma")
}

val VkPhysicalDeviceCubicClampFeaturesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceCubicClampFeaturesQCOM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_CLAMP_FEATURES_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("cubicRangeClamp")
}

val VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("attachmentFeedbackLoopDynamicState")
}

val VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR", mutable = false, alias = VkPhysicalDeviceVertexAttributeDivisorProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxVertexAttribDivisor")
    VkBool32("supportsNonZeroFirstInstance")
}

val VkVertexInputBindingDivisorDescriptionKHR = struct(Module.VULKAN, "VkVertexInputBindingDivisorDescriptionKHR", alias = VkVertexInputBindingDivisorDescription) {
    uint32_t("binding")
    uint32_t("divisor")
}

val VkPipelineVertexInputDivisorStateCreateInfoKHR = struct(Module.VULKAN, "VkPipelineVertexInputDivisorStateCreateInfoKHR", alias = VkPipelineVertexInputDivisorStateCreateInfo) {
    Expression("#STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pVertexBindingDivisors")..uint32_t("vertexBindingDivisorCount")
    VkVertexInputBindingDivisorDescription.const.p("pVertexBindingDivisors")
}

val VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR", alias = VkPhysicalDeviceVertexAttributeDivisorFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("vertexAttributeInstanceRateDivisor")
    VkBool32("vertexAttributeInstanceRateZeroDivisor")
}

val VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFIED_IMAGE_LAYOUTS_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("unifiedImageLayouts")
    VkBool32("unifiedImageLayoutsVideo")
}

val VkAttachmentFeedbackLoopInfoEXT = struct(Module.VULKAN, "VkAttachmentFeedbackLoopInfoEXT") {
    Expression("#STRUCTURE_TYPE_ATTACHMENT_FEEDBACK_LOOP_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("feedbackLoopEnable")
}

val VkPhysicalDeviceShaderFloatControls2FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderFloatControls2FeaturesKHR", alias = VkPhysicalDeviceShaderFloatControls2Features) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderFloatControls2")
}

val VkPhysicalDeviceLayeredDriverPropertiesMSFT = struct(Module.VULKAN, "VkPhysicalDeviceLayeredDriverPropertiesMSFT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_DRIVER_PROPERTIES_MSFT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkLayeredDriverUnderlyingApiMSFT("underlyingAPI")
}

val VkPhysicalDeviceIndexTypeUint8FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceIndexTypeUint8FeaturesKHR", alias = VkPhysicalDeviceIndexTypeUint8Features) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("indexTypeUint8")
}

val VkPhysicalDeviceLineRasterizationFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceLineRasterizationFeaturesKHR", alias = VkPhysicalDeviceLineRasterizationFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("rectangularLines")
    VkBool32("bresenhamLines")
    VkBool32("smoothLines")
    VkBool32("stippledRectangularLines")
    VkBool32("stippledBresenhamLines")
    VkBool32("stippledSmoothLines")
}

val VkPhysicalDeviceLineRasterizationPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceLineRasterizationPropertiesKHR", mutable = false, alias = VkPhysicalDeviceLineRasterizationProperties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("lineSubPixelPrecisionBits")
}

val VkPipelineRasterizationLineStateCreateInfoKHR = struct(Module.VULKAN, "VkPipelineRasterizationLineStateCreateInfoKHR", alias = VkPipelineRasterizationLineStateCreateInfo) {
    Expression("#STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkLineRasterizationMode("lineRasterizationMode")
    VkBool32("stippledLineEnable")
    uint32_t("lineStippleFactor")
    uint16_t("lineStipplePattern")
}

val VkPhysicalDeviceShaderExpectAssumeFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderExpectAssumeFeaturesKHR", alias = VkPhysicalDeviceShaderExpectAssumeFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderExpectAssume")
}

val VkPhysicalDeviceMaintenance6FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance6FeaturesKHR", alias = VkPhysicalDeviceMaintenance6Features) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("maintenance6")
}

val VkPhysicalDeviceMaintenance6PropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance6PropertiesKHR", mutable = false, alias = VkPhysicalDeviceMaintenance6Properties) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("blockTexelViewCompatibleMultipleLayers")
    uint32_t("maxCombinedImageSamplerDescriptorCount")
    VkBool32("fragmentShadingRateClampCombinerInputs")
}

val VkBindMemoryStatusKHR = struct(Module.VULKAN, "VkBindMemoryStatusKHR", alias = VkBindMemoryStatus) {
    Expression("#STRUCTURE_TYPE_BIND_MEMORY_STATUS")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkResult.p("pResult")
}

val VkBindDescriptorSetsInfoKHR = struct(Module.VULKAN, "VkBindDescriptorSetsInfoKHR", alias = VkBindDescriptorSetsInfo) {
    Expression("#STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkShaderStageFlags("stageFlags")
    VkPipelineLayout("layout")
    uint32_t("firstSet")
    AutoSize("pDescriptorSets")..uint32_t("descriptorSetCount")
    VkDescriptorSet.const.p("pDescriptorSets")
    AutoSize("pDynamicOffsets", optional = true)..uint32_t("dynamicOffsetCount")
    nullable..uint32_t.const.p("pDynamicOffsets")
}

val VkPushConstantsInfoKHR = struct(Module.VULKAN, "VkPushConstantsInfoKHR", alias = VkPushConstantsInfo) {
    Expression("#STRUCTURE_TYPE_PUSH_CONSTANTS_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineLayout("layout")
    VkShaderStageFlags("stageFlags")
    uint32_t("offset")
    AutoSize("pValues")..uint32_t("size")
    void.const.p("pValues")
}

val VkPushDescriptorSetInfoKHR = struct(Module.VULKAN, "VkPushDescriptorSetInfoKHR", alias = VkPushDescriptorSetInfo) {
    Expression("#STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkShaderStageFlags("stageFlags")
    VkPipelineLayout("layout")
    uint32_t("set")
    AutoSize("pDescriptorWrites")..uint32_t("descriptorWriteCount")
    VkWriteDescriptorSet.const.p("pDescriptorWrites")
}

val VkPushDescriptorSetWithTemplateInfoKHR = struct(Module.VULKAN, "VkPushDescriptorSetWithTemplateInfoKHR", alias = VkPushDescriptorSetWithTemplateInfo) {
    Expression("#STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDescriptorUpdateTemplate("descriptorUpdateTemplate")
    VkPipelineLayout("layout")
    uint32_t("set")
    opaque_const_p("pData")
}

val VkSetDescriptorBufferOffsetsInfoEXT = struct(Module.VULKAN, "VkSetDescriptorBufferOffsetsInfoEXT") {
    Expression("#STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkPipelineLayoutCreateInfo",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkShaderStageFlags("stageFlags")
    VkPipelineLayout("layout")
    uint32_t("firstSet")
    AutoSize("pBufferIndices", "pOffsets")..uint32_t("setCount")
    uint32_t.const.p("pBufferIndices")
    VkDeviceSize.const.p("pOffsets")
}

val VkBindDescriptorBufferEmbeddedSamplersInfoEXT = struct(Module.VULKAN, "VkBindDescriptorBufferEmbeddedSamplersInfoEXT") {
    Expression("#STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkPipelineLayoutCreateInfo",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkShaderStageFlags("stageFlags")
    VkPipelineLayout("layout")
    uint32_t("set")
}

val VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("descriptorPoolOverallocation")
}

val VkPhysicalDeviceTileMemoryHeapFeaturesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceTileMemoryHeapFeaturesQCOM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_FEATURES_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("tileMemoryHeap")
}

val VkPhysicalDeviceTileMemoryHeapPropertiesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceTileMemoryHeapPropertiesQCOM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("queueSubmitBoundary")
    VkBool32("tileBufferTransfers")
}

val VkTileMemoryRequirementsQCOM = struct(Module.VULKAN, "VkTileMemoryRequirementsQCOM") {
    Expression("#STRUCTURE_TYPE_TILE_MEMORY_REQUIREMENTS_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkDeviceSize("size")
    VkDeviceSize("alignment")
}

val VkTileMemoryBindInfoQCOM = struct(Module.VULKAN, "VkTileMemoryBindInfoQCOM") {
    Expression("#STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceMemory("memory")
}

val VkTileMemorySizeInfoQCOM = struct(Module.VULKAN, "VkTileMemorySizeInfoQCOM") {
    Expression("#STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceSize("size")
}

val VkStridedDeviceAddressRangeKHR = struct(Module.VULKAN, "VkStridedDeviceAddressRangeKHR") {
    VkDeviceAddress("address")
    VkDeviceSize("size")
    VkDeviceSize("stride")
}

val VkCopyMemoryIndirectCommandKHR = struct(Module.VULKAN, "VkCopyMemoryIndirectCommandKHR") {
    VkDeviceAddress("srcAddress")
    VkDeviceAddress("dstAddress")
    VkDeviceSize("size")
}

val VkCopyMemoryIndirectInfoKHR = struct(Module.VULKAN, "VkCopyMemoryIndirectInfoKHR") {
    Expression("#STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAddressCopyFlagsKHR("srcCopyFlags")
    VkAddressCopyFlagsKHR("dstCopyFlags")
    uint32_t("copyCount")
    VkStridedDeviceAddressRangeKHR("copyAddressRange")
}

val VkCopyMemoryToImageIndirectCommandKHR = struct(Module.VULKAN, "VkCopyMemoryToImageIndirectCommandKHR") {
    VkDeviceAddress("srcAddress")
    uint32_t("bufferRowLength")
    uint32_t("bufferImageHeight")
    VkImageSubresourceLayers("imageSubresource")
    VkOffset3D("imageOffset")
    VkExtent3D("imageExtent")
}

val VkCopyMemoryToImageIndirectInfoKHR = struct(Module.VULKAN, "VkCopyMemoryToImageIndirectInfoKHR") {
    Expression("#STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAddressCopyFlagsKHR("srcCopyFlags")
    AutoSize("pImageSubresources")..uint32_t("copyCount")
    VkStridedDeviceAddressRangeKHR("copyAddressRange")
    VkImage("dstImage")
    VkImageLayout("dstImageLayout")
    VkImageSubresourceLayers.const.p("pImageSubresources")
}

val VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("indirectMemoryCopy")
    VkBool32("indirectMemoryToImageCopy")
}

val VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkQueueFlags("supportedQueues")
}

val VkDecompressMemoryRegionEXT = struct(Module.VULKAN, "VkDecompressMemoryRegionEXT") {
    VkDeviceAddress("srcAddress")
    VkDeviceAddress("dstAddress")
    VkDeviceSize("compressedSize")
    VkDeviceSize("decompressedSize")
}

val VkDecompressMemoryInfoEXT = struct(Module.VULKAN, "VkDecompressMemoryInfoEXT") {
    Expression("#STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkMemoryDecompressionMethodFlagsEXT("decompressionMethod")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkDecompressMemoryRegionEXT.const.p("pRegions")
}

val VkPhysicalDeviceMemoryDecompressionFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMemoryDecompressionFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("memoryDecompression")
}

val VkPhysicalDeviceMemoryDecompressionPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMemoryDecompressionPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkMemoryDecompressionMethodFlagsEXT("decompressionMethods")
    uint64_t("maxDecompressionIndirectCount")
}

val VkDisplaySurfaceStereoCreateInfoNV = struct(Module.VULKAN, "VkDisplaySurfaceStereoCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDisplaySurfaceStereoTypeNV("stereoType")
}

val VkDisplayModeStereoPropertiesNV = struct(Module.VULKAN, "VkDisplayModeStereoPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_DISPLAY_MODE_STEREO_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("hdmi3DSupported")
}

val VkVideoEncodeIntraRefreshCapabilitiesKHR = struct(Module.VULKAN, "VkVideoEncodeIntraRefreshCapabilitiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkVideoEncodeIntraRefreshModeFlagsKHR("intraRefreshModes")
    uint32_t("maxIntraRefreshCycleDuration")
    uint32_t("maxIntraRefreshActiveReferencePictures")
    VkBool32("partitionIndependentIntraRefreshRegions")
    VkBool32("nonRectangularIntraRefreshRegions")
}

val VkVideoEncodeSessionIntraRefreshCreateInfoKHR = struct(Module.VULKAN, "VkVideoEncodeSessionIntraRefreshCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_INTRA_REFRESH_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkVideoEncodeIntraRefreshModeFlagBitsKHR("intraRefreshMode")
}

val VkVideoEncodeIntraRefreshInfoKHR = struct(Module.VULKAN, "VkVideoEncodeIntraRefreshInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("intraRefreshCycleDuration")
    uint32_t("intraRefreshIndex")
}

val VkVideoReferenceIntraRefreshInfoKHR = struct(Module.VULKAN, "VkVideoReferenceIntraRefreshInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_REFERENCE_INTRA_REFRESH_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("dirtyIntraRefreshRegions")
}

val VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_INTRA_REFRESH_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("videoEncodeIntraRefresh")
}

val VkVideoEncodeQuantizationMapCapabilitiesKHR = struct(Module.VULKAN, "VkVideoEncodeQuantizationMapCapabilitiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExtent2D("maxQuantizationMapExtent")
}

val VkVideoFormatQuantizationMapPropertiesKHR = struct(Module.VULKAN, "VkVideoFormatQuantizationMapPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_FORMAT_QUANTIZATION_MAP_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExtent2D("quantizationMapTexelSize")
}

val VkVideoEncodeQuantizationMapInfoKHR = struct(Module.VULKAN, "VkVideoEncodeQuantizationMapInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageView("quantizationMap")
    VkExtent2D("quantizationMapExtent")
}

val VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR = struct(Module.VULKAN, "VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR") {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_SESSION_PARAMETERS_CREATE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExtent2D("quantizationMapTexelSize")
}

val VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUANTIZATION_MAP_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("videoEncodeQuantizationMap")
}

val VkVideoEncodeH264QuantizationMapCapabilitiesKHR = struct(Module.VULKAN, "VkVideoEncodeH264QuantizationMapCapabilitiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUANTIZATION_MAP_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    int32_t("minQpDelta")
    int32_t("maxQpDelta")
}

val VkVideoEncodeH265QuantizationMapCapabilitiesKHR = struct(Module.VULKAN, "VkVideoEncodeH265QuantizationMapCapabilitiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_H265_QUANTIZATION_MAP_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    int32_t("minQpDelta")
    int32_t("maxQpDelta")
}

val VkVideoFormatH265QuantizationMapPropertiesKHR = struct(Module.VULKAN, "VkVideoFormatH265QuantizationMapPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_FORMAT_H265_QUANTIZATION_MAP_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkVideoEncodeH265CtbSizeFlagsKHR("compatibleCtbSizes")
}

val VkVideoEncodeAV1QuantizationMapCapabilitiesKHR = struct(Module.VULKAN, "VkVideoEncodeAV1QuantizationMapCapabilitiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUANTIZATION_MAP_CAPABILITIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    int32_t("minQIndexDelta")
    int32_t("maxQIndexDelta")
}

val VkVideoFormatAV1QuantizationMapPropertiesKHR = struct(Module.VULKAN, "VkVideoFormatAV1QuantizationMapPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_VIDEO_FORMAT_AV1_QUANTIZATION_MAP_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkVideoEncodeAV1SuperblockSizeFlagsKHR("compatibleSuperblockSizes")
}

val VkPhysicalDeviceRawAccessChainsFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceRawAccessChainsFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RAW_ACCESS_CHAINS_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderRawAccessChains")
}

val VkExternalComputeQueueDeviceCreateInfoNV = struct(Module.VULKAN, "VkExternalComputeQueueDeviceCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DEVICE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("reservedExternalQueues")
}

val VkExternalComputeQueueCreateInfoNV = struct(Module.VULKAN, "VkExternalComputeQueueCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkQueue("preferredQueue")
}

val VkExternalComputeQueueDataParamsNV = struct(Module.VULKAN, "VkExternalComputeQueueDataParamsNV") {
    Expression("#STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DATA_PARAMS_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("deviceIndex")
}

val VkPhysicalDeviceExternalComputeQueuePropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceExternalComputeQueuePropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_COMPUTE_QUEUE_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("externalDataSize")
    uint32_t("maxExternalQueues")
}

val VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_RELAXED_EXTENDED_INSTRUCTION_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderRelaxedExtendedInstruction")
}

val VkPhysicalDeviceCommandBufferInheritanceFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceCommandBufferInheritanceFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COMMAND_BUFFER_INHERITANCE_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("commandBufferInheritance")
}

val VkPhysicalDeviceMaintenance7FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance7FeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("maintenance7")
}

val VkPhysicalDeviceMaintenance7PropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance7PropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("robustFragmentShadingRateAttachmentAccess")
    VkBool32("separateDepthStencilAttachmentAccess")
    uint32_t("maxDescriptorSetTotalUniformBuffersDynamic")
    uint32_t("maxDescriptorSetTotalStorageBuffersDynamic")
    uint32_t("maxDescriptorSetTotalBuffersDynamic")
    uint32_t("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic")
    uint32_t("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic")
    uint32_t("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic")
}

val VkPhysicalDeviceLayeredApiPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceLayeredApiPropertiesKHR", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkPhysicalDeviceLayeredApiVulkanPropertiesKHR",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    uint32_t("vendorID")
    uint32_t("deviceID")
    VkPhysicalDeviceLayeredApiKHR("layeredAPI")
    charUTF8("deviceName")["VK_MAX_PHYSICAL_DEVICE_NAME_SIZE"]
}

val VkPhysicalDeviceLayeredApiPropertiesListKHR = struct(Module.VULKAN, "VkPhysicalDeviceLayeredApiPropertiesListKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    AutoSize("pLayeredApis", optional = true)..uint32_t("layeredApiCount")
    nullable..VkPhysicalDeviceLayeredApiPropertiesKHR.p("pLayeredApis")
}

val VkPhysicalDeviceLayeredApiVulkanPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceLayeredApiVulkanPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_VULKAN_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPhysicalDeviceProperties2("properties")
}

val VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT16_VECTOR_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderFloat16VectorAtomics")
}

val VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_REPLICATED_COMPOSITES_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderReplicatedComposites")
}

val VkPhysicalDeviceShaderFloat8FeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderFloat8FeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT8_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderFloat8")
    VkBool32("shaderFloat8CooperativeMatrix")
}

val VkPhysicalDeviceRayTracingValidationFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingValidationFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_VALIDATION_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("rayTracingValidation")
}

val VkPhysicalDeviceClusterAccelerationStructureFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceClusterAccelerationStructureFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("clusterAccelerationStructure")
}

val VkPhysicalDeviceClusterAccelerationStructurePropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceClusterAccelerationStructurePropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxVerticesPerCluster")
    uint32_t("maxTrianglesPerCluster")
    uint32_t("clusterScratchByteAlignment")
    uint32_t("clusterByteAlignment")
    uint32_t("clusterTemplateByteAlignment")
    uint32_t("clusterBottomLevelByteAlignment")
    uint32_t("clusterTemplateBoundsByteAlignment")
    uint32_t("maxClusterGeometryIndex")
}

val VkClusterAccelerationStructureClustersBottomLevelInputNV = struct(Module.VULKAN, "VkClusterAccelerationStructureClustersBottomLevelInputNV") {
    Expression("#STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_CLUSTERS_BOTTOM_LEVEL_INPUT_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    uint32_t("maxTotalClusterCount")
    uint32_t("maxClusterCountPerAccelerationStructure")
}

val VkClusterAccelerationStructureTriangleClusterInputNV = struct(Module.VULKAN, "VkClusterAccelerationStructureTriangleClusterInputNV") {
    Expression("#STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkFormat("vertexFormat")
    uint32_t("maxGeometryIndexValue")
    uint32_t("maxClusterUniqueGeometryCount")
    uint32_t("maxClusterTriangleCount")
    uint32_t("maxClusterVertexCount")
    uint32_t("maxTotalTriangleCount")
    uint32_t("maxTotalVertexCount")
    uint32_t("minPositionTruncateBitCount")
}

val VkClusterAccelerationStructureMoveObjectsInputNV = struct(Module.VULKAN, "VkClusterAccelerationStructureMoveObjectsInputNV") {
    Expression("#STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkClusterAccelerationStructureTypeNV("type")
    VkBool32("noMoveOverlap")
    VkDeviceSize("maxMovedBytes")
}

val VkClusterAccelerationStructureOpInputNV = union(Module.VULKAN, "VkClusterAccelerationStructureOpInputNV") {
    VkClusterAccelerationStructureClustersBottomLevelInputNV.p("pClustersBottomLevel")
    VkClusterAccelerationStructureTriangleClusterInputNV.p("pTriangleClusters")
    VkClusterAccelerationStructureMoveObjectsInputNV.p("pMoveObjects")
}

val VkClusterAccelerationStructureInputInfoNV = struct(Module.VULKAN, "VkClusterAccelerationStructureInputInfoNV") {
    Expression("#STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    uint32_t("maxAccelerationStructureCount")
    VkBuildAccelerationStructureFlagsKHR("flags")
    VkClusterAccelerationStructureOpTypeNV("opType")
    VkClusterAccelerationStructureOpModeNV("opMode")
    VkClusterAccelerationStructureOpInputNV("opInput")
}

val VkClusterAccelerationStructureCommandsInfoNV = struct(Module.VULKAN, "VkClusterAccelerationStructureCommandsInfoNV") {
    Expression("#STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_COMMANDS_INFO_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkClusterAccelerationStructureInputInfoNV("input")
    VkDeviceAddress("dstImplicitData")
    VkDeviceAddress("scratchData")
    VkStridedDeviceAddressRegionKHR("dstAddressesArray")
    VkStridedDeviceAddressRegionKHR("dstSizesArray")
    VkStridedDeviceAddressRegionKHR("srcInfosArray")
    VkDeviceAddress("srcInfosCount")
    VkClusterAccelerationStructureAddressResolutionFlagsNV("addressResolutionFlags")
}

val VkStridedDeviceAddressNV = struct(Module.VULKAN, "VkStridedDeviceAddressNV") {
    VkDeviceAddress("startAddress")
    VkDeviceSize("strideInBytes")
}

val VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV = struct(Module.VULKAN, "VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV") {
    uint32_t("geometryIndex", bits = 24)
    uint32_t("reserved", bits = 5)
    uint32_t("geometryFlags", bits = 3)
}

val VkClusterAccelerationStructureMoveObjectsInfoNV = struct(Module.VULKAN, "VkClusterAccelerationStructureMoveObjectsInfoNV") {
    VkDeviceAddress("srcAccelerationStructure")
}

val VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV = struct(Module.VULKAN, "VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV") {
    uint32_t("clusterReferencesCount")
    uint32_t("clusterReferencesStride")
    VkDeviceAddress("clusterReferences")
}

val VkClusterAccelerationStructureBuildTriangleClusterInfoNV = struct(Module.VULKAN, "VkClusterAccelerationStructureBuildTriangleClusterInfoNV") {
    uint32_t("clusterID")
    VkClusterAccelerationStructureClusterFlagsNV("clusterFlags")
    uint32_t("triangleCount", bits = 9)
    uint32_t("vertexCount", bits = 9)
    uint32_t("positionTruncateBitCount", bits = 6)
    uint32_t("indexType", bits = 4)
    uint32_t("opacityMicromapIndexType", bits = 4)
    VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV("baseGeometryIndexAndGeometryFlags")
    uint16_t("indexBufferStride")
    uint16_t("vertexBufferStride")
    uint16_t("geometryIndexAndFlagsBufferStride")
    uint16_t("opacityMicromapIndexBufferStride")
    VkDeviceAddress("indexBuffer")
    VkDeviceAddress("vertexBuffer")
    VkDeviceAddress("geometryIndexAndFlagsBuffer")
    VkDeviceAddress("opacityMicromapArray")
    VkDeviceAddress("opacityMicromapIndexBuffer")
}

val VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV = struct(Module.VULKAN, "VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV") {
    uint32_t("clusterID")
    VkClusterAccelerationStructureClusterFlagsNV("clusterFlags")
    uint32_t("triangleCount", bits = 9)
    uint32_t("vertexCount", bits = 9)
    uint32_t("positionTruncateBitCount", bits = 6)
    uint32_t("indexType", bits = 4)
    uint32_t("opacityMicromapIndexType", bits = 4)
    VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV("baseGeometryIndexAndGeometryFlags")
    uint16_t("indexBufferStride")
    uint16_t("vertexBufferStride")
    uint16_t("geometryIndexAndFlagsBufferStride")
    uint16_t("opacityMicromapIndexBufferStride")
    VkDeviceAddress("indexBuffer")
    VkDeviceAddress("vertexBuffer")
    VkDeviceAddress("geometryIndexAndFlagsBuffer")
    VkDeviceAddress("opacityMicromapArray")
    VkDeviceAddress("opacityMicromapIndexBuffer")
    VkDeviceAddress("instantiationBoundingBoxLimit")
}

val VkClusterAccelerationStructureInstantiateClusterInfoNV = struct(Module.VULKAN, "VkClusterAccelerationStructureInstantiateClusterInfoNV") {
    uint32_t("clusterIdOffset")
    uint32_t("geometryIndexOffset", bits = 24)
    uint32_t("reserved", bits = 8)
    VkDeviceAddress("clusterTemplateAddress")
    VkStridedDeviceAddressNV("vertexBuffer")
}

val VkClusterAccelerationStructureGetTemplateIndicesInfoNV = struct(Module.VULKAN, "VkClusterAccelerationStructureGetTemplateIndicesInfoNV") {
    VkDeviceAddress("clusterTemplateAddress")
}

val VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV = struct(Module.VULKAN, "VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV") {
    Expression("#STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CLUSTER_ACCELERATION_STRUCTURE_CREATE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("allowClusterAccelerationStructure")
}

val VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV = struct(Module.VULKAN, "VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("partitionedAccelerationStructure")
}

val VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV = struct(Module.VULKAN, "VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxPartitionCount")
}

val VkPartitionedAccelerationStructureFlagsNV = struct(Module.VULKAN, "VkPartitionedAccelerationStructureFlagsNV") {
    Expression("#STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("enablePartitionTranslation")
}

val VkBuildPartitionedAccelerationStructureIndirectCommandNV = struct(Module.VULKAN, "VkBuildPartitionedAccelerationStructureIndirectCommandNV") {
    VkPartitionedAccelerationStructureOpTypeNV("opType")
    uint32_t("argCount")
    VkStridedDeviceAddressNV("argData")
}

val VkPartitionedAccelerationStructureWriteInstanceDataNV = struct(Module.VULKAN, "VkPartitionedAccelerationStructureWriteInstanceDataNV") {
    VkTransformMatrixKHR("transform")
    float("explicitAABB")[6]
    uint32_t("instanceID")
    uint32_t("instanceMask")
    uint32_t("instanceContributionToHitGroupIndex")
    VkPartitionedAccelerationStructureInstanceFlagsNV("instanceFlags")
    uint32_t("instanceIndex")
    uint32_t("partitionIndex")
    VkDeviceAddress("accelerationStructure")
}

val VkPartitionedAccelerationStructureUpdateInstanceDataNV = struct(Module.VULKAN, "VkPartitionedAccelerationStructureUpdateInstanceDataNV") {
    uint32_t("instanceIndex")
    uint32_t("instanceContributionToHitGroupIndex")
    VkDeviceAddress("accelerationStructure")
}

val VkPartitionedAccelerationStructureWritePartitionTranslationDataNV = struct(Module.VULKAN, "VkPartitionedAccelerationStructureWritePartitionTranslationDataNV") {
    uint32_t("partitionIndex")
    float("partitionTranslation")[3]
}

val VkWriteDescriptorSetPartitionedAccelerationStructureNV = struct(Module.VULKAN, "VkWriteDescriptorSetPartitionedAccelerationStructureNV") {
    Expression("#STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    AutoSize("pAccelerationStructures", optional = true)..uint32_t("accelerationStructureCount")
    nullable..VkDeviceAddress.const.p("pAccelerationStructures")
}

val VkPartitionedAccelerationStructureInstancesInputNV = struct(Module.VULKAN, "VkPartitionedAccelerationStructureInstancesInputNV") {
    Expression("#STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV")..VkStructureType("sType")
    PointerSetter(
        "VkPartitionedAccelerationStructureFlagsNV",
        prepend = true
    )..nullable..opaque_p("pNext")
    VkBuildAccelerationStructureFlagsKHR("flags")
    uint32_t("instanceCount")
    uint32_t("maxInstancePerPartitionCount")
    uint32_t("partitionCount")
    uint32_t("maxInstanceInGlobalPartitionCount")
}

val VkBuildPartitionedAccelerationStructureInfoNV = struct(Module.VULKAN, "VkBuildPartitionedAccelerationStructureInfoNV") {
    Expression("#STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkPartitionedAccelerationStructureInstancesInputNV("input")
    VkDeviceAddress("srcAccelerationStructureData")
    VkDeviceAddress("dstAccelerationStructureData")
    VkDeviceAddress("scratchData")
    VkDeviceAddress("srcInfos")
    VkDeviceAddress("srcInfosCount")
}

val VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("deviceGeneratedCommands")
    VkBool32("dynamicGeneratedPipelineLayout")
}

val VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxIndirectPipelineCount")
    uint32_t("maxIndirectShaderObjectCount")
    uint32_t("maxIndirectSequenceCount")
    uint32_t("maxIndirectCommandsTokenCount")
    uint32_t("maxIndirectCommandsTokenOffset")
    uint32_t("maxIndirectCommandsIndirectStride")
    VkIndirectCommandsInputModeFlagsEXT("supportedIndirectCommandsInputModes")
    VkShaderStageFlags("supportedIndirectCommandsShaderStages")
    VkShaderStageFlags("supportedIndirectCommandsShaderStagesPipelineBinding")
    VkShaderStageFlags("supportedIndirectCommandsShaderStagesShaderBinding")
    VkBool32("deviceGeneratedCommandsTransformFeedback")
    VkBool32("deviceGeneratedCommandsMultiDrawIndirectCount")
}

val VkGeneratedCommandsMemoryRequirementsInfoEXT = struct(Module.VULKAN, "VkGeneratedCommandsMemoryRequirementsInfoEXT") {
    Expression("#STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkGeneratedCommandsPipelineInfoEXT", "VkGeneratedCommandsShaderInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkIndirectExecutionSetEXT("indirectExecutionSet")
    VkIndirectCommandsLayoutEXT("indirectCommandsLayout")
    uint32_t("maxSequenceCount")
    uint32_t("maxDrawCount")
}

val VkIndirectExecutionSetPipelineInfoEXT = struct(Module.VULKAN, "VkIndirectExecutionSetPipelineInfoEXT") {
    Expression("#STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipeline("initialPipeline")
    uint32_t("maxPipelineCount")
}

val VkIndirectExecutionSetShaderLayoutInfoEXT = struct(Module.VULKAN, "VkIndirectExecutionSetShaderLayoutInfoEXT") {
    Expression("#STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pSetLayouts", optional = true)..uint32_t("setLayoutCount")
    nullable..VkDescriptorSetLayout.const.p("pSetLayouts")
}

val VkIndirectExecutionSetShaderInfoEXT = struct(Module.VULKAN, "VkIndirectExecutionSetShaderInfoEXT") {
    Expression("#STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pInitialShaders", "pSetLayoutInfos")..uint32_t("shaderCount")
    VkShaderEXT.const.p("pInitialShaders")
    nullable..VkIndirectExecutionSetShaderLayoutInfoEXT.const.p("pSetLayoutInfos")
    uint32_t("maxShaderCount")
    AutoSize("pPushConstantRanges", optional = true)..uint32_t("pushConstantRangeCount")
    VkPushConstantRange.const.p("pPushConstantRanges")
}

val VkIndirectExecutionSetInfoEXT = union(Module.VULKAN, "VkIndirectExecutionSetInfoEXT") {
    VkIndirectExecutionSetPipelineInfoEXT.const.p("pPipelineInfo")
    VkIndirectExecutionSetShaderInfoEXT.const.p("pShaderInfo")
}

val VkIndirectExecutionSetCreateInfoEXT = struct(Module.VULKAN, "VkIndirectExecutionSetCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkIndirectExecutionSetInfoTypeEXT("type")
    VkIndirectExecutionSetInfoEXT("info")
}

val VkGeneratedCommandsInfoEXT = struct(Module.VULKAN, "VkGeneratedCommandsInfoEXT") {
    Expression("#STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkGeneratedCommandsPipelineInfoEXT", "VkGeneratedCommandsShaderInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkShaderStageFlags("shaderStages")
    VkIndirectExecutionSetEXT("indirectExecutionSet")
    VkIndirectCommandsLayoutEXT("indirectCommandsLayout")
    VkDeviceAddress("indirectAddress")
    VkDeviceSize("indirectAddressSize")
    VkDeviceAddress("preprocessAddress")
    VkDeviceSize("preprocessSize")
    uint32_t("maxSequenceCount")
    VkDeviceAddress("sequenceCountAddress")
    uint32_t("maxDrawCount")
}

val VkWriteIndirectExecutionSetPipelineEXT = struct(Module.VULKAN, "VkWriteIndirectExecutionSetPipelineEXT") {
    Expression("#STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("index")
    VkPipeline("pipeline")
}

val VkIndirectCommandsPushConstantTokenEXT = struct(Module.VULKAN, "VkIndirectCommandsPushConstantTokenEXT") {
    VkPushConstantRange("updateRange")
}

val VkIndirectCommandsVertexBufferTokenEXT = struct(Module.VULKAN, "VkIndirectCommandsVertexBufferTokenEXT") {
    uint32_t("vertexBindingUnit")
}

val VkIndirectCommandsIndexBufferTokenEXT = struct(Module.VULKAN, "VkIndirectCommandsIndexBufferTokenEXT") {
    VkIndirectCommandsInputModeFlagBitsEXT("mode")
}

val VkIndirectCommandsExecutionSetTokenEXT = struct(Module.VULKAN, "VkIndirectCommandsExecutionSetTokenEXT") {
    VkIndirectExecutionSetInfoTypeEXT("type")
    VkShaderStageFlags("shaderStages")
}

val VkIndirectCommandsTokenDataEXT = union(Module.VULKAN, "VkIndirectCommandsTokenDataEXT") {
    VkIndirectCommandsPushConstantTokenEXT.const.p("pPushConstant")
    VkIndirectCommandsVertexBufferTokenEXT.const.p("pVertexBuffer")
    VkIndirectCommandsIndexBufferTokenEXT.const.p("pIndexBuffer")
    VkIndirectCommandsExecutionSetTokenEXT.const.p("pExecutionSet")
}

val VkIndirectCommandsLayoutTokenEXT = struct(Module.VULKAN, "VkIndirectCommandsLayoutTokenEXT") {
    Expression("#STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkPushConstantBankInfoNV",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkIndirectCommandsTokenTypeEXT("type")
    VkIndirectCommandsTokenDataEXT("data")
    uint32_t("offset")
}

val VkIndirectCommandsLayoutCreateInfoEXT = struct(Module.VULKAN, "VkIndirectCommandsLayoutCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT")..VkStructureType("sType")
    PointerSetter(
        "VkPipelineLayoutCreateInfo",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkIndirectCommandsLayoutUsageFlagsEXT("flags")
    VkShaderStageFlags("shaderStages")
    uint32_t("indirectStride")
    VkPipelineLayout("pipelineLayout")
    AutoSize("pTokens")..uint32_t("tokenCount")
    VkIndirectCommandsLayoutTokenEXT.const.p("pTokens")
}

val VkDrawIndirectCountIndirectCommandEXT = struct(Module.VULKAN, "VkDrawIndirectCountIndirectCommandEXT") {
    VkDeviceAddress("bufferAddress")
    uint32_t("stride")
    uint32_t("commandCount")
}

val VkBindVertexBufferIndirectCommandEXT = struct(Module.VULKAN, "VkBindVertexBufferIndirectCommandEXT") {
    VkDeviceAddress("bufferAddress")
    uint32_t("size")
    uint32_t("stride")
}

val VkBindIndexBufferIndirectCommandEXT = struct(Module.VULKAN, "VkBindIndexBufferIndirectCommandEXT") {
    VkDeviceAddress("bufferAddress")
    uint32_t("size")
    VkIndexType("indexType")
}

val VkGeneratedCommandsPipelineInfoEXT = struct(Module.VULKAN, "VkGeneratedCommandsPipelineInfoEXT") {
    Expression("#STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkPipeline("pipeline")
}

val VkGeneratedCommandsShaderInfoEXT = struct(Module.VULKAN, "VkGeneratedCommandsShaderInfoEXT") {
    Expression("#STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    AutoSize("pShaders")..uint32_t("shaderCount")
    VkShaderEXT.const.p("pShaders")
}

val VkWriteIndirectExecutionSetShaderEXT = struct(Module.VULKAN, "VkWriteIndirectExecutionSetShaderEXT") {
    Expression("#STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("index")
    VkShaderEXT("shader")
}

val VkMemoryBarrierAccessFlags3KHR = struct(Module.VULKAN, "VkMemoryBarrierAccessFlags3KHR") {
    Expression("#STRUCTURE_TYPE_MEMORY_BARRIER_ACCESS_FLAGS_3_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAccessFlags3KHR("srcAccessMask3")
    VkAccessFlags3KHR("dstAccessMask3")
}

val VkPhysicalDeviceMaintenance8FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance8FeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_8_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("maintenance8")
}

val VkPhysicalDeviceImageAlignmentControlFeaturesMESA = struct(Module.VULKAN, "VkPhysicalDeviceImageAlignmentControlFeaturesMESA") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_FEATURES_MESA")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("imageAlignmentControl")
}

val VkPhysicalDeviceImageAlignmentControlPropertiesMESA = struct(Module.VULKAN, "VkPhysicalDeviceImageAlignmentControlPropertiesMESA", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_PROPERTIES_MESA")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("supportedImageAlignmentMask")
}

val VkImageAlignmentControlCreateInfoMESA = struct(Module.VULKAN, "VkImageAlignmentControlCreateInfoMESA") {
    Expression("#STRUCTURE_TYPE_IMAGE_ALIGNMENT_CONTROL_CREATE_INFO_MESA")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("maximumRequestedAlignment")
}

val VkPhysicalDeviceShaderFmaFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderFmaFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FMA_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderFmaFloat16")
    VkBool32("shaderFmaFloat32")
    VkBool32("shaderFmaFloat64")
}

val VkPushConstantBankInfoNV = struct(Module.VULKAN, "VkPushConstantBankInfoNV") {
    Expression("#STRUCTURE_TYPE_PUSH_CONSTANT_BANK_INFO_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("bank")
}

val VkPhysicalDevicePushConstantBankFeaturesNV = struct(Module.VULKAN, "VkPhysicalDevicePushConstantBankFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("pushConstantBank")
}

val VkPhysicalDevicePushConstantBankPropertiesNV = struct(Module.VULKAN, "VkPhysicalDevicePushConstantBankPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxGraphicsPushConstantBanks")
    uint32_t("maxComputePushConstantBanks")
    uint32_t("maxGraphicsPushDataBanks")
    uint32_t("maxComputePushDataBanks")
}

val VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkRayTracingInvocationReorderModeEXT("rayTracingInvocationReorderReorderingHint")
    uint32_t("maxShaderBindingTableRecordIndex")
}

val VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("rayTracingInvocationReorder")
}

val VkPhysicalDeviceDepthClampControlFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDepthClampControlFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("depthClampControl")
}

val VkPipelineViewportDepthClampControlCreateInfoEXT = struct(Module.VULKAN, "VkPipelineViewportDepthClampControlCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDepthClampModeEXT("depthClampMode")
    nullable..VkDepthClampRangeEXT.const.p("pDepthClampRange")
}

val VkPhysicalDeviceMaintenance9FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance9FeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_9_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("maintenance9")
}

val VkPhysicalDeviceMaintenance9PropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance9PropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_9_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("image2DViewOf3DSparse")
    VkDefaultVertexAttributeValueKHR("defaultVertexAttributeValue")
}

val VkQueueFamilyOwnershipTransferPropertiesKHR = struct(Module.VULKAN, "VkQueueFamilyOwnershipTransferPropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_QUEUE_FAMILY_OWNERSHIP_TRANSFER_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("optimalImageTransferToQueueFamilies")
}

val VkPhysicalDeviceVideoMaintenance2FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVideoMaintenance2FeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_MAINTENANCE_2_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("videoMaintenance2")
}

val VkVideoDecodeH264InlineSessionParametersInfoKHR = struct(Module.VULKAN, "VkVideoDecodeH264InlineSessionParametersInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_H264_INLINE_SESSION_PARAMETERS_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    nullable..StdVideoH264SequenceParameterSet.const.p("pStdSPS")
    nullable..StdVideoH264PictureParameterSet.const.p("pStdPPS")
}

val VkVideoDecodeH265InlineSessionParametersInfoKHR = struct(Module.VULKAN, "VkVideoDecodeH265InlineSessionParametersInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    nullable..StdVideoH265VideoParameterSet.const.p("pStdVPS")
    nullable..StdVideoH265SequenceParameterSet.const.p("pStdSPS")
    nullable..StdVideoH265PictureParameterSet.const.p("pStdPPS")
}

val VkVideoDecodeAV1InlineSessionParametersInfoKHR = struct(Module.VULKAN, "VkVideoDecodeAV1InlineSessionParametersInfoKHR") {
    javaImport("org.lwjgl.vulkan.video.*")
    Expression("#STRUCTURE_TYPE_VIDEO_DECODE_AV1_INLINE_SESSION_PARAMETERS_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    nullable..StdVideoAV1SequenceHeader.const.p("pStdSequenceHeader")
}

val VkPhysicalDeviceHdrVividFeaturesHUAWEI = struct(Module.VULKAN, "VkPhysicalDeviceHdrVividFeaturesHUAWEI") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_HDR_VIVID_FEATURES_HUAWEI")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("hdrVivid")
}

val VkHdrVividDynamicMetadataHUAWEI = struct(Module.VULKAN, "VkHdrVividDynamicMetadataHUAWEI") {
    Expression("#STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pDynamicMetadata")..size_t("dynamicMetadataSize")
    void.const.p("pDynamicMetadata")
}

val VkCooperativeMatrixFlexibleDimensionsPropertiesNV = struct(Module.VULKAN, "VkCooperativeMatrixFlexibleDimensionsPropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("MGranularity")
    uint32_t("NGranularity")
    uint32_t("KGranularity")
    VkComponentTypeNV("AType")
    VkComponentTypeNV("BType")
    VkComponentTypeNV("CType")
    VkComponentTypeNV("ResultType")
    VkBool32("saturatingAccumulation")
    VkScopeKHR("scope")
    uint32_t("workgroupInvocations")
}

val VkPhysicalDeviceCooperativeMatrix2FeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceCooperativeMatrix2FeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("cooperativeMatrixWorkgroupScope")
    VkBool32("cooperativeMatrixFlexibleDimensions")
    VkBool32("cooperativeMatrixReductions")
    VkBool32("cooperativeMatrixConversions")
    VkBool32("cooperativeMatrixPerElementOperations")
    VkBool32("cooperativeMatrixTensorAddressing")
    VkBool32("cooperativeMatrixBlockLoads")
}

val VkPhysicalDeviceCooperativeMatrix2PropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceCooperativeMatrix2PropertiesNV", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("cooperativeMatrixWorkgroupScopeMaxWorkgroupSize")
    uint32_t("cooperativeMatrixFlexibleDimensionsMaxDimension")
    uint32_t("cooperativeMatrixWorkgroupScopeReservedSharedMemory")
}

val VkPhysicalDevicePipelineOpacityMicromapFeaturesARM = struct(Module.VULKAN, "VkPhysicalDevicePipelineOpacityMicromapFeaturesARM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_OPACITY_MICROMAP_FEATURES_ARM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("pipelineOpacityMicromap")
}

val VkImportMemoryMetalHandleInfoEXT = struct(Module.VULKAN, "VkImportMemoryMetalHandleInfoEXT") {
    Expression("#STRUCTURE_TYPE_IMPORT_MEMORY_METAL_HANDLE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlagBits("handleType")
    nullable..opaque_p("handle")
}

val VkMemoryMetalHandlePropertiesEXT = struct(Module.VULKAN, "VkMemoryMetalHandlePropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("memoryTypeBits")
}

val VkMemoryGetMetalHandleInfoEXT = struct(Module.VULKAN, "VkMemoryGetMetalHandleInfoEXT") {
    Expression("#STRUCTURE_TYPE_MEMORY_GET_METAL_HANDLE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceMemory("memory")
    VkExternalMemoryHandleTypeFlagBits("handleType")
}

val VkPhysicalDeviceDepthClampZeroOneFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceDepthClampZeroOneFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("depthClampZeroOne")
}

val VkPhysicalDevicePerformanceCountersByRegionFeaturesARM = struct(Module.VULKAN, "VkPhysicalDevicePerformanceCountersByRegionFeaturesARM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("performanceCountersByRegion")
}

val VkPhysicalDevicePerformanceCountersByRegionPropertiesARM = struct(Module.VULKAN, "VkPhysicalDevicePerformanceCountersByRegionPropertiesARM", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_PROPERTIES_ARM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxPerRegionPerformanceCounters")
    VkExtent2D("performanceCounterRegionSize")
    uint32_t("rowStrideAlignment")
    uint32_t("regionAlignment")
    VkBool32("identityTransformOrder")
}

val VkPerformanceCounterARM = struct(Module.VULKAN, "VkPerformanceCounterARM", mutable = false) {
    Expression("#STRUCTURE_TYPE_PERFORMANCE_COUNTER_ARM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("counterID")
}

val VkPerformanceCounterDescriptionARM = struct(Module.VULKAN, "VkPerformanceCounterDescriptionARM", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_ARM")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPerformanceCounterDescriptionFlagsARM("flags")
    charUTF8("name")["VK_MAX_DESCRIPTION_SIZE"]
}

val VkRenderPassPerformanceCountersByRegionBeginInfoARM = struct(Module.VULKAN, "VkRenderPassPerformanceCountersByRegionBeginInfoARM") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    uint32_t("counterAddressCount")
    VkDeviceAddress.const.p("pCounterAddresses")
    VkBool32("serializeRegions")
    uint32_t("counterIndexCount")
    uint32_t.p("pCounterIndices")
}

val VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_ROBUSTNESS_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("vertexAttributeRobustness")
}

val VkPhysicalDeviceFormatPackFeaturesARM = struct(Module.VULKAN, "VkPhysicalDeviceFormatPackFeaturesARM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FORMAT_PACK_FEATURES_ARM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("formatPack")
}

val VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_LAYERED_FEATURES_VALVE")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("fragmentDensityMapLayered")
}

val VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_LAYERED_PROPERTIES_VALVE")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxFragmentDensityMapLayers")
}

val VkPipelineFragmentDensityMapLayeredCreateInfoVALVE = struct(Module.VULKAN, "VkPipelineFragmentDensityMapLayeredCreateInfoVALVE") {
    Expression("#STRUCTURE_TYPE_PIPELINE_FRAGMENT_DENSITY_MAP_LAYERED_CREATE_INFO_VALVE")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("maxFragmentDensityMapLayers")
}

val VkPhysicalDeviceRobustness2FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceRobustness2FeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("robustBufferAccess2")
    VkBool32("robustImageAccess2")
    VkBool32("nullDescriptor")
}

val VkPhysicalDeviceRobustness2PropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceRobustness2PropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceSize("robustStorageBufferAccessSizeAlignment")
    VkDeviceSize("robustUniformBufferAccessSizeAlignment")
}

val VkSetPresentConfigNV = struct(Module.VULKAN, "VkSetPresentConfigNV") {
    Expression("#STRUCTURE_TYPE_SET_PRESENT_CONFIG_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("numFramesPerBatch")
    uint32_t("presentConfigFeedback")
}

val VkPhysicalDevicePresentMeteringFeaturesNV = struct(Module.VULKAN, "VkPhysicalDevicePresentMeteringFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_METERING_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("presentMetering")
}

val _VkRenderingEndInfoKHR = struct(Module.VULKAN, "VkRenderingEndInfoKHR")
val VkRenderingEndInfoEXT = struct(Module.VULKAN, "VkRenderingEndInfoEXT", alias = _VkRenderingEndInfoKHR) {
    Expression("#STRUCTURE_TYPE_RENDERING_END_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
}

val VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("fragmentDensityMapOffset")
}

val VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExtent2D("fragmentDensityOffsetGranularity")
}

val VkRenderPassFragmentDensityMapOffsetEndInfoEXT = struct(Module.VULKAN, "VkRenderPassFragmentDensityMapOffsetEndInfoEXT") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pFragmentDensityOffsets", optional = true)..uint32_t("fragmentDensityOffsetCount")
    VkOffset2D.const.p("pFragmentDensityOffsets")
}

val VkRenderingEndInfoKHR = struct(Module.VULKAN, "VkRenderingEndInfoKHR") {
    Expression("#STRUCTURE_TYPE_RENDERING_END_INFO_KHR")..VkStructureType("sType")
    PointerSetter(
        "VkRenderPassFragmentDensityMapOffsetEndInfoEXT", "VkSubpassFragmentDensityMapOffsetEndInfoQCOM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
}

val VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_DEVICE_MEMORY_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("zeroInitializeDeviceMemory")
}

val VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_MODE_FIFO_LATEST_READY_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("presentModeFifoLatestReady")
}

val VkPhysicalDeviceShader64BitIndexingFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShader64BitIndexingFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_64_BIT_INDEXING_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shader64BitIndexing")
}

val VkPhysicalDeviceCustomResolveFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceCustomResolveFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_RESOLVE_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("customResolve")
}

val VkBeginCustomResolveInfoEXT = struct(Module.VULKAN, "VkBeginCustomResolveInfoEXT") {
    Expression("#STRUCTURE_TYPE_BEGIN_CUSTOM_RESOLVE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
}

val VkCustomResolveCreateInfoEXT = struct(Module.VULKAN, "VkCustomResolveCreateInfoEXT") {
    Expression("#STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("customResolve")
    AutoSize("pColorAttachmentFormats", optional = true)..uint32_t("colorAttachmentCount")
    nullable..VkFormat.const.p("pColorAttachmentFormats")
    VkFormat("depthAttachmentFormat")
    VkFormat("stencilAttachmentFormat")
}

val VkPipelineCacheHeaderVersionDataGraphQCOM = struct(Module.VULKAN, "VkPipelineCacheHeaderVersionDataGraphQCOM") {
    javaImport("static org.lwjgl.vulkan.QCOMDataGraphModel.*")
    uint32_t("headerSize")
    VkPipelineCacheHeaderVersion("headerVersion")
    VkDataGraphModelCacheTypeQCOM("cacheType")
    uint32_t("cacheVersion")
    uint32_t("toolchainVersion")["VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM"]
}

val VkDataGraphPipelineBuiltinModelCreateInfoQCOM = struct(Module.VULKAN, "VkDataGraphPipelineBuiltinModelCreateInfoQCOM") {
    Expression("#STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_BUILTIN_MODEL_CREATE_INFO_QCOM")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPhysicalDeviceDataGraphOperationSupportARM.const.p("pOperation")
}

val VkPhysicalDeviceDataGraphModelFeaturesQCOM = struct(Module.VULKAN, "VkPhysicalDeviceDataGraphModelFeaturesQCOM") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_MODEL_FEATURES_QCOM")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("dataGraphModel")
}

val VkPhysicalDeviceMaintenance10FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance10FeaturesKHR") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_FEATURES_KHR")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("maintenance10")
}

val VkPhysicalDeviceMaintenance10PropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance10PropertiesKHR", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_PROPERTIES_KHR")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("rgba4OpaqueBlackSwizzled")
    VkBool32("resolveSrgbFormatAppliesTransferFunction")
    VkBool32("resolveSrgbFormatSupportsTransferFunctionControl")
}

val VkRenderingAttachmentFlagsInfoKHR = struct(Module.VULKAN, "VkRenderingAttachmentFlagsInfoKHR") {
    Expression("#STRUCTURE_TYPE_RENDERING_ATTACHMENT_FLAGS_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkRenderingAttachmentFlagsKHR("flags")
}

val VkResolveImageModeInfoKHR = struct(Module.VULKAN, "VkResolveImageModeInfoKHR") {
    Expression("#STRUCTURE_TYPE_RESOLVE_IMAGE_MODE_INFO_KHR")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkResolveImageFlagsKHR("flags")
    VkResolveModeFlagBits("resolveMode")
    VkResolveModeFlagBits("stencilResolveMode")
}

val VkPhysicalDeviceShaderLongVectorFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderLongVectorFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_LONG_VECTOR_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("longVector")
}

val VkPhysicalDeviceShaderLongVectorPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderLongVectorPropertiesEXT", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_LONG_VECTOR_PROPERTIES_EXT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxVectorComponents")
}

val VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC = struct(Module.VULKAN, "VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CACHE_INCREMENTAL_MODE_FEATURES_SEC")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("pipelineCacheIncrementalMode")
}

val VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_UNIFORM_BUFFER_UNSIZED_ARRAY_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderUniformBufferUnsizedArray")
}

val VkComputeOccupancyPriorityParametersNV = struct(Module.VULKAN, "VkComputeOccupancyPriorityParametersNV") {
    Expression("#STRUCTURE_TYPE_COMPUTE_OCCUPANCY_PRIORITY_PARAMETERS_NV")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    float("occupancyPriority")
    float("occupancyThrottling")
}

val VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_OCCUPANCY_PRIORITY_FEATURES_NV")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("computeOccupancyPriority")
}

val VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_PARTITIONED_FEATURES_EXT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderSubgroupPartitioned")
}

val VkUbmSurfaceCreateInfoSEC = struct(Module.VULKAN, "VkUbmSurfaceCreateInfoSEC") {
    Expression("#STRUCTURE_TYPE_UBM_SURFACE_CREATE_INFO_SEC")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkUbmSurfaceCreateFlagsSEC("flags")
    nullable..ubm_device.p("ubm_device")
    nullable..ubm_surface.p("ubm_surface")
}