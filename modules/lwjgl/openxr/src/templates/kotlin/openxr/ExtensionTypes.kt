/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr

import org.lwjgl.generator.*
import core.linux.*
import core.windows.*
import egl.*
import opengl.*
import vulkan.*

// Handle types
val XrDebugUtilsMessengerEXT = XR_DEFINE_HANDLE("XrDebugUtilsMessengerEXT")
val XrSpatialAnchorMSFT = XR_DEFINE_HANDLE("XrSpatialAnchorMSFT")
val XrHandTrackerEXT = XR_DEFINE_HANDLE("XrHandTrackerEXT")
val XrSceneObserverMSFT = XR_DEFINE_HANDLE("XrSceneObserverMSFT")
val XrSceneMSFT = XR_DEFINE_HANDLE("XrSceneMSFT")
val XrFacialTrackerHTC = XR_DEFINE_HANDLE("XrFacialTrackerHTC")
val XrFoveationProfileFB = XR_DEFINE_HANDLE("XrFoveationProfileFB")
val XrTriangleMeshFB = XR_DEFINE_HANDLE("XrTriangleMeshFB")
val XrPassthroughFB = XR_DEFINE_HANDLE("XrPassthroughFB")
val XrPassthroughLayerFB = XR_DEFINE_HANDLE("XrPassthroughLayerFB")
val XrGeometryInstanceFB = XR_DEFINE_HANDLE("XrGeometryInstanceFB")
val XrSpatialAnchorStoreConnectionMSFT = XR_DEFINE_HANDLE("XrSpatialAnchorStoreConnectionMSFT")

// Enum types
val XrPerfSettingsDomainEXT = "XrPerfSettingsDomainEXT".enumType
val XrPerfSettingsSubDomainEXT = "XrPerfSettingsSubDomainEXT".enumType
val XrPerfSettingsLevelEXT = "XrPerfSettingsLevelEXT".enumType
val XrPerfSettingsNotificationLevelEXT = "XrPerfSettingsNotificationLevelEXT".enumType
val XrVisibilityMaskTypeKHR = "XrVisibilityMaskTypeKHR".enumType
val XrBlendFactorFB = "XrBlendFactorFB".enumType
val XrSpatialGraphNodeTypeMSFT = "XrSpatialGraphNodeTypeMSFT".enumType
val XrHandEXT = "XrHandEXT".enumType
val XrHandJointEXT = "XrHandJointEXT".enumType
val XrHandJointSetEXT = "XrHandJointSetEXT".enumType
val XrHandPoseTypeMSFT = "XrHandPoseTypeMSFT".enumType
val XrReprojectionModeMSFT = "XrReprojectionModeMSFT".enumType
val XrCompositionLayerSecureContentFlagBitsFB = "XrCompositionLayerSecureContentFlagBitsFB".enumType
val XrHandJointsMotionRangeEXT = "XrHandJointsMotionRangeEXT".enumType
val XrSceneComputeFeatureMSFT = "XrSceneComputeFeatureMSFT".enumType
val XrSceneComputeConsistencyMSFT = "XrSceneComputeConsistencyMSFT".enumType
val XrMeshComputeLodMSFT = "XrMeshComputeLodMSFT".enumType
val XrSceneComponentTypeMSFT = "XrSceneComponentTypeMSFT".enumType
val XrSceneObjectTypeMSFT = "XrSceneObjectTypeMSFT".enumType
val XrScenePlaneAlignmentTypeMSFT = "XrScenePlaneAlignmentTypeMSFT".enumType
val XrSceneComputeStateMSFT = "XrSceneComputeStateMSFT".enumType
val XrEyeExpressionHTC = "XrEyeExpressionHTC".enumType
val XrLipExpressionHTC = "XrLipExpressionHTC".enumType
val XrFacialTrackingTypeHTC = "XrFacialTrackingTypeHTC".enumType
val XrColorSpaceFB = "XrColorSpaceFB".enumType
val XrFoveationLevelFB = "XrFoveationLevelFB".enumType
val XrFoveationDynamicFB = "XrFoveationDynamicFB".enumType
val XrWindingOrderFB = "XrWindingOrderFB".enumType
val XrPassthroughLayerPurposeFB = "XrPassthroughLayerPurposeFB".enumType

// Bitmask types
val XrDebugUtilsMessageSeverityFlagsEXT = typedef(XrFlags64, "XrDebugUtilsMessageSeverityFlagsEXT")
val XrDebugUtilsMessageTypeFlagsEXT = typedef(XrFlags64, "XrDebugUtilsMessageTypeFlagsEXT")
val XrOverlaySessionCreateFlagsEXTX = typedef(XrFlags64, "XrOverlaySessionCreateFlagsEXTX")
val XrOverlayMainSessionFlagsEXTX = typedef(XrFlags64, "XrOverlayMainSessionFlagsEXTX")
val XrCompositionLayerImageLayoutFlagsFB = typedef(XrFlags64, "XrCompositionLayerImageLayoutFlagsFB")
val XrCompositionLayerSecureContentFlagsFB = typedef(XrFlags64, "XrCompositionLayerSecureContentFlagsFB")
val XrVulkanInstanceCreateFlagsKHR = typedef(XrFlags64, "XrVulkanInstanceCreateFlagsKHR")
val XrVulkanDeviceCreateFlagsKHR = typedef(XrFlags64, "XrVulkanDeviceCreateFlagsKHR")
val XrHandTrackingAimFlagsFB = typedef(XrFlags64, "XrHandTrackingAimFlagsFB")
val XrSwapchainCreateFoveationFlagsFB = typedef(XrFlags64, "XrSwapchainCreateFoveationFlagsFB")
val XrSwapchainStateFoveationFlagsFB = typedef(XrFlags64, "XrSwapchainStateFoveationFlagsFB")
val XrKeyboardTrackingFlagsFB = typedef(XrFlags64, "XrKeyboardTrackingFlagsFB")
val XrKeyboardTrackingQueryFlagsFB = typedef(XrFlags64, "XrKeyboardTrackingQueryFlagsFB")
val XrTriangleMeshFlagsFB = typedef(XrFlags64, "XrTriangleMeshFlagsFB")
val XrPassthroughFlagsFB = typedef(XrFlags64, "XrPassthroughFlagsFB")
val XrPassthroughStateChangedFlagsFB = typedef(XrFlags64, "XrPassthroughStateChangedFlagsFB")
val XrRenderModelFlagsFB = typedef(XrFlags64, "XrRenderModelFlagsFB")
val XrCompositionLayerSpaceWarpInfoFlagsFB = typedef(XrFlags64, "XrCompositionLayerSpaceWarpInfoFlagsFB")
val XrDigitalLensControlFlagsALMALENCE = typedef(XrFlags64, "XrDigitalLensControlFlagsALMALENCE")

// Function pointer types
val _XrDebugUtilsMessengerCallbackDataEXT = struct(Module.OPENXR, "XrDebugUtilsMessengerCallbackDataEXT")
val PFN_xrDebugUtilsMessengerCallbackEXT = Module.OPENXR.callback {
    XrBool32(
        "XrDebugUtilsMessengerCallbackEXT",
        "Type of callback function invoked by the debug utils.",

        XrDebugUtilsMessageSeverityFlagsEXT("messageSeverity", "indicates the single bit value of {@code XrDebugUtilsMessageSeverityFlagsEXT} that triggered this callback."),
        XrDebugUtilsMessageTypeFlagsEXT("messageTypes", "indicates the {@code XrDebugUtilsMessageTypeFlagsEXT} specifying which types of event triggered this callback."),
        _XrDebugUtilsMessengerCallbackDataEXT.const.p("callbackData", "contains all the callback related data in the ##XrDebugUtilsMessengerCallbackDataEXT structure."),
        opaque_p("userData", "the user data provided when the {@code XrDebugUtilsMessengerEXT} was created."),

        nativeType = "PFN_xrDebugUtilsMessengerCallbackEXT"
    ) {
        documentation =
        """
        Type of callback function invoked by the debug utils.

        <h5>C Specification</h5>
        <pre><code>
￿typedef XrBool32 (XRAPI_PTR *PFN_xrDebugUtilsMessengerCallbackEXT)(
￿            XrDebugUtilsMessageSeverityFlagsEXT              messageSeverity,
￿            XrDebugUtilsMessageTypeFlagsEXT                  messageTypes,
￿            const XrDebugUtilsMessengerCallbackDataEXT*      callbackData,
￿            void*                                            userData);</code></pre>

        <h5>Description</h5>
        The callback <b>must</b> not call #DestroyDebugUtilsMessengerEXT().

        The callback returns an {@code XrBool32} that indicates to the calling layer the application’s desire to abort the call. A value of #TRUE indicates that the application wants to abort this call. If the application returns #FALSE, the function <b>must</b> not be aborted. Applications <b>should</b> always return #FALSE so that they see the same behavior with and without validation layers enabled.

        If the application returns #TRUE from its callback and the OpenXR call being aborted returns an {@code XrResult}, the layer will return #ERROR_VALIDATION_FAILURE.

        The object pointed to by {@code callbackData} (and any pointers in it recursively) <b>must</b> be valid during the lifetime of the triggered callback. It <b>may</b> become invalid afterwards.

        <h5>See Also</h5>
        ##XrDebugUtilsMessengerCreateInfoEXT, #CreateDebugUtilsMessengerEXT()
        """
    }
}

// Struct types
val XrCompositionLayerCubeKHR = struct(Module.OPENXR, "XrCompositionLayerCubeKHR", parentStruct = XrCompositionLayerBaseHeader) {
    documentation =
        """
        Cube map layer composition info.

        <h5>Description</h5>
        ##XrCompositionLayerCubeKHR contains the information needed to render a cube map when calling #EndFrame(). ##XrCompositionLayerCubeKHR is an alias type for the base struct ##XrCompositionLayerBaseHeader used in ##XrFrameEndInfo.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRCompositionLayerCube XR_KHR_composition_layer_cube} extension <b>must</b> be enabled prior to using ##XrCompositionLayerCubeKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_CUBE_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code layerFlags} <b>must</b> be 0 or a valid combination of {@code XrCompositionLayerFlagBits} values</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code eyeVisibility} <b>must</b> be a valid {@code XrEyeVisibility} value</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
            <li>Both of {@code space} and {@code swapchain} <b>must</b> have been created, allocated, or retrieved from the same {@code XrSession}</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader, ##XrFrameEndInfo, ##XrQuaternionf, #EndFrame()
        """

    Expression("#TYPE_COMPOSITION_LAYER_CUBE_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrCompositionLayerFlags("layerFlags", "any flags to apply to this layer.")
    XrSpace("space", "the {@code XrSpace} in which the {@code orientation} of the cube layer is evaluated over time.")
    XrEyeVisibility("eyeVisibility", "")
    XrSwapchain("swapchain", "the swapchain.")
    uint32_t("imageArrayIndex", "the image array index, with 0 meaning the first or only array element.")
    XrQuaternionf("orientation", "the orientation of the environment map in the {@code space}.")
}

val XrCompositionLayerDepthInfoKHR = struct(Module.OPENXR, "XrCompositionLayerDepthInfoKHR") {
    documentation =
        """
        Depth map layer info.

        <h5>Description</h5>
        ##XrCompositionLayerDepthInfoKHR contains the information needed to specify an extra layer with depth information. When submitting depth buffers along with projection layers, add the ##XrCompositionLayerDepthInfoKHR to the {@code next} chain for all ##XrCompositionLayerProjectionView structures in the given layer.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRCompositionLayerDepth XR_KHR_composition_layer_depth} extension <b>must</b> be enabled prior to using ##XrCompositionLayerDepthInfoKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code subImage} <b>must</b> be a valid ##XrSwapchainSubImage structure</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader, ##XrCompositionLayerProjection, ##XrCompositionLayerProjectionView, ##XrFrameEndInfo, ##XrSwapchainSubImage, #EndFrame()
        """

    Expression("#TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSwapchainSubImage("subImage", "identifies the depth image ##XrSwapchainSubImage to be associated with the color swapchain. The contained {@code imageRect} specifies the valid portion of the depth image to use, in pixels. It also implicitly defines the transform from normalized image coordinates into pixel coordinates. The contained {@code imageArrayIndex} is the depth image array index, with 0 meaning the first or only array element.")
    float("minDepth", "{@code minDepth} and {@code maxDepth} are the range of depth values the {@code depthSwapchain} could have, in the range of <code>[0.0,1.0]</code>. This is akin to min and max values of OpenGL’s {@code glDepthRange}, but with the requirement here that <code>maxDepth ≥ minDepth</code>.")
    float("maxDepth", "see {@code minDepth}")
    float("nearZ", "the positive distance in meters of the {@code minDepth} value in the depth swapchain. Applications <b>may</b> use a {@code nearZ} that is greater than {@code farZ} to indicate depth values are reversed. {@code nearZ} can be infinite.")
    float("farZ", "the positive distance in meters of the {@code maxDepth} value in the depth swapchain. {@code farZ} can be infinite. Applications <b>must</b> not use the same value as {@code nearZ}.")
}

val XrVulkanSwapchainFormatListCreateInfoKHR = struct(Module.OPENXR, "XrVulkanSwapchainFormatListCreateInfoKHR") {
    javaImport("org.lwjgl.vulkan.*")
    documentation =
        """
        A list of Vulkan view formats.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVulkanSwapchainFormatList XR_KHR_vulkan_swapchain_format_list} extension <b>must</b> be enabled prior to using ##XrVulkanSwapchainFormatListCreateInfoKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code viewFormatCount} is not 0, {@code viewFormats} <b>must</b> be a pointer to an array of {@code viewFormatCount} valid {@code VkFormat} values</li>
        </ul>

        <h5>See Also</h5>
        #CreateSwapchain()
        """

    Expression("#TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("viewFormats", optional = true)..uint32_t("viewFormatCount", "the number of view formats passed in {@code viewFormats}.")
    VkFormat.const.p("viewFormats", "an array of {@code VkFormat}.")
}

val XrEventDataPerfSettingsEXT = struct(Module.OPENXR, "XrEventDataPerfSettingsEXT", parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        XrEventDataPerfSettingsEXT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPerformanceSettings XR_EXT_performance_settings} extension <b>must</b> be enabled prior to using ##XrEventDataPerfSettingsEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_PERF_SETTINGS_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code domain} <b>must</b> be a valid {@code XrPerfSettingsDomainEXT} value</li>
            <li>{@code subDomain} <b>must</b> be a valid {@code XrPerfSettingsSubDomainEXT} value</li>
            <li>{@code fromLevel} <b>must</b> be a valid {@code XrPerfSettingsNotificationLevelEXT} value</li>
            <li>{@code toLevel} <b>must</b> be a valid {@code XrPerfSettingsNotificationLevelEXT} value</li>
        </ul>
        """

    Expression("#TYPE_EVENT_DATA_PERF_SETTINGS_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrPerfSettingsDomainEXT("domain", ": processing domain in which a threshold has been crossed")
    XrPerfSettingsSubDomainEXT("subDomain", ": system area in which a threshold has been crossed")
    XrPerfSettingsNotificationLevelEXT("fromLevel", ": enumerated notification level which has been exited")
    XrPerfSettingsNotificationLevelEXT("toLevel", ": enumerated notification level which has been entered")
}

val XrCompositionLayerCylinderKHR = struct(Module.OPENXR, "XrCompositionLayerCylinderKHR", parentStruct = XrCompositionLayerBaseHeader) {
    documentation =
        """
        Cylindrical layer composition info.

        <h5>Description</h5>
        ##XrCompositionLayerCylinderKHR contains the information needed to render a texture onto a cylinder when calling #EndFrame(). ##XrCompositionLayerCylinderKHR is an alias type for the base struct ##XrCompositionLayerBaseHeader used in ##XrFrameEndInfo.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRCompositionLayerCylinder XR_KHR_composition_layer_cylinder} extension <b>must</b> be enabled prior to using ##XrCompositionLayerCylinderKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_CYLINDER_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code layerFlags} <b>must</b> be 0 or a valid combination of {@code XrCompositionLayerFlagBits} values</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code eyeVisibility} <b>must</b> be a valid {@code XrEyeVisibility} value</li>
            <li>{@code subImage} <b>must</b> be a valid ##XrSwapchainSubImage structure</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader, ##XrFrameEndInfo, ##XrPosef, ##XrSwapchainSubImage, #EndFrame()
        """

    Expression("#TYPE_COMPOSITION_LAYER_CYLINDER_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrCompositionLayerFlags("layerFlags", "specifies options for the layer.")
    XrSpace("space", "the {@code XrSpace} in which the {@code pose} of the cylinder layer is evaluated over time.")
    XrEyeVisibility("eyeVisibility", "")
    XrSwapchainSubImage("subImage", "identifies the image ##XrSwapchainSubImage to use.")
    XrPosef("pose", "an ##XrPosef defining the position and orientation of the center point of the view of the cylinder within the reference frame of the {@code space}.")
    float("radius", "the non-negative radius of the cylinder. Values of zero or floating point positive infinity are treated as an infinite cylinder.")
    float("centralAngle", "the angle of the visible section of the cylinder, based at 0 radians, in the range of <code>[0, 2π)</code>. It grows symmetrically around the 0 radian angle.")
    float("aspectRatio", "the ratio of the visible cylinder section <code>width / height</code>. The height of the cylinder is given by: <code>(cylinder radius × cylinder angle) / aspectRatio</code>.")
}

val XrCompositionLayerEquirectKHR = struct(Module.OPENXR, "XrCompositionLayerEquirectKHR", parentStruct = XrCompositionLayerBaseHeader) {
    documentation =
        """
        Equirectangular layer composition info.

        <h5>Description</h5>
        ##XrCompositionLayerEquirectKHR contains the information needed to render an equirectangular image onto a sphere when calling #EndFrame(). ##XrCompositionLayerEquirectKHR is an alias type for the base struct ##XrCompositionLayerBaseHeader used in ##XrFrameEndInfo.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRCompositionLayerEquirect XR_KHR_composition_layer_equirect} extension <b>must</b> be enabled prior to using ##XrCompositionLayerEquirectKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_EQUIRECT_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code layerFlags} <b>must</b> be 0 or a valid combination of {@code XrCompositionLayerFlagBits} values</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code eyeVisibility} <b>must</b> be a valid {@code XrEyeVisibility} value</li>
            <li>{@code subImage} <b>must</b> be a valid ##XrSwapchainSubImage structure</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader, ##XrFrameEndInfo, ##XrPosef, ##XrSwapchainSubImage, ##XrVector2f, #EndFrame()
        """

    Expression("#TYPE_COMPOSITION_LAYER_EQUIRECT_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrCompositionLayerFlags("layerFlags", "specifies options for the layer.")
    XrSpace("space", "the {@code XrSpace} in which the {@code pose} of the equirect layer is evaluated over time.")
    XrEyeVisibility("eyeVisibility", "")
    XrSwapchainSubImage("subImage", "identifies the image ##XrSwapchainSubImage to use.")
    XrPosef("pose", "an ##XrPosef defining the position and orientation of the center point of the sphere onto which the equirect image data is mapped, relative to the reference frame of the {@code space}.")
    float("radius", "the non-negative radius of the sphere onto which the equirect image data is mapped. Values of zero or floating point positive infinity are treated as an infinite sphere.")
    XrVector2f("scale", "an ##XrVector2f indicating a scale of the texture coordinates after the mapping to 2D.")
    XrVector2f("bias", "an ##XrVector2f indicating a bias of the texture coordinates after the mapping to 2D.")
}

val XrDebugUtilsObjectNameInfoEXT = struct(Module.OPENXR, "XrDebugUtilsObjectNameInfoEXT") {
    documentation =
        """
        Debug utils object name info.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code objectType} is #OBJECT_TYPE_UNKNOWN, {@code objectHandle} <b>must</b> not be #NULL_HANDLE</li>
            <li>If {@code objectType} is not #OBJECT_TYPE_UNKNOWN, {@code objectHandle} <b>must</b> be #NULL_HANDLE or an OpenXR handle of the type associated with {@code objectType}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to using ##XrDebugUtilsObjectNameInfoEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code objectType} <b>must</b> be a valid {@code XrObjectType} value</li>
            <li>If {@code objectName} is not {@code NULL}, {@code objectName} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>

        <h5>See Also</h5>
        ##XrDebugUtilsMessengerCallbackDataEXT, #SetDebugUtilsObjectNameEXT()
        """

    Expression("#TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrObjectType("objectType", "an {@code XrObjectType} specifying the type of the object to be named.")
    uint64_t("objectHandle", "the object to be named.")
    nullable..charUTF8.const.p("objectName", "a {@code NULL} terminated UTF-8 string specifying the name to apply to objectHandle.")
}

val XrDebugUtilsLabelEXT = struct(Module.OPENXR, "XrDebugUtilsLabelEXT") {
    documentation =
        """
        Debug Utils Label.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to using ##XrDebugUtilsLabelEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_DEBUG_UTILS_LABEL_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code labelName} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>

        <h5>See Also</h5>
        ##XrDebugUtilsMessengerCallbackDataEXT, #SessionBeginDebugUtilsLabelRegionEXT(), #SessionInsertDebugUtilsLabelEXT()
        """

    Expression("#TYPE_DEBUG_UTILS_LABEL_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    charUTF8.const.p("labelName", "a {@code NULL} terminated UTF-8 string specifying the label name.")
}

val XrDebugUtilsMessengerCallbackDataEXT = struct(Module.OPENXR, "XrDebugUtilsMessengerCallbackDataEXT") {
    documentation =
        """
        Debug utils messenger callback data.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to using ##XrDebugUtilsMessengerCallbackDataEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code messageId} <b>must</b> be a null-terminated UTF-8 string</li>
            <li>{@code functionName} <b>must</b> be a null-terminated UTF-8 string</li>
            <li>{@code message} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>

        An ##XrDebugUtilsMessengerCallbackDataEXT is a messenger object that handles passing along debug messages to a provided debug callback.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This structure should only be considered valid during the lifetime of the triggered callback.
        </div>

        The labels listed inside {@code sessionLabels} are organized in time order, with the most recently generated label appearing first, and the oldest label appearing last.

        <h5>See Also</h5>
        ##XrDebugUtilsLabelEXT, ##XrDebugUtilsObjectNameInfoEXT, #SubmitDebugUtilsMessageEXT()
        """

    Expression("#TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    charUTF8.const.p("messageId", "a {@code NULL} terminated string that identifies the message in a unique way. If the callback is triggered by a validation layer, this string corresponds the Valid Usage ID (VUID) that can be used to jump to the appropriate location in the OpenXR specification. This value <b>may</b> be {@code NULL} if no unique message identifier is associated with the message.")
    charUTF8.const.p("functionName", "a {@code NULL} terminated string that identifies the OpenXR function that was executing at the time the message callback was triggered. This value <b>may</b> be {@code NULL} in cases where it is difficult to determine the originating OpenXR function.")
    charUTF8.const.p("message", "a {@code NULL} terminated string detailing the trigger conditions.")
    AutoSize("objects", optional = true)..uint32_t("objectCount", "a count of items contained in the {@code objects} array. This may be 0.")
    nullable..XrDebugUtilsObjectNameInfoEXT.p("objects", "a pointer to an array of ##XrDebugUtilsObjectNameInfoEXT objects related to the detected issue. The array is roughly in order or importance, but the 0th element is always guaranteed to be the most important object for this message.")
    AutoSize("sessionLabels", optional = true)..uint32_t("sessionLabelCount", "a count of items contained in the {@code sessionLabels} array. This may be 0.")
    nullable..XrDebugUtilsLabelEXT.p("sessionLabels", """a pointer to an array of ##XrDebugUtilsLabelEXT objects related to the detected issue. The array is roughly in order or importance, but the 0th element is always guaranteed to be the most important object for this message.

        NULL or a pointer to an array of ##XrDebugUtilsLabelEXT active in the current {@code XrSession} at the time the callback was triggered. Refer to <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session-labels">Session Labels</a> for more information.""")
}

val XrDebugUtilsMessengerCreateInfoEXT = struct(Module.OPENXR, "XrDebugUtilsMessengerCreateInfoEXT") {
    documentation =
        """
        Debug utils messenger create info.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code userCallback} <b>must</b> be a valid PFN_xrDebugUtilsMessengerCallbackEXT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to using ##XrDebugUtilsMessengerCreateInfoEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code messageSeverities} <b>must</b> be a valid combination of {@code XrDebugUtilsMessageSeverityFlagBitsEXT} values</li>
            <li>{@code messageSeverities} <b>must</b> not be 0</li>
            <li>{@code messageTypes} <b>must</b> be a valid combination of {@code XrDebugUtilsMessageTypeFlagBitsEXT} values</li>
            <li>{@code messageTypes} <b>must</b> not be 0</li>
            <li>{@code userCallback} <b>must</b> be a valid ##XrDebugUtilsMessengerCallbackEXT value</li>
        </ul>

        For each {@code XrDebugUtilsMessengerEXT} that is created the ##XrDebugUtilsMessengerCreateInfoEXT{@code ::messageSeverities} and ##XrDebugUtilsMessengerCreateInfoEXT{@code ::messageTypes} determine when that ##XrDebugUtilsMessengerCreateInfoEXT{@code ::userCallback} is called. The process to determine if the user’s userCallback is triggered when an event occurs is as follows:

        <ul>
            <li>The runtime will perform a bitwise AND of the event’s {@code XrDebugUtilsMessageSeverityFlagBitsEXT} with the ##XrDebugUtilsMessengerCreateInfoEXT{@code ::messageSeverities} provided during creation of the {@code XrDebugUtilsMessengerEXT} object.</li>
            <li>If this results in 0, the message is skipped.</li>
            <li>The runtime will perform bitwise AND of the event’s {@code XrDebugUtilsMessageTypeFlagBitsEXT} with the ##XrDebugUtilsMessengerCreateInfoEXT{@code ::messageTypes} provided during the creation of the {@code XrDebugUtilsMessengerEXT} object.</li>
            <li>If this results in 0, the message is skipped.</li>
            <li>If the message of the current event is not skipped, the callback will be called with the message.</li>
        </ul>

        The callback will come directly from the component that detected the event, unless some other layer intercepts the calls for its own purposes (filter them in a different way, log to a system error log, etc.).

        <h5>See Also</h5>
        ##XrDebugUtilsMessengerCallbackEXT, #CreateDebugUtilsMessengerEXT()
        """

    Expression("#TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrDebugUtilsMessageSeverityFlagsEXT("messageSeverities", "a bitmask of {@code XrDebugUtilsMessageSeverityFlagBitsEXT} specifying which severity of event(s) that will cause this callback to be called.")
    XrDebugUtilsMessageTypeFlagsEXT("messageTypes", "a combination of {@code XrDebugUtilsMessageTypeFlagBitsEXT} specifying which type of event(s) will cause this callback to be called.")
    PFN_xrDebugUtilsMessengerCallbackEXT("userCallback", "the application defined callback function to call.")
    nullable..opaque_p("userData", "arbitrary user data to be passed to the callback.")
}

val XrGraphicsBindingOpenGLWin32KHR = struct(Module.OPENXR, "XrGraphicsBindingOpenGLWin32KHR") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        The graphics binding structure to be passed at session creation to use OpenGL on Windows.

        <h5>Description</h5>
        When creating an OpenGL-backed {@code XrSession} on Microsoft Windows, the application will provide a pointer to an ##XrGraphicsBindingOpenGLWin32KHR in the {@code next} chain of the ##XrSessionCreateInfo. As no standardized way exists for OpenGL to create the graphics context on a specific GPU, the runtime <b>must</b> assume that the application uses the operating systems default GPU. If the GPU used by the runtime does not match the GPU on which the OpenGL context of the application got created, #CreateSession() <b>must</b> return #ERROR_GRAPHICS_DEVICE_INVALID.

        The required window system configuration define to expose this structure type is #USE_PLATFORM_WIN32.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHROpenGLEnable XR_KHR_opengl_enable} extension <b>must</b> be enabled prior to using ##XrGraphicsBindingOpenGLWin32KHR</li>
            <li>{@code type} <b>must</b> be #TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code hDC} <b>must</b> be a valid {@code HDC} value</li>
            <li>{@code hGLRC} <b>must</b> be a valid {@code HGLRC} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateSession()
        """

    Expression("#TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    HDC("hDC", "a valid Windows HW device context handle.")
    HGLRC("hGLRC", "a valid Windows OpenGL rendering context handle.")
}

val XrGraphicsBindingOpenGLXlibKHR = struct(Module.OPENXR, "XrGraphicsBindingOpenGLXlibKHR") {
    javaImport("org.lwjgl.system.linux.*")
    javaImport("org.lwjgl.opengl.*")
    documentation =
        """
        The graphics binding structure to be passed at session creation to use OpenGL on X11 via Xlib.

        <h5>Description</h5>
        When creating an OpenGL-backed {@code XrSession} on any Linux/Unix platform that utilizes X11 and GLX, via the Xlib library, the application will provide a pointer to an ##XrGraphicsBindingOpenGLXlibKHR in the {@code next} chain of the ##XrSessionCreateInfo.

        The required window system configuration define to expose this structure type is #USE_PLATFORM_XLIB.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHROpenGLEnable XR_KHR_opengl_enable} extension <b>must</b> be enabled prior to using ##XrGraphicsBindingOpenGLXlibKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_GRAPHICS_BINDING_OPENGL_XLIB_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code xDisplay} <b>must</b> be a pointer to a {@code Display} value</li>
            <li>{@code glxFBConfig} <b>must</b> be a valid {@code GLXFBConfig} value</li>
            <li>{@code glxDrawable} <b>must</b> be a valid {@code GLXDrawable} value</li>
            <li>{@code glxContext} <b>must</b> be a valid {@code GLXContext} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateSession()
        """

    Expression("#TYPE_GRAPHICS_BINDING_OPENGL_XLIB_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    Display.p("xDisplay", "a valid X11 {@code Display}.")
    uint32_t("visualid", "a valid X11 visual identifier.")
    GLXFBConfig("glxFBConfig", "a valid X11 OpenGL GLX {@code GLXFBConfig}.")
    GLXDrawable("glxDrawable", "a valid X11 OpenGL GLX {@code GLXDrawable}.")
    GLXContext("glxContext", "a valid X11 OpenGL GLX {@code GLXContext}.")
}

val XrGraphicsBindingOpenGLXcbKHR = struct(Module.OPENXR, "XrGraphicsBindingOpenGLXcbKHR") {
    documentation =
        """
        The graphics binding structure to be passed at session creation to use OpenGL on X11 via XCB.

        <h5>Description</h5>
        When creating an OpenGL-backed {@code XrSession} on any Linux/Unix platform that utilizes X11 and GLX, via the Xlib library, the application will provide a pointer to an ##XrGraphicsBindingOpenGLXcbKHR in the {@code next} chain of the ##XrSessionCreateInfo.

        The required window system configuration define to expose this structure type is #USE_PLATFORM_XCB.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHROpenGLEnable XR_KHR_opengl_enable} extension <b>must</b> be enabled prior to using ##XrGraphicsBindingOpenGLXcbKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code connection} <b>must</b> be a pointer to an {@code xcb_connection_t} value</li>
            <li>{@code fbconfigid} <b>must</b> be a valid {@code xcb_glx_fbconfig_t} value</li>
            <li>{@code visualid} <b>must</b> be a valid {@code xcb_visualid_t} value</li>
            <li>{@code glxDrawable} <b>must</b> be a valid {@code xcb_glx_drawable_t} value</li>
            <li>{@code glxContext} <b>must</b> be a valid {@code xcb_glx_context_t} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateSession()
        """

    Expression("#TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    xcb_connection_t.p("connection", "a valid {@code xcb_connection_t}.")
    uint32_t("screenNumber", "an index indicating which screen should be used for rendering.")
    xcb_glx_fbconfig_t("fbconfigid", "a valid XCB OpenGL GLX {@code xcb_glx_fbconfig_t}.")
    xcb_visualid_t("visualid", "a valid XCB OpenGL GLX {@code xcb_visualid_t}.")
    xcb_glx_drawable_t("glxDrawable", "a valid XCB OpenGL GLX {@code xcb_glx_drawable_t}.")
    xcb_glx_context_t("glxContext", "a valid XCB OpenGL GLX {@code xcb_glx_context_t}.")
}

val XrGraphicsBindingOpenGLWaylandKHR = struct(Module.OPENXR, "XrGraphicsBindingOpenGLWaylandKHR") {
    documentation =
        """
        The graphics binding structure to be passed at session creation to use OpenGL on Wayland.

        <h5>Description</h5>
        When creating an OpenGL-backed {@code XrSession} on any Linux/Unix platform that utilizes the Wayland protocol with its compositor, the application will provide a pointer to an ##XrGraphicsBindingOpenGLWaylandKHR in the {@code next} chain of the ##XrSessionCreateInfo.

        The required window system configuration define to expose this structure type is #USE_PLATFORM_WAYLAND.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHROpenGLEnable XR_KHR_opengl_enable} extension <b>must</b> be enabled prior to using ##XrGraphicsBindingOpenGLWaylandKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code display} <b>must</b> be a pointer to a {@code wl_display} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateSession()
        """

    Expression("#TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    wl_display.p("display", "a valid Wayland {@code wl_display}.")
}

val XrSwapchainImageOpenGLKHR = struct(Module.OPENXR, "XrSwapchainImageOpenGLKHR", parentStruct = XrSwapchainImageBaseHeader) {
    documentation =
        """
        OpenGL-specific swapchain image structure.

        <h5>Description</h5>
        If a given session was created with a stext:XrGraphicsBindingOpenGL*KHR, the following conditions <b>must</b> apply.

        <ul>
            <li>Calls to #EnumerateSwapchainImages() on an {@code XrSwapchain} in that session <b>must</b> return an array of ##XrSwapchainImageOpenGLKHR structures.</li>
            <li>Whenever an OpenXR function accepts an ##XrSwapchainImageBaseHeader pointer as a parameter in that session, the runtime <b>must</b> also accept a pointer to an ##XrSwapchainImageOpenGLKHR.</li>
        </ul>

        The OpenXR runtime <b>must</b> interpret the bottom-left corner of the swapchain image as the coordinate origin unless specified otherwise by extension functionality.

        The OpenXR runtime <b>must</b> interpret the swapchain images in a clip space of positive Y pointing up, near Z plane at -1, and far Z plane at 1.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHROpenGLEnable XR_KHR_opengl_enable} extension <b>must</b> be enabled prior to using ##XrSwapchainImageOpenGLKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSwapchainImageBaseHeader
        """

    Expression("#TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    uint32_t("image", "the OpenGL texture handle associated with this swapchain image.")
}

val XrGraphicsRequirementsOpenGLKHR = struct(Module.OPENXR, "XrGraphicsRequirementsOpenGLKHR") {
    documentation =
        """
        OpenGL API version requirements.

        <h5>Description</h5>
        ##XrGraphicsRequirementsOpenGLKHR is populated by #GetOpenGLGraphicsRequirementsKHR() with the runtime’s OpenGL API version requirements.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHROpenGLEnable XR_KHR_opengl_enable} extension <b>must</b> be enabled prior to using ##XrGraphicsRequirementsOpenGLKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_GRAPHICS_REQUIREMENTS_OPENGL_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetOpenGLGraphicsRequirementsKHR()
        """

    Expression("#TYPE_GRAPHICS_REQUIREMENTS_OPENGL_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrVersion("minApiVersionSupported", "the minimum version of OpenGL that the runtime supports. Uses #XR_MAKE_VERSION() on major and minor API version, ignoring any patch version component.")
    XrVersion("maxApiVersionSupported", "the maximum version of OpenGL that the runtime has been tested on and is known to support. Newer OpenGL versions might work if they are compatible. Uses #XR_MAKE_VERSION() on major and minor API version, ignoring any patch version component.")
}

val XrSwapchainImageOpenGLESKHR = struct(Module.OPENXR, "XrSwapchainImageOpenGLESKHR", parentStruct = XrSwapchainImageBaseHeader) {
    documentation =
        """
        OpenGL ES-specific swapchain image structure.

        <h5>Description</h5>
        If a given session was created with a stext:XrGraphicsBindingOpenGLES*KHR, the following conditions <b>must</b> apply.

        <ul>
            <li>Calls to #EnumerateSwapchainImages() on an {@code XrSwapchain} in that session <b>must</b> return an array of ##XrSwapchainImageOpenGLESKHR structures.</li>
            <li>Whenever an OpenXR function accepts an ##XrSwapchainImageBaseHeader pointer as a parameter in that session, the runtime <b>must</b> also accept a pointer to an ##XrSwapchainImageOpenGLESKHR structure.</li>
        </ul>

        The OpenXR runtime <b>must</b> interpret the bottom-left corner of the swapchain image as the coordinate origin unless specified otherwise by extension functionality.

        The OpenXR runtime <b>must</b> interpret the swapchain images in a clip space of positive Y pointing up, near Z plane at -1, and far Z plane at 1.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHROpenGLESEnable XR_KHR_opengl_es_enable} extension <b>must</b> be enabled prior to using ##XrSwapchainImageOpenGLESKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSwapchainImageBaseHeader
        """

    Expression("#TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    uint32_t("image", "an index indicating the current OpenGL ES swapchain image to use.")
}

val XrGraphicsRequirementsOpenGLESKHR = struct(Module.OPENXR, "XrGraphicsRequirementsOpenGLESKHR") {
    documentation =
        """
        OpenGL ES API version requirements.

        <h5>Description</h5>
        ##XrGraphicsRequirementsOpenGLESKHR is populated by #GetOpenGLESGraphicsRequirementsKHR() with the runtime’s OpenGL ES API version requirements.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHROpenGLESEnable XR_KHR_opengl_es_enable} extension <b>must</b> be enabled prior to using ##XrGraphicsRequirementsOpenGLESKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetOpenGLESGraphicsRequirementsKHR()
        """

    Expression("#TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrVersion("minApiVersionSupported", "the minimum version of OpenGL ES that the runtime supports. Uses #XR_MAKE_VERSION() on major and minor API version, ignoring any patch version component.")
    XrVersion("maxApiVersionSupported", "the maximum version of OpenGL ES that the runtime has been tested on and is known to support. Newer OpenGL ES versions might work if they are compatible. Uses #XR_MAKE_VERSION() on major and minor API version, ignoring any patch version component.")
}

val XrGraphicsBindingVulkanKHR = struct(Module.OPENXR, "XrGraphicsBindingVulkanKHR") {
    javaImport("org.lwjgl.vulkan.*")
    documentation =
        """
        The graphics binding structure to be passed at session creation to use Vulkan.

        <h5>Description</h5>
        When creating a Vulkan-backed {@code XrSession}, the application will provide a pointer to an ##XrGraphicsBindingVulkanKHR in the {@code next} chain of the ##XrSessionCreateInfo.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code instance} <b>must</b> have enabled a Vulkan API version in the range specified by ##XrGraphicsBindingVulkanKHR</li>
            <li>{@code instance} <b>must</b> have enabled all the instance extensions specified by #GetVulkanInstanceExtensionsKHR()</li>
            <li>{@code physicalDevice} {@code VkPhysicalDevice} <b>must</b> match the device specified by #GetVulkanGraphicsDeviceKHR()</li>
            <li>{@code device} <b>must</b> have enabled all the device extensions specified by #GetVulkanDeviceExtensionsKHR()</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVulkanEnable XR_KHR_vulkan_enable} extension <b>must</b> be enabled prior to using ##XrGraphicsBindingVulkanKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_GRAPHICS_BINDING_VULKAN_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} value</li>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} value</li>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateSession()
        """

    Expression("#TYPE_GRAPHICS_BINDING_VULKAN_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    VkInstance("instance", "a valid Vulkan {@code VkInstance}.")
    VkPhysicalDevice("physicalDevice", "a valid Vulkan {@code VkPhysicalDevice}.")
    VkDevice("device", "a valid Vulkan {@code VkDevice}.")
    uint32_t("queueFamilyIndex", "a valid queue family index on {@code device}.")
    uint32_t("queueIndex", "a valid queue index on {@code device} to be used for synchronization.")
}

val XrSwapchainImageVulkanKHR = struct(Module.OPENXR, "XrSwapchainImageVulkanKHR", parentStruct = XrSwapchainImageBaseHeader) {
    javaImport("org.lwjgl.vulkan.*")
    documentation =
        """
        Vulkan-specific swapchain image structure.

        <h5>Description</h5>
        If a given session was created with ##XrGraphicsBindingVulkanKHR, the following conditions <b>must</b> apply.

        <ul>
            <li>Calls to #EnumerateSwapchainImages() on an {@code XrSwapchain} in that session <b>must</b> return an array of ##XrSwapchainImageVulkanKHR structures.</li>
            <li>Whenever an OpenXR function accepts an ##XrSwapchainImageBaseHeader pointer as a parameter in that session, the runtime <b>must</b> also accept a pointer to an ##XrSwapchainImageVulkanKHR.</li>
        </ul>

        The OpenXR runtime <b>must</b> interpret the top-left corner of the swapchain image as the coordinate origin unless specified otherwise by extension functionality.

        The OpenXR runtime <b>must</b> interpret the swapchain images in a clip space of positive Y pointing down, near Z plane at 0, and far Z plane at 1.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVulkanEnable XR_KHR_vulkan_enable} extension <b>must</b> be enabled prior to using ##XrSwapchainImageVulkanKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrSwapchainImageFoveationVulkanFB</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrSwapchainImageBaseHeader
        """

    Expression("#TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrSwapchainImageFoveationVulkanFB",
        prepend = true
    )..nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    VkImage("image", "a valid Vulkan {@code VkImage} to use.")
}

val XrGraphicsRequirementsVulkanKHR = struct(Module.OPENXR, "XrGraphicsRequirementsVulkanKHR") {
    documentation =
        """
        Vulkan API version requirements.

        <h5>Description</h5>
        ##XrGraphicsRequirementsVulkanKHR is populated by #GetVulkanGraphicsRequirementsKHR() with the runtime’s Vulkan API version requirements.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVulkanEnable XR_KHR_vulkan_enable} extension <b>must</b> be enabled prior to using ##XrGraphicsRequirementsVulkanKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetVulkanGraphicsRequirements2KHR(), #GetVulkanGraphicsRequirementsKHR()
        """

    Expression("#TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrVersion("minApiVersionSupported", "the minimum Vulkan Instance API version that the runtime supports. Uses #XR_MAKE_VERSION() on major and minor API version, ignoring any patch version component.")
    XrVersion("maxApiVersionSupported", "the maximum Vulkan Instance API version that the runtime has been tested on and is known to support. Newer Vulkan Instance API versions might work if they are compatible. Uses #XR_MAKE_VERSION() on major and minor API version, ignoring any patch version component.")
}

val XrSystemEyeGazeInteractionPropertiesEXT = struct(Module.OPENXR, "XrSystemEyeGazeInteractionPropertiesEXT") {
    documentation =
        """
        Eye gaze interaction system properties.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTEyeGazeInteraction XR_EXT_eye_gaze_interaction} extension <b>must</b> be enabled prior to using ##XrSystemEyeGazeInteractionPropertiesEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrBool32("supportsEyeGazeInteraction", "the runtime <b>must</b> set this value to #TRUE when eye gaze sufficient for use cases such as aiming or targeting is supported by the current device, otherwise the runtime <b>must</b> set this to #FALSE.")
}

