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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_ML_facial_expression">XR_ML_facial_expression</a> extension.
 * 
 * <p>This extension provides the weights of facial blend shapes usable for a variety of purposes, such as mood monitoring or interpolating the expression of an avatar’s face.</p>
 * 
 * <h5>Permissions</h5>
 * 
 * <p>Android applications <b>must</b> have the com.magicleap.permission.FACIAL_EXPRESSION permission listed in their manifest and granted to use this extension, otherwise {@link #xrCreateFacialExpressionClientML CreateFacialExpressionClientML} will return a {@link #XR_ERROR_FACIAL_EXPRESSION_PERMISSION_DENIED_ML ERROR_FACIAL_EXPRESSION_PERMISSION_DENIED_ML} error. (protection level: dangerous)</p>
 */
public class MLFacialExpression {

    /** The extension specification version. */
    public static final int XR_ML_facial_expression_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_ML_FACIAL_EXPRESSION_EXTENSION_NAME = "XR_ML_facial_expression";

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_FACIAL_EXPRESSION_PERMISSION_DENIED_ML = 1000482000;

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_FACIAL_EXPRESSION_CLIENT_ML = 1000482000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_FACIAL_EXPRESSION_PROPERTIES_ML TYPE_SYSTEM_FACIAL_EXPRESSION_PROPERTIES_ML}</li>
     * <li>{@link #XR_TYPE_FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML TYPE_FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML}</li>
     * <li>{@link #XR_TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_GET_INFO_ML TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_GET_INFO_ML}</li>
     * <li>{@link #XR_TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_ML TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_ML}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_FACIAL_EXPRESSION_PROPERTIES_ML      = 1000482004,
        XR_TYPE_FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML     = 1000482005,
        XR_TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_GET_INFO_ML   = 1000482006,
        XR_TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_ML = 1000482007;

    /**
     * XrFacialBlendShapeML - The names of trackable blend shapes
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFacialExpressionBlendShapePropertiesML}, {@link XrFacialExpressionClientCreateInfoML}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_BROW_LOWERER_L_ML FACIAL_BLEND_SHAPE_BROW_LOWERER_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_BROW_LOWERER_R_ML FACIAL_BLEND_SHAPE_BROW_LOWERER_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_CHEEK_RAISER_L_ML FACIAL_BLEND_SHAPE_CHEEK_RAISER_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_CHEEK_RAISER_R_ML FACIAL_BLEND_SHAPE_CHEEK_RAISER_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_CHIN_RAISER_ML FACIAL_BLEND_SHAPE_CHIN_RAISER_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_DIMPLER_L_ML FACIAL_BLEND_SHAPE_DIMPLER_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_DIMPLER_R_ML FACIAL_BLEND_SHAPE_DIMPLER_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_EYES_CLOSED_L_ML FACIAL_BLEND_SHAPE_EYES_CLOSED_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_EYES_CLOSED_R_ML FACIAL_BLEND_SHAPE_EYES_CLOSED_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_INNER_BROW_RAISER_L_ML FACIAL_BLEND_SHAPE_INNER_BROW_RAISER_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_INNER_BROW_RAISER_R_ML FACIAL_BLEND_SHAPE_INNER_BROW_RAISER_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_JAW_DROP_ML FACIAL_BLEND_SHAPE_JAW_DROP_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LID_TIGHTENER_L_ML FACIAL_BLEND_SHAPE_LID_TIGHTENER_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LID_TIGHTENER_R_ML FACIAL_BLEND_SHAPE_LID_TIGHTENER_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_CORNER_DEPRESSOR_L_ML FACIAL_BLEND_SHAPE_LIP_CORNER_DEPRESSOR_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_CORNER_DEPRESSOR_R_ML FACIAL_BLEND_SHAPE_LIP_CORNER_DEPRESSOR_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_CORNER_PULLER_L_ML FACIAL_BLEND_SHAPE_LIP_CORNER_PULLER_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_CORNER_PULLER_R_ML FACIAL_BLEND_SHAPE_LIP_CORNER_PULLER_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_LB_ML FACIAL_BLEND_SHAPE_LIP_FUNNELER_LB_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_LT_ML FACIAL_BLEND_SHAPE_LIP_FUNNELER_LT_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_RB_ML FACIAL_BLEND_SHAPE_LIP_FUNNELER_RB_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_RT_ML FACIAL_BLEND_SHAPE_LIP_FUNNELER_RT_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_PRESSOR_L_ML FACIAL_BLEND_SHAPE_LIP_PRESSOR_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_PRESSOR_R_ML FACIAL_BLEND_SHAPE_LIP_PRESSOR_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_PUCKER_L_ML FACIAL_BLEND_SHAPE_LIP_PUCKER_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_PUCKER_R_ML FACIAL_BLEND_SHAPE_LIP_PUCKER_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_STRETCHER_L_ML FACIAL_BLEND_SHAPE_LIP_STRETCHER_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_STRETCHER_R_ML FACIAL_BLEND_SHAPE_LIP_STRETCHER_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_SUCK_LB_ML FACIAL_BLEND_SHAPE_LIP_SUCK_LB_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_SUCK_LT_ML FACIAL_BLEND_SHAPE_LIP_SUCK_LT_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_SUCK_RB_ML FACIAL_BLEND_SHAPE_LIP_SUCK_RB_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_SUCK_RT_ML FACIAL_BLEND_SHAPE_LIP_SUCK_RT_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_TIGHTENER_L_ML FACIAL_BLEND_SHAPE_LIP_TIGHTENER_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIP_TIGHTENER_R_ML FACIAL_BLEND_SHAPE_LIP_TIGHTENER_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LIPS_TOWARD_ML FACIAL_BLEND_SHAPE_LIPS_TOWARD_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LOWER_LIP_DEPRESSOR_L_ML FACIAL_BLEND_SHAPE_LOWER_LIP_DEPRESSOR_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_LOWER_LIP_DEPRESSOR_R_ML FACIAL_BLEND_SHAPE_LOWER_LIP_DEPRESSOR_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_NOSE_WRINKLER_L_ML FACIAL_BLEND_SHAPE_NOSE_WRINKLER_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_NOSE_WRINKLER_R_ML FACIAL_BLEND_SHAPE_NOSE_WRINKLER_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_OUTER_BROW_RAISER_L_ML FACIAL_BLEND_SHAPE_OUTER_BROW_RAISER_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_OUTER_BROW_RAISER_R_ML FACIAL_BLEND_SHAPE_OUTER_BROW_RAISER_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_UPPER_LID_RAISER_L_ML FACIAL_BLEND_SHAPE_UPPER_LID_RAISER_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_UPPER_LID_RAISER_R_ML FACIAL_BLEND_SHAPE_UPPER_LID_RAISER_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_UPPER_LIP_RAISER_L_ML FACIAL_BLEND_SHAPE_UPPER_LIP_RAISER_L_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_UPPER_LIP_RAISER_R_ML FACIAL_BLEND_SHAPE_UPPER_LIP_RAISER_R_ML}</li>
     * <li>{@link #XR_FACIAL_BLEND_SHAPE_TONGUE_OUT_ML FACIAL_BLEND_SHAPE_TONGUE_OUT_ML}</li>
     * </ul>
     */
    public static final int
        XR_FACIAL_BLEND_SHAPE_BROW_LOWERER_L_ML         = 0,
        XR_FACIAL_BLEND_SHAPE_BROW_LOWERER_R_ML         = 1,
        XR_FACIAL_BLEND_SHAPE_CHEEK_RAISER_L_ML         = 2,
        XR_FACIAL_BLEND_SHAPE_CHEEK_RAISER_R_ML         = 3,
        XR_FACIAL_BLEND_SHAPE_CHIN_RAISER_ML            = 4,
        XR_FACIAL_BLEND_SHAPE_DIMPLER_L_ML              = 5,
        XR_FACIAL_BLEND_SHAPE_DIMPLER_R_ML              = 6,
        XR_FACIAL_BLEND_SHAPE_EYES_CLOSED_L_ML          = 7,
        XR_FACIAL_BLEND_SHAPE_EYES_CLOSED_R_ML          = 8,
        XR_FACIAL_BLEND_SHAPE_INNER_BROW_RAISER_L_ML    = 9,
        XR_FACIAL_BLEND_SHAPE_INNER_BROW_RAISER_R_ML    = 10,
        XR_FACIAL_BLEND_SHAPE_JAW_DROP_ML               = 11,
        XR_FACIAL_BLEND_SHAPE_LID_TIGHTENER_L_ML        = 12,
        XR_FACIAL_BLEND_SHAPE_LID_TIGHTENER_R_ML        = 13,
        XR_FACIAL_BLEND_SHAPE_LIP_CORNER_DEPRESSOR_L_ML = 14,
        XR_FACIAL_BLEND_SHAPE_LIP_CORNER_DEPRESSOR_R_ML = 15,
        XR_FACIAL_BLEND_SHAPE_LIP_CORNER_PULLER_L_ML    = 16,
        XR_FACIAL_BLEND_SHAPE_LIP_CORNER_PULLER_R_ML    = 17,
        XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_LB_ML        = 18,
        XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_LT_ML        = 19,
        XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_RB_ML        = 20,
        XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_RT_ML        = 21,
        XR_FACIAL_BLEND_SHAPE_LIP_PRESSOR_L_ML          = 22,
        XR_FACIAL_BLEND_SHAPE_LIP_PRESSOR_R_ML          = 23,
        XR_FACIAL_BLEND_SHAPE_LIP_PUCKER_L_ML           = 24,
        XR_FACIAL_BLEND_SHAPE_LIP_PUCKER_R_ML           = 25,
        XR_FACIAL_BLEND_SHAPE_LIP_STRETCHER_L_ML        = 26,
        XR_FACIAL_BLEND_SHAPE_LIP_STRETCHER_R_ML        = 27,
        XR_FACIAL_BLEND_SHAPE_LIP_SUCK_LB_ML            = 28,
        XR_FACIAL_BLEND_SHAPE_LIP_SUCK_LT_ML            = 29,
        XR_FACIAL_BLEND_SHAPE_LIP_SUCK_RB_ML            = 30,
        XR_FACIAL_BLEND_SHAPE_LIP_SUCK_RT_ML            = 31,
        XR_FACIAL_BLEND_SHAPE_LIP_TIGHTENER_L_ML        = 32,
        XR_FACIAL_BLEND_SHAPE_LIP_TIGHTENER_R_ML        = 33,
        XR_FACIAL_BLEND_SHAPE_LIPS_TOWARD_ML            = 34,
        XR_FACIAL_BLEND_SHAPE_LOWER_LIP_DEPRESSOR_L_ML  = 35,
        XR_FACIAL_BLEND_SHAPE_LOWER_LIP_DEPRESSOR_R_ML  = 36,
        XR_FACIAL_BLEND_SHAPE_NOSE_WRINKLER_L_ML        = 37,
        XR_FACIAL_BLEND_SHAPE_NOSE_WRINKLER_R_ML        = 38,
        XR_FACIAL_BLEND_SHAPE_OUTER_BROW_RAISER_L_ML    = 39,
        XR_FACIAL_BLEND_SHAPE_OUTER_BROW_RAISER_R_ML    = 40,
        XR_FACIAL_BLEND_SHAPE_UPPER_LID_RAISER_L_ML     = 41,
        XR_FACIAL_BLEND_SHAPE_UPPER_LID_RAISER_R_ML     = 42,
        XR_FACIAL_BLEND_SHAPE_UPPER_LIP_RAISER_L_ML     = 43,
        XR_FACIAL_BLEND_SHAPE_UPPER_LIP_RAISER_R_ML     = 44,
        XR_FACIAL_BLEND_SHAPE_TONGUE_OUT_ML             = 45;

    /**
     * XrFacialExpressionBlendShapePropertiesFlagBitsML - Flag bits for facial expression blend shape properties.
     * 
     * <h5>Description</h5>
     * 
     * <p>The flag bits' meaning are described as below:</p>
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_VALID_BIT_ML FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_VALID_BIT_ML} — Indicates whether the blend shape is valid.</li>
     * <li>{@link #XR_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_TRACKED_BIT_ML FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_TRACKED_BIT_ML} — Indicates whether the blend shape is being tracked by the runtime.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFacialExpressionBlendShapePropertiesML}</p>
     */
    public static final int
        XR_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_VALID_BIT_ML   = 0x1,
        XR_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_TRACKED_BIT_ML = 0x2;

    protected MLFacialExpression() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateFacialExpressionClientML ] ---

    /** Unsafe version of: {@link #xrCreateFacialExpressionClientML CreateFacialExpressionClientML} */
    public static int nxrCreateFacialExpressionClientML(XrSession session, long createInfo, long facialExpressionClient) {
        long __functionAddress = session.getCapabilities().xrCreateFacialExpressionClientML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, facialExpressionClient, __functionAddress);
    }

    /**
     * Creates a face tracking handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateFacialExpressionClientML CreateFacialExpressionClientML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateFacialExpressionClientML(
     *     XrSession                                   session,
     *     const XrFacialExpressionClientCreateInfoML* createInfo,
     *     XrFacialExpressionClientML*                 facialExpressionClient);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>An application <b>can</b> create an {@code XrFacialExpressionClientML} handle using {@link #xrCreateFacialExpressionClientML CreateFacialExpressionClientML} function.</p>
     * 
     * <p>If the system does not support parsing facial expressions, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link #xrCreateFacialExpressionClientML CreateFacialExpressionClientML}. In this case, the runtime <b>must</b> also return {@link XR10#XR_FALSE FALSE} for {@link XrSystemFacialExpressionPropertiesML}{@code ::supportsFacialExpression} when the function {@link XR10#xrGetSystemProperties GetSystemProperties} is called.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLFacialExpression XR_ML_facial_expression} extension <b>must</b> be enabled prior to calling {@link #xrCreateFacialExpressionClientML CreateFacialExpressionClientML}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrFacialExpressionClientCreateInfoML} structure</li>
     * <li>{@code facialExpressionClient} <b>must</b> be a pointer to an {@code XrFacialExpressionClientML} handle</li>
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
     * <li>{@link #XR_ERROR_FACIAL_EXPRESSION_PERMISSION_DENIED_ML ERROR_FACIAL_EXPRESSION_PERMISSION_DENIED_ML}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFacialExpressionClientCreateInfoML}</p>
     *
     * @param session                an {@code XrSession} in which the facial expression client will be active.
     * @param createInfo             a pointer to the {@link XrFacialExpressionClientCreateInfoML} used to specify the facial expression client.
     * @param facialExpressionClient a pointer to the returned {@code XrFacialExpressionClientML} handle.
     */
    @NativeType("XrResult")
    public static int xrCreateFacialExpressionClientML(XrSession session, @NativeType("XrFacialExpressionClientCreateInfoML const *") XrFacialExpressionClientCreateInfoML createInfo, @NativeType("XrFacialExpressionClientML *") PointerBuffer facialExpressionClient) {
        if (CHECKS) {
            check(facialExpressionClient, 1);
        }
        return nxrCreateFacialExpressionClientML(session, createInfo.address(), memAddress(facialExpressionClient));
    }

    // --- [ xrDestroyFacialExpressionClientML ] ---

    /**
     * Destroys a facial expression client handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyFacialExpressionClientML DestroyFacialExpressionClientML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyFacialExpressionClientML(
     *     XrFacialExpressionClientML                  facialExpressionClient);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrDestroyFacialExpressionClientML DestroyFacialExpressionClientML} function releases the {@code facialExpressionClient} and the underlying resources.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLFacialExpression XR_ML_facial_expression} extension <b>must</b> be enabled prior to calling {@link #xrDestroyFacialExpressionClientML DestroyFacialExpressionClientML}</li>
     * <li>{@code facialExpressionClient} <b>must</b> be a valid {@code XrFacialExpressionClientML} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code facialExpressionClient}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrCreateFacialExpressionClientML CreateFacialExpressionClientML}</p>
     *
     * @param facialExpressionClient an {@code XrFacialExpressionClientML} previously created by {@link #xrCreateFacialExpressionClientML CreateFacialExpressionClientML}.
     */
    @NativeType("XrResult")
    public static int xrDestroyFacialExpressionClientML(XrFacialExpressionClientML facialExpressionClient) {
        long __functionAddress = facialExpressionClient.getCapabilities().xrDestroyFacialExpressionClientML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(facialExpressionClient.address(), __functionAddress);
    }

    // --- [ xrGetFacialExpressionBlendShapePropertiesML ] ---

    /**
     * Unsafe version of: {@link #xrGetFacialExpressionBlendShapePropertiesML GetFacialExpressionBlendShapePropertiesML}
     *
     * @param blendShapeCount a {@code uint32_t} specifying the size of the {@code blendShapes} array.
     */
    public static int nxrGetFacialExpressionBlendShapePropertiesML(XrFacialExpressionClientML facialExpressionClient, long blendShapeGetInfo, int blendShapeCount, long blendShapes) {
        long __functionAddress = facialExpressionClient.getCapabilities().xrGetFacialExpressionBlendShapePropertiesML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(facialExpressionClient.address(), blendShapeGetInfo, blendShapeCount, blendShapes, __functionAddress);
    }

    /**
     * Obtain blend shape of facial expression.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetFacialExpressionBlendShapePropertiesML GetFacialExpressionBlendShapePropertiesML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetFacialExpressionBlendShapePropertiesML(
     *     XrFacialExpressionClientML                  facialExpressionClient,
     *     const XrFacialExpressionBlendShapeGetInfoML* blendShapeGetInfo,
     *     uint32_t                                    blendShapeCount,
     *     XrFacialExpressionBlendShapePropertiesML*   blendShapes);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link XrFacialExpressionBlendShapePropertiesML} is better thought of as a mutable state rather than an immutable property. In general, OpenXR convention tries to keep property data types to be immutable.</p>
     * 
     * <p>The {@link #xrGetFacialExpressionBlendShapePropertiesML GetFacialExpressionBlendShapePropertiesML} function returns the {@link XrFacialExpressionBlendShapePropertiesML} of each blend shape requested in {@link XrFacialExpressionClientCreateInfoML}</p>
     * 
     * <p>Each {@link XrFacialExpressionBlendShapePropertiesML} in {@code blendShapes} <b>must</b> have its {@code requestedFacialBlendShape} member variable initialized before being passed into {@link #xrGetFacialExpressionBlendShapePropertiesML GetFacialExpressionBlendShapePropertiesML}.</p>
     * 
     * <p>If a blend shape in {@code blendShapes} is not enabled in {@link #xrCreateFacialExpressionClientML CreateFacialExpressionClientML}, the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
     * 
     * <p>For unsupported blend shapes, the runtime <b>must</b> clear {@link XrFacialExpressionBlendShapePropertiesML}{@code ::flags} and the runtime <b>must</b> also return {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLFacialExpression XR_ML_facial_expression} extension <b>must</b> be enabled prior to calling {@link #xrGetFacialExpressionBlendShapePropertiesML GetFacialExpressionBlendShapePropertiesML}</li>
     * <li>{@code facialExpressionClient} <b>must</b> be a valid {@code XrFacialExpressionClientML} handle</li>
     * <li>{@code blendShapeGetInfo} <b>must</b> be a pointer to a valid {@link XrFacialExpressionBlendShapeGetInfoML} structure</li>
     * <li>{@code blendShapes} <b>must</b> be a pointer to an array of {@code blendShapeCount} {@link XrFacialExpressionBlendShapePropertiesML} structures</li>
     * <li>The {@code blendShapeCount} parameter <b>must</b> be greater than 0</li>
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
     * <p>{@link XrFacialExpressionBlendShapeGetInfoML}, {@link XrFacialExpressionBlendShapePropertiesML}, {@link XrFacialExpressionClientCreateInfoML}</p>
     *
     * @param facialExpressionClient an {@code XrFacialExpressionClientML} previously created by {@link #xrCreateFacialExpressionClientML CreateFacialExpressionClientML}.
     * @param blendShapeGetInfo      a pointer to {@link XrFacialExpressionBlendShapeGetInfoML} describing information to obtain facial expression.
     * @param blendShapes            an application allocated array of {@link XrFacialExpressionBlendShapePropertiesML} that contains the blend shapes information. This array acts as both input and output for this function. The array <b>may</b> be a subset of blend shapes.
     */
    @NativeType("XrResult")
    public static int xrGetFacialExpressionBlendShapePropertiesML(XrFacialExpressionClientML facialExpressionClient, @NativeType("XrFacialExpressionBlendShapeGetInfoML const *") XrFacialExpressionBlendShapeGetInfoML blendShapeGetInfo, @NativeType("XrFacialExpressionBlendShapePropertiesML *") XrFacialExpressionBlendShapePropertiesML.Buffer blendShapes) {
        return nxrGetFacialExpressionBlendShapePropertiesML(facialExpressionClient, blendShapeGetInfo.address(), blendShapes.remaining(), blendShapes.address());
    }

}