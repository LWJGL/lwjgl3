/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan

import org.lwjgl.generator.*
//import core.android.*
import core.linux.*
import core.windows.*

// Handle types
val VkSurfaceKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSurfaceKHR")
val VkSwapchainKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSwapchainKHR")
val VkDisplayKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDisplayKHR")
val VkDisplayModeKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDisplayModeKHR")
val VkDebugReportCallbackEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDebugReportCallbackEXT")
val VkDescriptorUpdateTemplateKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDescriptorUpdateTemplateKHR")
val VkObjectTableNVX = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkObjectTableNVX")
val VkIndirectCommandsLayoutNVX = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkIndirectCommandsLayoutNVX")
val VkDebugUtilsMessengerEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDebugUtilsMessengerEXT")
val VkSamplerYcbcrConversionKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSamplerYcbcrConversionKHR")
val VkValidationCacheEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkValidationCacheEXT")
val VkAccelerationStructureNV = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkAccelerationStructureNV")

// Enum types
val VkSurfaceTransformFlagBitsKHR = "VkSurfaceTransformFlagBitsKHR".enumType
val VkColorSpaceKHR = "VkColorSpaceKHR".enumType
val VkPresentModeKHR = "VkPresentModeKHR".enumType
val VkCompositeAlphaFlagBitsKHR = "VkCompositeAlphaFlagBitsKHR".enumType
val VkDeviceGroupPresentModeFlagBitsKHR = "VkDeviceGroupPresentModeFlagBitsKHR".enumType
val VkDisplayPlaneAlphaFlagBitsKHR = "VkDisplayPlaneAlphaFlagBitsKHR".enumType
val VkDebugReportObjectTypeEXT = "VkDebugReportObjectTypeEXT".enumType
val VkRasterizationOrderAMD = "VkRasterizationOrderAMD".enumType
val VkShaderInfoTypeAMD = "VkShaderInfoTypeAMD".enumType
val VkExternalMemoryHandleTypeFlagBitsNV = "VkExternalMemoryHandleTypeFlagBitsNV".enumType
val VkExternalMemoryFeatureFlagBitsNV = "VkExternalMemoryFeatureFlagBitsNV".enumType
val VkValidationCheckEXT = "VkValidationCheckEXT".enumType
val VkConditionalRenderingFlagBitsEXT = "VkConditionalRenderingFlagBitsEXT".enumType
val VkIndirectCommandsLayoutUsageFlagBitsNVX = "VkIndirectCommandsLayoutUsageFlagBitsNVX".enumType
val VkIndirectCommandsTokenTypeNVX = "VkIndirectCommandsTokenTypeNVX".enumType
val VkObjectEntryUsageFlagBitsNVX = "VkObjectEntryUsageFlagBitsNVX".enumType
val VkObjectEntryTypeNVX = "VkObjectEntryTypeNVX".enumType
val VkSurfaceCounterFlagBitsEXT = "VkSurfaceCounterFlagBitsEXT".enumType
val VkDisplayPowerStateEXT = "VkDisplayPowerStateEXT".enumType
val VkDeviceEventTypeEXT = "VkDeviceEventTypeEXT".enumType
val VkDisplayEventTypeEXT = "VkDisplayEventTypeEXT".enumType
val VkViewportCoordinateSwizzleNV = "VkViewportCoordinateSwizzleNV".enumType
val VkDiscardRectangleModeEXT = "VkDiscardRectangleModeEXT".enumType
val VkConservativeRasterizationModeEXT = "VkConservativeRasterizationModeEXT".enumType
val VkDebugUtilsMessageSeverityFlagBitsEXT = "VkDebugUtilsMessageSeverityFlagBitsEXT".enumType
val VkSamplerReductionModeEXT = "VkSamplerReductionModeEXT".enumType
val VkBlendOverlapEXT = "VkBlendOverlapEXT".enumType
val VkCoverageModulationModeNV = "VkCoverageModulationModeNV".enumType
val VkValidationCacheHeaderVersionEXT = "VkValidationCacheHeaderVersionEXT".enumType
val VkShadingRatePaletteEntryNV = "VkShadingRatePaletteEntryNV".enumType
val VkCoarseSampleOrderTypeNV = "VkCoarseSampleOrderTypeNV".enumType
val VkRayTracingShaderGroupTypeNV = "VkRayTracingShaderGroupTypeNV".enumType
val VkGeometryTypeNV = "VkGeometryTypeNV".enumType
val VkGeometryFlagBitsNV = "VkGeometryFlagBitsNV".enumType
val VkGeometryInstanceFlagBitsNV = "VkGeometryInstanceFlagBitsNV".enumType
val VkAccelerationStructureTypeNV = "VkAccelerationStructureTypeNV".enumType
val VkBuildAccelerationStructureFlagBitsNV = "VkBuildAccelerationStructureFlagBitsNV".enumType
val VkCopyAccelerationStructureModeNV = "VkCopyAccelerationStructureModeNV".enumType
val VkAccelerationStructureMemoryRequirementsTypeNV = "VkAccelerationStructureMemoryRequirementsTypeNV".enumType
val VkQueueGlobalPriorityEXT = "VkQueueGlobalPriorityEXT".enumType
val VkTimeDomainEXT = "VkTimeDomainEXT".enumType
val VkMemoryOverallocationBehaviorAMD = "VkMemoryOverallocationBehaviorAMD".enumType
val VkDriverIdKHR = "VkDriverIdKHR".enumType

// Bitmask types
val VkSurfaceTransformFlagsKHR = typedef(VkFlags, "VkSurfaceTransformFlagsKHR")
val VkCompositeAlphaFlagsKHR = typedef(VkFlags, "VkCompositeAlphaFlagsKHR")
val VkSwapchainCreateFlagsKHR = typedef(VkFlags, "VkSwapchainCreateFlagsKHR")
val VkDeviceGroupPresentModeFlagsKHR = typedef(VkFlags, "VkDeviceGroupPresentModeFlagsKHR")
val VkDisplayPlaneAlphaFlagsKHR = typedef(VkFlags, "VkDisplayPlaneAlphaFlagsKHR")
val VkDisplayModeCreateFlagsKHR = typedef(VkFlags, "VkDisplayModeCreateFlagsKHR")
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
val VkIndirectCommandsLayoutUsageFlagsNVX = typedef(VkFlags, "VkIndirectCommandsLayoutUsageFlagsNVX")
val VkObjectEntryUsageFlagsNVX = typedef(VkFlags, "VkObjectEntryUsageFlagsNVX")
val VkSurfaceCounterFlagsEXT = typedef(VkFlags, "VkSurfaceCounterFlagsEXT")
val VkPipelineViewportSwizzleStateCreateFlagsNV = typedef(VkFlags, "VkPipelineViewportSwizzleStateCreateFlagsNV")
val VkPipelineDiscardRectangleStateCreateFlagsEXT = typedef(VkFlags, "VkPipelineDiscardRectangleStateCreateFlagsEXT")
val VkPipelineRasterizationConservativeStateCreateFlagsEXT = typedef(VkFlags, "VkPipelineRasterizationConservativeStateCreateFlagsEXT")
val VkExternalFenceHandleTypeFlagsKHR = typedef(VkFlags, "VkExternalFenceHandleTypeFlagsKHR")
val VkExternalFenceFeatureFlagsKHR = typedef(VkFlags, "VkExternalFenceFeatureFlagsKHR")
val VkFenceImportFlagsKHR = typedef(VkFlags, "VkFenceImportFlagsKHR")
val VkMacOSSurfaceCreateFlagsMVK = typedef(VkFlags, "VkMacOSSurfaceCreateFlagsMVK")
val VkDebugUtilsMessengerCallbackDataFlagsEXT = typedef(VkFlags, "VkDebugUtilsMessengerCallbackDataFlagsEXT")
val VkDebugUtilsMessengerCreateFlagsEXT = typedef(VkFlags, "VkDebugUtilsMessengerCreateFlagsEXT")
val VkDebugUtilsMessageSeverityFlagsEXT = typedef(VkFlags, "VkDebugUtilsMessageSeverityFlagsEXT")
val VkDebugUtilsMessageTypeFlagsEXT = typedef(VkFlags, "VkDebugUtilsMessageTypeFlagsEXT")
val VkPipelineCoverageToColorStateCreateFlagsNV = typedef(VkFlags, "VkPipelineCoverageToColorStateCreateFlagsNV")
val VkPipelineCoverageModulationStateCreateFlagsNV = typedef(VkFlags, "VkPipelineCoverageModulationStateCreateFlagsNV")
val VkValidationCacheCreateFlagsEXT = typedef(VkFlags, "VkValidationCacheCreateFlagsEXT")
val VkDescriptorBindingFlagsEXT = typedef(VkFlags, "VkDescriptorBindingFlagsEXT")
val VkGeometryFlagsNV = typedef(VkFlags, "VkGeometryFlagsNV")
val VkGeometryInstanceFlagsNV = typedef(VkFlags, "VkGeometryInstanceFlagsNV")
val VkBuildAccelerationStructureFlagsNV = typedef(VkFlags, "VkBuildAccelerationStructureFlagsNV")

// Function pointer types
val PFN_vkDebugReportCallbackEXT = Module.VULKAN.callback {
    VkBool32(
        "VkDebugReportCallbackEXT",
        "Application-defined debug report callback function.",

        VkDebugReportFlagsEXT("flags", "specifies the {@code VkDebugReportFlagBitsEXT} that triggered this callback."),
        VkDebugReportObjectTypeEXT("objectType", "a {@code VkDebugReportObjectTypeEXT} value specifying the type of object being used or created at the time the event was triggered."),
        uint64_t("object", "the object where the issue was detected. If {@code objectType} is #DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT, {@code object} is undefined."),
        size_t("location", "a component (layer, driver, loader) defined value that specifies the <em>location</em> of the trigger. This is an optional: value."),
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

        {@code object} <b>must</b> be a Vulkan object or #NULL_HANDLE. If {@code objectType} is not #DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT and {@code object} is not #NULL_HANDLE, {@code object} <b>must</b> be a Vulkan object of the corresponding type associated with {@code objectType} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#debug-report-object-types">the “{@code VkDebugReportObjectTypeEXT} and Vulkan Handle Relationship” table</a>.

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
        The callback <b>must</b> not call #DestroyDebugUtilsMessengerEXT().

        The callback returns a {@code VkBool32}, which is interpreted in a layer-specified manner. The application <b>should</b> always return #FALSE. The #TRUE value is reserved for use in layer development.

        <h5>See Also</h5>
        ##VkDebugUtilsMessengerCreateInfoEXT
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

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR</li>
            <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of ##VkDeviceGroupSwapchainCreateInfoKHR, ##VkImageFormatListCreateInfoKHR, or ##VkSwapchainCounterCreateInfoEXT</li>
            <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkSwapchainCreateFlagBitsKHR} values</li>
            <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
            <li>{@code imageFormat} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code imageColorSpace} <b>must</b> be a valid {@code VkColorSpaceKHR} value</li>
            <li>{@code imageUsage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
            <li>{@code imageUsage} <b>must</b> not be 0</li>
            <li>{@code imageSharingMode} <b>must</b> be a valid {@code VkSharingMode} value</li>
            <li>{@code preTransform} <b>must</b> be a valid {@code VkSurfaceTransformFlagBitsKHR} value</li>
            <li>{@code compositeAlpha} <b>must</b> be a valid {@code VkCompositeAlphaFlagBitsKHR} value</li>
            <li>{@code presentMode} <b>must</b> be a valid {@code VkPresentModeKHR} value</li>
            <li>If {@code oldSwapchain} is not #NULL_HANDLE, {@code oldSwapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>If {@code oldSwapchain} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code surface}</li>
            <li>Both of {@code oldSwapchain}, and {@code surface} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent2D, #CreateSharedSwapchainsKHR(), #CreateSwapchainKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    uint32_t.const.p("pQueueFamilyIndices", "an array of queue family indices having access to the images(s) of the swapchain when {@code imageSharingMode} is #SHARING_MODE_CONCURRENT.")
    VkSurfaceTransformFlagBitsKHR("preTransform", "a {@code VkSurfaceTransformFlagBitsKHR} value describing the transform, relative to the presentation engine&#8217;s natural orientation, applied to the image content prior to presentation. If it does not match the {@code currentTransform} value returned by {@code vkGetPhysicalDeviceSurfaceCapabilitiesKHR}, the presentation engine will transform the image content as part of the presentation operation.")
    VkCompositeAlphaFlagBitsKHR("compositeAlpha", "a {@code VkCompositeAlphaFlagBitsKHR} value indicating the alpha compositing mode to use when this surface is composited together with other surfaces on certain window systems.")
    VkPresentModeKHR("presentMode", "the presentation mode the swapchain will use. A swapchain&#8217;s present mode determines how incoming present requests will be processed and queued internally.")
    VkBool32("clipped", """specifies whether the Vulkan implementation is allowed to discard rendering operations that affect regions of the surface that are not visible.

        <ul>
            <li>If set to #TRUE, the presentable images associated with the swapchain <b>may</b> not own all of their pixels. Pixels in the presentable images that correspond to regions of the target surface obscured by another window on the desktop, or subject to some other clipping mechanism will have undefined content when read back. Pixel shaders <b>may</b> not execute for these pixels, and thus any side effects they would have had will not occur. #TRUE value does not guarantee any clipping will occur, but allows more optimal presentation methods to be used on some platforms.</li>
            <li>
                If set to #FALSE, presentable images associated with the swapchain will own all of the pixels they contain.
                <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>should</b> set this value to #TRUE if they do not expect to read back the content of presentable images before presenting them or after reacquiring them, and if their pixel shaders do not have any side effects that require them to run for all pixels in the presentable image.
                </div>
            </li>
        </ul>""")
    VkSwapchainKHR("oldSwapchain", """#NULL_HANDLE, or the existing non-retired swapchain currently associated with {@code surface}. Providing a valid {@code oldSwapchain} <b>may</b> aid in the resource reuse, and also allows the application to still present any images that are already acquired from it.

        Upon calling {@code vkCreateSwapchainKHR} with an {@code oldSwapchain} that is not #NULL_HANDLE, {@code oldSwapchain} is retired -- even if creation of the new swapchain fails. The new swapchain is created in the non-retired state whether or not {@code oldSwapchain} is #NULL_HANDLE.

        Upon calling {@code vkCreateSwapchainKHR} with an {@code oldSwapchain} that is not #NULL_HANDLE, any images from {@code oldSwapchain} that are not acquired by the application <b>may</b> be freed by the implementation, which <b>may</b> occur even if creation of the new swapchain fails. The application <b>can</b> destroy {@code oldSwapchain} to free all memory associated with {@code oldSwapchain}.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Multiple retired swapchains <b>can</b> be associated with the same {@code VkSurfaceKHR} through multiple uses of {@code oldSwapchain} that outnumber calls to #DestroySwapchainKHR().

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
            <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
            <li>If {@code waitSemaphoreCount} is not 0, {@code pWaitSemaphores} <b>must</b> be a valid pointer to an array of {@code waitSemaphoreCount} valid {@code VkSemaphore} handles</li>
            <li>{@code pSwapchains} <b>must</b> be a valid pointer to an array of {@code swapchainCount} valid {@code VkSwapchainKHR} handles</li>
            <li>{@code pImageIndices} <b>must</b> be a valid pointer to an array of {@code swapchainCount} {@code uint32_t} values</li>
            <li>If {@code pResults} is not {@code NULL}, {@code pResults} <b>must</b> be a valid pointer to an array of {@code swapchainCount} {@code VkResult} values</li>
            <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
            <li>Both of the elements of {@code pSwapchains}, and the elements of {@code pWaitSemaphores} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>See Also</h5>
        #QueuePresentKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pWaitSemaphores", optional = true)..uint32_t("waitSemaphoreCount", "the number of semaphores to wait for before issuing the present request. The number <b>may</b> be zero.")
    VkSemaphore.const.p("pWaitSemaphores", "if not {@code NULL}, is an array of {@code VkSemaphore} objects with {@code waitSemaphoreCount} entries, and specifies the semaphores to wait for before issuing the present request.")
    AutoSize("pSwapchains", "pImageIndices", "pResults")..uint32_t("swapchainCount", "the number of swapchains being presented to by this command.")
    VkSwapchainKHR.const.p("pSwapchains", "an array of {@code VkSwapchainKHR} objects with {@code swapchainCount} entries. A given swapchain <b>must</b> not appear in this list more than once.")
    uint32_t.const.p("pImageIndices", "an array of indices into the array of each swapchain&#8217;s presentable images, with {@code swapchainCount} entries. Each entry in this array identifies the image to present on the corresponding entry in the {@code pSwapchains} array.")
    nullable..VkResult.p("pResults", "an array of {@code VkResult} typed elements with {@code swapchainCount} entries. Applications that do not need per-swapchain results <b>can</b> use {@code NULL} for {@code pResults}. If non-{@code NULL}, each entry in {@code pResults} will be set to the {@code VkResult} for presenting the swapchain corresponding to the same index in {@code pSwapchains}.")
}

val VkImageSwapchainCreateInfoKHR = struct(Module.VULKAN, "VkImageSwapchainCreateInfoKHR") {
    documentation =
        """
        Specify that an image will be bound to swapchain memory.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code swapchain} is not #NULL_HANDLE, the fields of ##VkImageCreateInfo <b>must</b> match the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#swapchain-wsi-image-create-info">implied image creation parameters</a> of the swapchain</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR</li>
            <li>If {@code swapchain} is not #NULL_HANDLE, {@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>{@code semaphore} and {@code fence} <b>must</b> not both be equal to #NULL_HANDLE.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>If {@code semaphore} is not #NULL_HANDLE, {@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>Each of {@code fence}, {@code semaphore}, and {@code swapchain} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    uint32_t("presentMask", "an array of masks, where the mask at element <code>i</code> is non-zero if physical device <code>i</code> has a presentation engine, and where bit <code>j</code> is set in element <code>i</code> if physical device <code>i</code> <b>can</b> present swapchain images from physical device <code>j</code>. If element <code>i</code> is non-zero, then bit <code>i</code> <b>must</b> be set.")["VK_MAX_DEVICE_GROUP_SIZE"]
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
            <li>If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR, then each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and some physical device in the logical device <b>must</b> include that bit in its ##VkDeviceGroupPresentCapabilitiesKHR{@code ::presentMask}.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pDeviceMasks", optional = true)..uint32_t("swapchainCount", "zero or the number of elements in {@code pDeviceMasks}.")
    uint32_t.const.p("pDeviceMasks", "an array of device masks, one for each element of ##VkPresentInfoKHR::pSwapchains.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDeviceGroupPresentModeFlagsKHR("modes", "a bitfield of modes that the swapchain <b>can</b> be used with.")
}

val VkDisplayPropertiesKHR = struct(Module.VULKAN, "VkDisplayPropertiesKHR", mutable = false) {
    documentation =
        """
        Structure describing an available display device.
        """

    VkDisplayKHR("display", "a handle that is used to refer to the display described here. This handle will be valid for the lifetime of the Vulkan instance.")
    charUTF8.const.p("displayName", "a pointer to a NULL-terminated string containing the name of the display. Generally, this will be the name provided by the display&#8217;s EDID. It <b>can</b> be {@code NULL} if no suitable name is available. If not {@code NULL}, the memory it points to <b>must</b> remain accessible as long as {@code display} is valid.")
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

val VkDisplayModePropertiesKHR = struct(Module.VULKAN, "VkDisplayModePropertiesKHR", mutable = false) {
    documentation =
        """
        Structure describing display mode properties.
        """

    VkDisplayModeKHR("displayMode", "a handle to the display mode described in this structure. This handle will be valid for the lifetime of the Vulkan instance.")
    VkDisplayModeParametersKHR("parameters", "a ##VkDisplayModeParametersKHR structure describing the display parameters associated with {@code displayMode}.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDisplayModeCreateFlagsKHR("flags", "reserved for future use, and <b>must</b> be zero.")
    VkDisplayModeParametersKHR("parameters", "a ##VkDisplayModeParametersKHR structure describing the display parameters to use in creating the new mode. If the parameters are not compatible with the specified display, the implementation <b>must</b> return #ERROR_INITIALIZATION_FAILED.")
}

val VkDisplayPlaneCapabilitiesKHR = struct(Module.VULKAN, "VkDisplayPlaneCapabilitiesKHR", mutable = false) {
    documentation =
        """
        Structure describing capabilities of a mode and plane combination.

        <h5>Description</h5>
        The minimum and maximum position and extent fields describe the implementation limits, if any, as they apply to the specified display mode and plane. Vendors <b>may</b> support displaying a subset of a swapchain's presentable images on the specified display plane. This is expressed by returning {@code minSrcPosition}, {@code maxSrcPosition}, {@code minSrcExtent}, and {@code maxSrcExtent} values that indicate a range of possible positions and sizes <b>may</b> be used to specify the region within the presentable images that source pixels will be read from when creating a swapchain on the specified display mode and plane.

        Vendors <b>may</b> also support mapping the presentable images`' content to a subset or superset of the visible region in the specified display mode. This is expressed by returning {@code minDstPosition}, {@code maxDstPosition}, {@code minDstExtent} and {@code maxDstExtent} values that indicate a range of possible positions and sizes <b>may</b> be used to describe the region within the display mode that the source pixels will be mapped to.

        Other vendors <b>may</b> support only a 1-1 mapping between pixels in the presentable images and the display mode. This <b>may</b> be indicated by returning <code>(0,0)</code> for {@code minSrcPosition}, {@code maxSrcPosition}, {@code minDstPosition}, and {@code maxDstPosition}, and (display mode width, display mode height) for {@code minSrcExtent}, {@code maxSrcExtent}, {@code minDstExtent}, and {@code maxDstExtent}.

        These values indicate the limits of the implementation's individual fields. Not all combinations of values within the offset and extent ranges returned in ##VkDisplayPlaneCapabilitiesKHR are guaranteed to be supported. Vendors <b>may</b> still fail presentation requests that specify unsupported combinations.

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
            <li>{@code alphaMode} <b>must</b> be 0 or one of the bits present in the {@code supportedAlpha} member of ##VkDisplayPlaneCapabilitiesKHR returned by {@code vkGetDisplayPlaneCapabilitiesKHR} for the display plane corresponding to {@code displayMode}</li>
            <li>The {@code width} and {@code height} members of {@code imageExtent} <b>must</b> be less than the {@code maxImageDimensions2D} member of ##VkPhysicalDeviceLimits</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>{@code dpy} <b>must</b> point to a valid Xlib {@code Display}.</li>
            <li>{@code window} <b>must</b> be a valid Xlib {@code Window}.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>{@code display} <b>must</b> point to a valid Wayland {@code wl_display}.</li>
            <li>{@code surface} <b>must</b> point to a valid Wayland {@code wl_surface}.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>{@code hinstance} <b>must</b> be a valid Win32 {@code HINSTANCE}.</li>
            <li>{@code hwnd} <b>must</b> be a valid Win32 {@code HWND}.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkWin32SurfaceCreateFlagsKHR("flags", "reserved for future use.")
    HINSTANCE("hinstance", "{@code hinstance} and {@code hwnd} are the Win32 {@code HINSTANCE} and {@code HWND} for the window to associate the surface with.")
    HWND("hwnd", "see {@code hinstance}")
}

val VkDebugReportCallbackCreateInfoEXT = struct(Module.VULKAN, "VkDebugReportCallbackCreateInfoEXT") {
    documentation =
        """
        Structure specifying parameters of a newly created debug report callback.

        <h5>Description</h5>
        For each {@code VkDebugReportCallbackEXT} that is created the ##VkDebugReportCallbackCreateInfoEXT{@code ::flags} determine when that ##VkDebugReportCallbackCreateInfoEXT{@code ::pfnCallback} is called. When an event happens, the implementation will do a bitwise AND of the event's {@code VkDebugReportFlagBitsEXT} flags to each {@code VkDebugReportCallbackEXT} object's flags. For each non-zero result the corresponding callback will be called. The callback will come directly from the component that detected the event, unless some other layer intercepts the calls for its own purposes (filter them in a different way, log to a system error log, etc.).

        An application <b>may</b> receive multiple callbacks if multiple {@code VkDebugReportCallbackEXT} objects were created. A callback will always be executed in the same thread as the originating Vulkan call.

        A callback may be called from multiple threads simultaneously (if the application is making Vulkan calls from multiple threads).

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pfnCallback} <b>must</b> be a valid ##VkDebugReportCallbackEXT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkDebugReportFlagBitsEXT} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkDebugReportCallbackEXT, #CreateDebugReportCallbackEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>{@code object} <b>must</b> be a Vulkan object of the type associated with {@code objectType} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#debug-report-object-types">the “{@code VkDebugReportObjectTypeEXT} and Vulkan Handle Relationship” table</a>.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>{@code object} <b>must</b> be a Vulkan object of the type associated with {@code objectType} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#debug-report-object-types">the “{@code VkDebugReportObjectTypeEXT} and Vulkan Handle Relationship” table</a>.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDebugReportObjectTypeEXT("objectType", "a {@code VkDebugReportObjectTypeEXT} specifying the type of the object to be named.")
    uint64_t("object", "the object to be tagged.")
    uint64_t("tagName", "a numerical identifier of the tag.")
    AutoSize("pTag")..size_t("tagSize", "the number of bytes of data to attach to the object.")
    void.const.p("pTag", "an array of {@code tagSize} bytes containing the data to be associated with the object.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    charUTF8.const.p("pMarkerName", "a pointer to a null-terminated UTF-8 string that contains the name of the marker.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>If {@code image} is not #NULL_HANDLE and ##VkMemoryAllocateInfo defines a memory import operation, the memory being imported <b>must</b> also be a dedicated image allocation and {@code image} <b>must</b> be identical to the image associated with the imported memory.</li>
            <li>If {@code buffer} is not #NULL_HANDLE and ##VkMemoryAllocateInfo defines a memory import operation, the memory being imported <b>must</b> also be a dedicated buffer allocation and {@code buffer} <b>must</b> be identical to the buffer associated with the imported memory.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV</li>
            <li>If {@code image} is not #NULL_HANDLE, {@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>If {@code buffer} is not #NULL_HANDLE, {@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>Both of {@code buffer}, and {@code image} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkImage("image", "#NULL_HANDLE or a handle of an image which this memory will be bound to.")
    VkBuffer("buffer", "#NULL_HANDLE or a handle of a buffer which this memory will be bound to.")
}

val VkPhysicalDeviceTransformFeedbackFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceTransformFeedbackFeaturesEXT") {
    documentation =
        """
        Structure describing transform feedback features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceTransformFeedbackFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2KHR, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceTransformFeedbackFeaturesEXT <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineRasterizationStateStreamCreateFlagsEXT("flags", "reserved for future use.")
    uint32_t("rasterizationStream", "the vertex stream selected for rasterization.")
}

val VkTextureLODGatherFormatPropertiesAMD = struct(Module.VULKAN, "VkTextureLODGatherFormatPropertiesAMD", mutable = false) {
    documentation =
        """
        Structure informing whether or not texture gather bias/LOD functionality is supported for a given image format and a given physical device.
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL}.").mutable()
    VkBool32("supportsTextureGatherLODBiasAMD", "tells if the image format can be used with texture gather bias/LOD functions, as introduced by the {@link AMDTextureGatherBiasLod VK_AMD_texture_gather_bias_lod} extension. This field is set by the implementation. User-specified value is ignored.")
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
    VkShaderResourceUsageAMD("resourceUsage", "an instance of ##VkShaderResourceUsageAMD describing internal physical device resources used by this shader.")
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
        If the ##VkPhysicalDeviceCornerSampledImageFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2KHR, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceCornerSampledImageFeaturesNV <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_CORNER_SAMPLED_IMAGE_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("cornerSampledImage", "specifies whether images can be created with a ##VkImageCreateInfo{@code ::flags} containing #IMAGE_CREATE_CORNER_SAMPLED_BIT_NV. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#resources-images-corner-sampled\">Corner-Sampled Images</a>.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagsNV("handleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} specifying one or more external memory handle types.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>{@code handleType} <b>must</b> not have more than one bit set.</li>
            <li>{@code handle} <b>must</b> be a valid handle to memory, obtained as specified by {@code handleType}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV</li>
            <li>{@code handleType} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagsNV("handleType", "0 or a {@code VkExternalMemoryHandleTypeFlagBitsNV} value specifying the type of memory handle in {@code handle}.")
    HANDLE("handle", "a Windows {@code HANDLE} referring to the memory.")
}

val VkExportMemoryWin32HandleInfoNV = struct(Module.VULKAN, "VkExportMemoryWin32HandleInfoNV") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        specify security attributes and access rights for Win32 memory handles.

        <h5>Description</h5>
        If this structure is not present, or if {@code pAttributes} is set to {@code NULL}, default security descriptor values will be used, and child processes created by the application will not inherit the handle, as described in the MSDN documentation for "{@code Synchronization Object Security and Access Rights}"[1]. Further, if the structure is not present, the access rights will be

        DXGI_SHARED_RESOURCE_READ | DXGI_SHARED_RESOURCE_WRITE

        [1] https://msdn.microsoft.com/en-us/library/windows/desktop/ms686670.aspx

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV</li>
            <li>If {@code pAttributes} is not {@code NULL}, {@code pAttributes} <b>must</b> be a valid pointer to a valid {@code SECURITY_ATTRIBUTES} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>Both of the elements of {@code pAcquireSyncs}, and the elements of {@code pReleaseSyncs} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_const_p("pNext", "")
    AutoSize("pAcquireSyncs", "pAcquireKeys", "pAcquireTimeoutMilliseconds", optional = true)..uint32_t("acquireCount", "the number of entries in the {@code pAcquireSyncs}, {@code pAcquireKeys}, and {@code pAcquireTimeoutMilliseconds} arrays.")
    VkDeviceMemory.const.p("pAcquireSyncs", "a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources.")
    uint64_t.const.p("pAcquireKeys", "a pointer to an array of mutex key values to wait for prior to beginning the submitted work. Entries refer to the keyed mutex associated with the corresponding entries in {@code pAcquireSyncs}.")
    uint32_t.const.p("pAcquireTimeoutMilliseconds", "an array of timeout values, in millisecond units, for each acquire specified in {@code pAcquireKeys}.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pDisabledValidationChecks")..uint32_t("disabledValidationCheckCount", "the number of checks to disable.")
    VkValidationCheckEXT.const.p("pDisabledValidationChecks", "a pointer to an array of {@code VkValidationCheckEXT} values specifying the validation checks to be disabled.")
}

