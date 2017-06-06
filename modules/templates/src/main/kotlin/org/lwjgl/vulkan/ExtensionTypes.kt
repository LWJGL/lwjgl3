/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*
//import org.lwjgl.system.android.*
import org.lwjgl.system.linux.*
import org.lwjgl.system.windows.*

// Handle types
val VkSurfaceKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSurfaceKHR")
val VkSwapchainKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSwapchainKHR")
val VkDisplayKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDisplayKHR")
val VkDisplayModeKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDisplayModeKHR")
val VkDebugReportCallbackEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDebugReportCallbackEXT")
val VkDescriptorUpdateTemplateKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDescriptorUpdateTemplateKHR")
val VkObjectTableNVX = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkObjectTableNVX")
val VkIndirectCommandsLayoutNVX = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkIndirectCommandsLayoutNVX")

// Enum types
val VkSurfaceTransformFlagBitsKHR = "VkSurfaceTransformFlagBitsKHR".enumType
val VkColorSpaceKHR = "VkColorSpaceKHR".enumType
val VkPresentModeKHR = "VkPresentModeKHR".enumType
val VkCompositeAlphaFlagBitsKHR = "VkCompositeAlphaFlagBitsKHR".enumType
val VkDisplayPlaneAlphaFlagBitsKHR = "VkDisplayPlaneAlphaFlagBitsKHR".enumType
val VkDebugReportObjectTypeEXT = "VkDebugReportObjectTypeEXT".enumType
val VkRasterizationOrderAMD = "VkRasterizationOrderAMD".enumType
val VkExternalMemoryHandleTypeFlagBitsNV = "VkExternalMemoryHandleTypeFlagBitsNV".enumType
val VkExternalMemoryFeatureFlagBitsNV = "VkExternalMemoryFeatureFlagBitsNV".enumType
val VkPeerMemoryFeatureFlagBitsKHX = "VkPeerMemoryFeatureFlagBitsKHX".enumType
val VkMemoryAllocateFlagBitsKHX = "VkMemoryAllocateFlagBitsKHX".enumType
val VkDeviceGroupPresentModeFlagBitsKHX = "VkDeviceGroupPresentModeFlagBitsKHX".enumType
val VkValidationCheckEXT = "VkValidationCheckEXT".enumType
val VkExternalMemoryHandleTypeFlagBitsKHX = "VkExternalMemoryHandleTypeFlagBitsKHX".enumType
val VkExternalMemoryFeatureFlagBitsKHX = "VkExternalMemoryFeatureFlagBitsKHX".enumType
val VkExternalSemaphoreHandleTypeFlagBitsKHX = "VkExternalSemaphoreHandleTypeFlagBitsKHX".enumType
val VkExternalSemaphoreFeatureFlagBitsKHX = "VkExternalSemaphoreFeatureFlagBitsKHX".enumType
val VkDescriptorUpdateTemplateTypeKHR = "VkDescriptorUpdateTemplateTypeKHR".enumType
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

// Bitmask types
val VkSurfaceTransformFlagsKHR = typedef(VkFlags, "VkSurfaceTransformFlagsKHR")
val VkCompositeAlphaFlagsKHR = typedef(VkFlags, "VkCompositeAlphaFlagsKHR")
val VkSwapchainCreateFlagsKHR = typedef(VkFlags, "VkSwapchainCreateFlagsKHR")
val VkDisplayPlaneAlphaFlagsKHR = typedef(VkFlags, "VkDisplayPlaneAlphaFlagsKHR")
val VkDisplayModeCreateFlagsKHR = typedef(VkFlags, "VkDisplayModeCreateFlagsKHR")
val VkDisplaySurfaceCreateFlagsKHR = typedef(VkFlags, "VkDisplaySurfaceCreateFlagsKHR")
val VkXlibSurfaceCreateFlagsKHR = typedef(VkFlags, "VkXlibSurfaceCreateFlagsKHR")
val VkWin32SurfaceCreateFlagsKHR = typedef(VkFlags, "VkWin32SurfaceCreateFlagsKHR")
val VkDebugReportFlagsEXT = typedef(VkFlags, "VkDebugReportFlagsEXT")
val VkExternalMemoryHandleTypeFlagsNV = typedef(VkFlags, "VkExternalMemoryHandleTypeFlagsNV")
val VkExternalMemoryFeatureFlagsNV = typedef(VkFlags, "VkExternalMemoryFeatureFlagsNV")
val VkPeerMemoryFeatureFlagsKHX = typedef(VkFlags, "VkPeerMemoryFeatureFlagsKHX")
val VkMemoryAllocateFlagsKHX = typedef(VkFlags, "VkMemoryAllocateFlagsKHX")
val VkDeviceGroupPresentModeFlagsKHX = typedef(VkFlags, "VkDeviceGroupPresentModeFlagsKHX")
val VkCommandPoolTrimFlagsKHR = typedef(VkFlags, "VkCommandPoolTrimFlagsKHR")
val VkExternalMemoryHandleTypeFlagsKHX = typedef(VkFlags, "VkExternalMemoryHandleTypeFlagsKHX")
val VkExternalMemoryFeatureFlagsKHX = typedef(VkFlags, "VkExternalMemoryFeatureFlagsKHX")
val VkExternalSemaphoreHandleTypeFlagsKHX = typedef(VkFlags, "VkExternalSemaphoreHandleTypeFlagsKHX")
val VkExternalSemaphoreFeatureFlagsKHX = typedef(VkFlags, "VkExternalSemaphoreFeatureFlagsKHX")
val VkDescriptorUpdateTemplateCreateFlagsKHR = typedef(VkFlags, "VkDescriptorUpdateTemplateCreateFlagsKHR")
val VkIndirectCommandsLayoutUsageFlagsNVX = typedef(VkFlags, "VkIndirectCommandsLayoutUsageFlagsNVX")
val VkObjectEntryUsageFlagsNVX = typedef(VkFlags, "VkObjectEntryUsageFlagsNVX")
val VkSurfaceCounterFlagsEXT = typedef(VkFlags, "VkSurfaceCounterFlagsEXT")
val VkPipelineViewportSwizzleStateCreateFlagsNV = typedef(VkFlags, "VkPipelineViewportSwizzleStateCreateFlagsNV")
val VkPipelineDiscardRectangleStateCreateFlagsEXT = typedef(VkFlags, "VkPipelineDiscardRectangleStateCreateFlagsEXT")
val VkIOSSurfaceCreateFlagsMVK = typedef(VkFlags, "VkIOSSurfaceCreateFlagsMVK")
val VkMacOSSurfaceCreateFlagsMVK = typedef(VkFlags, "VkMacOSSurfaceCreateFlagsMVK")

// Function pointer types
val PFN_vkDebugReportCallbackEXT = "PFN_vkDebugReportCallbackEXT".callback(
    VULKAN_PACKAGE, VkBool32, "VkDebugReportCallbackEXT",
    "Application-defined debug report callback function.",

    VkDebugReportFlagsEXT.IN("flags", "indicates the {@code VkDebugReportFlagBitsEXT} that triggered this callback."),
    VkDebugReportObjectTypeEXT.IN("objectType", "a {@code VkDebugReportObjectTypeEXT} value specifying the type of object being used or created at the time the event was triggered."),
    uint64_t.IN("object", "the object where the issue was detected. If {@code objectType} is #DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT, {@code object} is undefined."),
    size_t.IN("location", "a component (layer, driver, loader) defined value that indicates the <em>location</em> of the trigger. This is an optional value."),
    int32_t.IN("messageCode", "a layer-defined value indicating what test triggered this callback."),
    const..char_p.IN("pLayerPrefix", "a null-terminated string that is an abbreviation of the name of the component making the callback. {@code pLayerPrefix} is only valid for the duration of the callback."),
    const..char_p.IN("pMessage", "a null-terminated string detailing the trigger conditions. {@code pMessage} is only valid for the duration of the callback."),
    opaque_p.IN("pUserData", "the user data given when the {@code VkDebugReportCallbackEXT} was created.")
) {
    documentation =
        """
        Application-defined debug report callback function.

        <h5>C Specification</h5>
        The prototype for the ##VkDebugReportCallbackCreateInfoEXT{@code ::pfnCallback} function implemented by the application is:

        <code><pre>
￿typedef VkBool32 (VKAPI_PTR *PFN_vkDebugReportCallbackEXT)(
￿    VkDebugReportFlagsEXT                       flags,
￿    VkDebugReportObjectTypeEXT                  objectType,
￿    uint64_t                                    object,
￿    size_t                                      location,
￿    int32_t                                     messageCode,
￿    const char*                                 pLayerPrefix,
￿    const char*                                 pMessage,
￿    void*                                       pUserData);</pre></code>

        <h5>Description</h5>
        The callback <b>must</b> not call #DestroyDebugReportCallbackEXT().

        The callback returns a {@code VkBool32} that indicates to the calling layer the application's desire to abort the call. A value of #TRUE indicates that the application wants to abort this call. If the application returns #FALSE, the command <b>must</b> not be aborted. Applications <b>should</b> always return #FALSE so that they see the same behavior with and without validation layers enabled.

        If the application returns #TRUE from its callback and the Vulkan call being aborted returns a {@code VkResult}, the layer will return #ERROR_VALIDATION_FAILED_EXT.

        <h5>See Also</h5>
        ##VkDebugReportCallbackCreateInfoEXT
        """
    useSystemCallConvention()
}

