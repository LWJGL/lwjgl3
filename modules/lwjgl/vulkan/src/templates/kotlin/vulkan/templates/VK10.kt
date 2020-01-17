/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val VK10 = "VK10".nativeClass(Module.VULKAN, "VK10", prefix = "VK", binding = VK_BINDING_INSTANCE) {
    documentation =
        """
        The core Vulkan 1.0 functionality.
        """

    EnumConstant(
        """
        VkPipelineCacheHeaderVersion - Encode pipeline cache version

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_CACHE_HEADER_VERSION_ONE specifies version one of the pipeline cache.</li>
        </ul>

        <h5>See Also</h5>
        #CreatePipelineCache(), #GetPipelineCacheData()
        """,

        "PIPELINE_CACHE_HEADER_VERSION_ONE".."1"
    )

    EnumConstant(
        """
        VkResult - Vulkan command return codes

        <h5>Description</h5>
        <ul>
            <li>#SUCCESS Command successfully completed</li>
            <li>#NOT_READY A fence or query has not yet completed</li>
            <li>#TIMEOUT A wait operation has not completed in the specified time</li>
            <li>#EVENT_SET An event is signaled</li>
            <li>#EVENT_RESET An event is unsignaled</li>
            <li>#INCOMPLETE A return array was too small for the result</li>
            <li>#SUBOPTIMAL_KHR A swapchain no longer matches the surface properties exactly, but <b>can</b> still be used to present to the surface successfully.</li>
        </ul>

        <ul>
            <li>#ERROR_OUT_OF_HOST_MEMORY A host memory allocation has failed.</li>
            <li>#ERROR_OUT_OF_DEVICE_MEMORY A device memory allocation has failed.</li>
            <li>#ERROR_INITIALIZATION_FAILED Initialization of an object could not be completed for implementation-specific reasons.</li>
            <li>#ERROR_DEVICE_LOST The logical or physical device has been lost. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#devsandqueues-lost-device">Lost Device</a></li>
            <li>#ERROR_MEMORY_MAP_FAILED Mapping of a memory object has failed.</li>
            <li>#ERROR_LAYER_NOT_PRESENT A requested layer is not present or could not be loaded.</li>
            <li>#ERROR_EXTENSION_NOT_PRESENT A requested extension is not supported.</li>
            <li>#ERROR_FEATURE_NOT_PRESENT A requested feature is not supported.</li>
            <li>#ERROR_INCOMPATIBLE_DRIVER The requested version of Vulkan is not supported by the driver or is otherwise incompatible for implementation-specific reasons.</li>
            <li>#ERROR_TOO_MANY_OBJECTS Too many objects of the type have already been created.</li>
            <li>#ERROR_FORMAT_NOT_SUPPORTED A requested format is not supported on this device.</li>
            <li>#ERROR_FRAGMENTED_POOL A pool allocation has failed due to fragmentation of the pool&#8217;s memory. This <b>must</b> only be returned if no attempt to allocate host or device memory was made to accommodate the new allocation. This <b>should</b> be returned in preference to #ERROR_OUT_OF_POOL_MEMORY, but only if the implementation is certain that the pool allocation failure was due to fragmentation.</li>
            <li>#ERROR_SURFACE_LOST_KHR A surface is no longer available.</li>
            <li>#ERROR_NATIVE_WINDOW_IN_USE_KHR The requested window is already in use by Vulkan or another API in a manner which prevents it from being used again.</li>
            <li>#ERROR_OUT_OF_DATE_KHR A surface has changed in such a way that it is no longer compatible with the swapchain, and further presentation requests using the swapchain will fail. Applications <b>must</b> query the new surface properties and recreate their swapchain if they wish to continue presenting to the surface.</li>
            <li>#ERROR_INCOMPATIBLE_DISPLAY_KHR The display used by a swapchain does not use the same presentable image layout, or is incompatible in a way that prevents sharing an image.</li>
            <li>#ERROR_INVALID_SHADER_NV One or more shaders failed to compile or link. More details are reported back to the application via {@link EXTDebugReport VK_EXT_debug_report} if enabled.</li>
            <li>#ERROR_OUT_OF_POOL_MEMORY A pool memory allocation has failed. This <b>must</b> only be returned if no attempt to allocate host or device memory was made to accommodate the new allocation. If the failure was definitely due to fragmentation of the pool, #ERROR_FRAGMENTED_POOL <b>should</b> be returned instead.</li>
            <li>#ERROR_INVALID_EXTERNAL_HANDLE An external handle is not a valid handle of the specified type.</li>
            <li>#ERROR_FRAGMENTATION A descriptor pool creation has failed due to fragmentation.</li>
            <li>#ERROR_INVALID_DEVICE_ADDRESS_EXT A buffer creation failed because the requested address is not available.</li>
            <li>#ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS A buffer creation or memory allocation failed because the requested address is not available.</li>
            <li>#ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT An operation on a swapchain created with #FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT failed as it did not have exlusive full-screen access. This <b>may</b> occur due to implementation-dependent reasons, outside of the application&#8217;s control.</li>
            <li>#ERROR_UNKNOWN An unknown error has occurred; either the application has provided invalid input, or an implementation failure has occurred.</li>
        </ul>

        If a command returns a run time error, unless otherwise specified any output parameters will have undefined contents, except that if the output parameter is a structure with {@code sType} and {@code pNext} fields, those fields will be unmodified. Any structures chained from {@code pNext} will also have undefined contents, except that {@code sType} and {@code pNext} will be unmodified.

        Out of memory errors do not damage any currently existing Vulkan objects. Objects that have already been successfully created <b>can</b> still be used by the application.

        #ERROR_UNKNOWN will be returned by an implementation when an unexpected error occurs that cannot be attributed to valid behavior of the application and implementation.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        If #ERROR_UNKNOWN is received, the application should be checked against the latest validation layers to verify correct behavior as much as possible. If no issues are identified it could be an implementation issue, and the implementor should be contacted for support.

        This error should not be expected from any command if application behavior is valid, and if the implementation is bug-free, but it can be returned by <em>any</em> error returning command when that is not the case.
        </div>

        Performance-critical commands generally do not have return codes. If a run time error occurs in such commands, the implementation will defer reporting the error until a specified point. For commands that record into command buffers ({@code vkCmd*}) run time errors are reported by {@code vkEndCommandBuffer}.

        <h5>See Also</h5>
        ##VkPresentInfoKHR
        """,

        "SUCCESS".."0",
        "NOT_READY".."1",
        "TIMEOUT".."2",
        "EVENT_SET".."3",
        "EVENT_RESET".."4",
        "INCOMPLETE".."5",
        "ERROR_OUT_OF_HOST_MEMORY".."-1",
        "ERROR_OUT_OF_DEVICE_MEMORY".."-2",
        "ERROR_INITIALIZATION_FAILED".."-3",
        "ERROR_DEVICE_LOST".."-4",
        "ERROR_MEMORY_MAP_FAILED".."-5",
        "ERROR_LAYER_NOT_PRESENT".."-6",
        "ERROR_EXTENSION_NOT_PRESENT".."-7",
        "ERROR_FEATURE_NOT_PRESENT".."-8",
        "ERROR_INCOMPATIBLE_DRIVER".."-9",
        "ERROR_TOO_MANY_OBJECTS".."-10",
        "ERROR_FORMAT_NOT_SUPPORTED".."-11",
        "ERROR_FRAGMENTED_POOL".."-12",
        "ERROR_UNKNOWN".."-13"
    )

    EnumConstant(
        """
        VkStructureType - Vulkan structure types ({@code stype})

        <h5>Description</h5>
        Each value corresponds to a particular structure with a {@code sType} member with a matching name. As a general rule, the name of each {@code VkStructureType} value is obtained by taking the name of the structure, stripping the leading {@code Vk}, prefixing each capital letter with {@code _}, converting the entire resulting string to upper case, and prefixing it with {@code VK_STRUCTURE_TYPE_}. For example, structures of type ##VkImageCreateInfo correspond to a {@code VkStructureType} of #STRUCTURE_TYPE_IMAGE_CREATE_INFO, and thus its {@code sType} member <b>must</b> equal that when it is passed to the API.

        The values #STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO and #STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO are reserved for internal use by the loader, and do not have corresponding Vulkan structures in this Specification.

        <h5>See Also</h5>
        ##VkAccelerationStructureCreateInfoNV, ##VkAccelerationStructureInfoNV, ##VkAccelerationStructureMemoryRequirementsInfoNV, ##VkAcquireNextImageInfoKHR, ##VkAcquireProfilingLockInfoKHR, ##VkApplicationInfo, ##VkAttachmentDescription2, ##VkAttachmentDescriptionStencilLayout, ##VkAttachmentReference2, ##VkAttachmentReferenceStencilLayout, ##VkBaseInStructure, ##VkBaseOutStructure, ##VkBindAccelerationStructureMemoryInfoNV, ##VkBindBufferMemoryDeviceGroupInfo, ##VkBindBufferMemoryInfo, ##VkBindImageMemoryDeviceGroupInfo, ##VkBindImageMemoryInfo, ##VkBindImageMemorySwapchainInfoKHR, ##VkBindImagePlaneMemoryInfo, ##VkBindSparseInfo, ##VkBufferCreateInfo, ##VkBufferDeviceAddressCreateInfoEXT, ##VkBufferDeviceAddressInfo, ##VkBufferMemoryBarrier, ##VkBufferMemoryRequirementsInfo2, ##VkBufferOpaqueCaptureAddressCreateInfo, ##VkBufferViewCreateInfo, ##VkCalibratedTimestampInfoEXT, ##VkCheckpointDataNV, ##VkCmdProcessCommandsInfoNVX, ##VkCmdReserveSpaceForCommandsInfoNVX, ##VkCommandBufferAllocateInfo, ##VkCommandBufferBeginInfo, ##VkCommandBufferInheritanceConditionalRenderingInfoEXT, ##VkCommandBufferInheritanceInfo, ##VkCommandPoolCreateInfo, ##VkComputePipelineCreateInfo, ##VkConditionalRenderingBeginInfoEXT, ##VkCooperativeMatrixPropertiesNV, ##VkCopyDescriptorSet, ##VkD3D12FenceSubmitInfoKHR, ##VkDebugMarkerMarkerInfoEXT, ##VkDebugMarkerObjectNameInfoEXT, ##VkDebugMarkerObjectTagInfoEXT, ##VkDebugReportCallbackCreateInfoEXT, ##VkDebugUtilsLabelEXT, ##VkDebugUtilsMessengerCallbackDataEXT, ##VkDebugUtilsMessengerCreateInfoEXT, ##VkDebugUtilsObjectNameInfoEXT, ##VkDebugUtilsObjectTagInfoEXT, ##VkDedicatedAllocationBufferCreateInfoNV, ##VkDedicatedAllocationImageCreateInfoNV, ##VkDedicatedAllocationMemoryAllocateInfoNV, ##VkDescriptorPoolCreateInfo, ##VkDescriptorPoolInlineUniformBlockCreateInfoEXT, ##VkDescriptorSetAllocateInfo, ##VkDescriptorSetLayoutBindingFlagsCreateInfo, ##VkDescriptorSetLayoutCreateInfo, ##VkDescriptorSetLayoutSupport, ##VkDescriptorSetVariableDescriptorCountAllocateInfo, ##VkDescriptorSetVariableDescriptorCountLayoutSupport, ##VkDescriptorUpdateTemplateCreateInfo, ##VkDeviceCreateInfo, ##VkDeviceEventInfoEXT, ##VkDeviceGeneratedCommandsFeaturesNVX, ##VkDeviceGeneratedCommandsLimitsNVX, ##VkDeviceGroupBindSparseInfo, ##VkDeviceGroupCommandBufferBeginInfo, ##VkDeviceGroupDeviceCreateInfo, ##VkDeviceGroupPresentCapabilitiesKHR, ##VkDeviceGroupPresentInfoKHR, ##VkDeviceGroupRenderPassBeginInfo, ##VkDeviceGroupSubmitInfo, ##VkDeviceGroupSwapchainCreateInfoKHR, ##VkDeviceMemoryOpaqueCaptureAddressInfo, ##VkDeviceMemoryOverallocationCreateInfoAMD, ##VkDeviceQueueCreateInfo, ##VkDeviceQueueGlobalPriorityCreateInfoEXT, ##VkDeviceQueueInfo2, ##VkDisplayEventInfoEXT, ##VkDisplayModeCreateInfoKHR, ##VkDisplayModeProperties2KHR, ##VkDisplayNativeHdrSurfaceCapabilitiesAMD, ##VkDisplayPlaneCapabilities2KHR, ##VkDisplayPlaneInfo2KHR, ##VkDisplayPlaneProperties2KHR, ##VkDisplayPowerInfoEXT, ##VkDisplayPresentInfoKHR, ##VkDisplayProperties2KHR, ##VkDisplaySurfaceCreateInfoKHR, ##VkDrmFormatModifierPropertiesListEXT, ##VkEventCreateInfo, ##VkExportFenceCreateInfo, ##VkExportFenceWin32HandleInfoKHR, ##VkExportMemoryAllocateInfo, ##VkExportMemoryAllocateInfoNV, ##VkExportMemoryWin32HandleInfoKHR, ##VkExportMemoryWin32HandleInfoNV, ##VkExportSemaphoreCreateInfo, ##VkExportSemaphoreWin32HandleInfoKHR, ##VkExternalBufferProperties, ##VkExternalFenceProperties, ##VkExternalImageFormatProperties, ##VkExternalMemoryBufferCreateInfo, ##VkExternalMemoryImageCreateInfo, ##VkExternalMemoryImageCreateInfoNV, ##VkExternalSemaphoreProperties, ##VkFenceCreateInfo, ##VkFenceGetFdInfoKHR, ##VkFenceGetWin32HandleInfoKHR, ##VkFilterCubicImageViewImageFormatPropertiesEXT, ##VkFormatProperties2, ##VkFramebufferAttachmentImageInfo, ##VkFramebufferAttachmentsCreateInfo, ##VkFramebufferCreateInfo, ##VkFramebufferMixedSamplesCombinationNV, ##VkGeometryAABBNV, ##VkGeometryNV, ##VkGeometryTrianglesNV, ##VkGraphicsPipelineCreateInfo, ##VkHdrMetadataEXT, ##VkHeadlessSurfaceCreateInfoEXT, ##VkImageCreateInfo, ##VkImageDrmFormatModifierExplicitCreateInfoEXT, ##VkImageDrmFormatModifierListCreateInfoEXT, ##VkImageDrmFormatModifierPropertiesEXT, ##VkImageFormatListCreateInfo, ##VkImageFormatProperties2, ##VkImageMemoryBarrier, ##VkImageMemoryRequirementsInfo2, ##VkImagePlaneMemoryRequirementsInfo, ##VkImageSparseMemoryRequirementsInfo2, ##VkImageStencilUsageCreateInfo, ##VkImageSwapchainCreateInfoKHR, ##VkImageViewASTCDecodeModeEXT, ##VkImageViewCreateInfo, ##VkImageViewHandleInfoNVX, ##VkImageViewUsageCreateInfo, ##VkImportFenceFdInfoKHR, ##VkImportFenceWin32HandleInfoKHR, ##VkImportMemoryFdInfoKHR, ##VkImportMemoryHostPointerInfoEXT, ##VkImportMemoryWin32HandleInfoKHR, ##VkImportMemoryWin32HandleInfoNV, ##VkImportSemaphoreFdInfoKHR, ##VkImportSemaphoreWin32HandleInfoKHR, ##VkIndirectCommandsLayoutCreateInfoNVX, ##VkInitializePerformanceApiInfoINTEL, ##VkInstanceCreateInfo, ##VkMacOSSurfaceCreateInfoMVK, ##VkMappedMemoryRange, ##VkMemoryAllocateFlagsInfo, ##VkMemoryAllocateInfo, ##VkMemoryBarrier, ##VkMemoryDedicatedAllocateInfo, ##VkMemoryDedicatedRequirements, ##VkMemoryFdPropertiesKHR, ##VkMemoryGetFdInfoKHR, ##VkMemoryGetWin32HandleInfoKHR, ##VkMemoryHostPointerPropertiesEXT, ##VkMemoryOpaqueCaptureAddressAllocateInfo, ##VkMemoryPriorityAllocateInfoEXT, ##VkMemoryRequirements2, ##VkMemoryWin32HandlePropertiesKHR, ##VkMetalSurfaceCreateInfoEXT, ##VkMultisamplePropertiesEXT, ##VkObjectTableCreateInfoNVX, ##VkPerformanceConfigurationAcquireInfoINTEL, ##VkPerformanceCounterDescriptionKHR, ##VkPerformanceCounterKHR, ##VkPerformanceMarkerInfoINTEL, ##VkPerformanceOverrideInfoINTEL, ##VkPerformanceQuerySubmitInfoKHR, ##VkPerformanceStreamMarkerInfoINTEL, ##VkPhysicalDevice16BitStorageFeatures, ##VkPhysicalDevice8BitStorageFeatures, ##VkPhysicalDeviceASTCDecodeFeaturesEXT, ##VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT, ##VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT, ##VkPhysicalDeviceBufferDeviceAddressFeatures, ##VkPhysicalDeviceBufferDeviceAddressFeaturesEXT, ##VkPhysicalDeviceCoherentMemoryFeaturesAMD, ##VkPhysicalDeviceComputeShaderDerivativesFeaturesNV, ##VkPhysicalDeviceConditionalRenderingFeaturesEXT, ##VkPhysicalDeviceConservativeRasterizationPropertiesEXT, ##VkPhysicalDeviceCooperativeMatrixFeaturesNV, ##VkPhysicalDeviceCooperativeMatrixPropertiesNV, ##VkPhysicalDeviceCornerSampledImageFeaturesNV, ##VkPhysicalDeviceCoverageReductionModeFeaturesNV, ##VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV, ##VkPhysicalDeviceDepthClipEnableFeaturesEXT, ##VkPhysicalDeviceDepthStencilResolveProperties, ##VkPhysicalDeviceDescriptorIndexingFeatures, ##VkPhysicalDeviceDescriptorIndexingProperties, ##VkPhysicalDeviceDiscardRectanglePropertiesEXT, ##VkPhysicalDeviceDriverProperties, ##VkPhysicalDeviceExclusiveScissorFeaturesNV, ##VkPhysicalDeviceExternalBufferInfo, ##VkPhysicalDeviceExternalFenceInfo, ##VkPhysicalDeviceExternalImageFormatInfo, ##VkPhysicalDeviceExternalMemoryHostPropertiesEXT, ##VkPhysicalDeviceExternalSemaphoreInfo, ##VkPhysicalDeviceFeatures2, ##VkPhysicalDeviceFloatControlsProperties, ##VkPhysicalDeviceFragmentDensityMapFeaturesEXT, ##VkPhysicalDeviceFragmentDensityMapPropertiesEXT, ##VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV, ##VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT, ##VkPhysicalDeviceGroupProperties, ##VkPhysicalDeviceHostQueryResetFeatures, ##VkPhysicalDeviceIDProperties, ##VkPhysicalDeviceImageDrmFormatModifierInfoEXT, ##VkPhysicalDeviceImageFormatInfo2, ##VkPhysicalDeviceImageViewImageFormatInfoEXT, ##VkPhysicalDeviceImagelessFramebufferFeatures, ##VkPhysicalDeviceIndexTypeUint8FeaturesEXT, ##VkPhysicalDeviceInlineUniformBlockFeaturesEXT, ##VkPhysicalDeviceInlineUniformBlockPropertiesEXT, ##VkPhysicalDeviceLineRasterizationFeaturesEXT, ##VkPhysicalDeviceLineRasterizationPropertiesEXT, ##VkPhysicalDeviceMaintenance3Properties, ##VkPhysicalDeviceMemoryBudgetPropertiesEXT, ##VkPhysicalDeviceMemoryPriorityFeaturesEXT, ##VkPhysicalDeviceMemoryProperties2, ##VkPhysicalDeviceMeshShaderFeaturesNV, ##VkPhysicalDeviceMeshShaderPropertiesNV, ##VkPhysicalDeviceMultiviewFeatures, ##VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX, ##VkPhysicalDeviceMultiviewProperties, ##VkPhysicalDevicePCIBusInfoPropertiesEXT, ##VkPhysicalDevicePerformanceQueryFeaturesKHR, ##VkPhysicalDevicePerformanceQueryPropertiesKHR, ##VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR, ##VkPhysicalDevicePointClippingProperties, ##VkPhysicalDeviceProperties2, ##VkPhysicalDeviceProtectedMemoryFeatures, ##VkPhysicalDeviceProtectedMemoryProperties, ##VkPhysicalDevicePushDescriptorPropertiesKHR, ##VkPhysicalDeviceRayTracingPropertiesNV, ##VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV, ##VkPhysicalDeviceSampleLocationsPropertiesEXT, ##VkPhysicalDeviceSamplerFilterMinmaxProperties, ##VkPhysicalDeviceSamplerYcbcrConversionFeatures, ##VkPhysicalDeviceScalarBlockLayoutFeatures, ##VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures, ##VkPhysicalDeviceShaderAtomicInt64Features, ##VkPhysicalDeviceShaderClockFeaturesKHR, ##VkPhysicalDeviceShaderCoreProperties2AMD, ##VkPhysicalDeviceShaderCorePropertiesAMD, ##VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT, ##VkPhysicalDeviceShaderDrawParametersFeatures, ##VkPhysicalDeviceShaderFloat16Int8Features, ##VkPhysicalDeviceShaderImageFootprintFeaturesNV, ##VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL, ##VkPhysicalDeviceShaderSMBuiltinsFeaturesNV, ##VkPhysicalDeviceShaderSMBuiltinsPropertiesNV, ##VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures, ##VkPhysicalDeviceShadingRateImageFeaturesNV, ##VkPhysicalDeviceShadingRateImagePropertiesNV, ##VkPhysicalDeviceSparseImageFormatInfo2, ##VkPhysicalDeviceSubgroupProperties, ##VkPhysicalDeviceSubgroupSizeControlFeaturesEXT, ##VkPhysicalDeviceSubgroupSizeControlPropertiesEXT, ##VkPhysicalDeviceSurfaceInfo2KHR, ##VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT, ##VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT, ##VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT, ##VkPhysicalDeviceTimelineSemaphoreFeatures, ##VkPhysicalDeviceTimelineSemaphoreProperties, ##VkPhysicalDeviceToolPropertiesEXT, ##VkPhysicalDeviceTransformFeedbackFeaturesEXT, ##VkPhysicalDeviceTransformFeedbackPropertiesEXT, ##VkPhysicalDeviceUniformBufferStandardLayoutFeatures, ##VkPhysicalDeviceVariablePointersFeatures, ##VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT, ##VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT, ##VkPhysicalDeviceVulkan11Features, ##VkPhysicalDeviceVulkan11Properties, ##VkPhysicalDeviceVulkan12Features, ##VkPhysicalDeviceVulkan12Properties, ##VkPhysicalDeviceVulkanMemoryModelFeatures, ##VkPhysicalDeviceYcbcrImageArraysFeaturesEXT, ##VkPipelineCacheCreateInfo, ##VkPipelineColorBlendAdvancedStateCreateInfoEXT, ##VkPipelineColorBlendStateCreateInfo, ##VkPipelineCompilerControlCreateInfoAMD, ##VkPipelineCoverageModulationStateCreateInfoNV, ##VkPipelineCoverageReductionStateCreateInfoNV, ##VkPipelineCoverageToColorStateCreateInfoNV, ##VkPipelineCreationFeedbackCreateInfoEXT, ##VkPipelineDepthStencilStateCreateInfo, ##VkPipelineDiscardRectangleStateCreateInfoEXT, ##VkPipelineDynamicStateCreateInfo, ##VkPipelineExecutableInfoKHR, ##VkPipelineExecutableInternalRepresentationKHR, ##VkPipelineExecutablePropertiesKHR, ##VkPipelineExecutableStatisticKHR, ##VkPipelineInfoKHR, ##VkPipelineInputAssemblyStateCreateInfo, ##VkPipelineLayoutCreateInfo, ##VkPipelineMultisampleStateCreateInfo, ##VkPipelineRasterizationConservativeStateCreateInfoEXT, ##VkPipelineRasterizationDepthClipStateCreateInfoEXT, ##VkPipelineRasterizationLineStateCreateInfoEXT, ##VkPipelineRasterizationStateCreateInfo, ##VkPipelineRasterizationStateRasterizationOrderAMD, ##VkPipelineRasterizationStateStreamCreateInfoEXT, ##VkPipelineRepresentativeFragmentTestStateCreateInfoNV, ##VkPipelineSampleLocationsStateCreateInfoEXT, ##VkPipelineShaderStageCreateInfo, ##VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT, ##VkPipelineTessellationDomainOriginStateCreateInfo, ##VkPipelineTessellationStateCreateInfo, ##VkPipelineVertexInputDivisorStateCreateInfoEXT, ##VkPipelineVertexInputStateCreateInfo, ##VkPipelineViewportCoarseSampleOrderStateCreateInfoNV, ##VkPipelineViewportExclusiveScissorStateCreateInfoNV, ##VkPipelineViewportShadingRateImageStateCreateInfoNV, ##VkPipelineViewportStateCreateInfo, ##VkPipelineViewportSwizzleStateCreateInfoNV, ##VkPipelineViewportWScalingStateCreateInfoNV, ##VkPresentInfoKHR, ##VkPresentRegionsKHR, ##VkPresentTimesInfoGOOGLE, ##VkProtectedSubmitInfo, ##VkQueryPoolCreateInfo, ##VkQueryPoolCreateInfoINTEL, ##VkQueryPoolPerformanceCreateInfoKHR, ##VkQueueFamilyCheckpointPropertiesNV, ##VkQueueFamilyProperties2, ##VkRayTracingPipelineCreateInfoNV, ##VkRayTracingShaderGroupCreateInfoNV, ##VkRenderPassAttachmentBeginInfo, ##VkRenderPassBeginInfo, ##VkRenderPassCreateInfo, ##VkRenderPassCreateInfo2, ##VkRenderPassFragmentDensityMapCreateInfoEXT, ##VkRenderPassInputAttachmentAspectCreateInfo, ##VkRenderPassMultiviewCreateInfo, ##VkRenderPassSampleLocationsBeginInfoEXT, ##VkSampleLocationsInfoEXT, ##VkSamplerCreateInfo, ##VkSamplerReductionModeCreateInfo, ##VkSamplerYcbcrConversionCreateInfo, ##VkSamplerYcbcrConversionImageFormatProperties, ##VkSamplerYcbcrConversionInfo, ##VkSemaphoreCreateInfo, ##VkSemaphoreGetFdInfoKHR, ##VkSemaphoreGetWin32HandleInfoKHR, ##VkSemaphoreSignalInfo, ##VkSemaphoreTypeCreateInfo, ##VkSemaphoreWaitInfo, ##VkShaderModuleCreateInfo, ##VkShaderModuleValidationCacheCreateInfoEXT, ##VkSharedPresentSurfaceCapabilitiesKHR, ##VkSparseImageFormatProperties2, ##VkSparseImageMemoryRequirements2, ##VkSubmitInfo, ##VkSubpassBeginInfo, ##VkSubpassDependency2, ##VkSubpassDescription2, ##VkSubpassDescriptionDepthStencilResolve, ##VkSubpassEndInfo, ##VkSurfaceCapabilities2EXT, ##VkSurfaceCapabilities2KHR, ##VkSurfaceCapabilitiesFullScreenExclusiveEXT, ##VkSurfaceFormat2KHR, ##VkSurfaceFullScreenExclusiveInfoEXT, ##VkSurfaceFullScreenExclusiveWin32InfoEXT, ##VkSurfaceProtectedCapabilitiesKHR, ##VkSwapchainCounterCreateInfoEXT, ##VkSwapchainCreateInfoKHR, ##VkSwapchainDisplayNativeHdrCreateInfoAMD, ##VkTextureLODGatherFormatPropertiesAMD, ##VkTimelineSemaphoreSubmitInfo, ##VkValidationCacheCreateInfoEXT, ##VkValidationFeaturesEXT, ##VkValidationFlagsEXT, ##VkWaylandSurfaceCreateInfoKHR, ##VkWin32KeyedMutexAcquireReleaseInfoKHR, ##VkWin32KeyedMutexAcquireReleaseInfoNV, ##VkWin32SurfaceCreateInfoKHR, ##VkWriteDescriptorSet, ##VkWriteDescriptorSetAccelerationStructureNV, ##VkWriteDescriptorSetInlineUniformBlockEXT, ##VkXlibSurfaceCreateInfoKHR
        """,

        "STRUCTURE_TYPE_APPLICATION_INFO".."0",
        "STRUCTURE_TYPE_INSTANCE_CREATE_INFO".."1",
        "STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO".."2",
        "STRUCTURE_TYPE_DEVICE_CREATE_INFO".."3",
        "STRUCTURE_TYPE_SUBMIT_INFO".."4",
        "STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO".."5",
        "STRUCTURE_TYPE_MAPPED_MEMORY_RANGE".."6",
        "STRUCTURE_TYPE_BIND_SPARSE_INFO".."7",
        "STRUCTURE_TYPE_FENCE_CREATE_INFO".."8",
        "STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO".."9",
        "STRUCTURE_TYPE_EVENT_CREATE_INFO".."10",
        "STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO".."11",
        "STRUCTURE_TYPE_BUFFER_CREATE_INFO".."12",
        "STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO".."13",
        "STRUCTURE_TYPE_IMAGE_CREATE_INFO".."14",
        "STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO".."15",
        "STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO".."16",
        "STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO".."17",
        "STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO".."18",
        "STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO".."19",
        "STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO".."20",
        "STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO".."21",
        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO".."22",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO".."23",
        "STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO".."24",
        "STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO".."25",
        "STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO".."26",
        "STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO".."27",
        "STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO".."28",
        "STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO".."29",
        "STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO".."30",
        "STRUCTURE_TYPE_SAMPLER_CREATE_INFO".."31",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO".."32",
        "STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO".."33",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO".."34",
        "STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET".."35",
        "STRUCTURE_TYPE_COPY_DESCRIPTOR_SET".."36",
        "STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO".."37",
        "STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO".."38",
        "STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO".."39",
        "STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO".."40",
        "STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO".."41",
        "STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO".."42",
        "STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO".."43",
        "STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER".."44",
        "STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER".."45",
        "STRUCTURE_TYPE_MEMORY_BARRIER".."46",
        "STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO".."47",
        "STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO".."48"
    )

    EnumConstant(
        """
        VkSystemAllocationScope - Allocation scope

        <h5>Description</h5>
        <ul>
            <li>#SYSTEM_ALLOCATION_SCOPE_COMMAND specifies that the allocation is scoped to the duration of the Vulkan command.</li>
            <li>#SYSTEM_ALLOCATION_SCOPE_OBJECT specifies that the allocation is scoped to the lifetime of the Vulkan object that is being created or used.</li>
            <li>#SYSTEM_ALLOCATION_SCOPE_CACHE specifies that the allocation is scoped to the lifetime of a {@code VkPipelineCache} or {@code VkValidationCacheEXT} object.</li>
            <li>#SYSTEM_ALLOCATION_SCOPE_DEVICE specifies that the allocation is scoped to the lifetime of the Vulkan device.</li>
            <li>#SYSTEM_ALLOCATION_SCOPE_INSTANCE specifies that the allocation is scoped to the lifetime of the Vulkan instance.</li>
        </ul>

        Most Vulkan commands operate on a single object, or there is a sole object that is being created or manipulated. When an allocation uses an allocation scope of #SYSTEM_ALLOCATION_SCOPE_OBJECT or #SYSTEM_ALLOCATION_SCOPE_CACHE, the allocation is scoped to the object being created or manipulated.

        When an implementation requires host memory, it will make callbacks to the application using the most specific allocator and allocation scope available:

        <ul>
            <li>If an allocation is scoped to the duration of a command, the allocator will use the #SYSTEM_ALLOCATION_SCOPE_COMMAND allocation scope. The most specific allocator available is used: if the object being created or manipulated has an allocator, that object&#8217;s allocator will be used, else if the parent {@code VkDevice} has an allocator it will be used, else if the parent {@code VkInstance} has an allocator it will be used. Else,</li>
            <li>If an allocation is associated with a {@code VkValidationCacheEXT} or {@code VkPipelineCache} object, the allocator will use the #SYSTEM_ALLOCATION_SCOPE_CACHE allocation scope. The most specific allocator available is used (cache, else device, else instance). Else,</li>
            <li>If an allocation is scoped to the lifetime of an object, that object is being created or manipulated by the command, and that object&#8217;s type is not {@code VkDevice} or {@code VkInstance}, the allocator will use an allocation scope of #SYSTEM_ALLOCATION_SCOPE_OBJECT. The most specific allocator available is used (object, else device, else instance). Else,</li>
            <li>If an allocation is scoped to the lifetime of a device, the allocator will use an allocation scope of #SYSTEM_ALLOCATION_SCOPE_DEVICE. The most specific allocator available is used (device, else instance). Else,</li>
            <li>If the allocation is scoped to the lifetime of an instance and the instance has an allocator, its allocator will be used with an allocation scope of #SYSTEM_ALLOCATION_SCOPE_INSTANCE.</li>
            <li>Otherwise an implementation will allocate memory through an alternative mechanism that is unspecified.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        "SYSTEM_ALLOCATION_SCOPE_COMMAND".."0",
        "SYSTEM_ALLOCATION_SCOPE_OBJECT".."1",
        "SYSTEM_ALLOCATION_SCOPE_CACHE".."2",
        "SYSTEM_ALLOCATION_SCOPE_DEVICE".."3",
        "SYSTEM_ALLOCATION_SCOPE_INSTANCE".."4"
    )

    EnumConstant(
        """
        VkInternalAllocationType - Allocation type

        <h5>Description</h5>
        <ul>
            <li>#INTERNAL_ALLOCATION_TYPE_EXECUTABLE specifies that the allocation is intended for execution by the host.</li>
        </ul>

        <h5>See Also</h5>
        ##VkInternalAllocationNotification, ##VkInternalFreeNotification
        """,

        "INTERNAL_ALLOCATION_TYPE_EXECUTABLE".."0"
    )

    EnumConstant(
        """
        VkFormat - Available image formats

        <h5>Description</h5>
        <ul>
            <li>#FORMAT_UNDEFINED specifies that the format is not specified.</li>
            <li>#FORMAT_R4G4_UNORM_PACK8 specifies a two-component, 8-bit packed unsigned normalized format that has a 4-bit R component in bits 4..7, and a 4-bit G component in bits 0..3.</li>
            <li>#FORMAT_R4G4B4A4_UNORM_PACK16 specifies a four-component, 16-bit packed unsigned normalized format that has a 4-bit R component in bits 12..15, a 4-bit G component in bits 8..11, a 4-bit B component in bits 4..7, and a 4-bit A component in bits 0..3.</li>
            <li>#FORMAT_B4G4R4A4_UNORM_PACK16 specifies a four-component, 16-bit packed unsigned normalized format that has a 4-bit B component in bits 12..15, a 4-bit G component in bits 8..11, a 4-bit R component in bits 4..7, and a 4-bit A component in bits 0..3.</li>
            <li>#FORMAT_R5G6B5_UNORM_PACK16 specifies a three-component, 16-bit packed unsigned normalized format that has a 5-bit R component in bits 11..15, a 6-bit G component in bits 5..10, and a 5-bit B component in bits 0..4.</li>
            <li>#FORMAT_B5G6R5_UNORM_PACK16 specifies a three-component, 16-bit packed unsigned normalized format that has a 5-bit B component in bits 11..15, a 6-bit G component in bits 5..10, and a 5-bit R component in bits 0..4.</li>
            <li>#FORMAT_R5G5B5A1_UNORM_PACK16 specifies a four-component, 16-bit packed unsigned normalized format that has a 5-bit R component in bits 11..15, a 5-bit G component in bits 6..10, a 5-bit B component in bits 1..5, and a 1-bit A component in bit 0.</li>
            <li>#FORMAT_B5G5R5A1_UNORM_PACK16 specifies a four-component, 16-bit packed unsigned normalized format that has a 5-bit B component in bits 11..15, a 5-bit G component in bits 6..10, a 5-bit R component in bits 1..5, and a 1-bit A component in bit 0.</li>
            <li>#FORMAT_A1R5G5B5_UNORM_PACK16 specifies a four-component, 16-bit packed unsigned normalized format that has a 1-bit A component in bit 15, a 5-bit R component in bits 10..14, a 5-bit G component in bits 5..9, and a 5-bit B component in bits 0..4.</li>
            <li>#FORMAT_R8_UNORM specifies a one-component, 8-bit unsigned normalized format that has a single 8-bit R component.</li>
            <li>#FORMAT_R8_SNORM specifies a one-component, 8-bit signed normalized format that has a single 8-bit R component.</li>
            <li>#FORMAT_R8_USCALED specifies a one-component, 8-bit unsigned scaled integer format that has a single 8-bit R component.</li>
            <li>#FORMAT_R8_SSCALED specifies a one-component, 8-bit signed scaled integer format that has a single 8-bit R component.</li>
            <li>#FORMAT_R8_UINT specifies a one-component, 8-bit unsigned integer format that has a single 8-bit R component.</li>
            <li>#FORMAT_R8_SINT specifies a one-component, 8-bit signed integer format that has a single 8-bit R component.</li>
            <li>#FORMAT_R8_SRGB specifies a one-component, 8-bit unsigned normalized format that has a single 8-bit R component stored with sRGB nonlinear encoding.</li>
            <li>#FORMAT_R8G8_UNORM specifies a two-component, 16-bit unsigned normalized format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</li>
            <li>#FORMAT_R8G8_SNORM specifies a two-component, 16-bit signed normalized format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</li>
            <li>#FORMAT_R8G8_USCALED specifies a two-component, 16-bit unsigned scaled integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</li>
            <li>#FORMAT_R8G8_SSCALED specifies a two-component, 16-bit signed scaled integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</li>
            <li>#FORMAT_R8G8_UINT specifies a two-component, 16-bit unsigned integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</li>
            <li>#FORMAT_R8G8_SINT specifies a two-component, 16-bit signed integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</li>
            <li>#FORMAT_R8G8_SRGB specifies a two-component, 16-bit unsigned normalized format that has an 8-bit R component stored with sRGB nonlinear encoding in byte 0, and an 8-bit G component stored with sRGB nonlinear encoding in byte 1.</li>
            <li>#FORMAT_R8G8B8_UNORM specifies a three-component, 24-bit unsigned normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</li>
            <li>#FORMAT_R8G8B8_SNORM specifies a three-component, 24-bit signed normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</li>
            <li>#FORMAT_R8G8B8_USCALED specifies a three-component, 24-bit unsigned scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</li>
            <li>#FORMAT_R8G8B8_SSCALED specifies a three-component, 24-bit signed scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</li>
            <li>#FORMAT_R8G8B8_UINT specifies a three-component, 24-bit unsigned integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</li>
            <li>#FORMAT_R8G8B8_SINT specifies a three-component, 24-bit signed integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</li>
            <li>#FORMAT_R8G8B8_SRGB specifies a three-component, 24-bit unsigned normalized format that has an 8-bit R component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, and an 8-bit B component stored with sRGB nonlinear encoding in byte 2.</li>
            <li>#FORMAT_B8G8R8_UNORM specifies a three-component, 24-bit unsigned normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</li>
            <li>#FORMAT_B8G8R8_SNORM specifies a three-component, 24-bit signed normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</li>
            <li>#FORMAT_B8G8R8_USCALED specifies a three-component, 24-bit unsigned scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</li>
            <li>#FORMAT_B8G8R8_SSCALED specifies a three-component, 24-bit signed scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</li>
            <li>#FORMAT_B8G8R8_UINT specifies a three-component, 24-bit unsigned integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</li>
            <li>#FORMAT_B8G8R8_SINT specifies a three-component, 24-bit signed integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</li>
            <li>#FORMAT_B8G8R8_SRGB specifies a three-component, 24-bit unsigned normalized format that has an 8-bit B component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, and an 8-bit R component stored with sRGB nonlinear encoding in byte 2.</li>
            <li>#FORMAT_R8G8B8A8_UNORM specifies a four-component, 32-bit unsigned normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_R8G8B8A8_SNORM specifies a four-component, 32-bit signed normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_R8G8B8A8_USCALED specifies a four-component, 32-bit unsigned scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_R8G8B8A8_SSCALED specifies a four-component, 32-bit signed scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_R8G8B8A8_UINT specifies a four-component, 32-bit unsigned integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_R8G8B8A8_SINT specifies a four-component, 32-bit signed integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_R8G8B8A8_SRGB specifies a four-component, 32-bit unsigned normalized format that has an 8-bit R component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, an 8-bit B component stored with sRGB nonlinear encoding in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_B8G8R8A8_UNORM specifies a four-component, 32-bit unsigned normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_B8G8R8A8_SNORM specifies a four-component, 32-bit signed normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_B8G8R8A8_USCALED specifies a four-component, 32-bit unsigned scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_B8G8R8A8_SSCALED specifies a four-component, 32-bit signed scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_B8G8R8A8_UINT specifies a four-component, 32-bit unsigned integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_B8G8R8A8_SINT specifies a four-component, 32-bit signed integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_B8G8R8A8_SRGB specifies a four-component, 32-bit unsigned normalized format that has an 8-bit B component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, an 8-bit R component stored with sRGB nonlinear encoding in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_A8B8G8R8_UNORM_PACK32 specifies a four-component, 32-bit packed unsigned normalized format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</li>
            <li>#FORMAT_A8B8G8R8_SNORM_PACK32 specifies a four-component, 32-bit packed signed normalized format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</li>
            <li>#FORMAT_A8B8G8R8_USCALED_PACK32 specifies a four-component, 32-bit packed unsigned scaled integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</li>
            <li>#FORMAT_A8B8G8R8_SSCALED_PACK32 specifies a four-component, 32-bit packed signed scaled integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</li>
            <li>#FORMAT_A8B8G8R8_UINT_PACK32 specifies a four-component, 32-bit packed unsigned integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</li>
            <li>#FORMAT_A8B8G8R8_SINT_PACK32 specifies a four-component, 32-bit packed signed integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</li>
            <li>#FORMAT_A8B8G8R8_SRGB_PACK32 specifies a four-component, 32-bit packed unsigned normalized format that has an 8-bit A component in bits 24..31, an 8-bit B component stored with sRGB nonlinear encoding in bits 16..23, an 8-bit G component stored with sRGB nonlinear encoding in bits 8..15, and an 8-bit R component stored with sRGB nonlinear encoding in bits 0..7.</li>
            <li>#FORMAT_A2R10G10B10_UNORM_PACK32 specifies a four-component, 32-bit packed unsigned normalized format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</li>
            <li>#FORMAT_A2R10G10B10_SNORM_PACK32 specifies a four-component, 32-bit packed signed normalized format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</li>
            <li>#FORMAT_A2R10G10B10_USCALED_PACK32 specifies a four-component, 32-bit packed unsigned scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</li>
            <li>#FORMAT_A2R10G10B10_SSCALED_PACK32 specifies a four-component, 32-bit packed signed scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</li>
            <li>#FORMAT_A2R10G10B10_UINT_PACK32 specifies a four-component, 32-bit packed unsigned integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</li>
            <li>#FORMAT_A2R10G10B10_SINT_PACK32 specifies a four-component, 32-bit packed signed integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</li>
            <li>#FORMAT_A2B10G10R10_UNORM_PACK32 specifies a four-component, 32-bit packed unsigned normalized format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</li>
            <li>#FORMAT_A2B10G10R10_SNORM_PACK32 specifies a four-component, 32-bit packed signed normalized format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</li>
            <li>#FORMAT_A2B10G10R10_USCALED_PACK32 specifies a four-component, 32-bit packed unsigned scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</li>
            <li>#FORMAT_A2B10G10R10_SSCALED_PACK32 specifies a four-component, 32-bit packed signed scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</li>
            <li>#FORMAT_A2B10G10R10_UINT_PACK32 specifies a four-component, 32-bit packed unsigned integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</li>
            <li>#FORMAT_A2B10G10R10_SINT_PACK32 specifies a four-component, 32-bit packed signed integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</li>
            <li>#FORMAT_R16_UNORM specifies a one-component, 16-bit unsigned normalized format that has a single 16-bit R component.</li>
            <li>#FORMAT_R16_SNORM specifies a one-component, 16-bit signed normalized format that has a single 16-bit R component.</li>
            <li>#FORMAT_R16_USCALED specifies a one-component, 16-bit unsigned scaled integer format that has a single 16-bit R component.</li>
            <li>#FORMAT_R16_SSCALED specifies a one-component, 16-bit signed scaled integer format that has a single 16-bit R component.</li>
            <li>#FORMAT_R16_UINT specifies a one-component, 16-bit unsigned integer format that has a single 16-bit R component.</li>
            <li>#FORMAT_R16_SINT specifies a one-component, 16-bit signed integer format that has a single 16-bit R component.</li>
            <li>#FORMAT_R16_SFLOAT specifies a one-component, 16-bit signed floating-point format that has a single 16-bit R component.</li>
            <li>#FORMAT_R16G16_UNORM specifies a two-component, 32-bit unsigned normalized format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</li>
            <li>#FORMAT_R16G16_SNORM specifies a two-component, 32-bit signed normalized format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</li>
            <li>#FORMAT_R16G16_USCALED specifies a two-component, 32-bit unsigned scaled integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</li>
            <li>#FORMAT_R16G16_SSCALED specifies a two-component, 32-bit signed scaled integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</li>
            <li>#FORMAT_R16G16_UINT specifies a two-component, 32-bit unsigned integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</li>
            <li>#FORMAT_R16G16_SINT specifies a two-component, 32-bit signed integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</li>
            <li>#FORMAT_R16G16_SFLOAT specifies a two-component, 32-bit signed floating-point format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</li>
            <li>#FORMAT_R16G16B16_UNORM specifies a three-component, 48-bit unsigned normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</li>
            <li>#FORMAT_R16G16B16_SNORM specifies a three-component, 48-bit signed normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</li>
            <li>#FORMAT_R16G16B16_USCALED specifies a three-component, 48-bit unsigned scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</li>
            <li>#FORMAT_R16G16B16_SSCALED specifies a three-component, 48-bit signed scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</li>
            <li>#FORMAT_R16G16B16_UINT specifies a three-component, 48-bit unsigned integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</li>
            <li>#FORMAT_R16G16B16_SINT specifies a three-component, 48-bit signed integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</li>
            <li>#FORMAT_R16G16B16_SFLOAT specifies a three-component, 48-bit signed floating-point format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</li>
            <li>#FORMAT_R16G16B16A16_UNORM specifies a four-component, 64-bit unsigned normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</li>
            <li>#FORMAT_R16G16B16A16_SNORM specifies a four-component, 64-bit signed normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</li>
            <li>#FORMAT_R16G16B16A16_USCALED specifies a four-component, 64-bit unsigned scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</li>
            <li>#FORMAT_R16G16B16A16_SSCALED specifies a four-component, 64-bit signed scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</li>
            <li>#FORMAT_R16G16B16A16_UINT specifies a four-component, 64-bit unsigned integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</li>
            <li>#FORMAT_R16G16B16A16_SINT specifies a four-component, 64-bit signed integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</li>
            <li>#FORMAT_R16G16B16A16_SFLOAT specifies a four-component, 64-bit signed floating-point format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</li>
            <li>#FORMAT_R32_UINT specifies a one-component, 32-bit unsigned integer format that has a single 32-bit R component.</li>
            <li>#FORMAT_R32_SINT specifies a one-component, 32-bit signed integer format that has a single 32-bit R component.</li>
            <li>#FORMAT_R32_SFLOAT specifies a one-component, 32-bit signed floating-point format that has a single 32-bit R component.</li>
            <li>#FORMAT_R32G32_UINT specifies a two-component, 64-bit unsigned integer format that has a 32-bit R component in bytes 0..3, and a 32-bit G component in bytes 4..7.</li>
            <li>#FORMAT_R32G32_SINT specifies a two-component, 64-bit signed integer format that has a 32-bit R component in bytes 0..3, and a 32-bit G component in bytes 4..7.</li>
            <li>#FORMAT_R32G32_SFLOAT specifies a two-component, 64-bit signed floating-point format that has a 32-bit R component in bytes 0..3, and a 32-bit G component in bytes 4..7.</li>
            <li>#FORMAT_R32G32B32_UINT specifies a three-component, 96-bit unsigned integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, and a 32-bit B component in bytes 8..11.</li>
            <li>#FORMAT_R32G32B32_SINT specifies a three-component, 96-bit signed integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, and a 32-bit B component in bytes 8..11.</li>
            <li>#FORMAT_R32G32B32_SFLOAT specifies a three-component, 96-bit signed floating-point format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, and a 32-bit B component in bytes 8..11.</li>
            <li>#FORMAT_R32G32B32A32_UINT specifies a four-component, 128-bit unsigned integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, a 32-bit B component in bytes 8..11, and a 32-bit A component in bytes 12..15.</li>
            <li>#FORMAT_R32G32B32A32_SINT specifies a four-component, 128-bit signed integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, a 32-bit B component in bytes 8..11, and a 32-bit A component in bytes 12..15.</li>
            <li>#FORMAT_R32G32B32A32_SFLOAT specifies a four-component, 128-bit signed floating-point format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, a 32-bit B component in bytes 8..11, and a 32-bit A component in bytes 12..15.</li>
            <li>#FORMAT_R64_UINT specifies a one-component, 64-bit unsigned integer format that has a single 64-bit R component.</li>
            <li>#FORMAT_R64_SINT specifies a one-component, 64-bit signed integer format that has a single 64-bit R component.</li>
            <li>#FORMAT_R64_SFLOAT specifies a one-component, 64-bit signed floating-point format that has a single 64-bit R component.</li>
            <li>#FORMAT_R64G64_UINT specifies a two-component, 128-bit unsigned integer format that has a 64-bit R component in bytes 0..7, and a 64-bit G component in bytes 8..15.</li>
            <li>#FORMAT_R64G64_SINT specifies a two-component, 128-bit signed integer format that has a 64-bit R component in bytes 0..7, and a 64-bit G component in bytes 8..15.</li>
            <li>#FORMAT_R64G64_SFLOAT specifies a two-component, 128-bit signed floating-point format that has a 64-bit R component in bytes 0..7, and a 64-bit G component in bytes 8..15.</li>
            <li>#FORMAT_R64G64B64_UINT specifies a three-component, 192-bit unsigned integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, and a 64-bit B component in bytes 16..23.</li>
            <li>#FORMAT_R64G64B64_SINT specifies a three-component, 192-bit signed integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, and a 64-bit B component in bytes 16..23.</li>
            <li>#FORMAT_R64G64B64_SFLOAT specifies a three-component, 192-bit signed floating-point format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, and a 64-bit B component in bytes 16..23.</li>
            <li>#FORMAT_R64G64B64A64_UINT specifies a four-component, 256-bit unsigned integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, a 64-bit B component in bytes 16..23, and a 64-bit A component in bytes 24..31.</li>
            <li>#FORMAT_R64G64B64A64_SINT specifies a four-component, 256-bit signed integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, a 64-bit B component in bytes 16..23, and a 64-bit A component in bytes 24..31.</li>
            <li>#FORMAT_R64G64B64A64_SFLOAT specifies a four-component, 256-bit signed floating-point format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, a 64-bit B component in bytes 16..23, and a 64-bit A component in bytes 24..31.</li>
            <li>#FORMAT_B10G11R11_UFLOAT_PACK32 specifies a three-component, 32-bit packed unsigned floating-point format that has a 10-bit B component in bits 22..31, an 11-bit G component in bits 11..21, an 11-bit R component in bits 0..10. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fundamentals-fp10">Unsigned 10-Bit Floating-Point Numbers</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fundamentals-fp11">Unsigned 11-Bit Floating-Point Numbers</a>.</li>
            <li>#FORMAT_E5B9G9R9_UFLOAT_PACK32 specifies a three-component, 32-bit packed unsigned floating-point format that has a 5-bit shared exponent in bits 27..31, a 9-bit B component mantissa in bits 18..26, a 9-bit G component mantissa in bits 9..17, and a 9-bit R component mantissa in bits 0..8.</li>
            <li>#FORMAT_D16_UNORM specifies a one-component, 16-bit unsigned normalized format that has a single 16-bit depth component.</li>
            <li>#FORMAT_X8_D24_UNORM_PACK32 specifies a two-component, 32-bit format that has 24 unsigned normalized bits in the depth component and, optionally:, 8 bits that are unused.</li>
            <li>#FORMAT_D32_SFLOAT specifies a one-component, 32-bit signed floating-point format that has 32-bits in the depth component.</li>
            <li>#FORMAT_S8_UINT specifies a one-component, 8-bit unsigned integer format that has 8-bits in the stencil component.</li>
            <li>#FORMAT_D16_UNORM_S8_UINT specifies a two-component, 24-bit format that has 16 unsigned normalized bits in the depth component and 8 unsigned integer bits in the stencil component.</li>
            <li>#FORMAT_D24_UNORM_S8_UINT specifies a two-component, 32-bit packed format that has 8 unsigned integer bits in the stencil component, and 24 unsigned normalized bits in the depth component.</li>
            <li>#FORMAT_D32_SFLOAT_S8_UINT specifies a two-component format that has 32 signed float bits in the depth component and 8 unsigned integer bits in the stencil component. There are optionally: 24-bits that are unused.</li>
            <li>#FORMAT_BC1_RGB_UNORM_BLOCK specifies a three-component, block-compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGB texel data. This format has no alpha and is considered opaque.</li>
            <li>#FORMAT_BC1_RGB_SRGB_BLOCK specifies a three-component, block-compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGB texel data with sRGB nonlinear encoding. This format has no alpha and is considered opaque.</li>
            <li>#FORMAT_BC1_RGBA_UNORM_BLOCK specifies a four-component, block-compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGB texel data, and provides 1 bit of alpha.</li>
            <li>#FORMAT_BC1_RGBA_SRGB_BLOCK specifies a four-component, block-compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGB texel data with sRGB nonlinear encoding, and provides 1 bit of alpha.</li>
            <li>#FORMAT_BC2_UNORM_BLOCK specifies a four-component, block-compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values.</li>
            <li>#FORMAT_BC2_SRGB_BLOCK specifies a four-component, block-compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values with sRGB nonlinear encoding.</li>
            <li>#FORMAT_BC3_UNORM_BLOCK specifies a four-component, block-compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values.</li>
            <li>#FORMAT_BC3_SRGB_BLOCK specifies a four-component, block-compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values with sRGB nonlinear encoding.</li>
            <li>#FORMAT_BC4_UNORM_BLOCK specifies a one-component, block-compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized red texel data.</li>
            <li>#FORMAT_BC4_SNORM_BLOCK specifies a one-component, block-compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of signed normalized red texel data.</li>
            <li>#FORMAT_BC5_UNORM_BLOCK specifies a two-component, block-compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RG texel data with the first 64 bits encoding red values followed by 64 bits encoding green values.</li>
            <li>#FORMAT_BC5_SNORM_BLOCK specifies a two-component, block-compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of signed normalized RG texel data with the first 64 bits encoding red values followed by 64 bits encoding green values.</li>
            <li>#FORMAT_BC6H_UFLOAT_BLOCK specifies a three-component, block-compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of unsigned floating-point RGB texel data.</li>
            <li>#FORMAT_BC6H_SFLOAT_BLOCK specifies a three-component, block-compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of signed floating-point RGB texel data.</li>
            <li>#FORMAT_BC7_UNORM_BLOCK specifies a four-component, block-compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_BC7_SRGB_BLOCK specifies a four-component, block-compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ETC2_R8G8B8_UNORM_BLOCK specifies a three-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGB texel data. This format has no alpha and is considered opaque.</li>
            <li>#FORMAT_ETC2_R8G8B8_SRGB_BLOCK specifies a three-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGB texel data with sRGB nonlinear encoding. This format has no alpha and is considered opaque.</li>
            <li>#FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK specifies a four-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGB texel data, and provides 1 bit of alpha.</li>
            <li>#FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK specifies a four-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGB texel data with sRGB nonlinear encoding, and provides 1 bit of alpha.</li>
            <li>#FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK specifies a four-component, ETC2 compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values.</li>
            <li>#FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK specifies a four-component, ETC2 compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values with sRGB nonlinear encoding applied.</li>
            <li>#FORMAT_EAC_R11_UNORM_BLOCK specifies a one-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized red texel data.</li>
            <li>#FORMAT_EAC_R11_SNORM_BLOCK specifies a one-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of signed normalized red texel data.</li>
            <li>#FORMAT_EAC_R11G11_UNORM_BLOCK specifies a two-component, ETC2 compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RG texel data with the first 64 bits encoding red values followed by 64 bits encoding green values.</li>
            <li>#FORMAT_EAC_R11G11_SNORM_BLOCK specifies a two-component, ETC2 compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of signed normalized RG texel data with the first 64 bits encoding red values followed by 64 bits encoding green values.</li>
            <li>#FORMAT_ASTC_4x4_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_4x4_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_4x4_SFLOAT_BLOCK_EXT specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 4×4 rectangle of signed floating-point RGBA texel data.</li>
            <li>#FORMAT_ASTC_5x4_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 5×4 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_5x4_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 5×4 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_5x4_SFLOAT_BLOCK_EXT specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 5×4 rectangle of signed floating-point RGBA texel data.</li>
            <li>#FORMAT_ASTC_5x5_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 5×5 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_5x5_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 5×5 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_5x5_SFLOAT_BLOCK_EXT specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 5×5 rectangle of signed floating-point RGBA texel data.</li>
            <li>#FORMAT_ASTC_6x5_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 6×5 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_6x5_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 6×5 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_6x5_SFLOAT_BLOCK_EXT specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 6×5 rectangle of signed floating-point RGBA texel data.</li>
            <li>#FORMAT_ASTC_6x6_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 6×6 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_6x6_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 6×6 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_6x6_SFLOAT_BLOCK_EXT specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 6×6 rectangle of signed floating-point RGBA texel data.</li>
            <li>#FORMAT_ASTC_8x5_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8×5 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_8x5_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8×5 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_8x5_SFLOAT_BLOCK_EXT specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 8×5 rectangle of signed floating-point RGBA texel data.</li>
            <li>#FORMAT_ASTC_8x6_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8×6 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_8x6_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8×6 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_8x6_SFLOAT_BLOCK_EXT specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 8×6 rectangle of signed floating-point RGBA texel data.</li>
            <li>#FORMAT_ASTC_8x8_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8×8 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_8x8_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8×8 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_8x8_SFLOAT_BLOCK_EXT specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 8×8 rectangle of signed floating-point RGBA texel data.</li>
            <li>#FORMAT_ASTC_10x5_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10×5 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_10x5_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10×5 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_10x5_SFLOAT_BLOCK_EXT specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10×5 rectangle of signed floating-point RGBA texel data.</li>
            <li>#FORMAT_ASTC_10x6_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10×6 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_10x6_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10×6 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_10x6_SFLOAT_BLOCK_EXT specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10×6 rectangle of signed floating-point RGBA texel data.</li>
            <li>#FORMAT_ASTC_10x8_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10×8 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_10x8_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10×8 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_10x8_SFLOAT_BLOCK_EXT specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10×8 rectangle of signed floating-point RGBA texel data.</li>
            <li>#FORMAT_ASTC_10x10_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10×10 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_10x10_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10×10 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_10x10_SFLOAT_BLOCK_EXT specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10×10 rectangle of signed floating-point RGBA texel data.</li>
            <li>#FORMAT_ASTC_12x10_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 12×10 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_12x10_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 12×10 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_12x10_SFLOAT_BLOCK_EXT specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 12×10 rectangle of signed floating-point RGBA texel data.</li>
            <li>#FORMAT_ASTC_12x12_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 12×12 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_12x12_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 12×12 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_12x12_SFLOAT_BLOCK_EXT specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 12×12 rectangle of signed floating-point RGBA texel data.</li>
            <li>#FORMAT_G8B8G8R8_422_UNORM specifies a four-component, 32-bit format containing a pair of G components, an R component, and a B component, collectively encoding a 2×1 rectangle of unsigned normalized RGB texel data. One G value is present at each <em>i</em> coordinate, with the B and R values shared across both G values and thus recorded at half the horizontal resolution of the image. This format has an 8-bit G component for the even <em>i</em> coordinate in byte 0, an 8-bit B component in byte 1, an 8-bit G component for the odd <em>i</em> coordinate in byte 2, and an 8-bit R component in byte 3. Images in this format <b>must</b> be defined with a width that is a multiple of two. For the purposes of the constraints on copy extents, this format is treated as a compressed format with a 2×1 compressed texel block.</li>
            <li>#FORMAT_B8G8R8G8_422_UNORM specifies a four-component, 32-bit format containing a pair of G components, an R component, and a B component, collectively encoding a 2×1 rectangle of unsigned normalized RGB texel data. One G value is present at each <em>i</em> coordinate, with the B and R values shared across both G values and thus recorded at half the horizontal resolution of the image. This format has an 8-bit B component in byte 0, an 8-bit G component for the even <em>i</em> coordinate in byte 1, an 8-bit R component in byte 2, and an 8-bit G component for the odd <em>i</em> coordinate in byte 3. Images in this format <b>must</b> be defined with a width that is a multiple of two. For the purposes of the constraints on copy extents, this format is treated as a compressed format with a 2×1 compressed texel block.</li>
            <li>#FORMAT_G8_B8_R8_3PLANE_420_UNORM specifies an unsigned normalized <em>multi-planar format</em> that has an 8-bit G component in plane 0, an 8-bit B component in plane 1, and an 8-bit R component in plane 2. The horizontal and vertical dimensions of the R and B planes are halved relative to the image dimensions, and each R and B component is shared with the G components for which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code> and <code>floor(j<sub>G</sub> &times; 0.5) = j<sub>B</sub> = j<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, #IMAGE_ASPECT_PLANE_1_BIT for the B plane, and #IMAGE_ASPECT_PLANE_2_BIT for the R plane. Images in this format <b>must</b> be defined with a width and height that is a multiple of two.</li>
            <li>#FORMAT_G8_B8R8_2PLANE_420_UNORM specifies an unsigned normalized <em>multi-planar format</em> that has an 8-bit G component in plane 0, and a two-component, 16-bit BR plane 1 consisting of an 8-bit B component in byte 0 and an 8-bit R component in byte 1. The horizontal and vertical dimensions of the BR plane is halved relative to the image dimensions, and each R and B value is shared with the G components for which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code> and <code>floor(j<sub>G</sub> &times; 0.5) = j<sub>B</sub> = j<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, and #IMAGE_ASPECT_PLANE_1_BIT for the BR plane. Images in this format <b>must</b> be defined with a width and height that is a multiple of two.</li>
            <li>#FORMAT_G8_B8_R8_3PLANE_422_UNORM specifies an unsigned normalized <em>multi-planar format</em> that has an 8-bit G component in plane 0, an 8-bit B component in plane 1, and an 8-bit R component in plane 2. The horizontal dimension of the R and B plane is halved relative to the image dimensions, and each R and B value is shared with the G components for which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, #IMAGE_ASPECT_PLANE_1_BIT for the B plane, and #IMAGE_ASPECT_PLANE_2_BIT for the R plane. Images in this format <b>must</b> be defined with a width that is a multiple of two.</li>
            <li>#FORMAT_G8_B8R8_2PLANE_422_UNORM specifies an unsigned normalized <em>multi-planar format</em> that has an 8-bit G component in plane 0, and a two-component, 16-bit BR plane 1 consisting of an 8-bit B component in byte 0 and an 8-bit R component in byte 1. The horizontal dimensions of the BR plane is halved relative to the image dimensions, and each R and B value is shared with the G components for which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, and #IMAGE_ASPECT_PLANE_1_BIT for the BR plane. Images in this format <b>must</b> be defined with a width that is a multiple of two.</li>
            <li>#FORMAT_G8_B8_R8_3PLANE_444_UNORM specifies an unsigned normalized <em>multi-planar format</em> that has an 8-bit G component in plane 0, an 8-bit B component in plane 1, and an 8-bit R component in plane 2. Each plane has the same dimensions and each R, G and B component contributes to a single texel. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, #IMAGE_ASPECT_PLANE_1_BIT for the B plane, and #IMAGE_ASPECT_PLANE_2_BIT for the R plane.</li>
            <li>#FORMAT_R10X6_UNORM_PACK16 specifies a one-component, 16-bit unsigned normalized format that has a single 10-bit R component in the top 10 bits of a 16-bit word, with the bottom 6 bits set to 0.</li>
            <li>#FORMAT_R10X6G10X6_UNORM_2PACK16 specifies a two-component, 32-bit unsigned normalized format that has a 10-bit R component in the top 10 bits of the word in bytes 0..1, and a 10-bit G component in the top 10 bits of the word in bytes 2..3, with the bottom 6 bits of each word set to 0.</li>
            <li>#FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16 specifies a four-component, 64-bit unsigned normalized format that has a 10-bit R component in the top 10 bits of the word in bytes 0..1, a 10-bit G component in the top 10 bits of the word in bytes 2..3, a 10-bit B component in the top 10 bits of the word in bytes 4..5, and a 10-bit A component in the top 10 bits of the word in bytes 6..7, with the bottom 6 bits of each word set to 0.</li>
            <li>#FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16 specifies a four-component, 64-bit format containing a pair of G components, an R component, and a B component, collectively encoding a 2×1 rectangle of unsigned normalized RGB texel data. One G value is present at each <em>i</em> coordinate, with the B and R values shared across both G values and thus recorded at half the horizontal resolution of the image. This format has a 10-bit G component for the even <em>i</em> coordinate in the top 10 bits of the word in bytes 0..1, a 10-bit B component in the top 10 bits of the word in bytes 2..3, a 10-bit G component for the odd <em>i</em> coordinate in the top 10 bits of the word in bytes 4..5, and a 10-bit R component in the top 10 bits of the word in bytes 6..7, with the bottom 6 bits of each word set to 0. Images in this format <b>must</b> be defined with a width that is a multiple of two. For the purposes of the constraints on copy extents, this format is treated as a compressed format with a 2×1 compressed texel block.</li>
            <li>#FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16 specifies a four-component, 64-bit format containing a pair of G components, an R component, and a B component, collectively encoding a 2×1 rectangle of unsigned normalized RGB texel data. One G value is present at each <em>i</em> coordinate, with the B and R values shared across both G values and thus recorded at half the horizontal resolution of the image. This format has a 10-bit B component in the top 10 bits of the word in bytes 0..1, a 10-bit G component for the even <em>i</em> coordinate in the top 10 bits of the word in bytes 2..3, a 10-bit R component in the top 10 bits of the word in bytes 4..5, and a 10-bit G component for the odd <em>i</em> coordinate in the top 10 bits of the word in bytes 6..7, with the bottom 6 bits of each word set to 0. Images in this format <b>must</b> be defined with a width that is a multiple of two. For the purposes of the constraints on copy extents, this format is treated as a compressed format with a 2×1 compressed texel block.</li>
            <li>#FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16 specifies an unsigned normalized <em>multi-planar format</em> that has a 10-bit G component in the top 10 bits of each 16-bit word of plane 0, a 10-bit B component in the top 10 bits of each 16-bit word of plane 1, and a 10-bit R component in the top 10 bits of each 16-bit word of plane 2, with the bottom 6 bits of each word set to 0. The horizontal and vertical dimensions of the R and B planes are halved relative to the image dimensions, and each R and B component is shared with the G components for which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code> and <code>floor(j<sub>G</sub> &times; 0.5) = j<sub>B</sub> = j<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, #IMAGE_ASPECT_PLANE_1_BIT for the B plane, and #IMAGE_ASPECT_PLANE_2_BIT for the R plane. Images in this format <b>must</b> be defined with a width and height that is a multiple of two.</li>
            <li>#FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16 specifies an unsigned normalized <em>multi-planar format</em> that has a 10-bit G component in the top 10 bits of each 16-bit word of plane 0, and a two-component, 32-bit BR plane 1 consisting of a 10-bit B component in the top 10 bits of the word in bytes 0..1, and a 10-bit R component in the top 10 bits of the word in bytes 2..3, the bottom 6 bits of each word set to 0. The horizontal and vertical dimensions of the BR plane is halved relative to the image dimensions, and each R and B value is shared with the G components for which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code> and <code>floor(j<sub>G</sub> &times; 0.5) = j<sub>B</sub> = j<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, and #IMAGE_ASPECT_PLANE_1_BIT for the BR plane. Images in this format <b>must</b> be defined with a width and height that is a multiple of two.</li>
            <li>#FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16 specifies an unsigned normalized <em>multi-planar format</em> that has a 10-bit G component in the top 10 bits of each 16-bit word of plane 0, a 10-bit B component in the top 10 bits of each 16-bit word of plane 1, and a 10-bit R component in the top 10 bits of each 16-bit word of plane 2, with the bottom 6 bits of each word set to 0. The horizontal dimension of the R and B plane is halved relative to the image dimensions, and each R and B value is shared with the G components for which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, #IMAGE_ASPECT_PLANE_1_BIT for the B plane, and #IMAGE_ASPECT_PLANE_2_BIT for the R plane. Images in this format <b>must</b> be defined with a width that is a multiple of two.</li>
            <li>#FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16 specifies an unsigned normalized <em>multi-planar format</em> that has a 10-bit G component in the top 10 bits of each 16-bit word of plane 0, and a two-component, 32-bit BR plane 1 consisting of a 10-bit B component in the top 10 bits of the word in bytes 0..1, and a 10-bit R component in the top 10 bits of the word in bytes 2..3, the bottom 6 bits of each word set to 0. The horizontal dimensions of the BR plane is halved relative to the image dimensions, and each R and B value is shared with the G components for which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, and #IMAGE_ASPECT_PLANE_1_BIT for the BR plane. Images in this format <b>must</b> be defined with a width that is a multiple of two.</li>
            <li>#FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16 specifies an unsigned normalized <em>multi-planar format</em> that has a 10-bit G component in the top 10 bits of each 16-bit word of plane 0, a 10-bit B component in the top 10 bits of each 16-bit word of plane 1, and a 10-bit R component in the top 10 bits of each 16-bit word of plane 2, with the bottom 6 bits of each word set to 0. Each plane has the same dimensions and each R, G and B component contributes to a single texel. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, #IMAGE_ASPECT_PLANE_1_BIT for the B plane, and #IMAGE_ASPECT_PLANE_2_BIT for the R plane.</li>
            <li>#FORMAT_R12X4_UNORM_PACK16 specifies a one-component, 16-bit unsigned normalized format that has a single 12-bit R component in the top 12 bits of a 16-bit word, with the bottom 4 bits set to 0.</li>
            <li>#FORMAT_R12X4G12X4_UNORM_2PACK16 specifies a two-component, 32-bit unsigned normalized format that has a 12-bit R component in the top 12 bits of the word in bytes 0..1, and a 12-bit G component in the top 12 bits of the word in bytes 2..3, with the bottom 4 bits of each word set to 0.</li>
            <li>#FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16 specifies a four-component, 64-bit unsigned normalized format that has a 12-bit R component in the top 12 bits of the word in bytes 0..1, a 12-bit G component in the top 12 bits of the word in bytes 2..3, a 12-bit B component in the top 12 bits of the word in bytes 4..5, and a 12-bit A component in the top 12 bits of the word in bytes 6..7, with the bottom 4 bits of each word set to 0.</li>
            <li>#FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16 specifies a four-component, 64-bit format containing a pair of G components, an R component, and a B component, collectively encoding a 2×1 rectangle of unsigned normalized RGB texel data. One G value is present at each <em>i</em> coordinate, with the B and R values shared across both G values and thus recorded at half the horizontal resolution of the image. This format has a 12-bit G component for the even <em>i</em> coordinate in the top 12 bits of the word in bytes 0..1, a 12-bit B component in the top 12 bits of the word in bytes 2..3, a 12-bit G component for the odd <em>i</em> coordinate in the top 12 bits of the word in bytes 4..5, and a 12-bit R component in the top 12 bits of the word in bytes 6..7, with the bottom 4 bits of each word set to 0. Images in this format <b>must</b> be defined with a width that is a multiple of two. For the purposes of the constraints on copy extents, this format is treated as a compressed format with a 2×1 compressed texel block.</li>
            <li>#FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16 specifies a four-component, 64-bit format containing a pair of G components, an R component, and a B component, collectively encoding a 2×1 rectangle of unsigned normalized RGB texel data. One G value is present at each <em>i</em> coordinate, with the B and R values shared across both G values and thus recorded at half the horizontal resolution of the image. This format has a 12-bit B component in the top 12 bits of the word in bytes 0..1, a 12-bit G component for the even <em>i</em> coordinate in the top 12 bits of the word in bytes 2..3, a 12-bit R component in the top 12 bits of the word in bytes 4..5, and a 12-bit G component for the odd <em>i</em> coordinate in the top 12 bits of the word in bytes 6..7, with the bottom 4 bits of each word set to 0. Images in this format <b>must</b> be defined with a width that is a multiple of two. For the purposes of the constraints on copy extents, this format is treated as a compressed format with a 2×1 compressed texel block.</li>
            <li>#FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16 specifies an unsigned normalized <em>multi-planar format</em> that has a 12-bit G component in the top 12 bits of each 16-bit word of plane 0, a 12-bit B component in the top 12 bits of each 16-bit word of plane 1, and a 12-bit R component in the top 12 bits of each 16-bit word of plane 2, with the bottom 4 bits of each word set to 0. The horizontal and vertical dimensions of the R and B planes are halved relative to the image dimensions, and each R and B component is shared with the G components for which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code> and <code>floor(j<sub>G</sub> &times; 0.5) = j<sub>B</sub> = j<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, #IMAGE_ASPECT_PLANE_1_BIT for the B plane, and #IMAGE_ASPECT_PLANE_2_BIT for the R plane. Images in this format <b>must</b> be defined with a width and height that is a multiple of two.</li>
            <li>#FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16 specifies an unsigned normalized <em>multi-planar format</em> that has a 12-bit G component in the top 12 bits of each 16-bit word of plane 0, and a two-component, 32-bit BR plane 1 consisting of a 12-bit B component in the top 12 bits of the word in bytes 0..1, and a 12-bit R component in the top 12 bits of the word in bytes 2..3, the bottom 4 bits of each word set to 0. The horizontal and vertical dimensions of the BR plane is halved relative to the image dimensions, and each R and B value is shared with the G components for which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code> and <code>floor(j<sub>G</sub> &times; 0.5) = j<sub>B</sub> = j<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, and #IMAGE_ASPECT_PLANE_1_BIT for the BR plane. Images in this format <b>must</b> be defined with a width and height that is a multiple of two.</li>
            <li>#FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16 specifies an unsigned normalized <em>multi-planar format</em> that has a 12-bit G component in the top 12 bits of each 16-bit word of plane 0, a 12-bit B component in the top 12 bits of each 16-bit word of plane 1, and a 12-bit R component in the top 12 bits of each 16-bit word of plane 2, with the bottom 4 bits of each word set to 0. The horizontal dimension of the R and B plane is halved relative to the image dimensions, and each R and B value is shared with the G components for """ mergeLargeLiteral """which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, #IMAGE_ASPECT_PLANE_1_BIT for the B plane, and #IMAGE_ASPECT_PLANE_2_BIT for the R plane. Images in this format <b>must</b> be defined with a width that is a multiple of two.</li>
            <li>#FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16 specifies an unsigned normalized <em>multi-planar format</em> that has a 12-bit G component in the top 12 bits of each 16-bit word of plane 0, and a two-component, 32-bit BR plane 1 consisting of a 12-bit B component in the top 12 bits of the word in bytes 0..1, and a 12-bit R component in the top 12 bits of the word in bytes 2..3, the bottom 4 bits of each word set to 0. The horizontal dimensions of the BR plane is halved relative to the image dimensions, and each R and B value is shared with the G components for which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, and #IMAGE_ASPECT_PLANE_1_BIT for the BR plane. Images in this format <b>must</b> be defined with a width that is a multiple of two.</li>
            <li>#FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16 specifies an unsigned normalized <em>multi-planar format</em> that has a 12-bit G component in the top 12 bits of each 16-bit word of plane 0, a 12-bit B component in the top 12 bits of each 16-bit word of plane 1, and a 12-bit R component in the top 12 bits of each 16-bit word of plane 2, with the bottom 4 bits of each word set to 0. Each plane has the same dimensions and each R, G and B component contributes to a single texel. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, #IMAGE_ASPECT_PLANE_1_BIT for the B plane, and #IMAGE_ASPECT_PLANE_2_BIT for the R plane.</li>
            <li>#FORMAT_G16B16G16R16_422_UNORM specifies a four-component, 64-bit format containing a pair of G components, an R component, and a B component, collectively encoding a 2×1 rectangle of unsigned normalized RGB texel data. One G value is present at each <em>i</em> coordinate, with the B and R values shared across both G values and thus recorded at half the horizontal resolution of the image. This format has a 16-bit G component for the even <em>i</em> coordinate in the word in bytes 0..1, a 16-bit B component in the word in bytes 2..3, a 16-bit G component for the odd <em>i</em> coordinate in the word in bytes 4..5, and a 16-bit R component in the word in bytes 6..7. Images in this format <b>must</b> be defined with a width that is a multiple of two. For the purposes of the constraints on copy extents, this format is treated as a compressed format with a 2×1 compressed texel block.</li>
            <li>#FORMAT_B16G16R16G16_422_UNORM specifies a four-component, 64-bit format containing a pair of G components, an R component, and a B component, collectively encoding a 2×1 rectangle of unsigned normalized RGB texel data. One G value is present at each <em>i</em> coordinate, with the B and R values shared across both G values and thus recorded at half the horizontal resolution of the image. This format has a 16-bit B component in the word in bytes 0..1, a 16-bit G component for the even <em>i</em> coordinate in the word in bytes 2..3, a 16-bit R component in the word in bytes 4..5, and a 16-bit G component for the odd <em>i</em> coordinate in the word in bytes 6..7. Images in this format <b>must</b> be defined with a width that is a multiple of two. For the purposes of the constraints on copy extents, this format is treated as a compressed format with a 2×1 compressed texel block.</li>
            <li>#FORMAT_G16_B16_R16_3PLANE_420_UNORM specifies an unsigned normalized <em>multi-planar format</em> that has a 16-bit G component in each 16-bit word of plane 0, a 16-bit B component in each 16-bit word of plane 1, and a 16-bit R component in each 16-bit word of plane 2. The horizontal and vertical dimensions of the R and B planes are halved relative to the image dimensions, and each R and B component is shared with the G components for which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code> and <code>floor(j<sub>G</sub> &times; 0.5) = j<sub>B</sub> = j<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, #IMAGE_ASPECT_PLANE_1_BIT for the B plane, and #IMAGE_ASPECT_PLANE_2_BIT for the R plane. Images in this format <b>must</b> be defined with a width and height that is a multiple of two.</li>
            <li>#FORMAT_G16_B16R16_2PLANE_420_UNORM specifies an unsigned normalized <em>multi-planar format</em> that has a 16-bit G component in each 16-bit word of plane 0, and a two-component, 32-bit BR plane 1 consisting of a 16-bit B component in the word in bytes 0..1, and a 16-bit R component in the word in bytes 2..3. The horizontal and vertical dimensions of the BR plane is halved relative to the image dimensions, and each R and B value is shared with the G components for which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code> and <code>floor(j<sub>G</sub> &times; 0.5) = j<sub>B</sub> = j<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, and #IMAGE_ASPECT_PLANE_1_BIT for the BR plane. Images in this format <b>must</b> be defined with a width and height that is a multiple of two.</li>
            <li>#FORMAT_G16_B16_R16_3PLANE_422_UNORM specifies an unsigned normalized <em>multi-planar format</em> that has a 16-bit G component in each 16-bit word of plane 0, a 16-bit B component in each 16-bit word of plane 1, and a 16-bit R component in each 16-bit word of plane 2. The horizontal dimension of the R and B plane is halved relative to the image dimensions, and each R and B value is shared with the G components for which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, #IMAGE_ASPECT_PLANE_1_BIT for the B plane, and #IMAGE_ASPECT_PLANE_2_BIT for the R plane. Images in this format <b>must</b> be defined with a width that is a multiple of two.</li>
            <li>#FORMAT_G16_B16R16_2PLANE_422_UNORM specifies an unsigned normalized <em>multi-planar format</em> that has a 16-bit G component in each 16-bit word of plane 0, and a two-component, 32-bit BR plane 1 consisting of a 16-bit B component in the word in bytes 0..1, and a 16-bit R component in the word in bytes 2..3. The horizontal dimensions of the BR plane is halved relative to the image dimensions, and each R and B value is shared with the G components for which <code>floor(i<sub>G</sub> &times; 0.5) = i<sub>B</sub> = i<sub>R</sub></code>. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, and #IMAGE_ASPECT_PLANE_1_BIT for the BR plane. Images in this format <b>must</b> be defined with a width that is a multiple of two.</li>
            <li>#FORMAT_G16_B16_R16_3PLANE_444_UNORM specifies an unsigned normalized <em>multi-planar format</em> that has a 16-bit G component in each 16-bit word of plane 0, a 16-bit B component in each 16-bit word of plane 1, and a 16-bit R component in each 16-bit word of plane 2. Each plane has the same dimensions and each R, G and B component contributes to a single texel. The location of each plane when this image is in linear layout can be determined via #GetImageSubresourceLayout(), using #IMAGE_ASPECT_PLANE_0_BIT for the G plane, #IMAGE_ASPECT_PLANE_1_BIT for the B plane, and #IMAGE_ASPECT_PLANE_2_BIT for the R plane.</li>
            <li>#FORMAT_PVRTC1_2BPP_UNORM_BLOCK_IMG specifies a four-component, PVRTC compressed format where each 64-bit compressed texel block encodes an 8×4 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_PVRTC1_4BPP_UNORM_BLOCK_IMG specifies a four-component, PVRTC compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_PVRTC2_2BPP_UNORM_BLOCK_IMG specifies a four-component, PVRTC compressed format where each 64-bit compressed texel block encodes an 8×4 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_PVRTC2_4BPP_UNORM_BLOCK_IMG specifies a four-component, PVRTC compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_PVRTC1_2BPP_SRGB_BLOCK_IMG specifies a four-component, PVRTC compressed format where each 64-bit compressed texel block encodes an 8×4 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_PVRTC1_4BPP_SRGB_BLOCK_IMG specifies a four-component, PVRTC compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_PVRTC2_2BPP_SRGB_BLOCK_IMG specifies a four-component, PVRTC compressed format where each 64-bit compressed texel block encodes an 8×4 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_PVRTC2_4BPP_SRGB_BLOCK_IMG specifies a four-component, PVRTC compressed format where each 64-bit compressed texel block encodes a 4×4 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentDescription, ##VkAttachmentDescription2, ##VkBufferViewCreateInfo, ##VkFramebufferAttachmentImageInfo, ##VkGeometryTrianglesNV, ##VkImageCreateInfo, ##VkImageFormatListCreateInfo, ##VkImageViewASTCDecodeModeEXT, ##VkImageViewCreateInfo, ##VkPhysicalDeviceImageFormatInfo2, ##VkPhysicalDeviceSparseImageFormatInfo2, ##VkSamplerYcbcrConversionCreateInfo, ##VkSurfaceFormatKHR, ##VkSwapchainCreateInfoKHR, ##VkVertexInputAttributeDescription, #GetPhysicalDeviceExternalImageFormatPropertiesNV(), #GetPhysicalDeviceFormatProperties(), #GetPhysicalDeviceFormatProperties2(), #GetPhysicalDeviceFormatProperties2KHR(), #GetPhysicalDeviceImageFormatProperties(), #GetPhysicalDeviceSparseImageFormatProperties()
        """,

        "FORMAT_UNDEFINED".."0",
        "FORMAT_R4G4_UNORM_PACK8".."1",
        "FORMAT_R4G4B4A4_UNORM_PACK16".."2",
        "FORMAT_B4G4R4A4_UNORM_PACK16".."3",
        "FORMAT_R5G6B5_UNORM_PACK16".."4",
        "FORMAT_B5G6R5_UNORM_PACK16".."5",
        "FORMAT_R5G5B5A1_UNORM_PACK16".."6",
        "FORMAT_B5G5R5A1_UNORM_PACK16".."7",
        "FORMAT_A1R5G5B5_UNORM_PACK16".."8",
        "FORMAT_R8_UNORM".."9",
        "FORMAT_R8_SNORM".."10",
        "FORMAT_R8_USCALED".."11",
        "FORMAT_R8_SSCALED".."12",
        "FORMAT_R8_UINT".."13",
        "FORMAT_R8_SINT".."14",
        "FORMAT_R8_SRGB".."15",
        "FORMAT_R8G8_UNORM".."16",
        "FORMAT_R8G8_SNORM".."17",
        "FORMAT_R8G8_USCALED".."18",
        "FORMAT_R8G8_SSCALED".."19",
        "FORMAT_R8G8_UINT".."20",
        "FORMAT_R8G8_SINT".."21",
        "FORMAT_R8G8_SRGB".."22",
        "FORMAT_R8G8B8_UNORM".."23",
        "FORMAT_R8G8B8_SNORM".."24",
        "FORMAT_R8G8B8_USCALED".."25",
        "FORMAT_R8G8B8_SSCALED".."26",
        "FORMAT_R8G8B8_UINT".."27",
        "FORMAT_R8G8B8_SINT".."28",
        "FORMAT_R8G8B8_SRGB".."29",
        "FORMAT_B8G8R8_UNORM".."30",
        "FORMAT_B8G8R8_SNORM".."31",
        "FORMAT_B8G8R8_USCALED".."32",
        "FORMAT_B8G8R8_SSCALED".."33",
        "FORMAT_B8G8R8_UINT".."34",
        "FORMAT_B8G8R8_SINT".."35",
        "FORMAT_B8G8R8_SRGB".."36",
        "FORMAT_R8G8B8A8_UNORM".."37",
        "FORMAT_R8G8B8A8_SNORM".."38",
        "FORMAT_R8G8B8A8_USCALED".."39",
        "FORMAT_R8G8B8A8_SSCALED".."40",
        "FORMAT_R8G8B8A8_UINT".."41",
        "FORMAT_R8G8B8A8_SINT".."42",
        "FORMAT_R8G8B8A8_SRGB".."43",
        "FORMAT_B8G8R8A8_UNORM".."44",
        "FORMAT_B8G8R8A8_SNORM".."45",
        "FORMAT_B8G8R8A8_USCALED".."46",
        "FORMAT_B8G8R8A8_SSCALED".."47",
        "FORMAT_B8G8R8A8_UINT".."48",
        "FORMAT_B8G8R8A8_SINT".."49",
        "FORMAT_B8G8R8A8_SRGB".."50",
        "FORMAT_A8B8G8R8_UNORM_PACK32".."51",
        "FORMAT_A8B8G8R8_SNORM_PACK32".."52",
        "FORMAT_A8B8G8R8_USCALED_PACK32".."53",
        "FORMAT_A8B8G8R8_SSCALED_PACK32".."54",
        "FORMAT_A8B8G8R8_UINT_PACK32".."55",
        "FORMAT_A8B8G8R8_SINT_PACK32".."56",
        "FORMAT_A8B8G8R8_SRGB_PACK32".."57",
        "FORMAT_A2R10G10B10_UNORM_PACK32".."58",
        "FORMAT_A2R10G10B10_SNORM_PACK32".."59",
        "FORMAT_A2R10G10B10_USCALED_PACK32".."60",
        "FORMAT_A2R10G10B10_SSCALED_PACK32".."61",
        "FORMAT_A2R10G10B10_UINT_PACK32".."62",
        "FORMAT_A2R10G10B10_SINT_PACK32".."63",
        "FORMAT_A2B10G10R10_UNORM_PACK32".."64",
        "FORMAT_A2B10G10R10_SNORM_PACK32".."65",
        "FORMAT_A2B10G10R10_USCALED_PACK32".."66",
        "FORMAT_A2B10G10R10_SSCALED_PACK32".."67",
        "FORMAT_A2B10G10R10_UINT_PACK32".."68",
        "FORMAT_A2B10G10R10_SINT_PACK32".."69",
        "FORMAT_R16_UNORM".."70",
        "FORMAT_R16_SNORM".."71",
        "FORMAT_R16_USCALED".."72",
        "FORMAT_R16_SSCALED".."73",
        "FORMAT_R16_UINT".."74",
        "FORMAT_R16_SINT".."75",
        "FORMAT_R16_SFLOAT".."76",
        "FORMAT_R16G16_UNORM".."77",
        "FORMAT_R16G16_SNORM".."78",
        "FORMAT_R16G16_USCALED".."79",
        "FORMAT_R16G16_SSCALED".."80",
        "FORMAT_R16G16_UINT".."81",
        "FORMAT_R16G16_SINT".."82",
        "FORMAT_R16G16_SFLOAT".."83",
        "FORMAT_R16G16B16_UNORM".."84",
        "FORMAT_R16G16B16_SNORM".."85",
        "FORMAT_R16G16B16_USCALED".."86",
        "FORMAT_R16G16B16_SSCALED".."87",
        "FORMAT_R16G16B16_UINT".."88",
        "FORMAT_R16G16B16_SINT".."89",
        "FORMAT_R16G16B16_SFLOAT".."90",
        "FORMAT_R16G16B16A16_UNORM".."91",
        "FORMAT_R16G16B16A16_SNORM".."92",
        "FORMAT_R16G16B16A16_USCALED".."93",
        "FORMAT_R16G16B16A16_SSCALED".."94",
        "FORMAT_R16G16B16A16_UINT".."95",
        "FORMAT_R16G16B16A16_SINT".."96",
        "FORMAT_R16G16B16A16_SFLOAT".."97",
        "FORMAT_R32_UINT".."98",
        "FORMAT_R32_SINT".."99",
        "FORMAT_R32_SFLOAT".."100",
        "FORMAT_R32G32_UINT".."101",
        "FORMAT_R32G32_SINT".."102",
        "FORMAT_R32G32_SFLOAT".."103",
        "FORMAT_R32G32B32_UINT".."104",
        "FORMAT_R32G32B32_SINT".."105",
        "FORMAT_R32G32B32_SFLOAT".."106",
        "FORMAT_R32G32B32A32_UINT".."107",
        "FORMAT_R32G32B32A32_SINT".."108",
        "FORMAT_R32G32B32A32_SFLOAT".."109",
        "FORMAT_R64_UINT".."110",
        "FORMAT_R64_SINT".."111",
        "FORMAT_R64_SFLOAT".."112",
        "FORMAT_R64G64_UINT".."113",
        "FORMAT_R64G64_SINT".."114",
        "FORMAT_R64G64_SFLOAT".."115",
        "FORMAT_R64G64B64_UINT".."116",
        "FORMAT_R64G64B64_SINT".."117",
        "FORMAT_R64G64B64_SFLOAT".."118",
        "FORMAT_R64G64B64A64_UINT".."119",
        "FORMAT_R64G64B64A64_SINT".."120",
        "FORMAT_R64G64B64A64_SFLOAT".."121",
        "FORMAT_B10G11R11_UFLOAT_PACK32".."122",
        "FORMAT_E5B9G9R9_UFLOAT_PACK32".."123",
        "FORMAT_D16_UNORM".."124",
        "FORMAT_X8_D24_UNORM_PACK32".."125",
        "FORMAT_D32_SFLOAT".."126",
        "FORMAT_S8_UINT".."127",
        "FORMAT_D16_UNORM_S8_UINT".."128",
        "FORMAT_D24_UNORM_S8_UINT".."129",
        "FORMAT_D32_SFLOAT_S8_UINT".."130",
        "FORMAT_BC1_RGB_UNORM_BLOCK".."131",
        "FORMAT_BC1_RGB_SRGB_BLOCK".."132",
        "FORMAT_BC1_RGBA_UNORM_BLOCK".."133",
        "FORMAT_BC1_RGBA_SRGB_BLOCK".."134",
        "FORMAT_BC2_UNORM_BLOCK".."135",
        "FORMAT_BC2_SRGB_BLOCK".."136",
        "FORMAT_BC3_UNORM_BLOCK".."137",
        "FORMAT_BC3_SRGB_BLOCK".."138",
        "FORMAT_BC4_UNORM_BLOCK".."139",
        "FORMAT_BC4_SNORM_BLOCK".."140",
        "FORMAT_BC5_UNORM_BLOCK".."141",
        "FORMAT_BC5_SNORM_BLOCK".."142",
        "FORMAT_BC6H_UFLOAT_BLOCK".."143",
        "FORMAT_BC6H_SFLOAT_BLOCK".."144",
        "FORMAT_BC7_UNORM_BLOCK".."145",
        "FORMAT_BC7_SRGB_BLOCK".."146",
        "FORMAT_ETC2_R8G8B8_UNORM_BLOCK".."147",
        "FORMAT_ETC2_R8G8B8_SRGB_BLOCK".."148",
        "FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK".."149",
        "FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK".."150",
        "FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK".."151",
        "FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK".."152",
        "FORMAT_EAC_R11_UNORM_BLOCK".."153",
        "FORMAT_EAC_R11_SNORM_BLOCK".."154",
        "FORMAT_EAC_R11G11_UNORM_BLOCK".."155",
        "FORMAT_EAC_R11G11_SNORM_BLOCK".."156",
        "FORMAT_ASTC_4x4_UNORM_BLOCK".."157",
        "FORMAT_ASTC_4x4_SRGB_BLOCK".."158",
        "FORMAT_ASTC_5x4_UNORM_BLOCK".."159",
        "FORMAT_ASTC_5x4_SRGB_BLOCK".."160",
        "FORMAT_ASTC_5x5_UNORM_BLOCK".."161",
        "FORMAT_ASTC_5x5_SRGB_BLOCK".."162",
        "FORMAT_ASTC_6x5_UNORM_BLOCK".."163",
        "FORMAT_ASTC_6x5_SRGB_BLOCK".."164",
        "FORMAT_ASTC_6x6_UNORM_BLOCK".."165",
        "FORMAT_ASTC_6x6_SRGB_BLOCK".."166",
        "FORMAT_ASTC_8x5_UNORM_BLOCK".."167",
        "FORMAT_ASTC_8x5_SRGB_BLOCK".."168",
        "FORMAT_ASTC_8x6_UNORM_BLOCK".."169",
        "FORMAT_ASTC_8x6_SRGB_BLOCK".."170",
        "FORMAT_ASTC_8x8_UNORM_BLOCK".."171",
        "FORMAT_ASTC_8x8_SRGB_BLOCK".."172",
        "FORMAT_ASTC_10x5_UNORM_BLOCK".."173",
        "FORMAT_ASTC_10x5_SRGB_BLOCK".."174",
        "FORMAT_ASTC_10x6_UNORM_BLOCK".."175",
        "FORMAT_ASTC_10x6_SRGB_BLOCK".."176",
        "FORMAT_ASTC_10x8_UNORM_BLOCK".."177",
        "FORMAT_ASTC_10x8_SRGB_BLOCK".."178",
        "FORMAT_ASTC_10x10_UNORM_BLOCK".."179",
        "FORMAT_ASTC_10x10_SRGB_BLOCK".."180",
        "FORMAT_ASTC_12x10_UNORM_BLOCK".."181",
        "FORMAT_ASTC_12x10_SRGB_BLOCK".."182",
        "FORMAT_ASTC_12x12_UNORM_BLOCK".."183",
        "FORMAT_ASTC_12x12_SRGB_BLOCK".."184"
    )

    EnumConstant(
        """
        VkFormatFeatureFlagBits - Bitmask specifying features supported by a buffer

        <h5>Description</h5>
        The following bits <b>may</b> be set in {@code linearTilingFeatures}, {@code optimalTilingFeatures}, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkDrmFormatModifierPropertiesEXT">{@code drmFormatModifierTilingFeatures}</a>, specifying that the features are supported by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkImage">images</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkImageView">image views</a> created with the queried #GetPhysicalDeviceFormatProperties(){@code ::format}:

        <ul>
            <li>#FORMAT_FEATURE_SAMPLED_IMAGE_BIT specifies that an image view <b>can</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-sampledimage">sampled from</a>.</li>
            <li>#FORMAT_FEATURE_STORAGE_IMAGE_BIT specifies that an image view <b>can</b> be used as a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storageimage">storage images</a>.</li>
            <li>#FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT specifies that an image view <b>can</b> be used as storage image that supports atomic operations.</li>
            <li>#FORMAT_FEATURE_COLOR_ATTACHMENT_BIT specifies that an image view <b>can</b> be used as a framebuffer color attachment and as an input attachment.</li>
            <li>#FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT specifies that an image view <b>can</b> be used as a framebuffer color attachment that supports blending and as an input attachment.</li>
            <li>#FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT specifies that an image view <b>can</b> be used as a framebuffer depth/stencil attachment and as an input attachment.</li>
            <li>#FORMAT_FEATURE_BLIT_SRC_BIT specifies that an image <b>can</b> be used as {@code srcImage} for the {@code vkCmdBlitImage} command.</li>
            <li>#FORMAT_FEATURE_BLIT_DST_BIT specifies that an image <b>can</b> be used as {@code dstImage} for the {@code vkCmdBlitImage} command.</li>
            <li>
                #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT specifies that if #FORMAT_FEATURE_SAMPLED_IMAGE_BIT is also set, an image view <b>can</b> be used with a sampler that has either of {@code magFilter} or {@code minFilter} set to #FILTER_LINEAR, or {@code mipmapMode} set to #SAMPLER_MIPMAP_MODE_LINEAR. If #FORMAT_FEATURE_BLIT_SRC_BIT is also set, an image can be used as the {@code srcImage} to #CmdBlitImage() with a {@code filter} of #FILTER_LINEAR. This bit <b>must</b> only be exposed for formats that also support the #FORMAT_FEATURE_SAMPLED_IMAGE_BIT or #FORMAT_FEATURE_BLIT_SRC_BIT.
                If the format being queried is a depth/stencil format, this bit only specifies that the depth aspect (not the stencil aspect) of an image of this format supports linear filtering, and that linear filtering of the depth aspect is supported whether depth compare is enabled in the sampler or not. If this bit is not present, linear filtering with depth compare disabled is unsupported and linear filtering with depth compare enabled is supported, but <b>may</b> compute the filtered value in an implementation-dependent manner which differs from the normal rules of linear filtering. The resulting value <b>must</b> be in the range <code>[0,1]</code> and <b>should</b> be proportional to, or a weighted average of, the number of comparison passes or failures.
            </li>
            <li>#FORMAT_FEATURE_TRANSFER_SRC_BIT specifies that an image <b>can</b> be used as a source image for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies">copy commands</a>.</li>
            <li>#FORMAT_FEATURE_TRANSFER_DST_BIT specifies that an image <b>can</b> be used as a destination image for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies">copy commands</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#clears">clear commands</a>.</li>
            <li>#FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT specifies {@code VkImage} <b>can</b> be used as a sampled image with a min or max {@code VkSamplerReductionMode}. This bit <b>must</b> only be exposed for formats that also support the #FORMAT_FEATURE_SAMPLED_IMAGE_BIT.</li>
            <li>#FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT specifies that {@code VkImage} <b>can</b> be used with a sampler that has either of {@code magFilter} or {@code minFilter} set to #FILTER_CUBIC_EXT, or be the source image for a blit with {@code filter} set to #FILTER_CUBIC_EXT. This bit <b>must</b> only be exposed for formats that also support the #FORMAT_FEATURE_SAMPLED_IMAGE_BIT. If the format being queried is a depth/stencil format, this only specifies that the depth aspect is cubic filterable.</li>
            <li>#FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT specifies that an application <b>can</b> define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> using this format as a source, and that an image of this format <b>can</b> be used with a ##VkSamplerYcbcrConversionCreateInfo {@code xChromaOffset} and/or {@code yChromaOffset} of #CHROMA_LOCATION_MIDPOINT. Otherwise both {@code xChromaOffset} and {@code yChromaOffset} <b>must</b> be #CHROMA_LOCATION_COSITED_EVEN. If a format does not incorporate chroma downsampling (it is not a “422” or “420” format) but the implementation supports sampler Y′C<sub>B</sub>C<sub>R</sub> conversion for this format, the implementation <b>must</b> set #FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT.</li>
            <li>#FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT specifies that an application <b>can</b> define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> using this format as a source, and that an image of this format <b>can</b> be used with a ##VkSamplerYcbcrConversionCreateInfo {@code xChromaOffset} and/or {@code yChromaOffset} of #CHROMA_LOCATION_COSITED_EVEN. Otherwise both {@code xChromaOffset} and {@code yChromaOffset} <b>must</b> be #CHROMA_LOCATION_MIDPOINT. If neither #FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT nor #FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT is set, the application <b>must</b> not define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> using this format as a source.</li>
            <li>#FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT specifies that the format can do linear sampler filtering (min/magFilter) whilst sampler Y′C<sub>B</sub>C<sub>R</sub> conversion is enabled.</li>
            <li>#FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT specifies that the format can have different chroma, min, and mag filters.</li>
            <li>#FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT specifies that reconstruction is explicit, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#textures-chroma-reconstruction">Chroma Reconstruction</a>. If this bit is not present, reconstruction is implicit by default.</li>
            <li>#FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT specifies that reconstruction <b>can</b> be forcibly made explicit by setting ##VkSamplerYcbcrConversionCreateInfo{@code ::forceExplicitReconstruction} to #TRUE.</li>
            <li>#FORMAT_FEATURE_DISJOINT_BIT specifies that a multi-planar image <b>can</b> have the #IMAGE_CREATE_DISJOINT_BIT set during image creation. An implementation <b>must</b> not set #FORMAT_FEATURE_DISJOINT_BIT for <em>single-plane formats</em>.</li>
            <li>#FORMAT_FEATURE_FRAGMENT_DENSITY_MAP_BIT_EXT specifies that an image view <b>can</b> be used as a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-fragmentdensitymapattachment">fragment density map attachment</a>.</li>
        </ul>

        The following bits <b>may</b> be set in {@code bufferFeatures}, specifying that the features are supported by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkBuffer">buffers</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkBufferView">buffer views</a> created with the queried #GetPhysicalDeviceProperties(){@code ::format}:

        <ul>
            <li>#FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT specifies that the format <b>can</b> be used to create a buffer view that <b>can</b> be bound to a #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER descriptor.</li>
            <li>#FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT specifies that the format <b>can</b> be used to create a buffer view that <b>can</b> be bound to a #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER descriptor.</li>
            <li>#FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT specifies that atomic operations are supported on #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER with this format.</li>
            <li>#FORMAT_FEATURE_VERTEX_BUFFER_BIT specifies that the format <b>can</b> be used as a vertex attribute format (##VkVertexInputAttributeDescription{@code ::format}).</li>
        </ul>

        <h5>See Also</h5>
        {@code VkFormatFeatureFlags}
        """,

        "FORMAT_FEATURE_SAMPLED_IMAGE_BIT".enum(0x00000001),
        "FORMAT_FEATURE_STORAGE_IMAGE_BIT".enum(0x00000002),
        "FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT".enum(0x00000004),
        "FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT".enum(0x00000008),
        "FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT".enum(0x00000010),
        "FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT".enum(0x00000020),
        "FORMAT_FEATURE_VERTEX_BUFFER_BIT".enum(0x00000040),
        "FORMAT_FEATURE_COLOR_ATTACHMENT_BIT".enum(0x00000080),
        "FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT".enum(0x00000100),
        "FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT".enum(0x00000200),
        "FORMAT_FEATURE_BLIT_SRC_BIT".enum(0x00000400),
        "FORMAT_FEATURE_BLIT_DST_BIT".enum(0x00000800),
        "FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT".enum(0x00001000)
    )

    EnumConstant(
        """
        VkImageType - Specifies the type of an image object

        <h5>Description</h5>
        <ul>
            <li>#IMAGE_TYPE_1D specifies a one-dimensional image.</li>
            <li>#IMAGE_TYPE_2D specifies a two-dimensional image.</li>
            <li>#IMAGE_TYPE_3D specifies a three-dimensional image.</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageCreateInfo, ##VkPhysicalDeviceImageFormatInfo2, ##VkPhysicalDeviceSparseImageFormatInfo2, #GetPhysicalDeviceExternalImageFormatPropertiesNV(), #GetPhysicalDeviceImageFormatProperties(), #GetPhysicalDeviceSparseImageFormatProperties()
        """,

        "IMAGE_TYPE_1D".."0",
        "IMAGE_TYPE_2D".."1",
        "IMAGE_TYPE_3D".."2"
    )

    EnumConstant(
        """
        VkImageTiling - Specifies the tiling arrangement of data in an image

        <h5>Description</h5>
        <ul>
            <li>#IMAGE_TILING_OPTIMAL specifies optimal tiling (texels are laid out in an implementation-dependent arrangement, for more optimal memory access).</li>
            <li>#IMAGE_TILING_LINEAR specifies linear tiling (texels are laid out in memory in row-major order, possibly with some padding on each row).</li>
            <li>#IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT indicates that the image&#8217;s tiling is defined by a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#glossary-drm-format-modifier">Linux DRM format modifier</a>. The modifier is specified at image creation with ##VkImageDrmFormatModifierListCreateInfoEXT or ##VkImageDrmFormatModifierExplicitCreateInfoEXT, and <b>can</b> be queried with #GetImageDrmFormatModifierPropertiesEXT().</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageCreateInfo, ##VkPhysicalDeviceImageFormatInfo2, ##VkPhysicalDeviceSparseImageFormatInfo2, #GetPhysicalDeviceExternalImageFormatPropertiesNV(), #GetPhysicalDeviceImageFormatProperties(), #GetPhysicalDeviceSparseImageFormatProperties()
        """,

        "IMAGE_TILING_OPTIMAL".."0",
        "IMAGE_TILING_LINEAR".."1"
    )

    EnumConstant(
        """
        VkImageUsageFlagBits - Bitmask specifying intended usage of an image

        <h5>Description</h5>
        <ul>
            <li>#IMAGE_USAGE_TRANSFER_SRC_BIT specifies that the image <b>can</b> be used as the source of a transfer command.</li>
            <li>#IMAGE_USAGE_TRANSFER_DST_BIT specifies that the image <b>can</b> be used as the destination of a transfer command.</li>
            <li>#IMAGE_USAGE_SAMPLED_BIT specifies that the image <b>can</b> be used to create a {@code VkImageView} suitable for occupying a {@code VkDescriptorSet} slot either of type #DESCRIPTOR_TYPE_SAMPLED_IMAGE or #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, and be sampled by a shader.</li>
            <li>#IMAGE_USAGE_STORAGE_BIT specifies that the image <b>can</b> be used to create a {@code VkImageView} suitable for occupying a {@code VkDescriptorSet} slot of type #DESCRIPTOR_TYPE_STORAGE_IMAGE.</li>
            <li>#IMAGE_USAGE_COLOR_ATTACHMENT_BIT specifies that the image <b>can</b> be used to create a {@code VkImageView} suitable for use as a color or resolve attachment in a {@code VkFramebuffer}.</li>
            <li>#IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT specifies that the image <b>can</b> be used to create a {@code VkImageView} suitable for use as a depth/stencil or depth/stencil resolve attachment in a {@code VkFramebuffer}.</li>
            <li>#IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT specifies that the memory bound to this image will have been allocated with the #MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#memory">Memory Allocation</a> for more detail). This bit <b>can</b> be set for any image that <b>can</b> be used to create a {@code VkImageView} suitable for use as a color, resolve, depth/stencil, or input attachment.</li>
            <li>#IMAGE_USAGE_INPUT_ATTACHMENT_BIT specifies that the image <b>can</b> be used to create a {@code VkImageView} suitable for occupying {@code VkDescriptorSet} slot of type #DESCRIPTOR_TYPE_INPUT_ATTACHMENT; be read from a shader as an input attachment; and be used as an input attachment in a framebuffer.</li>
            <li>#IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV specifies that the image <b>can</b> be used to create a {@code VkImageView} suitable for use as a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#primsrast-shading-rate-image">shading rate image</a>.</li>
            <li>#IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT specifies that the image <b>can</b> be used to create a {@code VkImageView} suitable for use as a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fragmentdensitymapops">fragment density map image</a>.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkImageUsageFlags}
        """,

        "IMAGE_USAGE_TRANSFER_SRC_BIT".enum(0x00000001),
        "IMAGE_USAGE_TRANSFER_DST_BIT".enum(0x00000002),
        "IMAGE_USAGE_SAMPLED_BIT".enum(0x00000004),
        "IMAGE_USAGE_STORAGE_BIT".enum(0x00000008),
        "IMAGE_USAGE_COLOR_ATTACHMENT_BIT".enum(0x00000010),
        "IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT".enum(0x00000020),
        "IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT".enum(0x00000040),
        "IMAGE_USAGE_INPUT_ATTACHMENT_BIT".enum(0x00000080)
    )

    EnumConstant(
        """
        VkImageCreateFlagBits - Bitmask specifying additional parameters of an image

        <h5>Description</h5>
        <ul>
            <li>#IMAGE_CREATE_SPARSE_BINDING_BIT specifies that the image will be backed using sparse memory binding.</li>
            <li>#IMAGE_CREATE_SPARSE_RESIDENCY_BIT specifies that the image <b>can</b> be partially backed using sparse memory binding. Images created with this flag <b>must</b> also be created with the #IMAGE_CREATE_SPARSE_BINDING_BIT flag.</li>
            <li>#IMAGE_CREATE_SPARSE_ALIASED_BIT specifies that the image will be backed using sparse memory binding with memory ranges that might also simultaneously be backing another image (or another portion of the same image). Images created with this flag <b>must</b> also be created with the #IMAGE_CREATE_SPARSE_BINDING_BIT flag</li>
            <li>#IMAGE_CREATE_MUTABLE_FORMAT_BIT specifies that the image <b>can</b> be used to create a {@code VkImageView} with a different format from the image. For <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar</a> formats, #IMAGE_CREATE_MUTABLE_FORMAT_BIT specifies that a {@code VkImageView} can be created of a <em>plane</em> of the image.</li>
            <li>#IMAGE_CREATE_CUBE_COMPATIBLE_BIT specifies that the image <b>can</b> be used to create a {@code VkImageView} of type #IMAGE_VIEW_TYPE_CUBE or #IMAGE_VIEW_TYPE_CUBE_ARRAY.</li>
            <li>#IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT specifies that the image <b>can</b> be used to create a {@code VkImageView} of type #IMAGE_VIEW_TYPE_2D or #IMAGE_VIEW_TYPE_2D_ARRAY.</li>
            <li>#IMAGE_CREATE_PROTECTED_BIT specifies that the image is a protected image.</li>
            <li>#IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT specifies that the image <b>can</b> be used with a non-zero value of the {@code splitInstanceBindRegionCount} member of a ##VkBindImageMemoryDeviceGroupInfo structure passed into #BindImageMemory2(). This flag also has the effect of making the image use the standard sparse image block dimensions.</li>
            <li>#IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT specifies that the image having a compressed format <b>can</b> be used to create a {@code VkImageView} with an uncompressed format where each texel in the image view corresponds to a compressed texel block of the image.</li>
            <li>#IMAGE_CREATE_EXTENDED_USAGE_BIT specifies that the image <b>can</b> be created with usage flags that are not supported for the format the image is created with but are supported for at least one format a {@code VkImageView} created from the image <b>can</b> have.</li>
            <li>#IMAGE_CREATE_DISJOINT_BIT specifies that an image with a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a> <b>must</b> have each plane separately bound to memory, rather than having a single memory binding for the whole image; the presence of this bit distinguishes a <em>disjoint image</em> from an image without this bit set.</li>
            <li>#IMAGE_CREATE_ALIAS_BIT specifies that two images created with the same creation parameters and aliased to the same memory <b>can</b> interpret the contents of the memory consistently with each other, subject to the rules described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-memory-aliasing">Memory Aliasing</a> section. This flag further specifies that each plane of a <em>disjoint</em> image <b>can</b> share an in-memory non-linear representation with single-plane images, and that a single-plane image <b>can</b> share an in-memory non-linear representation with a plane of a multi-planar disjoint image, according to the rules in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-compatible-planes">Compatible formats of planes of multi-planar formats</a>. If the {@code pNext} chain includes a ##VkExternalMemoryImageCreateInfo or ##VkExternalMemoryImageCreateInfoNV structure whose {@code handleTypes} member is not 0, it is as if #IMAGE_CREATE_ALIAS_BIT is set.</li>
            <li>#IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT specifies that an image with a depth or depth/stencil format <b>can</b> be used with custom sample locations when used as a depth/stencil attachment.</li>
            <li>#IMAGE_CREATE_CORNER_SAMPLED_BIT_NV specifies that the image is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-images-corner-sampled">corner-sampled image</a>.</li>
            <li>
                #IMAGE_CREATE_SUBSAMPLED_BIT_EXT specifies that an image <b>can</b> be in a subsampled format which <b>may</b> be more optimal when written as an attachment by a render pass that has a fragment density map attachment. Accessing a subsampled image has additional considerations:
                <ul>
                    <li>Image data read as an image sampler is undefined if the sampler was not created with {@code flags} containing #SAMPLER_CREATE_SUBSAMPLED_BIT_EXT or was not sampled through the use of a combined image sampler with an immutable sampler in ##VkDescriptorSetLayoutBinding.</li>
                    <li>Image data read with an input attachment is undefined if the contents were not written as an attachment in an earlier subpass of the same render pass.</li>
                    <li>Image data read with load operations <b>may</b> be resampled to the fragment density of the render pass.</li>
                    <li>Image contents outside of the render area become undefined if the image is stored as a render pass attachment.</li>
                </ul>
            </li>
        </ul>

        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#sparsememory-sparseresourcefeatures">Sparse Resource Features</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#sparsememory-physicalfeatures">Sparse Physical Device Features</a> for more details.

        <h5>See Also</h5>
        {@code VkImageCreateFlags}
        """,

        "IMAGE_CREATE_SPARSE_BINDING_BIT".enum(0x00000001),
        "IMAGE_CREATE_SPARSE_RESIDENCY_BIT".enum(0x00000002),
        "IMAGE_CREATE_SPARSE_ALIASED_BIT".enum(0x00000004),
        "IMAGE_CREATE_MUTABLE_FORMAT_BIT".enum(0x00000008),
        "IMAGE_CREATE_CUBE_COMPATIBLE_BIT".enum(0x00000010)
    )

    EnumConstant(
        """
        VkSampleCountFlagBits - Bitmask specifying sample counts supported for an image used for storage operations

        <h5>Description</h5>
        <ul>
            <li>#SAMPLE_COUNT_1_BIT specifies an image with one sample per pixel.</li>
            <li>#SAMPLE_COUNT_2_BIT specifies an image with 2 samples per pixel.</li>
            <li>#SAMPLE_COUNT_4_BIT specifies an image with 4 samples per pixel.</li>
            <li>#SAMPLE_COUNT_8_BIT specifies an image with 8 samples per pixel.</li>
            <li>#SAMPLE_COUNT_16_BIT specifies an image with 16 samples per pixel.</li>
            <li>#SAMPLE_COUNT_32_BIT specifies an image with 32 samples per pixel.</li>
            <li>#SAMPLE_COUNT_64_BIT specifies an image with 64 samples per pixel.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentDescription, ##VkAttachmentDescription2, ##VkFramebufferMixedSamplesCombinationNV, ##VkImageCreateInfo, ##VkPhysicalDeviceSparseImageFormatInfo2, ##VkPipelineMultisampleStateCreateInfo, {@code VkSampleCountFlags}, ##VkSampleLocationsInfoEXT, #GetPhysicalDeviceMultisamplePropertiesEXT(), #GetPhysicalDeviceSparseImageFormatProperties()
        """,

        "SAMPLE_COUNT_1_BIT".enum(0x00000001),
        "SAMPLE_COUNT_2_BIT".enum(0x00000002),
        "SAMPLE_COUNT_4_BIT".enum(0x00000004),
        "SAMPLE_COUNT_8_BIT".enum(0x00000008),
        "SAMPLE_COUNT_16_BIT".enum(0x00000010),
        "SAMPLE_COUNT_32_BIT".enum(0x00000020),
        "SAMPLE_COUNT_64_BIT".enum(0x00000040)
    )

    EnumConstant(
        """
        VkPhysicalDeviceType - Supported physical device types

        <h5>Description</h5>
        <ul>
            <li>#PHYSICAL_DEVICE_TYPE_OTHER - the device does not match any other available types.</li>
            <li>#PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU - the device is typically one embedded in or tightly coupled with the host.</li>
            <li>#PHYSICAL_DEVICE_TYPE_DISCRETE_GPU - the device is typically a separate processor connected to the host via an interlink.</li>
            <li>#PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU - the device is typically a virtual node in a virtualization environment.</li>
            <li>#PHYSICAL_DEVICE_TYPE_CPU - the device is typically running on the same processors as the host.</li>
        </ul>

        The physical device type is advertised for informational purposes only, and does not directly affect the operation of the system. However, the device type <b>may</b> correlate with other advertised properties or capabilities of the system, such as how many memory heaps there are.

        <h5>See Also</h5>
        ##VkPhysicalDeviceProperties
        """,

        "PHYSICAL_DEVICE_TYPE_OTHER".."0",
        "PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU".."1",
        "PHYSICAL_DEVICE_TYPE_DISCRETE_GPU".."2",
        "PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU".."3",
        "PHYSICAL_DEVICE_TYPE_CPU".."4"
    )

    EnumConstant(
        """
        VkQueueFlagBits - Bitmask specifying capabilities of queues in a queue family

        <h5>Description</h5>
        <ul>
            <li>#QUEUE_GRAPHICS_BIT specifies that queues in this queue family support graphics operations.</li>
            <li>#QUEUE_COMPUTE_BIT specifies that queues in this queue family support compute operations.</li>
            <li>#QUEUE_TRANSFER_BIT specifies that queues in this queue family support transfer operations.</li>
            <li>#QUEUE_SPARSE_BINDING_BIT specifies that queues in this queue family support sparse memory management operations (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#sparsememory">Sparse Resources</a>). If any of the sparse resource features are enabled, then at least one queue family <b>must</b> support this bit.</li>
            <li>if #QUEUE_PROTECTED_BIT is set, then the queues in this queue family support the #DEVICE_QUEUE_CREATE_PROTECTED_BIT bit. (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#memory-protected-memory">Protected Memory</a>). If the protected memory physical device feature is supported, then at least one queue family of at least one physical device exposed by the implementation <b>must</b> support this bit.</li>
        </ul>

        If an implementation exposes any queue family that supports graphics operations, at least one queue family of at least one physical device exposed by the implementation <b>must</b> support both graphics and compute operations.

        Furthermore, if the protected memory physical device feature is supported, then at least one queue family of at least one physical device exposed by the implementation <b>must</b> support graphics operations, compute operations, and protected memory operations.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        All commands that are allowed on a queue that supports transfer operations are also allowed on a queue that supports either graphics or compute operations. Thus, if the capabilities of a queue family include #QUEUE_GRAPHICS_BIT or #QUEUE_COMPUTE_BIT, then reporting the #QUEUE_TRANSFER_BIT capability separately for that queue family is optional:.
        </div>

        For further details see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#devsandqueues-queues">Queues</a>.

        <h5>See Also</h5>
        {@code VkQueueFlags}
        """,

        "QUEUE_GRAPHICS_BIT".enum(0x00000001),
        "QUEUE_COMPUTE_BIT".enum(0x00000002),
        "QUEUE_TRANSFER_BIT".enum(0x00000004),
        "QUEUE_SPARSE_BINDING_BIT".enum(0x00000008)
    )

    EnumConstant(
        """
        VkMemoryPropertyFlagBits - Bitmask specifying properties for a memory type

        <h5>Description</h5>
        <ul>
            <li>#MEMORY_PROPERTY_DEVICE_LOCAL_BIT bit specifies that memory allocated with this type is the most efficient for device access. This property will be set if and only if the memory type belongs to a heap with the #MEMORY_HEAP_DEVICE_LOCAL_BIT set.</li>
            <li>#MEMORY_PROPERTY_HOST_VISIBLE_BIT bit specifies that memory allocated with this type <b>can</b> be mapped for host access using #MapMemory().</li>
            <li>#MEMORY_PROPERTY_HOST_COHERENT_BIT bit specifies that the host cache management commands #FlushMappedMemoryRanges() and #InvalidateMappedMemoryRanges() are not needed to flush host writes to the device or make device writes visible to the host, respectively.</li>
            <li>#MEMORY_PROPERTY_HOST_CACHED_BIT bit specifies that memory allocated with this type is cached on the host. Host memory accesses to uncached memory are slower than to cached memory, however uncached memory is always host coherent.</li>
            <li>#MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT bit specifies that the memory type only allows device access to the memory. Memory types <b>must</b> not have both #MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT and #MEMORY_PROPERTY_HOST_VISIBLE_BIT set. Additionally, the object&#8217;s backing memory <b>may</b> be provided by the implementation lazily as specified in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#memory-device-lazy_allocation">Lazily Allocated Memory</a>.</li>
            <li>#MEMORY_PROPERTY_PROTECTED_BIT bit specifies that the memory type only allows device access to the memory, and allows protected queue operations to access the memory. Memory types <b>must</b> not have #MEMORY_PROPERTY_PROTECTED_BIT set and any of #MEMORY_PROPERTY_HOST_VISIBLE_BIT set, or #MEMORY_PROPERTY_HOST_COHERENT_BIT set, or #MEMORY_PROPERTY_HOST_CACHED_BIT set.</li>
            <li>#MEMORY_PROPERTY_DEVICE_COHERENT_BIT_AMD bit specifies that device accesses to allocations of this memory type are automatically made available and visible.</li>
            <li>#MEMORY_PROPERTY_DEVICE_UNCACHED_BIT_AMD bit specifies that memory allocated with this type is not cached on the device. Uncached device memory is always device coherent.</li>
        </ul>

        For any memory allocated with both the #MEMORY_PROPERTY_HOST_COHERENT_BIT and the #MEMORY_PROPERTY_DEVICE_COHERENT_BIT_AMD, host or device accesses also perform automatic memory domain transfer operations, such that writes are always automatically available and visible to both host and device memory domains.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Device coherence is a useful property for certain debugging use cases (e.g. crash analysis, where performing separate coherence actions could mean values are not reported correctly). However, device coherent accesses may be slower than equivalent accesses without device coherence, particularly if they are also device uncached. For device uncached memory in particular, repeated accesses to the same or neighbouring memory locations over a short time period (e.g. within a frame) may be slower than it would be for the equivalent cached memory type. As such, it's generally inadvisable to use device coherent or device uncached memory except when really needed.
        </div>

        <h5>See Also</h5>
        {@code VkMemoryPropertyFlags}
        """,

        "MEMORY_PROPERTY_DEVICE_LOCAL_BIT".enum(0x00000001),
        "MEMORY_PROPERTY_HOST_VISIBLE_BIT".enum(0x00000002),
        "MEMORY_PROPERTY_HOST_COHERENT_BIT".enum(0x00000004),
        "MEMORY_PROPERTY_HOST_CACHED_BIT".enum(0x00000008),
        "MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT".enum(0x00000010)
    )

    EnumConstant(
        """
        VkMemoryHeapFlagBits - Bitmask specifying attribute flags for a heap

        <h5>Description</h5>
        <ul>
            <li>#MEMORY_HEAP_DEVICE_LOCAL_BIT specifies that the heap corresponds to device local memory. Device local memory <b>may</b> have different performance characteristics than host local memory, and <b>may</b> support different memory property flags.</li>
            <li>#MEMORY_HEAP_MULTI_INSTANCE_BIT specifies that in a logical device representing more than one physical device, there is a per-physical device instance of the heap memory. By default, an allocation from such a heap will be replicated to each physical device&#8217;s instance of the heap.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkMemoryHeapFlags}
        """,

        "MEMORY_HEAP_DEVICE_LOCAL_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkPipelineStageFlagBits - Bitmask specifying pipeline stages

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_STAGE_TOP_OF_PIPE_BIT specifies the stage of the pipeline where any commands are initially received by the queue.</li>
            <li>#PIPELINE_STAGE_DRAW_INDIRECT_BIT specifies the stage of the pipeline where Draw/DispatchIndirect data structures are consumed. This stage also includes reading commands written by #CmdProcessCommandsNVX().</li>
            <li>#PIPELINE_STAGE_TASK_SHADER_BIT_NV specifies the task shader stage.</li>
            <li>#PIPELINE_STAGE_MESH_SHADER_BIT_NV specifies the mesh shader stage.</li>
            <li>#PIPELINE_STAGE_VERTEX_INPUT_BIT specifies the stage of the pipeline where vertex and index buffers are consumed.</li>
            <li>#PIPELINE_STAGE_VERTEX_SHADER_BIT specifies the vertex shader stage.</li>
            <li>#PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT specifies the tessellation control shader stage.</li>
            <li>#PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT specifies the tessellation evaluation shader stage.</li>
            <li>#PIPELINE_STAGE_GEOMETRY_SHADER_BIT specifies the geometry shader stage.</li>
            <li>#PIPELINE_STAGE_FRAGMENT_SHADER_BIT specifies the fragment shader stage.</li>
            <li>#PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT specifies the stage of the pipeline where early fragment tests (depth and stencil tests before fragment shading) are performed. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load operations</a> for framebuffer attachments with a depth/stencil format.</li>
            <li>#PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT specifies the stage of the pipeline where late fragment tests (depth and stencil tests after fragment shading) are performed. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass store operations</a> for framebuffer attachments with a depth/stencil format.</li>
            <li>#PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT specifies the stage of the pipeline after blending where the final color values are output from the pipeline. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load and store operations</a> and multisample resolve operations for framebuffer attachments with a color or depth/stencil format.</li>
            <li>#PIPELINE_STAGE_COMPUTE_SHADER_BIT specifies the execution of a compute shader.</li>
            <li>#PIPELINE_STAGE_TRANSFER_BIT specifies the execution of copy commands. This includes the operations resulting from all <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies">copy commands</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#clears">clear commands</a> (with the exception of #CmdClearAttachments()), and #CmdCopyQueryPoolResults().</li>
            <li>#PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT specifies the final stage in the pipeline where operations generated by all commands complete execution.</li>
            <li>#PIPELINE_STAGE_HOST_BIT specifies a pseudo-stage indicating execution on the host of reads/writes of device memory. This stage is not invoked by any commands recorded in a command buffer.</li>
            <li>#PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV specifies the execution of the ray tracing shader stages.</li>
            <li>#PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV specifies the execution of #CmdBuildAccelerationStructureNV(), #CmdCopyAccelerationStructureNV(), and #CmdWriteAccelerationStructuresPropertiesNV().</li>
            <li>
                #PIPELINE_STAGE_ALL_GRAPHICS_BIT specifies the execution of all graphics pipeline stages, and is equivalent to the logical OR of:
                <ul>
                    <li>#PIPELINE_STAGE_TOP_OF_PIPE_BIT</li>
                    <li>#PIPELINE_STAGE_DRAW_INDIRECT_BIT</li>
                    <li>#PIPELINE_STAGE_TASK_SHADER_BIT_NV</li>
                    <li>#PIPELINE_STAGE_MESH_SHADER_BIT_NV</li>
                    <li>#PIPELINE_STAGE_VERTEX_INPUT_BIT</li>
                    <li>#PIPELINE_STAGE_VERTEX_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_FRAGMENT_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT</li>
                    <li>#PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT</li>
                    <li>#PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT</li>
                    <li>#PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT</li>
                    <li>#PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT</li>
                    <li>#PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT</li>
                    <li>#PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV</li>
                    <li>#PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
                </ul>
            </li>
            <li>#PIPELINE_STAGE_ALL_COMMANDS_BIT is equivalent to the logical OR of every other pipeline stage flag that is supported on the queue it is used with.</li>
            <li>#PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT specifies the stage of the pipeline where the predicate of conditional rendering is consumed.</li>
            <li>#PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT specifies the stage of the pipeline where vertex attribute output values are written to the transform feedback buffers.</li>
            <li>#PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX specifies the stage of the pipeline where device-side generation of commands via #CmdProcessCommandsNVX() is handled.</li>
            <li>#PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV specifies the stage of the pipeline where the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#primsrast-shading-rate-image">shading rate image</a> is read to determine the shading rate for portions of a rasterized primitive.</li>
            <li>#PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT specifies the stage of the pipeline where the fragment density map is read to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fragmentdensitymapops">generate the fragment areas</a>.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        An execution dependency with only #PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT in the destination stage mask will only prevent that stage from executing in subsequently submitted commands. As this stage does not perform any actual execution, this is not observable - in effect, it does not delay processing of subsequent commands. Similarly an execution dependency with only #PIPELINE_STAGE_TOP_OF_PIPE_BIT in the source stage mask will effectively not wait for any prior commands to complete.

        When defining a memory dependency, using only #PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT or #PIPELINE_STAGE_TOP_OF_PIPE_BIT would never make any accesses available and/or visible because these stages do not access memory.

        #PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT and #PIPELINE_STAGE_TOP_OF_PIPE_BIT are useful for accomplishing layout transitions and queue ownership operations when the required execution dependency is satisfied by other means - for example, semaphore operations between queues.
        </div>

        <h5>See Also</h5>
        ##VkCheckpointDataNV, {@code VkPipelineStageFlags}, #CmdWriteBufferMarkerAMD(), #CmdWriteTimestamp()
        """,

        "PIPELINE_STAGE_TOP_OF_PIPE_BIT".enum(0x00000001),
        "PIPELINE_STAGE_DRAW_INDIRECT_BIT".enum(0x00000002),
        "PIPELINE_STAGE_VERTEX_INPUT_BIT".enum(0x00000004),
        "PIPELINE_STAGE_VERTEX_SHADER_BIT".enum(0x00000008),
        "PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT".enum(0x00000010),
        "PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT".enum(0x00000020),
        "PIPELINE_STAGE_GEOMETRY_SHADER_BIT".enum(0x00000040),
        "PIPELINE_STAGE_FRAGMENT_SHADER_BIT".enum(0x00000080),
        "PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT".enum(0x00000100),
        "PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT".enum(0x00000200),
        "PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT".enum(0x00000400),
        "PIPELINE_STAGE_COMPUTE_SHADER_BIT".enum(0x00000800),
        "PIPELINE_STAGE_TRANSFER_BIT".enum(0x00001000),
        "PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT".enum(0x00002000),
        "PIPELINE_STAGE_HOST_BIT".enum(0x00004000),
        "PIPELINE_STAGE_ALL_GRAPHICS_BIT".enum(0x00008000),
        "PIPELINE_STAGE_ALL_COMMANDS_BIT".enum(0x00010000)
    )

    EnumConstant(
        """
        VkImageAspectFlagBits - Bitmask specifying which aspects of an image are included in a view

        <h5>Description</h5>
        <ul>
            <li>#IMAGE_ASPECT_COLOR_BIT specifies the color aspect.</li>
            <li>#IMAGE_ASPECT_DEPTH_BIT specifies the depth aspect.</li>
            <li>#IMAGE_ASPECT_STENCIL_BIT specifies the stencil aspect.</li>
            <li>#IMAGE_ASPECT_METADATA_BIT specifies the metadata aspect, used for sparse <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#sparsememory">sparse resource</a> operations.</li>
            <li>#IMAGE_ASPECT_PLANE_0_BIT specifies plane 0 of a <em>multi-planar</em> image format.</li>
            <li>#IMAGE_ASPECT_PLANE_1_BIT specifies plane 1 of a <em>multi-planar</em> image format.</li>
            <li>#IMAGE_ASPECT_PLANE_2_BIT specifies plane 2 of a <em>multi-planar</em> image format.</li>
            <li>#IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT specifies <em>memory plane</em> 0.</li>
            <li>#IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT specifies <em>memory plane</em> 1.</li>
            <li>#IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT specifies <em>memory plane</em> 2.</li>
            <li>#IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT specifies <em>memory plane</em> 3.</li>
        </ul>

        <h5>See Also</h5>
        ##VkBindImagePlaneMemoryInfo, {@code VkImageAspectFlags}, ##VkImagePlaneMemoryRequirementsInfo
        """,

        "IMAGE_ASPECT_COLOR_BIT".enum(0x00000001),
        "IMAGE_ASPECT_DEPTH_BIT".enum(0x00000002),
        "IMAGE_ASPECT_STENCIL_BIT".enum(0x00000004),
        "IMAGE_ASPECT_METADATA_BIT".enum(0x00000008)
    )

    EnumConstant(
        """
        VkSparseImageFormatFlagBits - Bitmask specifying additional information about a sparse image resource

        <h5>Description</h5>
        <ul>
            <li>#SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT specifies that the image uses a single mip tail region for all array layers.</li>
            <li>#SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT specifies that the first mip level whose dimensions are not integer multiples of the corresponding dimensions of the sparse image block begins the mip tail region.</li>
            <li>#SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT specifies that the image uses non-standard sparse image block dimensions, and the {@code imageGranularity} values do not match the standard sparse image block dimensions for the given format.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkSparseImageFormatFlags}
        """,

        "SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT".enum(0x00000001),
        "SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT".enum(0x00000002),
        "SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkSparseMemoryBindFlagBits - Bitmask specifying usage of a sparse memory binding operation

        <h5>Description</h5>
        <ul>
            <li>#SPARSE_MEMORY_BIND_METADATA_BIT specifies that the memory being bound is only for the metadata aspect.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkSparseMemoryBindFlags}
        """,

        "SPARSE_MEMORY_BIND_METADATA_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkFenceCreateFlagBits - Bitmask specifying initial state and behavior of a fence

        <h5>Description</h5>
        <ul>
            <li>#FENCE_CREATE_SIGNALED_BIT specifies that the fence object is created in the signaled state. Otherwise, it is created in the unsignaled state.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkFenceCreateFlags}
        """,

        "FENCE_CREATE_SIGNALED_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkQueryType - Specify the type of queries managed by a query pool

        <h5>Description</h5>
        <ul>
            <li>#QUERY_TYPE_OCCLUSION specifies an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-occlusion">occlusion query</a>.</li>
            <li>#QUERY_TYPE_PIPELINE_STATISTICS specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-pipestats">pipeline statistics query</a>.</li>
            <li>#QUERY_TYPE_TIMESTAMP specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-timestamps">timestamp query</a>.</li>
            <li>#QUERY_TYPE_PERFORMANCE_QUERY_KHR specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-performance">performance query</a>.</li>
            <li>#QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-transform-feedback">transform feedback query</a>.</li>
            <li>#QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#acceleration-structure-copying">ray tracing acceleration structure size query</a>.</li>
            <li>#QUERY_TYPE_PERFORMANCE_QUERY_INTEL specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-performance-intel">Intel performance query</a>.</li>
        </ul>

        <h5>See Also</h5>
        ##VkQueryPoolCreateInfo, #CmdWriteAccelerationStructuresPropertiesNV()
        """,

        "QUERY_TYPE_OCCLUSION".."0",
        "QUERY_TYPE_PIPELINE_STATISTICS".."1",
        "QUERY_TYPE_TIMESTAMP".."2"
    )

    EnumConstant(
        """
        VkQueryPipelineStatisticFlagBits - Bitmask specifying queried pipeline statistics

        <h5>Description</h5>
        <ul>
            <li>#QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT specifies that queries managed by the pool will count the number of vertices processed by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#drawing">input assembly</a> stage. Vertices corresponding to incomplete primitives <b>may</b> contribute to the count.</li>
            <li>#QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT specifies that queries managed by the pool will count the number of primitives processed by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#drawing">input assembly</a> stage. If primitive restart is enabled, restarting the primitive topology has no effect on the count. Incomplete primitives <b>may</b> be counted.</li>
            <li>#QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT specifies that queries managed by the pool will count the number of vertex shader invocations. This counter&#8217;s value is incremented each time a vertex shader is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#shaders-vertex-execution">invoked</a>.</li>
            <li>#QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT specifies that queries managed by the pool will count the number of geometry shader invocations. This counter&#8217;s value is incremented each time a geometry shader is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#shaders-geometry-execution">invoked</a>. In the case of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#geometry-invocations">instanced geometry shaders</a>, the geometry shader invocations count is incremented for each separate instanced invocation.</li>
            <li>#QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT specifies that queries managed by the pool will count the number of primitives generated by geometry shader invocations. The counter&#8217;s value is incremented each time the geometry shader emits a primitive. Restarting primitive topology using the SPIR-V instructions {@code OpEndPrimitive} or {@code OpEndStreamPrimitive} has no effect on the geometry shader output primitives count.</li>
            <li>#QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT specifies that queries managed by the pool will count the number of primitives processed by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vertexpostproc-clipping">Primitive Clipping</a> stage of the pipeline. The counter&#8217;s value is incremented each time a primitive reaches the primitive clipping stage.</li>
            <li>
                #QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT specifies that queries managed by the pool will count the number of primitives output by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vertexpostproc-clipping">Primitive Clipping</a> stage of the pipeline. The counter&#8217;s value is incremented each time a primitive passes the primitive clipping stage. The actual number of primitives output by the primitive clipping stage for a particular input primitive is implementation-dependent but <b>must</b> satisfy the following conditions:
                <ul>
                    <li>If at least one vertex of the input primitive lies inside the clipping volume, the counter is incremented by one or more.</li>
                    <li>Otherwise, the counter is incremented by zero or more.</li>
                </ul>
            </li>
            <li>#QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT specifies that queries managed by the pool will count the number of fragment shader invocations. The counter&#8217;s value is incremented each time the fragment shader is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#shaders-fragment-execution">invoked</a>.</li>
            <li>#QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT specifies that queries managed by the pool will count the number of patches processed by the tessellation control shader. The counter&#8217;s value is incremented once for each patch for which a tessellation control shader is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#shaders-tessellation-control-execution">invoked</a>.</li>
            <li>#QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT specifies that queries managed by the pool will count the number of invocations of the tessellation evaluation shader. The counter&#8217;s value is incremented each time the tessellation evaluation shader is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#shaders-tessellation-evaluation-execution">invoked</a>.</li>
            <li>#QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT specifies that queries managed by the pool will count the number of compute shader invocations. The counter&#8217;s value is incremented every time the compute shader is invoked. Implementations <b>may</b> skip the execution of certain compute shader invocations or execute additional compute shader invocations for implementation-dependent reasons as long as the results of rendering otherwise remain unchanged.</li>
        </ul>

        These values are intended to measure relative statistics on one implementation. Various device architectures will count these values differently. Any or all counters <b>may</b> be affected by the issues described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-operation-undefined">Query Operation</a>.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        For example, tile-based rendering devices <b>may</b> need to replay the scene multiple times, affecting some of the counts.
        </div>

        If a pipeline has {@code rasterizerDiscardEnable} enabled, implementations <b>may</b> discard primitives after the final vertex processing stage. As a result, if {@code rasterizerDiscardEnable} is enabled, the clipping input and output primitives counters <b>may</b> not be incremented.

        When a pipeline statistics query finishes, the result for that query is marked as available. The application <b>can</b> copy the result to a buffer (via {@code vkCmdCopyQueryPoolResults}), or request it be put into host memory (via {@code vkGetQueryPoolResults}).

        <h5>See Also</h5>
        {@code VkQueryPipelineStatisticFlags}
        """,

        "QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT".enum(0x00000001),
        "QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT".enum(0x00000002),
        "QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT".enum(0x00000004),
        "QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT".enum(0x00000008),
        "QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT".enum(0x00000010),
        "QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT".enum(0x00000020),
        "QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT".enum(0x00000040),
        "QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT".enum(0x00000080),
        "QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT".enum(0x00000100),
        "QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT".enum(0x00000200),
        "QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT".enum(0x00000400)
    )

    EnumConstant(
        """
        VkQueryResultFlagBits - Bitmask specifying how and when query results are returned

        <h5>Description</h5>
        <ul>
            <li>#QUERY_RESULT_64_BIT specifies the results will be written as an array of 64-bit unsigned integer values. If this bit is not set, the results will be written as an array of 32-bit unsigned integer values.</li>
            <li>#QUERY_RESULT_WAIT_BIT specifies that Vulkan will wait for each query&#8217;s status to become available before retrieving its results.</li>
            <li>#QUERY_RESULT_WITH_AVAILABILITY_BIT specifies that the availability status accompanies the results.</li>
            <li>#QUERY_RESULT_PARTIAL_BIT specifies that returning partial results is acceptable.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkQueryResultFlags}
        """,

        "QUERY_RESULT_64_BIT".enum(0x00000001),
        "QUERY_RESULT_WAIT_BIT".enum(0x00000002),
        "QUERY_RESULT_WITH_AVAILABILITY_BIT".enum(0x00000004),
        "QUERY_RESULT_PARTIAL_BIT".enum(0x00000008)
    )

    EnumConstant(
        """
        VkBufferCreateFlagBits - Bitmask specifying additional parameters of a buffer

        <h5>Description</h5>
        <ul>
            <li>#BUFFER_CREATE_SPARSE_BINDING_BIT specifies that the buffer will be backed using sparse memory binding.</li>
            <li>#BUFFER_CREATE_SPARSE_RESIDENCY_BIT specifies that the buffer <b>can</b> be partially backed using sparse memory binding. Buffers created with this flag <b>must</b> also be created with the #BUFFER_CREATE_SPARSE_BINDING_BIT flag.</li>
            <li>#BUFFER_CREATE_SPARSE_ALIASED_BIT specifies that the buffer will be backed using sparse memory binding with memory ranges that might also simultaneously be backing another buffer (or another portion of the same buffer). Buffers created with this flag <b>must</b> also be created with the #BUFFER_CREATE_SPARSE_BINDING_BIT flag.</li>
            <li>#BUFFER_CREATE_PROTECTED_BIT specifies that the buffer is a protected buffer.</li>
            <li>#BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT specifies that the buffer&#8217;s address <b>can</b> be saved and reused on a subsequent run (e.g. for trace capture and replay), see ##VkBufferOpaqueCaptureAddressCreateInfo for more detail.</li>
        </ul>

        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#sparsememory-sparseresourcefeatures">Sparse Resource Features</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features">Physical Device Features</a> for details of the sparse memory features supported on a device.

        <h5>See Also</h5>
        {@code VkBufferCreateFlags}
        """,

        "BUFFER_CREATE_SPARSE_BINDING_BIT".enum(0x00000001),
        "BUFFER_CREATE_SPARSE_RESIDENCY_BIT".enum(0x00000002),
        "BUFFER_CREATE_SPARSE_ALIASED_BIT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkBufferUsageFlagBits - Bitmask specifying allowed usage of a buffer

        <h5>Description</h5>
        <ul>
            <li>#BUFFER_USAGE_TRANSFER_SRC_BIT specifies that the buffer <b>can</b> be used as the source of a <em>transfer command</em> (see the definition of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-transfer">#PIPELINE_STAGE_TRANSFER_BIT</a>).</li>
            <li>#BUFFER_USAGE_TRANSFER_DST_BIT specifies that the buffer <b>can</b> be used as the destination of a transfer command.</li>
            <li>#BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT specifies that the buffer <b>can</b> be used to create a {@code VkBufferView} suitable for occupying a {@code VkDescriptorSet} slot of type #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER.</li>
            <li>#BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT specifies that the buffer <b>can</b> be used to create a {@code VkBufferView} suitable for occupying a {@code VkDescriptorSet} slot of type #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER.</li>
            <li>#BUFFER_USAGE_UNIFORM_BUFFER_BIT specifies that the buffer <b>can</b> be used in a ##VkDescriptorBufferInfo suitable for occupying a {@code VkDescriptorSet} slot either of type #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC.</li>
            <li>#BUFFER_USAGE_STORAGE_BUFFER_BIT specifies that the buffer <b>can</b> be used in a ##VkDescriptorBufferInfo suitable for occupying a {@code VkDescriptorSet} slot either of type #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC.</li>
            <li>#BUFFER_USAGE_INDEX_BUFFER_BIT specifies that the buffer is suitable for passing as the {@code buffer} parameter to {@code vkCmdBindIndexBuffer}.</li>
            <li>#BUFFER_USAGE_VERTEX_BUFFER_BIT specifies that the buffer is suitable for passing as an element of the {@code pBuffers} array to {@code vkCmdBindVertexBuffers}.</li>
            <li>#BUFFER_USAGE_INDIRECT_BUFFER_BIT specifies that the buffer is suitable for passing as the {@code buffer} parameter to {@code vkCmdDrawIndirect}, {@code vkCmdDrawIndexedIndirect}, {@code vkCmdDrawMeshTasksIndirectNV}, {@code vkCmdDrawMeshTasksIndirectCountNV}, or {@code vkCmdDispatchIndirect}. It is also suitable for passing as the {@code buffer} member of ##VkIndirectCommandsTokenNVX, or {@code sequencesCountBuffer} or {@code sequencesIndexBuffer} member of ##VkCmdProcessCommandsInfoNVX</li>
            <li>#BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT specifies that the buffer is suitable for passing as the {@code buffer} parameter to #CmdBeginConditionalRenderingEXT().</li>
            <li>#BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT specifies that the buffer is suitable for using for binding as a transform feedback buffer with #CmdBindTransformFeedbackBuffersEXT().</li>
            <li>#BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT specifies that the buffer is suitable for using as a counter buffer with #CmdBeginTransformFeedbackEXT() and #CmdEndTransformFeedbackEXT().</li>
            <li>#BUFFER_USAGE_RAY_TRACING_BIT_NV specifies that the buffer is suitable for use in #CmdTraceRaysNV() and #CmdBuildAccelerationStructureNV().</li>
            <li>#BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT specifies that the buffer <b>can</b> be used to retrieve a buffer device address via #GetBufferDeviceAddress() and use that address to access the buffer&#8217;s memory from a shader.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkBufferUsageFlags}
        """,

        "BUFFER_USAGE_TRANSFER_SRC_BIT".enum(0x00000001),
        "BUFFER_USAGE_TRANSFER_DST_BIT".enum(0x00000002),
        "BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT".enum(0x00000004),
        "BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT".enum(0x00000008),
        "BUFFER_USAGE_UNIFORM_BUFFER_BIT".enum(0x00000010),
        "BUFFER_USAGE_STORAGE_BUFFER_BIT".enum(0x00000020),
        "BUFFER_USAGE_INDEX_BUFFER_BIT".enum(0x00000040),
        "BUFFER_USAGE_VERTEX_BUFFER_BIT".enum(0x00000080),
        "BUFFER_USAGE_INDIRECT_BUFFER_BIT".enum(0x00000100)
    )

    EnumConstant(
        """
        VkSharingMode - Buffer and image sharing modes

        <h5>Description</h5>
        <ul>
            <li>#SHARING_MODE_EXCLUSIVE specifies that access to any range or image subresource of the object will be exclusive to a single queue family at a time.</li>
            <li>#SHARING_MODE_CONCURRENT specifies that concurrent access to any range or image subresource of the object from multiple queue families is supported.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        #SHARING_MODE_CONCURRENT <b>may</b> result in lower performance access to the buffer or image than #SHARING_MODE_EXCLUSIVE.
        </div>

        Ranges of buffers and image subresources of image objects created using #SHARING_MODE_EXCLUSIVE <b>must</b> only be accessed by queues in the queue family that has <em>ownership</em> of the resource. Upon creation, such resources are not owned by any queue family; ownership is implicitly acquired upon first use within a queue. Once a resource using #SHARING_MODE_EXCLUSIVE is owned by some queue family, the application <b>must</b> perform a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> to make the memory contents of a range or image subresource accessible to a different queue family.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Images still require a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-layouts">layout transition</a> from #IMAGE_LAYOUT_UNDEFINED or #IMAGE_LAYOUT_PREINITIALIZED before being used on the first queue.
        </div>

        A queue family <b>can</b> take ownership of an image subresource or buffer range of a resource created with #SHARING_MODE_EXCLUSIVE, without an ownership transfer, in the same way as for a resource that was just created; however, taking ownership in this way has the effect that the contents of the image subresource or buffer range are undefined.

        Ranges of buffers and image subresources of image objects created using #SHARING_MODE_CONCURRENT <b>must</b> only be accessed by queues from the queue families specified through the {@code queueFamilyIndexCount} and {@code pQueueFamilyIndices} members of the corresponding create info structures.

        <h5>See Also</h5>
        ##VkBufferCreateInfo, ##VkImageCreateInfo, ##VkPhysicalDeviceImageDrmFormatModifierInfoEXT, ##VkSwapchainCreateInfoKHR
        """,

        "SHARING_MODE_EXCLUSIVE".."0",
        "SHARING_MODE_CONCURRENT".."1"
    )

    EnumConstant(
        """
        VkImageLayout - Layout of image and image subresources

        <h5>Description</h5>
        The type(s) of device access supported by each layout are:

        <ul>
            <li>#IMAGE_LAYOUT_UNDEFINED does not support device access. This layout <b>must</b> only be used as the {@code initialLayout} member of ##VkImageCreateInfo or ##VkAttachmentDescription, or as the {@code oldLayout} in an image transition. When transitioning out of this layout, the contents of the memory are not guaranteed to be preserved.</li>
            <li>#IMAGE_LAYOUT_PREINITIALIZED does not support device access. This layout <b>must</b> only be used as the {@code initialLayout} member of ##VkImageCreateInfo or ##VkAttachmentDescription, or as the {@code oldLayout} in an image transition. When transitioning out of this layout, the contents of the memory are preserved. This layout is intended to be used as the initial layout for an image whose contents are written by the host, and hence the data <b>can</b> be written to memory immediately, without first executing a layout transition. Currently, #IMAGE_LAYOUT_PREINITIALIZED is only useful with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#glossary-linear-resource">linear</a> images because there is not a standard layout defined for #IMAGE_TILING_OPTIMAL images.</li>
            <li>#IMAGE_LAYOUT_GENERAL supports all types of device access.</li>
            <li>#IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL <b>must</b> only be used as a color or resolve attachment in a {@code VkFramebuffer}. This layout is valid only for image subresources of images created with the #IMAGE_USAGE_COLOR_ATTACHMENT_BIT usage bit enabled.</li>
            <li>#IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL specifies a layout for both the depth and stencil aspects of a depth/stencil format image allowing read and write access as a depth/stencil attachment. It is equivalent to #IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL and #IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL.</li>
            <li>#IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL specifies a layout for both the depth and stencil aspects of a depth/stencil format image allowing read only access as a depth/stencil attachment or in shaders. It is equivalent to #IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL and #IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL.</li>
            <li>#IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL specifies a layout for depth/stencil format images allowing read and write access to the stencil aspect as a stencil attachment, and read only access to the depth aspect as a depth attachment or in shaders. It is equivalent to #IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL and #IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL.</li>
            <li>#IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL specifies a layout for depth/stencil format images allowing read and write access to the depth aspect as a depth attachment, and read only access to the stencil aspect as a stencil attachment or in shaders. It is equivalent to #IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL and #IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL.</li>
            <li>#IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL specifies a layout for the depth aspect of a depth/stencil format image allowing read and write access as a depth attachment.</li>
            <li>#IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL specifies a layout for the depth aspect of a depth/stencil format image allowing read-only access as a depth attachment or in shaders.</li>
            <li>#IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL specifies a layout for the stencil aspect of a depth/stencil format image allowing read and write access as a stencil attachment.</li>
            <li>#IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL specifies a layout for the stencil aspect of a depth/stencil format image allowing read-only access as a stencil attachment or in shaders.</li>
            <li>#IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL <b>must</b> only be used as a read-only image in a shader (which <b>can</b> be read as a sampled image, combined image/sampler and/or input attachment). This layout is valid only for image subresources of images created with the #IMAGE_USAGE_SAMPLED_BIT or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT usage bit enabled.</li>
            <li>#IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL <b>must</b> only be used as a source image of a transfer command (see the definition of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-transfer">#PIPELINE_STAGE_TRANSFER_BIT</a>). This layout is valid only for image subresources of images created with the #IMAGE_USAGE_TRANSFER_SRC_BIT usage bit enabled.</li>
            <li>#IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL <b>must</b> only be used as a destination image of a transfer command. This layout is valid only for image subresources of images created with the #IMAGE_USAGE_TRANSFER_DST_BIT usage bit enabled.</li>
            <li>#IMAGE_LAYOUT_PRESENT_SRC_KHR <b>must</b> only be used for presenting a presentable image for display. A swapchain&#8217;s image <b>must</b> be transitioned to this layout before calling #QueuePresentKHR(), and <b>must</b> be transitioned away from this layout after calling #AcquireNextImageKHR().</li>
            <li>#IMAGE_LAYOUT_SHARED_PRESENT_KHR is valid only for shared presentable images, and <b>must</b> be used for any usage the image supports.</li>
            <li>#IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV <b>must</b> only be used as a read-only <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#primsrast-shading-rate-image">shading-rate-image</a>. This layout is valid only for image subresources of images created with the #IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV usage bit enabled.</li>
            <li>#IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT <b>must</b> only be used as a fragment density map attachment in a {@code VkRenderPass}. This layout is valid only for image subresources of images created with the #IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT usage bit enabled.</li>
        </ul>

        The layout of each image subresource is not a state of the image subresource itself, but is rather a property of how the data in memory is organized, and thus for each mechanism of accessing an image in the API the application <b>must</b> specify a parameter or structure member that indicates which image layout the image subresource(s) are considered to be in when the image will be accessed. For transfer commands, this is a parameter to the command (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#clears">Clear Commands</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies">Copy Commands</a>). For use as a framebuffer attachment, this is a member in the substructures of the ##VkRenderPassCreateInfo (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass">Render Pass</a>). For use in a descriptor set, this is a member in the ##VkDescriptorImageInfo structure (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-updates">Descriptor Set Updates</a>).

        <h5>See Also</h5>
        ##VkAttachmentDescription, ##VkAttachmentDescription2, ##VkAttachmentDescriptionStencilLayout, ##VkAttachmentReference, ##VkAttachmentReference2, ##VkAttachmentReferenceStencilLayout, ##VkDescriptorImageInfo, ##VkImageCreateInfo, ##VkImageMemoryBarrier, #CmdBindShadingRateImageNV(), #CmdBlitImage(), #CmdClearColorImage(), #CmdClearDepthStencilImage(), #CmdCopyBufferToImage(), #CmdCopyImage(), #CmdCopyImageToBuffer(), #CmdResolveImage()
        """,

        "IMAGE_LAYOUT_UNDEFINED".."0",
        "IMAGE_LAYOUT_GENERAL".."1",
        "IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL".."2",
        "IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL".."3",
        "IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL".."4",
        "IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL".."5",
        "IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL".."6",
        "IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL".."7",
        "IMAGE_LAYOUT_PREINITIALIZED".."8"
    )

    EnumConstant(
        """
        VkImageViewType - Image view types

        <h5>Description</h5>
        The exact image view type is partially implicit, based on the image's type and sample count, as well as the view creation parameters as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-views-compatibility">image view compatibility table</a> for #CreateImageView(). This table also shows which SPIR-V {@code OpTypeImage} {@code Dim} and {@code Arrayed} parameters correspond to each image view type.

        <h5>See Also</h5>
        ##VkImageViewCreateInfo, ##VkPhysicalDeviceImageViewImageFormatInfoEXT
        """,

        "IMAGE_VIEW_TYPE_1D".."0",
        "IMAGE_VIEW_TYPE_2D".."1",
        "IMAGE_VIEW_TYPE_3D".."2",
        "IMAGE_VIEW_TYPE_CUBE".."3",
        "IMAGE_VIEW_TYPE_1D_ARRAY".."4",
        "IMAGE_VIEW_TYPE_2D_ARRAY".."5",
        "IMAGE_VIEW_TYPE_CUBE_ARRAY".."6"
    )

    EnumConstant(
        """
        VkComponentSwizzle - Specify how a component is swizzled

        <h5>Description</h5>
        <ul>
            <li>#COMPONENT_SWIZZLE_IDENTITY specifies that the component is set to the identity swizzle.</li>
            <li>#COMPONENT_SWIZZLE_ZERO specifies that the component is set to zero.</li>
            <li>#COMPONENT_SWIZZLE_ONE specifies that the component is set to either 1 or 1.0, depending on whether the type of the image view format is integer or floating-point respectively, as determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-definition">Format Definition</a> section for each {@code VkFormat}.</li>
            <li>#COMPONENT_SWIZZLE_R specifies that the component is set to the value of the R component of the image.</li>
            <li>#COMPONENT_SWIZZLE_G specifies that the component is set to the value of the G component of the image.</li>
            <li>#COMPONENT_SWIZZLE_B specifies that the component is set to the value of the B component of the image.</li>
            <li>#COMPONENT_SWIZZLE_A specifies that the component is set to the value of the A component of the image.</li>
        </ul>

        Setting the identity swizzle on a component is equivalent to setting the identity mapping on that component. That is:

        <h6>Component Mappings Equivalent To #COMPONENT_SWIZZLE_IDENTITY</h6>
        <table class="lwjgl">
            <thead><tr><th>Component</th><th>Identity Mapping</th></tr></thead>
            <tbody>
                <tr><td>{@code components.r}</td><td>#COMPONENT_SWIZZLE_R</td></tr>
                <tr><td>{@code components.g}</td><td>#COMPONENT_SWIZZLE_G</td></tr>
                <tr><td>{@code components.b}</td><td>#COMPONENT_SWIZZLE_B</td></tr>
                <tr><td>{@code components.a}</td><td>#COMPONENT_SWIZZLE_A</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##VkComponentMapping
        """,

        "COMPONENT_SWIZZLE_IDENTITY".."0",
        "COMPONENT_SWIZZLE_ZERO".."1",
        "COMPONENT_SWIZZLE_ONE".."2",
        "COMPONENT_SWIZZLE_R".."3",
        "COMPONENT_SWIZZLE_G".."4",
        "COMPONENT_SWIZZLE_B".."5",
        "COMPONENT_SWIZZLE_A".."6"
    )

    EnumConstant(
        """
        VkPipelineCreateFlagBits - Bitmask controlling how a pipeline is created

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT specifies that the created pipeline will not be optimized. Using this flag <b>may</b> reduce the time taken to create the pipeline.</li>
            <li>#PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT specifies that the pipeline to be created is allowed to be the parent of a pipeline that will be created in a subsequent call to #CreateGraphicsPipelines() or #CreateComputePipelines().</li>
            <li>#PIPELINE_CREATE_DERIVATIVE_BIT specifies that the pipeline to be created will be a child of a previously created parent pipeline.</li>
            <li>#PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT specifies that any shader input variables decorated as {@code ViewIndex} will be assigned values as if they were decorated as {@code DeviceIndex}.</li>
            <li>#PIPELINE_CREATE_DISPATCH_BASE specifies that a compute pipeline <b>can</b> be used with #CmdDispatchBase() with a non-zero base workgroup.</li>
            <li>#PIPELINE_CREATE_DEFER_COMPILE_BIT_NV specifies that a pipeline is created with all shaders in the deferred state. Before using the pipeline the application <b>must</b> call #CompileDeferredNV() exactly once on each shader in the pipeline before using the pipeline.</li>
            <li>#PIPELINE_CREATE_CAPTURE_STATISTICS_BIT_KHR specifies that the shader compiler should capture statistics for the executables produced by the compile process which <b>can</b> later be retrieved by calling #GetPipelineExecutableStatisticsKHR(). Enabling this flag <b>must</b> not affect the final compiled pipeline but <b>may</b> disable pipeline caching or otherwise affect pipeline creation time.</li>
            <li>#PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR specifies that the shader compiler should capture the internal representations of executables produced by the compile process which <b>can</b> later be retrieved by calling #GetPipelineExecutableInternalRepresentationsKHR(). Enabling this flag <b>must</b> not affect the final compiled pipeline but <b>may</b> disable pipeline caching or otherwise affect pipeline creation time.</li>
        </ul>

        It is valid to set both #PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT and #PIPELINE_CREATE_DERIVATIVE_BIT. This allows a pipeline to be both a parent and possibly a child in a pipeline hierarchy. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#pipelines-pipeline-derivatives">Pipeline Derivatives</a> for more information.

        <h5>See Also</h5>
        {@code VkPipelineCreateFlags}
        """,

        "PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT".enum(0x00000001),
        "PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT".enum(0x00000002),
        "PIPELINE_CREATE_DERIVATIVE_BIT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkShaderStageFlagBits - Bitmask specifying a pipeline stage

        <h5>Description</h5>
        <ul>
            <li>#SHADER_STAGE_VERTEX_BIT specifies the vertex stage.</li>
            <li>#SHADER_STAGE_TESSELLATION_CONTROL_BIT specifies the tessellation control stage.</li>
            <li>#SHADER_STAGE_TESSELLATION_EVALUATION_BIT specifies the tessellation evaluation stage.</li>
            <li>#SHADER_STAGE_GEOMETRY_BIT specifies the geometry stage.</li>
            <li>#SHADER_STAGE_FRAGMENT_BIT specifies the fragment stage.</li>
            <li>#SHADER_STAGE_COMPUTE_BIT specifies the compute stage.</li>
            <li>#SHADER_STAGE_ALL_GRAPHICS is a combination of bits used as shorthand to specify all graphics stages defined above (excluding the compute stage).</li>
            <li>#SHADER_STAGE_ALL is a combination of bits used as shorthand to specify all shader stages supported by the device, including all additional stages which are introduced by extensions.</li>
            <li>#SHADER_STAGE_TASK_BIT_NV specifies the task stage.</li>
            <li>#SHADER_STAGE_MESH_BIT_NV specifies the mesh stage.</li>
            <li>#SHADER_STAGE_RAYGEN_BIT_NV specifies the ray generation stage.</li>
            <li>#SHADER_STAGE_ANY_HIT_BIT_NV specifies the any-hit stage.</li>
            <li>#SHADER_STAGE_CLOSEST_HIT_BIT_NV specifies the closest hit stage.</li>
            <li>#SHADER_STAGE_MISS_BIT_NV specifies the miss stage.</li>
            <li>#SHADER_STAGE_INTERSECTION_BIT_NV specifies the intersection stage.</li>
            <li>#SHADER_STAGE_CALLABLE_BIT_NV specifies the callable stage.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        #SHADER_STAGE_ALL_GRAPHICS only includes the original five graphics stages included in Vulkan 1.0, and not any stages added by extensions. Thus, it may not have the desired effect in all cases.
        </div>

        <h5>See Also</h5>
        ##VkPipelineShaderStageCreateInfo, {@code VkShaderStageFlags}, #GetShaderInfoAMD()
        """,

        "SHADER_STAGE_VERTEX_BIT".enum(0x00000001),
        "SHADER_STAGE_TESSELLATION_CONTROL_BIT".enum(0x00000002),
        "SHADER_STAGE_TESSELLATION_EVALUATION_BIT".enum(0x00000004),
        "SHADER_STAGE_GEOMETRY_BIT".enum(0x00000008),
        "SHADER_STAGE_FRAGMENT_BIT".enum(0x00000010),
        "SHADER_STAGE_COMPUTE_BIT".enum(0x00000020),
        "SHADER_STAGE_ALL_GRAPHICS".."0x0000001F",
        "SHADER_STAGE_ALL".."0x7FFFFFFF"
    )

    EnumConstant(
        """
        VkVertexInputRate - Specify rate at which vertex attributes are pulled from buffers

        <h5>Description</h5>
        <ul>
            <li>#VERTEX_INPUT_RATE_VERTEX specifies that vertex attribute addressing is a function of the vertex index.</li>
            <li>#VERTEX_INPUT_RATE_INSTANCE specifies that vertex attribute addressing is a function of the instance index.</li>
        </ul>

        <h5>See Also</h5>
        ##VkVertexInputBindingDescription
        """,

        "VERTEX_INPUT_RATE_VERTEX".."0",
        "VERTEX_INPUT_RATE_INSTANCE".."1"
    )

    EnumConstant(
        """
        VkPrimitiveTopology - Supported primitive topologies

        <h5>Description</h5>
        <ul>
            <li>#PRIMITIVE_TOPOLOGY_POINT_LIST specifies a series of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#drawing-point-lists">separate point primitives</a>.</li>
            <li>#PRIMITIVE_TOPOLOGY_LINE_LIST specifies a series of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#drawing-line-lists">separate line primitives</a>.</li>
            <li>#PRIMITIVE_TOPOLOGY_LINE_STRIP specifies a series of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#drawing-line-strips">connected line primitives</a> with consecutive lines sharing a vertex.</li>
            <li>#PRIMITIVE_TOPOLOGY_TRIANGLE_LIST specifies a series of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#drawing-triangle-lists">separate triangle primitives</a>.</li>
            <li>#PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP specifies a series of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#drawing-triangle-strips">connected triangle primitives</a> with consecutive triangles sharing an edge.</li>
            <li>#PRIMITIVE_TOPOLOGY_TRIANGLE_FAN specifies a series of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#drawing-triangle-fans">connected triangle primitives</a> with all triangles sharing a common vertex.</li>
            <li>#PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY specifies a series of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#drawing-line-lists-with-adjacency">separate line primitives with adjacency</a>.</li>
            <li>#PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY specifies a series of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#drawing-line-strips-with-adjacency">connected line primitives with adjacency</a>, with consecutive primitives sharing three vertices.</li>
            <li>#PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY specifies a series of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#drawing-triangle-lists-with-adjacency">separate triangle primitives with adjacency</a>.</li>
            <li>#PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY specifies <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#drawing-triangle-strips-with-adjacency">connected triangle primitives with adjacency</a>, with consecutive triangles sharing an edge.</li>
            <li>#PRIMITIVE_TOPOLOGY_PATCH_LIST specifies <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#drawing-patch-lists">separate patch primitives</a>.</li>
        </ul>

        Each primitive topology, and its construction from a list of vertices, is described in detail below with a supporting diagram, according to the following key:

        <table class="lwjgl">
            <tbody>
                <tr><td><img src="https://raw.githubusercontent.com/KhronosGroup/Vulkan-Docs/master/images/primitive_topology_key_vertex.svg?sanitize=true" alt="primitive topology key vertex"></td><td>Vertex</td><td>A point in 3-dimensional space. Positions chosen within the diagrams are arbitrary and for illustration only.</td></tr>
                <tr><td><img src="https://raw.githubusercontent.com/KhronosGroup/Vulkan-Docs/master/images/primitive_topology_key_vertex_number.svg?sanitize=true" alt="primitive topology key vertex number"></td><td>Vertex Number</td><td>Sequence position of a vertex within the provided vertex data.</td></tr>
                <tr><td><img src="https://raw.githubusercontent.com/KhronosGroup/Vulkan-Docs/master/images/primitive_topology_key_provoking_vertex.svg?sanitize=true" alt="primitive topology key provoking vertex"></td><td>Provoking Vertex</td><td>Provoking vertex within the main primitive. The arrow points along an edge of the relevant primitive, following winding order. Used in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vertexpostproc-flatshading">flat shading</a>.</td></tr>
                <tr><td><img src="https://raw.githubusercontent.com/KhronosGroup/Vulkan-Docs/master/images/primitive_topology_key_edge.svg?sanitize=true" alt="primitive topology key edge"></td><td>Primitive Edge</td><td>An edge connecting the points of a main primitive.</td></tr>
                <tr><td><img src="https://raw.githubusercontent.com/KhronosGroup/Vulkan-Docs/master/images/primitive_topology_key_adjacency_edge.svg?sanitize=true" alt="primitive topology key adjacency edge"></td><td>Adjacency Edge</td><td>Points connected by these lines do not contribute to a main primitive, and are only accessible in a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#geometry">geometry shader</a>.</td></tr>
                <tr><td><img src="https://raw.githubusercontent.com/KhronosGroup/Vulkan-Docs/master/images/primitive_topology_key_winding_order.svg?sanitize=true" alt="primitive topology key winding order"></td><td>Winding Order</td><td>The relative order in which vertices are defined within a primitive, used in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#primsrast-polygons-basic">facing determination</a>. This ordering has no specific start or end point.</td></tr>
            </tbody>
        </table>

        The diagrams are supported with mathematical definitions where the vertices (<code>v</code>) and primitives (<code>p</code>) are numbered starting from <code>0</code>; <code>v<sub>0</sub></code> is the first vertex in the provided data and <code>p<sub>0</sub></code> is the first primitive in the set of primitives defined by the vertices and topology.

        <h5>See Also</h5>
        ##VkPipelineInputAssemblyStateCreateInfo
        """,

        "PRIMITIVE_TOPOLOGY_POINT_LIST".."0",
        "PRIMITIVE_TOPOLOGY_LINE_LIST".."1",
        "PRIMITIVE_TOPOLOGY_LINE_STRIP".."2",
        "PRIMITIVE_TOPOLOGY_TRIANGLE_LIST".."3",
        "PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP".."4",
        "PRIMITIVE_TOPOLOGY_TRIANGLE_FAN".."5",
        "PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY".."6",
        "PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY".."7",
        "PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY".."8",
        "PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY".."9",
        "PRIMITIVE_TOPOLOGY_PATCH_LIST".."10"
    )

    EnumConstant(
        """
        VkPolygonMode - Control polygon rasterization mode

        <h5>Description</h5>
        <ul>
            <li>#POLYGON_MODE_POINT specifies that polygon vertices are drawn as points.</li>
            <li>#POLYGON_MODE_LINE specifies that polygon edges are drawn as line segments.</li>
            <li>#POLYGON_MODE_FILL specifies that polygons are rendered using the polygon rasterization rules in this section.</li>
            <li>
                #POLYGON_MODE_FILL_RECTANGLE_NV specifies that polygons are rendered using polygon rasterization rules, modified to consider a sample within the primitive if the sample location is inside the axis-aligned bounding box of the triangle after projection. Note that the barycentric weights used in attribute interpolation <b>can</b> extend outside the range <code>[0,1]</code> when these primitives are shaded. Special treatment is given to a sample position on the boundary edge of the bounding box. In such a case, if two rectangles lie on either side of a common edge (with identical endpoints) on which a sample position lies, then exactly one of the triangles <b>must</b> produce a fragment that covers that sample during rasterization.
                Polygons rendered in #POLYGON_MODE_FILL_RECTANGLE_NV mode <b>may</b> be     clipped by the frustum or by user clip planes.     If clipping is applied, the triangle is culled rather than clipped.

                Area calculation and facingness are determined for     #POLYGON_MODE_FILL_RECTANGLE_NV mode using the triangle's     vertices.
            </li>
        </ul>

        These modes affect only the final rasterization of polygons: in particular, a polygon's vertices are shaded and the polygon is clipped and possibly culled before these modes are applied.

        <h5>See Also</h5>
        ##VkPipelineRasterizationStateCreateInfo
        """,

        "POLYGON_MODE_FILL".."0",
        "POLYGON_MODE_LINE".."1",
        "POLYGON_MODE_POINT".."2"
    )

    EnumConstant(
        """
        VkCullModeFlagBits - Bitmask controlling triangle culling

        <h5>Description</h5>
        <ul>
            <li>#CULL_MODE_NONE specifies that no triangles are discarded</li>
            <li>#CULL_MODE_FRONT_BIT specifies that front-facing triangles are discarded</li>
            <li>#CULL_MODE_BACK_BIT specifies that back-facing triangles are discarded</li>
            <li>#CULL_MODE_FRONT_AND_BACK specifies that all triangles are discarded.</li>
        </ul>

        Following culling, fragments are produced for any triangles which have not been discarded.

        <h5>See Also</h5>
        {@code VkCullModeFlags}
        """,

        "CULL_MODE_NONE".."0",
        "CULL_MODE_FRONT_BIT".enum(0x00000001),
        "CULL_MODE_BACK_BIT".enum(0x00000002),
        "CULL_MODE_FRONT_AND_BACK".."0x00000003"
    )

    EnumConstant(
        """
        VkFrontFace - Interpret polygon front-facing orientation

        <h5>Description</h5>
        <ul>
            <li>#FRONT_FACE_COUNTER_CLOCKWISE specifies that a triangle with positive area is considered front-facing.</li>
            <li>#FRONT_FACE_CLOCKWISE specifies that a triangle with negative area is considered front-facing.</li>
        </ul>

        Any triangle which is not front-facing is back-facing, including zero-area triangles.

        <h5>See Also</h5>
        ##VkPipelineRasterizationStateCreateInfo
        """,

        "FRONT_FACE_COUNTER_CLOCKWISE".."0",
        "FRONT_FACE_CLOCKWISE".."1"
    )

    EnumConstant(
        """
        VkCompareOp - Stencil comparison function

        <h5>Description</h5>
        <ul>
            <li>#COMPARE_OP_NEVER specifies that the test never passes.</li>
            <li>#COMPARE_OP_LESS specifies that the test passes when <code>R &lt; S</code>.</li>
            <li>#COMPARE_OP_EQUAL specifies that the test passes when <code>R = S</code>.</li>
            <li>#COMPARE_OP_LESS_OR_EQUAL specifies that the test passes when <code>R ≤ S</code>.</li>
            <li>#COMPARE_OP_GREATER specifies that the test passes when <code>R &gt; S</code>.</li>
            <li>#COMPARE_OP_NOT_EQUAL specifies that the test passes when <code>R ≠ S</code>.</li>
            <li>#COMPARE_OP_GREATER_OR_EQUAL specifies that the test passes when <code>R ≥ S</code>.</li>
            <li>#COMPARE_OP_ALWAYS specifies that the test always passes.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineDepthStencilStateCreateInfo, ##VkSamplerCreateInfo, ##VkStencilOpState
        """,

        "COMPARE_OP_NEVER".."0",
        "COMPARE_OP_LESS".."1",
        "COMPARE_OP_EQUAL".."2",
        "COMPARE_OP_LESS_OR_EQUAL".."3",
        "COMPARE_OP_GREATER".."4",
        "COMPARE_OP_NOT_EQUAL".."5",
        "COMPARE_OP_GREATER_OR_EQUAL".."6",
        "COMPARE_OP_ALWAYS".."7"
    )

    EnumConstant(
        """
        VkStencilOp - Stencil comparison function

        <h5>Description</h5>
        <ul>
            <li>#STENCIL_OP_KEEP keeps the current value.</li>
            <li>#STENCIL_OP_ZERO sets the value to 0.</li>
            <li>#STENCIL_OP_REPLACE sets the value to {@code reference}.</li>
            <li>#STENCIL_OP_INCREMENT_AND_CLAMP increments the current value and clamps to the maximum representable unsigned value.</li>
            <li>#STENCIL_OP_DECREMENT_AND_CLAMP decrements the current value and clamps to 0.</li>
            <li>#STENCIL_OP_INVERT bitwise-inverts the current value.</li>
            <li>#STENCIL_OP_INCREMENT_AND_WRAP increments the current value and wraps to 0 when the maximum value would have been exceeded.</li>
            <li>#STENCIL_OP_DECREMENT_AND_WRAP decrements the current value and wraps to the maximum possible value when the value would go below 0.</li>
        </ul>

        For purposes of increment and decrement, the stencil bits are considered as an unsigned integer.

        If the stencil test fails, the sample's coverage bit is cleared in the fragment. If there is no stencil framebuffer attachment, stencil modification <b>cannot</b> occur, and it is as if the stencil tests always pass.

        If the stencil test passes, the {@code writeMask} member of the ##VkStencilOpState structures controls how the updated stencil value is written to the stencil framebuffer attachment.

        The least significant <code>s</code> bits of {@code writeMask}, where <code>s</code> is the number of bits in the stencil framebuffer attachment, specify an integer mask. Where a <code>1</code> appears in this mask, the corresponding bit in the stencil value in the depth/stencil attachment is written; where a <code>0</code> appears, the bit is not written. The {@code writeMask} value uses either the front-facing or back-facing state based on the facingness of the fragment. Fragments generated by front-facing primitives use the front mask and fragments generated by back-facing primitives use the back mask.

        <h5>See Also</h5>
        ##VkStencilOpState
        """,

        "STENCIL_OP_KEEP".."0",
        "STENCIL_OP_ZERO".."1",
        "STENCIL_OP_REPLACE".."2",
        "STENCIL_OP_INCREMENT_AND_CLAMP".."3",
        "STENCIL_OP_DECREMENT_AND_CLAMP".."4",
        "STENCIL_OP_INVERT".."5",
        "STENCIL_OP_INCREMENT_AND_WRAP".."6",
        "STENCIL_OP_DECREMENT_AND_WRAP".."7"
    )

    EnumConstant(
        """
        VkLogicOp - Framebuffer logical operations

        <h5>Description</h5>
        

        The logical operations supported by Vulkan are summarized in the following table in which

        <ul>
            <li><code>¬</code> is bitwise invert,</li>
            <li><code>∧</code> is bitwise and,</li>
            <li><code>∨</code> is bitwise or,</li>
            <li><code>⊕</code> is bitwise exclusive or,</li>
            <li><code>s</code> is the fragment&#8217;s <code>R<sub>s0</sub>, G<sub>s0</sub>, B<sub>s0</sub></code> or <code>A<sub>s0</sub></code> component value for the fragment output corresponding to the color attachment being updated, and</li>
            <li><code>d</code> is the color attachment&#8217;s <code>R, G, B</code> or <code>A</code> component value:</li>
        </ul>

        <h6>Logical Operations</h6>
        <table class="lwjgl">
            <thead><tr><th>Mode</th><th>Operation</th></tr></thead>
            <tbody>
                <tr><td>#LOGIC_OP_CLEAR</td><td><code>0</code></td></tr>
                <tr><td>#LOGIC_OP_AND</td><td><code>s ∧ d</code></td></tr>
                <tr><td>#LOGIC_OP_AND_REVERSE</td><td><code>s ∧ ¬ d</code></td></tr>
                <tr><td>#LOGIC_OP_COPY</td><td><code>s</code></td></tr>
                <tr><td>#LOGIC_OP_AND_INVERTED</td><td><code>¬ s ∧ d</code></td></tr>
                <tr><td>#LOGIC_OP_NO_OP</td><td><code>d</code></td></tr>
                <tr><td>#LOGIC_OP_XOR</td><td><code>s ⊕ d</code></td></tr>
                <tr><td>#LOGIC_OP_OR</td><td><code>s ∨ d</code></td></tr>
                <tr><td>#LOGIC_OP_NOR</td><td><code>¬ (s ∨ d)</code></td></tr>
                <tr><td>#LOGIC_OP_EQUIVALENT</td><td><code>¬ (s ⊕ d)</code></td></tr>
                <tr><td>#LOGIC_OP_INVERT</td><td><code>¬ d</code></td></tr>
                <tr><td>#LOGIC_OP_OR_REVERSE</td><td><code>s ∨ ¬ d</code></td></tr>
                <tr><td>#LOGIC_OP_COPY_INVERTED</td><td><code>¬ s</code></td></tr>
                <tr><td>#LOGIC_OP_OR_INVERTED</td><td><code>¬ s ∨ d</code></td></tr>
                <tr><td>#LOGIC_OP_NAND</td><td><code>¬ (s ∧ d)</code></td></tr>
                <tr><td>#LOGIC_OP_SET</td><td>all 1s</td></tr>
            </tbody>
        </table>

        The result of the logical operation is then written to the color attachment as controlled by the component write mask, described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#framebuffer-blendoperations">Blend Operations</a>.

        <h5>See Also</h5>
        ##VkPipelineColorBlendStateCreateInfo
        """,

        "LOGIC_OP_CLEAR".."0",
        "LOGIC_OP_AND".."1",
        "LOGIC_OP_AND_REVERSE".."2",
        "LOGIC_OP_COPY".."3",
        "LOGIC_OP_AND_INVERTED".."4",
        "LOGIC_OP_NO_OP".."5",
        "LOGIC_OP_XOR".."6",
        "LOGIC_OP_OR".."7",
        "LOGIC_OP_NOR".."8",
        "LOGIC_OP_EQUIVALENT".."9",
        "LOGIC_OP_INVERT".."10",
        "LOGIC_OP_OR_REVERSE".."11",
        "LOGIC_OP_COPY_INVERTED".."12",
        "LOGIC_OP_OR_INVERTED".."13",
        "LOGIC_OP_NAND".."14",
        "LOGIC_OP_SET".."15"
    )

    EnumConstant(
        """
        VkBlendFactor - Framebuffer blending factors

        <h5>Description</h5>
        The semantics of each enum value is described in the table below:

        <h6>Blend Factors</h6>
        <table class="lwjgl">
            <thead><tr><th>{@code VkBlendFactor}</th><th>RGB Blend Factors <code>(S<sub>r</sub>,S<sub>g</sub>,S<sub>b</sub>)</code> or <code>(D<sub>r</sub>,D<sub>g</sub>,D<sub>b</sub>)</code></th><th>Alpha Blend Factor (<code>S<sub>a</sub></code> or <code>D<sub>a</sub></code>)</th></tr></thead>
            <tbody>
                <tr><td>#BLEND_FACTOR_ZERO</td><td><code>(0,0,0)</code></td><td><code>0</code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE</td><td><code>(1,1,1)</code></td><td><code>1</code></td></tr>
                <tr><td>#BLEND_FACTOR_SRC_COLOR</td><td><code>(R<sub>s0</sub>,G<sub>s0</sub>,B<sub>s0</sub>)</code></td><td><code>A<sub>s0</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_SRC_COLOR</td><td><code>(1-R<sub>s0</sub>,1-G<sub>s0</sub>,1-B<sub>s0</sub>)</code></td><td><code>1-A<sub>s0</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_DST_COLOR</td><td><code>(R<sub>d</sub>,G<sub>d</sub>,B<sub>d</sub>)</code></td><td><code>A<sub>d</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_DST_COLOR</td><td><code>(1-R<sub>d</sub>,1-G<sub>d</sub>,1-B<sub>d</sub>)</code></td><td><code>1-A<sub>d</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_SRC_ALPHA</td><td><code>(A<sub>s0</sub>,A<sub>s0</sub>,A<sub>s0</sub>)</code></td><td><code>A<sub>s0</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_SRC_ALPHA</td><td><code>(1-A<sub>s0</sub>,1-A<sub>s0</sub>,1-A<sub>s0</sub>)</code></td><td><code>1-A<sub>s0</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_DST_ALPHA</td><td><code>(A<sub>d</sub>,A<sub>d</sub>,A<sub>d</sub>)</code></td><td><code>A<sub>d</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_DST_ALPHA</td><td><code>(1-A<sub>d</sub>,1-A<sub>d</sub>,1-A<sub>d</sub>)</code></td><td><code>1-A<sub>d</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_CONSTANT_COLOR</td><td><code>(R<sub>c</sub>,G<sub>c</sub>,B<sub>c</sub>)</code></td><td><code>A<sub>c</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR</td><td><code>(1-R<sub>c</sub>,1-G<sub>c</sub>,1-B<sub>c</sub>)</code></td><td><code>1-A<sub>c</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_CONSTANT_ALPHA</td><td><code>(A<sub>c</sub>,A<sub>c</sub>,A<sub>c</sub>)</code></td><td><code>A<sub>c</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA</td><td><code>(1-A<sub>c</sub>,1-A<sub>c</sub>,1-A<sub>c</sub>)</code></td><td><code>1-A<sub>c</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_SRC_ALPHA_SATURATE</td><td><code>(f,f,f)</code>; <code>f = min(A<sub>s0</sub>,1-A<sub>d</sub>)</code></td><td><code>1</code></td></tr>
                <tr><td>#BLEND_FACTOR_SRC1_COLOR</td><td><code>(R<sub>s1</sub>,G<sub>s1</sub>,B<sub>s1</sub>)</code></td><td><code>A<sub>s1</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_SRC1_COLOR</td><td><code>(1-R<sub>s1</sub>,1-G<sub>s1</sub>,1-B<sub>s1</sub>)</code></td><td><code>1-A<sub>s1</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_SRC1_ALPHA</td><td><code>(A<sub>s1</sub>,A<sub>s1</sub>,A<sub>s1</sub>)</code></td><td><code>A<sub>s1</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA</td><td><code>(1-A<sub>s1</sub>,1-A<sub>s1</sub>,1-A<sub>s1</sub>)</code></td><td><code>1-A<sub>s1</sub></code></td></tr>
            </tbody>
        </table>

        In this table, the following conventions are used:

        <ul>
            <li><code>R<sub>s0</sub>,G<sub>s0</sub>,B<sub>s0</sub></code> and <code>A<sub>s0</sub></code> represent the first source color R, G, B, and A components, respectively, for the fragment output location corresponding to the color attachment being blended.</li>
            <li><code>R<sub>s1</sub>,G<sub>s1</sub>,B<sub>s1</sub></code> and <code>A<sub>s1</sub></code> represent the second source color R, G, B, and A components, respectively, used in dual source blending modes, for the fragment output location corresponding to the color attachment being blended.</li>
            <li><code>R<sub>d</sub>,G<sub>d</sub>,B<sub>d</sub></code> and <code>A<sub>d</sub></code> represent the R, G, B, and A components of the destination color. That is, the color currently in the corresponding color attachment for this fragment/sample.</li>
            <li><code>R<sub>c</sub>,G<sub>c</sub>,B<sub>c</sub></code> and <code>A<sub>c</sub></code> represent the blend constant R, G, B, and A components, respectively.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineColorBlendAttachmentState
        """,

        "BLEND_FACTOR_ZERO".."0",
        "BLEND_FACTOR_ONE".."1",
        "BLEND_FACTOR_SRC_COLOR".."2",
        "BLEND_FACTOR_ONE_MINUS_SRC_COLOR".."3",
        "BLEND_FACTOR_DST_COLOR".."4",
        "BLEND_FACTOR_ONE_MINUS_DST_COLOR".."5",
        "BLEND_FACTOR_SRC_ALPHA".."6",
        "BLEND_FACTOR_ONE_MINUS_SRC_ALPHA".."7",
        "BLEND_FACTOR_DST_ALPHA".."8",
        "BLEND_FACTOR_ONE_MINUS_DST_ALPHA".."9",
        "BLEND_FACTOR_CONSTANT_COLOR".."10",
        "BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR".."11",
        "BLEND_FACTOR_CONSTANT_ALPHA".."12",
        "BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA".."13",
        "BLEND_FACTOR_SRC_ALPHA_SATURATE".."14",
        "BLEND_FACTOR_SRC1_COLOR".."15",
        "BLEND_FACTOR_ONE_MINUS_SRC1_COLOR".."16",
        "BLEND_FACTOR_SRC1_ALPHA".."17",
        "BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA".."18"
    )

    EnumConstant(
        """
        VkBlendOp - Framebuffer blending operations

        <h5>Description</h5>
        

        The semantics of each basic blend operations is described in the table below:

        <h6>Basic Blend Operations</h6>
        <table class="lwjgl">
            <thead><tr><th>{@code VkBlendOp}</th><th>RGB Components</th><th>Alpha Component</th></tr></thead>
            <tbody>
                <tr><td>#BLEND_OP_ADD</td><td><code>R = R<sub>s0</sub> × S<sub>r</sub> + R<sub>d</sub> × D<sub>r</sub></code> <code>G = G<sub>s0</sub> × S<sub>g</sub> + G<sub>d</sub> × D<sub>g</sub></code> <code>B = B<sub>s0</sub> × S<sub>b</sub> + B<sub>d</sub> × D<sub>b</sub></code></td><td><code>A = A<sub>s0</sub> × S<sub>a</sub> + A<sub>d</sub> × D<sub>a</sub></code></td></tr>
                <tr><td>#BLEND_OP_SUBTRACT</td><td><code>R = R<sub>s0</sub> × S<sub>r</sub> - R<sub>d</sub> × D<sub>r</sub></code> <code>G = G<sub>s0</sub> × S<sub>g</sub> - G<sub>d</sub> × D<sub>g</sub></code> <code>B = B<sub>s0</sub> × S<sub>b</sub> - B<sub>d</sub> × D<sub>b</sub></code></td><td><code>A = A<sub>s0</sub> × S<sub>a</sub> - A<sub>d</sub> × D<sub>a</sub></code></td></tr>
                <tr><td>#BLEND_OP_REVERSE_SUBTRACT</td><td><code>R = R<sub>d</sub> × D<sub>r</sub> - R<sub>s0</sub> × S<sub>r</sub></code> <code>G = G<sub>d</sub> × D<sub>g</sub> - G<sub>s0</sub> × S<sub>g</sub></code> <code>B = B<sub>d</sub> × D<sub>b</sub> - B<sub>s0</sub> × S<sub>b</sub></code></td><td><code>A = A<sub>d</sub> × D<sub>a</sub> - A<sub>s0</sub> × S<sub>a</sub></code></td></tr>
                <tr><td>#BLEND_OP_MIN</td><td><code>R = min(R<sub>s0</sub>,R<sub>d</sub>)</code> <code>G = min(G<sub>s0</sub>,G<sub>d</sub>)</code> <code>B = min(B<sub>s0</sub>,B<sub>d</sub>)</code></td><td><code>A = min(A<sub>s0</sub>,A<sub>d</sub>)</code></td></tr>
                <tr><td>#BLEND_OP_MAX</td><td><code>R = max(R<sub>s0</sub>,R<sub>d</sub>)</code> <code>G = max(G<sub>s0</sub>,G<sub>d</sub>)</code> <code>B = max(B<sub>s0</sub>,B<sub>d</sub>)</code></td><td><code>A = max(A<sub>s0</sub>,A<sub>d</sub>)</code></td></tr>
            </tbody>
        </table>

        In this table, the following conventions are used:

        <ul>
            <li><code>R<sub>s0</sub>, G<sub>s0</sub>, B<sub>s0</sub></code> and <code>A<sub>s0</sub></code> represent the first source color R, G, B, and A components, respectively.</li>
            <li><code>R<sub>d</sub>, G<sub>d</sub>, B<sub>d</sub></code> and <code>A<sub>d</sub></code> represent the R, G, B, and A components of the destination color. That is, the color currently in the corresponding color attachment for this fragment/sample.</li>
            <li><code>S<sub>r</sub>, S<sub>g</sub>, S<sub>b</sub></code> and <code>S<sub>a</sub></code> represent the source blend factor R, G, B, and A components, respectively.</li>
            <li><code>D<sub>r</sub>, D<sub>g</sub>, D<sub>b</sub></code> and <code>D<sub>a</sub></code> represent the destination blend factor R, G, B, and A components, respectively.</li>
        </ul>

        The blending operation produces a new set of values <code>R, G, B</code> and <code>A</code>, which are written to the framebuffer attachment. If blending is not enabled for this attachment, then <code>R, G, B</code> and <code>A</code> are assigned <code>R<sub>s0</sub>, G<sub>s0</sub>, B<sub>s0</sub></code> and <code>A<sub>s0</sub></code>, respectively.

        If the color attachment is fixed-point, the components of the source and destination values and blend factors are each clamped to <code>[0,1]</code> or <code>[-1,1]</code> respectively for an unsigned normalized or signed normalized color attachment prior to evaluating the blend operations. If the color attachment is floating-point, no clamping occurs.

        <h5>See Also</h5>
        ##VkPipelineColorBlendAttachmentState
        """,

        "BLEND_OP_ADD".."0",
        "BLEND_OP_SUBTRACT".."1",
        "BLEND_OP_REVERSE_SUBTRACT".."2",
        "BLEND_OP_MIN".."3",
        "BLEND_OP_MAX".."4"
    )

    EnumConstant(
        """
        VkColorComponentFlagBits - Bitmask controlling which components are written to the framebuffer

        <h5>Description</h5>
        <ul>
            <li>#COLOR_COMPONENT_R_BIT specifies that the <code>R</code> value is written to the color attachment for the appropriate sample. Otherwise, the value in memory is unmodified.</li>
            <li>#COLOR_COMPONENT_G_BIT specifies that the <code>G</code> value is written to the color attachment for the appropriate sample. Otherwise, the value in memory is unmodified.</li>
            <li>#COLOR_COMPONENT_B_BIT specifies that the <code>B</code> value is written to the color attachment for the appropriate sample. Otherwise, the value in memory is unmodified.</li>
            <li>#COLOR_COMPONENT_A_BIT specifies that the <code>A</code> value is written to the color attachment for the appropriate sample. Otherwise, the value in memory is unmodified.</li>
        </ul>

        The color write mask operation is applied regardless of whether blending is enabled.

        <h5>See Also</h5>
        {@code VkColorComponentFlags}
        """,

        "COLOR_COMPONENT_R_BIT".enum(0x00000001),
        "COLOR_COMPONENT_G_BIT".enum(0x00000002),
        "COLOR_COMPONENT_B_BIT".enum(0x00000004),
        "COLOR_COMPONENT_A_BIT".enum(0x00000008)
    )

    EnumConstant(
        """
        VkDynamicState - Indicate which dynamic state is taken from dynamic state commands

        <h5>Description</h5>
        <ul>
            <li>#DYNAMIC_STATE_VIEWPORT specifies that the {@code pViewports} state in ##VkPipelineViewportStateCreateInfo will be ignored and <b>must</b> be set dynamically with #CmdSetViewport() before any draw commands. The number of viewports used by a pipeline is still specified by the {@code viewportCount} member of ##VkPipelineViewportStateCreateInfo.</li>
            <li>#DYNAMIC_STATE_SCISSOR specifies that the {@code pScissors} state in ##VkPipelineViewportStateCreateInfo will be ignored and <b>must</b> be set dynamically with #CmdSetScissor() before any draw commands. The number of scissor rectangles used by a pipeline is still specified by the {@code scissorCount} member of ##VkPipelineViewportStateCreateInfo.</li>
            <li>#DYNAMIC_STATE_LINE_WIDTH specifies that the {@code lineWidth} state in ##VkPipelineRasterizationStateCreateInfo will be ignored and <b>must</b> be set dynamically with #CmdSetLineWidth() before any draw commands that generate line primitives for the rasterizer.</li>
            <li>#DYNAMIC_STATE_DEPTH_BIAS specifies that the {@code depthBiasConstantFactor}, {@code depthBiasClamp} and {@code depthBiasSlopeFactor} states in ##VkPipelineRasterizationStateCreateInfo will be ignored and <b>must</b> be set dynamically with #CmdSetDepthBias() before any draws are performed with {@code depthBiasEnable} in ##VkPipelineRasterizationStateCreateInfo set to #TRUE.</li>
            <li>#DYNAMIC_STATE_BLEND_CONSTANTS specifies that the {@code blendConstants} state in ##VkPipelineColorBlendStateCreateInfo will be ignored and <b>must</b> be set dynamically with #CmdSetBlendConstants() before any draws are performed with a pipeline state with ##VkPipelineColorBlendAttachmentState member {@code blendEnable} set to #TRUE and any of the blend functions using a constant blend color.</li>
            <li>#DYNAMIC_STATE_DEPTH_BOUNDS specifies that the {@code minDepthBounds} and {@code maxDepthBounds} states of ##VkPipelineDepthStencilStateCreateInfo will be ignored and <b>must</b> be set dynamically with #CmdSetDepthBounds() before any draws are performed with a pipeline state with ##VkPipelineDepthStencilStateCreateInfo member {@code depthBoundsTestEnable} set to #TRUE.</li>
            <li>#DYNAMIC_STATE_STENCIL_COMPARE_MASK specifies that the {@code compareMask} state in ##VkPipelineDepthStencilStateCreateInfo for both {@code front} and {@code back} will be ignored and <b>must</b> be set dynamically with #CmdSetStencilCompareMask() before any draws are performed with a pipeline state with ##VkPipelineDepthStencilStateCreateInfo member {@code stencilTestEnable} set to #TRUE</li>
            <li>#DYNAMIC_STATE_STENCIL_WRITE_MASK specifies that the {@code writeMask} state in ##VkPipelineDepthStencilStateCreateInfo for both {@code front} and {@code back} will be ignored and <b>must</b> be set dynamically with #CmdSetStencilWriteMask() before any draws are performed with a pipeline state with ##VkPipelineDepthStencilStateCreateInfo member {@code stencilTestEnable} set to #TRUE</li>
            <li>#DYNAMIC_STATE_STENCIL_REFERENCE specifies that the {@code reference} state in ##VkPipelineDepthStencilStateCreateInfo for both {@code front} and {@code back} will be ignored and <b>must</b> be set dynamically with #CmdSetStencilReference() before any draws are performed with a pipeline state with ##VkPipelineDepthStencilStateCreateInfo member {@code stencilTestEnable} set to #TRUE</li>
            <li>#DYNAMIC_STATE_VIEWPORT_W_SCALING_NV specifies that the {@code pViewportScalings} state in ##VkPipelineViewportWScalingStateCreateInfoNV will be ignored and <b>must</b> be set dynamically with #CmdSetViewportWScalingNV() before any draws are performed with a pipeline state with ##VkPipelineViewportWScalingStateCreateInfoNV member {@code viewportScalingEnable} set to #TRUE</li>
            <li>#DYNAMIC_STATE_DISCARD_RECTANGLE_EXT specifies that the {@code pDiscardRectangles} state in ##VkPipelineDiscardRectangleStateCreateInfoEXT will be ignored and <b>must</b> be set dynamically with #CmdSetDiscardRectangleEXT() before any draw or clear commands. The {@code VkDiscardRectangleModeEXT} and the number of active discard rectangles is still specified by the {@code discardRectangleMode} and {@code discardRectangleCount} members of ##VkPipelineDiscardRectangleStateCreateInfoEXT.</li>
            <li>#DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT specifies that the {@code sampleLocationsInfo} state in ##VkPipelineSampleLocationsStateCreateInfoEXT will be ignored and <b>must</b> be set dynamically with #CmdSetSampleLocationsEXT() before any draw or clear commands. Enabling custom sample locations is still indicated by the {@code sampleLocationsEnable} member of ##VkPipelineSampleLocationsStateCreateInfoEXT.</li>
            <li>#DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV specifies that the {@code pExclusiveScissors} state in ##VkPipelineViewportExclusiveScissorStateCreateInfoNV will be ignored and <b>must</b> be set dynamically with #CmdSetExclusiveScissorNV() before any draw commands. The number of exclusive scissor rectangles used by a pipeline is still specified by the {@code exclusiveScissorCount} member of ##VkPipelineViewportExclusiveScissorStateCreateInfoNV.</li>
            <li>#DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV specifies that the {@code pShadingRatePalettes} state in ##VkPipelineViewportShadingRateImageStateCreateInfoNV will be ignored and <b>must</b> be set dynamically with #CmdSetViewportShadingRatePaletteNV() before any draw commands.</li>
            <li>#DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV specifies that the coarse sample order state in ##VkPipelineViewportCoarseSampleOrderStateCreateInfoNV will be ignored and <b>must</b> be set dynamically with #CmdSetCoarseSampleOrderNV() before any draw commands.</li>
            <li>#DYNAMIC_STATE_LINE_STIPPLE_EXT specifies that the {@code lineStippleFactor} and {@code lineStipplePattern} state in ##VkPipelineRasterizationLineStateCreateInfoEXT will be ignored and <b>must</b> be set dynamically with #CmdSetLineStippleEXT() before any draws are performed with a pipeline state with ##VkPipelineRasterizationLineStateCreateInfoEXT member {@code stippledLineEnable} set to #TRUE.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineDynamicStateCreateInfo
        """,

        "DYNAMIC_STATE_VIEWPORT".."0",
        "DYNAMIC_STATE_SCISSOR".."1",
        "DYNAMIC_STATE_LINE_WIDTH".."2",
        "DYNAMIC_STATE_DEPTH_BIAS".."3",
        "DYNAMIC_STATE_BLEND_CONSTANTS".."4",
        "DYNAMIC_STATE_DEPTH_BOUNDS".."5",
        "DYNAMIC_STATE_STENCIL_COMPARE_MASK".."6",
        "DYNAMIC_STATE_STENCIL_WRITE_MASK".."7",
        "DYNAMIC_STATE_STENCIL_REFERENCE".."8"
    )

    EnumConstant(
        """
        VkFilter - Specify filters used for texture lookups

        <h5>Description</h5>
        <ul>
            <li>#FILTER_NEAREST specifies nearest filtering.</li>
            <li>#FILTER_LINEAR specifies linear filtering.</li>
            <li>#FILTER_CUBIC_EXT specifies cubic filtering.</li>
        </ul>

        These filters are described in detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#textures-texel-filtering">Texel Filtering</a>.

        <h5>See Also</h5>
        ##VkSamplerCreateInfo, ##VkSamplerYcbcrConversionCreateInfo, #CmdBlitImage()
        """,

        "FILTER_NEAREST".."0",
        "FILTER_LINEAR".."1"
    )

    EnumConstant(
        """
        VkSamplerMipmapMode - Specify mipmap mode used for texture lookups

        <h5>Description</h5>
        <ul>
            <li>#SAMPLER_MIPMAP_MODE_NEAREST specifies nearest filtering.</li>
            <li>#SAMPLER_MIPMAP_MODE_LINEAR specifies linear filtering.</li>
        </ul>

        These modes are described in detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#textures-texel-filtering">Texel Filtering</a>.

        <h5>See Also</h5>
        ##VkSamplerCreateInfo
        """,

        "SAMPLER_MIPMAP_MODE_NEAREST".."0",
        "SAMPLER_MIPMAP_MODE_LINEAR".."1"
    )

    EnumConstant(
        """
        VkSamplerAddressMode - Specify behavior of sampling with texture coordinates outside an image

        <h5>Description</h5>
        <ul>
            <li>#SAMPLER_ADDRESS_MODE_REPEAT specifies that the repeat wrap mode will be used.</li>
            <li>#SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT specifies that the mirrored repeat wrap mode will be used.</li>
            <li>#SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE specifies that the clamp to edge wrap mode will be used.</li>
            <li>#SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER specifies that the clamp to border wrap mode will be used.</li>
            <li>#SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE specifies that the mirror clamp to edge wrap mode will be used. This is only valid if <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-samplerMirrorClampToEdge">samplerMirrorClampToEdge</a> is enabled, or if the {@link KHRSamplerMirrorClampToEdge VK_KHR_sampler_mirror_clamp_to_edge} extension is enabled.</li>
        </ul>

        <h5>See Also</h5>
        ##VkSamplerCreateInfo
        """,

        "SAMPLER_ADDRESS_MODE_REPEAT".."0",
        "SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT".."1",
        "SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE".."2",
        "SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER".."3"
    )

    EnumConstant(
        """
        VkBorderColor - Specify border color used for texture lookups

        <h5>Description</h5>
        <ul>
            <li>#BORDER_COLOR_FLOAT_TRANSPARENT_BLACK specifies a transparent, floating-point format, black color.</li>
            <li>#BORDER_COLOR_INT_TRANSPARENT_BLACK specifies a transparent, integer format, black color.</li>
            <li>#BORDER_COLOR_FLOAT_OPAQUE_BLACK specifies an opaque, floating-point format, black color.</li>
            <li>#BORDER_COLOR_INT_OPAQUE_BLACK specifies an opaque, integer format, black color.</li>
            <li>#BORDER_COLOR_FLOAT_OPAQUE_WHITE specifies an opaque, floating-point format, white color.</li>
            <li>#BORDER_COLOR_INT_OPAQUE_WHITE specifies an opaque, integer format, white color.</li>
        </ul>

        These colors are described in detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#textures-texel-replacement">Texel Replacement</a>.

        <h5>See Also</h5>
        ##VkSamplerCreateInfo
        """,

        "BORDER_COLOR_FLOAT_TRANSPARENT_BLACK".."0",
        "BORDER_COLOR_INT_TRANSPARENT_BLACK".."1",
        "BORDER_COLOR_FLOAT_OPAQUE_BLACK".."2",
        "BORDER_COLOR_INT_OPAQUE_BLACK".."3",
        "BORDER_COLOR_FLOAT_OPAQUE_WHITE".."4",
        "BORDER_COLOR_INT_OPAQUE_WHITE".."5"
    )

    EnumConstant(
        """
        VkDescriptorType - Specifies the type of a descriptor in a descriptor set

        <h5>Description</h5>
        <ul>
            <li>#DESCRIPTOR_TYPE_SAMPLER specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-sampler">sampler descriptor</a>.</li>
            <li>#DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-combinedimagesampler">combined image sampler descriptor</a>.</li>
            <li>#DESCRIPTOR_TYPE_SAMPLED_IMAGE specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-sampledimage">sampled image descriptor</a>.</li>
            <li>#DESCRIPTOR_TYPE_STORAGE_IMAGE specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storageimage">storage image descriptor</a>.</li>
            <li>#DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-uniformtexelbuffer">uniform texel buffer descriptor</a>.</li>
            <li>#DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storagetexelbuffer">storage texel buffer descriptor</a>.</li>
            <li>#DESCRIPTOR_TYPE_UNIFORM_BUFFER specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-uniformbuffer">uniform buffer descriptor</a>.</li>
            <li>#DESCRIPTOR_TYPE_STORAGE_BUFFER specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storagebuffer">storage buffer descriptor</a>.</li>
            <li>#DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-uniformbufferdynamic">dynamic uniform buffer descriptor</a>.</li>
            <li>#DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storagebufferdynamic">dynamic storage buffer descriptor</a>.</li>
            <li>#DESCRIPTOR_TYPE_INPUT_ATTACHMENT specifies an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-inputattachment">input attachment descriptor</a>.</li>
            <li>#DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT specifies an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-inlineuniformblock">inline uniform block</a>.</li>
        </ul>

        When a descriptor set is updated via elements of ##VkWriteDescriptorSet, members of {@code pImageInfo}, {@code pBufferInfo} and {@code pTexelBufferView} are only accessed by the implementation when they correspond to descriptor type being defined - otherwise they are ignored. The members accessed are as follows for each descriptor type:

        <ul>
            <li>For #DESCRIPTOR_TYPE_SAMPLER, only the {@code sampler} member of each element of ##VkWriteDescriptorSet{@code ::pImageInfo} is accessed.</li>
            <li>For #DESCRIPTOR_TYPE_SAMPLED_IMAGE, #DESCRIPTOR_TYPE_STORAGE_IMAGE, or #DESCRIPTOR_TYPE_INPUT_ATTACHMENT, only the {@code imageView} and {@code imageLayout} members of each element of ##VkWriteDescriptorSet{@code ::pImageInfo} are accessed.</li>
            <li>For #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, all members of each element of ##VkWriteDescriptorSet{@code ::pImageInfo} are accessed.</li>
            <li>For #DESCRIPTOR_TYPE_UNIFORM_BUFFER, #DESCRIPTOR_TYPE_STORAGE_BUFFER, #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC, or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC, all members of each element of ##VkWriteDescriptorSet{@code ::pBufferInfo} are accessed.</li>
            <li>For #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER or #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER, each element of ##VkWriteDescriptorSet{@code ::pTexelBufferView} is accessed.</li>
        </ul>

        When updating descriptors with a {@code descriptorType} of #DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT, none of the {@code pImageInfo}, {@code pBufferInfo}, or {@code pTexelBufferView} members are accessed, instead the source data of the descriptor update operation is taken from the ##VkWriteDescriptorSetInlineUniformBlockEXT structure in the {@code pNext} chain of ##VkWriteDescriptorSet. When updating descriptors with a {@code descriptorType} of #DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV, none of the {@code pImageInfo}, {@code pBufferInfo}, or {@code pTexelBufferView} members are accessed, instead the source data of the descriptor update operation is taken from the ##VkWriteDescriptorSetAccelerationStructureNV structure in the {@code pNext} chain of ##VkWriteDescriptorSet.

        <h5>See Also</h5>
        ##VkDescriptorPoolSize, ##VkDescriptorSetLayoutBinding, ##VkDescriptorUpdateTemplateEntry, ##VkImageViewHandleInfoNVX, ##VkWriteDescriptorSet
        """,

        "DESCRIPTOR_TYPE_SAMPLER".."0",
        "DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER".."1",
        "DESCRIPTOR_TYPE_SAMPLED_IMAGE".."2",
        "DESCRIPTOR_TYPE_STORAGE_IMAGE".."3",
        "DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER".."4",
        "DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER".."5",
        "DESCRIPTOR_TYPE_UNIFORM_BUFFER".."6",
        "DESCRIPTOR_TYPE_STORAGE_BUFFER".."7",
        "DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC".."8",
        "DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC".."9",
        "DESCRIPTOR_TYPE_INPUT_ATTACHMENT".."10"
    )

    EnumConstant(
        """
        VkDescriptorPoolCreateFlagBits - Bitmask specifying certain supported operations on a descriptor pool

        <h5>Description</h5>
        <ul>
            <li>#DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT specifies that descriptor sets <b>can</b> return their individual allocations to the pool, i.e. all of #AllocateDescriptorSets(), #FreeDescriptorSets(), and #ResetDescriptorPool() are allowed. Otherwise, descriptor sets allocated from the pool <b>must</b> not be individually freed back to the pool, i.e. only #AllocateDescriptorSets() and #ResetDescriptorPool() are allowed.</li>
            <li>#DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT specifies that descriptor sets allocated from this pool <b>can</b> include bindings with the #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT bit set. It is valid to allocate descriptor sets that have bindings that do not set the #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT bit from a pool that has #DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT set.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkDescriptorPoolCreateFlags}
        """,

        "DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkAttachmentDescriptionFlagBits - Bitmask specifying additional properties of an attachment

        <h5>Description</h5>
        <ul>
            <li>#ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT specifies that the attachment aliases the same device memory as other attachments.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkAttachmentDescriptionFlags}
        """,

        "ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkAttachmentLoadOp - Specify how contents of an attachment are treated at the beginning of a subpass

        <h5>Description</h5>
        <ul>
            <li>#ATTACHMENT_LOAD_OP_LOAD specifies that the previous contents of the image within the render area will be preserved. For attachments with a depth/stencil format, this uses the access type #ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT. For attachments with a color format, this uses the access type #ACCESS_COLOR_ATTACHMENT_READ_BIT.</li>
            <li>#ATTACHMENT_LOAD_OP_CLEAR specifies that the contents within the render area will be cleared to a uniform value, which is specified when a render pass instance is begun. For attachments with a depth/stencil format, this uses the access type #ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT. For attachments with a color format, this uses the access type #ACCESS_COLOR_ATTACHMENT_WRITE_BIT.</li>
            <li>#ATTACHMENT_LOAD_OP_DONT_CARE specifies that the previous contents within the area need not be preserved; the contents of the attachment will be undefined inside the render area. For attachments with a depth/stencil format, this uses the access type #ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT. For attachments with a color format, this uses the access type #ACCESS_COLOR_ATTACHMENT_WRITE_BIT.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentDescription, ##VkAttachmentDescription2
        """,

        "ATTACHMENT_LOAD_OP_LOAD".."0",
        "ATTACHMENT_LOAD_OP_CLEAR".."1",
        "ATTACHMENT_LOAD_OP_DONT_CARE".."2"
    )

    EnumConstant(
        """
        VkAttachmentStoreOp - Specify how contents of an attachment are treated at the end of a subpass

        <h5>Description</h5>
        <ul>
            <li>#ATTACHMENT_STORE_OP_STORE specifies the contents generated during the render pass and within the render area are written to memory. For attachments with a depth/stencil format, this uses the access type #ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT. For attachments with a color format, this uses the access type #ACCESS_COLOR_ATTACHMENT_WRITE_BIT.</li>
            <li>#ATTACHMENT_STORE_OP_DONT_CARE specifies the contents within the render area are not needed after rendering, and <b>may</b> be discarded; the contents of the attachment will be undefined inside the render area. For attachments with a depth/stencil format, this uses the access type #ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT. For attachments with a color format, this uses the access type #ACCESS_COLOR_ATTACHMENT_WRITE_BIT.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentDescription, ##VkAttachmentDescription2
        """,

        "ATTACHMENT_STORE_OP_STORE".."0",
        "ATTACHMENT_STORE_OP_DONT_CARE".."1"
    )

    EnumConstant(
        """
        VkPipelineBindPoint - Specify the bind point of a pipeline object to a command buffer

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_BIND_POINT_COMPUTE specifies binding as a compute pipeline.</li>
            <li>#PIPELINE_BIND_POINT_GRAPHICS specifies binding as a graphics pipeline.</li>
            <li>#PIPELINE_BIND_POINT_RAY_TRACING_NV specifies binding as a ray tracing pipeline.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDescriptorUpdateTemplateCreateInfo, ##VkIndirectCommandsLayoutCreateInfoNVX, ##VkSubpassDescription, ##VkSubpassDescription2, #CmdBindDescriptorSets(), #CmdBindPipeline(), #CmdPushDescriptorSetKHR()
        """,

        "PIPELINE_BIND_POINT_GRAPHICS".."0",
        "PIPELINE_BIND_POINT_COMPUTE".."1"
    )

    EnumConstant(
        """
        VkAccessFlagBits - Bitmask specifying memory access types that will participate in a memory dependency

        <h5>Description</h5>
        <ul>
            <li>#ACCESS_INDIRECT_COMMAND_READ_BIT specifies read access to indirect command data read as part of an indirect drawing or dispatch command.</li>
            <li>#ACCESS_INDEX_READ_BIT specifies read access to an index buffer as part of an indexed drawing command, bound by #CmdBindIndexBuffer().</li>
            <li>#ACCESS_VERTEX_ATTRIBUTE_READ_BIT specifies read access to a vertex buffer as part of a drawing command, bound by #CmdBindVertexBuffers().</li>
            <li>#ACCESS_UNIFORM_READ_BIT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-uniformbuffer">uniform buffer</a>.</li>
            <li>#ACCESS_INPUT_ATTACHMENT_READ_BIT specifies read access to an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass">input attachment</a> within a render pass during fragment shading.</li>
            <li>#ACCESS_SHADER_READ_BIT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storagebuffer">storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-physical-storage-buffer">physical storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-uniformtexelbuffer">uniform texel buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storagetexelbuffer">storage texel buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-sampledimage">sampled image</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storageimage">storage image</a>.</li>
            <li>#ACCESS_SHADER_WRITE_BIT specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storagebuffer">storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-physical-storage-buffer">physical storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storagetexelbuffer">storage texel buffer</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storageimage">storage image</a>.</li>
            <li>#ACCESS_COLOR_ATTACHMENT_READ_BIT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass">color attachment</a>, such as via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#framebuffer-blending">blending</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#framebuffer-logicop">logic operations</a>, or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load operations</a>. It does not include <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#framebuffer-blend-advanced">advanced blend operations</a>.</li>
            <li>#ACCESS_COLOR_ATTACHMENT_WRITE_BIT specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass">color, resolve, or depth/stencil resolve attachment</a> during a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass">render pass</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load and store operations</a>.</li>
            <li>#ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass">depth/stencil attachment</a>, via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fragops-ds-state">depth or stencil operations</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load operations</a>.</li>
            <li>#ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass">depth/stencil attachment</a>, via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fragops-ds-state">depth or stencil operations</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load and store operations</a>.</li>
            <li>#ACCESS_TRANSFER_READ_BIT specifies read access to an image or buffer in a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies">copy</a> operation.</li>
            <li>#ACCESS_TRANSFER_WRITE_BIT specifies write access to an image or buffer in a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#clears">clear</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies">copy</a> operation.</li>
            <li>#ACCESS_HOST_READ_BIT specifies read access by a host operation. Accesses of this type are not performed through a resource, but directly on memory.</li>
            <li>#ACCESS_HOST_WRITE_BIT specifies write access by a host operation. Accesses of this type are not performed through a resource, but directly on memory.</li>
            <li>#ACCESS_MEMORY_READ_BIT specifies all read accesses. It is always valid in any access mask, and is treated as equivalent to setting all {@code READ} access flags that are valid where it is used.</li>
            <li>#ACCESS_MEMORY_WRITE_BIT specifies all write accesses. It is always valid in any access mask, and is treated as equivalent to setting all {@code WRITE} access flags that are valid where it is used.</li>
            <li>#ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT specifies read access to a predicate as part of conditional rendering.</li>
            <li>#ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT specifies write access to a transform feedback buffer made when transform feedback is active.</li>
            <li>#ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT specifies read access to a transform feedback counter buffer which is read when {@code vkCmdBeginTransformFeedbackEXT} executes.</li>
            <li>#ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT specifies write access to a transform feedback counter buffer which is written when {@code vkCmdEndTransformFeedbackEXT} executes.</li>
            <li>#ACCESS_COMMAND_PROCESS_READ_BIT_NVX specifies reads from {@code VkBuffer} inputs to #CmdProcessCommandsNVX().</li>
            <li>#ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX specifies writes to the target command buffer in #CmdProcessCommandsNVX().</li>
            <li>#ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT is similar to #ACCESS_COLOR_ATTACHMENT_READ_BIT, but also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#framebuffer-blend-advanced">advanced blend operations</a>.</li>
            <li>#ACCESS_SHADING_RATE_IMAGE_READ_BIT_NV specifies read access to a shading rate image as part of a drawing command, as bound by #CmdBindShadingRateImageNV().</li>
            <li>#ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV specifies read access to an acceleration structure as part of a trace or build command.</li>
            <li>#ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV specifies write access to an acceleration structure as part of a build command.</li>
            <li>#ACCESS_FRAGMENT_DENSITY_MAP_READ_BIT_EXT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-fragmentdensitymapattachment">fragment density map attachment</a> during dynamic <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fragmentdensitymapops">fragment density map operations</a></li>
        </ul>

        Certain access types are only performed by a subset of pipeline stages. Any synchronization command that takes both stage masks and access masks uses both to define the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scopes</a> - only the specified access types performed by the specified stages are included in the access scope. An application <b>must</b> not specify an access flag in a synchronization command if it does not include a pipeline stage in the corresponding stage mask that is able to perform accesses of that type. The following table lists, for each access flag, which pipeline stages <b>can</b> perform that type of access.

        <h6>Supported access types</h6>
        <table class="lwjgl">
            <thead><tr><th>Access flag</th><th>Supported pipeline stages</th></tr></thead>
            <tbody>
                <tr><td>#ACCESS_INDIRECT_COMMAND_READ_BIT</td><td>#PIPELINE_STAGE_DRAW_INDIRECT_BIT</td></tr>
                <tr><td>#ACCESS_INDEX_READ_BIT</td><td>#PIPELINE_STAGE_VERTEX_INPUT_BIT</td></tr>
                <tr><td>#ACCESS_VERTEX_ATTRIBUTE_READ_BIT</td><td>#PIPELINE_STAGE_VERTEX_INPUT_BIT</td></tr>
                <tr><td>#ACCESS_UNIFORM_READ_BIT</td><td>#PIPELINE_STAGE_TASK_SHADER_BIT_NV, #PIPELINE_STAGE_MESH_SHADER_BIT_NV, #PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV, #PIPELINE_STAGE_VERTEX_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT, #PIPELINE_STAGE_GEOMETRY_SHADER_BIT, #PIPELINE_STAGE_FRAGMENT_SHADER_BIT, or #PIPELINE_STAGE_COMPUTE_SHADER_BIT</td></tr>
                <tr><td>#ACCESS_SHADER_READ_BIT</td><td>#PIPELINE_STAGE_TASK_SHADER_BIT_NV, #PIPELINE_STAGE_MESH_SHADER_BIT_NV, #PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV, #PIPELINE_STAGE_VERTEX_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT, #PIPELINE_STAGE_GEOMETRY_SHADER_BIT, #PIPELINE_STAGE_FRAGMENT_SHADER_BIT, or #PIPELINE_STAGE_COMPUTE_SHADER_BIT</td></tr>
                <tr><td>#ACCESS_SHADER_WRITE_BIT</td><td>#PIPELINE_STAGE_TASK_SHADER_BIT_NV, #PIPELINE_STAGE_MESH_SHADER_BIT_NV, #PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV, #PIPELINE_STAGE_VERTEX_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT, #PIPELINE_STAGE_GEOMETRY_SHADER_BIT, #PIPELINE_STAGE_FRAGMENT_SHADER_BIT, or #PIPELINE_STAGE_COMPUTE_SHADER_BIT</td></tr>
                <tr><td>#ACCESS_INPUT_ATTACHMENT_READ_BIT</td><td>#PIPELINE_STAGE_FRAGMENT_SHADER_BIT</td></tr>
                <tr><td>#ACCESS_COLOR_ATTACHMENT_READ_BIT</td><td>#PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT</td></tr>
                <tr><td>#ACCESS_COLOR_ATTACHMENT_WRITE_BIT</td><td>#PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT</td></tr>
                <tr><td>#ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT</td><td>#PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT, or #PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT</td></tr>
                <tr><td>#ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT</td><td>#PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT, or #PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT</td></tr>
                <tr><td>#ACCESS_TRANSFER_READ_BIT</td><td>#PIPELINE_STAGE_TRANSFER_BIT</td></tr>
                <tr><td>#ACCESS_TRANSFER_WRITE_BIT</td><td>#PIPELINE_STAGE_TRANSFER_BIT</td></tr>
                <tr><td>#ACCESS_HOST_READ_BIT</td><td>#PIPELINE_STAGE_HOST_BIT</td></tr>
                <tr><td>#ACCESS_HOST_WRITE_BIT</td><td>#PIPELINE_STAGE_HOST_BIT</td></tr>
                <tr><td>#ACCESS_MEMORY_READ_BIT</td><td>Any</td></tr>
                <tr><td>#ACCESS_MEMORY_WRITE_BIT</td><td>Any</td></tr>
                <tr><td>#ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT</td><td>#PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT</td></tr>
                <tr><td>#ACCESS_COMMAND_PROCESS_READ_BIT_NVX</td><td>#PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX</td></tr>
                <tr><td>#ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX</td><td>#PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX</td></tr>
                <tr><td>#ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT</td><td>#PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT</td></tr>
                <tr><td>#ACCESS_SHADING_RATE_IMAGE_READ_BIT_NV</td><td>#PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV</td></tr>
                <tr><td>#ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT</td><td>#PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT</td></tr>
                <tr><td>#ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT</td><td>#PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT</td></tr>
                <tr><td>#ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT</td><td>#PIPELINE_STAGE_DRAW_INDIRECT_BIT</td></tr>
                <tr><td>#ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV</td><td>#PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV, or #PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV</td></tr>
                <tr><td>#ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV</td><td>#PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV</td></tr>
                <tr><td>#ACCESS_FRAGMENT_DENSITY_MAP_READ_BIT_EXT</td><td>#PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT</td></tr>
            </tbody>
        </table>

        If a memory object does not have the #MEMORY_PROPERTY_HOST_COHERENT_BIT property, then #FlushMappedMemoryRanges() <b>must</b> be called in order to guarantee that writes to the memory object from the host are made available to the host domain, where they <b>can</b> be further made available to the device domain via a domain operation. Similarly, #InvalidateMappedMemoryRanges() <b>must</b> be called to guarantee that writes which are available to the host domain are made visible to host operations.

        If the memory object does have the #MEMORY_PROPERTY_HOST_COHERENT_BIT property flag, writes to the memory object from the host are automatically made available to the host domain. Similarly, writes made available to the host domain are automatically made visible to the host.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The #QueueSubmit() command <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-host-writes">automatically performs a domain operation from host to device</a> for all writes performed before the command executes, so in most cases an explicit memory barrier is not needed for this case. In the few circumstances where a submit does not occur between the host write and the device read access, writes <b>can</b> be made available by using an explicit memory barrier.
        </div>

        <h5>See Also</h5>
        {@code VkAccessFlags}
        """,

        "ACCESS_INDIRECT_COMMAND_READ_BIT".enum(0x00000001),
        "ACCESS_INDEX_READ_BIT".enum(0x00000002),
        "ACCESS_VERTEX_ATTRIBUTE_READ_BIT".enum(0x00000004),
        "ACCESS_UNIFORM_READ_BIT".enum(0x00000008),
        "ACCESS_INPUT_ATTACHMENT_READ_BIT".enum(0x00000010),
        "ACCESS_SHADER_READ_BIT".enum(0x00000020),
        "ACCESS_SHADER_WRITE_BIT".enum(0x00000040),
        "ACCESS_COLOR_ATTACHMENT_READ_BIT".enum(0x00000080),
        "ACCESS_COLOR_ATTACHMENT_WRITE_BIT".enum(0x00000100),
        "ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT".enum(0x00000200),
        "ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT".enum(0x00000400),
        "ACCESS_TRANSFER_READ_BIT".enum(0x00000800),
        "ACCESS_TRANSFER_WRITE_BIT".enum(0x00001000),
        "ACCESS_HOST_READ_BIT".enum(0x00002000),
        "ACCESS_HOST_WRITE_BIT".enum(0x00004000),
        "ACCESS_MEMORY_READ_BIT".enum(0x00008000),
        "ACCESS_MEMORY_WRITE_BIT".enum(0x00010000)
    )

    EnumConstant(
        """
        VkDependencyFlagBits - Bitmask specifying how execution and memory dependencies are formed

        <h5>Description</h5>
        <ul>
            <li>#DEPENDENCY_BY_REGION_BIT specifies that dependencies will be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-framebuffer-regions">framebuffer-local</a>.</li>
            <li>#DEPENDENCY_VIEW_LOCAL_BIT specifies that a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-barriers-subpass-self-dependencies">subpass has more than one view</a>.</li>
            <li>#DEPENDENCY_DEVICE_GROUP_BIT specifies that dependencies are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-device-local-dependencies">non-device-local dependency</a>.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkDependencyFlags}
        """,

        "DEPENDENCY_BY_REGION_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkCommandPoolCreateFlagBits - Bitmask specifying usage behavior for a command pool

        <h5>Description</h5>
        <ul>
            <li>#COMMAND_POOL_CREATE_TRANSIENT_BIT specifies that command buffers allocated from the pool will be short-lived, meaning that they will be reset or freed in a relatively short timeframe. This flag <b>may</b> be used by the implementation to control memory allocation behavior within the pool.</li>
            <li>#COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT allows any command buffer allocated from a pool to be individually reset to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">initial state</a>; either by calling #ResetCommandBuffer(), or via the implicit reset when calling #BeginCommandBuffer(). If this flag is not set on a pool, then {@code vkResetCommandBuffer} <b>must</b> not be called for any command buffer allocated from that pool.</li>
            <li>#COMMAND_POOL_CREATE_PROTECTED_BIT specifies that command buffers allocated from the pool are protected command buffers. If the protected memory feature is not enabled, the #COMMAND_POOL_CREATE_PROTECTED_BIT bit of {@code flags} <b>must</b> not be set.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkCommandPoolCreateFlags}
        """,

        "COMMAND_POOL_CREATE_TRANSIENT_BIT".enum(0x00000001),
        "COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT".enum(0x00000002)
    )

    EnumConstant(
        """
        VkCommandPoolResetFlagBits - Bitmask controlling behavior of a command pool reset

        <h5>Description</h5>
        <ul>
            <li>#COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT specifies that resetting a command pool recycles all of the resources from the command pool back to the system.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkCommandPoolResetFlags}
        """,

        "COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkCommandBufferLevel - Enumerant specifying a command buffer level

        <h5>Description</h5>
        <ul>
            <li>#COMMAND_BUFFER_LEVEL_PRIMARY specifies a primary command buffer.</li>
            <li>#COMMAND_BUFFER_LEVEL_SECONDARY specifies a secondary command buffer.</li>
        </ul>

        <h5>See Also</h5>
        ##VkCommandBufferAllocateInfo
        """,

        "COMMAND_BUFFER_LEVEL_PRIMARY".."0",
        "COMMAND_BUFFER_LEVEL_SECONDARY".."1"
    )

    EnumConstant(
        """
        VkCommandBufferUsageFlagBits - Bitmask specifying usage behavior for command buffer

        <h5>Description</h5>
        <ul>
            <li>#COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT specifies that each recording of the command buffer will only be submitted once, and the command buffer will be reset and recorded again between each submission.</li>
            <li>#COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT specifies that a secondary command buffer is considered to be entirely inside a render pass. If this is a primary command buffer, then this bit is ignored.</li>
            <li>#COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT specifies that a command buffer <b>can</b> be resubmitted to a queue while it is in the <em>pending state</em>, and recorded into multiple primary command buffers.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkCommandBufferUsageFlags}
        """,

        "COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT".enum(0x00000001),
        "COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT".enum(0x00000002),
        "COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkQueryControlFlagBits - Bitmask specifying constraints on a query

        <h5>Description</h5>
        <ul>
            <li>#QUERY_CONTROL_PRECISE_BIT specifies the precision of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-occlusion">occlusion queries</a>.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkQueryControlFlags}
        """,

        "QUERY_CONTROL_PRECISE_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkCommandBufferResetFlagBits - Bitmask controlling behavior of a command buffer reset

        <h5>Description</h5>
        <ul>
            <li>#COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT specifies that most or all memory resources currently owned by the command buffer <b>should</b> be returned to the parent command pool. If this flag is not set, then the command buffer <b>may</b> hold onto memory resources and reuse them when recording commands. {@code commandBuffer} is moved to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">initial state</a>.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkCommandBufferResetFlags}
        """,

        "COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkStencilFaceFlagBits - Bitmask specifying sets of stencil state for which to update the compare mask

        <h5>Description</h5>
        <ul>
            <li>#STENCIL_FACE_FRONT_BIT specifies that only the front set of stencil state is updated.</li>
            <li>#STENCIL_FACE_BACK_BIT specifies that only the back set of stencil state is updated.</li>
            <li>#STENCIL_FACE_FRONT_AND_BACK is the combination of #STENCIL_FACE_FRONT_BIT and #STENCIL_FACE_BACK_BIT, and specifies that both sets of stencil state are updated.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkStencilFaceFlags}
        """,

        "STENCIL_FACE_FRONT_BIT".enum(0x00000001),
        "STENCIL_FACE_BACK_BIT".enum(0x00000002),
        "STENCIL_FACE_FRONT_AND_BACK".."0x00000003",
        "STENCIL_FRONT_AND_BACK".."0x00000003"
    )

    EnumConstant(
        """
        VkIndexType - Type of index buffer indices

        <h5>Description</h5>
        <ul>
            <li>#INDEX_TYPE_UINT16 specifies that indices are 16-bit unsigned integer values.</li>
            <li>#INDEX_TYPE_UINT32 specifies that indices are 32-bit unsigned integer values.</li>
            <li>#INDEX_TYPE_NONE_NV specifies that no indices are provided.</li>
            <li>#INDEX_TYPE_UINT8_EXT specifies that indices are 8-bit unsigned integer values.</li>
        </ul>

        <h5>See Also</h5>
        ##VkGeometryTrianglesNV, ##VkObjectTableIndexBufferEntryNVX, #CmdBindIndexBuffer()
        """,

        "INDEX_TYPE_UINT16".."0",
        "INDEX_TYPE_UINT32".."1"
    )

    EnumConstant(
        """
        VkSubpassContents - Specify how commands in the first subpass of a render pass are provided

        <h5>Description</h5>
        <ul>
            <li>#SUBPASS_CONTENTS_INLINE specifies that the contents of the subpass will be recorded inline in the primary command buffer, and secondary command buffers <b>must</b> not be executed within the subpass.</li>
            <li>#SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS specifies that the contents are recorded in secondary command buffers that will be called from the primary command buffer, and #CmdExecuteCommands() is the only valid command on the command buffer until #CmdNextSubpass() or #CmdEndRenderPass().</li>
        </ul>

        <h5>See Also</h5>
        ##VkSubpassBeginInfo, #CmdBeginRenderPass(), #CmdNextSubpass()
        """,

        "SUBPASS_CONTENTS_INLINE".."0",
        "SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS".."1"
    )

    EnumConstant(
        """
        VkObjectType - Specify an enumeration to track object handle types

        <h5>Description</h5>
        <h6>VkObjectType and Vulkan Handle Relationship</h6>
        <table class="lwjgl">
            <thead><tr><th>{@code VkObjectType}</th><th>Vulkan Handle Type</th></tr></thead>
            <tbody>
                <tr><td>#OBJECT_TYPE_UNKNOWN</td><td>Unknown/Undefined Handle</td></tr>
                <tr><td>#OBJECT_TYPE_INSTANCE</td><td>{@code VkInstance}</td></tr>
                <tr><td>#OBJECT_TYPE_PHYSICAL_DEVICE</td><td>{@code VkPhysicalDevice}</td></tr>
                <tr><td>#OBJECT_TYPE_DEVICE</td><td>{@code VkDevice}</td></tr>
                <tr><td>#OBJECT_TYPE_QUEUE</td><td>{@code VkQueue}</td></tr>
                <tr><td>#OBJECT_TYPE_SEMAPHORE</td><td>{@code VkSemaphore}</td></tr>
                <tr><td>#OBJECT_TYPE_COMMAND_BUFFER</td><td>{@code VkCommandBuffer}</td></tr>
                <tr><td>#OBJECT_TYPE_FENCE</td><td>{@code VkFence}</td></tr>
                <tr><td>#OBJECT_TYPE_DEVICE_MEMORY</td><td>{@code VkDeviceMemory}</td></tr>
                <tr><td>#OBJECT_TYPE_BUFFER</td><td>{@code VkBuffer}</td></tr>
                <tr><td>#OBJECT_TYPE_IMAGE</td><td>{@code VkImage}</td></tr>
                <tr><td>#OBJECT_TYPE_EVENT</td><td>{@code VkEvent}</td></tr>
                <tr><td>#OBJECT_TYPE_QUERY_POOL</td><td>{@code VkQueryPool}</td></tr>
                <tr><td>#OBJECT_TYPE_BUFFER_VIEW</td><td>{@code VkBufferView}</td></tr>
                <tr><td>#OBJECT_TYPE_IMAGE_VIEW</td><td>{@code VkImageView}</td></tr>
                <tr><td>#OBJECT_TYPE_SHADER_MODULE</td><td>{@code VkShaderModule}</td></tr>
                <tr><td>#OBJECT_TYPE_PIPELINE_CACHE</td><td>{@code VkPipelineCache}</td></tr>
                <tr><td>#OBJECT_TYPE_PIPELINE_LAYOUT</td><td>{@code VkPipelineLayout}</td></tr>
                <tr><td>#OBJECT_TYPE_RENDER_PASS</td><td>{@code VkRenderPass}</td></tr>
                <tr><td>#OBJECT_TYPE_PIPELINE</td><td>{@code VkPipeline}</td></tr>
                <tr><td>#OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT</td><td>{@code VkDescriptorSetLayout}</td></tr>
                <tr><td>#OBJECT_TYPE_SAMPLER</td><td>{@code VkSampler}</td></tr>
                <tr><td>#OBJECT_TYPE_DESCRIPTOR_POOL</td><td>{@code VkDescriptorPool}</td></tr>
                <tr><td>#OBJECT_TYPE_DESCRIPTOR_SET</td><td>{@code VkDescriptorSet}</td></tr>
                <tr><td>#OBJECT_TYPE_FRAMEBUFFER</td><td>{@code VkFramebuffer}</td></tr>
                <tr><td>#OBJECT_TYPE_COMMAND_POOL</td><td>{@code VkCommandPool}</td></tr>
                <tr><td>#OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION</td><td>{@code VkSamplerYcbcrConversion}</td></tr>
                <tr><td>#OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE</td><td>{@code VkDescriptorUpdateTemplate}</td></tr>
                <tr><td>#OBJECT_TYPE_SURFACE_KHR</td><td>{@code VkSurfaceKHR}</td></tr>
                <tr><td>#OBJECT_TYPE_SWAPCHAIN_KHR</td><td>{@code VkSwapchainKHR}</td></tr>
                <tr><td>#OBJECT_TYPE_DISPLAY_KHR</td><td>{@code VkDisplayKHR}</td></tr>
                <tr><td>#OBJECT_TYPE_DISPLAY_MODE_KHR</td><td>{@code VkDisplayModeKHR}</td></tr>
                <tr><td>#OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT</td><td>{@code VkDebugReportCallbackEXT}</td></tr>
                <tr><td>#OBJECT_TYPE_OBJECT_TABLE_NVX</td><td>{@code VkObjectTableNVX}</td></tr>
                <tr><td>#OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX</td><td>{@code VkIndirectCommandsLayoutNVX}</td></tr>
                <tr><td>#OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT</td><td>{@code VkDebugUtilsMessengerEXT}</td></tr>
                <tr><td>#OBJECT_TYPE_VALIDATION_CACHE_EXT</td><td>{@code VkValidationCacheEXT}</td></tr>
                <tr><td>#OBJECT_TYPE_ACCELERATION_STRUCTURE_NV</td><td>{@code VkAccelerationStructureNV}</td></tr>
                <tr><td>#OBJECT_TYPE_PERFORMANCE_CONFIGURATION_INTEL</td><td>{@code VkPerformanceConfigurationINTEL}</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##VkDebugUtilsObjectNameInfoEXT, ##VkDebugUtilsObjectTagInfoEXT
        """,

        "OBJECT_TYPE_UNKNOWN".."0",
        "OBJECT_TYPE_INSTANCE".."1",
        "OBJECT_TYPE_PHYSICAL_DEVICE".."2",
        "OBJECT_TYPE_DEVICE".."3",
        "OBJECT_TYPE_QUEUE".."4",
        "OBJECT_TYPE_SEMAPHORE".."5",
        "OBJECT_TYPE_COMMAND_BUFFER".."6",
        "OBJECT_TYPE_FENCE".."7",
        "OBJECT_TYPE_DEVICE_MEMORY".."8",
        "OBJECT_TYPE_BUFFER".."9",
        "OBJECT_TYPE_IMAGE".."10",
        "OBJECT_TYPE_EVENT".."11",
        "OBJECT_TYPE_QUERY_POOL".."12",
        "OBJECT_TYPE_BUFFER_VIEW".."13",
        "OBJECT_TYPE_IMAGE_VIEW".."14",
        "OBJECT_TYPE_SHADER_MODULE".."15",
        "OBJECT_TYPE_PIPELINE_CACHE".."16",
        "OBJECT_TYPE_PIPELINE_LAYOUT".."17",
        "OBJECT_TYPE_RENDER_PASS".."18",
        "OBJECT_TYPE_PIPELINE".."19",
        "OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT".."20",
        "OBJECT_TYPE_SAMPLER".."21",
        "OBJECT_TYPE_DESCRIPTOR_POOL".."22",
        "OBJECT_TYPE_DESCRIPTOR_SET".."23",
        "OBJECT_TYPE_FRAMEBUFFER".."24",
        "OBJECT_TYPE_COMMAND_POOL".."25"
    )

    EnumConstant(
        """
        VkVendorId - Khronos vendor IDs

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Khronos vendor IDs may be allocated by vendors at any time. Only the latest canonical versions of this Specification, of the corresponding {@code vk.xml} API Registry, and of the corresponding {@code vulkan_core.h} header file <b>must</b> contain all reserved Khronos vendor IDs.

        Only Khronos vendor IDs are given symbolic names at present. PCI vendor IDs returned by the implementation can be looked up in the PCI-SIG database.
        </div>

        <h5>See Also</h5>
        No cross-references are available
        """,

        "VENDOR_ID_VIV".."0x10001",
        "VENDOR_ID_VSI".."0x10002",
        "VENDOR_ID_KAZAN".."0x10003"
    )

    // Device initialization

    GlobalCommand..VkResult(
        "CreateInstance",
        """
        Create a new Vulkan instance.

        <h5>C Specification</h5>
        To create an instance object, call:

        <pre><code>
￿VkResult vkCreateInstance(
￿    const VkInstanceCreateInfo*                 pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkInstance*                                 pInstance);</code></pre>

        <h5>Description</h5>
        {@code vkCreateInstance} verifies that the requested layers exist. If not, {@code vkCreateInstance} will return #ERROR_LAYER_NOT_PRESENT. Next {@code vkCreateInstance} verifies that the requested extensions are supported (e.g. in the implementation or in any enabled instance layer) and if any requested extension is not supported, {@code vkCreateInstance} <b>must</b> return #ERROR_EXTENSION_NOT_PRESENT. After verifying and enabling the instance layers and extensions the {@code VkInstance} object is created and returned to the application. If a requested extension is only supported by a layer, both the layer and the extension need to be specified at {@code vkCreateInstance} time for the creation to succeed.

        <h5>Valid Usage</h5>
        <ul>
            <li>All <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#extendingvulkan-extensions-extensiondependencies">required extensions</a> for each extension in the ##VkInstanceCreateInfo{@code ::ppEnabledExtensionNames} list <b>must</b> also be present in that list.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkInstanceCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pInstance} <b>must</b> be a valid pointer to a {@code VkInstance} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_LAYER_NOT_PRESENT</li>
                <li>#ERROR_EXTENSION_NOT_PRESENT</li>
                <li>#ERROR_INCOMPATIBLE_DRIVER</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkInstanceCreateInfo
        """,

        VkInstanceCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkInstanceCreateInfo structure controlling creation of the instance."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkInstance.p("pInstance", "points a {@code VkInstance} handle in which the resulting instance is returned.")
    )

    void(
        "DestroyInstance",
        """
        Destroy an instance of Vulkan.

        <h5>C Specification</h5>
        To destroy an instance, call:

        <pre><code>
￿void vkDestroyInstance(
￿    VkInstance                                  instance,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All child objects created using {@code instance} <b>must</b> have been destroyed prior to destroying {@code instance}</li>
            <li>If ##VkAllocationCallbacks were provided when {@code instance} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code instance} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>If {@code instance} is not {@code NULL}, {@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code instance} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkInstance("instance", "the handle of the instance to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "EnumeratePhysicalDevices",
        """
        Enumerates the physical devices accessible to a Vulkan instance.

        <h5>C Specification</h5>
        To retrieve a list of physical device objects representing the physical devices installed in the system, call:

        <pre><code>
￿VkResult vkEnumeratePhysicalDevices(
￿    VkInstance                                  instance,
￿    uint32_t*                                   pPhysicalDeviceCount,
￿    VkPhysicalDevice*                           pPhysicalDevices);</code></pre>

        <h5>Description</h5>
        If {@code pPhysicalDevices} is {@code NULL}, then the number of physical devices available is returned in {@code pPhysicalDeviceCount}. Otherwise, {@code pPhysicalDeviceCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pPhysicalDevices} array, and on return the variable is overwritten with the number of handles actually written to {@code pPhysicalDevices}. If {@code pPhysicalDeviceCount} is less than the number of physical devices available, at most {@code pPhysicalDeviceCount} structures will be written. If {@code pPhysicalDeviceCount} is smaller than the number of physical devices available, #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available physical devices were returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code pPhysicalDeviceCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPhysicalDeviceCount} is not 0, and {@code pPhysicalDevices} is not {@code NULL}, {@code pPhysicalDevices} <b>must</b> be a valid pointer to an array of {@code pPhysicalDeviceCount} {@code VkPhysicalDevice} handles</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
            </ul></dd>
        </dl>
        """,

        VkInstance("instance", "a handle to a Vulkan instance previously created with #CreateInstance()."),
        AutoSize("pPhysicalDevices")..Check(1)..uint32_t.p("pPhysicalDeviceCount", "a pointer to an integer related to the number of physical devices available or queried, as described below."),
        nullable..VkPhysicalDevice.p("pPhysicalDevices", "either {@code NULL} or a pointer to an array of {@code VkPhysicalDevice} handles.")
    )

    void(
        "GetPhysicalDeviceFeatures",
        """
        Reports capabilities of a physical device.

        <h5>C Specification</h5>
        To query supported features, call:

        <pre><code>
￿void vkGetPhysicalDeviceFeatures(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkPhysicalDeviceFeatures*                   pFeatures);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pFeatures} <b>must</b> be a valid pointer to a ##VkPhysicalDeviceFeatures structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceFeatures
        """,

        VkPhysicalDevice("physicalDevice", "the physical device from which to query the supported features."),
        VkPhysicalDeviceFeatures.p("pFeatures", "a pointer to a ##VkPhysicalDeviceFeatures structure in which the physical device features are returned. For each feature, a value of #TRUE specifies that the feature is supported on this physical device, and #FALSE specifies that the feature is not supported.")
    )

    void(
        "GetPhysicalDeviceFormatProperties",
        """
        Lists physical device's format capabilities.

        <h5>C Specification</h5>
        To query supported format features which are properties of the physical device, call:

        <pre><code>
￿void vkGetPhysicalDeviceFormatProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkFormat                                    format,
￿    VkFormatProperties*                         pFormatProperties);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code pFormatProperties} <b>must</b> be a valid pointer to a ##VkFormatProperties structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkFormatProperties
        """,

        VkPhysicalDevice("physicalDevice", "the physical device from which to query the format properties."),
        VkFormat("format", "the format whose properties are queried."),
        VkFormatProperties.p("pFormatProperties", "a pointer to a ##VkFormatProperties structure in which physical device properties for {@code format} are returned.")
    )

    VkResult(
        "GetPhysicalDeviceImageFormatProperties",
        """
        Lists physical device's image format capabilities.

        <h5>C Specification</h5>
        To query additional capabilities specific to image types, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceImageFormatProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkFormat                                    format,
￿    VkImageType                                 type,
￿    VkImageTiling                               tiling,
￿    VkImageUsageFlags                           usage,
￿    VkImageCreateFlags                          flags,
￿    VkImageFormatProperties*                    pImageFormatProperties);</code></pre>

        <h5>Description</h5>
        The {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} parameters correspond to parameters that would be consumed by #CreateImage() (as members of ##VkImageCreateInfo).

        If {@code format} is not a supported image format, or if the combination of {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} is not supported for images, then {@code vkGetPhysicalDeviceImageFormatProperties} returns #ERROR_FORMAT_NOT_SUPPORTED.

        The limitations on an image format that are reported by {@code vkGetPhysicalDeviceImageFormatProperties} have the following property: if {@code usage1} and {@code usage2} of type {@code VkImageUsageFlags} are such that the bits set in {@code usage1} are a subset of the bits set in {@code usage2}, and {@code flags1} and {@code flags2} of type {@code VkImageCreateFlags} are such that the bits set in {@code flags1} are a subset of the bits set in {@code flags2}, then the limitations for {@code usage1} and {@code flags1} <b>must</b> be no more strict than the limitations for {@code usage2} and {@code flags2}, for all values of {@code format}, {@code type}, and {@code tiling}.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code tiling} <b>must</b> not be #IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT. (Use #GetPhysicalDeviceImageFormatProperties2() instead).</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
            <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
            <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
            <li>{@code usage} <b>must</b> not be 0</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
            <li>{@code pImageFormatProperties} <b>must</b> be a valid pointer to a ##VkImageFormatProperties structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_FORMAT_NOT_SUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkImageFormatProperties
        """,

        VkPhysicalDevice("physicalDevice", "the physical device from which to query the image capabilities."),
        VkFormat("format", "a {@code VkFormat} value specifying the image format, corresponding to ##VkImageCreateInfo{@code ::format}."),
        VkImageType("type", "a {@code VkImageType} value specifying the image type, corresponding to ##VkImageCreateInfo{@code ::imageType}."),
        VkImageTiling("tiling", "a {@code VkImageTiling} value specifying the image tiling, corresponding to ##VkImageCreateInfo{@code ::tiling}."),
        VkImageUsageFlags("usage", "a bitmask of {@code VkImageUsageFlagBits} specifying the intended usage of the image, corresponding to ##VkImageCreateInfo{@code ::usage}."),
        VkImageCreateFlags("flags", "a bitmask of {@code VkImageCreateFlagBits} specifying additional parameters of the image, corresponding to ##VkImageCreateInfo{@code ::flags}."),
        VkImageFormatProperties.p("pImageFormatProperties", "a pointer to a ##VkImageFormatProperties structure in which capabilities are returned.")
    )

    void(
        "GetPhysicalDeviceProperties",
        """
        Returns properties of a physical device.

        <h5>C Specification</h5>
        To query general properties of physical devices once enumerated, call:

        <pre><code>
￿void vkGetPhysicalDeviceProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkPhysicalDeviceProperties*                 pProperties);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pProperties} <b>must</b> be a valid pointer to a ##VkPhysicalDeviceProperties structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceProperties
        """,

        VkPhysicalDevice("physicalDevice", "the handle to the physical device whose properties will be queried."),
        VkPhysicalDeviceProperties.p("pProperties", "a pointer to a ##VkPhysicalDeviceProperties structure in which properties are returned.")
    )

    void(
        "GetPhysicalDeviceQueueFamilyProperties",
        """
        Reports properties of the queues of the specified physical device.

        <h5>C Specification</h5>
        To query properties of queues available on a physical device, call:

        <pre><code>
￿void vkGetPhysicalDeviceQueueFamilyProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pQueueFamilyPropertyCount,
￿    VkQueueFamilyProperties*                    pQueueFamilyProperties);</code></pre>

        <h5>Description</h5>
        If {@code pQueueFamilyProperties} is {@code NULL}, then the number of queue families available is returned in {@code pQueueFamilyPropertyCount}. Implementations <b>must</b> support at least one queue family. Otherwise, {@code pQueueFamilyPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pQueueFamilyProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pQueueFamilyProperties}. If {@code pQueueFamilyPropertyCount} is less than the number of queue families available, at most {@code pQueueFamilyPropertyCount} structures will be written.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pQueueFamilyPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pQueueFamilyPropertyCount} is not 0, and {@code pQueueFamilyProperties} is not {@code NULL}, {@code pQueueFamilyProperties} <b>must</b> be a valid pointer to an array of {@code pQueueFamilyPropertyCount} ##VkQueueFamilyProperties structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkQueueFamilyProperties
        """,

        VkPhysicalDevice("physicalDevice", "the handle to the physical device whose properties will be queried."),
        AutoSize("pQueueFamilyProperties")..Check(1)..uint32_t.p("pQueueFamilyPropertyCount", "a pointer to an integer related to the number of queue families available or queried, as described below."),
        nullable..VkQueueFamilyProperties.p("pQueueFamilyProperties", "either {@code NULL} or a pointer to an array of ##VkQueueFamilyProperties structures.")
    )

    void(
        "GetPhysicalDeviceMemoryProperties",
        """
        Reports memory information for the specified physical device.

        <h5>C Specification</h5>
        To query memory properties, call:

        <pre><code>
￿void vkGetPhysicalDeviceMemoryProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkPhysicalDeviceMemoryProperties*           pMemoryProperties);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pMemoryProperties} <b>must</b> be a valid pointer to a ##VkPhysicalDeviceMemoryProperties structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceMemoryProperties
        """,

        VkPhysicalDevice("physicalDevice", "the handle to the device to query."),
        VkPhysicalDeviceMemoryProperties.p("pMemoryProperties", "a pointer to a ##VkPhysicalDeviceMemoryProperties structure in which the properties are returned.")
    )

    GlobalCommand..PFN_vkVoidFunction(
        "GetInstanceProcAddr",
        """
        Return a function pointer for a command.

        <h5>C Specification</h5>
        Function pointers for all Vulkan commands <b>can</b> be obtained with the command:

        <pre><code>
￿PFN_vkVoidFunction vkGetInstanceProcAddr(
￿    VkInstance                                  instance,
￿    const char*                                 pName);</code></pre>

        <h5>Description</h5>
        {@code vkGetInstanceProcAddr} itself is obtained in a platform- and loader- specific manner. Typically, the loader library will export this command as a function symbol, so applications <b>can</b> link against the loader library, or load it dynamically and look up the symbol using platform-specific APIs.

        The table below defines the various use cases for {@code vkGetInstanceProcAddr} and expected return value ("{@code fp}" is "{@code function pointer}") for each case.

        The returned function pointer is of type {@code PFN_vkVoidFunction}, and must be cast to the type of the command being queried.

        <h6>vkGetInstanceProcAddr behavior</h6>
        <table class="lwjgl">
            <thead><tr><th>{@code instance}</th><th>{@code pName}</th><th>return value</th></tr></thead>
            <tbody>
                <tr><td>*<sup>1</sup></td><td>{@code NULL}</td><td>undefined</td></tr>
                <tr><td>invalid non-{@code NULL} instance</td><td>*<sup>1</sup></td><td>undefined</td></tr>
                <tr><td>{@code NULL}</td><td>#EnumerateInstanceVersion()</td><td>fp</td></tr>
                <tr><td>{@code NULL}</td><td>#EnumerateInstanceExtensionProperties()</td><td>fp</td></tr>
                <tr><td>{@code NULL}</td><td>#EnumerateInstanceLayerProperties()</td><td>fp</td></tr>
                <tr><td>{@code NULL}</td><td>#CreateInstance()</td><td>fp</td></tr>
                <tr><td>instance</td><td>core Vulkan command</td><td>fp<sup>2</sup></td></tr>
                <tr><td>instance</td><td>enabled instance extension commands for {@code instance}</td><td>fp<sup>2</sup></td></tr>
                <tr><td>instance</td><td>available device extension<sup>3</sup> commands for {@code instance}</td><td>fp<sup>2</sup></td></tr>
                <tr><td>any other case, not covered above</td><td>{@code NULL}</td></tr>
            </tbody>
        </table>

        <dl>
            <dt>1</dt>
            <dd>"*" means any representable value for the parameter (including valid values, invalid values, and {@code NULL}).</dd>

            <dt>2</dt>
            <dd>The returned function pointer <b>must</b> only be called with a dispatchable object (the first parameter) that is {@code instance} or a child of {@code instance}, e.g. {@code VkInstance}, {@code VkPhysicalDevice}, {@code VkDevice}, {@code VkQueue}, or {@code VkCommandBuffer}.</dd>

            <dt>3</dt>
            <dd>An “available device extension” is a device extension supported by any physical device enumerated by {@code instance}.</dd>
        </dl>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>If {@code instance} is not {@code NULL}, {@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code pName} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>

        <h5>See Also</h5>
        {@code PFN_vkVoidFunction}
        """,

        VkInstance("instance", "the instance that the function pointer will be compatible with, or {@code NULL} for commands not dependent on any instance."),
        charASCII.const.p("pName", "the name of the command to obtain.")
    )

    PFN_vkVoidFunction(
        "GetDeviceProcAddr",
        """
        Return a function pointer for a command.

        <h5>C Specification</h5>
        In order to support systems with multiple Vulkan implementations, the function pointers returned by {@code vkGetInstanceProcAddr} <b>may</b> point to dispatch code that calls a different real implementation for different {@code VkDevice} objects or their child objects. The overhead of the internal dispatch for {@code VkDevice} objects can be avoided by obtaining device-specific function pointers for any commands that use a device or device-child object as their dispatchable object. Such function pointers <b>can</b> be obtained with the command:

        <pre><code>
￿PFN_vkVoidFunction vkGetDeviceProcAddr(
￿    VkDevice                                    device,
￿    const char*                                 pName);</code></pre>

        <h5>Description</h5>
        The returned function pointer is of type {@code PFN_vkVoidFunction}, and must be cast to the type of the command being queried. The function pointer <b>must</b> only be called with a dispatchable object (the first parameter) that is {@code device} or a child of {@code device}.

        <h6>vkGetDeviceProcAddr behavior</h6>
        <table class="lwjgl">
            <thead><tr><th>{@code device}</th><th>{@code pName}</th><th>return value</th></tr></thead>
            <tbody>
                <tr><td>{@code NULL}</td><td>*<sup>1</sup></td><td>undefined</td></tr>
                <tr><td>invalid device</td><td>*<sup>1</sup></td><td>undefined</td></tr>
                <tr><td>device</td><td>{@code NULL}</td><td>undefined</td></tr>
                <tr><td>device</td><td>core device-level Vulkan command</td><td>fp<sup>2</sup></td></tr>
                <tr><td>device</td><td>enabled device extension device-level commands</td><td>fp<sup>2</sup></td></tr>
                <tr><td>any other case, not covered above</td><td>{@code NULL}</td></tr>
            </tbody>
        </table>

        <dl>
            <dt>1</dt>
            <dd>"*" means any representable value for the parameter (including valid values, invalid values, and {@code NULL}).</dd>

            <dt>2</dt>
            <dd>The returned function pointer <b>must</b> only be called with a dispatchable object (the first parameter) that is {@code device} or a child of {@code device} e.g. {@code VkDevice}, {@code VkQueue}, or {@code VkCommandBuffer}.</dd>
        </dl>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pName} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>

        <h5>See Also</h5>
        {@code PFN_vkVoidFunction}
        """,

        VkDevice("device", ""),
        charASCII.const.p("pName", "")
    )

    // Device commands

    VkResult(
        "CreateDevice",
        """
        Create a new device instance.

        <h5>C Specification</h5>
        A logical device is created as a <em>connection</em> to a physical device. To create a logical device, call:

        <pre><code>
￿VkResult vkCreateDevice(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkDeviceCreateInfo*                   pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkDevice*                                   pDevice);</code></pre>

        <h5>Description</h5>
        {@code vkCreateDevice} verifies that extensions and features requested in the {@code ppEnabledExtensionNames} and {@code pEnabledFeatures} members of {@code pCreateInfo}, respectively, are supported by the implementation. If any requested extension is not supported, {@code vkCreateDevice} <b>must</b> return #ERROR_EXTENSION_NOT_PRESENT. If any requested feature is not supported, {@code vkCreateDevice} <b>must</b> return #ERROR_FEATURE_NOT_PRESENT. Support for extensions <b>can</b> be checked before creating a device by querying #EnumerateDeviceExtensionProperties(). Support for features <b>can</b> similarly be checked by querying #GetPhysicalDeviceFeatures().

        After verifying and enabling the extensions the {@code VkDevice} object is created and returned to the application. If a requested extension is only supported by a layer, both the layer and the extension need to be specified at {@code vkCreateInstance} time for the creation to succeed.

        Multiple logical devices <b>can</b> be created from the same physical device. Logical device creation <b>may</b> fail due to lack of device-specific resources (in addition to the other errors). If that occurs, {@code vkCreateDevice} will return #ERROR_TOO_MANY_OBJECTS.

        <h5>Valid Usage</h5>
        <ul>
            <li>All <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#extendingvulkan-extensions-extensiondependencies">required extensions</a> for each extension in the ##VkDeviceCreateInfo{@code ::ppEnabledExtensionNames} list <b>must</b> also be present in that list.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkDeviceCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pDevice} <b>must</b> be a valid pointer to a {@code VkDevice} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_EXTENSION_NOT_PRESENT</li>
                <li>#ERROR_FEATURE_NOT_PRESENT</li>
                <li>#ERROR_TOO_MANY_OBJECTS</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkDeviceCreateInfo
        """,

        VkPhysicalDevice("physicalDevice", "<b>must</b> be one of the device handles returned from a call to {@code vkEnumeratePhysicalDevices} (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#devsandqueues-physical-device-enumeration\">Physical Device Enumeration</a>)."),
        VkDeviceCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkDeviceCreateInfo structure containing information about how to create the device."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkDevice.p("pDevice", "a pointer to a handle in which the created {@code VkDevice} is returned.")
    )

    void(
        "DestroyDevice",
        """
        Destroy a logical device.

        <h5>C Specification</h5>
        To destroy a device, call:

        <pre><code>
￿void vkDestroyDevice(
￿    VkDevice                                    device,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Description</h5>
        To ensure that no work is active on the device, #DeviceWaitIdle() <b>can</b> be used to gate the destruction of the device. Prior to destroying a device, an application is responsible for destroying/freeing any Vulkan objects that were created using that device as the first parameter of the corresponding {@code vkCreate*} or {@code vkAllocate*} command.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The lifetime of each of these objects is bound by the lifetime of the {@code VkDevice} object. Therefore, to avoid resource leaks, it is critical that an application explicitly free all of these resources prior to calling {@code vkDestroyDevice}.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>All child objects created on {@code device} <b>must</b> have been destroyed prior to destroying {@code device}</li>
            <li>If ##VkAllocationCallbacks were provided when {@code device} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code device} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>If {@code device} is not {@code NULL}, {@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code device} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Extension discovery commands

    GlobalCommand..VkResult(
        "EnumerateInstanceExtensionProperties",
        """
        Returns up to requested number of global extension properties.

        <h5>C Specification</h5>
        To query the available instance extensions, call:

        <pre><code>
￿VkResult vkEnumerateInstanceExtensionProperties(
￿    const char*                                 pLayerName,
￿    uint32_t*                                   pPropertyCount,
￿    VkExtensionProperties*                      pProperties);</code></pre>

        <h5>Description</h5>
        When {@code pLayerName} parameter is {@code NULL}, only extensions provided by the Vulkan implementation or by implicitly enabled layers are returned. When {@code pLayerName} is the name of a layer, the instance extensions provided by that layer are returned.

        If {@code pProperties} is {@code NULL}, then the number of extensions properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of extension properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of extensions available, #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available properties were returned.

        Because the list of available layers may change externally between calls to #EnumerateInstanceExtensionProperties(), two calls may retrieve different results if a {@code pLayerName} is available in one call but not in another. The extensions supported by a layer may also change between two calls, e.g. if the layer implementation is replaced by a different version between those calls.

        Implementations <b>must</b> not advertise any pair of extensions that cannot be enabled together due to behavioral differences, or any extension that cannot be enabled against the advertised version.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>If {@code pLayerName} is not {@code NULL}, {@code pLayerName} <b>must</b> be a null-terminated UTF-8 string</li>
            <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} ##VkExtensionProperties structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_LAYER_NOT_PRESENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkExtensionProperties
        """,

        nullable..charUTF8.const.p("pLayerName", "either {@code NULL} or a pointer to a null-terminated UTF-8 string naming the layer to retrieve extensions from."),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount", "a pointer to an integer related to the number of extension properties available or queried, as described below."),
        nullable..VkExtensionProperties.p("pProperties", "either {@code NULL} or a pointer to an array of ##VkExtensionProperties structures.")
    )

    VkResult(
        "EnumerateDeviceExtensionProperties",
        """
        Returns properties of available physical device extensions.

        <h5>C Specification</h5>
        To query the extensions available to a given physical device, call:

        <pre><code>
￿VkResult vkEnumerateDeviceExtensionProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    const char*                                 pLayerName,
￿    uint32_t*                                   pPropertyCount,
￿    VkExtensionProperties*                      pProperties);</code></pre>

        <h5>Description</h5>
        When {@code pLayerName} parameter is {@code NULL}, only extensions provided by the Vulkan implementation or by implicitly enabled layers are returned. When {@code pLayerName} is the name of a layer, the device extensions provided by that layer are returned.

        Implementations <b>must</b> not advertise any pair of extensions that cannot be enabled together due to behavioral differences, or any extension that cannot be enabled against the advertised version.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>If {@code pLayerName} is not {@code NULL}, {@code pLayerName} <b>must</b> be a null-terminated UTF-8 string</li>
            <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} ##VkExtensionProperties structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_LAYER_NOT_PRESENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkExtensionProperties
        """,

        VkPhysicalDevice("physicalDevice", "the physical device that will be queried."),
        nullable..charUTF8.const.p("pLayerName", "either {@code NULL} or a pointer to a null-terminated UTF-8 string naming the layer to retrieve extensions from."),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount", "a pointer to an integer related to the number of extension properties available or queried, and is treated in the same fashion as the #EnumerateInstanceExtensionProperties(){@code ::pPropertyCount} parameter."),
        nullable..VkExtensionProperties.p("pProperties", "either {@code NULL} or a pointer to an array of ##VkExtensionProperties structures.")
    )

    // Layer discovery commands

    GlobalCommand..VkResult(
        "EnumerateInstanceLayerProperties",
        """
        Returns up to requested number of global layer properties.

        <h5>C Specification</h5>
        To query the available layers, call:

        <pre><code>
￿VkResult vkEnumerateInstanceLayerProperties(
￿    uint32_t*                                   pPropertyCount,
￿    VkLayerProperties*                          pProperties);</code></pre>

        <h5>Description</h5>
        If {@code pProperties} is {@code NULL}, then the number of layer properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of layer properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of layers available, #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available layer properties were returned.

        The list of available layers may change at any time due to actions outside of the Vulkan implementation, so two calls to {@code vkEnumerateInstanceLayerProperties} with the same parameters <b>may</b> return different results, or retrieve different {@code pPropertyCount} values or {@code pProperties} contents. Once an instance has been created, the layers enabled for that instance will continue to be enabled and valid for the lifetime of that instance, even if some of them become unavailable for future instances.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} ##VkLayerProperties structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkLayerProperties
        """,

        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount", "a pointer to an integer related to the number of layer properties available or queried, as described below."),
        nullable..VkLayerProperties.p("pProperties", "either {@code NULL} or a pointer to an array of ##VkLayerProperties structures.")
    )

    VkResult(
        "EnumerateDeviceLayerProperties",
        """
        Returns properties of available physical device layers.

        <h5>C Specification</h5>
        To enumerate device layers, call:

        <pre><code>
￿VkResult vkEnumerateDeviceLayerProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pPropertyCount,
￿    VkLayerProperties*                          pProperties);</code></pre>

        <h5>Description</h5>
        If {@code pProperties} is {@code NULL}, then the number of layer properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of layer properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of layers available, #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available layer properties were returned.

        The list of layers enumerated by {@code vkEnumerateDeviceLayerProperties} <b>must</b> be exactly the sequence of layers enabled for the instance. The members of ##VkLayerProperties for each enumerated layer <b>must</b> be the same as the properties when the layer was enumerated by {@code vkEnumerateInstanceLayerProperties}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} ##VkLayerProperties structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkLayerProperties
        """,

        VkPhysicalDevice("physicalDevice", ""),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount", "a pointer to an integer related to the number of layer properties available or queried."),
        nullable..VkLayerProperties.p("pProperties", "either {@code NULL} or a pointer to an array of ##VkLayerProperties structures.")
    )

    // queue commands

    void(
        "GetDeviceQueue",
        """
        Get a queue handle from a device.

        <h5>C Specification</h5>
        To retrieve a handle to a {@code VkQueue} object, call:

        <pre><code>
￿void vkGetDeviceQueue(
￿    VkDevice                                    device,
￿    uint32_t                                    queueFamilyIndex,
￿    uint32_t                                    queueIndex,
￿    VkQueue*                                    pQueue);</code></pre>

        <h5>Description</h5>
        {@code vkGetDeviceQueue} <b>must</b> only be used to get queues that were created with the {@code flags} parameter of ##VkDeviceQueueCreateInfo set to zero. To get queues that were created with a non-zero {@code flags} parameter use #GetDeviceQueue2().

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code queueFamilyIndex} <b>must</b> be one of the queue family indices specified when {@code device} was created, via the ##VkDeviceQueueCreateInfo structure</li>
            <li>{@code queueIndex} <b>must</b> be less than the number of queues created for the specified queue family index when {@code device} was created, via the {@code queueCount} member of the ##VkDeviceQueueCreateInfo structure</li>
            <li>##VkDeviceQueueCreateInfo{@code ::flags} <b>must</b> have been set to zero when {@code device} was created</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pQueue} <b>must</b> be a valid pointer to a {@code VkQueue} handle</li>
        </ul>
        """,

        VkDevice("device", "the logical device that owns the queue."),
        uint32_t("queueFamilyIndex", "the index of the queue family to which the queue belongs."),
        uint32_t("queueIndex", "the index within this queue family of the queue to retrieve."),
        Check(1)..VkQueue.p("pQueue", "a pointer to a {@code VkQueue} object that will be filled with the handle for the requested queue.")
    )

    VkResult(
        "QueueSubmit",
        """
        Submits a sequence of semaphores or command buffers to a queue.

        <h5>C Specification</h5>
        To submit command buffers to a queue, call:

        <pre><code>
￿VkResult vkQueueSubmit(
￿    VkQueue                                     queue,
￿    uint32_t                                    submitCount,
￿    const VkSubmitInfo*                         pSubmits,
￿    VkFence                                     fence);</code></pre>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Submission can be a high overhead operation, and applications <b>should</b> attempt to batch work together into as few calls to {@code vkQueueSubmit} as possible.
        </div>

        {@code vkQueueSubmit} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#devsandqueues-submission">queue submission command</a>, with each batch defined by an element of {@code pSubmits}. Batches begin execution in the order they appear in {@code pSubmits}, but <b>may</b> complete out of order.

        Fence and semaphore operations submitted with #QueueSubmit() have additional ordering constraints compared to other submission commands, with dependencies involving previous and subsequent queue operations. Information about these additional constraints can be found in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-semaphores">semaphore</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-fences">fence</a> sections of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization">the synchronization chapter</a>.

        Details on the interaction of {@code pWaitDstStageMask} with synchronization are described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-semaphores-waiting">semaphore wait operation</a> section of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization">the synchronization chapter</a>.

        The order that batches appear in {@code pSubmits} is used to determine <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>, and thus all the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-implicit">implicit ordering guarantees</a> that respect it. Other than these implicit ordering guarantees and any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization">explicit synchronization primitives</a>, these batches <b>may</b> overlap or otherwise execute out of order.

        If any command buffer submitted to this queue is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">executable state</a>, it is moved to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a>. Once execution of all submissions of a command buffer complete, it moves from the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a>, back to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">executable state</a>. If a command buffer was recorded with the #COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT flag, it instead moves back to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">invalid state</a>.

        If {@code vkQueueSubmit} fails, it <b>may</b> return #ERROR_OUT_OF_HOST_MEMORY or #ERROR_OUT_OF_DEVICE_MEMORY. If it does, the implementation <b>must</b> ensure that the state and contents of any resources or synchronization primitives referenced by the submitted command buffers and any semaphores referenced by {@code pSubmits} is unaffected by the call or its failure. If {@code vkQueueSubmit} fails in such a way that the implementation is unable to make that guarantee, the implementation <b>must</b> return #ERROR_DEVICE_LOST. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#devsandqueues-lost-device">Lost Device</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be unsignaled</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
            <li>Any calls to #CmdSetEvent(), #CmdResetEvent() or #CmdWaitEvents() that have been recorded into any of the command buffer elements of the {@code pCommandBuffers} member of any element of {@code pSubmits}, <b>must</b> not reference any {@code VkEvent} that is referenced by any of those commands in a command buffer that has been submitted to another queue and is still in the <em>pending state</em></li>
            <li>Any stage flag included in any element of the {@code pWaitDstStageMask} member of any element of {@code pSubmits} <b>must</b> be a pipeline stage supported by one of the capabilities of {@code queue}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-supported">table of supported pipeline stages</a></li>
            <li>Each element of the {@code pSignalSemaphores} member of any element of {@code pSubmits} <b>must</b> be unsignaled when the semaphore signal operation it defines is executed on the device</li>
            <li>When a semaphore wait operation referring to a binary semaphore defined by any element of the {@code pWaitSemaphores} member of any element of {@code pSubmits} executes on {@code queue}, there <b>must</b> be no other queues waiting on the same semaphore</li>
            <li>All elements of the {@code pWaitSemaphores} member of all elements of {@code pSubmits} created with a {@code VkSemaphoreType} of #SEMAPHORE_TYPE_BINARY <b>must</b> reference a semaphore signal operation that has been submitted for execution and any semaphore signal operations on which it depends (if any) <b>must</b> have also been submitted for execution</li>
            <li>Each element of the {@code pCommandBuffers} member of each element of {@code pSubmits} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending or executable state</a></li>
            <li>If any element of the {@code pCommandBuffers} member of any element of {@code pSubmits} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT, it <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a></li>
            <li>Any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-secondary">secondary command buffers recorded</a> into any element of the {@code pCommandBuffers} member of any element of {@code pSubmits} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending or executable state</a></li>
            <li>If any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-secondary">secondary command buffers recorded</a> into any element of the {@code pCommandBuffers} member of any element of {@code pSubmits} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT, it <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a></li>
            <li>Each element of the {@code pCommandBuffers} member of each element of {@code pSubmits} <b>must</b> have been allocated from a {@code VkCommandPool} that was created for the same queue family {@code queue} belongs to</li>
            <li>If any element of {@code pSubmits}-&gt;pCommandBuffers includes a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers-acquire">Queue Family Transfer Acquire Operation</a>, there <b>must</b> exist a previously submitted <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers-release">Queue Family Transfer Release Operation</a> on a queue in the queue family identified by the acquire operation, with parameters matching the acquire operation as defined in the definition of such <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers-acquire">acquire operations</a>, and which happens before the acquire operation</li>
            <li>If a command recorded into any element of {@code pCommandBuffers} was a #CmdBeginQuery() whose {@code queryPool} was created with a {@code queryType} of #QUERY_TYPE_PERFORMANCE_QUERY_KHR, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#profiling-lock">profiling lock</a> <b>must</b> have been held continuously on the {@code VkDevice} that {@code queue} was retrieved from, throughout recording of those command buffers</li>
            <li>Any resource created with #SHARING_MODE_EXCLUSIVE that is read by an operation specified by {@code pSubmits} <b>must</b> not be owned by any queue family other than the one which {@code queue} belongs to, at the time it is executed</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
            <li>If {@code submitCount} is not 0, {@code pSubmits} <b>must</b> be a valid pointer to an array of {@code submitCount} valid ##VkSubmitInfo structures</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>Both of {@code fence}, and {@code queue} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>-</td><td>-</td><td>Any</td><td>-</td></tr></tbody>
        </table>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkSubmitInfo
        """,

        VkQueue("queue", "the queue that the command buffers will be submitted to."),
        AutoSize("pSubmits")..uint32_t("submitCount", "the number of elements in the {@code pSubmits} array."),
        nullable..VkSubmitInfo.const.p("pSubmits", "a pointer to an array of ##VkSubmitInfo structures, each specifying a command buffer submission batch."),
        VkFence("fence", "an optional: handle to a fence to be signaled once all submitted command buffers have completed execution. If {@code fence} is not #NULL_HANDLE, it defines a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-fences-signaling\">fence signal operation</a>.")
    )

    VkResult(
        "QueueWaitIdle",
        """
        Wait for a queue to become idle.

        <h5>C Specification</h5>
        To wait on the host for the completion of outstanding queue operations for a given queue, call:

        <pre><code>
￿VkResult vkQueueWaitIdle(
￿    VkQueue                                     queue);</code></pre>

        <h5>Description</h5>
        {@code vkQueueWaitIdle} is equivalent to submitting a fence to a queue and waiting with an infinite timeout for that fence to signal.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>-</td><td>-</td><td>Any</td><td>-</td></tr></tbody>
        </table>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>
        """,

        VkQueue("queue", "the queue on which to wait.")
    )

    VkResult(
        "DeviceWaitIdle",
        """
        Wait for a device to become idle.

        <h5>C Specification</h5>
        To wait on the host for the completion of outstanding queue operations for all queues on a given logical device, call:

        <pre><code>
￿VkResult vkDeviceWaitIdle(
￿    VkDevice                                    device);</code></pre>

        <h5>Description</h5>
        {@code vkDeviceWaitIdle} is equivalent to calling {@code vkQueueWaitIdle} for all queues owned by {@code device}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to all {@code VkQueue} objects created from {@code device} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device to idle.")
    )

    // Memory commands

    VkResult(
        "AllocateMemory",
        """
        Allocate device memory.

        <h5>C Specification</h5>
        To allocate memory objects, call:

        <pre><code>
￿VkResult vkAllocateMemory(
￿    VkDevice                                    device,
￿    const VkMemoryAllocateInfo*                 pAllocateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkDeviceMemory*                             pMemory);</code></pre>

        <h5>Description</h5>
        Allocations returned by {@code vkAllocateMemory} are guaranteed to meet any alignment requirement of the implementation. For example, if an implementation requires 128 byte alignment for images and 64 byte alignment for buffers, the device memory returned through this mechanism would be 128-byte aligned. This ensures that applications <b>can</b> correctly suballocate objects of different types (with potentially different alignment requirements) in the same memory object.

        When memory is allocated, its contents are undefined with the following constraint:

        <ul>
            <li>The contents of unprotected memory <b>must</b> not be a function of data protected memory objects, even if those memory objects were previously freed.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The contents of memory allocated by one application <b>should</b> not be a function of data from protected memory objects of another application, even if those memory objects were previously freed.
        </div>

        The maximum number of valid memory allocations that <b>can</b> exist simultaneously within a {@code VkDevice} <b>may</b> be restricted by implementation- or platform-dependent limits. If a call to #AllocateMemory() would cause the total number of allocations to exceed these limits, such a call will fail and <b>must</b> return #ERROR_TOO_MANY_OBJECTS. The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-maxMemoryAllocationCount">{@code maxMemoryAllocationCount}</a> feature describes the number of allocations that <b>can</b> exist simultaneously before encountering these internal limits.

        Some platforms <b>may</b> have a limit on the maximum size of a single allocation. For example, certain systems <b>may</b> fail to create allocations with a size greater than or equal to 4GB. Such a limit is implementation-dependent, and if such a failure occurs then the error #ERROR_OUT_OF_DEVICE_MEMORY <b>must</b> be returned. This limit is advertised in ##VkPhysicalDeviceMaintenance3Properties{@code ::maxMemoryAllocationSize}.

        The cumulative memory size allocated to a heap <b>can</b> be limited by the size of the specified heap. In such cases, allocated memory is tracked on a per-device and per-heap basis. Some platforms allow overallocation into other heaps. The overallocation behavior <b>can</b> be specified through the {@link AMDMemoryOverallocationBehavior VK_AMD_memory_overallocation_behavior} extension.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pAllocateInfo}-&gt;allocationSize <b>must</b> be less than or equal to sVkPhysicalDeviceMemoryProperties{@code ::memoryHeaps}[memindex].size where {@code memindex} = sVkPhysicalDeviceMemoryProperties{@code ::memoryTypes}[pAllocateInfo-&gt;memoryTypeIndex].heapIndex as returned by #GetPhysicalDeviceMemoryProperties() for the {@code VkPhysicalDevice} that {@code device} was created from.</li>
            <li>{@code pAllocateInfo}-&gt;memoryTypeIndex <b>must</b> be less than ##VkPhysicalDeviceMemoryProperties{@code ::memoryTypeCount} as returned by #GetPhysicalDeviceMemoryProperties() for the {@code VkPhysicalDevice} that {@code device} was created from.</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-deviceCoherentMemory">{@code deviceCoherentMemory}</a> feature is not enabled, {@code pAllocateInfo}-&gt;memoryTypeIndex <b>must</b> not identify a memory type supporting #MEMORY_PROPERTY_DEVICE_COHERENT_BIT_AMD</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pAllocateInfo} <b>must</b> be a valid pointer to a valid ##VkMemoryAllocateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pMemory} <b>must</b> be a valid pointer to a {@code VkDeviceMemory} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_TOO_MANY_OBJECTS</li>
                <li>#ERROR_INVALID_EXTERNAL_HANDLE</li>
                <li>#ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkMemoryAllocateInfo
        """,

        VkDevice("device", "the logical device that owns the memory."),
        VkMemoryAllocateInfo.const.p("pAllocateInfo", "a pointer to a ##VkMemoryAllocateInfo structure describing parameters of the allocation. A successful returned allocation <b>must</b> use the requested parameters&#8201;&#8212;&#8201;no substitution is permitted by the implementation."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkDeviceMemory.p("pMemory", "a pointer to a {@code VkDeviceMemory} handle in which information about the allocated memory is returned.")
    )

    void(
        "FreeMemory",
        """
        Free device memory.

        <h5>C Specification</h5>
        To free a memory object, call:

        <pre><code>
￿void vkFreeMemory(
￿    VkDevice                                    device,
￿    VkDeviceMemory                              memory,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Description</h5>
        Before freeing a memory object, an application <b>must</b> ensure the memory object is no longer in use by the device--for example by command buffers in the <em>pending state</em>. Memory <b>can</b> be freed whilst still bound to resources, but those resources <b>must</b> not be used afterwards. If there are still any bound images or buffers, the memory <b>may</b> not be immediately released by the implementation, but <b>must</b> be released by the time all bound images and buffers have been destroyed. Once memory is released, it is returned to the heap from which it was allocated.

        How memory objects are bound to Images and Buffers is described in detail in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-association">Resource Memory Association</a> section.

        If a memory object is mapped at the time it is freed, it is implicitly unmapped.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        As described <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#memory-device-unmap-does-not-flush">below</a>, host writes are not implicitly flushed when the memory object is unmapped, but the implementation <b>must</b> guarantee that writes that have not been flushed do not affect any other memory.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code memory} (via images or buffers) <b>must</b> have completed execution</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code memory} is not #NULL_HANDLE, {@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code memory} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code memory} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that owns the memory."),
        VkDeviceMemory("memory", "the {@code VkDeviceMemory} object to be freed."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "MapMemory",
        """
        Map a memory object into application address space.

        <h5>C Specification</h5>
        To retrieve a host virtual address pointer to a region of a mappable memory object, call:

        <pre><code>
￿VkResult vkMapMemory(
￿    VkDevice                                    device,
￿    VkDeviceMemory                              memory,
￿    VkDeviceSize                                offset,
￿    VkDeviceSize                                size,
￿    VkMemoryMapFlags                            flags,
￿    void**                                      ppData);</code></pre>

        <h5>Description</h5>
        After a successful call to {@code vkMapMemory} the memory object {@code memory} is considered to be currently <em>host mapped</em>.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        It is an application error to call {@code vkMapMemory} on a memory object that is already <em>host mapped</em>.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        {@code vkMapMemory} will fail if the implementation is unable to allocate an appropriately sized contiguous virtual address range, e.g. due to virtual address space fragmentation or platform limits. In such cases, {@code vkMapMemory} <b>must</b> return #ERROR_MEMORY_MAP_FAILED. The application <b>can</b> improve the likelihood of success by reducing the size of the mapped range and/or removing unneeded mappings using #UnmapMemory().
        </div>

        {@code vkMapMemory} does not check whether the device memory is currently in use before returning the host-accessible pointer. The application <b>must</b> guarantee that any previously submitted command that writes to this range has completed before the host reads from or writes to that range, and that any previously submitted command that reads from that range has completed before the host writes to that region (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-host-writes">here</a> for details on fulfilling such a guarantee). If the device memory was allocated without the #MEMORY_PROPERTY_HOST_COHERENT_BIT set, these guarantees <b>must</b> be made for an extended range: the application <b>must</b> round down the start of the range to the nearest multiple of ##VkPhysicalDeviceLimits{@code ::nonCoherentAtomSize}, and round the end of the range up to the nearest multiple of ##VkPhysicalDeviceLimits{@code ::nonCoherentAtomSize}.

        While a range of device memory is host mapped, the application is responsible for synchronizing both device and host access to that memory range.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        It is important for the application developer to become meticulously familiar with all of the mechanisms described in the chapter on <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization">Synchronization and Cache Control</a> as they are crucial to maintaining memory access ordering.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code memory} <b>must</b> not be currently host mapped</li>
            <li>{@code offset} <b>must</b> be less than the size of {@code memory}</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code size} <b>must</b> be greater than 0</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code size} <b>must</b> be less than or equal to the size of the {@code memory} minus {@code offset}</li>
            <li>{@code memory} <b>must</b> have been created with a memory type that reports #MEMORY_PROPERTY_HOST_VISIBLE_BIT</li>
            <li>{@code memory} <b>must</b> not have been allocated with multiple instances.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code ppData} <b>must</b> be a valid pointer to a pointer value</li>
            <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code memory} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_MEMORY_MAP_FAILED</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the memory."),
        VkDeviceMemory("memory", "the {@code VkDeviceMemory} object to be mapped."),
        VkDeviceSize("offset", "a zero-based byte offset from the beginning of the memory object."),
        VkDeviceSize("size", "the size of the memory range to map, or #WHOLE_SIZE to map from {@code offset} to the end of the allocation."),
        VkMemoryMapFlags("flags", "reserved for future use."),
        Check(1)..void.p.p("ppData", "a pointer to a {@code void *} variable in which is returned a host-accessible pointer to the beginning of the mapped range. This pointer minus {@code offset} <b>must</b> be aligned to at least ##VkPhysicalDeviceLimits{@code ::minMemoryMapAlignment}.")
    )

    void(
        "UnmapMemory",
        """
        Unmap a previously mapped memory object.

        <h5>C Specification</h5>
        To unmap a memory object once host access to it is no longer needed by the application, call:

        <pre><code>
￿void vkUnmapMemory(
￿    VkDevice                                    device,
￿    VkDeviceMemory                              memory);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code memory} <b>must</b> be currently host mapped</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code memory} <b>must</b> be externally synchronized</li>
        </ul>
        """,

        VkDevice("device", "the logical device that owns the memory."),
        VkDeviceMemory("memory", "the memory object to be unmapped.")
    )

    VkResult(
        "FlushMappedMemoryRanges",
        """
        Flush mapped memory ranges.

        <h5>C Specification</h5>
        To flush ranges of non-coherent memory from the host caches, call:

        <pre><code>
￿VkResult vkFlushMappedMemoryRanges(
￿    VkDevice                                    device,
￿    uint32_t                                    memoryRangeCount,
￿    const VkMappedMemoryRange*                  pMemoryRanges);</code></pre>

        <h5>Description</h5>
        {@code vkFlushMappedMemoryRanges} guarantees that host writes to the memory ranges described by {@code pMemoryRanges} are made available to the host memory domain, such that they <b>can</b> be made available to the device memory domain via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-available-and-visible">memory domain operations</a> using the #ACCESS_HOST_WRITE_BIT <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types">access type</a>.

        Within each range described by {@code pMemoryRanges}, each set of {@code nonCoherentAtomSize} bytes in that range is flushed if any byte in that set has been written by the host since it was first host mapped, or the last time it was flushed. If {@code pMemoryRanges} includes sets of {@code nonCoherentAtomSize} bytes where no bytes have been written by the host, those bytes <b>must</b> not be flushed.

        Unmapping non-coherent memory does not implicitly flush the host mapped memory, and host writes that have not been flushed <b>may</b> not ever be visible to the device. However, implementations <b>must</b> ensure that writes that have not been flushed do not become visible to any other memory.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The above guarantee avoids a potential memory corruption in scenarios where host writes to a mapped memory object have not been flushed before the memory is unmapped (or freed), and the virtual address range is subsequently reused for a different mapping (or memory allocation).
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pMemoryRanges} <b>must</b> be a valid pointer to an array of {@code memoryRangeCount} valid ##VkMappedMemoryRange structures</li>
            <li>{@code memoryRangeCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkMappedMemoryRange
        """,

        VkDevice("device", "the logical device that owns the memory ranges."),
        AutoSize("pMemoryRanges")..uint32_t("memoryRangeCount", "the length of the {@code pMemoryRanges} array."),
        VkMappedMemoryRange.const.p("pMemoryRanges", "a pointer to an array of ##VkMappedMemoryRange structures describing the memory ranges to flush.")
    )

    VkResult(
        "InvalidateMappedMemoryRanges",
        """
        Invalidate ranges of mapped memory objects.

        <h5>C Specification</h5>
        To invalidate ranges of non-coherent memory from the host caches, call:

        <pre><code>
￿VkResult vkInvalidateMappedMemoryRanges(
￿    VkDevice                                    device,
￿    uint32_t                                    memoryRangeCount,
￿    const VkMappedMemoryRange*                  pMemoryRanges);</code></pre>

        <h5>Description</h5>
        {@code vkInvalidateMappedMemoryRanges} guarantees that device writes to the memory ranges described by {@code pMemoryRanges}, which have been made available to the host memory domain using the #ACCESS_HOST_WRITE_BIT and #ACCESS_HOST_READ_BIT <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types">access types</a>, are made visible to the host. If a range of non-coherent memory is written by the host and then invalidated without first being flushed, its contents are undefined.

        Within each range described by {@code pMemoryRanges}, each set of {@code nonCoherentAtomSize} bytes in that range is invalidated if any byte in that set has been written by the device since it was first host mapped, or the last time it was invalidated.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Mapping non-coherent memory does not implicitly invalidate that memory.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pMemoryRanges} <b>must</b> be a valid pointer to an array of {@code memoryRangeCount} valid ##VkMappedMemoryRange structures</li>
            <li>{@code memoryRangeCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkMappedMemoryRange
        """,

        VkDevice("device", "the logical device that owns the memory ranges."),
        AutoSize("pMemoryRanges")..uint32_t("memoryRangeCount", "the length of the {@code pMemoryRanges} array."),
        VkMappedMemoryRange.const.p("pMemoryRanges", "a pointer to an array of ##VkMappedMemoryRange structures describing the memory ranges to invalidate.")
    )

    void(
        "GetDeviceMemoryCommitment",
        """
        Query the current commitment for a VkDeviceMemory.

        <h5>C Specification</h5>
        To determine the amount of lazily-allocated memory that is currently committed for a memory object, call:

        <pre><code>
￿void vkGetDeviceMemoryCommitment(
￿    VkDevice                                    device,
￿    VkDeviceMemory                              memory,
￿    VkDeviceSize*                               pCommittedMemoryInBytes);</code></pre>

        <h5>Description</h5>
        The implementation <b>may</b> update the commitment at any time, and the value returned by this query <b>may</b> be out of date.

        The implementation guarantees to allocate any committed memory from the {@code heapIndex} indicated by the memory type that the memory object was created with.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code memory} <b>must</b> have been created with a memory type that reports #MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code pCommittedMemoryInBytes} <b>must</b> be a valid pointer to a {@code VkDeviceSize} value</li>
            <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>
        """,

        VkDevice("device", "the logical device that owns the memory."),
        VkDeviceMemory("memory", "the memory object being queried."),
        Check(1)..VkDeviceSize.p("pCommittedMemoryInBytes", "a pointer to a {@code VkDeviceSize} value in which the number of bytes currently committed is returned, on success.")
    )

    // Memory management API commands

    VkResult(
        "BindBufferMemory",
        """
        Bind device memory to a buffer object.

        <h5>C Specification</h5>
        To attach memory to a buffer object, call:

        <pre><code>
￿VkResult vkBindBufferMemory(
￿    VkDevice                                    device,
￿    VkBuffer                                    buffer,
￿    VkDeviceMemory                              memory,
￿    VkDeviceSize                                memoryOffset);</code></pre>

        <h5>Description</h5>
        {@code vkBindBufferMemory} is equivalent to passing the same parameters through ##VkBindBufferMemoryInfo to #BindBufferMemory2().

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code buffer} <b>must</b> not already be backed by a memory object</li>
            <li>{@code buffer} <b>must</b> not have been created with any sparse memory binding flags</li>
            <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
            <li>{@code memory} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the ##VkMemoryRequirements structure returned from a call to {@code vkGetBufferMemoryRequirements} with {@code buffer}</li>
            <li>{@code memoryOffset} <b>must</b> be an integer multiple of the {@code alignment} member of the ##VkMemoryRequirements structure returned from a call to {@code vkGetBufferMemoryRequirements} with {@code buffer}</li>
            <li>The {@code size} member of the ##VkMemoryRequirements structure returned from a call to {@code vkGetBufferMemoryRequirements} with {@code buffer} <b>must</b> be less than or equal to the size of {@code memory} minus {@code memoryOffset}</li>
            <li>If {@code buffer} requires a dedicated allocation(as reported by #GetBufferMemoryRequirements2() in ##VkMemoryDedicatedRequirements::requiresDedicatedAllocation for {@code buffer}), {@code memory} <b>must</b> have been created with ##VkMemoryDedicatedAllocateInfo{@code ::buffer} equal to {@code buffer}</li>
            <li>If the ##VkMemoryAllocateInfo provided when {@code memory} was allocated included a ##VkMemoryDedicatedAllocateInfo structure in its {@code pNext} chain, and ##VkMemoryDedicatedAllocateInfo{@code ::buffer} was not #NULL_HANDLE, then {@code buffer} <b>must</b> equal ##VkMemoryDedicatedAllocateInfo{@code ::buffer}, and {@code memoryOffset} <b>must</b> be zero.</li>
            <li>If buffer was created with the #BUFFER_CREATE_PROTECTED_BIT bit set, the buffer <b>must</b> be bound to a memory object allocated with a memory type that reports #MEMORY_PROPERTY_PROTECTED_BIT</li>
            <li>If buffer was created with the #BUFFER_CREATE_PROTECTED_BIT bit not set, the buffer <b>must</b> not be bound to a memory object created with a memory type that reports #MEMORY_PROPERTY_PROTECTED_BIT</li>
            <li>If {@code buffer} was created with ##VkDedicatedAllocationBufferCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE, {@code memory} <b>must</b> have been created with ##VkDedicatedAllocationMemoryAllocateInfoNV{@code ::buffer} equal to a buffer handle created with identical creation parameters to {@code buffer} and {@code memoryOffset} <b>must</b> be zero</li>
            <li>If the value of ##VkExportMemoryAllocateInfo{@code ::handleTypes} used to allocate {@code memory} is not 0, it <b>must</b> include at least one of the handles set in ##VkExternalMemoryBufferCreateInfo{@code ::handleTypes} when {@code buffer} was created</li>
            <li>If {@code memory} was created by a memory import operation, the external handle type of the imported memory <b>must</b> also have been set in ##VkExternalMemoryBufferCreateInfo{@code ::handleTypes} when {@code buffer} was created</li>
            <li>If the ##VkPhysicalDeviceBufferDeviceAddressFeatures{@code ::bufferDeviceAddress} feature is enabled and {@code buffer} was created with the #BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT bit set, {@code memory} <b>must</b> have been allocated with the #MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT bit set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code buffer} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
            <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code buffer} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the buffer and memory."),
        VkBuffer("buffer", "the buffer to be attached to memory."),
        VkDeviceMemory("memory", "a {@code VkDeviceMemory} object describing the device memory to attach."),
        VkDeviceSize("memoryOffset", "the start offset of the region of {@code memory} which is to be bound to the buffer. The number of bytes returned in the ##VkMemoryRequirements{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified buffer.")
    )

    VkResult(
        "BindImageMemory",
        """
        Bind device memory to an image object.

        <h5>C Specification</h5>
        To attach memory to a {@code VkImage} object created without the #IMAGE_CREATE_DISJOINT_BIT set, call:

        <pre><code>
￿VkResult vkBindImageMemory(
￿    VkDevice                                    device,
￿    VkImage                                     image,
￿    VkDeviceMemory                              memory,
￿    VkDeviceSize                                memoryOffset);</code></pre>

        <h5>Description</h5>
        {@code vkBindImageMemory} is equivalent to passing the same parameters through ##VkBindImageMemoryInfo to #BindImageMemory2().

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code image} <b>must</b> not have been created with the #IMAGE_CREATE_DISJOINT_BIT set.</li>
            <li>{@code image} <b>must</b> not already be backed by a memory object</li>
            <li>{@code image} <b>must</b> not have been created with any sparse memory binding flags</li>
            <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
            <li>{@code memory} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the ##VkMemoryRequirements structure returned from a call to {@code vkGetImageMemoryRequirements} with {@code image}</li>
            <li>{@code memoryOffset} <b>must</b> be an integer multiple of the {@code alignment} member of the ##VkMemoryRequirements structure returned from a call to {@code vkGetImageMemoryRequirements} with {@code image}</li>
            <li>The {@code size} member of the ##VkMemoryRequirements structure returned from a call to {@code vkGetImageMemoryRequirements} with {@code image} <b>must</b> be less than or equal to the size of {@code memory} minus {@code memoryOffset}</li>
            <li>If {@code image} requires a dedicated allocation (as reported by #GetImageMemoryRequirements2() in ##VkMemoryDedicatedRequirements::requiresDedicatedAllocation for {@code image}), {@code memory} <b>must</b> have been created with ##VkMemoryDedicatedAllocateInfo{@code ::image} equal to {@code image}</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-dedicatedAllocationImageAliasing">dedicated allocation image aliasing</a> feature is not enabled, and the ##VkMemoryAllocateInfo provided when {@code memory} was allocated included a ##VkMemoryDedicatedAllocateInfo structure in its {@code pNext} chain, and ##VkMemoryDedicatedAllocateInfo{@code ::image} was not #NULL_HANDLE, then {@code image} <b>must</b> equal ##VkMemoryDedicatedAllocateInfo{@code ::image} and {@code memoryOffset} <b>must</b> be zero.</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-dedicatedAllocationImageAliasing">dedicated allocation image aliasing</a> feature is enabled, and the ##VkMemoryAllocateInfo provided when {@code memory} was allocated included a ##VkMemoryDedicatedAllocateInfo structure in its {@code pNext} chain, and ##VkMemoryDedicatedAllocateInfo{@code ::image} was not #NULL_HANDLE, then {@code memoryOffset} <b>must</b> be zero, and {@code image} <b>must</b> be either equal to ##VkMemoryDedicatedAllocateInfo{@code ::image} or an image that was created using the same parameters in ##VkImageCreateInfo, with the exception that {@code extent} and {@code arrayLayers} <b>may</b> differ subject to the following restrictions: every dimension in the {@code extent} parameter of the image being bound <b>must</b> be equal to or smaller than the original image for which the allocation was created; and the {@code arrayLayers} parameter of the image being bound <b>must</b> be equal to or smaller than the original image for which the allocation was created.</li>
            <li>If image was created with the #IMAGE_CREATE_PROTECTED_BIT bit set, the image <b>must</b> be bound to a memory object allocated with a memory type that reports #MEMORY_PROPERTY_PROTECTED_BIT</li>
            <li>If image was created with the #IMAGE_CREATE_PROTECTED_BIT bit not set, the image <b>must</b> not be bound to a memory object created with a memory type that reports #MEMORY_PROPERTY_PROTECTED_BIT</li>
            <li>If {@code image} was created with ##VkDedicatedAllocationImageCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE, {@code memory} <b>must</b> have been created with ##VkDedicatedAllocationMemoryAllocateInfoNV{@code ::image} equal to an image handle created with identical creation parameters to {@code image} and {@code memoryOffset} <b>must</b> be zero</li>
            <li>If the value of ##VkExportMemoryAllocateInfo{@code ::handleTypes} used to allocate {@code memory} is not 0, it <b>must</b> include at least one of the handles set in ##VkExternalMemoryImageCreateInfo{@code ::handleTypes} when {@code image} was created</li>
            <li>If {@code memory} was created by a memory import operation, the external handle type of the imported memory <b>must</b> also have been set in ##VkExternalMemoryImageCreateInfo{@code ::handleTypes} when {@code image} was created</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
            <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code image} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the image and memory."),
        VkImage("image", "the image."),
        VkDeviceMemory("memory", "the {@code VkDeviceMemory} object describing the device memory to attach."),
        VkDeviceSize("memoryOffset", "the start offset of the region of {@code memory} which is to be bound to the image. The number of bytes returned in the ##VkMemoryRequirements{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified image.")
    )

    void(
        "GetBufferMemoryRequirements",
        """
        Returns the memory requirements for specified Vulkan object.

        <h5>C Specification</h5>
        To determine the memory requirements for a buffer resource, call:

        <pre><code>
￿void vkGetBufferMemoryRequirements(
￿    VkDevice                                    device,
￿    VkBuffer                                    buffer,
￿    VkMemoryRequirements*                       pMemoryRequirements);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a ##VkMemoryRequirements structure</li>
            <li>{@code buffer} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkMemoryRequirements
        """,

        VkDevice("device", "the logical device that owns the buffer."),
        VkBuffer("buffer", "the buffer to query."),
        VkMemoryRequirements.p("pMemoryRequirements", "a pointer to a ##VkMemoryRequirements structure in which the memory requirements of the buffer object are returned.")
    )

    void(
        "GetImageMemoryRequirements",
        """
        Returns the memory requirements for specified Vulkan object.

        <h5>C Specification</h5>
        To determine the memory requirements for an image resource which is not created with the #IMAGE_CREATE_DISJOINT_BIT flag set, call:

        <pre><code>
￿void vkGetImageMemoryRequirements(
￿    VkDevice                                    device,
￿    VkImage                                     image,
￿    VkMemoryRequirements*                       pMemoryRequirements);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code image} <b>must</b> not have been created with the #IMAGE_CREATE_DISJOINT_BIT flag set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a ##VkMemoryRequirements structure</li>
            <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkMemoryRequirements
        """,

        VkDevice("device", "the logical device that owns the image."),
        VkImage("image", "the image to query."),
        VkMemoryRequirements.p("pMemoryRequirements", "a pointer to a ##VkMemoryRequirements structure in which the memory requirements of the image object are returned.")
    )

    // Sparse resource memory management API commands

    void(
        "GetImageSparseMemoryRequirements",
        """
        Query the memory requirements for a sparse image.

        <h5>C Specification</h5>
        To query sparse memory requirements for an image, call:

        <pre><code>
￿void vkGetImageSparseMemoryRequirements(
￿    VkDevice                                    device,
￿    VkImage                                     image,
￿    uint32_t*                                   pSparseMemoryRequirementCount,
￿    VkSparseImageMemoryRequirements*            pSparseMemoryRequirements);</code></pre>

        <h5>Description</h5>
        If {@code pSparseMemoryRequirements} is {@code NULL}, then the number of sparse memory requirements available is returned in {@code pSparseMemoryRequirementCount}. Otherwise, {@code pSparseMemoryRequirementCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSparseMemoryRequirements} array, and on return the variable is overwritten with the number of structures actually written to {@code pSparseMemoryRequirements}. If {@code pSparseMemoryRequirementCount} is less than the number of sparse memory requirements available, at most {@code pSparseMemoryRequirementCount} structures will be written.

        If the image was not created with #IMAGE_CREATE_SPARSE_RESIDENCY_BIT then {@code pSparseMemoryRequirementCount} will be set to zero and {@code pSparseMemoryRequirements} will not be written to.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        It is legal for an implementation to report a larger value in ##VkMemoryRequirements{@code ::size} than would be obtained by adding together memory sizes for all ##VkSparseImageMemoryRequirements returned by {@code vkGetImageSparseMemoryRequirements}. This <b>may</b> occur when the implementation requires unused padding in the address range describing the resource.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code pSparseMemoryRequirementCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pSparseMemoryRequirementCount} is not 0, and {@code pSparseMemoryRequirements} is not {@code NULL}, {@code pSparseMemoryRequirements} <b>must</b> be a valid pointer to an array of {@code pSparseMemoryRequirementCount} ##VkSparseImageMemoryRequirements structures</li>
            <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkSparseImageMemoryRequirements
        """,

        VkDevice("device", "the logical device that owns the image."),
        VkImage("image", "the {@code VkImage} object to get the memory requirements for."),
        AutoSize("pSparseMemoryRequirements")..Check(1)..uint32_t.p("pSparseMemoryRequirementCount", "a pointer to an integer related to the number of sparse memory requirements available or queried, as described below."),
        nullable..VkSparseImageMemoryRequirements.p("pSparseMemoryRequirements", "either {@code NULL} or a pointer to an array of ##VkSparseImageMemoryRequirements structures.")
    )

    void(
        "GetPhysicalDeviceSparseImageFormatProperties",
        """
        Retrieve properties of an image format applied to sparse images.

        <h5>C Specification</h5>
        {@code vkGetPhysicalDeviceSparseImageFormatProperties} returns an array of ##VkSparseImageFormatProperties. Each element will describe properties for one set of image aspects that are bound simultaneously in the image. This is usually one element for each aspect in the image, but for interleaved depth/stencil images there is only one element describing the combined aspects.

        <pre><code>
￿void vkGetPhysicalDeviceSparseImageFormatProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkFormat                                    format,
￿    VkImageType                                 type,
￿    VkSampleCountFlagBits                       samples,
￿    VkImageUsageFlags                           usage,
￿    VkImageTiling                               tiling,
￿    uint32_t*                                   pPropertyCount,
￿    VkSparseImageFormatProperties*              pProperties);</code></pre>

        <h5>Description</h5>
        If {@code pProperties} is {@code NULL}, then the number of sparse format properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of sparse format properties available, at most {@code pPropertyCount} structures will be written.

        If #IMAGE_CREATE_SPARSE_RESIDENCY_BIT is not supported for the given arguments, {@code pPropertyCount} will be set to zero upon return, and no data will be written to {@code pProperties}.

        Multiple aspects are returned for depth/stencil images that are implemented as separate planes by the implementation. The depth and stencil data planes each have unique ##VkSparseImageFormatProperties data.

        Depth/stencil images with depth and stencil data interleaved into a single plane will return a single ##VkSparseImageFormatProperties structure with the {@code aspectMask} set to #IMAGE_ASPECT_DEPTH_BIT | #IMAGE_ASPECT_STENCIL_BIT.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code samples} <b>must</b> be a bit value that is set in ##VkImageFormatProperties{@code ::sampleCounts} returned by {@code vkGetPhysicalDeviceImageFormatProperties} with {@code format}, {@code type}, {@code tiling}, and {@code usage} equal to those in this command and {@code flags} equal to the value that is set in ##VkImageCreateInfo{@code ::flags} when the image is created</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
            <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
            <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
            <li>{@code usage} <b>must</b> not be 0</li>
            <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
            <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} ##VkSparseImageFormatProperties structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkSparseImageFormatProperties
        """,

        VkPhysicalDevice("physicalDevice", "the physical device from which to query the sparse image capabilities."),
        VkFormat("format", "the image format."),
        VkImageType("type", "the dimensionality of image."),
        VkSampleCountFlagBits("samples", "the number of samples per texel as defined in {@code VkSampleCountFlagBits}."),
        VkImageUsageFlags("usage", "a bitmask describing the intended usage of the image."),
        VkImageTiling("tiling", "the tiling arrangement of the texel blocks in memory."),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount", "a pointer to an integer related to the number of sparse format properties available or queried, as described below."),
        nullable..VkSparseImageFormatProperties.p("pProperties", "either {@code NULL} or a pointer to an array of ##VkSparseImageFormatProperties structures.")
    )

    VkResult(
        "QueueBindSparse",
        """
        Bind device memory to a sparse resource object.

        <h5>C Specification</h5>
        To submit sparse binding operations to a queue, call:

        <pre><code>
￿VkResult vkQueueBindSparse(
￿    VkQueue                                     queue,
￿    uint32_t                                    bindInfoCount,
￿    const VkBindSparseInfo*                     pBindInfo,
￿    VkFence                                     fence);</code></pre>

        <h5>Description</h5>
        {@code vkQueueBindSparse} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#devsandqueues-submission">queue submission command</a>, with each batch defined by an element of {@code pBindInfo} as a ##VkBindSparseInfo structure. Batches begin execution in the order they appear in {@code pBindInfo}, but <b>may</b> complete out of order.

        Within a batch, a given range of a resource <b>must</b> not be bound more than once. Across batches, if a range is to be bound to one allocation and offset and then to another allocation and offset, then the application <b>must</b> guarantee (usually using semaphores) that the binding operations are executed in the correct order, as well as to order binding operations against the execution of command buffer submissions.

        As no operation to #QueueBindSparse() causes any pipeline stage to access memory, synchronization primitives used in this command effectively only define execution dependencies.

        Additional information about fence and semaphore operation is described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization">the synchronization chapter</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be unsignaled</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
            <li>Each element of the {@code pSignalSemaphores} member of each element of {@code pBindInfo} <b>must</b> be unsignaled when the semaphore signal operation it defines is executed on the device</li>
            <li>When a semaphore wait operation referring to a binary semaphore defined by any element of the {@code pWaitSemaphores} member of any element of {@code pBindInfo} executes on {@code queue}, there <b>must</b> be no other queues waiting on the same semaphore.</li>
            <li>All elements of the {@code pWaitSemaphores} member of all elements of {@code pBindInfo} member referring to a binary semaphore <b>must</b> be semaphores that are signaled, or have <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-semaphores-signaling">semaphore signal operations</a> previously submitted for execution.</li>
            <li>All elements of the {@code pWaitSemaphores} member of all elements of {@code pBindInfo} created with a {@code VkSemaphoreType} of #SEMAPHORE_TYPE_BINARY <b>must</b> reference a semaphore signal operation that has been submitted for execution and any semaphore signal operations on which it depends (if any) <b>must</b> have also been submitted for execution.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
            <li>If {@code bindInfoCount} is not 0, {@code pBindInfo} <b>must</b> be a valid pointer to an array of {@code bindInfoCount} valid ##VkBindSparseInfo structures</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>The {@code queue} <b>must</b> support sparse binding operations</li>
            <li>Both of {@code fence}, and {@code queue} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pBindInfo}[].pBufferBinds[].buffer <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pBindInfo}[].pImageOpaqueBinds[].image <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pBindInfo}[].pImageBinds[].image <b>must</b> be externally synchronized</li>
            <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>-</td><td>-</td><td>SPARSE_BINDING</td><td>-</td></tr></tbody>
        </table>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkBindSparseInfo
        """,

        VkQueue("queue", "the queue that the sparse binding operations will be submitted to."),
        AutoSize("pBindInfo")..uint32_t("bindInfoCount", "the number of elements in the {@code pBindInfo} array."),
        nullable..VkBindSparseInfo.const.p("pBindInfo", "a pointer to an array of ##VkBindSparseInfo structures, each specifying a sparse binding submission batch."),
        VkFence("fence", "an optional: handle to a fence to be signaled. If {@code fence} is not #NULL_HANDLE, it defines a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-fences-signaling\">fence signal operation</a>.")
    )

    // Fence commands

    VkResult(
        "CreateFence",
        """
        Create a new fence object.

        <h5>C Specification</h5>
        To create a fence, call:

        <pre><code>
￿VkResult vkCreateFence(
￿    VkDevice                                    device,
￿    const VkFenceCreateInfo*                    pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkFence*                                    pFence);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkFenceCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pFence} <b>must</b> be a valid pointer to a {@code VkFence} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkFenceCreateInfo
        """,

        VkDevice("device", "the logical device that creates the fence."),
        VkFenceCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkFenceCreateInfo structure containing information about how the fence is to be created."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkFence.p("pFence", "a pointer to a handle in which the resulting fence object is returned.")
    )

    void(
        "DestroyFence",
        """
        Destroy a fence object.

        <h5>C Specification</h5>
        To destroy a fence, call:

        <pre><code>
￿void vkDestroyFence(
￿    VkDevice                                    device,
￿    VkFence                                     fence,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#devsandqueues-submission">queue submission</a> commands that refer to {@code fence} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code fence} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code fence} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code fence} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the fence."),
        VkFence("fence", "the handle of the fence to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "ResetFences",
        """
        Resets one or more fence objects.

        <h5>C Specification</h5>
        To set the state of fences to unsignaled from the host, call:

        <pre><code>
￿VkResult vkResetFences(
￿    VkDevice                                    device,
￿    uint32_t                                    fenceCount,
￿    const VkFence*                              pFences);</code></pre>

        <h5>Description</h5>
        If any member of {@code pFences} currently has its <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-fences-importing">payload imported</a> with temporary permanence, that fence's prior permanent payload is first restored. The remaining operations described therefore operate on the restored payload.

        When #ResetFences() is executed on the host, it defines a <em>fence unsignal operation</em> for each fence, which resets the fence to the unsignaled state.

        If any member of {@code pFences} is already in the unsignaled state when #ResetFences() is executed, then #ResetFences() has no effect on that fence.

        <h5>Valid Usage</h5>
        <ul>
            <li>Each element of {@code pFences} <b>must</b> not be currently associated with any queue command that has not yet completed execution on that queue</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pFences} <b>must</b> be a valid pointer to an array of {@code fenceCount} valid {@code VkFence} handles</li>
            <li>{@code fenceCount} <b>must</b> be greater than 0</li>
            <li>Each element of {@code pFences} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to each member of {@code pFences} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the fences."),
        AutoSize("pFences")..uint32_t("fenceCount", "the number of fences to reset."),
        VkFence.const.p("pFences", "a pointer to an array of fence handles to reset.")
    )

    VkResult(
        "GetFenceStatus",
        """
        Return the status of a fence.

        <h5>C Specification</h5>
        To query the status of a fence from the host, call:

        <pre><code>
￿VkResult vkGetFenceStatus(
￿    VkDevice                                    device,
￿    VkFence                                     fence);</code></pre>

        <h5>Description</h5>
        Upon success, {@code vkGetFenceStatus} returns the status of the fence object, with the following return codes:

        <h6>Fence Object Status Codes</h6>
        <table class="lwjgl">
            <thead><tr><th>Status</th><th>Meaning</th></tr></thead>
            <tbody>
                <tr><td>#SUCCESS</td><td>The fence specified by {@code fence} is signaled.</td></tr>
                <tr><td>#NOT_READY</td><td>The fence specified by {@code fence} is unsignaled.</td></tr>
                <tr><td>#ERROR_DEVICE_LOST</td><td>The device has been lost.  See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#devsandqueues-lost-device">Lost Device</a>.</td></tr>
            </tbody>
        </table>

        If a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#devsandqueues-submission">queue submission</a> command is pending execution, then the value returned by this command <b>may</b> immediately be out of date.

        If the device has been lost (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#devsandqueues-lost-device">Lost Device</a>), {@code vkGetFenceStatus} <b>may</b> return any of the above status codes. If the device has been lost and {@code vkGetFenceStatus} is called repeatedly, it will eventually return either #SUCCESS or #ERROR_DEVICE_LOST.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>{@code fence} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#NOT_READY</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the fence."),
        VkFence("fence", "the handle of the fence to query.")
    )

    VkResult(
        "WaitForFences",
        """
        Wait for one or more fences to become signaled.

        <h5>C Specification</h5>
        To wait for one or more fences to enter the signaled state on the host, call:

        <pre><code>
￿VkResult vkWaitForFences(
￿    VkDevice                                    device,
￿    uint32_t                                    fenceCount,
￿    const VkFence*                              pFences,
￿    VkBool32                                    waitAll,
￿    uint64_t                                    timeout);</code></pre>

        <h5>Description</h5>
        If the condition is satisfied when {@code vkWaitForFences} is called, then {@code vkWaitForFences} returns immediately. If the condition is not satisfied at the time {@code vkWaitForFences} is called, then {@code vkWaitForFences} will block and wait up to {@code timeout} nanoseconds for the condition to become satisfied.

        If {@code timeout} is zero, then {@code vkWaitForFences} does not wait, but simply returns the current state of the fences. #TIMEOUT will be returned in this case if the condition is not satisfied, even though no actual wait was performed.

        If the specified timeout period expires before the condition is satisfied, {@code vkWaitForFences} returns #TIMEOUT. If the condition is satisfied before {@code timeout} nanoseconds has expired, {@code vkWaitForFences} returns #SUCCESS.

        If device loss occurs (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#devsandqueues-lost-device">Lost Device</a>) before the timeout has expired, {@code vkWaitForFences} <b>must</b> return in finite time with either #SUCCESS or #ERROR_DEVICE_LOST.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        While we guarantee that {@code vkWaitForFences} <b>must</b> return in finite time, no guarantees are made that it returns immediately upon device loss. However, the client can reasonably expect that the delay will be on the order of seconds and that calling {@code vkWaitForFences} will not result in a permanently (or seemingly permanently) dead process.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pFences} <b>must</b> be a valid pointer to an array of {@code fenceCount} valid {@code VkFence} handles</li>
            <li>{@code fenceCount} <b>must</b> be greater than 0</li>
            <li>Each element of {@code pFences} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#TIMEOUT</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the fences."),
        AutoSize("pFences")..uint32_t("fenceCount", "the number of fences to wait on."),
        VkFence.const.p("pFences", "a pointer to an array of {@code fenceCount} fence handles."),
        VkBool32("waitAll", "the condition that <b>must</b> be satisfied to successfully unblock the wait. If {@code waitAll} is #TRUE, then the condition is that all fences in {@code pFences} are signaled. Otherwise, the condition is that at least one fence in {@code pFences} is signaled."),
        uint64_t("timeout", "the timeout period in units of nanoseconds. {@code timeout} is adjusted to the closest value allowed by the implementation-dependent timeout accuracy, which <b>may</b> be substantially longer than one nanosecond, and <b>may</b> be longer than the requested period.")
    )

    // Queue semaphore commands

    VkResult(
        "CreateSemaphore",
        """
        Create a new queue semaphore object.

        <h5>C Specification</h5>
        To create a semaphore, call:

        <pre><code>
￿VkResult vkCreateSemaphore(
￿    VkDevice                                    device,
￿    const VkSemaphoreCreateInfo*                pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSemaphore*                                pSemaphore);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkSemaphoreCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pSemaphore} <b>must</b> be a valid pointer to a {@code VkSemaphore} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkSemaphoreCreateInfo
        """,

        VkDevice("device", "the logical device that creates the semaphore."),
        VkSemaphoreCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkSemaphoreCreateInfo structure containing information about how the semaphore is to be created."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkSemaphore.p("pSemaphore", "a pointer to a handle in which the resulting semaphore object is returned.")
    )

    void(
        "DestroySemaphore",
        """
        Destroy a semaphore object.

        <h5>C Specification</h5>
        To destroy a semaphore, call:

        <pre><code>
￿void vkDestroySemaphore(
￿    VkDevice                                    device,
￿    VkSemaphore                                 semaphore,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted batches that refer to {@code semaphore} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code semaphore} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code semaphore} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code semaphore} is not #NULL_HANDLE, {@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code semaphore} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the semaphore."),
        VkSemaphore("semaphore", "the handle of the semaphore to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Event commands

    VkResult(
        "CreateEvent",
        """
        Create a new event object.

        <h5>C Specification</h5>
        To create an event, call:

        <pre><code>
￿VkResult vkCreateEvent(
￿    VkDevice                                    device,
￿    const VkEventCreateInfo*                    pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkEvent*                                    pEvent);</code></pre>

        <h5>Description</h5>
        When created, the event object is in the unsignaled state.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkEventCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pEvent} <b>must</b> be a valid pointer to a {@code VkEvent} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkEventCreateInfo
        """,

        VkDevice("device", "the logical device that creates the event."),
        VkEventCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkEventCreateInfo structure containing information about how the event is to be created."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkEvent.p("pEvent", "a pointer to a handle in which the resulting event object is returned.")
    )

    void(
        "DestroyEvent",
        """
        Destroy an event object.

        <h5>C Specification</h5>
        To destroy an event, call:

        <pre><code>
￿void vkDestroyEvent(
￿    VkDevice                                    device,
￿    VkEvent                                     event,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code event} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code event} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code event} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code event} is not #NULL_HANDLE, {@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code event} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code event} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the event."),
        VkEvent("event", "the handle of the event to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "GetEventStatus",
        """
        Retrieve the status of an event object.

        <h5>C Specification</h5>
        To query the state of an event from the host, call:

        <pre><code>
￿VkResult vkGetEventStatus(
￿    VkDevice                                    device,
￿    VkEvent                                     event);</code></pre>

        <h5>Description</h5>
        Upon success, {@code vkGetEventStatus} returns the state of the event object with the following return codes:

        <h6>Event Object Status Codes</h6>
        <table class="lwjgl">
            <thead><tr><th>Status</th><th>Meaning</th></tr></thead>
            <tbody>
                <tr><td>#EVENT_SET</td><td>The event specified by {@code event} is signaled.</td></tr>
                <tr><td>#EVENT_RESET</td><td>The event specified by {@code event} is unsignaled.</td></tr>
            </tbody>
        </table>

        If a {@code vkCmdSetEvent} or {@code vkCmdResetEvent} command is in a command buffer that is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a>, then the value returned by this command <b>may</b> immediately be out of date.

        The state of an event <b>can</b> be updated by the host. The state of the event is immediately changed, and subsequent calls to {@code vkGetEventStatus} will return the new state. If an event is already in the requested state, then updating it to the same state has no effect.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>{@code event} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#EVENT_SET</li>
                <li>#EVENT_RESET</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the event."),
        VkEvent("event", "the handle of the event to query.")
    )

    VkResult(
        "SetEvent",
        """
        Set an event to signaled state.

        <h5>C Specification</h5>
        To set the state of an event to signaled from the host, call:

        <pre><code>
￿VkResult vkSetEvent(
￿    VkDevice                                    device,
￿    VkEvent                                     event);</code></pre>

        <h5>Description</h5>
        When #SetEvent() is executed on the host, it defines an <em>event signal operation</em> which sets the event to the signaled state.

        If {@code event} is already in the signaled state when #SetEvent() is executed, then #SetEvent() has no effect, and no event signal operation occurs.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>{@code event} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code event} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the event."),
        VkEvent("event", "the event to set.")
    )

    VkResult(
        "ResetEvent",
        """
        Reset an event to non-signaled state.

        <h5>C Specification</h5>
        To set the state of an event to unsignaled from the host, call:

        <pre><code>
￿VkResult vkResetEvent(
￿    VkDevice                                    device,
￿    VkEvent                                     event);</code></pre>

        <h5>Description</h5>
        When #ResetEvent() is executed on the host, it defines an <em>event unsignal operation</em> which resets the event to the unsignaled state.

        If {@code event} is already in the unsignaled state when #ResetEvent() is executed, then #ResetEvent() has no effect, and no event unsignal operation occurs.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code event} <b>must</b> not be waited on by a {@code vkCmdWaitEvents} command that is currently executing</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>{@code event} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code event} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the event."),
        VkEvent("event", "the event to reset.")
    )

    // Query commands

    VkResult(
        "CreateQueryPool",
        """
        Create a new query pool object.

        <h5>C Specification</h5>
        To create a query pool, call:

        <pre><code>
￿VkResult vkCreateQueryPool(
￿    VkDevice                                    device,
￿    const VkQueryPoolCreateInfo*                pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkQueryPool*                                pQueryPool);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkQueryPoolCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pQueryPool} <b>must</b> be a valid pointer to a {@code VkQueryPool} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkQueryPoolCreateInfo
        """,

        VkDevice("device", "the logical device that creates the query pool."),
        VkQueryPoolCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkQueryPoolCreateInfo structure containing the number and type of queries to be managed by the pool."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkQueryPool.p("pQueryPool", "a pointer to a {@code VkQueryPool} handle in which the resulting query pool object is returned.")
    )

    void(
        "DestroyQueryPool",
        """
        Destroy a query pool object.

        <h5>C Specification</h5>
        To destroy a query pool, call:

        <pre><code>
￿void vkDestroyQueryPool(
￿    VkDevice                                    device,
￿    VkQueryPool                                 queryPool,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code queryPool} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code queryPool} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code queryPool} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code queryPool} is not #NULL_HANDLE, {@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code queryPool} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code queryPool} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the query pool."),
        VkQueryPool("queryPool", "the query pool to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "GetQueryPoolResults",
        """
        Copy results of queries in a query pool to a host memory region.

        <h5>C Specification</h5>
        To retrieve status and results for a set of queries, call:

        <pre><code>
￿VkResult vkGetQueryPoolResults(
￿    VkDevice                                    device,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    firstQuery,
￿    uint32_t                                    queryCount,
￿    size_t                                      dataSize,
￿    void*                                       pData,
￿    VkDeviceSize                                stride,
￿    VkQueryResultFlags                          flags);</code></pre>

        <h5>Description</h5>
        The range of queries read is defined by <code>[firstQuery, firstQuery + queryCount - 1]</code>. For pipeline statistics queries, each query index in the pool contains one integer value for each bit that is enabled in ##VkQueryPoolCreateInfo{@code ::pipelineStatistics} when the pool is created.

        If no bits are set in {@code flags}, and all requested queries are in the available state, results are written as an array of 32-bit unsigned integer values. The behavior when not all queries are available, is described <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-wait-bit-not-set">below</a>.

        If #QUERY_RESULT_64_BIT is not set and the result overflows a 32-bit value, the value <b>may</b> either wrap or saturate. Similarly, if #QUERY_RESULT_64_BIT is set and the result overflows a 64-bit value, the value <b>may</b> either wrap or saturate.

        If #QUERY_RESULT_WAIT_BIT is set, Vulkan will wait for each query to be in the available state before retrieving the numerical results for that query. In this case, {@code vkGetQueryPoolResults} is guaranteed to succeed and return #SUCCESS if the queries become available in a finite time (i.e. if they have been issued and not reset). If queries will never finish (e.g. due to being reset but not issued), then {@code vkGetQueryPoolResults} <b>may</b> not return in finite time.

        If #QUERY_RESULT_WAIT_BIT and #QUERY_RESULT_PARTIAL_BIT are both not set then no result values are written to {@code pData} for queries that are in the unavailable state at the time of the call, and {@code vkGetQueryPoolResults} returns #NOT_READY. However, availability state is still written to {@code pData} for those queries if #QUERY_RESULT_WITH_AVAILABILITY_BIT is set.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>must</b> take care to ensure that use of the #QUERY_RESULT_WAIT_BIT bit has the desired effect.

        For example, if a query has been used previously and a command buffer records the commands {@code vkCmdResetQueryPool}, {@code vkCmdBeginQuery}, and {@code vkCmdEndQuery} for that query, then the query will remain in the available state until {@code vkResetQueryPool} is called or the {@code vkCmdResetQueryPool} command executes on a queue. Applications <b>can</b> use fences or events to ensure that a query has already been reset before checking for its results or availability status. Otherwise, a stale value could be returned from a previous use of the query.

        The above also applies when #QUERY_RESULT_WAIT_BIT is used in combination with #QUERY_RESULT_WITH_AVAILABILITY_BIT. In this case, the returned availability status <b>may</b> reflect the result of a previous use of the query unless {@code vkResetQueryPool} is called or the {@code vkCmdResetQueryPool} command has been executed since the last use of the query.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>can</b> double-buffer query pool usage, with a pool per frame, and reset queries at the end of the frame in which they are read.
        </div>

        If #QUERY_RESULT_PARTIAL_BIT is set, #QUERY_RESULT_WAIT_BIT is not set, and the query's status is unavailable, an intermediate result value between zero and the final result value is written to {@code pData} for that query.

        If #QUERY_RESULT_WITH_AVAILABILITY_BIT is set, the final integer value written for each query is non-zero if the query's status was available or zero if the status was unavailable. When #QUERY_RESULT_WITH_AVAILABILITY_BIT is used, implementations <b>must</b> guarantee that if they return a non-zero availability value then the numerical results <b>must</b> be valid, assuming the results are not reset by a subsequent command.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Satisfying this guarantee <b>may</b> require careful ordering by the application, e.g. to read the availability status before reading the results.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
            <li>If #QUERY_RESULT_64_BIT is not set in {@code flags}, then {@code pData} and {@code stride} <b>must</b> be multiples of 4</li>
            <li>If #QUERY_RESULT_64_BIT is not set in {@code flags} and the {@code queryType} used to create {@code queryPool} was not #QUERY_TYPE_PERFORMANCE_QUERY_KHR, then {@code pData} and {@code stride} <b>must</b> be multiples of 4</li>
            <li>If #QUERY_RESULT_64_BIT is set in {@code flags} then {@code pData} and {@code stride} <b>must</b> be multiples of 8</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PERFORMANCE_QUERY_KHR, then {@code pData} and {@code stride} <b>must</b> be multiples of the size of ##VkPerformanceCounterResultKHR</li>
            <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
            <li>{@code dataSize} <b>must</b> be large enough to contain the result of each query, as described <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-operation-memorylayout">here</a></li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_TIMESTAMP, {@code flags} <b>must</b> not contain #QUERY_RESULT_PARTIAL_BIT</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PERFORMANCE_QUERY_KHR, {@code flags} <b>must</b> not contain #QUERY_RESULT_WITH_AVAILABILITY_BIT, #QUERY_RESULT_PARTIAL_BIT or #QUERY_RESULT_64_BIT</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PERFORMANCE_QUERY_KHR, the {@code queryPool} <b>must</b> have been recorded once for each pass as retrieved via a call to #GetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR()</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryResultFlagBits} values</li>
            <li>{@code dataSize} <b>must</b> be greater than 0</li>
            <li>{@code queryPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#NOT_READY</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the query pool."),
        VkQueryPool("queryPool", "the query pool managing the queries containing the desired results."),
        uint32_t("firstQuery", "the initial query index."),
        uint32_t("queryCount", "the number of queries to read."),
        AutoSize("pData")..size_t("dataSize", "the size in bytes of the buffer pointed to by {@code pData}."),
        void.p("pData", "a pointer to a user-allocated buffer where the results will be written"),
        VkDeviceSize("stride", "the stride in bytes between results for individual queries within {@code pData}."),
        VkQueryResultFlags("flags", "a bitmask of {@code VkQueryResultFlagBits} specifying how and when results are returned.")
    )

    // Buffer commands

    VkResult(
        "CreateBuffer",
        """
        Create a new buffer object.

        <h5>C Specification</h5>
        To create buffers, call:

        <pre><code>
￿VkResult vkCreateBuffer(
￿    VkDevice                                    device,
￿    const VkBufferCreateInfo*                   pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkBuffer*                                   pBuffer);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@code flags} member of {@code pCreateInfo} includes #BUFFER_CREATE_SPARSE_BINDING_BIT, creating this {@code VkBuffer} <b>must</b> not cause the total required sparse memory for all currently valid sparse resources on the device to exceed ##VkPhysicalDeviceLimits{@code ::sparseAddressSpaceSize}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkBufferCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pBuffer} <b>must</b> be a valid pointer to a {@code VkBuffer} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkBufferCreateInfo
        """,

        VkDevice("device", "the logical device that creates the buffer object."),
        VkBufferCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkBufferCreateInfo structure containing parameters affecting creation of the buffer."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkBuffer.p("pBuffer", "a pointer to a {@code VkBuffer} handle in which the resulting buffer object is returned.")
    )

    void(
        "DestroyBuffer",
        """
        Destroy a buffer object.

        <h5>C Specification</h5>
        To destroy a buffer, call:

        <pre><code>
￿void vkDestroyBuffer(
￿    VkDevice                                    device,
￿    VkBuffer                                    buffer,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code buffer}, either directly or via a {@code VkBufferView}, <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code buffer} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code buffer} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code buffer} is not #NULL_HANDLE, {@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code buffer} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code buffer} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the buffer."),
        VkBuffer("buffer", "the buffer to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Buffer view commands

    VkResult(
        "CreateBufferView",
        """
        Create a new buffer view object.

        <h5>C Specification</h5>
        To create a buffer view, call:

        <pre><code>
￿VkResult vkCreateBufferView(
￿    VkDevice                                    device,
￿    const VkBufferViewCreateInfo*               pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkBufferView*                               pView);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkBufferViewCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pView} <b>must</b> be a valid pointer to a {@code VkBufferView} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkBufferViewCreateInfo
        """,

        VkDevice("device", "the logical device that creates the buffer view."),
        VkBufferViewCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkBufferViewCreateInfo structure containing parameters to be used to create the buffer."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkBufferView.p("pView", "a pointer to a {@code VkBufferView} handle in which the resulting buffer view object is returned.")
    )

    void(
        "DestroyBufferView",
        """
        Destroy a buffer view object.

        <h5>C Specification</h5>
        To destroy a buffer view, call:

        <pre><code>
￿void vkDestroyBufferView(
￿    VkDevice                                    device,
￿    VkBufferView                                bufferView,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code bufferView} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code bufferView} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code bufferView} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code bufferView} is not #NULL_HANDLE, {@code bufferView} <b>must</b> be a valid {@code VkBufferView} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code bufferView} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code bufferView} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the buffer view."),
        VkBufferView("bufferView", "the buffer view to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Image commands

    VkResult(
        "CreateImage",
        """
        Create a new image object.

        <h5>C Specification</h5>
        To create images, call:

        <pre><code>
￿VkResult vkCreateImage(
￿    VkDevice                                    device,
￿    const VkImageCreateInfo*                    pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkImage*                                    pImage);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@code flags} member of {@code pCreateInfo} includes #IMAGE_CREATE_SPARSE_BINDING_BIT, creating this {@code VkImage} <b>must</b> not cause the total required sparse memory for all currently valid sparse resources on the device to exceed ##VkPhysicalDeviceLimits{@code ::sparseAddressSpaceSize}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkImageCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pImage} <b>must</b> be a valid pointer to a {@code VkImage} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkImageCreateInfo
        """,

        VkDevice("device", "the logical device that creates the image."),
        VkImageCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkImageCreateInfo structure containing parameters to be used to create the image."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkImage.p("pImage", "a pointer to a {@code VkImage} handle in which the resulting image object is returned.")
    )

    void(
        "DestroyImage",
        """
        Destroy an image object.

        <h5>C Specification</h5>
        To destroy an image, call:

        <pre><code>
￿void vkDestroyImage(
￿    VkDevice                                    device,
￿    VkImage                                     image,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code image}, either directly or via a {@code VkImageView}, <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code image} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code image} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code image} is not #NULL_HANDLE, {@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code image} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code image} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the image."),
        VkImage("image", "the image to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "GetImageSubresourceLayout",
        """
        Retrieve information about an image subresource.

        <h5>C Specification</h5>
        To query the memory layout of an image subresource, call:

        <pre><code>
￿void vkGetImageSubresourceLayout(
￿    VkDevice                                    device,
￿    VkImage                                     image,
￿    const VkImageSubresource*                   pSubresource,
￿    VkSubresourceLayout*                        pLayout);</code></pre>

        <h5>Description</h5>
        If the image is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#glossary-linear-resource">linear</a>, then the returned layout is valid for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#memory-device-hostaccess">host access</a>.

        If the image's tiling is #IMAGE_TILING_LINEAR and its format is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, then {@code vkGetImageSubresourceLayout} describes one <em>format plane</em> of the image. If the image's tiling is #IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT, then {@code vkGetImageSubresourceLayout} describes one <em>memory plane</em> of the image. If the image's tiling is #IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT and the image is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#glossary-linear-resource">non-linear</a>, then the returned layout has an implementation-dependent meaning; the vendor of the image's <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#glossary-drm-format-modifier">DRM format modifier</a> <b>may</b> provide documentation that explains how to interpret the returned layout.

        {@code vkGetImageSubresourceLayout} is invariant for the lifetime of a single image.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code image} <b>must</b> have been created with {@code tiling} equal to #IMAGE_TILING_LINEAR or #IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT</li>
            <li>The {@code aspectMask} member of {@code pSubresource} <b>must</b> only have a single bit set</li>
            <li>The {@code mipLevel} member of {@code pSubresource} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>The {@code arrayLayer} member of {@code pSubresource} <b>must</b> be less than the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>If the {@code tiling} of the {@code image} is #IMAGE_TILING_LINEAR and its {@code format} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a> with two planes, the {@code aspectMask} member of {@code pSubresource} <b>must</b> be #IMAGE_ASPECT_PLANE_0_BIT or #IMAGE_ASPECT_PLANE_1_BIT</li>
            <li>If the {@code tiling} of the {@code image} is #IMAGE_TILING_LINEAR and its {@code format} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a> with three planes, the {@code aspectMask} member of {@code pSubresource} <b>must</b> be #IMAGE_ASPECT_PLANE_0_BIT, #IMAGE_ASPECT_PLANE_1_BIT or #IMAGE_ASPECT_PLANE_2_BIT</li>
            <li>If the {@code tiling} of the {@code image} is #IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT, then the {@code aspectMask} member of {@code pSubresource} <b>must</b> be {@code VK_IMAGE_ASPECT_MEMORY_PLANE_i_BIT_EXT} and the index {@code i} <b>must</b> be less than the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkDrmFormatModifierPropertiesEXT">{@code drmFormatModifierPlaneCount}</a> associated with the image&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkImageCreateInfo">{@code format}</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkImageDrmFormatModifierPropertiesEXT">{@code drmFormatModifier}</a>.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code pSubresource} <b>must</b> be a valid pointer to a valid ##VkImageSubresource structure</li>
            <li>{@code pLayout} <b>must</b> be a valid pointer to a ##VkSubresourceLayout structure</li>
            <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageSubresource, ##VkSubresourceLayout
        """,

        VkDevice("device", "the logical device that owns the image."),
        VkImage("image", "the image whose layout is being queried."),
        VkImageSubresource.const.p("pSubresource", "a pointer to a ##VkImageSubresource structure selecting a specific image for the image subresource."),
        VkSubresourceLayout.p("pLayout", "a pointer to a ##VkSubresourceLayout structure in which the layout is returned.")
    )

    // Image view commands

    VkResult(
        "CreateImageView",
        """
        Create an image view from an existing image.

        <h5>C Specification</h5>
        To create an image view, call:

        <pre><code>
￿VkResult vkCreateImageView(
￿    VkDevice                                    device,
￿    const VkImageViewCreateInfo*                pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkImageView*                                pView);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkImageViewCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pView} <b>must</b> be a valid pointer to a {@code VkImageView} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkImageViewCreateInfo
        """,

        VkDevice("device", "the logical device that creates the image view."),
        VkImageViewCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkImageViewCreateInfo structure containing parameters to be used to create the image view."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkImageView.p("pView", "a pointer to a {@code VkImageView} handle in which the resulting image view object is returned.")
    )

    void(
        "DestroyImageView",
        """
        Destroy an image view object.

        <h5>C Specification</h5>
        To destroy an image view, call:

        <pre><code>
￿void vkDestroyImageView(
￿    VkDevice                                    device,
￿    VkImageView                                 imageView,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code imageView} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code imageView} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code imageView} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code imageView} is not #NULL_HANDLE, {@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code imageView} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code imageView} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the image view."),
        VkImageView("imageView", "the image view to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Shader commands

    VkResult(
        "CreateShaderModule",
        """
        Creates a new shader module object.

        <h5>C Specification</h5>
        To create a shader module, call:

        <pre><code>
￿VkResult vkCreateShaderModule(
￿    VkDevice                                    device,
￿    const VkShaderModuleCreateInfo*             pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkShaderModule*                             pShaderModule);</code></pre>

        <h5>Description</h5>
        Once a shader module has been created, any entry points it contains <b>can</b> be used in pipeline shader stages as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#pipelines-compute">Compute Pipelines</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#pipelines-graphics">Graphics Pipelines</a>.

        If the shader stage fails to compile #ERROR_INVALID_SHADER_NV will be generated and the compile log will be reported back to the application by {@link EXTDebugReport VK_EXT_debug_report} if enabled.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkShaderModuleCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pShaderModule} <b>must</b> be a valid pointer to a {@code VkShaderModule} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INVALID_SHADER_NV</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkShaderModuleCreateInfo
        """,

        VkDevice("device", "the logical device that creates the shader module."),
        VkShaderModuleCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkShaderModuleCreateInfo structure."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkShaderModule.p("pShaderModule", "a pointer to a {@code VkShaderModule} handle in which the resulting shader module object is returned.")
    )

    void(
        "DestroyShaderModule",
        """
        Destroy a shader module.

        <h5>C Specification</h5>
        To destroy a shader module, call:

        <pre><code>
￿void vkDestroyShaderModule(
￿    VkDevice                                    device,
￿    VkShaderModule                              shaderModule,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Description</h5>
        A shader module <b>can</b> be destroyed while pipelines created using its shaders are still in use.

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code shaderModule} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code shaderModule} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code shaderModule} is not #NULL_HANDLE, {@code shaderModule} <b>must</b> be a valid {@code VkShaderModule} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code shaderModule} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code shaderModule} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the shader module."),
        VkShaderModule("shaderModule", "the handle of the shader module to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Pipeline Cache commands

    VkResult(
        "CreatePipelineCache",
        """
        Creates a new pipeline cache.

        <h5>C Specification</h5>
        To create pipeline cache objects, call:

        <pre><code>
￿VkResult vkCreatePipelineCache(
￿    VkDevice                                    device,
￿    const VkPipelineCacheCreateInfo*            pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkPipelineCache*                            pPipelineCache);</code></pre>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>can</b> track and manage the total host memory size of a pipeline cache object using the {@code pAllocator}. Applications <b>can</b> limit the amount of data retrieved from a pipeline cache object in {@code vkGetPipelineCacheData}. Implementations <b>should</b> not internally limit the total number of entries added to a pipeline cache object or the total host memory consumed.
        </div>

        Once created, a pipeline cache <b>can</b> be passed to the {@code vkCreateGraphicsPipelines} and {@code vkCreateComputePipelines} commands. If the pipeline cache passed into these commands is not #NULL_HANDLE, the implementation will query it for possible reuse opportunities and update it with new content. The use of the pipeline cache object in these commands is internally synchronized, and the same pipeline cache object <b>can</b> be used in multiple threads simultaneously.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Implementations <b>should</b> make every effort to limit any critical sections to the actual accesses to the cache, which is expected to be significantly shorter than the duration of the {@code vkCreateGraphicsPipelines} and {@code vkCreateComputePipelines} commands.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkPipelineCacheCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pPipelineCache} <b>must</b> be a valid pointer to a {@code VkPipelineCache} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkPipelineCacheCreateInfo
        """,

        VkDevice("device", "the logical device that creates the pipeline cache object."),
        VkPipelineCacheCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkPipelineCacheCreateInfo structure containing initial parameters for the pipeline cache object."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkPipelineCache.p("pPipelineCache", "a pointer to a {@code VkPipelineCache} handle in which the resulting pipeline cache object is returned.")
    )

    void(
        "DestroyPipelineCache",
        """
        Destroy a pipeline cache object.

        <h5>C Specification</h5>
        To destroy a pipeline cache, call:

        <pre><code>
￿void vkDestroyPipelineCache(
￿    VkDevice                                    device,
￿    VkPipelineCache                             pipelineCache,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code pipelineCache} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code pipelineCache} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pipelineCache} is not #NULL_HANDLE, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pipelineCache} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the pipeline cache object."),
        VkPipelineCache("pipelineCache", "the handle of the pipeline cache to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "GetPipelineCacheData",
        """
        Get the data store from a pipeline cache.

        <h5>C Specification</h5>
        Data <b>can</b> be retrieved from a pipeline cache object using the command:

        <pre><code>
￿VkResult vkGetPipelineCacheData(
￿    VkDevice                                    device,
￿    VkPipelineCache                             pipelineCache,
￿    size_t*                                     pDataSize,
￿    void*                                       pData);</code></pre>

        <h5>Description</h5>
        If {@code pData} is {@code NULL}, then the maximum size of the data that <b>can</b> be retrieved from the pipeline cache, in bytes, is returned in {@code pDataSize}. Otherwise, {@code pDataSize} <b>must</b> point to a variable set by the user to the size of the buffer, in bytes, pointed to by {@code pData}, and on return the variable is overwritten with the amount of data actually written to {@code pData}.

        If {@code pDataSize} is less than the maximum size that <b>can</b> be retrieved by the pipeline cache, at most {@code pDataSize} bytes will be written to {@code pData}, and {@code vkGetPipelineCacheData} will return #INCOMPLETE. Any data written to {@code pData} is valid and <b>can</b> be provided as the {@code pInitialData} member of the ##VkPipelineCacheCreateInfo structure passed to {@code vkCreatePipelineCache}.

        Two calls to {@code vkGetPipelineCacheData} with the same parameters <b>must</b> retrieve the same data unless a command that modifies the contents of the cache is called between them.

        Applications <b>can</b> store the data retrieved from the pipeline cache, and use these data, possibly in a future run of the application, to populate new pipeline cache objects. The results of pipeline compiles, however, <b>may</b> depend on the vendor ID, device ID, driver version, and other details of the device. To enable applications to detect when previously retrieved data is incompatible with the device, the initial bytes written to {@code pData} <b>must</b> be a header consisting of the following members:

        <h6>Layout for pipeline cache header version #PIPELINE_CACHE_HEADER_VERSION_ONE</h6>
        <table class="lwjgl">
            <thead><tr><th>Offset</th><th>Size</th><th>Meaning</th></tr></thead>
            <tbody>
                <tr><td>0</td><td>4</td><td>length in bytes of the entire pipeline cache header written as a stream of bytes, with the least significant byte first</td></tr>
                <tr><td>4</td><td>4</td><td>a {@code VkPipelineCacheHeaderVersion} value written as a stream of bytes, with the least significant byte first</td></tr>
                <tr><td>8</td><td>4</td><td>a vendor ID equal to ##VkPhysicalDeviceProperties{@code ::vendorID} written as a stream of bytes, with the least significant byte first</td></tr>
                <tr><td>12</td><td>4</td><td>a device ID equal to ##VkPhysicalDeviceProperties{@code ::deviceID} written as a stream of bytes, with the least significant byte first</td></tr>
                <tr><td>16</td><td>#UUID_SIZE</td><td>a pipeline cache ID equal to ##VkPhysicalDeviceProperties{@code ::pipelineCacheUUID}</td></tr>
            </tbody>
        </table>

        The first four bytes encode the length of the entire pipeline cache header, in bytes. This value includes all fields in the header including the pipeline cache version field and the size of the length field.

        The next four bytes encode the pipeline cache version, as described for {@code VkPipelineCacheHeaderVersion}. A consumer of the pipeline cache <b>should</b> use the cache version to interpret the remainder of the cache header.

        If {@code pDataSize} is less than what is necessary to store this header, nothing will be written to {@code pData} and zero will be written to {@code pDataSize}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
            <li>{@code pDataSize} <b>must</b> be a valid pointer to a {@code size_t} value</li>
            <li>If the value referenced by {@code pDataSize} is not 0, and {@code pData} is not {@code NULL}, {@code pData} <b>must</b> be a valid pointer to an array of {@code pDataSize} bytes</li>
            <li>{@code pipelineCache} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the pipeline cache."),
        VkPipelineCache("pipelineCache", "the pipeline cache to retrieve data from."),
        AutoSize("pData")..Check(1)..size_t.p("pDataSize", "a pointer to a {@code size_t} value related to the amount of data in the pipeline cache, as described below."),
        nullable..void.p("pData", "either {@code NULL} or a pointer to a buffer.")
    )

    VkResult(
        "MergePipelineCaches",
        """
        Combine the data stores of pipeline caches.

        <h5>C Specification</h5>
        Pipeline cache objects <b>can</b> be merged using the command:

        <pre><code>
￿VkResult vkMergePipelineCaches(
￿    VkDevice                                    device,
￿    VkPipelineCache                             dstCache,
￿    uint32_t                                    srcCacheCount,
￿    const VkPipelineCache*                      pSrcCaches);</code></pre>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The details of the merge operation are implementation dependent, but implementations <b>should</b> merge the contents of the specified pipelines and prune duplicate entries.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dstCache} <b>must</b> not appear in the list of source caches</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code dstCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
            <li>{@code pSrcCaches} <b>must</b> be a valid pointer to an array of {@code srcCacheCount} valid {@code VkPipelineCache} handles</li>
            <li>{@code srcCacheCount} <b>must</b> be greater than 0</li>
            <li>{@code dstCache} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
            <li>Each element of {@code pSrcCaches} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code dstCache} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the pipeline cache objects."),
        VkPipelineCache("dstCache", "the handle of the pipeline cache to merge results into."),
        AutoSize("pSrcCaches")..uint32_t("srcCacheCount", "the length of the {@code pSrcCaches} array."),
        VkPipelineCache.const.p("pSrcCaches", "a pointer to an array of pipeline cache handles, which will be merged into {@code dstCache}. The previous contents of {@code dstCache} are included after the merge.")
    )

    // Pipeline commands

    VkResult(
        "CreateGraphicsPipelines",
        """
        Create graphics pipelines.

        <h5>C Specification</h5>
        To create graphics pipelines, call:

        <pre><code>
￿VkResult vkCreateGraphicsPipelines(
￿    VkDevice                                    device,
￿    VkPipelineCache                             pipelineCache,
￿    uint32_t                                    createInfoCount,
￿    const VkGraphicsPipelineCreateInfo*         pCreateInfos,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkPipeline*                                 pPipelines);</code></pre>

        <h5>Description</h5>
        The ##VkGraphicsPipelineCreateInfo structure includes an array of shader create info structures containing all the desired active shader stages, as well as creation info to define all relevant fixed-function stages, and a pipeline layout.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@code flags} member of any element of {@code pCreateInfos} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and the {@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} <b>must</b> be less than the index into {@code pCreateInfos} that corresponds to that element</li>
            <li>If the {@code flags} member of any element of {@code pCreateInfos} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, the base pipeline <b>must</b> have been created with the #PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT flag set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pipelineCache} is not #NULL_HANDLE, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
            <li>{@code pCreateInfos} <b>must</b> be a valid pointer to an array of {@code createInfoCount} valid ##VkGraphicsPipelineCreateInfo structures</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pPipelines} <b>must</b> be a valid pointer to an array of {@code createInfoCount} {@code VkPipeline} handles</li>
            <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
            <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INVALID_SHADER_NV</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkGraphicsPipelineCreateInfo
        """,

        VkDevice("device", "the logical device that creates the graphics pipelines."),
        VkPipelineCache("pipelineCache", "either #NULL_HANDLE, indicating that pipeline caching is disabled; or the handle of a valid <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#pipelines-cache\">pipeline cache</a> object, in which case use of that cache is enabled for the duration of the command."),
        AutoSize("pCreateInfos", "pPipelines")..uint32_t("createInfoCount", "the length of the {@code pCreateInfos} and {@code pPipelines} arrays."),
        VkGraphicsPipelineCreateInfo.const.p("pCreateInfos", "a pointer to an array of ##VkGraphicsPipelineCreateInfo structures."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        VkPipeline.p("pPipelines", "a pointer to an array of {@code VkPipeline} handles in which the resulting graphics pipeline objects are returned.")
    )

    VkResult(
        "CreateComputePipelines",
        """
        Creates a new compute pipeline object.

        <h5>C Specification</h5>
        To create compute pipelines, call:

        <pre><code>
￿VkResult vkCreateComputePipelines(
￿    VkDevice                                    device,
￿    VkPipelineCache                             pipelineCache,
￿    uint32_t                                    createInfoCount,
￿    const VkComputePipelineCreateInfo*          pCreateInfos,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkPipeline*                                 pPipelines);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@code flags} member of any element of {@code pCreateInfos} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and the {@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} <b>must</b> be less than the index into {@code pCreateInfos} that corresponds to that element</li>
            <li>If the {@code flags} member of any element of {@code pCreateInfos} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, the base pipeline <b>must</b> have been created with the #PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT flag set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pipelineCache} is not #NULL_HANDLE, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
            <li>{@code pCreateInfos} <b>must</b> be a valid pointer to an array of {@code createInfoCount} valid ##VkComputePipelineCreateInfo structures</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pPipelines} <b>must</b> be a valid pointer to an array of {@code createInfoCount} {@code VkPipeline} handles</li>
            <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
            <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INVALID_SHADER_NV</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkComputePipelineCreateInfo
        """,

        VkDevice("device", "the logical device that creates the compute pipelines."),
        VkPipelineCache("pipelineCache", "either #NULL_HANDLE, indicating that pipeline caching is disabled; or the handle of a valid <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#pipelines-cache\">pipeline cache</a> object, in which case use of that cache is enabled for the duration of the command."),
        AutoSize("pCreateInfos", "pPipelines")..uint32_t("createInfoCount", "the length of the {@code pCreateInfos} and {@code pPipelines} arrays."),
        VkComputePipelineCreateInfo.const.p("pCreateInfos", "a pointer to an array of ##VkComputePipelineCreateInfo structures."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        VkPipeline.p("pPipelines", "a pointer to an array of {@code VkPipeline} handles in which the resulting compute pipeline objects are returned.")
    )

    void(
        "DestroyPipeline",
        """
        Destroy a pipeline object.

        <h5>C Specification</h5>
        To destroy a graphics or compute pipeline, call:

        <pre><code>
￿void vkDestroyPipeline(
￿    VkDevice                                    device,
￿    VkPipeline                                  pipeline,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code pipeline} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code pipeline} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code pipeline} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pipeline} is not #NULL_HANDLE, {@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code pipeline} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pipeline} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the pipeline."),
        VkPipeline("pipeline", "the handle of the pipeline to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Pipeline layout commands

    VkResult(
        "CreatePipelineLayout",
        """
        Creates a new pipeline layout object.

        <h5>C Specification</h5>
        To create a pipeline layout, call:

        <pre><code>
￿VkResult vkCreatePipelineLayout(
￿    VkDevice                                    device,
￿    const VkPipelineLayoutCreateInfo*           pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkPipelineLayout*                           pPipelineLayout);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkPipelineLayoutCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pPipelineLayout} <b>must</b> be a valid pointer to a {@code VkPipelineLayout} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkPipelineLayoutCreateInfo
        """,

        VkDevice("device", "the logical device that creates the pipeline layout."),
        VkPipelineLayoutCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkPipelineLayoutCreateInfo structure specifying the state of the pipeline layout object."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkPipelineLayout.p("pPipelineLayout", "a pointer to a {@code VkPipelineLayout} handle in which the resulting pipeline layout object is returned.")
    )

    void(
        "DestroyPipelineLayout",
        """
        Destroy a pipeline layout object.

        <h5>C Specification</h5>
        To destroy a pipeline layout, call:

        <pre><code>
￿void vkDestroyPipelineLayout(
￿    VkDevice                                    device,
￿    VkPipelineLayout                            pipelineLayout,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code pipelineLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code pipelineLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
            <li>{@code pipelineLayout} <b>must</b> not have been passed to any {@code vkCmd*} command for any command buffers that are still in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a> when {@code vkDestroyPipelineLayout} is called</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pipelineLayout} is not #NULL_HANDLE, {@code pipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code pipelineLayout} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pipelineLayout} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the pipeline layout."),
        VkPipelineLayout("pipelineLayout", "the pipeline layout to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Sampler commands

    VkResult(
        "CreateSampler",
        """
        Create a new sampler object.

        <h5>C Specification</h5>
        To create a sampler object, call:

        <pre><code>
￿VkResult vkCreateSampler(
￿    VkDevice                                    device,
￿    const VkSamplerCreateInfo*                  pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSampler*                                  pSampler);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkSamplerCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pSampler} <b>must</b> be a valid pointer to a {@code VkSampler} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_TOO_MANY_OBJECTS</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkSamplerCreateInfo
        """,

        VkDevice("device", "the logical device that creates the sampler."),
        VkSamplerCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkSamplerCreateInfo structure specifying the state of the sampler object."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkSampler.p("pSampler", "a pointer to a {@code VkSampler} handle in which the resulting sampler object is returned.")
    )

    void(
        "DestroySampler",
        """
        Destroy a sampler object.

        <h5>C Specification</h5>
        To destroy a sampler, call:

        <pre><code>
￿void vkDestroySampler(
￿    VkDevice                                    device,
￿    VkSampler                                   sampler,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code sampler} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code sampler} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code sampler} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code sampler} is not #NULL_HANDLE, {@code sampler} <b>must</b> be a valid {@code VkSampler} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code sampler} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code sampler} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the sampler."),
        VkSampler("sampler", "the sampler to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Descriptor set commands

    VkResult(
        "CreateDescriptorSetLayout",
        """
        Create a new descriptor set layout.

        <h5>C Specification</h5>
        To create descriptor set layout objects, call:

        <pre><code>
￿VkResult vkCreateDescriptorSetLayout(
￿    VkDevice                                    device,
￿    const VkDescriptorSetLayoutCreateInfo*      pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkDescriptorSetLayout*                      pSetLayout);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkDescriptorSetLayoutCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pSetLayout} <b>must</b> be a valid pointer to a {@code VkDescriptorSetLayout} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkDescriptorSetLayoutCreateInfo
        """,

        VkDevice("device", "the logical device that creates the descriptor set layout."),
        VkDescriptorSetLayoutCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkDescriptorSetLayoutCreateInfo structure specifying the state of the descriptor set layout object."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkDescriptorSetLayout.p("pSetLayout", "a pointer to a {@code VkDescriptorSetLayout} handle in which the resulting descriptor set layout object is returned.")
    )

    void(
        "DestroyDescriptorSetLayout",
        """
        Destroy a descriptor set layout object.

        <h5>C Specification</h5>
        To destroy a descriptor set layout, call:

        <pre><code>
￿void vkDestroyDescriptorSetLayout(
￿    VkDevice                                    device,
￿    VkDescriptorSetLayout                       descriptorSetLayout,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code descriptorSetLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code descriptorSetLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code descriptorSetLayout} is not #NULL_HANDLE, {@code descriptorSetLayout} <b>must</b> be a valid {@code VkDescriptorSetLayout} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code descriptorSetLayout} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code descriptorSetLayout} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the descriptor set layout."),
        VkDescriptorSetLayout("descriptorSetLayout", "the descriptor set layout to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "CreateDescriptorPool",
        """
        Creates a descriptor pool object.

        <h5>C Specification</h5>
        To create a descriptor pool object, call:

        <pre><code>
￿VkResult vkCreateDescriptorPool(
￿    VkDevice                                    device,
￿    const VkDescriptorPoolCreateInfo*           pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkDescriptorPool*                           pDescriptorPool);</code></pre>

        <h5>Description</h5>
        {@code pAllocator} controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#memory-allocation">Memory Allocation</a> chapter.

        The created descriptor pool is returned in {@code pDescriptorPool}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkDescriptorPoolCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pDescriptorPool} <b>must</b> be a valid pointer to a {@code VkDescriptorPool} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_FRAGMENTATION_EXT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkDescriptorPoolCreateInfo
        """,

        VkDevice("device", "the logical device that creates the descriptor pool."),
        VkDescriptorPoolCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkDescriptorPoolCreateInfo structure specifying the state of the descriptor pool object."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkDescriptorPool.p("pDescriptorPool", "a pointer to a {@code VkDescriptorPool} handle in which the resulting descriptor pool object is returned.")
    )

    void(
        "DestroyDescriptorPool",
        """
        Destroy a descriptor pool object.

        <h5>C Specification</h5>
        To destroy a descriptor pool, call:

        <pre><code>
￿void vkDestroyDescriptorPool(
￿    VkDevice                                    device,
￿    VkDescriptorPool                            descriptorPool,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Description</h5>
        When a pool is destroyed, all descriptor sets allocated from the pool are implicitly freed and become invalid. Descriptor sets allocated from a given pool do not need to be freed before destroying that descriptor pool.

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code descriptorPool} (via any allocated descriptor sets) <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code descriptorPool} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code descriptorPool} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code descriptorPool} is not #NULL_HANDLE, {@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code descriptorPool} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the descriptor pool."),
        VkDescriptorPool("descriptorPool", "the descriptor pool to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "ResetDescriptorPool",
        """
        Resets a descriptor pool object.

        <h5>C Specification</h5>
        To return all descriptor sets allocated from a given pool to the pool, rather than freeing individual descriptor sets, call:

        <pre><code>
￿VkResult vkResetDescriptorPool(
￿    VkDevice                                    device,
￿    VkDescriptorPool                            descriptorPool,
￿    VkDescriptorPoolResetFlags                  flags);</code></pre>

        <h5>Description</h5>
        Resetting a descriptor pool recycles all of the resources from all of the descriptor sets allocated from the descriptor pool back to the descriptor pool, and the descriptor sets are implicitly freed.

        <h5>Valid Usage</h5>
        <ul>
            <li>All uses of {@code descriptorPool} (via any allocated descriptor sets) <b>must</b> have completed execution</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code descriptorPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
            <li>Host access to any {@code VkDescriptorSet} objects allocated from {@code descriptorPool} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the descriptor pool."),
        VkDescriptorPool("descriptorPool", "the descriptor pool to be reset."),
        VkDescriptorPoolResetFlags("flags", "reserved for future use.")
    )

    VkResult(
        "AllocateDescriptorSets",
        """
        Allocate one or more descriptor sets.

        <h5>C Specification</h5>
        To allocate descriptor sets from a descriptor pool, call:

        <pre><code>
￿VkResult vkAllocateDescriptorSets(
￿    VkDevice                                    device,
￿    const VkDescriptorSetAllocateInfo*          pAllocateInfo,
￿    VkDescriptorSet*                            pDescriptorSets);</code></pre>

        <h5>Description</h5>
        The allocated descriptor sets are returned in {@code pDescriptorSets}.

        When a descriptor set is allocated, the initial state is largely uninitialized and all descriptors are undefined. Descriptors also become undefined if the underlying resource is destroyed. Descriptor sets containing undefined descriptors <b>can</b> still be bound and used, subject to the following conditions:

        <ul>
            <li>For descriptor set bindings created with the #DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT bit set, all descriptors in that binding that are dynamically used <b>must</b> have been populated before the descriptor set is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-binding">consumed</a>.</li>
            <li>For descriptor set bindings created without the #DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT bit set, all descriptors in that binding that are statically used <b>must</b> have been populated before the descriptor set is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-binding">consumed</a>.</li>
            <li>Descriptor bindings with descriptor type of #DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT <b>can</b> be undefined when the descriptor set is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-binding">consumed</a>; though values in that block will be undefined.</li>
            <li>Entries that are not used by a pipeline <b>can</b> have undefined descriptors.</li>
        </ul>

        If a call to {@code vkAllocateDescriptorSets} would cause the total number of descriptor sets allocated from the pool to exceed the value of ##VkDescriptorPoolCreateInfo{@code ::maxSets} used to create {@code pAllocateInfo}-&gt;descriptorPool, then the allocation <b>may</b> fail due to lack of space in the descriptor pool. Similarly, the allocation <b>may</b> fail due to lack of space if the call to {@code vkAllocateDescriptorSets} would cause the number of any given descriptor type to exceed the sum of all the {@code descriptorCount} members of each element of ##VkDescriptorPoolCreateInfo{@code ::pPoolSizes} with a {@code member} equal to that type.

        Additionally, the allocation <b>may</b> also fail if a call to {@code vkAllocateDescriptorSets} would cause the total number of inline uniform block bindings allocated from the pool to exceed the value of ##VkDescriptorPoolInlineUniformBlockCreateInfoEXT{@code ::maxInlineUniformBlockBindings} used to create the descriptor pool.

        If the allocation fails due to no more space in the descriptor pool, and not because of system or device memory exhaustion, then #ERROR_OUT_OF_POOL_MEMORY <b>must</b> be returned.

        {@code vkAllocateDescriptorSets} <b>can</b> be used to create multiple descriptor sets. If the creation of any of those descriptor sets fails, then the implementation <b>must</b> destroy all successfully created descriptor set objects from this command, set all entries of the {@code pDescriptorSets} array to #NULL_HANDLE and return the error.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pAllocateInfo} <b>must</b> be a valid pointer to a valid ##VkDescriptorSetAllocateInfo structure</li>
            <li>{@code pDescriptorSets} <b>must</b> be a valid pointer to an array of {@code pAllocateInfo}::descriptorSetCount {@code VkDescriptorSet} handles</li>
            <li>The value referenced by {@code pAllocateInfo}{@code ::descriptorSetCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pAllocateInfo}::descriptorPool <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_FRAGMENTED_POOL</li>
                <li>#ERROR_OUT_OF_POOL_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkDescriptorSetAllocateInfo
        """,

        VkDevice("device", "the logical device that owns the descriptor pool."),
        VkDescriptorSetAllocateInfo.const.p("pAllocateInfo", "a pointer to a ##VkDescriptorSetAllocateInfo structure describing parameters of the allocation."),
        Check("pAllocateInfo.descriptorSetCount()")..VkDescriptorSet.p("pDescriptorSets", "a pointer to an array of {@code VkDescriptorSet} handles in which the resulting descriptor set objects are returned.")
    )

    VkResult(
        "FreeDescriptorSets",
        """
        Free one or more descriptor sets.

        <h5>C Specification</h5>
        To free allocated descriptor sets, call:

        <pre><code>
￿VkResult vkFreeDescriptorSets(
￿    VkDevice                                    device,
￿    VkDescriptorPool                            descriptorPool,
￿    uint32_t                                    descriptorSetCount,
￿    const VkDescriptorSet*                      pDescriptorSets);</code></pre>

        <h5>Description</h5>
        After calling {@code vkFreeDescriptorSets}, all descriptor sets in {@code pDescriptorSets} are invalid.

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to any element of {@code pDescriptorSets} <b>must</b> have completed execution</li>
            <li>{@code pDescriptorSets} <b>must</b> be a valid pointer to an array of {@code descriptorSetCount} {@code VkDescriptorSet} handles, each element of which <b>must</b> either be a valid handle or #NULL_HANDLE</li>
            <li>Each valid handle in {@code pDescriptorSets} <b>must</b> have been allocated from {@code descriptorPool}</li>
            <li>{@code descriptorPool} <b>must</b> have been created with the #DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT flag</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
            <li>{@code descriptorSetCount} <b>must</b> be greater than 0</li>
            <li>{@code descriptorPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
            <li>Each element of {@code pDescriptorSets} that is a valid handle <b>must</b> have been created, allocated, or retrieved from {@code descriptorPool}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
            <li>Host access to each member of {@code pDescriptorSets} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the descriptor pool."),
        VkDescriptorPool("descriptorPool", "the descriptor pool from which the descriptor sets were allocated."),
        AutoSize("pDescriptorSets")..uint32_t("descriptorSetCount", "the number of elements in the {@code pDescriptorSets} array."),
        VkDescriptorSet.const.p("pDescriptorSets", "a pointer to an array of handles to {@code VkDescriptorSet} objects.")
    )

    void(
        "UpdateDescriptorSets",
        """
        Update the contents of a descriptor set object.

        <h5>C Specification</h5>
        Once allocated, descriptor sets <b>can</b> be updated with a combination of write and copy operations. To update descriptor sets, call:

        <pre><code>
￿void vkUpdateDescriptorSets(
￿    VkDevice                                    device,
￿    uint32_t                                    descriptorWriteCount,
￿    const VkWriteDescriptorSet*                 pDescriptorWrites,
￿    uint32_t                                    descriptorCopyCount,
￿    const VkCopyDescriptorSet*                  pDescriptorCopies);</code></pre>

        <h5>Description</h5>
        The operations described by {@code pDescriptorWrites} are performed first, followed by the operations described by {@code pDescriptorCopies}. Within each array, the operations are performed in the order they appear in the array.

        Each element in the {@code pDescriptorWrites} array describes an operation updating the descriptor set using descriptors for resources specified in the structure.

        Each element in the {@code pDescriptorCopies} array is a ##VkCopyDescriptorSet structure describing an operation copying descriptors between sets.

        If the {@code dstSet} member of any element of {@code pDescriptorWrites} or {@code pDescriptorCopies} is bound, accessed, or modified by any command that was recorded to a command buffer which is currently in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording or executable state</a>, and any of the descriptor bindings that are updated were not created with the #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT or #DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT bits set, that command buffer becomes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">invalid</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>Descriptor bindings updated by this command which were created without the #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT or #DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT bits set <b>must</b> not be used by any command that was recorded to a command buffer which is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a>.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code descriptorWriteCount} is not 0, {@code pDescriptorWrites} <b>must</b> be a valid pointer to an array of {@code descriptorWriteCount} valid ##VkWriteDescriptorSet structures</li>
            <li>If {@code descriptorCopyCount} is not 0, {@code pDescriptorCopies} <b>must</b> be a valid pointer to an array of {@code descriptorCopyCount} valid ##VkCopyDescriptorSet structures</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pDescriptorWrites}[].dstSet <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pDescriptorCopies}[].dstSet <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkCopyDescriptorSet, ##VkWriteDescriptorSet
        """,

        VkDevice("device", "the logical device that updates the descriptor sets."),
        AutoSize("pDescriptorWrites")..uint32_t("descriptorWriteCount", "the number of elements in the {@code pDescriptorWrites} array."),
        nullable..VkWriteDescriptorSet.const.p("pDescriptorWrites", "a pointer to an array of ##VkWriteDescriptorSet structures describing the descriptor sets to write to."),
        AutoSize("pDescriptorCopies")..uint32_t("descriptorCopyCount", "the number of elements in the {@code pDescriptorCopies} array."),
        nullable..VkCopyDescriptorSet.const.p("pDescriptorCopies", "a pointer to an array of ##VkCopyDescriptorSet structures describing the descriptor sets to copy between.")
    )

    // Pass commands

    VkResult(
        "CreateFramebuffer",
        """
        Create a new framebuffer object.

        <h5>C Specification</h5>
        To create a framebuffer, call:

        <pre><code>
￿VkResult vkCreateFramebuffer(
￿    VkDevice                                    device,
￿    const VkFramebufferCreateInfo*              pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkFramebuffer*                              pFramebuffer);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code pCreateInfo}-&gt;flags does not include #FRAMEBUFFER_CREATE_IMAGELESS_BIT, and {@code attachmentCount} is not 0, each element of {@code pCreateInfo}-&gt;pAttachments <b>must</b> have been created on {@code device}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkFramebufferCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pFramebuffer} <b>must</b> be a valid pointer to a {@code VkFramebuffer} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkFramebufferCreateInfo
        """,

        VkDevice("device", "the logical device that creates the framebuffer."),
        VkFramebufferCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkFramebufferCreateInfo structure describing additional information about framebuffer creation."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkFramebuffer.p("pFramebuffer", "a pointer to a {@code VkFramebuffer} handle in which the resulting framebuffer object is returned.")
    )

    void(
        "DestroyFramebuffer",
        """
        Destroy a framebuffer object.

        <h5>C Specification</h5>
        To destroy a framebuffer, call:

        <pre><code>
￿void vkDestroyFramebuffer(
￿    VkDevice                                    device,
￿    VkFramebuffer                               framebuffer,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code framebuffer} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code framebuffer} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code framebuffer} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code framebuffer} is not #NULL_HANDLE, {@code framebuffer} <b>must</b> be a valid {@code VkFramebuffer} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code framebuffer} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code framebuffer} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the framebuffer."),
        VkFramebuffer("framebuffer", "the handle of the framebuffer to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "CreateRenderPass",
        """
        Create a new render pass object.

        <h5>C Specification</h5>
        To create a render pass, call:

        <pre><code>
￿VkResult vkCreateRenderPass(
￿    VkDevice                                    device,
￿    const VkRenderPassCreateInfo*               pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkRenderPass*                               pRenderPass);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkRenderPassCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pRenderPass} <b>must</b> be a valid pointer to a {@code VkRenderPass} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkRenderPassCreateInfo
        """,

        VkDevice("device", "the logical device that creates the render pass."),
        VkRenderPassCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkRenderPassCreateInfo structure describing the parameters of the render pass."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkRenderPass.p("pRenderPass", "a pointer to a {@code VkRenderPass} handle in which the resulting render pass object is returned.")
    )

    void(
        "DestroyRenderPass",
        """
        Destroy a render pass object.

        <h5>C Specification</h5>
        To destroy a render pass, call:

        <pre><code>
￿void vkDestroyRenderPass(
￿    VkDevice                                    device,
￿    VkRenderPass                                renderPass,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code renderPass} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code renderPass} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code renderPass} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code renderPass} is not #NULL_HANDLE, {@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code renderPass} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code renderPass} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the render pass."),
        VkRenderPass("renderPass", "the handle of the render pass to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "GetRenderAreaGranularity",
        """
        Returns the granularity for optimal render area.

        <h5>C Specification</h5>
        To query the render area granularity, call:

        <pre><code>
￿void vkGetRenderAreaGranularity(
￿    VkDevice                                    device,
￿    VkRenderPass                                renderPass,
￿    VkExtent2D*                                 pGranularity);</code></pre>

        <h5>Description</h5>
        The conditions leading to an optimal {@code renderArea} are:

        <ul>
            <li>the {@code offset.x} member in {@code renderArea} is a multiple of the {@code width} member of the returned ##VkExtent2D (the horizontal granularity).</li>
            <li>the {@code offset.y} member in {@code renderArea} is a multiple of the {@code height} of the returned ##VkExtent2D (the vertical granularity).</li>
            <li>either the {@code offset.width} member in {@code renderArea} is a multiple of the horizontal granularity or {@code offset.x}+{@code offset.width} is equal to the {@code width} of the {@code framebuffer} in the ##VkRenderPassBeginInfo.</li>
            <li>either the {@code offset.height} member in {@code renderArea} is a multiple of the vertical granularity or {@code offset.y}+{@code offset.height} is equal to the {@code height} of the {@code framebuffer} in the ##VkRenderPassBeginInfo.</li>
        </ul>

        Subpass dependencies are not affected by the render area, and apply to the entire image subresources attached to the framebuffer as specified in the description of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-layout-transitions">automatic layout transitions</a>. Similarly, pipeline barriers are valid even if their effect extends outside the render area.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
            <li>{@code pGranularity} <b>must</b> be a valid pointer to a ##VkExtent2D structure</li>
            <li>{@code renderPass} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent2D
        """,

        VkDevice("device", "the logical device that owns the render pass."),
        VkRenderPass("renderPass", "a handle to a render pass."),
        VkExtent2D.p("pGranularity", "a pointer to a ##VkExtent2D structure in which the granularity is returned.")
    )

    // Command pool commands

    VkResult(
        "CreateCommandPool",
        """
        Create a new command pool object.

        <h5>C Specification</h5>
        To create a command pool, call:

        <pre><code>
￿VkResult vkCreateCommandPool(
￿    VkDevice                                    device,
￿    const VkCommandPoolCreateInfo*              pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkCommandPool*                              pCommandPool);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pCreateInfo}-&gt;queueFamilyIndex <b>must</b> be the index of a queue family available in the logical device {@code device}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkCommandPoolCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pCommandPool} <b>must</b> be a valid pointer to a {@code VkCommandPool} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkCommandPoolCreateInfo
        """,

        VkDevice("device", "the logical device that creates the command pool."),
        VkCommandPoolCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkCommandPoolCreateInfo structure specifying the state of the command pool object."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkCommandPool.p("pCommandPool", "a pointer to a {@code VkCommandPool} handle in which the created pool is returned.")
    )

    void(
        "DestroyCommandPool",
        """
        Destroy a command pool object.

        <h5>C Specification</h5>
        To destroy a command pool, call:

        <pre><code>
￿void vkDestroyCommandPool(
￿    VkDevice                                    device,
￿    VkCommandPool                               commandPool,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Description</h5>
        When a pool is destroyed, all command buffers allocated from the pool are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkFreeCommandBuffers">freed</a>.

        Any primary command buffer allocated from another {@code VkCommandPool} that is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording or executable state</a> and has a secondary command buffer allocated from {@code commandPool} recorded into it, becomes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">invalid</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>All {@code VkCommandBuffer} objects allocated from {@code commandPool} <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a>.</li>
            <li>If ##VkAllocationCallbacks were provided when {@code commandPool} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code commandPool} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code commandPool} is not #NULL_HANDLE, {@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code commandPool} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the command pool."),
        VkCommandPool("commandPool", "the handle of the command pool to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "ResetCommandPool",
        """
        Reset a command pool.

        <h5>C Specification</h5>
        To reset a command pool, call:

        <pre><code>
￿VkResult vkResetCommandPool(
￿    VkDevice                                    device,
￿    VkCommandPool                               commandPool,
￿    VkCommandPoolResetFlags                     flags);</code></pre>

        <h5>Description</h5>
        Resetting a command pool recycles all of the resources from all of the command buffers allocated from the command pool back to the command pool. All command buffers that have been allocated from the command pool are put in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">initial state</a>.

        Any primary command buffer allocated from another {@code VkCommandPool} that is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording or executable state</a> and has a secondary command buffer allocated from {@code commandPool} recorded into it, becomes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">invalid</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>All {@code VkCommandBuffer} objects allocated from {@code commandPool} <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkCommandPoolResetFlagBits} values</li>
            <li>{@code commandPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the command pool."),
        VkCommandPool("commandPool", "the command pool to reset."),
        VkCommandPoolResetFlags("flags", "a bitmask of {@code VkCommandPoolResetFlagBits} controlling the reset operation.")
    )

    // Command buffer commands

    VkResult(
        "AllocateCommandBuffers",
        """
        Allocate command buffers from an existing command pool.

        <h5>C Specification</h5>
        To allocate command buffers, call:

        <pre><code>
￿VkResult vkAllocateCommandBuffers(
￿    VkDevice                                    device,
￿    const VkCommandBufferAllocateInfo*          pAllocateInfo,
￿    VkCommandBuffer*                            pCommandBuffers);</code></pre>

        <h5>Description</h5>
        {@code vkAllocateCommandBuffers} <b>can</b> be used to create multiple command buffers. If the creation of any of those command buffers fails, the implementation <b>must</b> destroy all successfully created command buffer objects from this command, set all entries of the {@code pCommandBuffers} array to {@code NULL} and return the error.

        When command buffers are first allocated, they are in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">initial state</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pAllocateInfo} <b>must</b> be a valid pointer to a valid ##VkCommandBufferAllocateInfo structure</li>
            <li>{@code pCommandBuffers} <b>must</b> be a valid pointer to an array of {@code pAllocateInfo}::commandBufferCount {@code VkCommandBuffer} handles</li>
            <li>The value referenced by {@code pAllocateInfo}{@code ::commandBufferCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pAllocateInfo}::commandPool <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCommandBufferAllocateInfo
        """,

        VkDevice("device", "the logical device that owns the command pool."),
        VkCommandBufferAllocateInfo.const.p("pAllocateInfo", "a pointer to a ##VkCommandBufferAllocateInfo structure describing parameters of the allocation."),
        Check("pAllocateInfo.commandBufferCount()")..VkCommandBuffer.p("pCommandBuffers", "a pointer to an array of {@code VkCommandBuffer} handles in which the resulting command buffer objects are returned. The array <b>must</b> be at least the length specified by the {@code commandBufferCount} member of {@code pAllocateInfo}. Each allocated command buffer begins in the initial state.")
    )

    void(
        "FreeCommandBuffers",
        """
        Free command buffers.

        <h5>C Specification</h5>
        To free command buffers, call:

        <pre><code>
￿void vkFreeCommandBuffers(
￿    VkDevice                                    device,
￿    VkCommandPool                               commandPool,
￿    uint32_t                                    commandBufferCount,
￿    const VkCommandBuffer*                      pCommandBuffers);</code></pre>

        <h5>Description</h5>
        Any primary command buffer that is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording or executable state</a> and has any element of {@code pCommandBuffers} recorded into it, becomes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">invalid</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>All elements of {@code pCommandBuffers} <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a></li>
            <li>{@code pCommandBuffers} <b>must</b> be a valid pointer to an array of {@code commandBufferCount} {@code VkCommandBuffer} handles, each element of which <b>must</b> either be a valid handle or {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
            <li>{@code commandBufferCount} <b>must</b> be greater than 0</li>
            <li>{@code commandPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
            <li>Each element of {@code pCommandBuffers} that is a valid handle <b>must</b> have been created, allocated, or retrieved from {@code commandPool}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
            <li>Host access to each member of {@code pCommandBuffers} <b>must</b> be externally synchronized</li>
        </ul>
        """,

        VkDevice("device", "the logical device that owns the command pool."),
        VkCommandPool("commandPool", "the command pool from which the command buffers were allocated."),
        AutoSize("pCommandBuffers")..uint32_t("commandBufferCount", "the length of the {@code pCommandBuffers} array."),
        VkCommandBuffer.const.p("pCommandBuffers", "a pointer to an array of handles of command buffers to free.")
    )

    VkResult(
        "BeginCommandBuffer",
        """
        Start recording a command buffer.

        <h5>C Specification</h5>
        To begin recording a command buffer, call:

        <pre><code>
￿VkResult vkBeginCommandBuffer(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCommandBufferBeginInfo*             pBeginInfo);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording or pending state</a></li>
            <li>If {@code commandBuffer} was allocated from a {@code VkCommandPool} which did not have the #COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT flag set, {@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">initial state</a></li>
            <li>If {@code commandBuffer} is a secondary command buffer, the {@code pInheritanceInfo} member of {@code pBeginInfo} <b>must</b> be a valid ##VkCommandBufferInheritanceInfo structure</li>
            <li>If {@code commandBuffer} is a secondary command buffer and either the {@code occlusionQueryEnable} member of the {@code pInheritanceInfo} member of {@code pBeginInfo} is #FALSE, or the precise occlusion queries feature is not enabled, the {@code queryFlags} member of the {@code pInheritanceInfo} member {@code pBeginInfo} <b>must</b> not contain #QUERY_CONTROL_PRECISE_BIT</li>
            <li>If {@code commandBuffer} is a primary command buffer, then {@code pBeginInfo}-&gt;flags <b>must</b> not set both the #COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT and the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT flags</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBeginInfo} <b>must</b> be a valid pointer to a valid ##VkCommandBufferBeginInfo structure</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCommandBufferBeginInfo
        """,

        VkCommandBuffer("commandBuffer", "the handle of the command buffer which is to be put in the recording state."),
        VkCommandBufferBeginInfo.const.p("pBeginInfo", "points to a ##VkCommandBufferBeginInfo structure defining additional information about how the command buffer begins recording.")
    )

    VkResult(
        "EndCommandBuffer",
        """
        Finish recording a command buffer.

        <h5>C Specification</h5>
        To complete recording of a command buffer, call:

        <pre><code>
￿VkResult vkEndCommandBuffer(
￿    VkCommandBuffer                             commandBuffer);</code></pre>

        <h5>Description</h5>
        If there was an error during recording, the application will be notified by an unsuccessful return code returned by {@code vkEndCommandBuffer}. If the application wishes to further use the command buffer, the command buffer <b>must</b> be reset. The command buffer <b>must</b> have been in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a>, and is moved to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">executable state</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a>.</li>
            <li>If {@code commandBuffer} is a primary command buffer, there <b>must</b> not be an active render pass instance</li>
            <li>All queries made <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-operation-active">active</a> during the recording of {@code commandBuffer} <b>must</b> have been made inactive</li>
            <li>Conditional rendering must not be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#active-conditional-rendering">active</a></li>
            <li>If {@code commandBuffer} is a secondary command buffer, there <b>must</b> not be an outstanding #CmdBeginDebugUtilsLabelEXT() command recorded to {@code commandBuffer} that has not previously been ended by a call to #CmdEndDebugUtilsLabelEXT().</li>
            <li>If {@code commandBuffer} is a secondary command buffer, there <b>must</b> not be an outstanding #CmdDebugMarkerBeginEXT() command recorded to {@code commandBuffer} that has not previously been ended by a call to #CmdDebugMarkerEndEXT().</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer to complete recording.")
    )

    VkResult(
        "ResetCommandBuffer",
        """
        Reset a command buffer to the initial state.

        <h5>C Specification</h5>
        To reset command buffers, call:

        <pre><code>
￿VkResult vkResetCommandBuffer(
￿    VkCommandBuffer                             commandBuffer,
￿    VkCommandBufferResetFlags                   flags);</code></pre>

        <h5>Description</h5>
        Any primary command buffer that is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording or executable state</a> and has {@code commandBuffer} recorded into it, becomes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">invalid</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a></li>
            <li>{@code commandBuffer} <b>must</b> have been allocated from a pool that was created with the #COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkCommandBufferResetFlagBits} values</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer to reset. The command buffer <b>can</b> be in any state other than <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#commandbuffers-lifecycle\">pending</a>, and is moved into the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#commandbuffers-lifecycle\">initial state</a>."),
        VkCommandBufferResetFlags("flags", "a bitmask of {@code VkCommandBufferResetFlagBits} controlling the reset operation.")
    )

    // Command buffer building commands

    void(
        "CmdBindPipeline",
        """
        Bind a pipeline object to a command buffer.

        <h5>C Specification</h5>
        Once a pipeline has been created, it <b>can</b> be bound to the command buffer using the command:

        <pre><code>
￿void vkCmdBindPipeline(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineBindPoint                         pipelineBindPoint,
￿    VkPipeline                                  pipeline);</code></pre>

        <h5>Description</h5>
        Once bound, a pipeline binding affects subsequent graphics or compute commands in the command buffer until a different pipeline is bound to the bind point. The pipeline bound to #PIPELINE_BIND_POINT_COMPUTE controls the behavior of #CmdDispatch() and #CmdDispatchIndirect(). The pipeline bound to #PIPELINE_BIND_POINT_GRAPHICS controls the behavior of all <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#drawing">drawing commands</a>. The pipeline bound to #PIPELINE_BIND_POINT_RAY_TRACING_NV controls the behavior of #CmdTraceRaysNV(). No other commands are affected by the pipeline state.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_COMPUTE, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>If {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_GRAPHICS, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>If {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_COMPUTE, {@code pipeline} <b>must</b> be a compute pipeline</li>
            <li>If {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_GRAPHICS, {@code pipeline} <b>must</b> be a graphics pipeline</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-variableMultisampleRate">variable multisample rate</a> feature is not supported, {@code pipeline} is a graphics pipeline, the current subpass has no attachments, and this is not the first call to this function with a graphics pipeline after transitioning to the current subpass, then the sample count specified by this pipeline <b>must</b> match that set in the previous pipeline</li>
            <li>If ##VkPhysicalDeviceSampleLocationsPropertiesEXT{@code ::variableSampleLocations} is #FALSE, and {@code pipeline} is a graphics pipeline created with a ##VkPipelineSampleLocationsStateCreateInfoEXT structure having its {@code sampleLocationsEnable} member set to #TRUE but without #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT enabled then the current render pass instance <b>must</b> have been begun by specifying a ##VkRenderPassSampleLocationsBeginInfoEXT structure whose {@code pPostSubpassSampleLocations} member contains an element with a {@code subpassIndex} matching the current subpass index and the {@code sampleLocationsInfo} member of that element <b>must</b> match the {@code sampleLocationsInfo} specified in ##VkPipelineSampleLocationsStateCreateInfoEXT when the pipeline was created</li>
            <li>This command <b>must</b> not be recorded when transform feedback is active</li>
            <li>If {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_RAY_TRACING_NV, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>If {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_RAY_TRACING_NV, the {@code pipeline} <b>must</b> be a ray tracing pipeline</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>Both of {@code commandBuffer}, and {@code pipeline} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the pipeline will be bound to."),
        VkPipelineBindPoint("pipelineBindPoint", "a {@code VkPipelineBindPoint} value specifying whether to bind to the compute or graphics bind point. Binding one does not disturb the other."),
        VkPipeline("pipeline", "the pipeline to be bound.")
    )

    void(
        "CmdSetViewport",
        """
        Set the viewport on a command buffer.

        <h5>C Specification</h5>
        If the bound pipeline state object was not created with the #DYNAMIC_STATE_VIEWPORT dynamic state enabled, viewport transformation parameters are specified using the {@code pViewports} member of ##VkPipelineViewportStateCreateInfo in the pipeline state object. If the pipeline state object was created with the #DYNAMIC_STATE_VIEWPORT dynamic state enabled, the viewport transformation parameters are dynamically set and changed with the command:

        <pre><code>
￿void vkCmdSetViewport(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstViewport,
￿    uint32_t                                    viewportCount,
￿    const VkViewport*                           pViewports);</code></pre>

        <h5>Description</h5>
        The viewport parameters taken from element <code>i</code> of {@code pViewports} replace the current state for the viewport index <code>firstViewport + i</code>, for <code>i</code> in <code>[0, viewportCount)</code>.

        <h5>Valid Usage</h5>
        <ul>
            <li>The bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_VIEWPORT dynamic state enabled</li>
            <li>{@code firstViewport} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxViewports}</li>
            <li>The sum of {@code firstViewport} and {@code viewportCount} <b>must</b> be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-multiViewport">multiple viewports</a> feature is not enabled, {@code firstViewport} <b>must</b> be 0</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-multiViewport">multiple viewports</a> feature is not enabled, {@code viewportCount} <b>must</b> be 1</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pViewports} <b>must</b> be a valid pointer to an array of {@code viewportCount} valid ##VkViewport structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>{@code viewportCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkViewport
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("firstViewport", "the index of the first viewport whose parameters are updated by the command."),
        AutoSize("pViewports")..uint32_t("viewportCount", "the number of viewports whose parameters are updated by the command."),
        VkViewport.const.p("pViewports", "a pointer to an array of ##VkViewport structures specifying viewport parameters.")
    )

    void(
        "CmdSetScissor",
        """
        Set the dynamic scissor rectangles on a command buffer.

        <h5>C Specification</h5>
        The scissor test determines if a fragment's framebuffer coordinates <code>(x<sub>f</sub>,y<sub>f</sub>)</code> lie within the scissor rectangle corresponding to the viewport index (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vertexpostproc-viewport">Controlling the Viewport</a>) used by the primitive that generated the fragment. If the pipeline state object is created without #DYNAMIC_STATE_SCISSOR enabled then the scissor rectangles are set by the ##VkPipelineViewportStateCreateInfo state of the pipeline state object. Otherwise, to dynamically set the scissor rectangles call:

        <pre><code>
￿void vkCmdSetScissor(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstScissor,
￿    uint32_t                                    scissorCount,
￿    const VkRect2D*                             pScissors);</code></pre>

        <h5>Description</h5>
        The scissor rectangles taken from element <code>i</code> of {@code pScissors} replace the current state for the scissor index <code>firstScissor + i</code>, for <code>i</code> in <code>[0, scissorCount)</code>.

        Each scissor rectangle is described by a ##VkRect2D structure, with the {@code offset.x} and {@code offset.y} values determining the upper left corner of the scissor rectangle, and the {@code extent.width} and {@code extent.height} values determining the size in pixels.

        <h5>Valid Usage</h5>
        <ul>
            <li>The bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_SCISSOR dynamic state enabled</li>
            <li>{@code firstScissor} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxViewports}</li>
            <li>The sum of {@code firstScissor} and {@code scissorCount} <b>must</b> be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-multiViewport">multiple viewports</a> feature is not enabled, {@code firstScissor} <b>must</b> be 0</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-multiViewport">multiple viewports</a> feature is not enabled, {@code scissorCount} <b>must</b> be 1</li>
            <li>The {@code x} and {@code y} members of {@code offset} member of any element of {@code pScissors} <b>must</b> be greater than or equal to 0</li>
            <li>Evaluation of <code>(offset.x + extent.width)</code> <b>must</b> not cause a signed integer addition overflow for any element of {@code pScissors}</li>
            <li>Evaluation of <code>(offset.y + extent.height)</code> <b>must</b> not cause a signed integer addition overflow for any element of {@code pScissors}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pScissors} <b>must</b> be a valid pointer to an array of {@code scissorCount} ##VkRect2D structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>{@code scissorCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkRect2D
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("firstScissor", "the index of the first scissor whose state is updated by the command."),
        AutoSize("pScissors")..uint32_t("scissorCount", "the number of scissors whose rectangles are updated by the command."),
        VkRect2D.const.p("pScissors", "a pointer to an array of ##VkRect2D structures defining scissor rectangles.")
    )

    void(
        "CmdSetLineWidth",
        """
        Set the dynamic line width state.

        <h5>C Specification</h5>
        Each line segment has an associated width. The line width is specified by the ##VkPipelineRasterizationStateCreateInfo{@code ::lineWidth} property of the currently active pipeline, if the pipeline was not created with #DYNAMIC_STATE_LINE_WIDTH enabled.

        Otherwise, the line width is set by calling {@code vkCmdSetLineWidth}:

        <pre><code>
￿void vkCmdSetLineWidth(
￿    VkCommandBuffer                             commandBuffer,
￿    float                                       lineWidth);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_LINE_WIDTH dynamic state enabled</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-wideLines">wide lines</a> feature is not enabled, {@code lineWidth} <b>must</b> be {@code 1.0}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        float("lineWidth", "the width of rasterized line segments.")
    )

    void(
        "CmdSetDepthBias",
        """
        Set the depth bias dynamic state.

        <h5>C Specification</h5>
        The depth values of all fragments generated by the rasterization of a polygon <b>can</b> be offset by a single value that is computed for that polygon. This behavior is controlled by the {@code depthBiasEnable}, {@code depthBiasConstantFactor}, {@code depthBiasClamp}, and {@code depthBiasSlopeFactor} members of ##VkPipelineRasterizationStateCreateInfo, or by the corresponding parameters to the {@code vkCmdSetDepthBias} command if depth bias state is dynamic.

        <pre><code>
￿void vkCmdSetDepthBias(
￿    VkCommandBuffer                             commandBuffer,
￿    float                                       depthBiasConstantFactor,
￿    float                                       depthBiasClamp,
￿    float                                       depthBiasSlopeFactor);</code></pre>

        <h5>Description</h5>
        If {@code depthBiasEnable} is #FALSE, no depth bias is applied and the fragment's depth values are unchanged.

        {@code depthBiasSlopeFactor} scales the maximum depth slope of the polygon, and {@code depthBiasConstantFactor} scales an implementation-dependent constant that relates to the usable resolution of the depth buffer. The resulting values are summed to produce the depth bias value which is then clamped to a minimum or maximum value specified by {@code depthBiasClamp}. {@code depthBiasSlopeFactor}, {@code depthBiasConstantFactor}, and {@code depthBiasClamp} <b>can</b> each be positive, negative, or zero.

        The maximum depth slope <code>m</code> of a triangle is

        <pre><code>
￿      m = sqrt((&part;z<sub>f</sub> / &part;x<sub>f</sub>)<sup>2</sup> + (&part;z<sub>f</sub> / &part;y<sub>f</sub>)<sup>2</sup>)</code></pre>

        where <code>(x<sub>f</sub>, y<sub>f</sub>, z<sub>f</sub>)</code> is a point on the triangle. <code>m</code> <b>may</b> be approximated as

        <pre><code>
￿      m = max(abs(&part;z<sub>f</sub> / &part;x<sub>f</sub>), abs(&part;z<sub>f</sub> / &part;y<sub>f</sub>))</code></pre>

        The minimum resolvable difference <code>r</code> is an implementation-dependent parameter that depends on the depth buffer representation. It is the smallest difference in framebuffer coordinate <code>z</code> values that is guaranteed to remain distinct throughout polygon rasterization and in the depth buffer. All pairs of fragments generated by the rasterization of two polygons with otherwise identical vertices, but <code>z<sub>f</sub></code> values that differ by <code>r</code>, will have distinct depth values.

        For fixed-point depth buffer representations, <code>r</code> is constant throughout the range of the entire depth buffer. For floating-point depth buffers, there is no single minimum resolvable difference. In this case, the minimum resolvable difference for a given polygon is dependent on the maximum exponent, <code>e</code>, in the range of <code>z</code> values spanned by the primitive. If <code>n</code> is the number of bits in the floating-point mantissa, the minimum resolvable difference, <code>r</code>, for the given primitive is defined as

        <dl>
            <dd><code>r = 2<sup>e-n</sup></code></dd>
        </dl>

        If a triangle is rasterized using the #POLYGON_MODE_FILL_RECTANGLE_NV polygon mode, then this minimum resolvable difference <b>may</b> not be resolvable for samples outside of the triangle, where the depth is extrapolated.

        If no depth buffer is present, <code>r</code> is undefined.

        The bias value <code>o</code> for a polygon is

        <pre><code>
￿        m &times; depthBiasSlopeFactor + r &times; depthBiasConstantFactor                     depthBiasClamp = 0 or NaN
￿o = min(m &times; depthBiasSlopeFactor + r &times; depthBiasConstantFactor, depthBiasClamp)    depthBiasClamp &gt; 0
￿    max(m &times; depthBiasSlopeFactor + r &times; depthBiasConstantFactor, depthBiasClamp)    depthBiasClamp &lt; 0</code></pre>

        <code>m</code> is computed as described above. If the depth buffer uses a fixed-point representation, <code>m</code> is a function of depth values in the range <code>[0,1]</code>, and <code>o</code> is applied to depth values in the same range.

        For fixed-point depth buffers, fragment depth values are always limited to the range <code>[0,1]</code> by clamping after depth bias addition is performed. Unless the {@link EXTDepthRangeUnrestricted VK_EXT_depth_range_unrestricted} extension is enabled, fragment depth values are clamped even when the depth buffer uses a floating-point representation.

        <h5>Valid Usage</h5>
        <ul>
            <li>The bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_DEPTH_BIAS dynamic state enabled</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-depthBiasClamp">depth bias clamping</a> feature is not enabled, {@code depthBiasClamp} <b>must</b> be {@code 0.0}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        float("depthBiasConstantFactor", "a scalar factor controlling the constant depth value added to each fragment."),
        float("depthBiasClamp", "the maximum (or minimum) depth bias of a fragment."),
        float("depthBiasSlopeFactor", "a scalar factor applied to a fragment&#8217;s slope in depth bias calculations.")
    )

    void(
        "CmdSetBlendConstants",
        """
        Set the values of blend constants.

        <h5>C Specification</h5>
        Otherwise, to dynamically set and change the blend constant, call:

        <pre><code>
￿void vkCmdSetBlendConstants(
￿    VkCommandBuffer                             commandBuffer,
￿    const float                                 blendConstants[4]);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_BLEND_CONSTANTS dynamic state enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        Check(4)..float.const.p("blendConstants", "a pointer to an array of four values specifying the R, G, B, and A components of the blend constant color used in blending, depending on the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#framebuffer-blendfactors\">blend factor</a>.")
    )

    void(
        "CmdSetDepthBounds",
        """
        Set the depth bounds test values for a command buffer.

        <h5>C Specification</h5>
        The depth bounds test conditionally disables coverage of a sample based on the outcome of a comparison between the value <code>z<sub>a</sub></code> in the depth attachment at location <code>(x<sub>f</sub>,y<sub>f</sub>)</code> (for the appropriate sample) and a range of values. The test is enabled or disabled by the {@code depthBoundsTestEnable} member of ##VkPipelineDepthStencilStateCreateInfo: If the pipeline state object is created without the #DYNAMIC_STATE_DEPTH_BOUNDS dynamic state enabled then the range of values used in the depth bounds test are defined by the {@code minDepthBounds} and {@code maxDepthBounds} members of the ##VkPipelineDepthStencilStateCreateInfo structure. Otherwise, to dynamically set the depth bounds range values call:

        <pre><code>
￿void vkCmdSetDepthBounds(
￿    VkCommandBuffer                             commandBuffer,
￿    float                                       minDepthBounds,
￿    float                                       maxDepthBounds);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_DEPTH_BOUNDS dynamic state enabled</li>
            <li>Unless the {@link EXTDepthRangeUnrestricted VK_EXT_depth_range_unrestricted} extension is enabled {@code minDepthBounds} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
            <li>Unless the {@link EXTDepthRangeUnrestricted VK_EXT_depth_range_unrestricted} extension is enabled {@code maxDepthBounds} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        float("minDepthBounds", "the lower bound of the range of depth values used in the depth bounds test."),
        float("maxDepthBounds", "the upper bound of the range.")
    )

    void(
        "CmdSetStencilCompareMask",
        """
        Set the stencil compare mask dynamic state.

        <h5>C Specification</h5>
        If the pipeline state object is created with the #DYNAMIC_STATE_STENCIL_COMPARE_MASK dynamic state enabled, then to dynamically set the stencil compare mask call:

        <pre><code>
￿void vkCmdSetStencilCompareMask(
￿    VkCommandBuffer                             commandBuffer,
￿    VkStencilFaceFlags                          faceMask,
￿    uint32_t                                    compareMask);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_STENCIL_COMPARE_MASK dynamic state enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
            <li>{@code faceMask} <b>must</b> not be 0</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkStencilFaceFlags("faceMask", "a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the compare mask."),
        uint32_t("compareMask", "the new value to use as the stencil compare mask.")
    )

    void(
        "CmdSetStencilWriteMask",
        """
        Set the stencil write mask dynamic state.

        <h5>C Specification</h5>
        If the pipeline state object is created with the #DYNAMIC_STATE_STENCIL_WRITE_MASK dynamic state enabled, then to dynamically set the stencil write mask call:

        <pre><code>
￿void vkCmdSetStencilWriteMask(
￿    VkCommandBuffer                             commandBuffer,
￿    VkStencilFaceFlags                          faceMask,
￿    uint32_t                                    writeMask);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_STENCIL_WRITE_MASK dynamic state enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
            <li>{@code faceMask} <b>must</b> not be 0</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkStencilFaceFlags("faceMask", "a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the write mask, as described above for #CmdSetStencilCompareMask()."),
        uint32_t("writeMask", "the new value to use as the stencil write mask.")
    )

    void(
        "CmdSetStencilReference",
        """
        Set the stencil reference dynamic state.

        <h5>C Specification</h5>
        If the pipeline state object is created with the #DYNAMIC_STATE_STENCIL_REFERENCE dynamic state enabled, then to dynamically set the stencil reference value call:

        <pre><code>
￿void vkCmdSetStencilReference(
￿    VkCommandBuffer                             commandBuffer,
￿    VkStencilFaceFlags                          faceMask,
￿    uint32_t                                    reference);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_STENCIL_REFERENCE dynamic state enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
            <li>{@code faceMask} <b>must</b> not be 0</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkStencilFaceFlags("faceMask", "a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the reference value, as described above for #CmdSetStencilCompareMask()."),
        uint32_t("reference", "the new value to use as the stencil reference value.")
    )

    void(
        "CmdBindDescriptorSets",
        """
        Binds descriptor sets to a command buffer.

        <h5>C Specification</h5>
        To bind one or more descriptor sets to a command buffer, call:

        <pre><code>
￿void vkCmdBindDescriptorSets(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineBindPoint                         pipelineBindPoint,
￿    VkPipelineLayout                            layout,
￿    uint32_t                                    firstSet,
￿    uint32_t                                    descriptorSetCount,
￿    const VkDescriptorSet*                      pDescriptorSets,
￿    uint32_t                                    dynamicOffsetCount,
￿    const uint32_t*                             pDynamicOffsets);</code></pre>

        <h5>Description</h5>
        {@code vkCmdBindDescriptorSets} causes the sets numbered [{@code firstSet}.. {@code firstSet}+{@code descriptorSetCount}-1] to use the bindings stored in {@code pDescriptorSets}[0..descriptorSetCount-1] for subsequent rendering commands (either compute or graphics, according to the {@code pipelineBindPoint}). Any bindings that were previously applied via these sets are no longer valid.

        Once bound, a descriptor set affects rendering of subsequent graphics or compute commands in the command buffer until a different set is bound to the same set number, or else until the set is disturbed as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a>.

        A compatible descriptor set <b>must</b> be bound for all set numbers that any shaders in a pipeline access, at the time that a draw or dispatch command is recorded to execute using that pipeline. However, if none of the shaders in a pipeline statically use any bindings with a particular set number, then no descriptor set need be bound for that set number, even if the pipeline layout includes a non-trivial descriptor set layout for that set number.

        If any of the sets being bound include dynamic uniform or storage buffers, then {@code pDynamicOffsets} includes one element for each array element in each dynamic descriptor type binding in each set. Values are taken from {@code pDynamicOffsets} in an order such that all entries for set N come before set N+1; within a set, entries are ordered by the binding numbers in the descriptor set layouts; and within a binding array, elements are in order. {@code dynamicOffsetCount} <b>must</b> equal the total number of dynamic descriptors in the sets being bound.

        The effective offset used for dynamic uniform and storage buffer bindings is the sum of the relative offset taken from {@code pDynamicOffsets}, and the base address of the buffer plus base offset in the descriptor set. The range of the dynamic uniform and storage buffer bindings is the buffer range as specified in the descriptor set.

        Each of the {@code pDescriptorSets} <b>must</b> be compatible with the pipeline layout specified by {@code layout}. The layout used to program the bindings <b>must</b> also be compatible with the pipeline used in subsequent graphics or compute commands, as defined in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a> section.

        The descriptor set contents bound by a call to {@code vkCmdBindDescriptorSets} <b>may</b> be consumed at the following times:

        <ul>
            <li>For descriptor bindings created with the #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT bit set, the contents <b>may</b> be consumed when the command buffer is submitted to a queue, or during shader execution of the resulting draws and dispatches, or any time in between. Otherwise,</li>
            <li>during host execution of the command, or during shader execution of the resulting draws and dispatches, or any time in between.</li>
        </ul>

        Thus, the contents of a descriptor set binding <b>must</b> not be altered (overwritten by an update command, or freed) between the first point in time that it <b>may</b> be consumed, and when the command completes executing on the queue.

        The contents of {@code pDynamicOffsets} are consumed immediately during execution of {@code vkCmdBindDescriptorSets}. Once all pending uses have completed, it is legal to update and reuse a descriptor set.

        <h5>Valid Usage</h5>
        <ul>
            <li>Each element of {@code pDescriptorSets} <b>must</b> have been allocated with a {@code VkDescriptorSetLayout} that matches (is the same as, or identically defined as) the {@code VkDescriptorSetLayout} at set <em>n</em> in {@code layout}, where <em>n</em> is the sum of {@code firstSet} and the index into {@code pDescriptorSets}</li>
            <li>{@code dynamicOffsetCount} <b>must</b> be equal to the total number of dynamic descriptors in {@code pDescriptorSets}</li>
            <li>The sum of {@code firstSet} and {@code descriptorSetCount} <b>must</b> be less than or equal to ##VkPipelineLayoutCreateInfo{@code ::setLayoutCount} provided when {@code layout} was created</li>
            <li>{@code pipelineBindPoint} <b>must</b> be supported by the {@code commandBuffer}&#8217;s parent {@code VkCommandPool}&#8217;s queue family</li>
            <li>Each element of {@code pDynamicOffsets} which corresponds to a descriptor binding with type #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC <b>must</b> be a multiple of ##VkPhysicalDeviceLimits{@code ::minUniformBufferOffsetAlignment}</li>
            <li>Each element of {@code pDynamicOffsets} which corresponds to a descriptor binding with type #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC <b>must</b> be a multiple of ##VkPhysicalDeviceLimits{@code ::minStorageBufferOffsetAlignment}</li>
            <li>For each dynamic uniform or storage buffer binding in {@code pDescriptorSets}, the sum of the effective offset, as defined above, and the range of the binding <b>must</b> be less than or equal to the size of the buffer</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code pDescriptorSets} <b>must</b> be a valid pointer to an array of {@code descriptorSetCount} valid {@code VkDescriptorSet} handles</li>
            <li>If {@code dynamicOffsetCount} is not 0, {@code pDynamicOffsets} <b>must</b> be a valid pointer to an array of {@code dynamicOffsetCount} {@code uint32_t} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>{@code descriptorSetCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code layout}, and the elements of {@code pDescriptorSets} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the descriptor sets will be bound to."),
        VkPipelineBindPoint("pipelineBindPoint", "a {@code VkPipelineBindPoint} indicating whether the descriptors will be used by graphics pipelines or compute pipelines. There is a separate set of bind points for each of graphics and compute, so binding one does not disturb the other."),
        VkPipelineLayout("layout", "a {@code VkPipelineLayout} object used to program the bindings."),
        uint32_t("firstSet", "the set number of the first descriptor set to be bound."),
        AutoSize("pDescriptorSets")..uint32_t("descriptorSetCount", "the number of elements in the {@code pDescriptorSets} array."),
        VkDescriptorSet.const.p("pDescriptorSets", "a pointer to an array of handles to {@code VkDescriptorSet} objects describing the descriptor sets to write to."),
        AutoSize("pDynamicOffsets")..uint32_t("dynamicOffsetCount", "the number of dynamic offsets in the {@code pDynamicOffsets} array."),
        nullable..uint32_t.const.p("pDynamicOffsets", "a pointer to an array of {@code uint32_t} values specifying dynamic offsets.")
    )

    void(
        "CmdBindIndexBuffer",
        """
        Bind an index buffer to a command buffer.

        <h5>C Specification</h5>
        To bind an index buffer to a command buffer, call:

        <pre><code>
￿void vkCmdBindIndexBuffer(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset,
￿    VkIndexType                                 indexType);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code offset} <b>must</b> be less than the size of {@code buffer}</li>
            <li>The sum of {@code offset} and the address of the range of {@code VkDeviceMemory} object that is backing {@code buffer}, <b>must</b> be a multiple of the type indicated by {@code indexType}</li>
            <li>{@code buffer} <b>must</b> have been created with the #BUFFER_USAGE_INDEX_BUFFER_BIT flag</li>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code indexType} <b>must</b> not be #INDEX_TYPE_NONE_NV.</li>
            <li>If {@code indexType} is #INDEX_TYPE_UINT8_EXT, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-indexTypeUint8">indexTypeUint8</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code indexType} <b>must</b> be a valid {@code VkIndexType} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>Both of {@code buffer}, and {@code commandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkBuffer("buffer", "the buffer being bound."),
        VkDeviceSize("offset", "the starting offset in bytes within {@code buffer} used in index buffer address calculations."),
        VkIndexType("indexType", "a {@code VkIndexType} value specifying whether indices are treated as 16 bits or 32 bits.")
    )

    void(
        "CmdBindVertexBuffers",
        """
        Bind vertex buffers to a command buffer.

        <h5>C Specification</h5>
        To bind vertex buffers to a command buffer for use in subsequent draw commands, call:

        <pre><code>
￿void vkCmdBindVertexBuffers(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstBinding,
￿    uint32_t                                    bindingCount,
￿    const VkBuffer*                             pBuffers,
￿    const VkDeviceSize*                         pOffsets);</code></pre>

        <h5>Description</h5>
        The values taken from elements <code>i</code> of {@code pBuffers} and {@code pOffsets} replace the current state for the vertex input binding <code>firstBinding + i</code>, for <code>i</code> in <code>[0, bindingCount)</code>. The vertex input binding is updated to start at the offset indicated by {@code pOffsets}[i] from the start of the buffer {@code pBuffers}[i]. All vertex input attributes that use each of these bindings will use these updated addresses in their address calculations for subsequent draw commands.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code firstBinding} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}</li>
            <li>The sum of {@code firstBinding} and {@code bindingCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}</li>
            <li>All elements of {@code pOffsets} <b>must</b> be less than the size of the corresponding element in {@code pBuffers}</li>
            <li>All elements of {@code pBuffers} <b>must</b> have been created with the #BUFFER_USAGE_VERTEX_BUFFER_BIT flag</li>
            <li>Each element of {@code pBuffers} that is non-sparse <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBuffers} <b>must</b> be a valid pointer to an array of {@code bindingCount} valid {@code VkBuffer} handles</li>
            <li>{@code pOffsets} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>{@code bindingCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and the elements of {@code pBuffers} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        uint32_t("firstBinding", "the index of the first vertex input binding whose state is updated by the command."),
        AutoSize("pBuffers", "pOffsets")..uint32_t("bindingCount", "the number of vertex input bindings whose state is updated by the command."),
        VkBuffer.const.p("pBuffers", "a pointer to an array of buffer handles."),
        VkDeviceSize.const.p("pOffsets", "a pointer to an array of buffer offsets.")
    )

    void(
        "CmdDraw",
        """
        Draw primitives.

        <h5>C Specification</h5>
        To record a non-indexed draw, call:

        <pre><code>
￿void vkCmdDraw(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    vertexCount,
￿    uint32_t                                    instanceCount,
￿    uint32_t                                    firstVertex,
￿    uint32_t                                    firstInstance);</code></pre>

        <h5>Description</h5>
        When the command is executed, primitives are assembled using the current primitive topology and {@code vertexCount} consecutive vertex indices with the first {@code vertexIndex} value equal to {@code firstVertex}. The primitives are drawn {@code instanceCount} times with {@code instanceIndex} starting with {@code firstInstance} and increasing sequentially for each instance. The assembled primitives execute the bound graphics pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>If a {@code VkImageView} is sampled with #FILTER_LINEAR as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT</li>
            <li>If a {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubic} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT with a reduction mode of either #SAMPLER_REDUCTION_MODE_MIN or #SAMPLER_REDUCTION_MODE_MAX as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubicMinmax} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImage} created with a ##VkImageCreateInfo{@code ::flags} containing #IMAGE_CREATE_CORNER_SAMPLED_BIT_NV sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE.</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>For each push constant that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command</li>
            <li>A valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command requires any dynamic state, that state <b>must</b> have been set for {@code commandBuffer}</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, any resource accessed by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be a protected resource</li>
            <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
            <li>Image subresources used as attachments in the current render pass <b>must</b> not be accessed in any way other than as an attachment by this command.</li>
            <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to ##VkPhysicalDeviceMultiviewProperties{@code ::maxMultiviewInstanceIndex}.</li>
            <li>If the bound graphics pipeline was created with ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} set to #TRUE and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT bit set</li>
            <li>If {@code commandBuffer} is a protected command buffer, any resource written to by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be an unprotected resource</li>
            <li>If {@code commandBuffer} is a protected command buffer, pipeline stages other than the framebuffer-space and compute stages in the {@code VkPipeline} object bound to the pipeline bind point <b>must</b> not write to any resource</li>
            <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
            <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fxvertex-input">Vertex Input Description</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        uint32_t("vertexCount", "the number of vertices to draw."),
        uint32_t("instanceCount", "the number of instances to draw."),
        uint32_t("firstVertex", "the index of the first vertex to draw."),
        uint32_t("firstInstance", "the instance ID of the first instance to draw.")
    )

    void(
        "CmdDrawIndexed",
        """
        Issue an indexed draw into a command buffer.

        <h5>C Specification</h5>
        To record an indexed draw, call:

        <pre><code>
￿void vkCmdDrawIndexed(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    indexCount,
￿    uint32_t                                    instanceCount,
￿    uint32_t                                    firstIndex,
￿    int32_t                                     vertexOffset,
￿    uint32_t                                    firstInstance);</code></pre>

        <h5>Description</h5>
        When the command is executed, primitives are assembled using the current primitive topology and {@code indexCount} vertices whose indices are retrieved from the index buffer. The index buffer is treated as an array of tightly packed unsigned integers of size defined by the #CmdBindIndexBuffer(){@code ::indexType} parameter with which the buffer was bound.

        The first vertex index is at an offset of {@code firstIndex} * {@code indexSize} + {@code offset} within the bound index buffer, where {@code offset} is the offset specified by {@code vkCmdBindIndexBuffer} and {@code indexSize} is the byte size of the type specified by {@code indexType}. Subsequent index values are retrieved from consecutive locations in the index buffer. Indices are first compared to the primitive restart value, then zero extended to 32 bits (if the {@code indexType} is #INDEX_TYPE_UINT8_EXT or #INDEX_TYPE_UINT16) and have {@code vertexOffset} added to them, before being supplied as the {@code vertexIndex} value.

        The primitives are drawn {@code instanceCount} times with {@code instanceIndex} starting with {@code firstInstance} and increasing sequentially for each instance. The assembled primitives execute the bound graphics pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>If a {@code VkImageView} is sampled with #FILTER_LINEAR as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT</li>
            <li>If a {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubic} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT with a reduction mode of either #SAMPLER_REDUCTION_MODE_MIN or #SAMPLER_REDUCTION_MODE_MAX as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubicMinmax} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImage} created with a ##VkImageCreateInfo{@code ::flags} containing #IMAGE_CREATE_CORNER_SAMPLED_BIT_NV sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE.</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>For each push constant that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command</li>
            <li>A valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command requires any dynamic state, that state <b>must</b> have been set for {@code commandBuffer}</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, any resource accessed by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be a protected resource</li>
            <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
            <li>Image subresources used as attachments in the current render pass <b>must</b> not be accessed in any way other than as an attachment by this command.</li>
            <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to ##VkPhysicalDeviceMultiviewProperties{@code ::maxMultiviewInstanceIndex}.</li>
            <li>If the bound graphics pipeline was created with ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} set to #TRUE and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT bit set</li>
            <li>If {@code commandBuffer} is a protected command buffer, any resource written to by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be an unprotected resource</li>
            <li>If {@code commandBuffer} is a protected command buffer, pipeline stages other than the framebuffer-space and compute stages in the {@code VkPipeline} object bound to the pipeline bind point <b>must</b> not write to any resource</li>
            <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
            <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fxvertex-input">Vertex Input Description</a></li>
            <li><code>(indexSize * (firstIndex + indexCount) offset)</code> <b>must</b> be less than or equal to the size of the bound index buffer, with {@code indexSize} being based on the type specified by {@code indexType}, where the index buffer, {@code indexType}, and {@code offset} are specified via {@code vkCmdBindIndexBuffer}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        uint32_t("indexCount", "the number of vertices to draw."),
        uint32_t("instanceCount", "the number of instances to draw."),
        uint32_t("firstIndex", "the base index within the index buffer."),
        int32_t("vertexOffset", "the value added to the vertex index before indexing into the vertex buffer."),
        uint32_t("firstInstance", "the instance ID of the first instance to draw.")
    )

    void(
        "CmdDrawIndirect",
        """
        Issue an indirect draw into a command buffer.

        <h5>C Specification</h5>
        To record a non-indexed indirect draw, call:

        <pre><code>
￿void vkCmdDrawIndirect(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset,
￿    uint32_t                                    drawCount,
￿    uint32_t                                    stride);</code></pre>

        <h5>Description</h5>
        {@code vkCmdDrawIndirect} behaves similarly to #CmdDraw() except that the parameters are read by the device from a buffer during execution. {@code drawCount} draws are executed by the command, with parameters taken from {@code buffer} starting at {@code offset} and increasing by {@code stride} bytes for each successive draw. The parameters of each draw are encoded in an array of ##VkDrawIndirectCommand structures. If {@code drawCount} is less than or equal to one, {@code stride} is ignored.

        <h5>Valid Usage</h5>
        <ul>
            <li>If a {@code VkImageView} is sampled with #FILTER_LINEAR as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT</li>
            <li>If a {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubic} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT with a reduction mode of either #SAMPLER_REDUCTION_MODE_MIN or #SAMPLER_REDUCTION_MODE_MAX as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubicMinmax} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImage} created with a ##VkImageCreateInfo{@code ::flags} containing #IMAGE_CREATE_CORNER_SAMPLED_BIT_NV sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE.</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>For each push constant that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command</li>
            <li>A valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command requires any dynamic state, that state <b>must</b> have been set for {@code commandBuffer}</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, any resource accessed by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be a protected resource</li>
            <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
            <li>Image subresources used as attachments in the current render pass <b>must</b> not be accessed in any way other than as an attachment by this command.</li>
            <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to ##VkPhysicalDeviceMultiviewProperties{@code ::maxMultiviewInstanceIndex}.</li>
            <li>If the bound graphics pipeline was created with ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} set to #TRUE and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT bit set</li>
            <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
            <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fxvertex-input">Vertex Input Description</a></li>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code buffer} <b>must</b> have been created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set</li>
            <li>{@code offset} <b>must</b> be a multiple of 4</li>
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-multiDrawIndirect">multi-draw indirect</a> feature is not enabled, {@code drawCount} <b>must</b> be 0 or 1</li>
            <li>{@code drawCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxDrawIndirectCount}</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-drawIndirectFirstInstance">drawIndirectFirstInstance</a> feature is not enabled, all the {@code firstInstance} members of the ##VkDrawIndirectCommand structures accessed by this command <b>must</b> be 0</li>
            <li>If {@code drawCount} is greater than 1, {@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to {@code sizeof}(##VkDrawIndirectCommand)</li>
            <li>If {@code drawCount} is equal to 1, <code>(offset sizeof(##VkDrawIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>If {@code drawCount} is greater than 1, <code>(stride × (drawCount - 1) + offset sizeof(##VkDrawIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>Both of {@code buffer}, and {@code commandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkBuffer("buffer", "the buffer containing draw parameters."),
        VkDeviceSize("offset", "the byte offset into {@code buffer} where parameters begin."),
        uint32_t("drawCount", "the number of draws to execute, and <b>can</b> be zero."),
        uint32_t("stride", "the byte stride between successive sets of draw parameters.")
    )

    void(
        "CmdDrawIndexedIndirect",
        """
        Perform an indexed indirect draw.

        <h5>C Specification</h5>
        To record an indexed indirect draw, call:

        <pre><code>
￿void vkCmdDrawIndexedIndirect(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset,
￿    uint32_t                                    drawCount,
￿    uint32_t                                    stride);</code></pre>

        <h5>Description</h5>
        {@code vkCmdDrawIndexedIndirect} behaves similarly to #CmdDrawIndexed() except that the parameters are read by the device from a buffer during execution. {@code drawCount} draws are executed by the command, with parameters taken from {@code buffer} starting at {@code offset} and increasing by {@code stride} bytes for each successive draw. The parameters of each draw are encoded in an array of ##VkDrawIndexedIndirectCommand structures. If {@code drawCount} is less than or equal to one, {@code stride} is ignored.

        <h5>Valid Usage</h5>
        <ul>
            <li>If a {@code VkImageView} is sampled with #FILTER_LINEAR as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT</li>
            <li>If a {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubic} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT with a reduction mode of either #SAMPLER_REDUCTION_MODE_MIN or #SAMPLER_REDUCTION_MODE_MAX as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubicMinmax} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImage} created with a ##VkImageCreateInfo{@code ::flags} containing #IMAGE_CREATE_CORNER_SAMPLED_BIT_NV sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE.</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>For each push constant that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command</li>
            <li>A valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command requires any dynamic state, that state <b>must</b> have been set for {@code commandBuffer}</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, any resource accessed by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be a protected resource</li>
            <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
            <li>Image subresources used as attachments in the current render pass <b>must</b> not be accessed in any way other than as an attachment by this command.</li>
            <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to ##VkPhysicalDeviceMultiviewProperties{@code ::maxMultiviewInstanceIndex}.</li>
            <li>If the bound graphics pipeline was created with ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} set to #TRUE and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT bit set</li>
            <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
            <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fxvertex-input">Vertex Input Description</a></li>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code buffer} <b>must</b> have been created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set</li>
            <li>{@code offset} <b>must</b> be a multiple of 4</li>
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-multiDrawIndirect">multi-draw indirect</a> feature is not enabled, {@code drawCount} <b>must</b> be 0 or 1</li>
            <li>{@code drawCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxDrawIndirectCount}</li>
            <li>If {@code drawCount} is greater than 1, {@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to {@code sizeof}(##VkDrawIndexedIndirectCommand)</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-drawIndirectFirstInstance">drawIndirectFirstInstance</a> feature is not enabled, all the {@code firstInstance} members of the ##VkDrawIndexedIndirectCommand structures accessed by this command <b>must</b> be 0</li>
            <li>If {@code drawCount} is equal to 1, <code>(offset sizeof(##VkDrawIndexedIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>If {@code drawCount} is greater than 1, <code>(stride × (drawCount - 1) + offset sizeof(##VkDrawIndexedIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-drawIndirectCount">drawIndirectCount</a> is not enabled this function <b>must</b> not be used</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>Both of {@code buffer}, and {@code commandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkBuffer("buffer", "the buffer containing draw parameters."),
        VkDeviceSize("offset", "the byte offset into {@code buffer} where parameters begin."),
        uint32_t("drawCount", "the number of draws to execute, and <b>can</b> be zero."),
        uint32_t("stride", "the byte stride between successive sets of draw parameters.")
    )

    void(
        "CmdDispatch",
        """
        Dispatch compute work items.

        <h5>C Specification</h5>
        To record a dispatch, call:

        <pre><code>
￿void vkCmdDispatch(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    groupCountX,
￿    uint32_t                                    groupCountY,
￿    uint32_t                                    groupCountZ);</code></pre>

        <h5>Description</h5>
        When the command is executed, a global workgroup consisting of <code>groupCountX × groupCountY × groupCountZ</code> local workgroups is assembled.

        <h5>Valid Usage</h5>
        <ul>
            <li>If a {@code VkImageView} is sampled with #FILTER_LINEAR as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT</li>
            <li>If a {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubic} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT with a reduction mode of either #SAMPLER_REDUCTION_MODE_MIN or #SAMPLER_REDUCTION_MODE_MAX as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubicMinmax} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImage} created with a ##VkImageCreateInfo{@code ::flags} containing #IMAGE_CREATE_CORNER_SAMPLED_BIT_NV sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE.</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>For each push constant that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command</li>
            <li>A valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command requires any dynamic state, that state <b>must</b> have been set for {@code commandBuffer}</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, any resource accessed by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be a protected resource</li>
            <li>If {@code commandBuffer} is a protected command buffer, any resource written to by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be an unprotected resource</li>
            <li>If {@code commandBuffer} is a protected command buffer, pipeline stages other than the framebuffer-space and compute stages in the {@code VkPipeline} object bound to the pipeline bind point <b>must</b> not write to any resource</li>
            <li>{@code groupCountX} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[0]</li>
            <li>{@code groupCountY} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[1]</li>
            <li>{@code groupCountZ} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[2]</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td><td>Compute</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("groupCountX", "the number of local workgroups to dispatch in the X dimension."),
        uint32_t("groupCountY", "the number of local workgroups to dispatch in the Y dimension."),
        uint32_t("groupCountZ", "the number of local workgroups to dispatch in the Z dimension.")
    )

    void(
        "CmdDispatchIndirect",
        """
        Dispatch compute work items using indirect parameters.

        <h5>C Specification</h5>
        To record an indirect command dispatch, call:

        <pre><code>
￿void vkCmdDispatchIndirect(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset);</code></pre>

        <h5>Description</h5>
        {@code vkCmdDispatchIndirect} behaves similarly to #CmdDispatch() except that the parameters are read by the device from a buffer during execution. The parameters of the dispatch are encoded in a ##VkDispatchIndirectCommand structure taken from {@code buffer} starting at {@code offset}.

        <h5>Valid Usage</h5>
        <ul>
            <li>If a {@code VkImageView} is sampled with #FILTER_LINEAR as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT</li>
            <li>If a {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubic} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT with a reduction mode of either #SAMPLER_REDUCTION_MODE_MIN or #SAMPLER_REDUCTION_MODE_MAX as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubicMinmax} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImage} created with a ##VkImageCreateInfo{@code ::flags} containing #IMAGE_CREATE_CORNER_SAMPLED_BIT_NV sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE.</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>For each push constant that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command</li>
            <li>A valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command requires any dynamic state, that state <b>must</b> have been set for {@code commandBuffer}</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, any resource accessed by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be a protected resource</li>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code buffer} <b>must</b> have been created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set</li>
            <li>{@code offset} <b>must</b> be a multiple of 4</li>
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
            <li>The sum of {@code offset} and the size of ##VkDispatchIndirectCommand <b>must</b> be less than or equal to the size of {@code buffer}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Both of {@code buffer}, and {@code commandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td><td>Compute</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBuffer("buffer", "the buffer containing dispatch parameters."),
        VkDeviceSize("offset", "the byte offset into {@code buffer} where parameters begin.")
    )

    void(
        "CmdCopyBuffer",
        """
        Copy data between buffer regions.

        <h5>C Specification</h5>
        To copy data between buffer objects, call:

        <pre><code>
￿void vkCmdCopyBuffer(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    srcBuffer,
￿    VkBuffer                                    dstBuffer,
￿    uint32_t                                    regionCount,
￿    const VkBufferCopy*                         pRegions);</code></pre>

        <h5>Description</h5>
        Each region in {@code pRegions} is copied from the source buffer to the same region of the destination buffer. {@code srcBuffer} and {@code dstBuffer} <b>can</b> be the same buffer or alias the same memory, but the resulting values are undefined if the copy regions overlap in memory.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code srcOffset} member of each element of {@code pRegions} <b>must</b> be less than the size of {@code srcBuffer}</li>
            <li>The {@code dstOffset} member of each element of {@code pRegions} <b>must</b> be less than the size of {@code dstBuffer}</li>
            <li>The {@code size} member of each element of {@code pRegions} <b>must</b> be less than or equal to the size of {@code srcBuffer} minus {@code srcOffset}</li>
            <li>The {@code size} member of each element of {@code pRegions} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
            <li>The union of the source regions, and the union of the destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
            <li>{@code srcBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_SRC_BIT usage flag</li>
            <li>If {@code srcBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code dstBuffer} <b>must</b> not be an unprotected buffer</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid ##VkBufferCopy structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code dstBuffer}, and {@code srcBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkBufferCopy
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBuffer("srcBuffer", "the source buffer."),
        VkBuffer("dstBuffer", "the destination buffer."),
        AutoSize("pRegions")..uint32_t("regionCount", "the number of regions to copy."),
        VkBufferCopy.const.p("pRegions", "a pointer to an array of ##VkBufferCopy structures specifying the regions to copy.")
    )

    void(
        "CmdCopyImage",
        """
        Copy data between images.

        <h5>C Specification</h5>
        To copy data between image objects, call:

        <pre><code>
￿void vkCmdCopyImage(
￿    VkCommandBuffer                             commandBuffer,
￿    VkImage                                     srcImage,
￿    VkImageLayout                               srcImageLayout,
￿    VkImage                                     dstImage,
￿    VkImageLayout                               dstImageLayout,
￿    uint32_t                                    regionCount,
￿    const VkImageCopy*                          pRegions);</code></pre>

        <h5>Description</h5>
        Each region in {@code pRegions} is copied from the source image to the same region of the destination image. {@code srcImage} and {@code dstImage} <b>can</b> be the same image or alias the same memory.

        The formats of {@code srcImage} and {@code dstImage} <b>must</b> be compatible. Formats are compatible if they share the same class, as shown in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-compatibility">Compatible Formats</a> table. Depth/stencil formats <b>must</b> match exactly.

        If the format of {@code srcImage} or {@code dstImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion"><em>multi-planar</em> image format</a>, regions of each plane to be copied <b>must</b> be specified separately using the {@code srcSubresource} and {@code dstSubresource} members of the ##VkImageCopy structure. In this case, the {@code aspectMask} of the {@code srcSubresource} or {@code dstSubresource} that refers to the multi-planar image <b>must</b> be #IMAGE_ASPECT_PLANE_0_BIT, #IMAGE_ASPECT_PLANE_1_BIT, or #IMAGE_ASPECT_PLANE_2_BIT. For the purposes of {@code vkCmdCopyImage}, each plane of a multi-planar image is treated as having the format listed in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-compatible-planes">Compatible formats of planes of multi-planar formats</a> for the plane identified by the {@code aspectMask} of the corresponding subresource. This applies both to {@code VkFormat} and to coordinates used in the copy, which correspond to texels in the <em>plane</em> rather than how these texels map to coordinates in the image as a whole.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        For example, the #IMAGE_ASPECT_PLANE_1_BIT plane of a #FORMAT_G8_B8R8_2PLANE_420_UNORM image is compatible with an image of format #FORMAT_R8G8_UNORM and (less usefully) with the #IMAGE_ASPECT_PLANE_0_BIT plane of an image of format #FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16, as each texel is 2 bytes in size.
        </div>

        {@code vkCmdCopyImage} allows copying between <em>size-compatible</em> compressed and uncompressed internal formats. Formats are size-compatible if the texel block size of the uncompressed format is equal to the texel block size of the compressed format. Such a copy does not perform on-the-fly compression or decompression. When copying from an uncompressed format to a compressed format, each texel of uncompressed data of the source image is copied as a raw value to the corresponding compressed texel block of the destination image. When copying from a compressed format to an uncompressed format, each compressed texel block of the source image is copied as a raw value to the corresponding texel of uncompressed data in the destination image. Thus, for example, it is legal to copy between a 128-bit uncompressed format and a compressed format which has a 128-bit sized compressed texel block representing 4×4 texels (using 8 bits per texel), or between a 64-bit uncompressed format and a compressed format which has a 64-bit sized compressed texel block representing 4×4 texels (using 4 bits per texel).

        When copying between compressed and uncompressed formats the {@code extent} members represent the texel dimensions of the source image and not the destination. When copying from a compressed image to an uncompressed image the image texel dimensions written to the uncompressed image will be source extent divided by the compressed texel block dimensions. When copying from an uncompressed image to a compressed image the image texel dimensions written to the compressed image will be the source extent multiplied by the compressed texel block dimensions. In both cases the number of bytes read and the number of bytes written will be identical.

        Copying to or from block-compressed images is typically done in multiples of the compressed texel block size. For this reason the {@code extent} <b>must</b> be a multiple of the compressed texel block dimension. There is one exception to this rule which is required: to handle compressed images created with dimensions that are not a multiple of the compressed texel block dimensions: if the {@code srcImage} is compressed, then:

        <ul>
            <li>If {@code extent.width} is not a multiple of the compressed texel block width, then <code>(extent.width + srcOffset.x)</code> <b>must</b> equal the image subresource width.</li>
            <li>If {@code extent.height} is not a multiple of the compressed texel block height, then <code>(extent.height + srcOffset.y)</code> <b>must</b> equal the image subresource height.</li>
            <li>If {@code extent.depth} is not a multiple of the compressed texel block depth, then <code>(extent.depth + srcOffset.z)</code> <b>must</b> equal the image subresource depth.</li>
        </ul>

        Similarly, if the {@code dstImage} is compressed, then:

        <ul>
            <li>If {@code extent.width} is not a multiple of the compressed texel block width, then <code>(extent.width + dstOffset.x)</code> <b>must</b> equal the image subresource width.</li>
            <li>If {@code extent.height} is not a multiple of the compressed texel block height, then <code>(extent.height + dstOffset.y)</code> <b>must</b> equal the image subresource height.</li>
            <li>If {@code extent.depth} is not a multiple of the compressed texel block depth, then <code>(extent.depth + dstOffset.z)</code> <b>must</b> equal the image subresource depth.</li>
        </ul>

        This allows the last compressed texel block of the image in each non-multiple dimension to be included as a source or destination of the copy.

        "{@code _422}" image formats that are not <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion"><em>multi-planar</em></a> are treated as having a 2×1 compressed texel block for the purposes of these rules.

        {@code vkCmdCopyImage} <b>can</b> be used to copy image data between multisample images, but both images <b>must</b> have the same number of samples.

        <h5>Valid Usage</h5>
        <ul>
            <li>The source region specified by each element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage} if the {@code srcImage}&#8217;s {@code VkFormat} is not a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, and <b>must</b> be a region that is contained within the plane being copied if the {@code srcImage}&#8217;s {@code VkFormat} is a multi-planar format</li>
            <li>The destination region specified by each element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage} if the {@code dstImage}&#8217;s {@code VkFormat} is not a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, and <b>must</b> be a region that is contained within the plane being copied to if the {@code dstImage}&#8217;s {@code VkFormat} is a multi-planar format</li>
            <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain #FORMAT_FEATURE_TRANSFER_SRC_BIT.</li>
            <li>{@code srcImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT usage flag</li>
            <li>If {@code srcImage} is non-sparse then the image or <em>disjoint</em> plane to be copied <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code srcImageLayout} <b>must</b> be #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL, #IMAGE_LAYOUT_GENERAL, or #IMAGE_LAYOUT_SHARED_PRESENT_KHR</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code dstImage} <b>must</b> contain #FORMAT_FEATURE_TRANSFER_DST_BIT.</li>
            <li>{@code dstImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstImage} is non-sparse then the image or <em>disjoint</em> plane that is the destination of the copy <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code dstImageLayout} <b>must</b> be #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL, #IMAGE_LAYOUT_GENERAL, or #IMAGE_LAYOUT_SHARED_PRESENT_KHR</li>
            <li>If the {@code VkFormat} of each of {@code srcImage} and {@code dstImage} is not a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion"><em>multi-planar format</em></a>, the {@code VkFormat} of each of {@code srcImage} and {@code dstImage} <b>must</b> be compatible, as defined <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies-images-format-compatibility">above</a></li>
            <li>In a copy to or from a plane of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar image</a>, the {@code VkFormat} of the image and plane <b>must</b> be compatible according to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-compatible-planes">the description of compatible planes</a> for the plane being copied</li>
            <li>When a copy is performed to or from an image with a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, the {@code aspectMask} of the {@code srcSubresource} and/or {@code dstSubresource} that refers to the multi-planar image <b>must</b> be #IMAGE_ASPECT_PLANE_0_BIT, #IMAGE_ASPECT_PLANE_1_BIT, or #IMAGE_ASPECT_PLANE_2_BIT (with #IMAGE_ASPECT_PLANE_2_BIT valid only for a {@code VkFormat} with three planes)</li>
            <li>The sample count of {@code srcImage} and {@code dstImage} <b>must</b> match</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code dstImage} <b>must</b> not be an unprotected image</li>
            <li>The {@code srcSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The {@code dstSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>The <code>srcSubresource.baseArrayLayer srcSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The <code>dstSubresource.baseArrayLayer dstSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>The {@code srcOffset} and {@code extent} members of each element of {@code pRegions} <b>must</b> respect the image transfer granularity requirements of {@code commandBuffer}&#8217;s command pool&#8217;s queue family, as described in ##VkQueueFamilyProperties</li>
            <li>The {@code dstOffset} and {@code extent} members of each element of {@code pRegions} <b>must</b> respect the image transfer granularity requirements of {@code commandBuffer}&#8217;s command pool&#8217;s queue family, as described in ##VkQueueFamilyProperties</li>
            <li>{@code dstImage} and {@code srcImage} <b>must</b> not have been created with {@code flags} containing #IMAGE_CREATE_SUBSAMPLED_BIT_EXT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid ##VkImageCopy structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkImageCopy
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkImage("srcImage", "the source image."),
        VkImageLayout("srcImageLayout", "the current layout of the source image subresource."),
        VkImage("dstImage", "the destination image."),
        VkImageLayout("dstImageLayout", "the current layout of the destination image subresource."),
        AutoSize("pRegions")..uint32_t("regionCount", "the number of regions to copy."),
        VkImageCopy.const.p("pRegions", "a pointer to an array of ##VkImageCopy structures specifying the regions to copy.")
    )

    void(
        "CmdBlitImage",
        """
        Copy regions of an image, potentially performing format conversion,.

        <h5>C Specification</h5>
        To copy regions of a source image into a destination image, potentially performing format conversion, arbitrary scaling, and filtering, call:

        <pre><code>
￿void vkCmdBlitImage(
￿    VkCommandBuffer                             commandBuffer,
￿    VkImage                                     srcImage,
￿    VkImageLayout                               srcImageLayout,
￿    VkImage                                     dstImage,
￿    VkImageLayout                               dstImageLayout,
￿    uint32_t                                    regionCount,
￿    const VkImageBlit*                          pRegions,
￿    VkFilter                                    filter);</code></pre>

        <h5>Description</h5>
        {@code vkCmdBlitImage} <b>must</b> not be used for multisampled source or destination images. Use #CmdResolveImage() for this purpose.

        As the sizes of the source and destination extents <b>can</b> differ in any dimension, texels in the source extent are scaled and filtered to the destination extent. Scaling occurs via the following operations:

        <ul>
            <li>
                For each destination texel, the integer coordinate of that texel is converted to an unnormalized texture coordinate, using the effective inverse of the equations described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#textures-unnormalized-to-integer">unnormalized to integer conversion</a>:
                <dl>
            <dd><code>u<sub>base</sub> = i + ½</code></dd>

                    <dd><code>v<sub>base</sub> = j + ½</code></dd>

                    <dd><code>w<sub>base</sub> = k + ½</code></dd>
                </dl>
            </li>
            <li>
                These base coordinates are then offset by the first destination offset:
                <dl>
            <dd><code>u<sub>offset</sub> = u<sub>base</sub> - x<sub>dst0</sub></code></dd>

                    <dd><code>v<sub>offset</sub> = v<sub>base</sub> - y<sub>dst0</sub></code></dd>

                    <dd><code>w<sub>offset</sub> = w<sub>base</sub> - z<sub>dst0</sub></code></dd>

                    <dd><code>a<sub>offset</sub> = a - baseArrayCount<sub>dst</sub></code></dd>
                </dl>
            </li>
            <li>
                The scale is determined from the source and destination regions, and applied to the offset coordinates:
                <dl>
            <dd><code>scale_u = (x<sub>src1</sub> - x<sub>src0</sub>) / (x<sub>dst1</sub> - x<sub>dst0</sub>)</code></dd>

                    <dd><code>scale_v = (y<sub>src1</sub> - y<sub>src0</sub>) / (y<sub>dst1</sub> - y<sub>dst0</sub>)</code></dd>

                    <dd><code>scale_w = (z<sub>src1</sub> - z<sub>src0</sub>) / (z<sub>dst1</sub> - z<sub>dst0</sub>)</code></dd>

                    <dd><code>u<sub>scaled</sub> = u<sub>offset</sub> * scale<sub>u</sub></code></dd>

                    <dd><code>v<sub>scaled</sub> = v<sub>offset</sub> * scale<sub>v</sub></code></dd>

                    <dd><code>w<sub>scaled</sub> = w<sub>offset</sub> * scale<sub>w</sub></code></dd>
                </dl>
            </li>
            <li>
                Finally the source offset is added to the scaled coordinates, to determine the final unnormalized coordinates used to sample from {@code srcImage}:
                <dl>
            <dd><code>u = u<sub>scaled</sub> + x<sub>src0</sub></code></dd>

                    <dd><code>v = v<sub>scaled</sub> + y<sub>src0</sub></code></dd>

                    <dd><code>w = w<sub>scaled</sub> + z<sub>src0</sub></code></dd>

                    <dd><code>q = mipLevel</code></dd>

                    <dd><code>a = a<sub>offset</sub> + baseArrayCount<sub>src</sub></code></dd>
                </dl>
            </li>
        </ul>

        These coordinates are used to sample from the source image, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#textures">Image Operations chapter</a>, with the filter mode equal to that of {@code filter}, a mipmap mode of #SAMPLER_MIPMAP_MODE_NEAREST and an address mode of #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE. Implementations <b>must</b> clamp at the edge of the source image, and <b>may</b> additionally clamp to the edge of the source region.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Due to allowable rounding errors in the generation of the source texture coordinates, it is not always possible to guarantee exactly which source texels will be sampled for a given blit. As rounding errors are implementation dependent, the exact results of a blitting operation are also implementation dependent.
        </div>

        Blits are done layer by layer starting with the {@code baseArrayLayer} member of {@code srcSubresource} for the source and {@code dstSubresource} for the destination. {@code layerCount} layers are blitted to the destination image.

        3D textures are blitted slice by slice. Slices in the source region bounded by {@code srcOffsets}[0].z and {@code srcOffsets}[1].z are copied to slices in the destination region bounded by {@code dstOffsets}[0].z and {@code dstOffsets}[1].z. For each destination slice, a source <b>z</b> coordinate is linearly interpolated between {@code srcOffsets}[0].z and {@code srcOffsets}[1].z. If the {@code filter} parameter is #FILTER_LINEAR then the value sampled from the source image is taken by doing linear filtering using the interpolated <b>z</b> coordinate. If {@code filter} parameter is #FILTER_NEAREST then the value sampled from the source image is taken from the single nearest slice, with an implementation-dependent arithmetic rounding mode.

        The following filtering and conversion rules apply:

        <ul>
            <li>Integer formats <b>can</b> only be converted to other integer formats with the same signedness.</li>
            <li>No format conversion is supported between depth/stencil images. The formats <b>must</b> match.</li>
            <li>Format conversions on unorm, snorm, unscaled and packed float formats of the copied aspect of the image are performed by first converting the pixels to float values.</li>
            <li>For sRGB source formats, nonlinear RGB values are converted to linear representation prior to filtering.</li>
            <li>After filtering, the float values are first clamped and then cast to the destination image format. In case of sRGB destination format, linear RGB values are converted to nonlinear representation before writing the pixel to the image.</li>
        </ul>

        Signed and unsigned integers are converted by first clamping to the representable range of the destination format, then casting the value.

        <h5>Valid Usage</h5>
        <ul>
            <li>The source region specified by each element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
            <li>The destination region specified by each element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
            <li>The union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory with any texel that <b>may</b> be sampled during the blit operation</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain #FORMAT_FEATURE_BLIT_SRC_BIT.</li>
            <li>{@code srcImage} <b>must</b> not use a format listed in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">Formats requiring sampler Y'C<sub>B</sub>C<sub>R</sub> conversion for #IMAGE_ASPECT_COLOR_BIT image views</a></li>
            <li>{@code srcImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT usage flag</li>
            <li>If {@code srcImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code srcImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code dstImage} <b>must</b> contain #FORMAT_FEATURE_BLIT_DST_BIT.</li>
            <li>{@code dstImage} <b>must</b> not use a format listed in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">Formats requiring sampler Y'C<sub>B</sub>C<sub>R</sub> conversion for #IMAGE_ASPECT_COLOR_BIT image views</a></li>
            <li>{@code dstImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code dstImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>The sample count of {@code srcImage} and {@code dstImage} <b>must</b> both be equal to #SAMPLE_COUNT_1_BIT</li>
            <li>If either of {@code srcImage} or {@code dstImage} was created with a signed integer {@code VkFormat}, the other <b>must</b> also have been created with a signed integer {@code VkFormat}</li>
            <li>If either of {@code srcImage} or {@code dstImage} was created with an unsigned integer {@code VkFormat}, the other <b>must</b> also have been created with an unsigned integer {@code VkFormat}</li>
            <li>If either of {@code srcImage} or {@code dstImage} was created with a depth/stencil format, the other <b>must</b> have exactly the same format</li>
            <li>If {@code srcImage} was created with a depth/stencil format, {@code filter} <b>must</b> be #FILTER_NEAREST</li>
            <li>{@code srcImage} <b>must</b> have been created with a {@code samples} value of #SAMPLE_COUNT_1_BIT</li>
            <li>{@code dstImage} <b>must</b> have been created with a {@code samples} value of #SAMPLE_COUNT_1_BIT</li>
            <li>If {@code filter} is #FILTER_LINEAR, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT.</li>
            <li>If {@code filter} is #FILTER_CUBIC_EXT, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT.</li>
            <li>If {@code filter} is #FILTER_CUBIC_EXT, {@code srcImage} <b>must</b> have a {@code VkImageType} of #IMAGE_TYPE_2D</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code dstImage} <b>must</b> not be an unprotected image</li>
            <li>The {@code srcSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The {@code dstSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>The <code>srcSubresource.baseArrayLayer srcSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The <code>dstSubresource.baseArrayLayer dstSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>{@code dstImage} and {@code srcImage} <b>must</b> not have been created with {@code flags} containing #IMAGE_CREATE_SUBSAMPLED_BIT_EXT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid ##VkImageBlit structures</li>
            <li>{@code filter} <b>must</b> be a valid {@code VkFilter} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkImageBlit
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkImage("srcImage", "the source image."),
        VkImageLayout("srcImageLayout", "the layout of the source image subresources for the blit."),
        VkImage("dstImage", "the destination image."),
        VkImageLayout("dstImageLayout", "the layout of the destination image subresources for the blit."),
        AutoSize("pRegions")..uint32_t("regionCount", "the number of regions to blit."),
        VkImageBlit.const.p("pRegions", "a pointer to an array of ##VkImageBlit structures specifying the regions to blit."),
        VkFilter("filter", "a {@code VkFilter} specifying the filter to apply if the blits require scaling.")
    )

    void(
        "CmdCopyBufferToImage",
        """
        Copy data from a buffer into an image.

        <h5>C Specification</h5>
        To copy data from a buffer object to an image object, call:

        <pre><code>
￿void vkCmdCopyBufferToImage(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    srcBuffer,
￿    VkImage                                     dstImage,
￿    VkImageLayout                               dstImageLayout,
￿    uint32_t                                    regionCount,
￿    const VkBufferImageCopy*                    pRegions);</code></pre>

        <h5>Description</h5>
        Each region in {@code pRegions} is copied from the specified region of the source buffer to the specified region of the destination image.

        If the format of {@code dstImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>), regions of each plane to be a target of a copy <b>must</b> be specified separately using the {@code pRegions} member of the ##VkBufferImageCopy structure. In this case, the {@code aspectMask} of {@code imageSubresource} <b>must</b> be #IMAGE_ASPECT_PLANE_0_BIT, #IMAGE_ASPECT_PLANE_1_BIT, or #IMAGE_ASPECT_PLANE_2_BIT. For the purposes of {@code vkCmdCopyBufferToImage}, each plane of a multi-planar image is treated as having the format listed in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-compatible-planes">Compatible formats of planes of multi-planar formats</a> for the plane identified by the {@code aspectMask} of the corresponding subresource. This applies both to {@code VkFormat} and to coordinates used in the copy, which correspond to texels in the <em>plane</em> rather than how these texels map to coordinates in the image as a whole.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code srcBuffer} <b>must</b> be large enough to contain all buffer locations that are accessed according to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies-buffers-images-addressing">Buffer and Image Addressing</a>, for each element of {@code pRegions}</li>
            <li>The image region specified by each element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage} if the {@code dstImage}&#8217;s {@code VkFormat} is not a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, and <b>must</b> be a region that is contained within the plane being copied to if the {@code dstImage}&#8217;s {@code VkFormat} is a multi-planar format</li>
            <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
            <li>{@code srcBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_SRC_BIT usage flag</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code dstImage} <b>must</b> contain #FORMAT_FEATURE_TRANSFER_DST_BIT.</li>
            <li>If {@code srcBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstImage} <b>must</b> have a sample count equal to #SAMPLE_COUNT_1_BIT</li>
            <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code dstImageLayout} <b>must</b> be #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL, #IMAGE_LAYOUT_GENERAL, or #IMAGE_LAYOUT_SHARED_PRESENT_KHR</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code dstImage} <b>must</b> not be an unprotected image</li>
            <li>The {@code imageSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>The <code>imageSubresource.baseArrayLayer imageSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>The {@code imageOffset} and {@code imageExtent} members of each element of {@code pRegions} <b>must</b> respect the image transfer granularity requirements of {@code commandBuffer}&#8217;s command pool&#8217;s queue family, as described in ##VkQueueFamilyProperties</li>
            <li>{@code dstImage} <b>must</b> not have been created with {@code flags} containing #IMAGE_CREATE_SUBSAMPLED_BIT_EXT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid ##VkBufferImageCopy structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code dstImage}, and {@code srcBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkBufferImageCopy
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBuffer("srcBuffer", "the source buffer."),
        VkImage("dstImage", "the destination image."),
        VkImageLayout("dstImageLayout", "the layout of the destination image subresources for the copy."),
        AutoSize("pRegions")..uint32_t("regionCount", "the number of regions to copy."),
        VkBufferImageCopy.const.p("pRegions", "a pointer to an array of ##VkBufferImageCopy structures specifying the regions to copy.")
    )

    void(
        "CmdCopyImageToBuffer",
        """
        Copy image data into a buffer.

        <h5>C Specification</h5>
        To copy data from an image object to a buffer object, call:

        <pre><code>
￿void vkCmdCopyImageToBuffer(
￿    VkCommandBuffer                             commandBuffer,
￿    VkImage                                     srcImage,
￿    VkImageLayout                               srcImageLayout,
￿    VkBuffer                                    dstBuffer,
￿    uint32_t                                    regionCount,
￿    const VkBufferImageCopy*                    pRegions);</code></pre>

        <h5>Description</h5>
        Each region in {@code pRegions} is copied from the specified region of the source image to the specified region of the destination buffer.

        If the {@code VkFormat} of {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, regions of each plane to be a source of a copy <b>must</b> be specified separately using the {@code pRegions} member of the ##VkBufferImageCopy structure. In this case, the {@code aspectMask} of {@code imageSubresource} <b>must</b> be #IMAGE_ASPECT_PLANE_0_BIT, #IMAGE_ASPECT_PLANE_1_BIT, or #IMAGE_ASPECT_PLANE_2_BIT. For the purposes of {@code vkCmdCopyBufferToImage}, each plane of a multi-planar image is treated as having the format listed in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-compatible-planes">Compatible formats of planes of multi-planar formats</a> for the plane identified by the {@code aspectMask} of the corresponding subresource. This applies both to {@code VkFormat} and to coordinates used in the copy, which correspond to texels in the <em>plane</em> rather than how these texels map to coordinates in the image as a whole.

        <h5>Valid Usage</h5>
        <ul>
            <li>The image region specified by each element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage} if the {@code srcImage}&#8217;s {@code VkFormat} is not a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, and <b>must</b> be a region that is contained within the plane being copied if the {@code srcImage}&#8217;s {@code VkFormat} is a multi-planar format</li>
            <li>{@code dstBuffer} <b>must</b> be large enough to contain all buffer locations that are accessed according to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies-buffers-images-addressing">Buffer and Image Addressing</a>, for each element of {@code pRegions}</li>
            <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain #FORMAT_FEATURE_TRANSFER_SRC_BIT.</li>
            <li>{@code srcImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT usage flag</li>
            <li>If {@code srcImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code srcImage} <b>must</b> have a sample count equal to #SAMPLE_COUNT_1_BIT</li>
            <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code srcImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>{@code dstBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code dstBuffer} <b>must</b> not be an unprotected buffer</li>
            <li>The {@code imageSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The <code>imageSubresource.baseArrayLayer imageSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The {@code imageOffset} and {@code imageExtent} members of each element of {@code pRegions} <b>must</b> respect the image transfer granularity requirements of {@code commandBuffer}&#8217;s command pool&#8217;s queue family, as described in ##VkQueueFamilyProperties</li>
            <li>{@code srcImage} <b>must</b> not have been created with {@code flags} containing #IMAGE_CREATE_SUBSAMPLED_BIT_EXT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid ##VkBufferImageCopy structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code dstBuffer}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkBufferImageCopy
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkImage("srcImage", "the source image."),
        VkImageLayout("srcImageLayout", "the layout of the source image subresources for the copy."),
        VkBuffer("dstBuffer", "the destination buffer."),
        AutoSize("pRegions")..uint32_t("regionCount", "the number of regions to copy."),
        VkBufferImageCopy.const.p("pRegions", "a pointer to an array of ##VkBufferImageCopy structures specifying the regions to copy.")
    )

    void(
        "CmdUpdateBuffer",
        """
        Update a buffer's contents from host memory.

        <h5>C Specification</h5>
        To update buffer data inline in a command buffer, call:

        <pre><code>
￿void vkCmdUpdateBuffer(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    dstBuffer,
￿    VkDeviceSize                                dstOffset,
￿    VkDeviceSize                                dataSize,
￿    const void*                                 pData);</code></pre>

        <h5>Description</h5>
        {@code dataSize} <b>must</b> be less than or equal to 65536 bytes. For larger updates, applications <b>can</b> use buffer to buffer <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies-buffers">copies</a>.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Buffer updates performed with {@code vkCmdUpdateBuffer} first copy the data into command buffer memory when the command is recorded (which requires additional storage and may incur an additional allocation), and then copy the data from the command buffer into {@code dstBuffer} when the command is executed on a device.

        The additional cost of this functionality compared to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies-buffers">buffer to buffer copies</a> means it is only recommended for very small amounts of data, and is why it is limited to only 65536 bytes.

        Applications <b>can</b> work around this by issuing multiple {@code vkCmdUpdateBuffer} commands to different ranges of the same buffer, but it is strongly recommended that they <b>should</b> not.
        </div>

        The source data is copied from the user pointer to the command buffer when the command is called.

        {@code vkCmdUpdateBuffer} is only allowed outside of a render pass. This command is treated as "{@code transfer}" operation, for the purposes of synchronization barriers. The #BUFFER_USAGE_TRANSFER_DST_BIT <b>must</b> be specified in {@code usage} of ##VkBufferCreateInfo in order for the buffer to be compatible with {@code vkCmdUpdateBuffer}.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
            <li>{@code dataSize} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
            <li>{@code dstBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
            <li>{@code dataSize} <b>must</b> be less than or equal to 65536</li>
            <li>{@code dataSize} <b>must</b> be a multiple of 4</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code dstBuffer} <b>must</b> not be an unprotected buffer</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code dataSize} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and {@code dstBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td><td>Transfer</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBuffer("dstBuffer", "a handle to the buffer to be updated."),
        VkDeviceSize("dstOffset", "the byte offset into the buffer to start updating, and <b>must</b> be a multiple of 4."),
        AutoSize("pData")..VkDeviceSize("dataSize", "the number of bytes to update, and <b>must</b> be a multiple of 4."),
        void.const.p("pData", "a pointer to the source data for the buffer update, and <b>must</b> be at least {@code dataSize} bytes in size.")
    )

    void(
        "CmdFillBuffer",
        """
        Fill a region of a buffer with a fixed value.

        <h5>C Specification</h5>
        To clear buffer data, call:

        <pre><code>
￿void vkCmdFillBuffer(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    dstBuffer,
￿    VkDeviceSize                                dstOffset,
￿    VkDeviceSize                                size,
￿    uint32_t                                    data);</code></pre>

        <h5>Description</h5>
        {@code vkCmdFillBuffer} is treated as "{@code transfer}" operation for the purposes of synchronization barriers. The #BUFFER_USAGE_TRANSFER_DST_BIT <b>must</b> be specified in {@code usage} of ##VkBufferCreateInfo in order for the buffer to be compatible with {@code vkCmdFillBuffer}.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
            <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code size} <b>must</b> be greater than 0</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code size} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code size} <b>must</b> be a multiple of 4</li>
            <li>{@code dstBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code dstBuffer} <b>must</b> not be an unprotected buffer</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Both of {@code commandBuffer}, and {@code dstBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td><td>Transfer</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBuffer("dstBuffer", "the buffer to be filled."),
        VkDeviceSize("dstOffset", "the byte offset into the buffer at which to start filling, and <b>must</b> be a multiple of 4."),
        VkDeviceSize("size", "the number of bytes to fill, and <b>must</b> be either a multiple of 4, or #WHOLE_SIZE to fill the range from {@code offset} to the end of the buffer. If #WHOLE_SIZE is used and the remaining size of the buffer is not a multiple of 4, then the nearest smaller multiple is used."),
        uint32_t("data", "the 4-byte word written repeatedly to the buffer to fill {@code size} bytes of data. The data word is written to memory according to the host endianness.")
    )

    void(
        "CmdClearColorImage",
        """
        Clear regions of a color image.

        <h5>C Specification</h5>
        To clear one or more subranges of a color image, call:

        <pre><code>
￿void vkCmdClearColorImage(
￿    VkCommandBuffer                             commandBuffer,
￿    VkImage                                     image,
￿    VkImageLayout                               imageLayout,
￿    const VkClearColorValue*                    pColor,
￿    uint32_t                                    rangeCount,
￿    const VkImageSubresourceRange*              pRanges);</code></pre>

        <h5>Description</h5>
        Each specified range in {@code pRanges} is cleared to the value specified by {@code pColor}.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code image} <b>must</b> contain #FORMAT_FEATURE_TRANSFER_DST_BIT.</li>
            <li>{@code image} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>{@code image} <b>must</b> not use a format listed in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">Formats requiring sampler Y'C<sub>B</sub>C<sub>R</sub> conversion for #IMAGE_ASPECT_COLOR_BIT image views</a></li>
            <li>If {@code image} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code imageLayout} <b>must</b> specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code imageLayout} <b>must</b> be #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL, #IMAGE_LAYOUT_GENERAL, or #IMAGE_LAYOUT_SHARED_PRESENT_KHR</li>
            <li>The ##VkImageSubresourceRange{@code ::aspectMask} members of the elements of the {@code pRanges} array <b>must</b> each only include #IMAGE_ASPECT_COLOR_BIT</li>
            <li>The ##VkImageSubresourceRange{@code ::baseMipLevel} members of the elements of the {@code pRanges} array <b>must</b> each be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>For each ##VkImageSubresourceRange element of {@code pRanges}, if the {@code levelCount} member is not #REMAINING_MIP_LEVELS, then <code>baseMipLevel + levelCount</code> <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>The ##VkImageSubresourceRange{@code ::baseArrayLayer} members of the elements of the {@code pRanges} array <b>must</b> each be less than the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>For each ##VkImageSubresourceRange element of {@code pRanges}, if the {@code layerCount} member is not #REMAINING_ARRAY_LAYERS, then <code>baseArrayLayer + layerCount</code> <b>must</b> be less than the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>{@code image} <b>must</b> not have a compressed or depth/stencil format</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code image} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code image} <b>must</b> not be an unprotected image</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pColor} <b>must</b> be a valid pointer to a valid ##VkClearColorValue union</li>
            <li>{@code pRanges} <b>must</b> be a valid pointer to an array of {@code rangeCount} valid ##VkImageSubresourceRange structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code rangeCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and {@code image} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics Compute</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkClearColorValue, ##VkImageSubresourceRange
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkImage("image", "the image to be cleared."),
        VkImageLayout("imageLayout", "specifies the current layout of the image subresource ranges to be cleared, and <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_GENERAL or #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL."),
        VkClearColorValue.const.p("pColor", "a pointer to a ##VkClearColorValue structure containing the values that the image subresource ranges will be cleared to (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#clears-values\">Clear Values</a> below)."),
        AutoSize("pRanges")..uint32_t("rangeCount", "the number of image subresource range structures in {@code pRanges}."),
        VkImageSubresourceRange.const.p("pRanges", "a pointer to an array of ##VkImageSubresourceRange structures describing a range of mipmap levels, array layers, and aspects to be cleared, as described in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#resources-image-views\">Image Views</a>.")
    )

    void(
        "CmdClearDepthStencilImage",
        """
        Fill regions of a combined depth/stencil image.

        <h5>C Specification</h5>
        To clear one or more subranges of a depth/stencil image, call:

        <pre><code>
￿void vkCmdClearDepthStencilImage(
￿    VkCommandBuffer                             commandBuffer,
￿    VkImage                                     image,
￿    VkImageLayout                               imageLayout,
￿    const VkClearDepthStencilValue*             pDepthStencil,
￿    uint32_t                                    rangeCount,
￿    const VkImageSubresourceRange*              pRanges);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code image} <b>must</b> contain #FORMAT_FEATURE_TRANSFER_DST_BIT.</li>
            <li>If any element of {@code pRanges.aspect} includes #IMAGE_ASPECT_STENCIL_BIT, and {@code image} was created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkImageStencilUsageCreateInfo">separate stencil usage</a>, #IMAGE_USAGE_TRANSFER_DST_BIT <b>must</b> have been included in the ##VkImageStencilUsageCreateInfo{@code ::stencilUsage} used to create {@code image}</li>
            <li>If any element of {@code pRanges.aspect} includes #IMAGE_ASPECT_STENCIL_BIT, and {@code image} was not created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkImageStencilUsageCreateInfo">separate stencil usage</a>, #IMAGE_USAGE_TRANSFER_DST_BIT <b>must</b> have been included in the ##VkImageCreateInfo{@code ::usage} used to create {@code image}</li>
            <li>If any element of {@code pRanges.aspect} includes #IMAGE_ASPECT_DEPTH_BIT, #IMAGE_USAGE_TRANSFER_DST_BIT <b>must</b> have been included in the ##VkImageCreateInfo{@code ::usage} used to create {@code image}</li>
            <li>If {@code image} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code imageLayout} <b>must</b> specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code imageLayout} <b>must</b> be either of #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>The ##VkImageSubresourceRange{@code ::aspectMask} member of each element of the {@code pRanges} array <b>must</b> not include bits other than #IMAGE_ASPECT_DEPTH_BIT or #IMAGE_ASPECT_STENCIL_BIT</li>
            <li>If the {@code image}&#8217;s format does not have a stencil component, then the ##VkImageSubresourceRange{@code ::aspectMask} member of each element of the {@code pRanges} array <b>must</b> not include the #IMAGE_ASPECT_STENCIL_BIT bit</li>
            <li>If the {@code image}&#8217;s format does not have a depth component, then the ##VkImageSubresourceRange{@code ::aspectMask} member of each element of the {@code pRanges} array <b>must</b> not include the #IMAGE_ASPECT_DEPTH_BIT bit</li>
            <li>The ##VkImageSubresourceRange{@code ::baseMipLevel} members of the elements of the {@code pRanges} array <b>must</b> each be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>For each ##VkImageSubresourceRange element of {@code pRanges}, if the {@code levelCount} member is not #REMAINING_MIP_LEVELS, then <code>baseMipLevel + levelCount</code> <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>The ##VkImageSubresourceRange{@code ::baseArrayLayer} members of the elements of the {@code pRanges} array <b>must</b> each be less than the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>For each ##VkImageSubresourceRange element of {@code pRanges}, if the {@code layerCount} member is not #REMAINING_ARRAY_LAYERS, then <code>baseArrayLayer + layerCount</code> <b>must</b> be less than the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>{@code image} <b>must</b> have a depth/stencil format</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code image} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code image} <b>must</b> not be an unprotected image</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pDepthStencil} <b>must</b> be a valid pointer to a valid ##VkClearDepthStencilValue structure</li>
            <li>{@code pRanges} <b>must</b> be a valid pointer to an array of {@code rangeCount} valid ##VkImageSubresourceRange structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code rangeCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and {@code image} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkClearDepthStencilValue, ##VkImageSubresourceRange
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkImage("image", "the image to be cleared."),
        VkImageLayout("imageLayout", "specifies the current layout of the image subresource ranges to be cleared, and <b>must</b> be #IMAGE_LAYOUT_GENERAL or #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL."),
        VkClearDepthStencilValue.const.p("pDepthStencil", "a pointer to a ##VkClearDepthStencilValue structure containing the values that the depth and stencil image subresource ranges will be cleared to (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#clears-values\">Clear Values</a> below)."),
        AutoSize("pRanges")..uint32_t("rangeCount", "the number of image subresource range structures in {@code pRanges}."),
        VkImageSubresourceRange.const.p("pRanges", "a pointer to an array of ##VkImageSubresourceRange structures describing a range of mipmap levels, array layers, and aspects to be cleared, as described in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#resources-image-views\">Image Views</a>.")
    )

    void(
        "CmdClearAttachments",
        """
        Clear regions within bound framebuffer attachments.

        <h5>C Specification</h5>
        To clear one or more regions of color and depth/stencil attachments inside a render pass instance, call:

        <pre><code>
￿void vkCmdClearAttachments(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    attachmentCount,
￿    const VkClearAttachment*                    pAttachments,
￿    uint32_t                                    rectCount,
￿    const VkClearRect*                          pRects);</code></pre>

        <h5>Description</h5>
        {@code vkCmdClearAttachments} <b>can</b> clear multiple regions of each attachment used in the current subpass of a render pass instance. This command <b>must</b> be called only inside a render pass instance, and implicitly selects the images to clear based on the current framebuffer attachments and the command parameters.

        If the render pass has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-fragmentdensitymapattachment">fragment density map attachment</a>, clears follow the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fragmentdensitymapops">operations of fragment density maps</a> as if each clear region was a primitive which generates fragments. The clear color is applied to all pixels inside each fragment's area regardless if the pixels lie outside of the clear region. Clears <b>may</b> have a different set of supported fragment areas than draws.

        Unlike other <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#clears">clear commands</a>, #CmdClearAttachments() executes as a drawing command, rather than a transfer command, with writes performed by it executing in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#primrast-order">rasterization order</a>. Clears to color attachments are executed as color attachment writes, by the #PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT stage. Clears to depth/stencil attachments are executed as <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fragops-depth">depth writes</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fragops-stencil">writes</a> by the #PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT and #PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT stages.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@code aspectMask} member of any element of {@code pAttachments} contains #IMAGE_ASPECT_COLOR_BIT, then the {@code colorAttachment} member of that element <b>must</b> either refer to a color attachment which is #ATTACHMENT_UNUSED, or <b>must</b> be a valid color attachment.</li>
            <li>If the {@code aspectMask} member of any element of {@code pAttachments} contains #IMAGE_ASPECT_DEPTH_BIT, then the current subpass' depth/stencil attachment <b>must</b> either be #ATTACHMENT_UNUSED, or <b>must</b> have a depth component</li>
            <li>If the {@code aspectMask} member of any element of {@code pAttachments} contains #IMAGE_ASPECT_STENCIL_BIT, then the current subpass' depth/stencil attachment <b>must</b> either be #ATTACHMENT_UNUSED, or <b>must</b> have a stencil component</li>
            <li>The {@code rect} member of each element of {@code pRects} <b>must</b> have an {@code extent.width} greater than 0</li>
            <li>The {@code rect} member of each element of {@code pRects} <b>must</b> have an {@code extent.height} greater than 0</li>
            <li>The rectangular region specified by each element of {@code pRects} <b>must</b> be contained within the render area of the current render pass instance</li>
            <li>The layers specified by each element of {@code pRects} <b>must</b> be contained within every attachment that {@code pAttachments} refers to</li>
            <li>The {@code layerCount} member of each element of {@code pRects} <b>must</b> not be 0</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then each attachment to be cleared <b>must</b> not be a protected image.</li>
            <li>If {@code commandBuffer} is a protected command buffer, then each attachment to be cleared <b>must</b> not be an unprotected image.</li>
            <li>If the render pass instance this is recorded in uses multiview, then {@code baseArrayLayer} <b>must</b> be zero and {@code layerCount} <b>must</b> be one.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pAttachments} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid ##VkClearAttachment structures</li>
            <li>{@code pRects} <b>must</b> be a valid pointer to an array of {@code rectCount} ##VkClearRect structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
            <li>{@code rectCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkClearAttachment, ##VkClearRect
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pAttachments")..uint32_t("attachmentCount", "the number of entries in the {@code pAttachments} array."),
        VkClearAttachment.const.p("pAttachments", "a pointer to an array of ##VkClearAttachment structures defining the attachments to clear and the clear values to use. If any attachment to be cleared in the current subpass is #ATTACHMENT_UNUSED, then the clear has no effect on that attachment."),
        AutoSize("pRects")..uint32_t("rectCount", "the number of entries in the {@code pRects} array."),
        VkClearRect.const.p("pRects", "a pointer to an array of ##VkClearRect structures defining regions within each selected attachment to clear.")
    )

    void(
        "CmdResolveImage",
        """
        Resolve regions of an image.

        <h5>C Specification</h5>
        To resolve a multisample image to a non-multisample image, call:

        <pre><code>
￿void vkCmdResolveImage(
￿    VkCommandBuffer                             commandBuffer,
￿    VkImage                                     srcImage,
￿    VkImageLayout                               srcImageLayout,
￿    VkImage                                     dstImage,
￿    VkImageLayout                               dstImageLayout,
￿    uint32_t                                    regionCount,
￿    const VkImageResolve*                       pRegions);</code></pre>

        <h5>Description</h5>
        During the resolve the samples corresponding to each pixel location in the source are converted to a single sample before being written to the destination. If the source formats are floating-point or normalized types, the sample values for each pixel are resolved in an implementation-dependent manner. If the source formats are integer types, a single sample's value is selected for each pixel.

        {@code srcOffset} and {@code dstOffset} select the initial {@code x}, {@code y}, and {@code z} offsets in texels of the sub-regions of the source and destination image data. {@code extent} is the size in texels of the source image to resolve in {@code width}, {@code height} and {@code depth}.

        Resolves are done layer by layer starting with {@code baseArrayLayer} member of {@code srcSubresource} for the source and {@code dstSubresource} for the destination. {@code layerCount} layers are resolved to the destination image.

        <h5>Valid Usage</h5>
        <ul>
            <li>The source region specified by each element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
            <li>The destination region specified by each element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
            <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
            <li>If {@code srcImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code srcImage} <b>must</b> have a sample count equal to any valid sample count value other than #SAMPLE_COUNT_1_BIT</li>
            <li>If {@code dstImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstImage} <b>must</b> have a sample count equal to #SAMPLE_COUNT_1_BIT</li>
            <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code srcImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code dstImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code dstImage} <b>must</b> contain #FORMAT_FEATURE_COLOR_ATTACHMENT_BIT.</li>
            <li>{@code srcImage} and {@code dstImage} <b>must</b> have been created with the same image format</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer, then {@code dstImage} <b>must</b> not be an unprotected image</li>
            <li>The {@code srcSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The {@code dstSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>The <code>srcSubresource.baseArrayLayer srcSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The <code>dstSubresource.baseArrayLayer dstSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>{@code dstImage} and {@code srcImage} <b>must</b> not have been created with {@code flags} containing #IMAGE_CREATE_SUBSAMPLED_BIT_EXT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid ##VkImageResolve structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkImageResolve
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkImage("srcImage", "the source image."),
        VkImageLayout("srcImageLayout", "the layout of the source image subresources for the resolve."),
        VkImage("dstImage", "the destination image."),
        VkImageLayout("dstImageLayout", "the layout of the destination image subresources for the resolve."),
        AutoSize("pRegions")..uint32_t("regionCount", "the number of regions to resolve."),
        VkImageResolve.const.p("pRegions", "a pointer to an array of ##VkImageResolve structures specifying the regions to resolve.")
    )

    void(
        "CmdSetEvent",
        """
        Set an event object to signaled state.

        <h5>C Specification</h5>
        To set the state of an event to signaled from a device, call:

        <pre><code>
￿void vkCmdSetEvent(
￿    VkCommandBuffer                             commandBuffer,
￿    VkEvent                                     event,
￿    VkPipelineStageFlags                        stageMask);</code></pre>

        <h5>Description</h5>
        When #CmdSetEvent() is submitted to a queue, it defines an execution dependency on commands that were submitted before it, and defines an event signal operation which sets the event to the signaled state.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes all commands that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>. The synchronization scope is limited to operations on the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-masks">source stage mask</a> specified by {@code stageMask}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes only the event signal operation.

        If {@code event} is already in the signaled state when #CmdSetEvent() is executed on the device, then #CmdSetEvent() has no effect, no event signal operation occurs, and no execution dependency is generated.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code stageMask} <b>must</b> not include #PIPELINE_STAGE_HOST_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>{@code commandBuffer}&#8217;s current device mask <b>must</b> include exactly one physical device.</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_TASK_SHADER_BIT_NV</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>{@code stageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code stageMask} <b>must</b> not be 0</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Both of {@code commandBuffer}, and {@code event} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics Compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkEvent("event", "the event that will be signaled."),
        VkPipelineStageFlags("stageMask", "specifies the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-pipeline-stages\">source stage mask</a> used to determine when the {@code event} is signaled.")
    )

    void(
        "CmdResetEvent",
        """
        Reset an event object to non-signaled state.

        <h5>C Specification</h5>
        To set the state of an event to unsignaled from a device, call:

        <pre><code>
￿void vkCmdResetEvent(
￿    VkCommandBuffer                             commandBuffer,
￿    VkEvent                                     event,
￿    VkPipelineStageFlags                        stageMask);</code></pre>

        <h5>Description</h5>
        When #CmdResetEvent() is submitted to a queue, it defines an execution dependency on commands that were submitted before it, and defines an event unsignal operation which resets the event to the unsignaled state.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes all commands that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>. The synchronization scope is limited to operations on the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-masks">source stage mask</a> specified by {@code stageMask}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes only the event unsignal operation.

        If {@code event} is already in the unsignaled state when #CmdResetEvent() is executed on the device, then #CmdResetEvent() has no effect, no event unsignal operation occurs, and no execution dependency is generated.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code stageMask} <b>must</b> not include #PIPELINE_STAGE_HOST_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>When this command executes, {@code event} <b>must</b> not be waited on by a {@code vkCmdWaitEvents} command that is currently executing</li>
            <li>{@code commandBuffer}&#8217;s current device mask <b>must</b> include exactly one physical device.</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_TASK_SHADER_BIT_NV</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>{@code stageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code stageMask} <b>must</b> not be 0</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Both of {@code commandBuffer}, and {@code event} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics Compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkEvent("event", "the event that will be unsignaled."),
        VkPipelineStageFlags("stageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-pipeline-stages\">source stage mask</a> used to determine when the {@code event} is unsignaled.")
    )

    void(
        "CmdWaitEvents",
        """
        Wait for one or more events and insert a set of memory.

        <h5>C Specification</h5>
        To wait for one or more events to enter the signaled state on a device, call:

        <pre><code>
￿void vkCmdWaitEvents(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    eventCount,
￿    const VkEvent*                              pEvents,
￿    VkPipelineStageFlags                        srcStageMask,
￿    VkPipelineStageFlags                        dstStageMask,
￿    uint32_t                                    memoryBarrierCount,
￿    const VkMemoryBarrier*                      pMemoryBarriers,
￿    uint32_t                                    bufferMemoryBarrierCount,
￿    const VkBufferMemoryBarrier*                pBufferMemoryBarriers,
￿    uint32_t                                    imageMemoryBarrierCount,
￿    const VkImageMemoryBarrier*                 pImageMemoryBarriers);</code></pre>

        <h5>Description</h5>
        When {@code vkCmdWaitEvents} is submitted to a queue, it defines a memory dependency between prior event signal operations on the same queue or the host, and subsequent commands. {@code vkCmdWaitEvents} <b>must</b> not be used to wait on event signal operations occurring on other queues.

        The first synchronization scope only includes event signal operations that operate on members of {@code pEvents}, and the operations that happened-before the event signal operations. Event signal operations performed by #CmdSetEvent() that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a> are included in the first synchronization scope, if the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-order">logically latest</a> pipeline stage in their {@code stageMask} parameter is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-order">logically earlier</a> than or equal to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-order">logically latest</a> pipeline stage in {@code srcStageMask}. Event signal operations performed by #SetEvent() are only included in the first synchronization scope if #PIPELINE_STAGE_HOST_BIT is included in {@code srcStageMask}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes all commands that occur later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>. The second synchronization scope is limited to operations on the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-masks">destination stage mask</a> specified by {@code dstStageMask}.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access in the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-masks">source stage mask</a> specified by {@code srcStageMask}. Within that, the first access scope only includes the first access scopes defined by elements of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} and {@code pImageMemoryBarriers} arrays, which each define a set of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-memory-barriers">memory barriers</a>. If no memory barriers are specified, then the first access scope includes no accesses.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access in the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-masks">destination stage mask</a> specified by {@code dstStageMask}. Within that, the second access scope only includes the second access scopes defined by elements of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} and {@code pImageMemoryBarriers} arrays, which each define a set of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-memory-barriers">memory barriers</a>. If no memory barriers are specified, then the second access scope includes no accesses.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        #CmdWaitEvents() is used with #CmdSetEvent() to define a memory dependency between two sets of action commands, roughly in the same way as pipeline barriers, but split into two commands such that work between the two <b>may</b> execute unhindered.

        Unlike #CmdPipelineBarrier(), a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> <b>cannot</b> be performed using #CmdWaitEvents().
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>should</b> be careful to avoid race conditions when using events. There is no direct ordering guarantee between a #CmdResetEvent() command and a #CmdWaitEvents() command submitted after it, so some other execution dependency <b>must</b> be included between these commands (e.g. a semaphore).
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code srcStageMask} <b>must</b> be the bitwise OR of the {@code stageMask} parameter used in previous calls to {@code vkCmdSetEvent} with any of the members of {@code pEvents} and #PIPELINE_STAGE_HOST_BIT if any of the members of {@code pEvents} was set using {@code vkSetEvent}</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>If {@code pEvents} includes one or more events that will be signaled by {@code vkSetEvent} after {@code commandBuffer} has been submitted to a queue, then {@code vkCmdWaitEvents} <b>must</b> not be called inside a render pass instance</li>
            <li>Any pipeline stage included in {@code srcStageMask} or {@code dstStageMask} <b>must</b> be supported by the capabilities of the queue family specified by the {@code queueFamilyIndex} member of the ##VkCommandPoolCreateInfo structure that was used to create the {@code VkCommandPool} that {@code commandBuffer} was allocated from, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-supported">table of supported pipeline stages</a>.</li>
            <li>Each element of {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} or {@code pImageMemoryBarriers} <b>must</b> not have any access flag included in its {@code srcAccessMask} member if that bit is not supported by any of the pipeline stages in {@code srcStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a>.</li>
            <li>Each element of {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} or {@code pImageMemoryBarriers} <b>must</b> not have any access flag included in its {@code dstAccessMask} member if that bit is not supported by any of the pipeline stages in {@code dstStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a>.</li>
            <li>The {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} members of any element of {@code pBufferMemoryBarriers} or {@code pImageMemoryBarriers} <b>must</b> be equal.</li>
            <li>{@code commandBuffer}&#8217;s current device mask <b>must</b> include exactly one physical device.</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_TASK_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_TASK_SHADER_BIT_NV</li>
            <li>The {@code srcAccessMask} member of each element of {@code pMemoryBarriers} <b>must</b> only include access flags that are supported by one or more of the pipeline stages in {@code srcStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
            <li>The {@code dstAccessMask} member of each element of {@code pMemoryBarriers} <b>must</b> only include access flags that are supported by one or more of the pipeline stages in {@code dstStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
            <li>The {@code srcAccessMask} member of each element of {@code pBufferMemoryBarriers} <b>must</b> only include access flags that are supported by one or more of the pipeline stages in {@code srcStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
            <li>The {@code dstAccessMask} member of each element of {@code pBufferMemoryBarriers} <b>must</b> only include access flags that are supported by one or more of the pipeline stages in {@code dstStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
            <li>The {@code srcAccessMask} member of each element of {@code pImageMemoryBarriers} <b>must</b> only include access flags that are supported by one or more of the pipeline stages in {@code srcStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
            <li>The {@code dstAccessMask} member of any element of {@code pImageMemoryBarriers} <b>must</b> only include access flags that are supported by one or more of the pipeline stages in {@code dstStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pEvents} <b>must</b> be a valid pointer to an array of {@code eventCount} valid {@code VkEvent} handles</li>
            <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code srcStageMask} <b>must</b> not be 0</li>
            <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code dstStageMask} <b>must</b> not be 0</li>
            <li>If {@code memoryBarrierCount} is not 0, {@code pMemoryBarriers} <b>must</b> be a valid pointer to an array of {@code memoryBarrierCount} valid ##VkMemoryBarrier structures</li>
            <li>If {@code bufferMemoryBarrierCount} is not 0, {@code pBufferMemoryBarriers} <b>must</b> be a valid pointer to an array of {@code bufferMemoryBarrierCount} valid ##VkBufferMemoryBarrier structures</li>
            <li>If {@code imageMemoryBarrierCount} is not 0, {@code pImageMemoryBarriers} <b>must</b> be a valid pointer to an array of {@code imageMemoryBarrierCount} valid ##VkImageMemoryBarrier structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>{@code eventCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and the elements of {@code pEvents} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkBufferMemoryBarrier, ##VkImageMemoryBarrier, ##VkMemoryBarrier
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        AutoSize("pEvents")..uint32_t("eventCount", "the length of the {@code pEvents} array."),
        VkEvent.const.p("pEvents", "a pointer to an array of event object handles to wait on."),
        VkPipelineStageFlags("srcStageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-pipeline-stages\">source stage mask</a>."),
        VkPipelineStageFlags("dstStageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-pipeline-stages\">destination stage mask</a>."),
        AutoSize("pMemoryBarriers")..uint32_t("memoryBarrierCount", "the length of the {@code pMemoryBarriers} array."),
        nullable..VkMemoryBarrier.const.p("pMemoryBarriers", "a pointer to an array of ##VkMemoryBarrier structures."),
        AutoSize("pBufferMemoryBarriers")..uint32_t("bufferMemoryBarrierCount", "the length of the {@code pBufferMemoryBarriers} array."),
        nullable..VkBufferMemoryBarrier.const.p("pBufferMemoryBarriers", "a pointer to an array of ##VkBufferMemoryBarrier structures."),
        AutoSize("pImageMemoryBarriers")..uint32_t("imageMemoryBarrierCount", "the length of the {@code pImageMemoryBarriers} array."),
        nullable..VkImageMemoryBarrier.const.p("pImageMemoryBarriers", "a pointer to an array of ##VkImageMemoryBarrier structures.")
    )

    void(
        "CmdPipelineBarrier",
        """
        Insert a memory dependency.

        <h5>C Specification</h5>
        To record a pipeline barrier, call:

        <pre><code>
￿void vkCmdPipelineBarrier(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineStageFlags                        srcStageMask,
￿    VkPipelineStageFlags                        dstStageMask,
￿    VkDependencyFlags                           dependencyFlags,
￿    uint32_t                                    memoryBarrierCount,
￿    const VkMemoryBarrier*                      pMemoryBarriers,
￿    uint32_t                                    bufferMemoryBarrierCount,
￿    const VkBufferMemoryBarrier*                pBufferMemoryBarriers,
￿    uint32_t                                    imageMemoryBarrierCount,
￿    const VkImageMemoryBarrier*                 pImageMemoryBarriers);</code></pre>

        <h5>Description</h5>
        When #CmdPipelineBarrier() is submitted to a queue, it defines a memory dependency between commands that were submitted before it, and those submitted after it.

        If #CmdPipelineBarrier() was recorded outside a render pass instance, the first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes all commands that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>. If #CmdPipelineBarrier() was recorded inside a render pass instance, the first synchronization scope includes only commands that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a> within the same subpass. In either case, the first synchronization scope is limited to operations on the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-masks">source stage mask</a> specified by {@code srcStageMask}.

        If #CmdPipelineBarrier() was recorded outside a render pass instance, the second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes all commands that occur later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>. If #CmdPipelineBarrier() was recorded inside a render pass instance, the second synchronization scope includes only commands that occur later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a> within the same subpass. In either case, the second synchronization scope is limited to operations on the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-masks">destination stage mask</a> specified by {@code dstStageMask}.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access in the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-masks">source stage mask</a> specified by {@code srcStageMask}. Within that, the first access scope only includes the first access scopes defined by elements of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} and {@code pImageMemoryBarriers} arrays, which each define a set of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-memory-barriers">memory barriers</a>. If no memory barriers are specified, then the first access scope includes no accesses.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access in the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-masks">destination stage mask</a> specified by {@code dstStageMask}. Within that, the second access scope only includes the second access scopes defined by elements of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} and {@code pImageMemoryBarriers} arrays, which each define a set of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-memory-barriers">memory barriers</a>. If no memory barriers are specified, then the second access scope includes no accesses.

        If {@code dependencyFlags} includes #DEPENDENCY_BY_REGION_BIT, then any dependency between <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-framebuffer-regions">framebuffer-space</a> pipeline stages is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-framebuffer-regions">framebuffer-local</a> - otherwise it is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-framebuffer-regions">framebuffer-global</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>If {@code vkCmdPipelineBarrier} is called within a render pass instance, the render pass <b>must</b> have been created with at least one ##VkSubpassDependency instance in ##VkRenderPassCreateInfo{@code ::pDependencies} that expresses a dependency from the current subpass to itself, and for which {@code srcStageMask} contains a subset of the bit values in ##VkSubpassDependency{@code ::srcStageMask}, {@code dstStageMask} contains a subset of the bit values in ##VkSubpassDependency{@code ::dstStageMask}, {@code dependencyFlags} is equal to ##VkSubpassDependency{@code ::dependencyFlags}, {@code srcAccessMask} member of each element of {@code pMemoryBarriers} and {@code pImageMemoryBarriers} contains a subset of the bit values in ##VkSubpassDependency{@code ::srcAccessMask}, and {@code dstAccessMask} member of each element of {@code pMemoryBarriers} and {@code pImageMemoryBarriers} contains a subset of the bit values in ##VkSubpassDependency{@code ::dstAccessMask}</li>
            <li>If {@code vkCmdPipelineBarrier} is called within a render pass instance, {@code bufferMemoryBarrierCount} <b>must</b> be 0</li>
            <li>If {@code vkCmdPipelineBarrier} is called within a render pass instance, the {@code image} member of any element of {@code pImageMemoryBarriers} <b>must</b> be equal to one of the elements of {@code pAttachments} that the current {@code framebuffer} was created with, that is also referred to by one of the elements of the {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment} members of the ##VkSubpassDescription instance or by the {@code pDepthStencilResolveAttachment} member of the ##VkSubpassDescriptionDepthStencilResolve structure that the current subpass was created with</li>
            <li>If {@code vkCmdPipelineBarrier} is called within a render pass instance, the {@code oldLayout} and {@code newLayout} members of any element of {@code pImageMemoryBarriers} <b>must</b> be equal to the {@code layout} member of an element of the {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment} members of the ##VkSubpassDescription instance or by the {@code pDepthStencilResolveAttachment} member of the ##VkSubpassDescriptionDepthStencilResolve structure that the current subpass was created with, that refers to the same {@code image}</li>
            <li>If {@code vkCmdPipelineBarrier} is called within a render pass instance, the {@code oldLayout} and {@code newLayout} members of an element of {@code pImageMemoryBarriers} <b>must</b> be equal</li>
            <li>If {@code vkCmdPipelineBarrier} is called within a render pass instance, the {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} members of any element of {@code pImageMemoryBarriers} <b>must</b> be #QUEUE_FAMILY_IGNORED</li>
            <li>Any pipeline stage included in {@code srcStageMask} or {@code dstStageMask} <b>must</b> be supported by the capabilities of the queue family specified by the {@code queueFamilyIndex} member of the ##VkCommandPoolCreateInfo structure that was used to create the {@code VkCommandPool} that {@code commandBuffer} was allocated from, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-supported">table of supported pipeline stages</a></li>
            <li>If {@code vkCmdPipelineBarrier} is called outside of a render pass instance, {@code dependencyFlags} <b>must</b> not include #DEPENDENCY_VIEW_LOCAL_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_TASK_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_TASK_SHADER_BIT_NV</li>
            <li>The {@code srcAccessMask} member of each element of {@code pMemoryBarriers} <b>must</b> only include access flags that are supported by one or more of the pipeline stages in {@code srcStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
            <li>The {@code dstAccessMask} member of each element of {@code pMemoryBarriers} <b>must</b> only include access flags that are supported by one or more of the pipeline stages in {@code dstStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
            <li>For any element of {@code pBufferMemoryBarriers}, if its {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} members are equal, or if its {@code srcQueueFamilyIndex} is the queue family index that was used to create the command pool that {@code commandBuffer} was allocated from, then its {@code srcAccessMask} member <b>must</b> only contain access flags that are supported by one or more of the pipeline stages in {@code srcStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
            <li>For any element of {@code pBufferMemoryBarriers}, if its {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} members are equal, or if its {@code dstQueueFamilyIndex} is the queue family index that was used to create the command pool that {@code commandBuffer} was allocated from, then its {@code dstAccessMask} member <b>must</b> only contain access flags that are supported by one or more of the pipeline stages in {@code dstStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
            <li>For any element of {@code pImageMemoryBarriers}, if its {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} members are equal, or if its {@code srcQueueFamilyIndex} is the queue family index that was used to create the command pool that {@code commandBuffer} was allocated from, then its {@code srcAccessMask} member <b>must</b> only contain access flags that are supported by one or more of the pipeline stages in {@code srcStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
            <li>For any element of {@code pImageMemoryBarriers}, if its {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} members are equal, or if its {@code dstQueueFamilyIndex} is the queue family index that was used to create the command pool that {@code commandBuffer} was allocated from, then its {@code dstAccessMask} member <b>must</b> only contain access flags that are supported by one or more of the pipeline stages in {@code dstStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code srcStageMask} <b>must</b> not be 0</li>
            <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code dstStageMask} <b>must</b> not be 0</li>
            <li>{@code dependencyFlags} <b>must</b> be a valid combination of {@code VkDependencyFlagBits} values</li>
            <li>If {@code memoryBarrierCount} is not 0, {@code pMemoryBarriers} <b>must</b> be a valid pointer to an array of {@code memoryBarrierCount} valid ##VkMemoryBarrier structures</li>
            <li>If {@code bufferMemoryBarrierCount} is not 0, {@code pBufferMemoryBarriers} <b>must</b> be a valid pointer to an array of {@code bufferMemoryBarrierCount} valid ##VkBufferMemoryBarrier structures</li>
            <li>If {@code imageMemoryBarrierCount} is not 0, {@code pImageMemoryBarriers} <b>must</b> be a valid pointer to an array of {@code imageMemoryBarrierCount} valid ##VkImageMemoryBarrier structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Transfer Graphics Compute</td><td></td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkBufferMemoryBarrier, ##VkImageMemoryBarrier, ##VkMemoryBarrier
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkPipelineStageFlags("srcStageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-pipeline-stages-masks\">source stage mask</a>."),
        VkPipelineStageFlags("dstStageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-pipeline-stages-masks\">destination stage mask</a>."),
        VkDependencyFlags("dependencyFlags", "a bitmask of {@code VkDependencyFlagBits} specifying how execution and memory dependencies are formed."),
        AutoSize("pMemoryBarriers")..uint32_t("memoryBarrierCount", "the length of the {@code pMemoryBarriers} array."),
        nullable..VkMemoryBarrier.const.p("pMemoryBarriers", "a pointer to an array of ##VkMemoryBarrier structures."),
        AutoSize("pBufferMemoryBarriers")..uint32_t("bufferMemoryBarrierCount", "the length of the {@code pBufferMemoryBarriers} array."),
        nullable..VkBufferMemoryBarrier.const.p("pBufferMemoryBarriers", "a pointer to an array of ##VkBufferMemoryBarrier structures."),
        AutoSize("pImageMemoryBarriers")..uint32_t("imageMemoryBarrierCount", "the length of the {@code pImageMemoryBarriers} array."),
        nullable..VkImageMemoryBarrier.const.p("pImageMemoryBarriers", "a pointer to an array of ##VkImageMemoryBarrier structures.")
    )

    void(
        "CmdBeginQuery",
        """
        Begin a query.

        <h5>C Specification</h5>
        To begin a query, call:

        <pre><code>
￿void vkCmdBeginQuery(
￿    VkCommandBuffer                             commandBuffer,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    query,
￿    VkQueryControlFlags                         flags);</code></pre>

        <h5>Description</h5>
        If the {@code queryType} of the pool is #QUERY_TYPE_OCCLUSION and {@code flags} contains #QUERY_CONTROL_PRECISE_BIT, an implementation <b>must</b> return a result that matches the actual number of samples passed. This is described in more detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-occlusion">Occlusion Queries</a>.

        Calling {@code vkCmdBeginQuery} is equivalent to calling #CmdBeginQueryIndexedEXT() with the {@code index} parameter set to zero.

        After beginning a query, that query is considered <em>active</em> within the command buffer it was called in until that same query is ended. Queries active in a primary command buffer when secondary command buffers are executed are considered active for those secondary command buffers.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} that differs from that of any queries that are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-operation-active">active</a> within {@code commandBuffer}</li>
            <li>All queries used by the command <b>must</b> be unavailable</li>
            <li>The {@code queryType} used to create {@code queryPool} <b>must</b> not be #QUERY_TYPE_TIMESTAMP</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-occlusionQueryPrecise">precise occlusion queries</a> feature is not enabled, or the {@code queryType} used to create {@code queryPool} was not #QUERY_TYPE_OCCLUSION, {@code flags} <b>must</b> not contain #QUERY_CONTROL_PRECISE_BIT</li>
            <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_OCCLUSION, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PIPELINE_STATISTICS and any of the {@code pipelineStatistics} indicate graphics operations, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PIPELINE_STATISTICS and any of the {@code pipelineStatistics} indicate compute operations, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
            <li>If called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass&#8217;s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT then ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::transformFeedbackQueries} <b>must</b> be supported</li>
            <li>If {@code queryPool} was created with a {@code queryType} of #QUERY_TYPE_PERFORMANCE_QUERY_KHR, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#profiling-lock">profiling lock</a> <b>must</b> have been held before #BeginCommandBuffer() was called on {@code commandBuffer}</li>
            <li>If {@code queryPool} was created with a {@code queryType} of #QUERY_TYPE_PERFORMANCE_QUERY_KHR and one of the counters used to create {@code queryPool} was #PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR, the query begin <b>must</b> be the first recorded command in {@code commandBuffer}</li>
            <li>If {@code queryPool} was created with a {@code queryType} of #QUERY_TYPE_PERFORMANCE_QUERY_KHR and one of the counters used to create {@code queryPool} was #PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR, the begin command <b>must</b> not be recorded within a render pass instance</li>
            <li>If {@code queryPool} was created with a {@code queryType} of #QUERY_TYPE_PERFORMANCE_QUERY_KHR and another query pool with a {@code queryType} #QUERY_TYPE_PERFORMANCE_QUERY_KHR has been used within {@code commandBuffer}, its parent primary command buffer or secondary command buffer recorded within the same parent primary command buffer as {@code commandBuffer}, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-features-performanceCounterMultipleQueryPools">{@code performanceCounterMultipleQueryPools}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryControlFlagBits} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which this command will be recorded."),
        VkQueryPool("queryPool", "the query pool that will manage the results of the query."),
        uint32_t("query", "the query index within the query pool that will contain the results."),
        VkQueryControlFlags("flags", "a bitmask of {@code VkQueryControlFlagBits} specifying constraints on the types of queries that <b>can</b> be performed.")
    )

    void(
        "CmdEndQuery",
        """
        Ends a query.

        <h5>C Specification</h5>
        To end a query after the set of desired draw or dispatch commands is executed, call:

        <pre><code>
￿void vkCmdEndQuery(
￿    VkCommandBuffer                             commandBuffer,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    query);</code></pre>

        <h5>Description</h5>
        Calling {@code vkCmdEndQuery} is equivalent to calling #CmdEndQueryIndexedEXT() with the {@code index} parameter set to zero.

        As queries operate asynchronously, ending a query does not immediately set the query's status to available. A query is considered <em>finished</em> when the final results of the query are ready to be retrieved by #GetQueryPoolResults() and #CmdCopyQueryPoolResults(), and this is when the query's status is set to available.

        Once a query is ended the query <b>must</b> finish in finite time, unless the state of the query is changed using other commands, e.g. by issuing a reset of the query.

        <h5>Valid Usage</h5>
        <ul>
            <li>All queries used by the command <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-operation-active">active</a></li>
            <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
            <li>If {@code vkCmdEndQuery} is called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass&#8217;s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
            <li>If {@code queryPool} was created with a {@code queryType} of #QUERY_TYPE_PERFORMANCE_QUERY_KHR and one or more of the counters used to create {@code queryPool} was #PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR, the #CmdEndQuery() <b>must</b> be the last recorded command in {@code commandBuffer}</li>
            <li>If {@code queryPool} was created with a {@code queryType} of #QUERY_TYPE_PERFORMANCE_QUERY_KHR and one or more of the counters used to create {@code queryPool} was #PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR, the #CmdEndQuery() <b>must</b> not be recorded within a render pass instance</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which this command will be recorded."),
        VkQueryPool("queryPool", "the query pool that is managing the results of the query."),
        uint32_t("query", "the query index within the query pool where the result is stored.")
    )

    void(
        "CmdResetQueryPool",
        """
        Reset queries in a query pool.

        <h5>C Specification</h5>
        To reset a range of queries in a query pool on a queue, call:

        <pre><code>
￿void vkCmdResetQueryPool(
￿    VkCommandBuffer                             commandBuffer,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    firstQuery,
￿    uint32_t                                    queryCount);</code></pre>

        <h5>Description</h5>
        When executed on a queue, this command sets the status of query indices <code>[firstQuery, firstQuery + queryCount - 1]</code> to unavailable.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
            <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics Compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which this command will be recorded."),
        VkQueryPool("queryPool", "the handle of the query pool managing the queries being reset."),
        uint32_t("firstQuery", "the initial query index to reset."),
        uint32_t("queryCount", "the number of queries to reset.")
    )

    void(
        "CmdWriteTimestamp",
        """
        Write a device timestamp into a query object.

        <h5>C Specification</h5>
        To request a timestamp, call:

        <pre><code>
￿void vkCmdWriteTimestamp(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineStageFlagBits                     pipelineStage,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    query);</code></pre>

        <h5>Description</h5>
        {@code vkCmdWriteTimestamp} latches the value of the timer when all previous commands have completed executing as far as the specified pipeline stage, and writes the timestamp value to memory. When the timestamp value is written, the availability status of the query is set to available.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        If an implementation is unable to detect completion and latch the timer at any specific stage of the pipeline, it <b>may</b> instead do so at any logically later stage.
        </div>

        #CmdCopyQueryPoolResults() <b>can</b> then be called to copy the timestamp value from the query pool into buffer memory, with ordering and synchronization behavior equivalent to how other queries operate. Timestamp values <b>can</b> also be retrieved from the query pool using #GetQueryPoolResults(). As with other queries, the query <b>must</b> be reset using #CmdResetQueryPool() or #ResetQueryPool() before requesting the timestamp value be written to it.

        While {@code vkCmdWriteTimestamp} <b>can</b> be called inside or outside of a render pass instance, #CmdCopyQueryPoolResults() <b>must</b> only be called outside of a render pass instance.

        Timestamps <b>may</b> only be meaningfully compared if they are written by commands submitted to the same queue.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        An example of such a comparison is determining the execution time of a sequence of commands.
        </div>

        If {@code vkCmdWriteTimestamp} is called while executing a render pass instance that has multiview enabled, the timestamp uses <code>N</code> consecutive query indices in the query pool (starting at {@code query}) where <code>N</code> is the number of bits set in the view mask of the subpass the command is executed in. The resulting query values are determined by an implementation-dependent choice of one of the following behaviors:

        <ul>
            <li>The first query is a timestamp value and (if more than one bit is set in the view mask) zero is written to the remaining queries. If two timestamps are written in the same subpass, the sum of the execution time of all views between those commands is the difference between the first query written by each command.</li>
            <li>All <code>N</code> queries are timestamp values. If two timestamps are written in the same subpass, the sum of the execution time of all views between those commands is the sum of the difference between corresponding queries written by each command. The difference between corresponding queries <b>may</b> be the execution time of a single view.</li>
        </ul>

        In either case, the application <b>can</b> sum the differences between all <code>N</code> queries to determine the total execution time.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} of #QUERY_TYPE_TIMESTAMP</li>
            <li>The query identified by {@code queryPool} and {@code query} <b>must</b> be <em>unavailable</em></li>
            <li>The command pool&#8217;s queue family <b>must</b> support a non-zero {@code timestampValidBits}</li>
            <li>All queries used by the command <b>must</b> be unavailable</li>
            <li>If {@code vkCmdWriteTimestamp} is called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass&#8217;s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pipelineStage} <b>must</b> be a valid {@code VkPipelineStageFlagBits} value</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Transfer Graphics Compute</td><td>Transfer</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkPipelineStageFlagBits("pipelineStage", "one of the {@code VkPipelineStageFlagBits}, specifying a stage of the pipeline."),
        VkQueryPool("queryPool", "the query pool that will manage the timestamp."),
        uint32_t("query", "the query within the query pool that will contain the timestamp.")
    )

    void(
        "CmdCopyQueryPoolResults",
        """
        Copy the results of queries in a query pool to a buffer object.

        <h5>C Specification</h5>
        To copy query statuses and numerical results directly to buffer memory, call:

        <pre><code>
￿void vkCmdCopyQueryPoolResults(
￿    VkCommandBuffer                             commandBuffer,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    firstQuery,
￿    uint32_t                                    queryCount,
￿    VkBuffer                                    dstBuffer,
￿    VkDeviceSize                                dstOffset,
￿    VkDeviceSize                                stride,
￿    VkQueryResultFlags                          flags);</code></pre>

        <h5>Description</h5>
        {@code vkCmdCopyQueryPoolResults} is guaranteed to see the effect of previous uses of {@code vkCmdResetQueryPool} in the same queue, without any additional synchronization. Thus, the results will always reflect the most recent use of the query.

        {@code flags} has the same possible values described above for the {@code flags} parameter of #GetQueryPoolResults(), but the different style of execution causes some subtle behavioral differences. Because {@code vkCmdCopyQueryPoolResults} executes in order with respect to other query commands, there is less ambiguity about which use of a query is being requested.

        Results for all requested occlusion queries, pipeline statistics queries, transform feedback queries, and timestamp queries are written as 64-bit unsigned integer values if #QUERY_RESULT_64_BIT is set or 32-bit unsigned integer values otherwise. Performance queries store results in a tightly packed array whose type is determined by the {@code unit} member of the corresponding ##VkPerformanceCounterKHR.

        If neither of #QUERY_RESULT_WAIT_BIT and #QUERY_RESULT_WITH_AVAILABILITY_BIT are set, results are only written out for queries in the available state.

        If #QUERY_RESULT_WAIT_BIT is set, the implementation will wait for each query's status to be in the available state before retrieving the numerical results for that query. This is guaranteed to reflect the most recent use of the query on the same queue, assuming that the query is not being simultaneously used by other queues. If the query does not become available in a finite amount of time (e.g. due to not issuing a query since the last reset), a #ERROR_DEVICE_LOST error <b>may</b> occur.

        Similarly, if #QUERY_RESULT_WITH_AVAILABILITY_BIT is set and #QUERY_RESULT_WAIT_BIT is not set, the availability is guaranteed to reflect the most recent use of the query on the same queue, assuming that the query is not being simultaneously used by other queues. As with {@code vkGetQueryPoolResults}, implementations <b>must</b> guarantee that if they return a non-zero availability value, then the numerical results are valid.

        If #QUERY_RESULT_PARTIAL_BIT is set, #QUERY_RESULT_WAIT_BIT is not set, and the query's status is unavailable, an intermediate result value between zero and the final result value is written for that query.

        #QUERY_RESULT_PARTIAL_BIT <b>must</b> not be used if the pool's {@code queryType} is #QUERY_TYPE_TIMESTAMP.

        {@code vkCmdCopyQueryPoolResults} is considered to be a transfer operation, and its writes to buffer memory <b>must</b> be synchronized using #PIPELINE_STAGE_TRANSFER_BIT and #ACCESS_TRANSFER_WRITE_BIT before using the results.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
            <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
            <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
            <li>If #QUERY_RESULT_64_BIT is not set in {@code flags} then {@code dstOffset} and {@code stride} <b>must</b> be multiples of 4</li>
            <li>If #QUERY_RESULT_64_BIT is set in {@code flags} then {@code dstOffset} and {@code stride} <b>must</b> be multiples of 8</li>
            <li>{@code dstBuffer} <b>must</b> have enough storage, from {@code dstOffset}, to contain the result of each query, as described <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-operation-memorylayout">here</a></li>
            <li>{@code dstBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_TIMESTAMP, {@code flags} <b>must</b> not contain #QUERY_RESULT_PARTIAL_BIT</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PERFORMANCE_QUERY_KHR, ##VkPhysicalDevicePerformanceQueryPropertiesKHR{@code ::allowCommandBufferQueryCopies} <b>must</b> be #TRUE</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PERFORMANCE_QUERY_KHR, {@code flags} <b>must</b> not contain #QUERY_RESULT_WITH_AVAILABILITY_BIT, #QUERY_RESULT_PARTIAL_BIT or #QUERY_RESULT_64_BIT</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PERFORMANCE_QUERY_KHR, the {@code queryPool} <b>must</b> have been submitted once for each pass as retrieved via a call to #GetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR()</li>
            <li>#CmdCopyQueryPoolResults() <b>must</b> not be called if the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PERFORMANCE_QUERY_INTEL</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryResultFlagBits} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Each of {@code commandBuffer}, {@code dstBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics Compute</td><td>Transfer</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which this command will be recorded."),
        VkQueryPool("queryPool", "the query pool managing the queries containing the desired results."),
        uint32_t("firstQuery", "the initial query index."),
        uint32_t("queryCount", "the number of queries. {@code firstQuery} and {@code queryCount} together define a range of queries."),
        VkBuffer("dstBuffer", "a {@code VkBuffer} object that will receive the results of the copy command."),
        VkDeviceSize("dstOffset", "an offset into {@code dstBuffer}."),
        VkDeviceSize("stride", "the stride in bytes between results for individual queries within {@code dstBuffer}. The required size of the backing memory for {@code dstBuffer} is determined as described above for #GetQueryPoolResults()."),
        VkQueryResultFlags("flags", "a bitmask of {@code VkQueryResultFlagBits} specifying how and when results are returned.")
    )

    void(
        "CmdPushConstants",
        """
        Update the values of push constants.

        <h5>C Specification</h5>
        To update push constants, call:

        <pre><code>
￿void vkCmdPushConstants(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineLayout                            layout,
￿    VkShaderStageFlags                          stageFlags,
￿    uint32_t                                    offset,
￿    uint32_t                                    size,
￿    const void*                                 pValues);</code></pre>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        As {@code stageFlags} needs to include all flags the relevant push constant ranges were created with, any flags that are not supported by the queue family that the {@code VkCommandPool} used to allocate {@code commandBuffer} was created on are ignored.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>For each byte in the range specified by {@code offset} and {@code size} and for each shader stage in {@code stageFlags}, there <b>must</b> be a push constant range in {@code layout} that includes that byte and that stage</li>
            <li>For each byte in the range specified by {@code offset} and {@code size} and for each push constant range that overlaps that byte, {@code stageFlags} <b>must</b> include all stages in that push constant range&#8217;s ##VkPushConstantRange{@code ::stageFlags}</li>
            <li>{@code offset} <b>must</b> be a multiple of 4</li>
            <li>{@code size} <b>must</b> be a multiple of 4</li>
            <li>{@code offset} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxPushConstantsSize}</li>
            <li>{@code size} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxPushConstantsSize} minus {@code offset}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
            <li>{@code stageFlags} <b>must</b> not be 0</li>
            <li>{@code pValues} <b>must</b> be a valid pointer to an array of {@code size} bytes</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>{@code size} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which the push constant update will be recorded."),
        VkPipelineLayout("layout", "the pipeline layout used to program the push constant updates."),
        VkShaderStageFlags("stageFlags", "a bitmask of {@code VkShaderStageFlagBits} specifying the shader stages that will use the push constants in the updated range."),
        uint32_t("offset", "the start offset of the push constant range to update, in units of bytes."),
        AutoSize("pValues")..uint32_t("size", "the size of the push constant range to update, in units of bytes."),
        void.const.p("pValues", "a pointer to an array of {@code size} bytes containing the new push constant values.")
    )

    void(
        "CmdBeginRenderPass",
        """
        Begin a new render pass.

        <h5>C Specification</h5>
        To begin a render pass instance, call:

        <pre><code>
￿void vkCmdBeginRenderPass(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkRenderPassBeginInfo*                pRenderPassBegin,
￿    VkSubpassContents                           contents);</code></pre>

        <h5>Description</h5>
        After beginning a render pass instance, the command buffer is ready to record the commands for the first subpass of that render pass.

        <h5>Valid Usage</h5>
        <ul>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_COLOR_ATTACHMENT_BIT</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL, #IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL, #IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL, or #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_SAMPLED_BIT or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_TRANSFER_SRC_BIT</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_TRANSFER_DST_BIT</li>
            <li>If any of the {@code initialLayout} members of the ##VkAttachmentDescription structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is not #IMAGE_LAYOUT_UNDEFINED, then each such {@code initialLayout} <b>must</b> be equal to the current layout of the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin}</li>
            <li>The {@code srcStageMask} and {@code dstStageMask} members of any element of the {@code pDependencies} member of ##VkRenderPassCreateInfo used to create {@code renderPass} <b>must</b> be supported by the capabilities of the queue family identified by the {@code queueFamilyIndex} member of the ##VkCommandPoolCreateInfo used to create the command pool which {@code commandBuffer} was allocated from</li>
            <li>For any attachment in {@code framebuffer} that is used by {@code renderPass} and is bound to memory locations that are also bound to another attachment used by {@code renderPass}, and if at least one of those uses causes either attachment to be written to, both attachments <b>must</b> have had the #ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pRenderPassBegin} <b>must</b> be a valid pointer to a valid ##VkRenderPassBeginInfo structure</li>
            <li>{@code contents} <b>must</b> be a valid {@code VkSubpassContents} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkRenderPassBeginInfo
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command."),
        VkRenderPassBeginInfo.const.p("pRenderPassBegin", "a pointer to a ##VkRenderPassBeginInfo structure specifying the render pass to begin an instance of, and the framebuffer the instance uses."),
        VkSubpassContents("contents", "a {@code VkSubpassContents} value specifying how the commands in the first subpass will be provided.")
    )

    void(
        "CmdNextSubpass",
        """
        Transition to the next subpass of a render pass.

        <h5>C Specification</h5>
        To transition to the next subpass in the render pass instance after recording the commands for a subpass, call:

        <pre><code>
￿void vkCmdNextSubpass(
￿    VkCommandBuffer                             commandBuffer,
￿    VkSubpassContents                           contents);</code></pre>

        <h5>Description</h5>
        The subpass index for a render pass begins at zero when {@code vkCmdBeginRenderPass} is recorded, and increments each time {@code vkCmdNextSubpass} is recorded.

        Moving to the next subpass automatically performs any multisample resolve operations in the subpass being ended. End-of-subpass multisample resolves are treated as color attachment writes for the purposes of synchronization. This applies to resolve operations for both color and depth/stencil attachments. That is, they are considered to execute in the #PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT pipeline stage and their writes are synchronized with #ACCESS_COLOR_ATTACHMENT_WRITE_BIT. Synchronization between rendering within a subpass and any resolve operations at the end of the subpass occurs automatically, without need for explicit dependencies or pipeline barriers. However, if the resolve attachment is also used in a different subpass, an explicit dependency is needed.

        After transitioning to the next subpass, the application <b>can</b> record the commands for that subpass.

        <h5>Valid Usage</h5>
        <ul>
            <li>The current subpass index <b>must</b> be less than the number of subpasses in the render pass minus one</li>
            <li>This command <b>must</b> not be recorded when transform feedback is active</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code contents} <b>must</b> be a valid {@code VkSubpassContents} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command."),
        VkSubpassContents("contents", "specifies how the commands in the next subpass will be provided, in the same fashion as the corresponding parameter of #CmdBeginRenderPass().")
    )

    void(
        "CmdEndRenderPass",
        """
        End the current render pass.

        <h5>C Specification</h5>
        To record a command to end a render pass instance after recording the commands for the last subpass, call:

        <pre><code>
￿void vkCmdEndRenderPass(
￿    VkCommandBuffer                             commandBuffer);</code></pre>

        <h5>Description</h5>
        Ending a render pass instance performs any multisample resolve operations on the final subpass.

        <h5>Valid Usage</h5>
        <ul>
            <li>The current subpass index <b>must</b> be equal to the number of subpasses in the render pass minus one</li>
            <li>This command <b>must</b> not be recorded when transform feedback is active</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which to end the current render pass instance.")
    )

    void(
        "CmdExecuteCommands",
        """
        Execute a secondary command buffer from a primary command buffer.

        <h5>C Specification</h5>
        A secondary command buffer <b>must</b> not be directly submitted to a queue. Instead, secondary command buffers are recorded to execute as part of a primary command buffer with the command:

        <pre><code>
￿void vkCmdExecuteCommands(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    commandBufferCount,
￿    const VkCommandBuffer*                      pCommandBuffers);</code></pre>

        <h5>Description</h5>
        If any element of {@code pCommandBuffers} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT flag, and it was recorded into any other primary command buffer which is currently in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">executable or recording state</a>, that primary command buffer becomes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">invalid</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>Each element of {@code pCommandBuffers} <b>must</b> have been allocated with a {@code level} of #COMMAND_BUFFER_LEVEL_SECONDARY</li>
            <li>Each element of {@code pCommandBuffers} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending or executable state</a></li>
            <li>If any element of {@code pCommandBuffers} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT flag, it <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a></li>
            <li>If any element of {@code pCommandBuffers} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT flag, it <b>must</b> not have already been recorded to {@code commandBuffer}</li>
            <li>If any element of {@code pCommandBuffers} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT flag, it <b>must</b> not appear more than once in {@code pCommandBuffers}</li>
            <li>Each element of {@code pCommandBuffers} <b>must</b> have been allocated from a {@code VkCommandPool} that was created for the same queue family as the {@code VkCommandPool} from which {@code commandBuffer} was allocated</li>
            <li>If {@code vkCmdExecuteCommands} is being called within a render pass instance, that render pass instance <b>must</b> have been begun with the {@code contents} parameter of {@code vkCmdBeginRenderPass} set to #SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS</li>
            <li>If {@code vkCmdExecuteCommands} is being called within a render pass instance, each element of {@code pCommandBuffers} <b>must</b> have been recorded with the #COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT</li>
            <li>If {@code vkCmdExecuteCommands} is being called within a render pass instance, each element of {@code pCommandBuffers} <b>must</b> have been recorded with ##VkCommandBufferInheritanceInfo{@code ::subpass} set to the index of the subpass which the given command buffer will be executed in</li>
            <li>If {@code vkCmdExecuteCommands} is being called within a render pass instance, the render passes specified in the {@code pBeginInfo}-&gt;pInheritanceInfo-&gt;renderPass members of the #BeginCommandBuffer() commands used to begin recording each element of {@code pCommandBuffers} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-compatibility">compatible</a> with the current render pass</li>
            <li>If {@code vkCmdExecuteCommands} is being called within a render pass instance, and any element of {@code pCommandBuffers} was recorded with ##VkCommandBufferInheritanceInfo{@code ::framebuffer} not equal to #NULL_HANDLE, that {@code VkFramebuffer} <b>must</b> match the {@code VkFramebuffer} used in the current render pass instance</li>
            <li>If {@code vkCmdExecuteCommands} is not being called within a render pass instance, each element of {@code pCommandBuffers} <b>must</b> not have been recorded with the #COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-inheritedQueries">inherited queries</a> feature is not enabled, {@code commandBuffer} <b>must</b> not have any queries <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-operation-active">active</a></li>
            <li>If {@code commandBuffer} has a #QUERY_TYPE_OCCLUSION query <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-operation-active">active</a>, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with ##VkCommandBufferInheritanceInfo{@code ::occlusionQueryEnable} set to #TRUE</li>
            <li>If {@code commandBuffer} has a #QUERY_TYPE_OCCLUSION query <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-operation-active">active</a>, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with ##VkCommandBufferInheritanceInfo{@code ::queryFlags} having all bits set that are set for the query</li>
            <li>If {@code commandBuffer} has a #QUERY_TYPE_PIPELINE_STATISTICS query <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-operation-active">active</a>, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with ##VkCommandBufferInheritanceInfo{@code ::pipelineStatistics} having all bits set that are set in the {@code VkQueryPool} the query uses</li>
            <li>Each element of {@code pCommandBuffers} <b>must</b> not begin any query types that are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#queries-operation-active">active</a> in {@code commandBuffer}</li>
            <li>If {@code commandBuffer} is a protected command buffer, then each element of {@code pCommandBuffers} <b>must</b> be a protected command buffer</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, then each element of {@code pCommandBuffers} <b>must</b> be an unprotected command buffer</li>
            <li>This command <b>must</b> not be recorded when transform feedback is active</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCommandBuffers} <b>must</b> be a valid pointer to an array of {@code commandBufferCount} valid {@code VkCommandBuffer} handles</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
            <li>{@code commandBufferCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and the elements of {@code pCommandBuffers} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Both</td><td>Transfer Graphics Compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "a handle to a primary command buffer that the secondary command buffers are executed in."),
        AutoSize("pCommandBuffers")..uint32_t("commandBufferCount", "the length of the {@code pCommandBuffers} array."),
        VkCommandBuffer.const.p("pCommandBuffers", "a pointer to an array of {@code commandBufferCount} secondary command buffer handles, which are recorded to execute in the primary command buffer in the order they are listed in the array.")
    )

}