/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to libOVR, using the <a target="_blank" href="https://developer.oculus.com/">Oculus SDK</a> C API. */
public class OVR {

    static { LibOVR.initialize(); }

    /** Boolean values */
    public static final int
        ovrFalse = 0,
        ovrTrue  = 1;

    /**
     * Initialization flags. ({@code ovrInitFlags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrInit_Debug Init_Debug} - 
     * When a debug library is requested, a slower debugging version of the library will run which can be used to help solve problems in the library and
     * debug application code.
     * </li>
     * <li>{@link #ovrInit_RequestVersion Init_RequestVersion} - 
     * When a version is requested, the LibOVR runtime respects the {@code RequestedMinorVersion} field and verifies that the
     * {@code RequestedMinorVersion} is supported.
     * 
     * <p>When a version is requested, the LibOVR runtime respects the {@code RequestedMinorVersion} field and verifies that the
     * {@code RequestedMinorVersion} is supported. Normally when you specify this flag you simply use {@link OVRVersion#OVR_MINOR_VERSION MINOR_VERSION} for
     * {@link OVRInitParams}{@code ::RequestedMinorVersion}, though you could use a lower version than {@link OVRVersion#OVR_MINOR_VERSION MINOR_VERSION} to specify previous version behavior.</p>
     * </li>
     * <li>{@link #ovrInit_Invisible Init_Invisible} - This client will not be visible in the HMD. Typically set by diagnostic or debugging utilities.</li>
     * <li>{@link #ovrInit_MixedRendering Init_MixedRendering} - This client will alternate between VR and 2D rendering. Typically set by game engine editors and VR-enabled web browsers.</li>
     * <li>{@link #ovrInit_FocusAware Init_FocusAware} - 
     * This client is aware of {@link OVRSessionStatus} focus states (e.g. {@code ovrSessionStatus::HasInputFocus}), and responds to them appropriately
     * (e.g. pauses and stops drawing hands when lacking focus).
     * </li>
     * <li>{@link #ovrInit_WritableBits Init_WritableBits} - These bits are writable by user code.</li>
     * </ul>
     */
    public static final int
        ovrInit_Debug          = 0x1,
        ovrInit_RequestVersion = 0x4,
        ovrInit_Invisible      = 0x10,
        ovrInit_MixedRendering = 0x20,
        ovrInit_FocusAware     = 0x40,
        ovrInit_WritableBits   = 0xFFFFFF;

    /**
     * Logging levels. ({@code ovrLogLevel})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrLogLevel_Debug LogLevel_Debug} - Debug-level log event.</li>
     * <li>{@link #ovrLogLevel_Info LogLevel_Info} - Info-level log event.</li>
     * <li>{@link #ovrLogLevel_Error LogLevel_Error} - Error-level log event.</li>
     * </ul>
     */
    public static final int
        ovrLogLevel_Debug = 0,
        ovrLogLevel_Info  = 1,
        ovrLogLevel_Error = 2;

    /**
     * HMD types. ({@code ovrHmdType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrHmd_None Hmd_None}</li>
     * <li>{@link #ovrHmd_DK2 Hmd_DK2}</li>
     * <li>{@link #ovrHmd_CB Hmd_CB}</li>
     * <li>{@link #ovrHmd_Other Hmd_Other}</li>
     * <li>{@link #ovrHmd_E3_2015 Hmd_E3_2015}</li>
     * <li>{@link #ovrHmd_ES06 Hmd_ES06}</li>
     * <li>{@link #ovrHmd_ES09 Hmd_ES09}</li>
     * <li>{@link #ovrHmd_ES11 Hmd_ES11}</li>
     * <li>{@link #ovrHmd_CV1 Hmd_CV1}</li>
     * <li>{@link #ovrHmd_RiftS Hmd_RiftS}</li>
     * <li>{@link #ovrHmd_Quest Hmd_Quest}</li>
     * <li>{@link #ovrHmd_Quest2 Hmd_Quest2}</li>
     * </ul>
     */
    public static final int
        ovrHmd_None    = 0,
        ovrHmd_DK2     = 6,
        ovrHmd_CB      = 8,
        ovrHmd_Other   = 9,
        ovrHmd_E3_2015 = 10,
        ovrHmd_ES06    = 11,
        ovrHmd_ES09    = 12,
        ovrHmd_ES11    = 13,
        ovrHmd_CV1     = 14,
        ovrHmd_RiftS   = 15,
        ovrHmd_Quest   = 19,
        ovrHmd_Quest2  = 20;

    /**
     * HMD capability bits reported by device. ({@code ovrHmdCaps})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrHmdCap_DebugDevice HmdCap_DebugDevice} - (read only) Specifies that the HMD is a virtual debug device.</li>
     * </ul>
     */
    public static final int ovrHmdCap_DebugDevice = 0x10;

    /**
     * Tracking capability bits reported by the device. ({@code ovrTrackingCaps})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrTrackingCap_Orientation TrackingCap_Orientation} - Supports orientation tracking (IMU).</li>
     * <li>{@link #ovrTrackingCap_MagYawCorrection TrackingCap_MagYawCorrection} - Supports yaw drift correction.</li>
     * <li>{@link #ovrTrackingCap_Position TrackingCap_Position} - Supports positional tracking.</li>
     * </ul>
     */
    public static final int
        ovrTrackingCap_Orientation      = 0x10,
        ovrTrackingCap_MagYawCorrection = 0x20,
        ovrTrackingCap_Position         = 0x40;

    /**
     * Optional extensions. ({@code ovrExtensions})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrExtension_TextureLayout_Octilinear Extension_TextureLayout_Octilinear} - Enable before first layer submission.</li>
     * </ul>
     */
    public static final int ovrExtension_TextureLayout_Octilinear = 0;

    /**
     * Specifies which eye is being used for rendering. ({@code ovrEyeType})
     * 
     * <p>This type explicitly does not include a third "NoStereo" monoscopic option, as such is not required for an HMD-centered API.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrEye_Left Eye_Left} - The left eye, from the viewer's perspective.</li>
     * <li>{@link #ovrEye_Right Eye_Right} - The right eye, from the viewer's perspective.</li>
     * <li>{@link #ovrEye_Count Eye_Count} - Count of enumerated elements.</li>
     * </ul>
     */
    public static final int
        ovrEye_Left  = 0,
        ovrEye_Right = 1,
        ovrEye_Count = 2;

    /**
     * Specifies the coordinate system ovrTrackingState returns tracking poses in. ({@code ovrTrackingOrigin})
     * 
     * <p>Used with {@link #ovr_SetTrackingOriginType SetTrackingOriginType}.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrTrackingOrigin_EyeLevel TrackingOrigin_EyeLevel} - 
     * Tracking system origin reported at eye (HMD) height.
     * 
     * <p>Prefer using this origin when your application requires matching user's current physical head pose to a virtual head pose without any regards to a
     * the height of the floor. Cockpit-based, or 3rd-person experiences are ideal candidates. When used, all poses in {@link OVRTrackingState} are reported as
     * an offset transform from the profile calibrated or recentered HMD pose. It is recommended that apps using this origin type call
     * {@link #ovr_RecenterTrackingOrigin RecenterTrackingOrigin} prior to starting the VR experience, but notify the user before doing so to make sure the user is in a comfortable pose,
     * facing a comfortable direction.</p>
     * </li>
     * <li>{@link #ovrTrackingOrigin_FloorLevel TrackingOrigin_FloorLevel} - 
     * Tracking system origin reported at floor height.
     * 
     * <p>Prefer using this origin when your application requires the physical floor height to match the virtual floor height, such as standing experiences.
     * When used, all poses in {@link OVRTrackingState} are reported as an offset transform from the profile calibrated floor pose. Calling
     * {@link #ovr_RecenterTrackingOrigin RecenterTrackingOrigin} will recenter the X &amp; Z axes as well as yaw, but the Y-axis (i.e. height) will continue to be reported using the
     * floor height as the origin for all poses.</p>
     * </li>
     * </ul>
     */
    public static final int
        ovrTrackingOrigin_EyeLevel   = 0,
        ovrTrackingOrigin_FloorLevel = 1;

    /**
     * Color space types for HMDs.
     * 
     * <p>Until {@link #ovr_SetClientColorDesc SetClientColorDesc} is called, for backwards compatibility, a new session will start with {@link #ovrColorSpace_Unknown ColorSpace_Unknown} which will default to
     * {@link #ovrColorSpace_Rift_CV1 ColorSpace_Rift_CV1}. This assumes the app visuals were authored to be viewed in a Rift CV1 HMD. Therefore it does the following:</p>
     * 
     * <ul>
     * <li>For Rift CV1, assumes submitted images are authored for CV1 color space, and keeps them as is.</li>
     * <li>For Rift S and Quest (via Oculus Link), converts images to reproduce CV1's color space.</li>
     * </ul>
     * 
     * <p>This API only handles color-space remapping. Unless specified, all color spaces use D65 white point. This API will not affect brightness, contrast or
     * gamma curves. Some of these aspects such as gamma, is handled by the texture format being used. From the GPU samplers' point-of-view, each texture will
     * continue to be treated as linear luminance including the sRGB format which is converted to linear by the texture sampler.</p>
     * 
     * <p>It is recommended that content is authored for the Rift CV1 color space as it has a wider color gamut than the Rift S. If content is authored to a
     * narrow color space such as "Rec. 709" or "Rift S", this can lead to content looking "dull", "washed out" or "desaturated" when viewed in a
     * wider-color-space-capable device such as Rift CV1 and Quest. This is because the colors stored in the submitted images will no longer be able to hit
     * the deeper saturated chromaticity values.</p>
     * 
     * <p>Using {@link #ovrColorSpace_Unmanaged ColorSpace_Unmanaged} will force the runtime to skip color correction on to the provided content. This is not recommended unless the app
     * developer is sure about what they're doing. {@code ovrColorSpace_Unmanaged} is mostly useful for research &amp; experimentation, but not for software
     * distribution. This is because unless the client is applying the necessary corrections for each HMD type, the results seen in the HMD will be
     * uncalibrated. This is especially true for future HMDs where the color space is not yet known or defined, leading to colors that might look too dull or
     * saturated.</p>
     * 
     * <p>Requested rectilinear-mirror outputs are composited without any color space adjustment. However, if client requests a post-distortion (i.e.
     * non-rectilinear) mirror output, it will be provided with the same color adjustment that was applied for the HMD output. Therefore, post-distortion
     * mirror output are not guaranteed to have acceptable color-space accuracy for desktop viewing.</p>
     * 
     * <p>Color Space Details with Chromaticity Primaries in CIE 1931 xy:</p>
     * 
     * <pre><code>
     * Color Space: Rift CV1 between P3 &amp; Adobe RGB using D75 white point
     * Red  : (0.666, 0.334)
     * Green: (0.238, 0.714)
     * Blue : (0.139, 0.053)
     * White: (0.298, 0.318)
     * 
     * Color Space: Quest similar to Rift CV1 using D75 white point
     * Red  : (0.661, 0.338)
     * Green: (0.228, 0.718)
     * Blue : (0.142, 0.042)
     * White: (0.298, 0.318)
     * 
     * Color Space: Rift S similar to Rec 709 using D75
     * Red  : (0.640, 0.330)
     * Green: (0.292, 0.586)
     * Blue : (0.156, 0.058)
     * White: (0.298, 0.318)
     * 
     * Color Space: P3, similar to DCI-P3, but using D65 white point instead.
     * Red  : (0.680, 0.320)
     * Green: (0.265, 0.690)
     * Blue : (0.150, 0.060)
     * White: (0.313, 0.329)            </code></pre>
     * 
     * <p>Note: Due to LCD limitations, the Rift S display will not be able to meaningfully differentiate brightness levels below 13 out of 255 for 8-bit sRGB or
     * 0.0015 out of 1.0 max for linear-RGB shader output values. To that end, it is recommended that reliance on a dark and narrow gamut is avoided, and the
     * content is instead spread across a larger brightness range when possible.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrColorSpace_Unknown ColorSpace_Unknown} - Default value until client sets calls {@link #ovr_SetClientColorDesc SetClientColorDesc}</li>
     * <li>{@link #ovrColorSpace_Unmanaged ColorSpace_Unmanaged} - See notes above. No correction, i.e. color space of active HMD</li>
     * <li>{@link #ovrColorSpace_Rift_CV1 ColorSpace_Rift_CV1} - See notes above. Unique color space.</li>
     * <li>{@link #ovrColorSpace_Rift_S ColorSpace_Rift_S} - See notes above. Unique color space.</li>
     * <li>{@link #ovrColorSpace_Quest ColorSpace_Quest} - See notes above. Unique color space.</li>
     * <li>{@link #ovrColorSpace_Rec_2020 ColorSpace_Rec_2020} - Standard Rec. 2020 chromaticities</li>
     * <li>{@link #ovrColorSpace_Rec_709 ColorSpace_Rec_709} - Standard Rec. 709 chromaticities, similar to sRGB</li>
     * <li>{@link #ovrColorSpace_P3 ColorSpace_P3} - See notes above</li>
     * <li>{@link #ovrColorSpace_Adobe_RGB ColorSpace_Adobe_RGB} - Standard AdobeRGB chromaticities</li>
     * </ul>
     */
    public static final int
        ovrColorSpace_Unknown   = 0,
        ovrColorSpace_Unmanaged = 1,
        ovrColorSpace_Rift_CV1  = 2,
        ovrColorSpace_Rift_S    = 3,
        ovrColorSpace_Quest     = 4,
        ovrColorSpace_Rec_2020  = 5,
        ovrColorSpace_Rec_709   = 6,
        ovrColorSpace_P3        = 7,
        ovrColorSpace_Adobe_RGB = 8;

    /**
     * Bit flags describing the current status of sensor tracking. ({@code ovrStatusBits}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrStatus_OrientationTracked Status_OrientationTracked} - 
     * Device orientation is currently tracked.
     * 
     * <p>It's possible that the device orientation is not tracked, but its reported orientation is nevertheless valid (e.g. due to estimation).</p>
     * </li>
     * <li>{@link #ovrStatus_PositionTracked Status_PositionTracked} - 
     * Device position is currently tracked.
     * 
     * <p>It's possible that the device position is not tracked, but its reported position is nevertheless valid (e.g. due to estimation).</p>
     * </li>
     * <li>{@link #ovrStatus_OrientationValid Status_OrientationValid} - 
     * The reported device orientation is valid for application use.
     * 
     * <p>In the case that {@code OrientationValid} is true and {@code OrientationTracked} is false, the runtime may be estimating the orientation of the
     * device. In the case that {@code OrientationValid} is false, the application should not use the returned orientation value.</p>
     * </li>
     * <li>{@link #ovrStatus_PositionValid Status_PositionValid} - 
     * The reported device orientation is valid for application use.
     * 
     * <p>In the case that {@code PositionValid} is true and {@code PositionTracked} is false, the runtime may be estimating the position of the device. In
     * the case that {@code PositionValid} is false, the application should not use the returned position value.</p>
     * </li>
     * </ul>
     */
    public static final int
        ovrStatus_OrientationTracked = 0x1,
        ovrStatus_PositionTracked    = 0x2,
        ovrStatus_OrientationValid   = 0x4,
        ovrStatus_PositionValid      = 0x8;

    /**
     * Specifies sensor flags. ({@code ovrTrackerFlags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrTracker_Connected Tracker_Connected} - The sensor is present, else the sensor is absent or offline.</li>
     * <li>{@link #ovrTracker_PoseTracked Tracker_PoseTracked} - The sensor has a valid pose, else the pose is unavailable. This will only be set if ovrTracker_Connected is set.</li>
     * </ul>
     */
    public static final int
        ovrTracker_Connected   = 0x20,
        ovrTracker_PoseTracked = 0x4;

    /**
     * The type of texture resource. ({@code ovrTextureType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrTexture_2D Texture_2D} - 2D textures or texture arrays.</li>
     * <li>{@link #ovrTexture_2D_External Texture_2D_External} - Application-provided 2D texture. Not supported on PC.</li>
     * <li>{@link #ovrTexture_Cube Texture_Cube} - Cube maps. {@link OVRTextureSwapChainDesc}{@code ::ArraySize} must be 6 for this type.</li>
     * </ul>
     */
    public static final int
        ovrTexture_2D          = 0,
        ovrTexture_2D_External = 1,
        ovrTexture_Cube        = 2;

    /**
     * The bindings required for texture swap chain. ({@code ovrTextureBindFlags})
     * 
     * <p>All texture swap chains are automatically bindable as shader input resources since the Oculus runtime needs this to read them.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrTextureBind_None TextureBind_None}</li>
     * <li>{@link #ovrTextureBind_DX_RenderTarget TextureBind_DX_RenderTarget} - The application can write into the chain with pixel shader</li>
     * <li>{@link #ovrTextureBind_DX_UnorderedAccess TextureBind_DX_UnorderedAccess} - The application can write to the chain with compute shader</li>
     * <li>{@link #ovrTextureBind_DX_DepthStencil TextureBind_DX_DepthStencil} - The chain buffers can be bound as depth and/or stencil buffers. This flag cannot be combined with {@link #ovrTextureBind_DX_RenderTarget TextureBind_DX_RenderTarget}.</li>
     * </ul>
     */
    public static final int
        ovrTextureBind_None               = 0,
        ovrTextureBind_DX_RenderTarget    = 0x1,
        ovrTextureBind_DX_UnorderedAccess = 0x2,
        ovrTextureBind_DX_DepthStencil    = 0x4;