val VkImageViewASTCDecodeModeEXT = struct(Module.VULKAN, "VkImageViewASTCDecodeModeEXT") {
    documentation =
        """
        Structure describing the ASTC decode mode for an image view.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code decodeMode} <b>must</b> be one of #FORMAT_R16G16B16A16_SFLOAT, #FORMAT_R8G8B8A8_UNORM, or #FORMAT_E5B9G9R9_UFLOAT_PACK32</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-features-astc-decodeModeSharedExponent">decodeModeSharedExponent</a> feature is not enabled, {@code decodeMode} <b>must</b> not be #FORMAT_E5B9G9R9_UFLOAT_PACK32</li>
            <li>If {@code decodeMode} is #FORMAT_R8G8B8A8_UNORM the image view <b>must</b> not include blocks using any of the ASTC HDR modes</li>
            <li>{@code format} of the image view <b>must</b> be one of #FORMAT_ASTC_4x4_UNORM_BLOCK, #FORMAT_ASTC_4x4_SRGB_BLOCK, #FORMAT_ASTC_5x4_UNORM_BLOCK, #FORMAT_ASTC_5x4_SRGB_BLOCK, #FORMAT_ASTC_5x5_UNORM_BLOCK, #FORMAT_ASTC_5x5_SRGB_BLOCK, #FORMAT_ASTC_6x5_UNORM_BLOCK, #FORMAT_ASTC_6x5_SRGB_BLOCK, #FORMAT_ASTC_6x6_UNORM_BLOCK, #FORMAT_ASTC_6x6_SRGB_BLOCK, #FORMAT_ASTC_8x5_UNORM_BLOCK, #FORMAT_ASTC_8x5_SRGB_BLOCK, #FORMAT_ASTC_8x6_UNORM_BLOCK, #FORMAT_ASTC_8x6_SRGB_BLOCK, #FORMAT_ASTC_8x8_UNORM_BLOCK, #FORMAT_ASTC_8x8_SRGB_BLOCK, #FORMAT_ASTC_10x5_UNORM_BLOCK, #FORMAT_ASTC_10x5_SRGB_BLOCK, #FORMAT_ASTC_10x6_UNORM_BLOCK, #FORMAT_ASTC_10x6_SRGB_BLOCK, #FORMAT_ASTC_10x8_UNORM_BLOCK, #FORMAT_ASTC_10x8_SRGB_BLOCK, #FORMAT_ASTC_10x10_UNORM_BLOCK, #FORMAT_ASTC_10x10_SRGB_BLOCK, #FORMAT_ASTC_12x10_UNORM_BLOCK, #FORMAT_ASTC_12x10_SRGB_BLOCK, #FORMAT_ASTC_12x12_UNORM_BLOCK, or #FORMAT_ASTC_12x12_SRGB_BLOCK</li>
        </ul>

        If {@code format} uses sRGB encoding then the {@code decodeMode} has no effect.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT</li>
            <li>{@code decodeMode} <b>must</b> be a valid {@code VkFormat} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkFormat("decodeMode", "the intermediate format used to decode ASTC compressed formats.")
}

val VkPhysicalDeviceASTCDecodeFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceASTCDecodeFeaturesEXT") {
    documentation =
        """
        Structure describing ASTC decode mode features.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceASTCDecodeFeaturesEXT structure is included in the {@code pNext} chain of #GetPhysicalDeviceFeatures2KHR(), it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceASTCDecodeFeaturesEXT <b>can</b> also be used in the {@code pNext} chain of #CreateDevice() to enable features.

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
        Importing memory objects from Windows handles does not transfer ownership of the handle to the Vulkan implementation. For handle types defined as NT handles, the application <b>must</b> release ownership using the {@code CloseHandle} system call when the handle is no longer needed.

        Applications <b>can</b> import the same underlying memory into multiple instances of Vulkan, into the same instance from which it was exported, and multiple times into a given Vulkan instance. In all cases, each import operation <b>must</b> create a distinct {@code VkDeviceMemory} object.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code handleType} is not 0, it <b>must</b> be supported for import, as reported by ##VkExternalImageFormatProperties or ##VkExternalBufferProperties.</li>
            <li>The memory from which {@code handle} was exported, or the memory named by {@code name} <b>must</b> have been created on the same underlying physical device as {@code device}.</li>
            <li>If {@code handleType} is not 0, it <b>must</b> be defined as an NT handle or a global share handle.</li>
            <li>If {@code handleType} is not #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT, #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT, #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT, or #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT, {@code name} <b>must</b> be {@code NULL}.</li>
            <li>If {@code handleType} is not 0 and {@code handle} is {@code NULL}, {@code name} <b>must</b> name a valid memory resource of the type specified by {@code handleType}.</li>
            <li>If {@code handleType} is not 0 and {@code name} is {@code NULL}, {@code handle} <b>must</b> be a valid handle of the type specified by {@code handleType}.</li>
            <li>if {@code handle} is not {@code NULL}, {@code name} must be {@code NULL}.</li>
            <li>If {@code handle} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#external-memory-handle-types-compatibility">external memory handle types compatibility</a>.</li>
            <li>If {@code name} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#external-memory-handle-types-compatibility">external memory handle types compatibility</a>.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR</li>
            <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagBits("handleType", "specifies the type of {@code handle} or {@code name}.")
    HANDLE("handle", "the external handle to import, or {@code NULL}.")
    LPCWSTR("name", "a NULL-terminated UTF-16 string naming the underlying memory resource to import, or {@code NULL}.")
}

val VkExportMemoryWin32HandleInfoKHR = struct(Module.VULKAN, "VkExportMemoryWin32HandleInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        Structure specifying additional attributes of Windows handles exported from a memory.

        <h5>Description</h5>
        If this structure is not present, or if {@code pAttributes} is set to {@code NULL}, default security descriptor values will be used, and child processes created by the application will not inherit the handle, as described in the MSDN documentation for "{@code Synchronization Object Security and Access Rights}"<sup>1</sup>. Further, if the structure is not present, the access rights will be

        {@code DXGI_SHARED_RESOURCE_READ} | {@code DXGI_SHARED_RESOURCE_WRITE}

        for handles of the following types:

        #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT

        And

        {@code GENERIC_ALL}

        for handles of the following types:

        #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT

        <dl>
            <dt>1</dt>
            <dd><a target="_blank" href="https://msdn.microsoft.com/en-us/library/windows/desktop/ms686670.aspx">https://msdn.microsoft.com/en-us/library/windows/desktop/ms686670.aspx</a></dd>
        </dl>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkExportMemoryAllocateInfo{@code ::handleTypes} does not include #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT, #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT, #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT, or #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT, ##VkExportMemoryWin32HandleInfoKHR <b>must</b> not be in the {@code pNext} chain of ##VkMemoryAllocateInfo.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR</li>
            <li>If {@code pAttributes} is not {@code NULL}, {@code pAttributes} <b>must</b> be a valid pointer to a valid {@code SECURITY_ATTRIBUTES} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    nullable..SECURITY_ATTRIBUTES.const.p("pAttributes", "a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.")
    DWORD("dwAccess", "a {@code DWORD} specifying access rights of the handle.")
    LPCWSTR("name", "a NULL-terminated UTF-16 string to associate with the underlying resource referenced by NT handles exported from the created memory.")
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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
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
            <li>{@code handleType} <b>must</b> have been included in ##VkExportMemoryAllocateInfo{@code ::handleTypes} when {@code memory} was created.</li>
            <li>If {@code handleType} is defined as an NT handle, #GetMemoryWin32HandleKHR() <b>must</b> be called no more than once for each valid unique combination of {@code memory} and {@code handleType}.</li>
            <li>{@code handleType} <b>must</b> be defined as an NT handle or a global share handle.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDeviceMemory("memory", "the memory object from which the handle will be exported.")
    VkExternalMemoryHandleTypeFlagBits("handleType", "the type of handle requested.")
}

val VkImportMemoryFdInfoKHR = struct(Module.VULKAN, "VkImportMemoryFdInfoKHR") {
    documentation =
        """
        import memory created on the same physical device from a file descriptor.

        <h5>Description</h5>
        Importing memory from a file descriptor transfers ownership of the file descriptor from the application to the Vulkan implementation. The application <b>must</b> not perform any operations on the file descriptor after a successful import.

        Applications <b>can</b> import the same underlying memory into multiple instances of Vulkan, into the same instance from which it was exported, and multiple times into a given Vulkan instance. In all cases, each import operation <b>must</b> create a distinct {@code VkDeviceMemory} object.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code handleType} is not 0, it <b>must</b> be supported for import, as reported by ##VkExternalImageFormatProperties or ##VkExternalBufferProperties.</li>
            <li>The memory from which {@code fd} was exported <b>must</b> have been created on the same underlying physical device as {@code device}.</li>
            <li>If {@code handleType} is not 0, it <b>must</b> be defined as a POSIX file descriptor handle.</li>
            <li>If {@code handleType} is not 0, {@code fd} <b>must</b> be a valid handle of the type specified by {@code handleType}.</li>
            <li>The memory represented by {@code fd} <b>must</b> have been created from a physical device and driver that is compatible with {@code device} and {@code handleType}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#external-memory-handle-types-compatibility">External memory handle types compatibility</a>.</li>
            <li>{@code fd} <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#external-memory-handle-types-compatibility">external memory handle types compatibility</a>.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR</li>
            <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagBits("handleType", "specifies the handle type of {@code fd}.")
    int("fd", "the external handle to import.")
}

val VkMemoryFdPropertiesKHR = struct(Module.VULKAN, "VkMemoryFdPropertiesKHR", mutable = false) {
    documentation =
        """
        Properties of External Memory File Descriptors.
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
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
            <li>{@code handleType} <b>must</b> have been included in ##VkExportMemoryAllocateInfo{@code ::handleTypes} when {@code memory} was created.</li>
            <li>{@code handleType} <b>must</b> be defined as a POSIX file descriptor handle.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDeviceMemory("memory", "the memory object from which the handle will be exported.")
    VkExternalMemoryHandleTypeFlagBits("handleType", "the type of handle requested.")
}

val VkWin32KeyedMutexAcquireReleaseInfoKHR = struct(Module.VULKAN, "VkWin32KeyedMutexAcquireReleaseInfoKHR") {
    documentation =
        """
        Use the Windows keyed mutex mechanism to synchronize work.

        <h5>Valid Usage</h5>
        <ul>
            <li>Each member of {@code pAcquireSyncs} and {@code pReleaseSyncs} <b>must</b> be a device memory object imported by setting ##VkImportMemoryWin32HandleInfoKHR{@code ::handleType} to #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT or #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR</li>
            <li>If {@code acquireCount} is not 0, {@code pAcquireSyncs} <b>must</b> be a valid pointer to an array of {@code acquireCount} valid {@code VkDeviceMemory} handles</li>
            <li>If {@code acquireCount} is not 0, {@code pAcquireKeys} <b>must</b> be a valid pointer to an array of {@code acquireCount} {@code uint64_t} values</li>
            <li>If {@code acquireCount} is not 0, {@code pAcquireTimeouts} <b>must</b> be a valid pointer to an array of {@code acquireCount} {@code uint32_t} values</li>
            <li>If {@code releaseCount} is not 0, {@code pReleaseSyncs} <b>must</b> be a valid pointer to an array of {@code releaseCount} valid {@code VkDeviceMemory} handles</li>
            <li>If {@code releaseCount} is not 0, {@code pReleaseKeys} <b>must</b> be a valid pointer to an array of {@code releaseCount} {@code uint64_t} values</li>
            <li>Both of the elements of {@code pAcquireSyncs}, and the elements of {@code pReleaseSyncs} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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

        <h6>Handle Types Supported by VkImportSemaphoreWin32HandleInfoKHR</h6>
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
            <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-semaphore-handletypes-win32">Handle Types Supported by VkImportSemaphoreWin32HandleInfoKHR</a> table.</li>
            <li>If {@code handleType} is not #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT or #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT, {@code name} <b>must</b> be {@code NULL}.</li>
            <li>If {@code handleType} is not 0 and {@code handle} is {@code NULL}, {@code name} <b>must</b> name a valid synchronization primitive of the type specified by {@code handleType}.</li>
            <li>If {@code handleType} is not 0 and {@code name} is {@code NULL}, {@code handle} <b>must</b> be a valid handle of the type specified by {@code handleType}.</li>
            <li>If {@code handle} is not {@code NULL}, {@code name} must be {@code NULL}.</li>
            <li>If {@code handle} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#external-semaphore-handle-types-compatibility">external semaphore handle types compatibility</a>.</li>
            <li>If {@code name} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#external-semaphore-handle-types-compatibility">external semaphore handle types compatibility</a>.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkSemaphoreImportFlagBits} values</li>
            <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalSemaphoreHandleTypeFlagBits} value</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        #ImportSemaphoreWin32HandleKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSemaphore("semaphore", "the semaphore into which the payload will be imported.")
    VkSemaphoreImportFlags("flags", "a bitmask of {@code VkSemaphoreImportFlagBits} specifying additional parameters for the semaphore payload import operation.")
    VkExternalSemaphoreHandleTypeFlagBits("handleType", "specifies the type of {@code handle}.")
    HANDLE("handle", "the external handle to import, or {@code NULL}.")
    LPCWSTR("name", "a NULL-terminated UTF-16 string naming the underlying synchronization primitive to import, or {@code NULL}.")
}

val VkExportSemaphoreWin32HandleInfoKHR = struct(Module.VULKAN, "VkExportSemaphoreWin32HandleInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        Structure specifying additional attributes of Windows handles exported from a semaphore.

        <h5>Description</h5>
        If this structure is not present, or if {@code pAttributes} is set to {@code NULL}, default security descriptor values will be used, and child processes created by the application will not inherit the handle, as described in the MSDN documentation for "{@code Synchronization Object Security and Access Rights}"<sup>1</sup>. Further, if the structure is not present, the access rights will be

        {@code DXGI_SHARED_RESOURCE_READ} | {@code DXGI_SHARED_RESOURCE_WRITE}

        for handles of the following types:

        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT

        And

        {@code GENERIC_ALL}

        for handles of the following types:

        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT

        <dl>
            <dt>1</dt>
            <dd><a target="_blank" href="https://msdn.microsoft.com/en-us/library/windows/desktop/ms686670.aspx">https://msdn.microsoft.com/en-us/library/windows/desktop/ms686670.aspx</a></dd>
        </dl>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkExportSemaphoreCreateInfo{@code ::handleTypes} does not include #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT or #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT, ##VkExportSemaphoreWin32HandleInfoKHR <b>must</b> not be in the {@code pNext} chain of ##VkSemaphoreCreateInfo.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR</li>
            <li>If {@code pAttributes} is not {@code NULL}, {@code pAttributes} <b>must</b> be a valid pointer to a valid {@code SECURITY_ATTRIBUTES} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    nullable..SECURITY_ATTRIBUTES.const.p("pAttributes", "a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.")
    DWORD("dwAccess", "a {@code DWORD} specifying access rights of the handle.")
    LPCWSTR("name", "a NULL-terminated UTF-16 string to associate with the underlying synchronization primitive referenced by NT handles exported from the created semaphore.")
}

val VkD3D12FenceSubmitInfoKHR = struct(Module.VULKAN, "VkD3D12FenceSubmitInfoKHR") {
    documentation =
        """
        Structure specifying values for Direct3D 12 fence-backed semaphores.

        <h5>Description</h5>
        If the semaphore in ##VkSubmitInfo{@code ::pWaitSemaphores} or ##VkSubmitInfo{@code ::pSignalSemaphores} corresponding to an entry in {@code pWaitSemaphoreValues} or {@code pSignalSemaphoreValues} respectively does not currently have a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-semaphores-payloads">payload</a> referring to a Direct3D 12 fence, the implementation <b>must</b> ignore the value in the {@code pWaitSemaphoreValues} or {@code pSignalSemaphoreValues} entry.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code waitSemaphoreValuesCount} <b>must</b> be the same value as ##VkSubmitInfo{@code ::waitSemaphoreCount}, where ##VkSubmitInfo is in the {@code pNext} chain of this ##VkD3D12FenceSubmitInfoKHR structure.</li>
            <li>{@code signalSemaphoreValuesCount} <b>must</b> be the same value as ##VkSubmitInfo{@code ::signalSemaphoreCount}, where ##VkSubmitInfo is in the {@code pNext} chain of this ##VkD3D12FenceSubmitInfoKHR structure.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR</li>
            <li>If {@code waitSemaphoreValuesCount} is not 0, and {@code pWaitSemaphoreValues} is not {@code NULL}, {@code pWaitSemaphoreValues} <b>must</b> be a valid pointer to an array of {@code waitSemaphoreValuesCount} {@code uint64_t} values</li>
            <li>If {@code signalSemaphoreValuesCount} is not 0, and {@code pSignalSemaphoreValues} is not {@code NULL}, {@code pSignalSemaphoreValues} <b>must</b> be a valid pointer to an array of {@code signalSemaphoreValuesCount} {@code uint64_t} values</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pWaitSemaphoreValues", optional = true)..uint32_t("waitSemaphoreValuesCount", "the number of semaphore wait values specified in {@code pWaitSemaphoreValues}.")
    nullable..uint64_t.const.p("pWaitSemaphoreValues", "an array of length {@code waitSemaphoreValuesCount} containing values for the corresponding semaphores in ##VkSubmitInfo{@code ::pWaitSemaphores} to wait for.")
    AutoSize("pSignalSemaphoreValues", optional = true)..uint32_t("signalSemaphoreValuesCount", "the number of semaphore signal values specified in {@code pSignalSemaphoreValues}.")
    nullable..uint64_t.const.p("pSignalSemaphoreValues", "an array of length {@code signalSemaphoreValuesCount} containing values for the corresponding semaphores in ##VkSubmitInfo{@code ::pSignalSemaphores} to set when signaled.")
}

val VkSemaphoreGetWin32HandleInfoKHR = struct(Module.VULKAN, "VkSemaphoreGetWin32HandleInfoKHR") {
    documentation =
        """
        Structure describing a Win32 handle semaphore export operation.

        <h5>Description</h5>
        The properties of the handle returned depend on the value of {@code handleType}. See {@code VkExternalSemaphoreHandleTypeFlagBits} for a description of the properties of the defined external semaphore handle types.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> have been included in ##VkExportSemaphoreCreateInfo{@code ::handleTypes} when the {@code semaphore}&#8217;s current payload was created.</li>
            <li>If {@code handleType} is defined as an NT handle, #GetSemaphoreWin32HandleKHR() <b>must</b> be called no more than once for each valid unique combination of {@code semaphore} and {@code handleType}.</li>
            <li>{@code semaphore} <b>must</b> not currently have its payload replaced by an imported payload as described below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-semaphores-importing">Importing Semaphore Payloads</a> unless that imported payload&#8217;s handle type was included in ##VkExternalSemaphoreProperties{@code ::exportFromImportedHandleTypes} for {@code handleType}.</li>
            <li>If {@code handleType} refers to a handle type with copy payload transference semantics, as defined below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-semaphores-importing">Importing Semaphore Payloads</a>, there <b>must</b> be no queue waiting on {@code semaphore}.</li>
            <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code semaphore} <b>must</b> be signaled, or have an associated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-semaphores-signaling">semaphore signal operation</a> pending execution.</li>
            <li>{@code handleType} <b>must</b> be defined as an NT handle or a global share handle.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSemaphore("semaphore", "the semaphore from which state will be exported.")
    VkExternalSemaphoreHandleTypeFlagBits("handleType", "the type of handle requested.")
}

val VkImportSemaphoreFdInfoKHR = struct(Module.VULKAN, "VkImportSemaphoreFdInfoKHR") {
    documentation =
        """
        Structure specifying POSIX file descriptor to import to a semaphore.

        <h5>Description</h5>
        The handle types supported by {@code handleType} are:

        <h6>Handle Types Supported by VkImportSemaphoreFdInfoKHR</h6>
        <table class="lwjgl">
            <thead><tr><th>Handle Type</th><th>Transference</th><th>Permanence Supported</th></tr></thead>
            <tbody>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT</td><td>Reference</td><td>Temporary,Permanent</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT</td><td>Copy</td><td>Temporary</td></tr>
            </tbody>
        </table>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-semaphore-handletypes-fd">Handle Types Supported by VkImportSemaphoreFdInfoKHR</a> table.</li>
            <li>{@code fd} <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#external-semaphore-handle-types-compatibility">external semaphore handle types compatibility</a>.</li>
        </ul>

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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>{@code handleType} <b>must</b> have been included in ##VkExportSemaphoreCreateInfo{@code ::handleTypes} when {@code semaphore}&#8217;s current payload was created.</li>
            <li>{@code semaphore} <b>must</b> not currently have its payload replaced by an imported payload as described below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-semaphores-importing">Importing Semaphore Payloads</a> unless that imported payload&#8217;s handle type was included in ##VkExternalSemaphoreProperties{@code ::exportFromImportedHandleTypes} for {@code handleType}.</li>
            <li>If {@code handleType} refers to a handle type with copy payload transference semantics, as defined below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-semaphores-importing">Importing Semaphore Payloads</a>, there <b>must</b> be no queue waiting on {@code semaphore}.</li>
            <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code semaphore} <b>must</b> be signaled, or have an associated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-semaphores-signaling">semaphore signal operation</a> pending execution.</li>
            <li>{@code handleType} <b>must</b> be defined as a POSIX file descriptor handle.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSemaphore("semaphore", "the semaphore from which state will be exported.")
    VkExternalSemaphoreHandleTypeFlagBits("handleType", "the type of handle requested.")
}

val VkPhysicalDevicePushDescriptorPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDevicePushDescriptorPropertiesKHR") {
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

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>{@code offset} <b>must</b> be less than the size of {@code buffer} by at least 32 bits.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBuffer("buffer", "a buffer containing the predicate for conditional rendering.")
    VkDeviceSize("offset", "the byte offset into {@code buffer} where the predicate is located.")
    VkConditionalRenderingFlagsEXT("flags", "a bitmask of {@code VkConditionalRenderingFlagsEXT} specifying the behavior of conditional rendering.")
}

val VkPhysicalDeviceConditionalRenderingFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceConditionalRenderingFeaturesEXT") {
    documentation =
        """
        Structure describing if a secondary command buffer can be executed if conditional rendering is active in the primary command buffer.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceConditionalRenderingFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating the implementation-dependent behavior. ##VkPhysicalDeviceConditionalRenderingFeaturesEXT <b>can</b> also be used in {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-features-inheritedConditionalRendering">inherited conditional rendering</a> feature is not enabled, {@code conditionalRenderingEnable} <b>must</b> be #FALSE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure")
    VkBool32("conditionalRenderingEnable", "specifies whether the command buffer <b>can</b> be executed while conditional rendering is active in the primary command buffer. If this is #TRUE, then this command buffer <b>can</b> be executed whether the primary command buffer has active conditional rendering or not. If this is #FALSE, then the primary command buffer <b>must</b> not have conditional rendering active.")
}

val VkPhysicalDeviceFloat16Int8FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceFloat16Int8FeaturesKHR") {
    documentation =
        """
        Structure describing features supported by VK_KHR_shader_float16_int8.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT16_INT8_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32("shaderFloat16", "indicates whether 16-bit floats (halfs) are supported in shader code. This also indicates whether shader modules <b>can</b> declare the {@code Float16} capability.")
    VkBool32("shaderInt8", "indicates whether 8-bit integers (signed and unsigned) are supported in shader code. This also indicates whether shader modules <b>can</b> declare the {@code Int8} capability.")
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
            <li>The sum of {@code offset} and {@code extent} <b>must</b> be no greater than the {@code imageExtent} member of the ##VkSwapchainCreateInfoKHR structure given to #CreateSwapchainKHR().</li>
            <li>{@code layer} <b>must</b> be less than {@code imageArrayLayers} member of the ##VkSwapchainCreateInfoKHR structure given to #CreateSwapchainKHR().</li>
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
            <li>{@code swapchainCount} <b>must</b> be the same value as ##VkPresentInfoKHR{@code ::swapchainCount}, where ##VkPresentInfoKHR is in the pNext-chain of this ##VkPresentRegionsKHR structure.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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

val VkDeviceGeneratedCommandsFeaturesNVX = struct(Module.VULKAN, "VkDeviceGeneratedCommandsFeaturesNVX") {
    documentation =
        """
        Structure specifying physical device support.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_FEATURES_NVX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #GetPhysicalDeviceGeneratedCommandsPropertiesNVX()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32("computeBindingPointSupport", "specifies whether the {@code VkObjectTableNVX} supports entries with #OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX bit set and {@code VkIndirectCommandsLayoutNVX} supports #PIPELINE_BIND_POINT_COMPUTE.")
}

val VkDeviceGeneratedCommandsLimitsNVX = struct(Module.VULKAN, "VkDeviceGeneratedCommandsLimitsNVX") {
    documentation =
        """
        Structure specifying physical device limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_LIMITS_NVX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #GetPhysicalDeviceGeneratedCommandsPropertiesNVX()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t("maxIndirectCommandsLayoutTokenCount", "the maximum number of tokens in {@code VkIndirectCommandsLayoutNVX}.")
    uint32_t("maxObjectEntryCounts", "the maximum number of entries per resource type in {@code VkObjectTableNVX}.")
    uint32_t("minSequenceCountBufferOffsetAlignment", "the minimum alignment for memory addresses optionally used in {@code vkCmdProcessCommandsNVX}.")
    uint32_t("minSequenceIndexBufferOffsetAlignment", "the minimum alignment for memory addresses optionally used in {@code vkCmdProcessCommandsNVX}.")
    uint32_t("minCommandsTokenBufferOffsetAlignment", "the minimum alignment for memory addresses optionally used in {@code vkCmdProcessCommandsNVX}.")
}

val VkIndirectCommandsTokenNVX = struct(Module.VULKAN, "VkIndirectCommandsTokenNVX") {
    documentation =
        """
        Structure specifying parameters for the reservation of command buffer space.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code buffer}&#8217;s usage flag <b>must</b> have the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set.</li>
            <li>The {@code offset} <b>must</b> be aligned to ##VkDeviceGeneratedCommandsLimitsNVX{@code ::minCommandsTokenBufferOffsetAlignment}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code tokenType} <b>must</b> be a valid {@code VkIndirectCommandsTokenTypeNVX} value</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
        </ul>

        <h5>See Also</h5>
        ##VkCmdProcessCommandsInfoNVX
        """

    VkIndirectCommandsTokenTypeNVX("tokenType", "specifies the token command type.")
    VkBuffer("buffer", "specifies the {@code VkBuffer} storing the functional arguments for each squence. These argumetns can be written by the device.")
    VkDeviceSize("offset", "specified an offset into {@code buffer} where the arguments start.")
}

val VkIndirectCommandsLayoutTokenNVX = struct(Module.VULKAN, "VkIndirectCommandsLayoutTokenNVX") {
    documentation =
        """
        Struct specifying the details of an indirect command layout token.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code bindingUnit} <b>must</b> stay within device supported limits for the appropriate commands.</li>
            <li>{@code dynamicCount} <b>must</b> stay within device supported limits for the appropriate commands.</li>
            <li>{@code divisor} <b>must</b> be greater than 0 and a power of two.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code tokenType} <b>must</b> be a valid {@code VkIndirectCommandsTokenTypeNVX} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkIndirectCommandsLayoutCreateInfoNVX
        """

    VkIndirectCommandsTokenTypeNVX("tokenType", "")
    uint32_t("bindingUnit", "has a different meaning depending on the type, please refer pseudo code further down for details.")
    uint32_t("dynamicCount", "has a different meaning depending on the type, please refer pseudo code further down for details.")
    uint32_t("divisor", "defines the rate at which the input data buffers are accessed.")
}

val VkIndirectCommandsLayoutCreateInfoNVX = struct(Module.VULKAN, "VkIndirectCommandsLayoutCreateInfoNVX") {
    documentation =
        """
        Structure specifying the parameters of a newly created indirect commands layout object.

        <h5>Description</h5>
        The following code illustrates some of the key flags:

        <pre><code>
￿void cmdProcessAllSequences(cmd, objectTable, indirectCommandsLayout, pIndirectCommandsTokens, sequencesCount, indexbuffer, indexbufferoffset)
￿{
￿  for (s = 0; s &lt; sequencesCount; s++)
￿  {
￿    sequence = s;
￿
￿    if (indirectCommandsLayout.flags &amp; VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX) {
￿      sequence = incoherent_implementation_dependent_permutation[ sequence ];
￿    }
￿    if (indirectCommandsLayout.flags &amp; VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX) {
￿      sequence = indexbuffer.load_uint32( sequence * sizeof(uint32_t) + indexbufferoffset);
￿    }
￿
￿    cmdProcessSequence( cmd, objectTable, indirectCommandsLayout, pIndirectCommandsTokens, sequence );
￿  }
￿}</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code tokenCount} <b>must</b> be greater than 0 and below ##VkDeviceGeneratedCommandsLimitsNVX{@code ::maxIndirectCommandsLayoutTokenCount}</li>
            <li>If the ##VkDeviceGeneratedCommandsFeaturesNVX{@code ::computeBindingPointSupport} feature is not enabled, then {@code pipelineBindPoint} <b>must</b> not be #PIPELINE_BIND_POINT_COMPUTE</li>
            <li>If {@code pTokens} contains an entry of #INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX it <b>must</b> be the first element of the array and there <b>must</b> be only a single element of such token type.</li>
            <li>All state binding tokens in {@code pTokens} <b>must</b> occur prior work provoking tokens (#INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX, #INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX, #INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX).</li>
            <li>The content of {@code pTokens} <b>must</b> include one single work provoking token that is compatible with the {@code pipelineBindPoint}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkIndirectCommandsLayoutUsageFlagBitsNVX} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
            <li>{@code pTokens} <b>must</b> be a valid pointer to an array of {@code tokenCount} valid ##VkIndirectCommandsLayoutTokenNVX structures</li>
            <li>{@code tokenCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkIndirectCommandsLayoutTokenNVX, #CreateIndirectCommandsLayoutNVX()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineBindPoint("pipelineBindPoint", "the {@code VkPipelineBindPoint} that this layout targets.")
    VkIndirectCommandsLayoutUsageFlagsNVX("flags", "a bitmask of {@code VkIndirectCommandsLayoutUsageFlagBitsNVX} specifying usage hints of this layout.")
    AutoSize("pTokens")..uint32_t("tokenCount", "the length of the individual command sequnce.")
    VkIndirectCommandsLayoutTokenNVX.const.p("pTokens", "an array describing each command token in detail. See {@code VkIndirectCommandsTokenTypeNVX} and ##VkIndirectCommandsLayoutTokenNVX below for details.")
}

val VkCmdProcessCommandsInfoNVX = struct(Module.VULKAN, "VkCmdProcessCommandsInfoNVX") {
    documentation =
        """
        Structure specifying parameters for the generation of commands.

        <h5>Valid Usage</h5>
        <ul>
            <li>The provided {@code objectTable} <b>must</b> include all objects referenced by the generation process.</li>
            <li>{@code indirectCommandsTokenCount} <b>must</b> match the {@code indirectCommandsLayout}&#8217;s {@code tokenCount}.</li>
            <li>The {@code tokenType} member of each entry in the {@code pIndirectCommandsTokens} array <b>must</b> match the values used at creation time of {@code indirectCommandsLayout}</li>
            <li>If {@code targetCommandBuffer} is provided, it <b>must</b> have reserved command space.</li>
            <li>If {@code targetCommandBuffer} is provided, the {@code objectTable} <b>must</b> match the reservation&#8217;s objectTable and <b>must</b> have had all referenced objects registered at reservation time.</li>
            <li>If {@code targetCommandBuffer} is provided, the {@code indirectCommandsLayout} <b>must</b> match the reservation&#8217;s indirectCommandsLayout.</li>
            <li>If {@code targetCommandBuffer} is provided, the {@code maxSequencesCount} <b>must</b> not exceed the reservation&#8217;s maxSequencesCount.</li>
            <li>If {@code sequencesCountBuffer} is used, its usage flag <b>must</b> have #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set.</li>
            <li>If {@code sequencesCountBuffer} is used, {@code sequencesCountOffset} <b>must</b> be aligned to ##VkDeviceGeneratedCommandsLimitsNVX{@code ::minSequenceCountBufferOffsetAlignment}.</li>
            <li>If {@code sequencesIndexBuffer} is used, its usage flag <b>must</b> have #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set.</li>
            <li>If {@code sequencesIndexBuffer} is used, {@code sequencesIndexOffset} <b>must</b> be aligned to ##VkDeviceGeneratedCommandsLimitsNVX{@code ::minSequenceIndexBufferOffsetAlignment}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_CMD_PROCESS_COMMANDS_INFO_NVX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code objectTable} <b>must</b> be a valid {@code VkObjectTableNVX} handle</li>
            <li>{@code indirectCommandsLayout} <b>must</b> be a valid {@code VkIndirectCommandsLayoutNVX} handle</li>
            <li>{@code pIndirectCommandsTokens} <b>must</b> be a valid pointer to an array of {@code indirectCommandsTokenCount} valid ##VkIndirectCommandsTokenNVX structures</li>
            <li>If {@code targetCommandBuffer} is not {@code NULL}, {@code targetCommandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>If {@code sequencesCountBuffer} is not #NULL_HANDLE, {@code sequencesCountBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>If {@code sequencesIndexBuffer} is not #NULL_HANDLE, {@code sequencesIndexBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code indirectCommandsTokenCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code indirectCommandsLayout}, {@code objectTable}, {@code sequencesCountBuffer}, {@code sequencesIndexBuffer}, and {@code targetCommandBuffer} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code objectTable} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code targetCommandBuffer} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkIndirectCommandsTokenNVX, #CmdProcessCommandsNVX()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkObjectTableNVX("objectTable", "the {@code VkObjectTableNVX} to be used for the generation process. Only registered objects at the time #CmdReserveSpaceForCommandsNVX() is called, will be taken into account for the reservation.")
    VkIndirectCommandsLayoutNVX("indirectCommandsLayout", "the {@code VkIndirectCommandsLayoutNVX} that provides the command sequence to generate.")
    AutoSize("pIndirectCommandsTokens")..uint32_t("indirectCommandsTokenCount", "defines the number of input tokens used.")
    VkIndirectCommandsTokenNVX.const.p("pIndirectCommandsTokens", "provides an array of ##VkIndirectCommandsTokenNVX that reference the input data for each token command.")
    uint32_t("maxSequencesCount", "the maximum number of sequences for which command buffer space will be reserved. If {@code sequencesCountBuffer} is #NULL_HANDLE, this is also the actual number of sequences generated.")
    nullable..VkCommandBuffer("targetCommandBuffer", "<b>can</b> be the secondary {@code VkCommandBuffer} in which the commands should be recorded. If {@code targetCommandBuffer} is {@code NULL} an implicit reservation as well as execution takes place on the processing {@code VkCommandBuffer}.")
    VkBuffer("sequencesCountBuffer", "<b>can</b> be {@code VkBuffer} from which the actual amount of sequences is sourced from as {@code uint32_t} value.")
    VkDeviceSize("sequencesCountOffset", "the byte offset into {@code sequencesCountBuffer} where the count value is stored.")
    VkBuffer("sequencesIndexBuffer", "<b>must</b> be set if {@code indirectCommandsLayout}&#8217;s #INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX is set and provides the used sequence indices as {@code uint32_t} array. Otherwise it <b>must</b> be #NULL_HANDLE.")
    VkDeviceSize("sequencesIndexOffset", "the byte offset into {@code sequencesIndexBuffer} where the index values start.")
}

val VkCmdReserveSpaceForCommandsInfoNVX = struct(Module.VULKAN, "VkCmdReserveSpaceForCommandsInfoNVX") {
    documentation =
        """
        Structure specifying parameters for the reservation of command buffer space.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_CMD_RESERVE_SPACE_FOR_COMMANDS_INFO_NVX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code objectTable} <b>must</b> be a valid {@code VkObjectTableNVX} handle</li>
            <li>{@code indirectCommandsLayout} <b>must</b> be a valid {@code VkIndirectCommandsLayoutNVX} handle</li>
            <li>Both of {@code indirectCommandsLayout}, and {@code objectTable} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code objectTable} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        #CmdReserveSpaceForCommandsNVX()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkObjectTableNVX("objectTable", "the {@code VkObjectTableNVX} to be used for the generation process. Only registered objects at the time #CmdReserveSpaceForCommandsNVX() is called, will be taken into account for the reservation.")
    VkIndirectCommandsLayoutNVX("indirectCommandsLayout", "the {@code VkIndirectCommandsLayoutNVX} that <b>must</b> also be used at generation time.")
    uint32_t("maxSequencesCount", "the maximum number of sequences for which command buffer space will be reserved.")
}

val VkObjectTableCreateInfoNVX = struct(Module.VULKAN, "VkObjectTableCreateInfoNVX") {
    documentation =
        """
        Structure specifying the parameters of a newly created object table.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the ##VkDeviceGeneratedCommandsFeaturesNVX{@code ::computeBindingPointSupport} feature is not enabled, {@code pObjectEntryUsageFlags} <b>must</b> not contain #OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX</li>
            <li>Any value within {@code pObjectEntryCounts} <b>must</b> not exceed ##VkDeviceGeneratedCommandsLimitsNVX{@code ::maxObjectEntryCounts}</li>
            <li>{@code maxUniformBuffersPerDescriptor} <b>must</b> be within the limits supported by the device.</li>
            <li>{@code maxStorageBuffersPerDescriptor} <b>must</b> be within the limits supported by the device.</li>
            <li>{@code maxStorageImagesPerDescriptor} <b>must</b> be within the limits supported by the device.</li>
            <li>{@code maxSampledImagesPerDescriptor} <b>must</b> be within the limits supported by the device.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_OBJECT_TABLE_CREATE_INFO_NVX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code pObjectEntryTypes} <b>must</b> be a valid pointer to an array of {@code objectCount} valid {@code VkObjectEntryTypeNVX} values</li>
            <li>{@code pObjectEntryCounts} <b>must</b> be a valid pointer to an array of {@code objectCount} {@code uint32_t} values</li>
            <li>{@code pObjectEntryUsageFlags} <b>must</b> be a valid pointer to an array of {@code objectCount} valid combinations of {@code VkObjectEntryUsageFlagBitsNVX} values</li>
            <li>Each element of {@code pObjectEntryUsageFlags} <b>must</b> not be 0</li>
            <li>{@code objectCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        #CreateObjectTableNVX()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pObjectEntryTypes", "pObjectEntryCounts", "pObjectEntryUsageFlags")..uint32_t("objectCount", "the number of entry configurations that the object table supports.")
    VkObjectEntryTypeNVX.const.p("pObjectEntryTypes", "an array of {@code VkObjectEntryTypeNVX} values providing the entry type of a given configuration.")
    uint32_t.const.p("pObjectEntryCounts", "an array of counts of how many objects can be registered in the table.")
    VkObjectEntryUsageFlagsNVX.const.p("pObjectEntryUsageFlags", "an array of bitmasks of {@code VkObjectEntryUsageFlagBitsNVX} specifying the binding usage of the entry.")
    uint32_t("maxUniformBuffersPerDescriptor", "the maximum number of #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC used by any single registered {@code VkDescriptorSet} in this table.")
    uint32_t("maxStorageBuffersPerDescriptor", "the maximum number of #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC used by any single registered {@code VkDescriptorSet} in this table.")
    uint32_t("maxStorageImagesPerDescriptor", "the maximum number of #DESCRIPTOR_TYPE_STORAGE_IMAGE or #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER used by any single registered {@code VkDescriptorSet} in this table.")
    uint32_t("maxSampledImagesPerDescriptor", "the maximum number of #DESCRIPTOR_TYPE_SAMPLER, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER or #DESCRIPTOR_TYPE_INPUT_ATTACHMENT used by any single registered {@code VkDescriptorSet} in this table.")
    uint32_t("maxPipelineLayouts", "the maximum number of unique {@code VkPipelineLayout} used by any registered {@code VkDescriptorSet} or {@code VkPipeline} in this table.")
}

val VkObjectTableEntryNVX = struct(Module.VULKAN, "VkObjectTableEntryNVX") {
    documentation =
        """
        Common parameters of an object table resource entry.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the ##VkDeviceGeneratedCommandsFeaturesNVX{@code ::computeBindingPointSupport} feature is not enabled, {@code flags} <b>must</b> not contain #OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be a valid {@code VkObjectEntryTypeNVX} value</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkObjectEntryUsageFlagBitsNVX} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        #RegisterObjectsNVX()
        """

    VkObjectEntryTypeNVX("type", "defines the entry type")
    VkObjectEntryUsageFlagsNVX("flags", "defines which {@code VkPipelineBindPoint} the resource can be used with. Some entry types allow only a single flag to be set.")
}

val VkObjectTablePipelineEntryNVX = struct(Module.VULKAN, "VkObjectTablePipelineEntryNVX") {
    documentation =
        """
        Parameters of an object table pipeline entry.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code type} <b>must</b> be #OBJECT_ENTRY_TYPE_PIPELINE_NVX</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be a valid {@code VkObjectEntryTypeNVX} value</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkObjectEntryUsageFlagBitsNVX} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
            <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
        </ul>
        """

    VkObjectEntryTypeNVX("type", "")
    VkObjectEntryUsageFlagsNVX("flags", "")
    VkPipeline("pipeline", "specifies the {@code VkPipeline} that this resource entry references.")
}

val VkObjectTableDescriptorSetEntryNVX = struct(Module.VULKAN, "VkObjectTableDescriptorSetEntryNVX") {
    documentation =
        """
        Parameters of an object table descriptor set entry.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code type} <b>must</b> be #OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be a valid {@code VkObjectEntryTypeNVX} value</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkObjectEntryUsageFlagBitsNVX} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
            <li>{@code pipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code descriptorSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
            <li>Both of {@code descriptorSet}, and {@code pipelineLayout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>
        """

    VkObjectEntryTypeNVX("type", "")
    VkObjectEntryUsageFlagsNVX("flags", "")
    VkPipelineLayout("pipelineLayout", "specifies the {@code VkPipelineLayout} that the {@code descriptorSet} is used with.")
    VkDescriptorSet("descriptorSet", "specifies the {@code VkDescriptorSet} that can be bound with this entry.")
}

val VkObjectTableVertexBufferEntryNVX = struct(Module.VULKAN, "VkObjectTableVertexBufferEntryNVX") {
    documentation =
        """
        Parameters of an object table vertex buffer entry.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code type} <b>must</b> be #OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be a valid {@code VkObjectEntryTypeNVX} value</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkObjectEntryUsageFlagBitsNVX} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
        </ul>
        """

    VkObjectEntryTypeNVX("type", "")
    VkObjectEntryUsageFlagsNVX("flags", "")
    VkBuffer("buffer", "specifies the {@code VkBuffer} that can be bound as vertex bufer")
}

val VkObjectTableIndexBufferEntryNVX = struct(Module.VULKAN, "VkObjectTableIndexBufferEntryNVX") {
    documentation =
        """
        Parameters of an object table index buffer entry.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code type} <b>must</b> be #OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be a valid {@code VkObjectEntryTypeNVX} value</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkObjectEntryUsageFlagBitsNVX} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code indexType} <b>must</b> be a valid {@code VkIndexType} value</li>
        </ul>
        """

    VkObjectEntryTypeNVX("type", "")
    VkObjectEntryUsageFlagsNVX("flags", "")
    VkBuffer("buffer", "specifies the {@code VkBuffer} that can be bound as index buffer")
    VkIndexType("indexType", "specifies the {@code VkIndexType} used with this index buffer")
}

val VkObjectTablePushConstantEntryNVX = struct(Module.VULKAN, "VkObjectTablePushConstantEntryNVX") {
    documentation =
        """
        Parameters of an object table push constant entry.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code type} <b>must</b> be #OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be a valid {@code VkObjectEntryTypeNVX} value</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkObjectEntryUsageFlagBitsNVX} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
            <li>{@code pipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
            <li>{@code stageFlags} <b>must</b> not be 0</li>
        </ul>
        """

    VkObjectEntryTypeNVX("type", "")
    VkObjectEntryUsageFlagsNVX("flags", "")
    VkPipelineLayout("pipelineLayout", "specifies the {@code VkPipelineLayout} that the pushconstants are used with")
    VkShaderStageFlags("stageFlags", "specifies the {@code VkShaderStageFlags} that the pushconstants are used with")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32("viewportWScalingEnable", "controls whether viewport <b>W</b> scaling is enabled.")
    AutoSize("pViewportWScalings")..uint32_t("viewportCount", "the number of viewports used by <b>W</b> scaling, and <b>must</b> match the number of viewports in the pipeline if viewport <b>W</b> scaling is enabled.")
    VkViewportWScalingNV.const.p("pViewportWScalings", "a pointer to an array of ##VkViewportWScalingNV structures, which define the <b>W</b> scaling parameters for the corresponding viewport. If the viewport <b>W</b> scaling state is dynamic, this member is ignored.")
}

val VkSurfaceCapabilities2EXT = struct(Module.VULKAN, "VkSurfaceCapabilities2EXT", mutable = false) {
    documentation =
        """
        Structure describing capabilities of a surface.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code supportedSurfaceCounters} <b>must</b> not include #SURFACE_COUNTER_VBLANK_EXT unless the surface queried is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#wsi-display-surfaces">display surface</a>.</li>
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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDisplayEventTypeEXT("displayEvent", "a {@code VkDisplayEventTypeEXT} specifying when the fence will be signaled.")
}

val VkSwapchainCounterCreateInfoEXT = struct(Module.VULKAN, "VkSwapchainCounterCreateInfoEXT") {
    documentation =
        """
        Specify the surface counters desired.

        <h5>Valid Usage</h5>
        <ul>
            <li>The bits in {@code surfaceCounters} <b>must</b> be supported by ##VkSwapchainCreateInfoKHR{@code ::surface}, as reported by #GetPhysicalDeviceSurfaceCapabilities2EXT().</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT</li>
            <li>{@code surfaceCounters} <b>must</b> be a valid combination of {@code VkSurfaceCounterFlagBitsEXT} values</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    uint64_t("desiredPresentTime", "specifies that the image given <b>should</b> not be displayed to the user any earlier than this time. {@code desiredPresentTime} is a time in nanoseconds, relative to a monotonically-increasing clock (e.g. {@code CLOCK_MONOTONIC} (see clock_gettime(2)) on Android and Linux). A value of zero specifies that the presentation engine <b>may</b> display the image at any time. This is useful when the application desires to provide {@code presentID}, but doesn&#8217;t need a specific {@code desiredPresentTime}.")
}

val VkPresentTimesInfoGOOGLE = struct(Module.VULKAN, "VkPresentTimesInfoGOOGLE") {
    documentation =
        """
        The earliest time each image should be presented.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code swapchainCount} <b>must</b> be the same value as ##VkPresentInfoKHR{@code ::swapchainCount}, where ##VkPresentInfoKHR is in the {@code pNext} chain of this ##VkPresentTimesInfoGOOGLE structure.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
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
            <li>{@code viewportCount} <b>must</b> match the {@code viewportCount} set in ##VkPipelineViewportStateCreateInfo</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code viewportCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkViewportSwizzleNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineViewportSwizzleStateCreateFlagsNV("flags", "reserved for future use.")
    AutoSize("pViewportSwizzles", optional = true)..uint32_t("viewportCount", "the number of viewport swizzles used by the pipeline.")
    nullable..VkViewportSwizzleNV.const.p("pViewportSwizzles", "a pointer to an array of ##VkViewportSwizzleNV structures, defining the viewport swizzles.")
}

val VkPhysicalDeviceDiscardRectanglePropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDiscardRectanglePropertiesEXT") {
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

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t("maxDiscardRectangles", "the maximum number of active discard rectangles that <b>can</b> be specified.")
}

val VkPipelineDiscardRectangleStateCreateInfoEXT = struct(Module.VULKAN, "VkPipelineDiscardRectangleStateCreateInfoEXT") {
    documentation =
        """
        Structure specifying discard rectangle.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code discardRectangleCount} <b>must</b> be between 0 and ##VkPhysicalDeviceDiscardRectanglePropertiesEXT{@code ::maxDiscardRectangles}, inclusive</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineDiscardRectangleStateCreateFlagsEXT("flags", "reserved for future use.")
    VkDiscardRectangleModeEXT("discardRectangleMode", "the mode used to determine whether fragments that lie within the discard rectangle are discarded or not.")
    AutoSize("pDiscardRectangles", optional = true)..uint32_t("discardRectangleCount", "the number of discard rectangles used by the pipeline.")
    nullable..VkRect2D.const.p("pDiscardRectangles", "a pointer to an array of ##VkRect2D structures, defining the discard rectangles. If the discard rectangle state is dynamic, this member is ignored.")
}

