/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val XR10 = "XR10".nativeClass(Module.OPENXR, "XR10", prefix = "XR", binding = XR_BINDING_INSTANCE) {
    EnumConstant(
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
        "FORM_FACTOR_HEAD_MOUNTED_DISPLAY".."1",
        "FORM_FACTOR_HANDHELD_DISPLAY".."2"
    )

    EnumConstant(
        "VIEW_CONFIGURATION_TYPE_PRIMARY_MONO".."1",
        "VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO".."2"
    )

    EnumConstant(
        "ENVIRONMENT_BLEND_MODE_OPAQUE".."1",
        "ENVIRONMENT_BLEND_MODE_ADDITIVE".."2",
        "ENVIRONMENT_BLEND_MODE_ALPHA_BLEND".."3"
    )

    EnumConstant(
        "SPACE_VELOCITY_LINEAR_VALID_BIT".enum(0x00000001),
        "SPACE_VELOCITY_ANGULAR_VALID_BIT".enum(0x00000002)
    )

    EnumConstant(
        "REFERENCE_SPACE_TYPE_VIEW".."1",
        "REFERENCE_SPACE_TYPE_LOCAL".."2",
        "REFERENCE_SPACE_TYPE_STAGE".."3"
    )

    EnumConstant(
        "SPACE_LOCATION_ORIENTATION_VALID_BIT".enum(0x00000001),
        "SPACE_LOCATION_POSITION_VALID_BIT".enum(0x00000002),
        "SPACE_LOCATION_ORIENTATION_TRACKED_BIT".enum(0x00000004),
        "SPACE_LOCATION_POSITION_TRACKED_BIT".enum(0x00000008)
    )

    EnumConstant(
        "SWAPCHAIN_CREATE_PROTECTED_CONTENT_BIT".enum(0x00000001),
        "SWAPCHAIN_CREATE_STATIC_IMAGE_BIT".enum(0x00000002)
    )

    EnumConstant(
        "SWAPCHAIN_USAGE_COLOR_ATTACHMENT_BIT".enum(0x00000001),
        "SWAPCHAIN_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT".enum(0x00000002),
        "SWAPCHAIN_USAGE_UNORDERED_ACCESS_BIT".enum(0x00000004),
        "SWAPCHAIN_USAGE_TRANSFER_SRC_BIT".enum(0x00000008),
        "SWAPCHAIN_USAGE_TRANSFER_DST_BIT".enum(0x00000010),
        "SWAPCHAIN_USAGE_SAMPLED_BIT".enum(0x00000020),
        "SWAPCHAIN_USAGE_MUTABLE_FORMAT_BIT".enum(0x00000040)
    )

    EnumConstant(
        "COMPOSITION_LAYER_CORRECT_CHROMATIC_ABERRATION_BIT".enum(0x00000001),
        "COMPOSITION_LAYER_BLEND_TEXTURE_SOURCE_ALPHA_BIT".enum(0x00000002),
        "COMPOSITION_LAYER_UNPREMULTIPLIED_ALPHA_BIT".enum(0x00000004)
    )

    EnumConstant(
        "VIEW_STATE_ORIENTATION_VALID_BIT".enum(0x00000001),
        "VIEW_STATE_POSITION_VALID_BIT".enum(0x00000002),
        "VIEW_STATE_ORIENTATION_TRACKED_BIT".enum(0x00000004),
        "VIEW_STATE_POSITION_TRACKED_BIT".enum(0x00000008)
    )

    EnumConstant(
        "ACTION_TYPE_BOOLEAN_INPUT".."1",
        "ACTION_TYPE_FLOAT_INPUT".."2",
        "ACTION_TYPE_VECTOR2F_INPUT".."3",
        "ACTION_TYPE_POSE_INPUT".."4",
        "ACTION_TYPE_VIBRATION_OUTPUT".."100"
    )

    EnumConstant(
        "INPUT_SOURCE_LOCALIZED_NAME_USER_PATH_BIT".enum(0x00000001),
        "INPUT_SOURCE_LOCALIZED_NAME_INTERACTION_PROFILE_BIT".enum(0x00000002),
        "INPUT_SOURCE_LOCALIZED_NAME_COMPONENT_BIT".enum(0x00000004)
    )

    EnumConstant(
        "EYE_VISIBILITY_BOTH".."0",
        "EYE_VISIBILITY_LEFT".."1",
        "EYE_VISIBILITY_RIGHT".."2"
    )

    EnumConstant(
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

        XrInstance("instance"),
        charUTF8.const.p("name"),
        Check(1)..PFN_xrVoidFunction.p("function")
    )

    GlobalCommand..XrResult(
        "EnumerateApiLayerProperties",

        AutoSize("properties")..uint32_t("propertyCapacityInput"),
        Check(1)..uint32_t.p("propertyCountOutput"),
        nullable..XrApiLayerProperties.p("properties")
    )

    GlobalCommand..XrResult(
        "EnumerateInstanceExtensionProperties",

        nullable..charUTF8.const.p("layerName"),
        AutoSize("properties")..uint32_t("propertyCapacityInput"),
        Check(1)..uint32_t.p("propertyCountOutput"),
        nullable..XrExtensionProperties.p("properties")
    )

    GlobalCommand..XrResult(
        "CreateInstance",

        XrInstanceCreateInfo.const.p("createInfo"),
        Check(1)..XrInstance.p("instance")
    )

    XrResult(
        "DestroyInstance",

        XrInstance("instance")
    )

    XrResult(
        "GetInstanceProperties",

        XrInstance("instance"),
        XrInstanceProperties.p("instanceProperties")
    )

    XrResult(
        "PollEvent",

        XrInstance("instance"),
        XrEventDataBuffer.p("eventData")
    )

    XrResult(
        "ResultToString",

        XrInstance("instance"),
        XrResult("value"),
        Check("XR_MAX_RESULT_STRING_SIZE")..charUTF8.p("buffer")
    )

    XrResult(
        "StructureTypeToString",

        XrInstance("instance"),
        XrStructureType("value"),
        Check("XR_MAX_STRUCTURE_NAME_SIZE")..charUTF8.p("buffer")
    )

    // Device

    XrResult(
        "GetSystem",

        XrInstance("instance"),
        XrSystemGetInfo.const.p("getInfo"),
        Check(1)..XrSystemId.p("systemId")
    )

    XrResult(
        "GetSystemProperties",

        XrInstance("instance"),
        XrSystemId("systemId"),
        XrSystemProperties.p("properties")
    )

    XrResult(
        "EnumerateEnvironmentBlendModes",

        XrInstance("instance"),
        XrSystemId("systemId"),
        XrViewConfigurationType("viewConfigurationType"),
        AutoSize("environmentBlendModes")..uint32_t("environmentBlendModeCapacityInput"),
        Check(1)..uint32_t.p("environmentBlendModeCountOutput"),
        nullable..XrEnvironmentBlendMode.p("environmentBlendModes")
    )

    XrResult(
        "CreateSession",

        XrInstance("instance"),
        XrSessionCreateInfo.const.p("createInfo"),
        Check(1)..XrSession.p("session")
    )

    XrResult(
        "DestroySession",

        XrSession("session")
    )

    // Space

    XrResult(
        "EnumerateReferenceSpaces",

        XrSession("session"),
        AutoSize("spaces")..uint32_t("spaceCapacityInput"),
        Check(1)..uint32_t.p("spaceCountOutput"),
        nullable..XrReferenceSpaceType.p("spaces")
    )

    XrResult(
        "CreateReferenceSpace",

        XrSession("session"),
        XrReferenceSpaceCreateInfo.const.p("createInfo"),
        Check(1)..XrSpace.p("space")
    )

    XrResult(
        "GetReferenceSpaceBoundsRect",

        XrSession("session"),
        XrReferenceSpaceType("referenceSpaceType"),
        XrExtent2Df.p("bounds")
    )

    XrResult(
        "CreateActionSpace",

        XrSession("session"),
        XrActionSpaceCreateInfo.const.p("createInfo"),
        Check(1)..XrSpace.p("space")
    )

    XrResult(
        "LocateSpace",

        XrSpace("space"),
        XrSpace("baseSpace"),
        XrTime("time"),
        XrSpaceLocation.p("location")
    )

    XrResult(
        "DestroySpace",

        XrSpace("space")
    )

    // ViewConfigurations

    XrResult(
        "EnumerateViewConfigurations",

        XrInstance("instance"),
        XrSystemId("systemId"),
        AutoSize("viewConfigurationTypes")..uint32_t("viewConfigurationTypeCapacityInput"),
        Check(1)..uint32_t.p("viewConfigurationTypeCountOutput"),
        nullable..XrViewConfigurationType.p("viewConfigurationTypes")
    )

    XrResult(
        "GetViewConfigurationProperties",

        XrInstance("instance"),
        XrSystemId("systemId"),
        XrViewConfigurationType("viewConfigurationType"),
        XrViewConfigurationProperties.p("configurationProperties")
    )

    XrResult(
        "EnumerateViewConfigurationViews",

        XrInstance("instance"),
        XrSystemId("systemId"),
        XrViewConfigurationType("viewConfigurationType"),
        AutoSize("views")..uint32_t("viewCapacityInput"),
        Check(1)..uint32_t.p("viewCountOutput"),
        nullable..XrViewConfigurationView.p("views")
    )

    // Image

    XrResult(
        "EnumerateSwapchainFormats",

        XrSession("session"),
        AutoSize("formats")..uint32_t("formatCapacityInput"),
        Check(1)..uint32_t.p("formatCountOutput"),
        nullable..int64_t.p("formats")
    )

    XrResult(
        "CreateSwapchain",

        XrSession("session"),
        XrSwapchainCreateInfo.const.p("createInfo"),
        Check(1)..XrSwapchain.p("swapchain")
    )

    XrResult(
        "DestroySwapchain",

        XrSwapchain("swapchain")
    )

    XrResult(
        "EnumerateSwapchainImages",

        XrSwapchain("swapchain"),
        AutoSize("images")..uint32_t("imageCapacityInput"),
        Check(1)..uint32_t.p("imageCountOutput"),
        nullable..XrSwapchainImageBaseHeader.p("images")
    )

    XrResult(
        "AcquireSwapchainImage",

        XrSwapchain("swapchain"),
        nullable..XrSwapchainImageAcquireInfo.const.p("acquireInfo"),
        Check(1)..uint32_t.p("index")
    )

    XrResult(
        "WaitSwapchainImage",

        XrSwapchain("swapchain"),
        XrSwapchainImageWaitInfo.const.p("waitInfo")
    )

    XrResult(
        "ReleaseSwapchainImage",

        XrSwapchain("swapchain"),
        nullable..XrSwapchainImageReleaseInfo.const.p("releaseInfo")
    )

    // Session

    XrResult(
        "BeginSession",

        XrSession("session"),
        XrSessionBeginInfo.const.p("beginInfo")
    )

    XrResult(
        "EndSession",

        XrSession("session")
    )

    XrResult(
        "RequestExitSession",

        XrSession("session")
    )

    // Display Timing

    XrResult(
        "WaitFrame",

        XrSession("session"),
        nullable..XrFrameWaitInfo.const.p("frameWaitInfo"),
        XrFrameState.p("frameState")
    )

    XrResult(
        "BeginFrame",

        XrSession("session"),
        nullable..XrFrameBeginInfo.const.p("frameBeginInfo")
    )

    XrResult(
        "EndFrame",

        XrSession("session"),
        XrFrameEndInfo.const.p("frameEndInfo")
    )

    XrResult(
        "LocateViews",

        XrSession("session"),
        XrViewLocateInfo.const.p("viewLocateInfo"),
        XrViewState.p("viewState"),
        AutoSize("views")..uint32_t("viewCapacityInput"),
        Check(1)..uint32_t.p("viewCountOutput"),
        nullable..XrView.p("views")
    )

    // Semantic Paths

    XrResult(
        "StringToPath",

        XrInstance("instance"),
        charUTF8.const.p("pathString"),
        Check(1)..XrPath.p("path")
    )

    XrResult(
        "PathToString",

        XrInstance("instance"),
        XrPath("path"),
        AutoSize("buffer")..uint32_t("bufferCapacityInput"),
        Check(1)..uint32_t.p("bufferCountOutput"),
        nullable..char.p("buffer")
    )

    // Input

    XrResult(
        "CreateActionSet",

        XrInstance("instance"),
        XrActionSetCreateInfo.const.p("createInfo"),
        Check(1)..XrActionSet.p("actionSet")
    )

    XrResult(
        "DestroyActionSet",

        XrActionSet("actionSet")
    )

    XrResult(
        "CreateAction",

        XrActionSet("actionSet"),
        XrActionCreateInfo.const.p("createInfo"),
        Check(1)..XrAction.p("action")
    )

    XrResult(
        "DestroyAction",

        XrAction("action")
    )

    XrResult(
        "SuggestInteractionProfileBindings",

        XrInstance("instance"),
        XrInteractionProfileSuggestedBinding.const.p("suggestedBindings")
    )

    XrResult(
        "AttachSessionActionSets",

        XrSession("session"),
        XrSessionActionSetsAttachInfo.const.p("attachInfo")
    )

    XrResult(
        "GetCurrentInteractionProfile",

        XrSession("session"),
        XrPath("topLevelUserPath"),
        XrInteractionProfileState.p("interactionProfile")
    )

    XrResult(
        "GetActionStateBoolean",

        XrSession("session"),
        XrActionStateGetInfo.const.p("getInfo"),
        XrActionStateBoolean.p("state")
    )

    XrResult(
        "GetActionStateFloat",

        XrSession("session"),
        XrActionStateGetInfo.const.p("getInfo"),
        XrActionStateFloat.p("state")
    )

    XrResult(
        "GetActionStateVector2f",

        XrSession("session"),
        XrActionStateGetInfo.const.p("getInfo"),
        XrActionStateVector2f.p("state")
    )

    XrResult(
        "GetActionStatePose",

        XrSession("session"),
        XrActionStateGetInfo.const.p("getInfo"),
        XrActionStatePose.p("state")
    )

    XrResult(
        "SyncActions",

        XrSession("session"),
        XrActionsSyncInfo.const.p("syncInfo")
    )

    XrResult(
        "EnumerateBoundSourcesForAction",

        XrSession("session"),
        XrBoundSourcesForActionEnumerateInfo.const.p("enumerateInfo"),
        AutoSize("sources")..uint32_t("sourceCapacityInput"),
        Check(1)..uint32_t.p("sourceCountOutput"),
        nullable..XrPath.p("sources")
    )

    XrResult(
        "GetInputSourceLocalizedName",

        XrSession("session"),
        XrInputSourceLocalizedNameGetInfo.const.p("getInfo"),
        AutoSize("buffer")..uint32_t("bufferCapacityInput"),
        Check(1)..uint32_t.p("bufferCountOutput"),
        nullable..char.p("buffer")
    )

    // Haptics

    XrResult(
        "ApplyHapticFeedback",

        XrSession("session"),
        XrHapticActionInfo.const.p("hapticActionInfo"),
        XrHapticBaseHeader.const.p("hapticFeedback")
    )

    XrResult(
        "StopHapticFeedback",

        XrSession("session"),
        XrHapticActionInfo.const.p("hapticActionInfo")
    )

}