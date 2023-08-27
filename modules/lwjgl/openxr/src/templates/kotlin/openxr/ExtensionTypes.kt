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
val XrSpatialGraphNodeBindingMSFT = XR_DEFINE_HANDLE("XrSpatialGraphNodeBindingMSFT")
val XrHandTrackerEXT = XR_DEFINE_HANDLE("XrHandTrackerEXT")
val XrBodyTrackerFB = XR_DEFINE_HANDLE("XrBodyTrackerFB")
val XrSceneObserverMSFT = XR_DEFINE_HANDLE("XrSceneObserverMSFT")
val XrSceneMSFT = XR_DEFINE_HANDLE("XrSceneMSFT")
val XrFacialTrackerHTC = XR_DEFINE_HANDLE("XrFacialTrackerHTC")
val XrFoveationProfileFB = XR_DEFINE_HANDLE("XrFoveationProfileFB")
val XrTriangleMeshFB = XR_DEFINE_HANDLE("XrTriangleMeshFB")
val XrPassthroughFB = XR_DEFINE_HANDLE("XrPassthroughFB")
val XrPassthroughLayerFB = XR_DEFINE_HANDLE("XrPassthroughLayerFB")
val XrGeometryInstanceFB = XR_DEFINE_HANDLE("XrGeometryInstanceFB")
val XrSpatialAnchorStoreConnectionMSFT = XR_DEFINE_HANDLE("XrSpatialAnchorStoreConnectionMSFT")
val XrSpaceUserFB = XR_DEFINE_HANDLE("XrSpaceUserFB")
val XrFaceTrackerFB = XR_DEFINE_HANDLE("XrFaceTrackerFB")
val XrEyeTrackerFB = XR_DEFINE_HANDLE("XrEyeTrackerFB")
val XrVirtualKeyboardMETA = XR_DEFINE_HANDLE("XrVirtualKeyboardMETA")
val XrPassthroughColorLutMETA = XR_DEFINE_HANDLE("XrPassthroughColorLutMETA")
val XrPassthroughHTC = XR_DEFINE_HANDLE("XrPassthroughHTC")
val XrPlaneDetectorEXT = XR_DEFINE_HANDLE("XrPlaneDetectorEXT")

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
val XrBodyJointFB = "XrBodyJointFB".enumType
val XrBodyJointSetFB = "XrBodyJointSetFB".enumType
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
val XrSpaceComponentTypeFB = "XrSpaceComponentTypeFB".enumType
val XrFoveationLevelFB = "XrFoveationLevelFB".enumType
val XrFoveationDynamicFB = "XrFoveationDynamicFB".enumType
val XrWindingOrderFB = "XrWindingOrderFB".enumType
val XrPassthroughLayerPurposeFB = "XrPassthroughLayerPurposeFB".enumType
val XrHandForearmJointULTRALEAP = "XrHandForearmJointULTRALEAP".enumType
val XrSpaceQueryActionFB = "XrSpaceQueryActionFB".enumType
val XrSpaceStorageLocationFB = "XrSpaceStorageLocationFB".enumType
val XrSpacePersistenceModeFB = "XrSpacePersistenceModeFB".enumType
val XrSemanticLabelsSupportFlagBitsFB = "XrSemanticLabelsSupportFlagBitsFB".enumType
val XrFoveationEyeTrackedProfileCreateFlagBitsMETA = "XrFoveationEyeTrackedProfileCreateFlagBitsMETA".enumType
val XrFoveationEyeTrackedStateFlagBitsMETA = "XrFoveationEyeTrackedStateFlagBitsMETA".enumType
val XrFaceExpressionFB = "XrFaceExpressionFB".enumType
val XrFaceExpressionSetFB = "XrFaceExpressionSetFB".enumType
val XrFaceConfidenceFB = "XrFaceConfidenceFB".enumType
val XrEyePositionFB = "XrEyePositionFB".enumType
val XrCompareOpFB = "XrCompareOpFB".enumType
val XrLocalDimmingModeMETA = "XrLocalDimmingModeMETA".enumType
val XrPassthroughPreferenceFlagBitsMETA = "XrPassthroughPreferenceFlagBitsMETA".enumType
val XrVirtualKeyboardLocationTypeMETA = "XrVirtualKeyboardLocationTypeMETA".enumType
val XrVirtualKeyboardInputSourceMETA = "XrVirtualKeyboardInputSourceMETA".enumType
val XrExternalCameraAttachedToDeviceOCULUS = "XrExternalCameraAttachedToDeviceOCULUS".enumType
val XrPerformanceMetricsCounterUnitMETA = "XrPerformanceMetricsCounterUnitMETA".enumType
val XrPassthroughColorLutChannelsMETA = "XrPassthroughColorLutChannelsMETA".enumType
val XrTrackingOptimizationSettingsDomainQCOM = "XrTrackingOptimizationSettingsDomainQCOM".enumType
val XrTrackingOptimizationSettingsHintQCOM = "XrTrackingOptimizationSettingsHintQCOM".enumType
val XrPassthroughFormHTC = "XrPassthroughFormHTC".enumType
val XrFoveationModeHTC = "XrFoveationModeHTC".enumType
val XrFoveationLevelHTC = "XrFoveationLevelHTC".enumType
val XrForceFeedbackCurlLocationMNDX = "XrForceFeedbackCurlLocationMNDX".enumType
val XrHandTrackingDataSourceEXT = "XrHandTrackingDataSourceEXT".enumType
val XrPlaneDetectorOrientationEXT = "XrPlaneDetectorOrientationEXT".enumType
val XrPlaneDetectorSemanticTypeEXT = "XrPlaneDetectorSemanticTypeEXT".enumType
val XrPlaneDetectionStateEXT = "XrPlaneDetectionStateEXT".enumType

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
val XrPassthroughCapabilityFlagsFB = typedef(XrFlags64, "XrPassthroughCapabilityFlagsFB")
val XrPassthroughFlagsFB = typedef(XrFlags64, "XrPassthroughFlagsFB")
val XrPassthroughStateChangedFlagsFB = typedef(XrFlags64, "XrPassthroughStateChangedFlagsFB")
val XrRenderModelFlagsFB = typedef(XrFlags64, "XrRenderModelFlagsFB")
val XrFrameEndInfoFlagsML = typedef(XrFlags64, "XrFrameEndInfoFlagsML")
val XrGlobalDimmerFrameEndInfoFlagsML = typedef(XrFlags64, "XrGlobalDimmerFrameEndInfoFlagsML")
val XrCompositionLayerSpaceWarpInfoFlagsFB = typedef(XrFlags64, "XrCompositionLayerSpaceWarpInfoFlagsFB")
val XrSemanticLabelsSupportFlagsFB = typedef(XrFlags64, "XrSemanticLabelsSupportFlagsFB")
val XrDigitalLensControlFlagsALMALENCE = typedef(XrFlags64, "XrDigitalLensControlFlagsALMALENCE")
val XrFoveationEyeTrackedProfileCreateFlagsMETA = typedef(XrFlags64, "XrFoveationEyeTrackedProfileCreateFlagsMETA")
val XrFoveationEyeTrackedStateFlagsMETA = typedef(XrFlags64, "XrFoveationEyeTrackedStateFlagsMETA")
val XrCompositionLayerSettingsFlagsFB = typedef(XrFlags64, "XrCompositionLayerSettingsFlagsFB")
val XrPassthroughPreferenceFlagsMETA = typedef(XrFlags64, "XrPassthroughPreferenceFlagsMETA")
val XrVirtualKeyboardInputStateFlagsMETA = typedef(XrFlags64, "XrVirtualKeyboardInputStateFlagsMETA")
val XrExternalCameraStatusFlagsOCULUS = typedef(XrFlags64, "XrExternalCameraStatusFlagsOCULUS")
val XrPerformanceMetricsCounterFlagsMETA = typedef(XrFlags64, "XrPerformanceMetricsCounterFlagsMETA")
val XrFoveationDynamicFlagsHTC = typedef(XrFlags64, "XrFoveationDynamicFlagsHTC")
val XrPlaneDetectionCapabilityFlagsEXT = typedef(XrFlags64, "XrPlaneDetectionCapabilityFlagsEXT")
val XrPlaneDetectorFlagsEXT = typedef(XrFlags64, "XrPlaneDetectorFlagsEXT")

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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
    XrEyeVisibility("eyeVisibility", "the eye represented by this layer.")
    XrSwapchain("swapchain", "the swapchain, which <b>must</b> have been created with a {@code faceCount} of 6.")
    uint32_t("imageArrayIndex", "the image array index, with 0 meaning the first or only array element.")
    XrQuaternionf("orientation", "the orientation of the environment map in the {@code space}.")
}