val XrEyeGazeSampleTimeEXT = struct(Module.OPENXR, "XrEyeGazeSampleTimeEXT") {
    documentation =
        """
        Eye gaze sample time structure.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTEyeGazeInteraction XR_EXT_eye_gaze_interaction} extension <b>must</b> be enabled prior to using ##XrEyeGazeSampleTimeEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_EYE_GAZE_SAMPLE_TIME_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_EYE_GAZE_SAMPLE_TIME_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrTime("time", "when in time the eye gaze pose is expressed.")
}

val XrVisibilityMaskKHR = struct(Module.OPENXR, "XrVisibilityMaskKHR") {
    documentation =
        """
        Visibility Mask.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVisibilityMask XR_KHR_visibility_mask} extension <b>must</b> be enabled prior to using ##XrVisibilityMaskKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_VISIBILITY_MASK_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code vertexCapacityInput} is not 0, {@code vertices} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector2f structures</li>
            <li>If {@code indexCapacityInput} is not 0, {@code indices} <b>must</b> be a pointer to an array of {@code indexCapacityInput} {@code uint32_t} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrVector2f, #GetVisibilityMaskKHR()
        """

    Expression("#TYPE_VISIBILITY_MASK_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput", "the capacity of the {@code vertices} array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("vertexCountOutput", "filled in by the runtime with the count of vertices written or the required capacity in the case that {@code vertexCapacityInput} or {@code indexCapacityInput} is 0.")
    nullable..XrVector2f.p("vertices", "an array of vertices filled in by the runtime that specifies mask coordinates in the z=-1 plane of the rendered view—​i.e. one meter in front of the view. When rendering the mask for use in a projection layer, these vertices must be transformed by the application’s projection matrix used for the respective ##XrCompositionLayerProjectionView.")
    AutoSize("indices", optional = true)..uint32_t("indexCapacityInput", "the capacity of the {@code indices} array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("indexCountOutput", "filled in by the runtime with the count of indices written or the required capacity in the case that {@code vertexCapacityInput} or {@code indexCapacityInput} is 0.")
    nullable..uint32_t.p("indices", "an array of indices filled in by the runtime, specifying the indices of the mask geometry in the {@code vertices} array.")
}

val XrEventDataVisibilityMaskChangedKHR = struct(Module.OPENXR, "XrEventDataVisibilityMaskChangedKHR", parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Visibility Mask.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVisibilityMask XR_KHR_visibility_mask} extension <b>must</b> be enabled prior to using ##XrEventDataVisibilityMaskChangedKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
        </ul>
        """

    Expression("#TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSession("session", "the {@code XrSession} for which the view mask has changed.")
    XrViewConfigurationType("viewConfigurationType", "the view configuration whose mask has changed.")
    uint32_t("viewIndex", "the individual view within the view configuration to which the change refers.")
}

val XrSessionCreateInfoOverlayEXTX = struct(Module.OPENXR, "XrSessionCreateInfoOverlayEXTX") {
    documentation =
        """
        Session creation extension struct providing overlay session parameters.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTXOverlay XR_EXTX_overlay} extension <b>must</b> be enabled prior to using ##XrSessionCreateInfoOverlayEXTX</li>
            <li>{@code type} <b>must</b> be #TYPE_SESSION_CREATE_INFO_OVERLAY_EXTX</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code createFlags} <b>must</b> be 0</li>
        </ul>
        """

    Expression("#TYPE_SESSION_CREATE_INFO_OVERLAY_EXTX")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrOverlaySessionCreateFlagsEXTX("createFlags", "0 or one or more {@code XrOverlaySessionCreateFlagBitsEXTX} which indicate various characteristics desired for the overlay session.")
    uint32_t("sessionLayersPlacement", "a value indicating the desired placement of the session’s composition layers in terms of other sessions.")
}