// Struct types
val VkSurfaceCapabilitiesKHR = struct(VULKAN_PACKAGE, "VkSurfaceCapabilitiesKHR", mutable = false) {
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

val VkSurfaceFormatKHR = struct(VULKAN_PACKAGE, "VkSurfaceFormatKHR", mutable = false) {
    documentation =
        """
        Structure describing a supported swapchain format-color space pair.
        """

    VkFormat.member("format", "a {@code VkFormat} that is compatible with the specified surface.")
    VkColorSpaceKHR.member("colorSpace", "a presentation {@code VkColorSpaceKHR} that is compatible with the surface.")
}

val VkSwapchainCreateInfoKHR = struct(VULKAN_PACKAGE, "VkSwapchainCreateInfoKHR") {
    documentation =
        """
        Structure specifying parameters of a newly created swapchain object.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>should</b> set this value to #TRUE if they do not expect to read back the content of presentable images before presenting them or after reacquiring them and if their pixel shaders do not have any side effects that require them to run for all pixels in the presentable image.
        </div>

        <ul>
            <li>{@code oldSwapchain}, if not #NULL_HANDLE, specifies the swapchain that will be replaced by the new swapchain being created. The new swapchain will be a descendant of {@code oldSwapchain}. Further, any descendants of the new swapchain will also be descendants of {@code oldSwapchain}. Upon calling #CreateSwapchainKHR() with a {@code oldSwapchain} that is not #NULL_HANDLE, any images not acquired by the application <b>may</b> be freed by the implementation, which <b>may</b> occur even if creation of the new swapchain fails. The application <b>must</b> destroy the old swapchain to free all memory associated with the old swapchain. The application <b>must</b> wait for the completion of any outstanding rendering to images it currently has acquired at the time the swapchain is destroyed. The application <b>can</b> continue to present any images it acquired and has not yet presented using the old swapchain, as long as it has not entered a state that causes it to return #ERROR_OUT_OF_DATE_KHR. However, the application <b>cannot</b> acquire any more images from the old swapchain regardless of whether or not creation of the new swapchain succeeds. The application <b>can</b> continue to use a shared presentable image obtained from {@code oldSwapchain} until a presentable image is acquired from the new swapchain, as long as it has not entered a state that causes it to return #ERROR_OUT_OF_DATE_KHR.</li>
        </ul>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code surface} <b>must</b> be a surface that is supported by the device as determined using #GetPhysicalDeviceSurfaceSupportKHR()</li>
            <li>{@code minImageCount} <b>must</b> be greater than or equal to the value returned in the {@code minImageCount} member of the ##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface</li>
            <li>{@code minImageCount} <b>must</b> be less than or equal to the value returned in the {@code maxImageCount} member of the ##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface if the returned {@code maxImageCount} is not zero</li>
            <li>{@code minImageCount} <b>must</b> be 1 if {@code presentMode} is either #PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR or #PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR</li>
            <li>{@code imageFormat} and {@code imageColorSpace} <b>must</b> match the {@code format} and {@code colorSpace} members, respectively, of one of the ##VkSurfaceFormatKHR structures returned by #GetPhysicalDeviceSurfaceFormatsKHR() for the surface</li>
            <li>{@code imageExtent} <b>must</b> be between {@code minImageExtent} and {@code maxImageExtent}, inclusive, where {@code minImageExtent} and {@code maxImageExtent} are members of the ##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface</li>
            <li>{@code imageArrayLayers} <b>must</b> be greater than 0 and less than or equal to the {@code maxImageArrayLayers} member of the ##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface</li>
            <li>{@code imageUsage} <b>must</b> be a subset of the supported usage flags present in the {@code supportedUsageFlags} member of the ##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface if {@code presentMode} is set to #PRESENT_MODE_IMMEDIATE_KHR, #PRESENT_MODE_MAILBOX_KHR, #PRESENT_MODE_FIFO_KHR or #PRESENT_MODE_FIFO_RELAXED_KHR</li>
            <li>{@code imageUsage} <b>must</b> be a subset of the supported usage flags present in the {@code sharedPresentSupportedUsageFlags} member of the ##VkSharedPresentSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilities2KHR() for the surface if {@code presentMode} is set to either #PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR or #PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR</li>
            <li>If {@code imageSharingMode} is #SHARING_MODE_CONCURRENT, {@code pQueueFamilyIndices} <b>must</b> be a pointer to an array of {@code queueFamilyIndexCount} {@code uint32_t} values</li>
            <li>If {@code imageSharingMode} is #SHARING_MODE_CONCURRENT, {@code queueFamilyIndexCount} <b>must</b> be greater than 1</li>
            <li>If {@code sharingMode} is #SHARING_MODE_CONCURRENT, each element of {@code pQueueFamilyIndices} <b>must</b> be unique and <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by either #GetPhysicalDeviceQueueFamilyProperties() or #GetPhysicalDeviceQueueFamilyProperties2KHR() for the {@code physicalDevice} that was used to create {@code device}</li>
            <li>{@code preTransform} <b>must</b> be one of the bits present in the {@code supportedTransforms} member of the ##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface</li>
            <li>{@code compositeAlpha} <b>must</b> be one of the bits present in the {@code supportedCompositeAlpha} member of the ##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface</li>
            <li>{@code presentMode} <b>must</b> be one of the {@code VkPresentModeKHR} values returned by #GetPhysicalDeviceSurfacePresentModesKHR() for the surface</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkDeviceGroupSwapchainCreateInfoKHX</li>
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
        </ul>

        <h5>See Also</h5>
        ##VkExtent2D, #CreateSharedSwapchainsKHR(), #CreateSwapchainKHR()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSwapchainCreateFlagsKHR.member("flags", "a bitmask of {@code VkSwapchainCreateFlagBitsKHR} indicating parameters of swapchain creation.")
    VkSurfaceKHR.member("surface", "the surface that the swapchain will present images to.")
    uint32_t.member("minImageCount", "the minimum number of presentable images that the application needs. The platform will either create the swapchain with at least that many images, or will fail to create the swapchain.")
    VkFormat.member("imageFormat", "a {@code VkFormat} that is valid for swapchains on the specified surface.")
    VkColorSpaceKHR.member("imageColorSpace", "a {@code VkColorSpaceKHR} that is valid for swapchains on the specified surface.")
    VkExtent2D.member("imageExtent", "the size (in pixels) of the swapchain. Behavior is platform-dependent when the image extent does not match the surface&#8217;s {@code currentExtent} as returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR().")
    uint32_t.member("imageArrayLayers", "the number of views in a multiview/stereo surface. For non-stereoscopic-3D applications, this value is 1.")
    VkImageUsageFlags.member("imageUsage", "a bitmask of {@code VkImageUsageFlagBits}, indicating how the application will use the swapchain&#8217;s presentable images.")
    VkSharingMode.member("imageSharingMode", "the sharing mode used for the images of the swapchain.")
    AutoSize("pQueueFamilyIndices", optional = true)..uint32_t.member("queueFamilyIndexCount", "the number of queue families having access to the images of the swapchain in case {@code imageSharingMode} is #SHARING_MODE_CONCURRENT.")
    const..uint32_t_p.member("pQueueFamilyIndices", "an array of queue family indices having access to the images of the swapchain in case {@code imageSharingMode} is #SHARING_MODE_CONCURRENT.")
    VkSurfaceTransformFlagBitsKHR.member("preTransform", "a bitmask of {@code VkSurfaceTransformFlagBitsKHR}, describing the transform, relative to the presentation engine&#8217;s natural orientation, applied to the image content prior to presentation. If it does not match the {@code currentTransform} value returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR(), the presentation engine will transform the image content as part of the presentation operation.")
    VkCompositeAlphaFlagBitsKHR.member("compositeAlpha", "a bitmask of {@code VkCompositeAlphaFlagBitsKHR} indicating the alpha compositing mode to use when this surface is composited together with other surfaces on certain window systems.")
    VkPresentModeKHR.member("presentMode", "the presentation mode the swapchain will use. A swapchain&#8217;s present mode determines how incoming present requests will be processed and queued internally.")
    VkBool32.member("clipped", """indicates whether the Vulkan implementation is allowed to discard rendering operations that affect regions of the surface which are not visible.
<ul>
            <li>If set to #TRUE, the presentable images associated with the swapchain <b>may</b> not own all of their pixels. Pixels in the presentable images that correspond to regions of the target surface obscured by another window on the desktop or subject to some other clipping mechanism will have undefined content when read back. Pixel shaders <b>may</b> not execute for these pixels, and thus any side affects they would have had will not occur.</li>
            <li>If set to #FALSE, presentable images associated with the swapchain will own all the pixels they contain. Setting this value to #TRUE does not guarantee any clipping will occur, but allows more optimal presentation methods to be used on some platforms.</li>
        </ul>""")
    VkSwapchainKHR.member("oldSwapchain", "")
}

val VkPresentInfoKHR = struct(VULKAN_PACKAGE, "VkPresentInfoKHR") {
    documentation =
        """
        Structure describing parameters of a queue presentation.

        <h5>Valid Usage</h5>
        <ul>
            <li>Any given element of {@code pImageIndices} <b>must</b> be the index of a presentable image acquired from the swapchain specified by the corresponding element of the {@code pSwapchains} array, and the presented image subresource <b>must</b> be in the #IMAGE_LAYOUT_PRESENT_SRC_KHR or #IMAGE_LAYOUT_SHARED_PRESENT_KHR layout at the time the operation is executed on a {@code VkDevice}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PRESENT_INFO_KHR</li>
            <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of ##VkDisplayPresentInfoKHR, ##VkPresentRegionsKHR, ##VkDeviceGroupPresentInfoKHX, or ##VkPresentTimesInfoGOOGLE</li>
            <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
            <li>If {@code waitSemaphoreCount} is not 0, and {@code pWaitSemaphores} is not {@code NULL}, {@code pWaitSemaphores} <b>must</b> be a pointer to an array of {@code waitSemaphoreCount} valid {@code VkSemaphore} handles</li>
            <li>{@code pSwapchains} <b>must</b> be a pointer to an array of {@code swapchainCount} valid {@code VkSwapchainKHR} handles</li>
            <li>{@code pImageIndices} <b>must</b> be a pointer to an array of {@code swapchainCount} {@code uint32_t} values</li>
            <li>If {@code pResults} is not {@code NULL}, {@code pResults} <b>must</b> be a pointer to an array of {@code swapchainCount} {@code VkResult} values</li>
            <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        #QueuePresentKHR()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pWaitSemaphores", optional = true)..uint32_t.member("waitSemaphoreCount", "the number of semaphores to wait for before issuing the present request. The number <b>may</b> be zero.")
    nullable..const..VkSemaphore.p.member("pWaitSemaphores", "if not {@code NULL}, is an array of {@code VkSemaphore} objects with {@code waitSemaphoreCount} entries, and specifies the semaphores to wait for before issuing the present request.")
    AutoSize("pSwapchains", "pImageIndices", "pResults")..uint32_t.member("swapchainCount", "the number of swapchains being presented to by this command.")
    const..VkSwapchainKHR.p.member("pSwapchains", "an array of {@code VkSwapchainKHR} objects with {@code swapchainCount} entries. A given swapchain <b>must</b> not appear in this list more than once.")
    const..uint32_t_p.member("pImageIndices", "an array of indices into the array of each swapchain&#8217;s presentable images, with {@code swapchainCount} entries. Each entry in this array identifies the image to present on the corresponding entry in the {@code pSwapchains} array.")
    nullable..VkResult.p.member("pResults", "an array of {@code VkResult} typed elements with {@code swapchainCount} entries. Applications that do not need per-swapchain results <b>can</b> use {@code NULL} for {@code pResults}. If non-{@code NULL}, each entry in {@code pResults} will be set to the {@code VkResult} for presenting the swapchain corresponding to the same index in {@code pSwapchains}.")
}

val VkDisplayPropertiesKHR = struct(VULKAN_PACKAGE, "VkDisplayPropertiesKHR", mutable = false) {
    documentation =
        """
        Structure describing an available display device.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        For devices which have no natural value to return here, implementations <b>should</b> return the maximum resolution supported.
        </div>

        <ul>
            <li>{@code supportedTransforms} tells which transforms are supported by this display. This will contain one or more of the bits from {@code VkSurfaceTransformFlagsKHR}.</li>
            <li>{@code planeReorderPossible} tells whether the planes on this display <b>can</b> have their z order changed. If this is #TRUE, the application <b>can</b> re-arrange the planes on this display in any order relative to each other.</li>
            <li>{@code persistentContent} tells whether the display supports self-refresh/internal buffering. If this is true, the application <b>can</b> submit persistent present operations on swapchains created against this display.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Persistent presents <b>may</b> have higher latency, and <b>may</b> use less power when the screen content is updated infrequently, or when only a portion of the screen needs to be updated in most frames.
        </div>

        <h5>See Also</h5>
        ##VkExtent2D, #GetPhysicalDeviceDisplayPropertiesKHR()
        """

    VkDisplayKHR.member("display", "a handle that is used to refer to the display described here. This handle will be valid for the lifetime of the Vulkan instance.")
    const..charUTF8_p.member("displayName", "a pointer to a NULL-terminated string containing the name of the display. Generally, this will be the name provided by the display&#8217;s EDID. It <b>can</b> be {@code NULL} if no suitable name is available. If not {@code NULL}, the memory it points to <b>must</b> remain accessible as long as {@code display} is valid.")
    VkExtent2D.member("physicalDimensions", "describes the physical width and height of the visible portion of the display, in millimeters.")
    VkExtent2D.member("physicalResolution", "describes the physical, native, or preferred resolution of the display.")
    VkSurfaceTransformFlagsKHR.member("supportedTransforms", "")
    VkBool32.member("planeReorderPossible", "")
    VkBool32.member("persistentContent", "")
}

val VkDisplayModeParametersKHR = struct(VULKAN_PACKAGE, "VkDisplayModeParametersKHR") {
    documentation =
        """
        Structure describing display parameters associated with a display mode.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        For example, a 60Hz display mode would report a {@code refreshRate} of 60,000.
        </div>

        <h5>See Also</h5>
        ##VkDisplayModeCreateInfoKHR, ##VkDisplayModePropertiesKHR, ##VkExtent2D
        """

    VkExtent2D.member("visibleRegion", "the 2D extents of the visible region.")
    uint32_t.member("refreshRate", "a {@code uint32_t} that is the number of times the display is refreshed each second multiplied by 1000.")
}

val VkDisplayModePropertiesKHR = struct(VULKAN_PACKAGE, "VkDisplayModePropertiesKHR", mutable = false) {
    documentation =
        """
        Structure describing display mode properties.
        """

    VkDisplayModeKHR.member("displayMode", "a handle to the display mode described in this structure. This handle will be valid for the lifetime of the Vulkan instance.")
    VkDisplayModeParametersKHR.member("parameters", "a ##VkDisplayModeParametersKHR structure describing the display parameters associated with {@code displayMode}.")
}

val VkDisplayModeCreateInfoKHR = struct(VULKAN_PACKAGE, "VkDisplayModeCreateInfoKHR") {
    documentation =
        """
        Structure specifying parameters of a newly created display mode object.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code width} and {@code height} members of the {@code visibleRegion} member of {@code parameters} <b>must</b> be greater than 0</li>
            <li>The {@code refreshRate} member of {@code parameters} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkDisplayModeParametersKHR, #CreateDisplayModeKHR()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDisplayModeCreateFlagsKHR.member("flags", "reserved for future use, and <b>must</b> be zero.")
    VkDisplayModeParametersKHR.member("parameters", "a ##VkDisplayModeParametersKHR structure describing the display parameters to use in creating the new mode. If the parameters are not compatible with the specified display, the implementation <b>must</b> return #ERROR_INITIALIZATION_FAILED.")
}

val VkDisplayPlaneCapabilitiesKHR = struct(VULKAN_PACKAGE, "VkDisplayPlaneCapabilitiesKHR", mutable = false) {
    documentation =
        """
        Structure describing capabilities of a mode and plane combination.

        <h5>Description</h5>
        The minimum and maximum position and extent fields describe the hardware limits, if any, as they apply to the specified display mode and plane. Vendors <b>may</b> support displaying a subset of a swapchain's presentable images on the specified display plane. This is expressed by returning {@code minSrcPosition}, {@code maxSrcPosition}, {@code minSrcExtent}, and {@code maxSrcExtent} values that indicate a range of possible positions and sizes <b>may</b> be used to specify the region within the presentable images that source pixels will be read from when creating a swapchain on the specified display mode and plane.

        Vendors <b>may</b> also support mapping the presentable images' content to a subset or superset of the visible region in the specified display mode. This is expressed by returning {@code minDstPosition}, {@code maxDstPosition}, {@code minDstExtent} and {@code maxDstExtent} values that indicate a range of possible positions and sizes <b>may</b> be used to describe the region within the display mode that the source pixels will be mapped to.

        Other vendors <b>may</b> support only a 1-1 mapping between pixels in the presentable images and the display mode. This <b>may</b> be indicated by returning <code>(0,0)</code> for {@code minSrcPosition}, {@code maxSrcPosition}, {@code minDstPosition}, and {@code maxDstPosition}, and (display mode width, display mode height) for {@code minSrcExtent}, {@code maxSrcExtent}, {@code minDstExtent}, and {@code maxDstExtent}.

        These values indicate the limits of the hardware's individual fields. Not all combinations of values within the offset and extent ranges returned in ##VkDisplayPlaneCapabilitiesKHR are guaranteed to be supported. Vendors <b>may</b> still fail presentation requests that specify unsupported combinations.

        <h5>See Also</h5>
        ##VkExtent2D, ##VkOffset2D, #GetDisplayPlaneCapabilitiesKHR()
        """

    VkDisplayPlaneAlphaFlagsKHR.member("supportedAlpha", "a bitmask of {@code VkDisplayPlaneAlphaFlagBitsKHR} describing the supported alpha blending modes.")
    VkOffset2D.member("minSrcPosition", "the minimum source rectangle offset supported by this plane using the specified mode.")
    VkOffset2D.member("maxSrcPosition", "the maximum source rectangle offset supported by this plane using the specified mode. The {@code x} and {@code y} components of {@code maxSrcPosition} <b>must</b> each be greater than or equal to the {@code x} and {@code y} components of {@code minSrcPosition}, respectively.")
    VkExtent2D.member("minSrcExtent", "the minimum source rectangle size supported by this plane using the specified mode.")
    VkExtent2D.member("maxSrcExtent", "the maximum source rectangle size supported by this plane using the specified mode.")
    VkOffset2D.member("minDstPosition", "{@code minDstPosition}, {@code maxDstPosition}, {@code minDstExtent}, {@code maxDstExtent} all have similar semantics to their corresponding \"Src\" equivalents, but apply to the output region within the mode rather than the input region within the source image. Unlike the \"Src\" offsets, {@code minDstPosition} and {@code maxDstPosition} <b>may</b> contain negative values.")
    VkOffset2D.member("maxDstPosition", "see {@code minDstPosition}")
    VkExtent2D.member("minDstExtent", "see {@code minDstPosition}")
    VkExtent2D.member("maxDstExtent", "see {@code minDstPosition}")
}

val VkDisplayPlanePropertiesKHR = struct(VULKAN_PACKAGE, "VkDisplayPlanePropertiesKHR", mutable = false) {
    documentation =
        """
        Structure describing display plane properties.
        """

    VkDisplayKHR.member("currentDisplay", "the handle of the display the plane is currently associated with. If the plane is not currently attached to any displays, this will be {@code VK_NULL_HANDLE}.")
    uint32_t.member("currentStackIndex", "the current z-order of the plane. This will be between 0 and the value returned by #GetPhysicalDeviceDisplayPlanePropertiesKHR()() in {@code pPropertyCount}.")
}

val VkDisplaySurfaceCreateInfoKHR = struct(VULKAN_PACKAGE, "VkDisplaySurfaceCreateInfoKHR") {
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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDisplaySurfaceCreateFlagsKHR.member("flags", "reserved for future use, and <b>must</b> be zero.")
    VkDisplayModeKHR.member("displayMode", "a {@code VkDisplayModeKHR} handle specifying the mode to use when displaying this surface.")
    uint32_t.member("planeIndex", "the plane on which this surface appears.")
    uint32_t.member("planeStackIndex", "the z-order of the plane.")
    VkSurfaceTransformFlagBitsKHR.member("transform", "a {@code VkSurfaceTransformFlagBitsKH} value specifying the transformation to apply to images as part of the scanout operation.")
    float.member("globalAlpha", "the global alpha value. This value is ignored if {@code alphaMode} is not #DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR.")
    VkDisplayPlaneAlphaFlagBitsKHR.member("alphaMode", "a {@code VkDisplayPlaneAlphaFlagBitsKHR} value specifying the type of alpha blending to use.")
    VkExtent2D.member("imageExtent", "The size of the presentable images to use with the surface.")
}

val VkDisplayPresentInfoKHR = struct(VULKAN_PACKAGE, "VkDisplayPresentInfoKHR") {
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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkRect2D.member("srcRect", "a rectangular region of pixels to present. It <b>must</b> be a subset of the image being presented. If ##VkDisplayPresentInfoKHR is not specified, this region will be assumed to be the entire presentable image.")
    VkRect2D.member("dstRect", "a rectangular region within the visible region of the swapchain&#8217;s display mode. If ##VkDisplayPresentInfoKHR is not specified, this region will be assumed to be the entire visible region of the visible region of the swapchain&#8217;s mode. If the specified rectangle is a subset of the display mode&#8217;s visible region, content from display planes below the swapchain&#8217;s plane will be visible outside the rectangle. If there are no planes below the swapchain&#8217;s, the area outside the specified rectangle will be black. If portions of the specified rectangle are outside of the display&#8217;s visible region, pixels mapping only to those portions of the rectangle will be discarded.")
    VkBool32.member("persistent", "If this is #TRUE, the display engine will enable buffered mode on displays that support it. This allows the display engine to stop sending content to the display until a new image is presented. The display will instead maintain a copy of the last presented image. This allows less power to be used, but <b>may</b> increase presentation latency. If ##VkDisplayPresentInfoKHR is not specified, persistent mode will not be used.")
}

val VkXlibSurfaceCreateInfoKHR = struct(VULKAN_PACKAGE, "VkXlibSurfaceCreateInfoKHR") {
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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkXlibSurfaceCreateFlagsKHR.member("flags", "reserved for future use.")
    Display.p.member("dpy", "a pointer to an Xlib {@code Display} connection to the X server.")
    Window.member("window", "an Xlib {@code Window} to associate the surface with.")
}

val VkWin32SurfaceCreateInfoKHR = struct(VULKAN_PACKAGE, "VkWin32SurfaceCreateInfoKHR") {
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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkWin32SurfaceCreateFlagsKHR.member("flags", "reserved for future use.")
    HINSTANCE.member("hinstance", "{@code hinstance} and {@code hwnd} are the Win32 {@code HINSTANCE} and {@code HWND} for the window to associate the surface with.")
    HWND.member("hwnd", "see {@code hinstance}")
}

val VkDebugReportCallbackCreateInfoEXT = struct(VULKAN_PACKAGE, "VkDebugReportCallbackCreateInfoEXT") {
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
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkDebugReportFlagBitsEXT} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkDebugReportCallbackEXT, #CreateDebugReportCallbackEXT()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDebugReportFlagsEXT.member("flags", "a bitmask of {@code VkDebugReportFlagBitsEXT} specifying which event(s) will cause this callback to be called.")
    PFN_vkDebugReportCallbackEXT.member("pfnCallback", "the application callback function to call.")
    nullable..opaque_p.member("pUserData", "user data to be passed to the callback.")
}

val VkPipelineRasterizationStateRasterizationOrderAMD = struct(VULKAN_PACKAGE, "VkPipelineRasterizationStateRasterizationOrderAMD") {
    documentation =
        """
        Structure defining rasterization order for a graphics pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD</li>
            <li>{@code rasterizationOrder} <b>must</b> be a valid {@code VkRasterizationOrderAMD} value</li>
        </ul>

        If the {@code VK_AMD_rasterization_order} device extension is not enabled or the application does not request a particular rasterization order through specifying a ##VkPipelineRasterizationStateRasterizationOrderAMD structure then the rasterization order used by the graphics pipeline defaults to #RASTERIZATION_ORDER_STRICT_AMD.
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkRasterizationOrderAMD.member("rasterizationOrder", "a {@code VkRasterizationOrderAMD} value specifying the primitive rasterization order to use.")
}

val VkDebugMarkerObjectNameInfoEXT = struct(VULKAN_PACKAGE, "VkDebugMarkerObjectNameInfoEXT") {
    documentation =
        """
        Specify parameters of a name to give to an object.

        <h5>Description</h5>
        Applications <b>may</b> change the name associated with an object simply by calling #DebugMarkerSetObjectNameEXT() again with a new string. To remove a previously set name, {@code pName} <b>should</b> be set to an empty string.

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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDebugReportObjectTypeEXT.member("objectType", "a {@code VkDebugReportObjectTypeEXT} specifying the type of the object to be named.")
    uint64_t.member("object", "the object to be named.")
    const..charUTF8_p.member("pObjectName", "a null-terminated UTF-8 string specifying the name to apply to {@code object}.")
}

val VkDebugMarkerObjectTagInfoEXT = struct(VULKAN_PACKAGE, "VkDebugMarkerObjectTagInfoEXT") {
    documentation =
        """
        Specify parameters of a tag to attach to an object.

        <h5>Description</h5>
        The {@code tagName} parameter gives a name or identifier to the type of data being tagged. This can be used by debugging layers to easily filter for only data that can be used by that implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
            <li>{@code pTag} <b>must</b> be a pointer to an array of {@code tagSize} bytes</li>
            <li>{@code tagSize} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        #DebugMarkerSetObjectTagEXT()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDebugReportObjectTypeEXT.member("objectType", "a {@code VkDebugReportObjectTypeEXT} specifying the type of the object to be named.")
    uint64_t.member("object", "the object to be tagged.")
    uint64_t.member("tagName", "a numerical identifier of the tag.")
    AutoSize("pTag")..size_t.member("tagSize", "the number of bytes of data to attach to the object.")
    const..void_p.member("pTag", "an array of {@code tagSize} bytes containing the data to be associated with the object.")
}

val VkDebugMarkerMarkerInfoEXT = struct(VULKAN_PACKAGE, "VkDebugMarkerMarkerInfoEXT") {
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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    const..charUTF8_p.member("pMarkerName", "a pointer to a null-terminated UTF-8 string that contains the name of the marker.")
    float.array("color", "an optional RGBA color value that can be associated with the marker. A particular implementation <b>may</b> choose to ignore this color value. The values contain RGBA values in order, in the range 0.0 to 1.0. If all elements in {@code color} are set to 0.0 then it is ignored.", size = 4)
}

val VkDedicatedAllocationImageCreateInfoNV = struct(VULKAN_PACKAGE, "VkDedicatedAllocationImageCreateInfoNV") {
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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32.member("dedicatedAllocation", "indicates whether the image will have a dedicated allocation bound to it.")
}

val VkDedicatedAllocationBufferCreateInfoNV = struct(VULKAN_PACKAGE, "VkDedicatedAllocationBufferCreateInfoNV") {
    documentation =
        """
        Specify that a buffer is bound to a dedicated memory resource.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code dedicatedAllocation} is #TRUE, ##VkBufferCreateInfo{@code ::flags} <b>must</b> not include #BUFFER_CREATE_SPARSE_BINDING_BIT, #BUFFER_CREATE_SPARSE_RESIDENCY_BIT, or #BUFFER_CREATE_SPARSE_ALIASED_BIT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32.member("dedicatedAllocation", "indicates whether the buffer will have a dedicated allocation bound to it.")
}

val VkDedicatedAllocationMemoryAllocateInfoNV = struct(VULKAN_PACKAGE, "VkDedicatedAllocationMemoryAllocateInfoNV") {
    documentation =
        """
        Specify a dedicated memory allocation resource.

        <h5>Valid Usage</h5>
        <ul>
            <li>At least one of {@code image} and {@code buffer} <b>must</b> be {@code VK_NULL_HANDLE}</li>
            <li>If {@code image} is not {@code VK_NULL_HANDLE}, the image <b>must</b> have been created with ##VkDedicatedAllocationImageCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE</li>
            <li>If {@code buffer} is not {@code VK_NULL_HANDLE}, the buffer <b>must</b> have been created with ##VkDedicatedAllocationBufferCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE</li>
            <li>If {@code image} is not {@code VK_NULL_HANDLE}, ##VkMemoryAllocateInfo{@code ::allocationSize} <b>must</b> equal the ##VkMemoryRequirements{@code ::size} of the image</li>
            <li>If {@code buffer} is not {@code VK_NULL_HANDLE}, ##VkMemoryAllocateInfo{@code ::allocationSize} <b>must</b> equal the ##VkMemoryRequirements{@code ::size} of the buffer</li>
            <li>If {@code image} is not {@code VK_NULL_HANDLE} and ##VkMemoryAllocateInfo defines a memory import operation, the memory being imported <b>must</b> also be a dedicated image allocation and {@code image} <b>must</b> be identical to the image associated with the imported memory.</li>
            <li>If {@code buffer} is not {@code VK_NULL_HANDLE} and ##VkMemoryAllocateInfo defines a memory import operation, the memory being imported <b>must</b> also be a dedicated buffer allocation and {@code buffer} <b>must</b> be identical to the buffer associated with the imported memory.</li>
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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkImage.member("image", "{@code VK_NULL_HANDLE} or a handle of an image which this memory will be bound to.")
    VkBuffer.member("buffer", "{@code VK_NULL_HANDLE} or a handle of a buffer which this memory will be bound to.")
}

val VkTextureLODGatherFormatPropertiesAMD = struct(VULKAN_PACKAGE, "VkTextureLODGatherFormatPropertiesAMD", mutable = false) {
    documentation =
        """
        Structure informing whether or not texture gather bias/LOD functionality is supported for a given image format and a given physical device.
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL}.")
    VkBool32.member("supportsTextureGatherLODBiasAMD", "tells if the image format can be used with texture gather bias/LOD functions, as introduced by the #AMD_texture_gather_bias_lod extension. (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#VK_AMD_texture_gather_bias_lod\">VK_AMD_texture_gather_bias_lod</a>). This field is set by the implementation. User-specified value is ignored.")
}

val VkRenderPassMultiviewCreateInfoKHX = struct(VULKAN_PACKAGE, "VkRenderPassMultiviewCreateInfoKHX") {
    documentation =
        """
        Structure containing multiview info for all subpasses.

        <h5>Description</h5>
        When a subpass uses a non-zero view mask, <em>multiview</em> functionality is considered to be enabled. Multiview is all-or-nothing for a render pass - that is, either all subpasses <b>must</b> have a non-zero view mask (though some subpasses <b>may</b> have only one view) or all <b>must</b> be zero. Multiview causes all drawing and clear commands in the subpass to behave as if they were broadcast to each view, where a view is represented by one layer of the framebuffer attachments. All draws and clears are broadcast to each <em>view index</em> whose bit is set in the view mask. The view index is provided in the {@code ViewIndex} shader input variable, and color, depth/stencil, and input attachments all read/write the layer of the framebuffer corresponding to the view index.

        If the view mask is zero for all subpasses, multiview is considered to be disabled and all drawing commands execute normally, without this additional broadcasting.

        Some implementations <b>may</b> not support multiview in conjunction with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-multiview-gs">geometry shaders</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-multiview-tess">tessellation shaders</a>.

        When multiview is enabled, the #DEPENDENCY_VIEW_LOCAL_BIT_KHX bit in a dependency <b>can</b> be used to express a view-local dependency, meaning that each view in the destination subpass depends on a single view in the source subpass. Unlike pipeline barriers, a subpass dependency <b>can</b> potentially have a different view mask in the source subpass and the destination subpass. If the dependency is view-local, then each view (<code>dstView</code>) in the destination subpass depends on the view <code>dstView {plus} pViewOffsets[dependency]</code> in the source subpass. If there is not such a view in the source subpass, then this dependency does not affect that view in the destination subpass. If the dependency is not view-local, then all views in the destination subpass depend on all views in the source subpass, and the view offset is ignored. A non-zero view offset is not allowed in a self-dependency.

        The elements of {@code pCorrelationMasks} are a set of masks of views indicating that views in the same mask <b>may</b> exhibit spatial coherency between the views, making it more efficient to render them concurrently. Correlation masks <b>must</b> not have a functional effect on the results of the multiview rendering.

        When multiview is enabled, at the beginning of each subpass all non-render pass state is undefined. In particular, each time #CmdBeginRenderPass() or #CmdNextSubpass() is called the graphics pipeline <b>must</b> be bound, any relevant descriptor sets or vertex/index buffers <b>must</b> be bound, and any relevant dynamic state or push constants <b>must</b> be set before they are used.

        A multiview subpass <b>can</b> declare that its shaders will write per-view attributes for all views in a single invocation, by setting the #SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX bit in the subpass description. The only supported per-view attributes are position and viewport mask, and per-view position and viewport masks are written to output array variables decorated with {@code PositionPerViewNV} and {@code ViewportMaskPerViewNV}, respectively. If {@code VK_NV_viewport_array2} is not supported and enabled, {@code ViewportMaskPerViewNV} <b>must</b> not be used. Values written to elements of {@code PositionPerViewNV} and {@code ViewportMaskPerViewNV} <b>must</b> not depend on the {@code ViewIndex}. The shader <b>must</b> also write to an output variable decorated with {@code Position}, and the value written to {@code Position} <b>must</b> equal the value written to {@code PositionPerViewNV}[{@code ViewIndex}]. Similarly, if {@code ViewportMaskPerViewNV} is written to then the shader <b>must</b> also write to an output variable decorated with {@code ViewportMaskNV}, and the value written to {@code ViewportMaskNV} <b>must</b> equal the value written to {@code ViewportMaskPerViewNV}[{@code ViewIndex}]. Implementations will either use values taken from {@code Position} and {@code ViewportMaskNV} and invoke the shader once for each view, or will use values taken from {@code PositionPerViewNV} and {@code ViewportMaskPerViewNV} and invoke the shader fewer times. The values written to {@code Position} and {@code ViewportMaskNV} <b>must</b> not depend on the values written to {@code PositionPerViewNV} and {@code ViewportMaskPerViewNV}, or vice versa (to allow compilers to eliminate the unused outputs). All attributes that do not have *PerViewNV counterparts <b>must</b> not depend on {@code ViewIndex}.

        Per-view attributes are all-or-nothing for a subpass. That is, all pipelines compiled against a subpass that includes the #SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX bit <b>must</b> write per-view attributes to the *PerViewNV[] shader outputs, in addition to the non-per-view (e.g. {@code Position}) outputs. Pipelines compiled against a subpass that does not include this bit <b>must</b> not include the *PerViewNV[] outputs in their interfaces.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code subpassCount} is not zero, {@code subpassCount} <b>must</b> be equal to the {@code subpassCount} in the ##VkRenderPassCreateInfo structure at the start of the chain</li>
            <li>If {@code dependencyCount} is not zero, {@code dependencyCount} <b>must</b> be equal to the {@code dependencyCount} in the ##VkRenderPassCreateInfo structure at the start of the chain</li>
            <li>Each view index <b>must</b> not be set in more than one element of {@code pCorrelationMasks}</li>
            <li>If an element of {@code pViewOffsets} is non-zero, the corresponding ##VkSubpassDependency structure <b>must</b> have different values of {@code srcSubpass} and {@code dstSubpass}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>If {@code subpassCount} is not 0, {@code pViewMasks} <b>must</b> be a pointer to an array of {@code subpassCount} {@code uint32_t} values</li>
            <li>If {@code dependencyCount} is not 0, {@code pViewOffsets} <b>must</b> be a pointer to an array of {@code dependencyCount} {@code int32_t} values</li>
            <li>If {@code correlationMaskCount} is not 0, {@code pCorrelationMasks} <b>must</b> be a pointer to an array of {@code correlationMaskCount} {@code uint32_t} values</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pViewMasks", optional = true)..uint32_t.member("subpassCount", "zero or is the number of subpasses in the render pass.")
    const..uint32_t_p.member("pViewMasks", "points to an array of {@code subpassCount} number of view masks, where each mask is a bitfield of view indices describing which views rendering is broadcast to in each subpass, when multiview is enabled. If {@code subpassCount} is zero, each view mask is treated as zero.")
    AutoSize("pViewOffsets", optional = true)..uint32_t.member("dependencyCount", "zero or the number of dependencies in the render pass.")
    const..int32_t_p.member("pViewOffsets", "points to an array of {@code dependencyCount} view offsets, one for each dependency. If {@code dependencyCount} is zero, each dependency&#8217;s view offset is treated as zero. Each view offset controls which views in the source subpass the views in the destination subpass depend on.")
    AutoSize("pCorrelationMasks", optional = true)..uint32_t.member("correlationMaskCount", "zero or a number of correlation masks.")
    const..uint32_t_p.member("pCorrelationMasks", "an array of view masks indicating sets of views that <b>may</b> be more efficient to render concurrently.")
}

val VkPhysicalDeviceMultiviewFeaturesKHX = struct(VULKAN_PACKAGE, "VkPhysicalDeviceMultiviewFeaturesKHX") {
    documentation =
        """
        Structure describing multiview features that can be supported by an implementation.

        <h5>Description</h5>
        <ul>
            <li>{@code multiview} indicates whether the implementation supports multiview rendering within a render pass. If this feature is not enabled, the view mask of each subpass <b>must</b> always be zero.</li>
            <li>{@code multiviewGeometryShader} indicates whether the implementation supports multiview rendering within a render pass, with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#geometry">geometry shaders</a>. If this feature is not enabled, then a pipeline compiled against a subpass with a non-zero view mask <b>must</b> not include a geometry shader.</li>
            <li>{@code multiviewTessellationShader} indicates whether the implementation supports multiview rendering within a render pass, with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#tessellation">tessellation shaders</a>. If this feature is not enabled, then a pipeline compiled against a subpass with a non-zero view mask <b>must</b> not include any tessellation shaders.</li>
        </ul>

        If the ##VkPhysicalDeviceMultiviewFeaturesKHX structure is included in the {@code pNext} chain of #GetPhysicalDeviceFeatures2KHR(), it is filled with values indicating whether each feature is supported. ##VkPhysicalDeviceMultiviewFeaturesKHX <b>can</b> also be used in the {@code pNext} chain of #CreateDevice() to enable features.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code multiviewGeometryShader} is enabled then {@code multiview} <b>must</b> also be enabled.</li>
            <li>If {@code multiviewTessellationShader} is enabled then {@code multiview} <b>must</b> also be enabled.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHX</li>
        </ul>
        """

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    VkBool32.member("multiview", "")
    VkBool32.member("multiviewGeometryShader", "")
    VkBool32.member("multiviewTessellationShader", "")
}

val VkPhysicalDeviceMultiviewPropertiesKHX = struct(VULKAN_PACKAGE, "VkPhysicalDeviceMultiviewPropertiesKHX", mutable = false) {
    documentation =
        """
        Structure describing multiview limits that can be supported by an implementation.

        <h5>Description</h5>
        <ul>
            <li>{@code maxMultiviewViewCount} is one greater than the maximum view index that <b>can</b> be used in a subpass.</li>
            <li>{@code maxMultiviewInstanceIndex} is the maximum valid value of instance index allowed to be generated by a drawing command recorded within a subpass of a multiview render pass instance.</li>
        </ul>

        If the ##VkPhysicalDeviceMultiviewPropertiesKHX structure is included in the {@code pNext} chain of flink:VkPhysicalDeviceProperties2KHR, it is filled with the implementation-dependent limits.
        """

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    uint32_t.member("maxMultiviewViewCount", "")
    uint32_t.member("maxMultiviewInstanceIndex", "")
}

val VkExternalImageFormatPropertiesNV = struct(VULKAN_PACKAGE, "VkExternalImageFormatPropertiesNV", mutable = false) {
    documentation =
        """
        Structure specifying external image format properties.
        """

    VkImageFormatProperties.member("imageFormatProperties", "will be filled in as when calling #GetPhysicalDeviceImageFormatProperties(), but the values returned <b>may</b> vary depending on the external handle type requested.")
    VkExternalMemoryFeatureFlagsNV.member("externalMemoryFeatures", "a bitmask of {@code VkExternalMemoryFeatureFlagBitsNV}, indicating properties of the external memory handle type (#GetPhysicalDeviceExternalImageFormatPropertiesNV(){@code ::externalHandleType}) being queried, or 0 if the external memory handle type is 0.")
    VkExternalMemoryHandleTypeFlagsNV.member("exportFromImportedHandleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} containing a bit set for every external handle type that <b>may</b> be used to create memory from which the handles of the type specified in #GetPhysicalDeviceExternalImageFormatPropertiesNV(){@code ::externalHandleType} <b>can</b> be exported, or 0 if the external memory handle type is 0.")
    VkExternalMemoryHandleTypeFlagsNV.member("compatibleHandleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} containing a bit set for every external handle type that <b>may</b> be specified simultaneously with the handle type specified by #GetPhysicalDeviceExternalImageFormatPropertiesNV(){@code ::externalHandleType} when calling #AllocateMemory(), or 0 if the external memory handle type is 0. {@code compatibleHandleTypes} will always contain #GetPhysicalDeviceExternalImageFormatPropertiesNV(){@code ::externalHandleType}")
}

val VkExternalMemoryImageCreateInfoNV = struct(VULKAN_PACKAGE, "VkExternalMemoryImageCreateInfoNV") {
    documentation =
        """
        Specify that an image may be backed by external memory.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagsNV.member("handleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} specifying one or more external memory handle types.")
}

val VkExportMemoryAllocateInfoNV = struct(VULKAN_PACKAGE, "VkExportMemoryAllocateInfoNV") {
    documentation =
        """
        (no short description available).

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagsNV.member("handleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} specifying one or more memory handle types that <b>may</b> be exported. Multiple handle types <b>may</b> be requested for the same allocation as long as they are compatible, as reported by #GetPhysicalDeviceExternalImageFormatPropertiesNV().")
}

val VkImportMemoryWin32HandleInfoNV = struct(VULKAN_PACKAGE, "VkImportMemoryWin32HandleInfoNV") {
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
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code handleType} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagsNV.member("handleType", "0 or a {@code VkExternalMemoryHandleTypeFlagBitsNV} value specifying the type of memory handle in {@code handle}.")
    HANDLE.member("handle", "a Windows {@code HANDLE} referring to the memory.")
}

