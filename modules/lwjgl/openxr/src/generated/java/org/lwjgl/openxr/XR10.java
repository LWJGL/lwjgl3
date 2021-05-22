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
     * XrResult
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_SUCCESS SUCCESS}</li>
     * <li>{@link #XR_TIMEOUT_EXPIRED TIMEOUT_EXPIRED}</li>
     * <li>{@link #XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * <li>{@link #XR_EVENT_UNAVAILABLE EVENT_UNAVAILABLE}</li>
     * <li>{@link #XR_SPACE_BOUNDS_UNAVAILABLE SPACE_BOUNDS_UNAVAILABLE}</li>
     * <li>{@link #XR_SESSION_NOT_FOCUSED SESSION_NOT_FOCUSED}</li>
     * <li>{@link #XR_FRAME_DISCARDED FRAME_DISCARDED}</li>
     * <li>{@link #XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link #XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link #XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_API_VERSION_UNSUPPORTED ERROR_API_VERSION_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link #XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT}</li>
     * <li>{@link #XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link #XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link #XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link #XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SESSION_RUNNING ERROR_SESSION_RUNNING}</li>
     * <li>{@link #XR_ERROR_SESSION_NOT_RUNNING ERROR_SESSION_NOT_RUNNING}</li>
     * <li>{@link #XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * <li>{@link #XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link #XR_ERROR_PATH_COUNT_EXCEEDED ERROR_PATH_COUNT_EXCEEDED}</li>
     * <li>{@link #XR_ERROR_PATH_FORMAT_INVALID ERROR_PATH_FORMAT_INVALID}</li>
     * <li>{@link #XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_LAYER_INVALID ERROR_LAYER_INVALID}</li>
     * <li>{@link #XR_ERROR_LAYER_LIMIT_EXCEEDED ERROR_LAYER_LIMIT_EXCEEDED}</li>
     * <li>{@link #XR_ERROR_SWAPCHAIN_RECT_INVALID ERROR_SWAPCHAIN_RECT_INVALID}</li>
     * <li>{@link #XR_ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_ACTION_TYPE_MISMATCH ERROR_ACTION_TYPE_MISMATCH}</li>
     * <li>{@link #XR_ERROR_SESSION_NOT_READY ERROR_SESSION_NOT_READY}</li>
     * <li>{@link #XR_ERROR_SESSION_NOT_STOPPING ERROR_SESSION_NOT_STOPPING}</li>
     * <li>{@link #XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * <li>{@link #XR_ERROR_REFERENCE_SPACE_UNSUPPORTED ERROR_REFERENCE_SPACE_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_FILE_ACCESS_ERROR ERROR_FILE_ACCESS_ERROR}</li>
     * <li>{@link #XR_ERROR_FILE_CONTENTS_INVALID ERROR_FILE_CONTENTS_INVALID}</li>
     * <li>{@link #XR_ERROR_FORM_FACTOR_UNSUPPORTED ERROR_FORM_FACTOR_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_FORM_FACTOR_UNAVAILABLE ERROR_FORM_FACTOR_UNAVAILABLE}</li>
     * <li>{@link #XR_ERROR_API_LAYER_NOT_PRESENT ERROR_API_LAYER_NOT_PRESENT}</li>
     * <li>{@link #XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * <li>{@link #XR_ERROR_GRAPHICS_DEVICE_INVALID ERROR_GRAPHICS_DEVICE_INVALID}</li>
     * <li>{@link #XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * <li>{@link #XR_ERROR_INDEX_OUT_OF_RANGE ERROR_INDEX_OUT_OF_RANGE}</li>
     * <li>{@link #XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_NAME_DUPLICATED ERROR_NAME_DUPLICATED}</li>
     * <li>{@link #XR_ERROR_NAME_INVALID ERROR_NAME_INVALID}</li>
     * <li>{@link #XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}</li>
     * <li>{@link #XR_ERROR_ACTIONSETS_ALREADY_ATTACHED ERROR_ACTIONSETS_ALREADY_ATTACHED}</li>
     * <li>{@link #XR_ERROR_LOCALIZED_NAME_DUPLICATED ERROR_LOCALIZED_NAME_DUPLICATED}</li>
     * <li>{@link #XR_ERROR_LOCALIZED_NAME_INVALID ERROR_LOCALIZED_NAME_INVALID}</li>
     * <li>{@link #XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING}</li>
     * </ul>
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
        XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING  = -50;

    /**
     * XrStructureType
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
     * XrFormFactor
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_FORM_FACTOR_HEAD_MOUNTED_DISPLAY FORM_FACTOR_HEAD_MOUNTED_DISPLAY}</li>
     * <li>{@link #XR_FORM_FACTOR_HANDHELD_DISPLAY FORM_FACTOR_HANDHELD_DISPLAY}</li>
     * </ul>
     */
    public static final int
        XR_FORM_FACTOR_HEAD_MOUNTED_DISPLAY = 1,
        XR_FORM_FACTOR_HANDHELD_DISPLAY     = 2;

    /**
     * XrViewConfigurationType
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_VIEW_CONFIGURATION_TYPE_PRIMARY_MONO VIEW_CONFIGURATION_TYPE_PRIMARY_MONO}</li>
     * <li>{@link #XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO}</li>
     * </ul>
     */
    public static final int
        XR_VIEW_CONFIGURATION_TYPE_PRIMARY_MONO   = 1,
        XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO = 2;

    /**
     * XrEnvironmentBlendMode
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ENVIRONMENT_BLEND_MODE_OPAQUE ENVIRONMENT_BLEND_MODE_OPAQUE}</li>
     * <li>{@link #XR_ENVIRONMENT_BLEND_MODE_ADDITIVE ENVIRONMENT_BLEND_MODE_ADDITIVE}</li>
     * <li>{@link #XR_ENVIRONMENT_BLEND_MODE_ALPHA_BLEND ENVIRONMENT_BLEND_MODE_ALPHA_BLEND}</li>
     * </ul>
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
     * XrReferenceSpaceType
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_REFERENCE_SPACE_TYPE_VIEW REFERENCE_SPACE_TYPE_VIEW}</li>
     * <li>{@link #XR_REFERENCE_SPACE_TYPE_LOCAL REFERENCE_SPACE_TYPE_LOCAL}</li>
     * <li>{@link #XR_REFERENCE_SPACE_TYPE_STAGE REFERENCE_SPACE_TYPE_STAGE}</li>
     * </ul>
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
     * XrActionType
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ACTION_TYPE_BOOLEAN_INPUT ACTION_TYPE_BOOLEAN_INPUT}</li>
     * <li>{@link #XR_ACTION_TYPE_FLOAT_INPUT ACTION_TYPE_FLOAT_INPUT}</li>
     * <li>{@link #XR_ACTION_TYPE_VECTOR2F_INPUT ACTION_TYPE_VECTOR2F_INPUT}</li>
     * <li>{@link #XR_ACTION_TYPE_POSE_INPUT ACTION_TYPE_POSE_INPUT}</li>
     * <li>{@link #XR_ACTION_TYPE_VIBRATION_OUTPUT ACTION_TYPE_VIBRATION_OUTPUT}</li>
     * </ul>
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
     * XrEyeVisibility
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_EYE_VISIBILITY_BOTH EYE_VISIBILITY_BOTH}</li>
     * <li>{@link #XR_EYE_VISIBILITY_LEFT EYE_VISIBILITY_LEFT}</li>
     * <li>{@link #XR_EYE_VISIBILITY_RIGHT EYE_VISIBILITY_RIGHT}</li>
     * </ul>
     */
    public static final int
        XR_EYE_VISIBILITY_BOTH  = 0,
        XR_EYE_VISIBILITY_LEFT  = 1,
        XR_EYE_VISIBILITY_RIGHT = 2;

    /**
     * XrSessionState
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_SESSION_STATE_UNKNOWN SESSION_STATE_UNKNOWN}</li>
     * <li>{@link #XR_SESSION_STATE_IDLE SESSION_STATE_IDLE}</li>
     * <li>{@link #XR_SESSION_STATE_READY SESSION_STATE_READY}</li>
     * <li>{@link #XR_SESSION_STATE_SYNCHRONIZED SESSION_STATE_SYNCHRONIZED}</li>
     * <li>{@link #XR_SESSION_STATE_VISIBLE SESSION_STATE_VISIBLE}</li>
     * <li>{@link #XR_SESSION_STATE_FOCUSED SESSION_STATE_FOCUSED}</li>
     * <li>{@link #XR_SESSION_STATE_STOPPING SESSION_STATE_STOPPING}</li>
     * <li>{@link #XR_SESSION_STATE_LOSS_PENDING SESSION_STATE_LOSS_PENDING}</li>
     * <li>{@link #XR_SESSION_STATE_EXITING SESSION_STATE_EXITING}</li>
     * </ul>
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
     * XrObjectType
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_OBJECT_TYPE_UNKNOWN OBJECT_TYPE_UNKNOWN}</li>
     * <li>{@link #XR_OBJECT_TYPE_INSTANCE OBJECT_TYPE_INSTANCE}</li>
     * <li>{@link #XR_OBJECT_TYPE_SESSION OBJECT_TYPE_SESSION}</li>
     * <li>{@link #XR_OBJECT_TYPE_SWAPCHAIN OBJECT_TYPE_SWAPCHAIN}</li>
     * <li>{@link #XR_OBJECT_TYPE_SPACE OBJECT_TYPE_SPACE}</li>
     * <li>{@link #XR_OBJECT_TYPE_ACTION_SET OBJECT_TYPE_ACTION_SET}</li>
     * <li>{@link #XR_OBJECT_TYPE_ACTION OBJECT_TYPE_ACTION}</li>
     * </ul>
     */
    public static final int
        XR_OBJECT_TYPE_UNKNOWN    = 0,
        XR_OBJECT_TYPE_INSTANCE   = 1,
        XR_OBJECT_TYPE_SESSION    = 2,
        XR_OBJECT_TYPE_SWAPCHAIN  = 3,
        XR_OBJECT_TYPE_SPACE      = 4,
        XR_OBJECT_TYPE_ACTION_SET = 5,
        XR_OBJECT_TYPE_ACTION     = 6;

    /** XR_CURRENT_API_VERSION is the current version of the OpenXR API. */
    public static final long XR_CURRENT_API_VERSION = XR_MAKE_VERSION(1, 0, 14);

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

    public static final long
        XR_NULL_SYSTEM_ID        = 0,
        XR_NULL_PATH             = 0,
        XR_NO_DURATION           = 0,
        XR_INFINITE_DURATION     = 0x7fffffffffffffffL,
        XR_MIN_HAPTIC_DURATION   = -1,
        XR_FREQUENCY_UNSPECIFIED = 0;

    /**
     * {@code XR_NULL_HANDLE} is a reserved value representing a non-valid object handle. It may be passed to and returned from API functions only when 
     * specifically allowed.
     */
    public static final long XR_NULL_HANDLE = 0x0L;

    protected XR10() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetInstanceProcAddr ] ---

    public static int nxrGetInstanceProcAddr(XrInstance instance, long name, long function) {
        long __functionAddress = XR.getGlobalCommands().xrGetInstanceProcAddr;
        return callPPPI(instance.address(), name, function, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetInstanceProcAddr(XrInstance instance, @NativeType("char const *") ByteBuffer name, @NativeType("PFN_xrVoidFunction *") PointerBuffer function) {
        if (CHECKS) {
            checkNT1(name);
            check(function, 1);
        }
        return nxrGetInstanceProcAddr(instance, memAddress(name), memAddress(function));
    }

    @NativeType("XrResult")
    public static int xrGetInstanceProcAddr(XrInstance instance, @NativeType("char const *") CharSequence name, @NativeType("PFN_xrVoidFunction *") PointerBuffer function) {
        if (CHECKS) {
            check(function, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nxrGetInstanceProcAddr(instance, nameEncoded, memAddress(function));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ xrEnumerateApiLayerProperties ] ---

    public static int nxrEnumerateApiLayerProperties(int propertyCapacityInput, long propertyCountOutput, long properties) {
        long __functionAddress = XR.getGlobalCommands().xrEnumerateApiLayerProperties;
        return callPPI(propertyCapacityInput, propertyCountOutput, properties, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrEnumerateApiLayerProperties(@NativeType("uint32_t *") IntBuffer propertyCountOutput, @Nullable @NativeType("XrApiLayerProperties *") XrApiLayerProperties.Buffer properties) {
        if (CHECKS) {
            check(propertyCountOutput, 1);
        }
        return nxrEnumerateApiLayerProperties(remainingSafe(properties), memAddress(propertyCountOutput), memAddressSafe(properties));
    }

    // --- [ xrEnumerateInstanceExtensionProperties ] ---

    public static int nxrEnumerateInstanceExtensionProperties(long layerName, int propertyCapacityInput, long propertyCountOutput, long properties) {
        long __functionAddress = XR.getGlobalCommands().xrEnumerateInstanceExtensionProperties;
        return callPPPI(layerName, propertyCapacityInput, propertyCountOutput, properties, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrEnumerateInstanceExtensionProperties(@Nullable @NativeType("char const *") ByteBuffer layerName, @NativeType("uint32_t *") IntBuffer propertyCountOutput, @Nullable @NativeType("XrExtensionProperties *") XrExtensionProperties.Buffer properties) {
        if (CHECKS) {
            checkNT1Safe(layerName);
            check(propertyCountOutput, 1);
        }
        return nxrEnumerateInstanceExtensionProperties(memAddressSafe(layerName), remainingSafe(properties), memAddress(propertyCountOutput), memAddressSafe(properties));
    }

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

    public static int nxrCreateInstance(long createInfo, long instance) {
        long __functionAddress = XR.getGlobalCommands().xrCreateInstance;
        if (CHECKS) {
            XrInstanceCreateInfo.validate(createInfo);
        }
        return callPPI(createInfo, instance, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrCreateInstance(@NativeType("XrInstanceCreateInfo const *") XrInstanceCreateInfo createInfo, @NativeType("XrInstance *") PointerBuffer instance) {
        if (CHECKS) {
            check(instance, 1);
        }
        return nxrCreateInstance(createInfo.address(), memAddress(instance));
    }

    // --- [ xrDestroyInstance ] ---

    @NativeType("XrResult")
    public static int xrDestroyInstance(XrInstance instance) {
        long __functionAddress = instance.getCapabilities().xrDestroyInstance;
        return callPI(instance.address(), __functionAddress);
    }

    // --- [ xrGetInstanceProperties ] ---

    public static int nxrGetInstanceProperties(XrInstance instance, long instanceProperties) {
        long __functionAddress = instance.getCapabilities().xrGetInstanceProperties;
        return callPPI(instance.address(), instanceProperties, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetInstanceProperties(XrInstance instance, @NativeType("XrInstanceProperties *") XrInstanceProperties instanceProperties) {
        return nxrGetInstanceProperties(instance, instanceProperties.address());
    }

    // --- [ xrPollEvent ] ---

    public static int nxrPollEvent(XrInstance instance, long eventData) {
        long __functionAddress = instance.getCapabilities().xrPollEvent;
        return callPPI(instance.address(), eventData, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrPollEvent(XrInstance instance, @NativeType("XrEventDataBuffer *") XrEventDataBuffer eventData) {
        return nxrPollEvent(instance, eventData.address());
    }

    // --- [ xrResultToString ] ---

    public static int nxrResultToString(XrInstance instance, int value, long buffer) {
        long __functionAddress = instance.getCapabilities().xrResultToString;
        return callPPI(instance.address(), value, buffer, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrResultToString(XrInstance instance, @NativeType("XrResult") int value, @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(buffer, XR_MAX_RESULT_STRING_SIZE);
        }
        return nxrResultToString(instance, value, memAddress(buffer));
    }

    // --- [ xrStructureTypeToString ] ---

    public static int nxrStructureTypeToString(XrInstance instance, int value, long buffer) {
        long __functionAddress = instance.getCapabilities().xrStructureTypeToString;
        return callPPI(instance.address(), value, buffer, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrStructureTypeToString(XrInstance instance, @NativeType("XrStructureType") int value, @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(buffer, XR_MAX_STRUCTURE_NAME_SIZE);
        }
        return nxrStructureTypeToString(instance, value, memAddress(buffer));
    }

    // --- [ xrGetSystem ] ---

    public static int nxrGetSystem(XrInstance instance, long getInfo, long systemId) {
        long __functionAddress = instance.getCapabilities().xrGetSystem;
        return callPPPI(instance.address(), getInfo, systemId, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetSystem(XrInstance instance, @NativeType("XrSystemGetInfo const *") XrSystemGetInfo getInfo, @NativeType("XrSystemId *") LongBuffer systemId) {
        if (CHECKS) {
            check(systemId, 1);
        }
        return nxrGetSystem(instance, getInfo.address(), memAddress(systemId));
    }

    // --- [ xrGetSystemProperties ] ---

    public static int nxrGetSystemProperties(XrInstance instance, long systemId, long properties) {
        long __functionAddress = instance.getCapabilities().xrGetSystemProperties;
        return callPJPI(instance.address(), systemId, properties, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetSystemProperties(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrSystemProperties *") XrSystemProperties properties) {
        return nxrGetSystemProperties(instance, systemId, properties.address());
    }

    // --- [ xrEnumerateEnvironmentBlendModes ] ---

    public static int nxrEnumerateEnvironmentBlendModes(XrInstance instance, long systemId, int viewConfigurationType, int environmentBlendModeCapacityInput, long environmentBlendModeCountOutput, long environmentBlendModes) {
        long __functionAddress = instance.getCapabilities().xrEnumerateEnvironmentBlendModes;
        return callPJPPI(instance.address(), systemId, viewConfigurationType, environmentBlendModeCapacityInput, environmentBlendModeCountOutput, environmentBlendModes, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrEnumerateEnvironmentBlendModes(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("uint32_t *") IntBuffer environmentBlendModeCountOutput, @Nullable @NativeType("XrEnvironmentBlendMode *") IntBuffer environmentBlendModes) {
        if (CHECKS) {
            check(environmentBlendModeCountOutput, 1);
        }
        return nxrEnumerateEnvironmentBlendModes(instance, systemId, viewConfigurationType, remainingSafe(environmentBlendModes), memAddress(environmentBlendModeCountOutput), memAddressSafe(environmentBlendModes));
    }

    // --- [ xrCreateSession ] ---

    public static int nxrCreateSession(XrInstance instance, long createInfo, long session) {
        long __functionAddress = instance.getCapabilities().xrCreateSession;
        return callPPPI(instance.address(), createInfo, session, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrCreateSession(XrInstance instance, @NativeType("XrSessionCreateInfo const *") XrSessionCreateInfo createInfo, @NativeType("XrSession *") PointerBuffer session) {
        if (CHECKS) {
            check(session, 1);
        }
        return nxrCreateSession(instance, createInfo.address(), memAddress(session));
    }

    // --- [ xrDestroySession ] ---

    @NativeType("XrResult")
    public static int xrDestroySession(XrSession session) {
        long __functionAddress = session.getCapabilities().xrDestroySession;
        return callPI(session.address(), __functionAddress);
    }

    // --- [ xrEnumerateReferenceSpaces ] ---

    public static int nxrEnumerateReferenceSpaces(XrSession session, int spaceCapacityInput, long spaceCountOutput, long spaces) {
        long __functionAddress = session.getCapabilities().xrEnumerateReferenceSpaces;
        return callPPPI(session.address(), spaceCapacityInput, spaceCountOutput, spaces, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrEnumerateReferenceSpaces(XrSession session, @NativeType("uint32_t *") IntBuffer spaceCountOutput, @Nullable @NativeType("XrReferenceSpaceType *") IntBuffer spaces) {
        if (CHECKS) {
            check(spaceCountOutput, 1);
        }
        return nxrEnumerateReferenceSpaces(session, remainingSafe(spaces), memAddress(spaceCountOutput), memAddressSafe(spaces));
    }

    // --- [ xrCreateReferenceSpace ] ---

    public static int nxrCreateReferenceSpace(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateReferenceSpace;
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrCreateReferenceSpace(XrSession session, @NativeType("XrReferenceSpaceCreateInfo const *") XrReferenceSpaceCreateInfo createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateReferenceSpace(session, createInfo.address(), memAddress(space));
    }

    // --- [ xrGetReferenceSpaceBoundsRect ] ---

    public static int nxrGetReferenceSpaceBoundsRect(XrSession session, int referenceSpaceType, long bounds) {
        long __functionAddress = session.getCapabilities().xrGetReferenceSpaceBoundsRect;
        return callPPI(session.address(), referenceSpaceType, bounds, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetReferenceSpaceBoundsRect(XrSession session, @NativeType("XrReferenceSpaceType") int referenceSpaceType, @NativeType("XrExtent2Df *") XrExtent2Df bounds) {
        return nxrGetReferenceSpaceBoundsRect(session, referenceSpaceType, bounds.address());
    }

    // --- [ xrCreateActionSpace ] ---

    public static int nxrCreateActionSpace(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateActionSpace;
        if (CHECKS) {
            XrActionSpaceCreateInfo.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrCreateActionSpace(XrSession session, @NativeType("XrActionSpaceCreateInfo const *") XrActionSpaceCreateInfo createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateActionSpace(session, createInfo.address(), memAddress(space));
    }

    // --- [ xrLocateSpace ] ---

    public static int nxrLocateSpace(XrSpace space, XrSpace baseSpace, long time, long location) {
        long __functionAddress = space.getCapabilities().xrLocateSpace;
        return callPPJPI(space.address(), baseSpace.address(), time, location, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrLocateSpace(XrSpace space, XrSpace baseSpace, @NativeType("XrTime") long time, @NativeType("XrSpaceLocation *") XrSpaceLocation location) {
        return nxrLocateSpace(space, baseSpace, time, location.address());
    }

    // --- [ xrDestroySpace ] ---

    @NativeType("XrResult")
    public static int xrDestroySpace(XrSpace space) {
        long __functionAddress = space.getCapabilities().xrDestroySpace;
        return callPI(space.address(), __functionAddress);
    }

    // --- [ xrEnumerateViewConfigurations ] ---

    public static int nxrEnumerateViewConfigurations(XrInstance instance, long systemId, int viewConfigurationTypeCapacityInput, long viewConfigurationTypeCountOutput, long viewConfigurationTypes) {
        long __functionAddress = instance.getCapabilities().xrEnumerateViewConfigurations;
        return callPJPPI(instance.address(), systemId, viewConfigurationTypeCapacityInput, viewConfigurationTypeCountOutput, viewConfigurationTypes, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrEnumerateViewConfigurations(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer viewConfigurationTypeCountOutput, @Nullable @NativeType("XrViewConfigurationType *") IntBuffer viewConfigurationTypes) {
        if (CHECKS) {
            check(viewConfigurationTypeCountOutput, 1);
        }
        return nxrEnumerateViewConfigurations(instance, systemId, remainingSafe(viewConfigurationTypes), memAddress(viewConfigurationTypeCountOutput), memAddressSafe(viewConfigurationTypes));
    }

    // --- [ xrGetViewConfigurationProperties ] ---

    public static int nxrGetViewConfigurationProperties(XrInstance instance, long systemId, int viewConfigurationType, long configurationProperties) {
        long __functionAddress = instance.getCapabilities().xrGetViewConfigurationProperties;
        return callPJPI(instance.address(), systemId, viewConfigurationType, configurationProperties, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetViewConfigurationProperties(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("XrViewConfigurationProperties *") XrViewConfigurationProperties configurationProperties) {
        return nxrGetViewConfigurationProperties(instance, systemId, viewConfigurationType, configurationProperties.address());
    }

    // --- [ xrEnumerateViewConfigurationViews ] ---

    public static int nxrEnumerateViewConfigurationViews(XrInstance instance, long systemId, int viewConfigurationType, int viewCapacityInput, long viewCountOutput, long views) {
        long __functionAddress = instance.getCapabilities().xrEnumerateViewConfigurationViews;
        return callPJPPI(instance.address(), systemId, viewConfigurationType, viewCapacityInput, viewCountOutput, views, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrEnumerateViewConfigurationViews(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("uint32_t *") IntBuffer viewCountOutput, @Nullable @NativeType("XrViewConfigurationView *") XrViewConfigurationView.Buffer views) {
        if (CHECKS) {
            check(viewCountOutput, 1);
        }
        return nxrEnumerateViewConfigurationViews(instance, systemId, viewConfigurationType, remainingSafe(views), memAddress(viewCountOutput), memAddressSafe(views));
    }

    // --- [ xrEnumerateSwapchainFormats ] ---

    public static int nxrEnumerateSwapchainFormats(XrSession session, int formatCapacityInput, long formatCountOutput, long formats) {
        long __functionAddress = session.getCapabilities().xrEnumerateSwapchainFormats;
        return callPPPI(session.address(), formatCapacityInput, formatCountOutput, formats, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrEnumerateSwapchainFormats(XrSession session, @NativeType("uint32_t *") IntBuffer formatCountOutput, @Nullable @NativeType("int64_t *") LongBuffer formats) {
        if (CHECKS) {
            check(formatCountOutput, 1);
        }
        return nxrEnumerateSwapchainFormats(session, remainingSafe(formats), memAddress(formatCountOutput), memAddressSafe(formats));
    }

    // --- [ xrCreateSwapchain ] ---

    public static int nxrCreateSwapchain(XrSession session, long createInfo, long swapchain) {
        long __functionAddress = session.getCapabilities().xrCreateSwapchain;
        return callPPPI(session.address(), createInfo, swapchain, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrCreateSwapchain(XrSession session, @NativeType("XrSwapchainCreateInfo const *") XrSwapchainCreateInfo createInfo, @NativeType("XrSwapchain *") PointerBuffer swapchain) {
        if (CHECKS) {
            check(swapchain, 1);
        }
        return nxrCreateSwapchain(session, createInfo.address(), memAddress(swapchain));
    }

    // --- [ xrDestroySwapchain ] ---

    @NativeType("XrResult")
    public static int xrDestroySwapchain(XrSwapchain swapchain) {
        long __functionAddress = swapchain.getCapabilities().xrDestroySwapchain;
        return callPI(swapchain.address(), __functionAddress);
    }

    // --- [ xrEnumerateSwapchainImages ] ---

    public static int nxrEnumerateSwapchainImages(XrSwapchain swapchain, int imageCapacityInput, long imageCountOutput, long images) {
        long __functionAddress = swapchain.getCapabilities().xrEnumerateSwapchainImages;
        return callPPPI(swapchain.address(), imageCapacityInput, imageCountOutput, images, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrEnumerateSwapchainImages(XrSwapchain swapchain, @NativeType("uint32_t *") IntBuffer imageCountOutput, @Nullable @NativeType("XrSwapchainImageBaseHeader *") XrSwapchainImageBaseHeader.Buffer images) {
        if (CHECKS) {
            check(imageCountOutput, 1);
        }
        return nxrEnumerateSwapchainImages(swapchain, remainingSafe(images), memAddress(imageCountOutput), memAddressSafe(images));
    }

    // --- [ xrAcquireSwapchainImage ] ---

    public static int nxrAcquireSwapchainImage(XrSwapchain swapchain, long acquireInfo, long index) {
        long __functionAddress = swapchain.getCapabilities().xrAcquireSwapchainImage;
        return callPPPI(swapchain.address(), acquireInfo, index, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrAcquireSwapchainImage(XrSwapchain swapchain, @Nullable @NativeType("XrSwapchainImageAcquireInfo const *") XrSwapchainImageAcquireInfo acquireInfo, @NativeType("uint32_t *") IntBuffer index) {
        if (CHECKS) {
            check(index, 1);
        }
        return nxrAcquireSwapchainImage(swapchain, memAddressSafe(acquireInfo), memAddress(index));
    }

    // --- [ xrWaitSwapchainImage ] ---

    public static int nxrWaitSwapchainImage(XrSwapchain swapchain, long waitInfo) {
        long __functionAddress = swapchain.getCapabilities().xrWaitSwapchainImage;
        return callPPI(swapchain.address(), waitInfo, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrWaitSwapchainImage(XrSwapchain swapchain, @NativeType("XrSwapchainImageWaitInfo const *") XrSwapchainImageWaitInfo waitInfo) {
        return nxrWaitSwapchainImage(swapchain, waitInfo.address());
    }

    // --- [ xrReleaseSwapchainImage ] ---

    public static int nxrReleaseSwapchainImage(XrSwapchain swapchain, long releaseInfo) {
        long __functionAddress = swapchain.getCapabilities().xrReleaseSwapchainImage;
        return callPPI(swapchain.address(), releaseInfo, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrReleaseSwapchainImage(XrSwapchain swapchain, @Nullable @NativeType("XrSwapchainImageReleaseInfo const *") XrSwapchainImageReleaseInfo releaseInfo) {
        return nxrReleaseSwapchainImage(swapchain, memAddressSafe(releaseInfo));
    }

    // --- [ xrBeginSession ] ---

    public static int nxrBeginSession(XrSession session, long beginInfo) {
        long __functionAddress = session.getCapabilities().xrBeginSession;
        return callPPI(session.address(), beginInfo, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrBeginSession(XrSession session, @NativeType("XrSessionBeginInfo const *") XrSessionBeginInfo beginInfo) {
        return nxrBeginSession(session, beginInfo.address());
    }

    // --- [ xrEndSession ] ---

    @NativeType("XrResult")
    public static int xrEndSession(XrSession session) {
        long __functionAddress = session.getCapabilities().xrEndSession;
        return callPI(session.address(), __functionAddress);
    }

    // --- [ xrRequestExitSession ] ---

    @NativeType("XrResult")
    public static int xrRequestExitSession(XrSession session) {
        long __functionAddress = session.getCapabilities().xrRequestExitSession;
        return callPI(session.address(), __functionAddress);
    }

    // --- [ xrWaitFrame ] ---

    public static int nxrWaitFrame(XrSession session, long frameWaitInfo, long frameState) {
        long __functionAddress = session.getCapabilities().xrWaitFrame;
        return callPPPI(session.address(), frameWaitInfo, frameState, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrWaitFrame(XrSession session, @Nullable @NativeType("XrFrameWaitInfo const *") XrFrameWaitInfo frameWaitInfo, @NativeType("XrFrameState *") XrFrameState frameState) {
        return nxrWaitFrame(session, memAddressSafe(frameWaitInfo), frameState.address());
    }

    // --- [ xrBeginFrame ] ---

    public static int nxrBeginFrame(XrSession session, long frameBeginInfo) {
        long __functionAddress = session.getCapabilities().xrBeginFrame;
        return callPPI(session.address(), frameBeginInfo, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrBeginFrame(XrSession session, @Nullable @NativeType("XrFrameBeginInfo const *") XrFrameBeginInfo frameBeginInfo) {
        return nxrBeginFrame(session, memAddressSafe(frameBeginInfo));
    }

    // --- [ xrEndFrame ] ---

    public static int nxrEndFrame(XrSession session, long frameEndInfo) {
        long __functionAddress = session.getCapabilities().xrEndFrame;
        return callPPI(session.address(), frameEndInfo, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrEndFrame(XrSession session, @NativeType("XrFrameEndInfo const *") XrFrameEndInfo frameEndInfo) {
        return nxrEndFrame(session, frameEndInfo.address());
    }

    // --- [ xrLocateViews ] ---

    public static int nxrLocateViews(XrSession session, long viewLocateInfo, long viewState, int viewCapacityInput, long viewCountOutput, long views) {
        long __functionAddress = session.getCapabilities().xrLocateViews;
        if (CHECKS) {
            XrViewLocateInfo.validate(viewLocateInfo);
        }
        return callPPPPPI(session.address(), viewLocateInfo, viewState, viewCapacityInput, viewCountOutput, views, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrLocateViews(XrSession session, @NativeType("XrViewLocateInfo const *") XrViewLocateInfo viewLocateInfo, @NativeType("XrViewState *") XrViewState viewState, @NativeType("uint32_t *") IntBuffer viewCountOutput, @Nullable @NativeType("XrView *") XrView.Buffer views) {
        if (CHECKS) {
            check(viewCountOutput, 1);
        }
        return nxrLocateViews(session, viewLocateInfo.address(), viewState.address(), remainingSafe(views), memAddress(viewCountOutput), memAddressSafe(views));
    }

    // --- [ xrStringToPath ] ---

    public static int nxrStringToPath(XrInstance instance, long pathString, long path) {
        long __functionAddress = instance.getCapabilities().xrStringToPath;
        return callPPPI(instance.address(), pathString, path, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrStringToPath(XrInstance instance, @NativeType("char const *") ByteBuffer pathString, @NativeType("XrPath *") LongBuffer path) {
        if (CHECKS) {
            checkNT1(pathString);
            check(path, 1);
        }
        return nxrStringToPath(instance, memAddress(pathString), memAddress(path));
    }

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

    public static int nxrPathToString(XrInstance instance, long path, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = instance.getCapabilities().xrPathToString;
        return callPJPPI(instance.address(), path, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrPathToString(XrInstance instance, @NativeType("XrPath") long path, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @Nullable @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrPathToString(instance, path, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrCreateActionSet ] ---

    public static int nxrCreateActionSet(XrInstance instance, long createInfo, long actionSet) {
        long __functionAddress = instance.getCapabilities().xrCreateActionSet;
        return callPPPI(instance.address(), createInfo, actionSet, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrCreateActionSet(XrInstance instance, @NativeType("XrActionSetCreateInfo const *") XrActionSetCreateInfo createInfo, @NativeType("XrActionSet *") PointerBuffer actionSet) {
        if (CHECKS) {
            check(actionSet, 1);
        }
        return nxrCreateActionSet(instance, createInfo.address(), memAddress(actionSet));
    }

    // --- [ xrDestroyActionSet ] ---

    @NativeType("XrResult")
    public static int xrDestroyActionSet(XrActionSet actionSet) {
        long __functionAddress = actionSet.getCapabilities().xrDestroyActionSet;
        return callPI(actionSet.address(), __functionAddress);
    }

    // --- [ xrCreateAction ] ---

    public static int nxrCreateAction(XrActionSet actionSet, long createInfo, long action) {
        long __functionAddress = actionSet.getCapabilities().xrCreateAction;
        return callPPPI(actionSet.address(), createInfo, action, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrCreateAction(XrActionSet actionSet, @NativeType("XrActionCreateInfo const *") XrActionCreateInfo createInfo, @NativeType("XrAction *") PointerBuffer action) {
        if (CHECKS) {
            check(action, 1);
        }
        return nxrCreateAction(actionSet, createInfo.address(), memAddress(action));
    }

    // --- [ xrDestroyAction ] ---

    @NativeType("XrResult")
    public static int xrDestroyAction(XrAction action) {
        long __functionAddress = action.getCapabilities().xrDestroyAction;
        return callPI(action.address(), __functionAddress);
    }

    // --- [ xrSuggestInteractionProfileBindings ] ---

    public static int nxrSuggestInteractionProfileBindings(XrInstance instance, long suggestedBindings) {
        long __functionAddress = instance.getCapabilities().xrSuggestInteractionProfileBindings;
        if (CHECKS) {
            XrInteractionProfileSuggestedBinding.validate(suggestedBindings);
        }
        return callPPI(instance.address(), suggestedBindings, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrSuggestInteractionProfileBindings(XrInstance instance, @NativeType("XrInteractionProfileSuggestedBinding const *") XrInteractionProfileSuggestedBinding suggestedBindings) {
        return nxrSuggestInteractionProfileBindings(instance, suggestedBindings.address());
    }

    // --- [ xrAttachSessionActionSets ] ---

    public static int nxrAttachSessionActionSets(XrSession session, long attachInfo) {
        long __functionAddress = session.getCapabilities().xrAttachSessionActionSets;
        if (CHECKS) {
            XrSessionActionSetsAttachInfo.validate(attachInfo);
        }
        return callPPI(session.address(), attachInfo, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrAttachSessionActionSets(XrSession session, @NativeType("XrSessionActionSetsAttachInfo const *") XrSessionActionSetsAttachInfo attachInfo) {
        return nxrAttachSessionActionSets(session, attachInfo.address());
    }

    // --- [ xrGetCurrentInteractionProfile ] ---

    public static int nxrGetCurrentInteractionProfile(XrSession session, long topLevelUserPath, long interactionProfile) {
        long __functionAddress = session.getCapabilities().xrGetCurrentInteractionProfile;
        return callPJPI(session.address(), topLevelUserPath, interactionProfile, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetCurrentInteractionProfile(XrSession session, @NativeType("XrPath") long topLevelUserPath, @NativeType("XrInteractionProfileState *") XrInteractionProfileState interactionProfile) {
        return nxrGetCurrentInteractionProfile(session, topLevelUserPath, interactionProfile.address());
    }

    // --- [ xrGetActionStateBoolean ] ---

    public static int nxrGetActionStateBoolean(XrSession session, long getInfo, long state) {
        long __functionAddress = session.getCapabilities().xrGetActionStateBoolean;
        if (CHECKS) {
            XrActionStateGetInfo.validate(getInfo);
        }
        return callPPPI(session.address(), getInfo, state, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetActionStateBoolean(XrSession session, @NativeType("XrActionStateGetInfo const *") XrActionStateGetInfo getInfo, @NativeType("XrActionStateBoolean *") XrActionStateBoolean state) {
        return nxrGetActionStateBoolean(session, getInfo.address(), state.address());
    }

    // --- [ xrGetActionStateFloat ] ---

    public static int nxrGetActionStateFloat(XrSession session, long getInfo, long state) {
        long __functionAddress = session.getCapabilities().xrGetActionStateFloat;
        if (CHECKS) {
            XrActionStateGetInfo.validate(getInfo);
        }
        return callPPPI(session.address(), getInfo, state, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetActionStateFloat(XrSession session, @NativeType("XrActionStateGetInfo const *") XrActionStateGetInfo getInfo, @NativeType("XrActionStateFloat *") XrActionStateFloat state) {
        return nxrGetActionStateFloat(session, getInfo.address(), state.address());
    }

    // --- [ xrGetActionStateVector2f ] ---

    public static int nxrGetActionStateVector2f(XrSession session, long getInfo, long state) {
        long __functionAddress = session.getCapabilities().xrGetActionStateVector2f;
        if (CHECKS) {
            XrActionStateGetInfo.validate(getInfo);
        }
        return callPPPI(session.address(), getInfo, state, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetActionStateVector2f(XrSession session, @NativeType("XrActionStateGetInfo const *") XrActionStateGetInfo getInfo, @NativeType("XrActionStateVector2f *") XrActionStateVector2f state) {
        return nxrGetActionStateVector2f(session, getInfo.address(), state.address());
    }

    // --- [ xrGetActionStatePose ] ---

    public static int nxrGetActionStatePose(XrSession session, long getInfo, long state) {
        long __functionAddress = session.getCapabilities().xrGetActionStatePose;
        if (CHECKS) {
            XrActionStateGetInfo.validate(getInfo);
        }
        return callPPPI(session.address(), getInfo, state, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetActionStatePose(XrSession session, @NativeType("XrActionStateGetInfo const *") XrActionStateGetInfo getInfo, @NativeType("XrActionStatePose *") XrActionStatePose state) {
        return nxrGetActionStatePose(session, getInfo.address(), state.address());
    }

    // --- [ xrSyncActions ] ---

    public static int nxrSyncActions(XrSession session, long syncInfo) {
        long __functionAddress = session.getCapabilities().xrSyncActions;
        return callPPI(session.address(), syncInfo, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrSyncActions(XrSession session, @NativeType("XrActionsSyncInfo const *") XrActionsSyncInfo syncInfo) {
        return nxrSyncActions(session, syncInfo.address());
    }

    // --- [ xrEnumerateBoundSourcesForAction ] ---

    public static int nxrEnumerateBoundSourcesForAction(XrSession session, long enumerateInfo, int sourceCapacityInput, long sourceCountOutput, long sources) {
        long __functionAddress = session.getCapabilities().xrEnumerateBoundSourcesForAction;
        if (CHECKS) {
            XrBoundSourcesForActionEnumerateInfo.validate(enumerateInfo);
        }
        return callPPPPI(session.address(), enumerateInfo, sourceCapacityInput, sourceCountOutput, sources, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrEnumerateBoundSourcesForAction(XrSession session, @NativeType("XrBoundSourcesForActionEnumerateInfo const *") XrBoundSourcesForActionEnumerateInfo enumerateInfo, @NativeType("uint32_t *") IntBuffer sourceCountOutput, @Nullable @NativeType("XrPath *") LongBuffer sources) {
        if (CHECKS) {
            check(sourceCountOutput, 1);
        }
        return nxrEnumerateBoundSourcesForAction(session, enumerateInfo.address(), remainingSafe(sources), memAddress(sourceCountOutput), memAddressSafe(sources));
    }

    // --- [ xrGetInputSourceLocalizedName ] ---

    public static int nxrGetInputSourceLocalizedName(XrSession session, long getInfo, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = session.getCapabilities().xrGetInputSourceLocalizedName;
        return callPPPPI(session.address(), getInfo, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetInputSourceLocalizedName(XrSession session, @NativeType("XrInputSourceLocalizedNameGetInfo const *") XrInputSourceLocalizedNameGetInfo getInfo, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @Nullable @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetInputSourceLocalizedName(session, getInfo.address(), remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrApplyHapticFeedback ] ---

    public static int nxrApplyHapticFeedback(XrSession session, long hapticActionInfo, long hapticFeedback) {
        long __functionAddress = session.getCapabilities().xrApplyHapticFeedback;
        if (CHECKS) {
            XrHapticActionInfo.validate(hapticActionInfo);
        }
        return callPPPI(session.address(), hapticActionInfo, hapticFeedback, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrApplyHapticFeedback(XrSession session, @NativeType("XrHapticActionInfo const *") XrHapticActionInfo hapticActionInfo, @NativeType("XrHapticBaseHeader const *") XrHapticBaseHeader hapticFeedback) {
        return nxrApplyHapticFeedback(session, hapticActionInfo.address(), hapticFeedback.address());
    }

    // --- [ xrStopHapticFeedback ] ---

    public static int nxrStopHapticFeedback(XrSession session, long hapticActionInfo) {
        long __functionAddress = session.getCapabilities().xrStopHapticFeedback;
        if (CHECKS) {
            XrHapticActionInfo.validate(hapticActionInfo);
        }
        return callPPI(session.address(), hapticActionInfo, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrStopHapticFeedback(XrSession session, @NativeType("XrHapticActionInfo const *") XrHapticActionInfo hapticActionInfo) {
        return nxrStopHapticFeedback(session, hapticActionInfo.address());
    }

    // --- [ XR_MAKE_VERSION ] ---

    /**
     * Constructs an API version number.
     * 
     * <p>This macro <b>can</b> be used when constructing the {@link XrApplicationInfo}{@code ::pname:apiVersion} parameter passed to {@link #xrCreateInstance CreateInstance}.</p>
     *
     * @param major the major version number
     * @param minor the minor version number
     * @param patch the patch version number
     */
    @NativeType("uint64_t")
    public static long XR_MAKE_VERSION(@NativeType("uint32_t") int major, @NativeType("uint32_t") int minor, @NativeType("uint32_t") int patch) {
        return ((major & 0xffffL) << 48) | ((minor & 0xffffL) << 32) | patch;
    }

    // --- [ XR_VERSION_MAJOR ] ---

    /**
     * Extracts the API major version number from a packed version number.
     *
     * @param version the OpenXR API version
     */
    @NativeType("uint64_t")
    public static long XR_VERSION_MAJOR(@NativeType("uint64_t") long version) {
        return (version >>> 48) & 0xffffL;
    }

    // --- [ XR_VERSION_MINOR ] ---

    /**
     * Extracts the API minor version number from a packed version number.
     *
     * @param version the OpenXR API version
     */
    @NativeType("uint64_t")
    public static long XR_VERSION_MINOR(@NativeType("uint64_t") long version) {
        return (version >>> 32) & 0xffffL;
    }

    // --- [ XR_VERSION_PATCH ] ---

    /**
     * Extracts the API patch version number from a packed version number.
     *
     * @param version the OpenXR API version
     */
    @NativeType("uint64_t")
    public static long XR_VERSION_PATCH(@NativeType("uint64_t") long version) {
        return version & 0xffffffffL;
    }

    /** Array version of: {@link #xrEnumerateApiLayerProperties EnumerateApiLayerProperties} */
    @NativeType("XrResult")
    public static int xrEnumerateApiLayerProperties(@NativeType("uint32_t *") int[] propertyCountOutput, @Nullable @NativeType("XrApiLayerProperties *") XrApiLayerProperties.Buffer properties) {
        long __functionAddress = XR.getGlobalCommands().xrEnumerateApiLayerProperties;
        if (CHECKS) {
            check(propertyCountOutput, 1);
        }
        return callPPI(remainingSafe(properties), propertyCountOutput, memAddressSafe(properties), __functionAddress);
    }

    /** Array version of: {@link #xrEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties} */
    @NativeType("XrResult")
    public static int xrEnumerateInstanceExtensionProperties(@Nullable @NativeType("char const *") ByteBuffer layerName, @NativeType("uint32_t *") int[] propertyCountOutput, @Nullable @NativeType("XrExtensionProperties *") XrExtensionProperties.Buffer properties) {
        long __functionAddress = XR.getGlobalCommands().xrEnumerateInstanceExtensionProperties;
        if (CHECKS) {
            checkNT1Safe(layerName);
            check(propertyCountOutput, 1);
        }
        return callPPPI(memAddressSafe(layerName), remainingSafe(properties), propertyCountOutput, memAddressSafe(properties), __functionAddress);
    }

    /** Array version of: {@link #xrEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties} */
    @NativeType("XrResult")
    public static int xrEnumerateInstanceExtensionProperties(@Nullable @NativeType("char const *") CharSequence layerName, @NativeType("uint32_t *") int[] propertyCountOutput, @Nullable @NativeType("XrExtensionProperties *") XrExtensionProperties.Buffer properties) {
        long __functionAddress = XR.getGlobalCommands().xrEnumerateInstanceExtensionProperties;
        if (CHECKS) {
            check(propertyCountOutput, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(layerName, true);
            long layerNameEncoded = layerName == null ? NULL : stack.getPointerAddress();
            return callPPPI(layerNameEncoded, remainingSafe(properties), propertyCountOutput, memAddressSafe(properties), __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #xrGetSystem GetSystem} */
    @NativeType("XrResult")
    public static int xrGetSystem(XrInstance instance, @NativeType("XrSystemGetInfo const *") XrSystemGetInfo getInfo, @NativeType("XrSystemId *") long[] systemId) {
        long __functionAddress = instance.getCapabilities().xrGetSystem;
        if (CHECKS) {
            check(systemId, 1);
        }
        return callPPPI(instance.address(), getInfo.address(), systemId, __functionAddress);
    }

    /** Array version of: {@link #xrEnumerateEnvironmentBlendModes EnumerateEnvironmentBlendModes} */
    @NativeType("XrResult")
    public static int xrEnumerateEnvironmentBlendModes(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("uint32_t *") int[] environmentBlendModeCountOutput, @Nullable @NativeType("XrEnvironmentBlendMode *") int[] environmentBlendModes) {
        long __functionAddress = instance.getCapabilities().xrEnumerateEnvironmentBlendModes;
        if (CHECKS) {
            check(environmentBlendModeCountOutput, 1);
        }
        return callPJPPI(instance.address(), systemId, viewConfigurationType, lengthSafe(environmentBlendModes), environmentBlendModeCountOutput, environmentBlendModes, __functionAddress);
    }

    /** Array version of: {@link #xrEnumerateReferenceSpaces EnumerateReferenceSpaces} */
    @NativeType("XrResult")
    public static int xrEnumerateReferenceSpaces(XrSession session, @NativeType("uint32_t *") int[] spaceCountOutput, @Nullable @NativeType("XrReferenceSpaceType *") int[] spaces) {
        long __functionAddress = session.getCapabilities().xrEnumerateReferenceSpaces;
        if (CHECKS) {
            check(spaceCountOutput, 1);
        }
        return callPPPI(session.address(), lengthSafe(spaces), spaceCountOutput, spaces, __functionAddress);
    }

    /** Array version of: {@link #xrEnumerateViewConfigurations EnumerateViewConfigurations} */
    @NativeType("XrResult")
    public static int xrEnumerateViewConfigurations(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") int[] viewConfigurationTypeCountOutput, @Nullable @NativeType("XrViewConfigurationType *") int[] viewConfigurationTypes) {
        long __functionAddress = instance.getCapabilities().xrEnumerateViewConfigurations;
        if (CHECKS) {
            check(viewConfigurationTypeCountOutput, 1);
        }
        return callPJPPI(instance.address(), systemId, lengthSafe(viewConfigurationTypes), viewConfigurationTypeCountOutput, viewConfigurationTypes, __functionAddress);
    }

    /** Array version of: {@link #xrEnumerateViewConfigurationViews EnumerateViewConfigurationViews} */
    @NativeType("XrResult")
    public static int xrEnumerateViewConfigurationViews(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("uint32_t *") int[] viewCountOutput, @Nullable @NativeType("XrViewConfigurationView *") XrViewConfigurationView.Buffer views) {
        long __functionAddress = instance.getCapabilities().xrEnumerateViewConfigurationViews;
        if (CHECKS) {
            check(viewCountOutput, 1);
        }
        return callPJPPI(instance.address(), systemId, viewConfigurationType, remainingSafe(views), viewCountOutput, memAddressSafe(views), __functionAddress);
    }

    /** Array version of: {@link #xrEnumerateSwapchainFormats EnumerateSwapchainFormats} */
    @NativeType("XrResult")
    public static int xrEnumerateSwapchainFormats(XrSession session, @NativeType("uint32_t *") int[] formatCountOutput, @Nullable @NativeType("int64_t *") long[] formats) {
        long __functionAddress = session.getCapabilities().xrEnumerateSwapchainFormats;
        if (CHECKS) {
            check(formatCountOutput, 1);
        }
        return callPPPI(session.address(), lengthSafe(formats), formatCountOutput, formats, __functionAddress);
    }

    /** Array version of: {@link #xrEnumerateSwapchainImages EnumerateSwapchainImages} */
    @NativeType("XrResult")
    public static int xrEnumerateSwapchainImages(XrSwapchain swapchain, @NativeType("uint32_t *") int[] imageCountOutput, @Nullable @NativeType("XrSwapchainImageBaseHeader *") XrSwapchainImageBaseHeader.Buffer images) {
        long __functionAddress = swapchain.getCapabilities().xrEnumerateSwapchainImages;
        if (CHECKS) {
            check(imageCountOutput, 1);
        }
        return callPPPI(swapchain.address(), remainingSafe(images), imageCountOutput, memAddressSafe(images), __functionAddress);
    }

    /** Array version of: {@link #xrAcquireSwapchainImage AcquireSwapchainImage} */
    @NativeType("XrResult")
    public static int xrAcquireSwapchainImage(XrSwapchain swapchain, @Nullable @NativeType("XrSwapchainImageAcquireInfo const *") XrSwapchainImageAcquireInfo acquireInfo, @NativeType("uint32_t *") int[] index) {
        long __functionAddress = swapchain.getCapabilities().xrAcquireSwapchainImage;
        if (CHECKS) {
            check(index, 1);
        }
        return callPPPI(swapchain.address(), memAddressSafe(acquireInfo), index, __functionAddress);
    }

    /** Array version of: {@link #xrLocateViews LocateViews} */
    @NativeType("XrResult")
    public static int xrLocateViews(XrSession session, @NativeType("XrViewLocateInfo const *") XrViewLocateInfo viewLocateInfo, @NativeType("XrViewState *") XrViewState viewState, @NativeType("uint32_t *") int[] viewCountOutput, @Nullable @NativeType("XrView *") XrView.Buffer views) {
        long __functionAddress = session.getCapabilities().xrLocateViews;
        if (CHECKS) {
            check(viewCountOutput, 1);
            XrViewLocateInfo.validate(viewLocateInfo.address());
        }
        return callPPPPPI(session.address(), viewLocateInfo.address(), viewState.address(), remainingSafe(views), viewCountOutput, memAddressSafe(views), __functionAddress);
    }

    /** Array version of: {@link #xrStringToPath StringToPath} */
    @NativeType("XrResult")
    public static int xrStringToPath(XrInstance instance, @NativeType("char const *") ByteBuffer pathString, @NativeType("XrPath *") long[] path) {
        long __functionAddress = instance.getCapabilities().xrStringToPath;
        if (CHECKS) {
            checkNT1(pathString);
            check(path, 1);
        }
        return callPPPI(instance.address(), memAddress(pathString), path, __functionAddress);
    }

    /** Array version of: {@link #xrStringToPath StringToPath} */
    @NativeType("XrResult")
    public static int xrStringToPath(XrInstance instance, @NativeType("char const *") CharSequence pathString, @NativeType("XrPath *") long[] path) {
        long __functionAddress = instance.getCapabilities().xrStringToPath;
        if (CHECKS) {
            check(path, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathString, true);
            long pathStringEncoded = stack.getPointerAddress();
            return callPPPI(instance.address(), pathStringEncoded, path, __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #xrPathToString PathToString} */
    @NativeType("XrResult")
    public static int xrPathToString(XrInstance instance, @NativeType("XrPath") long path, @NativeType("uint32_t *") int[] bufferCountOutput, @Nullable @NativeType("char *") ByteBuffer buffer) {
        long __functionAddress = instance.getCapabilities().xrPathToString;
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return callPJPPI(instance.address(), path, remainingSafe(buffer), bufferCountOutput, memAddressSafe(buffer), __functionAddress);
    }

    /** Array version of: {@link #xrEnumerateBoundSourcesForAction EnumerateBoundSourcesForAction} */
    @NativeType("XrResult")
    public static int xrEnumerateBoundSourcesForAction(XrSession session, @NativeType("XrBoundSourcesForActionEnumerateInfo const *") XrBoundSourcesForActionEnumerateInfo enumerateInfo, @NativeType("uint32_t *") int[] sourceCountOutput, @Nullable @NativeType("XrPath *") long[] sources) {
        long __functionAddress = session.getCapabilities().xrEnumerateBoundSourcesForAction;
        if (CHECKS) {
            check(sourceCountOutput, 1);
            XrBoundSourcesForActionEnumerateInfo.validate(enumerateInfo.address());
        }
        return callPPPPI(session.address(), enumerateInfo.address(), lengthSafe(sources), sourceCountOutput, sources, __functionAddress);
    }

    /** Array version of: {@link #xrGetInputSourceLocalizedName GetInputSourceLocalizedName} */
    @NativeType("XrResult")
    public static int xrGetInputSourceLocalizedName(XrSession session, @NativeType("XrInputSourceLocalizedNameGetInfo const *") XrInputSourceLocalizedNameGetInfo getInfo, @NativeType("uint32_t *") int[] bufferCountOutput, @Nullable @NativeType("char *") ByteBuffer buffer) {
        long __functionAddress = session.getCapabilities().xrGetInputSourceLocalizedName;
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return callPPPPI(session.address(), getInfo.address(), remainingSafe(buffer), bufferCountOutput, memAddressSafe(buffer), __functionAddress);
    }

}