val VkPhysicalDeviceConservativeRasterizationPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceConservativeRasterizationPropertiesEXT") {
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

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    float("primitiveOverestimationSize", "the size in pixels the generating primitive is increased at each of its edges during conservative rasterization overestimation mode. Even with a size of 0.0, conservative rasterization overestimation rules still apply and if any part of the pixel rectangle is covered by the generating primitive, fragments are generated for the entire pixel. However implementations <b>may</b> make the pixel coverage area even more conservative by increasing the size of the generating primitive.")
    float("maxExtraPrimitiveOverestimationSize", "the maximum size in pixels of extra overestimation the implementation supports in the pipeline state. A value of 0.0 means the implementation does not support any additional overestimation of the generating primitive during conservative rasterization. A value above 0.0 allows the application to further increase the size of the generating primitive during conservative rasterization overestimation.")
    float("extraPrimitiveOverestimationSizeGranularity", "the granularity of extra overestimation that can be specified in the pipeline state between 0.0 and {@code maxExtraPrimitiveOverestimationSize} inclusive. A value of 0.0 means the implementation can use the smallest representable non-zero value in the screen space pixel fixed-point grid.")
    VkBool32("primitiveUnderestimation", "true if the implementation supports the #CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT conservative rasterization mode in addition to #CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT. Otherwise the implementation only supports #CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT.")
    VkBool32("conservativePointAndLineRasterization", "true if the implementation supports conservative rasterization of point and line primitives as well as triangle primitives. Otherwise the implementation only supports triangle primitives.")
    VkBool32("degenerateTrianglesRasterized", "false if the implementation culls primitives generated from triangles that become zero area after they are quantized to the fixed-point rasterization pixel grid. {@code degenerateTrianglesRasterized} is true if these primitives are not culled and the provoking vertex attributes and depth value are used for the fragments. The primitive area calculation is done on the primitive generated from the clipped triangle if applicable. Zero area primitives are backfacing and the application <b>can</b> enable backface culling if desired.")
    VkBool32("degenerateLinesRasterized", "false if the implementation culls lines that become zero length after they are quantized to the fixed-point rasterization pixel grid. {@code degenerateLinesRasterized} is true if zero length lines are not culled and the provoking vertex attributes and depth value are used for the fragments.")
    VkBool32("fullyCoveredFragmentShaderInputVariable", "true if the implementation supports the SPIR-V builtin fragment shader input variable FullyCoveredEXT which specifies that conservative rasterization is enabled and the fragment area is fully covered by the generating primitive.")
    VkBool32("conservativeRasterizationPostDepthCoverage", "true if the implementation supports conservative rasterization with the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#shaders-fragment-earlytest-postdepthcoverage\">{@code PostDepthCoverage}</a> execution mode enabled. When supported the {@code SampleMask} built-in input variable will reflect the coverage after the early per-fragment depth and stencil tests are applied even when conservative rasterization is enabled. Otherwise <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#shaders-fragment-earlytest-postdepthcoverage\">{@code PostDepthCoverage}</a> execution mode <b>must</b> not be used when conservative rasterization is enabled.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineRasterizationConservativeStateCreateFlagsEXT("flags", "reserved for future use.")
    VkConservativeRasterizationModeEXT("conservativeRasterizationMode", "the conservative rasterization mode to use.")
    float("extraPrimitiveOverestimationSize", "the extra size in pixels to increase the generating primitive during conservative rasterization at each of its edges in {@code X} and {@code Y} equally in screen space beyond the base overestimation specified in ##VkPhysicalDeviceConservativeRasterizationPropertiesEXT{@code ::primitiveOverestimationSize}.")
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

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The validity and use of this data is outside the scope of Vulkan and thus no +Valid Usage+ is given.
        </div>

        <h5>See Also</h5>
        ##VkXYColorEXT, #SetHdrMetadataEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkXYColorEXT("displayPrimaryRed", "the mastering display&#8217;s red primary in chromaticity coordinates")
    VkXYColorEXT("displayPrimaryGreen", "the mastering display&#8217;s green primary in chromaticity coordinates")
    VkXYColorEXT("displayPrimaryBlue", "the mastering display&#8217;s blue primary in chromaticity coordinates")
    VkXYColorEXT("whitePoint", "the mastering display&#8217;s white-point in chromaticity coordinates")
    float("maxLuminance", "the maximum luminance of the mastering display in nits")
    float("minLuminance", "the minimum luminance of the mastering display in nits")
    float("maxContentLightLevel", "content&#8217;s maximum luminance in nits")
    float("maxFrameAverageLightLevel", "the maximum frame average light level in nits")
}

val VkAttachmentDescription2KHR = struct(Module.VULKAN, "VkAttachmentDescription2KHR") {
    documentation =
        """
        Structure specifying an attachment description.

        <h5>Description</h5>
        Parameters defined by this structure with the same name as those in ##VkAttachmentDescription have the identical effect to those parameters.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code finalLayout} <b>must</b> not be #IMAGE_LAYOUT_UNDEFINED or #IMAGE_LAYOUT_PREINITIALIZED</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2_KHR</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkAttachmentDescriptionFlagBits} values</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
            <li>{@code loadOp} <b>must</b> be a valid {@code VkAttachmentLoadOp} value</li>
            <li>{@code storeOp} <b>must</b> be a valid {@code VkAttachmentStoreOp} value</li>
            <li>{@code stencilLoadOp} <b>must</b> be a valid {@code VkAttachmentLoadOp} value</li>
            <li>{@code stencilStoreOp} <b>must</b> be a valid {@code VkAttachmentStoreOp} value</li>
            <li>{@code initialLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code finalLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkRenderPassCreateInfo2KHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkAttachmentDescriptionFlags("flags", "a bitmask of {@code VkAttachmentDescriptionFlagBits} specifying additional properties of the attachment.")
    VkFormat("format", "a {@code VkFormat} value specifying the format of the image that will be used for the attachment.")
    VkSampleCountFlagBits("samples", "the number of samples of the image as defined in {@code VkSampleCountFlagBits}.")
    VkAttachmentLoadOp("loadOp", "a {@code VkAttachmentLoadOp} value specifying how the contents of color and depth components of the attachment are treated at the beginning of the subpass where it is first used.")
    VkAttachmentStoreOp("storeOp", "a {@code VkAttachmentStoreOp} value specifying how the contents of color and depth components of the attachment are treated at the end of the subpass where it is last used.")
    VkAttachmentLoadOp("stencilLoadOp", "a {@code VkAttachmentLoadOp} value specifying how the contents of stencil components of the attachment are treated at the beginning of the subpass where it is first used.")
    VkAttachmentStoreOp("stencilStoreOp", "a {@code VkAttachmentStoreOp} value specifying how the contents of stencil components of the attachment are treated at the end of the last subpass where it is used.")
    VkImageLayout("initialLayout", "the layout the attachment image subresource will be in when a render pass instance begins.")
    VkImageLayout("finalLayout", "the layout the attachment image subresource will be transitioned to when a render pass instance ends.")
}

val VkAttachmentReference2KHR = struct(Module.VULKAN, "VkAttachmentReference2KHR") {
    documentation =
        """
        Structure specifying an attachment reference.

        <h5>Description</h5>
        Parameters defined by this structure with the same name as those in ##VkAttachmentReference have the identical effect to those parameters.

        {@code aspectMask} has the same effect for the described attachment as ##VkInputAttachmentAspectReference{@code ::aspectMask} has on each corresponding attachment. It is ignored when this structure is used to describe anything other than an input attachment reference.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code layout} <b>must</b> not be #IMAGE_LAYOUT_UNDEFINED or #IMAGE_LAYOUT_PREINITIALIZED</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2_KHR</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkImageLayout} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkSubpassDescription2KHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t("attachment", "either an integer value identifying an attachment at the corresponding index in ##VkRenderPassCreateInfo{@code ::pAttachments}, or #ATTACHMENT_UNUSED to signify that this attachment is not used.")
    VkImageLayout("layout", "a {@code VkImageLayout} value specifying the layout the attachment uses during the subpass.")
    VkImageAspectFlags("aspectMask", "a mask of which aspect(s) <b>can</b> be accessed within the specified subpass as an input attachment.")
}

val VkSubpassDescription2KHR = struct(Module.VULKAN, "VkSubpassDescription2KHR") {
    documentation =
        """
        Structure specifying a subpass description.

        <h5>Description</h5>
        Parameters defined by this structure with the same name as those in ##VkSubpassDescription have the identical effect to those parameters.

        {@code viewMask} has the same effect for the described subpass as ##VkRenderPassMultiviewCreateInfo{@code ::pViewMasks} has on each corresponding subpass.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pipelineBindPoint} <b>must</b> be #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>{@code colorAttachmentCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxColorAttachments}</li>
            <li>If the first use of an attachment in this render pass is as an input attachment, and the attachment is not also used as a color or depth/stencil attachment in the same subpass, then {@code loadOp} <b>must</b> not be #ATTACHMENT_LOAD_OP_CLEAR</li>
            <li>If {@code pResolveAttachments} is not {@code NULL}, for each resolve attachment that does not have the value #ATTACHMENT_UNUSED, the corresponding color attachment <b>must</b> not have the value #ATTACHMENT_UNUSED</li>
            <li>If {@code pResolveAttachments} is not {@code NULL}, the sample count of each element of {@code pColorAttachments} <b>must</b> be anything other than #SAMPLE_COUNT_1_BIT</li>
            <li>Any given element of {@code pResolveAttachments} <b>must</b> have a sample count of #SAMPLE_COUNT_1_BIT</li>
            <li>Any given element of {@code pResolveAttachments} <b>must</b> have the same {@code VkFormat} as its corresponding color attachment</li>
            <li>All attachments in {@code pColorAttachments} that are not #ATTACHMENT_UNUSED <b>must</b> have the same sample count</li>
            <li>If the {@code VK_AMD_mixed_attachment_samples} extension is enabled, all attachments in {@code pColorAttachments} that are not #ATTACHMENT_UNUSED <b>must</b> have a sample count that is smaller than or equal to the sample count of {@code pDepthStencilAttachment} if it is not #ATTACHMENT_UNUSED</li>
            <li>If neither the {@code VK_AMD_mixed_attachment_samples} nor the {@code VK_NV_framebuffer_mixed_samples} extensions are enabled, and if {@code pDepthStencilAttachment} is not #ATTACHMENT_UNUSED and any attachments in {@code pColorAttachments} are not #ATTACHMENT_UNUSED, they <b>must</b> have the same sample count</li>
            <li>The {@code attachment} member of any element of {@code pPreserveAttachments} <b>must</b> not be #ATTACHMENT_UNUSED</li>
            <li>Any given element of {@code pPreserveAttachments} <b>must</b> not also be an element of any other member of the subpass description</li>
            <li>If any attachment is used by more than one ##VkAttachmentReference member, then each use <b>must</b> use the same {@code layout}</li>
            <li>If {@code flags} includes #SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX, it <b>must</b> also include #SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX.</li>
            <li>The {@code aspectMask} member of any element of {@code pInputAttachments} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits}</li>
            <li>The {@code aspectMask} member of any element of {@code pInputAttachments} <b>must</b> not be 0</li>
            <li>The {@code aspectMask} member of each element of {@code pInputAttachments} <b>must</b> not include #IMAGE_ASPECT_METADATA_BIT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2_KHR</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkSubpassDescriptionFlagBits} values</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>If {@code inputAttachmentCount} is not 0, {@code pInputAttachments} <b>must</b> be a valid pointer to an array of {@code inputAttachmentCount} valid ##VkAttachmentReference2KHR structures</li>
            <li>If {@code colorAttachmentCount} is not 0, {@code pColorAttachments} <b>must</b> be a valid pointer to an array of {@code colorAttachmentCount} valid ##VkAttachmentReference2KHR structures</li>
            <li>If {@code colorAttachmentCount} is not 0, and {@code pResolveAttachments} is not {@code NULL}, {@code pResolveAttachments} <b>must</b> be a valid pointer to an array of {@code colorAttachmentCount} valid ##VkAttachmentReference2KHR structures</li>
            <li>If {@code pDepthStencilAttachment} is not {@code NULL}, {@code pDepthStencilAttachment} <b>must</b> be a valid pointer to a valid ##VkAttachmentReference2KHR structure</li>
            <li>If {@code preserveAttachmentCount} is not 0, {@code pPreserveAttachments} <b>must</b> be a valid pointer to an array of {@code preserveAttachmentCount} {@code uint32_t} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentReference2KHR, ##VkRenderPassCreateInfo2KHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSubpassDescriptionFlags("flags", "a bitmask of {@code VkSubpassDescriptionFlagBits} specifying usage of the subpass.")
    VkPipelineBindPoint("pipelineBindPoint", "a {@code VkPipelineBindPoint} value specifying the pipeline type supported for this subpass.")
    uint32_t("viewMask", "a bitfield of view indices describing which views rendering is broadcast to in this subpass, when multiview is enabled.")
    AutoSize("pInputAttachments", optional = true)..uint32_t("inputAttachmentCount", "the number of input attachments.")
    VkAttachmentReference2KHR.const.p("pInputAttachments", "an array of ##VkAttachmentReference2KHR structures defining the input attachments for this subpass and their layouts.")
    AutoSize("pColorAttachments", "pResolveAttachments", optional = true)..uint32_t("colorAttachmentCount", "the number of color attachments.")
    VkAttachmentReference2KHR.const.p("pColorAttachments", "an array of ##VkAttachmentReference2KHR structures defining the color attachments for this subpass and their layouts.")
    nullable..VkAttachmentReference2KHR.const.p("pResolveAttachments", "an optional array of {@code colorAttachmentCount} ##VkAttachmentReference2KHR structures defining the resolve attachments for this subpass and their layouts.")
    nullable..VkAttachmentReference2KHR.const.p("pDepthStencilAttachment", "a pointer to a ##VkAttachmentReference2KHR specifying the depth/stencil attachment for this subpass and its layout.")
    AutoSize("pPreserveAttachments", optional = true)..uint32_t("preserveAttachmentCount", "the number of preserved attachments.")
    uint32_t.const.p("pPreserveAttachments", "an array of {@code preserveAttachmentCount} render pass attachment indices identifying attachments that are not used by this subpass, but whose contents <b>must</b> be preserved throughout the subpass.")
}

val VkSubpassDependency2KHR = struct(Module.VULKAN, "VkSubpassDependency2KHR") {
    documentation =
        """
        Structure specifying a subpass dependency.

        <h5>Description</h5>
        Parameters defined by this structure with the same name as those in ##VkSubpassDependency have the identical effect to those parameters.

        {@code viewOffset} has the same effect for the described subpass dependency as ##VkRenderPassMultiviewCreateInfo{@code ::pViewOffsets} has on each corresponding subpass dependency.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code srcSubpass} is not #SUBPASS_EXTERNAL, {@code srcStageMask} <b>must</b> not include #PIPELINE_STAGE_HOST_BIT</li>
            <li>If {@code dstSubpass} is not #SUBPASS_EXTERNAL, {@code dstStageMask} <b>must</b> not include #PIPELINE_STAGE_HOST_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>{@code srcSubpass} <b>must</b> be less than or equal to {@code dstSubpass}, unless one of them is #SUBPASS_EXTERNAL, to avoid cyclic dependencies and ensure a valid execution order</li>
            <li>{@code srcSubpass} and {@code dstSubpass} <b>must</b> not both be equal to #SUBPASS_EXTERNAL</li>
            <li>If {@code srcSubpass} is equal to {@code dstSubpass}, {@code srcStageMask} and {@code dstStageMask} <b>must</b> not set any bits that are neither #PIPELINE_STAGE_ALL_GRAPHICS_BIT, nor one of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">graphics pipeline stages</a></li>
            <li>If {@code srcSubpass} is equal to {@code dstSubpass} and not all of the stages in {@code srcStageMask} and {@code dstStageMask} are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-framebuffer-regions">framebuffer-space stages</a>, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-order">logically latest</a> pipeline stage in {@code srcStageMask} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-order">logically earlier</a> than or equal to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-order">logically earliest</a> pipeline stage in {@code dstStageMask}</li>
            <li>Any access flag included in {@code srcAccessMask} <b>must</b> be supported by one of the pipeline stages in {@code srcStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
            <li>Any access flag included in {@code dstAccessMask} <b>must</b> be supported by one of the pipeline stages in {@code dstStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
            <li>If {@code dependencyFlags} includes #DEPENDENCY_VIEW_LOCAL_BIT, {@code srcSubpass} <b>must</b> not be equal to #SUBPASS_EXTERNAL</li>
            <li>If {@code dependencyFlags} includes #DEPENDENCY_VIEW_LOCAL_BIT, {@code dstSubpass} <b>must</b> not be equal to #SUBPASS_EXTERNAL</li>
            <li>If {@code srcSubpass} equals {@code dstSubpass}, and {@code srcStageMask} and {@code dstStageMask} both include a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-framebuffer-regions">framebuffer-space stage</a>, then {@code dependencyFlags} <b>must</b> include #DEPENDENCY_BY_REGION_BIT</li>
            <li>If {@code viewOffset} is not equal to 0, {@code srcSubpass} <b>must</b> not be equal to {@code dstSubpass}</li>
            <li>If {@code dependencyFlags} does not include #DEPENDENCY_VIEW_LOCAL_BIT, {@code viewOffset} <b>must</b> be 0</li>
            <li>If {@code viewOffset} is not 0, {@code srcSubpass} <b>must</b> not be equal to {@code dstSubpass}.</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-features-meshShader">mesh shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-features-taskShader">task shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_TASK_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-features-meshShader">mesh shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-features-taskShader">task shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_TASK_SHADER_BIT_NV</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2_KHR</li>
            <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code srcStageMask} <b>must</b> not be 0</li>
            <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code dstStageMask} <b>must</b> not be 0</li>
            <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
            <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
            <li>{@code dependencyFlags} <b>must</b> be a valid combination of {@code VkDependencyFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkRenderPassCreateInfo2KHR
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t("srcSubpass", "the subpass index of the first subpass in the dependency, or #SUBPASS_EXTERNAL.")
    uint32_t("dstSubpass", "the subpass index of the second subpass in the dependency, or #SUBPASS_EXTERNAL.")
    VkPipelineStageFlags("srcStageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#synchronization-pipeline-stages-masks\">source stage mask</a>.")
    VkPipelineStageFlags("dstStageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#synchronization-pipeline-stages-masks\">destination stage mask</a>")
    VkAccessFlags("srcAccessMask", "a bitmask of {@code VkAccessFlagBits} specifying a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#synchronization-access-masks\">source access mask</a>.")
    VkAccessFlags("dstAccessMask", "a bitmask of {@code VkAccessFlagBits} specifying a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#synchronization-access-masks\">destination access mask</a>.")
    VkDependencyFlags("dependencyFlags", "a bitmask of {@code VkDependencyFlagBits}.")
    int32_t("viewOffset", "controls which views in the source subpass the views in the destination subpass depend on.")
}

val VkRenderPassCreateInfo2KHR = struct(Module.VULKAN, "VkRenderPassCreateInfo2KHR") {
    documentation =
        """
        Structure specifying parameters of a newly created render pass.

        <h5>Description</h5>
        Parameters defined by this structure with the same name as those in ##VkRenderPassCreateInfo have the identical effect to those parameters; the child structures are variants of those used in ##VkRenderPassCreateInfo which include {@code sType} and {@code pNext} parameters, allowing them to be extended.

        If the ##VkSubpassDescription2KHR{@code ::viewMask} member of any element of {@code pSubpasses} is not zero, <em>multiview</em> functionality is considered to be enabled for this render pass.

        {@code correlatedViewMaskCount} and {@code pCorrelatedViewMasks} have the same effect as ##VkRenderPassMultiviewCreateInfo{@code ::correlationMaskCount} and ##VkRenderPassMultiviewCreateInfo{@code ::pCorrelationMasks}, respectively.

        <h5>Valid Usage</h5>
        <ul>
            <li>If any two subpasses operate on attachments with overlapping ranges of the same {@code VkDeviceMemory} object, and at least one subpass writes to that area of {@code VkDeviceMemory}, a subpass dependency <b>must</b> be included (either directly or via some intermediate subpasses) between them</li>
            <li>If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment}, or the attachment indexed by any element of {@code pPreserveAttachments} in any given element of {@code pSubpasses} is bound to a range of a {@code VkDeviceMemory} object that overlaps with any other attachment in any subpass (including the same subpass), the ##VkAttachmentDescription2KHR structures describing them <b>must</b> include #ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT in {@code flags}</li>
            <li>If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment}, or any element of {@code pPreserveAttachments} in any given element of {@code pSubpasses} is not #ATTACHMENT_UNUSED, it <b>must</b> be less than {@code attachmentCount}</li>
            <li>For any member of {@code pAttachments} with a {@code loadOp} equal to #ATTACHMENT_LOAD_OP_CLEAR, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@code VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}, {@code VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, or {@code VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
            <li>For any member of {@code pAttachments} with a {@code stencilLoadOp} equal to #ATTACHMENT_LOAD_OP_CLEAR, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@code VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}, {@code VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, or {@code VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}.</li>
            <li>For any element of {@code pDependencies}, if the {@code srcSubpass} is not #SUBPASS_EXTERNAL, all stage flags included in the {@code srcStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the source subpass.</li>
            <li>For any element of {@code pDependencies}, if the {@code dstSubpass} is not #SUBPASS_EXTERNAL, all stage flags included in the {@code dstStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the source subpass.</li>
            <li>The set of bits included in any element of {@code pCorrelatedViewMasks} <b>must</b> not overlap with the set of bits included in any other element of {@code pCorrelatedViewMasks}</li>
            <li>If the ##VkSubpassDescription2KHR{@code ::viewMask} member of all elements of {@code pSubpasses} is 0, {@code correlatedViewMaskCount} <b>must</b> be 0</li>
            <li>The ##VkSubpassDescription2KHR{@code ::viewMask} member of all elements of {@code pSubpasses} <b>must</b> either all be 0, or all not be 0</li>
            <li>If the ##VkSubpassDescription2KHR{@code ::viewMask} member of all elements of {@code pSubpasses} is 0, the {@code dependencyFlags} member of any element of {@code pDependencies} <b>must</b> not include #DEPENDENCY_VIEW_LOCAL_BIT</li>
            <li>For any element of {@code pDependencies} where its {@code srcSubpass} member equals its {@code dstSubpass} member, if the {@code viewMask} member of the corresponding element of {@code pSubpasses} includes more than one bit, its {@code dependencyFlags} member <b>must</b> include #DEPENDENCY_VIEW_LOCAL_BIT</li>
            <li>The {@code viewMask} member <b>must</b> not include a bit at a position greater than the value of ##VkPhysicalDeviceLimits{@code ::maxFramebufferLayers}</li>
            <li>If the {@code attachment} member of any element of the {@code pInputAttachments} member of any element of {@code pSubpasses} is not #ATTACHMENT_UNUSED, the {@code aspectMask} member of that element of {@code pInputAttachments} <b>must</b> only include aspects that are present in images of the format specified by the element of {@code pAttachments} specified by {@code attachment}</li>
            <li>The {@code srcSubpass} member of each element of {@code pDependencies} <b>must</b> be less than {@code subpassCount}</li>
            <li>The {@code dstSubpass} member of each element of {@code pDependencies} <b>must</b> be less than {@code subpassCount}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>If {@code attachmentCount} is not 0, {@code pAttachments} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid ##VkAttachmentDescription2KHR structures</li>
            <li>{@code pSubpasses} <b>must</b> be a valid pointer to an array of {@code subpassCount} valid ##VkSubpassDescription2KHR structures</li>
            <li>If {@code dependencyCount} is not 0, {@code pDependencies} <b>must</b> be a valid pointer to an array of {@code dependencyCount} valid ##VkSubpassDependency2KHR structures</li>
            <li>If {@code correlatedViewMaskCount} is not 0, {@code pCorrelatedViewMasks} <b>must</b> be a valid pointer to an array of {@code correlatedViewMaskCount} {@code uint32_t} values</li>
            <li>{@code subpassCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentDescription2KHR, ##VkSubpassDependency2KHR, ##VkSubpassDescription2KHR, #CreateRenderPass2KHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkRenderPassCreateFlags("flags", "reserved for future use.")
    AutoSize("pAttachments", optional = true)..uint32_t("attachmentCount", "the number of attachments used by this render pass.")
    VkAttachmentDescription2KHR.const.p("pAttachments", "points to an array of {@code attachmentCount} ##VkAttachmentDescription2KHR structures describing the attachments used by the render pass.")
    AutoSize("pSubpasses")..uint32_t("subpassCount", "the number of subpasses to create.")
    VkSubpassDescription2KHR.const.p("pSubpasses", "points to an array of {@code subpassCount} ##VkSubpassDescription2KHR structures describing each subpass.")
    AutoSize("pDependencies", optional = true)..uint32_t("dependencyCount", "the number of dependencies between pairs of subpasses.")
    VkSubpassDependency2KHR.const.p("pDependencies", "points to an array of {@code dependencyCount} ##VkSubpassDependency2KHR structures describing dependencies between pairs of subpasses.")
    AutoSize("pCorrelatedViewMasks", optional = true)..uint32_t("correlatedViewMaskCount", "the number of correlation masks.")
    uint32_t.const.p("pCorrelatedViewMasks", "an array of view masks indicating sets of views that <b>may</b> be more efficient to render concurrently.")
}

val VkSubpassBeginInfoKHR = struct(Module.VULKAN, "VkSubpassBeginInfoKHR") {
    documentation =
        """
        Structure specifying subpass begin info.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SUBPASS_BEGIN_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code contents} <b>must</b> be a valid {@code VkSubpassContents} value</li>
        </ul>

        <h5>See Also</h5>
        #CmdBeginRenderPass2KHR(), #CmdNextSubpass2KHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSubpassContents("contents", "a {@code VkSubpassContents} value specifying how the commands in the next subpass will be provided.")
}