val VkExportMemoryWin32HandleInfoNV = struct(VULKAN_PACKAGE, "VkExportMemoryWin32HandleInfoNV") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        specify security attributes and access rights for Win32 memory handles.

        <h5>Description</h5>
        If this structure is not present, or if {@code pAttributes} is set to {@code NULL}, default security descriptor values will be used, and child processes created by the application will not inherit the handle, as described in the MSDN documentation for "{@code Synchronization Object Security and Access Rights}"[1]. Further, if the structure is not present, the access rights will be

        {@code DXGI_SHARED_RESOURCE_READ} | {@code DXGI_SHARED_RESOURCE_WRITE}

        [1] https://msdn.microsoft.com/en-us/library/windows/desktop/ms686670.aspx

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>If {@code pAttributes} is not {@code NULL}, {@code pAttributes} <b>must</b> be a pointer to a valid {@code SECURITY_ATTRIBUTES} value</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    nullable..const..SECURITY_ATTRIBUTES.p.member("pAttributes", "a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.")
    DWORD.member("dwAccess", "a {@code DWORD} specifying access rights of the handle.")
}

val VkWin32KeyedMutexAcquireReleaseInfoNV = struct(VULKAN_PACKAGE, "VkWin32KeyedMutexAcquireReleaseInfoNV") {
    documentation =
        """
        use Windows keyex mutex mechanism to synchronize work.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV</li>
            <li>If {@code acquireCount} is not 0, {@code pAcquireSyncs} <b>must</b> be a pointer to an array of {@code acquireCount} valid {@code VkDeviceMemory} handles</li>
            <li>If {@code acquireCount} is not 0, {@code pAcquireKeys} <b>must</b> be a pointer to an array of {@code acquireCount} {@code uint64_t} values</li>
            <li>If {@code acquireCount} is not 0, {@code pAcquireTimeoutMilliseconds} <b>must</b> be a pointer to an array of {@code acquireCount} {@code uint32_t} values</li>
            <li>If {@code releaseCount} is not 0, {@code pReleaseSyncs} <b>must</b> be a pointer to an array of {@code releaseCount} valid {@code VkDeviceMemory} handles</li>
            <li>If {@code releaseCount} is not 0, {@code pReleaseKeys} <b>must</b> be a pointer to an array of {@code releaseCount} {@code uint64_t} values</li>
            <li>Both of the elements of {@code pAcquireSyncs}, and the elements of {@code pReleaseSyncs} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>
        """

    VkStructureType.member("sType", "")
    nullable..const..opaque_p.member("pNext", "")
    AutoSize("pAcquireSyncs", "pAcquireKeys", "pAcquireTimeoutMilliseconds", optional = true)..uint32_t.member("acquireCount", "the number of entries in the {@code pAcquireSyncs}, {@code pAcquireKeys}, and {@code pAcquireTimeoutMilliseconds} arrays.")
    const..VkDeviceMemory.p.member("pAcquireSyncs", "a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources.")
    const..uint64_t_p.member("pAcquireKeys", "a pointer to an array of mutex key values to wait for prior to beginning the submitted work. Entries refer to the keyed mutex associated with the corresponding entries in {@code pAcquireSyncs}.")
    const..uint32_t_p.member("pAcquireTimeoutMilliseconds", "an array of timeout values, in millisecond units, for each acquire specified in {@code pAcquireKeys}.")
    AutoSize("pReleaseSyncs", "pReleaseKeys", optional = true)..uint32_t.member("releaseCount", "the number of entries in the {@code pReleaseSyncs} and {@code pReleaseKeys} arrays.")
    const..VkDeviceMemory.p.member("pReleaseSyncs", "a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources.")
    const..uint64_t_p.member("pReleaseKeys", "a pointer to an array of mutex key values to set when the submitted work has completed. Entries refer to the keyed mutex associated with the corresponding entries in {@code pReleaseSyncs}.")
}

val VkPhysicalDeviceFeatures2KHR = struct(VULKAN_PACKAGE, "VkPhysicalDeviceFeatures2KHR") {
    documentation =
        """
        Structure describing the fine-grained features that can be supported by an implementation.

        <h5>Description</h5>
        <ul>
            <li>{@code sType} is the type of this structure.</li>
            <li>{@code pNext} is {@code NULL} or a pointer to an extension-specific structure.</li>
            <li>{@code features} is a structure of type ##VkPhysicalDeviceFeatures describing the fine-grained features of the Vulkan 1.0 API.</li>
        </ul>

        The {@code pNext} chain of this structure is used to extend the structure with features defined by extensions. This structure <b>can</b> be used in #GetPhysicalDeviceFeatures2KHR() or <b>can</b> be in the {@code pNext} chain of a ##VkDeviceCreateInfo structure, in which case it controls which features are enabled in the device in lieu of {@code pEnabledFeatures}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkPhysicalDeviceMultiviewFeaturesKHX</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceFeatures, #GetPhysicalDeviceFeatures2KHR()
        """

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    VkPhysicalDeviceFeatures.member("features", "")
}

val VkPhysicalDeviceProperties2KHR = struct(VULKAN_PACKAGE, "VkPhysicalDeviceProperties2KHR", mutable = false) {
    documentation =
        """
        Structure specifying physical device properties.

        <h5>Description</h5>
        The {@code pNext} chain of this structure is used to extend the structure with properties defined by extensions.

        <h5>See Also</h5>
        ##VkPhysicalDeviceProperties, #GetPhysicalDeviceProperties2KHR()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPhysicalDeviceProperties.member("properties", "a structure of type ##VkPhysicalDeviceProperties describing the properties of the physical device. This structure is written with the same values as if it were written by #GetPhysicalDeviceProperties().")
}

val VkFormatProperties2KHR = struct(VULKAN_PACKAGE, "VkFormatProperties2KHR", mutable = false) {
    documentation =
        """
        Structure specifying image format properties.
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkFormatProperties.member("formatProperties", "a structure of type ##VkFormatProperties describing features supported by the requested format.")
}