val XrEventDataMainSessionVisibilityChangedEXTX = struct(Module.OPENXR, "XrEventDataMainSessionVisibilityChangedEXTX", parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Event representing main session visibility change.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code type} is the {@code XrStructureType} of this structure.</li>
            <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
            <li>{@code visible} is an {@code XrBool32} which indicates if {@code session} is now visible or is not.</li>
            <li>{@code flags} is 0 or one or more {@code XrOverlayMainSessionFlagBitsEXTX} which indicates various state information for the main session.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTXOverlay XR_EXTX_overlay} extension <b>must</b> be enabled prior to using ##XrEventDataMainSessionVisibilityChangedEXTX</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code XrOverlayMainSessionFlagBitsEXTX} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
        </ul>
        """

    Expression("#TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrBool32("visible", "")
    XrOverlayMainSessionFlagsEXTX("flags", "")
}

val XrCompositionLayerColorScaleBiasKHR = struct(Module.OPENXR, "XrCompositionLayerColorScaleBiasKHR") {
    documentation =
        """
        defines color scale and bias for layer textures.

        <h5>Description</h5>
        ##XrCompositionLayerColorScaleBiasKHR contains the information needed to scale and bias the color of layer textures.

        The ##XrCompositionLayerColorScaleBiasKHR structure <b>can</b> be applied by applications to composition layers by adding an instance of the struct to the ##XrCompositionLayerBaseHeader{@code ::next} list.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRCompositionLayerColorScaleBias XR_KHR_composition_layer_color_scale_bias} extension <b>must</b> be enabled prior to using ##XrCompositionLayerColorScaleBiasKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrColor4f, ##XrCompositionLayerBaseHeader
        """

    Expression("#TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrColor4f("colorScale", "an ##XrColor4f which will modulate the color sourced from the images.")
    XrColor4f("colorBias", "an ##XrColor4f which will offset the color sourced from the images.")
}

val XrSpatialAnchorCreateInfoMSFT = struct(Module.OPENXR, "XrSpatialAnchorCreateInfoMSFT") {
    documentation =
        """
        Information to create a spatial anchor.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialAnchor XR_MSFT_spatial_anchor} extension <b>must</b> be enabled prior to using ##XrSpatialAnchorCreateInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #CreateSpatialAnchorMSFT()
        """

    Expression("#TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpace("space", "a handle to the {@code XrSpace} in which {@code pose} is specified.")
    XrPosef("pose", "the ##XrPosef within {@code space} at {@code time} that specifies the point in the real world used to initialize the new anchor.")
    XrTime("time", "the {@code XrTime} at which {@code pose} will be evaluated within {@code space}.")
}

val XrSpatialAnchorSpaceCreateInfoMSFT = struct(Module.OPENXR, "XrSpatialAnchorSpaceCreateInfoMSFT") {
    documentation =
        """
        Information to create a space from a spatial anchor.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialAnchor XR_MSFT_spatial_anchor} extension <b>must</b> be enabled prior to using ##XrSpatialAnchorSpaceCreateInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SPATIAL_ANCHOR_SPACE_CREATE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code anchor} <b>must</b> be a valid {@code XrSpatialAnchorMSFT} handle</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #CreateSpatialAnchorSpaceMSFT()
        """

    Expression("#TYPE_SPATIAL_ANCHOR_SPACE_CREATE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpatialAnchorMSFT("anchor", "a handle to an {@code XrSpatialAnchorMSFT} previously created with #CreateSpatialAnchorMSFT().")
    XrPosef("poseInAnchorSpace", "an ##XrPosef defining the position and orientation of the new space’s origin relative to the anchor’s natural origin.")
}

val XrCompositionLayerImageLayoutFB = struct(Module.OPENXR, "XrCompositionLayerImageLayoutFB") {
    documentation =
        """
        specifies image layout for composition layers.

        <h5>Description</h5>
        ##XrCompositionLayerImageLayoutFB contains additional flags used to change the interpretation of the image layout for a composition layer.

        To specify the additional flags, you <b>must</b> create a ##XrCompositionLayerImageLayoutFB structure and pass it via the ##XrCompositionLayerBaseHeader structure’s {@code next} parameter.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBCompositionLayerImageLayout XR_FB_composition_layer_image_layout} extension <b>must</b> be enabled prior to using ##XrCompositionLayerImageLayoutFB</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_IMAGE_LAYOUT_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be 0 or a valid combination of {@code XrCompositionLayerImageLayoutFlagBitsFB} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader
        """

    Expression("#TYPE_COMPOSITION_LAYER_IMAGE_LAYOUT_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrCompositionLayerImageLayoutFlagsFB("flags", "a bitmask of {@code XrCompositionLayerImageLayoutFlagBitsFB}.")
}

val XrCompositionLayerAlphaBlendFB = struct(Module.OPENXR, "XrCompositionLayerAlphaBlendFB") {
    documentation =
        """
        specifies blend factors for composition layers.

        <h5>Description</h5>
        ##XrCompositionLayerAlphaBlendFB provides applications with explicit control over source and destination blend factors.

        The ##XrCompositionLayerAlphaBlendFB structure <b>must</b> be provided in the {@code next} chain of the ##XrCompositionLayerBaseHeader structure.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBCompositionLayerAlphaBlend XR_FB_composition_layer_alpha_blend} extension <b>must</b> be enabled prior to using ##XrCompositionLayerAlphaBlendFB</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_ALPHA_BLEND_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code srcFactorColor} <b>must</b> be a valid {@code XrBlendFactorFB} value</li>
            <li>{@code dstFactorColor} <b>must</b> be a valid {@code XrBlendFactorFB} value</li>
            <li>{@code srcFactorAlpha} <b>must</b> be a valid {@code XrBlendFactorFB} value</li>
            <li>{@code dstFactorAlpha} <b>must</b> be a valid {@code XrBlendFactorFB} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader
        """

    Expression("#TYPE_COMPOSITION_LAYER_ALPHA_BLEND_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrBlendFactorFB("srcFactorColor", "specifies the source color blend factor.")
    XrBlendFactorFB("dstFactorColor", "specifies the destination color blend factor.")
    XrBlendFactorFB("srcFactorAlpha", "specifies the source alpha blend factor.")
    XrBlendFactorFB("dstFactorAlpha", "specifies the destination alpha blend factor.")
}

val XrViewConfigurationDepthRangeEXT = struct(Module.OPENXR, "XrViewConfigurationDepthRangeEXT") {
    documentation =
        """
        View configuration depth range information.

        <h5>Description</h5>
        When enumerating the view configurations with #EnumerateViewConfigurationViews(), the application <b>can</b> provide a pointer to an ##XrViewConfigurationDepthRangeEXT in the {@code next} chain of ##XrViewConfigurationView.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTViewConfigurationDepthRange XR_EXT_view_configuration_depth_range} extension <b>must</b> be enabled prior to using ##XrViewConfigurationDepthRangeEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_VIEW_CONFIGURATION_DEPTH_RANGE_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrViewConfigurationView, #EnumerateViewConfigurationViews()
        """

    Expression("#TYPE_VIEW_CONFIGURATION_DEPTH_RANGE_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    float("recommendedNearZ", "the recommended minimum positive distance in meters that content should be rendered for the view to achieve the best user experience.")
    float("minNearZ", "the absolute minimum positive distance in meters that content should be rendered for the view.")
    float("recommendedFarZ", "the recommended maximum positive distance in meters that content should be rendered for the view to achieve the best user experience.")
    float("maxFarZ", "the absolute maximum positive distance in meters that content should be rendered for the view.")
}

val XrGraphicsBindingEGLMNDX = struct(Module.OPENXR, "XrGraphicsBindingEGLMNDX") {
    javaImport("org.lwjgl.egl.*")
    documentation =
        """
        The graphics binding structure to be passed at session creation to EGL.

        <h5>Description</h5>
        When creating an EGL based {@code XrSession}, the application will provide a pointer to an ##XrGraphicsBindingEGLMNDX structure in the {@code next} chain of the ##XrSessionCreateInfo.

        The required window system configuration define to expose this structure type is #USE_PLATFORM_EGL.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MNDXEGLEnable XR_MNDX_egl_enable} extension <b>must</b> be enabled prior to using ##XrGraphicsBindingEGLMNDX</li>
            <li>{@code type} <b>must</b> be #TYPE_GRAPHICS_BINDING_EGL_MNDX</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code getProcAddress} <b>must</b> be a valid {@code PFNEGLGETPROCADDRESSPROC} value</li>
            <li>{@code display} <b>must</b> be a valid {@code EGLDisplay} value</li>
            <li>{@code config} <b>must</b> be a valid {@code EGLConfig} value</li>
            <li>{@code context} <b>must</b> be a valid {@code EGLContext} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateSession()
        """

    Expression("#TYPE_GRAPHICS_BINDING_EGL_MNDX")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    PFNEGLGETPROCADDRESSPROC("getProcAddress", "a valid function pointer to {@code eglGetProcAddress}.")
    EGLDisplay("display", "a valid EGL {@code EGLDisplay}.")
    EGLConfig("config", "a valid EGL {@code EGLConfig}.")
    EGLContext("context", "a valid EGL {@code EGLContext}.")
}

val XrSpatialGraphNodeSpaceCreateInfoMSFT = struct(Module.OPENXR, "XrSpatialGraphNodeSpaceCreateInfoMSFT") {
    documentation =
        """
        The information to create space from a spatial graph node.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to using ##XrSpatialGraphNodeSpaceCreateInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code nodeType} <b>must</b> be a valid {@code XrSpatialGraphNodeTypeMSFT} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #CreateSpatialGraphNodeSpaceMSFT()
        """

    Expression("#TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpatialGraphNodeTypeMSFT("nodeType", "an {@code XrSpatialGraphNodeTypeMSFT} specifying the spatial node type.")
    uint8_t("nodeId", "a global unique identifier (a.k.a. GUID or 16 byte array), representing the spatial node that is being tracked.")[16]
    XrPosef("pose", "an ##XrPosef defining the position and orientation of the new space’s origin within the natural reference frame of the spatial graph node.")
}

val XrSystemHandTrackingPropertiesEXT = struct(Module.OPENXR, "XrSystemHandTrackingPropertiesEXT") {
    documentation =
        """
        System property for hand tracking.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to using ##XrSystemHandTrackingPropertiesEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        If a runtime returns #FALSE for {@code supportsHandTracking}, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateHandTrackerEXT().
        """

    Expression("#TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrBool32("supportsHandTracking", "an {@code XrBool32}, indicating if current system is capable of hand tracking input.")
}

val XrHandTrackerCreateInfoEXT = struct(Module.OPENXR, "XrHandTrackerCreateInfoEXT") {
    documentation =
        """
        Information to create a hand joints handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to using ##XrHandTrackerCreateInfoEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_TRACKER_CREATE_INFO_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrHandPoseTypeInfoMSFT</li>
            <li>{@code hand} <b>must</b> be a valid {@code XrHandEXT} value</li>
            <li>{@code handJointSet} <b>must</b> be a valid {@code XrHandJointSetEXT} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateHandTrackerEXT()
        """

    Expression("#TYPE_HAND_TRACKER_CREATE_INFO_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrHandPoseTypeInfoMSFT",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrHandEXT("hand", "an {@code XrHandEXT} which describes which hand the tracker is tracking.")
    XrHandJointSetEXT("handJointSet", "an {@code XrHandJointSetEXT} describe the set of hand joints to retrieve.")
}

val XrHandJointsLocateInfoEXT = struct(Module.OPENXR, "XrHandJointsLocateInfoEXT") {
    documentation =
        """
        Describes the information to locate hand joints.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to using ##XrHandJointsLocateInfoEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_JOINTS_LOCATE_INFO_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrHandJointsMotionRangeInfoEXT, ##XrHandTrackingAimStateFB, ##XrHandTrackingCapsulesStateFB, ##XrHandTrackingScaleFB</li>
            <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
        </ul>

        <h5>See Also</h5>
        #LocateHandJointsEXT()
        """

    Expression("#TYPE_HAND_JOINTS_LOCATE_INFO_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrHandJointsMotionRangeInfoEXT", "XrHandTrackingAimStateFB", "XrHandTrackingCapsulesStateFB", "XrHandTrackingScaleFB",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpace("baseSpace", "an {@code XrSpace} within which the returned hand joint locations will be represented.")
    XrTime("time", "an {@code XrTime} at which to locate the hand joints.")
}

val XrHandJointLocationEXT = struct(Module.OPENXR, "XrHandJointLocationEXT") {
    documentation =
        """
        Describes the location and radius of a hand joint.

        <h5>Description</h5>
        If the returned {@code locationFlags} has #SPACE_LOCATION_POSITION_VALID_BIT set, the returned radius <b>must</b> be a positive value.

        If the returned {@code locationFlags} has #SPACE_LOCATION_POSITION_VALID_BIT unset, the returned radius value is undefined and should be avoided.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to using ##XrHandJointLocationEXT</li>
            <li>{@code locationFlags} <b>must</b> be 0 or a valid combination of {@code XrSpaceLocationFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandJointLocationsEXT, ##XrPosef
        """

    XrSpaceLocationFlags("locationFlags", "a bitfield, with bit masks defined in {@code XrSpaceLocationFlagBits}, to indicate which members contain valid data. If none of the bits are set, no other fields in this structure <b>should</b> be considered to be valid or meaningful.")
    XrPosef("pose", "an ##XrPosef defining the position and orientation of the origin of a hand joint within the reference frame of the corresponding ##XrHandJointsLocateInfoEXT{@code ::baseSpace}.")
    float("radius", "a {@code float} value radius of the corresponding joint in units of meters.")
}

val XrHandJointVelocityEXT = struct(Module.OPENXR, "XrHandJointVelocityEXT") {
    documentation =
        """
        Describes the velocity of a hand joint.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to using ##XrHandJointVelocityEXT</li>
            <li>{@code velocityFlags} <b>must</b> be a valid combination of {@code XrSpaceVelocityFlagBits} values</li>
            <li>{@code velocityFlags} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandJointVelocitiesEXT, ##XrVector3f
        """

    XrSpaceVelocityFlags("velocityFlags", "a bitfield, with bit masks defined in {@code XrSpaceVelocityFlagBits}, to indicate which members contain valid data. If none of the bits are set, no other fields in this structure <b>should</b> be considered to be valid or meaningful.")
    XrVector3f("linearVelocity", "the relative linear velocity of the hand joint with respect to and expressed in the reference frame of the corresponding ##XrHandJointsLocateInfoEXT{@code ::baseSpace}, in units of meters per second.")
    XrVector3f("angularVelocity", "the relative angular velocity of the hand joint with respect to the corresponding ##XrHandJointsLocateInfoEXT{@code ::baseSpace}. The vector’s direction is expressed in the reference frame of the corresponding ##XrHandJointsLocateInfoEXT{@code ::baseSpace} and is parallel to the rotational axis of the hand joint. The vector’s magnitude is the relative angular speed of the hand joint in radians per second. The vector follows the right-hand rule for torque/rotation.")
}

val XrHandJointLocationsEXT = struct(Module.OPENXR, "XrHandJointLocationsEXT") {
    documentation =
        """
        Returns the hand joint locations.

        <h5>Description</h5>
        The application <b>must</b> allocate the memory for the output array {@code jointLocations} that can contain at least {@code jointCount} of ##XrHandJointLocationEXT.

        The application <b>must</b> set {@code jointCount} as described by the {@code XrHandJointSetEXT} when creating the {@code XrHandTrackerEXT} otherwise the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE.

        The runtime <b>must</b> return {@code jointLocations} representing the range of motion of a human hand, without any obstructions. Input systems that obstruct the movement of the user’s hand (e.g.: a held controller preventing the user from making a fist) or that have only limited ability to track finger positions <b>must</b> use the information available to them to emulate an unobstructed range of motion.

        The runtime <b>must</b> update the {@code jointLocations} array ordered so that the application can index elements using the corresponding hand joint enum (e.g. {@code XrHandJointEXT}) as described by {@code XrHandJointSetEXT} when creating the {@code XrHandTrackerEXT}. For example, when the {@code XrHandTrackerEXT} is created with #HAND_JOINT_SET_DEFAULT_EXT, the application <b>must</b> set the {@code jointCount} to #HAND_JOINT_COUNT_EXT, and the runtime <b>must</b> fill the {@code jointLocations} array ordered so that it may be indexed by the {@code XrHandJointEXT} enum.

        If the returned {@code isActive} is true, the runtime <b>must</b> return all joint locations with both #SPACE_LOCATION_POSITION_VALID_BIT and #SPACE_LOCATION_ORIENTATION_VALID_BIT set. Although, in this case, some joint space locations <b>may</b> be untracked (i.e. #SPACE_LOCATION_POSITION_TRACKED_BIT or #SPACE_LOCATION_ORIENTATION_TRACKED_BIT is unset).

        If the returned {@code isActive} is false, it indicates the hand tracker did not detect the hand input or the application lost input focus. In this case, the runtime <b>must</b> return all {@code jointLocations} with neither #SPACE_LOCATION_POSITION_VALID_BIT nor #SPACE_LOCATION_ORIENTATION_VALID_BIT set.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to using ##XrHandJointLocationsEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_JOINT_LOCATIONS_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrHandJointVelocitiesEXT</li>
            <li>{@code jointLocations} <b>must</b> be a pointer to an array of {@code jointCount} ##XrHandJointLocationEXT structures</li>
            <li>The {@code jointCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandJointLocationEXT, #LocateHandJointsEXT()
        """

    Expression("#TYPE_HAND_JOINT_LOCATIONS_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrHandJointVelocitiesEXT",
        prepend = true
    )..nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain, such as ##XrHandJointVelocitiesEXT.")
    XrBool32("isActive", "an {@code XrBool32} indicating if the hand tracker is actively tracking.")
    AutoSize("jointLocations")..uint32_t("jointCount", "a {@code uint32_t} describing the count of elements in {@code jointLocations} array.")
    XrHandJointLocationEXT.p("jointLocations", "an array of ##XrHandJointLocationEXT receiving the returned hand joint locations.")
}

val XrHandJointVelocitiesEXT = struct(Module.OPENXR, "XrHandJointVelocitiesEXT") {
    documentation =
        """
        Returns the hand joint velocities.

        <h5>Description</h5>
        The application <b>must</b> allocate the memory for the output array {@code jointVelocities} that can contain at least {@code jointCount} of ##XrHandJointVelocityEXT.

        The application <b>must</b> input {@code jointCount} as described by the {@code XrHandJointSetEXT} when creating the {@code XrHandTrackerEXT}. Otherwise, the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE.

        The runtime <b>must</b> update the {@code jointVelocities} array in the order so that the application can index elements using the corresponding hand joint enum (e.g. {@code XrHandJointEXT}) as described by the {@code XrHandJointSetEXT} when creating the {@code XrHandTrackerEXT}. For example, when the {@code XrHandTrackerEXT} is created with #HAND_JOINT_SET_DEFAULT_EXT, the application <b>must</b> set the {@code jointCount} to #HAND_JOINT_COUNT_EXT, and the returned {@code jointVelocities} array <b>must</b> be ordered to be indexed by enum {@code XrHandJointEXT} enum.

        If the returned ##XrHandJointLocationsEXT{@code ::isActive} is false, it indicates the hand tracker did not detect a hand input or the application lost input focus. In this case, the runtime <b>must</b> return all {@code jointVelocities} with neither #SPACE_VELOCITY_LINEAR_VALID_BIT nor #SPACE_VELOCITY_ANGULAR_VALID_BIT set.

        If an ##XrHandJointVelocitiesEXT structure is chained to ##XrHandJointLocationsEXT{@code ::next}, the returned ##XrHandJointLocationsEXT{@code ::isActive} is true, and the velocity is observed or can be calculated by the runtime, the runtime <b>must</b> fill in the linear velocity of each hand joint within the reference frame of {@code baseSpace} and set the #SPACE_VELOCITY_LINEAR_VALID_BIT. Similarly, if an ##XrHandJointVelocitiesEXT structure is chained to ##XrHandJointLocationsEXT{@code ::next}, the returned ##XrHandJointLocationsEXT{@code ::isActive} is true, and the <em>angular velocity</em> is observed or can be calculated by the runtime, the runtime <b>must</b> fill in the angular velocity of each joint within the reference frame of {@code baseSpace} and set the #SPACE_VELOCITY_ANGULAR_VALID_BIT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to using ##XrHandJointVelocitiesEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_JOINT_VELOCITIES_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code jointVelocities} <b>must</b> be a pointer to an array of {@code jointCount} ##XrHandJointVelocityEXT structures</li>
            <li>The {@code jointCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandJointLocationsEXT, ##XrHandJointVelocityEXT
        """

    Expression("#TYPE_HAND_JOINT_VELOCITIES_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("jointVelocities")..uint32_t("jointCount", "a {@code uint32_t} describing the number of elements in {@code jointVelocities} array.")
    XrHandJointVelocityEXT.p("jointVelocities", "an array of ##XrHandJointVelocityEXT receiving the returned hand joint velocities.")
}

val XrSystemHandTrackingMeshPropertiesMSFT = struct(Module.OPENXR, "XrSystemHandTrackingMeshPropertiesMSFT") {
    documentation =
        """
        System property for hand tracking mesh.

        <h5>Description</h5>
        If a runtime returns #FALSE for {@code supportsHandTrackingMesh}, the system does not support hand tracking mesh input, and therefore <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateHandMeshSpaceMSFT() and #UpdateHandMeshMSFT(). The application <b>should</b> avoid using hand mesh functionality when {@code supportsHandTrackingMesh} is #FALSE.

        If a runtime returns #TRUE for {@code supportsHandTrackingMesh}, the system supports hand tracking mesh input. In this case, the runtime <b>must</b> return a positive number for {@code maxHandMeshIndexCount} and {@code maxHandMeshVertexCount}. An application <b>should</b> use {@code maxHandMeshIndexCount} and {@code maxHandMeshVertexCount} to preallocate hand mesh buffers and reuse them in their render loop when calling #UpdateHandMeshMSFT() every frame.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to using ##XrSystemHandTrackingMeshPropertiesMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSystemProperties, #GetSystemProperties()
        """

    Expression("#TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrBool32("supportsHandTrackingMesh", "an {@code XrBool32}, indicating if current system is capable of hand tracking mesh input.")
    uint32_t("maxHandMeshIndexCount", "a {@code uint32_t} returns the maximum count of indices that will be returned from the hand tracker.")
    uint32_t("maxHandMeshVertexCount", "a {@code uint32_t} returns the maximum count of vertices that will be returned from the hand tracker.")
}

val XrHandMeshSpaceCreateInfoMSFT = struct(Module.OPENXR, "XrHandMeshSpaceCreateInfoMSFT") {
    documentation =
        """
        The information to create a hand mesh space.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to using ##XrHandMeshSpaceCreateInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_MESH_SPACE_CREATE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code handPoseType} <b>must</b> be a valid {@code XrHandPoseTypeMSFT} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #CreateHandMeshSpaceMSFT()
        """

    Expression("#TYPE_HAND_MESH_SPACE_CREATE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrHandPoseTypeMSFT("handPoseType", "an {@code XrHandPoseTypeMSFT} used to specify the type of hand this mesh is tracking. Indices and vertices returned from #UpdateHandMeshMSFT() for a hand type will be relative to the corresponding space create with the same hand type.")
    XrPosef("poseInHandMeshSpace", "an ##XrPosef defining the position and orientation of the new space’s origin within the natural reference frame of the hand mesh space.")
}

val XrHandMeshUpdateInfoMSFT = struct(Module.OPENXR, "XrHandMeshUpdateInfoMSFT") {
    documentation =
        """
        The information to update a hand mesh.

        <h5>Description</h5>
        A runtime <b>may</b> not maintain a full history of hand mesh data, therefore the returned ##XrHandMeshMSFT might return data that’s not exactly corresponding to the {@code time} input. If the runtime cannot return any tracking data for the given {@code time} at all, it <b>must</b> set {@code isActive} to #FALSE for the call to #UpdateHandMeshMSFT(). Otherwise, if the runtime returns {@code isActive} as #TRUE, the data in ##XrHandMeshMSFT must be valid to use.

        An application can choose different {@code handPoseType} values to query the hand mesh data. The returned hand mesh <b>must</b> be consistent to the hand joint space location on the same {@code XrHandTrackerEXT} when using the same {@code XrHandPoseTypeMSFT}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to using ##XrHandMeshUpdateInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_MESH_UPDATE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code handPoseType} <b>must</b> be a valid {@code XrHandPoseTypeMSFT} value</li>
        </ul>

        <h5>See Also</h5>
        #UpdateHandMeshMSFT()
        """

    Expression("#TYPE_HAND_MESH_UPDATE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrTime("time", "the {@code XrTime} that describes the time for which the application wishes to query the hand mesh state.")
    XrHandPoseTypeMSFT("handPoseType", "an {@code XrHandPoseTypeMSFT} which describes the type of hand pose of the hand mesh to update.")
}

val XrHandMeshIndexBufferMSFT = struct(Module.OPENXR, "XrHandMeshIndexBufferMSFT") {
    documentation =
        """
        The index buffer of a hand mesh.

        <h5>Description</h5>
        An application <b>should</b> preallocate the indices array using the {@code maxHandMeshIndexCount} in ##XrSystemHandTrackingMeshPropertiesMSFT returned from #GetSystemProperties(). In this way, the application can avoid possible insufficient buffer sizees for each query, and therefore avoid reallocating memory each frame.

        The input {@code indexCapacityInput} <b>must</b> not be 0, and {@code indices} <b>must</b> not be {@code NULL}, or else the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE on calls to the #UpdateHandMeshMSFT() function.

        If the input {@code indexCapacityInput} is not sufficient to contain all output indices, the runtime <b>must</b> return #ERROR_SIZE_INSUFFICIENT on calls to #UpdateHandMeshMSFT(), not change the content in {@code indexBufferKey} and {@code indices}, and return 0 for {@code indexCountOutput}.

        If the input {@code indexCapacityInput} is equal to or larger than the {@code maxHandMeshIndexCount} in ##XrSystemHandTrackingMeshPropertiesMSFT returned from #GetSystemProperties(), the runtime <b>must</b> not return #ERROR_SIZE_INSUFFICIENT error on #UpdateHandMeshMSFT() because of insufficient index buffer size.

        If the input {@code indexBufferKey} is 0, the capacity of indices array is sufficient, and hand mesh tracking is active, the runtime <b>must</b> return the latest non-zero {@code indexBufferKey}, and fill in {@code indexCountOutput} and {@code indices}.

        If the input {@code indexBufferKey} is not 0, the runtime <b>can</b> either return without changing {@code indexCountOutput} or content in {@code indices}, and return #FALSE for {@code indexBufferChanged} indicating the indices are not changed; or return a new non-zero {@code indexBufferKey} and fill in latest data in {@code indexCountOutput} and {@code indices}, and return #TRUE for {@code indexBufferChanged} indicating the indices are updated to a newer version.

        An application <b>can</b> keep the ##XrHandMeshIndexBufferMSFT structure for each frame in a frame loop and use the returned {@code indexBufferKey} to identify different triangle list topology described in {@code indices}. The application can therefore avoid unnecessary processing of indices, such as coping them to GPU memory.

        The runtime <b>must</b> return the same {@code indexBufferKey} for the same {@code XrHandTrackerEXT} at a given time, regardless of the input {@code XrHandPoseTypeMSFT} in ##XrHandMeshUpdateInfoMSFT. This ensures the index buffer has the same mesh topology and allows the application to reason about vertices across different hand pose types. For example, the application <b>can</b> build a procedure to perform UV mapping on vertices of a hand mesh using #HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT, and apply the resultant UV data on vertices to the mesh returned from the same hand tracker using #HAND_POSE_TYPE_TRACKED_MSFT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to using ##XrHandMeshIndexBufferMSFT</li>
            <li>{@code indices} <b>must</b> be a pointer to an array of {@code indexCapacityInput} {@code uint32_t} values</li>
            <li>The {@code indexCapacityInput} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandMeshMSFT, ##XrSystemHandTrackingMeshPropertiesMSFT, #UpdateHandMeshMSFT()
        """

    uint32_t("indexBufferKey", "a {@code uint32_t} serving as the key of the returned index buffer content or 0 to indicate a request to retrieve the latest indices regardless of existing content in {@code indices}.")
    AutoSize("indices")..uint32_t("indexCapacityInput", "a positive {@code uint32_t} describes the capacity of the {@code indices} array.")
    uint32_t("indexCountOutput", "a {@code uint32_t} returned by the runtime with the count of indices written in {@code indices}.")
    uint32_t.p("indices", "an array of indices filled in by the runtime, specifying the indices of the triangles list in the vertex buffer.")
}

val XrHandMeshVertexMSFT = struct(Module.OPENXR, "XrHandMeshVertexMSFT") {
    documentation =
        """
        The vertex of hand mesh.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to using ##XrHandMeshVertexMSFT</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandMeshVertexBufferMSFT, ##XrVector3f, #UpdateHandMeshMSFT()
        """

    XrVector3f("position", "an ##XrVector3f structure representing the position of the vertex in the hand mesh space, measured in meters.")
    XrVector3f("normal", "an ##XrVector3f structure representing the unweighted normal of the triangle surface at the vertex as a unit vector in hand mesh space.")
}

val XrHandMeshVertexBufferMSFT = struct(Module.OPENXR, "XrHandMeshVertexBufferMSFT") {
    documentation =
        """
        The vertex buffer of a hand mesh.

        <h5>Description</h5>
        An application <b>should</b> preallocate the vertices array using the {@code maxHandMeshVertexCount} in ##XrSystemHandTrackingMeshPropertiesMSFT returned from #GetSystemProperties(). In this way, the application can avoid possible insufficient buffer sizes for each query, and therefore avoid reallocating memory each frame.

        The input {@code vertexCapacityInput} <b>must</b> not be 0, and {@code vertices} <b>must</b> not be {@code NULL}, or else the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE on calls to the #UpdateHandMeshMSFT() function.

        If the input {@code vertexCapacityInput} is not sufficient to contain all output vertices, the runtime <b>must</b> return #ERROR_SIZE_INSUFFICIENT on calls to the #UpdateHandMeshMSFT(), do not change content in {@code vertexUpdateTime} and {@code vertices}, and return 0 for {@code vertexCountOutput}.

        If the input {@code vertexCapacityInput} is equal to or larger than the {@code maxHandMeshVertexCount} in ##XrSystemHandTrackingMeshPropertiesMSFT returned from #GetSystemProperties(), the runtime <b>must</b> not return #ERROR_SIZE_INSUFFICIENT on calls to the #UpdateHandMeshMSFT() because of insufficient vertex buffer size.

        If the input {@code vertexUpdateTime} is 0, and the capacity of the vertices array is sufficient, and hand mesh tracking is active, the runtime <b>must</b> return the latest non-zero {@code vertexUpdateTime}, and fill in the {@code vertexCountOutput} and {@code vertices} fields.

        If the input {@code vertexUpdateTime} is not 0, the runtime <b>can</b> either return without changing {@code vertexCountOutput} or the content in {@code vertices}, and return #FALSE for {@code vertexBufferChanged} indicating the vertices are not changed; or return a new non-zero {@code vertexUpdateTime} and fill in latest data in {@code vertexCountOutput} and {@code vertices} and return #TRUE for {@code vertexBufferChanged} indicating the vertices are updated to a newer version.

        An application <b>can</b> keep the ##XrHandMeshVertexBufferMSFT structure for each frame in frame loop and use the returned {@code vertexUpdateTime} to detect the changes of the content in {@code vertices}. The application can therefore avoid unnecessary processing of vertices, such as coping them to GPU memory.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to using ##XrHandMeshVertexBufferMSFT</li>
            <li>{@code vertices} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrHandMeshVertexMSFT structures</li>
            <li>The {@code vertexCapacityInput} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandMeshMSFT, ##XrHandMeshVertexMSFT, ##XrSystemHandTrackingMeshPropertiesMSFT, #UpdateHandMeshMSFT()
        """

    XrTime("vertexUpdateTime", "an {@code XrTime} representing the time when the runtime receives the vertex buffer content or 0 to indicate a request to retrieve latest vertices regardless of existing content in {@code vertices}.")
    AutoSize("vertices")..uint32_t("vertexCapacityInput", "a positive {@code uint32_t} describes the capacity of the {@code vertices} array.")
    uint32_t("vertexCountOutput", "a {@code uint32_t} filled in by the runtime with the count of vertices written in {@code vertices}.")
    XrHandMeshVertexMSFT.p("vertices", "an array of ##XrHandMeshVertexMSFT filled in by the runtime, specifying the vertices of the hand mesh including the position and normal vector in the hand mesh space.")
}

val XrHandMeshMSFT = struct(Module.OPENXR, "XrHandMeshMSFT") {
    documentation =
        """
        The data of a hand mesh.

        <h5>Description</h5>
        When the returned {@code isActive} value is #FALSE, the runtime indicates the hand is not actively tracked, for example, the hand is outside of sensor’s range, or the input focus is taken away from the application. When the runtime returns #FALSE to {@code isActive}, it <b>must</b> set {@code indexBufferChanged} and {@code vertexBufferChanged} to #FALSE, and <b>must</b> not change the content in {@code indexBuffer} or {@code vertexBuffer},

        When the returned {@code isActive} value is #TRUE, the hand tracking mesh represented in {@code indexBuffer} and {@code vertexBuffer} are updated to the latest data of the {@code time} given to the #UpdateHandMeshMSFT() function. The runtime <b>must</b> set {@code indexBufferChanged} and {@code vertexBufferChanged} to reflect whether the index or vertex buffer’s content are changed during the update. In this way, the application can easily avoid unnecessary processing of buffers when there’s no new data.

        The hand mesh is represented in triangle lists and each triangle’s vertices are in clockwise order when looking from outside of the hand. When hand tracking is active, i.e. when {@code isActive} is returned as #TRUE, the returned {@code indexBuffer.indexCountOutput} value <b>must</b> be positive and multiple of 3, and {@code vertexBuffer.vertexCountOutput} value <b>must</b> be equal to or larger than 3.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to using ##XrHandMeshMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_MESH_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code indexBuffer} <b>must</b> be a valid ##XrHandMeshIndexBufferMSFT structure</li>
            <li>{@code vertexBuffer} <b>must</b> be a valid ##XrHandMeshVertexBufferMSFT structure</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandMeshIndexBufferMSFT, ##XrHandMeshVertexBufferMSFT, #UpdateHandMeshMSFT()
        """

    Expression("#TYPE_HAND_MESH_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrBool32("isActive", "an {@code XrBool32} indicating if the current hand tracker is active.")
    XrBool32("indexBufferChanged", "an {@code XrBool32} indicating if the {@code indexBuffer} content was changed during the update.")
    XrBool32("vertexBufferChanged", "an {@code XrBool32} indicating if the {@code vertexBuffer} content was changed during the update.")
    XrHandMeshIndexBufferMSFT("indexBuffer", "an ##XrHandMeshIndexBufferMSFT returns the index buffer of the tracked hand mesh.")
    XrHandMeshVertexBufferMSFT("vertexBuffer", "an ##XrHandMeshVertexBufferMSFT returns the vertex buffer of the tracked hand mesh.")
}

val XrHandPoseTypeInfoMSFT = struct(Module.OPENXR, "XrHandPoseTypeInfoMSFT") {
    documentation =
        """
        Describes what hand pose type for the hand joint tracking.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to using ##XrHandPoseTypeInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_POSE_TYPE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code handPoseType} <b>must</b> be a valid {@code XrHandPoseTypeMSFT} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandTrackerCreateInfoEXT, #CreateHandTrackerEXT()
        """

    Expression("#TYPE_HAND_POSE_TYPE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrHandPoseTypeMSFT("handPoseType", "an {@code XrHandPoseTypeMSFT} that describes the type of hand pose of the hand tracking.")
}

val XrSecondaryViewConfigurationSessionBeginInfoMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationSessionBeginInfoMSFT") {
    documentation =
        """
        Describes an extension structure to #BeginSession() indicating supported view configuration types.

        <h5>Description</h5>
        If there are any duplicated view configuration types in the array of {@code enabledViewConfigurationTypes}, the runtime <b>must</b> return error #ERROR_VALIDATION_FAILURE.

        If there are any primary view configuration types in the array of {@code enabledViewConfigurationTypes}, the runtime <b>must</b> return error #ERROR_VALIDATION_FAILURE.

        If there are any secondary view configuration types not returned by #EnumerateViewConfigurations() in the array of {@code enabledViewConfigurationTypes}, the runtime <b>must</b> return error #ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSecondaryViewConfiguration XR_MSFT_secondary_view_configuration} extension <b>must</b> be enabled prior to using ##XrSecondaryViewConfigurationSessionBeginInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code enabledViewConfigurationTypes} <b>must</b> be a pointer to an array of {@code viewConfigurationCount} valid {@code XrViewConfigurationType} values</li>
            <li>The {@code viewConfigurationCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrSessionBeginInfo
        """

    Expression("#TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("enabledViewConfigurationTypes")..uint32_t("viewConfigurationCount", "the number of elements in {@code enabledViewConfigurationTypes}")
    XrViewConfigurationType.const.p("enabledViewConfigurationTypes", "an array of enabled secondary view configuration types that application supports.")
}

val XrSecondaryViewConfigurationStateMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationStateMSFT") {
    documentation =
        """
        Returns the state of an enabled secondary view configuration.

        <h5>Description</h5>
        When a secondary view configuration becomes active, the application <b>should</b> render its secondary views as soon as possible, by getting their view transforms and FOV using #LocateViews() and then submitting composition layers to #EndFrame() through the ##XrSecondaryViewConfigurationFrameEndInfoMSFT extension structure. When a secondary view configuration changes from inactive to active, the runtime <b>may</b> change ##XrViewConfigurationView of the given view configuration such as the recommended image width or height. An application <b>should</b> query for latest ##XrViewConfigurationView through #EnumerateViewConfigurationViews() function for the secondary view configuration and consider recreating swapchain images if necessary. The runtime <b>must</b> not change the ##XrViewConfigurationView, including recommended image width and height of a secondary view configuration when {@code active} remains true until the secondary view configuration deactivated or the session has ended.

        If necessary, the application <b>can</b> take longer than a frame duration to prepare by calling #EndFrame() without submitting layers for that secondary view configuration until ready. The runtime <b>should</b> delay the underlying scenario managed by the secondary view configuration until the application begins submitting frames with layers for that configuration. The active secondary view configuration composed output is undefined if the application stops submitting frames with layers for a secondary view configuration while {@code active} remains true.

        When the runtime intends to conclude a secondary view configuration, for example when user stops video capture, the runtime makes the view configuration inactive by setting the corresponding {@code active} in the ##XrSecondaryViewConfigurationStateMSFT structure to false.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSecondaryViewConfiguration XR_MSFT_secondary_view_configuration} extension <b>must</b> be enabled prior to using ##XrSecondaryViewConfigurationStateMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrFrameState, ##XrSecondaryViewConfigurationFrameStateMSFT
        """

    Expression("#TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrViewConfigurationType("viewConfigurationType", "an {@code XrViewConfigurationType} that represents the returned state.")
    XrBool32("active", "an {@code XrBool32} returns whether the secondary view configuration is active and displaying frames to users.")
}

val XrSecondaryViewConfigurationFrameStateMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationFrameStateMSFT") {
    documentation =
        """
        Extension structure to xrWaitFrame to return a list of secondary view configuration states.

        <h5>Description</h5>
        The array size {@code viewConfigurationCount} in the ##XrSecondaryViewConfigurationFrameStateMSFT structure <b>must</b> be the same as the array size enabled through ##XrSecondaryViewConfigurationSessionBeginInfoMSFT when calling #BeginSession() earlier, otherwise the runtime <b>must</b> return error #ERROR_VALIDATION_FAILURE.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSecondaryViewConfiguration XR_MSFT_secondary_view_configuration} extension <b>must</b> be enabled prior to using ##XrSecondaryViewConfigurationFrameStateMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_STATE_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code viewConfigurationStates} <b>must</b> be a pointer to an array of {@code viewConfigurationCount} ##XrSecondaryViewConfigurationStateMSFT structures</li>
            <li>The {@code viewConfigurationCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrFrameState, ##XrSecondaryViewConfigurationStateMSFT
        """

    Expression("#TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_STATE_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("viewConfigurationStates")..uint32_t("viewConfigurationCount", "the number of elements in {@code viewConfigurationStates}.")
    XrSecondaryViewConfigurationStateMSFT.p("viewConfigurationStates", "an array of ##XrSecondaryViewConfigurationStateMSFT structures.")
}

val XrSecondaryViewConfigurationLayerInfoMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationLayerInfoMSFT") {
    documentation =
        """
        Describe an array of composition layers to be submitted to given {@code XrViewConfigurationType}.

        <h5>Description</h5>
        This structure is similar to the ##XrFrameEndInfo structure, with an extra {@code XrViewConfigurationType} field to specify the view configuration for which the submitted layers will be rendered.

        The application <b>should</b> render its content for both the primary and secondary view configurations using the same {@code predictedDisplayTime} reported by #WaitFrame(). The runtime <b>must</b> treat both the primary views and secondary views as being submitted for the same {@code displayTime} specified in the call to #EndFrame().

        For layers such as quad layers whose content is identical across view configurations, the application <b>can</b> submit the same ##XrCompositionLayerBaseHeader structures to multiple view configurations in the same #EndFrame() function call.

        For each frame, the application <b>should</b> only render and submit layers for the secondary view configurations that were active that frame, as indicated in the ##XrSecondaryViewConfigurationFrameStateMSFT filled in for that frame’s #WaitFrame() call. The runtime <b>must</b> ignore composition layers submitted for an inactive view configuration.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSecondaryViewConfiguration XR_MSFT_secondary_view_configuration} extension <b>must</b> be enabled prior to using ##XrSecondaryViewConfigurationLayerInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SECONDARY_VIEW_CONFIGURATION_LAYER_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
            <li>{@code environmentBlendMode} <b>must</b> be a valid {@code XrEnvironmentBlendMode} value</li>
            <li>{@code layers} <b>must</b> be a pointer to an array of {@code layerCount} valid ##XrCompositionLayerBaseHeader-based structures. See also: ##XrCompositionLayerCubeKHR, ##XrCompositionLayerCylinderKHR, ##XrCompositionLayerEquirect2KHR, ##XrCompositionLayerEquirectKHR, ##XrCompositionLayerProjection, ##XrCompositionLayerQuad</li>
            <li>The {@code layerCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader, ##XrSecondaryViewConfigurationFrameEndInfoMSFT, #EndFrame()
        """

    Expression("#TYPE_SECONDARY_VIEW_CONFIGURATION_LAYER_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrViewConfigurationType("viewConfigurationType", "{@code XrViewConfigurationType} to which the composition layers will be displayed.")
    XrEnvironmentBlendMode("environmentBlendMode", "the {@code XrEnvironmentBlendMode} value representing the desired <a target=\"_blank\" href=\"https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\\#environment_blend_mode\">environment blend mode</a> for this view configuration.")
    AutoSize("layers")..uint32_t("layerCount", "the number of composition layers in this frame for the secondary view configuration type. The maximum supported layer count is identified by ##XrSystemGraphicsProperties::maxLayerCount. If layerCount is greater than the maximum supported layer count then #ERROR_LAYER_LIMIT_EXCEEDED is returned. The runtime <b>must</b> support at least #MIN_COMPOSITION_LAYERS_SUPPORTED layers.")
    XrCompositionLayerBaseHeader.const.p.const.p("layers", "a pointer to an array of ##XrCompositionLayerBaseHeader pointers.")
}

val XrSecondaryViewConfigurationFrameEndInfoMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationFrameEndInfoMSFT") {
    documentation =
        """
        Submit an array of ##XrSecondaryViewConfigurationLayerInfoMSFT, one for each secondary view configuration.

        <h5>Description</h5>
        The view configuration type in each ##XrSecondaryViewConfigurationLayerInfoMSFT must be one of the view configurations enabled when calling #BeginSession() in ##XrSecondaryViewConfigurationSessionBeginInfoMSFT, or else the runtime <b>must</b> return error #ERROR_SECONDARY_VIEW_CONFIGURATION_TYPE_NOT_ENABLED_MSFT.

        The view configuration type in each ##XrSecondaryViewConfigurationLayerInfoMSFT must not be the primary view configuration in this session, or else the runtime <b>must</b> return error #ERROR_LAYER_INVALID. The primary view configuration layers continue to be submitted through ##XrFrameEndInfo directly.

        If the view configuration is not active, as indicated in ##XrSecondaryViewConfigurationFrameStateMSFT, the composition layers submitted to this view configuration <b>may</b> be ignored by the runtime. Applications <b>should</b> avoid rendering into secondary views when the view configuration is inactive.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSecondaryViewConfiguration XR_MSFT_secondary_view_configuration} extension <b>must</b> be enabled prior to using ##XrSecondaryViewConfigurationFrameEndInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code viewConfigurationLayersInfo} <b>must</b> be a pointer to an array of {@code viewConfigurationCount} valid ##XrSecondaryViewConfigurationLayerInfoMSFT structures</li>
            <li>The {@code viewConfigurationCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrSecondaryViewConfigurationLayerInfoMSFT, #EndFrame()
        """

    Expression("#TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("viewConfigurationLayersInfo")..uint32_t("viewConfigurationCount", "the number of elements in {@code viewConfigurationLayersInfo}.")
    XrSecondaryViewConfigurationLayerInfoMSFT.const.p("viewConfigurationLayersInfo", "an array of ##XrSecondaryViewConfigurationLayerInfoMSFT, containing composition layers to be submitted for the specified active view configuration.")
}

val XrSecondaryViewConfigurationSwapchainCreateInfoMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationSwapchainCreateInfoMSFT") {
    documentation =
        """
        Hint to runtime that the created swapchain image will be used for given secondary view configuration.

        <h5>Description</h5>
        If this structure is not present in the ##XrSwapchainCreateInfo next chain when calling #CreateSwapchain(), the runtime <b>should</b> optimize the created swapchain for the primary view configuration of the session.

        If the application submits a swapchain image created with one view configuration type to a composition layer for another view configuration, the runtime <b>may</b> need to copy the resource across view configurations. However, the runtime <b>must</b> correctly compose the image regardless which view configuration type was hinted when swapchain image was created.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSecondaryViewConfiguration XR_MSFT_secondary_view_configuration} extension <b>must</b> be enabled prior to using ##XrSecondaryViewConfigurationSwapchainCreateInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrSwapchainCreateInfo
        """

    Expression("#TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrViewConfigurationType("viewConfigurationType", "the secondary view configuration type the application is intending to use this swapchain for.")
}

val XrControllerModelKeyStateMSFT = struct(Module.OPENXR, "XrControllerModelKeyStateMSFT") {
    documentation =
        """
        The model key state for a controller.

        <h5>Description</h5>
        The {@code modelKey} value for the session represents a unique controller model that can be retrieved from #LoadControllerModelMSFT() function. Therefore, the application <b>can</b> use {@code modelKey} to cache the returned data from #LoadControllerModelMSFT() for the session.

        A {@code modelKey} value of #NULL_CONTROLLER_MODEL_KEY_MSFT, represents an invalid model key and indicates there is no controller model yet available. The application <b>should</b> keep calling #GetControllerModelKeyMSFT() because the model <b>may</b> become available at a later point.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to using ##XrControllerModelKeyStateMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_CONTROLLER_MODEL_KEY_STATE_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetControllerModelKeyMSFT()
        """

    Expression("#TYPE_CONTROLLER_MODEL_KEY_STATE_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrControllerModelKeyMSFT("modelKey", "the model key corresponding to the controller render model being queried.")
}

val XrControllerModelNodePropertiesMSFT = struct(Module.OPENXR, "XrControllerModelNodePropertiesMSFT") {
    javaImport("static org.lwjgl.openxr.MSFTControllerModel.*")
    documentation =
        """
        Describes the controller model node properties.

        <h5>Description</h5>
        The node can be located in the glTF node hierarchy by finding the node(s) with the matching node name and parent node name. If the {@code parentNodeName} is empty, the matching will be solely based on the {@code nodeName}.

        If there are multiple nodes in the glTF file matches the condition above, the first matching node using depth-first traversal in the glTF scene <b>should</b> be animated and the rest <b>should</b> be ignored.

        The runtime <b>must</b> not return any {@code nodeName} or {@code parentName} that doesn’t match any gltTF nodes in the corresponding controller model.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to using ##XrControllerModelNodePropertiesMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code parentNodeName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to #MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT</li>
            <li>{@code nodeName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to #MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT</li>
        </ul>

        <h5>See Also</h5>
        ##XrControllerModelPropertiesMSFT, #GetControllerModelPropertiesMSFT(), #LoadControllerModelMSFT()
        """

    Expression("#TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    charUTF8("parentNodeName", "the name of the parent node in the provided glTF file. The parent name <b>may</b> be empty if it should not be used to locate this node.")["XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT"]
    charUTF8("nodeName", "the name of this node in the provided glTF file.")["XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT"]
}

val XrControllerModelPropertiesMSFT = struct(Module.OPENXR, "XrControllerModelPropertiesMSFT") {
    documentation =
        """
        Describes the properties of a controller model.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to using ##XrControllerModelPropertiesMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code nodeCapacityInput} is not 0, {@code nodeProperties} <b>must</b> be a pointer to an array of {@code nodeCapacityInput} ##XrControllerModelNodePropertiesMSFT structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrControllerModelNodePropertiesMSFT, #GetControllerModelPropertiesMSFT(), #LoadControllerModelMSFT()
        """

    Expression("#TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("nodeProperties", optional = true)..uint32_t("nodeCapacityInput", "the capacity of the {@code nodeProperties} array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("nodeCountOutput", "filled in by the runtime with the count of elements in {@code nodeProperties} array, or returns the required capacity in the case that {@code nodeCapacityInput} is 0.")
    nullable..XrControllerModelNodePropertiesMSFT.p("nodeProperties", "a pointer to an application-allocated array that will be filled with the ##XrControllerModelNodePropertiesMSFT values. It <b>can</b> be {@code NULL} if {@code nodeCapacityInput} is 0.")
}

val XrControllerModelNodeStateMSFT = struct(Module.OPENXR, "XrControllerModelNodeStateMSFT") {
    documentation =
        """
        Describes the state of a node in a controller model.

        <h5>Description</h5>
        The state is corresponding to the glTF node identified by the {@code nodeName} and {@code nodeParentName} of the node property at the same array index in the {@code nodeProperties} in ##XrControllerModelPropertiesMSFT.

        The {@code nodePose} is based on the user’s interaction on the controller at the latest #SyncActions(), represented as the ##XrPosef of the node in it’s parent node space.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to using ##XrControllerModelNodeStateMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrControllerModelStateMSFT, ##XrPosef, #GetControllerModelStateMSFT()
        """

    Expression("#TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrPosef("nodePose", "an ##XrPosef of the node in its parent node space.")
}

val XrControllerModelStateMSFT = struct(Module.OPENXR, "XrControllerModelStateMSFT") {
    documentation =
        """
        Describes the state of a controller model.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to using ##XrControllerModelStateMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_CONTROLLER_MODEL_STATE_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code nodeCapacityInput} is not 0, {@code nodeStates} <b>must</b> be a pointer to an array of {@code nodeCapacityInput} ##XrControllerModelNodeStateMSFT structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrControllerModelNodeStateMSFT, #GetControllerModelStateMSFT()
        """

    Expression("#TYPE_CONTROLLER_MODEL_STATE_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("nodeStates", optional = true)..uint32_t("nodeCapacityInput", "the capacity of the {@code nodeStates} array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("nodeCountOutput", "filled in by the runtime with the count of elements in {@code nodeStates} array, or returns the required capacity in the case that {@code nodeCapacityInput} is 0.")
    nullable..XrControllerModelNodeStateMSFT.p("nodeStates", "a pointer to an application-allocated array that will be filled with the ##XrControllerModelNodeStateMSFT values. It <b>can</b> be {@code NULL} if {@code sourceCapacityInput} is 0.")
}

val XrViewConfigurationViewFovEPIC = struct(Module.OPENXR, "XrViewConfigurationViewFovEPIC") {
    documentation =
        """
        View Configuration Field-of-View.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EPICViewConfigurationFov XR_EPIC_view_configuration_fov} extension <b>must</b> be enabled prior to using ##XrViewConfigurationViewFovEPIC</li>
            <li>{@code type} <b>must</b> be #TYPE_VIEW_CONFIGURATION_VIEW_FOV_EPIC</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrFovf
        """

    Expression("#TYPE_VIEW_CONFIGURATION_VIEW_FOV_EPIC")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrFovf("recommendedFov", "the recommended field-of-view based on the current user IPD.")
    XrFovf("maxMutableFov", "the maximum field-of-view that the runtime can display.")
}

val XrHolographicWindowAttachmentMSFT = struct(Module.OPENXR, "XrHolographicWindowAttachmentMSFT") {
    documentation =
        """
        The holographic window binding structure which can be passed at session creation.

        <h5>Description</h5>
        When creating a holographic window-backed {@code XrSession}, the application provides a pointer to an ##XrHolographicWindowAttachmentMSFT in the {@code next} chain of the ##XrSessionCreateInfo.

        The session state of a holographic window-backed {@code XrSession} will only reach #SESSION_STATE_VISIBLE when the provided CoreWindow is made visible. If the CoreWindow is for a secondary app view, the application must programmatically request to make the CoreWindow visible (e.g. with {@code ApplicationViewSwitcher.TryShowAsStandaloneAsync} or {@code ApplicationViewSwitcher.SwitchAsync}).

        The app <b>must</b> not call #CreateSession() while the specified CoreWindow thread is blocked, otherwise the call <b>may</b> deadlock.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTHolographicWindowAttachment XR_MSFT_holographic_window_attachment} extension <b>must</b> be enabled prior to using ##XrHolographicWindowAttachmentMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code holographicSpace} <b>must</b> be a pointer to an {@code IUnknown} value</li>
            <li>{@code coreWindow} <b>must</b> be a pointer to an {@code IUnknown} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateSession()
        """

    Expression("#TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    IUnknown.p("holographicSpace", "a pointer to a valid {@code Windows}.Graphics.Holographic.HolographicSpace.")
    IUnknown.p("coreWindow", "a pointer to a valid {@code Windows}.UI.Core.CoreWindow.")
}

val XrCompositionLayerReprojectionInfoMSFT = struct(Module.OPENXR, "XrCompositionLayerReprojectionInfoMSFT") {
    documentation =
        """
        The information to help reprojection of a projection layer.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTCompositionLayerReprojection XR_MSFT_composition_layer_reprojection} extension <b>must</b> be enabled prior to using ##XrCompositionLayerReprojectionInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code reprojectionMode} <b>must</b> be a valid {@code XrReprojectionModeMSFT} value</li>
        </ul>

        When the application chained this structure when calling #EndFrame(), the {@code mode} <b>must</b> be one of the supported {@code XrReprojectionModeMSFT} returned by #EnumerateReprojectionModesMSFT() function for the corresponding {@code XrViewConfigurationType}. Otherwise, the runtime <b>must</b> return error #ERROR_REPROJECTION_MODE_UNSUPPORTED_MSFT on the #EndFrame() function.

        The runtime <b>must</b> only use the given information for the corresponding frame in #EndFrame() function, and it <b>must</b> not affect other frames.

        <h5>See Also</h5>
        ##XrCompositionLayerProjection
        """

    Expression("#TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrReprojectionModeMSFT("reprojectionMode", "an {@code XrReprojectionModeMSFT} enum providing a hint to the reprojection mode to the corresponding projection layer.")
}

val XrCompositionLayerReprojectionPlaneOverrideMSFT = struct(Module.OPENXR, "XrCompositionLayerReprojectionPlaneOverrideMSFT") {
    documentation =
        """
        Describe the parameters to override the reprojection plane.

        <h5>Description</h5>
        A runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if the {@code normal} vector deviates by more than 1% from unit length.

        Adding a reprojection plane override <b>may</b> benefit various reprojection modes including #REPROJECTION_MODE_DEPTH_MSFT, #REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT and #REPROJECTION_MODE_PLANAR_MANUAL_MSFT.

        When application choose #REPROJECTION_MODE_ORIENTATION_ONLY_MSFT mode, the reprojection plane override <b>may</b> be ignored by the runtime.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTCompositionLayerReprojection XR_MSFT_composition_layer_reprojection} extension <b>must</b> be enabled prior to using ##XrCompositionLayerReprojectionPlaneOverrideMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrVector3f
        """

    Expression("#TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrVector3f("position", "describes the position of the focus plane represented in the corresponding ##XrCompositionLayerProjection{@code ::space}.")
    XrVector3f("normal", "a unit vector describes the focus plane normal represented in the corresponding ##XrCompositionLayerProjection{@code ::space}.")
    XrVector3f("velocity", "a velocity of the position in the corresponding ##XrCompositionLayerProjection{@code ::space} measured in meters per second.")
}

val XrSwapchainStateBaseHeaderFB = struct(Module.OPENXR, "XrSwapchainStateBaseHeaderFB") {
    documentation =
        """
        Base header for swapchain update state.

        <h5>Description</h5>
        The ##XrSwapchainStateBaseHeaderFB is a base structure that can be overridden by a specific stext:XrSwapchainState* child structure.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSwapchainUpdateState XR_FB_swapchain_update_state} extension <b>must</b> be enabled prior to using ##XrSwapchainStateBaseHeaderFB</li>
            <li>{@code type} <b>must</b> be one of the following XrStructureType values: #TYPE_SWAPCHAIN_STATE_FOVEATION_FB, #TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB, #TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetSwapchainStateFB(), #UpdateSwapchainFB()
        """

    XrStructureType("type", "the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
}

val XrCompositionLayerSecureContentFB = struct(Module.OPENXR, "XrCompositionLayerSecureContentFB") {
    documentation =
        """
        specifies secure content mode for composition layers.

        <h5>Description</h5>
        ##XrCompositionLayerSecureContentFB contains additional flags to indicate a composition layer contains secure content and must not be written to external outputs.

        If both #COMPOSITION_LAYER_SECURE_CONTENT_EXCLUDE_LAYER_BIT_FB and #COMPOSITION_LAYER_SECURE_CONTENT_REPLACE_LAYER_BIT_FB are set, #COMPOSITION_LAYER_SECURE_CONTENT_EXCLUDE_LAYER_BIT_FB will take precedence.

        To specify the additional flags, you <b>must</b> create a ##XrCompositionLayerSecureContentFB structure and pass it via the ##XrCompositionLayerBaseHeader structure’s {@code next} parameter.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBCompositionLayerSecureContent XR_FB_composition_layer_secure_content} extension <b>must</b> be enabled prior to using ##XrCompositionLayerSecureContentFB</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_SECURE_CONTENT_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code XrCompositionLayerSecureContentFlagBitsFB} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader
        """

    Expression("#TYPE_COMPOSITION_LAYER_SECURE_CONTENT_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrCompositionLayerSecureContentFlagsFB("flags", "a bitmask of {@code XrCompositionLayerSecureContentFlagBitsFB}.")
}

val _XrBindingModificationBaseHeaderKHR = struct(Module.OPENXR, "XrBindingModificationBaseHeaderKHR")
val XrInteractionProfileAnalogThresholdVALVE = struct(Module.OPENXR, "XrInteractionProfileAnalogThresholdVALVE", parentStruct = _XrBindingModificationBaseHeaderKHR) {
    documentation =
        """
        Interaction profile dpad binding.

        <h5>Description</h5>
        Applications can also chain a single ##XrInteractionProfileAnalogThresholdVALVE structure on the next chain of any #SuggestInteractionProfileBindings() call. Runtimes <b>must</b> support this kind of chaining. This method of specifying analog thresholds is deprecated however, and should not be used by any new applications.

        If a threshold struct is present for a given conversion, the runtime <b>must</b> use those thresholds instead of applying its own whenever it is using the binding suggested by the application.

        {@code onThreshold} and {@code offThreshold} permit allow the application to specify that it wants hysteresis to be applied to the threshold operation. If {@code onThreshold} is smaller than {@code offThreshold}, the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE.

        {@code onHaptic} and {@code offHaptic} allow the application to specify that it wants automatic haptic feedback to be generated when the boolean output of the threshold operation changes from false to true or vice versa. If these fields are not NULL, the runtime <b>must</b> trigger a haptic output with the specified characteristics. If the device has multiple haptic outputs, the runtime <b>should</b> use the haptic output that is most appropriate for the specified input path.

        If a suggested binding with {@code action} and {@code binding} is not in the binding list for this interaction profile, the runtime <b>must</b> return #ERROR_PATH_UNSUPPORTED.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VALVEAnalogThreshold XR_VALVE_analog_threshold} extension <b>must</b> be enabled prior to using ##XrInteractionProfileAnalogThresholdVALVE</li>
            <li>{@code type} <b>must</b> be #TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code action} <b>must</b> be a valid {@code XrAction} handle</li>
            <li>If {@code onHaptic} is not {@code NULL}, {@code onHaptic} <b>must</b> be a pointer to a valid ##XrHapticBaseHeader-based structure. See also: ##XrHapticVibration</li>
            <li>If {@code offHaptic} is not {@code NULL}, {@code offHaptic} <b>must</b> be a pointer to a valid ##XrHapticBaseHeader-based structure. See also: ##XrHapticVibration</li>
        </ul>

        <h5>See Also</h5>
        ##XrHapticBaseHeader
        """

    Expression("#TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrAction("action", "the handle of an action in the suggested binding list.")
    XrPath("binding", "the input path used for the specified action in the suggested binding list.")
    float("onThreshold", "the value between 0.0 and 1.0 at which the runtime <b>must</b> consider the binding to be true. The binding must remain true until the input analog value falls below {@code offThreshold}.")
    float("offThreshold", "the value between 0.0 and 1.0 at which the runtime <b>must</b> consider the binding to be false if it was previous true.")
    nullable..XrHapticBaseHeader.const.p("onHaptic", "the haptic output that the runtime <b>must</b> trigger when the binding changes from false to true. If this field is NULL, the runtime <b>must</b> not trigger any haptic output on the threshold. This field <b>can</b> point to any supported sub-type of ##XrHapticBaseHeader.")
    nullable..XrHapticBaseHeader.const.p("offHaptic", "the haptic output that the runtime <b>must</b> trigger when the binding changes from true to false. If this field is NULL, the runtime <b>must</b> not trigger any haptic output on the threshold. This field <b>can</b> point to any supported sub-type of ##XrHapticBaseHeader.")
}

val XrHandJointsMotionRangeInfoEXT = struct(Module.OPENXR, "XrHandJointsMotionRangeInfoEXT") {
    documentation =
        """
        Chains to XrHandJointsLocateInfoEXT to specify final hand tracking grip pose.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTHandJointsMotionRange XR_EXT_hand_joints_motion_range} extension <b>must</b> be enabled prior to using ##XrHandJointsMotionRangeInfoEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code handJointsMotionRange} <b>must</b> be a valid {@code XrHandJointsMotionRangeEXT} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandJointsLocateInfoEXT
        """

    Expression("#TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrHandJointsMotionRangeEXT("handJointsMotionRange", "an {@code XrHandJointsMotionRangeEXT} that defines the hand joint range of motion the application wants.")
}

val XrLoaderInitInfoBaseHeaderKHR = struct(Module.OPENXR, "XrLoaderInitInfoBaseHeaderKHR") {
    documentation =
        """
        Initializes OpenXR loader.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRLoaderInit XR_KHR_loader_init} extension <b>must</b> be enabled prior to using ##XrLoaderInitInfoBaseHeaderKHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #InitializeLoaderKHR()
        """

    XrStructureType("type", "the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
}

val XrVulkanInstanceCreateInfoKHR = struct(Module.OPENXR, "XrVulkanInstanceCreateInfoKHR") {
    javaImport("org.lwjgl.vulkan.*")
    documentation =
        """
        Vulkan Instance Create Info.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension <b>must</b> be enabled prior to using ##XrVulkanInstanceCreateInfoKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_VULKAN_INSTANCE_CREATE_INFO_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code createFlags} <b>must</b> be 0</li>
            <li>{@code pfnGetInstanceProcAddr} <b>must</b> be a valid {@code PFN_vkGetInstanceProcAddr} value</li>
            <li>{@code vulkanCreateInfo} <b>must</b> be a pointer to a valid {@code VkInstanceCreateInfo} value</li>
            <li>If {@code vulkanAllocator} is not {@code NULL}, {@code vulkanAllocator} <b>must</b> be a pointer to a valid {@code VkAllocationCallbacks} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateVulkanInstanceKHR()
        """

    Expression("#TYPE_VULKAN_INSTANCE_CREATE_INFO_KHR")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSystemId("systemId", "an {@code XrSystemId} handle for the system which will be used to create a session.")
    XrVulkanInstanceCreateFlagsKHR("createFlags", "")
    PFN_vkGetInstanceProcAddr("pfnGetInstanceProcAddr", "a function pointer to {@code vkGetInstanceProcAddr} or a compatible entry point.")
    VkInstanceCreateInfo.const.p("vulkanCreateInfo", "the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/man/html/VkInstanceCreateInfo.html\">{@code VkInstanceCreateInfo} as specified by Vulkan</a>.")
    nullable..VkAllocationCallbacks.const.p("vulkanAllocator", "the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/man/html/VkAllocationCallbacks.html\">{@code VkAllocationCallbacks} as specified by Vulkan</a>.")
}

val XrVulkanDeviceCreateInfoKHR = struct(Module.OPENXR, "XrVulkanDeviceCreateInfoKHR") {
    javaImport("org.lwjgl.vulkan.*")
    documentation =
        """
        Vulkan Device Create Info.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension <b>must</b> be enabled prior to using ##XrVulkanDeviceCreateInfoKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_VULKAN_DEVICE_CREATE_INFO_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code createFlags} <b>must</b> be 0</li>
            <li>{@code pfnGetInstanceProcAddr} <b>must</b> be a valid {@code PFN_vkGetInstanceProcAddr} value</li>
            <li>{@code vulkanPhysicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} value</li>
            <li>{@code vulkanCreateInfo} <b>must</b> be a pointer to a valid {@code VkDeviceCreateInfo} value</li>
            <li>If {@code vulkanAllocator} is not {@code NULL}, {@code vulkanAllocator} <b>must</b> be a pointer to a valid {@code VkAllocationCallbacks} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateVulkanDeviceKHR()
        """

    Expression("#TYPE_VULKAN_DEVICE_CREATE_INFO_KHR")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSystemId("systemId", "an {@code XrSystemId} handle for the system which will be used to create a session.")
    XrVulkanDeviceCreateFlagsKHR("createFlags", "")
    PFN_vkGetInstanceProcAddr("pfnGetInstanceProcAddr", "a function pointer to {@code vkGetInstanceProcAddr} or a compatible entry point.")
    VkPhysicalDevice("vulkanPhysicalDevice", "<b>must</b> match #GetVulkanGraphicsDeviceKHR().")
    VkDeviceCreateInfo.const.p("vulkanCreateInfo", "the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/man/html/VkDeviceCreateInfo.html\">{@code VkDeviceCreateInfo} as specified by Vulkan</a>.")
    nullable..VkAllocationCallbacks.const.p("vulkanAllocator", "the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/man/html/VkAllocationCallbacks.html\">{@code VkAllocationCallbacks} as specified by Vulkan</a>.")
}

val XrGraphicsBindingVulkan2KHR = struct(Module.OPENXR, "XrGraphicsBindingVulkan2KHR", alias = XrGraphicsBindingVulkanKHR) {
    javaImport("org.lwjgl.vulkan.*")
    documentation = "See ##XrGraphicsBindingVulkanKHR."

    Expression("#TYPE_GRAPHICS_BINDING_VULKAN_KHR")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    VkInstance("instance", "")
    VkPhysicalDevice("physicalDevice", "")
    VkDevice("device", "")
    uint32_t("queueFamilyIndex", "")
    uint32_t("queueIndex", "")
}

val XrVulkanGraphicsDeviceGetInfoKHR = struct(Module.OPENXR, "XrVulkanGraphicsDeviceGetInfoKHR") {
    javaImport("org.lwjgl.vulkan.*")
    documentation =
        """
        Vulkan Graphics Device Get Info.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension <b>must</b> be enabled prior to using ##XrVulkanGraphicsDeviceGetInfoKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code vulkanInstance} <b>must</b> be a valid {@code VkInstance} value</li>
        </ul>

        <h5>See Also</h5>
        #GetVulkanGraphicsDevice2KHR()
        """

    Expression("#TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSystemId("systemId", "an {@code XrSystemId} handle for the system which will be used to create a session.")
    VkInstance("vulkanInstance", "a valid Vulkan {@code VkInstance}.")
}

val XrSwapchainImageVulkan2KHR = struct(Module.OPENXR, "XrSwapchainImageVulkan2KHR", alias = XrSwapchainImageVulkanKHR) {
    javaImport("org.lwjgl.vulkan.*")
    documentation = "See ##XrSwapchainImageVulkanKHR."

    Expression("#TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR")..XrStructureType("type", "")
    nullable..opaque_p("next", "")
    VkImage("image", "")
}

val XrGraphicsRequirementsVulkan2KHR = struct(Module.OPENXR, "XrGraphicsRequirementsVulkan2KHR", alias = XrGraphicsRequirementsVulkanKHR) {
    documentation = "See ##XrGraphicsRequirementsVulkanKHR."

    Expression("#TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR")..XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrVersion("minApiVersionSupported", "")
    XrVersion("maxApiVersionSupported", "")
}

val XrCompositionLayerEquirect2KHR = struct(Module.OPENXR, "XrCompositionLayerEquirect2KHR", parentStruct = XrCompositionLayerBaseHeader) {
    documentation =
        """
        Equirectangular layer composition info.

        <h5>Description</h5>
        ##XrCompositionLayerEquirect2KHR contains the information needed to render an equirectangular image onto a sphere when calling #EndFrame(). ##XrCompositionLayerEquirect2KHR is an alias type for the base struct ##XrCompositionLayerBaseHeader used in ##XrFrameEndInfo.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRCompositionLayerEquirect2 XR_KHR_composition_layer_equirect2} extension <b>must</b> be enabled prior to using ##XrCompositionLayerEquirect2KHR</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code layerFlags} <b>must</b> be 0 or a valid combination of {@code XrCompositionLayerFlagBits} values</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code eyeVisibility} <b>must</b> be a valid {@code XrEyeVisibility} value</li>
            <li>{@code subImage} <b>must</b> be a valid ##XrSwapchainSubImage structure</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader, ##XrFrameEndInfo, ##XrPosef, ##XrSwapchainSubImage, #EndFrame()
        """

    Expression("#TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrCompositionLayerFlags("layerFlags", "specifies options for the layer.")
    XrSpace("space", "the {@code XrSpace} in which the {@code pose} of the equirect layer is evaluated over time.")
    XrEyeVisibility("eyeVisibility", "")
    XrSwapchainSubImage("subImage", "identifies the image ##XrSwapchainSubImage to use.")
    XrPosef("pose", "an ##XrPosef defining the position and orientation of the center point of the sphere onto which the equirect image data is mapped, relative to the reference frame of the {@code space}.")
    float("radius", "the non-negative radius of the sphere onto which the equirect image data is mapped. Values of zero or floating point positive infinity are treated as an infinite sphere.")
    float("centralHorizontalAngle", "defines the visible horizontal angle of the sphere, based at 0 radians, in the range of <code>[0, 2π]</code>. It grows symmetrically around the 0 radian angle.")
    float("upperVerticalAngle", "defines the upper vertical angle of the visible portion of the sphere, in the range of <code>[-π/2, π/2]</code>.")
    float("lowerVerticalAngle", "defines the lower vertical angle of the visible portion of the sphere, in the range of <code>[-π/2, π/2]</code>.")
}

val XrUuidMSFT = struct(Module.OPENXR, "XrUuidMSFT") {
    documentation =
        """
        Universally Unique Identifier.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrUuidMSFT</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneComponentMSFT, ##XrSceneComponentParentFilterInfoMSFT, ##XrSceneComponentsLocateInfoMSFT, ##XrSerializedSceneFragmentDataGetInfoMSFT
        """

    uint8_t("bytes", "a 128-bit Variant-1 Universally Unique Identifier.")[16]
}

val XrSceneObserverCreateInfoMSFT = struct(Module.OPENXR, "XrSceneObserverCreateInfoMSFT") {
    documentation =
        """
        The information to create a scene observer handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneObserverCreateInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #CreateSceneObserverMSFT()
        """

    Expression("#TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
}

val XrSceneCreateInfoMSFT = struct(Module.OPENXR, "XrSceneCreateInfoMSFT") {
    documentation =
        """
        The information to create a scene handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneCreateInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_CREATE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #CreateSceneMSFT()
        """

    Expression("#TYPE_SCENE_CREATE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
}

val XrSceneSphereBoundMSFT = struct(Module.OPENXR, "XrSceneSphereBoundMSFT") {
    documentation =
        """
        Describe a scene sphere bounds.

        <h5>Description</h5>
        The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if {@code radius} is not a finite positive value.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneSphereBoundMSFT</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneBoundsMSFT, ##XrVector3f
        """

    XrVector3f("center", "an ##XrVector3f representing the center of the sphere bound within the reference frame of the corresponding ##XrSceneBoundsMSFT{@code ::space}.")
    float("radius", "the finite positive radius of the sphere bound.")
}

val XrSceneOrientedBoxBoundMSFT = struct(Module.OPENXR, "XrSceneOrientedBoxBoundMSFT") {
    documentation =
        """
        Describe a scene oriented box bounds.

        <h5>Description</h5>
        The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if any component of {@code extents} is not finite or less than or equal to zero.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneOrientedBoxBoundMSFT</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, ##XrSceneBoundsMSFT, ##XrVector3f
        """

    XrPosef("pose", "an ##XrPosef defining the center position and orientation of the oriented bounding box bound within the reference frame of the corresponding ##XrSceneBoundsMSFT{@code ::space}.")
    XrVector3f("extents", "an ##XrVector3f defining the edge-to-edge length of the box along each dimension with {@code pose} as the center.")
}

val XrSceneFrustumBoundMSFT = struct(Module.OPENXR, "XrSceneFrustumBoundMSFT") {
    documentation =
        """
        Describe a scene frustum bounds.

        <h5>Description</h5>
        The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if {@code farDistance} is less than or equal to zero. The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if the {@code fov} angles are not between between <code>-π/2</code> and <code>π/2</code> exclusively.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneFrustumBoundMSFT</li>
        </ul>

        <h5>See Also</h5>
        ##XrFovf, ##XrPosef, ##XrSceneBoundsMSFT
        """

    XrPosef("pose", "an ##XrPosef defining the position and orientation of the tip of the frustum bound within the reference frame of the corresponding ##XrSceneBoundsMSFT{@code ::space}.")
    XrFovf("fov", "an ##XrFovf for the four sides of the frustum bound where {@code angleLeft} and {@code angleRight} are along the X axis and {@code angleUp} and {@code angleDown} are along the Y axis of the frustum bound space.")
    float("farDistance", "the positive distance of the far plane of the frustum bound along the -Z direction of the frustum bound space.")
}

val XrSceneBoundsMSFT = struct(Module.OPENXR, "XrSceneBoundsMSFT") {
    documentation =
        """
        The scene bounds.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneBoundsMSFT</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>If {@code sphereCount} is not 0, {@code spheres} <b>must</b> be a pointer to an array of {@code sphereCount} ##XrSceneSphereBoundMSFT structures</li>
            <li>If {@code boxCount} is not 0, {@code boxes} <b>must</b> be a pointer to an array of {@code boxCount} ##XrSceneOrientedBoxBoundMSFT structures</li>
            <li>If {@code frustumCount} is not 0, {@code frustums} <b>must</b> be a pointer to an array of {@code frustumCount} ##XrSceneFrustumBoundMSFT structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrNewSceneComputeInfoMSFT, ##XrSceneFrustumBoundMSFT, ##XrSceneOrientedBoxBoundMSFT, ##XrSceneSphereBoundMSFT, #ComputeNewSceneMSFT()
        """

    XrSpace("space", "a handle to the {@code XrSpace} in which the bounds are specified.")
    XrTime("time", "the {@code XrTime} at which the bounds will be evaluated within {@code space}.")
    AutoSize("spheres", optional = true)..uint32_t("sphereCount", "the number of sphere bounds.")
    nullable..XrSceneSphereBoundMSFT.const.p("spheres", "an array of ##XrSceneSphereBoundMSFT.")
    AutoSize("boxes", optional = true)..uint32_t("boxCount", "the number of oriented box bounds.")
    nullable..XrSceneOrientedBoxBoundMSFT.const.p("boxes", "an array of ##XrSceneOrientedBoxBoundMSFT.")
    AutoSize("frustums", optional = true)..uint32_t("frustumCount", "the number of frustum bounds.")
    nullable..XrSceneFrustumBoundMSFT.const.p("frustums", "an array of ##XrSceneFrustumBoundMSFT.")
}

val XrNewSceneComputeInfoMSFT = struct(Module.OPENXR, "XrNewSceneComputeInfoMSFT") {
    documentation =
        """
        The information to compute a new scene.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrNewSceneComputeInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_NEW_SCENE_COMPUTE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrVisualMeshComputeLodInfoMSFT</li>
            <li>{@code requestedFeatures} <b>must</b> be a pointer to an array of {@code requestedFeatureCount} valid {@code XrSceneComputeFeatureMSFT} values</li>
            <li>{@code consistency} <b>must</b> be a valid {@code XrSceneComputeConsistencyMSFT} value</li>
            <li>{@code bounds} <b>must</b> be a valid ##XrSceneBoundsMSFT structure</li>
            <li>The {@code requestedFeatureCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneBoundsMSFT, #ComputeNewSceneMSFT()
        """

    Expression("#TYPE_NEW_SCENE_COMPUTE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrVisualMeshComputeLodInfoMSFT",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("requestedFeatures")..uint32_t("requestedFeatureCount", "the number of features.")
    XrSceneComputeFeatureMSFT.const.p("requestedFeatures", "an array of {@code XrSceneComputeFeatureMSFT}.")
    XrSceneComputeConsistencyMSFT("consistency", "indicates the requested {@code XrSceneComputeConsistencyMSFT}, trading off speed against the quality of the resulting scene.")
    XrSceneBoundsMSFT("bounds", "an ##XrSceneBoundsMSFT representing the culling volume. Scene components entirely outside this volume <b>should</b> culled.")
}

val XrVisualMeshComputeLodInfoMSFT = struct(Module.OPENXR, "XrVisualMeshComputeLodInfoMSFT") {
    documentation =
        """
        Visual mesh compute level of detail info.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrVisualMeshComputeLodInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code lod} <b>must</b> be a valid {@code XrMeshComputeLodMSFT} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrNewSceneComputeInfoMSFT, #ComputeNewSceneMSFT()
        """

    Expression("#TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrMeshComputeLodMSFT("lod", "the requested mesh level of detail specified by {@code XrMeshComputeLodMSFT}.")
}

val XrSceneComponentMSFT = struct(Module.OPENXR, "XrSceneComponentMSFT") {
    documentation =
        """
        Scene component.

        <h5>Description</h5>
        The runtime <b>must</b> set {@code parentId} to either zero or a valid ##XrUuidMSFT that corresponds to a scene component of type #SCENE_COMPONENT_TYPE_OBJECT_MSFT that exists in the {@code XrSceneMSFT}.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The parent scene object is intended to allow scene components to be grouped. For example, the scene object for a wall might have multiple scene component children like #SCENE_COMPONENT_TYPE_PLANE_MSFT, #SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT, and #SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT. Those child scene components would be alternative representations of the same wall.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneComponentMSFT</li>
            <li>{@code componentType} <b>must</b> be a valid {@code XrSceneComponentTypeMSFT} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneComponentsMSFT, ##XrUuidMSFT
        """

    XrSceneComponentTypeMSFT("componentType", "the {@code XrSceneComponentTypeMSFT} of the scene component.")
    XrUuidMSFT("id", "the ##XrUuidMSFT of the scene component.")
    XrUuidMSFT("parentId", "the ##XrUuidMSFT of the parent scene object. If the scene component does not have a parent, then {@code parentId} will be equal to zero.")
    XrTime("updateTime", "the {@code XrTime} that this scene component was last updated.")
}

val XrSceneComponentsMSFT = struct(Module.OPENXR, "XrSceneComponentsMSFT") {
    documentation =
        """
        Scene components.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneComponentsMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_COMPONENTS_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrSceneMeshesMSFT, ##XrSceneObjectsMSFT, ##XrScenePlanesMSFT</li>
            <li>If {@code componentCapacityInput} is not 0, {@code components} <b>must</b> be a pointer to an array of {@code componentCapacityInput} ##XrSceneComponentMSFT structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneComponentMSFT, #GetSceneComponentsMSFT()
        """

    Expression("#TYPE_SCENE_COMPONENTS_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrSceneMeshesMSFT", "XrSceneObjectsMSFT", "XrScenePlanesMSFT",
        prepend = true
    )..nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("components", optional = true)..uint32_t("componentCapacityInput", "the capacity of the array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("componentCountOutput", "a pointer to the count of components, or a pointer to the required capacity in the case that {@code componentCapacityInput} is 0.")
    nullable..XrSceneComponentMSFT.p("components", "an array of ##XrSceneComponentMSFT.")
}

val XrSceneComponentsGetInfoMSFT = struct(Module.OPENXR, "XrSceneComponentsGetInfoMSFT") {
    documentation =
        """
        The information to get the scene components.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneComponentsGetInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_COMPONENTS_GET_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrSceneComponentParentFilterInfoMSFT, ##XrSceneObjectTypesFilterInfoMSFT, ##XrScenePlaneAlignmentFilterInfoMSFT</li>
            <li>{@code componentType} <b>must</b> be a valid {@code XrSceneComponentTypeMSFT} value</li>
        </ul>

        <h5>See Also</h5>
        #GetSceneComponentsMSFT()
        """

    Expression("#TYPE_SCENE_COMPONENTS_GET_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrSceneComponentParentFilterInfoMSFT", "XrSceneObjectTypesFilterInfoMSFT", "XrScenePlaneAlignmentFilterInfoMSFT",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrSceneComponentTypeMSFT("componentType", "the scene component type requested.")
}

val XrSceneComponentLocationMSFT = struct(Module.OPENXR, "XrSceneComponentLocationMSFT") {
    documentation =
        """
        Describes the location of a scene component.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneComponentLocationMSFT</li>
            <li>{@code flags} <b>must</b> be 0 or a valid combination of {@code XrSpaceLocationFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, ##XrSceneComponentLocationsMSFT
        """

    XrSpaceLocationFlags("flags", "a bitfield, with bit masks defined in {@code XrSpaceLocationFlagBits}, to indicate which members contain valid data.")
    XrPosef("pose", "an ##XrPosef defining the position and orientation of the scene component within the reference frame of the corresponding ##XrSceneComponentsLocateInfoMSFT{@code ::baseSpace}.")
}

val XrSceneComponentLocationsMSFT = struct(Module.OPENXR, "XrSceneComponentLocationsMSFT") {
    documentation =
        """
        Returns the scene component locations.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneComponentLocationsMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_COMPONENT_LOCATIONS_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code locationCount} is not 0, {@code locations} <b>must</b> be a pointer to an array of {@code locationCount} ##XrSceneComponentLocationMSFT structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneComponentLocationMSFT, #LocateSceneComponentsMSFT()
        """

    Expression("#TYPE_SCENE_COMPONENT_LOCATIONS_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("locations", optional = true)..uint32_t("locationCount", "a {@code uint32_t} describing the count of elements in the {@code locations} array.")
    nullable..XrSceneComponentLocationMSFT.p("locations", "an array of ##XrSceneComponentLocationMSFT scene component locations.")
}

val XrSceneComponentsLocateInfoMSFT = struct(Module.OPENXR, "XrSceneComponentsLocateInfoMSFT") {
    documentation =
        """
        Describes the information to locate scene components.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneComponentsLocateInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>If {@code componentIdCount} is not 0, {@code componentIds} <b>must</b> be a pointer to an array of {@code componentIdCount} ##XrUuidMSFT structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrUuidMSFT, #LocateSceneComponentsMSFT()
        """

    Expression("#TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpace("baseSpace", "an {@code XrSpace} within which the scene components will be located.")
    XrTime("time", "an {@code XrTime} at which to locate the scene components.")
    AutoSize("componentIds", optional = true)..uint32_t("componentIdCount", "a {@code uint32_t} describing the count of elements in the {@code componentIds} array.")
    nullable..XrUuidMSFT.const.p("componentIds", "an array of ##XrUuidMSFT identifiers for the scene components to location.")
}

val XrSceneObjectMSFT = struct(Module.OPENXR, "XrSceneObjectMSFT") {
    documentation =
        """
        Scene object.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneObjectMSFT</li>
            <li>{@code objectType} <b>must</b> be a valid {@code XrSceneObjectTypeMSFT} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneObjectsMSFT
        """

    XrSceneObjectTypeMSFT("objectType", "the type of the object specified by {@code XrSceneObjectTypeMSFT}.")
}

val XrSceneObjectsMSFT = struct(Module.OPENXR, "XrSceneObjectsMSFT") {
    documentation =
        """
        Scene objects.

        <h5>Description</h5>
        The runtime <b>must</b> only set ##XrSceneObjectMSFT{@code ::objectType} to any of the following {@code XrSceneObjectTypeMSFT} values:

        <ul>
            <li>#SCENE_OBJECT_TYPE_UNCATEGORIZED_MSFT</li>
            <li>#SCENE_OBJECT_TYPE_BACKGROUND_MSFT</li>
            <li>#SCENE_OBJECT_TYPE_WALL_MSFT</li>
            <li>#SCENE_OBJECT_TYPE_FLOOR_MSFT</li>
            <li>#SCENE_OBJECT_TYPE_CEILING_MSFT</li>
            <li>#SCENE_OBJECT_TYPE_PLATFORM_MSFT</li>
            <li>#SCENE_OBJECT_TYPE_INFERRED_MSFT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneObjectsMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_OBJECTS_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code sceneObjectCount} is not 0, {@code sceneObjects} <b>must</b> be a pointer to an array of {@code sceneObjectCount} ##XrSceneObjectMSFT structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneComponentsMSFT, ##XrSceneObjectMSFT
        """

    Expression("#TYPE_SCENE_OBJECTS_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("sceneObjects", optional = true)..uint32_t("sceneObjectCount", "a {@code uint32_t} describing the count of elements in the {@code sceneObjects} array.")
    nullable..XrSceneObjectMSFT.p("sceneObjects", "an array of ##XrSceneObjectMSFT.")
}

val XrSceneComponentParentFilterInfoMSFT = struct(Module.OPENXR, "XrSceneComponentParentFilterInfoMSFT") {
    documentation =
        """
        Scene component parent filter.

        <h5>Description</h5>
        The runtime <b>must</b> return only scene components with matching {@code parentId}. If {@code parentId} is zero then the runtime <b>must</b> return only scene components that do not have a parent.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneComponentParentFilterInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneComponentsGetInfoMSFT, ##XrUuidMSFT
        """

    Expression("#TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrUuidMSFT("parentId", "the ##XrUuidMSFT of the parent scene component to filter by.")
}

val XrSceneObjectTypesFilterInfoMSFT = struct(Module.OPENXR, "XrSceneObjectTypesFilterInfoMSFT") {
    documentation =
        """
        Scene object types filter.

        <h5>Description</h5>
        The runtime <b>must</b> return only scene components that match any of the {@code XrSceneObjectTypeMSFT} in {@code objectTypes}. If a scene component does not have an {@code XrSceneObjectTypeMSFT} then the parent’s {@code XrSceneObjectTypeMSFT} value will be used for the comparison if it exists.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneObjectTypesFilterInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_OBJECT_TYPES_FILTER_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code objectTypeCount} is not 0, {@code objectTypes} <b>must</b> be a pointer to an array of {@code objectTypeCount} valid {@code XrSceneObjectTypeMSFT} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneComponentsGetInfoMSFT
        """

    Expression("#TYPE_SCENE_OBJECT_TYPES_FILTER_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("objectTypes", optional = true)..uint32_t("objectTypeCount", "a {@code uint32_t} describing the count of elements in the {@code objectTypes} array.")
    nullable..XrSceneObjectTypeMSFT.const.p("objectTypes", "an array of {@code XrSceneObjectTypeMSFT} to filter by.")
}

val XrScenePlaneMSFT = struct(Module.OPENXR, "XrScenePlaneMSFT") {
    documentation =
        """
        Scene plane.

        <h5>Description</h5>
        The {@code size} of a plane refers to the plane’s size in the <code>x-y</code> plane of the plane’s coordinate system. A plane with a position of {0,0,0}, rotation of {0,0,0,1} (no rotation), and an extent of {1,1} refers to a 1 meter x 1 meter plane centered at {0,0,0} with its front face normal vector pointing towards the +Z direction in the plane component’s space. For planes with an alignment of #SCENE_PLANE_ALIGNMENT_TYPE_VERTICAL_MSFT, the +Y direction <b>must</b> point up away from the direction of gravity.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        OpenXR uses an X-Y plane with +Z as the plane normal but other APIs may use an X-Z plane with +Y as the plane normal. The X-Y plane can be converted to an X-Z plane by rotating <code>-π/2</code> radians around the +X axis.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrScenePlaneMSFT</li>
            <li>{@code alignment} <b>must</b> be a valid {@code XrScenePlaneAlignmentTypeMSFT} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrExtent2Df, ##XrScenePlanesMSFT
        """

    XrScenePlaneAlignmentTypeMSFT("alignment", "the alignment type of the plane specified by {@code XrScenePlaneAlignmentTypeMSFT}.")
    XrExtent2Df("size", "the 2D size of the plane’s extent, where {@code size}{@code ::width} is the width of the plane along the X axis, and {@code size}{@code ::height} is the height of the plane along the Y axis.")
    uint64_t("meshBufferId", "the {@code uint64_t} identifier that specifies the scene mesh buffer of this plane’s triangle mesh. If {@code meshBufferId} is zero then this plane does not have a mesh. The triangles in a planar mesh are coplanar.")
    XrBool32("supportsIndicesUint16", "#TRUE if the mesh supports reading 16-bit unsigned indices.")
}

val XrScenePlanesMSFT = struct(Module.OPENXR, "XrScenePlanesMSFT") {
    documentation =
        """
        Scene planes.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrScenePlanesMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_PLANES_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code scenePlaneCount} is not 0, {@code scenePlanes} <b>must</b> be a pointer to an array of {@code scenePlaneCount} ##XrScenePlaneMSFT structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneComponentsMSFT, ##XrScenePlaneMSFT
        """

    Expression("#TYPE_SCENE_PLANES_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("scenePlanes", optional = true)..uint32_t("scenePlaneCount", "a {@code uint32_t} describing the count of elements in the ##XrScenePlaneMSFT array.")
    nullable..XrScenePlaneMSFT.p("scenePlanes", "an array of ##XrScenePlaneMSFT.")
}

val XrScenePlaneAlignmentFilterInfoMSFT = struct(Module.OPENXR, "XrScenePlaneAlignmentFilterInfoMSFT") {
    documentation =
        """
        Plane alignment filter.

        <h5>Description</h5>
        The runtime <b>must</b> return only scene components that match one of the {@code XrScenePlaneAlignmentTypeMSFT} values passed in {@code alignments}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrScenePlaneAlignmentFilterInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_PLANE_ALIGNMENT_FILTER_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code alignmentCount} is not 0, {@code alignments} <b>must</b> be a pointer to an array of {@code alignmentCount} valid {@code XrScenePlaneAlignmentTypeMSFT} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneComponentsGetInfoMSFT
        """

    Expression("#TYPE_SCENE_PLANE_ALIGNMENT_FILTER_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("alignments", optional = true)..uint32_t("alignmentCount", "a {@code uint32_t} describing the count of elements in the {@code alignments} array.")
    nullable..XrScenePlaneAlignmentTypeMSFT.const.p("alignments", "an array of {@code XrScenePlaneAlignmentTypeMSFT} to filter by.")
}

val XrSceneMeshMSFT = struct(Module.OPENXR, "XrSceneMeshMSFT") {
    documentation =
        """
        Scene mesh.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneMeshMSFT</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneMeshesMSFT
        """

    uint64_t("meshBufferId", "the {@code uint64_t} identifier that specifies the scene mesh buffer. If {@code meshBufferId} is zero then this scene component does not have mesh data of corresponding {@code XrSceneComponentTypeMSFT} in #GetSceneComponentsMSFT(){@code ::getInfo}.")
    XrBool32("supportsIndicesUint16", "#TRUE if the mesh supports reading 16-bit unsigned indices.")
}

val XrSceneMeshesMSFT = struct(Module.OPENXR, "XrSceneMeshesMSFT") {
    documentation =
        """
        Scene meshes.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneMeshesMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_MESHES_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code sceneMeshCount} is not 0, {@code sceneMeshes} <b>must</b> be a pointer to an array of {@code sceneMeshCount} ##XrSceneMeshMSFT structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneComponentsMSFT, ##XrSceneMeshMSFT
        """

    Expression("#TYPE_SCENE_MESHES_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("sceneMeshes", optional = true)..uint32_t("sceneMeshCount", "a {@code uint32_t} describing the count of elements in the {@code sceneMeshes} array.")
    nullable..XrSceneMeshMSFT.p("sceneMeshes", "an array of ##XrSceneMeshMSFT.")
}

val XrSceneMeshBuffersGetInfoMSFT = struct(Module.OPENXR, "XrSceneMeshBuffersGetInfoMSFT") {
    documentation =
        """
        The information to get the scene mesh buffer data.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneMeshBuffersGetInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetSceneMeshBuffersMSFT()
        """

    Expression("#TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    uint64_t("meshBufferId", "the {@code uint64_t} identifier that specifies the scene mesh buffer to read.")
}

val XrSceneMeshBuffersMSFT = struct(Module.OPENXR, "XrSceneMeshBuffersMSFT") {
    documentation =
        """
        Scene mesh buffers.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneMeshBuffersMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_MESH_BUFFERS_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneMeshIndicesUint16MSFT, ##XrSceneMeshIndicesUint32MSFT, ##XrSceneMeshVertexBufferMSFT, #GetSceneMeshBuffersMSFT()
        """

    Expression("#TYPE_SCENE_MESH_BUFFERS_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
}

val XrSceneMeshVertexBufferMSFT = struct(Module.OPENXR, "XrSceneMeshVertexBufferMSFT") {
    documentation =
        """
        Scene mesh vertex buffer.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneMeshVertexBufferMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code vertexCapacityInput} is not 0, {@code vertices} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector3f structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneMeshBuffersMSFT, ##XrVector3f, #GetSceneMeshBuffersMSFT()
        """

    Expression("#TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput", "the capacity of the array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("vertexCountOutput", "a pointer to the count of vertices, or a pointer to the required capacity in the case that {@code vertexCapacityInput} is 0.")
    nullable..XrVector3f.p("vertices", "an array of ##XrVector3f filled in by the runtime returns the position of vertices in the mesh component’s space.")
}

val XrSceneMeshIndicesUint32MSFT = struct(Module.OPENXR, "XrSceneMeshIndicesUint32MSFT") {
    documentation =
        """
        Scene mesh 32-bit indices.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneMeshIndicesUint32MSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_MESH_INDICES_UINT32_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code indexCapacityInput} is not 0, {@code indices} <b>must</b> be a pointer to an array of {@code indexCapacityInput} {@code uint32_t} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneMeshBuffersMSFT, #GetSceneMeshBuffersMSFT()
        """

    Expression("#TYPE_SCENE_MESH_INDICES_UINT32_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("indices", optional = true)..uint32_t("indexCapacityInput", "the capacity of the array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("indexCountOutput", "a pointer to the count of indices, or a pointer to the required capacity in the case that {@code indexCapacityInput} is 0.")
    nullable..uint32_t.p("indices", "an array of triangle indices filled in by the runtime, specifying the indices of the scene mesh buffer in the vertices array. The triangle indices <b>must</b> be returned in counter-clockwise order and three indices denote one triangle.")
}

val XrSceneMeshIndicesUint16MSFT = struct(Module.OPENXR, "XrSceneMeshIndicesUint16MSFT") {
    documentation =
        """
        Scene mesh 16-bit indices.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using ##XrSceneMeshIndicesUint16MSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_MESH_INDICES_UINT16_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code indexCapacityInput} is not 0, {@code indices} <b>must</b> be a pointer to an array of {@code indexCapacityInput} {@code uint16_t} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneMeshBuffersMSFT, #GetSceneMeshBuffersMSFT()
        """

    Expression("#TYPE_SCENE_MESH_INDICES_UINT16_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("indices", optional = true)..uint32_t("indexCapacityInput", "the capacity of the array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("indexCountOutput", "a pointer to the count of indices, or a pointer to the required capacity in the case that {@code indexCapacityInput} is 0.")
    nullable..uint16_t.p("indices", "an array of triangle indices filled in by the runtime, specifying the indices of the scene mesh buffer in the vertices array. The triangle indices <b>must</b> be returned in counter-clockwise order and three indices denote one triangle.")
}

val XrSerializedSceneFragmentDataGetInfoMSFT = struct(Module.OPENXR, "XrSerializedSceneFragmentDataGetInfoMSFT") {
    documentation =
        """
        The information to get the serialized scene fragment data.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstandingSerialization XR_MSFT_scene_understanding_serialization} extension <b>must</b> be enabled prior to using ##XrSerializedSceneFragmentDataGetInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrUuidMSFT, #GetSerializedSceneFragmentDataMSFT()
        """

    Expression("#TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrUuidMSFT("sceneFragmentId", "the ##XrUuidMSFT of the serialized scene fragment that was previously read from #GetSceneComponentsMSFT() with #SCENE_COMPONENT_TYPE_SERIALIZED_SCENE_FRAGMENT_MSFT.")
}

val XrDeserializeSceneFragmentMSFT = struct(Module.OPENXR, "XrDeserializeSceneFragmentMSFT") {
    documentation =
        """
        Deserialize Scene Fragment.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstandingSerialization XR_MSFT_scene_understanding_serialization} extension <b>must</b> be enabled prior to using ##XrDeserializeSceneFragmentMSFT</li>
            <li>If {@code bufferSize} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferSize} {@code uint8_t} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneDeserializeInfoMSFT
        """

    AutoSize("buffer", optional = true)..uint32_t("bufferSize", "the size of the {@code buffer} array.")
    nullable..uint8_t.const.p("buffer", "an array of {@code uint_8} data for the scene fragment to be deserialized.")
}

val XrSceneDeserializeInfoMSFT = struct(Module.OPENXR, "XrSceneDeserializeInfoMSFT") {
    documentation =
        """
        The information to deserialize a binary scene.

        <h5>Description</h5>
        If the scene fragments are not in the same order as returned by #GetSceneComponentsMSFT() or the runtime failed to deserialized the binary data then #GetSceneComputeStateMSFT() <b>must</b> return #SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstandingSerialization XR_MSFT_scene_understanding_serialization} extension <b>must</b> be enabled prior to using ##XrSceneDeserializeInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_DESERIALIZE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code fragmentCount} is not 0, {@code fragments} <b>must</b> be a pointer to an array of {@code fragmentCount} valid ##XrDeserializeSceneFragmentMSFT structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrDeserializeSceneFragmentMSFT, #DeserializeSceneMSFT()
        """

    Expression("#TYPE_SCENE_DESERIALIZE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("fragments", optional = true)..uint32_t("fragmentCount", "the count of ##XrDeserializeSceneFragmentMSFT structures in the {@code fragments} array.")
    nullable..XrDeserializeSceneFragmentMSFT.const.p("fragments", "an array of ##XrDeserializeSceneFragmentMSFT.")
}

val XrEventDataDisplayRefreshRateChangedFB = struct(Module.OPENXR, "XrEventDataDisplayRefreshRateChangedFB", parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Event representing display refresh rate change.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBDisplayRefreshRate XR_FB_display_refresh_rate} extension <b>must</b> be enabled prior to using ##XrEventDataDisplayRefreshRateChangedFB</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetDisplayRefreshRateFB()
        """

    Expression("#TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    float("fromDisplayRefreshRate", "the previous display refresh rate.")
    float("toDisplayRefreshRate", "the new display refresh rate.")
}

