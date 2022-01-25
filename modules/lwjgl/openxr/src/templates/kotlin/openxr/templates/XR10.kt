/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val XR10 = "XR10".nativeClass(Module.OPENXR, "XR10", prefix = "XR", binding = XR_BINDING_INSTANCE) {
    documentation =
        """
        The core OpenXR 1.0 functionality.
        """

    EnumConstant(
        """
        XrResult - Result codes

        <h5>Description</h5>
        All return codes in the API are reported via {@code XrResult} return values.

        Some common suffixes shared across many of the return codes are defined below:

        <ul>
            <li>{@code _INVALID}: The specified handle, atom or value is formatted incorrectly, or the specified handle was never created or has been destroyed.</li>
            <li>{@code _UNSUPPORTED}: The specified handle, atom, enumerant or value is formatted correctly but cannot be used for the lifetime of this function’s parent handle.</li>
            <li>{@code _UNAVAILABLE}: The specified handle, atom, enumerant or value is supported by this function’s parent handle but not at this moment.</li>
        </ul>

        <h5>Success Codes</h5>
        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#SUCCESS</td><td>Function successfully completed.</td></tr>
                <tr><td>#TIMEOUT_EXPIRED</td><td>The specified timeout time occurred before the operation could complete.</td></tr>
                <tr><td>#SESSION_LOSS_PENDING</td><td>The session will be lost soon.</td></tr>
                <tr><td>#EVENT_UNAVAILABLE</td><td>No event was available.</td></tr>
                <tr><td>#SPACE_BOUNDS_UNAVAILABLE</td><td>The space’s bounds are not known at the moment.</td></tr>
                <tr><td>#SESSION_NOT_FOCUSED</td><td>The session is not in the focused state.</td></tr>
                <tr><td>#FRAME_DISCARDED</td><td>A frame has been discarded from composition.</td></tr>
                <tr><td>#RENDER_MODEL_UNAVAILABLE_FB</td><td>The model is unavailable. (Added by the {@link FBRenderModel XR_FB_render_model} extension)</td></tr>
            </tbody>
        </table>

        <h5>Error Codes</h5>
        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#ERROR_VALIDATION_FAILURE</td><td>The function usage was invalid in some way.</td></tr>
                <tr><td>#ERROR_RUNTIME_FAILURE</td><td>The runtime failed to handle the function in an unexpected way that is not covered by another error result.</td></tr>
                <tr><td>#ERROR_OUT_OF_MEMORY</td><td>A memory allocation has failed.</td></tr>
                <tr><td>#ERROR_API_VERSION_UNSUPPORTED</td><td>The runtime does not support the requested API version.</td></tr>
                <tr><td>#ERROR_INITIALIZATION_FAILED</td><td>Initialization of object could not be completed.</td></tr>
                <tr><td>#ERROR_FUNCTION_UNSUPPORTED</td><td>The requested function was not found or is otherwise unsupported.</td></tr>
                <tr><td>#ERROR_FEATURE_UNSUPPORTED</td><td>The requested feature is not supported.</td></tr>
                <tr><td>#ERROR_EXTENSION_NOT_PRESENT</td><td>A requested extension is not supported.</td></tr>
                <tr><td>#ERROR_LIMIT_REACHED</td><td>The runtime supports no more of the requested resource.</td></tr>
                <tr><td>#ERROR_SIZE_INSUFFICIENT</td><td>The supplied size was smaller than required.</td></tr>
                <tr><td>#ERROR_HANDLE_INVALID</td><td>A supplied object handle was invalid.</td></tr>
                <tr><td>#ERROR_INSTANCE_LOST</td><td>The {@code XrInstance} was lost or could not be found. It will need to be destroyed and optionally recreated.</td></tr>
                <tr><td>#ERROR_SESSION_RUNNING</td><td>The session <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session_running">is already running</a>.</td></tr>
                <tr><td>#ERROR_SESSION_NOT_RUNNING</td><td>The session <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session_not_running">is not yet running</a>.</td></tr>
                <tr><td>#ERROR_SESSION_LOST</td><td>The {@code XrSession} was lost. It will need to be destroyed and optionally recreated.</td></tr>
                <tr><td>#ERROR_SYSTEM_INVALID</td><td>The provided {@code XrSystemId} was invalid.</td></tr>
                <tr><td>#ERROR_PATH_INVALID</td><td>The provided {@code XrPath} was not valid.</td></tr>
                <tr><td>#ERROR_PATH_COUNT_EXCEEDED</td><td>The maximum number of supported semantic paths has been reached.</td></tr>
                <tr><td>#ERROR_PATH_FORMAT_INVALID</td><td>The semantic path character format is invalid.</td></tr>
                <tr><td>#ERROR_PATH_UNSUPPORTED</td><td>The semantic path is unsupported.</td></tr>
                <tr><td>#ERROR_LAYER_INVALID</td><td>The layer was NULL or otherwise invalid.</td></tr>
                <tr><td>#ERROR_LAYER_LIMIT_EXCEEDED</td><td>The number of specified layers is greater than the supported number.</td></tr>
                <tr><td>#ERROR_SWAPCHAIN_RECT_INVALID</td><td>The image rect was negatively sized or otherwise invalid.</td></tr>
                <tr><td>#ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED</td><td>The image format is not supported by the runtime or platform.</td></tr>
                <tr><td>#ERROR_ACTION_TYPE_MISMATCH</td><td>The API used to retrieve an action’s state does not match the action’s type.</td></tr>
                <tr><td>#ERROR_SESSION_NOT_READY</td><td>The session is not in the ready state.</td></tr>
                <tr><td>#ERROR_SESSION_NOT_STOPPING</td><td>The session is not in the stopping state.</td></tr>
                <tr><td>#ERROR_TIME_INVALID</td><td>The provided {@code XrTime} was zero, negative, or out of range.</td></tr>
                <tr><td>#ERROR_REFERENCE_SPACE_UNSUPPORTED</td><td>The specified reference space is not supported by the runtime or system.</td></tr>
                <tr><td>#ERROR_FILE_ACCESS_ERROR</td><td>The file could not be accessed.</td></tr>
                <tr><td>#ERROR_FILE_CONTENTS_INVALID</td><td>The file’s contents were invalid.</td></tr>
                <tr><td>#ERROR_FORM_FACTOR_UNSUPPORTED</td><td>The specified form factor is not supported by the current runtime or platform.</td></tr>
                <tr><td>#ERROR_FORM_FACTOR_UNAVAILABLE</td><td>The specified form factor is supported, but the device is currently not available, e.g. not plugged in or powered off.</td></tr>
                <tr><td>#ERROR_API_LAYER_NOT_PRESENT</td><td>A requested API layer is not present or could not be loaded.</td></tr>
                <tr><td>#ERROR_CALL_ORDER_INVALID</td><td>The call was made without having made a previously required call.</td></tr>
                <tr><td>#ERROR_GRAPHICS_DEVICE_INVALID</td><td>The given graphics device is not in a valid state. The graphics device could be lost or initialized without meeting graphics requirements.</td></tr>
                <tr><td>#ERROR_POSE_INVALID</td><td>The supplied pose was invalid with respect to the requirements.</td></tr>
                <tr><td>#ERROR_INDEX_OUT_OF_RANGE</td><td>The supplied index was outside the range of valid indices.</td></tr>
                <tr><td>#ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED</td><td>The specified view configuration type is not supported by the runtime or platform.</td></tr>
                <tr><td>#ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED</td><td>The specified environment blend mode is not supported by the runtime or platform.</td></tr>
                <tr><td>#ERROR_NAME_DUPLICATED</td><td>The name provided was a duplicate of an already-existing resource.</td></tr>
                <tr><td>#ERROR_NAME_INVALID</td><td>The name provided was invalid.</td></tr>
                <tr><td>#ERROR_ACTIONSET_NOT_ATTACHED</td><td>A referenced action set is not attached to the session.</td></tr>
                <tr><td>#ERROR_ACTIONSETS_ALREADY_ATTACHED</td><td>The session already has attached action sets.</td></tr>
                <tr><td>#ERROR_LOCALIZED_NAME_DUPLICATED</td><td>The localized name provided was a duplicate of an already-existing resource.</td></tr>
                <tr><td>#ERROR_LOCALIZED_NAME_INVALID</td><td>The localized name provided was invalid.</td></tr>
                <tr><td>#ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING</td><td>The {@code xrGetGraphicsRequirements}* call was not made before calling {@code xrCreateSession}.</td></tr>
                <tr><td>#ERROR_RUNTIME_UNAVAILABLE</td><td>The loader was unable to find or load a runtime.</td></tr>
                <tr><td>#ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT</td><td>Spatial anchor could not be created at that location. (Added by the {@link MSFTSpatialAnchor XR_MSFT_spatial_anchor} extension)</td></tr>
                <tr><td>#ERROR_SECONDARY_VIEW_CONFIGURATION_TYPE_NOT_ENABLED_MSFT</td><td>The secondary view configuration was not enabled when creating the session. (Added by the {@link MSFTSecondaryViewConfiguration XR_MSFT_secondary_view_configuration} extension)</td></tr>
                <tr><td>#ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT</td><td>The controller model key is invalid. (Added by the {@link MSFTControllerModel XR_MSFT_controller_model} extension)</td></tr>
                <tr><td>#ERROR_REPROJECTION_MODE_UNSUPPORTED_MSFT</td><td>The reprojection mode is not supported. (Added by the {@link MSFTCompositionLayerReprojection XR_MSFT_composition_layer_reprojection} extension)</td></tr>
                <tr><td>#ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT</td><td>Compute new scene not completed. (Added by the {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension)</td></tr>
                <tr><td>#ERROR_SCENE_COMPONENT_ID_INVALID_MSFT</td><td>Scene component id invalid. (Added by the {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension)</td></tr>
                <tr><td>#ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT</td><td>Scene component type mismatch. (Added by the {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension)</td></tr>
                <tr><td>#ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT</td><td>Scene mesh buffer id invalid. (Added by the {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension)</td></tr>
                <tr><td>#ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT</td><td>Scene compute feature incompatible. (Added by the {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension)</td></tr>
                <tr><td>#ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT</td><td>Scene compute consistency mismatch. (Added by the {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension)</td></tr>
                <tr><td>#ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB</td><td>The display refresh rate is not supported by the platform. (Added by the {@link FBDisplayRefreshRate XR_FB_display_refresh_rate} extension)</td></tr>
                <tr><td>#ERROR_COLOR_SPACE_UNSUPPORTED_FB</td><td>The color space is not supported by the runtime. (Added by the {@link FBColorSpace XR_FB_color_space} extension)</td></tr>
                <tr><td>#ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB</td><td>The object state is unexpected for the issued command. (Added by the {@link FBPassthrough XR_FB_passthrough} extension)</td></tr>
                <tr><td>#ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB</td><td>Trying to create an MR feature when one was already created and only one instance is allowed. (Added by the {@link FBPassthrough XR_FB_passthrough} extension)</td></tr>
                <tr><td>#ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB</td><td>Requested functionality requires a feature to be created first. (Added by the {@link FBPassthrough XR_FB_passthrough} extension)</td></tr>
                <tr><td>#ERROR_NOT_PERMITTED_PASSTHROUGH_FB</td><td>Requested functionality is not permitted - application is not allowed to perform the requested operation. (Added by the {@link FBPassthrough XR_FB_passthrough} extension)</td></tr>
                <tr><td>#ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB</td><td>There weren’t sufficient resources available to perform an operation. (Added by the {@link FBPassthrough XR_FB_passthrough} extension)</td></tr>
                <tr><td>#ERROR_UNKNOWN_PASSTHROUGH_FB</td><td>Unknown Passthrough error (no further details provided). (Added by the {@link FBPassthrough XR_FB_passthrough} extension)</td></tr>
                <tr><td>#ERROR_RENDER_MODEL_KEY_INVALID_FB</td><td>The model key is invalid. (Added by the {@link FBRenderModel XR_FB_render_model} extension)</td></tr>
                <tr><td>#ERROR_MARKER_NOT_TRACKED_VARJO</td><td>Marker tracking is disabled or the specified marker is not currently tracked. (Added by the {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension)</td></tr>
                <tr><td>#ERROR_MARKER_ID_INVALID_VARJO</td><td>The specified marker ID is not valid. (Added by the {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension)</td></tr>
                <tr><td>#ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT</td><td>A spatial anchor was not found associated with the spatial anchor name provided (Added by the {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension)</td></tr>
                <tr><td>#ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT</td><td>The spatial anchor name provided was not valid (Added by the {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension)</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        #ResultToString()
        """,

        "SUCCESS".."0",
        "TIMEOUT_EXPIRED".."1",
        "SESSION_LOSS_PENDING".."3",
        "EVENT_UNAVAILABLE".."4",
        "SPACE_BOUNDS_UNAVAILABLE".."7",
        "SESSION_NOT_FOCUSED".."8",
        "FRAME_DISCARDED".."9",
        "ERROR_VALIDATION_FAILURE".."-1",
        "ERROR_RUNTIME_FAILURE".."-2",
        "ERROR_OUT_OF_MEMORY".."-3",
        "ERROR_API_VERSION_UNSUPPORTED".."-4",
        "ERROR_INITIALIZATION_FAILED".."-6",
        "ERROR_FUNCTION_UNSUPPORTED".."-7",
        "ERROR_FEATURE_UNSUPPORTED".."-8",
        "ERROR_EXTENSION_NOT_PRESENT".."-9",
        "ERROR_LIMIT_REACHED".."-10",
        "ERROR_SIZE_INSUFFICIENT".."-11",
        "ERROR_HANDLE_INVALID".."-12",
        "ERROR_INSTANCE_LOST".."-13",
        "ERROR_SESSION_RUNNING".."-14",
        "ERROR_SESSION_NOT_RUNNING".."-16",
        "ERROR_SESSION_LOST".."-17",
        "ERROR_SYSTEM_INVALID".."-18",
        "ERROR_PATH_INVALID".."-19",
        "ERROR_PATH_COUNT_EXCEEDED".."-20",
        "ERROR_PATH_FORMAT_INVALID".."-21",
        "ERROR_PATH_UNSUPPORTED".."-22",
        "ERROR_LAYER_INVALID".."-23",
        "ERROR_LAYER_LIMIT_EXCEEDED".."-24",
        "ERROR_SWAPCHAIN_RECT_INVALID".."-25",
        "ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED".."-26",
        "ERROR_ACTION_TYPE_MISMATCH".."-27",
        "ERROR_SESSION_NOT_READY".."-28",
        "ERROR_SESSION_NOT_STOPPING".."-29",
        "ERROR_TIME_INVALID".."-30",
        "ERROR_REFERENCE_SPACE_UNSUPPORTED".."-31",
        "ERROR_FILE_ACCESS_ERROR".."-32",
        "ERROR_FILE_CONTENTS_INVALID".."-33",
        "ERROR_FORM_FACTOR_UNSUPPORTED".."-34",
        "ERROR_FORM_FACTOR_UNAVAILABLE".."-35",
        "ERROR_API_LAYER_NOT_PRESENT".."-36",
        "ERROR_CALL_ORDER_INVALID".."-37",
        "ERROR_GRAPHICS_DEVICE_INVALID".."-38",
        "ERROR_POSE_INVALID".."-39",
        "ERROR_INDEX_OUT_OF_RANGE".."-40",
        "ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED".."-41",
        "ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED".."-42",
        "ERROR_NAME_DUPLICATED".."-44",
        "ERROR_NAME_INVALID".."-45",
        "ERROR_ACTIONSET_NOT_ATTACHED".."-46",
        "ERROR_ACTIONSETS_ALREADY_ATTACHED".."-47",
        "ERROR_LOCALIZED_NAME_DUPLICATED".."-48",
        "ERROR_LOCALIZED_NAME_INVALID".."-49",
        "ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING".."-50",
        "ERROR_RUNTIME_UNAVAILABLE".."-51"
    )

    EnumConstant(
        """
        XrStructureType - Values for type members of structs

        <h5>Description</h5>
        Most structures containing {@code type} members have a value of {@code type} matching the type of the structure, as described more fully in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#valid-usage-for-structure-types">Valid Usage for Structure Types</a>.

        Note that all extension enums begin at the extension enum base of <code>1<sup>10</sup></code> (base 10). Each extension is assigned a block of 1000 enums, starting at the enum base and arranged by the extension’s index.

        <h5>See Also</h5>
        ##XrActionCreateInfo, ##XrActionSetCreateInfo, ##XrActionSpaceCreateInfo, ##XrActionStateBoolean, ##XrActionStateFloat, ##XrActionStateGetInfo, ##XrActionStatePose, ##XrActionStateVector2f, ##XrActionsSyncInfo, ##XrApiLayerProperties, ##XrBaseInStructure, ##XrBaseOutStructure, ##XrBindingModificationBaseHeaderKHR, ##XrBindingModificationsKHR, ##XrBoundSourcesForActionEnumerateInfo, ##XrCompositionLayerAlphaBlendFB, ##XrCompositionLayerBaseHeader, ##XrCompositionLayerColorScaleBiasKHR, ##XrCompositionLayerCubeKHR, ##XrCompositionLayerCylinderKHR, ##XrCompositionLayerDepthInfoKHR, ##XrCompositionLayerDepthTestVARJO, ##XrCompositionLayerEquirect2KHR, ##XrCompositionLayerEquirectKHR, ##XrCompositionLayerImageLayoutFB, ##XrCompositionLayerPassthroughFB, ##XrCompositionLayerProjection, ##XrCompositionLayerProjectionView, ##XrCompositionLayerQuad, ##XrCompositionLayerReprojectionInfoMSFT, ##XrCompositionLayerReprojectionPlaneOverrideMSFT, ##XrCompositionLayerSecureContentFB, ##XrCompositionLayerSpaceWarpInfoFB, ##XrControllerModelKeyStateMSFT, ##XrControllerModelNodePropertiesMSFT, ##XrControllerModelNodeStateMSFT, ##XrControllerModelPropertiesMSFT, ##XrControllerModelStateMSFT, ##XrDebugUtilsLabelEXT, ##XrDebugUtilsMessengerCallbackDataEXT, ##XrDebugUtilsMessengerCreateInfoEXT, ##XrDebugUtilsObjectNameInfoEXT, ##XrDigitalLensControlALMALENCE, ##XrEventDataBaseHeader, ##XrEventDataBuffer, ##XrEventDataDisplayRefreshRateChangedFB, ##XrEventDataEventsLost, ##XrEventDataInstanceLossPending, ##XrEventDataInteractionProfileChanged, ##XrEventDataMainSessionVisibilityChangedEXTX, ##XrEventDataMarkerTrackingUpdateVARJO, ##XrEventDataPassthroughStateChangedFB, ##XrEventDataPerfSettingsEXT, ##XrEventDataReferenceSpaceChangePending, ##XrEventDataSessionStateChanged, ##XrEventDataVisibilityMaskChangedKHR, ##XrEventDataViveTrackerConnectedHTCX, ##XrExtensionProperties, ##XrEyeGazeSampleTimeEXT, ##XrFacialExpressionsHTC, ##XrFacialTrackerCreateInfoHTC, ##XrFoveatedViewConfigurationViewVARJO, ##XrFoveationLevelProfileCreateInfoFB, ##XrFoveationProfileCreateInfoFB, ##XrFrameBeginInfo, ##XrFrameEndInfo, ##XrFrameState, ##XrFrameWaitInfo, ##XrGeometryInstanceCreateInfoFB, ##XrGeometryInstanceTransformFB, ##XrGraphicsBindingEGLMNDX, ##XrGraphicsBindingOpenGLWaylandKHR, ##XrGraphicsBindingOpenGLWin32KHR, ##XrGraphicsBindingOpenGLXcbKHR, ##XrGraphicsBindingOpenGLXlibKHR, ##XrGraphicsBindingVulkanKHR, ##XrGraphicsRequirementsOpenGLESKHR, ##XrGraphicsRequirementsOpenGLKHR, ##XrGraphicsRequirementsVulkanKHR, ##XrHandJointLocationsEXT, ##XrHandJointVelocitiesEXT, ##XrHandJointsLocateInfoEXT, ##XrHandJointsMotionRangeInfoEXT, ##XrHandMeshMSFT, ##XrHandMeshSpaceCreateInfoMSFT, ##XrHandMeshUpdateInfoMSFT, ##XrHandPoseTypeInfoMSFT, ##XrHandTrackerCreateInfoEXT, ##XrHandTrackingAimStateFB, ##XrHandTrackingCapsulesStateFB, ##XrHandTrackingMeshFB, ##XrHandTrackingScaleFB, ##XrHapticActionInfo, ##XrHapticBaseHeader, ##XrHapticVibration, ##XrHolographicWindowAttachmentMSFT, ##XrInputSourceLocalizedNameGetInfo, ##XrInstanceCreateInfo, ##XrInstanceProperties, ##XrInteractionProfileAnalogThresholdVALVE, ##XrInteractionProfileState, ##XrInteractionProfileSuggestedBinding, ##XrKeyboardSpaceCreateInfoFB, ##XrKeyboardTrackingQueryFB, ##XrLoaderInitInfoBaseHeaderKHR, ##XrMarkerSpaceCreateInfoVARJO, ##XrNewSceneComputeInfoMSFT, ##XrPassthroughColorMapMonoToMonoFB, ##XrPassthroughColorMapMonoToRgbaFB, ##XrPassthroughCreateInfoFB, ##XrPassthroughKeyboardHandsIntensityFB, ##XrPassthroughLayerCreateInfoFB, ##XrPassthroughStyleFB, ##XrReferenceSpaceCreateInfo, ##XrRenderModelBufferFB, ##XrRenderModelLoadInfoFB, ##XrRenderModelPathInfoFB, ##XrRenderModelPropertiesFB, ##XrSceneComponentLocationsMSFT, ##XrSceneComponentParentFilterInfoMSFT, ##XrSceneComponentsGetInfoMSFT, ##XrSceneComponentsLocateInfoMSFT, ##XrSceneComponentsMSFT, ##XrSceneCreateInfoMSFT, ##XrSceneDeserializeInfoMSFT, ##XrSceneMeshBuffersGetInfoMSFT, ##XrSceneMeshBuffersMSFT, ##XrSceneMeshIndicesUint16MSFT, ##XrSceneMeshIndicesUint32MSFT, ##XrSceneMeshVertexBufferMSFT, ##XrSceneMeshesMSFT, ##XrSceneObjectTypesFilterInfoMSFT, ##XrSceneObjectsMSFT, ##XrSceneObserverCreateInfoMSFT, ##XrScenePlaneAlignmentFilterInfoMSFT, ##XrScenePlanesMSFT, ##XrSecondaryViewConfigurationFrameEndInfoMSFT, ##XrSecondaryViewConfigurationFrameStateMSFT, ##XrSecondaryViewConfigurationLayerInfoMSFT, ##XrSecondaryViewConfigurationSessionBeginInfoMSFT, ##XrSecondaryViewConfigurationStateMSFT, ##XrSecondaryViewConfigurationSwapchainCreateInfoMSFT, ##XrSerializedSceneFragmentDataGetInfoMSFT, ##XrSessionActionSetsAttachInfo, ##XrSessionBeginInfo, ##XrSessionCreateInfo, ##XrSessionCreateInfoOverlayEXTX, ##XrSpaceLocation, ##XrSpaceVelocity, ##XrSpatialAnchorCreateInfoMSFT, ##XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT, ##XrSpatialAnchorPersistenceInfoMSFT, ##XrSpatialAnchorSpaceCreateInfoMSFT, ##XrSpatialGraphNodeSpaceCreateInfoMSFT, ##XrSwapchainCreateInfo, ##XrSwapchainCreateInfoFoveationFB, ##XrSwapchainImageAcquireInfo, ##XrSwapchainImageBaseHeader, ##XrSwapchainImageFoveationVulkanFB, ##XrSwapchainImageOpenGLESKHR, ##XrSwapchainImageOpenGLKHR, ##XrSwapchainImageReleaseInfo, ##XrSwapchainImageVulkanKHR, ##XrSwapchainImageWaitInfo, ##XrSwapchainStateBaseHeaderFB, ##XrSwapchainStateFoveationFB, ##XrSwapchainStateSamplerOpenGLESFB, ##XrSwapchainStateSamplerVulkanFB, ##XrSystemColorSpacePropertiesFB, ##XrSystemEyeGazeInteractionPropertiesEXT, ##XrSystemFacialTrackingPropertiesHTC, ##XrSystemFoveatedRenderingPropertiesVARJO, ##XrSystemGetInfo, ##XrSystemHandTrackingMeshPropertiesMSFT, ##XrSystemHandTrackingPropertiesEXT, ##XrSystemKeyboardTrackingPropertiesFB, ##XrSystemMarkerTrackingPropertiesVARJO, ##XrSystemPassthroughPropertiesFB, ##XrSystemProperties, ##XrSystemRenderModelPropertiesFB, ##XrSystemSpaceWarpPropertiesFB, ##XrTriangleMeshCreateInfoFB, ##XrView, ##XrViewConfigurationDepthRangeEXT, ##XrViewConfigurationProperties, ##XrViewConfigurationView, ##XrViewConfigurationViewFovEPIC, ##XrViewLocateFoveatedRenderingVARJO, ##XrViewLocateInfo, ##XrViewState, ##XrVisibilityMaskKHR, ##XrVisualMeshComputeLodInfoMSFT, ##XrViveTrackerPathsHTCX, ##XrVulkanDeviceCreateInfoKHR, ##XrVulkanGraphicsDeviceGetInfoKHR, ##XrVulkanInstanceCreateInfoKHR, ##XrVulkanSwapchainFormatListCreateInfoKHR, #StructureTypeToString()
        """,

        "TYPE_UNKNOWN".."0",
        "TYPE_API_LAYER_PROPERTIES".."1",
        "TYPE_EXTENSION_PROPERTIES".."2",
        "TYPE_INSTANCE_CREATE_INFO".."3",
        "TYPE_SYSTEM_GET_INFO".."4",
        "TYPE_SYSTEM_PROPERTIES".."5",
        "TYPE_VIEW_LOCATE_INFO".."6",
        "TYPE_VIEW".."7",
        "TYPE_SESSION_CREATE_INFO".."8",
        "TYPE_SWAPCHAIN_CREATE_INFO".."9",
        "TYPE_SESSION_BEGIN_INFO".."10",
        "TYPE_VIEW_STATE".."11",
        "TYPE_FRAME_END_INFO".."12",
        "TYPE_HAPTIC_VIBRATION".."13",
        "TYPE_EVENT_DATA_BUFFER".."16",
        "TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING".."17",
        "TYPE_EVENT_DATA_SESSION_STATE_CHANGED".."18",
        "TYPE_ACTION_STATE_BOOLEAN".."23",
        "TYPE_ACTION_STATE_FLOAT".."24",
        "TYPE_ACTION_STATE_VECTOR2F".."25",
        "TYPE_ACTION_STATE_POSE".."27",
        "TYPE_ACTION_SET_CREATE_INFO".."28",
        "TYPE_ACTION_CREATE_INFO".."29",
        "TYPE_INSTANCE_PROPERTIES".."32",
        "TYPE_FRAME_WAIT_INFO".."33",
        "TYPE_COMPOSITION_LAYER_PROJECTION".."35",
        "TYPE_COMPOSITION_LAYER_QUAD".."36",
        "TYPE_REFERENCE_SPACE_CREATE_INFO".."37",
        "TYPE_ACTION_SPACE_CREATE_INFO".."38",
        "TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING".."40",
        "TYPE_VIEW_CONFIGURATION_VIEW".."41",
        "TYPE_SPACE_LOCATION".."42",
        "TYPE_SPACE_VELOCITY".."43",
        "TYPE_FRAME_STATE".."44",
        "TYPE_VIEW_CONFIGURATION_PROPERTIES".."45",
        "TYPE_FRAME_BEGIN_INFO".."46",
        "TYPE_COMPOSITION_LAYER_PROJECTION_VIEW".."48",
        "TYPE_EVENT_DATA_EVENTS_LOST".."49",
        "TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING".."51",
        "TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED".."52",
        "TYPE_INTERACTION_PROFILE_STATE".."53",
        "TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO".."55",
        "TYPE_SWAPCHAIN_IMAGE_WAIT_INFO".."56",
        "TYPE_SWAPCHAIN_IMAGE_RELEASE_INFO".."57",
        "TYPE_ACTION_STATE_GET_INFO".."58",
        "TYPE_HAPTIC_ACTION_INFO".."59",
        "TYPE_SESSION_ACTION_SETS_ATTACH_INFO".."60",
        "TYPE_ACTIONS_SYNC_INFO".."61",
        "TYPE_BOUND_SOURCES_FOR_ACTION_ENUMERATE_INFO".."62",
        "TYPE_INPUT_SOURCE_LOCALIZED_NAME_GET_INFO".."63"
    )

    EnumConstant(
        """
        XrFormFactor - Supported form factors

        <h5>Description</h5>
        The predefined form factors which <b>may</b> be supported by OpenXR runtimes are:

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#FORM_FACTOR_HEAD_MOUNTED_DISPLAY. The tracked display is attached to the user’s head. The user cannot touch the display itself. A VR headset would be an example of this form factor.</li>
            <li>#FORM_FACTOR_HANDHELD_DISPLAY. The tracked display is held in the user’s hand, independent from the user’s head. The user <b>may</b> be able to touch the display, allowing for screen-space UI. A mobile phone running an AR experience using pass-through video would be an example of this form factor.</li>
        </ul>

        <h5>See Also</h5>
        #NULL_SYSTEM_ID, ##XrSystemGetInfo, #GetSystem()
        """,

        "FORM_FACTOR_HEAD_MOUNTED_DISPLAY".."1",
        "FORM_FACTOR_HANDHELD_DISPLAY".."2"
    )

    EnumConstant(
        """
        XrViewConfigurationType - Supported view configuration type

        <h5>Description</h5>
        The application selects its primary view configuration type when calling #BeginSession(), and that configuration remains constant for the lifetime of the session, until #EndSession() is called.

        The number of views and the semantic meaning of each view index within a given view configuration is well-defined, specified below for all core view configurations. The predefined primary view configuration types are:

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#VIEW_CONFIGURATION_TYPE_PRIMARY_MONO. One view representing the form factor’s one primary display. For example, an AR phone’s screen. This configuration requires one element in ##XrViewConfigurationProperties and one projection in each ##XrCompositionLayerProjection layer.</li>
            <li>#VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO. Two views representing the form factor’s two primary displays, which map to a left-eye and right-eye view. This configuration requires two views in ##XrViewConfigurationProperties and two views in each ##XrCompositionLayerProjection layer. View index 0 <b>must</b> represent the left eye and view index 1 <b>must</b> represent the right eye.</li>
        </ul>

        <h5>See Also</h5>
        ##XrEventDataVisibilityMaskChangedKHR, ##XrSecondaryViewConfigurationLayerInfoMSFT, ##XrSecondaryViewConfigurationSessionBeginInfoMSFT, ##XrSecondaryViewConfigurationStateMSFT, ##XrSecondaryViewConfigurationSwapchainCreateInfoMSFT, ##XrSessionBeginInfo, ##XrViewConfigurationProperties, ##XrViewLocateInfo, #EnumerateEnvironmentBlendModes(), #EnumerateReprojectionModesMSFT(), #EnumerateViewConfigurationViews(), #EnumerateViewConfigurations(), #GetViewConfigurationProperties(), #GetVisibilityMaskKHR()
        """,

        "VIEW_CONFIGURATION_TYPE_PRIMARY_MONO".."1",
        "VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO".."2"
    )

    EnumConstant(
        """
        XrEnvironmentBlendMode - Environment blend modes

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#ENVIRONMENT_BLEND_MODE_OPAQUE. The composition layers will be displayed with no view of the physical world behind them. The composited image will be interpreted as an RGB image, ignoring the composited alpha channel. This is the typical mode for VR experiences, although this mode can also be supported on devices that support video passthrough.</li>
            <li>#ENVIRONMENT_BLEND_MODE_ADDITIVE. The composition layers will be additively blended with the real world behind the display. The composited image will be interpreted as an RGB image, ignoring the composited alpha channel during the additive blending. This will cause black composited pixels to appear transparent. This is the typical mode for an AR experience on a see-through headset with an additive display, although this mode can also be supported on devices that support video passthrough.</li>
            <li>#ENVIRONMENT_BLEND_MODE_ALPHA_BLEND. The composition layers will be alpha-blended with the real world behind the display. The composited image will be interpreted as an RGBA image, with the composited alpha channel determining each pixel’s level of blending with the real world behind the display. This is the typical mode for an AR experience on a phone or headset that supports video passthrough.</li>
        </ul>

        <h5>See Also</h5>
        ##XrFrameEndInfo, ##XrSecondaryViewConfigurationLayerInfoMSFT, #EnumerateEnvironmentBlendModes()
        """,

        "ENVIRONMENT_BLEND_MODE_OPAQUE".."1",
        "ENVIRONMENT_BLEND_MODE_ADDITIVE".."2",
        "ENVIRONMENT_BLEND_MODE_ALPHA_BLEND".."3"
    )

    EnumConstant(
        "XrSpaceVelocityFlagBits",

        "SPACE_VELOCITY_LINEAR_VALID_BIT".enum(0x00000001),
        "SPACE_VELOCITY_ANGULAR_VALID_BIT".enum(0x00000002)
    )

    EnumConstant(
        """
        XrReferenceSpaceType - Reference space types

        <h5>Description</h5>
        Available reference space types are indicated by #EnumerateReferenceSpaces(). Note that other spaces can be created as well, such as pose action spaces created by #CreateActionSpace(), which are not enumerated by that API.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>
                #REFERENCE_SPACE_TYPE_VIEW. The {@code VIEW} space tracks the view origin used to generate view transforms for the primary viewer (or centroid of view origins if stereo), with +Y up, +X to the right, and -Z forward. This space points in the forward direction for the viewer without incorporating the user’s eye orientation, and is not gravity-aligned.
                {@code VIEW} space is primarily useful when projecting from the user’s perspective into another space to obtain a targeting ray, or when rendering small head-locked content such as a reticle. Content rendered in {@code VIEW} space will stay at a fixed point on head-mounted displays and may be uncomfortable to view if too large. To obtain the ideal view and projection transforms to use each frame for rendering world content, applications should call #LocateViews() instead of using this space.

                Runtimes <b>must</b> support this reference space.
            </li>
            <li>
                #REFERENCE_SPACE_TYPE_LOCAL. The {@code LOCAL} reference space establishes a world-locked origin, gravity-aligned to exclude pitch and roll, with +Y up, +X to the right, and -Z forward. This space locks in both its initial position and orientation, which the runtime <b>may</b> define to be either the initial position at application launch or some other calibrated zero position.
                {@code LOCAL} space is useful when an application needs to render <b>seated-scale</b> content that is not positioned relative to the physical floor.

                When a user needs to recenter {@code LOCAL} space, a runtime <b>may</b> offer some system-level recentering interaction that is transparent to the application, but which causes the current leveled head space to become the new {@code LOCAL} space. When such a recentering occurs, the runtime <b>must</b> queue the ##XrEventDataReferenceSpaceChangePending event, with the recentered {@code LOCAL} space origin only taking effect for #LocateSpace() or #LocateViews() calls whose {@code XrTime} parameter is greater than or equal to the {@code changeTime} provided in that event.

                When views, controllers or other spaces experience tracking loss relative to the {@code LOCAL} space, runtimes <b>should</b> continue to provide inferred or last-known {@code position} and {@code orientation} values. These inferred poses can, for example, be based on neck model updates, inertial dead reckoning, or a last-known position, so long as it is still reasonable for the application to use that pose. While a runtime is providing position data, it <b>must</b> continue to set #SPACE_LOCATION_POSITION_VALID_BIT and #VIEW_STATE_POSITION_VALID_BIT but it <b>can</b> clear #SPACE_LOCATION_POSITION_TRACKED_BIT and #VIEW_STATE_POSITION_TRACKED_BIT to indicate that the position is inferred or last-known in this way.

                When tracking is recovered, runtimes <b>should</b> snap the pose of other spaces back into position relative to the {@code LOCAL} space’s original origin.

                Runtimes <b>must</b> support this reference space.
            </li>
            <li>
                #REFERENCE_SPACE_TYPE_STAGE. The {@code STAGE} reference space is a runtime-defined flat, rectangular space that is empty and can be walked around on. The origin is on the floor at the center of the rectangle, with +Y up, and the X and Z axes aligned with the rectangle edges. The runtime <b>may</b> not be able to locate spaces relative to the {@code STAGE} reference space if the user has not yet defined one within the runtime-specific UI. Applications can use #GetReferenceSpaceBoundsRect() to determine the extents of the {@code STAGE} reference space’s XZ bounds rectangle, if defined.
                {@code STAGE} space is useful when an application needs to render <b>standing-scale</b> content (no bounds) or <b>room-scale</b> content (with bounds) that is relative to the physical floor.

                When the user redefines the origin or bounds of the current {@code STAGE} space, or the runtime otherwise switches to a new {@code STAGE} definition, the runtime <b>must</b> queue the ##XrEventDataReferenceSpaceChangePending event, with the new {@code STAGE} space origin only taking effect for #LocateSpace() or #LocateViews() calls whose {@code XrTime} parameter is greater than or equal to the {@code changeTime} provided in that event.

                When views, controllers or other spaces experience tracking loss relative to the {@code STAGE} space, runtimes <b>should</b> continue to provide inferred or last-known {@code position} and {@code orientation} values. These inferred poses can, for example, be based on neck model updates, inertial dead reckoning, or a last-known position, so long as it is still reasonable for the application to use that pose. While a runtime is providing position data, it <b>must</b> continue to set #SPACE_LOCATION_POSITION_VALID_BIT and #VIEW_STATE_POSITION_VALID_BIT but it <b>can</b> clear #SPACE_LOCATION_POSITION_TRACKED_BIT and #VIEW_STATE_POSITION_TRACKED_BIT to indicate that the position is inferred or last-known in this way.

                When tracking is recovered, runtimes <b>should</b> snap the pose of other spaces back into position relative to the {@code STAGE} space’s original origin.
            </li>
        </ul>

        <h5>See Also</h5>
        ##XrEventDataReferenceSpaceChangePending, ##XrReferenceSpaceCreateInfo, #EnumerateReferenceSpaces(), #GetReferenceSpaceBoundsRect()
        """,

        "REFERENCE_SPACE_TYPE_VIEW".."1",
        "REFERENCE_SPACE_TYPE_LOCAL".."2",
        "REFERENCE_SPACE_TYPE_STAGE".."3"
    )

    EnumConstant(
        "XrSpaceLocationFlagBits",

        "SPACE_LOCATION_ORIENTATION_VALID_BIT".enum(0x00000001),
        "SPACE_LOCATION_POSITION_VALID_BIT".enum(0x00000002),
        "SPACE_LOCATION_ORIENTATION_TRACKED_BIT".enum(0x00000004),
        "SPACE_LOCATION_POSITION_TRACKED_BIT".enum(0x00000008)
    )

    EnumConstant(
        "XrSwapchainCreateFlagBits",

        "SWAPCHAIN_CREATE_PROTECTED_CONTENT_BIT".enum(0x00000001),
        "SWAPCHAIN_CREATE_STATIC_IMAGE_BIT".enum(0x00000002)
    )

    EnumConstant(
        "XrSwapchainUsageFlagBits",

        "SWAPCHAIN_USAGE_COLOR_ATTACHMENT_BIT".enum(0x00000001),
        "SWAPCHAIN_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT".enum(0x00000002),
        "SWAPCHAIN_USAGE_UNORDERED_ACCESS_BIT".enum(0x00000004),
        "SWAPCHAIN_USAGE_TRANSFER_SRC_BIT".enum(0x00000008),
        "SWAPCHAIN_USAGE_TRANSFER_DST_BIT".enum(0x00000010),
        "SWAPCHAIN_USAGE_SAMPLED_BIT".enum(0x00000020),
        "SWAPCHAIN_USAGE_MUTABLE_FORMAT_BIT".enum(0x00000040)
    )

    EnumConstant(
        "XrCompositionLayerFlagBits",

        "COMPOSITION_LAYER_CORRECT_CHROMATIC_ABERRATION_BIT".enum(0x00000001),
        "COMPOSITION_LAYER_BLEND_TEXTURE_SOURCE_ALPHA_BIT".enum(0x00000002),
        "COMPOSITION_LAYER_UNPREMULTIPLIED_ALPHA_BIT".enum(0x00000004)
    )

    EnumConstant(
        "XrViewStateFlagBits",

        "VIEW_STATE_ORIENTATION_VALID_BIT".enum(0x00000001),
        "VIEW_STATE_POSITION_VALID_BIT".enum(0x00000002),
        "VIEW_STATE_ORIENTATION_TRACKED_BIT".enum(0x00000004),
        "VIEW_STATE_POSITION_TRACKED_BIT".enum(0x00000008)
    )

    EnumConstant(
        """
        XrActionType - XrAction type

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#ACTION_TYPE_BOOLEAN_INPUT. The action can be passed to #GetActionStateBoolean() to retrieve a boolean value.</li>
            <li>#ACTION_TYPE_FLOAT_INPUT. The action can be passed to #GetActionStateFloat() to retrieve a float value.</li>
            <li>#ACTION_TYPE_VECTOR2F_INPUT. The action can be passed to #GetActionStateVector2f() to retrieve a 2D float vector.</li>
            <li>#ACTION_TYPE_POSE_INPUT. The action can can be passed to #CreateActionSpace() to create a space.</li>
            <li>#ACTION_TYPE_VIBRATION_OUTPUT. The action can be passed to #ApplyHapticFeedback() to send a haptic event to the runtime.</li>
        </ul>

        <h5>See Also</h5>
        ##XrActionCreateInfo, #CreateActionSet()
        """,

        "ACTION_TYPE_BOOLEAN_INPUT".."1",
        "ACTION_TYPE_FLOAT_INPUT".."2",
        "ACTION_TYPE_VECTOR2F_INPUT".."3",
        "ACTION_TYPE_POSE_INPUT".."4",
        "ACTION_TYPE_VIBRATION_OUTPUT".."100"
    )

    EnumConstant(
        "XrInputSourceLocalizedNameFlagBits",

        "INPUT_SOURCE_LOCALIZED_NAME_USER_PATH_BIT".enum(0x00000001),
        "INPUT_SOURCE_LOCALIZED_NAME_INTERACTION_PROFILE_BIT".enum(0x00000002),
        "INPUT_SOURCE_LOCALIZED_NAME_COMPONENT_BIT".enum(0x00000004)
    )

    EnumConstant(
        """
        XrEyeVisibility - Eye visibility selector

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#EYE_VISIBILITY_BOTH displays the layer to both eyes.</li>
            <li>#EYE_VISIBILITY_LEFT displays the layer to the viewer’s physical left eye.</li>
            <li>#EYE_VISIBILITY_RIGHT displays the layer to the viewer’s physical right eye.</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerCubeKHR, ##XrCompositionLayerCylinderKHR, ##XrCompositionLayerEquirect2KHR, ##XrCompositionLayerEquirectKHR, ##XrCompositionLayerQuad
        """,

        "EYE_VISIBILITY_BOTH".."0",
        "EYE_VISIBILITY_LEFT".."1",
        "EYE_VISIBILITY_RIGHT".."2"
    )

    EnumConstant(
        """
        XrSessionState - Session lifecycle state

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#SESSION_STATE_UNKNOWN. An unknown state. The runtime <b>must</b> not return this value in an ##XrEventDataSessionStateChanged event.</li>
            <li>#SESSION_STATE_IDLE. The initial state after calling #CreateSession() or returned to after calling #EndSession().</li>
            <li>#SESSION_STATE_READY. The application is ready to call #BeginSession() and <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#sync_frame_loop">sync its frame loop with the runtime.</a></li>
            <li>#SESSION_STATE_SYNCHRONIZED. The application has synced its frame loop with the runtime but is not visible to the user.</li>
            <li>#SESSION_STATE_VISIBLE. The application has <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#sync_frame_loop">synced its frame loop with the runtime</a> and is visible to the user but cannot receive XR input.</li>
            <li>#SESSION_STATE_FOCUSED. The application has <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#sync_frame_loop">synced its frame loop with the runtime</a>, is visible to the user and can receive XR input.</li>
            <li>#SESSION_STATE_STOPPING. The application should exit its frame loop and call #EndSession().</li>
            <li>#SESSION_STATE_LOSS_PENDING. The session is in the process of being lost. The application should destroy the current session and can optionally recreate it.</li>
            <li>#SESSION_STATE_EXITING. The application should end its XR experience and not automatically restart it.</li>
        </ul>

        The #SESSION_STATE_UNKNOWN state <b>must</b> not be returned by the runtime, and is only defined to avoid 0 being a valid state.

        Receiving the #SESSION_STATE_IDLE state indicates that the runtime considers the session is idle. Applications in this state <b>should</b> minimize resource consumption but continue to call #PollEvent() at some reasonable cadence.

        Receiving the #SESSION_STATE_READY state indicates that the runtime desires the application to prepare rendering resources, begin its session and synchronize its frame loop with the runtime. The application does this by successfully calling #BeginSession() and then running its frame loop by calling #WaitFrame(), #BeginFrame() and #EndFrame() in a loop. If the runtime wishes to return the session to the #SESSION_STATE_IDLE state, it <b>must</b> wait until the application calls #BeginSession(). After returning from the #BeginSession() call, the runtime may then immediately transition forward through the #SESSION_STATE_SYNCHRONIZED state to the #SESSION_STATE_STOPPING state, to request that the application end this session. If the system supports a user engagement sensor and runtime is in #SESSION_STATE_IDLE state, the runtime <b>should</b> not transition to the #SESSION_STATE_READY state until the user starts engaging with the device.

        Receiving the #SESSION_STATE_SYNCHRONIZED state indicates that the application has <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#sync_frame_loop">synchronized its frame loop with the runtime</a>, but its frames are not visible to the user. The application <b>should</b> continue running its frame loop by calling #WaitFrame(), #BeginFrame() and #EndFrame(), although it should avoid heavy GPU work so that other visible applications can take CPU and GPU precedence. The application can save resources here by skipping rendering and not submitting any composition layers until #WaitFrame() returns an ##XrFrameState with {@code shouldRender} set to true. A runtime <b>may</b> use this frame synchronization to facilitate seamless switching from a previous XR application to this application on a frame boundary.

        Receiving the #SESSION_STATE_VISIBLE state indicates that the application has <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#sync_frame_loop">synchronized its frame loop with the runtime</a>, and the session’s frames will be visible to the user, but the session is not eligible to receive XR input. An application may be visible but not have focus, for example when the runtime is composing a modal pop-up on top of the application’s rendered frames. The application <b>should</b> continue running its frame loop, rendering and submitting its composition layers, although it may wish to pause its experience, as users cannot interact with the application at this time. It is important for applications to continue rendering when visible, even when they do not have focus, so the user continues to see something reasonable underneath modal pop-ups. Runtimes <b>should</b> make input actions inactive while the application is unfocused, and applications should react to an inactive input action by skipping rendering of that action’s input avatar (depictions of hands or other tracked objects controlled by the user).

        Receiving the #SESSION_STATE_FOCUSED state indicates that the application has <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#sync_frame_loop">synchronized its frame loop with the runtime</a>, the session’s frames will be visible to the user, and the session is eligible to receive XR input. The runtime <b>should</b> only give one session XR input focus at any given time. The application <b>should</b> be running its frame loop, rendering and submitting composition layers, including input avatars (depictions of hands or other tracked objects controlled by the user) for any input actions that are active. The runtime <b>should</b> avoid rendering its own input avatars when an application is focused, unless input from a given source is being captured by the runtime at the moment.

        Receiving the #SESSION_STATE_STOPPING state indicates that the runtime has determined that the application should halt its rendering loop. Applications <b>should</b> exit their rendering loop and call #EndSession() when in this state. A possible reason for this would be to minimize contention between multiple applications. If the system supports a user engagement sensor and the session is running, the runtime <b>should</b> transition to the #SESSION_STATE_STOPPING state when the user stops engaging with the device.

        Receiving the #SESSION_STATE_EXITING state indicates the runtime wishes the application to terminate its XR experience, typically due to a user request via a runtime user interface. Applications <b>should</b> gracefully end their process when in this state if they do not have a non-XR user experience.

        Receiving the #SESSION_STATE_LOSS_PENDING state indicates the runtime is no longer able to operate with the current session, for example due to the loss of a display hardware connection. An application <b>should</b> call #DestroySession() and <b>may</b> end its process or decide to poll #GetSystem() at some reasonable cadence to get a new {@code XrSystemId}, and re-initialize all graphics resources related to the new system, and then create a new session using #CreateSession(). After the event is queued, subsequent calls to functions that accept {@code XrSession} parameters <b>must</b> no longer return any success code other than #SESSION_LOSS_PENDING for the given {@code XrSession} handle. The #SESSION_LOSS_PENDING success result is returned for an unspecified grace period of time, and the functions that return it simulate success in their behavior. If the runtime has no reasonable way to successfully complete a given function (e.g. #CreateSwapchain()) when a lost session is pending, or if the runtime is not able to provide the application a grace period, the runtime <b>may</b> return #ERROR_SESSION_LOST. Thereafter, functions which accept {@code XrSession} parameters for the lost session <b>may</b> return #ERROR_SESSION_LOST to indicate that the function failed and the given session was lost. The {@code XrSession} handle and child handles are henceforth unusable and <b>should</b> be destroyed by the application in order to immediately free up resources associated with those handles.

        <h5>See Also</h5>
        ##XrEventDataSessionStateChanged, #PollEvent()
        """,

        "SESSION_STATE_UNKNOWN".."0",
        "SESSION_STATE_IDLE".."1",
        "SESSION_STATE_READY".."2",
        "SESSION_STATE_SYNCHRONIZED".."3",
        "SESSION_STATE_VISIBLE".."4",
        "SESSION_STATE_FOCUSED".."5",
        "SESSION_STATE_STOPPING".."6",
        "SESSION_STATE_LOSS_PENDING".."7",
        "SESSION_STATE_EXITING".."8"
    )

    EnumConstant(
        """
        XrObjectType - Specify an enumeration to track object handle types

        <h5>Description</h5>
        The {@code XrObjectType} enumeration defines values, each of which corresponds to a specific OpenXR handle type. These values <b>can</b> be used to associate debug information with a particular type of object through one or more extensions.

        The following table defines {@code XrObjectType} and OpenXR Handle relationships:

        <table class="lwjgl">
            <thead><tr><th>{@code XrObjectType}</th><th>OpenXR Handle Type</th></tr></thead>
            <tbody>
                <tr><td>#OBJECT_TYPE_UNKNOWN</td><td>Unknown/Undefined Handle</td></tr>
                <tr><td>#OBJECT_TYPE_INSTANCE</td><td>{@code XrInstance}</td></tr>
                <tr><td>#OBJECT_TYPE_SESSION</td><td>{@code XrSession}</td></tr>
                <tr><td>#OBJECT_TYPE_SWAPCHAIN</td><td>{@code XrSwapchain}</td></tr>
                <tr><td>#OBJECT_TYPE_SPACE</td><td>{@code XrSpace}</td></tr>
                <tr><td>#OBJECT_TYPE_ACTION_SET</td><td>{@code XrActionSet}</td></tr>
                <tr><td>#OBJECT_TYPE_ACTION</td><td>{@code XrAction}</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrDebugUtilsObjectNameInfoEXT
        """,

        "OBJECT_TYPE_UNKNOWN".."0",
        "OBJECT_TYPE_INSTANCE".."1",
        "OBJECT_TYPE_SESSION".."2",
        "OBJECT_TYPE_SWAPCHAIN".."3",
        "OBJECT_TYPE_SPACE".."4",
        "OBJECT_TYPE_ACTION_SET".."5",
        "OBJECT_TYPE_ACTION".."6"
    )

    // Instance

    GlobalCommand..XrResult(
        "GetInstanceProcAddr",
        """
        Gets a function pointer for an OpenXR function.

        <h5>C Specification</h5>
        Function pointers for all OpenXR functions <b>can</b> be obtained with the function #GetInstanceProcAddr().

        <pre><code>
￿XrResult xrGetInstanceProcAddr(
￿    XrInstance                                  instance,
￿    const char*                                 name,
￿    PFN_xrVoidFunction*                         function);</code></pre>

        <h5>Description</h5>
        #GetInstanceProcAddr() itself is obtained in a platform- and loader- specific manner. Typically, the loader library will export this function as a function symbol, so applications <b>can</b> link against the loader library, or load it dynamically and look up the symbol using platform-specific APIs. Loaders <b>must</b> export function symbols for all core OpenXR functions. Because of this, applications that use only the core OpenXR functions have no need to use #GetInstanceProcAddr().

        Because an application <b>can</b> call #GetInstanceProcAddr() before creating an instance, #GetInstanceProcAddr() returns a valid function pointer when the {@code instance} parameter is #NULL_HANDLE and the {@code name} parameter is one of the following strings:

        <h5>No Instance Required</h5>
        <ul>
            <li>#EnumerateInstanceExtensionProperties()</li>
            <li>#EnumerateApiLayerProperties()</li>
            <li>#CreateInstance()</li>
        </ul>

        #GetInstanceProcAddr() <b>must</b> return #ERROR_HANDLE_INVALID if {@code name} is not one of the above strings and {@code instance} is #NULL_HANDLE. #GetInstanceProcAddr() <b>may</b> return #ERROR_HANDLE_INVALID if {@code name} is not one of the above strings and {@code instance} is invalid but not #NULL_HANDLE.

        #GetInstanceProcAddr() <b>must</b> return #ERROR_FUNCTION_UNSUPPORTED if {@code instance} is a valid instance and the string specified in {@code name} is not the name of an OpenXR core or enabled extension function.

        If {@code name} is the name of an extension function, then the result returned by #GetInstanceProcAddr() will depend upon how the {@code instance} was created. If {@code instance} was created with the related extension’s name appearing in the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} array, then #GetInstanceProcAddr() returns a valid function pointer. If the related extension’s name did not appear in the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} array during the creation of {@code instance}, then #GetInstanceProcAddr() returns #ERROR_FUNCTION_UNSUPPORTED. Because of this, function pointers returned by #GetInstanceProcAddr() using one {@code XrInstance} may not be valid when used with objects related to a different {@code XrInstance}.

        The returned function pointer is of type {@code PFN_xrVoidFunction}, and must be cast to the type of the function being queried.

        The table below defines the various use cases for #GetInstanceProcAddr() and return value (“{@code fp}” is “{@code function pointer}”) for each case.

        <h6>xrGetInstanceProcAddr behavior</h6>
        <table class="lwjgl">
            <thead><tr><th>{@code instance} parameter</th><th>{@code name} parameter</th><th>return value</th></tr></thead>
            <tbody>
                <tr><td>*</td><td>{@code NULL}</td><td>undefined</td></tr>
                <tr><td>invalid instance</td><td>*</td><td>undefined</td></tr>
                <tr><td>{@code NULL}</td><td>#EnumerateInstanceExtensionProperties()</td><td>fp</td></tr>
                <tr><td>{@code NULL}</td><td>#EnumerateApiLayerProperties()</td><td>fp</td></tr>
                <tr><td>{@code NULL}</td><td>#CreateInstance()</td><td>fp</td></tr>
                <tr><td>{@code NULL}</td><td>* (any {@code name} not covered above)</td><td>{@code NULL}</td></tr>
                <tr><td>instance</td><td>core OpenXR function</td><td>fp<sup>1</sup></td></tr>
                <tr><td>instance</td><td>enabled extension function for {@code instance}</td><td>fp<sup>1</sup></td></tr>
                <tr><td>instance</td><td>* (any {@code name} not covered above)</td><td>{@code NULL}</td></tr>
            </tbody>
        </table>

        <dl>
            <dt>1</dt>
            <dd>The returned function pointer <b>must</b> only be called with a handle (the first parameter) that is {@code instance} or a child of {@code instance}.</dd>
        </dl>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>If {@code instance} is not #NULL_HANDLE, {@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code name} <b>must</b> be a null-terminated UTF-8 string</li>
            <li>{@code function} <b>must</b> be a pointer to a {@code PFN_xrVoidFunction} value</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        XrInstance("instance", "the instance that the function pointer will be compatible with, or {@code NULL} for functions not dependent on any instance."),
        charUTF8.const.p("name", "the name of the function to obtain."),
        Check(1)..PFN_xrVoidFunction.p("function", "the address of the function pointer to get.")
    )

    GlobalCommand..XrResult(
        "EnumerateApiLayerProperties",
        """
        Returns up to requested number of global layer properties.

        <h5>C Specification</h5>
        To determine what set of API layers are available, OpenXR provides the #EnumerateApiLayerProperties() function:

        <pre><code>
￿XrResult xrEnumerateApiLayerProperties(
￿    uint32_t                                    propertyCapacityInput,
￿    uint32_t*                                   propertyCountOutput,
￿    XrApiLayerProperties*                       properties);</code></pre>

        <h5>Description</h5>
        The list of available layers may change at any time due to actions outside of the OpenXR runtime, so two calls to #EnumerateApiLayerProperties() with the same parameters <b>may</b> return different results, or retrieve different {@code propertyCountOutput} values or {@code properties} contents.

        Once an instance has been created, the layers enabled for that instance will continue to be enabled and valid for the lifetime of that instance, even if some of them become unavailable for future instances.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code propertyCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code propertyCapacityInput} is not 0, {@code properties} <b>must</b> be a pointer to an array of {@code propertyCapacityInput} ##XrApiLayerProperties structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrApiLayerProperties
        """,

        AutoSize("properties")..uint32_t("propertyCapacityInput", "the capacity of the properties array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("propertyCountOutput", "a pointer to the count of properties written, or a pointer to the required capacity in the case that propertyCapacityInput is 0."),
        nullable..XrApiLayerProperties.p("properties", "a pointer to an array of ##XrApiLayerProperties structures, but <b>can</b> be {@code NULL} if propertyCapacityInput is 0.")
    )

    GlobalCommand..XrResult(
        "EnumerateInstanceExtensionProperties",
        """
        Returns properties of available instance extensions.

        <h5>C Specification</h5>
        The application can determine the available instance extensions by calling #EnumerateInstanceExtensionProperties():

        <pre><code>
￿XrResult xrEnumerateInstanceExtensionProperties(
￿    const char*                                 layerName,
￿    uint32_t                                    propertyCapacityInput,
￿    uint32_t*                                   propertyCountOutput,
￿    XrExtensionProperties*                      properties);</code></pre>

        <h5>Description</h5>
        If {@code properties} is {@code NULL}, then the number of extensions properties available is returned in {@code propertyCountOutput}. Otherwise, {@code propertyCountInput} must point to a variable set by the user to the number of elements in the {@code properties} array. If {@code propertyCountInput} is less than the number of extension properties available, the contents of {@code properties} will be undefined. If {@code propertyCountInput} is smaller than the number of extensions available, the runtime <b>must</b> return the failure code #ERROR_SIZE_INSUFFICIENT and the contents of {@code properties} are undefined.

        Because the list of available layers may change externally between calls to #EnumerateInstanceExtensionProperties(), two calls <b>may</b> retrieve different results if a {@code layerName} is available in one call but not in another. The extensions supported by a layer may also change between two calls, e.g. if the layer implementation is replaced by a different version between those calls.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>If {@code layerName} is not {@code NULL}, {@code layerName} <b>must</b> be a null-terminated UTF-8 string</li>
            <li>{@code propertyCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code propertyCapacityInput} is not 0, {@code properties} <b>must</b> be a pointer to an array of {@code propertyCapacityInput} ##XrExtensionProperties structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_RUNTIME_UNAVAILABLE</li>
                <li>#ERROR_API_LAYER_NOT_PRESENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrExtensionProperties
        """,

        nullable..charUTF8.const.p("layerName", "either {@code NULL} or a pointer to a string naming the API layer to retrieve extensions from, as returned by #EnumerateApiLayerProperties()."),
        AutoSize("properties")..uint32_t("propertyCapacityInput", "the capacity of the properties array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("propertyCountOutput", "a pointer to the count of properties written, or a pointer to the required capacity in the case that {@code propertyCapacityInput} is 0."),
        nullable..XrExtensionProperties.p("properties", "a pointer to an array of ##XrExtensionProperties structures, but <b>can</b> be {@code NULL} if {@code propertyCapacityInput} is 0.")
    )

    GlobalCommand..XrResult(
        "CreateInstance",
        """
        Creates an OpenXR Instance.

        <h5>C Specification</h5>
        The #CreateInstance() function is defined as:

        <pre><code>
￿XrResult xrCreateInstance(
￿    const XrInstanceCreateInfo*                 createInfo,
￿    XrInstance*                                 instance);</code></pre>

        <h5>Description</h5>
        #CreateInstance() creates the {@code XrInstance}, then enables and initializes global API layers and extensions requested by the application. If an extension is provided by an API layer, both the API layer and extension <b>must</b> be specified at #CreateInstance() time. If a specified API layer cannot be found, no {@code XrInstance} will be created and the function will return #ERROR_API_LAYER_NOT_PRESENT. Likewise, if a specified extension cannot be found, the call <b>must</b> return #ERROR_EXTENSION_NOT_PRESENT and no {@code XrInstance} will be created. Additionally, some runtimes <b>may</b> limit the number of concurrent instances that may be in use. If the application attempts to create more instances than a runtime can simultaneously support, #CreateInstance() <b>may</b> return #ERROR_LIMIT_REACHED.

        If the ##XrApplicationInfo{@code ::applicationName} is the empty string the runtime <b>must</b> return #ERROR_NAME_INVALID.

        If the ##XrInstanceCreateInfo structure contains a platform-specific extension for a platform other than the target platform, #ERROR_INITIALIZATION_FAILED <b>may</b> be returned. If a mandatory platform-specific extension is defined for the target platform but no matching extension struct is provided in ##XrInstanceCreateInfo the runtime <b>must</b> return #ERROR_INITIALIZATION_FAILED.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrInstanceCreateInfo structure</li>
            <li>{@code instance} <b>must</b> be a pointer to an {@code XrInstance} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_RUNTIME_UNAVAILABLE</li>
                <li>#ERROR_NAME_INVALID</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_EXTENSION_NOT_PRESENT</li>
                <li>#ERROR_API_VERSION_UNSUPPORTED</li>
                <li>#ERROR_API_LAYER_NOT_PRESENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrInstanceCreateInfo
        """,

        XrInstanceCreateInfo.const.p("createInfo", "points to an instance of ##XrInstanceCreateInfo controlling creation of the instance."),
        Check(1)..XrInstance.p("instance", "points to an {@code XrInstance} handle in which the resulting instance is returned.")
    )

    XrResult(
        "DestroyInstance",
        """
        Destroy an instance of OpenXR.

        <h5>C Specification</h5>
        The #DestroyInstance() function is defined as:

        <pre><code>
￿XrResult xrDestroyInstance(
￿    XrInstance                                  instance);</code></pre>

        <h5>Parameter Descriptions</h5>
        <ul>
            <li>{@code instance} is the handle to the instance to destroy.</li>
        </ul>

        {@code XrInstance} handles are destroyed using #DestroyInstance(). When an {@code XrInstance} is destroyed, all handles that are children of that {@code XrInstance} are also destroyed.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code instance}, and any child handles, <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_HANDLE_INVALID</li>
            </ul></dd>
        </dl>
        """,

        XrInstance("instance", "")
    )

    XrResult(
        "GetInstanceProperties",
        """
        Gets information about the instance.

        <h5>C Specification</h5>
        The #GetInstanceProperties() function provides information about the instance and the associated runtime.

        <pre><code>
￿XrResult xrGetInstanceProperties(
￿    XrInstance                                  instance,
￿    XrInstanceProperties*                       instanceProperties);</code></pre>

        <h5>Description</h5>
        The {@code instanceProperties} parameter <b>must</b> be filled out by the runtime in response to this call, with information as defined in ##XrInstanceProperties.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code instanceProperties} <b>must</b> be a pointer to an ##XrInstanceProperties structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrInstanceProperties
        """,

        XrInstance("instance", "a handle to an {@code XrInstance} previously created with #CreateInstance()."),
        XrInstanceProperties.p("instanceProperties", "points to an ##XrInstanceProperties which describes the {@code instance}.")
    )

    XrResult(
        "PollEvent",
        """
        Polls for events.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrPollEvent(
￿    XrInstance                                  instance,
￿    XrEventDataBuffer*                          eventData);</code></pre>

        <h5>Parameter Descriptions</h5>
        <ul>
            <li>{@code instance} is a valid {@code XrInstance}.</li>
            <li>{@code eventData} is a pointer to a valid ##XrEventDataBuffer.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code eventData} <b>must</b> be a pointer to an ##XrEventDataBuffer structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#EVENT_UNAVAILABLE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
            </ul></dd>
        </dl>

        The runtime <b>must</b> discard queued events which contain destroyed or otherwise invalid handles.

        <h6>Event Descriptions</h6>
        <table class="lwjgl">
            <thead><tr><th>Event</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>##XrEventDataEventsLost</td><td>event queue has overflowed and some events were lost</td></tr>
                <tr><td>##XrEventDataInstanceLossPending</td><td>application is about to lose the instance</td></tr>
                <tr><td>##XrEventDataInteractionProfileChanged</td><td>active input form factor for one or more top level user paths has changed</td></tr>
                <tr><td>##XrEventDataReferenceSpaceChangePending</td><td>runtime will begin operating with updated space bounds</td></tr>
                <tr><td>##XrEventDataSessionStateChanged</td><td>application has changed lifecycle state</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrEventDataBuffer
        """,

        XrInstance("instance", ""),
        XrEventDataBuffer.p("eventData", "")
    )

    XrResult(
        "ResultToString",
        """
        Converts an XrResult to a UTF-8 string.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrResultToString(
￿    XrInstance                                  instance,
￿    XrResult                                    value,
￿    char                                        buffer[XR_MAX_RESULT_STRING_SIZE]);</code></pre>

        <h5>Description</h5>
        Returns the text version of the provided {@code XrResult} value as a UTF-8 string.

        In all cases the returned string <b>must</b> be one of:

        <h5>Result String Return Values</h5>
        <ul>
            <li>The literal string defined for the provide numeric value in the core spec or extension. (e.g. the value 0 results in the string {@code XR_SUCCESS})</li>
            <li>{@code XR_UNKNOWN_SUCCESS_} concatenated with the positive result number expressed as a decimal number.</li>
            <li>{@code XR_UNKNOWN_FAILURE_} concatenated with the negative result number expressed as a decimal number.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code value} <b>must</b> be a valid {@code XrResult} value</li>
            <li>{@code buffer} <b>must</b> be a character array of length #MAX_RESULT_STRING_SIZE</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #StructureTypeToString()
        """,

        XrInstance("instance", "the handle of the instance to ask for the string."),
        XrResult("value", "the {@code XrResult} value to turn into a string."),
        Check("XR_MAX_RESULT_STRING_SIZE")..charUTF8.p("buffer", "the buffer that will be used to return the string in.")
    )

    XrResult(
        "StructureTypeToString",
        """
        Converts an XrStructureType to a UTF-8 string.

        <h5>C Specification</h5>
        The #StructureTypeToString() function is defined as:

        <pre><code>