val VkImageFormatProperties2KHR = struct(VULKAN_PACKAGE, "VkImageFormatProperties2KHR", mutable = false) {
    documentation =
        """
        Structure specifying a image format properties.

        <h5>Description</h5>
        If the combination of parameters to #GetPhysicalDeviceImageFormatProperties2KHR() is not supported by the implementation for use in #CreateImage(), then all members of {@code imageFormatProperties} will be filled with zero.

        <h5>See Also</h5>
        ##VkImageFormatProperties, #GetPhysicalDeviceImageFormatProperties2KHR()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure. The {@code pNext} chain of ##VkImageFormatProperties2KHR is used to allow the specification of additional capabilities to be returned from #GetPhysicalDeviceImageFormatProperties2KHR().")
    VkImageFormatProperties.member("imageFormatProperties", "an instance of a ##VkImageFormatProperties structure in which capabilities are returned.")
}

val VkPhysicalDeviceImageFormatInfo2KHR = struct(VULKAN_PACKAGE, "VkPhysicalDeviceImageFormatInfo2KHR") {
    documentation =
        """
        Structure specifying image creation parameters.

        <h5>Description</h5>
        The members of ##VkPhysicalDeviceImageFormatInfo2KHR correspond to the arguments to #GetPhysicalDeviceImageFormatProperties(), with {@code sType} and {@code pNext} added for extensibility.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkPhysicalDeviceExternalImageFormatInfoKHX</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
            <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
            <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
            <li>{@code usage} <b>must</b> not be 0</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        #GetPhysicalDeviceImageFormatProperties2KHR()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure. The {@code pNext} chain of ##VkPhysicalDeviceImageFormatInfo2KHR is used to provide additional image parameters to #GetPhysicalDeviceImageFormatProperties2KHR().")
    VkFormat.member("format", "a {@code VkFormat} value indicating the image format, corresponding to ##VkImageCreateInfo{@code ::format}.")
    VkImageType.member("type", "a {@code VkImateType} value indicating the image type, corresponding to ##VkImageCreateInfo{@code ::imageType}.")
    VkImageTiling.member("tiling", "a {@code VkImageTiling} value indicating the image tiling, corresponding to ##VkImageCreateInfo{@code ::tiling}.")
    VkImageUsageFlags.member("usage", "a bitmask of {@code VkImageUsageFlagBits} indicating the intended usage of the image, corresponding to ##VkImageCreateInfo{@code ::usage}.")
    VkImageCreateFlags.member("flags", "a bitmask of {@code VkImageCreateFlagBits} indicating additional parameters of the image, corresponding to ##VkImageCreateInfo{@code ::flags}.")
}

val VkQueueFamilyProperties2KHR = struct(VULKAN_PACKAGE, "VkQueueFamilyProperties2KHR", mutable = false) {
    documentation =
        """
        Structure providing information about a queue family.
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkQueueFamilyProperties.member("queueFamilyProperties", "a structure of type ##VkQueueFamilyProperties which is populated with the same values as in #GetPhysicalDeviceQueueFamilyProperties().")
}

val VkPhysicalDeviceMemoryProperties2KHR = struct(VULKAN_PACKAGE, "VkPhysicalDeviceMemoryProperties2KHR", mutable = false) {
    documentation =
        """
        Structure specifying physical device memory properties.
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPhysicalDeviceMemoryProperties.member("memoryProperties", "a structure of type ##VkPhysicalDeviceMemoryProperties which is populated with the same values as in #GetPhysicalDeviceMemoryProperties().")
}

val VkSparseImageFormatProperties2KHR = struct(VULKAN_PACKAGE, "VkSparseImageFormatProperties2KHR", mutable = false) {
    documentation =
        """
        Structure specifying sparse image format properties.
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSparseImageFormatProperties.member("properties", "a structure of type ##VkSparseImageFormatProperties which is populated with the same values as in #GetPhysicalDeviceSparseImageFormatProperties().")
}

val VkPhysicalDeviceSparseImageFormatInfo2KHR = struct(VULKAN_PACKAGE, "VkPhysicalDeviceSparseImageFormatInfo2KHR") {
    documentation =
        """
        Structure specifying sparse image format inputs.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code samples} <b>must</b> be a bit value that is set in ##VkImageFormatProperties{@code ::sampleCounts} returned by #GetPhysicalDeviceImageFormatProperties() with {@code format}, {@code type}, {@code tiling}, and {@code usage} equal to those in this command and {@code flags} equal to the value that is set in ##VkImageCreateInfo{@code ::flags} when the image is created</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
            <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
            <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
            <li>{@code usage} <b>must</b> not be 0</li>
            <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
        </ul>

        <h5>See Also</h5>
        #GetPhysicalDeviceSparseImageFormatProperties2KHR()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkFormat.member("format", "the image format.")
    VkImageType.member("type", "the dimensionality of image.")
    VkSampleCountFlagBits.member("samples", "the number of samples per pixel as defined in {@code VkSampleCountFlagBits}.")
    VkImageUsageFlags.member("usage", "a bitmask describing the intended usage of the image.")
    VkImageTiling.member("tiling", "the tiling arrangement of the data elements in memory.")
}

val VkMemoryAllocateFlagsInfoKHX = struct(VULKAN_PACKAGE, "VkMemoryAllocateFlagsInfoKHX") {
    documentation =
        """
        Structure controlling how many instances of memory will be allocated.

        <h5>Description</h5>
        If #MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX is not set, the number of instances allocated depends on whether #MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX is set in the memory heap. If #MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX is set, then memory is allocated for every physical device in the logical device (as if {@code deviceMask} has bits set for all device indices). If #MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX is not set, then a single instance of memory is allocated (as if {@code deviceMask} is set to one).

        On some implementations, allocations from a multi-instance heap <b>may</b> consume memory on all physical devices even if the {@code deviceMask} excludes some devices. If ##VkPhysicalDeviceGroupPropertiesKHX{@code ::subsetAllocation} is #TRUE, then memory is only consumed for the devices in the device mask.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        In practice, most allocations on a multi-instance heap will be allocated across all physical devices. Unicast allocation support is an optional optimization for a minority of allocations.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>If #MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX is set, {@code deviceMask} <b>must</b> be a valid device mask.</li>
            <li>If #MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX is set, {@code deviceMask} <b>must</b> not be zero</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHX</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkMemoryAllocateFlagBitsKHX} values</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkMemoryAllocateFlagsKHX.member("flags", "a bitmask of {@code VkMemoryAllocateFlagBitsKHX} controlling the allocation.")
    uint32_t.member("deviceMask", "a mask of physical devices in the logical device, indicating that memory <b>must</b> be allocated on each device in the mask, if #MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX is set in {@code flags}.")
}

val VkBindBufferMemoryInfoKHX = struct(VULKAN_PACKAGE, "VkBindBufferMemoryInfoKHX") {
    documentation =
        """
        Structure specifying how to bind a buffer to memory.

        <h5>Description</h5>
        If {@code deviceIndexCount} is greater than zero, then on device index <code>i</code> the buffer is attached to the instance of memory on the physical device with device index <code>pDeviceIndices[i]</code>.

        If {@code deviceIndexCount} is zero and the memory comes from a memory heap with the #MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX bit set, then it is as if {@code pDeviceIndices} contains consecutive indices from zero to the number of physical devices in the logical device, minus one. In other words, by default each physical device attaches to its own instance of the memory.

        If {@code deviceIndexCount} is zero and the memory comes from a memory heap without the #MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX bit set, then it is as if {@code pDeviceIndices} contains an array of zeros. In other words, by default each physical device attaches to instance zero.

        <h5>Valid Usage</h5>
        <ul>
            <li>All valid usage rules from #BindBufferMemory() apply to the identically named members of ##VkBindBufferMemoryInfoKHX</li>
            <li>{@code deviceIndexCount} <b>must</b> either be zero or equal to the number of physical devices in the logical device</li>
            <li>All elements of {@code pDeviceIndices} <b>must</b> be valid device indices</li>
            <li>All instances of memory that are bound to <b>must</b> have been allocated</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>If {@code deviceIndexCount} is not 0, {@code pDeviceIndices} <b>must</b> be a pointer to an array of {@code deviceIndexCount} {@code uint32_t} values</li>
            <li>Both of {@code buffer}, and {@code memory} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        #BindBufferMemory2KHX()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBuffer.member("buffer", "the buffer to be attached to memory.")
    VkDeviceMemory.member("memory", "a {@code VkDeviceMemory} object describing the device memory to attach.")
    VkDeviceSize.member("memoryOffset", "the start offset of the region of {@code memory} which is to be bound to the buffer. The number of bytes returned in the ##VkMemoryRequirements{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified buffer.")
    AutoSize("pDeviceIndices", optional = true)..uint32_t.member("deviceIndexCount", "the number of elements in {@code pDeviceIndices}.")
    const..uint32_t_p.member("pDeviceIndices", "a pointer to an array of device indices.")
}

val VkBindImageMemoryInfoKHX = struct(VULKAN_PACKAGE, "VkBindImageMemoryInfoKHX") {
    documentation =
        """
        Structure specifying how to bind an image to memory.

        <h5>Description</h5>
        If {@code deviceIndexCount} is greater than zero, then on device index <code>i</code> the image is attached to the instance of memory on the physical device with device index <code>pDeviceIndices[i]</code>.

        Let <code>N</code> be the number of physical devices in the logical device. If {@code SFRRectCount} is greater than zero, then {@code pSFRRects} is an array of <code>N<sup>2</sup></code> rectangles, where the image region specified by the rectangle at element <code>i*N+j</code> in resource instance <code>i</code> is bound to memory instance <code>j</code>. The blocks of memory that are bound to each sparse image block region use an offset in memory, relative to {@code memoryOffset}, computed as if the whole image were being bound to a contiguous range of memory. In other words, horizontally adjacent image blocks use consecutive blocks of memory, vertically adjacent image blocks are separated by the number of bytes per block multiplied by the width in blocks of the image, and the block at <code>(0,0)</code> corresponds to memory starting at {@code memoryOffset}.

        If {@code SFRRectCount} and {@code deviceIndexCount} are zero and the memory comes from a memory heap with the #MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX bit set, then it is as if {@code pDeviceIndices} contains consecutive indices from zero to the number of physical devices in the logical device, minus one. In other words, by default each physical device attaches to its own instance of the memory.

        If {@code SFRRectCount} and {@code deviceIndexCount} are zero and the memory comes from a memory heap without the #MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX bit set, then it is as if {@code pDeviceIndices} contains an array of zeros. In other words, by default each physical device attaches to instance zero.

        <h5>Valid Usage</h5>
        <ul>
            <li>All valid usage rules from #BindImageMemory() apply to the identically named members of ##VkBindImageMemoryInfoKHX</li>
            <li>At least one of {@code deviceIndexCount} and {@code SFRRectCount} <b>must</b> be zero.</li>
            <li>{@code deviceIndexCount} <b>must</b> either be zero or equal to the number of physical devices in the logical device</li>
            <li>All elements of {@code pDeviceIndices} <b>must</b> be valid device indices.</li>
            <li>{@code SFRRectCount} <b>must</b> either be zero or equal to the number of physical devices in the logical device squared</li>
            <li>If {@code SFRRectCount} is not zero, then {@code image} <b>must</b> have been created with the #IMAGE_CREATE_BIND_SFR_BIT_KHX bit set.</li>
            <li>All elements of {@code pSFRRects} <b>must</b> be valid rectangles contained within the dimensions of the image</li>
            <li>Elements of {@code pSFRRects} that correspond to the same instance of the image <b>must</b> not overlap and their union <b>must</b> cover the entire image.</li>
            <li>For each element of {@code pSFRRects}, {@code offset.x} <b>must</b> be a multiple of the sparse image block width (##VkSparseImageFormatProperties{@code ::imageGranularity}.width) of all non-metadata aspects of the image</li>
            <li>For each element of {@code pSFRRects}, {@code extent.width} <b>must</b> either be a multiple of the sparse image block width of all non-metadata aspects of the image, or else <code>(extent.width + offset.x)</code> <b>must</b> equal the width of the image subresource</li>
            <li>For each element of {@code pSFRRects}, {@code offset.y} <b>must</b> be a multiple of the sparse image block height (##VkSparseImageFormatProperties{@code ::imageGranularity}.height) of all non-metadata aspects of the image</li>
            <li>For each element of {@code pSFRRects}, {@code extent.height} <b>must</b> either be a multiple of the sparse image block height of all non-metadata aspects of the image, or else <code>(extent.height + offset.y)</code> <b>must</b> equal the height of the image subresource</li>
            <li>All instances of memory that are bound <b>must</b> have been allocated</li>
            <li>If {@code image} was created with a valid swapchain handle in ##VkImageSwapchainCreateInfoKHX{@code ::swapchain}, then the image <b>must</b> be bound to memory from that swapchain (using ##VkBindImageMemorySwapchainInfoKHX).</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkBindImageMemorySwapchainInfoKHX</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>If {@code deviceIndexCount} is not 0, {@code pDeviceIndices} <b>must</b> be a pointer to an array of {@code deviceIndexCount} {@code uint32_t} values</li>
            <li>If {@code SFRRectCount} is not 0, {@code pSFRRects} <b>must</b> be a pointer to an array of {@code SFRRectCount} ##VkRect2D structures</li>
            <li>Both of {@code image}, and {@code memory} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkRect2D, #BindImageMemory2KHX()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkImage.member("image", "the image to be attached to memory.")
    VkDeviceMemory.member("memory", "a {@code VkDeviceMemory} object describing the device memory to attach.")
    VkDeviceSize.member("memoryOffset", "the start offset of the region of {@code memory} which is to be bound to the image. If {@code SFRRectCount} is zero, the number of bytes returned in the ##VkMemoryRequirements{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified image.")
    AutoSize("pDeviceIndices", optional = true)..uint32_t.member("deviceIndexCount", "the number of elements in {@code pDeviceIndices}.")
    const..uint32_t_p.member("pDeviceIndices", "a pointer to an array of device indices.")
    AutoSize("pSFRRects", optional = true)..uint32_t.member("SFRRectCount", "the number of elements in {@code pSFRRects}.")
    const..VkRect2D.p.buffer("pSFRRects", "a pointer to an array of rectangles describing which regions of the image are attached to each instance of memory.")
}

val VkDeviceGroupRenderPassBeginInfoKHX = struct(VULKAN_PACKAGE, "VkDeviceGroupRenderPassBeginInfoKHX") {
    documentation =
        """
        Set the initial device mask and render areas for a render pass instance.

        <h5>Description</h5>
        The {@code deviceMask} serves several purposes. It is an upper bound on the set of physical devices that <b>can</b> be used during the render pass instance, and the initial device mask when the render pass instance begins. Render pass attachment load, store, and resolve operations only apply to physical devices included in the device mask. Subpass dependencies only apply to the physical devices in the device mask.

        If {@code deviceRenderAreaCount} is not zero, then the elements of {@code pDeviceRenderAreas} override the value of ##VkRenderPassBeginInfo{@code ::renderArea}, and provide a render area specific to each physical device. These render areas serve the same purpose as ##VkRenderPassBeginInfo{@code ::renderArea}, including controlling the region of attachments that are cleared by #ATTACHMENT_LOAD_OP_CLEAR and that are resolved into resolve attachments.

        If this structure is not present, the render pass instance's device mask is the value of ##VkDeviceGroupCommandBufferBeginInfoKHX{@code ::deviceMask}. If this structure is not present or if {@code deviceRenderAreaCount} is zero, ##VkRenderPassBeginInfo{@code ::renderArea} is used for all physical devices.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code deviceMask} <b>must</b> be a valid device mask value</li>
            <li>{@code deviceMask} <b>must</b> not be zero</li>
            <li>{@code deviceMask} <b>must</b> be a subset of the command buffer&#8217;s initial device mask</li>
            <li>{@code deviceRenderAreaCount} <b>must</b> either be zero or equal to the number of physical devices in the logical device.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHX</li>
            <li>If {@code deviceRenderAreaCount} is not 0, {@code pDeviceRenderAreas} <b>must</b> be a pointer to an array of {@code deviceRenderAreaCount} ##VkRect2D structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkRect2D
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t.member("deviceMask", "the device mask for the render pass instance.")
    AutoSize("pDeviceRenderAreas", optional = true)..uint32_t.member("deviceRenderAreaCount", "the number of elements in the {@code pDeviceRenderAreas} array.")
    const..VkRect2D.p.buffer("pDeviceRenderAreas", "an array of structures of type ##VkRect2D defining the render area for each physical device.")
}

val VkDeviceGroupCommandBufferBeginInfoKHX = struct(VULKAN_PACKAGE, "VkDeviceGroupCommandBufferBeginInfoKHX") {
    documentation =
        """
        Set the initial device mask for a command buffer.

        <h5>Description</h5>
        The initial device mask also acts as an upper bound on the set of devices that <b>can</b> ever be in the device mask in the command buffer.

        If this structure is not present, the initial value of a command buffer's device mask is set to include all physical devices in the logical device when the command buffer begins recording.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code deviceMask} <b>must</b> be a valid device mask value</li>
            <li>{@code deviceMask} <b>must</b> not be zero</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHX</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t.member("deviceMask", "the initial value of the command buffer&#8217;s device mask.")
}

val VkDeviceGroupSubmitInfoKHX = struct(VULKAN_PACKAGE, "VkDeviceGroupSubmitInfoKHX") {
    documentation =
        """
        Structure indicating which physical devices execute semaphore operations and command buffers.

        <h5>Description</h5>
        If this structure is not present, semaphore operations and command buffers execute on device index zero.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code waitSemaphoreCount} <b>must</b> equal ##VkSubmitInfo{@code ::waitSemaphoreCount}</li>
            <li>{@code commandBufferCount} <b>must</b> equal ##VkSubmitInfo{@code ::commandBufferCount}</li>
            <li>{@code signalSemaphoreCount} <b>must</b> equal ##VkSubmitInfo{@code ::signalSemaphoreCount}</li>
            <li>All elements of {@code pWaitSemaphoreDeviceIndices} and {@code pSignalSemaphoreDeviceIndices} <b>must</b> be valid device indices</li>
            <li>All elements of {@code pCommandBufferDeviceMasks} <b>must</b> be valid device masks</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHX</li>
            <li>If {@code waitSemaphoreCount} is not 0, {@code pWaitSemaphoreDeviceIndices} <b>must</b> be a pointer to an array of {@code waitSemaphoreCount} {@code uint32_t} values</li>
            <li>If {@code commandBufferCount} is not 0, {@code pCommandBufferDeviceMasks} <b>must</b> be a pointer to an array of {@code commandBufferCount} {@code uint32_t} values</li>
            <li>If {@code signalSemaphoreCount} is not 0, {@code pSignalSemaphoreDeviceIndices} <b>must</b> be a pointer to an array of {@code signalSemaphoreCount} {@code uint32_t} values</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pWaitSemaphoreDeviceIndices", optional = true)..uint32_t.member("waitSemaphoreCount", "the number of elements in the {@code pWaitSemaphoreDeviceIndices} array.")
    const..uint32_t_p.member("pWaitSemaphoreDeviceIndices", "an array of device indices indicating which physical device executes the semaphore wait operation in the corresponding element of ##VkSubmitInfo{@code ::pWaitSemaphores}.")
    AutoSize("pCommandBufferDeviceMasks", optional = true)..uint32_t.member("commandBufferCount", "the number of elements in the {@code pCommandBufferDeviceMasks} array.")
    const..uint32_t_p.member("pCommandBufferDeviceMasks", "an array of device masks indicating which physical devices execute the command buffer in the corresponding element of ##VkSubmitInfo{@code ::pCommandBuffers}. A physical device executes the command buffer if the corresponding bit is set in the mask.")
    AutoSize("pSignalSemaphoreDeviceIndices", optional = true)..uint32_t.member("signalSemaphoreCount", "the number of elements in the {@code pSignalSemaphoreDeviceIndices} array.")
    const..uint32_t_p.member("pSignalSemaphoreDeviceIndices", "an array of device indices indicating which physical device executes the semaphore signal operation in the corresponding element of ##VkSubmitInfo{@code ::pSignalSemaphores}.")
}

