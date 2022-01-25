/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The core OpenXR 1.0 functionality. */
public class XR10 {

    /**
     * XrResult - Result codes
     * 
     * <h5>Description</h5>
     * 
     * <p>All return codes in the API are reported via {@code XrResult} return values.</p>
     * 
     * <p>Some common suffixes shared across many of the return codes are defined below:</p>
     * 
     * <ul>
     * <li>{@code _INVALID}: The specified handle, atom or value is formatted incorrectly, or the specified handle was never created or has been destroyed.</li>
     * <li>{@code _UNSUPPORTED}: The specified handle, atom, enumerant or value is formatted correctly but cannot be used for the lifetime of this function’s parent handle.</li>
     * <li>{@code _UNAVAILABLE}: The specified handle, atom, enumerant or value is supported by this function’s parent handle but not at this moment.</li>
     * </ul>
     * 
     * <h5>Success Codes</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_SUCCESS SUCCESS}</td><td>Function successfully completed.</td></tr>
     * <tr><td>{@link #XR_TIMEOUT_EXPIRED TIMEOUT_EXPIRED}</td><td>The specified timeout time occurred before the operation could complete.</td></tr>
     * <tr><td>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</td><td>The session will be lost soon.</td></tr>
     * <tr><td>{@link #XR_EVENT_UNAVAILABLE EVENT_UNAVAILABLE}</td><td>No event was available.</td></tr>
     * <tr><td>{@link #XR_SPACE_BOUNDS_UNAVAILABLE SPACE_BOUNDS_UNAVAILABLE}</td><td>The space’s bounds are not known at the moment.</td></tr>
     * <tr><td>{@link #XR_SESSION_NOT_FOCUSED SESSION_NOT_FOCUSED}</td><td>The session is not in the focused state.</td></tr>
     * <tr><td>{@link #XR_FRAME_DISCARDED FRAME_DISCARDED}</td><td>A frame has been discarded from composition.</td></tr>
     * <tr><td>{@link FBRenderModel#XR_RENDER_MODEL_UNAVAILABLE_FB RENDER_MODEL_UNAVAILABLE_FB}</td><td>The model is unavailable. (Added by the {@link FBRenderModel XR_FB_render_model} extension)</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>Error Codes</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</td><td>The function usage was invalid in some way.</td></tr>
     * <tr><td>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</td><td>The runtime failed to handle the function in an unexpected way that is not covered by another error result.</td></tr>
     * <tr><td>{@link #XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</td><td>A memory allocation has failed.</td></tr>
     * <tr><td>{@link #XR_ERROR_API_VERSION_UNSUPPORTED ERROR_API_VERSION_UNSUPPORTED}</td><td>The runtime does not support the requested API version.</td></tr>
     * <tr><td>{@link #XR_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</td><td>Initialization of object could not be completed.</td></tr>
     * <tr><td>{@link #XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</td><td>The requested function was not found or is otherwise unsupported.</td></tr>
     * <tr><td>{@link #XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</td><td>The requested feature is not supported.</td></tr>
     * <tr><td>{@link #XR_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT}</td><td>A requested extension is not supported.</td></tr>
     * <tr><td>{@link #XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</td><td>The runtime supports no more of the requested resource.</td></tr>
     * <tr><td>{@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</td><td>The supplied size was smaller than required.</td></tr>
     * <tr><td>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</td><td>A supplied object handle was invalid.</td></tr>
     * <tr><td>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</td><td>The {@code XrInstance} was lost or could not be found. It will need to be destroyed and optionally recreated.</td></tr>
     * <tr><td>{@link #XR_ERROR_SESSION_RUNNING ERROR_SESSION_RUNNING}</td><td>The session <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session_running">is already running</a>.</td></tr>
     * <tr><td>{@link #XR_ERROR_SESSION_NOT_RUNNING ERROR_SESSION_NOT_RUNNING}</td><td>The session <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session_not_running">is not yet running</a>.</td></tr>
     * <tr><td>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</td><td>The {@code XrSession} was lost. It will need to be destroyed and optionally recreated.</td></tr>
     * <tr><td>{@link #XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</td><td>The provided {@code XrSystemId} was invalid.</td></tr>
     * <tr><td>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</td><td>The provided {@code XrPath} was not valid.</td></tr>
     * <tr><td>{@link #XR_ERROR_PATH_COUNT_EXCEEDED ERROR_PATH_COUNT_EXCEEDED}</td><td>The maximum number of supported semantic paths has been reached.</td></tr>
     * <tr><td>{@link #XR_ERROR_PATH_FORMAT_INVALID ERROR_PATH_FORMAT_INVALID}</td><td>The semantic path character format is invalid.</td></tr>
     * <tr><td>{@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</td><td>The semantic path is unsupported.</td></tr>
     * <tr><td>{@link #XR_ERROR_LAYER_INVALID ERROR_LAYER_INVALID}</td><td>The layer was NULL or otherwise invalid.</td></tr>
     * <tr><td>{@link #XR_ERROR_LAYER_LIMIT_EXCEEDED ERROR_LAYER_LIMIT_EXCEEDED}</td><td>The number of specified layers is greater than the supported number.</td></tr>
     * <tr><td>{@link #XR_ERROR_SWAPCHAIN_RECT_INVALID ERROR_SWAPCHAIN_RECT_INVALID}</td><td>The image rect was negatively sized or otherwise invalid.</td></tr>
     * <tr><td>{@link #XR_ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED}</td><td>The image format is not supported by the runtime or platform.</td></tr>
     * <tr><td>{@link #XR_ERROR_ACTION_TYPE_MISMATCH ERROR_ACTION_TYPE_MISMATCH}</td><td>The API used to retrieve an action’s state does not match the action’s type.</td></tr>
     * <tr><td>{@link #XR_ERROR_SESSION_NOT_READY ERROR_SESSION_NOT_READY}</td><td>The session is not in the ready state.</td></tr>
     * <tr><td>{@link #XR_ERROR_SESSION_NOT_STOPPING ERROR_SESSION_NOT_STOPPING}</td><td>The session is not in the stopping state.</td></tr>
     * <tr><td>{@link #XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</td><td>The provided {@code XrTime} was zero, negative, or out of range.</td></tr>
     * <tr><td>{@link #XR_ERROR_REFERENCE_SPACE_UNSUPPORTED ERROR_REFERENCE_SPACE_UNSUPPORTED}</td><td>The specified reference space is not supported by the runtime or system.</td></tr>
     * <tr><td>{@link #XR_ERROR_FILE_ACCESS_ERROR ERROR_FILE_ACCESS_ERROR}</td><td>The file could not be accessed.</td></tr>
     * <tr><td>{@link #XR_ERROR_FILE_CONTENTS_INVALID ERROR_FILE_CONTENTS_INVALID}</td><td>The file’s contents were invalid.</td></tr>
     * <tr><td>{@link #XR_ERROR_FORM_FACTOR_UNSUPPORTED ERROR_FORM_FACTOR_UNSUPPORTED}</td><td>The specified form factor is not supported by the current runtime or platform.</td></tr>
     * <tr><td>{@link #XR_ERROR_FORM_FACTOR_UNAVAILABLE ERROR_FORM_FACTOR_UNAVAILABLE}</td><td>The specified form factor is supported, but the device is currently not available, e.g. not plugged in or powered off.</td></tr>
     * <tr><td>{@link #XR_ERROR_API_LAYER_NOT_PRESENT ERROR_API_LAYER_NOT_PRESENT}</td><td>A requested API layer is not present or could not be loaded.</td></tr>
     * <tr><td>{@link #XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</td><td>The call was made without having made a previously required call.</td></tr>
     * <tr><td>{@link #XR_ERROR_GRAPHICS_DEVICE_INVALID ERROR_GRAPHICS_DEVICE_INVALID}</td><td>The given graphics device is not in a valid state. The graphics device could be lost or initialized without meeting graphics requirements.</td></tr>
     * <tr><td>{@link #XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</td><td>The supplied pose was invalid with respect to the requirements.</td></tr>
     * <tr><td>{@link #XR_ERROR_INDEX_OUT_OF_RANGE ERROR_INDEX_OUT_OF_RANGE}</td><td>The supplied index was outside the range of valid indices.</td></tr>
     * <tr><td>{@link #XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED}</td><td>The specified view configuration type is not supported by the runtime or platform.</td></tr>
     * <tr><td>{@link #XR_ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED}</td><td>The specified environment blend mode is not supported by the runtime or platform.</td></tr>
     * <tr><td>{@link #XR_ERROR_NAME_DUPLICATED ERROR_NAME_DUPLICATED}</td><td>The name provided was a duplicate of an already-existing resource.</td></tr>
     * <tr><td>{@link #XR_ERROR_NAME_INVALID ERROR_NAME_INVALID}</td><td>The name provided was invalid.</td></tr>
     * <tr><td>{@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}</td><td>A referenced action set is not attached to the session.</td></tr>
     * <tr><td>{@link #XR_ERROR_ACTIONSETS_ALREADY_ATTACHED ERROR_ACTIONSETS_ALREADY_ATTACHED}</td><td>The session already has attached action sets.</td></tr>
     * <tr><td>{@link #XR_ERROR_LOCALIZED_NAME_DUPLICATED ERROR_LOCALIZED_NAME_DUPLICATED}</td><td>The localized name provided was a duplicate of an already-existing resource.</td></tr>
     * <tr><td>{@link #XR_ERROR_LOCALIZED_NAME_INVALID ERROR_LOCALIZED_NAME_INVALID}</td><td>The localized name provided was invalid.</td></tr>
     * <tr><td>{@link #XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING}</td><td>The {@code xrGetGraphicsRequirements}* call was not made before calling {@code xrCreateSession}.</td></tr>
     * <tr><td>{@link #XR_ERROR_RUNTIME_UNAVAILABLE ERROR_RUNTIME_UNAVAILABLE}</td><td>The loader was unable to find or load a runtime.</td></tr>
     * <tr><td>{@link MSFTSpatialAnchor#XR_ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT}</td><td>Spatial anchor could not be created at that location. (Added by the {@link MSFTSpatialAnchor XR_MSFT_spatial_anchor} extension)</td></tr>
     * <tr><td>{@link MSFTSecondaryViewConfiguration#XR_ERROR_SECONDARY_VIEW_CONFIGURATION_TYPE_NOT_ENABLED_MSFT ERROR_SECONDARY_VIEW_CONFIGURATION_TYPE_NOT_ENABLED_MSFT}</td><td>The secondary view configuration was not enabled when creating the session. (Added by the {@link MSFTSecondaryViewConfiguration XR_MSFT_secondary_view_configuration} extension)</td></tr>
     * <tr><td>{@link MSFTControllerModel#XR_ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT}</td><td>The controller model key is invalid. (Added by the {@link MSFTControllerModel XR_MSFT_controller_model} extension)</td></tr>
     * <tr><td>{@link MSFTCompositionLayerReprojection#XR_ERROR_REPROJECTION_MODE_UNSUPPORTED_MSFT ERROR_REPROJECTION_MODE_UNSUPPORTED_MSFT}</td><td>The reprojection mode is not supported. (Added by the {@link MSFTCompositionLayerReprojection XR_MSFT_composition_layer_reprojection} extension)</td></tr>
     * <tr><td>{@link MSFTSceneUnderstanding#XR_ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT}</td><td>Compute new scene not completed. (Added by the {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension)</td></tr>
     * <tr><td>{@link MSFTSceneUnderstanding#XR_ERROR_SCENE_COMPONENT_ID_INVALID_MSFT ERROR_SCENE_COMPONENT_ID_INVALID_MSFT}</td><td>Scene component id invalid. (Added by the {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension)</td></tr>
     * <tr><td>{@link MSFTSceneUnderstanding#XR_ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT}</td><td>Scene component type mismatch. (Added by the {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension)</td></tr>
     * <tr><td>{@link MSFTSceneUnderstanding#XR_ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT}</td><td>Scene mesh buffer id invalid. (Added by the {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension)</td></tr>
     * <tr><td>{@link MSFTSceneUnderstanding#XR_ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT}</td><td>Scene compute feature incompatible. (Added by the {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension)</td></tr>
     * <tr><td>{@link MSFTSceneUnderstanding#XR_ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT}</td><td>Scene compute consistency mismatch. (Added by the {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension)</td></tr>
     * <tr><td>{@link FBDisplayRefreshRate#XR_ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB}</td><td>The display refresh rate is not supported by the platform. (Added by the {@link FBDisplayRefreshRate XR_FB_display_refresh_rate} extension)</td></tr>
     * <tr><td>{@link FBColorSpace#XR_ERROR_COLOR_SPACE_UNSUPPORTED_FB ERROR_COLOR_SPACE_UNSUPPORTED_FB}</td><td>The color space is not supported by the runtime. (Added by the {@link FBColorSpace XR_FB_color_space} extension)</td></tr>
     * <tr><td>{@link FBPassthrough#XR_ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB}</td><td>The object state is unexpected for the issued command. (Added by the {@link FBPassthrough XR_FB_passthrough} extension)</td></tr>
     * <tr><td>{@link FBPassthrough#XR_ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB}</td><td>Trying to create an MR feature when one was already created and only one instance is allowed. (Added by the {@link FBPassthrough XR_FB_passthrough} extension)</td></tr>
     * <tr><td>{@link FBPassthrough#XR_ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB}</td><td>Requested functionality requires a feature to be created first. (Added by the {@link FBPassthrough XR_FB_passthrough} extension)</td></tr>
     * <tr><td>{@link FBPassthrough#XR_ERROR_NOT_PERMITTED_PASSTHROUGH_FB ERROR_NOT_PERMITTED_PASSTHROUGH_FB}</td><td>Requested functionality is not permitted - application is not allowed to perform the requested operation. (Added by the {@link FBPassthrough XR_FB_passthrough} extension)</td></tr>
     * <tr><td>{@link FBPassthrough#XR_ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB}</td><td>There weren’t sufficient resources available to perform an operation. (Added by the {@link FBPassthrough XR_FB_passthrough} extension)</td></tr>
     * <tr><td>{@link FBPassthrough#XR_ERROR_UNKNOWN_PASSTHROUGH_FB ERROR_UNKNOWN_PASSTHROUGH_FB}</td><td>Unknown Passthrough error (no further details provided). (Added by the {@link FBPassthrough XR_FB_passthrough} extension)</td></tr>
     * <tr><td>{@link FBRenderModel#XR_ERROR_RENDER_MODEL_KEY_INVALID_FB ERROR_RENDER_MODEL_KEY_INVALID_FB}</td><td>The model key is invalid. (Added by the {@link FBRenderModel XR_FB_render_model} extension)</td></tr>
     * <tr><td>{@link VARJOMarkerTracking#XR_ERROR_MARKER_NOT_TRACKED_VARJO ERROR_MARKER_NOT_TRACKED_VARJO}</td><td>Marker tracking is disabled or the specified marker is not currently tracked. (Added by the {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension)</td></tr>
     * <tr><td>{@link VARJOMarkerTracking#XR_ERROR_MARKER_ID_INVALID_VARJO ERROR_MARKER_ID_INVALID_VARJO}</td><td>The specified marker ID is not valid. (Added by the {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension)</td></tr>
     * <tr><td>{@link MSFTSpatialAnchorPersistence#XR_ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT}</td><td>A spatial anchor was not found associated with the spatial anchor name provided (Added by the {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension)</td></tr>
     * <tr><td>{@link MSFTSpatialAnchorPersistence#XR_ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT}</td><td>The spatial anchor name provided was not valid (Added by the {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension)</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrResultToString ResultToString}</p>
     */
    public static final int
        XR_SUCCESS                                   = 0,
        XR_TIMEOUT_EXPIRED                           = 1,
        XR_SESSION_LOSS_PENDING                      = 3,
        XR_EVENT_UNAVAILABLE                         = 4,
        XR_SPACE_BOUNDS_UNAVAILABLE                  = 7,
        XR_SESSION_NOT_FOCUSED                       = 8,
        XR_FRAME_DISCARDED                           = 9,
        XR_ERROR_VALIDATION_FAILURE                  = -1,
        XR_ERROR_RUNTIME_FAILURE                     = -2,
        XR_ERROR_OUT_OF_MEMORY                       = -3,
        XR_ERROR_API_VERSION_UNSUPPORTED             = -4,
        XR_ERROR_INITIALIZATION_FAILED               = -6,
        XR_ERROR_FUNCTION_UNSUPPORTED                = -7,
        XR_ERROR_FEATURE_UNSUPPORTED                 = -8,
        XR_ERROR_EXTENSION_NOT_PRESENT               = -9,
        XR_ERROR_LIMIT_REACHED                       = -10,
        XR_ERROR_SIZE_INSUFFICIENT                   = -11,
        XR_ERROR_HANDLE_INVALID                      = -12,
        XR_ERROR_INSTANCE_LOST                       = -13,
        XR_ERROR_SESSION_RUNNING                     = -14,
        XR_ERROR_SESSION_NOT_RUNNING                 = -16,
        XR_ERROR_SESSION_LOST                        = -17,
        XR_ERROR_SYSTEM_INVALID                      = -18,
        XR_ERROR_PATH_INVALID                        = -19,
        XR_ERROR_PATH_COUNT_EXCEEDED                 = -20,
        XR_ERROR_PATH_FORMAT_INVALID                 = -21,
        XR_ERROR_PATH_UNSUPPORTED                    = -22,
        XR_ERROR_LAYER_INVALID                       = -23,
        XR_ERROR_LAYER_LIMIT_EXCEEDED                = -24,
        XR_ERROR_SWAPCHAIN_RECT_INVALID              = -25,
        XR_ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED        = -26,
        XR_ERROR_ACTION_TYPE_MISMATCH                = -27,
        XR_ERROR_SESSION_NOT_READY                   = -28,
        XR_ERROR_SESSION_NOT_STOPPING                = -29,
        XR_ERROR_TIME_INVALID                        = -30,
        XR_ERROR_REFERENCE_SPACE_UNSUPPORTED         = -31,
        XR_ERROR_FILE_ACCESS_ERROR                   = -32,
        XR_ERROR_FILE_CONTENTS_INVALID               = -33,
        XR_ERROR_FORM_FACTOR_UNSUPPORTED             = -34,
        XR_ERROR_FORM_FACTOR_UNAVAILABLE             = -35,
        XR_ERROR_API_LAYER_NOT_PRESENT               = -36,
        XR_ERROR_CALL_ORDER_INVALID                  = -37,
        XR_ERROR_GRAPHICS_DEVICE_INVALID             = -38,
        XR_ERROR_POSE_INVALID                        = -39,
        XR_ERROR_INDEX_OUT_OF_RANGE                  = -40,
        XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED = -41,
        XR_ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED  = -42,
        XR_ERROR_NAME_DUPLICATED                     = -44,
        XR_ERROR_NAME_INVALID                        = -45,
        XR_ERROR_ACTIONSET_NOT_ATTACHED              = -46,
        XR_ERROR_ACTIONSETS_ALREADY_ATTACHED         = -47,
        XR_ERROR_LOCALIZED_NAME_DUPLICATED           = -48,
        XR_ERROR_LOCALIZED_NAME_INVALID              = -49,
        XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING  = -50,
        XR_ERROR_RUNTIME_UNAVAILABLE                 = -51;