￿XrResult xrStructureTypeToString(
￿    XrInstance                                  instance,
￿    XrStructureType                             value,
￿    char                                        buffer[XR_MAX_STRUCTURE_NAME_SIZE]);</code></pre>

        <h5>Description</h5>
        Returns the text version of the provided {@code XrStructureType} value as a UTF-8 string.

        In all cases the returned string <b>must</b> be one of:

        <h5>Structure Type String Return Values</h5>
        <ul>
            <li>The literal string defined for the provide numeric value in the core spec or extension. (e.g. the value of #TYPE_INSTANCE_CREATE_INFO results in the string #TYPE_INSTANCE_CREATE_INFO)</li>
            <li>{@code XR_UNKNOWN_STRUCTURE_TYPE_} concatenated with the structure type number expressed as a decimal number.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code value} <b>must</b> be a valid {@code XrStructureType} value</li>
            <li>{@code buffer} <b>must</b> be a character array of length #MAX_STRUCTURE_NAME_SIZE</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #ResultToString()
        """,

        XrInstance("instance", "the handle of the instance to ask for the string."),
        XrStructureType("value", "the {@code XrStructureType} value to turn into a string."),
        Check("XR_MAX_STRUCTURE_NAME_SIZE")..charUTF8.p("buffer", "the buffer that will be used to return the string in.")
    )

    // Device

    XrResult(
        "GetSystem",
        """
        Gets a system identifier.

        <h5>C Specification</h5>
        The #GetSystem() function is defined as:

        <pre><code>