    /**
     * The format of a texture. ({@code ovrTextureFormat})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #OVR_FORMAT_UNKNOWN OVR_FORMAT_UNKNOWN}</li>
     * <li>{@link #OVR_FORMAT_B5G6R5_UNORM OVR_FORMAT_B5G6R5_UNORM} - Not currently supported on PC. Requires a DirectX 11.1 device.</li>
     * <li>{@link #OVR_FORMAT_B5G5R5A1_UNORM OVR_FORMAT_B5G5R5A1_UNORM} - Not currently supported on PC. Requires a DirectX 11.1 device.</li>
     * <li>{@link #OVR_FORMAT_B4G4R4A4_UNORM OVR_FORMAT_B4G4R4A4_UNORM} - Not currently supported on PC. Requires a DirectX 11.1 device.</li>
     * <li>{@link #OVR_FORMAT_R8G8B8A8_UNORM OVR_FORMAT_R8G8B8A8_UNORM}</li>
     * <li>{@link #OVR_FORMAT_R8G8B8A8_UNORM_SRGB OVR_FORMAT_R8G8B8A8_UNORM_SRGB}</li>
     * <li>{@link #OVR_FORMAT_B8G8R8A8_UNORM OVR_FORMAT_B8G8R8A8_UNORM}</li>
     * <li>{@link #OVR_FORMAT_B8G8R8_UNORM OVR_FORMAT_B8G8R8_UNORM} - Not currently supported.</li>
     * <li>{@link #OVR_FORMAT_B8G8R8A8_UNORM_SRGB OVR_FORMAT_B8G8R8A8_UNORM_SRGB} - Not supported for OpenGL applications.</li>
     * <li>{@link #OVR_FORMAT_B8G8R8X8_UNORM OVR_FORMAT_B8G8R8X8_UNORM} - Not supported for OpenGL applications.</li>
     * <li>{@link #OVR_FORMAT_B8G8R8X8_UNORM_SRGB OVR_FORMAT_B8G8R8X8_UNORM_SRGB} - Not supported for OpenGL applications.</li>
     * <li>{@link #OVR_FORMAT_R16G16B16A16_FLOAT OVR_FORMAT_R16G16B16A16_FLOAT}</li>
     * <li>{@link #OVR_FORMAT_R11G11B10_FLOAT OVR_FORMAT_R11G11B10_FLOAT} - Not supported for D3D12 applications.</li>
     * <li>{@link #OVR_FORMAT_D16_UNORM OVR_FORMAT_D16_UNORM}</li>
     * <li>{@link #OVR_FORMAT_D24_UNORM_S8_UINT OVR_FORMAT_D24_UNORM_S8_UINT}</li>
     * <li>{@link #OVR_FORMAT_D32_FLOAT OVR_FORMAT_D32_FLOAT}</li>
     * <li>{@link #OVR_FORMAT_D32_FLOAT_S8X24_UINT OVR_FORMAT_D32_FLOAT_S8X24_UINT}</li>
     * <li>{@link #OVR_FORMAT_BC1_UNORM OVR_FORMAT_BC1_UNORM}</li>
     * <li>{@link #OVR_FORMAT_BC1_UNORM_SRGB OVR_FORMAT_BC1_UNORM_SRGB}</li>
     * <li>{@link #OVR_FORMAT_BC2_UNORM OVR_FORMAT_BC2_UNORM}</li>
     * <li>{@link #OVR_FORMAT_BC2_UNORM_SRGB OVR_FORMAT_BC2_UNORM_SRGB}</li>
     * <li>{@link #OVR_FORMAT_BC3_UNORM OVR_FORMAT_BC3_UNORM}</li>
     * <li>{@link #OVR_FORMAT_BC3_UNORM_SRGB OVR_FORMAT_BC3_UNORM_SRGB}</li>
     * <li>{@link #OVR_FORMAT_BC6H_UF16 OVR_FORMAT_BC6H_UF16}</li>
     * <li>{@link #OVR_FORMAT_BC6H_SF16 OVR_FORMAT_BC6H_SF16}</li>
     * <li>{@link #OVR_FORMAT_BC7_UNORM OVR_FORMAT_BC7_UNORM}</li>
     * <li>{@link #OVR_FORMAT_BC7_UNORM_SRGB OVR_FORMAT_BC7_UNORM_SRGB}</li>
     * </ul>
     */
    public static final int
        OVR_FORMAT_UNKNOWN              = 0,
        OVR_FORMAT_B5G6R5_UNORM         = 1,
        OVR_FORMAT_B5G5R5A1_UNORM       = 2,
        OVR_FORMAT_B4G4R4A4_UNORM       = 3,
        OVR_FORMAT_R8G8B8A8_UNORM       = 4,
        OVR_FORMAT_R8G8B8A8_UNORM_SRGB  = 5,
        OVR_FORMAT_B8G8R8A8_UNORM       = 6,
        OVR_FORMAT_B8G8R8_UNORM         = 27,
        OVR_FORMAT_B8G8R8A8_UNORM_SRGB  = 7,
        OVR_FORMAT_B8G8R8X8_UNORM       = 8,
        OVR_FORMAT_B8G8R8X8_UNORM_SRGB  = 9,
        OVR_FORMAT_R16G16B16A16_FLOAT   = 10,
        OVR_FORMAT_R11G11B10_FLOAT      = 25,
        OVR_FORMAT_D16_UNORM            = 11,
        OVR_FORMAT_D24_UNORM_S8_UINT    = 12,
        OVR_FORMAT_D32_FLOAT            = 13,
        OVR_FORMAT_D32_FLOAT_S8X24_UINT = 14,
        OVR_FORMAT_BC1_UNORM            = 15,
        OVR_FORMAT_BC1_UNORM_SRGB       = 16,
        OVR_FORMAT_BC2_UNORM            = 17,
        OVR_FORMAT_BC2_UNORM_SRGB       = 18,
        OVR_FORMAT_BC3_UNORM            = 19,
        OVR_FORMAT_BC3_UNORM_SRGB       = 20,
        OVR_FORMAT_BC6H_UF16            = 21,
        OVR_FORMAT_BC6H_SF16            = 22,
        OVR_FORMAT_BC7_UNORM            = 23,
        OVR_FORMAT_BC7_UNORM_SRGB       = 24;

    /**
     * Misc flags overriding particular behaviors of a texture swap chain. ({@code ovrTextureFlags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrTextureMisc_None TextureMisc_None}</li>
     * <li>{@link #ovrTextureMisc_DX_Typeless TextureMisc_DX_Typeless} - 
     * DX only: The underlying texture is created with a TYPELESS equivalent of the format specified in the texture desc. The SDK will still access the
     * texture using the format specified in the texture desc, but the app can create views with different formats if this is specified.
     * </li>
     * <li>{@link #ovrTextureMisc_AllowGenerateMips TextureMisc_AllowGenerateMips} - DX only: Allow generation of the mip chain on the GPU via the GenerateMips call. This flag requires that RenderTarget binding also be specified.</li>
     * <li>{@link #ovrTextureMisc_ProtectedContent TextureMisc_ProtectedContent} - 
     * Texture swap chain contains protected content, and requires HDCP connection in order to display to HMD. Also prevents mirroring or other
     * redirection of any frame containing this contents
     * </li>
     * <li>{@link #ovrTextureMisc_AutoGenerateMips TextureMisc_AutoGenerateMips} - 
     * Automatically generate and use the mip chain in composition on each submission. Mips are regenerated from highest quality level, ignoring other
     * pre-existing mip levels.
     * 
     * <p>Not supported for depth or compressed (BC) formats.</p>
     * </li>
     * </ul>
     */
    public static final int
        ovrTextureMisc_None              = 0,
        ovrTextureMisc_DX_Typeless       = 0x1,
        ovrTextureMisc_AllowGenerateMips = 0x2,
        ovrTextureMisc_ProtectedContent  = 0x4,
        ovrTextureMisc_AutoGenerateMips  = 0x8;

    /**
     * Bit flags used as part of {@link OVRMirrorTextureDesc}'s {@code MirrorOptions} field. {@code ovrMirrorOptions}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrMirrorOption_Default MirrorOption_Default} - 
     * By default the mirror texture will be:
     * 
     * <ul>
     * <li>Pre-distortion (i.e. rectilinear)</li>
     * <li>Contain both eye textures</li>
     * <li>Exclude Guardian, Notifications, System Menu GUI</li>
     * </ul>
     * </li>
     * <li>{@link #ovrMirrorOption_PostDistortion MirrorOption_PostDistortion} - 
     * Retrieves the barrel distorted texture contents instead of the rectilinear one.
     * 
     * <p>This is only recommended for debugging purposes, and not for final desktop presentation.</p>
     * </li>
     * <li>{@link #ovrMirrorOption_LeftEyeOnly MirrorOption_LeftEyeOnly} - Since {@link #ovrMirrorOption_Default MirrorOption_Default} renders both eyes into the mirror texture, these two flags are exclusive (i.e. cannot use them simultaneously)</li>
     * <li>{@link #ovrMirrorOption_RightEyeOnly MirrorOption_RightEyeOnly} - See {@link #ovrMirrorOption_LeftEyeOnly MirrorOption_LeftEyeOnly}</li>
     * <li>{@link #ovrMirrorOption_IncludeGuardian MirrorOption_IncludeGuardian} - Shows the boundary system aka Guardian on the mirror texture.</li>
     * <li>{@link #ovrMirrorOption_IncludeNotifications MirrorOption_IncludeNotifications} - Shows system notifications the user receives on the mirror texture.</li>
     * <li>{@link #ovrMirrorOption_IncludeSystemGui MirrorOption_IncludeSystemGui} - Shows the system menu (triggered by hitting the Home button) on the mirror texture.</li>
     * <li>{@link #ovrMirrorOption_ForceSymmetricFov MirrorOption_ForceSymmetricFov} - 
     * Forces mirror output to use max symmetric FOV instead of asymmetric full FOV used by HMD.
     * 
     * <p>Only valid for rectilinear mirrors i.e. using {@link #ovrMirrorOption_PostDistortion MirrorOption_PostDistortion} with {@code ovrMirrorOption_ForceSymmetricFov} will result in
     * {@link OVRErrorCode#ovrError_InvalidParameter Error_InvalidParameter} error.</p>
     * </li>
     * </ul>
     */
    public static final int
        ovrMirrorOption_Default              = 0x0,
        ovrMirrorOption_PostDistortion       = 0x1,
        ovrMirrorOption_LeftEyeOnly          = 0x2,
        ovrMirrorOption_RightEyeOnly         = 0x4,
        ovrMirrorOption_IncludeGuardian      = 0x8,
        ovrMirrorOption_IncludeNotifications = 0x10,
        ovrMirrorOption_IncludeSystemGui     = 0x20,
        ovrMirrorOption_ForceSymmetricFov    = 0x40;

    /**
     * Viewport stencil types provided by the {@link #ovr_GetFovStencil GetFovStencil} call. {@code ovrFovStencilType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrFovStencil_HiddenArea FovStencil_HiddenArea} - Triangle list covering parts that are hidden to users.</li>
     * <li>{@link #ovrFovStencil_VisibleArea FovStencil_VisibleArea} - Triangle list covering parts that are visible to users.</li>
     * <li>{@link #ovrFovStencil_BorderLine FovStencil_BorderLine} - Line list that draws the boundary visible to users.</li>
     * <li>{@link #ovrFovStencil_VisibleRectangle FovStencil_VisibleRectangle} - Axis-aligned rectangle fit in visible region. 4x vertices: TopLeft, TopRight, BottomRight, BottomLeft.</li>
     * </ul>
     */
    public static final int
        ovrFovStencil_HiddenArea       = 0,
        ovrFovStencil_VisibleArea      = 1,
        ovrFovStencil_BorderLine       = 2,
        ovrFovStencil_VisibleRectangle = 3;

    /**
     * Flags used by {@link OVRFovStencilDesc} and which are passed to {@link #ovr_GetFovStencil GetFovStencil}. ({@code ovrFovStencilFlags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrFovStencilFlag_MeshOriginAtBottomLeft FovStencilFlag_MeshOriginAtBottomLeft} - 
     * When used, flips the Y component of the provided 2D mesh coordinates, such that Y increases upwards. When not used, places mesh origin at top-left
     * where Y increases downwards.
     * </li>
     * </ul>
     */
    public static final int ovrFovStencilFlag_MeshOriginAtBottomLeft = 0x1;

    /**
     * Describes button input types.({@code ovrButton})
     * 
     * <p>Button inputs are combined; that is they will be reported as pressed if they are pressed on either one of the two devices. The
     * {@code ovrButton_Up/Down/Left/Right} map to both XBox D-Pad and directional buttons. The {@code ovrButton_Enter} and {@code ovrButton_Return} map to
     * Start and Back controller buttons, respectively.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrButton_A Button_A} - A button on XBox controllers and right Touch controller. Select button on Oculus Remote.</li>
     * <li>{@link #ovrButton_B Button_B} - B button on XBox controllers and right Touch controller. Back button on Oculus Remote.</li>
     * <li>{@link #ovrButton_RThumb Button_RThumb} - Right thumbstick on XBox controllers and Touch controllers. Not present on Oculus Remote.</li>
     * <li>{@link #ovrButton_RShoulder Button_RShoulder} - Right shoulder button on XBox controllers. Not present on Touch controllers or Oculus Remote.</li>
     * <li>{@link #ovrButton_X Button_X} - X button on XBox controllers and left Touch controller. Not present on Oculus Remote.</li>
     * <li>{@link #ovrButton_Y Button_Y} - Y button on XBox controllers and left Touch controller. Not present on Oculus Remote.</li>
     * <li>{@link #ovrButton_LThumb Button_LThumb} - Left thumbstick on XBox controllers and Touch controllers. Not present on Oculus Remote.</li>
     * <li>{@link #ovrButton_LShoulder Button_LShoulder} - Left shoulder button on XBox controllers. Not present on Touch controllers or Oculus Remote.</li>
     * <li>{@link #ovrButton_Up Button_Up} - Up button on XBox controllers and Oculus Remote. Not present on Touch controllers.</li>
     * <li>{@link #ovrButton_Down Button_Down} - Down button on XBox controllers and Oculus Remote. Not present on Touch controllers.</li>
     * <li>{@link #ovrButton_Left Button_Left} - Left button on XBox controllers and Oculus Remote. Not present on Touch controllers.</li>
     * <li>{@link #ovrButton_Right Button_Right} - Right button on XBox controllers and Oculus Remote. Not present on Touch controllers.</li>
     * <li>{@link #ovrButton_Enter Button_Enter} - 
     * Start on XBox 360 controller. Menu on XBox One controller and Left Touch controller. Should be referred to as the Menu button in user-facing
     * documentation.
     * </li>
     * <li>{@link #ovrButton_Back Button_Back} - Back on Xbox 360 controller. View button on XBox One controller. Not present on Touch controllers or Oculus Remote.</li>
     * <li>{@link #ovrButton_VolUp Button_VolUp} - Volume button on Oculus Remote. Not present on XBox or Touch controllers.</li>
     * <li>{@link #ovrButton_VolDown Button_VolDown} - Volume button on Oculus Remote. Not present on XBox or Touch controllers.</li>
     * <li>{@link #ovrButton_Home Button_Home} - Home button on XBox controllers. Oculus button on Touch controllers and Oculus Remote.</li>
     * <li>{@link #ovrButton_Private Button_Private} - Bit mask of all buttons that are for private usage by Oculus</li>
     * <li>{@link #ovrButton_RMask Button_RMask} - Bit mask of all buttons on the right Touch controller</li>
     * <li>{@link #ovrButton_LMask Button_LMask} - Bit mask of all buttons on the left Touch controller</li>
     * </ul>
     */
    public static final int
        ovrButton_A         = 0x1,
        ovrButton_B         = 0x2,
        ovrButton_RThumb    = 0x4,
        ovrButton_RShoulder = 0x8,
        ovrButton_X         = 0x100,
        ovrButton_Y         = 0x200,
        ovrButton_LThumb    = 0x400,
        ovrButton_LShoulder = 0x800,
        ovrButton_Up        = 0x10000,
        ovrButton_Down      = 0x20000,
        ovrButton_Left      = 0x40000,
        ovrButton_Right     = 0x80000,
        ovrButton_Enter     = 0x100000,
        ovrButton_Back      = 0x200000,
        ovrButton_VolUp     = 0x400000,
        ovrButton_VolDown   = 0x800000,
        ovrButton_Home      = 0x1000000,
        ovrButton_Private   = ovrButton_VolUp | ovrButton_VolDown | ovrButton_Home,
        ovrButton_RMask     = ovrButton_A | ovrButton_B | ovrButton_RThumb | ovrButton_RShoulder,
        ovrButton_LMask     = ovrButton_X | ovrButton_Y | ovrButton_LThumb | ovrButton_LShoulder | ovrButton_Enter;

    /**
     * Describes touch input types. ({@code ovrTouch})
     * 
     * <p>These values map to capacitive touch values reported {@link OVRInputState}{@code ::Touch}. Some of these values are mapped to button bits for consistency.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrTouch_A Touch_A} - Touch A</li>
     * <li>{@link #ovrTouch_B Touch_B} - Touch B</li>
     * <li>{@link #ovrTouch_RThumb Touch_RThumb} - Touch RThumb</li>
     * <li>{@link #ovrTouch_RThumbRest Touch_RThumbRest} - Touch RThumbRest</li>
     * <li>{@link #ovrTouch_RIndexTrigger Touch_RIndexTrigger} - Touch RIndexTrigger</li>
     * <li>{@link #ovrTouch_RButtonMask Touch_RButtonMask} - Bit mask of all the button touches on the right controller</li>
     * <li>{@link #ovrTouch_X Touch_X} - Touch X</li>
     * <li>{@link #ovrTouch_Y Touch_Y} - Touch Y</li>
     * <li>{@link #ovrTouch_LThumb Touch_LThumb} - Touch LThumb</li>
     * <li>{@link #ovrTouch_LThumbRest Touch_LThumbRest} - Touch LThumbRest</li>
     * <li>{@link #ovrTouch_LIndexTrigger Touch_LIndexTrigger} - Touch LIndexTrigger</li>
     * <li>{@link #ovrTouch_LButtonMask Touch_LButtonMask} - Bit mask of all the button touches on the left controller</li>
     * <li>{@link #ovrTouch_RIndexPointing Touch_RIndexPointing} - TouchRIndexPointing</li>
     * <li>{@link #ovrTouch_RThumbUp Touch_RThumbUp} - Touch RThumbUp</li>
     * <li>{@link #ovrTouch_LIndexPointing Touch_LIndexPointing} - Touch LIndexPointing</li>
     * <li>{@link #ovrTouch_LThumbUp Touch_LThumbUp} - Touch LThumbUp</li>
     * <li>{@link #ovrTouch_RPoseMask Touch_RPoseMask} - Bit mask of all right controller poses</li>
     * <li>{@link #ovrTouch_LPoseMask Touch_LPoseMask} - Bit mask of all left controller poses.</li>
     * </ul>
     */
    public static final int
        ovrTouch_A              = ovrButton_A,
        ovrTouch_B              = ovrButton_B,
        ovrTouch_RThumb         = ovrButton_RThumb,
        ovrTouch_RThumbRest     = 0x8,
        ovrTouch_RIndexTrigger  = 0x10,
        ovrTouch_RButtonMask    = ovrTouch_A | ovrTouch_B | ovrTouch_RThumb | ovrTouch_RThumbRest | ovrTouch_RIndexTrigger,
        ovrTouch_X              = ovrButton_X,
        ovrTouch_Y              = ovrButton_Y,
        ovrTouch_LThumb         = ovrButton_LThumb,
        ovrTouch_LThumbRest     = 0x800,
        ovrTouch_LIndexTrigger  = 0x1000,
        ovrTouch_LButtonMask    = ovrTouch_X | ovrTouch_Y | ovrTouch_LThumb | ovrTouch_LThumbRest | ovrTouch_LIndexTrigger,
        ovrTouch_RIndexPointing = 0x20,
        ovrTouch_RThumbUp       = 0x40,
        ovrTouch_LIndexPointing = 0x2000,
        ovrTouch_LThumbUp       = 0x4000,
        ovrTouch_RPoseMask      = ovrTouch_RIndexPointing | ovrTouch_RThumbUp,
        ovrTouch_LPoseMask      = ovrTouch_LIndexPointing | ovrTouch_LThumbUp;