val VkDeviceGroupBindSparseInfoKHX = struct(VULKAN_PACKAGE, "VkDeviceGroupBindSparseInfoKHX") {
    documentation =
        """
        Structure indicating which instances are bound.

        <h5>Description</h5>
        These device indices apply to all buffer and image memory binds included in the batch that points to this structure. The semaphore waits and signals for the batch are executed only by the physical device specified by the {@code resourceDeviceIndex}.

        If this structure is not present, {@code resourceDeviceIndex} and {@code memoryDeviceIndex} are assumed to be zero.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code resourceDeviceIndex} and {@code memoryDeviceIndex} <b>must</b> both be valid device indices.</li>
            <li>Each memory allocation bound in this batch <b>must</b> have allocated an instance for {@code memoryDeviceIndex}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHX</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t.member("resourceDeviceIndex", "a device index indicating which instance of the resource is bound.")
    uint32_t.member("memoryDeviceIndex", "a device index indicating which instance of the memory the resource instance is bound to.")
}

val VkDeviceGroupPresentCapabilitiesKHX = struct(VULKAN_PACKAGE, "VkDeviceGroupPresentCapabilitiesKHX", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation =
        """
        Present capabilities from other physical devices.

        <h5>Description</h5>
        {@code modes} always has #DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX set.

        The present mode flags are also used when presenting an image, in ##VkDeviceGroupPresentInfoKHX{@code ::mode}.

        If a device group only includes a single physical device, then {@code modes} <b>must</b> equal #DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX.

        <h5>See Also</h5>
        #GetDeviceGroupPresentCapabilitiesKHX()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t.array("presentMask", "an array of masks, where the mask at element <code>i</code> is non-zero if physical device <code>i</code> has a presentation engine, and where bit <code>j</code> is set in element <code>i</code> if physical device <code>i</code> <b>can</b> present swapchain images from physical device <code>j</code>. If element <code>i</code> is non-zero, then bit <code>i</code> <b>must</b> be set.", size = "VK_MAX_DEVICE_GROUP_SIZE_KHX")
    VkDeviceGroupPresentModeFlagsKHX.member("modes", "a bitmask of {@code VkDeviceGroupPresentModeFlagBitsKHX} indicating which device group presentation modes are supported.")
}

val VkImageSwapchainCreateInfoKHX = struct(VULKAN_PACKAGE, "VkImageSwapchainCreateInfoKHX") {
    documentation =
        """
        Specify that an image will be bound to swapchain memory.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code swapchain} is not #NULL_HANDLE, the fields of ##VkImageCreateInfo <b>must</b> match the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#swapchain-wsi-image-create-info">implied image creation parameters</a> of the swapchain</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHX</li>
            <li>If {@code swapchain} is not #NULL_HANDLE, {@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSwapchainKHR.member("swapchain", "#NULL_HANDLE or a handle of a swapchain that the image will be bound to.")
}

val VkBindImageMemorySwapchainInfoKHX = struct(VULKAN_PACKAGE, "VkBindImageMemorySwapchainInfoKHX") {
    documentation =
        """
        Structure specifying swapchain image memory to bind to.

        <h5>Description</h5>
        If {@code swapchain} is not {@code NULL}, the {@code swapchain} and {@code imageIndex} are used to determine the memory that the image is bound to, instead of {@code memory} and {@code memoryOffset}.

        Memory <b>can</b> be bound to a swapchain and use the {@code pDeviceIndices} or {@code pSFRRects} members of ##VkBindImageMemoryInfoKHX.

        <h5>Valid Usage</h5>
        <ul>
            <li>At least one of {@code swapchain} and ##VkBindImageMemoryInfoKHX{@code ::memory} <b>must</b> be #NULL_HANDLE</li>
            <li>{@code imageIndex} <b>must</b> be less than the number of images in {@code swapchain}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHX</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSwapchainKHR.member("swapchain", "#NULL_HANDLE or a swapchain handle.")
    uint32_t.member("imageIndex", "an image index within {@code swapchain}.")
}

val VkAcquireNextImageInfoKHX = struct(VULKAN_PACKAGE, "VkAcquireNextImageInfoKHX") {
    documentation =
        """
        Structure specifying parameters of the acquire.

        <h5>Description</h5>
        If #AcquireNextImageKHR() is used, the device mask is considered to include all physical devices in the logical device.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        #AcquireNextImage2KHX() signals at most one semaphore, even if the application requests waiting for multiple physical devices to be ready via the {@code deviceMask}. However, only a single physical device <b>can</b> wait on that semaphore, since the semaphore becomes unsignaled when the wait succeeds. For other physical devices to wait for the image to be ready, it is necessary for the application to submit semaphore signal operation(s) to that first physical device to signal additional semaphore(s) after the wait succeeds, which the other physical device(s) <b>can</b> wait upon.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code semaphore} is not #NULL_HANDLE it <b>must</b> be unsignaled</li>
            <li>If {@code fence} is not #NULL_HANDLE it <b>must</b> be unsignaled and <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
            <li>{@code deviceMask} <b>must</b> be a valid device mask</li>
            <li>{@code deviceMask} <b>must</b> not be zero</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>If {@code semaphore} is not #NULL_HANDLE, {@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        #AcquireNextImage2KHX()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSwapchainKHR.member("swapchain", "the swapchain from which an image is being acquired.")
    uint64_t.member("timeout", "indicates how long the function waits, in nanoseconds, if no image is available.")
    VkSemaphore.member("semaphore", "#NULL_HANDLE or a semaphore to signal.")
    VkFence.member("fence", "#NULL_HANDLE or a fence to signal.")
    uint32_t.member("deviceMask", "a mask of physical devices for which the swapchain image will be ready to use when the semaphore or fence is signaled.")
}

val VkDeviceGroupPresentInfoKHX = struct(VULKAN_PACKAGE, "VkDeviceGroupPresentInfoKHX") {
    documentation =
        """
        Mode and mask controlling which physical devices' images are presented.

        <h5>Description</h5>
        If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX, then each element of {@code pDeviceMasks} selects which instance of the swapchain image is presented. Each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and the corresponding physical device <b>must</b> have a presentation engine as reported by ##VkDeviceGroupPresentCapabilitiesKHX.

        If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHX, then each element of {@code pDeviceMasks} selects which instance of the swapchain image is presented. Each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and some physical device in the logical device <b>must</b> include that bit in its ##VkDeviceGroupPresentCapabilitiesKHX{@code ::presentMask}.

        If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHX, then each element of {@code pDeviceMasks} selects which instances of the swapchain image are component-wise summed and the sum of those images is presented. If the sum in any component is outside the representable range, the value of that component is undefined. Each element of {@code pDeviceMasks} <b>must</b> have a value for which all set bits are set in one of the elements of ##VkDeviceGroupPresentCapabilitiesKHX{@code ::presentMask}.

        If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX, then each element of {@code pDeviceMasks} selects which instance(s) of the swapchain images are presented. For each bit set in each element of {@code pDeviceMasks}, the corresponding physical device <b>must</b> have a presentation engine as reported by ##VkDeviceGroupPresentCapabilitiesKHX.

        If ##VkDeviceGroupPresentInfoKHX is not provided or {@code swapchainCount} is zero then the masks are considered to be 1. If ##VkDeviceGroupPresentInfoKHX is not provided, {@code mode} is considered to be #DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code swapchainCount} <b>must</b> equal 0 or ##VkPresentInfoKHR{@code ::swapchainCount}</li>
            <li>If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX, then each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and the corresponding element of ##VkDeviceGroupPresentCapabilitiesKHX{@code ::presentMask} <b>must</b> be non-zero</li>
            <li>If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHX, then each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and some physical device in the logical device <b>must</b> include that bit in its ##VkDeviceGroupPresentCapabilitiesKHX{@code ::presentMask}.</li>
            <li>If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHX, then each element of {@code pDeviceMasks} <b>must</b> have a value for which all set bits are set in one of the elements of ##VkDeviceGroupPresentCapabilitiesKHX{@code ::presentMask}</li>
            <li>If {@code mode} is #DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX, then for each bit set in each element of {@code pDeviceMasks}, the corresponding element of ##VkDeviceGroupPresentCapabilitiesKHX{@code ::presentMask} <b>must</b> be non-zero</li>
            <li>The value of each element of {@code pDeviceMasks} <b>must</b> be equal to the device mask passed in ##VkAcquireNextImageInfoKHX{@code ::deviceMask} when the image index was last acquired</li>
            <li>{@code mode} <b>must</b> have exactly one bit set, and that bit <b>must</b> have been included in ##VkDeviceGroupSwapchainCreateInfoKHX{@code ::modes}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHX</li>
            <li>If {@code swapchainCount} is not 0, {@code pDeviceMasks} <b>must</b> be a pointer to an array of {@code swapchainCount} {@code uint32_t} values</li>
            <li>{@code mode} <b>must</b> be a valid {@code VkDeviceGroupPresentModeFlagBitsKHX} value</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pDeviceMasks", optional = true)..uint32_t.member("swapchainCount", "zero or the number of elements in {@code pDeviceMasks}.")
    const..uint32_t_p.member("pDeviceMasks", "an array of device masks, one for each element of ##VkPresentInfoKHR::pSwapchains.")
    VkDeviceGroupPresentModeFlagBitsKHX.member("mode", "the device group present mode that will be used for this present.")
}

val VkDeviceGroupSwapchainCreateInfoKHX = struct(VULKAN_PACKAGE, "VkDeviceGroupSwapchainCreateInfoKHX") {
    documentation =
        """
        Structure specifying parameters of a newly created swapchain object.

        <h5>Description</h5>
        If this structure is not present, {@code modes} is considered to be #DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHX</li>
            <li>{@code modes} <b>must</b> be a valid combination of {@code VkDeviceGroupPresentModeFlagBitsKHX} values</li>
            <li>{@code modes} <b>must</b> not be 0</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDeviceGroupPresentModeFlagsKHX.member("modes", "a bitfield of modes that the swapchain <b>can</b> be used with.")
}

val VkValidationFlagsEXT = struct(VULKAN_PACKAGE, "VkValidationFlagsEXT") {
    documentation =
        """
        Specify validation checks to disable for a Vulkan instance.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_VALIDATION_FLAGS_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code pDisabledValidationChecks} <b>must</b> be a pointer to an array of {@code disabledValidationCheckCount} {@code VkValidationCheckEXT} values</li>
            <li>{@code disabledValidationCheckCount} <b>must</b> be greater than 0</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pDisabledValidationChecks")..uint32_t.member("disabledValidationCheckCount", "the number of checks to disable.")
    VkValidationCheckEXT.p.member("pDisabledValidationChecks", "a pointer to an array of {@code VkValidationCheckEXT} values specifying the validation checks to be disabled.")
}

val VkPhysicalDeviceGroupPropertiesKHX = struct(VULKAN_PACKAGE, "VkPhysicalDeviceGroupPropertiesKHX", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation =
        """
        Structure specifying physical device group properties.
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t.member("physicalDeviceCount", "the number of physical devices in the group.")
    VkPhysicalDevice.array("physicalDevices", "an array of physical device handles representing all physical devices in the group. The first {@code physicalDeviceCount} elements of the array will be valid.", size = "VK_MAX_DEVICE_GROUP_SIZE_KHX")
    VkBool32.member("subsetAllocation", "indicates whether logical devices created from the group support allocating device memory on a subset of devices, via the {@code deviceMask} member of the ##VkMemoryAllocateFlagsInfoKHX. If this is #FALSE, then all device memory allocations are made across all physical devices in the group. If {@code physicalDeviceCount} is 1, then {@code subsetAllocation} <b>must</b> be #FALSE.")
}

val VkDeviceGroupDeviceCreateInfoKHX = struct(VULKAN_PACKAGE, "VkDeviceGroupDeviceCreateInfoKHX") {
    documentation =
        """
        Create a logical device from multiple physical devices.

        <h5>Description</h5>
        The elements of the {@code pPhysicalDevices} array are an ordered list of the physical devices that the logical device represents. These <b>must</b> be a subset of a single device group, and need not be in the same order as they were enumerated. The order of the physical devices in the {@code pPhysicalDevices} array determines the <em>device index</em> of each physical device, with element <code>i</code> being assigned a device index of <code>i</code>. Certain commands and structures refer to one or more physical devices by using device indices or <em>device masks</em> formed using device indices.

        A logical device created without using ##VkDeviceGroupDeviceCreateInfoKHX, or with {@code physicalDeviceCount} equal to zero, is equivalent to a {@code physicalDeviceCount} of one and {@code pPhysicalDevices} pointing to the {@code physicalDevice} parameter to #CreateDevice(). In particular, the device index of that physical device is zero.

        <h5>Valid Usage</h5>
        <ul>
            <li>Each element of {@code pPhysicalDevices} <b>must</b> be unique</li>
            <li>All elements of {@code pPhysicalDevices} <b>must</b> be in the same device group as enumerated by #EnumeratePhysicalDeviceGroupsKHX()</li>
            <li>If {@code physicalDeviceCount} is not 0, the {@code physicalDevice} parameter of #CreateDevice() <b>must</b> be an element of {@code pPhysicalDevices}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHX</li>
            <li>If {@code physicalDeviceCount} is not 0, {@code pPhysicalDevices} <b>must</b> be a pointer to an array of {@code physicalDeviceCount} valid {@code VkPhysicalDevice} handles</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pPhysicalDevices", optional = true)..uint32_t.member("physicalDeviceCount", "the number of elements in the {@code pPhysicalDevices} array.")
    const..VkPhysicalDevice.p.member("pPhysicalDevices", "an array of physical device handles belonging to the same device group.")
}

val VkExternalMemoryPropertiesKHX = struct(VULKAN_PACKAGE, "VkExternalMemoryPropertiesKHX", mutable = false) {
    documentation =
        """
        Structure specifying external memory handle type capabilities.

        <h5>Description</h5>
        {@code compatibleHandleTypes} <b>must</b> include at least {@code handleType}. Inclusion of a handle type in {@code compatibleHandleTypes} does not imply the values returned in ##VkImageFormatProperties2KHR will be the same when ##VkPhysicalDeviceExternalImageFormatInfoKHX{@code ::handleType} is set to that type. The application is responsible for querying the capabilities of all handle types intended for concurrent use in a single image and intersecting them to obtain the compatible set of capabilities.

        <h5>See Also</h5>
        ##VkExternalBufferPropertiesKHX, ##VkExternalImageFormatPropertiesKHX
        """

    VkExternalMemoryFeatureFlagsKHX.member("externalMemoryFeatures", "a bitmask of {@code VkExternalMemoryFeatureFlagBitsKHX} specifying the features of {@code handleType}.")
    VkExternalMemoryHandleTypeFlagsKHX.member("exportFromImportedHandleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsKHX} specifying which types of imported handle {@code handleType} <b>can</b> be exported from.")
    VkExternalMemoryHandleTypeFlagsKHX.member("compatibleHandleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsKHX} specifying handle types which <b>can</b> be specified at the same time as {@code handleType} when creating an image compatible with external memory.")
}

val VkPhysicalDeviceExternalImageFormatInfoKHX = struct(VULKAN_PACKAGE, "VkPhysicalDeviceExternalImageFormatInfoKHX") {
    documentation =
        """
        Structure specifying external image creation parameters.

        <h5>Description</h5>
        If {@code handleType} is 0, #GetPhysicalDeviceImageFormatProperties2KHR() will behave as if ##VkPhysicalDeviceExternalImageFormatInfoKHX was not present, and ##VkExternalImageFormatPropertiesKHX will be ignored.

        If {@code handleType} is not compatible with the {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} specified in ##VkPhysicalDeviceImageFormatInfo2KHR, then #GetPhysicalDeviceImageFormatProperties2KHR() returns #ERROR_FORMAT_NOT_SUPPORTED.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHX</li>
            <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHX} value</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagBitsKHX.member("handleType", "a {@code VkExternalMemoryHandleTypeFlagBitsKHX} value specifying the memory handle type that will be used with the memory associated with the image.")
}

val VkExternalImageFormatPropertiesKHX = struct(VULKAN_PACKAGE, "VkExternalImageFormatPropertiesKHX", mutable = false) {
    documentation =
        """
        Structure specifying supported external handle properties.
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryPropertiesKHX.member("externalMemoryProperties", "an instance of the ##VkExternalMemoryPropertiesKHX structure specifying various capabilities of the external handle type when used with the specified image creation parameters.")
}

val VkPhysicalDeviceExternalBufferInfoKHX = struct(VULKAN_PACKAGE, "VkPhysicalDeviceExternalBufferInfoKHX") {
    documentation =
        """
        Structure specifying buffer creation parameters.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkBufferCreateFlagBits} values</li>
            <li>{@code usage} <b>must</b> be a valid combination of {@code VkBufferUsageFlagBits} values</li>
            <li>{@code usage} <b>must</b> not be 0</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHX} value</li>
        </ul>

        <h5>See Also</h5>
        #GetPhysicalDeviceExternalBufferPropertiesKHX()
        """

    VkStructureType.member("sType", "the type of this structure")
    nullable..const..opaque_p.member("pNext", "NULL or a pointer to an extension-specific structure.")
    VkBufferCreateFlags.member("flags", "a bitmask of {@code VkBufferCreateFlagBits} describing additional parameters of the buffer, corresponding to ##VkBufferCreateInfo{@code ::flags}.")
    VkBufferUsageFlags.member("usage", "a bitmask of {@code VkBufferUsageFlagBits} describing the intended usage of the buffer, corresponding to ##VkBufferCreateInfo{@code ::usage}.")
    VkExternalMemoryHandleTypeFlagBitsKHX.member("handleType", "a {@code VkExternalMemoryHandleTypeFlagBitsKHX} value specifying the memory handle type that will be used with the memory associated with the buffer.")
}

