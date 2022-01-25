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

/** The HTC_facial_tracking extension. */
public class HTCFacialTracking {

    /** The extension specification version. */
    public static final int XR_HTC_facial_tracking_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_HTC_FACIAL_TRACKING_EXTENSION_NAME = "XR_HTC_facial_tracking";

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_FACIAL_TRACKER_HTC = 1000104000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC}</li>
     * <li>{@link #XR_TYPE_FACIAL_TRACKER_CREATE_INFO_HTC TYPE_FACIAL_TRACKER_CREATE_INFO_HTC}</li>
     * <li>{@link #XR_TYPE_FACIAL_EXPRESSIONS_HTC TYPE_FACIAL_EXPRESSIONS_HTC}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC = 1000104000,
        XR_TYPE_FACIAL_TRACKER_CREATE_INFO_HTC        = 1000104001,
        XR_TYPE_FACIAL_EXPRESSIONS_HTC                = 1000104002;

    /**
     * XrEyeExpressionHTC - The blend shapes of eye expression
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_EYE_EXPRESSION_LEFT_BLINK_HTC EYE_EXPRESSION_LEFT_BLINK_HTC}</li>
     * <li>{@link #XR_EYE_EXPRESSION_LEFT_WIDE_HTC EYE_EXPRESSION_LEFT_WIDE_HTC}</li>
     * <li>{@link #XR_EYE_EXPRESSION_RIGHT_BLINK_HTC EYE_EXPRESSION_RIGHT_BLINK_HTC}</li>
     * <li>{@link #XR_EYE_EXPRESSION_RIGHT_WIDE_HTC EYE_EXPRESSION_RIGHT_WIDE_HTC}</li>
     * <li>{@link #XR_EYE_EXPRESSION_LEFT_SQUEEZE_HTC EYE_EXPRESSION_LEFT_SQUEEZE_HTC}</li>
     * <li>{@link #XR_EYE_EXPRESSION_RIGHT_SQUEEZE_HTC EYE_EXPRESSION_RIGHT_SQUEEZE_HTC}</li>
     * <li>{@link #XR_EYE_EXPRESSION_LEFT_DOWN_HTC EYE_EXPRESSION_LEFT_DOWN_HTC}</li>
     * <li>{@link #XR_EYE_EXPRESSION_RIGHT_DOWN_HTC EYE_EXPRESSION_RIGHT_DOWN_HTC}</li>
     * <li>{@link #XR_EYE_EXPRESSION_LEFT_OUT_HTC EYE_EXPRESSION_LEFT_OUT_HTC}</li>
     * <li>{@link #XR_EYE_EXPRESSION_RIGHT_IN_HTC EYE_EXPRESSION_RIGHT_IN_HTC}</li>
     * <li>{@link #XR_EYE_EXPRESSION_LEFT_IN_HTC EYE_EXPRESSION_LEFT_IN_HTC}</li>
     * <li>{@link #XR_EYE_EXPRESSION_RIGHT_OUT_HTC EYE_EXPRESSION_RIGHT_OUT_HTC}</li>
     * <li>{@link #XR_EYE_EXPRESSION_LEFT_UP_HTC EYE_EXPRESSION_LEFT_UP_HTC}</li>
     * <li>{@link #XR_EYE_EXPRESSION_RIGHT_UP_HTC EYE_EXPRESSION_RIGHT_UP_HTC}</li>
     * </ul>
     */
    public static final int
        XR_EYE_EXPRESSION_LEFT_BLINK_HTC    = 0,
        XR_EYE_EXPRESSION_LEFT_WIDE_HTC     = 1,
        XR_EYE_EXPRESSION_RIGHT_BLINK_HTC   = 2,
        XR_EYE_EXPRESSION_RIGHT_WIDE_HTC    = 3,
        XR_EYE_EXPRESSION_LEFT_SQUEEZE_HTC  = 4,
        XR_EYE_EXPRESSION_RIGHT_SQUEEZE_HTC = 5,
        XR_EYE_EXPRESSION_LEFT_DOWN_HTC     = 6,
        XR_EYE_EXPRESSION_RIGHT_DOWN_HTC    = 7,
        XR_EYE_EXPRESSION_LEFT_OUT_HTC      = 8,
        XR_EYE_EXPRESSION_RIGHT_IN_HTC      = 9,
        XR_EYE_EXPRESSION_LEFT_IN_HTC       = 10,
        XR_EYE_EXPRESSION_RIGHT_OUT_HTC     = 11,
        XR_EYE_EXPRESSION_LEFT_UP_HTC       = 12,
        XR_EYE_EXPRESSION_RIGHT_UP_HTC      = 13;

    /**
     * XrLipExpressionHTC - The blend shapes of lip expression
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_LIP_EXPRESSION_JAW_RIGHT_HTC LIP_EXPRESSION_JAW_RIGHT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_JAW_LEFT_HTC LIP_EXPRESSION_JAW_LEFT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_JAW_FORWARD_HTC LIP_EXPRESSION_JAW_FORWARD_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_JAW_OPEN_HTC LIP_EXPRESSION_JAW_OPEN_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_APE_SHAPE_HTC LIP_EXPRESSION_MOUTH_APE_SHAPE_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_UPPER_RIGHT_HTC LIP_EXPRESSION_MOUTH_UPPER_RIGHT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_UPPER_LEFT_HTC LIP_EXPRESSION_MOUTH_UPPER_LEFT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_LOWER_RIGHT_HTC LIP_EXPRESSION_MOUTH_LOWER_RIGHT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_LOWER_LEFT_HTC LIP_EXPRESSION_MOUTH_LOWER_LEFT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_UPPER_OVERTURN_HTC LIP_EXPRESSION_MOUTH_UPPER_OVERTURN_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_LOWER_OVERTURN_HTC LIP_EXPRESSION_MOUTH_LOWER_OVERTURN_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_POUT_HTC LIP_EXPRESSION_MOUTH_POUT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_SMILE_RIGHT_HTC LIP_EXPRESSION_MOUTH_SMILE_RIGHT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_SMILE_LEFT_HTC LIP_EXPRESSION_MOUTH_SMILE_LEFT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_SAD_RIGHT_HTC LIP_EXPRESSION_MOUTH_SAD_RIGHT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_SAD_LEFT_HTC LIP_EXPRESSION_MOUTH_SAD_LEFT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_CHEEK_PUFF_RIGHT_HTC LIP_EXPRESSION_CHEEK_PUFF_RIGHT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_CHEEK_PUFF_LEFT_HTC LIP_EXPRESSION_CHEEK_PUFF_LEFT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_CHEEK_SUCK_HTC LIP_EXPRESSION_CHEEK_SUCK_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_UPPER_UPRIGHT_HTC LIP_EXPRESSION_MOUTH_UPPER_UPRIGHT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_UPPER_UPLEFT_HTC LIP_EXPRESSION_MOUTH_UPPER_UPLEFT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_LOWER_DOWNRIGHT_HTC LIP_EXPRESSION_MOUTH_LOWER_DOWNRIGHT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_LOWER_DOWNLEFT_HTC LIP_EXPRESSION_MOUTH_LOWER_DOWNLEFT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_UPPER_INSIDE_HTC LIP_EXPRESSION_MOUTH_UPPER_INSIDE_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_LOWER_INSIDE_HTC LIP_EXPRESSION_MOUTH_LOWER_INSIDE_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_MOUTH_LOWER_OVERLAY_HTC LIP_EXPRESSION_MOUTH_LOWER_OVERLAY_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_TONGUE_LONGSTEP1_HTC LIP_EXPRESSION_TONGUE_LONGSTEP1_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_TONGUE_LEFT_HTC LIP_EXPRESSION_TONGUE_LEFT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_TONGUE_RIGHT_HTC LIP_EXPRESSION_TONGUE_RIGHT_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_TONGUE_UP_HTC LIP_EXPRESSION_TONGUE_UP_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_TONGUE_DOWN_HTC LIP_EXPRESSION_TONGUE_DOWN_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_TONGUE_ROLL_HTC LIP_EXPRESSION_TONGUE_ROLL_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_TONGUE_LONGSTEP2_HTC LIP_EXPRESSION_TONGUE_LONGSTEP2_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_TONGUE_UPRIGHT_MORPH_HTC LIP_EXPRESSION_TONGUE_UPRIGHT_MORPH_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_TONGUE_UPLEFT_MORPH_HTC LIP_EXPRESSION_TONGUE_UPLEFT_MORPH_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_TONGUE_DOWNRIGHT_MORPH_HTC LIP_EXPRESSION_TONGUE_DOWNRIGHT_MORPH_HTC}</li>
     * <li>{@link #XR_LIP_EXPRESSION_TONGUE_DOWNLEFT_MORPH_HTC LIP_EXPRESSION_TONGUE_DOWNLEFT_MORPH_HTC}</li>
     * </ul>
     */
    public static final int
        XR_LIP_EXPRESSION_JAW_RIGHT_HTC              = 0,
        XR_LIP_EXPRESSION_JAW_LEFT_HTC               = 1,
        XR_LIP_EXPRESSION_JAW_FORWARD_HTC            = 2,
        XR_LIP_EXPRESSION_JAW_OPEN_HTC               = 3,
        XR_LIP_EXPRESSION_MOUTH_APE_SHAPE_HTC        = 4,
        XR_LIP_EXPRESSION_MOUTH_UPPER_RIGHT_HTC      = 5,
        XR_LIP_EXPRESSION_MOUTH_UPPER_LEFT_HTC       = 6,
        XR_LIP_EXPRESSION_MOUTH_LOWER_RIGHT_HTC      = 7,
        XR_LIP_EXPRESSION_MOUTH_LOWER_LEFT_HTC       = 8,
        XR_LIP_EXPRESSION_MOUTH_UPPER_OVERTURN_HTC   = 9,
        XR_LIP_EXPRESSION_MOUTH_LOWER_OVERTURN_HTC   = 10,
        XR_LIP_EXPRESSION_MOUTH_POUT_HTC             = 11,
        XR_LIP_EXPRESSION_MOUTH_SMILE_RIGHT_HTC      = 12,
        XR_LIP_EXPRESSION_MOUTH_SMILE_LEFT_HTC       = 13,
        XR_LIP_EXPRESSION_MOUTH_SAD_RIGHT_HTC        = 14,
        XR_LIP_EXPRESSION_MOUTH_SAD_LEFT_HTC         = 15,
        XR_LIP_EXPRESSION_CHEEK_PUFF_RIGHT_HTC       = 16,
        XR_LIP_EXPRESSION_CHEEK_PUFF_LEFT_HTC        = 17,
        XR_LIP_EXPRESSION_CHEEK_SUCK_HTC             = 18,
        XR_LIP_EXPRESSION_MOUTH_UPPER_UPRIGHT_HTC    = 19,
        XR_LIP_EXPRESSION_MOUTH_UPPER_UPLEFT_HTC     = 20,
        XR_LIP_EXPRESSION_MOUTH_LOWER_DOWNRIGHT_HTC  = 21,
        XR_LIP_EXPRESSION_MOUTH_LOWER_DOWNLEFT_HTC   = 22,
        XR_LIP_EXPRESSION_MOUTH_UPPER_INSIDE_HTC     = 23,
        XR_LIP_EXPRESSION_MOUTH_LOWER_INSIDE_HTC     = 24,
        XR_LIP_EXPRESSION_MOUTH_LOWER_OVERLAY_HTC    = 25,
        XR_LIP_EXPRESSION_TONGUE_LONGSTEP1_HTC       = 26,
        XR_LIP_EXPRESSION_TONGUE_LEFT_HTC            = 27,
        XR_LIP_EXPRESSION_TONGUE_RIGHT_HTC           = 28,
        XR_LIP_EXPRESSION_TONGUE_UP_HTC              = 29,
        XR_LIP_EXPRESSION_TONGUE_DOWN_HTC            = 30,
        XR_LIP_EXPRESSION_TONGUE_ROLL_HTC            = 31,
        XR_LIP_EXPRESSION_TONGUE_LONGSTEP2_HTC       = 32,
        XR_LIP_EXPRESSION_TONGUE_UPRIGHT_MORPH_HTC   = 33,
        XR_LIP_EXPRESSION_TONGUE_UPLEFT_MORPH_HTC    = 34,
        XR_LIP_EXPRESSION_TONGUE_DOWNRIGHT_MORPH_HTC = 35,
        XR_LIP_EXPRESSION_TONGUE_DOWNLEFT_MORPH_HTC  = 36;

    /**
     * XrFacialTrackingTypeHTC - Describes the type of facial tracking.
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC} — Specifies this handle will observe eye expressions, with values indexed by {@code XrEyeExpressionHTC} whose count is {@link #XR_FACIAL_EXPRESSION_EYE_COUNT_HTC FACIAL_EXPRESSION_EYE_COUNT_HTC}.</li>
     * <li>{@link #XR_FACIAL_TRACKING_TYPE_LIP_DEFAULT_HTC FACIAL_TRACKING_TYPE_LIP_DEFAULT_HTC} — Specifies this handle will observe lip expressions, with values indexed by {@code XrLipExpressionHTC} whose count is {@link #XR_FACIAL_EXPRESSION_LIP_COUNT_HTC FACIAL_EXPRESSION_LIP_COUNT_HTC}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFacialTrackerCreateInfoHTC}</p>
     */
    public static final int
        XR_FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC = 1,
        XR_FACIAL_TRACKING_TYPE_LIP_DEFAULT_HTC = 2;

    /** API Constants */
    public static final int
        XR_FACIAL_EXPRESSION_EYE_COUNT_HTC = 0xE,
        XR_FACIAL_EXPRESSION_LIP_COUNT_HTC = 0x25;

    protected HTCFacialTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateFacialTrackerHTC ] ---

    /** Unsafe version of: {@link #xrCreateFacialTrackerHTC CreateFacialTrackerHTC} */
    public static int nxrCreateFacialTrackerHTC(XrSession session, long createInfo, long facialTracker) {
        long __functionAddress = session.getCapabilities().xrCreateFacialTrackerHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, facialTracker, __functionAddress);
    }

    /**
     * Create an facial tracker handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateFacialTrackerHTC CreateFacialTrackerHTC} function is defined as</p>
     * 
     * <pre><code>
     * XrResult xrCreateFacialTrackerHTC(
     *     XrSession                                   session,
     *     const XrFacialTrackerCreateInfoHTC*         createInfo,
     *     XrFacialTrackerHTC*                         facialTracker);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>An application <b>can</b> create an {@code XrFacialTrackerHTC} handle using {@link #xrCreateFacialTrackerHTC CreateFacialTrackerHTC}.</p>
     * 
     * <p>If the system does not support eye tracking or lip tracking, runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link #xrCreateFacialTrackerHTC CreateFacialTrackerHTC} according to the corresponding case. In this case, the runtime <b>must</b> return {@link XR10#XR_FALSE FALSE} for {@code supportEyeFacialTracking} or {@code supportLipFacialTracking} in {@link XrSystemFacialTrackingPropertiesHTC} when the function {@link XR10#xrGetSystemProperties GetSystemProperties} is called, so that the application <b>may</b> avoid creating a facial tracker.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link HTCFacialTracking XR_HTC_facial_tracking} extension <b>must</b> be enabled prior to calling {@link #xrCreateFacialTrackerHTC CreateFacialTrackerHTC}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrFacialTrackerCreateInfoHTC} structure</li>
     * <li>{@code facialTracker} <b>must</b> be a pointer to an {@code XrFacialTrackerHTC} handle</li>
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
     * <p>{@link XrFacialTrackerCreateInfoHTC}, {@link #xrDestroyFacialTrackerHTC DestroyFacialTrackerHTC}</p>
     *
     * @param session       an {@code XrSession} in which the facial expression will be active.
     * @param createInfo    the {@link XrFacialTrackerCreateInfoHTC} used to specify the facial tracking type.
     * @param facialTracker the returned {@code XrFacialTrackerHTC} handle.
     */
    @NativeType("XrResult")
    public static int xrCreateFacialTrackerHTC(XrSession session, @NativeType("XrFacialTrackerCreateInfoHTC const *") XrFacialTrackerCreateInfoHTC createInfo, @NativeType("XrFacialTrackerHTC *") PointerBuffer facialTracker) {
        if (CHECKS) {
            check(facialTracker, 1);
        }
        return nxrCreateFacialTrackerHTC(session, createInfo.address(), memAddress(facialTracker));
    }

    // --- [ xrDestroyFacialTrackerHTC ] ---

    /**
     * Destroy a facial tracker handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyFacialTrackerHTC DestroyFacialTrackerHTC} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyFacialTrackerHTC(
     *     XrFacialTrackerHTC                          facialTracker);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrDestroyFacialTrackerHTC DestroyFacialTrackerHTC} releases the {@code facialTracker} and the underlying resources when finished with facial tracking experiences.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link HTCFacialTracking XR_HTC_facial_tracking} extension <b>must</b> be enabled prior to calling {@link #xrDestroyFacialTrackerHTC DestroyFacialTrackerHTC}</li>
     * <li>{@code facialTracker} <b>must</b> be a valid {@code XrFacialTrackerHTC} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code facialTracker}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * @param facialTracker an {@code XrFacialTrackerHTC} previously created by {@link #xrCreateFacialTrackerHTC CreateFacialTrackerHTC}.
     */
    @NativeType("XrResult")
    public static int xrDestroyFacialTrackerHTC(XrFacialTrackerHTC facialTracker) {
        long __functionAddress = facialTracker.getCapabilities().xrDestroyFacialTrackerHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(facialTracker.address(), __functionAddress);
    }

    // --- [ xrGetFacialExpressionsHTC ] ---

    /** Unsafe version of: {@link #xrGetFacialExpressionsHTC GetFacialExpressionsHTC} */
    public static int nxrGetFacialExpressionsHTC(XrFacialTrackerHTC facialTracker, long facialExpressions) {
        long __functionAddress = facialTracker.getCapabilities().xrGetFacialExpressionsHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(facialTracker.address(), facialExpressions, __functionAddress);
    }

    /**
     * Retrieve facial expressions.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetFacialExpressionsHTC GetFacialExpressionsHTC} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetFacialExpressionsHTC(
     *     XrFacialTrackerHTC                          facialTracker,
     *     XrFacialExpressionsHTC*                     facialExpressions);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrGetFacialExpressionsHTC GetFacialExpressionsHTC} retrieves an array of values of blend shapes for a facial expression on a given time.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link HTCFacialTracking XR_HTC_facial_tracking} extension <b>must</b> be enabled prior to calling {@link #xrGetFacialExpressionsHTC GetFacialExpressionsHTC}</li>
     * <li>{@code facialTracker} <b>must</b> be a valid {@code XrFacialTrackerHTC} handle</li>
     * <li>{@code facialExpressions} <b>must</b> be a pointer to an {@link XrFacialExpressionsHTC} structure</li>
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
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFacialExpressionsHTC}</p>
     *
     * @param facialTracker     an {@code XrFacialTrackerHTC} previously created by {@link #xrCreateFacialTrackerHTC CreateFacialTrackerHTC}.
     * @param facialExpressions a pointer to {@link XrFacialExpressionsHTC} receiving the returned facial expressions.
     */
    @NativeType("XrResult")
    public static int xrGetFacialExpressionsHTC(XrFacialTrackerHTC facialTracker, @NativeType("XrFacialExpressionsHTC *") XrFacialExpressionsHTC facialExpressions) {
        return nxrGetFacialExpressionsHTC(facialTracker, facialExpressions.address());
    }

}