￿XrResult xrGetSystem(
￿    XrInstance                                  instance,
￿    const XrSystemGetInfo*                      getInfo,
￿    XrSystemId*                                 systemId);</code></pre>

        <h5>Description</h5>
        To get an {@code XrSystemId}, an application specifies its desired <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#form_factor_description">form factor</a> to #GetSystem() and gets the runtime’s {@code XrSystemId} associated with that configuration.

        If the form factor is supported but temporarily unavailable, #GetSystem() <b>must</b> return #ERROR_FORM_FACTOR_UNAVAILABLE. A runtime <b>may</b> return #SUCCESS on a subsequent call for a form factor it previously returned #ERROR_FORM_FACTOR_UNAVAILABLE. For example, connecting or warming up hardware might cause an unavailable form factor to become available.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code getInfo} <b>must</b> be a pointer to a valid ##XrSystemGetInfo structure</li>
            <li>{@code systemId} <b>must</b> be a pointer to an {@code XrSystemId} value</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_FORM_FACTOR_UNSUPPORTED</li>
                <li>#ERROR_FORM_FACTOR_UNAVAILABLE</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #NULL_SYSTEM_ID, ##XrSystemGetInfo
        """,

        XrInstance("instance", "the handle of the instance from which to get the information."),
        XrSystemGetInfo.const.p("getInfo", "a pointer to an ##XrSystemGetInfo structure containing the application’s requests for a system."),
        Check(1)..XrSystemId.p("systemId", "the returned {@code XrSystemId}.")
    )

    XrResult(
        "GetSystemProperties",
        """
        Gets the properties of a particular system.

        <h5>C Specification</h5>
        The #GetSystemProperties() function is defined as:

        <pre><code>