val VkExternalBufferPropertiesKHX = struct(VULKAN_PACKAGE, "VkExternalBufferPropertiesKHX", mutable = false) {
    documentation =
        """
        Structure specifying supported external handle capabilities.
        """

    VkStructureType.member("sType", "the type of this structure")
    nullable..opaque_p.member("pNext", "NULL or a pointer to an extension-specific structure.")
    VkExternalMemoryPropertiesKHX.member("externalMemoryProperties", "an instance of the ##VkExternalMemoryPropertiesKHX structure specifying various capabilities of the external handle type when used with the specified buffer creation parameters.")
}

val VkPhysicalDeviceIDPropertiesKHX = struct(VULKAN_PACKAGE, "VkPhysicalDeviceIDPropertiesKHX", mutable = false) {
    documentation =
        """
        Structure specifying IDs related to the physical device.

        <h5>Description</h5>
        {@code deviceUUID} <b>must</b> be immutable for a given device across instances, processes, driver APIs, and system reboots.

        {@code driverUUID} <b>must</b> be identical in all driver components that support sharing external objects between eachother. Applications <b>can</b> compare this value across instance and process boundaries, and <b>can</b> make similar queries in external APIs to determine whether they are capable of sharing memory objects and resources using them with the device.

        If {@code deviceLUIDValid} is #FALSE, the contents of {@code deviceLUID} are undefined. If {@code deviceLUIDValid} is #TRUE and Vulkan is running on the Windows operating system, the contents of {@code deviceLUID} <b>can</b> be cast to an {@code LUID} object and <b>must</b> be equal to the locally unique identifier of a {@code IDXGIAdapter1} object that corresponds to {@code physicalDevice}.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Although they have identical descriptions, ##VkPhysicalDeviceIDPropertiesKHX{@code ::deviceUUID} may differ from ##VkPhysicalDeviceProperties2KHR{@code ::pipelineCacheUUID}. The former is intended to identify and correlate devices across API and driver boundaries, while the latter is used to identify a compatible device and driver combination to use when serializing and de-serializing pipeline state.
        </div>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint8_t.array("deviceUUID", "an array of size #UUID_SIZE, containing 8-bit values that represent a universally unique identifier for the device.", size = "VK_UUID_SIZE")
    uint8_t.array("driverUUID", "an array of size #UUID_SIZE, containing 8-bit values that represent a universally unique identifier for the driver build in use by the device.", size = "VK_UUID_SIZE")
    uint8_t.array("deviceLUID", "an array of size #LUID_SIZE_KHX, containing 8-bit values that represent a locally unique identifier for the device.", size = "VK_LUID_SIZE_KHX")
    VkBool32.member("deviceLUIDValid", "a boolean value that will be #TRUE if {@code deviceLUID} contains a valid LUID, and #FALSE if it does not.")
}

val VkExternalMemoryImageCreateInfoKHX = struct(VULKAN_PACKAGE, "VkExternalMemoryImageCreateInfoKHX") {
    documentation =
        """
        Specify that an image may be backed by external memory.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsKHX} values</li>
            <li>{@code handleTypes} <b>must</b> not be 0</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagsKHX.member("handleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsKHX} specifying one or more external memory handle types.")
}

val VkExternalMemoryBufferCreateInfoKHX = struct(VULKAN_PACKAGE, "VkExternalMemoryBufferCreateInfoKHX") {
    documentation =
        """
        Specify that a buffer may be backed by external memory.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsKHX} values</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagsKHX.member("handleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsKHX} specifying one or more external memory handle types.")
}

val VkExportMemoryAllocateInfoKHX = struct(VULKAN_PACKAGE, "VkExportMemoryAllocateInfoKHX") {
    documentation =
        """
        Specify exportable handle types for a device memory object.

        <h5>Valid Usage</h5>
        <ul>
            <li>The bits in {@code handleTypes} <b>must</b> be supported and compatible, as reported by ##VkExternalImageFormatPropertiesKHX or ##VkExternalBufferPropertiesKHX.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsKHX} values</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagsKHX.member("handleTypes", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsKHX} specifying one or more memory handle types the application <b>can</b> export from the resulting allocation. The application <b>can</b> request multiple handle types for the same allocation.")
}

val VkImportMemoryWin32HandleInfoKHX = struct(VULKAN_PACKAGE, "VkImportMemoryWin32HandleInfoKHX") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        import Win32 memory created on the same physical device.

        <h5>Description</h5>
        Importing memory objects from Windows handles does not transfer ownership of the handle to the Vulkan implementation. For handle types defined as NT handles, the application <b>must</b> release ownership using the fname:CloseHandle system call when the handle is no longer needed.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code handleType} is not 0, it <b>must</b> be supported for import, as reported by ##VkExternalImageFormatPropertiesKHX or ##VkExternalBufferPropertiesKHX.</li>
            <li>The memory from which {@code handle} was exported <b>must</b> have been created on the same underlying physical device as {@code device}.</li>
            <li>If {@code handleType} is not 0, it <b>must</b> be defined as an NT handle or a global share handle.</li>
            <li>If {@code handleType} is not 0, {@code handle} <b>must</b> be a valid handle of the type specified by {@code handleType}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHX} value</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagBitsKHX.member("handleType", "specifies the type of {@code handle}.")
    HANDLE.member("handle", "the external handle to import.")
}

val VkExportMemoryWin32HandleInfoKHX = struct(VULKAN_PACKAGE, "VkExportMemoryWin32HandleInfoKHX") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        Structure specifying additional attributes of Windows handles exported from a memory.

        <h5>Description</h5>
        If this structure is not present, or if {@code pAttributes} is set to {@code NULL}, default security descriptor values will be used, and child processes created by the application will not inherit the handle, as described in the MSDN documentation for "{@code Synchronization Object Security and Access Rights}"<sup>1</sup>. Further, if the structure is not present, the access rights will be

        {@code DXGI_SHARED_RESOURCE_READ} | {@code DXGI_SHARED_RESOURCE_WRITE}

        for handles of the following types:

        #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX

        And

        {@code GENERIC_ALL}

        for handles of the following types:

        #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHX #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHX

        <dl>
            <dt>1</dt>
            <dd><a target="_blank" href="https://msdn.microsoft.com/en-us/library/windows/desktop/ms686670.aspx">https://msdn.microsoft.com/en-us/library/windows/desktop/ms686670.aspx</a></dd>
        </dl>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkExportMemoryAllocateInfoKHX{@code ::handleTypes} does not include #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX, #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX, #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHX, or #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHX, VkExportMemoryWin32HandleInfoKHX <b>must</b> not be in the {@code pNext} chain of ##VkMemoryAllocateInfo.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>If {@code pAttributes} is not {@code NULL}, {@code pAttributes} <b>must</b> be a pointer to a valid {@code SECURITY_ATTRIBUTES} value</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    nullable..const..SECURITY_ATTRIBUTES.p.member("pAttributes", "a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.")
    DWORD.member("dwAccess", "a {@code DWORD} specifying access rights of the handle.")
    LPCWSTR.member("name", "a NULL-terminated UTF-16 string to associate with the underlying resource referenced by NT handles exported from the created memory.")
}

val VkMemoryWin32HandlePropertiesKHX = struct(VULKAN_PACKAGE, "VkMemoryWin32HandlePropertiesKHX", mutable = false) {
    documentation =
        """
        Properties of External Memory Windows Handles.
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t.member("memoryTypeBits", "a bitmask containing one bit set for every memory type which the specified windows handle <b>can</b> be imported as.")
}

val VkImportMemoryFdInfoKHX = struct(VULKAN_PACKAGE, "VkImportMemoryFdInfoKHX") {
    documentation =
        """
        import memory created on the same physical device from a file descriptor.

        <h5>Description</h5>
        Importing memory from a file descriptor transfers ownership of the file descriptor from the application to the Vulkan implementation. The application <b>must</b> not perform any operations on the file descriptor after a successful import.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code handleType} is not 0, it <b>must</b> be supported for import, as reported by ##VkExternalImageFormatPropertiesKHX or ##VkExternalBufferPropertiesKHX.</li>
            <li>The memory from which {@code fd} was exported <b>must</b> have been created on the same underlying physical device as {@code device}.</li>
            <li>If {@code handleType} is not 0, it <b>must</b> be defined as a POSIX file descriptor handle.</li>
            <li>If {@code handleType} is not 0, {@code fd} <b>must</b> be a valid handle of the type specified by {@code handleType}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHX} value</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalMemoryHandleTypeFlagBitsKHX.member("handleType", "specifies the handle type of {@code fd}.")
    int.member("fd", "the external handle to import.")
}

val VkMemoryFdPropertiesKHX = struct(VULKAN_PACKAGE, "VkMemoryFdPropertiesKHX", mutable = false) {
    documentation =
        """
        Properties of External Memory File Descriptors.
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t.member("memoryTypeBits", "a bitmask containing one bit set for every memory type which the specified file descriptor <b>can</b> be imported as.")
}

val VkWin32KeyedMutexAcquireReleaseInfoKHX = struct(VULKAN_PACKAGE, "VkWin32KeyedMutexAcquireReleaseInfoKHX") {
    documentation =
        """
        Use the Windows keyed mutex mechanism to synchronize work.

        <h5>Valid Usage</h5>
        <ul>
            <li>Each member of {@code pAcquireSyncs} and {@code pReleaseSyncs} <b>must</b> be a device memory object imported by setting ##VkImportMemoryWin32HandleInfoKHX{@code ::handleType} to #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX or #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHX.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHX</li>
            <li>If {@code acquireCount} is not 0, {@code pAcquireSyncs} <b>must</b> be a pointer to an array of {@code acquireCount} valid {@code VkDeviceMemory} handles</li>
            <li>If {@code acquireCount} is not 0, {@code pAcquireKeys} <b>must</b> be a pointer to an array of {@code acquireCount} {@code uint64_t} values</li>
            <li>If {@code acquireCount} is not 0, {@code pAcquireTimeouts} <b>must</b> be a pointer to an array of {@code acquireCount} {@code uint32_t} values</li>
            <li>If {@code releaseCount} is not 0, {@code pReleaseSyncs} <b>must</b> be a pointer to an array of {@code releaseCount} valid {@code VkDeviceMemory} handles</li>
            <li>If {@code releaseCount} is not 0, {@code pReleaseKeys} <b>must</b> be a pointer to an array of {@code releaseCount} {@code uint64_t} values</li>
            <li>Both of the elements of {@code pAcquireSyncs}, and the elements of {@code pReleaseSyncs} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>
        """

    VkStructureType.member("sType", "")
    nullable..const..opaque_p.member("pNext", "")
    AutoSize("pAcquireSyncs", "pAcquireKeys", "pAcquireTimeouts", optional = true)..uint32_t.member("acquireCount", "the number of entries in the {@code pAcquireSyncs}, {@code pAcquireKeys}, and {@code pAcquireTimeoutMilliseconds} arrays.")
    const..VkDeviceMemory.p.member("pAcquireSyncs", "a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources.")
    const..uint64_t_p.member("pAcquireKeys", "a pointer to an array of mutex key values to wait for prior to beginning the submitted work. Entries refer to the keyed mutex associated with the corresponding entries in {@code pAcquireSyncs}.")
    const..uint32_t_p.member("pAcquireTimeouts", "")
    AutoSize("pReleaseSyncs", "pReleaseKeys", optional = true)..uint32_t.member("releaseCount", "the number of entries in the {@code pReleaseSyncs} and {@code pReleaseKeys} arrays.")
    const..VkDeviceMemory.p.member("pReleaseSyncs", "a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources.")
    const..uint64_t_p.member("pReleaseKeys", "a pointer to an array of mutex key values to set when the submitted work has completed. Entries refer to the keyed mutex associated with the corresponding entries in {@code pReleaseSyncs}.")
}

val VkPhysicalDeviceExternalSemaphoreInfoKHX = struct(VULKAN_PACKAGE, "VkPhysicalDeviceExternalSemaphoreInfoKHX") {
    documentation =
        """
        Structure specifying semaphore creation parameters.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} value</li>
        </ul>

        <h5>See Also</h5>
        #GetPhysicalDeviceExternalSemaphorePropertiesKHX()
        """

    VkStructureType.member("sType", "the type of this structure")
    nullable..const..opaque_p.member("pNext", "NULL or a pointer to an extension-specific structure.")
    VkExternalSemaphoreHandleTypeFlagBitsKHX.member("handleType", "a {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} value specifying the external semaphore handle type for which capabilities will be returned.")
}

val VkExternalSemaphorePropertiesKHX = struct(VULKAN_PACKAGE, "VkExternalSemaphorePropertiesKHX", mutable = false) {
    documentation =
        """
        Structure describing supported external semaphore handle features.

        <h5>Description</h5>
        If {@code handleType} is not supported by the implementation, then ##VkExternalSemaphorePropertiesKHX{@code ::externalSemaphoreFeatures} will be set to zero.

        <h5>See Also</h5>
        #GetPhysicalDeviceExternalSemaphorePropertiesKHX()
        """

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    VkExternalSemaphoreHandleTypeFlagsKHX.member("exportFromImportedHandleTypes", "a bitmask of {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} specifying which types of imported handle {@code handleType} <b>can</b> be exported from.")
    VkExternalSemaphoreHandleTypeFlagsKHX.member("compatibleHandleTypes", "a bitmask of {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} specifying handle types which <b>can</b> be specified at the same time as {@code handleType} when creating a semaphore.")
    VkExternalSemaphoreFeatureFlagsKHX.member("externalSemaphoreFeatures", "a bitmask of {@code VkExternalSemaphoreFeatureFlagBitsKHX} describing the features of {@code handleType}.")
}

val VkExportSemaphoreCreateInfoKHX = struct(VULKAN_PACKAGE, "VkExportSemaphoreCreateInfoKHX") {
    documentation =
        """
        Structure specifying handle types that can be exported from a semaphore.

        <h5>Valid Usage</h5>
        <ul>
            <li>The bits in {@code handleTypes} <b>must</b> be supported and compatible, as reported by ##VkExternalSemaphorePropertiesKHX.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} values</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkExternalSemaphoreHandleTypeFlagsKHX.member("handleTypes", "a bitmask of {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} specifying one or more semaphore handle types the application <b>can</b> export from the resulting allocation. The application <b>can</b> request multiple handle types for the same semaphore.")
}

val VkImportSemaphoreWin32HandleInfoKHX = struct(VULKAN_PACKAGE, "VkImportSemaphoreWin32HandleInfoKHX") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        Structure specifying Windows handle to import to a semaphore.

        <h5>Description</h5>
        The handle types supported by {@code handleType} are:

        <h6>Handle Type Permanence for VkImportSemaphoreWin32HandleInfoKHX</h6>
        <table class="lwjgl">
            <thead><tr><th>Handle Type</th><th>Permanence</th></tr></thead>
            <tbody>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX</td><td>Permanent</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX</td><td>Permanent</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHX</td><td>Permanent</td></tr>
            </tbody>
        </table>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-handletypes-win32">Handle Type Permanence for VkImportSemaphoreWin32HandleInfoKHX</a> table.</li>
            <li>The semaphore from which {@code handleType} was exported <b>must</b> have been created on the same underlying physical device as {@code semaphore}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>{@code handleType} <b>must</b> be a valid combination of {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} values</li>
            <li>{@code handleType} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        #ImportSemaphoreWin32HandleKHX()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSemaphore.member("semaphore", "the semaphore into which the state will be imported.")
    VkExternalSemaphoreHandleTypeFlagsKHX.member("handleType", "specifies the type of {@code handle}.")
    HANDLE.member("handle", "the external handle to import.")
}

val VkExportSemaphoreWin32HandleInfoKHX = struct(VULKAN_PACKAGE, "VkExportSemaphoreWin32HandleInfoKHX") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        Structure specifying additional attributes of Windows handles exported from a semaphore.

        <h5>Description</h5>
        If this structure is not present, or if {@code pAttributes} is set to {@code NULL}, default security descriptor values will be used, and child processes created by the application will not inherit the handle, as described in the MSDN documentation for "{@code Synchronization Object Security and Access Rights}"<sup>1</sup>. Further, if the structure is not present, the access rights will be

        {@code DXGI_SHARED_RESOURCE_READ} | {@code DXGI_SHARED_RESOURCE_WRITE}

        for handles of the following types:

        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX

        And

        {@code GENERIC_ALL}

        for handles of the following types:

        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHX

        <dl>
            <dt>1</dt>
            <dd><a target="_blank" href="https://msdn.microsoft.com/en-us/library/windows/desktop/ms686670.aspx">https://msdn.microsoft.com/en-us/library/windows/desktop/ms686670.aspx</a></dd>
        </dl>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkExportSemaphoreCreateInfoKHX{@code ::handleTypes} does not include #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX or #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHX, VkExportSemaphoreWin32HandleInfoKHX <b>must</b> not be in the {@code pNext} chain of ##VkSemaphoreCreateInfo.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>If {@code pAttributes} is not {@code NULL}, {@code pAttributes} <b>must</b> be a pointer to a valid {@code SECURITY_ATTRIBUTES} value</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    nullable..const..SECURITY_ATTRIBUTES.p.member("pAttributes", "a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.")
    DWORD.member("dwAccess", "a {@code DWORD} specifying access rights of the handle.")
    LPCWSTR.member("name", "a NULL-terminated UTF-16 string to associate with the underlying synchronization primitive referenced by NT handles exported from the created semaphore.")
}