val XrViveTrackerPathsHTCX = struct(Module.OPENXR, "XrViveTrackerPathsHTCX", mutable = false) {
    documentation =
        """
        Struct contains two paths of VIVE tracker.

        <h5>Description</h5>
        The ##XrViveTrackerPathsHTCX structure contains two paths of VIVE tracker.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCXViveTrackerInteraction XR_HTCX_vive_tracker_interaction} extension <b>must</b> be enabled prior to using ##XrViveTrackerPathsHTCX</li>
            <li>{@code type} <b>must</b> be #TYPE_VIVE_TRACKER_PATHS_HTCX</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrEventDataViveTrackerConnectedHTCX, #EnumerateViveTrackerPathsHTCX()
        """

    Expression("#TYPE_VIVE_TRACKER_PATHS_HTCX")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrPath("persistentPath", "the unique path of the VIVE tracker which is persistent over the lifetime of the hardware.")
    XrPath("rolePath", "the path of the VIVE tracker role. This <b>may</b> be #NULL_PATH if the role is not assigned.")
}

val XrEventDataViveTrackerConnectedHTCX = struct(Module.OPENXR, "XrEventDataViveTrackerConnectedHTCX", parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Event representing a new VIVE tracker connected.

        <h5>Description</h5>
        Receiving the ##XrEventDataViveTrackerConnectedHTCX event structure indicates that a new VIVE tracker was connected or its role changed. It is received via #PollEvent().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCXViveTrackerInteraction XR_HTCX_vive_tracker_interaction} extension <b>must</b> be enabled prior to using ##XrEventDataViveTrackerConnectedHTCX</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code paths} <b>must</b> be a pointer to an ##XrViveTrackerPathsHTCX structure</li>
        </ul>

        <h5>See Also</h5>
        ##XrViveTrackerPathsHTCX, #PollEvent()
        """

    Expression("#TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrViveTrackerPathsHTCX.p("paths", "contains two paths of the connected VIVE tracker.")
}

val XrSystemFacialTrackingPropertiesHTC = struct(Module.OPENXR, "XrSystemFacialTrackingPropertiesHTC") {
    documentation =
        """
        System property for facial tracking.

        <h5>Description</h5>
        An application <b>can</b> inspect whether the system is capable of two of the facial tracking by extending the ##XrSystemProperties with ##XrSystemFacialTrackingPropertiesHTC structure when calling #GetSystemProperties().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCFacialTracking XR_HTC_facial_tracking} extension <b>must</b> be enabled prior to using ##XrSystemFacialTrackingPropertiesHTC</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        If a runtime returns #FALSE for {@code supportEyeFacialTracking}, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateFacialTrackerHTC() with #FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC set for {@code XrFacialTrackingTypeHTC} in ##XrFacialTrackerCreateInfoHTC. Similarly, if a runtime returns #FALSE for {@code supportLipFacialTracking} the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateFacialTrackerHTC() with #FACIAL_TRACKING_TYPE_LIP_DEFAULT_HTC set for {@code XrFacialTrackingTypeHTC} in ##XrFacialTrackerCreateInfoHTC.
        """

    Expression("#TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrBool32("supportEyeFacialTracking", "indicates if the current system is capable of generating eye expressions.")
    XrBool32("supportLipFacialTracking", "indicates if the current system is capable of generating lip expressions.")
}

val XrFacialExpressionsHTC = struct(Module.OPENXR, "XrFacialExpressionsHTC") {
    documentation =
        """
        Returns the expression data.

        <h5>Description</h5>
        ##XrFacialExpressionsHTC structure returns data of a lip facial expression or an eye facial expression.

        An application <b>must</b> preallocate the output {@code expressionWeightings} array that can contain at least {@code expressionCount} of {@code float}. {@code expressionCount} <b>must</b> be at least #FACIAL_EXPRESSION_LIP_COUNT_HTC for #FACIAL_TRACKING_TYPE_LIP_DEFAULT_HTC, and at least #FACIAL_EXPRESSION_EYE_COUNT_HTC for #FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC.

        The application <b>must</b> set {@code expressionCount} as described by the {@code XrFacialTrackingTypeHTC} when creating the {@code XrFacialTrackerHTC} otherwise the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE.

        The runtime <b>must</b> update the {@code expressionWeightings} array ordered so that the application can index elements using the corresponding facial tracker enum (e.g. {@code XrEyeExpressionHTC} or {@code XrLipExpressionHTC}) as described by {@code XrFacialTrackingTypeHTC} when creating the {@code XrFacialTrackerHTC}. For example, when the {@code XrFacialTrackerHTC} is created with {@code facialTrackingType} set to #FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC, the application <b>must</b> set the {@code expressionCount} to #FACIAL_EXPRESSION_EYE_COUNT_HTC, and the runtime <b>must</b> fill the {@code expressionWeightings} array ordered with eye expression data so that it can be indexed by the {@code XrEyeExpressionHTC} enum.

        If the returned {@code isActive} is true, the runtime <b>must</b> fill the {@code expressionWeightings} array ordered.

        If the returned {@code isActive} is false, it indicates the facial tracker did not detect the corresponding facial input or the application lost input focus.

        If the input {@code expressionCount} is not sufficient to contain all output indices, the runtime <b>must</b> return #ERROR_SIZE_INSUFFICIENT on calls to #GetFacialExpressionsHTC() and not change the content in {@code expressionWeightings}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCFacialTracking XR_HTC_facial_tracking} extension <b>must</b> be enabled prior to using ##XrFacialExpressionsHTC</li>
            <li>{@code type} <b>must</b> be #TYPE_FACIAL_EXPRESSIONS_HTC</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code expressionWeightings} <b>must</b> be a pointer to a {@code float} value</li>
        </ul>

        <h5>See Also</h5>
        #GetFacialExpressionsHTC()
        """

    Expression("#TYPE_FACIAL_EXPRESSIONS_HTC")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrBool32("isActive", "an {@code XrBool32} indicating if the facial tracker is active.")
    XrTime("sampleTime", "when in time the expression is expressed.")
    uint32_t("expressionCount", "a {@code uint32_t} describing the count of elements in {@code expressionWeightings} array.")
    float.p("expressionWeightings", "a {@code float} array filled in by the runtime, specifying the weightings for each blend shape.")
}

val XrFacialTrackerCreateInfoHTC = struct(Module.OPENXR, "XrFacialTrackerCreateInfoHTC") {
    documentation =
        """
        Information to create a facial tracker handle.

        <h5>Description</h5>
        The ##XrFacialTrackerCreateInfoHTC structure describes the information to create an {@code XrFacialTrackerHTC} handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCFacialTracking XR_HTC_facial_tracking} extension <b>must</b> be enabled prior to using ##XrFacialTrackerCreateInfoHTC</li>
            <li>{@code type} <b>must</b> be #TYPE_FACIAL_TRACKER_CREATE_INFO_HTC</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code facialTrackingType} <b>must</b> be a valid {@code XrFacialTrackingTypeHTC} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateFacialTrackerHTC()
        """

    Expression("#TYPE_FACIAL_TRACKER_CREATE_INFO_HTC")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrFacialTrackingTypeHTC("facialTrackingType", "an {@code XrFacialTrackingTypeHTC} which describes which type of facial tracking should be used for this handle.")
}

val XrSystemColorSpacePropertiesFB = struct(Module.OPENXR, "XrSystemColorSpacePropertiesFB") {
    documentation =
        """
        System property for color space.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBColorSpace XR_FB_color_space} extension <b>must</b> be enabled prior to using ##XrSystemColorSpacePropertiesFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code colorSpace} <b>must</b> be a valid {@code XrColorSpaceFB} value</li>
        </ul>
        """

    Expression("#TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrColorSpaceFB("colorSpace", "the native color space of the XR device.")
}

val XrVector4sFB = struct(Module.OPENXR, "XrVector4sFB") {
    documentation =
        """
        A four component short integer vector.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code x} is the {@code x} component of the vector.</li>
            <li>{@code y} is the {@code y} component of the vector.</li>
            <li>{@code z} is the {@code z} component of the vector.</li>
            <li>{@code w} is the {@code w} component of the vector.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBHandTrackingMesh XR_FB_hand_tracking_mesh} extension <b>must</b> be enabled prior to using ##XrVector4sFB</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandTrackingMeshFB
        """

    int16_t("x", "")
    int16_t("y", "")
    int16_t("z", "")
    int16_t("w", "")
}

val XrHandTrackingMeshFB = struct(Module.OPENXR, "XrHandTrackingMeshFB") {
    documentation =
        """
        A container of mesh data.

        <h5>Description</h5>
        All arrays are application-allocated, and all <b>may</b> be {@code NULL} if any of {@code jointCapacityInput}, {@code vertexCapacityInput}, or {@code indexCapacityInput} is 0.

        The data in a fully-populated ##XrHandTrackingMeshFB is immutable during the lifetime of the corresponding {@code XrInstance}, and is intended to be retrieved once then used in combination with data changing per-frame retrieved from #LocateHandJointsEXT().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBHandTrackingMesh XR_FB_hand_tracking_mesh} extension <b>must</b> be enabled prior to using ##XrHandTrackingMeshFB</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_TRACKING_MESH_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code jointBindPoses} <b>must</b> be a pointer to an array of {@code jointCapacityInput} ##XrPosef structures</li>
            <li>{@code jointRadii} <b>must</b> be a pointer to an array of {@code jointCapacityInput} {@code float} values</li>
            <li>{@code jointParents} <b>must</b> be a pointer to an array of {@code jointCapacityInput} {@code XrHandJointEXT} values</li>
            <li>{@code vertexPositions} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector3f structures</li>
            <li>{@code vertexNormals} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector3f structures</li>
            <li>{@code vertexUVs} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector2f structures</li>
            <li>{@code vertexBlendIndices} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector4sFB structures</li>
            <li>{@code vertexBlendWeights} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector4f structures</li>
            <li>{@code indices} <b>must</b> be a pointer to an array of {@code indexCapacityInput} {@code int16_t} values</li>
            <li>The {@code jointCapacityInput} parameter <b>must</b> be greater than 0</li>
            <li>The {@code vertexCapacityInput} parameter <b>must</b> be greater than 0</li>
            <li>The {@code indexCapacityInput} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, ##XrVector2f, ##XrVector3f, ##XrVector4f, ##XrVector4sFB, #GetHandMeshFB()
        """

    Expression("#TYPE_HAND_TRACKING_MESH_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("jointBindPoses", "jointRadii", "jointParents")..uint32_t("jointCapacityInput", "the capacity of the joint data arrays in this structure, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("jointCountOutput", "filled in by the runtime with the count of joint data elements written, or the required capacity in the case that any of {@code jointCapacityInput}, {@code vertexCapacityInput}, or {@code indexCapacityInput} is 0.")
    XrPosef.p("jointBindPoses", "an array of poses that matches what is returned by #LocateHandJointsEXT() which describes the hand skeleton’s bind pose.")
    float.p("jointRadii", "an array of joint radii at bind pose.")
    XrHandJointEXT.p("jointParents", "an array of joint parents to define a bone hierarchy for the hand skeleton.")
    AutoSize("vertexPositions", "vertexNormals", "vertexUVs", "vertexBlendIndices", "vertexBlendWeights")..uint32_t("vertexCapacityInput", "the capacity of the vertex data arrays in this structure, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("vertexCountOutput", "filled in by the runtime with the count of vertex data elements written, or the required capacity in the case that any of {@code jointCapacityInput}, {@code vertexCapacityInput}, or {@code indexCapacityInput} is 0.")
    XrVector3f.p("vertexPositions", "an array of 3D vertex positions.")
    XrVector3f.p("vertexNormals", "an array of 3D vertex normals.")
    XrVector2f.p("vertexUVs", "an array of texture coordinates for this vertex.")
    XrVector4sFB.p("vertexBlendIndices", "an array of bone blend indices.")
    XrVector4f.p("vertexBlendWeights", "an array of bone blend weights.")
    AutoSize("indices")..uint32_t("indexCapacityInput", "the capacity of the index data arrays in this structure, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("indexCountOutput", "filled in by the runtime with the count of index data elements written, or the required capacity in the case that any of {@code jointCapacityInput}, {@code vertexCapacityInput}, or {@code indexCapacityInput} is 0.")
    int16_t.p("indices", "an array of triangle indices.")
}

val XrHandTrackingScaleFB = struct(Module.OPENXR, "XrHandTrackingScaleFB") {
    documentation =
        """
        The information to query and modify hand joint overall scale.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBHandTrackingMesh XR_FB_hand_tracking_mesh} extension <b>must</b> be enabled prior to using ##XrHandTrackingScaleFB</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_TRACKING_SCALE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_HAND_TRACKING_SCALE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    float("sensorOutput", "an output value: the currently measured scale as would be applied without passing this structure.")
    float("currentOutput", "an output value: the effective output that the bind skeleton is getting on the current call, which may be subject to filtering, scaling, or validation.")
    XrBool32("overrideHandScale", "indicates whether the runtime should scale the output of this #LocateHandJointsEXT() call according to {@code overrideValueInput}")
    float("overrideValueInput", "an optional input value, enabled only when the {@code overrideHandScale} parameter is set. Setting this to 1.0 and setting {@code overrideHandScale} to {@code true} will give the joints in mesh binding scale.")
}