    /**
     * XrStructureType - Values for type members of structs
     * 
     * <h5>Description</h5>
     * 
     * <p>Most structures containing {@code type} members have a value of {@code type} matching the type of the structure, as described more fully in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-types">Valid Usage for Structure Types</a>.</p>
     * 
     * <p>Note that all extension enums begin at the extension enum base of <code>1<sup>10</sup></code> (base 10). Each extension is assigned a block of 1000 enums, starting at the enum base and arranged by the extension’s index.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrActionCreateInfo}, {@link XrActionSetCreateInfo}, {@link XrActionSpaceCreateInfo}, {@link XrActionStateBoolean}, {@link XrActionStateFloat}, {@link XrActionStateGetInfo}, {@link XrActionStatePose}, {@link XrActionStateVector2f}, {@link XrActionsSyncInfo}, {@link XrApiLayerProperties}, {@link XrBaseInStructure}, {@link XrBaseOutStructure}, {@link XrBindingModificationBaseHeaderKHR}, {@link XrBindingModificationsKHR}, {@link XrBoundSourcesForActionEnumerateInfo}, {@link XrCompositionLayerAlphaBlendFB}, {@link XrCompositionLayerBaseHeader}, {@link XrCompositionLayerColorScaleBiasKHR}, {@link XrCompositionLayerCubeKHR}, {@link XrCompositionLayerCylinderKHR}, {@link XrCompositionLayerDepthInfoKHR}, {@link XrCompositionLayerDepthTestVARJO}, {@link XrCompositionLayerEquirect2KHR}, {@link XrCompositionLayerEquirectKHR}, {@link XrCompositionLayerImageLayoutFB}, {@link XrCompositionLayerPassthroughFB}, {@link XrCompositionLayerProjection}, {@link XrCompositionLayerProjectionView}, {@link XrCompositionLayerQuad}, {@link XrCompositionLayerReprojectionInfoMSFT}, {@link XrCompositionLayerReprojectionPlaneOverrideMSFT}, {@link XrCompositionLayerSecureContentFB}, {@link XrCompositionLayerSpaceWarpInfoFB}, {@link XrControllerModelKeyStateMSFT}, {@link XrControllerModelNodePropertiesMSFT}, {@link XrControllerModelNodeStateMSFT}, {@link XrControllerModelPropertiesMSFT}, {@link XrControllerModelStateMSFT}, {@link XrDebugUtilsLabelEXT}, {@link XrDebugUtilsMessengerCallbackDataEXT}, {@link XrDebugUtilsMessengerCreateInfoEXT}, {@link XrDebugUtilsObjectNameInfoEXT}, {@link XrDigitalLensControlALMALENCE}, {@link XrEventDataBaseHeader}, {@link XrEventDataBuffer}, {@link XrEventDataDisplayRefreshRateChangedFB}, {@link XrEventDataEventsLost}, {@link XrEventDataInstanceLossPending}, {@link XrEventDataInteractionProfileChanged}, {@link XrEventDataMainSessionVisibilityChangedEXTX}, {@link XrEventDataMarkerTrackingUpdateVARJO}, {@link XrEventDataPassthroughStateChangedFB}, {@link XrEventDataPerfSettingsEXT}, {@link XrEventDataReferenceSpaceChangePending}, {@link XrEventDataSessionStateChanged}, {@link XrEventDataVisibilityMaskChangedKHR}, {@link XrEventDataViveTrackerConnectedHTCX}, {@link XrExtensionProperties}, {@link XrEyeGazeSampleTimeEXT}, {@link XrFacialExpressionsHTC}, {@link XrFacialTrackerCreateInfoHTC}, {@link XrFoveatedViewConfigurationViewVARJO}, {@link XrFoveationLevelProfileCreateInfoFB}, {@link XrFoveationProfileCreateInfoFB}, {@link XrFrameBeginInfo}, {@link XrFrameEndInfo}, {@link XrFrameState}, {@link XrFrameWaitInfo}, {@link XrGeometryInstanceCreateInfoFB}, {@link XrGeometryInstanceTransformFB}, {@link XrGraphicsBindingEGLMNDX}, {@link XrGraphicsBindingOpenGLWaylandKHR}, {@link XrGraphicsBindingOpenGLWin32KHR}, {@link XrGraphicsBindingOpenGLXcbKHR}, {@link XrGraphicsBindingOpenGLXlibKHR}, {@link XrGraphicsBindingVulkanKHR}, {@link XrGraphicsRequirementsOpenGLESKHR}, {@link XrGraphicsRequirementsOpenGLKHR}, {@link XrGraphicsRequirementsVulkanKHR}, {@link XrHandJointLocationsEXT}, {@link XrHandJointVelocitiesEXT}, {@link XrHandJointsLocateInfoEXT}, {@link XrHandJointsMotionRangeInfoEXT}, {@link XrHandMeshMSFT}, {@link XrHandMeshSpaceCreateInfoMSFT}, {@link XrHandMeshUpdateInfoMSFT}, {@link XrHandPoseTypeInfoMSFT}, {@link XrHandTrackerCreateInfoEXT}, {@link XrHandTrackingAimStateFB}, {@link XrHandTrackingCapsulesStateFB}, {@link XrHandTrackingMeshFB}, {@link XrHandTrackingScaleFB}, {@link XrHapticActionInfo}, {@link XrHapticBaseHeader}, {@link XrHapticVibration}, {@link XrHolographicWindowAttachmentMSFT}, {@link XrInputSourceLocalizedNameGetInfo}, {@link XrInstanceCreateInfo}, {@link XrInstanceProperties}, {@link XrInteractionProfileAnalogThresholdVALVE}, {@link XrInteractionProfileState}, {@link XrInteractionProfileSuggestedBinding}, {@link XrKeyboardSpaceCreateInfoFB}, {@link XrKeyboardTrackingQueryFB}, {@link XrLoaderInitInfoBaseHeaderKHR}, {@link XrMarkerSpaceCreateInfoVARJO}, {@link XrNewSceneComputeInfoMSFT}, {@link XrPassthroughColorMapMonoToMonoFB}, {@link XrPassthroughColorMapMonoToRgbaFB}, {@link XrPassthroughCreateInfoFB}, {@link XrPassthroughKeyboardHandsIntensityFB}, {@link XrPassthroughLayerCreateInfoFB}, {@link XrPassthroughStyleFB}, {@link XrReferenceSpaceCreateInfo}, {@link XrRenderModelBufferFB}, {@link XrRenderModelLoadInfoFB}, {@link XrRenderModelPathInfoFB}, {@link XrRenderModelPropertiesFB}, {@link XrSceneComponentLocationsMSFT}, {@link XrSceneComponentParentFilterInfoMSFT}, {@link XrSceneComponentsGetInfoMSFT}, {@link XrSceneComponentsLocateInfoMSFT}, {@link XrSceneComponentsMSFT}, {@link XrSceneCreateInfoMSFT}, {@link XrSceneDeserializeInfoMSFT}, {@link XrSceneMeshBuffersGetInfoMSFT}, {@link XrSceneMeshBuffersMSFT}, {@link XrSceneMeshIndicesUint16MSFT}, {@link XrSceneMeshIndicesUint32MSFT}, {@link XrSceneMeshVertexBufferMSFT}, {@link XrSceneMeshesMSFT}, {@link XrSceneObjectTypesFilterInfoMSFT}, {@link XrSceneObjectsMSFT}, {@link XrSceneObserverCreateInfoMSFT}, {@link XrScenePlaneAlignmentFilterInfoMSFT}, {@link XrScenePlanesMSFT}, {@link XrSecondaryViewConfigurationFrameEndInfoMSFT}, {@link XrSecondaryViewConfigurationFrameStateMSFT}, {@link XrSecondaryViewConfigurationLayerInfoMSFT}, {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT}, {@link XrSecondaryViewConfigurationStateMSFT}, {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT}, {@link XrSerializedSceneFragmentDataGetInfoMSFT}, {@link XrSessionActionSetsAttachInfo}, {@link XrSessionBeginInfo}, {@link XrSessionCreateInfo}, {@link XrSessionCreateInfoOverlayEXTX}, {@link XrSpaceLocation}, {@link XrSpaceVelocity}, {@link XrSpatialAnchorCreateInfoMSFT}, {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT}, {@link XrSpatialAnchorPersistenceInfoMSFT}, {@link XrSpatialAnchorSpaceCreateInfoMSFT}, {@link XrSpatialGraphNodeSpaceCreateInfoMSFT}, {@link XrSwapchainCreateInfo}, {@link XrSwapchainCreateInfoFoveationFB}, {@link XrSwapchainImageAcquireInfo}, {@link XrSwapchainImageBaseHeader}, {@link XrSwapchainImageFoveationVulkanFB}, {@link XrSwapchainImageOpenGLESKHR}, {@link XrSwapchainImageOpenGLKHR}, {@link XrSwapchainImageReleaseInfo}, {@link XrSwapchainImageVulkanKHR}, {@link XrSwapchainImageWaitInfo}, {@link XrSwapchainStateBaseHeaderFB}, {@link XrSwapchainStateFoveationFB}, {@link XrSwapchainStateSamplerOpenGLESFB}, {@link XrSwapchainStateSamplerVulkanFB}, {@link XrSystemColorSpacePropertiesFB}, {@link XrSystemEyeGazeInteractionPropertiesEXT}, {@link XrSystemFacialTrackingPropertiesHTC}, {@link XrSystemFoveatedRenderingPropertiesVARJO}, {@link XrSystemGetInfo}, {@link XrSystemHandTrackingMeshPropertiesMSFT}, {@link XrSystemHandTrackingPropertiesEXT}, {@link XrSystemKeyboardTrackingPropertiesFB}, {@link XrSystemMarkerTrackingPropertiesVARJO}, {@link XrSystemPassthroughPropertiesFB}, {@link XrSystemProperties}, {@link XrSystemRenderModelPropertiesFB}, {@link XrSystemSpaceWarpPropertiesFB}, {@link XrTriangleMeshCreateInfoFB}, {@link XrView}, {@link XrViewConfigurationDepthRangeEXT}, {@link XrViewConfigurationProperties}, {@link XrViewConfigurationView}, {@link XrViewConfigurationViewFovEPIC}, {@link XrViewLocateFoveatedRenderingVARJO}, {@link XrViewLocateInfo}, {@link XrViewState}, {@link XrVisibilityMaskKHR}, {@link XrVisualMeshComputeLodInfoMSFT}, {@link XrViveTrackerPathsHTCX}, {@link XrVulkanDeviceCreateInfoKHR}, {@link XrVulkanGraphicsDeviceGetInfoKHR}, {@link XrVulkanInstanceCreateInfoKHR}, {@link XrVulkanSwapchainFormatListCreateInfoKHR}, {@link #xrStructureTypeToString StructureTypeToString}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_UNKNOWN TYPE_UNKNOWN}</li>
     * <li>{@link #XR_TYPE_API_LAYER_PROPERTIES TYPE_API_LAYER_PROPERTIES}</li>
     * <li>{@link #XR_TYPE_EXTENSION_PROPERTIES TYPE_EXTENSION_PROPERTIES}</li>
     * <li>{@link #XR_TYPE_INSTANCE_CREATE_INFO TYPE_INSTANCE_CREATE_INFO}</li>
     * <li>{@link #XR_TYPE_SYSTEM_GET_INFO TYPE_SYSTEM_GET_INFO}</li>
     * <li>{@link #XR_TYPE_SYSTEM_PROPERTIES TYPE_SYSTEM_PROPERTIES}</li>
     * <li>{@link #XR_TYPE_VIEW_LOCATE_INFO TYPE_VIEW_LOCATE_INFO}</li>
     * <li>{@link #XR_TYPE_VIEW TYPE_VIEW}</li>
     * <li>{@link #XR_TYPE_SESSION_CREATE_INFO TYPE_SESSION_CREATE_INFO}</li>
     * <li>{@link #XR_TYPE_SWAPCHAIN_CREATE_INFO TYPE_SWAPCHAIN_CREATE_INFO}</li>
     * <li>{@link #XR_TYPE_SESSION_BEGIN_INFO TYPE_SESSION_BEGIN_INFO}</li>
     * <li>{@link #XR_TYPE_VIEW_STATE TYPE_VIEW_STATE}</li>
     * <li>{@link #XR_TYPE_FRAME_END_INFO TYPE_FRAME_END_INFO}</li>
     * <li>{@link #XR_TYPE_HAPTIC_VIBRATION TYPE_HAPTIC_VIBRATION}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_BUFFER TYPE_EVENT_DATA_BUFFER}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_SESSION_STATE_CHANGED TYPE_EVENT_DATA_SESSION_STATE_CHANGED}</li>
     * <li>{@link #XR_TYPE_ACTION_STATE_BOOLEAN TYPE_ACTION_STATE_BOOLEAN}</li>
     * <li>{@link #XR_TYPE_ACTION_STATE_FLOAT TYPE_ACTION_STATE_FLOAT}</li>
     * <li>{@link #XR_TYPE_ACTION_STATE_VECTOR2F TYPE_ACTION_STATE_VECTOR2F}</li>
     * <li>{@link #XR_TYPE_ACTION_STATE_POSE TYPE_ACTION_STATE_POSE}</li>
     * <li>{@link #XR_TYPE_ACTION_SET_CREATE_INFO TYPE_ACTION_SET_CREATE_INFO}</li>
     * <li>{@link #XR_TYPE_ACTION_CREATE_INFO TYPE_ACTION_CREATE_INFO}</li>
     * <li>{@link #XR_TYPE_INSTANCE_PROPERTIES TYPE_INSTANCE_PROPERTIES}</li>
     * <li>{@link #XR_TYPE_FRAME_WAIT_INFO TYPE_FRAME_WAIT_INFO}</li>
     * <li>{@link #XR_TYPE_COMPOSITION_LAYER_PROJECTION TYPE_COMPOSITION_LAYER_PROJECTION}</li>
     * <li>{@link #XR_TYPE_COMPOSITION_LAYER_QUAD TYPE_COMPOSITION_LAYER_QUAD}</li>
     * <li>{@link #XR_TYPE_REFERENCE_SPACE_CREATE_INFO TYPE_REFERENCE_SPACE_CREATE_INFO}</li>
     * <li>{@link #XR_TYPE_ACTION_SPACE_CREATE_INFO TYPE_ACTION_SPACE_CREATE_INFO}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING}</li>
     * <li>{@link #XR_TYPE_VIEW_CONFIGURATION_VIEW TYPE_VIEW_CONFIGURATION_VIEW}</li>
     * <li>{@link #XR_TYPE_SPACE_LOCATION TYPE_SPACE_LOCATION}</li>
     * <li>{@link #XR_TYPE_SPACE_VELOCITY TYPE_SPACE_VELOCITY}</li>
     * <li>{@link #XR_TYPE_FRAME_STATE TYPE_FRAME_STATE}</li>
     * <li>{@link #XR_TYPE_VIEW_CONFIGURATION_PROPERTIES TYPE_VIEW_CONFIGURATION_PROPERTIES}</li>
     * <li>{@link #XR_TYPE_FRAME_BEGIN_INFO TYPE_FRAME_BEGIN_INFO}</li>
     * <li>{@link #XR_TYPE_COMPOSITION_LAYER_PROJECTION_VIEW TYPE_COMPOSITION_LAYER_PROJECTION_VIEW}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_EVENTS_LOST TYPE_EVENT_DATA_EVENTS_LOST}</li>
     * <li>{@link #XR_TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED}</li>
     * <li>{@link #XR_TYPE_INTERACTION_PROFILE_STATE TYPE_INTERACTION_PROFILE_STATE}</li>
     * <li>{@link #XR_TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO}</li>
     * <li>{@link #XR_TYPE_SWAPCHAIN_IMAGE_WAIT_INFO TYPE_SWAPCHAIN_IMAGE_WAIT_INFO}</li>
     * <li>{@link #XR_TYPE_SWAPCHAIN_IMAGE_RELEASE_INFO TYPE_SWAPCHAIN_IMAGE_RELEASE_INFO}</li>
     * <li>{@link #XR_TYPE_ACTION_STATE_GET_INFO TYPE_ACTION_STATE_GET_INFO}</li>
     * <li>{@link #XR_TYPE_HAPTIC_ACTION_INFO TYPE_HAPTIC_ACTION_INFO}</li>
     * <li>{@link #XR_TYPE_SESSION_ACTION_SETS_ATTACH_INFO TYPE_SESSION_ACTION_SETS_ATTACH_INFO}</li>
     * <li>{@link #XR_TYPE_ACTIONS_SYNC_INFO TYPE_ACTIONS_SYNC_INFO}</li>
     * <li>{@link #XR_TYPE_BOUND_SOURCES_FOR_ACTION_ENUMERATE_INFO TYPE_BOUND_SOURCES_FOR_ACTION_ENUMERATE_INFO}</li>
     * <li>{@link #XR_TYPE_INPUT_SOURCE_LOCALIZED_NAME_GET_INFO TYPE_INPUT_SOURCE_LOCALIZED_NAME_GET_INFO}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_UNKNOWN                                   = 0,
        XR_TYPE_API_LAYER_PROPERTIES                      = 1,
        XR_TYPE_EXTENSION_PROPERTIES                      = 2,
        XR_TYPE_INSTANCE_CREATE_INFO                      = 3,
        XR_TYPE_SYSTEM_GET_INFO                           = 4,
        XR_TYPE_SYSTEM_PROPERTIES                         = 5,
        XR_TYPE_VIEW_LOCATE_INFO                          = 6,
        XR_TYPE_VIEW                                      = 7,
        XR_TYPE_SESSION_CREATE_INFO                       = 8,
        XR_TYPE_SWAPCHAIN_CREATE_INFO                     = 9,
        XR_TYPE_SESSION_BEGIN_INFO                        = 10,
        XR_TYPE_VIEW_STATE                                = 11,
        XR_TYPE_FRAME_END_INFO                            = 12,
        XR_TYPE_HAPTIC_VIBRATION                          = 13,
        XR_TYPE_EVENT_DATA_BUFFER                         = 16,
        XR_TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING          = 17,
        XR_TYPE_EVENT_DATA_SESSION_STATE_CHANGED          = 18,
        XR_TYPE_ACTION_STATE_BOOLEAN                      = 23,
        XR_TYPE_ACTION_STATE_FLOAT                        = 24,
        XR_TYPE_ACTION_STATE_VECTOR2F                     = 25,
        XR_TYPE_ACTION_STATE_POSE                         = 27,
        XR_TYPE_ACTION_SET_CREATE_INFO                    = 28,
        XR_TYPE_ACTION_CREATE_INFO                        = 29,
        XR_TYPE_INSTANCE_PROPERTIES                       = 32,
        XR_TYPE_FRAME_WAIT_INFO                           = 33,
        XR_TYPE_COMPOSITION_LAYER_PROJECTION              = 35,
        XR_TYPE_COMPOSITION_LAYER_QUAD                    = 36,
        XR_TYPE_REFERENCE_SPACE_CREATE_INFO               = 37,
        XR_TYPE_ACTION_SPACE_CREATE_INFO                  = 38,
        XR_TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING = 40,
        XR_TYPE_VIEW_CONFIGURATION_VIEW                   = 41,
        XR_TYPE_SPACE_LOCATION                            = 42,
        XR_TYPE_SPACE_VELOCITY                            = 43,
        XR_TYPE_FRAME_STATE                               = 44,
        XR_TYPE_VIEW_CONFIGURATION_PROPERTIES             = 45,
        XR_TYPE_FRAME_BEGIN_INFO                          = 46,
        XR_TYPE_COMPOSITION_LAYER_PROJECTION_VIEW         = 48,
        XR_TYPE_EVENT_DATA_EVENTS_LOST                    = 49,
        XR_TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING     = 51,
        XR_TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED    = 52,
        XR_TYPE_INTERACTION_PROFILE_STATE                 = 53,
        XR_TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO              = 55,
        XR_TYPE_SWAPCHAIN_IMAGE_WAIT_INFO                 = 56,
        XR_TYPE_SWAPCHAIN_IMAGE_RELEASE_INFO              = 57,
        XR_TYPE_ACTION_STATE_GET_INFO                     = 58,
        XR_TYPE_HAPTIC_ACTION_INFO                        = 59,
        XR_TYPE_SESSION_ACTION_SETS_ATTACH_INFO           = 60,
        XR_TYPE_ACTIONS_SYNC_INFO                         = 61,
        XR_TYPE_BOUND_SOURCES_FOR_ACTION_ENUMERATE_INFO   = 62,
        XR_TYPE_INPUT_SOURCE_LOCALIZED_NAME_GET_INFO      = 63;

    /**
     * XrFormFactor - Supported form factors
     * 
     * <h5>Description</h5>
     * 
     * <p>The predefined form factors which <b>may</b> be supported by OpenXR runtimes are:</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_FORM_FACTOR_HEAD_MOUNTED_DISPLAY FORM_FACTOR_HEAD_MOUNTED_DISPLAY}. The tracked display is attached to the user’s head. The user cannot touch the display itself. A VR headset would be an example of this form factor.</li>
     * <li>{@link #XR_FORM_FACTOR_HANDHELD_DISPLAY FORM_FACTOR_HANDHELD_DISPLAY}. The tracked display is held in the user’s hand, independent from the user’s head. The user <b>may</b> be able to touch the display, allowing for screen-space UI. A mobile phone running an AR experience using pass-through video would be an example of this form factor.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #XR_NULL_SYSTEM_ID NULL_SYSTEM_ID}, {@link XrSystemGetInfo}, {@link #xrGetSystem GetSystem}</p>
     */
    public static final int
        XR_FORM_FACTOR_HEAD_MOUNTED_DISPLAY = 1,
        XR_FORM_FACTOR_HANDHELD_DISPLAY     = 2;

    /**
     * XrViewConfigurationType - Supported view configuration type
     * 
     * <h5>Description</h5>
     * 
     * <p>The application selects its primary view configuration type when calling {@link #xrBeginSession BeginSession}, and that configuration remains constant for the lifetime of the session, until {@link #xrEndSession EndSession} is called.</p>
     * 
     * <p>The number of views and the semantic meaning of each view index within a given view configuration is well-defined, specified below for all core view configurations. The predefined primary view configuration types are:</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_VIEW_CONFIGURATION_TYPE_PRIMARY_MONO VIEW_CONFIGURATION_TYPE_PRIMARY_MONO}. One view representing the form factor’s one primary display. For example, an AR phone’s screen. This configuration requires one element in {@link XrViewConfigurationProperties} and one projection in each {@link XrCompositionLayerProjection} layer.</li>
     * <li>{@link #XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO}. Two views representing the form factor’s two primary displays, which map to a left-eye and right-eye view. This configuration requires two views in {@link XrViewConfigurationProperties} and two views in each {@link XrCompositionLayerProjection} layer. View index 0 <b>must</b> represent the left eye and view index 1 <b>must</b> represent the right eye.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEventDataVisibilityMaskChangedKHR}, {@link XrSecondaryViewConfigurationLayerInfoMSFT}, {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT}, {@link XrSecondaryViewConfigurationStateMSFT}, {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT}, {@link XrSessionBeginInfo}, {@link XrViewConfigurationProperties}, {@link XrViewLocateInfo}, {@link #xrEnumerateEnvironmentBlendModes EnumerateEnvironmentBlendModes}, {@link MSFTCompositionLayerReprojection#xrEnumerateReprojectionModesMSFT EnumerateReprojectionModesMSFT}, {@link #xrEnumerateViewConfigurationViews EnumerateViewConfigurationViews}, {@link #xrEnumerateViewConfigurations EnumerateViewConfigurations}, {@link #xrGetViewConfigurationProperties GetViewConfigurationProperties}, {@link KHRVisibilityMask#xrGetVisibilityMaskKHR GetVisibilityMaskKHR}</p>
     */
    public static final int
        XR_VIEW_CONFIGURATION_TYPE_PRIMARY_MONO   = 1,
        XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO = 2;

    /**
     * XrEnvironmentBlendMode - Environment blend modes
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_ENVIRONMENT_BLEND_MODE_OPAQUE ENVIRONMENT_BLEND_MODE_OPAQUE}. The composition layers will be displayed with no view of the physical world behind them. The composited image will be interpreted as an RGB image, ignoring the composited alpha channel. This is the typical mode for VR experiences, although this mode can also be supported on devices that support video passthrough.</li>
     * <li>{@link #XR_ENVIRONMENT_BLEND_MODE_ADDITIVE ENVIRONMENT_BLEND_MODE_ADDITIVE}. The composition layers will be additively blended with the real world behind the display. The composited image will be interpreted as an RGB image, ignoring the composited alpha channel during the additive blending. This will cause black composited pixels to appear transparent. This is the typical mode for an AR experience on a see-through headset with an additive display, although this mode can also be supported on devices that support video passthrough.</li>
     * <li>{@link #XR_ENVIRONMENT_BLEND_MODE_ALPHA_BLEND ENVIRONMENT_BLEND_MODE_ALPHA_BLEND}. The composition layers will be alpha-blended with the real world behind the display. The composited image will be interpreted as an RGBA image, with the composited alpha channel determining each pixel’s level of blending with the real world behind the display. This is the typical mode for an AR experience on a phone or headset that supports video passthrough.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFrameEndInfo}, {@link XrSecondaryViewConfigurationLayerInfoMSFT}, {@link #xrEnumerateEnvironmentBlendModes EnumerateEnvironmentBlendModes}</p>
     */
    public static final int
        XR_ENVIRONMENT_BLEND_MODE_OPAQUE      = 1,
        XR_ENVIRONMENT_BLEND_MODE_ADDITIVE    = 2,
        XR_ENVIRONMENT_BLEND_MODE_ALPHA_BLEND = 3;

    /**
     * XrSpaceVelocityFlagBits
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_SPACE_VELOCITY_LINEAR_VALID_BIT SPACE_VELOCITY_LINEAR_VALID_BIT}</li>
     * <li>{@link #XR_SPACE_VELOCITY_ANGULAR_VALID_BIT SPACE_VELOCITY_ANGULAR_VALID_BIT}</li>
     * </ul>
     */
    public static final int
        XR_SPACE_VELOCITY_LINEAR_VALID_BIT  = 0x1,
        XR_SPACE_VELOCITY_ANGULAR_VALID_BIT = 0x2;

    /**
     * XrReferenceSpaceType - Reference space types
     * 
     * <h5>Description</h5>
     * 
     * <p>Available reference space types are indicated by {@link #xrEnumerateReferenceSpaces EnumerateReferenceSpaces}. Note that other spaces can be created as well, such as pose action spaces created by {@link #xrCreateActionSpace CreateActionSpace}, which are not enumerated by that API.</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_REFERENCE_SPACE_TYPE_VIEW REFERENCE_SPACE_TYPE_VIEW}. The {@code VIEW} space tracks the view origin used to generate view transforms for the primary viewer (or centroid of view origins if stereo), with +Y up, +X to the right, and -Z forward. This space points in the forward direction for the viewer without incorporating the user’s eye orientation, and is not gravity-aligned.
     * {@code VIEW} space is primarily useful when projecting from the user’s perspective into another space to obtain a targeting ray, or when rendering small head-locked content such as a reticle. Content rendered in {@code VIEW} space will stay at a fixed point on head-mounted displays and may be uncomfortable to view if too large. To obtain the ideal view and projection transforms to use each frame for rendering world content, applications should call {@link #xrLocateViews LocateViews} instead of using this space.
     * 
     * <p>Runtimes <b>must</b> support this reference space.</p>
     * </li>
     * <li>{@link #XR_REFERENCE_SPACE_TYPE_LOCAL REFERENCE_SPACE_TYPE_LOCAL}. The {@code LOCAL} reference space establishes a world-locked origin, gravity-aligned to exclude pitch and roll, with +Y up, +X to the right, and -Z forward. This space locks in both its initial position and orientation, which the runtime <b>may</b> define to be either the initial position at application launch or some other calibrated zero position.
     * {@code LOCAL} space is useful when an application needs to render <b>seated-scale</b> content that is not positioned relative to the physical floor.
     * 
     * <p>When a user needs to recenter {@code LOCAL} space, a runtime <b>may</b> offer some system-level recentering interaction that is transparent to the application, but which causes the current leveled head space to become the new {@code LOCAL} space. When such a recentering occurs, the runtime <b>must</b> queue the {@link XrEventDataReferenceSpaceChangePending} event, with the recentered {@code LOCAL} space origin only taking effect for {@link #xrLocateSpace LocateSpace} or {@link #xrLocateViews LocateViews} calls whose {@code XrTime} parameter is greater than or equal to the {@code changeTime} provided in that event.</p>
     * 
     * <p>When views, controllers or other spaces experience tracking loss relative to the {@code LOCAL} space, runtimes <b>should</b> continue to provide inferred or last-known {@code position} and {@code orientation} values. These inferred poses can, for example, be based on neck model updates, inertial dead reckoning, or a last-known position, so long as it is still reasonable for the application to use that pose. While a runtime is providing position data, it <b>must</b> continue to set {@link #XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} and {@link #XR_VIEW_STATE_POSITION_VALID_BIT VIEW_STATE_POSITION_VALID_BIT} but it <b>can</b> clear {@link #XR_SPACE_LOCATION_POSITION_TRACKED_BIT SPACE_LOCATION_POSITION_TRACKED_BIT} and {@link #XR_VIEW_STATE_POSITION_TRACKED_BIT VIEW_STATE_POSITION_TRACKED_BIT} to indicate that the position is inferred or last-known in this way.</p>
     * 
     * <p>When tracking is recovered, runtimes <b>should</b> snap the pose of other spaces back into position relative to the {@code LOCAL} space’s original origin.</p>
     * 
     * <p>Runtimes <b>must</b> support this reference space.</p>
     * </li>
     * <li>{@link #XR_REFERENCE_SPACE_TYPE_STAGE REFERENCE_SPACE_TYPE_STAGE}. The {@code STAGE} reference space is a runtime-defined flat, rectangular space that is empty and can be walked around on. The origin is on the floor at the center of the rectangle, with +Y up, and the X and Z axes aligned with the rectangle edges. The runtime <b>may</b> not be able to locate spaces relative to the {@code STAGE} reference space if the user has not yet defined one within the runtime-specific UI. Applications can use {@link #xrGetReferenceSpaceBoundsRect GetReferenceSpaceBoundsRect} to determine the extents of the {@code STAGE} reference space’s XZ bounds rectangle, if defined.
     * {@code STAGE} space is useful when an application needs to render <b>standing-scale</b> content (no bounds) or <b>room-scale</b> content (with bounds) that is relative to the physical floor.
     * 
     * <p>When the user redefines the origin or bounds of the current {@code STAGE} space, or the runtime otherwise switches to a new {@code STAGE} definition, the runtime <b>must</b> queue the {@link XrEventDataReferenceSpaceChangePending} event, with the new {@code STAGE} space origin only taking effect for {@link #xrLocateSpace LocateSpace} or {@link #xrLocateViews LocateViews} calls whose {@code XrTime} parameter is greater than or equal to the {@code changeTime} provided in that event.</p>
     * 
     * <p>When views, controllers or other spaces experience tracking loss relative to the {@code STAGE} space, runtimes <b>should</b> continue to provide inferred or last-known {@code position} and {@code orientation} values. These inferred poses can, for example, be based on neck model updates, inertial dead reckoning, or a last-known position, so long as it is still reasonable for the application to use that pose. While a runtime is providing position data, it <b>must</b> continue to set {@link #XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} and {@link #XR_VIEW_STATE_POSITION_VALID_BIT VIEW_STATE_POSITION_VALID_BIT} but it <b>can</b> clear {@link #XR_SPACE_LOCATION_POSITION_TRACKED_BIT SPACE_LOCATION_POSITION_TRACKED_BIT} and {@link #XR_VIEW_STATE_POSITION_TRACKED_BIT VIEW_STATE_POSITION_TRACKED_BIT} to indicate that the position is inferred or last-known in this way.</p>
     * 
     * <p>When tracking is recovered, runtimes <b>should</b> snap the pose of other spaces back into position relative to the {@code STAGE} space’s original origin.</p>
     * </li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEventDataReferenceSpaceChangePending}, {@link XrReferenceSpaceCreateInfo}, {@link #xrEnumerateReferenceSpaces EnumerateReferenceSpaces}, {@link #xrGetReferenceSpaceBoundsRect GetReferenceSpaceBoundsRect}</p>
     */
    public static final int
        XR_REFERENCE_SPACE_TYPE_VIEW  = 1,
        XR_REFERENCE_SPACE_TYPE_LOCAL = 2,
        XR_REFERENCE_SPACE_TYPE_STAGE = 3;

    /**
     * XrSpaceLocationFlagBits
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_SPACE_LOCATION_ORIENTATION_VALID_BIT SPACE_LOCATION_ORIENTATION_VALID_BIT}</li>
     * <li>{@link #XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT}</li>
     * <li>{@link #XR_SPACE_LOCATION_ORIENTATION_TRACKED_BIT SPACE_LOCATION_ORIENTATION_TRACKED_BIT}</li>
     * <li>{@link #XR_SPACE_LOCATION_POSITION_TRACKED_BIT SPACE_LOCATION_POSITION_TRACKED_BIT}</li>
     * </ul>
     */
    public static final int
        XR_SPACE_LOCATION_ORIENTATION_VALID_BIT   = 0x1,
        XR_SPACE_LOCATION_POSITION_VALID_BIT      = 0x2,
        XR_SPACE_LOCATION_ORIENTATION_TRACKED_BIT = 0x4,
        XR_SPACE_LOCATION_POSITION_TRACKED_BIT    = 0x8;

    /**
     * XrSwapchainCreateFlagBits
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_SWAPCHAIN_CREATE_PROTECTED_CONTENT_BIT SWAPCHAIN_CREATE_PROTECTED_CONTENT_BIT}</li>
     * <li>{@link #XR_SWAPCHAIN_CREATE_STATIC_IMAGE_BIT SWAPCHAIN_CREATE_STATIC_IMAGE_BIT}</li>
     * </ul>
     */
    public static final int
        XR_SWAPCHAIN_CREATE_PROTECTED_CONTENT_BIT = 0x1,
        XR_SWAPCHAIN_CREATE_STATIC_IMAGE_BIT      = 0x2;

    /**
     * XrSwapchainUsageFlagBits
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_SWAPCHAIN_USAGE_COLOR_ATTACHMENT_BIT SWAPCHAIN_USAGE_COLOR_ATTACHMENT_BIT}</li>
     * <li>{@link #XR_SWAPCHAIN_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT SWAPCHAIN_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
     * <li>{@link #XR_SWAPCHAIN_USAGE_UNORDERED_ACCESS_BIT SWAPCHAIN_USAGE_UNORDERED_ACCESS_BIT}</li>
     * <li>{@link #XR_SWAPCHAIN_USAGE_TRANSFER_SRC_BIT SWAPCHAIN_USAGE_TRANSFER_SRC_BIT}</li>
     * <li>{@link #XR_SWAPCHAIN_USAGE_TRANSFER_DST_BIT SWAPCHAIN_USAGE_TRANSFER_DST_BIT}</li>
     * <li>{@link #XR_SWAPCHAIN_USAGE_SAMPLED_BIT SWAPCHAIN_USAGE_SAMPLED_BIT}</li>
     * <li>{@link #XR_SWAPCHAIN_USAGE_MUTABLE_FORMAT_BIT SWAPCHAIN_USAGE_MUTABLE_FORMAT_BIT}</li>
     * </ul>
     */
    public static final int
        XR_SWAPCHAIN_USAGE_COLOR_ATTACHMENT_BIT         = 0x1,
        XR_SWAPCHAIN_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x2,
        XR_SWAPCHAIN_USAGE_UNORDERED_ACCESS_BIT         = 0x4,
        XR_SWAPCHAIN_USAGE_TRANSFER_SRC_BIT             = 0x8,
        XR_SWAPCHAIN_USAGE_TRANSFER_DST_BIT             = 0x10,
        XR_SWAPCHAIN_USAGE_SAMPLED_BIT                  = 0x20,
        XR_SWAPCHAIN_USAGE_MUTABLE_FORMAT_BIT           = 0x40;

    /**
     * XrCompositionLayerFlagBits
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_COMPOSITION_LAYER_CORRECT_CHROMATIC_ABERRATION_BIT COMPOSITION_LAYER_CORRECT_CHROMATIC_ABERRATION_BIT}</li>
     * <li>{@link #XR_COMPOSITION_LAYER_BLEND_TEXTURE_SOURCE_ALPHA_BIT COMPOSITION_LAYER_BLEND_TEXTURE_SOURCE_ALPHA_BIT}</li>
     * <li>{@link #XR_COMPOSITION_LAYER_UNPREMULTIPLIED_ALPHA_BIT COMPOSITION_LAYER_UNPREMULTIPLIED_ALPHA_BIT}</li>
     * </ul>
     */
    public static final int
        XR_COMPOSITION_LAYER_CORRECT_CHROMATIC_ABERRATION_BIT = 0x1,
        XR_COMPOSITION_LAYER_BLEND_TEXTURE_SOURCE_ALPHA_BIT   = 0x2,
        XR_COMPOSITION_LAYER_UNPREMULTIPLIED_ALPHA_BIT        = 0x4;