val VkD3D12FenceSubmitInfoKHX = struct(VULKAN_PACKAGE, "VkD3D12FenceSubmitInfoKHX") {
    documentation =
        """
        Structure specifying values for Direct3D 12 fence-backed semaphores.

        <h5>Description</h5>
        If the semaphore in ##VkSubmitInfo{@code ::pWaitSemaphores} or ##VkSubmitInfo{@code ::pSignalSemaphore} corresponding to an entry in {@code pWaitSemaphoreValues} or {@code pSignalSemaphoreValues} respectively does not currently have state imported from a Direct3D 12 fence, the value in the {@code pWaitSemaphoreValues} or {@code pSignalSemaphoreValues} entry is ignored.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code waitSemaphoreValuesCount} <b>must</b> be the same value as ##VkSubmitInfo{@code ::waitSemaphoreCount}, where {@code SubmitInfo} is in the {@code pNext} chain of this ##VkD3D12FenceSubmitInfoKHX structure.</li>
            <li>{@code signalSemaphoreValuesCount} <b>must</b> be the same value as ##VkSubmitInfo{@code ::signalSemaphoreCount}, where {@code SubmitInfo} is in the {@code pNext} chain of this ##VkD3D12FenceSubmitInfoKHX structure.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHX</li>
            <li>If {@code waitSemaphoreValuesCount} is not 0, and {@code pWaitSemaphoreValues} is not {@code NULL}, {@code pWaitSemaphoreValues} <b>must</b> be a pointer to an array of {@code waitSemaphoreValuesCount} {@code uint64_t} values</li>
            <li>If {@code signalSemaphoreValuesCount} is not 0, and {@code pSignalSemaphoreValues} is not {@code NULL}, {@code pSignalSemaphoreValues} <b>must</b> be a pointer to an array of {@code signalSemaphoreValuesCount} {@code uint64_t} values</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pWaitSemaphoreValues", optional = true)..uint32_t.member("waitSemaphoreValuesCount", "the number of semaphore wait values specified in {@code pWaitSemaphoreValues}.")
    nullable..const..uint64_t_p.member("pWaitSemaphoreValues", "an array of length {@code waitSemaphoreValuesCount} containing values for the corresponding semaphores in ##VkSubmitInfo{@code ::pWaitSemaphores} to wait for.")
    AutoSize("pSignalSemaphoreValues", optional = true)..uint32_t.member("signalSemaphoreValuesCount", "the number of semaphore signal values specified in {@code pSignalSemaphoreValues}.")
    nullable..const..uint64_t_p.member("pSignalSemaphoreValues", "an array of length {@code signalSemaphoreValuesCount} containing values for the corresponding semaphores in ##VkSubmitInfo{@code ::pSignalSemaphores} to set when signaled.")
}

val VkImportSemaphoreFdInfoKHX = struct(VULKAN_PACKAGE, "VkImportSemaphoreFdInfoKHX") {
    documentation =
        """
        Structure specifying POSIX file descriptor to import to a semaphore.

        <h5>Description</h5>
        The handle types supported by {@code handleType} are:

        <h6>Handle Type Permanence for VkImportSemaphoreFdInfoKHX</h6>
        <table class="lwjgl">
            <thead><tr><th>Handle Type</th><th>Permanence</th></tr></thead>
            <tbody>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHX</td><td>Permanent</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_FENCE_FD_BIT_KHX</td><td>Temporary</td></tr>
            </tbody>
        </table>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-handletypes-fd">Handle Type Permanence for VkImportSemaphoreFdInfoKHX</a> table.</li>
            <li>The semaphore from which {@code handleType} was exported <b>must</b> have been created on the same underlying physical device as {@code semaphore}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} value</li>
        </ul>

        <h5>See Also</h5>
        #ImportSemaphoreFdKHX()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSemaphore.member("semaphore", "the semaphore into which the state will be imported.")
    VkExternalSemaphoreHandleTypeFlagBitsKHX.member("handleType", "specifies the type of {@code fd}.")
    int.member("fd", "the external handle to import.")
}

val VkPhysicalDevicePushDescriptorPropertiesKHR = struct(VULKAN_PACKAGE, "VkPhysicalDevicePushDescriptorPropertiesKHR") {
    documentation =
        """
        Structure describing push descriptor limits that can be supported by an implementation.

        <h5>Description</h5>
        <ul>
            <li>{@code maxPushDescriptors} is the maximum number of descriptors that <b>can</b> be used in a descriptor set created with #DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR set.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>
        """

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    uint32_t.member("maxPushDescriptors", "")
}

val VkRectLayerKHR = struct(VULKAN_PACKAGE, "VkRectLayerKHR") {
    documentation =
        """
        Structure containing a rectangle, including layer, changed by vkQueuePresentKHR for a given VkImage.

        <h5>Valid Usage</h5>
        <ul>
            <li>The sum of {@code offset} and {@code extent} <b>must</b> be no greater than the {@code imageExtent} member of the ##VkSwapchainCreateInfoKHR structure given to #CreateSwapchainKHR().</li>
            <li>{@code layer} <b>must</b> be less than {@code imageArrayLayers} member of the ##VkSwapchainCreateInfoKHR structure given to #CreateSwapchainKHR().</li>
        </ul>

        Some platforms allow the size of a surface to change, and then scale the pixels of the image to fit the surface. VkRectLayerKHR specifies pixels of the swapchain's image(s), which will be constant for the life of the swapchain.

        <h5>See Also</h5>
        ##VkExtent2D, ##VkOffset2D, ##VkPresentRegionKHR
        """

    VkOffset2D.member("offset", "the origin of the rectangle, in pixels.")
    VkExtent2D.member("extent", "the size of the rectangle, in pixels.")
    uint32_t.member("layer", "the layer of the image. For images with only one layer, the value of {@code layer} <b>must</b> be 0.")
}

val VkPresentRegionKHR = struct(VULKAN_PACKAGE, "VkPresentRegionKHR") {
    documentation =
        """
        Structure containing rectangular region changed by vkQueuePresentKHR for a given VkImage.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>If {@code rectangleCount} is not 0, and {@code pRectangles} is not {@code NULL}, {@code pRectangles} <b>must</b> be a pointer to an array of {@code rectangleCount} ##VkRectLayerKHR structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkPresentRegionsKHR, ##VkRectLayerKHR
        """

    AutoSize("pRectangles", optional = true)..uint32_t.member("rectangleCount", "the number of rectangles in {@code pRectangles}, or zero if the entire image has changed and should be presented.")
    nullable..const..VkRectLayerKHR.p.buffer("pRectangles", "either {@code NULL} or a pointer to an array of ##VkRectLayerKHR structures. The ##VkRectLayerKHR structure is the framebuffer coordinates, plus layer, of a portion of a presentable image that has changed and <b>must</b> be presented. If non-{@code NULL}, each entry in {@code pRectangles} is a rectangle of the given image that has changed since the last image was presented to the given swapchain.")
}

val VkPresentRegionsKHR = struct(VULKAN_PACKAGE, "VkPresentRegionsKHR") {
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
            <li>If {@code pRegions} is not {@code NULL}, {@code pRegions} <b>must</b> be a pointer to an array of {@code swapchainCount} valid ##VkPresentRegionKHR structures</li>
            <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkPresentRegionKHR
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pRegions", optional = true)..uint32_t.member("swapchainCount", "the number of swapchains being presented to by this command.")
    nullable..const..VkPresentRegionKHR.p.buffer("pRegions", "{@code NULL} or a pointer to an array of ##VkPresentRegionKHR elements with {@code swapchainCount} entries. If not {@code NULL}, each element of {@code pRegions} contains the region that has changed since the last present to the swapchain in the corresponding entry in the ##VkPresentInfoKHR{@code ::pSwapchains} array.")
}

val VkDescriptorUpdateTemplateEntryKHR = struct(VULKAN_PACKAGE, "VkDescriptorUpdateTemplateEntryKHR") {
    documentation =
        """
        Describes a single descriptor update of the descriptor update template.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dstBinding} <b>must</b> be a valid binding in the descriptor set layout implicitly specified when using a descriptor update template to update descriptors.</li>
            <li>{@code dstArrayElement} and {@code descriptorCount} <b>must</b> be less than or equal to the number of array elements in the descriptor set binding implicitly specified when using a descriptor update template to update descriptors, and all applicable consecutive bindings, as described by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-updates-consecutive">the “consecutive binding updates” section</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code descriptorType} <b>must</b> be a valid {@code VkDescriptorType} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkDescriptorUpdateTemplateCreateInfoKHR
        """

    uint32_t.member("dstBinding", "the descriptor binding to update when using this descriptor update template.")
    uint32_t.member("dstArrayElement", "the starting element in the array belonging to {@code dstBinding}.")
    uint32_t.member("descriptorCount", "the number of descriptors to update. If {@code descriptorCount} is greater than the number of remaining array elements in the destination binding, those affect consecutive bindings in a manner similar to ##VkWriteDescriptorSet above.")
    VkDescriptorType.member("descriptorType", "a {@code VkDescriptorType} specifying the type of the descriptor.")
    size_t.member("offset", "the offset in bytes of the first binding in the raw data structure.")
    size_t.member("stride", "the stride in bytes between two consecutive array elements of the descriptor update informations in the raw data structure. The actual pointer ptr for each array element j of update entry i is computed using the following formula:")
}

