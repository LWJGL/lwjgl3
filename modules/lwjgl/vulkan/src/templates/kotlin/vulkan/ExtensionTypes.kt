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
val VkQueueGlobalPriorityEXT = "VkQueueGlobalPriorityEXT".enumType

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

// Function pointer types
val PFN_vkDebugReportCallbackEXT = Module.VULKAN.callback {
    VkBool32(
        "VkDebugReportCallbackEXT",
        "Application-defined debug report callback function.",

        VkDebugReportFlagsEXT.IN("flags", "specifies the {@code VkDebugReportFlagBitsEXT} that triggered this callback."),
        VkDebugReportObjectTypeEXT.IN("objectType", "a {@code VkDebugReportObjectTypeEXT} value specifying the type of object being used or created at the time the event was triggered."),
        uint64_t.IN("object", "the object where the issue was detected. If {@code objectType} is #DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT, {@code object} is undefined."),
        size_t.IN("location", "a component (layer, driver, loader) defined value that specifies the <em>location</em> of the trigger. This is an optional: value."),
        int32_t.IN("messageCode", "a layer-defined value indicating what test triggered this callback."),
        char.const.p.IN("pLayerPrefix", "a null-terminated string that is an abbreviation of the name of the component making the callback. {@code pLayerPrefix} is only valid for the duration of the callback."),
        char.const.p.IN("pMessage", "a null-terminated string detailing the trigger conditions. {@code pMessage} is only valid for the duration of the callback."),
        opaque_p.IN("pUserData", "the user data given when the {@code VkDebugReportCallbackEXT} was created."),

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
        The callback <b>must</b> not call #DestroyDebugReportCallbackEXT().

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

        VkDebugUtilsMessageSeverityFlagBitsEXT.IN("messageSeverity", "specifies the {@code VkDebugUtilsMessageSeverityFlagBitsEXT} that triggered this callback."),
        VkDebugUtilsMessageTypeFlagsEXT.IN("messageType", ""),
        _VkDebugUtilsMessengerCallbackDataEXT.const.p.IN("pCallbackData", "contains all the callback related data in the ##VkDebugUtilsMessengerCallbackDataEXT structure."),
        opaque_p.IN("pUserData", "the user data provided when the {@code VkDebugUtilsMessengerEXT} was created."),

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
￿    VkDebugUtilsMessageTypeFlagsEXT                  messageType,
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

    uint32_t.member("minImageCount", "the minimum number of images the specified device supports for a swapchain created for the surface, and will be at least one.")
    uint32_t.member("maxImageCount", "the maximum number of images the specified device supports for a swapchain created for the surface, and will be either 0, or greater than or equal to {@code minImageCount}. A value of 0 means that there is no limit on the number of images, though there <b>may</b> be limits related to the total amount of memory used by presentable images.")
    VkExtent2D.member("currentExtent", "the current width and height of the surface, or the special value <code>(0xFFFFFFFF, 0xFFFFFFFF)</code> indicating that the surface size will be determined by the extent of a swapchain targeting the surface.")
    VkExtent2D.member("minImageExtent", "contains the smallest valid swapchain extent for the surface on the specified device. The {@code width} and {@code height} of the extent will each be less than or equal to the corresponding {@code width} and {@code height} of {@code currentExtent}, unless {@code currentExtent} has the special value described above.")
    VkExtent2D.member("maxImageExtent", "contains the largest valid swapchain extent for the surface on the specified device. The {@code width} and {@code height} of the extent will each be greater than or equal to the corresponding {@code width} and {@code height} of {@code minImageExtent}. The {@code width} and {@code height} of the extent will each be greater than or equal to the corresponding {@code width} and {@code height} of {@code currentExtent}, unless {@code currentExtent} has the special value described above.")
    uint32_t.member("maxImageArrayLayers", "the maximum number of layers presentable images <b>can</b> have for a swapchain created for this device and surface, and will be at least one.")
    VkSurfaceTransformFlagsKHR.member("supportedTransforms", "a bitmask of {@code VkSurfaceTransformFlagBitsKHR} indicating the presentation transforms supported for the surface on the specified device. At least one bit will be set.")
    VkSurfaceTransformFlagBitsKHR.member("currentTransform", "{@code VkSurfaceTransformFlagBitsKHR} value indicating the surface&#8217;s current transform relative to the presentation engine&#8217;s natural orientation.")
    VkCompositeAlphaFlagsKHR.member("supportedCompositeAlpha", "a bitmask of {@code VkCompositeAlphaFlagBitsKHR}, representing the alpha compositing modes supported by the presentation engine for the surface on the specified device, and at least one bit will be set. Opaque composition <b>can</b> be achieved in any alpha compositing mode by either using an image format that has no alpha component, or by ensuring that all pixels in the presentable images have an alpha value of 1.0.")
    VkImageUsageFlags.member("supportedUsageFlags", "a bitmask of {@code VkImageUsageFlagBits} representing the ways the application <b>can</b> use the presentable images of a swapchain created with {@code VkPresentModeKHR} set to #PRESENT_MODE_IMMEDIATE_KHR, #PRESENT_MODE_MAILBOX_KHR, #PRESENT_MODE_FIFO_KHR or #PRESENT_MODE_FIFO_RELAXED_KHR for the surface on the specified device. #IMAGE_USAGE_COLOR_ATTACHMENT_BIT <b>must</b> be included in the set but implementations <b>may</b> support additional usages.")
}

val VkSurfaceFormatKHR = struct(Module.VULKAN, "VkSurfaceFormatKHR", mutable = false) {
    documentation =
        """
        Structure describing a supported swapchain format-color space pair.
        """

    VkFormat.member("format", "a {@code VkFormat} that is compatible with the specified surface.")
    VkColorSpaceKHR.member("colorSpace", "a presentation {@code VkColorSpaceKHR} that is compatible with the surface.")
}

val VkSwapchainCreateInfoKHR = struct(Module.VULKAN, "VkSwapchainCreateInfoKHR") {
    documentation =
        """
        Structure specifying parameters of a newly created swapchain object.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR</li>
            <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of ##VkDeviceGroupSwapchainCreateInfoKHR or ##VkSwapchainCounterCreateInfoEXT</li>
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSwapchainCreateFlagsKHR.member("flags", "a bitmask of {@code VkSwapchainCreateFlagBitsKHR} indicating parameters of the swapchain creation.")
    VkSurfaceKHR.member("surface", "the surface onto which the swapchain will present images. If the creation succeeds, the swapchain becomes associated with {@code surface}.")
    uint32_t.member("minImageCount", "the minimum number of presentable images that the application needs. The implementation will either create the swapchain with at least that many images, or it will fail to create the swapchain.")
    VkFormat.member("imageFormat", "a {@code VkFormat} value specifying the format the swapchain image(s) will be created with.")
    VkColorSpaceKHR.member("imageColorSpace", "a {@code VkColorSpaceKHR} value specifying the way the swapchain interprets image data.")
    VkExtent2D.member("imageExtent", """the size (in pixels) of the swapchain image(s). The behavior is platform-dependent if the image extent does not match the surface&#8217;s {@code currentExtent} as returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR().

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        On some platforms, it is normal that {@code maxImageExtent} <b>may</b> become {@code (0, 0)}, for example when the window is minimized. In such a case, it is not possible to create a swapchain due to the Valid Usage requirements.
        </div>""")
    uint32_t.member("imageArrayLayers", "the number of views in a multiview/stereo surface. For non-stereoscopic-3D applications, this value is 1.")
    VkImageUsageFlags.member("imageUsage", "a bitmask of {@code VkImageUsageFlagBits} describing the intended usage of the (acquired) swapchain images.")
    VkSharingMode.member("imageSharingMode", "the sharing mode used for the image(s) of the swapchain.")
    AutoSize("pQueueFamilyIndices", optional = true)..uint32_t.member("queueFamilyIndexCount", "the number of queue families having access to the image(s) of the swapchain when {@code imageSharingMode} is #SHARING_MODE_CONCURRENT.")
    uint32_t.const.p.member("pQueueFamilyIndices", "an array of queue family indices having access to the images(s) of the swapchain when {@code imageSharingMode} is #SHARING_MODE_CONCURRENT.")
    VkSurfaceTransformFlagBitsKHR.member("preTransform", "a {@code VkSurfaceTransformFlagBitsKHR} value describing the transform, relative to the presentation engine&#8217;s natural orientation, applied to the image content prior to presentation. If it does not match the {@code currentTransform} value returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR(), the presentation engine will transform the image content as part of the presentation operation.")
    VkCompositeAlphaFlagBitsKHR.member("compositeAlpha", "a {@code VkCompositeAlphaFlagBitsKHR} value indicating the alpha compositing mode to use when this surface is composited together with other surfaces on certain window systems.")
    VkPresentModeKHR.member("presentMode", "the presentation mode the swapchain will use. A swapchain&#8217;s present mode determines how incoming present requests will be processed and queued internally.")
    VkBool32.member("clipped", """specifies whether the Vulkan implementation is allowed to discard rendering operations that affect regions of the surface that are not visible.

        <ul>
            <li>If set to #TRUE, the presentable images associated with the swapchain <b>may</b> not own all of their pixels. Pixels in the presentable images that correspond to regions of the target surface obscured by another window on the desktop, or subject to some other clipping mechanism will have undefined content when read back. Pixel shaders <b>may</b> not execute for these pixels, and thus any side effects they would have had will not occur. #TRUE value does not guarantee any clipping will occur, but allows more optimal presentation methods to be used on some platforms.</li>
            <li>
                If set to #FALSE, presentable images associated with the swapchain will own all of the pixels they contain.
                <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>should</b> set this value to #TRUE if they do not expect to read back the content of presentable images before presenting them or after reacquiring them, and if their pixel shaders do not have any side effects that require them to run for all pixels in the presentable image.
                </div>
            </li>
        </ul>""")
    VkSwapchainKHR.member("oldSwapchain", """#NULL_HANDLE, or the existing non-retired swapchain currently associated with {@code surface}. Providing a valid {@code oldSwapchain} <b>may</b> aid in the resource reuse, and also allows the application to still present any images that are already acquired from it.

        Upon calling #CreateSwapchainKHR() with an {@code oldSwapchain} that is not #NULL_HANDLE, {@code oldSwapchain} is retired -- even if creation of the new swapchain fails. The new swapchain is created in the non-retired state whether or not {@code oldSwapchain} is #NULL_HANDLE.

        Upon calling #CreateSwapchainKHR() with an {@code oldSwapchain} that is not #NULL_HANDLE, any images from {@code oldSwapchain} that are not acquired by the application <b>may</b> be freed by the implementation, which <b>may</b> occur even if creation of the new swapchain fails. The application <b>can</b> destroy {@code oldSwapchain} to free all memory associated with {@code oldSwapchain}.

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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pWaitSemaphores", optional = true)..uint32_t.member("waitSemaphoreCount", "the number of semaphores to wait for before issuing the present request. The number <b>may</b> be zero.")
    VkSemaphore.const.p.member("pWaitSemaphores", "if not {@code NULL}, is an array of {@code VkSemaphore} objects with {@code waitSemaphoreCount} entries, and specifies the semaphores to wait for before issuing the present request.")
    AutoSize("pSwapchains", "pImageIndices", "pResults")..uint32_t.member("swapchainCount", "the number of swapchains being presented to by this command.")
    VkSwapchainKHR.const.p.member("pSwapchains", "an array of {@code VkSwapchainKHR} objects with {@code swapchainCount} entries. A given swapchain <b>must</b> not appear in this list more than once.")
    uint32_t.const.p.member("pImageIndices", "an array of indices into the array of each swapchain&#8217;s presentable images, with {@code swapchainCount} entries. Each entry in this array identifies the image to present on the corresponding entry in the {@code pSwapchains} array.")
    nullable..VkResult.p.member("pResults", "an array of {@code VkResult} typed elements with {@code swapchainCount} entries. Applications that do not need per-swapchain results <b>can</b> use {@code NULL} for {@code pResults}. If non-{@code NULL}, each entry in {@code pResults} will be set to the {@code VkResult} for presenting the swapchain corresponding to the same index in {@code pSwapchains}.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSwapchainKHR.member("swapchain", "#NULL_HANDLE or a handle of a swapchain that the image will be bound to.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSwapchainKHR.member("swapchain", "#NULL_HANDLE or a swapchain handle.")
    uint32_t.member("imageIndex", "an image index within {@code swapchain}.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSwapchainKHR.member("swapchain", "a non-retired swapchain from which an image is acquired.")
    uint64_t.member("timeout", "specifies how long the function waits, in nanoseconds, if no image is available.")
    VkSemaphore.member("semaphore", "#NULL_HANDLE or a semaphore to signal.")
    VkFence.member("fence", "#NULL_HANDLE or a fence to signal.")
    uint32_t.member("deviceMask", "a mask of physical devices for which the swapchain image will be ready to use when the semaphore or fence is signaled.")
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

    VkStructureType.member("sType", "the type of this structure.").mutable()
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    uint32_t.array("presentMask", "an array of masks, where the mask at element <code>i</code> is non-zero if physical device <code>i</code> has a presentation engine, and where bit <code>j</code> is set in element <code>i</code> if physical device <code>i</code> <b>can</b> present swapchain images from physical device <code>j</code>. If element <code>i</code> is non-zero, then bit <code>i</code> <b>must</b> be set.", size = "VK_MAX_DEVICE_GROUP_SIZE")
    VkDeviceGroupPresentModeFlagsKHR.member("modes", "a bitmask of {@code VkDeviceGroupPresentModeFlagBitsKHR} indicating which device group presentation modes are supported.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pDeviceMasks", optional = true)..uint32_t.member("swapchainCount", "zero or the number of elements in {@code pDeviceMasks}.")
    uint32_t.const.p.member("pDeviceMasks", "an array of device masks, one for each element of ##VkPresentInfoKHR::pSwapchains.")
    VkDeviceGroupPresentModeFlagBitsKHR.member("mode", "the device group present mode that will be used for this present.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDeviceGroupPresentModeFlagsKHR.member("modes", "a bitfield of modes that the swapchain <b>can</b> be used with.")
}

val VkDisplayPropertiesKHR = struct(Module.VULKAN, "VkDisplayPropertiesKHR", mutable = false) {
    documentation =
        """
        Structure describing an available display device.
        """

    VkDisplayKHR.member("display", "a handle that is used to refer to the display described here. This handle will be valid for the lifetime of the Vulkan instance.")
    charUTF8.const.p.member("displayName", "a pointer to a NULL-terminated string containing the name of the display. Generally, this will be the name provided by the display&#8217;s EDID. It <b>can</b> be {@code NULL} if no suitable name is available. If not {@code NULL}, the memory it points to <b>must</b> remain accessible as long as {@code display} is valid.")
    VkExtent2D.member("physicalDimensions", "describes the physical width and height of the visible portion of the display, in millimeters.")
    VkExtent2D.member("physicalResolution", """describes the physical, native, or preferred resolution of the display.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        For devices which have no natural value to return here, implementations <b>should</b> return the maximum resolution supported.
        </div>""")
    VkSurfaceTransformFlagsKHR.member("supportedTransforms", "tells which transforms are supported by this display. This will contain one or more of the bits from {@code VkSurfaceTransformFlagsKHR}.")
    VkBool32.member("planeReorderPossible", "tells whether the planes on this display <b>can</b> have their z order changed. If this is #TRUE, the application <b>can</b> re-arrange the planes on this display in any order relative to each other.")
    VkBool32.member("persistentContent", """tells whether the display supports self-refresh/internal buffering. If this is true, the application <b>can</b> submit persistent present operations on swapchains created against this display.

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

    VkExtent2D.member("visibleRegion", "the 2D extents of the visible region.")
    uint32_t.member("refreshRate", "a {@code uint32_t} that is the number of times the display is refreshed each second multiplied by 1000.")
}

val VkDisplayModePropertiesKHR = struct(Module.VULKAN, "VkDisplayModePropertiesKHR", mutable = false) {
    documentation =
        """
        Structure describing display mode properties.
        """

    VkDisplayModeKHR.member("displayMode", "a handle to the display mode described in this structure. This handle will be valid for the lifetime of the Vulkan instance.")
    VkDisplayModeParametersKHR.member("parameters", "a ##VkDisplayModeParametersKHR structure describing the display parameters associated with {@code displayMode}.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDisplayModeCreateFlagsKHR.member("flags", "reserved for future use, and <b>must</b> be zero.")
    VkDisplayModeParametersKHR.member("parameters", "a ##VkDisplayModeParametersKHR structure describing the display parameters to use in creating the new mode. If the parameters are not compatible with the specified display, the implementation <b>must</b> return #ERROR_INITIALIZATION_FAILED.")
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

    VkDisplayPlaneAlphaFlagsKHR.member("supportedAlpha", "a bitmask of {@code VkDisplayPlaneAlphaFlagBitsKHR} describing the supported alpha blending modes.")
    VkOffset2D.member("minSrcPosition", "the minimum source rectangle offset supported by this plane using the specified mode.")
    VkOffset2D.member("maxSrcPosition", "the maximum source rectangle offset supported by this plane using the specified mode. The {@code x} and {@code y} components of {@code maxSrcPosition} <b>must</b> each be greater than or equal to the {@code x} and {@code y} components of {@code minSrcPosition}, respectively.")
    VkExtent2D.member("minSrcExtent", "the minimum source rectangle size supported by this plane using the specified mode.")
    VkExtent2D.member("maxSrcExtent", "the maximum source rectangle size supported by this plane using the specified mode.")
    VkOffset2D.member("minDstPosition", "{@code minDstPosition}, {@code maxDstPosition}, {@code minDstExtent}, {@code maxDstExtent} all have similar semantics to their corresponding ptext:<b>Src</b> equivalents, but apply to the output region within the mode rather than the input region within the source image. Unlike the ptext:<b>Src</b> offsets, {@code minDstPosition} and {@code maxDstPosition} <b>may</b> contain negative values.")
    VkOffset2D.member("maxDstPosition", "see {@code minDstPosition}")
    VkExtent2D.member("minDstExtent", "see {@code minDstPosition}")
    VkExtent2D.member("maxDstExtent", "see {@code minDstPosition}")
}

val VkDisplayPlanePropertiesKHR = struct(Module.VULKAN, "VkDisplayPlanePropertiesKHR", mutable = false) {
    documentation =
        """
        Structure describing display plane properties.
        """

    VkDisplayKHR.member("currentDisplay", "the handle of the display the plane is currently associated with. If the plane is not currently attached to any displays, this will be {@code VK_NULL_HANDLE}.")
    uint32_t.member("currentStackIndex", "the current z-order of the plane. This will be between 0 and the value returned by #GetPhysicalDeviceDisplayPlanePropertiesKHR() in {@code pPropertyCount}.")
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
            <li>{@code planeIndex} <b>must</b> be less than the number of display planes supported by the device as determined by calling #GetPhysicalDeviceDisplayPlanePropertiesKHR()</li>
            <li>If the {@code planeReorderPossible} member of the ##VkDisplayPropertiesKHR structure returned by #GetPhysicalDeviceDisplayPropertiesKHR() for the display corresponding to {@code displayMode} is #TRUE then {@code planeStackIndex} <b>must</b> be less than the number of display planes supported by the device as determined by calling #GetPhysicalDeviceDisplayPlanePropertiesKHR(); otherwise {@code planeStackIndex} <b>must</b> equal the {@code currentStackIndex} member of ##VkDisplayPlanePropertiesKHR returned by #GetPhysicalDeviceDisplayPlanePropertiesKHR() for the display plane corresponding to {@code displayMode}</li>
            <li>If {@code alphaMode} is #DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR then {@code globalAlpha} <b>must</b> be between 0 and 1, inclusive</li>
            <li>{@code alphaMode} <b>must</b> be 0 or one of the bits present in the {@code supportedAlpha} member of ##VkDisplayPlaneCapabilitiesKHR returned by #GetDisplayPlaneCapabilitiesKHR() for the display plane corresponding to {@code displayMode}</li>
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDisplaySurfaceCreateFlagsKHR.member("flags", "reserved for future use, and <b>must</b> be zero.")
    VkDisplayModeKHR.member("displayMode", "a {@code VkDisplayModeKHR} handle specifying the mode to use when displaying this surface.")
    uint32_t.member("planeIndex", "the plane on which this surface appears.")
    uint32_t.member("planeStackIndex", "the z-order of the plane.")
    VkSurfaceTransformFlagBitsKHR.member("transform", "a {@code VkSurfaceTransformFlagBitsKHR} value specifying the transformation to apply to images as part of the scanout operation.")
    float.member("globalAlpha", "the global alpha value. This value is ignored if {@code alphaMode} is not #DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR.")
    VkDisplayPlaneAlphaFlagBitsKHR.member("alphaMode", "a {@code VkDisplayPlaneAlphaFlagBitsKHR} value specifying the type of alpha blending to use.")
    VkExtent2D.member("imageExtent", "The size of the presentable images to use with the surface.")
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
            <li>If the {@code persistentContent} member of the ##VkDisplayPropertiesKHR structure returned by #GetPhysicalDeviceDisplayPropertiesKHR() for the display the present operation targets then {@code persistent} <b>must</b> be #FALSE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR</li>
        </ul>

        <h5>See Also</h5>
        ##VkRect2D
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkRect2D.member("srcRect", "a rectangular region of pixels to present. It <b>must</b> be a subset of the image being presented. If ##VkDisplayPresentInfoKHR is not specified, this region will be assumed to be the entire presentable image.")
    VkRect2D.member("dstRect", "a rectangular region within the visible region of the swapchain&#8217;s display mode. If ##VkDisplayPresentInfoKHR is not specified, this region will be assumed to be the entire visible region of the visible region of the swapchain&#8217;s mode. If the specified rectangle is a subset of the display mode&#8217;s visible region, content from display planes below the swapchain&#8217;s plane will be visible outside the rectangle. If there are no planes below the swapchain&#8217;s, the area outside the specified rectangle will be black. If portions of the specified rectangle are outside of the display&#8217;s visible region, pixels mapping only to those portions of the rectangle will be discarded.")
    VkBool32.member("persistent", "If this is #TRUE, the display engine will enable buffered mode on displays that support it. This allows the display engine to stop sending content to the display until a new image is presented. The display will instead maintain a copy of the last presented image. This allows less power to be used, but <b>may</b> increase presentation latency. If ##VkDisplayPresentInfoKHR is not specified, persistent mode will not be used.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkXlibSurfaceCreateFlagsKHR.member("flags", "reserved for future use.")
    Display.p.member("dpy", "a pointer to an Xlib {@code Display} connection to the X server.")
    Window.member("window", "an Xlib {@code Window} to associate the surface with.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkWaylandSurfaceCreateFlagsKHR.member("flags", "reserved for future use.")
    wl_display.p.member("display", "{@code display} and {@code surface} are pointers to the Wayland {@code wl_display} and {@code wl_surface} to associate the surface with.")
    wl_surface.p.member("surface", "see {@code display}")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkWin32SurfaceCreateFlagsKHR.member("flags", "reserved for future use.")
    HINSTANCE.member("hinstance", "{@code hinstance} and {@code hwnd} are the Win32 {@code HINSTANCE} and {@code HWND} for the window to associate the surface with.")
    HWND.member("hwnd", "see {@code hinstance}")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDebugReportFlagsEXT.member("flags", "a bitmask of {@code VkDebugReportFlagBitsEXT} specifying which event(s) will cause this callback to be called.")
    PFN_vkDebugReportCallbackEXT.member("pfnCallback", "the application callback function to call.")
    nullable..opaque_p.member("pUserData", "user data to be passed to the callback.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkRasterizationOrderAMD.member("rasterizationOrder", "a {@code VkRasterizationOrderAMD} value specifying the primitive rasterization order to use.")
}

val VkDebugMarkerObjectNameInfoEXT = struct(Module.VULKAN, "VkDebugMarkerObjectNameInfoEXT") {
    documentation =
        """
        Specify parameters of a name to give to an object.

        <h5>Description</h5>
        Applications <b>may</b> change the name associated with an object simply by calling #DebugMarkerSetObjectNameEXT() again with a new string. To remove a previously set name, {@code pObjectName} <b>should</b> be set to an empty string.

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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDebugReportObjectTypeEXT.member("objectType", "a {@code VkDebugReportObjectTypeEXT} specifying the type of the object to be named.")
    uint64_t.member("object", "the object to be named.")
    charUTF8.const.p.member("pObjectName", "a null-terminated UTF-8 string specifying the name to apply to {@code object}.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDebugReportObjectTypeEXT.member("objectType", "a {@code VkDebugReportObjectTypeEXT} specifying the type of the object to be named.")
    uint64_t.member("object", "the object to be tagged.")
    uint64_t.member("tagName", "a numerical identifier of the tag.")
    AutoSize("pTag")..size_t.member("tagSize", "the number of bytes of data to attach to the object.")
    void.const.p.member("pTag", "an array of {@code tagSize} bytes containing the data to be associated with the object.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    charUTF8.const.p.member("pMarkerName", "a pointer to a null-terminated UTF-8 string that contains the name of the marker.")
    float.array("color", "an optional: RGBA color value that can be associated with the marker. A particular implementation <b>may</b> choose to ignore this color value. The values contain RGBA values in order, in the range 0.0 to 1.0. If all elements in {@code color} are set to 0.0 then it is ignored.", size = 4)
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32.member("dedicatedAllocation", "specifies whether the image will have a dedicated allocation bound to it.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32.member("dedicatedAllocation", "specifies whether the buffer will have a dedicated allocation bound to it.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkImage.member("image", "#NULL_HANDLE or a handle of an image which this memory will be bound to.")
    VkBuffer.member("buffer", "#NULL_HANDLE or a handle of a buffer which this memory will be bound to.")
}

val VkTextureLODGatherFormatPropertiesAMD = struct(Module.VULKAN, "VkTextureLODGatherFormatPropertiesAMD", mutable = false) {
    documentation =
        """
        Structure informing whether or not texture gather bias/LOD functionality is supported for a given image format and a given physical device.
        """

    VkStructureType.member("sType", "the type of this structure.").mutable()
    nullable..opaque_p.member("pNext", "{@code NULL}.").mutable()
    VkBool32.member("supportsTextureGatherLODBiasAMD", "tells if the image format can be used with texture gather bias/LOD functions, as introduced by the {@link AMDTextureGatherBiasLod VK_AMD_texture_gather_bias_lod} extension. This field is set by the implementation. User-specified value is ignored.")
}

val VkShaderResourceUsageAMD = struct(Module.VULKAN, "VkShaderResourceUsageAMD", mutable = false) {
    documentation =
        """
        Resource usage information about a particular shader within a pipeline.
        """

    uint32_t.member("numUsedVgprs", "the number of vector instruction general-purpose registers used by this shader.")
    uint32_t.member("numUsedSgprs", "the number of scalar instruction general-purpose registers used by this shader.")
    uint32_t.member("ldsSizePerLocalWorkGroup", "the maximum local data store size per work group in bytes.")
    size_t.member("ldsUsageSizeInBytes", "the LDS usage size in bytes per work group by this shader.")
    size_t.member("scratchMemUsageInBytes", "the scratch memory usage in bytes by this shader.")
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

    VkShaderStageFlags.member("shaderStageMask", "are the combination of logical shader stages contained within this shader.")
    VkShaderResourceUsageAMD.member("resourceUsage", "an instance of ##VkShaderResourceUsageAMD describing internal physical device resources used by this shader.")
    uint32_t.member("numPhysicalVgprs", "the maximum number of vector instruction general-purpose registers (VGPRs) available to the physical device.")
    uint32_t.member("numPhysicalSgprs", "the maximum number of scalar instruction general-purpose registers (SGPRs) available to the physical device.")
    uint32_t.member("numAvailableVgprs", "the maximum limit of VGPRs made available to the shader compiler.")
    uint32_t.member("numAvailableSgprs", "the maximum limit of SGPRs made available to the shader compiler.")
    uint32_t.array("computeWorkGroupSize", "the local workgroup size of this shader in { X, Y, Z } dimensions.", size = 3)
}

val VkRenderPassMultiviewCreateInfoKHR = struct(Module.VULKAN, "VkRenderPassMultiviewCreateInfoKHR", alias = VkRenderPassMultiviewCreateInfo) {
    documentation = "See ##VkRenderPassMultiviewCreateInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    AutoSize("pViewMasks", optional = true)..uint32_t.member("subpassCount", "")
    uint32_t.const.p.member("pViewMasks", "")
    AutoSize("pViewOffsets", optional = true)..uint32_t.member("dependencyCount", "")
    int32_t.const.p.member("pViewOffsets", "")
    AutoSize("pCorrelationMasks", optional = true)..uint32_t.member("correlationMaskCount", "")
    uint32_t.const.p.member("pCorrelationMasks", "")
}

val VkPhysicalDeviceMultiviewFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMultiviewFeaturesKHR", alias = VkPhysicalDeviceMultiviewFeatures) {
    documentation = "See ##VkPhysicalDeviceMultiviewFeatures."

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    VkBool32.member("multiview", "")
    VkBool32.member("multiviewGeometryShader", "")
    VkBool32.member("multiviewTessellationShader", "")
}

val VkPhysicalDeviceMultiviewPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMultiviewPropertiesKHR", mutable = false, alias = VkPhysicalDeviceMultiviewProperties) {
    documentation = "See ##VkPhysicalDeviceMultiviewProperties."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    uint32_t.member("maxMultiviewViewCount", "")
    uint32_t.member("maxMultiviewInstanceIndex", "")
}

val VkExternalImageFormatPropertiesNV = struct(Module.VULKAN, "VkExternalImageFormatPropertiesNV", mutable = false) {
    documentation =
        """
        Structure specifying external image format properties.
        """

    VkImageFormatProperties.member("imageFormatProperties", "will be filled in as when calling #GetPhysicalDeviceImageFormatProperties(), but the values returned <b>may</b> vary depending on the external handle type requested.")
    VkExternalMemoryFeatureFlagsNV.member("externalMemoryFeatures", "a bitmask of {@code VkExternalMemoryFeatureFlagBitsNV}, indicating properties of the external memory handle type (#GetPhysicalDeviceExternalImageFormatPropertiesNV(){@code ::externalHandleType}) being queried, or 0 if the external memory handle type is 0.")
    VkExternalMemoryHandleTypeFlagsNV.member("exportFromImportedHandleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} containing a bit set for every external handle type that <b>may</b> be used to create memory from which the handles of the type specified in #GetPhysicalDeviceExternalImageFormatPropertiesNV(){@code ::externalHandleType} <b>can</b> be exported, or 0 if the external memory handle type is 0.")
    VkExternalMemoryHandleTypeFlagsNV.member("compatibleHandleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} containing a bit set for every external handle type that <b>may</b> be specified simultaneously with the handle type specified by #GetPhysicalDeviceExternalImageFormatPropertiesNV(){@code ::externalHandleType} when calling #AllocateMemory(), or 0 if the external memory handle type is 0. {@code compatibleHandleTypes} will always contain #GetPhysicalDeviceExternalImageFormatPropertiesNV(){@code ::externalHandleType}")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagsNV.member("handleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} specifying one or more external memory handle types.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagsNV.member("handleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} specifying one or more memory handle types that <b>may</b> be exported. Multiple handle types <b>may</b> be requested for the same allocation as long as they are compatible, as reported by #GetPhysicalDeviceExternalImageFormatPropertiesNV().")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagsNV.member("handleType", "0 or a {@code VkExternalMemoryHandleTypeFlagBitsNV} value specifying the type of memory handle in {@code handle}.")
    HANDLE.member("handle", "a Windows {@code HANDLE} referring to the memory.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    nullable..SECURITY_ATTRIBUTES.const.p.member("pAttributes", "a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.")
    DWORD.member("dwAccess", "a {@code DWORD} specifying access rights of the handle.")
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

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    AutoSize("pAcquireSyncs", "pAcquireKeys", "pAcquireTimeoutMilliseconds", optional = true)..uint32_t.member("acquireCount", "the number of entries in the {@code pAcquireSyncs}, {@code pAcquireKeys}, and {@code pAcquireTimeoutMilliseconds} arrays.")
    VkDeviceMemory.const.p.member("pAcquireSyncs", "a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources.")
    uint64_t.const.p.member("pAcquireKeys", "a pointer to an array of mutex key values to wait for prior to beginning the submitted work. Entries refer to the keyed mutex associated with the corresponding entries in {@code pAcquireSyncs}.")
    uint32_t.const.p.member("pAcquireTimeoutMilliseconds", "an array of timeout values, in millisecond units, for each acquire specified in {@code pAcquireKeys}.")
    AutoSize("pReleaseSyncs", "pReleaseKeys", optional = true)..uint32_t.member("releaseCount", "the number of entries in the {@code pReleaseSyncs} and {@code pReleaseKeys} arrays.")
    VkDeviceMemory.const.p.member("pReleaseSyncs", "a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources.")
    uint64_t.const.p.member("pReleaseKeys", "a pointer to an array of mutex key values to set when the submitted work has completed. Entries refer to the keyed mutex associated with the corresponding entries in {@code pReleaseSyncs}.")
}

val VkPhysicalDeviceFeatures2KHR = struct(Module.VULKAN, "VkPhysicalDeviceFeatures2KHR", alias = VkPhysicalDeviceFeatures2) {
    documentation = "See ##VkPhysicalDeviceFeatures2."

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    VkPhysicalDeviceFeatures.member("features", "")
}

val VkPhysicalDeviceProperties2KHR = struct(Module.VULKAN, "VkPhysicalDeviceProperties2KHR", mutable = false, alias = VkPhysicalDeviceProperties2) {
    documentation = "See ##VkPhysicalDeviceProperties2."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkPhysicalDeviceProperties.member("properties", "")
}

val VkFormatProperties2KHR = struct(Module.VULKAN, "VkFormatProperties2KHR", mutable = false, alias = VkFormatProperties2) {
    documentation = "See ##VkFormatProperties2."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkFormatProperties.member("formatProperties", "")
}

val VkImageFormatProperties2KHR = struct(Module.VULKAN, "VkImageFormatProperties2KHR", mutable = false, alias = VkImageFormatProperties2) {
    documentation = "See ##VkImageFormatProperties2."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkImageFormatProperties.member("imageFormatProperties", "")
}

val VkPhysicalDeviceImageFormatInfo2KHR = struct(Module.VULKAN, "VkPhysicalDeviceImageFormatInfo2KHR", alias = VkPhysicalDeviceImageFormatInfo2) {
    documentation = "See ##VkPhysicalDeviceImageFormatInfo2."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkFormat.member("format", "")
    VkImageType.member("type", "")
    VkImageTiling.member("tiling", "")
    VkImageUsageFlags.member("usage", "")
    VkImageCreateFlags.member("flags", "")
}

val VkQueueFamilyProperties2KHR = struct(Module.VULKAN, "VkQueueFamilyProperties2KHR", mutable = false, alias = VkQueueFamilyProperties2) {
    documentation = "See ##VkQueueFamilyProperties2."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkQueueFamilyProperties.member("queueFamilyProperties", "")
}

val VkPhysicalDeviceMemoryProperties2KHR = struct(Module.VULKAN, "VkPhysicalDeviceMemoryProperties2KHR", mutable = false, alias = VkPhysicalDeviceMemoryProperties2) {
    documentation = "See ##VkPhysicalDeviceMemoryProperties2."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkPhysicalDeviceMemoryProperties.member("memoryProperties", "")
}

val VkSparseImageFormatProperties2KHR = struct(Module.VULKAN, "VkSparseImageFormatProperties2KHR", mutable = false, alias = VkSparseImageFormatProperties2) {
    documentation = "See ##VkSparseImageFormatProperties2."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkSparseImageFormatProperties.member("properties", "")
}

val VkPhysicalDeviceSparseImageFormatInfo2KHR = struct(Module.VULKAN, "VkPhysicalDeviceSparseImageFormatInfo2KHR", alias = VkPhysicalDeviceSparseImageFormatInfo2) {
    documentation = "See ##VkPhysicalDeviceSparseImageFormatInfo2."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkFormat.member("format", "")
    VkImageType.member("type", "")
    VkSampleCountFlagBits.member("samples", "")
    VkImageUsageFlags.member("usage", "")
    VkImageTiling.member("tiling", "")
}

val VkMemoryAllocateFlagsInfoKHR = struct(Module.VULKAN, "VkMemoryAllocateFlagsInfoKHR", alias = VkMemoryAllocateFlagsInfo) {
    documentation = "See ##VkMemoryAllocateFlagsInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkMemoryAllocateFlags.member("flags", "")
    uint32_t.member("deviceMask", "")
}

val VkDeviceGroupRenderPassBeginInfoKHR = struct(Module.VULKAN, "VkDeviceGroupRenderPassBeginInfoKHR", alias = VkDeviceGroupRenderPassBeginInfo) {
    documentation = "See ##VkDeviceGroupRenderPassBeginInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    uint32_t.member("deviceMask", "")
    AutoSize("pDeviceRenderAreas", optional = true)..uint32_t.member("deviceRenderAreaCount", "")
    VkRect2D.const.p.buffer("pDeviceRenderAreas", "")
}

val VkDeviceGroupCommandBufferBeginInfoKHR = struct(Module.VULKAN, "VkDeviceGroupCommandBufferBeginInfoKHR", alias = VkDeviceGroupCommandBufferBeginInfo) {
    documentation = "See ##VkDeviceGroupCommandBufferBeginInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    uint32_t.member("deviceMask", "")
}

val VkDeviceGroupSubmitInfoKHR = struct(Module.VULKAN, "VkDeviceGroupSubmitInfoKHR", alias = VkDeviceGroupSubmitInfo) {
    documentation = "See ##VkDeviceGroupSubmitInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    AutoSize("pWaitSemaphoreDeviceIndices", optional = true)..uint32_t.member("waitSemaphoreCount", "")
    uint32_t.const.p.member("pWaitSemaphoreDeviceIndices", "")
    AutoSize("pCommandBufferDeviceMasks", optional = true)..uint32_t.member("commandBufferCount", "")
    uint32_t.const.p.member("pCommandBufferDeviceMasks", "")
    AutoSize("pSignalSemaphoreDeviceIndices", optional = true)..uint32_t.member("signalSemaphoreCount", "")
    uint32_t.const.p.member("pSignalSemaphoreDeviceIndices", "")
}

val VkDeviceGroupBindSparseInfoKHR = struct(Module.VULKAN, "VkDeviceGroupBindSparseInfoKHR", alias = VkDeviceGroupBindSparseInfo) {
    documentation = "See ##VkDeviceGroupBindSparseInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    uint32_t.member("resourceDeviceIndex", "")
    uint32_t.member("memoryDeviceIndex", "")
}

val VkBindBufferMemoryDeviceGroupInfoKHR = struct(Module.VULKAN, "VkBindBufferMemoryDeviceGroupInfoKHR", alias = VkBindBufferMemoryDeviceGroupInfo) {
    documentation = "See ##VkBindBufferMemoryDeviceGroupInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    AutoSize("pDeviceIndices", optional = true)..uint32_t.member("deviceIndexCount", "")
    uint32_t.const.p.member("pDeviceIndices", "")
}

val VkBindImageMemoryDeviceGroupInfoKHR = struct(Module.VULKAN, "VkBindImageMemoryDeviceGroupInfoKHR", alias = VkBindImageMemoryDeviceGroupInfo) {
    documentation = "See ##VkBindImageMemoryDeviceGroupInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    AutoSize("pDeviceIndices", optional = true)..uint32_t.member("deviceIndexCount", "")
    uint32_t.const.p.member("pDeviceIndices", "")
    AutoSize("pSplitInstanceBindRegions", optional = true)..uint32_t.member("splitInstanceBindRegionCount", "")
    VkRect2D.const.p.buffer("pSplitInstanceBindRegions", "")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pDisabledValidationChecks")..uint32_t.member("disabledValidationCheckCount", "the number of checks to disable.")
    VkValidationCheckEXT.const.p.member("pDisabledValidationChecks", "a pointer to an array of {@code VkValidationCheckEXT} values specifying the validation checks to be disabled.")
}

val VkPhysicalDeviceGroupPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceGroupPropertiesKHR", mutable = false, alias = VkPhysicalDeviceGroupProperties) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation = "See ##VkPhysicalDeviceGroupProperties."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    uint32_t.member("physicalDeviceCount", "")
    VkPhysicalDevice.array("physicalDevices", "", size = "VK_MAX_DEVICE_GROUP_SIZE")
    VkBool32.member("subsetAllocation", "")
}

val VkDeviceGroupDeviceCreateInfoKHR = struct(Module.VULKAN, "VkDeviceGroupDeviceCreateInfoKHR", alias = VkDeviceGroupDeviceCreateInfo) {
    documentation = "See ##VkDeviceGroupDeviceCreateInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    AutoSize("pPhysicalDevices", optional = true)..uint32_t.member("physicalDeviceCount", "")
    VkPhysicalDevice.const.p.member("pPhysicalDevices", "")
}

val VkExternalMemoryPropertiesKHR = struct(Module.VULKAN, "VkExternalMemoryPropertiesKHR", mutable = false, alias = VkExternalMemoryProperties) {
    documentation = "See ##VkExternalMemoryProperties."

    VkExternalMemoryFeatureFlags.member("externalMemoryFeatures", "")
    VkExternalMemoryHandleTypeFlags.member("exportFromImportedHandleTypes", "")
    VkExternalMemoryHandleTypeFlags.member("compatibleHandleTypes", "")
}

val VkPhysicalDeviceExternalImageFormatInfoKHR = struct(Module.VULKAN, "VkPhysicalDeviceExternalImageFormatInfoKHR", alias = VkPhysicalDeviceExternalImageFormatInfo) {
    documentation = "See ##VkPhysicalDeviceExternalImageFormatInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkExternalMemoryHandleTypeFlagBits.member("handleType", "")
}

val VkExternalImageFormatPropertiesKHR = struct(Module.VULKAN, "VkExternalImageFormatPropertiesKHR", mutable = false, alias = VkExternalImageFormatProperties) {
    documentation = "See ##VkExternalImageFormatProperties."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkExternalMemoryProperties.member("externalMemoryProperties", "")
}

val VkPhysicalDeviceExternalBufferInfoKHR = struct(Module.VULKAN, "VkPhysicalDeviceExternalBufferInfoKHR", alias = VkPhysicalDeviceExternalBufferInfo) {
    documentation = "See ##VkPhysicalDeviceExternalBufferInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkBufferCreateFlags.member("flags", "")
    VkBufferUsageFlags.member("usage", "")
    VkExternalMemoryHandleTypeFlagBits.member("handleType", "")
}

val VkExternalBufferPropertiesKHR = struct(Module.VULKAN, "VkExternalBufferPropertiesKHR", mutable = false, alias = VkExternalBufferProperties) {
    documentation = "See ##VkExternalBufferProperties."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkExternalMemoryProperties.member("externalMemoryProperties", "")
}

val VkPhysicalDeviceIDPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceIDPropertiesKHR", mutable = false, alias = VkPhysicalDeviceIDProperties) {
    documentation = "See ##VkPhysicalDeviceIDProperties."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    uint8_t.array("deviceUUID", "", size = "VK_UUID_SIZE")
    uint8_t.array("driverUUID", "", size = "VK_UUID_SIZE")
    uint8_t.array("deviceLUID", "", size = "VK_LUID_SIZE")
    uint32_t.member("deviceNodeMask", "")
    VkBool32.member("deviceLUIDValid", "")
}

val VkExternalMemoryImageCreateInfoKHR = struct(Module.VULKAN, "VkExternalMemoryImageCreateInfoKHR", alias = VkExternalMemoryImageCreateInfo) {
    documentation = "See ##VkExternalMemoryImageCreateInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkExternalMemoryHandleTypeFlags.member("handleTypes", "")
}

val VkExternalMemoryBufferCreateInfoKHR = struct(Module.VULKAN, "VkExternalMemoryBufferCreateInfoKHR", alias = VkExternalMemoryBufferCreateInfo) {
    documentation = "See ##VkExternalMemoryBufferCreateInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkExternalMemoryHandleTypeFlags.member("handleTypes", "")
}

val VkExportMemoryAllocateInfoKHR = struct(Module.VULKAN, "VkExportMemoryAllocateInfoKHR", alias = VkExportMemoryAllocateInfo) {
    documentation = "See ##VkExportMemoryAllocateInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkExternalMemoryHandleTypeFlags.member("handleTypes", "")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagBits.member("handleType", "specifies the type of {@code handle} or {@code name}.")
    HANDLE.member("handle", "the external handle to import, or {@code NULL}.")
    LPCWSTR.member("name", "a NULL-terminated UTF-16 string naming the underlying memory resource to import, or {@code NULL}.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    nullable..SECURITY_ATTRIBUTES.const.p.member("pAttributes", "a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.")
    DWORD.member("dwAccess", "a {@code DWORD} specifying access rights of the handle.")
    LPCWSTR.member("name", "a NULL-terminated UTF-16 string to associate with the underlying resource referenced by NT handles exported from the created memory.")
}

val VkMemoryWin32HandlePropertiesKHR = struct(Module.VULKAN, "VkMemoryWin32HandlePropertiesKHR", mutable = false) {
    documentation =
        """
        Properties of External Memory Windows Handles.
        """

    VkStructureType.member("sType", "the type of this structure.").mutable()
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    uint32_t.member("memoryTypeBits", "a bitmask containing one bit set for every memory type which the specified windows handle <b>can</b> be imported as.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDeviceMemory.member("memory", "the memory object from which the handle will be exported.")
    VkExternalMemoryHandleTypeFlagBits.member("handleType", "the type of handle requested.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagBits.member("handleType", "specifies the handle type of {@code fd}.")
    int.member("fd", "the external handle to import.")
}

val VkMemoryFdPropertiesKHR = struct(Module.VULKAN, "VkMemoryFdPropertiesKHR", mutable = false) {
    documentation =
        """
        Properties of External Memory File Descriptors.
        """

    VkStructureType.member("sType", "the type of this structure.").mutable()
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    uint32_t.member("memoryTypeBits", "a bitmask containing one bit set for every memory type which the specified file descriptor <b>can</b> be imported as.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDeviceMemory.member("memory", "the memory object from which the handle will be exported.")
    VkExternalMemoryHandleTypeFlagBits.member("handleType", "the type of handle requested.")
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

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    AutoSize("pAcquireSyncs", "pAcquireKeys", "pAcquireTimeouts", optional = true)..uint32_t.member("acquireCount", "the number of entries in the {@code pAcquireSyncs}, {@code pAcquireKeys}, and {@code pAcquireTimeoutMilliseconds} arrays.")
    VkDeviceMemory.const.p.member("pAcquireSyncs", "a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources.")
    uint64_t.const.p.member("pAcquireKeys", "a pointer to an array of mutex key values to wait for prior to beginning the submitted work. Entries refer to the keyed mutex associated with the corresponding entries in {@code pAcquireSyncs}.")
    uint32_t.const.p.member("pAcquireTimeouts", "")
    AutoSize("pReleaseSyncs", "pReleaseKeys", optional = true)..uint32_t.member("releaseCount", "the number of entries in the {@code pReleaseSyncs} and {@code pReleaseKeys} arrays.")
    VkDeviceMemory.const.p.member("pReleaseSyncs", "a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources.")
    uint64_t.const.p.member("pReleaseKeys", "a pointer to an array of mutex key values to set when the submitted work has completed. Entries refer to the keyed mutex associated with the corresponding entries in {@code pReleaseSyncs}.")
}

val VkPhysicalDeviceExternalSemaphoreInfoKHR = struct(Module.VULKAN, "VkPhysicalDeviceExternalSemaphoreInfoKHR", alias = VkPhysicalDeviceExternalSemaphoreInfo) {
    documentation = "See ##VkPhysicalDeviceExternalSemaphoreInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkExternalSemaphoreHandleTypeFlagBits.member("handleType", "")
}

val VkExternalSemaphorePropertiesKHR = struct(Module.VULKAN, "VkExternalSemaphorePropertiesKHR", mutable = false, alias = VkExternalSemaphoreProperties) {
    documentation = "See ##VkExternalSemaphoreProperties."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkExternalSemaphoreHandleTypeFlags.member("exportFromImportedHandleTypes", "")
    VkExternalSemaphoreHandleTypeFlags.member("compatibleHandleTypes", "")
    VkExternalSemaphoreFeatureFlags.member("externalSemaphoreFeatures", "")
}

val VkExportSemaphoreCreateInfoKHR = struct(Module.VULKAN, "VkExportSemaphoreCreateInfoKHR", alias = VkExportSemaphoreCreateInfo) {
    documentation = "See ##VkExportSemaphoreCreateInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkExternalSemaphoreHandleTypeFlags.member("handleTypes", "")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSemaphore.member("semaphore", "the semaphore into which the payload will be imported.")
    VkSemaphoreImportFlags.member("flags", "a bitmask of {@code VkSemaphoreImportFlagBits} specifying additional parameters for the semaphore payload import operation.")
    VkExternalSemaphoreHandleTypeFlagBits.member("handleType", "specifies the type of {@code handle}.")
    HANDLE.member("handle", "the external handle to import, or {@code NULL}.")
    LPCWSTR.member("name", "a NULL-terminated UTF-16 string naming the underlying synchronization primitive to import, or {@code NULL}.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    nullable..SECURITY_ATTRIBUTES.const.p.member("pAttributes", "a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.")
    DWORD.member("dwAccess", "a {@code DWORD} specifying access rights of the handle.")
    LPCWSTR.member("name", "a NULL-terminated UTF-16 string to associate with the underlying synchronization primitive referenced by NT handles exported from the created semaphore.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pWaitSemaphoreValues", optional = true)..uint32_t.member("waitSemaphoreValuesCount", "the number of semaphore wait values specified in {@code pWaitSemaphoreValues}.")
    nullable..uint64_t.const.p.member("pWaitSemaphoreValues", "an array of length {@code waitSemaphoreValuesCount} containing values for the corresponding semaphores in ##VkSubmitInfo{@code ::pWaitSemaphores} to wait for.")
    AutoSize("pSignalSemaphoreValues", optional = true)..uint32_t.member("signalSemaphoreValuesCount", "the number of semaphore signal values specified in {@code pSignalSemaphoreValues}.")
    nullable..uint64_t.const.p.member("pSignalSemaphoreValues", "an array of length {@code signalSemaphoreValuesCount} containing values for the corresponding semaphores in ##VkSubmitInfo{@code ::pSignalSemaphores} to set when signaled.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSemaphore.member("semaphore", "the semaphore from which state will be exported.")
    VkExternalSemaphoreHandleTypeFlagBits.member("handleType", "the type of handle requested.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSemaphore.member("semaphore", "the semaphore into which the payload will be imported.")
    VkSemaphoreImportFlags.member("flags", "a bitmask of {@code VkSemaphoreImportFlagBits} specifying additional parameters for the semaphore payload import operation.")
    VkExternalSemaphoreHandleTypeFlagBits.member("handleType", "specifies the type of {@code fd}.")
    int.member("fd", "the external handle to import.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSemaphore.member("semaphore", "the semaphore from which state will be exported.")
    VkExternalSemaphoreHandleTypeFlagBits.member("handleType", "the type of handle requested.")
}

val VkPhysicalDevicePushDescriptorPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDevicePushDescriptorPropertiesKHR") {
    documentation =
        """
        Structure describing push descriptor limits that can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR</li>
        </ul>
        """

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    uint32_t.member("maxPushDescriptors", "the maximum number of descriptors that <b>can</b> be used in a descriptor set created with #DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR set.")
}

val VkConditionalRenderingBeginInfoEXT = struct(Module.VULKAN, "VkConditionalRenderingBeginInfoEXT") {
    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkBuffer.member("buffer", "")
    VkDeviceSize.member("offset", "")
    VkConditionalRenderingFlagsEXT.member("flags", "")
}

val VkPhysicalDeviceConditionalRenderingFeaturesEXT = struct(Module.VULKAN, "VkPhysicalDeviceConditionalRenderingFeaturesEXT") {
    documentation =
        """
        Structure describing if a secondary command buffer can be executed if conditional rendering is active in the primary command buffer.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceConditionalRenderingFeaturesEXT structure is included in the {@code pNext} chain of flink:VkPhysicalDeviceFeatures2, it is filled with values indicating the implementation-dependent behavior. ##VkPhysicalDeviceConditionalRenderingFeaturesEXT <b>can</b> also be used in {@code pNext} chain of ##VkDeviceCreateInfo to enable the features.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32.member("conditionalRendering", "specifies whether conditional rendering is supported.")
    VkBool32.member("inheritedConditionalRendering", "specifies whether a secondary command buffer <b>can</b> be executed while conditional rendering is active in the primary command buffer.")
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

    VkStructureType.member("sType", "the type of this structure")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure")
    VkBool32.member("conditionalRenderingEnable", "specifies whether the command buffer <b>can</b> be executed while conditional rendering is active in the primary command buffer. If this is #TRUE, then this command buffer <b>can</b> be executed whether the primary command buffer has active conditional rendering or not. If this is #FALSE, then the primary command buffer <b>must</b> not have conditional rendering active.")
}

val VkPhysicalDevice16BitStorageFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDevice16BitStorageFeaturesKHR", alias = VkPhysicalDevice16BitStorageFeatures) {
    documentation = "See ##VkPhysicalDevice16BitStorageFeatures."

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    VkBool32.member("storageBuffer16BitAccess", "")
    VkBool32.member("uniformAndStorageBuffer16BitAccess", "")
    VkBool32.member("storagePushConstant16", "")
    VkBool32.member("storageInputOutput16", "")
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

    VkOffset2D.member("offset", "the origin of the rectangle, in pixels.")
    VkExtent2D.member("extent", "the size of the rectangle, in pixels.")
    uint32_t.member("layer", "the layer of the image. For images with only one layer, the value of {@code layer} <b>must</b> be 0.")
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

    AutoSize("pRectangles", optional = true)..uint32_t.member("rectangleCount", "the number of rectangles in {@code pRectangles}, or zero if the entire image has changed and should be presented.")
    nullable..VkRectLayerKHR.const.p.buffer("pRectangles", "either {@code NULL} or a pointer to an array of ##VkRectLayerKHR structures. The ##VkRectLayerKHR structure is the framebuffer coordinates, plus layer, of a portion of a presentable image that has changed and <b>must</b> be presented. If non-{@code NULL}, each entry in {@code pRectangles} is a rectangle of the given image that has changed since the last image was presented to the given swapchain.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pRegions", optional = true)..uint32_t.member("swapchainCount", "the number of swapchains being presented to by this command.")
    nullable..VkPresentRegionKHR.const.p.buffer("pRegions", "{@code NULL} or a pointer to an array of ##VkPresentRegionKHR elements with {@code swapchainCount} entries. If not {@code NULL}, each element of {@code pRegions} contains the region that has changed since the last present to the swapchain in the corresponding entry in the ##VkPresentInfoKHR{@code ::pSwapchains} array.")
}

val VkDescriptorUpdateTemplateEntryKHR = struct(Module.VULKAN, "VkDescriptorUpdateTemplateEntryKHR", alias = VkDescriptorUpdateTemplateEntry) {
    documentation = "See ##VkDescriptorUpdateTemplateEntry."

    uint32_t.member("dstBinding", "")
    uint32_t.member("dstArrayElement", "")
    uint32_t.member("descriptorCount", "")
    VkDescriptorType.member("descriptorType", "")
    size_t.member("offset", "")
    size_t.member("stride", "")
}

val VkDescriptorUpdateTemplateCreateInfoKHR = struct(Module.VULKAN, "VkDescriptorUpdateTemplateCreateInfoKHR", alias = VkDescriptorUpdateTemplateCreateInfo) {
    documentation = "See ##VkDescriptorUpdateTemplateCreateInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    VkDescriptorUpdateTemplateCreateFlags.member("flags", "")
    AutoSize("pDescriptorUpdateEntries")..uint32_t.member("descriptorUpdateEntryCount", "")
    VkDescriptorUpdateTemplateEntry.const.p.buffer("pDescriptorUpdateEntries", "")
    VkDescriptorUpdateTemplateType.member("templateType", "")
    VkDescriptorSetLayout.member("descriptorSetLayout", "")
    VkPipelineBindPoint.member("pipelineBindPoint", "")
    VkPipelineLayout.member("pipelineLayout", "")
    uint32_t.member("set", "")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32.member("computeBindingPointSupport", "specifies whether the {@code VkObjectTableNVX} supports entries with #OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX bit set and {@code VkIndirectCommandsLayoutNVX} supports #PIPELINE_BIND_POINT_COMPUTE.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t.member("maxIndirectCommandsLayoutTokenCount", "the maximum number of tokens in {@code VkIndirectCommandsLayoutNVX}.")
    uint32_t.member("maxObjectEntryCounts", "the maximum number of entries per resource type in {@code VkObjectTableNVX}.")
    uint32_t.member("minSequenceCountBufferOffsetAlignment", "the minimum alignment for memory addresses optionally used in #CmdProcessCommandsNVX().")
    uint32_t.member("minSequenceIndexBufferOffsetAlignment", "the minimum alignment for memory addresses optionally used in #CmdProcessCommandsNVX().")
    uint32_t.member("minCommandsTokenBufferOffsetAlignment", "the minimum alignment for memory addresses optionally used in #CmdProcessCommandsNVX().")
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

    VkIndirectCommandsTokenTypeNVX.member("tokenType", "specifies the token command type.")
    VkBuffer.member("buffer", "specifies the {@code VkBuffer} storing the functional arguments for each squence. These argumetns can be written by the device.")
    VkDeviceSize.member("offset", "specified an offset into {@code buffer} where the arguments start.")
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

    VkIndirectCommandsTokenTypeNVX.member("tokenType", "")
    uint32_t.member("bindingUnit", "has a different meaning depending on the type, please refer pseudo code further down for details.")
    uint32_t.member("dynamicCount", "has a different meaning depending on the type, please refer pseudo code further down for details.")
    uint32_t.member("divisor", "defines the rate at which the input data buffers are accessed.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineBindPoint.member("pipelineBindPoint", "the {@code VkPipelineBindPoint} that this layout targets.")
    VkIndirectCommandsLayoutUsageFlagsNVX.member("flags", "a bitmask of {@code VkIndirectCommandsLayoutUsageFlagBitsNVX} specifying usage hints of this layout.")
    AutoSize("pTokens")..uint32_t.member("tokenCount", "the length of the individual command sequnce.")
    VkIndirectCommandsLayoutTokenNVX.const.p.buffer("pTokens", "an array describing each command token in detail. See {@code VkIndirectCommandsTokenTypeNVX} and ##VkIndirectCommandsLayoutTokenNVX below for details.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkObjectTableNVX.member("objectTable", "the {@code VkObjectTableNVX} to be used for the generation process. Only registered objects at the time #CmdReserveSpaceForCommandsNVX() is called, will be taken into account for the reservation.")
    VkIndirectCommandsLayoutNVX.member("indirectCommandsLayout", "the {@code VkIndirectCommandsLayoutNVX} that provides the command sequence to generate.")
    AutoSize("pIndirectCommandsTokens")..uint32_t.member("indirectCommandsTokenCount", "defines the number of input tokens used.")
    VkIndirectCommandsTokenNVX.const.p.buffer("pIndirectCommandsTokens", "provides an array of ##VkIndirectCommandsTokenNVX that reference the input data for each token command.")
    uint32_t.member("maxSequencesCount", "the maximum number of sequences for which command buffer space will be reserved. If {@code sequencesCountBuffer} is #NULL_HANDLE, this is also the actual number of sequences generated.")
    nullable..VkCommandBuffer.member("targetCommandBuffer", "<b>can</b> be the secondary {@code VkCommandBuffer} in which the commands should be recorded. If {@code targetCommandBuffer} is {@code NULL} an implicit reservation as well as execution takes place on the processing {@code VkCommandBuffer}.")
    VkBuffer.member("sequencesCountBuffer", "<b>can</b> be {@code VkBuffer} from which the actual amount of sequences is sourced from as ftext:uint32_t value.")
    VkDeviceSize.member("sequencesCountOffset", "the byte offset into {@code sequencesCountBuffer} where the count value is stored.")
    VkBuffer.member("sequencesIndexBuffer", "<b>must</b> be set if {@code indirectCommandsLayout}&#8217;s #INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX is set and provides the used sequence indices as ftext:uint32_t array. Otherwise it <b>must</b> be #NULL_HANDLE.")
    VkDeviceSize.member("sequencesIndexOffset", "the byte offset into {@code sequencesIndexBuffer} where the index values start.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkObjectTableNVX.member("objectTable", "the {@code VkObjectTableNVX} to be used for the generation process. Only registered objects at the time #CmdReserveSpaceForCommandsNVX() is called, will be taken into account for the reservation.")
    VkIndirectCommandsLayoutNVX.member("indirectCommandsLayout", "the {@code VkIndirectCommandsLayoutNVX} that <b>must</b> also be used at generation time.")
    uint32_t.member("maxSequencesCount", "the maximum number of sequences for which command buffer space will be reserved.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pObjectEntryTypes", "pObjectEntryCounts", "pObjectEntryUsageFlags")..uint32_t.member("objectCount", "the number of entry configurations that the object table supports.")
    VkObjectEntryTypeNVX.const.p.member("pObjectEntryTypes", "an array of {@code VkObjectEntryTypeNVX} values providing the entry type of a given configuration.")
    uint32_t.const.p.member("pObjectEntryCounts", "an array of counts of how many objects can be registered in the table.")
    VkObjectEntryUsageFlagsNVX.const.p.member("pObjectEntryUsageFlags", "an array of bitmasks of {@code VkObjectEntryUsageFlagBitsNVX} specifying the binding usage of the entry.")
    uint32_t.member("maxUniformBuffersPerDescriptor", "the maximum number of #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC used by any single registered {@code VkDescriptorSet} in this table.")
    uint32_t.member("maxStorageBuffersPerDescriptor", "the maximum number of #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC used by any single registered {@code VkDescriptorSet} in this table.")
    uint32_t.member("maxStorageImagesPerDescriptor", "the maximum number of #DESCRIPTOR_TYPE_STORAGE_IMAGE or #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER used by any single registered {@code VkDescriptorSet} in this table.")
    uint32_t.member("maxSampledImagesPerDescriptor", "the maximum number of #DESCRIPTOR_TYPE_SAMPLER, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER or #DESCRIPTOR_TYPE_INPUT_ATTACHMENT used by any single registered {@code VkDescriptorSet} in this table.")
    uint32_t.member("maxPipelineLayouts", "the maximum number of unique {@code VkPipelineLayout} used by any registered {@code VkDescriptorSet} or {@code VkPipeline} in this table.")
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

    VkObjectEntryTypeNVX.member("type", "defines the entry type")
    VkObjectEntryUsageFlagsNVX.member("flags", "defines which {@code VkPipelineBindPoint} the resource can be used with. Some entry types allow only a single flag to be set.")
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

    VkObjectEntryTypeNVX.member("type", "")
    VkObjectEntryUsageFlagsNVX.member("flags", "")
    VkPipeline.member("pipeline", "specifies the {@code VkPipeline} that this resource entry references.")
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

    VkObjectEntryTypeNVX.member("type", "")
    VkObjectEntryUsageFlagsNVX.member("flags", "")
    VkPipelineLayout.member("pipelineLayout", "specifies the {@code VkPipelineLayout} that the {@code descriptorSet} is used with.")
    VkDescriptorSet.member("descriptorSet", "specifies the {@code VkDescriptorSet} that can be bound with this entry.")
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

    VkObjectEntryTypeNVX.member("type", "")
    VkObjectEntryUsageFlagsNVX.member("flags", "")
    VkBuffer.member("buffer", "specifies the {@code VkBuffer} that can be bound as vertex bufer")
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

    VkObjectEntryTypeNVX.member("type", "")
    VkObjectEntryUsageFlagsNVX.member("flags", "")
    VkBuffer.member("buffer", "specifies the {@code VkBuffer} that can be bound as index buffer")
    VkIndexType.member("indexType", "specifies the {@code VkIndexType} used with this index buffer")
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

    VkObjectEntryTypeNVX.member("type", "")
    VkObjectEntryUsageFlagsNVX.member("flags", "")
    VkPipelineLayout.member("pipelineLayout", "specifies the {@code VkPipelineLayout} that the pushconstants are used with")
    VkShaderStageFlags.member("stageFlags", "specifies the {@code VkShaderStageFlags} that the pushconstants are used with")
}

val VkViewportWScalingNV = struct(Module.VULKAN, "VkViewportWScalingNV") {
    documentation =
        """
        Structure specifying a viewport.
        """

    float.member("xcoeff", "{@code xcoeff} and {@code ycoeff} are the viewport&#8217;s W scaling factor for x and y respectively.")
    float.member("ycoeff", "see {@code xcoeff}")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32.member("viewportWScalingEnable", "controls whether viewport <b>W</b> scaling is enabled.")
    AutoSize("pViewportWScalings")..uint32_t.member("viewportCount", "the number of viewports used by <b>W</b> scaling, and <b>must</b> match the number of viewports in the pipeline if viewport <b>W</b> scaling is enabled.")
    VkViewportWScalingNV.const.p.buffer("pViewportWScalings", "a pointer to an array of ##VkViewportWScalingNV structures, which define the <b>W</b> scaling parameters for the corresponding viewport. If the viewport <b>W</b> scaling state is dynamic, this member is ignored.")
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

    VkStructureType.member("sType", "the type of this structure.").mutable()
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    uint32_t.member("minImageCount", "")
    uint32_t.member("maxImageCount", "")
    VkExtent2D.member("currentExtent", "")
    VkExtent2D.member("minImageExtent", "")
    VkExtent2D.member("maxImageExtent", "")
    uint32_t.member("maxImageArrayLayers", "")
    VkSurfaceTransformFlagsKHR.member("supportedTransforms", "")
    VkSurfaceTransformFlagBitsKHR.member("currentTransform", "")
    VkCompositeAlphaFlagsKHR.member("supportedCompositeAlpha", "")
    VkImageUsageFlags.member("supportedUsageFlags", "")
    VkSurfaceCounterFlagsEXT.member("supportedSurfaceCounters", "a bitmask of {@code VkSurfaceCounterFlagBitsEXT} indicating the supported surface counter types.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDisplayPowerStateEXT.member("powerState", "a {@code VkDisplayPowerStateEXT} value specifying the new power state of the display.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDeviceEventTypeEXT.member("deviceEvent", "")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDisplayEventTypeEXT.member("displayEvent", "a {@code VkDisplayEventTypeEXT} specifying when the fence will be signaled.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSurfaceCounterFlagsEXT.member("surfaceCounters", "a bitmask of {@code VkSurfaceCounterFlagBitsEXT} specifying surface counters to enable for the swapchain.")
}

val VkRefreshCycleDurationGOOGLE = struct(Module.VULKAN, "VkRefreshCycleDurationGOOGLE", mutable = false) {
    documentation =
        """
        Structure containing the RC duration of a display.
        """

    uint64_t.member("refreshDuration", "the number of nanoseconds from the start of one refresh cycle to the next.")
}

val VkPastPresentationTimingGOOGLE = struct(Module.VULKAN, "VkPastPresentationTimingGOOGLE", mutable = false) {
    documentation =
        """
        Structure containing timing information about a previously-presented image.

        <h5>Description</h5>
        The results for a given {@code swapchain} and {@code presentID} are only returned once from #GetPastPresentationTimingGOOGLE().

        The application <b>can</b> use the fname:VkPastPresentationTimingGOOGLE values to occasionally adjust its timing. For example, if {@code actualPresentTime} is later than expected (e.g. one {@code refreshDuration} late), the application may increase its target IPD to a higher multiple of {@code refreshDuration} (e.g. decrease its frame rate from 60Hz to 30Hz). If {@code actualPresentTime} and {@code earliestPresentTime} are consistently different, and if {@code presentMargin} is consistently large enough, the application may decrease its target IPD to a smaller multiple of {@code refreshDuration} (e.g. increase its frame rate from 30Hz to 60Hz). If {@code actualPresentTime} and {@code earliestPresentTime} are same, and if {@code presentMargin} is consistently high, the application may delay the start of its input-render-present loop in order to decrease the latency between user input and the corresponding present (always leaving some margin in case a new image takes longer to render than the previous image). An application that desires its target IPD to always be the same as {@code refreshDuration}, can also adjust features until {@code actualPresentTime} is never late and {@code presentMargin} is satisfactory.

        <h5>See Also</h5>
        #GetPastPresentationTimingGOOGLE()
        """

    uint32_t.member("presentID", "an application-provided value that was given to a previous #QueuePresentKHR() command via ##VkPresentTimeGOOGLE{@code ::presentID} (see below). It <b>can</b> be used to uniquely identify a previous present with the #QueuePresentKHR() command.")
    uint64_t.member("desiredPresentTime", "an application-provided value that was given to a previous #QueuePresentKHR() command via ##VkPresentTimeGOOGLE{@code ::desiredPresentTime}. If non-zero, it was used by the application to indicate that an image not be presented any sooner than {@code desiredPresentTime}.")
    uint64_t.member("actualPresentTime", "the time when the image of the {@code swapchain} was actually displayed.")
    uint64_t.member("earliestPresentTime", "the time when the image of the {@code swapchain} could have been displayed. This <b>may</b> differ from {@code actualPresentTime} if the application requested that the image be presented no sooner than ##VkPresentTimeGOOGLE{@code ::desiredPresentTime}.")
    uint64_t.member("presentMargin", "an indication of how early the #QueuePresentKHR() command was processed compared to how soon it needed to be processed, and still be presented at {@code earliestPresentTime}.")
}

val VkPresentTimeGOOGLE = struct(Module.VULKAN, "VkPresentTimeGOOGLE") {
    documentation =
        """
        The earliest time image should be presented.
        """

    uint32_t.member("presentID", "an application-provided identification value, that <b>can</b> be used with the results of #GetPastPresentationTimingGOOGLE(), in order to uniquely identify this present. In order to be useful to the application, it <b>should</b> be unique within some period of time that is meaningful to the application.")
    uint64_t.member("desiredPresentTime", "specifies that the image given <b>should</b> not be displayed to the user any earlier than this time. {@code desiredPresentTime} is a time in nanoseconds, relative to a monotonically-increasing clock (e.g. {@code CLOCK_MONOTONIC} (see clock_gettime(2)) on Android and Linux). A value of zero specifies that the presentation engine <b>may</b> display the image at any time. This is useful when the application desires to provide {@code presentID}, but doesn&#8217;t need a specific {@code desiredPresentTime}.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pTimes", optional = true)..uint32_t.member("swapchainCount", "the number of swapchains being presented to by this command.")
    nullable..VkPresentTimeGOOGLE.const.p.buffer("pTimes", "{@code NULL} or a pointer to an array of ##VkPresentTimeGOOGLE elements with {@code swapchainCount} entries. If not {@code NULL}, each element of {@code pTimes} contains the earliest time to present the image corresponding to the entry in the ##VkPresentInfoKHR{@code ::pImageIndices} array.")
}

val VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX = struct(Module.VULKAN, "VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX", mutable = false) {
    documentation =
        """
        Structure describing multiview limits that can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX</li>
        </ul>

        If the ##VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.
        """

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkBool32.member("perViewPositionAllComponents", "#TRUE if the implementation supports per-view position values that differ in components other than the X component.")
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

    VkViewportCoordinateSwizzleNV.member("x", "a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the x component of the primitive")
    VkViewportCoordinateSwizzleNV.member("y", "a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the y component of the primitive")
    VkViewportCoordinateSwizzleNV.member("z", "a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the z component of the primitive")
    VkViewportCoordinateSwizzleNV.member("w", "a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the w component of the primitive")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineViewportSwizzleStateCreateFlagsNV.member("flags", "reserved for future use.")
    AutoSize("pViewportSwizzles", optional = true)..uint32_t.member("viewportCount", "the number of viewport swizzles used by the pipeline.")
    nullable..VkViewportSwizzleNV.const.p.buffer("pViewportSwizzles", "a pointer to an array of ##VkViewportSwizzleNV structures, defining the viewport swizzles.")
}

val VkPhysicalDeviceDiscardRectanglePropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDiscardRectanglePropertiesEXT") {
    documentation =
        """
        Structure describing discard rectangle limits that can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT</li>
        </ul>

        If the ##VkPhysicalDeviceDiscardRectanglePropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.
        """

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    uint32_t.member("maxDiscardRectangles", "the maximum number of discard rectangles that <b>can</b> be specified.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineDiscardRectangleStateCreateFlagsEXT.member("flags", "reserved for future use.")
    VkDiscardRectangleModeEXT.member("discardRectangleMode", "the mode used to determine whether fragments that lie within the discard rectangle are discarded or not.")
    AutoSize("pDiscardRectangles", optional = true)..uint32_t.member("discardRectangleCount", "the number of discard rectangles used by the pipeline.")
    nullable..VkRect2D.const.p.buffer("pDiscardRectangles", "a pointer to an array of ##VkRect2D structures, defining the discard rectangles. If the discard rectangle state is dynamic, this member is ignored.")
}

val VkPhysicalDeviceConservativeRasterizationPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceConservativeRasterizationPropertiesEXT") {
    documentation =
        """
        Structure describing conservative raster properties that can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT</li>
        </ul>

        If the ##VkPhysicalDeviceConservativeRasterizationPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2KHR, it is filled with the implementation-dependent limits and properties.
        """

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    float.member("primitiveOverestimationSize", "the size in pixels the generating primitive is increased at each of its edges during conservative rasterization overestimation mode. Even with a size of 0.0, conservative rasterization overestimation rules still apply and if any part of the pixel rectangle is covered by the generating primitive, fragments are generated for the entire pixel. However implementations <b>may</b> make the pixel coverage area even more conservative by increasing the size of the generating primitive.")
    float.member("maxExtraPrimitiveOverestimationSize", "the maximum size in pixels of extra overestimation the implementation supports in the pipeline state. A value of 0.0 means the implementation does not support any additional overestimation of the generating primitive during conservative rasterization. A value above 0.0 allows the application to further increase the size of the generating primitive during conservative rasterization overestimation.")
    float.member("extraPrimitiveOverestimationSizeGranularity", "the granularity of extra overestimation that can be specified in the pipeline state between 0.0 and {@code maxExtraPrimitiveOverestimationSize} inclusive. A value of 0.0 means the implementation can use the smallest representable non-zero value in the screen space pixel fixed-point grid.")
    VkBool32.member("primitiveUnderestimation", "true if the implementation supports the #CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT conservative rasterization mode in addition to #CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT. Otherwise the implementation only supports #CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT.")
    VkBool32.member("conservativePointAndLineRasterization", "true if the implementation supports conservative rasterization of point and line primitives as well as triangle primitives. Otherwise the implementation only supports triangle primitives.")
    VkBool32.member("degenerateTrianglesRasterized", "false if the implementation culls primitives generated from triangles that become zero area after they are quantized to the fixed-point rasterization pixel grid. {@code degenerateTrianglesRasterized} is true if these primitives are not culled and the provoking vertex attributes and depth value are used for the fragments. The primitive area calculation is done on the primitive generated from the clipped triangle if applicable. Zero area primitives are backfacing and the application <b>can</b> enable backface culling if desired.")
    VkBool32.member("degenerateLinesRasterized", "false if the implementation culls lines that become zero length after they are quantized to the fixed-point rasterization pixel grid. {@code degenerateLinesRasterized} is true if zero length lines are not culled and the provoking vertex attributes and depth value are used for the fragments.")
    VkBool32.member("fullyCoveredFragmentShaderInputVariable", "true if the implementation supports the SPIR-V builtin fragment shader input variable FullyCoveredEXT which specifies that conservative rasterization is enabled and the fragment pixel square is fully covered by the generating primitive.")
    VkBool32.member("conservativeRasterizationPostDepthCoverage", "true if the implementation supports conservative rasterization with the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#shaders-fragment-earlytest-postdepthcoverage\">{@code PostDepthCoverage}</a> execution mode enabled. When supported the {@code SampleMask} built-in input variable will reflect the coverage after the early per-fragment depth and stencil tests are applied even when conservative rasterization is enabled. Otherwise <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#shaders-fragment-earlytest-postdepthcoverage\">{@code PostDepthCoverage}</a> execution mode <b>must</b> not be used when conservative rasterization is enabled.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineRasterizationConservativeStateCreateFlagsEXT.member("flags", "reserved for future use.")
    VkConservativeRasterizationModeEXT.member("conservativeRasterizationMode", "the conservative rasterization mode to use.")
    float.member("extraPrimitiveOverestimationSize", "the extra size in pixels to increase the generating primitive during conservative rasterization at each of its edges in {@code X} and {@code Y} equally in screen space beyond the base overestimation specified in ##VkPhysicalDeviceConservativeRasterizationPropertiesEXT{@code ::primitiveOverestimationSize}.")
}

val VkXYColorEXT = struct(Module.VULKAN, "VkXYColorEXT") {
    documentation =
        """
        structure to specify X,Y chromaticity coordinates.
        """

    float.member("x", "")
    float.member("y", "")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkXYColorEXT.member("displayPrimaryRed", "the mastering display&#8217;s red primary in chromaticity coordinates")
    VkXYColorEXT.member("displayPrimaryGreen", "the mastering display&#8217;s green primary in chromaticity coordinates")
    VkXYColorEXT.member("displayPrimaryBlue", "the mastering display&#8217;s blue primary in chromaticity coordinates")
    VkXYColorEXT.member("whitePoint", "the mastering display&#8217;s white-point in chromaticity coordinates")
    float.member("maxLuminance", "the maximum luminance of the mastering display in nits")
    float.member("minLuminance", "the minimum luminance of the mastering display in nits")
    float.member("maxContentLightLevel", "content&#8217;s maximum luminance in nits")
    float.member("maxFrameAverageLightLevel", "the maximum frame average light level in nits")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkAttachmentDescriptionFlags.member("flags", "a bitmask of {@code VkAttachmentDescription2KHRFlagBits} specifying additional properties of the attachment.")
    VkFormat.member("format", "a {@code VkFormat} value specifying the format of the image that will be used for the attachment.")
    VkSampleCountFlagBits.member("samples", "the number of samples of the image as defined in {@code VkSampleCountFlagBits}.")
    VkAttachmentLoadOp.member("loadOp", "a {@code VkAttachmentLoadOp} value specifying how the contents of color and depth components of the attachment are treated at the beginning of the subpass where it is first used.")
    VkAttachmentStoreOp.member("storeOp", "a {@code VkAttachmentStoreOp} value specifying how the contents of color and depth components of the attachment are treated at the end of the subpass where it is last used.")
    VkAttachmentLoadOp.member("stencilLoadOp", "a {@code VkAttachmentLoadOp} value specifying how the contents of stencil components of the attachment are treated at the beginning of the subpass where it is first used.")
    VkAttachmentStoreOp.member("stencilStoreOp", "a {@code VkAttachmentStoreOp} value specifying how the contents of stencil components of the attachment are treated at the end of the last subpass where it is used.")
    VkImageLayout.member("initialLayout", "the layout the attachment image subresource will be in when a render pass instance begins.")
    VkImageLayout.member("finalLayout", "the layout the attachment image subresource will be transitioned to when a render pass instance ends.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t.member("attachment", "either an integer value identifying an attachment at the corresponding index in ##VkRenderPassCreateInfo{@code ::pAttachments}, or #ATTACHMENT_UNUSED to signify that this attachment is not used.")
    VkImageLayout.member("layout", "a {@code VkImageLayout} value specifying the layout the attachment uses during the subpass.")
    VkImageAspectFlags.member("aspectMask", "a mask of which aspect(s) <b>can</b> be accessed within the specified subpass as an input attachment.")
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
            <li>All attachments in {@code pColorAttachments} that are not #ATTACHMENT_UNUSED <b>must</b> have a sample count that is smaller than or equal to the sample count of {@code pDepthStencilAttachment} if it is not #ATTACHMENT_UNUSED</li>
            <li>If any input attachments are #ATTACHMENT_UNUSED, then any pipelines bound during the subpass <b>must</b> not access those input attachments from the fragment shader</li>
            <li>The {@code attachment} member of any element of {@code pPreserveAttachments} <b>must</b> not be #ATTACHMENT_UNUSED</li>
            <li>Any given element of {@code pPreserveAttachments} <b>must</b> not also be an element of any other member of the subpass description</li>
            <li>If any attachment is used as both an input attachment and a color or depth/stencil attachment, then each use <b>must</b> use the same {@code layout}</li>
            <li>If {@code flags} includes #SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX, it <b>must</b> also include #SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX.</li>
            <li>The {@code aspectMask} member of any element of {@code pInputAttachments} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits}</li>
            <li>The {@code aspectMask} member of any element of {@code pInputAttachments} <b>must</b> not be 0</li>
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSubpassDescriptionFlags.member("flags", "a bitmask of {@code VkSubpassDescriptionFlagBits} specifying usage of the subpass.")
    VkPipelineBindPoint.member("pipelineBindPoint", "a {@code VkPipelineBindPoint} value specifying the pipeline type supported for this subpass.")
    uint32_t.member("viewMask", "a bitfield of view indices describing which views rendering is broadcast to in this subpass, when multiview is enabled.")
    AutoSize("pInputAttachments", optional = true)..uint32_t.member("inputAttachmentCount", "the number of input attachments.")
    VkAttachmentReference2KHR.const.p.buffer("pInputAttachments", "an array of ##VkAttachmentReference structures defining the input attachments for this subpass and their layouts.")
    AutoSize("pColorAttachments", "pResolveAttachments", optional = true)..uint32_t.member("colorAttachmentCount", "the number of color attachments.")
    VkAttachmentReference2KHR.const.p.buffer("pColorAttachments", "an array of ##VkAttachmentReference structures defining the color attachments for this subpass and their layouts.")
    nullable..VkAttachmentReference2KHR.const.p.buffer("pResolveAttachments", "an optional array of {@code colorAttachmentCount} ##VkAttachmentReference structures defining the resolve attachments for this subpass and their layouts.")
    nullable..VkAttachmentReference2KHR.const.p.member("pDepthStencilAttachment", "a pointer to a ##VkAttachmentReference specifying the depth/stencil attachment for this subpass and its layout.")
    AutoSize("pPreserveAttachments", optional = true)..uint32_t.member("preserveAttachmentCount", "the number of preserved attachments.")
    uint32_t.const.p.member("pPreserveAttachments", "an array of {@code preserveAttachmentCount} render pass attachment indices identifying attachments that are not used by this subpass, but whose contents <b>must</b> be preserved throughout the subpass.")
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
            <li>If {@code srcSubpass} is equal to {@code dstSubpass}, {@code srcStageMask} and {@code dstStageMask} <b>must</b> only contain one of #PIPELINE_STAGE_TOP_OF_PIPE_BIT, #PIPELINE_STAGE_DRAW_INDIRECT_BIT, #PIPELINE_STAGE_VERTEX_INPUT_BIT, #PIPELINE_STAGE_VERTEX_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT, #PIPELINE_STAGE_GEOMETRY_SHADER_BIT, #PIPELINE_STAGE_FRAGMENT_SHADER_BIT, #PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT, #PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT, #PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT, #PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT, or #PIPELINE_STAGE_ALL_GRAPHICS_BIT</li>
            <li>If {@code srcSubpass} is equal to {@code dstSubpass} and not all of the stages in {@code srcStageMask} and {@code dstStageMask} are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-framebuffer-regions">framebuffer-space stages</a>, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-order">logically latest</a> pipeline stage in {@code srcStageMask} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-order">logically earlier</a> than or equal to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-order">logically earliest</a> pipeline stage in {@code dstStageMask}</li>
            <li>Any access flag included in {@code srcAccessMask} <b>must</b> be supported by one of the pipeline stages in {@code srcStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
            <li>Any access flag included in {@code dstAccessMask} <b>must</b> be supported by one of the pipeline stages in {@code dstStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-access-types-supported">table of supported access types</a></li>
            <li>If {@code dependencyFlags} includes #DEPENDENCY_VIEW_LOCAL_BIT, {@code srcSubpass} <b>must</b> not be equal to #SUBPASS_EXTERNAL</li>
            <li>If {@code dependencyFlags} includes #DEPENDENCY_VIEW_LOCAL_BIT, {@code dstSubpass} <b>must</b> not be equal to #SUBPASS_EXTERNAL</li>
            <li>If {@code dependencyFlags} does not include #DEPENDENCY_VIEW_LOCAL_BIT, {@code viewOffset} <b>must</b> be 0</li>
            <li>If {@code viewOffset} is not 0, {@code srcSubpass} <b>must</b> not be equal to {@code dstSubpass}.</li>
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t.member("srcSubpass", "the subpass index of the first subpass in the dependency, or #SUBPASS_EXTERNAL.")
    uint32_t.member("dstSubpass", "the subpass index of the second subpass in the dependency, or #SUBPASS_EXTERNAL.")
    VkPipelineStageFlags.member("srcStageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#synchronization-pipeline-stages-masks\">source stage mask</a>.")
    VkPipelineStageFlags.member("dstStageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#synchronization-pipeline-stages-masks\">destination stage mask</a>")
    VkAccessFlags.member("srcAccessMask", "a bitmask of {@code VkAccessFlagBits} specifying a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#synchronization-access-masks\">source access mask</a>.")
    VkAccessFlags.member("dstAccessMask", "a bitmask of {@code VkAccessFlagBits} specifying a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#synchronization-access-masks\">destination access mask</a>.")
    VkDependencyFlags.member("dependencyFlags", "a bitmask of {@code VkDependencyFlagBits}.")
    int32_t.member("viewOffset", "controls which views in the source subpass the views in the destination subpass depend on.")
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
            <li>The value of any element of the {@code pPreserveAttachments} member in any given element of {@code pSubpasses} <b>must</b> not be #ATTACHMENT_UNUSED</li>
            <li>For any member of {@code pAttachments} with a {@code loadOp} equal to #ATTACHMENT_LOAD_OP_CLEAR, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@code VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL} or {@code VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}.</li>
            <li>For any element of {@code pDependencies}, if the {@code srcSubpass} is not #SUBPASS_EXTERNAL, all stage flags included in the {@code srcStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the source subpass.</li>
            <li>For any element of {@code pDependencies}, if the {@code dstSubpass} is not #SUBPASS_EXTERNAL, all stage flags included in the {@code dstStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the source subpass.</li>
            <li>The set of bits included in any element of {@code pCorrelatedViewMasks} <b>must</b> not overlap with the set of bits included in any other element of {@code pCorrelatedViewMasks}</li>
            <li>If the ##VkSubpassDescription2KHR{@code ::viewMask} member of all elements of {@code pSubpasses} is 0, {@code correlatedViewMaskCount} <b>must</b> be 0</li>
            <li>The ##VkSubpassDescription2KHR{@code ::viewMask} member of all elements of {@code pSubpasses} <b>must</b> either all be 0, or all not be 0</li>
            <li>If the ##VkSubpassDescription2KHR{@code ::viewMask} member of all elements of {@code pSubpasses} is 0, the {@code dependencyFlags} member of any element of {@code pDependencies} <b>must</b> not include #DEPENDENCY_VIEW_LOCAL_BIT</li>
            <li>For any element of {@code pDependencies} where its {@code srcSubpass} member equals its {@code dstSubpass} member, if the {@code viewMask} member of the corresponding element of {@code pSubpasses} includes more than one bit, its {@code dependencyFlags} member <b>must</b> include #DEPENDENCY_VIEW_LOCAL_BIT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>If {@code attachmentCount} is not 0, {@code pAttachments} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid ##VkAttachmentDescription2KHR structures</li>
            <li>{@code pSubpasses} <b>must</b> be a valid pointer to an array of {@code subpassCount} valid ##VkSubpassDescription2KHR structures</li>
            <li>If {@code dependencyCount} is not 0, {@code pDependencies} <b>must</b> be a valid pointer to an array of {@code dependencyCount} valid ##VkSubpassDependency2KHR structures</li>
            <li>If {@code correlatedViewMaskCount} is not 0, {@code pCorrelatedViewMasks} <b>must</b> be a valid pointer to an array of {@code correlatedViewMaskCount} {@code uint32_t} values</li>
            <li>{@code subpassCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentDescription2KHR, ##VkSubpassDependency2KHR, ##VkSubpassDescription2KHR, #CreateRenderPass2KHR()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkRenderPassCreateFlags.member("flags", "reserved for future use.")
    AutoSize("pAttachments", optional = true)..uint32_t.member("attachmentCount", "the number of attachments used by this render pass.")
    VkAttachmentDescription2KHR.const.p.buffer("pAttachments", "points to an array of {@code attachmentCount} ##VkAttachmentDescription2KHR structures describing the attachments used by the render pass.")
    AutoSize("pSubpasses")..uint32_t.member("subpassCount", "the number of subpasses to create.")
    VkSubpassDescription2KHR.const.p.buffer("pSubpasses", "points to an array of {@code subpassCount} ##VkSubpassDescription2KHR structures describing each subpass.")
    AutoSize("pDependencies", optional = true)..uint32_t.member("dependencyCount", "the number of dependencies between pairs of subpasses.")
    VkSubpassDependency2KHR.const.p.buffer("pDependencies", "points to an array of {@code dependencyCount} ##VkSubpassDependency2KHR structures describing dependencies between pairs of subpasses.")
    AutoSize("pCorrelatedViewMasks", optional = true)..uint32_t.member("correlatedViewMaskCount", "the number of correlation masks.")
    uint32_t.const.p.member("pCorrelatedViewMasks", "an array of view masks indicating sets of views that <b>may</b> be more efficient to render concurrently.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSubpassContents.member("contents", "a {@code VkSubpassContents} value specifying how the commands in the next subpass will be provided.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
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

    VkStructureType.member("sType", "the type of this structure.").mutable()
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkImageUsageFlags.member("sharedPresentSupportedUsageFlags", "a bitmask of {@code VkImageUsageFlagBits} representing the ways the application <b>can</b> use the shared presentable image from a swapchain created with {@code VkPresentModeKHR} set to #PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR or #PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR for the surface on the specified device. #IMAGE_USAGE_COLOR_ATTACHMENT_BIT <b>must</b> be included in the set but implementations <b>may</b> support additional usages.")
}

val VkPhysicalDeviceExternalFenceInfoKHR = struct(Module.VULKAN, "VkPhysicalDeviceExternalFenceInfoKHR", alias = VkPhysicalDeviceExternalFenceInfo) {
    documentation = "See ##VkPhysicalDeviceExternalFenceInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkExternalFenceHandleTypeFlagBits.member("handleType", "")
}

val VkExternalFencePropertiesKHR = struct(Module.VULKAN, "VkExternalFencePropertiesKHR", mutable = false, alias = VkExternalFenceProperties) {
    documentation = "See ##VkExternalFenceProperties."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkExternalFenceHandleTypeFlags.member("exportFromImportedHandleTypes", "")
    VkExternalFenceHandleTypeFlags.member("compatibleHandleTypes", "")
    VkExternalFenceFeatureFlags.member("externalFenceFeatures", "")
}

val VkExportFenceCreateInfoKHR = struct(Module.VULKAN, "VkExportFenceCreateInfoKHR", alias = VkExportFenceCreateInfo) {
    documentation = "See ##VkExportFenceCreateInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkExternalFenceHandleTypeFlags.member("handleTypes", "")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkFence.member("fence", "the fence into which the state will be imported.")
    VkFenceImportFlags.member("flags", "a bitmask of {@code VkFenceImportFlagBits} specifying additional parameters for the fence payload import operation.")
    VkExternalFenceHandleTypeFlagBits.member("handleType", "specifies the type of {@code handle}.")
    HANDLE.member("handle", "the external handle to import, or {@code NULL}.")
    LPCWSTR.member("name", "the NULL-terminated UTF-16 string naming the underlying synchronization primitive to import, or {@code NULL}.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    nullable..SECURITY_ATTRIBUTES.const.p.member("pAttributes", "a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.")
    DWORD.member("dwAccess", "a {@code DWORD} specifying access rights of the handle.")
    LPCWSTR.member("name", "a NULL-terminated UTF-16 string to associate with the underlying synchronization primitive referenced by NT handles exported from the created fence.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkFence.member("fence", "the fence from which state will be exported.")
    VkExternalFenceHandleTypeFlagBits.member("handleType", "the type of handle requested.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkFence.member("fence", "the fence into which the payload will be imported.")
    VkFenceImportFlags.member("flags", "a bitmask of {@code VkFenceImportFlagBits} specifying additional parameters for the fence payload import operation.")
    VkExternalFenceHandleTypeFlagBits.member("handleType", "specifies the type of {@code fd}.")
    int.member("fd", "the external handle to import.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkFence.member("fence", "the fence from which state will be exported.")
    VkExternalFenceHandleTypeFlagBits.member("handleType", "the type of handle requested.")
}

val VkPhysicalDevicePointClippingPropertiesKHR = struct(Module.VULKAN, "VkPhysicalDevicePointClippingPropertiesKHR", mutable = false, alias = VkPhysicalDevicePointClippingProperties) {
    documentation = "See ##VkPhysicalDevicePointClippingProperties."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkPointClippingBehavior.member("pointClippingBehavior", "")
}

val VkRenderPassInputAttachmentAspectCreateInfoKHR = struct(Module.VULKAN, "VkRenderPassInputAttachmentAspectCreateInfoKHR", alias = VkRenderPassInputAttachmentAspectCreateInfo) {
    documentation = "See ##VkRenderPassInputAttachmentAspectCreateInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    AutoSize("pAspectReferences")..uint32_t.member("aspectReferenceCount", "")
    VkInputAttachmentAspectReference.const.p.buffer("pAspectReferences", "")
}

val VkInputAttachmentAspectReferenceKHR = struct(Module.VULKAN, "VkInputAttachmentAspectReferenceKHR", alias = VkInputAttachmentAspectReference) {
    documentation = "See ##VkInputAttachmentAspectReference."

    uint32_t.member("subpass", "")
    uint32_t.member("inputAttachmentIndex", "")
    VkImageAspectFlags.member("aspectMask", "")
}

val VkImageViewUsageCreateInfoKHR = struct(Module.VULKAN, "VkImageViewUsageCreateInfoKHR", alias = VkImageViewUsageCreateInfo) {
    documentation = "See ##VkImageViewUsageCreateInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkImageUsageFlags.member("usage", "")
}

val VkPipelineTessellationDomainOriginStateCreateInfoKHR = struct(Module.VULKAN, "VkPipelineTessellationDomainOriginStateCreateInfoKHR", alias = VkPipelineTessellationDomainOriginStateCreateInfo) {
    documentation = "See ##VkPipelineTessellationDomainOriginStateCreateInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkTessellationDomainOrigin.member("domainOrigin", "")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSurfaceKHR.member("surface", "the surface that will be associated with the swapchain.")
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

    VkStructureType.member("sType", "the type of this structure.").mutable()
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkSurfaceCapabilitiesKHR.member("surfaceCapabilities", "a structure of type ##VkSurfaceCapabilitiesKHR describing the capabilities of the specified surface.")
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

    VkStructureType.member("sType", "the type of this structure.").mutable()
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkSurfaceFormatKHR.member("surfaceFormat", "an instance of ##VkSurfaceFormatKHR describing a format-color space pair that is compatible with the specified surface.")
}

val VkPhysicalDeviceVariablePointerFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceVariablePointerFeaturesKHR", alias = VkPhysicalDeviceVariablePointerFeatures) {
    documentation = "See ##VkPhysicalDeviceVariablePointerFeatures."

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    VkBool32.member("variablePointersStorageBuffer", "")
    VkBool32.member("variablePointers", "")
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

    VkStructureType.member("sType", "the type of this structure.").mutable()
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkDisplayPropertiesKHR.member("displayProperties", "an instance of the ##VkDisplayPropertiesKHR structure.")
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

    VkStructureType.member("sType", "the type of this structure.").mutable()
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkDisplayPlanePropertiesKHR.member("displayPlaneProperties", "an instance of the ##VkDisplayPlanePropertiesKHR structure.")
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

    VkStructureType.member("sType", "the type of this structure.").mutable()
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkDisplayModePropertiesKHR.member("displayModeProperties", "an instance of the ##VkDisplayModePropertiesKHR structure.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDisplayModeKHR.member("mode", "the display mode the application intends to program when using the specified plane.")
    uint32_t.member("planeIndex", "")
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

    VkStructureType.member("sType", "the type of this structure.").mutable()
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkDisplayPlaneCapabilitiesKHR.member("capabilities", "an instance of the ##VkDisplayPlaneCapabilitiesKHR structure.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkMacOSSurfaceCreateFlagsMVK.member("flags", "reserved for future use.")
    opaque_const_p.member("pView", "a reference to a {@code NSView} object which will display this surface. This {@code NSView} <b>must</b> be backed by a {@code CALayer} instance of type {@code CAMetalLayer}.")
}

val VkMemoryDedicatedRequirementsKHR = struct(Module.VULKAN, "VkMemoryDedicatedRequirementsKHR", mutable = false, alias = VkMemoryDedicatedRequirements) {
    documentation = "See ##VkMemoryDedicatedRequirements."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkBool32.member("prefersDedicatedAllocation", "")
    VkBool32.member("requiresDedicatedAllocation", "")
}

val VkMemoryDedicatedAllocateInfoKHR = struct(Module.VULKAN, "VkMemoryDedicatedAllocateInfoKHR", alias = VkMemoryDedicatedAllocateInfo) {
    documentation = "See ##VkMemoryDedicatedAllocateInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkImage.member("image", "")
    VkBuffer.member("buffer", "")
}

val VkDebugUtilsObjectNameInfoEXT = struct(Module.VULKAN, "VkDebugUtilsObjectNameInfoEXT") {
    documentation =
        """
        Specify parameters of a name to give to an object.

        <h5>Description</h5>
        Applications <b>may</b> change the name associated with an object simply by calling #SetDebugUtilsObjectNameEXT() again with a new string. If {@code pObjectName} is an empty string, then any previously set name is removed.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code objectType} <b>must</b> not be #OBJECT_TYPE_UNKNOWN</li>
            <li>{@code objectHandle} <b>must</b> not be #NULL_HANDLE</li>
            <li>{@code objectHandle} <b>must</b> be a Vulkan object of the type associated with {@code objectType} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#debugging-object-types">the “{@code VkObjectType} and Vulkan Handle Relationship” table</a>.</li>
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkObjectType.member("objectType", "a {@code VkObjectType} specifying the type of the object to be named.")
    uint64_t.member("objectHandle", "the object to be named.")
    nullable..charUTF8.const.p.member("pObjectName", "a null-terminated UTF-8 string specifying the name to apply to {@code objectHandle}.")
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
            <li>{@code objectHandle} <b>must</b> not be #NULL_HANDLE</li>
            <li>{@code objectHandle} <b>must</b> be a Vulkan object of the type associated with {@code objectType} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#debugging-object-types">the “{@code VkObjectType} and Vulkan Handle Relationship” table</a>.</li>
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkObjectType.member("objectType", "a {@code VkObjectType} specifying the type of the object to be named.")
    uint64_t.member("objectHandle", "the object to be tagged.")
    uint64_t.member("tagName", "a numerical identifier of the tag.")
    AutoSize("pTag")..size_t.member("tagSize", "the number of bytes of data to attach to the object.")
    void.const.p.member("pTag", "an array of {@code tagSize} bytes containing the data to be associated with the object.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    charUTF8.const.p.member("pLabelName", "a pointer to a null-terminated UTF-8 string that contains the name of the label.")
    float.array("color", "an optional RGBA color value that can be associated with the label. A particular implementation <b>may</b> choose to ignore this color value. The values contain RGBA values in order, in the range 0.0 to 1.0. If all elements in {@code color} are set to 0.0 then it is ignored.", size = 4)
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
            <li>{@code objectCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkDebugUtilsLabelEXT, ##VkDebugUtilsObjectNameInfoEXT, #SubmitDebugUtilsMessageEXT()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDebugUtilsMessengerCallbackDataFlagsEXT.member("flags", "0 and reserved for future use.")
    nullable..charUTF8.const.p.member("pMessageIdName", "a null-terminated string that identifies the the particular message ID that is associated with the provided message. If the message corresponds to a validation layer message, then this string may contain the portion of the Vulkan specification that is believed to have been violated.")
    int32_t.member("messageIdNumber", "the ID number of the triggering message. If the message corresponds to a validation layer message, then this number is related to the internal number associated with the message being triggered.")
    charUTF8.const.p.member("pMessage", "a null-terminated string detailing the trigger conditions.")
    AutoSize("pQueueLabels", optional = true)..uint32_t.member("queueLabelCount", "a count of items contained in the {@code pQueueLabels} array.")
    nullable..VkDebugUtilsLabelEXT.p.buffer("pQueueLabels", "NULL or a pointer to an array of ##VkDebugUtilsLabelEXT active in the current {@code VkQueue} at the time the callback was triggered. Refer to <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#debugging-queue-labels\">Queue Labels</a> for more information.")
    AutoSize("pCmdBufLabels", optional = true)..uint32_t.member("cmdBufLabelCount", "a count of items contained in the {@code pCmdBufLabels} array.")
    nullable..VkDebugUtilsLabelEXT.p.buffer("pCmdBufLabels", "NULL or a pointer to an array of ##VkDebugUtilsLabelEXT active in the current {@code VkCommandBuffer} at the time the callback was triggered. Refer to <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#debugging-command-buffer-labels\">Command Buffer Labels</a> for more information.")
    AutoSize("pObjects")..uint32_t.member("objectCount", "a count of items contained in the {@code pObjects} array.")
    VkDebugUtilsObjectNameInfoEXT.p.buffer("pObjects", "a pointer to an array of ##VkDebugUtilsObjectNameInfoEXT objects related to the detected issue. The array is roughly in order or importance, but the 0th element is always guaranteed to be the most important object for this message.")
}

val VkDebugUtilsMessengerCreateInfoEXT = struct(Module.VULKAN, "VkDebugUtilsMessengerCreateInfoEXT") {
    documentation =
        """
        Structure specifying parameters of a newly created debug messenger.

        <h5>Description</h5>
        For each {@code VkDebugUtilsMessengerEXT} that is created the ##VkDebugUtilsMessengerCreateInfoEXT{@code ::messageSeverity} and ##VkDebugUtilsMessengerCreateInfoEXT{@code ::messageTypes} determine when that ##VkDebugUtilsMessengerCreateInfoEXT{@code ::pfnUserCallback} is called. The process to determine if the user's pfnUserCallback is triggered when an event occurs is as follows:

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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDebugUtilsMessengerCreateFlagsEXT.member("flags", "0 and reserved for future use.")
    VkDebugUtilsMessageSeverityFlagsEXT.member("messageSeverity", "a bitmask of {@code VkDebugUtilsMessageSeverityFlagBitsEXT} specifying which severity of event(s) will cause this callback to be called.")
    VkDebugUtilsMessageTypeFlagsEXT.member("messageType", "")
    PFN_vkDebugUtilsMessengerCallbackEXT.member("pfnUserCallback", "the application callback function to call.")
    nullable..opaque_p.member("pUserData", "user data to be passed to the callback.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSamplerReductionModeEXT.member("reductionMode", "an enum of type {@code VkSamplerReductionModeEXT} that controls how texture filtering combines texel values.")
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

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkBool32.member("filterMinmaxSingleComponentFormats", "a boolean value indicating whether a minimum set of required formats support min/max filtering.")
    VkBool32.member("filterMinmaxImageComponentMapping", "a boolean value indicating whether the implementation supports non-identity component mapping of the image when doing min/max filtering.")
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

    float.member("x", "the horizontal coordinate of the sample&#8217;s location.")
    float.member("y", "the vertical coordinate of the sample&#8217;s location.")
}

val VkSampleLocationsInfoEXT = struct(Module.VULKAN, "VkSampleLocationsInfoEXT") {
    documentation =
        """
        Structure specifying a set of sample locations.

        <h5>Description</h5>
        This structure <b>can</b> be used either to specify the sample locations to be used for rendering or to specify the set of sample locations an image subresource has been last rendered with for the purposes of layout transitions of depth/stencil images created with #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT.

        The sample locations in {@code pSampleLocations} specify {@code sampleLocationsPerPixel} number of sample locations for each pixel in the grid of the size specified in {@code sampleLocationGridSize}. The sample location for sample <code>i</code> at the pixel grid location <code>(x,y)</code> is taken from <code>pSampleLocations[(x + y <b> sampleLocationGridSize.width) </b> sampleLocationsPerPixel + i]</code>.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code sampleLocationsPerPixel} <b>must</b> be a bit value that is set in ##VkPhysicalDeviceSampleLocationsPropertiesEXT{@code ::sampleLocationSampleCounts}</li>
            <li>{@code sampleLocationsCount} <b>must</b> equal <code>sampleLocationsPerPixel × sampleLocationGridSize.width × sampleLocationGridSize.height</code></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT</li>
            <li>{@code sampleLocationsPerPixel} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
            <li>{@code pSampleLocations} <b>must</b> be a valid pointer to an array of {@code sampleLocationsCount} ##VkSampleLocationEXT structures</li>
            <li>{@code sampleLocationsCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentSampleLocationsEXT, ##VkExtent2D, ##VkPipelineSampleLocationsStateCreateInfoEXT, ##VkSampleLocationEXT, ##VkSubpassSampleLocationsEXT, #CmdSetSampleLocationsEXT()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSampleCountFlagBits.member("sampleLocationsPerPixel", "a {@code VkSampleCountFlagBits} specifying the number of sample locations per pixel.")
    VkExtent2D.member("sampleLocationGridSize", "the size of the sample location grid to select custom sample locations for.")
    AutoSize("pSampleLocations")..uint32_t.member("sampleLocationsCount", "the number of sample locations in {@code pSampleLocations}.")
    VkSampleLocationEXT.const.p.buffer("pSampleLocations", "an array of {@code sampleLocationsCount} ##VkSampleLocationEXT structures.")
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

    uint32_t.member("attachmentIndex", "the index of the attachment for which the sample locations state is provided.")
    VkSampleLocationsInfoEXT.member("sampleLocationsInfo", "the sample locations state to use for the layout transition of the given attachment from the initial layout of the attachment to the image layout specified for the attachment in the first subpass using it.")
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

    uint32_t.member("subpassIndex", "the index of the subpass for which the sample locations state is provided.")
    VkSampleLocationsInfoEXT.member("sampleLocationsInfo", "the sample locations state to use for the layout transition of the depth/stencil attachment away from the image layout the attachment is used with in the subpass specified in {@code subpassIndex}.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pAttachmentInitialSampleLocations", optional = true)..uint32_t.member("attachmentInitialSampleLocationsCount", "the number of elements in the {@code pAttachmentInitialSampleLocations} array.")
    VkAttachmentSampleLocationsEXT.const.p.buffer("pAttachmentInitialSampleLocations", "an array of {@code attachmentInitialSampleLocationsCount} ##VkAttachmentSampleLocationsEXT structures specifying the attachment indices and their corresponding sample location state. Each element of {@code pAttachmentInitialSampleLocations} <b>can</b> specify the sample location state to use in the automatic layout transition performed to transition a depth/stencil attachment from the initial layout of the attachment to the image layout specified for the attachment in the first subpass using it.")
    AutoSize("pPostSubpassSampleLocations", optional = true)..uint32_t.member("postSubpassSampleLocationsCount", "the number of elements in the {@code pPostSubpassSampleLocations} array.")
    VkSubpassSampleLocationsEXT.const.p.buffer("pPostSubpassSampleLocations", "an array of {@code postSubpassSampleLocationsCount} ##VkSubpassSampleLocationsEXT structures specifying the subpass indices and their corresponding sample location state. Each element of {@code pPostSubpassSampleLocations} <b>can</b> specify the sample location state to use in the automatic layout transition performed to transition the depth/stencil attachment used by the specified subpass to the image layout specified in a dependent subpass or to the final layout of the attachment in case the specified subpass is the last subpass using that attachment. In addition, if ##VkPhysicalDeviceSampleLocationsPropertiesEXT{@code ::variableSampleLocations} is #FALSE, each element of {@code pPostSubpassSampleLocations} <b>must</b> specify the sample location state that matches the sample locations used by all pipelines that will be bound to a command buffer during the specified subpass. If {@code variableSampleLocations} is #TRUE, the sample locations used for rasterization do not depend on {@code pPostSubpassSampleLocations}.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32.member("sampleLocationsEnable", "controls whether custom sample locations are used. If {@code sampleLocationsEnable} is #FALSE, the default sample locations are used and the values specified in {@code sampleLocationsInfo} are ignored.")
    VkSampleLocationsInfoEXT.member("sampleLocationsInfo", "the sample locations to use during rasterization if {@code sampleLocationsEnable} is #TRUE and the graphics pipeline is not created with #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT.")
}

val VkPhysicalDeviceSampleLocationsPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceSampleLocationsPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing sample location limits that can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT</li>
        </ul>

        If the ##VkPhysicalDeviceSampleLocationsPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.

        <h5>See Also</h5>
        ##VkExtent2D
        """

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkSampleCountFlags.member("sampleLocationSampleCounts", "a bitmask of {@code VkSampleCountFlagBits} indicating the sample counts supporting custom sample locations.")
    VkExtent2D.member("maxSampleLocationGridSize", "the maximum size of the pixel grid in which sample locations <b>can</b> vary that is supported for all sample counts in {@code sampleLocationSampleCounts}.")
    float.array("sampleLocationCoordinateRange", "the range of supported sample location coordinates.", size = 2)
    uint32_t.member("sampleLocationSubPixelBits", "the number of bits of subpixel precision for sample locations.")
    VkBool32.member("variableSampleLocations", "specifies whether the sample locations used by all pipelines that will be bound to a command buffer during a subpass <b>must</b> match. If set to #TRUE, the implementation supports variable sample locations in a subpass. If set to #FALSE, then the sample locations <b>must</b> stay constant in each subpass.")
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

    VkStructureType.member("sType", "the type of this structure.").mutable()
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkExtent2D.member("maxSampleLocationGridSize", "the maximum size of the pixel grid in which sample locations <b>can</b> vary.")
}

val VkBufferMemoryRequirementsInfo2KHR = struct(Module.VULKAN, "VkBufferMemoryRequirementsInfo2KHR", alias = VkBufferMemoryRequirementsInfo2) {
    documentation = "See ##VkBufferMemoryRequirementsInfo2."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkBuffer.member("buffer", "")
}

val VkImageMemoryRequirementsInfo2KHR = struct(Module.VULKAN, "VkImageMemoryRequirementsInfo2KHR", alias = VkImageMemoryRequirementsInfo2) {
    documentation = "See ##VkImageMemoryRequirementsInfo2."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkImage.member("image", "")
}

val VkImageSparseMemoryRequirementsInfo2KHR = struct(Module.VULKAN, "VkImageSparseMemoryRequirementsInfo2KHR", alias = VkImageSparseMemoryRequirementsInfo2) {
    documentation = "See ##VkImageSparseMemoryRequirementsInfo2."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkImage.member("image", "")
}

val VkMemoryRequirements2KHR = struct(Module.VULKAN, "VkMemoryRequirements2KHR", mutable = false, alias = VkMemoryRequirements2) {
    documentation = "See ##VkMemoryRequirements2."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkMemoryRequirements.member("memoryRequirements", "")
}

val VkSparseImageMemoryRequirements2KHR = struct(Module.VULKAN, "VkSparseImageMemoryRequirements2KHR", mutable = false, alias = VkSparseImageMemoryRequirements2) {
    documentation = "See ##VkSparseImageMemoryRequirements2."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkSparseImageMemoryRequirements.member("memoryRequirements", "")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pViewFormats", optional = true)..uint32_t.member("viewFormatCount", "the number of entries in the {@code pViewFormats} array.")
    VkFormat.const.p.member("pViewFormats", "an array which lists of all formats which <b>can</b> be used when creating views of this image.")
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

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    VkBool32.member("advancedBlendCoherentOperations", "specifies whether blending using <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#framebuffer-blend-advanced\">advanced blend operations</a> is guaranteed to execute atomically and in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#drawing-primitive-order\">primitive order</a>. If this is #TRUE, #ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT is treated the same as #ACCESS_COLOR_ATTACHMENT_READ_BIT, and advanced blending needs no additional synchronization over basic blending. If this is #FALSE, then memory dependencies are required to guarantee order between two advanced blending operations that occur on the same sample.")
}

val VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing advanced blending limits that can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT</li>
        </ul>

        If the ##VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.
        """

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    uint32_t.member("advancedBlendMaxColorAttachments", "one greater than the highest color attachment index that <b>can</b> be used in a subpass, for a pipeline that uses an <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#framebuffer-blend-advanced\">advanced blend operation</a>.")
    VkBool32.member("advancedBlendIndependentBlend", "specifies whether advanced blend operations <b>can</b> vary per-attachment.")
    VkBool32.member("advancedBlendNonPremultipliedSrcColor", "specifies whether the source color <b>can</b> be treated as non-premultiplied. If this is #FALSE, then ##VkPipelineColorBlendAdvancedStateCreateInfoEXT{@code ::srcPremultiplied} <b>must</b> be #TRUE.")
    VkBool32.member("advancedBlendNonPremultipliedDstColor", "specifies whether the destination color <b>can</b> be treated as non-premultiplied. If this is #FALSE, then ##VkPipelineColorBlendAdvancedStateCreateInfoEXT{@code ::dstPremultiplied} <b>must</b> be #TRUE.")
    VkBool32.member("advancedBlendCorrelatedOverlap", "specifies whether the overlap mode <b>can</b> be treated as correlated. If this is #FALSE, then ##VkPipelineColorBlendAdvancedStateCreateInfoEXT{@code ::blendOverlap} <b>must</b> be #BLEND_OVERLAP_UNCORRELATED_EXT.")
    VkBool32.member("advancedBlendAllOperations", "specifies whether all advanced blend operation enums are supported. See the valid usage of ##VkPipelineColorBlendAttachmentState.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32.member("srcPremultiplied", "specifies whether the source color of the blend operation is treated as premultiplied.")
    VkBool32.member("dstPremultiplied", "specifies whether the destination color of the blend operation is treated as premultiplied.")
    VkBlendOverlapEXT.member("blendOverlap", "a {@code VkBlendOverlapEXT} value specifying how the source and destination sample&#8217;s coverage is correlated.")
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

    VkStructureType.member("sType", "the type of this structure")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure")
    VkPipelineCoverageToColorStateCreateFlagsNV.member("flags", "reserved for future use.")
    VkBool32.member("coverageToColorEnable", "controls whether the fragment coverage value replaces a fragment color output.")
    uint32_t.member("coverageToColorLocation", "controls which fragment shader color output value is replaced.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineCoverageModulationStateCreateFlagsNV.member("flags", "reserved for future use.")
    VkCoverageModulationModeNV.member("coverageModulationMode", "controls which color components are modulated and is of type {@code VkCoverageModulationModeNV}.")
    VkBool32.member("coverageModulationTableEnable", "controls whether the modulation factor is looked up from a table in {@code pCoverageModulationTable}.")
    AutoSize("pCoverageModulationTable", optional = true)..uint32_t.member("coverageModulationTableCount", "the number of elements in {@code pCoverageModulationTable}.")
    nullable..float.const.p.member("pCoverageModulationTable", "a table of modulation factors containing a value for each number of covered samples.")
}

val VkSamplerYcbcrConversionCreateInfoKHR = struct(Module.VULKAN, "VkSamplerYcbcrConversionCreateInfoKHR", alias = VkSamplerYcbcrConversionCreateInfo) {
    documentation = "See ##VkSamplerYcbcrConversionCreateInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkFormat.member("format", "")
    VkSamplerYcbcrModelConversion.member("ycbcrModel", "")
    VkSamplerYcbcrRange.member("ycbcrRange", "")
    VkComponentMapping.member("components", "")
    VkChromaLocation.member("xChromaOffset", "")
    VkChromaLocation.member("yChromaOffset", "")
    VkFilter.member("chromaFilter", "")
    VkBool32.member("forceExplicitReconstruction", "")
}

val VkSamplerYcbcrConversionInfoKHR = struct(Module.VULKAN, "VkSamplerYcbcrConversionInfoKHR", alias = VkSamplerYcbcrConversionInfo) {
    documentation = "See ##VkSamplerYcbcrConversionInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkSamplerYcbcrConversion.member("conversion", "")
}

val VkBindImagePlaneMemoryInfoKHR = struct(Module.VULKAN, "VkBindImagePlaneMemoryInfoKHR", alias = VkBindImagePlaneMemoryInfo) {
    documentation = "See ##VkBindImagePlaneMemoryInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkImageAspectFlagBits.member("planeAspect", "")
}

val VkImagePlaneMemoryRequirementsInfoKHR = struct(Module.VULKAN, "VkImagePlaneMemoryRequirementsInfoKHR", alias = VkImagePlaneMemoryRequirementsInfo) {
    documentation = "See ##VkImagePlaneMemoryRequirementsInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkImageAspectFlagBits.member("planeAspect", "")
}

val VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR = struct(Module.VULKAN, "VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR", alias = VkPhysicalDeviceSamplerYcbcrConversionFeatures) {
    documentation = "See ##VkPhysicalDeviceSamplerYcbcrConversionFeatures."

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    VkBool32.member("samplerYcbcrConversion", "")
}

val VkSamplerYcbcrConversionImageFormatPropertiesKHR = struct(Module.VULKAN, "VkSamplerYcbcrConversionImageFormatPropertiesKHR", mutable = false, alias = VkSamplerYcbcrConversionImageFormatProperties) {
    documentation = "See ##VkSamplerYcbcrConversionImageFormatProperties."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    uint32_t.member("combinedImageSamplerDescriptorCount", "")
}

val VkBindBufferMemoryInfoKHR = struct(Module.VULKAN, "VkBindBufferMemoryInfoKHR", alias = VkBindBufferMemoryInfo) {
    documentation = "See ##VkBindBufferMemoryInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkBuffer.member("buffer", "")
    VkDeviceMemory.member("memory", "")
    VkDeviceSize.member("memoryOffset", "")
}

val VkBindImageMemoryInfoKHR = struct(Module.VULKAN, "VkBindImageMemoryInfoKHR", alias = VkBindImageMemoryInfo) {
    documentation = "See ##VkBindImageMemoryInfo."

    VkStructureType.member("sType", "")
    nullable..opaque_const_p.member("pNext", "")
    VkImage.member("image", "")
    VkDeviceMemory.member("memory", "")
    VkDeviceSize.member("memoryOffset", "")
}

val VkValidationCacheCreateInfoEXT = struct(Module.VULKAN, "VkValidationCacheCreateInfoEXT") {
    documentation =
        """
        Structure specifying parameters of a newly created validation cache.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code initialDataSize} is not 0, it <b>must</b> be equal to the size of {@code pInitialData}, as returned by #GetValidationCacheDataEXT() when {@code pInitialData} was originally retrieved</li>
            <li>If {@code initialDataSize} is not 0, {@code pInitialData} <b>must</b> have been retrieved from a previous call to #GetValidationCacheDataEXT()</li>
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkValidationCacheCreateFlagsEXT.member("flags", "reserved for future use.")
    AutoSize("pInitialData", optional = true)..size_t.member("initialDataSize", "the number of bytes in {@code pInitialData}. If {@code initialDataSize} is zero, the validation cache will initially be empty.")
    void.const.p.member("pInitialData", "a pointer to previously retrieved validation cache data. If the validation cache data is incompatible (as defined below) with the device, the validation cache will be initially empty. If {@code initialDataSize} is zero, {@code pInitialData} is ignored.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkValidationCacheEXT.member("validationCache", "the validation cache object from which the results of prior validation attempts will be written, and to which new validation results for this {@code VkShaderModule} will be written (if not already present).")
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
            <li>All bindings with descriptor type #DESCRIPTOR_TYPE_INPUT_ATTACHMENT, #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC, or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC <b>must</b> not use #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT</li>
            <li>If ##VkPhysicalDeviceDescriptorIndexingFeaturesEXT{@code ::descriptorBindingUpdateUnusedWhilePending} is not enabled, all elements of {@code pBindingFlags} <b>must</b> not include #DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT</li>
            <li>If ##VkPhysicalDeviceDescriptorIndexingFeaturesEXT{@code ::descriptorBindingPartiallyBound} is not enabled, all elements of {@code pBindingFlags} <b>must</b> not include #DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT</li>
            <li>If ##VkPhysicalDeviceDescriptorIndexingFeaturesEXT{@code ::descriptorBindingVariableDescriptorCount} is not enabled, all elements of {@code pBindingFlags} <b>must</b> not include #DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT</li>
            <li>If an element of {@code pBindingFlags} includes #DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT, that element&#8217;s {@code descriptorType} <b>must</b> not be #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT</li>
            <li>If {@code bindingCount} is not 0, {@code pBindingFlags} <b>must</b> be a valid pointer to an array of {@code bindingCount} valid combinations of {@code VkDescriptorBindingFlagBitsEXT} values</li>
            <li>Each element of {@code pBindingFlags} <b>must</b> not be 0</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pBindingFlags", optional = true)..uint32_t.member("bindingCount", "zero or the number of elements in {@code pBindingFlags}.")
    VkDescriptorBindingFlagsEXT.const.p.member("pBindingFlags", "a pointer to an array of {@code VkDescriptorBindingFlagsEXT} bitfields, one for each descriptor set layout binding.")
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

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    VkBool32.member("shaderInputAttachmentArrayDynamicIndexing", "indicates whether arrays of input attachments <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_INPUT_ATTACHMENT <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code InputAttachmentArrayDynamicIndexingEXT} capability.")
    VkBool32.member("shaderUniformTexelBufferArrayDynamicIndexing", "indicates whether arrays of uniform texel buffers <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code UniformTexelBufferArrayDynamicIndexingEXT} capability.")
    VkBool32.member("shaderStorageTexelBufferArrayDynamicIndexing", "indicates whether arrays of storage texel buffers <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageTexelBufferArrayDynamicIndexingEXT} capability.")
    VkBool32.member("shaderUniformBufferArrayNonUniformIndexing", "indicates whether arrays of uniform buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code UniformBufferArrayNonUniformIndexingEXT} capability.")
    VkBool32.member("shaderSampledImageArrayNonUniformIndexing", "indicates whether arrays of samplers or sampled images <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_SAMPLER, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, or #DESCRIPTOR_TYPE_SAMPLED_IMAGE <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code SampledImageArrayNonUniformIndexingEXT} capability.")
    VkBool32.member("shaderStorageBufferArrayNonUniformIndexing", "indicates whether arrays of storage buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageBufferArrayNonUniformIndexingEXT} capability.")
    VkBool32.member("shaderStorageImageArrayNonUniformIndexing", "indicates whether arrays of storage images <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_STORAGE_IMAGE <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageImageArrayNonUniformIndexingEXT} capability.")
    VkBool32.member("shaderInputAttachmentArrayNonUniformIndexing", "indicates whether arrays of input attachments <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_INPUT_ATTACHMENT <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code InputAttachmentArrayNonUniformIndexingEXT} capability.")
    VkBool32.member("shaderUniformTexelBufferArrayNonUniformIndexing", "indicates whether arrays of uniform texel buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code UniformTexelBufferArrayNonUniformIndexingEXT} capability.")
    VkBool32.member("shaderStorageTexelBufferArrayNonUniformIndexing", "indicates whether arrays of storage texel buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageTexelBufferArrayNonUniformIndexingEXT} capability.")
    VkBool32.member("descriptorBindingUniformBufferUpdateAfterBind", "indicates whether the implementation supports updating uniform buffer descriptors after a set is bound. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT <b>must</b> not be used with #DESCRIPTOR_TYPE_UNIFORM_BUFFER.")
    VkBool32.member("descriptorBindingSampledImageUpdateAfterBind", "indicates whether the implementation supports updating sampled image descriptors after a set is bound. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT <b>must</b> not be used with #DESCRIPTOR_TYPE_SAMPLER, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, or #DESCRIPTOR_TYPE_SAMPLED_IMAGE.")
    VkBool32.member("descriptorBindingStorageImageUpdateAfterBind", "indicates whether the implementation supports updating storage image descriptors after a set is bound. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT <b>must</b> not be used with #DESCRIPTOR_TYPE_STORAGE_IMAGE.")
    VkBool32.member("descriptorBindingStorageBufferUpdateAfterBind", "indicates whether the implementation supports updating storage buffer descriptors after a set is bound. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT <b>must</b> not be used with #DESCRIPTOR_TYPE_STORAGE_BUFFER.")
    VkBool32.member("descriptorBindingUniformTexelBufferUpdateAfterBind", "indicates whether the implementation supports updating uniform texel buffer descriptors after a set is bound. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT <b>must</b> not be used with #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER.")
    VkBool32.member("descriptorBindingStorageTexelBufferUpdateAfterBind", "indicates whether the implementation supports updating storage texel buffer descriptors after a set is bound. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT <b>must</b> not be used with #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER.")
    VkBool32.member("descriptorBindingUpdateUnusedWhilePending", "indicates whether the implementation supports updating descriptors while the set is in use. If this feature is not enabled, #DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT <b>must</b> not be used.")
    VkBool32.member("descriptorBindingPartiallyBound", "indicates whether the implementation supports statically using a descriptor set binding in which some descriptors are not valid. If this feature is not enabled, #DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT <b>must</b> not be used.")
    VkBool32.member("descriptorBindingVariableDescriptorCount", "indicates whether the implementation supports descriptor sets with a variable-sized last binding. If this feature is not enabled, #DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT <b>must</b> not be used.")
    VkBool32.member("runtimeDescriptorArray", "indicates whether the implementation supports the SPIR-V RuntimeDescriptorArrayEXT capability. If this feature is not enabled, descriptors <b>must</b> not be declared in runtime arrays.")
}

val VkPhysicalDeviceDescriptorIndexingPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorIndexingPropertiesEXT", mutable = false) {
    documentation =
        """
        Structure describing descriptor indexing properties that can be supported by an implementation.

        <h5>Description</h5>
        If the ##VkPhysicalDeviceDescriptorIndexingPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2KHR, it is filled with the implementation-dependent limits.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    uint32_t.member("maxUpdateAfterBindDescriptorsInAllPools", "the maximum number of descriptors (summed over all descriptor types) that <b>can</b> be created across all pools that are created with the #DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT bit set. Pool creation <b>may</b> fail when this limit is exceeded, or when the space this limit represents is unable to satisfy a pool creation due to fragmentation.")
    VkBool32.member("shaderUniformBufferArrayNonUniformIndexingNative", "a boolean value indicating whether uniform buffer descriptors natively support nonuniform indexing. If this is #FALSE, then a single dynamic instance of an instruction that nonuniformly indexes an array of uniform buffers <b>may</b> execute multiple times in order to access all the descriptors.")
    VkBool32.member("shaderSampledImageArrayNonUniformIndexingNative", "a boolean value indicating whether sampler and image descriptors natively support nonuniform indexing. If this is #FALSE, then a single dynamic instance of an instruction that nonuniformly indexes an array of samplers or images <b>may</b> execute multiple times in order to access all the descriptors.")
    VkBool32.member("shaderStorageBufferArrayNonUniformIndexingNative", "a boolean value indicating whether storage buffer descriptors natively support nonuniform indexing. If this is #FALSE, then a single dynamic instance of an instruction that nonuniformly indexes an array of storage buffers <b>may</b> execute multiple times in order to access all the descriptors.")
    VkBool32.member("shaderStorageImageArrayNonUniformIndexingNative", "a boolean value indicating whether storage image descriptors natively support nonuniform indexing. If this is #FALSE, then a single dynamic instance of an instruction that nonuniformly indexes an array of storage images <b>may</b> execute multiple times in order to access all the descriptors.")
    VkBool32.member("shaderInputAttachmentArrayNonUniformIndexingNative", "a boolean value indicating whether input attachment descriptors natively support nonuniform indexing. If this is #FALSE, then a single dynamic instance of an instruction that nonuniformly indexes an array of input attachments <b>may</b> execute multiple times in order to access all the descriptors.")
    VkBool32.member("robustBufferAccessUpdateAfterBind", "a boolean value indicating whether <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#features-features-robustBufferAccess\">{@code robustBufferAccess}</a> <b>can</b> be enabled in a device simultaneously with {@code descriptorBindingUniformBufferUpdateAfterBind}, {@code descriptorBindingStorageBufferUpdateAfterBind}, {@code descriptorBindingUniformTexelBufferUpdateAfterBind}, and/or {@code descriptorBindingStorageTexelBufferUpdateAfterBind}. If this is #FALSE, then either {@code robustBufferAccess} <b>must</b> be disabled or all of these update-after-bind features <b>must</b> be disabled.")
    VkBool32.member("quadDivergentImplicitLod", "a boolean value indicating whether implicit level of detail calculations for image operations have well-defined results when the image and/or sampler objects used for the instruction are not uniform within a quad. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#textures-derivative-image-operations\">Derivative Image Operations</a>.")
    uint32_t.member("maxPerStageDescriptorUpdateAfterBindSamplers", "similar to {@code maxPerStageDescriptorSamplers} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t.member("maxPerStageDescriptorUpdateAfterBindUniformBuffers", "similar to {@code maxPerStageDescriptorUniformBuffers} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t.member("maxPerStageDescriptorUpdateAfterBindStorageBuffers", "similar to {@code maxPerStageDescriptorStorageBuffers} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t.member("maxPerStageDescriptorUpdateAfterBindSampledImages", "similar to {@code maxPerStageDescriptorSampledImages} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t.member("maxPerStageDescriptorUpdateAfterBindStorageImages", "similar to {@code maxPerStageDescriptorStorageImages} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t.member("maxPerStageDescriptorUpdateAfterBindInputAttachments", "similar to {@code maxPerStageDescriptorInputAttachments} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t.member("maxPerStageUpdateAfterBindResources", "similar to {@code maxPerStageResources} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t.member("maxDescriptorSetUpdateAfterBindSamplers", "similar to {@code maxDescriptorSetSamplers} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t.member("maxDescriptorSetUpdateAfterBindUniformBuffers", "similar to {@code maxDescriptorSetUniformBuffers} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t.member("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic", "similar to {@code maxDescriptorSetUniformBuffersDynamic} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t.member("maxDescriptorSetUpdateAfterBindStorageBuffers", "similar to {@code maxDescriptorSetStorageBuffers} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t.member("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic", "similar to {@code maxDescriptorSetStorageBuffersDynamic} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t.member("maxDescriptorSetUpdateAfterBindSampledImages", "similar to {@code maxDescriptorSetSampledImages} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t.member("maxDescriptorSetUpdateAfterBindStorageImages", "similar to {@code maxDescriptorSetStorageImages} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
    uint32_t.member("maxDescriptorSetUpdateAfterBindInputAttachments", "similar to {@code maxDescriptorSetInputAttachments} but counts descriptors from descriptor sets created with or without the #DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT bit set.")
}

val VkDescriptorSetVariableDescriptorCountAllocateInfoEXT = struct(Module.VULKAN, "VkDescriptorSetVariableDescriptorCountAllocateInfoEXT") {
    documentation =
        """
        Structure specifying additional allocation parameters for descriptor sets.

        <h5>Description</h5>
        If {@code descriptorSetCount} is zero or this structure is not included in the {@code pNext} chain, then the variable lengths are considered to be zero. Otherwise, {@code pDescriptorCounts}[i] is the number of descriptors in the variable count descriptor binding in the corresponding descriptor set layout. If ##VkDescriptorSetAllocateInfo{@code ::pSetLayouts}[i] does not include a variable count descriptor binding, then {@code pDescriptorCounts}[i] is ignored.

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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pDescriptorCounts", optional = true)..uint32_t.member("descriptorSetCount", "zero or the number of elements in {@code pDescriptorCounts}.")
    uint32_t.const.p.member("pDescriptorCounts", "an array of descriptor counts, with each member specifying the number of descriptors in a variable descriptor count binding in the corresponding descriptor set being allocated.")
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

    VkStructureType.member("sType", "the type of this structure.").mutable()
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    uint32_t.member("maxVariableDescriptorCount", "indicates the maximum number of descriptors supported in the highest numbered binding of the layout, if that binding is variable-sized.")
}

val VkPhysicalDeviceMaintenance3PropertiesKHR = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance3PropertiesKHR", mutable = false, alias = VkPhysicalDeviceMaintenance3Properties) {
    documentation = "See ##VkPhysicalDeviceMaintenance3Properties."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    uint32_t.member("maxPerSetDescriptors", "")
    VkDeviceSize.member("maxMemoryAllocationSize", "")
}

val VkDescriptorSetLayoutSupportKHR = struct(Module.VULKAN, "VkDescriptorSetLayoutSupportKHR", mutable = false, alias = VkDescriptorSetLayoutSupport) {
    documentation = "See ##VkDescriptorSetLayoutSupport."

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkBool32.member("supported", "")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkQueueGlobalPriorityEXT.member("globalPriority", "the system-wide priority associated to this queue as specified by {@code VkQueueGlobalPriorityEXT}")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32.member("storageBuffer8BitAccess", "indicates whether objects in the {@code StorageBuffer} storage class with the {@code Block} decoration <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code StorageBuffer8BitAccess} capability.")
    VkBool32.member("uniformAndStorageBuffer8BitAccess", "indicates whether objects in the {@code Uniform} storage class with the {@code Block} decoration and in the {@code StorageBuffer} storage class with the same decoration <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code UniformAndStorageBuffer8BitAccess} capability.")
    VkBool32.member("storagePushConstant8", "indicates whether objects in the {@code PushConstant} storage class <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code StoragePushConstant8} capability.")
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

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagBits.member("handleType", "specifies the handle type.")
    nullable..opaque_p.member("pHostPointer", "the host pointer to import from.")
}

val VkMemoryHostPointerPropertiesEXT = struct(Module.VULKAN, "VkMemoryHostPointerPropertiesEXT") {
    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    uint32_t.member("memoryTypeBits", "")
}

val VkPhysicalDeviceExternalMemoryHostPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceExternalMemoryHostPropertiesEXT") {
    documentation =
        """
        Structure describing external memory host pointer limits that can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT</li>
        </ul>

        If the ##VkPhysicalDeviceExternalMemoryHostPropertiesEXT structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2KHR, it is filled with the implementation-dependent limits.
        """

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    VkDeviceSize.member("minImportedHostPointerAlignment", "the minimum required: alignment, in bytes, for the base address and size of host pointers that <b>can</b> be imported to a Vulkan memory object.")
}

val VkPhysicalDeviceShaderCorePropertiesAMD = struct(Module.VULKAN, "VkPhysicalDeviceShaderCorePropertiesAMD", mutable = false) {
    documentation =
        """
        Structure describing shader core properties that can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD</li>
        </ul>

        If the ##VkPhysicalDeviceShaderCorePropertiesAMD structure is included in the {@code pNext} chain of ##VkPhysicalDeviceProperties2, it is filled with the implementation-dependent limits.
        """

    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    uint32_t.member("shaderEngineCount", "an unsigned integer value indicating the number of shader engines found inside the shader core of the physical device.")
    uint32_t.member("shaderArraysPerEngineCount", "an unsigned integer value indicating the number of shader arrays inside a shader engine. Each shader array has its own scan converter, set of compute units, and a render back end (color and depth buffers). Shader arrays within a shader engine share shader processor input (wave launcher) and shader export (export buffer) units. Currently, a shader engine can have one or two shader arrays.")
    uint32_t.member("computeUnitsPerShaderArray", "an unsigned integer value indicating the number of compute units within a shader array. A compute unit houses a set of SIMDs along with a sequencer module and a local data store.")
    uint32_t.member("simdPerComputeUnit", "an unsigned integer value indicating the number of SIMDs inside a compute unit. Each SIMD processes a single instruction at a time.")
    uint32_t.member("wavefrontsPerSimd", "")
    uint32_t.member("wavefrontSize", "an unsigned integer value indicating the number of channels (or threads) in a wavefront.")
    uint32_t.member("sgprsPerSimd", "an unsigned integer value indicating the number of physical Scalar General Purpose Registers (SGPRs) per SIMD.")
    uint32_t.member("minSgprAllocation", "an unsigned integer value indicating the minimum number of SGPRs allocated for a wave.")
    uint32_t.member("maxSgprAllocation", "an unsigned integer value indicating the maximum number of SGPRs allocated for a wave.")
    uint32_t.member("sgprAllocationGranularity", "an unsigned integer value indicating the granularity of SGPR allocation for a wave.")
    uint32_t.member("vgprsPerSimd", "an unsigned integer value indicating the number of physical Vector General Purpose Registers (VGPRs) per SIMD.")
    uint32_t.member("minVgprAllocation", "an unsigned integer value indicating the minimum number of VGPRs allocated for a wave.")
    uint32_t.member("maxVgprAllocation", "an unsigned integer value indicating the maximum number of VGPRs allocated for a wave.")
    uint32_t.member("vgprAllocationGranularity", "an unsigned integer value indicating the granularity of VGPR allocation for a wave.")
}

val VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT = struct(Module.VULKAN, "VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT") {
    documentation =
        """
        Structure describing max value of vertex attribute divisor that can be supported by an implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT</li>
        </ul>
        """

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    uint32_t.member("maxVertexAttribDivisor", "the maximum value of the number of instances that will repeat the value of vertex attribute data when instanced rendering is enabled.")
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
            <li>{@code divisor} <b>must</b> be a value between 1 and ##VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT{@code ::maxVertexAttribDivisor}, inclusive.</li>
            <li>##VkVertexInputBindingDescription{@code ::inputRate} <b>must</b> be of type #VERTEX_INPUT_RATE_INSTANCE for this {@code binding}.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineVertexInputDivisorStateCreateInfoEXT
        """

    uint32_t.member("binding", "the binding number for which the divisor is specified.")
    uint32_t.member("divisor", "the the number of successive instances that will use the same value of the vertex attribute when instanced rendering is enabled. For example, if the divisor is N, the same vertex attribute will applied to N successive instances before moving on to the next vertex attribute. The maximum value of divisor is implementation dependent and can be queried using ##VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT{@code ::maxVertexAttribDivisor}.")
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

    VkStructureType.member("sType", "the type of this structure")
    nullable..opaque_const_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure")
    AutoSize("pVertexBindingDivisors")..uint32_t.member("vertexBindingDivisorCount", "the number of elements in the {@code pVertexBindingDivisors} array.")
    VkVertexInputBindingDivisorDescriptionEXT.const.p.buffer("pVertexBindingDivisors", "a pointer to an array of ##VkVertexInputBindingDivisorDescriptionEXT structures, which specifies the divisor value for each binding.")
}

val VkQueueFamilyCheckpointPropertiesNV = struct(Module.VULKAN, "VkQueueFamilyCheckpointPropertiesNV", mutable = false) {
    VkStructureType.member("sType", "").mutable()
    nullable..opaque_p.member("pNext", "").mutable()
    VkPipelineStageFlags.member("checkpointExecutionStageMask", "")
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

        Note that the stages at which a checkpoint marker <b>can</b> be executed are implementation-defined and <b>can</b> be queried by calling {@code vkGetPhysicalDeviceQueueFamilyProperties2}.

        <h5>See Also</h5>
        #GetQueueCheckpointDataNV()
        """

    VkStructureType.member("sType", "the type of this structure").mutable()
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.").mutable()
    VkPipelineStageFlagBits.member("stage", "indicates which pipeline stage the checkpoint marker data refers to.")
    opaque_p.member("pCheckpointMarker", "contains the value of the last checkpoint marker executed in the stage that {@code stage} refers to.")
}