/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ovr.templates

import org.lwjgl.generator.*
import ovr.*

val OVR = "OVR".nativeClass(Module.OVR, prefixMethod = "ovr_", prefixConstant = "ovr") {
    nativeDirective(
        """DISABLE_WARNINGS()
#include "OVR_CAPI.h"
ENABLE_WARNINGS()""")

    documentation =
        """Native bindings to libOVR, using the ${url("https://developer.oculus.com/", "Oculus SDK")} C API."""

    IntConstant(
        "Boolean values",

        "False".."0",
        "True".."1"
    )

    EnumConstant(
        "Initialization flags. ({@code ovrInitFlags})",

        "Init_Debug".enum(
            """
            When a debug library is requested, a slower debugging version of the library will run which can be used to help solve problems in the library and
            debug application code.
            """,
            0x00000001
        ),
        "Init_RequestVersion".enum(
            """
            When a version is requested, the LibOVR runtime respects the {@code RequestedMinorVersion} field and verifies that the
            {@code RequestedMinorVersion} is supported.

            When a version is requested, the LibOVR runtime respects the {@code RequestedMinorVersion} field and verifies that the
            {@code RequestedMinorVersion} is supported. Normally when you specify this flag you simply use #MINOR_VERSION for
            ##OVRInitParams{@code ::RequestedMinorVersion}, though you could use a lower version than #MINOR_VERSION to specify previous version behavior.
            """,
            0x00000004
        ),
        "Init_Invisible".enum("This client will not be visible in the HMD. Typically set by diagnostic or debugging utilities.", 0x00000010),
        "Init_MixedRendering".enum(
            "This client will alternate between VR and 2D rendering. Typically set by game engine editors and VR-enabled web browsers.",
            0x00000020
        ),
        "Init_FocusAware".enum(
            """
            This client is aware of ##OVRSessionStatus focus states (e.g. {@code ovrSessionStatus::HasInputFocus}), and responds to them appropriately
            (e.g. pauses and stops drawing hands when lacking focus).
            """,
            0x00000040
        ),
        "Init_WritableBits".enum("These bits are writable by user code.", 0x00ffffff)
    )

    val LogLevels = EnumConstant(
        "Logging levels. ({@code ovrLogLevel})",

        "LogLevel_Debug".enum("Debug-level log event."),
        "LogLevel_Info".enum("Info-level log event."),
        "LogLevel_Error".enum("Error-level log event.")
    ).javaDocLinks

    EnumConstant(
        "HMD types. ({@code ovrHmdType})",

        "Hmd_None".enum("", "0"),
        "Hmd_DK2".enum("", "6"),
        "Hmd_CB".enum("", "8"),
        "Hmd_Other".enum,
        "Hmd_E3_2015".enum,
        "Hmd_ES06".enum,
        "Hmd_ES09".enum,
        "Hmd_ES11".enum,
        "Hmd_CV1".enum,
        "Hmd_RiftS".enum,
        "Hmd_Quest".enum("", "19"),
        "Hmd_Quest2".enum("", "20")
    )

    EnumConstant(
        "HMD capability bits reported by device. ({@code ovrHmdCaps})",

        "HmdCap_DebugDevice".enum("(read only) Specifies that the HMD is a virtual debug device.", 0x0010)
    ).javaDocLinks

    EnumConstant(
        "Tracking capability bits reported by the device. ({@code ovrTrackingCaps})",

        "TrackingCap_Orientation".enum("Supports orientation tracking (IMU).", 0x0010),
        "TrackingCap_MagYawCorrection".enum("Supports yaw drift correction.", 0x0020),
        "TrackingCap_Position".enum("Supports positional tracking.", 0x0040)
    ).javaDocLinks

    EnumConstant(
        "Optional extensions. ({@code ovrExtensions})",

        "Extension_TextureLayout_Octilinear".enum("Enable before first layer submission.", "0")
    )

    val EyeType = EnumConstant(
        """
        Specifies which eye is being used for rendering. ({@code ovrEyeType})

        This type explicitly does not include a third "NoStereo" monoscopic option, as such is not required for an HMD-centered API.
        """,

        "Eye_Left".enum("The left eye, from the viewer's perspective.", "0"),
        "Eye_Right".enum("The right eye, from the viewer's perspective."),

        "Eye_Count".enum("Count of enumerated elements.")
    ).javaDocLinks { !it.name.endsWith("_Count") }

    EnumConstant(
        """
        Specifies the coordinate system ovrTrackingState returns tracking poses in. ({@code ovrTrackingOrigin})

        Used with #SetTrackingOriginType().
        """,

        "TrackingOrigin_EyeLevel".enum(
            """
            Tracking system origin reported at eye (HMD) height.

            Prefer using this origin when your application requires matching user's current physical head pose to a virtual head pose without any regards to a
            the height of the floor. Cockpit-based, or 3rd-person experiences are ideal candidates. When used, all poses in ##OVRTrackingState are reported as
            an offset transform from the profile calibrated or recentered HMD pose. It is recommended that apps using this origin type call
            #RecenterTrackingOrigin() prior to starting the VR experience, but notify the user before doing so to make sure the user is in a comfortable pose,
            facing a comfortable direction.
            """,
            "0"
        ),
        "TrackingOrigin_FloorLevel".enum(
            """
            Tracking system origin reported at floor height.

            Prefer using this origin when your application requires the physical floor height to match the virtual floor height, such as standing experiences.
            When used, all poses in ##OVRTrackingState are reported as an offset transform from the profile calibrated floor pose. Calling
            #RecenterTrackingOrigin() will recenter the X &amp; Z axes as well as yaw, but the Y-axis (i.e. height) will continue to be reported using the
            floor height as the origin for all poses.
            """
        )
    ).javaDocLinks

    EnumConstant(
        """
        Color space types for HMDs.

        Until #SetClientColorDesc() is called, for backwards compatibility, a new session will start with #ColorSpace_Unknown which will default to
        #ColorSpace_Rift_CV1. This assumes the app visuals were authored to be viewed in a Rift CV1 HMD. Therefore it does the following:
        ${ul(
            "For Rift CV1, assumes submitted images are authored for CV1 color space, and keeps them as is.",
            "For Rift S and Quest (via Oculus Link), converts images to reproduce CV1's color space."
        )}

        This API only handles color-space remapping. Unless specified, all color spaces use D65 white point. This API will not affect brightness, contrast or
        gamma curves. Some of these aspects such as gamma, is handled by the texture format being used. From the GPU samplers' point-of-view, each texture will
        continue to be treated as linear luminance including the sRGB format which is converted to linear by the texture sampler.

        It is recommended that content is authored for the Rift CV1 color space as it has a wider color gamut than the Rift S. If content is authored to a
        narrow color space such as "Rec. 709" or "Rift S", this can lead to content looking "dull", "washed out" or "desaturated" when viewed in a
        wider-color-space-capable device such as Rift CV1 and Quest. This is because the colors stored in the submitted images will no longer be able to hit
        the deeper saturated chromaticity values.

        Using #ColorSpace_Unmanaged will force the runtime to skip color correction on to the provided content. This is not recommended unless the app
        developer is sure about what they're doing. {@code ovrColorSpace_Unmanaged} is mostly useful for research &amp; experimentation, but not for software
        distribution. This is because unless the client is applying the necessary corrections for each HMD type, the results seen in the HMD will be
        uncalibrated. This is especially true for future HMDs where the color space is not yet known or defined, leading to colors that might look too dull or
        saturated.

        Requested rectilinear-mirror outputs are composited without any color space adjustment. However, if client requests a post-distortion (i.e.
        non-rectilinear) mirror output, it will be provided with the same color adjustment that was applied for the HMD output. Therefore, post-distortion
        mirror output are not guaranteed to have acceptable color-space accuracy for desktop viewing.

        Color Space Details with Chromaticity Primaries in CIE 1931 xy:
        ${codeBlock("""
Color Space: Rift CV1 between P3 & Adobe RGB using D75 white point
Red  : (0.666, 0.334)
Green: (0.238, 0.714)
Blue : (0.139, 0.053)
White: (0.298, 0.318)

Color Space: Quest similar to Rift CV1 using D75 white point
Red  : (0.661, 0.338)
Green: (0.228, 0.718)
Blue : (0.142, 0.042)
White: (0.298, 0.318)

Color Space: Rift S similar to Rec 709 using D75
Red  : (0.640, 0.330)
Green: (0.292, 0.586)
Blue : (0.156, 0.058)
White: (0.298, 0.318)

Color Space: P3, similar to DCI-P3, but using D65 white point instead.
Red  : (0.680, 0.320)
Green: (0.265, 0.690)
Blue : (0.150, 0.060)
White: (0.313, 0.329)            
        """)}

        Note: Due to LCD limitations, the Rift S display will not be able to meaningfully differentiate brightness levels below 13 out of 255 for 8-bit sRGB or
        0.0015 out of 1.0 max for linear-RGB shader output values. To that end, it is recommended that reliance on a dark and narrow gamut is avoided, and the
        content is instead spread across a larger brightness range when possible.
        """,

        "ColorSpace_Unknown".enum("Default value until client sets calls #SetClientColorDesc()", "0"),
        "ColorSpace_Unmanaged".enum("See notes above. No correction, i.e. color space of active HMD"),
        "ColorSpace_Rift_CV1".enum("See notes above. Unique color space."),
        "ColorSpace_Rift_S".enum("See notes above. Unique color space."),
        "ColorSpace_Quest".enum("See notes above. Unique color space."),
        "ColorSpace_Rec_2020".enum("Standard Rec. 2020 chromaticities"),
        "ColorSpace_Rec_709".enum("Standard Rec. 709 chromaticities, similar to sRGB"),
        "ColorSpace_P3".enum("See notes above"),
        "ColorSpace_Adobe_RGB".enum("Standard AdobeRGB chromaticities")
    )

    EnumConstant(
        "Bit flags describing the current status of sensor tracking. ({@code ovrStatusBits}",

        "Status_OrientationTracked".enum(
            """
            Device orientation is currently tracked.
            
            It's possible that the device orientation is not tracked, but its reported orientation is nevertheless valid (e.g. due to estimation).
            """,
            0x0001
        ),
        "Status_PositionTracked".enum(
            """
            Device position is currently tracked.
            
            It's possible that the device position is not tracked, but its reported position is nevertheless valid (e.g. due to estimation).
            """,
            0x0002
        ),

        "Status_OrientationValid".enum(
            """
            The reported device orientation is valid for application use.
            
            In the case that {@code OrientationValid} is true and {@code OrientationTracked} is false, the runtime may be estimating the orientation of the
            device. In the case that {@code OrientationValid} is false, the application should not use the returned orientation value.            
            """,
            0x0004
        ),
        "Status_PositionValid".enum(
            """
            The reported device orientation is valid for application use.
            
            In the case that {@code PositionValid} is true and {@code PositionTracked} is false, the runtime may be estimating the position of the device. In
            the case that {@code PositionValid} is false, the application should not use the returned position value.         
            """,
            0x0008
        )
    )

    EnumConstant(
        "Specifies sensor flags. ({@code ovrTrackerFlags})",

        "Tracker_Connected".enum("The sensor is present, else the sensor is absent or offline.", 0x0020),
        "Tracker_PoseTracked".enum("The sensor has a valid pose, else the pose is unavailable. This will only be set if ovrTracker_Connected is set.", 0x0004)

    )

    EnumConstant(
        "The type of texture resource. ({@code ovrTextureType})",

        "Texture_2D".enum("2D textures or texture arrays."),
        "Texture_2D_External".enum("Application-provided 2D texture. Not supported on PC."),
        "Texture_Cube".enum("Cube maps. ##OVRTextureSwapChainDesc{@code ::ArraySize} must be 6 for this type.")
    )

    EnumConstant(
        """
        The bindings required for texture swap chain. ({@code ovrTextureBindFlags})

        All texture swap chains are automatically bindable as shader input resources since the Oculus runtime needs this to read them.
        """,

        "TextureBind_None".enum,
        "TextureBind_DX_RenderTarget".enum("The application can write into the chain with pixel shader", 0x0001),
        "TextureBind_DX_UnorderedAccess".enum("The application can write to the chain with compute shader", 0x0002),
        "TextureBind_DX_DepthStencil".enum(
            "The chain buffers can be bound as depth and/or stencil buffers. This flag cannot be combined with #TextureBind_DX_RenderTarget.",
            0x0004
        )
    )

    EnumConstant(
        "The format of a texture. ({@code ovrTextureFormat})",

        "OVR_FORMAT_UNKNOWN".enum,
        "OVR_FORMAT_B5G6R5_UNORM".enum("Not currently supported on PC. Requires a DirectX 11.1 device."),
        "OVR_FORMAT_B5G5R5A1_UNORM".enum("Not currently supported on PC. Requires a DirectX 11.1 device."),
        "OVR_FORMAT_B4G4R4A4_UNORM".enum("Not currently supported on PC. Requires a DirectX 11.1 device."),
        "OVR_FORMAT_R8G8B8A8_UNORM".enum,
        "OVR_FORMAT_R8G8B8A8_UNORM_SRGB".enum,
        "OVR_FORMAT_B8G8R8A8_UNORM".enum,
        "OVR_FORMAT_B8G8R8_UNORM".enum("Not currently supported.", "27"),
        "OVR_FORMAT_B8G8R8A8_UNORM_SRGB".enum("Not supported for OpenGL applications.", "7"),
        "OVR_FORMAT_B8G8R8X8_UNORM".enum("Not supported for OpenGL applications."),
        "OVR_FORMAT_B8G8R8X8_UNORM_SRGB".enum("Not supported for OpenGL applications."),
        "OVR_FORMAT_R16G16B16A16_FLOAT".enum,
        "OVR_FORMAT_R11G11B10_FLOAT".enum("Not supported for D3D12 applications.", "25"),

        // Depth formats
        "OVR_FORMAT_D16_UNORM".enum("", "11"),
        "OVR_FORMAT_D24_UNORM_S8_UINT".enum,
        "OVR_FORMAT_D32_FLOAT".enum,
        "OVR_FORMAT_D32_FLOAT_S8X24_UINT".enum,

        // Added in 1.5 compressed formats can be used for static layers
        "OVR_FORMAT_BC1_UNORM".enum,
        "OVR_FORMAT_BC1_UNORM_SRGB".enum,
        "OVR_FORMAT_BC2_UNORM".enum,
        "OVR_FORMAT_BC2_UNORM_SRGB".enum,
        "OVR_FORMAT_BC3_UNORM".enum,
        "OVR_FORMAT_BC3_UNORM_SRGB".enum,
        "OVR_FORMAT_BC6H_UF16".enum,
        "OVR_FORMAT_BC6H_SF16".enum,
        "OVR_FORMAT_BC7_UNORM".enum,
        "OVR_FORMAT_BC7_UNORM_SRGB".enum
    ).noPrefix()

    EnumConstant(
        "Misc flags overriding particular behaviors of a texture swap chain. ({@code ovrTextureFlags})",

        "TextureMisc_None".enum,
        "TextureMisc_DX_Typeless".enum(
            """
            DX only: The underlying texture is created with a TYPELESS equivalent of the format specified in the texture desc. The SDK will still access the
            texture using the format specified in the texture desc, but the app can create views with different formats if this is specified.
            """,
            0x0001
        ),

        "TextureMisc_AllowGenerateMips".enum(
            "DX only: Allow generation of the mip chain on the GPU via the GenerateMips call. This flag requires that RenderTarget binding also be specified.",
            0x0002
        ),

        "TextureMisc_ProtectedContent".enum(
            """
            Texture swap chain contains protected content, and requires HDCP connection in order to display to HMD. Also prevents mirroring or other
            redirection of any frame containing this contents
            """,
            0x0004
        ),

        "TextureMisc_AutoGenerateMips".enum(
            """
            Automatically generate and use the mip chain in composition on each submission. Mips are regenerated from highest quality level, ignoring other
            pre-existing mip levels.

            Not supported for depth or compressed (BC) formats.
            """,
            0x0008
        )
    )

    EnumConstant(
        "Bit flags used as part of ##OVRMirrorTextureDesc's {@code MirrorOptions} field. {@code ovrMirrorOptions}",

        "MirrorOption_Default".enum(
            """
            By default the mirror texture will be:
            ${ul(
                "Pre-distortion (i.e. rectilinear)",
                "Contain both eye textures",
                "Exclude Guardian, Notifications, System Menu GUI"
            )}
            """,
            0x0000
        ),

        "MirrorOption_PostDistortion".enum(
            """
            Retrieves the barrel distorted texture contents instead of the rectilinear one.

            This is only recommended for debugging purposes, and not for final desktop presentation.
            """,
            0x0001
        ),

        "MirrorOption_LeftEyeOnly".enum(
            "Since #MirrorOption_Default renders both eyes into the mirror texture, these two flags are exclusive (i.e. cannot use them simultaneously)",
            0x0002
        ),
        "MirrorOption_RightEyeOnly".enum(
            "See #MirrorOption_LeftEyeOnly",
            0x0004
        ),
        "MirrorOption_IncludeGuardian".enum("Shows the boundary system aka Guardian on the mirror texture.", 0x0008),
        "MirrorOption_IncludeNotifications".enum("Shows system notifications the user receives on the mirror texture.", 0x0010),
        "MirrorOption_IncludeSystemGui".enum("Shows the system menu (triggered by hitting the Home button) on the mirror texture.", 0x0020),
        "MirrorOption_ForceSymmetricFov".enum(
            """
            Forces mirror output to use max symmetric FOV instead of asymmetric full FOV used by HMD.

            Only valid for rectilinear mirrors i.e. using #MirrorOption_PostDistortion with {@code ovrMirrorOption_ForceSymmetricFov} will result in
            #Error_InvalidParameter error.
            """,
            0x0040
        )
    )

    EnumConstant(
        "Viewport stencil types provided by the #GetFovStencil() call. {@code ovrFovStencilType}",

        "FovStencil_HiddenArea".enum("Triangle list covering parts that are hidden to users.", "0"),
        "FovStencil_VisibleArea".enum("Triangle list covering parts that are visible to users."),
        "FovStencil_BorderLine".enum("Line list that draws the boundary visible to users."),
        "FovStencil_VisibleRectangle".enum("Axis-aligned rectangle fit in visible region. 4x vertices: TopLeft, TopRight, BottomRight, BottomLeft.")
    )

    EnumConstant(
        "Flags used by ##OVRFovStencilDesc and which are passed to #GetFovStencil(). ({@code ovrFovStencilFlags}",

        "FovStencilFlag_MeshOriginAtBottomLeft".enum(
            """
            When used, flips the Y component of the provided 2D mesh coordinates, such that Y increases upwards. When not used, places mesh origin at top-left
            where Y increases downwards.
            """,
            0x01
        )
    )

    EnumConstant(
        """
        Describes button input types.({@code ovrButton})

        Button inputs are combined; that is they will be reported as pressed if they are pressed on either one of the two devices. The
        {@code ovrButton_Up/Down/Left/Right} map to both XBox D-Pad and directional buttons. The {@code ovrButton_Enter} and {@code ovrButton_Return} map to
        Start and Back controller buttons, respectively.
        """,

        "Button_A".enum("A button on XBox controllers and right Touch controller. Select button on Oculus Remote.", 0x00000001),
        "Button_B".enum("B button on XBox controllers and right Touch controller. Back button on Oculus Remote.", 0x00000002),
        "Button_RThumb".enum("Right thumbstick on XBox controllers and Touch controllers. Not present on Oculus Remote.", 0x00000004),
        "Button_RShoulder".enum("Right shoulder button on XBox controllers. Not present on Touch controllers or Oculus Remote.", 0x00000008),

        "Button_X".enum("X button on XBox controllers and left Touch controller. Not present on Oculus Remote.", 0x00000100),
        "Button_Y".enum("Y button on XBox controllers and left Touch controller. Not present on Oculus Remote.", 0x00000200),
        "Button_LThumb".enum("Left thumbstick on XBox controllers and Touch controllers. Not present on Oculus Remote.", 0x00000400),
        "Button_LShoulder".enum("Left shoulder button on XBox controllers. Not present on Touch controllers or Oculus Remote.", 0x00000800),

        // Navigation through DPad.
        "Button_Up".enum("Up button on XBox controllers and Oculus Remote. Not present on Touch controllers.", 0x00010000),
        "Button_Down".enum("Down button on XBox controllers and Oculus Remote. Not present on Touch controllers.", 0x00020000),
        "Button_Left".enum("Left button on XBox controllers and Oculus Remote. Not present on Touch controllers.", 0x00040000),
        "Button_Right".enum("Right button on XBox controllers and Oculus Remote. Not present on Touch controllers.", 0x00080000),
        "Button_Enter".enum(
            """
            Start on XBox 360 controller. Menu on XBox One controller and Left Touch controller. Should be referred to as the Menu button in user-facing
            documentation.
            """,
            0x00100000
        ),
        "Button_Back".enum("Back on Xbox 360 controller. View button on XBox One controller. Not present on Touch controllers or Oculus Remote.", 0x00200000),
        "Button_VolUp".enum("Volume button on Oculus Remote. Not present on XBox or Touch controllers.", 0x00400000),
        "Button_VolDown".enum("Volume button on Oculus Remote. Not present on XBox or Touch controllers.", 0x00800000),
        "Button_Home".enum("Home button on XBox controllers. Oculus button on Touch controllers and Oculus Remote.", 0x01000000),

        "Button_Private".enum("Bit mask of all buttons that are for private usage by Oculus", "ovrButton_VolUp | ovrButton_VolDown | ovrButton_Home"),

        "Button_RMask".enum(
            "Bit mask of all buttons on the right Touch controller",
            "ovrButton_A | ovrButton_B | ovrButton_RThumb | ovrButton_RShoulder"
        ),
        "Button_LMask".enum(
            "Bit mask of all buttons on the left Touch controller",
            "ovrButton_X | ovrButton_Y | ovrButton_LThumb | ovrButton_LShoulder | ovrButton_Enter"
        )
    )

    EnumConstant(
        """
        Describes touch input types. ({@code ovrTouch})

        These values map to capacitive touch values reported ##OVRInputState{@code ::Touch}. Some of these values are mapped to button bits for consistency.
        """,

        "Touch_A".enum("Touch A", "ovrButton_A"),
        "Touch_B".enum("Touch B", "ovrButton_B"),
        "Touch_RThumb".enum("Touch RThumb", "ovrButton_RThumb"),
        "Touch_RThumbRest".enum("Touch RThumbRest", 0x00000008),
        "Touch_RIndexTrigger".enum("Touch RIndexTrigger", 0x00000010),

        "Touch_RButtonMask".enum("Bit mask of all the button touches on the right controller", "ovrTouch_A | ovrTouch_B | ovrTouch_RThumb | ovrTouch_RThumbRest | ovrTouch_RIndexTrigger"),

        "Touch_X".enum("Touch X", "ovrButton_X"),
        "Touch_Y".enum("Touch Y", "ovrButton_Y"),
        "Touch_LThumb".enum("Touch LThumb", "ovrButton_LThumb"),
        "Touch_LThumbRest".enum("Touch LThumbRest", 0x00000800),
        "Touch_LIndexTrigger".enum("Touch LIndexTrigger", 0x00001000),

        "Touch_LButtonMask".enum("Bit mask of all the button touches on the left controller", "ovrTouch_X | ovrTouch_Y | ovrTouch_LThumb | ovrTouch_LThumbRest | ovrTouch_LIndexTrigger"),

        // Finger pose state
        // Derived internally based on distance, proximity to sensors and filtering.
        "Touch_RIndexPointing".enum("TouchRIndexPointing", 0x00000020),
        "Touch_RThumbUp".enum("Touch RThumbUp", 0x00000040),
        "Touch_LIndexPointing".enum("Touch LIndexPointing", 0x00002000),
        "Touch_LThumbUp".enum("Touch LThumbUp", 0x00004000),

        "Touch_RPoseMask".enum("Bit mask of all right controller poses", "ovrTouch_RIndexPointing | ovrTouch_RThumbUp"),

        "Touch_LPoseMask".enum("Bit mask of all left controller poses.", "ovrTouch_LIndexPointing | ovrTouch_LThumbUp")
    )

    EnumConstant(
        "Which controller is connected; multiple can be connected at once. ({@code ovrControllerType})",

        "ControllerType_None".enum("", 0x0000),
        "ControllerType_LTouch".enum("", 0x0001),
        "ControllerType_RTouch".enum("", 0x0002),
        "ControllerType_Touch".enum("", "(ovrControllerType_LTouch | ovrControllerType_RTouch)"),
        "ControllerType_Remote".enum("", 0x0004),

        "ControllerType_XBox".enum("", 0x0010),

        "ControllerType_Object0".enum("", 0x0100),
        "ControllerType_Object1".enum("", 0x0200),
        "ControllerType_Object2".enum("", 0x0400),
        "ControllerType_Object3".enum("", 0x0800),

        "ControllerType_Active".enum("Operate on or query whichever controller is active.", 0xffffffff.i)
    )

    EnumConstant(
        "Haptics buffer submit mode. ({@code ovrHapticsBufferSubmitMode})",

        "HapticsBufferSubmit_Enqueue".enum("Enqueue buffer for later playback")
    )

    val TrackedDeviceTypes = EnumConstant(
        "Position tracked devices. ({@code ovrTrackedDeviceType})",

        "TrackedDevice_None".enum("", 0x0000),
        "TrackedDevice_HMD".enum("", 0x0001),
        "TrackedDevice_LTouch".enum("", 0x0002),
        "TrackedDevice_RTouch".enum("", 0x0004),
        "TrackedDevice_Touch".enum("", "(ovrTrackedDevice_LTouch | ovrTrackedDevice_RTouch)"),

        "TrackedDevice_Object0".enum("", 0x0010),
        "TrackedDevice_Object1".enum("", 0x0020),
        "TrackedDevice_Object2".enum("", 0x0040),
        "TrackedDevice_Object3".enum("", 0x0080),

        "TrackedDevice_All".enum("", 0xFFFF)
    ).javaDocLinks

    EnumConstant(
        "Camera status flags. ({@code ovrCameraStatusFlags})",

        "CameraStatus_None".enum("Initial state of camera.", 0x0),
        "CameraStatus_Connected".enum("Bit set when the camera is connected to the system.", 0x1),
        "CameraStatus_Calibrating".enum("Bit set when the camera is undergoing calibration.", 0x2),
        "CameraStatus_CalibrationFailed".enum("Bit set when the camera has tried &amp; failed calibration.", 0x4),
        "CameraStatus_Calibrated".enum("Bit set when the camera has tried &amp; passed calibration.", 0x8),
        "CameraStatus_Capturing".enum("Bit set when the camera is capturing.", 0x10)
    )

    val BoundaryTypes = EnumConstant(
        "Boundary types that specified while using the boundary system. ({@code ovrBoundaryType})",

        "Boundary_Outer".enum("Outer boundary - closely represents user setup walls", 0x0001),
        "Boundary_PlayArea".enum(
            "Play area - safe rectangular area inside outer boundary which can optionally be used to restrict user interactions and motion.",
            0x0100
        )
    ).javaDocLinks

    EnumConstant(
        "Names for the left and right hand array indexes. ({@code ovrHandType})",

        "Hand_Left".enum("", 0),
        "Hand_Right".enum,

        "Hand_Count".enum
    )

    EnumConstant(
        "",

        "MaxProvidedFrameStats".enum("Maximum number of frames of performance stats provided back to the caller of #GetPerfStats().", 5)
    )

    IntConstant(
        "Maximum number of samples in ##OVRHapticsBuffer.",

        "OVR_HAPTICS_BUFFER_SAMPLES_MAX".."256"
    ).noPrefix()

    IntConstant(
        "External camera constants",

        "OVR_MAX_EXTERNAL_CAMERA_COUNT".."16",
        "OVR_EXTERNAL_CAMERA_NAME_SIZE".."32"
    ).noPrefix()

    IntConstant(
        "Defines the largest size for an extension name string, including the '\\0' terminator.",

        "OVR_MAX_EXTENSION_NAME_SIZE".."128"
    ).noPrefix()

    ovrResult(
        "Initialize",
        """
        Initialize LibOVR for application usage. This includes finding and loading the LibOVRRT shared library. No LibOVR API functions, other than
        #GetLastErrorInfo() and #_Detect(), can be called unless #Initialize() succeeds. A successful call to {@code ovr_Initialize} must be eventually
        followed by a call to #Shutdown(). {@code ovr_Initialize} calls are idempotent. Calling {@code ovr_Initialize} twice does not require two matching
        calls to {@code ovr_Shutdown}. If already initialized, the return value is #Success.

        LibOVRRT shared library search order:
        ${ol(
            "Current working directory (often the same as the application directory).",
            "Module directory (usually the same as the application directory, but not if the module is a separate shared library).",
            "Application directory",
            "Development directory (only if OVR_ENABLE_DEVELOPER_SEARCH is enabled, which is off by default).",
            "Standard OS shared library search location(s) (OS-specific)."
        )}
        """,

        nullable..ovrInitParams.const.p(
            "params",
            """
            specifies custom initialization options. May be #NULL to indicate default options when using the CAPI shim. If you are directly calling the
            LibOVRRT version of {@code ovr_Initialize} in the LibOVRRT DLL then this must be valid and include #Init_RequestVersion.
            """
        ),

        returnDoc =
        """
        an {@code ovrResult} indicating success or failure. In the case of failure, use #GetLastErrorInfo() to get more information. Example failed results
        include:
        ${ul(
            "#Error_Initialize: Generic initialization error.",
            "#Error_LibLoad: Couldn't load LibOVRRT.",
            "#Error_LibVersion: LibOVRRT version incompatibility.",
            "#Error_ServiceConnection: Couldn't connect to the OVR Service.",
            "#Error_ServiceVersion: OVR Service version incompatibility.",
            "#Error_IncompatibleOS: The operating system version is incompatible.",
            "#Error_DisplayInit: Unable to initialize the HMD display.",
            "#Error_ServerStart:  Unable to start the server. Is it already running?",
            "#Error_Reinitialization: Attempted to re-initialize with a different version."
        )}
        """
    )

    void(
        "Shutdown",
        """
        Shuts down LibOVR.

        A successful call to #Initialize() must be eventually matched by a call to {@code ovr_Shutdown}. After calling {@code ovr_Shutdown}, no LibOVR
        functions can be called except #GetLastErrorInfo() or another #Initialize(). {@code ovr_Shutdown} invalidates all pointers, references, and created
        objects previously returned by LibOVR functions. The LibOVRRT shared library can be unloaded by {@code ovr_Shutdown}.
        """
    )

    void(
        "GetLastErrorInfo",
        """
        Returns information about the most recent failed return value by the current thread for this library.

        This function itself can never generate an error. The last error is never cleared by LibOVR, but will be overwritten by new errors. Do not use this
        call to determine if there was an error in the last API call as successful API calls don't clear the last ##OVRErrorInfo. To avoid any inconsistency,
        #GetLastErrorInfo() should be called immediately after an API function that returned a failed {@code ovrResult}, with no other API functions called in
        the interim.
        """,

        ovrErrorInfo.p("errorInfo", "The last ##OVRErrorInfo for the current thread")
    )

    Nonnull..charUTF8.const.p(
        "GetVersionString",
        """
        Returns the version string representing the LibOVRRT version.

        The returned string pointer is valid until the next call to #Shutdown().

        Note that the returned version string doesn't necessarily match the current OVR_MAJOR_VERSION, etc., as the returned string refers to the LibOVRRT
        shared library version and not the locally compiled interface version.

        The format of this string is subject to change in future versions and its contents should not be interpreted.
        """,

        returnDoc = "a UTF8-encoded null-terminated version string"
    )

    int(
        "TraceMessage",
        """
        Writes a message string to the LibOVR tracing mechanism (if enabled).

        This message will be passed back to the application via the ##OVRLogCallback if it was registered.
        """,

        int("level", "an {@code ovrLogLevel} constant", LogLevels),
        charUTF8.const.p("message", "a UTF8-encoded null-terminated string"),

        returnDoc = "the {@code strlen} of the message or a negative value if the message is too large"
    )

    ovrResult(
        "IdentifyClient",
        """
        Identifies client application info.

        The string is one or more newline-delimited lines of optional info indicating engine name, engine version, engine plugin name, engine plugin version,
        engine editor. The order of the lines is not relevant. Individual lines are optional. A newline is not necessary at the end of the last line. Call
        after #Initialize() and before the first call to #Create(). Each value is limited to 20 characters. Key names such as 'EngineName:', 'EngineVersion:'
        do not count towards this limit.

${codeBlock("""
EngineName: %s\n
EngineVersion: %s\n
EnginePluginName: %s\n
EnginePluginVersion: %s\n
EngineEditor: <boolean> ('true' or 'false')\n""")}

        Example code:
        ${codeBlock("""
ovr_IdentifyClient(
    "EngineName: Unity\n" +
    "EngineVersion: 5.3.3\n" +
    "EnginePluginName: OVRPlugin\n" +
    "EnginePluginVersion: 1.2.0\n" +
    "EngineEditor: true");""")}
        """,

        charUTF8.const.p(
            "identity",
            "specifies one or more newline-delimited lines of optional info"
        )
    )

    // ----------------
    // HMD Management

    ovrHmdColorDesc(
        "GetHmdColorDesc",
        """
        Returns native color space information about the current HMD.
            
        #Initialize() must be called prior to calling this function, otherwise call will fail.
        """,

        nullable..ovrSession("session", "specifies an {@code ovrSession} previously returned by #Create() or #NULL"),

        returnDoc = "an {@code ovrHmdColorDesc}"
    )

    ovrResult(
        "SetClientColorDesc",
        """
        Sets the color space actively being used by the client app.

        This value does not have to follow the color space provided in #GetHmdColorDesc(). It should reflect the color space the final rendered frame the
        client has submitted to the SDK. If this function is never called, the session will keep using the default color space deemed appropriate by the
        runtime. See remarks in {@code ovrColorSpace} enum for more info on default behavior.

        #Initialize() must be called prior to calling this function, otherwise call will fail.
        """,

        ovrSession("session", "an {@code ovrSession} previously returned by #Create() or #NULL"),
        ovrHmdColorDesc.const.p("colorDesc", "the color description to use for the current HMD"),

        returnDoc = "an {@code ovrResult} indicating success or failure"
    )

    ovrHmdDesc(
        "GetHmdDesc",
        """
        Returns information about the current HMD.

        #Initialize() must be called prior to calling this function, otherwise {@code ovrHmdDesc::Type} will be set to #Hmd_None without checking for the HMD
        presence.
        
        For newer headsets being used on a game built against an old SDK version, we may return the {@code ovrHmdType} as #Hmd_CV1 for backwards compatibility.
        """,

        nullable..ovrSession("session", "an {@code ovrSession} previously returned by #Create() or #NULL"),

        returnDoc = "an ##OVRHmdDesc. If invoked with #NULL session argument, {@code ovrHmdDesc::Type} to #Hmd_None indicates that the HMD is not connected."
    )

    val session = ovrSession("session", "an {@code ovrSession} previously returned by #Create()")


    unsigned_int(
        "GetTrackerCount",
        """
        Returns the number of attached trackers.

        The number of trackers may change at any time, so this function should be called before use as opposed to once on startup.
        
        For newer headsets being used on a game built against an old SDK version, we may simulate three CV1 trackers to maintain backwards compatibility.
        """,

        session
    )

    ovrTrackerDesc(
        "GetTrackerDesc",
        """
        Returns a given attached tracker description.

        #Initialize() must have first been called in order for this to succeed, otherwise the returned {@code trackerDescArray} will be zero-initialized. The
        data returned by this function can change at runtime.
        
        For newer headsets being used on a game built against an old SDK version, we may simulate three CV1 trackers to maintain backwards compatibility.
        """,

        session,
        unsigned_int("trackerDescIndex", "a tracker index. The valid indexes are in the range of 0 to the tracker count returned by #GetTrackerCount()."),

        returnDoc = "an ##OVRTrackerDesc. An empty {@code OVRTrackerDesc} will be returned if {@code trackerDescIndex} is out of range."
    )

    ovrResult(
        "Create",
        """
        Creates a handle to a VR session.

        Upon success the returned {@code ovrSession} must be eventually freed with #Destroy() when it is no longer needed. A second call to #Create() will result
        in an error return value if the previous session has not been destroyed.
        """,

        Check(1)..ovrSession.p("pSession", "a pointer to an {@code ovrSession} which will be written to upon success"),
        ovrGraphicsLuid.p(
            "pLuid",
            """
            a system specific graphics adapter identifier that locates which graphics adapter has the HMD attached. This must match the adapter used by the
            application or no rendering output will be possible. This is important for stability on multi-adapter systems. An application that simply chooses
            the default adapter will not run reliably on multi-adapter systems.
            """
        ),

        returnDoc = "an {@code ovrResult} indicating success or failure. Upon failure the returned {@code ovrSession} will be #NULL."
    )

    void(
        "Destroy",
        "Destroys the session.",

        session
    )

    ovrResult(
        "GetSessionStatus",
        "Returns status information for the application.",

        session,
        ovrSessionStatus.p("sessionStatus", "an ##OVRSessionStatus that is filled in")
    )

    ovrResult(
        "IsExtensionSupported",
        "Queries extension support status.",

        session,
        ovrExtensions("extension", "extension to query"),
        Check(1)..ovrBool.p("outExtensionSupported", "set to extension support status. #True if supported."),

        returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure use #GetLastErrorInfo() to get more information."
    )

    ovrResult(
        "EnableExtension",
        "Enable extension. Extensions must be enabled after #Create() is called.",

        session,
        ovrExtensions("extension", "extension to enable."),

        returnDoc =
        """
        an {@code ovrResult} indicating success or failure. Extension is only enabled if successful. In the case of failure use #GetLastErrorInfo() to get more
        information.
        """
    )

    // ----------------
    // Tracking

    ovrResult(
        "SetTrackingOriginType",
        """
        Sets the tracking origin type.

        When the tracking origin is changed, all of the calls that either provide or accept ovrPosef will use the new tracking origin provided.
        """,

        session,
        ovrTrackingOrigin("origin", "an {@code ovrTrackingOrigin} to be used for all ##OVRPosef")
    )

    ovrTrackingOrigin(
        "GetTrackingOriginType",
        "Gets the tracking origin state.",

        session
    )

    ovrResult(
        "RecenterTrackingOrigin",
        """
        Re-centers the sensor position and orientation.

        This resets the (x,y,z) positional components and the yaw orientation component of the tracking space for the HMD and controllers using the HMD's
        current tracking pose. If the caller requires some tweaks on top of the HMD's current tracking pose, consider using #SpecifyTrackingOrigin() instead.

        The roll and pitch orientation components are always determined by gravity and cannot be redefined. All future tracking will report values relative to
        this new reference position. If you are using {@code ovrTrackerPoses} then you will need to call #GetTrackerPose() after this, because the sensor
        position(s) will change as a result of this.

        The headset cannot be facing vertically upward or downward but rather must be roughly level otherwise this function will fail with
        #Error_InvalidHeadsetOrientation.

        For more info, see the notes on each {@code ovrTrackingOrigin} enumeration to understand how recenter will vary slightly in its behavior based on the
        current {@code ovrTrackingOrigin} setting.
        """,

        session
    )

    ovrResult(
        "SpecifyTrackingOrigin",
        """
        Allows manually tweaking the sensor position and orientation.

        This function is similar to #RecenterTrackingOrigin() in that it modifies the (x,y,z) positional components and the yaw orientation component of the
        tracking space for the HMD and controllers.

        While {@code ovr_RecenterTrackingOrigin} resets the tracking origin in reference to the HMD's current pose, {@code ovr_SpecifyTrackingOrigin} allows
        the caller to explicitly specify a transform for the tracking origin. This transform is expected to be an offset to the most recent recentered origin,
        so calling this function repeatedly with the same originPose will keep nudging the recentered origin in that direction.

        There are several use cases for this function. For example, if the application decides to limit the yaw, or translation of the recentered pose instead
        of directly using the HMD pose the application can query the current tracking state via #GetTrackingState(), and apply some limitations to the HMD pose
        because feeding this pose back into this function. Similarly, this can be used to "adjust the seating position" incrementally in apps that feature
        seated experiences such as cockpit-based games.

        This function can emulate ovr_RecenterTrackingOrigin as such:
        ${codeBlock("""
ovrTrackingState ts = ovr_GetTrackingState(session, 0.0, ovrFalse);
ovr_SpecifyTrackingOrigin(session, ts.HeadPose.ThePose);""")}

        The roll and pitch orientation components are determined by gravity and cannot be redefined. If you are using {@code ovrTrackerPoses} then you will
        need to call #GetTrackerPose() after this, because the sensor position(s) will change as a result of this.

        For more info, see the notes on each {@code ovrTrackingOrigin} enumeration to understand how recenter will vary slightly in its behavior based on the
        current {@code ovrTrackingOrigin} setting.
        """,
        session,
        ovrPosef("originPose", "specifies a pose that will be used to transform the current tracking origin")
    )

    void(
        "ClearShouldRecenterFlag",
        """
        Clears the {@code ShouldRecenter} status bit in ##OVRSessionStatus.

        Clears the {@code ShouldRecenter} status bit in ##OVRSessionStatus, allowing further recenter requests to be detected. Since this is automatically done
        by #RecenterTrackingOrigin() and #SpecifyTrackingOrigin(), this function only needs to be called when application is doing its own re-centering logic.
        """,

        session
    )

    ovrTrackingState(
        "GetTrackingState",
        """
        Returns tracking state reading based on the specified absolute system time.

        Pass an {@code absTime} value of 0.0 to request the most recent sensor reading. In this case both {@code PredictedPose} and {@code SamplePose} will
        have the same value.

        This may also be used for more refined timing of front buffer rendering logic, and so on.

        This may be called by multiple threads.
        """,

        session,
        double("absTime", "the absolute future time to predict the return ##OVRTrackingState value. Use 0 to request the most recent tracking state."),
        ovrBool(
            "latencyMarker",
            """
            specifies that this call is the point in time where the "App-to-Mid-Photon" latency timer starts from. If a given {@code ovrLayer} provides
            "SensorSampleTime", that will override the value stored here.
            """
        ),

        returnDoc = "the ##OVRTrackingState that is predicted for the given {@code absTime}"
    )

    ovrResult(
        "GetDevicePoses",
        """
        Returns an array of poses, where each pose matches a device type provided by the {@code deviceTypes} array parameter.

        If any pose cannot be retrieved, it will return a reason for the missing pose and the device pose will be zeroed out with a pose quaternion
        {@code [x=0, y=0, z=0, w=1]}.
        """,

        session,
        ovrTrackedDeviceType.p("deviceTypes", "array of device types to query for their poses"),
        AutoSize("deviceTypes", "outDevicePoses")..int(
            "deviceCount",
            "number of queried poses. This number must match the length of the {@code outDevicePoses} and {@code deviceTypes} array."
        ),
        double(
            "absTime",
            "specifies the absolute future time to predict the return {@code ovrTrackingState} value. Use 0 to request the most recent tracking state."
        ),
        ovrPoseStatef.p("outDevicePoses", "array of poses, one for each device type in {@code deviceTypes} arrays"),

        returnDoc = "an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success"
    )

    ovrTrackerPose(
        "GetTrackerPose",
        """
        Returns the ##OVRTrackerPose for the given attached tracker.
        
        For newer headsets being used on a game built against an old SDK version, we may simulate three CV1 trackers to maintain backwards compatibility.
        """,

        session,
        unsigned_int("trackerPoseIndex", "index of the tracker being requested.")
    )

    ovrResult(
        "GetInputState",
        """
        Returns the most recent input state for controllers, without positional tracking info. Developers can tell whether the same state was returned by
        checking the {@code PacketNumber}.
        """,

        session,
        ovrControllerType("controllerType", "which controllers the input will be returned for"),
        ovrInputState.p("inputState", "the input state that will be filled in"),

        returnDoc = "#Success if the new state was successfully obtained"
    )

    unsigned_int(
        "GetConnectedControllerTypes",
        "Returns controller types connected to the system OR'ed together.",

        session
    )

    ovrTouchHapticsDesc(
        "GetTouchHapticsDesc",
        "Gets information about Haptics engine for the specified Touch controller.",

        session,
        ovrControllerType("controllerType", "the controller to retrieve the information from"),

        returnDoc = "an ##OVRTouchHapticsDesc"
    )

    ovrResult(
        "SetControllerVibration",
        """
        Sets constant vibration (with specified frequency and amplitude) to a controller.

        Note: {@code ovr_SetControllerVibration} cannot be used interchangeably with #SubmitControllerVibration().

        This method should be called periodically, vibration lasts for a maximum of 2.5 seconds.
        """,

        session,
        ovrControllerType("controllerType", "the controller to set the vibration to"),
        float("frequency", "the vibration frequency. Supported values are: 0.0 (disabled), 0.5 and 1.0. Non valid values will be clamped."),
        float("amplitude", "the vibration amplitude in the {@code [0.0, 1.0]} range"),

        returnDoc =
        """
        an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
        ${ul(
            "#Success: The call succeeded and a result was returned.",
            "#Success_DeviceUnavailable: The call succeeded but the device referred to by {@code controllerType} is not available."
        )}
        """
    )

    ovrResult(
        "SubmitControllerVibration",
        """
        Submits a Haptics buffer (used for vibration) to Touch (only) controllers.

        Note: {@code ovr_SubmitControllerVibration} cannot be used interchangeably with #SetControllerVibration().
        """,

        session,
        ovrControllerType("controllerType", "the controller where the Haptics buffer will be played"),
        ovrHapticsBuffer.const.p("buffer", "the Haptics buffer containing amplitude samples to be played"),

        returnDoc =
        """
        an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
        ${ul(
            "#Success: The call succeeded and a result was returned.",
            "#Success_DeviceUnavailable: The call succeeded but the device referred to by {@code controllerType} is not available."
        )}
        """
    )

    ovrResult(
        "GetControllerVibrationState",
        "Gets the Haptics engine playback state of a specific Touch controller.",

        session,
        ovrControllerType("controllerType", "the controller where the Haptics buffer will be played"),
        ovrHapticsPlaybackState.p("outState", "the state of the haptics engine"),

        returnDoc =
        """
        an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
        ${ul(
            "#Success: The call succeeded and a result was returned.",
            "#Success_DeviceUnavailable: The call succeeded but the device referred to by {@code controllerType} is not available."
        )}
        """
    )

    val TestBoundary = ovrResult(
        "TestBoundary",
        """
        Tests collision/proximity of position tracked devices (e.g. HMD and/or Touch) against the Boundary System.

        Note: this method is similar to #TestBoundaryPoint() but can be more precise as it may take into account device acceleration/momentum.
        """,

        session,
        ovrTrackedDeviceType("deviceBitmask", "bitmask of one or more tracked devices to test", TrackedDeviceTypes, LinkMode.BITFIELD),
        ovrBoundaryType("boundaryType", "the boundary type", BoundaryTypes),
        ovrBoundaryTestResult.p("outTestResult", "result of collision/proximity test, contains information such as distance and closest point"),

        returnDoc =
        """
        an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
        ${ul(
            "#Success: The call succeeded and a result was returned.",
            "#Success_BoundaryInvalid: The call succeeded but the result is not a valid boundary due to not being set up.",
            "#Success_DeviceUnavailable: The call succeeded but the device referred to by {@code deviceBitmask} is not available."
        )}
        """
    )

    ovrResult(
        "TestBoundaryPoint",
        "Tests collision/proximity of a 3D point against the Boundary System.",

        session,
        ovrVector3f.const.p("point", "the 3D point to test"),
        ovrBoundaryType("singleBoundaryType", "the boundary type", BoundaryTypes),
        ovrBoundaryTestResult.p("outTestResult", "result of collision/proximity test, contains information such as distance and closest point"),

        returnDoc =
        """
        an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
        ${ul(
            "#Success: The call succeeded and a result was returned.",
            "#Success_BoundaryInvalid: The call succeeded but the result is not a valid boundary due to not being set up."
        )}
        """
    )

    ovrResult(
        "SetBoundaryLookAndFeel",
        """
        Compatibility stub.
        
        Deprecated: previously set the look and feel of the Boundary System - this functionality has been removed.
        """,

        session,
        ovrBoundaryLookAndFeel.const.p("lookAndFeel", "the look and feel parameters"),

        returnDoc = "#Success upon success"
    )

    ovrResult(
        "ResetBoundaryLookAndFeel",
        "Resets the look and feel of the Boundary System to its default state.",

        session,

        returnDoc = "#Success upon success"
    )

    ovrResult(
        "GetBoundaryGeometry",
        "Gets the geometry of the Boundary System's \"play area\" or \"outer boundary\" as 3D floor points.",

        session,
        TestBoundary["boundaryType"],
        nullable..ovrVector3f.p(
            "outFloorPoints",
            "an array of 3D points (in clockwise order) defining the boundary at floor height (can be #NULL to retrieve only the number of points)"
        ),
        Check(1)..nullable..int.p("outFloorPointsCount", "the number of 3D points returned in the array"),

        returnDoc =
        """
        an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
        ${ul(
            "#Success: The call succeeded and a result was returned.",
            "#Success_BoundaryInvalid: The call succeeded but the result is not a valid boundary due to not being set up."
        )}
        """
    )

    ovrResult(
        "GetBoundaryDimensions",
        "Gets the dimension of the Boundary System's \"play area\" or \"outer boundary\".",

        session,
        TestBoundary["boundaryType"],
        ovrVector3f.p("outDimensions", "dimensions of the axis aligned bounding box that encloses the area in meters (width, height and length)"),

        returnDoc =
        """
        an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
        ${ul(
            "#Success: The call succeeded and a result was returned.",
            "#Success_BoundaryInvalid: The call succeeded but the result is not a valid boundary due to not being set up."
        )}
        """
    )

    ovrResult(
        "GetBoundaryVisible",
        """
        Returns if the boundary is currently visible.

        Note: visibility is false if the user has turned off boundaries, otherwise, it's true if the app has requested boundaries to be visible or if any
        tracked device is currently triggering it. This may not exactly match rendering due to fade-in and fade-out effects.
        """,

        session,
        Check(1)..ovrBool.p("outIsVisible", "#True, if the boundary is visible"),

        returnDoc =
        """
        an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
        ${ul(
            "#Success: The call succeeded and a result was returned.",
            "#Success_BoundaryInvalid: The call succeeded but the result is not a valid boundary due to not being set up."
        )}
        """
    )

    ovrResult(
        "RequestBoundaryVisible",
        "Requests boundary to be visible.",

        session,
        ovrBool(
            "visible",
            "forces the outer boundary to be visible. An application can't force it to be invisible, but can cancel its request by passing false."
        ),

        returnDoc = "#Success upon success"
    )

    // ----------------
    // Mixed reality capture support

    ovrResult(
        "GetExternalCameras",
        "Returns the number of camera properties of all cameras",

        session,
        nullable..ovrExternalCamera.p(
            "cameras",
            "pointer to the array. If null and the provided array capacity is sufficient, will return {@code ovrError_NullArrayPointer}."
        ),
        AutoSize("cameras")..Check(1)..unsigned_int.p(
            "inoutCameraCount",
            """
            supply the array capacity, will return the actual \\# of cameras defined. If {@code *inoutCameraCount} is too small, will return
            #Error_InsufficientArraySize.
            """
        ),

        returnDoc = "the list of external cameras the system knows about. Returns #Error_NoExternalCameraInfo if there is not any external camera information."
    )

    ovrResult(
        "SetExternalCameraProperties",
        """
        Sets the camera intrinsics and/or extrinsics stored for the {@code cameraName} camera.

        Names must be &lt; 32 characters and null-terminated.
        """,

        session,
        charASCII.const.p(
            "name",
            """
            specifies which camera to set the intrinsics or extrinsics for. The name must be at most #OVR_EXTERNAL_CAMERA_NAME_SIZE - 1 characters. Otherwise,
            #Error_ExternalCameraNameWrongSize is returned.
            """
        ),
        ovrCameraIntrinsics.const.p.const("intrinsics", "contains the intrinsic parameters to set, can be null"),
        ovrCameraExtrinsics.const.p.const("extrinsics", "ontains the extrinsic parameters to set, can be null"),

        returnDoc = "#Success or an {@code ovrError} code"
    )

    // ----------------
    // Layers

    IntConstant(
        "Specifies the maximum number of layers supported by #SubmitFrame().",

        "MaxLayerCount".."16"
    )

    EnumConstant(
        """
        Describes layer types that can be passed to #SubmitFrame(). ({@code ovrLayerType})

        Each layer type has an associated struct, such as ##OVRLayerEyeFov.
        """,

        "LayerType_Disabled".enum("Layer is disabled.", "0"),
        "LayerType_EyeFov".enum("Described by ##OVRLayerEyeFov."),
        "LayerType_EyeFovDepth".enum("Described by ##OVRLayerEyeFovDepth."),
        "LayerType_Quad".enum("Described by ##OVRLayerQuad."),
        "LayerType_EyeMatrix".enum("Described by ##OVRLayerEyeMatrix.", "5"),
        "LayerType_EyeFovMultires".enum("Described by ##OVRLayerEyeFovMultires.", "7"),
        "LayerType_Cylinder".enum("Described by ##OVRLayerCylinder."),
        "LayerType_Cube".enum("Described by ##OVRLayerCube.", "10")
    )

    EnumConstant(
        "Identifies flags used by ##OVRLayerHeader and which are passed to #SubmitFrame(). ({@code ovrLayerFlags})",

        "LayerFlag_HighQuality".enum(
            """
            Enables 4x anisotropic sampling during the composition of the layer. The benefits are mostly visible at the periphery for high-frequency &amp;
            high-contrast visuals. For best results consider combining this flag with an {@code ovrTextureSwapChain} that has mipmaps and instead of using
            arbitrary sized textures, prefer texture sizes that are powers-of-two. Actual rendered viewport and doesn't necessarily have to fill the whole
            texture.
            """,
            0x01
        ),
        "LayerFlag_TextureOriginAtBottomLeft".enum("the opposite is TopLeft. Generally this is false for D3D, true for OpenGL.", 0x02),
        "LayerFlag_HeadLocked".enum(
            """
            Mark this surface as "headlocked", which means it is specified relative to the HMD and moves with it, rather than being specified relative to
            sensor/torso space and remaining still while the head moves. What used to be {@code ovrLayerType_QuadHeadLocked} is now #LayerType_Quad plus this
            flag. However the flag can be applied to any layer type to achieve a similar effect.
            """,
            0x04
        )
    )

    EnumConstant(
        "Describes eye texture layouts. Used with ##OVRLayerEyeFovMultires. ({@code ovrTextureLayout})",

        "TextureLayout_Rectilinear".enum("Regular eyeFov layer.", "0"),
        "TextureLayout_Octilinear".enum("Octilinear extension must be enabled.", "1")
    )

    // ----------------
    // SDK Distortion Rendering

    ovrResult(
        "GetTextureSwapChainLength",
        "Gets the number of buffers in an {@code ovrTextureSwapChain}.",

        session,
        ovrTextureSwapChain("chain", "the {@code ovrTextureSwapChain} for which the length should be retrieved"),
        Check(1)..int.p("out_Length", "returns the number of buffers in the specified chain")
    )

    ovrResult(
        "GetTextureSwapChainCurrentIndex",
        "Gets the current index in an {@code ovrTextureSwapChain}.",

        session,
        ovrTextureSwapChain("chain", "the {@code ovrTextureSwapChain} for which the index should be retrieved"),
        Check(1)..int.p("out_Index", "returns the current (free) index in specified chain")
    )

    ovrResult(
        "GetTextureSwapChainDesc",
        "Gets the description of the buffers in an {@code ovrTextureSwapChain}.",

        session,
        ovrTextureSwapChain("chain", "the {@code ovrTextureSwapChain} for which the description should be retrieved"),
        ovrTextureSwapChainDesc.p("out_Desc", "returns the description of the specified chain")
    )

    ovrResult(
        "CommitTextureSwapChain",
        """
        Commits any pending changes to an {@code ovrTextureSwapChain}, and advances its current index.

        When Commit is called, the texture at the current index is considered ready for use by the runtime, and further writes to it should be avoided. The
        swap chain's current index is advanced, providing there's room in the chain. The next time the SDK dereferences this texture swap chain, it will
        synchronize with the app's graphics context and pick up the submitted index, opening up room in the swap chain for further commits.
        """,

        session,
        ovrTextureSwapChain("chain", "the {@code ovrTextureSwapChain} to commit")
    )

    void(
        "DestroyTextureSwapChain",
        "Destroys an {@code ovrTextureSwapChain} and frees all the resources associated with it.",

        session,
        nullable..ovrTextureSwapChain("chain", "the {@code ovrTextureSwapChain} to destroy. If it is #NULL then this function has no effect.")
    )

    void(
        "DestroyMirrorTexture",
        "Destroys a mirror texture previously created by one of the mirror texture creation functions.",

        session,
        nullable..ovrMirrorTexture("mirrorTexture", "the {@code ovrTexture} to destroy. If it is #NULL then this function has no effect.")
    )

    ovrSizei(
        "GetFovTextureSize",
        """
        Calculates the recommended viewport size for rendering a given eye within the HMD with a given FOV cone.

        Higher FOV will generally require larger textures to maintain quality. Apps packing multiple eye views together on the same texture should ensure there
        are at least 8 pixels of padding between them to prevent texture filtering and chromatic aberration causing images to leak between the two eye views.

        Example code:
${codeBlock("""
ovrHmdDesc hmdDesc = ovr_GetHmdDesc(session);
ovrSizei eyeSizeLeft  = ovr_GetFovTextureSize(session, ovrEye_Left,  hmdDesc.DefaultEyeFov[ovrEye_Left],  1.0f);
ovrSizei eyeSizeRight = ovr_GetFovTextureSize(session, ovrEye_Right, hmdDesc.DefaultEyeFov[ovrEye_Right], 1.0f);""")}
        """,

        session,
        ovrEyeType("eye", "which eye (left or right) to calculate for", EyeType),
        ovrFovPort("fov", "the ##OVRFovPort to use"),
        float(
            "pixelsPerDisplayPixel",
            """
            the ratio of the number of render target pixels to display pixels at the center of distortion. 1.0 is the default value. Lower values can improve
            performance, higher values give improved quality.
            """
        ),

        returnDoc = "the texture width and height size"
    )

    ovrEyeRenderDesc(
        "GetRenderDesc",
        "Computes the distortion viewport, view adjust, and other rendering parameters for the specified eye.",

        session,
        ovrEyeType("eyeType", "which eye (left or right) for which to perform calculations", EyeType),
        ovrFovPort("fov", "the ##OVRFovPort to use."),

        returnDoc = "the computed ##OVREyeRenderDesc for the given {@code eyeType} and field of view"
    )

    ovrResult(
        "GetFovStencil",
        """
        Returns a viewport stencil mesh to be used for defining the area or outline the user can see through the lens on an area defined by a given
        {@code ovrFovPort}.

        To find out how big the vertex and index buffers in {@code meshBuffer} buffer should be, first call this function setting {@code AllocVertexCount}
        &amp; {@code AllocIndexCount} to 0 while also sending in {@code nullptr} for {@code VertexBuffer} &amp; {@code IndexBuffer}. The SDK will populate
        {@code UsedVertexCount} &amp; {@code UsedIndexCount} values.

        If {@code Alloc*Count} fields in {@code meshBuffer} are smaller than the expected {@code Used*Count} fields, (except when they are 0) then the SDK will
        return #Error_InvalidParameter and leave {@code VertexBuffer} and {@code IndexBuffer} untouched.

        2D positions provided in the buffer will be in the {@code [0,1]} range where Y increases downward, similar to texture-UV space. If Y coordinates need
        to be flipped upside down, use the #FovStencilFlag_MeshOriginAtBottomLeft.
        """,

        session,
        ovrFovStencilDesc.const.p("fovStencilDesc", "info provided by caller necessary to generate a stencil mesh"),
        Input..ovrFovStencilMeshBuffer.p("meshBuffer", "mesh buffer to be partially filled in and returned by the SDK"),

        returnDoc =
        """
        an ovrResult indicating success or failure. In the case of failure, use #GetLastErrorInfo() to get more information. Return values include but aren't
        limited to:
        ${ul(
            "#Success: Completed successfully.",
            "#Error_ServiceConnection: The service connection was lost and the application must destroy the session.",
            "#Error_InvalidParameter: One or more of the parameters"
        )}
        """
    )

    ovrResult(
        "WaitToBeginFrame",
        """
        Waits until surfaces are available and it is time to begin rendering the frame. Must be called before #BeginFrame(), but not necessarily from the same
        thread.
        """,

        session,
        long_long("frameIndex", "specifies the targeted application frame index"),

        returnDoc =
        """
        an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
        ${ul(
            "#Success: command completed successfully.",
            """
            #Success_NotVisible: rendering of a previous frame completed successfully but was not displayed on the HMD, usually because another application
            currently has ownership of the HMD. Applications receiving this result should stop rendering new content and call #GetSessionStatus() to detect
            visibility.
            """,
            """
            #Error_DisplayLost: The session has become invalid (such as due to a device removal) and the shared resources need to be released
            (#DestroyTextureSwapChain()), the session needs to destroyed (#Destroy()) and recreated (#Create()), and new resources need to be created
            ({@code ovr_CreateTextureSwapChainXXX}). The application's existing private graphics resources do not need to be recreated unless the new
            {@code ovr_Create} call returns a different {@code GraphicsLuid}.
            """
        )}
        """
    )

    ovrResult(
        "BeginFrame",
        """
        Called from render thread before application begins rendering. Must be called after #WaitToBeginFrame() and before #EndFrame(), but not necessarily
        from the same threads.
        """,

        session,
        long_long("frameIndex", "specifies the targeted application frame index. It must match what was passed to #WaitToBeginFrame()."),

        returnDoc =
        """
        an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
        ${ul(
            "#Success: command completed successfully.",
            """
            #Error_DisplayLost: The session has become invalid (such as due to a device removal) and the shared resources need to be released
            (#DestroyTextureSwapChain()), the session needs to destroyed (#Destroy()) and recreated (#Create()), and new resources need to be created
            ({@code ovr_CreateTextureSwapChainXXX}). The application's existing private graphics resources do not need to be recreated unless the new
            {@code ovr_Create} call returns a different {@code GraphicsLuid}.
            """
        )}
        """
    )

    ovrResult(
        "EndFrame",
        """
        Called from render thread after application has finished rendering. Must be called after #BeginFrame(), but not necessarily from the same thread.
        Submits layers for distortion and display, which will happen asynchronously.

        ${ul(
            "Layers are drawn in the order they are specified in the array, regardless of the layer type.",
            """
            Layers are not remembered between successive calls to #EndFrame(). A layer must be specified in every call to #EndFrame() or it won't be displayed.
            """,
            """
            If a {@code layerPtrList} entry that was specified in a previous call to #EndFrame() is passed as #NULL or is of type #LayerType_Disabled, that
            layer is no longer displayed.
            """,
            """
            A {@code layerPtrList} entry can be of any layer type and multiple entries of the same layer type are allowed. No {@code layerPtrList} entry may be
            duplicated (i.e. the same pointer as an earlier entry).
            """
        )}

        <h3>Example code</h3>
        ${codeBlock("""
ovrLayerEyeFov  layer0;
ovrLayerQuad    layer1;
...
ovrLayerHeader* layers[2] = { &layer0.Header, &layer1.Header };
ovrResult result = ovr_EndFrame(session, frameIndex, nullptr, layers, 2);""")}
        """,

        session,
        long_long("frameIndex", "specifies the targeted application frame index. It must match what was passed to #BeginFrame()."),
        nullable..ovrViewScaleDesc.const.p(
            "viewScaleDesc",
            """
            provides additional information needed only if {@code layerPtrList} contains an #LayerType_Quad. If #NULL, a default version is used based on the
            current configuration and a 1.0 world scale.
            """),
        ovrLayerHeader.const.p.const.p(
            "layerPtrList",
            """
            specifies a list of ovrLayer pointers, which can include #NULL entries to indicate that any previously shown layer at that index is to not be
            displayed. Each layer header must be a part of a layer structure such as ##OVRLayerEyeFov or ##OVRLayerQuad, with {@code Header.Type} identifying
            its type. A #NULL layerPtrList entry in the array indicates the absence of the given layer.
            """
        ),
        AutoSize("layerPtrList")..unsigned_int(
            "layerCount",
            """
            indicates the number of valid elements in {@code layerPtrList}. The maximum supported {@code layerCount} is not currently specified, but may be
            specified in a future version.
            """
        ),

        returnDoc =
        """
        an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
        ${ul(
            "#Success: rendering completed successfully.",
            """
            #Error_DisplayLost: The session has become invalid (such as due to a device removal) and the shared resources need to be released
            (#DestroyTextureSwapChain()), the session needs to destroyed (#Destroy()) and recreated (#Create()), and new resources need to be created
            ({@code ovr_CreateTextureSwapChainXXX}). The application's existing private graphics resources do not need to be recreated unless the new
            {@code ovr_Create} call returns a different {@code GraphicsLuid}.
            """,
            """
            #Error_TextureSwapChainInvalid: The {@code ovrTextureSwapChain} is in an incomplete or inconsistent state. Ensure #CommitTextureSwapChain() was
            called at least once first.
            """
        )}
        """
    )

    ovrResult(
        "SubmitFrame",
        """
        Submits layers for distortion and display.

        Deprecated. Use WaitToBeginFrame(), BeginFrame(), and #EndFrame() instead.

        {@code ovr_SubmitFrame} triggers distortion and processing which might happen asynchronously. The function will return when there is room in the
        submission queue and surfaces are available. Distortion might or might not have completed.
        ${ul(
            "Layers are drawn in the order they are specified in the array, regardless of the layer type.",
            """
            Layers are not remembered between successive calls to {@code ovr_SubmitFrame}. A layer must be specified in every call to {@code ovr_SubmitFrame}
            or it won't be displayed.
            """,
            """
            If a {@code layerPtrList} entry that was specified in a previous call to {@code ovr_SubmitFrame} is passed as #NULL or is of type
            #LayerType_Disabled, that layer is no longer displayed.
            """,
            """
            A {@code layerPtrList} entry can be of any layer type and multiple entries of the same layer type are allowed. No {@code layerPtrList} entry may be
            duplicated (i.e. the same pointer as an earlier entry).
            """
        )}

        <h3>Example code</h3>
        ${codeBlock("""
ovrLayerEyeFov  layer0;
ovrLayerQuad    layer1;
...
ovrLayerHeader* layers[2] = { &layer0.Header, &layer1.Header };
ovrResult result = ovr_SubmitFrame(session, frameIndex, nullptr, layers, 2);""")}
        """,

        session,
        long_long("frameIndex", "the targeted application frame index, or 0 to refer to one frame after the last time #SubmitFrame() was called"),
        nullable..ovrViewScaleDesc.const.p(
            "viewScaleDesc",
            """
            provides additional information needed only if {@code layerPtrList} contains an #LayerType_Quad. If #NULL, a default version is used based on the
            current configuration and a 1.0 world scale.
            """
        ),
        ovrLayerHeader.const.p.const.p(
            "layerPtrList",
            """
            a list of {@code ovrLayer} pointers, which can include #NULL entries to indicate that any previously shown layer at that index is to not be
            displayed. Each layer header must be a part of a layer structure such as ##OVRLayerEyeFov or ##OVRLayerQuad, with {@code Header.Type} identifying
            its type. A #NULL {@code layerPtrList} entry in the array indicates the absence of the given layer.
            """
        ),
        AutoSize("layerPtrList")..unsigned_int(
            "layerCount",
            """
            the number of valid elements in {@code layerPtrList}. The maximum supported {@code layerCount} is not currently specified, but may be specified in
            a future version.
            """
        ),

        returnDoc =
        """
        an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon one of the possible success values:
        ${ul(
            "#Success: rendering completed successfully.",
            """
            #Success_NotVisible: rendering completed successfully but was not displayed on the HMD, usually because another application currently has ownership
            of the HMD. Applications receiving this result should stop rendering new content, call #GetSessionStatus() to detect visibility.
            """,
            """
            #Error_DisplayLost: The session has become invalid (such as due to a device removal) and the shared resources need to be released
            (#DestroyTextureSwapChain()), the session needs to be destroyed (#Destroy()) and recreated (#Create()), and new resources need to be created
            ({@code ovr_CreateTextureSwapChainXXX}). The application's existing private graphics resources do not need to be recreated unless the new
            {@code ovr_Create} call returns a different {@code GraphicsLuid}.
            """,
            """
            #Error_TextureSwapChainInvalid: The {@code ovrTextureSwapChain} is in an incomplete or inconsistent state. Ensure
            #CommitTextureSwapChain() was called at least once first.
            """
        )}
        """
    )

    // ----------------
    // Frame Timing

    ovrResult(
        "GetPerfStats",
        """
        Retrieves performance stats for the VR app as well as the SDK compositor.

        This function will return stats for the VR app that is currently visible in the HMD regardless of what VR app is actually calling this function.

        If the VR app is trying to make sure the stats returned belong to the same application,  the caller can compare the {@code VisibleProcessId} with their
        own process ID. Normally this will be the case if the caller is only calling {@code ovr_GetPerfStats} when #GetSessionStatus() has {@code IsVisible}
        flag set to be true.

        If the VR app calling {@code ovr_GetPerfStats} is actually the one visible in the HMD, then new perf stats will only be populated after a new call to
        #SubmitFrame(). That means subsequent calls to {@code ovr_GetPerfStats} after the first one without calling {@code ovr_SubmitFrame} will receive a
        {@code FrameStatsCount} of zero.

        If the VR app is not visible, or was initially marked as #Init_Invisible, then each call to {@code ovr_GetPerfStats} will immediately fetch new perf
        stats from the compositor without a need for the {@code ovr_SubmitFrame} call.

        Even though invisible VR apps do not require {@code ovr_SubmitFrame} to be called to gather new perf stats, since stats are generated at the native
        refresh rate of the HMD (i.e. 90 Hz for CV1), calling it at a higher rate than that would be unnecessary.
        """,

        session,
        ovrPerfStats.p("outStats", "contains the performance stats for the application and SDK compositor"),

        returnDoc = "an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success"
    )

    ovrResult(
        "ResetPerfStats",
        """
        Resets the accumulated stats reported in each ##OVRPerfStatsPerCompositorFrame back to zero.

        Only the integer values such as {@code HmdVsyncIndex}, {@code AppDroppedFrameCount} etc. will be reset as the other fields such as
        {@code AppMotionToPhotonLatency} are independent timing values updated per-frame.
        """,

        session,

        returnDoc = "an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success"
    )

    double(
        "GetPredictedDisplayTime",
        """
        Gets the time of the specified frame midpoint.

        Predicts the time at which the given frame will be displayed. The predicted time is the middle of the time period during which the corresponding eye
        images will be displayed.

        The application should increment frameIndex for each successively targeted frame, and pass that index to any relevant OVR functions that need to apply
        to the frame identified by that index.

        This function is thread-safe and allows for multiple application threads to target their processing to the same displayed frame.

        In the event that prediction fails due to various reasons (e.g. the display being off or app has yet to present any frames), the return value will be
        current CPU time.
        """,

        session,
        long_long("frameIndex", "the frame the caller wishes to target. A value of zero returns the next frame index."),

        returnDoc = "the absolute frame midpoint time for the given {@code frameIndex}"
    )

    double(
        "GetTimeInSeconds",
        """
        Returns global, absolute high-resolution time in seconds.

        The time frame of reference for this function is not specified and should not be depended upon.
        """,

        returnDoc = "seconds as a floating point value"
    )

    EnumConstant(
        """
        Performance HUD enables the HMD user to see information critical to the real-time operation of the VR application such as latency timing, and CPU &amp;
        GPU performance metrics.

        App can toggle performance HUD modes as such:
        ${codeBlock("""
ovrPerfHudMode PerfHudMode = ovrPerfHud_LatencyTiming;
ovr_SetInt(session, OVR_PERF_HUD_MODE, (int)PerfHudMode);""")}
        """,

        "PerfHud_Off".enum("Turns off the performance HUD"),
        "PerfHud_PerfSummary".enum("Shows performance summary and headroom"),
        "PerfHud_LatencyTiming".enum("Shows latency related timing info"),
        "PerfHud_AppRenderTiming".enum("Shows render timing info for application"),
        "PerfHud_CompRenderTiming".enum("Shows render timing info for OVR compositor"),
        "PerfHud_AwsStats".enum("Shows Async Spacewarp-specific info", "6"),
        "PerfHud_VersionInfo".enum("Shows SDK &amp; HMD version Info", "5"),
        "PerfHud_LinkPerf".enum("Shows Oculus Link performance.", "7")
    )

    EnumConstant(
        """
        Layer HUD enables the HMD user to see information about a layer.

        App can toggle layer HUD modes as such:
${codeBlock("""
ovrLayerHudMode LayerHudMode = ovrLayerHud_Info;
ovr_SetInt(Hmd, OVR_LAYER_HUD_MODE, (int)LayerHudMode);""")}
        """,

        "LayerHud_Off" enum "Turns off the layer HUD",
        "LayerHud_Info" enum "Shows info about a specific layer"
    )

    EnumConstant(
        """
        Debug HUD is provided to help developers gauge and debug the fidelity of their app's stereo rendering characteristics. Using the provided quad and
        crosshair guides, the developer can verify various aspects such as VR tracking units (e.g. meters), stereo camera-parallax properties (e.g. making sure
        objects at infinity are rendered with the proper separation), measuring VR geometry sizes and distances and more.

        App can toggle the debug HUD modes as such:
${codeBlock("""
ovrDebugHudStereoMode DebugHudMode = ovrDebugHudStereo_QuadWithCrosshair;
ovr_SetInt(session, OVR_DEBUG_HUD_STEREO_MODE, (int)DebugHudMode);""")}

        The app can modify the visual properties of the stereo guide (i.e. quad, crosshair) using the #SetFloatArray() function. For a list of tweakable
        properties, see the {@code OVR_DEBUG_HUD_STEREO_GUIDE_*} keys in ##OVRKeys.
        """,

        "DebugHudStereo_Off".enum("Turns off the Stereo Debug HUD", "0"),
        "DebugHudStereo_Quad".enum("Renders Quad in world for Stereo Debugging"),
        "DebugHudStereo_QuadWithCrosshair".enum("Renders Quad+crosshair in world for Stereo Debugging"),
        "DebugHudStereo_CrosshairAtInfinity".enum("Renders screen-space crosshair at infinity for Stereo Debugging")
    )

    // ----------------
    // Property Access

    ovrBool(
        "GetBool",
        "Reads a boolean property.",

        session,
        charASCII.const.p("propertyName", "the name of the property, which needs to be valid for only the call"),
        ovrBool("defaultVal", "specifes the value to return if the property couldn't be read"),

        returnDoc = "the property interpreted as a boolean value. Returns {@code defaultVal} if the property doesn't exist."
    )

    ovrBool(
        "SetBool",
        """
        Writes or creates a boolean property.

        If the property wasn't previously a boolean property, it is changed to a boolean property.
        """,

        session,
        charASCII.const.p("propertyName", "the name of the property, which needs to be valid only for the call"),
        ovrBool("value", "the value to write"),

        returnDoc = "true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only."
    )

    int(
        "GetInt",
        "Reads an integer property.",

        session,
        charASCII.const.p("propertyName", "the name of the property, which needs to be valid only for the call"),
        int("defaultVal", "specifes the value to return if the property couldn't be read"),

        returnDoc = "the property interpreted as an integer value. Returns {@code defaultVal} if the property doesn't exist."
    )

    ovrBool(
        "SetInt",
        """
        Writes or creates an integer property.

        If the property wasn't previously an integer property, it is changed to an integer property.
        """,

        session,
        charASCII.const.p("propertyName", "the name of the property, which needs to be valid only for the call"),
        int("value", "the value to write"),

        returnDoc = "true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only."
    )

    float(
        "GetFloat",
        "Reads a float property.",

        session,
        charASCII.const.p("propertyName", "the name of the property, which needs to be valid only for the call"),
        float("defaultVal", "specifes the value to return if the property couldn't be read"),

        returnDoc = "the property interpreted as a float value. Returns {@code defaultVal} if the property doesn't exist."
    )

    ovrBool(
        "SetFloat",
        """
        Writes or creates a float property.

        If the property wasn't previously a float property, it's changed to a float property.
        """,

        session,
        charASCII.const.p("propertyName", "the name of the property, which needs to be valid only for the call"),
        float("value", "the value to write"),

        returnDoc = "true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only."
    )

    unsigned_int(
        "GetFloatArray",
        "Reads a float array property.",

        session,
        charASCII.const.p("propertyName", "the name of the property, which needs to be valid only for the call"),
        float.p("values", "an array of float to write to"),
        AutoSize("values")..unsigned_int("valuesCapacity", "the maximum number of elements to write to the values array"),

        returnDoc = "the number of elements read, or 0 if property doesn't exist or is empty"
    )

    ovrBool(
        "SetFloatArray",
        "Writes or creates a float array property.",

        session,
        charASCII.const.p("propertyName", "the name of the property, which needs to be valid only for the call"),
        float.p("values", "an array of float to write from"),
        AutoSize("values")..unsigned_int("valuesSize", "the number of elements to write"),

        returnDoc = "true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only."
    )

    charUTF8.const.p(
        "GetString",
        """
        Reads a string property.

        Strings are UTF8-encoded and null-terminated.
        """,

        session,
        charASCII.const.p("propertyName", "the name of the property, which needs to be valid only for the call"),
        nullable..charUTF8.const.p("defaultVal", "specifes the value to return if the property couldn't be read"),

        returnDoc =
        """
        the string property if it exists. Otherwise returns {@code defaultVal}, which can be specified as #NULL. The return memory is guaranteed to be valid
        until next call to {@code ovr_GetString} or until the HMD is destroyed, whichever occurs first.
        """
    )

    ovrBool(
        "SetString",
        """
        Writes or creates a string property.

        Strings are UTF8-encoded and null-terminated.
        """,

        ovrSession("hmddesc", "an {@code ovrSession} previously returned by #Create()"),
        charASCII.const.p("propertyName", "the name of the property, which needs to be valid only for the call"),
        charASCII.const.p("value", "the string property, which only needs to be valid for the duration of the call"),

        returnDoc = "true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only."
    )
}