￿XrResult xrGetSystemProperties(
￿    XrInstance                                  instance,
￿    XrSystemId                                  systemId,
￿    XrSystemProperties*                         properties);</code></pre>

        <h5>Description</h5>
        An application <b>can</b> call #GetSystemProperties() to retrieve information about the system such as vendor ID, system name, and graphics and tracking properties.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code properties} <b>must</b> be a pointer to an ##XrSystemProperties structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_SYSTEM_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSystemProperties
        """,

        XrInstance("instance", "the instance from which {@code systemId} was retrieved."),
        XrSystemId("systemId", "the {@code XrSystemId} whose properties will be queried."),
        XrSystemProperties.p("properties", "points to an instance of the ##XrSystemProperties structure, that will be filled with returned information.")
    )

    XrResult(
        "EnumerateEnvironmentBlendModes",
        """
        Lists environment blend modes.

        <h5>C Specification</h5>
        The #EnumerateEnvironmentBlendModes() function is defined as:

        <pre><code>
￿XrResult xrEnumerateEnvironmentBlendModes(
￿    XrInstance                                  instance,
￿    XrSystemId                                  systemId,
￿    XrViewConfigurationType                     viewConfigurationType,
￿    uint32_t                                    environmentBlendModeCapacityInput,
￿    uint32_t*                                   environmentBlendModeCountOutput,
￿    XrEnvironmentBlendMode*                     environmentBlendModes);</code></pre>

        <h5>Description</h5>
        Enumerates the set of environment blend modes that this runtime supports for a given view configuration of the system. Environment blend modes <b>should</b> be in order from highest to lowest runtime preference.

        Runtimes <b>must</b> always return identical buffer contents from this enumeration for the given {@code systemId} and {@code viewConfigurationType} for the lifetime of the instance.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
            <li>{@code environmentBlendModeCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code environmentBlendModeCapacityInput} is not 0, {@code environmentBlendModes} <b>must</b> be a pointer to an array of {@code environmentBlendModeCapacityInput} {@code XrEnvironmentBlendMode} values</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED</li>
                <li>#ERROR_SYSTEM_INVALID</li>
            </ul></dd>
        </dl>
        """,

        XrInstance("instance", "the instance from which {@code systemId} was retrieved."),
        XrSystemId("systemId", "the {@code XrSystemId} whose environment blend modes will be enumerated."),
        XrViewConfigurationType("viewConfigurationType", "the {@code XrViewConfigurationType} to enumerate."),
        AutoSize("environmentBlendModes")..uint32_t("environmentBlendModeCapacityInput", "the capacity of the {@code environmentBlendModes} array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("environmentBlendModeCountOutput", "a pointer to the count of {@code environmentBlendModes} written, or a pointer to the required capacity in the case that {@code environmentBlendModeCapacityInput} is 0."),
        nullable..XrEnvironmentBlendMode.p("environmentBlendModes", "a pointer to an array of {@code XrEnvironmentBlendMode} values, but <b>can</b> be {@code NULL} if {@code environmentBlendModeCapacityInput} is 0.")
    )

    XrResult(
        "CreateSession",
        """
        Creates an XrSession.

        <h5>C Specification</h5>
        The #CreateSession() function is defined as:

        <pre><code>
￿XrResult xrCreateSession(
￿    XrInstance                                  instance,
￿    const XrSessionCreateInfo*                  createInfo,
￿    XrSession*                                  session);</code></pre>

        <h5>Description</h5>
        Creates a session using the provided {@code createInfo} and returns a handle to that session. This session is created in the #SESSION_STATE_IDLE state, and a corresponding ##XrEventDataSessionStateChanged event to the #SESSION_STATE_IDLE state <b>must</b> be generated as the first such event for the new session.

        The runtime <b>must</b> return #ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING (#ERROR_VALIDATION_FAILURE may be returned due to legacy behavior) on calls to #CreateSession() if a function named like {@code xrGet*GraphicsRequirements} has not been called for the same {@code instance} and ##XrSessionCreateInfo{@code ::systemId}. (See graphics binding extensions for details.)

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrSessionCreateInfo structure</li>
            <li>{@code session} <b>must</b> be a pointer to an {@code XrSession} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_SYSTEM_INVALID</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING</li>
                <li>#ERROR_GRAPHICS_DEVICE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrExtensionProperties, ##XrSessionCreateInfo, #BeginSession(), #DestroySession(), #EndSession()
        """,

        XrInstance("instance", "the instance from which {@code systemId} was retrieved."),
        XrSessionCreateInfo.const.p("createInfo", "a pointer to an ##XrSessionCreateInfo structure containing information about how to create the session."),
        Check(1)..XrSession.p("session", "a pointer to a handle in which the created {@code XrSession} is returned.")
    )

    XrResult(
        "DestroySession",
        """
        Destroys an XrSession.

        <h5>C Specification</h5>
        The #DestroySession() function is defined as.

        <pre><code>