val VkSubpassEndInfoKHR = struct(Module.VULKAN, "VkSubpassEndInfoKHR") {
    documentation =
        """
        Structure specifying subpass end info.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SUBPASS_END_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #CmdEndRenderPass2KHR(), #CmdNextSubpass2KHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
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

        <h6>Handle Types Supported by VkImportFenceWin32HandleInfoKHR</h6>
        <table class="lwjgl">
            <thead><tr><th>Handle Type</th><th>Transference</th><th>Permanence Supported</th></tr></thead>
            <tbody>
                <tr><td>#EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT</td><td>Reference</td><td>Temporary,Permanent</td></tr>
                <tr><td>#EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT</td><td>Reference</td><td>Temporary,Permanent</td></tr>
            </tbody>
        </table>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-fence-handletypes-win32">Handle Types Supported by VkImportFenceWin32HandleInfoKHR</a> table.</li>
            <li>If {@code handleType} is not #EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT, {@code name} <b>must</b> be {@code NULL}.</li>
            <li>If {@code handleType} is not 0 and {@code handle} is {@code NULL}, {@code name} <b>must</b> name a valid synchronization primitive of the type specified by {@code handleType}.</li>
            <li>If {@code handleType} is not 0 and {@code name} is {@code NULL}, {@code handle} <b>must</b> be a valid handle of the type specified by {@code handleType}.</li>
            <li>If {@code handle} is not {@code NULL}, {@code name} must be {@code NULL}.</li>
            <li>If {@code handle} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#external-fence-handle-types-compatibility">external fence handle types compatibility</a>.</li>
            <li>If {@code name} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#external-fence-handle-types-compatibility">external fence handle types compatibility</a>.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkFenceImportFlagBits} values</li>
            <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalFenceHandleTypeFlagBits} value</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        #ImportFenceWin32HandleKHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkFence("fence", "the fence into which the state will be imported.")
    VkFenceImportFlags("flags", "a bitmask of {@code VkFenceImportFlagBits} specifying additional parameters for the fence payload import operation.")
    VkExternalFenceHandleTypeFlagBits("handleType", "specifies the type of {@code handle}.")
    HANDLE("handle", "the external handle to import, or {@code NULL}.")
    LPCWSTR("name", "the NULL-terminated UTF-16 string naming the underlying synchronization primitive to import, or {@code NULL}.")
}

val VkExportFenceWin32HandleInfoKHR = struct(Module.VULKAN, "VkExportFenceWin32HandleInfoKHR") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        Structure specifying additional attributes of Windows handles exported from a fence.

        <h5>Description</h5>
        If this structure is not present, or if {@code pAttributes} is set to {@code NULL}, default security descriptor values will be used, and child processes created by the application will not inherit the handle, as described in the MSDN documentation for "{@code Synchronization Object Security and Access Rights}"<sup>1</sup>. Further, if the structure is not present, the access rights will be

        {@code DXGI_SHARED_RESOURCE_READ} | {@code DXGI_SHARED_RESOURCE_WRITE}

        for handles of the following types:

        #EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT

        <dl>
            <dt>1</dt>
            <dd><a target="_blank" href="https://msdn.microsoft.com/en-us/library/windows/desktop/ms686670.aspx">https://msdn.microsoft.com/en-us/library/windows/desktop/ms686670.aspx</a></dd>
        </dl>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkExportFenceCreateInfo{@code ::handleTypes} does not include #EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT, ##VkExportFenceWin32HandleInfoKHR <b>must</b> not be in the {@code pNext} chain of ##VkFenceCreateInfo.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR</li>
            <li>If {@code pAttributes} is not {@code NULL}, {@code pAttributes} <b>must</b> be a valid pointer to a valid {@code SECURITY_ATTRIBUTES} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    nullable..SECURITY_ATTRIBUTES.const.p("pAttributes", "a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.")
    DWORD("dwAccess", "a {@code DWORD} specifying access rights of the handle.")
    LPCWSTR("name", "a NULL-terminated UTF-16 string to associate with the underlying synchronization primitive referenced by NT handles exported from the created fence.")
}

val VkFenceGetWin32HandleInfoKHR = struct(Module.VULKAN, "VkFenceGetWin32HandleInfoKHR") {
    documentation =
        """
        Structure describing a Win32 handle fence export operation.

        <h5>Description</h5>
        The properties of the handle returned depend on the value of {@code handleType}. See {@code VkExternalFenceHandleTypeFlagBits} for a description of the properties of the defined external fence handle types.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> have been included in ##VkExportFenceCreateInfo{@code ::handleTypes} when the {@code fence}&#8217;s current payload was created.</li>
            <li>If {@code handleType} is defined as an NT handle, #GetFenceWin32HandleKHR() <b>must</b> be called no more than once for each valid unique combination of {@code fence} and {@code handleType}.</li>
            <li>{@code fence} <b>must</b> not currently have its payload replaced by an imported payload as described below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-fences-importing">Importing Fence Payloads</a> unless that imported payload&#8217;s handle type was included in ##VkExternalFenceProperties{@code ::exportFromImportedHandleTypes} for {@code handleType}.</li>
            <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code fence} <b>must</b> be signaled, or have an associated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-fences-signaling">fence signal operation</a> pending execution.</li>
            <li>{@code handleType} <b>must</b> be defined as an NT handle or a global share handle.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkFence("fence", "the fence from which state will be exported.")
    VkExternalFenceHandleTypeFlagBits("handleType", "the type of handle requested.")
}

val VkImportFenceFdInfoKHR = struct(Module.VULKAN, "VkImportFenceFdInfoKHR") {
    documentation =
        """
        (None).

        <h5>Description</h5>
        The handle types supported by {@code handleType} are:

        <h6>Handle Types Supported by VkImportFenceFdInfoKHR</h6>
        <table class="lwjgl">
            <thead><tr><th>Handle Type</th><th>Transference</th><th>Permanence Supported</th></tr></thead>
            <tbody>
                <tr><td>#EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT</td><td>Reference</td><td>Temporary,Permanent</td></tr>
                <tr><td>#EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT</td><td>Copy</td><td>Temporary</td></tr>
            </tbody>
        </table>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-fence-handletypes-fd">Handle Types Supported by VkImportFenceFdInfoKHR</a> table.</li>
            <li>{@code fd} <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#external-fence-handle-types-compatibility">external fence handle types compatibility</a>.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>{@code handleType} <b>must</b> have been included in ##VkExportFenceCreateInfo{@code ::handleTypes} when {@code fence}&#8217;s current payload was created.</li>
            <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code fence} <b>must</b> be signaled, or have an associated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-fences-signaling">fence signal operation</a> pending execution.</li>
            <li>{@code fence} <b>must</b> not currently have its payload replaced by an imported payload as described below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-fences-importing">Importing Fence Payloads</a> unless that imported payload&#8217;s handle type was included in ##VkExternalFenceProperties{@code ::exportFromImportedHandleTypes} for {@code handleType}.</li>
            <li>{@code handleType} <b>must</b> be defined as a POSIX file descriptor handle.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkFence("fence", "the fence from which state will be exported.")
    VkExternalFenceHandleTypeFlagBits("handleType", "the type of handle requested.")
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

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
        </ul>

        <h5>See Also</h5>
        #GetPhysicalDeviceSurfaceCapabilities2KHR(), #GetPhysicalDeviceSurfaceFormats2KHR()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSurfaceKHR("surface", "the surface that will be associated with the swapchain.")
}

val VkSurfaceCapabilities2KHR = struct(Module.VULKAN, "VkSurfaceCapabilities2KHR", mutable = false) {
    documentation =
        """
        Structure describing capabilities of a surface.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkSharedPresentSurfaceCapabilitiesKHR</li>
        </ul>

        <h5>See Also</h5>
        ##VkSurfaceCapabilitiesKHR, #GetPhysicalDeviceSurfaceCapabilities2KHR()
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkSurfaceCapabilitiesKHR("surfaceCapabilities", "a structure of type ##VkSurfaceCapabilitiesKHR describing the capabilities of the specified surface.")
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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkSurfaceFormatKHR("surfaceFormat", "an instance of ##VkSurfaceFormatKHR describing a format-color space pair that is compatible with the specified surface.")
}

val VkPhysicalDeviceVariablePointerFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVariablePointerFeaturesKHR", alias = VkPhysicalDeviceVariablePointerFeatures) {
    documentation = "See ##VkPhysicalDeviceVariablePointerFeatures."

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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkDisplayPropertiesKHR("displayProperties", "an instance of the ##VkDisplayPropertiesKHR structure.")
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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkDisplayPlanePropertiesKHR("displayPlaneProperties", "an instance of the ##VkDisplayPlanePropertiesKHR structure.")
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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkDisplayModePropertiesKHR("displayModeProperties", "an instance of the ##VkDisplayModePropertiesKHR structure.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkDisplayPlaneCapabilitiesKHR("capabilities", "an instance of the ##VkDisplayPlaneCapabilitiesKHR structure.")
}

val VkMacOSSurfaceCreateInfoMVK = struct(Module.VULKAN, "VkMacOSSurfaceCreateInfoMVK") {
    documentation =
        """
        Structure specifying parameters of a newly created macOS surface object.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pView} <b>must</b> be a valid {@code NSView} and <b>must</b> be backed by a {@code CALayer} instance of type {@code CAMetalLayer}.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkMacOSSurfaceCreateFlagsMVK("flags", "reserved for future use.")
    opaque_const_p("pView", "a reference to a {@code NSView} object which will display this surface. This {@code NSView} <b>must</b> be backed by a {@code CALayer} instance of type {@code CAMetalLayer}.")
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

val VkDebugUtilsObjectNameInfoEXT = struct(Module.VULKAN, "VkDebugUtilsObjectNameInfoEXT") {
    documentation =
        """
        Specify parameters of a name to give to an object.

        <h5>Description</h5>
        Applications <b>may</b> change the name associated with an object simply by calling {@code vkSetDebugUtilsObjectNameEXT} again with a new string. If {@code pObjectName} is an empty string, then any previously set name is removed.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code objectType} is #OBJECT_TYPE_UNKNOWN, {@code objectHandle} <b>must</b> not be #NULL_HANDLE</li>
            <li>If {@code objectType} is not #OBJECT_TYPE_UNKNOWN, {@code objectHandle} <b>must</b> be #NULL_HANDLE or a valid Vulkan handle of the type associated with {@code objectType} as defined in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#debugging-object-types">VkObjectType and Vulkan Handle Relationship</a> table</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkObjectType("objectType", "a {@code VkObjectType} specifying the type of the object to be named.")
    uint64_t("objectHandle", "the object to be named.")
    nullable..charUTF8.const.p("pObjectName", "a null-terminated UTF-8 string specifying the name to apply to {@code objectHandle}.")
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
            <li>{@code objectHandle} <b>must</b> be a valid Vulkan handle of the type associated with {@code objectType} as defined in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#debugging-object-types">VkObjectType and Vulkan Handle Relationship</a> table</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkObjectType("objectType", "a {@code VkObjectType} specifying the type of the object to be named.")
    uint64_t("objectHandle", "the object to be tagged.")
    uint64_t("tagName", "a numerical identifier of the tag.")
    AutoSize("pTag")..size_t("tagSize", "the number of bytes of data to attach to the object.")
    void.const.p("pTag", "an array of {@code tagSize} bytes containing the data to be associated with the object.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    charUTF8.const.p("pLabelName", "a pointer to a null-terminated UTF-8 string that contains the name of the label.")
    float("color", "an optional RGBA color value that can be associated with the label. A particular implementation <b>may</b> choose to ignore this color value. The values contain RGBA values in order, in the range 0.0 to 1.0. If all elements in {@code color} are set to 0.0 then it is ignored.")[4]
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
        {@code pQueueLabels} will only be non-NULL if one of the objects in {@code pObjects} can be related directly to a defined {@code VkQueue} which has had one or more labels associated with it.

        Likewise, {@code pCmdBufLabels} will only be non-NULL if one of the objects in {@code pObjects} can be related directly to a defined {@code VkCommandBuffer} which has had one or more labels associated with it. Additionally, while command buffer labels allow for beginning and ending across different command buffers, the debug messaging framework <b>cannot</b> guarantee that labels in {@code pCmdBufLables} will contain those defined outside of the associated command buffer. This is partially due to the fact that the association of one command buffer with another may not have been defined at the time the debug message is triggered.
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDebugUtilsMessengerCallbackDataFlagsEXT("flags", "0 and reserved for future use.")
    nullable..charUTF8.const.p("pMessageIdName", "a null-terminated string that identifies the particular message ID that is associated with the provided message. If the message corresponds to a validation layer message, then this string may contain the portion of the Vulkan specification that is believed to have been violated.")
    int32_t("messageIdNumber", "the ID number of the triggering message. If the message corresponds to a validation layer message, then this number is related to the internal number associated with the message being triggered.")
    charUTF8.const.p("pMessage", "a null-terminated string detailing the trigger conditions.")
    AutoSize("pQueueLabels", optional = true)..uint32_t("queueLabelCount", "a count of items contained in the {@code pQueueLabels} array.")
    VkDebugUtilsLabelEXT.const.p("pQueueLabels", "NULL or a pointer to an array of ##VkDebugUtilsLabelEXT active in the current {@code VkQueue} at the time the callback was triggered. Refer to <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#debugging-queue-labels\">Queue Labels</a> for more information.")
    AutoSize("pCmdBufLabels", optional = true)..uint32_t("cmdBufLabelCount", "a count of items contained in the {@code pCmdBufLabels} array.")
    VkDebugUtilsLabelEXT.const.p("pCmdBufLabels", "NULL or a pointer to an array of ##VkDebugUtilsLabelEXT active in the current {@code VkCommandBuffer} at the time the callback was triggered. Refer to <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#debugging-command-buffer-labels\">Command Buffer Labels</a> for more information.")
    AutoSize("pObjects", optional = true)..uint32_t("objectCount", "a count of items contained in the {@code pObjects} array.")
    VkDebugUtilsObjectNameInfoEXT.const.p("pObjects", "a pointer to an array of ##VkDebugUtilsObjectNameInfoEXT objects related to the detected issue. The array is roughly in order or importance, but the 0th element is always guaranteed to be the most important object for this message.")
}

val VkDebugUtilsMessengerCreateInfoEXT = struct(Module.VULKAN, "VkDebugUtilsMessengerCreateInfoEXT") {
    documentation =
        """
        Structure specifying parameters of a newly created debug messenger.

        <h5>Description</h5>
        For each {@code VkDebugUtilsMessengerEXT} that is created the ##VkDebugUtilsMessengerCreateInfoEXT{@code ::messageSeverity} and ##VkDebugUtilsMessengerCreateInfoEXT{@code ::messageType} determine when that ##VkDebugUtilsMessengerCreateInfoEXT{@code ::pfnUserCallback} is called. The process to determine if the user's pfnUserCallback is triggered when an event occurs is as follows:

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
        </ul>

        <h5>See Also</h5>
        ##VkDebugUtilsMessengerCallbackEXT, #CreateDebugUtilsMessengerEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDebugUtilsMessengerCreateFlagsEXT("flags", "0 and reserved for future use.")
    VkDebugUtilsMessageSeverityFlagsEXT("messageSeverity", "a bitmask of {@code VkDebugUtilsMessageSeverityFlagBitsEXT} specifying which severity of event(s) will cause this callback to be called.")
    VkDebugUtilsMessageTypeFlagsEXT("messageType", "a bitmask of {@code VkDebugUtilsMessageTypeFlagBitsEXT} specifying which type of event(s) will cause this callback to be called.")
    PFN_vkDebugUtilsMessengerCallbackEXT("pfnUserCallback", "the application callback function to call.")
    nullable..opaque_p("pUserData", "user data to be passed to the callback.")
}

val VkSamplerReductionModeCreateInfoEXT = struct(Module.VULKAN, "VkSamplerReductionModeCreateInfoEXT") {
    documentation =
        """
        Structure specifying sampler reduction mode.

        <h5>Description</h5>
        If this structure is not present, {@code reductionMode} is considered to be #SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO_EXT</li>
            <li>{@code reductionMode} <b>must</b> be a valid {@code VkSamplerReductionModeEXT} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSamplerReductionModeEXT("reductionMode", "an enum of type {@code VkSamplerReductionModeEXT} that controls how texture filtering combines texel values.")
}

val VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing sampler filter minmax limits that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        If {@code filterMinmaxSingleComponentFormats} is #TRUE, the following formats <b>must</b> support the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT_EXT feature with #IMAGE_TILING_OPTIMAL, if they support #FORMAT_FEATURE_SAMPLED_IMAGE_BIT.

        <ul>
            <li>#FORMAT_R8_UNORM</li>
            <li>#FORMAT_R8_SNORM</li>
            <li>#FORMAT_R16_UNORM</li>
            <li>#FORMAT_R16_SNORM</li>
            <li>#FORMAT_R16_SFLOAT</li>
            <li>#FORMAT_R32_SFLOAT</li>
            <li>#FORMAT_D16_UNORM</li>
            <li>#FORMAT_X8_D24_UNORM_PACK32</li>
            <li>#FORMAT_D32_SFLOAT</li>
            <li>#FORMAT_D16_UNORM_S8_UINT</li>
            <li>#FORMAT_D24_UNORM_S8_UINT</li>
            <li>#FORMAT_D32_SFLOAT_S8_UINT</li>
        </ul>

        If the format is a depth/stencil format, this bit only specifies that the depth aspect (not the stencil aspect) of an image of this format supports min/max filtering, and that min/max filtering of the depth aspect is supported when depth compare is disabled in the sampler.

        If {@code filterMinmaxImageComponentMapping} is #FALSE the component mapping of the image view used with min/max filtering <b>must</b> have been created with the {@code r} component set to #COMPONENT_SWIZZLE_IDENTITY. Only the {@code r} component of the sampled image value is defined and the other component values are undefined. If {@code filterMinmaxImageComponentMapping} is #TRUE this restriction does not apply and image component mapping works as normal.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkBool32("filterMinmaxSingleComponentFormats", "a boolean value indicating whether a minimum set of required formats support min/max filtering.")
    VkBool32("filterMinmaxImageComponentMapping", "a boolean value indicating whether the implementation supports non-identity component mapping of the image when doing min/max filtering.")
}