    /**
     * XrViewStateFlagBits
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_VIEW_STATE_ORIENTATION_VALID_BIT VIEW_STATE_ORIENTATION_VALID_BIT}</li>
     * <li>{@link #XR_VIEW_STATE_POSITION_VALID_BIT VIEW_STATE_POSITION_VALID_BIT}</li>
     * <li>{@link #XR_VIEW_STATE_ORIENTATION_TRACKED_BIT VIEW_STATE_ORIENTATION_TRACKED_BIT}</li>
     * <li>{@link #XR_VIEW_STATE_POSITION_TRACKED_BIT VIEW_STATE_POSITION_TRACKED_BIT}</li>
     * </ul>
     */
    public static final int
        XR_VIEW_STATE_ORIENTATION_VALID_BIT   = 0x1,
        XR_VIEW_STATE_POSITION_VALID_BIT      = 0x2,
        XR_VIEW_STATE_ORIENTATION_TRACKED_BIT = 0x4,
        XR_VIEW_STATE_POSITION_TRACKED_BIT    = 0x8;

    /**
     * XrActionType - XrAction type
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_ACTION_TYPE_BOOLEAN_INPUT ACTION_TYPE_BOOLEAN_INPUT}. The action can be passed to {@link #xrGetActionStateBoolean GetActionStateBoolean} to retrieve a boolean value.</li>
     * <li>{@link #XR_ACTION_TYPE_FLOAT_INPUT ACTION_TYPE_FLOAT_INPUT}. The action can be passed to {@link #xrGetActionStateFloat GetActionStateFloat} to retrieve a float value.</li>
     * <li>{@link #XR_ACTION_TYPE_VECTOR2F_INPUT ACTION_TYPE_VECTOR2F_INPUT}. The action can be passed to {@link #xrGetActionStateVector2f GetActionStateVector2f} to retrieve a 2D float vector.</li>
     * <li>{@link #XR_ACTION_TYPE_POSE_INPUT ACTION_TYPE_POSE_INPUT}. The action can can be passed to {@link #xrCreateActionSpace CreateActionSpace} to create a space.</li>
     * <li>{@link #XR_ACTION_TYPE_VIBRATION_OUTPUT ACTION_TYPE_VIBRATION_OUTPUT}. The action can be passed to {@link #xrApplyHapticFeedback ApplyHapticFeedback} to send a haptic event to the runtime.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrActionCreateInfo}, {@link #xrCreateActionSet CreateActionSet}</p>
     */
    public static final int
        XR_ACTION_TYPE_BOOLEAN_INPUT    = 1,
        XR_ACTION_TYPE_FLOAT_INPUT      = 2,
        XR_ACTION_TYPE_VECTOR2F_INPUT   = 3,
        XR_ACTION_TYPE_POSE_INPUT       = 4,
        XR_ACTION_TYPE_VIBRATION_OUTPUT = 100;

    /**
     * XrInputSourceLocalizedNameFlagBits
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_INPUT_SOURCE_LOCALIZED_NAME_USER_PATH_BIT INPUT_SOURCE_LOCALIZED_NAME_USER_PATH_BIT}</li>
     * <li>{@link #XR_INPUT_SOURCE_LOCALIZED_NAME_INTERACTION_PROFILE_BIT INPUT_SOURCE_LOCALIZED_NAME_INTERACTION_PROFILE_BIT}</li>
     * <li>{@link #XR_INPUT_SOURCE_LOCALIZED_NAME_COMPONENT_BIT INPUT_SOURCE_LOCALIZED_NAME_COMPONENT_BIT}</li>
     * </ul>
     */
    public static final int
        XR_INPUT_SOURCE_LOCALIZED_NAME_USER_PATH_BIT           = 0x1,
        XR_INPUT_SOURCE_LOCALIZED_NAME_INTERACTION_PROFILE_BIT = 0x2,
        XR_INPUT_SOURCE_LOCALIZED_NAME_COMPONENT_BIT           = 0x4;

    /**
     * XrEyeVisibility - Eye visibility selector
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_EYE_VISIBILITY_BOTH EYE_VISIBILITY_BOTH} displays the layer to both eyes.</li>
     * <li>{@link #XR_EYE_VISIBILITY_LEFT EYE_VISIBILITY_LEFT} displays the layer to the viewer’s physical left eye.</li>
     * <li>{@link #XR_EYE_VISIBILITY_RIGHT EYE_VISIBILITY_RIGHT} displays the layer to the viewer’s physical right eye.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrCompositionLayerCubeKHR}, {@link XrCompositionLayerCylinderKHR}, {@link XrCompositionLayerEquirect2KHR}, {@link XrCompositionLayerEquirectKHR}, {@link XrCompositionLayerQuad}</p>
     */
    public static final int
        XR_EYE_VISIBILITY_BOTH  = 0,
        XR_EYE_VISIBILITY_LEFT  = 1,
        XR_EYE_VISIBILITY_RIGHT = 2;

    /**
     * XrSessionState - Session lifecycle state
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_SESSION_STATE_UNKNOWN SESSION_STATE_UNKNOWN}. An unknown state. The runtime <b>must</b> not return this value in an {@link XrEventDataSessionStateChanged} event.</li>
     * <li>{@link #XR_SESSION_STATE_IDLE SESSION_STATE_IDLE}. The initial state after calling {@link #xrCreateSession CreateSession} or returned to after calling {@link #xrEndSession EndSession}.</li>
     * <li>{@link #XR_SESSION_STATE_READY SESSION_STATE_READY}. The application is ready to call {@link #xrBeginSession BeginSession} and <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#sync_frame_loop">sync its frame loop with the runtime.</a></li>
     * <li>{@link #XR_SESSION_STATE_SYNCHRONIZED SESSION_STATE_SYNCHRONIZED}. The application has synced its frame loop with the runtime but is not visible to the user.</li>
     * <li>{@link #XR_SESSION_STATE_VISIBLE SESSION_STATE_VISIBLE}. The application has <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#sync_frame_loop">synced its frame loop with the runtime</a> and is visible to the user but cannot receive XR input.</li>
     * <li>{@link #XR_SESSION_STATE_FOCUSED SESSION_STATE_FOCUSED}. The application has <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#sync_frame_loop">synced its frame loop with the runtime</a>, is visible to the user and can receive XR input.</li>
     * <li>{@link #XR_SESSION_STATE_STOPPING SESSION_STATE_STOPPING}. The application should exit its frame loop and call {@link #xrEndSession EndSession}.</li>
     * <li>{@link #XR_SESSION_STATE_LOSS_PENDING SESSION_STATE_LOSS_PENDING}. The session is in the process of being lost. The application should destroy the current session and can optionally recreate it.</li>
     * <li>{@link #XR_SESSION_STATE_EXITING SESSION_STATE_EXITING}. The application should end its XR experience and not automatically restart it.</li>
     * </ul>
     * 
     * <p>The {@link #XR_SESSION_STATE_UNKNOWN SESSION_STATE_UNKNOWN} state <b>must</b> not be returned by the runtime, and is only defined to avoid 0 being a valid state.</p>
     * 
     * <p>Receiving the {@link #XR_SESSION_STATE_IDLE SESSION_STATE_IDLE} state indicates that the runtime considers the session is idle. Applications in this state <b>should</b> minimize resource consumption but continue to call {@link #xrPollEvent PollEvent} at some reasonable cadence.</p>
     * 
     * <p>Receiving the {@link #XR_SESSION_STATE_READY SESSION_STATE_READY} state indicates that the runtime desires the application to prepare rendering resources, begin its session and synchronize its frame loop with the runtime. The application does this by successfully calling {@link #xrBeginSession BeginSession} and then running its frame loop by calling {@link #xrWaitFrame WaitFrame}, {@link #xrBeginFrame BeginFrame} and {@link #xrEndFrame EndFrame} in a loop. If the runtime wishes to return the session to the {@link #XR_SESSION_STATE_IDLE SESSION_STATE_IDLE} state, it <b>must</b> wait until the application calls {@link #xrBeginSession BeginSession}. After returning from the {@link #xrBeginSession BeginSession} call, the runtime may then immediately transition forward through the {@link #XR_SESSION_STATE_SYNCHRONIZED SESSION_STATE_SYNCHRONIZED} state to the {@link #XR_SESSION_STATE_STOPPING SESSION_STATE_STOPPING} state, to request that the application end this session. If the system supports a user engagement sensor and runtime is in {@link #XR_SESSION_STATE_IDLE SESSION_STATE_IDLE} state, the runtime <b>should</b> not transition to the {@link #XR_SESSION_STATE_READY SESSION_STATE_READY} state until the user starts engaging with the device.</p>
     * 
     * <p>Receiving the {@link #XR_SESSION_STATE_SYNCHRONIZED SESSION_STATE_SYNCHRONIZED} state indicates that the application has <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#sync_frame_loop">synchronized its frame loop with the runtime</a>, but its frames are not visible to the user. The application <b>should</b> continue running its frame loop by calling {@link #xrWaitFrame WaitFrame}, {@link #xrBeginFrame BeginFrame} and {@link #xrEndFrame EndFrame}, although it should avoid heavy GPU work so that other visible applications can take CPU and GPU precedence. The application can save resources here by skipping rendering and not submitting any composition layers until {@link #xrWaitFrame WaitFrame} returns an {@link XrFrameState} with {@code shouldRender} set to true. A runtime <b>may</b> use this frame synchronization to facilitate seamless switching from a previous XR application to this application on a frame boundary.</p>
     * 
     * <p>Receiving the {@link #XR_SESSION_STATE_VISIBLE SESSION_STATE_VISIBLE} state indicates that the application has <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#sync_frame_loop">synchronized its frame loop with the runtime</a>, and the session’s frames will be visible to the user, but the session is not eligible to receive XR input. An application may be visible but not have focus, for example when the runtime is composing a modal pop-up on top of the application’s rendered frames. The application <b>should</b> continue running its frame loop, rendering and submitting its composition layers, although it may wish to pause its experience, as users cannot interact with the application at this time. It is important for applications to continue rendering when visible, even when they do not have focus, so the user continues to see something reasonable underneath modal pop-ups. Runtimes <b>should</b> make input actions inactive while the application is unfocused, and applications should react to an inactive input action by skipping rendering of that action’s input avatar (depictions of hands or other tracked objects controlled by the user).</p>
     * 
     * <p>Receiving the {@link #XR_SESSION_STATE_FOCUSED SESSION_STATE_FOCUSED} state indicates that the application has <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#sync_frame_loop">synchronized its frame loop with the runtime</a>, the session’s frames will be visible to the user, and the session is eligible to receive XR input. The runtime <b>should</b> only give one session XR input focus at any given time. The application <b>should</b> be running its frame loop, rendering and submitting composition layers, including input avatars (depictions of hands or other tracked objects controlled by the user) for any input actions that are active. The runtime <b>should</b> avoid rendering its own input avatars when an application is focused, unless input from a given source is being captured by the runtime at the moment.</p>
     * 
     * <p>Receiving the {@link #XR_SESSION_STATE_STOPPING SESSION_STATE_STOPPING} state indicates that the runtime has determined that the application should halt its rendering loop. Applications <b>should</b> exit their rendering loop and call {@link #xrEndSession EndSession} when in this state. A possible reason for this would be to minimize contention between multiple applications. If the system supports a user engagement sensor and the session is running, the runtime <b>should</b> transition to the {@link #XR_SESSION_STATE_STOPPING SESSION_STATE_STOPPING} state when the user stops engaging with the device.</p>
     * 
     * <p>Receiving the {@link #XR_SESSION_STATE_EXITING SESSION_STATE_EXITING} state indicates the runtime wishes the application to terminate its XR experience, typically due to a user request via a runtime user interface. Applications <b>should</b> gracefully end their process when in this state if they do not have a non-XR user experience.</p>
     * 
     * <p>Receiving the {@link #XR_SESSION_STATE_LOSS_PENDING SESSION_STATE_LOSS_PENDING} state indicates the runtime is no longer able to operate with the current session, for example due to the loss of a display hardware connection. An application <b>should</b> call {@link #xrDestroySession DestroySession} and <b>may</b> end its process or decide to poll {@link #xrGetSystem GetSystem} at some reasonable cadence to get a new {@code XrSystemId}, and re-initialize all graphics resources related to the new system, and then create a new session using {@link #xrCreateSession CreateSession}. After the event is queued, subsequent calls to functions that accept {@code XrSession} parameters <b>must</b> no longer return any success code other than {@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING} for the given {@code XrSession} handle. The {@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING} success result is returned for an unspecified grace period of time, and the functions that return it simulate success in their behavior. If the runtime has no reasonable way to successfully complete a given function (e.g. {@link #xrCreateSwapchain CreateSwapchain}) when a lost session is pending, or if the runtime is not able to provide the application a grace period, the runtime <b>may</b> return {@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}. Thereafter, functions which accept {@code XrSession} parameters for the lost session <b>may</b> return {@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST} to indicate that the function failed and the given session was lost. The {@code XrSession} handle and child handles are henceforth unusable and <b>should</b> be destroyed by the application in order to immediately free up resources associated with those handles.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEventDataSessionStateChanged}, {@link #xrPollEvent PollEvent}</p>
     */
    public static final int
        XR_SESSION_STATE_UNKNOWN      = 0,
        XR_SESSION_STATE_IDLE         = 1,
        XR_SESSION_STATE_READY        = 2,
        XR_SESSION_STATE_SYNCHRONIZED = 3,
        XR_SESSION_STATE_VISIBLE      = 4,
        XR_SESSION_STATE_FOCUSED      = 5,
        XR_SESSION_STATE_STOPPING     = 6,
        XR_SESSION_STATE_LOSS_PENDING = 7,
        XR_SESSION_STATE_EXITING      = 8;

    /**
     * XrObjectType - Specify an enumeration to track object handle types
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code XrObjectType} enumeration defines values, each of which corresponds to a specific OpenXR handle type. These values <b>can</b> be used to associate debug information with a particular type of object through one or more extensions.</p>
     * 
     * <p>The following table defines {@code XrObjectType} and OpenXR Handle relationships:</p>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>{@code XrObjectType}</th><th>OpenXR Handle Type</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_OBJECT_TYPE_UNKNOWN OBJECT_TYPE_UNKNOWN}</td><td>Unknown/Undefined Handle</td></tr>
     * <tr><td>{@link #XR_OBJECT_TYPE_INSTANCE OBJECT_TYPE_INSTANCE}</td><td>{@code XrInstance}</td></tr>
     * <tr><td>{@link #XR_OBJECT_TYPE_SESSION OBJECT_TYPE_SESSION}</td><td>{@code XrSession}</td></tr>
     * <tr><td>{@link #XR_OBJECT_TYPE_SWAPCHAIN OBJECT_TYPE_SWAPCHAIN}</td><td>{@code XrSwapchain}</td></tr>
     * <tr><td>{@link #XR_OBJECT_TYPE_SPACE OBJECT_TYPE_SPACE}</td><td>{@code XrSpace}</td></tr>
     * <tr><td>{@link #XR_OBJECT_TYPE_ACTION_SET OBJECT_TYPE_ACTION_SET}</td><td>{@code XrActionSet}</td></tr>
     * <tr><td>{@link #XR_OBJECT_TYPE_ACTION OBJECT_TYPE_ACTION}</td><td>{@code XrAction}</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrDebugUtilsObjectNameInfoEXT}</p>
     */
    public static final int
        XR_OBJECT_TYPE_UNKNOWN    = 0,
        XR_OBJECT_TYPE_INSTANCE   = 1,
        XR_OBJECT_TYPE_SESSION    = 2,
        XR_OBJECT_TYPE_SWAPCHAIN  = 3,
        XR_OBJECT_TYPE_SPACE      = 4,
        XR_OBJECT_TYPE_ACTION_SET = 5,
        XR_OBJECT_TYPE_ACTION     = 6;

    /** OpenXR current version number. */
    public static final long XR_CURRENT_API_VERSION = XR_MAKE_VERSION(1, 0, 20);

    /** Compile-time symbols, ignore. */
    public static final int
        XR_USE_GRAPHICS_API_OPENGL    = 0,
        XR_USE_GRAPHICS_API_OPENGL_ES = 0,
        XR_USE_GRAPHICS_API_VULKAN    = 0,
        XR_USE_PLATFORM_EGL           = 0,
        XR_USE_PLATFORM_WIN32         = 0,
        XR_USE_PLATFORM_XLIB          = 0,
        XR_USE_PLATFORM_XCB           = 0,
        XR_USE_PLATFORM_WAYLAND       = 0;

    /** API Constants */
    public static final long
        XR_NULL_HANDLE         = 0x0L,
        XR_NULL_PATH           = 0x0L,
        XR_NULL_SYSTEM_ID      = 0x0L,
        XR_NO_DURATION         = 0x0L,
        XR_INFINITE_DURATION   = 0x7FFF_FFFF_FFFF_FFFFL,
        XR_MIN_HAPTIC_DURATION = 0xFFFFFFFFFFFFFFFFL,
        XR_MAX_EVENT_DATA_SIZE = XrEventDataBuffer.SIZEOF;

    /** API Constants */
    public static final float XR_FREQUENCY_UNSPECIFIED = 0f;

    /** API Constants */
    public static final int
        XR_TRUE                               = 1,
        XR_FALSE                              = 0,
        XR_MAX_EXTENSION_NAME_SIZE            = 128,
        XR_MAX_API_LAYER_NAME_SIZE            = 256,
        XR_MAX_API_LAYER_DESCRIPTION_SIZE     = 256,
        XR_MAX_SYSTEM_NAME_SIZE               = 256,
        XR_MAX_APPLICATION_NAME_SIZE          = 128,
        XR_MAX_ENGINE_NAME_SIZE               = 128,
        XR_MAX_RUNTIME_NAME_SIZE              = 128,
        XR_MAX_PATH_LENGTH                    = 256,
        XR_MAX_STRUCTURE_NAME_SIZE            = 64,
        XR_MAX_RESULT_STRING_SIZE             = 64,
        XR_MAX_GRAPHICS_APIS_SUPPORTED        = 32,
        XR_MAX_ACTION_SET_NAME_SIZE           = 64,
        XR_MAX_ACTION_NAME_SIZE               = 64,
        XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE = 128,
        XR_MAX_LOCALIZED_ACTION_NAME_SIZE     = 128,
        XR_MIN_COMPOSITION_LAYERS_SUPPORTED   = 16;