val XrHandTrackingAimStateFB = struct(Module.OPENXR, "XrHandTrackingAimStateFB", mutable = false) {
    documentation =
        """
        Current aiming gesture state for the hand.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBHandTrackingAim XR_FB_hand_tracking_aim} extension <b>must</b> be enabled prior to using ##XrHandTrackingAimStateFB</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_TRACKING_AIM_STATE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef
        """

    Expression("#TYPE_HAND_TRACKING_AIM_STATE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrHandTrackingAimFlagsFB("status", "a bitmask of {@code XrHandTrackingAimFlagBitsFB} describing the availability and state of other signals.")
    XrPosef("aimPose", "a system-determined \"aim\" pose, similar in intent and convention to the <a target=\"_blank\" href=\"https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\\#aim-pose\">aim poses</a> used with the action system, based on hand data.")
    float("pinchStrengthIndex", "the current pinching strength for the index finger of this hand. Range is 0.0 to 1.0, with 1.0 meaning index and thumb are fully touching.")
    float("pinchStrengthMiddle", "the current pinching strength for the middle finger of this hand. Range is 0.0 to 1.0, with 1.0 meaning middle and thumb are fully touching.")
    float("pinchStrengthRing", "the current pinching strength for the ring finger of this hand. Range is 0.0 to 1.0, with 1.0 meaning ring and thumb are fully touching.")
    float("pinchStrengthLittle", "the current pinching strength for the little finger of this hand. Range is 0.0 to 1.0, with 1.0 meaning little and thumb are fully touching.")
}

val XrHandCapsuleFB = struct(Module.OPENXR, "XrHandCapsuleFB", mutable = false) {
    javaImport("static org.lwjgl.openxr.FBHandTrackingCapsules.*")
    documentation =
        """
        A 3D capsule defined by two points and a radius.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code points} are the two points defining the capsule length.</li>
            <li>{@code radius} is the radius of the capsule.</li>
            <li>{@code joint} is the hand joint that drives this capsule’s transform. Multiple capsules can be attached to the same joint.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBHandTrackingCapsules XR_FB_hand_tracking_capsules} extension <b>must</b> be enabled prior to using ##XrHandCapsuleFB</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandTrackingCapsulesStateFB, ##XrVector3f
        """

    XrVector3f("points", "")["XR_FB_HAND_TRACKING_CAPSULE_POINT_COUNT"]
    float("radius", "")
    XrHandJointEXT("joint", "")
}

val XrHandTrackingCapsulesStateFB = struct(Module.OPENXR, "XrHandTrackingCapsulesStateFB", mutable = false) {
    javaImport("static org.lwjgl.openxr.FBHandTrackingCapsules.*")
    documentation =
        """
        A list of capsules associated to hand joints.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBHandTrackingCapsules XR_FB_hand_tracking_capsules} extension <b>must</b> be enabled prior to using ##XrHandTrackingCapsulesStateFB</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_TRACKING_CAPSULES_STATE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrHandCapsuleFB
        """

    Expression("#TYPE_HAND_TRACKING_CAPSULES_STATE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrHandCapsuleFB("capsules", "an array of capsules.")["XR_FB_HAND_TRACKING_CAPSULE_COUNT"]
}

val XrFoveationProfileCreateInfoFB = struct(Module.OPENXR, "XrFoveationProfileCreateInfoFB") {
    documentation =
        """
        The information to create a foveation profile.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFoveation XR_FB_foveation} extension <b>must</b> be enabled prior to using ##XrFoveationProfileCreateInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_FOVEATION_PROFILE_CREATE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrFoveationLevelProfileCreateInfoFB</li>
        </ul>

        <h5>See Also</h5>
        #CreateFoveationProfileFB()
        """

    Expression("#TYPE_FOVEATION_PROFILE_CREATE_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrFoveationLevelProfileCreateInfoFB",
        prepend = true
    )..nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
}

val XrSwapchainCreateInfoFoveationFB = struct(Module.OPENXR, "XrSwapchainCreateInfoFoveationFB") {
    documentation =
        """
        The information to create a swapchain supporting foveation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFoveation XR_FB_foveation} extension <b>must</b> be enabled prior to using ##XrSwapchainCreateInfoFoveationFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SWAPCHAIN_CREATE_INFO_FOVEATION_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be 0 or a valid combination of {@code XrSwapchainCreateFoveationFlagBitsFB} values</li>
        </ul>
        """

    Expression("#TYPE_SWAPCHAIN_CREATE_INFO_FOVEATION_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSwapchainCreateFoveationFlagsFB("flags", "a bitmask of {@code XrSwapchainCreateFoveationFlagBitsFB} which indicate various characteristics for how foveation is enabled on the swapchain.")
}

val XrSwapchainStateFoveationFB = struct(Module.OPENXR, "XrSwapchainStateFoveationFB", parentStruct = XrSwapchainStateBaseHeaderFB) {
    documentation =
        """
        Foveation swapchain state,xrefs=.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFoveation XR_FB_foveation} extension <b>must</b> be enabled prior to using ##XrSwapchainStateFoveationFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SWAPCHAIN_STATE_FOVEATION_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code profile} <b>must</b> be a valid {@code XrFoveationProfileFB} handle</li>
        </ul>
        """

    Expression("#TYPE_SWAPCHAIN_STATE_FOVEATION_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSwapchainStateFoveationFlagsFB("flags", "a bitmask of {@code XrSwapchainStateFoveationFlagBitsFB} which indicate various characteristics of how and when the foveation properties of the swapchain <b>must</b> be updated.")
    XrFoveationProfileFB("profile", "an {@code XrFoveationProfileFB} defining the desired foveation properties to be applied to the swapchain.")
}

val XrFoveationLevelProfileCreateInfoFB = struct(Module.OPENXR, "XrFoveationLevelProfileCreateInfoFB") {
    documentation =
        """
        The information to create a foveation profile for foveation levels.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFoveationConfiguration XR_FB_foveation_configuration} extension <b>must</b> be enabled prior to using ##XrFoveationLevelProfileCreateInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_FOVEATION_LEVEL_PROFILE_CREATE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code level} <b>must</b> be a valid {@code XrFoveationLevelFB} value</li>
            <li>{@code dynamic} <b>must</b> be a valid {@code XrFoveationDynamicFB} value</li>
        </ul>
        """

    Expression("#TYPE_FOVEATION_LEVEL_PROFILE_CREATE_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrFoveationLevelFB("level", "the maximum desired foveation level.")
    float("verticalOffset", "the desired vertical offset in degrees for the center of the foveation pattern.")
    XrFoveationDynamicFB("dynamic", "the desired dynamic foveation setting.")
}

val XrSystemKeyboardTrackingPropertiesFB = struct(Module.OPENXR, "XrSystemKeyboardTrackingPropertiesFB") {
    documentation =
        """
        Information from the system about tracked keyboard support.

        <h5>Description</h5>
        ##XrSystemKeyboardTrackingPropertiesFB is populated with information from the system about tracked keyboard support.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBKeyboardTracking XR_FB_keyboard_tracking} extension <b>must</b> be enabled prior to using ##XrSystemKeyboardTrackingPropertiesFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSystemProperties
        """

    Expression("#TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrBool32("supportsKeyboardTracking", "defines whether the system supports the tracked keyboard feature.")
}

val XrKeyboardTrackingDescriptionFB = struct(Module.OPENXR, "XrKeyboardTrackingDescriptionFB", mutable = false) {
    javaImport("static org.lwjgl.openxr.FBKeyboardTracking.*")
    documentation =
        """
        Description of a trackable keyboard.

        <h5>Description</h5>
        ##XrKeyboardTrackingDescriptionFB describes a trackable keyboard and its associated metadata.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBKeyboardTracking XR_FB_keyboard_tracking} extension <b>must</b> be enabled prior to using ##XrKeyboardTrackingDescriptionFB</li>
        </ul>

        <h5>See Also</h5>
        ##XrVector3f, #QuerySystemTrackedKeyboardFB()
        """

    uint64_t("trackedKeyboardId", "abstract identifier describing the type of keyboard.")
    XrVector3f("size", "bounding box.")
    XrKeyboardTrackingFlagsFB("flags", "additional information on the type of keyboard available. If #KEYBOARD_TRACKING_EXISTS_BIT_FB is not set there is no keyboard.")
    charUTF8("name", "human readable keyboard identifier.")["XR_MAX_KEYBOARD_TRACKING_NAME_SIZE_FB"]
}

val XrKeyboardSpaceCreateInfoFB = struct(Module.OPENXR, "XrKeyboardSpaceCreateInfoFB") {
    documentation =
        """
        Input data needed by the system to start tracking a keyboard.

        <h5>Description</h5>
        ##XrKeyboardSpaceCreateInfoFB describes a request for the system needed to create a trackable {@code XrSpace} associated with the keyboard.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBKeyboardTracking XR_FB_keyboard_tracking} extension <b>must</b> be enabled prior to using ##XrKeyboardSpaceCreateInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_KEYBOARD_SPACE_CREATE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #CreateKeyboardSpaceFB()
        """

    Expression("#TYPE_KEYBOARD_SPACE_CREATE_INFO_FB")..XrStructureType("type", "")
    nullable..opaque_p("next", "")
    uint64_t("trackedKeyboardId", "abstract identifier describing the type of keyboard to track.")
}

val XrKeyboardTrackingQueryFB = struct(Module.OPENXR, "XrKeyboardTrackingQueryFB") {
    documentation =
        """
        Input data needed to determine which type of tracked keyboard to query for.

        <h5>Description</h5>
        ##XrKeyboardTrackingQueryFB specifies input data needed to determine which type of tracked keyboard to query for.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBKeyboardTracking XR_FB_keyboard_tracking} extension <b>must</b> be enabled prior to using ##XrKeyboardTrackingQueryFB</li>
            <li>{@code type} <b>must</b> be #TYPE_KEYBOARD_TRACKING_QUERY_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code XrKeyboardTrackingQueryFlagBitsFB} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        #QuerySystemTrackedKeyboardFB()
        """

    Expression("#TYPE_KEYBOARD_TRACKING_QUERY_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrKeyboardTrackingQueryFlagsFB("flags", "a bitmask of {@code XrKeyboardTrackingQueryFlagsFB}.")
}

val XrTriangleMeshCreateInfoFB = struct(Module.OPENXR, "XrTriangleMeshCreateInfoFB") {
    documentation =
        """
        The information to create a triangle mesh.

        <h5>Description</h5>
        Mesh buffers can be updated between #TriangleMeshBeginUpdateFB() and #TriangleMeshEndUpdateFB() calls.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to using ##XrTriangleMeshCreateInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_TRIANGLE_MESH_CREATE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code XrTriangleMeshFlagBitsFB} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
            <li>{@code windingOrder} <b>must</b> be a valid {@code XrWindingOrderFB} value</li>
            <li>If {@code vertexBuffer} is not {@code NULL}, {@code vertexBuffer} <b>must</b> be a pointer to a valid ##XrVector3f structure</li>
            <li>If {@code indexBuffer} is not {@code NULL}, {@code indexBuffer} <b>must</b> be a pointer to a valid {@code uint32_t} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrVector3f, #CreateTriangleMeshFB()
        """

    Expression("#TYPE_TRIANGLE_MESH_CREATE_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrTriangleMeshFlagsFB("flags", "a bitmask of {@code XrTriangleMeshFlagBitsFB} that specify behavior.")
    XrWindingOrderFB("windingOrder", "the {@code XrWindingOrderFB} value defining the winding order of the mesh triangles.")
    uint32_t("vertexCount", "the number of vertices in the mesh. In the case of the mutable mesh, the value is treated as the maximum number of vertices the mesh will be able to represent at any time in its lifecycle. The actual number of vertices can vary and is defined when #TriangleMeshEndUpdateFB() is called.")
    nullable..XrVector3f.const.p("vertexBuffer", "a pointer to the vertex data. The size of the array must be {@code vertexCount} elements. When the mesh is mutable ({@code ({@code flags} &amp; #TRIANGLE_MESH_MUTABLE_BIT_FB) != 0}), the {@code vertexBuffer} parameter <b>must</b> be {@code NULL} and mesh data <b>must</b> be populated separately.")
    uint32_t("triangleCount", "the number of triangles in the mesh. In the case of the mutable mesh, the value is treated as the maximum number of triangles the mesh will be able to represent at any time in its lifecycle. The actual number of triangles can vary and is defined when #TriangleMeshEndUpdateFB() is called.")
    nullable..uint32_t.const.p("indexBuffer", "the triangle indices. The size of the array must be {@code triangleCount} elements. When the mesh is mutable ({@code ({@code flags} &amp; #TRIANGLE_MESH_MUTABLE_BIT_FB) != 0}), the {@code indexBuffer} parameter <b>must</b> be {@code NULL} and mesh data <b>must</b> be populated separately.")
}

val XrSystemPassthroughPropertiesFB = struct(Module.OPENXR, "XrSystemPassthroughPropertiesFB") {
    documentation =
        """
        A passthrough system property.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code type} is the {@code XrStructureType} of this structure.</li>
            <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
            <li>{@code supportsPassthrough} defines whether the system supports the passthrough feature.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using ##XrSystemPassthroughPropertiesFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrBool32("supportsPassthrough", "")
}

val XrPassthroughCreateInfoFB = struct(Module.OPENXR, "XrPassthroughCreateInfoFB") {
    documentation =
        """
        A create structure for passthrough.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code type} is the {@code XrStructureType} of this structure.</li>
            <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
            <li>{@code flags} is a bitmask of {@code XrPassthroughFlagBitsFB} that specify additional behavior.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using ##XrPassthroughCreateInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_CREATE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code XrPassthroughFlagBitsFB} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        #CreatePassthroughFB()
        """

    Expression("#TYPE_PASSTHROUGH_CREATE_INFO_FB")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrPassthroughFlagsFB("flags", "")
}

val XrPassthroughLayerCreateInfoFB = struct(Module.OPENXR, "XrPassthroughLayerCreateInfoFB") {
    documentation =
        """
        A create structure for passthrough layers.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code type} is the {@code XrStructureType} of this structure.</li>
            <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
            <li>{@code flags} {@code XrPassthroughFlagsFB} that specify additional behavior.</li>
            <li>{@code purpose} {@code XrPassthroughLayerPurposeFB} that specifies the layer’s purpose.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using ##XrPassthroughLayerCreateInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_LAYER_CREATE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code passthrough} <b>must</b> be a valid {@code XrPassthroughFB} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code XrPassthroughFlagBitsFB} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
            <li>{@code purpose} <b>must</b> be a valid {@code XrPassthroughLayerPurposeFB} value</li>
        </ul>

        <h5>See Also</h5>
        #CreatePassthroughLayerFB()
        """

    Expression("#TYPE_PASSTHROUGH_LAYER_CREATE_INFO_FB")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrPassthroughFB("passthrough", "")
    XrPassthroughFlagsFB("flags", "")
    XrPassthroughLayerPurposeFB("purpose", "")
}

val XrCompositionLayerPassthroughFB = struct(Module.OPENXR, "XrCompositionLayerPassthroughFB") {
    documentation =
        """
        A composition layer for passthrough.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code type} is the {@code XrStructureType} of this structure.</li>
            <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
            <li>{@code flags} is a bitmask of {@code XrCompositionLayerFlagBits} that specify additional behavior.</li>
            <li>{@code space} is the {@code XrSpace} that specifies the layer’s space - <b>must</b> be #NULL_HANDLE.</li>
            <li>{@code layer} is the {@code XrPassthroughLayerFB} that defines this layer’s behavior.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using ##XrCompositionLayerPassthroughFB</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code XrCompositionLayerFlagBits} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code layerHandle} <b>must</b> be a valid {@code XrPassthroughLayerFB} handle</li>
            <li>Both of {@code layerHandle} and {@code space} <b>must</b> have been created, allocated, or retrieved from the same {@code XrSession}</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader
        """

    Expression("#TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrCompositionLayerFlags("flags", "")
    XrSpace("space", "")
    XrPassthroughLayerFB("layerHandle", "")
}

val XrGeometryInstanceCreateInfoFB = struct(Module.OPENXR, "XrGeometryInstanceCreateInfoFB") {
    documentation =
        """
        A create structure for geometry instance.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code type} is the {@code XrStructureType} of this structure.</li>
            <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
            <li>{@code layer} is the {@code XrPassthroughLayerFB}.</li>
            <li>{@code mesh} is the {@code XrTriangleMeshFB}.</li>
            <li>{@code baseSpace} is the {@code XrSpace} that defines the geometry instance’s base space for transformations.</li>
            <li>{@code pose} is the ##XrPosef that defines the geometry instance’s pose.</li>
            <li>{@code scale} is the ##XrVector3f that defines the geometry instance’s scale.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using ##XrGeometryInstanceCreateInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code layer} <b>must</b> be a valid {@code XrPassthroughLayerFB} handle</li>
            <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
            <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>Each of {@code baseSpace}, {@code layer}, and {@code mesh} <b>must</b> have been created, allocated, or retrieved from the same {@code XrSession}</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, ##XrVector3f, #CreateGeometryInstanceFB()
        """

    Expression("#TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrPassthroughLayerFB("layer", "")
    XrTriangleMeshFB("mesh", "")
    XrSpace("baseSpace", "")
    XrPosef("pose", "")
    XrVector3f("scale", "")
}

val XrGeometryInstanceTransformFB = struct(Module.OPENXR, "XrGeometryInstanceTransformFB") {
    documentation =
        """
        A geometry transformation.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code type} is the {@code XrStructureType} of this structure.</li>
            <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
            <li>{@code baseSpace} is the {@code XrSpace} that defines the geometry instance’s base space for transformations.</li>
            <li>{@code time} is the {@code XrTime} that define the time at which the transform is applied.</li>
            <li>{@code pose} is the ##XrPosef that defines the geometry instance’s pose.</li>
            <li>{@code scale} is the ##XrVector3f that defines the geometry instance’s scale.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using ##XrGeometryInstanceTransformFB</li>
            <li>{@code type} <b>must</b> be #TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, ##XrVector3f, #GeometryInstanceSetTransformFB()
        """

    Expression("#TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSpace("baseSpace", "")
    XrTime("time", "")
    XrPosef("pose", "")
    XrVector3f("scale", "")
}

val XrPassthroughStyleFB = struct(Module.OPENXR, "XrPassthroughStyleFB") {
    documentation =
        """
        A layer style.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code type} is the {@code XrStructureType} of this structure.</li>
            <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain, such as ##XrPassthroughColorMapMonoToRgbaFB or ##XrPassthroughColorMapMonoToRgbaFB. The color map structures are mutually exclusive.</li>
            <li>{@code textureOpacityFactor} is the opacity factor in range 0.0 to 1.0.</li>
            <li>{@code edgeColor} is the ##XrColor4f that defines the color of the edge. Setting edge color to ( 0, 0, 0, 0 ) disables edge rendering.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using ##XrPassthroughStyleFB</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_STYLE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrColor4f, #PassthroughLayerSetStyleFB()
        """

    Expression("#TYPE_PASSTHROUGH_STYLE_FB")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    float("textureOpacityFactor", "")
    XrColor4f("edgeColor", "")
}

val XrPassthroughColorMapMonoToRgbaFB = struct(Module.OPENXR, "XrPassthroughColorMapMonoToRgbaFB") {
    javaImport("static org.lwjgl.openxr.FBPassthrough.*")
    documentation =
        """
        A layer color map.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code type} is the {@code XrStructureType} of this structure.</li>
            <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
            <li>{@code textureColorMap} is the array of ##XrColor4f colors that map to intensity values.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using ##XrPassthroughColorMapMonoToRgbaFB</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrColor4f
        """

    Expression("#TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrColor4f("textureColorMap", "")["XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB"]
}

val XrPassthroughColorMapMonoToMonoFB = struct(Module.OPENXR, "XrPassthroughColorMapMonoToMonoFB") {
    javaImport("static org.lwjgl.openxr.FBPassthrough.*")
    documentation =
        """
        A layer color map.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code type} is the {@code XrStructureType} of this structure.</li>
            <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
            <li>{@code textureColorMap} is the array of {@code uint8_t} intensity values that map to original intensity values.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using ##XrPassthroughColorMapMonoToMonoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    uint8_t("textureColorMap", "")["XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB"]
}