￿XrResult xrDestroySession(
￿    XrSession                                   session);</code></pre>

        <h5>Description</h5>
        {@code XrSession} handles are destroyed using #DestroySession(). When an {@code XrSession} is destroyed, all handles that are children of that {@code XrSession} are also destroyed.

        The application is responsible for ensuring that it has no calls using {@code session} in progress when the session is destroyed.

        #DestroySession() can be called when the session is in any session state.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code session}, and any child handles, <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_HANDLE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #BeginSession(), #CreateSession(), #EndSession()
        """,

        XrSession("session", "the session to destroy.")
    )

    // Space

    XrResult(
        "EnumerateReferenceSpaces",
        """
        Enumerate available reference spaces.

        <h5>C Specification</h5>
        The #EnumerateReferenceSpaces() function is defined as:

        <pre><code>
￿XrResult xrEnumerateReferenceSpaces(
￿    XrSession                                   session,
￿    uint32_t                                    spaceCapacityInput,
￿    uint32_t*                                   spaceCountOutput,
￿    XrReferenceSpaceType*                       spaces);</code></pre>

        <h5>Description</h5>
        Enumerates the set of reference space types that this runtime supports for a given session. Runtimes <b>must</b> always return identical buffer contents from this enumeration for the lifetime of the session.

        If a session enumerates support for a given reference space type, calls to #CreateReferenceSpace() <b>must</b> succeed for that session, with any transient unavailability of poses expressed later during calls to #LocateSpace().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code spaceCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code spaceCapacityInput} is not 0, {@code spaces} <b>must</b> be a pointer to an array of {@code spaceCapacityInput} {@code XrReferenceSpaceType} values</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
            </ul></dd>
        </dl>
        """,

        XrSession("session", "a handle to an {@code XrSession} previously created with #CreateSession()."),
        AutoSize("spaces")..uint32_t("spaceCapacityInput", "the capacity of the spaces array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("spaceCountOutput", "a pointer to the count of spaces written, or a pointer to the required capacity in the case that {@code spaceCapacityInput} is 0."),
        nullable..XrReferenceSpaceType.p("spaces", "a pointer to an application-allocated array that will be filled with the enumerant of each supported reference space. It <b>can</b> be {@code NULL} if {@code spaceCapacityInput} is 0.")
    )

    XrResult(
        "CreateReferenceSpace",
        """
        Creates a reference space.

        <h5>C Specification</h5>
        The #CreateReferenceSpace() function is defined as:

        <pre><code>
￿XrResult xrCreateReferenceSpace(
￿    XrSession                                   session,
￿    const XrReferenceSpaceCreateInfo*           createInfo,
￿    XrSpace*                                    space);</code></pre>

        <h5>Description</h5>
        Creates an {@code XrSpace} handle based on a chosen reference space. Application <b>can</b> provide an ##XrPosef to define the position and orientation of the new space’s origin within the natural reference frame of the reference space.

        Multiple {@code XrSpace} handles may exist simultaneously, up to some limit imposed by the runtime. The {@code XrSpace} handle <b>must</b> be eventually freed via the #DestroySpace() function.

        The runtime <b>must</b> return #ERROR_REFERENCE_SPACE_UNSUPPORTED if the given reference space type is not supported by this {@code session}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrReferenceSpaceCreateInfo structure</li>
            <li>{@code space} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_REFERENCE_SPACE_UNSUPPORTED</li>
                <li>#ERROR_POSE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrReferenceSpaceCreateInfo, #DestroySpace()
        """,

        XrSession("session", "a handle to an {@code XrSession} previously created with #CreateSession()."),
        XrReferenceSpaceCreateInfo.const.p("createInfo", "the ##XrReferenceSpaceCreateInfo used to specify the space."),
        Check(1)..XrSpace.p("space", "the returned space handle.")
    )

    XrResult(
        "GetReferenceSpaceBoundsRect",
        """
        Gets the bounds rectangle of a reference space.

        <h5>C Specification</h5>
        XR systems may have limited real world spatial ranges in which users can freely move around while remaining tracked. Applications may wish to query these boundaries and alter application behavior or content placement to ensure the user can complete the experience while remaining within the boundary. Applications <b>can</b> query this information using #GetReferenceSpaceBoundsRect().

        When called, #GetReferenceSpaceBoundsRect() <b>should</b> return the extents of a rectangle that is clear of obstacles down to the floor, allowing where the user can freely move while remaining tracked, if available for that reference space. The returned extent represents the dimensions of an axis-aligned bounding box where the ##XrExtent2Df{@code ::width} and ##XrExtent2Df{@code ::height} fields correspond to the X and Z axes of the provided space, with the extents centered at the origin of the space. Not all systems or spaces may support boundaries. If a runtime is unable to provide bounds for a given space, #SPACE_BOUNDS_UNAVAILABLE will be returned and all fields of {@code bounds} will be set to 0.

        The returned extents are expressed relative to the natural origin of the provided {@code XrReferenceSpaceType} and <b>must</b> not incorporate any origin offsets specified by the application during calls to #CreateReferenceSpace().

        The runtime <b>must</b> return #ERROR_REFERENCE_SPACE_UNSUPPORTED if the {@code XrReferenceSpaceType} passed in {@code createInfo} is not supported by this {@code session}.

        When a runtime will begin operating with updated space bounds, the runtime <b>must</b> queue a corresponding ##XrEventDataReferenceSpaceChangePending event.

        <pre><code>
￿XrResult xrGetReferenceSpaceBoundsRect(
￿    XrSession                                   session,
￿    XrReferenceSpaceType                        referenceSpaceType,
￿    XrExtent2Df*                                bounds);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code referenceSpaceType} <b>must</b> be a valid {@code XrReferenceSpaceType} value</li>
            <li>{@code bounds} <b>must</b> be a pointer to an ##XrExtent2Df structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
                <li>#SPACE_BOUNDS_UNAVAILABLE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_REFERENCE_SPACE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrExtent2Df, #CreateReferenceSpace()
        """,

        XrSession("session", "a handle to an {@code XrSession} previously created with #CreateSession()."),
        XrReferenceSpaceType("referenceSpaceType", "the reference space type whose bounds should be retrieved."),
        XrExtent2Df.p("bounds", "the returned space extents.")
    )

    XrResult(
        "CreateActionSpace",
        """
        Creates a space based on a pose action.

        <h5>C Specification</h5>
        The #CreateActionSpace() function is defined as:

        <pre><code>
￿XrResult xrCreateActionSpace(
￿    XrSession                                   session,
￿    const XrActionSpaceCreateInfo*              createInfo,
￿    XrSpace*                                    space);</code></pre>

        <h5>Description</h5>
        Creates an {@code XrSpace} handle based on a chosen pose action. Application <b>can</b> provide an ##XrPosef to define the position and orientation of the new space’s origin within the natural reference frame of the action space.

        Multiple {@code XrSpace} handles may exist simultaneously, up to some limit imposed by the runtime. The {@code XrSpace} handle must be eventually freed via the #DestroySpace() function or by destroying the parent {@code XrAction} handle.

        The runtime <b>must</b> return #ERROR_ACTION_TYPE_MISMATCH if the action provided in {@code action} is not of type #ACTION_TYPE_POSE_INPUT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrActionSpaceCreateInfo structure</li>
            <li>{@code space} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_POSE_INVALID</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_ACTION_TYPE_MISMATCH</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrActionSpaceCreateInfo, #DestroySpace()
        """,

        XrSession("session", "the {@code XrSession} to create the action space in."),
        XrActionSpaceCreateInfo.const.p("createInfo", "the ##XrActionSpaceCreateInfo used to specify the space."),
        Check(1)..XrSpace.p("space", "the returned space handle.")
    )

    XrResult(
        "LocateSpace",
        """
        Locates a space with reference to another space.

        <h5>C Specification</h5>
        #LocateSpace() provides the physical location of a space in a base space at a specified time, if currently known by the runtime.

        <pre><code>
￿XrResult xrLocateSpace(
￿    XrSpace                                     space,
￿    XrSpace                                     baseSpace,
￿    XrTime                                      time,
￿    XrSpaceLocation*                            location);</code></pre>

        <h5>Description</h5>
        For a {@code time} in the past, the runtime <b>should</b> locate the spaces based on the runtime’s most accurate current understanding of how the world was at that historical time.

        For a {@code time} in the future, the runtime <b>should</b> locate the spaces based on the runtime’s most up-to-date prediction of how the world will be at that future time.

        The minimum valid range of values for {@code time} are described in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#prediction-time-limits">prediction-time-limits</a>. For values of {@code time} outside this range, #LocateSpace() <b>may</b> return a location with no position and #SPACE_LOCATION_POSITION_VALID_BIT unset.

        Some devices improve their understanding of the world as the device is used. The location returned by #LocateSpace() for a given {@code space}, {@code baseSpace} and {@code time} <b>may</b> change over time, even for spaces that track static objects, as one or both spaces adjust their origins.

        During tracking loss of {@code space} relative to {@code baseSpace}, runtimes <b>should</b> continue to provide inferred or last-known {@code position} and {@code orientation} values. These inferred poses can, for example, be based on neck model updates, inertial dead reckoning, or a last-known position, so long as it is still reasonable for the application to use that pose. While a runtime is providing position data, it <b>must</b> continue to set #SPACE_LOCATION_POSITION_VALID_BIT but it <b>can</b> clear #SPACE_LOCATION_POSITION_TRACKED_BIT to indicate that the position is inferred or last-known in this way.

        If the runtime has not yet observed even a last-known pose for how to locate {@code space} in {@code baseSpace} (e.g. one space is an action space bound to a motion controller that has not yet been detected, or the two spaces are in disconnected fragments of the runtime’s tracked volume), the runtime <b>should</b> return a location with no position and #SPACE_LOCATION_POSITION_VALID_BIT unset.

        The runtime <b>must</b> return a location with both #SPACE_LOCATION_POSITION_VALID_BIT and #SPACE_LOCATION_POSITION_TRACKED_BIT set when locating {@code space} and {@code baseSpace} if both spaces were created relative to the same entity (e.g. two action spaces for the same action), even if the entity is currently untracked. The location in this case is the difference in the two spaces' application-specified transforms relative to that common entity.

        The runtime <b>should</b> return a location with #SPACE_LOCATION_POSITION_VALID_BIT set and #SPACE_LOCATION_POSITION_TRACKED_BIT unset for spaces tracking two static entities in the world when their relative pose is known to the runtime. This enables applications to make use of the runtime’s latest knowledge of the world, even during tracking loss.

        If an ##XrSpaceVelocity structure is chained to the {@code next} pointer of ##XrSpaceLocation and the velocity is observed or can be calculated by the runtime, the runtime <b>must</b> fill in the linear velocity of the origin of space within the reference frame of {@code baseSpace} and set the #SPACE_VELOCITY_LINEAR_VALID_BIT. Similarly, if an ##XrSpaceVelocity structure is chained to the {@code next} pointer of ##XrSpaceLocation and the angular velocity is observed or can be calculated by the runtime, the runtime <b>must</b> fill in the angular velocity of the origin of space within the reference frame of {@code baseSpace} and set the #SPACE_VELOCITY_ANGULAR_VALID_BIT.

        The following example code shows how an application can get both the location and velocity of a space within a base space using the #LocateSpace() function by chaining an ##XrSpaceVelocity to the next pointer of ##XrSpaceLocation and calling #LocateSpace().

        <pre><code>
￿XrSpace space;      // previously initialized
￿XrSpace baseSpace;  // previously initialized
￿XrTime time;        // previously initialized
￿
￿XrSpaceVelocity velocity {XR_TYPE_SPACE_VELOCITY};
￿XrSpaceLocation location {XR_TYPE_SPACE_LOCATION, &amp;velocity};
￿xrLocateSpace(space, baseSpace, time, &amp;location);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code location} <b>must</b> be a pointer to an ##XrSpaceLocation structure</li>
            <li>Both of {@code baseSpace} and {@code space} <b>must</b> have been created, allocated, or retrieved from the same {@code XrSession}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_TIME_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpaceLocation
        """,

        XrSpace("space", "identifies the target space to locate."),
        XrSpace("baseSpace", "identifies the underlying space in which to locate {@code space}."),
        XrTime("time", "the time for which the location should be provided."),
        XrSpaceLocation.p("location", "provides the location of {@code space} in {@code baseSpace}.")
    )

    XrResult(
        "DestroySpace",
        """
        Creates a space based on a pose action.

        <h5>C Specification</h5>
        The #DestroySpace() function is defined as:

        <pre><code>
￿XrResult xrDestroySpace(
￿    XrSpace                                     space);</code></pre>

        <h5>Description</h5>
        {@code XrSpace} handles are destroyed using #DestroySpace(). The runtime <b>may</b> still use this space if there are active dependencies (e.g, compositions in progress).

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code space}, and any child handles, <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_HANDLE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #CreateActionSpace(), #CreateReferenceSpace()
        """,

        XrSpace("space", "a handle to an {@code XrSpace} previously created by a function such as #CreateReferenceSpace().")
    )

    // ViewConfigurations

    XrResult(
        "EnumerateViewConfigurations",
        """
        Enumerates supported view configurations.

        <h5>C Specification</h5>
        The #EnumerateViewConfigurations() function is defined as:

        <pre><code>
￿XrResult xrEnumerateViewConfigurations(
￿    XrInstance                                  instance,
￿    XrSystemId                                  systemId,
￿    uint32_t                                    viewConfigurationsTypeCapacityInput,
￿    uint32_t*                                   viewConfigurationsTypeCountOutput,
￿    XrViewConfigurationType*                    viewConfigurationsTypes);</code></pre>

        <h5>Description</h5>
        #EnumerateViewConfigurations() enumerates the view configuration types supported by the {@code XrSystemId}. The supported set for that system <b>must</b> not change during the lifetime of its {@code XrInstance}. The returned list of primary view configurations <b>should</b> be in order from what the runtime considered highest to lowest user preference. Thus the first enumerated view configuration type <b>should</b> be the one the runtime prefers the application to use if possible.

        Runtimes <b>must</b> always return identical buffer contents from this enumeration for the given {@code systemId} and for the lifetime of the instance.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code viewConfigurationsTypeCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code viewConfigurationsTypeCapacityInput} is not 0, {@code viewConfigurationsTypes} <b>must</b> be a pointer to an array of {@code viewConfigurationsTypeCapacityInput} {@code XrViewConfigurationType} values</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_SYSTEM_INVALID</li>
            </ul></dd>
        </dl>
        """,

        XrInstance("instance", "the instance from which {@code systemId} was retrieved."),
        XrSystemId("systemId", "the {@code XrSystemId} whose view configurations will be enumerated."),
        AutoSize("viewConfigurationsTypes")..uint32_t("viewConfigurationsTypeCapacityInput", "the capacity of the {@code viewConfigurations} array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("viewConfigurationsTypeCountOutput", "a pointer to the count of {@code viewConfigurations} written, or a pointer to the required capacity in the case that {@code viewConfigurationsTypeCapacityInput} is 0."),
        nullable..XrViewConfigurationType.p("viewConfigurationsTypes", "a pointer to an array of {@code XrViewConfigurationType} values, but <b>can</b> be {@code NULL} if {@code viewConfigurationsTypeCapacityInput} is 0.")
    )

    XrResult(
        "GetViewConfigurationProperties",
        """
        Gets information for a view configuration.

        <h5>C Specification</h5>
        The #GetViewConfigurationProperties() function is defined as:

        <pre><code>
￿XrResult xrGetViewConfigurationProperties(
￿    XrInstance                                  instance,
￿    XrSystemId                                  systemId,
￿    XrViewConfigurationType                     viewConfigurationType,
￿    XrViewConfigurationProperties*              configurationProperties);</code></pre>

        <h5>Description</h5>
        #GetViewConfigurationProperties() queries properties of an individual view configuration. Applications <b>must</b> use one of the supported view configuration types returned by #EnumerateViewConfigurations(). If {@code viewConfigurationType} is not supported by this {@code XrInstance} the runtime <b>must</b> return #ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
            <li>{@code configurationProperties} <b>must</b> be a pointer to an ##XrViewConfigurationProperties structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED</li>
                <li>#ERROR_SYSTEM_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrViewConfigurationProperties
        """,

        XrInstance("instance", "the instance from which {@code systemId} was retrieved."),
        XrSystemId("systemId", "the {@code XrSystemId} whose view configuration is being queried."),
        XrViewConfigurationType("viewConfigurationType", "the {@code XrViewConfigurationType} of the configuration to get."),
        XrViewConfigurationProperties.p("configurationProperties", "a pointer to view configuration properties to return.")
    )

    XrResult(
        "EnumerateViewConfigurationViews",
        """
        Gets view configuration views.

        <h5>C Specification</h5>
        The #EnumerateViewConfigurationViews() function is defined as:

        <pre><code>
￿XrResult xrEnumerateViewConfigurationViews(
￿    XrInstance                                  instance,
￿    XrSystemId                                  systemId,
￿    XrViewConfigurationType                     viewConfigurationType,
￿    uint32_t                                    viewCapacityInput,
￿    uint32_t*                                   viewCountOutput,
￿    XrViewConfigurationView*                    views);</code></pre>

        <h5>Description</h5>
        Each {@code XrViewConfigurationType} defines the number of views associated with it. Applications can query more details of each view element using #EnumerateViewConfigurationViews(). If the supplied {@code viewConfigurationType} is not supported by this {@code XrInstance} and {@code XrSystemId}, the runtime <b>must</b> return #ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED.

        Runtimes <b>must</b> always return identical buffer contents from this enumeration for the given {@code systemId} and {@code viewConfigurationType} for the lifetime of the instance.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
            <li>{@code viewCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code viewCapacityInput} is not 0, {@code views} <b>must</b> be a pointer to an array of {@code viewCapacityInput} ##XrViewConfigurationView structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED</li>
                <li>#ERROR_SYSTEM_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrViewConfigurationView, #GetViewConfigurationProperties()
        """,

        XrInstance("instance", "the instance from which {@code systemId} was retrieved."),
        XrSystemId("systemId", "the {@code XrSystemId} whose view configuration is being queried."),
        XrViewConfigurationType("viewConfigurationType", "the {@code XrViewConfigurationType} of the configuration to get."),
        AutoSize("views")..uint32_t("viewCapacityInput", "the capacity of the {@code views} array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("viewCountOutput", "a pointer to the count of {@code views} written, or a pointer to the required capacity in the case that {@code viewCapacityInput} is 0."),
        nullable..XrViewConfigurationView.p("views", "a pointer to an array of ##XrViewConfigurationView values, but <b>can</b> be {@code NULL} if {@code viewCapacityInput} is 0.")
    )

    // Image

    XrResult(
        "EnumerateSwapchainFormats",
        """
        Enumerates swapchain formats.

        <h5>C Specification</h5>
        The #EnumerateSwapchainFormats() function is defined as:

        <pre><code>