val XrCompositionLayerDepthInfoKHR = struct(Module.OPENXR, "XrCompositionLayerDepthInfoKHR") {
    documentation =
        """
        Depth map layer info.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The window space depth values {@code minDepth} and {@code maxDepth} are akin to the parameters of {@code glDepthRange} that specify the mapping from normalized device coordinates into window space.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        A reversed mapping of depth, such that points closer to the view have a window space depth that is greater than points further away can be achieved by making nearZ &gt; farZ.
        </div>

        ##XrCompositionLayerDepthInfoKHR contains the information needed to associate depth with the color information in a projection layer. When submitting depth images along with projection layers, add the ##XrCompositionLayerDepthInfoKHR to the {@code next} chain for all ##XrCompositionLayerProjectionView structures in the given layer.

        The homogeneous transform from view space z to window space depth is given by the following matrix, where a = minDepth, b = maxDepth, n = nearZ, and f = farZ.

        Homogeneous values are constructed from real values by appending a w component with value 1.0.

        General homogeneous values are projected back to real space by dividing by the w component.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRCompositionLayerDepth XR_KHR_composition_layer_depth} extension <b>must</b> be enabled prior to using ##XrCompositionLayerDepthInfoKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code subImage} <b>must</b> be a valid ##XrSwapchainSubImage structure</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader, ##XrCompositionLayerProjection, ##XrCompositionLayerProjectionView, ##XrFrameEndInfo, ##XrSwapchainSubImage, #EndFrame()
        """

    Expression("#TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSwapchainSubImage("subImage", "identifies the depth image ##XrSwapchainSubImage to be associated with the color swapchain. The swapchain <b>must</b> have been created with a {@code faceCount} of 1.")
    float("minDepth", "{@code minDepth} and {@code maxDepth} are the window space depths that correspond to the near and far frustum planes, respectively. {@code minDepth} must be less than {@code maxDepth}. {@code minDepth} and {@code maxDepth} must be in the range [0, 1].")
    float("maxDepth", "see {@code minDepth}")
    float("nearZ", "{@code nearZ} and {@code farZ} are the positive distances in meters to the near and far frustum planes, respectively. {@code nearZ} and {@code farZ} <b>must</b> not be equal. {@code nearZ} and {@code farZ} <b>must</b> be in the range (0, +infinity].")
    float("farZ", "see {@code nearZ}")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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

val XrEventDataPerfSettingsEXT = struct(Module.OPENXR, "XrEventDataPerfSettingsEXT", mutable = false, parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        XrEventDataPerfSettingsEXT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPerformanceSettings XR_EXT_performance_settings} extension <b>must</b> be enabled prior to using ##XrEventDataPerfSettingsEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_PERF_SETTINGS_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_EVENT_DATA_PERF_SETTINGS_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
    XrEyeVisibility("eyeVisibility", "the eye represented by this layer.")
    XrSwapchainSubImage("subImage", "identifies the image ##XrSwapchainSubImage to use. The swapchain <b>must</b> have been created with a {@code faceCount} of 1.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
    XrEyeVisibility("eyeVisibility", "the eye represented by this layer.")
    XrSwapchainSubImage("subImage", "identifies the image ##XrSwapchainSubImage to use. The swapchain <b>must</b> have been created with a {@code faceCount} of 1.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
    nullable..XrDebugUtilsObjectNameInfoEXT.p("objects", "{@code NULL} or a pointer to an array of ##XrDebugUtilsObjectNameInfoEXT objects related to the detected issue. The array is roughly in order of importance, but the 0th element is always guaranteed to be the most important object for this message.")
    AutoSize("sessionLabels", optional = true)..uint32_t("sessionLabelCount", "a count of items contained in the {@code sessionLabels} array. This may be 0.")
    nullable..XrDebugUtilsLabelEXT.p("sessionLabels", "{@code NULL} or a pointer to an array of ##XrDebugUtilsLabelEXT active in the current {@code XrSession} at the time the callback was triggered. Refer to <a href=\"https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\\#session-labels\">Session Labels</a> for more information.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code display} <b>must</b> be a pointer to a {@code wl_display} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateSession()
        """

    Expression("#TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    wl_display.p("display", "a valid Wayland {@code wl_display}.")
}

val XrSwapchainImageOpenGLKHR = struct(Module.OPENXR, "XrSwapchainImageOpenGLKHR", mutable = false, parentStruct = XrSwapchainImageBaseHeader) {
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSwapchainImageBaseHeader
        """

    Expression("#TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetOpenGLGraphicsRequirementsKHR()
        """

    Expression("#TYPE_GRAPHICS_REQUIREMENTS_OPENGL_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrVersion("minApiVersionSupported", "the minimum version of OpenGL that the runtime supports. Uses #XR_MAKE_VERSION() on major and minor API version, ignoring any patch version component.")
    XrVersion("maxApiVersionSupported", "the maximum version of OpenGL that the runtime has been tested on and is known to support. Newer OpenGL versions might work if they are compatible. Uses #XR_MAKE_VERSION() on major and minor API version, ignoring any patch version component.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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

val XrSwapchainImageVulkanKHR = struct(Module.OPENXR, "XrSwapchainImageVulkanKHR", mutable = false, parentStruct = XrSwapchainImageBaseHeader) {
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrSwapchainImageFoveationVulkanFB</li>
        </ul>

        <h5>See Also</h5>
        ##XrSwapchainImageBaseHeader
        """

    Expression("#TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    PointerSetter(
        "XrSwapchainImageFoveationVulkanFB",
        prepend = true
    )..nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetVulkanGraphicsRequirements2KHR(), #GetVulkanGraphicsRequirementsKHR()
        """

    Expression("#TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrVersion("minApiVersionSupported", "the minimum Vulkan Instance API version that the runtime supports. Uses #XR_MAKE_VERSION() on major and minor API version, ignoring any patch version component.")
    XrVersion("maxApiVersionSupported", "the maximum Vulkan Instance API version that the runtime has been tested on and is known to support. Newer Vulkan Instance API versions might work if they are compatible. Uses #XR_MAKE_VERSION() on major and minor API version, ignoring any patch version component.")
}

val XrSystemEyeGazeInteractionPropertiesEXT = struct(Module.OPENXR, "XrSystemEyeGazeInteractionPropertiesEXT", mutable = false) {
    documentation =
        """
        Eye gaze interaction system properties.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTEyeGazeInteraction XR_EXT_eye_gaze_interaction} extension <b>must</b> be enabled prior to using ##XrSystemEyeGazeInteractionPropertiesEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code vertexCapacityInput} is not 0, {@code vertices} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector2f structures</li>
            <li>If {@code indexCapacityInput} is not 0, {@code indices} <b>must</b> be a pointer to an array of {@code indexCapacityInput} {@code uint32_t} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrVector2f, #GetVisibilityMaskKHR()
        """

    Expression("#TYPE_VISIBILITY_MASK_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput", "the capacity of the {@code vertices} array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("vertexCountOutput", "filled in by the runtime with the count of vertices written or the required capacity in the case that {@code vertexCapacityInput} or {@code indexCapacityInput} is insufficient.")
    nullable..XrVector2f.p("vertices", "an array of vertices filled in by the runtime that specifies mask coordinates in the z=-1 plane of the rendered view—​i.e. one meter in front of the view. When rendering the mask for use in a projection layer, these vertices must be transformed by the application’s projection matrix used for the respective ##XrCompositionLayerProjectionView.")
    AutoSize("indices", optional = true)..uint32_t("indexCapacityInput", "the capacity of the {@code indices} array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("indexCountOutput", "filled in by the runtime with the count of indices written or the required capacity in the case that {@code vertexCapacityInput} or {@code indexCapacityInput} is insufficient.")
    nullable..uint32_t.p("indices", "an array of indices filled in by the runtime, specifying the indices of the mask geometry in the {@code vertices} array.")
}

val XrEventDataVisibilityMaskChangedKHR = struct(Module.OPENXR, "XrEventDataVisibilityMaskChangedKHR", mutable = false, parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Visibility Mask.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVisibilityMask XR_KHR_visibility_mask} extension <b>must</b> be enabled prior to using ##XrEventDataVisibilityMaskChangedKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code createFlags} <b>must</b> be 0</li>
        </ul>
        """

    Expression("#TYPE_SESSION_CREATE_INFO_OVERLAY_EXTX")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrOverlaySessionCreateFlagsEXTX("createFlags", "0 or one or more {@code XrOverlaySessionCreateFlagBitsEXTX} which indicate various characteristics desired for the overlay session.")
    uint32_t("sessionLayersPlacement", "a value indicating the desired placement of the session’s composition layers in terms of other sessions.")
}

val XrEventDataMainSessionVisibilityChangedEXTX = struct(Module.OPENXR, "XrEventDataMainSessionVisibilityChangedEXTX", mutable = false, parentStruct = XrEventDataBaseHeader) {
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX")..XrStructureType("type", "").mutable()
    nullable..opaque_const_p("next", "").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code getProcAddress} <b>must</b> be a valid {@code PFN_xrEglGetProcAddressMNDX} value</li>
            <li>{@code display} <b>must</b> be a valid {@code EGLDisplay} value</li>
            <li>{@code config} <b>must</b> be a valid {@code EGLConfig} value</li>
            <li>{@code context} <b>must</b> be a valid {@code EGLContext} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateSession()
        """

    Expression("#TYPE_GRAPHICS_BINDING_EGL_MNDX")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    PFN_xrEglGetProcAddressMNDX("getProcAddress", "a valid function pointer to {@code eglGetProcAddress}.")
    EGLDisplay("display", "a valid EGL {@code EGLDisplay}.")
    EGLConfig("config", "a valid EGL {@code EGLConfig}.")
    EGLContext("context", "a valid EGL {@code EGLContext}.")
}

val XrSpatialGraphNodeSpaceCreateInfoMSFT = struct(Module.OPENXR, "XrSpatialGraphNodeSpaceCreateInfoMSFT") {
    javaImport("static org.lwjgl.openxr.MSFTSpatialGraphBridge.*")
    documentation =
        """
        The information to create space from a spatial graph node.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to using ##XrSpatialGraphNodeSpaceCreateInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code nodeType} <b>must</b> be a valid {@code XrSpatialGraphNodeTypeMSFT} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #CreateSpatialGraphNodeSpaceMSFT()
        """

    Expression("#TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpatialGraphNodeTypeMSFT("nodeType", "an {@code XrSpatialGraphNodeTypeMSFT} specifying the spatial node type.")
    uint8_t("nodeId", "a global unique identifier (a.k.a. GUID or 16 byte array), representing the spatial node that is being tracked.")["XR_GUID_SIZE_MSFT"]
    XrPosef("pose", "an ##XrPosef defining the position and orientation of the new space’s origin within the natural reference frame of the spatial graph node.")
}

val XrSpatialGraphStaticNodeBindingCreateInfoMSFT = struct(Module.OPENXR, "XrSpatialGraphStaticNodeBindingCreateInfoMSFT") {
    documentation =
        """
        The information to create a spatial graph static node binding handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to using ##XrSpatialGraphStaticNodeBindingCreateInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #TryCreateSpatialGraphStaticNodeBindingMSFT()
        """

    Expression("#TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrSpace("space", "a handle to the {@code XrSpace} in which {@code poseInSpace} is specified.")
    XrPosef("poseInSpace", "the ##XrPosef within {@code space} at {@code time}.")
    XrTime("time", "the {@code XrTime} at which {@code poseInSpace} will be evaluated within {@code space}.")
}

val XrSpatialGraphNodeBindingPropertiesGetInfoMSFT = struct(Module.OPENXR, "XrSpatialGraphNodeBindingPropertiesGetInfoMSFT") {
    documentation =
        """
        The information to get node binding properties.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to using ##XrSpatialGraphNodeBindingPropertiesGetInfoMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetSpatialGraphNodeBindingPropertiesMSFT()
        """

    Expression("#TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
}

val XrSpatialGraphNodeBindingPropertiesMSFT = struct(Module.OPENXR, "XrSpatialGraphNodeBindingPropertiesMSFT") {
    javaImport("static org.lwjgl.openxr.MSFTSpatialGraphBridge.*")
    documentation =
        """
        The spatial graph node binding properties.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to using ##XrSpatialGraphNodeBindingPropertiesMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #GetSpatialGraphNodeBindingPropertiesMSFT()
        """

    Expression("#TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    uint8_t("nodeId", "a global unique identifier (a.k.a. GUID or 16 byte array), representing the spatial graph node.")["XR_GUID_SIZE_MSFT"]
    XrPosef("poseInNodeSpace", "an ##XrPosef defining the pose in the underlying node’s space.")
}

val XrSystemHandTrackingPropertiesEXT = struct(Module.OPENXR, "XrSystemHandTrackingPropertiesEXT", mutable = false) {
    documentation =
        """
        System property for hand tracking.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to using ##XrSystemHandTrackingPropertiesEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        If a runtime returns #FALSE for {@code supportsHandTracking}, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateHandTrackerEXT().
        """

    Expression("#TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrHandPoseTypeInfoMSFT, ##XrHandTrackingDataSourceInfoEXT</li>
            <li>{@code hand} <b>must</b> be a valid {@code XrHandEXT} value</li>
            <li>{@code handJointSet} <b>must</b> be a valid {@code XrHandJointSetEXT} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateHandTrackerEXT()
        """

    Expression("#TYPE_HAND_TRACKER_CREATE_INFO_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrHandPoseTypeInfoMSFT", "XrHandTrackingDataSourceInfoEXT",
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrHandJointsMotionRangeInfoEXT</li>
            <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
        </ul>

        <h5>See Also</h5>
        #LocateHandJointsEXT()
        """

    Expression("#TYPE_HAND_JOINTS_LOCATE_INFO_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrHandJointsMotionRangeInfoEXT",
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrHandJointVelocitiesEXT, ##XrHandTrackingAimStateFB, ##XrHandTrackingCapsulesStateFB, ##XrHandTrackingDataSourceStateEXT, ##XrHandTrackingScaleFB</li>
            <li>{@code jointLocations} <b>must</b> be a pointer to an array of {@code jointCount} ##XrHandJointLocationEXT structures</li>
            <li>The {@code jointCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandJointLocationEXT, #LocateHandJointsEXT()
        """

    Expression("#TYPE_HAND_JOINT_LOCATIONS_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrHandJointVelocitiesEXT", "XrHandTrackingAimStateFB", "XrHandTrackingCapsulesStateFB", "XrHandTrackingDataSourceStateEXT", "XrHandTrackingScaleFB",
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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

val XrSystemHandTrackingMeshPropertiesMSFT = struct(Module.OPENXR, "XrSystemHandTrackingMeshPropertiesMSFT", mutable = false) {
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSystemProperties, #GetSystemProperties()
        """

    Expression("#TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
            <li>{@code environmentBlendMode} <b>must</b> be a valid {@code XrEnvironmentBlendMode} value</li>
            <li>{@code layers} <b>must</b> be a pointer to an array of {@code layerCount} valid ##XrCompositionLayerBaseHeader-based structures. See also: ##XrCompositionLayerCubeKHR, ##XrCompositionLayerCylinderKHR, ##XrCompositionLayerEquirect2KHR, ##XrCompositionLayerEquirectKHR, ##XrCompositionLayerPassthroughHTC, ##XrCompositionLayerProjection, ##XrCompositionLayerQuad</li>
            <li>The {@code layerCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader, ##XrSecondaryViewConfigurationFrameEndInfoMSFT, #EndFrame()
        """

    Expression("#TYPE_SECONDARY_VIEW_CONFIGURATION_LAYER_INFO_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrViewConfigurationType("viewConfigurationType", "{@code XrViewConfigurationType} to which the composition layers will be displayed.")
    XrEnvironmentBlendMode("environmentBlendMode", "the {@code XrEnvironmentBlendMode} value representing the desired <a href=\"https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\\#environment_blend_mode\">environment blend mode</a> for this view configuration.")
    AutoSize("layers")..uint32_t("layerCount", "the number of composition layers in this frame for the secondary view configuration type. The maximum supported layer count is identified by ##XrSystemGraphicsProperties::maxLayerCount. If layerCount is greater than the maximum supported layer count then #ERROR_LAYER_LIMIT_EXCEEDED is returned.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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

        The returned {@code modelKey} value depends on an active action binding to the corresponding subpathname:/grip/pose of the controller. Therefore, the application <b>must</b> have provided a valid action set containing an action for subpathname:/grip/pose, and have successfully completed an #SyncActions() call, in order to obtain a valid {@code modelKey}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to using ##XrControllerModelKeyStateMSFT</li>
            <li>{@code type} <b>must</b> be #TYPE_CONTROLLER_MODEL_KEY_STATE_MSFT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code nodeCapacityInput} is not 0, {@code nodeProperties} <b>must</b> be a pointer to an array of {@code nodeCapacityInput} ##XrControllerModelNodePropertiesMSFT structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrControllerModelNodePropertiesMSFT, #GetControllerModelPropertiesMSFT(), #LoadControllerModelMSFT()
        """

    Expression("#TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("nodeProperties", optional = true)..uint32_t("nodeCapacityInput", "the capacity of the {@code nodeProperties} array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("nodeCountOutput", "filled in by the runtime with the count of elements in {@code nodeProperties} array, or returns the required capacity in the case that {@code nodeCapacityInput} is insufficient.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code nodeCapacityInput} is not 0, {@code nodeStates} <b>must</b> be a pointer to an array of {@code nodeCapacityInput} ##XrControllerModelNodeStateMSFT structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrControllerModelNodeStateMSFT, #GetControllerModelStateMSFT()
        """

    Expression("#TYPE_CONTROLLER_MODEL_STATE_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("nodeStates", optional = true)..uint32_t("nodeCapacityInput", "the capacity of the {@code nodeStates} array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("nodeCountOutput", "filled in by the runtime with the count of elements in {@code nodeStates} array, or returns the required capacity in the case that {@code nodeCapacityInput} is insufficient.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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

val XrBodyJointLocationFB = struct(Module.OPENXR, "XrBodyJointLocationFB") {
    documentation =
        """
        Describes the location and radius of a body joint.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to using ##XrBodyJointLocationFB</li>
            <li>{@code locationFlags} <b>must</b> be a valid combination of {@code XrSpaceLocationFlagBits} values</li>
            <li>{@code locationFlags} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrBodyJointLocationsFB, ##XrPosef
        """

    XrSpaceLocationFlags("locationFlags", "a bitfield, with bit masks defined in {@code XrSpaceLocationFlagBits}, to indicate which members contain valid data. If none of the bits are set, no other fields in this structure <b>should</b> be considered to be valid or meaningful.")
    XrPosef("pose", "an ##XrPosef defining the position and orientation of the origin of a body joint within the reference frame of the corresponding ##XrBodyJointsLocateInfoFB{@code ::baseSpace}.")
}

val XrSystemBodyTrackingPropertiesFB = struct(Module.OPENXR, "XrSystemBodyTrackingPropertiesFB", mutable = false) {
    documentation =
        """
        System property for body tracking.

        <h5>Description</h5>
        If a runtime returns #FALSE for {@code supportsBodyTracking}, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateBodyTrackerFB().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to using ##XrSystemBodyTrackingPropertiesFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrBool32("supportsBodyTracking", "an {@code XrBool32}, indicating if current system is capable of receiving body tracking input.")
}

val XrBodyTrackerCreateInfoFB = struct(Module.OPENXR, "XrBodyTrackerCreateInfoFB") {
    documentation =
        """
        Information to create a body joints handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to using ##XrBodyTrackerCreateInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_BODY_TRACKER_CREATE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code bodyJointSet} <b>must</b> be a valid {@code XrBodyJointSetFB} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateBodyTrackerFB()
        """

    Expression("#TYPE_BODY_TRACKER_CREATE_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrBodyJointSetFB("bodyJointSet", "an {@code XrBodyJointSetFB} that describes the set of body joints to retrieve.")
}

val XrBodySkeletonJointFB = struct(Module.OPENXR, "XrBodySkeletonJointFB") {
    documentation =
        """
        Describes the location and position of a joint in the skeleton hierarchy.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to using ##XrBodySkeletonJointFB</li>
        </ul>

        <h5>See Also</h5>
        ##XrBodySkeletonFB, ##XrPosef
        """

    int32_t("joint", "an index of a joint using the corresponding body joint enum (e.g. {@code XrBodyJointFB}).")
    int32_t("parentJoint", "an index of a parent joint of that joint, using the corresponding body joint enum (e.g. {@code XrBodyJointFB}).")
    XrPosef("pose", "an ##XrPosef defining the position and orientation of the origin of a body joint within the reference frame of the corresponding ##XrBodyJointsLocateInfoFB{@code ::baseSpace}.")
}

val XrBodySkeletonFB = struct(Module.OPENXR, "XrBodySkeletonFB") {
    documentation =
        """
        Returns the body skeleton hierarchy.

        <h5>Description</h5>
        The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if {@code jointCount} does not equal to the number of joints defined by the {@code XrBodyJointSetFB} used to create the {@code XrBodyTrackerFB}.

        The runtime <b>must</b> return {@code joints} representing the default pose of the current estimation regarding the user’s skeleton.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to using ##XrBodySkeletonFB</li>
            <li>{@code type} <b>must</b> be #TYPE_BODY_SKELETON_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code joints} <b>must</b> be a pointer to an array of {@code jointCount} ##XrBodySkeletonJointFB structures</li>
            <li>The {@code jointCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrBodySkeletonJointFB, #GetBodySkeletonFB()
        """

    Expression("#TYPE_BODY_SKELETON_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("joints")..uint32_t("jointCount", "an {@code uint32_t} describing the count of elements in {@code joints} array.")
    XrBodySkeletonJointFB.p("joints", "an application-allocated array of ##XrBodySkeletonJointFB that will be filled with skeleton joint elements.")
}

val XrBodyJointsLocateInfoFB = struct(Module.OPENXR, "XrBodyJointsLocateInfoFB") {
    documentation =
        """
        Describes the information to locate body joints.

        <h5>Description</h5>
        Callers <b>should</b> request a time equal to the predicted display time for the rendered frame. The system will employ appropriate modeling to support body tracking at this time.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to using ##XrBodyJointsLocateInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_BODY_JOINTS_LOCATE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
        </ul>

        <h5>See Also</h5>
        #LocateBodyJointsFB()
        """

    Expression("#TYPE_BODY_JOINTS_LOCATE_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpace("baseSpace", "an {@code XrSpace} within which the returned body joint locations will be represented.")
    XrTime("time", "an {@code XrTime} at which to locate the body joints.")
}

val XrBodyJointLocationsFB = struct(Module.OPENXR, "XrBodyJointLocationsFB") {
    documentation =
        """
        Returns the body joint locations.

        <h5>Description</h5>
        The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if {@code jointCount} does not equal to the number of joints defined by the {@code XrBodyJointSetFB} used to create the {@code XrBodyTrackerFB}.

        The runtime <b>must</b> return {@code jointLocations} representing the range of human body motion, without any obstructions. Input systems that either obstruct the movement of the user’s body (for example, a held controller preventing the user from making a fist) or input systems that have only limited ability to track finger positions <b>must</b> use the information available to them to emulate an unobstructed range of motion.

        The runtime <b>must</b> update the {@code jointLocations} array ordered so that the application can index elements using the corresponding body joint enum (e.g. {@code XrBodyJointFB}) as described by {@code XrBodyJointSetFB} when creating the {@code XrBodyTrackerFB}. For example, when the {@code XrBodyTrackerFB} is created with #BODY_JOINT_SET_DEFAULT_FB, the application <b>must</b> set the {@code jointCount} to #BODY_JOINT_COUNT_FB, and the runtime <b>must</b> fill the {@code jointLocations} array ordered so that it is indexed by the {@code XrBodyJointFB} enum.

        If the returned {@code isActive} is true, the runtime <b>must</b> return all joint locations with both #SPACE_LOCATION_POSITION_VALID_BIT and #SPACE_LOCATION_ORIENTATION_VALID_BIT set. However, in this case, some joint space locations <b>may</b> be untracked (i.e. #SPACE_LOCATION_POSITION_TRACKED_BIT or #SPACE_LOCATION_ORIENTATION_TRACKED_BIT is unset).

        If the returned {@code isActive} is false, it indicates that the body tracker did not detect the body input, the application lost input focus, or the consent for body tracking was denied by the user. In this case, the runtime <b>must</b> return all {@code jointLocations} with neither #SPACE_LOCATION_POSITION_VALID_BIT nor #SPACE_LOCATION_ORIENTATION_VALID_BIT set.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to using ##XrBodyJointLocationsFB</li>
            <li>{@code type} <b>must</b> be #TYPE_BODY_JOINT_LOCATIONS_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code jointLocations} <b>must</b> be a pointer to an array of {@code jointCount} ##XrBodyJointLocationFB structures</li>
            <li>The {@code jointCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrBodyJointLocationFB, #LocateBodyJointsFB()
        """

    Expression("#TYPE_BODY_JOINT_LOCATIONS_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrBool32("isActive", "an {@code XrBool32} indicating if the body tracker is actively tracking.")
    float("confidence", "a {@code float} between 0 and 1 which represents the confidence for the returned body pose. A value of 0 means there is no confidence in the pose returned, and a value of 1 means maximum confidence in the returned body pose.")
    AutoSize("jointLocations")..uint32_t("jointCount", "a {@code uint32_t} describing the count of elements in {@code jointLocations} array.")
    XrBodyJointLocationFB.p("jointLocations", "an application-allocated array of ##XrBodyJointLocationFB that will be filled with joint locations.")
    uint32_t("skeletonChangedCount", "an output {@code uint32_t} incremental counter indicating that the skeleton scale proportions have changed. #GetBodySkeletonFB() <b>can</b> be called when this counter increases to get the latest body proportions/scale.")
    XrTime("time", "an {@code XrTime} time at which the returned joints are tracked. Equals the time at which the joints were requested if the interpolation at the time was successful.")
}

val _XrBindingModificationBaseHeaderKHR = struct(Module.OPENXR, "XrBindingModificationBaseHeaderKHR")
val XrInteractionProfileDpadBindingEXT = struct(Module.OPENXR, "XrInteractionProfileDpadBindingEXT", parentStruct = _XrBindingModificationBaseHeaderKHR) {
    documentation =
        """
        Interaction profile dpad binding.

        <h5>Description</h5>
        The ##XrInteractionProfileDpadBindingEXT structure is an input struct that defines how to use any two-axis input to provide dpad-like functionality to the application. The struct <b>must</b> be added for each input that should be treated as a dpad to the {@code bindingModifications} array of the ##XrBindingModificationsKHR structure (See {@link KHRBindingModification XR_KHR_binding_modification} extension).

        Runtimes are free to ignore any of the fields when not obeying the bindings, but <b>may</b> use it for automatic rebindings of actions.

        The implementation <b>must</b> return #ERROR_VALIDATION_FAILURE from #SuggestInteractionProfileBindings() if any of the following are true:

        <ul>
            <li>{@code forceThreshold} or {@code forceThresholdReleased} are outside the half-open range <code>(0, 1]</code></li>
            <li><code>forceThreshold &lt; forceThresholdReleased</code></li>
            <li>{@code centerRegion} is outside the exclusive range <code>(0, 1)</code></li>
            <li>{@code wedgeAngle} outside the half-open range <code>[0, π)</code></li>
        </ul>

        If more than one ##XrInteractionProfileDpadBindingEXT is provided for the same input identifier, including top level path (e.g. pathname:/user/hand/left/input/thumbstick), and two or more of them specify the same actionset, the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE. If the same input identifier, including top level path, is used for more than one action set, in addition to inputs being <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#input-action-creation">suppressed by higher priority action sets</a>, haptic events from dpads are also suppressed.

        For example, a Valve Index controller binding with a "Walking" action set can have a dpad on each of:

        <ul>
            <li>left thumbstick</li>
            <li>right thumbstick</li>
            <li>left trackpad</li>
            <li>right trackpad</li>
        </ul>

        Another action set can also have a dpad active on each of those inputs, and they can have different settings. If both action sets are active, the higher priority one trumps the lower priority one, and the lower priority one is suppressed.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTDpadBinding XR_EXT_dpad_binding} extension <b>must</b> be enabled prior to using ##XrInteractionProfileDpadBindingEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_INTERACTION_PROFILE_DPAD_BINDING_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code actionSet} <b>must</b> be a valid {@code XrActionSet} handle</li>
            <li>If {@code onHaptic} is not {@code NULL}, {@code onHaptic} <b>must</b> be a pointer to a valid ##XrHapticBaseHeader-based structure. See also: ##XrHapticAmplitudeEnvelopeVibrationFB, ##XrHapticPcmVibrationFB, ##XrHapticVibration</li>
            <li>If {@code offHaptic} is not {@code NULL}, {@code offHaptic} <b>must</b> be a pointer to a valid ##XrHapticBaseHeader-based structure. See also: ##XrHapticAmplitudeEnvelopeVibrationFB, ##XrHapticPcmVibrationFB, ##XrHapticVibration</li>
        </ul>

        <h5>See Also</h5>
        ##XrBindingModificationBaseHeaderKHR, ##XrHapticBaseHeader, #SuggestInteractionProfileBindings()
        """

    Expression("#TYPE_INTERACTION_PROFILE_DPAD_BINDING_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrPath("binding", "the input path used for the specified actions in the suggested binding list to be used as a dpad. E.g. path:/user/hand/right/input/thumbstick")
    XrActionSet("actionSet", "the action set for which this dpad will be active. The implementation <b>must</b> use the parameters from this structure for any actions from this action set that are bound to one of the dpad subpaths for this input path.")
    float("forceThreshold", "a number in the half-open range <code>(0, 1]</code> representing the force value threshold at or above which (≥) a dpad input will transition from inactive to active.")
    float("forceThresholdReleased", "a number in the half-open range <code>(0, 1]</code> representing the force value threshold strictly below which (&lt;) a dpad input will transition from active to inactive.")
    float("centerRegion", "defines the center region of the thumbstick or trackpad. This is the radius, in the input value space, of a logically circular region in the center of the input, in the range <code>(0, 1)</code>.")
    float("wedgeAngle", "indicates the angle in radians of each direction region and is a value in the half-open range <code>[0, π)</code>.")
    XrBool32("isSticky", "indicates that the implementation will latch the first region that is activated and continue to indicate that the binding for that region is true until the user releases the input underlying the virtual dpad.")
    nullable..XrHapticBaseHeader.const.p("onHaptic", "the haptic output that the runtime <b>must</b> trigger when the binding changes from false to true. If this field is {@code NULL}, the runtime <b>must</b> not trigger any haptic output on the threshold. This field <b>can</b> point to any supported sub-type of ##XrHapticBaseHeader.")
    nullable..XrHapticBaseHeader.const.p("offHaptic", "the haptic output that the runtime <b>must</b> trigger when the binding changes from true to false. If this field is NULL, the runtime <b>must</b> not trigger any haptic output on the threshold. This field <b>can</b> point to any supported sub-type of ##XrHapticBaseHeader.")
}

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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code action} <b>must</b> be a valid {@code XrAction} handle</li>
            <li>If {@code onHaptic} is not {@code NULL}, {@code onHaptic} <b>must</b> be a pointer to a valid ##XrHapticBaseHeader-based structure. See also: ##XrHapticAmplitudeEnvelopeVibrationFB, ##XrHapticPcmVibrationFB, ##XrHapticVibration</li>
            <li>If {@code offHaptic} is not {@code NULL}, {@code offHaptic} <b>must</b> be a pointer to a valid ##XrHapticBaseHeader-based structure. See also: ##XrHapticAmplitudeEnvelopeVibrationFB, ##XrHapticPcmVibrationFB, ##XrHapticVibration</li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code createFlags} <b>must</b> be 0</li>
            <li>{@code pfnGetInstanceProcAddr} <b>must</b> be a valid {@code PFN_vkGetInstanceProcAddr} value</li>
            <li>{@code vulkanCreateInfo} <b>must</b> be a pointer to a valid {@code VkInstanceCreateInfo} value</li>
            <li>If {@code vulkanAllocator} is not {@code NULL}, {@code vulkanAllocator} <b>must</b> be a pointer to a valid {@code VkAllocationCallbacks} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateVulkanInstanceKHR()
        """

    Expression("#TYPE_VULKAN_INSTANCE_CREATE_INFO_KHR")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension")
    XrSystemId("systemId", "an {@code XrSystemId} handle for the system which will be used to create a session.")
    XrVulkanInstanceCreateFlagsKHR("createFlags", "a bitmask of {@code XrVulkanInstanceCreateFlagBitsKHR}")
    PFN_vkGetInstanceProcAddr("pfnGetInstanceProcAddr", "a function pointer to {@code vkGetInstanceProcAddr} or a compatible entry point.")
    VkInstanceCreateInfo.const.p("vulkanCreateInfo", "the <a href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/man/html/VkInstanceCreateInfo.html\">{@code VkInstanceCreateInfo} as specified by Vulkan</a>.")
    nullable..VkAllocationCallbacks.const.p("vulkanAllocator", "the <a href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/man/html/VkAllocationCallbacks.html\">{@code VkAllocationCallbacks} as specified by Vulkan</a>.")
}

val XrVulkanDeviceCreateInfoKHR = struct(Module.OPENXR, "XrVulkanDeviceCreateInfoKHR") {
    javaImport("org.lwjgl.vulkan.*")
    documentation =
        """
        Vulkan Device Create Info.

        <h5>Description</h5>
        If the {@code vulkanPhysicalDevice} parameter does not match the output of #GetVulkanGraphicsDeviceKHR(), then the runtime <b>must</b> return #ERROR_HANDLE_INVALID.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension <b>must</b> be enabled prior to using ##XrVulkanDeviceCreateInfoKHR</li>
            <li>{@code type} <b>must</b> be #TYPE_VULKAN_DEVICE_CREATE_INFO_KHR</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
    XrVulkanDeviceCreateFlagsKHR("createFlags", "a bitmask of {@code XrVulkanDeviceCreateFlagBitsKHR}")
    PFN_vkGetInstanceProcAddr("pfnGetInstanceProcAddr", "a function pointer to {@code vkGetInstanceProcAddr} or a compatible entry point.")
    VkPhysicalDevice("vulkanPhysicalDevice", "<b>must</b> match #GetVulkanGraphicsDeviceKHR().")
    VkDeviceCreateInfo.const.p("vulkanCreateInfo", "the <a href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/man/html/VkDeviceCreateInfo.html\">{@code VkDeviceCreateInfo} as specified by Vulkan</a>.")
    nullable..VkAllocationCallbacks.const.p("vulkanAllocator", "the <a href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/man/html/VkAllocationCallbacks.html\">{@code VkAllocationCallbacks} as specified by Vulkan</a>.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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

val XrSwapchainImageVulkan2KHR = struct(Module.OPENXR, "XrSwapchainImageVulkan2KHR", mutable = false, alias = XrSwapchainImageVulkanKHR) {
    javaImport("org.lwjgl.vulkan.*")
    documentation = "See ##XrSwapchainImageVulkanKHR."

    Expression("#TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR")..XrStructureType("type", "").mutable()
    nullable..opaque_p("next", "").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
    XrEyeVisibility("eyeVisibility", "the eye represented by this layer.")
    XrSwapchainSubImage("subImage", "identifies the image ##XrSwapchainSubImage to use. The swapchain <b>must</b> have been created with a {@code faceCount} of 1.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrVisualMeshComputeLodInfoMSFT</li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrSceneMeshesMSFT, ##XrSceneObjectsMSFT, ##XrScenePlanesMSFT</li>
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
    uint32_t("componentCountOutput", "a pointer to the count of components, or a pointer to the required capacity in the case that {@code componentCapacityInput} is insufficient.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrSceneComponentParentFilterInfoMSFT, ##XrSceneObjectTypesFilterInfoMSFT, ##XrScenePlaneAlignmentFilterInfoMSFT</li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code vertexCapacityInput} is not 0, {@code vertices} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector3f structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneMeshBuffersMSFT, ##XrVector3f, #GetSceneMeshBuffersMSFT()
        """

    Expression("#TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput", "the capacity of the array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("vertexCountOutput", "the count of vertices, or the required capacity in the case that {@code vertexCapacityInput} is insufficient.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code indexCapacityInput} is not 0, {@code indices} <b>must</b> be a pointer to an array of {@code indexCapacityInput} {@code uint32_t} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneMeshBuffersMSFT, #GetSceneMeshBuffersMSFT()
        """

    Expression("#TYPE_SCENE_MESH_INDICES_UINT32_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("indices", optional = true)..uint32_t("indexCapacityInput", "the capacity of the array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("indexCountOutput", "the count of indices, or the required capacity in the case that {@code indexCapacityInput} is insufficient.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code indexCapacityInput} is not 0, {@code indices} <b>must</b> be a pointer to an array of {@code indexCapacityInput} {@code uint16_t} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneMeshBuffersMSFT, #GetSceneMeshBuffersMSFT()
        """

    Expression("#TYPE_SCENE_MESH_INDICES_UINT16_MSFT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("indices", optional = true)..uint32_t("indexCapacityInput", "the capacity of the array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("indexCountOutput", "a pointer to the count of indices, or a pointer to the required capacity in the case that {@code indexCapacityInput} is insufficient.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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

val XrEventDataDisplayRefreshRateChangedFB = struct(Module.OPENXR, "XrEventDataDisplayRefreshRateChangedFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Event representing display refresh rate change.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBDisplayRefreshRate XR_FB_display_refresh_rate} extension <b>must</b> be enabled prior to using ##XrEventDataDisplayRefreshRateChangedFB</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetDisplayRefreshRateFB()
        """

    Expression("#TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrEventDataViveTrackerConnectedHTCX, #EnumerateViveTrackerPathsHTCX()
        """

    Expression("#TYPE_VIVE_TRACKER_PATHS_HTCX")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrPath("persistentPath", "the unique path of the VIVE tracker which is persistent over the lifetime of the hardware.")
    XrPath("rolePath", "the path of the VIVE tracker role. This <b>may</b> be #NULL_PATH if the role is not assigned.")
}

val XrEventDataViveTrackerConnectedHTCX = struct(Module.OPENXR, "XrEventDataViveTrackerConnectedHTCX", mutable = false, parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Event representing a new VIVE tracker connected.

        <h5>Description</h5>
        Receiving the ##XrEventDataViveTrackerConnectedHTCX event structure indicates that a new VIVE tracker was connected or its role changed. It is received via #PollEvent().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCXViveTrackerInteraction XR_HTCX_vive_tracker_interaction} extension <b>must</b> be enabled prior to using ##XrEventDataViveTrackerConnectedHTCX</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrViveTrackerPathsHTCX, #PollEvent()
        """

    Expression("#TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrViveTrackerPathsHTCX.p("paths", "contains two paths of the connected VIVE tracker.")
}

val XrSystemFacialTrackingPropertiesHTC = struct(Module.OPENXR, "XrSystemFacialTrackingPropertiesHTC", mutable = false) {
    documentation =
        """
        System property for facial tracking.

        <h5>Description</h5>
        An application <b>can</b> inspect whether the system is capable of two of the facial tracking by extending the ##XrSystemProperties with ##XrSystemFacialTrackingPropertiesHTC structure when calling #GetSystemProperties().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCFacialTracking XR_HTC_facial_tracking} extension <b>must</b> be enabled prior to using ##XrSystemFacialTrackingPropertiesHTC</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        If a runtime returns #FALSE for {@code supportEyeFacialTracking}, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateFacialTrackerHTC() with #FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC set for {@code XrFacialTrackingTypeHTC} in ##XrFacialTrackerCreateInfoHTC. Similarly, if a runtime returns #FALSE for {@code supportLipFacialTracking} the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateFacialTrackerHTC() with #FACIAL_TRACKING_TYPE_LIP_DEFAULT_HTC set for {@code XrFacialTrackingTypeHTC} in ##XrFacialTrackerCreateInfoHTC.
        """

    Expression("#TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code facialTrackingType} <b>must</b> be a valid {@code XrFacialTrackingTypeHTC} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateFacialTrackerHTC()
        """

    Expression("#TYPE_FACIAL_TRACKER_CREATE_INFO_HTC")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrFacialTrackingTypeHTC("facialTrackingType", "an {@code XrFacialTrackingTypeHTC} which describes which type of facial tracking should be used for this handle.")
}

val XrSystemColorSpacePropertiesFB = struct(Module.OPENXR, "XrSystemColorSpacePropertiesFB", mutable = false) {
    documentation =
        """
        System property for color space.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBColorSpace XR_FB_color_space} extension <b>must</b> be enabled prior to using ##XrSystemColorSpacePropertiesFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code jointCapacityInput} is not 0, {@code jointBindPoses} <b>must</b> be a pointer to an array of {@code jointCapacityInput} ##XrPosef structures</li>
            <li>If {@code jointCapacityInput} is not 0, {@code jointRadii} <b>must</b> be a pointer to an array of {@code jointCapacityInput} {@code float} values</li>
            <li>If {@code jointCapacityInput} is not 0, {@code jointParents} <b>must</b> be a pointer to an array of {@code jointCapacityInput} {@code XrHandJointEXT} values</li>
            <li>If {@code vertexCapacityInput} is not 0, {@code vertexPositions} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector3f structures</li>
            <li>If {@code vertexCapacityInput} is not 0, {@code vertexNormals} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector3f structures</li>
            <li>If {@code vertexCapacityInput} is not 0, {@code vertexUVs} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector2f structures</li>
            <li>If {@code vertexCapacityInput} is not 0, {@code vertexBlendIndices} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector4sFB structures</li>
            <li>If {@code vertexCapacityInput} is not 0, {@code vertexBlendWeights} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector4f structures</li>
            <li>If {@code indexCapacityInput} is not 0, {@code indices} <b>must</b> be a pointer to an array of {@code indexCapacityInput} {@code int16_t} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, ##XrVector2f, ##XrVector3f, ##XrVector4f, ##XrVector4sFB, #GetHandMeshFB()
        """

    Expression("#TYPE_HAND_TRACKING_MESH_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("jointBindPoses", "jointRadii", "jointParents", optional = true)..uint32_t("jointCapacityInput", "the capacity of the joint data arrays in this structure, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("jointCountOutput", "filled in by the runtime with the count of joint data elements written, or the required capacity in the case that any of {@code jointCapacityInput}, {@code vertexCapacityInput}, or {@code indexCapacityInput} is insufficient.")
    nullable..XrPosef.p("jointBindPoses", "an array of poses that matches what is returned by #LocateHandJointsEXT() which describes the hand skeleton’s bind pose.")
    nullable..float.p("jointRadii", "an array of joint radii at bind pose.")
    nullable..XrHandJointEXT.p("jointParents", "an array of joint parents to define a bone hierarchy for the hand skeleton.")
    AutoSize("vertexPositions", "vertexNormals", "vertexUVs", "vertexBlendIndices", "vertexBlendWeights", optional = true)..uint32_t("vertexCapacityInput", "the capacity of the vertex data arrays in this structure, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("vertexCountOutput", "filled in by the runtime with the count of vertex data elements written, or the required capacity in the case that any of {@code jointCapacityInput}, {@code vertexCapacityInput}, or {@code indexCapacityInput} is insufficient.")
    nullable..XrVector3f.p("vertexPositions", "an array of 3D vertex positions.")
    nullable..XrVector3f.p("vertexNormals", "an array of 3D vertex normals.")
    nullable..XrVector2f.p("vertexUVs", "an array of texture coordinates for this vertex.")
    nullable..XrVector4sFB.p("vertexBlendIndices", "an array of bone blend indices.")
    nullable..XrVector4f.p("vertexBlendWeights", "an array of bone blend weights.")
    AutoSize("indices", optional = true)..uint32_t("indexCapacityInput", "the capacity of the index data arrays in this structure, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("indexCountOutput", "filled in by the runtime with the count of index data elements written, or the required capacity in the case that any of {@code jointCapacityInput}, {@code vertexCapacityInput}, or {@code indexCapacityInput} is insufficient.")
    nullable..int16_t.p("indices", "an array of triangle indices.")
}

val XrHandTrackingScaleFB = struct(Module.OPENXR, "XrHandTrackingScaleFB", mutable = false) {
    documentation =
        """
        The information to query and modify hand joint overall scale.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBHandTrackingMesh XR_FB_hand_tracking_mesh} extension <b>must</b> be enabled prior to using ##XrHandTrackingScaleFB</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_TRACKING_SCALE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_HAND_TRACKING_SCALE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef
        """

    Expression("#TYPE_HAND_TRACKING_AIM_STATE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrHandTrackingAimFlagsFB("status", "a bitmask of {@code XrHandTrackingAimFlagBitsFB} describing the availability and state of other signals.")
    XrPosef("aimPose", "a system-determined \"aim\" pose, similar in intent and convention to the <a href=\"https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\\#aim-pose\">aim poses</a> used with the action system, based on hand data.")
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

    XrVector3f("points", "")["XR_HAND_TRACKING_CAPSULE_POINT_COUNT_FB"]
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrHandCapsuleFB
        """

    Expression("#TYPE_HAND_TRACKING_CAPSULES_STATE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrHandCapsuleFB("capsules", "an array of capsules.")["XR_HAND_TRACKING_CAPSULE_COUNT_FB"]
}

val XrSystemSpatialEntityPropertiesFB = struct(Module.OPENXR, "XrSystemSpatialEntityPropertiesFB", mutable = false) {
    documentation =
        """
        Properties object retrieved as part of next chain from xrGetSystemProperties.

        <h5>Description</h5>
        An application <b>can</b> inspect whether the system is capable of spatial entity operations by extending the ##XrSystemProperties with ##XrSystemSpatialEntityPropertiesFB structure when calling #GetSystemProperties().

        If a runtime returns #FALSE for {@code supportsSpatialEntity}, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #GetSpaceUuidFB().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to using ##XrSystemSpatialEntityPropertiesFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetSystemProperties()
        """

    Expression("#TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.").mutable()
    XrBool32("supportsSpatialEntity", "a boolean value that determines if spatial entities are supported by the system.")
}

val XrSpatialAnchorCreateInfoFB = struct(Module.OPENXR, "XrSpatialAnchorCreateInfoFB") {
    documentation =
        """
        Parameters to create a new spatial anchor.

        <h5>Description</h5>
        Parameters to create a new spatial anchor.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to using ##XrSpatialAnchorCreateInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #CreateSpatialAnchorFB()
        """

    Expression("#TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpace("space", "the {@code XrSpace} handle to the reference space that defines the {@code poseInSpace} of the anchor to be defined.")
    XrPosef("poseInSpace", "the ##XrPosef location and orientation of the Spatial Anchor in the specified reference space.")
    XrTime("time", "the {@code XrTime} timestamp associated with the specified pose.")
}

val XrSpaceComponentStatusSetInfoFB = struct(Module.OPENXR, "XrSpaceComponentStatusSetInfoFB") {
    documentation =
        """
        Request info to enable or disable an entity.

        <h5>Description</h5>
        Enables or disables the specified component for the specified spatial entity.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to using ##XrSpaceComponentStatusSetInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code componentType} <b>must</b> be a valid {@code XrSpaceComponentTypeFB} value</li>
        </ul>

        <h5>See Also</h5>
        #SetSpaceComponentStatusFB()
        """

    Expression("#TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpaceComponentTypeFB("componentType", "the component whose status is to be set.")
    XrBool32("enabled", "the value to set the component to.")
    XrDuration("timeout", "the number of nanoseconds before the operation should be cancelled. A value of #INFINITE_DURATION indicates to never time out. See <a href=\"https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\\#duration\">duration</a> for more details.")
}

val XrSpaceComponentStatusFB = struct(Module.OPENXR, "XrSpaceComponentStatusFB", mutable = false) {
    documentation =
        """
        Current status of an entity.

        <h5>Description</h5>
        It holds information on the current state of a component.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to using ##XrSpaceComponentStatusFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_COMPONENT_STATUS_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetSpaceComponentStatusFB()
        """

    Expression("#TYPE_SPACE_COMPONENT_STATUS_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrBool32("enabled", "a boolean value that determines if a component is currently enabled or disabled.")
    XrBool32("changePending", "a boolean value that determines if the component’s enabled state is about to change.")
}

val XrUuidEXT = struct(Module.OPENXR, "XrUuidEXT") {
    javaImport("static org.lwjgl.openxr.EXTUUIUD.*")
    documentation =
        """
        Universally Unique Identifier.

        <h5>Description</h5>
        The structure is composed of 16 octets, with the size and order of the fields defined in <a href="https://www.rfc-editor.org/rfc/rfc4122.html\#section-4.1.2">RFC 4122 section 4.1.2</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to using ##XrUuidEXT</li>
        </ul>

        <h5>See Also</h5>
        ##XrEventDataSpaceEraseCompleteFB, ##XrEventDataSpaceSaveCompleteFB, ##XrEventDataSpaceSetStatusCompleteFB, ##XrEventDataSpatialAnchorCreateCompleteFB, ##XrRoomLayoutFB, ##XrSpaceContainerFB, ##XrSpaceQueryResultFB, ##XrSpaceUuidFilterInfoFB, ##XrSystemHeadsetIdPropertiesMETA, #GetSpaceUuidFB()
        """

    uint8_t("data", "a 128-bit Universally Unique Identifier.")["XR_UUID_SIZE_EXT"]
}

val XrEventDataSpatialAnchorCreateCompleteFB = struct(Module.OPENXR, "XrEventDataSpatialAnchorCreateCompleteFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Result of request to create a new spatial anchor.

        <h5>Description</h5>
        It describes the result of a request to create a new spatial anchor. Once this event is posted, it is the applications responsibility to take ownership of the {@code XrSpace}. The {@code XrSession} passed into #CreateSpatialAnchorFB() is the parent handle of the newly created {@code XrSpace}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to using ##XrEventDataSpatialAnchorCreateCompleteFB</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrEventDataBaseHeader, ##XrEventDataBuffer, ##XrUuidEXT, #PollEvent()
        """

    Expression("#TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrAsyncRequestIdFB("requestId", "the ID of the asynchronous request used to create a new spatial anchor.")
    XrResult("result", "an {@code XrResult} that determines if the request succeeded or if an error occurred.")
    XrSpace("space", "the {@code XrSpace} handle to the newly created spatial anchor.")
    XrUuidEXT("uuid", "the UUID of the newly created spatial anchor.")
}

val XrEventDataSpaceSetStatusCompleteFB = struct(Module.OPENXR, "XrEventDataSpaceSetStatusCompleteFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Result of request to enable or disable a component.

        <h5>Description</h5>
        It describes the result of a request to enable or disable a component of a spatial entity.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to using ##XrEventDataSpaceSetStatusCompleteFB</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrUuidEXT
        """

    Expression("#TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrAsyncRequestIdFB("requestId", "the ID of the asynchronous request used to enable or disable a component.")
    XrResult("result", "an {@code XrResult} that describes whether the request succeeded or if an error occurred.")
    XrSpace("space", "the {@code XrSpace} handle to the spatial entity.")
    XrUuidEXT("uuid", "the UUID of the spatial entity.")
    XrSpaceComponentTypeFB("componentType", "the type of component being enabled or disabled.")
    XrBool32("enabled", "a boolean value indicating whether the component is now enabled or disabled.")
}

val XrFoveationProfileCreateInfoFB = struct(Module.OPENXR, "XrFoveationProfileCreateInfoFB") {
    documentation =
        """
        The information to create a foveation profile.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFoveation XR_FB_foveation} extension <b>must</b> be enabled prior to using ##XrFoveationProfileCreateInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_FOVEATION_PROFILE_CREATE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrFoveationLevelProfileCreateInfoFB</li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrFoveationEyeTrackedProfileCreateInfoMETA</li>
            <li>{@code level} <b>must</b> be a valid {@code XrFoveationLevelFB} value</li>
            <li>{@code dynamic} <b>must</b> be a valid {@code XrFoveationDynamicFB} value</li>
        </ul>
        """

    Expression("#TYPE_FOVEATION_LEVEL_PROFILE_CREATE_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrFoveationEyeTrackedProfileCreateInfoMETA",
        prepend = true
    )..nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrFoveationLevelFB("level", "the maximum desired foveation level.")
    float("verticalOffset", "the desired vertical offset in degrees for the center of the foveation pattern.")
    XrFoveationDynamicFB("dynamic", "the desired dynamic foveation setting.")
}

val XrSystemKeyboardTrackingPropertiesFB = struct(Module.OPENXR, "XrSystemKeyboardTrackingPropertiesFB", mutable = false) {
    documentation =
        """
        Information from the system about tracked keyboard support.

        <h5>Description</h5>
        ##XrSystemKeyboardTrackingPropertiesFB is populated with information from the system about tracked keyboard support.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBKeyboardTracking XR_FB_keyboard_tracking} extension <b>must</b> be enabled prior to using ##XrSystemKeyboardTrackingPropertiesFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSystemProperties
        """

    Expression("#TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
        Mesh buffers <b>can</b> be updated between #TriangleMeshBeginUpdateFB() and #TriangleMeshEndUpdateFB() calls.

        If the mesh is non-mutable, {@code vertexBuffer} <b>must</b> be a pointer to an array of {@code vertexCount} ##XrVector3f structures. If the mesh is non-mutable, {@code indexBuffer} <b>must</b> be a pointer to an array of 3 * {@code triangleCount} {@code uint32_t} vertex indices.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to using ##XrTriangleMeshCreateInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_TRIANGLE_MESH_CREATE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be 0 or a valid combination of {@code XrTriangleMeshFlagBitsFB} values</li>
            <li>{@code windingOrder} <b>must</b> be a valid {@code XrWindingOrderFB} value</li>
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

val XrSystemPassthroughPropertiesFB = struct(Module.OPENXR, "XrSystemPassthroughPropertiesFB", mutable = false) {
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB")..XrStructureType("type", "").mutable()
    nullable..opaque_const_p("next", "").mutable()
    XrBool32("supportsPassthrough", "")
}

val XrSystemPassthroughProperties2FB = struct(Module.OPENXR, "XrSystemPassthroughProperties2FB", mutable = false) {
    documentation =
        """
        Passthrough system properties.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code type} is the {@code XrStructureType} of this structure.</li>
            <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
            <li>{@code capabilities} defines a set of features supported by the passthrough system.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using ##XrSystemPassthroughProperties2FB</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_PASSTHROUGH_PROPERTIES2_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_SYSTEM_PASSTHROUGH_PROPERTIES2_FB")..XrStructureType("type", "").mutable()
    nullable..opaque_const_p("next", "").mutable()
    XrPassthroughCapabilityFlagsFB("capabilities", "")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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

        <h5>Description</h5>
        ##XrPassthroughStyleFB lets applications customize the appearance of passthrough layers. In addition to the parameters specified here, applications <b>may</b> add one of the following structures to the structure chain: ##XrPassthroughColorMapMonoToRgbaFB, ##XrPassthroughColorMapMonoToMonoFB, ##XrPassthroughBrightnessContrastSaturationFB. These structures are mutually exclusive. The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if more than one of them are present in the structure chain.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using ##XrPassthroughStyleFB</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_STYLE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrPassthroughBrightnessContrastSaturationFB, ##XrPassthroughColorMapInterpolatedLutMETA, ##XrPassthroughColorMapLutMETA, ##XrPassthroughColorMapMonoToMonoFB, ##XrPassthroughColorMapMonoToRgbaFB</li>
        </ul>

        <h5>See Also</h5>
        ##XrColor4f, #PassthroughLayerSetStyleFB()
        """

    Expression("#TYPE_PASSTHROUGH_STYLE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrPassthroughBrightnessContrastSaturationFB", "XrPassthroughColorMapInterpolatedLutMETA", "XrPassthroughColorMapLutMETA", "XrPassthroughColorMapMonoToMonoFB", "XrPassthroughColorMapMonoToRgbaFB",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    float("textureOpacityFactor", "the opacity of the passthrough imagery in the range [0, 1].")
    XrColor4f("edgeColor", "the ##XrColor4f that defines the edge rendering color. Edges are detected in the original passthrough imagery and rendered on top of it. Edge rendering is disabled when the alpha value of {@code edgeColor} is zero.")
}

val XrPassthroughColorMapMonoToRgbaFB = struct(Module.OPENXR, "XrPassthroughColorMapMonoToRgbaFB") {
    javaImport("static org.lwjgl.openxr.FBPassthrough.*")
    documentation =
        """
        A layer color map.

        <h5>Description</h5>
        ##XrPassthroughColorMapMonoToRgbaFB lets applications define a map which replaces each input luminance value in the passthrough imagery with an RGBA color value. The map is applied before any additional effects (such as edges) are rendered on top.

        ##XrPassthroughColorMapMonoToRgbaFB is provided in the {@code next} chain of ##XrPassthroughStyleFB.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using ##XrPassthroughColorMapMonoToRgbaFB</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrColor4f
        """

    Expression("#TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrColor4f("textureColorMap", "an array of ##XrColor4f colors to which the passthrough imagery luminance values are mapped.")["XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB"]
}

val XrPassthroughColorMapMonoToMonoFB = struct(Module.OPENXR, "XrPassthroughColorMapMonoToMonoFB") {
    javaImport("static org.lwjgl.openxr.FBPassthrough.*")
    documentation =
        """
        A layer color map.

        <h5>Description</h5>
        ##XrPassthroughColorMapMonoToMonoFB lets applications define a map which replaces each input luminance value in the passthrough imagery with a grayscale color value defined in {@code textureColorMap}. The map is applied before any additional effects (such as edges) are rendered on top.

        ##XrPassthroughColorMapMonoToMonoFB is provided in the {@code next} chain of ##XrPassthroughStyleFB.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using ##XrPassthroughColorMapMonoToMonoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    uint8_t("textureColorMap", "an array of {@code uint8_t} grayscale color values to which the passthrough luminance values are mapped.")["XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB"]
}

val XrPassthroughBrightnessContrastSaturationFB = struct(Module.OPENXR, "XrPassthroughBrightnessContrastSaturationFB") {
    documentation =
        """
        A color adjustment for passthrough layers.

        <h5>Description</h5>
        ##XrPassthroughBrightnessContrastSaturationFB lets applications adjust the brightness, contrast, and saturation of passthrough layers. The adjustments only are applied before any additional effects (such as edges) are rendered on top.

        The adjustments are applied in CIELAB color space (white point D65) using the following formulas:

        <ul>
            <li><code>L*' = clamp((L* - 50) × contrast + 50, 0, 100)</code></li>
            <li><code>L*'' = clamp(L*' + brightness, 0, 100)</code></li>
            <li><code>(a*', b*') = (a*, b*) × saturation</code></li>
            <li>Resulting color: (L*'', a*', b*')</li>
        </ul>

        ##XrPassthroughBrightnessContrastSaturationFB is provided in the {@code next} chain of ##XrPassthroughStyleFB.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using ##XrPassthroughBrightnessContrastSaturationFB</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_BRIGHTNESS_CONTRAST_SATURATION_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_PASSTHROUGH_BRIGHTNESS_CONTRAST_SATURATION_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    float("brightness", "the brightness adjustment value in the range [-100, 100]. The neutral element is 0.")
    float("contrast", "the contrast adjustment value in the range [0, Infinity]. The neutral element is 1.")
    float("saturation", "the saturation adjustment value in the range [0, Infinity]. The neutral element is 1.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
                    <li>pathname:/model_meta/keyboard/virtual (if the {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension is enabled)</li>
                </ul>
            </li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to using ##XrRenderModelPathInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_RENDER_MODEL_PATH_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code modelName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to #MAX_RENDER_MODEL_NAME_SIZE_FB</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code XrRenderModelFlagBitsFB} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        #GetRenderModelPropertiesFB()
        """

    Expression("#TYPE_RENDER_MODEL_PROPERTIES_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. ##XrRenderModelCapabilitiesRequestFB is a structure in this structure chain and <b>should</b> be linked when this structure is passed to #GetRenderModelPropertiesFB().")
    uint32_t("vendorId", "the vendor id of the model.")
    charUTF8("modelName", "the name of the model.")["XR_MAX_RENDER_MODEL_NAME_SIZE_FB"]
    XrRenderModelKeyFB("modelKey", "the unique model key used to load the model in #LoadRenderModelFB().")
    uint32_t("modelVersion", "the version number of the model.")
    XrRenderModelFlagsFB("flags", "a bitmask of {@code XrRenderModelFlagsFB}. After a successful call to #GetRenderModelPropertiesFB(), flags must contain the support level of the model and no other support levels.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} {@code uint8_t} values</li>
        </ul>

        <h5>See Also</h5>
        #LoadRenderModelFB()
        """

    Expression("#TYPE_RENDER_MODEL_BUFFER_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("buffer", optional = true)..uint32_t("bufferCapacityInput", "the capacity of the {@code buffer}, or 0 to retrieve the required capacity.")
    uint32_t("bufferCountOutput", "the count of {@code uint8_t} {@code buffer} written, or the required capacity in the case that {@code bufferCapacityInput} is insufficient.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #LoadRenderModelFB()
        """

    Expression("#TYPE_RENDER_MODEL_LOAD_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrRenderModelKeyFB("modelKey", "the unique model key for a connected device.")
}

val XrSystemRenderModelPropertiesFB = struct(Module.OPENXR, "XrSystemRenderModelPropertiesFB", mutable = false) {
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB")..XrStructureType("type", "").mutable()
    nullable..opaque_p("next", "").mutable()
    XrBool32("supportsRenderModelLoading", "")
}

val XrRenderModelCapabilitiesRequestFB = struct(Module.OPENXR, "XrRenderModelCapabilitiesRequestFB", mutable = false) {
    documentation =
        """
        A render model system property.

        <h5>Description</h5>
        ##XrRenderModelCapabilitiesRequestFB contains information about the render capabilities requested for a model. ##XrRenderModelCapabilitiesRequestFB <b>must</b> be set in the structure chain of the {@code next} pointer on the ##XrRenderModelPropertiesFB passed into the #GetRenderModelPropertiesFB() call. The {@code flags} on ##XrRenderModelCapabilitiesRequestFB represent an acknowledgement of being able to handle the individual model capability levels. If no ##XrRenderModelCapabilitiesRequestFB is on the structure chain then the runtime <b>should</b> treat it as if a value of #RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_1_BIT_FB was set. If the runtime does not have a model available that matches any of the supports flags set, then it <b>must</b> return a #RENDER_MODEL_UNAVAILABLE_FB result.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to using ##XrRenderModelCapabilitiesRequestFB</li>
            <li>{@code type} <b>must</b> be #TYPE_RENDER_MODEL_CAPABILITIES_REQUEST_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_RENDER_MODEL_CAPABILITIES_REQUEST_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrRenderModelFlagsFB("flags", "a bit mask of the model complexities that the application is able to support.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code bindingModificationCount} is not 0, {@code bindingModifications} <b>must</b> be a pointer to an array of {@code bindingModificationCount} valid ##XrBindingModificationBaseHeaderKHR-based structures. See also: ##XrInteractionProfileAnalogThresholdVALVE, ##XrInteractionProfileDpadBindingEXT</li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
        Applications using this extension are encouraged to create two sets of swapchains or one big enough set of swapchains and two sets of viewports. One set will be used when rendering gaze is not available and other one will be used when foveated rendering and rendering gaze is available. Using foveated textures <b>may</b> not provide optimal visual quality when rendering gaze is not available.

        <h5>See Also</h5>
        ##XrViewConfigurationView
        """

    Expression("#TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrBool32("foveatedRenderingActive", "an {@code XrBool32}, indicating if the runtime should return foveated view configuration view.")
}

val XrSystemFoveatedRenderingPropertiesVARJO = struct(Module.OPENXR, "XrSystemFoveatedRenderingPropertiesVARJO", mutable = false) {
    documentation =
        """
        System property for foveated rendering.

        <h5>Description</h5>
        The runtime <b>should</b> return #TRUE for {@code supportsFoveatedRendering} when rendering gaze is available in the system. An application <b>should</b> avoid using foveated rendering functionality when {@code supportsFoveatedRendering} is #FALSE.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOFoveatedRendering XR_VARJO_foveated_rendering} extension <b>must</b> be enabled prior to using ##XrSystemFoveatedRenderingPropertiesVARJO</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #EndFrame()
        """

    Expression("#TYPE_COMPOSITION_LAYER_DEPTH_TEST_VARJO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    float("depthTestRangeNearZ", "in a non-negative distance in meters that specifies the lower bound of the range where depth testing should be performed. Must be less than {@code depthTestRangeFarZ}. Value of zero means that there is no lower bound.")
    float("depthTestRangeFarZ", "a positive distance in meters that specifies the upper bound of the range where depth testing should be performed. Must be greater than {@code depthTestRangeNearZ}. Value of floating point positive infinity means that there is no upper bound.")
}

val XrSystemMarkerTrackingPropertiesVARJO = struct(Module.OPENXR, "XrSystemMarkerTrackingPropertiesVARJO", mutable = false) {
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSystemProperties, #GetSystemProperties()
        """

    Expression("#TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.").mutable()
    XrBool32("supportsMarkerTracking", "an {@code XrBool32}, indicating if current system is capable of performing marker tracking.")
}

val XrEventDataMarkerTrackingUpdateVARJO = struct(Module.OPENXR, "XrEventDataMarkerTrackingUpdateVARJO", mutable = false, parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Structure representing marker tracking information.

        <h5>Description</h5>
        Receiving the ##XrEventDataMarkerTrackingUpdateVARJO event structure indicates that the tracking information has changed. The runtime <b>must</b> not send more than one event per frame per marker. The runtime <b>must</b> send an event if the marker has changed its state (active or inactive). The runtime <b>must</b> send an event if it has detected pose change of the active marker.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to using ##XrEventDataMarkerTrackingUpdateVARJO</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #PollEvent()
        """

    Expression("#TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #CreateMarkerSpaceVARJO()
        """

    Expression("#TYPE_MARKER_SPACE_CREATE_INFO_VARJO")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    uint64_t("markerId", "unique identifier of the marker.")
    XrPosef("poseInMarkerSpace", "an ##XrPosef defining the position and orientation of the new space’s origin relative to the marker’s natural origin.")
}

val XrFrameEndInfoML = struct(Module.OPENXR, "XrFrameEndInfoML") {
    documentation =
        """
        Per frame configuration parameters.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLFrameEndInfo XR_ML_frame_end_info} extension <b>must</b> be enabled prior to using ##XrFrameEndInfoML</li>
            <li>{@code type} <b>must</b> be #TYPE_FRAME_END_INFO_ML</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be 0 or a valid combination of {@code XrFrameEndInfoFlagBitsML} values</li>
        </ul>
        """

    Expression("#TYPE_FRAME_END_INFO_ML")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    float("focusDistance", "the distance, in meters, to defined focus point for the client content. The focus distance is interpreted as the positive distance to the client-determined object of interest (relative to the forward vector of the Lightwear).")
    XrFrameEndInfoFlagsML("flags", "a bitmask of {@code XrFrameEndInfoFlagsML}")
}

val XrGlobalDimmerFrameEndInfoML = struct(Module.OPENXR, "XrGlobalDimmerFrameEndInfoML") {
    documentation =
        """
        Global Dimmer End Frame Information.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLGlobalDimmer XR_ML_global_dimmer} extension <b>must</b> be enabled prior to using ##XrGlobalDimmerFrameEndInfoML</li>
            <li>{@code type} <b>must</b> be #TYPE_GLOBAL_DIMMER_FRAME_END_INFO_ML</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be 0 or a valid combination of {@code XrGlobalDimmerFrameEndInfoFlagBitsML} values</li>
        </ul>
        """

    Expression("#TYPE_GLOBAL_DIMMER_FRAME_END_INFO_ML")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    float("dimmerValue", "a value between 0.0 (transparent) and 1.0 (opaque). The runtime <b>may</b> adjust the dimmerValue used during composition at the runtime’s discretion. This <b>may</b> be done for user safety, display performance, or other reasons. Values outside of the range are silently clamped.")
    XrGlobalDimmerFrameEndInfoFlagsML("flags", "a bitmask of {@code XrGlobalDimmerFrameEndInfoFlagsML}")
}

val XrCoordinateSpaceCreateInfoML = struct(Module.OPENXR, "XrCoordinateSpaceCreateInfoML") {
    documentation =
        """
        Structure used to create an XrSpace from a cfuid.

        <h5>Description</h5>
        ##XrCoordinateSpaceCreateInfoML is provided as input when calling #CreateSpaceFromCoordinateFrameUIDML() to convert a Magic Leap SDK generated {@code MLCoordinateFrameUID} to an {@code XrSpace}. The conversion only needs to be done once even if the underlying {@code MLCoordinateFrameUID} changes its pose.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLCompat XR_ML_compat} extension <b>must</b> be enabled prior to using ##XrCoordinateSpaceCreateInfoML</li>
            <li>{@code type} <b>must</b> be #TYPE_COORDINATE_SPACE_CREATE_INFO_ML</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code cfuid} <b>must</b> be a valid {@code MLCoordinateFrameUID} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #CreateSpaceFromCoordinateFrameUIDML()
        """

    Expression("#TYPE_COORDINATE_SPACE_CREATE_INFO_ML")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    MLCoordinateFrameUID("cfuid", "the {@code MLCoordinateFrameUID} as generated by the non-OpenXR API in the Magic Leap SDK.")
    XrPosef("poseInCoordinateSpace", "an ##XrPosef defining the position and orientation of the new space’s origin within the natural reference frame of the {@code cfuid}.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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

val XrSpaceQueryInfoBaseHeaderFB = struct(Module.OPENXR, "XrSpaceQueryInfoBaseHeaderFB") {
    documentation =
        """
        Base structure for all query info structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using ##XrSpaceQueryInfoBaseHeaderFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_QUERY_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSpaceQueryInfoFB, #QuerySpacesFB()
        """

    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
}

val XrSpaceFilterInfoBaseHeaderFB = struct(Module.OPENXR, "XrSpaceFilterInfoBaseHeaderFB") {
    documentation =
        """
        Base structure for all query filter structures.

        <h5>Description</h5>
        The ##XrSpaceFilterInfoBaseHeaderFB is a base structure that is not intended to be directly used, but forms a basis for specific filter info types. All filter info structures begin with the elements described in the ##XrSpaceFilterInfoBaseHeaderFB, and a filter info pointer <b>must</b> be cast to a pointer to ##XrSpaceFilterInfoBaseHeaderFB when populating ##XrSpaceQueryInfoFB{@code ::filter} and ##XrSpaceQueryInfoFB{@code ::excludeFilter} to pass to the #QuerySpacesFB() function.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using ##XrSpaceFilterInfoBaseHeaderFB</li>
            <li>{@code type} <b>must</b> be one of the following XrStructureType values: #TYPE_SPACE_COMPONENT_FILTER_INFO_FB, #TYPE_SPACE_UUID_FILTER_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrSpaceStorageLocationFilterInfoFB</li>
        </ul>

        <h5>See Also</h5>
        ##XrSpaceQueryInfoFB
        """

    XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrSpaceStorageLocationFilterInfoFB",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. This base structure itself has no associated {@code XrStructureType} value.")
}

val XrSpaceQueryInfoFB = struct(Module.OPENXR, "XrSpaceQueryInfoFB", parentStruct = XrSpaceQueryInfoBaseHeaderFB) {
    documentation =
        """
        Query for entities and perform an action on any results.

        <h5>Description</h5>
        May be used to query for spaces and perform a specific action on the spaces returned. The available actions are enumerated in {@code XrSpaceQueryActionFB}. The filter info provided to the {@code filter} member of the struct is used as an inclusive filter. The filter info provided to the {@code excludeFilter} member of the structure is used to exclude spaces from the results returned from the filter. All spaces that match the criteria in {@code filter}, and that do not match the criteria in {@code excludeFilter}, <b>must</b> be included in the results returned. This is to allow for a more selective style query.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using ##XrSpaceQueryInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_QUERY_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code queryAction} <b>must</b> be a valid {@code XrSpaceQueryActionFB} value</li>
            <li>If {@code filter} is not {@code NULL}, {@code filter} <b>must</b> be a pointer to a valid ##XrSpaceFilterInfoBaseHeaderFB-based structure. See also: ##XrSpaceComponentFilterInfoFB, ##XrSpaceUuidFilterInfoFB</li>
            <li>If {@code excludeFilter} is not {@code NULL}, {@code excludeFilter} <b>must</b> be a pointer to a valid ##XrSpaceFilterInfoBaseHeaderFB-based structure. See also: ##XrSpaceComponentFilterInfoFB, ##XrSpaceUuidFilterInfoFB</li>
        </ul>

        <h5>See Also</h5>
        ##XrSpaceFilterInfoBaseHeaderFB, ##XrSpaceQueryInfoBaseHeaderFB
        """

    Expression("#TYPE_SPACE_QUERY_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpaceQueryActionFB("queryAction", "the type of query to perform.")
    uint32_t("maxResultCount", "the maximum number of entities to be found.")
    XrDuration("timeout", "the number of nanoseconds before the operation should time out. A value of #INFINITE_DURATION indicates no timeout.")
    nullable..XrSpaceFilterInfoBaseHeaderFB.const.p("filter", "NULL or a pointer to a valid structure based on ##XrSpaceFilterInfoBaseHeaderFB.")
    nullable..XrSpaceFilterInfoBaseHeaderFB.const.p("excludeFilter", "NULL or a pointer to a valid structure based on ##XrSpaceFilterInfoBaseHeaderFB.")
}

val XrSpaceStorageLocationFilterInfoFB = struct(Module.OPENXR, "XrSpaceStorageLocationFilterInfoFB") {
    documentation =
        """
        Describes where a spatial entity is stored.

        <h5>Description</h5>
        Extends a query filter to limit a query to a specific storage location. Set the {@code next} pointer of an ##XrSpaceFilterInfoBaseHeaderFB to chain this extra filtering functionality.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using ##XrSpaceStorageLocationFilterInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code location} <b>must</b> be a valid {@code XrSpaceStorageLocationFB} value</li>
        </ul>
        """

    Expression("#TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpaceStorageLocationFB("location", "the location to limit the query to.")
}

val XrSpaceUuidFilterInfoFB = struct(Module.OPENXR, "XrSpaceUuidFilterInfoFB", parentStruct = XrSpaceFilterInfoBaseHeaderFB) {
    documentation =
        """
        Filters for entities with specific unique identifiers.

        <h5>Description</h5>
        The ##XrSpaceUuidFilterInfoFB structure is a filter an application <b>can</b> use to find {@code XrSpace} entities that match specified UUIDs, to include or exclude them from a query.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using ##XrSpaceUuidFilterInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_UUID_FILTER_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code uuids} <b>must</b> be a pointer to an array of {@code uuidCount} ##XrUuidEXT structures</li>
            <li>The {@code uuidCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrSpaceFilterInfoBaseHeaderFB, ##XrSpaceQueryInfoFB, ##XrUuidEXT
        """

    Expression("#TYPE_SPACE_UUID_FILTER_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("uuids")..uint32_t("uuidCount", "the number of UUIDs to be matched.")
    XrUuidEXT.p("uuids", "an array of ##XrUuidEXT that contains the UUIDs to be matched.")
}

val XrSpaceComponentFilterInfoFB = struct(Module.OPENXR, "XrSpaceComponentFilterInfoFB", parentStruct = XrSpaceFilterInfoBaseHeaderFB) {
    documentation =
        """
        Filters for entities with specific components enabled.

        <h5>Description</h5>
        The ##XrSpaceComponentFilterInfoFB structure is a filter an application <b>can</b> use to find {@code XrSpace} entities which have the {@code componentType} enabled, to include or exclude them from a query.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using ##XrSpaceComponentFilterInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_COMPONENT_FILTER_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code componentType} <b>must</b> be a valid {@code XrSpaceComponentTypeFB} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrSpaceFilterInfoBaseHeaderFB, ##XrSpaceQueryInfoFB
        """

    Expression("#TYPE_SPACE_COMPONENT_FILTER_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpaceComponentTypeFB("componentType", "the {@code XrSpaceComponentTypeFB} to query for.")
}

val XrSpaceQueryResultFB = struct(Module.OPENXR, "XrSpaceQueryResultFB", mutable = false) {
    documentation =
        """
        Query result.

        <h5>Description</h5>
        The ##XrSpaceQueryResultFB structure is a query result returned in the {@code results} output parameter of the #RetrieveSpaceQueryResultsFB() function.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using ##XrSpaceQueryResultFB</li>
        </ul>

        <h5>See Also</h5>
        ##XrSpaceQueryResultsFB, ##XrUuidEXT
        """

    XrSpace("space", "the {@code XrSpace} handle to the spatial entity found by the query.")
    XrUuidEXT("uuid", "the UUID that identifies the entity.")
}

val XrSpaceQueryResultsFB = struct(Module.OPENXR, "XrSpaceQueryResultsFB") {
    documentation =
        """
        Used to retrieve query results.

        <h5>Description</h5>
        The ##XrSpaceQueryResultsFB structure is used by the #RetrieveSpaceQueryResultsFB() function to retrieve query results.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using ##XrSpaceQueryResultsFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_QUERY_RESULTS_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code resultCapacityInput} is not 0, {@code results} <b>must</b> be a pointer to an array of {@code resultCapacityInput} ##XrSpaceQueryResultFB structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrSpaceQueryResultFB, #RetrieveSpaceQueryResultsFB()
        """

    Expression("#TYPE_SPACE_QUERY_RESULTS_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("results", optional = true)..uint32_t("resultCapacityInput", "the capacity of the {@code results} array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("resultCountOutput", "an output parameter containing the count of results retrieved, or returns the required capacity in the case that {@code resultCapacityInput} is insufficient.")
    nullable..XrSpaceQueryResultFB.p("results", "a pointer to an array of results, but <b>can</b> be {@code NULL} if {@code resultCapacityInput} is 0.")
}

val XrEventDataSpaceQueryResultsAvailableFB = struct(Module.OPENXR, "XrEventDataSpaceQueryResultsAvailableFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Event indicating a query has produced results.

        <h5>Description</h5>
        It indicates a query request has produced some number of results. If a query yields results this event <b>must</b> be delivered before the ##XrEventDataSpaceQueryCompleteFB event is delivered. Call #RetrieveSpaceQueryResultsFB() to retrieve those results.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using ##XrEventDataSpaceQueryResultsAvailableFB</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrAsyncRequestIdFB("requestId", "the ID of the asynchronous query request.")
}

val XrEventDataSpaceQueryCompleteFB = struct(Module.OPENXR, "XrEventDataSpaceQueryCompleteFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Event indicating a query has finished.

        <h5>Description</h5>
        It indicates a query request has completed and specifies the request result. This event <b>must</b> be delivered when a query has completed, regardless of the number of results found. If any results have been found, then this event <b>must</b> be delivered after any ##XrEventDataSpaceQueryResultsAvailableFB events have been delivered.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using ##XrEventDataSpaceQueryCompleteFB</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_SPACE_QUERY_COMPLETE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_EVENT_DATA_SPACE_QUERY_COMPLETE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrAsyncRequestIdFB("requestId", "the ID of the asynchronous query request.")
    XrResult("result", "an {@code XrResult} that determines if the request succeeded or if an error occurred.")
}

val XrSpaceSaveInfoFB = struct(Module.OPENXR, "XrSpaceSaveInfoFB") {
    documentation =
        """
        Parameters for a save operation.

        <h5>Description</h5>
        The ##XrSpaceSaveInfoFB structure contains information used to save the spatial entity.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityStorage XR_FB_spatial_entity_storage} extension <b>must</b> be enabled prior to using ##XrSpaceSaveInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_SAVE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code location} <b>must</b> be a valid {@code XrSpaceStorageLocationFB} value</li>
            <li>{@code persistenceMode} <b>must</b> be a valid {@code XrSpacePersistenceModeFB} value</li>
        </ul>

        <h5>See Also</h5>
        #SaveSpaceFB()
        """

    Expression("#TYPE_SPACE_SAVE_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpace("space", "the {@code XrSpace} handle to the reference space that defines the {@code poseInSpace} of the entity to be saved.")
    XrSpaceStorageLocationFB("location", "the storage location.")
    XrSpacePersistenceModeFB("persistenceMode", "the persistence mode.")
}

val XrSpaceEraseInfoFB = struct(Module.OPENXR, "XrSpaceEraseInfoFB") {
    documentation =
        """
        Parameters for an erase operation.

        <h5>Description</h5>
        The ##XrSpaceEraseInfoFB structure contains information used to erase the spatial entity.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityStorage XR_FB_spatial_entity_storage} extension <b>must</b> be enabled prior to using ##XrSpaceEraseInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_ERASE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code location} <b>must</b> be a valid {@code XrSpaceStorageLocationFB} value</li>
        </ul>

        <h5>See Also</h5>
        #EraseSpaceFB()
        """

    Expression("#TYPE_SPACE_ERASE_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpace("space", "the {@code XrSpace} handle to the reference space that defines the entity to be erased.")
    XrSpaceStorageLocationFB("location", "the storage location.")
}

val XrEventDataSpaceSaveCompleteFB = struct(Module.OPENXR, "XrEventDataSpaceSaveCompleteFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Describes the result of a save operation.

        <h5>Description</h5>
        The save result event contains the success of the save/write operation to the specified location, as well as the {@code XrSpace} handle on which the save operation was attempted on, the unique UUID, and the triggered async request ID from the initial calling function.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityStorage XR_FB_spatial_entity_storage} extension <b>must</b> be enabled prior to using ##XrEventDataSpaceSaveCompleteFB</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrUuidEXT
        """

    Expression("#TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrAsyncRequestIdFB("requestId", "the ID of the asynchronous request to save an entity.")
    XrResult("result", "an {@code XrResult} that describes whether the request succeeded or if an error occurred.")
    XrSpace("space", "the spatial entity being saved.")
    XrUuidEXT("uuid", "the UUID for the spatial entity being saved.")
    XrSpaceStorageLocationFB("location", "the location of the spatial entity being saved.")
}

val XrEventDataSpaceEraseCompleteFB = struct(Module.OPENXR, "XrEventDataSpaceEraseCompleteFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Describes the result of a save operation.

        <h5>Description</h5>
        The erase result event contains the success of the erase operation from the specified storage location. It also provides the UUID of the entity and the async request ID from the initial calling function.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityStorage XR_FB_spatial_entity_storage} extension <b>must</b> be enabled prior to using ##XrEventDataSpaceEraseCompleteFB</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_SPACE_ERASE_COMPLETE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrUuidEXT
        """

    Expression("#TYPE_EVENT_DATA_SPACE_ERASE_COMPLETE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrAsyncRequestIdFB("requestId", "the ID of the asynchronous request to erase an entity.")
    XrResult("result", "an {@code XrResult} that describes whether the request succeeded or if an error occurred.")
    XrSpace("space", "the spatial entity being erased.")
    XrUuidEXT("uuid", "the UUID for the spatial entity being erased.")
    XrSpaceStorageLocationFB("location", "the location of the spatial entity being erased.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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

val XrSpaceShareInfoFB = struct(Module.OPENXR, "XrSpaceShareInfoFB") {
    documentation =
        """
        Describes a request to share some number of spatial entities.

        <h5>Description</h5>
        The ##XrSpaceShareInfoFB structure describes a request to share one or more spatial entities with one or more users.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntitySharing XR_FB_spatial_entity_sharing} extension <b>must</b> be enabled prior to using ##XrSpaceShareInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_SHARE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code spaces} <b>must</b> be a pointer to an array of {@code spaceCount} {@code XrSpace} handles</li>
            <li>{@code users} <b>must</b> be a pointer to an array of {@code userCount} {@code XrSpaceUserFB} handles</li>
            <li>The {@code spaceCount} parameter <b>must</b> be greater than 0</li>
            <li>The {@code userCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        #ShareSpacesFB()
        """

    Expression("#TYPE_SPACE_SHARE_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. {@code spaceCount} is the number of elements in the {@code spaces} list. {@code spaces} is a list containing all spatial entities to be shared. {@code userCount} is the number of elements in the {@code users} list. {@code users} is a list of the users with which the {@code spaces} will: be shared.")
    AutoSize("spaces")..uint32_t("spaceCount", "")
    XrSpace.p("spaces", "")
    AutoSize("users")..uint32_t("userCount", "")
    XrSpaceUserFB.p("users", "")
}

val XrEventDataSpaceShareCompleteFB = struct(Module.OPENXR, "XrEventDataSpaceShareCompleteFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Completion of request to share one or more spatial entities.

        <h5>Description</h5>
        It indicates that the request to share one or more spatial entities has completed. The application <b>can</b> use {@code result} to check if the request was successful or if an error occurred.

        <h5>Result Codes</h5>
        <dl>
            <dt>On success, the value of this parameter is</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, the value of this parameter is</dt>
            <dd><ul>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_SPACE_MAPPING_INSUFFICIENT_FB</li>
                <li>#ERROR_SPACE_LOCALIZATION_FAILED_FB</li>
                <li>#ERROR_SPACE_NETWORK_TIMEOUT_FB</li>
                <li>#ERROR_SPACE_NETWORK_REQUEST_FAILED_FB</li>
                <li>#ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB</li>
            </ul></dd>
        </dl>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntitySharing XR_FB_spatial_entity_sharing} extension <b>must</b> be enabled prior to using ##XrEventDataSpaceShareCompleteFB</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrAsyncRequestIdFB("requestId", "the ID of the asynchronous request used to share the spatial entities.")
    XrResult("result", "an {@code XrResult} that describes whether the request succeeded or if an error occurred.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code layerFlags} <b>must</b> be 0 or a valid combination of {@code XrCompositionLayerSpaceWarpInfoFlagBitsFB} values</li>
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

val XrSystemSpaceWarpPropertiesFB = struct(Module.OPENXR, "XrSystemSpaceWarpPropertiesFB", mutable = false) {
    documentation =
        """
        Composition Layer Space Warp structure.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpaceWarp XR_FB_space_warp} extension <b>must</b> be enabled prior to using ##XrSystemSpaceWarpPropertiesFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_SPACE_WARP_PROPERTIES_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSystemProperties
        """

    Expression("#TYPE_SYSTEM_SPACE_WARP_PROPERTIES_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.").mutable()
    uint32_t("recommendedMotionVectorImageRectWidth", "recommended motion vector and depth image width")
    uint32_t("recommendedMotionVectorImageRectHeight", "recommended motion vector and depth image height")
}

val XrHapticAmplitudeEnvelopeVibrationFB = struct(Module.OPENXR, "XrHapticAmplitudeEnvelopeVibrationFB", parentStruct = XrHapticBaseHeader) {
    documentation =
        """
        Haptic Effect Description.

        <h5>Member Descriptions</h5>
        <ul>
            <li>{@code type} is the {@code XrStructureType} of this structure.</li>
            <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain.</li>
            <li>{@code duration} is the duration of the haptic effect in nanoseconds. See <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#duration">duration</a> for more details.</li>
            <li>{@code amplitudeCount} is the number of samples in the buffer.</li>
            <li>{@code amplitudes} is the pointer to a float array that contains the samples.</li>
        </ul>

        The runtime <b>should</b> resample the provided samples in the {@code amplitudes}, and maintain an internal buffer which <b>should</b> be of #MAX_HAPTIC_AMPLITUDE_ENVELOPE_SAMPLES_FB length. The resampling <b>should</b> happen based on the {@code duration}, {@code amplitudeCount}, and the device’s sample rate.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBHapticAmplitudeEnvelope XR_FB_haptic_amplitude_envelope} extension <b>must</b> be enabled prior to using ##XrHapticAmplitudeEnvelopeVibrationFB</li>
            <li>{@code type} <b>must</b> be #TYPE_HAPTIC_AMPLITUDE_ENVELOPE_VIBRATION_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code amplitudes} <b>must</b> be a pointer to an array of {@code amplitudeCount} {@code float} values</li>
            <li>The {@code amplitudeCount} parameter <b>must</b> be greater than 0</li>
        </ul>
        """

    Expression("#TYPE_HAPTIC_AMPLITUDE_ENVELOPE_VIBRATION_FB")..XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrDuration("duration", "")
    AutoSize("amplitudes")..uint32_t("amplitudeCount", "")
    float.const.p("amplitudes", "")
}

val XrExtent3DfFB = struct(Module.OPENXR, "XrExtent3DfFB") {
    documentation =
        """
        Represents a rectangular prism.

        <h5>Description</h5>
        This structure is used for component values that may be fractional (floating-point). If used to represent physical distances, values must be in meters. The width, height, and depth values must be non-negative.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to using ##XrExtent3DfFB</li>
        </ul>

        <h5>See Also</h5>
        ##XrRect3DfFB
        """

    float("width", "the floating-point width of the extent.")
    float("height", "the floating-point height of the extent.")
    float("depth", "the floating-point depth of the extent.")
}

val XrOffset3DfFB = struct(Module.OPENXR, "XrOffset3DfFB") {
    documentation =
        """
        Represents a point of 3D space.

        <h5>Description</h5>
        This structure is used for component values that may be fractional (floating-point). If used to represent physical distances, values must be in meters.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to using ##XrOffset3DfFB</li>
        </ul>

        <h5>See Also</h5>
        ##XrRect3DfFB
        """

    float("x", "the floating-point offset in the x direction.")
    float("y", "the floating-point offset in the y direction.")
    float("z", "the floating-point offset in the z direction.")
}

val XrRect3DfFB = struct(Module.OPENXR, "XrRect3DfFB") {
    documentation =
        """
        Represents a rectangular prism containing a region of space.

        <h5>Description</h5>
        This structure is used for component values that may be fractional (floating-point).

        The bounding box is defined by an {@code offset} and {@code extent}. The {@code offset} refers to the coordinate of the minimum corner of the box in the local space of the {@code XrSpace}; that is, the corner whose coordinate has the minimum value on each axis. The {@code extent} refers to the dimensions of the box along each axis. The maximum corner can therefore be computed as <code>offset extent</code>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to using ##XrRect3DfFB</li>
        </ul>

        <h5>See Also</h5>
        ##XrExtent3DfFB, ##XrOffset3DfFB, #GetSpaceBoundingBox3DFB()
        """

    XrOffset3DfFB("offset", "the ##XrOffset3DfFB specifying the rectangle offset.")
    XrExtent3DfFB("extent", "the ##XrExtent3DfFB specifying the rectangle extent.")
}

val XrSemanticLabelsFB = struct(Module.OPENXR, "XrSemanticLabelsFB") {
    documentation =
        """
        Provides application with semantic usage of a spatial entity.

        <h5>Description</h5>
        This structure is used by the #GetSpaceSemanticLabelsFB() function to provide the application with the intended usage of the spatial entity.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to using ##XrSemanticLabelsFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SEMANTIC_LABELS_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
        </ul>

        <h5>See Also</h5>
        #GetSpaceSemanticLabelsFB()
        """

    Expression("#TYPE_SEMANTIC_LABELS_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain, such as ##XrSemanticLabelsSupportInfoFB.")
    AutoSize("buffer", optional = true)..uint32_t("bufferCapacityInput", "the capacity of the {@code buffer} array, in bytes, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("bufferCountOutput", "the count of bytes written, or the required capacity in the case that {@code bufferCapacityInput} is insufficient.")
    nullable..char.p("buffer", "a pointer to an array of bytes, but can be {@code NULL} if {@code bufferCapacityInput} is 0. Multiple labels represented by raw string, separated by a comma without spaces.")
}

val XrRoomLayoutFB = struct(Module.OPENXR, "XrRoomLayoutFB") {
    documentation =
        """
        Provides additional context of a spatial entity representing a room.

        <h5>Description</h5>
        This structure is used by the #GetSpaceRoomLayoutFB() function to provide the application with the ##XrUuidEXT handles representing the various surfaces of a room.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to using ##XrRoomLayoutFB</li>
            <li>{@code type} <b>must</b> be #TYPE_ROOM_LAYOUT_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code wallUuidCapacityInput} is not 0, {@code wallUuids} <b>must</b> be a pointer to an array of {@code wallUuidCapacityInput} ##XrUuidEXT structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrUuidEXT, #GetSpaceRoomLayoutFB()
        """

    Expression("#TYPE_ROOM_LAYOUT_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrUuidEXT("floorUuid", "the UUID of the spatial entity representing the room floor")
    XrUuidEXT("ceilingUuid", "the UUID of the spatial entity representing the room ceiling")
    AutoSize("wallUuids", optional = true)..uint32_t("wallUuidCapacityInput", "the capacity of the {@code wallUuids} array, in number of UUIDs, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("wallUuidCountOutput", "the count of ##XrUuidEXT handles written, or the required capacity in the case that {@code wallUuidCapacityInput} is insufficient.")
    nullable..XrUuidEXT.p("wallUuids", "a pointer to an array of ##XrUuidEXT handles, but can be {@code NULL} if {@code wallUuidCapacityInput} is 0.")
}

val XrBoundary2DFB = struct(Module.OPENXR, "XrBoundary2DFB") {
    documentation =
        """
        Provides additional context of a spatial entity representing a room.

        <h5>Description</h5>
        This structure is used by the #GetSpaceBoundary2DFB() function to provide the application with the ##XrVector2f vertices representing the a spatial entity with a boundary.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to using ##XrBoundary2DFB</li>
            <li>{@code type} <b>must</b> be #TYPE_BOUNDARY_2D_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code vertexCapacityInput} is not 0, {@code vertices} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector2f structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrVector2f, #GetSpaceBoundary2DFB()
        """

    Expression("#TYPE_BOUNDARY_2D_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput", "the capacity of the {@code vertices} array, in number of vertices, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("vertexCountOutput", "the count of ##XrVector2f written, or the required capacity in the case that {@code vertexCapacityInput} is insufficient.")
    nullable..XrVector2f.p("vertices", "a pointer to an array of ##XrVector2f, but <b>can</b> be {@code NULL} if {@code vertexCapacityInput} is 0.")
}

val XrSemanticLabelsSupportInfoFB = struct(Module.OPENXR, "XrSemanticLabelsSupportInfoFB") {
    documentation =
        """
        Specifies additional behaviors of the xrGetSpaceSemanticLabelsFB function.

        <h5>Description</h5>
        The ##XrSemanticLabelsSupportInfoFB structure <b>may</b> be specified in the {@code next} chain of ##XrSemanticLabelsFB to specify additional behaviors of the #GetSpaceSemanticLabelsFB() function. The runtime <b>must</b> follow the behaviors specified in {@code flags} according to the descriptions of {@code XrSemanticLabelsSupportFlagBitsFB}. The runtime <b>must</b> return any semantic label that is not included in {@code recognizedLabels} as "OTHER" to the application. The runtime <b>must</b> follow this direction only if the runtime reports the {@code extensionVersion} as 2 or greater, otherwise the runtime <b>must</b> ignore this as an unknown chained structure.

        If the ##XrSemanticLabelsSupportInfoFB structure is not present in the {@code next} chain of ##XrSemanticLabelsFB, the runtime <b>may</b> return any semantic labels to the application.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to using ##XrSemanticLabelsSupportInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SEMANTIC_LABELS_SUPPORT_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be 0 or a valid combination of {@code XrSemanticLabelsSupportFlagBitsFB} values</li>
            <li>{@code recognizedLabels} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>
        """

    Expression("#TYPE_SEMANTIC_LABELS_SUPPORT_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSemanticLabelsSupportFlagsFB("flags", "a bitmask of {@code XrSemanticLabelsSupportFlagBitsFB} that specifies additional behaviors.")
    charUTF8.const.p("recognizedLabels", "a {@code NULL} terminated string that indicates a set of semantic labels recognized by the application. Each semantic label <b>must</b> be represented as a string and be separated by a comma without spaces. This field <b>must</b> include at least \"OTHER\" and <b>must</b> not be {@code NULL}.")
}

val XrDigitalLensControlALMALENCE = struct(Module.OPENXR, "XrDigitalLensControlALMALENCE") {
    documentation =
        """
        The digital lens control structure to be passed to change state of DLVR API Layer.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link ALMALENCEDigitalLensControl XR_ALMALENCE_digital_lens_control} extension <b>must</b> be enabled prior to using ##XrDigitalLensControlALMALENCE</li>
            <li>{@code type} <b>must</b> be #TYPE_DIGITAL_LENS_CONTROL_ALMALENCE</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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

val XrEventDataSceneCaptureCompleteFB = struct(Module.OPENXR, "XrEventDataSceneCaptureCompleteFB") {
    documentation =
        """
        Event which occurs after a scene capture operation completes.

        <h5>Description</h5>
        The ##XrEventDataSceneCaptureCompleteFB structure is used by an application to instruct the system what to look for during a scene capture.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSceneCapture XR_FB_scene_capture} extension <b>must</b> be enabled prior to using ##XrEventDataSceneCaptureCompleteFB</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code result} <b>must</b> be a valid {@code XrResult} value</li>
        </ul>
        """

    Expression("#TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrAsyncRequestIdFB("requestId", "the ID of the asynchronous query request.")
    XrResult("result", "an {@code XrResult} that indicates if the request succeeded or if an error occurred.")
}

val XrSceneCaptureRequestInfoFB = struct(Module.OPENXR, "XrSceneCaptureRequestInfoFB") {
    documentation =
        """
        Describes how a scene capture should be conducted by the system.

        <h5>Description</h5>
        The ##XrSceneCaptureRequestInfoFB structure is used by an application to instruct the system what to look for during a scene capture. If the {@code request} parameter is {@code NULL}, then the runtime <b>must</b> conduct a default scene capture.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSceneCapture XR_FB_scene_capture} extension <b>must</b> be enabled prior to using ##XrSceneCaptureRequestInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SCENE_CAPTURE_REQUEST_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code requestByteCount} is not 0, {@code request} <b>must</b> be a pointer to an array of {@code requestByteCount} char values</li>
        </ul>

        <h5>See Also</h5>
        #RequestSceneCaptureFB()
        """

    Expression("#TYPE_SCENE_CAPTURE_REQUEST_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("request", optional = true)..uint32_t("requestByteCount", "byte length of the {@code request} parameter.")
    nullable..char.const.p("request", "a string which the application <b>can</b> use to specify which type of scene capture should be initiated by the runtime. The contents of buffer pointed to by the {@code request} parameter is runtime-specific.")
}

val XrSpaceContainerFB = struct(Module.OPENXR, "XrSpaceContainerFB") {
    documentation =
        """
        Represents a collection of other spaces, represented by UUIDs, contained by this space.

        <h5>Description</h5>
        The ##XrSpaceContainerFB structure <b>can</b> be used by an application to perform the two calls required to obtain information about which spatial entities are contained by a specified spatial entity.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityContainer XR_FB_spatial_entity_container} extension <b>must</b> be enabled prior to using ##XrSpaceContainerFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_CONTAINER_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code uuidCapacityInput} is not 0, {@code uuids} <b>must</b> be a pointer to an array of {@code uuidCapacityInput} ##XrUuidEXT structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrUuidEXT, #GetSpaceContainerFB()
        """

    Expression("#TYPE_SPACE_CONTAINER_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("uuids", optional = true)..uint32_t("uuidCapacityInput", "the capacity of the {@code uuids} array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("uuidCountOutput", "an output parameter which will hold the number of UUIDs included in the output list, or the required capacity in the case that {@code uuidCapacityInput} is insufficient")
    nullable..XrUuidEXT.p("uuids", "an output parameter which will hold a list of space UUIDs contained by the space to which the component is attached.")
}

val XrFoveationEyeTrackedProfileCreateInfoMETA = struct(Module.OPENXR, "XrFoveationEyeTrackedProfileCreateInfoMETA") {
    documentation =
        """
        The information to create a eye tracked foveation profile.

        <h5>Description</h5>
        ##XrFoveationEyeTrackedProfileCreateInfoMETA <b>can</b> be added to the {@code next} chain of ##XrFoveationLevelProfileCreateInfoFB in order to enable eye tracked foveation. The runtime <b>must</b> apply an eye tracked foveation pattern according to the parameters defined in the ##XrFoveationLevelProfileCreateInfoFB.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAFoveationEyeTracked XR_META_foveation_eye_tracked} extension <b>must</b> be enabled prior to using ##XrFoveationEyeTrackedProfileCreateInfoMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>
        """

    Expression("#TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrFoveationEyeTrackedProfileCreateFlagsMETA("flags", "a bitmask of {@code XrFoveationEyeTrackedProfileCreateFlagBitsMETA} which indicate various characteristics for how eye tracked foveation is enabled on the swapchain.")
}

val XrFoveationEyeTrackedStateMETA = struct(Module.OPENXR, "XrFoveationEyeTrackedStateMETA", mutable = false) {
    javaImport("static org.lwjgl.openxr.METAFoveationEyeTracked.*")
    documentation =
        """
        Foveation data returned from the runtime.

        <h5>Description</h5>
        ##XrFoveationEyeTrackedStateMETA <b>must</b> be provided when calling #GetFoveationEyeTrackedStateMETA(). The runtime <b>must</b> interpret ##XrFoveationEyeTrackedStateMETA without any additional structs in its {@code next} chain in order to query eye tracked foveation state, e.g. the center of the foveal region.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAFoveationEyeTracked XR_META_foveation_eye_tracked} extension <b>must</b> be enabled prior to using ##XrFoveationEyeTrackedStateMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_FOVEATION_EYE_TRACKED_STATE_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrVector2f, #GetFoveationEyeTrackedStateMETA()
        """

    Expression("#TYPE_FOVEATION_EYE_TRACKED_STATE_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrVector2f("foveationCenter", "the center of the foveal region defined in NDC space in the range of -1 to 1 for both eyes.")["XR_FOVEATION_CENTER_SIZE_META"]
    XrFoveationEyeTrackedStateFlagsMETA("flags", "a bitmask of {@code XrFoveationEyeTrackedStateFlagBitsMETA} which indicates various characteristics for current foveation state.")
}

val XrSystemFoveationEyeTrackedPropertiesMETA = struct(Module.OPENXR, "XrSystemFoveationEyeTrackedPropertiesMETA", mutable = false) {
    documentation =
        """
        Information about the current system support for eye tracked foveation.

        <h5>Description</h5>
        An application <b>can</b> inspect whether the system is capable of eye tracked foveation by extending the ##XrSystemProperties with ##XrSystemFoveationEyeTrackedPropertiesMETA structure when calling #GetSystemProperties().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAFoveationEyeTracked XR_META_foveation_eye_tracked} extension <b>must</b> be enabled prior to using ##XrSystemFoveationEyeTrackedPropertiesMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetSystemProperties()
        """

    Expression("#TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrBool32("supportsFoveationEyeTracked", "indicates if the current system is capable of eye tracked foveation.")
}

val XrSystemFaceTrackingPropertiesFB = struct(Module.OPENXR, "XrSystemFaceTrackingPropertiesFB", mutable = false) {
    documentation =
        """
        System property for face tracking.

        <h5>Description</h5>
        An application <b>can</b> inspect whether the system is capable of receiving face tracking input by extending the ##XrSystemProperties with ##XrSystemFaceTrackingPropertiesFB structure when calling #GetSystemProperties().

        If a runtime returns #FALSE for {@code supportsFaceTracking}, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateFaceTrackerFB().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFaceTracking XR_FB_face_tracking} extension <b>must</b> be enabled prior to using ##XrSystemFaceTrackingPropertiesFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrBool32("supportsFaceTracking", "an {@code XrBool32}, indicating if current system is capable of receiving face tracking input.")
}

val XrFaceTrackerCreateInfoFB = struct(Module.OPENXR, "XrFaceTrackerCreateInfoFB") {
    documentation =
        """
        Information to create a facial expression handle.

        <h5>Description</h5>
        The ##XrFaceTrackerCreateInfoFB structure describes the information to create an {@code XrFaceTrackerFB} handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFaceTracking XR_FB_face_tracking} extension <b>must</b> be enabled prior to using ##XrFaceTrackerCreateInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_FACE_TRACKER_CREATE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code faceExpressionSet} <b>must</b> be a valid {@code XrFaceExpressionSetFB} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateFaceTrackerFB()
        """

    Expression("#TYPE_FACE_TRACKER_CREATE_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrFaceExpressionSetFB("faceExpressionSet", "an {@code XrFaceExpressionSetFB} that describe the set of blend shapes to retrieve.")
}

val XrFaceExpressionInfoFB = struct(Module.OPENXR, "XrFaceExpressionInfoFB") {
    documentation =
        """
        Describes the information to obtain facial expression.

        <h5>Description</h5>
        Callers <b>should</b> request a time equal to the predicted display time for the rendered frame. The system will employ appropriate modeling to provide expressions for this time.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFaceTracking XR_FB_face_tracking} extension <b>must</b> be enabled prior to using ##XrFaceExpressionInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_FACE_EXPRESSION_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetFaceExpressionWeightsFB()
        """

    Expression("#TYPE_FACE_EXPRESSION_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrTime("time", "an {@code XrTime} at which the facial expression weights are requested.")
}

val XrFaceExpressionStatusFB = struct(Module.OPENXR, "XrFaceExpressionStatusFB") {
    documentation =
        """
        Describes the status of facial expression weights.

        <h5>Description</h5>
        If the returned {@code isValid} is #FALSE, then it indicates that the face tracker failed to track or lost track of the face, or the application lost focus, or the consent for face tracking was denied.

        If the returned {@code isValid} is #TRUE, the runtime <b>must</b> return all weights (or all weights except eyes related weights, see {@code isEyeFollowingBlendshapesValid}).

        If the returned {@code isEyeFollowingBlendshapesValid} is #FALSE, then it indicates that the eye tracking driving blendshapes with prefix {@code XR_FACE_EXPRESSION_EYES_LOOK_*} lost track or the consent for eye tracking was denied.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFaceTracking XR_FB_face_tracking} extension <b>must</b> be enabled prior to using ##XrFaceExpressionStatusFB</li>
        </ul>

        <h5>See Also</h5>
        ##XrFaceExpressionWeightsFB
        """

    XrBool32("isValid", "an {@code XrBool32} which indicates that the tracked expression weights are valid.")
    XrBool32("isEyeFollowingBlendshapesValid", "an {@code XrBool32} which indicates if the 8 expression weights with prefix {@code XR_FACE_EXPRESSION_EYES_LOOK_*} are valid.")
}

val XrFaceExpressionWeightsFB = struct(Module.OPENXR, "XrFaceExpressionWeightsFB") {
    documentation =
        """
        Returns the facial expression.

        <h5>Description</h5>
        The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if {@code weightCount} is not equal to the number of blend shapes defined by the {@code XrFaceExpressionSetFB} used to create the {@code XrFaceTrackerFB}.

        The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if {@code confidenceCount} is not equal to the number of confidence areas defined by the {@code XrFaceExpressionSetFB} used to create the {@code XrFaceTrackerFB}.

        The runtime <b>must</b> return {@code weights} representing the weights of blend shapes of current facial expression.

        The runtime <b>must</b> update the {@code weights} array ordered so that the application <b>can</b> index elements using the corresponding facial expression enum (e.g. {@code XrFaceExpressionFB}) as described by {@code XrFaceExpressionSetFB} when creating the {@code XrFaceTrackerFB}. For example, when the {@code XrFaceTrackerFB} is created with #FACE_EXPRESSION_SET_DEFAULT_FB, the application sets the {@code weightCount} to #FACE_EXPRESSION_COUNT_FB, and the runtime <b>must</b> fill the {@code weights} array ordered so that it <b>can</b> be indexed by the {@code XrFaceExpressionFB} enum.

        The runtime <b>must</b> update the {@code confidences} array ordered so that the application <b>can</b> index elements using the corresponding confidence area enum (e.g. {@code XrFaceConfidenceFB}) as described by {@code XrFaceExpressionSetFB} when creating the {@code XrFaceTrackerFB}. For example, when the {@code XrFaceTrackerFB} is created with #FACE_EXPRESSION_SET_DEFAULT_FB, the application sets the {@code confidenceCount} to #FACE_CONFIDENCE_COUNT_FB, and the runtime <b>must</b> fill the {@code confidences} array ordered so that it <b>can</b> be indexed by the {@code XrFaceConfidenceFB} enum.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFaceTracking XR_FB_face_tracking} extension <b>must</b> be enabled prior to using ##XrFaceExpressionWeightsFB</li>
            <li>{@code type} <b>must</b> be #TYPE_FACE_EXPRESSION_WEIGHTS_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code weights} <b>must</b> be a pointer to an array of {@code weightCount} {@code float} values</li>
            <li>{@code confidences} <b>must</b> be a pointer to an array of {@code confidenceCount} {@code float} values</li>
            <li>{@code status} <b>must</b> be a valid ##XrFaceExpressionStatusFB structure</li>
            <li>The {@code weightCount} parameter <b>must</b> be greater than 0</li>
            <li>The {@code confidenceCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrFaceExpressionStatusFB, #GetFaceExpressionWeightsFB()
        """

    Expression("#TYPE_FACE_EXPRESSION_WEIGHTS_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("weights")..uint32_t("weightCount", "a {@code uint32_t} describing the count of elements in {@code weights} array.")
    float.p("weights", "a pointer to an application-allocated array of {@code float} that will be filled with weights of facial expression blend shapes.")
    AutoSize("confidences")..uint32_t("confidenceCount", "a {@code uint32_t} describing the count of elements in {@code confidences} array.")
    float.p("confidences", "a pointer to an application-allocated array of {@code float} that will be filled with confidence of tracking specific parts of a face.")
    XrFaceExpressionStatusFB("status", "the ##XrFaceExpressionStatusFB of validity status of the expression weights.")
    XrTime("time", "an {@code XrTime} time at which the returned expression weights are tracked or extrapolated to. Equals the time at which the expression weights were requested if the extrapolating at the time was successful.")
}

val XrEyeGazeFB = struct(Module.OPENXR, "XrEyeGazeFB") {
    documentation =
        """
        Describes the eye gaze direction.

        <h5>Description</h5>
        If the returned {@code isValid} is true, the runtime <b>must</b> return {@code gazePose} and {@code gazeConfidence}.

        If the returned {@code isValid} is false, it indicates either the eye tracker did not detect the eye gaze or the application lost input focus.

        The eye gaze pose is natively oriented with +Y up, +X to the right, and -Z forward and not gravity-aligned, similar to the #REFERENCE_SPACE_TYPE_VIEW.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBEyeTrackingSocial XR_FB_eye_tracking_social} extension <b>must</b> be enabled prior to using ##XrEyeGazeFB</li>
        </ul>

        <h5>See Also</h5>
        ##XrEyeGazesFB, ##XrPosef
        """

    XrBool32("isValid", "an {@code XrBool32} indicating if the returned gazePose is valid. Callers <b>should</b> check the validity of pose prior to use.")
    XrPosef("gazePose", "an ##XrPosef describing the position and orientation of the user’s eye. The pose is represented in the coordinate system provided by ##XrEyeGazesInfoFB{@code ::baseSpace}.")
    float("gazeConfidence", "a {@code float} value between 0 and 1 that represents the confidence for eye pose. A value of 0 represents no confidence in the pose returned, and a value of 1 means maximum confidence in the returned eye pose.")
}

val XrEyeTrackerCreateInfoFB = struct(Module.OPENXR, "XrEyeTrackerCreateInfoFB") {
    documentation =
        """
        Information to create an eye gaze handle.

        <h5>Description</h5>
        The ##XrEyeTrackerCreateInfoFB structure describes the information to create an {@code XrEyeTrackerFB} handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBEyeTrackingSocial XR_FB_eye_tracking_social} extension <b>must</b> be enabled prior to using ##XrEyeTrackerCreateInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_EYE_TRACKER_CREATE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #CreateEyeTrackerFB()
        """

    Expression("#TYPE_EYE_TRACKER_CREATE_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
}

val XrEyeGazesInfoFB = struct(Module.OPENXR, "XrEyeGazesInfoFB") {
    documentation =
        """
        Describes the information to get eye gaze.

        <h5>Description</h5>
        The application <b>should</b> request a time equal to the predicted display time for the rendered frame. The system will employ appropriate modeling to provide eye gaze at this time.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBEyeTrackingSocial XR_FB_eye_tracking_social} extension <b>must</b> be enabled prior to using ##XrEyeGazesInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_EYE_GAZES_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
        </ul>

        <h5>See Also</h5>
        #GetEyeGazesFB()
        """

    Expression("#TYPE_EYE_GAZES_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpace("baseSpace", "an {@code XrSpace} within which the returned eye poses will be represented.")
    XrTime("time", "an {@code XrTime} at which the eye gaze information is requested.")
}

val XrSystemEyeTrackingPropertiesFB = struct(Module.OPENXR, "XrSystemEyeTrackingPropertiesFB", mutable = false) {
    documentation =
        """
        System property for eye tracking.

        <h5>Description</h5>
        An application <b>can</b> inspect whether the system is capable of eye tracking input by extending the ##XrSystemProperties with ##XrSystemEyeTrackingPropertiesFB structure when calling #GetSystemProperties().

        If a runtime returns #FALSE for {@code supportsEyeTracking}, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateEyeTrackerFB().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBEyeTrackingSocial XR_FB_eye_tracking_social} extension <b>must</b> be enabled prior to using ##XrSystemEyeTrackingPropertiesFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrBool32("supportsEyeTracking", "an {@code XrBool32}, indicating if the current system is capable of receiving eye tracking input.")
}

val XrEyeGazesFB = struct(Module.OPENXR, "XrEyeGazesFB") {
    javaImport("static org.lwjgl.openxr.FBEyeTrackingSocial.*")
    documentation =
        """
        Returns the eye gaze directions.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBEyeTrackingSocial XR_FB_eye_tracking_social} extension <b>must</b> be enabled prior to using ##XrEyeGazesFB</li>
            <li>{@code type} <b>must</b> be #TYPE_EYE_GAZES_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>Any given element of {@code gaze} <b>must</b> be a valid ##XrEyeGazeFB structure</li>
        </ul>

        <h5>See Also</h5>
        ##XrEyeGazeFB, #GetEyeGazesFB()
        """

    Expression("#TYPE_EYE_GAZES_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrEyeGazeFB("gaze", "an array of ##XrEyeGazeFB receiving the returned eye gaze directions.")["XR_EYE_POSITION_COUNT_FB"]
    XrTime("time", "an {@code XrTime} time at which the returned eye gaze is tracked or extrapolated to. Equals the time for which the eye gaze was requested if the interpolation at the time was successful.")
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
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #PassthroughLayerSetKeyboardHandsIntensityFB()
        """

    Expression("#TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    float("leftHandIntensity", "defines an intensity for the left tracked hand.")
    float("rightHandIntensity", "defines an intensity for the right tracked hand.")
}

val XrCompositionLayerSettingsFB = struct(Module.OPENXR, "XrCompositionLayerSettingsFB") {
    documentation =
        """
        specifies processing options for composition layers.

        <h5>Description</h5>
        ##XrCompositionLayerSettingsFB contains additional flags to indicate which processing steps to perform on a composition layer.

        If both #COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB and #COMPOSITION_LAYER_SETTINGS_QUALITY_SUPER_SAMPLING_BIT_FB are set, #COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB will take precedence.

        If both #COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB and #COMPOSITION_LAYER_SETTINGS_QUALITY_SHARPENING_BIT_FB are set, #COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB will take precedence.

        To specify the additional flags, create an ##XrCompositionLayerSettingsFB structure and pass it via the ##XrCompositionLayerBaseHeader structure’s {@code next} parameter.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBCompositionLayerSettings XR_FB_composition_layer_settings} extension <b>must</b> be enabled prior to using ##XrCompositionLayerSettingsFB</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_SETTINGS_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code layerFlags} <b>must</b> be a valid combination of {@code XrCompositionLayerSettingsFlagBitsFB} values</li>
            <li>{@code layerFlags} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader
        """

    Expression("#TYPE_COMPOSITION_LAYER_SETTINGS_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrCompositionLayerSettingsFlagsFB("layerFlags", "")
}

val XrHapticPcmVibrationFB = struct(Module.OPENXR, "XrHapticPcmVibrationFB", parentStruct = XrHapticBaseHeader) {
    documentation =
        """
        Haptic Effect Description.

        <h5>Description</h5>
        This structure describes a PCM haptic effect.

        The runtime <b>may</b> resample the provided samples in the {@code buffer}, and maintain an internal buffer which <b>should</b> be of #MAX_HAPTIC_PCM_BUFFER_SIZE_FB length. The resampling <b>should</b> happen based on the {@code sampleRate} and the device’s sample rate.

        If {@code append} is #TRUE and a preceding ##XrHapticPcmVibrationFB haptic effect on this action has not yet completed, then the runtime <b>must</b> finish playing the preceding samples and then play the new haptic effect. If a preceding haptic event on this action has not yet completed, and either the preceding effect is not an ##XrHapticPcmVibrationFB haptic effect or {@code append} is #FALSE, the runtime <b>must</b> cancel the preceding incomplete effects on that action and start playing the new haptic effect, as usual for the core specification.

        When {@code append} is true and a preceding ##XrHapticPcmVibrationFB haptic effect on this action has not yet completed, then the application can provide a different {@code sampleRate} in the new haptic effect.

        The runtime <b>must</b> populate the {@code samplesConsumed} with the count of the samples from {@code buffer} which were consumed. The {@code samplesConsumed} is populated before the #ApplyHapticFeedback() returns.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBHapticPcm XR_FB_haptic_pcm} extension <b>must</b> be enabled prior to using ##XrHapticPcmVibrationFB</li>
            <li>{@code type} <b>must</b> be #TYPE_HAPTIC_PCM_VIBRATION_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code buffer} <b>must</b> be a pointer to an array of {@code bufferSize} {@code float} values</li>
            <li>{@code samplesConsumed} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>The {@code bufferSize} parameter <b>must</b> be greater than 0</li>
        </ul>
        """

    Expression("#TYPE_HAPTIC_PCM_VIBRATION_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("buffer")..uint32_t("bufferSize", "the number of samples in the buffer.")
    float.const.p("buffer", "a pointer to a float array representing the PCM samples. If you consider the haptic effect as a sampled analog audio, then this buffer will contain the samples representing that effect. The values in this buffer are expected to be in the range [-1.0, 1.0].")
    float("sampleRate", "the number of samples to be played per second, this is used to determine the duration of the haptic effect.")
    XrBool32("append", "if set to #FALSE, any existing samples will be cleared and a new haptic effect will begin, if #TRUE, samples will be appended to the currently playing effect")
    uint32_t.p("samplesConsumed", "a pointer to an unsigned integer; it is populated by runtime, to tell the application about how many samples were consumed from the input {@code buffer}")
}

val XrDevicePcmSampleRateStateFB = struct(Module.OPENXR, "XrDevicePcmSampleRateStateFB") {
    documentation =
        """
        Information about the device sample rate.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBHapticPcm XR_FB_haptic_pcm} extension <b>must</b> be enabled prior to using ##XrDevicePcmSampleRateStateFB</li>
            <li>{@code type} <b>must</b> be #TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetDeviceSampleRateFB()
        """

    Expression("#TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    float("sampleRate", "the sample rate of the currently bound device which can play a haptic effect")
}

val XrDevicePcmSampleRateGetInfoFB = struct(Module.OPENXR, "XrDevicePcmSampleRateGetInfoFB", alias = XrDevicePcmSampleRateStateFB) {
    documentation = "See ##XrDevicePcmSampleRateStateFB."

    Expression("#TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB")..XrStructureType("type", "")
    nullable..opaque_p("next", "")
    float("sampleRate", "")
}

val XrCompositionLayerDepthTestFB = struct(Module.OPENXR, "XrCompositionLayerDepthTestFB") {
    documentation =
        """
        specifies depth test for composition layer.

        <h5>Description</h5>
        To specify that a layer should be depth tested, a ##XrCompositionLayerDepthTestFB structure <b>must</b> be passed via the polymorphic ##XrCompositionLayerBaseHeader structure’s {@code next} parameter chain.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBCompositionLayerDepthTest XR_FB_composition_layer_depth_test} extension <b>must</b> be enabled prior to using ##XrCompositionLayerDepthTestFB</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_DEPTH_TEST_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code compareOp} <b>must</b> be a valid {@code XrCompareOpFB} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader
        """

    Expression("#TYPE_COMPOSITION_LAYER_DEPTH_TEST_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrBool32("depthMask", "a boolean indicating whether writes to the composition depth buffer are enabled.")
    XrCompareOpFB("compareOp", "an enum that indicates which compare operation is used in the depth test.")
}

val XrLocalDimmingFrameEndInfoMETA = struct(Module.OPENXR, "XrLocalDimmingFrameEndInfoMETA") {
    documentation =
        """
        Local dimming meta data for the current submitted frame.

        <h5>Description</h5>
        The ##XrLocalDimmingFrameEndInfoMETA is a structure that an application <b>can</b> chain in ##XrFrameEndInfo in order to request a local dimming mode.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METALocalDimming XR_META_local_dimming} extension <b>must</b> be enabled prior to using ##XrLocalDimmingFrameEndInfoMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_LOCAL_DIMMING_FRAME_END_INFO_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code localDimmingMode} <b>must</b> be a valid {@code XrLocalDimmingModeMETA} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrFrameEndInfo
        """

    Expression("#TYPE_LOCAL_DIMMING_FRAME_END_INFO_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrLocalDimmingModeMETA("localDimmingMode", "the local dimming mode for current submitted frame.")
}

val XrPassthroughPreferencesMETA = struct(Module.OPENXR, "XrPassthroughPreferencesMETA", mutable = false) {
    documentation =
        """
        Passthrough preferences.

        <h5>Description</h5>
        The runtime <b>must</b> populate the ##XrPassthroughPreferencesMETA structure with the relevant information when the app calls #GetPassthroughPreferencesMETA().

        Presence of the bit flag #PASSTHROUGH_PREFERENCE_DEFAULT_TO_ACTIVE_BIT_META does not indicate a guarantee that applications <b>can</b> enable and use passthrough in practice. The runtime <b>may</b> impose restrictions on passthrough usage (e.g. based on hardware availability or permission models) independently of the state of this flag bit. Apps <b>should</b> test for this flag explicitly, as more flag bits <b>may</b> be introduced in the future.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPassthroughPreferences XR_META_passthrough_preferences} extension <b>must</b> be enabled prior to using ##XrPassthroughPreferencesMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_PREFERENCES_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetPassthroughPreferencesMETA()
        """

    Expression("#TYPE_PASSTHROUGH_PREFERENCES_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrPassthroughPreferenceFlagsMETA("flags", "a bitmask of {@code XrPassthroughPreferenceFlagBitsMETA} describing boolean passthrough preferences.")
}

val XrSystemVirtualKeyboardPropertiesMETA = struct(Module.OPENXR, "XrSystemVirtualKeyboardPropertiesMETA", mutable = false) {
    documentation =
        """
        Virtual Keyboard Properties structure.

        <h5>Description</h5>
        The struct is used for checking virtual keyboard support.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using ##XrSystemVirtualKeyboardPropertiesMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_VIRTUAL_KEYBOARD_PROPERTIES_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSystemProperties
        """

    Expression("#TYPE_SYSTEM_VIRTUAL_KEYBOARD_PROPERTIES_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrBool32("supportsVirtualKeyboard", "an {@code XrBool32} indicating if virtual keyboard is supported.")
}

val XrVirtualKeyboardCreateInfoMETA = struct(Module.OPENXR, "XrVirtualKeyboardCreateInfoMETA") {
    documentation =
        """
        Virtual keyboard creation info.

        <h5>Description</h5>
        The struct is used for keyboard creation. Empty with the intention of future extension.

        The runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED if {@code supportsVirtualKeyboard} is #FALSE when checking the device compatibility.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using ##XrVirtualKeyboardCreateInfoMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #CreateVirtualKeyboardMETA()
        """

    Expression("#TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
}

val XrVirtualKeyboardSpaceCreateInfoMETA = struct(Module.OPENXR, "XrVirtualKeyboardSpaceCreateInfoMETA") {
    documentation =
        """
        Virtual keyboard space creation info.

        <h5>Description</h5>
        If {@code locationType} is set to #VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META, the runtime <b>must</b> use the value {@code poseInSpace} set by the application. Otherwise, the runtime <b>must</b> provide a default pose and ignore {@code poseInSpace}. In all cases, the runtime <b>must</b> default the scale to 1.0.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using ##XrVirtualKeyboardSpaceCreateInfoMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code locationType} <b>must</b> be a valid {@code XrVirtualKeyboardLocationTypeMETA} value</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #CreateVirtualKeyboardSpaceMETA()
        """

    Expression("#TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrVirtualKeyboardLocationTypeMETA("locationType", "an {@code XrVirtualKeyboardLocationTypeMETA} enum providing the location type.")
    XrSpace("space", "an {@code XrSpace} previously created by a function such as #CreateReferenceSpace().")
    XrPosef("poseInSpace", "the desired pose if {@code locationType} is #VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META.")
}

val XrVirtualKeyboardLocationInfoMETA = struct(Module.OPENXR, "XrVirtualKeyboardLocationInfoMETA") {
    documentation =
        """
        Virtual keyboard location info.

        <h5>Description</h5>
        If {@code locationType} is set to #VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META, the runtime <b>must</b> use the values {@code poseInSpace} and {@code scale} set by the application. Otherwise, the runtime <b>must</b> provide a default pose and scale and ignore {@code poseInSpace} and {@code scale}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using ##XrVirtualKeyboardLocationInfoMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code locationType} <b>must</b> be a valid {@code XrVirtualKeyboardLocationTypeMETA} value</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #SuggestVirtualKeyboardLocationMETA()
        """

    Expression("#TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrVirtualKeyboardLocationTypeMETA("locationType", "an {@code XrVirtualKeyboardLocationTypeMETA} enum providing the location type.")
    XrSpace("space", "an {@code XrSpace} previously created by a function such as #CreateReferenceSpace().")
    XrPosef("poseInSpace", "the desired pose if {@code locationType} is #VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META.")
    float("scale", "a {@code float} value of the desired multiplicative scale between 0.0 and 1.0 if {@code locationType} is #VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META.")
}

val XrVirtualKeyboardModelVisibilitySetInfoMETA = struct(Module.OPENXR, "XrVirtualKeyboardModelVisibilitySetInfoMETA") {
    documentation =
        """
        Virtual keyboard model visibility.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using ##XrVirtualKeyboardModelVisibilitySetInfoMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #SetVirtualKeyboardModelVisibilityMETA()
        """

    Expression("#TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrBool32("visible", "an {@code XrBool32} that controls whether to show or hide the keyboard.")
}

val XrVirtualKeyboardAnimationStateMETA = struct(Module.OPENXR, "XrVirtualKeyboardAnimationStateMETA") {
    documentation =
        """
        State for a single animation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using ##XrVirtualKeyboardAnimationStateMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrVirtualKeyboardModelAnimationStatesMETA
        """

    Expression("#TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    int32_t("animationIndex", "the index of the animation to use for the render model.")
    float("fraction", "the normalized value between the start and end time of the animation.")
}

val XrVirtualKeyboardModelAnimationStatesMETA = struct(Module.OPENXR, "XrVirtualKeyboardModelAnimationStatesMETA") {
    documentation =
        """
        Virtual keyboard model animation states.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using ##XrVirtualKeyboardModelAnimationStatesMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code stateCapacityInput} is not 0, {@code states} <b>must</b> be a pointer to an array of {@code stateCapacityInput} ##XrVirtualKeyboardAnimationStateMETA structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrVirtualKeyboardAnimationStateMETA, #GetVirtualKeyboardModelAnimationStatesMETA()
        """

    Expression("#TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("states", optional = true)..uint32_t("stateCapacityInput", "the capacity of the {@code states} array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("stateCountOutput", "filled in by the runtime with the count of ##XrVirtualKeyboardAnimationStateMETA written or the required capacity in the case that {@code stateCapacityInput} is insufficient.")
    nullable..XrVirtualKeyboardAnimationStateMETA.p("states", "the array of ##XrVirtualKeyboardAnimationStateMETA to apply to the model.")
}

val XrVirtualKeyboardTextureDataMETA = struct(Module.OPENXR, "XrVirtualKeyboardTextureDataMETA") {
    documentation =
        """
        Virtual keyboard texture data.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using ##XrVirtualKeyboardTextureDataMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} {@code uint8_t} values</li>
        </ul>

        <h5>See Also</h5>
        #GetVirtualKeyboardTextureDataMETA()
        """

    Expression("#TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    uint32_t("textureWidth", "the pixel width of the texture to be updated.")
    uint32_t("textureHeight", "the pixel height of the texture to be updated.")
    AutoSize("buffer", optional = true)..uint32_t("bufferCapacityInput", "the capacity of {@code buffer}, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("bufferCountOutput", "filled in by the runtime with the byte count written or the required capacity in the case that {@code bufferCapacityInput} is insufficient.")
    nullable..uint8_t.p("buffer", "the pixel data in linear color space, RGBA 8-bit unsigned normalized integer format (i.e. GL_RGBA8 in OpenGL, VK_FORMAT_R8G8B8A8_UNORM in Vulkan).")
}

val XrVirtualKeyboardInputInfoMETA = struct(Module.OPENXR, "XrVirtualKeyboardInputInfoMETA") {
    documentation =
        """
        Virtual keyboard input info.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using ##XrVirtualKeyboardInputInfoMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code inputSource} <b>must</b> be a valid {@code XrVirtualKeyboardInputSourceMETA} value</li>
            <li>If {@code inputSpace} is not #NULL_HANDLE, {@code inputSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code inputState} <b>must</b> be 0 or a valid combination of {@code XrVirtualKeyboardInputStateFlagBitsMETA} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, #SendVirtualKeyboardInputMETA()
        """

    Expression("#TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrVirtualKeyboardInputSourceMETA("inputSource", "an enum of {@code XrVirtualKeyboardInputSourceMETA} describing the source device and input mode type.")
    nullable..XrSpace("inputSpace", "an {@code XrSpace} previously created by a function such as #CreateReferenceSpace().")
    XrPosef("inputPoseInSpace", "an ##XrPosef defining the position and orientation of the input’s source pose within the natural reference frame of the input space.")
    XrVirtualKeyboardInputStateFlagsMETA("inputState", "a bitmask of {@code XrVirtualKeyboardInputStateFlagsMETA} describing the button or pinch state of the {@code inputSource}.")
}

val XrVirtualKeyboardTextContextChangeInfoMETA = struct(Module.OPENXR, "XrVirtualKeyboardTextContextChangeInfoMETA") {
    documentation =
        """
        Virtual keyboard text context change info.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using ##XrVirtualKeyboardTextContextChangeInfoMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code textContext} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>

        <h5>See Also</h5>
        #ChangeVirtualKeyboardTextContextMETA()
        """

    Expression("#TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    charUTF8.const.p("textContext", "a pointer to a {@code char} buffer, should contain prior input text context terminated with a null character.")
}

val XrEventDataVirtualKeyboardCommitTextMETA = struct(Module.OPENXR, "XrEventDataVirtualKeyboardCommitTextMETA") {
    javaImport("static org.lwjgl.openxr.METAVirtualKeyboard.*")
    documentation =
        """
        Commit text event.

        <h5>Description</h5>
        The ##XrEventDataVirtualKeyboardCommitTextMETA event <b>must</b> be sent by the runtime when a character or string is input by the keyboard. The application <b>should</b> append to the text field that the keyboard is editing.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using ##XrEventDataVirtualKeyboardCommitTextMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
            <li>{@code text} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to #MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META</li>
        </ul>

        <h5>See Also</h5>
        #PollEvent()
        """

    Expression("#TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrVirtualKeyboardMETA("keyboard", "the {@code XrVirtualKeyboardMETA} this event belongs to.")
    charUTF8("text", "the text string input by the keyboard.")["XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META"]
}

val XrEventDataVirtualKeyboardBackspaceMETA = struct(Module.OPENXR, "XrEventDataVirtualKeyboardBackspaceMETA") {
    documentation =
        """
        Backspace key event.

        <h5>Description</h5>
        The ##XrEventDataVirtualKeyboardBackspaceMETA event <b>must</b> be sent by the runtime when the [Backspace] key is pressed. The application <b>should</b> update the text field that the keyboard is editing.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using ##XrEventDataVirtualKeyboardBackspaceMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
        </ul>

        <h5>See Also</h5>
        #PollEvent()
        """

    Expression("#TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrVirtualKeyboardMETA("keyboard", "the {@code XrVirtualKeyboardMETA} this event belongs to.")
}

val XrEventDataVirtualKeyboardEnterMETA = struct(Module.OPENXR, "XrEventDataVirtualKeyboardEnterMETA") {
    documentation =
        """
        Enter key event.

        <h5>Description</h5>
        The ##XrEventDataVirtualKeyboardEnterMETA event <b>must</b> be sent by the runtime when the [Enter] key is pressed. The application <b>should</b> respond accordingly (e.g. newline, accept, etc).

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using ##XrEventDataVirtualKeyboardEnterMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_ENTER_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
        </ul>

        <h5>See Also</h5>
        #PollEvent()
        """

    Expression("#TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_ENTER_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrVirtualKeyboardMETA("keyboard", "the {@code XrVirtualKeyboardMETA} this event belongs to.")
}

val XrEventDataVirtualKeyboardShownMETA = struct(Module.OPENXR, "XrEventDataVirtualKeyboardShownMETA") {
    documentation =
        """
        Keyboard shown event.

        <h5>Description</h5>
        The ##XrEventDataVirtualKeyboardShownMETA event <b>must</b> be sent when the runtime has shown the keyboard render model (via animation). The application <b>should</b> update its state accordingly (e.g. update UI, pause simulation, etc).

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using ##XrEventDataVirtualKeyboardShownMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_SHOWN_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
        </ul>

        <h5>See Also</h5>
        #PollEvent()
        """

    Expression("#TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_SHOWN_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrVirtualKeyboardMETA("keyboard", "the {@code XrVirtualKeyboardMETA} this event belongs to.")
}

val XrEventDataVirtualKeyboardHiddenMETA = struct(Module.OPENXR, "XrEventDataVirtualKeyboardHiddenMETA") {
    documentation =
        """
        Keyboard hidden event.

        <h5>Description</h5>
        The ##XrEventDataVirtualKeyboardHiddenMETA event <b>must</b> be sent when the keyboard render model is hidden by the runtime (via animation). The application <b>should</b> update its state accordingly (e.g. update UI, resume simulation, etc).

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using ##XrEventDataVirtualKeyboardHiddenMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_HIDDEN_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
        </ul>

        <h5>See Also</h5>
        #PollEvent()
        """

    Expression("#TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_HIDDEN_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrVirtualKeyboardMETA("keyboard", "the {@code XrVirtualKeyboardMETA} this event belongs to.")
}

val XrExternalCameraIntrinsicsOCULUS = struct(Module.OPENXR, "XrExternalCameraIntrinsicsOCULUS") {
    documentation =
        """
        Camera intrintics state.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link OCULUSExternalCamera XR_OCULUS_external_camera} extension <b>must</b> be enabled prior to using ##XrExternalCameraIntrinsicsOCULUS</li>
        </ul>

        <h5>See Also</h5>
        ##XrExtent2Di, ##XrExternalCameraOCULUS, ##XrFovf
        """

    XrTime("lastChangeTime", "the {@code XrTime} when this camera’s intrinsics last changed.")
    XrFovf("fov", "the ##XrFovf for this camera’s viewport.")
    float("virtualNearPlaneDistance", "the near plane distance of the virtual camera used to match the external camera")
    float("virtualFarPlaneDistance", "the far plane distance of the virtual camera used to match the external camera")
    XrExtent2Di("imageSensorPixelResolution", "the ##XrExtent2Di specifying the camera’s resolution (in pixels).")
}

val XrExternalCameraExtrinsicsOCULUS = struct(Module.OPENXR, "XrExternalCameraExtrinsicsOCULUS") {
    documentation =
        """
        Camera extrinsics state.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link OCULUSExternalCamera XR_OCULUS_external_camera} extension <b>must</b> be enabled prior to using ##XrExternalCameraExtrinsicsOCULUS</li>
            <li>{@code cameraStatusFlags} <b>must</b> be 0 or a valid combination of {@code XrExternalCameraStatusFlagBitsOCULUS} values</li>
            <li>{@code attachedToDevice} <b>must</b> be a valid {@code XrExternalCameraAttachedToDeviceOCULUS} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrExternalCameraOCULUS, ##XrPosef
        """

    XrTime("lastChangeTime", "the {@code XrTime} when this camera’s extrinsics last changed.")
    XrExternalCameraStatusFlagsOCULUS("cameraStatusFlags", "the {@code XrExternalCameraStatusFlagsOCULUS} for this camera’s status.")
    XrExternalCameraAttachedToDeviceOCULUS("attachedToDevice", "the {@code XrExternalCameraAttachedToDeviceOCULUS} for the device this camera is attached to")
    XrPosef("relativePose", "the ##XrPosef for offset of the camera from the device that the camera is attached to")
}

val XrExternalCameraOCULUS = struct(Module.OPENXR, "XrExternalCameraOCULUS", mutable = false) {
    javaImport("static org.lwjgl.openxr.OCULUSExternalCamera.*")
    documentation =
        """
        Camera intrintics state.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link OCULUSExternalCamera XR_OCULUS_external_camera} extension <b>must</b> be enabled prior to using ##XrExternalCameraOCULUS</li>
            <li>{@code type} <b>must</b> be #TYPE_EXTERNAL_CAMERA_OCULUS</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrExternalCameraExtrinsicsOCULUS, ##XrExternalCameraIntrinsicsOCULUS, #EnumerateExternalCamerasOCULUS()
        """

    Expression("#TYPE_EXTERNAL_CAMERA_OCULUS")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    charUTF8("name", "a null-terminated UTF-8 string containing a camera identifier: VID (vendor ID), PID (product ID), and serial number")["XR_MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS"]
    XrExternalCameraIntrinsicsOCULUS("intrinsics", "the ##XrExternalCameraIntrinsicsOCULUS for the camera")
    XrExternalCameraExtrinsicsOCULUS("extrinsics", "the ##XrExternalCameraExtrinsicsOCULUS for the camera")
}

val XrVulkanSwapchainCreateInfoMETA = struct(Module.OPENXR, "XrVulkanSwapchainCreateInfoMETA") {
    javaImport("org.lwjgl.vulkan.*")
    documentation =
        """
        Debug utils object name info.

        <h5>Description</h5>
        The runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED if any bit of either {@code additionalCreateFlags} or {@code additionalUsageFlags} is not supported.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVulkanSwapchainCreateInfo XR_META_vulkan_swapchain_create_info} extension <b>must</b> be enabled prior to using ##XrVulkanSwapchainCreateInfoMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_VULKAN_SWAPCHAIN_CREATE_INFO_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code additionalCreateFlags} <b>must</b> be a valid {@code VkImageCreateFlags} value</li>
            <li>{@code additionalUsageFlags} <b>must</b> be a valid {@code VkImageUsageFlags} value</li>
        </ul>
        """

    Expression("#TYPE_VULKAN_SWAPCHAIN_CREATE_INFO_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    VkImageCreateFlags("additionalCreateFlags", "a bitmask of {@code VkImageCreateFlags} describing additional parameters of an image.")
    VkImageUsageFlags("additionalUsageFlags", "a bitmask of {@code VkImageUsageFlags} describing additional parameters of an image.")
}

val XrPerformanceMetricsStateMETA = struct(Module.OPENXR, "XrPerformanceMetricsStateMETA") {
    documentation =
        """
        Performance metrics enable state.

        <h5>Description</h5>
        ##XrPerformanceMetricsStateMETA is provided as input when calling #SetPerformanceMetricsStateMETA() to enable or disable the performance metrics system. ##XrPerformanceMetricsStateMETA is populated as an output parameter when calling #GetPerformanceMetricsStateMETA() to query if the performance metrics system is enabled.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPerformanceMetrics XR_META_performance_metrics} extension <b>must</b> be enabled prior to using ##XrPerformanceMetricsStateMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_PERFORMANCE_METRICS_STATE_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #GetPerformanceMetricsStateMETA(), #SetPerformanceMetricsStateMETA()
        """

    Expression("#TYPE_PERFORMANCE_METRICS_STATE_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrBool32("enabled", "set to #TRUE to indicate the performance metrics system is enabled, #FALSE otherwise, when getting state. When setting state, set to #TRUE to enable the performance metrics system and #FALSE to disable it.")
}

val XrPerformanceMetricsCounterMETA = struct(Module.OPENXR, "XrPerformanceMetricsCounterMETA") {
    documentation =
        """
        Performance metrics counter value.

        <h5>Description</h5>
        ##XrPerformanceMetricsCounterMETA is populated by calling #QueryPerformanceMetricsCounterMETA() to query real-time performance metrics counter information.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPerformanceMetrics XR_META_performance_metrics} extension <b>must</b> be enabled prior to using ##XrPerformanceMetricsCounterMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_PERFORMANCE_METRICS_COUNTER_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code counterFlags} <b>must</b> be 0 or a valid combination of {@code XrPerformanceMetricsCounterFlagBitsMETA} values</li>
            <li>{@code counterUnit} <b>must</b> be a valid {@code XrPerformanceMetricsCounterUnitMETA} value</li>
        </ul>

        <h5>See Also</h5>
        #QueryPerformanceMetricsCounterMETA()
        """

    Expression("#TYPE_PERFORMANCE_METRICS_COUNTER_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrPerformanceMetricsCounterFlagsMETA("counterFlags", "a bitmask of {@code XrPerformanceMetricsCounterFlagBitsMETA} describing the validity of value members.")
    XrPerformanceMetricsCounterUnitMETA("counterUnit", "a enum of {@code XrPerformanceMetricsCounterUnitMETA} describing the measurement unit.")
    uint32_t("uintValue", "the counter value in {@code uint32_t} format. It is valid if {@code counterFlags} contains #PERFORMANCE_METRICS_COUNTER_UINT_VALUE_VALID_BIT_META.")
    float("floatValue", "the counter value in {@code float} format. It is valid if {@code counterFlags} contains #PERFORMANCE_METRICS_COUNTER_FLOAT_VALUE_VALID_BIT_META.")
}

val XrSpaceListSaveInfoFB = struct(Module.OPENXR, "XrSpaceListSaveInfoFB") {
    documentation =
        """
        Parameters for a list save operation.

        <h5>Description</h5>
        The ##XrSpaceListSaveInfoFB structure contains information used to save multiple spatial entities.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityStorageBatch XR_FB_spatial_entity_storage_batch} extension <b>must</b> be enabled prior to using ##XrSpaceListSaveInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_LIST_SAVE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code spaces} <b>must</b> be a pointer to an array of {@code spaceCount} {@code XrSpace} handles</li>
            <li>{@code location} <b>must</b> be a valid {@code XrSpaceStorageLocationFB} value</li>
            <li>The {@code spaceCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        #SaveSpaceListFB()
        """

    Expression("#TYPE_SPACE_LIST_SAVE_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("spaces")..uint32_t("spaceCount", "the number of spatial entities to save.")
    XrSpace.p("spaces", "a list of {@code XrSpace} handles for the entities to be saved.")
    XrSpaceStorageLocationFB("location", "the storage location.")
}

val XrEventDataSpaceListSaveCompleteFB = struct(Module.OPENXR, "XrEventDataSpaceListSaveCompleteFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    documentation =
        """
        Describes the completion of a save list operation.

        <h5>Description</h5>
        This completion event indicates that a request to save a list of {@code XrSpace} objects has completed. The application <b>can</b> use {@code result} to check if the request was successful or if an error occurred.

        <h5>Result Codes</h5>
        <dl>
            <dt>On success, the value of this parameter is</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, the value of this parameter is</dt>
            <dd><ul>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_SPACE_MAPPING_INSUFFICIENT_FB</li>
                <li>#ERROR_SPACE_LOCALIZATION_FAILED_FB</li>
                <li>#ERROR_SPACE_NETWORK_TIMEOUT_FB</li>
                <li>#ERROR_SPACE_NETWORK_REQUEST_FAILED_FB</li>
                <li>#ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB</li>
            </ul></dd>
        </dl>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityStorageBatch XR_FB_spatial_entity_storage_batch} extension <b>must</b> be enabled prior to using ##XrEventDataSpaceListSaveCompleteFB</li>
            <li>{@code type} <b>must</b> be #TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>
        """

    Expression("#TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrAsyncRequestIdFB("requestId", "the ID of the asynchronous request to save an entity.")
    XrResult("result", "an {@code XrResult} that describes whether the request succeeded or if an error occurred.")
}

val XrSpaceUserCreateInfoFB = struct(Module.OPENXR, "XrSpaceUserCreateInfoFB") {
    documentation =
        """
        Describes a user.

        <h5>Description</h5>
        The ##XrSpaceUserCreateInfoFB structure describes a user with which the application <b>can</b> interact.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityUser XR_FB_spatial_entity_user} extension <b>must</b> be enabled prior to using ##XrSpaceUserCreateInfoFB</li>
            <li>{@code type} <b>must</b> be #TYPE_SPACE_USER_CREATE_INFO_FB</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        #CreateSpaceUserFB()
        """

    Expression("#TYPE_SPACE_USER_CREATE_INFO_FB")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpaceUserIdFB("userId", "the user ID with which the application can reference.")
}

val XrSystemHeadsetIdPropertiesMETA = struct(Module.OPENXR, "XrSystemHeadsetIdPropertiesMETA", mutable = false) {
    documentation =
        """
        get headset model id from xrGetSystemProperties.

        <h5>Description</h5>
        An application <b>can</b> get a corresponding headset UUID of the headset model by chaining an ##XrSystemHeadsetIdPropertiesMETA structure to the ##XrSystemProperties when calling #GetSystemProperties().

        The UUID returned in the ##XrSystemHeadsetIdPropertiesMETA structure is an opaque UUID that identifies a runtime / headset model combo.

        The runtime <b>should</b> always return the same UUID for a given headset model for the entire lifetime of that product.

        The runtime <b>may</b> report a different UUID to some applications for compatibility purposes.

        This is in contrast to the {@code systemName} field in ##XrSystemProperties which is not required to be consistent across product renames.

        This is intended to be a temporary feature that will be deprecated along with its extension as soon as motivating use cases are resolved in a better way. See the disclaimer at the start of the {@link METAHeadsetId XR_META_headset_id} extension documentation for more details.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAHeadsetId XR_META_headset_id} extension <b>must</b> be enabled prior to using ##XrSystemHeadsetIdPropertiesMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_HEADSET_ID_PROPERTIES_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrUuidEXT, #GetSystemProperties()
        """

    Expression("#TYPE_SYSTEM_HEADSET_ID_PROPERTIES_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    XrUuidEXT("id", "the ##XrUuidEXT corresponding to the headset model.")
}

val XrPassthroughColorLutDataMETA = struct(Module.OPENXR, "XrPassthroughColorLutDataMETA") {
    documentation =
        """
        Passthrough color LUT data.

        <h5>Description</h5>
        ##XrPassthroughColorLutDataMETA defines the LUT data for a color LUT. This structure is used when creating and updating color LUTs.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to using ##XrPassthroughColorLutDataMETA</li>
            <li>{@code buffer} <b>must</b> be a pointer to an array of {@code bufferSize} {@code uint8_t} values</li>
            <li>The {@code bufferSize} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrPassthroughColorLutCreateInfoMETA, ##XrPassthroughColorLutUpdateInfoMETA
        """

    AutoSize("buffer")..uint32_t("bufferSize", "the number of bytes contained in the buffer data.")
    uint8_t.const.p("buffer", "a pointer to a memory block of {@code bufferSize} bytes that contains the LUT data.")
}

val XrPassthroughColorLutCreateInfoMETA = struct(Module.OPENXR, "XrPassthroughColorLutCreateInfoMETA") {
    documentation =
        """
        Passthrough color LUT creation info.

        <h5>Description</h5>
        {@code resolution} <b>must</b> be a power of 2, otherwise the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE. The runtime <b>may</b> impose a limit on the maximum supported resolution, which is indicated in ##XrSystemPassthroughColorLutPropertiesMETA. If {@code resolution} exceeds that limit, the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE.

        {@code data} contains a 3-dimensional array which defines an output color for each RGB input color. The input color is scaled to be in the range <code>[0, resolution]</code>. For an RGBA LUT, the RGBA tuple of output colors for an input color <code>(R<sub>in</sub>, G<sub>in</sub>, B<sub>in</sub>)</code> is found in the four bytes starting at the offset <code>4 * (R<sub>in</sub> + G<sub>in</sub> * resolution + B<sub>in</sub> * resolution<sup>2</sup>)</code>. For an RGB LUT, the RGB tuple of output colors for an input color <code>(R<sub>in</sub>, G<sub>in</sub>, B<sub>in</sub>)</code> is found in the three bytes starting at the offset <code>3 * (R<sub>in</sub> + G<sub>in</sub> * resolution + B<sub>in</sub> * resolution<sup>2</sup>)</code>.

        Color LUT data <b>must</b> be specified and interpreted in sRGB color space.

        Runtimes <b>must</b> employ trilinear interpolation of neighboring color values if the resolution of the color LUT is smaller than the bit depth of the input colors.

        The value of {@code bufferSize} in {@code data} <b>must</b> be equal to <code>resolution<sup>3</sup> * bytesPerElement</code>, where <code>bytesPerElement</code> is either 3 or 4 depending on {@code channels}. Otherwise, the runtime <b>must</b> return #ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to using ##XrPassthroughColorLutCreateInfoMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code channels} <b>must</b> be a valid {@code XrPassthroughColorLutChannelsMETA} value</li>
            <li>{@code data} <b>must</b> be a valid ##XrPassthroughColorLutDataMETA structure</li>
        </ul>

        <h5>See Also</h5>
        ##XrPassthroughColorLutDataMETA, #CreatePassthroughColorLutMETA()
        """

    Expression("#TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrPassthroughColorLutChannelsMETA("channels", "defines the color channels expected in one LUT element. The number of bytes expected per LUT element is 3 for #PASSTHROUGH_COLOR_LUT_CHANNELS_RGB_META and 4 for #PASSTHROUGH_COLOR_LUT_CHANNELS_RGBA_META.")
    uint32_t("resolution", "the number of LUT elements per input channel. The total number of elements in the LUT is <code>resolution<sup>3</sup></code>.")
    XrPassthroughColorLutDataMETA("data", "contains the data the LUT is initialized with.")
}

val XrPassthroughColorLutUpdateInfoMETA = struct(Module.OPENXR, "XrPassthroughColorLutUpdateInfoMETA") {
    documentation =
        """
        Passthrough color LUT update info.

        <h5>Description</h5>
        The LUT data <b>may</b> be updated for an existing color LUT, while channels and resolution remain constant after creation. Hence, the value of {@code bufferSize} in {@code data} <b>must</b> be equal to the buffer size specified at creation. Otherwise, the runtime <b>must</b> return #ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to using ##XrPassthroughColorLutUpdateInfoMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_COLOR_LUT_UPDATE_INFO_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code data} <b>must</b> be a valid ##XrPassthroughColorLutDataMETA structure</li>
        </ul>

        <h5>See Also</h5>
        ##XrPassthroughColorLutDataMETA, #UpdatePassthroughColorLutMETA()
        """

    Expression("#TYPE_PASSTHROUGH_COLOR_LUT_UPDATE_INFO_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrPassthroughColorLutDataMETA("data", "contains the updated LUT data.")
}

val XrPassthroughColorMapLutMETA = struct(Module.OPENXR, "XrPassthroughColorMapLutMETA") {
    documentation =
        """
        A color map defined by a LUT.

        <h5>Description</h5>
        ##XrPassthroughColorMapLutMETA lets applications apply a color LUT to a passthrough layer. Other Passthrough style elements (such as edges) <b>must</b> not be affected by color LUTs.

        Applications <b>may</b> use {@code weight} to efficiently blend between the original colors and the mapped colors. The blend is computed as <code>(1 - weight) * C<sub>in</sub> + weight * colorLut[C<sub>in</sub>]</code>.

        ##XrPassthroughColorMapLutMETA is provided in the {@code next} chain of ##XrPassthroughStyleFB when calling #PassthroughLayerSetStyleFB(). Subsequent calls to #PassthroughLayerSetStyleFB() with ##XrPassthroughColorMapLutMETA in the {@code next} chain update the color LUT for that layer. Subsequent calls to #PassthroughLayerSetStyleFB() without this ##XrPassthroughColorMapLutMETA (or ##XrPassthroughColorMapInterpolatedLutMETA) in the next chain disable color LUTs for that layer.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to using ##XrPassthroughColorMapLutMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_COLOR_MAP_LUT_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code colorLut} <b>must</b> be a valid {@code XrPassthroughColorLutMETA} handle</li>
        </ul>
        """

    Expression("#TYPE_PASSTHROUGH_COLOR_MAP_LUT_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrPassthroughColorLutMETA("colorLut", "an {@code XrPassthroughColorLutMETA}.")
    float("weight", "a factor in the range <code>[0, 1]</code> which defines the linear blend between the original and the mapped colors for the output color.")
}

val XrPassthroughColorMapInterpolatedLutMETA = struct(Module.OPENXR, "XrPassthroughColorMapInterpolatedLutMETA") {
    documentation =
        """
        A color map defined by the interpolation between two LUTs.

        <h5>Description</h5>
        ##XrPassthroughColorMapInterpolatedLutMETA lets applications apply the interpolation between two color LUTs to a passthrough layer. Applications <b>may</b> use this feature to smoothly transition between two color LUTs. Other Passthrough style elements (such as edges) <b>must</b> not be affected by color LUTs.

        The blend between {@code sourceColorLut} and {@code targetColorLut} is computed as <code>(1 - weight) * sourceColorLut[C<sub>in</sub>] + weight * targetColorLut[C<sub>in</sub>]</code>.

        ##XrPassthroughColorMapInterpolatedLutMETA is provided in the {@code next} chain of ##XrPassthroughStyleFB when calling #PassthroughLayerSetStyleFB(). Subsequent calls to #PassthroughLayerSetStyleFB() with ##XrPassthroughColorMapInterpolatedLutMETA in the next chain update the color LUT for that layer. Subsequent calls to #PassthroughLayerSetStyleFB() without this ##XrPassthroughColorMapInterpolatedLutMETA (or ##XrPassthroughColorMapLutMETA) in the next chain disable color LUTs for that layer.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to using ##XrPassthroughColorMapInterpolatedLutMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code sourceColorLut} <b>must</b> be a valid {@code XrPassthroughColorLutMETA} handle</li>
            <li>{@code targetColorLut} <b>must</b> be a valid {@code XrPassthroughColorLutMETA} handle</li>
            <li>Both of {@code sourceColorLut} and {@code targetColorLut} <b>must</b> have been created, allocated, or retrieved from the same {@code XrPassthroughFB}</li>
        </ul>
        """

    Expression("#TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrPassthroughColorLutMETA("sourceColorLut", "the initial {@code XrPassthroughColorLutMETA}.")
    XrPassthroughColorLutMETA("targetColorLut", "the final {@code XrPassthroughColorLutMETA}.")
    float("weight", "a factor in the range <code>[0, 1]</code> which defines the linear blend between the initial and the final color LUT.")
}

val XrSystemPassthroughColorLutPropertiesMETA = struct(Module.OPENXR, "XrSystemPassthroughColorLutPropertiesMETA", mutable = false) {
    documentation =
        """
        Passthrough color LUT system properties.

        <h5>Description</h5>
        When the {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension is enabled, an application <b>may</b> pass in an ##XrSystemPassthroughColorLutPropertiesMETA structure in next chain structure when calling #GetSystemProperties() to acquire information about the connected system.

        The runtime <b>must</b> populate the ##XrSystemPassthroughColorLutPropertiesMETA structure with the relevant information to the ##XrSystemProperties returned by the #GetSystemProperties() call.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to using ##XrSystemPassthroughColorLutPropertiesMETA</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSystemProperties
        """

    Expression("#TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.").mutable()
    uint32_t("maxColorLutResolution", "Maximum value for ##XrPassthroughColorLutCreateInfoMETA{@code ::resolution} supported by the system. Runtimes implementing this extension <b>must</b> support a value of at least 32 for this property.")
}

val XrPassthroughCreateInfoHTC = struct(Module.OPENXR, "XrPassthroughCreateInfoHTC") {
    documentation =
        """
        Information to create a passthrough handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCPassthrough XR_HTC_passthrough} extension <b>must</b> be enabled prior to using ##XrPassthroughCreateInfoHTC</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_CREATE_INFO_HTC</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code form} <b>must</b> be a valid {@code XrPassthroughFormHTC} value</li>
        </ul>

        <h5>See Also</h5>
        #CreatePassthroughHTC()
        """

    Expression("#TYPE_PASSTHROUGH_CREATE_INFO_HTC")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "NULL or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrPassthroughFormHTC("form", "{@code form} {@code XrPassthroughFormHTC} that specifies the form of passthrough.")
}

val XrPassthroughColorHTC = struct(Module.OPENXR, "XrPassthroughColorHTC") {
    documentation =
        """
        The alpha value of the passthrough.

        <h5>Description</h5>
        The application <b>can</b> specify the ##XrPassthroughColorHTC to adjust the alpha value of the passthrough. The range is between 0.0f and 1.0f, 1.0f means opaque.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCPassthrough XR_HTC_passthrough} extension <b>must</b> be enabled prior to using ##XrPassthroughColorHTC</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_COLOR_HTC</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerPassthroughHTC
        """

    Expression("#TYPE_PASSTHROUGH_COLOR_HTC")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    float("alpha", "the alpha value of the passthrough in the range [0, 1].")
}

val XrPassthroughMeshTransformInfoHTC = struct(Module.OPENXR, "XrPassthroughMeshTransformInfoHTC") {
    documentation =
        """
        The information of mesh and transformation of the passthrough.

        <h5>Description</h5>
        The ##XrPassthroughMeshTransformInfoHTC structure describes the mesh and transformation.

        The application <b>must</b> specify the ##XrPassthroughMeshTransformInfoHTC in the {@code next} chain of ##XrCompositionLayerPassthroughHTC if the specified form of passthrough layer previously created by #CreatePassthroughHTC() is #PASSTHROUGH_FORM_PROJECTED_HTC.

        Passing ##XrPassthroughMeshTransformInfoHTC updates the projected mesh information in the runtime for passthrough layer composition.

        If ##XrPassthroughMeshTransformInfoHTC is not set correctly, runtime <b>must</b> return error #ERROR_VALIDATION_FAILURE when #EndFrame() is called with composition layer ##XrCompositionLayerPassthroughHTC.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCPassthrough XR_HTC_passthrough} extension <b>must</b> be enabled prior to using ##XrPassthroughMeshTransformInfoHTC</li>
            <li>{@code type} <b>must</b> be #TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code vertices} <b>must</b> be a pointer to an array of {@code vertexCount} ##XrVector3f structures</li>
            <li>{@code indices} <b>must</b> be a pointer to an array of {@code indexCount} {@code uint32_t} values</li>
            <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>The {@code vertexCount} parameter <b>must</b> be greater than 0</li>
            <li>The {@code indexCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrPosef, ##XrVector3f
        """

    Expression("#TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("vertices")..uint32_t("vertexCount", "the count of vertices array in the mesh.")
    XrVector3f.const.p("vertices", "an array of ##XrVector3f. The size of the array <b>must</b> be equal to vertexCount.")
    AutoSize("indices")..uint32_t("indexCount", "the count of indices array in the mesh.")
    uint32_t.const.p("indices", "an array of triangle indices. The size of the array <b>must</b> be equal to indexCount.")
    XrSpace("baseSpace", "the {@code XrSpace} that defines the projected passthrough’s base space for transformations.")
    XrTime("time", "the {@code XrTime} that defines the time at which the transform is applied.")
    XrPosef("pose", "the ##XrPosef that defines the pose of the mesh")
    XrVector3f("scale", "the ##XrVector3f that defines the scale of the mesh")
}

val XrCompositionLayerPassthroughHTC = struct(Module.OPENXR, "XrCompositionLayerPassthroughHTC", parentStruct = XrCompositionLayerBaseHeader) {
    documentation =
        """
        A composition layer for passthrough.

        <h5>Description</h5>
        The application <b>can</b> create an ##XrCompositionLayerPassthroughHTC structure with the created {@code passthrough} and the corresponding information. A pointer to ##XrCompositionLayerPassthroughHTC <b>may</b> be submitted in #EndFrame() as a pointer to the base structure ##XrCompositionLayerBaseHeader, in the desired layer order, to request the runtime to composite a passthrough layer into the final frame output.

        If the passthrough form specified to #CreatePassthroughHTC() is #PASSTHROUGH_FORM_PROJECTED_HTC, ##XrPassthroughMeshTransformInfoHTC <b>must</b> appear in the {@code next} chain. If they are absent, the runtime <b>must</b> return error #ERROR_VALIDATION_FAILURE.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCPassthrough XR_HTC_passthrough} extension <b>must</b> be enabled prior to using ##XrCompositionLayerPassthroughHTC</li>
            <li>{@code type} <b>must</b> be #TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrPassthroughMeshTransformInfoHTC</li>
            <li>{@code layerFlags} <b>must</b> be a valid combination of {@code XrCompositionLayerFlagBits} values</li>
            <li>{@code layerFlags} <b>must</b> not be 0</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code passthrough} <b>must</b> be a valid {@code XrPassthroughHTC} handle</li>
            <li>{@code color} <b>must</b> be a valid ##XrPassthroughColorHTC structure</li>
            <li>Both of {@code passthrough} and {@code space} <b>must</b> have been created, allocated, or retrieved from the same {@code XrSession}</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerBaseHeader, ##XrPassthroughColorHTC
        """

    Expression("#TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrPassthroughMeshTransformInfoHTC",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain, such as ##XrPassthroughMeshTransformInfoHTC.")
    XrCompositionLayerFlags("layerFlags", "a bitmask of {@code XrCompositionLayerFlagBits} describing flags to apply to the layer.")
    XrSpace("space", "the {@code XrSpace} that specifies the layer’s space - <b>must</b> be #NULL_HANDLE.")
    XrPassthroughHTC("passthrough", "the {@code XrPassthroughHTC} previously created by #CreatePassthroughHTC().")
    XrPassthroughColorHTC("color", "the ##XrPassthroughColorHTC describing the color information with the alpha value of the passthrough layer.")
}

val XrFoveationApplyInfoHTC = struct(Module.OPENXR, "XrFoveationApplyInfoHTC") {
    documentation =
        """
        Information for foveation applying.

        <h5>Description</h5>
        The application <b>should</b> set the following configurations in ##XrFoveationApplyInfoHTC:

        <ul>
            <li>The foveation mode to be applied.</li>
            <li>The specified ##XrSwapchainSubImage to the corresponding view.</li>
        </ul>

        The {@code faceCount} of {@code XrSwapchain} in ##XrSwapchainSubImage <b>must</b> be 1 since this extension does not support cubemaps.

        If {@code mode} is #FOVEATION_MODE_DYNAMIC_HTC, the {@code next} chain for this structure <b>must</b> include ##XrFoveationDynamicModeInfoHTC structure.

        If {@code mode} is #FOVEATION_MODE_CUSTOM_HTC, the {@code next} chain for this structure <b>must</b> include ##XrFoveationCustomModeInfoHTC structure.

        The order of {@code subImages} <b>must</b> be the same order as in ##XrCompositionLayerProjectionView when submitted in #EndFrame().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCFoveation XR_HTC_foveation} extension <b>must</b> be enabled prior to using ##XrFoveationApplyInfoHTC</li>
            <li>{@code type} <b>must</b> be #TYPE_FOVEATION_APPLY_INFO_HTC</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: ##XrFoveationCustomModeInfoHTC, ##XrFoveationDynamicModeInfoHTC</li>
            <li>{@code mode} <b>must</b> be a valid {@code XrFoveationModeHTC} value</li>
            <li>{@code subImages} <b>must</b> be a pointer to an array of {@code subImageCount} ##XrSwapchainSubImage structures</li>
            <li>The {@code subImageCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrSwapchainSubImage, #ApplyFoveationHTC()
        """

    Expression("#TYPE_FOVEATION_APPLY_INFO_HTC")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    PointerSetter(
        "XrFoveationCustomModeInfoHTC", "XrFoveationDynamicModeInfoHTC",
        prepend = true
    )..nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrFoveationModeHTC("mode", "an {@code XrFoveationModeHTC} enum describing the foveation mode.")
    AutoSize("subImages")..uint32_t("subImageCount", "the count of {@code subImages} in the {@code subImages} array. This <b>must</b> be equal to the number of view poses returned by #LocateViews().")
    XrSwapchainSubImage.p("subImages", "an array of ##XrSwapchainSubImage to apply foveated rendering.")
}

val XrFoveationConfigurationHTC = struct(Module.OPENXR, "XrFoveationConfigurationHTC") {
    documentation =
        """
        Configuration of foveation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCFoveation XR_HTC_foveation} extension <b>must</b> be enabled prior to using ##XrFoveationConfigurationHTC</li>
            <li>{@code level} <b>must</b> be a valid {@code XrFoveationLevelHTC} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrFoveationCustomModeInfoHTC, ##XrVector2f
        """

    XrFoveationLevelHTC("level", "the pixel density drop level of periphery area specified by {@code XrFoveationLevelHTC} .")
    float("clearFovDegree", "the value indicating the total horizontal and vertical field angle with the original pixel density level. {@code clearFovDegree} <b>must</b> be specified in degree, and <b>must</b> be in the range [0, 180].")
    XrVector2f("focalCenterOffset", "the desired center offset of the field of view in NDC(normalized device coordinates) space. The x and y of {@code focalCenterOffset} <b>must</b> be in the range [-1, 1].")
}

val XrFoveationDynamicModeInfoHTC = struct(Module.OPENXR, "XrFoveationDynamicModeInfoHTC") {
    documentation =
        """
        Configuration for dynamic mode.

        <h5>Description</h5>
        The application <b>must</b> chain an ##XrFoveationDynamicModeInfoHTC structure to ##XrFoveationApplyInfoHTC if dynamic mode is set.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCFoveation XR_HTC_foveation} extension <b>must</b> be enabled prior to using ##XrFoveationDynamicModeInfoHTC</li>
            <li>{@code type} <b>must</b> be #TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code dynamicFlags} <b>must</b> be 0 or a valid combination of {@code XrFoveationDynamicFlagBitsHTC} values</li>
        </ul>
        """

    Expression("#TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrFoveationDynamicFlagsHTC("dynamicFlags", "a bitmask of {@code XrFoveationDynamicFlagBitsHTC} indicated which item <b>may</b> be changed during dynamic mode.")
}

val XrFoveationCustomModeInfoHTC = struct(Module.OPENXR, "XrFoveationCustomModeInfoHTC") {
    documentation =
        """
        Configuration for custom mode.

        <h5>Description</h5>
        The application <b>must</b> chain an ##XrFoveationCustomModeInfoHTC structure to ##XrFoveationApplyInfoHTC to customize foveation if custom mode is set.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCFoveation XR_HTC_foveation} extension <b>must</b> be enabled prior to using ##XrFoveationCustomModeInfoHTC</li>
            <li>{@code type} <b>must</b> be #TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code configs} <b>must</b> be a pointer to an array of {@code configCount} valid ##XrFoveationConfigurationHTC structures</li>
            <li>The {@code configCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrFoveationConfigurationHTC
        """

    Expression("#TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("configs")..uint32_t("configCount", "a {@code uint32_t} describing the count of elements in the {@code configs} array, which <b>must</b> be the number of views.")
    XrFoveationConfigurationHTC.const.p("configs", "an array of ##XrFoveationConfigurationHTC structure contains the custom foveation settings for the corresponding views.")
}

val XrActiveActionSetPriorityEXT = struct(Module.OPENXR, "XrActiveActionSetPriorityEXT") {
    documentation =
        """
        Action set priority mapping.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTActiveActionSetPriority XR_EXT_active_action_set_priority} extension <b>must</b> be enabled prior to using ##XrActiveActionSetPriorityEXT</li>
            <li>{@code actionSet} <b>must</b> be a valid {@code XrActionSet} handle</li>
        </ul>

        <h5>See Also</h5>
        ##XrActionsSyncInfo, ##XrActiveActionSetPrioritiesEXT, #SyncActions()
        """

    XrActionSet("actionSet", "the handle of the {@code XrActionSet} to set the priority number for.")
    uint32_t("priorityOverride", "an integer specifying the priority of the action set while it is active.")
}

val XrActiveActionSetPrioritiesEXT = struct(Module.OPENXR, "XrActiveActionSetPrioritiesEXT") {
    documentation =
        """
        Active action set priority numbers.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTActiveActionSetPriority XR_EXT_active_action_set_priority} extension <b>must</b> be enabled prior to using ##XrActiveActionSetPrioritiesEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code actionSetPriorities} <b>must</b> be a pointer to an array of {@code actionSetPriorityCount} valid ##XrActiveActionSetPriorityEXT structures</li>
            <li>The {@code actionSetPriorityCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        The runtime <b>must</b> ignore any priority numbers for action sets that were not specified as an active action set in the ##XrActionsSyncInfo structure as this would have no effect.

        The priority numbers provided in ##XrActiveActionSetPriorityEXT <b>must</b> override the priority number of the active action set starting with the #SyncActions() call it is provided to, until the first subsequent call to #SyncActions().

        When a subsequent call is made to #SyncActions() where an active action set does not have a corresponding priority number specified in the ##XrActiveActionSetPriorityEXT structure the priority number for that action set <b>must</b> revert back to the priority number provided in ##XrActionSetCreateInfo when that action set was created.

        <h5>See Also</h5>
        ##XrActionsSyncInfo, ##XrActiveActionSetPriorityEXT, #SyncActions()
        """

    Expression("#TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("actionSetPriorities")..uint32_t("actionSetPriorityCount", "")
    XrActiveActionSetPriorityEXT.const.p("actionSetPriorities", "a pointer to an array that maps action sets to their active priority numbers. If an action set is specified multiple times, the runtime <b>may</b> return #ERROR_VALIDATION_FAILURE from #SyncActions().")
}

val XrSystemForceFeedbackCurlPropertiesMNDX = struct(Module.OPENXR, "XrSystemForceFeedbackCurlPropertiesMNDX", mutable = false) {
    documentation =
        """
        System property for force feedback curl.

        <h5>Description</h5>
        An application <b>may</b> inspect whether the system is capable of force feedback by chaining an ##XrSystemForceFeedbackCurlPropertiesMNDX structure to the ##XrSystemProperties structure when calling #GetSystemProperties().

        The runtime <b>should</b> return #TRUE for {@code supportsForceFeedback} when force feedback is available in the system, otherwise #FALSE. Force feedback calls <b>must</b> return #ERROR_FEATURE_UNSUPPORTED if force feedback is not available in the system.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MNDXForceFeedbackCurl XR_MNDX_force_feedback_curl} extension <b>must</b> be enabled prior to using ##XrSystemForceFeedbackCurlPropertiesMNDX</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSystemProperties, #GetSystemProperties()
        """

    Expression("#TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.").mutable()
    XrBool32("supportsForceFeedbackCurl", "an {@code XrBool32}, indicating if the current system is capable of performing force feedback.")
}

val XrForceFeedbackCurlApplyLocationMNDX = struct(Module.OPENXR, "XrForceFeedbackCurlApplyLocationMNDX") {
    documentation =
        """
        Structure representing and containing information on how to apply force feedback to a single location.

        <h5>Description</h5>
        {@code value} is specified as a limit in a single direction. For example, if the value specified is 0.5, a location <b>must</b> have free movement from the point where it would be incapable of movement if {@code value} was 1, to 0.5 of the range the location is capable of moving.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MNDXForceFeedbackCurl XR_MNDX_force_feedback_curl} extension <b>must</b> be enabled prior to using ##XrForceFeedbackCurlApplyLocationMNDX</li>
            <li>{@code location} <b>must</b> be a valid {@code XrForceFeedbackCurlLocationMNDX} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrForceFeedbackCurlApplyLocationsMNDX, #ApplyForceFeedbackCurlMNDX()
        """

    XrForceFeedbackCurlLocationMNDX("location", "represents the location to apply force feedback to.")
    float("value", "a value from 0-1 representing the amount of force feedback to apply. The range of the value should represent the entire range the location is capable of moving through, with 1 representing making the location incapable of movement, and 0 being fully flexible. For example, in the case of a finger curl, setting {@code value} to 1 would prevent the finger from curling at all (fully extended), and 0 would allow the finger to have free range of movement, being able to curl fully.")
}

val XrForceFeedbackCurlApplyLocationsMNDX = struct(Module.OPENXR, "XrForceFeedbackCurlApplyLocationsMNDX") {
    documentation =
        """
        Structure representing an array of locations to apply force feedback to.

        <h5>Description</h5>
        Contains an array of ##XrForceFeedbackCurlApplyLocationMNDX that contains information on locations to apply force feedback to.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MNDXForceFeedbackCurl XR_MNDX_force_feedback_curl} extension <b>must</b> be enabled prior to using ##XrForceFeedbackCurlApplyLocationsMNDX</li>
            <li>{@code type} <b>must</b> be #TYPE_FORCE_FEEDBACK_CURL_APPLY_LOCATIONS_MNDX</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code locations} <b>must</b> be a pointer to an array of {@code locationCount} ##XrForceFeedbackCurlApplyLocationMNDX structures</li>
            <li>The {@code locationCount} parameter <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##XrForceFeedbackCurlApplyLocationMNDX, #ApplyForceFeedbackCurlMNDX()
        """

    Expression("#TYPE_FORCE_FEEDBACK_CURL_APPLY_LOCATIONS_MNDX")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    AutoSize("locations")..uint32_t("locationCount", "the number of elements in the {@code locations} array.")
    XrForceFeedbackCurlApplyLocationMNDX.p("locations", "a pointer to an array of locations to apply force feedback.")
}

val XrHandTrackingDataSourceInfoEXT = struct(Module.OPENXR, "XrHandTrackingDataSourceInfoEXT") {
    documentation =
        """
        Specify the data source to create the hand tracker.

        <h5>Description</h5>
        The ##XrHandTrackingDataSourceInfoEXT is a structure that an application <b>can</b> chain to ##XrHandTrackerCreateInfoEXT{@code ::next} to specify the hand tracking data sources that the application accepts.

        Because the hand tracking device <b>may</b> change during a running session, the runtime <b>may</b> return a valid {@code XrHandTrackerEXT} handle even if there is no currently active hand tracking device or the active device does not safisty any or all data sources requested by the applications’s call to #CreateHandTrackerEXT(). The runtime <b>may</b> instead return #ERROR_FEATURE_UNSUPPORTED from #CreateHandTrackerEXT(), if for example the runtime believes it will never be able to satisfy the request.

        If any value in {@code requestedDataSources} is duplicated, the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE from the call to #CreateHandTrackerEXT(). If {@code requestedDataSourceCount} is 0, the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE from the call to #CreateHandTrackerEXT().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTHandTrackingDataSource XR_EXT_hand_tracking_data_source} extension <b>must</b> be enabled prior to using ##XrHandTrackingDataSourceInfoEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code requestedDataSourceCount} is not 0, {@code requestedDataSources} <b>must</b> be a pointer to an array of {@code requestedDataSourceCount} {@code XrHandTrackingDataSourceEXT} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandTrackerCreateInfoEXT, #CreateHandTrackerEXT()
        """

    Expression("#TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("requestedDataSources", optional = true)..uint32_t("requestedDataSourceCount", "the number of elements in the {@code requestedDataSources} array.")
    XrHandTrackingDataSourceEXT.p("requestedDataSources", "an array of {@code XrHandTrackingDataSourceEXT} that the application accepts.")
}

val XrHandTrackingDataSourceStateEXT = struct(Module.OPENXR, "XrHandTrackingDataSourceStateEXT") {
    documentation =
        """
        Chains to ##XrHandJointLocationsEXT to get hand tracking data source state.

        <h5>Description</h5>
        ##XrHandTrackingDataSourceStateEXT is a structure that an application <b>can</b> chain to ##XrHandJointLocationsEXT{@code ::next} when calling #LocateHandJointsEXT() to retrieve the data source of the currently active hand tracking device.

        When the returned {@code isActive} is {@code XR_FALSE}, it indicates the currently active hand tracking device does not support any of the requested data sources. In these cases, the runtime <b>must</b> also return no valid tracking locations for hand joints from this #LocateHandJointsEXT() function.

        If the tracker was not created with ##XrHandTrackingDataSourceInfoEXT chained to ##XrHandTrackerCreateInfoEXT{@code ::next}, then the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE, if ##XrHandTrackingDataSourceStateEXT is passed in the call to #LocateHandJointsEXT().

        If there is an active hand tracking device that is one of the specified {@code requestedDataSources}, the runtime <b>must</b> set {@code isActive} to #TRUE. When the runtime sets {@code isActive} to #TRUE, the runtime <b>must</b> set {@code dataSource} indicate the active data source. The runtime <b>must</b> return a {@code dataSource} that is a subset of the {@code requestedDataSources} when creating the corresponding hand tracker.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTHandTrackingDataSource XR_EXT_hand_tracking_data_source} extension <b>must</b> be enabled prior to using ##XrHandTrackingDataSourceStateEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code dataSource} <b>must</b> be a valid {@code XrHandTrackingDataSourceEXT} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandJointLocationsEXT, #LocateHandJointsEXT()
        """

    Expression("#TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrBool32("isActive", "indicating there is an active data source")
    XrHandTrackingDataSourceEXT("dataSource", "indicating the data source that was used to generate the hand tracking joints.")
}

val XrSystemPlaneDetectionPropertiesEXT = struct(Module.OPENXR, "XrSystemPlaneDetectionPropertiesEXT", mutable = false) {
    documentation =
        """
        System Properties of the Plane Detection extension.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to using ##XrSystemPlaneDetectionPropertiesEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
        </ul>

        <h5>See Also</h5>
        ##XrSystemProperties
        """

    Expression("#TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.").mutable()
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.").mutable()
    XrPlaneDetectionCapabilityFlagsEXT("supportedFeatures", "a bitfield, with bit masks defined in {@code XrPlaneDetectionCapabilityFlagBitsEXT}.")
}

val XrPlaneDetectorCreateInfoEXT = struct(Module.OPENXR, "XrPlaneDetectorCreateInfoEXT") {
    documentation =
        """
        Information to create a plane detection handle.

        <h5>Description</h5>
        The ##XrPlaneDetectorCreateInfoEXT structure describes the information to create an {@code XrPlaneDetectorEXT} handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to using ##XrPlaneDetectorCreateInfoEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_PLANE_DETECTOR_CREATE_INFO_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code flags} <b>must</b> be 0 or a valid combination of {@code XrPlaneDetectorFlagBitsEXT} values</li>
        </ul>

        <h5>See Also</h5>
        #CreatePlaneDetectorEXT()
        """

    Expression("#TYPE_PLANE_DETECTOR_CREATE_INFO_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrPlaneDetectorFlagsEXT("flags", "<b>must</b> be a valid combination of {@code XrPlaneDetectorFlagsEXT} flags or zero.")
}

val XrExtent3DfEXT = struct(Module.OPENXR, "XrExtent3DfEXT") {
    documentation =
        """
        Extent in three dimensions.

        <h5>Description</h5>
        The ##XrExtent3DfEXT structure describes a axis aligned three-dimensional floating-point extent: This structure is used for component values that <b>may</b> be fractional (floating-point). If used to represent physical distances, values <b>must</b> be in meters.

        The {@code width} (X), {@code height} (Y) and {@code depth} (Z) values <b>must</b> be non-negative.

        <h5>See Also</h5>
        ##XrExtent2Df, ##XrPlaneDetectorBeginInfoEXT
        """

    float("width", "the floating-point width of the extent.")
    float("height", "the floating-point height of the extent.")
    float("depth", "the floating-point depth of the extent.")
}

val XrPlaneDetectorBeginInfoEXT = struct(Module.OPENXR, "XrPlaneDetectorBeginInfoEXT") {
    documentation =
        """
        Describes the information to detect planes.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to using ##XrPlaneDetectorBeginInfoEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>If {@code orientationCount} is not 0, {@code orientations} <b>must</b> be a pointer to an array of {@code orientationCount} valid {@code XrPlaneDetectorOrientationEXT} values</li>
            <li>If {@code semanticTypeCount} is not 0, {@code semanticTypes} <b>must</b> be a pointer to an array of {@code semanticTypeCount} valid {@code XrPlaneDetectorSemanticTypeEXT} values</li>
        </ul>

        <h5>See Also</h5>
        ##XrExtent3DfEXT, ##XrPosef, #BeginPlaneDetectionEXT()
        """

    Expression("#TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.")
    XrSpace("baseSpace", "the {@code XrSpace} that the {@code boundingBox} is defined in.")
    XrTime("time", "an {@code XrTime} at which to detect the planes.")
    AutoSize("orientations", optional = true)..uint32_t("orientationCount", "the number of elements in the {@code orientations}.")
    nullable..XrPlaneDetectorOrientationEXT.const.p("orientations", "an array of {@code XrPlaneDetectorOrientationEXT}. If this field is null no orientation filtering is applied. If any orientations are present only planes with any of the orientation listed are returned.")
    AutoSize("semanticTypes", optional = true)..uint32_t("semanticTypeCount", "the number of elements in the {@code semanticTypes}.")
    nullable..XrPlaneDetectorSemanticTypeEXT.const.p("semanticTypes", "an array of {@code XrPlaneDetectorSemanticTypeEXT}. If this field is null no semantic type filtering is applied. If any semantic types are present only planes with matching semantic types are returned.")
    uint32_t("maxPlanes", "the maximum number of planes the runtime <b>may</b> return. This number <b>must</b> be larger than 0. If the number is 0 the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE.")
    float("minArea", "the minimum area in square meters a plane <b>must</b> have to be returned. A runtime <b>may</b> have a lower limit under which planes are not detected regardless of {@code minArea} and silently drop planes lower than the internal minimum.")
    XrPosef("boundingBoxPose", "the pose of the center of the bounding box of the volume to use for detection in {@code baseSpace}.")
    XrExtent3DfEXT("boundingBoxExtent", "the extent of the bounding box to use for detection. If any part of a plane falls within the bounding box it <b>should</b> be considered for inclusion subject to the other filters. This means that planes <b>may</b> extend beyond the bounding box. A runtime <b>may</b> have an upper limit on the detection range and silently clip the results to that internally.")
}

val XrPlaneDetectorGetInfoEXT = struct(Module.OPENXR, "XrPlaneDetectorGetInfoEXT") {
    documentation =
        """
        Contains the plane retrieval information.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to using ##XrPlaneDetectorGetInfoEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_PLANE_DETECTOR_GET_INFO_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
        </ul>

        <h5>See Also</h5>
        #GetPlaneDetectionsEXT()
        """

    Expression("#TYPE_PLANE_DETECTOR_GET_INFO_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_const_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    XrSpace("baseSpace", "the plane pose will be relative to this {@code XrSpace} at {@code time}.")
    XrTime("time", "the {@code XrTime} at which to evaluate the coordinates relative to the {@code baseSpace}.")
}

val XrPlaneDetectorLocationEXT = struct(Module.OPENXR, "XrPlaneDetectorLocationEXT") {
    documentation =
        """
        Describes the location of a plane.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to using ##XrPlaneDetectorLocationEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_PLANE_DETECTOR_LOCATION_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>{@code locationFlags} <b>must</b> be 0 or a valid combination of {@code XrSpaceLocationFlagBits} values</li>
            <li>If {@code orientation} is not 0, {@code orientation} <b>must</b> be a valid {@code XrPlaneDetectorOrientationEXT} value</li>
            <li>If {@code semanticType} is not 0, {@code semanticType} <b>must</b> be a valid {@code XrPlaneDetectorSemanticTypeEXT} value</li>
        </ul>

        <h5>See Also</h5>
        ##XrExtent2Df, ##XrPlaneDetectorLocationsEXT, ##XrPosef, #GetPlaneDetectionsEXT()
        """

    Expression("#TYPE_PLANE_DETECTOR_LOCATION_EXT")..XrStructureType("type", "")
    nullable..opaque_p("next", "")
    uint64_t("planeId", "a {@code uint64_t} unique identifier of the plane. The planeId <b>should</b> remain the same for the duration of the {@code XrPlaneDetectorEXT} handle for a physical plane. A runtime on occasion <b>may</b> assign a different id to the same physical plane, for example when several planes merge into one plane. {@code planeId} <b>must</b> remain valid until the next call to #BeginPlaneDetectionEXT() or #DestroyPlaneDetectorEXT(). This id is used by #GetPlanePolygonBufferEXT().")
    XrSpaceLocationFlags("locationFlags", "a bitfield, with bit masks defined in {@code XrSpaceLocationFlagBits}, to indicate which members contain valid data. If none of the bits are set, no other fields in this structure <b>should</b> be considered to be valid or meaningful.")
    XrPosef("pose", "an ##XrPosef defining the position and orientation of the origin of a plane within the reference frame of the corresponding ##XrPlaneDetectorGetInfoEXT{@code ::baseSpace}.")
    XrExtent2Df("extents", "")
    XrPlaneDetectorOrientationEXT("orientation", "the detected orientation of the plane.")
    XrPlaneDetectorSemanticTypeEXT("semanticType", "{@code semanticType} {@code XrPlaneDetectorSemanticTypeEXT} type of the plane.")
    uint32_t("polygonBufferCount", "the number of polygon buffers associated with this plane. If this is zero no polygon buffer was generated. The first polygon buffer is always the outside contour. If contours are requested with #PLANE_DETECTOR_ENABLE_CONTOUR_BIT_EXT this value <b>must</b> always be at least 1.")
}

val XrPlaneDetectorLocationsEXT = struct(Module.OPENXR, "XrPlaneDetectorLocationsEXT") {
    documentation =
        """
        Contains the plane information.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to using ##XrPlaneDetectorLocationsEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_PLANE_DETECTOR_LOCATIONS_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code planeLocationCapacityInput} is not 0, {@code planeLocations} <b>must</b> be a pointer to an array of {@code planeLocationCapacityInput} ##XrPlaneDetectorLocationEXT structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrPlaneDetectorLocationEXT, #GetPlaneDetectionsEXT()
        """

    Expression("#TYPE_PLANE_DETECTOR_LOCATIONS_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("planeLocations", optional = true)..uint32_t("planeLocationCapacityInput", "the capacity of the array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("planeLocationCountOutput", "the number of planes, or the required capacity in the case that {@code planeCapacityInput} is insufficient.")
    nullable..XrPlaneDetectorLocationEXT.p("planeLocations", "an array of ##XrPlaneDetectorLocationEXT. It <b>can</b> be {@code NULL} if {@code planeCapacityInput} is 0.")
}

val XrPlaneDetectorPolygonBufferEXT = struct(Module.OPENXR, "XrPlaneDetectorPolygonBufferEXT") {
    documentation =
        """
        Plane polygon vertex buffer.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to using ##XrPlaneDetectorPolygonBufferEXT</li>
            <li>{@code type} <b>must</b> be #TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT</li>
            <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
            <li>If {@code vertexCapacityInput} is not 0, {@code vertices} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} ##XrVector2f structures</li>
        </ul>

        <h5>See Also</h5>
        ##XrVector2f, #GetPlanePolygonBufferEXT()
        """

    Expression("#TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT")..XrStructureType("type", "the {@code XrStructureType} of this structure.")
    nullable..opaque_p("next", "{@code NULL} or a pointer to the next structure in a structure chain.")
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput", "the capacity of the array, or 0 to indicate a request to retrieve the required capacity.")
    uint32_t("vertexCountOutput", "the count of {@code vertices} written, or the required capacity in the case that {@code vertexCapacityInput} is insufficient.")
    nullable..XrVector2f.p("vertices", "an array of ##XrVector2f that <b>must</b> be filled by the runtime with the positions of the polygon vertices relative to the plane’s pose.")
}