val XrEventDataPassthroughStateChangedFB = struct(Module.OPENXR, "XrEventDataPassthroughStateChangedFB") {
    documentation =
        """
        An event for passthrough state changes.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code type} is the {@code XrStructureType} of this structure.</li>
            <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
            <li>{@code flags} {@code XrPassthroughStateChangedFlagsFB} that specify additional behavior.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using ##XrEventDataPassthroughStateChangedFB</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_PASSTHROUGH_STATE_CHANGED_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code XrPassthroughStateChangedFlagBitsFB} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
        </ul>
        """

    Expression("#TYPE_EVENT_DATA_PASSTHROUGH_STATE_CHANGED_FB")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrPassthroughStateChangedFlagsFB("flags", "")
}

val XrRenderModelPathInfoFB = struct(Module.OPENXR, "XrRenderModelPathInfoFB") {
    documentation =
        """
        Supported model paths.

        <h5>Description</h5>
        ##XrRenderModelPathInfoFB contains a model path supported by the device when returned from #EnumerateRenderModelPathsFB(). This path can be used to request information about the render model for the connected device that the path represents using #GetRenderModelPropertiesFB().

        <h5>Possible Render Model Paths</h5>
        <ul>
            <li>
                Controller models with origin at the grip pose.
                <ul>
                    <li>pathname:/model_fb/controller/left</li>
                    <li>pathname:/model_fb/controller/right</li>
                </ul>
            </li>
            <li>
                Keyboard models with origin at the center of its bounding box.
                <ul>
                    <li>pathname:/model_fb/keyboard/local</li>
                    <li>pathname:/model_fb/keyboard/remote</li>
                </ul>
            </li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to using ##XrRenderModelPathInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_RENDER_MODEL_PATH_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #EnumerateRenderModelPathsFB()
        """

    Expression("#TYPE_RENDER_MODEL_PATH_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrPath("path", "a valid {@code XrPath} used for retrieving model properties from #GetRenderModelPropertiesFB().")
}

val XrRenderModelPropertiesFB = struct(Module.OPENXR, "XrRenderModelPropertiesFB") {
    javaImport("static org.lwjgl.openxr.FBRenderModel.*")
    documentation =
        """
        The information about the render model.

        <h5>Description</h5>
        ##XrRenderModelPropertiesFB contains information about the render model for a device. ##XrRenderModelPropertiesFB <b>must</b> be provided when calling #GetRenderModelPropertiesFB(). The {@code XrRenderModelKeyFB} included in the properties is a unique key for each render model that is valid across multiple instances and installs.

        If the application decides to cache or save the render model in any way, {@code modelVersion} can be used to determine if the render model has changed. The application <b>should</b> then update its cached or saved version.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to using ##XrRenderModelPropertiesFB</li>
            <li>{@code type} <b>must</b> be #TYPE_RENDER_MODEL_PROPERTIES_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code modelName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to #MAX_RENDER_MODEL_NAME_SIZE_FB</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>

        <h5>See Also</h5>
        #GetRenderModelPropertiesFB()
        """

    Expression("#TYPE_RENDER_MODEL_PROPERTIES_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    uint32_t("vendorId", "the vendor id of the model.")
    charUTF8("modelName", "the name of the model.")["XR_MAX_RENDER_MODEL_NAME_SIZE_FB"]
    XrRenderModelKeyFB("modelKey", "the unique model key used to load the model in #LoadRenderModelFB().")
    uint32_t("modelVersion", "the version number of the model.")
    XrRenderModelFlagsFB("flags", "a bitmask of {@code XrRenderModelFlagsFB}.")
}

val XrRenderModelBufferFB = struct(Module.OPENXR, "XrRenderModelBufferFB") {
    documentation =
        """
        The buffer containing the data for the render model.

        <h5>Description</h5>
        ##XrRenderModelBufferFB is used when loading the binary data for a render model. ##XrRenderModelBufferFB <b>must</b> be provided when calling #LoadRenderModelFB().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to using ##XrRenderModelBufferFB</li>
            <li>{@code type} <b>must</b> be #TYPE_RENDER_MODEL_BUFFER_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} {@code uint8_t} values</li>
        </ul>

        <h5>See Also</h5>
        #LoadRenderModelFB()
        """

    Expression("#TYPE_RENDER_MODEL_BUFFER_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("buffer", optional = true)..uint32_t("bufferCapacityInput", "the capacity of the {@code buffer}, or 0 to retrieve the required capacity.")
    uint32_t("bufferCountOutput", "the count of {@code uint8_t} {@code buffer} written, or the required capacity in the case that {@code bufferCapacityInput} is 0.")
    nullable..uint8_t.p("buffer", "a pointer to an application-allocated array that will be filled with the render model binary data.")
}

val XrRenderModelLoadInfoFB = struct(Module.OPENXR, "XrRenderModelLoadInfoFB") {
    documentation =
        """
        The information for which render model to load.

        <h5>Description</h5>
        ##XrRenderModelLoadInfoFB is used to provide information about which render model to load. ##XrRenderModelLoadInfoFB <b>must</b> be provided when calling #LoadRenderModelFB().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to using ##XrRenderModelLoadInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_RENDER_MODEL_LOAD_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #LoadRenderModelFB()
        """

    Expression("#TYPE_RENDER_MODEL_LOAD_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrRenderModelKeyFB("modelKey", "the unique model key for a connected device.")
}

val XrSystemRenderModelPropertiesFB = struct(Module.OPENXR, "XrSystemRenderModelPropertiesFB") {
    documentation =
        """
        A render model system property.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code type} is the {@code XrStructureType} of this structure.</li>
            <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
            <li>{@code supportsRenderModelLoading} defines whether the system supports loading render models.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to using ##XrSystemRenderModelPropertiesFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB")..XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrBool32("supportsRenderModelLoading", "")
}

val XrBindingModificationBaseHeaderKHR = struct(Module.OPENXR, "XrBindingModificationBaseHeaderKHR") {
    documentation =
        """
        Base struct for all binding modifications.

        <h5>Description</h5>
        The ##XrBindingModificationBaseHeaderKHR is a base structure is overridden by stext:XrBindingModification* child structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRBindingModification XR_KHR_binding_modification} extension <b>must</b> be enabled prior to using ##XrBindingModificationBaseHeaderKHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrBindingModificationsKHR, #SuggestInteractionProfileBindings()
        """

    XrStructureType("type", "the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or in this extension.")
}

val XrBindingModificationsKHR = struct(Module.OPENXR, "XrBindingModificationsKHR") {
    documentation =
        """
        Suggested bindings with binding modification details.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRBindingModification XR_KHR_binding_modification} extension <b>must</b> be enabled prior to using ##XrBindingModificationsKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_BINDING_MODIFICATIONS_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code bindingModificationCount} is not 0, {@code bindingModifications} <b>must</b> be a pointer to an array of {@code bindingModificationCount} valid ##XrBindingModificationBaseHeaderKHR-based structures. See also: ##XrInteractionProfileAnalogThresholdVALVE</li>
        </ul>

        <h5>See Also</h5>
        ##XrBindingModificationBaseHeaderKHR, #SuggestInteractionProfileBindings()
        """

    Expression("#TYPE_BINDING_MODIFICATIONS_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("bindingModifications", optional = true)..uint32_t("bindingModificationCount", "the number of binding modifications in the array pointed to by {@code bindingModifications}.")
    nullable..XrBindingModificationBaseHeaderKHR.const.p.const.p("bindingModifications", "a pointer to an array of pointers to binding modification structures based on ##XrBindingModificationBaseHeaderKHR, that define all of the application’s suggested binding modifications for the specified interaction profile.")
}

val XrViewLocateFoveatedRenderingVARJO = struct(Module.OPENXR, "XrViewLocateFoveatedRenderingVARJO") {
    documentation =
        """
        Request foveated FoV.

        <h5>Description</h5>
        The runtime <b>must</b> return foveated field of view when {@code foveatedRenderingActive} is #TRUE.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOFoveatedRendering XR_VARJO_foveated_rendering} extension <b>must</b> be enabled prior to using ##XrViewLocateFoveatedRenderingVARJO</li>
            <li>{@code type} <b>must</b> be #TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrViewLocateInfo
        """

    Expression("#TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrBool32("foveatedRenderingActive", "an {@code XrBool32}, indicating if runtime should return foveated FoV.")
}

val XrFoveatedViewConfigurationViewVARJO = struct(Module.OPENXR, "XrFoveatedViewConfigurationViewVARJO") {
    documentation =
        """
        Foveated view configuration views.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOFoveatedRendering XR_VARJO_foveated_rendering} extension <b>must</b> be enabled prior to using ##XrFoveatedViewConfigurationViewVARJO</li>
            <li>{@code type} <b>must</b> be #TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        For example:

        <pre><code>
￿XrInstance instance; // previously populated
￿XrSystemId systemId; // previously populated
￿XrViewConfigurationType viewConfigType; // Select XR_VIEW_CONFIGURATION_TYPE_PRIMARY_QUAD_VARJO
￿
￿XrSystemFoveatedRenderingPropertiesVARJO foveatedRenderingProperties{XR_TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO};
￿XrSystemProperties systemProperties{XR_TYPE_SYSTEM_PROPERTIES, &amp;foveatedRenderingProperties};
￿CHK_XR(xrGetSystemProperties(instance, systemId, &amp;systemProperties));
￿
￿uint32_t viewCount;
￿CHK_XR(xrEnumerateViewConfigurationViews(instance, systemId, viewConfigType, 0, &amp;viewCount, nullptr));
￿// Non-foveated rendering views dimensions
￿std::vector&lt;XrViewConfigurationView&gt; configViews(viewCount, {XR_TYPE_VIEW_CONFIGURATION_VIEW});
￿CHK_XR(xrEnumerateViewConfigurationViews(instance, systemId, viewConfigType, viewCount, &amp;viewCount, configViews.data()));
￿
￿// Foveated rendering views dimensions
￿std::vector&lt;XrViewConfigurationView&gt; foveatedViews;
￿if (foveatedRenderingProperties.supportsFoveatedRendering &amp;&amp; viewConfigType == XR_VIEW_CONFIGURATION_TYPE_PRIMARY_QUAD_VARJO) {
￿  std::vector&lt;XrFoveatedViewConfigurationViewVARJO&gt; requestFoveatedConfig{4, {XR_TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO, nullptr, XR_TRUE}};
￿  foveatedViews = std::vector&lt;XrViewConfigurationView&gt;{4, {XR_TYPE_VIEW_CONFIGURATION_VIEW}};
￿  for (size_t i = 0; i &lt; 4; i++) {
￿    foveatedViews[i].next = &amp;requestFoveatedConfig[i];
￿  }
￿  CHK_XR(xrEnumerateViewConfigurationViews(instance, systemId, viewConfigType, viewCount, &amp;viewCount, foveatedViews.data()));
￿}</code></pre>

        <h5>Note</h5>
        Applications using this extension are encouraged to create 2 sets of swapchains or one big enough set of swapchains and 2 sets of viewports. One set will be used when rendering gaze is not available and other one will be used when foveated rendering and rendering gaze is available. Using foveated textures <b>may</b> not provide optimal visual quality when rendering gaze is not available.

        <h5>See Also</h5>
        ##XrViewConfigurationView
        """

    Expression("#TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrBool32("foveatedRenderingActive", "an {@code XrBool32}, indicating if the runtime should return foveated view configuration view.")
}

val XrSystemFoveatedRenderingPropertiesVARJO = struct(Module.OPENXR, "XrSystemFoveatedRenderingPropertiesVARJO") {
    documentation =
        """
        System property for foveated rendering.

        <h5>Description</h5>
        The runtime <b>should</b> return #TRUE for {@code supportsFoveatedRendering} when rendering gaze is available in the system. An application <b>should</b> avoid using foveated rendering functionality when {@code supportsFoveatedRendering} is #FALSE.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOFoveatedRendering XR_VARJO_foveated_rendering} extension <b>must</b> be enabled prior to using ##XrSystemFoveatedRenderingPropertiesVARJO</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrBool32("supportsFoveatedRendering", "an {@code XrBool32}, indicating if current system is capable of performoning foveated rendering.")
}

val XrCompositionLayerDepthTestVARJO = struct(Module.OPENXR, "XrCompositionLayerDepthTestVARJO") {
    documentation =
        """
        The structure to be passed when submitting layers to enable depth testing.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOCompositionLayerDepthTest XR_VARJO_composition_layer_depth_test} extension <b>must</b> be enabled prior to using ##XrCompositionLayerDepthTestVARJO</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_DEPTH_TEST_VARJO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #EndFrame()
        """

    Expression("#TYPE_COMPOSITION_LAYER_DEPTH_TEST_VARJO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    float("depthTestRangeNearZ", "in a non-negative distance in meters that specifies the lower bound of the range where depth testing should be performed. Must be less than {@code depthTestRangeFarZ}. Value of zero means that there is no lower bound.")
    float("depthTestRangeFarZ", "a positive distance in meters that specifies the upper bound of the range where depth testing should be performed. Must be greater than {@code depthTestRangeNearZ}. Value of floating point positive infinity means that there is no upper bound.")
}

val XrSystemMarkerTrackingPropertiesVARJO = struct(Module.OPENXR, "XrSystemMarkerTrackingPropertiesVARJO") {
    documentation =
        """
        System property for marker tracking.

        <h5>Description</h5>
        An application <b>may</b> inspect whether the system is capable of marker tracking by chaining an ##XrSystemMarkerTrackingPropertiesVARJO structure to the ##XrSystemProperties structure when calling #GetSystemProperties().

        The runtime <b>should</b> return #TRUE for {@code supportsMarkerTracking} when marker tracking is available in the system, otherwise #FALSE. Marker tracking calls <b>must</b> return #ERROR_FEATURE_UNSUPPORTED if marker tracking is not available in the system.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to using ##XrSystemMarkerTrackingPropertiesVARJO</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSystemProperties, #GetSystemProperties()
        """

    Expression("#TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrBool32("supportsMarkerTracking", "an {@code XrBool32}, indicating if current system is capable of performing marker tracking.")
}

val XrEventDataMarkerTrackingUpdateVARJO = struct(Module.OPENXR, "XrEventDataMarkerTrackingUpdateVARJO", parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Structure representing marker tracking information.

        <h5>Description</h5>
        Receiving the ##XrEventDataMarkerTrackingUpdateVARJO event structure indicates that the tracking information has changed. The runtime <b>must</b> not send more than one event per frame per marker. The runtime <b>must</b> send an event if the marker has changed its state (active or inactive). The runtime <b>must</b> send an event if it has detected pose change of the active marker.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to using ##XrEventDataMarkerTrackingUpdateVARJO</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #PollEvent()
        """

    Expression("#TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    uint64_t("markerId", "unique identifier of the marker that has been updated.")
    XrBool32("isActive", "the tracking state of the marker.")
    XrBool32("isPredicted", "")
    XrTime("time", "the time of the marker update.")
}

val XrMarkerSpaceCreateInfoVARJO = struct(Module.OPENXR, "XrMarkerSpaceCreateInfoVARJO") {
    documentation =
        """
        Information to create a space from a spatial anchor.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to using ##XrMarkerSpaceCreateInfoVARJO</li>
            <li>{@code type} <b>must</b> be #TYPE_MARKER_SPACE_CREATE_INFO_VARJO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #CreateMarkerSpaceVARJO()
        """

    Expression("#TYPE_MARKER_SPACE_CREATE_INFO_VARJO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    uint64_t("markerId", "unique identifier of the marker.")
    XrPosef("poseInMarkerSpace", "an ##XrPosef defining the position and orientation of the new space’s origin relative to the marker’s natural origin.")
}

val XrSpatialAnchorPersistenceNameMSFT = struct(Module.OPENXR, "XrSpatialAnchorPersistenceNameMSFT") {
    javaImport("static org.lwjgl.openxr.MSFTSpatialAnchorPersistence.*")
    documentation =
        """
        The name to identify a Spatial anchor persistence operations.

        <h5>Description</h5>
        If an ##XrSpatialAnchorPersistenceNameMSFT with an empty {@code name} value is passed to any function as a parameter, that function <b>must</b> return #ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to using ##XrSpatialAnchorPersistenceNameMSFT</li>
            <li>{@code name} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to #MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT</li>
        </ul>

        <h5>See Also</h5>
        ##XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT, ##XrSpatialAnchorPersistenceInfoMSFT, #ClearSpatialAnchorStoreMSFT(), #EnumeratePersistedSpatialAnchorNamesMSFT(), #UnpersistSpatialAnchorMSFT()
        """

    charUTF8("name", "a null terminated character array of size #MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT.")["XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT"]
}

val XrSpatialAnchorPersistenceInfoMSFT = struct(Module.OPENXR, "XrSpatialAnchorPersistenceInfoMSFT") {
    documentation =
        """
        Persistence info for a spatial anchor.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to using ##XrSpatialAnchorPersistenceInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code spatialAnchorPersistenceName} <b>must</b> be a valid ##XrSpatialAnchorPersistenceNameMSFT structure</li>
            <li>{@code spatialAnchor} <b>must</b> be a valid {@code XrSpatialAnchorMSFT} handle</li>
        </ul>

        <h5>See Also</h5>
        ##XrSpatialAnchorPersistenceNameMSFT, #PersistSpatialAnchorMSFT()
        """

    Expression("#TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrSpatialAnchorPersistenceNameMSFT("spatialAnchorPersistenceName", "an ##XrSpatialAnchorPersistenceNameMSFT containing the name associated with the {@code XrSpatialAnchorMSFT} in the spatial anchor store.")
    XrSpatialAnchorMSFT("spatialAnchor", "the {@code XrSpatialAnchorMSFT} that the application wishes to perform persistence operations on.")
}

val XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT = struct(Module.OPENXR, "XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT") {
    documentation =
        """
        Creation info for creating a spatial anchor handle from a persisted anchor.

        <h5>Description</h5>
        The {@code name} is a character array of maximum size #MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT, which <b>must</b> include a null terminator and <b>must</b> not be empty (i.e. the first element is the null terminator). If an empty {@code name} value is passed to any function as a parameter, that function <b>must</b> return #ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to using ##XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code spatialAnchorStore} <b>must</b> be a valid {@code XrSpatialAnchorStoreConnectionMSFT} handle</li>
            <li>{@code spatialAnchorPersistenceName} <b>must</b> be a valid ##XrSpatialAnchorPersistenceNameMSFT structure</li>
        </ul>

        <h5>See Also</h5>
        ##XrSpatialAnchorPersistenceNameMSFT, #CreateSpatialAnchorFromPersistedNameMSFT()
        """

    Expression("#TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.")
    XrSpatialAnchorStoreConnectionMSFT("spatialAnchorStore", "the {@code XrSpatialAnchorStoreConnectionMSFT} from which the spatial anchor will be loaded from.")
    XrSpatialAnchorPersistenceNameMSFT("spatialAnchorPersistenceName", "the ##XrSpatialAnchorPersistenceNameMSFT associated with the {@code XrSpatialAnchorMSFT} in the spatial anchor store. This name is used to create an {@code XrSpatialAnchorMSFT} handle from a spatial anchor persisted in the spatial anchor store.")
}

val XrSwapchainImageFoveationVulkanFB = struct(Module.OPENXR, "XrSwapchainImageFoveationVulkanFB", mutable = false) {
    javaImport("org.lwjgl.vulkan.*")
    documentation =
        """
        Profile with properties defining a foveation pattern.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFoveationVulkan XR_FB_foveation_vulkan} extension <b>must</b> be enabled prior to using ##XrSwapchainImageFoveationVulkanFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSwapchainImageVulkanKHR, #EnumerateSwapchainImages()
        """

    Expression("#TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    VkImage("image", "a valid Vulkan {@code VkImage} to use.")
    uint32_t("width", "the horizontal width in pixels of the image.")
    uint32_t("height", "the vertical height in pixels of the image.")
}

val XrSwapchainStateSamplerOpenGLESFB = struct(Module.OPENXR, "XrSwapchainStateSamplerOpenGLESFB", parentStruct = XrSwapchainStateBaseHeaderFB) {
    javaImport("org.lwjgl.egl.*")
    documentation =
        """
        OpenGL ES-specific swapchain sampler state structure.

        <h5>Description</h5>
        When ##XrSwapchainStateSamplerOpenGLESFB is specified in the call to #UpdateSwapchainFB(), texture sampler state for all images in the {@code XrSwapchain} will be updated for both the application and compositor processes.

        For most cases, the sampler state update is only required compositor-side, as that is where the swapchain images are sampled. For completeness, the application-side sampler state is additionally updated to support cases where the application may choose to directly sample the swapchain images.

        Applications are expected to handle synchronization of the sampler state update with application-side rendering. Similarly, the compositor will synchronize the sampler state update with rendering of the next compositor frame.

        An {@code EGLContext}, either the {@code EGLContext} bound during {@code XrSwapchain} creation or an {@code EGLContext} in the same share group, is required to be bound on the application calling thread. Current texture bindings may be altered by the call, including the active texture.

        When ##XrSwapchainStateSamplerOpenGLESFB is specified in the call to #GetSwapchainStateFB(), the sampler state will be populated with the current swapchain sampler state.

        To use ##XrSwapchainStateSamplerOpenGLESFB, #USE_GRAPHICS_API_OPENGL_ES must be defined before including {@code openxr_platform.h}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSwapchainUpdateStateOpenGLES XR_FB_swapchain_update_state_opengl_es} extension <b>must</b> be enabled prior to using ##XrSwapchainStateSamplerOpenGLESFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code minFilter} <b>must</b> be a valid {@code EGLenum} value</li>
            <li>{@code magFilter} <b>must</b> be a valid {@code EGLenum} value</li>
            <li>{@code wrapModeS} <b>must</b> be a valid {@code EGLenum} value</li>
            <li>{@code wrapModeT} <b>must</b> be a valid {@code EGLenum} value</li>
            <li>{@code swizzleRed} <b>must</b> be a valid {@code EGLenum} value</li>
            <li>{@code swizzleGreen} <b>must</b> be a valid {@code EGLenum} value</li>
            <li>{@code swizzleBlue} <b>must</b> be a valid {@code EGLenum} value</li>
            <li>{@code swizzleAlpha} <b>must</b> be a valid {@code EGLenum} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrColor4f, #GetSwapchainStateFB(), #UpdateSwapchainFB()
        """

    Expression("#TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    EGLenum("minFilter", "a valid Android OpenGL ES {@code EGLenum}.")
    EGLenum("magFilter", "a valid Android OpenGL ES {@code EGLenum}.")
    EGLenum("wrapModeS", "a valid Android OpenGL ES {@code EGLenum}.")
    EGLenum("wrapModeT", "a valid Android OpenGL ES {@code EGLenum}.")
    EGLenum("swizzleRed", "a valid Android OpenGL ES {@code EGLenum}.")
    EGLenum("swizzleGreen", "a valid Android OpenGL ES {@code EGLenum}.")
    EGLenum("swizzleBlue", "a valid Android OpenGL ES {@code EGLenum}.")
    EGLenum("swizzleAlpha", "a valid Android OpenGL ES {@code EGLenum}.")
    float("maxAnisotropy", "a valid float used to represent max anisotropy.")
    XrColor4f("borderColor", "an RGBA color to be used as border texels.")
}

val XrSwapchainStateSamplerVulkanFB = struct(Module.OPENXR, "XrSwapchainStateSamplerVulkanFB", parentStruct = XrSwapchainStateBaseHeaderFB) {
    javaImport("org.lwjgl.vulkan.*")
    documentation =
        """
        Vulkan-specific swapchain sampler state structure.

        <h5>Description</h5>
        When ##XrSwapchainStateSamplerVulkanFB is specified in the call to #UpdateSwapchainFB(), texture sampler state for all images in the {@code XrSwapchain} will be updated for the compositor process. For most cases, the sampler state update is only required compositor-side, as that is where the swapchain images are sampled. If the application requires sampling of the swapchain images, the application will be responsible for updating the texture state using normal Vulkan mechanisms and synchronizing appropriately with application-side rendering.

        When ##XrSwapchainStateSamplerVulkanFB is specified in the call to #GetSwapchainStateFB(), the sampler state will be populated with the current swapchain sampler state.

        To use ##XrSwapchainStateSamplerVulkanFB, #USE_GRAPHICS_API_VULKAN must be defined before including {@code openxr_platform.h}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSwapchainUpdateStateVulkan XR_FB_swapchain_update_state_vulkan} extension <b>must</b> be enabled prior to using ##XrSwapchainStateSamplerVulkanFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code minFilter} <b>must</b> be a valid {@code VkFilter} value</li>
            <li>{@code magFilter} <b>must</b> be a valid {@code VkFilter} value</li>
            <li>{@code mipmapMode} <b>must</b> be a valid {@code VkSamplerMipmapMode} value</li>
            <li>{@code wrapModeS} <b>must</b> be a valid {@code VkSamplerAddressMode} value</li>
            <li>{@code wrapModeT} <b>must</b> be a valid {@code VkSamplerAddressMode} value</li>
            <li>{@code swizzleRed} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
            <li>{@code swizzleGreen} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
            <li>{@code swizzleBlue} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
            <li>{@code swizzleAlpha} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrColor4f, #GetSwapchainStateFB(), #UpdateSwapchainFB()
        """

    Expression("#TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    VkFilter("minFilter", "a valid Vulkan {@code VkFilter}.")
    VkFilter("magFilter", "a valid Vulkan {@code VkFilter}.")
    VkSamplerMipmapMode("mipmapMode", "a valid Vulkan {@code VkSamplerMipmapMode}.")
    VkSamplerAddressMode("wrapModeS", "a valid Vulkan {@code VkSamplerAddressMode}.")
    VkSamplerAddressMode("wrapModeT", "a valid Vulkan {@code VkSamplerAddressMode}.")
    VkComponentSwizzle("swizzleRed", "a valid Vulkan {@code VkComponentSwizzle}.")
    VkComponentSwizzle("swizzleGreen", "a valid Vulkan {@code VkComponentSwizzle}.")
    VkComponentSwizzle("swizzleBlue", "a valid Vulkan {@code VkComponentSwizzle}.")
    VkComponentSwizzle("swizzleAlpha", "a valid Vulkan {@code VkComponentSwizzle}.")
    float("maxAnisotropy", "a valid float used to represent max anisotropy.")
    XrColor4f("borderColor", "an RGBA color to be used as border texels.")
}

val XrCompositionLayerSpaceWarpInfoFB = struct(Module.OPENXR, "XrCompositionLayerSpaceWarpInfoFB") {
    documentation =
        """
        Composition Layer Space Warp structure.

        <h5>Description</h5>
        The runtime <b>must</b> return error #ERROR_VALIDATION_FAILURE if {@code nearZ} == {@code farZ}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpaceWarp XR_FB_space_warp} extension <b>must</b> be enabled prior to using ##XrCompositionLayerSpaceWarpInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code layerFlags} <b>must</b> be 0</li>
            <li>{@code motionVectorSubImage} <b>must</b> be a valid ##XrSwapchainSubImage structure</li>
            <li>{@code depthSubImage} <b>must</b> be a valid ##XrSwapchainSubImage structure</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader, ##XrCompositionLayerProjection, ##XrCompositionLayerProjectionView, ##XrFrameEndInfo, ##XrPosef, ##XrSwapchainSubImage, #EndFrame()
        """

    Expression("#TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrCompositionLayerSpaceWarpInfoFlagsFB("layerFlags", "a bitmask of {@code XrCompositionLayerSpaceWarpInfoFlagsFB}.")
    XrSwapchainSubImage("motionVectorSubImage", "identifies the motion vector image ##XrSwapchainSubImage to be associated with the submitted layer ##XrCompositionLayerProjection.")
    XrPosef("appSpaceDeltaPose", "the incremental application-applied transform, if any, since the previous frame that affects the view. When artificial locomotion (scripted movement, teleportation, etc.) happens, the application might transform the whole ##XrCompositionLayerProjection::space from one application space pose to another pose between frames. The pose should be identity when there is no ##XrCompositionLayerProjection::space transformation in application.")
    XrSwapchainSubImage("depthSubImage", "identifies the depth image ##XrSwapchainSubImage to be associated with motionVectorSubImage. The swapchain should be created with #SWAPCHAIN_USAGE_SAMPLED_BIT | #SWAPCHAIN_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT.")
    float("minDepth", "{@code minDepth} and {@code maxDepth} are the range of depth values the {@code depthSwapchain} could have, in the range of <code>[0.0,1.0]</code>. This is akin to min and max values of OpenGL’s {@code glDepthRange}, but with the requirement here that <code>maxDepth ≥ minDepth</code>.")
    float("maxDepth", "see {@code minDepth}")
    float("nearZ", "the positive distance in meters of the {@code minDepth} value in the depth swapchain. Applications <b>may</b> use a {@code nearZ} that is greater than {@code farZ} to indicate depth values are reversed. {@code nearZ} can be infinite.")
    float("farZ", "the positive distance in meters of the {@code maxDepth} value in the depth swapchain. {@code farZ} can be infinite.")
}

val XrSystemSpaceWarpPropertiesFB = struct(Module.OPENXR, "XrSystemSpaceWarpPropertiesFB") {
    documentation =
        """
        Composition Layer Space Warp structure.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpaceWarp XR_FB_space_warp} extension <b>must</b> be enabled prior to using ##XrSystemSpaceWarpPropertiesFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_SPACE_WARP_PROPERTIES_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSystemProperties
        """

    Expression("#TYPE_SYSTEM_SPACE_WARP_PROPERTIES_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    uint32_t("recommendedMotionVectorImageRectWidth", "recommended motion vector and depth image width")
    uint32_t("recommendedMotionVectorImageRectHeight", "recommended motion vector and depth image height")
}

val XrDigitalLensControlALMALENCE = struct(Module.OPENXR, "XrDigitalLensControlALMALENCE") {
    documentation =
        """
        The digital lens control structure to be passed to change state of DLVR API Layer.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link ALMALENCEDigitalLensControl XR_ALMALENCE_digital_lens_control} extension <b>must</b> be enabled prior to using ##XrDigitalLensControlALMALENCE</li>
            <li>{@code type} <b>must</b> be #TYPE_DIGITAL_LENS_CONTROL_ALMALENCE</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code XrDigitalLensControlFlagBitsALMALENCE} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        #SetDigitalLensControlALMALENCE()
        """

    Expression("#TYPE_DIGITAL_LENS_CONTROL_ALMALENCE")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "must be {@code NULL}. No such structures are defined in core OpenXR or this extension.")
    XrDigitalLensControlFlagsALMALENCE("flags", "a bitmask of {@code XrDigitalLensControlFlagBitsALMALENCE} indicating various characteristics desired for the Digital Lens.")
}

val XrPassthroughKeyboardHandsIntensityFB = struct(Module.OPENXR, "XrPassthroughKeyboardHandsIntensityFB") {
    documentation =
        """
        A struct for setting the level of intensity for hands in the passthrough layer.

        <h5>Description</h5>
        ##XrPassthroughKeyboardHandsIntensityFB describes intensities of passthrough hands, and is used as a parameter to #PassthroughLayerSetKeyboardHandsIntensityFB().

        Each of the intensity values {@code leftHandIntensity} and {@code rightHandIntensity} <b>must</b> be in the range [0.0, 1.0]. The hand intensity value represents the level of visibility of rendered hand, the minimal value of the intensity 0.0 represents the fully transparent hand (not visible), the maximal value of 1.0 represented fully opaque hands (maximal visibility).

        If either {@code leftHandIntensity} or {@code rightHandIntensity} is outside the range [0.0, 1.0], the runtime must return #ERROR_VALIDATION_FAILURE.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthroughKeyboardHands XR_FB_passthrough_keyboard_hands} extension <b>must</b> be enabled prior to using ##XrPassthroughKeyboardHandsIntensityFB</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #PassthroughLayerSetKeyboardHandsIntensityFB()
        """

    Expression("#TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    float("leftHandIntensity", "defines an intensity for the left tracked hand.")
    float("rightHandIntensity", "defines an intensity for the right tracked hand.")
}

val XrUuidEXT = struct(Module.OPENXR, "XrUuidEXT") {
    javaImport("static org.lwjgl.openxr.EXTUUIUD.*")
    documentation =
        """
        Universally Unique Identifier.

        <h5>Description</h5>
        The structure is composed of 16 octets, with the size and order of the fields defined in <a target="_blank" href="https://www.rfc-editor.org/rfc/rfc4122.html\#section-4.1.2">RFC 4122 section 4.1.2</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTUUIUD XR_EXT_uuid} extension <b>must</b> be enabled prior to using ##XrUuidEXT</li>
        </ul>
        """

    uint8_t("data", "a 128-bit Universally Unique Identifier.")["XR_UUID_SIZE_EXT"]
}