val VkPhysicalDeviceInlineUniformBlockFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceInlineUniformBlockFeaturesEXT") {
    documentation =
        """
        Structure describing inline uniform block features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceInlineUniformBlockFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceInlineUniformBlockFeaturesEXT <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("inlineUniformBlock", "indicates whether the implementation supports inline uniform block descriptors. If this feature is not enabled, #DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT <b>must</b> not be used.")
    VkBool32("descriptorBindingInlineUniformBlockUpdateAfterBind", "indicates whether the implementation supports updating inline uniform block descriptors after a set is bound. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT <b>must</b> not be used with #DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT.")
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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    uint32_t("maxInlineUniformBlockSize", "the maximum size in bytes of an <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#descriptorsets-inlineuniformblock\">inline uniform block</a> binding.")
    uint32_t("maxPerStageDescriptorInlineUniformBlocks", "")
    uint32_t("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks", "similar to {@code maxPerStageDescriptorInlineUniformBlocks} but counts descriptor bindings from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t("maxDescriptorSetInlineUniformBlocks", "the maximum number of inline uniform block bindings that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptor bindings with a descriptor type of #DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT count against this limit. Only descriptor bindings in descriptor set layouts created without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set count against this limit.")
    uint32_t("maxDescriptorSetUpdateAfterBindInlineUniformBlocks", "similar to {@code maxDescriptorSetInlineUniformBlocks} but counts descriptor bindings from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t("maxInlineUniformBlockBindings", "the number of inline uniform block bindings to allocate.")
}

val VkSampleLocationEXT = struct(Module.VULKAN, "VkSampleLocationEXT") {
    documentation =
        """
        Structure specifying the coordinates of a sample location.

        <h5>Description</h5>
        The domain space of the sample location coordinates has an upper-left origin within the pixel in framebuffer space.

        The values specified in a ##VkSampleLocationEXT structure are always clamped to the implementation-dependent sample location coordinate range <code>[sampleLocationCoordinateRange[0],sampleLocationCoordinateRange[1]]</code> that <b>can</b> be queried by chaining the ##VkPhysicalDeviceSampleLocationsPropertiesEXT structure to the {@code pNext} chain of ##VkPhysicalDeviceProperties2.

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

        The sample locations in {@code pSampleLocations} specify {@code sampleLocationsPerPixel} number of sample locations for each pixel in the grid of the size specified in {@code sampleLocationGridSize}. The sample location for sample <code>i</code> at the pixel grid location <code>(x,y)</code> is taken from <code>pSampleLocations[(x + y <b> sampleLocationGridSize.width) </b> sampleLocationsPerPixel + i]</code>.

        If the render pass has a fragment density map, the implementation will choose the sample locations for the fragment and the contents of {@code pSampleLocations} <b>may</b> be ignored.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code sampleLocationsPerPixel} <b>must</b> be a bit value that is set in ##VkPhysicalDeviceSampleLocationsPropertiesEXT{@code ::sampleLocationSampleCounts}</li>
            <li>{@code sampleLocationsCount} <b>must</b> equal <code>sampleLocationsPerPixel × sampleLocationGridSize.width × sampleLocationGridSize.height</code></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT</li>
            <li>If {@code sampleLocationsPerPixel} is not 0, {@code sampleLocationsPerPixel} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
            <li>If {@code sampleLocationsCount} is not 0, {@code pSampleLocations} <b>must</b> be a valid pointer to an array of {@code sampleLocationsCount} ##VkSampleLocationEXT structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentSampleLocationsEXT, ##VkExtent2D, ##VkPipelineSampleLocationsStateCreateInfoEXT, ##VkSampleLocationEXT, ##VkSubpassSampleLocationsEXT, #CmdSetSampleLocationsEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSampleCountFlagBits("sampleLocationsPerPixel", "a {@code VkSampleCountFlagBits} specifying the number of sample locations per pixel.")
    VkExtent2D("sampleLocationGridSize", "the size of the sample location grid to select custom sample locations for.")
    AutoSize("pSampleLocations", optional = true)..uint32_t("sampleLocationsCount", "the number of sample locations in {@code pSampleLocations}.")
    VkSampleLocationEXT.const.p("pSampleLocations", "an array of {@code sampleLocationsCount} ##VkSampleLocationEXT structures.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pAttachmentInitialSampleLocations", optional = true)..uint32_t("attachmentInitialSampleLocationsCount", "the number of elements in the {@code pAttachmentInitialSampleLocations} array.")
    VkAttachmentSampleLocationsEXT.const.p("pAttachmentInitialSampleLocations", "an array of {@code attachmentInitialSampleLocationsCount} ##VkAttachmentSampleLocationsEXT structures specifying the attachment indices and their corresponding sample location state. Each element of {@code pAttachmentInitialSampleLocations} <b>can</b> specify the sample location state to use in the automatic layout transition performed to transition a depth/stencil attachment from the initial layout of the attachment to the image layout specified for the attachment in the first subpass using it.")
    AutoSize("pPostSubpassSampleLocations", optional = true)..uint32_t("postSubpassSampleLocationsCount", "the number of elements in the {@code pPostSubpassSampleLocations} array.")
    VkSubpassSampleLocationsEXT.const.p("pPostSubpassSampleLocations", "an array of {@code postSubpassSampleLocationsCount} ##VkSubpassSampleLocationsEXT structures specifying the subpass indices and their corresponding sample location state. Each element of {@code pPostSubpassSampleLocations} <b>can</b> specify the sample location state to use in the automatic layout transition performed to transition the depth/stencil attachment used by the specified subpass to the image layout specified in a dependent subpass or to the final layout of the attachment in case the specified subpass is the last subpass using that attachment. In addition, if ##VkPhysicalDeviceSampleLocationsPropertiesEXT{@code ::variableSampleLocations} is #FALSE, each element of {@code pPostSubpassSampleLocations} <b>must</b> specify the sample location state that matches the sample locations used by all pipelines that will be bound to a command buffer during the specified subpass. If {@code variableSampleLocations} is #TRUE, the sample locations used for rasterization do not depend on {@code pPostSubpassSampleLocations}.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
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

val VkImageFormatListCreateInfoKHR = struct(Module.VULKAN, "VkImageFormatListCreateInfoKHR") {
    documentation =
        """
        Specify that an image <b>can</b> be used with a particular set of formats.

        <h5>Description</h5>
        If {@code viewFormatCount} is zero, {@code pViewFormats} is ignored and the image is created as if the ##VkImageFormatListCreateInfoKHR structure were not included in the {@code pNext} list of ##VkImageCreateInfo.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code viewFormatCount} is not 0, all of the formats in the {@code pViewFormats} array <b>must</b> be compatible with the format specified in the {@code format} field of ##VkImageCreateInfo, as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-formats-compatibility">compatibility table</a>.</li>
            <li>If ##VkImageCreateInfo{@code ::flags} does not contain #IMAGE_CREATE_MUTABLE_FORMAT_BIT, {@code viewFormatCount} <b>must</b> be 0 or 1.</li>
            <li>If {@code viewFormatCount} is not 0, ##VkImageCreateInfo{@code ::format} <b>must</b> be in {@code pViewFormats}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO_KHR</li>
            <li>If {@code viewFormatCount} is not 0, {@code pViewFormats} <b>must</b> be a valid pointer to an array of {@code viewFormatCount} valid {@code VkFormat} values</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pViewFormats", optional = true)..uint32_t("viewFormatCount", "the number of entries in the {@code pViewFormats} array.")
    VkFormat.const.p("pViewFormats", "an array which lists of all formats which <b>can</b> be used when creating views of this image.")
}

val VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT") {
    documentation =
        """
        Structure describing advanced blending features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT <b>can</b> also be used in {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("advancedBlendCoherentOperations", "specifies whether blending using <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#framebuffer-blend-advanced\">advanced blend operations</a> is guaranteed to execute atomically and in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#drawing-primitive-order\">primitive order</a>. If this is #TRUE, #ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT is treated the same as #ACCESS_COLOR_ATTACHMENT_READ_BIT, and advanced blending needs no additional synchronization over basic blending. If this is #FALSE, then memory dependencies are required to guarantee order between two advanced blending operations that occur on the same sample.")
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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    uint32_t("advancedBlendMaxColorAttachments", "one greater than the highest color attachment index that <b>can</b> be used in a subpass, for a pipeline that uses an <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#framebuffer-blend-advanced\">advanced blend operation</a>.")
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
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-limits-advancedBlendNonPremultipliedSrcColor">non-premultiplied source color</a> property is not supported, {@code srcPremultiplied} <b>must</b> be #TRUE</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-limits-advancedBlendNonPremultipliedDstColor">non-premultiplied destination color</a> property is not supported, {@code dstPremultiplied} <b>must</b> be #TRUE</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-limits-advancedBlendCorrelatedOverlap">correlated overlap</a> property is not supported, {@code blendOverlap} <b>must</b> be #BLEND_OVERLAP_UNCORRELATED_EXT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT</li>
            <li>{@code blendOverlap} <b>must</b> be a valid {@code VkBlendOverlapEXT} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32("srcPremultiplied", "specifies whether the source color of the blend operation is treated as premultiplied.")
    VkBool32("dstPremultiplied", "specifies whether the destination color of the blend operation is treated as premultiplied.")
    VkBlendOverlapEXT("blendOverlap", "a {@code VkBlendOverlapEXT} value specifying how the source and destination sample&#8217;s coverage is correlated.")
}

val VkPipelineCoverageToColorStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineCoverageToColorStateCreateInfoNV") {
    documentation =
        """
        Structure specifying whether fragment coverage replaces a color.

        <h5>Description</h5>
        If {@code coverageToColorEnable} is #TRUE, the fragment coverage information is treated as a bitmask with one bit for each sample (as in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#fragops-samplemask">Sample Mask</a> section), and this bitmask replaces the first component of the color value corresponding to the fragment shader output location with {@code Location} equal to {@code coverageToColorLocation} and {@code Index} equal to zero. If the color attachment format has fewer bits than the sample coverage, the low bits of the sample coverage bitmask are taken without any clamping. If the color attachment format has more bits than the sample coverage, the high bits of the sample coverage bitmask are filled with zeros.

        If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#primsrast-sampleshading">Sample Shading</a> is in use, the coverage bitmask only has bits set for samples that correspond to the fragment shader invocation that shades those samples.

        This pipeline stage occurs after sample counting and before blending, and is always performed after fragment shading regardless of the setting of {@code EarlyFragmentTests}.

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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure")
    VkPipelineCoverageToColorStateCreateFlagsNV("flags", "reserved for future use.")
    VkBool32("coverageToColorEnable", "controls whether the fragment coverage value replaces a fragment color output.")
    uint32_t("coverageToColorLocation", "controls which fragment shader color output value is replaced.")
}

val VkPipelineCoverageModulationStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineCoverageModulationStateCreateInfoNV") {
    documentation =
        """
        Structure specifying parameters controlling coverage modulation.

        <h5>Description</h5>
        If {@code coverageModulationTableEnable} is #FALSE, then for each color sample the associated bits of the fragment's coverage are counted and divided by the number of associated bits to produce a modulation factor <code>R</code> in the range <code>(0,1]</code> (a value of zero would have been killed due to a color coverage of 0). Specifically:

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

        If this structure is not present, it is as if coverageModulationMode is #COVERAGE_MODULATION_MODE_NONE_NV.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code coverageModulationTableEnable} is #TRUE, {@code coverageModulationTableCount} <b>must</b> be equal to the number of rasterization samples divided by the number of color samples in the subpass.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code coverageModulationMode} <b>must</b> be a valid {@code VkCoverageModulationModeNV} value</li>
            <li>{@code coverageModulationTableCount} <b>must</b> be greater than 0</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineCoverageModulationStateCreateFlagsNV("flags", "reserved for future use.")
    VkCoverageModulationModeNV("coverageModulationMode", "controls which color components are modulated and is of type {@code VkCoverageModulationModeNV}.")
    VkBool32("coverageModulationTableEnable", "controls whether the modulation factor is looked up from a table in {@code pCoverageModulationTable}.")
    AutoSize("pCoverageModulationTable", optional = true)..uint32_t("coverageModulationTableCount", "the number of elements in {@code pCoverageModulationTable}.")
    nullable..float.const.p("pCoverageModulationTable", "a table of modulation factors containing a value for each number of covered samples.")
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

        An image's <em>memory planecount</em> (as returned by {@code drmFormatModifierPlaneCount}) is distinct from its <em>format planecount</em> (in the sense of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-formats-requiring-sampler-ycbcr-conversion">multi-planar</a> Y'C<sub>B</sub>C<sub>R</sub> formats). In {@code VkImageAspectFlags}, each {@code VK_IMAGE_ASPECT_MEMORY_PLANE___i___BIT_EXT} represents a <em>memory plane</em> and each {@code VK_IMAGE_ASPECT_PLANE___i___BIT} a <em>format plane</em>.

        An image's set of <em>format planes</em> is an ordered partition of the image's <b>content</b> into separable groups of format channels. The ordered partition is encoded in the name of each {@code VkFormat}. For example, #FORMAT_G8_B8R8_2PLANE_420_UNORM contains two <em>format planes</em>; the first plane contains the green channel and the second plane contains the blue channel and red channel. If the format name does not contain {@code PLANE}, then the format contains a single plane; for example, #FORMAT_R8G8B8A8_UNORM. Some commands, such as #CmdCopyBufferToImage(), do not operate on all format channels in the image, but instead operate only on the <em>format planes</em> explicitly chosen by the application and operate on each <em>format plane</em> independently.

        An image's set of <em>memory planes</em> is an ordered partition of the image's <b>memory</b> rather than the image's <b>content</b>. Each <em>memory plane</em> is a contiguous range of memory. The union of an image's <em>memory planes</em> is not necessarily contiguous.

        If an image is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#glossary-linear-resource">linear</a>, then the partition is the same for <em>memory planes</em> and for <em>format planes</em>. Therefore, if the returned {@code drmFormatModifier} is {@code DRM_FORMAT_MOD_LINEAR}, then {@code drmFormatModifierPlaneCount} <b>must</b> equal the <em>format planecount</em>, and {@code drmFormatModifierTilingFeatures} <b>must</b> be identical to the ##VkFormatProperties2{@code ::linearTilingFeatures} returned in the same {@code pNext} chain.

        If an image is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#glossary-linear-resource">non-linear</a>, then the partition of the image's <b>memory</b> into <em>memory planes</em> is implementation-specific and <b>may</b> be unrelated to the partition of the image's <b>content</b> into <em>format planes</em>. For example, consider an image whose {@code format} is #FORMAT_G8_B8_R8_3PLANE_420_UNORM, {@code tiling} is #IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT, whose {@code drmFormatModifier} is not {@code DRM_FORMAT_MOD_LINEAR}, and {@code flags} lacks #IMAGE_CREATE_DISJOINT_BIT. The image has 3 <em>format planes</em>, and commands such #CmdCopyBufferToImage() act on each <em>format plane</em> independently as if the data of each <em>format plane</em> were separable from the data of the other planes. In a straightforward implementation, the implementation <b>may</b> store the image's content in 3 adjacent <em>memory planes</em> where each <em>memory plane</em> corresponds exactly to a <em>format plane</em>. However, the implementation <b>may</b> also store the image's content in a single <em>memory plane</em> where all format channels are combined using an implementation-private block-compressed format; or the implementation <b>may</b> store the image's content in a collection of 7 adjacent <em>memory planes</em> using an implementation-private sharding technique. Because the image is non-linear and non-disjoint, the implementation has much freedom when choosing the image's placement in memory.

        The <em>memory planecount</em> applies to function parameters and structures only when the API specifies an explicit requirement on {@code drmFormatModifierPlaneCount}. In all other cases, the <em>memory planecount</em> is ignored.

        <h5>See Also</h5>
        ##VkDrmFormatModifierPropertiesListEXT
        """

    uint64_t("drmFormatModifier", "a <em>Linux DRM format modifier</em>.")
    uint32_t("drmFormatModifierPlaneCount", "the number of <em>memory planes</em> in any image created with {@code format} and {@code drmFormatModifier}. An image&#8217;s <em>memory planecount</em> is distinct from its <em>format planecount</em>, as explained below.")
    VkFormatFeatureFlags("drmFormatModifierTilingFeatures", "a bitmask of {@code VkFormatFeatureFlagBits} that are supported by any image created with {@code format} and {@code drmFormatModifier}.")
}

val VkDrmFormatModifierPropertiesListEXT = struct(Module.VULKAN, "VkDrmFormatModifierPropertiesListEXT") {
    documentation =
        """
        Structure specifying the list of DRM format modifiers supported for a format.

        <h5>Description</h5>
        If {@code pDrmFormatModifierProperties} is {@code NULL}, then the function returns in {@code drmFormatModifierCount} the number of modifiers compatible with the queried {@code format}. Otherwise, the application <b>must</b> set {@code drmFormatModifierCount} to the length of the array {@code pDrmFormatModifierProperties}; the function will write at most {@code drmFormatModifierCount} elements to the array, and will return in {@code drmFormatModifierCount} the number of elements written.

        Among the elements in array {@code pDrmFormatModifierProperties}, each returned {@code drmFormatModifier} <b>must</b> be unique.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT</li>
            <li>If {@code drmFormatModifierCount} is not 0, and {@code pDrmFormatModifierProperties} is not {@code NULL}, {@code pDrmFormatModifierProperties} <b>must</b> be a valid pointer to an array of {@code drmFormatModifierCount} ##VkDrmFormatModifierPropertiesEXT structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkDrmFormatModifierPropertiesEXT
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>If {@code sharingMode} is #SHARING_MODE_CONCURRENT, then {@code pQueueFamilyIndices} <b>must</b> be a valid pointer to an array of {@code queueFamilyIndexCount} {@code uint32_t} values.</li>
            <li>If {@code sharingMode} is #SHARING_MODE_CONCURRENT, then {@code queueFamilyIndexCount} <b>must</b> be greater than 1.</li>
            <li>If {@code sharingMode} is #SHARING_MODE_CONCURRENT, each element of {@code pQueueFamilyIndices} <b>must</b> be unique and <b>must</b> be less than the {@code pQueueFamilyPropertyCount} returned by #GetPhysicalDeviceQueueFamilyProperties2() for the {@code physicalDevice} that was used to create {@code device}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT</li>
            <li>{@code sharingMode} <b>must</b> be a valid {@code VkSharingMode} value</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>Each <em>modifier</em> in {@code pDrmFormatModifiers} must be compatible with the parameters in ##VkImageCreateInfo and its {@code pNext} chain, as determined by querying ##VkPhysicalDeviceImageFormatInfo2 extended with ##VkPhysicalDeviceImageDrmFormatModifierInfoEXT.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT</li>
            <li>{@code pDrmFormatModifiers} <b>must</b> be a valid pointer to an array of {@code drmFormatModifierCount} {@code uint64_t} values</li>
            <li>{@code drmFormatModifierCount} <b>must</b> be greater than 0</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pDrmFormatModifiers")..uint32_t("drmFormatModifierCount", "the length of the {@code pDrmFormatModifiers} array.")
    uint64_t.const.p("pDrmFormatModifiers", "an array of <em>Linux DRM format modifiers</em>.")
}

val VkImageDrmFormatModifierExplicitCreateInfoEXT = struct(Module.VULKAN, "VkImageDrmFormatModifierExplicitCreateInfoEXT") {
    documentation =
        """
        Specify that an image be created with the provided DRM format modifier and explicit memory layout.

        <h5>Description</h5>
        The i<sup>th</sup> member of {@code pPlaneLayouts} describes the layout of the image's i<sup>th</sup> <em>memory plane</em> (that is, {@code VK_IMAGE_ASPECT_MEMORY_PLANE___i___BIT_EXT}). In each element of {@code pPlaneLayouts}, the implementation <b>must</b> ignore {@code size}. The implementation calculates the size of each plane, which the application <b>can</b> query with #GetImageSubresourceLayout().

        When creating an image with ##VkImageDrmFormatModifierExplicitCreateInfoEXT, it is the application's responsibility to satisfy all +Valid Usage+ requirements. However, the implementation <b>must</b> validate that the provided {@code pPlaneLayouts}, when combined with the provided {@code drmFormatModifier} and other creation parameters in ##VkImageCreateInfo and its {@code pNext} chain, produce a valid image. (This validation is necessarily implementation-dependent and outside the scope of Vulkan, and therefore not described by +Valid Usage+ requirements). If this validation fails, then #CreateImage() returns #ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code drmFormatModifier} must be compatible with the parameters in ##VkImageCreateInfo and its {@code pNext} chain, as determined by querying ##VkPhysicalDeviceImageFormatInfo2KHR extended with ##VkPhysicalDeviceImageDrmFormatModifierInfoEXT.</li>
            <li>{@code drmFormatModifierPlaneCount} <b>must</b> be equal to the ##VkDrmFormatModifierPropertiesEXT{@code ::drmFormatModifierPlaneCount} associated with ##VkImageCreateInfo{@code ::format} and {@code drmFormatModifier}, as found by querying ##VkDrmFormatModifierPropertiesListEXT.</li>
            <li>For each element of {@code pPlaneLayouts}, {@code size} <b>must</b> be 0</li>
            <li>For each element of {@code pPlaneLayouts}, {@code arrayPitch} <b>must</b> be 0 if ##VkImageCreateInfo{@code ::arrayLayers} is 1.</li>
            <li>For each element of {@code pPlaneLayouts}, {@code depthPitch} <b>must</b> be 0 if ##VkImageCreateInfo{@code ::extent}{@code ::depth} is 1.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint64_t("drmFormatModifier", "the <em>Linux DRM format modifier</em> with which the image will be created.")
    AutoSize("pPlaneLayouts", optional = true)..uint32_t("drmFormatModifierPlaneCount", "the number of <em>memory planes</em> in the image (as reported by ##VkDrmFormatModifierPropertiesEXT) as well as the length of the {@code pPlaneLayouts} array.")
    VkSubresourceLayout.const.p("pPlaneLayouts", "an array of ##VkSubresourceLayout structures that describe the image&#8217;s <em>memory planes</em>.")
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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    uint64_t("drmFormatModifier", "returns the image&#8217;s <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#glossary-drm-format-modifier\">Linux DRM format modifier</a>.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkValidationCacheEXT("validationCache", "the validation cache object from which the results of prior validation attempts will be written, and to which new validation results for this {@code VkShaderModule} will be written (if not already present).")
}

val VkDescriptorSetLayoutBindingFlagsCreateInfoEXT = struct(Module.VULKAN, "VkDescriptorSetLayoutBindingFlagsCreateInfoEXT") {
    documentation =
        """
        Structure specifying creation flags for descriptor set layout bindings.

        <h5>Description</h5>
        If {@code bindingCount} is zero or if this structure is not in the {@code pNext} chain, the {@code VkDescriptorBindingFlagsEXT} for each descriptor set layout binding is considered to be zero. Otherwise, the descriptor set layout binding at ##VkDescriptorSetLayoutCreateInfo{@code ::pBindings}[i] uses the flags in {@code pBindingFlags}[i].

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code bindingCount} is not zero, {@code bindingCount} <b>must</b> equal ##VkDescriptorSetLayoutCreateInfo{@code ::bindingCount}</li>
            <li>If ##VkDescriptorSetLayoutCreateInfo{@code ::flags} includes #DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR, then all elements of {@code pBindingFlags} <b>must</b> not include #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT, #DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT, or #DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT</li>
            <li>If an element of {@code pBindingFlags} includes #DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT, then all other elements of ##VkDescriptorSetLayoutCreateInfo{@code ::pBindings} <b>must</b> have a smaller value of {@code binding}</li>
            <li>If ##VkPhysicalDeviceDescriptorIndexingFeaturesEXT{@code ::descriptorBindingUniformBufferUpdateAfterBind} is not enabled, all bindings with descriptor type #DESCRIPTOR_TYPE_UNIFORM_BUFFER <b>must</b> not use #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT</li>
            <li>If ##VkPhysicalDeviceDescriptorIndexingFeaturesEXT{@code ::descriptorBindingSampledImageUpdateAfterBind} is not enabled, all bindings with descriptor type #DESCRIPTOR_TYPE_SAMPLER, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, or #DESCRIPTOR_TYPE_SAMPLED_IMAGE <b>must</b> not use #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT</li>
            <li>If ##VkPhysicalDeviceDescriptorIndexingFeaturesEXT{@code ::descriptorBindingStorageImageUpdateAfterBind} is not enabled, all bindings with descriptor type #DESCRIPTOR_TYPE_STORAGE_IMAGE <b>must</b> not use #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT</li>
            <li>If ##VkPhysicalDeviceDescriptorIndexingFeaturesEXT{@code ::descriptorBindingStorageBufferUpdateAfterBind} is not enabled, all bindings with descriptor type #DESCRIPTOR_TYPE_STORAGE_BUFFER <b>must</b> not use #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT</li>
            <li>If ##VkPhysicalDeviceDescriptorIndexingFeaturesEXT{@code ::descriptorBindingUniformTexelBufferUpdateAfterBind} is not enabled, all bindings with descriptor type #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER <b>must</b> not use #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT</li>
            <li>If ##VkPhysicalDeviceDescriptorIndexingFeaturesEXT{@code ::descriptorBindingStorageTexelBufferUpdateAfterBind} is not enabled, all bindings with descriptor type #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER <b>must</b> not use #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT</li>
            <li>If ##VkPhysicalDeviceInlineUniformBlockFeaturesEXT{@code ::descriptorBindingInlineUniformBlockUpdateAfterBind} is not enabled, all bindings with descriptor type #DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT <b>must</b> not use #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT</li>
            <li>All bindings with descriptor type #DESCRIPTOR_TYPE_INPUT_ATTACHMENT, #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC, or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC <b>must</b> not use #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT</li>
            <li>If ##VkPhysicalDeviceDescriptorIndexingFeaturesEXT{@code ::descriptorBindingUpdateUnusedWhilePending} is not enabled, all elements of {@code pBindingFlags} <b>must</b> not include #DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT</li>
            <li>If ##VkPhysicalDeviceDescriptorIndexingFeaturesEXT{@code ::descriptorBindingPartiallyBound} is not enabled, all elements of {@code pBindingFlags} <b>must</b> not include #DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT</li>
            <li>If ##VkPhysicalDeviceDescriptorIndexingFeaturesEXT{@code ::descriptorBindingVariableDescriptorCount} is not enabled, all elements of {@code pBindingFlags} <b>must</b> not include #DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT</li>
            <li>If an element of {@code pBindingFlags} includes #DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT, that element&#8217;s {@code descriptorType} <b>must</b> not be #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT</li>
            <li>If {@code bindingCount} is not 0, and {@code pBindingFlags} is not {@code NULL}, {@code pBindingFlags} <b>must</b> be a valid pointer to an array of {@code bindingCount} valid combinations of {@code VkDescriptorBindingFlagBitsEXT} values</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pBindingFlags", optional = true)..uint32_t("bindingCount", "zero or the number of elements in {@code pBindingFlags}.")
    nullable..VkDescriptorBindingFlagsEXT.const.p("pBindingFlags", "a pointer to an array of {@code VkDescriptorBindingFlagsEXT} bitfields, one for each descriptor set layout binding.")
}

