/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRSystem = "VRSystem".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRSystem_",
    binding = OPENVR_FNTABLE_BINDING
) {
    nativeImport("<stdint.h>")
    nativeDirective("""
#ifdef LWJGL_WINDOWS
    #define APIENTRY __stdcall
#else
    #define APIENTRY
#endif

typedef struct HmdMatrix34_t
{
    float m[3][4];
} HmdMatrix34_t;

typedef struct HmdMatrix44_t
{
    float m[4][4];
} HmdMatrix44_t;

typedef struct HmdVector2_t
{
    float v[2];
} HmdVector2_t;

typedef struct HmdColor_t
{
    float r;
    float g;
    float b;
    float a;
} HmdColor_t;

typedef struct HiddenAreaMesh_t
{
    struct HmdVector2_t * pVertexData;
    uint32_t unTriangleCount;
    #ifdef LWJGL_x64
        char __padding[4];
    #endif
} HiddenAreaMesh_t;""")

    documentation =
        """
        Main interface for display, distortion, tracking, controller, and event access.

        The {@code IVRSystem} interface provides access to display configuration information, tracking data, distortion functions, controller state, events,
        and device properties. It is the main interface of OpenVR and can be initialized and retrieved with the #InitInternal() function.

        Many functions in {@code IVRSystem} use a tracked device index to identify a specific device attached to the computer. There will never be more than
        #k_unMaxTrackedDeviceCount devices active in the system at any given time. Their indices will be 0 (for the HMD) and 1-15 for the other devices.
        """

    void(
        "GetRecommendedRenderTargetSize",
        "Returns the suggested size for the intermediate render target that the distortion pulls from.",

        Check(1)..uint32_t.p("pnWidth", "recommended width for the offscreen render target"),
        Check(1)..uint32_t.p("pnHeight", "recommended height for the offscreen render target")
    )

    HmdMatrix44_t(
        "GetProjectionMatrix",
        "Returns the projection matrix for the specified eye.",

        EVREye("eEye", "determines which eye the function should return the projection for", "EVREye_\\w+"),
        float("fNearZ", "distance to the near clip plane in meters"),
        float("fFarZ", "distance to the far clip plane in meters")
    )

    void(
        "GetProjectionRaw",
        "Returns the components necessary to build your own projection matrix in case your application is doing something fancy like infinite Z.",

        EVREye("eEye", "determines which eye the function should return the projection for", "EVREye_\\w+"),
        Check(1)..float.p("pfLeft", "coordinate for the left clipping plane"),
        Check(1)..float.p("pfRight", "coordinate for the right clipping plane"),
        Check(1)..float.p("pfTop", "coordinate for the top clipping plane"),
        Check(1)..float.p("pfBottom", "coordinate for the bottom clipping plane")
    )

    bool(
        "ComputeDistortion",
        """
        Gets the result of the distortion function for the specified eye and input UVs. UVs go from 0,0 in the upper left of that eye's viewport and 1,1 in the
        lower right of that eye's viewport.
        """,

        EVREye("eEye", "determines which eye the function should return the distortion value for", "EVREye_\\w+"),
        float("fU", "horizontal texture coordinate for the output pixel within the viewport"),
        float("fV", "vertical texture coordinate for the output pixel within the viewport"),
        DistortionCoordinates_t.p("pDistortionCoordinates", "a struct in which to return the distortion coordinates"),

        returnDoc = "true for success. Otherwise, returns false, and distortion coordinates are not suitable."
    )

    HmdMatrix34_t(
        "GetEyeToHeadTransform",
        """
        Returns the transform from eye space to the head space. Eye space is the per-eye flavor of head space that provides stereo disparity. Instead of
        {@code Model * View * Projection} the sequence is {@code Model * View * Eye^-1 * Projection}. Normally {@code View} and {@code Eye^-1} will be
        multiplied together and treated as {@code View} in your application.
        """,

        EVREye("eEye", "determines which eye the function should return the eye matrix for", "EVREye_\\w+")
    )

    bool(
        "GetTimeSinceLastVsync",
        """
        Returns the number of elapsed seconds since the last recorded vsync event. This will come from a vsync timer event in the timer if possible or from the
        application-reported time if that is not available.
        """,

        Check(1)..float.p(
            "pfSecondsSinceLastVsync",
            "fractional number of seconds since the last vsync event. This will never exceed the length of a single frame."
        ),
        Check(1)..uint64_t.p("pulFrameCounter", "the number of frames since vrserver.exe started"),

        returnDoc = "if no vsync times are available the function will return zero for vsync time and frame counter and return false from the method"
    )

    int32_t(
        "GetD3D9AdapterIndex",
        """
        <h3>D3D9 Only</h3>

        Returns the adapter index that the user should pass into {@code CreateDevice} to set up D3D9 in such a way that it can go full screen exclusive on the
        HMD.
        """,

        returnDoc = "-1 if there was an error"
    )

    void(
        "GetDXGIOutputInfo",
        """
        <h3>D3D10/11 Only</h3>

        Returns the adapter index that the user should pass into {@code EnumAdapters} to create the device and swap chain in DX10 and DX11. If an error occurs
        the index will be set to -1.
        """,

        Check(1)..int32_t.p("pnAdapterIndex", "the index of the adapter to use for this display")
    )

    void(
        "GetOutputDevice",
        """
        Returns platform- and texture-type specific adapter identification so that applications and the compositor are creating textures and swap chains on the
        same GPU. If an error occurs the device will be set to 0.

        <h3>D3D10/11/12 Only (D3D9 Not Supported)</h3>
        Returns the adapter LUID that identifies the GPU attached to the HMD. The user should enumerate all adapters using {@code IDXGIFactory::EnumAdapters}
        and {@code IDXGIAdapter::GetDesc} to find the adapter with the matching LUID, or use {@code IDXGIFactory4::EnumAdapterByLuid}. The discovered
        {@code IDXGIAdapter} should be used to create the device and swap chain.

        <h3>Vulkan Only</h3>
        Returns the {@code VkPhysicalDevice} that should be used by the application. {@code pInstance} must be the instance the application will use to query
        for the {@code VkPhysicalDevice}. The application must create the {@code VkInstance} with extensions returned by #GetVulkanInstanceExtensionsRequired()
        enabled.

        <h3>macOS Only</h3>
        For #ETextureType_TextureType_IOSurface returns the {@code id<MTLDevice>} that should be used by the application.

        On 10.13+ for #ETextureType_TextureType_OpenGL returns the {@code registryId} of the renderer which should be used by the application. See Apple
        Technical Q&amp;A QA1168 for information on enumerating GL Renderers, and the new {@code kCGLRPRegistryIDLow} and {@code kCGLRPRegistryIDHigh}
        {@code CGLRendererProperty} values in the 10.13 SDK.

        Pre 10.13 for #ETextureType_TextureType_OpenGL returns 0, as there is no dependable way to correlate the HMDs {@code MTLDevice} with a GL Renderer.
        """,

        Check(1)..uint64_t.p("pnDevice", ""),
        ETextureType("textureType", "", "ETextureType_\\w+"),
        VkInstance_T.p("pInstance", "an optional parameter that is required only when {@code textureType} is #ETextureType_TextureType_Vulkan")
    )

    bool(
        "IsDisplayOnDesktop",
        "Use to determine if the headset display is part of the desktop (i.e. extended) or hidden (i.e. direct mode).",
        void()
    )

    bool(
        "SetDisplayVisibility",
        "Sets the display visibility (true = extended, false = direct mode).",

        bool("bIsVisibleOnDesktop", "the display visibility"),

        returnDoc = "true indicates that the change was successful"
    )

    void(
        "GetDeviceToAbsoluteTrackingPose",
        """
        The pose that the tracker thinks that the HMD will be in at the specified number of seconds into the future. Pass 0 to get the state at the instant the
        method is called. Most of the time the application should calculate the time until the photons will be emitted from the display and pass that time into
        the method.

        This is roughly analogous to the inverse of the view matrix in most applications, though many games will need to do some additional rotation or
        translation on top of the rotation and translation provided by the head pose.

        For devices where {@code bPoseIsValid} is true the application can use the pose to position the device in question. The provided array can be any size
        up to #k_unMaxTrackedDeviceCount.

        Seated experiences should call this method with #ETrackingUniverseOrigin_TrackingUniverseSeated and receive poses relative to the seated zero pose.
        Standing experiences should call this method with #ETrackingUniverseOrigin_TrackingUniverseStanding and receive poses relative to the Chaperone Play
        Area. #ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated should probably not be used unless the application is the Chaperone calibration tool
        itself, but will provide poses relative to the hardware-specific coordinate system in the driver.
        """,

        ETrackingUniverseOrigin("eOrigin", "tracking universe that returned poses should be relative to", "ETrackingUniverseOrigin_\\w+"),
        float(
            "fPredictedSecondsToPhotonsFromNow",
            "number of seconds from now to predict poses for. Positive numbers are in the future. Pass 0 to get the state at the instant the function is called."
        ),
        TrackedDevicePose_t.p("pTrackedDevicePoseArray", ""),
        AutoSize("pTrackedDevicePoseArray")..uint32_t("unTrackedDevicePoseArrayCount", "")
    )

    HmdMatrix34_t(
        "GetSeatedZeroPoseToStandingAbsoluteTrackingPose",
        """
        Returns the transform from the seated zero pose to the standing absolute tracking system. This allows  applications to represent the seated origin to
        used or transform object positions from one coordinate system to the other.

        The seated origin may or may not be inside the Play Area or Collision Bounds returned by {@code IVRChaperone}. Its position depends on what the user
        has set from the Dashboard settings and previous calls to #ResetZeroPose().
        """,
        void()
    )

    HmdMatrix34_t(
        "GetRawZeroPoseToStandingAbsoluteTrackingPose",
        """
        Returns the transform from the tracking origin to the standing absolute tracking system. This allows applications to convert from raw tracking space to
        the calibrated standing coordinate system.
        """,
        void()
    )

    uint32_t(
        "GetSortedTrackedDeviceIndicesOfClass",
        """
        Get a sorted array of device indices of a given class of tracked devices (e.g. controllers).  Devices are sorted right to left relative to the
        specified tracked device (default: hmd -- pass in -1 for absolute tracking space).
        """,

        ETrackedDeviceClass("eTrackedDeviceClass", "", "ETrackedDeviceClass_\\w+"),
        nullable..TrackedDeviceIndex_t.p("punTrackedDeviceIndexArray", ""),
        AutoSize("punTrackedDeviceIndexArray")..uint32_t("unTrackedDeviceIndexArrayCount", ""),
        TrackedDeviceIndex_t("unRelativeToTrackedDeviceIndex", ""),

        returnDoc = "the number of devices in the list, or the size of the array needed if not large enough"
    )

    EDeviceActivityLevel(
        "GetTrackedDeviceActivityLevel",
        "Returns the level of activity on the device.",

        TrackedDeviceIndex_t("unDeviceId", "")
    )

    void(
        "ApplyTransform",
        """
        Convenience utility to apply the specified transform to the specified pose. This properly transforms all pose components, including velocity and
        angular velocity.
        """,

        TrackedDevicePose_t.p("pOutputPose", ""),
        TrackedDevicePose_t.const.p("pTrackedDevicePose", ""),
        HmdMatrix34_t.const.p("pTransform", "")
    )

    TrackedDeviceIndex_t(
        "GetTrackedDeviceIndexForControllerRole",
        """
        Returns the device index associated with a specific role, for example the left hand or the right hand.

        This function is deprecated in favor of the new {@code IVRInput} system.
        """,

        ETrackedControllerRole("unDeviceType", "", "ETrackedControllerRole_\\w+")
    )

    ETrackedControllerRole(
        "GetControllerRoleForTrackedDeviceIndex",
        """
        Returns the controller type associated with a device index.

        This function is deprecated in favor of the new {@code IVRInput} system.
        """,

        TrackedDeviceIndex_t("unDeviceIndex", "")
    )

    ETrackedDeviceClass(
        "GetTrackedDeviceClass",
        """
        Returns the device class of a tracked device. If there has not been a device connected in this slot since the application started this function will
        return #ETrackedDeviceClass_TrackedDeviceClass_Invalid. For previous detected devices the function will return the previously observed device class.

        To determine which devices exist on the system, just loop from 0 to #k_unMaxTrackedDeviceCount and check the device class. Every device with something
        other than #ETrackedDeviceClass_TrackedDeviceClass_Invalid is associated with an actual tracked device.
        """,

        TrackedDeviceIndex_t("unDeviceIndex", "index of the device to get the device class for.")
    )

    bool(
        "IsTrackedDeviceConnected",
        "Returns true if there is a device connected in this slot.",

        TrackedDeviceIndex_t("unDeviceIndex", "index of the device to test connected state for")
    )

    val GetTrackedDeviceProperty = bool(
        "GetBoolTrackedDeviceProperty",
        "Returns a bool property. If the device index is not valid or the property is not a bool type this function will return false.",

        TrackedDeviceIndex_t("unDeviceIndex", "index of the device to get the property for"),
        ETrackedDeviceProperty("prop", "which property to get"),
        Check(1)..nullable..ETrackedPropertyError.p(
            "pError",
            "the error returned when attempting to fetch this property. This can be #NULL if the caller doesn't care about the source of a property error."
        )
    )

    float(
        "GetFloatTrackedDeviceProperty",
        "Returns a float property. If the device index is not valid or the property is not a float type this function will return 0.",

        GetTrackedDeviceProperty["unDeviceIndex"],
        GetTrackedDeviceProperty["prop"],
        GetTrackedDeviceProperty["pError"]
    )

    int32_t(
        "GetInt32TrackedDeviceProperty",
        "Returns an int property. If the device index is not valid or the property is not a int type this function will return 0.",

        GetTrackedDeviceProperty["unDeviceIndex"],
        GetTrackedDeviceProperty["prop"],
        GetTrackedDeviceProperty["pError"]
    )

    uint64_t(
        "GetUint64TrackedDeviceProperty",
        "Returns a uint64 property. If the device index is not valid or the property is not a uint64 type this function will return 0.",

        GetTrackedDeviceProperty["unDeviceIndex"],
        GetTrackedDeviceProperty["prop"],
        GetTrackedDeviceProperty["pError"]
    )

    HmdMatrix34_t(
        "GetMatrix34TrackedDeviceProperty",
        "Returns a matrix property. If the device index is not valid or the property is not a matrix type, this function will return identity.",

        GetTrackedDeviceProperty["unDeviceIndex"],
        GetTrackedDeviceProperty["prop"],
        GetTrackedDeviceProperty["pError"]
    )

    uint32_t(
        "GetArrayTrackedDeviceProperty",
        """
        Returns an array of one type of property.

        If the device index is not valid or the property is not a single value or an array of the specified type, this function will return 0. Otherwise it
        returns the number of bytes necessary to hold the array of properties. If {@code unBufferSize} is greater than the returned size and {@code pBuffer} is
        non-#NULL, {@code pBuffer} is filled with the contents of array of properties.
        """,

        GetTrackedDeviceProperty["unDeviceIndex"],
        GetTrackedDeviceProperty["prop"],
        PropertyTypeTag_t("propType", ""),
        nullable..void.p("pBuffer", ""),
        AutoSize("pBuffer")..uint32_t("unBufferSize", ""),
        GetTrackedDeviceProperty["pError"]
    )

    uint32_t(
        "GetStringTrackedDeviceProperty",
        """
        Returns a string property. If the device index is not valid or the property is not a string type this function will return 0. Otherwise it returns the
        length of the number of bytes necessary to hold this string including the trailing null. Strings will always fit in buffers of
        #k_unMaxPropertyStringSize characters.
        """,

        GetTrackedDeviceProperty["unDeviceIndex"],
        GetTrackedDeviceProperty["prop"],
        Return(RESULT, "VR.k_unMaxPropertyStringSize", includesNT = true)..nullable..charASCII.p(
            "pchValue",
            "the buffer to store string properties in. {@code unBufferSize} should be the size of this buffer."
        ),
        AutoSize("pchValue")..uint32_t("unBufferSize", "the size of the buffer pointed to by {@code pchValue}"),
        GetTrackedDeviceProperty["pError"]
    )

    charASCII.p(
        "GetPropErrorNameFromEnum",
        "Returns a string that corresponds with the specified property error. The string will be the name of the error enum value for all valid error codes.",

        ETrackedPropertyError("error", "the error code to return a string for", "ETrackedPropertyError_\\w+")
    )

    bool(
        "PollNextEvent",
        "Returns true and fills the event with the next event on the queue if there is one. If there are no events this method returns false.",

        VREvent_t.p("pEvent", "an event structure to fill with the next event"),
        Expression("VREvent.SIZEOF")..uint32_t("uncbVREvent", "the size in bytes of the ##VREvent struct")
    )

    bool(
        "PollNextEventWithPose",
        """
        Returns true and fills the event with the next event on the queue if there is one. If there are no events this method returns false. Fills in the pose
        of the associated tracked device in the provided pose struct. This pose will always be older than the call to this function and should not be used to
        render the device.
        """,

        ETrackingUniverseOrigin("eOrigin", "the tracking system to return the event's pose in", "ETrackingUniverseOrigin_\\w+"),
        VREvent_t.p("pEvent", "an event structure to fill with the next event"),
        Expression("VREvent.SIZEOF")..uint32_t("uncbVREvent", "the size in bytes of the ##VREvent struct"),
        TrackedDevicePose_t.p("pTrackedDevicePose", "a pose struct to fill with the returned event's pose. Must not be #NULL.")
    )

    charASCII.p(
        "GetEventTypeNameFromEnum",
        "Returns the name of an {@code EVREvent} enum value.",

        EVREventType("eType", "the event type to return a string for", "EVREventType_\\w+")
    )

    HiddenAreaMesh_t(
        "GetHiddenAreaMesh",
        """
        Returns the hidden area mesh for the current HMD. The pixels covered by this mesh will never be seen by the user after the lens distortion is applied
        based on visibility to the panels. If this HMD does not have a hidden area mesh, the vertex data and count will be #NULL and 0 respectively.

        This mesh is meant to be rendered into the stencil buffer (or into the depth buffer setting nearz) before rendering each eye's view. This will improve
        performance by letting the GPU early-reject pixels the user will never see before running the pixel shader.

        ${note("Render this mesh with backface culling disabled since the winding order of the vertices can be different per-HMD or per-eye.")}
        """,

        EVREye("eEye", "the eye to get the hidden area mesh for", "EVREye_\\w+"),
        EHiddenAreaMeshType("type", "", "EHiddenAreaMeshType_\\w+")
    )

    bool(
        "GetControllerState",
        """
        Fills the supplied struct with the current state of the controller.

        This function is deprecated in favor of the new {@code IVRInput} system.
        """,

        TrackedDeviceIndex_t("unControllerDeviceIndex", "the tracked device index of the controller to get the state of"),
        VRControllerState_t.p("pControllerState", "a struct to fill with the controller state"),
        Expression("VRControllerState.SIZEOF")..uint32_t("unControllerStateSize", "the size in bytes of the ##VRControllerState struct"),

        returnDoc = "false if the controller index is invalid"
    )

    bool(
        "GetControllerStateWithPose",
        """
        Fills the supplied struct with the current state of the controller and the provided pose with the pose of the controller when the controller state was
        updated most recently. Use this form if you need a precise controller pose as input to your application when the user presses or releases a button.

        This function is deprecated in favor of the new {@code IVRInput} system.
        """,

        ETrackingUniverseOrigin("eOrigin", "the tracking coordinate system to return the pose in", "ETrackingUniverseOrigin_\\w+"),
        TrackedDeviceIndex_t("unControllerDeviceIndex", "the tracked device index of the controller to get the state of"),
        VRControllerState_t.p("pControllerState", "a struct to fill with the controller state"),
        Expression("VRControllerState.SIZEOF")..uint32_t("unControllerStateSize", "the size in bytes of the ##VRControllerState struct"),
        TrackedDevicePose_t.p("pTrackedDevicePose", "a pose struct to fill with the pose of the controller when the last button event occurred")
    )

    void(
        "TriggerHapticPulse",
        """
        Trigger a single haptic pulse on a controller. After this call the application may not trigger another haptic pulse on this controller and axis
        combination for 5ms.

        This function is deprecated in favor of the new {@code IVRInput} system.
        """,

        TrackedDeviceIndex_t("unControllerDeviceIndex", "the tracked device index of the controller to trigger a haptic pulse on"),
        uint32_t("unAxisId", "the ID of the axis to trigger a haptic pulse on"),
        unsigned_short("usDurationMicroSec", "the duration of the desired haptic pulse in microseconds")
    )

    charASCII.p(
        "GetButtonIdNameFromEnum",
        """
        Returns the name of an {@code EVRButtonId} enum value.

        This function is deprecated in favor of the new {@code IVRInput} system.
        """,

        EVRButtonId("eButtonId", "the button ID to return the name of", "EVRButtonId_\\w+")
    )

    charASCII.p(
        "GetControllerAxisTypeNameFromEnum",
        "Returns the name of an {@code EVRControllerAxisType} enum value.",

        EVRControllerAxisType("eAxisType", "the controller axis type to get a name for", "EVRControllerAxisType_\\w+")
    )

    bool(
        "IsInputAvailable",
        """
        Returns true if this application is receiving input from the system. This would return false if system-related functionality is consuming the input
        stream.
        """,
        void()
    )

    bool(
        "IsSteamVRDrawingControllers",
        """
        Returns true if SteamVR is drawing controllers on top of the application. Applications should consider not drawing anything attached to the user's
        hands in this case.
        """,
        void()
    )

    bool(
        "ShouldApplicationPause",
        """
        Returns true if the user has put SteamVR into a mode that is distracting them from the application. For applications where this is appropriate, the
        application should pause ongoing activity.
        """,
        void()
    )

    bool(
        "ShouldApplicationReduceRenderingWork",
        """
        Returns true if SteamVR is doing significant rendering work and the game should do what it can to reduce its own workload. One common way to do this is
        to reduce the size of the render target provided for each eye.
        """,
        void()
    )

    EVRFirmwareError(
        "PerformFirmwareUpdate",
        """
        Performs the actual firmware update if applicable.

        The following events will be sent, if #EVRFirmwareError_VRFirmwareError_None was returned: #EVREventType_VREvent_FirmwareUpdateStarted,
        #EVREventType_VREvent_FirmwareUpdateFinished

        Use the properties #ETrackedDeviceProperty_Prop_Firmware_UpdateAvailable_Bool, #ETrackedDeviceProperty_Prop_Firmware_ManualUpdate_Bool, and
        #ETrackedDeviceProperty_Prop_Firmware_ManualUpdateURL_String to figure our whether a firmware update is available, and to figure out whether its a
        manual update. #ETrackedDeviceProperty_Prop_Firmware_ManualUpdateURL_String should point to an URL describing the manual update process.
        """,

        TrackedDeviceIndex_t("unDeviceIndex", "")
    )

    void(
        "AcknowledgeQuit_Exiting",
        """
        Call this to acknowledge to the system that #EVREventType_VREvent_Quit has been received and that the process is exiting. This extends the timeout
        until the process is killed.
        """
    )

    uint32_t(
        "GetAppContainerFilePaths",
        """
        Retrieves a null-terminated, semicolon-delimited list of UTF8 file paths that an application must have read access to when running inside of an app
        container.
        """,

        Return(RESULT, includesNT = true)..nullable..charUTF8.p("pchBuffer", ""),
        AutoSize("pchBuffer")..uint32_t("unBufferSize", ""),

        returnDoc = "the number of bytes needed to hold the list"
    )

	charASCII.p(
        "GetRuntimeVersion",
        """
        Returns the current version of the SteamVR runtime. The returned string will remain valid until #ShutdownInternal() is called.

        NOTE: Is it not appropriate to use this version to test for the presence of any SteamVR feature. Only use this version number for logging or showing to
        a user, and not to try to detect anything at runtime. When appropriate, feature-specific presence information is provided by other APIs.
        """,
        void()
    )
}