    /**
     * Which controller is connected; multiple can be connected at once. ({@code ovrControllerType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrControllerType_None ControllerType_None}</li>
     * <li>{@link #ovrControllerType_LTouch ControllerType_LTouch}</li>
     * <li>{@link #ovrControllerType_RTouch ControllerType_RTouch}</li>
     * <li>{@link #ovrControllerType_Touch ControllerType_Touch}</li>
     * <li>{@link #ovrControllerType_Remote ControllerType_Remote}</li>
     * <li>{@link #ovrControllerType_XBox ControllerType_XBox}</li>
     * <li>{@link #ovrControllerType_Object0 ControllerType_Object0}</li>
     * <li>{@link #ovrControllerType_Object1 ControllerType_Object1}</li>
     * <li>{@link #ovrControllerType_Object2 ControllerType_Object2}</li>
     * <li>{@link #ovrControllerType_Object3 ControllerType_Object3}</li>
     * <li>{@link #ovrControllerType_Active ControllerType_Active} - Operate on or query whichever controller is active.</li>
     * </ul>
     */
    public static final int
        ovrControllerType_None    = 0x0,
        ovrControllerType_LTouch  = 0x1,
        ovrControllerType_RTouch  = 0x2,
        ovrControllerType_Touch   = (ovrControllerType_LTouch | ovrControllerType_RTouch),
        ovrControllerType_Remote  = 0x4,
        ovrControllerType_XBox    = 0x10,
        ovrControllerType_Object0 = 0x100,
        ovrControllerType_Object1 = 0x200,
        ovrControllerType_Object2 = 0x400,
        ovrControllerType_Object3 = 0x800,
        ovrControllerType_Active  = 0xFFFFFFFF;

    /**
     * Haptics buffer submit mode. ({@code ovrHapticsBufferSubmitMode})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrHapticsBufferSubmit_Enqueue HapticsBufferSubmit_Enqueue} - Enqueue buffer for later playback</li>
     * </ul>
     */
    public static final int ovrHapticsBufferSubmit_Enqueue = 0;

    /**
     * Position tracked devices. ({@code ovrTrackedDeviceType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrTrackedDevice_None TrackedDevice_None}</li>
     * <li>{@link #ovrTrackedDevice_HMD TrackedDevice_HMD}</li>
     * <li>{@link #ovrTrackedDevice_LTouch TrackedDevice_LTouch}</li>
     * <li>{@link #ovrTrackedDevice_RTouch TrackedDevice_RTouch}</li>
     * <li>{@link #ovrTrackedDevice_Touch TrackedDevice_Touch}</li>
     * <li>{@link #ovrTrackedDevice_Object0 TrackedDevice_Object0}</li>
     * <li>{@link #ovrTrackedDevice_Object1 TrackedDevice_Object1}</li>
     * <li>{@link #ovrTrackedDevice_Object2 TrackedDevice_Object2}</li>
     * <li>{@link #ovrTrackedDevice_Object3 TrackedDevice_Object3}</li>
     * <li>{@link #ovrTrackedDevice_All TrackedDevice_All}</li>
     * </ul>
     */
    public static final int
        ovrTrackedDevice_None    = 0x0,
        ovrTrackedDevice_HMD     = 0x1,
        ovrTrackedDevice_LTouch  = 0x2,
        ovrTrackedDevice_RTouch  = 0x4,
        ovrTrackedDevice_Touch   = (ovrTrackedDevice_LTouch | ovrTrackedDevice_RTouch),
        ovrTrackedDevice_Object0 = 0x10,
        ovrTrackedDevice_Object1 = 0x20,
        ovrTrackedDevice_Object2 = 0x40,
        ovrTrackedDevice_Object3 = 0x80,
        ovrTrackedDevice_All     = 0xFFFF;

    /**
     * Camera status flags. ({@code ovrCameraStatusFlags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrCameraStatus_None CameraStatus_None} - Initial state of camera.</li>
     * <li>{@link #ovrCameraStatus_Connected CameraStatus_Connected} - Bit set when the camera is connected to the system.</li>
     * <li>{@link #ovrCameraStatus_Calibrating CameraStatus_Calibrating} - Bit set when the camera is undergoing calibration.</li>
     * <li>{@link #ovrCameraStatus_CalibrationFailed CameraStatus_CalibrationFailed} - Bit set when the camera has tried &amp; failed calibration.</li>
     * <li>{@link #ovrCameraStatus_Calibrated CameraStatus_Calibrated} - Bit set when the camera has tried &amp; passed calibration.</li>
     * <li>{@link #ovrCameraStatus_Capturing CameraStatus_Capturing} - Bit set when the camera is capturing.</li>
     * </ul>
     */
    public static final int
        ovrCameraStatus_None              = 0x0,
        ovrCameraStatus_Connected         = 0x1,
        ovrCameraStatus_Calibrating       = 0x2,
        ovrCameraStatus_CalibrationFailed = 0x4,
        ovrCameraStatus_Calibrated        = 0x8,
        ovrCameraStatus_Capturing         = 0x10;

    /**
     * Boundary types that specified while using the boundary system. ({@code ovrBoundaryType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrBoundary_Outer Boundary_Outer} - Outer boundary - closely represents user setup walls</li>
     * <li>{@link #ovrBoundary_PlayArea Boundary_PlayArea} - Play area - safe rectangular area inside outer boundary which can optionally be used to restrict user interactions and motion.</li>
     * </ul>
     */
    public static final int
        ovrBoundary_Outer    = 0x1,
        ovrBoundary_PlayArea = 0x100;