￿XrResult xrEnumerateSwapchainFormats(
￿    XrSession                                   session,
￿    uint32_t                                    formatCapacityInput,
￿    uint32_t*                                   formatCountOutput,
￿    int64_t*                                    formats);</code></pre>

        <h5>Description</h5>
        #EnumerateSwapchainFormats() enumerates the texture formats supported by the current session. The type of formats returned are dependent on the graphics API specified in #CreateSession(). For example, if a DirectX graphics API was specified, then the enumerated formats correspond to the DXGI formats, such as {@code DXGI_FORMAT_R8G8B8A8_UNORM_SRGB}. Texture formats <b>should</b> be in order from highest to lowest runtime preference. The application <b>should</b> use the highest preference format that it supports for optimal performance and quality.

        Runtimes <b>must</b> always return identical buffer contents from this enumeration for the lifetime of the session.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code formatCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code formatCapacityInput} is not 0, {@code formats} <b>must</b> be a pointer to an array of {@code formatCapacityInput} {@code int64_t} values</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #CreateSwapchain()
        """,

        XrSession("session", "the session that enumerates the supported formats."),
        AutoSize("formats")..uint32_t("formatCapacityInput", "the capacity of the {@code formats}, or 0 to retrieve the required capacity."),
        Check(1)..uint32_t.p("formatCountOutput", "a pointer to the count of {@code uint64_t} formats written, or a pointer to the required capacity in the case that {@code formatCapacityInput} is 0."),
        nullable..int64_t.p("formats", "a pointer to an array of {@code int64_t} format ids, but <b>can</b> be {@code NULL} if {@code formatCapacityInput} is 0. The format ids are specific to the specified graphics API.")
    )

    XrResult(
        "CreateSwapchain",
        """
        Creates an XrSwapchain.

        <h5>C Specification</h5>
        The #CreateSwapchain() function is defined as:

        <pre><code>
￿XrResult xrCreateSwapchain(
￿    XrSession                                   session,
￿    const XrSwapchainCreateInfo*                createInfo,
￿    XrSwapchain*                                swapchain);</code></pre>

        <h5>Description</h5>
        Creates an {@code XrSwapchain} handle. The returned swapchain handle <b>may</b> be subsequently used in API calls. Multiple {@code XrSwapchain} handles may exist simultaneously, up to some limit imposed by the runtime. The {@code XrSwapchain} handle <b>must</b> be eventually freed via the #DestroySwapchain() function. The runtime <b>must</b> return #ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED if the image format specified in the ##XrSwapchainCreateInfo is unsupported. The runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED if any bit of the create flags specified in the ##XrSwapchainCreateInfo is unsupported.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrSwapchainCreateInfo structure</li>
            <li>{@code swapchain} <b>must</b> be a pointer to an {@code XrSwapchain} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSwapchainCreateInfo, #AcquireSwapchainImage(), #DestroySwapchain(), #EnumerateSwapchainFormats(), #EnumerateSwapchainImages(), #ReleaseSwapchainImage()
        """,

        XrSession("session", "the session that creates the image."),
        XrSwapchainCreateInfo.const.p("createInfo", "a pointer to an ##XrSwapchainCreateInfo structure containing parameters to be used to create the image."),
        Check(1)..XrSwapchain.p("swapchain", "a pointer to a handle in which the created {@code XrSwapchain} is returned.")
    )

    XrResult(
        "DestroySwapchain",
        """
        Destroys an XrSwapchain.

        <h5>C Specification</h5>
        The #DestroySwapchain() function is defined as:

        <pre><code>
￿XrResult xrDestroySwapchain(
￿    XrSwapchain                                 swapchain);</code></pre>

        <h5>Description</h5>
        All submitted graphics API commands that refer to {@code swapchain} <b>must</b> have completed execution. Runtimes <b>may</b> continue to utilize swapchain images after #DestroySwapchain() is called.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code swapchain}, and any child handles, <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_HANDLE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #CreateSwapchain()
        """,

        XrSwapchain("swapchain", "the swapchain to destroy.")
    )

    XrResult(
        "EnumerateSwapchainImages",
        """
        Gets images from an XrSwapchain.

        <h5>C Specification</h5>
        The #EnumerateSwapchainImages() function is defined as:

        <pre><code>
￿XrResult xrEnumerateSwapchainImages(
￿    XrSwapchain                                 swapchain,
￿    uint32_t                                    imageCapacityInput,
￿    uint32_t*                                   imageCountOutput,
￿    XrSwapchainImageBaseHeader*                 images);</code></pre>

        <h5>Description</h5>
        Fills an array of graphics API-specific {@code XrSwapchainImage} structures. The resources <b>must</b> be constant and valid for the lifetime of the {@code XrSwapchain}.

        Runtimes <b>must</b> always return identical buffer contents from this enumeration for the lifetime of the swapchain.

        Note: {@code images} is a pointer to an array of structures of graphics API-specific type, not an array of structure pointers.

        The pointer submitted as {@code images} will be treated as an array of the expected graphics API-specific type based on the graphics API used at session creation time. If the {@code type} member of any array element accessed in this way does not match the expected value, the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Under a typical memory model, a runtime must treat the supplied pointer as an opaque blob beginning with ##XrSwapchainImageBaseHeader, until after it has verified the {@code type}.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
            <li>{@code imageCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code imageCapacityInput} is not 0, {@code images} <b>must</b> be a pointer to an array of {@code imageCapacityInput} ##XrSwapchainImageBaseHeader-based structures. See also: ##XrSwapchainImageOpenGLESKHR, ##XrSwapchainImageOpenGLKHR, ##XrSwapchainImageVulkanKHR</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSwapchainImageBaseHeader, #CreateSwapchain()
        """,

        XrSwapchain("swapchain", "the {@code XrSwapchain} to get images from."),
        AutoSize("images")..uint32_t("imageCapacityInput", "the capacity of the {@code images} array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("imageCountOutput", "a pointer to the count of {@code images} written, or a pointer to the required capacity in the case that {@code imageCapacityInput} is 0."),
        nullable..XrSwapchainImageBaseHeader.p("images", "a pointer to an array of graphics API-specific {@code XrSwapchainImage} structures, all of the same type, based on ##XrSwapchainImageBaseHeader. It <b>can</b> be {@code NULL} if {@code imageCapacityInput} is 0.")
    )

    XrResult(
        "AcquireSwapchainImage",
        """
        Acquire a swapchain image.

        <h5>C Specification</h5>
        The #AcquireSwapchainImage() function is defined as:

        <pre><code>
￿XrResult xrAcquireSwapchainImage(
￿    XrSwapchain                                 swapchain,
￿    const XrSwapchainImageAcquireInfo*          acquireInfo,
￿    uint32_t*                                   index);</code></pre>

        <h5>Description</h5>
        Acquires the image corresponding to the {@code index} position in the array returned by #EnumerateSwapchainImages(). The runtime <b>must</b> return #ERROR_CALL_ORDER_INVALID if the next available index has already been acquired and not yet released with #ReleaseSwapchainImage(). If the {@code swapchain} was created with the #SWAPCHAIN_CREATE_STATIC_IMAGE_BIT set in ##XrSwapchainCreateInfo{@code ::createFlags}, this function <b>must</b> not have been previously called for this swapchain. The runtime <b>must</b> return #ERROR_CALL_ORDER_INVALID if a {@code swapchain} created with the #SWAPCHAIN_CREATE_STATIC_IMAGE_BIT set in ##XrSwapchainCreateInfo{@code ::createFlags} and this function has been successfully called previously for this swapchain.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
            <li>If {@code acquireInfo} is not {@code NULL}, {@code acquireInfo} <b>must</b> be a pointer to a valid ##XrSwapchainImageAcquireInfo structure</li>
            <li>{@code index} <b>must</b> be a pointer to a {@code uint32_t} value</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSwapchainImageAcquireInfo, #CreateSwapchain(), #DestroySwapchain(), #EnumerateSwapchainImages(), #ReleaseSwapchainImage(), #WaitSwapchainImage()
        """,

        XrSwapchain("swapchain", "the swapchain from which to acquire an image."),
        nullable..XrSwapchainImageAcquireInfo.const.p("acquireInfo", "exists for extensibility purposes, it is {@code NULL} or a pointer to a valid ##XrSwapchainImageAcquireInfo."),
        Check(1)..uint32_t.p("index", "the returned image index that has been acquired.")
    )

    XrResult(
        "WaitSwapchainImage",
        """
        Wait for a swapchain image to be available.

        <h5>C Specification</h5>
        The #WaitSwapchainImage() function is defined as:

        <pre><code>
￿XrResult xrWaitSwapchainImage(
￿    XrSwapchain                                 swapchain,
￿    const XrSwapchainImageWaitInfo*             waitInfo);</code></pre>

        <h5>Description</h5>
        Before an application can begin writing to a swapchain image, it must first wait on the image to avoid writing to it before the compositor has finished reading from it. #WaitSwapchainImage() will implicitly wait on the oldest acquired swapchain image which has not yet been successfully waited on. Once a swapchain image has been successfully waited on without timeout, the app <b>must</b> release before waiting on the next acquired swapchain image.

        This function may block for longer than the timeout specified in ##XrSwapchainImageWaitInfo due to scheduling or contention.

        If the timeout expires without the image becoming available for writing, #TIMEOUT_EXPIRED <b>must</b> be returned. If #WaitSwapchainImage() returns #TIMEOUT_EXPIRED, the next call to #WaitSwapchainImage() will wait on the same image index again until the function succeeds with #SUCCESS. Note that this is not an error code; {@code XR_SUCCEEDED(#TIMEOUT_EXPIRED)} is {@code true}.

        The runtime <b>must</b> eventually relinquish ownership of a swapchain image to the application and <b>must</b> not block indefinitely.

        The runtime <b>must</b> return #ERROR_CALL_ORDER_INVALID if no image has been acquired by calling #AcquireSwapchainImage().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
            <li>{@code waitInfo} <b>must</b> be a pointer to a valid ##XrSwapchainImageWaitInfo structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
                <li>#TIMEOUT_EXPIRED</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSwapchainImageWaitInfo, #AcquireSwapchainImage(), #CreateSwapchain(), #DestroySwapchain(), #EnumerateSwapchainImages(), #ReleaseSwapchainImage()
        """,

        XrSwapchain("swapchain", "the swapchain from which to wait for an image."),
        XrSwapchainImageWaitInfo.const.p("waitInfo", "a pointer to an ##XrSwapchainImageWaitInfo structure.")
    )

    XrResult(
        "ReleaseSwapchainImage",
        """
        Release a swapchain image.

        <h5>C Specification</h5>
        The #ReleaseSwapchainImage() function is defined as:

        <pre><code>
￿XrResult xrReleaseSwapchainImage(
￿    XrSwapchain                                 swapchain,
￿    const XrSwapchainImageReleaseInfo*          releaseInfo);</code></pre>

        <h5>Description</h5>
        If the {@code swapchain} was created with the #SWAPCHAIN_CREATE_STATIC_IMAGE_BIT set in ##XrSwapchainCreateInfo{@code ::createFlags} structure, this function <b>must</b> not have been previously called for this swapchain.

        The runtime <b>must</b> return #ERROR_CALL_ORDER_INVALID if no image has been waited on by calling #WaitSwapchainImage().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
            <li>If {@code releaseInfo} is not {@code NULL}, {@code releaseInfo} <b>must</b> be a pointer to a valid ##XrSwapchainImageReleaseInfo structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSwapchainImageReleaseInfo, #AcquireSwapchainImage(), #CreateSwapchain(), #DestroySwapchain(), #EnumerateSwapchainImages(), #WaitSwapchainImage()
        """,

        XrSwapchain("swapchain", "the {@code XrSwapchain} from which to release an image."),
        nullable..XrSwapchainImageReleaseInfo.const.p("releaseInfo", "exists for extensibility purposes, it is {@code NULL} or a pointer to a valid ##XrSwapchainImageReleaseInfo.")
    )

    // Session

    XrResult(
        "BeginSession",
        """
        Begins an XrSession.

        <h5>C Specification</h5>
        The #BeginSession() function is defined as:

        <pre><code>
￿XrResult xrBeginSession(
￿    XrSession                                   session,
￿    const XrSessionBeginInfo*                   beginInfo);</code></pre>

        <h5>Description</h5>
        When the application receives ##XrEventDataSessionStateChanged event with the #SESSION_STATE_READY state, the application <b>should</b> then call #BeginSession() to start rendering frames for display to the user.

        After this function successfully returns, the session <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session_running">is considered to be running</a>. The application <b>should</b> then start its frame loop consisting of some sequence of #WaitFrame()/#BeginFrame()/#EndFrame() calls.

        If the session <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session_running">is already running</a> when the application calls #BeginSession(), the runtime <b>must</b> return error #ERROR_SESSION_RUNNING. If the session <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session_not_running">is not running</a> when the application calls #BeginSession(), but the session is not yet in the #SESSION_STATE_READY state, the runtime <b>must</b> return error #ERROR_SESSION_NOT_READY.

        Note that a runtime <b>may</b> decide not to show the user any given frame from a session at any time, for example if the user has switched to a different application’s running session. The application should check whether #WaitFrame() returns an ##XrFrameState with {@code shouldRender} set to true before rendering a given frame to determine whether that frame will be visible to the user.

        Runtime session frame state <b>must</b> start in a reset state when a session transitions to <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session_running">running</a> so that no state is carried over from when the same session was previously running.

        If {@code primaryViewConfigurationType} in {@code beginInfo} is not supported by the {@code XrSystemId} used to create the {@code session}, the runtime <b>must</b> return #ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code beginInfo} <b>must</b> be a pointer to a valid ##XrSessionBeginInfo structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED</li>
                <li>#ERROR_SESSION_RUNNING</li>
                <li>#ERROR_SESSION_NOT_READY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSessionBeginInfo, #CreateSession(), #DestroySession(), #EndSession()
        """,

        XrSession("session", "a valid {@code XrSession} handle."),
        XrSessionBeginInfo.const.p("beginInfo", "a pointer to an ##XrSessionBeginInfo structure.")
    )

    XrResult(
        "EndSession",
        """
        Ends an XrSession.

        <h5>C Specification</h5>
        The #EndSession() function is defined as:

        <pre><code>
￿XrResult xrEndSession(
￿    XrSession                                   session);</code></pre>

        <h5>Description</h5>
        When the application receives ##XrEventDataSessionStateChanged event with the #SESSION_STATE_STOPPING state, the application should stop its frame loop and then call #EndSession() to end the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session_running">running</a> session. This function signals to the runtime that the application will no longer call #WaitFrame(), #BeginFrame() or #EndFrame() from any thread allowing the runtime to safely transition the session to #SESSION_STATE_IDLE. The application <b>must</b> also avoid reading input state or sending haptic output after calling #EndSession().

        If the session <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session_not_running">is not running</a> when the application calls #EndSession(), the runtime <b>must</b> return error #ERROR_SESSION_NOT_RUNNING. If the session <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session_running">is still running</a> when the application calls #EndSession(), but the session is not yet in the #SESSION_STATE_STOPPING state, the runtime <b>must</b> return error #ERROR_SESSION_NOT_STOPPING.

        If the application wishes to exit a running session, the application can call #RequestExitSession() so that the session transitions from #SESSION_STATE_IDLE to #SESSION_STATE_EXITING.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_SESSION_NOT_STOPPING</li>
                <li>#ERROR_SESSION_NOT_RUNNING</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #BeginSession(), #CreateSession(), #DestroySession()
        """,

        XrSession("session", "a handle to a <a target=\"_blank\" href=\"https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\\#session_running\">running</a> {@code XrSession}.")
    )

    XrResult(
        "RequestExitSession",
        """
        Request to exit a running session.

        <h5>C Specification</h5>
        When an application wishes to exit a <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session_running">running</a> session, it <b>can</b> call #RequestExitSession(), requesting that the runtime transition through the various intermediate session states including #SESSION_STATE_STOPPING to #SESSION_STATE_EXITING.

        On platforms where an application’s lifecycle is managed by the system, session state changes may be implicitly triggered by application lifecycle state changes. On such platforms, using platform-specific methods to alter application lifecycle state may be the preferred method of provoking session state changes. The behavior of #RequestExitSession() is not altered, however explicit session exit <b>may</b> not interact with the platform-specific application lifecycle.

        The #RequestExitSession() function is defined as:

        <pre><code>
￿XrResult xrRequestExitSession(
￿    XrSession                                   session);</code></pre>

        <h5>Description</h5>
        If {@code session} <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session_not_running">is not running</a> when #RequestExitSession() is called, #ERROR_SESSION_NOT_RUNNING <b>must</b> be returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_SESSION_NOT_RUNNING</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #DestroySession(), #EndSession()
        """,

        XrSession("session", "a handle to a running {@code XrSession}.")
    )

    // Display Timing

    XrResult(
        "WaitFrame",
        """
        Frame timing function.

        <h5>C Specification</h5>
        The #WaitFrame() function is defined as:

        <pre><code>
