/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_eye_tracking_social">XR_FB_eye_tracking_social</a> extension.
 * 
 * <p>This extension enables applications to obtain position and orientation of the user’s eyes. It enables applications to render eyes in XR experiences.</p>
 * 
 * <p>This extension is intended to drive animation of avatar eyes. So, for that purpose, the runtimes <b>may</b> filter the poses in ways that are suitable for avatar eye interaction but detrimental to other use cases. This extension <b>should</b> not be used for other eye tracking purposes. For interaction, {@link EXTEyeGazeInteraction XR_EXT_eye_gaze_interaction} <b>should</b> be used.</p>
 * 
 * <p>Eye tracking data is sensitive personal information and is closely linked to personal privacy and integrity. It is strongly recommended that applications that store or transfer eye tracking data always ask the user for active and specific acceptance to do so.</p>
 * 
 * <p>If a runtime supports a permission system to control application access to the eye tracker, then the runtime <b>must</b> set the {@code isValid} field to {@link XR10#XR_FALSE FALSE} on the supplied {@link XrEyeGazeFB} structure until the application has been allowed access to the eye tracker. When the application access has been allowed, the runtime <b>may</b> set {@code isValid} on the supplied {@link XrEyeGazeFB} structure to {@link XR10#XR_TRUE TRUE}.</p>
 */
public class FBEyeTrackingSocial {

    /** The extension specification version. */
    public static final int XR_FB_eye_tracking_social_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_EYE_TRACKING_SOCIAL_EXTENSION_NAME = "XR_FB_eye_tracking_social";

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_EYE_TRACKER_FB = 1000202000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_EYE_TRACKER_CREATE_INFO_FB TYPE_EYE_TRACKER_CREATE_INFO_FB}</li>
     * <li>{@link #XR_TYPE_EYE_GAZES_INFO_FB TYPE_EYE_GAZES_INFO_FB}</li>
     * <li>{@link #XR_TYPE_EYE_GAZES_FB TYPE_EYE_GAZES_FB}</li>
     * <li>{@link #XR_TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_FB TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_EYE_TRACKER_CREATE_INFO_FB        = 1000202001,
        XR_TYPE_EYE_GAZES_INFO_FB                 = 1000202002,
        XR_TYPE_EYE_GAZES_FB                      = 1000202003,
        XR_TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_FB = 1000202004;

    /**
     * XrEyePositionFB - Enumerates eyes.
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_EYE_POSITION_LEFT_FB EYE_POSITION_LEFT_FB} — Specifies the position of the left eye.</li>
     * <li>{@link #XR_EYE_POSITION_RIGHT_FB EYE_POSITION_RIGHT_FB} — Specifies the position of the right eye.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEyeGazesFB}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_EYE_POSITION_COUNT_FB EYE_POSITION_COUNT_FB}</li>
     * </ul>
     */
    public static final int
        XR_EYE_POSITION_LEFT_FB  = 0,
        XR_EYE_POSITION_RIGHT_FB = 1,
        XR_EYE_POSITION_COUNT_FB = 2;

    protected FBEyeTrackingSocial() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateEyeTrackerFB ] ---

    /** Unsafe version of: {@link #xrCreateEyeTrackerFB CreateEyeTrackerFB} */
    public static int nxrCreateEyeTrackerFB(XrSession session, long createInfo, long eyeTracker) {
        long __functionAddress = session.getCapabilities().xrCreateEyeTrackerFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, eyeTracker, __functionAddress);
    }

    /**
     * Create an eye gaze handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>An application creates an {@code XrEyeTrackerFB} handle using {@link #xrCreateEyeTrackerFB CreateEyeTrackerFB} function.</p>
     * 
     * <pre><code>
     * XrResult xrCreateEyeTrackerFB(
     *     XrSession                                   session,
     *     const XrEyeTrackerCreateInfoFB*             createInfo,
     *     XrEyeTrackerFB*                             eyeTracker);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If the system does not support eye tracking, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link #xrCreateEyeTrackerFB CreateEyeTrackerFB}. In this case, the runtime <b>must</b> return {@link XR10#XR_FALSE FALSE} for {@code supportsEyeTracking} in {@link XrSystemEyeTrackingPropertiesFB} when the function {@link XR10#xrGetSystemProperties GetSystemProperties} is called, so that the application <b>can</b> avoid creating an eye tracker.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBEyeTrackingSocial XR_FB_eye_tracking_social} extension <b>must</b> be enabled prior to calling {@link #xrCreateEyeTrackerFB CreateEyeTrackerFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrEyeTrackerCreateInfoFB} structure</li>
     * <li>{@code eyeTracker} <b>must</b> be a pointer to an {@code XrEyeTrackerFB} handle</li>
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
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEyeTrackerCreateInfoFB}</p>
     *
     * @param session    an {@code XrSession} in which the eye tracker will be active.
     * @param createInfo the {@link XrEyeTrackerCreateInfoFB} used to specify the eye tracker.
     * @param eyeTracker the returned {@code XrEyeTrackerFB} handle.
     */
    @NativeType("XrResult")
    public static int xrCreateEyeTrackerFB(XrSession session, @NativeType("XrEyeTrackerCreateInfoFB const *") XrEyeTrackerCreateInfoFB createInfo, @NativeType("XrEyeTrackerFB *") PointerBuffer eyeTracker) {
        if (CHECKS) {
            check(eyeTracker, 1);
        }
        return nxrCreateEyeTrackerFB(session, createInfo.address(), memAddress(eyeTracker));
    }

    // --- [ xrDestroyEyeTrackerFB ] ---

    /**
     * Destroy an eye gaze handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>{@link #xrDestroyEyeTrackerFB DestroyEyeTrackerFB} function releases the {@code eyeTracker} and the underlying resources when the eye tracking experience is over.</p>
     * 
     * <pre><code>
     * XrResult xrDestroyEyeTrackerFB(
     *     XrEyeTrackerFB                              eyeTracker);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBEyeTrackingSocial XR_FB_eye_tracking_social} extension <b>must</b> be enabled prior to calling {@link #xrDestroyEyeTrackerFB DestroyEyeTrackerFB}</li>
     * <li>{@code eyeTracker} <b>must</b> be a valid {@code XrEyeTrackerFB} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code eyeTracker}, and any child handles, <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * </ul></dd>
     * </dl>
     *
     * @param eyeTracker an {@code XrEyeTrackerFB} previously created by {@link #xrCreateEyeTrackerFB CreateEyeTrackerFB}.
     */
    @NativeType("XrResult")
    public static int xrDestroyEyeTrackerFB(XrEyeTrackerFB eyeTracker) {
        long __functionAddress = eyeTracker.getCapabilities().xrDestroyEyeTrackerFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(eyeTracker.address(), __functionAddress);
    }

    // --- [ xrGetEyeGazesFB ] ---

    /** Unsafe version of: {@link #xrGetEyeGazesFB GetEyeGazesFB} */
    public static int nxrGetEyeGazesFB(XrEyeTrackerFB eyeTracker, long gazeInfo, long eyeGazes) {
        long __functionAddress = eyeTracker.getCapabilities().xrGetEyeGazesFB;
        if (CHECKS) {
            check(__functionAddress);
            XrEyeGazesInfoFB.validate(gazeInfo);
        }
        return callPPPI(eyeTracker.address(), gazeInfo, eyeGazes, __functionAddress);
    }

    /**
     * Locate eye gaze directions.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetEyeGazesFB GetEyeGazesFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetEyeGazesFB(
     *     XrEyeTrackerFB                              eyeTracker,
     *     const XrEyeGazesInfoFB*                     gazeInfo,
     *     XrEyeGazesFB*                               eyeGazes);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetEyeGazesFB GetEyeGazesFB} function obtains pose for a user’s eyes at a specific time and within a specific coordinate system.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBEyeTrackingSocial XR_FB_eye_tracking_social} extension <b>must</b> be enabled prior to calling {@link #xrGetEyeGazesFB GetEyeGazesFB}</li>
     * <li>{@code eyeTracker} <b>must</b> be a valid {@code XrEyeTrackerFB} handle</li>
     * <li>{@code gazeInfo} <b>must</b> be a pointer to a valid {@link XrEyeGazesInfoFB} structure</li>
     * <li>{@code eyeGazes} <b>must</b> be a pointer to an {@link XrEyeGazesFB} structure</li>
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
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEyeGazesFB}, {@link XrEyeGazesInfoFB}</p>
     *
     * @param eyeTracker an {@code XrEyeTrackerFB} previously created by {@link #xrCreateEyeTrackerFB CreateEyeTrackerFB}.
     *                   
     *                   <p>a pointer to {@link XrEyeGazesFB} receiving the returned eye poses and confidence.</p>
     * @param gazeInfo   the information to get eye gaze.
     */
    @NativeType("XrResult")
    public static int xrGetEyeGazesFB(XrEyeTrackerFB eyeTracker, @NativeType("XrEyeGazesInfoFB const *") XrEyeGazesInfoFB gazeInfo, @NativeType("XrEyeGazesFB *") XrEyeGazesFB eyeGazes) {
        return nxrGetEyeGazesFB(eyeTracker, gazeInfo.address(), eyeGazes.address());
    }

}