    /**
     * Names for the left and right hand array indexes. ({@code ovrHandType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrHand_Left Hand_Left}</li>
     * <li>{@link #ovrHand_Right Hand_Right}</li>
     * <li>{@link #ovrHand_Count Hand_Count}</li>
     * </ul>
     */
    public static final int
        ovrHand_Left  = 0x0,
        ovrHand_Right = 0x1,
        ovrHand_Count = 0x2;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrMaxProvidedFrameStats MaxProvidedFrameStats} - Maximum number of frames of performance stats provided back to the caller of {@link #ovr_GetPerfStats GetPerfStats}.</li>
     * </ul>
     */
    public static final int ovrMaxProvidedFrameStats = 0x5;

    /** Maximum number of samples in {@link OVRHapticsBuffer}. */
    public static final int OVR_HAPTICS_BUFFER_SAMPLES_MAX = 256;

    /** External camera constants */
    public static final int
        OVR_MAX_EXTERNAL_CAMERA_COUNT = 16,
        OVR_EXTERNAL_CAMERA_NAME_SIZE = 32;

    /** Defines the largest size for an extension name string, including the '\0' terminator. */
    public static final int OVR_MAX_EXTENSION_NAME_SIZE = 128;

    /** Specifies the maximum number of layers supported by {@link #ovr_SubmitFrame SubmitFrame}. */
    public static final int ovrMaxLayerCount = 16;

    /**
     * Describes layer types that can be passed to {@link #ovr_SubmitFrame SubmitFrame}. ({@code ovrLayerType})
     * 
     * <p>Each layer type has an associated struct, such as {@link OVRLayerEyeFov}.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrLayerType_Disabled LayerType_Disabled} - Layer is disabled.</li>
     * <li>{@link #ovrLayerType_EyeFov LayerType_EyeFov} - Described by {@link OVRLayerEyeFov}.</li>
     * <li>{@link #ovrLayerType_EyeFovDepth LayerType_EyeFovDepth} - Described by {@link OVRLayerEyeFovDepth}.</li>
     * <li>{@link #ovrLayerType_Quad LayerType_Quad} - Described by {@link OVRLayerQuad}.</li>
     * <li>{@link #ovrLayerType_EyeMatrix LayerType_EyeMatrix} - Described by {@link OVRLayerEyeMatrix}.</li>
     * <li>{@link #ovrLayerType_EyeFovMultires LayerType_EyeFovMultires} - Described by {@link OVRLayerEyeFovMultires}.</li>
     * <li>{@link #ovrLayerType_Cylinder LayerType_Cylinder} - Described by {@link OVRLayerCylinder}.</li>
     * <li>{@link #ovrLayerType_Cube LayerType_Cube} - Described by {@link OVRLayerCube}.</li>
     * </ul>
     */
    public static final int
        ovrLayerType_Disabled       = 0,
        ovrLayerType_EyeFov         = 1,
        ovrLayerType_EyeFovDepth    = 2,
        ovrLayerType_Quad           = 3,
        ovrLayerType_EyeMatrix      = 5,
        ovrLayerType_EyeFovMultires = 7,
        ovrLayerType_Cylinder       = 8,
        ovrLayerType_Cube           = 10;

    /**
     * Identifies flags used by {@link OVRLayerHeader} and which are passed to {@link #ovr_SubmitFrame SubmitFrame}. ({@code ovrLayerFlags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrLayerFlag_HighQuality LayerFlag_HighQuality} - 
     * Enables 4x anisotropic sampling during the composition of the layer. The benefits are mostly visible at the periphery for high-frequency &amp;
     * high-contrast visuals. For best results consider combining this flag with an {@code ovrTextureSwapChain} that has mipmaps and instead of using
     * arbitrary sized textures, prefer texture sizes that are powers-of-two. Actual rendered viewport and doesn't necessarily have to fill the whole
     * texture.
     * </li>
     * <li>{@link #ovrLayerFlag_TextureOriginAtBottomLeft LayerFlag_TextureOriginAtBottomLeft} - the opposite is TopLeft. Generally this is false for D3D, true for OpenGL.</li>
     * <li>{@link #ovrLayerFlag_HeadLocked LayerFlag_HeadLocked} - 
     * Mark this surface as "headlocked", which means it is specified relative to the HMD and moves with it, rather than being specified relative to
     * sensor/torso space and remaining still while the head moves. What used to be {@code ovrLayerType_QuadHeadLocked} is now {@link #ovrLayerType_Quad LayerType_Quad} plus this
     * flag. However the flag can be applied to any layer type to achieve a similar effect.
     * </li>
     * </ul>
     */
    public static final int
        ovrLayerFlag_HighQuality               = 0x1,
        ovrLayerFlag_TextureOriginAtBottomLeft = 0x2,
        ovrLayerFlag_HeadLocked                = 0x4;

    /**
     * Describes eye texture layouts. Used with {@link OVRLayerEyeFovMultires}. ({@code ovrTextureLayout})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrTextureLayout_Rectilinear TextureLayout_Rectilinear} - Regular eyeFov layer.</li>
     * <li>{@link #ovrTextureLayout_Octilinear TextureLayout_Octilinear} - Octilinear extension must be enabled.</li>
     * </ul>
     */
    public static final int
        ovrTextureLayout_Rectilinear = 0,
        ovrTextureLayout_Octilinear  = 1;

    /**
     * Performance HUD enables the HMD user to see information critical to the real-time operation of the VR application such as latency timing, and CPU &amp;
     * GPU performance metrics.
     * 
     * <p>App can toggle performance HUD modes as such:</p>
     * 
     * <pre><code>
     * ovrPerfHudMode PerfHudMode = ovrPerfHud_LatencyTiming;
     * ovr_SetInt(session, OVR_PERF_HUD_MODE, (int)PerfHudMode);</code></pre>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrPerfHud_Off PerfHud_Off} - Turns off the performance HUD</li>
     * <li>{@link #ovrPerfHud_PerfSummary PerfHud_PerfSummary} - Shows performance summary and headroom</li>
     * <li>{@link #ovrPerfHud_LatencyTiming PerfHud_LatencyTiming} - Shows latency related timing info</li>
     * <li>{@link #ovrPerfHud_AppRenderTiming PerfHud_AppRenderTiming} - Shows render timing info for application</li>
     * <li>{@link #ovrPerfHud_CompRenderTiming PerfHud_CompRenderTiming} - Shows render timing info for OVR compositor</li>
     * <li>{@link #ovrPerfHud_AwsStats PerfHud_AwsStats} - Shows Async Spacewarp-specific info</li>
     * <li>{@link #ovrPerfHud_VersionInfo PerfHud_VersionInfo} - Shows SDK &amp; HMD version Info</li>
     * <li>{@link #ovrPerfHud_LinkPerf PerfHud_LinkPerf} - Shows Oculus Link performance.</li>
     * </ul>
     */
    public static final int
        ovrPerfHud_Off              = 0,
        ovrPerfHud_PerfSummary      = 1,
        ovrPerfHud_LatencyTiming    = 2,
        ovrPerfHud_AppRenderTiming  = 3,
        ovrPerfHud_CompRenderTiming = 4,
        ovrPerfHud_AwsStats         = 6,
        ovrPerfHud_VersionInfo      = 5,
        ovrPerfHud_LinkPerf         = 7;

    /**
     * Layer HUD enables the HMD user to see information about a layer.
     * 
     * <p>App can toggle layer HUD modes as such:</p>
     * 
     * <pre><code>
     * ovrLayerHudMode LayerHudMode = ovrLayerHud_Info;
     * ovr_SetInt(Hmd, OVR_LAYER_HUD_MODE, (int)LayerHudMode);</code></pre>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrLayerHud_Off LayerHud_Off} - Turns off the layer HUD</li>
     * <li>{@link #ovrLayerHud_Info LayerHud_Info} - Shows info about a specific layer</li>
     * </ul>
     */
    public static final int
        ovrLayerHud_Off  = 0,
        ovrLayerHud_Info = 1;

    /**
     * Debug HUD is provided to help developers gauge and debug the fidelity of their app's stereo rendering characteristics. Using the provided quad and
     * crosshair guides, the developer can verify various aspects such as VR tracking units (e.g. meters), stereo camera-parallax properties (e.g. making sure
     * objects at infinity are rendered with the proper separation), measuring VR geometry sizes and distances and more.
     * 
     * <p>App can toggle the debug HUD modes as such:</p>
     * 
     * <pre><code>
     * ovrDebugHudStereoMode DebugHudMode = ovrDebugHudStereo_QuadWithCrosshair;
     * ovr_SetInt(session, OVR_DEBUG_HUD_STEREO_MODE, (int)DebugHudMode);</code></pre>
     * 
     * <p>The app can modify the visual properties of the stereo guide (i.e. quad, crosshair) using the {@link #ovr_SetFloatArray SetFloatArray} function. For a list of tweakable
     * properties, see the {@code OVR_DEBUG_HUD_STEREO_GUIDE_*} keys in {@link OVRKeys}.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrDebugHudStereo_Off DebugHudStereo_Off} - Turns off the Stereo Debug HUD</li>
     * <li>{@link #ovrDebugHudStereo_Quad DebugHudStereo_Quad} - Renders Quad in world for Stereo Debugging</li>
     * <li>{@link #ovrDebugHudStereo_QuadWithCrosshair DebugHudStereo_QuadWithCrosshair} - Renders Quad+crosshair in world for Stereo Debugging</li>
     * <li>{@link #ovrDebugHudStereo_CrosshairAtInfinity DebugHudStereo_CrosshairAtInfinity} - Renders screen-space crosshair at infinity for Stereo Debugging</li>
     * </ul>
     */
    public static final int
        ovrDebugHudStereo_Off                 = 0,
        ovrDebugHudStereo_Quad                = 1,
        ovrDebugHudStereo_QuadWithCrosshair   = 2,
        ovrDebugHudStereo_CrosshairAtInfinity = 3;

    protected OVR() {
        throw new UnsupportedOperationException();
    }

    // --- [ ovr_Initialize ] ---

    /** Unsafe version of: {@link #ovr_Initialize Initialize} */
    public static native int novr_Initialize(long params);

    /**
     * Initialize LibOVR for application usage. This includes finding and loading the LibOVRRT shared library. No LibOVR API functions, other than
     * {@link #ovr_GetLastErrorInfo GetLastErrorInfo} and {@link OVRUtil#ovr_Detect _Detect}, can be called unless {@link #ovr_Initialize Initialize} succeeds. A successful call to {@code ovr_Initialize} must be eventually
     * followed by a call to {@link #ovr_Shutdown Shutdown}. {@code ovr_Initialize} calls are idempotent. Calling {@code ovr_Initialize} twice does not require two matching
     * calls to {@code ovr_Shutdown}. If already initialized, the return value is {@link OVRErrorCode#ovrSuccess Success}.
     * 
     * <p>LibOVRRT shared library search order:</p>
     * 
     * <ol>
     * <li>Current working directory (often the same as the application directory).</li>
     * <li>Module directory (usually the same as the application directory, but not if the module is a separate shared library).</li>
     * <li>Application directory</li>
     * <li>Development directory (only if OVR_ENABLE_DEVELOPER_SEARCH is enabled, which is off by default).</li>
     * <li>Standard OS shared library search location(s) (OS-specific).</li>
     * </ol>
     *
     * @param params specifies custom initialization options. May be {@code NULL} to indicate default options when using the CAPI shim. If you are directly calling the
     *               LibOVRRT version of {@code ovr_Initialize} in the LibOVRRT DLL then this must be valid and include {@link #ovrInit_RequestVersion Init_RequestVersion}.
     *
     * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link #ovr_GetLastErrorInfo GetLastErrorInfo} to get more information. Example failed results
     *         include:
     *         
     *         <ul>
     *         <li>{@link OVRErrorCode#ovrError_Initialize Error_Initialize}: Generic initialization error.</li>
     *         <li>{@link OVRErrorCode#ovrError_LibLoad Error_LibLoad}: Couldn't load LibOVRRT.</li>
     *         <li>{@link OVRErrorCode#ovrError_LibVersion Error_LibVersion}: LibOVRRT version incompatibility.</li>
     *         <li>{@link OVRErrorCode#ovrError_ServiceConnection Error_ServiceConnection}: Couldn't connect to the OVR Service.</li>
     *         <li>{@link OVRErrorCode#ovrError_ServiceVersion Error_ServiceVersion}: OVR Service version incompatibility.</li>
     *         <li>{@link OVRErrorCode#ovrError_IncompatibleOS Error_IncompatibleOS}: The operating system version is incompatible.</li>
     *         <li>{@link OVRErrorCode#ovrError_DisplayInit Error_DisplayInit}: Unable to initialize the HMD display.</li>
     *         <li>{@link OVRErrorCode#ovrError_ServerStart Error_ServerStart}:  Unable to start the server. Is it already running?</li>
     *         <li>{@link OVRErrorCode#ovrError_Reinitialization Error_Reinitialization}: Attempted to re-initialize with a different version.</li>
     *         </ul>
     */
    @NativeType("ovrResult")
    public static int ovr_Initialize(@Nullable @NativeType("ovrInitParams const *") OVRInitParams params) {
        return novr_Initialize(memAddressSafe(params));
    }

    // --- [ ovr_Shutdown ] ---

    /**
     * Shuts down LibOVR.
     * 
     * <p>A successful call to {@link #ovr_Initialize Initialize} must be eventually matched by a call to {@code ovr_Shutdown}. After calling {@code ovr_Shutdown}, no LibOVR
     * functions can be called except {@link #ovr_GetLastErrorInfo GetLastErrorInfo} or another {@link #ovr_Initialize Initialize}. {@code ovr_Shutdown} invalidates all pointers, references, and created
     * objects previously returned by LibOVR functions. The LibOVRRT shared library can be unloaded by {@code ovr_Shutdown}.</p>
     */
    public static native void ovr_Shutdown();

    // --- [ ovr_GetLastErrorInfo ] ---

    /** Unsafe version of: {@link #ovr_GetLastErrorInfo GetLastErrorInfo} */
    public static native void novr_GetLastErrorInfo(long errorInfo);

    /**
     * Returns information about the most recent failed return value by the current thread for this library.
     * 
     * <p>This function itself can never generate an error. The last error is never cleared by LibOVR, but will be overwritten by new errors. Do not use this
     * call to determine if there was an error in the last API call as successful API calls don't clear the last {@link OVRErrorInfo}. To avoid any inconsistency,
     * {@link #ovr_GetLastErrorInfo GetLastErrorInfo} should be called immediately after an API function that returned a failed {@code ovrResult}, with no other API functions called in
     * the interim.</p>
     *
     * @param errorInfo The last {@link OVRErrorInfo} for the current thread
     */
    public static void ovr_GetLastErrorInfo(@NativeType("ovrErrorInfo *") OVRErrorInfo errorInfo) {
        novr_GetLastErrorInfo(errorInfo.address());
    }

    // --- [ ovr_GetVersionString ] ---

    /** Unsafe version of: {@link #ovr_GetVersionString GetVersionString} */
    public static native long novr_GetVersionString();

    /**
     * Returns the version string representing the LibOVRRT version.
     * 
     * <p>The returned string pointer is valid until the next call to {@link #ovr_Shutdown Shutdown}.</p>
     * 
     * <p>Note that the returned version string doesn't necessarily match the current OVR_MAJOR_VERSION, etc., as the returned string refers to the LibOVRRT
     * shared library version and not the locally compiled interface version.</p>
     * 
     * <p>The format of this string is subject to change in future versions and its contents should not be interpreted.</p>
     *
     * @return a UTF8-encoded null-terminated version string
     */
    @NativeType("char const *")
    public static String ovr_GetVersionString() {
        long __result = novr_GetVersionString();
        return memUTF8(__result);
    }

    // --- [ ovr_TraceMessage ] ---

    /** Unsafe version of: {@link #ovr_TraceMessage TraceMessage} */
    public static native int novr_TraceMessage(int level, long message);

    /**
     * Writes a message string to the LibOVR tracing mechanism (if enabled).
     * 
     * <p>This message will be passed back to the application via the {@link OVRLogCallback} if it was registered.</p>
     *
     * @param level   an {@code ovrLogLevel} constant. One of:<br><table><tr><td>{@link #ovrLogLevel_Debug LogLevel_Debug}</td><td>{@link #ovrLogLevel_Info LogLevel_Info}</td><td>{@link #ovrLogLevel_Error LogLevel_Error}</td></tr></table>
     * @param message a UTF8-encoded null-terminated string
     *
     * @return the {@code strlen} of the message or a negative value if the message is too large
     */
    public static int ovr_TraceMessage(int level, @NativeType("char const *") ByteBuffer message) {
        if (CHECKS) {
            checkNT1(message);
        }
        return novr_TraceMessage(level, memAddress(message));
    }

    /**
     * Writes a message string to the LibOVR tracing mechanism (if enabled).
     * 
     * <p>This message will be passed back to the application via the {@link OVRLogCallback} if it was registered.</p>
     *
     * @param level   an {@code ovrLogLevel} constant. One of:<br><table><tr><td>{@link #ovrLogLevel_Debug LogLevel_Debug}</td><td>{@link #ovrLogLevel_Info LogLevel_Info}</td><td>{@link #ovrLogLevel_Error LogLevel_Error}</td></tr></table>
     * @param message a UTF8-encoded null-terminated string
     *
     * @return the {@code strlen} of the message or a negative value if the message is too large
     */
    public static int ovr_TraceMessage(int level, @NativeType("char const *") CharSequence message) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(message, true);
            long messageEncoded = stack.getPointerAddress();
            return novr_TraceMessage(level, messageEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_IdentifyClient ] ---

    /** Unsafe version of: {@link #ovr_IdentifyClient IdentifyClient} */
    public static native int novr_IdentifyClient(long identity);

    /**
     * Identifies client application info.
     * 
     * <p>The string is one or more newline-delimited lines of optional info indicating engine name, engine version, engine plugin name, engine plugin version,
     * engine editor. The order of the lines is not relevant. Individual lines are optional. A newline is not necessary at the end of the last line. Call
     * after {@link #ovr_Initialize Initialize} and before the first call to {@link #ovr_Create Create}. Each value is limited to 20 characters. Key names such as 'EngineName:', 'EngineVersion:'
     * do not count towards this limit.</p>
     * 
     * <pre><code>
     * EngineName: %s\n
     * EngineVersion: %s\n
     * EnginePluginName: %s\n
     * EnginePluginVersion: %s\n
     * EngineEditor: &lt;boolean&gt; ('true' or 'false')\n</code></pre>
     * 
     * <p>Example code:</p>
     * 
     * <pre><code>
     * ovr_IdentifyClient(
     *     "EngineName: Unity\n" +
     *     "EngineVersion: 5.3.3\n" +
     *     "EnginePluginName: OVRPlugin\n" +
     *     "EnginePluginVersion: 1.2.0\n" +
     *     "EngineEditor: true");</code></pre>
     *
     * @param identity specifies one or more newline-delimited lines of optional info
     */
    @NativeType("ovrResult")
    public static int ovr_IdentifyClient(@NativeType("char const *") ByteBuffer identity) {
        if (CHECKS) {
            checkNT1(identity);
        }
        return novr_IdentifyClient(memAddress(identity));
    }

    /**
     * Identifies client application info.
     * 
     * <p>The string is one or more newline-delimited lines of optional info indicating engine name, engine version, engine plugin name, engine plugin version,
     * engine editor. The order of the lines is not relevant. Individual lines are optional. A newline is not necessary at the end of the last line. Call
     * after {@link #ovr_Initialize Initialize} and before the first call to {@link #ovr_Create Create}. Each value is limited to 20 characters. Key names such as 'EngineName:', 'EngineVersion:'
     * do not count towards this limit.</p>
     * 
     * <pre><code>
     * EngineName: %s\n
     * EngineVersion: %s\n
     * EnginePluginName: %s\n
     * EnginePluginVersion: %s\n
     * EngineEditor: &lt;boolean&gt; ('true' or 'false')\n</code></pre>
     * 
     * <p>Example code:</p>
     * 
     * <pre><code>
     * ovr_IdentifyClient(
     *     "EngineName: Unity\n" +
     *     "EngineVersion: 5.3.3\n" +
     *     "EnginePluginName: OVRPlugin\n" +
     *     "EnginePluginVersion: 1.2.0\n" +
     *     "EngineEditor: true");</code></pre>
     *
     * @param identity specifies one or more newline-delimited lines of optional info
     */
    @NativeType("ovrResult")
    public static int ovr_IdentifyClient(@NativeType("char const *") CharSequence identity) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(identity, true);
            long identityEncoded = stack.getPointerAddress();
            return novr_IdentifyClient(identityEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_GetHmdColorDesc ] ---

    /** Unsafe version of: {@link #ovr_GetHmdColorDesc GetHmdColorDesc} */
    public static native void novr_GetHmdColorDesc(long session, long __result);

    /**
     * Returns native color space information about the current HMD.
     * 
     * <p>{@link #ovr_Initialize Initialize} must be called prior to calling this function, otherwise call will fail.</p>
     *
     * @param session  specifies an {@code ovrSession} previously returned by {@link #ovr_Create Create} or {@code NULL}
     * @param __result an {@code ovrHmdColorDesc}
     */
    public static ovrHmdColorDesc ovr_GetHmdColorDesc(@NativeType("ovrSession") long session, ovrHmdColorDesc __result) {
        novr_GetHmdColorDesc(session, __result.address());
        return __result;
    }

    // --- [ ovr_SetClientColorDesc ] ---

    /** Unsafe version of: {@link #ovr_SetClientColorDesc SetClientColorDesc} */
    public static native int novr_SetClientColorDesc(long session, long colorDesc);

    /**
     * Sets the color space actively being used by the client app.
     * 
     * <p>This value does not have to follow the color space provided in {@link #ovr_GetHmdColorDesc GetHmdColorDesc}. It should reflect the color space the final rendered frame the
     * client has submitted to the SDK. If this function is never called, the session will keep using the default color space deemed appropriate by the
     * runtime. See remarks in {@code ovrColorSpace} enum for more info on default behavior.</p>
     * 
     * <p>{@link #ovr_Initialize Initialize} must be called prior to calling this function, otherwise call will fail.</p>
     *
     * @param session   an {@code ovrSession} previously returned by {@link #ovr_Create Create} or {@code NULL}
     * @param colorDesc the color description to use for the current HMD
     *
     * @return an {@code ovrResult} indicating success or failure
     */
    @NativeType("ovrResult")
    public static int ovr_SetClientColorDesc(@NativeType("ovrSession") long session, @NativeType("ovrHmdColorDesc const *") ovrHmdColorDesc colorDesc) {
        if (CHECKS) {
            check(session);
        }
        return novr_SetClientColorDesc(session, colorDesc.address());
    }

    // --- [ ovr_GetHmdDesc ] ---

    /** Unsafe version of: {@link #ovr_GetHmdDesc GetHmdDesc} */
    public static native void novr_GetHmdDesc(long session, long __result);

    /**
     * Returns information about the current HMD.
     * 
     * <p>{@link #ovr_Initialize Initialize} must be called prior to calling this function, otherwise {@code ovrHmdDesc::Type} will be set to {@link #ovrHmd_None Hmd_None} without checking for the HMD
     * presence.</p>
     * 
     * <p>For newer headsets being used on a game built against an old SDK version, we may return the {@code ovrHmdType} as {@link #ovrHmd_CV1 Hmd_CV1} for backwards compatibility.</p>
     *
     * @param session  an {@code ovrSession} previously returned by {@link #ovr_Create Create} or {@code NULL}
     * @param __result an {@link OVRHmdDesc}. If invoked with {@code NULL} session argument, {@code ovrHmdDesc::Type} to {@link #ovrHmd_None Hmd_None} indicates that the HMD is not connected.
     */
    @NativeType("ovrHmdDesc")
    public static OVRHmdDesc ovr_GetHmdDesc(@NativeType("ovrSession") long session, @NativeType("ovrHmdDesc") OVRHmdDesc __result) {
        novr_GetHmdDesc(session, __result.address());
        return __result;
    }

    // --- [ ovr_GetTrackerCount ] ---

    /** Unsafe version of: {@link #ovr_GetTrackerCount GetTrackerCount} */
    public static native int novr_GetTrackerCount(long session);

    /**
     * Returns the number of attached trackers.
     * 
     * <p>The number of trackers may change at any time, so this function should be called before use as opposed to once on startup.</p>
     * 
     * <p>For newer headsets being used on a game built against an old SDK version, we may simulate three CV1 trackers to maintain backwards compatibility.</p>
     *
     * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     */
    @NativeType("unsigned int")
    public static int ovr_GetTrackerCount(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetTrackerCount(session);
    }

    // --- [ ovr_GetTrackerDesc ] ---

    /** Unsafe version of: {@link #ovr_GetTrackerDesc GetTrackerDesc} */
    public static native void novr_GetTrackerDesc(long session, int trackerDescIndex, long __result);

    /**
     * Returns a given attached tracker description.
     * 
     * <p>{@link #ovr_Initialize Initialize} must have first been called in order for this to succeed, otherwise the returned {@code trackerDescArray} will be zero-initialized. The
     * data returned by this function can change at runtime.</p>
     * 
     * <p>For newer headsets being used on a game built against an old SDK version, we may simulate three CV1 trackers to maintain backwards compatibility.</p>
     *
     * @param session          an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param trackerDescIndex a tracker index. The valid indexes are in the range of 0 to the tracker count returned by {@link #ovr_GetTrackerCount GetTrackerCount}.
     * @param __result         an {@link OVRTrackerDesc}. An empty {@code OVRTrackerDesc} will be returned if {@code trackerDescIndex} is out of range.
     */
    @NativeType("ovrTrackerDesc")
    public static OVRTrackerDesc ovr_GetTrackerDesc(@NativeType("ovrSession") long session, @NativeType("unsigned int") int trackerDescIndex, @NativeType("ovrTrackerDesc") OVRTrackerDesc __result) {
        if (CHECKS) {
            check(session);
        }
        novr_GetTrackerDesc(session, trackerDescIndex, __result.address());
        return __result;
    }

    // --- [ ovr_Create ] ---

    /** Unsafe version of: {@link #ovr_Create Create} */
    public static native int novr_Create(long pSession, long pLuid);

    /**
     * Creates a handle to a VR session.
     * 
     * <p>Upon success the returned {@code ovrSession} must be eventually freed with {@link #ovr_Destroy Destroy} when it is no longer needed. A second call to {@link #ovr_Create Create} will result
     * in an error return value if the previous session has not been destroyed.</p>
     *
     * @param pSession a pointer to an {@code ovrSession} which will be written to upon success
     * @param pLuid    a system specific graphics adapter identifier that locates which graphics adapter has the HMD attached. This must match the adapter used by the
     *                 application or no rendering output will be possible. This is important for stability on multi-adapter systems. An application that simply chooses
     *                 the default adapter will not run reliably on multi-adapter systems.
     *
     * @return an {@code ovrResult} indicating success or failure. Upon failure the returned {@code ovrSession} will be {@code NULL}.
     */
    @NativeType("ovrResult")
    public static int ovr_Create(@NativeType("ovrSession *") PointerBuffer pSession, @NativeType("ovrGraphicsLuid *") OVRGraphicsLuid pLuid) {
        if (CHECKS) {
            check(pSession, 1);
        }
        return novr_Create(memAddress(pSession), pLuid.address());
    }

    // --- [ ovr_Destroy ] ---

    /** Unsafe version of: {@link #ovr_Destroy Destroy} */
    public static native void novr_Destroy(long session);

    /**
     * Destroys the session.
     *
     * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     */
    public static void ovr_Destroy(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        novr_Destroy(session);
    }

    // --- [ ovr_GetSessionStatus ] ---

    /** Unsafe version of: {@link #ovr_GetSessionStatus GetSessionStatus} */
    public static native int novr_GetSessionStatus(long session, long sessionStatus);

    /**
     * Returns status information for the application.
     *
     * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param sessionStatus an {@link OVRSessionStatus} that is filled in
     */
    @NativeType("ovrResult")
    public static int ovr_GetSessionStatus(@NativeType("ovrSession") long session, @NativeType("ovrSessionStatus *") OVRSessionStatus sessionStatus) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetSessionStatus(session, sessionStatus.address());
    }

    // --- [ ovr_IsExtensionSupported ] ---

    /** Unsafe version of: {@link #ovr_IsExtensionSupported IsExtensionSupported} */
    public static native int novr_IsExtensionSupported(long session, int extension, long outExtensionSupported);

    /**
     * Queries extension support status.
     *
     * @param session               an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param extension             extension to query
     * @param outExtensionSupported set to extension support status. {@link #ovrTrue True} if supported.
     *
     * @return an {@code ovrResult} indicating success or failure. In the case of failure use {@link #ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
     */
    @NativeType("ovrResult")
    public static int ovr_IsExtensionSupported(@NativeType("ovrSession") long session, @NativeType("ovrExtensions") int extension, @NativeType("ovrBool *") ByteBuffer outExtensionSupported) {
        if (CHECKS) {
            check(session);
            check(outExtensionSupported, 1);
        }
        return novr_IsExtensionSupported(session, extension, memAddress(outExtensionSupported));
    }

    // --- [ ovr_EnableExtension ] ---

    /** Unsafe version of: {@link #ovr_EnableExtension EnableExtension} */
    public static native int novr_EnableExtension(long session, int extension);

    /**
     * Enable extension. Extensions must be enabled after {@link #ovr_Create Create} is called.
     *
     * @param session   an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param extension extension to enable.
     *
     * @return an {@code ovrResult} indicating success or failure. Extension is only enabled if successful. In the case of failure use {@link #ovr_GetLastErrorInfo GetLastErrorInfo} to get more
     *         information.
     */
    @NativeType("ovrResult")
    public static int ovr_EnableExtension(@NativeType("ovrSession") long session, @NativeType("ovrExtensions") int extension) {
        if (CHECKS) {
            check(session);
        }
        return novr_EnableExtension(session, extension);
    }

    // --- [ ovr_SetTrackingOriginType ] ---

    /** Unsafe version of: {@link #ovr_SetTrackingOriginType SetTrackingOriginType} */
    public static native int novr_SetTrackingOriginType(long session, int origin);

    /**
     * Sets the tracking origin type.
     * 
     * <p>When the tracking origin is changed, all of the calls that either provide or accept ovrPosef will use the new tracking origin provided.</p>
     *
     * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param origin  an {@code ovrTrackingOrigin} to be used for all {@link OVRPosef}
     */
    @NativeType("ovrResult")
    public static int ovr_SetTrackingOriginType(@NativeType("ovrSession") long session, @NativeType("ovrTrackingOrigin") int origin) {
        if (CHECKS) {
            check(session);
        }
        return novr_SetTrackingOriginType(session, origin);
    }

    // --- [ ovr_GetTrackingOriginType ] ---

    /** Unsafe version of: {@link #ovr_GetTrackingOriginType GetTrackingOriginType} */
    public static native int novr_GetTrackingOriginType(long session);

    /**
     * Gets the tracking origin state.
     *
     * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     */
    @NativeType("ovrTrackingOrigin")
    public static int ovr_GetTrackingOriginType(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetTrackingOriginType(session);
    }

    // --- [ ovr_RecenterTrackingOrigin ] ---

    /** Unsafe version of: {@link #ovr_RecenterTrackingOrigin RecenterTrackingOrigin} */
    public static native int novr_RecenterTrackingOrigin(long session);

    /**
     * Re-centers the sensor position and orientation.
     * 
     * <p>This resets the (x,y,z) positional components and the yaw orientation component of the tracking space for the HMD and controllers using the HMD's
     * current tracking pose. If the caller requires some tweaks on top of the HMD's current tracking pose, consider using {@link #ovr_SpecifyTrackingOrigin SpecifyTrackingOrigin} instead.</p>
     * 
     * <p>The roll and pitch orientation components are always determined by gravity and cannot be redefined. All future tracking will report values relative to
     * this new reference position. If you are using {@code ovrTrackerPoses} then you will need to call {@link #ovr_GetTrackerPose GetTrackerPose} after this, because the sensor
     * position(s) will change as a result of this.</p>
     * 
     * <p>The headset cannot be facing vertically upward or downward but rather must be roughly level otherwise this function will fail with
     * {@link OVRErrorCode#ovrError_InvalidHeadsetOrientation Error_InvalidHeadsetOrientation}.</p>
     * 
     * <p>For more info, see the notes on each {@code ovrTrackingOrigin} enumeration to understand how recenter will vary slightly in its behavior based on the
     * current {@code ovrTrackingOrigin} setting.</p>
     *
     * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     */
    @NativeType("ovrResult")
    public static int ovr_RecenterTrackingOrigin(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        return novr_RecenterTrackingOrigin(session);
    }

    // --- [ ovr_SpecifyTrackingOrigin ] ---

    /** Unsafe version of: {@link #ovr_SpecifyTrackingOrigin SpecifyTrackingOrigin} */
    public static native int novr_SpecifyTrackingOrigin(long session, long originPose);

    /**
     * Allows manually tweaking the sensor position and orientation.
     * 
     * <p>This function is similar to {@link #ovr_RecenterTrackingOrigin RecenterTrackingOrigin} in that it modifies the (x,y,z) positional components and the yaw orientation component of the
     * tracking space for the HMD and controllers.</p>
     * 
     * <p>While {@code ovr_RecenterTrackingOrigin} resets the tracking origin in reference to the HMD's current pose, {@code ovr_SpecifyTrackingOrigin} allows
     * the caller to explicitly specify a transform for the tracking origin. This transform is expected to be an offset to the most recent recentered origin,
     * so calling this function repeatedly with the same originPose will keep nudging the recentered origin in that direction.</p>
     * 
     * <p>There are several use cases for this function. For example, if the application decides to limit the yaw, or translation of the recentered pose instead
     * of directly using the HMD pose the application can query the current tracking state via {@link #ovr_GetTrackingState GetTrackingState}, and apply some limitations to the HMD pose
     * because feeding this pose back into this function. Similarly, this can be used to "adjust the seating position" incrementally in apps that feature
     * seated experiences such as cockpit-based games.</p>
     * 
     * <p>This function can emulate ovr_RecenterTrackingOrigin as such:</p>
     * 
     * <pre><code>
     * ovrTrackingState ts = ovr_GetTrackingState(session, 0.0, ovrFalse);
     * ovr_SpecifyTrackingOrigin(session, ts.HeadPose.ThePose);</code></pre>
     * 
     * <p>The roll and pitch orientation components are determined by gravity and cannot be redefined. If you are using {@code ovrTrackerPoses} then you will
     * need to call {@link #ovr_GetTrackerPose GetTrackerPose} after this, because the sensor position(s) will change as a result of this.</p>
     * 
     * <p>For more info, see the notes on each {@code ovrTrackingOrigin} enumeration to understand how recenter will vary slightly in its behavior based on the
     * current {@code ovrTrackingOrigin} setting.</p>
     *
     * @param session    an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param originPose specifies a pose that will be used to transform the current tracking origin
     */
    @NativeType("ovrResult")
    public static int ovr_SpecifyTrackingOrigin(@NativeType("ovrSession") long session, @NativeType("ovrPosef") OVRPosef originPose) {
        if (CHECKS) {
            check(session);
        }
        return novr_SpecifyTrackingOrigin(session, originPose.address());
    }

    // --- [ ovr_ClearShouldRecenterFlag ] ---

    /** Unsafe version of: {@link #ovr_ClearShouldRecenterFlag ClearShouldRecenterFlag} */
    public static native void novr_ClearShouldRecenterFlag(long session);

    /**
     * Clears the {@code ShouldRecenter} status bit in {@link OVRSessionStatus}.
     * 
     * <p>Clears the {@code ShouldRecenter} status bit in {@link OVRSessionStatus}, allowing further recenter requests to be detected. Since this is automatically done
     * by {@link #ovr_RecenterTrackingOrigin RecenterTrackingOrigin} and {@link #ovr_SpecifyTrackingOrigin SpecifyTrackingOrigin}, this function only needs to be called when application is doing its own re-centering logic.</p>
     *
     * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     */
    public static void ovr_ClearShouldRecenterFlag(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        novr_ClearShouldRecenterFlag(session);
    }

    // --- [ ovr_GetTrackingState ] ---

    /** Unsafe version of: {@link #ovr_GetTrackingState GetTrackingState} */
    public static native void novr_GetTrackingState(long session, double absTime, boolean latencyMarker, long __result);

    /**
     * Returns tracking state reading based on the specified absolute system time.
     * 
     * <p>Pass an {@code absTime} value of 0.0 to request the most recent sensor reading. In this case both {@code PredictedPose} and {@code SamplePose} will
     * have the same value.</p>
     * 
     * <p>This may also be used for more refined timing of front buffer rendering logic, and so on.</p>
     * 
     * <p>This may be called by multiple threads.</p>
     *
     * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param absTime       the absolute future time to predict the return {@link OVRTrackingState} value. Use 0 to request the most recent tracking state.
     * @param latencyMarker specifies that this call is the point in time where the "App-to-Mid-Photon" latency timer starts from. If a given {@code ovrLayer} provides
     *                      "SensorSampleTime", that will override the value stored here.
     * @param __result      the {@link OVRTrackingState} that is predicted for the given {@code absTime}
     */
    @NativeType("ovrTrackingState")
    public static OVRTrackingState ovr_GetTrackingState(@NativeType("ovrSession") long session, double absTime, @NativeType("ovrBool") boolean latencyMarker, @NativeType("ovrTrackingState") OVRTrackingState __result) {
        if (CHECKS) {
            check(session);
        }
        novr_GetTrackingState(session, absTime, latencyMarker, __result.address());
        return __result;
    }

    // --- [ ovr_GetDevicePoses ] ---

    /**
     * Unsafe version of: {@link #ovr_GetDevicePoses GetDevicePoses}
     *
     * @param deviceCount number of queried poses. This number must match the length of the {@code outDevicePoses} and {@code deviceTypes} array.
     */
    public static native int novr_GetDevicePoses(long session, long deviceTypes, int deviceCount, double absTime, long outDevicePoses);

    /**
     * Returns an array of poses, where each pose matches a device type provided by the {@code deviceTypes} array parameter.
     * 
     * <p>If any pose cannot be retrieved, it will return a reason for the missing pose and the device pose will be zeroed out with a pose quaternion
     * {@code [x=0, y=0, z=0, w=1]}.</p>
     *
     * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param deviceTypes    array of device types to query for their poses
     * @param absTime        specifies the absolute future time to predict the return {@code ovrTrackingState} value. Use 0 to request the most recent tracking state.
     * @param outDevicePoses array of poses, one for each device type in {@code deviceTypes} arrays
     *
     * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success
     */
    @NativeType("ovrResult")
    public static int ovr_GetDevicePoses(@NativeType("ovrSession") long session, @NativeType("ovrTrackedDeviceType *") IntBuffer deviceTypes, double absTime, @NativeType("ovrPoseStatef *") OVRPoseStatef.Buffer outDevicePoses) {
        if (CHECKS) {
            check(session);
            check(outDevicePoses, deviceTypes.remaining());
        }
        return novr_GetDevicePoses(session, memAddress(deviceTypes), deviceTypes.remaining(), absTime, outDevicePoses.address());
    }

    // --- [ ovr_GetTrackerPose ] ---

    /** Unsafe version of: {@link #ovr_GetTrackerPose GetTrackerPose} */
    public static native void novr_GetTrackerPose(long session, int trackerPoseIndex, long __result);

    /**
     * Returns the {@link OVRTrackerPose} for the given attached tracker.
     * 
     * <p>For newer headsets being used on a game built against an old SDK version, we may simulate three CV1 trackers to maintain backwards compatibility.</p>
     *
     * @param session          an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param trackerPoseIndex index of the tracker being requested.
     */
    @NativeType("ovrTrackerPose")
    public static OVRTrackerPose ovr_GetTrackerPose(@NativeType("ovrSession") long session, @NativeType("unsigned int") int trackerPoseIndex, @NativeType("ovrTrackerPose") OVRTrackerPose __result) {
        if (CHECKS) {
            check(session);
        }
        novr_GetTrackerPose(session, trackerPoseIndex, __result.address());
        return __result;
    }

    // --- [ ovr_GetInputState ] ---

    /** Unsafe version of: {@link #ovr_GetInputState GetInputState} */
    public static native int novr_GetInputState(long session, int controllerType, long inputState);

    /**
     * Returns the most recent input state for controllers, without positional tracking info. Developers can tell whether the same state was returned by
     * checking the {@code PacketNumber}.
     *
     * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param controllerType which controllers the input will be returned for
     * @param inputState     the input state that will be filled in
     *
     * @return {@link OVRErrorCode#ovrSuccess Success} if the new state was successfully obtained
     */
    @NativeType("ovrResult")
    public static int ovr_GetInputState(@NativeType("ovrSession") long session, @NativeType("ovrControllerType") int controllerType, @NativeType("ovrInputState *") OVRInputState inputState) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetInputState(session, controllerType, inputState.address());
    }

    // --- [ ovr_GetConnectedControllerTypes ] ---

    /** Unsafe version of: {@link #ovr_GetConnectedControllerTypes GetConnectedControllerTypes} */
    public static native int novr_GetConnectedControllerTypes(long session);

    /**
     * Returns controller types connected to the system OR'ed together.
     *
     * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     */
    @NativeType("unsigned int")
    public static int ovr_GetConnectedControllerTypes(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetConnectedControllerTypes(session);
    }

    // --- [ ovr_GetTouchHapticsDesc ] ---

    /** Unsafe version of: {@link #ovr_GetTouchHapticsDesc GetTouchHapticsDesc} */
    public static native void novr_GetTouchHapticsDesc(long session, int controllerType, long __result);

    /**
     * Gets information about Haptics engine for the specified Touch controller.
     *
     * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param controllerType the controller to retrieve the information from
     * @param __result       an {@link OVRTouchHapticsDesc}
     */
    @NativeType("ovrTouchHapticsDesc")
    public static OVRTouchHapticsDesc ovr_GetTouchHapticsDesc(@NativeType("ovrSession") long session, @NativeType("ovrControllerType") int controllerType, @NativeType("ovrTouchHapticsDesc") OVRTouchHapticsDesc __result) {
        if (CHECKS) {
            check(session);
        }
        novr_GetTouchHapticsDesc(session, controllerType, __result.address());
        return __result;
    }

    // --- [ ovr_SetControllerVibration ] ---

    /** Unsafe version of: {@link #ovr_SetControllerVibration SetControllerVibration} */
    public static native int novr_SetControllerVibration(long session, int controllerType, float frequency, float amplitude);

    /**
     * Sets constant vibration (with specified frequency and amplitude) to a controller.
     * 
     * <p>Note: {@code ovr_SetControllerVibration} cannot be used interchangeably with {@link #ovr_SubmitControllerVibration SubmitControllerVibration}.</p>
     * 
     * <p>This method should be called periodically, vibration lasts for a maximum of 2.5 seconds.</p>
     *
     * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param controllerType the controller to set the vibration to
     * @param frequency      the vibration frequency. Supported values are: 0.0 (disabled), 0.5 and 1.0. Non valid values will be clamped.
     * @param amplitude      the vibration amplitude in the {@code [0.0, 1.0]} range
     *
     * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
     *         
     *         <ul>
     *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
     *         <li>{@link OVRErrorCode#ovrSuccess_DeviceUnavailable Success_DeviceUnavailable}: The call succeeded but the device referred to by {@code controllerType} is not available.</li>
     *         </ul>
     */
    @NativeType("ovrResult")
    public static int ovr_SetControllerVibration(@NativeType("ovrSession") long session, @NativeType("ovrControllerType") int controllerType, float frequency, float amplitude) {
        if (CHECKS) {
            check(session);
        }
        return novr_SetControllerVibration(session, controllerType, frequency, amplitude);
    }

    // --- [ ovr_SubmitControllerVibration ] ---

    /** Unsafe version of: {@link #ovr_SubmitControllerVibration SubmitControllerVibration} */
    public static native int novr_SubmitControllerVibration(long session, int controllerType, long buffer);

    /**
     * Submits a Haptics buffer (used for vibration) to Touch (only) controllers.
     * 
     * <p>Note: {@code ovr_SubmitControllerVibration} cannot be used interchangeably with {@link #ovr_SetControllerVibration SetControllerVibration}.</p>
     *
     * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param controllerType the controller where the Haptics buffer will be played
     * @param buffer         the Haptics buffer containing amplitude samples to be played
     *
     * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
     *         
     *         <ul>
     *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
     *         <li>{@link OVRErrorCode#ovrSuccess_DeviceUnavailable Success_DeviceUnavailable}: The call succeeded but the device referred to by {@code controllerType} is not available.</li>
     *         </ul>
     */
    @NativeType("ovrResult")
    public static int ovr_SubmitControllerVibration(@NativeType("ovrSession") long session, @NativeType("ovrControllerType") int controllerType, @NativeType("ovrHapticsBuffer const *") OVRHapticsBuffer buffer) {
        if (CHECKS) {
            check(session);
            OVRHapticsBuffer.validate(buffer.address());
        }
        return novr_SubmitControllerVibration(session, controllerType, buffer.address());
    }

    // --- [ ovr_GetControllerVibrationState ] ---

    /** Unsafe version of: {@link #ovr_GetControllerVibrationState GetControllerVibrationState} */
    public static native int novr_GetControllerVibrationState(long session, int controllerType, long outState);

    /**
     * Gets the Haptics engine playback state of a specific Touch controller.
     *
     * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param controllerType the controller where the Haptics buffer will be played
     * @param outState       the state of the haptics engine
     *
     * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
     *         
     *         <ul>
     *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
     *         <li>{@link OVRErrorCode#ovrSuccess_DeviceUnavailable Success_DeviceUnavailable}: The call succeeded but the device referred to by {@code controllerType} is not available.</li>
     *         </ul>
     */
    @NativeType("ovrResult")
    public static int ovr_GetControllerVibrationState(@NativeType("ovrSession") long session, @NativeType("ovrControllerType") int controllerType, @NativeType("ovrHapticsPlaybackState *") OVRHapticsPlaybackState outState) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetControllerVibrationState(session, controllerType, outState.address());
    }

    // --- [ ovr_TestBoundary ] ---

    /** Unsafe version of: {@link #ovr_TestBoundary TestBoundary} */
    public static native int novr_TestBoundary(long session, int deviceBitmask, int boundaryType, long outTestResult);

    /**
     * Tests collision/proximity of position tracked devices (e.g. HMD and/or Touch) against the Boundary System.
     * 
     * <p>Note: this method is similar to {@link #ovr_TestBoundaryPoint TestBoundaryPoint} but can be more precise as it may take into account device acceleration/momentum.</p>
     *
     * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param deviceBitmask bitmask of one or more tracked devices to test. One or more of:<br><table><tr><td>{@link #ovrTrackedDevice_None TrackedDevice_None}</td><td>{@link #ovrTrackedDevice_HMD TrackedDevice_HMD}</td><td>{@link #ovrTrackedDevice_LTouch TrackedDevice_LTouch}</td><td>{@link #ovrTrackedDevice_RTouch TrackedDevice_RTouch}</td></tr><tr><td>{@link #ovrTrackedDevice_Touch TrackedDevice_Touch}</td><td>{@link #ovrTrackedDevice_Object0 TrackedDevice_Object0}</td><td>{@link #ovrTrackedDevice_Object1 TrackedDevice_Object1}</td><td>{@link #ovrTrackedDevice_Object2 TrackedDevice_Object2}</td></tr><tr><td>{@link #ovrTrackedDevice_Object3 TrackedDevice_Object3}</td><td>{@link #ovrTrackedDevice_All TrackedDevice_All}</td></tr></table>
     * @param boundaryType  the boundary type. One of:<br><table><tr><td>{@link #ovrBoundary_Outer Boundary_Outer}</td><td>{@link #ovrBoundary_PlayArea Boundary_PlayArea}</td></tr></table>
     * @param outTestResult result of collision/proximity test, contains information such as distance and closest point
     *
     * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
     *         
     *         <ul>
     *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
     *         <li>{@link OVRErrorCode#ovrSuccess_BoundaryInvalid Success_BoundaryInvalid}: The call succeeded but the result is not a valid boundary due to not being set up.</li>
     *         <li>{@link OVRErrorCode#ovrSuccess_DeviceUnavailable Success_DeviceUnavailable}: The call succeeded but the device referred to by {@code deviceBitmask} is not available.</li>
     *         </ul>
     */
    @NativeType("ovrResult")
    public static int ovr_TestBoundary(@NativeType("ovrSession") long session, @NativeType("ovrTrackedDeviceType") int deviceBitmask, @NativeType("ovrBoundaryType") int boundaryType, @NativeType("ovrBoundaryTestResult *") OVRBoundaryTestResult outTestResult) {
        if (CHECKS) {
            check(session);
        }
        return novr_TestBoundary(session, deviceBitmask, boundaryType, outTestResult.address());
    }

    // --- [ ovr_TestBoundaryPoint ] ---

    /** Unsafe version of: {@link #ovr_TestBoundaryPoint TestBoundaryPoint} */
    public static native int novr_TestBoundaryPoint(long session, long point, int singleBoundaryType, long outTestResult);

    /**
     * Tests collision/proximity of a 3D point against the Boundary System.
     *
     * @param session            an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param point              the 3D point to test
     * @param singleBoundaryType the boundary type. One of:<br><table><tr><td>{@link #ovrBoundary_Outer Boundary_Outer}</td><td>{@link #ovrBoundary_PlayArea Boundary_PlayArea}</td></tr></table>
     * @param outTestResult      result of collision/proximity test, contains information such as distance and closest point
     *
     * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
     *         
     *         <ul>
     *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
     *         <li>{@link OVRErrorCode#ovrSuccess_BoundaryInvalid Success_BoundaryInvalid}: The call succeeded but the result is not a valid boundary due to not being set up.</li>
     *         </ul>
     */
    @NativeType("ovrResult")
    public static int ovr_TestBoundaryPoint(@NativeType("ovrSession") long session, @NativeType("ovrVector3f const *") OVRVector3f point, @NativeType("ovrBoundaryType") int singleBoundaryType, @NativeType("ovrBoundaryTestResult *") OVRBoundaryTestResult outTestResult) {
        if (CHECKS) {
            check(session);
        }
        return novr_TestBoundaryPoint(session, point.address(), singleBoundaryType, outTestResult.address());
    }

    // --- [ ovr_SetBoundaryLookAndFeel ] ---

    /** Unsafe version of: {@link #ovr_SetBoundaryLookAndFeel SetBoundaryLookAndFeel} */
    public static native int novr_SetBoundaryLookAndFeel(long session, long lookAndFeel);

    /**
     * Compatibility stub.
     * 
     * <p>Deprecated: previously set the look and feel of the Boundary System - this functionality has been removed.</p>
     *
     * @param session     an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param lookAndFeel the look and feel parameters
     *
     * @return {@link OVRErrorCode#ovrSuccess Success} upon success
     */
    @NativeType("ovrResult")
    public static int ovr_SetBoundaryLookAndFeel(@NativeType("ovrSession") long session, @NativeType("ovrBoundaryLookAndFeel const *") OVRBoundaryLookAndFeel lookAndFeel) {
        if (CHECKS) {
            check(session);
        }
        return novr_SetBoundaryLookAndFeel(session, lookAndFeel.address());
    }

    // --- [ ovr_ResetBoundaryLookAndFeel ] ---

    /** Unsafe version of: {@link #ovr_ResetBoundaryLookAndFeel ResetBoundaryLookAndFeel} */
    public static native int novr_ResetBoundaryLookAndFeel(long session);

    /**
     * Resets the look and feel of the Boundary System to its default state.
     *
     * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     *
     * @return {@link OVRErrorCode#ovrSuccess Success} upon success
     */
    @NativeType("ovrResult")
    public static int ovr_ResetBoundaryLookAndFeel(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        return novr_ResetBoundaryLookAndFeel(session);
    }

    // --- [ ovr_GetBoundaryGeometry ] ---

    /** Unsafe version of: {@link #ovr_GetBoundaryGeometry GetBoundaryGeometry} */
    public static native int novr_GetBoundaryGeometry(long session, int boundaryType, long outFloorPoints, long outFloorPointsCount);

    /**
     * Gets the geometry of the Boundary System's "play area" or "outer boundary" as 3D floor points.
     *
     * @param session             an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param boundaryType        the boundary type. One of:<br><table><tr><td>{@link #ovrBoundary_Outer Boundary_Outer}</td><td>{@link #ovrBoundary_PlayArea Boundary_PlayArea}</td></tr></table>
     * @param outFloorPoints      an array of 3D points (in clockwise order) defining the boundary at floor height (can be {@code NULL} to retrieve only the number of points)
     * @param outFloorPointsCount the number of 3D points returned in the array
     *
     * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
     *         
     *         <ul>
     *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
     *         <li>{@link OVRErrorCode#ovrSuccess_BoundaryInvalid Success_BoundaryInvalid}: The call succeeded but the result is not a valid boundary due to not being set up.</li>
     *         </ul>
     */
    @NativeType("ovrResult")
    public static int ovr_GetBoundaryGeometry(@NativeType("ovrSession") long session, @NativeType("ovrBoundaryType") int boundaryType, @Nullable @NativeType("ovrVector3f *") OVRVector3f outFloorPoints, @Nullable @NativeType("int *") IntBuffer outFloorPointsCount) {
        if (CHECKS) {
            check(session);
            checkSafe(outFloorPointsCount, 1);
        }
        return novr_GetBoundaryGeometry(session, boundaryType, memAddressSafe(outFloorPoints), memAddressSafe(outFloorPointsCount));
    }

    // --- [ ovr_GetBoundaryDimensions ] ---

    /** Unsafe version of: {@link #ovr_GetBoundaryDimensions GetBoundaryDimensions} */
    public static native int novr_GetBoundaryDimensions(long session, int boundaryType, long outDimensions);

    /**
     * Gets the dimension of the Boundary System's "play area" or "outer boundary".
     *
     * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param boundaryType  the boundary type. One of:<br><table><tr><td>{@link #ovrBoundary_Outer Boundary_Outer}</td><td>{@link #ovrBoundary_PlayArea Boundary_PlayArea}</td></tr></table>
     * @param outDimensions dimensions of the axis aligned bounding box that encloses the area in meters (width, height and length)
     *
     * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
     *         
     *         <ul>
     *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
     *         <li>{@link OVRErrorCode#ovrSuccess_BoundaryInvalid Success_BoundaryInvalid}: The call succeeded but the result is not a valid boundary due to not being set up.</li>
     *         </ul>
     */
    @NativeType("ovrResult")
    public static int ovr_GetBoundaryDimensions(@NativeType("ovrSession") long session, @NativeType("ovrBoundaryType") int boundaryType, @NativeType("ovrVector3f *") OVRVector3f outDimensions) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetBoundaryDimensions(session, boundaryType, outDimensions.address());
    }

    // --- [ ovr_GetBoundaryVisible ] ---

    /** Unsafe version of: {@link #ovr_GetBoundaryVisible GetBoundaryVisible} */
    public static native int novr_GetBoundaryVisible(long session, long outIsVisible);

    /**
     * Returns if the boundary is currently visible.
     * 
     * <p>Note: visibility is false if the user has turned off boundaries, otherwise, it's true if the app has requested boundaries to be visible or if any
     * tracked device is currently triggering it. This may not exactly match rendering due to fade-in and fade-out effects.</p>
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param outIsVisible {@link #ovrTrue True}, if the boundary is visible
     *
     * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
     *         
     *         <ul>
     *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
     *         <li>{@link OVRErrorCode#ovrSuccess_BoundaryInvalid Success_BoundaryInvalid}: The call succeeded but the result is not a valid boundary due to not being set up.</li>
     *         </ul>
     */
    @NativeType("ovrResult")
    public static int ovr_GetBoundaryVisible(@NativeType("ovrSession") long session, @NativeType("ovrBool *") ByteBuffer outIsVisible) {
        if (CHECKS) {
            check(session);
            check(outIsVisible, 1);
        }
        return novr_GetBoundaryVisible(session, memAddress(outIsVisible));
    }

    // --- [ ovr_RequestBoundaryVisible ] ---

    /** Unsafe version of: {@link #ovr_RequestBoundaryVisible RequestBoundaryVisible} */
    public static native int novr_RequestBoundaryVisible(long session, boolean visible);

    /**
     * Requests boundary to be visible.
     *
     * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param visible forces the outer boundary to be visible. An application can't force it to be invisible, but can cancel its request by passing false.
     *
     * @return {@link OVRErrorCode#ovrSuccess Success} upon success
     */
    @NativeType("ovrResult")
    public static int ovr_RequestBoundaryVisible(@NativeType("ovrSession") long session, @NativeType("ovrBool") boolean visible) {
        if (CHECKS) {
            check(session);
        }
        return novr_RequestBoundaryVisible(session, visible);
    }

    // --- [ ovr_GetExternalCameras ] ---

    /**
     * Unsafe version of: {@link #ovr_GetExternalCameras GetExternalCameras}
     *
     * @param inoutCameraCount supply the array capacity, will return the actual \\# of cameras defined. If {@code *inoutCameraCount} is too small, will return
     *                         {@link OVRErrorCode#ovrError_InsufficientArraySize Error_InsufficientArraySize}.
     */
    public static native int novr_GetExternalCameras(long session, long cameras, long inoutCameraCount);

    /**
     * Returns the number of camera properties of all cameras
     *
     * @param session          an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param cameras          pointer to the array. If null and the provided array capacity is sufficient, will return {@code ovrError_NullArrayPointer}.
     * @param inoutCameraCount supply the array capacity, will return the actual \\# of cameras defined. If {@code *inoutCameraCount} is too small, will return
     *                         {@link OVRErrorCode#ovrError_InsufficientArraySize Error_InsufficientArraySize}.
     *
     * @return the list of external cameras the system knows about. Returns {@link OVRErrorCode#ovrError_NoExternalCameraInfo Error_NoExternalCameraInfo} if there is not any external camera information.
     */
    @NativeType("ovrResult")
    public static int ovr_GetExternalCameras(@NativeType("ovrSession") long session, @Nullable @NativeType("ovrExternalCamera *") OVRExternalCamera.Buffer cameras, @NativeType("unsigned int *") IntBuffer inoutCameraCount) {
        if (CHECKS) {
            check(session);
            check(inoutCameraCount, 1);
            checkSafe(cameras, inoutCameraCount.get(inoutCameraCount.position()));
        }
        return novr_GetExternalCameras(session, memAddressSafe(cameras), memAddress(inoutCameraCount));
    }

    // --- [ ovr_SetExternalCameraProperties ] ---

    /** Unsafe version of: {@link #ovr_SetExternalCameraProperties SetExternalCameraProperties} */
    public static native int novr_SetExternalCameraProperties(long session, long name, long intrinsics, long extrinsics);

    /**
     * Sets the camera intrinsics and/or extrinsics stored for the {@code cameraName} camera.
     * 
     * <p>Names must be &lt; 32 characters and null-terminated.</p>
     *
     * @param session    an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param name       specifies which camera to set the intrinsics or extrinsics for. The name must be at most {@link #OVR_EXTERNAL_CAMERA_NAME_SIZE} - 1 characters. Otherwise,
     *                   {@link OVRErrorCode#ovrError_ExternalCameraNameWrongSize Error_ExternalCameraNameWrongSize} is returned.
     * @param intrinsics contains the intrinsic parameters to set, can be null
     * @param extrinsics ontains the extrinsic parameters to set, can be null
     *
     * @return {@link OVRErrorCode#ovrSuccess Success} or an {@code ovrError} code
     */
    @NativeType("ovrResult")
    public static int ovr_SetExternalCameraProperties(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer name, @NativeType("ovrCameraIntrinsics const * const") OVRCameraIntrinsics intrinsics, @NativeType("ovrCameraExtrinsics const * const") OVRCameraExtrinsics extrinsics) {
        if (CHECKS) {
            check(session);
            checkNT1(name);
        }
        return novr_SetExternalCameraProperties(session, memAddress(name), intrinsics.address(), extrinsics.address());
    }

    /**
     * Sets the camera intrinsics and/or extrinsics stored for the {@code cameraName} camera.
     * 
     * <p>Names must be &lt; 32 characters and null-terminated.</p>
     *
     * @param session    an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param name       specifies which camera to set the intrinsics or extrinsics for. The name must be at most {@link #OVR_EXTERNAL_CAMERA_NAME_SIZE} - 1 characters. Otherwise,
     *                   {@link OVRErrorCode#ovrError_ExternalCameraNameWrongSize Error_ExternalCameraNameWrongSize} is returned.
     * @param intrinsics contains the intrinsic parameters to set, can be null
     * @param extrinsics ontains the extrinsic parameters to set, can be null
     *
     * @return {@link OVRErrorCode#ovrSuccess Success} or an {@code ovrError} code
     */
    @NativeType("ovrResult")
    public static int ovr_SetExternalCameraProperties(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence name, @NativeType("ovrCameraIntrinsics const * const") OVRCameraIntrinsics intrinsics, @NativeType("ovrCameraExtrinsics const * const") OVRCameraExtrinsics extrinsics) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return novr_SetExternalCameraProperties(session, nameEncoded, intrinsics.address(), extrinsics.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_GetTextureSwapChainLength ] ---

    /** Unsafe version of: {@link #ovr_GetTextureSwapChainLength GetTextureSwapChainLength} */
    public static native int novr_GetTextureSwapChainLength(long session, long chain, long out_Length);

    /**
     * Gets the number of buffers in an {@code ovrTextureSwapChain}.
     *
     * @param session    an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param chain      the {@code ovrTextureSwapChain} for which the length should be retrieved
     * @param out_Length returns the number of buffers in the specified chain
     */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainLength(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, @NativeType("int *") IntBuffer out_Length) {
        if (CHECKS) {
            check(session);
            check(chain);
            check(out_Length, 1);
        }
        return novr_GetTextureSwapChainLength(session, chain, memAddress(out_Length));
    }

    // --- [ ovr_GetTextureSwapChainCurrentIndex ] ---

    /** Unsafe version of: {@link #ovr_GetTextureSwapChainCurrentIndex GetTextureSwapChainCurrentIndex} */
    public static native int novr_GetTextureSwapChainCurrentIndex(long session, long chain, long out_Index);

    /**
     * Gets the current index in an {@code ovrTextureSwapChain}.
     *
     * @param session   an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param chain     the {@code ovrTextureSwapChain} for which the index should be retrieved
     * @param out_Index returns the current (free) index in specified chain
     */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainCurrentIndex(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, @NativeType("int *") IntBuffer out_Index) {
        if (CHECKS) {
            check(session);
            check(chain);
            check(out_Index, 1);
        }
        return novr_GetTextureSwapChainCurrentIndex(session, chain, memAddress(out_Index));
    }

    // --- [ ovr_GetTextureSwapChainDesc ] ---

    /** Unsafe version of: {@link #ovr_GetTextureSwapChainDesc GetTextureSwapChainDesc} */
    public static native int novr_GetTextureSwapChainDesc(long session, long chain, long out_Desc);

    /**
     * Gets the description of the buffers in an {@code ovrTextureSwapChain}.
     *
     * @param session  an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param chain    the {@code ovrTextureSwapChain} for which the description should be retrieved
     * @param out_Desc returns the description of the specified chain
     */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainDesc(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, @NativeType("ovrTextureSwapChainDesc *") OVRTextureSwapChainDesc out_Desc) {
        if (CHECKS) {
            check(session);
            check(chain);
        }
        return novr_GetTextureSwapChainDesc(session, chain, out_Desc.address());
    }

    // --- [ ovr_CommitTextureSwapChain ] ---

    /** Unsafe version of: {@link #ovr_CommitTextureSwapChain CommitTextureSwapChain} */
    public static native int novr_CommitTextureSwapChain(long session, long chain);

    /**
     * Commits any pending changes to an {@code ovrTextureSwapChain}, and advances its current index.
     * 
     * <p>When Commit is called, the texture at the current index is considered ready for use by the runtime, and further writes to it should be avoided. The
     * swap chain's current index is advanced, providing there's room in the chain. The next time the SDK dereferences this texture swap chain, it will
     * synchronize with the app's graphics context and pick up the submitted index, opening up room in the swap chain for further commits.</p>
     *
     * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param chain   the {@code ovrTextureSwapChain} to commit
     */
    @NativeType("ovrResult")
    public static int ovr_CommitTextureSwapChain(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain) {
        if (CHECKS) {
            check(session);
            check(chain);
        }
        return novr_CommitTextureSwapChain(session, chain);
    }

    // --- [ ovr_DestroyTextureSwapChain ] ---

    /** Unsafe version of: {@link #ovr_DestroyTextureSwapChain DestroyTextureSwapChain} */
    public static native void novr_DestroyTextureSwapChain(long session, long chain);

    /**
     * Destroys an {@code ovrTextureSwapChain} and frees all the resources associated with it.
     *
     * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param chain   the {@code ovrTextureSwapChain} to destroy. If it is {@code NULL} then this function has no effect.
     */
    public static void ovr_DestroyTextureSwapChain(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain) {
        if (CHECKS) {
            check(session);
        }
        novr_DestroyTextureSwapChain(session, chain);
    }

    // --- [ ovr_DestroyMirrorTexture ] ---

    /** Unsafe version of: {@link #ovr_DestroyMirrorTexture DestroyMirrorTexture} */
    public static native void novr_DestroyMirrorTexture(long session, long mirrorTexture);

    /**
     * Destroys a mirror texture previously created by one of the mirror texture creation functions.
     *
     * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param mirrorTexture the {@code ovrTexture} to destroy. If it is {@code NULL} then this function has no effect.
     */
    public static void ovr_DestroyMirrorTexture(@NativeType("ovrSession") long session, @NativeType("ovrMirrorTexture") long mirrorTexture) {
        if (CHECKS) {
            check(session);
        }
        novr_DestroyMirrorTexture(session, mirrorTexture);
    }

    // --- [ ovr_GetFovTextureSize ] ---

    /** Unsafe version of: {@link #ovr_GetFovTextureSize GetFovTextureSize} */
    public static native void novr_GetFovTextureSize(long session, int eye, long fov, float pixelsPerDisplayPixel, long __result);

    /**
     * Calculates the recommended viewport size for rendering a given eye within the HMD with a given FOV cone.
     * 
     * <p>Higher FOV will generally require larger textures to maintain quality. Apps packing multiple eye views together on the same texture should ensure there
     * are at least 8 pixels of padding between them to prevent texture filtering and chromatic aberration causing images to leak between the two eye views.</p>
     * 
     * <p>Example code:</p>
     * 
     * <pre><code>
     * ovrHmdDesc hmdDesc = ovr_GetHmdDesc(session);
     * ovrSizei eyeSizeLeft  = ovr_GetFovTextureSize(session, ovrEye_Left,  hmdDesc.DefaultEyeFov[ovrEye_Left],  1.0f);
     * ovrSizei eyeSizeRight = ovr_GetFovTextureSize(session, ovrEye_Right, hmdDesc.DefaultEyeFov[ovrEye_Right], 1.0f);</code></pre>
     *
     * @param session               an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param eye                   which eye (left or right) to calculate for. One of:<br><table><tr><td>{@link #ovrEye_Left Eye_Left}</td><td>{@link #ovrEye_Right Eye_Right}</td></tr></table>
     * @param fov                   the {@link OVRFovPort} to use
     * @param pixelsPerDisplayPixel the ratio of the number of render target pixels to display pixels at the center of distortion. 1.0 is the default value. Lower values can improve
     *                              performance, higher values give improved quality.
     * @param __result              the texture width and height size
     */
    @NativeType("ovrSizei")
    public static OVRSizei ovr_GetFovTextureSize(@NativeType("ovrSession") long session, @NativeType("ovrEyeType") int eye, @NativeType("ovrFovPort") OVRFovPort fov, float pixelsPerDisplayPixel, @NativeType("ovrSizei") OVRSizei __result) {
        if (CHECKS) {
            check(session);
        }
        novr_GetFovTextureSize(session, eye, fov.address(), pixelsPerDisplayPixel, __result.address());
        return __result;
    }

    // --- [ ovr_GetRenderDesc ] ---

    /** Unsafe version of: {@link #ovr_GetRenderDesc GetRenderDesc} */
    public static native void novr_GetRenderDesc(long session, int eyeType, long fov, long __result);

    /**
     * Computes the distortion viewport, view adjust, and other rendering parameters for the specified eye.
     *
     * @param session  an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param eyeType  which eye (left or right) for which to perform calculations. One of:<br><table><tr><td>{@link #ovrEye_Left Eye_Left}</td><td>{@link #ovrEye_Right Eye_Right}</td></tr></table>
     * @param fov      the {@link OVRFovPort} to use.
     * @param __result the computed {@link OVREyeRenderDesc} for the given {@code eyeType} and field of view
     */
    @NativeType("ovrEyeRenderDesc")
    public static OVREyeRenderDesc ovr_GetRenderDesc(@NativeType("ovrSession") long session, @NativeType("ovrEyeType") int eyeType, @NativeType("ovrFovPort") OVRFovPort fov, @NativeType("ovrEyeRenderDesc") OVREyeRenderDesc __result) {
        if (CHECKS) {
            check(session);
        }
        novr_GetRenderDesc(session, eyeType, fov.address(), __result.address());
        return __result;
    }

    // --- [ ovr_GetFovStencil ] ---

    /** Unsafe version of: {@link #ovr_GetFovStencil GetFovStencil} */
    public static native int novr_GetFovStencil(long session, long fovStencilDesc, long meshBuffer);

    /**
     * Returns a viewport stencil mesh to be used for defining the area or outline the user can see through the lens on an area defined by a given
     * {@code ovrFovPort}.
     * 
     * <p>To find out how big the vertex and index buffers in {@code meshBuffer} buffer should be, first call this function setting {@code AllocVertexCount}
     * &amp; {@code AllocIndexCount} to 0 while also sending in {@code nullptr} for {@code VertexBuffer} &amp; {@code IndexBuffer}. The SDK will populate
     * {@code UsedVertexCount} &amp; {@code UsedIndexCount} values.</p>
     * 
     * <p>If {@code Alloc*Count} fields in {@code meshBuffer} are smaller than the expected {@code Used*Count} fields, (except when they are 0) then the SDK will
     * return {@link OVRErrorCode#ovrError_InvalidParameter Error_InvalidParameter} and leave {@code VertexBuffer} and {@code IndexBuffer} untouched.</p>
     * 
     * <p>2D positions provided in the buffer will be in the {@code [0,1]} range where Y increases downward, similar to texture-UV space. If Y coordinates need
     * to be flipped upside down, use the {@link #ovrFovStencilFlag_MeshOriginAtBottomLeft FovStencilFlag_MeshOriginAtBottomLeft}.</p>
     *
     * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param fovStencilDesc info provided by caller necessary to generate a stencil mesh
     * @param meshBuffer     mesh buffer to be partially filled in and returned by the SDK
     *
     * @return an ovrResult indicating success or failure. In the case of failure, use {@link #ovr_GetLastErrorInfo GetLastErrorInfo} to get more information. Return values include but aren't
     *         limited to:
     *         
     *         <ul>
     *         <li>{@link OVRErrorCode#ovrSuccess Success}: Completed successfully.</li>
     *         <li>{@link OVRErrorCode#ovrError_ServiceConnection Error_ServiceConnection}: The service connection was lost and the application must destroy the session.</li>
     *         <li>{@link OVRErrorCode#ovrError_InvalidParameter Error_InvalidParameter}: One or more of the parameters</li>
     *         </ul>
     */
    @NativeType("ovrResult")
    public static int ovr_GetFovStencil(@NativeType("ovrSession") long session, @NativeType("ovrFovStencilDesc const *") OVRFovStencilDesc fovStencilDesc, @NativeType("ovrFovStencilMeshBuffer *") OVRFovStencilMeshBuffer meshBuffer) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetFovStencil(session, fovStencilDesc.address(), meshBuffer.address());
    }

    // --- [ ovr_WaitToBeginFrame ] ---

    /** Unsafe version of: {@link #ovr_WaitToBeginFrame WaitToBeginFrame} */
    public static native int novr_WaitToBeginFrame(long session, long frameIndex);

    /**
     * Waits until surfaces are available and it is time to begin rendering the frame. Must be called before {@link #ovr_BeginFrame BeginFrame}, but not necessarily from the same
     * thread.
     *
     * @param session    an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param frameIndex specifies the targeted application frame index
     *
     * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
     *         
     *         <ul>
     *         <li>{@link OVRErrorCode#ovrSuccess Success}: command completed successfully.</li>
     *         <li>{@link OVRErrorCode#ovrSuccess_NotVisible Success_NotVisible}: rendering of a previous frame completed successfully but was not displayed on the HMD, usually because another application
     *         currently has ownership of the HMD. Applications receiving this result should stop rendering new content and call {@link #ovr_GetSessionStatus GetSessionStatus} to detect
     *         visibility.</li>
     *         <li>{@link OVRErrorCode#ovrError_DisplayLost Error_DisplayLost}: The session has become invalid (such as due to a device removal) and the shared resources need to be released
     *         ({@link #ovr_DestroyTextureSwapChain DestroyTextureSwapChain}), the session needs to destroyed ({@link #ovr_Destroy Destroy}) and recreated ({@link #ovr_Create Create}), and new resources need to be created
     *         ({@code ovr_CreateTextureSwapChainXXX}). The application's existing private graphics resources do not need to be recreated unless the new
     *         {@code ovr_Create} call returns a different {@code GraphicsLuid}.</li>
     *         </ul>
     */
    @NativeType("ovrResult")
    public static int ovr_WaitToBeginFrame(@NativeType("ovrSession") long session, @NativeType("long long") long frameIndex) {
        if (CHECKS) {
            check(session);
        }
        return novr_WaitToBeginFrame(session, frameIndex);
    }

    // --- [ ovr_BeginFrame ] ---

    /** Unsafe version of: {@link #ovr_BeginFrame BeginFrame} */
    public static native int novr_BeginFrame(long session, long frameIndex);

    /**
     * Called from render thread before application begins rendering. Must be called after {@link #ovr_WaitToBeginFrame WaitToBeginFrame} and before {@link #ovr_EndFrame EndFrame}, but not necessarily
     * from the same threads.
     *
     * @param session    an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param frameIndex specifies the targeted application frame index. It must match what was passed to {@link #ovr_WaitToBeginFrame WaitToBeginFrame}.
     *
     * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
     *         
     *         <ul>
     *         <li>{@link OVRErrorCode#ovrSuccess Success}: command completed successfully.</li>
     *         <li>{@link OVRErrorCode#ovrError_DisplayLost Error_DisplayLost}: The session has become invalid (such as due to a device removal) and the shared resources need to be released
     *         ({@link #ovr_DestroyTextureSwapChain DestroyTextureSwapChain}), the session needs to destroyed ({@link #ovr_Destroy Destroy}) and recreated ({@link #ovr_Create Create}), and new resources need to be created
     *         ({@code ovr_CreateTextureSwapChainXXX}). The application's existing private graphics resources do not need to be recreated unless the new
     *         {@code ovr_Create} call returns a different {@code GraphicsLuid}.</li>
     *         </ul>
     */
    @NativeType("ovrResult")
    public static int ovr_BeginFrame(@NativeType("ovrSession") long session, @NativeType("long long") long frameIndex) {
        if (CHECKS) {
            check(session);
        }
        return novr_BeginFrame(session, frameIndex);
    }

    // --- [ ovr_EndFrame ] ---

    /**
     * Unsafe version of: {@link #ovr_EndFrame EndFrame}
     *
     * @param layerCount indicates the number of valid elements in {@code layerPtrList}. The maximum supported {@code layerCount} is not currently specified, but may be
     *                   specified in a future version.
     */
    public static native int novr_EndFrame(long session, long frameIndex, long viewScaleDesc, long layerPtrList, int layerCount);

    /**
     * Called from render thread after application has finished rendering. Must be called after {@link #ovr_BeginFrame BeginFrame}, but not necessarily from the same thread.
     * Submits layers for distortion and display, which will happen asynchronously.
     * 
     * <ul>
     * <li>Layers are drawn in the order they are specified in the array, regardless of the layer type.</li>
     * <li>Layers are not remembered between successive calls to {@link #ovr_EndFrame EndFrame}. A layer must be specified in every call to {@link #ovr_EndFrame EndFrame} or it won't be displayed.</li>
     * <li>If a {@code layerPtrList} entry that was specified in a previous call to {@link #ovr_EndFrame EndFrame} is passed as {@code NULL} or is of type {@link #ovrLayerType_Disabled LayerType_Disabled}, that
     * layer is no longer displayed.</li>
     * <li>A {@code layerPtrList} entry can be of any layer type and multiple entries of the same layer type are allowed. No {@code layerPtrList} entry may be
     * duplicated (i.e. the same pointer as an earlier entry).</li>
     * </ul>
     * 
     * <h3>Example code</h3>
     * 
     * <pre><code>
     * ovrLayerEyeFov  layer0;
     * ovrLayerQuad    layer1;
     * ...
     * ovrLayerHeader* layers[2] = { &amp;layer0.Header, &amp;layer1.Header };
     * ovrResult result = ovr_EndFrame(session, frameIndex, nullptr, layers, 2);</code></pre>
     *
     * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param frameIndex    specifies the targeted application frame index. It must match what was passed to {@link #ovr_BeginFrame BeginFrame}.
     * @param viewScaleDesc provides additional information needed only if {@code layerPtrList} contains an {@link #ovrLayerType_Quad LayerType_Quad}. If {@code NULL}, a default version is used based on the
     *                      current configuration and a 1.0 world scale.
     * @param layerPtrList  specifies a list of ovrLayer pointers, which can include {@code NULL} entries to indicate that any previously shown layer at that index is to not be
     *                      displayed. Each layer header must be a part of a layer structure such as {@link OVRLayerEyeFov} or {@link OVRLayerQuad}, with {@code Header.Type} identifying
     *                      its type. A {@code NULL} layerPtrList entry in the array indicates the absence of the given layer.
     *
     * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
     *         
     *         <ul>
     *         <li>{@link OVRErrorCode#ovrSuccess Success}: rendering completed successfully.</li>
     *         <li>{@link OVRErrorCode#ovrError_DisplayLost Error_DisplayLost}: The session has become invalid (such as due to a device removal) and the shared resources need to be released
     *         ({@link #ovr_DestroyTextureSwapChain DestroyTextureSwapChain}), the session needs to destroyed ({@link #ovr_Destroy Destroy}) and recreated ({@link #ovr_Create Create}), and new resources need to be created
     *         ({@code ovr_CreateTextureSwapChainXXX}). The application's existing private graphics resources do not need to be recreated unless the new
     *         {@code ovr_Create} call returns a different {@code GraphicsLuid}.</li>
     *         <li>{@link OVRErrorCode#ovrError_TextureSwapChainInvalid Error_TextureSwapChainInvalid}: The {@code ovrTextureSwapChain} is in an incomplete or inconsistent state. Ensure {@link #ovr_CommitTextureSwapChain CommitTextureSwapChain} was
     *         called at least once first.</li>
     *         </ul>
     */
    @NativeType("ovrResult")
    public static int ovr_EndFrame(@NativeType("ovrSession") long session, @NativeType("long long") long frameIndex, @Nullable @NativeType("ovrViewScaleDesc const *") OVRViewScaleDesc viewScaleDesc, @NativeType("ovrLayerHeader const * const *") PointerBuffer layerPtrList) {
        if (CHECKS) {
            check(session);
        }
        return novr_EndFrame(session, frameIndex, memAddressSafe(viewScaleDesc), memAddress(layerPtrList), layerPtrList.remaining());
    }

    // --- [ ovr_SubmitFrame ] ---

    /**
     * Unsafe version of: {@link #ovr_SubmitFrame SubmitFrame}
     *
     * @param layerCount the number of valid elements in {@code layerPtrList}. The maximum supported {@code layerCount} is not currently specified, but may be specified in
     *                   a future version.
     */
    public static native int novr_SubmitFrame(long session, long frameIndex, long viewScaleDesc, long layerPtrList, int layerCount);

    /**
     * Submits layers for distortion and display.
     * 
     * <p>Deprecated. Use WaitToBeginFrame(), BeginFrame(), and {@link #ovr_EndFrame EndFrame} instead.</p>
     * 
     * <p>{@code ovr_SubmitFrame} triggers distortion and processing which might happen asynchronously. The function will return when there is room in the
     * submission queue and surfaces are available. Distortion might or might not have completed.</p>
     * 
     * <ul>
     * <li>Layers are drawn in the order they are specified in the array, regardless of the layer type.</li>
     * <li>Layers are not remembered between successive calls to {@code ovr_SubmitFrame}. A layer must be specified in every call to {@code ovr_SubmitFrame}
     * or it won't be displayed.</li>
     * <li>If a {@code layerPtrList} entry that was specified in a previous call to {@code ovr_SubmitFrame} is passed as {@code NULL} or is of type
     * {@link #ovrLayerType_Disabled LayerType_Disabled}, that layer is no longer displayed.</li>
     * <li>A {@code layerPtrList} entry can be of any layer type and multiple entries of the same layer type are allowed. No {@code layerPtrList} entry may be
     * duplicated (i.e. the same pointer as an earlier entry).</li>
     * </ul>
     * 
     * <h3>Example code</h3>
     * 
     * <pre><code>
     * ovrLayerEyeFov  layer0;
     * ovrLayerQuad    layer1;
     * ...
     * ovrLayerHeader* layers[2] = { &amp;layer0.Header, &amp;layer1.Header };
     * ovrResult result = ovr_SubmitFrame(session, frameIndex, nullptr, layers, 2);</code></pre>
     *
     * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param frameIndex    the targeted application frame index, or 0 to refer to one frame after the last time {@link #ovr_SubmitFrame SubmitFrame} was called
     * @param viewScaleDesc provides additional information needed only if {@code layerPtrList} contains an {@link #ovrLayerType_Quad LayerType_Quad}. If {@code NULL}, a default version is used based on the
     *                      current configuration and a 1.0 world scale.
     * @param layerPtrList  a list of {@code ovrLayer} pointers, which can include {@code NULL} entries to indicate that any previously shown layer at that index is to not be
     *                      displayed. Each layer header must be a part of a layer structure such as {@link OVRLayerEyeFov} or {@link OVRLayerQuad}, with {@code Header.Type} identifying
     *                      its type. A {@code NULL} {@code layerPtrList} entry in the array indicates the absence of the given layer.
     *
     * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon one of the possible success values:
     *         
     *         <ul>
     *         <li>{@link OVRErrorCode#ovrSuccess Success}: rendering completed successfully.</li>
     *         <li>{@link OVRErrorCode#ovrSuccess_NotVisible Success_NotVisible}: rendering completed successfully but was not displayed on the HMD, usually because another application currently has ownership
     *         of the HMD. Applications receiving this result should stop rendering new content, call {@link #ovr_GetSessionStatus GetSessionStatus} to detect visibility.</li>
     *         <li>{@link OVRErrorCode#ovrError_DisplayLost Error_DisplayLost}: The session has become invalid (such as due to a device removal) and the shared resources need to be released
     *         ({@link #ovr_DestroyTextureSwapChain DestroyTextureSwapChain}), the session needs to be destroyed ({@link #ovr_Destroy Destroy}) and recreated ({@link #ovr_Create Create}), and new resources need to be created
     *         ({@code ovr_CreateTextureSwapChainXXX}). The application's existing private graphics resources do not need to be recreated unless the new
     *         {@code ovr_Create} call returns a different {@code GraphicsLuid}.</li>
     *         <li>{@link OVRErrorCode#ovrError_TextureSwapChainInvalid Error_TextureSwapChainInvalid}: The {@code ovrTextureSwapChain} is in an incomplete or inconsistent state. Ensure
     *         {@link #ovr_CommitTextureSwapChain CommitTextureSwapChain} was called at least once first.</li>
     *         </ul>
     */
    @NativeType("ovrResult")
    public static int ovr_SubmitFrame(@NativeType("ovrSession") long session, @NativeType("long long") long frameIndex, @Nullable @NativeType("ovrViewScaleDesc const *") OVRViewScaleDesc viewScaleDesc, @NativeType("ovrLayerHeader const * const *") PointerBuffer layerPtrList) {
        if (CHECKS) {
            check(session);
        }
        return novr_SubmitFrame(session, frameIndex, memAddressSafe(viewScaleDesc), memAddress(layerPtrList), layerPtrList.remaining());
    }

    // --- [ ovr_GetPerfStats ] ---

    /** Unsafe version of: {@link #ovr_GetPerfStats GetPerfStats} */
    public static native int novr_GetPerfStats(long session, long outStats);

    /**
     * Retrieves performance stats for the VR app as well as the SDK compositor.
     * 
     * <p>This function will return stats for the VR app that is currently visible in the HMD regardless of what VR app is actually calling this function.</p>
     * 
     * <p>If the VR app is trying to make sure the stats returned belong to the same application,  the caller can compare the {@code VisibleProcessId} with their
     * own process ID. Normally this will be the case if the caller is only calling {@code ovr_GetPerfStats} when {@link #ovr_GetSessionStatus GetSessionStatus} has {@code IsVisible}
     * flag set to be true.</p>
     * 
     * <p>If the VR app calling {@code ovr_GetPerfStats} is actually the one visible in the HMD, then new perf stats will only be populated after a new call to
     * {@link #ovr_SubmitFrame SubmitFrame}. That means subsequent calls to {@code ovr_GetPerfStats} after the first one without calling {@code ovr_SubmitFrame} will receive a
     * {@code FrameStatsCount} of zero.</p>
     * 
     * <p>If the VR app is not visible, or was initially marked as {@link #ovrInit_Invisible Init_Invisible}, then each call to {@code ovr_GetPerfStats} will immediately fetch new perf
     * stats from the compositor without a need for the {@code ovr_SubmitFrame} call.</p>
     * 
     * <p>Even though invisible VR apps do not require {@code ovr_SubmitFrame} to be called to gather new perf stats, since stats are generated at the native
     * refresh rate of the HMD (i.e. 90 Hz for CV1), calling it at a higher rate than that would be unnecessary.</p>
     *
     * @param session  an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param outStats contains the performance stats for the application and SDK compositor
     *
     * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success
     */
    @NativeType("ovrResult")
    public static int ovr_GetPerfStats(@NativeType("ovrSession") long session, @NativeType("ovrPerfStats *") OVRPerfStats outStats) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetPerfStats(session, outStats.address());
    }

    // --- [ ovr_ResetPerfStats ] ---

    /** Unsafe version of: {@link #ovr_ResetPerfStats ResetPerfStats} */
    public static native int novr_ResetPerfStats(long session);

    /**
     * Resets the accumulated stats reported in each {@link OVRPerfStatsPerCompositorFrame} back to zero.
     * 
     * <p>Only the integer values such as {@code HmdVsyncIndex}, {@code AppDroppedFrameCount} etc. will be reset as the other fields such as
     * {@code AppMotionToPhotonLatency} are independent timing values updated per-frame.</p>
     *
     * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     *
     * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success
     */
    @NativeType("ovrResult")
    public static int ovr_ResetPerfStats(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        return novr_ResetPerfStats(session);
    }

    // --- [ ovr_GetPredictedDisplayTime ] ---

    /** Unsafe version of: {@link #ovr_GetPredictedDisplayTime GetPredictedDisplayTime} */
    public static native double novr_GetPredictedDisplayTime(long session, long frameIndex);

    /**
     * Gets the time of the specified frame midpoint.
     * 
     * <p>Predicts the time at which the given frame will be displayed. The predicted time is the middle of the time period during which the corresponding eye
     * images will be displayed.</p>
     * 
     * <p>The application should increment frameIndex for each successively targeted frame, and pass that index to any relevant OVR functions that need to apply
     * to the frame identified by that index.</p>
     * 
     * <p>This function is thread-safe and allows for multiple application threads to target their processing to the same displayed frame.</p>
     * 
     * <p>In the event that prediction fails due to various reasons (e.g. the display being off or app has yet to present any frames), the return value will be
     * current CPU time.</p>
     *
     * @param session    an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param frameIndex the frame the caller wishes to target. A value of zero returns the next frame index.
     *
     * @return the absolute frame midpoint time for the given {@code frameIndex}
     */
    public static double ovr_GetPredictedDisplayTime(@NativeType("ovrSession") long session, @NativeType("long long") long frameIndex) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetPredictedDisplayTime(session, frameIndex);
    }

    // --- [ ovr_GetTimeInSeconds ] ---

    /**
     * Returns global, absolute high-resolution time in seconds.
     * 
     * <p>The time frame of reference for this function is not specified and should not be depended upon.</p>
     *
     * @return seconds as a floating point value
     */
    public static native double ovr_GetTimeInSeconds();

    // --- [ ovr_GetBool ] ---

    /** Unsafe version of: {@link #ovr_GetBool GetBool} */
    public static native boolean novr_GetBool(long session, long propertyName, boolean defaultVal);

    /**
     * Reads a boolean property.
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid for only the call
     * @param defaultVal   specifes the value to return if the property couldn't be read
     *
     * @return the property interpreted as a boolean value. Returns {@code defaultVal} if the property doesn't exist.
     */
    @NativeType("ovrBool")
    public static boolean ovr_GetBool(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, @NativeType("ovrBool") boolean defaultVal) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_GetBool(session, memAddress(propertyName), defaultVal);
    }

    /**
     * Reads a boolean property.
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid for only the call
     * @param defaultVal   specifes the value to return if the property couldn't be read
     *
     * @return the property interpreted as a boolean value. Returns {@code defaultVal} if the property doesn't exist.
     */
    @NativeType("ovrBool")
    public static boolean ovr_GetBool(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, @NativeType("ovrBool") boolean defaultVal) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_GetBool(session, propertyNameEncoded, defaultVal);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_SetBool ] ---

    /** Unsafe version of: {@link #ovr_SetBool SetBool} */
    public static native boolean novr_SetBool(long session, long propertyName, boolean value);

    /**
     * Writes or creates a boolean property.
     * 
     * <p>If the property wasn't previously a boolean property, it is changed to a boolean property.</p>
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param value        the value to write
     *
     * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
     */
    @NativeType("ovrBool")
    public static boolean ovr_SetBool(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, @NativeType("ovrBool") boolean value) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_SetBool(session, memAddress(propertyName), value);
    }

    /**
     * Writes or creates a boolean property.
     * 
     * <p>If the property wasn't previously a boolean property, it is changed to a boolean property.</p>
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param value        the value to write
     *
     * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
     */
    @NativeType("ovrBool")
    public static boolean ovr_SetBool(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, @NativeType("ovrBool") boolean value) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_SetBool(session, propertyNameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_GetInt ] ---

    /** Unsafe version of: {@link #ovr_GetInt GetInt} */
    public static native int novr_GetInt(long session, long propertyName, int defaultVal);

    /**
     * Reads an integer property.
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param defaultVal   specifes the value to return if the property couldn't be read
     *
     * @return the property interpreted as an integer value. Returns {@code defaultVal} if the property doesn't exist.
     */
    public static int ovr_GetInt(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, int defaultVal) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_GetInt(session, memAddress(propertyName), defaultVal);
    }

    /**
     * Reads an integer property.
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param defaultVal   specifes the value to return if the property couldn't be read
     *
     * @return the property interpreted as an integer value. Returns {@code defaultVal} if the property doesn't exist.
     */
    public static int ovr_GetInt(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, int defaultVal) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_GetInt(session, propertyNameEncoded, defaultVal);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_SetInt ] ---

    /** Unsafe version of: {@link #ovr_SetInt SetInt} */
    public static native boolean novr_SetInt(long session, long propertyName, int value);

    /**
     * Writes or creates an integer property.
     * 
     * <p>If the property wasn't previously an integer property, it is changed to an integer property.</p>
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param value        the value to write
     *
     * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
     */
    @NativeType("ovrBool")
    public static boolean ovr_SetInt(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, int value) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_SetInt(session, memAddress(propertyName), value);
    }

    /**
     * Writes or creates an integer property.
     * 
     * <p>If the property wasn't previously an integer property, it is changed to an integer property.</p>
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param value        the value to write
     *
     * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
     */
    @NativeType("ovrBool")
    public static boolean ovr_SetInt(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, int value) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_SetInt(session, propertyNameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_GetFloat ] ---

    /** Unsafe version of: {@link #ovr_GetFloat GetFloat} */
    public static native float novr_GetFloat(long session, long propertyName, float defaultVal);

    /**
     * Reads a float property.
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param defaultVal   specifes the value to return if the property couldn't be read
     *
     * @return the property interpreted as a float value. Returns {@code defaultVal} if the property doesn't exist.
     */
    public static float ovr_GetFloat(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, float defaultVal) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_GetFloat(session, memAddress(propertyName), defaultVal);
    }

    /**
     * Reads a float property.
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param defaultVal   specifes the value to return if the property couldn't be read
     *
     * @return the property interpreted as a float value. Returns {@code defaultVal} if the property doesn't exist.
     */
    public static float ovr_GetFloat(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, float defaultVal) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_GetFloat(session, propertyNameEncoded, defaultVal);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_SetFloat ] ---

    /** Unsafe version of: {@link #ovr_SetFloat SetFloat} */
    public static native boolean novr_SetFloat(long session, long propertyName, float value);

    /**
     * Writes or creates a float property.
     * 
     * <p>If the property wasn't previously a float property, it's changed to a float property.</p>
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param value        the value to write
     *
     * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
     */
    @NativeType("ovrBool")
    public static boolean ovr_SetFloat(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, float value) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_SetFloat(session, memAddress(propertyName), value);
    }

    /**
     * Writes or creates a float property.
     * 
     * <p>If the property wasn't previously a float property, it's changed to a float property.</p>
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param value        the value to write
     *
     * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
     */
    @NativeType("ovrBool")
    public static boolean ovr_SetFloat(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, float value) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_SetFloat(session, propertyNameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_GetFloatArray ] ---

    /**
     * Unsafe version of: {@link #ovr_GetFloatArray GetFloatArray}
     *
     * @param valuesCapacity the maximum number of elements to write to the values array
     */
    public static native int novr_GetFloatArray(long session, long propertyName, long values, int valuesCapacity);

    /**
     * Reads a float array property.
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param values       an array of float to write to
     *
     * @return the number of elements read, or 0 if property doesn't exist or is empty
     */
    @NativeType("unsigned int")
    public static int ovr_GetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, @NativeType("float *") FloatBuffer values) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_GetFloatArray(session, memAddress(propertyName), memAddress(values), values.remaining());
    }

    /**
     * Reads a float array property.
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param values       an array of float to write to
     *
     * @return the number of elements read, or 0 if property doesn't exist or is empty
     */
    @NativeType("unsigned int")
    public static int ovr_GetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, @NativeType("float *") FloatBuffer values) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_GetFloatArray(session, propertyNameEncoded, memAddress(values), values.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_SetFloatArray ] ---

    /**
     * Unsafe version of: {@link #ovr_SetFloatArray SetFloatArray}
     *
     * @param valuesSize the number of elements to write
     */
    public static native boolean novr_SetFloatArray(long session, long propertyName, long values, int valuesSize);

    /**
     * Writes or creates a float array property.
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param values       an array of float to write from
     *
     * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
     */
    @NativeType("ovrBool")
    public static boolean ovr_SetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, @NativeType("float *") FloatBuffer values) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_SetFloatArray(session, memAddress(propertyName), memAddress(values), values.remaining());
    }

    /**
     * Writes or creates a float array property.
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param values       an array of float to write from
     *
     * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
     */
    @NativeType("ovrBool")
    public static boolean ovr_SetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, @NativeType("float *") FloatBuffer values) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_SetFloatArray(session, propertyNameEncoded, memAddress(values), values.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_GetString ] ---

    /** Unsafe version of: {@link #ovr_GetString GetString} */
    public static native long novr_GetString(long session, long propertyName, long defaultVal);

    /**
     * Reads a string property.
     * 
     * <p>Strings are UTF8-encoded and null-terminated.</p>
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param defaultVal   specifes the value to return if the property couldn't be read
     *
     * @return the string property if it exists. Otherwise returns {@code defaultVal}, which can be specified as {@code NULL}. The return memory is guaranteed to be valid
     *         until next call to {@code ovr_GetString} or until the HMD is destroyed, whichever occurs first.
     */
    @Nullable
    @NativeType("char const *")
    public static String ovr_GetString(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, @Nullable @NativeType("char const *") ByteBuffer defaultVal) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
            checkNT1Safe(defaultVal);
        }
        long __result = novr_GetString(session, memAddress(propertyName), memAddressSafe(defaultVal));
        return memUTF8Safe(__result);
    }

    /**
     * Reads a string property.
     * 
     * <p>Strings are UTF8-encoded and null-terminated.</p>
     *
     * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param defaultVal   specifes the value to return if the property couldn't be read
     *
     * @return the string property if it exists. Otherwise returns {@code defaultVal}, which can be specified as {@code NULL}. The return memory is guaranteed to be valid
     *         until next call to {@code ovr_GetString} or until the HMD is destroyed, whichever occurs first.
     */
    @Nullable
    @NativeType("char const *")
    public static String ovr_GetString(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, @Nullable @NativeType("char const *") CharSequence defaultVal) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(defaultVal, true);
            long defaultValEncoded = defaultVal == null ? NULL : stack.getPointerAddress();
            long __result = novr_GetString(session, propertyNameEncoded, defaultValEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_SetString ] ---

    /** Unsafe version of: {@link #ovr_SetString SetString} */
    public static native boolean novr_SetString(long hmddesc, long propertyName, long value);

    /**
     * Writes or creates a string property.
     * 
     * <p>Strings are UTF8-encoded and null-terminated.</p>
     *
     * @param hmddesc      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param value        the string property, which only needs to be valid for the duration of the call
     *
     * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
     */
    @NativeType("ovrBool")
    public static boolean ovr_SetString(@NativeType("ovrSession") long hmddesc, @NativeType("char const *") ByteBuffer propertyName, @NativeType("char const *") ByteBuffer value) {
        if (CHECKS) {
            check(hmddesc);
            checkNT1(propertyName);
            checkNT1(value);
        }
        return novr_SetString(hmddesc, memAddress(propertyName), memAddress(value));
    }

    /**
     * Writes or creates a string property.
     * 
     * <p>Strings are UTF8-encoded and null-terminated.</p>
     *
     * @param hmddesc      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
     * @param propertyName the name of the property, which needs to be valid only for the call
     * @param value        the string property, which only needs to be valid for the duration of the call
     *
     * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
     */
    @NativeType("ovrBool")
    public static boolean ovr_SetString(@NativeType("ovrSession") long hmddesc, @NativeType("char const *") CharSequence propertyName, @NativeType("char const *") CharSequence value) {
        if (CHECKS) {
            check(hmddesc);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            stack.nASCII(value, true);
            long valueEncoded = stack.getPointerAddress();
            return novr_SetString(hmddesc, propertyNameEncoded, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #novr_GetDevicePoses} */
    public static native int novr_GetDevicePoses(long session, int[] deviceTypes, int deviceCount, double absTime, long outDevicePoses);

    /** Array version of: {@link #ovr_GetDevicePoses GetDevicePoses} */
    @NativeType("ovrResult")
    public static int ovr_GetDevicePoses(@NativeType("ovrSession") long session, @NativeType("ovrTrackedDeviceType *") int[] deviceTypes, double absTime, @NativeType("ovrPoseStatef *") OVRPoseStatef.Buffer outDevicePoses) {
        if (CHECKS) {
            check(session);
            check(outDevicePoses, deviceTypes.length);
        }
        return novr_GetDevicePoses(session, deviceTypes, deviceTypes.length, absTime, outDevicePoses.address());
    }

    /** Array version of: {@link #novr_GetBoundaryGeometry} */
    public static native int novr_GetBoundaryGeometry(long session, int boundaryType, long outFloorPoints, int[] outFloorPointsCount);

    /** Array version of: {@link #ovr_GetBoundaryGeometry GetBoundaryGeometry} */
    @NativeType("ovrResult")
    public static int ovr_GetBoundaryGeometry(@NativeType("ovrSession") long session, @NativeType("ovrBoundaryType") int boundaryType, @Nullable @NativeType("ovrVector3f *") OVRVector3f outFloorPoints, @Nullable @NativeType("int *") int[] outFloorPointsCount) {
        if (CHECKS) {
            check(session);
            checkSafe(outFloorPointsCount, 1);
        }
        return novr_GetBoundaryGeometry(session, boundaryType, memAddressSafe(outFloorPoints), outFloorPointsCount);
    }

    /** Array version of: {@link #novr_GetExternalCameras} */
    public static native int novr_GetExternalCameras(long session, long cameras, int[] inoutCameraCount);

    /** Array version of: {@link #ovr_GetExternalCameras GetExternalCameras} */
    @NativeType("ovrResult")
    public static int ovr_GetExternalCameras(@NativeType("ovrSession") long session, @Nullable @NativeType("ovrExternalCamera *") OVRExternalCamera.Buffer cameras, @NativeType("unsigned int *") int[] inoutCameraCount) {
        if (CHECKS) {
            check(session);
            check(inoutCameraCount, 1);
            checkSafe(cameras, inoutCameraCount[0]);
        }
        return novr_GetExternalCameras(session, memAddressSafe(cameras), inoutCameraCount);
    }

    /** Array version of: {@link #novr_GetTextureSwapChainLength} */
    public static native int novr_GetTextureSwapChainLength(long session, long chain, int[] out_Length);

    /** Array version of: {@link #ovr_GetTextureSwapChainLength GetTextureSwapChainLength} */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainLength(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, @NativeType("int *") int[] out_Length) {
        if (CHECKS) {
            check(session);
            check(chain);
            check(out_Length, 1);
        }
        return novr_GetTextureSwapChainLength(session, chain, out_Length);
    }

    /** Array version of: {@link #novr_GetTextureSwapChainCurrentIndex} */
    public static native int novr_GetTextureSwapChainCurrentIndex(long session, long chain, int[] out_Index);

    /** Array version of: {@link #ovr_GetTextureSwapChainCurrentIndex GetTextureSwapChainCurrentIndex} */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainCurrentIndex(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, @NativeType("int *") int[] out_Index) {
        if (CHECKS) {
            check(session);
            check(chain);
            check(out_Index, 1);
        }
        return novr_GetTextureSwapChainCurrentIndex(session, chain, out_Index);
    }

    /** Array version of: {@link #novr_GetFloatArray} */
    public static native int novr_GetFloatArray(long session, long propertyName, float[] values, int valuesCapacity);

    /** Array version of: {@link #ovr_GetFloatArray GetFloatArray} */
    @NativeType("unsigned int")
    public static int ovr_GetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, @NativeType("float *") float[] values) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_GetFloatArray(session, memAddress(propertyName), values, values.length);
    }

    /** Array version of: {@link #ovr_GetFloatArray GetFloatArray} */
    @NativeType("unsigned int")
    public static int ovr_GetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, @NativeType("float *") float[] values) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_GetFloatArray(session, propertyNameEncoded, values, values.length);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #novr_SetFloatArray} */
    public static native boolean novr_SetFloatArray(long session, long propertyName, float[] values, int valuesSize);

    /** Array version of: {@link #ovr_SetFloatArray SetFloatArray} */
    @NativeType("ovrBool")
    public static boolean ovr_SetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, @NativeType("float *") float[] values) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_SetFloatArray(session, memAddress(propertyName), values, values.length);
    }

    /** Array version of: {@link #ovr_SetFloatArray SetFloatArray} */
    @NativeType("ovrBool")
    public static boolean ovr_SetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, @NativeType("float *") float[] values) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_SetFloatArray(session, propertyNameEncoded, values, values.length);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}