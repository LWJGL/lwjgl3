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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_face_tracking">XR_FB_face_tracking</a> extension.
 * 
 * <p>This extension enables applications to get weights of blend shapes. It also enables applications to render facial expressions in XR experiences.</p>
 * 
 * <p>Face tracking data is sensitive personal information and is closely linked to personal privacy and integrity. It is strongly recommended that applications storing or transferring face tracking data always ask the user for active and specific acceptance to do so.</p>
 * 
 * <p>If a runtime supports a permission system to control application access to the face tracker, then the runtime <b>must</b> set the {@code isValid} field to {@link XR10#XR_FALSE FALSE} on the supplied {@link XrFaceExpressionStatusFB} structure until the user allows the application to access the face tracker. When the application access has been allowed, the runtime <b>may</b> set {@code isValid} on the supplied {@link XrFaceExpressionStatusFB} structure to {@link XR10#XR_TRUE TRUE}.</p>
 * 
 * <p>Some permission systems may control access to the eye tracking separately from access to the face tracking, even though the eyes are part of the face. In case the user denied tracking of the eyes, yet, allowed tracking of the face, then the runtime <b>must</b> set the {@code isEyeFollowingBlendshapesValid} field to {@link XR10#XR_FALSE FALSE} on the supplied {@link XrFaceExpressionStatusFB} for indicating that eye tracking data is not available, but at the same time <b>may</b> set the {@code isValid} field to {@link XR10#XR_TRUE TRUE} on the supplied {@link XrFaceExpressionStatusFB} for indicating that another part of the face is tracked properly.</p>
 */
public class FBFaceTracking {

    /** The extension specification version. */
    public static final int XR_FB_face_tracking_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_FACE_TRACKING_EXTENSION_NAME = "XR_FB_face_tracking";

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_FACE_TRACKER_FB = 1000201000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_FB TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_FB}</li>
     * <li>{@link #XR_TYPE_FACE_TRACKER_CREATE_INFO_FB TYPE_FACE_TRACKER_CREATE_INFO_FB}</li>
     * <li>{@link #XR_TYPE_FACE_EXPRESSION_INFO_FB TYPE_FACE_EXPRESSION_INFO_FB}</li>
     * <li>{@link #XR_TYPE_FACE_EXPRESSION_WEIGHTS_FB TYPE_FACE_EXPRESSION_WEIGHTS_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_FB = 1000201004,
        XR_TYPE_FACE_TRACKER_CREATE_INFO_FB        = 1000201005,
        XR_TYPE_FACE_EXPRESSION_INFO_FB            = 1000201002,
        XR_TYPE_FACE_EXPRESSION_WEIGHTS_FB         = 1000201006;

    /**
     * XrFaceExpressionFB - The name of blend shapes that can be tracked
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_FACE_EXPRESSION_BROW_LOWERER_L_FB FACE_EXPRESSION_BROW_LOWERER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_BROW_LOWERER_R_FB FACE_EXPRESSION_BROW_LOWERER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_CHEEK_PUFF_L_FB FACE_EXPRESSION_CHEEK_PUFF_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_CHEEK_PUFF_R_FB FACE_EXPRESSION_CHEEK_PUFF_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_CHEEK_RAISER_L_FB FACE_EXPRESSION_CHEEK_RAISER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_CHEEK_RAISER_R_FB FACE_EXPRESSION_CHEEK_RAISER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_CHEEK_SUCK_L_FB FACE_EXPRESSION_CHEEK_SUCK_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_CHEEK_SUCK_R_FB FACE_EXPRESSION_CHEEK_SUCK_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_CHIN_RAISER_B_FB FACE_EXPRESSION_CHIN_RAISER_B_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_CHIN_RAISER_T_FB FACE_EXPRESSION_CHIN_RAISER_T_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_DIMPLER_L_FB FACE_EXPRESSION_DIMPLER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_DIMPLER_R_FB FACE_EXPRESSION_DIMPLER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_EYES_CLOSED_L_FB FACE_EXPRESSION_EYES_CLOSED_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_EYES_CLOSED_R_FB FACE_EXPRESSION_EYES_CLOSED_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_EYES_LOOK_DOWN_L_FB FACE_EXPRESSION_EYES_LOOK_DOWN_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_EYES_LOOK_DOWN_R_FB FACE_EXPRESSION_EYES_LOOK_DOWN_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_EYES_LOOK_LEFT_L_FB FACE_EXPRESSION_EYES_LOOK_LEFT_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_EYES_LOOK_LEFT_R_FB FACE_EXPRESSION_EYES_LOOK_LEFT_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_EYES_LOOK_RIGHT_L_FB FACE_EXPRESSION_EYES_LOOK_RIGHT_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_EYES_LOOK_RIGHT_R_FB FACE_EXPRESSION_EYES_LOOK_RIGHT_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_EYES_LOOK_UP_L_FB FACE_EXPRESSION_EYES_LOOK_UP_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_EYES_LOOK_UP_R_FB FACE_EXPRESSION_EYES_LOOK_UP_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_INNER_BROW_RAISER_L_FB FACE_EXPRESSION_INNER_BROW_RAISER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_INNER_BROW_RAISER_R_FB FACE_EXPRESSION_INNER_BROW_RAISER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_JAW_DROP_FB FACE_EXPRESSION_JAW_DROP_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_JAW_SIDEWAYS_LEFT_FB FACE_EXPRESSION_JAW_SIDEWAYS_LEFT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_JAW_SIDEWAYS_RIGHT_FB FACE_EXPRESSION_JAW_SIDEWAYS_RIGHT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_JAW_THRUST_FB FACE_EXPRESSION_JAW_THRUST_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LID_TIGHTENER_L_FB FACE_EXPRESSION_LID_TIGHTENER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LID_TIGHTENER_R_FB FACE_EXPRESSION_LID_TIGHTENER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_CORNER_DEPRESSOR_L_FB FACE_EXPRESSION_LIP_CORNER_DEPRESSOR_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_CORNER_DEPRESSOR_R_FB FACE_EXPRESSION_LIP_CORNER_DEPRESSOR_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_CORNER_PULLER_L_FB FACE_EXPRESSION_LIP_CORNER_PULLER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_CORNER_PULLER_R_FB FACE_EXPRESSION_LIP_CORNER_PULLER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_FUNNELER_LB_FB FACE_EXPRESSION_LIP_FUNNELER_LB_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_FUNNELER_LT_FB FACE_EXPRESSION_LIP_FUNNELER_LT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_FUNNELER_RB_FB FACE_EXPRESSION_LIP_FUNNELER_RB_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_FUNNELER_RT_FB FACE_EXPRESSION_LIP_FUNNELER_RT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_PRESSOR_L_FB FACE_EXPRESSION_LIP_PRESSOR_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_PRESSOR_R_FB FACE_EXPRESSION_LIP_PRESSOR_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_PUCKER_L_FB FACE_EXPRESSION_LIP_PUCKER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_PUCKER_R_FB FACE_EXPRESSION_LIP_PUCKER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_STRETCHER_L_FB FACE_EXPRESSION_LIP_STRETCHER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_STRETCHER_R_FB FACE_EXPRESSION_LIP_STRETCHER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_SUCK_LB_FB FACE_EXPRESSION_LIP_SUCK_LB_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_SUCK_LT_FB FACE_EXPRESSION_LIP_SUCK_LT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_SUCK_RB_FB FACE_EXPRESSION_LIP_SUCK_RB_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_SUCK_RT_FB FACE_EXPRESSION_LIP_SUCK_RT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_TIGHTENER_L_FB FACE_EXPRESSION_LIP_TIGHTENER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIP_TIGHTENER_R_FB FACE_EXPRESSION_LIP_TIGHTENER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LIPS_TOWARD_FB FACE_EXPRESSION_LIPS_TOWARD_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LOWER_LIP_DEPRESSOR_L_FB FACE_EXPRESSION_LOWER_LIP_DEPRESSOR_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_LOWER_LIP_DEPRESSOR_R_FB FACE_EXPRESSION_LOWER_LIP_DEPRESSOR_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_MOUTH_LEFT_FB FACE_EXPRESSION_MOUTH_LEFT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_MOUTH_RIGHT_FB FACE_EXPRESSION_MOUTH_RIGHT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_NOSE_WRINKLER_L_FB FACE_EXPRESSION_NOSE_WRINKLER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_NOSE_WRINKLER_R_FB FACE_EXPRESSION_NOSE_WRINKLER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_OUTER_BROW_RAISER_L_FB FACE_EXPRESSION_OUTER_BROW_RAISER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_OUTER_BROW_RAISER_R_FB FACE_EXPRESSION_OUTER_BROW_RAISER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_UPPER_LID_RAISER_L_FB FACE_EXPRESSION_UPPER_LID_RAISER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_UPPER_LID_RAISER_R_FB FACE_EXPRESSION_UPPER_LID_RAISER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_UPPER_LIP_RAISER_L_FB FACE_EXPRESSION_UPPER_LIP_RAISER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_UPPER_LIP_RAISER_R_FB FACE_EXPRESSION_UPPER_LIP_RAISER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION_COUNT_FB FACE_EXPRESSION_COUNT_FB}</li>
     * </ul>
     */
    public static final int
        XR_FACE_EXPRESSION_BROW_LOWERER_L_FB         = 0,
        XR_FACE_EXPRESSION_BROW_LOWERER_R_FB         = 1,
        XR_FACE_EXPRESSION_CHEEK_PUFF_L_FB           = 2,
        XR_FACE_EXPRESSION_CHEEK_PUFF_R_FB           = 3,
        XR_FACE_EXPRESSION_CHEEK_RAISER_L_FB         = 4,
        XR_FACE_EXPRESSION_CHEEK_RAISER_R_FB         = 5,
        XR_FACE_EXPRESSION_CHEEK_SUCK_L_FB           = 6,
        XR_FACE_EXPRESSION_CHEEK_SUCK_R_FB           = 7,
        XR_FACE_EXPRESSION_CHIN_RAISER_B_FB          = 8,
        XR_FACE_EXPRESSION_CHIN_RAISER_T_FB          = 9,
        XR_FACE_EXPRESSION_DIMPLER_L_FB              = 10,
        XR_FACE_EXPRESSION_DIMPLER_R_FB              = 11,
        XR_FACE_EXPRESSION_EYES_CLOSED_L_FB          = 12,
        XR_FACE_EXPRESSION_EYES_CLOSED_R_FB          = 13,
        XR_FACE_EXPRESSION_EYES_LOOK_DOWN_L_FB       = 14,
        XR_FACE_EXPRESSION_EYES_LOOK_DOWN_R_FB       = 15,
        XR_FACE_EXPRESSION_EYES_LOOK_LEFT_L_FB       = 16,
        XR_FACE_EXPRESSION_EYES_LOOK_LEFT_R_FB       = 17,
        XR_FACE_EXPRESSION_EYES_LOOK_RIGHT_L_FB      = 18,
        XR_FACE_EXPRESSION_EYES_LOOK_RIGHT_R_FB      = 19,
        XR_FACE_EXPRESSION_EYES_LOOK_UP_L_FB         = 20,
        XR_FACE_EXPRESSION_EYES_LOOK_UP_R_FB         = 21,
        XR_FACE_EXPRESSION_INNER_BROW_RAISER_L_FB    = 22,
        XR_FACE_EXPRESSION_INNER_BROW_RAISER_R_FB    = 23,
        XR_FACE_EXPRESSION_JAW_DROP_FB               = 24,
        XR_FACE_EXPRESSION_JAW_SIDEWAYS_LEFT_FB      = 25,
        XR_FACE_EXPRESSION_JAW_SIDEWAYS_RIGHT_FB     = 26,
        XR_FACE_EXPRESSION_JAW_THRUST_FB             = 27,
        XR_FACE_EXPRESSION_LID_TIGHTENER_L_FB        = 28,
        XR_FACE_EXPRESSION_LID_TIGHTENER_R_FB        = 29,
        XR_FACE_EXPRESSION_LIP_CORNER_DEPRESSOR_L_FB = 30,
        XR_FACE_EXPRESSION_LIP_CORNER_DEPRESSOR_R_FB = 31,
        XR_FACE_EXPRESSION_LIP_CORNER_PULLER_L_FB    = 32,
        XR_FACE_EXPRESSION_LIP_CORNER_PULLER_R_FB    = 33,
        XR_FACE_EXPRESSION_LIP_FUNNELER_LB_FB        = 34,
        XR_FACE_EXPRESSION_LIP_FUNNELER_LT_FB        = 35,
        XR_FACE_EXPRESSION_LIP_FUNNELER_RB_FB        = 36,
        XR_FACE_EXPRESSION_LIP_FUNNELER_RT_FB        = 37,
        XR_FACE_EXPRESSION_LIP_PRESSOR_L_FB          = 38,
        XR_FACE_EXPRESSION_LIP_PRESSOR_R_FB          = 39,
        XR_FACE_EXPRESSION_LIP_PUCKER_L_FB           = 40,
        XR_FACE_EXPRESSION_LIP_PUCKER_R_FB           = 41,
        XR_FACE_EXPRESSION_LIP_STRETCHER_L_FB        = 42,
        XR_FACE_EXPRESSION_LIP_STRETCHER_R_FB        = 43,
        XR_FACE_EXPRESSION_LIP_SUCK_LB_FB            = 44,
        XR_FACE_EXPRESSION_LIP_SUCK_LT_FB            = 45,
        XR_FACE_EXPRESSION_LIP_SUCK_RB_FB            = 46,
        XR_FACE_EXPRESSION_LIP_SUCK_RT_FB            = 47,
        XR_FACE_EXPRESSION_LIP_TIGHTENER_L_FB        = 48,
        XR_FACE_EXPRESSION_LIP_TIGHTENER_R_FB        = 49,
        XR_FACE_EXPRESSION_LIPS_TOWARD_FB            = 50,
        XR_FACE_EXPRESSION_LOWER_LIP_DEPRESSOR_L_FB  = 51,
        XR_FACE_EXPRESSION_LOWER_LIP_DEPRESSOR_R_FB  = 52,
        XR_FACE_EXPRESSION_MOUTH_LEFT_FB             = 53,
        XR_FACE_EXPRESSION_MOUTH_RIGHT_FB            = 54,
        XR_FACE_EXPRESSION_NOSE_WRINKLER_L_FB        = 55,
        XR_FACE_EXPRESSION_NOSE_WRINKLER_R_FB        = 56,
        XR_FACE_EXPRESSION_OUTER_BROW_RAISER_L_FB    = 57,
        XR_FACE_EXPRESSION_OUTER_BROW_RAISER_R_FB    = 58,
        XR_FACE_EXPRESSION_UPPER_LID_RAISER_L_FB     = 59,
        XR_FACE_EXPRESSION_UPPER_LID_RAISER_R_FB     = 60,
        XR_FACE_EXPRESSION_UPPER_LIP_RAISER_L_FB     = 61,
        XR_FACE_EXPRESSION_UPPER_LIP_RAISER_R_FB     = 62,
        XR_FACE_EXPRESSION_COUNT_FB                  = 63;

    /**
     * XrFaceExpressionSetFB - The set of blend shapes of a facial expression to track.
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_FACE_EXPRESSION_SET_DEFAULT_FB FACE_EXPRESSION_SET_DEFAULT_FB} — indicates that the created {@code XrFaceTrackerFB} tracks the set of blend shapes described by {@code XrFaceExpressionFB} enum, i.e. the {@link #xrGetFaceExpressionWeightsFB GetFaceExpressionWeightsFB} function returns an array of blend shapes with the count of {@link #XR_FACE_EXPRESSION_COUNT_FB FACE_EXPRESSION_COUNT_FB} and <b>can</b> be indexed using {@code XrFaceExpressionFB}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFaceTrackerCreateInfoFB}</p>
     */
    public static final int XR_FACE_EXPRESSION_SET_DEFAULT_FB = 0;

    /**
     * XrFaceConfidenceFB - The name of face areas where confidence is known
     * 
     * <h5>Description</h5>
     * 
     * <p>The "upper face" area represents everything above the upper lip, including eye, eyebrows + cheek, and nose. The "lower face" area represents everything under eyes, including mouth, chin + cheek, and nose. Cheek and nose areas contribute to both "upper face" and "lower face" areas.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_FACE_CONFIDENCE_LOWER_FACE_FB FACE_CONFIDENCE_LOWER_FACE_FB}</li>
     * <li>{@link #XR_FACE_CONFIDENCE_UPPER_FACE_FB FACE_CONFIDENCE_UPPER_FACE_FB}</li>
     * <li>{@link #XR_FACE_CONFIDENCE_COUNT_FB FACE_CONFIDENCE_COUNT_FB}</li>
     * </ul>
     */
    public static final int
        XR_FACE_CONFIDENCE_LOWER_FACE_FB = 0,
        XR_FACE_CONFIDENCE_UPPER_FACE_FB = 1,
        XR_FACE_CONFIDENCE_COUNT_FB      = 2;

    protected FBFaceTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateFaceTrackerFB ] ---

    /** Unsafe version of: {@link #xrCreateFaceTrackerFB CreateFaceTrackerFB} */
    public static int nxrCreateFaceTrackerFB(XrSession session, long createInfo, long faceTracker) {
        long __functionAddress = session.getCapabilities().xrCreateFaceTrackerFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, faceTracker, __functionAddress);
    }

    /**
     * Create a face tracking handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateFaceTrackerFB CreateFaceTrackerFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateFaceTrackerFB(
     *     XrSession                                   session,
     *     const XrFaceTrackerCreateInfoFB*            createInfo,
     *     XrFaceTrackerFB*                            faceTracker);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>An application <b>can</b> create an {@code XrFaceTrackerFB} handle using {@link #xrCreateFaceTrackerFB CreateFaceTrackerFB} function.</p>
     * 
     * <p>If the system does not support face tracking, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link #xrCreateFaceTrackerFB CreateFaceTrackerFB}. In this case, the runtime <b>must</b> return {@link XR10#XR_FALSE FALSE} for {@code supportsFaceTracking} in {@link XrSystemFaceTrackingPropertiesFB} when the function {@link XR10#xrGetSystemProperties GetSystemProperties} is called, so that the application <b>can</b> avoid creating a face tracker.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBFaceTracking XR_FB_face_tracking} extension <b>must</b> be enabled prior to calling {@link #xrCreateFaceTrackerFB CreateFaceTrackerFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrFaceTrackerCreateInfoFB} structure</li>
     * <li>{@code faceTracker} <b>must</b> be a pointer to an {@code XrFaceTrackerFB} handle</li>
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
     * <p>{@link XrFaceTrackerCreateInfoFB}</p>
     *
     * @param session     an {@code XrSession} in which the face tracker will be active.
     * @param createInfo  the {@link XrFaceTrackerCreateInfoFB} used to specify the face tracker.
     * @param faceTracker the returned {@code XrFaceTrackerFB} handle.
     */
    @NativeType("XrResult")
    public static int xrCreateFaceTrackerFB(XrSession session, @NativeType("XrFaceTrackerCreateInfoFB const *") XrFaceTrackerCreateInfoFB createInfo, @NativeType("XrFaceTrackerFB *") PointerBuffer faceTracker) {
        if (CHECKS) {
            check(faceTracker, 1);
        }
        return nxrCreateFaceTrackerFB(session, createInfo.address(), memAddress(faceTracker));
    }

    // --- [ xrDestroyFaceTrackerFB ] ---

    /**
     * Destroy a facial expressions handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyFaceTrackerFB DestroyFaceTrackerFB} function releases the {@code faceTracker} and the underlying resources when face tracking experience is over.</p>
     * 
     * <pre><code>
     * XrResult xrDestroyFaceTrackerFB(
     *     XrFaceTrackerFB                             faceTracker);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBFaceTracking XR_FB_face_tracking} extension <b>must</b> be enabled prior to calling {@link #xrDestroyFaceTrackerFB DestroyFaceTrackerFB}</li>
     * <li>{@code faceTracker} <b>must</b> be a valid {@code XrFaceTrackerFB} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code faceTracker}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * @param faceTracker an {@code XrFaceTrackerFB} previously created by {@link #xrCreateFaceTrackerFB CreateFaceTrackerFB}.
     */
    @NativeType("XrResult")
    public static int xrDestroyFaceTrackerFB(XrFaceTrackerFB faceTracker) {
        long __functionAddress = faceTracker.getCapabilities().xrDestroyFaceTrackerFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(faceTracker.address(), __functionAddress);
    }

    // --- [ xrGetFaceExpressionWeightsFB ] ---

    /** Unsafe version of: {@link #xrGetFaceExpressionWeightsFB GetFaceExpressionWeightsFB} */
    public static int nxrGetFaceExpressionWeightsFB(XrFaceTrackerFB faceTracker, long expressionInfo, long expressionWeights) {
        long __functionAddress = faceTracker.getCapabilities().xrGetFaceExpressionWeightsFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(faceTracker.address(), expressionInfo, expressionWeights, __functionAddress);
    }

    /**
     * Obtain blend shapes of facial expression.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetFaceExpressionWeightsFB GetFaceExpressionWeightsFB} function return blend shapes of facial expression at a given time.</p>
     * 
     * <pre><code>
     * XrResult xrGetFaceExpressionWeightsFB(
     *     XrFaceTrackerFB                             faceTracker,
     *     const XrFaceExpressionInfoFB*               expressionInfo,
     *     XrFaceExpressionWeightsFB*                  expressionWeights);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBFaceTracking XR_FB_face_tracking} extension <b>must</b> be enabled prior to calling {@link #xrGetFaceExpressionWeightsFB GetFaceExpressionWeightsFB}</li>
     * <li>{@code faceTracker} <b>must</b> be a valid {@code XrFaceTrackerFB} handle</li>
     * <li>{@code expressionInfo} <b>must</b> be a pointer to a valid {@link XrFaceExpressionInfoFB} structure</li>
     * <li>{@code expressionWeights} <b>must</b> be a pointer to an {@link XrFaceExpressionWeightsFB} structure</li>
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
     * <p>{@link XrFaceExpressionInfoFB}, {@link XrFaceExpressionWeightsFB}</p>
     *
     * @param faceTracker       an {@code XrFaceTrackerFB} previously created by {@link #xrCreateFaceTrackerFB CreateFaceTrackerFB}.
     * @param expressionInfo    a pointer to {@link XrFaceExpressionInfoFB} describing information to obtain face expression.
     * @param expressionWeights a pointer to {@link XrFaceExpressionWeightsFB} receiving the returned facial expression weights.
     */
    @NativeType("XrResult")
    public static int xrGetFaceExpressionWeightsFB(XrFaceTrackerFB faceTracker, @NativeType("XrFaceExpressionInfoFB const *") XrFaceExpressionInfoFB expressionInfo, @NativeType("XrFaceExpressionWeightsFB *") XrFaceExpressionWeightsFB expressionWeights) {
        return nxrGetFaceExpressionWeightsFB(faceTracker, expressionInfo.address(), expressionWeights.address());
    }

}