    protected XR10() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetInstanceProcAddr ] ---

    /** Unsafe version of: {@link #xrGetInstanceProcAddr GetInstanceProcAddr} */
    public static int nxrGetInstanceProcAddr(long instance, long name, long function) {
        long __functionAddress = XR.getGlobalCommands().xrGetInstanceProcAddr;
        return callPPPI(instance, name, function, __functionAddress);
    }

    /**
     * Gets a function pointer for an OpenXR function.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Function pointers for all OpenXR functions <b>can</b> be obtained with the function {@link #xrGetInstanceProcAddr GetInstanceProcAddr}.</p>
     * 
     * <pre><code>
     * XrResult xrGetInstanceProcAddr(
     *     XrInstance                                  instance,
     *     const char*                                 name,
     *     PFN_xrVoidFunction*                         function);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrGetInstanceProcAddr GetInstanceProcAddr} itself is obtained in a platform- and loader- specific manner. Typically, the loader library will export this function as a function symbol, so applications <b>can</b> link against the loader library, or load it dynamically and look up the symbol using platform-specific APIs. Loaders <b>must</b> export function symbols for all core OpenXR functions. Because of this, applications that use only the core OpenXR functions have no need to use {@link #xrGetInstanceProcAddr GetInstanceProcAddr}.</p>
     * 
     * <p>Because an application <b>can</b> call {@link #xrGetInstanceProcAddr GetInstanceProcAddr} before creating an instance, {@link #xrGetInstanceProcAddr GetInstanceProcAddr} returns a valid function pointer when the {@code instance} parameter is {@link #XR_NULL_HANDLE NULL_HANDLE} and the {@code name} parameter is one of the following strings:</p>
     * 
     * <h5>No Instance Required</h5>
     * 
     * <ul>
     * <li>{@link #xrEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}</li>
     * <li>{@link #xrEnumerateApiLayerProperties EnumerateApiLayerProperties}</li>
     * <li>{@link #xrCreateInstance CreateInstance}</li>
     * </ul>
     * 
     * <p>{@link #xrGetInstanceProcAddr GetInstanceProcAddr} <b>must</b> return {@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID} if {@code name} is not one of the above strings and {@code instance} is {@link #XR_NULL_HANDLE NULL_HANDLE}. {@link #xrGetInstanceProcAddr GetInstanceProcAddr} <b>may</b> return {@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID} if {@code name} is not one of the above strings and {@code instance} is invalid but not {@link #XR_NULL_HANDLE NULL_HANDLE}.</p>
     * 
     * <p>{@link #xrGetInstanceProcAddr GetInstanceProcAddr} <b>must</b> return {@link #XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED} if {@code instance} is a valid instance and the string specified in {@code name} is not the name of an OpenXR core or enabled extension function.</p>
     * 
     * <p>If {@code name} is the name of an extension function, then the result returned by {@link #xrGetInstanceProcAddr GetInstanceProcAddr} will depend upon how the {@code instance} was created. If {@code instance} was created with the related extension’s name appearing in the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} array, then {@link #xrGetInstanceProcAddr GetInstanceProcAddr} returns a valid function pointer. If the related extension’s name did not appear in the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} array during the creation of {@code instance}, then {@link #xrGetInstanceProcAddr GetInstanceProcAddr} returns {@link #XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}. Because of this, function pointers returned by {@link #xrGetInstanceProcAddr GetInstanceProcAddr} using one {@code XrInstance} may not be valid when used with objects related to a different {@code XrInstance}.</p>
     * 
     * <p>The returned function pointer is of type {@code PFN_xrVoidFunction}, and must be cast to the type of the function being queried.</p>
     * 
     * <p>The table below defines the various use cases for {@link #xrGetInstanceProcAddr GetInstanceProcAddr} and return value (“{@code fp}” is “{@code function pointer}”) for each case.</p>
     * 
     * <h6>xrGetInstanceProcAddr behavior</h6>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>{@code instance} parameter</th><th>{@code name} parameter</th><th>return value</th></tr></thead>
     * <tbody>
     * <tr><td>*</td><td>{@code NULL}</td><td>undefined</td></tr>
     * <tr><td>invalid instance</td><td>*</td><td>undefined</td></tr>
     * <tr><td>{@code NULL}</td><td>{@link #xrEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}</td><td>fp</td></tr>
     * <tr><td>{@code NULL}</td><td>{@link #xrEnumerateApiLayerProperties EnumerateApiLayerProperties}</td><td>fp</td></tr>
     * <tr><td>{@code NULL}</td><td>{@link #xrCreateInstance CreateInstance}</td><td>fp</td></tr>
     * <tr><td>{@code NULL}</td><td>* (any {@code name} not covered above)</td><td>{@code NULL}</td></tr>
     * <tr><td>instance</td><td>core OpenXR function</td><td>fp<sup>1</sup></td></tr>
     * <tr><td>instance</td><td>enabled extension function for {@code instance}</td><td>fp<sup>1</sup></td></tr>
     * <tr><td>instance</td><td>* (any {@code name} not covered above)</td><td>{@code NULL}</td></tr>
     * </tbody>
     * </table>
     * 
     * <dl>
     * <dt>1</dt>
     * <dd>The returned function pointer <b>must</b> only be called with a handle (the first parameter) that is {@code instance} or a child of {@code instance}.</dd>
     * </dl>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>If {@code instance} is not {@link #XR_NULL_HANDLE NULL_HANDLE}, {@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code name} <b>must</b> be a null-terminated UTF-8 string</li>
     * <li>{@code function} <b>must</b> be a pointer to a {@code PFN_xrVoidFunction} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param instance the instance that the function pointer will be compatible with, or {@code NULL} for functions not dependent on any instance.
     * @param name     the name of the function to obtain.
     * @param function the address of the function pointer to get.
     */
    @NativeType("XrResult")
    public static int xrGetInstanceProcAddr(@Nullable XrInstance instance, @NativeType("char const *") ByteBuffer name, @NativeType("PFN_xrVoidFunction *") PointerBuffer function) {
        if (CHECKS) {
            checkNT1(name);
            check(function, 1);
        }
        return nxrGetInstanceProcAddr(memAddressSafe(instance), memAddress(name), memAddress(function));
    }

    /**
     * Gets a function pointer for an OpenXR function.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Function pointers for all OpenXR functions <b>can</b> be obtained with the function {@link #xrGetInstanceProcAddr GetInstanceProcAddr}.</p>
     * 
     * <pre><code>
     * XrResult xrGetInstanceProcAddr(
     *     XrInstance                                  instance,
     *     const char*                                 name,
     *     PFN_xrVoidFunction*                         function);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrGetInstanceProcAddr GetInstanceProcAddr} itself is obtained in a platform- and loader- specific manner. Typically, the loader library will export this function as a function symbol, so applications <b>can</b> link against the loader library, or load it dynamically and look up the symbol using platform-specific APIs. Loaders <b>must</b> export function symbols for all core OpenXR functions. Because of this, applications that use only the core OpenXR functions have no need to use {@link #xrGetInstanceProcAddr GetInstanceProcAddr}.</p>
     * 
     * <p>Because an application <b>can</b> call {@link #xrGetInstanceProcAddr GetInstanceProcAddr} before creating an instance, {@link #xrGetInstanceProcAddr GetInstanceProcAddr} returns a valid function pointer when the {@code instance} parameter is {@link #XR_NULL_HANDLE NULL_HANDLE} and the {@code name} parameter is one of the following strings:</p>
     * 
     * <h5>No Instance Required</h5>
     * 
     * <ul>
     * <li>{@link #xrEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}</li>
     * <li>{@link #xrEnumerateApiLayerProperties EnumerateApiLayerProperties}</li>
     * <li>{@link #xrCreateInstance CreateInstance}</li>
     * </ul>
     * 
     * <p>{@link #xrGetInstanceProcAddr GetInstanceProcAddr} <b>must</b> return {@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID} if {@code name} is not one of the above strings and {@code instance} is {@link #XR_NULL_HANDLE NULL_HANDLE}. {@link #xrGetInstanceProcAddr GetInstanceProcAddr} <b>may</b> return {@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID} if {@code name} is not one of the above strings and {@code instance} is invalid but not {@link #XR_NULL_HANDLE NULL_HANDLE}.</p>
     * 
     * <p>{@link #xrGetInstanceProcAddr GetInstanceProcAddr} <b>must</b> return {@link #XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED} if {@code instance} is a valid instance and the string specified in {@code name} is not the name of an OpenXR core or enabled extension function.</p>
     * 
     * <p>If {@code name} is the name of an extension function, then the result returned by {@link #xrGetInstanceProcAddr GetInstanceProcAddr} will depend upon how the {@code instance} was created. If {@code instance} was created with the related extension’s name appearing in the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} array, then {@link #xrGetInstanceProcAddr GetInstanceProcAddr} returns a valid function pointer. If the related extension’s name did not appear in the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} array during the creation of {@code instance}, then {@link #xrGetInstanceProcAddr GetInstanceProcAddr} returns {@link #XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}. Because of this, function pointers returned by {@link #xrGetInstanceProcAddr GetInstanceProcAddr} using one {@code XrInstance} may not be valid when used with objects related to a different {@code XrInstance}.</p>
     * 
     * <p>The returned function pointer is of type {@code PFN_xrVoidFunction}, and must be cast to the type of the function being queried.</p>
     * 
     * <p>The table below defines the various use cases for {@link #xrGetInstanceProcAddr GetInstanceProcAddr} and return value (“{@code fp}” is “{@code function pointer}”) for each case.</p>
     * 
     * <h6>xrGetInstanceProcAddr behavior</h6>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>{@code instance} parameter</th><th>{@code name} parameter</th><th>return value</th></tr></thead>
     * <tbody>
     * <tr><td>*</td><td>{@code NULL}</td><td>undefined</td></tr>
     * <tr><td>invalid instance</td><td>*</td><td>undefined</td></tr>
     * <tr><td>{@code NULL}</td><td>{@link #xrEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}</td><td>fp</td></tr>
     * <tr><td>{@code NULL}</td><td>{@link #xrEnumerateApiLayerProperties EnumerateApiLayerProperties}</td><td>fp</td></tr>
     * <tr><td>{@code NULL}</td><td>{@link #xrCreateInstance CreateInstance}</td><td>fp</td></tr>
     * <tr><td>{@code NULL}</td><td>* (any {@code name} not covered above)</td><td>{@code NULL}</td></tr>
     * <tr><td>instance</td><td>core OpenXR function</td><td>fp<sup>1</sup></td></tr>
     * <tr><td>instance</td><td>enabled extension function for {@code instance}</td><td>fp<sup>1</sup></td></tr>
     * <tr><td>instance</td><td>* (any {@code name} not covered above)</td><td>{@code NULL}</td></tr>
     * </tbody>
     * </table>
     * 
     * <dl>
     * <dt>1</dt>
     * <dd>The returned function pointer <b>must</b> only be called with a handle (the first parameter) that is {@code instance} or a child of {@code instance}.</dd>
     * </dl>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>If {@code instance} is not {@link #XR_NULL_HANDLE NULL_HANDLE}, {@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code name} <b>must</b> be a null-terminated UTF-8 string</li>
     * <li>{@code function} <b>must</b> be a pointer to a {@code PFN_xrVoidFunction} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param instance the instance that the function pointer will be compatible with, or {@code NULL} for functions not dependent on any instance.
     * @param name     the name of the function to obtain.
     * @param function the address of the function pointer to get.
     */
    @NativeType("XrResult")
    public static int xrGetInstanceProcAddr(@Nullable XrInstance instance, @NativeType("char const *") CharSequence name, @NativeType("PFN_xrVoidFunction *") PointerBuffer function) {
        if (CHECKS) {
            check(function, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nxrGetInstanceProcAddr(memAddressSafe(instance), nameEncoded, memAddress(function));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ xrEnumerateApiLayerProperties ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateApiLayerProperties EnumerateApiLayerProperties}
     *
     * @param propertyCapacityInput the capacity of the properties array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrEnumerateApiLayerProperties(int propertyCapacityInput, long propertyCountOutput, long properties) {
        long __functionAddress = XR.getGlobalCommands().xrEnumerateApiLayerProperties;
        return callPPI(propertyCapacityInput, propertyCountOutput, properties, __functionAddress);
    }

    /**
     * Returns up to requested number of global layer properties.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine what set of API layers are available, OpenXR provides the {@link #xrEnumerateApiLayerProperties EnumerateApiLayerProperties} function:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateApiLayerProperties(
     *     uint32_t                                    propertyCapacityInput,
     *     uint32_t*                                   propertyCountOutput,
     *     XrApiLayerProperties*                       properties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The list of available layers may change at any time due to actions outside of the OpenXR runtime, so two calls to {@link #xrEnumerateApiLayerProperties EnumerateApiLayerProperties} with the same parameters <b>may</b> return different results, or retrieve different {@code propertyCountOutput} values or {@code properties} contents.</p>
     * 
     * <p>Once an instance has been created, the layers enabled for that instance will continue to be enabled and valid for the lifetime of that instance, even if some of them become unavailable for future instances.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code propertyCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code propertyCapacityInput} is not 0, {@code properties} <b>must</b> be a pointer to an array of {@code propertyCapacityInput} {@link XrApiLayerProperties} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrApiLayerProperties}</p>
     *
     * @param propertyCountOutput a pointer to the count of properties written, or a pointer to the required capacity in the case that propertyCapacityInput is 0.
     * @param properties          a pointer to an array of {@link XrApiLayerProperties} structures, but <b>can</b> be {@code NULL} if propertyCapacityInput is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumerateApiLayerProperties(@NativeType("uint32_t *") IntBuffer propertyCountOutput, @Nullable @NativeType("XrApiLayerProperties *") XrApiLayerProperties.Buffer properties) {
        if (CHECKS) {
            check(propertyCountOutput, 1);
        }
        return nxrEnumerateApiLayerProperties(remainingSafe(properties), memAddress(propertyCountOutput), memAddressSafe(properties));
    }

    // --- [ xrEnumerateInstanceExtensionProperties ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}
     *
     * @param propertyCapacityInput the capacity of the properties array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrEnumerateInstanceExtensionProperties(long layerName, int propertyCapacityInput, long propertyCountOutput, long properties) {
        long __functionAddress = XR.getGlobalCommands().xrEnumerateInstanceExtensionProperties;
        return callPPPI(layerName, propertyCapacityInput, propertyCountOutput, properties, __functionAddress);
    }

    /**
     * Returns properties of available instance extensions.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The application can determine the available instance extensions by calling {@link #xrEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateInstanceExtensionProperties(
     *     const char*                                 layerName,
     *     uint32_t                                    propertyCapacityInput,
     *     uint32_t*                                   propertyCountOutput,
     *     XrExtensionProperties*                      properties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code properties} is {@code NULL}, then the number of extensions properties available is returned in {@code propertyCountOutput}. Otherwise, {@code propertyCountInput} must point to a variable set by the user to the number of elements in the {@code properties} array. If {@code propertyCountInput} is less than the number of extension properties available, the contents of {@code properties} will be undefined. If {@code propertyCountInput} is smaller than the number of extensions available, the runtime <b>must</b> return the failure code {@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT} and the contents of {@code properties} are undefined.</p>
     * 
     * <p>Because the list of available layers may change externally between calls to {@link #xrEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}, two calls <b>may</b> retrieve different results if a {@code layerName} is available in one call but not in another. The extensions supported by a layer may also change between two calls, e.g. if the layer implementation is replaced by a different version between those calls.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>If {@code layerName} is not {@code NULL}, {@code layerName} <b>must</b> be a null-terminated UTF-8 string</li>
     * <li>{@code propertyCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code propertyCapacityInput} is not 0, {@code properties} <b>must</b> be a pointer to an array of {@code propertyCapacityInput} {@link XrExtensionProperties} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link #XR_ERROR_RUNTIME_UNAVAILABLE ERROR_RUNTIME_UNAVAILABLE}</li>
     * <li>{@link #XR_ERROR_API_LAYER_NOT_PRESENT ERROR_API_LAYER_NOT_PRESENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrExtensionProperties}</p>
     *
     * @param layerName           either {@code NULL} or a pointer to a string naming the API layer to retrieve extensions from, as returned by {@link #xrEnumerateApiLayerProperties EnumerateApiLayerProperties}.
     * @param propertyCountOutput a pointer to the count of properties written, or a pointer to the required capacity in the case that {@code propertyCapacityInput} is 0.
     * @param properties          a pointer to an array of {@link XrExtensionProperties} structures, but <b>can</b> be {@code NULL} if {@code propertyCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumerateInstanceExtensionProperties(@Nullable @NativeType("char const *") ByteBuffer layerName, @NativeType("uint32_t *") IntBuffer propertyCountOutput, @Nullable @NativeType("XrExtensionProperties *") XrExtensionProperties.Buffer properties) {
        if (CHECKS) {
            checkNT1Safe(layerName);
            check(propertyCountOutput, 1);
        }
        return nxrEnumerateInstanceExtensionProperties(memAddressSafe(layerName), remainingSafe(properties), memAddress(propertyCountOutput), memAddressSafe(properties));
    }

    /**
     * Returns properties of available instance extensions.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The application can determine the available instance extensions by calling {@link #xrEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateInstanceExtensionProperties(
     *     const char*                                 layerName,
     *     uint32_t                                    propertyCapacityInput,
     *     uint32_t*                                   propertyCountOutput,
     *     XrExtensionProperties*                      properties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code properties} is {@code NULL}, then the number of extensions properties available is returned in {@code propertyCountOutput}. Otherwise, {@code propertyCountInput} must point to a variable set by the user to the number of elements in the {@code properties} array. If {@code propertyCountInput} is less than the number of extension properties available, the contents of {@code properties} will be undefined. If {@code propertyCountInput} is smaller than the number of extensions available, the runtime <b>must</b> return the failure code {@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT} and the contents of {@code properties} are undefined.</p>
     * 
     * <p>Because the list of available layers may change externally between calls to {@link #xrEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}, two calls <b>may</b> retrieve different results if a {@code layerName} is available in one call but not in another. The extensions supported by a layer may also change between two calls, e.g. if the layer implementation is replaced by a different version between those calls.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>If {@code layerName} is not {@code NULL}, {@code layerName} <b>must</b> be a null-terminated UTF-8 string</li>
     * <li>{@code propertyCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code propertyCapacityInput} is not 0, {@code properties} <b>must</b> be a pointer to an array of {@code propertyCapacityInput} {@link XrExtensionProperties} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link #XR_ERROR_RUNTIME_UNAVAILABLE ERROR_RUNTIME_UNAVAILABLE}</li>
     * <li>{@link #XR_ERROR_API_LAYER_NOT_PRESENT ERROR_API_LAYER_NOT_PRESENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrExtensionProperties}</p>
     *
     * @param layerName           either {@code NULL} or a pointer to a string naming the API layer to retrieve extensions from, as returned by {@link #xrEnumerateApiLayerProperties EnumerateApiLayerProperties}.
     * @param propertyCountOutput a pointer to the count of properties written, or a pointer to the required capacity in the case that {@code propertyCapacityInput} is 0.
     * @param properties          a pointer to an array of {@link XrExtensionProperties} structures, but <b>can</b> be {@code NULL} if {@code propertyCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumerateInstanceExtensionProperties(@Nullable @NativeType("char const *") CharSequence layerName, @NativeType("uint32_t *") IntBuffer propertyCountOutput, @Nullable @NativeType("XrExtensionProperties *") XrExtensionProperties.Buffer properties) {
        if (CHECKS) {
            check(propertyCountOutput, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(layerName, true);
            long layerNameEncoded = layerName == null ? NULL : stack.getPointerAddress();
            return nxrEnumerateInstanceExtensionProperties(layerNameEncoded, remainingSafe(properties), memAddress(propertyCountOutput), memAddressSafe(properties));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ xrCreateInstance ] ---

    /** Unsafe version of: {@link #xrCreateInstance CreateInstance} */
    public static int nxrCreateInstance(long createInfo, long instance) {
        long __functionAddress = XR.getGlobalCommands().xrCreateInstance;
        if (CHECKS) {
            XrInstanceCreateInfo.validate(createInfo);
        }
        return callPPI(createInfo, instance, __functionAddress);
    }

    /**
     * Creates an OpenXR Instance.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateInstance CreateInstance} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateInstance(
     *     const XrInstanceCreateInfo*                 createInfo,
     *     XrInstance*                                 instance);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrCreateInstance CreateInstance} creates the {@code XrInstance}, then enables and initializes global API layers and extensions requested by the application. If an extension is provided by an API layer, both the API layer and extension <b>must</b> be specified at {@link #xrCreateInstance CreateInstance} time. If a specified API layer cannot be found, no {@code XrInstance} will be created and the function will return {@link #XR_ERROR_API_LAYER_NOT_PRESENT ERROR_API_LAYER_NOT_PRESENT}. Likewise, if a specified extension cannot be found, the call <b>must</b> return {@link #XR_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT} and no {@code XrInstance} will be created. Additionally, some runtimes <b>may</b> limit the number of concurrent instances that may be in use. If the application attempts to create more instances than a runtime can simultaneously support, {@link #xrCreateInstance CreateInstance} <b>may</b> return {@link #XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}.</p>
     * 
     * <p>If the {@link XrApplicationInfo}{@code ::applicationName} is the empty string the runtime <b>must</b> return {@link #XR_ERROR_NAME_INVALID ERROR_NAME_INVALID}.</p>
     * 
     * <p>If the {@link XrInstanceCreateInfo} structure contains a platform-specific extension for a platform other than the target platform, {@link #XR_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED} <b>may</b> be returned. If a mandatory platform-specific extension is defined for the target platform but no matching extension struct is provided in {@link XrInstanceCreateInfo} the runtime <b>must</b> return {@link #XR_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrInstanceCreateInfo} structure</li>
     * <li>{@code instance} <b>must</b> be a pointer to an {@code XrInstance} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link #XR_ERROR_RUNTIME_UNAVAILABLE ERROR_RUNTIME_UNAVAILABLE}</li>
     * <li>{@link #XR_ERROR_NAME_INVALID ERROR_NAME_INVALID}</li>
     * <li>{@link #XR_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link #XR_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT}</li>
     * <li>{@link #XR_ERROR_API_VERSION_UNSUPPORTED ERROR_API_VERSION_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_API_LAYER_NOT_PRESENT ERROR_API_LAYER_NOT_PRESENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrInstanceCreateInfo}</p>
     *
     * @param createInfo points to an instance of {@link XrInstanceCreateInfo} controlling creation of the instance.
     * @param instance   points to an {@code XrInstance} handle in which the resulting instance is returned.
     */
    @NativeType("XrResult")
    public static int xrCreateInstance(@NativeType("XrInstanceCreateInfo const *") XrInstanceCreateInfo createInfo, @NativeType("XrInstance *") PointerBuffer instance) {
        if (CHECKS) {
            check(instance, 1);
        }
        return nxrCreateInstance(createInfo.address(), memAddress(instance));
    }

    // --- [ xrDestroyInstance ] ---

    /**
     * Destroy an instance of OpenXR.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyInstance DestroyInstance} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyInstance(
     *     XrInstance                                  instance);</code></pre>
     * 
     * <h5>Parameter Descriptions</h5>
     * 
     * <ul>
     * <li>{@code instance} is the handle to the instance to destroy.</li>
     * </ul>
     * 
     * <p>{@code XrInstance} handles are destroyed using {@link #xrDestroyInstance DestroyInstance}. When an {@code XrInstance} is destroyed, all handles that are children of that {@code XrInstance} are also destroyed.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code instance}, and any child handles, <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * </ul></dd>
     * </dl>
     */
    @NativeType("XrResult")
    public static int xrDestroyInstance(XrInstance instance) {
        long __functionAddress = instance.getCapabilities().xrDestroyInstance;
        return callPI(instance.address(), __functionAddress);
    }

    // --- [ xrGetInstanceProperties ] ---

    /** Unsafe version of: {@link #xrGetInstanceProperties GetInstanceProperties} */
    public static int nxrGetInstanceProperties(XrInstance instance, long instanceProperties) {
        long __functionAddress = instance.getCapabilities().xrGetInstanceProperties;
        return callPPI(instance.address(), instanceProperties, __functionAddress);
    }

    /**
     * Gets information about the instance.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetInstanceProperties GetInstanceProperties} function provides information about the instance and the associated runtime.</p>
     * 
     * <pre><code>
     * XrResult xrGetInstanceProperties(
     *     XrInstance                                  instance,
     *     XrInstanceProperties*                       instanceProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code instanceProperties} parameter <b>must</b> be filled out by the runtime in response to this call, with information as defined in {@link XrInstanceProperties}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code instanceProperties} <b>must</b> be a pointer to an {@link XrInstanceProperties} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrInstanceProperties}</p>
     *
     * @param instance           a handle to an {@code XrInstance} previously created with {@link #xrCreateInstance CreateInstance}.
     * @param instanceProperties points to an {@link XrInstanceProperties} which describes the {@code instance}.
     */
    @NativeType("XrResult")
    public static int xrGetInstanceProperties(XrInstance instance, @NativeType("XrInstanceProperties *") XrInstanceProperties instanceProperties) {
        return nxrGetInstanceProperties(instance, instanceProperties.address());
    }

    // --- [ xrPollEvent ] ---

    /** Unsafe version of: {@link #xrPollEvent PollEvent} */
    public static int nxrPollEvent(XrInstance instance, long eventData) {
        long __functionAddress = instance.getCapabilities().xrPollEvent;
        return callPPI(instance.address(), eventData, __functionAddress);
    }

    /**
     * Polls for events.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrPollEvent(
     *     XrInstance                                  instance,
     *     XrEventDataBuffer*                          eventData);</code></pre>
     * 
     * <h5>Parameter Descriptions</h5>
     * 
     * <ul>
     * <li>{@code instance} is a valid {@code XrInstance}.</li>
     * <li>{@code eventData} is a pointer to a valid {@link XrEventDataBuffer}.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code eventData} <b>must</b> be a pointer to an {@link XrEventDataBuffer} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_EVENT_UNAVAILABLE EVENT_UNAVAILABLE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <p>The runtime <b>must</b> discard queued events which contain destroyed or otherwise invalid handles.</p>
     * 
     * <h6>Event Descriptions</h6>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Event</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link XrEventDataEventsLost}</td><td>event queue has overflowed and some events were lost</td></tr>
     * <tr><td>{@link XrEventDataInstanceLossPending}</td><td>application is about to lose the instance</td></tr>
     * <tr><td>{@link XrEventDataInteractionProfileChanged}</td><td>active input form factor for one or more top level user paths has changed</td></tr>
     * <tr><td>{@link XrEventDataReferenceSpaceChangePending}</td><td>runtime will begin operating with updated space bounds</td></tr>
     * <tr><td>{@link XrEventDataSessionStateChanged}</td><td>application has changed lifecycle state</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEventDataBuffer}</p>
     */
    @NativeType("XrResult")
    public static int xrPollEvent(XrInstance instance, @NativeType("XrEventDataBuffer *") XrEventDataBuffer eventData) {
        return nxrPollEvent(instance, eventData.address());
    }

    // --- [ xrResultToString ] ---

    /** Unsafe version of: {@link #xrResultToString ResultToString} */
    public static int nxrResultToString(XrInstance instance, int value, long buffer) {
        long __functionAddress = instance.getCapabilities().xrResultToString;
        return callPPI(instance.address(), value, buffer, __functionAddress);
    }

    /**
     * Converts an XrResult to a UTF-8 string.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrResultToString(
     *     XrInstance                                  instance,
     *     XrResult                                    value,
     *     char                                        buffer[XR_MAX_RESULT_STRING_SIZE]);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Returns the text version of the provided {@code XrResult} value as a UTF-8 string.</p>
     * 
     * <p>In all cases the returned string <b>must</b> be one of:</p>
     * 
     * <h5>Result String Return Values</h5>
     * 
     * <ul>
     * <li>The literal string defined for the provide numeric value in the core spec or extension. (e.g. the value 0 results in the string {@code XR_SUCCESS})</li>
     * <li>{@code XR_UNKNOWN_SUCCESS_} concatenated with the positive result number expressed as a decimal number.</li>
     * <li>{@code XR_UNKNOWN_FAILURE_} concatenated with the negative result number expressed as a decimal number.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code value} <b>must</b> be a valid {@code XrResult} value</li>
     * <li>{@code buffer} <b>must</b> be a character array of length {@link #XR_MAX_RESULT_STRING_SIZE MAX_RESULT_STRING_SIZE}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrStructureTypeToString StructureTypeToString}</p>
     *
     * @param instance the handle of the instance to ask for the string.
     * @param value    the {@code XrResult} value to turn into a string.
     * @param buffer   the buffer that will be used to return the string in.
     */
    @NativeType("XrResult")
    public static int xrResultToString(XrInstance instance, @NativeType("XrResult") int value, @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(buffer, XR_MAX_RESULT_STRING_SIZE);
        }
        return nxrResultToString(instance, value, memAddress(buffer));
    }

    // --- [ xrStructureTypeToString ] ---

    /** Unsafe version of: {@link #xrStructureTypeToString StructureTypeToString} */
    public static int nxrStructureTypeToString(XrInstance instance, int value, long buffer) {
        long __functionAddress = instance.getCapabilities().xrStructureTypeToString;
        return callPPI(instance.address(), value, buffer, __functionAddress);
    }

    /**
     * Converts an XrStructureType to a UTF-8 string.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrStructureTypeToString StructureTypeToString} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrStructureTypeToString(
     *     XrInstance                                  instance,
     *     XrStructureType                             value,
     *     char                                        buffer[XR_MAX_STRUCTURE_NAME_SIZE]);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Returns the text version of the provided {@code XrStructureType} value as a UTF-8 string.</p>
     * 
     * <p>In all cases the returned string <b>must</b> be one of:</p>
     * 
     * <h5>Structure Type String Return Values</h5>
     * 
     * <ul>
     * <li>The literal string defined for the provide numeric value in the core spec or extension. (e.g. the value of {@link #XR_TYPE_INSTANCE_CREATE_INFO TYPE_INSTANCE_CREATE_INFO} results in the string {@link #XR_TYPE_INSTANCE_CREATE_INFO TYPE_INSTANCE_CREATE_INFO})</li>
     * <li>{@code XR_UNKNOWN_STRUCTURE_TYPE_} concatenated with the structure type number expressed as a decimal number.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code value} <b>must</b> be a valid {@code XrStructureType} value</li>
     * <li>{@code buffer} <b>must</b> be a character array of length {@link #XR_MAX_STRUCTURE_NAME_SIZE MAX_STRUCTURE_NAME_SIZE}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrResultToString ResultToString}</p>
     *
     * @param instance the handle of the instance to ask for the string.
     * @param value    the {@code XrStructureType} value to turn into a string.
     * @param buffer   the buffer that will be used to return the string in.
     */
    @NativeType("XrResult")
    public static int xrStructureTypeToString(XrInstance instance, @NativeType("XrStructureType") int value, @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(buffer, XR_MAX_STRUCTURE_NAME_SIZE);
        }
        return nxrStructureTypeToString(instance, value, memAddress(buffer));
    }

    // --- [ xrGetSystem ] ---

    /** Unsafe version of: {@link #xrGetSystem GetSystem} */
    public static int nxrGetSystem(XrInstance instance, long getInfo, long systemId) {
        long __functionAddress = instance.getCapabilities().xrGetSystem;
        return callPPPI(instance.address(), getInfo, systemId, __functionAddress);
    }

    /**
     * Gets a system identifier.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSystem GetSystem} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSystem(
     *     XrInstance                                  instance,
     *     const XrSystemGetInfo*                      getInfo,
     *     XrSystemId*                                 systemId);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>To get an {@code XrSystemId}, an application specifies its desired <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#form_factor_description">form factor</a> to {@link #xrGetSystem GetSystem} and gets the runtime’s {@code XrSystemId} associated with that configuration.</p>
     * 
     * <p>If the form factor is supported but temporarily unavailable, {@link #xrGetSystem GetSystem} <b>must</b> return {@link #XR_ERROR_FORM_FACTOR_UNAVAILABLE ERROR_FORM_FACTOR_UNAVAILABLE}. A runtime <b>may</b> return {@link #XR_SUCCESS SUCCESS} on a subsequent call for a form factor it previously returned {@link #XR_ERROR_FORM_FACTOR_UNAVAILABLE ERROR_FORM_FACTOR_UNAVAILABLE}. For example, connecting or warming up hardware might cause an unavailable form factor to become available.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code getInfo} <b>must</b> be a pointer to a valid {@link XrSystemGetInfo} structure</li>
     * <li>{@code systemId} <b>must</b> be a pointer to an {@code XrSystemId} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_FORM_FACTOR_UNSUPPORTED ERROR_FORM_FACTOR_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_FORM_FACTOR_UNAVAILABLE ERROR_FORM_FACTOR_UNAVAILABLE}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #XR_NULL_SYSTEM_ID NULL_SYSTEM_ID}, {@link XrSystemGetInfo}</p>
     *
     * @param instance the handle of the instance from which to get the information.
     * @param getInfo  a pointer to an {@link XrSystemGetInfo} structure containing the application’s requests for a system.
     * @param systemId the returned {@code XrSystemId}.
     */
    @NativeType("XrResult")
    public static int xrGetSystem(XrInstance instance, @NativeType("XrSystemGetInfo const *") XrSystemGetInfo getInfo, @NativeType("XrSystemId *") LongBuffer systemId) {
        if (CHECKS) {
            check(systemId, 1);
        }
        return nxrGetSystem(instance, getInfo.address(), memAddress(systemId));
    }

    // --- [ xrGetSystemProperties ] ---

    /** Unsafe version of: {@link #xrGetSystemProperties GetSystemProperties} */
    public static int nxrGetSystemProperties(XrInstance instance, long systemId, long properties) {
        long __functionAddress = instance.getCapabilities().xrGetSystemProperties;
        return callPJPI(instance.address(), systemId, properties, __functionAddress);
    }

    /**
     * Gets the properties of a particular system.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSystemProperties GetSystemProperties} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSystemProperties(
     *     XrInstance                                  instance,
     *     XrSystemId                                  systemId,
     *     XrSystemProperties*                         properties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>An application <b>can</b> call {@link #xrGetSystemProperties GetSystemProperties} to retrieve information about the system such as vendor ID, system name, and graphics and tracking properties.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code properties} <b>must</b> be a pointer to an {@link XrSystemProperties} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSystemProperties}</p>
     *
     * @param instance   the instance from which {@code systemId} was retrieved.
     * @param systemId   the {@code XrSystemId} whose properties will be queried.
     * @param properties points to an instance of the {@link XrSystemProperties} structure, that will be filled with returned information.
     */
    @NativeType("XrResult")
    public static int xrGetSystemProperties(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrSystemProperties *") XrSystemProperties properties) {
        return nxrGetSystemProperties(instance, systemId, properties.address());
    }

    // --- [ xrEnumerateEnvironmentBlendModes ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateEnvironmentBlendModes EnumerateEnvironmentBlendModes}
     *
     * @param environmentBlendModeCapacityInput the capacity of the {@code environmentBlendModes} array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrEnumerateEnvironmentBlendModes(XrInstance instance, long systemId, int viewConfigurationType, int environmentBlendModeCapacityInput, long environmentBlendModeCountOutput, long environmentBlendModes) {
        long __functionAddress = instance.getCapabilities().xrEnumerateEnvironmentBlendModes;
        return callPJPPI(instance.address(), systemId, viewConfigurationType, environmentBlendModeCapacityInput, environmentBlendModeCountOutput, environmentBlendModes, __functionAddress);
    }

    /**
     * Lists environment blend modes.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnumerateEnvironmentBlendModes EnumerateEnvironmentBlendModes} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateEnvironmentBlendModes(
     *     XrInstance                                  instance,
     *     XrSystemId                                  systemId,
     *     XrViewConfigurationType                     viewConfigurationType,
     *     uint32_t                                    environmentBlendModeCapacityInput,
     *     uint32_t*                                   environmentBlendModeCountOutput,
     *     XrEnvironmentBlendMode*                     environmentBlendModes);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Enumerates the set of environment blend modes that this runtime supports for a given view configuration of the system. Environment blend modes <b>should</b> be in order from highest to lowest runtime preference.</p>
     * 
     * <p>Runtimes <b>must</b> always return identical buffer contents from this enumeration for the given {@code systemId} and {@code viewConfigurationType} for the lifetime of the instance.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
     * <li>{@code environmentBlendModeCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code environmentBlendModeCapacityInput} is not 0, {@code environmentBlendModes} <b>must</b> be a pointer to an array of {@code environmentBlendModeCapacityInput} {@code XrEnvironmentBlendMode} values</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link #XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * </ul></dd>
     * </dl>
     *
     * @param instance                        the instance from which {@code systemId} was retrieved.
     * @param systemId                        the {@code XrSystemId} whose environment blend modes will be enumerated.
     * @param viewConfigurationType           the {@code XrViewConfigurationType} to enumerate.
     * @param environmentBlendModeCountOutput a pointer to the count of {@code environmentBlendModes} written, or a pointer to the required capacity in the case that {@code environmentBlendModeCapacityInput} is 0.
     * @param environmentBlendModes           a pointer to an array of {@code XrEnvironmentBlendMode} values, but <b>can</b> be {@code NULL} if {@code environmentBlendModeCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumerateEnvironmentBlendModes(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("uint32_t *") IntBuffer environmentBlendModeCountOutput, @Nullable @NativeType("XrEnvironmentBlendMode *") IntBuffer environmentBlendModes) {
        if (CHECKS) {
            check(environmentBlendModeCountOutput, 1);
        }
        return nxrEnumerateEnvironmentBlendModes(instance, systemId, viewConfigurationType, remainingSafe(environmentBlendModes), memAddress(environmentBlendModeCountOutput), memAddressSafe(environmentBlendModes));
    }

    // --- [ xrCreateSession ] ---

    /** Unsafe version of: {@link #xrCreateSession CreateSession} */
    public static int nxrCreateSession(XrInstance instance, long createInfo, long session) {
        long __functionAddress = instance.getCapabilities().xrCreateSession;
        return callPPPI(instance.address(), createInfo, session, __functionAddress);
    }

    /**
     * Creates an XrSession.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateSession CreateSession} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateSession(
     *     XrInstance                                  instance,
     *     const XrSessionCreateInfo*                  createInfo,
     *     XrSession*                                  session);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Creates a session using the provided {@code createInfo} and returns a handle to that session. This session is created in the {@link #XR_SESSION_STATE_IDLE SESSION_STATE_IDLE} state, and a corresponding {@link XrEventDataSessionStateChanged} event to the {@link #XR_SESSION_STATE_IDLE SESSION_STATE_IDLE} state <b>must</b> be generated as the first such event for the new session.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING} ({@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} may be returned due to legacy behavior) on calls to {@link #xrCreateSession CreateSession} if a function named like {@code xrGet*GraphicsRequirements} has not been called for the same {@code instance} and {@link XrSessionCreateInfo}{@code ::systemId}. (See graphics binding extensions for details.)</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrSessionCreateInfo} structure</li>
     * <li>{@code session} <b>must</b> be a pointer to an {@code XrSession} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link #XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * <li>{@link #XR_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link #XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING}</li>
     * <li>{@link #XR_ERROR_GRAPHICS_DEVICE_INVALID ERROR_GRAPHICS_DEVICE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrExtensionProperties}, {@link XrSessionCreateInfo}, {@link #xrBeginSession BeginSession}, {@link #xrDestroySession DestroySession}, {@link #xrEndSession EndSession}</p>
     *
     * @param instance   the instance from which {@code systemId} was retrieved.
     * @param createInfo a pointer to an {@link XrSessionCreateInfo} structure containing information about how to create the session.
     * @param session    a pointer to a handle in which the created {@code XrSession} is returned.
     */
    @NativeType("XrResult")
    public static int xrCreateSession(XrInstance instance, @NativeType("XrSessionCreateInfo const *") XrSessionCreateInfo createInfo, @NativeType("XrSession *") PointerBuffer session) {
        if (CHECKS) {
            check(session, 1);
        }
        return nxrCreateSession(instance, createInfo.address(), memAddress(session));
    }

    // --- [ xrDestroySession ] ---

    /**
     * Destroys an XrSession.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroySession DestroySession} function is defined as.</p>
     * 
     * <pre><code>
     * XrResult xrDestroySession(
     *     XrSession                                   session);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code XrSession} handles are destroyed using {@link #xrDestroySession DestroySession}. When an {@code XrSession} is destroyed, all handles that are children of that {@code XrSession} are also destroyed.</p>
     * 
     * <p>The application is responsible for ensuring that it has no calls using {@code session} in progress when the session is destroyed.</p>
     * 
     * <p>{@link #xrDestroySession DestroySession} can be called when the session is in any session state.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code session}, and any child handles, <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrBeginSession BeginSession}, {@link #xrCreateSession CreateSession}, {@link #xrEndSession EndSession}</p>
     *
     * @param session the session to destroy.
     */
    @NativeType("XrResult")
    public static int xrDestroySession(XrSession session) {
        long __functionAddress = session.getCapabilities().xrDestroySession;
        return callPI(session.address(), __functionAddress);
    }

    // --- [ xrEnumerateReferenceSpaces ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateReferenceSpaces EnumerateReferenceSpaces}
     *
     * @param spaceCapacityInput the capacity of the spaces array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrEnumerateReferenceSpaces(XrSession session, int spaceCapacityInput, long spaceCountOutput, long spaces) {
        long __functionAddress = session.getCapabilities().xrEnumerateReferenceSpaces;
        return callPPPI(session.address(), spaceCapacityInput, spaceCountOutput, spaces, __functionAddress);
    }

    /**
     * Enumerate available reference spaces.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnumerateReferenceSpaces EnumerateReferenceSpaces} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateReferenceSpaces(
     *     XrSession                                   session,
     *     uint32_t                                    spaceCapacityInput,
     *     uint32_t*                                   spaceCountOutput,
     *     XrReferenceSpaceType*                       spaces);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Enumerates the set of reference space types that this runtime supports for a given session. Runtimes <b>must</b> always return identical buffer contents from this enumeration for the lifetime of the session.</p>
     * 
     * <p>If a session enumerates support for a given reference space type, calls to {@link #xrCreateReferenceSpace CreateReferenceSpace} <b>must</b> succeed for that session, with any transient unavailability of poses expressed later during calls to {@link #xrLocateSpace LocateSpace}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code spaceCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code spaceCapacityInput} is not 0, {@code spaces} <b>must</b> be a pointer to an array of {@code spaceCapacityInput} {@code XrReferenceSpaceType} values</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * </ul></dd>
     * </dl>
     *
     * @param session          a handle to an {@code XrSession} previously created with {@link #xrCreateSession CreateSession}.
     * @param spaceCountOutput a pointer to the count of spaces written, or a pointer to the required capacity in the case that {@code spaceCapacityInput} is 0.
     * @param spaces           a pointer to an application-allocated array that will be filled with the enumerant of each supported reference space. It <b>can</b> be {@code NULL} if {@code spaceCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumerateReferenceSpaces(XrSession session, @NativeType("uint32_t *") IntBuffer spaceCountOutput, @Nullable @NativeType("XrReferenceSpaceType *") IntBuffer spaces) {
        if (CHECKS) {
            check(spaceCountOutput, 1);
        }
        return nxrEnumerateReferenceSpaces(session, remainingSafe(spaces), memAddress(spaceCountOutput), memAddressSafe(spaces));
    }

    // --- [ xrCreateReferenceSpace ] ---

    /** Unsafe version of: {@link #xrCreateReferenceSpace CreateReferenceSpace} */
    public static int nxrCreateReferenceSpace(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateReferenceSpace;
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    /**
     * Creates a reference space.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateReferenceSpace CreateReferenceSpace} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateReferenceSpace(
     *     XrSession                                   session,
     *     const XrReferenceSpaceCreateInfo*           createInfo,
     *     XrSpace*                                    space);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Creates an {@code XrSpace} handle based on a chosen reference space. Application <b>can</b> provide an {@link XrPosef} to define the position and orientation of the new space’s origin within the natural reference frame of the reference space.</p>
     * 
     * <p>Multiple {@code XrSpace} handles may exist simultaneously, up to some limit imposed by the runtime. The {@code XrSpace} handle <b>must</b> be eventually freed via the {@link #xrDestroySpace DestroySpace} function.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_REFERENCE_SPACE_UNSUPPORTED ERROR_REFERENCE_SPACE_UNSUPPORTED} if the given reference space type is not supported by this {@code session}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrReferenceSpaceCreateInfo} structure</li>
     * <li>{@code space} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link #XR_ERROR_REFERENCE_SPACE_UNSUPPORTED ERROR_REFERENCE_SPACE_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrReferenceSpaceCreateInfo}, {@link #xrDestroySpace DestroySpace}</p>
     *
     * @param session    a handle to an {@code XrSession} previously created with {@link #xrCreateSession CreateSession}.
     * @param createInfo the {@link XrReferenceSpaceCreateInfo} used to specify the space.
     * @param space      the returned space handle.
     */
    @NativeType("XrResult")
    public static int xrCreateReferenceSpace(XrSession session, @NativeType("XrReferenceSpaceCreateInfo const *") XrReferenceSpaceCreateInfo createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateReferenceSpace(session, createInfo.address(), memAddress(space));
    }

    // --- [ xrGetReferenceSpaceBoundsRect ] ---

    /** Unsafe version of: {@link #xrGetReferenceSpaceBoundsRect GetReferenceSpaceBoundsRect} */
    public static int nxrGetReferenceSpaceBoundsRect(XrSession session, int referenceSpaceType, long bounds) {
        long __functionAddress = session.getCapabilities().xrGetReferenceSpaceBoundsRect;
        return callPPI(session.address(), referenceSpaceType, bounds, __functionAddress);
    }

    /**
     * Gets the bounds rectangle of a reference space.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>XR systems may have limited real world spatial ranges in which users can freely move around while remaining tracked. Applications may wish to query these boundaries and alter application behavior or content placement to ensure the user can complete the experience while remaining within the boundary. Applications <b>can</b> query this information using {@link #xrGetReferenceSpaceBoundsRect GetReferenceSpaceBoundsRect}.</p>
     * 
     * <p>When called, {@link #xrGetReferenceSpaceBoundsRect GetReferenceSpaceBoundsRect} <b>should</b> return the extents of a rectangle that is clear of obstacles down to the floor, allowing where the user can freely move while remaining tracked, if available for that reference space. The returned extent represents the dimensions of an axis-aligned bounding box where the {@link XrExtent2Df}{@code ::width} and {@link XrExtent2Df}{@code ::height} fields correspond to the X and Z axes of the provided space, with the extents centered at the origin of the space. Not all systems or spaces may support boundaries. If a runtime is unable to provide bounds for a given space, {@link #XR_SPACE_BOUNDS_UNAVAILABLE SPACE_BOUNDS_UNAVAILABLE} will be returned and all fields of {@code bounds} will be set to 0.</p>
     * 
     * <p>The returned extents are expressed relative to the natural origin of the provided {@code XrReferenceSpaceType} and <b>must</b> not incorporate any origin offsets specified by the application during calls to {@link #xrCreateReferenceSpace CreateReferenceSpace}.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_REFERENCE_SPACE_UNSUPPORTED ERROR_REFERENCE_SPACE_UNSUPPORTED} if the {@code XrReferenceSpaceType} passed in {@code createInfo} is not supported by this {@code session}.</p>
     * 
     * <p>When a runtime will begin operating with updated space bounds, the runtime <b>must</b> queue a corresponding {@link XrEventDataReferenceSpaceChangePending} event.</p>
     * 
     * <pre><code>
     * XrResult xrGetReferenceSpaceBoundsRect(
     *     XrSession                                   session,
     *     XrReferenceSpaceType                        referenceSpaceType,
     *     XrExtent2Df*                                bounds);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code referenceSpaceType} <b>must</b> be a valid {@code XrReferenceSpaceType} value</li>
     * <li>{@code bounds} <b>must</b> be a pointer to an {@link XrExtent2Df} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * <li>{@link #XR_SPACE_BOUNDS_UNAVAILABLE SPACE_BOUNDS_UNAVAILABLE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_REFERENCE_SPACE_UNSUPPORTED ERROR_REFERENCE_SPACE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrExtent2Df}, {@link #xrCreateReferenceSpace CreateReferenceSpace}</p>
     *
     * @param session            a handle to an {@code XrSession} previously created with {@link #xrCreateSession CreateSession}.
     * @param referenceSpaceType the reference space type whose bounds should be retrieved.
     * @param bounds             the returned space extents.
     */
    @NativeType("XrResult")
    public static int xrGetReferenceSpaceBoundsRect(XrSession session, @NativeType("XrReferenceSpaceType") int referenceSpaceType, @NativeType("XrExtent2Df *") XrExtent2Df bounds) {
        return nxrGetReferenceSpaceBoundsRect(session, referenceSpaceType, bounds.address());
    }

    // --- [ xrCreateActionSpace ] ---

    /** Unsafe version of: {@link #xrCreateActionSpace CreateActionSpace} */
    public static int nxrCreateActionSpace(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateActionSpace;
        if (CHECKS) {
            XrActionSpaceCreateInfo.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    /**
     * Creates a space based on a pose action.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateActionSpace CreateActionSpace} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateActionSpace(
     *     XrSession                                   session,
     *     const XrActionSpaceCreateInfo*              createInfo,
     *     XrSpace*                                    space);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Creates an {@code XrSpace} handle based on a chosen pose action. Application <b>can</b> provide an {@link XrPosef} to define the position and orientation of the new space’s origin within the natural reference frame of the action space.</p>
     * 
     * <p>Multiple {@code XrSpace} handles may exist simultaneously, up to some limit imposed by the runtime. The {@code XrSpace} handle must be eventually freed via the {@link #xrDestroySpace DestroySpace} function or by destroying the parent {@code XrAction} handle.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_ACTION_TYPE_MISMATCH ERROR_ACTION_TYPE_MISMATCH} if the action provided in {@code action} is not of type {@link #XR_ACTION_TYPE_POSE_INPUT ACTION_TYPE_POSE_INPUT}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrActionSpaceCreateInfo} structure</li>
     * <li>{@code space} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link #XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * <li>{@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link #XR_ERROR_ACTION_TYPE_MISMATCH ERROR_ACTION_TYPE_MISMATCH}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrActionSpaceCreateInfo}, {@link #xrDestroySpace DestroySpace}</p>
     *
     * @param session    the {@code XrSession} to create the action space in.
     * @param createInfo the {@link XrActionSpaceCreateInfo} used to specify the space.
     * @param space      the returned space handle.
     */
    @NativeType("XrResult")
    public static int xrCreateActionSpace(XrSession session, @NativeType("XrActionSpaceCreateInfo const *") XrActionSpaceCreateInfo createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateActionSpace(session, createInfo.address(), memAddress(space));
    }

    // --- [ xrLocateSpace ] ---

    /** Unsafe version of: {@link #xrLocateSpace LocateSpace} */
    public static int nxrLocateSpace(XrSpace space, XrSpace baseSpace, long time, long location) {
        long __functionAddress = space.getCapabilities().xrLocateSpace;
        return callPPJPI(space.address(), baseSpace.address(), time, location, __functionAddress);
    }

    /**
     * Locates a space with reference to another space.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>{@link #xrLocateSpace LocateSpace} provides the physical location of a space in a base space at a specified time, if currently known by the runtime.</p>
     * 
     * <pre><code>
     * XrResult xrLocateSpace(
     *     XrSpace                                     space,
     *     XrSpace                                     baseSpace,
     *     XrTime                                      time,
     *     XrSpaceLocation*                            location);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>For a {@code time} in the past, the runtime <b>should</b> locate the spaces based on the runtime’s most accurate current understanding of how the world was at that historical time.</p>
     * 
     * <p>For a {@code time} in the future, the runtime <b>should</b> locate the spaces based on the runtime’s most up-to-date prediction of how the world will be at that future time.</p>
     * 
     * <p>The minimum valid range of values for {@code time} are described in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#prediction-time-limits">prediction-time-limits</a>. For values of {@code time} outside this range, {@link #xrLocateSpace LocateSpace} <b>may</b> return a location with no position and {@link #XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} unset.</p>
     * 
     * <p>Some devices improve their understanding of the world as the device is used. The location returned by {@link #xrLocateSpace LocateSpace} for a given {@code space}, {@code baseSpace} and {@code time} <b>may</b> change over time, even for spaces that track static objects, as one or both spaces adjust their origins.</p>
     * 
     * <p>During tracking loss of {@code space} relative to {@code baseSpace}, runtimes <b>should</b> continue to provide inferred or last-known {@code position} and {@code orientation} values. These inferred poses can, for example, be based on neck model updates, inertial dead reckoning, or a last-known position, so long as it is still reasonable for the application to use that pose. While a runtime is providing position data, it <b>must</b> continue to set {@link #XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} but it <b>can</b> clear {@link #XR_SPACE_LOCATION_POSITION_TRACKED_BIT SPACE_LOCATION_POSITION_TRACKED_BIT} to indicate that the position is inferred or last-known in this way.</p>
     * 
     * <p>If the runtime has not yet observed even a last-known pose for how to locate {@code space} in {@code baseSpace} (e.g. one space is an action space bound to a motion controller that has not yet been detected, or the two spaces are in disconnected fragments of the runtime’s tracked volume), the runtime <b>should</b> return a location with no position and {@link #XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} unset.</p>
     * 
     * <p>The runtime <b>must</b> return a location with both {@link #XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} and {@link #XR_SPACE_LOCATION_POSITION_TRACKED_BIT SPACE_LOCATION_POSITION_TRACKED_BIT} set when locating {@code space} and {@code baseSpace} if both spaces were created relative to the same entity (e.g. two action spaces for the same action), even if the entity is currently untracked. The location in this case is the difference in the two spaces' application-specified transforms relative to that common entity.</p>
     * 
     * <p>The runtime <b>should</b> return a location with {@link #XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} set and {@link #XR_SPACE_LOCATION_POSITION_TRACKED_BIT SPACE_LOCATION_POSITION_TRACKED_BIT} unset for spaces tracking two static entities in the world when their relative pose is known to the runtime. This enables applications to make use of the runtime’s latest knowledge of the world, even during tracking loss.</p>
     * 
     * <p>If an {@link XrSpaceVelocity} structure is chained to the {@code next} pointer of {@link XrSpaceLocation} and the velocity is observed or can be calculated by the runtime, the runtime <b>must</b> fill in the linear velocity of the origin of space within the reference frame of {@code baseSpace} and set the {@link #XR_SPACE_VELOCITY_LINEAR_VALID_BIT SPACE_VELOCITY_LINEAR_VALID_BIT}. Similarly, if an {@link XrSpaceVelocity} structure is chained to the {@code next} pointer of {@link XrSpaceLocation} and the angular velocity is observed or can be calculated by the runtime, the runtime <b>must</b> fill in the angular velocity of the origin of space within the reference frame of {@code baseSpace} and set the {@link #XR_SPACE_VELOCITY_ANGULAR_VALID_BIT SPACE_VELOCITY_ANGULAR_VALID_BIT}.</p>
     * 
     * <p>The following example code shows how an application can get both the location and velocity of a space within a base space using the {@link #xrLocateSpace LocateSpace} function by chaining an {@link XrSpaceVelocity} to the next pointer of {@link XrSpaceLocation} and calling {@link #xrLocateSpace LocateSpace}.</p>
     * 
     * <pre><code>
     * XrSpace space;      // previously initialized
     * XrSpace baseSpace;  // previously initialized
     * XrTime time;        // previously initialized
     * 
     * XrSpaceVelocity velocity {XR_TYPE_SPACE_VELOCITY};
     * XrSpaceLocation location {XR_TYPE_SPACE_LOCATION, &amp;velocity};
     * xrLocateSpace(space, baseSpace, time, &amp;location);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code location} <b>must</b> be a pointer to an {@link XrSpaceLocation} structure</li>
     * <li>Both of {@code baseSpace} and {@code space} <b>must</b> have been created, allocated, or retrieved from the same {@code XrSession}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpaceLocation}</p>
     *
     * @param space     identifies the target space to locate.
     * @param baseSpace identifies the underlying space in which to locate {@code space}.
     * @param time      the time for which the location should be provided.
     * @param location  provides the location of {@code space} in {@code baseSpace}.
     */
    @NativeType("XrResult")
    public static int xrLocateSpace(XrSpace space, XrSpace baseSpace, @NativeType("XrTime") long time, @NativeType("XrSpaceLocation *") XrSpaceLocation location) {
        return nxrLocateSpace(space, baseSpace, time, location.address());
    }

    // --- [ xrDestroySpace ] ---

    /**
     * Creates a space based on a pose action.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroySpace DestroySpace} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroySpace(
     *     XrSpace                                     space);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code XrSpace} handles are destroyed using {@link #xrDestroySpace DestroySpace}. The runtime <b>may</b> still use this space if there are active dependencies (e.g, compositions in progress).</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code space}, and any child handles, <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrCreateActionSpace CreateActionSpace}, {@link #xrCreateReferenceSpace CreateReferenceSpace}</p>
     *
     * @param space a handle to an {@code XrSpace} previously created by a function such as {@link #xrCreateReferenceSpace CreateReferenceSpace}.
     */
    @NativeType("XrResult")
    public static int xrDestroySpace(XrSpace space) {
        long __functionAddress = space.getCapabilities().xrDestroySpace;
        return callPI(space.address(), __functionAddress);
    }

    // --- [ xrEnumerateViewConfigurations ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateViewConfigurations EnumerateViewConfigurations}
     *
     * @param viewConfigurationsTypeCapacityInput the capacity of the {@code viewConfigurations} array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrEnumerateViewConfigurations(XrInstance instance, long systemId, int viewConfigurationsTypeCapacityInput, long viewConfigurationsTypeCountOutput, long viewConfigurationsTypes) {
        long __functionAddress = instance.getCapabilities().xrEnumerateViewConfigurations;
        return callPJPPI(instance.address(), systemId, viewConfigurationsTypeCapacityInput, viewConfigurationsTypeCountOutput, viewConfigurationsTypes, __functionAddress);
    }

    /**
     * Enumerates supported view configurations.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnumerateViewConfigurations EnumerateViewConfigurations} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateViewConfigurations(
     *     XrInstance                                  instance,
     *     XrSystemId                                  systemId,
     *     uint32_t                                    viewConfigurationsTypeCapacityInput,
     *     uint32_t*                                   viewConfigurationsTypeCountOutput,
     *     XrViewConfigurationType*                    viewConfigurationsTypes);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrEnumerateViewConfigurations EnumerateViewConfigurations} enumerates the view configuration types supported by the {@code XrSystemId}. The supported set for that system <b>must</b> not change during the lifetime of its {@code XrInstance}. The returned list of primary view configurations <b>should</b> be in order from what the runtime considered highest to lowest user preference. Thus the first enumerated view configuration type <b>should</b> be the one the runtime prefers the application to use if possible.</p>
     * 
     * <p>Runtimes <b>must</b> always return identical buffer contents from this enumeration for the given {@code systemId} and for the lifetime of the instance.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code viewConfigurationsTypeCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code viewConfigurationsTypeCapacityInput} is not 0, {@code viewConfigurationsTypes} <b>must</b> be a pointer to an array of {@code viewConfigurationsTypeCapacityInput} {@code XrViewConfigurationType} values</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link #XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * </ul></dd>
     * </dl>
     *
     * @param instance                          the instance from which {@code systemId} was retrieved.
     * @param systemId                          the {@code XrSystemId} whose view configurations will be enumerated.
     * @param viewConfigurationsTypeCountOutput a pointer to the count of {@code viewConfigurations} written, or a pointer to the required capacity in the case that {@code viewConfigurationsTypeCapacityInput} is 0.
     * @param viewConfigurationsTypes           a pointer to an array of {@code XrViewConfigurationType} values, but <b>can</b> be {@code NULL} if {@code viewConfigurationsTypeCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumerateViewConfigurations(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer viewConfigurationsTypeCountOutput, @Nullable @NativeType("XrViewConfigurationType *") IntBuffer viewConfigurationsTypes) {
        if (CHECKS) {
            check(viewConfigurationsTypeCountOutput, 1);
        }
        return nxrEnumerateViewConfigurations(instance, systemId, remainingSafe(viewConfigurationsTypes), memAddress(viewConfigurationsTypeCountOutput), memAddressSafe(viewConfigurationsTypes));
    }

    // --- [ xrGetViewConfigurationProperties ] ---

    /** Unsafe version of: {@link #xrGetViewConfigurationProperties GetViewConfigurationProperties} */
    public static int nxrGetViewConfigurationProperties(XrInstance instance, long systemId, int viewConfigurationType, long configurationProperties) {
        long __functionAddress = instance.getCapabilities().xrGetViewConfigurationProperties;
        return callPJPI(instance.address(), systemId, viewConfigurationType, configurationProperties, __functionAddress);
    }

    /**
     * Gets information for a view configuration.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetViewConfigurationProperties GetViewConfigurationProperties} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetViewConfigurationProperties(
     *     XrInstance                                  instance,
     *     XrSystemId                                  systemId,
     *     XrViewConfigurationType                     viewConfigurationType,
     *     XrViewConfigurationProperties*              configurationProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrGetViewConfigurationProperties GetViewConfigurationProperties} queries properties of an individual view configuration. Applications <b>must</b> use one of the supported view configuration types returned by {@link #xrEnumerateViewConfigurations EnumerateViewConfigurations}. If {@code viewConfigurationType} is not supported by this {@code XrInstance} the runtime <b>must</b> return {@link #XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
     * <li>{@code configurationProperties} <b>must</b> be a pointer to an {@link XrViewConfigurationProperties} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrViewConfigurationProperties}</p>
     *
     * @param instance                the instance from which {@code systemId} was retrieved.
     * @param systemId                the {@code XrSystemId} whose view configuration is being queried.
     * @param viewConfigurationType   the {@code XrViewConfigurationType} of the configuration to get.
     * @param configurationProperties a pointer to view configuration properties to return.
     */
    @NativeType("XrResult")
    public static int xrGetViewConfigurationProperties(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("XrViewConfigurationProperties *") XrViewConfigurationProperties configurationProperties) {
        return nxrGetViewConfigurationProperties(instance, systemId, viewConfigurationType, configurationProperties.address());
    }

    // --- [ xrEnumerateViewConfigurationViews ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateViewConfigurationViews EnumerateViewConfigurationViews}
     *
     * @param viewCapacityInput the capacity of the {@code views} array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrEnumerateViewConfigurationViews(XrInstance instance, long systemId, int viewConfigurationType, int viewCapacityInput, long viewCountOutput, long views) {
        long __functionAddress = instance.getCapabilities().xrEnumerateViewConfigurationViews;
        return callPJPPI(instance.address(), systemId, viewConfigurationType, viewCapacityInput, viewCountOutput, views, __functionAddress);
    }

    /**
     * Gets view configuration views.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnumerateViewConfigurationViews EnumerateViewConfigurationViews} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateViewConfigurationViews(
     *     XrInstance                                  instance,
     *     XrSystemId                                  systemId,
     *     XrViewConfigurationType                     viewConfigurationType,
     *     uint32_t                                    viewCapacityInput,
     *     uint32_t*                                   viewCountOutput,
     *     XrViewConfigurationView*                    views);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Each {@code XrViewConfigurationType} defines the number of views associated with it. Applications can query more details of each view element using {@link #xrEnumerateViewConfigurationViews EnumerateViewConfigurationViews}. If the supplied {@code viewConfigurationType} is not supported by this {@code XrInstance} and {@code XrSystemId}, the runtime <b>must</b> return {@link #XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED}.</p>
     * 
     * <p>Runtimes <b>must</b> always return identical buffer contents from this enumeration for the given {@code systemId} and {@code viewConfigurationType} for the lifetime of the instance.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
     * <li>{@code viewCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code viewCapacityInput} is not 0, {@code views} <b>must</b> be a pointer to an array of {@code viewCapacityInput} {@link XrViewConfigurationView} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link #XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrViewConfigurationView}, {@link #xrGetViewConfigurationProperties GetViewConfigurationProperties}</p>
     *
     * @param instance              the instance from which {@code systemId} was retrieved.
     * @param systemId              the {@code XrSystemId} whose view configuration is being queried.
     * @param viewConfigurationType the {@code XrViewConfigurationType} of the configuration to get.
     * @param viewCountOutput       a pointer to the count of {@code views} written, or a pointer to the required capacity in the case that {@code viewCapacityInput} is 0.
     * @param views                 a pointer to an array of {@link XrViewConfigurationView} values, but <b>can</b> be {@code NULL} if {@code viewCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumerateViewConfigurationViews(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("uint32_t *") IntBuffer viewCountOutput, @Nullable @NativeType("XrViewConfigurationView *") XrViewConfigurationView.Buffer views) {
        if (CHECKS) {
            check(viewCountOutput, 1);
        }
        return nxrEnumerateViewConfigurationViews(instance, systemId, viewConfigurationType, remainingSafe(views), memAddress(viewCountOutput), memAddressSafe(views));
    }

    // --- [ xrEnumerateSwapchainFormats ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateSwapchainFormats EnumerateSwapchainFormats}
     *
     * @param formatCapacityInput the capacity of the {@code formats}, or 0 to retrieve the required capacity.
     */
    public static int nxrEnumerateSwapchainFormats(XrSession session, int formatCapacityInput, long formatCountOutput, long formats) {
        long __functionAddress = session.getCapabilities().xrEnumerateSwapchainFormats;
        return callPPPI(session.address(), formatCapacityInput, formatCountOutput, formats, __functionAddress);
    }

    /**
     * Enumerates swapchain formats.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnumerateSwapchainFormats EnumerateSwapchainFormats} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateSwapchainFormats(
     *     XrSession                                   session,
     *     uint32_t                                    formatCapacityInput,
     *     uint32_t*                                   formatCountOutput,
     *     int64_t*                                    formats);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrEnumerateSwapchainFormats EnumerateSwapchainFormats} enumerates the texture formats supported by the current session. The type of formats returned are dependent on the graphics API specified in {@link #xrCreateSession CreateSession}. For example, if a DirectX graphics API was specified, then the enumerated formats correspond to the DXGI formats, such as {@code DXGI_FORMAT_R8G8B8A8_UNORM_SRGB}. Texture formats <b>should</b> be in order from highest to lowest runtime preference. The application <b>should</b> use the highest preference format that it supports for optimal performance and quality.</p>
     * 
     * <p>Runtimes <b>must</b> always return identical buffer contents from this enumeration for the lifetime of the session.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code formatCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code formatCapacityInput} is not 0, {@code formats} <b>must</b> be a pointer to an array of {@code formatCapacityInput} {@code int64_t} values</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrCreateSwapchain CreateSwapchain}</p>
     *
     * @param session           the session that enumerates the supported formats.
     * @param formatCountOutput a pointer to the count of {@code uint64_t} formats written, or a pointer to the required capacity in the case that {@code formatCapacityInput} is 0.
     * @param formats           a pointer to an array of {@code int64_t} format ids, but <b>can</b> be {@code NULL} if {@code formatCapacityInput} is 0. The format ids are specific to the specified graphics API.
     */
    @NativeType("XrResult")
    public static int xrEnumerateSwapchainFormats(XrSession session, @NativeType("uint32_t *") IntBuffer formatCountOutput, @Nullable @NativeType("int64_t *") LongBuffer formats) {
        if (CHECKS) {
            check(formatCountOutput, 1);
        }
        return nxrEnumerateSwapchainFormats(session, remainingSafe(formats), memAddress(formatCountOutput), memAddressSafe(formats));
    }

    // --- [ xrCreateSwapchain ] ---

    /** Unsafe version of: {@link #xrCreateSwapchain CreateSwapchain} */
    public static int nxrCreateSwapchain(XrSession session, long createInfo, long swapchain) {
        long __functionAddress = session.getCapabilities().xrCreateSwapchain;
        return callPPPI(session.address(), createInfo, swapchain, __functionAddress);
    }

    /**
     * Creates an XrSwapchain.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateSwapchain CreateSwapchain} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateSwapchain(
     *     XrSession                                   session,
     *     const XrSwapchainCreateInfo*                createInfo,
     *     XrSwapchain*                                swapchain);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Creates an {@code XrSwapchain} handle. The returned swapchain handle <b>may</b> be subsequently used in API calls. Multiple {@code XrSwapchain} handles may exist simultaneously, up to some limit imposed by the runtime. The {@code XrSwapchain} handle <b>must</b> be eventually freed via the {@link #xrDestroySwapchain DestroySwapchain} function. The runtime <b>must</b> return {@link #XR_ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED} if the image format specified in the {@link XrSwapchainCreateInfo} is unsupported. The runtime <b>must</b> return {@link #XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} if any bit of the create flags specified in the {@link XrSwapchainCreateInfo} is unsupported.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrSwapchainCreateInfo} structure</li>
     * <li>{@code swapchain} <b>must</b> be a pointer to an {@code XrSwapchain} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link #XR_ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSwapchainCreateInfo}, {@link #xrAcquireSwapchainImage AcquireSwapchainImage}, {@link #xrDestroySwapchain DestroySwapchain}, {@link #xrEnumerateSwapchainFormats EnumerateSwapchainFormats}, {@link #xrEnumerateSwapchainImages EnumerateSwapchainImages}, {@link #xrReleaseSwapchainImage ReleaseSwapchainImage}</p>
     *
     * @param session    the session that creates the image.
     * @param createInfo a pointer to an {@link XrSwapchainCreateInfo} structure containing parameters to be used to create the image.
     * @param swapchain  a pointer to a handle in which the created {@code XrSwapchain} is returned.
     */
    @NativeType("XrResult")
    public static int xrCreateSwapchain(XrSession session, @NativeType("XrSwapchainCreateInfo const *") XrSwapchainCreateInfo createInfo, @NativeType("XrSwapchain *") PointerBuffer swapchain) {
        if (CHECKS) {
            check(swapchain, 1);
        }
        return nxrCreateSwapchain(session, createInfo.address(), memAddress(swapchain));
    }

    // --- [ xrDestroySwapchain ] ---

    /**
     * Destroys an XrSwapchain.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroySwapchain DestroySwapchain} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroySwapchain(
     *     XrSwapchain                                 swapchain);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>All submitted graphics API commands that refer to {@code swapchain} <b>must</b> have completed execution. Runtimes <b>may</b> continue to utilize swapchain images after {@link #xrDestroySwapchain DestroySwapchain} is called.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code swapchain}, and any child handles, <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrCreateSwapchain CreateSwapchain}</p>
     *
     * @param swapchain the swapchain to destroy.
     */
    @NativeType("XrResult")
    public static int xrDestroySwapchain(XrSwapchain swapchain) {
        long __functionAddress = swapchain.getCapabilities().xrDestroySwapchain;
        return callPI(swapchain.address(), __functionAddress);
    }

    // --- [ xrEnumerateSwapchainImages ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateSwapchainImages EnumerateSwapchainImages}
     *
     * @param imageCapacityInput the capacity of the {@code images} array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrEnumerateSwapchainImages(XrSwapchain swapchain, int imageCapacityInput, long imageCountOutput, long images) {
        long __functionAddress = swapchain.getCapabilities().xrEnumerateSwapchainImages;
        return callPPPI(swapchain.address(), imageCapacityInput, imageCountOutput, images, __functionAddress);
    }

    /**
     * Gets images from an XrSwapchain.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnumerateSwapchainImages EnumerateSwapchainImages} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateSwapchainImages(
     *     XrSwapchain                                 swapchain,
     *     uint32_t                                    imageCapacityInput,
     *     uint32_t*                                   imageCountOutput,
     *     XrSwapchainImageBaseHeader*                 images);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Fills an array of graphics API-specific {@code XrSwapchainImage} structures. The resources <b>must</b> be constant and valid for the lifetime of the {@code XrSwapchain}.</p>
     * 
     * <p>Runtimes <b>must</b> always return identical buffer contents from this enumeration for the lifetime of the swapchain.</p>
     * 
     * <p>Note: {@code images} is a pointer to an array of structures of graphics API-specific type, not an array of structure pointers.</p>
     * 
     * <p>The pointer submitted as {@code images} will be treated as an array of the expected graphics API-specific type based on the graphics API used at session creation time. If the {@code type} member of any array element accessed in this way does not match the expected value, the runtime <b>must</b> return {@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Under a typical memory model, a runtime must treat the supplied pointer as an opaque blob beginning with {@link XrSwapchainImageBaseHeader}, until after it has verified the {@code type}.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
     * <li>{@code imageCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code imageCapacityInput} is not 0, {@code images} <b>must</b> be a pointer to an array of {@code imageCapacityInput} {@link XrSwapchainImageBaseHeader}-based structures. See also: {@link XrSwapchainImageOpenGLESKHR}, {@link XrSwapchainImageOpenGLKHR}, {@link XrSwapchainImageVulkanKHR}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSwapchainImageBaseHeader}, {@link #xrCreateSwapchain CreateSwapchain}</p>
     *
     * @param swapchain        the {@code XrSwapchain} to get images from.
     * @param imageCountOutput a pointer to the count of {@code images} written, or a pointer to the required capacity in the case that {@code imageCapacityInput} is 0.
     * @param images           a pointer to an array of graphics API-specific {@code XrSwapchainImage} structures, all of the same type, based on {@link XrSwapchainImageBaseHeader}. It <b>can</b> be {@code NULL} if {@code imageCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumerateSwapchainImages(XrSwapchain swapchain, @NativeType("uint32_t *") IntBuffer imageCountOutput, @Nullable @NativeType("XrSwapchainImageBaseHeader *") XrSwapchainImageBaseHeader.Buffer images) {
        if (CHECKS) {
            check(imageCountOutput, 1);
        }
        return nxrEnumerateSwapchainImages(swapchain, remainingSafe(images), memAddress(imageCountOutput), memAddressSafe(images));
    }

    // --- [ xrAcquireSwapchainImage ] ---

    /** Unsafe version of: {@link #xrAcquireSwapchainImage AcquireSwapchainImage} */
    public static int nxrAcquireSwapchainImage(XrSwapchain swapchain, long acquireInfo, long index) {
        long __functionAddress = swapchain.getCapabilities().xrAcquireSwapchainImage;
        return callPPPI(swapchain.address(), acquireInfo, index, __functionAddress);
    }

    /**
     * Acquire a swapchain image.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrAcquireSwapchainImage AcquireSwapchainImage} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrAcquireSwapchainImage(
     *     XrSwapchain                                 swapchain,
     *     const XrSwapchainImageAcquireInfo*          acquireInfo,
     *     uint32_t*                                   index);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Acquires the image corresponding to the {@code index} position in the array returned by {@link #xrEnumerateSwapchainImages EnumerateSwapchainImages}. The runtime <b>must</b> return {@link #XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID} if the next available index has already been acquired and not yet released with {@link #xrReleaseSwapchainImage ReleaseSwapchainImage}. If the {@code swapchain} was created with the {@link #XR_SWAPCHAIN_CREATE_STATIC_IMAGE_BIT SWAPCHAIN_CREATE_STATIC_IMAGE_BIT} set in {@link XrSwapchainCreateInfo}{@code ::createFlags}, this function <b>must</b> not have been previously called for this swapchain. The runtime <b>must</b> return {@link #XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID} if a {@code swapchain} created with the {@link #XR_SWAPCHAIN_CREATE_STATIC_IMAGE_BIT SWAPCHAIN_CREATE_STATIC_IMAGE_BIT} set in {@link XrSwapchainCreateInfo}{@code ::createFlags} and this function has been successfully called previously for this swapchain.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
     * <li>If {@code acquireInfo} is not {@code NULL}, {@code acquireInfo} <b>must</b> be a pointer to a valid {@link XrSwapchainImageAcquireInfo} structure</li>
     * <li>{@code index} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSwapchainImageAcquireInfo}, {@link #xrCreateSwapchain CreateSwapchain}, {@link #xrDestroySwapchain DestroySwapchain}, {@link #xrEnumerateSwapchainImages EnumerateSwapchainImages}, {@link #xrReleaseSwapchainImage ReleaseSwapchainImage}, {@link #xrWaitSwapchainImage WaitSwapchainImage}</p>
     *
     * @param swapchain   the swapchain from which to acquire an image.
     * @param acquireInfo exists for extensibility purposes, it is {@code NULL} or a pointer to a valid {@link XrSwapchainImageAcquireInfo}.
     * @param index       the returned image index that has been acquired.
     */
    @NativeType("XrResult")
    public static int xrAcquireSwapchainImage(XrSwapchain swapchain, @Nullable @NativeType("XrSwapchainImageAcquireInfo const *") XrSwapchainImageAcquireInfo acquireInfo, @NativeType("uint32_t *") IntBuffer index) {
        if (CHECKS) {
            check(index, 1);
        }
        return nxrAcquireSwapchainImage(swapchain, memAddressSafe(acquireInfo), memAddress(index));
    }

    // --- [ xrWaitSwapchainImage ] ---

    /** Unsafe version of: {@link #xrWaitSwapchainImage WaitSwapchainImage} */
    public static int nxrWaitSwapchainImage(XrSwapchain swapchain, long waitInfo) {
        long __functionAddress = swapchain.getCapabilities().xrWaitSwapchainImage;
        return callPPI(swapchain.address(), waitInfo, __functionAddress);
    }

    /**
     * Wait for a swapchain image to be available.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrWaitSwapchainImage WaitSwapchainImage} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrWaitSwapchainImage(
     *     XrSwapchain                                 swapchain,
     *     const XrSwapchainImageWaitInfo*             waitInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Before an application can begin writing to a swapchain image, it must first wait on the image to avoid writing to it before the compositor has finished reading from it. {@link #xrWaitSwapchainImage WaitSwapchainImage} will implicitly wait on the oldest acquired swapchain image which has not yet been successfully waited on. Once a swapchain image has been successfully waited on without timeout, the app <b>must</b> release before waiting on the next acquired swapchain image.</p>
     * 
     * <p>This function may block for longer than the timeout specified in {@link XrSwapchainImageWaitInfo} due to scheduling or contention.</p>
     * 
     * <p>If the timeout expires without the image becoming available for writing, {@link #XR_TIMEOUT_EXPIRED TIMEOUT_EXPIRED} <b>must</b> be returned. If {@link #xrWaitSwapchainImage WaitSwapchainImage} returns {@link #XR_TIMEOUT_EXPIRED TIMEOUT_EXPIRED}, the next call to {@link #xrWaitSwapchainImage WaitSwapchainImage} will wait on the same image index again until the function succeeds with {@link #XR_SUCCESS SUCCESS}. Note that this is not an error code; {@code XR_SUCCEEDED({@link #XR_TIMEOUT_EXPIRED TIMEOUT_EXPIRED})} is {@code true}.</p>
     * 
     * <p>The runtime <b>must</b> eventually relinquish ownership of a swapchain image to the application and <b>must</b> not block indefinitely.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID} if no image has been acquired by calling {@link #xrAcquireSwapchainImage AcquireSwapchainImage}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
     * <li>{@code waitInfo} <b>must</b> be a pointer to a valid {@link XrSwapchainImageWaitInfo} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * <li>{@link #XR_TIMEOUT_EXPIRED TIMEOUT_EXPIRED}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSwapchainImageWaitInfo}, {@link #xrAcquireSwapchainImage AcquireSwapchainImage}, {@link #xrCreateSwapchain CreateSwapchain}, {@link #xrDestroySwapchain DestroySwapchain}, {@link #xrEnumerateSwapchainImages EnumerateSwapchainImages}, {@link #xrReleaseSwapchainImage ReleaseSwapchainImage}</p>
     *
     * @param swapchain the swapchain from which to wait for an image.
     * @param waitInfo  a pointer to an {@link XrSwapchainImageWaitInfo} structure.
     */
    @NativeType("XrResult")
    public static int xrWaitSwapchainImage(XrSwapchain swapchain, @NativeType("XrSwapchainImageWaitInfo const *") XrSwapchainImageWaitInfo waitInfo) {
        return nxrWaitSwapchainImage(swapchain, waitInfo.address());
    }

    // --- [ xrReleaseSwapchainImage ] ---

    /** Unsafe version of: {@link #xrReleaseSwapchainImage ReleaseSwapchainImage} */
    public static int nxrReleaseSwapchainImage(XrSwapchain swapchain, long releaseInfo) {
        long __functionAddress = swapchain.getCapabilities().xrReleaseSwapchainImage;
        return callPPI(swapchain.address(), releaseInfo, __functionAddress);
    }

    /**
     * Release a swapchain image.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrReleaseSwapchainImage ReleaseSwapchainImage} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrReleaseSwapchainImage(
     *     XrSwapchain                                 swapchain,
     *     const XrSwapchainImageReleaseInfo*          releaseInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If the {@code swapchain} was created with the {@link #XR_SWAPCHAIN_CREATE_STATIC_IMAGE_BIT SWAPCHAIN_CREATE_STATIC_IMAGE_BIT} set in {@link XrSwapchainCreateInfo}{@code ::createFlags} structure, this function <b>must</b> not have been previously called for this swapchain.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID} if no image has been waited on by calling {@link #xrWaitSwapchainImage WaitSwapchainImage}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
     * <li>If {@code releaseInfo} is not {@code NULL}, {@code releaseInfo} <b>must</b> be a pointer to a valid {@link XrSwapchainImageReleaseInfo} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSwapchainImageReleaseInfo}, {@link #xrAcquireSwapchainImage AcquireSwapchainImage}, {@link #xrCreateSwapchain CreateSwapchain}, {@link #xrDestroySwapchain DestroySwapchain}, {@link #xrEnumerateSwapchainImages EnumerateSwapchainImages}, {@link #xrWaitSwapchainImage WaitSwapchainImage}</p>
     *
     * @param swapchain   the {@code XrSwapchain} from which to release an image.
     * @param releaseInfo exists for extensibility purposes, it is {@code NULL} or a pointer to a valid {@link XrSwapchainImageReleaseInfo}.
     */
    @NativeType("XrResult")
    public static int xrReleaseSwapchainImage(XrSwapchain swapchain, @Nullable @NativeType("XrSwapchainImageReleaseInfo const *") XrSwapchainImageReleaseInfo releaseInfo) {
        return nxrReleaseSwapchainImage(swapchain, memAddressSafe(releaseInfo));
    }

    // --- [ xrBeginSession ] ---

    /** Unsafe version of: {@link #xrBeginSession BeginSession} */
    public static int nxrBeginSession(XrSession session, long beginInfo) {
        long __functionAddress = session.getCapabilities().xrBeginSession;
        return callPPI(session.address(), beginInfo, __functionAddress);
    }

    /**
     * Begins an XrSession.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrBeginSession BeginSession} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrBeginSession(
     *     XrSession                                   session,
     *     const XrSessionBeginInfo*                   beginInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When the application receives {@link XrEventDataSessionStateChanged} event with the {@link #XR_SESSION_STATE_READY SESSION_STATE_READY} state, the application <b>should</b> then call {@link #xrBeginSession BeginSession} to start rendering frames for display to the user.</p>
     * 
     * <p>After this function successfully returns, the session <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session_running">is considered to be running</a>. The application <b>should</b> then start its frame loop consisting of some sequence of {@link #xrWaitFrame WaitFrame}/{@link #xrBeginFrame BeginFrame}/{@link #xrEndFrame EndFrame} calls.</p>
     * 
     * <p>If the session <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session_running">is already running</a> when the application calls {@link #xrBeginSession BeginSession}, the runtime <b>must</b> return error {@link #XR_ERROR_SESSION_RUNNING ERROR_SESSION_RUNNING}. If the session <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session_not_running">is not running</a> when the application calls {@link #xrBeginSession BeginSession}, but the session is not yet in the {@link #XR_SESSION_STATE_READY SESSION_STATE_READY} state, the runtime <b>must</b> return error {@link #XR_ERROR_SESSION_NOT_READY ERROR_SESSION_NOT_READY}.</p>
     * 
     * <p>Note that a runtime <b>may</b> decide not to show the user any given frame from a session at any time, for example if the user has switched to a different application’s running session. The application should check whether {@link #xrWaitFrame WaitFrame} returns an {@link XrFrameState} with {@code shouldRender} set to true before rendering a given frame to determine whether that frame will be visible to the user.</p>
     * 
     * <p>Runtime session frame state <b>must</b> start in a reset state when a session transitions to <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session_running">running</a> so that no state is carried over from when the same session was previously running.</p>
     * 
     * <p>If {@code primaryViewConfigurationType} in {@code beginInfo} is not supported by the {@code XrSystemId} used to create the {@code session}, the runtime <b>must</b> return {@link #XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code beginInfo} <b>must</b> be a pointer to a valid {@link XrSessionBeginInfo} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_SESSION_RUNNING ERROR_SESSION_RUNNING}</li>
     * <li>{@link #XR_ERROR_SESSION_NOT_READY ERROR_SESSION_NOT_READY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSessionBeginInfo}, {@link #xrCreateSession CreateSession}, {@link #xrDestroySession DestroySession}, {@link #xrEndSession EndSession}</p>
     *
     * @param session   a valid {@code XrSession} handle.
     * @param beginInfo a pointer to an {@link XrSessionBeginInfo} structure.
     */
    @NativeType("XrResult")
    public static int xrBeginSession(XrSession session, @NativeType("XrSessionBeginInfo const *") XrSessionBeginInfo beginInfo) {
        return nxrBeginSession(session, beginInfo.address());
    }

    // --- [ xrEndSession ] ---

    /**
     * Ends an XrSession.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEndSession EndSession} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEndSession(
     *     XrSession                                   session);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When the application receives {@link XrEventDataSessionStateChanged} event with the {@link #XR_SESSION_STATE_STOPPING SESSION_STATE_STOPPING} state, the application should stop its frame loop and then call {@link #xrEndSession EndSession} to end the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session_running">running</a> session. This function signals to the runtime that the application will no longer call {@link #xrWaitFrame WaitFrame}, {@link #xrBeginFrame BeginFrame} or {@link #xrEndFrame EndFrame} from any thread allowing the runtime to safely transition the session to {@link #XR_SESSION_STATE_IDLE SESSION_STATE_IDLE}. The application <b>must</b> also avoid reading input state or sending haptic output after calling {@link #xrEndSession EndSession}.</p>
     * 
     * <p>If the session <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session_not_running">is not running</a> when the application calls {@link #xrEndSession EndSession}, the runtime <b>must</b> return error {@link #XR_ERROR_SESSION_NOT_RUNNING ERROR_SESSION_NOT_RUNNING}. If the session <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session_running">is still running</a> when the application calls {@link #xrEndSession EndSession}, but the session is not yet in the {@link #XR_SESSION_STATE_STOPPING SESSION_STATE_STOPPING} state, the runtime <b>must</b> return error {@link #XR_ERROR_SESSION_NOT_STOPPING ERROR_SESSION_NOT_STOPPING}.</p>
     * 
     * <p>If the application wishes to exit a running session, the application can call {@link #xrRequestExitSession RequestExitSession} so that the session transitions from {@link #XR_SESSION_STATE_IDLE SESSION_STATE_IDLE} to {@link #XR_SESSION_STATE_EXITING SESSION_STATE_EXITING}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_NOT_STOPPING ERROR_SESSION_NOT_STOPPING}</li>
     * <li>{@link #XR_ERROR_SESSION_NOT_RUNNING ERROR_SESSION_NOT_RUNNING}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrBeginSession BeginSession}, {@link #xrCreateSession CreateSession}, {@link #xrDestroySession DestroySession}</p>
     *
     * @param session a handle to a <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session_running">running</a> {@code XrSession}.
     */
    @NativeType("XrResult")
    public static int xrEndSession(XrSession session) {
        long __functionAddress = session.getCapabilities().xrEndSession;
        return callPI(session.address(), __functionAddress);
    }

    // --- [ xrRequestExitSession ] ---

    /**
     * Request to exit a running session.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>When an application wishes to exit a <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session_running">running</a> session, it <b>can</b> call {@link #xrRequestExitSession RequestExitSession}, requesting that the runtime transition through the various intermediate session states including {@link #XR_SESSION_STATE_STOPPING SESSION_STATE_STOPPING} to {@link #XR_SESSION_STATE_EXITING SESSION_STATE_EXITING}.</p>
     * 
     * <p>On platforms where an application’s lifecycle is managed by the system, session state changes may be implicitly triggered by application lifecycle state changes. On such platforms, using platform-specific methods to alter application lifecycle state may be the preferred method of provoking session state changes. The behavior of {@link #xrRequestExitSession RequestExitSession} is not altered, however explicit session exit <b>may</b> not interact with the platform-specific application lifecycle.</p>
     * 
     * <p>The {@link #xrRequestExitSession RequestExitSession} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrRequestExitSession(
     *     XrSession                                   session);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code session} <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session_not_running">is not running</a> when {@link #xrRequestExitSession RequestExitSession} is called, {@link #XR_ERROR_SESSION_NOT_RUNNING ERROR_SESSION_NOT_RUNNING} <b>must</b> be returned.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_NOT_RUNNING ERROR_SESSION_NOT_RUNNING}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrDestroySession DestroySession}, {@link #xrEndSession EndSession}</p>
     *
     * @param session a handle to a running {@code XrSession}.
     */
    @NativeType("XrResult")
    public static int xrRequestExitSession(XrSession session) {
        long __functionAddress = session.getCapabilities().xrRequestExitSession;
        return callPI(session.address(), __functionAddress);
    }

    // --- [ xrWaitFrame ] ---

    /** Unsafe version of: {@link #xrWaitFrame WaitFrame} */
    public static int nxrWaitFrame(XrSession session, long frameWaitInfo, long frameState) {
        long __functionAddress = session.getCapabilities().xrWaitFrame;
        return callPPPI(session.address(), frameWaitInfo, frameState, __functionAddress);
    }

    /**
     * Frame timing function.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrWaitFrame WaitFrame} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrWaitFrame(
     *     XrSession                                   session,
     *     const XrFrameWaitInfo*                      frameWaitInfo,
     *     XrFrameState*                               frameState);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrWaitFrame WaitFrame} throttles the application frame loop in order to synchronize application frame submissions with the display. {@link #xrWaitFrame WaitFrame} returns a predicted display time for the next time that the runtime predicts a composited frame will be displayed. The runtime <b>may</b> affect this computation by changing the return values and throttling of {@link #xrWaitFrame WaitFrame} in response to feedback from frame submission and completion times in {@link #xrEndFrame EndFrame}. An application <b>must</b> eventually match each {@link #xrWaitFrame WaitFrame} call with one call to {@link #xrBeginFrame BeginFrame}. A subsequent {@link #xrWaitFrame WaitFrame} call <b>must</b> block until the previous frame has been begun with {@link #xrBeginFrame BeginFrame} and <b>must</b> unblock independently of the corresponding call to {@link #xrEndFrame EndFrame}. When less than one frame interval has passed since the previous return from {@link #xrWaitFrame WaitFrame}, the runtime <b>should</b> block until the beginning of the next frame interval. If more than one frame interval has passed since the last return from {@link #xrWaitFrame WaitFrame}, the runtime <b>may</b> return immediately or block until the beginning of the next frame interval.</p>
     * 
     * <p>In the case that an application has pipelined frame submissions, the application <b>should</b> compute the appropriate target display time using both the predicted display time and predicted display interval. The application <b>should</b> use the computed target display time when requesting space and view locations for rendering.</p>
     * 
     * <p>The {@link XrFrameState}{@code ::predictedDisplayTime} returned by {@link #xrWaitFrame WaitFrame} <b>must</b> be monotonically increasing.</p>
     * 
     * <p>The runtime <b>may</b> dynamically adjust the start time of the frame interval relative to the display hardware’s refresh cycle to minimize graphics processor contention between the application and the compositor.</p>
     * 
     * <p>{@link #xrWaitFrame WaitFrame} <b>must</b> be callable from any thread, including a different thread than {@link #xrBeginFrame BeginFrame}/{@link #xrEndFrame EndFrame} are being called from.</p>
     * 
     * <p>Calling {@link #xrWaitFrame WaitFrame} <b>must</b> be externally synchronized by the application, concurrent calls <b>may</b> result in undefined behavior.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_SESSION_NOT_RUNNING ERROR_SESSION_NOT_RUNNING} if the {@code session} <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session_not_running">is not running</a>.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The engine simulation <b>should</b> advance based on the display time. Every stage in the engine pipeline should use the exact same display time for one particular application-generated frame. An accurate and consistent display time across all stages and threads in the engine pipeline is important to avoid object motion judder. If the application has multiple pipeline stages, the application should pass its computed display time through its pipeline, as {@link #xrWaitFrame WaitFrame} must be called only once per frame.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>If {@code frameWaitInfo} is not {@code NULL}, {@code frameWaitInfo} <b>must</b> be a pointer to a valid {@link XrFrameWaitInfo} structure</li>
     * <li>{@code frameState} <b>must</b> be a pointer to an {@link XrFrameState} structure</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to the {@code session} parameter by any other {@link #xrWaitFrame WaitFrame} call <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_NOT_RUNNING ERROR_SESSION_NOT_RUNNING}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFrameState}, {@link XrFrameWaitInfo}, {@link #xrBeginFrame BeginFrame}, {@link #xrEndFrame EndFrame}</p>
     *
     * @param session       a valid {@code XrSession} handle.
     * @param frameWaitInfo exists for extensibility purposes, it is {@code NULL} or a pointer to a valid {@link XrFrameWaitInfo}.
     * @param frameState    a pointer to a valid {@link XrFrameState}, an output parameter.
     */
    @NativeType("XrResult")
    public static int xrWaitFrame(XrSession session, @Nullable @NativeType("XrFrameWaitInfo const *") XrFrameWaitInfo frameWaitInfo, @NativeType("XrFrameState *") XrFrameState frameState) {
        return nxrWaitFrame(session, memAddressSafe(frameWaitInfo), frameState.address());
    }

    // --- [ xrBeginFrame ] ---

    /** Unsafe version of: {@link #xrBeginFrame BeginFrame} */
    public static int nxrBeginFrame(XrSession session, long frameBeginInfo) {
        long __functionAddress = session.getCapabilities().xrBeginFrame;
        return callPPI(session.address(), frameBeginInfo, __functionAddress);
    }

    /**
     * Marks a frame.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrBeginFrame BeginFrame} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrBeginFrame(
     *     XrSession                                   session,
     *     const XrFrameBeginInfo*                     frameBeginInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrBeginFrame BeginFrame} is called prior to the start of frame rendering. The application <b>should</b> still call {@link #xrBeginFrame BeginFrame} but omit rendering work for the frame if {@link XrFrameState}{@code ::shouldRender} is {@link #XR_FALSE FALSE}.</p>
     * 
     * <p>Runtimes <b>must</b> not perform frame synchronization or throttling through the {@link #xrBeginFrame BeginFrame} function and <b>should</b> instead do so through {@link #xrWaitFrame WaitFrame}.</p>
     * 
     * <p>The runtime <b>must</b> return the error code {@link #XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID} if there was no corresponding successful call to {@link #xrWaitFrame WaitFrame}.</p>
     * 
     * <p>The runtime <b>must</b> return the success code {@link #XR_FRAME_DISCARDED FRAME_DISCARDED} if a prior {@link #xrBeginFrame BeginFrame} has been called without an intervening call to {@link #xrEndFrame EndFrame}.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_SESSION_NOT_RUNNING ERROR_SESSION_NOT_RUNNING} if the {@code session} <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session_not_running">is not running</a>.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>If {@code frameBeginInfo} is not {@code NULL}, {@code frameBeginInfo} <b>must</b> be a pointer to a valid {@link XrFrameBeginInfo} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * <li>{@link #XR_FRAME_DISCARDED FRAME_DISCARDED}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_NOT_RUNNING ERROR_SESSION_NOT_RUNNING}</li>
     * <li>{@link #XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFrameBeginInfo}, {@link #xrEndFrame EndFrame}, {@link #xrWaitFrame WaitFrame}</p>
     *
     * @param session        a valid {@code XrSession} handle.
     * @param frameBeginInfo exists for extensibility purposes, it is {@code NULL} or a pointer to a valid {@link XrFrameBeginInfo}.
     */
    @NativeType("XrResult")
    public static int xrBeginFrame(XrSession session, @Nullable @NativeType("XrFrameBeginInfo const *") XrFrameBeginInfo frameBeginInfo) {
        return nxrBeginFrame(session, memAddressSafe(frameBeginInfo));
    }

    // --- [ xrEndFrame ] ---

    /** Unsafe version of: {@link #xrEndFrame EndFrame} */
    public static int nxrEndFrame(XrSession session, long frameEndInfo) {
        long __functionAddress = session.getCapabilities().xrEndFrame;
        return callPPI(session.address(), frameEndInfo, __functionAddress);
    }

    /**
     * Marks a frame.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEndFrame EndFrame} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEndFrame(
     *     XrSession                                   session,
     *     const XrFrameEndInfo*                       frameEndInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrEndFrame EndFrame} <b>may</b> return immediately to the application. {@link XrFrameEndInfo}{@code ::displayTime} <b>should</b> be computed using values returned by {@link #xrWaitFrame WaitFrame}. The runtime <b>should</b> be robust against variations in the timing of calls to {@link #xrWaitFrame WaitFrame}, since a pipelined system may call {@link #xrWaitFrame WaitFrame} on a separate thread from {@link #xrBeginFrame BeginFrame} and {@link #xrEndFrame EndFrame} without any synchronization guarantees.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>An accurate predicted display time is very important to avoid black pull-in by reprojection and to reduce motion judder in case the runtime does not implement a translational reprojection. Reprojection should never display images before the display refresh period they were predicted for, even if they are completed early, because this will cause motion judder just the same. In other words, the better the predicted display time, the less latency experienced by the user.</p>
     * </div>
     * 
     * <p>Every call to {@link #xrEndFrame EndFrame} <b>must</b> be preceded by a successful call to {@link #xrBeginFrame BeginFrame}. Failure to do so <b>must</b> result in {@link #XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID} being returned by {@link #xrEndFrame EndFrame}. {@link XrFrameEndInfo} <b>may</b> reference swapchains into which the application has rendered for this frame. From each {@code XrSwapchain} only one image index is implicitly referenced per frame, the one corresponding to the last call to {@link #xrReleaseSwapchainImage ReleaseSwapchainImage}. However, a specific swapchain (and by extension a specific swapchain image index) <b>may</b> be referenced in {@link XrFrameEndInfo} multiple times. This can be used for example to render a side by side image into a single swapchain image and referencing it twice with differing image rectangles in different layers.</p>
     * 
     * <p>If no layers are provided then the display <b>must</b> be cleared.</p>
     * 
     * <p>{@link #XR_ERROR_LAYER_INVALID ERROR_LAYER_INVALID} <b>must</b> be returned if an unknown, unsupported layer type, or {@code NULL} pointer is passed as one of the {@link XrFrameEndInfo}::layers.</p>
     * 
     * <p>{@link #XR_ERROR_LAYER_INVALID ERROR_LAYER_INVALID} <b>must</b> be returned if a layer references a swapchain that has no released swapchain image.</p>
     * 
     * <p>{@link #XR_ERROR_LAYER_LIMIT_EXCEEDED ERROR_LAYER_LIMIT_EXCEEDED} <b>must</b> be returned if {@link XrFrameEndInfo}::layerCount exceeds {@link XrSystemGraphicsProperties}::maxLayerCount or if the runtime is unable to composite the specified layers due to resource constraints.</p>
     * 
     * <p>{@link #XR_ERROR_SWAPCHAIN_RECT_INVALID ERROR_SWAPCHAIN_RECT_INVALID} <b>must</b> be returned if {@link XrFrameEndInfo}::layers contains a composition layer which references pixels outside of the associated swapchain image or if negatively sized.</p>
     * 
     * <p>{@link #XR_ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED} <b>must</b> be returned if {@link XrFrameEndInfo}::environmentBlendMode is not supported.</p>
     * 
     * <p>{@link #XR_ERROR_SESSION_NOT_RUNNING ERROR_SESSION_NOT_RUNNING} <b>must</b> be returned if the {@code session} <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session_not_running">is not running</a>.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Applications should discard frames for which {@link #xrEndFrame EndFrame} returns a recoverable error over attempting to resubmit the frame with different frame parameters to provide a more consistent experience across different runtime implementations.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code frameEndInfo} <b>must</b> be a pointer to a valid {@link XrFrameEndInfo} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * <li>{@link #XR_ERROR_SWAPCHAIN_RECT_INVALID ERROR_SWAPCHAIN_RECT_INVALID}</li>
     * <li>{@link #XR_ERROR_SESSION_NOT_RUNNING ERROR_SESSION_NOT_RUNNING}</li>
     * <li>{@link #XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * <li>{@link #XR_ERROR_LAYER_LIMIT_EXCEEDED ERROR_LAYER_LIMIT_EXCEEDED}</li>
     * <li>{@link #XR_ERROR_LAYER_INVALID ERROR_LAYER_INVALID}</li>
     * <li>{@link #XR_ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFrameEndInfo}, {@link #xrBeginFrame BeginFrame}, {@link #xrWaitFrame WaitFrame}</p>
     *
     * @param session      a valid {@code XrSession} handle.
     * @param frameEndInfo a pointer to a valid {@link XrFrameEndInfo}.
     */
    @NativeType("XrResult")
    public static int xrEndFrame(XrSession session, @NativeType("XrFrameEndInfo const *") XrFrameEndInfo frameEndInfo) {
        return nxrEndFrame(session, frameEndInfo.address());
    }

    // --- [ xrLocateViews ] ---

    /**
     * Unsafe version of: {@link #xrLocateViews LocateViews}
     *
     * @param viewCapacityInput an input parameter which specifies the capacity of the {@code views} array. The required capacity <b>must</b> be same as defined by the corresponding {@code XrViewConfigurationType}.
     */
    public static int nxrLocateViews(XrSession session, long viewLocateInfo, long viewState, int viewCapacityInput, long viewCountOutput, long views) {
        long __functionAddress = session.getCapabilities().xrLocateViews;
        if (CHECKS) {
            XrViewLocateInfo.validate(viewLocateInfo);
        }
        return callPPPPPI(session.address(), viewLocateInfo, viewState, viewCapacityInput, viewCountOutput, views, __functionAddress);
    }

    /**
     * Gets view and projection info.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrLocateViews LocateViews} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrLocateViews(
     *     XrSession                                   session,
     *     const XrViewLocateInfo*                     viewLocateInfo,
     *     XrViewState*                                viewState,
     *     uint32_t                                    viewCapacityInput,
     *     uint32_t*                                   viewCountOutput,
     *     XrView*                                     views);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrLocateViews LocateViews} function returns the view and projection info for a particular display time. This time is typically the target display time for a given frame. Repeatedly calling {@link #xrLocateViews LocateViews} with the same time <b>may</b> not necessarily return the same result. Instead the prediction gets increasingly accurate as the function is called closer to the given time for which a prediction is made. This allows an application to get the predicted views as late as possible in its pipeline to get the least amount of latency and prediction error.</p>
     * 
     * <p>{@link #xrLocateViews LocateViews} returns an array of {@link XrView} elements, one for each view of the specified view configuration type, along with an {@link XrViewState} containing additional state data shared across all views. The eye each view corresponds to is statically defined in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#view_configuration_type">{@code XrViewConfigurationType}</a> in case the application wants to apply eye-specific rendering traits. The {@link XrViewState} and {@link XrView} member data may change on subsequent calls to {@link #xrLocateViews LocateViews}, and so applications <b>must</b> not assume it to be constant.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code viewLocateInfo} <b>must</b> be a pointer to a valid {@link XrViewLocateInfo} structure</li>
     * <li>{@code viewState} <b>must</b> be a pointer to an {@link XrViewState} structure</li>
     * <li>{@code viewCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code viewCapacityInput} is not 0, {@code views} <b>must</b> be a pointer to an array of {@code viewCapacityInput} {@link XrView} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link #XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrView}, {@link XrViewLocateInfo}, {@link XrViewState}</p>
     *
     * @param session         a handle to the provided {@code XrSession}.
     * @param viewLocateInfo  a pointer to a valid {@link XrViewLocateInfo} structure.
     * @param viewState       the output structure with the viewer state information.
     * @param viewCountOutput an output parameter which identifies the valid count of {@code views}.
     * @param views           an array of {@link XrView}.
     */
    @NativeType("XrResult")
    public static int xrLocateViews(XrSession session, @NativeType("XrViewLocateInfo const *") XrViewLocateInfo viewLocateInfo, @NativeType("XrViewState *") XrViewState viewState, @NativeType("uint32_t *") IntBuffer viewCountOutput, @Nullable @NativeType("XrView *") XrView.Buffer views) {
        if (CHECKS) {
            check(viewCountOutput, 1);
        }
        return nxrLocateViews(session, viewLocateInfo.address(), viewState.address(), remainingSafe(views), memAddress(viewCountOutput), memAddressSafe(views));
    }

    // --- [ xrStringToPath ] ---

    /** Unsafe version of: {@link #xrStringToPath StringToPath} */
    public static int nxrStringToPath(XrInstance instance, long pathString, long path) {
        long __functionAddress = instance.getCapabilities().xrStringToPath;
        return callPPPI(instance.address(), pathString, path, __functionAddress);
    }

    /**
     * Converts a string to a semantic path.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrStringToPath StringToPath} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrStringToPath(
     *     XrInstance                                  instance,
     *     const char*                                 pathString,
     *     XrPath*                                     path);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrStringToPath StringToPath} retrieves the {@code XrPath} value for a well-formed path string. If such a value had not yet been assigned by the runtime to the provided path string in this {@code XrInstance}, one <b>must</b> be assigned at this point. All calls to this function with the same {@code XrInstance} and path string <b>must</b> retrieve the same {@code XrPath} value. Upon failure, {@link #xrStringToPath StringToPath} <b>must</b> return an appropriate {@code XrResult}, and <b>may</b> set the output parameter to {@link #XR_NULL_PATH NULL_PATH}. See <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#path-atom-type">Path Atom Type</a> for the conditions under which an error <b>may</b> be returned when this function is given a valid {@code XrInstance} and a well-formed path string.</p>
     * 
     * <p>If the runtime’s resources are exhausted and it cannot create the path, a return value of {@link #XR_ERROR_PATH_COUNT_EXCEEDED ERROR_PATH_COUNT_EXCEEDED} <b>must</b> be returned. If the application specifies a string that is not a well-formed path string, {@link #XR_ERROR_PATH_FORMAT_INVALID ERROR_PATH_FORMAT_INVALID} <b>must</b> be returned.</p>
     * 
     * <p>A return value of {@link #XR_SUCCESS SUCCESS} from {@link #xrStringToPath StringToPath} <b>may</b> not necessarily imply that the runtime has a component or other source of data that will be accessible through that semantic path. It only means that the path string supplied was well-formed and that the retrieved {@code XrPath} maps to the given path string within and during the lifetime of the {@code XrInstance} given.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code pathString} <b>must</b> be a null-terminated UTF-8 string</li>
     * <li>{@code path} <b>must</b> be a pointer to an {@code XrPath} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_PATH_FORMAT_INVALID ERROR_PATH_FORMAT_INVALID}</li>
     * <li>{@link #XR_ERROR_PATH_COUNT_EXCEEDED ERROR_PATH_COUNT_EXCEEDED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrPathToString PathToString}</p>
     *
     * @param instance   an instance previously created.
     * @param pathString the path name string to retrieve the associated {@code XrPath} for.
     * @param path       the output parameter, which <b>must</b> point to an {@code XrPath}. Given a well-formed path name string, this will be populated with an opaque value that is constant for that path string during the lifetime of that instance.
     */
    @NativeType("XrResult")
    public static int xrStringToPath(XrInstance instance, @NativeType("char const *") ByteBuffer pathString, @NativeType("XrPath *") LongBuffer path) {
        if (CHECKS) {
            checkNT1(pathString);
            check(path, 1);
        }
        return nxrStringToPath(instance, memAddress(pathString), memAddress(path));
    }

    /**
     * Converts a string to a semantic path.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrStringToPath StringToPath} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrStringToPath(
     *     XrInstance                                  instance,
     *     const char*                                 pathString,
     *     XrPath*                                     path);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrStringToPath StringToPath} retrieves the {@code XrPath} value for a well-formed path string. If such a value had not yet been assigned by the runtime to the provided path string in this {@code XrInstance}, one <b>must</b> be assigned at this point. All calls to this function with the same {@code XrInstance} and path string <b>must</b> retrieve the same {@code XrPath} value. Upon failure, {@link #xrStringToPath StringToPath} <b>must</b> return an appropriate {@code XrResult}, and <b>may</b> set the output parameter to {@link #XR_NULL_PATH NULL_PATH}. See <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#path-atom-type">Path Atom Type</a> for the conditions under which an error <b>may</b> be returned when this function is given a valid {@code XrInstance} and a well-formed path string.</p>
     * 
     * <p>If the runtime’s resources are exhausted and it cannot create the path, a return value of {@link #XR_ERROR_PATH_COUNT_EXCEEDED ERROR_PATH_COUNT_EXCEEDED} <b>must</b> be returned. If the application specifies a string that is not a well-formed path string, {@link #XR_ERROR_PATH_FORMAT_INVALID ERROR_PATH_FORMAT_INVALID} <b>must</b> be returned.</p>
     * 
     * <p>A return value of {@link #XR_SUCCESS SUCCESS} from {@link #xrStringToPath StringToPath} <b>may</b> not necessarily imply that the runtime has a component or other source of data that will be accessible through that semantic path. It only means that the path string supplied was well-formed and that the retrieved {@code XrPath} maps to the given path string within and during the lifetime of the {@code XrInstance} given.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code pathString} <b>must</b> be a null-terminated UTF-8 string</li>
     * <li>{@code path} <b>must</b> be a pointer to an {@code XrPath} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_PATH_FORMAT_INVALID ERROR_PATH_FORMAT_INVALID}</li>
     * <li>{@link #XR_ERROR_PATH_COUNT_EXCEEDED ERROR_PATH_COUNT_EXCEEDED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrPathToString PathToString}</p>
     *
     * @param instance   an instance previously created.
     * @param pathString the path name string to retrieve the associated {@code XrPath} for.
     * @param path       the output parameter, which <b>must</b> point to an {@code XrPath}. Given a well-formed path name string, this will be populated with an opaque value that is constant for that path string during the lifetime of that instance.
     */
    @NativeType("XrResult")
    public static int xrStringToPath(XrInstance instance, @NativeType("char const *") CharSequence pathString, @NativeType("XrPath *") LongBuffer path) {
        if (CHECKS) {
            check(path, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathString, true);
            long pathStringEncoded = stack.getPointerAddress();
            return nxrStringToPath(instance, pathStringEncoded, memAddress(path));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ xrPathToString ] ---

    /**
     * Unsafe version of: {@link #xrPathToString PathToString}
     *
     * @param bufferCapacityInput the capacity of the buffer, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrPathToString(XrInstance instance, long path, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = instance.getCapabilities().xrPathToString;
        return callPJPPI(instance.address(), path, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /**
     * Converts a semantic path to a string.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrPathToString(
     *     XrInstance                                  instance,
     *     XrPath                                      path,
     *     uint32_t                                    bufferCapacityInput,
     *     uint32_t*                                   bufferCountOutput,
     *     char*                                       buffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrPathToString PathToString} retrieves the path name string associated with an {@code XrPath}, in the context of a given {@code XrInstance}, in the form of a {@code NULL} terminated string placed into a <em>caller-allocated</em> buffer. Since the mapping between a well-formed path name string and an {@code XrPath} is bijective, there will always be exactly one string for each valid {@code XrPath} value. This can be useful if the calling application receives an {@code XrPath} value that they had not previously retrieved via {@link #xrStringToPath StringToPath}. During the lifetime of the given {@code XrInstance}, the path name string retrieved by this function for a given valid {@code XrPath} will not change. For invalid paths, including {@link #XR_NULL_PATH NULL_PATH}, {@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID} <b>must</b> be returned.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrStringToPath StringToPath}</p>
     *
     * @param instance          an instance previously created.
     * @param path              the valid {@code XrPath} value to retrieve the path string for.
     * @param bufferCountOutput a pointer to the count of characters written (including the terminating '\0'), or a pointer to the required capacity in the case that {@code bufferCapacityInput} is 0.
     * @param buffer            a pointer to an application-allocated buffer that will be filled with the semantic path string. It <b>can</b> be {@code NULL} if {@code bufferCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrPathToString(XrInstance instance, @NativeType("XrPath") long path, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @Nullable @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrPathToString(instance, path, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrCreateActionSet ] ---

    /** Unsafe version of: {@link #xrCreateActionSet CreateActionSet} */
    public static int nxrCreateActionSet(XrInstance instance, long createInfo, long actionSet) {
        long __functionAddress = instance.getCapabilities().xrCreateActionSet;
        return callPPPI(instance.address(), createInfo, actionSet, __functionAddress);
    }

    /**
     * Creates an XrActionSet.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateActionSet CreateActionSet} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateActionSet(
     *     XrInstance                                  instance,
     *     const XrActionSetCreateInfo*                createInfo,
     *     XrActionSet*                                actionSet);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrCreateActionSet CreateActionSet} function creates an action set and returns a handle to the created action set.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrActionSetCreateInfo} structure</li>
     * <li>{@code actionSet} <b>must</b> be a pointer to an {@code XrActionSet} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link #XR_ERROR_PATH_FORMAT_INVALID ERROR_PATH_FORMAT_INVALID}</li>
     * <li>{@link #XR_ERROR_NAME_INVALID ERROR_NAME_INVALID}</li>
     * <li>{@link #XR_ERROR_NAME_DUPLICATED ERROR_NAME_DUPLICATED}</li>
     * <li>{@link #XR_ERROR_LOCALIZED_NAME_INVALID ERROR_LOCALIZED_NAME_INVALID}</li>
     * <li>{@link #XR_ERROR_LOCALIZED_NAME_DUPLICATED ERROR_LOCALIZED_NAME_DUPLICATED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrActionSetCreateInfo}, {@link #xrDestroyActionSet DestroyActionSet}</p>
     *
     * @param instance   a handle to an {@code XrInstance}.
     * @param createInfo a pointer to a valid {@link XrActionSetCreateInfo} structure that defines the action set being created.
     * @param actionSet  a pointer to an {@code XrActionSet} where the created action set is returned.
     */
    @NativeType("XrResult")
    public static int xrCreateActionSet(XrInstance instance, @NativeType("XrActionSetCreateInfo const *") XrActionSetCreateInfo createInfo, @NativeType("XrActionSet *") PointerBuffer actionSet) {
        if (CHECKS) {
            check(actionSet, 1);
        }
        return nxrCreateActionSet(instance, createInfo.address(), memAddress(actionSet));
    }

    // --- [ xrDestroyActionSet ] ---

    /**
     * Destroys an XrActionSet.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyActionSet DestroyActionSet} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyActionSet(
     *     XrActionSet                                 actionSet);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Action set handles <b>can</b> be destroyed by calling {@link #xrDestroyActionSet DestroyActionSet}. When an action set handle is destroyed, all handles of actions in that action set are also destroyed.</p>
     * 
     * <p>The implementation <b>must</b> not free underlying resources for the action set while there are other valid handles that refer to those resources. The implementation <b>may</b> release resources for an action set when all of the action spaces for actions in that action set have been destroyed. See <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#spaces-action-spaces-lifetime">Action Spaces Lifetime</a> for details.</p>
     * 
     * <p>Resources for all action sets in an instance <b>must</b> be freed when the instance containing those actions sets is destroyed.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code actionSet} <b>must</b> be a valid {@code XrActionSet} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code actionSet}, and any child handles, <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrCreateActionSet CreateActionSet}</p>
     *
     * @param actionSet the action set to destroy.
     */
    @NativeType("XrResult")
    public static int xrDestroyActionSet(XrActionSet actionSet) {
        long __functionAddress = actionSet.getCapabilities().xrDestroyActionSet;
        return callPI(actionSet.address(), __functionAddress);
    }

    // --- [ xrCreateAction ] ---

    /** Unsafe version of: {@link #xrCreateAction CreateAction} */
    public static int nxrCreateAction(XrActionSet actionSet, long createInfo, long action) {
        long __functionAddress = actionSet.getCapabilities().xrCreateAction;
        return callPPPI(actionSet.address(), createInfo, action, __functionAddress);
    }

    /**
     * Creates an XrAction.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateAction CreateAction} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateAction(
     *     XrActionSet                                 actionSet,
     *     const XrActionCreateInfo*                   createInfo,
     *     XrAction*                                   action);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrCreateAction CreateAction} creates an action and returns its handle.</p>
     * 
     * <p>If {@code actionSet} has been included in a call to {@link #xrAttachSessionActionSets AttachSessionActionSets}, the implementation <b>must</b> return {@link #XR_ERROR_ACTIONSETS_ALREADY_ATTACHED ERROR_ACTIONSETS_ALREADY_ATTACHED}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code actionSet} <b>must</b> be a valid {@code XrActionSet} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrActionCreateInfo} structure</li>
     * <li>{@code action} <b>must</b> be a pointer to an {@code XrAction} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link #XR_ERROR_PATH_FORMAT_INVALID ERROR_PATH_FORMAT_INVALID}</li>
     * <li>{@link #XR_ERROR_NAME_INVALID ERROR_NAME_INVALID}</li>
     * <li>{@link #XR_ERROR_NAME_DUPLICATED ERROR_NAME_DUPLICATED}</li>
     * <li>{@link #XR_ERROR_LOCALIZED_NAME_INVALID ERROR_LOCALIZED_NAME_INVALID}</li>
     * <li>{@link #XR_ERROR_LOCALIZED_NAME_DUPLICATED ERROR_LOCALIZED_NAME_DUPLICATED}</li>
     * <li>{@link #XR_ERROR_ACTIONSETS_ALREADY_ATTACHED ERROR_ACTIONSETS_ALREADY_ATTACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrActionCreateInfo}, {@link #xrDestroyAction DestroyAction}</p>
     *
     * @param actionSet  a handle to an {@code XrActionSet}.
     * @param createInfo a pointer to a valid {@link XrActionCreateInfo} structure that defines the action being created.
     * @param action     a pointer to an {@code XrAction} where the created action is returned.
     */
    @NativeType("XrResult")
    public static int xrCreateAction(XrActionSet actionSet, @NativeType("XrActionCreateInfo const *") XrActionCreateInfo createInfo, @NativeType("XrAction *") PointerBuffer action) {
        if (CHECKS) {
            check(action, 1);
        }
        return nxrCreateAction(actionSet, createInfo.address(), memAddress(action));
    }

    // --- [ xrDestroyAction ] ---

    /**
     * Destroys an XrAction.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyAction DestroyAction} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyAction(
     *     XrAction                                    action);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Action handles <b>can</b> be destroyed by calling {@link #xrDestroyAction DestroyAction}. Handles for actions that are part of an action set are automatically destroyed when the action set’s handle is destroyed.</p>
     * 
     * <p>The implementation <b>must</b> not destroy the underlying resources for an action when {@link #xrDestroyAction DestroyAction} is called. Those resources are still used to make <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#spaces-action-spaces-lifetime">action spaces locatable</a> and when processing action priority in {@link #xrSyncActions SyncActions}. Destroying the action handle removes the application’s access to these resources, but has no other change on actions.</p>
     * 
     * <p>Resources for all actions in an instance <b>must</b> be freed when the instance containing those actions sets is destroyed.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code action} <b>must</b> be a valid {@code XrAction} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code action}, and any child handles, <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrCreateAction CreateAction}</p>
     *
     * @param action the action to destroy.
     */
    @NativeType("XrResult")
    public static int xrDestroyAction(XrAction action) {
        long __functionAddress = action.getCapabilities().xrDestroyAction;
        return callPI(action.address(), __functionAddress);
    }

    // --- [ xrSuggestInteractionProfileBindings ] ---

    /** Unsafe version of: {@link #xrSuggestInteractionProfileBindings SuggestInteractionProfileBindings} */
    public static int nxrSuggestInteractionProfileBindings(XrInstance instance, long suggestedBindings) {
        long __functionAddress = instance.getCapabilities().xrSuggestInteractionProfileBindings;
        if (CHECKS) {
            XrInteractionProfileSuggestedBinding.validate(suggestedBindings);
        }
        return callPPI(instance.address(), suggestedBindings, __functionAddress);
    }

    /**
     * Sets the application-suggested bindings for the interaction profile.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSuggestInteractionProfileBindings SuggestInteractionProfileBindings} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSuggestInteractionProfileBindings(
     *     XrInstance                                  instance,
     *     const XrInteractionProfileSuggestedBinding* suggestedBindings);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrSuggestInteractionProfileBindings SuggestInteractionProfileBindings} sets an interaction profile for which the application can provide default bindings. The application <b>can</b> call {@link #xrSuggestInteractionProfileBindings SuggestInteractionProfileBindings} once per interaction profile that it supports.</p>
     * 
     * <p>The application <b>can</b> provide any number of bindings for each action.</p>
     * 
     * <p>If the application successfully calls {@link #xrSuggestInteractionProfileBindings SuggestInteractionProfileBindings} more than once for an interaction profile, the runtime <b>must</b> discard the previous suggested bindings and replace them with the new suggested bindings for that profile.</p>
     * 
     * <p>If the interaction profile path does not follow the structure defined in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#semantic-path-interaction-profiles">Interaction Profiles</a> or suggested bindings contain paths that do not follow the format defined in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#semantic-path-input">Device input subpaths</a>, the runtime <b>must</b> return {@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}. If the interaction profile or input source for any of the suggested bindings does not exist in the allowlist defined in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#semantic-path-interaction-profiles">Interaction Profile Paths</a>, the runtime <b>must</b> return {@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}. A runtime <b>must</b> accept every valid binding in the allowlist though it is free to ignore any of them.</p>
     * 
     * <p>If the action set for any action referenced in the {@code suggestedBindings} parameter has been included in a call to {@link #xrAttachSessionActionSets AttachSessionActionSets}, the implementation <b>must</b> return {@link #XR_ERROR_ACTIONSETS_ALREADY_ATTACHED ERROR_ACTIONSETS_ALREADY_ATTACHED}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code suggestedBindings} <b>must</b> be a pointer to a valid {@link XrInteractionProfileSuggestedBinding} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link #XR_ERROR_ACTIONSETS_ALREADY_ATTACHED ERROR_ACTIONSETS_ALREADY_ATTACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrInteractionProfileSuggestedBinding}</p>
     *
     * @param instance          the {@code XrInstance} for which the application would like to set suggested bindings
     * @param suggestedBindings the {@link XrInteractionProfileSuggestedBinding} that the application would like to set
     */
    @NativeType("XrResult")
    public static int xrSuggestInteractionProfileBindings(XrInstance instance, @NativeType("XrInteractionProfileSuggestedBinding const *") XrInteractionProfileSuggestedBinding suggestedBindings) {
        return nxrSuggestInteractionProfileBindings(instance, suggestedBindings.address());
    }

    // --- [ xrAttachSessionActionSets ] ---

    /** Unsafe version of: {@link #xrAttachSessionActionSets AttachSessionActionSets} */
    public static int nxrAttachSessionActionSets(XrSession session, long attachInfo) {
        long __functionAddress = session.getCapabilities().xrAttachSessionActionSets;
        if (CHECKS) {
            XrSessionActionSetsAttachInfo.validate(attachInfo);
        }
        return callPPI(session.address(), attachInfo, __functionAddress);
    }

    /**
     * Attaches action sets to a given session.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrAttachSessionActionSets AttachSessionActionSets} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrAttachSessionActionSets(
     *     XrSession                                   session,
     *     const XrSessionActionSetsAttachInfo*        attachInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrAttachSessionActionSets AttachSessionActionSets} attaches the {@code XrActionSet} handles in {@code attachInfo.actionSets} to the {@code session}. Action sets <b>must</b> be attached in order to be synchronized with {@link #xrSyncActions SyncActions}.</p>
     * 
     * <p>When an action set is attached to a session, that action set becomes immutable. See {@link #xrCreateAction CreateAction} and {@link #xrSuggestInteractionProfileBindings SuggestInteractionProfileBindings} for details.</p>
     * 
     * <p>After action sets are attached to a session, if any unattached actions are passed to functions for the same session, then for those functions the runtime <b>must</b> return {@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_ACTIONSETS_ALREADY_ATTACHED ERROR_ACTIONSETS_ALREADY_ATTACHED} if {@link #xrAttachSessionActionSets AttachSessionActionSets} is called more than once for a given {@code session}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code attachInfo} <b>must</b> be a pointer to a valid {@link XrSessionActionSetsAttachInfo} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_ACTIONSETS_ALREADY_ATTACHED ERROR_ACTIONSETS_ALREADY_ATTACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSessionActionSetsAttachInfo}</p>
     *
     * @param session    the {@code XrSession} to attach the action sets to.
     * @param attachInfo the {@link XrSessionActionSetsAttachInfo} to provide information to attach action sets to the session.
     */
    @NativeType("XrResult")
    public static int xrAttachSessionActionSets(XrSession session, @NativeType("XrSessionActionSetsAttachInfo const *") XrSessionActionSetsAttachInfo attachInfo) {
        return nxrAttachSessionActionSets(session, attachInfo.address());
    }

    // --- [ xrGetCurrentInteractionProfile ] ---

    /** Unsafe version of: {@link #xrGetCurrentInteractionProfile GetCurrentInteractionProfile} */
    public static int nxrGetCurrentInteractionProfile(XrSession session, long topLevelUserPath, long interactionProfile) {
        long __functionAddress = session.getCapabilities().xrGetCurrentInteractionProfile;
        return callPJPI(session.address(), topLevelUserPath, interactionProfile, __functionAddress);
    }

    /**
     * Gets the current interaction profile for a top level user paths.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetCurrentInteractionProfile GetCurrentInteractionProfile} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetCurrentInteractionProfile(
     *     XrSession                                   session,
     *     XrPath                                      topLevelUserPath,
     *     XrInteractionProfileState*                  interactionProfile);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrGetCurrentInteractionProfile GetCurrentInteractionProfile} asks the runtime for the active interaction profiles for a top level user path.</p>
     * 
     * <p>The runtime <b>must</b> return only interaction profiles for which the application has provided bindings with {@link #xrSuggestInteractionProfileBindings SuggestInteractionProfileBindings} or {@link #XR_NULL_PATH NULL_PATH}. The runtime <b>may</b> return interaction profiles that do not represent physically present hardware, for example if the runtime is using a known interaction profile to bind to hardware that the application is not aware of. The runtime <b>may</b> return the last-known interaction profile in the event that no controllers are active.</p>
     * 
     * <p>If {@link #xrAttachSessionActionSets AttachSessionActionSets} has not yet been called for the {@code session}, the runtime <b>must</b> return {@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}. If {@code topLevelUserPath} is not one of the device input subpaths described in section <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#semantic-path-user">/user paths</a>, the runtime <b>must</b> return {@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code interactionProfile} <b>must</b> be a pointer to an {@link XrInteractionProfileState} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrInteractionProfileState}</p>
     *
     * @param session            the {@code XrSession} for which the application would like to retrieve the current interaction profile.
     * @param topLevelUserPath   the top level user path the application would like to retrieve the interaction profile for.
     * @param interactionProfile a pointer to an {@link XrInteractionProfileState} structure to receive the current interaction profile.
     */
    @NativeType("XrResult")
    public static int xrGetCurrentInteractionProfile(XrSession session, @NativeType("XrPath") long topLevelUserPath, @NativeType("XrInteractionProfileState *") XrInteractionProfileState interactionProfile) {
        return nxrGetCurrentInteractionProfile(session, topLevelUserPath, interactionProfile.address());
    }

    // --- [ xrGetActionStateBoolean ] ---

    /** Unsafe version of: {@link #xrGetActionStateBoolean GetActionStateBoolean} */
    public static int nxrGetActionStateBoolean(XrSession session, long getInfo, long state) {
        long __functionAddress = session.getCapabilities().xrGetActionStateBoolean;
        if (CHECKS) {
            XrActionStateGetInfo.validate(getInfo);
        }
        return callPPPI(session.address(), getInfo, state, __functionAddress);
    }

    /**
     * Gets boolean action state.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>{@link #xrGetActionStateBoolean GetActionStateBoolean} retrieves the current state of a boolean action. It is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetActionStateBoolean(
     *     XrSession                                   session,
     *     const XrActionStateGetInfo*                 getInfo,
     *     XrActionStateBoolean*                       state);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code getInfo} <b>must</b> be a pointer to a valid {@link XrActionStateGetInfo} structure</li>
     * <li>{@code state} <b>must</b> be a pointer to an {@link XrActionStateBoolean} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link #XR_ERROR_ACTION_TYPE_MISMATCH ERROR_ACTION_TYPE_MISMATCH}</li>
     * <li>{@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrActionStateBoolean}, {@link XrActionStateGetInfo}, {@link #xrCreateAction CreateAction}</p>
     *
     * @param session the {@code XrSession} to query.
     * @param getInfo a pointer to {@link XrActionStateGetInfo} to provide action and subaction paths information.
     * @param state   a pointer to a valid {@link XrActionStateBoolean} into which the state will be placed.
     */
    @NativeType("XrResult")
    public static int xrGetActionStateBoolean(XrSession session, @NativeType("XrActionStateGetInfo const *") XrActionStateGetInfo getInfo, @NativeType("XrActionStateBoolean *") XrActionStateBoolean state) {
        return nxrGetActionStateBoolean(session, getInfo.address(), state.address());
    }

    // --- [ xrGetActionStateFloat ] ---

    /** Unsafe version of: {@link #xrGetActionStateFloat GetActionStateFloat} */
    public static int nxrGetActionStateFloat(XrSession session, long getInfo, long state) {
        long __functionAddress = session.getCapabilities().xrGetActionStateFloat;
        if (CHECKS) {
            XrActionStateGetInfo.validate(getInfo);
        }
        return callPPPI(session.address(), getInfo, state, __functionAddress);
    }

    /**
     * Gets a floating point action state.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>{@link #xrGetActionStateFloat GetActionStateFloat} retrieves the current state of a floating-point action. It is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetActionStateFloat(
     *     XrSession                                   session,
     *     const XrActionStateGetInfo*                 getInfo,
     *     XrActionStateFloat*                         state);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code getInfo} <b>must</b> be a pointer to a valid {@link XrActionStateGetInfo} structure</li>
     * <li>{@code state} <b>must</b> be a pointer to an {@link XrActionStateFloat} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link #XR_ERROR_ACTION_TYPE_MISMATCH ERROR_ACTION_TYPE_MISMATCH}</li>
     * <li>{@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrActionStateFloat}, {@link XrActionStateGetInfo}, {@link #xrCreateAction CreateAction}</p>
     *
     * @param session the {@code XrSession} to query.
     * @param getInfo a pointer to {@link XrActionStateGetInfo} to provide action and subaction paths information.
     * @param state   a pointer to a valid {@link XrActionStateFloat} into which the state will be placed.
     */
    @NativeType("XrResult")
    public static int xrGetActionStateFloat(XrSession session, @NativeType("XrActionStateGetInfo const *") XrActionStateGetInfo getInfo, @NativeType("XrActionStateFloat *") XrActionStateFloat state) {
        return nxrGetActionStateFloat(session, getInfo.address(), state.address());
    }

    // --- [ xrGetActionStateVector2f ] ---

    /** Unsafe version of: {@link #xrGetActionStateVector2f GetActionStateVector2f} */
    public static int nxrGetActionStateVector2f(XrSession session, long getInfo, long state) {
        long __functionAddress = session.getCapabilities().xrGetActionStateVector2f;
        if (CHECKS) {
            XrActionStateGetInfo.validate(getInfo);
        }
        return callPPPI(session.address(), getInfo, state, __functionAddress);
    }

    /**
     * Gets 2D float vector action state.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>{@link #xrGetActionStateVector2f GetActionStateVector2f} retrieves the current state of a two-dimensional vector action. It is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetActionStateVector2f(
     *     XrSession                                   session,
     *     const XrActionStateGetInfo*                 getInfo,
     *     XrActionStateVector2f*                      state);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code getInfo} <b>must</b> be a pointer to a valid {@link XrActionStateGetInfo} structure</li>
     * <li>{@code state} <b>must</b> be a pointer to an {@link XrActionStateVector2f} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link #XR_ERROR_ACTION_TYPE_MISMATCH ERROR_ACTION_TYPE_MISMATCH}</li>
     * <li>{@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrActionStateGetInfo}, {@link XrActionStateVector2f}, {@link #xrCreateAction CreateAction}</p>
     *
     * @param session the {@code XrSession} to query.
     * @param getInfo a pointer to {@link XrActionStateGetInfo} to provide action and subaction paths information.
     * @param state   a pointer to a valid {@link XrActionStateVector2f} into which the state will be placed.
     */
    @NativeType("XrResult")
    public static int xrGetActionStateVector2f(XrSession session, @NativeType("XrActionStateGetInfo const *") XrActionStateGetInfo getInfo, @NativeType("XrActionStateVector2f *") XrActionStateVector2f state) {
        return nxrGetActionStateVector2f(session, getInfo.address(), state.address());
    }

    // --- [ xrGetActionStatePose ] ---

    /** Unsafe version of: {@link #xrGetActionStatePose GetActionStatePose} */
    public static int nxrGetActionStatePose(XrSession session, long getInfo, long state) {
        long __functionAddress = session.getCapabilities().xrGetActionStatePose;
        if (CHECKS) {
            XrActionStateGetInfo.validate(getInfo);
        }
        return callPPPI(session.address(), getInfo, state, __functionAddress);
    }

    /**
     * Gets metadata from a pose action.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetActionStatePose GetActionStatePose} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetActionStatePose(
     *     XrSession                                   session,
     *     const XrActionStateGetInfo*                 getInfo,
     *     XrActionStatePose*                          state);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrGetActionStatePose GetActionStatePose} returns information about the binding and active state for the specified action. To determine the pose of this action at a historical or predicted time, the application <b>can</b> create an action space using {@link #xrCreateActionSpace CreateActionSpace}. Then, after each sync, the application <b>can</b> locate the pose of this action space within a base space using {@link #xrLocateSpace LocateSpace}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code getInfo} <b>must</b> be a pointer to a valid {@link XrActionStateGetInfo} structure</li>
     * <li>{@code state} <b>must</b> be a pointer to an {@link XrActionStatePose} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link #XR_ERROR_ACTION_TYPE_MISMATCH ERROR_ACTION_TYPE_MISMATCH}</li>
     * <li>{@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrActionStateGetInfo}, {@link XrActionStatePose}, {@link #xrCreateAction CreateAction}, {@link #xrCreateActionSpace CreateActionSpace}</p>
     *
     * @param session the {@code XrSession} to query.
     * @param getInfo a pointer to {@link XrActionStateGetInfo} to provide action and subaction paths information.
     * @param state   a pointer to a valid {@link XrActionStatePose} into which the state will be placed.
     */
    @NativeType("XrResult")
    public static int xrGetActionStatePose(XrSession session, @NativeType("XrActionStateGetInfo const *") XrActionStateGetInfo getInfo, @NativeType("XrActionStatePose *") XrActionStatePose state) {
        return nxrGetActionStatePose(session, getInfo.address(), state.address());
    }

    // --- [ xrSyncActions ] ---

    /** Unsafe version of: {@link #xrSyncActions SyncActions} */
    public static int nxrSyncActions(XrSession session, long syncInfo) {
        long __functionAddress = session.getCapabilities().xrSyncActions;
        return callPPI(session.address(), syncInfo, __functionAddress);
    }

    /**
     * Updates the current state of input actions.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSyncActions SyncActions} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSyncActions(
     *     XrSession                                   session,
     *     const XrActionsSyncInfo*                    syncInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrSyncActions SyncActions} updates the current state of input actions. Repeated input action state queries between subsequent synchronization calls <b>must</b> return the same values. The {@code XrActionSet} structures referenced in the {@code syncInfo.activeActionSets} <b>must</b> have been previously attached to the session via {@link #xrAttachSessionActionSets AttachSessionActionSets}. If any action sets not attached to this session are passed to {@link #xrSyncActions SyncActions} it <b>must</b> return {@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}. Subsets of the bound action sets <b>can</b> be synchronized in order to control which actions are seen as active.</p>
     * 
     * <p>If {@code session} is not focused, the runtime <b>must</b> return {@link #XR_SESSION_NOT_FOCUSED SESSION_NOT_FOCUSED}, and all action states in the session <b>must</b> be inactive.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code syncInfo} <b>must</b> be a pointer to a valid {@link XrActionsSyncInfo} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * <li>{@link #XR_SESSION_NOT_FOCUSED SESSION_NOT_FOCUSED}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrActionsSyncInfo}, {@link XrActiveActionSet}</p>
     *
     * @param session  a handle to the {@code XrSession} that all provided action set handles belong to.
     * @param syncInfo an {@link XrActionsSyncInfo} providing information to synchronize action states.
     */
    @NativeType("XrResult")
    public static int xrSyncActions(XrSession session, @NativeType("XrActionsSyncInfo const *") XrActionsSyncInfo syncInfo) {
        return nxrSyncActions(session, syncInfo.address());
    }

    // --- [ xrEnumerateBoundSourcesForAction ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateBoundSourcesForAction EnumerateBoundSourcesForAction}
     *
     * @param sourceCapacityInput the capacity of the array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrEnumerateBoundSourcesForAction(XrSession session, long enumerateInfo, int sourceCapacityInput, long sourceCountOutput, long sources) {
        long __functionAddress = session.getCapabilities().xrEnumerateBoundSourcesForAction;
        if (CHECKS) {
            XrBoundSourcesForActionEnumerateInfo.validate(enumerateInfo);
        }
        return callPPPPI(session.address(), enumerateInfo, sourceCapacityInput, sourceCountOutput, sources, __functionAddress);
    }

    /**
     * Queries the bound input sources for an action.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnumerateBoundSourcesForAction EnumerateBoundSourcesForAction} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateBoundSourcesForAction(
     *     XrSession                                   session,
     *     const XrBoundSourcesForActionEnumerateInfo* enumerateInfo,
     *     uint32_t                                    sourceCapacityInput,
     *     uint32_t*                                   sourceCountOutput,
     *     XrPath*                                     sources);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If an action is unbound, {@link #xrEnumerateBoundSourcesForAction EnumerateBoundSourcesForAction} <b>must</b> assign 0 to the value pointed-to by {@code sourceCountOutput} and not modify the array.</p>
     * 
     * <p>{@link #xrEnumerateBoundSourcesForAction EnumerateBoundSourcesForAction} <b>must</b> return {@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED} if passed an action in an action set never attached to the session with {@link #xrAttachSessionActionSets AttachSessionActionSets}.</p>
     * 
     * <p>As bindings for actions do not change between calls to {@link #xrSyncActions SyncActions}, {@link #xrEnumerateBoundSourcesForAction EnumerateBoundSourcesForAction} <b>must</b> enumerate the same set of bound sources, or absence of bound sources, for a given query (defined by the {@code enumerateInfo} parameter) between any two calls to {@link #xrSyncActions SyncActions}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code enumerateInfo} <b>must</b> be a pointer to a valid {@link XrBoundSourcesForActionEnumerateInfo} structure</li>
     * <li>{@code sourceCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code sourceCapacityInput} is not 0, {@code sources} <b>must</b> be a pointer to an array of {@code sourceCapacityInput} {@code XrPath} values</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrBoundSourcesForActionEnumerateInfo}</p>
     *
     * @param session           the {@code XrSession} being queried.
     * @param enumerateInfo     an {@link XrBoundSourcesForActionEnumerateInfo} providing the query information.
     * @param sourceCountOutput a pointer to the count of sources, or a pointer to the required capacity in the case that {@code sourceCapacityInput} is 0.
     * @param sources           a pointer to an application-allocated array that will be filled with the {@code XrPath} values for all sources. It <b>can</b> be {@code NULL} if {@code sourceCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumerateBoundSourcesForAction(XrSession session, @NativeType("XrBoundSourcesForActionEnumerateInfo const *") XrBoundSourcesForActionEnumerateInfo enumerateInfo, @NativeType("uint32_t *") IntBuffer sourceCountOutput, @Nullable @NativeType("XrPath *") LongBuffer sources) {
        if (CHECKS) {
            check(sourceCountOutput, 1);
        }
        return nxrEnumerateBoundSourcesForAction(session, enumerateInfo.address(), remainingSafe(sources), memAddress(sourceCountOutput), memAddressSafe(sources));
    }

    // --- [ xrGetInputSourceLocalizedName ] ---

    /**
     * Unsafe version of: {@link #xrGetInputSourceLocalizedName GetInputSourceLocalizedName}
     *
     * @param bufferCapacityInput the capacity of the buffer, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrGetInputSourceLocalizedName(XrSession session, long getInfo, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = session.getCapabilities().xrGetInputSourceLocalizedName;
        return callPPPPI(session.address(), getInfo, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /**
     * Gets a localized source name.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetInputSourceLocalizedName GetInputSourceLocalizedName} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetInputSourceLocalizedName(
     *     XrSession                                   session,
     *     const XrInputSourceLocalizedNameGetInfo*    getInfo,
     *     uint32_t                                    bufferCapacityInput,
     *     uint32_t*                                   bufferCountOutput,
     *     char*                                       buffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrGetInputSourceLocalizedName GetInputSourceLocalizedName} returns a string for the input source in the current system locale.</p>
     * 
     * <p>If {@link #xrAttachSessionActionSets AttachSessionActionSets} has not yet been called for the session, the runtime <b>must</b> return {@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code getInfo} <b>must</b> be a pointer to a valid {@link XrInputSourceLocalizedNameGetInfo} structure</li>
     * <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrInputSourceLocalizedNameGetInfo}</p>
     *
     * @param session           a handle to the {@code XrSession} associated with the action that reported this source.
     * @param getInfo           an {@link XrInputSourceLocalizedNameGetInfo} providing the query information.
     * @param bufferCountOutput a pointer to the count of name characters written (including the terminating {@code \0}), or a pointer to the required capacity in the case that {@code bufferCapacityInput} is 0.
     * @param buffer            a pointer to an application-allocated buffer that will be filled with the source name. It <b>can</b> be {@code NULL} if {@code bufferCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrGetInputSourceLocalizedName(XrSession session, @NativeType("XrInputSourceLocalizedNameGetInfo const *") XrInputSourceLocalizedNameGetInfo getInfo, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @Nullable @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetInputSourceLocalizedName(session, getInfo.address(), remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrApplyHapticFeedback ] ---

    /** Unsafe version of: {@link #xrApplyHapticFeedback ApplyHapticFeedback} */
    public static int nxrApplyHapticFeedback(XrSession session, long hapticActionInfo, long hapticFeedback) {
        long __functionAddress = session.getCapabilities().xrApplyHapticFeedback;
        if (CHECKS) {
            XrHapticActionInfo.validate(hapticActionInfo);
        }
        return callPPPI(session.address(), hapticActionInfo, hapticFeedback, __functionAddress);
    }

    /**
     * Apply haptic feedback.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrApplyHapticFeedback ApplyHapticFeedback} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrApplyHapticFeedback(
     *     XrSession                                   session,
     *     const XrHapticActionInfo*                   hapticActionInfo,
     *     const XrHapticBaseHeader*                   hapticFeedback);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Triggers a haptic event through the specified action of type {@link #XR_TYPE_HAPTIC_VIBRATION TYPE_HAPTIC_VIBRATION}. The runtime <b>should</b> deliver this request to the appropriate device, but exactly which device, if any, this event is sent to is up to the runtime to decide. If an appropriate device is unavailable the runtime <b>may</b> ignore this request for haptic feedback.</p>
     * 
     * <p>If {@code session} is not focused, the runtime <b>must</b> return {@link #XR_SESSION_NOT_FOCUSED SESSION_NOT_FOCUSED}, and not trigger a haptic event.</p>
     * 
     * <p>If another haptic event from this session is currently happening on the device bound to this action, the runtime <b>must</b> interrupt that other event and replace it with the new one.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code hapticActionInfo} <b>must</b> be a pointer to a valid {@link XrHapticActionInfo} structure</li>
     * <li>{@code hapticFeedback} <b>must</b> be a pointer to a valid {@link XrHapticBaseHeader}-based structure. See also: {@link XrHapticVibration}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * <li>{@link #XR_SESSION_NOT_FOCUSED SESSION_NOT_FOCUSED}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link #XR_ERROR_ACTION_TYPE_MISMATCH ERROR_ACTION_TYPE_MISMATCH}</li>
     * <li>{@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrHapticActionInfo}, {@link XrHapticBaseHeader}, {@link XrHapticVibration}, {@link #xrStopHapticFeedback StopHapticFeedback}</p>
     *
     * @param session          the {@code XrSession} to start outputting to.
     * @param hapticActionInfo a pointer to {@link XrHapticActionInfo} to provide action and subaction paths information.
     * @param hapticFeedback   a pointer to a haptic event structure which starts with an {@link XrHapticBaseHeader}.
     */
    @NativeType("XrResult")
    public static int xrApplyHapticFeedback(XrSession session, @NativeType("XrHapticActionInfo const *") XrHapticActionInfo hapticActionInfo, @NativeType("XrHapticBaseHeader const *") XrHapticBaseHeader hapticFeedback) {
        return nxrApplyHapticFeedback(session, hapticActionInfo.address(), hapticFeedback.address());
    }

    // --- [ xrStopHapticFeedback ] ---

    /** Unsafe version of: {@link #xrStopHapticFeedback StopHapticFeedback} */
    public static int nxrStopHapticFeedback(XrSession session, long hapticActionInfo) {
        long __functionAddress = session.getCapabilities().xrStopHapticFeedback;
        if (CHECKS) {
            XrHapticActionInfo.validate(hapticActionInfo);
        }
        return callPPI(session.address(), hapticActionInfo, __functionAddress);
    }

    /**
     * Stop haptic feedback.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrStopHapticFeedback StopHapticFeedback} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrStopHapticFeedback(
     *     XrSession                                   session,
     *     const XrHapticActionInfo*                   hapticActionInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If a haptic event from this {@code XrAction} is in progress, when this function is called the runtime <b>must</b> stop that event.</p>
     * 
     * <p>If {@code session} is not focused, the runtime <b>must</b> return {@link #XR_SESSION_NOT_FOCUSED SESSION_NOT_FOCUSED}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code hapticActionInfo} <b>must</b> be a pointer to a valid {@link XrHapticActionInfo} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * <li>{@link #XR_SESSION_NOT_FOCUSED SESSION_NOT_FOCUSED}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link #XR_ERROR_ACTION_TYPE_MISMATCH ERROR_ACTION_TYPE_MISMATCH}</li>
     * <li>{@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrHapticActionInfo}, {@link #xrApplyHapticFeedback ApplyHapticFeedback}</p>
     *
     * @param session          the {@code XrSession} to stop outputting to.
     * @param hapticActionInfo a pointer to an {@link XrHapticActionInfo} to provide action and subaction path information.
     */
    @NativeType("XrResult")
    public static int xrStopHapticFeedback(XrSession session, @NativeType("XrHapticActionInfo const *") XrHapticActionInfo hapticActionInfo) {
        return nxrStopHapticFeedback(session, hapticActionInfo.address());
    }

    // --- [ XR_MAKE_VERSION ] ---

    /**
     * Packs a three-component version number into a packed version number integer.
     * 
     * <p>This macro <b>can</b> be used when constructing the {@link XrApplicationInfo}{@code ::apiVersion} parameter passed to {@link #xrCreateInstance CreateInstance}.</p>
     *
     * @param major the major version number, packed into the most-significant 16 bits
     * @param minor the minor version number, packed into the second-most-significant group of 16 bits
     * @param patch the patch version number, in the least-significant 32 bits
     */
    @NativeType("uint64_t")
    public static long XR_MAKE_VERSION(@NativeType("uint16_t") int major, @NativeType("uint16_t") int minor, @NativeType("uint32_t") int patch) {
        return ((major & 0xFFFFL) << 48) | ((minor & 0xFFFFL) << 32) | (patch & 0xFFFF_FFFFL);
    }

    // --- [ XR_VERSION_MAJOR ] ---

    /**
     * Extracts the major version number from a packed version number.
     *
     * @param version a packed version number
     */
    @NativeType("uint16_t")
    public static short XR_VERSION_MAJOR(@NativeType("uint64_t") long version) {
        return (short)((version >> 48) & 0xFFFFL);
    }

    // --- [ XR_VERSION_MINOR ] ---

    /**
     * Extracts the minor version number from a packed version number.
     *
     * @param version a packed version number
     */
    @NativeType("uint16_t")
    public static short XR_VERSION_MINOR(@NativeType("uint64_t") long version) {
        return (short)((version >> 32) & 0xFFFFL);
    }

    // --- [ XR_VERSION_PATCH ] ---

    /**
     * Extracts the patch version number from a packed version number.
     *
     * @param version a packed version number
     */
    @NativeType("uint32_t")
    public static int XR_VERSION_PATCH(@NativeType("uint64_t") long version) {
        return (int)(version & 0xFFFF_FFFFL);
    }

    // --- [ XR_SUCCEEDED ] ---

    @NativeType("bool")
    public static boolean XR_SUCCEEDED(int result) {
        return result >= 0;
    }

    // --- [ XR_UNQUALIFIED_SUCCESS ] ---

    @NativeType("bool")
    public static boolean XR_UNQUALIFIED_SUCCESS(int result) {
        return result == 0;
    }

    // --- [ XR_FAILED ] ---

    @NativeType("bool")
    public static boolean XR_FAILED(int result) {
        return result < 0;
    }

}