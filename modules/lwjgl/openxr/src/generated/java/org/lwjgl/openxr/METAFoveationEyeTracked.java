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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_META_foveation_eye_tracked">XR_META_foveation_eye_tracked</a> extension.
 * 
 * <p>Eye tracked foveated rendering renders lower pixel density in the periphery of the user’s gaze, taking advantage of low peripheral acuity.</p>
 * 
 * <p>This extension allows:</p>
 * 
 * <ul>
 * <li>An application to query eye tracked foveation availability.</li>
 * <li>An application to request eye tracked foveation profile supported by the runtime and apply them to foveation-supported swapchains.</li>
 * <li>An application to query foveation center position every frame.</li>
 * <li>An application to request a foveation pattern update from the runtime. As a consequence, runtime knows how to adjust the eye tracking camera exposure start time in order to optimize the total pipeline latency.</li>
 * </ul>
 * 
 * <p>In order to enable the functionality of this extension, the application <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 */
public class METAFoveationEyeTracked {

    /** The extension specification version. */
    public static final int XR_META_foveation_eye_tracked_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_META_FOVEATION_EYE_TRACKED_EXTENSION_NAME = "XR_META_foveation_eye_tracked";

    /** XR_FOVEATION_CENTER_SIZE_META */
    public static final int XR_FOVEATION_CENTER_SIZE_META = 2;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META}</li>
     * <li>{@link #XR_TYPE_FOVEATION_EYE_TRACKED_STATE_META TYPE_FOVEATION_EYE_TRACKED_STATE_META}</li>
     * <li>{@link #XR_TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META = 1000200000,
        XR_TYPE_FOVEATION_EYE_TRACKED_STATE_META               = 1000200001,
        XR_TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META   = 1000200002;

    /**
     * XrFoveationEyeTrackedStateFlagBitsMETA - XrFoveationEyeTrackedStateFlagBitsMETA
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_FOVEATION_EYE_TRACKED_STATE_VALID_BIT_META FOVEATION_EYE_TRACKED_STATE_VALID_BIT_META} — Indicates whether or not foveation data is valid. This can happen if the eye tracker is obscured, the camera has dirt, or eye lid is closed, etc.</li>
     * </ul>
     */
    public static final int XR_FOVEATION_EYE_TRACKED_STATE_VALID_BIT_META = 0x1;

    protected METAFoveationEyeTracked() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetFoveationEyeTrackedStateMETA ] ---

    /** Unsafe version of: {@link #xrGetFoveationEyeTrackedStateMETA GetFoveationEyeTrackedStateMETA} */
    public static int nxrGetFoveationEyeTrackedStateMETA(XrSession session, long foveationState) {
        long __functionAddress = session.getCapabilities().xrGetFoveationEyeTrackedStateMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), foveationState, __functionAddress);
    }

    /**
     * Get the current eye tracked foveation state.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetFoveationEyeTrackedStateMETA GetFoveationEyeTrackedStateMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetFoveationEyeTrackedStateMETA(
     *     XrSession                                   session,
     *     XrFoveationEyeTrackedStateMETA*             foveationState);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetFoveationEyeTrackedStateMETA GetFoveationEyeTrackedStateMETA} function returns the current eye tracked foveation state including the center of the foveal region, validity of the foveation data, etc.</p>
     * 
     * <p>Note that {@link FBSwapchainUpdateState#xrUpdateSwapchainFB UpdateSwapchainFB} <b>should</b> be called right before the {@link #xrGetFoveationEyeTrackedStateMETA GetFoveationEyeTrackedStateMETA} function in order to (1) request a foveation pattern update by the runtime (2) optionally instruct the runtime to adjust the eye tracking camera capture start time in order to optimize for pipeline latency.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAFoveationEyeTracked XR_META_foveation_eye_tracked} extension <b>must</b> be enabled prior to calling {@link #xrGetFoveationEyeTrackedStateMETA GetFoveationEyeTrackedStateMETA}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code foveationState} <b>must</b> be a pointer to an {@link XrFoveationEyeTrackedStateMETA} structure</li>
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
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFoveationEyeTrackedStateMETA}</p>
     *
     * @param session        the {@code XrSession} in which the eye tracked foveation profile is applied.
     * @param foveationState a pointer to an {@link XrFoveationEyeTrackedStateMETA} structure returning the current eye tracked foveation state.
     */
    @NativeType("XrResult")
    public static int xrGetFoveationEyeTrackedStateMETA(XrSession session, @NativeType("XrFoveationEyeTrackedStateMETA *") XrFoveationEyeTrackedStateMETA foveationState) {
        return nxrGetFoveationEyeTrackedStateMETA(session, foveationState.address());
    }

}