val VkPhysicalDeviceDescriptorIndexingFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorIndexingFeaturesEXT") {
    documentation =
        """
        Structure describing descriptor indexing features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceDescriptorIndexingFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2KHR, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceDescriptorIndexingFeaturesEXT <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("shaderInputAttachmentArrayDynamicIndexing", "indicates whether arrays of input attachments <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_INPUT_ATTACHMENT <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code InputAttachmentArrayDynamicIndexingEXT} capability.")
    VkBool32("shaderUniformTexelBufferArrayDynamicIndexing", "indicates whether arrays of uniform texel buffers <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code UniformTexelBufferArrayDynamicIndexingEXT} capability.")
    VkBool32("shaderStorageTexelBufferArrayDynamicIndexing", "indicates whether arrays of storage texel buffers <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageTexelBufferArrayDynamicIndexingEXT} capability.")
    VkBool32("shaderUniformBufferArrayNonUniformIndexing", "indicates whether arrays of uniform buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code UniformBufferArrayNonUniformIndexingEXT} capability.")
    VkBool32("shaderSampledImageArrayNonUniformIndexing", "indicates whether arrays of samplers or sampled images <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_SAMPLER, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, or #DESCRIPTOR_TYPE_SAMPLED_IMAGE <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code SampledImageArrayNonUniformIndexingEXT} capability.")
    VkBool32("shaderStorageBufferArrayNonUniformIndexing", "indicates whether arrays of storage buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageBufferArrayNonUniformIndexingEXT} capability.")
    VkBool32("shaderStorageImageArrayNonUniformIndexing", "indicates whether arrays of storage images <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_STORAGE_IMAGE <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageImageArrayNonUniformIndexingEXT} capability.")
    VkBool32("shaderInputAttachmentArrayNonUniformIndexing", "indicates whether arrays of input attachments <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_INPUT_ATTACHMENT <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code InputAttachmentArrayNonUniformIndexingEXT} capability.")
    VkBool32("shaderUniformTexelBufferArrayNonUniformIndexing", "indicates whether arrays of uniform texel buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code UniformTexelBufferArrayNonUniformIndexingEXT} capability.")
    VkBool32("shaderStorageTexelBufferArrayNonUniformIndexing", "indicates whether arrays of storage texel buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageTexelBufferArrayNonUniformIndexingEXT} capability.")
    VkBool32("descriptorBindingUniformBufferUpdateAfterBind", "indicates whether the implementation supports updating uniform buffer descriptors after a set is bound. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT <b>must</b> not be used with #DESCRIPTOR_TYPE_UNIFORM_BUFFER.")
    VkBool32("descriptorBindingSampledImageUpdateAfterBind", "indicates whether the implementation supports updating sampled image descriptors after a set is bound. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT <b>must</b> not be used with #DESCRIPTOR_TYPE_SAMPLER, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, or #DESCRIPTOR_TYPE_SAMPLED_IMAGE.")
    VkBool32("descriptorBindingStorageImageUpdateAfterBind", "indicates whether the implementation supports updating storage image descriptors after a set is bound. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT <b>must</b> not be used with #DESCRIPTOR_TYPE_STORAGE_IMAGE.")
    VkBool32("descriptorBindingStorageBufferUpdateAfterBind", "indicates whether the implementation supports updating storage buffer descriptors after a set is bound. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT <b>must</b> not be used with #DESCRIPTOR_TYPE_STORAGE_BUFFER.")
    VkBool32("descriptorBindingUniformTexelBufferUpdateAfterBind", "indicates whether the implementation supports updating uniform texel buffer descriptors after a set is bound. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT <b>must</b> not be used with #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER.")
    VkBool32("descriptorBindingStorageTexelBufferUpdateAfterBind", "indicates whether the implementation supports updating storage texel buffer descriptors after a set is bound. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT <b>must</b> not be used with #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER.")
    VkBool32("descriptorBindingUpdateUnusedWhilePending", "indicates whether the implementation supports updating descriptors while the set is in use. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT <b>must</b> not be used.")
    VkBool32("descriptorBindingPartiallyBound", "indicates whether the implementation supports statically using a descriptor set binding in which some descriptors are not valid. If this feature is not enabled, #DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT <b>must</b> not be used.")
    VkBool32("descriptorBindingVariableDescriptorCount", "indicates whether the implementation supports descriptor sets with a variable-sized last binding. If this feature is not enabled, #DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT <b>must</b> not be used.")
    VkBool32("runtimeDescriptorArray", "indicates whether the implementation supports the SPIR-V RuntimeDescriptorArrayEXT capability. If this feature is not enabled, descriptors <b>must</b> not be declared in runtime arrays.")
}

val VkPhysicalDeviceDescriptorIndexingPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorIndexingPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing descriptor indexing properties that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceDescriptorIndexingPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    uint32_t("maxUpdateAfterBindDescriptorsInAllPools", "the maximum number of descriptors (summed over all descriptor types) that <b>can</b> be created across all pools that are created with the #DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT bit set. Pool creation <b>may</b> fail when this limit is exceeded, or when the space this limit represents is unable to satisfy a pool creation due to fragmentation.")
    VkBool32("shaderUniformBufferArrayNonUniformIndexingNative", "a boolean value indicating whether uniform buffer descriptors natively support nonuniform indexing. If this is #FALSE, then a single dynamic instance of an instruction that nonuniformly indexes an array of uniform buffers <b>may</b> execute multiple times in order to access all the descriptors.")
    VkBool32("shaderSampledImageArrayNonUniformIndexingNative", "a boolean value indicating whether sampler and image descriptors natively support nonuniform indexing. If this is #FALSE, then a single dynamic instance of an instruction that nonuniformly indexes an array of samplers or images <b>may</b> execute multiple times in order to access all the descriptors.")
    VkBool32("shaderStorageBufferArrayNonUniformIndexingNative", "a boolean value indicating whether storage buffer descriptors natively support nonuniform indexing. If this is #FALSE, then a single dynamic instance of an instruction that nonuniformly indexes an array of storage buffers <b>may</b> execute multiple times in order to access all the descriptors.")
    VkBool32("shaderStorageImageArrayNonUniformIndexingNative", "a boolean value indicating whether storage image descriptors natively support nonuniform indexing. If this is #FALSE, then a single dynamic instance of an instruction that nonuniformly indexes an array of storage images <b>may</b> execute multiple times in order to access all the descriptors.")
    VkBool32("shaderInputAttachmentArrayNonUniformIndexingNative", "a boolean value indicating whether input attachment descriptors natively support nonuniform indexing. If this is #FALSE, then a single dynamic instance of an instruction that nonuniformly indexes an array of input attachments <b>may</b> execute multiple times in order to access all the descriptors.")
    VkBool32("robustBufferAccessUpdateAfterBind", "a boolean value indicating whether <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#features-features-robustBufferAccess\">{@code robustBufferAccess}</a> <b>can</b> be enabled in a device simultaneously with {@code descriptorBindingUniformBufferUpdateAfterBind}, {@code descriptorBindingStorageBufferUpdateAfterBind}, {@code descriptorBindingUniformTexelBufferUpdateAfterBind}, and/or {@code descriptorBindingStorageTexelBufferUpdateAfterBind}. If this is #FALSE, then either {@code robustBufferAccess} <b>must</b> be disabled or all of these update-after-bind features <b>must</b> be disabled.")
    VkBool32("quadDivergentImplicitLod", "a boolean value indicating whether implicit level of detail calculations for image operations have well-defined results when the image and/or sampler objects used for the instruction are not uniform within a quad. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#textures-derivative-image-operations\">Derivative Image Operations</a>.")
    uint32_t("maxPerStageDescriptorUpdateAfterBindSamplers", "similar to {@code maxPerStageDescriptorSamplers} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t("maxPerStageDescriptorUpdateAfterBindUniformBuffers", "similar to {@code maxPerStageDescriptorUniformBuffers} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t("maxPerStageDescriptorUpdateAfterBindStorageBuffers", "similar to {@code maxPerStageDescriptorStorageBuffers} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t("maxPerStageDescriptorUpdateAfterBindSampledImages", "similar to {@code maxPerStageDescriptorSampledImages} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t("maxPerStageDescriptorUpdateAfterBindStorageImages", "similar to {@code maxPerStageDescriptorStorageImages} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t("maxPerStageDescriptorUpdateAfterBindInputAttachments", "similar to {@code maxPerStageDescriptorInputAttachments} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t("maxPerStageUpdateAfterBindResources", "similar to {@code maxPerStageResources} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t("maxDescriptorSetUpdateAfterBindSamplers", "similar to {@code maxDescriptorSetSamplers} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t("maxDescriptorSetUpdateAfterBindUniformBuffers", "similar to {@code maxDescriptorSetUniformBuffers} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic", "similar to {@code maxDescriptorSetUniformBuffersDynamic} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageBuffers", "similar to {@code maxDescriptorSetStorageBuffers} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic", "similar to {@code maxDescriptorSetStorageBuffersDynamic} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t("maxDescriptorSetUpdateAfterBindSampledImages", "similar to {@code maxDescriptorSetSampledImages} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageImages", "similar to {@code maxDescriptorSetStorageImages} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t("maxDescriptorSetUpdateAfterBindInputAttachments", "similar to {@code maxDescriptorSetInputAttachments} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
}

val VkDescriptorSetVariableDescriptorCountAllocateInfoEXT = struct(Module.VULKAN, "VkDescriptorSetVariableDescriptorCountAllocateInfoEXT") {
    documentation =
        """
        Structure specifying additional allocation parameters for descriptor sets.

        <h5>Description</h5>
        If {@code descriptorSetCount} is zero or this structure is not included in the {@code pNext} chain, then the variable lengths are considered to be zero. Otherwise, {@code pDescriptorCounts}[i] is the number of descriptors in the variable count descriptor binding in the corresponding descriptor set layout. If the variable count descriptor binding in the corresponding descriptor set layout has a descriptor type of #DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT then {@code pDescriptorCounts}[i] specifies the binding's capacity in bytes. If ##VkDescriptorSetAllocateInfo{@code ::pSetLayouts}[i] does not include a variable count descriptor binding, then {@code pDescriptorCounts}[i] is ignored.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code descriptorSetCount} is not zero, {@code descriptorSetCount} <b>must</b> equal ##VkDescriptorSetAllocateInfo{@code ::descriptorSetCount}</li>
            <li>If sVkDescriptorSetAllocateInfo{@code ::pSetLayouts}[i] has a variable descriptor count binding, then {@code pDescriptorCounts}[i] <b>must</b> be less than or equal to the descriptor count specified for that binding when the descriptor set layout was created.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO_EXT</li>
            <li>If {@code descriptorSetCount} is not 0, {@code pDescriptorCounts} <b>must</b> be a valid pointer to an array of {@code descriptorSetCount} {@code uint32_t} values</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pDescriptorCounts", optional = true)..uint32_t("descriptorSetCount", "zero or the number of elements in {@code pDescriptorCounts}.")
    uint32_t.const.p("pDescriptorCounts", "an array of descriptor counts, with each member specifying the number of descriptors in a variable descriptor count binding in the corresponding descriptor set being allocated.")
}

val VkDescriptorSetVariableDescriptorCountLayoutSupportEXT = struct(Module.VULKAN, "VkDescriptorSetVariableDescriptorCountLayoutSupportEXT", mutable = false) {
    documentation =
        """
        Structure returning information about whether a descriptor set layout can be supported.

        <h5>Description</h5>
        If the create info includes a variable-sized descriptor, then {@code supported} is determined assuming the requested size of the variable-sized descriptor, and {@code maxVariableDescriptorCount} is set to the maximum size of that descriptor that <b>can</b> be successfully created (which is greater than or equal to the requested size passed in). If the create info does not include a variable-sized descriptor or if the ##VkPhysicalDeviceDescriptorIndexingFeaturesEXT{@code ::descriptorBindingVariableDescriptorCount} feature is not enabled, then {@code maxVariableDescriptorCount} is set to zero. For the purposes of this command, a variable-sized descriptor binding with a {@code descriptorCount} of zero is treated as if the {@code descriptorCount} is one, and thus the binding is not ignored and the maximum descriptor count will be returned. If the layout is not supported, then the value written to {@code maxVariableDescriptorCount} is undefined.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    uint32_t("maxVariableDescriptorCount", "indicates the maximum number of descriptors supported in the highest numbered binding of the layout, if that binding is variable-sized. If the highest numbered binding of the layout has a descriptor type of #DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT then {@code maxVariableDescriptorCount} indicates the maximum byte size supported for the binding, if that binding is variable-sized.")
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
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-features-multiViewport">multiple viewports</a> feature is not enabled, {@code viewportCount} <b>must</b> be 0 or 1</li>
            <li>{@code viewportCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxViewports}</li>
            <li>If {@code shadingRateImageEnable} is #TRUE, {@code viewportCount} <b>must</b> be equal to the {@code viewportCount} member of ##VkPipelineViewportStateCreateInfo</li>
            <li>If no element of the {@code pDynamicStates} member of {@code pDynamicState} is #DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV, {@code pShadingRatePalettes} <b>must</b> be a valid pointer to an array of {@code viewportCount} ##VkShadingRatePaletteNV structures</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV</li>
            <li>If {@code viewportCount} is not 0, and {@code pShadingRatePalettes} is not {@code NULL}, {@code pShadingRatePalettes} <b>must</b> be a valid pointer to an array of {@code viewportCount} valid ##VkShadingRatePaletteNV structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkShadingRatePaletteNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32("shadingRateImageEnable", "specifies whether shading rate image and palettes are used during rasterization.")
    AutoSize("pShadingRatePalettes", optional = true)..uint32_t("viewportCount", "specifies the number of per-viewport palettes used to translate values stored in shading rate images.")
    nullable..VkShadingRatePaletteNV.const.p("pShadingRatePalettes", "a pointer to an array of ##VkShadingRatePaletteNV structures defining the palette for each viewport. If the shading rate palette state is dynamic, this member is ignored.")
}

val VkPhysicalDeviceShadingRateImageFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceShadingRateImageFeaturesNV") {
    documentation =
        """
        Structure describing shading rate image features that can be supported by an implementation.

        <h5>Description</h5>
        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#primsrast-shading-rate-image">Shading Rate Image</a> for more information.

        If the ##VkPhysicalDeviceShadingRateImageFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2KHR, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceShadingRateImageFeaturesNV <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
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
            <li>{@code pixelX} <b>must</b> be less than the width (in pixels) of the fragment.</li>
            <li>{@code pixelY} <b>must</b> be less than the height (in pixels) of the fragment.</li>
            <li>{@code sample} <b>must</b> be less than the number of coverage samples in each pixel belonging to the fragment.</li>
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
        When using a custom sample ordering, element <em>i</em> in {@code pSampleLocations} specifies a specific pixel and per-pixel coverage sample number that corresponds to the coverage sample numbered <em>i</em> in the multi-pixel fragment.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code shadingRate} <b>must</b> be a shading rate that generates fragments with more than one pixel.</li>
            <li>{@code sampleCount} <b>must</b> correspond to a sample count enumerated in {@code VkSampleCountFlags} whose corresponding bit is set in ##VkPhysicalDeviceLimits{@code ::framebufferNoAttachmentsSampleCounts}.</li>
            <li>{@code sampleLocationCount} <b>must</b> be equal to the product of {@code sampleCount}, the fragment width for {@code shadingRate}, and the fragment height for {@code shadingRate}.</li>
            <li>{@code sampleLocationCount} <b>must</b> be less than or equal to the value of ##VkPhysicalDeviceShadingRateImagePropertiesNV{@code ::shadingRateMaxCoarseSamples}.</li>
            <li>The array {@code pSampleLocations} <b>must</b> contain exactly one entry for every combination of valid values for {@code pixelX}, {@code pixelY}, and {@code sample} in the structure ##VkCoarseSampleOrderCustomNV.</li>
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
    VkCoarseSampleLocationNV.const.p("pSampleLocations", "a pointer to an array of ##VkCoarseSampleOrderCustomNV structures that specifies the location of each sample in the custom ordering.")
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
            <li>The array {@code pCustomSampleOrders} <b>must</b> not contain two structures with matching values for both the {@code shadingRate} and {@code sampleCount} members.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkCoarseSampleOrderTypeNV("sampleOrderType", "specifies the mechanism used to order coverage samples in fragments larger than one pixel.")
    AutoSize("pCustomSampleOrders", optional = true)..uint32_t("customSampleOrderCount", "specifies the number of custom sample orderings to use when ordering coverage samples.")
    VkCoarseSampleOrderCustomNV.const.p("pCustomSampleOrders", "a pointer to an array of ##VkCoarseSampleOrderCustomNV structures, each of which specifies the coverage sample order for a single combination of fragment area and coverage sample count.")
}

val VkRayTracingShaderGroupCreateInfoNV = struct(Module.VULKAN, "VkRayTracingShaderGroupCreateInfoNV") {
    documentation =
        """
        Structure specifying shaders in a shader group.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code type} is #RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV then {@code generalShader} <b>must</b> be a valid index into {@code pStages} referring to a shader of #SHADER_STAGE_RAYGEN_BIT_NV, #SHADER_STAGE_MISS_BIT_NV, or #SHADER_STAGE_CALLABLE_BIT_NV</li>
            <li>If {@code type} is #RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV then {@code closestHitShader}, {@code anyHitShader}, and {@code intersectionShader} <b>must</b> be #SHADER_UNUSED_NV</li>
            <li>If {@code type} is #RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV then {@code intersectionShader} <b>must</b> be a valid index into {@code pStages} referring to a shader of #SHADER_STAGE_INTERSECTION_BIT_NV</li>
            <li>If {@code type} is #RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV then {@code intersectionShader} <b>must</b> be #SHADER_UNUSED_NV</li>
            <li>{@code closestHitShader} <b>must</b> be either #SHADER_UNUSED_NV or a valid index into {@code pStages} referring to a shader of #SHADER_STAGE_CLOSEST_HIT_BIT_NV</li>
            <li>{@code anyHitShader} <b>must</b> be either #SHADER_UNUSED_NV or a valid index into {@code pStages} referring to a shader of #SHADER_STAGE_ANY_HIT_BIT_NV</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code type} <b>must</b> be a valid {@code VkRayTracingShaderGroupTypeNV} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkRayTracingPipelineCreateInfoNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkRayTracingShaderGroupTypeNV("type", "the type of hit group specified in this structure.")
    uint32_t("generalShader", "the index of the ray generation, miss, or callable shader from ##VkRayTracingPipelineCreateInfoNV{@code ::pStages} in the group if the shader group has {@code type} of #RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV and #SHADER_UNUSED_NV otherwise.")
    uint32_t("closestHitShader", "the optional index of the closest hit shader from ##VkRayTracingPipelineCreateInfoNV{@code ::pStages} in the group if the shader group has {@code type} of #RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV or #RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV and #SHADER_UNUSED_NV otherwise.")
    uint32_t("anyHitShader", "the optional index of the any hit shader from ##VkRayTracingPipelineCreateInfoNV{@code ::pStages} in the group if the shader group has {@code type} of #RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV or #RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV and #SHADER_UNUSED_NV otherwise.")
    uint32_t("intersectionShader", "the index of the intersection shader from ##VkRayTracingPipelineCreateInfoNV{@code ::pStages} in the group if the shader group has {@code type} of #RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV and #SHADER_UNUSED_NV otherwise.")
}

val VkRayTracingPipelineCreateInfoNV = struct(Module.VULKAN, "VkRayTracingPipelineCreateInfoNV") {
    documentation =
        """
        Structure specifying parameters of a newly created ray tracing pipeline.

        <h5>Description</h5>
        The parameters {@code basePipelineHandle} and {@code basePipelineIndex} are described in more detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#pipelines-pipeline-derivatives">Pipeline Derivatives</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineIndex} is {@code -1}, {@code basePipelineHandle} <b>must</b> be a valid handle to a ray tracing {@code VkPipeline}</li>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is #NULL_HANDLE, {@code basePipelineIndex} <b>must</b> be a valid index into the calling command&#8217;s {@code pCreateInfos} parameter</li>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineIndex} is not {@code -1}, {@code basePipelineHandle} <b>must</b> be #NULL_HANDLE</li>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is not #NULL_HANDLE, {@code basePipelineIndex} <b>must</b> be {@code -1}</li>
            <li>The {@code stage} member of one element of {@code pStages} <b>must</b> be #SHADER_STAGE_RAYGEN_BIT_NV</li>
            <li>The shader code for the entry points identified by {@code pStages}, and the rest of the state identified by this structure <b>must</b> adhere to the pipeline linking rules described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#interfaces">Shader Interfaces</a> chapter</li>
            <li>{@code layout} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#descriptorsets-pipelinelayout-consistency">consistent</a> with all shaders specified in {@code pStages}</li>
            <li>The number of resources in {@code layout} accessible to each shader stage that is used by the pipeline <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxPerStageResources}</li>
            <li>{@code maxRecursionDepth} <b>must</b> be less than or equal to ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::maxRecursionDepth}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkPipelineCreateFlagBits} values</li>
            <li>{@code pStages} <b>must</b> be a valid pointer to an array of {@code stageCount} valid ##VkPipelineShaderStageCreateInfo structures</li>
            <li>{@code pGroups} <b>must</b> be a valid pointer to an array of {@code groupCount} valid ##VkRayTracingShaderGroupCreateInfoNV structures</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code stageCount} <b>must</b> be greater than 0</li>
            <li>{@code groupCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code basePipelineHandle}, and {@code layout} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineShaderStageCreateInfo, ##VkRayTracingShaderGroupCreateInfoNV, #CreateRayTracingPipelinesNV()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineCreateFlags("flags", "a bitmask of {@code VkPipelineCreateFlagBits} specifying how the pipeline will be generated.")
    AutoSize("pStages")..uint32_t("stageCount", "the number of entries in the {@code pStages} array.")
    VkPipelineShaderStageCreateInfo.const.p("pStages", "an array of size {@code stageCount} structures of type ##VkPipelineShaderStageCreateInfo describing the set of the shader stages to be included in the ray tracing pipeline.")
    AutoSize("pGroups")..uint32_t("groupCount", "the number of entries in the {@code pGroups} array.")
    VkRayTracingShaderGroupCreateInfoNV.const.p("pGroups", "an array of size {@code groupCount} structures of type ##VkRayTracingShaderGroupCreateInfoNV describing the set of the shader stages to be included in each shader group in the ray tracing pipeline.")
    uint32_t("maxRecursionDepth", "the maximum recursion that will be called from this pipeline.")
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
            <li>Each of {@code indexData}, {@code transformData}, and {@code vertexData} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkGeometryDataNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBuffer("vertexData", "the buffer containing vertex data for this geometry.")
    VkDeviceSize("vertexOffset", "the offset in bytes within {@code vertexData} containing vertex data for this geometry.")
    uint32_t("vertexCount", "the number of valid vertices.")
    VkDeviceSize("vertexStride", "the stride in bytes between each vertex.")
    VkFormat("vertexFormat", "the format of each vertex element.")
    VkBuffer("indexData", "the buffer containing index data for this geometry.")
    VkDeviceSize("indexOffset", "the offset in bytes within {@code indexData} containing index data for this geometry.")
    uint32_t("indexCount", "the number of indices to include in this geometry.")
    VkIndexType("indexType", "the format of each index.")
    VkBuffer("transformData", "a buffer containing optional reference to an array of 32-bit floats representing a 3x4 row major affine transformation matrix for this geometry.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_GEOMETRY_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code geometryType} <b>must</b> be a valid {@code VkGeometryTypeNV} value</li>
            <li>{@code geometry} <b>must</b> be a valid ##VkGeometryDataNV structure</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkGeometryFlagBitsNV} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureInfoNV, ##VkGeometryDataNV
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkGeometryTypeNV("geometryType", "describes which type of geometry this ##VkGeometryNV refers to.")
    VkGeometryDataNV("geometry", "contains the geometry data as described in ##VkGeometryDataNV.")
    VkGeometryFlagsNV("flags", "has flags describing options for this geometry.")
}

val VkAccelerationStructureInfoNV = struct(Module.VULKAN, "VkAccelerationStructureInfoNV") {
    documentation =
        """
        Structure specifying the parameters of acceleration structure object.

        <h5>Description</h5>
        ##VkAccelerationStructureInfoNV contains information that is used both for acceleration structure creation with {@code vkCreateAccelerationStructureNV} and in combination with the actual geometric data to build the acceleration structure with #CmdBuildAccelerationStructureNV().

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code geometryCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::maxGeometryCount}</li>
            <li>{@code instanceCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::maxInstanceCount}</li>
            <li>The total number of triangles in all geometries <b>must</b> be less than or equal to ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::maxTriangleCount}</li>
            <li>If {@code type} is #ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV then {@code geometryCount} <b>must</b> be 0</li>
            <li>If {@code type} is #ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV then {@code instanceCount} <b>must</b> be 0</li>
            <li>If {@code flags} has the #BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV bit set, then it <b>must</b> not have the #BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV bit set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code type} <b>must</b> be a valid {@code VkAccelerationStructureTypeNV} value</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkBuildAccelerationStructureFlagBitsNV} values</li>
            <li>If {@code geometryCount} is not 0, {@code pGeometries} <b>must</b> be a valid pointer to an array of {@code geometryCount} valid ##VkGeometryNV structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureCreateInfoNV, ##VkGeometryNV, #CmdBuildAccelerationStructureNV()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkAccelerationStructureTypeNV("type", "a {@code VkAccelerationStructureTypeNV} value specifying the type of acceleration structure that will be created.")
    VkBuildAccelerationStructureFlagsNV("flags", "a bitmask of {@code VkBuildAccelerationStructureFlagBitsNV} specifying additional parameters of the acceleration structure.")
    uint32_t("instanceCount", "specifies the number of instances that will be in the new acceleration structure.")
    AutoSize("pGeometries", optional = true)..uint32_t("geometryCount", "specifies the number of geometries that will be in the new acceleration structure.")
    VkGeometryNV.const.p("pGeometries", "an array of ##VkGeometryNV structures, which contain the scene data being passed into the acceleration structure.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDeviceSize("compactedSize", "the size from the result of #CmdWriteAccelerationStructuresPropertiesNV() if this acceleration structure is going to be the target of a compacting copy.")
    VkAccelerationStructureInfoNV("info", "the ##VkAccelerationStructureInfoNV structure that specifies further parameters of the created acceleration structure.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkAccelerationStructureNV("accelerationStructure", "the acceleration structure to be attached to memory.")
    VkDeviceMemory("memory", "a {@code VkDeviceMemory} object describing the device memory to attach.")
    VkDeviceSize("memoryOffset", "the start offset of the region of memory that is to be bound to the acceleration structure. The number of bytes returned in the ##VkMemoryRequirements{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified acceleration structure.")
    AutoSize("pDeviceIndices", optional = true)..uint32_t("deviceIndexCount", "the number of elements in {@code pDeviceIndices}.")
    uint32_t.const.p("pDeviceIndices", "a pointer to an array of device indices.")
}

val VkWriteDescriptorSetAccelerationStructureNV = struct(Module.VULKAN, "VkWriteDescriptorSetAccelerationStructureNV") {
    documentation =
        """
        Structure specifying acceleration to query for memory requirements.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code accelerationStructureCount} <b>must</b> be equal to {@code descriptorCount} in the extended structure</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV</li>
            <li>{@code pAccelerationStructures} <b>must</b> be a valid pointer to an array of {@code accelerationStructureCount} valid {@code VkAccelerationStructureNV} handles</li>
            <li>{@code accelerationStructureCount} <b>must</b> be greater than 0</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pAccelerationStructures")..uint32_t("accelerationStructureCount", "the number of elements in {@code pAccelerationStructures}.")
    VkAccelerationStructureNV.const.p("pAccelerationStructures", "are the acceleration structures to update.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkAccelerationStructureMemoryRequirementsTypeNV("type", "selects the type of memory requirement being queried. #ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV returns the memory requirements for the object itself. #ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV returns the memory requirements for the scratch memory when doing a build. #ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV returns the memory requirements for the scratch memory when doing an update.")
    VkAccelerationStructureNV("accelerationStructure", "the acceleration structure to be queried for memory requirements.")
}

val VkPhysicalDeviceRayTracingPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceRayTracingPropertiesNV") {
    documentation =
        """
        Properties of the physical device for ray tracing.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceRayTracingPropertiesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t("shaderGroupHandleSize", "size in bytes of the shader header.")
    uint32_t("maxRecursionDepth", "the maximum number of levels of recursion allowed in a trace command.")
    uint32_t("maxShaderGroupStride", "the maximum stride in bytes allowed between shader groups in the SBT.")
    uint32_t("shaderGroupBaseAlignment", "the required alignment in bytes for the base of the SBTs.")
    uint64_t("maxGeometryCount", "the maximum number of geometries in the bottom level acceleration structure.")
    uint64_t("maxInstanceCount", "the maximum number of instances in the top level acceleration structure.")
    uint64_t("maxTriangleCount", "the maximum number of triangles in all geometries in the bottom level acceleration structure.")
    uint32_t("maxDescriptorSetAccelerationStructures", "the maximum number of acceleration structure descriptors that are allowed in a descriptor set.")
}

val VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV") {
    documentation =
        """
        Structure describing the representative fragment test features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2KHR, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("representativeFragmentTest", "indicates whether the implementation supports the representative fragment test. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#fragops-rep-frag-test\">Representative Fragment Test</a>.")
}

val VkPipelineRepresentativeFragmentTestStateCreateInfoNV = struct(Module.VULKAN, "VkPipelineRepresentativeFragmentTestStateCreateInfoNV") {
    documentation =
        """
        Structure specifying representative fragment test.

        <h5>Description</h5>
        If this structure is not present, {@code representativeFragmentTestEnable} is considered to be #FALSE, and the representative fragment test is disabled.

        If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#fragops-early-mode">early fragment tests</a> are not enabled in the active fragment shader, the representative fragment shader test has no effect, even if enabled.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkQueueGlobalPriorityEXT("globalPriority", "the system-wide priority associated to this queue as specified by {@code VkQueueGlobalPriorityEXT}")
}

val VkPhysicalDevice8BitStorageFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevice8BitStorageFeaturesKHR") {
    documentation =
        """
        Structure describing features supported by VK_KHR_8bit_storage.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32("storageBuffer8BitAccess", "indicates whether objects in the {@code StorageBuffer} storage class with the {@code Block} decoration <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code StorageBuffer8BitAccess} capability.")
    VkBool32("uniformAndStorageBuffer8BitAccess", "indicates whether objects in the {@code Uniform} storage class with the {@code Block} decoration and in the {@code StorageBuffer} storage class with the same decoration <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code UniformAndStorageBuffer8BitAccess} capability.")
    VkBool32("storagePushConstant8", "indicates whether objects in the {@code PushConstant} storage class <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code StoragePushConstant8} capability.")
}

