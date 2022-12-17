/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_HTC_foveation">XR_HTC_foveation</a> extension.
 * 
 * <p>This extension enables an application to gain rendering performance improvement by reducing the pixel density of areas in the peripheral vision. The areas near the focal point still sustains the original pixel density than periphery.</p>
 * 
 * <p>The application <b>can</b> use this extension in the following steps:</p>
 * 
 * <ul>
 * <li>Create an {@link XrFoveationApplyInfoHTC} structure with the desired foveation configurations.</li>
 * <li>Apply the foveation configuration by calling {@link #xrApplyFoveationHTC ApplyFoveationHTC} with desired {@link XrFoveationApplyInfoHTC}.</li>
 * </ul>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This extension is recommended for {@code XrSession} whose {@code XrViewConfigurationType} is {@link XR10#XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO}.</p>
 * </div>
 */
public class HTCFoveation {

    /** The extension specification version. */
    public static final int XR_HTC_foveation_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_HTC_FOVEATION_EXTENSION_NAME = "XR_HTC_foveation";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_FOVEATION_APPLY_INFO_HTC TYPE_FOVEATION_APPLY_INFO_HTC}</li>
     * <li>{@link #XR_TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC}</li>
     * <li>{@link #XR_TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_FOVEATION_APPLY_INFO_HTC        = 1000318000,
        XR_TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC = 1000318001,
        XR_TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC  = 1000318002;

    /**
     * XrFoveationModeHTC - Foveation mode
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_FOVEATION_MODE_DISABLE_HTC FOVEATION_MODE_DISABLE_HTC} — No foveation</li>
     * <li>{@link #XR_FOVEATION_MODE_FIXED_HTC FOVEATION_MODE_FIXED_HTC} — Apply system default setting with fixed clear FOV and periphery quality.</li>
     * <li>{@link #XR_FOVEATION_MODE_DYNAMIC_HTC FOVEATION_MODE_DYNAMIC_HTC} — Allow system to set foveation dynamically according realtime system metric or other extensions.</li>
     * <li>{@link #XR_FOVEATION_MODE_CUSTOM_HTC FOVEATION_MODE_CUSTOM_HTC} — Allow application to set foveation with desired clear FOV, periphery quality, and focal center offset.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFoveationApplyInfoHTC}</p>
     */
    public static final int
        XR_FOVEATION_MODE_DISABLE_HTC = 0,
        XR_FOVEATION_MODE_FIXED_HTC   = 1,
        XR_FOVEATION_MODE_DYNAMIC_HTC = 2,
        XR_FOVEATION_MODE_CUSTOM_HTC  = 3;

    /**
     * XrFoveationLevelHTC - The pixel density drop level of periphery area
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_FOVEATION_LEVEL_NONE_HTC FOVEATION_LEVEL_NONE_HTC} — No foveation</li>
     * <li>{@link #XR_FOVEATION_LEVEL_LOW_HTC FOVEATION_LEVEL_LOW_HTC} — Light periphery pixel density drop and lower performance gain.</li>
     * <li>{@link #XR_FOVEATION_LEVEL_MEDIUM_HTC FOVEATION_LEVEL_MEDIUM_HTC} — Medium periphery pixel density drop and medium performance gain</li>
     * <li>{@link #XR_FOVEATION_LEVEL_HIGH_HTC FOVEATION_LEVEL_HIGH_HTC} — Heavy periphery pixel density drop and higher performance gain</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFoveationConfigurationHTC}</p>
     */
    public static final int
        XR_FOVEATION_LEVEL_NONE_HTC   = 0,
        XR_FOVEATION_LEVEL_LOW_HTC    = 1,
        XR_FOVEATION_LEVEL_MEDIUM_HTC = 2,
        XR_FOVEATION_LEVEL_HIGH_HTC   = 3;

    /**
     * XrFoveationDynamicFlagBitsHTC - Features allow to change in dynamic mode
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_FOVEATION_DYNAMIC_LEVEL_ENABLED_BIT_HTC FOVEATION_DYNAMIC_LEVEL_ENABLED_BIT_HTC} — Allow system to set periphery pixel density dynamically.</li>
     * <li>{@link #XR_FOVEATION_DYNAMIC_CLEAR_FOV_ENABLED_BIT_HTC FOVEATION_DYNAMIC_CLEAR_FOV_ENABLED_BIT_HTC} — Allow system to set clear FOV degree dynamically.</li>
     * <li>{@link #XR_FOVEATION_DYNAMIC_FOCAL_CENTER_OFFSET_ENABLED_BIT_HTC FOVEATION_DYNAMIC_FOCAL_CENTER_OFFSET_ENABLED_BIT_HTC} — Allow system to set focal center offset dynamically.</li>
     * </ul>
     */
    public static final int
        XR_FOVEATION_DYNAMIC_LEVEL_ENABLED_BIT_HTC               = 0x1,
        XR_FOVEATION_DYNAMIC_CLEAR_FOV_ENABLED_BIT_HTC           = 0x2,
        XR_FOVEATION_DYNAMIC_FOCAL_CENTER_OFFSET_ENABLED_BIT_HTC = 0x4;

    protected HTCFoveation() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrApplyFoveationHTC ] ---

    /** Unsafe version of: {@link #xrApplyFoveationHTC ApplyFoveationHTC} */
    public static int nxrApplyFoveationHTC(XrSession session, long applyInfo) {
        long __functionAddress = session.getCapabilities().xrApplyFoveationHTC;
        if (CHECKS) {
            check(__functionAddress);
            XrFoveationApplyInfoHTC.validate(applyInfo);
        }
        return callPPI(session.address(), applyInfo, __functionAddress);
    }

    /**
     * Apply foveation config to system.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrApplyFoveationHTC ApplyFoveationHTC} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrApplyFoveationHTC(
     *     XrSession                                   session,
     *     const XrFoveationApplyInfoHTC*              applyInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The foveation configuration will be applied after this call, and the state will persist until the next call to {@link #xrApplyFoveationHTC ApplyFoveationHTC} or the end of this {@code XrSession}, whichever comes first. You <b>should</b> not call {@link #xrApplyFoveationHTC ApplyFoveationHTC} during rendering to target image layer {@link XrSwapchainSubImage} in render loop.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link HTCFoveation XR_HTC_foveation} extension <b>must</b> be enabled prior to calling {@link #xrApplyFoveationHTC ApplyFoveationHTC}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code applyInfo} <b>must</b> be a pointer to a valid {@link XrFoveationApplyInfoHTC} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFoveationApplyInfoHTC}</p>
     *
     * @param session   a handle to an {@code XrSession} in which the foveation will apply to.
     * @param applyInfo a pointer to an {@link XrFoveationApplyInfoHTC} structure containing information about the foveation configuration and applied {@link XrSwapchainSubImage}.
     */
    @NativeType("XrResult")
    public static int xrApplyFoveationHTC(XrSession session, @NativeType("XrFoveationApplyInfoHTC const *") XrFoveationApplyInfoHTC applyInfo) {
        return nxrApplyFoveationHTC(session, applyInfo.address());
    }

}