￿XrResult xrWaitFrame(
￿    XrSession                                   session,
￿    const XrFrameWaitInfo*                      frameWaitInfo,
￿    XrFrameState*                               frameState);</code></pre>

        <h5>Description</h5>
        #WaitFrame() throttles the application frame loop in order to synchronize application frame submissions with the display. #WaitFrame() returns a predicted display time for the next time that the runtime predicts a composited frame will be displayed. The runtime <b>may</b> affect this computation by changing the return values and throttling of #WaitFrame() in response to feedback from frame submission and completion times in #EndFrame(). An application <b>must</b> eventually match each #WaitFrame() call with one call to #BeginFrame(). A subsequent #WaitFrame() call <b>must</b> block until the previous frame has been begun with #BeginFrame() and <b>must</b> unblock independently of the corresponding call to #EndFrame(). When less than one frame interval has passed since the previous return from #WaitFrame(), the runtime <b>should</b> block until the beginning of the next frame interval. If more than one frame interval has passed since the last return from #WaitFrame(), the runtime <b>may</b> return immediately or block until the beginning of the next frame interval.

        In the case that an application has pipelined frame submissions, the application <b>should</b> compute the appropriate target display time using both the predicted display time and predicted display interval. The application <b>should</b> use the computed target display time when requesting space and view locations for rendering.

        The ##XrFrameState{@code ::predictedDisplayTime} returned by #WaitFrame() <b>must</b> be monotonically increasing.

        The runtime <b>may</b> dynamically adjust the start time of the frame interval relative to the display hardware’s refresh cycle to minimize graphics processor contention between the application and the compositor.

        #WaitFrame() <b>must</b> be callable from any thread, including a different thread than #BeginFrame()/#EndFrame() are being called from.

        Calling #WaitFrame() <b>must</b> be externally synchronized by the application, concurrent calls <b>may</b> result in undefined behavior.

        The runtime <b>must</b> return #ERROR_SESSION_NOT_RUNNING if the {@code session} <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session_not_running">is not running</a>.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The engine simulation <b>should</b> advance based on the display time. Every stage in the engine pipeline should use the exact same display time for one particular application-generated frame. An accurate and consistent display time across all stages and threads in the engine pipeline is important to avoid object motion judder. If the application has multiple pipeline stages, the application should pass its computed display time through its pipeline, as #WaitFrame() must be called only once per frame.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>If {@code frameWaitInfo} is not {@code NULL}, {@code frameWaitInfo} <b>must</b> be a pointer to a valid ##XrFrameWaitInfo structure</li>
            <li>{@code frameState} <b>must</b> be a pointer to an ##XrFrameState structure</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to the {@code session} parameter by any other #WaitFrame() call <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_SESSION_NOT_RUNNING</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrFrameState, ##XrFrameWaitInfo, #BeginFrame(), #EndFrame()
        """,

        XrSession("session", "a valid {@code XrSession} handle."),
        nullable..XrFrameWaitInfo.const.p("frameWaitInfo", "exists for extensibility purposes, it is {@code NULL} or a pointer to a valid ##XrFrameWaitInfo."),
        XrFrameState.p("frameState", "a pointer to a valid ##XrFrameState, an output parameter.")
    )

    XrResult(
        "BeginFrame",
        """
        Marks a frame.

        <h5>C Specification</h5>
        The #BeginFrame() function is defined as:

        <pre><code>
￿XrResult xrBeginFrame(
￿    XrSession                                   session,
￿    const XrFrameBeginInfo*                     frameBeginInfo);</code></pre>

        <h5>Description</h5>
        #BeginFrame() is called prior to the start of frame rendering. The application <b>should</b> still call #BeginFrame() but omit rendering work for the frame if ##XrFrameState{@code ::shouldRender} is #FALSE.

        Runtimes <b>must</b> not perform frame synchronization or throttling through the #BeginFrame() function and <b>should</b> instead do so through #WaitFrame().

        The runtime <b>must</b> return the error code #ERROR_CALL_ORDER_INVALID if there was no corresponding successful call to #WaitFrame().

        The runtime <b>must</b> return the success code #FRAME_DISCARDED if a prior #BeginFrame() has been called without an intervening call to #EndFrame().

        The runtime <b>must</b> return #ERROR_SESSION_NOT_RUNNING if the {@code session} <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session_not_running">is not running</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>If {@code frameBeginInfo} is not {@code NULL}, {@code frameBeginInfo} <b>must</b> be a pointer to a valid ##XrFrameBeginInfo structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
                <li>#FRAME_DISCARDED</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_SESSION_NOT_RUNNING</li>
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrFrameBeginInfo, #EndFrame(), #WaitFrame()
        """,

        XrSession("session", "a valid {@code XrSession} handle."),
        nullable..XrFrameBeginInfo.const.p("frameBeginInfo", "exists for extensibility purposes, it is {@code NULL} or a pointer to a valid ##XrFrameBeginInfo.")
    )

    XrResult(
        "EndFrame",
        """
        Marks a frame.

        <h5>C Specification</h5>
        The #EndFrame() function is defined as:

        <pre><code>
￿XrResult xrEndFrame(
￿    XrSession                                   session,
￿    const XrFrameEndInfo*                       frameEndInfo);</code></pre>

        <h5>Description</h5>
        #EndFrame() <b>may</b> return immediately to the application. ##XrFrameEndInfo{@code ::displayTime} <b>should</b> be computed using values returned by #WaitFrame(). The runtime <b>should</b> be robust against variations in the timing of calls to #WaitFrame(), since a pipelined system may call #WaitFrame() on a separate thread from #BeginFrame() and #EndFrame() without any synchronization guarantees.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        An accurate predicted display time is very important to avoid black pull-in by reprojection and to reduce motion judder in case the runtime does not implement a translational reprojection. Reprojection should never display images before the display refresh period they were predicted for, even if they are completed early, because this will cause motion judder just the same. In other words, the better the predicted display time, the less latency experienced by the user.
        </div>

        Every call to #EndFrame() <b>must</b> be preceded by a successful call to #BeginFrame(). Failure to do so <b>must</b> result in #ERROR_CALL_ORDER_INVALID being returned by #EndFrame(). ##XrFrameEndInfo <b>may</b> reference swapchains into which the application has rendered for this frame. From each {@code XrSwapchain} only one image index is implicitly referenced per frame, the one corresponding to the last call to #ReleaseSwapchainImage(). However, a specific swapchain (and by extension a specific swapchain image index) <b>may</b> be referenced in ##XrFrameEndInfo multiple times. This can be used for example to render a side by side image into a single swapchain image and referencing it twice with differing image rectangles in different layers.

        If no layers are provided then the display <b>must</b> be cleared.

        #ERROR_LAYER_INVALID <b>must</b> be returned if an unknown, unsupported layer type, or {@code NULL} pointer is passed as one of the ##XrFrameEndInfo::layers.

        #ERROR_LAYER_INVALID <b>must</b> be returned if a layer references a swapchain that has no released swapchain image.

        #ERROR_LAYER_LIMIT_EXCEEDED <b>must</b> be returned if ##XrFrameEndInfo::layerCount exceeds ##XrSystemGraphicsProperties::maxLayerCount or if the runtime is unable to composite the specified layers due to resource constraints.

        #ERROR_SWAPCHAIN_RECT_INVALID <b>must</b> be returned if ##XrFrameEndInfo::layers contains a composition layer which references pixels outside of the associated swapchain image or if negatively sized.

        #ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED <b>must</b> be returned if ##XrFrameEndInfo::environmentBlendMode is not supported.

        #ERROR_SESSION_NOT_RUNNING <b>must</b> be returned if the {@code session} <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#session_not_running">is not running</a>.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications should discard frames for which #EndFrame() returns a recoverable error over attempting to resubmit the frame with different frame parameters to provide a more consistent experience across different runtime implementations.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code frameEndInfo} <b>must</b> be a pointer to a valid ##XrFrameEndInfo structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_TIME_INVALID</li>
                <li>#ERROR_SWAPCHAIN_RECT_INVALID</li>
                <li>#ERROR_SESSION_NOT_RUNNING</li>
                <li>#ERROR_POSE_INVALID</li>
                <li>#ERROR_LAYER_LIMIT_EXCEEDED</li>
                <li>#ERROR_LAYER_INVALID</li>
                <li>#ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED</li>
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrFrameEndInfo, #BeginFrame(), #WaitFrame()
        """,

        XrSession("session", "a valid {@code XrSession} handle."),
        XrFrameEndInfo.const.p("frameEndInfo", "a pointer to a valid ##XrFrameEndInfo.")
    )

    XrResult(
        "LocateViews",
        """
        Gets view and projection info.

        <h5>C Specification</h5>
        The #LocateViews() function is defined as:

        <pre><code>
￿XrResult xrLocateViews(
￿    XrSession                                   session,
￿    const XrViewLocateInfo*                     viewLocateInfo,
￿    XrViewState*                                viewState,
￿    uint32_t                                    viewCapacityInput,
￿    uint32_t*                                   viewCountOutput,
￿    XrView*                                     views);</code></pre>

        <h5>Description</h5>
        The #LocateViews() function returns the view and projection info for a particular display time. This time is typically the target display time for a given frame. Repeatedly calling #LocateViews() with the same time <b>may</b> not necessarily return the same result. Instead the prediction gets increasingly accurate as the function is called closer to the given time for which a prediction is made. This allows an application to get the predicted views as late as possible in its pipeline to get the least amount of latency and prediction error.

        #LocateViews() returns an array of ##XrView elements, one for each view of the specified view configuration type, along with an ##XrViewState containing additional state data shared across all views. The eye each view corresponds to is statically defined in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#view_configuration_type">{@code XrViewConfigurationType}</a> in case the application wants to apply eye-specific rendering traits. The ##XrViewState and ##XrView member data may change on subsequent calls to #LocateViews(), and so applications <b>must</b> not assume it to be constant.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code viewLocateInfo} <b>must</b> be a pointer to a valid ##XrViewLocateInfo structure</li>
            <li>{@code viewState} <b>must</b> be a pointer to an ##XrViewState structure</li>
            <li>{@code viewCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code viewCapacityInput} is not 0, {@code views} <b>must</b> be a pointer to an array of {@code viewCapacityInput} ##XrView structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED</li>
                <li>#ERROR_TIME_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrView, ##XrViewLocateInfo, ##XrViewState
        """,

        XrSession("session", "a handle to the provided {@code XrSession}."),
        XrViewLocateInfo.const.p("viewLocateInfo", "a pointer to a valid ##XrViewLocateInfo structure."),
        XrViewState.p("viewState", "the output structure with the viewer state information."),
        AutoSize("views")..uint32_t("viewCapacityInput", "an input parameter which specifies the capacity of the {@code views} array. The required capacity <b>must</b> be same as defined by the corresponding {@code XrViewConfigurationType}."),
        Check(1)..uint32_t.p("viewCountOutput", "an output parameter which identifies the valid count of {@code views}."),
        nullable..XrView.p("views", "an array of ##XrView.")
    )

    // Semantic Paths

    XrResult(
        "StringToPath",
        """
        Converts a string to a semantic path.

        <h5>C Specification</h5>
        The #StringToPath() function is defined as:

        <pre><code>
￿XrResult xrStringToPath(
￿    XrInstance                                  instance,
￿    const char*                                 pathString,
￿    XrPath*                                     path);</code></pre>

        <h5>Description</h5>
        #StringToPath() retrieves the {@code XrPath} value for a well-formed path string. If such a value had not yet been assigned by the runtime to the provided path string in this {@code XrInstance}, one <b>must</b> be assigned at this point. All calls to this function with the same {@code XrInstance} and path string <b>must</b> retrieve the same {@code XrPath} value. Upon failure, #StringToPath() <b>must</b> return an appropriate {@code XrResult}, and <b>may</b> set the output parameter to #NULL_PATH. See <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#path-atom-type">Path Atom Type</a> for the conditions under which an error <b>may</b> be returned when this function is given a valid {@code XrInstance} and a well-formed path string.

        If the runtime’s resources are exhausted and it cannot create the path, a return value of #ERROR_PATH_COUNT_EXCEEDED <b>must</b> be returned. If the application specifies a string that is not a well-formed path string, #ERROR_PATH_FORMAT_INVALID <b>must</b> be returned.

        A return value of #SUCCESS from #StringToPath() <b>may</b> not necessarily imply that the runtime has a component or other source of data that will be accessible through that semantic path. It only means that the path string supplied was well-formed and that the retrieved {@code XrPath} maps to the given path string within and during the lifetime of the {@code XrInstance} given.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code pathString} <b>must</b> be a null-terminated UTF-8 string</li>
            <li>{@code path} <b>must</b> be a pointer to an {@code XrPath} value</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_PATH_FORMAT_INVALID</li>
                <li>#ERROR_PATH_COUNT_EXCEEDED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #PathToString()
        """,

        XrInstance("instance", "an instance previously created."),
        charUTF8.const.p("pathString", "the path name string to retrieve the associated {@code XrPath} for."),
        Check(1)..XrPath.p("path", "the output parameter, which <b>must</b> point to an {@code XrPath}. Given a well-formed path name string, this will be populated with an opaque value that is constant for that path string during the lifetime of that instance.")
    )

    XrResult(
        "PathToString",
        """
        Converts a semantic path to a string.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrPathToString(
￿    XrInstance                                  instance,
￿    XrPath                                      path,
￿    uint32_t                                    bufferCapacityInput,
￿    uint32_t*                                   bufferCountOutput,
￿    char*                                       buffer);</code></pre>

        <h5>Description</h5>
        #PathToString() retrieves the path name string associated with an {@code XrPath}, in the context of a given {@code XrInstance}, in the form of a {@code NULL} terminated string placed into a <em>caller-allocated</em> buffer. Since the mapping between a well-formed path name string and an {@code XrPath} is bijective, there will always be exactly one string for each valid {@code XrPath} value. This can be useful if the calling application receives an {@code XrPath} value that they had not previously retrieved via #StringToPath(). During the lifetime of the given {@code XrInstance}, the path name string retrieved by this function for a given valid {@code XrPath} will not change. For invalid paths, including #NULL_PATH, #ERROR_PATH_INVALID <b>must</b> be returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_PATH_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #StringToPath()
        """,

        XrInstance("instance", "an instance previously created."),
        XrPath("path", "the valid {@code XrPath} value to retrieve the path string for."),
        AutoSize("buffer")..uint32_t("bufferCapacityInput", "the capacity of the buffer, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("bufferCountOutput", "a pointer to the count of characters written (including the terminating '\\0'), or a pointer to the required capacity in the case that {@code bufferCapacityInput} is 0."),
        nullable..char.p("buffer", "a pointer to an application-allocated buffer that will be filled with the semantic path string. It <b>can</b> be {@code NULL} if {@code bufferCapacityInput} is 0.")
    )

    // Input

    XrResult(
        "CreateActionSet",
        """
        Creates an XrActionSet.

        <h5>C Specification</h5>
        The #CreateActionSet() function is defined as:

        <pre><code>
￿XrResult xrCreateActionSet(
￿    XrInstance                                  instance,
￿    const XrActionSetCreateInfo*                createInfo,
￿    XrActionSet*                                actionSet);</code></pre>

        <h5>Description</h5>
        The #CreateActionSet() function creates an action set and returns a handle to the created action set.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrActionSetCreateInfo structure</li>
            <li>{@code actionSet} <b>must</b> be a pointer to an {@code XrActionSet} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_PATH_FORMAT_INVALID</li>
                <li>#ERROR_NAME_INVALID</li>
                <li>#ERROR_NAME_DUPLICATED</li>
                <li>#ERROR_LOCALIZED_NAME_INVALID</li>
                <li>#ERROR_LOCALIZED_NAME_DUPLICATED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrActionSetCreateInfo, #DestroyActionSet()
        """,

        XrInstance("instance", "a handle to an {@code XrInstance}."),
        XrActionSetCreateInfo.const.p("createInfo", "a pointer to a valid ##XrActionSetCreateInfo structure that defines the action set being created."),
        Check(1)..XrActionSet.p("actionSet", "a pointer to an {@code XrActionSet} where the created action set is returned.")
    )

    XrResult(
        "DestroyActionSet",
        """
        Destroys an XrActionSet.

        <h5>C Specification</h5>
        The #DestroyActionSet() function is defined as:

        <pre><code>
￿XrResult xrDestroyActionSet(
￿    XrActionSet                                 actionSet);</code></pre>

        <h5>Description</h5>
        Action set handles <b>can</b> be destroyed by calling #DestroyActionSet(). When an action set handle is destroyed, all handles of actions in that action set are also destroyed.

        The implementation <b>must</b> not free underlying resources for the action set while there are other valid handles that refer to those resources. The implementation <b>may</b> release resources for an action set when all of the action spaces for actions in that action set have been destroyed. See <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#spaces-action-spaces-lifetime">Action Spaces Lifetime</a> for details.

        Resources for all action sets in an instance <b>must</b> be freed when the instance containing those actions sets is destroyed.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code actionSet} <b>must</b> be a valid {@code XrActionSet} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code actionSet}, and any child handles, <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_HANDLE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #CreateActionSet()
        """,

        XrActionSet("actionSet", "the action set to destroy.")
    )

    XrResult(
        "CreateAction",
        """
        Creates an XrAction.

        <h5>C Specification</h5>
        The #CreateAction() function is defined as:

        <pre><code>
￿XrResult xrCreateAction(
￿    XrActionSet                                 actionSet,
￿    const XrActionCreateInfo*                   createInfo,
￿    XrAction*                                   action);</code></pre>

        <h5>Description</h5>
        #CreateAction() creates an action and returns its handle.

        If {@code actionSet} has been included in a call to #AttachSessionActionSets(), the implementation <b>must</b> return #ERROR_ACTIONSETS_ALREADY_ATTACHED.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code actionSet} <b>must</b> be a valid {@code XrActionSet} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrActionCreateInfo structure</li>
            <li>{@code action} <b>must</b> be a pointer to an {@code XrAction} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_PATH_FORMAT_INVALID</li>
                <li>#ERROR_NAME_INVALID</li>
                <li>#ERROR_NAME_DUPLICATED</li>
                <li>#ERROR_LOCALIZED_NAME_INVALID</li>
                <li>#ERROR_LOCALIZED_NAME_DUPLICATED</li>
                <li>#ERROR_ACTIONSETS_ALREADY_ATTACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrActionCreateInfo, #DestroyAction()
        """,

        XrActionSet("actionSet", "a handle to an {@code XrActionSet}."),
        XrActionCreateInfo.const.p("createInfo", "a pointer to a valid ##XrActionCreateInfo structure that defines the action being created."),
        Check(1)..XrAction.p("action", "a pointer to an {@code XrAction} where the created action is returned.")
    )

    XrResult(
        "DestroyAction",
        """
        Destroys an XrAction.

        <h5>C Specification</h5>
        The #DestroyAction() function is defined as:

        <pre><code>
￿XrResult xrDestroyAction(
￿    XrAction                                    action);</code></pre>

        <h5>Description</h5>
        Action handles <b>can</b> be destroyed by calling #DestroyAction(). Handles for actions that are part of an action set are automatically destroyed when the action set’s handle is destroyed.

        The implementation <b>must</b> not destroy the underlying resources for an action when #DestroyAction() is called. Those resources are still used to make <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#spaces-action-spaces-lifetime">action spaces locatable</a> and when processing action priority in #SyncActions(). Destroying the action handle removes the application’s access to these resources, but has no other change on actions.

        Resources for all actions in an instance <b>must</b> be freed when the instance containing those actions sets is destroyed.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code action} <b>must</b> be a valid {@code XrAction} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code action}, and any child handles, <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_HANDLE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #CreateAction()
        """,

        XrAction("action", "the action to destroy.")
    )

    XrResult(
        "SuggestInteractionProfileBindings",
        """
        Sets the application-suggested bindings for the interaction profile.

        <h5>C Specification</h5>
        The #SuggestInteractionProfileBindings() function is defined as:

        <pre><code>