val VkImportMemoryHostPointerInfoEXT = struct(Module.VULKAN, "VkImportMemoryHostPointerInfoEXT") {
    documentation =
        """
        import memory from a host pointer.

        <h5>Description</h5>
        Importing memory from a host pointer shares ownership of the memory between the host and the Vulkan implementation. The application <b>can</b> continue to access the memory through the host pointer but it is the application's responsibility to synchronize device and non-device access to the underlying memory as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#memory-device-hostaccess">Host Access to Device Memory Objects</a>.

        Applications <b>can</b> import the same underlying memory into multiple instances of Vulkan and multiple times into a given Vulkan instance. However, implementations <b>may</b> fail to import the same underlying memory multiple times into a given physical device due to platform constraints.

        Importing memory from a particular host pointer <b>may</b> not be possible due to additional platform-specific restrictions beyond the scope of this specification in which case the implementation <b>must</b> fail the memory import operation with the error code #ERROR_INVALID_EXTERNAL_HANDLE_KHR.

        The application <b>must</b> ensure that the imported memory range remains valid and accessible for the lifetime of the imported memory object.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code handleType} is not 0, it <b>must</b> be supported for import, as reported in ##VkExternalMemoryPropertiesKHR</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagBits("handleType", "specifies the handle type.")
    nullable..opaque_p("pHostPointer", "the host pointer to import from.")
}

val VkMemoryHostPointerPropertiesEXT = struct(Module.VULKAN, "VkMemoryHostPointerPropertiesEXT") {
    documentation =
        """
        Properties of external memory host pointer.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>See Also</h5>
        #GetMemoryHostPointerPropertiesEXT()
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t("memoryTypeBits", "a bitmask containing one bit set for every memory type which the specified host pointer <b>can</b> be imported as.")
}

val VkPhysicalDeviceExternalMemoryHostPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceExternalMemoryHostPropertiesEXT") {
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

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDeviceSize("minImportedHostPointerAlignment", "the minimum required: alignment, in bytes, for the base address and size of host pointers that <b>can</b> be imported to a Vulkan memory object.")
}

val VkPhysicalDeviceShaderAtomicInt64FeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceShaderAtomicInt64FeaturesKHR") {
    documentation =
        """
        Structure describing features supported by VK_KHR_shader_atomic_int64.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32("shaderBufferInt64Atomics", "indicates whether shaders <b>can</b> support 64-bit unsigned and signed integer atomic operations on buffers.")
    VkBool32("shaderSharedInt64Atomics", "indicates whether shaders <b>can</b> support 64-bit unsigned and signed integer atomic operations on shared memory.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    uint32_t("shaderEngineCount", "an unsigned integer value indicating the number of shader engines found inside the shader core of the physical device.")
    uint32_t("shaderArraysPerEngineCount", "an unsigned integer value indicating the number of shader arrays inside a shader engine. Each shader array has its own scan converter, set of compute units, and a render back end (color and depth buffers). Shader arrays within a shader engine share shader processor input (wave launcher) and shader export (export buffer) units. Currently, a shader engine can have one or two shader arrays.")
    uint32_t("computeUnitsPerShaderArray", "an unsigned integer value indicating the number of compute units within a shader array. A compute unit houses a set of SIMDs along with a sequencer module and a local data store.")
    uint32_t("simdPerComputeUnit", "an unsigned integer value indicating the number of SIMDs inside a compute unit. Each SIMD processes a single instruction at a time.")
    uint32_t("wavefrontsPerSimd", "")
    uint32_t("wavefrontSize", "an unsigned integer value indicating the number of channels (or threads) in a wavefront.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkMemoryOverallocationBehaviorAMD("overallocationBehavior", "the desired overallocation behavior.")
}

val VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT") {
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

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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
            <li>{@code divisor} <b>must</b> be a value between 0 and ##VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT{@code ::maxVertexAttribDivisor}, inclusive.</li>
            <li>##VkVertexInputBindingDescription{@code ::inputRate} <b>must</b> be of type #VERTEX_INPUT_RATE_INSTANCE for this {@code binding}.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineVertexInputDivisorStateCreateInfoEXT
        """

    uint32_t("binding", "the binding number for which the divisor is specified.")
    uint32_t("divisor", "the number of successive instances that will use the same value of the vertex attribute when instanced rendering is enabled. For example, if the divisor is N, the same vertex attribute will applied to N successive instances before moving on to the next vertex attribute. The maximum value of divisor is implementation dependent and can be queried using ##VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT{@code ::maxVertexAttribDivisor}. A value of 0 <b>can</b> be used for the divisor if the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#features-features-vertexAttributeInstanceRateZeroDivisor\">{@code vertexAttributeInstanceRateZeroDivisor}</a> feature is enabled. In this case, the same vertex attribute will be applied to all instances.")
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure")
    AutoSize("pVertexBindingDivisors")..uint32_t("vertexBindingDivisorCount", "the number of elements in the {@code pVertexBindingDivisors} array.")
    VkVertexInputBindingDivisorDescriptionEXT.const.p("pVertexBindingDivisors", "a pointer to an array of ##VkVertexInputBindingDivisorDescriptionEXT structures, which specifies the divisor value for each binding.")
}

val VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT") {
    documentation =
        """
        Structure describing if fetching of vertex attribute may be repeated for instanced rendering.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating the implementation-dependent behavior. ##VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT <b>can</b> also be used in {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32("vertexAttributeInstanceRateDivisor", "specifies whether vertex attribute fetching may be repeated in case of instanced rendering.")
    VkBool32("vertexAttributeInstanceRateZeroDivisor", "specifies whether a zero value for ##VkVertexInputBindingDivisorDescriptionEXT{@code ::divisor} is supported.")
}

val VkConformanceVersionKHR = struct(Module.VULKAN, "VkConformanceVersionKHR") {
    documentation =
        """
        Structure containing the conformance test suite version the implementation is compliant with.
        """

    uint8_t("major", "the major version number of the conformance test suite.")
    uint8_t("minor", "the minor version number of the conformance test suite.")
    uint8_t("subminor", "the subminor version number of the conformance test suite.")
    uint8_t("patch", "the patch version number of the conformance test suite.")
}

val VkPhysicalDeviceDriverPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceDriverPropertiesKHR", mutable = false) {
    javaImport("static org.lwjgl.vulkan.KHRDriverProperties.*")
    documentation =
        """
        Structure containing driver identification information.

        <h5>Description</h5>
        {@code driverID} <b>must</b> be immutable for a given driver across instances, processes, driver versions, and system reboots.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES_KHR</li>
        </ul>

        <h5>See Also</h5>
        ##VkConformanceVersionKHR
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension specific structure.").mutable()
    VkDriverIdKHR("driverID", "a unique identifier for the driver of the physical device.")
    charUTF8("driverName", "a null-terminated UTF-8 string containing the name of the driver.")["VK_MAX_DRIVER_NAME_SIZE_KHR"]
    charUTF8("driverInfo", "a null-terminated UTF-8 string containing additional information about the driver.")["VK_MAX_DRIVER_INFO_SIZE_KHR"]
    VkConformanceVersionKHR("conformanceVersion", "the version of the Vulkan conformance test this driver is conformant against (see ##VkConformanceVersionKHR).")
}

val VkPhysicalDeviceFloatControlsPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceFloatControlsPropertiesKHR") {
    documentation =
        """
        Structure describing properties supported by VK_KHR_shader_float_controls.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceFloatControlsPropertiesKHR structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("separateDenormSettings", "a boolean value indicating whether the implementation supports separate settings for 16-bit and 64-bit denormals.")
    VkBool32("separateRoundingModeSettings", "a boolean value indicating whether the implementation supports separate rounding modes for 16-bit and 64-bit floating point instructions.")
    VkBool32("shaderSignedZeroInfNanPreserveFloat16", "a boolean value indicating whether sign of a zero, <code>Nan</code>s and &plusmn;&infin; <b>can</b> be preserved in 16-bit floating-point computations. It also indicates whether the {@code SignedZeroInfNanPreserve} execution mode <b>can</b> be used for 16-bit floating-point types.")
    VkBool32("shaderSignedZeroInfNanPreserveFloat32", "a boolean value indicating whether sign of a zero, <code>Nan</code>s and &plusmn;&infin; <b>can</b> be preserved in 32-bit floating-point computations. It also indicates whether the {@code SignedZeroInfNanPreserve} execution mode <b>can</b> be used for 32-bit floating-point types.")
    VkBool32("shaderSignedZeroInfNanPreserveFloat64", "a boolean value indicating whether sign of a zero, <code>Nan</code>s and &plusmn;&infin; <b>can</b> be preserved in 64-bit floating-point computations. It also indicates whether the {@code SignedZeroInfNanPreserve} execution mode <b>can</b> be used for 64-bit floating-point types.")
    VkBool32("shaderDenormPreserveFloat16", "a boolean value indicating whether denormals <b>can</b> be preserved in 16-bit floating-point computations. It also indicates whether the {@code DenormPreserve} execution mode <b>can</b> be used for 16-bit floating-point types.")
    VkBool32("shaderDenormPreserveFloat32", "a boolean value indicating whether denormals <b>can</b> be preserved in 32-bit floating-point computations. It also indicates whether the {@code DenormPreserve} execution mode <b>can</b> be used for 32-bit floating-point types.")
    VkBool32("shaderDenormPreserveFloat64", "a boolean value indicating whether denormals <b>can</b> be preserved in 64-bit floating-point computations. It also indicates whether the {@code DenormPreserve} execution mode <b>can</b> be used for 64-bit floating-point types.")
    VkBool32("shaderDenormFlushToZeroFloat16", "a boolean value indicating whether denormals <b>can</b> be flushed to zero in 16-bit floating-point computations. It also indicates whether the {@code DenormFlushToZero} execution mode <b>can</b> be used for 16-bit floating-point types.")
    VkBool32("shaderDenormFlushToZeroFloat32", "a boolean value indicating whether denormals <b>can</b> be flushed to zero in 32-bit floating-point computations. It also indicates whether the {@code DenormFlushToZero} execution mode <b>can</b> be used for 32-bit floating-point types.")
    VkBool32("shaderDenormFlushToZeroFloat64", "a boolean value indicating whether denormals <b>can</b> be flushed to zero in 64-bit floating-point computations. It also indicates whether the {@code DenormFlushToZero} execution mode <b>can</b> be used for 64-bit floating-point types.")
    VkBool32("shaderRoundingModeRTEFloat16", "a boolean value indicating whether an implementation supports the round-to-nearest-even rounding mode for 16-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTE} execution mode <b>can</b> be used for 16-bit floating-point types.")
    VkBool32("shaderRoundingModeRTEFloat32", "a boolean value indicating whether an implementation supports the round-to-nearest-even rounding mode for 32-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTE} execution mode <b>can</b> be used for 32-bit floating-point types.")
    VkBool32("shaderRoundingModeRTEFloat64", "a boolean value indicating whether an implementation supports the round-to-nearest-even rounding mode for 64-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTE} execution mode <b>can</b> be used for 64-bit floating-point types.")
    VkBool32("shaderRoundingModeRTZFloat16", "a boolean value indicating whether an implementation supports the round-towards-zero rounding mode for 16-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTZ} execution mode <b>can</b> be used for 16-bit floating-point types.")
    VkBool32("shaderRoundingModeRTZFloat32", "a boolean value indicating whether an implementation supports the round-towards-zero rounding mode for 32-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTZ} execution mode <b>can</b> be used for 32-bit floating-point types.")
    VkBool32("shaderRoundingModeRTZFloat64", "a boolean value indicating whether an implementation supports the round-towards-zero rounding mode for 64-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTZ} execution mode <b>can</b> be used for 64-bit floating-point types.")
}

val VkPhysicalDeviceComputeShaderDerivativesFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceComputeShaderDerivativesFeaturesNV") {
    documentation =
        """
        Structure describing compute shader derivative features that can be supported by an implementation.

        <h5>Description</h5>
        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#texture-derivatives-compute">Compute Shader Derivatives</a> for more information.

        If the ##VkPhysicalDeviceComputeShaderDerivativesFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2KHR, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceComputeShaderDerivativesFeaturesNV <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

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
        If the ##VkPhysicalDeviceMeshShaderFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with a value indicating whether the feature is supported. ##VkPhysicalDeviceMeshShaderFeaturesNV <b>can</b> also be used in {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

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

val VkPhysicalDeviceMeshShaderPropertiesNV = struct(Module.VULKAN, "VkPhysicalDeviceMeshShaderPropertiesNV") {
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

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t("maxDrawMeshTasksCount", "the maximum number of local workgroups that <b>can</b> be launched by a single draw mesh tasks command. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#drawing-mesh-shading\">the “Programmable Mesh Shading” section</a>.")
    uint32_t("maxTaskWorkGroupInvocations", "the maximum total number of task shader invocations in a single local workgroup. The product of the X, Y, and Z sizes as specified by the {@code LocalSize} execution mode in shader modules and by the object decorated by the {@code WorkgroupSize} decoration <b>must</b> be less than or equal to this limit.")
    uint32_t("maxTaskWorkGroupSize", "the maximum size of a local task workgroup. These three values represent the maximum local workgroup size in the X, Y, and Z dimensions, respectively. The {@code x}, {@code y}, and {@code z} sizes specified by the {@code LocalSize} execution mode and by the object decorated by the {@code WorkgroupSize} decoration in shader modules <b>must</b> be less than or equal to the corresponding limit.")[3]
    uint32_t("maxTaskTotalMemorySize", "the maximum number of bytes that the task shader can use in total for shared and output memory combined.")
    uint32_t("maxTaskOutputCount", "the maximum number of output tasks a single task shader workgroup can emit.")
    uint32_t("maxMeshWorkGroupInvocations", "the maximum total number of mesh shader invocations in a single local workgroup. The product of the X, Y, and Z sizes as specified by the {@code LocalSize} execution mode in shader modules and by the object decorated by the {@code WorkgroupSize} decoration <b>must</b> be less than or equal to this limit.")
    uint32_t("maxMeshWorkGroupSize", "the maximum size of a local mesh workgroup. These three values represent the maximum local workgroup size in the X, Y, and Z dimensions, respectively. The {@code x}, {@code y}, and {@code z} sizes specified by the {@code LocalSize} execution mode and by the object decorated by the {@code WorkgroupSize} decoration in shader modules <b>must</b> be less than or equal to the corresponding limit.")[3]
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
        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#primsrast-barycentric">Barycentric Interpolation</a> for more information.

        If the ##VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2KHR, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

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
        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#textures-footprint">Texel Footprint Evaluation</a> for more information.

        If the ##VkPhysicalDeviceShaderImageFootprintFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2KHR, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceShaderImageFootprintFeaturesNV <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable features.

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
        If this structure is not present, {@code exclusiveScissorCount} is considered to be 0 and the exclusive scissor test is disabled.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-features-multiViewport">multiple viewports</a> feature is not enabled, {@code exclusiveScissorCount} <b>must</b> be 0 or 1</li>
            <li>{@code exclusiveScissorCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxViewports}</li>
            <li>{@code exclusiveScissorCount} <b>must</b> be 0 or identical to the {@code viewportCount} member of ##VkPipelineViewportStateCreateInfo</li>
            <li>If no element of the {@code pDynamicStates} member of {@code pDynamicState} is #DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV and {@code exclusiveScissorCount} is not 0, {@code pExclusiveScissors} <b>must</b> be a valid pointer to an array of {@code exclusiveScissorCount} ##VkRect2D structures</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV</li>
            <li>If {@code exclusiveScissorCount} is not 0, and {@code pExclusiveScissors} is not {@code NULL}, {@code pExclusiveScissors} <b>must</b> be a valid pointer to an array of {@code exclusiveScissorCount} ##VkRect2D structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkRect2D
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pExclusiveScissors", optional = true)..uint32_t("exclusiveScissorCount", "the number of exclusive scissor rectangles used by the pipeline.")
    nullable..VkRect2D.const.p("pExclusiveScissors", "a pointer to an array of ##VkRect2D structures defining exclusive scissor rectangles. If the exclusive scissor state is dynamic, this member is ignored.")
}

val VkPhysicalDeviceExclusiveScissorFeaturesNV = struct(Module.VULKAN, "VkPhysicalDeviceExclusiveScissorFeaturesNV") {
    documentation =
        """
        Structure describing exclusive scissor features that can be supported by an implementation.

        <h5>Description</h5>
        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#fragops-exclusive-scissor">Exclusive Scissor Test</a> for more information.

        If the ##VkPhysicalDeviceExclusiveScissorFeaturesNV structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2KHR, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceExclusiveScissorFeaturesNV <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable the feature.

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

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkPipelineStageFlags("checkpointExecutionStageMask", "a mask indicating which pipeline stages the implementation can execute checkpoint markers in.")
}

val VkCheckpointDataNV = struct(Module.VULKAN, "VkCheckpointDataNV", mutable = false) {
    documentation =
        """
        return structure for command buffer checkpoint data.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_CHECKPOINT_DATA_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        Note that the stages at which a checkpoint marker <b>can</b> be executed are implementation-defined and <b>can</b> be queried by calling #GetPhysicalDeviceQueueFamilyProperties2().

        <h5>See Also</h5>
        #GetQueueCheckpointDataNV()
        """

    VkStructureType("sType", "the type of this structure").mutable()
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkPipelineStageFlagBits("stage", "indicates which pipeline stage the checkpoint marker data refers to.")
    opaque_p("pCheckpointMarker", "contains the value of the last checkpoint marker executed in the stage that {@code stage} refers to.")
}

val VkPhysicalDeviceVulkanMemoryModelFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVulkanMemoryModelFeaturesKHR") {
    documentation =
        """
        Structure describing features supported by VK_KHR_vulkan_memory_model.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES_KHR</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32("vulkanMemoryModel", "indicates whether the Vulkan Memory Model is supported, as defined in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#memory-model\">Vulkan Memory Model</a>. This also indicates whether shader modules <b>can</b> declare the {@code VulkanMemoryModelKHR} capability.")
    VkBool32("vulkanMemoryModelDeviceScope", "indicates whether the Vulkan Memory Model can use {@code Device} scope synchronization. This also indicates whether shader modules <b>can</b> declare the {@code VulkanMemoryModelDeviceScopeKHR} capability.")
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
    nullable..opaque_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    uint16_t("pciDomain", "the PCI bus domain.")
    uint8_t("pciBus", "the PCI bus identifier.")
    uint8_t("pciDevice", "the PCI device identifier.")
    uint8_t("pciFunction", "the PCI device function identifier.")
}

val VkPhysicalDeviceFragmentDensityMapFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMapFeaturesEXT", mutable = false) {
    documentation =
        """
        Structure describing fragment density map features that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceFragmentDensityMapFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2, it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceFragmentDensityMapFeaturesEXT <b>can</b> also be used in {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkBool32("fragmentDensityMap", "specifies whether the implementation supports render passes with a fragment density map attachment. If this feature is not enabled and the {@code pNext} chain of ##VkRenderPassCreateInfo contains ##VkRenderPassFragmentDensityMapCreateInfoEXT, {@code fragmentDensityMapAttachment} <b>must</b> be #ATTACHMENT_UNUSED.")
    VkBool32("fragmentDensityMapDynamic", "specifies whether the implementation supports dynamic fragment density map image views. If this feature is not enabled, #IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT <b>must</b> not be included in ##VkImageViewCreateInfo{@code ::flags}.")
    VkBool32("fragmentDensityMapNonSubsampledImages", "specifies whether the implementation supports regular non-subsampled image attachments with fragment density map render passes. If this feature is not enabled, render passes with a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#renderpass-fragmentdensitymapattachment\">fragment density map attachment</a> <b>must</b> only have <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#resources-subsampledimages\">subsampled attachments</a> bound.")
}

val VkPhysicalDeviceFragmentDensityMapPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceFragmentDensityMapPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing fragment density map properties that can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT</li>
        </ul>

        If the ##VkPhysicalDeviceFragmentDensityMapPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2KHR, it is filled with the implementation-dependent limits and properties.

        <h5>See Also</h5>
        ##VkExtent2D
        """

    VkStructureType("sType", "").mutable()
    nullable..opaque_p("pNext", "").mutable()
    VkExtent2D("minFragmentDensityTexelSize", "the minimum <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#glossary-fragment-density-texel-size\">fragment density texel size</a>.")
    VkExtent2D("maxFragmentDensityTexelSize", "the maximum fragment density texel size.")
    VkBool32("fragmentDensityInvocations", "specifies whether the implementation <b>may</b> invoke additional fragment shader invocations for each covered sample.")
}

val VkRenderPassFragmentDensityMapCreateInfoEXT = struct(Module.VULKAN, "VkRenderPassFragmentDensityMapCreateInfoEXT") {
    documentation =
        """
        Structure containing fragment density map attachment for render pass.

        <h5>Description</h5>
        The fragment density map attachment is read at an implementation-dependent time either by the host during #CmdBeginRenderPass() if the attachment's image view was not created with {@code flags} containing #IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT, or by the device when drawing commands in the renderpass execute #PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT.

        If this structure is not present, it is as if {@code fragmentDensityMapAttachment} was given as #ATTACHMENT_UNUSED.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code fragmentDensityMapAttachment} is not #ATTACHMENT_UNUSED, {@code fragmentDensityMapAttachment} <b>must</b> be less than ##VkRenderPassCreateInfo{@code ::attachmentCount}</li>
            <li>If {@code fragmentDensityMapAttachment} is not #ATTACHMENT_UNUSED, {@code fragmentDensityMapAttachment} <b>must</b> not be an element of ##VkSubpassDescription{@code ::pInputAttachments}, ##VkSubpassDescription{@code ::pColorAttachments}, ##VkSubpassDescription{@code ::pResolveAttachments}, ##VkSubpassDescription{@code ::pDepthStencilAttachment}, or ##VkSubpassDescription{@code ::pPreserveAttachments} for any subpass</li>
            <li>If {@code fragmentDensityMapAttachment} is not #ATTACHMENT_UNUSED, {@code layout} <b>must</b> be equal to #IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT, or #IMAGE_LAYOUT_GENERAL</li>
            <li>If {@code fragmentDensityMapAttachment} is not #ATTACHMENT_UNUSED, {@code fragmentDensityMapAttachment} <b>must</b> reference an attachment with a {@code loadOp} equal to #ATTACHMENT_LOAD_OP_LOAD or #ATTACHMENT_LOAD_OP_DONT_CARE.</li>
            <li>If {@code fragmentDensityMapAttachment} is not #ATTACHMENT_UNUSED, {@code fragmentDensityMapAttachment} <b>must</b> reference an attachment with a {@code storeOp} equal to #ATTACHMENT_STORE_OP_DONT_CARE.</li>
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
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkAttachmentReference("fragmentDensityMapAttachment", "the fragment density map to use for the render pass.")
}

val VkPhysicalDeviceScalarBlockLayoutFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceScalarBlockLayoutFeaturesEXT") {
    documentation =
        """
        Structure indicating support for scalar block layouts.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceScalarBlockLayoutFeaturesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceFeatures2KHR, it is filled with values indicating whether the feature is supported. ##VkPhysicalDeviceScalarBlockLayoutFeaturesEXT <b>can</b> also be used in the {@code pNext} chain of ##VkDeviceCreateInfo to enable this feature.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType("sType", "")
    nullable..opaque_p("pNext", "")
    VkBool32("scalarBlockLayout", "indicates that the implementation supports the layout of resource blocks in shaders using <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#interfaces-scalar-block-layout\">scalar alignment</a>.")
}

val VkImageStencilUsageCreateInfoEXT = struct(Module.VULKAN, "VkImageStencilUsageCreateInfoEXT") {
    documentation =
        """
        Specify separate usage flags for the stencil aspect of a depth-stencil image.

        <h5>Description</h5>
        When this structure is not present in the {@code pNext} chain of ##VkImageCreateInfo then the implicit value of {@code stencilUsage} matches that of ##VkImageCreateInfo{@code ::usage}.

        When this structure is present ##VkImageCreateInfo{@code ::usage} specifies the intended usage of the depth aspect of the image and ##VkImageStencilUsageCreateInfoEXT::stencilUsage specifies the intended usage of the stencil aspect of the image. However, for the purposes of determining image specific valid usage conditions, the image itself is considered to be created with a particular {@code VkImageUsageFlagBits} value if either ##VkImageCreateInfo{@code ::usage} or ##VkImageStencilUsageCreateInfoEXT::stencil usage includes that bit value.

        This structure <b>can</b> also be included in the {@code pNext} chain of ##VkPhysicalDeviceImageFormatInfo2 to query additional capabilities specific to image creation parameter combinations including a separate set of usage flags for the stencil aspect of the image using #GetPhysicalDeviceImageFormatProperties2(). When this structure is not present in the {@code pNext} chain of ##VkPhysicalDeviceImageFormatInfo2 then the implicit value of {@code stencilUsage} matches that of ##VkPhysicalDeviceImageFormatInfo2{@code ::usage}.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code stencilUsage} includes #IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT, then bits other than #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, and #IMAGE_USAGE_INPUT_ATTACHMENT_BIT <b>must</b> not be set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO_EXT</li>
            <li>{@code stencilUsage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
            <li>{@code stencilUsage} <b>must</b> not be 0</li>
        </ul>
        """

    VkStructureType("sType", "the type of this structure.")
    nullable..opaque_const_p("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkImageUsageFlags("stencilUsage", "a bitmask of {@code VkImageUsageFlagBits} describing the intended usage of the stencil aspect of the image.")
}