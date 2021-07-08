/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan

import org.lwjgl.generator.*
//import core.android.*
import core.linux.*
import core.macos.*
import core.windows.*

// Handle types
val VkSurfaceKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSurfaceKHR")
val VkSwapchainKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSwapchainKHR")
val VkDisplayKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDisplayKHR")
val VkDisplayModeKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDisplayModeKHR")
val VkDebugReportCallbackEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDebugReportCallbackEXT")
val VkDescriptorUpdateTemplateKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDescriptorUpdateTemplateKHR")
val VkDebugUtilsMessengerEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDebugUtilsMessengerEXT")
val VkAccelerationStructureKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkAccelerationStructureKHR")
val VkDeferredOperationKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDeferredOperationKHR")
val VkSamplerYcbcrConversionKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSamplerYcbcrConversionKHR")
val VkValidationCacheEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkValidationCacheEXT")
val VkAccelerationStructureNV = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkAccelerationStructureNV")
val VkPerformanceConfigurationINTEL = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkPerformanceConfigurationINTEL")
val VkIndirectCommandsLayoutNV = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkIndirectCommandsLayoutNV")
val VkPrivateDataSlotEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkPrivateDataSlotEXT")

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
val VkShaderInfoTypeAMD = "VkShaderInfoTypeAMD".enumType
val VkExternalMemoryHandleTypeFlagBitsNV = "VkExternalMemoryHandleTypeFlagBitsNV".enumType
val VkExternalMemoryFeatureFlagBitsNV = "VkExternalMemoryFeatureFlagBitsNV".enumType
val VkValidationCheckEXT = "VkValidationCheckEXT".enumType
val VkConditionalRenderingFlagBitsEXT = "VkConditionalRenderingFlagBitsEXT".enumType
val VkSurfaceCounterFlagBitsEXT = "VkSurfaceCounterFlagBitsEXT".enumType
val VkDisplayPowerStateEXT = "VkDisplayPowerStateEXT".enumType
val VkDeviceEventTypeEXT = "VkDeviceEventTypeEXT".enumType
val VkDisplayEventTypeEXT = "VkDisplayEventTypeEXT".enumType
val VkViewportCoordinateSwizzleNV = "VkViewportCoordinateSwizzleNV".enumType
val VkDiscardRectangleModeEXT = "VkDiscardRectangleModeEXT".enumType
val VkConservativeRasterizationModeEXT = "VkConservativeRasterizationModeEXT".enumType
val VkPerformanceCounterUnitKHR = "VkPerformanceCounterUnitKHR".enumType
val VkPerformanceCounterScopeKHR = "VkPerformanceCounterScopeKHR".enumType
val VkPerformanceCounterStorageKHR = "VkPerformanceCounterStorageKHR".enumType
val VkPerformanceCounterDescriptionFlagBitsKHR = "VkPerformanceCounterDescriptionFlagBitsKHR".enumType
val VkAcquireProfilingLockFlagBitsKHR = "VkAcquireProfilingLockFlagBitsKHR".enumType
val VkDebugUtilsMessageSeverityFlagBitsEXT = "VkDebugUtilsMessageSeverityFlagBitsEXT".enumType
val VkDebugUtilsMessageTypeFlagBitsEXT = "VkDebugUtilsMessageTypeFlagBitsEXT".enumType
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
val VkValidationCacheHeaderVersionEXT = "VkValidationCacheHeaderVersionEXT".enumType
val VkShadingRatePaletteEntryNV = "VkShadingRatePaletteEntryNV".enumType
val VkCoarseSampleOrderTypeNV = "VkCoarseSampleOrderTypeNV".enumType
val VkAccelerationStructureMemoryRequirementsTypeNV = "VkAccelerationStructureMemoryRequirementsTypeNV".enumType
val VkQueueGlobalPriorityEXT = "VkQueueGlobalPriorityEXT".enumType
val VkPipelineCompilerControlFlagBitsAMD = "VkPipelineCompilerControlFlagBitsAMD".enumType
val VkTimeDomainEXT = "VkTimeDomainEXT".enumType
val VkMemoryOverallocationBehaviorAMD = "VkMemoryOverallocationBehaviorAMD".enumType
val VkPipelineCreationFeedbackFlagBitsEXT = "VkPipelineCreationFeedbackFlagBitsEXT".enumType
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
val VkFullScreenExclusiveEXT = "VkFullScreenExclusiveEXT".enumType
val VkLineRasterizationModeEXT = "VkLineRasterizationModeEXT".enumType
val VkPipelineExecutableStatisticFormatKHR = "VkPipelineExecutableStatisticFormatKHR".enumType
val VkIndirectStateFlagBitsNV = "VkIndirectStateFlagBitsNV".enumType
val VkIndirectCommandsTokenTypeNV = "VkIndirectCommandsTokenTypeNV".enumType
val VkIndirectCommandsLayoutUsageFlagBitsNV = "VkIndirectCommandsLayoutUsageFlagBitsNV".enumType
val VkDeviceMemoryReportEventTypeEXT = "VkDeviceMemoryReportEventTypeEXT".enumType
val VkPrivateDataSlotCreateFlagBitsEXT = "VkPrivateDataSlotCreateFlagBitsEXT".enumType
val VkDeviceDiagnosticsConfigFlagBitsNV = "VkDeviceDiagnosticsConfigFlagBitsNV".enumType
val VkPipelineStageFlagBits2KHR = "VkPipelineStageFlagBits2KHR".enumType
val VkAccessFlagBits2KHR = "VkAccessFlagBits2KHR".enumType
val VkSubmitFlagBitsKHR = "VkSubmitFlagBitsKHR".enumType
val VkFragmentShadingRateTypeNV = "VkFragmentShadingRateTypeNV".enumType
val VkFragmentShadingRateNV = "VkFragmentShadingRateNV".enumType

// Bitmask types
val VkCompositeAlphaFlagsKHR = typedef(VkFlags, "VkCompositeAlphaFlagsKHR")
val VkSurfaceTransformFlagsKHR = typedef(VkFlags, "VkSurfaceTransformFlagsKHR")
val VkSwapchainCreateFlagsKHR = typedef(VkFlags, "VkSwapchainCreateFlagsKHR")
val VkDeviceGroupPresentModeFlagsKHR = typedef(VkFlags, "VkDeviceGroupPresentModeFlagsKHR")
val VkDisplayModeCreateFlagsKHR = typedef(VkFlags, "VkDisplayModeCreateFlagsKHR")
val VkDisplayPlaneAlphaFlagsKHR = typedef(VkFlags, "VkDisplayPlaneAlphaFlagsKHR")
val VkDisplaySurfaceCreateFlagsKHR = typedef(VkFlags, "VkDisplaySurfaceCreateFlagsKHR")
val VkXlibSurfaceCreateFlagsKHR = typedef(VkFlags, "VkXlibSurfaceCreateFlagsKHR")
val VkWaylandSurfaceCreateFlagsKHR = typedef(VkFlags, "VkWaylandSurfaceCreateFlagsKHR")
val VkWin32SurfaceCreateFlagsKHR = typedef(VkFlags, "VkWin32SurfaceCreateFlagsKHR")
val VkDebugReportFlagsEXT = typedef(VkFlags, "VkDebugReportFlagsEXT")
val VkPipelineRasterizationStateStreamCreateFlagsEXT = typedef(VkFlags, "VkPipelineRasterizationStateStreamCreateFlagsEXT")
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
val VkMetalSurfaceCreateFlagsEXT = typedef(VkFlags, "VkMetalSurfaceCreateFlagsEXT")
val VkShaderCorePropertiesFlagsAMD = typedef(VkFlags, "VkShaderCorePropertiesFlagsAMD")
val VkToolPurposeFlagsEXT = typedef(VkFlags, "VkToolPurposeFlagsEXT")
val VkPipelineCoverageReductionStateCreateFlagsNV = typedef(VkFlags, "VkPipelineCoverageReductionStateCreateFlagsNV")
val VkHeadlessSurfaceCreateFlagsEXT = typedef(VkFlags, "VkHeadlessSurfaceCreateFlagsEXT")
val VkIndirectStateFlagsNV = typedef(VkFlags, "VkIndirectStateFlagsNV")
val VkIndirectCommandsLayoutUsageFlagsNV = typedef(VkFlags, "VkIndirectCommandsLayoutUsageFlagsNV")
val VkDeviceMemoryReportFlagsEXT = typedef(VkFlags, "VkDeviceMemoryReportFlagsEXT")
val VkPrivateDataSlotCreateFlagsEXT = typedef(VkFlags, "VkPrivateDataSlotCreateFlagsEXT")
val VkDeviceDiagnosticsConfigFlagsNV = typedef(VkFlags, "VkDeviceDiagnosticsConfigFlagsNV")
val VkPipelineStageFlags2KHR = typedef(VkFlags, "VkPipelineStageFlags2KHR")
val VkAccessFlags2KHR = typedef(VkFlags, "VkAccessFlags2KHR")
val VkSubmitFlagsKHR = typedef(VkFlags, "VkSubmitFlagsKHR")

// Function pointer types
val PFN_vkDebugReportCallbackEXT = Module.VULKAN.callback {
    VkBool32(
        "VkDebugReportCallbackEXT",
        "Application-defined debug report callback function.",

        VkDebugReportFlagsEXT("flags", "specifies the {@code VkDebugReportFlagBitsEXT} that triggered this callback."),
        VkDebugReportObjectTypeEXT("objectType", "a {@code VkDebugReportObjectTypeEXT} value specifying the type of object being used or created at the time the event was triggered."),
        uint64_t("object", "the object where the issue was detected. If {@code objectType} is #DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT, {@code object} is undefined."),
        size_t("location", "a component (layer, driver, loader) defined value specifying the <em>location</em> of the trigger. This is an optional: value."),
        int32_t("messageCode", "a layer-defined value indicating what test triggered this callback."),
        char.const.p("pLayerPrefix", "a null-terminated string that is an abbreviation of the name of the component making the callback. {@code pLayerPrefix} is only valid for the duration of the callback."),
        char.const.p("pMessage", "a null-terminated string detailing the trigger conditions. {@code pMessage} is only valid for the duration of the callback."),
        opaque_p("pUserData", "the user data given when the {@code VkDebugReportCallbackEXT} was created."),

        nativeType = "PFN_vkDebugReportCallbackEXT"
    ) {
        documentation =
        """
        Application-defined debug report callback function.

        <h5>C Specification</h5>
        The prototype for the ##VkDebugReportCallbackCreateInfoEXT{@code ::pfnCallback} function implemented by the application is:

        <pre><code>
￿typedef VkBool32 (VKAPI_PTR *PFN_vkDebugReportCallbackEXT)(
￿    VkDebugReportFlagsEXT                       flags,
￿    VkDebugReportObjectTypeEXT                  objectType,
￿    uint64_t                                    object,
￿    size_t                                      location,
￿    int32_t                                     messageCode,
￿    const char*                                 pLayerPrefix,
￿    const char*                                 pMessage,
￿    void*                                       pUserData);</code></pre>

        <h5>Description</h5>
        The callback <b>must</b> not call {@code vkDestroyDebugReportCallbackEXT}.

        The callback returns a {@code VkBool32}, which is interpreted in a layer-specified manner. The application <b>should</b> always return #FALSE. The #TRUE value is reserved for use in layer development.

        {@code object} <b>must</b> be a Vulkan object or #NULL_HANDLE. If {@code objectType} is not #DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT and {@code object} is not #NULL_HANDLE, {@code object} <b>must</b> be a Vulkan object of the corresponding type associated with {@code objectType} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#debug-report-object-types">{@code VkDebugReportObjectTypeEXT} and Vulkan Handle Relationship</a>.

        <h5>See Also</h5>
        ##VkDebugReportCallbackCreateInfoEXT
        """
    }
}

val _VkDebugUtilsMessengerCallbackDataEXT = struct(Module.VULKAN, "VkDebugUtilsMessengerCallbackDataEXT")
val PFN_vkDebugUtilsMessengerCallbackEXT = Module.VULKAN.callback {
    VkBool32(
        "VkDebugUtilsMessengerCallbackEXT",
        "Application-defined debug messenger callback function.",

        VkDebugUtilsMessageSeverityFlagBitsEXT("messageSeverity", "specifies the {@code VkDebugUtilsMessageSeverityFlagBitsEXT} that triggered this callback."),
        VkDebugUtilsMessageTypeFlagsEXT("messageTypes", "a bitmask of {@code VkDebugUtilsMessageTypeFlagBitsEXT} specifying which type of event(s) triggered this callback."),
        _VkDebugUtilsMessengerCallbackDataEXT.const.p("pCallbackData", "contains all the callback related data in the ##VkDebugUtilsMessengerCallbackDataEXT structure."),
        opaque_p("pUserData", "the user data provided when the {@code VkDebugUtilsMessengerEXT} was created."),

        nativeType = "PFN_vkDebugUtilsMessengerCallbackEXT"
    ) {
        documentation =
        """
        Application-defined debug messenger callback function.

        <h5>C Specification</h5>
        The prototype for the ##VkDebugUtilsMessengerCreateInfoEXT{@code ::pfnUserCallback} function implemented by the application is:

        <pre><code>
￿typedef VkBool32 (VKAPI_PTR *PFN_vkDebugUtilsMessengerCallbackEXT)(
￿    VkDebugUtilsMessageSeverityFlagBitsEXT           messageSeverity,
￿    VkDebugUtilsMessageTypeFlagsEXT                  messageTypes,
￿    const VkDebugUtilsMessengerCallbackDataEXT*      pCallbackData,
￿    void*                                            pUserData);</code></pre>

        <h5>Description</h5>
        The callback returns a {@code VkBool32}, which is interpreted in a layer-specified manner. The application <b>should</b> always return #FALSE. The #TRUE value is reserved for use in layer development.

        <h5>Valid Usage</h5>
        <ul>
            <li>The callback <b>must</b> not make calls to any Vulkan commands.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDebugUtilsMessengerCreateInfoEXT
        """
    }
}

val _VkDeviceMemoryReportCallbackDataEXT = struct(Module.VULKAN, "VkDeviceMemoryReportCallbackDataEXT")
val PFN_vkDeviceMemoryReportCallbackEXT = Module.VULKAN.callback {
    void(
        "VkDeviceMemoryReportCallbackEXT",
        "Application-defined device memory report callback function.",

        _VkDeviceMemoryReportCallbackDataEXT.const.p("pCallbackData", "contains all the callback related data in the ##VkDeviceMemoryReportCallbackDataEXT structure."),
        opaque_p("pUserData", "the user data provided when the ##VkDeviceDeviceMemoryReportCreateInfoEXT was created."),

        nativeType = "PFN_vkDeviceMemoryReportCallbackEXT"
    ) {
        documentation =
        """
        Application-defined device memory report callback function.

        <h5>C Specification</h5>
        The prototype for the ##VkDeviceDeviceMemoryReportCreateInfoEXT{@code ::pfnUserCallback} function implemented by the application is:

        <pre><code>
￿typedef void (VKAPI_PTR *PFN_vkDeviceMemoryReportCallbackEXT)(
￿    const VkDeviceMemoryReportCallbackDataEXT*  pCallbackData,
￿    void*                                       pUserData);</code></pre>

        <h5>Description</h5>
        The callback <b>must</b> not make calls to any Vulkan commands.

        <h5>See Also</h5>
        ##VkDeviceDeviceMemoryReportCreateInfoEXT
        """
    }
}

// Struct types
val VkSurfaceCapabilitiesKHR = struct(Module.VULKAN, "VkSurfaceCapabilitiesKHR", mutable = false) {
    documentation =
        """
        Structure describing capabilities of a surface.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Supported usage flags of a presentable image when using #PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR or #PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR presentation mode are provided by ##VkSharedPresentSurfaceCapabilitiesKHR{@code ::sharedPresentSupportedUsageFlags}.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Formulas such as <code>min(N, maxImageCount)</code> are not correct, since {@code maxImageCount} <b>may</b> be zero.
        </div>

        <h5>See Also</h5>
        ##VkExtent2D, ##VkSurfaceCapabilities2KHR, #GetPhysicalDeviceSurfaceCapabilitiesKHR()
        """

    uint32_t("minImageCount", "the minimum number of images the specified device supports for a swapchain created for the surface, and will be at least one.")
    uint32_t("maxImageCount", "the maximum number of images the specified device supports for a swapchain created for the surface, and will be either 0, or greater than or equal to {@code minImageCount}. A value of 0 means that there is no limit on the number of images, though there <b>may</b> be limits related to the total amount of memory used by presentable images.")
    VkExtent2D("currentExtent", "the current width and height of the surface, or the special value <code>(0xFFFFFFFF, 0xFFFFFFFF)</code> indicating that the surface size will be determined by the extent of a swapchain targeting the surface.")
    VkExtent2D("minImageExtent", "contains the smallest valid swapchain extent for the surface on the specified device. The {@code width} and {@code height} of the extent will each be less than or equal to the corresponding {@code width} and {@code height} of {@code currentExtent}, unless {@code currentExtent} has the special value described above.")
    VkExtent2D("maxImageExtent", "contains the largest valid swapchain extent for the surface on the specified device. The {@code width} and {@code height} of the extent will each be greater than or equal to the corresponding {@code width} and {@code height} of {@code minImageExtent}. The {@code width} and {@code height} of the extent will each be greater than or equal to the corresponding {@code width} and {@code height} of {@code currentExtent}, unless {@code currentExtent} has the special value described above.")
    uint32_t("maxImageArrayLayers", "the maximum number of layers presentable images <b>can</b> have for a swapchain created for this device and surface, and will be at least one.")
    VkSurfaceTransformFlagsKHR("supportedTransforms", "a bitmask of {@code VkSurfaceTransformFlagBitsKHR} indicating the presentation transforms supported for the surface on the specified device. At least one bit will be set.")
    VkSurfaceTransformFlagBitsKHR("currentTransform", "{@code VkSurfaceTransformFlagBitsKHR} value indicating the surface&#8217;s current transform relative to the presentation engine&#8217;s natural orientation.")
    VkCompositeAlphaFlagsKHR("supportedCompositeAlpha", "a bitmask of {@code VkCompositeAlphaFlagBitsKHR}, representing the alpha compositing modes supported by the presentation engine for the surface on the specified device, and at least one bit will be set. Opaque composition <b>can</b> be achieved in any alpha compositing mode by either using an image format that has no alpha component, or by ensuring that all pixels in the presentable images have an alpha value of 1.0.")
    VkImageUsageFlags("supportedUsageFlags", "a bitmask of {@code VkImageUsageFlagBits} representing the ways the application <b>can</b> use the presentable images of a swapchain created with {@code VkPresentModeKHR} set to #PRESENT_MODE_IMMEDIATE_KHR, #PRESENT_MODE_MAILBOX_KHR, #PRESENT_MODE_FIFO_KHR or #PRESENT_MODE_FIFO_RELAXED_KHR for the surface on the specified device. #IMAGE_USAGE_COLOR_ATTACHMENT_BIT <b>must</b> be included in the set but implementations <b>may</b> support additional usages.")
}

val VkSurfaceFormatKHR = struct(Module.VULKAN, "VkSurfaceFormatKHR", mutable = false) {
    documentation =
        """
        Structure describing a supported swapchain format-color space pair.
        """

    VkFormat("format", "a {@code VkFormat} that is compatible with the specified surface.")
    VkColorSpaceKHR("colorSpace", "a presentation {@code VkColorSpaceKHR} that is compatible with the surface.")
}

val VkSwapchainCreateInfoKHR = struct(Module.VULKAN, "VkSwapchainCreateInfoKHR") {
    documentation =
        """
        Structure specifying parameters of a newly created swapchain object.

        <h5>See Also</h5>
        {@code VkBool32}, {@code VkColorSpaceKHR}, {@code VkCompositeAlphaFlagBitsKHR}, ##VkExtent2D, {@code VkFormat}, {@code VkImageUsageFlags}, {@code VkPresentModeKHR}, {@code VkSharingMode}, {@code VkStructureType}, {@code VkSurfaceKHR}, {@code VkSurfaceTransformFlagBitsKHR}, {@code VkSwapchainCreateFlagsKHR}, {@code VkSwapchainKHR}, #CreateSharedSwapchainsKHR(), #CreateSwapchainKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSwapchainCreateFlagsKHR("flags", "a bitmask of {@code VkSwapchainCreateFlagBitsKHR} indicating parameters of the swapchain creation.")
    VkSurfaceKHR("surface", "the surface onto which the swapchain will present images. If the creation succeeds, the swapchain becomes associated with {@code surface}.")
    uint32_t("minImageCount", "the minimum number of presentable images that the application needs. The implementation will either create the swapchain with at least that many images, or it will fail to create the swapchain.")
    VkFormat("imageFormat", "a {@code VkFormat} value specifying the format the swapchain image(s) will be created with.")
    VkColorSpaceKHR("imageColorSpace", "a {@code VkColorSpaceKHR} value specifying the way the swapchain interprets image data.")
    VkExtent2D("imageExtent", """the size (in pixels) of the swapchain image(s). The behavior is platform-dependent if the image extent does not match the surface&#8217;s {@code currentExtent} as returned by {@code vkGetPhysicalDeviceSurfaceCapabilitiesKHR}.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        On some platforms, it is normal that {@code maxImageExtent} <b>may</b> become {@code (0, 0)}, for example when the window is minimized. In such a case, it is not possible to create a swapchain due to the Valid Usage requirements.
        </div>""")
    uint32_t("imageArrayLayers", "the number of views in a multiview/stereo surface. For non-stereoscopic-3D applications, this value is 1.")
    VkImageUsageFlags("imageUsage", "a bitmask of {@code VkImageUsageFlagBits} describing the intended usage of the (acquired) swapchain images.")
    VkSharingMode("imageSharingMode", "the sharing mode used for the image(s) of the swapchain.")
    AutoSize("pQueueFamilyIndices", optional = true)..uint32_t("queueFamilyIndexCount", "the number of queue families having access to the image(s) of the swapchain when {@code imageSharingMode} is #SHARING_MODE_CONCURRENT.")
    uint32_t.const.p("pQueueFamilyIndices", "a pointer to an array of queue family indices having access to the images(s) of the swapchain when {@code imageSharingMode} is #SHARING_MODE_CONCURRENT.")
    VkSurfaceTransformFlagBitsKHR("preTransform", "a {@code VkSurfaceTransformFlagBitsKHR} value describing the transform, relative to the presentation engine&#8217;s natural orientation, applied to the image content prior to presentation. If it does not match the {@code currentTransform} value returned by {@code vkGetPhysicalDeviceSurfaceCapabilitiesKHR}, the presentation engine will transform the image content as part of the presentation operation.")
    VkCompositeAlphaFlagBitsKHR("compositeAlpha", "a {@code VkCompositeAlphaFlagBitsKHR} value indicating the alpha compositing mode to use when this surface is composited together with other surfaces on certain window systems.")
    VkPresentModeKHR("presentMode", "the presentation mode the swapchain will use. A swapchain&#8217;s present mode determines how incoming present requests will be processed and queued internally.")
    VkBool32("clipped", """specifies whether the Vulkan implementation is allowed to discard rendering operations that affect regions of the surface that are not visible.

        <ul>
            <li>If set to #TRUE, the presentable images associated with the swapchain <b>may</b> not own all of their pixels. Pixels in the presentable images that correspond to regions of the target surface obscured by another window on the desktop, or subject to some other clipping mechanism will have undefined content when read back. Fragment shaders <b>may</b> not execute for these pixels, and thus any side effects they would have had will not occur. #TRUE value does not guarantee any clipping will occur, but allows more optimal presentation methods to be used on some platforms.</li>
            <li>
                If set to #FALSE, presentable images associated with the swapchain will own all of the pixels they contain.
                <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>should</b> set this value to #TRUE if they do not expect to read back the content of presentable images before presenting them or after reacquiring them, and if their fragment shaders do not have any side effects that require them to run for all pixels in the presentable image.
                </div>
            </li>
        </ul>""")
    VkSwapchainKHR("oldSwapchain", """#NULL_HANDLE, or the existing non-retired swapchain currently associated with {@code surface}. Providing a valid {@code oldSwapchain} <b>may</b> aid in the resource reuse, and also allows the application to still present any images that are already acquired from it.

        Upon calling {@code vkCreateSwapchainKHR} with an {@code oldSwapchain} that is not #NULL_HANDLE, {@code oldSwapchain} is retired -- even if creation of the new swapchain fails. The new swapchain is created in the non-retired state whether or not {@code oldSwapchain} is #NULL_HANDLE.

        Upon calling {@code vkCreateSwapchainKHR} with an {@code oldSwapchain} that is not #NULL_HANDLE, any images from {@code oldSwapchain} that are not acquired by the application <b>may</b> be freed by the implementation, which <b>may</b> occur even if creation of the new swapchain fails. The application <b>can</b> destroy {@code oldSwapchain} to free all memory associated with {@code oldSwapchain}.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Multiple retired swapchains <b>can</b> be associated with the same {@code VkSurfaceKHR} through multiple uses of {@code oldSwapchain} that outnumber calls to #DestroySwapchainKHR().

        == Description

        After {@code oldSwapchain} is retired, the application <b>can</b> pass to #QueuePresentKHR() any images it had already acquired from {@code oldSwapchain}. E.g., an application may present an image from the old swapchain before an image from the new swapchain is ready to be presented. As usual, #QueuePresentKHR() <b>may</b> fail if {@code oldSwapchain} has entered a state that causes #ERROR_OUT_OF_DATE_KHR to be returned.

        The application <b>can</b> continue to use a shared presentable image obtained from {@code oldSwapchain} until a presentable image is acquired from the new swapchain, as long as it has not entered a state that causes it to return #ERROR_OUT_OF_DATE_KHR.
        </div>""")
}

val VkPresentInfoKHR = struct(Module.VULKAN, "VkPresentInfoKHR") {
    documentation =
        """
        Structure describing parameters of a queue presentation.

        <h5>Description</h5>
        Before an application <b>can</b> present an image, the image's layout <b>must</b> be transitioned to the #IMAGE_LAYOUT_PRESENT_SRC_KHR layout, or for a shared presentable image the #IMAGE_LAYOUT_SHARED_PRESENT_KHR layout.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        When transitioning the image to #IMAGE_LAYOUT_SHARED_PRESENT_KHR or #IMAGE_LAYOUT_PRESENT_SRC_KHR, there is no need to delay subsequent processing, or perform any visibility operations (as #QueuePresentKHR() performs automatic visibility operations). To achieve this, the {@code dstAccessMask} member of the ##VkImageMemoryBarrier <b>should</b> be set to 0, and the {@code dstStageMask} parameter <b>should</b> be set to #PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>Each element of {@code pImageIndices} <b>must</b> be the index of a presentable image acquired from the swapchain specified by the corresponding element of the {@code pSwapchains} array, and the presented image subresource <b>must</b> be in the #IMAGE_LAYOUT_PRESENT_SRC_KHR or #IMAGE_LAYOUT_SHARED_PRESENT_KHR layout at the time the operation is executed on a {@code VkDevice}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PRESENT_INFO_KHR</li>
            <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of ##VkDeviceGroupPresentInfoKHR, ##VkDisplayPresentInfoKHR, ##VkPresentRegionsKHR, or ##VkPresentTimesInfoGOOGLE</li>
            <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
            <li>If {@code waitSemaphoreCount} is not 0, {@code pWaitSemaphores} <b>must</b> be a valid pointer to an array of {@code waitSemaphoreCount} valid {@code VkSemaphore} handles</li>
            <li>{@code pSwapchains} <b>must</b> be a valid pointer to an array of {@code swapchainCount} valid {@code VkSwapchainKHR} handles</li>
            <li>{@code pImageIndices} <b>must</b> be a valid pointer to an array of {@code swapchainCount} {@code uint32_t} values</li>
            <li>If {@code pResults} is not {@code NULL}, {@code pResults} <b>must</b> be a valid pointer to an array of {@code swapchainCount} {@code VkResult} values</li>
            <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
            <li>Both of the elements of {@code pSwapchains}, and the elements of {@code pWaitSemaphores} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>See Also</h5>
        #QueuePresentKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pWaitSemaphores", optional = true)..uint32_t("waitSemaphoreCount", "the number of semaphores to wait for before issuing the present request. The number <b>may</b> be zero.")
    VkSemaphore.const.p("pWaitSemaphores", "{@code NULL} or a pointer to an array of {@code VkSemaphore} objects with {@code waitSemaphoreCount} entries, and specifies the semaphores to wait for before issuing the present request.")
    AutoSize("pSwapchains", "pImageIndices", "pResults")..uint32_t("swapchainCount", "the number of swapchains being presented to by this command.")
    VkSwapchainKHR.const.p("pSwapchains", "a pointer to an array of {@code VkSwapchainKHR} objects with {@code swapchainCount} entries. A given swapchain <b>must</b> not appear in this list more than once.")
    uint32_t.const.p("pImageIndices", "a pointer to an array of indices into the array of each swapchain&#8217;s presentable images, with {@code swapchainCount} entries. Each entry in this array identifies the image to present on the corresponding entry in the {@code pSwapchains} array.")
    nullable..VkResult.p("pResults", "a pointer to an array of {@code VkResult} typed elements with {@code swapchainCount} entries. Applications that do not need per-swapchain results <b>can</b> use {@code NULL} for {@code pResults}. If non-{@code NULL}, each entry in {@code pResults} will be set to the {@code VkResult} for presenting the swapchain corresponding to the same index in {@code pSwapchains}.")
}

val VkImageSwapchainCreateInfoKHR = struct(Module.VULKAN, "VkImageSwapchainCreateInfoKHR") {
    documentation =
        """
        Specify that an image will be bound to swapchain memory.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code swapchain} is not #NULL_HANDLE, the fields of ##VkImageCreateInfo <b>must</b> match the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#swapchain-wsi-image-create-info">implied image creation parameters</a> of the swapchain</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR</li>
            <li>If {@code swapchain} is not #NULL_HANDLE, {@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSwapchainKHR("swapchain", "#NULL_HANDLE or a handle of a swapchain that the image will be bound to.")
}

val VkBindImageMemorySwapchainInfoKHR = struct(Module.VULKAN, "VkBindImageMemorySwapchainInfoKHR") {
    documentation =
        """
        Structure specifying swapchain image memory to bind to.

        <h5>Description</h5>
        If {@code swapchain} is not {@code NULL}, the {@code swapchain} and {@code imageIndex} are used to determine the memory that the image is bound to, instead of {@code memory} and {@code memoryOffset}.

        Memory <b>can</b> be bound to a swapchain and use the {@code pDeviceIndices} or {@code pSplitInstanceBindRegions} members of ##VkBindImageMemoryDeviceGroupInfo.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code imageIndex} <b>must</b> be less than the number of images in {@code swapchain}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSwapchainKHR("swapchain", "#NULL_HANDLE or a swapchain handle.")
    uint32_t("imageIndex", "an image index within {@code swapchain}.")
}

val VkAcquireNextImageInfoKHR = struct(Module.VULKAN, "VkAcquireNextImageInfoKHR") {
    documentation =
        """
        Structure specifying parameters of the acquire.

        <h5>Description</h5>
        If #AcquireNextImageKHR() is used, the device mask is considered to include all physical devices in the logical device.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        #AcquireNextImage2KHR() signals at most one semaphore, even if the application requests waiting for multiple physical devices to be ready via the {@code deviceMask}. However, only a single physical device <b>can</b> wait on that semaphore, since the semaphore becomes unsignaled when the wait succeeds. For other physical devices to wait for the image to be ready, it is necessary for the application to submit semaphore signal operation(s) to that first physical device to signal additional semaphore(s) after the wait succeeds, which the other physical device(s) <b>can</b> wait upon.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code swapchain} <b>must</b> not be in the retired state</li>
            <li>If {@code semaphore} is not #NULL_HANDLE it <b>must</b> be unsignaled</li>
            <li>If {@code semaphore} is not #NULL_HANDLE it <b>must</b> not have any uncompleted signal or wait operations pending</li>
            <li>If {@code fence} is not #NULL_HANDLE it <b>must</b> be unsignaled and <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
            <li>{@code semaphore} and {@code fence} <b>must</b> not both be equal to #NULL_HANDLE</li>
            <li>{@code deviceMask} <b>must</b> be a valid device mask</li>
            <li>{@code deviceMask} <b>must</b> not be zero</li>
            <li>{@code semaphore} <b>must</b> have a {@code VkSemaphoreType} of #SEMAPHORE_TYPE_BINARY</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>If {@code semaphore} is not #NULL_HANDLE, {@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>Each of {@code fence}, {@code semaphore}, and {@code swapchain} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        #AcquireNextImage2KHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSwapchainKHR("swapchain", "a non-retired swapchain from which an image is acquired.")
    uint64_t("timeout", "specifies how long the function waits, in nanoseconds, if no image is available.")
    VkSemaphore("semaphore", "#NULL_HANDLE or a semaphore to signal.")
    VkFence("fence", "#NULL_HANDLE or a fence to signal.")
    uint32_t("deviceMask", "a mask of physical devices for which the swapchain image will be ready to use when the semaphore or fence is signaled.")
}

val VkDeviceGroupPresentCapabilitiesKHR = struct(Module.VULKAN, "VkDeviceGroupPresentCapabilitiesKHR", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation =
        """
        Present capabilities from other physical devices.

        <h5>Description</h5>
        {@code modes} always has #DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR set.

        The present mode flags are also used when presenting an image, in ##VkDeviceGroupPresentInfoKHR{@code ::mode}.

        If a device group only includes a single physical device, then {@code modes} <b>must</b> equal #DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #GetDeviceGroupPresentCapabilitiesKHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("presentMask", "an array of #MAX_DEVICE_GROUP_SIZE {@code uint32_t} masks, where the mask at element <code>i</code> is non-zero if physical device <code>i</code> has a presentation engine, and where bit <code>j</code> is set in element <code>i</code> if physical device <code>i</code> <b>can</b> present swapchain images from physical device <code>j</code>. If element <code>i</code> is non-zero, then bit <code>i</code> <b>must</b> be set.")["VK_MAX_DEVICE_GROUP_SIZE"]
    VkDeviceGroupPresentModeFlagsKHR("modes", "a bitmask of {@code VkDeviceGroupPresentModeFlagBitsKHR} indicating which device group presentation modes are supported.")
}

val VkDeviceGroupPresentInfoKHR = struct(Module.VULKAN, "VkDeviceGroupPresentInfoKHR") {
    documentation =
        """
        Mode and mask controlling which physical devices' images are presented.

        <h5>Description</h5>
        If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR, then each element of {@code pDeviceMasks} selects which instance of the swapchain image is presented. Each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and the corresponding physical device <b>must</b> have a presentation engine as reported by ##VkDeviceGroupPresentCapabilitiesKHR.

        If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR, then each element of {@code pDeviceMasks} selects which instance of the swapchain image is presented. Each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and some physical device in the logical device <b>must</b> include that bit in its ##VkDeviceGroupPresentCapabilitiesKHR{@code ::presentMask}.

        If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR, then each element of {@code pDeviceMasks} selects which instances of the swapchain image are component-wise summed and the sum of those images is presented. If the sum in any component is outside the representable range, the value of that component is undefined. Each element of {@code pDeviceMasks} <b>must</b> have a value for which all set bits are set in one of the elements of ##VkDeviceGroupPresentCapabilitiesKHR{@code ::presentMask}.

        If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR, then each element of {@code pDeviceMasks} selects which instance(s) of the swapchain images are presented. For each bit set in each element of {@code pDeviceMasks}, the corresponding physical device <b>must</b> have a presentation engine as reported by ##VkDeviceGroupPresentCapabilitiesKHR.

        If ##VkDeviceGroupPresentInfoKHR is not provided or {@code swapchainCount} is zero then the masks are considered to be 1. If ##VkDeviceGroupPresentInfoKHR is not provided, {@code mode} is considered to be #DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code swapchainCount} <b>must</b> equal 0 or ##VkPresentInfoKHR{@code ::swapchainCount}</li>
            <li>If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR, then each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and the corresponding element of ##VkDeviceGroupPresentCapabilitiesKHR{@code ::presentMask} <b>must</b> be non-zero</li>
            <li>If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR, then each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and some physical device in the logical device <b>must</b> include that bit in its ##VkDeviceGroupPresentCapabilitiesKHR{@code ::presentMask}</li>
            <li>If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR, then each element of {@code pDeviceMasks} <b>must</b> have a value for which all set bits are set in one of the elements of ##VkDeviceGroupPresentCapabilitiesKHR{@code ::presentMask}</li>
            <li>If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR, then for each bit set in each element of {@code pDeviceMasks}, the corresponding element of ##VkDeviceGroupPresentCapabilitiesKHR{@code ::presentMask} <b>must</b> be non-zero</li>
            <li>The value of each element of {@code pDeviceMasks} <b>must</b> be equal to the device mask passed in ##VkAcquireNextImageInfoKHR{@code ::deviceMask} when the image index was last acquired</li>
            <li>{@code mode} <b>must</b> have exactly one bit set, and that bit <b>must</b> have been included in ##VkDeviceGroupSwapchainCreateInfoKHR{@code ::modes}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR</li>
            <li>If {@code swapchainCount} is not 0, {@code pDeviceMasks} <b>must</b> be a valid pointer to an array of {@code swapchainCount} {@code uint32_t} values</li>
            <li>{@code mode} <b>must</b> be a valid {@code VkDeviceGroupPresentModeFlagBitsKHR} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pDeviceMasks", optional = true)..uint32_t("swapchainCount", "zero or the number of elements in {@code pDeviceMasks}.")
    uint32_t.const.p("pDeviceMasks", "a pointer to an array of device masks, one for each element of ##VkPresentInfoKHR::pSwapchains.")
    VkDeviceGroupPresentModeFlagBitsKHR("mode", "the device group present mode that will be used for this present.")
}

val VkDeviceGroupSwapchainCreateInfoKHR = struct(Module.VULKAN, "VkDeviceGroupSwapchainCreateInfoKHR") {
    documentation =
        """
        Structure specifying parameters of a newly created swapchain object.

        <h5>Description</h5>
        If this structure is not present, {@code modes} is considered to be #DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR</li>
            <li>{@code modes} <b>must</b> be a valid combination of {@code VkDeviceGroupPresentModeFlagBitsKHR} values</li>
            <li>{@code modes} <b>must</b> not be 0</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDeviceGroupPresentModeFlagsKHR("modes", "a bitfield of modes that the swapchain <b>can</b> be used with.")
}

val VkDisplayModeParametersKHR = struct(Module.VULKAN, "VkDisplayModeParametersKHR") {
    documentation =
        """
        Structure describing display parameters associated with a display mode.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        For example, a 60Hz display mode would report a {@code refreshRate} of 60,000.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code width} member of {@code visibleRegion} <b>must</b> be greater than 0</li>
            <li>The {@code height} member of {@code visibleRegion} <b>must</b> be greater than 0</li>
            <li>{@code refreshRate} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkDisplayModeCreateInfoKHR, ##VkDisplayModePropertiesKHR, ##VkExtent2D
        """

    VkExtent2D("visibleRegion", "the 2D extents of the visible region.")
    uint32_t("refreshRate", "a {@code uint32_t} that is the number of times the display is refreshed each second multiplied by 1000.")
}

val VkDisplayModeCreateInfoKHR = struct(Module.VULKAN, "VkDisplayModeCreateInfoKHR") {
    documentation =
        """
        Structure specifying parameters of a newly created display mode object.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code parameters} <b>must</b> be a valid ##VkDisplayModeParametersKHR structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkDisplayModeParametersKHR, #CreateDisplayModeKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDisplayModeCreateFlagsKHR("flags", "reserved for future use, and <b>must</b> be zero.")
    VkDisplayModeParametersKHR("parameters", "a ##VkDisplayModeParametersKHR structure describing the display parameters to use in creating the new mode. If the parameters are not compatible with the specified display, the implementation <b>must</b> return #ERROR_INITIALIZATION_FAILED.")
}

val VkDisplayModePropertiesKHR = struct(Module.VULKAN, "VkDisplayModePropertiesKHR", mutable = false) {
    documentation =
        """
        Structure describing display mode properties.
        """

    VkDisplayModeKHR("displayMode", "a handle to the display mode described in this structure. This handle will be valid for the lifetime of the Vulkan instance.")
    VkDisplayModeParametersKHR("parameters", "a ##VkDisplayModeParametersKHR structure describing the display parameters associated with {@code displayMode}.")
}

val VkDisplayPlaneCapabilitiesKHR = struct(Module.VULKAN, "VkDisplayPlaneCapabilitiesKHR", mutable = false) {
    documentation =
        """
        Structure describing capabilities of a mode and plane combination.

        <h5>Description</h5>
        The minimum and maximum position and extent fields describe the implementation limits, if any, as they apply to the specified display mode and plane. Vendors <b>may</b> support displaying a subset of a swapchain's presentable images on the specified display plane. This is expressed by returning {@code minSrcPosition}, {@code maxSrcPosition}, {@code minSrcExtent}, and {@code maxSrcExtent} values that indicate a range of possible positions and sizes <b>may</b> be used to specify the region within the presentable images that source pixels will be read from when creating a swapchain on the specified display mode and plane.

        Vendors <b>may</b> also support mapping the presentable images`' content to a subset or superset of the visible region in the specified display mode. This is expressed by returning {@code minDstPosition}, {@code maxDstPosition}, {@code minDstExtent} and {@code maxDstExtent} values that indicate a range of possible positions and sizes <b>may</b> be used to describe the region within the display mode that the source pixels will be mapped to.

        Other vendors <b>may</b> support only a 1-1 mapping between pixels in the presentable images and the display mode. This <b>may</b> be indicated by returning <code>(0,0)</code> for {@code minSrcPosition}, {@code maxSrcPosition}, {@code minDstPosition}, and {@code maxDstPosition}, and (display mode width, display mode height) for {@code minSrcExtent}, {@code maxSrcExtent}, {@code minDstExtent}, and {@code maxDstExtent}.

        The value {@code supportedAlpha} <b>must</b> contain at least one valid {@code VkDisplayPlaneAlphaFlagBitsKHR} bit.

        These values indicate the limits of the implementation's individual fields. Not all combinations of values within the offset and extent ranges returned in ##VkDisplayPlaneCapabilitiesKHR are guaranteed to be supported. Presentation requests specifying unsupported combinations <b>may</b> fail.

        <h5>See Also</h5>
        ##VkDisplayPlaneCapabilities2KHR, ##VkExtent2D, ##VkOffset2D, #GetDisplayPlaneCapabilitiesKHR()
        """

    VkDisplayPlaneAlphaFlagsKHR("supportedAlpha", "a bitmask of {@code VkDisplayPlaneAlphaFlagBitsKHR} describing the supported alpha blending modes.")
    VkOffset2D("minSrcPosition", "the minimum source rectangle offset supported by this plane using the specified mode.")
    VkOffset2D("maxSrcPosition", "the maximum source rectangle offset supported by this plane using the specified mode. The {@code x} and {@code y} components of {@code maxSrcPosition} <b>must</b> each be greater than or equal to the {@code x} and {@code y} components of {@code minSrcPosition}, respectively.")
    VkExtent2D("minSrcExtent", "the minimum source rectangle size supported by this plane using the specified mode.")
    VkExtent2D("maxSrcExtent", "the maximum source rectangle size supported by this plane using the specified mode.")
    VkOffset2D("minDstPosition", "{@code minDstPosition}, {@code maxDstPosition}, {@code minDstExtent}, {@code maxDstExtent} all have similar semantics to their corresponding ptext:<b>Src</b> equivalents, but apply to the output region within the mode rather than the input region within the source image. Unlike the ptext:<b>Src</b> offsets, {@code minDstPosition} and {@code maxDstPosition} <b>may</b> contain negative values.")
    VkOffset2D("maxDstPosition", "see {@code minDstPosition}")
    VkExtent2D("minDstExtent", "see {@code minDstPosition}")
    VkExtent2D("maxDstExtent", "see {@code minDstPosition}")
}

val VkDisplayPlanePropertiesKHR = struct(Module.VULKAN, "VkDisplayPlanePropertiesKHR", mutable = false) {
    documentation =
        """
        Structure describing display plane properties.
        """

    VkDisplayKHR("currentDisplay", "the handle of the display the plane is currently associated with. If the plane is not currently attached to any displays, this will be #NULL_HANDLE.")
    uint32_t("currentStackIndex", "the current z-order of the plane. This will be between 0 and the value returned by {@code vkGetPhysicalDeviceDisplayPlanePropertiesKHR} in {@code pPropertyCount}.")
}

val VkDisplayPropertiesKHR = struct(Module.VULKAN, "VkDisplayPropertiesKHR", mutable = false) {
    documentation =
        """
        Structure describing an available display device.
        """

    VkDisplayKHR("display", "a handle that is used to refer to the display described here. This handle will be valid for the lifetime of the Vulkan instance.")
    charUTF8.const.p("displayName", "a pointer to a null-terminated UTF-8 string containing the name of the display. Generally, this will be the name provided by the display&#8217;s EDID. It <b>can</b> be {@code NULL} if no suitable name is available. If not {@code NULL}, the memory it points to <b>must</b> remain accessible as long as {@code display} is valid.")
    VkExtent2D("physicalDimensions", "describes the physical width and height of the visible portion of the display, in millimeters.")
    VkExtent2D("physicalResolution", """describes the physical, native, or preferred resolution of the display.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        For devices which have no natural value to return here, implementations <b>should</b> return the maximum resolution supported.
        </div>""")
    VkSurfaceTransformFlagsKHR("supportedTransforms", "a bitmask of {@code VkSurfaceTransformFlagBitsKHR} describing which transforms are supported by this display.")
    VkBool32("planeReorderPossible", "tells whether the planes on this display <b>can</b> have their z order changed. If this is #TRUE, the application <b>can</b> re-arrange the planes on this display in any order relative to each other.")
    VkBool32("persistentContent", """tells whether the display supports self-refresh/internal buffering. If this is true, the application <b>can</b> submit persistent present operations on swapchains created against this display.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Persistent presents <b>may</b> have higher latency, and <b>may</b> use less power when the screen content is updated infrequently, or when only a portion of the screen needs to be updated in most frames.
        </div>""")
}

val VkDisplaySurfaceCreateInfoKHR = struct(Module.VULKAN, "VkDisplaySurfaceCreateInfoKHR") {
    documentation =
        """
        Structure specifying parameters of a newly created display plane surface object.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Creating a display surface <b>must</b> not modify the state of the displays, planes, or other resources it names. For example, it <b>must</b> not apply the specified mode to be set on the associated display. Application of display configuration occurs as a side effect of presenting to a display surface.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code planeIndex} <b>must</b> be less than the number of display planes supported by the device as determined by calling {@code vkGetPhysicalDeviceDisplayPlanePropertiesKHR}</li>
            <li>If the {@code planeReorderPossible} member of the ##VkDisplayPropertiesKHR structure returned by {@code vkGetPhysicalDeviceDisplayPropertiesKHR} for the display corresponding to {@code displayMode} is #TRUE then {@code planeStackIndex} <b>must</b> be less than the number of display planes supported by the device as determined by calling {@code vkGetPhysicalDeviceDisplayPlanePropertiesKHR}; otherwise {@code planeStackIndex} <b>must</b> equal the {@code currentStackIndex} member of ##VkDisplayPlanePropertiesKHR returned by {@code vkGetPhysicalDeviceDisplayPlanePropertiesKHR} for the display plane corresponding to {@code displayMode}</li>
            <li>If {@code alphaMode} is #DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR then {@code globalAlpha} <b>must</b> be between 0 and 1, inclusive</li>
            <li>{@code alphaMode} <b>must</b> be one of the bits present in the {@code supportedAlpha} member of ##VkDisplayPlaneCapabilitiesKHR for the display plane corresponding to {@code displayMode}</li>
            <li>The {@code width} and {@code height} members of {@code imageExtent} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxImageDimension2D}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code displayMode} <b>must</b> be a valid {@code VkDisplayModeKHR} handle</li>
            <li>{@code transform} <b>must</b> be a valid {@code VkSurfaceTransformFlagBitsKHR} value</li>
            <li>{@code alphaMode} <b>must</b> be a valid {@code VkDisplayPlaneAlphaFlagBitsKHR} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent2D, #CreateDisplayPlaneSurfaceKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDisplaySurfaceCreateFlagsKHR("flags", "reserved for future use, and <b>must</b> be zero.")
    VkDisplayModeKHR("displayMode", "a {@code VkDisplayModeKHR} handle specifying the mode to use when displaying this surface.")
    uint32_t("planeIndex", "the plane on which this surface appears.")
    uint32_t("planeStackIndex", "the z-order of the plane.")
    VkSurfaceTransformFlagBitsKHR("transform", "a {@code VkSurfaceTransformFlagBitsKHR} value specifying the transformation to apply to images as part of the scanout operation.")
    float("globalAlpha", "the global alpha value. This value is ignored if {@code alphaMode} is not #DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR.")
    VkDisplayPlaneAlphaFlagBitsKHR("alphaMode", "a {@code VkDisplayPlaneAlphaFlagBitsKHR} value specifying the type of alpha blending to use.")
    VkExtent2D("imageExtent", "The size of the presentable images to use with the surface.")
}

val VkDisplayPresentInfoKHR = struct(Module.VULKAN, "VkDisplayPresentInfoKHR") {
    documentation =
        """
        Structure describing parameters of a queue presentation to a swapchain.

        <h5>Description</h5>
        If the extent of the {@code srcRect} and {@code dstRect} are not equal, the presented pixels will be scaled accordingly.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code srcRect} <b>must</b> specify a rectangular region that is a subset of the image being presented</li>
            <li>{@code dstRect} <b>must</b> specify a rectangular region that is a subset of the {@code visibleRegion} parameter of the display mode the swapchain being presented uses</li>
            <li>If the {@code persistentContent} member of the ##VkDisplayPropertiesKHR structure returned by {@code vkGetPhysicalDeviceDisplayPropertiesKHR} for the display the present operation targets then {@code persistent} <b>must</b> be #FALSE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR</li>
        </ul>

        <h5>See Also</h5>
        ##VkRect2D
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkRect2D("srcRect", "a rectangular region of pixels to present. It <b>must</b> be a subset of the image being presented. If ##VkDisplayPresentInfoKHR is not specified, this region will be assumed to be the entire presentable image.")
    VkRect2D("dstRect", "a rectangular region within the visible region of the swapchain&#8217;s display mode. If ##VkDisplayPresentInfoKHR is not specified, this region will be assumed to be the entire visible region of the visible region of the swapchain&#8217;s mode. If the specified rectangle is a subset of the display mode&#8217;s visible region, content from display planes below the swapchain&#8217;s plane will be visible outside the rectangle. If there are no planes below the swapchain&#8217;s, the area outside the specified rectangle will be black. If portions of the specified rectangle are outside of the display&#8217;s visible region, pixels mapping only to those portions of the rectangle will be discarded.")
    VkBool32("persistent", "If this is #TRUE, the display engine will enable buffered mode on displays that support it. This allows the display engine to stop sending content to the display until a new image is presented. The display will instead maintain a copy of the last presented image. This allows less power to be used, but <b>may</b> increase presentation latency. If ##VkDisplayPresentInfoKHR is not specified, persistent mode will not be used.")
}

val VkXlibSurfaceCreateInfoKHR = struct(Module.VULKAN, "VkXlibSurfaceCreateInfoKHR") {
    javaImport("org.lwjgl.system.linux.*")
    documentation =
        """
        Structure specifying parameters of a newly created Xlib surface object.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dpy} <b>must</b> point to a valid Xlib {@code Display}</li>
            <li>{@code window} <b>must</b> be a valid Xlib {@code Window}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>

        <h5>See Also</h5>
        #CreateXlibSurfaceKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkXlibSurfaceCreateFlagsKHR("flags", "reserved for future use.")
    Display.p("dpy", "a pointer to an Xlib {@code Display} connection to the X server.")
    Window("window", "an Xlib {@code Window} to associate the surface with.")
}

val VkWaylandSurfaceCreateInfoKHR = struct(Module.VULKAN, "VkWaylandSurfaceCreateInfoKHR") {
    javaImport("org.lwjgl.system.linux.*")
    documentation =
        """
        Structure specifying parameters of a newly created Wayland surface object.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code display} <b>must</b> point to a valid Wayland {@code wl_display}</li>
            <li>{@code surface} <b>must</b> point to a valid Wayland {@code wl_surface}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>

        <h5>See Also</h5>
        #CreateWaylandSurfaceKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkWaylandSurfaceCreateFlagsKHR("flags", "reserved for future use.")
    wl_display.p("display", "{@code display} and {@code surface} are pointers to the Wayland {@code wl_display} and {@code wl_surface} to associate the surface with.")
    wl_surface.p("surface", "see {@code display}")
}

val VkWin32SurfaceCreateInfoKHR = struct(Module.VULKAN, "VkWin32SurfaceCreateInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        Structure specifying parameters of a newly created Win32 surface object.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code hinstance} <b>must</b> be a valid Win32 {@code HINSTANCE}</li>
            <li>{@code hwnd} <b>must</b> be a valid Win32 {@code HWND}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>

        <h5>See Also</h5>
        #CreateWin32SurfaceKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkWin32SurfaceCreateFlagsKHR("flags", "reserved for future use.")
    HINSTANCE("hinstance", "the Win32 {@code HINSTANCE} for the window to associate the surface with.")
    HWND("hwnd", "the Win32 {@code HWND} for the window to associate the surface with.")
}

val VkDebugReportCallbackCreateInfoEXT = struct(Module.VULKAN, "VkDebugReportCallbackCreateInfoEXT") {
    documentation =
        """
        Structure specifying parameters of a newly created debug report callback.

        <h5>Description</h5>
        For each {@code VkDebugReportCallbackEXT} that is created the ##VkDebugReportCallbackCreateInfoEXT{@code ::flags} determine when that ##VkDebugReportCallbackCreateInfoEXT{@code ::pfnCallback} is called. When an event happens, the implementation will do a bitwise AND of the event's {@code VkDebugReportFlagBitsEXT} flags to each {@code VkDebugReportCallbackEXT} object's flags. For each non-zero result the corresponding callback will be called. The callback will come directly from the component that detected the event, unless some other layer intercepts the calls for its own purposes (filter them in a different way, log to a system error log, etc.).

        An application <b>may</b> receive multiple callbacks if multiple {@code VkDebugReportCallbackEXT} objects were created. A callback will always be executed in the same thread as the originating Vulkan call.

        A callback may be called from multiple threads simultaneously (if the application is making Vulkan calls from multiple threads).

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkDebugReportFlagBitsEXT} values</li>
            <li>{@code pfnCallback} <b>must</b> be a valid ##VkDebugReportCallbackEXT value</li>
        </ul>

        <h5>See Also</h5>
        ##VkDebugReportCallbackEXT, #CreateDebugReportCallbackEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDebugReportFlagsEXT("flags", "a bitmask of {@code VkDebugReportFlagBitsEXT} specifying which event(s) will cause this callback to be called.")
    PFN_vkDebugReportCallbackEXT("pfnCallback", "the application callback function to call.")
    nullable..opaque_p("pUserData", "user data to be passed to the callback.")
}

val VkPipelineRasterizationStateRasterizationOrderAMD = struct(Module.VULKAN, "VkPipelineRasterizationStateRasterizationOrderAMD") {
    documentation =
        """
        Structure defining rasterization order for a graphics pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD</li>
            <li>{@code rasterizationOrder} <b>must</b> be a valid {@code VkRasterizationOrderAMD} value</li>
        </ul>

        If the {@link AMDRasterizationOrder VK_AMD_rasterization_order} device extension is not enabled or the application does not request a particular rasterization order through specifying a ##VkPipelineRasterizationStateRasterizationOrderAMD structure then the rasterization order used by the graphics pipeline defaults to #RASTERIZATION_ORDER_STRICT_AMD.
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkRasterizationOrderAMD("rasterizationOrder", "a {@code VkRasterizationOrderAMD} value specifying the primitive rasterization order to use.")
}

val VkDebugMarkerObjectNameInfoEXT = struct(Module.VULKAN, "VkDebugMarkerObjectNameInfoEXT") {
    documentation =
        """
        Specify parameters of a name to give to an object.

        <h5>Description</h5>
        Applications <b>may</b> change the name associated with an object simply by calling {@code vkDebugMarkerSetObjectNameEXT} again with a new string. To remove a previously set name, {@code pObjectName} <b>should</b> be set to an empty string.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code objectType} <b>must</b> not be #DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT</li>
            <li>{@code object} <b>must</b> not be #NULL_HANDLE</li>
            <li>{@code object} <b>must</b> be a Vulkan object of the type associated with {@code objectType} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#debug-report-object-types">{@code VkDebugReportObjectTypeEXT} and Vulkan Handle Relationship</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
            <li>{@code pObjectName} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>

        <h5>See Also</h5>
        #DebugMarkerSetObjectNameEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDebugReportObjectTypeEXT("objectType", "a {@code VkDebugReportObjectTypeEXT} specifying the type of the object to be named.")
    uint64_t("object", "the object to be named.")
    charUTF8.const.p("pObjectName", "a null-terminated UTF-8 string specifying the name to apply to {@code object}.")
}

val VkDebugMarkerObjectTagInfoEXT = struct(Module.VULKAN, "VkDebugMarkerObjectTagInfoEXT") {
    documentation =
        """
        Specify parameters of a tag to attach to an object.

        <h5>Description</h5>
        The {@code tagName} parameter gives a name or identifier to the type of data being tagged. This can be used by debugging layers to easily filter for only data that can be used by that implementation.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code objectType} <b>must</b> not be #DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT</li>
            <li>{@code object} <b>must</b> not be #NULL_HANDLE</li>
            <li>{@code object} <b>must</b> be a Vulkan object of the type associated with {@code objectType} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#debug-report-object-types">{@code VkDebugReportObjectTypeEXT} and Vulkan Handle Relationship</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
            <li>{@code pTag} <b>must</b> be a valid pointer to an array of {@code tagSize} bytes</li>
            <li>{@code tagSize} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        #DebugMarkerSetObjectTagEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDebugReportObjectTypeEXT("objectType", "a {@code VkDebugReportObjectTypeEXT} specifying the type of the object to be named.")
    uint64_t("object", "the object to be tagged.")
    uint64_t("tagName", "a numerical identifier of the tag.")
    AutoSize("pTag")..size_t("tagSize", "the number of bytes of data to attach to the object.")
    void.const.p("pTag", "a pointer to an array of {@code tagSize} bytes containing the data to be associated with the object.")
}

val VkDebugMarkerMarkerInfoEXT = struct(Module.VULKAN, "VkDebugMarkerMarkerInfoEXT") {
    documentation =
        """
        Specify parameters of a command buffer marker region.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code pMarkerName} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>

        <h5>See Also</h5>
        #CmdDebugMarkerBeginEXT(), #CmdDebugMarkerInsertEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    charUTF8.const.p("pMarkerName", "a pointer to a null-terminated UTF-8 string containing the name of the marker.")
    float("color", "an optional: RGBA color value that can be associated with the marker. A particular implementation <b>may</b> choose to ignore this color value. The values contain RGBA values in order, in the range 0.0 to 1.0. If all elements in {@code color} are set to 0.0 then it is ignored.")[4]
}

val VkDedicatedAllocationImageCreateInfoNV = struct(Module.VULKAN, "VkDedicatedAllocationImageCreateInfoNV") {
    documentation =
        """
        Specify that an image is bound to a dedicated memory resource.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Using a dedicated allocation for color and depth/stencil attachments or other large images <b>may</b> improve performance on some devices.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code dedicatedAllocation} is #TRUE, ##VkImageCreateInfo{@code ::flags} <b>must</b> not include #IMAGE_CREATE_SPARSE_BINDING_BIT, #IMAGE_CREATE_SPARSE_RESIDENCY_BIT, or #IMAGE_CREATE_SPARSE_ALIASED_BIT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("dedicatedAllocation", "specifies whether the image will have a dedicated allocation bound to it.")
}

val VkDedicatedAllocationBufferCreateInfoNV = struct(Module.VULKAN, "VkDedicatedAllocationBufferCreateInfoNV") {
    documentation =
        """
        Specify that a buffer is bound to a dedicated memory resource.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("dedicatedAllocation", "specifies whether the buffer will have a dedicated allocation bound to it.")
}

val VkDedicatedAllocationMemoryAllocateInfoNV = struct(Module.VULKAN, "VkDedicatedAllocationMemoryAllocateInfoNV") {
    documentation =
        """
        Specify a dedicated memory allocation resource.

        <h5>Valid Usage</h5>
        <ul>
            <li>At least one of {@code image} and {@code buffer} <b>must</b> be #NULL_HANDLE</li>
            <li>If {@code image} is not #NULL_HANDLE, the image <b>must</b> have been created with ##VkDedicatedAllocationImageCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE</li>
            <li>If {@code buffer} is not #NULL_HANDLE, the buffer <b>must</b> have been created with ##VkDedicatedAllocationBufferCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE</li>
            <li>If {@code image} is not #NULL_HANDLE, ##VkMemoryAllocateInfo{@code ::allocationSize} <b>must</b> equal the ##VkMemoryRequirements{@code ::size} of the image</li>
            <li>If {@code buffer} is not #NULL_HANDLE, ##VkMemoryAllocateInfo{@code ::allocationSize} <b>must</b> equal the ##VkMemoryRequirements{@code ::size} of the buffer</li>
            <li>If {@code image} is not #NULL_HANDLE and ##VkMemoryAllocateInfo defines a memory import operation, the memory being imported <b>must</b> also be a dedicated image allocation and {@code image} <b>must</b> be identical to the image associated with the imported memory</li>
            <li>If {@code buffer} is not #NULL_HANDLE and ##VkMemoryAllocateInfo defines a memory import operation, the memory being imported <b>must</b> also be a dedicated buffer allocation and {@code buffer} <b>must</b> be identical to the buffer associated with the imported memory</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV</li>
            <li>If {@code image} is not #NULL_HANDLE, {@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>If {@code buffer} is not #NULL_HANDLE, {@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>Both of {@code buffer}, and {@code image} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkImage("image", "#NULL_HANDLE or a handle of an image which this memory will be bound to.")
    VkBuffer("buffer", "#NULL_HANDLE or a handle of a buffer which this memory will be bound to.")
}

val VkPhysicalDeviceTransformFeedbackFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceTransformFeedbackFeaturesEXT") {
    documentation =
        """
        Structure describing transform feedback features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceTransformFeedbackFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceTransformFeedbackFeaturesEXT <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("transformFeedback", "indicates whether the implementation supports transform feedback and shader modules <b>can</b> declare the {@code TransformFeedback} capability.")
    VkBool32("geometryStreams", "indicates whether the implementation supports the {@code GeometryStreams} SPIR-V capability.")
}

val VkPhysicalDeviceTransformFeedbackPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceTransformFeedbackPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing transform feedback properties that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceTransformFeedbackPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits and properties.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("maxTransformFeedbackStreams", "the maximum number of vertex streams that can be output from geometry shaders declared with the {@code GeometryStreams} capability. If the implementation does not support ##VkPhysicalDeviceTransformFeedbackFeaturesEXT{@code ::geometryStreams} then {@code maxTransformFeedbackStreams} <b>must</b> be set to 1.")
    uint32_t("maxTransformFeedbackBuffers", "the maximum number of transform feedback buffers that can be bound for capturing shader outputs from the last vertex processing stage.")
    VkDeviceSize("maxTransformFeedbackBufferSize", "the maximum size that can be specified when binding a buffer for transform feedback in #CmdBindTransformFeedbackBuffersEXT().")
    uint32_t("maxTransformFeedbackStreamDataSize", "the maximum amount of data in bytes for each vertex that captured to one or more transform feedback buffers associated with a specific vertex stream.")
    uint32_t("maxTransformFeedbackBufferDataSize", "the maximum amount of data in bytes for each vertex that can be captured to a specific transform feedback buffer.")
    uint32_t("maxTransformFeedbackBufferDataStride", "the maximum stride between each capture of vertex data to the buffer.")
    VkBool32("transformFeedbackQueries", "true if the implementation supports the #QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT query type. {@code transformFeedbackQueries} is false if queries of this type <b>cannot</b> be created.")
    VkBool32("transformFeedbackStreamsLinesTriangles", "true if the implementation supports the geometry shader {@code OpExecutionMode} of {@code OutputLineStrip} and {@code OutputTriangleStrip} in addition to {@code OutputPoints} when more than one vertex stream is output. If {@code transformFeedbackStreamsLinesTriangles} is false the implementation only supports an {@code OpExecutionMode} of {@code OutputPoints} when more than one vertex stream is output from the geometry shader.")
    VkBool32("transformFeedbackRasterizationStreamSelect", "true if the implementation supports the {@code GeometryStreams} SPIR-V capability and the application can use ##VkPipelineRasterizationStateStreamCreateInfoEXT to modify which vertex stream output is used for rasterization. Otherwise vertex stream 0 <b>must</b> always be used for rasterization.")
    VkBool32("transformFeedbackDraw", "true if the implementation supports the #CmdDrawIndirectByteCountEXT() function otherwise the function <b>must</b> not be called.")
}

val VkPipelineRasterizationStateStreamCreateInfoEXT = struct(Module.VULKAN, "VkPipelineRasterizationStateStreamCreateInfoEXT") {
    documentation =
        """
        Structure defining the geometry stream used for rasterization.

        <h5>Description</h5>
        If this structure is not present, {@code rasterizationStream} is assumed to be zero.

        <h5>Valid Usage</h5>
        <ul>
            <li>##VkPhysicalDeviceTransformFeedbackFeaturesEXT{@code ::geometryStreams} <b>must</b> be enabled</li>
            <li>{@code rasterizationStream} <b>must</b> be less than ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::maxTransformFeedbackStreams}</li>
            <li>{@code rasterizationStream} <b>must</b> be zero if ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::transformFeedbackRasterizationStreamSelect} is #FALSE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineRasterizationStateStreamCreateFlagsEXT("flags", "reserved for future use.")
    uint32_t("rasterizationStream", "the vertex stream selected for rasterization.")
}

val VkImageViewHandleInfoNVX = struct(Module.VULKAN, "VkImageViewHandleInfoNVX") {
    documentation =
        """
        Structure specifying the image view for handle queries.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code descriptorType} <b>must</b> be #DESCRIPTOR_TYPE_SAMPLED_IMAGE, #DESCRIPTOR_TYPE_STORAGE_IMAGE, or #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER</li>
            <li>{@code sampler} <b>must</b> be a valid {@code VkSampler} if {@code descriptorType} is #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER</li>
            <li>If descriptorType is #DESCRIPTOR_TYPE_SAMPLED_IMAGE or #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, the image that {@code imageView} was created from <b>must</b> have been created with the #IMAGE_USAGE_SAMPLED_BIT usage bit set</li>
            <li>If descriptorType is #DESCRIPTOR_TYPE_STORAGE_IMAGE, the image that {@code imageView} was created from <b>must</b> have been created with the #IMAGE_USAGE_STORAGE_BIT usage bit set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
            <li>{@code descriptorType} <b>must</b> be a valid {@code VkDescriptorType} value</li>
            <li>If {@code sampler} is not #NULL_HANDLE, {@code sampler} <b>must</b> be a valid {@code VkSampler} handle</li>
            <li>Both of {@code imageView}, and {@code sampler} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        #GetImageViewHandleNVX()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkImageView("imageView", "the image view to query.")
    VkDescriptorType("descriptorType", "the type of descriptor for which to query a handle.")
    VkSampler("sampler", "the sampler to combine with the image view when generating the handle.")
}

val VkImageViewAddressPropertiesNVX = struct(Module.VULKAN, "VkImageViewAddressPropertiesNVX", mutable = false) {
    documentation =
        """
        Structure specifying the image view for handle queries.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #GetImageViewAddressNVX()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkDeviceAddress("deviceAddress", "the device address of the image view.")
    VkDeviceSize("size", "the size in bytes of the image view device memory.")
}

val VkTextureLODGatherFormatPropertiesAMD = struct(Module.VULKAN, "VkTextureLODGatherFormatPropertiesAMD", mutable = false) {
    documentation =
        """
        Structure informing whether or not texture gather bias/LOD functionality is supported for a given image format and a given physical device.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL}.").mutable()
    VkBool32("supportsTextureGatherLODBiasAMD", "tells if the image format can be used with texture gather bias/LOD functions, as introduced by the {@code VK_AMD_texture_gather_bias_lod.html[VK_AMD_texture_gather_bias_lod]} extension. This field is set by the implementation. User-specified value is ignored.")
}

val VkShaderResourceUsageAMD = struct(Module.VULKAN, "VkShaderResourceUsageAMD", mutable = false) {
    documentation =
        """
        Resource usage information about a particular shader within a pipeline.
        """

    uint32_t("numUsedVgprs", "the number of vector instruction general-purpose registers used by this shader.")
    uint32_t("numUsedSgprs", "the number of scalar instruction general-purpose registers used by this shader.")
    uint32_t("ldsSizePerLocalWorkGroup", "the maximum local data store size per work group in bytes.")
    size_t("ldsUsageSizeInBytes", "the LDS usage size in bytes per work group by this shader.")
    size_t("scratchMemUsageInBytes", "the scratch memory usage in bytes by this shader.")
}

val VkShaderStatisticsInfoAMD = struct(Module.VULKAN, "VkShaderStatisticsInfoAMD", mutable = false) {
    documentation =
        """
        Statistical information about a particular shader within a pipeline.

        <h5>Description</h5>
        Some implementations may merge multiple logical shader stages together in a single shader. In such cases, {@code shaderStageMask} will contain a bitmask of all of the stages that are active within that shader. Consequently, if specifying those stages as input to #GetShaderInfoAMD(), the same output information <b>may</b> be returned for all such shader stage queries.

        The number of available VGPRs and SGPRs ({@code numAvailableVgprs} and {@code numAvailableSgprs} respectively) are the shader-addressable subset of physical registers that is given as a limit to the compiler for register assignment. These values <b>may</b> further be limited by implementations due to performance optimizations where register pressure is a bottleneck.

        <h5>See Also</h5>
        ##VkShaderResourceUsageAMD
        """

    VkShaderStageFlags("shaderStageMask", "are the combination of logical shader stages contained within this shader.")
    VkShaderResourceUsageAMD("resourceUsage", "a ##VkShaderResourceUsageAMD structure describing internal physical device resources used by this shader.")
    uint32_t("numPhysicalVgprs", "the maximum number of vector instruction general-purpose registers (VGPRs) available to the physical device.")
    uint32_t("numPhysicalSgprs", "the maximum number of scalar instruction general-purpose registers (SGPRs) available to the physical device.")
    uint32_t("numAvailableVgprs", "the maximum limit of VGPRs made available to the shader compiler.")
    uint32_t("numAvailableSgprs", "the maximum limit of SGPRs made available to the shader compiler.")
    uint32_t("computeWorkGroupSize", "the local workgroup size of this shader in { X, Y, Z } dimensions.")[3]
}

val VkPhysicalDeviceCornerSampledImageFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceCornerSampledImageFeaturesNV") {
    documentation =
        """
        Structure describing corner sampled image features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceCornerSampledImageFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceCornerSampledImageFeaturesNV <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_CORNER_SAMPLED_IMAGE_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("cornerSampledImage", "specifies whether images can be created with a ##VkImageCreateInfo{@code ::flags} containing #IMAGE_CREATE_CORNER_SAMPLED_BIT_NV. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#resources-images-corner-sampled\">Corner-Sampled Images</a>.")
}

val VkRenderPassMultiviewCreateInfoKHR = struct(Module.VULKAN, "VkRenderPassMultiviewCreateInfoKHR", alias = VkRenderPassMultiviewCreateInfo) {
    documentation = "See ##VkRenderPassMultiviewCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    AutoSize("pViewMasks", optional = true)..uint32_t("subpassCount", "")
    uint32_t.const.p("pViewMasks", "")
    AutoSize("pViewOffsets", optional = true)..uint32_t("dependencyCount", "")
    int32_t.const.p("pViewOffsets", "")
    AutoSize("pCorrelationMasks", optional = true)..uint32_t("correlationMaskCount", "")
    uint32_t.const.p("pCorrelationMasks", "")
}

val VkPhysicalDeviceMultiviewFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMultiviewFeaturesKHR", alias = VkPhysicalDeviceMultiviewFeatures) {
    documentation = "See ##VkPhysicalDeviceMultiviewFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("multiview", "")
    VkBool32("multiviewGeometryShader", "")
    VkBool32("multiviewTessellationShader", "")
}

val VkPhysicalDeviceMultiviewPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMultiviewPropertiesKHR", mutable = false, alias = VkPhysicalDeviceMultiviewProperties) {
    documentation = "See ##VkPhysicalDeviceMultiviewProperties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    uint32_t("maxMultiviewViewCount", "")
    uint32_t("maxMultiviewInstanceIndex", "")
}

val VkExternalImageFormatPropertiesNV = struct(Module.VULKAN, "VkExternalImageFormatPropertiesNV", mutable = false) {
    documentation =
        """
        Structure specifying external image format properties.
        """

    VkImageFormatProperties("imageFormatProperties", "will be filled in as when calling #GetPhysicalDeviceImageFormatProperties(), but the values returned <b>may</b> vary depending on the external handle type requested.")
    VkExternalMemoryFeatureFlagsNV("externalMemoryFeatures", "a bitmask of {@code VkExternalMemoryFeatureFlagBitsNV}, indicating properties of the external memory handle type (#GetPhysicalDeviceExternalImageFormatPropertiesNV(){@code ::externalHandleType}) being queried, or 0 if the external memory handle type is 0.")
    VkExternalMemoryHandleTypeFlagsNV("exportFromImportedHandleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} containing a bit set for every external handle type that <b>may</b> be used to create memory from which the handles of the type specified in #GetPhysicalDeviceExternalImageFormatPropertiesNV(){@code ::externalHandleType} <b>can</b> be exported, or 0 if the external memory handle type is 0.")
    VkExternalMemoryHandleTypeFlagsNV("compatibleHandleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} containing a bit set for every external handle type that <b>may</b> be specified simultaneously with the handle type specified by #GetPhysicalDeviceExternalImageFormatPropertiesNV(){@code ::externalHandleType} when calling #AllocateMemory(), or 0 if the external memory handle type is 0. {@code compatibleHandleTypes} will always contain #GetPhysicalDeviceExternalImageFormatPropertiesNV(){@code ::externalHandleType}")
}

val VkExternalMemoryImageCreateInfoNV = struct(Module.VULKAN, "VkExternalMemoryImageCreateInfoNV") {
    documentation =
        """
        Specify that an image may be backed by external memory.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV</li>
            <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkExternalMemoryHandleTypeFlagsNV("handleTypes", "zero, or a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} specifying one or more external memory handle types.")
}

val VkExportMemoryAllocateInfoNV = struct(Module.VULKAN, "VkExportMemoryAllocateInfoNV") {
    documentation =
        """
        Specify memory handle types that may be exported.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV</li>
            <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkExternalMemoryHandleTypeFlagsNV("handleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} specifying one or more memory handle types that <b>may</b> be exported. Multiple handle types <b>may</b> be requested for the same allocation as long as they are compatible, as reported by #GetPhysicalDeviceExternalImageFormatPropertiesNV().")
}

val VkImportMemoryWin32HandleInfoNV = struct(Module.VULKAN, "VkImportMemoryWin32HandleInfoNV") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        import Win32 memory created on the same physical device.

        <h5>Description</h5>
        If {@code handleType} is 0, this structure is ignored by consumers of the ##VkMemoryAllocateInfo structure it is chained from.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> not have more than one bit set</li>
            <li>{@code handle} <b>must</b> be a valid handle to memory, obtained as specified by {@code handleType}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV</li>
            <li>{@code handleType} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkExternalMemoryHandleTypeFlagsNV("handleType", "0 or a {@code VkExternalMemoryHandleTypeFlagBitsNV} value specifying the type of memory handle in {@code handle}.")
    HANDLE("handle", "a Windows {@code HANDLE} referring to the memory.")
}

val VkExportMemoryWin32HandleInfoNV = struct(Module.VULKAN, "VkExportMemoryWin32HandleInfoNV") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        specify security attributes and access rights for Win32 memory handles.

        <h5>Description</h5>
        If this structure is not present, or if {@code pAttributes} is set to {@code NULL}, default security descriptor values will be used, and child processes created by the application will not inherit the handle, as described in the MSDN documentation for "{@code Synchronization Object Security and Access Rights}"<sup>1</sup>. Further, if the structure is not present, the access rights will be

        {@code DXGI_SHARED_RESOURCE_READ} | {@code DXGI_SHARED_RESOURCE_WRITE}

        <dl>
            <dt>1</dt>
            <dd><a target="_blank" href="https://docs.microsoft.com/en-us/windows/win32/sync/synchronization-object-security-and-access-rights">https://docs.microsoft.com/en-us/windows/win32/sync/synchronization-object-security-and-access-rights</a></dd>
        </dl>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV</li>
            <li>If {@code pAttributes} is not {@code NULL}, {@code pAttributes} <b>must</b> be a valid pointer to a valid {@code SECURITY_ATTRIBUTES} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    nullable..SECURITY_ATTRIBUTES.const.p("pAttributes", "a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.")
    DWORD("dwAccess", "a {@code DWORD} specifying access rights of the handle.")
}

val VkWin32KeyedMutexAcquireReleaseInfoNV = struct(Module.VULKAN, "VkWin32KeyedMutexAcquireReleaseInfoNV") {
    documentation =
        """
        use Windows keyex mutex mechanism to synchronize work.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV</li>
            <li>If {@code acquireCount} is not 0, {@code pAcquireSyncs} <b>must</b> be a valid pointer to an array of {@code acquireCount} valid {@code VkDeviceMemory} handles</li>
            <li>If {@code acquireCount} is not 0, {@code pAcquireKeys} <b>must</b> be a valid pointer to an array of {@code acquireCount} {@code uint64_t} values</li>
            <li>If {@code acquireCount} is not 0, {@code pAcquireTimeoutMilliseconds} <b>must</b> be a valid pointer to an array of {@code acquireCount} {@code uint32_t} values</li>
            <li>If {@code releaseCount} is not 0, {@code pReleaseSyncs} <b>must</b> be a valid pointer to an array of {@code releaseCount} valid {@code VkDeviceMemory} handles</li>
            <li>If {@code releaseCount} is not 0, {@code pReleaseKeys} <b>must</b> be a valid pointer to an array of {@code releaseCount} {@code uint64_t} values</li>
            <li>Both of the elements of {@code pAcquireSyncs}, and the elements of {@code pReleaseSyncs} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    AutoSize("pAcquireSyncs", "pAcquireKeys", "pAcquireTimeoutMilliseconds", optional = true)..uint32_t("acquireCount", "the number of entries in the {@code pAcquireSyncs}, {@code pAcquireKeys}, and {@code pAcquireTimeoutMilliseconds} arrays.")
    VkDeviceMemory.const.p("pAcquireSyncs", "a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources.")
    uint64_t.const.p("pAcquireKeys", "a pointer to an array of mutex key values to wait for prior to beginning the submitted work. Entries refer to the keyed mutex associated with the corresponding entries in {@code pAcquireSyncs}.")
    uint32_t.const.p("pAcquireTimeoutMilliseconds", "a pointer to an array of timeout values, in millisecond units, for each acquire specified in {@code pAcquireKeys}.")
    AutoSize("pReleaseSyncs", "pReleaseKeys", optional = true)..uint32_t("releaseCount", "the number of entries in the {@code pReleaseSyncs} and {@code pReleaseKeys} arrays.")
    VkDeviceMemory.const.p("pReleaseSyncs", "a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources.")
    uint64_t.const.p("pReleaseKeys", "a pointer to an array of mutex key values to set when the submitted work has completed. Entries refer to the keyed mutex associated with the corresponding entries in {@code pReleaseSyncs}.")
}

val VkPhysicalDeviceFeatures2KHR = struct(Module.VULKAN, "VkPhysicalDeviceFeatures2KHR", alias = VkPhysicalDeviceFeatures2) {
    documentation = "See ##VkPhysicalDeviceFeatures2."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkPhysicalDeviceFeatures("features", "")
}

val VkPhysicalDeviceProperties2KHR = struct(Module.VULKAN, "VkPhysicalDeviceProperties2KHR", mutable = false, alias = VkPhysicalDeviceProperties2) {
    documentation = "See ##VkPhysicalDeviceProperties2."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkPhysicalDeviceProperties("properties", "")
}

val VkFormatProperties2KHR = struct(Module.VULKAN, "VkFormatProperties2KHR", mutable = false, alias = VkFormatProperties2) {
    documentation = "See ##VkFormatProperties2."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkFormatProperties("formatProperties", "")
}

val VkImageFormatProperties2KHR = struct(Module.VULKAN, "VkImageFormatProperties2KHR", mutable = false, alias = VkImageFormatProperties2) {
    documentation = "See ##VkImageFormatProperties2."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkImageFormatProperties("imageFormatProperties", "")
}

val VkPhysicalDeviceImageFormatInfo2KHR = struct(Module.VULKAN, "VkPhysicalDeviceImageFormatInfo2KHR", alias = VkPhysicalDeviceImageFormatInfo2) {
    documentation = "See ##VkPhysicalDeviceImageFormatInfo2."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkFormat("format", "")
    VkImageType("type", "")
    VkImageTiling("tiling", "")
    VkImageUsageFlags("usage", "")
    VkImageCreateFlags("flags", "")
}

val VkQueueFamilyProperties2KHR = struct(Module.VULKAN, "VkQueueFamilyProperties2KHR", mutable = false, alias = VkQueueFamilyProperties2) {
    documentation = "See ##VkQueueFamilyProperties2."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkQueueFamilyProperties("queueFamilyProperties", "")
}

val VkPhysicalDeviceMemoryProperties2KHR = struct(Module.VULKAN, "VkPhysicalDeviceMemoryProperties2KHR", mutable = false, alias = VkPhysicalDeviceMemoryProperties2) {
    documentation = "See ##VkPhysicalDeviceMemoryProperties2."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkPhysicalDeviceMemoryProperties("memoryProperties", "")
}

val VkSparseImageFormatProperties2KHR = struct(Module.VULKAN, "VkSparseImageFormatProperties2KHR", mutable = false, alias = VkSparseImageFormatProperties2) {
    documentation = "See ##VkSparseImageFormatProperties2."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkSparseImageFormatProperties("properties", "")
}

val VkPhysicalDeviceSparseImageFormatInfo2KHR = struct(Module.VULKAN, "VkPhysicalDeviceSparseImageFormatInfo2KHR", alias = VkPhysicalDeviceSparseImageFormatInfo2) {
    documentation = "See ##VkPhysicalDeviceSparseImageFormatInfo2."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkFormat("format", "")
    VkImageType("type", "")
    VkSampleCountFlagBits("samples", "")
    VkImageUsageFlags("usage", "")
    VkImageTiling("tiling", "")
}

val VkMemoryAllocateFlagsInfoKHR = struct(Module.VULKAN, "VkMemoryAllocateFlagsInfoKHR", alias = VkMemoryAllocateFlagsInfo) {
    documentation = "See ##VkMemoryAllocateFlagsInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkMemoryAllocateFlags("flags", "")
    uint32_t("deviceMask", "")
}

val VkDeviceGroupRenderPassBeginInfoKHR = struct(Module.VULKAN, "VkDeviceGroupRenderPassBeginInfoKHR", alias = VkDeviceGroupRenderPassBeginInfo) {
    documentation = "See ##VkDeviceGroupRenderPassBeginInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    uint32_t("deviceMask", "")
    AutoSize("pDeviceRenderAreas", optional = true)..uint32_t("deviceRenderAreaCount", "")
    VkRect2D.const.p("pDeviceRenderAreas", "")
}

val VkDeviceGroupCommandBufferBeginInfoKHR = struct(Module.VULKAN, "VkDeviceGroupCommandBufferBeginInfoKHR", alias = VkDeviceGroupCommandBufferBeginInfo) {
    documentation = "See ##VkDeviceGroupCommandBufferBeginInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    uint32_t("deviceMask", "")
}

val VkDeviceGroupSubmitInfoKHR = struct(Module.VULKAN, "VkDeviceGroupSubmitInfoKHR", alias = VkDeviceGroupSubmitInfo) {
    documentation = "See ##VkDeviceGroupSubmitInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    AutoSize("pWaitSemaphoreDeviceIndices", optional = true)..uint32_t("waitSemaphoreCount", "")
    uint32_t.const.p("pWaitSemaphoreDeviceIndices", "")
    AutoSize("pCommandBufferDeviceMasks", optional = true)..uint32_t("commandBufferCount", "")
    uint32_t.const.p("pCommandBufferDeviceMasks", "")
    AutoSize("pSignalSemaphoreDeviceIndices", optional = true)..uint32_t("signalSemaphoreCount", "")
    uint32_t.const.p("pSignalSemaphoreDeviceIndices", "")
}

val VkDeviceGroupBindSparseInfoKHR = struct(Module.VULKAN, "VkDeviceGroupBindSparseInfoKHR", alias = VkDeviceGroupBindSparseInfo) {
    documentation = "See ##VkDeviceGroupBindSparseInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    uint32_t("resourceDeviceIndex", "")
    uint32_t("memoryDeviceIndex", "")
}

val VkBindBufferMemoryDeviceGroupInfoKHR = struct(Module.VULKAN, "VkBindBufferMemoryDeviceGroupInfoKHR", alias = VkBindBufferMemoryDeviceGroupInfo) {
    documentation = "See ##VkBindBufferMemoryDeviceGroupInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    AutoSize("pDeviceIndices", optional = true)..uint32_t("deviceIndexCount", "")
    uint32_t.const.p("pDeviceIndices", "")
}

val VkBindImageMemoryDeviceGroupInfoKHR = struct(Module.VULKAN, "VkBindImageMemoryDeviceGroupInfoKHR", alias = VkBindImageMemoryDeviceGroupInfo) {
    documentation = "See ##VkBindImageMemoryDeviceGroupInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    AutoSize("pDeviceIndices", optional = true)..uint32_t("deviceIndexCount", "")
    uint32_t.const.p("pDeviceIndices", "")
    AutoSize("pSplitInstanceBindRegions", optional = true)..uint32_t("splitInstanceBindRegionCount", "")
    VkRect2D.const.p("pSplitInstanceBindRegions", "")
}

val VkValidationFlagsEXT = struct(Module.VULKAN, "VkValidationFlagsEXT") {
    documentation =
        """
        Specify validation checks to disable for a Vulkan instance.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_VALIDATION_FLAGS_EXT</li>
            <li>{@code pDisabledValidationChecks} <b>must</b> be a valid pointer to an array of {@code disabledValidationCheckCount} valid {@code VkValidationCheckEXT} values</li>
            <li>{@code disabledValidationCheckCount} <b>must</b> be greater than 0</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pDisabledValidationChecks")..uint32_t("disabledValidationCheckCount", "the number of checks to disable.")
    VkValidationCheckEXT.const.p("pDisabledValidationChecks", "a pointer to an array of {@code VkValidationCheckEXT} values specifying the validation checks to be disabled.")
}

val VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT") {
    documentation =
        """
        Structure describing ASTC HDR features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT <b>can</b> also be included in the {@code pNext} chain of #CreateDevice() to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("textureCompressionASTC_HDR", """indicates whether all of the ASTC HDR compressed texture formats are supported. If this feature is enabled, then the #FORMAT_FEATURE_SAMPLED_IMAGE_BIT, #FORMAT_FEATURE_BLIT_SRC_BIT and #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT features <b>must</b> be supported in {@code optimalTilingFeatures} for the following formats:

        <ul>
            <li>#FORMAT_ASTC_4x4_SFLOAT_BLOCK_EXT</li>
            <li>#FORMAT_ASTC_5x4_SFLOAT_BLOCK_EXT</li>
            <li>#FORMAT_ASTC_5x5_SFLOAT_BLOCK_EXT</li>
            <li>#FORMAT_ASTC_6x5_SFLOAT_BLOCK_EXT</li>
            <li>#FORMAT_ASTC_6x6_SFLOAT_BLOCK_EXT</li>
            <li>#FORMAT_ASTC_8x5_SFLOAT_BLOCK_EXT</li>
            <li>#FORMAT_ASTC_8x6_SFLOAT_BLOCK_EXT</li>
            <li>#FORMAT_ASTC_8x8_SFLOAT_BLOCK_EXT</li>
            <li>#FORMAT_ASTC_10x5_SFLOAT_BLOCK_EXT</li>
            <li>#FORMAT_ASTC_10x6_SFLOAT_BLOCK_EXT</li>
            <li>#FORMAT_ASTC_10x8_SFLOAT_BLOCK_EXT</li>
            <li>#FORMAT_ASTC_10x10_SFLOAT_BLOCK_EXT</li>
            <li>#FORMAT_ASTC_12x10_SFLOAT_BLOCK_EXT</li>
            <li>#FORMAT_ASTC_12x12_SFLOAT_BLOCK_EXT</li>
        </ul>

        To query for additional properties, or if the feature is not enabled, #GetPhysicalDeviceFormatProperties() and #GetPhysicalDeviceImageFormatProperties() <b>can</b> be used to check for supported properties of individual formats as normal.""")
}

val VkImageViewASTCDecodeModeEXT = struct(Module.VULKAN, "VkImageViewASTCDecodeModeEXT") {
    documentation =
        """
        Structure describing the ASTC decode mode for an image view.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code decodeMode} <b>must</b> be one of #FORMAT_R16G16B16A16_SFLOAT, #FORMAT_R8G8B8A8_UNORM, or #FORMAT_E5B9G9R9_UFLOAT_PACK32</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-astc-decodeModeSharedExponent">{@code decodeModeSharedExponent}</a> feature is not enabled, {@code decodeMode} <b>must</b> not be #FORMAT_E5B9G9R9_UFLOAT_PACK32</li>
            <li>If {@code decodeMode} is #FORMAT_R8G8B8A8_UNORM the image view <b>must</b> not include blocks using any of the ASTC HDR modes</li>
            <li>{@code format} of the image view <b>must</b> be one of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#appendix-compressedtex-astc">ASTC Compressed Image Formats</a></li>
        </ul>

        If {@code format} uses sRGB encoding then the {@code decodeMode} has no effect.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT</li>
            <li>{@code decodeMode} <b>must</b> be a valid {@code VkFormat} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkFormat("decodeMode", "the intermediate format used to decode ASTC compressed formats.")
}

val VkPhysicalDeviceASTCDecodeFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceASTCDecodeFeaturesEXT") {
    documentation =
        """
        Structure describing ASTC decode mode features.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceASTCDecodeFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceASTCDecodeFeaturesEXT <b>can</b> also be included in the {@code pNext} chain of #CreateDevice() to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_ASTC_DECODE_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("decodeModeSharedExponent", "indicates whether the implementation supports decoding ASTC compressed formats to #FORMAT_E5B9G9R9_UFLOAT_PACK32 internal precision.")
}

val VkPhysicalDeviceGroupPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceGroupPropertiesKHR", mutable = false, alias = VkPhysicalDeviceGroupProperties) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation = "See ##VkPhysicalDeviceGroupProperties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    uint32_t("physicalDeviceCount", "")
    VkPhysicalDevice("physicalDevices", "")["VK_MAX_DEVICE_GROUP_SIZE"]
    VkBool32("subsetAllocation", "")
}

val VkDeviceGroupDeviceCreateInfoKHR = struct(Module.VULKAN, "VkDeviceGroupDeviceCreateInfoKHR", alias = VkDeviceGroupDeviceCreateInfo) {
    documentation = "See ##VkDeviceGroupDeviceCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    AutoSize("pPhysicalDevices", optional = true)..uint32_t("physicalDeviceCount", "")
    VkPhysicalDevice.const.p("pPhysicalDevices", "")
}

val VkExternalMemoryPropertiesKHR = struct(Module.VULKAN, "VkExternalMemoryPropertiesKHR", mutable = false, alias = VkExternalMemoryProperties) {
    documentation = "See ##VkExternalMemoryProperties."

    VkExternalMemoryFeatureFlags("externalMemoryFeatures", "")
    VkExternalMemoryHandleTypeFlags("exportFromImportedHandleTypes", "")
    VkExternalMemoryHandleTypeFlags("compatibleHandleTypes", "")
}

val VkPhysicalDeviceExternalImageFormatInfoKHR = struct(Module.VULKAN, "VkPhysicalDeviceExternalImageFormatInfoKHR", alias = VkPhysicalDeviceExternalImageFormatInfo) {
    documentation = "See ##VkPhysicalDeviceExternalImageFormatInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkExternalMemoryHandleTypeFlagBits("handleType", "")
}

val VkExternalImageFormatPropertiesKHR = struct(Module.VULKAN, "VkExternalImageFormatPropertiesKHR", mutable = false, alias = VkExternalImageFormatProperties) {
    documentation = "See ##VkExternalImageFormatProperties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkExternalMemoryProperties("externalMemoryProperties", "")
}

val VkPhysicalDeviceExternalBufferInfoKHR = struct(Module.VULKAN, "VkPhysicalDeviceExternalBufferInfoKHR", alias = VkPhysicalDeviceExternalBufferInfo) {
    documentation = "See ##VkPhysicalDeviceExternalBufferInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkBufferCreateFlags("flags", "")
    VkBufferUsageFlags("usage", "")
    VkExternalMemoryHandleTypeFlagBits("handleType", "")
}

val VkExternalBufferPropertiesKHR = struct(Module.VULKAN, "VkExternalBufferPropertiesKHR", mutable = false, alias = VkExternalBufferProperties) {
    documentation = "See ##VkExternalBufferProperties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkExternalMemoryProperties("externalMemoryProperties", "")
}

val VkPhysicalDeviceIDPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceIDPropertiesKHR", mutable = false, alias = VkPhysicalDeviceIDProperties) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation = "See ##VkPhysicalDeviceIDProperties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    uint8_t("deviceUUID", "")["VK_UUID_SIZE"]
    uint8_t("driverUUID", "")["VK_UUID_SIZE"]
    uint8_t("deviceLUID", "")["VK_LUID_SIZE"]
    uint32_t("deviceNodeMask", "")
    VkBool32("deviceLUIDValid", "")
}

val VkExternalMemoryImageCreateInfoKHR = struct(Module.VULKAN, "VkExternalMemoryImageCreateInfoKHR", alias = VkExternalMemoryImageCreateInfo) {
    documentation = "See ##VkExternalMemoryImageCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkExternalMemoryHandleTypeFlags("handleTypes", "")
}

val VkExternalMemoryBufferCreateInfoKHR = struct(Module.VULKAN, "VkExternalMemoryBufferCreateInfoKHR", alias = VkExternalMemoryBufferCreateInfo) {
    documentation = "See ##VkExternalMemoryBufferCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkExternalMemoryHandleTypeFlags("handleTypes", "")
}

val VkExportMemoryAllocateInfoKHR = struct(Module.VULKAN, "VkExportMemoryAllocateInfoKHR", alias = VkExportMemoryAllocateInfo) {
    documentation = "See ##VkExportMemoryAllocateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkExternalMemoryHandleTypeFlags("handleTypes", "")
}

val VkImportMemoryWin32HandleInfoKHR = struct(Module.VULKAN, "VkImportMemoryWin32HandleInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        import Win32 memory created on the same physical device.

        <h5>Description</h5>
        Importing memory object payloads from Windows handles does not transfer ownership of the handle to the Vulkan implementation. For handle types defined as NT handles, the application <b>must</b> release handle ownership using the {@code CloseHandle} system call when the handle is no longer needed. For handle types defined as NT handles, the imported memory object holds a reference to its payload.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Non-NT handle import operations do not add a reference to their associated payload. If the original object owning the payload is destroyed, all resources and handles sharing that payload will become invalid.
        </div>

        Applications <b>can</b> import the same payload into multiple instances of Vulkan, into the same instance from which it was exported, and multiple times into a given Vulkan instance. In all cases, each import operation <b>must</b> create a distinct {@code VkDeviceMemory} object.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code handleType} is not 0, it <b>must</b> be supported for import, as reported by ##VkExternalImageFormatProperties or ##VkExternalBufferProperties</li>
            <li>The memory from which {@code handle} was exported, or the memory named by {@code name} <b>must</b> have been created on the same underlying physical device as {@code device}</li>
            <li>If {@code handleType} is not 0, it <b>must</b> be defined as an NT handle or a global share handle</li>
            <li>If {@code handleType} is not #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT, #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT, #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT, or #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT, {@code name} <b>must</b> be {@code NULL}</li>
            <li>If {@code handleType} is not 0 and {@code handle} is {@code NULL}, {@code name} <b>must</b> name a valid memory resource of the type specified by {@code handleType}</li>
            <li>If {@code handleType} is not 0 and {@code name} is {@code NULL}, {@code handle} <b>must</b> be a valid handle of the type specified by {@code handleType}</li>
            <li>if {@code handle} is not {@code NULL}, {@code name} <b>must</b> be {@code NULL}</li>
            <li>If {@code handle} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#external-memory-handle-types-compatibility">external memory handle types compatibility</a></li>
            <li>If {@code name} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#external-memory-handle-types-compatibility">external memory handle types compatibility</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR</li>
            <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkExternalMemoryHandleTypeFlagBits("handleType", "specifies the type of {@code handle} or {@code name}.")
    HANDLE("handle", "the external handle to import, or {@code NULL}.")
    LPCWSTR("name", "a null-terminated UTF-16 string naming the payload to import, or {@code NULL}.")
}

val VkExportMemoryWin32HandleInfoKHR = struct(Module.VULKAN, "VkExportMemoryWin32HandleInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        Structure specifying additional attributes of Windows handles exported from a memory.

        <h5>Description</h5>
        If ##VkExportMemoryAllocateInfo is not present in the same {@code pNext} chain, this structure is ignored.

        If ##VkExportMemoryAllocateInfo is present in the {@code pNext} chain of ##VkMemoryAllocateInfo with a Windows {@code handleType}, but either ##VkExportMemoryWin32HandleInfoKHR is not present in the {@code pNext} chain, or if it is but {@code pAttributes} is set to {@code NULL}, default security descriptor values will be used, and child processes created by the application will not inherit the handle, as described in the MSDN documentation for "{@code Synchronization Object Security and Access Rights}"<sup>1</sup>. Further, if the structure is not present, the access rights used depend on the handle type.

        For handles of the following types:

        #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT

        The implementation <b>must</b> ensure the access rights allow read and write access to the memory.

        For handles of the following types:

        #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT

        The access rights <b>must</b> be:

        {@code GENERIC_ALL}

        <dl>
            <dt>1</dt>
            <dd><a target="_blank" href="https://docs.microsoft.com/en-us/windows/win32/sync/synchronization-object-security-and-access-rights">https://docs.microsoft.com/en-us/windows/win32/sync/synchronization-object-security-and-access-rights</a></dd>
        </dl>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkExportMemoryAllocateInfo{@code ::handleTypes} does not include #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT, #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT, #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT, or #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT, a ##VkExportMemoryWin32HandleInfoKHR structure <b>must</b> not be included in the {@code pNext} chain of ##VkMemoryAllocateInfo</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR</li>
            <li>If {@code pAttributes} is not {@code NULL}, {@code pAttributes} <b>must</b> be a valid pointer to a valid {@code SECURITY_ATTRIBUTES} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    nullable..SECURITY_ATTRIBUTES.const.p("pAttributes", "a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.")
    DWORD("dwAccess", "a {@code DWORD} specifying access rights of the handle.")
    LPCWSTR("name", "a null-terminated UTF-16 string to associate with the payload referenced by NT handles exported from the created memory.")
}

val VkMemoryWin32HandlePropertiesKHR = struct(Module.VULKAN, "VkMemoryWin32HandlePropertiesKHR", mutable = false) {
    documentation =
        """
        Properties of External Memory Windows Handles.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #GetMemoryWin32HandlePropertiesKHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("memoryTypeBits", "a bitmask containing one bit set for every memory type which the specified windows handle <b>can</b> be imported as.")
}

val VkMemoryGetWin32HandleInfoKHR = struct(Module.VULKAN, "VkMemoryGetWin32HandleInfoKHR") {
    documentation =
        """
        Structure describing a Win32 handle semaphore export operation.

        <h5>Description</h5>
        The properties of the handle returned depend on the value of {@code handleType}. See {@code VkExternalMemoryHandleTypeFlagBits} for a description of the properties of the defined external memory handle types.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> have been included in ##VkExportMemoryAllocateInfo{@code ::handleTypes} when {@code memory} was created</li>
            <li>If {@code handleType} is defined as an NT handle, #GetMemoryWin32HandleKHR() <b>must</b> be called no more than once for each valid unique combination of {@code memory} and {@code handleType}</li>
            <li>{@code handleType} <b>must</b> be defined as an NT handle or a global share handle</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
        </ul>

        <h5>See Also</h5>
        #GetMemoryWin32HandleKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDeviceMemory("memory", "the memory object from which the handle will be exported.")
    VkExternalMemoryHandleTypeFlagBits("handleType", "the type of handle requested.")
}

val VkImportMemoryFdInfoKHR = struct(Module.VULKAN, "VkImportMemoryFdInfoKHR") {
    documentation =
        """
        import memory created on the same physical device from a file descriptor.

        <h5>Description</h5>
        Importing memory from a file descriptor transfers ownership of the file descriptor from the application to the Vulkan implementation. The application <b>must</b> not perform any operations on the file descriptor after a successful import. The imported memory object holds a reference to its payload.

        Applications <b>can</b> import the same payload into multiple instances of Vulkan, into the same instance from which it was exported, and multiple times into a given Vulkan instance. In all cases, each import operation <b>must</b> create a distinct {@code VkDeviceMemory} object.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code handleType} is not 0, it <b>must</b> be supported for import, as reported by ##VkExternalImageFormatProperties or ##VkExternalBufferProperties</li>
            <li>The memory from which {@code fd} was exported <b>must</b> have been created on the same underlying physical device as {@code device}</li>
            <li>If {@code handleType} is not 0, it <b>must</b> be #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT.</li>
            <li>If {@code handleType} is not 0, {@code fd} <b>must</b> be a valid POSIX file descriptor handle.</li>
            <li>The memory represented by {@code fd} <b>must</b> have been created from a physical device and driver that is compatible with {@code device} and {@code handleType}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#external-memory-handle-types-compatibility">External memory handle types compatibility</a></li>
            <li>{@code fd} <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#external-memory-handle-types-compatibility">external memory handle types compatibility</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR</li>
            <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkExternalMemoryHandleTypeFlagBits("handleType", "specifies the handle type of {@code fd}.")
    int("fd", "the external handle to import.")
}

val VkMemoryFdPropertiesKHR = struct(Module.VULKAN, "VkMemoryFdPropertiesKHR", mutable = false) {
    documentation =
        """
        Properties of External Memory File Descriptors.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #GetMemoryFdPropertiesKHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("memoryTypeBits", "a bitmask containing one bit set for every memory type which the specified file descriptor <b>can</b> be imported as.")
}

val VkMemoryGetFdInfoKHR = struct(Module.VULKAN, "VkMemoryGetFdInfoKHR") {
    documentation =
        """
        Structure describing a POSIX FD semaphore export operation.

        <h5>Description</h5>
        The properties of the file descriptor exported depend on the value of {@code handleType}. See {@code VkExternalMemoryHandleTypeFlagBits} for a description of the properties of the defined external memory handle types.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The size of the exported file <b>may</b> be larger than the size requested by ##VkMemoryAllocateInfo::allocationSize. If {@code handleType} is #EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT, then the application <b>can</b> query the file's actual size with link:man:lseek(2)[lseek(2)].
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> have been included in ##VkExportMemoryAllocateInfo{@code ::handleTypes} when {@code memory} was created</li>
            <li>{@code handleType} <b>must</b> be defined as a POSIX file descriptor handle</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
        </ul>

        <h5>See Also</h5>
        #GetMemoryFdKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDeviceMemory("memory", "the memory object from which the handle will be exported.")
    VkExternalMemoryHandleTypeFlagBits("handleType", "the type of handle requested.")
}

val VkWin32KeyedMutexAcquireReleaseInfoKHR = struct(Module.VULKAN, "VkWin32KeyedMutexAcquireReleaseInfoKHR") {
    documentation =
        """
        Use the Windows keyed mutex mechanism to synchronize work.

        <h5>Valid Usage</h5>
        <ul>
            <li>Each member of {@code pAcquireSyncs} and {@code pReleaseSyncs} <b>must</b> be a device memory object imported by setting ##VkImportMemoryWin32HandleInfoKHR{@code ::handleType} to #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT or #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR</li>
            <li>If {@code acquireCount} is not 0, {@code pAcquireSyncs} <b>must</b> be a valid pointer to an array of {@code acquireCount} valid {@code VkDeviceMemory} handles</li>
            <li>If {@code acquireCount} is not 0, {@code pAcquireKeys} <b>must</b> be a valid pointer to an array of {@code acquireCount} {@code uint64_t} values</li>
            <li>If {@code acquireCount} is not 0, {@code pAcquireTimeouts} <b>must</b> be a valid pointer to an array of {@code acquireCount} {@code uint32_t} values</li>
            <li>If {@code releaseCount} is not 0, {@code pReleaseSyncs} <b>must</b> be a valid pointer to an array of {@code releaseCount} valid {@code VkDeviceMemory} handles</li>
            <li>If {@code releaseCount} is not 0, {@code pReleaseKeys} <b>must</b> be a valid pointer to an array of {@code releaseCount} {@code uint64_t} values</li>
            <li>Both of the elements of {@code pAcquireSyncs}, and the elements of {@code pReleaseSyncs} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    AutoSize("pAcquireSyncs", "pAcquireKeys", "pAcquireTimeouts", optional = true)..uint32_t("acquireCount", "the number of entries in the {@code pAcquireSyncs}, {@code pAcquireKeys}, and {@code pAcquireTimeoutMilliseconds} arrays.")
    VkDeviceMemory.const.p("pAcquireSyncs", "a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources.")
    uint64_t.const.p("pAcquireKeys", "a pointer to an array of mutex key values to wait for prior to beginning the submitted work. Entries refer to the keyed mutex associated with the corresponding entries in {@code pAcquireSyncs}.")
    uint32_t.const.p("pAcquireTimeouts", "")
    AutoSize("pReleaseSyncs", "pReleaseKeys", optional = true)..uint32_t("releaseCount", "the number of entries in the {@code pReleaseSyncs} and {@code pReleaseKeys} arrays.")
    VkDeviceMemory.const.p("pReleaseSyncs", "a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources.")
    uint64_t.const.p("pReleaseKeys", "a pointer to an array of mutex key values to set when the submitted work has completed. Entries refer to the keyed mutex associated with the corresponding entries in {@code pReleaseSyncs}.")
}

val VkPhysicalDeviceExternalSemaphoreInfoKHR = struct(Module.VULKAN, "VkPhysicalDeviceExternalSemaphoreInfoKHR", alias = VkPhysicalDeviceExternalSemaphoreInfo) {
    documentation = "See ##VkPhysicalDeviceExternalSemaphoreInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkExternalSemaphoreHandleTypeFlagBits("handleType", "")
}

val VkExternalSemaphorePropertiesKHR = struct(Module.VULKAN, "VkExternalSemaphorePropertiesKHR", mutable = false, alias = VkExternalSemaphoreProperties) {
    documentation = "See ##VkExternalSemaphoreProperties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkExternalSemaphoreHandleTypeFlags("exportFromImportedHandleTypes", "")
    VkExternalSemaphoreHandleTypeFlags("compatibleHandleTypes", "")
    VkExternalSemaphoreFeatureFlags("externalSemaphoreFeatures", "")
}

val VkExportSemaphoreCreateInfoKHR = struct(Module.VULKAN, "VkExportSemaphoreCreateInfoKHR", alias = VkExportSemaphoreCreateInfo) {
    documentation = "See ##VkExportSemaphoreCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkExternalSemaphoreHandleTypeFlags("handleTypes", "")
}

val VkImportSemaphoreWin32HandleInfoKHR = struct(Module.VULKAN, "VkImportSemaphoreWin32HandleInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        Structure specifying Windows handle to import to a semaphore.

        <h5>Description</h5>
        The handle types supported by {@code handleType} are:

        <h6>Handle Types Supported by ##VkImportSemaphoreWin32HandleInfoKHR</h6>
        <table class="lwjgl">
            <thead><tr><th>Handle Type</th><th>Transference</th><th>Permanence Supported</th></tr></thead>
            <tbody>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT</td><td>Reference</td><td>Temporary,Permanent</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT</td><td>Reference</td><td>Temporary,Permanent</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT</td><td>Reference</td><td>Temporary,Permanent</td></tr>
            </tbody>
        </table>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-semaphore-handletypes-win32">Handle Types Supported by ##VkImportSemaphoreWin32HandleInfoKHR</a> table</li>
            <li>If {@code handleType} is not #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT or #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT, {@code name} <b>must</b> be {@code NULL}</li>
            <li>If {@code handle} is {@code NULL}, {@code name} <b>must</b> name a valid synchronization primitive of the type specified by {@code handleType}</li>
            <li>If {@code name} is {@code NULL}, {@code handle} <b>must</b> be a valid handle of the type specified by {@code handleType}</li>
            <li>If {@code handle} is not {@code NULL}, {@code name} <b>must</b> be {@code NULL}</li>
            <li>If {@code handle} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#external-semaphore-handle-types-compatibility">external semaphore handle types compatibility</a></li>
            <li>If {@code name} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#external-semaphore-handle-types-compatibility">external semaphore handle types compatibility</a></li>
            <li>If {@code handleType} is #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT or #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT, the ##VkSemaphoreCreateInfo{@code ::flags} field <b>must</b> match that of the semaphore from which {@code handle} or {@code name} was exported</li>
            <li>If {@code handleType} is #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT or #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT, the ##VkSemaphoreTypeCreateInfo{@code ::semaphoreType} field <b>must</b> match that of the semaphore from which {@code handle} or {@code name} was exported</li>
            <li>If {@code flags} contains #SEMAPHORE_IMPORT_TEMPORARY_BIT, the ##VkSemaphoreTypeCreateInfo{@code ::semaphoreType} field of the semaphore from which {@code handle} or {@code name} was exported <b>must</b> not be #SEMAPHORE_TYPE_TIMELINE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkSemaphoreImportFlagBits} values</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        #ImportSemaphoreWin32HandleKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSemaphore("semaphore", "the semaphore into which the payload will be imported.")
    VkSemaphoreImportFlags("flags", "a bitmask of {@code VkSemaphoreImportFlagBits} specifying additional parameters for the semaphore payload import operation.")
    VkExternalSemaphoreHandleTypeFlagBits("handleType", "specifies the type of {@code handle}.")
    HANDLE("handle", "the external handle to import, or {@code NULL}.")
    LPCWSTR("name", "a null-terminated UTF-16 string naming the underlying synchronization primitive to import, or {@code NULL}.")
}

val VkExportSemaphoreWin32HandleInfoKHR = struct(Module.VULKAN, "VkExportSemaphoreWin32HandleInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        Structure specifying additional attributes of Windows handles exported from a semaphore.

        <h5>Description</h5>
        If ##VkExportSemaphoreCreateInfo is not present in the same {@code pNext} chain, this structure is ignored.

        If ##VkExportSemaphoreCreateInfo is present in the {@code pNext} chain of ##VkSemaphoreCreateInfo with a Windows {@code handleType}, but either ##VkExportSemaphoreWin32HandleInfoKHR is not present in the {@code pNext} chain, or if it is but {@code pAttributes} is set to {@code NULL}, default security descriptor values will be used, and child processes created by the application will not inherit the handle, as described in the MSDN documentation for "{@code Synchronization Object Security and Access Rights}"<sup>1</sup>. Further, if the structure is not present, the access rights used depend on the handle type.

        For handles of the following types:

        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT

        The implementation <b>must</b> ensure the access rights allow both signal and wait operations on the semaphore.

        For handles of the following types:

        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT

        The access rights <b>must</b> be:

        {@code GENERIC_ALL}

        <dl>
            <dt>1</dt>
            <dd><a target="_blank" href="https://docs.microsoft.com/en-us/windows/win32/sync/synchronization-object-security-and-access-rights">https://docs.microsoft.com/en-us/windows/win32/sync/synchronization-object-security-and-access-rights</a></dd>
        </dl>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkExportSemaphoreCreateInfo{@code ::handleTypes} does not include #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT or #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT, ##VkExportSemaphoreWin32HandleInfoKHR <b>must</b> not be included in the {@code pNext} chain of ##VkSemaphoreCreateInfo</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR</li>
            <li>If {@code pAttributes} is not {@code NULL}, {@code pAttributes} <b>must</b> be a valid pointer to a valid {@code SECURITY_ATTRIBUTES} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    nullable..SECURITY_ATTRIBUTES.const.p("pAttributes", "a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.")
    DWORD("dwAccess", "a {@code DWORD} specifying access rights of the handle.")
    LPCWSTR("name", "a null-terminated UTF-16 string to associate with the underlying synchronization primitive referenced by NT handles exported from the created semaphore.")
}

val VkD3D12FenceSubmitInfoKHR = struct(Module.VULKAN, "VkD3D12FenceSubmitInfoKHR") {
    documentation =
        """
        Structure specifying values for Direct3D 12 fence-backed semaphores.

        <h5>Description</h5>
        If the semaphore in ##VkSubmitInfo{@code ::pWaitSemaphores} or ##VkSubmitInfo{@code ::pSignalSemaphores} corresponding to an entry in {@code pWaitSemaphoreValues} or {@code pSignalSemaphoreValues} respectively does not currently have a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-semaphores-payloads">payload</a> referring to a Direct3D 12 fence, the implementation <b>must</b> ignore the value in the {@code pWaitSemaphoreValues} or {@code pSignalSemaphoreValues} entry.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        As the introduction of the external semaphore handle type #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT predates that of timeline semaphores, support for importing semaphore payloads from external handles of that type into semaphores created (implicitly or explicitly) with a {@code VkSemaphoreType} of #SEMAPHORE_TYPE_BINARY is preserved for backwards compatibility. However, applications <b>should</b> prefer importing such handle types into semaphores created with a {@code VkSemaphoreType} of #SEMAPHORE_TYPE_TIMELINE, and use the ##VkTimelineSemaphoreSubmitInfo structure instead of the ##VkD3D12FenceSubmitInfoKHR structure to specify the values to use when waiting for and signaling such semaphores.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code waitSemaphoreValuesCount} <b>must</b> be the same value as ##VkSubmitInfo{@code ::waitSemaphoreCount}, where ##VkSubmitInfo is in the {@code pNext} chain of this ##VkD3D12FenceSubmitInfoKHR structure</li>
            <li>{@code signalSemaphoreValuesCount} <b>must</b> be the same value as ##VkSubmitInfo{@code ::signalSemaphoreCount}, where ##VkSubmitInfo is in the {@code pNext} chain of this ##VkD3D12FenceSubmitInfoKHR structure</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR</li>
            <li>If {@code waitSemaphoreValuesCount} is not 0, and {@code pWaitSemaphoreValues} is not {@code NULL}, {@code pWaitSemaphoreValues} <b>must</b> be a valid pointer to an array of {@code waitSemaphoreValuesCount} {@code uint64_t} values</li>
            <li>If {@code signalSemaphoreValuesCount} is not 0, and {@code pSignalSemaphoreValues} is not {@code NULL}, {@code pSignalSemaphoreValues} <b>must</b> be a valid pointer to an array of {@code signalSemaphoreValuesCount} {@code uint64_t} values</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pWaitSemaphoreValues", optional = true)..uint32_t("waitSemaphoreValuesCount", "the number of semaphore wait values specified in {@code pWaitSemaphoreValues}.")
    nullable..uint64_t.const.p("pWaitSemaphoreValues", "a pointer to an array of {@code waitSemaphoreValuesCount} values for the corresponding semaphores in ##VkSubmitInfo{@code ::pWaitSemaphores} to wait for.")
    AutoSize("pSignalSemaphoreValues", optional = true)..uint32_t("signalSemaphoreValuesCount", "the number of semaphore signal values specified in {@code pSignalSemaphoreValues}.")
    nullable..uint64_t.const.p("pSignalSemaphoreValues", "a pointer to an array of {@code signalSemaphoreValuesCount} values for the corresponding semaphores in ##VkSubmitInfo{@code ::pSignalSemaphores} to set when signaled.")
}

val VkSemaphoreGetWin32HandleInfoKHR = struct(Module.VULKAN, "VkSemaphoreGetWin32HandleInfoKHR") {
    documentation =
        """
        Structure describing a Win32 handle semaphore export operation.

        <h5>Description</h5>
        The properties of the handle returned depend on the value of {@code handleType}. See {@code VkExternalSemaphoreHandleTypeFlagBits} for a description of the properties of the defined external semaphore handle types.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> have been included in ##VkExportSemaphoreCreateInfo{@code ::handleTypes} when the {@code semaphore}&#8217;s current payload was created</li>
            <li>If {@code handleType} is defined as an NT handle, #GetSemaphoreWin32HandleKHR() <b>must</b> be called no more than once for each valid unique combination of {@code semaphore} and {@code handleType}</li>
            <li>{@code semaphore} <b>must</b> not currently have its payload replaced by an imported payload as described below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-semaphores-importing">Importing Semaphore Payloads</a> unless that imported payload&#8217;s handle type was included in ##VkExternalSemaphoreProperties{@code ::exportFromImportedHandleTypes} for {@code handleType}</li>
            <li>If {@code handleType} refers to a handle type with copy payload transference semantics, as defined below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-semaphores-importing">Importing Semaphore Payloads</a>, there <b>must</b> be no queue waiting on {@code semaphore}</li>
            <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code semaphore} <b>must</b> be signaled, or have an associated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-semaphores-signaling">semaphore signal operation</a> pending execution</li>
            <li>{@code handleType} <b>must</b> be defined as an NT handle or a global share handle</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalSemaphoreHandleTypeFlagBits} value</li>
        </ul>

        <h5>See Also</h5>
        #GetSemaphoreWin32HandleKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSemaphore("semaphore", "the semaphore from which state will be exported.")
    VkExternalSemaphoreHandleTypeFlagBits("handleType", "the type of handle requested.")
}

val VkImportSemaphoreFdInfoKHR = struct(Module.VULKAN, "VkImportSemaphoreFdInfoKHR") {
    documentation =
        """
        Structure specifying POSIX file descriptor to import to a semaphore.

        <h5>Description</h5>
        The handle types supported by {@code handleType} are:

        <h6>Handle Types Supported by ##VkImportSemaphoreFdInfoKHR</h6>
        <table class="lwjgl">
            <thead><tr><th>Handle Type</th><th>Transference</th><th>Permanence Supported</th></tr></thead>
            <tbody>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT</td><td>Reference</td><td>Temporary,Permanent</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT</td><td>Copy</td><td>Temporary</td></tr>
            </tbody>
        </table>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-semaphore-handletypes-fd">Handle Types Supported by ##VkImportSemaphoreFdInfoKHR</a> table</li>
            <li>{@code fd} <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#external-semaphore-handle-types-compatibility">external semaphore handle types compatibility</a></li>
            <li>If {@code handleType} is #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT, the ##VkSemaphoreCreateInfo{@code ::flags} field <b>must</b> match that of the semaphore from which {@code fd} was exported</li>
            <li>If {@code handleType} is #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT, the ##VkSemaphoreTypeCreateInfo{@code ::semaphoreType} field <b>must</b> match that of the semaphore from which {@code fd} was exported</li>
            <li>If {@code flags} contains #SEMAPHORE_IMPORT_TEMPORARY_BIT, the ##VkSemaphoreTypeCreateInfo{@code ::semaphoreType} field of the semaphore from which {@code fd} was exported <b>must</b> not be #SEMAPHORE_TYPE_TIMELINE</li>
        </ul>

        If {@code handleType} is #EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT, the special value {@code -1} for {@code fd} is treated like a valid sync file descriptor referring to an object that has already signaled. The import operation will succeed and the {@code VkSemaphore} will have a temporarily imported payload as if a valid file descriptor had been provided.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This special behavior for importing an invalid sync file descriptor allows easier interoperability with other system APIs which use the convention that an invalid sync file descriptor represents work that has already completed and does not need to be waited for. It is consistent with the option for implementations to return a {@code -1} file descriptor when exporting a #EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT from a {@code VkSemaphore} which is signaled.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkSemaphoreImportFlagBits} values</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalSemaphoreHandleTypeFlagBits} value</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        #ImportSemaphoreFdKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSemaphore("semaphore", "the semaphore into which the payload will be imported.")
    VkSemaphoreImportFlags("flags", "a bitmask of {@code VkSemaphoreImportFlagBits} specifying additional parameters for the semaphore payload import operation.")
    VkExternalSemaphoreHandleTypeFlagBits("handleType", "specifies the type of {@code fd}.")
    int("fd", "the external handle to import.")
}

val VkSemaphoreGetFdInfoKHR = struct(Module.VULKAN, "VkSemaphoreGetFdInfoKHR") {
    documentation =
        """
        Structure describing a POSIX FD semaphore export operation.

        <h5>Description</h5>
        The properties of the file descriptor returned depend on the value of {@code handleType}. See {@code VkExternalSemaphoreHandleTypeFlagBits} for a description of the properties of the defined external semaphore handle types.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> have been included in ##VkExportSemaphoreCreateInfo{@code ::handleTypes} when {@code semaphore}&#8217;s current payload was created</li>
            <li>{@code semaphore} <b>must</b> not currently have its payload replaced by an imported payload as described below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-semaphores-importing">Importing Semaphore Payloads</a> unless that imported payload&#8217;s handle type was included in ##VkExternalSemaphoreProperties{@code ::exportFromImportedHandleTypes} for {@code handleType}</li>
            <li>If {@code handleType} refers to a handle type with copy payload transference semantics, as defined below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-semaphores-importing">Importing Semaphore Payloads</a>, there <b>must</b> be no queue waiting on {@code semaphore}</li>
            <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code semaphore} <b>must</b> be signaled, or have an associated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-semaphores-signaling">semaphore signal operation</a> pending execution</li>
            <li>{@code handleType} <b>must</b> be defined as a POSIX file descriptor handle</li>
            <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code semaphore} <b>must</b> have been created with a {@code VkSemaphoreType} of #SEMAPHORE_TYPE_BINARY</li>
            <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code semaphore} <b>must</b> have an associated semaphore signal operation that has been submitted for execution and any semaphore signal operations on which it depends (if any) <b>must</b> have also been submitted for execution</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalSemaphoreHandleTypeFlagBits} value</li>
        </ul>

        <h5>See Also</h5>
        #GetSemaphoreFdKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSemaphore("semaphore", "the semaphore from which state will be exported.")
    VkExternalSemaphoreHandleTypeFlagBits("handleType", "the type of handle requested.")
}

val VkPhysicalDevicePushDescriptorPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDevicePushDescriptorPropertiesKHR", mutable = false) {
    documentation =
        """
        Structure describing push descriptor limits that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDevicePushDescriptorPropertiesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("maxPushDescriptors", "the maximum number of descriptors that <b>can</b> be used in a descriptor set created with #DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR set.")
}

val VkConditionalRenderingBeginInfoEXT = struct(Module.VULKAN, "VkConditionalRenderingBeginInfoEXT") {
    documentation =
        """
        Structure specifying conditional rendering begin info.

        <h5>Description</h5>
        If the 32-bit value at {@code offset} in {@code buffer} memory is zero, then the rendering commands are discarded, otherwise they are executed as normal. If the value of the predicate in buffer memory changes while conditional rendering is active, the rendering commands <b>may</b> be discarded in an implementation-dependent way. Some implementations may latch the value of the predicate upon beginning conditional rendering while others may read it before every rendering command.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code buffer} <b>must</b> have been created with the #BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT bit set</li>
            <li>{@code offset} <b>must</b> be less than the size of {@code buffer} by at least 32 bits</li>
            <li>{@code offset} <b>must</b> be a multiple of 4</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkConditionalRenderingFlagBitsEXT} values</li>
        </ul>

        <h5>See Also</h5>
        #CmdBeginConditionalRenderingEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBuffer("buffer", "a buffer containing the predicate for conditional rendering.")
    VkDeviceSize("offset", "the byte offset into {@code buffer} where the predicate is located.")
    VkConditionalRenderingFlagsEXT("flags", "a bitmask of {@code VkConditionalRenderingFlagsEXT} specifying the behavior of conditional rendering.")
}

val VkPhysicalDeviceConditionalRenderingFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceConditionalRenderingFeaturesEXT") {
    documentation =
        """
        Structure describing if a secondary command buffer can be executed if conditional rendering is active in the primary command buffer.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceConditionalRenderingFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating the implementation-dependent behavior. ##VkPhysicalDeviceConditionalRenderingFeaturesEXT <b>can</b> also be included in {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("conditionalRendering", "specifies whether conditional rendering is supported.")
    VkBool32("inheritedConditionalRendering", "specifies whether a secondary command buffer <b>can</b> be executed while conditional rendering is active in the primary command buffer.")
}

val VkCommandBufferInheritanceConditionalRenderingInfoEXT = struct(Module.VULKAN, "VkCommandBufferInheritanceConditionalRenderingInfoEXT") {
    documentation =
        """
        Structure specifying command buffer inheritance info.

        <h5>Description</h5>
        If this structure is not present, the behavior is as if {@code conditionalRenderingEnable} is #FALSE.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-inheritedConditionalRendering">inherited conditional rendering</a> feature is not enabled, {@code conditionalRenderingEnable} <b>must</b> be #FALSE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure")
    VkBool32("conditionalRenderingEnable", "specifies whether the command buffer <b>can</b> be executed while conditional rendering is active in the primary command buffer. If this is #TRUE, then this command buffer <b>can</b> be executed whether the primary command buffer has active conditional rendering or not. If this is #FALSE, then the primary command buffer <b>must</b> not have conditional rendering active.")
}

val VkPhysicalDeviceShaderFloat16Int8FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderFloat16Int8FeaturesKHR", alias = VkPhysicalDeviceShaderFloat16Int8Features) {
    documentation = "See ##VkPhysicalDeviceShaderFloat16Int8Features."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("shaderFloat16", "")
    VkBool32("shaderInt8", "")
}

val VkPhysicalDeviceFloat16Int8FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceFloat16Int8FeaturesKHR", alias = VkPhysicalDeviceShaderFloat16Int8Features) {
    documentation = "See ##VkPhysicalDeviceShaderFloat16Int8Features."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("shaderFloat16", "")
    VkBool32("shaderInt8", "")
}

val VkPhysicalDevice16BitStorageFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevice16BitStorageFeaturesKHR", alias = VkPhysicalDevice16BitStorageFeatures) {
    documentation = "See ##VkPhysicalDevice16BitStorageFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("storageBuffer16BitAccess", "")
    VkBool32("uniformAndStorageBuffer16BitAccess", "")
    VkBool32("storagePushConstant16", "")
    VkBool32("storageInputOutput16", "")
}

val VkRectLayerKHR = struct(Module.VULKAN, "VkRectLayerKHR") {
    documentation =
        """
        Structure containing a rectangle, including layer, changed by vkQueuePresentKHR for a given VkImage.

        <h5>Valid Usage</h5>
        <ul>
            <li>The sum of {@code offset} and {@code extent} <b>must</b> be no greater than the {@code imageExtent} member of the ##VkSwapchainCreateInfoKHR structure passed to #CreateSwapchainKHR()</li>
            <li>{@code layer} <b>must</b> be less than the {@code imageArrayLayers} member of the ##VkSwapchainCreateInfoKHR structure passed to #CreateSwapchainKHR()</li>
        </ul>

        Some platforms allow the size of a surface to change, and then scale the pixels of the image to fit the surface. ##VkRectLayerKHR specifies pixels of the swapchain's image(s), which will be constant for the life of the swapchain.

        <h5>See Also</h5>
        ##VkExtent2D, ##VkOffset2D, ##VkPresentRegionKHR
        """

    VkOffset2D("offset", "the origin of the rectangle, in pixels.")
    VkExtent2D("extent", "the size of the rectangle, in pixels.")
    uint32_t("layer", "the layer of the image. For images with only one layer, the value of {@code layer} <b>must</b> be 0.")
}

val VkPresentRegionKHR = struct(Module.VULKAN, "VkPresentRegionKHR") {
    documentation =
        """
        Structure containing rectangular region changed by vkQueuePresentKHR for a given VkImage.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>If {@code rectangleCount} is not 0, and {@code pRectangles} is not {@code NULL}, {@code pRectangles} <b>must</b> be a valid pointer to an array of {@code rectangleCount} valid ##VkRectLayerKHR structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkPresentRegionsKHR, ##VkRectLayerKHR
        """

    AutoSize("pRectangles", optional = true)..uint32_t("rectangleCount", "the number of rectangles in {@code pRectangles}, or zero if the entire image has changed and should be presented.")
    nullable..VkRectLayerKHR.const.p("pRectangles", "either {@code NULL} or a pointer to an array of ##VkRectLayerKHR structures. The ##VkRectLayerKHR structure is the framebuffer coordinates, plus layer, of a portion of a presentable image that has changed and <b>must</b> be presented. If non-{@code NULL}, each entry in {@code pRectangles} is a rectangle of the given image that has changed since the last image was presented to the given swapchain.")
}

val VkPresentRegionsKHR = struct(Module.VULKAN, "VkPresentRegionsKHR") {
    documentation =
        """
        Structure hint of rectangular regions changed by vkQueuePresentKHR.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code swapchainCount} <b>must</b> be the same value as ##VkPresentInfoKHR{@code ::swapchainCount}, where ##VkPresentInfoKHR is included in the {@code pNext} chain of this ##VkPresentRegionsKHR structure</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PRESENT_REGIONS_KHR</li>
            <li>If {@code pRegions} is not {@code NULL}, {@code pRegions} <b>must</b> be a valid pointer to an array of {@code swapchainCount} valid ##VkPresentRegionKHR structures</li>
            <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkPresentRegionKHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pRegions", optional = true)..uint32_t("swapchainCount", "the number of swapchains being presented to by this command.")
    nullable..VkPresentRegionKHR.const.p("pRegions", "{@code NULL} or a pointer to an array of ##VkPresentRegionKHR elements with {@code swapchainCount} entries. If not {@code NULL}, each element of {@code pRegions} contains the region that has changed since the last present to the swapchain in the corresponding entry in the ##VkPresentInfoKHR{@code ::pSwapchains} array.")
}

val VkDescriptorUpdateTemplateEntryKHR = struct(Module.VULKAN, "VkDescriptorUpdateTemplateEntryKHR", alias = VkDescriptorUpdateTemplateEntry) {
    documentation = "See ##VkDescriptorUpdateTemplateEntry."

    uint32_t("dstBinding", "")
    uint32_t("dstArrayElement", "")
    uint32_t("descriptorCount", "")
    VkDescriptorType("descriptorType", "")
    size_t("offset", "")
    size_t("stride", "")
}

val VkDescriptorUpdateTemplateCreateInfoKHR = struct(Module.VULKAN, "VkDescriptorUpdateTemplateCreateInfoKHR", alias = VkDescriptorUpdateTemplateCreateInfo) {
    documentation = "See ##VkDescriptorUpdateTemplateCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkDescriptorUpdateTemplateCreateFlags("flags", "")
    AutoSize("pDescriptorUpdateEntries")..uint32_t("descriptorUpdateEntryCount", "")
    VkDescriptorUpdateTemplateEntry.const.p("pDescriptorUpdateEntries", "")
    VkDescriptorUpdateTemplateType("templateType", "")
    VkDescriptorSetLayout("descriptorSetLayout", "")
    VkPipelineBindPoint("pipelineBindPoint", "")
    VkPipelineLayout("pipelineLayout", "")
    uint32_t("set", "")
}

val VkViewportWScalingNV = struct(Module.VULKAN, "VkViewportWScalingNV") {
    documentation =
        """
        Structure specifying a viewport.
        """

    float("xcoeff", "{@code xcoeff} and {@code ycoeff} are the viewport&#8217;s W scaling factor for x and y respectively.")
    float("ycoeff", "see {@code xcoeff}")
}

val VkPipelineViewportWScalingStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineViewportWScalingStateCreateInfoNV") {
    documentation =
        """
        Structure specifying parameters of a newly created pipeline viewport W scaling state.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV</li>
            <li>{@code viewportCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkViewportWScalingNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("viewportWScalingEnable", "controls whether viewport <b>W</b> scaling is enabled.")
    AutoSize("pViewportWScalings", optional = true)..uint32_t("viewportCount", "the number of viewports used by <b>W</b> scaling, and <b>must</b> match the number of viewports in the pipeline if viewport <b>W</b> scaling is enabled.")
    nullable..VkViewportWScalingNV.const.p("pViewportWScalings", "a pointer to an array of ##VkViewportWScalingNV structures defining the <b>W</b> scaling parameters for the corresponding viewports. If the viewport <b>W</b> scaling state is dynamic, this member is ignored.")
}

val VkSurfaceCapabilities2EXT = struct(Module.VULKAN, "VkSurfaceCapabilities2EXT", mutable = false) {
    documentation =
        """
        Structure describing capabilities of a surface.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code supportedSurfaceCounters} <b>must</b> not include #SURFACE_COUNTER_VBLANK_BIT_EXT unless the surface queried is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#wsi-display-surfaces">display surface</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent2D, #GetPhysicalDeviceSurfaceCapabilities2EXT()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("minImageCount", "")
    uint32_t("maxImageCount", "")
    VkExtent2D("currentExtent", "")
    VkExtent2D("minImageExtent", "")
    VkExtent2D("maxImageExtent", "")
    uint32_t("maxImageArrayLayers", "")
    VkSurfaceTransformFlagsKHR("supportedTransforms", "")
    VkSurfaceTransformFlagBitsKHR("currentTransform", "")
    VkCompositeAlphaFlagsKHR("supportedCompositeAlpha", "")
    VkImageUsageFlags("supportedUsageFlags", "")
    VkSurfaceCounterFlagsEXT("supportedSurfaceCounters", "a bitmask of {@code VkSurfaceCounterFlagBitsEXT} indicating the supported surface counter types.")
}

val VkDisplayPowerInfoEXT = struct(Module.VULKAN, "VkDisplayPowerInfoEXT") {
    documentation =
        """
        Describe the power state of a display.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code powerState} <b>must</b> be a valid {@code VkDisplayPowerStateEXT} value</li>
        </ul>

        <h5>See Also</h5>
        #DisplayPowerControlEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDisplayPowerStateEXT("powerState", "a {@code VkDisplayPowerStateEXT} value specifying the new power state of the display.")
}

val VkDeviceEventInfoEXT = struct(Module.VULKAN, "VkDeviceEventInfoEXT") {
    documentation =
        """
        Describe a device event to create.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code deviceEvent} <b>must</b> be a valid {@code VkDeviceEventTypeEXT} value</li>
        </ul>

        <h5>See Also</h5>
        #RegisterDeviceEventEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDeviceEventTypeEXT("deviceEvent", "")
}

val VkDisplayEventInfoEXT = struct(Module.VULKAN, "VkDisplayEventInfoEXT") {
    documentation =
        """
        Describe a display event to create.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code displayEvent} <b>must</b> be a valid {@code VkDisplayEventTypeEXT} value</li>
        </ul>

        <h5>See Also</h5>
        #RegisterDisplayEventEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDisplayEventTypeEXT("displayEvent", "a {@code VkDisplayEventTypeEXT} specifying when the fence will be signaled.")
}

val VkSwapchainCounterCreateInfoEXT = struct(Module.VULKAN, "VkSwapchainCounterCreateInfoEXT") {
    documentation =
        """
        Specify the surface counters desired.

        <h5>Valid Usage</h5>
        <ul>
            <li>The bits in {@code surfaceCounters} <b>must</b> be supported by ##VkSwapchainCreateInfoKHR{@code ::surface}, as reported by #GetPhysicalDeviceSurfaceCapabilities2EXT()</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT</li>
            <li>{@code surfaceCounters} <b>must</b> be a valid combination of {@code VkSurfaceCounterFlagBitsEXT} values</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSurfaceCounterFlagsEXT("surfaceCounters", "a bitmask of {@code VkSurfaceCounterFlagBitsEXT} specifying surface counters to enable for the swapchain.")
}

val VkRefreshCycleDurationGOOGLE = struct(Module.VULKAN, "VkRefreshCycleDurationGOOGLE", mutable = false) {
    documentation =
        """
        Structure containing the RC duration of a display.
        """

    uint64_t("refreshDuration", "the number of nanoseconds from the start of one refresh cycle to the next.")
}

val VkPastPresentationTimingGOOGLE = struct(Module.VULKAN, "VkPastPresentationTimingGOOGLE", mutable = false) {
    documentation =
        """
        Structure containing timing information about a previously-presented image.

        <h5>Description</h5>
        The results for a given {@code swapchain} and {@code presentID} are only returned once from {@code vkGetPastPresentationTimingGOOGLE}.

        The application <b>can</b> use the ##VkPastPresentationTimingGOOGLE values to occasionally adjust its timing. For example, if {@code actualPresentTime} is later than expected (e.g. one {@code refreshDuration} late), the application may increase its target IPD to a higher multiple of {@code refreshDuration} (e.g. decrease its frame rate from 60Hz to 30Hz). If {@code actualPresentTime} and {@code earliestPresentTime} are consistently different, and if {@code presentMargin} is consistently large enough, the application may decrease its target IPD to a smaller multiple of {@code refreshDuration} (e.g. increase its frame rate from 30Hz to 60Hz). If {@code actualPresentTime} and {@code earliestPresentTime} are same, and if {@code presentMargin} is consistently high, the application may delay the start of its input-render-present loop in order to decrease the latency between user input and the corresponding present (always leaving some margin in case a new image takes longer to render than the previous image). An application that desires its target IPD to always be the same as {@code refreshDuration}, can also adjust features until {@code actualPresentTime} is never late and {@code presentMargin} is satisfactory.

        <h5>See Also</h5>
        #GetPastPresentationTimingGOOGLE()
        """

    uint32_t("presentID", "an application-provided value that was given to a previous {@code vkQueuePresentKHR} command via ##VkPresentTimeGOOGLE{@code ::presentID} (see below). It <b>can</b> be used to uniquely identify a previous present with the #QueuePresentKHR() command.")
    uint64_t("desiredPresentTime", "an application-provided value that was given to a previous #QueuePresentKHR() command via ##VkPresentTimeGOOGLE{@code ::desiredPresentTime}. If non-zero, it was used by the application to indicate that an image not be presented any sooner than {@code desiredPresentTime}.")
    uint64_t("actualPresentTime", "the time when the image of the {@code swapchain} was actually displayed.")
    uint64_t("earliestPresentTime", "the time when the image of the {@code swapchain} could have been displayed. This <b>may</b> differ from {@code actualPresentTime} if the application requested that the image be presented no sooner than ##VkPresentTimeGOOGLE{@code ::desiredPresentTime}.")
    uint64_t("presentMargin", "an indication of how early the {@code vkQueuePresentKHR} command was processed compared to how soon it needed to be processed, and still be presented at {@code earliestPresentTime}.")
}

val VkPresentTimeGOOGLE = struct(Module.VULKAN, "VkPresentTimeGOOGLE") {
    documentation =
        """
        The earliest time image should be presented.
        """

    uint32_t("presentID", "an application-provided identification value, that <b>can</b> be used with the results of #GetPastPresentationTimingGOOGLE(), in order to uniquely identify this present. In order to be useful to the application, it <b>should</b> be unique within some period of time that is meaningful to the application.")
    uint64_t("desiredPresentTime", "specifies that the image given <b>should</b> not be displayed to the user any earlier than this time. {@code desiredPresentTime} is a time in nanoseconds, relative to a monotonically-increasing clock (e.g. {@code CLOCK_MONOTONIC} (see clock_gettime(2)) on Android and Linux). A value of zero specifies that the presentation engine <b>may</b> display the image at any time. This is useful when the application desires to provide {@code presentID}, but does not need a specific {@code desiredPresentTime}.")
}

val VkPresentTimesInfoGOOGLE = struct(Module.VULKAN, "VkPresentTimesInfoGOOGLE") {
    documentation =
        """
        The earliest time each image should be presented.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code swapchainCount} <b>must</b> be the same value as ##VkPresentInfoKHR{@code ::swapchainCount}, where ##VkPresentInfoKHR is included in the {@code pNext} chain of this ##VkPresentTimesInfoGOOGLE structure</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE</li>
            <li>If {@code pTimes} is not {@code NULL}, {@code pTimes} <b>must</b> be a valid pointer to an array of {@code swapchainCount} ##VkPresentTimeGOOGLE structures</li>
            <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkPresentTimeGOOGLE
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pTimes", optional = true)..uint32_t("swapchainCount", "the number of swapchains being presented to by this command.")
    nullable..VkPresentTimeGOOGLE.const.p("pTimes", "{@code NULL} or a pointer to an array of ##VkPresentTimeGOOGLE elements with {@code swapchainCount} entries. If not {@code NULL}, each element of {@code pTimes} contains the earliest time to present the image corresponding to the entry in the ##VkPresentInfoKHR{@code ::pImageIndices} array.")
}

val VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX = struct(Module.VULKAN, "VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX", mutable = false) {
    documentation =
        """
        Structure describing multiview limits that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkBool32("perViewPositionAllComponents", "#TRUE if the implementation supports per-view position values that differ in components other than the X component.")
}

val VkViewportSwizzleNV = struct(Module.VULKAN, "VkViewportSwizzleNV") {
    documentation =
        """
        Structure specifying a viewport swizzle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code x} <b>must</b> be a valid {@code VkViewportCoordinateSwizzleNV} value</li>
            <li>{@code y} <b>must</b> be a valid {@code VkViewportCoordinateSwizzleNV} value</li>
            <li>{@code z} <b>must</b> be a valid {@code VkViewportCoordinateSwizzleNV} value</li>
            <li>{@code w} <b>must</b> be a valid {@code VkViewportCoordinateSwizzleNV} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineViewportSwizzleStateCreateInfoNV
        """

    VkViewportCoordinateSwizzleNV("x", "a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the x component of the primitive")
    VkViewportCoordinateSwizzleNV("y", "a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the y component of the primitive")
    VkViewportCoordinateSwizzleNV("z", "a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the z component of the primitive")
    VkViewportCoordinateSwizzleNV("w", "a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the w component of the primitive")
}

val VkPipelineViewportSwizzleStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineViewportSwizzleStateCreateInfoNV") {
    documentation =
        """
        Structure specifying swizzle applied to primitive clip coordinates.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code viewportCount} <b>must</b> be greater than or equal to the {@code viewportCount} set in ##VkPipelineViewportStateCreateInfo</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code pViewportSwizzles} <b>must</b> be a valid pointer to an array of {@code viewportCount} valid ##VkViewportSwizzleNV structures</li>
            <li>{@code viewportCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkViewportSwizzleNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineViewportSwizzleStateCreateFlagsNV("flags", "reserved for future use.")
    AutoSize("pViewportSwizzles")..uint32_t("viewportCount", "the number of viewport swizzles used by the pipeline.")
    VkViewportSwizzleNV.const.p("pViewportSwizzles", "a pointer to an array of ##VkViewportSwizzleNV structures, defining the viewport swizzles.")
}

val VkPhysicalDeviceDiscardRectanglePropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDiscardRectanglePropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing discard rectangle limits that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceDiscardRectanglePropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("maxDiscardRectangles", "the maximum number of active discard rectangles that <b>can</b> be specified.")
}

val VkPipelineDiscardRectangleStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineDiscardRectangleStateCreateInfoEXT") {
    documentation =
        """
        Structure specifying discard rectangle.

        <h5>Description</h5>
        If the #DYNAMIC_STATE_DISCARD_RECTANGLE_EXT dynamic state is enabled for a pipeline, the {@code pDiscardRectangles} member is ignored.

        When this structure is included in the {@code pNext} chain of ##VkGraphicsPipelineCreateInfo, it defines parameters of the discard rectangle test. If this structure is not included in the {@code pNext} chain, it is equivalent to specifying this structure with a {@code discardRectangleCount} of 0.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code discardRectangleCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceDiscardRectanglePropertiesEXT{@code ::maxDiscardRectangles}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code discardRectangleMode} <b>must</b> be a valid {@code VkDiscardRectangleModeEXT} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkRect2D
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineDiscardRectangleStateCreateFlagsEXT("flags", "reserved for future use.")
    VkDiscardRectangleModeEXT("discardRectangleMode", "a {@code VkDiscardRectangleModeEXT} value determining whether the discard rectangle test is inclusive or exclusive.")
    AutoSize("pDiscardRectangles", optional = true)..uint32_t("discardRectangleCount", "the number of discard rectangles to use.")
    VkRect2D.const.p("pDiscardRectangles", "a pointer to an array of ##VkRect2D structures defining discard rectangles.")
}

val VkPhysicalDeviceConservativeRasterizationPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceConservativeRasterizationPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing conservative raster properties that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceConservativeRasterizationPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits and properties.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    float("primitiveOverestimationSize", "the size in pixels the generating primitive is increased at each of its edges during conservative rasterization overestimation mode. Even with a size of 0.0, conservative rasterization overestimation rules still apply and if any part of the pixel rectangle is covered by the generating primitive, fragments are generated for the entire pixel. However implementations <b>may</b> make the pixel coverage area even more conservative by increasing the size of the generating primitive.")
    float("maxExtraPrimitiveOverestimationSize", "the maximum size in pixels of extra overestimation the implementation supports in the pipeline state. A value of 0.0 means the implementation does not support any additional overestimation of the generating primitive during conservative rasterization. A value above 0.0 allows the application to further increase the size of the generating primitive during conservative rasterization overestimation.")
    float("extraPrimitiveOverestimationSizeGranularity", "the granularity of extra overestimation that can be specified in the pipeline state between 0.0 and {@code maxExtraPrimitiveOverestimationSize} inclusive. A value of 0.0 means the implementation can use the smallest representable non-zero value in the screen space pixel fixed-point grid.")
    VkBool32("primitiveUnderestimation", "true if the implementation supports the #CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT conservative rasterization mode in addition to #CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT. Otherwise the implementation only supports #CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT.")
    VkBool32("conservativePointAndLineRasterization", "true if the implementation supports conservative rasterization of point and line primitives as well as triangle primitives. Otherwise the implementation only supports triangle primitives.")
    VkBool32("degenerateTrianglesRasterized", "false if the implementation culls primitives generated from triangles that become zero area after they are quantized to the fixed-point rasterization pixel grid. {@code degenerateTrianglesRasterized} is true if these primitives are not culled and the provoking vertex attributes and depth value are used for the fragments. The primitive area calculation is done on the primitive generated from the clipped triangle if applicable. Zero area primitives are backfacing and the application <b>can</b> enable backface culling if desired.")
    VkBool32("degenerateLinesRasterized", "false if the implementation culls lines that become zero length after they are quantized to the fixed-point rasterization pixel grid. {@code degenerateLinesRasterized} is true if zero length lines are not culled and the provoking vertex attributes and depth value are used for the fragments.")
    VkBool32("fullyCoveredFragmentShaderInputVariable", "true if the implementation supports the SPIR-V builtin fragment shader input variable {@code FullyCoveredEXT} which specifies that conservative rasterization is enabled and the fragment area is fully covered by the generating primitive.")
    VkBool32("conservativeRasterizationPostDepthCoverage", "true if the implementation supports conservative rasterization with the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#shaders-fragment-earlytest-postdepthcoverage\">{@code PostDepthCoverage}</a> execution mode enabled. When supported the {@code SampleMask} built-in input variable will reflect the coverage after the early per-fragment depth and stencil tests are applied even when conservative rasterization is enabled. Otherwise <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#shaders-fragment-earlytest-postdepthcoverage\">{@code PostDepthCoverage}</a> execution mode <b>must</b> not be used when conservative rasterization is enabled.")
}

val VkPipelineRasterizationConservativeStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineRasterizationConservativeStateCreateInfoEXT") {
    documentation =
        """
        Structure specifying conservative raster state.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code extraPrimitiveOverestimationSize} <b>must</b> be in the range of {@code 0.0} to ##VkPhysicalDeviceConservativeRasterizationPropertiesEXT{@code ::maxExtraPrimitiveOverestimationSize} inclusive</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code conservativeRasterizationMode} <b>must</b> be a valid {@code VkConservativeRasterizationModeEXT} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineRasterizationConservativeStateCreateFlagsEXT("flags", "reserved for future use.")
    VkConservativeRasterizationModeEXT("conservativeRasterizationMode", "the conservative rasterization mode to use.")
    float("extraPrimitiveOverestimationSize", "the extra size in pixels to increase the generating primitive during conservative rasterization at each of its edges in {@code X} and {@code Y} equally in screen space beyond the base overestimation specified in ##VkPhysicalDeviceConservativeRasterizationPropertiesEXT{@code ::primitiveOverestimationSize}.")
}

val VkPhysicalDeviceDepthClipEnableFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDepthClipEnableFeaturesEXT") {
    documentation =
        """
        Structure indicating support for explicit enable of depth clip.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceDepthClipEnableFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceDepthClipEnableFeaturesEXT <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable this feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("depthClipEnable", "indicates that the implementation supports setting the depth clipping operation explicitly via the ##VkPipelineRasterizationDepthClipStateCreateInfoEXT pipeline state. Otherwise depth clipping is only enabled when ##VkPipelineRasterizationStateCreateInfo{@code ::depthClampEnable} is set to #FALSE.")
}

val VkPipelineRasterizationDepthClipStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineRasterizationDepthClipStateCreateInfoEXT") {
    documentation =
        """
        Structure specifying depth clipping state.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineRasterizationDepthClipStateCreateFlagsEXT("flags", "reserved for future use.")
    VkBool32("depthClipEnable", "controls whether depth clipping is enabled as described in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#vertexpostproc-clipping\">Primitive Clipping</a>.")
}

val VkXYColorEXT = struct(Module.VULKAN, "VkXYColorEXT") {
    documentation =
        """
        structure to specify X,Y chromaticity coordinates.
        """

    float("x", "")
    float("y", "")
}

val VkHdrMetadataEXT = struct(Module.VULKAN, "VkHdrMetadataEXT") {
    documentation =
        """
        structure to specify Hdr metadata.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_HDR_METADATA_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The validity and use of this data is outside the scope of Vulkan.
        </div>

        <h5>See Also</h5>
        ##VkXYColorEXT, #SetHdrMetadataEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkXYColorEXT("displayPrimaryRed", "the reference monitor&#8217;s red primary in chromaticity coordinates")
    VkXYColorEXT("displayPrimaryGreen", "the reference monitor&#8217;s green primary in chromaticity coordinates")
    VkXYColorEXT("displayPrimaryBlue", "the reference monitor&#8217;s blue primary in chromaticity coordinates")
    VkXYColorEXT("whitePoint", "the reference monitor&#8217;s white-point in chromaticity coordinates")
    float("maxLuminance", "the maximum luminance of the reference monitor in nits")
    float("minLuminance", "the minimum luminance of the reference monitor in nits")
    float("maxContentLightLevel", "content&#8217;s maximum luminance in nits")
    float("maxFrameAverageLightLevel", "the maximum frame average light level in nits")
}

val VkPhysicalDeviceImagelessFramebufferFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceImagelessFramebufferFeaturesKHR", alias = VkPhysicalDeviceImagelessFramebufferFeatures) {
    documentation = "See ##VkPhysicalDeviceImagelessFramebufferFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("imagelessFramebuffer", "")
}

val VkFramebufferAttachmentsCreateInfoKHR = struct(Module.VULKAN, "VkFramebufferAttachmentsCreateInfoKHR", alias = VkFramebufferAttachmentsCreateInfo) {
    documentation = "See ##VkFramebufferAttachmentsCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    AutoSize("pAttachmentImageInfos", optional = true)..uint32_t("attachmentImageInfoCount", "")
    VkFramebufferAttachmentImageInfo.const.p("pAttachmentImageInfos", "")
}

val VkFramebufferAttachmentImageInfoKHR = struct(Module.VULKAN, "VkFramebufferAttachmentImageInfoKHR", alias = VkFramebufferAttachmentImageInfo) {
    documentation = "See ##VkFramebufferAttachmentImageInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkImageCreateFlags("flags", "")
    VkImageUsageFlags("usage", "")
    uint32_t("width", "")
    uint32_t("height", "")
    uint32_t("layerCount", "")
    AutoSize("pViewFormats", optional = true)..uint32_t("viewFormatCount", "")
    VkFormat.const.p("pViewFormats", "")
}

val VkRenderPassAttachmentBeginInfoKHR = struct(Module.VULKAN, "VkRenderPassAttachmentBeginInfoKHR", alias = VkRenderPassAttachmentBeginInfo) {
    documentation = "See ##VkRenderPassAttachmentBeginInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    AutoSize("pAttachments", optional = true)..uint32_t("attachmentCount", "")
    VkImageView.const.p("pAttachments", "")
}

val VkRenderPassCreateInfo2KHR = struct(Module.VULKAN, "VkRenderPassCreateInfo2KHR", alias = VkRenderPassCreateInfo2) {
    documentation = "See ##VkRenderPassCreateInfo2."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkRenderPassCreateFlags("flags", "")
    AutoSize("pAttachments", optional = true)..uint32_t("attachmentCount", "")
    VkAttachmentDescription2.const.p("pAttachments", "")
    AutoSize("pSubpasses")..uint32_t("subpassCount", "")
    VkSubpassDescription2.const.p("pSubpasses", "")
    AutoSize("pDependencies", optional = true)..uint32_t("dependencyCount", "")
    VkSubpassDependency2.const.p("pDependencies", "")
    AutoSize("pCorrelatedViewMasks", optional = true)..uint32_t("correlatedViewMaskCount", "")
    uint32_t.const.p("pCorrelatedViewMasks", "")
}

val VkAttachmentDescription2KHR = struct(Module.VULKAN, "VkAttachmentDescription2KHR", alias = VkAttachmentDescription2) {
    documentation = "See ##VkAttachmentDescription2."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkAttachmentDescriptionFlags("flags", "")
    VkFormat("format", "")
    VkSampleCountFlagBits("samples", "")
    VkAttachmentLoadOp("loadOp", "")
    VkAttachmentStoreOp("storeOp", "")
    VkAttachmentLoadOp("stencilLoadOp", "")
    VkAttachmentStoreOp("stencilStoreOp", "")
    VkImageLayout("initialLayout", "")
    VkImageLayout("finalLayout", "")
}

val VkAttachmentReference2KHR = struct(Module.VULKAN, "VkAttachmentReference2KHR", alias = VkAttachmentReference2) {
    documentation = "See ##VkAttachmentReference2."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    uint32_t("attachment", "")
    VkImageLayout("layout", "")
    VkImageAspectFlags("aspectMask", "")
}

val VkSubpassDescription2KHR = struct(Module.VULKAN, "VkSubpassDescription2KHR", alias = VkSubpassDescription2) {
    documentation = "See ##VkSubpassDescription2."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkSubpassDescriptionFlags("flags", "")
    VkPipelineBindPoint("pipelineBindPoint", "")
    uint32_t("viewMask", "")
    AutoSize("pInputAttachments", optional = true)..uint32_t("inputAttachmentCount", "")
    VkAttachmentReference2.const.p("pInputAttachments", "")
    AutoSize("pColorAttachments", "pResolveAttachments", optional = true)..uint32_t("colorAttachmentCount", "")
    VkAttachmentReference2.const.p("pColorAttachments", "")
    nullable..VkAttachmentReference2.const.p("pResolveAttachments", "")
    nullable..VkAttachmentReference2.const.p("pDepthStencilAttachment", "")
    AutoSize("pPreserveAttachments", optional = true)..uint32_t("preserveAttachmentCount", "")
    uint32_t.const.p("pPreserveAttachments", "")
}

val VkSubpassDependency2KHR = struct(Module.VULKAN, "VkSubpassDependency2KHR", alias = VkSubpassDependency2) {
    documentation = "See ##VkSubpassDependency2."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    uint32_t("srcSubpass", "")
    uint32_t("dstSubpass", "")
    VkPipelineStageFlags("srcStageMask", "")
    VkPipelineStageFlags("dstStageMask", "")
    VkAccessFlags("srcAccessMask", "")
    VkAccessFlags("dstAccessMask", "")
    VkDependencyFlags("dependencyFlags", "")
    int32_t("viewOffset", "")
}

val VkSubpassBeginInfoKHR = struct(Module.VULKAN, "VkSubpassBeginInfoKHR", alias = VkSubpassBeginInfo) {
    documentation = "See ##VkSubpassBeginInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkSubpassContents("contents", "")
}

val VkSubpassEndInfoKHR = struct(Module.VULKAN, "VkSubpassEndInfoKHR", alias = VkSubpassEndInfo) {
    documentation = "See ##VkSubpassEndInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
}

val VkSharedPresentSurfaceCapabilitiesKHR = struct(Module.VULKAN, "VkSharedPresentSurfaceCapabilitiesKHR", mutable = false) {
    documentation =
        """
        structure describing capabilities of a surface for shared presentation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkImageUsageFlags("sharedPresentSupportedUsageFlags", "a bitmask of {@code VkImageUsageFlagBits} representing the ways the application <b>can</b> use the shared presentable image from a swapchain created with {@code VkPresentModeKHR} set to #PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR or #PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR for the surface on the specified device. #IMAGE_USAGE_COLOR_ATTACHMENT_BIT <b>must</b> be included in the set but implementations <b>may</b> support additional usages.")
}

val VkPhysicalDeviceExternalFenceInfoKHR = struct(Module.VULKAN, "VkPhysicalDeviceExternalFenceInfoKHR", alias = VkPhysicalDeviceExternalFenceInfo) {
    documentation = "See ##VkPhysicalDeviceExternalFenceInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkExternalFenceHandleTypeFlagBits("handleType", "")
}

val VkExternalFencePropertiesKHR = struct(Module.VULKAN, "VkExternalFencePropertiesKHR", mutable = false, alias = VkExternalFenceProperties) {
    documentation = "See ##VkExternalFenceProperties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkExternalFenceHandleTypeFlags("exportFromImportedHandleTypes", "")
    VkExternalFenceHandleTypeFlags("compatibleHandleTypes", "")
    VkExternalFenceFeatureFlags("externalFenceFeatures", "")
}

val VkExportFenceCreateInfoKHR = struct(Module.VULKAN, "VkExportFenceCreateInfoKHR", alias = VkExportFenceCreateInfo) {
    documentation = "See ##VkExportFenceCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkExternalFenceHandleTypeFlags("handleTypes", "")
}

val VkImportFenceWin32HandleInfoKHR = struct(Module.VULKAN, "VkImportFenceWin32HandleInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        (None).

        <h5>Description</h5>
        The handle types supported by {@code handleType} are:

        <h6>Handle Types Supported by ##VkImportFenceWin32HandleInfoKHR</h6>
        <table class="lwjgl">
            <thead><tr><th>Handle Type</th><th>Transference</th><th>Permanence Supported</th></tr></thead>
            <tbody>
                <tr><td>#EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT</td><td>Reference</td><td>Temporary,Permanent</td></tr>
                <tr><td>#EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT</td><td>Reference</td><td>Temporary,Permanent</td></tr>
            </tbody>
        </table>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-fence-handletypes-win32">Handle Types Supported by ##VkImportFenceWin32HandleInfoKHR</a> table</li>
            <li>If {@code handleType} is not #EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT, {@code name} <b>must</b> be {@code NULL}</li>
            <li>If {@code handle} is {@code NULL}, {@code name} <b>must</b> name a valid synchronization primitive of the type specified by {@code handleType}</li>
            <li>If {@code name} is {@code NULL}, {@code handle} <b>must</b> be a valid handle of the type specified by {@code handleType}</li>
            <li>If {@code handle} is not {@code NULL}, {@code name} <b>must</b> be {@code NULL}</li>
            <li>If {@code handle} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#external-fence-handle-types-compatibility">external fence handle types compatibility</a></li>
            <li>If {@code name} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#external-fence-handle-types-compatibility">external fence handle types compatibility</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkFenceImportFlagBits} values</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        #ImportFenceWin32HandleKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkFence("fence", "the fence into which the state will be imported.")
    VkFenceImportFlags("flags", "a bitmask of {@code VkFenceImportFlagBits} specifying additional parameters for the fence payload import operation.")
    VkExternalFenceHandleTypeFlagBits("handleType", "specifies the type of {@code handle}.")
    HANDLE("handle", "the external handle to import, or {@code NULL}.")
    LPCWSTR("name", "a null-terminated UTF-16 string naming the underlying synchronization primitive to import, or {@code NULL}.")
}

val VkExportFenceWin32HandleInfoKHR = struct(Module.VULKAN, "VkExportFenceWin32HandleInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        Structure specifying additional attributes of Windows handles exported from a fence.

        <h5>Description</h5>
        If ##VkExportFenceCreateInfo is not present in the same {@code pNext} chain, this structure is ignored.

        If ##VkExportFenceCreateInfo is present in the {@code pNext} chain of ##VkFenceCreateInfo with a Windows {@code handleType}, but either ##VkExportFenceWin32HandleInfoKHR is not present in the {@code pNext} chain, or if it is but {@code pAttributes} is set to {@code NULL}, default security descriptor values will be used, and child processes created by the application will not inherit the handle, as described in the MSDN documentation for "{@code Synchronization Object Security and Access Rights}"<sup>1</sup>. Further, if the structure is not present, the access rights will be

        {@code DXGI_SHARED_RESOURCE_READ} | {@code DXGI_SHARED_RESOURCE_WRITE}

        for handles of the following types:

        #EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT

        <dl>
            <dt>1</dt>
            <dd><a target="_blank" href="https://docs.microsoft.com/en-us/windows/win32/sync/synchronization-object-security-and-access-rights">https://docs.microsoft.com/en-us/windows/win32/sync/synchronization-object-security-and-access-rights</a></dd>
        </dl>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkExportFenceCreateInfo{@code ::handleTypes} does not include #EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT, a ##VkExportFenceWin32HandleInfoKHR structure <b>must</b> not be included in the {@code pNext} chain of ##VkFenceCreateInfo</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR</li>
            <li>If {@code pAttributes} is not {@code NULL}, {@code pAttributes} <b>must</b> be a valid pointer to a valid {@code SECURITY_ATTRIBUTES} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    nullable..SECURITY_ATTRIBUTES.const.p("pAttributes", "a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.")
    DWORD("dwAccess", "a {@code DWORD} specifying access rights of the handle.")
    LPCWSTR("name", "a null-terminated UTF-16 string to associate with the underlying synchronization primitive referenced by NT handles exported from the created fence.")
}

val VkFenceGetWin32HandleInfoKHR = struct(Module.VULKAN, "VkFenceGetWin32HandleInfoKHR") {
    documentation =
        """
        Structure describing a Win32 handle fence export operation.

        <h5>Description</h5>
        The properties of the handle returned depend on the value of {@code handleType}. See {@code VkExternalFenceHandleTypeFlagBits} for a description of the properties of the defined external fence handle types.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> have been included in ##VkExportFenceCreateInfo{@code ::handleTypes} when the {@code fence}&#8217;s current payload was created</li>
            <li>If {@code handleType} is defined as an NT handle, #GetFenceWin32HandleKHR() <b>must</b> be called no more than once for each valid unique combination of {@code fence} and {@code handleType}</li>
            <li>{@code fence} <b>must</b> not currently have its payload replaced by an imported payload as described below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-fences-importing">Importing Fence Payloads</a> unless that imported payload&#8217;s handle type was included in ##VkExternalFenceProperties{@code ::exportFromImportedHandleTypes} for {@code handleType}</li>
            <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code fence} <b>must</b> be signaled, or have an associated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-fences-signaling">fence signal operation</a> pending execution</li>
            <li>{@code handleType} <b>must</b> be defined as an NT handle or a global share handle</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalFenceHandleTypeFlagBits} value</li>
        </ul>

        <h5>See Also</h5>
        #GetFenceWin32HandleKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkFence("fence", "the fence from which state will be exported.")
    VkExternalFenceHandleTypeFlagBits("handleType", "the type of handle requested.")
}

val VkImportFenceFdInfoKHR = struct(Module.VULKAN, "VkImportFenceFdInfoKHR") {
    documentation =
        """
        (None).

        <h5>Description</h5>
        The handle types supported by {@code handleType} are:

        <h6>Handle Types Supported by ##VkImportFenceFdInfoKHR</h6>
        <table class="lwjgl">
            <thead><tr><th>Handle Type</th><th>Transference</th><th>Permanence Supported</th></tr></thead>
            <tbody>
                <tr><td>#EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT</td><td>Reference</td><td>Temporary,Permanent</td></tr>
                <tr><td>#EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT</td><td>Copy</td><td>Temporary</td></tr>
            </tbody>
        </table>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-fence-handletypes-fd">Handle Types Supported by ##VkImportFenceFdInfoKHR</a> table</li>
            <li>{@code fd} <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#external-fence-handle-types-compatibility">external fence handle types compatibility</a></li>
        </ul>

        If {@code handleType} is #EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT, the special value {@code -1} for {@code fd} is treated like a valid sync file descriptor referring to an object that has already signaled. The import operation will succeed and the {@code VkFence} will have a temporarily imported payload as if a valid file descriptor had been provided.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This special behavior for importing an invalid sync file descriptor allows easier interoperability with other system APIs which use the convention that an invalid sync file descriptor represents work that has already completed and does not need to be waited for. It is consistent with the option for implementations to return a {@code -1} file descriptor when exporting a #EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT from a {@code VkFence} which is signaled.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkFenceImportFlagBits} values</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalFenceHandleTypeFlagBits} value</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        #ImportFenceFdKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkFence("fence", "the fence into which the payload will be imported.")
    VkFenceImportFlags("flags", "a bitmask of {@code VkFenceImportFlagBits} specifying additional parameters for the fence payload import operation.")
    VkExternalFenceHandleTypeFlagBits("handleType", "specifies the type of {@code fd}.")
    int("fd", "the external handle to import.")
}

val VkFenceGetFdInfoKHR = struct(Module.VULKAN, "VkFenceGetFdInfoKHR") {
    documentation =
        """
        Structure describing a POSIX FD fence export operation.

        <h5>Description</h5>
        The properties of the file descriptor returned depend on the value of {@code handleType}. See {@code VkExternalFenceHandleTypeFlagBits} for a description of the properties of the defined external fence handle types.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> have been included in ##VkExportFenceCreateInfo{@code ::handleTypes} when {@code fence}&#8217;s current payload was created</li>
            <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code fence} <b>must</b> be signaled, or have an associated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-fences-signaling">fence signal operation</a> pending execution</li>
            <li>{@code fence} <b>must</b> not currently have its payload replaced by an imported payload as described below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-fences-importing">Importing Fence Payloads</a> unless that imported payload&#8217;s handle type was included in ##VkExternalFenceProperties{@code ::exportFromImportedHandleTypes} for {@code handleType}</li>
            <li>{@code handleType} <b>must</b> be defined as a POSIX file descriptor handle</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalFenceHandleTypeFlagBits} value</li>
        </ul>

        <h5>See Also</h5>
        #GetFenceFdKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkFence("fence", "the fence from which state will be exported.")
    VkExternalFenceHandleTypeFlagBits("handleType", "the type of handle requested.")
}

val VkPhysicalDevicePerformanceQueryFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevicePerformanceQueryFeaturesKHR") {
    documentation =
        """
        Structure describing performance query support for an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("performanceCounterQueryPools", "indicates whether the implementation supports performance counter query pools.")
    VkBool32("performanceCounterMultipleQueryPools", "indicates whether the implementation supports using multiple performance query pools in a primary command buffer and secondary command buffers executed within it.")
}

val VkPhysicalDevicePerformanceQueryPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDevicePerformanceQueryPropertiesKHR", mutable = false) {
    documentation =
        """
        Structure describing performance query properties for an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR</li>
        </ul>

        If the ##VkPhysicalDevicePerformanceQueryPropertiesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent properties.
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkBool32("allowCommandBufferQueryCopies", "#TRUE if the performance query pools are allowed to be used with #CmdCopyQueryPoolResults().")
}

val VkPerformanceCounterKHR = struct(Module.VULKAN, "VkPerformanceCounterKHR", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation =
        """
        Structure providing information about a counter.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #EnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkPerformanceCounterUnitKHR("unit", "a {@code VkPerformanceCounterUnitKHR} specifying the unit that the counter data will record.")
    VkPerformanceCounterScopeKHR("scope", "a {@code VkPerformanceCounterScopeKHR} specifying the scope that the counter belongs to.")
    VkPerformanceCounterStorageKHR("storage", "a {@code VkPerformanceCounterStorageKHR} specifying the storage type that the counter&#8217;s data uses.")
    uint8_t("uuid", "an array of size #UUID_SIZE, containing 8-bit values that represent a universally unique identifier for the counter of the physical device.")["VK_UUID_SIZE"]
}

val VkPerformanceCounterDescriptionKHR = struct(Module.VULKAN, "VkPerformanceCounterDescriptionKHR", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation =
        """
        Structure providing more detailed information about a counter.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #EnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkPerformanceCounterDescriptionFlagsKHR("flags", "a bitmask of {@code VkPerformanceCounterDescriptionFlagBitsKHR} indicating the usage behavior for the counter.")
    charUTF8("name", "an array of size #MAX_DESCRIPTION_SIZE, containing a null-terminated UTF-8 string specifying the name of the counter.")["VK_MAX_DESCRIPTION_SIZE"]
    charUTF8("category", "an array of size #MAX_DESCRIPTION_SIZE, containing a null-terminated UTF-8 string specifying the category of the counter.")["VK_MAX_DESCRIPTION_SIZE"]
    charUTF8("description", "an array of size #MAX_DESCRIPTION_SIZE, containing a null-terminated UTF-8 string specifying the description of the counter.")["VK_MAX_DESCRIPTION_SIZE"]
}

val VkQueryPoolPerformanceCreateInfoKHR = struct(Module.VULKAN, "VkQueryPoolPerformanceCreateInfoKHR") {
    documentation =
        """
        Structure specifying parameters of a newly created performance query pool.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code queueFamilyIndex} <b>must</b> be a valid queue family index of the device</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-performanceCounterQueryPools">{@code performanceCounterQueryPools}</a> feature <b>must</b> be enabled</li>
            <li>Each element of {@code pCounterIndices} <b>must</b> be in the range of counters reported by {@code vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR} for the queue family specified in {@code queueFamilyIndex}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR</li>
            <li>{@code pCounterIndices} <b>must</b> be a valid pointer to an array of {@code counterIndexCount} {@code uint32_t} values</li>
            <li>{@code counterIndexCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        #GetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    uint32_t("queueFamilyIndex", "the queue family index to create this performance query pool for.")
    AutoSize("pCounterIndices")..uint32_t("counterIndexCount", "size of the {@code pCounterIndices} array.")
    uint32_t.const.p("pCounterIndices", "the array of indices into the #EnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(){@code ::pCounters} to enable in this performance query pool.")
}

val VkPerformanceCounterResultKHR = union(Module.VULKAN, "VkPerformanceCounterResultKHR") {
    documentation =
        """
        Union containing a performance counter result.
        """

    int32_t("int32", "")
    int64_t("int64", "")
    uint32_t("uint32", "")
    uint64_t("uint64", "")
    float("float32", "")
    double("float64", "")
}

val VkAcquireProfilingLockInfoKHR = struct(Module.VULKAN, "VkAcquireProfilingLockInfoKHR") {
    documentation =
        """
        Structure specifying parameters to acquire the profiling lock.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>

        If {@code timeout} is 0, {@code vkAcquireProfilingLockKHR} will not block while attempting to acquire the profling lock. If {@code timeout} is {@code UINT64_MAX}, the function will not return until the profiling lock was acquired.

        <h5>See Also</h5>
        #AcquireProfilingLockKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkAcquireProfilingLockFlagsKHR("flags", "reserved for future use.")
    uint64_t("timeout", "indicates how long the function waits, in nanoseconds, if the profiling lock is not available.")
}

val VkPerformanceQuerySubmitInfoKHR = struct(Module.VULKAN, "VkPerformanceQuerySubmitInfoKHR") {
    documentation =
        """
        Structure indicating which counter pass index is active for performance queries.

        <h5>Description</h5>
        If the ##VkSubmitInfo{@code ::pNext} chain does not include this structure, the batch defaults to use counter pass index 0.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code counterPassIndex} <b>must</b> be less than the number of counter passes required by any queries within the batch. The required number of counter passes for a performance query is obtained by calling #GetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR()</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    uint32_t("counterPassIndex", "specifies which counter pass index is active.")
}

val VkPhysicalDevicePointClippingPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDevicePointClippingPropertiesKHR", mutable = false, alias = VkPhysicalDevicePointClippingProperties) {
    documentation = "See ##VkPhysicalDevicePointClippingProperties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkPointClippingBehavior("pointClippingBehavior", "")
}

val VkRenderPassInputAttachmentAspectCreateInfoKHR = struct(Module.VULKAN, "VkRenderPassInputAttachmentAspectCreateInfoKHR", alias = VkRenderPassInputAttachmentAspectCreateInfo) {
    documentation = "See ##VkRenderPassInputAttachmentAspectCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    AutoSize("pAspectReferences")..uint32_t("aspectReferenceCount", "")
    VkInputAttachmentAspectReference.const.p("pAspectReferences", "")
}

val VkInputAttachmentAspectReferenceKHR = struct(Module.VULKAN, "VkInputAttachmentAspectReferenceKHR", alias = VkInputAttachmentAspectReference) {
    documentation = "See ##VkInputAttachmentAspectReference."

    uint32_t("subpass", "")
    uint32_t("inputAttachmentIndex", "")
    VkImageAspectFlags("aspectMask", "")
}

val VkImageViewUsageCreateInfoKHR = struct(Module.VULKAN, "VkImageViewUsageCreateInfoKHR", alias = VkImageViewUsageCreateInfo) {
    documentation = "See ##VkImageViewUsageCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkImageUsageFlags("usage", "")
}

val VkPipelineTessellationDomainOriginStateCreateInfoKHR = struct(Module.VULKAN, "VkPipelineTessellationDomainOriginStateCreateInfoKHR", alias = VkPipelineTessellationDomainOriginStateCreateInfo) {
    documentation = "See ##VkPipelineTessellationDomainOriginStateCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkTessellationDomainOrigin("domainOrigin", "")
}

val VkPhysicalDeviceSurfaceInfo2KHR = struct(Module.VULKAN, "VkPhysicalDeviceSurfaceInfo2KHR") {
    documentation =
        """
        Structure specifying a surface and related swapchain creation parameters.

        <h5>Description</h5>
        The members of ##VkPhysicalDeviceSurfaceInfo2KHR correspond to the arguments to #GetPhysicalDeviceSurfaceCapabilitiesKHR(), with {@code sType} and {@code pNext} added for extensibility.

        Additional capabilities of a surface <b>may</b> be available to swapchains created with different full-screen exclusive settings - particularly if exclusive full-screen access is application controlled. These additional capabilities <b>can</b> be queried by adding a ##VkSurfaceFullScreenExclusiveInfoEXT structure to the {@code pNext} chain of this structure when used to query surface properties. Additionally, for Win32 surfaces with application controlled exclusive full-screen access, chaining a ##VkSurfaceFullScreenExclusiveWin32InfoEXT structure <b>may</b> also report additional surface capabilities. These additional capabilities only apply to swapchains created with the same parameters included in the {@code pNext} chain of ##VkSwapchainCreateInfoKHR.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@code pNext} chain includes a ##VkSurfaceFullScreenExclusiveInfoEXT structure with its {@code fullScreenExclusive} member set to #FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT, and {@code surface} was created using #CreateWin32SurfaceKHR(), a ##VkSurfaceFullScreenExclusiveWin32InfoEXT structure <b>must</b> be included in the {@code pNext} chain</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR</li>
            <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of ##VkSurfaceFullScreenExclusiveInfoEXT or ##VkSurfaceFullScreenExclusiveWin32InfoEXT</li>
            <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
            <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
        </ul>

        <h5>See Also</h5>
        #GetDeviceGroupSurfacePresentModes2EXT(), #GetPhysicalDeviceSurfaceCapabilities2KHR(), #GetPhysicalDeviceSurfaceFormats2KHR(), #GetPhysicalDeviceSurfacePresentModes2EXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSurfaceKHR("surface", "the surface that will be associated with the swapchain.")
}

val VkSurfaceCapabilities2KHR = struct(Module.VULKAN, "VkSurfaceCapabilities2KHR", mutable = false) {
    documentation =
        """
        Structure describing capabilities of a surface.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR</li>
            <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of ##VkDisplayNativeHdrSurfaceCapabilitiesAMD, ##VkSharedPresentSurfaceCapabilitiesKHR, ##VkSurfaceCapabilitiesFullScreenExclusiveEXT, or ##VkSurfaceProtectedCapabilitiesKHR</li>
            <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
        </ul>

        <h5>See Also</h5>
        ##VkSurfaceCapabilitiesKHR, #GetPhysicalDeviceSurfaceCapabilities2KHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkSurfaceCapabilitiesKHR("surfaceCapabilities", "a ##VkSurfaceCapabilitiesKHR structure describing the capabilities of the specified surface.")
}

val VkSurfaceFormat2KHR = struct(Module.VULKAN, "VkSurfaceFormat2KHR", mutable = false) {
    documentation =
        """
        Structure describing a supported swapchain format tuple.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        ##VkSurfaceFormatKHR, #GetPhysicalDeviceSurfaceFormats2KHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkSurfaceFormatKHR("surfaceFormat", "a ##VkSurfaceFormatKHR structure describing a format-color space pair that is compatible with the specified surface.")
}

val VkPhysicalDeviceVariablePointerFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVariablePointerFeaturesKHR", alias = VkPhysicalDeviceVariablePointersFeatures) {
    documentation = "See ##VkPhysicalDeviceVariablePointersFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("variablePointersStorageBuffer", "")
    VkBool32("variablePointers", "")
}

val VkPhysicalDeviceVariablePointersFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVariablePointersFeaturesKHR", alias = VkPhysicalDeviceVariablePointersFeatures) {
    documentation = "See ##VkPhysicalDeviceVariablePointersFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("variablePointersStorageBuffer", "")
    VkBool32("variablePointers", "")
}

val VkDisplayProperties2KHR = struct(Module.VULKAN, "VkDisplayProperties2KHR", mutable = false) {
    documentation =
        """
        Structure describing an available display device.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        ##VkDisplayPropertiesKHR, #GetPhysicalDeviceDisplayProperties2KHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkDisplayPropertiesKHR("displayProperties", "a ##VkDisplayPropertiesKHR structure.")
}

val VkDisplayPlaneProperties2KHR = struct(Module.VULKAN, "VkDisplayPlaneProperties2KHR", mutable = false) {
    documentation =
        """
        Structure describing an available display plane.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        ##VkDisplayPlanePropertiesKHR, #GetPhysicalDeviceDisplayPlaneProperties2KHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkDisplayPlanePropertiesKHR("displayPlaneProperties", "a ##VkDisplayPlanePropertiesKHR structure.")
}

val VkDisplayModeProperties2KHR = struct(Module.VULKAN, "VkDisplayModeProperties2KHR", mutable = false) {
    documentation =
        """
        Structure describing an available display mode.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        ##VkDisplayModePropertiesKHR, #GetDisplayModeProperties2KHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkDisplayModePropertiesKHR("displayModeProperties", "a ##VkDisplayModePropertiesKHR structure.")
}

val VkDisplayPlaneInfo2KHR = struct(Module.VULKAN, "VkDisplayPlaneInfo2KHR") {
    documentation =
        """
        Structure defining the intended configuration of a display plane.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This parameter also implicitly specifies a display.
        </div>

        <ul>
            <li>{@code planeIndex} is the plane which the application intends to use with the display.</li>
        </ul>

        The members of ##VkDisplayPlaneInfo2KHR correspond to the arguments to #GetDisplayPlaneCapabilitiesKHR(), with {@code sType} and {@code pNext} added for extensibility.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code mode} <b>must</b> be a valid {@code VkDisplayModeKHR} handle</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code mode} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        #GetDisplayPlaneCapabilities2KHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDisplayModeKHR("mode", "the display mode the application intends to program when using the specified plane.")
    uint32_t("planeIndex", "")
}

val VkDisplayPlaneCapabilities2KHR = struct(Module.VULKAN, "VkDisplayPlaneCapabilities2KHR", mutable = false) {
    documentation =
        """
        Structure describing the capabilities of a mode and plane combination.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        ##VkDisplayPlaneCapabilitiesKHR, #GetDisplayPlaneCapabilities2KHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkDisplayPlaneCapabilitiesKHR("capabilities", "a ##VkDisplayPlaneCapabilitiesKHR structure.")
}

val VkMacOSSurfaceCreateInfoMVK = struct(Module.VULKAN, "VkMacOSSurfaceCreateInfoMVK") {
    documentation =
        """
        Structure specifying parameters of a newly created macOS surface object.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code pView} is a {@code CAMetalLayer} object, it <b>must</b> be a valid {@code CAMetalLayer}.</li>
            <li>If {@code pView} is an {@code NSView} object, it <b>must</b> be a valid {@code NSView}, <b>must</b> be backed by a {@code CALayer} object of type {@code CAMetalLayer}, and #CreateMacOSSurfaceMVK() <b>must</b> be called on the main thread.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>

        <h5>See Also</h5>
        #CreateMacOSSurfaceMVK()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkMacOSSurfaceCreateFlagsMVK("flags", "reserved for future use.")
    opaque_const_p("pView", "a reference to either a {@code CAMetalLayer} object or an {@code NSView} object.")
}

val VkMemoryDedicatedRequirementsKHR = struct(Module.VULKAN, "VkMemoryDedicatedRequirementsKHR", mutable = false, alias = VkMemoryDedicatedRequirements) {
    documentation = "See ##VkMemoryDedicatedRequirements."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkBool32("prefersDedicatedAllocation", "")
    VkBool32("requiresDedicatedAllocation", "")
}

val VkMemoryDedicatedAllocateInfoKHR = struct(Module.VULKAN, "VkMemoryDedicatedAllocateInfoKHR", alias = VkMemoryDedicatedAllocateInfo) {
    documentation = "See ##VkMemoryDedicatedAllocateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkImage("image", "")
    VkBuffer("buffer", "")
}

val VkDebugUtilsLabelEXT = struct(Module.VULKAN, "VkDebugUtilsLabelEXT") {
    documentation =
        """
        Specify parameters of a label region.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code pLabelName} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>

        <h5>See Also</h5>
        ##VkDebugUtilsMessengerCallbackDataEXT, #CmdBeginDebugUtilsLabelEXT(), #CmdInsertDebugUtilsLabelEXT(), #QueueBeginDebugUtilsLabelEXT(), #QueueInsertDebugUtilsLabelEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    charUTF8.const.p("pLabelName", "a pointer to a null-terminated UTF-8 string containing the name of the label.")
    float("color", "an optional RGBA color value that can be associated with the label. A particular implementation <b>may</b> choose to ignore this color value. The values contain RGBA values in order, in the range 0.0 to 1.0. If all elements in {@code color} are set to 0.0 then it is ignored.")[4]
}

val VkDebugUtilsObjectNameInfoEXT = struct(Module.VULKAN, "VkDebugUtilsObjectNameInfoEXT") {
    documentation =
        """
        Specify parameters of a name to give to an object.

        <h5>Description</h5>
        Applications <b>may</b> change the name associated with an object simply by calling {@code vkSetDebugUtilsObjectNameEXT} again with a new string. If {@code pObjectName} is either {@code NULL} or an empty string, then any previously set name is removed.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code objectType} is #OBJECT_TYPE_UNKNOWN, {@code objectHandle} <b>must</b> not be #NULL_HANDLE</li>
            <li>If {@code objectType} is not #OBJECT_TYPE_UNKNOWN, {@code objectHandle} <b>must</b> be #NULL_HANDLE or a valid Vulkan handle of the type associated with {@code objectType} as defined in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#debugging-object-types">{@code VkObjectType} and Vulkan Handle Relationship</a> table</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code objectType} <b>must</b> be a valid {@code VkObjectType} value</li>
            <li>If {@code pObjectName} is not {@code NULL}, {@code pObjectName} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>

        <h5>See Also</h5>
        ##VkDebugUtilsMessengerCallbackDataEXT, #SetDebugUtilsObjectNameEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkObjectType("objectType", "a {@code VkObjectType} specifying the type of the object to be named.")
    uint64_t("objectHandle", "the object to be named.")
    nullable..charUTF8.const.p("pObjectName", "either {@code NULL} or a null-terminated UTF-8 string specifying the name to apply to {@code objectHandle}.")
}

val VkDebugUtilsMessengerCallbackDataEXT = struct(Module.VULKAN, "VkDebugUtilsMessengerCallbackDataEXT") {
    documentation =
        """
        Structure specifying parameters returned to the callback.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This structure should only be considered valid during the lifetime of the triggered callback.
        </div>

        Since adding queue and command buffer labels behaves like pushing and popping onto a stack, the order of both {@code pQueueLabels} and {@code pCmdBufLabels} is based on the order the labels were defined. The result is that the first label in either {@code pQueueLabels} or {@code pCmdBufLabels} will be the first defined (and therefore the oldest) while the last label in each list will be the most recent.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        {@code pQueueLabels} will only be non-{@code NULL} if one of the objects in {@code pObjects} can be related directly to a defined {@code VkQueue} which has had one or more labels associated with it.

        Likewise, {@code pCmdBufLabels} will only be non-{@code NULL} if one of the objects in {@code pObjects} can be related directly to a defined {@code VkCommandBuffer} which has had one or more labels associated with it. Additionally, while command buffer labels allow for beginning and ending across different command buffers, the debug messaging framework <b>cannot</b> guarantee that labels in {@code pCmdBufLables} will contain those defined outside of the associated command buffer. This is partially due to the fact that the association of one command buffer with another may not have been defined at the time the debug message is triggered.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>If {@code pMessageIdName} is not {@code NULL}, {@code pMessageIdName} <b>must</b> be a null-terminated UTF-8 string</li>
            <li>{@code pMessage} <b>must</b> be a null-terminated UTF-8 string</li>
            <li>If {@code queueLabelCount} is not 0, {@code pQueueLabels} <b>must</b> be a valid pointer to an array of {@code queueLabelCount} valid ##VkDebugUtilsLabelEXT structures</li>
            <li>If {@code cmdBufLabelCount} is not 0, {@code pCmdBufLabels} <b>must</b> be a valid pointer to an array of {@code cmdBufLabelCount} valid ##VkDebugUtilsLabelEXT structures</li>
            <li>If {@code objectCount} is not 0, {@code pObjects} <b>must</b> be a valid pointer to an array of {@code objectCount} valid ##VkDebugUtilsObjectNameInfoEXT structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkDebugUtilsLabelEXT, ##VkDebugUtilsObjectNameInfoEXT, #SubmitDebugUtilsMessageEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDebugUtilsMessengerCallbackDataFlagsEXT("flags", "0 and is reserved for future use.")
    nullable..charUTF8.const.p("pMessageIdName", "a null-terminated string that identifies the particular message ID that is associated with the provided message. If the message corresponds to a validation layer message, then this string may contain the portion of the Vulkan specification that is believed to have been violated.")
    int32_t("messageIdNumber", "the ID number of the triggering message. If the message corresponds to a validation layer message, then this number is related to the internal number associated with the message being triggered.")
    charUTF8.const.p("pMessage", "a null-terminated string detailing the trigger conditions.")
    AutoSize("pQueueLabels", optional = true)..uint32_t("queueLabelCount", "a count of items contained in the {@code pQueueLabels} array.")
    VkDebugUtilsLabelEXT.const.p("pQueueLabels", "{@code NULL} or a pointer to an array of ##VkDebugUtilsLabelEXT active in the current {@code VkQueue} at the time the callback was triggered. Refer to <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#debugging-queue-labels\">Queue Labels</a> for more information.")
    AutoSize("pCmdBufLabels", optional = true)..uint32_t("cmdBufLabelCount", "a count of items contained in the {@code pCmdBufLabels} array.")
    VkDebugUtilsLabelEXT.const.p("pCmdBufLabels", "{@code NULL} or a pointer to an array of ##VkDebugUtilsLabelEXT active in the current {@code VkCommandBuffer} at the time the callback was triggered. Refer to <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#debugging-command-buffer-labels\">Command Buffer Labels</a> for more information.")
    AutoSize("pObjects", optional = true)..uint32_t("objectCount", "a count of items contained in the {@code pObjects} array.")
    VkDebugUtilsObjectNameInfoEXT.const.p("pObjects", "a pointer to an array of ##VkDebugUtilsObjectNameInfoEXT objects related to the detected issue. The array is roughly in order or importance, but the 0th element is always guaranteed to be the most important object for this message.")
}

val VkDebugUtilsMessengerCreateInfoEXT = struct(Module.VULKAN, "VkDebugUtilsMessengerCreateInfoEXT") {
    documentation =
        """
        Structure specifying parameters of a newly created debug messenger.

        <h5>Description</h5>
        For each {@code VkDebugUtilsMessengerEXT} that is created the ##VkDebugUtilsMessengerCreateInfoEXT{@code ::messageSeverity} and ##VkDebugUtilsMessengerCreateInfoEXT{@code ::messageType} determine when that ##VkDebugUtilsMessengerCreateInfoEXT{@code ::pfnUserCallback} is called. The process to determine if the user's {@code pfnUserCallback} is triggered when an event occurs is as follows:

        <ul>
            <li>
                The implementation will perform a bitwise AND of the event&#8217;s {@code VkDebugUtilsMessageSeverityFlagBitsEXT} with the {@code messageSeverity} provided during creation of the {@code VkDebugUtilsMessengerEXT} object.
                <ul>
                    <li>If the value is 0, the message is skipped.</li>
                </ul>
            </li>
            <li>
                The implementation will perform bitwise AND of the event&#8217;s {@code VkDebugUtilsMessageTypeFlagBitsEXT} with the {@code messageType} provided during the creation of the {@code VkDebugUtilsMessengerEXT} object.
                <ul>
                    <li>If the value is 0, the message is skipped.</li>
                </ul>
            </li>
            <li>The callback will trigger a debug message for the current event</li>
        </ul>

        The callback will come directly from the component that detected the event, unless some other layer intercepts the calls for its own purposes (filter them in a different way, log to a system error log, etc.).

        An application <b>can</b> receive multiple callbacks if multiple {@code VkDebugUtilsMessengerEXT} objects are created. A callback will always be executed in the same thread as the originating Vulkan call.

        A callback <b>can</b> be called from multiple threads simultaneously (if the application is making Vulkan calls from multiple threads).

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pfnUserCallback} <b>must</b> be a valid ##VkDebugUtilsMessengerCallbackEXT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code messageSeverity} <b>must</b> be a valid combination of {@code VkDebugUtilsMessageSeverityFlagBitsEXT} values</li>
            <li>{@code messageSeverity} <b>must</b> not be 0</li>
            <li>{@code messageType} <b>must</b> be a valid combination of {@code VkDebugUtilsMessageTypeFlagBitsEXT} values</li>
            <li>{@code messageType} <b>must</b> not be 0</li>
            <li>{@code pfnUserCallback} <b>must</b> be a valid ##VkDebugUtilsMessengerCallbackEXT value</li>
        </ul>

        <h5>See Also</h5>
        ##VkDebugUtilsMessengerCallbackEXT, #CreateDebugUtilsMessengerEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDebugUtilsMessengerCreateFlagsEXT("flags", "0 and is reserved for future use.")
    VkDebugUtilsMessageSeverityFlagsEXT("messageSeverity", "a bitmask of {@code VkDebugUtilsMessageSeverityFlagBitsEXT} specifying which severity of event(s) will cause this callback to be called.")
    VkDebugUtilsMessageTypeFlagsEXT("messageType", "a bitmask of {@code VkDebugUtilsMessageTypeFlagBitsEXT} specifying which type of event(s) will cause this callback to be called.")
    PFN_vkDebugUtilsMessengerCallbackEXT("pfnUserCallback", "the application callback function to call.")
    nullable..opaque_p("pUserData", "user data to be passed to the callback.")
}

val VkDebugUtilsObjectTagInfoEXT = struct(Module.VULKAN, "VkDebugUtilsObjectTagInfoEXT") {
    documentation =
        """
        Specify parameters of a tag to attach to an object.

        <h5>Description</h5>
        The {@code tagName} parameter gives a name or identifier to the type of data being tagged. This can be used by debugging layers to easily filter for only data that can be used by that implementation.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code objectType} <b>must</b> not be #OBJECT_TYPE_UNKNOWN</li>
            <li>{@code objectHandle} <b>must</b> be a valid Vulkan handle of the type associated with {@code objectType} as defined in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#debugging-object-types">{@code VkObjectType} and Vulkan Handle Relationship</a> table</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code objectType} <b>must</b> be a valid {@code VkObjectType} value</li>
            <li>{@code pTag} <b>must</b> be a valid pointer to an array of {@code tagSize} bytes</li>
            <li>{@code tagSize} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        #SetDebugUtilsObjectTagEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkObjectType("objectType", "a {@code VkObjectType} specifying the type of the object to be named.")
    uint64_t("objectHandle", "the object to be tagged.")
    uint64_t("tagName", "a numerical identifier of the tag.")
    AutoSize("pTag")..size_t("tagSize", "the number of bytes of data to attach to the object.")
    void.const.p("pTag", "a pointer to an array of {@code tagSize} bytes containing the data to be associated with the object.")
}

val VkSamplerReductionModeCreateInfoEXT = struct(Module.VULKAN, "VkSamplerReductionModeCreateInfoEXT", alias = VkSamplerReductionModeCreateInfo) {
    documentation = "See ##VkSamplerReductionModeCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkSamplerReductionMode("reductionMode", "")
}

val VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT", mutable = false, alias = VkPhysicalDeviceSamplerFilterMinmaxProperties) {
    documentation = "See ##VkPhysicalDeviceSamplerFilterMinmaxProperties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkBool32("filterMinmaxSingleComponentFormats", "")
    VkBool32("filterMinmaxImageComponentMapping", "")
}

val VkPhysicalDeviceInlineUniformBlockFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceInlineUniformBlockFeaturesEXT") {
    documentation =
        """
        Structure describing inline uniform block features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceInlineUniformBlockFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceInlineUniformBlockFeaturesEXT <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("inlineUniformBlock", "indicates whether the implementation supports inline uniform block descriptors. If this feature is not enabled, #DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT <b>must</b> not be used.")
    VkBool32("descriptorBindingInlineUniformBlockUpdateAfterBind", "indicates whether the implementation supports updating inline uniform block descriptors after a set is bound. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT <b>must</b> not be used with #DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT.")
}

val VkPhysicalDeviceInlineUniformBlockPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceInlineUniformBlockPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing inline uniform block properties that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceInlineUniformBlockPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("maxInlineUniformBlockSize", "the maximum size in bytes of an <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#descriptorsets-inlineuniformblock\">inline uniform block</a> binding.")
    uint32_t("maxPerStageDescriptorInlineUniformBlocks", "")
    uint32_t("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks", "similar to {@code maxPerStageDescriptorInlineUniformBlocks} but counts descriptor bindings from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT bit set.")
    uint32_t("maxDescriptorSetInlineUniformBlocks", "the maximum number of inline uniform block bindings that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptor bindings with a descriptor type of #DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT count against this limit. Only descriptor bindings in descriptor set layouts created without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT bit set count against this limit.")
    uint32_t("maxDescriptorSetUpdateAfterBindInlineUniformBlocks", "similar to {@code maxDescriptorSetInlineUniformBlocks} but counts descriptor bindings from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT bit set.")
}

val VkWriteDescriptorSetInlineUniformBlockEXT = struct(Module.VULKAN, "VkWriteDescriptorSetInlineUniformBlockEXT") {
    documentation =
        """
        Structure specifying inline uniform block data.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dataSize} <b>must</b> be an integer multiple of 4</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK_EXT</li>
            <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
            <li>{@code dataSize} <b>must</b> be greater than 0</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pData")..uint32_t("dataSize", "the number of bytes of inline uniform block data pointed to by {@code pData}.")
    void.const.p("pData", "a pointer to {@code dataSize} number of bytes of data to write to the inline uniform block.")
}

val VkDescriptorPoolInlineUniformBlockCreateInfoEXT = struct(Module.VULKAN, "VkDescriptorPoolInlineUniformBlockCreateInfoEXT") {
    documentation =
        """
        Structure specifying the maximum number of inline uniform block bindings of a newly created descriptor pool.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    uint32_t("maxInlineUniformBlockBindings", "the number of inline uniform block bindings to allocate.")
}

val VkSampleLocationEXT = struct(Module.VULKAN, "VkSampleLocationEXT") {
    documentation =
        """
        Structure specifying the coordinates of a sample location.

        <h5>Description</h5>
        The domain space of the sample location coordinates has an upper-left origin within the pixel in framebuffer space.

        The values specified in a ##VkSampleLocationEXT structure are always clamped to the implementation-dependent sample location coordinate range <code>[sampleLocationCoordinateRange[0],sampleLocationCoordinateRange[1]]</code> that <b>can</b> be queried by adding a ##VkPhysicalDeviceSampleLocationsPropertiesEXT structure to the {@code pNext} chain of ##VkPhysicalDeviceProperties2.

        <h5>See Also</h5>
        ##VkSampleLocationsInfoEXT
        """

    float("x", "the horizontal coordinate of the sample&#8217;s location.")
    float("y", "the vertical coordinate of the sample&#8217;s location.")
}

val VkSampleLocationsInfoEXT = struct(Module.VULKAN, "VkSampleLocationsInfoEXT") {
    documentation =
        """
        Structure specifying a set of sample locations.

        <h5>Description</h5>
        This structure <b>can</b> be used either to specify the sample locations to be used for rendering or to specify the set of sample locations an image subresource has been last rendered with for the purposes of layout transitions of depth/stencil images created with #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT.

        The sample locations in {@code pSampleLocations} specify {@code sampleLocationsPerPixel} number of sample locations for each pixel in the grid of the size specified in {@code sampleLocationGridSize}. The sample location for sample <code>i</code> at the pixel grid location <code>(x,y)</code> is taken from <code>pSampleLocations[(x + y × sampleLocationGridSize.width) × sampleLocationsPerPixel + i]</code>.

        If the render pass has a fragment density map, the implementation will choose the sample locations for the fragment and the contents of {@code pSampleLocations} <b>may</b> be ignored.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code sampleLocationsPerPixel} <b>must</b> be a bit value that is set in ##VkPhysicalDeviceSampleLocationsPropertiesEXT{@code ::sampleLocationSampleCounts}</li>
            <li>{@code sampleLocationsCount} <b>must</b> equal <code>sampleLocationsPerPixel × sampleLocationGridSize.width × sampleLocationGridSize.height</code></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT</li>
            <li>If {@code sampleLocationsCount} is not 0, {@code pSampleLocations} <b>must</b> be a valid pointer to an array of {@code sampleLocationsCount} ##VkSampleLocationEXT structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentSampleLocationsEXT, ##VkExtent2D, ##VkPipelineSampleLocationsStateCreateInfoEXT, ##VkSampleLocationEXT, ##VkSubpassSampleLocationsEXT, #CmdSetSampleLocationsEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSampleCountFlagBits("sampleLocationsPerPixel", "a {@code VkSampleCountFlagBits} value specifying the number of sample locations per pixel.")
    VkExtent2D("sampleLocationGridSize", "the size of the sample location grid to select custom sample locations for.")
    AutoSize("pSampleLocations", optional = true)..uint32_t("sampleLocationsCount", "the number of sample locations in {@code pSampleLocations}.")
    VkSampleLocationEXT.const.p("pSampleLocations", "a pointer to an array of {@code sampleLocationsCount} ##VkSampleLocationEXT structures.")
}

val VkAttachmentSampleLocationsEXT = struct(Module.VULKAN, "VkAttachmentSampleLocationsEXT") {
    documentation =
        """
        Structure specifying the sample locations state to use in the initial layout transition of attachments.

        <h5>Description</h5>
        If the image referenced by the framebuffer attachment at index {@code attachmentIndex} was not created with #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT then the values specified in {@code sampleLocationsInfo} are ignored.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code attachmentIndex} <b>must</b> be less than the {@code attachmentCount} specified in ##VkRenderPassCreateInfo the render pass specified by ##VkRenderPassBeginInfo{@code ::renderPass} was created with</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sampleLocationsInfo} <b>must</b> be a valid ##VkSampleLocationsInfoEXT structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkRenderPassSampleLocationsBeginInfoEXT, ##VkSampleLocationsInfoEXT
        """

    uint32_t("attachmentIndex", "the index of the attachment for which the sample locations state is provided.")
    VkSampleLocationsInfoEXT("sampleLocationsInfo", "the sample locations state to use for the layout transition of the given attachment from the initial layout of the attachment to the image layout specified for the attachment in the first subpass using it.")
}

val VkSubpassSampleLocationsEXT = struct(Module.VULKAN, "VkSubpassSampleLocationsEXT") {
    documentation =
        """
        Structure specifying the sample locations state to use for layout transitions of attachments performed after a given subpass.

        <h5>Description</h5>
        If the image referenced by the depth/stencil attachment used in the subpass identified by {@code subpassIndex} was not created with #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT or if the subpass does not use a depth/stencil attachment, and ##VkPhysicalDeviceSampleLocationsPropertiesEXT{@code ::variableSampleLocations} is #TRUE then the values specified in {@code sampleLocationsInfo} are ignored.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code subpassIndex} <b>must</b> be less than the {@code subpassCount} specified in ##VkRenderPassCreateInfo the render pass specified by ##VkRenderPassBeginInfo{@code ::renderPass} was created with</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sampleLocationsInfo} <b>must</b> be a valid ##VkSampleLocationsInfoEXT structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkRenderPassSampleLocationsBeginInfoEXT, ##VkSampleLocationsInfoEXT
        """

    uint32_t("subpassIndex", "the index of the subpass for which the sample locations state is provided.")
    VkSampleLocationsInfoEXT("sampleLocationsInfo", "the sample locations state to use for the layout transition of the depth/stencil attachment away from the image layout the attachment is used with in the subpass specified in {@code subpassIndex}.")
}

val VkRenderPassSampleLocationsBeginInfoEXT = struct(Module.VULKAN, "VkRenderPassSampleLocationsBeginInfoEXT") {
    documentation =
        """
        Structure specifying sample locations to use for the layout transition of custom sample locations compatible depth/stencil attachments.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT</li>
            <li>If {@code attachmentInitialSampleLocationsCount} is not 0, {@code pAttachmentInitialSampleLocations} <b>must</b> be a valid pointer to an array of {@code attachmentInitialSampleLocationsCount} valid ##VkAttachmentSampleLocationsEXT structures</li>
            <li>If {@code postSubpassSampleLocationsCount} is not 0, {@code pPostSubpassSampleLocations} <b>must</b> be a valid pointer to an array of {@code postSubpassSampleLocationsCount} valid ##VkSubpassSampleLocationsEXT structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentSampleLocationsEXT, ##VkSubpassSampleLocationsEXT
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pAttachmentInitialSampleLocations", optional = true)..uint32_t("attachmentInitialSampleLocationsCount", "the number of elements in the {@code pAttachmentInitialSampleLocations} array.")
    VkAttachmentSampleLocationsEXT.const.p("pAttachmentInitialSampleLocations", "a pointer to an array of {@code attachmentInitialSampleLocationsCount} ##VkAttachmentSampleLocationsEXT structures specifying the attachment indices and their corresponding sample location state. Each element of {@code pAttachmentInitialSampleLocations} <b>can</b> specify the sample location state to use in the automatic layout transition performed to transition a depth/stencil attachment from the initial layout of the attachment to the image layout specified for the attachment in the first subpass using it.")
    AutoSize("pPostSubpassSampleLocations", optional = true)..uint32_t("postSubpassSampleLocationsCount", "the number of elements in the {@code pPostSubpassSampleLocations} array.")
    VkSubpassSampleLocationsEXT.const.p("pPostSubpassSampleLocations", "a pointer to an array of {@code postSubpassSampleLocationsCount} ##VkSubpassSampleLocationsEXT structures specifying the subpass indices and their corresponding sample location state. Each element of {@code pPostSubpassSampleLocations} <b>can</b> specify the sample location state to use in the automatic layout transition performed to transition the depth/stencil attachment used by the specified subpass to the image layout specified in a dependent subpass or to the final layout of the attachment in case the specified subpass is the last subpass using that attachment. In addition, if ##VkPhysicalDeviceSampleLocationsPropertiesEXT{@code ::variableSampleLocations} is #FALSE, each element of {@code pPostSubpassSampleLocations} <b>must</b> specify the sample location state that matches the sample locations used by all pipelines that will be bound to a command buffer during the specified subpass. If {@code variableSampleLocations} is #TRUE, the sample locations used for rasterization do not depend on {@code pPostSubpassSampleLocations}.")
}

val VkPipelineSampleLocationsStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineSampleLocationsStateCreateInfoEXT") {
    documentation =
        """
        Structure specifying sample locations for a pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT</li>
            <li>{@code sampleLocationsInfo} <b>must</b> be a valid ##VkSampleLocationsInfoEXT structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkSampleLocationsInfoEXT
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("sampleLocationsEnable", "controls whether custom sample locations are used. If {@code sampleLocationsEnable} is #FALSE, the default sample locations are used and the values specified in {@code sampleLocationsInfo} are ignored.")
    VkSampleLocationsInfoEXT("sampleLocationsInfo", "the sample locations to use during rasterization if {@code sampleLocationsEnable} is #TRUE and the graphics pipeline is not created with #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT.")
}

val VkPhysicalDeviceSampleLocationsPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceSampleLocationsPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing sample location limits that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceSampleLocationsPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent2D
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkSampleCountFlags("sampleLocationSampleCounts", "a bitmask of {@code VkSampleCountFlagBits} indicating the sample counts supporting custom sample locations.")
    VkExtent2D("maxSampleLocationGridSize", "the maximum size of the pixel grid in which sample locations <b>can</b> vary that is supported for all sample counts in {@code sampleLocationSampleCounts}.")
    float("sampleLocationCoordinateRange", "the range of supported sample location coordinates.")[2]
    uint32_t("sampleLocationSubPixelBits", "the number of bits of subpixel precision for sample locations.")
    VkBool32("variableSampleLocations", "specifies whether the sample locations used by all pipelines that will be bound to a command buffer during a subpass <b>must</b> match. If set to #TRUE, the implementation supports variable sample locations in a subpass. If set to #FALSE, then the sample locations <b>must</b> stay constant in each subpass.")
}

val VkMultisamplePropertiesEXT = struct(Module.VULKAN, "VkMultisamplePropertiesEXT", mutable = false) {
    documentation =
        """
        Structure returning information about sample count specific additional multisampling capabilities.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent2D, #GetPhysicalDeviceMultisamplePropertiesEXT()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkExtent2D("maxSampleLocationGridSize", "the maximum size of the pixel grid in which sample locations <b>can</b> vary.")
}

val VkBufferMemoryRequirementsInfo2KHR = struct(Module.VULKAN, "VkBufferMemoryRequirementsInfo2KHR", alias = VkBufferMemoryRequirementsInfo2) {
    documentation = "See ##VkBufferMemoryRequirementsInfo2."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkBuffer("buffer", "")
}

val VkImageMemoryRequirementsInfo2KHR = struct(Module.VULKAN, "VkImageMemoryRequirementsInfo2KHR", alias = VkImageMemoryRequirementsInfo2) {
    documentation = "See ##VkImageMemoryRequirementsInfo2."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkImage("image", "")
}

val VkImageSparseMemoryRequirementsInfo2KHR = struct(Module.VULKAN, "VkImageSparseMemoryRequirementsInfo2KHR", alias = VkImageSparseMemoryRequirementsInfo2) {
    documentation = "See ##VkImageSparseMemoryRequirementsInfo2."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkImage("image", "")
}

val VkMemoryRequirements2KHR = struct(Module.VULKAN, "VkMemoryRequirements2KHR", mutable = false, alias = VkMemoryRequirements2) {
    documentation = "See ##VkMemoryRequirements2."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkMemoryRequirements("memoryRequirements", "")
}

val VkSparseImageMemoryRequirements2KHR = struct(Module.VULKAN, "VkSparseImageMemoryRequirements2KHR", mutable = false, alias = VkSparseImageMemoryRequirements2) {
    documentation = "See ##VkSparseImageMemoryRequirements2."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkSparseImageMemoryRequirements("memoryRequirements", "")
}

val VkImageFormatListCreateInfoKHR = struct(Module.VULKAN, "VkImageFormatListCreateInfoKHR", alias = VkImageFormatListCreateInfo) {
    documentation = "See ##VkImageFormatListCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    AutoSize("pViewFormats", optional = true)..uint32_t("viewFormatCount", "")
    VkFormat.const.p("pViewFormats", "")
}

val VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT") {
    documentation =
        """
        Structure describing advanced blending features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("advancedBlendCoherentOperations", "specifies whether blending using <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#framebuffer-blend-advanced\">advanced blend operations</a> is guaranteed to execute atomically and in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#drawing-primitive-order\">primitive order</a>. If this is #TRUE, #ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT is treated the same as #ACCESS_COLOR_ATTACHMENT_READ_BIT, and advanced blending needs no additional synchronization over basic blending. If this is #FALSE, then memory dependencies are required to guarantee order between two advanced blending operations that occur on the same sample.")
}

val VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing advanced blending limits that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("advancedBlendMaxColorAttachments", "one greater than the highest color attachment index that <b>can</b> be used in a subpass, for a pipeline that uses an <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#framebuffer-blend-advanced\">advanced blend operation</a>.")
    VkBool32("advancedBlendIndependentBlend", "specifies whether advanced blend operations <b>can</b> vary per-attachment.")
    VkBool32("advancedBlendNonPremultipliedSrcColor", "specifies whether the source color <b>can</b> be treated as non-premultiplied. If this is #FALSE, then ##VkPipelineColorBlendAdvancedStateCreateInfoEXT{@code ::srcPremultiplied} <b>must</b> be #TRUE.")
    VkBool32("advancedBlendNonPremultipliedDstColor", "specifies whether the destination color <b>can</b> be treated as non-premultiplied. If this is #FALSE, then ##VkPipelineColorBlendAdvancedStateCreateInfoEXT{@code ::dstPremultiplied} <b>must</b> be #TRUE.")
    VkBool32("advancedBlendCorrelatedOverlap", "specifies whether the overlap mode <b>can</b> be treated as correlated. If this is #FALSE, then ##VkPipelineColorBlendAdvancedStateCreateInfoEXT{@code ::blendOverlap} <b>must</b> be #BLEND_OVERLAP_UNCORRELATED_EXT.")
    VkBool32("advancedBlendAllOperations", "specifies whether all advanced blend operation enums are supported. See the valid usage of ##VkPipelineColorBlendAttachmentState.")
}

val VkPipelineColorBlendAdvancedStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineColorBlendAdvancedStateCreateInfoEXT") {
    documentation =
        """
        Structure specifying parameters that affect advanced blend operations.

        <h5>Description</h5>
        If this structure is not present, {@code srcPremultiplied} and {@code dstPremultiplied} are both considered to be #TRUE, and {@code blendOverlap} is considered to be #BLEND_OVERLAP_UNCORRELATED_EXT.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-advancedBlendNonPremultipliedSrcColor">non-premultiplied source color</a> property is not supported, {@code srcPremultiplied} <b>must</b> be #TRUE</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-advancedBlendNonPremultipliedDstColor">non-premultiplied destination color</a> property is not supported, {@code dstPremultiplied} <b>must</b> be #TRUE</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-advancedBlendCorrelatedOverlap">correlated overlap</a> property is not supported, {@code blendOverlap} <b>must</b> be #BLEND_OVERLAP_UNCORRELATED_EXT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT</li>
            <li>{@code blendOverlap} <b>must</b> be a valid {@code VkBlendOverlapEXT} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("srcPremultiplied", "specifies whether the source color of the blend operation is treated as premultiplied.")
    VkBool32("dstPremultiplied", "specifies whether the destination color of the blend operation is treated as premultiplied.")
    VkBlendOverlapEXT("blendOverlap", "a {@code VkBlendOverlapEXT} value specifying how the source and destination sample&#8217;s coverage is correlated.")
}

val VkPipelineCoverageToColorStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineCoverageToColorStateCreateInfoNV") {
    documentation =
        """
        Structure specifying whether fragment coverage replaces a color.

        <h5>Description</h5>
        If the {@code pNext} chain of ##VkPipelineMultisampleStateCreateInfo includes a ##VkPipelineCoverageToColorStateCreateInfoNV structure, then that structure controls whether the fragment coverage is substituted for a fragment color output and, if so, which output is replaced.

        If {@code coverageToColorEnable} is #TRUE, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#primsrast-multisampling-coverage-mask">coverage mask</a> replaces the first component of the color value corresponding to the fragment shader output location with {@code Location} equal to {@code coverageToColorLocation} and {@code Index} equal to zero. If the color attachment format has fewer bits than the coverage mask, the low bits of the sample coverage mask are taken without any clamping. If the color attachment format has more bits than the coverage mask, the high bits of the sample coverage mask are filled with zeros.

        If {@code coverageToColorEnable} is #FALSE, these operations are skipped. If this structure is not present, it is as if {@code coverageToColorEnable} is #FALSE.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code coverageToColorEnable} is #TRUE, then the render pass subpass indicated by ##VkGraphicsPipelineCreateInfo{@code ::renderPass} and ##VkGraphicsPipelineCreateInfo{@code ::subpass} <b>must</b> have a color attachment at the location selected by {@code coverageToColorLocation}, with a {@code VkFormat} of #FORMAT_R8_UINT, #FORMAT_R8_SINT, #FORMAT_R16_UINT, #FORMAT_R16_SINT, #FORMAT_R32_UINT, or #FORMAT_R32_SINT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure")
    VkPipelineCoverageToColorStateCreateFlagsNV("flags", "reserved for future use.")
    VkBool32("coverageToColorEnable", "controls whether the fragment coverage value replaces a fragment color output.")
    uint32_t("coverageToColorLocation", "controls which fragment shader color output value is replaced.")
}

val VkDeviceOrHostAddressKHR = union(Module.VULKAN, "VkDeviceOrHostAddressKHR") {
    documentation =
        """
        Union specifying a device or host address.
        """

    VkDeviceAddress("deviceAddress", "a buffer device address as returned by the #GetBufferDeviceAddressKHR() command.")
    opaque_p("hostAddress", "a host memory address.")
}

val VkDeviceOrHostAddressConstKHR = union(Module.VULKAN, "VkDeviceOrHostAddressConstKHR") {
    documentation =
        """
        Union specifying a const device or host address.
        """

    VkDeviceAddress("deviceAddress", "a buffer device address as returned by the #GetBufferDeviceAddressKHR() command.")
    opaque_const_p("hostAddress", "a const host memory address.")
}

val VkAccelerationStructureBuildRangeInfoKHR = struct(Module.VULKAN, "VkAccelerationStructureBuildRangeInfoKHR") {
    documentation =
        """
        Structure specifying build offsets and counts for acceleration structure builds.

        <h5>Description</h5>
        The primitive count and primitive offset are interpreted differently depending on the {@code VkGeometryTypeKHR} used:

        <ul>
            <li>
                For geometries of type #GEOMETRY_TYPE_TRIANGLES_KHR, {@code primitiveCount} is the number of triangles to be built, where each triangle is treated as 3 vertices.
                <ul>
                    <li>If the geometry uses indices, <code>primitiveCount × 3</code> indices are consumed from ##VkAccelerationStructureGeometryTrianglesDataKHR{@code ::indexData}, starting at an offset of {@code primitiveOffset}. The value of {@code firstVertex} is added to the index values before fetching vertices.</li>
                    <li>If the geometry does not use indices, <code>primitiveCount × 3</code> vertices are consumed from ##VkAccelerationStructureGeometryTrianglesDataKHR{@code ::vertexData}, starting at an offset of <code>primitiveOffset ##VkAccelerationStructureGeometryTrianglesDataKHR::vertexStride × firstVertex</code>.</li>
                    <li>A single ##VkTransformMatrixKHR structure is consumed from ##VkAccelerationStructureGeometryTrianglesDataKHR{@code ::transformData}, at an offset of {@code transformOffset}. This transformation matrix is used by all triangles.</li>
                </ul>
            </li>
            <li>For geometries of type #GEOMETRY_TYPE_AABBS_KHR, {@code primitiveCount} is the number of axis-aligned bounding boxes. {@code primitiveCount} ##VkAabbPositionsKHR structures are consumed from ##VkAccelerationStructureGeometryAabbsDataKHR{@code ::data}, starting at an offset of {@code primitiveOffset}.</li>
            <li>For geometries of type #GEOMETRY_TYPE_INSTANCES_KHR, {@code primitiveCount} is the number of acceleration structures. {@code primitiveCount} ##VkAccelerationStructureInstanceKHR structures are consumed from ##VkAccelerationStructureGeometryInstancesDataKHR{@code ::data}, starting at an offset of {@code primitiveOffset}.</li>
        </ul>

        <h5>Valid Usage</h5>
        <ul>
            <li>For geometries of type #GEOMETRY_TYPE_TRIANGLES_KHR, if the geometry uses indices, the offset {@code primitiveOffset} from ##VkAccelerationStructureGeometryTrianglesDataKHR{@code ::indexData} <b>must</b> be a multiple of the element size of ##VkAccelerationStructureGeometryTrianglesDataKHR{@code ::indexType}</li>
            <li>For geometries of type #GEOMETRY_TYPE_TRIANGLES_KHR, if the geometry doesn&#8217;t use indices, the offset {@code primitiveOffset} from ##VkAccelerationStructureGeometryTrianglesDataKHR{@code ::vertexData} <b>must</b> be a multiple of the component size of ##VkAccelerationStructureGeometryTrianglesDataKHR{@code ::vertexFormat}</li>
            <li>For geometries of type #GEOMETRY_TYPE_TRIANGLES_KHR, the offset {@code transformOffset} from ##VkAccelerationStructureGeometryTrianglesDataKHR{@code ::transformData} <b>must</b> be a multiple of 16</li>
            <li>For geometries of type #GEOMETRY_TYPE_AABBS_KHR, the offset {@code primitiveOffset} from ##VkAccelerationStructureGeometryAabbsDataKHR{@code ::data} <b>must</b> be a multiple of 8</li>
            <li>For geometries of type #GEOMETRY_TYPE_INSTANCES_KHR, the offset {@code primitiveOffset} from ##VkAccelerationStructureGeometryInstancesDataKHR{@code ::data} <b>must</b> be a multiple of 16</li>
        </ul>

        <h5>See Also</h5>
        #BuildAccelerationStructuresKHR(), #CmdBuildAccelerationStructuresKHR()
        """

    uint32_t("primitiveCount", "defines the number of primitives for a corresponding acceleration structure geometry.")
    uint32_t("primitiveOffset", "defines an offset in bytes into the memory where primitive data is defined.")
    uint32_t("firstVertex", "the index of the first vertex to build from for triangle geometry.")
    uint32_t("transformOffset", "defines an offset in bytes into the memory where a transform matrix is defined.")
}

val VkAabbPositionsKHR = struct(Module.VULKAN, "VkAabbPositionsKHR") {
    documentation =
        """
        Structure specifying two opposing corners of an axis-aligned bounding box.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code minX} <b>must</b> be less than or equal to {@code maxX}</li>
            <li>{@code minY} <b>must</b> be less than or equal to {@code maxY}</li>
            <li>{@code minZ} <b>must</b> be less than or equal to {@code maxZ}</li>
        </ul>
        """

    float("minX", "the x position of one opposing corner of a bounding box.")
    float("minY", "the y position of one opposing corner of a bounding box.")
    float("minZ", "the z position of one opposing corner of a bounding box.")
    float("maxX", "the x position of the other opposing corner of a bounding box.")
    float("maxY", "the y position of the other opposing corner of a bounding box.")
    float("maxZ", "the z position of the other opposing corner of a bounding box.")
}

val VkAccelerationStructureGeometryTrianglesDataKHR = struct(Module.VULKAN, "VkAccelerationStructureGeometryTrianglesDataKHR") {
    documentation =
        """
        Structure specifying a triangle geometry in a bottom-level acceleration structure.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Unlike the stride for vertex buffers in ##VkVertexInputBindingDescription for graphics pipelines which must not exceed {@code maxVertexInputBindingStride}, {@code vertexStride} for acceleration structure geometry is instead restricted to being a 32-bit value.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code vertexStride} <b>must</b> be a multiple of the size in bytes of the smallest component of {@code vertexFormat}</li>
            <li>{@code vertexStride} <b>must</b> be less than or equal to <code>2<sup>32</sup>-1</code></li>
            <li>{@code vertexFormat} <b>must</b> support the #FORMAT_FEATURE_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR in ##VkFormatProperties{@code ::bufferFeatures} as returned by #GetPhysicalDeviceFormatProperties2()</li>
            <li>{@code indexType} <b>must</b> be #INDEX_TYPE_UINT16, #INDEX_TYPE_UINT32, or #INDEX_TYPE_NONE_KHR</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code vertexFormat} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code indexType} <b>must</b> be a valid {@code VkIndexType} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureGeometryDataKHR, ##VkDeviceOrHostAddressConstKHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkFormat("vertexFormat", "the {@code VkFormat} of each vertex element.")
    VkDeviceOrHostAddressConstKHR("vertexData", "a device or host address to memory containing vertex data for this geometry.")
    VkDeviceSize("vertexStride", "the stride in bytes between each vertex.")
    uint32_t("maxVertex", "the highest index of a vertex that will be addressed by a build command using this structure.")
    VkIndexType("indexType", "the {@code VkIndexType} of each index element.")
    VkDeviceOrHostAddressConstKHR("indexData", "a device or host address to memory containing index data for this geometry.")
    VkDeviceOrHostAddressConstKHR("transformData", "a device or host address to memory containing an optional reference to a ##VkTransformMatrixKHR structure defining a transformation that should be applied to vertices in this geometry.")
}

val VkTransformMatrixKHR = struct(Module.VULKAN, "VkTransformMatrixKHR") {
    documentation =
        """
        Structure specifying a 3x4 affine transformation matrix.

        <h5>Valid Usage</h5>
        <ul>
            <li>The first three columns of {@code matrix} <b>must</b> define an invertible 3x3 matrix</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureInstanceKHR
        """

    float("matrix", "a 3x4 row-major affine transformation matrix.")[3][4]
}

val VkAccelerationStructureGeometryAabbsDataKHR = struct(Module.VULKAN, "VkAccelerationStructureGeometryAabbsDataKHR") {
    documentation =
        """
        Structure specifying axis-aligned bounding box geometry in a bottom-level acceleration structure.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code stride} <b>must</b> be a multiple of 8</li>
            <li>{@code stride} <b>must</b> be less than or equal to <code>2<sup>32</sup>-1</code></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureGeometryDataKHR, ##VkDeviceOrHostAddressConstKHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDeviceOrHostAddressConstKHR("data", "a device or host address to memory containing ##VkAabbPositionsKHR structures containing position data for each axis-aligned bounding box in the geometry.")
    VkDeviceSize("stride", "the stride in bytes between each entry in {@code data}. The stride <b>must</b> be a multiple of 8.")
}

val VkAccelerationStructureGeometryInstancesDataKHR = struct(Module.VULKAN, "VkAccelerationStructureGeometryInstancesDataKHR") {
    documentation =
        """
        Structure specifying a geometry consisting of instances of other acceleration structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureGeometryDataKHR, ##VkDeviceOrHostAddressConstKHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("arrayOfPointers", "specifies whether {@code data} is used as an array of addresses or just an array.")
    VkDeviceOrHostAddressConstKHR("data", "either the address of an array of device or host addresses referencing individual ##VkAccelerationStructureInstanceKHR structures if {@code arrayOfPointers} is #TRUE, or the address of an array of ##VkAccelerationStructureInstanceKHR structures.")
}

val VkAccelerationStructureGeometryDataKHR = union(Module.VULKAN, "VkAccelerationStructureGeometryDataKHR") {
    documentation =
        """
        Union specifying acceleration structure geometry data.
        """

    VkAccelerationStructureGeometryTrianglesDataKHR("triangles", "a ##VkAccelerationStructureGeometryTrianglesDataKHR structure.")
    VkAccelerationStructureGeometryAabbsDataKHR("aabbs", "a ##VkAccelerationStructureGeometryAabbsDataKHR struture.")
    VkAccelerationStructureGeometryInstancesDataKHR("instances", "a ##VkAccelerationStructureGeometryInstancesDataKHR structure.")
}

val VkAccelerationStructureGeometryKHR = struct(Module.VULKAN, "VkAccelerationStructureGeometryKHR") {
    documentation =
        """
        Structure specifying geometries to be built into an acceleration structure.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code geometryType} is #GEOMETRY_TYPE_AABBS_KHR, the {@code aabbs} member of {@code geometry} <b>must</b> be a valid ##VkAccelerationStructureGeometryAabbsDataKHR structure</li>
            <li>If {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, the {@code triangles} member of {@code geometry} <b>must</b> be a valid ##VkAccelerationStructureGeometryTrianglesDataKHR structure</li>
            <li>If {@code geometryType} is #GEOMETRY_TYPE_INSTANCES_KHR, the {@code instances} member of {@code geometry} <b>must</b> be a valid ##VkAccelerationStructureGeometryInstancesDataKHR structure</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code geometryType} <b>must</b> be a valid {@code VkGeometryTypeKHR} value</li>
            <li>If {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, the {@code triangles} member of {@code geometry} <b>must</b> be a valid ##VkAccelerationStructureGeometryTrianglesDataKHR structure</li>
            <li>If {@code geometryType} is #GEOMETRY_TYPE_AABBS_KHR, the {@code aabbs} member of {@code geometry} <b>must</b> be a valid ##VkAccelerationStructureGeometryAabbsDataKHR structure</li>
            <li>If {@code geometryType} is #GEOMETRY_TYPE_INSTANCES_KHR, the {@code instances} member of {@code geometry} <b>must</b> be a valid ##VkAccelerationStructureGeometryInstancesDataKHR structure</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkGeometryFlagBitsKHR} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureBuildGeometryInfoKHR, ##VkAccelerationStructureGeometryDataKHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkGeometryTypeKHR("geometryType", "describes which type of geometry this ##VkAccelerationStructureGeometryKHR refers to.")
    VkAccelerationStructureGeometryDataKHR("geometry", "a ##VkAccelerationStructureGeometryDataKHR union describing the geometry data for the relevant geometry type.")
    VkGeometryFlagsKHR("flags", "a bitmask of {@code VkGeometryFlagBitsKHR} values describing additional properties of how the geometry should be built.")
}

val VkAccelerationStructureBuildGeometryInfoKHR = struct(Module.VULKAN, "VkAccelerationStructureBuildGeometryInfoKHR") {
    documentation =
        """
        Structure specifying the geometry data used to build an acceleration structure.

        <h5>Description</h5>
        Only one of {@code pGeometries} or {@code ppGeometries} <b>can</b> be a valid pointer, the other <b>must</b> be {@code NULL}. Each element of the non-{@code NULL} array describes the data used to build each acceleration structure geometry.

        The index of each element of the {@code pGeometries} or {@code ppGeometries} members of ##VkAccelerationStructureBuildGeometryInfoKHR is used as the <em>geometry index</em> during ray traversal. The geometry index is available in ray shaders via the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#interfaces-builtin-variables-raygeometryindex">{@code RayGeometryIndexKHR} built-in</a>, and is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#shader-binding-table-hit-shader-indexing">used to determine hit and intersection shaders executed during traversal</a>. The geometry index is available to ray queries via the {@code OpRayQueryGetIntersectionGeometryIndexKHR} instruction.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code type} <b>must</b> not be #ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR</li>
            <li>Only one of {@code pGeometries} or {@code ppGeometries} <b>can</b> be a valid pointer, the other <b>must</b> be {@code NULL}</li>
            <li>If {@code type} is #ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR, the {@code geometryType} member of elements of either {@code pGeometries} or {@code ppGeometries} <b>must</b> be #GEOMETRY_TYPE_INSTANCES_KHR</li>
            <li>If {@code type} is #ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR, {@code geometryCount} <b>must</b> be 1</li>
            <li>If {@code type} is #ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR the {@code geometryType} member of elements of either {@code pGeometries} or {@code ppGeometries} <b>must</b> not be #GEOMETRY_TYPE_INSTANCES_KHR</li>
            <li>If {@code type} is #ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR then the {@code geometryType} member of each geometry in either {@code pGeometries} or {@code ppGeometries} <b>must</b> be the same</li>
            <li>If {@code type} is #ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR then {@code geometryCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceAccelerationStructurePropertiesKHR{@code ::maxGeometryCount}</li>
            <li>If {@code type} is #ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR and the {@code geometryType} member of either {@code pGeometries} or {@code ppGeometries} is #GEOMETRY_TYPE_AABBS_KHR, the total number of AABBs in all geometries <b>must</b> be less than or equal to ##VkPhysicalDeviceAccelerationStructurePropertiesKHR{@code ::maxPrimitiveCount}</li>
            <li>If {@code type} is #ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR and the {@code geometryType} member of either {@code pGeometries} or {@code ppGeometries} is #GEOMETRY_TYPE_TRIANGLES_KHR, the total number of triangles in all geometries <b>must</b> be less than or equal to ##VkPhysicalDeviceAccelerationStructurePropertiesKHR{@code ::maxPrimitiveCount}</li>
            <li>If {@code flags} has the #BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR bit set, then it <b>must</b> not have the #BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR bit set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code type} <b>must</b> be a valid {@code VkAccelerationStructureTypeKHR} value</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkBuildAccelerationStructureFlagBitsKHR} values</li>
            <li>If {@code geometryCount} is not 0, and {@code pGeometries} is not {@code NULL}, {@code pGeometries} <b>must</b> be a valid pointer to an array of {@code geometryCount} valid ##VkAccelerationStructureGeometryKHR structures</li>
            <li>If {@code geometryCount} is not 0, and {@code ppGeometries} is not {@code NULL}, {@code ppGeometries} <b>must</b> be a valid pointer to an array of {@code geometryCount} valid pointers to valid ##VkAccelerationStructureGeometryKHR structures</li>
            <li>Both of {@code dstAccelerationStructure}, and {@code srcAccelerationStructure} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureGeometryKHR, ##VkDeviceOrHostAddressKHR, #BuildAccelerationStructuresKHR(), #CmdBuildAccelerationStructuresIndirectKHR(), #CmdBuildAccelerationStructuresKHR(), #GetAccelerationStructureBuildSizesKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkAccelerationStructureTypeKHR("type", "a {@code VkAccelerationStructureTypeKHR} value specifying the type of acceleration structure being built.")
    VkBuildAccelerationStructureFlagsKHR("flags", "a bitmask of {@code VkBuildAccelerationStructureFlagBitsKHR} specifying additional parameters of the acceleration structure.")
    VkBuildAccelerationStructureModeKHR("mode", "a {@code VkBuildAccelerationStructureModeKHR} value specifying the type of operation to perform.")
    VkAccelerationStructureKHR("srcAccelerationStructure", "points to an existing acceleration structure that is to be used to update the {@code dst} acceleration structure when {@code mode} is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR.")
    VkAccelerationStructureKHR("dstAccelerationStructure", "points to the target acceleration structure for the build.")
    AutoSize("pGeometries", "ppGeometries", optional = true)..uint32_t("geometryCount", "specifies the number of geometries that will be built into {@code dstAccelerationStructure}.")
    nullable..VkAccelerationStructureGeometryKHR.const.p("pGeometries", "a pointer to an array of ##VkAccelerationStructureGeometryKHR structures.")
    nullable..VkAccelerationStructureGeometryKHR.const.p.const.p("ppGeometries", "a pointer to an array of pointers to ##VkAccelerationStructureGeometryKHR structures.")
    VkDeviceOrHostAddressKHR("scratchData", "the device or host address to memory that will be used as scratch memory for the build.")
}

val VkAccelerationStructureInstanceKHR = struct(Module.VULKAN, "VkAccelerationStructureInstanceKHR") {
    documentation =
        """
        Structure specifying a single acceleration structure instance for building into an acceleration structure geometry.

        <h5>Description</h5>
        The C language spec does not define the ordering of bit-fields, but in practice, this struct produces the correct layout with existing compilers. The intended bit pattern is for the following:

        <ul>
            <li>
                {@code instanceCustomIndex} and {@code mask} occupy the same memory as if a single {@code int32_t} was specified in their place
                <ul>
                    <li>{@code instanceCustomIndex} occupies the 24 least significant bits of that memory</li>
                    <li>{@code mask} occupies the 8 most significant bits of that memory</li>
                </ul>
            </li>
            <li>
                {@code instanceShaderBindingTableRecordOffset} and {@code flags} occupy the same memory as if a single {@code int32_t} was specified in their place
                <ul>
                    <li>{@code instanceShaderBindingTableRecordOffset} occupies the 24 least significant bits of that memory</li>
                    <li>{@code flags} occupies the 8 most significant bits of that memory</li>
                </ul>
            </li>
        </ul>

        If a compiler produces code that diverges from that pattern, applications <b>must</b> employ another method to set values according to the correct bit pattern.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkGeometryInstanceFlagBitsKHR} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkTransformMatrixKHR
        """

    VkTransformMatrixKHR("transform", "a ##VkTransformMatrixKHR structure describing a transformation to be applied to the acceleration structure.")
    uint32_t("instanceCustomIndex", "a 24-bit user-specified index value accessible to ray shaders in the {@code InstanceCustomIndexKHR} built-in.", bits = 24)
    uint32_t("mask", "an 8-bit visibility mask for the geometry. The instance <b>may</b> only be hit if {@code rayMask &amp; instance.mask != 0}", bits = 8)
    uint32_t("instanceShaderBindingTableRecordOffset", "a 24-bit offset used in calculating the hit shader binding table index.", bits = 24)
    VkGeometryInstanceFlagsKHR("flags", "an 8-bit mask of {@code VkGeometryInstanceFlagBitsKHR} values to apply to this instance.", bits = 8)
    uint64_t("accelerationStructureReference", """either:

        <ul>
            <li>a device address containing the value obtained from #GetAccelerationStructureDeviceAddressKHR() or #GetAccelerationStructureHandleNV() (used by device operations which reference acceleration structures) or,</li>
            <li>a {@code VkAccelerationStructureKHR} object (used by host operations which reference acceleration structures).</li>
        </ul>""")
}

val VkAccelerationStructureCreateInfoKHR = struct(Module.VULKAN, "VkAccelerationStructureCreateInfoKHR") {
    documentation =
        """
        Structure specifying the parameters of a newly created acceleration structure object.

        <h5>Description</h5>
        If {@code deviceAddress} is zero, no specific address is requested.

        If {@code deviceAddress} is not zero, {@code deviceAddress} <b>must</b> be an address retrieved from an identically created acceleration structure on the same implementation. The acceleration structure <b>must</b> also be placed on an identically created {@code buffer} and at the same {@code offset}.

        Applications <b>should</b> avoid creating acceleration structures with application-provided addresses and implementation-provided addresses in the same process, to reduce the likelihood of #ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR errors.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The expected usage for this is that a trace capture/replay tool will add the #BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT flag to all buffers that use #BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT, and #BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT to all buffers used as storage for an acceleration structure where {@code deviceAddress} is not zero. During capture the tool will save the queried opaque device addresses in the trace. During replay, the buffers will be created specifying the original address so any address values stored in the trace data will remain valid.

        Implementations are expected to separate such buffers in the GPU address space so normal allocations will avoid using these addresses. Apps/tools should avoid mixing app-provided and implementation-provided addresses for buffers created with #BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT, to avoid address space allocation conflicts.
        </div>

        Applications <b>should</b> create an acceleration structure with a specific {@code VkAccelerationStructureTypeKHR} other than #ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR.

        If the acceleration structure will be the target of a build operation, the required size for an acceleration structure <b>can</b> be queried with #GetAccelerationStructureBuildSizesKHR(). If the acceleration structure is going to be the target of a compacting copy, #CmdWriteAccelerationStructuresPropertiesKHR() or #WriteAccelerationStructuresPropertiesKHR() <b>can</b> be used to obtain the compacted size required.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code deviceAddress} is not zero, {@code createFlags} <b>must</b> include #ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR</li>
            <li>If {@code createFlags} includes #ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR, ##VkPhysicalDeviceAccelerationStructureFeaturesKHR{@code ::accelerationStructureCaptureReplay} <b>must</b> be #TRUE</li>
            <li>{@code buffer} <b>must</b> have been created with a {@code usage} value containing #BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR</li>
            <li>{@code buffer} <b>must</b> not have been created with #BUFFER_CREATE_SPARSE_RESIDENCY_BIT</li>
            <li>The sum of {@code offset} and {@code size} <b>must</b> be less than the size of {@code buffer}</li>
            <li>{@code offset} <b>must</b> be a multiple of 256 bytes</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code createFlags} <b>must</b> be a valid combination of {@code VkAccelerationStructureCreateFlagBitsKHR} values</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code type} <b>must</b> be a valid {@code VkAccelerationStructureTypeKHR} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateAccelerationStructureKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkAccelerationStructureCreateFlagsKHR("createFlags", "a bitmask of {@code VkAccelerationStructureCreateFlagBitsKHR} specifying additional creation parameters of the acceleration structure.")
    VkBuffer("buffer", "the buffer on which the acceleration structure will be stored.")
    VkDeviceSize("offset", "an offset in bytes from the base address of the buffer at which the acceleration structure will be stored, and <b>must</b> be a multiple of 256.")
    VkDeviceSize("size", "the size required for the acceleration structure.")
    VkAccelerationStructureTypeKHR("type", "a {@code VkAccelerationStructureTypeKHR} value specifying the type of acceleration structure that will be created.")
    VkDeviceAddress("deviceAddress", "the device address requested for the acceleration structure if the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-accelerationStructureCaptureReplay\">{@code accelerationStructureCaptureReplay}</a> feature is being used.")
}

val VkWriteDescriptorSetAccelerationStructureKHR = struct(Module.VULKAN, "VkWriteDescriptorSetAccelerationStructureKHR") {
    documentation =
        """
        Structure specifying acceleration structure descriptor info.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code accelerationStructureCount} <b>must</b> be equal to {@code descriptorCount} in the extended structure</li>
            <li>Each acceleration structure in {@code pAccelerationStructures} <b>must</b> have been created with a {@code type} of #ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR or #ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-nullDescriptor">nullDescriptor</a> feature is not enabled, each member of {@code pAccelerationStructures} <b>must</b> not be #NULL_HANDLE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR</li>
            <li>{@code pAccelerationStructures} <b>must</b> be a valid pointer to an array of {@code accelerationStructureCount} valid or #NULL_HANDLE {@code VkAccelerationStructureKHR} handles</li>
            <li>{@code accelerationStructureCount} <b>must</b> be greater than 0</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pAccelerationStructures", optional = true)..uint32_t("accelerationStructureCount", "the number of elements in {@code pAccelerationStructures}.")
    nullable..VkAccelerationStructureKHR.const.p("pAccelerationStructures", "are the acceleration structures to update.")
}

val VkPhysicalDeviceAccelerationStructureFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceAccelerationStructureFeaturesKHR") {
    documentation =
        """
        Structure describing the acceleration structure features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceAccelerationStructureFeaturesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceAccelerationStructureFeaturesKHR <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("accelerationStructure", "indicates whether the implementation supports the acceleration structure functionality. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#acceleration-structure\">Acceleration Structures</a>.")
    VkBool32("accelerationStructureCaptureReplay", "indicates whether the implementation supports saving and reusing acceleration structure device addresses, e.g. for trace capture and replay.")
    VkBool32("accelerationStructureIndirectBuild", "indicates whether the implementation supports indirect acceleration structure build commands, e.g. #CmdBuildAccelerationStructuresIndirectKHR().")
    VkBool32("accelerationStructureHostCommands", "indicates whether the implementation supports host side acceleration structure commands, e.g. #BuildAccelerationStructuresKHR(), #CopyAccelerationStructureKHR(), #CopyAccelerationStructureToMemoryKHR(), #CopyMemoryToAccelerationStructureKHR(), #WriteAccelerationStructuresPropertiesKHR().")
    VkBool32("descriptorBindingAccelerationStructureUpdateAfterBind", "indicates whether the implementation supports updating acceleration structure descriptors after a set is bound. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT <b>must</b> not be used with #DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR.")
}

val VkPhysicalDeviceAccelerationStructurePropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceAccelerationStructurePropertiesKHR", mutable = false) {
    documentation =
        """
        Properties of the physical device for acceleration structure.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceAccelerationStructurePropertiesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        Limits specified by this structure <b>must</b> match those specified with the same name in ##VkPhysicalDeviceRayTracingPropertiesNV.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint64_t("maxGeometryCount", "the maximum number of geometries in the bottom level acceleration structure.")
    uint64_t("maxInstanceCount", "the maximum number of instances in the top level acceleration structure.")
    uint64_t("maxPrimitiveCount", "the maximum number of triangles or AABBs in all geometries in the bottom level acceleration structure.")
    uint32_t("maxPerStageDescriptorAccelerationStructures", "the maximum number of acceleration structure bindings that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptor bindings with a descriptor type of #DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR count against this limit. Only descriptor bindings in descriptor set layouts created without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT bit set count against this limit.")
    uint32_t("maxPerStageDescriptorUpdateAfterBindAccelerationStructures", "similar to {@code maxPerStageDescriptorAccelerationStructures} but counts descriptor bindings from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT bit set.")
    uint32_t("maxDescriptorSetAccelerationStructures", "the maximum number of acceleration structure descriptors that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptor bindings with a descriptor type of #DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR count against this limit. Only descriptor bindings in descriptor set layouts created without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT bit set count against this limit.")
    uint32_t("maxDescriptorSetUpdateAfterBindAccelerationStructures", "similar to {@code maxDescriptorSetAccelerationStructures} but counts descriptor bindings from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT bit set.")
    uint32_t("minAccelerationStructureScratchOffsetAlignment", "the minimum required: alignment, in bytes, for scratch data passed in to an acceleration structure build command.")
}

val VkAccelerationStructureDeviceAddressInfoKHR = struct(Module.VULKAN, "VkAccelerationStructureDeviceAddressInfoKHR") {
    documentation =
        """
        Structure specifying the acceleration structure to query an address for.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
        </ul>

        <h5>See Also</h5>
        #GetAccelerationStructureDeviceAddressKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkAccelerationStructureKHR("accelerationStructure", "specifies the acceleration structure whose address is being queried.")
}

val VkAccelerationStructureVersionInfoKHR = struct(Module.VULKAN, "VkAccelerationStructureVersionInfoKHR") {
    documentation =
        """
        Acceleration structure version information.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        {@code pVersionData} is a <em>pointer</em> to an array of 2*#UUID_SIZE {@code uint8_t} values instead of two #UUID_SIZE arrays as the expected use case for this member is to be pointed at the header of an previously serialized acceleration structure (via #CmdCopyAccelerationStructureToMemoryKHR() or #CopyAccelerationStructureToMemoryKHR()) that is loaded in memory. Using arrays would necessitate extra memory copies of the UUIDs.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code pVersionData} <b>must</b> be a valid pointer to an array of {@code 2}*#UUID_SIZE {@code uint8_t} values</li>
        </ul>

        <h5>See Also</h5>
        #GetDeviceAccelerationStructureCompatibilityKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    uint8_t.const.p("pVersionData", "a pointer to the version header of an acceleration structure as defined in #CmdCopyAccelerationStructureToMemoryKHR()")
}

val VkCopyAccelerationStructureToMemoryInfoKHR = struct(Module.VULKAN, "VkCopyAccelerationStructureToMemoryInfoKHR") {
    documentation =
        """
        Parameters for serializing an acceleration structure.

        <h5>Valid Usage</h5>
        <ul>
            <li>The memory pointed to by {@code dst} <b>must</b> be at least as large as the serialization size of {@code src}, as reported by #WriteAccelerationStructuresPropertiesKHR() or #CmdWriteAccelerationStructuresPropertiesKHR() with a query type of #QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR</li>
            <li>{@code mode} <b>must</b> be #COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code src} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
            <li>{@code mode} <b>must</b> be a valid {@code VkCopyAccelerationStructureModeKHR} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceOrHostAddressKHR, #CmdCopyAccelerationStructureToMemoryKHR(), #CopyAccelerationStructureToMemoryKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkAccelerationStructureKHR("src", "the source acceleration structure for the copy")
    VkDeviceOrHostAddressKHR("dst", "the device or host address to memory which is the target for the copy")
    VkCopyAccelerationStructureModeKHR("mode", "a {@code VkCopyAccelerationStructureModeKHR} value that specifies additional operations to perform during the copy.")
}

val VkCopyMemoryToAccelerationStructureInfoKHR = struct(Module.VULKAN, "VkCopyMemoryToAccelerationStructureInfoKHR") {
    documentation =
        """
        Parameters for deserializing an acceleration structure.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code mode} <b>must</b> be #COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR</li>
            <li>The data in {@code src} <b>must</b> have a format compatible with the destination physical device as returned by #GetDeviceAccelerationStructureCompatibilityKHR()</li>
            <li>{@code dst} <b>must</b> have been created with a {@code size} greater than or equal to that used to serialize the data in {@code src}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code dst} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
            <li>{@code mode} <b>must</b> be a valid {@code VkCopyAccelerationStructureModeKHR} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceOrHostAddressConstKHR, #CmdCopyMemoryToAccelerationStructureKHR(), #CopyMemoryToAccelerationStructureKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDeviceOrHostAddressConstKHR("src", "the device or host address to memory containing the source data for the copy.")
    VkAccelerationStructureKHR("dst", "the target acceleration structure for the copy.")
    VkCopyAccelerationStructureModeKHR("mode", "a {@code VkCopyAccelerationStructureModeKHR} value that specifies additional operations to perform during the copy.")
}

val VkCopyAccelerationStructureInfoKHR = struct(Module.VULKAN, "VkCopyAccelerationStructureInfoKHR") {
    documentation =
        """
        Parameters for copying an acceleration structure.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code mode} <b>must</b> be #COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR or #COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR</li>
            <li>If {@code mode} is #COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR, {@code src} <b>must</b> have been built with #BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR</li>
            <li>The {@code buffer} used to create {@code src} <b>must</b> be bound to device memory</li>
            <li>The {@code buffer} used to create {@code dst} <b>must</b> be bound to device memory</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code src} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
            <li>{@code dst} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
            <li>{@code mode} <b>must</b> be a valid {@code VkCopyAccelerationStructureModeKHR} value</li>
            <li>Both of {@code dst}, and {@code src} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        #CmdCopyAccelerationStructureKHR(), #CopyAccelerationStructureKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkAccelerationStructureKHR("src", "the source acceleration structure for the copy.")
    VkAccelerationStructureKHR("dst", "the target acceleration structure for the copy.")
    VkCopyAccelerationStructureModeKHR("mode", "a {@code VkCopyAccelerationStructureModeKHR} value that specifies additional operations to perform during the copy.")
}

val VkAccelerationStructureBuildSizesInfoKHR = struct(Module.VULKAN, "VkAccelerationStructureBuildSizesInfoKHR") {
    documentation =
        """
        Structure specifying build sizes for an acceleration structure.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #GetAccelerationStructureBuildSizesKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDeviceSize("accelerationStructureSize", "the size in bytes required in a {@code VkAccelerationStructureKHR} for a build or update operation.")
    VkDeviceSize("updateScratchSize", "the size in bytes required in a scratch buffer for an update operation.")
    VkDeviceSize("buildScratchSize", "the size in bytes required in a scratch buffer for a build operation.")
}

val VkRayTracingShaderGroupCreateInfoKHR = struct(Module.VULKAN, "VkRayTracingShaderGroupCreateInfoKHR") {
    documentation =
        """
        Structure specifying shaders in a shader group.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code type} is #RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR then {@code generalShader} <b>must</b> be a valid index into ##VkRayTracingPipelineCreateInfoKHR{@code ::pStages} referring to a shader of #SHADER_STAGE_RAYGEN_BIT_KHR, #SHADER_STAGE_MISS_BIT_KHR, or #SHADER_STAGE_CALLABLE_BIT_KHR</li>
            <li>If {@code type} is #RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR then {@code closestHitShader}, {@code anyHitShader}, and {@code intersectionShader} <b>must</b> be #SHADER_UNUSED_KHR</li>
            <li>If {@code type} is #RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR then {@code intersectionShader} <b>must</b> be a valid index into ##VkRayTracingPipelineCreateInfoKHR{@code ::pStages} referring to a shader of #SHADER_STAGE_INTERSECTION_BIT_KHR</li>
            <li>If {@code type} is #RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR then {@code intersectionShader} <b>must</b> be #SHADER_UNUSED_KHR</li>
            <li>{@code closestHitShader} <b>must</b> be either #SHADER_UNUSED_KHR or a valid index into ##VkRayTracingPipelineCreateInfoKHR{@code ::pStages} referring to a shader of #SHADER_STAGE_CLOSEST_HIT_BIT_KHR</li>
            <li>{@code anyHitShader} <b>must</b> be either #SHADER_UNUSED_KHR or a valid index into ##VkRayTracingPipelineCreateInfoKHR{@code ::pStages} referring to a shader of #SHADER_STAGE_ANY_HIT_BIT_KHR</li>
            <li>If ##VkPhysicalDeviceRayTracingPipelineFeaturesKHR{@code ::rayTracingPipelineShaderGroupHandleCaptureReplayMixed} is #FALSE then {@code pShaderGroupCaptureReplayHandle} <b>must</b> not be provided if it has not been provided on a previous call to ray tracing pipeline creation</li>
            <li>If ##VkPhysicalDeviceRayTracingPipelineFeaturesKHR{@code ::rayTracingPipelineShaderGroupHandleCaptureReplayMixed} is #FALSE then the caller <b>must</b> guarantee that no ray tracing pipeline creation commands with {@code pShaderGroupCaptureReplayHandle} provided execute simultaneously with ray tracing pipeline creation commands without {@code pShaderGroupCaptureReplayHandle} provided</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code type} <b>must</b> be a valid {@code VkRayTracingShaderGroupTypeKHR} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkRayTracingPipelineCreateInfoKHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkRayTracingShaderGroupTypeKHR("type", "the type of hit group specified in this structure.")
    uint32_t("generalShader", "the index of the ray generation, miss, or callable shader from ##VkRayTracingPipelineCreateInfoKHR{@code ::pStages} in the group if the shader group has {@code type} of #RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR, and #SHADER_UNUSED_KHR otherwise.")
    uint32_t("closestHitShader", "the optional index of the closest hit shader from ##VkRayTracingPipelineCreateInfoKHR{@code ::pStages} in the group if the shader group has {@code type} of #RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR or #RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR, and #SHADER_UNUSED_KHR otherwise.")
    uint32_t("anyHitShader", "the optional index of the any-hit shader from ##VkRayTracingPipelineCreateInfoKHR{@code ::pStages} in the group if the shader group has {@code type} of #RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR or #RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR, and #SHADER_UNUSED_KHR otherwise.")
    uint32_t("intersectionShader", "the index of the intersection shader from ##VkRayTracingPipelineCreateInfoKHR{@code ::pStages} in the group if the shader group has {@code type} of #RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR, and #SHADER_UNUSED_KHR otherwise.")
    nullable..opaque_const_p("pShaderGroupCaptureReplayHandle", "an optional pointer to replay information for this shader group. Ignored if ##VkPhysicalDeviceRayTracingPipelineFeaturesKHR{@code ::rayTracingPipelineShaderGroupHandleCaptureReplay} is #FALSE.")
}

val VkPipelineLibraryCreateInfoKHR = struct(Module.VULKAN, "VkPipelineLibraryCreateInfoKHR") {
    documentation =
        """
        Structure specifying pipeline libraries to use when creating a pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Each element of {@code pLibraries} <b>must</b> have been created with #PIPELINE_CREATE_LIBRARY_BIT_KHR</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>If {@code libraryCount} is not 0, {@code pLibraries} <b>must</b> be a valid pointer to an array of {@code libraryCount} valid {@code VkPipeline} handles</li>
        </ul>

        <h5>See Also</h5>
        ##VkRayTracingPipelineCreateInfoKHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pLibraries", optional = true)..uint32_t("libraryCount", "the number of pipeline libraries in {@code pLibraries}.")
    VkPipeline.const.p("pLibraries", "an array of pipeline libraries to use when creating a pipeline.")
}

val VkRayTracingPipelineInterfaceCreateInfoKHR = struct(Module.VULKAN, "VkRayTracingPipelineInterfaceCreateInfoKHR") {
    documentation =
        """
        Structure specifying additional interface information when using libraries.

        <h5>Description</h5>
        {@code maxPipelineRayPayloadSize} is calculated as the maximum number of bytes used by any block declared in the {@code RayPayloadKHR} or {@code IncomingRayPayloadKHR} storage classes. {@code maxPipelineRayHitAttributeSize} is calculated as the maximum number of bytes used by any block declared in the {@code HitAttributeKHR} storage class. As variables in these storage classes do not have explicit offsets, the size should be calculated as if each variable has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#interfaces-alignment-requirements">scalar alignment</a> equal to the largest scalar alignment of any of the block's members.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        There is no explicit upper limit for {@code maxPipelineRayPayloadSize}, but in practice it should be kept as small as possible. Similar to invocation local memory, it must be allocated for each shader invocation and for devices which support many simultaneous invocations, this storage can rapidly be exhausted, resulting in failure.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code maxPipelineRayHitAttributeSize} <b>must</b> be less than or equal to ##VkPhysicalDeviceRayTracingPipelinePropertiesKHR{@code ::maxRayHitAttributeSize}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        ##VkRayTracingPipelineCreateInfoKHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    uint32_t("maxPipelineRayPayloadSize", "the maximum payload size in bytes used by any shader in the pipeline.")
    uint32_t("maxPipelineRayHitAttributeSize", "the maximum attribute structure size in bytes used by any shader in the pipeline.")
}

val VkRayTracingPipelineCreateInfoKHR = struct(Module.VULKAN, "VkRayTracingPipelineCreateInfoKHR") {
    documentation =
        """
        Structure specifying parameters of a newly created ray tracing pipeline.

        <h5>Description</h5>
        The parameters {@code basePipelineHandle} and {@code basePipelineIndex} are described in more detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#pipelines-pipeline-derivatives">Pipeline Derivatives</a>.

        When #PIPELINE_CREATE_LIBRARY_BIT_KHR is specified, this pipeline defines a <em>pipeline library</em> which <b>cannot</b> be bound as a ray tracing pipeline directly. Instead, pipeline libraries define common shaders and shader groups which <b>can</b> be included in future pipeline creation.

        If pipeline libraries are included in {@code pLibraryInfo}, shaders defined in those libraries are treated as if they were defined as additional entries in {@code pStages}, appended in the order they appear in the {@code pLibraries} array and in the {@code pStages} array when those libraries were defined.

        When referencing shader groups in order to obtain a shader group handle, groups defined in those libraries are treated as if they were defined as additional entries in {@code pGroups}, appended in the order they appear in the {@code pLibraries} array and in the {@code pGroups} array when those libraries were defined. The shaders these groups reference are set when the pipeline library is created, referencing those specified in the pipeline library, not in the pipeline that includes it.

        The default stack size for a pipeline if #DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR is not provided is computed as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#ray-tracing-pipeline-stack">Ray Tracing Pipeline Stack</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineIndex} is {@code -1}, {@code basePipelineHandle} <b>must</b> be a valid handle to a ray tracing {@code VkPipeline}</li>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is #NULL_HANDLE, {@code basePipelineIndex} <b>must</b> be a valid index into the calling command&#8217;s {@code pCreateInfos} parameter</li>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineIndex} is not {@code -1}, {@code basePipelineHandle} <b>must</b> be #NULL_HANDLE</li>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is not #NULL_HANDLE, {@code basePipelineIndex} <b>must</b> be {@code -1}</li>
            <li>The shader code for the entry points identified by {@code pStages}, and the rest of the state identified by this structure <b>must</b> adhere to the pipeline linking rules described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#interfaces">Shader Interfaces</a> chapter</li>
            <li>{@code layout} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-pipelinelayout-consistency">consistent</a> with all shaders specified in {@code pStages}</li>
            <li>The number of resources in {@code layout} accessible to each shader stage that is used by the pipeline <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxPerStageResources}</li>
            <li>{@code flags} <b>must</b> not include #PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-pipelineCreationCacheControl">{@code pipelineCreationCacheControl}</a> feature is not enabled, {@code flags} <b>must</b> not include #PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_EXT or #PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT_EXT</li>
            <li>If {@code flags} does not include #PIPELINE_CREATE_LIBRARY_BIT_KHR, the {@code stage} member of at least one element of {@code pStages}, including those implicitly added by {@code pLibraryInfo}, <b>must</b> be #SHADER_STAGE_RAYGEN_BIT_KHR</li>
            <li>{@code maxPipelineRayRecursionDepth} <b>must</b> be less than or equal to ##VkPhysicalDeviceRayTracingPipelinePropertiesKHR{@code ::maxRayRecursionDepth}</li>
            <li>If {@code flags} includes #PIPELINE_CREATE_LIBRARY_BIT_KHR, {@code pLibraryInterface} <b>must</b> not be {@code NULL}</li>
            <li>If {@code pLibraryInfo} is not {@code NULL} and its {@code libraryCount} member is greater than 0, its {@code pLibraryInterface} member <b>must</b> not be {@code NULL}</li>
            <li>Each element of the {@code pLibraries} member of {@code pLibraryInfo} <b>must</b> have been created with the value of {@code maxPipelineRayRecursionDepth} equal to that in this pipeline</li>
            <li>If {@code pLibraryInfo} is not {@code NULL}, each element of its {@code pLibraries} member <b>must</b> have been created with a {@code layout} that is compatible with the {@code layout} in this pipeline</li>
            <li>If {@code pLibraryInfo} is not {@code NULL}, each element of its {@code pLibraries} member <b>must</b> have been created with values of the {@code maxPipelineRayPayloadSize} and {@code maxPipelineRayHitAttributeSize} members of {@code pLibraryInterface} equal to those in this pipeline</li>
            <li>If {@code flags} includes #PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR, each element of the {@code pLibraries} member of {@code libraries} <b>must</b> have been created with the #PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR bit set</li>
            <li>If {@code flags} includes #PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR, each element of the {@code pLibraries} member of {@code libraries} <b>must</b> have been created with the #PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR bit set</li>
            <li>If {@code flags} includes #PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR, each element of the {@code pLibraries} member of {@code libraries} <b>must</b> have been created with the #PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR bit set</li>
            <li>If {@code flags} includes #PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR, each element of the {@code pLibraries} member of {@code libraries} <b>must</b> have been created with the #PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR bit set</li>
            <li>If {@code flags} includes #PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR, each element of the {@code pLibraries} member of {@code libraries} <b>must</b> have been created with the #PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR bit set</li>
            <li>If {@code flags} includes #PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR, each element of the {@code pLibraries} member of {@code libraries} <b>must</b> have been created with the #PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR bit set</li>
            <li>If {@code flags} includes #PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR, each element of the {@code pLibraries} member of {@code libraries} <b>must</b> have been created with the #PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR bit set</li>
            <li>If the VK_KHR_pipeline_library.html[VK_KHR_pipeline_library] extension is not enabled, {@code pLibraryInfo} and {@code pLibraryInterface} <b>must</b> be {@code NULL}.</li>
            <li>If {@code flags} includes #PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR, for any element of {@code pGroups} with a {@code type} of #RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR or #RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR, the {@code anyHitShader} of that element <b>must</b> not be #SHADER_UNUSED_KHR</li>
            <li>If {@code flags} includes #PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR, for any element of {@code pGroups} with a {@code type} of #RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR or #RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR, the {@code closestHitShader} of that element <b>must</b> not be #SHADER_UNUSED_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-rayTraversalPrimitiveCulling">{@code rayTraversalPrimitiveCulling}</a> feature is not enabled, {@code flags} <b>must</b> not include #PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-rayTraversalPrimitiveCulling">{@code rayTraversalPrimitiveCulling}</a> feature is not enabled, {@code flags} <b>must</b> not include #PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR</li>
            <li>If {@code flags} includes #PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-rayTracingPipelineShaderGroupHandleCaptureReplay">{@code rayTracingPipelineShaderGroupHandleCaptureReplay}</a> <b>must</b> be enabled</li>
            <li>If ##VkPhysicalDeviceRayTracingPipelineFeaturesKHR{@code ::rayTracingPipelineShaderGroupHandleCaptureReplay} is #TRUE and the {@code pShaderGroupCaptureReplayHandle} member of any element of {@code pGroups} is not {@code NULL}, {@code flags} <b>must</b> include #PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR</li>
            <li>If {@code pLibraryInfo} is not {@code NULL} and its {@code libraryCount} is 0, {@code stageCount} <b>must</b> not be 0</li>
            <li>If {@code pLibraryInfo} is not {@code NULL} and its {@code libraryCount} is 0, {@code groupCount} <b>must</b> not be 0</li>
            <li>Any element of the {@code pDynamicStates} member of {@code pDynamicState} <b>must</b> be #DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkPipelineCreationFeedbackCreateInfoEXT</li>
            <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkPipelineCreateFlagBits} values</li>
            <li>If {@code stageCount} is not 0, {@code pStages} <b>must</b> be a valid pointer to an array of {@code stageCount} valid ##VkPipelineShaderStageCreateInfo structures</li>
            <li>If {@code groupCount} is not 0, {@code pGroups} <b>must</b> be a valid pointer to an array of {@code groupCount} valid ##VkRayTracingShaderGroupCreateInfoKHR structures</li>
            <li>If {@code pLibraryInfo} is not {@code NULL}, {@code pLibraryInfo} <b>must</b> be a valid pointer to a valid ##VkPipelineLibraryCreateInfoKHR structure</li>
            <li>If {@code pLibraryInterface} is not {@code NULL}, {@code pLibraryInterface} <b>must</b> be a valid pointer to a valid ##VkRayTracingPipelineInterfaceCreateInfoKHR structure</li>
            <li>If {@code pDynamicState} is not {@code NULL}, {@code pDynamicState} <b>must</b> be a valid pointer to a valid ##VkPipelineDynamicStateCreateInfo structure</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>Both of {@code basePipelineHandle}, and {@code layout} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineDynamicStateCreateInfo, ##VkPipelineLibraryCreateInfoKHR, ##VkPipelineShaderStageCreateInfo, ##VkRayTracingPipelineInterfaceCreateInfoKHR, ##VkRayTracingShaderGroupCreateInfoKHR, #CreateRayTracingPipelinesKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineCreateFlags("flags", "a bitmask of {@code VkPipelineCreateFlagBits} specifying how the pipeline will be generated.")
    AutoSize("pStages", optional = true)..uint32_t("stageCount", "the number of entries in the {@code pStages} array.")
    VkPipelineShaderStageCreateInfo.const.p("pStages", "a pointer to an array of {@code stageCount} ##VkPipelineShaderStageCreateInfo structures describing the set of the shader stages to be included in the ray tracing pipeline.")
    AutoSize("pGroups", optional = true)..uint32_t("groupCount", "the number of entries in the {@code pGroups} array.")
    VkRayTracingShaderGroupCreateInfoKHR.const.p("pGroups", "a pointer to an array of {@code groupCount} ##VkRayTracingShaderGroupCreateInfoKHR structures describing the set of the shader stages to be included in each shader group in the ray tracing pipeline.")
    uint32_t("maxPipelineRayRecursionDepth", "the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#ray-tracing-recursion-depth\">maximum recursion depth</a> of shaders executed by this pipeline.")
    nullable..VkPipelineLibraryCreateInfoKHR.const.p("pLibraryInfo", "a pointer to a ##VkPipelineLibraryCreateInfoKHR structure defining pipeline libraries to include.")
    nullable..VkRayTracingPipelineInterfaceCreateInfoKHR.const.p("pLibraryInterface", "a pointer to a ##VkRayTracingPipelineInterfaceCreateInfoKHR structure defining additional information when using pipeline libraries.")
    nullable..VkPipelineDynamicStateCreateInfo.const.p("pDynamicState", "a pointer to a ##VkPipelineDynamicStateCreateInfo structure, and is used to indicate which properties of the pipeline state object are dynamic and <b>can</b> be changed independently of the pipeline state. This <b>can</b> be {@code NULL}, which means no state in the pipeline is considered dynamic.")
    VkPipelineLayout("layout", "the description of binding locations used by both the pipeline and descriptor sets used with the pipeline.")
    VkPipeline("basePipelineHandle", "a pipeline to derive from.")
    int32_t("basePipelineIndex", "an index into the {@code pCreateInfos} parameter to use as a pipeline to derive from.")
}

val VkPhysicalDeviceRayTracingPipelineFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingPipelineFeaturesKHR") {
    documentation =
        """
        Structure describing the ray tracing features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceRayTracingPipelineFeaturesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceRayTracingPipelineFeaturesKHR <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code rayTracingPipelineShaderGroupHandleCaptureReplayMixed} is #TRUE, {@code rayTracingPipelineShaderGroupHandleCaptureReplay} <b>must</b> also be #TRUE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("rayTracingPipeline", "indicates whether the implementation supports the ray tracing pipeline functionality. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#ray-tracing\">Ray Tracing</a>.")
    VkBool32("rayTracingPipelineShaderGroupHandleCaptureReplay", "indicates whether the implementation supports saving and reusing shader group handles, e.g. for trace capture and replay.")
    VkBool32("rayTracingPipelineShaderGroupHandleCaptureReplayMixed", "indicates whether the implementation supports reuse of shader group handles being arbitrarily mixed with creation of non-reused shader group handles. If this is #FALSE, all reused shader group handles <b>must</b> be specified before any non-reused handles <b>may</b> be created.")
    VkBool32("rayTracingPipelineTraceRaysIndirect", "indicates whether the implementation supports indirect trace ray commands, e.g. #CmdTraceRaysIndirectKHR().")
    VkBool32("rayTraversalPrimitiveCulling", "indicates whether the implementation supports <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#ray-traversal-culling-primitive\">primitive culling during ray traversal</a>.")
}

val VkPhysicalDeviceRayTracingPipelinePropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingPipelinePropertiesKHR", mutable = false) {
    documentation =
        """
        Properties of the physical device for ray tracing.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceRayTracingPipelinePropertiesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        Limits specified by this structure <b>must</b> match those specified with the same name in ##VkPhysicalDeviceRayTracingPropertiesNV.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("shaderGroupHandleSize", "size in bytes of the shader header.")
    uint32_t("maxRayRecursionDepth", "the maximum number of levels of ray recursion allowed in a trace command.")
    uint32_t("maxShaderGroupStride", "the maximum stride in bytes allowed between shader groups in the shader binding table.")
    uint32_t("shaderGroupBaseAlignment", "the required: alignment in bytes for the base of the shader binding table.")
    uint32_t("shaderGroupHandleCaptureReplaySize", "the number of bytes for the information required to do capture and replay for shader group handles.")
    uint32_t("maxRayDispatchInvocationCount", "the maximum number of ray generation shader invocations which <b>may</b> be produced by a single #CmdTraceRaysIndirectKHR() or #CmdTraceRaysKHR() command.")
    uint32_t("shaderGroupHandleAlignment", "the required: alignment in bytes for each shader binding table entry.")
    uint32_t("maxRayHitAttributeSize", "the maximum size in bytes for a ray attribute structure")
}

val VkStridedDeviceAddressRegionKHR = struct(Module.VULKAN, "VkStridedDeviceAddressRegionKHR") {
    documentation =
        """
        Structure specifying a region of device addresses with a stride.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code size} is not zero, all addresses between {@code deviceAddress} and <code>deviceAddress + size - 1</code> <b>must</b> be in the buffer device address range of the same buffer</li>
            <li>If {@code size} is not zero, {@code stride} <b>must</b> be less than the size of the buffer from which {@code deviceAddress} was queried</li>
        </ul>

        <h5>See Also</h5>
        #CmdTraceRaysIndirectKHR(), #CmdTraceRaysKHR()
        """

    VkDeviceAddress("deviceAddress", "the device address (as returned by the #GetBufferDeviceAddress() command) at which the region starts, or zero if the region is unused.")
    VkDeviceSize("stride", "the byte stride between consecutive elements.")
    VkDeviceSize("size", "the size in bytes of the region starting at {@code deviceAddress}.")
}

val VkTraceRaysIndirectCommandKHR = struct(Module.VULKAN, "VkTraceRaysIndirectCommandKHR") {
    documentation =
        """
        Structure specifying the parameters of an indirect trace ray command.

        <h5>Description</h5>
        The members of ##VkTraceRaysIndirectCommandKHR have the same meaning as the similarly named parameters of #CmdTraceRaysKHR().

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code width} <b>must</b> be less than or equal to <code>##VkPhysicalDeviceLimits::maxComputeWorkGroupCount[0] × ##VkPhysicalDeviceLimits::maxComputeWorkGroupSize[0]</code></li>
            <li>{@code height} <b>must</b> be less than or equal to <code>##VkPhysicalDeviceLimits::maxComputeWorkGroupCount[1] × ##VkPhysicalDeviceLimits::maxComputeWorkGroupSize[1]</code></li>
            <li>{@code depth} <b>must</b> be less than or equal to <code>##VkPhysicalDeviceLimits::maxComputeWorkGroupCount[2] × ##VkPhysicalDeviceLimits::maxComputeWorkGroupSize[2]</code></li>
            <li><code>width × height × depth</code> <b>must</b> be less than or equal to ##VkPhysicalDeviceRayTracingPipelinePropertiesKHR{@code ::maxRayDispatchInvocationCount}</li>
        </ul>
        """

    uint32_t("width", "the width of the ray trace query dimensions.")
    uint32_t("height", "height of the ray trace query dimensions.")
    uint32_t("depth", "depth of the ray trace query dimensions.")
}

val VkPhysicalDeviceRayQueryFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceRayQueryFeaturesKHR") {
    documentation =
        """
        Structure describing the ray query features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceRayQueryFeaturesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceRayQueryFeaturesKHR <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_QUERY_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("rayQuery", "indicates whether the implementation supports ray query ({@code OpRayQueryProceedKHR}) functionality.")
}

val VkPipelineCoverageModulationStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineCoverageModulationStateCreateInfoNV") {
    documentation =
        """
        Structure specifying parameters controlling coverage modulation.

        <h5>Description</h5>
        If {@code coverageModulationTableEnable} is #FALSE, then for each color sample the associated bits of the pixel coverage are counted and divided by the number of associated bits to produce a modulation factor <code>R</code> in the range <code>(0,1]</code> (a value of zero would have been killed due to a color coverage of 0). Specifically:

        <ul>
            <li><code>N</code> = value of {@code rasterizationSamples}</li>
            <li><code>M</code> = value of ##VkAttachmentDescription{@code ::samples} for any color attachments</li>
            <li><code>R = popcount(associated coverage bits) / (N / M)</code></li>
        </ul>

        If {@code coverageModulationTableEnable} is #TRUE, the value <code>R</code> is computed using a programmable lookup table. The lookup table has <code>N / M</code> elements, and the element of the table is selected by:

        <ul>
            <li><code>R = pCoverageModulationTable[popcount(associated coverage bits)-1]</code></li>
        </ul>

        Note that the table does not have an entry for <code>popcount(associated coverage bits) = 0</code>, because such samples would have been killed.

        The values of {@code pCoverageModulationTable} <b>may</b> be rounded to an implementation-dependent precision, which is at least as fine as <code>1 / N</code>, and clamped to <code>[0,1]</code>.

        For each color attachment with a floating point or normalized color format, each fragment output color value is replicated to <code>M</code> values which <b>can</b> each be modulated (multiplied) by that color sample's associated value of <code>R</code>. Which components are modulated is controlled by {@code coverageModulationMode}.

        If this structure is not present, it is as if {@code coverageModulationMode} is #COVERAGE_MODULATION_MODE_NONE_NV.

        If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fragops-coverage-reduction">coverage reduction mode</a> is #COVERAGE_REDUCTION_MODE_TRUNCATE_NV, each color sample is associated with only a single coverage sample. In this case, it is as if {@code coverageModulationMode} is #COVERAGE_MODULATION_MODE_NONE_NV.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code coverageModulationTableEnable} is #TRUE, {@code coverageModulationTableCount} <b>must</b> be equal to the number of rasterization samples divided by the number of color samples in the subpass</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code coverageModulationMode} <b>must</b> be a valid {@code VkCoverageModulationModeNV} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineCoverageModulationStateCreateFlagsNV("flags", "reserved for future use.")
    VkCoverageModulationModeNV("coverageModulationMode", "a {@code VkCoverageModulationModeNV} value controlling which color components are modulated.")
    VkBool32("coverageModulationTableEnable", "controls whether the modulation factor is looked up from a table in {@code pCoverageModulationTable}.")
    AutoSize("pCoverageModulationTable", optional = true)..uint32_t("coverageModulationTableCount", "the number of elements in {@code pCoverageModulationTable}.")
    nullable..float.const.p("pCoverageModulationTable", "a table of modulation factors containing a value for each number of covered samples.")
}

val VkPhysicalDeviceShaderSMBuiltinsPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceShaderSMBuiltinsPropertiesNV", mutable = false) {
    documentation =
        """
        Structure describing shader SM Builtins properties supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceShaderSMBuiltinsPropertiesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("shaderSMCount", "the number of SMs on the device.")
    uint32_t("shaderWarpsPerSM", "the maximum number of simultaneously executing warps on an SM.")
}

val VkPhysicalDeviceShaderSMBuiltinsFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceShaderSMBuiltinsFeaturesNV") {
    documentation =
        """
        Structure describing the shader SM Builtins features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceShaderSMBuiltinsFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceShaderSMBuiltinsFeaturesNV <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("shaderSMBuiltins", "indicates whether the implementation supports the SPIR-V {@code ShaderSMBuiltinsNV} capability.")
}

val VkSamplerYcbcrConversionCreateInfoKHR = struct(Module.VULKAN, "VkSamplerYcbcrConversionCreateInfoKHR", alias = VkSamplerYcbcrConversionCreateInfo) {
    documentation = "See ##VkSamplerYcbcrConversionCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkFormat("format", "")
    VkSamplerYcbcrModelConversion("ycbcrModel", "")
    VkSamplerYcbcrRange("ycbcrRange", "")
    VkComponentMapping("components", "")
    VkChromaLocation("xChromaOffset", "")
    VkChromaLocation("yChromaOffset", "")
    VkFilter("chromaFilter", "")
    VkBool32("forceExplicitReconstruction", "")
}

val VkSamplerYcbcrConversionInfoKHR = struct(Module.VULKAN, "VkSamplerYcbcrConversionInfoKHR", alias = VkSamplerYcbcrConversionInfo) {
    documentation = "See ##VkSamplerYcbcrConversionInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkSamplerYcbcrConversion("conversion", "")
}

val VkBindImagePlaneMemoryInfoKHR = struct(Module.VULKAN, "VkBindImagePlaneMemoryInfoKHR", alias = VkBindImagePlaneMemoryInfo) {
    documentation = "See ##VkBindImagePlaneMemoryInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkImageAspectFlagBits("planeAspect", "")
}

val VkImagePlaneMemoryRequirementsInfoKHR = struct(Module.VULKAN, "VkImagePlaneMemoryRequirementsInfoKHR", alias = VkImagePlaneMemoryRequirementsInfo) {
    documentation = "See ##VkImagePlaneMemoryRequirementsInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkImageAspectFlagBits("planeAspect", "")
}

val VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR", alias = VkPhysicalDeviceSamplerYcbcrConversionFeatures) {
    documentation = "See ##VkPhysicalDeviceSamplerYcbcrConversionFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("samplerYcbcrConversion", "")
}

val VkSamplerYcbcrConversionImageFormatPropertiesKHR = struct(Module.VULKAN, "VkSamplerYcbcrConversionImageFormatPropertiesKHR", mutable = false, alias = VkSamplerYcbcrConversionImageFormatProperties) {
    documentation = "See ##VkSamplerYcbcrConversionImageFormatProperties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    uint32_t("combinedImageSamplerDescriptorCount", "")
}

val VkBindBufferMemoryInfoKHR = struct(Module.VULKAN, "VkBindBufferMemoryInfoKHR", alias = VkBindBufferMemoryInfo) {
    documentation = "See ##VkBindBufferMemoryInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkBuffer("buffer", "")
    VkDeviceMemory("memory", "")
    VkDeviceSize("memoryOffset", "")
}

val VkBindImageMemoryInfoKHR = struct(Module.VULKAN, "VkBindImageMemoryInfoKHR", alias = VkBindImageMemoryInfo) {
    documentation = "See ##VkBindImageMemoryInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkImage("image", "")
    VkDeviceMemory("memory", "")
    VkDeviceSize("memoryOffset", "")
}

val VkDrmFormatModifierPropertiesEXT = struct(Module.VULKAN, "VkDrmFormatModifierPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure specifying properties of a format when combined with a DRM format modifier.

        <h5>Description</h5>
        The returned {@code drmFormatModifierTilingFeatures} <b>must</b> contain at least one bit.

        The implementation <b>must</b> not return {@code DRM_FORMAT_MOD_INVALID} in {@code drmFormatModifier}.

        An image's <em>memory planecount</em> (as returned by {@code drmFormatModifierPlaneCount}) is distinct from its <em>format planecount</em> (in the sense of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar</a> Y′C<sub>B</sub>C<sub>R</sub> formats). In {@code VkImageAspectFlags}, each {@code VK_IMAGE_ASPECT_MEMORY_PLANE___i___BIT_EXT} represents a <em>memory plane</em> and each {@code VK_IMAGE_ASPECT_PLANE___i___BIT} a <em>format plane</em>.

        An image's set of <em>format planes</em> is an ordered partition of the image's <b>content</b> into separable groups of format channels. The ordered partition is encoded in the name of each {@code VkFormat}. For example, #FORMAT_G8_B8R8_2PLANE_420_UNORM contains two <em>format planes</em>; the first plane contains the green channel and the second plane contains the blue channel and red channel. If the format name does not contain {@code PLANE}, then the format contains a single plane; for example, #FORMAT_R8G8B8A8_UNORM. Some commands, such as #CmdCopyBufferToImage(), do not operate on all format channels in the image, but instead operate only on the <em>format planes</em> explicitly chosen by the application and operate on each <em>format plane</em> independently.

        An image's set of <em>memory planes</em> is an ordered partition of the image's <b>memory</b> rather than the image's <b>content</b>. Each <em>memory plane</em> is a contiguous range of memory. The union of an image's <em>memory planes</em> is not necessarily contiguous.

        If an image is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#glossary-linear-resource">linear</a>, then the partition is the same for <em>memory planes</em> and for <em>format planes</em>. Therefore, if the returned {@code drmFormatModifier} is {@code DRM_FORMAT_MOD_LINEAR}, then {@code drmFormatModifierPlaneCount} <b>must</b> equal the <em>format planecount</em>, and {@code drmFormatModifierTilingFeatures} <b>must</b> be identical to the ##VkFormatProperties2{@code ::linearTilingFeatures} returned in the same {@code pNext} chain.

        If an image is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#glossary-linear-resource">non-linear</a>, then the partition of the image's <b>memory</b> into <em>memory planes</em> is implementation-specific and <b>may</b> be unrelated to the partition of the image's <b>content</b> into <em>format planes</em>. For example, consider an image whose {@code format} is #FORMAT_G8_B8_R8_3PLANE_420_UNORM, {@code tiling} is #IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT, whose {@code drmFormatModifier} is not {@code DRM_FORMAT_MOD_LINEAR}, and {@code flags} lacks #IMAGE_CREATE_DISJOINT_BIT. The image has 3 <em>format planes</em>, and commands such #CmdCopyBufferToImage() act on each <em>format plane</em> independently as if the data of each <em>format plane</em> were separable from the data of the other planes. In a straightforward implementation, the implementation <b>may</b> store the image's content in 3 adjacent <em>memory planes</em> where each <em>memory plane</em> corresponds exactly to a <em>format plane</em>. However, the implementation <b>may</b> also store the image's content in a single <em>memory plane</em> where all format channels are combined using an implementation-private block-compressed format; or the implementation <b>may</b> store the image's content in a collection of 7 adjacent <em>memory planes</em> using an implementation-private sharding technique. Because the image is non-linear and non-disjoint, the implementation has much freedom when choosing the image's placement in memory.

        The <em>memory planecount</em> applies to function parameters and structures only when the API specifies an explicit requirement on {@code drmFormatModifierPlaneCount}. In all other cases, the <em>memory planecount</em> is ignored.

        <h5>See Also</h5>
        ##VkDrmFormatModifierPropertiesListEXT
        """

    uint64_t("drmFormatModifier", "a <em>Linux DRM format modifier</em>.")
    uint32_t("drmFormatModifierPlaneCount", "the number of <em>memory planes</em> in any image created with {@code format} and {@code drmFormatModifier}. An image&#8217;s <em>memory planecount</em> is distinct from its <em>format planecount</em>, as explained below.")
    VkFormatFeatureFlags("drmFormatModifierTilingFeatures", "a bitmask of {@code VkFormatFeatureFlagBits} that are supported by any image created with {@code format} and {@code drmFormatModifier}.")
}

val VkDrmFormatModifierPropertiesListEXT = struct(Module.VULKAN, "VkDrmFormatModifierPropertiesListEXT", mutable = false) {
    documentation =
        """
        Structure specifying the list of DRM format modifiers supported for a format.

        <h5>Description</h5>
        If {@code pDrmFormatModifierProperties} is {@code NULL}, then the function returns in {@code drmFormatModifierCount} the number of modifiers compatible with the queried {@code format}. Otherwise, the application <b>must</b> set {@code drmFormatModifierCount} to the length of the array {@code pDrmFormatModifierProperties}; the function will write at most {@code drmFormatModifierCount} elements to the array, and will return in {@code drmFormatModifierCount} the number of elements written.

        Among the elements in array {@code pDrmFormatModifierProperties}, each returned {@code drmFormatModifier} <b>must</b> be unique.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT</li>
        </ul>

        <h5>See Also</h5>
        ##VkDrmFormatModifierPropertiesEXT
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    AutoSize("pDrmFormatModifierProperties", optional = true)..uint32_t("drmFormatModifierCount", "an inout parameter related to the number of modifiers compatible with the {@code format}, as described below.")
    nullable..VkDrmFormatModifierPropertiesEXT.p("pDrmFormatModifierProperties", "either {@code NULL} or an array of ##VkDrmFormatModifierPropertiesEXT structures.")
}

val VkPhysicalDeviceImageDrmFormatModifierInfoEXT = struct(Module.VULKAN, "VkPhysicalDeviceImageDrmFormatModifierInfoEXT") {
    documentation =
        """
        Structure specifying a DRM format modifier as image creation parameter.

        <h5>Description</h5>
        If the {@code drmFormatModifier} is incompatible with the parameters specified in ##VkPhysicalDeviceImageFormatInfo2 and its {@code pNext} chain, then #GetPhysicalDeviceImageFormatProperties2() returns #ERROR_FORMAT_NOT_SUPPORTED. The implementation <b>must</b> support the query of any {@code drmFormatModifier}, including unknown and invalid modifier values.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code sharingMode} is #SHARING_MODE_CONCURRENT, then {@code pQueueFamilyIndices} <b>must</b> be a valid pointer to an array of {@code queueFamilyIndexCount} {@code uint32_t} values</li>
            <li>If {@code sharingMode} is #SHARING_MODE_CONCURRENT, then {@code queueFamilyIndexCount} <b>must</b> be greater than 1</li>
            <li>If {@code sharingMode} is #SHARING_MODE_CONCURRENT, each element of {@code pQueueFamilyIndices} <b>must</b> be unique and <b>must</b> be less than the {@code pQueueFamilyPropertyCount} returned by #GetPhysicalDeviceQueueFamilyProperties2() for the {@code physicalDevice} that was used to create {@code device}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT</li>
            <li>{@code sharingMode} <b>must</b> be a valid {@code VkSharingMode} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    uint64_t("drmFormatModifier", "the image&#8217;s <em>Linux DRM format modifier</em>, corresponding to ##VkImageDrmFormatModifierExplicitCreateInfoEXT{@code ::modifier} or to ##VkImageDrmFormatModifierListCreateInfoEXT{@code ::pModifiers}.")
    VkSharingMode("sharingMode", "specifies how the image will be accessed by multiple queue families.")
    AutoSize("pQueueFamilyIndices", optional = true)..uint32_t("queueFamilyIndexCount", "the number of entries in the {@code pQueueFamilyIndices} array.")
    uint32_t.const.p("pQueueFamilyIndices", "a list of queue families that will access the image (ignored if {@code sharingMode} is not #SHARING_MODE_CONCURRENT).")
}

val VkImageDrmFormatModifierListCreateInfoEXT = struct(Module.VULKAN, "VkImageDrmFormatModifierListCreateInfoEXT") {
    documentation =
        """
        Specify that an image must be created with a DRM format modifier from the provided list.

        <h5>Valid Usage</h5>
        <ul>
            <li>Each <em>modifier</em> in {@code pDrmFormatModifiers} <b>must</b> be compatible with the parameters in ##VkImageCreateInfo and its {@code pNext} chain, as determined by querying ##VkPhysicalDeviceImageFormatInfo2 extended with ##VkPhysicalDeviceImageDrmFormatModifierInfoEXT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT</li>
            <li>{@code pDrmFormatModifiers} <b>must</b> be a valid pointer to an array of {@code drmFormatModifierCount} {@code uint64_t} values</li>
            <li>{@code drmFormatModifierCount} <b>must</b> be greater than 0</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pDrmFormatModifiers")..uint32_t("drmFormatModifierCount", "the length of the {@code pDrmFormatModifiers} array.")
    uint64_t.const.p("pDrmFormatModifiers", "a pointer to an array of <em>Linux DRM format modifiers</em>.")
}

val VkImageDrmFormatModifierExplicitCreateInfoEXT = struct(Module.VULKAN, "VkImageDrmFormatModifierExplicitCreateInfoEXT") {
    documentation =
        """
        Specify that an image be created with the provided DRM format modifier and explicit memory layout.

        <h5>Description</h5>
        The {@code i}<sup>th</sup> member of {@code pPlaneLayouts} describes the layout of the image's {@code i}<sup>th</sup> <em>memory plane</em> (that is, {@code VK_IMAGE_ASPECT_MEMORY_PLANE_i_BIT_EXT}). In each element of {@code pPlaneLayouts}, the implementation <b>must</b> ignore {@code size}. The implementation calculates the size of each plane, which the application <b>can</b> query with #GetImageSubresourceLayout().

        When creating an image with ##VkImageDrmFormatModifierExplicitCreateInfoEXT, it is the application's responsibility to satisfy all valid usage requirements. However, the implementation <b>must</b> validate that the provided {@code pPlaneLayouts}, when combined with the provided {@code drmFormatModifier} and other creation parameters in ##VkImageCreateInfo and its {@code pNext} chain, produce a valid image. (This validation is necessarily implementation-dependent and outside the scope of Vulkan, and therefore not described by valid usage requirements). If this validation fails, then #CreateImage() returns #ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code drmFormatModifier} <b>must</b> be compatible with the parameters in ##VkImageCreateInfo and its {@code pNext} chain, as determined by querying ##VkPhysicalDeviceImageFormatInfo2 extended with ##VkPhysicalDeviceImageDrmFormatModifierInfoEXT</li>
            <li>{@code drmFormatModifierPlaneCount} <b>must</b> be equal to the ##VkDrmFormatModifierPropertiesEXT{@code ::drmFormatModifierPlaneCount} associated with ##VkImageCreateInfo{@code ::format} and {@code drmFormatModifier}, as found by querying ##VkDrmFormatModifierPropertiesListEXT</li>
            <li>For each element of {@code pPlaneLayouts}, {@code size} <b>must</b> be 0</li>
            <li>For each element of {@code pPlaneLayouts}, {@code arrayPitch} <b>must</b> be 0 if ##VkImageCreateInfo{@code ::arrayLayers} is 1</li>
            <li>For each element of {@code pPlaneLayouts}, {@code depthPitch} <b>must</b> be 0 if ##VkImageCreateInfo{@code ::extent}.depth is 1</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT</li>
            <li>If {@code drmFormatModifierPlaneCount} is not 0, {@code pPlaneLayouts} <b>must</b> be a valid pointer to an array of {@code drmFormatModifierPlaneCount} ##VkSubresourceLayout structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkSubresourceLayout
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    uint64_t("drmFormatModifier", "the <em>Linux DRM format modifier</em> with which the image will be created.")
    AutoSize("pPlaneLayouts", optional = true)..uint32_t("drmFormatModifierPlaneCount", "the number of <em>memory planes</em> in the image (as reported by ##VkDrmFormatModifierPropertiesEXT) as well as the length of the {@code pPlaneLayouts} array.")
    VkSubresourceLayout.const.p("pPlaneLayouts", "a pointer to an array of ##VkSubresourceLayout structures describing the image&#8217;s <em>memory planes</em>.")
}

val VkImageDrmFormatModifierPropertiesEXT = struct(Module.VULKAN, "VkImageDrmFormatModifierPropertiesEXT", mutable = false) {
    documentation =
        """
        Properties of an image's Linux DRM format modifier.

        <h5>Description</h5>
        If the {@code image} was created with ##VkImageDrmFormatModifierListCreateInfoEXT, then the returned {@code drmFormatModifier} <b>must</b> belong to the list of modifiers provided at time of image creation in ##VkImageDrmFormatModifierListCreateInfoEXT{@code ::pDrmFormatModifiers}. If the {@code image} was created with ##VkImageDrmFormatModifierExplicitCreateInfoEXT, then the returned {@code drmFormatModifier} <b>must</b> be the modifier provided at time of image creation in ##VkImageDrmFormatModifierExplicitCreateInfoEXT{@code ::drmFormatModifier}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #GetImageDrmFormatModifierPropertiesEXT()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint64_t("drmFormatModifier", "returns the image&#8217;s <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#glossary-drm-format-modifier\">Linux DRM format modifier</a>.")
}

val VkValidationCacheCreateInfoEXT = struct(Module.VULKAN, "VkValidationCacheCreateInfoEXT") {
    documentation =
        """
        Structure specifying parameters of a newly created validation cache.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code initialDataSize} is not 0, it <b>must</b> be equal to the size of {@code pInitialData}, as returned by {@code vkGetValidationCacheDataEXT} when {@code pInitialData} was originally retrieved</li>
            <li>If {@code initialDataSize} is not 0, {@code pInitialData} <b>must</b> have been retrieved from a previous call to {@code vkGetValidationCacheDataEXT}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>If {@code initialDataSize} is not 0, {@code pInitialData} <b>must</b> be a valid pointer to an array of {@code initialDataSize} bytes</li>
        </ul>

        <h5>See Also</h5>
        #CreateValidationCacheEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkValidationCacheCreateFlagsEXT("flags", "reserved for future use.")
    AutoSize("pInitialData", optional = true)..size_t("initialDataSize", "the number of bytes in {@code pInitialData}. If {@code initialDataSize} is zero, the validation cache will initially be empty.")
    void.const.p("pInitialData", "a pointer to previously retrieved validation cache data. If the validation cache data is incompatible (as defined below) with the device, the validation cache will be initially empty. If {@code initialDataSize} is zero, {@code pInitialData} is ignored.")
}

val VkShaderModuleValidationCacheCreateInfoEXT = struct(Module.VULKAN, "VkShaderModuleValidationCacheCreateInfoEXT") {
    documentation =
        """
        Specify validation cache to use during shader module creation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT</li>
            <li>{@code validationCache} <b>must</b> be a valid {@code VkValidationCacheEXT} handle</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkValidationCacheEXT("validationCache", "the validation cache object from which the results of prior validation attempts will be written, and to which new validation results for this {@code VkShaderModule} will be written (if not already present).")
}

val VkDescriptorSetLayoutBindingFlagsCreateInfoEXT = struct(Module.VULKAN, "VkDescriptorSetLayoutBindingFlagsCreateInfoEXT", alias = VkDescriptorSetLayoutBindingFlagsCreateInfo) {
    documentation = "See ##VkDescriptorSetLayoutBindingFlagsCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    AutoSize("pBindingFlags", optional = true)..uint32_t("bindingCount", "")
    nullable..VkDescriptorBindingFlags.const.p("pBindingFlags", "")
}

val VkPhysicalDeviceDescriptorIndexingFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorIndexingFeaturesEXT", alias = VkPhysicalDeviceDescriptorIndexingFeatures) {
    documentation = "See ##VkPhysicalDeviceDescriptorIndexingFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("shaderInputAttachmentArrayDynamicIndexing", "")
    VkBool32("shaderUniformTexelBufferArrayDynamicIndexing", "")
    VkBool32("shaderStorageTexelBufferArrayDynamicIndexing", "")
    VkBool32("shaderUniformBufferArrayNonUniformIndexing", "")
    VkBool32("shaderSampledImageArrayNonUniformIndexing", "")
    VkBool32("shaderStorageBufferArrayNonUniformIndexing", "")
    VkBool32("shaderStorageImageArrayNonUniformIndexing", "")
    VkBool32("shaderInputAttachmentArrayNonUniformIndexing", "")
    VkBool32("shaderUniformTexelBufferArrayNonUniformIndexing", "")
    VkBool32("shaderStorageTexelBufferArrayNonUniformIndexing", "")
    VkBool32("descriptorBindingUniformBufferUpdateAfterBind", "")
    VkBool32("descriptorBindingSampledImageUpdateAfterBind", "")
    VkBool32("descriptorBindingStorageImageUpdateAfterBind", "")
    VkBool32("descriptorBindingStorageBufferUpdateAfterBind", "")
    VkBool32("descriptorBindingUniformTexelBufferUpdateAfterBind", "")
    VkBool32("descriptorBindingStorageTexelBufferUpdateAfterBind", "")
    VkBool32("descriptorBindingUpdateUnusedWhilePending", "")
    VkBool32("descriptorBindingPartiallyBound", "")
    VkBool32("descriptorBindingVariableDescriptorCount", "")
    VkBool32("runtimeDescriptorArray", "")
}

val VkPhysicalDeviceDescriptorIndexingPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorIndexingPropertiesEXT", mutable = false, alias = VkPhysicalDeviceDescriptorIndexingProperties) {
    documentation = "See ##VkPhysicalDeviceDescriptorIndexingProperties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    uint32_t("maxUpdateAfterBindDescriptorsInAllPools", "")
    VkBool32("shaderUniformBufferArrayNonUniformIndexingNative", "")
    VkBool32("shaderSampledImageArrayNonUniformIndexingNative", "")
    VkBool32("shaderStorageBufferArrayNonUniformIndexingNative", "")
    VkBool32("shaderStorageImageArrayNonUniformIndexingNative", "")
    VkBool32("shaderInputAttachmentArrayNonUniformIndexingNative", "")
    VkBool32("robustBufferAccessUpdateAfterBind", "")
    VkBool32("quadDivergentImplicitLod", "")
    uint32_t("maxPerStageDescriptorUpdateAfterBindSamplers", "")
    uint32_t("maxPerStageDescriptorUpdateAfterBindUniformBuffers", "")
    uint32_t("maxPerStageDescriptorUpdateAfterBindStorageBuffers", "")
    uint32_t("maxPerStageDescriptorUpdateAfterBindSampledImages", "")
    uint32_t("maxPerStageDescriptorUpdateAfterBindStorageImages", "")
    uint32_t("maxPerStageDescriptorUpdateAfterBindInputAttachments", "")
    uint32_t("maxPerStageUpdateAfterBindResources", "")
    uint32_t("maxDescriptorSetUpdateAfterBindSamplers", "")
    uint32_t("maxDescriptorSetUpdateAfterBindUniformBuffers", "")
    uint32_t("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic", "")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageBuffers", "")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic", "")
    uint32_t("maxDescriptorSetUpdateAfterBindSampledImages", "")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageImages", "")
    uint32_t("maxDescriptorSetUpdateAfterBindInputAttachments", "")
}

val VkDescriptorSetVariableDescriptorCountAllocateInfoEXT = struct(Module.VULKAN, "VkDescriptorSetVariableDescriptorCountAllocateInfoEXT", alias = VkDescriptorSetVariableDescriptorCountAllocateInfo) {
    documentation = "See ##VkDescriptorSetVariableDescriptorCountAllocateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    AutoSize("pDescriptorCounts", optional = true)..uint32_t("descriptorSetCount", "")
    uint32_t.const.p("pDescriptorCounts", "")
}

val VkDescriptorSetVariableDescriptorCountLayoutSupportEXT = struct(Module.VULKAN, "VkDescriptorSetVariableDescriptorCountLayoutSupportEXT", mutable = false, alias = VkDescriptorSetVariableDescriptorCountLayoutSupport) {
    documentation = "See ##VkDescriptorSetVariableDescriptorCountLayoutSupport."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    uint32_t("maxVariableDescriptorCount", "")
}

val VkPhysicalDevicePortabilitySubsetFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevicePortabilitySubsetFeaturesKHR") {
    documentation =
        """
        Structure describing the features that may not be supported by an implementation of the Vulkan 1.0 Portability Subset.

        <h5>Description</h5>
        If the ##VkPhysicalDevicePortabilitySubsetFeaturesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the features are supported. ##VkPhysicalDevicePortabilitySubsetFeaturesKHR <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("constantAlphaColorBlendFactors", "indicates whether this implementation supports constant <em>alpha</em> <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#framebuffer-blendfactors\">Blend Factors</a> used as source or destination <em>color</em> <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#framebuffer-blending\">Blending</a>.")
    VkBool32("events", "indicates whether this implementation supports synchronization using <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-events\">Events</a>.")
    VkBool32("imageViewFormatReinterpretation", "indicates whether this implementation supports a {@code VkImageView} being created with a texel format containing a different number of components, or a different number of bits in each component, than the texel format of the underlying {@code VkImage}.")
    VkBool32("imageViewFormatSwizzle", "indicates whether this implementation supports remapping format components using ##VkImageViewCreateInfo{@code ::components}.")
    VkBool32("imageView2DOn3DImage", "indicates whether this implementation supports a {@code VkImage} being created with the #IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT flag set, permitting a 2D or 2D array image view to be created on a 3D {@code VkImage}.")
    VkBool32("multisampleArrayImage", "indicates whether this implementation supports a {@code VkImage} being created as a 2D array with multiple samples per texel.")
    VkBool32("mutableComparisonSamplers", "indicates whether this implementation allows descriptors with comparison samplers to be <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#descriptorsets-updates\">updated</a>.")
    VkBool32("pointPolygons", "indicates whether this implementation supports <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast\">Rasterization</a> using a <em>point</em> <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-polygonmode\">Polygon Mode</a>.")
    VkBool32("samplerMipLodBias", "indicates whether this implementation supports setting a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#samplers-mipLodBias\">mipmap LOD bias value</a> when <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#samplers\">creating a sampler</a>.")
    VkBool32("separateStencilMaskRef", "indicates whether this implementation supports separate front and back <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#fragops-stencil\">Stencil Test</a> reference values.")
    VkBool32("shaderSampleRateInterpolationFunctions", "indicates whether this implementation supports fragment shaders which use the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#spirvenv-capabilities-table-InterpolationFunction\">{@code InterpolationFunction}</a> capability and the extended instructions {@code InterpolateAtCentroid}, {@code InterpolateAtOffset}, and {@code InterpolateAtSample} from the {@code GLSL.std.450} extended instruction set. This member is only meaningful if the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-sampleRateShading\">sampleRateShading</a> feature is supported.")
    VkBool32("tessellationIsolines", "indicates whether this implementation supports <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#tessellation-isoline-tessellation\">isoline output</a> from the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#tessellation\">Tessellation</a> stage of a graphics pipeline. This member is only meaningful if <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-tessellationShader\">tessellation shaders</a> are supported.")
    VkBool32("tessellationPointMode", "indicates whether this implementation supports <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#tessellation-point-mode\">point output</a> from the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#tessellation\">Tessellation</a> stage of a graphics pipeline. This member is only meaningful if <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-tessellationShader\">tessellation shaders</a> are supported.")
    VkBool32("triangleFans", "indicates whether this implementation supports <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#drawing-triangle-fans\">Triangle Fans</a> primitive topology.")
    VkBool32("vertexAttributeAccessBeyondStride", "indicates whether this implementation supports accessing a vertex input attribute beyond the stride of the corresponding vertex input binding.")
}

val VkPhysicalDevicePortabilitySubsetPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDevicePortabilitySubsetPropertiesKHR") {
    documentation =
        """
        Structure describing additional properties supported by a portable implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDevicePortabilitySubsetPropertiesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_PROPERTIES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    uint32_t("minVertexInputBindingStrideAlignment", "indicates the minimum alignment for vertex input strides. ##VkVertexInputBindingDescription{@code ::stride} <b>must</b> be a multiple of, and at least as large as, this value.")
}

val VkShadingRatePaletteNV = struct(Module.VULKAN, "VkShadingRatePaletteNV") {
    documentation =
        """
        Structure specifying a single shading rate palette.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code shadingRatePaletteEntryCount} <b>must</b> be between 1 and ##VkPhysicalDeviceShadingRateImagePropertiesNV{@code ::shadingRatePaletteSize}, inclusive</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code pShadingRatePaletteEntries} <b>must</b> be a valid pointer to an array of {@code shadingRatePaletteEntryCount} valid {@code VkShadingRatePaletteEntryNV} values</li>
            <li>{@code shadingRatePaletteEntryCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineViewportShadingRateImageStateCreateInfoNV, #CmdSetViewportShadingRatePaletteNV()
        """

    AutoSize("pShadingRatePaletteEntries")..uint32_t("shadingRatePaletteEntryCount", "specifies the number of entries in the shading rate image palette.")
    VkShadingRatePaletteEntryNV.const.p("pShadingRatePaletteEntries", "a pointer to an array of {@code VkShadingRatePaletteEntryNV} enums defining the shading rate for each palette entry.")
}

val VkPipelineViewportShadingRateImageStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineViewportShadingRateImageStateCreateInfoNV") {
    documentation =
        """
        Structure specifying parameters controlling shading rate image usage.

        <h5>Description</h5>
        If this structure is not present, {@code shadingRateImageEnable} is considered to be #FALSE, and the shading rate image and palettes are not used.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-multiViewport">multiple viewports</a> feature is not enabled, {@code viewportCount} <b>must</b> be 0 or 1</li>
            <li>{@code viewportCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxViewports}</li>
            <li>If {@code shadingRateImageEnable} is #TRUE, {@code viewportCount} <b>must</b> be greater or equal to the {@code viewportCount} member of ##VkPipelineViewportStateCreateInfo</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV</li>
        </ul>

        <h5>See Also</h5>
        ##VkShadingRatePaletteNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("shadingRateImageEnable", "specifies whether shading rate image and palettes are used during rasterization.")
    AutoSize("pShadingRatePalettes", optional = true)..uint32_t("viewportCount", "specifies the number of per-viewport palettes used to translate values stored in shading rate images.")
    VkShadingRatePaletteNV.const.p("pShadingRatePalettes", "a pointer to an array of ##VkShadingRatePaletteNV structures defining the palette for each viewport. If the shading rate palette state is dynamic, this member is ignored.")
}

val VkPhysicalDeviceShadingRateImageFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceShadingRateImageFeaturesNV") {
    documentation =
        """
        Structure describing shading rate image features that can be supported by an implementation.

        <h5>Description</h5>
        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#primsrast-shading-rate-image">Shading Rate Image</a> for more information.

        If the ##VkPhysicalDeviceShadingRateImageFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceShadingRateImageFeaturesNV <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("shadingRateImage", "indicates that the implementation supports the use of a shading rate image to derive an effective shading rate for fragment processing. It also indicates that the implementation supports the {@code ShadingRateNV} SPIR-V execution mode.")
    VkBool32("shadingRateCoarseSampleOrder", "indicates that the implementation supports a user-configurable ordering of coverage samples in fragments larger than one pixel.")
}

val VkPhysicalDeviceShadingRateImagePropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceShadingRateImagePropertiesNV", mutable = false) {
    documentation =
        """
        Structure describing shading rate image limits that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceShadingRateImagePropertiesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent2D
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkExtent2D("shadingRateTexelSize", "indicates the width and height of the portion of the framebuffer corresponding to each texel in the shading rate image.")
    uint32_t("shadingRatePaletteSize", "indicates the maximum number of palette entries supported for the shading rate image.")
    uint32_t("shadingRateMaxCoarseSamples", "specifies the maximum number of coverage samples supported in a single fragment. If the product of the fragment size derived from the base shading rate and the number of coverage samples per pixel exceeds this limit, the final shading rate will be adjusted so that its product does not exceed the limit.")
}

val VkCoarseSampleLocationNV = struct(Module.VULKAN, "VkCoarseSampleLocationNV") {
    documentation =
        """
        Structure specifying parameters controlling shading rate image usage.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pixelX} <b>must</b> be less than the width (in pixels) of the fragment</li>
            <li>{@code pixelY} <b>must</b> be less than the height (in pixels) of the fragment</li>
            <li>{@code sample} <b>must</b> be less than the number of coverage samples in each pixel belonging to the fragment</li>
        </ul>

        <h5>See Also</h5>
        ##VkCoarseSampleOrderCustomNV
        """

    uint32_t("pixelX", "added to the x coordinate of the upper-leftmost pixel of each fragment to identify the pixel containing the coverage sample.")
    uint32_t("pixelY", "added to the y coordinate of the upper-leftmost pixel of each fragment to identify the pixel containing the coverage sample.")
    uint32_t("sample", "the number of the coverage sample in the pixel identified by {@code pixelX} and {@code pixelY}.")
}

val VkCoarseSampleOrderCustomNV = struct(Module.VULKAN, "VkCoarseSampleOrderCustomNV") {
    documentation =
        """
        Structure specifying parameters controlling shading rate image usage.

        <h5>Description</h5>
        When using a custom sample ordering, element <em>j</em> in {@code pSampleLocations} specifies a specific pixel location and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#primsrast-multisampling-coverage-mask">sample index</a> that corresponds to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#primsrast-multisampling-coverage-mask">coverage index</a> <em>j</em> in the multi-pixel fragment.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code shadingRate} <b>must</b> be a shading rate that generates fragments with more than one pixel</li>
            <li>{@code sampleCount} <b>must</b> correspond to a sample count enumerated in {@code VkSampleCountFlags} whose corresponding bit is set in ##VkPhysicalDeviceLimits{@code ::framebufferNoAttachmentsSampleCounts}</li>
            <li>{@code sampleLocationCount} <b>must</b> be equal to the product of {@code sampleCount}, the fragment width for {@code shadingRate}, and the fragment height for {@code shadingRate}</li>
            <li>{@code sampleLocationCount} <b>must</b> be less than or equal to the value of ##VkPhysicalDeviceShadingRateImagePropertiesNV{@code ::shadingRateMaxCoarseSamples}</li>
            <li>The array {@code pSampleLocations} <b>must</b> contain exactly one entry for every combination of valid values for {@code pixelX}, {@code pixelY}, and {@code sample} in the structure ##VkCoarseSampleOrderCustomNV</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code shadingRate} <b>must</b> be a valid {@code VkShadingRatePaletteEntryNV} value</li>
            <li>{@code pSampleLocations} <b>must</b> be a valid pointer to an array of {@code sampleLocationCount} ##VkCoarseSampleLocationNV structures</li>
            <li>{@code sampleLocationCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkCoarseSampleLocationNV, ##VkPipelineViewportCoarseSampleOrderStateCreateInfoNV, #CmdSetCoarseSampleOrderNV()
        """

    VkShadingRatePaletteEntryNV("shadingRate", "a shading rate palette entry that identifies the fragment width and height for the combination of fragment area and per-pixel coverage sample count to control.")
    uint32_t("sampleCount", "identifies the per-pixel coverage sample count for the combination of fragment area and coverage sample count to control.")
    AutoSize("pSampleLocations")..uint32_t("sampleLocationCount", "specifies the number of sample locations in the custom ordering.")
    VkCoarseSampleLocationNV.const.p("pSampleLocations", "a pointer to an array of ##VkCoarseSampleLocationNV structures specifying the location of each sample in the custom ordering.")
}

val VkPipelineViewportCoarseSampleOrderStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineViewportCoarseSampleOrderStateCreateInfoNV") {
    documentation =
        """
        Structure specifying parameters controlling sample order in coarse fragments.

        <h5>Description</h5>
        If this structure is not present, {@code sampleOrderType} is considered to be #COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV.

        If {@code sampleOrderType} is #COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV, the coverage sample order used for any combination of fragment area and coverage sample count not enumerated in {@code pCustomSampleOrders} will be identical to that used for #COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV.

        If the pipeline was created with #DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV, the contents of this structure (if present) are ignored, and the coverage sample order is instead specified by #CmdSetCoarseSampleOrderNV().

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code sampleOrderType} is not #COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV, {@code customSamplerOrderCount} <b>must</b> be 0</li>
            <li>The array {@code pCustomSampleOrders} <b>must</b> not contain two structures with matching values for both the {@code shadingRate} and {@code sampleCount} members</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV</li>
            <li>{@code sampleOrderType} <b>must</b> be a valid {@code VkCoarseSampleOrderTypeNV} value</li>
            <li>If {@code customSampleOrderCount} is not 0, {@code pCustomSampleOrders} <b>must</b> be a valid pointer to an array of {@code customSampleOrderCount} valid ##VkCoarseSampleOrderCustomNV structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkCoarseSampleOrderCustomNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkCoarseSampleOrderTypeNV("sampleOrderType", "specifies the mechanism used to order coverage samples in fragments larger than one pixel.")
    AutoSize("pCustomSampleOrders", optional = true)..uint32_t("customSampleOrderCount", "specifies the number of custom sample orderings to use when ordering coverage samples.")
    VkCoarseSampleOrderCustomNV.const.p("pCustomSampleOrders", "a pointer to an array of {@code customSampleOrderCount} ##VkCoarseSampleOrderCustomNV structures, each of which specifies the coverage sample order for a single combination of fragment area and coverage sample count.")
}

val VkRayTracingShaderGroupCreateInfoNV = struct(Module.VULKAN, "VkRayTracingShaderGroupCreateInfoNV") {
    documentation =
        """
        Structure specifying shaders in a shader group.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code type} is #RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV then {@code generalShader} <b>must</b> be a valid index into ##VkRayTracingPipelineCreateInfoNV{@code ::pStages} referring to a shader of #SHADER_STAGE_RAYGEN_BIT_NV, #SHADER_STAGE_MISS_BIT_NV, or #SHADER_STAGE_CALLABLE_BIT_NV</li>
            <li>If {@code type} is #RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV then {@code closestHitShader}, {@code anyHitShader}, and {@code intersectionShader} <b>must</b> be #SHADER_UNUSED_NV</li>
            <li>If {@code type} is #RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV then {@code intersectionShader} <b>must</b> be a valid index into ##VkRayTracingPipelineCreateInfoNV{@code ::pStages} referring to a shader of #SHADER_STAGE_INTERSECTION_BIT_NV</li>
            <li>If {@code type} is #RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV then {@code intersectionShader} <b>must</b> be #SHADER_UNUSED_NV</li>
            <li>{@code closestHitShader} <b>must</b> be either #SHADER_UNUSED_NV or a valid index into ##VkRayTracingPipelineCreateInfoNV{@code ::pStages} referring to a shader of #SHADER_STAGE_CLOSEST_HIT_BIT_NV</li>
            <li>{@code anyHitShader} <b>must</b> be either #SHADER_UNUSED_NV or a valid index into ##VkRayTracingPipelineCreateInfoNV{@code ::pStages} referring to a shader of #SHADER_STAGE_ANY_HIT_BIT_NV</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code type} <b>must</b> be a valid {@code VkRayTracingShaderGroupTypeKHR} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkRayTracingPipelineCreateInfoNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkRayTracingShaderGroupTypeKHR("type", "the type of hit group specified in this structure.")
    uint32_t("generalShader", "the index of the ray generation, miss, or callable shader from ##VkRayTracingPipelineCreateInfoNV{@code ::pStages} in the group if the shader group has {@code type} of #RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV, and #SHADER_UNUSED_NV otherwise.")
    uint32_t("closestHitShader", "the optional index of the closest hit shader from ##VkRayTracingPipelineCreateInfoNV{@code ::pStages} in the group if the shader group has {@code type} of #RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV or #RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV, and #SHADER_UNUSED_NV otherwise.")
    uint32_t("anyHitShader", "the optional index of the any-hit shader from ##VkRayTracingPipelineCreateInfoNV{@code ::pStages} in the group if the shader group has {@code type} of #RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV or #RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV, and #SHADER_UNUSED_NV otherwise.")
    uint32_t("intersectionShader", "the index of the intersection shader from ##VkRayTracingPipelineCreateInfoNV{@code ::pStages} in the group if the shader group has {@code type} of #RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV, and #SHADER_UNUSED_NV otherwise.")
}

val VkRayTracingPipelineCreateInfoNV = struct(Module.VULKAN, "VkRayTracingPipelineCreateInfoNV") {
    documentation =
        """
        Structure specifying parameters of a newly created ray tracing pipeline.

        <h5>Description</h5>
        The parameters {@code basePipelineHandle} and {@code basePipelineIndex} are described in more detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#pipelines-pipeline-derivatives">Pipeline Derivatives</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineIndex} is {@code -1}, {@code basePipelineHandle} <b>must</b> be a valid handle to a ray tracing {@code VkPipeline}</li>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is #NULL_HANDLE, {@code basePipelineIndex} <b>must</b> be a valid index into the calling command&#8217;s {@code pCreateInfos} parameter</li>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineIndex} is not {@code -1}, {@code basePipelineHandle} <b>must</b> be #NULL_HANDLE</li>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is not #NULL_HANDLE, {@code basePipelineIndex} <b>must</b> be {@code -1}</li>
            <li>The shader code for the entry points identified by {@code pStages}, and the rest of the state identified by this structure <b>must</b> adhere to the pipeline linking rules described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#interfaces">Shader Interfaces</a> chapter</li>
            <li>{@code layout} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-pipelinelayout-consistency">consistent</a> with all shaders specified in {@code pStages}</li>
            <li>The number of resources in {@code layout} accessible to each shader stage that is used by the pipeline <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxPerStageResources}</li>
            <li>{@code flags} <b>must</b> not include #PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-pipelineCreationCacheControl">{@code pipelineCreationCacheControl}</a> feature is not enabled, {@code flags} <b>must</b> not include #PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_EXT or #PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT_EXT</li>
            <li>The {@code stage} member of at least one element of {@code pStages} <b>must</b> be #SHADER_STAGE_RAYGEN_BIT_KHR</li>
            <li>{@code flags} <b>must</b> not include #PIPELINE_CREATE_LIBRARY_BIT_KHR</li>
            <li>{@code maxRecursionDepth} <b>must</b> be less than or equal to ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::maxRecursionDepth}</li>
            <li>{@code flags} <b>must</b> not include #PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR</li>
            <li>{@code flags} <b>must</b> not include #PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR</li>
            <li>{@code flags} <b>must</b> not include #PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR</li>
            <li>{@code flags} <b>must</b> not include #PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR</li>
            <li>{@code flags} <b>must</b> not include #PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR</li>
            <li>{@code flags} <b>must</b> not include #PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR</li>
            <li>{@code flags} <b>must</b> not include #PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR</li>
            <li>{@code flags} <b>must</b> not include both #PIPELINE_CREATE_DEFER_COMPILE_BIT_NV and #PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_EXT at the same time</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkPipelineCreationFeedbackCreateInfoEXT</li>
            <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkPipelineCreateFlagBits} values</li>
            <li>{@code pStages} <b>must</b> be a valid pointer to an array of {@code stageCount} valid ##VkPipelineShaderStageCreateInfo structures</li>
            <li>{@code pGroups} <b>must</b> be a valid pointer to an array of {@code groupCount} valid ##VkRayTracingShaderGroupCreateInfoNV structures</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code stageCount} <b>must</b> be greater than 0</li>
            <li>{@code groupCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code basePipelineHandle}, and {@code layout} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineShaderStageCreateInfo, ##VkRayTracingShaderGroupCreateInfoNV, #CreateRayTracingPipelinesNV()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineCreateFlags("flags", "a bitmask of {@code VkPipelineCreateFlagBits} specifying how the pipeline will be generated.")
    AutoSize("pStages")..uint32_t("stageCount", "the number of entries in the {@code pStages} array.")
    VkPipelineShaderStageCreateInfo.const.p("pStages", "an array of size {@code stageCount} structures of type ##VkPipelineShaderStageCreateInfo describing the set of the shader stages to be included in the ray tracing pipeline.")
    AutoSize("pGroups")..uint32_t("groupCount", "the number of entries in the {@code pGroups} array.")
    VkRayTracingShaderGroupCreateInfoNV.const.p("pGroups", "an array of size {@code groupCount} structures of type ##VkRayTracingShaderGroupCreateInfoNV describing the set of the shader stages to be included in each shader group in the ray tracing pipeline.")
    uint32_t("maxRecursionDepth", "the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#ray-tracing-recursion-depth\">maximum recursion depth</a> of shaders executed by this pipeline.")
    VkPipelineLayout("layout", "the description of binding locations used by both the pipeline and descriptor sets used with the pipeline.")
    VkPipeline("basePipelineHandle", "a pipeline to derive from.")
    int32_t("basePipelineIndex", "an index into the {@code pCreateInfos} parameter to use as a pipeline to derive from.")
}

val VkGeometryTrianglesNV = struct(Module.VULKAN, "VkGeometryTrianglesNV") {
    documentation =
        """
        Structure specifying a triangle geometry in a bottom-level acceleration structure.

        <h5>Description</h5>
        If {@code indexType} is #INDEX_TYPE_NONE_NV, then this structure describes a set of triangles determined by {@code vertexCount}. Otherwise, this structure describes a set of indexed triangles determined by {@code indexCount}.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code vertexOffset} <b>must</b> be less than the size of {@code vertexData}</li>
            <li>{@code vertexOffset} <b>must</b> be a multiple of the component size of {@code vertexFormat}</li>
            <li>{@code vertexFormat} <b>must</b> be one of #FORMAT_R32G32B32_SFLOAT, #FORMAT_R32G32_SFLOAT, #FORMAT_R16G16B16_SFLOAT, #FORMAT_R16G16_SFLOAT, #FORMAT_R16G16_SNORM, or #FORMAT_R16G16B16_SNORM</li>
            <li>{@code vertexStride} <b>must</b> be less than or equal to <code>2<sup>32</sup>-1</code></li>
            <li>{@code indexOffset} <b>must</b> be less than the size of {@code indexData}</li>
            <li>{@code indexOffset} <b>must</b> be a multiple of the element size of {@code indexType}</li>
            <li>{@code indexType} <b>must</b> be #INDEX_TYPE_UINT16, #INDEX_TYPE_UINT32, or #INDEX_TYPE_NONE_NV</li>
            <li>{@code indexData} <b>must</b> be #NULL_HANDLE if {@code indexType} is #INDEX_TYPE_NONE_NV</li>
            <li>{@code indexData} <b>must</b> be a valid {@code VkBuffer} handle if {@code indexType} is not #INDEX_TYPE_NONE_NV</li>
            <li>{@code indexCount} <b>must</b> be 0 if {@code indexType} is #INDEX_TYPE_NONE_NV</li>
            <li>{@code transformOffset} <b>must</b> be less than the size of {@code transformData}</li>
            <li>{@code transformOffset} <b>must</b> be a multiple of 16</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>If {@code vertexData} is not #NULL_HANDLE, {@code vertexData} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code vertexFormat} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>If {@code indexData} is not #NULL_HANDLE, {@code indexData} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code indexType} <b>must</b> be a valid {@code VkIndexType} value</li>
            <li>If {@code transformData} is not #NULL_HANDLE, {@code transformData} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>Each of {@code indexData}, {@code transformData}, and {@code vertexData} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkGeometryDataNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBuffer("vertexData", "the buffer containing vertex data for this geometry.")
    VkDeviceSize("vertexOffset", "the offset in bytes within {@code vertexData} containing vertex data for this geometry.")
    uint32_t("vertexCount", "the number of valid vertices.")
    VkDeviceSize("vertexStride", "the stride in bytes between each vertex.")
    VkFormat("vertexFormat", "a {@code VkFormat} describing the format of each vertex element.")
    VkBuffer("indexData", "the buffer containing index data for this geometry.")
    VkDeviceSize("indexOffset", "the offset in bytes within {@code indexData} containing index data for this geometry.")
    uint32_t("indexCount", "the number of indices to include in this geometry.")
    VkIndexType("indexType", "a {@code VkIndexType} describing the format of each index.")
    VkBuffer("transformData", "an optional buffer containing an ##VkTransformMatrixNV structure defining a transformation to be applied to this geometry.")
    VkDeviceSize("transformOffset", "the offset in bytes in {@code transformData} of the transform information described above.")
}

val VkGeometryAABBNV = struct(Module.VULKAN, "VkGeometryAABBNV") {
    documentation =
        """
        Structure specifying axis-aligned bounding box geometry in a bottom-level acceleration structure.

        <h5>Description</h5>
        The AABB data in memory is six 32-bit floats consisting of the minimum x, y, and z values followed by the maximum x, y, and z values.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code offset} <b>must</b> be less than the size of {@code aabbData}</li>
            <li>{@code offset} <b>must</b> be a multiple of 8</li>
            <li>{@code stride} <b>must</b> be a multiple of 8</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_GEOMETRY_AABB_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>If {@code aabbData} is not #NULL_HANDLE, {@code aabbData} <b>must</b> be a valid {@code VkBuffer} handle</li>
        </ul>

        <h5>See Also</h5>
        ##VkGeometryDataNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBuffer("aabbData", "the buffer containing axis-aligned bounding box data.")
    uint32_t("numAABBs", "the number of AABBs in this geometry.")
    uint32_t("stride", "the stride in bytes between AABBs in {@code aabbData}.")
    VkDeviceSize("offset", "the offset in bytes of the first AABB in {@code aabbData}.")
}

val VkGeometryDataNV = struct(Module.VULKAN, "VkGeometryDataNV") {
    documentation =
        """
        Structure specifying geometry in a bottom-level acceleration structure.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code triangles} <b>must</b> be a valid ##VkGeometryTrianglesNV structure</li>
            <li>{@code aabbs} <b>must</b> be a valid ##VkGeometryAABBNV structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkGeometryAABBNV, ##VkGeometryNV, ##VkGeometryTrianglesNV
        """

    VkGeometryTrianglesNV("triangles", "contains triangle data if ##VkGeometryNV{@code ::geometryType} is #GEOMETRY_TYPE_TRIANGLES_NV.")
    VkGeometryAABBNV("aabbs", "contains axis-aligned bounding box data if ##VkGeometryNV{@code ::geometryType} is #GEOMETRY_TYPE_AABBS_NV.")
}

val VkGeometryNV = struct(Module.VULKAN, "VkGeometryNV") {
    documentation =
        """
        Structure specifying a geometry in a bottom-level acceleration structure.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code geometryType} <b>must</b> be #GEOMETRY_TYPE_TRIANGLES_NV or #GEOMETRY_TYPE_AABBS_NV</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_GEOMETRY_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code geometryType} <b>must</b> be a valid {@code VkGeometryTypeKHR} value</li>
            <li>{@code geometry} <b>must</b> be a valid ##VkGeometryDataNV structure</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkGeometryFlagBitsKHR} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureInfoNV, ##VkGeometryDataNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkGeometryTypeKHR("geometryType", "specifies the {@code VkGeometryTypeKHR} which this geometry refers to.")
    VkGeometryDataNV("geometry", "contains the geometry data as described in ##VkGeometryDataNV.")
    VkGeometryFlagsKHR("flags", "has {@code VkGeometryFlagBitsKHR} describing options for this geometry.")
}

val VkAccelerationStructureInfoNV = struct(Module.VULKAN, "VkAccelerationStructureInfoNV") {
    documentation =
        """
        Structure specifying the parameters of acceleration structure object.

        <h5>Description</h5>
        ##VkAccelerationStructureInfoNV contains information that is used both for acceleration structure creation with #CreateAccelerationStructureNV() and in combination with the actual geometric data to build the acceleration structure with #CmdBuildAccelerationStructureNV().

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code geometryCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::maxGeometryCount}</li>
            <li>{@code instanceCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::maxInstanceCount}</li>
            <li>The total number of triangles in all geometries <b>must</b> be less than or equal to ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::maxTriangleCount}</li>
            <li>If {@code type} is #ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV then {@code geometryCount} <b>must</b> be 0</li>
            <li>If {@code type} is #ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV then {@code instanceCount} <b>must</b> be 0</li>
            <li>If {@code type} is #ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV then the {@code geometryType} member of each geometry in {@code pGeometries} <b>must</b> be the same</li>
            <li>{@code type} <b>must</b> not be #ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR</li>
            <li>If {@code flags} has the #BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV bit set, then it <b>must</b> not have the #BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV bit set</li>
            <li>{@code scratch} <b>must</b> have been created with #BUFFER_USAGE_RAY_TRACING_BIT_NV usage flag</li>
            <li>If {@code instanceData} is not #NULL_HANDLE, {@code instanceData} <b>must</b> have been created with #BUFFER_USAGE_RAY_TRACING_BIT_NV usage flag</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code type} <b>must</b> be a valid {@code VkAccelerationStructureTypeKHR} value</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkBuildAccelerationStructureFlagBitsNV} values</li>
            <li>If {@code geometryCount} is not 0, {@code pGeometries} <b>must</b> be a valid pointer to an array of {@code geometryCount} valid ##VkGeometryNV structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureCreateInfoNV, ##VkGeometryNV, #CmdBuildAccelerationStructureNV()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkAccelerationStructureTypeKHR("type", "a {@code VkAccelerationStructureTypeNV} value specifying the type of acceleration structure that will be created.")
    VkBuildAccelerationStructureFlagsNV("flags", "a bitmask of {@code VkBuildAccelerationStructureFlagBitsNV} specifying additional parameters of the acceleration structure.")
    uint32_t("instanceCount", "specifies the number of instances that will be in the new acceleration structure.")
    AutoSize("pGeometries", optional = true)..uint32_t("geometryCount", "specifies the number of geometries that will be in the new acceleration structure.")
    VkGeometryNV.const.p("pGeometries", "a pointer to an array of {@code geometryCount} ##VkGeometryNV structures containing the scene data being passed into the acceleration structure.")
}

val VkAccelerationStructureCreateInfoNV = struct(Module.VULKAN, "VkAccelerationStructureCreateInfoNV") {
    documentation =
        """
        Structure specifying the parameters of a newly created acceleration structure object.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code compactedSize} is not 0 then both {@code info.geometryCount} and {@code info.instanceCount} <b>must</b> be 0</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code info} <b>must</b> be a valid ##VkAccelerationStructureInfoNV structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureInfoNV, #CreateAccelerationStructureNV()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDeviceSize("compactedSize", "the size from the result of #CmdWriteAccelerationStructuresPropertiesNV() if this acceleration structure is going to be the target of a compacting copy.")
    VkAccelerationStructureInfoNV("info", "the ##VkAccelerationStructureInfoNV structure specifying further parameters of the created acceleration structure.")
}

val VkBindAccelerationStructureMemoryInfoNV = struct(Module.VULKAN, "VkBindAccelerationStructureMemoryInfoNV") {
    documentation =
        """
        Structure specifying acceleration structure memory binding.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code accelerationStructure} <b>must</b> not already be backed by a memory object</li>
            <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
            <li>{@code memory} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the ##VkMemoryRequirements structure returned from a call to #GetAccelerationStructureMemoryRequirementsNV() with {@code accelerationStructure} and {@code type} of #ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV</li>
            <li>{@code memoryOffset} <b>must</b> be an integer multiple of the {@code alignment} member of the ##VkMemoryRequirements structure returned from a call to #GetAccelerationStructureMemoryRequirementsNV() with {@code accelerationStructure} and {@code type} of #ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV</li>
            <li>The {@code size} member of the ##VkMemoryRequirements structure returned from a call to #GetAccelerationStructureMemoryRequirementsNV() with {@code accelerationStructure} and {@code type} of #ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV <b>must</b> be less than or equal to the size of {@code memory} minus {@code memoryOffset}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>If {@code deviceIndexCount} is not 0, {@code pDeviceIndices} <b>must</b> be a valid pointer to an array of {@code deviceIndexCount} {@code uint32_t} values</li>
            <li>Both of {@code accelerationStructure}, and {@code memory} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        #BindAccelerationStructureMemoryNV()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkAccelerationStructureNV("accelerationStructure", "the acceleration structure to be attached to memory.")
    VkDeviceMemory("memory", "a {@code VkDeviceMemory} object describing the device memory to attach.")
    VkDeviceSize("memoryOffset", "the start offset of the region of memory that is to be bound to the acceleration structure. The number of bytes returned in the ##VkMemoryRequirements{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified acceleration structure.")
    AutoSize("pDeviceIndices", optional = true)..uint32_t("deviceIndexCount", "the number of elements in {@code pDeviceIndices}.")
    uint32_t.const.p("pDeviceIndices", "a pointer to an array of device indices.")
}

val VkWriteDescriptorSetAccelerationStructureNV = struct(Module.VULKAN, "VkWriteDescriptorSetAccelerationStructureNV") {
    documentation =
        """
        Structure specifying acceleration structure descriptor info.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code accelerationStructureCount} <b>must</b> be equal to {@code descriptorCount} in the extended structure</li>
            <li>Each acceleration structure in {@code pAccelerationStructures} <b>must</b> have been created with #ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-nullDescriptor">nullDescriptor</a> feature is not enabled, each member of {@code pAccelerationStructures} <b>must</b> not be #NULL_HANDLE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV</li>
            <li>{@code pAccelerationStructures} <b>must</b> be a valid pointer to an array of {@code accelerationStructureCount} valid or #NULL_HANDLE {@code VkAccelerationStructureNV} handles</li>
            <li>{@code accelerationStructureCount} <b>must</b> be greater than 0</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pAccelerationStructures", optional = true)..uint32_t("accelerationStructureCount", "the number of elements in {@code pAccelerationStructures}.")
    nullable..VkAccelerationStructureNV.const.p("pAccelerationStructures", "are the acceleration structures to update.")
}

val VkAccelerationStructureMemoryRequirementsInfoNV = struct(Module.VULKAN, "VkAccelerationStructureMemoryRequirementsInfoNV") {
    documentation =
        """
        Structure specifying acceleration to query for memory requirements.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code type} <b>must</b> be a valid {@code VkAccelerationStructureMemoryRequirementsTypeNV} value</li>
            <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
        </ul>

        <h5>See Also</h5>
        #GetAccelerationStructureMemoryRequirementsNV()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkAccelerationStructureMemoryRequirementsTypeNV("type", "selects the type of memory requirement being queried. #ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV returns the memory requirements for the object itself. #ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV returns the memory requirements for the scratch memory when doing a build. #ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV returns the memory requirements for the scratch memory when doing an update.")
    VkAccelerationStructureNV("accelerationStructure", "the acceleration structure to be queried for memory requirements.")
}

val VkPhysicalDeviceRayTracingPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingPropertiesNV", mutable = false) {
    documentation =
        """
        Properties of the physical device for ray tracing.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceRayTracingPropertiesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        Limits specified by this structure <b>must</b> match those specified with the same name in ##VkPhysicalDeviceAccelerationStructurePropertiesKHR and ##VkPhysicalDeviceRayTracingPipelinePropertiesKHR.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("shaderGroupHandleSize", "size in bytes of the shader header.")
    uint32_t("maxRecursionDepth", "the maximum number of levels of recursion allowed in a trace command.")
    uint32_t("maxShaderGroupStride", "the maximum stride in bytes allowed between shader groups in the shader binding table.")
    uint32_t("shaderGroupBaseAlignment", "the required: alignment in bytes for the base of the shader binding table.")
    uint64_t("maxGeometryCount", "the maximum number of geometries in the bottom level acceleration structure.")
    uint64_t("maxInstanceCount", "the maximum number of instances in the top level acceleration structure.")
    uint64_t("maxTriangleCount", "the maximum number of triangles in all geometries in the bottom level acceleration structure.")
    uint32_t("maxDescriptorSetAccelerationStructures", "the maximum number of acceleration structure descriptors that are allowed in a descriptor set.")
}

val VkTransformMatrixNV = struct(Module.VULKAN, "VkTransformMatrixNV", alias = VkTransformMatrixKHR) {
    documentation = "See ##VkTransformMatrixKHR."

    float("matrix", "")[3][4]
}

val VkAabbPositionsNV = struct(Module.VULKAN, "VkAabbPositionsNV", alias = VkAabbPositionsKHR) {
    documentation = "See ##VkAabbPositionsKHR."

    float("minX", "")
    float("minY", "")
    float("minZ", "")
    float("maxX", "")
    float("maxY", "")
    float("maxZ", "")
}

val VkAccelerationStructureInstanceNV = struct(Module.VULKAN, "VkAccelerationStructureInstanceNV", alias = VkAccelerationStructureInstanceKHR) {
    documentation = "See ##VkAccelerationStructureInstanceKHR."

    VkTransformMatrixKHR("transform", "")
    uint32_t("instanceCustomIndex", "", bits = 24)
    uint32_t("mask", "", bits = 8)
    uint32_t("instanceShaderBindingTableRecordOffset", "", bits = 24)
    VkGeometryInstanceFlagsKHR("flags", "", bits = 8)
    uint64_t("accelerationStructureReference", "")
}

val VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV") {
    documentation =
        """
        Structure describing the representative fragment test features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("representativeFragmentTest", "indicates whether the implementation supports the representative fragment test. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#fragops-rep-frag-test\">Representative Fragment Test</a>.")
}

val VkPipelineRepresentativeFragmentTestStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineRepresentativeFragmentTestStateCreateInfoNV") {
    documentation =
        """
        Structure specifying representative fragment test.

        <h5>Description</h5>
        If this structure is not present, {@code representativeFragmentTestEnable} is considered to be #FALSE, and the representative fragment test is disabled.

        If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#shaders-fragment-earlytest">early fragment tests</a> are not enabled in the active fragment shader, the representative fragment shader test has no effect, even if enabled.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("representativeFragmentTestEnable", "controls whether the representative fragment test is enabled.")
}

val VkPhysicalDeviceMaintenance3PropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance3PropertiesKHR", mutable = false, alias = VkPhysicalDeviceMaintenance3Properties) {
    documentation = "See ##VkPhysicalDeviceMaintenance3Properties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    uint32_t("maxPerSetDescriptors", "")
    VkDeviceSize("maxMemoryAllocationSize", "")
}

val VkDescriptorSetLayoutSupportKHR = struct(Module.VULKAN, "VkDescriptorSetLayoutSupportKHR", mutable = false, alias = VkDescriptorSetLayoutSupport) {
    documentation = "See ##VkDescriptorSetLayoutSupport."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkBool32("supported", "")
}

val VkPhysicalDeviceImageViewImageFormatInfoEXT = struct(Module.VULKAN, "VkPhysicalDeviceImageViewImageFormatInfoEXT") {
    documentation =
        """
        Structure for providing image view type.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT</li>
            <li>{@code imageViewType} <b>must</b> be a valid {@code VkImageViewType} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkImageViewType("imageViewType", "a {@code VkImageViewType} value specifying the type of the image view.")
}

val VkFilterCubicImageViewImageFormatPropertiesEXT = struct(Module.VULKAN, "VkFilterCubicImageViewImageFormatPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure for querying cubic filtering capabilities of an image view type.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT</li>
        </ul>

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@code pNext} chain of the ##VkImageFormatProperties2 structure includes a ##VkFilterCubicImageViewImageFormatPropertiesEXT structure, the {@code pNext} chain of the ##VkPhysicalDeviceImageFormatInfo2 structure <b>must</b> include a ##VkPhysicalDeviceImageViewImageFormatInfoEXT structure with an {@code imageViewType} that is compatible with {@code imageType}</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkBool32("filterCubic", "tells if image format, image type and image view type <b>can</b> be used with cubic filtering. This field is set by the implementation. User-specified value is ignored.")
    VkBool32("filterCubicMinmax", "tells if image format, image type and image view type <b>can</b> be used with cubic filtering and minmax filtering. This field is set by the implementation. User-specified value is ignored.")
}

val VkDeviceQueueGlobalPriorityCreateInfoEXT = struct(Module.VULKAN, "VkDeviceQueueGlobalPriorityCreateInfoEXT") {
    documentation =
        """
        Specify a system wide priority.

        <h5>Description</h5>
        A queue created without specifying ##VkDeviceQueueGlobalPriorityCreateInfoEXT will default to #QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_EXT</li>
            <li>{@code globalPriority} <b>must</b> be a valid {@code VkQueueGlobalPriorityEXT} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkQueueGlobalPriorityEXT("globalPriority", "the system-wide priority associated to this queue as specified by {@code VkQueueGlobalPriorityEXT}")
}

val VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR", alias = VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures) {
    documentation = "See ##VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("shaderSubgroupExtendedTypes", "")
}

val VkPhysicalDevice8BitStorageFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevice8BitStorageFeaturesKHR", alias = VkPhysicalDevice8BitStorageFeatures) {
    documentation = "See ##VkPhysicalDevice8BitStorageFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("storageBuffer8BitAccess", "")
    VkBool32("uniformAndStorageBuffer8BitAccess", "")
    VkBool32("storagePushConstant8", "")
}

val VkImportMemoryHostPointerInfoEXT = struct(Module.VULKAN, "VkImportMemoryHostPointerInfoEXT") {
    documentation =
        """
        import memory from a host pointer.

        <h5>Description</h5>
        Importing memory from a host pointer shares ownership of the memory between the host and the Vulkan implementation. The application <b>can</b> continue to access the memory through the host pointer but it is the application's responsibility to synchronize device and non-device access to the payload as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#memory-device-hostaccess">Host Access to Device Memory Objects</a>.

        Applications <b>can</b> import the same payload into multiple instances of Vulkan and multiple times into a given Vulkan instance. However, implementations <b>may</b> fail to import the same payload multiple times into a given physical device due to platform constraints.

        Importing memory from a particular host pointer <b>may</b> not be possible due to additional platform-specific restrictions beyond the scope of this specification in which case the implementation <b>must</b> fail the memory import operation with the error code #ERROR_INVALID_EXTERNAL_HANDLE_KHR.

        Whether device memory objects imported from a host pointer hold a reference to their payload is undefined. As such, the application <b>must</b> ensure that the imported memory range remains valid and accessible for the lifetime of the imported memory object.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code handleType} is not 0, it <b>must</b> be supported for import, as reported in ##VkExternalMemoryProperties</li>
            <li>If {@code handleType} is not 0, it <b>must</b> be #EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT or #EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT</li>
            <li>{@code pHostPointer} <b>must</b> be a pointer aligned to an integer multiple of ##VkPhysicalDeviceExternalMemoryHostPropertiesEXT{@code ::minImportedHostPointerAlignment}</li>
            <li>If {@code handleType} is #EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT, {@code pHostPointer} <b>must</b> be a pointer to {@code allocationSize} number of bytes of host memory, where {@code allocationSize} is the member of the ##VkMemoryAllocateInfo structure this structure is chained to</li>
            <li>If {@code handleType} is #EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT, {@code pHostPointer} <b>must</b> be a pointer to {@code allocationSize} number of bytes of host mapped foreign memory, where {@code allocationSize} is the member of the ##VkMemoryAllocateInfo structure this structure is chained to</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkExternalMemoryHandleTypeFlagBits("handleType", "specifies the handle type.")
    nullable..opaque_p("pHostPointer", "the host pointer to import from.")
}

val VkMemoryHostPointerPropertiesEXT = struct(Module.VULKAN, "VkMemoryHostPointerPropertiesEXT", mutable = false) {
    documentation =
        """
        Properties of external memory host pointer.

        <h5>Description</h5>
        The value returned by {@code memoryTypeBits} <b>must</b> only include bits that identify memory types which are host visible.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #GetMemoryHostPointerPropertiesEXT()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("memoryTypeBits", "a bitmask containing one bit set for every memory type which the specified host pointer <b>can</b> be imported as.")
}

val VkPhysicalDeviceExternalMemoryHostPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceExternalMemoryHostPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing external memory host pointer limits that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceExternalMemoryHostPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkDeviceSize("minImportedHostPointerAlignment", "the minimum required: alignment, in bytes, for the base address and size of host pointers that <b>can</b> be imported to a Vulkan memory object.")
}

val VkPhysicalDeviceShaderAtomicInt64FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderAtomicInt64FeaturesKHR", alias = VkPhysicalDeviceShaderAtomicInt64Features) {
    documentation = "See ##VkPhysicalDeviceShaderAtomicInt64Features."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("shaderBufferInt64Atomics", "")
    VkBool32("shaderSharedInt64Atomics", "")
}

val VkPhysicalDeviceShaderClockFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderClockFeaturesKHR") {
    documentation =
        """
        Structure describing features supported by VK_KHR_shader_clock.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceShaderClockFeaturesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceShaderClockFeaturesKHR can also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("shaderSubgroupClock", "indicates whether shaders <b>can</b> perform {@code Subgroup} scoped clock reads.")
    VkBool32("shaderDeviceClock", "indicates whether shaders <b>can</b> perform {@code Device} scoped clock reads.")
}

val VkPipelineCompilerControlCreateInfoAMD = struct(Module.VULKAN, "VkPipelineCompilerControlCreateInfoAMD") {
    documentation =
        """
        Structure used to pass compilation control flags to a pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD</li>
            <li>{@code compilerControlFlags} <b>must</b> be 0</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineCompilerControlFlagsAMD("compilerControlFlags", "a bitmask of {@code VkPipelineCompilerControlFlagBitsAMD} affecting how the pipeline will be compiled.")
}

val VkCalibratedTimestampInfoEXT = struct(Module.VULKAN, "VkCalibratedTimestampInfoEXT") {
    documentation =
        """
        Structure specifying the input parameters of a calibrated timestamp query.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code timeDomain} <b>must</b> be one of the {@code VkTimeDomainEXT} values returned by #GetPhysicalDeviceCalibrateableTimeDomainsEXT()</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code timeDomain} <b>must</b> be a valid {@code VkTimeDomainEXT} value</li>
        </ul>

        <h5>See Also</h5>
        #GetCalibratedTimestampsEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkTimeDomainEXT("timeDomain", "a {@code VkTimeDomainEXT} value specifying the time domain from which the calibrated timestamp value should be returned.")
}

val VkPhysicalDeviceShaderCorePropertiesAMD = struct(Module.VULKAN, "VkPhysicalDeviceShaderCorePropertiesAMD", mutable = false) {
    documentation =
        """
        Structure describing shader core properties that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceShaderCorePropertiesAMD structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("shaderEngineCount", "an unsigned integer value indicating the number of shader engines found inside the shader core of the physical device.")
    uint32_t("shaderArraysPerEngineCount", "an unsigned integer value indicating the number of shader arrays inside a shader engine. Each shader array has its own scan converter, set of compute units, and a render back end (color and depth buffers). Shader arrays within a shader engine share shader processor input (wave launcher) and shader export (export buffer) units. Currently, a shader engine can have one or two shader arrays.")
    uint32_t("computeUnitsPerShaderArray", "an unsigned integer value indicating the physical number of compute units within a shader array. The active number of compute units in a shader array <b>may</b> be lower. A compute unit houses a set of SIMDs along with a sequencer module and a local data store.")
    uint32_t("simdPerComputeUnit", "an unsigned integer value indicating the number of SIMDs inside a compute unit. Each SIMD processes a single instruction at a time.")
    uint32_t("wavefrontsPerSimd", "")
    uint32_t("wavefrontSize", "an unsigned integer value indicating the maximum size of a subgroup.")
    uint32_t("sgprsPerSimd", "an unsigned integer value indicating the number of physical Scalar General Purpose Registers (SGPRs) per SIMD.")
    uint32_t("minSgprAllocation", "an unsigned integer value indicating the minimum number of SGPRs allocated for a wave.")
    uint32_t("maxSgprAllocation", "an unsigned integer value indicating the maximum number of SGPRs allocated for a wave.")
    uint32_t("sgprAllocationGranularity", "an unsigned integer value indicating the granularity of SGPR allocation for a wave.")
    uint32_t("vgprsPerSimd", "an unsigned integer value indicating the number of physical Vector General Purpose Registers (VGPRs) per SIMD.")
    uint32_t("minVgprAllocation", "an unsigned integer value indicating the minimum number of VGPRs allocated for a wave.")
    uint32_t("maxVgprAllocation", "an unsigned integer value indicating the maximum number of VGPRs allocated for a wave.")
    uint32_t("vgprAllocationGranularity", "an unsigned integer value indicating the granularity of VGPR allocation for a wave.")
}

val VkDeviceMemoryOverallocationCreateInfoAMD = struct(Module.VULKAN, "VkDeviceMemoryOverallocationCreateInfoAMD") {
    documentation =
        """
        Specify memory overallocation behavior for a Vulkan device.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD</li>
            <li>{@code overallocationBehavior} <b>must</b> be a valid {@code VkMemoryOverallocationBehaviorAMD} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkMemoryOverallocationBehaviorAMD("overallocationBehavior", "the desired overallocation behavior.")
}

val VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing max value of vertex attribute divisor that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("maxVertexAttribDivisor", "the maximum value of the number of instances that will repeat the value of vertex attribute data when instanced rendering is enabled.")
}

val VkVertexInputBindingDivisorDescriptionEXT = struct(Module.VULKAN, "VkVertexInputBindingDivisorDescriptionEXT") {
    documentation =
        """
        Structure specifying a divisor used in instanced rendering.

        <h5>Description</h5>
        If this structure is not used to define a divisor value for an attribute then the divisor has a logical default value of 1.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code binding} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}</li>
            <li>If the {@code vertexAttributeInstanceRateZeroDivisor} feature is not enabled, {@code divisor} <b>must</b> not be 0</li>
            <li>If the {@code vertexAttributeInstanceRateDivisor} feature is not enabled, {@code divisor} <b>must</b> be 1</li>
            <li>{@code divisor} <b>must</b> be a value between 0 and ##VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT{@code ::maxVertexAttribDivisor}, inclusive</li>
            <li>##VkVertexInputBindingDescription{@code ::inputRate} <b>must</b> be of type #VERTEX_INPUT_RATE_INSTANCE for this {@code binding}</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineVertexInputDivisorStateCreateInfoEXT
        """

    uint32_t("binding", "the binding number for which the divisor is specified.")
    uint32_t("divisor", "the number of successive instances that will use the same value of the vertex attribute when instanced rendering is enabled. For example, if the divisor is N, the same vertex attribute will be applied to N successive instances before moving on to the next vertex attribute. The maximum value of divisor is implementation dependent and can be queried using ##VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT{@code ::maxVertexAttribDivisor}. A value of 0 <b>can</b> be used for the divisor if the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-vertexAttributeInstanceRateZeroDivisor\">{@code vertexAttributeInstanceRateZeroDivisor}</a> feature is enabled. In this case, the same vertex attribute will be applied to all instances.")
}

val VkPipelineVertexInputDivisorStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineVertexInputDivisorStateCreateInfoEXT") {
    documentation =
        """
        Structure specifying vertex attributes assignment during instanced rendering.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT</li>
            <li>{@code pVertexBindingDivisors} <b>must</b> be a valid pointer to an array of {@code vertexBindingDivisorCount} ##VkVertexInputBindingDivisorDescriptionEXT structures</li>
            <li>{@code vertexBindingDivisorCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkVertexInputBindingDivisorDescriptionEXT
        """

    VkStructureType("sType", "the type of this structure")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure")
    AutoSize("pVertexBindingDivisors")..uint32_t("vertexBindingDivisorCount", "the number of elements in the {@code pVertexBindingDivisors} array.")
    VkVertexInputBindingDivisorDescriptionEXT.const.p("pVertexBindingDivisors", "a pointer to an array of ##VkVertexInputBindingDivisorDescriptionEXT structures, which specifies the divisor value for each binding.")
}

val VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT") {
    documentation =
        """
        Structure describing if fetching of vertex attribute may be repeated for instanced rendering.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating the implementation-dependent behavior. ##VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT <b>can</b> also be included in {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("vertexAttributeInstanceRateDivisor", "specifies whether vertex attribute fetching may be repeated in case of instanced rendering.")
    VkBool32("vertexAttributeInstanceRateZeroDivisor", "specifies whether a zero value for ##VkVertexInputBindingDivisorDescriptionEXT{@code ::divisor} is supported.")
}

val VkPipelineCreationFeedbackEXT = struct(Module.VULKAN, "VkPipelineCreationFeedbackEXT", mutable = false) {
    documentation =
        """
        Feedback about the creation of a pipeline or pipeline stage.

        <h5>Description</h5>
        If the #PIPELINE_CREATION_FEEDBACK_VALID_BIT_EXT is not set in {@code flags}, an implementation <b>must</b> not set any other bits in {@code flags}, and the values of all other ##VkPipelineCreationFeedbackEXT data members are undefined.

        <h5>See Also</h5>
        ##VkPipelineCreationFeedbackCreateInfoEXT
        """

    VkPipelineCreationFeedbackFlagsEXT("flags", "a bitmask of {@code VkPipelineCreationFeedbackFlagBitsEXT} providing feedback about the creation of a pipeline or of a pipeline stage.")
    uint64_t("duration", "the duration spent creating a pipeline or pipeline stage in nanoseconds.")
}

val VkPipelineCreationFeedbackCreateInfoEXT = struct(Module.VULKAN, "VkPipelineCreationFeedbackCreateInfoEXT") {
    documentation =
        """
        Request for feedback about the creation of a pipeline.

        <h5>Description</h5>
        An implementation <b>should</b> write pipeline creation feedback to {@code pPipelineCreationFeedback} and <b>may</b> write pipeline stage creation feedback to {@code pPipelineStageCreationFeedbacks}. An implementation <b>must</b> set or clear the #PIPELINE_CREATION_FEEDBACK_VALID_BIT_EXT in ##VkPipelineCreationFeedbackEXT{@code ::flags} for {@code pPipelineCreationFeedback} and every element of {@code pPipelineStageCreationFeedbacks}.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        One common scenario for an implementation to skip per-stage feedback is when #PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT_EXT is set in {@code pPipelineCreationFeedback}.
        </div>

        When chained to ##VkRayTracingPipelineCreateInfoKHR, ##VkRayTracingPipelineCreateInfoNV, or ##VkGraphicsPipelineCreateInfo, the {@code i} element of {@code pPipelineStageCreationFeedbacks} corresponds to the {@code i} element of ##VkRayTracingPipelineCreateInfoKHR{@code ::pStages}, ##VkRayTracingPipelineCreateInfoNV{@code ::pStages}, or ##VkGraphicsPipelineCreateInfo{@code ::pStages}. When chained to ##VkComputePipelineCreateInfo, the first element of {@code pPipelineStageCreationFeedbacks} corresponds to ##VkComputePipelineCreateInfo{@code ::stage}.

        <h5>Valid Usage</h5>
        <ul>
            <li>When chained to ##VkGraphicsPipelineCreateInfo, ##VkPipelineCreationFeedbackEXT{@code ::pipelineStageCreationFeedbackCount} <b>must</b> equal ##VkGraphicsPipelineCreateInfo{@code ::stageCount}</li>
            <li>When chained to ##VkComputePipelineCreateInfo, ##VkPipelineCreationFeedbackEXT{@code ::pipelineStageCreationFeedbackCount} <b>must</b> equal 1</li>
            <li>When chained to ##VkRayTracingPipelineCreateInfoKHR, ##VkPipelineCreationFeedbackEXT{@code ::pipelineStageCreationFeedbackCount} <b>must</b> equal ##VkRayTracingPipelineCreateInfoKHR{@code ::stageCount}</li>
            <li>When chained to ##VkRayTracingPipelineCreateInfoNV, ##VkPipelineCreationFeedbackEXT{@code ::pipelineStageCreationFeedbackCount} <b>must</b> equal ##VkRayTracingPipelineCreateInfoNV{@code ::stageCount}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO_EXT</li>
            <li>{@code pPipelineCreationFeedback} <b>must</b> be a valid pointer to a ##VkPipelineCreationFeedbackEXT structure</li>
            <li>{@code pPipelineStageCreationFeedbacks} <b>must</b> be a valid pointer to an array of {@code pipelineStageCreationFeedbackCount} ##VkPipelineCreationFeedbackEXT structures</li>
            <li>{@code pipelineStageCreationFeedbackCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkComputePipelineCreateInfo, ##VkGraphicsPipelineCreateInfo, ##VkPipelineCreationFeedbackEXT, ##VkRayTracingPipelineCreateInfoKHR, ##VkRayTracingPipelineCreateInfoNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineCreationFeedbackEXT.p("pPipelineCreationFeedback", "a pointer to a ##VkPipelineCreationFeedbackEXT structure.")
    AutoSize("pPipelineStageCreationFeedbacks")..uint32_t("pipelineStageCreationFeedbackCount", "the number of elements in {@code pPipelineStageCreationFeedbacks}.")
    VkPipelineCreationFeedbackEXT.p("pPipelineStageCreationFeedbacks", "a pointer to an array of {@code pipelineStageCreationFeedbackCount} ##VkPipelineCreationFeedbackEXT structures.")
}

val VkConformanceVersionKHR = struct(Module.VULKAN, "VkConformanceVersionKHR", alias = VkConformanceVersion) {
    documentation = "See ##VkConformanceVersion."

    uint8_t("major", "")
    uint8_t("minor", "")
    uint8_t("subminor", "")
    uint8_t("patch", "")
}

val VkPhysicalDeviceDriverPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceDriverPropertiesKHR", mutable = false, alias = VkPhysicalDeviceDriverProperties) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation = "See ##VkPhysicalDeviceDriverProperties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkDriverId("driverID", "")
    charUTF8("driverName", "")["VK_MAX_DRIVER_NAME_SIZE"]
    charUTF8("driverInfo", "")["VK_MAX_DRIVER_INFO_SIZE"]
    VkConformanceVersion("conformanceVersion", "")
}

val VkPhysicalDeviceFloatControlsPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceFloatControlsPropertiesKHR", mutable = false, alias = VkPhysicalDeviceFloatControlsProperties) {
    documentation = "See ##VkPhysicalDeviceFloatControlsProperties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkShaderFloatControlsIndependence("denormBehaviorIndependence", "")
    VkShaderFloatControlsIndependence("roundingModeIndependence", "")
    VkBool32("shaderSignedZeroInfNanPreserveFloat16", "")
    VkBool32("shaderSignedZeroInfNanPreserveFloat32", "")
    VkBool32("shaderSignedZeroInfNanPreserveFloat64", "")
    VkBool32("shaderDenormPreserveFloat16", "")
    VkBool32("shaderDenormPreserveFloat32", "")
    VkBool32("shaderDenormPreserveFloat64", "")
    VkBool32("shaderDenormFlushToZeroFloat16", "")
    VkBool32("shaderDenormFlushToZeroFloat32", "")
    VkBool32("shaderDenormFlushToZeroFloat64", "")
    VkBool32("shaderRoundingModeRTEFloat16", "")
    VkBool32("shaderRoundingModeRTEFloat32", "")
    VkBool32("shaderRoundingModeRTEFloat64", "")
    VkBool32("shaderRoundingModeRTZFloat16", "")
    VkBool32("shaderRoundingModeRTZFloat32", "")
    VkBool32("shaderRoundingModeRTZFloat64", "")
}

val VkSubpassDescriptionDepthStencilResolveKHR = struct(Module.VULKAN, "VkSubpassDescriptionDepthStencilResolveKHR", alias = VkSubpassDescriptionDepthStencilResolve) {
    documentation = "See ##VkSubpassDescriptionDepthStencilResolve."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkResolveModeFlagBits("depthResolveMode", "")
    VkResolveModeFlagBits("stencilResolveMode", "")
    nullable..VkAttachmentReference2.const.p("pDepthStencilResolveAttachment", "")
}

val VkPhysicalDeviceDepthStencilResolvePropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceDepthStencilResolvePropertiesKHR", mutable = false, alias = VkPhysicalDeviceDepthStencilResolveProperties) {
    documentation = "See ##VkPhysicalDeviceDepthStencilResolveProperties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkResolveModeFlags("supportedDepthResolveModes", "")
    VkResolveModeFlags("supportedStencilResolveModes", "")
    VkBool32("independentResolveNone", "")
    VkBool32("independentResolve", "")
}

val VkPhysicalDeviceComputeShaderDerivativesFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceComputeShaderDerivativesFeaturesNV") {
    documentation =
        """
        Structure describing compute shader derivative features that can be supported by an implementation.

        <h5>Description</h5>
        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#shaders-scope-quad">Quad</a> chapter for more information.

        If the ##VkPhysicalDeviceComputeShaderDerivativesFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceComputeShaderDerivativesFeaturesNV <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("computeDerivativeGroupQuads", "indicates that the implementation supports the {@code ComputeDerivativeGroupQuadsNV} SPIR-V capability.")
    VkBool32("computeDerivativeGroupLinear", "indicates that the implementation supports the {@code ComputeDerivativeGroupLinearNV} SPIR-V capability.")
}

val VkPhysicalDeviceMeshShaderFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceMeshShaderFeaturesNV") {
    documentation =
        """
        Structure describing mesh shading features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceMeshShaderFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with a value indicating whether the feature is supported. ##VkPhysicalDeviceMeshShaderFeaturesNV <b>can</b> also be included in {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("taskShader", "indicates whether the task shader stage is supported.")
    VkBool32("meshShader", "indicates whether the mesh shader stage is supported.")
}

val VkPhysicalDeviceMeshShaderPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceMeshShaderPropertiesNV", mutable = false) {
    documentation =
        """
        Structure describing mesh shading properties.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceMeshShaderPropertiesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("maxDrawMeshTasksCount", "the maximum number of local workgroups that <b>can</b> be launched by a single draw mesh tasks command. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#drawing-mesh-shading\">Programmable Mesh Shading</a>.")
    uint32_t("maxTaskWorkGroupInvocations", "the maximum total number of task shader invocations in a single local workgroup. The product of the X, Y, and Z sizes, as specified by the {@code LocalSize} execution mode in shader modules or by the object decorated by the {@code WorkgroupSize} decoration, <b>must</b> be less than or equal to this limit.")
    uint32_t("maxTaskWorkGroupSize", "the maximum size of a local task workgroup. These three values represent the maximum local workgroup size in the X, Y, and Z dimensions, respectively. The {@code x}, {@code y}, and {@code z} sizes, as specified by the {@code LocalSize} execution mode or by the object decorated by the {@code WorkgroupSize} decoration in shader modules, <b>must</b> be less than or equal to the corresponding limit.")[3]
    uint32_t("maxTaskTotalMemorySize", "the maximum number of bytes that the task shader can use in total for shared and output memory combined.")
    uint32_t("maxTaskOutputCount", "the maximum number of output tasks a single task shader workgroup can emit.")
    uint32_t("maxMeshWorkGroupInvocations", "the maximum total number of mesh shader invocations in a single local workgroup. The product of the X, Y, and Z sizes, as specified by the {@code LocalSize} execution mode in shader modules or by the object decorated by the {@code WorkgroupSize} decoration, <b>must</b> be less than or equal to this limit.")
    uint32_t("maxMeshWorkGroupSize", "the maximum size of a local mesh workgroup. These three values represent the maximum local workgroup size in the X, Y, and Z dimensions, respectively. The {@code x}, {@code y}, and {@code z} sizes, as specified by the {@code LocalSize} execution mode or by the object decorated by the {@code WorkgroupSize} decoration in shader modules, <b>must</b> be less than or equal to the corresponding limit.")[3]
    uint32_t("maxMeshTotalMemorySize", "the maximum number of bytes that the mesh shader can use in total for shared and output memory combined.")
    uint32_t("maxMeshOutputVertices", "the maximum number of vertices a mesh shader output can store.")
    uint32_t("maxMeshOutputPrimitives", "the maximum number of primitives a mesh shader output can store.")
    uint32_t("maxMeshMultiviewViewCount", "the maximum number of multi-view views a mesh shader can use.")
    uint32_t("meshOutputPerVertexGranularity", "the granularity with which mesh vertex outputs are allocated. The value can be used to compute the memory size used by the mesh shader, which must be less than or equal to {@code maxMeshTotalMemorySize}.")
    uint32_t("meshOutputPerPrimitiveGranularity", "the granularity with which mesh outputs qualified as per-primitive are allocated. The value can be used to compute the memory size used by the mesh shader, which must be less than or equal to {@code maxMeshTotalMemorySize}.")
}

val VkDrawMeshTasksIndirectCommandNV = struct(Module.VULKAN, "VkDrawMeshTasksIndirectCommandNV") {
    documentation =
        """
        Structure specifying a mesh tasks draw indirect command.

        <h5>Description</h5>
        The members of ##VkDrawMeshTasksIndirectCommandNV have the same meaning as the similarly named parameters of #CmdDrawMeshTasksNV().

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code taskCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceMeshShaderPropertiesNV{@code ::maxDrawMeshTasksCount}</li>
        </ul>

        <h5>See Also</h5>
        #CmdDrawMeshTasksIndirectNV()
        """

    uint32_t("taskCount", "the number of local workgroups to dispatch in the X dimension. Y and Z dimension are implicitly set to one.")
    uint32_t("firstTask", "the X component of the first workgroup ID.")
}

val VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV") {
    documentation =
        """
        Structure describing barycentric support in fragment shaders that can be supported by an implementation.

        <h5>Description</h5>
        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#primsrast-barycentric">Barycentric Interpolation</a> for more information.

        If the ##VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("fragmentShaderBarycentric", "indicates that the implementation supports the {@code BaryCoordNV} and {@code BaryCoordNoPerspNV} SPIR-V fragment shader built-ins and supports the {@code PerVertexNV} SPIR-V decoration on fragment shader input variables.")
}

val VkPhysicalDeviceShaderImageFootprintFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceShaderImageFootprintFeaturesNV") {
    documentation =
        """
        Structure describing shader image footprint features that can be supported by an implementation.

        <h5>Description</h5>
        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#textures-footprint">Texel Footprint Evaluation</a> for more information.

        If the ##VkPhysicalDeviceShaderImageFootprintFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceShaderImageFootprintFeaturesNV <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("imageFootprint", "specifies whether the implementation supports the {@code ImageFootprintNV} SPIR-V capability.")
}

val VkPipelineViewportExclusiveScissorStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineViewportExclusiveScissorStateCreateInfoNV") {
    documentation =
        """
        Structure specifying parameters controlling exclusive scissor testing.

        <h5>Description</h5>
        If the #DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV dynamic state is enabled for a pipeline, the {@code pExclusiveScissors} member is ignored.

        When this structure is included in the {@code pNext} chain of ##VkGraphicsPipelineCreateInfo, it defines parameters of the exclusive scissor test. If this structure is not included in the {@code pNext} chain, it is equivalent to specifying this structure with a {@code exclusiveScissorCount} of 0.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-multiViewport">multiple viewports</a> feature is not enabled, {@code exclusiveScissorCount} <b>must</b> be 0 or 1</li>
            <li>{@code exclusiveScissorCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxViewports}</li>
            <li>{@code exclusiveScissorCount} <b>must</b> be 0 or greater than or equal to the {@code viewportCount} member of ##VkPipelineViewportStateCreateInfo</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV</li>
        </ul>

        <h5>See Also</h5>
        ##VkRect2D
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pExclusiveScissors", optional = true)..uint32_t("exclusiveScissorCount", "the number of exclusive scissor rectangles.")
    VkRect2D.const.p("pExclusiveScissors", "a pointer to an array of ##VkRect2D structures defining exclusive scissor rectangles.")
}

val VkPhysicalDeviceExclusiveScissorFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceExclusiveScissorFeaturesNV") {
    documentation =
        """
        Structure describing exclusive scissor features that can be supported by an implementation.

        <h5>Description</h5>
        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fragops-exclusive-scissor">Exclusive Scissor Test</a> for more information.

        If the ##VkPhysicalDeviceExclusiveScissorFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceExclusiveScissorFeaturesNV <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("exclusiveScissor", "indicates that the implementation supports the exclusive scissor test.")
}

val VkQueueFamilyCheckpointPropertiesNV = struct(Module.VULKAN, "VkQueueFamilyCheckpointPropertiesNV", mutable = false) {
    documentation =
        """
        return structure for queue family checkpoint info query.

        <h5>Description</h5>
        Additional queue family information can be queried by setting ##VkQueueFamilyProperties2{@code ::pNext} to point to a ##VkQueueFamilyCheckpointPropertiesNV structure.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkPipelineStageFlags("checkpointExecutionStageMask", "a mask indicating which pipeline stages the implementation can execute checkpoint markers in.")
}

val VkCheckpointDataNV = struct(Module.VULKAN, "VkCheckpointDataNV", mutable = false) {
    documentation =
        """
        return structure for command buffer checkpoint data.

        <h5>Description</h5>
        The stages at which a checkpoint marker <b>can</b> be executed are implementation-defined and <b>can</b> be queried by calling #GetPhysicalDeviceQueueFamilyProperties2().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_CHECKPOINT_DATA_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #GetQueueCheckpointDataNV()
        """

    VkStructureType("sType", "the type of this structure").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkPipelineStageFlagBits("stage", "indicates which pipeline stage the checkpoint marker data refers to.")
    opaque_p("pCheckpointMarker", "contains the value of the last checkpoint marker executed in the stage that {@code stage} refers to.")
}

val VkPhysicalDeviceTimelineSemaphoreFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceTimelineSemaphoreFeaturesKHR", alias = VkPhysicalDeviceTimelineSemaphoreFeatures) {
    documentation = "See ##VkPhysicalDeviceTimelineSemaphoreFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("timelineSemaphore", "")
}

val VkPhysicalDeviceTimelineSemaphorePropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceTimelineSemaphorePropertiesKHR", mutable = false, alias = VkPhysicalDeviceTimelineSemaphoreProperties) {
    documentation = "See ##VkPhysicalDeviceTimelineSemaphoreProperties."

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    uint64_t("maxTimelineSemaphoreValueDifference", "")
}

val VkSemaphoreTypeCreateInfoKHR = struct(Module.VULKAN, "VkSemaphoreTypeCreateInfoKHR", alias = VkSemaphoreTypeCreateInfo) {
    documentation = "See ##VkSemaphoreTypeCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkSemaphoreType("semaphoreType", "")
    uint64_t("initialValue", "")
}

val VkTimelineSemaphoreSubmitInfoKHR = struct(Module.VULKAN, "VkTimelineSemaphoreSubmitInfoKHR", alias = VkTimelineSemaphoreSubmitInfo) {
    documentation = "See ##VkTimelineSemaphoreSubmitInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    AutoSize("pWaitSemaphoreValues", optional = true)..uint32_t("waitSemaphoreValueCount", "")
    nullable..uint64_t.const.p("pWaitSemaphoreValues", "")
    AutoSize("pSignalSemaphoreValues", optional = true)..uint32_t("signalSemaphoreValueCount", "")
    nullable..uint64_t.const.p("pSignalSemaphoreValues", "")
}

val VkSemaphoreWaitInfoKHR = struct(Module.VULKAN, "VkSemaphoreWaitInfoKHR", alias = VkSemaphoreWaitInfo) {
    documentation = "See ##VkSemaphoreWaitInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkSemaphoreWaitFlags("flags", "")
    AutoSize("pSemaphores", "pValues")..uint32_t("semaphoreCount", "")
    VkSemaphore.const.p("pSemaphores", "")
    uint64_t.const.p("pValues", "")
}

val VkSemaphoreSignalInfoKHR = struct(Module.VULKAN, "VkSemaphoreSignalInfoKHR", alias = VkSemaphoreSignalInfo) {
    documentation = "See ##VkSemaphoreSignalInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkSemaphore("semaphore", "")
    uint64_t("value", "")
}

val VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL = struct(Module.VULKAN, "VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL") {
    documentation =
        """
        Structure describing shader integer functions that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("shaderIntegerFunctions2", "indicates that the implementation supports the {@code IntegerFunctions2INTEL} SPIR-V capability.")
}

val VkPerformanceValueDataINTEL = union(Module.VULKAN, "VkPerformanceValueDataINTEL") {
    documentation =
        """
        Values returned for the parameters.

        <h5>Description</h5>
        The correct member of the union is determined by the associated {@code VkPerformanceValueTypeINTEL} value.

        <h5>See Also</h5>
        ##VkPerformanceValueINTEL
        """

    uint32_t("value32", "")
    uint64_t("value64", "")
    float("valueFloat", "")
    VkBool32("valueBool", "")
    charUTF8.const.p("valueString", "")
}

val VkPerformanceValueINTEL = struct(Module.VULKAN, "VkPerformanceValueINTEL") {
    documentation =
        """
        Container for value and types of parameters that can be queried.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be a valid {@code VkPerformanceValueTypeINTEL} value</li>
            <li>If {@code type} is #PERFORMANCE_VALUE_TYPE_STRING_INTEL, the {@code valueString} member of {@code data} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>

        <h5>See Also</h5>
        ##VkPerformanceValueDataINTEL, #GetPerformanceParameterINTEL()
        """

    VkPerformanceValueTypeINTEL("type", "a {@code VkPerformanceValueTypeINTEL} value specifying the type of the returned data.")
    VkPerformanceValueDataINTEL("data", "a ##VkPerformanceValueDataINTEL union specifying the value of the returned data.")
}

val VkInitializePerformanceApiInfoINTEL = struct(Module.VULKAN, "VkInitializePerformanceApiInfoINTEL") {
    documentation =
        """
        Structure specifying parameters of initialize of the device.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #InitializePerformanceApiINTEL()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    nullable..opaque_p("pUserData", "a pointer for application data.")
}

val _VkQueryPoolPerformanceQueryCreateInfoINTEL = struct(Module.VULKAN, "VkQueryPoolPerformanceQueryCreateInfoINTEL")
val VkQueryPoolCreateInfoINTEL = struct(Module.VULKAN, "VkQueryPoolCreateInfoINTEL", alias = _VkQueryPoolPerformanceQueryCreateInfoINTEL) {
    documentation = "See ##VkQueryPoolPerformanceQueryCreateInfoINTEL."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkQueryPoolSamplingModeINTEL("performanceCountersSampling", "")
}

val VkQueryPoolPerformanceQueryCreateInfoINTEL = struct(Module.VULKAN, "VkQueryPoolPerformanceQueryCreateInfoINTEL") {
    documentation =
        """
        Structure specifying parameters to create a pool of performance queries.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL</li>
            <li>{@code performanceCountersSampling} <b>must</b> be a valid {@code VkQueryPoolSamplingModeINTEL} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkQueryPoolSamplingModeINTEL("performanceCountersSampling", "describe how performance queries should be captured.")
}

val VkPerformanceMarkerInfoINTEL = struct(Module.VULKAN, "VkPerformanceMarkerInfoINTEL") {
    documentation =
        """
        Structure specifying performance markers.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #CmdSetPerformanceMarkerINTEL()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    uint64_t("marker", "the marker value that will be recorded into the opaque query results.")
}

val VkPerformanceStreamMarkerInfoINTEL = struct(Module.VULKAN, "VkPerformanceStreamMarkerInfoINTEL") {
    documentation =
        """
        Structure specifying stream performance markers.

        <h5>Valid Usage</h5>
        <ul>
            <li>The value written by the application into {@code marker} <b>must</b> only used the valid bits as reported by #GetPerformanceParameterINTEL() with the #PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #CmdSetPerformanceStreamMarkerINTEL()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    uint32_t("marker", "the marker value that will be recorded into the reports consumed by an external application.")
}

val VkPerformanceOverrideInfoINTEL = struct(Module.VULKAN, "VkPerformanceOverrideInfoINTEL") {
    documentation =
        """
        Performance override info.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code type} <b>must</b> be a valid {@code VkPerformanceOverrideTypeINTEL} value</li>
        </ul>

        <h5>See Also</h5>
        #CmdSetPerformanceOverrideINTEL()
        """

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkPerformanceOverrideTypeINTEL("type", "the particular {@code VkPerformanceOverrideTypeINTEL} to set.")
    VkBool32("enable", "defines whether the override is enabled.")
    uint64_t("parameter", "a potential required parameter for the override.")
}

val VkPerformanceConfigurationAcquireInfoINTEL = struct(Module.VULKAN, "VkPerformanceConfigurationAcquireInfoINTEL") {
    documentation =
        """
        Acquire a configuration to capture performance data.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code type} <b>must</b> be a valid {@code VkPerformanceConfigurationTypeINTEL} value</li>
        </ul>

        <h5>See Also</h5>
        #AcquirePerformanceConfigurationINTEL()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPerformanceConfigurationTypeINTEL("type", "one of the {@code VkPerformanceConfigurationTypeINTEL} type of performance configuration that will be acquired.")
}

val VkPhysicalDeviceVulkanMemoryModelFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVulkanMemoryModelFeaturesKHR", alias = VkPhysicalDeviceVulkanMemoryModelFeatures) {
    documentation = "See ##VkPhysicalDeviceVulkanMemoryModelFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("vulkanMemoryModel", "")
    VkBool32("vulkanMemoryModelDeviceScope", "")
    VkBool32("vulkanMemoryModelAvailabilityVisibilityChains", "")
}

val VkPhysicalDevicePCIBusInfoPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDevicePCIBusInfoPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure containing PCI bus information of a physical device.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("pciDomain", "the PCI bus domain.")
    uint32_t("pciBus", "the PCI bus identifier.")
    uint32_t("pciDevice", "the PCI device identifier.")
    uint32_t("pciFunction", "the PCI device function identifier.")
}

val VkDisplayNativeHdrSurfaceCapabilitiesAMD = struct(Module.VULKAN, "VkDisplayNativeHdrSurfaceCapabilitiesAMD", mutable = false) {
    documentation =
        """
        Structure describing display native HDR specific capabilities of a surface.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkBool32("localDimmingSupport", "specifies whether the surface supports local dimming. If this is #TRUE, ##VkSwapchainDisplayNativeHdrCreateInfoAMD <b>can</b> be used to explicitly enable or disable local dimming for the surface. Local dimming may also be overriden by #SetLocalDimmingAMD() during the lifetime of the swapchain.")
}

val VkSwapchainDisplayNativeHdrCreateInfoAMD = struct(Module.VULKAN, "VkSwapchainDisplayNativeHdrCreateInfoAMD") {
    documentation =
        """
        Structure specifying display native HDR parameters of a newly created swapchain object.

        <h5>Description</h5>
        If the {@code pNext} chain of ##VkSwapchainCreateInfoKHR does not include this structure, the default value for {@code localDimmingEnable} is #TRUE, meaning local dimming is initially enabled for the swapchain.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD</li>
        </ul>

        <h5>Valid Usage</h5>
        <ul>
            <li>It is only valid to set {@code localDimmingEnable} to #TRUE if ##VkDisplayNativeHdrSurfaceCapabilitiesAMD{@code ::localDimmingSupport} is supported</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("localDimmingEnable", "specifies whether local dimming is enabled for the swapchain.")
}

val VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR") {
    documentation =
        """
        Structure describing support for the SPIR-V {@code SPV_KHR_terminate_invocation} extension.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with a value indicating whether the feature is supported. ##VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("shaderTerminateInvocation", "specifies whether the implementation supports SPIR-V modules that use the {@code SPV_KHR_terminate_invocation} extension.")
}

val VkMetalSurfaceCreateInfoEXT = struct(Module.VULKAN, "VkMetalSurfaceCreateInfoEXT") {
    documentation =
        """
        Structure specifying parameters of a newly created Metal surface object.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>

        <h5>See Also</h5>
        #CreateMetalSurfaceEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkMetalSurfaceCreateFlagsEXT("flags", "reserved for future use.")
    CAMetalLayer.const.p("pLayer", "a reference to a {@code CAMetalLayer} object representing a renderable surface.")
}

val VkPhysicalDeviceFragmentDensityMapFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMapFeaturesEXT") {
    documentation =
        """
        Structure describing fragment density map features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceFragmentDensityMapFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceFragmentDensityMapFeaturesEXT <b>can</b> also be included in {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("fragmentDensityMap", "specifies whether the implementation supports render passes with a fragment density map attachment. If this feature is not enabled and the {@code pNext} chain of ##VkRenderPassCreateInfo includes a ##VkRenderPassFragmentDensityMapCreateInfoEXT structure, {@code fragmentDensityMapAttachment} <b>must</b> be #ATTACHMENT_UNUSED.")
    VkBool32("fragmentDensityMapDynamic", "specifies whether the implementation supports dynamic fragment density map image views. If this feature is not enabled, #IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT <b>must</b> not be included in ##VkImageViewCreateInfo{@code ::flags}.")
    VkBool32("fragmentDensityMapNonSubsampledImages", "specifies whether the implementation supports regular non-subsampled image attachments with fragment density map render passes. If this feature is not enabled, render passes with a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#renderpass-fragmentdensitymapattachment\">fragment density map attachment</a> <b>must</b> only have <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#samplers-subsamplesampler\">subsampled attachments</a> bound.")
}

val VkPhysicalDeviceFragmentDensityMapPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMapPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing fragment density map properties that can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT</li>
        </ul>

        If the ##VkPhysicalDeviceFragmentDensityMapPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits and properties.

        <h5>See Also</h5>
        ##VkExtent2D
        """

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkExtent2D("minFragmentDensityTexelSize", "the minimum <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#glossary-fragment-density-texel-size\">fragment density texel size</a>.")
    VkExtent2D("maxFragmentDensityTexelSize", "the maximum fragment density texel size.")
    VkBool32("fragmentDensityInvocations", "specifies whether the implementation <b>may</b> invoke additional fragment shader invocations for each covered sample.")
}

val VkRenderPassFragmentDensityMapCreateInfoEXT = struct(Module.VULKAN, "VkRenderPassFragmentDensityMapCreateInfoEXT") {
    documentation =
        """
        Structure containing fragment density map attachment for render pass.

        <h5>Description</h5>
        The fragment density map is read at an implementation-dependent time with the following constraints determined by the attachment's image view {@code flags}:

        <ul>
            <li>#IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT specifies that the fragment density map will be read by the device during #PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
            <li>#IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DEFERRED_BIT_EXT specifies that the fragment density map will be read by the host during #EndCommandBuffer() of the primary command buffer that the render pass is recorded into</li>
            <li>Otherwise the fragment density map will be read by the host during #CmdBeginRenderPass()</li>
        </ul>

        The fragment density map <b>may</b> additionally be read by the device during #PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT for any mode.

        If this structure is not present, it is as if {@code fragmentDensityMapAttachment} was given as #ATTACHMENT_UNUSED.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code fragmentDensityMapAttachment} is not #ATTACHMENT_UNUSED, {@code fragmentDensityMapAttachment} <b>must</b> be less than ##VkRenderPassCreateInfo{@code ::attachmentCount}</li>
            <li>If {@code fragmentDensityMapAttachment} is not #ATTACHMENT_UNUSED, {@code fragmentDensityMapAttachment} <b>must</b> not be an element of ##VkSubpassDescription{@code ::pInputAttachments}, ##VkSubpassDescription{@code ::pColorAttachments}, ##VkSubpassDescription{@code ::pResolveAttachments}, ##VkSubpassDescription{@code ::pDepthStencilAttachment}, or ##VkSubpassDescription{@code ::pPreserveAttachments} for any subpass</li>
            <li>If {@code fragmentDensityMapAttachment} is not #ATTACHMENT_UNUSED, {@code layout} <b>must</b> be equal to #IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT, or #IMAGE_LAYOUT_GENERAL</li>
            <li>If {@code fragmentDensityMapAttachment} is not #ATTACHMENT_UNUSED, {@code fragmentDensityMapAttachment} <b>must</b> reference an attachment with a {@code loadOp} equal to #ATTACHMENT_LOAD_OP_LOAD or #ATTACHMENT_LOAD_OP_DONT_CARE</li>
            <li>If {@code fragmentDensityMapAttachment} is not #ATTACHMENT_UNUSED, {@code fragmentDensityMapAttachment} <b>must</b> reference an attachment with a {@code storeOp} equal to #ATTACHMENT_STORE_OP_DONT_CARE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT</li>
            <li>{@code fragmentDensityMapAttachment} <b>must</b> be a valid ##VkAttachmentReference structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentReference
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkAttachmentReference("fragmentDensityMapAttachment", "the fragment density map to use for the render pass.")
}

val VkPhysicalDeviceScalarBlockLayoutFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceScalarBlockLayoutFeaturesEXT", alias = VkPhysicalDeviceScalarBlockLayoutFeatures) {
    documentation = "See ##VkPhysicalDeviceScalarBlockLayoutFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("scalarBlockLayout", "")
}

val VkPhysicalDeviceSubgroupSizeControlFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceSubgroupSizeControlFeaturesEXT") {
    documentation =
        """
        Structure describing the subgroup size control features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceSubgroupSizeControlFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceSubgroupSizeControlFeaturesEXT <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The ##VkPhysicalDeviceSubgroupSizeControlFeaturesEXT structure was added in version 2 of the {@link EXTSubgroupSizeControl VK_EXT_subgroup_size_control} extension. Version 1 implementations of this extension will not fill out the features structure but applications may assume that both {@code subgroupSizeControl} and {@code computeFullSubgroups} are supported if the extension is supported. (See also the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-requirements">Feature Requirements</a> section.) Applications are advised to add a ##VkPhysicalDeviceSubgroupSizeControlFeaturesEXT structure to the {@code pNext} chain of ##VkDeviceCreateInfo to enable the features regardless of the version of the extension supported by the implementation. If the implementation only supports version 1, it will safely ignore the ##VkPhysicalDeviceSubgroupSizeControlFeaturesEXT structure.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("subgroupSizeControl", "indicates whether the implementation supports controlling shader subgroup sizes via the #PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT flag and the ##VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT structure.")
    VkBool32("computeFullSubgroups", "indicates whether the implementation supports requiring full subgroups in compute shaders via the #PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT flag.")
}

val VkPhysicalDeviceSubgroupSizeControlPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceSubgroupSizeControlPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing the control subgroup size properties of an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceSubgroupSizeControlPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        If ##VkPhysicalDeviceSubgroupProperties{@code ::supportedOperations} includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-subgroup-quad">#SUBGROUP_FEATURE_QUAD_BIT</a>, {@code minSubgroupSize} <b>must</b> be greater than or equal to 4.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("minSubgroupSize", "the minimum subgroup size supported by this device. {@code minSubgroupSize} is at least one if any of the physical device&#8217;s queues support #QUEUE_GRAPHICS_BIT or #QUEUE_COMPUTE_BIT. {@code minSubgroupSize} is a power-of-two. {@code minSubgroupSize} is less than or equal to {@code maxSubgroupSize}. {@code minSubgroupSize} is less than or equal to <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#limits-subgroup-size\">subgroupSize</a>.")
    uint32_t("maxSubgroupSize", "the maximum subgroup size supported by this device. {@code maxSubgroupSize} is at least one if any of the physical device&#8217;s queues support #QUEUE_GRAPHICS_BIT or #QUEUE_COMPUTE_BIT. {@code maxSubgroupSize} is a power-of-two. {@code maxSubgroupSize} is greater than or equal to {@code minSubgroupSize}. {@code maxSubgroupSize} is greater than or equal to <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#limits-subgroup-size\">subgroupSize</a>.")
    uint32_t("maxComputeWorkgroupSubgroups", "the maximum number of subgroups supported by the implementation within a workgroup.")
    VkShaderStageFlags("requiredSubgroupSizeStages", "a bitfield of what shader stages support having a required subgroup size specified.")
}

val VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT = struct(Module.VULKAN, "VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT", mutable = false) {
    documentation =
        """
        Structure specifying the required subgroup size of a newly created pipeline shader stage.

        <h5>Description</h5>
        If a ##VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT structure is included in the {@code pNext} chain of ##VkPipelineShaderStageCreateInfo, it specifies that the pipeline shader stage being compiled has a required subgroup size.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT</li>
        </ul>
        """

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    uint32_t("requiredSubgroupSize", "")
}

val VkFragmentShadingRateAttachmentInfoKHR = struct(Module.VULKAN, "VkFragmentShadingRateAttachmentInfoKHR") {
    documentation =
        """
        Structure specifying a fragment shading rate attachment for a subpass.

        <h5>Description</h5>
        If no shading rate attachment is specified, or if this structure isn't specified, the implementation behaves as if a valid shading rate attachment was specified with all texels specifying a single pixel per fragment.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not #ATTACHMENT_UNUSED, its {@code layout} member <b>must</b> be equal to #IMAGE_LAYOUT_GENERAL or #IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR</li>
            <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not #ATTACHMENT_UNUSED, {@code shadingRateAttachmentTexelSize.width} <b>must</b> be a power of two value</li>
            <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not #ATTACHMENT_UNUSED, {@code shadingRateAttachmentTexelSize.width} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-maxFragmentShadingRateAttachmentTexelSize">{@code maxFragmentShadingRateAttachmentTexelSize.width}</a></li>
            <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not #ATTACHMENT_UNUSED, {@code shadingRateAttachmentTexelSize.width} <b>must</b> be greater than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-minFragmentShadingRateAttachmentTexelSize">{@code minFragmentShadingRateAttachmentTexelSize.width}</a></li>
            <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not #ATTACHMENT_UNUSED, {@code shadingRateAttachmentTexelSize.height} <b>must</b> be a power of two value</li>
            <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not #ATTACHMENT_UNUSED, {@code shadingRateAttachmentTexelSize.height} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-maxFragmentShadingRateAttachmentTexelSize">{@code maxFragmentShadingRateAttachmentTexelSize.height}</a></li>
            <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not #ATTACHMENT_UNUSED, {@code shadingRateAttachmentTexelSize.height} <b>must</b> be greater than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-minFragmentShadingRateAttachmentTexelSize">{@code minFragmentShadingRateAttachmentTexelSize.height}</a></li>
            <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not #ATTACHMENT_UNUSED, the quotient of {@code shadingRateAttachmentTexelSize.width} and {@code shadingRateAttachmentTexelSize.height} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-maxFragmentShadingRateAttachmentTexelSizeAspectRatio">{@code maxFragmentShadingRateAttachmentTexelSizeAspectRatio}</a></li>
            <li>If {@code pFragmentShadingRateAttachment} is not {@code NULL} and its {@code attachment} member is not #ATTACHMENT_UNUSED, the quotient of {@code shadingRateAttachmentTexelSize.height} and {@code shadingRateAttachmentTexelSize.width} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-maxFragmentShadingRateAttachmentTexelSizeAspectRatio">{@code maxFragmentShadingRateAttachmentTexelSizeAspectRatio}</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR</li>
            <li>{@code pFragmentShadingRateAttachment} <b>must</b> be a valid pointer to a valid ##VkAttachmentReference2 structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentReference2, ##VkExtent2D
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkAttachmentReference2.const.p("pFragmentShadingRateAttachment", "an optional ##VkAttachmentReference2KHR structure defining the fragment shading rate attachment for this subpass.")
    VkExtent2D("shadingRateAttachmentTexelSize", "specifies the size of the portion of the framebuffer corresponding to each texel in {@code pFragmentShadingRateAttachment}.")
}

val VkPipelineFragmentShadingRateStateCreateInfoKHR = struct(Module.VULKAN, "VkPipelineFragmentShadingRateStateCreateInfoKHR") {
    documentation =
        """
        Structure specifying parameters controlling the fragment shading rate.

        <h5>Description</h5>
        If the {@code pNext} chain of ##VkGraphicsPipelineCreateInfo includes a ##VkPipelineFragmentShadingRateStateCreateInfoKHR structure, then that structure includes parameters that control the pipeline fragment shading rate.

        If this structure is not present, {@code fragmentSize} is considered to be equal to <code>(1,1)</code>, and both elements of {@code combinerOps} are considered to be equal to #FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR</li>
            <li>Any given element of {@code combinerOps} <b>must</b> be a valid {@code VkFragmentShadingRateCombinerOpKHR} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent2D
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkExtent2D("fragmentSize", "specifies a ##VkExtent2D structure containing the fragment size used to define the pipeline fragment shading rate for draw commands using this pipeline.")
    VkFragmentShadingRateCombinerOpKHR("combinerOps", "specifies a {@code VkFragmentShadingRateCombinerOpKHR} value determining how the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-pipeline\">pipeline</a>, <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-primitive\">primitive</a>, and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-attachment\">attachment shading rates</a> are <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-combining\">combined</a> for fragments generated by drawing commands using the created pipeline.")[2]
}

val VkPhysicalDeviceFragmentShadingRateFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShadingRateFeaturesKHR") {
    documentation =
        """
        Structure indicating support for variable rate fragment shading.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceFragmentShadingRateFeaturesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceFragmentShadingRateFeaturesKHR <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable these features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("pipelineFragmentShadingRate", "indicates that the implementation supports the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-pipeline\">pipeline fragment shading rate</a>.")
    VkBool32("primitiveFragmentShadingRate", "indicates that the implementation supports the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-primitive\">primitive fragment shading rate</a>.")
    VkBool32("attachmentFragmentShadingRate", "indicates that the implementation supports the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-attachment\">attachment fragment shading rate</a>.")
}

val VkPhysicalDeviceFragmentShadingRatePropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShadingRatePropertiesKHR", mutable = false) {
    documentation =
        """
        Structure describing variable fragment shading rate limits that can be supported by an implementation.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Multiplication of the combiner rates using the fragment width/height in linear space is equivalent to an addition of those values in log2 space. Some implementations inadvertently implemented an addition in linear space due to unclear requirements originating outside of this specification. This resulted in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-fragmentShadingRateStrictMultiplyCombiner">{@code fragmentShadingRateStrictMultiplyCombiner}</a> being added. Fortunately, this only affects situations where a rate of 1 in either dimension is combined with another rate of 1. All other combinations result in the exact same result as if multiplication was performed in linear space due to the clamping logic, and the fact that both the sum and product of 2 and 2 are equal. In many cases, this limit will not affect the correct operation of applications.
        </div>

        If the ##VkPhysicalDeviceFragmentShadingRatePropertiesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent2D
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkExtent2D("minFragmentShadingRateAttachmentTexelSize", "indicates minimum supported width and height of the portion of the framebuffer corresponding to each texel in a fragment shading rate attachment. Each value <b>must</b> be less than or equal to the values in {@code maxFragmentShadingRateAttachmentTexelSize}. Each value <b>must</b> be a power-of-two. It <b>must</b> be <code>(0,0)</code> if the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-attachmentFragmentShadingRate\">{@code attachmentFragmentShadingRate}</a> feature is not supported.")
    VkExtent2D("maxFragmentShadingRateAttachmentTexelSize", "indicates maximum supported width and height of the portion of the framebuffer corresponding to each texel in a fragment shading rate attachment. Each value <b>must</b> be greater than or equal to the values in {@code minFragmentShadingRateAttachmentTexelSize}. Each value <b>must</b> be a power-of-two. It <b>must</b> be <code>(0,0)</code> if the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-attachmentFragmentShadingRate\">{@code attachmentFragmentShadingRate}</a> feature is not supported.")
    uint32_t("maxFragmentShadingRateAttachmentTexelSizeAspectRatio", "indicates the maximum ratio between the width and height of the portion of the framebuffer corresponding to each texel in a fragment shading rate attachment. {@code maxFragmentShadingRateAttachmentTexelSizeAspectRatio} <b>must</b> be a power-of-two value, and <b>must</b> be less than or equal to <code>max(maxFragmentShadingRateAttachmentTexelSize.width / minFragmentShadingRateAttachmentTexelSize.height, maxFragmentShadingRateAttachmentTexelSize.height / minFragmentShadingRateAttachmentTexelSize.width)</code>. It <b>must</b> be 0 if the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-attachmentFragmentShadingRate\">{@code attachmentFragmentShadingRate}</a> feature is not supported.")
    VkBool32("primitiveFragmentShadingRateWithMultipleViewports", "specifies whether the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-primitive\">primitive fragment shading rate</a> <b>can</b> be used when multiple viewports are used. If this value is #FALSE, only a single viewport <b>must</b> be used, and applications <b>must</b> not write to the {@code ViewportMaskNV} or {@code ViewportIndex} built-in when setting {@code PrimitiveShadingRateKHR}. It <b>must</b> be #FALSE if the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-shaderOutputViewportIndex\">{@code shaderOutputViewportIndex}</a> feature, the VK_EXT_shader_viewport_index_layer.html[VK_EXT_shader_viewport_index_layer] extension, or the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-geometryShader\">{@code geometryShader}</a> feature is not supported, or if the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-primitiveFragmentShadingRate\">{@code primitiveFragmentShadingRate}</a> feature is not supported.")
    VkBool32("layeredShadingRateAttachments", "specifies whether a shading rate attachment image view <b>can</b> be created with multiple layers. If this value is #FALSE, when creating an image view with a {@code usage} that includes #IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR, {@code layerCount} <b>must</b> be 1. It <b>must</b> be #FALSE if the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-multiview\">{@code multiview}</a> feature, the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-shaderOutputViewportIndex\">{@code shaderOutputViewportIndex}</a> feature, the VK_EXT_shader_viewport_index_layer.html[VK_EXT_shader_viewport_index_layer] extension, or the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-geometryShader\">{@code geometryShader}</a> feature is not supported, or if the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-attachmentFragmentShadingRate\">{@code attachmentFragmentShadingRate}</a> feature is not supported.")
    VkBool32("fragmentShadingRateNonTrivialCombinerOps", "specifies whether {@code VkFragmentShadingRateCombinerOpKHR} enums other than #FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR or #FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR <b>can</b> be used. It <b>must</b> be #FALSE unless either the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-primitiveFragmentShadingRate\">{@code primitiveFragmentShadingRate}</a> or <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-attachmentFragmentShadingRate\">{@code attachmentFragmentShadingRate}</a> feature is supported.")
    VkExtent2D("maxFragmentSize", "indicates the maximum supported width and height of a fragment. Its {@code width} and {@code height} members <b>must</b> both be power-of-two values. This limit is purely informational, and is not validated.")
    uint32_t("maxFragmentSizeAspectRatio", "indicates the maximum ratio between the width and height of a fragment. {@code maxFragmentSizeAspectRatio} <b>must</b> be a power-of-two value, and <b>must</b> be less than or equal to the maximum of the {@code width} and {@code height} members of {@code maxFragmentSize}. This limit is purely informational, and is not validated.")
    uint32_t("maxFragmentShadingRateCoverageSamples", "specifies the maximum number of coverage samples supported in a single fragment. {@code maxFragmentShadingRateCoverageSamples} <b>must</b> be less than or equal to the product of the {@code width} and {@code height} members of {@code maxFragmentSize}, and the sample count reported by {@code maxFragmentShadingRateRasterizationSamples}. {@code maxFragmentShadingRateCoverageSamples} <b>must</b> be less than or equal to <code>maxSampleMaskWords * 32</code> if {@code fragmentShadingRateWithShaderSampleMask} is supported. This limit is purely informational, and is not validated.")
    VkSampleCountFlagBits("maxFragmentShadingRateRasterizationSamples", "specifies the maximum sample rate supported when a fragment covers multiple pixels. This limit is purely informational, and is not validated.")
    VkBool32("fragmentShadingRateWithShaderDepthStencilWrites", "specifies whether the implementation supports writing {@code FragDepth} or {@code FragStencilRefEXT} from a fragment shader for multi-pixel fragments. If this value is #FALSE, writing to those built-ins will clamp the fragment shading rate to <code>(1,1)</code>.")
    VkBool32("fragmentShadingRateWithSampleMask", "specifies whether the the implementation supports setting valid bits of ##VkPipelineMultisampleStateCreateInfo::pSampleMask to 0 for multi-pixel fragments. If this value is #FALSE, zeroing valid bits in the sample mask will clamp the fragment shading rate to <code>(1,1)</code>.")
    VkBool32("fragmentShadingRateWithShaderSampleMask", "specifies whether the implementation supports reading or writing {@code SampleMask} for multi-pixel fragments. If this value is #FALSE, using that built-in will clamp the fragment shading rate to <code>(1,1)</code>.")
    VkBool32("fragmentShadingRateWithConservativeRasterization", "specifies whether <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-conservativeraster\">conservative rasterization</a> is supported for multi-pixel fragments. It <b>must</b> be #FALSE if VK_EXT_conservative_rasterization.html[VK_EXT_conservative_rasterization] is not supported. If this value is #FALSE, using <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-conservativeraster\">conservative rasterization</a> will clamp the fragment shading rate to <code>(1,1)</code>.")
    VkBool32("fragmentShadingRateWithFragmentShaderInterlock", "specifies whether <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#shaders-fragment-shader-interlock\">fragment shader interlock</a> is supported for multi-pixel fragments. It <b>must</b> be #FALSE if VK_EXT_fragment_shader_interlock.html[VK_EXT_fragment_shader_interlock] is not supported. If this value is #FALSE, using <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#shaders-fragment-shader-interlock\">fragment shader interlock</a> will clamp the fragment shading rate to <code>(1,1)</code>.")
    VkBool32("fragmentShadingRateWithCustomSampleLocations", "specifies whether <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primrast-samplelocations\">custom sample locations</a> are supported for multi-pixel fragments. It <b>must</b> be #FALSE if VK_EXT_sample_locations.html[VK_EXT_sample_locations] is not supported. If this value is #FALSE, using <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primrast-samplelocations\">custom sample locations</a> will clamp the fragment shading rate to <code>(1,1)</code>.")
    VkBool32("fragmentShadingRateStrictMultiplyCombiner", "specifies whether VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR accurately performs a multiplication or not. Implementations where this value is #FALSE will instead combine rates with an addition. If {@code fragmentShadingRateNonTrivialCombinerOps} is #FALSE, implementations <b>must</b> report this as #FALSE. If {@code fragmentShadingRateNonTrivialCombinerOps} is #TRUE, implementations <b>should</b> report this as #TRUE.")
}

val VkPhysicalDeviceFragmentShadingRateKHR = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShadingRateKHR", mutable = false) {
    documentation =
        """
        Structure returning information about sample count specific additional multisampling capabilities.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent2D, #GetPhysicalDeviceFragmentShadingRatesKHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkSampleCountFlags("sampleCounts", "a bitmask of sample counts for which the shading rate described by {@code fragmentSize} is supported.")
    VkExtent2D("fragmentSize", "a ##VkExtent2D describing the width and height of a supported shading rate.")
}

val VkPhysicalDeviceShaderCoreProperties2AMD = struct(Module.VULKAN, "VkPhysicalDeviceShaderCoreProperties2AMD", mutable = false) {
    documentation =
        """
        Structure describing shader core properties that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceShaderCoreProperties2AMD structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2_AMD</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkShaderCorePropertiesFlagsAMD("shaderCoreFeatures", "a bitmask of {@code VkShaderCorePropertiesFlagBitsAMD} indicating the set of features supported by the shader core.")
    uint32_t("activeComputeUnitCount", "an unsigned integer value indicating the number of compute units that have been enabled.")
}

val VkPhysicalDeviceCoherentMemoryFeaturesAMD = struct(Module.VULKAN, "VkPhysicalDeviceCoherentMemoryFeaturesAMD") {
    documentation =
        """
        Structure describing whether device coherent memory can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("deviceCoherentMemory", "indicates that the implementation supports VkMemoryPropertyFlagBits.html[device coherent memory].")
}

val VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT") {
    documentation =
        """
        Structure describing features supported by VK_EXT_shader_image_atomic_int64.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("shaderImageInt64Atomics", "indicates whether shaders <b>can</b> support 64-bit unsigned and signed integer atomic operations on images.")
    VkBool32("sparseImageInt64Atomics", "indicates whether 64-bit integer atomics <b>can</b> be used on sparse images.")
}

val VkPhysicalDeviceMemoryBudgetPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMemoryBudgetPropertiesEXT", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation =
        """
        Structure specifying physical device memory budget and usage.

        <h5>Description</h5>
        The values returned in this structure are not invariant. The {@code heapBudget} and {@code heapUsage} values <b>must</b> be zero for array elements greater than or equal to ##VkPhysicalDeviceMemoryProperties{@code ::memoryHeapCount}. The {@code heapBudget} value <b>must</b> be non-zero for array elements less than ##VkPhysicalDeviceMemoryProperties{@code ::memoryHeapCount}. The {@code heapBudget} value <b>must</b> be less than or equal to ##VkMemoryHeap{@code ::size} for each heap.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkDeviceSize("heapBudget", "an array of #MAX_MEMORY_HEAPS {@code VkDeviceSize} values in which memory budgets are returned, with one element for each memory heap. A heap&#8217;s budget is a rough estimate of how much memory the process <b>can</b> allocate from that heap before allocations <b>may</b> fail or cause performance degradation. The budget includes any currently allocated device memory.")["VK_MAX_MEMORY_HEAPS"]
    VkDeviceSize("heapUsage", "an array of #MAX_MEMORY_HEAPS {@code VkDeviceSize} values in which memory usages are returned, with one element for each memory heap. A heap&#8217;s usage is an estimate of how much memory the process is currently using in that heap.")["VK_MAX_MEMORY_HEAPS"]
}

val VkPhysicalDeviceMemoryPriorityFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceMemoryPriorityFeaturesEXT") {
    documentation =
        """
        Structure describing memory priority features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceMemoryPriorityFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceMemoryPriorityFeaturesEXT <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("memoryPriority", "indicates that the implementation supports memory priorities specified at memory allocation time via ##VkMemoryPriorityAllocateInfoEXT.")
}

val VkMemoryPriorityAllocateInfoEXT = struct(Module.VULKAN, "VkMemoryPriorityAllocateInfoEXT") {
    documentation =
        """
        Specify a memory allocation priority.

        <h5>Description</h5>
        Memory allocations with higher priority <b>may</b> be more likely to stay in device-local memory when the system is under memory pressure.

        If this structure is not included, it is as if the {@code priority} value were {@code 0.5}.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code priority} <b>must</b> be between 0 and 1, inclusive</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    float("priority", "a floating-point value between 0 and 1, indicating the priority of the allocation relative to other memory allocations. Larger values are higher priority. The granularity of the priorities is implementation-dependent.")
}

val VkSurfaceProtectedCapabilitiesKHR = struct(Module.VULKAN, "VkSurfaceProtectedCapabilitiesKHR") {
    documentation =
        """
        Structure describing capability of a surface to be protected.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SURFACE_PROTECTED_CAPABILITIES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("supportsProtected", "specifies whether a protected swapchain created from ##VkPhysicalDeviceSurfaceInfo2KHR{@code ::surface} for a particular windowing system <b>can</b> be displayed on screen or not. If {@code supportsProtected} is #TRUE, then creation of swapchains with the #SWAPCHAIN_CREATE_PROTECTED_BIT_KHR flag set <b>must</b> be supported for {@code surface}.")
}

val VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV") {
    documentation =
        """
        Structure describing dedicated allocation image aliasing features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("dedicatedAllocationImageAliasing", "indicates that the implementation supports aliasing of compatible image objects on a dedicated allocation.")
}

val VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR", alias = VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures) {
    documentation = "See ##VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("separateDepthStencilLayouts", "")
}

val VkAttachmentReferenceStencilLayoutKHR = struct(Module.VULKAN, "VkAttachmentReferenceStencilLayoutKHR", alias = VkAttachmentReferenceStencilLayout) {
    documentation = "See ##VkAttachmentReferenceStencilLayout."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkImageLayout("stencilLayout", "")
}

val VkAttachmentDescriptionStencilLayoutKHR = struct(Module.VULKAN, "VkAttachmentDescriptionStencilLayoutKHR", alias = VkAttachmentDescriptionStencilLayout) {
    documentation = "See ##VkAttachmentDescriptionStencilLayout."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkImageLayout("stencilInitialLayout", "")
    VkImageLayout("stencilFinalLayout", "")
}

val _VkPhysicalDeviceBufferDeviceAddressFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceBufferDeviceAddressFeaturesEXT")
val VkPhysicalDeviceBufferAddressFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceBufferAddressFeaturesEXT", alias = _VkPhysicalDeviceBufferDeviceAddressFeaturesEXT) {
    documentation = "See ##VkPhysicalDeviceBufferDeviceAddressFeaturesEXT."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("bufferDeviceAddress", "")
    VkBool32("bufferDeviceAddressCaptureReplay", "")
    VkBool32("bufferDeviceAddressMultiDevice", "")
}

val VkPhysicalDeviceBufferDeviceAddressFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceBufferDeviceAddressFeaturesEXT") {
    documentation =
        """
        Structure describing buffer address features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceBufferDeviceAddressFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceBufferDeviceAddressFeaturesEXT <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The ##VkPhysicalDeviceBufferDeviceAddressFeaturesEXT structure has the same members as the ##VkPhysicalDeviceBufferDeviceAddressFeatures structure, but the functionality indicated by the members is expressed differently. The features indicated by the ##VkPhysicalDeviceBufferDeviceAddressFeatures structure requires additional flags to be passed at memory allocation time, and the capture and replay mechanism is built around opaque capture addresses for buffer and memory objects.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("bufferDeviceAddress", "indicates that the implementation supports accessing buffer memory in shaders as storage buffers via an address queried from #GetBufferDeviceAddressEXT().")
    VkBool32("bufferDeviceAddressCaptureReplay", "indicates that the implementation supports saving and reusing buffer addresses, e.g. for trace capture and replay.")
    VkBool32("bufferDeviceAddressMultiDevice", "indicates that the implementation supports the {@code bufferDeviceAddress} feature for logical devices created with multiple physical devices. If this feature is not supported, buffer addresses <b>must</b> not be queried on a logical device created with more than one physical device.")
}

val VkBufferDeviceAddressInfoEXT = struct(Module.VULKAN, "VkBufferDeviceAddressInfoEXT", alias = VkBufferDeviceAddressInfo) {
    documentation = "See ##VkBufferDeviceAddressInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkBuffer("buffer", "")
}

val VkBufferDeviceAddressCreateInfoEXT = struct(Module.VULKAN, "VkBufferDeviceAddressCreateInfoEXT") {
    documentation =
        """
        Request a specific address for a buffer.

        <h5>Description</h5>
        If {@code deviceAddress} is zero, no specific address is requested.

        If {@code deviceAddress} is not zero, then it <b>must</b> be an address retrieved from an identically created buffer on the same implementation. The buffer <b>must</b> also be bound to an identically created {@code VkDeviceMemory} object.

        If this structure is not present, it is as if {@code deviceAddress} is zero.

        Apps <b>should</b> avoid creating buffers with app-provided addresses and implementation-provided addresses in the same process, to reduce the likelihood of #ERROR_INVALID_DEVICE_ADDRESS_EXT errors.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_CREATE_INFO_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDeviceAddress("deviceAddress", "the device address requested for the buffer.")
}

val VkPhysicalDeviceToolPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceToolPropertiesEXT", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation =
        """
        Structure providing information about an active tool.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #GetPhysicalDeviceToolPropertiesEXT()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    charUTF8("name", "a null-terminated UTF-8 string containing the name of the tool.")["VK_MAX_EXTENSION_NAME_SIZE"]
    charUTF8("version", "a null-terminated UTF-8 string containing the version of the tool.")["VK_MAX_EXTENSION_NAME_SIZE"]
    VkToolPurposeFlagsEXT("purposes", "a bitmask of {@code VkToolPurposeFlagBitsEXT} which is populated with purposes supported by the tool.")
    charUTF8("description", "a null-terminated UTF-8 string containing a description of the tool.")["VK_MAX_DESCRIPTION_SIZE"]
    charUTF8("layer", "a null-terminated UTF-8 string that contains the name of the layer implementing the tool, if the tool is implemented in a layer - otherwise it <b>may</b> be an empty string.")["VK_MAX_EXTENSION_NAME_SIZE"]
}

val VkImageStencilUsageCreateInfoEXT = struct(Module.VULKAN, "VkImageStencilUsageCreateInfoEXT", alias = VkImageStencilUsageCreateInfo) {
    documentation = "See ##VkImageStencilUsageCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkImageUsageFlags("stencilUsage", "")
}

val VkValidationFeaturesEXT = struct(Module.VULKAN, "VkValidationFeaturesEXT") {
    documentation =
        """
        Specify validation features to enable or disable for a Vulkan instance.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@code pEnabledValidationFeatures} array contains #VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_RESERVE_BINDING_SLOT_EXT, then it <b>must</b> also contain #VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT</li>
            <li>If the {@code pEnabledValidationFeatures} array contains #VALIDATION_FEATURE_ENABLE_DEBUG_PRINTF_EXT, then it <b>must</b> not contain #VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_VALIDATION_FEATURES_EXT</li>
            <li>If {@code enabledValidationFeatureCount} is not 0, {@code pEnabledValidationFeatures} <b>must</b> be a valid pointer to an array of {@code enabledValidationFeatureCount} valid {@code VkValidationFeatureEnableEXT} values</li>
            <li>If {@code disabledValidationFeatureCount} is not 0, {@code pDisabledValidationFeatures} <b>must</b> be a valid pointer to an array of {@code disabledValidationFeatureCount} valid {@code VkValidationFeatureDisableEXT} values</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pEnabledValidationFeatures", optional = true)..uint32_t("enabledValidationFeatureCount", "the number of features to enable.")
    VkValidationFeatureEnableEXT.const.p("pEnabledValidationFeatures", "a pointer to an array of {@code VkValidationFeatureEnableEXT} values specifying the validation features to be enabled.")
    AutoSize("pDisabledValidationFeatures", optional = true)..uint32_t("disabledValidationFeatureCount", "the number of features to disable.")
    VkValidationFeatureDisableEXT.const.p("pDisabledValidationFeatures", "a pointer to an array of {@code VkValidationFeatureDisableEXT} values specifying the validation features to be disabled.")
}

val VkCooperativeMatrixPropertiesNV = struct(Module.VULKAN, "VkCooperativeMatrixPropertiesNV") {
    documentation =
        """
        Structure specifying cooperative matrix properties.

        <h5>Description</h5>
        If some types are preferred over other types (e.g. for performance), they <b>should</b> appear earlier in the list enumerated by #GetPhysicalDeviceCooperativeMatrixPropertiesNV().

        At least one entry in the list <b>must</b> have power of two values for all of {@code MSize}, {@code KSize}, and {@code NSize}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code AType} <b>must</b> be a valid {@code VkComponentTypeNV} value</li>
            <li>{@code BType} <b>must</b> be a valid {@code VkComponentTypeNV} value</li>
            <li>{@code CType} <b>must</b> be a valid {@code VkComponentTypeNV} value</li>
            <li>{@code DType} <b>must</b> be a valid {@code VkComponentTypeNV} value</li>
            <li>{@code scope} <b>must</b> be a valid {@code VkScopeNV} value</li>
        </ul>

        <h5>See Also</h5>
        #GetPhysicalDeviceCooperativeMatrixPropertiesNV()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    uint32_t("MSize", "the number of rows in matrices A, C, and D.")
    uint32_t("NSize", "the number of columns in matrices B, C, D.")
    uint32_t("KSize", "the number of columns in matrix A and rows in matrix B.")
    VkComponentTypeNV("AType", "the component type of matrix A, of type {@code VkComponentTypeNV}.")
    VkComponentTypeNV("BType", "the component type of matrix B, of type {@code VkComponentTypeNV}.")
    VkComponentTypeNV("CType", "the component type of matrix C, of type {@code VkComponentTypeNV}.")
    VkComponentTypeNV("DType", "the component type of matrix D, of type {@code VkComponentTypeNV}.")
    VkScopeNV("scope", "the scope of all the matrix types, of type {@code VkScopeNV}.")
}

val VkPhysicalDeviceCooperativeMatrixFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceCooperativeMatrixFeaturesNV") {
    documentation =
        """
        Structure describing cooperative matrix features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceCooperativeMatrixFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceCooperativeMatrixFeaturesNV <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("cooperativeMatrix", "indicates that the implementation supports the {@code CooperativeMatrixNV} SPIR-V capability.")
    VkBool32("cooperativeMatrixRobustBufferAccess", "indicates that the implementation supports robust buffer access for SPIR-V {@code OpCooperativeMatrixLoadNV} and {@code OpCooperativeMatrixStoreNV} instructions.")
}

val VkPhysicalDeviceCooperativeMatrixPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceCooperativeMatrixPropertiesNV", mutable = false) {
    documentation =
        """
        Structure describing cooperative matrix properties supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceCooperativeMatrixPropertiesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkShaderStageFlags("cooperativeMatrixSupportedStages", "a bitfield of {@code VkShaderStageFlagBits} describing the shader stages that cooperative matrix instructions are supported in. {@code cooperativeMatrixSupportedStages} will have the #SHADER_STAGE_COMPUTE_BIT bit set if any of the physical device&#8217;s queues support #QUEUE_COMPUTE_BIT.")
}

val VkPhysicalDeviceCoverageReductionModeFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceCoverageReductionModeFeaturesNV") {
    documentation =
        """
        Structure describing the coverage reduction mode features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceCoverageReductionModeFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceCoverageReductionModeFeaturesNV <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("coverageReductionMode", "indicates whether the implementation supports coverage reduction modes. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#fragops-coverage-reduction\">Coverage Reduction</a>.")
}

val VkPipelineCoverageReductionStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineCoverageReductionStateCreateInfoNV") {
    documentation =
        """
        Structure specifying parameters controlling coverage reduction.

        <h5>Description</h5>
        If this structure is not present, or if the extension is not enabled, the default coverage reduction mode is inferred as follows:

        <ul>
            <li>If the {@code VK_NV_framebuffer_mixed_samples.html[VK_NV_framebuffer_mixed_samples]} extension is enabled, then it is as if the {@code coverageReductionMode} is #COVERAGE_REDUCTION_MODE_MERGE_NV.</li>
            <li>If the {@code VK_AMD_mixed_attachment_samples.html[VK_AMD_mixed_attachment_samples]} extension is enabled, then it is as if the {@code coverageReductionMode} is #COVERAGE_REDUCTION_MODE_TRUNCATE_NV.</li>
            <li>If both {@code VK_NV_framebuffer_mixed_samples.html[VK_NV_framebuffer_mixed_samples]} and {@code VK_AMD_mixed_attachment_samples.html[VK_AMD_mixed_attachment_samples]} are enabled, then the default coverage reduction mode is implementation-dependent.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code coverageReductionMode} <b>must</b> be a valid {@code VkCoverageReductionModeNV} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineCoverageReductionStateCreateFlagsNV("flags", "reserved for future use.")
    VkCoverageReductionModeNV("coverageReductionMode", "a {@code VkCoverageReductionModeNV} value controlling how color sample coverage is generated from pixel coverage.")
}

val VkFramebufferMixedSamplesCombinationNV = struct(Module.VULKAN, "VkFramebufferMixedSamplesCombinationNV", mutable = false) {
    documentation =
        """
        Structure specifying a supported sample count combination.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkCoverageReductionModeNV("coverageReductionMode", "a {@code VkCoverageReductionModeNV} value specifying the coverage reduction mode.")
    VkSampleCountFlagBits("rasterizationSamples", "specifies the number of rasterization samples in the supported combination.")
    VkSampleCountFlags("depthStencilSamples", "specifies the number of samples in the depth stencil attachment in the supported combination. A value of 0 indicates the combination does not have a depth stencil attachment.")
    VkSampleCountFlags("colorSamples", "specifies the number of color samples in a color attachment in the supported combination. A value of 0 indicates the combination does not have a color attachment.")
}

val VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT") {
    documentation =
        """
        Structure describing fragment shader interlock features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("fragmentShaderSampleInterlock", "indicates that the implementation supports the {@code FragmentShaderSampleInterlockEXT} SPIR-V capability.")
    VkBool32("fragmentShaderPixelInterlock", "indicates that the implementation supports the {@code FragmentShaderPixelInterlockEXT} SPIR-V capability.")
    VkBool32("fragmentShaderShadingRateInterlock", "indicates that the implementation supports the {@code FragmentShaderShadingRateInterlockEXT} SPIR-V capability.")
}

val VkPhysicalDeviceYcbcrImageArraysFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceYcbcrImageArraysFeaturesEXT") {
    documentation =
        """
        Structure describing extended Y'CbCr image creation features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceYcbcrImageArraysFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceYcbcrImageArraysFeaturesEXT <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("ycbcrImageArrays", "indicates that the implementation supports creating images with a format that requires <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#formats-requiring-sampler-ycbcr-conversion\">Y′C<sub>B</sub>C<sub>R</sub> conversion</a> and has multiple array layers.")
}

val VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR", alias = VkPhysicalDeviceUniformBufferStandardLayoutFeatures) {
    documentation = "See ##VkPhysicalDeviceUniformBufferStandardLayoutFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("uniformBufferStandardLayout", "")
}

val VkSurfaceFullScreenExclusiveInfoEXT = struct(Module.VULKAN, "VkSurfaceFullScreenExclusiveInfoEXT") {
    documentation =
        """
        Structure specifying the preferred full-screen transition behavior.

        <h5>Description</h5>
        If this structure is not present, {@code fullScreenExclusive} is considered to be #FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT</li>
            <li>{@code fullScreenExclusive} <b>must</b> be a valid {@code VkFullScreenExclusiveEXT} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkFullScreenExclusiveEXT("fullScreenExclusive", "a {@code VkFullScreenExclusiveEXT} value specifying the preferred full-screen transition behavior.")
}

val VkSurfaceCapabilitiesFullScreenExclusiveEXT = struct(Module.VULKAN, "VkSurfaceCapabilitiesFullScreenExclusiveEXT") {
    documentation =
        """
        Structure describing full screen exclusive capabilities of a surface.

        <h5>Description</h5>
        This structure <b>can</b> be included in the {@code pNext} chain of ##VkSurfaceCapabilities2KHR to determine support for exclusive full-screen access. If {@code fullScreenExclusiveSupported} is #FALSE, it indicates that exclusive full-screen access is not obtainable for this surface.

        Applications <b>must</b> not attempt to create swapchains with #FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT set if {@code fullScreenExclusiveSupported} is #FALSE.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("fullScreenExclusiveSupported", "")
}

val VkSurfaceFullScreenExclusiveWin32InfoEXT = struct(Module.VULKAN, "VkSurfaceFullScreenExclusiveWin32InfoEXT") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        Structure specifying additional creation parameters specific to Win32 fullscreen exclusive mode.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        If {@code hmonitor} is invalidated (e.g. the monitor is unplugged) during the lifetime of a swapchain created with this structure, operations on that swapchain will return #ERROR_OUT_OF_DATE_KHR.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        It is the responsibility of the application to change the display settings of the targeted Win32 display using the appropriate platform APIs. Such changes <b>may</b> alter the surface capabilities reported for the created surface.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code hmonitor} <b>must</b> be a valid {@code HMONITOR}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    HMONITOR("hmonitor", "the Win32 {@code HMONITOR} handle identifying the display to create the surface with.")
}

val VkHeadlessSurfaceCreateInfoEXT = struct(Module.VULKAN, "VkHeadlessSurfaceCreateInfoEXT") {
    documentation =
        """
        Structure specifying parameters of a newly created headless surface object.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_HEADLESS_SURFACE_CREATE_INFO_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>

        <h5>See Also</h5>
        #CreateHeadlessSurfaceEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkHeadlessSurfaceCreateFlagsEXT("flags", "reserved for future use.")
}

val VkPhysicalDeviceBufferDeviceAddressFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceBufferDeviceAddressFeaturesKHR", alias = VkPhysicalDeviceBufferDeviceAddressFeatures) {
    documentation = "See ##VkPhysicalDeviceBufferDeviceAddressFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("bufferDeviceAddress", "")
    VkBool32("bufferDeviceAddressCaptureReplay", "")
    VkBool32("bufferDeviceAddressMultiDevice", "")
}

val VkBufferDeviceAddressInfoKHR = struct(Module.VULKAN, "VkBufferDeviceAddressInfoKHR", alias = VkBufferDeviceAddressInfo) {
    documentation = "See ##VkBufferDeviceAddressInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkBuffer("buffer", "")
}

val VkBufferOpaqueCaptureAddressCreateInfoKHR = struct(Module.VULKAN, "VkBufferOpaqueCaptureAddressCreateInfoKHR", alias = VkBufferOpaqueCaptureAddressCreateInfo) {
    documentation = "See ##VkBufferOpaqueCaptureAddressCreateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    uint64_t("opaqueCaptureAddress", "")
}

val VkMemoryOpaqueCaptureAddressAllocateInfoKHR = struct(Module.VULKAN, "VkMemoryOpaqueCaptureAddressAllocateInfoKHR", alias = VkMemoryOpaqueCaptureAddressAllocateInfo) {
    documentation = "See ##VkMemoryOpaqueCaptureAddressAllocateInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    uint64_t("opaqueCaptureAddress", "")
}

val VkDeviceMemoryOpaqueCaptureAddressInfoKHR = struct(Module.VULKAN, "VkDeviceMemoryOpaqueCaptureAddressInfoKHR", alias = VkDeviceMemoryOpaqueCaptureAddressInfo) {
    documentation = "See ##VkDeviceMemoryOpaqueCaptureAddressInfo."

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    VkDeviceMemory("memory", "")
}

val VkPhysicalDeviceLineRasterizationFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceLineRasterizationFeaturesEXT") {
    documentation =
        """
        Structure describing the line rasterization features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceLineRasterizationFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceLineRasterizationFeaturesEXT <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("rectangularLines", "indicates whether the implementation supports <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-lines\">rectangular line rasterization</a>.")
    VkBool32("bresenhamLines", "indicates whether the implementation supports <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-lines-bresenham\">Bresenham-style line rasterization</a>.")
    VkBool32("smoothLines", "indicates whether the implementation supports <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-lines-smooth\">smooth line rasterization</a>.")
    VkBool32("stippledRectangularLines", "indicates whether the implementation supports <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-lines-stipple\">stippled line rasterization</a> with #LINE_RASTERIZATION_MODE_RECTANGULAR_EXT lines, or with #LINE_RASTERIZATION_MODE_DEFAULT_EXT lines if ##VkPhysicalDeviceLimits{@code ::strictLines} is #TRUE.")
    VkBool32("stippledBresenhamLines", "indicates whether the implementation supports <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-lines-stipple\">stippled line rasterization</a> with #LINE_RASTERIZATION_MODE_BRESENHAM_EXT lines.")
    VkBool32("stippledSmoothLines", "indicates whether the implementation supports <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-lines-stipple\">stippled line rasterization</a> with #LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT lines.")
}

val VkPhysicalDeviceLineRasterizationPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceLineRasterizationPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing line rasterization properties supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceLineRasterizationPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("lineSubPixelPrecisionBits", "the number of bits of subpixel precision in framebuffer coordinates <code>x<sub>f</sub></code> and <code>y<sub>f</sub></code> when rasterizing <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-lines\">line segments</a>.")
}

val VkPipelineRasterizationLineStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineRasterizationLineStateCreateInfoEXT") {
    documentation =
        """
        Structure specifying parameters of a newly created pipeline line rasterization state.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code lineRasterizationMode} is #LINE_RASTERIZATION_MODE_RECTANGULAR_EXT, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-rectangularLines">rectangularLines</a> feature <b>must</b> be enabled</li>
            <li>If {@code lineRasterizationMode} is #LINE_RASTERIZATION_MODE_BRESENHAM_EXT, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-bresenhamLines">bresenhamLines</a> feature <b>must</b> be enabled</li>
            <li>If {@code lineRasterizationMode} is #LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-bresenhamLines">smoothLines</a> feature <b>must</b> be enabled</li>
            <li>If {@code stippledLineEnable} is #TRUE and {@code lineRasterizationMode} is #LINE_RASTERIZATION_MODE_RECTANGULAR_EXT, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-stippledRectangularLines">stippledRectangularLines</a> feature <b>must</b> be enabled</li>
            <li>If {@code stippledLineEnable} is #TRUE and {@code lineRasterizationMode} is #LINE_RASTERIZATION_MODE_BRESENHAM_EXT, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-stippledBresenhamLines">stippledBresenhamLines</a> feature <b>must</b> be enabled</li>
            <li>If {@code stippledLineEnable} is #TRUE and {@code lineRasterizationMode} is #LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-stippledSmoothLines">stippledSmoothLines</a> feature <b>must</b> be enabled</li>
            <li>If {@code stippledLineEnable} is #TRUE and {@code lineRasterizationMode} is #LINE_RASTERIZATION_MODE_DEFAULT_EXT, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-stippledRectangularLines">stippledRectangularLines</a> feature <b>must</b> be enabled and ##VkPhysicalDeviceLimits{@code ::strictLines} <b>must</b> be #TRUE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_EXT</li>
            <li>{@code lineRasterizationMode} <b>must</b> be a valid {@code VkLineRasterizationModeEXT} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkLineRasterizationModeEXT("lineRasterizationMode", "a {@code VkLineRasterizationModeEXT} value selecting the style of line rasterization.")
    VkBool32("stippledLineEnable", "enables <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-lines-stipple\">stippled line rasterization</a>.")
    uint32_t("lineStippleFactor", "the repeat factor used in stippled line rasterization.")
    uint16_t("lineStipplePattern", "the bit pattern used in stippled line rasterization.")
}

val VkPhysicalDeviceShaderAtomicFloatFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderAtomicFloatFeaturesEXT") {
    documentation =
        """
        Structure describing features supported by VK_EXT_shader_atomic_float.

        <h5>Description</h5>
        <ul>
            <li>{@code shaderBufferFloat32Atomics} indicates whether shaders <b>can</b> perform 32-bit floating-point load, store and exchange atomic operations on storage buffers.</li>
            <li>{@code shaderBufferFloat32AtomicAdd} indicates whether shaders <b>can</b> perform 32-bit floating-point add atomic operations on storage buffers.</li>
            <li>{@code shaderBufferFloat64Atomics} indicates whether shaders <b>can</b> perform 64-bit floating-point load, store and exchange atomic operations on storage buffers.</li>
            <li>{@code shaderBufferFloat64AtomicAdd} indicates whether shaders <b>can</b> perform 64-bit floating-point add atomic operations on storage buffers.</li>
            <li>{@code shaderSharedFloat32Atomics} indicates whether shaders <b>can</b> perform 32-bit floating-point load, store and exchange atomic operations on shared memory.</li>
            <li>{@code shaderSharedFloat32AtomicAdd} indicates whether shaders <b>can</b> perform 32-bit floating-point add atomic operations on shared memory.</li>
            <li>{@code shaderSharedFloat64Atomics} indicates whether shaders <b>can</b> perform 64-bit floating-point load, store and exchange atomic operations on shared memory.</li>
            <li>{@code shaderSharedFloat64AtomicAdd} indicates whether shaders <b>can</b> perform 64-bit floating-point add atomic operations on shared memory.</li>
            <li>{@code shaderImageFloat32Atomics} indicates whether shaders <b>can</b> perform 32-bit floating-point load, store and exchange atomic image operations.</li>
            <li>{@code shaderImageFloat32AtomicAdd} indicates whether shaders <b>can</b> perform 32-bit floating-point add atomic image operations.</li>
            <li>{@code sparseImageFloat32Atomics} indicates whether 32-bit floating-point load, store and exchange atomic operations <b>can</b> be used on sparse images.</li>
            <li>{@code sparseImageFloat32AtomicAdd} indicates whether 32-bit floating-point add atomic operations <b>can</b> be used on sparse images.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBool32("shaderBufferFloat32Atomics", "")
    VkBool32("shaderBufferFloat32AtomicAdd", "")
    VkBool32("shaderBufferFloat64Atomics", "")
    VkBool32("shaderBufferFloat64AtomicAdd", "")
    VkBool32("shaderSharedFloat32Atomics", "")
    VkBool32("shaderSharedFloat32AtomicAdd", "")
    VkBool32("shaderSharedFloat64Atomics", "")
    VkBool32("shaderSharedFloat64AtomicAdd", "")
    VkBool32("shaderImageFloat32Atomics", "")
    VkBool32("shaderImageFloat32AtomicAdd", "")
    VkBool32("sparseImageFloat32Atomics", "")
    VkBool32("sparseImageFloat32AtomicAdd", "")
}

val VkPhysicalDeviceHostQueryResetFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceHostQueryResetFeaturesEXT", alias = VkPhysicalDeviceHostQueryResetFeatures) {
    documentation = "See ##VkPhysicalDeviceHostQueryResetFeatures."

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("hostQueryReset", "")
}

val VkPhysicalDeviceIndexTypeUint8FeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceIndexTypeUint8FeaturesEXT") {
    documentation =
        """
        Structure describing whether uint8 index type can be used.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceIndexTypeUint8FeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceIndexTypeUint8FeaturesEXT <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("indexTypeUint8", "indicates that #INDEX_TYPE_UINT8_EXT can be used with #CmdBindIndexBuffer().")
}

val VkPhysicalDeviceExtendedDynamicStateFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceExtendedDynamicStateFeaturesEXT") {
    documentation =
        """
        Structure describing what extended dynamic state can be used.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceExtendedDynamicStateFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceExtendedDynamicStateFeaturesEXT <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("extendedDynamicState", """indicates that the implementation supports the following dynamic states:

        <ul>
            <li>#DYNAMIC_STATE_CULL_MODE_EXT</li>
            <li>#DYNAMIC_STATE_FRONT_FACE_EXT</li>
            <li>#DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT</li>
            <li>#DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT</li>
            <li>#DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT</li>
            <li>#DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT</li>
            <li>#DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT</li>
            <li>#DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT</li>
            <li>#DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT</li>
            <li>#DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT</li>
            <li>#DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT</li>
            <li>#DYNAMIC_STATE_STENCIL_OP_EXT</li>
        </ul>""")
}

val VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR") {
    documentation =
        """
        Structure describing whether pipeline executable properties are available.

        <h5>Description</h5>
        If the ##VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("pipelineExecutableInfo", "indicates that the implementation supports reporting properties and statistics about the executables associated with a compiled pipeline.")
}

val VkPipelineInfoKHR = struct(Module.VULKAN, "VkPipelineInfoKHR") {
    documentation =
        """
        Structure describing a pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
        </ul>

        <h5>See Also</h5>
        #GetPipelineExecutablePropertiesKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipeline("pipeline", "a {@code VkPipeline} handle.")
}

val VkPipelineExecutablePropertiesKHR = struct(Module.VULKAN, "VkPipelineExecutablePropertiesKHR", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation =
        """
        Structure describing a pipeline executable.

        <h5>Description</h5>
        The {@code stages} field <b>may</b> be zero or it <b>may</b> contain one or more bits describing the stages principally used to compile this pipeline. Not all implementations have a 1:1 mapping between shader stages and pipeline executables and some implementations <b>may</b> reduce a given shader stage to fixed function hardware programming such that no executable is available. No guarantees are provided about the mapping between shader stages and pipeline executables and {@code stages} <b>should</b> be considered a best effort hint. Because the application <b>cannot</b> rely on the {@code stages} field to provide an exact description, {@code name} and {@code description} provide a human readable name and description which more accurately describes the given pipeline executable.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #GetPipelineExecutablePropertiesKHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkShaderStageFlags("stages", "a bitmask of {@code VkShaderStageFlagBits} indicating which shader stages (if any) were principally used as inputs to compile this pipeline executable.")
    charUTF8("name", "an array of #MAX_DESCRIPTION_SIZE {@code char} containing a null-terminated UTF-8 string which is a short human readable name for this executable.")["VK_MAX_DESCRIPTION_SIZE"]
    charUTF8("description", "an array of #MAX_DESCRIPTION_SIZE {@code char} containing a null-terminated UTF-8 string which is a human readable description for this executable.")["VK_MAX_DESCRIPTION_SIZE"]
    uint32_t("subgroupSize", "the subgroup size with which this executable is dispatched.")
}

val VkPipelineExecutableInfoKHR = struct(Module.VULKAN, "VkPipelineExecutableInfoKHR") {
    documentation =
        """
        Structure describing a pipeline executable to query for associated statistics or internal representations.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code executableIndex} <b>must</b> be less than the number of executables associated with {@code pipeline} as returned in the {@code pExecutableCount} parameter of {@code vkGetPipelineExecutablePropertiesKHR}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
        </ul>

        <h5>See Also</h5>
        #GetPipelineExecutableInternalRepresentationsKHR(), #GetPipelineExecutableStatisticsKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipeline("pipeline", "the pipeline to query.")
    uint32_t("executableIndex", "the index of the executable to query in the array of executable properties returned by #GetPipelineExecutablePropertiesKHR().")
}

val VkPipelineExecutableStatisticValueKHR = union(Module.VULKAN, "VkPipelineExecutableStatisticValueKHR", mutable = false) {
    documentation =
        """
        A union describing a pipeline executable statistic.
        """

    VkBool32("b32", "the 32-bit boolean value if the {@code VkPipelineExecutableStatisticFormatKHR} is #PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR.")
    int64_t("i64", "the signed 64-bit integer value if the {@code VkPipelineExecutableStatisticFormatKHR} is #PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR.")
    uint64_t("u64", "the unsigned 64-bit integer value if the {@code VkPipelineExecutableStatisticFormatKHR} is #PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR.")
    double("f64", "the 64-bit floating-point value if the {@code VkPipelineExecutableStatisticFormatKHR} is #PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR.")
}

val VkPipelineExecutableStatisticKHR = struct(Module.VULKAN, "VkPipelineExecutableStatisticKHR", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation =
        """
        Structure describing a compile-time pipeline executable statistic.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineExecutableStatisticValueKHR, #GetPipelineExecutableStatisticsKHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    charUTF8("name", "an array of #MAX_DESCRIPTION_SIZE {@code char} containing a null-terminated UTF-8 string which is a short human readable name for this statistic.")["VK_MAX_DESCRIPTION_SIZE"]
    charUTF8("description", "an array of #MAX_DESCRIPTION_SIZE {@code char} containing a null-terminated UTF-8 string which is a human readable description for this statistic.")["VK_MAX_DESCRIPTION_SIZE"]
    VkPipelineExecutableStatisticFormatKHR("format", "a {@code VkPipelineExecutableStatisticFormatKHR} value specifying the format of the data found in {@code value}.")
    VkPipelineExecutableStatisticValueKHR("value", "the value of this statistic.")
}

val VkPipelineExecutableInternalRepresentationKHR = struct(Module.VULKAN, "VkPipelineExecutableInternalRepresentationKHR", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation =
        """
        Structure describing the textual form of a pipeline executable internal representation.

        <h5>Description</h5>
        If {@code pData} is {@code NULL}, then the size, in bytes, of the internal representation data is returned in {@code dataSize}. Otherwise, {@code dataSize} must be the size of the buffer, in bytes, pointed to by {@code pData} and on return {@code dataSize} is overwritten with the number of bytes of data actually written to {@code pData} including any trailing null character. If {@code dataSize} is less than the size, in bytes, of the internal representation data, at most {@code dataSize} bytes of data will be written to {@code pData} and {@code vkGetPipelineExecutableInternalRepresentationsKHR} will return #INCOMPLETE. If {@code isText} is #TRUE and {@code pData} is not {@code NULL} and {@code dataSize} is not zero, the last byte written to {@code pData} will be a null character.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #GetPipelineExecutableInternalRepresentationsKHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    charUTF8("name", "an array of #MAX_DESCRIPTION_SIZE {@code char} containing a null-terminated UTF-8 string which is a short human readable name for this internal representation.")["VK_MAX_DESCRIPTION_SIZE"]
    charUTF8("description", "an array of #MAX_DESCRIPTION_SIZE {@code char} containing a null-terminated UTF-8 string which is a human readable description for this internal representation.")["VK_MAX_DESCRIPTION_SIZE"]
    VkBool32("isText", "specifies whether the returned data is text or opaque data. If {@code isText} is #TRUE then the data returned in {@code pData} is text and is guaranteed to be a null-terminated UTF-8 string.")
    AutoSize("pData", optional = true)..size_t("dataSize", "an integer related to the size, in bytes, of the internal representation data, as described below.")
    nullable..void.p("pData", "either {@code NULL} or a pointer to an block of data into which the implementation will write the textual form of the internal representation.")
}

val VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT") {
    documentation =
        """
        Structure describing the shader demote to helper invocations features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("shaderDemoteToHelperInvocation", "indicates whether the implementation supports the SPIR-V {@code DemoteToHelperInvocationEXT} capability.")
}

val VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV", mutable = false) {
    documentation =
        """
        Structure describing push descriptor limits that can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    uint32_t("maxGraphicsShaderGroupCount", "the maximum number of shader groups in ##VkGraphicsPipelineShaderGroupsCreateInfoNV.")
    uint32_t("maxIndirectSequenceCount", "the maximum number of sequences in ##VkGeneratedCommandsInfoNV and in ##VkGeneratedCommandsMemoryRequirementsInfoNV.")
    uint32_t("maxIndirectCommandsTokenCount", "")
    uint32_t("maxIndirectCommandsStreamCount", "the maximum number of streams in ##VkIndirectCommandsLayoutCreateInfoNV.")
    uint32_t("maxIndirectCommandsTokenOffset", "the maximum offset in ##VkIndirectCommandsLayoutTokenNV.")
    uint32_t("maxIndirectCommandsStreamStride", "the maximum stream stride in ##VkIndirectCommandsLayoutCreateInfoNV.")
    uint32_t("minSequencesCountBufferOffsetAlignment", "")
    uint32_t("minSequencesIndexBufferOffsetAlignment", "")
    uint32_t("minIndirectCommandsBufferOffsetAlignment", "the minimum alignment for memory addresses used in ##VkIndirectCommandsStreamNV and as preprocess buffer in ##VkGeneratedCommandsInfoNV.")
}

val VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV") {
    documentation =
        """
        Structure describing the device-generated commands features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("deviceGeneratedCommands", "indicates whether the implementation supports functionality to generate commands on the device. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#device-generated-commands\">Device-Generated Commands</a>.")
}

val VkGraphicsShaderGroupCreateInfoNV = struct(Module.VULKAN, "VkGraphicsShaderGroupCreateInfoNV") {
    documentation =
        """
        Structure specifying override parameters for each shader group.

        <h5>Valid Usage</h5>
        <ul>
            <li>For {@code stageCount}, the same restrictions as in ##VkGraphicsPipelineCreateInfo{@code ::stageCount} apply</li>
            <li>For {@code pStages}, the same restrictions as in ##VkGraphicsPipelineCreateInfo{@code ::pStages} apply</li>
            <li>For {@code pVertexInputState}, the same restrictions as in ##VkGraphicsPipelineCreateInfo{@code ::pVertexInputState} apply</li>
            <li>For {@code pTessellationState}, the same restrictions as in ##VkGraphicsPipelineCreateInfo{@code ::pTessellationState} apply</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code pStages} <b>must</b> be a valid pointer to an array of {@code stageCount} valid ##VkPipelineShaderStageCreateInfo structures</li>
            <li>{@code stageCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkGraphicsPipelineShaderGroupsCreateInfoNV, ##VkPipelineShaderStageCreateInfo, ##VkPipelineTessellationStateCreateInfo, ##VkPipelineVertexInputStateCreateInfo
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pStages")..uint32_t("stageCount", "the number of entries in the {@code pStages} array.")
    VkPipelineShaderStageCreateInfo.const.p("pStages", "an array of size {@code stageCount} structures of type ##VkPipelineShaderStageCreateInfo describing the set of the shader stages to be included in this shader group.")
    nullable..VkPipelineVertexInputStateCreateInfo.const.p("pVertexInputState", "a pointer to an instance of the ##VkPipelineVertexInputStateCreateInfo structure.")
    nullable..VkPipelineTessellationStateCreateInfo.const.p("pTessellationState", "a pointer to an instance of the ##VkPipelineTessellationStateCreateInfo structure, and is ignored if the shader group does not include a tessellation control shader stage and tessellation evaluation shader stage.")
}

val VkGraphicsPipelineShaderGroupsCreateInfoNV = struct(Module.VULKAN, "VkGraphicsPipelineShaderGroupsCreateInfoNV") {
    documentation =
        """
        Structure specifying parameters of a newly created multi shader group pipeline.

        <h5>Description</h5>
        When referencing shader groups by index, groups defined in the referenced pipelines are treated as if they were defined as additional entries in {@code pGroups}. They are appended in the order they appear in the {@code pPipelines} array and in the {@code pGroups} array when those pipelines were defined.

        The application <b>must</b> maintain the lifetime of all such referenced pipelines based on the pipelines that make use of them.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code groupCount} <b>must</b> be at least 1 and as maximum ##VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV{@code ::maxGraphicsShaderGroupCount}</li>
            <li>The sum of {@code groupCount} including those groups added from referenced {@code pPipelines} <b>must</b> also be as maximum ##VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV{@code ::maxGraphicsShaderGroupCount}</li>
            <li>The state of the first element of {@code pGroups} <b>must</b> match its equivalent within the parent&#8217;s ##VkGraphicsPipelineCreateInfo</li>
            <li>Each element of {@code pGroups} <b>must</b> in combination with the rest of the pipeline state yield a valid state configuration</li>
            <li>All elements of {@code pGroups} <b>must</b> use the same shader stage combinations unless any mesh shader stage is used, then either combination of task and mesh or just mesh shader is valid</li>
            <li>Mesh and regular primitive shading stages cannot be mixed across {@code pGroups}</li>
            <li>Each element of {@code pPipelines} <b>must</b> have been created with identical state to the pipeline currently created except the state that can be overridden by ##VkGraphicsShaderGroupCreateInfoNV</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-deviceGeneratedCommands">##VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV</li>
            <li>{@code pGroups} <b>must</b> be a valid pointer to an array of {@code groupCount} valid ##VkGraphicsShaderGroupCreateInfoNV structures</li>
            <li>If {@code pipelineCount} is not 0, {@code pPipelines} <b>must</b> be a valid pointer to an array of {@code pipelineCount} valid {@code VkPipeline} handles</li>
            <li>{@code groupCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkGraphicsShaderGroupCreateInfoNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pGroups")..uint32_t("groupCount", "the number of elements in the {@code pGroups} array.")
    VkGraphicsShaderGroupCreateInfoNV.const.p("pGroups", "an array of ##VkGraphicsShaderGroupCreateInfoNV values specifying which state of the original ##VkGraphicsPipelineCreateInfo each shader group overrides.")
    AutoSize("pPipelines", optional = true)..uint32_t("pipelineCount", "the number of elements in the {@code pPipelines} array.")
    VkPipeline.const.p("pPipelines", "an array of graphics {@code VkPipeline}, which are referenced within the created pipeline, including all their shader groups.")
}

val VkBindShaderGroupIndirectCommandNV = struct(Module.VULKAN, "VkBindShaderGroupIndirectCommandNV") {
    documentation =
        """
        Structure specifying input data for a single shader group command token.

        <h5>Valid Usage</h5>
        <ul>
            <li>The current bound graphics pipeline, as well as the pipelines it may reference, <b>must</b> have been created with #PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV</li>
            <li>The {@code index} <b>must</b> be within range of the accessible shader groups of the current bound graphics pipeline. See #CmdBindPipelineShaderGroupNV() for further details</li>
        </ul>
        """

    uint32_t("groupIndex", "")
}

val VkBindIndexBufferIndirectCommandNV = struct(Module.VULKAN, "VkBindIndexBufferIndirectCommandNV") {
    documentation =
        """
        Structure specifying input data for a single index buffer command token.

        <h5>Valid Usage</h5>
        <ul>
            <li>The buffer&#8217;s usage flag from which the address was acquired <b>must</b> have the #BUFFER_USAGE_INDEX_BUFFER_BIT bit set</li>
            <li>The {@code bufferAddress} <b>must</b> be aligned to the {@code indexType} used</li>
            <li>Each element of the buffer from which the address was acquired and that is non-sparse <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code indexType} <b>must</b> be a valid {@code VkIndexType} value</li>
        </ul>
        """

    VkDeviceAddress("bufferAddress", "specifies a physical address of the {@code VkBuffer} used as index buffer.")
    uint32_t("size", "the byte size range which is available for this operation from the provided address.")
    VkIndexType("indexType", "a {@code VkIndexType} value specifying how indices are treated. Instead of the Vulkan enum values, a custom {@code uint32_t} value <b>can</b> be mapped to an {@code VkIndexType} by specifying the ##VkIndirectCommandsLayoutTokenNV{@code ::pIndexTypes} and ##VkIndirectCommandsLayoutTokenNV{@code ::pIndexTypeValues} arrays.")
}

val VkBindVertexBufferIndirectCommandNV = struct(Module.VULKAN, "VkBindVertexBufferIndirectCommandNV") {
    documentation =
        """
        Structure specifying input data for a single vertex buffer command token.

        <h5>Valid Usage</h5>
        <ul>
            <li>The buffer&#8217;s usage flag from which the address was acquired <b>must</b> have the #BUFFER_USAGE_VERTEX_BUFFER_BIT bit set</li>
            <li>Each element of the buffer from which the address was acquired and that is non-sparse <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
        </ul>
        """

    VkDeviceAddress("bufferAddress", "specifies a physical address of the {@code VkBuffer} used as vertex input binding.")
    uint32_t("size", "the byte size range which is available for this operation from the provided address.")
    uint32_t("stride", "the byte size stride for this vertex input binding as in ##VkVertexInputBindingDescription{@code ::stride}. It is only used if ##VkIndirectCommandsLayoutTokenNV{@code ::vertexDynamicStride} was set, otherwise the stride is inherited from the current bound graphics pipeline.")
}

val VkSetStateFlagsIndirectCommandNV = struct(Module.VULKAN, "VkSetStateFlagsIndirectCommandNV") {
    documentation =
        """
        Structure specifying input data for a single state flag command token.
        """

    uint32_t("data", """encodes packed state that this command alters.

        <ul>
            <li>Bit 0: If set represents #FRONT_FACE_CLOCKWISE, otherwise #FRONT_FACE_COUNTER_CLOCKWISE</li>
        </ul>""")
}

val VkIndirectCommandsStreamNV = struct(Module.VULKAN, "VkIndirectCommandsStreamNV") {
    documentation =
        """
        Structure specifying input streams for generated command tokens.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code buffer}&#8217;s usage flag <b>must</b> have the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set</li>
            <li>The {@code offset} <b>must</b> be aligned to ##VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV{@code ::minIndirectCommandsBufferOffsetAlignment}</li>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
        </ul>

        <h5>See Also</h5>
        ##VkGeneratedCommandsInfoNV
        """

    VkBuffer("buffer", "specifies the {@code VkBuffer} storing the functional arguments for each sequence. These arguments <b>can</b> be written by the device.")
    VkDeviceSize("offset", "specified an offset into {@code buffer} where the arguments start.")
}

val VkIndirectCommandsLayoutTokenNV = struct(Module.VULKAN, "VkIndirectCommandsLayoutTokenNV") {
    documentation =
        """
        Struct specifying the details of an indirect command layout token.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code stream} <b>must</b> be smaller than ##VkIndirectCommandsLayoutCreateInfoNV{@code ::streamCount}</li>
            <li>{@code offset} <b>must</b> be less than or equal to ##VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV{@code ::maxIndirectCommandsTokenOffset}</li>
            <li>If {@code tokenType} is #INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NV, {@code vertexBindingUnit} <b>must</b> stay within device supported limits for the appropriate commands</li>
            <li>If {@code tokenType} is #INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV, {@code pushconstantPipelineLayout} <b>must</b> be valid</li>
            <li>If {@code tokenType} is #INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV, {@code pushconstantOffset} <b>must</b> be a multiple of 4</li>
            <li>If {@code tokenType} is #INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV, {@code pushconstantSize} <b>must</b> be a multiple of 4</li>
            <li>If {@code tokenType} is #INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV, {@code pushconstantOffset} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxPushConstantsSize}</li>
            <li>If {@code tokenType} is #INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV, {@code pushconstantSize} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxPushConstantsSize} minus {@code pushconstantOffset}</li>
            <li>If {@code tokenType} is #INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV, for each byte in the range specified by {@code pushconstantOffset} and {@code pushconstantSize} and for each shader stage in {@code pushconstantShaderStageFlags}, there <b>must</b> be a push constant range in {@code pushconstantPipelineLayout} that includes that byte and that stage</li>
            <li>If {@code tokenType} is #INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV, for each byte in the range specified by {@code pushconstantOffset} and {@code pushconstantSize} and for each push constant range that overlaps that byte, {@code pushconstantShaderStageFlags} <b>must</b> include all stages in that push constant range&#8217;s ##VkPushConstantRange{@code ::pushconstantShaderStageFlags}</li>
            <li>If {@code tokenType} is #INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV, {@code indirectStateFlags} <b>must</b> not be ´0´</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code tokenType} <b>must</b> be a valid {@code VkIndirectCommandsTokenTypeNV} value</li>
            <li>If {@code pushconstantPipelineLayout} is not #NULL_HANDLE, {@code pushconstantPipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code pushconstantShaderStageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
            <li>{@code indirectStateFlags} <b>must</b> be a valid combination of {@code VkIndirectStateFlagBitsNV} values</li>
            <li>If {@code indexTypeCount} is not 0, {@code pIndexTypes} <b>must</b> be a valid pointer to an array of {@code indexTypeCount} valid {@code VkIndexType} values</li>
            <li>If {@code indexTypeCount} is not 0, {@code pIndexTypeValues} <b>must</b> be a valid pointer to an array of {@code indexTypeCount} {@code uint32_t} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkIndirectCommandsLayoutCreateInfoNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkIndirectCommandsTokenTypeNV("tokenType", "specifies the token command type.")
    uint32_t("stream", "the index of the input stream that contains the token argument data.")
    uint32_t("offset", "a relative starting offset within the input stream memory for the token argument data.")
    uint32_t("vertexBindingUnit", "used for the vertex buffer binding command.")
    VkBool32("vertexDynamicStride", "sets if the vertex buffer stride is provided by the binding command rather than the current bound graphics pipeline state.")
    VkPipelineLayout("pushconstantPipelineLayout", "the {@code VkPipelineLayout} used for the push constant command.")
    VkShaderStageFlags("pushconstantShaderStageFlags", "are the shader stage flags used for the push constant command.")
    uint32_t("pushconstantOffset", "the offset used for the push constant command.")
    uint32_t("pushconstantSize", "the size used for the push constant command.")
    VkIndirectStateFlagsNV("indirectStateFlags", "are the active states for the state flag command.")
    AutoSize("pIndexTypes", "pIndexTypeValues", optional = true)..uint32_t("indexTypeCount", "the optional size of the {@code pIndexTypes} and {@code pIndexTypeValues} array pairings. If not zero, it allows to register a custom {@code uint32_t} value to be treated as specific {@code VkIndexType}.")
    VkIndexType.const.p("pIndexTypes", "the used {@code VkIndexType} for the corresponding {@code uint32_t} value entry in {@code pIndexTypeValues}.")
    uint32_t.const.p("pIndexTypeValues", "")
}

val VkIndirectCommandsLayoutCreateInfoNV = struct(Module.VULKAN, "VkIndirectCommandsLayoutCreateInfoNV") {
    documentation =
        """
        Structure specifying the parameters of a newly created indirect commands layout object.

        <h5>Description</h5>
        The following code illustrates some of the flags:

        <pre><code>
￿void cmdProcessAllSequences(cmd, pipeline, indirectCommandsLayout, pIndirectCommandsTokens, sequencesCount, indexbuffer, indexbufferOffset)
￿{
￿  for (s = 0; s &lt; sequencesCount; s++)
￿  {
￿    sUsed = s;
￿
￿    if (indirectCommandsLayout.flags &amp; VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NV) {
￿      sUsed = indexbuffer.load_uint32( sUsed * sizeof(uint32_t) + indexbufferOffset);
￿    }
￿
￿    if (indirectCommandsLayout.flags &amp; VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NV) {
￿      sUsed = incoherent_implementation_dependent_permutation[ sUsed ];
￿    }
￿
￿    cmdProcessSequence( cmd, pipeline, indirectCommandsLayout, pIndirectCommandsTokens, sUsed );
￿  }
￿}</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code pipelineBindPoint} <b>must</b> be #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>{@code tokenCount} <b>must</b> be greater than 0 and less than or equal to ##VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV{@code ::maxIndirectCommandsTokenCount}</li>
            <li>If {@code pTokens} contains an entry of #INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV it <b>must</b> be the first element of the array and there <b>must</b> be only a single element of such token type</li>
            <li>If {@code pTokens} contains an entry of #INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV there <b>must</b> be only a single element of such token type</li>
            <li>All state tokens in {@code pTokens} <b>must</b> occur prior work provoking tokens (#INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NV, #INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NV, #INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV)</li>
            <li>The content of {@code pTokens} <b>must</b> include one single work provoking token that is compatible with the {@code pipelineBindPoint}</li>
            <li>{@code streamCount} <b>must</b> be greater than 0 and less or equal to ##VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV{@code ::maxIndirectCommandsStreamCount}</li>
            <li>each element of {@code pStreamStrides} <b>must</b> be greater than 0and less than or equal to ##VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV{@code ::maxIndirectCommandsStreamStride}. Furthermore the alignment of each token input <b>must</b> be ensured</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkIndirectCommandsLayoutUsageFlagBitsNV} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>{@code pTokens} <b>must</b> be a valid pointer to an array of {@code tokenCount} valid ##VkIndirectCommandsLayoutTokenNV structures</li>
            <li>{@code pStreamStrides} <b>must</b> be a valid pointer to an array of {@code streamCount} {@code uint32_t} values</li>
            <li>{@code tokenCount} <b>must</b> be greater than 0</li>
            <li>{@code streamCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkIndirectCommandsLayoutTokenNV, #CreateIndirectCommandsLayoutNV()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkIndirectCommandsLayoutUsageFlagsNV("flags", "a bitmask of {@code VkIndirectCommandsLayoutUsageFlagBitsNV} specifying usage hints of this layout.")
    VkPipelineBindPoint("pipelineBindPoint", "the {@code VkPipelineBindPoint} that this layout targets.")
    AutoSize("pTokens")..uint32_t("tokenCount", "the length of the individual command sequence.")
    VkIndirectCommandsLayoutTokenNV.const.p("pTokens", "an array describing each command token in detail. See {@code VkIndirectCommandsTokenTypeNV} and ##VkIndirectCommandsLayoutTokenNV below for details.")
    AutoSize("pStreamStrides")..uint32_t("streamCount", "the number of streams used to provide the token inputs.")
    uint32_t.const.p("pStreamStrides", "an array defining the byte stride for each input stream.")
}

val VkGeneratedCommandsInfoNV = struct(Module.VULKAN, "VkGeneratedCommandsInfoNV") {
    documentation =
        """
        Structure specifying parameters for the generation of commands.

        <h5>Valid Usage</h5>
        <ul>
            <li>The provided {@code pipeline} <b>must</b> match the pipeline bound at execution time</li>
            <li>If the {@code indirectCommandsLayout} uses a token of #INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV, then the {@code pipeline} <b>must</b> have been created with multiple shader groups</li>
            <li>If the {@code indirectCommandsLayout} uses a token of #INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV, then the {@code pipeline} <b>must</b> have been created with #PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV set in ##VkGraphicsPipelineCreateInfo{@code ::flags}</li>
            <li>If the {@code indirectCommandsLayout} uses a token of #INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV, then the {@code pipeline}`s {@code VkPipelineLayout} <b>must</b> match the ##VkIndirectCommandsLayoutTokenNV{@code ::pushconstantPipelineLayout}</li>
            <li>{@code streamCount} <b>must</b> match the {@code indirectCommandsLayout}&#8217;s {@code streamCount}</li>
            <li>{@code sequencesCount} <b>must</b> be less or equal to ##VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV{@code ::maxIndirectSequenceCount} and ##VkGeneratedCommandsMemoryRequirementsInfoNV{@code ::maxSequencesCount} that was used to determine the {@code preprocessSize}</li>
            <li>{@code preprocessBuffer} <b>must</b> have the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set in its usage flag</li>
            <li>{@code preprocessOffset} <b>must</b> be aligned to ##VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV{@code ::minIndirectCommandsBufferOffsetAlignment}</li>
            <li>If {@code preprocessBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code preprocessSize} <b>must</b> be at least equal to the memory requirement`s size returned by #GetGeneratedCommandsMemoryRequirementsNV() using the matching inputs ({@code indirectCommandsLayout}, &#8230;) as within this structure</li>
            <li>{@code sequencesCountBuffer} <b>can</b> be set if the actual used count of sequences is sourced from the provided buffer. In that case the {@code sequencesCount} serves as upper bound</li>
            <li>If {@code sequencesCountBuffer} is not #NULL_HANDLE, its usage flag <b>must</b> have the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set</li>
            <li>If {@code sequencesCountBuffer} is not #NULL_HANDLE, {@code sequencesCountOffset} <b>must</b> be aligned to ##VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV{@code ::minSequencesCountBufferOffsetAlignment}</li>
            <li>If {@code sequencesCountBuffer} is not #NULL_HANDLE and is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>If {@code indirectCommandsLayout}&#8217;s #INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NV is set, {@code sequencesIndexBuffer} <b>must</b> be set otherwise it <b>must</b> be #NULL_HANDLE</li>
            <li>If {@code sequencesIndexBuffer} is not #NULL_HANDLE, its usage flag <b>must</b> have the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set</li>
            <li>If {@code sequencesIndexBuffer} is not #NULL_HANDLE, {@code sequencesIndexOffset} <b>must</b> be aligned to ##VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV{@code ::minSequencesIndexBufferOffsetAlignment}</li>
            <li>If {@code sequencesIndexBuffer} is not #NULL_HANDLE and is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
            <li>{@code indirectCommandsLayout} <b>must</b> be a valid {@code VkIndirectCommandsLayoutNV} handle</li>
            <li>{@code pStreams} <b>must</b> be a valid pointer to an array of {@code streamCount} valid ##VkIndirectCommandsStreamNV structures</li>
            <li>{@code preprocessBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>If {@code sequencesCountBuffer} is not #NULL_HANDLE, {@code sequencesCountBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>If {@code sequencesIndexBuffer} is not #NULL_HANDLE, {@code sequencesIndexBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code streamCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code indirectCommandsLayout}, {@code pipeline}, {@code preprocessBuffer}, {@code sequencesCountBuffer}, and {@code sequencesIndexBuffer} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkIndirectCommandsStreamNV, #CmdExecuteGeneratedCommandsNV(), #CmdPreprocessGeneratedCommandsNV()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineBindPoint("pipelineBindPoint", "the {@code VkPipelineBindPoint} used for the {@code pipeline}.")
    VkPipeline("pipeline", "the {@code VkPipeline} used in the generation and execution process.")
    VkIndirectCommandsLayoutNV("indirectCommandsLayout", "the {@code VkIndirectCommandsLayoutNV} that provides the command sequence to generate.")
    AutoSize("pStreams")..uint32_t("streamCount", "defines the number of input streams")
    VkIndirectCommandsStreamNV.const.p("pStreams", "provides an array of ##VkIndirectCommandsStreamNV that provide the input data for the tokens used in {@code indirectCommandsLayout}.")
    uint32_t("sequencesCount", "the maximum number of sequences to reserve. If {@code sequencesCountBuffer} is #NULL_HANDLE, this is also the actual number of sequences generated.")
    VkBuffer("preprocessBuffer", "the {@code VkBuffer} that is used for preprocessing the input data for execution. If this structure is used with #CmdExecuteGeneratedCommandsNV() with its {@code isPreprocessed} set to {@code VK_TRUE}, then the preprocessing step is skipped and data is only read from this buffer.")
    VkDeviceSize("preprocessOffset", "the byte offset into {@code preprocessBuffer} where the preprocessed data is stored.")
    VkDeviceSize("preprocessSize", "the maximum byte size within the {@code preprocessBuffer} after the {@code preprocessOffset} that is available for preprocessing.")
    VkBuffer("sequencesCountBuffer", "a {@code VkBuffer} in which the actual number of sequences is provided as single {@code uint32_t} value.")
    VkDeviceSize("sequencesCountOffset", "the byte offset into {@code sequencesCountBuffer} where the count value is stored.")
    VkBuffer("sequencesIndexBuffer", "a {@code VkBuffer} that encodes the used sequence indices as {@code uint32_t} array.")
    VkDeviceSize("sequencesIndexOffset", "the byte offset into {@code sequencesIndexBuffer} where the index values start.")
}

val VkGeneratedCommandsMemoryRequirementsInfoNV = struct(Module.VULKAN, "VkGeneratedCommandsMemoryRequirementsInfoNV") {
    documentation =
        """
        Structure specifying parameters for the reservation of preprocess buffer space.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code maxSequencesCount} <b>must</b> be less or equal to ##VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV{@code ::maxIndirectSequenceCount}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
            <li>{@code indirectCommandsLayout} <b>must</b> be a valid {@code VkIndirectCommandsLayoutNV} handle</li>
            <li>Both of {@code indirectCommandsLayout}, and {@code pipeline} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        #GetGeneratedCommandsMemoryRequirementsNV()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineBindPoint("pipelineBindPoint", "the {@code VkPipelineBindPoint} of the {@code pipeline} that this buffer memory is intended to be used with during the execution.")
    VkPipeline("pipeline", "the {@code VkPipeline} that this buffer memory is intended to be used with during the execution.")
    VkIndirectCommandsLayoutNV("indirectCommandsLayout", "the {@code VkIndirectCommandsLayoutNV} that this buffer memory is intended to be used with.")
    uint32_t("maxSequencesCount", "the maximum number of sequences that this buffer memory in combination with the other state provided <b>can</b> be used with.")
}

val VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT") {
    documentation =
        """
        Structure describing the texel buffer alignment features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("texelBufferAlignment", "indicates whether the implementation uses more specific alignment requirements advertised in ##VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT rather than ##VkPhysicalDeviceLimits{@code ::minTexelBufferOffsetAlignment}.")
}

val VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing the texel buffer alignment requirements supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        If the single texel alignment property is #FALSE, then the buffer view's offset <b>must</b> be aligned to the corresponding byte alignment value. If the single texel alignment property is #TRUE, then the buffer view's offset <b>must</b> be aligned to the lesser of the corresponding byte alignment value or the size of a single texel, based on ##VkBufferViewCreateInfo{@code ::format}. If the size of a single texel is a multiple of three bytes, then the size of a single component of the format is used instead.

        These limits <b>must</b> not advertise a larger alignment than the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-required">required</a> maximum minimum value of ##VkPhysicalDeviceLimits{@code ::minTexelBufferOffsetAlignment}, for any format that supports use as a texel buffer.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkDeviceSize("storageTexelBufferOffsetAlignmentBytes", "a byte alignment that is sufficient for a storage texel buffer of any format.")
    VkBool32("storageTexelBufferOffsetSingleTexelAlignment", "indicates whether single texel alignment is sufficient for a storage texel buffer of any format.")
    VkDeviceSize("uniformTexelBufferOffsetAlignmentBytes", "a byte alignment that is sufficient for a uniform texel buffer of any format.")
    VkBool32("uniformTexelBufferOffsetSingleTexelAlignment", "indicates whether single texel alignment is sufficient for a uniform texel buffer of any format.")
}

val VkRenderPassTransformBeginInfoQCOM = struct(Module.VULKAN, "VkRenderPassTransformBeginInfoQCOM") {
    documentation =
        """
        Structure describing transform parameters of a render pass instance.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code transform} <b>must</b> be #SURFACE_TRANSFORM_IDENTITY_BIT_KHR, #SURFACE_TRANSFORM_ROTATE_90_BIT_KHR, #SURFACE_TRANSFORM_ROTATE_180_BIT_KHR, or #SURFACE_TRANSFORM_ROTATE_270_BIT_KHR</li>
            <li>The {@code renderpass} <b>must</b> have been created with ##VkRenderPassCreateInfo{@code ::flags} containing #RENDER_PASS_CREATE_TRANSFORM_BIT_QCOM</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RENDER_PASS_TRANSFORM_BEGIN_INFO_QCOM</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSurfaceTransformFlagBitsKHR("transform", "a {@code VkSurfaceTransformFlagBitsKHR} value describing the transform to be applied to rasterization.")
}

val VkCommandBufferInheritanceRenderPassTransformInfoQCOM = struct(Module.VULKAN, "VkCommandBufferInheritanceRenderPassTransformInfoQCOM") {
    documentation =
        """
        Structure describing transformed render pass parameters command buffer.

        <h5>Description</h5>
        When the secondary is recorded to execute within a render pass instance using #CmdExecuteCommands(), the render pass transform parameters of the secondary command buffer <b>must</b> be consistent with the render pass transform parameters specified for the render pass instance. In particular, the {@code transform} and {@code renderArea} for command buffer <b>must</b> be identical to the {@code transform} and {@code renderArea} of the render pass instance.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code transform} <b>must</b> be #SURFACE_TRANSFORM_IDENTITY_BIT_KHR, #SURFACE_TRANSFORM_ROTATE_90_BIT_KHR, #SURFACE_TRANSFORM_ROTATE_180_BIT_KHR, or #SURFACE_TRANSFORM_ROTATE_270_BIT_KHR</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM</li>
        </ul>

        <h5>See Also</h5>
        ##VkRect2D
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSurfaceTransformFlagBitsKHR("transform", "a {@code VkSurfaceTransformFlagBitsKHR} value describing the transform to be applied to the render pass.")
    VkRect2D("renderArea", "the render area that is affected by the command buffer.")
}

val VkPhysicalDeviceDeviceMemoryReportFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDeviceMemoryReportFeaturesEXT") {
    documentation =
        """
        Structure describing whether device memory report callback can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceDeviceMemoryReportFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with a value indicating whether the feature is supported. ##VkPhysicalDeviceDeviceMemoryReportFeaturesEXT <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("deviceMemoryReport", "indicates whether the implementation supports the ability to register device memory report callbacks.")
}

val VkDeviceMemoryReportCallbackDataEXT = struct(Module.VULKAN, "VkDeviceMemoryReportCallbackDataEXT", mutable = false) {
    documentation =
        """
        Structure specifying parameters returned to the callback.

        <h5>Description</h5>
        {@code memoryObjectId} is used to avoid double-counting on the same memory object.

        If an internally-allocated device memory object or a {@code VkDeviceMemory} <b>cannot</b> be exported, {@code memoryObjectId} <b>must</b> be unique in the {@code VkDevice}.

        If an internally-allocated device memory object or a {@code VkDeviceMemory} supports being exported, {@code memoryObjectId} <b>must</b> be unique system wide.

        If an internal device memory object or a {@code VkDeviceMemory} is backed by an imported external memory object, {@code memoryObjectId} <b>must</b> be unique system wide.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This structure should only be considered valid during the lifetime of the triggered callback.

        For #DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT and #DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT events, {@code objectHandle} usually will not yet exist when the application or tool receives the callback. {@code objectHandle} will only exist when the create or allocate call that triggered the event returns, and if the allocation or import ends up failing {@code objectHandle} won't ever exist.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkDeviceMemoryReportFlagsEXT("flags", "0 and reserved for future use.")
    VkDeviceMemoryReportEventTypeEXT("type", "a {@code VkDeviceMemoryReportEventTypeEXT} type specifying the type of event reported in this ##VkDeviceMemoryReportCallbackDataEXT structure.")
    uint64_t("memoryObjectId", "the unique id for the underlying memory object as described below.")
    VkDeviceSize("size", "the size of the memory object in bytes. If {@code type} is #DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT, #DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT or #DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT, {@code size} is a valid {@code VkDeviceSize} value. Otherwise, {@code size} is undefined.")
    VkObjectType("objectType", "a {@code VkObjectType} value specifying the type of the object associated with this device memory report event. If {@code type} is #DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT, #DEVICE_MEMORY_REPORT_EVENT_TYPE_FREE_EXT, #DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT, #DEVICE_MEMORY_REPORT_EVENT_TYPE_UNIMPORT_EXT or #DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT, {@code objectType} is a valid {@code VkObjectType} enum. Otherwise, {@code objectType} is undefined.")
    uint64_t("objectHandle", "the object this device memory report event is attributed to. If {@code type} is #DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT, #DEVICE_MEMORY_REPORT_EVENT_TYPE_FREE_EXT, #DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT or #DEVICE_MEMORY_REPORT_EVENT_TYPE_UNIMPORT_EXT, {@code objectHandle} is a valid Vulkan handle of the type associated with {@code objectType} as defined in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#debugging-object-types\">VkObjectType and Vulkan Handle Relationship</a> table. Otherwise, {@code objectHandle} is undefined.")
    uint32_t("heapIndex", "describes which memory heap this device memory allocation is made from. If {@code type} is #DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT or #DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT, {@code heapIndex} corresponds to one of the valid heaps from the ##VkPhysicalDeviceMemoryProperties structure. Otherwise, {@code heapIndex} is undefined.")
}

val VkDeviceDeviceMemoryReportCreateInfoEXT = struct(Module.VULKAN, "VkDeviceDeviceMemoryReportCreateInfoEXT") {
    documentation =
        """
        Register device memory report callbacks for a Vulkan device.

        <h5>Description</h5>
        The callback <b>may</b> be called from multiple threads simultaneously.

        The callback <b>must</b> be called only once by the implementation when a {@code VkDeviceMemoryReportEventTypeEXT} event occurs.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The callback could be called from a background thread other than the thread calling the Vulkan commands.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code pfnUserCallback} <b>must</b> be a valid ##VkDeviceMemoryReportCallbackEXT value</li>
            <li>{@code pUserData} <b>must</b> be a pointer value</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceMemoryReportCallbackEXT
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDeviceMemoryReportFlagsEXT("flags", "0 and reserved for future use.")
    PFN_vkDeviceMemoryReportCallbackEXT("pfnUserCallback", "the application callback function to call.")
    opaque_p("pUserData", "user data to be passed to the callback.")
}

val VkPhysicalDeviceRobustness2FeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceRobustness2FeaturesEXT") {
    documentation =
        """
        Structure describing the out-of-bounds behavior for an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceRobustness2FeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code robustBufferAccess2} is enabled then <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> <b>must</b> also be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("robustBufferAccess2", "indicates whether buffer accesses are tightly bounds-checked against the range of the descriptor. Uniform buffers <b>must</b> be bounds-checked to the range of the descriptor, where the range is rounded up to a multiple of <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#limits-robustUniformBufferAccessSizeAlignment\">robustUniformBufferAccessSizeAlignment</a>. Storage buffers <b>must</b> be bounds-checked to the range of the descriptor, where the range is rounded up to a multiple of <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#limits-robustStorageBufferAccessSizeAlignment\">robustStorageBufferAccessSizeAlignment</a>. Out of bounds buffer loads will return zero values, and formatted loads will have <code>(0,0,1)</code> values inserted for missing G, B, or A components based on the format.")
    VkBool32("robustImageAccess2", "indicates whether image accesses are tightly bounds-checked against the dimensions of the image view. Out of bounds image loads will return zero values, with <code>(0,0,1)</code> values <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#textures-conversion-to-rgba\">inserted for missing G, B, or A components</a> based on the format.")
    VkBool32("nullDescriptor", "indicates whether descriptors <b>can</b> be written with a #NULL_HANDLE resource or view, which are considered valid to access and act as if the descriptor were bound to nothing.")
}

val VkPhysicalDeviceRobustness2PropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceRobustness2PropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing robust buffer access properties supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceRobustness2PropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkDeviceSize("robustStorageBufferAccessSizeAlignment", "the number of bytes that the range of a storage buffer descriptor is rounded up to when used for bounds-checking when <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-robustBufferAccess2\">{@code robustBufferAccess2}</a> is enabled. This value is either 1 or 4.")
    VkDeviceSize("robustUniformBufferAccessSizeAlignment", "the number of bytes that the range of a uniform buffer descriptor is rounded up to when used for bounds-checking when <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-robustBufferAccess2\">{@code robustBufferAccess2}</a> is enabled. This value is a power of two in the range [1, 256].")
}

val VkSamplerCustomBorderColorCreateInfoEXT = struct(Module.VULKAN, "VkSamplerCustomBorderColorCreateInfoEXT") {
    documentation =
        """
        Structure specifying custom border color.

        <h5>Valid Usage</h5>
        <ul>
            <li>If provided {@code format} is not #FORMAT_UNDEFINED then the ##VkSamplerCreateInfo{@code ::borderColor} type <b>must</b> match the sampled type of the provided {@code format}, as shown in the <em>SPIR-V Sampled Type</em> column of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-numericformat">Interpretation of Numeric Format</a> table</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-customBorderColorWithoutFormat">customBorderColorWithoutFormat</a> feature is not enabled then {@code format} <b>must</b> not be #FORMAT_UNDEFINED</li>
            <li>If the sampler is used to sample an image view of #FORMAT_B4G4R4A4_UNORM_PACK16, #FORMAT_B5G6R5_UNORM_PACK16, or #FORMAT_B5G5R5A1_UNORM_PACK16 format then {@code format} <b>must</b> not be #FORMAT_UNDEFINED</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkClearColorValue
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkClearColorValue("customBorderColor", "a ##VkClearColorValue representing the desired custom sampler border color.")
    VkFormat("format", "a {@code VkFormat} representing the format of the sampled image view(s). This field may be #FORMAT_UNDEFINED if the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#features-customBorderColorWithoutFormat\">customBorderColorWithoutFormat</a> feature is enabled.")
}

val VkPhysicalDeviceCustomBorderColorPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceCustomBorderColorPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing whether custom border colors can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    uint32_t("maxCustomBorderColorSamplers", "indicates the maximum number of samplers with custom border colors which <b>can</b> simultaneously exist on a device.")
}

val VkPhysicalDeviceCustomBorderColorFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceCustomBorderColorFeaturesEXT") {
    documentation =
        """
        Structure describing whether custom border colors can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("customBorderColors", """indicates that the implementation supports providing a {@code borderColor} value with one of the following values at sampler creation time:

        <ul>
            <li>#BORDER_COLOR_FLOAT_CUSTOM_EXT</li>
            <li>#BORDER_COLOR_INT_CUSTOM_EXT</li>
        </ul>""")
    VkBool32("customBorderColorWithoutFormat", "indicates that explicit formats are not required for custom border colors and the value of the {@code format} member of the ##VkSamplerCustomBorderColorCreateInfoEXT structure <b>may</b> be #FORMAT_UNDEFINED. If this feature bit is not set, applications <b>must</b> provide the {@code VkFormat} of the image view(s) being sampled by this sampler in the {@code format} member of the ##VkSamplerCustomBorderColorCreateInfoEXT structure.")
}

val VkPhysicalDevicePrivateDataFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDevicePrivateDataFeaturesEXT") {
    documentation =
        """
        Structure specifying physical device support.

        <h5>Description</h5>
        If the ##VkPhysicalDevicePrivateDataFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDevicePrivateDataFeaturesEXT <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("privateData", "indicates whether the implementation supports private data. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#private-data\">Private Data</a>.")
}

val VkDevicePrivateDataCreateInfoEXT = struct(Module.VULKAN, "VkDevicePrivateDataCreateInfoEXT") {
    documentation =
        """
        Reserve private data slots.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    uint32_t("privateDataSlotRequestCount", "the amount of slots to reserve.")
}

val VkPrivateDataSlotCreateInfoEXT = struct(Module.VULKAN, "VkPrivateDataSlotCreateInfoEXT") {
    documentation =
        """
        Structure specifying the parameters of private data slot construction.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>

        <h5>See Also</h5>
        #CreatePrivateDataSlotEXT()
        """

    VkStructureType("sType", "the type of this structure")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPrivateDataSlotCreateFlagsEXT("flags", "a bitmask of {@code VkPrivateDataSlotCreateFlagsEXT} specifying additional parameters of the new private data slot")
}

val VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT") {
    documentation =
        """
        Structure describing whether pipeline cache control can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("pipelineCreationCacheControl", """indicates that the implementation supports:

        <ul>
            <li>
                The following <b>can</b> be used in stext:Vk*PipelineCreateInfo{@code ::flags}:
                <ul>
                    <li>#PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_EXT</li>
                    <li>#PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT_EXT</li>
                </ul>
            </li>
            <li>
                The following <b>can</b> be used in ##VkPipelineCacheCreateInfo{@code ::flags}:
                <ul>
                    <li>#PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT_EXT</li>
                </ul>
            </li>
        </ul>""")
}

val VkPhysicalDeviceDiagnosticsConfigFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceDiagnosticsConfigFeaturesNV") {
    documentation =
        """
        Structure describing the device-generated diagnostic configuration features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceDiagnosticsConfigFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceDiagnosticsConfigFeaturesNV <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("diagnosticsConfig", "indicates whether the implementation supports the ability to configure diagnostic tools.")
}

val VkDeviceDiagnosticsConfigCreateInfoNV = struct(Module.VULKAN, "VkDeviceDiagnosticsConfigCreateInfoNV") {
    documentation =
        """
        Specify diagnostics config for a Vulkan device.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_DIAGNOSTICS_CONFIG_CREATE_INFO_NV</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkDeviceDiagnosticsConfigFlagBitsNV} values</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDeviceDiagnosticsConfigFlagsNV("flags", "a bitmask of {@code VkDeviceDiagnosticsConfigFlagBitsNV} specifying addtional parameters for configuring diagnostic tools.")
}

val VkMemoryBarrier2KHR = struct(Module.VULKAN, "VkMemoryBarrier2KHR") {
    documentation =
        """
        Structure specifying a global memory barrier.

        <h5>Description</h5>
        This structure defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-memory">memory dependency</a> affecting all device memory.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> described by this structure include only operations and memory accesses specified by {@code srcStageMask} and {@code srcAccessMask}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> described by this structure include only operations and memory accesses specified by {@code dstStageMask} and {@code dstAccessMask}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_MEMORY_BARRIER_2_KHR</li>
            <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
            <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits2KHR} values</li>
            <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
            <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits2KHR} values</li>
        </ul>

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR or #PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-conditionalRendering">conditional rendering</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-fragmentDensityMap">fragment density map</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-transformFeedback">transform feedback</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-shadingRateImage">shading rate image</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INDEX_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR, #PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_UNIFORM_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_STORAGE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFER_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COPY_BIT_KHR, #PIPELINE_STAGE_2_BLIT_BIT_KHR, #PIPELINE_STAGE_2_RESOLVE_BIT_KHR, #PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFER_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COPY_BIT_KHR, #PIPELINE_STAGE_2_BLIT_BIT_KHR, #PIPELINE_STAGE_2_RESOLVE_BIT_KHR, #PIPELINE_STAGE_2_CLEAR_BIT_KHR, #PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_HOST_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_HOST_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_HOST_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_HOST_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR, #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, #PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
        </ul>

        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR or #PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-conditionalRendering">conditional rendering</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-fragmentDensityMap">fragment density map</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-transformFeedback">transform feedback</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-shadingRateImage">shading rate image</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INDEX_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR, #PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_UNIFORM_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_STORAGE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFER_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COPY_BIT_KHR, #PIPELINE_STAGE_2_BLIT_BIT_KHR, #PIPELINE_STAGE_2_RESOLVE_BIT_KHR, #PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFER_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COPY_BIT_KHR, #PIPELINE_STAGE_2_BLIT_BIT_KHR, #PIPELINE_STAGE_2_RESOLVE_BIT_KHR, #PIPELINE_STAGE_2_CLEAR_BIT_KHR, #PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_HOST_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_HOST_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_HOST_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_HOST_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR, #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, #PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
        </ul>

        <h5>See Also</h5>
        ##VkDependencyInfoKHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineStageFlags2KHR("srcStageMask", "a {@code VkPipelineStageFlags2KHR} mask of pipeline stages to be included in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-dependencies-scopes\">first synchronization scope</a>.")
    VkAccessFlags2KHR("srcAccessMask", "a {@code VkAccessFlags2KHR} mask of pipeline <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-dependencies-access-scopes\">first access scope</a>.")
    VkPipelineStageFlags2KHR("dstStageMask", """a {@code VkPipelineStageFlags2KHR} mask of pipeline stages to be included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">second synchronization scope</a>.

        a {@code VkAccessFlags2KHR} mask of pipeline <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">second access scope</a>.""")
    VkAccessFlags2KHR("dstAccessMask", "")
}

val VkBufferMemoryBarrier2KHR = struct(Module.VULKAN, "VkBufferMemoryBarrier2KHR") {
    documentation =
        """
        Structure specifying a buffer memory barrier.

        <h5>Description</h5>
        This structure defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-memory">memory dependency</a> limited to a range of a buffer, and optionally defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family transfer operation</a> for that range.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> described by this structure include only operations and memory accesses specified by elements {@code srcStageMask} and {@code srcAccessMask}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> described by this structure include only operations and memory accesses specified by elements {@code dstStageMask} and {@code dstAccessMask}.

        Both <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scopes</a> are limited to only memory accesses to {@code buffer} in the range defined by {@code offset} and {@code size}.

        If {@code buffer} was created with #SHARING_MODE_CONCURRENT, and {@code srcQueueFamilyIndex} is not equal to {@code dstQueueFamilyIndex}, this memory barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family transfer operation</a>. When executed on a queue in the family identified by {@code srcQueueFamilyIndex}, this barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers-release">queue family release operation</a> for the specified buffer range, and the second synchronization and access scopes do not synchronize operations on that queue. When executed on a queue in the family identified by {@code dstQueueFamilyIndex}, this barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers-acquire">queue family acquire operation</a> for the specified buffer range, and the first synchronization and access scopes do not synchronize operations on that queue.

        A <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family transfer operation</a> is also defined if the values are not equal, and either is one of the special queue family values reserved for external memory ownership transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">Queue Family Ownership Transfer</a>. A <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers-release">queue family release operation</a> is defined when {@code dstQueueFamilyIndex} is one of those values, and a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers-acquire">queue family acquire operation</a> is defined when {@code srcQueueFamilyIndex} is one of those values.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR or #PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-conditionalRendering">conditional rendering</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-fragmentDensityMap">fragment density map</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-transformFeedback">transform feedback</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-shadingRateImage">shading rate image</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INDEX_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR, #PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_UNIFORM_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_STORAGE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFER_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COPY_BIT_KHR, #PIPELINE_STAGE_2_BLIT_BIT_KHR, #PIPELINE_STAGE_2_RESOLVE_BIT_KHR, #PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFER_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COPY_BIT_KHR, #PIPELINE_STAGE_2_BLIT_BIT_KHR, #PIPELINE_STAGE_2_RESOLVE_BIT_KHR, #PIPELINE_STAGE_2_CLEAR_BIT_KHR, #PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_HOST_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_HOST_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_HOST_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_HOST_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR, #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, #PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
        </ul>

        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR or #PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-conditionalRendering">conditional rendering</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-fragmentDensityMap">fragment density map</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-transformFeedback">transform feedback</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-shadingRateImage">shading rate image</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INDEX_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR, #PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_UNIFORM_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_STORAGE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFER_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COPY_BIT_KHR, #PIPELINE_STAGE_2_BLIT_BIT_KHR, #PIPELINE_STAGE_2_RESOLVE_BIT_KHR, #PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFER_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COPY_BIT_KHR, #PIPELINE_STAGE_2_BLIT_BIT_KHR, #PIPELINE_STAGE_2_RESOLVE_BIT_KHR, #PIPELINE_STAGE_2_CLEAR_BIT_KHR, #PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_HOST_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_HOST_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_HOST_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_HOST_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR, #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, #PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
        </ul>

        <ul>
            <li>{@code offset} <b>must</b> be less than the size of {@code buffer}</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code size} <b>must</b> be greater than 0</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code size} <b>must</b> be less than or equal to than the size of {@code buffer} minus {@code offset}</li>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>If {@code srcQueueFamilyIndex} is not equal to {@code dstQueueFamilyIndex}, at least one <b>must</b> not be a special queue family reserved for external memory ownership transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">Queue Family Ownership Transfer</a></li>
            <li>If {@code buffer} was created with a sharing mode of #SHARING_MODE_CONCURRENT, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are not equal, and one of {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} is a special queue family values reserved for external memory transfers, the other <b>must</b> be #QUEUE_FAMILY_IGNORED</li>
            <li>If {@code buffer} was created with a sharing mode of #SHARING_MODE_EXCLUSIVE, and {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are not equal, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b> both be valid queue families, or one of the special queue family values reserved for external memory transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">Queue Family Ownership Transfer</a></li>
            <li>If {@code srcStageMask} or {@code dstStageMask} include #PIPELINE_STAGE_2_HOST_BIT_KHR, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b> be equal</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
            <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits2KHR} values</li>
            <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
            <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits2KHR} values</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
        </ul>

        <h5>See Also</h5>
        ##VkDependencyInfoKHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineStageFlags2KHR("srcStageMask", "a {@code VkPipelineStageFlags2KHR} mask of pipeline stages to be included in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-dependencies-scopes\">first synchronization scope</a>.")
    VkAccessFlags2KHR("srcAccessMask", "a {@code VkAccessFlags2KHR} mask of pipeline <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-dependencies-access-scopes\">first access scope</a>.")
    VkPipelineStageFlags2KHR("dstStageMask", """a {@code VkPipelineStageFlags2KHR} mask of pipeline stages to be included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">second synchronization scope</a>.

        a {@code VkAccessFlags2KHR} mask of pipeline <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">second access scope</a>.""")
    VkAccessFlags2KHR("dstAccessMask", "")
    uint32_t("srcQueueFamilyIndex", "the source queue family for a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-queue-transfers\">queue family ownership transfer</a>.")
    uint32_t("dstQueueFamilyIndex", "the destination queue family for a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-queue-transfers\">queue family ownership transfer</a>.")
    VkBuffer("buffer", "a handle to the buffer whose backing memory is affected by the barrier.")
    VkDeviceSize("offset", "an offset in bytes into the backing memory for {@code buffer}; this is relative to the base offset as bound to the buffer (see #BindBufferMemory()).")
    VkDeviceSize("size", "a size in bytes of the affected area of backing memory for {@code buffer}, or #WHOLE_SIZE to use the range from {@code offset} to the end of the buffer.")
}

val VkImageMemoryBarrier2KHR = struct(Module.VULKAN, "VkImageMemoryBarrier2KHR") {
    documentation =
        """
        Structure specifying an image memory barrier.

        <h5>Description</h5>
        This structure defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-memory">memory dependency</a> limited to an image subresource range, and optionally defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family transfer operation</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a> for that subresource range.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> described by this structure include only operations and memory accesses specified by elements {@code srcStageMask} and {@code srcAccessMask}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> described by this structure include only operations and memory accesses specified by elements {@code dstStageMask} and {@code dstAccessMask}.

        Both <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scopes</a> are limited to only memory accesses to {@code image} in the subresource range defined by {@code subresourceRange}.

        If {@code image} was created with #SHARING_MODE_EXCLUSIVE, and {@code srcQueueFamilyIndex} is not equal to {@code dstQueueFamilyIndex}, this memory barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family transfer operation</a>. When executed on a queue in the family identified by {@code srcQueueFamilyIndex}, this barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers-release">queue family release operation</a> for the specified image subresource range, and the second synchronization and access scopes do not synchronize operations on that queue. When executed on a queue in the family identified by {@code dstQueueFamilyIndex}, this barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers-acquire">queue family acquire operation</a> for the specified image subresource range, and the first synchronization and access scopes do not synchronize operations on that queue.

        A <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family transfer operation</a> is also defined if the values are not equal, and either is one of the special queue family values reserved for external memory ownership transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">Queue Family Ownership Transfer</a>. A <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers-release">queue family release operation</a> is defined when {@code dstQueueFamilyIndex} is one of those values, and a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers-acquire">queue family acquire operation</a> is defined when {@code srcQueueFamilyIndex} is one of those values.

        If {@code oldLayout} is not equal to {@code newLayout}, then the memory barrier defines an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a> for the specified image subresource range. If this memory barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family transfer operation</a>, the layout transition is only executed once between the queues.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        When the old and new layout are equal, the layout values are ignored - data is preserved no matter what values are specified, or what layout the image is currently in.
        </div>

        If {@code image} has a multi-planar format and the image is <em>disjoint</em>, then including #IMAGE_ASPECT_COLOR_BIT in the {@code aspectMask} member of {@code subresourceRange} is equivalent to including #IMAGE_ASPECT_PLANE_0_BIT, #IMAGE_ASPECT_PLANE_1_BIT, and (for three-plane formats only) #IMAGE_ASPECT_PLANE_2_BIT.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR or #PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-conditionalRendering">conditional rendering</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-fragmentDensityMap">fragment density map</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-transformFeedback">transform feedback</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-shadingRateImage">shading rate image</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INDEX_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR, #PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_UNIFORM_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_STORAGE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFER_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COPY_BIT_KHR, #PIPELINE_STAGE_2_BLIT_BIT_KHR, #PIPELINE_STAGE_2_RESOLVE_BIT_KHR, #PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFER_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COPY_BIT_KHR, #PIPELINE_STAGE_2_BLIT_BIT_KHR, #PIPELINE_STAGE_2_RESOLVE_BIT_KHR, #PIPELINE_STAGE_2_CLEAR_BIT_KHR, #PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_HOST_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_HOST_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_HOST_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_HOST_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR, #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, #PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
        </ul>

        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR or #PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-conditionalRendering">conditional rendering</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-fragmentDensityMap">fragment density map</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-transformFeedback">transform feedback</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-shadingRateImage">shading rate image</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INDEX_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR, #PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_UNIFORM_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_STORAGE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADER_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFER_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COPY_BIT_KHR, #PIPELINE_STAGE_2_BLIT_BIT_KHR, #PIPELINE_STAGE_2_RESOLVE_BIT_KHR, #PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFER_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COPY_BIT_KHR, #PIPELINE_STAGE_2_BLIT_BIT_KHR, #PIPELINE_STAGE_2_RESOLVE_BIT_KHR, #PIPELINE_STAGE_2_CLEAR_BIT_KHR, #PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR, #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_HOST_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_HOST_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_HOST_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_HOST_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR, #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV, #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR, #PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR, or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
            <li>If pname:{accessMaskName} includes #ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR, pname:{stageMaskName} <b>must</b> include #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR or #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR</li>
        </ul>

        <ul>
            <li>{@code subresourceRange.baseMipLevel} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>If {@code subresourceRange.levelCount} is not #REMAINING_MIP_LEVELS, <code>subresourceRange.baseMipLevel + subresourceRange.levelCount</code> <b>must</b> be less than or equal to the {@code mipLevels} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>{@code subresourceRange.baseArrayLayer} <b>must</b> be less than the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>If {@code subresourceRange.layerCount} is not #REMAINING_ARRAY_LAYERS, <code>subresourceRange.baseArrayLayer subresourceRange.layerCount</code> <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>If {@code image} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_COLOR_ATTACHMENT_BIT</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_SAMPLED_BIT or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, {@code oldLayout} <b>must</b> be #IMAGE_LAYOUT_UNDEFINED or the current layout of the image subresources affected by the barrier</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, {@code newLayout} <b>must</b> not be #IMAGE_LAYOUT_UNDEFINED or #IMAGE_LAYOUT_PREINITIALIZED</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL then {@code image} <b>must</b> have been created with at least one of #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, #IMAGE_USAGE_SAMPLED_BIT, or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT set</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL then {@code image} <b>must</b> have been created with at least one of #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, #IMAGE_USAGE_SAMPLED_BIT, or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT set</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR, {@code image} <b>must</b> have been created with #IMAGE_USAGE_COLOR_ATTACHMENT_BIT or #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR, {@code image} <b>must</b> have been created with at least one of #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, #IMAGE_USAGE_SAMPLED_BIT, or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT</li>
            <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR then {@code image} <b>must</b> have been created with #IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR set</li>
            <li>If {@code image} has a single-plane color format or is not <em>disjoint</em>, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> be #IMAGE_ASPECT_COLOR_BIT</li>
            <li>If {@code image} has a multi-planar format and the image is <em>disjoint</em>, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include either at least one of #IMAGE_ASPECT_PLANE_0_BIT, #IMAGE_ASPECT_PLANE_1_BIT, and #IMAGE_ASPECT_PLANE_2_BIT; or <b>must</b> include #IMAGE_ASPECT_COLOR_BIT</li>
            <li>If {@code image} has a multi-planar format with only two planes, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> not include #IMAGE_ASPECT_PLANE_2_BIT</li>
            <li>If {@code image} has a depth/stencil format with both depth and stencil and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-separateDepthStencilLayouts">separateDepthStencilLayouts</a> feature is enabled, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include either or both #IMAGE_ASPECT_DEPTH_BIT and #IMAGE_ASPECT_STENCIL_BIT</li>
            <li>If {@code image} has a depth/stencil format with both depth and stencil and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-separateDepthStencilLayouts">separateDepthStencilLayouts</a> feature is not enabled, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include both #IMAGE_ASPECT_DEPTH_BIT and #IMAGE_ASPECT_STENCIL_BIT</li>
            <li>If {@code srcQueueFamilyIndex} is not equal to {@code dstQueueFamilyIndex}, at least one <b>must</b> not be a special queue family reserved for external memory ownership transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">Queue Family Ownership Transfer</a></li>
            <li>If {@code image} was created with a sharing mode of #SHARING_MODE_CONCURRENT, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are not equal, and one of {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} is a special queue family values reserved for external memory transfers, the other <b>must</b> be #QUEUE_FAMILY_IGNORED</li>
            <li>If {@code image} was created with a sharing mode of #SHARING_MODE_EXCLUSIVE, and {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are not equal, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b> both be valid queue families, or one of the special queue family values reserved for external memory transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">Queue Family Ownership Transfer</a></li>
            <li>If {@code srcStageMask} or {@code dstStageMask} include #PIPELINE_STAGE_2_HOST_BIT_KHR, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b> be equal</li>
            <li>If {@code srcStageMask} includes #PIPELINE_STAGE_2_HOST_BIT_KHR, and {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a>, {@code oldLayout} <b>must</b> be one of #IMAGE_LAYOUT_PREINITIALIZED, #IMAGE_LAYOUT_UNDEFINED, or #IMAGE_LAYOUT_GENERAL</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkSampleLocationsInfoEXT</li>
            <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
            <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
            <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits2KHR} values</li>
            <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
            <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits2KHR} values</li>
            <li>{@code oldLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code newLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code subresourceRange} <b>must</b> be a valid ##VkImageSubresourceRange structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkDependencyInfoKHR, ##VkImageSubresourceRange
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkPipelineStageFlags2KHR("srcStageMask", "a {@code VkPipelineStageFlags2KHR} mask of pipeline stages to be included in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-dependencies-scopes\">first synchronization scope</a>.")
    VkAccessFlags2KHR("srcAccessMask", "a {@code VkAccessFlags2KHR} mask of pipeline <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-dependencies-access-scopes\">first access scope</a>.")
    VkPipelineStageFlags2KHR("dstStageMask", """a {@code VkPipelineStageFlags2KHR} mask of pipeline stages to be included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">second synchronization scope</a>.

        a {@code VkAccessFlags2KHR} mask of pipeline <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">second access scope</a>.""")
    VkAccessFlags2KHR("dstAccessMask", "")
    VkImageLayout("oldLayout", "the old layout in an <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-image-layout-transitions\">image layout transition</a>.")
    VkImageLayout("newLayout", "the new layout in an <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-image-layout-transitions\">image layout transition</a>.")
    uint32_t("srcQueueFamilyIndex", "the source queue family for a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-queue-transfers\">queue family ownership transfer</a>.")
    uint32_t("dstQueueFamilyIndex", "the destination queue family for a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-queue-transfers\">queue family ownership transfer</a>.")
    VkImage("image", "a handle to the image affected by this barrier.")
    VkImageSubresourceRange("subresourceRange", "describes the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#resources-image-views\">image subresource range</a> within {@code image} that is affected by this barrier.")
}

val VkDependencyInfoKHR = struct(Module.VULKAN, "VkDependencyInfoKHR") {
    documentation =
        """
        Structure specifying dependency information for a synchronization command.

        <h5>Description</h5>
        This structure defines a set of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-memory">memory dependencies</a>, as well as <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family transfer operations</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transitions</a>.

        Each member of {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, and {@code pImageMemoryBarriers} defines a separate <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-memory">memory dependency</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEPENDENCY_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code dependencyFlags} <b>must</b> be a valid combination of {@code VkDependencyFlagBits} values</li>
            <li>If {@code memoryBarrierCount} is not 0, {@code pMemoryBarriers} <b>must</b> be a valid pointer to an array of {@code memoryBarrierCount} valid ##VkMemoryBarrier2KHR structures</li>
            <li>If {@code bufferMemoryBarrierCount} is not 0, {@code pBufferMemoryBarriers} <b>must</b> be a valid pointer to an array of {@code bufferMemoryBarrierCount} valid ##VkBufferMemoryBarrier2KHR structures</li>
            <li>If {@code imageMemoryBarrierCount} is not 0, {@code pImageMemoryBarriers} <b>must</b> be a valid pointer to an array of {@code imageMemoryBarrierCount} valid ##VkImageMemoryBarrier2KHR structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkBufferMemoryBarrier2KHR, ##VkImageMemoryBarrier2KHR, ##VkMemoryBarrier2KHR, #CmdPipelineBarrier2KHR(), #CmdSetEvent2KHR(), #CmdWaitEvents2KHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDependencyFlags("dependencyFlags", "a bitmask of {@code VkDependencyFlagBits} specifying how execution and memory dependencies are formed.")
    AutoSize("pMemoryBarriers", optional = true)..uint32_t("memoryBarrierCount", "the length of the {@code pMemoryBarriers} array.")
    VkMemoryBarrier2KHR.const.p("pMemoryBarriers", "a pointer to an array of ##VkMemoryBarrier2KHR structures that define memory dependencies between any memory accesses.")
    AutoSize("pBufferMemoryBarriers", optional = true)..uint32_t("bufferMemoryBarrierCount", "the length of the {@code pBufferMemoryBarriers} array.")
    VkBufferMemoryBarrier2KHR.const.p("pBufferMemoryBarriers", "a pointer to an array of ##VkBufferMemoryBarrier2KHR structures that define memory dependencies between buffer ranges.")
    AutoSize("pImageMemoryBarriers", optional = true)..uint32_t("imageMemoryBarrierCount", "the length of the {@code pImageMemoryBarriers} array.")
    VkImageMemoryBarrier2KHR.const.p("pImageMemoryBarriers", "a pointer to an array of ##VkImageMemoryBarrier2KHR structures that define memory dependencies between image subresources.")
}

val VkSemaphoreSubmitInfoKHR = struct(Module.VULKAN, "VkSemaphoreSubmitInfoKHR") {
    documentation =
        """
        Structure specifying a semaphore signal or wait operation.

        <h5>Description</h5>
        Whether this structure defines a semaphore wait or signal operation is defined by how it is used.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR or #PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-conditionalRendering">conditional rendering</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-fragmentDensityMap">fragment density map</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-transformFeedback">transform feedback</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-shadingRateImage">shading rate image</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV</li>
            <li>If the {@code device} that {@code semaphore} was created on is not a device group, {@code deviceIndex} <b>must</b> be 0</li>
            <li>If the {@code device} that {@code semaphore} was created on is a device group, {@code deviceIndex} <b>must</b> be a valid device index</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>{@code stageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkSubmitInfo2KHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSemaphore("semaphore", "a {@code VkSemaphore} affected by this operation.")
    uint64_t("value", "either the value used to signal {@code semaphore} or the value waited on by {@code semaphore}, if {@code semaphore} is a timeline semaphore. Otherwise it is ignored.")
    VkPipelineStageFlags2KHR("stageMask", "a {@code VkPipelineStageFlags2KHR} mask of pipeline stages at which the semaphore either waits or is signaled.")
    uint32_t("deviceIndex", "the index of the device within a device group that executes the semaphore wait or signal operation.")
}

val VkCommandBufferSubmitInfoKHR = struct(Module.VULKAN, "VkCommandBufferSubmitInfoKHR") {
    documentation =
        """
        Structure specifying a command buffer submission.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> not have been allocated with #COMMAND_BUFFER_LEVEL_SECONDARY</li>
            <li>If {@code deviceMask} is not 0, it <b>must</b> be a valid device mask</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
        </ul>

        <h5>See Also</h5>
        ##VkSubmitInfo2KHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkCommandBuffer("commandBuffer", "a {@code VkCommandBuffer} to be submitted for execution.")
    uint32_t("deviceMask", "a bitmask indicating which devices in a device group execute the command buffer. A {@code deviceMask} of 0 is equivalent to setting all bits corresponding to valid devices in the group to 1.")
}

val VkSubmitInfo2KHR = struct(Module.VULKAN, "VkSubmitInfo2KHR") {
    documentation =
        """
        Structure specifying a queue submit operation.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the same semaphore is used as the {@code semaphore} member of both an element of {@code pSignalSemaphoreInfos} and {@code pWaitSemaphoreInfos}, and that semaphore is a timeline semaphore, the {@code value} member of the {@code pSignalSemaphoreInfos} element <b>must</b> be greater than the {@code value} member of the {@code pWaitSemaphoreInfos} element</li>
            <li>If the {@code semaphore} member of any element of {@code pSignalSemaphoreInfos} is a timeline semaphore, the {@code value} member of that element <b>must</b> have a value greater than the current value of the semaphore when the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-semaphores-signaling">semaphore signal operation</a> is executed</li>
            <li>If the {@code semaphore} member of any element of {@code pSignalSemaphoreInfos} is a timeline semaphore, the {@code value} member of that element <b>must</b> have a value which does not differ from the current value of the semaphore or the value of any outstanding semaphore wait or signal operation on that semaphore by more than <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-maxTimelineSemaphoreValueDifference">{@code maxTimelineSemaphoreValueDifference}</a></li>
            <li>If the {@code semaphore} member of any element of {@code pWaitSemaphoreInfos} is a timeline semaphore, the {@code value} member of that element <b>must</b> have a value which does not differ from the current value of the semaphore or the value of any outstanding semaphore wait or signal operation on that semaphore by more than <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-maxTimelineSemaphoreValueDifference">{@code maxTimelineSemaphoreValueDifference}</a></li>
            <li>If the protected memory feature is not enabled, {@code flags} <b>must</b> not include #SUBMIT_PROTECTED_BIT_KHR</li>
            <li>If {@code flags} includes #SUBMIT_PROTECTED_BIT_KHR, all elements of {@code pCommandBuffers} <b>must</b> be protected command buffers</li>
            <li>If {@code flags} does not include #SUBMIT_PROTECTED_BIT_KHR, each element of {@code pCommandBuffers} <b>must</b> not be a protected command buffer</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SUBMIT_INFO_2_KHR</li>
            <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of ##VkPerformanceQuerySubmitInfoKHR, ##VkWin32KeyedMutexAcquireReleaseInfoKHR, or ##VkWin32KeyedMutexAcquireReleaseInfoNV</li>
            <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkSubmitFlagBitsKHR} values</li>
            <li>If {@code waitSemaphoreInfoCount} is not 0, {@code pWaitSemaphoreInfos} <b>must</b> be a valid pointer to an array of {@code waitSemaphoreInfoCount} valid ##VkSemaphoreSubmitInfoKHR structures</li>
            <li>If {@code commandBufferInfoCount} is not 0, {@code pCommandBufferInfos} <b>must</b> be a valid pointer to an array of {@code commandBufferInfoCount} valid ##VkCommandBufferSubmitInfoKHR structures</li>
            <li>If {@code signalSemaphoreInfoCount} is not 0, {@code pSignalSemaphoreInfos} <b>must</b> be a valid pointer to an array of {@code signalSemaphoreInfoCount} valid ##VkSemaphoreSubmitInfoKHR structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkCommandBufferSubmitInfoKHR, ##VkSemaphoreSubmitInfoKHR, #QueueSubmit2KHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSubmitFlagsKHR("flags", "a bitmask of {@code VkSubmitFlagBitsKHR}.")
    AutoSize("pWaitSemaphoreInfos", optional = true)..uint32_t("waitSemaphoreInfoCount", "the number of elements in {@code pWaitSemaphoreInfos}.")
    VkSemaphoreSubmitInfoKHR.const.p("pWaitSemaphoreInfos", "a pointer to an array of ##VkSemaphoreSubmitInfoKHR structures defining <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-semaphores-waiting\">semaphore wait operations</a>.")
    AutoSize("pCommandBufferInfos", optional = true)..uint32_t("commandBufferInfoCount", "the number of elements in {@code pCommandBufferInfos} and the number of command buffers to execute in the batch.")
    VkCommandBufferSubmitInfoKHR.const.p("pCommandBufferInfos", "a pointer to an array of ##VkCommandBufferSubmitInfoKHR structures describing command buffers to execute in the batch.")
    AutoSize("pSignalSemaphoreInfos", optional = true)..uint32_t("signalSemaphoreInfoCount", "the number of elements in {@code pSignalSemaphoreInfos}.")
    VkSemaphoreSubmitInfoKHR.const.p("pSignalSemaphoreInfos", "a pointer to an array of ##VkSemaphoreSubmitInfoKHR describing <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-semaphores-signaling\">semaphore signal operations</a>.")
}

val VkPhysicalDeviceSynchronization2FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceSynchronization2FeaturesKHR") {
    documentation =
        """
        Structure describing whether the implementation supports v2 synchronization commands.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceSynchronization2FeaturesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with a value indicating whether the feature is supported. ##VkPhysicalDeviceSynchronization2FeaturesKHR <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("synchronization2", "indicates whether the implementation supports the new set of synchronization commands introduced in VK_KHR_synchronization2.html[VK_KHR_synchronization2].")
}

val VkQueueFamilyCheckpointProperties2NV = struct(Module.VULKAN, "VkQueueFamilyCheckpointProperties2NV", mutable = false) {
    documentation =
        """
        return structure for queue family checkpoint info query.

        <h5>Description</h5>
        Additional queue family information can be queried by setting ##VkQueueFamilyProperties2{@code ::pNext} to point to a ##VkQueueFamilyCheckpointProperties2NV structure.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkPipelineStageFlags2KHR("checkpointExecutionStageMask", "a mask indicating which pipeline stages the implementation can execute checkpoint markers in.")
}

val VkCheckpointData2NV = struct(Module.VULKAN, "VkCheckpointData2NV", mutable = false) {
    documentation =
        """
        return structure for command buffer checkpoint data.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        The stages at which a checkpoint marker <b>can</b> be executed are implementation-defined and <b>can</b> be queried by calling #GetPhysicalDeviceQueueFamilyProperties2().

        <h5>See Also</h5>
        #GetQueueCheckpointData2NV()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.").mutable()
    VkPipelineStageFlags2KHR("stage", "indicates a single pipeline stage which the checkpoint marker data refers to.")
    opaque_p("pCheckpointMarker", "contains the value of the last checkpoint marker executed in the stage that {@code stage} refers to.")
}

val VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR") {
    documentation =
        """
        Structure describing support for zero initialization of workgroup memory by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with a value indicating whether the feature is supported. ##VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("shaderZeroInitializeWorkgroupMemory", "specifies whether the implementation supports initializing a variable in Workgroup storage class.")
}

val VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV") {
    documentation =
        """
        Structure indicating support for fragment shading rate enums.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable these features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("fragmentShadingRateEnums", "indicates that the implementation supports specifying fragment shading rates using the {@code VkFragmentShadingRateNV} enumerated type.")
    VkBool32("supersampleFragmentShadingRates", "indicates that the implementation supports fragment shading rate enum values indicating more than one invocation per fragment.")
    VkBool32("noInvocationFragmentShadingRates", "indicates that the implementation supports a fragment shading rate enum value indicating that no fragment shaders should be invoked when that shading rate is used.")
}

val VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV") {
    documentation =
        """
        Structure describing fragment shading rate limits that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV</li>
            <li>{@code maxFragmentShadingRateInvocationCount} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkSampleCountFlagBits("maxFragmentShadingRateInvocationCount", "indicates the maximum number of fragment shader invocations per fragment supported in pipeline, primitive, and attachment fragment shading rates.")
}

val VkPipelineFragmentShadingRateEnumStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineFragmentShadingRateEnumStateCreateInfoNV") {
    documentation =
        """
        Structure specifying parameters controlling the fragment shading rate using rate enums.

        <h5>Description</h5>
        If the {@code pNext} chain of ##VkGraphicsPipelineCreateInfo includes a ##VkPipelineFragmentShadingRateEnumStateCreateInfoNV structure, then that structure includes parameters that control the pipeline fragment shading rate.

        If this structure is not present, {@code shadingRateType} is considered to be equal to #FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV, {@code shadingRate} is considered to be equal to #FRAGMENT_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV, and both elements of {@code combinerOps} are considered to be equal to #FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV</li>
            <li>{@code shadingRateType} <b>must</b> be a valid {@code VkFragmentShadingRateTypeNV} value</li>
            <li>{@code shadingRate} <b>must</b> be a valid {@code VkFragmentShadingRateNV} value</li>
            <li>Any given element of {@code combinerOps} <b>must</b> be a valid {@code VkFragmentShadingRateCombinerOpKHR} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkFragmentShadingRateTypeNV("shadingRateType", "specifies a {@code VkFragmentShadingRateTypeNV} value indicating whether fragment shading rates are specified using fragment sizes or {@code VkFragmentShadingRateNV} enums.")
    VkFragmentShadingRateNV("shadingRate", "specifies a {@code VkFragmentShadingRateNV} value indicating the pipeline fragment shading rate.")
    VkFragmentShadingRateCombinerOpKHR("combinerOps", "specifies {@code VkFragmentShadingRateCombinerOpKHR} values determining how the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-pipeline\">pipeline</a>, <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-primitive\">primitive</a>, and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-attachment\">attachment shading rates</a> are <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-combining\">combined</a> for fragments generated by drawing commands using the created pipeline.")[2]
}

val VkPhysicalDeviceFragmentDensityMap2FeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMap2FeaturesEXT") {
    documentation =
        """
        Structure describing additional fragment density map features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceFragmentDensityMap2FeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceFragmentDensityMap2FeaturesEXT <b>can</b> also be included in {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("fragmentDensityMapDeferred", "specifies whether the implementation supports deferred reads of fragment density map image views. If this feature is not enabled, #IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DEFERRED_BIT_EXT <b>must</b> not be included in ##VkImageViewCreateInfo{@code ::flags}.")
}

val VkPhysicalDeviceFragmentDensityMap2PropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMap2PropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing additional fragment density map properties that can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT</li>
        </ul>

        If the ##VkPhysicalDeviceFragmentDensityMap2PropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits and properties.
        """

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkBool32("subsampledLoads", "specifies if performing image data read with load operations on subsampled attachments will be resampled to the fragment density of the render pass")
    VkBool32("subsampledCoarseReconstructionEarlyAccess", "specifies if performing image data read with samplers created with {@code flags} containing #SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT in fragment shader will trigger additional reads during #PIPELINE_STAGE_VERTEX_SHADER_BIT")
    uint32_t("maxSubsampledArrayLayers", "the maximum number of {@code VkImageView} array layers for usages supporting subsampled samplers")
    uint32_t("maxDescriptorSetSubsampledSamplers", "the maximum number of subsampled samplers that <b>can</b> be included in a {@code VkPipelineLayout}")
}

val VkCopyCommandTransformInfoQCOM = struct(Module.VULKAN, "VkCopyCommandTransformInfoQCOM") {
    documentation =
        """
        Structure describing transform parameters of rotated copy command.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code transform} <b>must</b> be #SURFACE_TRANSFORM_IDENTITY_BIT_KHR, #SURFACE_TRANSFORM_ROTATE_90_BIT_KHR, #SURFACE_TRANSFORM_ROTATE_180_BIT_KHR, or #SURFACE_TRANSFORM_ROTATE_270_BIT_KHR</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSurfaceTransformFlagBitsKHR("transform", "a {@code VkSurfaceTransformFlagBitsKHR} value describing the transform to be applied.")
}

val VkPhysicalDeviceImageRobustnessFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceImageRobustnessFeaturesEXT") {
    documentation =
        """
        Structure describing the out-of-bounds behavior for an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceImageRobustnessFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("robustImageAccess", "indicates whether image accesses are tightly bounds-checked against the dimensions of the image view. <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#textures-input-validation\">Invalid texels</a> resulting from out of bounds image loads will be replaced as described in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#textures-texel-replacement\">Texel Replacement</a>, with either <code>(0,0,1)</code> or <code>(0,0,0)</code> values inserted for missing G, B, or A components based on the format.")
}

val VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR") {
    documentation =
        """
        Structure describing the workgroup storage explicit layout features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR <b>can</b> also be included in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("workgroupMemoryExplicitLayout", "indicates whether the implementation supports the SPIR-V {@code WorkgroupMemoryExplicitLayoutKHR} capability.")
    VkBool32("workgroupMemoryExplicitLayoutScalarBlockLayout", "indicates whether the implementation supports scalar alignment for laying out Workgroup Blocks.")
    VkBool32("workgroupMemoryExplicitLayout8BitAccess", "indicates whether objects in the {@code Workgroup} storage class with the {@code Block} decoration <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code WorkgroupMemoryExplicitLayout8BitAccessKHR} capability.")
    VkBool32("workgroupMemoryExplicitLayout16BitAccess", "indicates whether objects in the {@code Workgroup} storage class with the {@code Block} decoration <b>can</b> have 16-bit integer and 16-bit floating-point members. If this feature is not enabled, 16-bit integer or 16-bit floating-point members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code WorkgroupMemoryExplicitLayout16BitAccessKHR} capability.")
}

val VkBufferCopy2KHR = struct(Module.VULKAN, "VkBufferCopy2KHR") {
    documentation =
        """
        Structure specifying a buffer copy operation.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code size} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_BUFFER_COPY_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        ##VkCopyBufferInfo2KHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDeviceSize("srcOffset", "the starting offset in bytes from the start of {@code srcBuffer}.")
    VkDeviceSize("dstOffset", "the starting offset in bytes from the start of {@code dstBuffer}.")
    VkDeviceSize("size", "the number of bytes to copy.")
}

val VkCopyBufferInfo2KHR = struct(Module.VULKAN, "VkCopyBufferInfo2KHR") {
    documentation =
        """
        Structure specifying parameters of a buffer copy command.

        <h5>Description</h5>
        Members defined by this structure with the same name as parameters in #CmdCopyBuffer() have the identical effect to those parameters; the child structure ##VkBufferCopy2KHR is a variant of ##VkBufferCopy which includes {@code sType} and {@code pNext} parameters, allowing it to be extended.

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
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COPY_BUFFER_INFO_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid ##VkBufferCopy2KHR structures</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code dstBuffer}, and {@code srcBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkBufferCopy2KHR, #CmdCopyBuffer2KHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBuffer("srcBuffer", "the source buffer.")
    VkBuffer("dstBuffer", "the destination buffer.")
    AutoSize("pRegions")..uint32_t("regionCount", "the number of regions to copy.")
    VkBufferCopy2KHR.const.p("pRegions", "a pointer to an array of ##VkBufferCopy2KHR structures specifying the regions to copy.")
}

val VkImageCopy2KHR = struct(Module.VULKAN, "VkImageCopy2KHR") {
    documentation =
        """
        Structure specifying an image copy operation.

        <h5>Valid Usage</h5>
        <ul>
            <li>The number of slices of the {@code extent} (for 3D) or layers of the {@code srcSubresource} (for non-3D) <b>must</b> match the number of slices of the {@code extent} (for 3D) or layers of the {@code dstSubresource} (for non-3D)</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_COPY_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code srcSubresource} <b>must</b> be a valid ##VkImageSubresourceLayers structure</li>
            <li>{@code dstSubresource} <b>must</b> be a valid ##VkImageSubresourceLayers structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkCopyImageInfo2KHR, ##VkExtent3D, ##VkImageSubresourceLayers, ##VkOffset3D
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkImageSubresourceLayers("srcSubresource", "{@code srcSubresource} and {@code dstSubresource} are ##VkImageSubresourceLayers structures specifying the image subresources of the images used for the source and destination image data, respectively.")
    VkOffset3D("srcOffset", "{@code srcOffset} and {@code dstOffset} select the initial {@code x}, {@code y}, and {@code z} offsets in texels of the sub-regions of the source and destination image data.")
    VkImageSubresourceLayers("dstSubresource", "see {@code srcSubresource}")
    VkOffset3D("dstOffset", "see {@code srcOffset}")
    VkExtent3D("extent", "the size in texels of the image to copy in {@code width}, {@code height} and {@code depth}.")
}

val VkCopyImageInfo2KHR = struct(Module.VULKAN, "VkCopyImageInfo2KHR") {
    documentation =
        """
        Structure specifying parameters of an image copy command.

        <h5>Valid Usage</h5>
        <ul>
            <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain #FORMAT_FEATURE_TRANSFER_SRC_BIT</li>
            <li>{@code srcImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT usage flag</li>
            <li>If {@code srcImage} is non-sparse then the image or <em>disjoint</em> plane to be copied <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code srcImageLayout} <b>must</b> be #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL, #IMAGE_LAYOUT_GENERAL, or #IMAGE_LAYOUT_SHARED_PRESENT_KHR</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code dstImage} <b>must</b> contain #FORMAT_FEATURE_TRANSFER_DST_BIT</li>
            <li>{@code dstImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstImage} is non-sparse then the image or <em>disjoint</em> plane that is the destination of the copy <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code dstImageLayout} <b>must</b> be #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL, #IMAGE_LAYOUT_GENERAL, or #IMAGE_LAYOUT_SHARED_PRESENT_KHR</li>
            <li>If the {@code VkFormat} of each of {@code srcImage} and {@code dstImage} is not a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion"><em>multi-planar format</em></a>, the {@code VkFormat} of each of {@code srcImage} and {@code dstImage} <b>must</b> be compatible, as defined <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies-images-format-compatibility">above</a></li>
            <li>In a copy to or from a plane of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar image</a>, the {@code VkFormat} of the image and plane <b>must</b> be compatible according to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-compatible-planes">the description of compatible planes</a> for the plane being copied</li>
            <li>The sample count of {@code srcImage} and {@code dstImage} <b>must</b> match</li>
            <li>The {@code srcSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The {@code dstSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>The <code>srcSubresource.baseArrayLayer srcSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The <code>dstSubresource.baseArrayLayer dstSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>The {@code srcOffset} and {@code extent} members of each element of {@code pRegions} <b>must</b> respect the image transfer granularity requirements of {@code commandBuffer}&#8217;s command pool&#8217;s queue family, as described in ##VkQueueFamilyProperties</li>
            <li>The {@code dstOffset} and {@code extent} members of each element of {@code pRegions} <b>must</b> respect the image transfer granularity requirements of {@code commandBuffer}&#8217;s command pool&#8217;s queue family, as described in ##VkQueueFamilyProperties</li>
            <li>{@code dstImage} and {@code srcImage} <b>must</b> not have been created with {@code flags} containing #IMAGE_CREATE_SUBSAMPLED_BIT_EXT</li>
            <li>If neither {@code srcImage} nor {@code dstImage} has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a> then for each element of {@code pRegions}, {@code srcSubresource.aspectMask} and {@code dstSubresource.aspectMask} <b>must</b> match</li>
            <li>If {@code srcImage} has a {@code VkFormat} with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">two planes</a> then for each element of {@code pRegions}, {@code srcSubresource.aspectMask} <b>must</b> be #IMAGE_ASPECT_PLANE_0_BIT or #IMAGE_ASPECT_PLANE_1_BIT</li>
            <li>If {@code srcImage} has a {@code VkFormat} with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">three planes</a> then for each element of {@code pRegions}, {@code srcSubresource.aspectMask} <b>must</b> be #IMAGE_ASPECT_PLANE_0_BIT, #IMAGE_ASPECT_PLANE_1_BIT, or #IMAGE_ASPECT_PLANE_2_BIT</li>
            <li>If {@code dstImage} has a {@code VkFormat} with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">two planes</a> then for each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> be #IMAGE_ASPECT_PLANE_0_BIT or #IMAGE_ASPECT_PLANE_1_BIT</li>
            <li>If {@code dstImage} has a {@code VkFormat} with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">three planes</a> then for each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> be #IMAGE_ASPECT_PLANE_0_BIT, #IMAGE_ASPECT_PLANE_1_BIT, or #IMAGE_ASPECT_PLANE_2_BIT</li>
            <li>If {@code srcImage} has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a> and the {@code dstImage} does not have a multi-planar image format, then for each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> be #IMAGE_ASPECT_COLOR_BIT</li>
            <li>If {@code dstImage} has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a> and the {@code srcImage} does not have a multi-planar image format, then for each element of {@code pRegions}, {@code srcSubresource.aspectMask} <b>must</b> be #IMAGE_ASPECT_COLOR_BIT</li>
            <li>If {@code srcImage} is of type #IMAGE_TYPE_3D, then for each element of {@code pRegions}, {@code srcSubresource.baseArrayLayer} <b>must</b> be 0 and and {@code srcSubresource.layerCount} <b>must</b> be 1</li>
            <li>If {@code dstImage} is of type #IMAGE_TYPE_3D, then for each element of {@code pRegions}, {@code dstSubresource.baseArrayLayer} <b>must</b> be 0 and and {@code dstSubresource.layerCount} <b>must</b> be 1</li>
            <li>For each element of {@code pRegions}, {@code srcSubresource.aspectMask} <b>must</b> specify aspects present in {@code srcImage}</li>
            <li>For each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> specify aspects present in {@code dstImage}</li>
            <li>For each element of {@code pRegions}, {@code srcOffset.x} and <code>(extent.width + srcOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code srcSubresource} of {@code srcImage}</li>
            <li>For each element of {@code pRegions}, {@code srcOffset.y} and <code>(extent.height + srcOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code srcSubresource} of {@code srcImage}</li>
            <li>If {@code srcImage} is of type #IMAGE_TYPE_1D, then for each element of {@code pRegions}, {@code srcOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1</li>
            <li>For each element of {@code pRegions}, {@code srcOffset.z} and <code>(extent.depth + srcOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code srcSubresource} of {@code srcImage}</li>
            <li>If {@code srcImage} is of type #IMAGE_TYPE_1D, then for each element of {@code pRegions}, {@code srcOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1</li>
            <li>If {@code dstImage} is of type #IMAGE_TYPE_1D, then for each element of {@code pRegions}, {@code dstOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1</li>
            <li>If {@code srcImage} is of type #IMAGE_TYPE_2D, then for each element of {@code pRegions}, {@code srcOffset.z} <b>must</b> be 0</li>
            <li>If {@code dstImage} is of type #IMAGE_TYPE_2D, then for each element of {@code pRegions}, {@code dstOffset.z} <b>must</b> be 0</li>
            <li>If {@code srcImage} and {@code dstImage} are both of type #IMAGE_TYPE_2D, then for each element of {@code pRegions}, {@code extent.depth} <b>must</b> be 1</li>
            <li>If {@code srcImage} is of type #IMAGE_TYPE_2D, and {@code dstImage} is of type #IMAGE_TYPE_3D, then for each element of {@code pRegions}, {@code extent.depth} <b>must</b> equal {@code srcSubresource.layerCount}</li>
            <li>If {@code dstImage} is of type #IMAGE_TYPE_2D, and {@code srcImage} is of type #IMAGE_TYPE_3D, then for each element of {@code pRegions}, {@code extent.depth} <b>must</b> equal {@code dstSubresource.layerCount}</li>
            <li>For each element of {@code pRegions}, {@code dstOffset.x} and <code>(extent.width + dstOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code dstSubresource} of {@code dstImage}</li>
            <li>For each element of {@code pRegions}, {@code dstOffset.y} and <code>(extent.height + dstOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code dstSubresource} of {@code dstImage}</li>
            <li>If {@code dstImage} is of type #IMAGE_TYPE_1D, then for each element of {@code pRegions}, {@code dstOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1</li>
            <li>For each element of {@code pRegions}, {@code dstOffset.z} and <code>(extent.depth + dstOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code dstSubresource} of {@code dstImage}</li>
            <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, then for each element of {@code pRegions}, all members of {@code srcOffset} <b>must</b> be a multiple of the corresponding dimensions of the compressed texel block</li>
            <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, then for each element of {@code pRegions}, {@code extent.width} <b>must</b> be a multiple of the compressed texel block width or <code>(extent.width srcOffset.x)</code> <b>must</b> equal the width of the specified {@code srcSubresource} of {@code srcImage}</li>
            <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, then for each element of {@code pRegions}, {@code extent.height} <b>must</b> be a multiple of the compressed texel block height or <code>(extent.height srcOffset.y)</code> <b>must</b> equal the height of the specified {@code srcSubresource} of {@code srcImage}</li>
            <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, then for each element of {@code pRegions}, {@code extent.depth} <b>must</b> be a multiple of the compressed texel block depth or <code>(extent.depth srcOffset.z)</code> <b>must</b> equal the depth of the specified {@code srcSubresource} of {@code srcImage}</li>
            <li>If {@code dstImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, then for each element of {@code pRegions}, all members of {@code dstOffset} <b>must</b> be a multiple of the corresponding dimensions of the compressed texel block</li>
            <li>If {@code dstImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, then for each element of {@code pRegions}, {@code extent.width} <b>must</b> be a multiple of the compressed texel block width or <code>(extent.width dstOffset.x)</code> <b>must</b> equal the width of the specified {@code dstSubresource} of {@code dstImage}</li>
            <li>If {@code dstImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, then for each element of {@code pRegions}, {@code extent.height} <b>must</b> be a multiple of the compressed texel block height or <code>(extent.height dstOffset.y)</code> <b>must</b> equal the height of the specified {@code dstSubresource} of {@code dstImage}</li>
            <li>If {@code dstImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, then for each element of {@code pRegions}, {@code extent.depth} <b>must</b> be a multiple of the compressed texel block depth or <code>(extent.depth dstOffset.z)</code> <b>must</b> equal the depth of the specified {@code dstSubresource} of {@code dstImage}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COPY_IMAGE_INFO_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid ##VkImageCopy2KHR structures</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageCopy2KHR, #CmdCopyImage2KHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkImage("srcImage", "the source image.")
    VkImageLayout("srcImageLayout", "the current layout of the source image subresource.")
    VkImage("dstImage", "the destination image.")
    VkImageLayout("dstImageLayout", "the current layout of the destination image subresource.")
    AutoSize("pRegions")..uint32_t("regionCount", "the number of regions to copy.")
    VkImageCopy2KHR.const.p("pRegions", "a pointer to an array of ##VkImageCopy2KHR structures specifying the regions to copy.")
}

val VkBufferImageCopy2KHR = struct(Module.VULKAN, "VkBufferImageCopy2KHR") {
    documentation =
        """
        Structure specifying a buffer image copy operation.

        <h5>Description</h5>
        This structure is functionally identical to ##VkBufferImageCopy, but adds {@code sType} and {@code pNext} parameters, allowing it to be more easily extended.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code bufferRowLength} <b>must</b> be 0, or greater than or equal to the {@code width} member of {@code imageExtent}</li>
            <li>{@code bufferImageHeight} <b>must</b> be 0, or greater than or equal to the {@code height} member of {@code imageExtent}</li>
            <li>The {@code aspectMask} member of {@code imageSubresource} <b>must</b> only have a single bit set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkCopyCommandTransformInfoQCOM</li>
            <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
            <li>{@code imageSubresource} <b>must</b> be a valid ##VkImageSubresourceLayers structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkCopyBufferToImageInfo2KHR, ##VkCopyImageToBufferInfo2KHR, ##VkExtent3D, ##VkImageSubresourceLayers, ##VkOffset3D
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkDeviceSize("bufferOffset", "the offset in bytes from the start of the buffer object where the image data is copied from or to.")
    uint32_t("bufferRowLength", "{@code bufferRowLength} and {@code bufferImageHeight} specify in texels a subregion of a larger two- or three-dimensional image in buffer memory, and control the addressing calculations. If either of these values is zero, that aspect of the buffer memory is considered to be tightly packed according to the {@code imageExtent}.")
    uint32_t("bufferImageHeight", "see {@code bufferRowLength}")
    VkImageSubresourceLayers("imageSubresource", "a ##VkImageSubresourceLayers used to specify the specific image subresources of the image used for the source or destination image data.")
    VkOffset3D("imageOffset", "selects the initial {@code x}, {@code y}, {@code z} offsets in texels of the sub-region of the source or destination image data.")
    VkExtent3D("imageExtent", "the size in texels of the image to copy in {@code width}, {@code height} and {@code depth}.")
}

val VkCopyBufferToImageInfo2KHR = struct(Module.VULKAN, "VkCopyBufferToImageInfo2KHR") {
    documentation =
        """
        Structure specifying parameters of a buffer to image copy command.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the image region specified by each element of {@code pRegions} does not contain ##VkCopyCommandTransformInfoQCOM in its {@code pNext} chain, it <b>must</b> be a region that is contained within {@code dstImage} if the {@code dstImage}&#8217;s {@code VkFormat} is not a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, and <b>must</b> be a region that is contained within the plane being copied to if the {@code dstImage}&#8217;s {@code VkFormat} is a multi-planar format</li>
            <li>If the image region specified by each element of {@code pRegions} does contain ##VkCopyCommandTransformInfoQCOM in its {@code pNext} chain, the rotated destination region as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies-buffers-images-rotation-addressing">Buffer and Image Addressing with Rotation</a> <b>must</b> be contained within {@code dstImage}.</li>
            <li>If any element of {@code pRegions} contains ##VkCopyCommandTransformInfoQCOM in its {@code pNext} chain, then the {@code dstImage} <b>must</b> not be a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>.</li>
            <li>If any element of {@code pRegions} contains ##VkCopyCommandTransformInfoQCOM in its {@code pNext} chain, then the {@code dstImage} <b>must</b> be of type #IMAGE_TYPE_2D and <b>must</b> not be a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>.</li>
        </ul>

        <ul>
            <li>{@code srcBuffer} <b>must</b> be large enough to contain all buffer locations that are accessed according to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies-buffers-images-addressing">Buffer and Image Addressing</a>, for each element of {@code pRegions}</li>
            <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
            <li>{@code srcBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_SRC_BIT usage flag</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code dstImage} <b>must</b> contain #FORMAT_FEATURE_TRANSFER_DST_BIT</li>
            <li>If {@code srcBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstImage} <b>must</b> have a sample count equal to #SAMPLE_COUNT_1_BIT</li>
            <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code dstImageLayout} <b>must</b> be #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL, #IMAGE_LAYOUT_GENERAL, or #IMAGE_LAYOUT_SHARED_PRESENT_KHR</li>
            <li>The {@code imageSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>The <code>imageSubresource.baseArrayLayer imageSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>The {@code imageOffset} and {@code imageExtent} members of each element of {@code pRegions} <b>must</b> respect the image transfer granularity requirements of {@code commandBuffer}&#8217;s command pool&#8217;s queue family, as described in ##VkQueueFamilyProperties</li>
            <li>{@code dstImage} <b>must</b> not have been created with {@code flags} containing #IMAGE_CREATE_SUBSAMPLED_BIT_EXT</li>
            <li>If the queue family used to create the {@code VkCommandPool} which {@code commandBuffer} was allocated from does not support #QUEUE_GRAPHICS_BIT, for each element of {@code pRegions}, the {@code aspectMask} member of {@code imageSubresource} <b>must</b> not be #IMAGE_ASPECT_DEPTH_BIT or #IMAGE_ASPECT_STENCIL_BIT.</li>
            <li>For each element of {@code pRegions} not containing ##VkCopyCommandTransformInfoQCOM in its {@code pNext} chain, , {@code imageOffset.x} and <code>(imageExtent.width imageOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code imageSubresource} of {@code dstImage} where this refers to the width of the <em>plane</em> of the image involved in the copy in the case of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a></li>
            <li>For each element of {@code pRegions} not containing ##VkCopyCommandTransformInfoQCOM in its {@code pNext} chain, , {@code imageOffset.y} and <code>(imageExtent.height imageOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code imageSubresource} of {@code dstImage} where this refers to the height of the <em>plane</em> of the image involved in the copy in the case of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a></li>
        </ul>

        <ul>
            <li>If {imageparam} does not have either a depth/stencil or a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, then for each element of {@code pRegions}, {@code bufferOffset} <b>must</b> be a multiple of the format&#8217;s texel block size</li>
            <li>If {imageparam} has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, then for each element of {@code pRegions}, {@code bufferOffset} <b>must</b> be a multiple of the element size of the compatible format for the format and the {@code aspectMask} of the {@code imageSubresource} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-compatible-planes">Compatible formats of planes of multi-planar formats</a></li>
            <li>If {imageparam} is of type #IMAGE_TYPE_1D, then for each element of {@code pRegions}, {@code imageOffset.y} <b>must</b> be 0 and {@code imageExtent.height} <b>must</b> be 1</li>
            <li>For each element of {@code pRegions}, {@code imageOffset.z} and <code>(imageExtent.depth + imageOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code imageSubresource} of {imageparam}</li>
            <li>If {imageparam} is of type #IMAGE_TYPE_1D or #IMAGE_TYPE_2D, then for each element of {@code pRegions}, {@code imageOffset.z} <b>must</b> be 0 and {@code imageExtent.depth} <b>must</b> be 1</li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code bufferRowLength} <b>must</b> be a multiple of the compressed texel block width</li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code bufferImageHeight} <b>must</b> be a multiple of the compressed texel block height</li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, all members of {@code imageOffset} <b>must</b> be a multiple of the corresponding dimensions of the compressed texel block</li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code bufferOffset} <b>must</b> be a multiple of the compressed texel block size in bytes</li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code imageExtent.width} <b>must</b> be a multiple of the compressed texel block width or <code>(imageExtent.width imageOffset.x)</code> <b>must</b> equal the width of the specified {@code imageSubresource} of {imageparam}</li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code imageExtent.height} <b>must</b> be a multiple of the compressed texel block height or <code>(imageExtent.height imageOffset.y)</code> <b>must</b> equal the height of the specified {@code imageSubresource} of {imageparam}</li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code imageExtent.depth} <b>must</b> be a multiple of the compressed texel block depth or <code>(imageExtent.depth imageOffset.z)</code> <b>must</b> equal the depth of the specified {@code imageSubresource} of {imageparam}</li>
            <li>For each element of {@code pRegions}, {@code imageSubresource.aspectMask} <b>must</b> specify aspects present in {imageparam}</li>
            <li>If {imageparam} has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, then for each element of {@code pRegions}, {@code imageSubresource.aspectMask} <b>must</b> be #IMAGE_ASPECT_PLANE_0_BIT, #IMAGE_ASPECT_PLANE_1_BIT, or #IMAGE_ASPECT_PLANE_2_BIT (with #IMAGE_ASPECT_PLANE_2_BIT valid only for image formats with three planes)</li>
            <li>If {imageparam} is of type #IMAGE_TYPE_3D, for each element of {@code pRegions}, {@code imageSubresource.baseArrayLayer} <b>must</b> be 0 and {@code imageSubresource.layerCount} <b>must</b> be 1</li>
            <li>If {imageparam} is not a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code bufferRowLength} multiplied by the texel block size of {imageparam} <b>must</b> be less than or equal to <code>2<sup>31</sup>-1</code></li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code bufferRowLength} divided by the compressed texel block width and then multiplied by the texel block size of {imageparam} <b>must</b> be less than or equal to <code>2<sup>31</sup>-1</code></li>
            <li>If the queue family used to create the {@code VkCommandPool} which {@code commandBuffer} was allocated from does not support #QUEUE_GRAPHICS_BIT or #QUEUE_COMPUTE_BIT, the {@code bufferOffset} member of any element of {@code pRegions} <b>must</b> be a multiple of 4</li>
            <li>If {imageparam} has a depth/stencil format, the {@code bufferOffset} member of any element of {@code pRegions} <b>must</b> be a multiple of 4</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid ##VkBufferImageCopy2KHR structures</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code dstImage}, and {@code srcBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkBufferImageCopy2KHR, #CmdCopyBufferToImage2KHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkBuffer("srcBuffer", "the source buffer.")
    VkImage("dstImage", "the destination image.")
    VkImageLayout("dstImageLayout", "the layout of the destination image subresources for the copy.")
    AutoSize("pRegions")..uint32_t("regionCount", "the number of regions to copy.")
    VkBufferImageCopy2KHR.const.p("pRegions", "a pointer to an array of ##VkBufferImageCopy2KHR structures specifying the regions to copy.")
}

val VkCopyImageToBufferInfo2KHR = struct(Module.VULKAN, "VkCopyImageToBufferInfo2KHR") {
    documentation =
        """
        Structure specifying parameters of an image to buffer copy command.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the image region specified by each element of {@code pRegions} does not contain ##VkCopyCommandTransformInfoQCOM in its {@code pNext} chain, it <b>must</b> be a region that is contained within {@code srcImage} if the {@code srcImage}&#8217;s {@code VkFormat} is not a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, and <b>must</b> be a region that is contained within the plane being copied if the {@code srcImage}&#8217;s {@code VkFormat} is a multi-planar format</li>
            <li>If the image region specified by each element of {@code pRegions} does contain ##VkCopyCommandTransformInfoQCOM in its {@code pNext} chain, the rotated source region as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies-buffers-images-rotation-addressing">Buffer and Image Addressing with Rotation</a> <b>must</b> be contained within {@code srcImage}.</li>
            <li>If any element of {@code pRegions} contains ##VkCopyCommandTransformInfoQCOM in its {@code pNext} chain, then the {@code srcImage} <b>must</b> not be a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a></li>
            <li>If any element of {@code pRegions} contains ##VkCopyCommandTransformInfoQCOM in its {@code pNext} chain, then the {@code srcImage} <b>must</b> be of type #IMAGE_TYPE_2D, and <b>must</b> not be a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>.</li>
        </ul>

        <ul>
            <li>{@code dstBuffer} <b>must</b> be large enough to contain all buffer locations that are accessed according to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies-buffers-images-addressing">Buffer and Image Addressing</a>, for each element of {@code pRegions}</li>
            <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
            <li>{@code srcImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT usage flag</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain #FORMAT_FEATURE_TRANSFER_SRC_BIT</li>
            <li>If {@code srcImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code srcImage} <b>must</b> have a sample count equal to #SAMPLE_COUNT_1_BIT</li>
            <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code srcImageLayout} <b>must</b> be #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL, #IMAGE_LAYOUT_GENERAL, or #IMAGE_LAYOUT_SHARED_PRESENT_KHR</li>
            <li>The {@code imageSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The <code>imageSubresource.baseArrayLayer imageSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The {@code imageOffset} and {@code imageExtent} members of each element of {@code pRegions} <b>must</b> respect the image transfer granularity requirements of {@code commandBuffer}&#8217;s command pool&#8217;s queue family, as described in ##VkQueueFamilyProperties</li>
            <li>{@code srcImage} <b>must</b> not have been created with {@code flags} containing #IMAGE_CREATE_SUBSAMPLED_BIT_EXT</li>
            <li>For each element of {@code pRegions} not containing ##VkCopyCommandTransformInfoQCOM in its {@code pNext} chain, , {@code imageOffset.x} and <code>(imageExtent.width imageOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code imageSubresource} of {@code srcImage} where this refers to the width of the <em>plane</em> of the image involved in the copy in the case of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a></li>
            <li>For each element of {@code pRegions} not containing ##VkCopyCommandTransformInfoQCOM in its {@code pNext} chain, , {@code imageOffset.y} and <code>(imageExtent.height imageOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code imageSubresource} of {@code srcImage} where this refers to the height of the <em>plane</em> of the image involved in the copy in the case of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a></li>
        </ul>

        <ul>
            <li>If {imageparam} does not have either a depth/stencil or a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, then for each element of {@code pRegions}, {@code bufferOffset} <b>must</b> be a multiple of the format&#8217;s texel block size</li>
            <li>If {imageparam} has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, then for each element of {@code pRegions}, {@code bufferOffset} <b>must</b> be a multiple of the element size of the compatible format for the format and the {@code aspectMask} of the {@code imageSubresource} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-compatible-planes">Compatible formats of planes of multi-planar formats</a></li>
            <li>If {imageparam} is of type #IMAGE_TYPE_1D, then for each element of {@code pRegions}, {@code imageOffset.y} <b>must</b> be 0 and {@code imageExtent.height} <b>must</b> be 1</li>
            <li>For each element of {@code pRegions}, {@code imageOffset.z} and <code>(imageExtent.depth + imageOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code imageSubresource} of {imageparam}</li>
            <li>If {imageparam} is of type #IMAGE_TYPE_1D or #IMAGE_TYPE_2D, then for each element of {@code pRegions}, {@code imageOffset.z} <b>must</b> be 0 and {@code imageExtent.depth} <b>must</b> be 1</li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code bufferRowLength} <b>must</b> be a multiple of the compressed texel block width</li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code bufferImageHeight} <b>must</b> be a multiple of the compressed texel block height</li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, all members of {@code imageOffset} <b>must</b> be a multiple of the corresponding dimensions of the compressed texel block</li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code bufferOffset} <b>must</b> be a multiple of the compressed texel block size in bytes</li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code imageExtent.width} <b>must</b> be a multiple of the compressed texel block width or <code>(imageExtent.width imageOffset.x)</code> <b>must</b> equal the width of the specified {@code imageSubresource} of {imageparam}</li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code imageExtent.height} <b>must</b> be a multiple of the compressed texel block height or <code>(imageExtent.height imageOffset.y)</code> <b>must</b> equal the height of the specified {@code imageSubresource} of {imageparam}</li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code imageExtent.depth} <b>must</b> be a multiple of the compressed texel block depth or <code>(imageExtent.depth imageOffset.z)</code> <b>must</b> equal the depth of the specified {@code imageSubresource} of {imageparam}</li>
            <li>For each element of {@code pRegions}, {@code imageSubresource.aspectMask} <b>must</b> specify aspects present in {imageparam}</li>
            <li>If {imageparam} has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, then for each element of {@code pRegions}, {@code imageSubresource.aspectMask} <b>must</b> be #IMAGE_ASPECT_PLANE_0_BIT, #IMAGE_ASPECT_PLANE_1_BIT, or #IMAGE_ASPECT_PLANE_2_BIT (with #IMAGE_ASPECT_PLANE_2_BIT valid only for image formats with three planes)</li>
            <li>If {imageparam} is of type #IMAGE_TYPE_3D, for each element of {@code pRegions}, {@code imageSubresource.baseArrayLayer} <b>must</b> be 0 and {@code imageSubresource.layerCount} <b>must</b> be 1</li>
            <li>If {imageparam} is not a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code bufferRowLength} multiplied by the texel block size of {imageparam} <b>must</b> be less than or equal to <code>2<sup>31</sup>-1</code></li>
            <li>If {imageparam} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code bufferRowLength} divided by the compressed texel block width and then multiplied by the texel block size of {imageparam} <b>must</b> be less than or equal to <code>2<sup>31</sup>-1</code></li>
            <li>If the queue family used to create the {@code VkCommandPool} which {@code commandBuffer} was allocated from does not support #QUEUE_GRAPHICS_BIT or #QUEUE_COMPUTE_BIT, the {@code bufferOffset} member of any element of {@code pRegions} <b>must</b> be a multiple of 4</li>
            <li>If {imageparam} has a depth/stencil format, the {@code bufferOffset} member of any element of {@code pRegions} <b>must</b> be a multiple of 4</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid ##VkBufferImageCopy2KHR structures</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code dstBuffer}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkBufferImageCopy2KHR, #CmdCopyImageToBuffer2KHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkImage("srcImage", "the source image.")
    VkImageLayout("srcImageLayout", "the layout of the source image subresources for the copy.")
    VkBuffer("dstBuffer", "the destination buffer.")
    AutoSize("pRegions")..uint32_t("regionCount", "the number of regions to copy.")
    VkBufferImageCopy2KHR.const.p("pRegions", "a pointer to an array of ##VkBufferImageCopy2KHR structures specifying the regions to copy.")
}

val VkImageBlit2KHR = struct(Module.VULKAN, "VkImageBlit2KHR") {
    documentation =
        """
        Structure specifying an image blit operation.

        <h5>Description</h5>
        For each element of the {@code pRegions} array, a blit operation is performed for the specified source and destination regions.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code aspectMask} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> match</li>
            <li>The {@code layerCount} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> match</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_BLIT_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkCopyCommandTransformInfoQCOM</li>
            <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
            <li>{@code srcSubresource} <b>must</b> be a valid ##VkImageSubresourceLayers structure</li>
            <li>{@code dstSubresource} <b>must</b> be a valid ##VkImageSubresourceLayers structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkBlitImageInfo2KHR, ##VkImageSubresourceLayers, ##VkOffset3D
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkImageSubresourceLayers("srcSubresource", "the subresource to blit from.")
    VkOffset3D("srcOffsets", "a pointer to an array of two ##VkOffset3D structures specifying the bounds of the source region within {@code srcSubresource}.")[2]
    VkImageSubresourceLayers("dstSubresource", "the subresource to blit into.")
    VkOffset3D("dstOffsets", "a pointer to an array of two ##VkOffset3D structures specifying the bounds of the destination region within {@code dstSubresource}.")[2]
}

val VkBlitImageInfo2KHR = struct(Module.VULKAN, "VkBlitImageInfo2KHR") {
    documentation =
        """
        Structure specifying parameters of blit image command.

        <h5>Valid Usage</h5>
        <ul>
            <li>The source region specified by each element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
            <li>The destination region specified by each element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
            <li>The union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory with any texel that <b>may</b> be sampled during the blit operation</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain #FORMAT_FEATURE_BLIT_SRC_BIT</li>
            <li>{@code srcImage} <b>must</b> not use a format listed in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">Formats requiring sampler Y'C<sub>B</sub>C<sub>R</sub> conversion for #IMAGE_ASPECT_COLOR_BIT image views</a></li>
            <li>{@code srcImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT usage flag</li>
            <li>If {@code srcImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code srcImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code dstImage} <b>must</b> contain #FORMAT_FEATURE_BLIT_DST_BIT</li>
            <li>{@code dstImage} <b>must</b> not use a format listed in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">Formats requiring sampler Y'C<sub>B</sub>C<sub>R</sub> conversion for #IMAGE_ASPECT_COLOR_BIT image views</a></li>
            <li>{@code dstImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code dstImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>If either of {@code srcImage} or {@code dstImage} was created with a signed integer {@code VkFormat}, the other <b>must</b> also have been created with a signed integer {@code VkFormat}</li>
            <li>If either of {@code srcImage} or {@code dstImage} was created with an unsigned integer {@code VkFormat}, the other <b>must</b> also have been created with an unsigned integer {@code VkFormat}</li>
            <li>If either of {@code srcImage} or {@code dstImage} was created with a depth/stencil format, the other <b>must</b> have exactly the same format</li>
            <li>If {@code srcImage} was created with a depth/stencil format, {@code filter} <b>must</b> be #FILTER_NEAREST</li>
            <li>{@code srcImage} <b>must</b> have been created with a {@code samples} value of #SAMPLE_COUNT_1_BIT</li>
            <li>{@code dstImage} <b>must</b> have been created with a {@code samples} value of #SAMPLE_COUNT_1_BIT</li>
            <li>If {@code filter} is #FILTER_LINEAR, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If {@code filter} is #FILTER_CUBIC_EXT, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT</li>
            <li>If {@code filter} is #FILTER_CUBIC_EXT, {@code srcImage} <b>must</b> be of type #IMAGE_TYPE_2D</li>
            <li>The {@code srcSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The {@code dstSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>The <code>srcSubresource.baseArrayLayer srcSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The <code>dstSubresource.baseArrayLayer dstSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>{@code dstImage} and {@code srcImage} <b>must</b> not have been created with {@code flags} containing #IMAGE_CREATE_SUBSAMPLED_BIT_EXT</li>
            <li>If either {@code srcImage} or {@code dstImage} is of type #IMAGE_TYPE_3D, then for each element of {@code pRegions}, {@code srcSubresource.baseArrayLayer} and {@code dstSubresource.baseArrayLayer} <b>must</b> each be 0, and {@code srcSubresource.layerCount} and {@code dstSubresource.layerCount} <b>must</b> each be 1.</li>
            <li>For each element of {@code pRegions}, {@code srcSubresource.aspectMask} <b>must</b> specify aspects present in {@code srcImage}</li>
            <li>For each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> specify aspects present in {@code dstImage}</li>
            <li>For each element of {@code pRegions}, {@code srcOffset}[0].x and {@code srcOffset}[1].x <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code srcSubresource} of {@code srcImage}</li>
            <li>For each element of {@code pRegions}, {@code srcOffset}[0].y and {@code srcOffset}[1].y <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code srcSubresource} of {@code srcImage}</li>
            <li>If {@code srcImage} is of type #IMAGE_TYPE_1D, then for each element of {@code pRegions}, {@code srcOffset}[0].y <b>must</b> be 0 and {@code srcOffset}[1].y <b>must</b> be 1</li>
            <li>For each element of {@code pRegions}, {@code srcOffset}[0].z and {@code srcOffset}[1].z <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code srcSubresource} of {@code srcImage}</li>
            <li>If {@code srcImage} is of type #IMAGE_TYPE_1D or #IMAGE_TYPE_2D, then for each element of {@code pRegions}, {@code srcOffset}[0].z <b>must</b> be 0 and {@code srcOffset}[1].z <b>must</b> be 1</li>
            <li>For each element of {@code pRegions}, {@code dstOffset}[0].x and {@code dstOffset}[1].x <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code dstSubresource} of {@code dstImage}</li>
            <li>For each element of {@code pRegions}, {@code dstOffset}[0].y and {@code dstOffset}[1].y <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code dstSubresource} of {@code dstImage}</li>
            <li>If {@code dstImage} is of type #IMAGE_TYPE_1D, then for each element of {@code pRegions}, {@code dstOffset}[0].y <b>must</b> be 0 and {@code dstOffset}[1].y <b>must</b> be 1</li>
            <li>For each element of {@code pRegions}, {@code dstOffset}[0].z and {@code dstOffset}[1].z <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code dstSubresource} of {@code dstImage}</li>
            <li>If {@code dstImage} is of type #IMAGE_TYPE_1D or #IMAGE_TYPE_2D, then for each element of {@code pRegions}, {@code dstOffset}[0].z <b>must</b> be 0 and {@code dstOffset}[1].z <b>must</b> be 1</li>
            <li>If any element of {@code pRegions} contains ##VkCopyCommandTransformInfoQCOM in its {@code pNext} chain, then {@code srcImage} and {@code dstImage} <b>must</b> not be a block-compressed image.</li>
            <li>If any element of {@code pRegions} contains ##VkCopyCommandTransformInfoQCOM in its {@code pNext} chain, then the {@code srcImage} <b>must</b> be of type #IMAGE_TYPE_2D and <b>must</b> not be a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid ##VkImageBlit2KHR structures</li>
            <li>{@code filter} <b>must</b> be a valid {@code VkFilter} value</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageBlit2KHR, #CmdBlitImage2KHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkImage("srcImage", "the source image.")
    VkImageLayout("srcImageLayout", "the layout of the source image subresources for the blit.")
    VkImage("dstImage", "the destination image.")
    VkImageLayout("dstImageLayout", "the layout of the destination image subresources for the blit.")
    AutoSize("pRegions")..uint32_t("regionCount", "the number of regions to blit.")
    VkImageBlit2KHR.const.p("pRegions", "a pointer to an array of ##VkImageBlit2KHR structures specifying the regions to blit.")
    VkFilter("filter", "a {@code VkFilter} specifying the filter to apply if the blits require scaling.")
}

val VkImageResolve2KHR = struct(Module.VULKAN, "VkImageResolve2KHR") {
    documentation =
        """
        Structure specifying an image resolve operation.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code aspectMask} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> only contain #IMAGE_ASPECT_COLOR_BIT</li>
            <li>The {@code layerCount} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> match</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code srcSubresource} <b>must</b> be a valid ##VkImageSubresourceLayers structure</li>
            <li>{@code dstSubresource} <b>must</b> be a valid ##VkImageSubresourceLayers structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent3D, ##VkImageSubresourceLayers, ##VkOffset3D, ##VkResolveImageInfo2KHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkImageSubresourceLayers("srcSubresource", "{@code srcSubresource} and {@code dstSubresource} are ##VkImageSubresourceLayers structures specifying the image subresources of the images used for the source and destination image data, respectively. Resolve of depth/stencil images is not supported.")
    VkOffset3D("srcOffset", "{@code srcOffset} and {@code dstOffset} select the initial {@code x}, {@code y}, and {@code z} offsets in texels of the sub-regions of the source and destination image data.")
    VkImageSubresourceLayers("dstSubresource", "see {@code srcSubresource}")
    VkOffset3D("dstOffset", "see {@code srcOffset}")
    VkExtent3D("extent", "the size in texels of the source image to resolve in {@code width}, {@code height} and {@code depth}.")
}

val VkResolveImageInfo2KHR = struct(Module.VULKAN, "VkResolveImageInfo2KHR") {
    documentation =
        """
        Structure specifying parameters of resolve image command.

        <h5>Valid Usage</h5>
        <ul>
            <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
            <li>If {@code srcImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code srcImage} <b>must</b> have a sample count equal to any valid sample count value other than #SAMPLE_COUNT_1_BIT</li>
            <li>If {@code dstImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstImage} <b>must</b> have a sample count equal to #SAMPLE_COUNT_1_BIT</li>
            <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code srcImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code dstImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#resources-image-format-features">format features</a> of {@code dstImage} <b>must</b> contain #FORMAT_FEATURE_COLOR_ATTACHMENT_BIT</li>
            <li>{@code srcImage} and {@code dstImage} <b>must</b> have been created with the same image format</li>
            <li>The {@code srcSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The {@code dstSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>The <code>srcSubresource.baseArrayLayer srcSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code srcImage} was created</li>
            <li>The <code>dstSubresource.baseArrayLayer dstSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code dstImage} was created</li>
            <li>{@code dstImage} and {@code srcImage} <b>must</b> not have been created with {@code flags} containing #IMAGE_CREATE_SUBSAMPLED_BIT_EXT</li>
            <li>If either {@code srcImage} or {@code dstImage} are of type #IMAGE_TYPE_3D, then for each element of {@code pRegions}, {@code srcSubresource.baseArrayLayer} <b>must</b> be 0 and {@code srcSubresource.layerCount} <b>must</b> be 1</li>
            <li>If either {@code srcImage} or {@code dstImage} are of type #IMAGE_TYPE_3D, then for each element of {@code pRegions}, {@code dstSubresource.baseArrayLayer} <b>must</b> be 0 and {@code dstSubresource.layerCount} <b>must</b> be 1</li>
            <li>For each element of {@code pRegions}, {@code srcOffset.x} and <code>(extent.width + srcOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code srcSubresource} of {@code srcImage}</li>
            <li>For each element of {@code pRegions}, {@code srcOffset.y} and <code>(extent.height + srcOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code srcSubresource} of {@code srcImage}</li>
            <li>If {@code srcImage} is of type #IMAGE_TYPE_1D, then for each element of {@code pRegions}, {@code srcOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1</li>
            <li>For each element of {@code pRegions}, {@code srcOffset.z} and <code>(extent.depth + srcOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code srcSubresource} of {@code srcImage}</li>
            <li>If {@code srcImage} is of type #IMAGE_TYPE_1D or #IMAGE_TYPE_2D, then for each element of {@code pRegions}, {@code srcOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1</li>
            <li>For each element of {@code pRegions}, {@code dstOffset.x} and <code>(extent.width + dstOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code dstSubresource} of {@code dstImage}</li>
            <li>For each element of {@code pRegions}, {@code dstOffset.y} and <code>(extent.height + dstOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code dstSubresource} of {@code dstImage}</li>
            <li>If {@code dstImage} is of type #IMAGE_TYPE_1D, then for each element of {@code pRegions}, {@code dstOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1</li>
            <li>For each element of {@code pRegions}, {@code dstOffset.z} and <code>(extent.depth + dstOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code dstSubresource} of {@code dstImage}</li>
            <li>If {@code dstImage} is of type #IMAGE_TYPE_1D or #IMAGE_TYPE_2D, then for each element of {@code pRegions}, {@code dstOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid ##VkImageResolve2KHR structures</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageResolve2KHR, #CmdResolveImage2KHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    VkImage("srcImage", "the source image.")
    VkImageLayout("srcImageLayout", "the layout of the source image subresources for the resolve.")
    VkImage("dstImage", "the destination image.")
    VkImageLayout("dstImageLayout", "the layout of the destination image subresources for the resolve.")
    AutoSize("pRegions")..uint32_t("regionCount", "the number of regions to resolve.")
    VkImageResolve2KHR.const.p("pRegions", "a pointer to an array of ##VkImageResolve2KHR structures specifying the regions to resolve.")
}

val VkPhysicalDevice4444FormatsFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDevice4444FormatsFeaturesEXT") {
    documentation =
        """
        Structure describing additional 4444 formats supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("formatA4R4G4B4", """indicates that the implementation <b>must</b> support using a {@code VkFormat} of #FORMAT_A4R4G4B4_UNORM_PACK16_EXT with at least the following {@code VkFormatFeatureFlagBits}:

        <ul>
            <li>#FORMAT_FEATURE_SAMPLED_IMAGE_BIT</li>
            <li>#FORMAT_FEATURE_BLIT_SRC_BIT</li>
            <li>#FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
        </ul>""")
    VkBool32("formatA4B4G4R4", """indicates that the implementation <b>must</b> support using a {@code VkFormat} of #FORMAT_A4B4G4R4_UNORM_PACK16_EXT with at least the following {@code VkFormatFeatureFlagBits}:

        <ul>
            <li>#FORMAT_FEATURE_SAMPLED_IMAGE_BIT</li>
            <li>#FORMAT_FEATURE_BLIT_SRC_BIT</li>
            <li>#FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
        </ul>""")
}

val VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE = struct(Module.VULKAN, "VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE") {
    documentation =
        """
        Structure describing whether the mutable descriptor type is supported.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_VALVE</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("mutableDescriptorType", """indicates that the implementation <b>must</b> support using the {@code VkDescriptorType} of #DESCRIPTOR_TYPE_MUTABLE_VALVE with at least the following descriptor types, where any combination of the types <b>must</b> be supported:

        <ul>
            <li>#DESCRIPTOR_TYPE_SAMPLED_IMAGE</li>
            <li>#DESCRIPTOR_TYPE_STORAGE_IMAGE</li>
            <li>#DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER</li>
            <li>#DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER</li>
            <li>#DESCRIPTOR_TYPE_UNIFORM_BUFFER</li>
            <li>#DESCRIPTOR_TYPE_STORAGE_BUFFER</li>
        </ul>

        Additionally, {@code mutableDescriptorType} indicates that:

        <ul>
            <li>Non-uniform descriptor indexing <b>must</b> be supported if all descriptor types in a ##VkMutableDescriptorTypeListVALVE for #DESCRIPTOR_TYPE_MUTABLE_VALVE have the corresponding non-uniform indexing features enabled in ##VkPhysicalDeviceDescriptorIndexingFeatures.</li>
            <li>#DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT with {@code descriptorType} of #DESCRIPTOR_TYPE_MUTABLE_VALVE relaxes the list of required descriptor types to the descriptor types which have the corresponding update-after-bind feature enabled in ##VkPhysicalDeviceDescriptorIndexingFeatures.</li>
            <li>Dynamically uniform descriptor indexing <b>must</b> be supported if all descriptor types in a ##VkMutableDescriptorTypeListVALVE for #DESCRIPTOR_TYPE_MUTABLE_VALVE have the corresponding dynamic indexing features enabled.</li>
            <li>#DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_VALVE <b>must</b> be supported.</li>
            <li>#DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_VALVE <b>must</b> be supported.</li>
        </ul>""")
}

val VkMutableDescriptorTypeListVALVE = struct(Module.VULKAN, "VkMutableDescriptorTypeListVALVE") {
    documentation =
        """
        Structure describing descriptor types that a given descriptor may mutate to.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code descriptorTypeCount} <b>must</b> not be 0 if the corresponding binding is of #DESCRIPTOR_TYPE_MUTABLE_VALVE</li>
            <li>{@code pDescriptorTypes} <b>must</b> be a valid pointer to an array of {@code descriptorTypeCount} valid, unique {@code VkDescriptorType} values if the given binding is of #DESCRIPTOR_TYPE_MUTABLE_VALVE type</li>
            <li>{@code descriptorTypeCount} <b>must</b> be 0 if the corresponding binding is not of #DESCRIPTOR_TYPE_MUTABLE_VALVE</li>
            <li>{@code pDescriptorTypes} <b>must</b> not contain #DESCRIPTOR_TYPE_MUTABLE_VALVE</li>
            <li>{@code pDescriptorTypes} <b>must</b> not contain #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC</li>
            <li>{@code pDescriptorTypes} <b>must</b> not contain #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC</li>
            <li>{@code pDescriptorTypes} <b>must</b> not contain #DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>If {@code descriptorTypeCount} is not 0, {@code pDescriptorTypes} <b>must</b> be a valid pointer to an array of {@code descriptorTypeCount} valid {@code VkDescriptorType} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkMutableDescriptorTypeCreateInfoVALVE
        """

    AutoSize("pDescriptorTypes", optional = true)..uint32_t("descriptorTypeCount", "the number of elements in {@code pDescriptorTypes}.")
    VkDescriptorType.const.p("pDescriptorTypes", "{@code NULL} or a pointer to an array of {@code descriptorTypeCount} {@code VkDescriptorType} values which define which descriptor types a given binding may mutate to.")
}

val VkMutableDescriptorTypeCreateInfoVALVE = struct(Module.VULKAN, "VkMutableDescriptorTypeCreateInfoVALVE") {
    documentation =
        """
        Structure describing the list of possible active descriptor types for mutable type descriptors.

        <h5>Description</h5>
        If {@code mutableDescriptorTypeListCount} is zero or if this structure is not included in the {@code pNext} chain, the ##VkMutableDescriptorTypeListVALVE for each element is considered to be zero or {@code NULL} for each member. Otherwise, the descriptor set layout binding at ##VkDescriptorSetLayoutCreateInfo{@code ::pBindings}[i] uses the descriptor type lists in ##VkMutableDescriptorTypeCreateInfoVALVE{@code ::pMutableDescriptorTypeLists}[i].

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_VALVE</li>
            <li>If {@code mutableDescriptorTypeListCount} is not 0, {@code pMutableDescriptorTypeLists} <b>must</b> be a valid pointer to an array of {@code mutableDescriptorTypeListCount} valid ##VkMutableDescriptorTypeListVALVE structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkMutableDescriptorTypeListVALVE
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to a structure extending this structure.")
    AutoSize("pMutableDescriptorTypeLists", optional = true)..uint32_t("mutableDescriptorTypeListCount", "the number of elements in {@code pMutableDescriptorTypeLists}.")
    VkMutableDescriptorTypeListVALVE.const.p("pMutableDescriptorTypeLists", "a pointer to an array of ##VkMutableDescriptorTypeListVALVE structures.")
}