val VkDescriptorUpdateTemplateCreateInfoKHR = struct(VULKAN_PACKAGE, "VkDescriptorUpdateTemplateCreateInfoKHR") {
    documentation =
        """
        Structure specifying parameters of a newly created descriptor update template.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code templateType} is #DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR, {@code descriptorSetLayout} <b>must</b> be a valid {@code VkDescriptorSetLayout} handle</li>
            <li>If {@code templateType} is #DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR, {@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>If {@code templateType} is #DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR, {@code pipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>If {@code templateType} is #DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR, {@code set} <b>must</b> be the unique set number in the pipeline layout that uses a descriptor set layout that was created with #DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code pDescriptorUpdateEntries} <b>must</b> be a pointer to an array of {@code descriptorUpdateEntryCount} valid ##VkDescriptorUpdateTemplateEntryKHR structures</li>
            <li>{@code templateType} <b>must</b> be a valid {@code VkDescriptorUpdateTemplateTypeKHR} value</li>
            <li>If {@code descriptorSetLayout} is not #NULL_HANDLE, {@code descriptorSetLayout} <b>must</b> be a valid {@code VkDescriptorSetLayout} handle</li>
            <li>If {@code pipelineBindPoint} is not 0, {@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>If {@code pipelineLayout} is not #NULL_HANDLE, {@code pipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code descriptorUpdateEntryCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code descriptorSetLayout}, and {@code pipelineLayout} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkDescriptorUpdateTemplateEntryKHR, #CreateDescriptorUpdateTemplateKHR()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDescriptorUpdateTemplateCreateFlagsKHR.member("flags", "reserved for future use.")
    AutoSize("pDescriptorUpdateEntries")..uint32_t.member("descriptorUpdateEntryCount", "the number of elements in the {@code pDescriptorUpdateEntries} array.")
    const..VkDescriptorUpdateTemplateEntryKHR.p.buffer("pDescriptorUpdateEntries", "a pointer to an array of ##VkDescriptorUpdateTemplateEntryKHR structures describing the descriptors to be updated by the descriptor update template.")
    VkDescriptorUpdateTemplateTypeKHR.member("templateType", "Specifies the type of the descriptor update template. If set to #DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR it <b>can</b> only be used to update descriptor sets with a fixed {@code descriptorSetLayout}. If set to #DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR it <b>can</b> only be used to push descriptor sets using the provided {@code pipelineBindPoint}, {@code pipelineLayout}, and {@code set} number.")
    VkDescriptorSetLayout.member("descriptorSetLayout", "the descriptor set layout the parameter update template will be used with. All descriptor sets which are going to be updated through the newly created descriptor update template <b>must</b> be created with this layout. {@code descriptorSetLayout} is the descriptor set layout used to build the descriptor update template. All descriptor sets which are going to be updated through the newly created descriptor update template <b>must</b> be created with a layout that matches (is the same as, or defined identically to) this layout. This parameter is ignored if {@code templateType} is not #DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR.")
    VkPipelineBindPoint.member("pipelineBindPoint", "a {@code VkPipelineBindPoint} indicating whether the descriptors will be used by graphics pipelines or compute pipelines. This parameter is ignored if {@code templateType} is not #DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR")
    VkPipelineLayout.member("pipelineLayout", "a {@code VkPipelineLayout} object used to program the bindings. This parameter is ignored if {@code templateType} is not #DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR")
    uint32_t.member("set", "the set number of the descriptor set in the pipeline layout that will be updated. This parameter is ignored if {@code templateType} is not #DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR")
}

val VkDeviceGeneratedCommandsFeaturesNVX = struct(VULKAN_PACKAGE, "VkDeviceGeneratedCommandsFeaturesNVX") {
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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBool32.member("computeBindingPointSupport", "indicates whether the {@code VkObjectTableNVX} supports entries with #OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX bit set and {@code VkIndirectCommandsLayoutNVX} supports #PIPELINE_BIND_POINT_COMPUTE.")
}

val VkDeviceGeneratedCommandsLimitsNVX = struct(VULKAN_PACKAGE, "VkDeviceGeneratedCommandsLimitsNVX") {
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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    uint32_t.member("maxIndirectCommandsLayoutTokenCount", "the maximum number of tokens in {@code VkIndirectCommandsLayoutNVX}.")
    uint32_t.member("maxObjectEntryCounts", "the maximum number of entries per resource type in {@code VkObjectTableNVX}.")
    uint32_t.member("minSequenceCountBufferOffsetAlignment", "the minimum alignment for memory addresses optionally used in #CmdProcessCommandsNVX().")
    uint32_t.member("minSequenceIndexBufferOffsetAlignment", "the minimum alignment for memory addresses optionally used in #CmdProcessCommandsNVX().")
    uint32_t.member("minCommandsTokenBufferOffsetAlignment", "the minimum alignment for memory addresses optionally used in #CmdProcessCommandsNVX().")
}

val VkIndirectCommandsTokenNVX = struct(VULKAN_PACKAGE, "VkIndirectCommandsTokenNVX") {
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

val VkIndirectCommandsLayoutTokenNVX = struct(VULKAN_PACKAGE, "VkIndirectCommandsLayoutTokenNVX") {
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

val VkIndirectCommandsLayoutCreateInfoNVX = struct(VULKAN_PACKAGE, "VkIndirectCommandsLayoutCreateInfoNVX") {
    documentation =
        """
        Structure specifying the parameters of a newly created indirect commands layout object.

        <h5>Description</h5>
        The following code illustrates some of the key flags:

        <code><pre>
￿void cmdProcessAllSequences(cmd, objectTable, indirectCommandsLayout, pIndirectCommandsTokens, sequencesCount, indexbuffer, indexbufferoffset)
￿{
￿  for (s = 0; s < sequencesCount; s++)
￿  {
￿    sequence = s;
￿
￿    if (indirectCommandsLayout.flags & VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX) {
￿      sequence = incoherent_implementation_dependent_permutation[ sequence ];
￿    }
￿    if (indirectCommandsLayout.flags & VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX) {
￿      sequence = indexbuffer.load_uint32( sequence * sizeof(uint32_t) + indexbufferoffset);
￿    }
￿
￿    cmdProcessSequence( cmd, objectTable, indirectCommandsLayout, pIndirectCommandsTokens, sequence );
￿  }
￿}</pre></code>

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
            <li>{@code pTokens} <b>must</b> be a pointer to an array of {@code tokenCount} valid ##VkIndirectCommandsLayoutTokenNVX structures</li>
            <li>{@code tokenCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkIndirectCommandsLayoutTokenNVX, #CreateIndirectCommandsLayoutNVX()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineBindPoint.member("pipelineBindPoint", "the {@code VkPipelineBindPoint} that this layout targets.")
    VkIndirectCommandsLayoutUsageFlagsNVX.member("flags", "a bitmask of {@code VkIndirectCommandsLayoutUsageFlagBitsNVX} specifying usage hints of this layout.")
    AutoSize("pTokens")..uint32_t.member("tokenCount", "the length of the individual command sequnce.")
    const..VkIndirectCommandsLayoutTokenNVX.p.buffer("pTokens", "an array describing each command token in detail. See {@code VkIndirectCommandsTokenTypeNVX} and ##VkIndirectCommandsLayoutTokenNVX below for details.")
}

val VkCmdProcessCommandsInfoNVX = struct(VULKAN_PACKAGE, "VkCmdProcessCommandsInfoNVX") {
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
            <li>{@code pIndirectCommandsTokens} <b>must</b> be a pointer to an array of {@code indirectCommandsTokenCount} valid ##VkIndirectCommandsTokenNVX structures</li>
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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkObjectTableNVX.member("objectTable", "the {@code VkObjectTableNVX} to be used for the generation process. Only registered objects at the time #CmdReserveSpaceForCommandsNVX() is called, will be taken into account for the reservation.")
    VkIndirectCommandsLayoutNVX.member("indirectCommandsLayout", "the {@code VkIndirectCommandsLayoutNVX} that provides the command sequence to generate.")
    AutoSize("pIndirectCommandsTokens")..uint32_t.member("indirectCommandsTokenCount", "defines the number of input tokens used.")
    const..VkIndirectCommandsTokenNVX.p.buffer("pIndirectCommandsTokens", "provides an array of ##VkIndirectCommandsTokenNVX that reference the input data for each token command.")
    uint32_t.member("maxSequencesCount", "the maximum number of sequences for which command buffer space will be reserved. If {@code sequencesCountBuffer} is #NULL_HANDLE, this is also the actual number of sequences generated.")
    nullable..VkCommandBuffer.member("targetCommandBuffer", "<b>can</b> be the secondary {@code VkCommandBuffer} in which the commands should be recorded. If {@code targetCommandBuffer} is {@code NULL} an implicit reservation as well as execution takes place on the processing {@code VkCommandBuffer}.")
    VkBuffer.member("sequencesCountBuffer", "<b>can</b> be {@code VkBuffer} from which the actual amount of sequences is sourced from as ftext:uint32_t value.")
    VkDeviceSize.member("sequencesCountOffset", "the byte offset into {@code sequencesCountBuffer} where the count value is stored.")
    VkBuffer.member("sequencesIndexBuffer", "<b>must</b> be set if {@code indirectCommandsLayout}&#8217;s #INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX is set and provides the used sequence indices as ftext:uint32_t array. Otherwise it <b>must</b> be #NULL_HANDLE.")
    VkDeviceSize.member("sequencesIndexOffset", "the byte offset into {@code sequencesIndexBuffer} where the index values start.")
}

val VkCmdReserveSpaceForCommandsInfoNVX = struct(VULKAN_PACKAGE, "VkCmdReserveSpaceForCommandsInfoNVX") {
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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkObjectTableNVX.member("objectTable", "the {@code VkObjectTableNVX} to be used for the generation process. Only registered objects at the time #CmdReserveSpaceForCommandsNVX() is called, will be taken into account for the reservation.")
    VkIndirectCommandsLayoutNVX.member("indirectCommandsLayout", "the {@code VkIndirectCommandsLayoutNVX} that <b>must</b> also be used at generation time.")
    uint32_t.member("maxSequencesCount", "the maximum number of sequences for which command buffer space will be reserved.")
}

val VkObjectTableCreateInfoNVX = struct(VULKAN_PACKAGE, "VkObjectTableCreateInfoNVX") {
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
            <li>{@code pObjectEntryTypes} <b>must</b> be a pointer to an array of {@code objectCount} valid {@code VkObjectEntryTypeNVX} values</li>
            <li>{@code pObjectEntryCounts} <b>must</b> be a pointer to an array of {@code objectCount} {@code uint32_t} values</li>
            <li>{@code pObjectEntryUsageFlags} <b>must</b> be a pointer to an array of {@code objectCount} valid combinations of {@code VkObjectEntryUsageFlagBitsNVX} values</li>
            <li>Each element of {@code pObjectEntryUsageFlags} <b>must</b> not be 0</li>
            <li>{@code objectCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        #CreateObjectTableNVX()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pObjectEntryTypes", "pObjectEntryCounts", "pObjectEntryUsageFlags")..uint32_t.member("objectCount", "the number of entry configurations that the object table supports.")
    const..VkObjectEntryTypeNVX.p.member("pObjectEntryTypes", "an array of {@code VkObjectEntryTypeNVX} values providing the entry type of a given configuration.")
    const..uint32_t_p.member("pObjectEntryCounts", "an array of counts of how many objects can be registered in the table.")
    const..VkObjectEntryUsageFlagsNVX.p.member("pObjectEntryUsageFlags", "an array of bitmasks of {@code VkObjectEntryUsageFlagBitsNVX} specifying the binding usage of the entry.")
    uint32_t.member("maxUniformBuffersPerDescriptor", "the maximum number of #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC used by any single registered {@code VkDescriptorSet} in this table.")
    uint32_t.member("maxStorageBuffersPerDescriptor", "the maximum number of #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC used by any single registered {@code VkDescriptorSet} in this table.")
    uint32_t.member("maxStorageImagesPerDescriptor", "the maximum number of #DESCRIPTOR_TYPE_STORAGE_IMAGE or #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER used by any single registered {@code VkDescriptorSet} in this table.")
    uint32_t.member("maxSampledImagesPerDescriptor", "the maximum number of #DESCRIPTOR_TYPE_SAMPLER, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER or #DESCRIPTOR_TYPE_INPUT_ATTACHMENT used by any single registered {@code VkDescriptorSet} in this table.")
    uint32_t.member("maxPipelineLayouts", "the maximum number of unique {@code VkPipelineLayout} used by any registered {@code VkDescriptorSet} or {@code VkPipeline} in this table.")
}

val VkObjectTableEntryNVX = struct(VULKAN_PACKAGE, "VkObjectTableEntryNVX") {
    documentation =
        """
        (no short description available).

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

val VkObjectTablePipelineEntryNVX = struct(VULKAN_PACKAGE, "VkObjectTablePipelineEntryNVX") {
    documentation =
        """
        (no short description available).

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

val VkObjectTableDescriptorSetEntryNVX = struct(VULKAN_PACKAGE, "VkObjectTableDescriptorSetEntryNVX") {
    documentation =
        """
        (no short description available).

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
    VkPipelineLayout.member("pipelineLayout", "")
    VkDescriptorSet.member("descriptorSet", "specifies the {@code VkDescriptorSet} that can be bound with this entry.")
}

val VkObjectTableVertexBufferEntryNVX = struct(VULKAN_PACKAGE, "VkObjectTableVertexBufferEntryNVX") {
    documentation =
        """
        (no short description available).

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

val VkObjectTableIndexBufferEntryNVX = struct(VULKAN_PACKAGE, "VkObjectTableIndexBufferEntryNVX") {
    documentation =
        """
        (no short description available).

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

val VkObjectTablePushConstantEntryNVX = struct(VULKAN_PACKAGE, "VkObjectTablePushConstantEntryNVX") {
    documentation =
        """
        (no short description available).

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
    VkPipelineLayout.member("pipelineLayout", "")
    VkShaderStageFlags.member("stageFlags", "")
}

val VkViewportWScalingNV = struct(VULKAN_PACKAGE, "VkViewportWScalingNV") {
    documentation =
        """
        Structure specifying a viewport.
        """

    float.member("xcoeff", "{@code xcoeff} and {@code ycoeff} are the viewport&#8217;s W scaling factor for x and y respectively.")
    float.member("ycoeff", "see {@code xcoeff}")
}

val VkPipelineViewportWScalingStateCreateInfoNV = struct(VULKAN_PACKAGE, "VkPipelineViewportWScalingStateCreateInfoNV") {
    documentation =
        """
        Structure specifying parameters of a newly created pipeline viewport W scaling state.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-multiViewport">multiple viewports</a> feature is not enabled and {@code viewportWScalingEnable} is #TRUE, {@code viewportCount} <b>must</b> be 1</li>
            <li>{@code viewportCount} <b>must</b> be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive if {@code viewportWScalingEnable} is #TRUE</li>
            <li>{@code viewportCount} and ##VkPipelineViewportStateCreateInfo{@code ::viewportCount} <b>must</b> be identical if {@code viewportWScalingEnable} is #TRUE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV</li>
            <li>{@code viewportCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkViewportWScalingNV
        """

    VkStructureType.member("sType", "the type of this structure")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure")
    VkBool32.member("viewportWScalingEnable", "the enable for viewport W scaling")
    AutoSize("pViewportWScalings")..uint32_t.member("viewportCount", "the number of viewports used by W scaling and <b>must</b> match the number of viewports in the pipeline if viewport W scaling is enabled.")
    const..VkViewportWScalingNV.p.buffer("pViewportWScalings", "a pointer to an array of ##VkViewportWScalingNV structures which define the W scaling parameters for the corresponding viewport. If the viewport W scaling state is dynamic, this member is ignored. If no element of the {@code pDynamicStates} member of sname::VkPipelineViewportStateCreateInfo{@code ::pDynamicState} is #DYNAMIC_STATE_VIEWPORT_W_SCALING_NV, the {@code pViewportScalings} member of a ##VkPipelineViewportWScalingStateCreateInfoNV extension structure <b>must</b> be a pointer to an array of ##VkPipelineViewportWScalingStateCreateInfoNV{@code ::viewportCount} ##VkViewportWScalingNV structures")
}

val VkSurfaceCapabilities2EXT = struct(VULKAN_PACKAGE, "VkSurfaceCapabilities2EXT", mutable = false) {
    documentation =
        """
        Structure describing capabilities of a surface.

        <h5>Description</h5>
        <ul>
            <li>{@code sType} is the type of this structure.</li>
            <li>{@code pNext} is {@code NULL} or a pointer to an extension-specific structure.</li>
            <li>{@code supportedSurfaceCounters} is a bitmask of {@code VkSurfaceCounterFlagBitsEXT} indicating the supported surface counter types.</li>
        </ul>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code supportedSurfaceCounters} <b>must</b> not include #SURFACE_COUNTER_VBLANK_EXT unless the surface queried is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#wsi-display-surfaces">display surface</a>.</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent2D, #GetPhysicalDeviceSurfaceCapabilities2EXT()
        """

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
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
    VkSurfaceCounterFlagsEXT.member("supportedSurfaceCounters", "")
}

val VkDisplayPowerInfoEXT = struct(VULKAN_PACKAGE, "VkDisplayPowerInfoEXT") {
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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDisplayPowerStateEXT.member("powerState", "a {@code VkDisplayPowerStateEXT} value specifying the new power state of the display.")
}

val VkDeviceEventInfoEXT = struct(VULKAN_PACKAGE, "VkDeviceEventInfoEXT") {
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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDeviceEventTypeEXT.member("deviceEvent", "")
}

val VkDisplayEventInfoEXT = struct(VULKAN_PACKAGE, "VkDisplayEventInfoEXT") {
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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDisplayEventTypeEXT.member("displayEvent", "a {@code VkDisplayEventTypeEXT} specifying when the fence will be signaled.")
}

val VkSwapchainCounterCreateInfoEXT = struct(VULKAN_PACKAGE, "VkSwapchainCounterCreateInfoEXT") {
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
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code surfaceCounters} <b>must</b> be a valid combination of {@code VkSurfaceCounterFlagBitsEXT} values</li>
        </ul>
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSurfaceCounterFlagsEXT.member("surfaceCounters", "a bitmask of {@code VkSurfaceCounterFlagBitsEXT} specifying surface counters to enable for the swapchain.")
}

val VkRefreshCycleDurationGOOGLE = struct(VULKAN_PACKAGE, "VkRefreshCycleDurationGOOGLE") {
    documentation =
        """
        Structure containing the RC duration of a display.
        """

    uint64_t.member("refreshDuration", "the number of nanoseconds from the start of one refresh cycle to the next.")
}

val VkPastPresentationTimingGOOGLE = struct(VULKAN_PACKAGE, "VkPastPresentationTimingGOOGLE") {
    documentation =
        """
        Structure containing timing information about a previously-presented image.

        <h5>Description</h5>
        The results for a given {@code swapchain} and {@code presentID} are only returned once from #GetPastPresentationTimingGOOGLE().

        The application <b>can</b> use the fname:VkPastPresentationTimingGOOGLE values to occasionally adjust its timing. For example, if {@code actualPresentTime} is later than expected (e.g. one {@code refreshDuration} late), the application may increase its target IPD to a higher multiple of {@code refreshDuration} (e.g. decrease its frame rate from 60Hz to 30Hz). If {@code actualPresentTime} and {@code earliestPresentTime} are consistently different, and if {@code presentMargin} is consistently large enough, the application may decrease its target IPD to a smaller multiple of {@code refreshDuration} (e.g. increase its frame rate from 30Hz to 60Hz). If {@code actualPresentTime} and {@code earliestPresentTime} are same, and if {@code presentMargin} is consistently high, the application may delay the start of its input-render-present loop in order to decrease the latency between user input and the corresponding present (always leaving some margin in case a new image takes longer to render than the previous image). An application that desires its target IPD to always be the same as {@code refreshDuration}, can also adjust features until {@code actualPresentTime} is never late and {@code presentMargin} is satisfactory.

        <h5>See Also</h5>
        #GetPastPresentationTimingGOOGLE()
        """

    uint32_t.member("presentID", "an application-provided value that was given to a previous #QueuePresentKHR() command via {@code VkPresentTimeInfoGOOGLE}{@code ::presentID} (see below). It <b>can</b> be used to uniquely identify a previous present with the #QueuePresentKHR() command.")
    uint64_t.member("desiredPresentTime", "an application-provided value that was given to a previous #QueuePresentKHR() command via {@code VkPresentTimeInfoGOOGLE}{@code ::desiredPresentTime}. If non-zero, it was used by the application to indicate that an image not be presented any sooner than {@code desiredPresentTime}.")
    uint64_t.member("actualPresentTime", "the time when the image of the {@code swapchain} was actually displayed.")
    uint64_t.member("earliestPresentTime", "the time when the image of the {@code swapchain} could have been displayed. This <b>may</b> differ from {@code actualPresentTime} if the application requested that the image be presented no sooner than {@code VkPresentTimeInfoGOOGLE}{@code ::desiredPresentTime}.")
    uint64_t.member("presentMargin", "an indication of how early the #QueuePresentKHR() command was processed compared to how soon it needed to be processed, and still be presented at {@code earliestPresentTime}.")
}

val VkPresentTimeGOOGLE = struct(VULKAN_PACKAGE, "VkPresentTimeGOOGLE") {
    documentation =
        """
        The earliest time image should be presented.
        """

    uint32_t.member("presentID", "an application-provided identification value, that <b>can</b> be used with the results of #GetPastPresentationTimingGOOGLE(), in order to uniquely identify this present. In order to be useful to the application, it <b>should</b> be unique within some period of time that is meaningful to the application.")
    uint64_t.member("desiredPresentTime", "indicates that the image given <b>should</b> not be displayed to the user any earlier than this time. {@code desiredPresentTime} is a time in nanoseconds, relative to a monotonically-increasing clock (e.g. {@code CLOCK_MONOTONIC} (see clock_gettime(2)) on Android and Linux). A value of zero indicates that the presentation engine <b>may</b> display the image at any time. This is useful when the application desires to provide {@code presentID}, but doesn&#8217;t need a specific {@code desiredPresentTime}.")
}

val VkPresentTimesInfoGOOGLE = struct(VULKAN_PACKAGE, "VkPresentTimesInfoGOOGLE") {
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
            <li>If {@code pTimes} is not {@code NULL}, {@code pTimes} <b>must</b> be a pointer to an array of {@code swapchainCount} ##VkPresentTimeGOOGLE structures</li>
            <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkPresentTimeGOOGLE
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pTimes", optional = true)..uint32_t.member("swapchainCount", "the number of swapchains being presented to by this command.")
    nullable..const..VkPresentTimeGOOGLE.p.buffer("pTimes", "{@code NULL} or a pointer to an array of ##VkPresentTimeGOOGLE elements with {@code swapchainCount} entries. If not {@code NULL}, each element of {@code pTimes} contains the earliest time to present the image corresponding to the entry in the ##VkPresentInfoKHR{@code ::pImageIndices} array.")
}

val VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX = struct(VULKAN_PACKAGE, "VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX", mutable = false) {
    documentation =
        """
        Structure describing multiview limits that can be supported by an implementation.

        <h5>Description</h5>
        <ul>
            <li>{@code perViewPositionAllComponents} is #TRUE if the implementation supports per-view position values that differ in components other than the X component.</li>
        </ul>

        If the ##VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX structure is included in the {@code pNext} chain of flink:VkPhysicalDeviceProperties2KHR, it is filled with the implementation-dependent limits.
        """

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    VkBool32.member("perViewPositionAllComponents", "")
}

val VkViewportSwizzleNV = struct(VULKAN_PACKAGE, "VkViewportSwizzleNV") {
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

val VkPipelineViewportSwizzleStateCreateInfoNV = struct(VULKAN_PACKAGE, "VkPipelineViewportSwizzleStateCreateInfoNV") {
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
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code viewportCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkViewportSwizzleNV
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineViewportSwizzleStateCreateFlagsNV.member("flags", "reserved for future use.")
    AutoSize("pViewportSwizzles", optional = true)..uint32_t.member("viewportCount", "the number of viewport swizzles used by the pipeline.")
    nullable..const..VkViewportSwizzleNV.p.buffer("pViewportSwizzles", "a pointer to an array of ##VkViewportSwizzleNV structures, defining the viewport swizzles.")
}

val VkPhysicalDeviceDiscardRectanglePropertiesEXT = struct(VULKAN_PACKAGE, "VkPhysicalDeviceDiscardRectanglePropertiesEXT") {
    documentation =
        """
        Structure describing discard rectangle limits that can be supported by an implementation.

        <h5>Description</h5>
        <ul>
            <li>{@code maxDiscardRectangles} is the maximum number of discard rectangles that <b>can</b> be specified.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        If the ##VkPhysicalDeviceDiscardRectanglePropertiesEXT structure is included in the {@code pNext} chain of flink:VkPhysicalDeviceProperties2KHR, it is filled with the implementation-dependent limits.
        """

    VkStructureType.member("sType", "")
    nullable..opaque_p.member("pNext", "")
    uint32_t.member("maxDiscardRectangles", "")
}

val VkPipelineDiscardRectangleStateCreateInfoEXT = struct(VULKAN_PACKAGE, "VkPipelineDiscardRectangleStateCreateInfoEXT") {
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
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code discardRectangleMode} <b>must</b> be a valid {@code VkDiscardRectangleModeEXT} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkRect2D
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineDiscardRectangleStateCreateFlagsEXT.member("flags", "reserved for future use.")
    VkDiscardRectangleModeEXT.member("discardRectangleMode", "the mode used to determine whether fragments that lie within the discard rectangle are discarded or not.")
    AutoSize("pDiscardRectangles", optional = true)..uint32_t.member("discardRectangleCount", "the number of discard rectangles used by the pipeline.")
    nullable..const..VkRect2D.p.buffer("pDiscardRectangles", "a pointer to an array of ##VkRect2D structures, defining the discard rectangles. If the discard rectangle state is dynamic, this member is ignored.")
}

val VkXYColorEXT = struct(VULKAN_PACKAGE, "VkXYColorEXT") {
    documentation =
        """
        structure to specify X,Y chromaticity coordinates.
        """

    float.member("x", "")
    float.member("y", "")
}

val VkHdrMetadataEXT = struct(VULKAN_PACKAGE, "VkHdrMetadataEXT") {
    documentation =
        """
        structure to specify Hdr metadata.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>note</h5>
        The validity and use of this data is outside the scope of Vulkan and thus no +Valid Usage+ is given.
        </div>

        <h5>See Also</h5>
        ##VkXYColorEXT, #SetHdrMetadataEXT()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkXYColorEXT.member("displayPrimaryRed", "the mastering display&#8217;s red primary in chromaticity coordinates")
    VkXYColorEXT.member("displayPrimaryGreen", "the mastering display&#8217;s green primary in chromaticity coordinates")
    VkXYColorEXT.member("displayPrimaryBlue", "the mastering display&#8217;s blue primary in chromaticity coordinates")
    VkXYColorEXT.member("whitePoint", "the mastering display&#8217;s white-point in chromaticity coordinates")
    float.member("maxLuminance", "the maximum luminance of the mastering display in nits")
    float.member("minLuminance", "the minimum luminance of the mastering display in nits")
    float.member("maxContentLightLevel", "content&#8217;s maximum luminance in nits")
    float.member("maxFrameAverageLightLevel", "the maximum frame average light level in nits")
}

val VkSharedPresentSurfaceCapabilitiesKHR = struct(VULKAN_PACKAGE, "VkSharedPresentSurfaceCapabilitiesKHR", mutable = false) {
    documentation =
        """
        structure describing capabilities of a surface for shared presentation.
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkImageUsageFlags.member("sharedPresentSupportedUsageFlags", "a bitmask of {@code VkImageUsageFlagBits} representing the ways the application <b>can</b> use the shared presentable image from a swapchain created with {@code VkPresentModeKHR} set to #PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR or #PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR for the surface on the specified device. #IMAGE_USAGE_COLOR_ATTACHMENT_BIT <b>must</b> be included in the set but implementations <b>may</b> support additional usages.")
}

val VkPhysicalDeviceSurfaceInfo2KHR = struct(VULKAN_PACKAGE, "VkPhysicalDeviceSurfaceInfo2KHR") {
    documentation =
        """
        Structure specifying a surface and related swapchain creation parameters.

        <h5>Description</h5>
        The members of ##VkPhysicalDeviceSurfaceInfo2KHR correspond to the arguments to #GetPhysicalDeviceSurfaceCapabilities(), with {@code sType} and {@code pNext} added for extensibility.

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
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSurfaceKHR.member("surface", "the surface that will be associated with the swapchain.")
}

val VkSurfaceCapabilities2KHR = struct(VULKAN_PACKAGE, "VkSurfaceCapabilities2KHR", mutable = false) {
    documentation =
        """
        Structure describing capabilities of a surface.
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSurfaceCapabilitiesKHR.member("surfaceCapabilities", "a structure of type ##VkSurfaceCapabilitiesKHR describing the capabilities of the specified surface.")
}

val VkSurfaceFormat2KHR = struct(VULKAN_PACKAGE, "VkSurfaceFormat2KHR", mutable = false) {
    documentation =
        """
        Structure describing a supported swapchain format tuple.
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSurfaceFormatKHR.member("surfaceFormat", "an instance of ##VkSurfaceFormatKHR describing a format-color space pair that is compatible with the specified surface.")
}

val VkIOSSurfaceCreateInfoMVK = struct(VULKAN_PACKAGE, "VkIOSSurfaceCreateInfoMVK") {
    documentation =
        """
        Structure specifying parameters of a newly created iOS surface object.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pView} <b>must</b> be a valid {@code UIView} and <b>must</b> be backed by a {@code CALayer} instance of type {@code CAMetalLayer}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IOS_SURFACE_CREATE_INFO_MVK</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code pView} <b>must</b> be a pointer</li>
        </ul>

        <h5>See Also</h5>
        #CreateIOSSurfaceMVK()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkIOSSurfaceCreateFlagsMVK.member("flags", "reserved for future use.")
    const..opaque_p.member("pView", "a reference to a {@code UIView} object which will display this surface. This {@code UIView} <b>must</b> be backed by a {@code CALayer} instance of type {@code CAMetalLayer}.")
}

val VkMacOSSurfaceCreateInfoMVK = struct(VULKAN_PACKAGE, "VkMacOSSurfaceCreateInfoMVK") {
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
            <li>{@code pView} <b>must</b> be a pointer</li>
        </ul>

        <h5>See Also</h5>
        #CreateMacOSSurfaceMVK()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkMacOSSurfaceCreateFlagsMVK.member("flags", "reserved for future use.")
    const..opaque_p.member("pView", "a reference to a {@code NSView} object which will display this surface. This {@code NSView} <b>must</b> be backed by a {@code CALayer} instance of type {@code CAMetalLayer}.")
}