￿XrResult xrSuggestInteractionProfileBindings(
￿    XrInstance                                  instance,
￿    const XrInteractionProfileSuggestedBinding* suggestedBindings);</code></pre>

        <h5>Description</h5>
        #SuggestInteractionProfileBindings() sets an interaction profile for which the application can provide default bindings. The application <b>can</b> call #SuggestInteractionProfileBindings() once per interaction profile that it supports.

        The application <b>can</b> provide any number of bindings for each action.

        If the application successfully calls #SuggestInteractionProfileBindings() more than once for an interaction profile, the runtime <b>must</b> discard the previous suggested bindings and replace them with the new suggested bindings for that profile.

        If the interaction profile path does not follow the structure defined in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#semantic-path-interaction-profiles">Interaction Profiles</a> or suggested bindings contain paths that do not follow the format defined in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#semantic-path-input">Device input subpaths</a>, the runtime <b>must</b> return #ERROR_PATH_UNSUPPORTED. If the interaction profile or input source for any of the suggested bindings does not exist in the allowlist defined in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#semantic-path-interaction-profiles">Interaction Profile Paths</a>, the runtime <b>must</b> return #ERROR_PATH_UNSUPPORTED. A runtime <b>must</b> accept every valid binding in the allowlist though it is free to ignore any of them.

        If the action set for any action referenced in the {@code suggestedBindings} parameter has been included in a call to #AttachSessionActionSets(), the implementation <b>must</b> return #ERROR_ACTIONSETS_ALREADY_ATTACHED.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code suggestedBindings} <b>must</b> be a pointer to a valid ##XrInteractionProfileSuggestedBinding structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_ACTIONSETS_ALREADY_ATTACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrInteractionProfileSuggestedBinding
        """,

        XrInstance("instance", "the {@code XrInstance} for which the application would like to set suggested bindings"),
        XrInteractionProfileSuggestedBinding.const.p("suggestedBindings", "the ##XrInteractionProfileSuggestedBinding that the application would like to set")
    )

    XrResult(
        "AttachSessionActionSets",
        """
        Attaches action sets to a given session.

        <h5>C Specification</h5>
        The #AttachSessionActionSets() function is defined as:

        <pre><code>
￿XrResult xrAttachSessionActionSets(
￿    XrSession                                   session,
￿    const XrSessionActionSetsAttachInfo*        attachInfo);</code></pre>

        <h5>Description</h5>
        #AttachSessionActionSets() attaches the {@code XrActionSet} handles in {@code attachInfo.actionSets} to the {@code session}. Action sets <b>must</b> be attached in order to be synchronized with #SyncActions().

        When an action set is attached to a session, that action set becomes immutable. See #CreateAction() and #SuggestInteractionProfileBindings() for details.

        After action sets are attached to a session, if any unattached actions are passed to functions for the same session, then for those functions the runtime <b>must</b> return #ERROR_ACTIONSET_NOT_ATTACHED.

        The runtime <b>must</b> return #ERROR_ACTIONSETS_ALREADY_ATTACHED if #AttachSessionActionSets() is called more than once for a given {@code session}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code attachInfo} <b>must</b> be a pointer to a valid ##XrSessionActionSetsAttachInfo structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_ACTIONSETS_ALREADY_ATTACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSessionActionSetsAttachInfo
        """,

        XrSession("session", "the {@code XrSession} to attach the action sets to."),
        XrSessionActionSetsAttachInfo.const.p("attachInfo", "the ##XrSessionActionSetsAttachInfo to provide information to attach action sets to the session.")
    )

    XrResult(
        "GetCurrentInteractionProfile",
        """
        Gets the current interaction profile for a top level user paths.

        <h5>C Specification</h5>
        The #GetCurrentInteractionProfile() function is defined as:

        <pre><code>
￿XrResult xrGetCurrentInteractionProfile(
￿    XrSession                                   session,
￿    XrPath                                      topLevelUserPath,
￿    XrInteractionProfileState*                  interactionProfile);</code></pre>

        <h5>Description</h5>
        #GetCurrentInteractionProfile() asks the runtime for the active interaction profiles for a top level user path.

        The runtime <b>must</b> return only interaction profiles for which the application has provided bindings with #SuggestInteractionProfileBindings() or #NULL_PATH. The runtime <b>may</b> return interaction profiles that do not represent physically present hardware, for example if the runtime is using a known interaction profile to bind to hardware that the application is not aware of. The runtime <b>may</b> return the last-known interaction profile in the event that no controllers are active.

        If #AttachSessionActionSets() has not yet been called for the {@code session}, the runtime <b>must</b> return #ERROR_ACTIONSET_NOT_ATTACHED. If {@code topLevelUserPath} is not one of the device input subpaths described in section <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#semantic-path-user">/user paths</a>, the runtime <b>must</b> return #ERROR_PATH_UNSUPPORTED.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code interactionProfile} <b>must</b> be a pointer to an ##XrInteractionProfileState structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_ACTIONSET_NOT_ATTACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrInteractionProfileState
        """,

        XrSession("session", "the {@code XrSession} for which the application would like to retrieve the current interaction profile."),
        XrPath("topLevelUserPath", "the top level user path the application would like to retrieve the interaction profile for."),
        XrInteractionProfileState.p("interactionProfile", "a pointer to an ##XrInteractionProfileState structure to receive the current interaction profile.")
    )

    XrResult(
        "GetActionStateBoolean",
        """
        Gets boolean action state.

        <h5>C Specification</h5>
        #GetActionStateBoolean() retrieves the current state of a boolean action. It is defined as:

        <pre><code>
￿XrResult xrGetActionStateBoolean(
￿    XrSession                                   session,
￿    const XrActionStateGetInfo*                 getInfo,
￿    XrActionStateBoolean*                       state);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code getInfo} <b>must</b> be a pointer to a valid ##XrActionStateGetInfo structure</li>
            <li>{@code state} <b>must</b> be a pointer to an ##XrActionStateBoolean structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_ACTION_TYPE_MISMATCH</li>
                <li>#ERROR_ACTIONSET_NOT_ATTACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrActionStateBoolean, ##XrActionStateGetInfo, #CreateAction()
        """,

        XrSession("session", "the {@code XrSession} to query."),
        XrActionStateGetInfo.const.p("getInfo", "a pointer to ##XrActionStateGetInfo to provide action and subaction paths information."),
        XrActionStateBoolean.p("state", "a pointer to a valid ##XrActionStateBoolean into which the state will be placed.")
    )

    XrResult(
        "GetActionStateFloat",
        """
        Gets a floating point action state.

        <h5>C Specification</h5>
        #GetActionStateFloat() retrieves the current state of a floating-point action. It is defined as:

        <pre><code>
￿XrResult xrGetActionStateFloat(
￿    XrSession                                   session,
￿    const XrActionStateGetInfo*                 getInfo,
￿    XrActionStateFloat*                         state);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code getInfo} <b>must</b> be a pointer to a valid ##XrActionStateGetInfo structure</li>
            <li>{@code state} <b>must</b> be a pointer to an ##XrActionStateFloat structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_ACTION_TYPE_MISMATCH</li>
                <li>#ERROR_ACTIONSET_NOT_ATTACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrActionStateFloat, ##XrActionStateGetInfo, #CreateAction()
        """,

        XrSession("session", "the {@code XrSession} to query."),
        XrActionStateGetInfo.const.p("getInfo", "a pointer to ##XrActionStateGetInfo to provide action and subaction paths information."),
        XrActionStateFloat.p("state", "a pointer to a valid ##XrActionStateFloat into which the state will be placed.")
    )

    XrResult(
        "GetActionStateVector2f",
        """
        Gets 2D float vector action state.

        <h5>C Specification</h5>
        #GetActionStateVector2f() retrieves the current state of a two-dimensional vector action. It is defined as:

        <pre><code>
￿XrResult xrGetActionStateVector2f(
￿    XrSession                                   session,
￿    const XrActionStateGetInfo*                 getInfo,
￿    XrActionStateVector2f*                      state);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code getInfo} <b>must</b> be a pointer to a valid ##XrActionStateGetInfo structure</li>
            <li>{@code state} <b>must</b> be a pointer to an ##XrActionStateVector2f structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_ACTION_TYPE_MISMATCH</li>
                <li>#ERROR_ACTIONSET_NOT_ATTACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrActionStateGetInfo, ##XrActionStateVector2f, #CreateAction()
        """,

        XrSession("session", "the {@code XrSession} to query."),
        XrActionStateGetInfo.const.p("getInfo", "a pointer to ##XrActionStateGetInfo to provide action and subaction paths information."),
        XrActionStateVector2f.p("state", "a pointer to a valid ##XrActionStateVector2f into which the state will be placed.")
    )

    XrResult(
        "GetActionStatePose",
        """
        Gets metadata from a pose action.

        <h5>C Specification</h5>
        The #GetActionStatePose() function is defined as:

        <pre><code>
￿XrResult xrGetActionStatePose(
￿    XrSession                                   session,
￿    const XrActionStateGetInfo*                 getInfo,
￿    XrActionStatePose*                          state);</code></pre>

        <h5>Description</h5>
        #GetActionStatePose() returns information about the binding and active state for the specified action. To determine the pose of this action at a historical or predicted time, the application <b>can</b> create an action space using #CreateActionSpace(). Then, after each sync, the application <b>can</b> locate the pose of this action space within a base space using #LocateSpace().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code getInfo} <b>must</b> be a pointer to a valid ##XrActionStateGetInfo structure</li>
            <li>{@code state} <b>must</b> be a pointer to an ##XrActionStatePose structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_ACTION_TYPE_MISMATCH</li>
                <li>#ERROR_ACTIONSET_NOT_ATTACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrActionStateGetInfo, ##XrActionStatePose, #CreateAction(), #CreateActionSpace()
        """,

        XrSession("session", "the {@code XrSession} to query."),
        XrActionStateGetInfo.const.p("getInfo", "a pointer to ##XrActionStateGetInfo to provide action and subaction paths information."),
        XrActionStatePose.p("state", "a pointer to a valid ##XrActionStatePose into which the state will be placed.")
    )

    XrResult(
        "SyncActions",
        """
        Updates the current state of input actions.

        <h5>C Specification</h5>
        The #SyncActions() function is defined as:

        <pre><code>
￿XrResult xrSyncActions(
￿    XrSession                                   session,
￿    const XrActionsSyncInfo*                    syncInfo);</code></pre>

        <h5>Description</h5>
        #SyncActions() updates the current state of input actions. Repeated input action state queries between subsequent synchronization calls <b>must</b> return the same values. The {@code XrActionSet} structures referenced in the {@code syncInfo.activeActionSets} <b>must</b> have been previously attached to the session via #AttachSessionActionSets(). If any action sets not attached to this session are passed to #SyncActions() it <b>must</b> return #ERROR_ACTIONSET_NOT_ATTACHED. Subsets of the bound action sets <b>can</b> be synchronized in order to control which actions are seen as active.

        If {@code session} is not focused, the runtime <b>must</b> return #SESSION_NOT_FOCUSED, and all action states in the session <b>must</b> be inactive.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code syncInfo} <b>must</b> be a pointer to a valid ##XrActionsSyncInfo structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
                <li>#SESSION_NOT_FOCUSED</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_ACTIONSET_NOT_ATTACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrActionsSyncInfo, ##XrActiveActionSet
        """,

        XrSession("session", "a handle to the {@code XrSession} that all provided action set handles belong to."),
        XrActionsSyncInfo.const.p("syncInfo", "an ##XrActionsSyncInfo providing information to synchronize action states.")
    )

    XrResult(
        "EnumerateBoundSourcesForAction",
        """
        Queries the bound input sources for an action.

        <h5>C Specification</h5>
        The #EnumerateBoundSourcesForAction() function is defined as:

        <pre><code>
￿XrResult xrEnumerateBoundSourcesForAction(
￿    XrSession                                   session,
￿    const XrBoundSourcesForActionEnumerateInfo* enumerateInfo,
￿    uint32_t                                    sourceCapacityInput,
￿    uint32_t*                                   sourceCountOutput,
￿    XrPath*                                     sources);</code></pre>

        <h5>Description</h5>
        If an action is unbound, #EnumerateBoundSourcesForAction() <b>must</b> assign 0 to the value pointed-to by {@code sourceCountOutput} and not modify the array.

        #EnumerateBoundSourcesForAction() <b>must</b> return #ERROR_ACTIONSET_NOT_ATTACHED if passed an action in an action set never attached to the session with #AttachSessionActionSets().

        As bindings for actions do not change between calls to #SyncActions(), #EnumerateBoundSourcesForAction() <b>must</b> enumerate the same set of bound sources, or absence of bound sources, for a given query (defined by the {@code enumerateInfo} parameter) between any two calls to #SyncActions().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code enumerateInfo} <b>must</b> be a pointer to a valid ##XrBoundSourcesForActionEnumerateInfo structure</li>
            <li>{@code sourceCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code sourceCapacityInput} is not 0, {@code sources} <b>must</b> be a pointer to an array of {@code sourceCapacityInput} {@code XrPath} values</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_ACTIONSET_NOT_ATTACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrBoundSourcesForActionEnumerateInfo
        """,

        XrSession("session", "the {@code XrSession} being queried."),
        XrBoundSourcesForActionEnumerateInfo.const.p("enumerateInfo", "an ##XrBoundSourcesForActionEnumerateInfo providing the query information."),
        AutoSize("sources")..uint32_t("sourceCapacityInput", "the capacity of the array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("sourceCountOutput", "a pointer to the count of sources, or a pointer to the required capacity in the case that {@code sourceCapacityInput} is 0."),
        nullable..XrPath.p("sources", "a pointer to an application-allocated array that will be filled with the {@code XrPath} values for all sources. It <b>can</b> be {@code NULL} if {@code sourceCapacityInput} is 0.")
    )

    XrResult(
        "GetInputSourceLocalizedName",
        """
        Gets a localized source name.

        <h5>C Specification</h5>
        The #GetInputSourceLocalizedName() function is defined as:

        <pre><code>
￿XrResult xrGetInputSourceLocalizedName(
￿    XrSession                                   session,
￿    const XrInputSourceLocalizedNameGetInfo*    getInfo,
￿    uint32_t                                    bufferCapacityInput,
￿    uint32_t*                                   bufferCountOutput,
￿    char*                                       buffer);</code></pre>

        <h5>Description</h5>
        #GetInputSourceLocalizedName() returns a string for the input source in the current system locale.

        If #AttachSessionActionSets() has not yet been called for the session, the runtime <b>must</b> return #ERROR_ACTIONSET_NOT_ATTACHED.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code getInfo} <b>must</b> be a pointer to a valid ##XrInputSourceLocalizedNameGetInfo structure</li>
            <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_ACTIONSET_NOT_ATTACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrInputSourceLocalizedNameGetInfo
        """,

        XrSession("session", "a handle to the {@code XrSession} associated with the action that reported this source."),
        XrInputSourceLocalizedNameGetInfo.const.p("getInfo", "an ##XrInputSourceLocalizedNameGetInfo providing the query information."),
        AutoSize("buffer")..uint32_t("bufferCapacityInput", "the capacity of the buffer, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("bufferCountOutput", "a pointer to the count of name characters written (including the terminating {@code \\0}), or a pointer to the required capacity in the case that {@code bufferCapacityInput} is 0."),
        nullable..char.p("buffer", "a pointer to an application-allocated buffer that will be filled with the source name. It <b>can</b> be {@code NULL} if {@code bufferCapacityInput} is 0.")
    )

    // Haptics

    XrResult(
        "ApplyHapticFeedback",
        """
        Apply haptic feedback.

        <h5>C Specification</h5>
        The #ApplyHapticFeedback() function is defined as:

        <pre><code>
￿XrResult xrApplyHapticFeedback(
￿    XrSession                                   session,
￿    const XrHapticActionInfo*                   hapticActionInfo,
￿    const XrHapticBaseHeader*                   hapticFeedback);</code></pre>

        <h5>Description</h5>
        Triggers a haptic event through the specified action of type #TYPE_HAPTIC_VIBRATION. The runtime <b>should</b> deliver this request to the appropriate device, but exactly which device, if any, this event is sent to is up to the runtime to decide. If an appropriate device is unavailable the runtime <b>may</b> ignore this request for haptic feedback.

        If {@code session} is not focused, the runtime <b>must</b> return #SESSION_NOT_FOCUSED, and not trigger a haptic event.

        If another haptic event from this session is currently happening on the device bound to this action, the runtime <b>must</b> interrupt that other event and replace it with the new one.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code hapticActionInfo} <b>must</b> be a pointer to a valid ##XrHapticActionInfo structure</li>
            <li>{@code hapticFeedback} <b>must</b> be a pointer to a valid ##XrHapticBaseHeader-based structure. See also: ##XrHapticVibration</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
                <li>#SESSION_NOT_FOCUSED</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_ACTION_TYPE_MISMATCH</li>
                <li>#ERROR_ACTIONSET_NOT_ATTACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrHapticActionInfo, ##XrHapticBaseHeader, ##XrHapticVibration, #StopHapticFeedback()
        """,

        XrSession("session", "the {@code XrSession} to start outputting to."),
        XrHapticActionInfo.const.p("hapticActionInfo", "a pointer to ##XrHapticActionInfo to provide action and subaction paths information."),
        XrHapticBaseHeader.const.p("hapticFeedback", "a pointer to a haptic event structure which starts with an ##XrHapticBaseHeader.")
    )

    XrResult(
        "StopHapticFeedback",
        """
        Stop haptic feedback.

        <h5>C Specification</h5>
        The #StopHapticFeedback() function is defined as:

        <pre><code>
￿XrResult xrStopHapticFeedback(
￿    XrSession                                   session,
￿    const XrHapticActionInfo*                   hapticActionInfo);</code></pre>

        <h5>Description</h5>
        If a haptic event from this {@code XrAction} is in progress, when this function is called the runtime <b>must</b> stop that event.

        If {@code session} is not focused, the runtime <b>must</b> return #SESSION_NOT_FOCUSED.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code hapticActionInfo} <b>must</b> be a pointer to a valid ##XrHapticActionInfo structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
                <li>#SESSION_NOT_FOCUSED</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_ACTION_TYPE_MISMATCH</li>
                <li>#ERROR_ACTIONSET_NOT_ATTACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrHapticActionInfo, #ApplyHapticFeedback()
        """,

        XrSession("session", "the {@code XrSession} to stop outputting to."),
        XrHapticActionInfo.const.p("hapticActionInfo", "a pointer to an ##XrHapticActionInfo to provide action and subaction path information.")
    )

}