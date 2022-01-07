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

/** The VARJO_marker_tracking extension. */
public class VARJOMarkerTracking {

    /** The extension specification version. */
    public static final int XR_VARJO_marker_tracking_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_VARJO_MARKER_TRACKING_EXTENSION_NAME = "XR_VARJO_marker_tracking";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO}</li>
     * <li>{@link #XR_TYPE_MARKER_SPACE_CREATE_INFO_VARJO TYPE_MARKER_SPACE_CREATE_INFO_VARJO}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO = 1000124000,
        XR_TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO = 1000124001,
        XR_TYPE_MARKER_SPACE_CREATE_INFO_VARJO          = 1000124002;

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_MARKER_NOT_TRACKED_VARJO ERROR_MARKER_NOT_TRACKED_VARJO}</li>
     * <li>{@link #XR_ERROR_MARKER_ID_INVALID_VARJO ERROR_MARKER_ID_INVALID_VARJO}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_MARKER_NOT_TRACKED_VARJO = -1000124000,
        XR_ERROR_MARKER_ID_INVALID_VARJO  = -1000124001;

    protected VARJOMarkerTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetMarkerTrackingVARJO ] ---

    /**
     * Enables marker tracking.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSetMarkerTrackingVARJO SetMarkerTrackingVARJO} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult  xrSetMarkerTrackingVARJO(
     *     XrSession                                   session,
     *     XrBool32                                    enabled);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrSetMarkerTrackingVARJO SetMarkerTrackingVARJO} function enables or disables marker tracking functionality. As soon as feature is become disabled all trackable markers become inactive and corresponding events will be generated. An application <b>may</b> call any of the functions in this extension regardless if the marker tracking functionality is enabled or disabled.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to calling {@link #xrSetMarkerTrackingVARJO SetMarkerTrackingVARJO}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param session an {@code XrSession} handle previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param enabled the flag to enable or disable marker tracking.
     */
    @NativeType("XrResult")
    public static int xrSetMarkerTrackingVARJO(XrSession session, @NativeType("XrBool32") boolean enabled) {
        long __functionAddress = session.getCapabilities().xrSetMarkerTrackingVARJO;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), enabled ? 1 : 0, __functionAddress);
    }

    // --- [ xrSetMarkerTrackingTimeoutVARJO ] ---

    /**
     * Sets marker lifetime duration.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSetMarkerTrackingTimeoutVARJO SetMarkerTrackingTimeoutVARJO} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSetMarkerTrackingTimeoutVARJO(
     *     XrSession                                   session,
     *     uint64_t                                    markerId,
     *     XrDuration                                  timeout);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrSetMarkerTrackingTimeoutVARJO SetMarkerTrackingTimeoutVARJO} function sets a desired lifetime duration for a specified marker. The default value is {@link XR10#XR_NO_DURATION NO_DURATION}. Negative value will be clamped to {@link XR10#XR_NO_DURATION NO_DURATION}. It defines the time period during which the runtime <b>must</b> keep returning poses of previously tracked markers. The tracking may be lost if the marker went outside of the trackable field of view. In this case the runtime still will try to predict marker’s pose for the timeout period. The runtime <b>must</b> return {@link #XR_ERROR_MARKER_ID_INVALID_VARJO ERROR_MARKER_ID_INVALID_VARJO} if the supplied {@code markerId} is invalid.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to calling {@link #xrSetMarkerTrackingTimeoutVARJO SetMarkerTrackingTimeoutVARJO}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_MARKER_ID_INVALID_VARJO ERROR_MARKER_ID_INVALID_VARJO}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param session  an {@code XrSession} handle previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param markerId the unique identifier of the marker for which the timeout will be updated.
     * @param timeout  the desired lifetime duration for a specified marker.
     */
    @NativeType("XrResult")
    public static int xrSetMarkerTrackingTimeoutVARJO(XrSession session, @NativeType("uint64_t") long markerId, @NativeType("XrDuration") long timeout) {
        long __functionAddress = session.getCapabilities().xrSetMarkerTrackingTimeoutVARJO;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJI(session.address(), markerId, timeout, __functionAddress);
    }

    // --- [ xrSetMarkerTrackingPredictionVARJO ] ---

    /**
     * Sets marker tracking with prediction.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSetMarkerTrackingPredictionVARJO SetMarkerTrackingPredictionVARJO} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSetMarkerTrackingPredictionVARJO(
     *     XrSession                                   session,
     *     uint64_t                                    markerId,
     *     XrBool32                                    enabled);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrSetMarkerTrackingPredictionVARJO SetMarkerTrackingPredictionVARJO} function enables or disables the prediction feature for a specified marker. By default, markers are created with disabled prediction. This works well for markers that are supposed to be stationary. The prediction <b>can</b> be used to improve tracking of movable markers. The runtime <b>must</b> return {@link #XR_ERROR_MARKER_ID_INVALID_VARJO ERROR_MARKER_ID_INVALID_VARJO} if the supplied {@code markerId} is invalid.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to calling {@link #xrSetMarkerTrackingPredictionVARJO SetMarkerTrackingPredictionVARJO}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_MARKER_ID_INVALID_VARJO ERROR_MARKER_ID_INVALID_VARJO}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param session  an {@code XrSession} handle previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param markerId the unique identifier of the marker which should be tracked with prediction.
     */
    @NativeType("XrResult")
    public static int xrSetMarkerTrackingPredictionVARJO(XrSession session, @NativeType("uint64_t") long markerId, @NativeType("XrBool32") boolean enabled) {
        long __functionAddress = session.getCapabilities().xrSetMarkerTrackingPredictionVARJO;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(session.address(), markerId, enabled ? 1 : 0, __functionAddress);
    }

    // --- [ xrGetMarkerSizeVARJO ] ---

    /** Unsafe version of: {@link #xrGetMarkerSizeVARJO GetMarkerSizeVARJO} */
    public static int nxrGetMarkerSizeVARJO(XrSession session, long markerId, long size) {
        long __functionAddress = session.getCapabilities().xrGetMarkerSizeVARJO;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), markerId, size, __functionAddress);
    }

    /**
     * Gets physical size of marker.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetMarkerSizeVARJO GetMarkerSizeVARJO} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetMarkerSizeVARJO(
     *     XrSession                                   session,
     *     uint64_t                                    markerId,
     *     XrExtent2Df*                                size);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetMarkerSizeVARJO GetMarkerSizeVARJO} function retrieves the height and width of an active marker. The runtime <b>must</b> return {@link #XR_ERROR_MARKER_NOT_TRACKED_VARJO ERROR_MARKER_NOT_TRACKED_VARJO} if marker tracking functionality is disabled or the marker with given {@code markerId} is inactive. The runtime <b>must</b> return {@link #XR_ERROR_MARKER_ID_INVALID_VARJO ERROR_MARKER_ID_INVALID_VARJO} if the supplied {@code markerId} is invalid.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to calling {@link #xrGetMarkerSizeVARJO GetMarkerSizeVARJO}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code size} <b>must</b> be a pointer to an {@link XrExtent2Df} structure</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_MARKER_NOT_TRACKED_VARJO ERROR_MARKER_NOT_TRACKED_VARJO}</li>
     * <li>{@link #XR_ERROR_MARKER_ID_INVALID_VARJO ERROR_MARKER_ID_INVALID_VARJO}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrExtent2Df}</p>
     *
     * @param session  an {@code XrSession} handle previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param markerId the unique identifier of the marker for which size is requested.
     * @param size     pointer to the size to populate by the runtime with the physical size of plane marker in meters.
     */
    @NativeType("XrResult")
    public static int xrGetMarkerSizeVARJO(XrSession session, @NativeType("uint64_t") long markerId, @NativeType("XrExtent2Df *") XrExtent2Df size) {
        return nxrGetMarkerSizeVARJO(session, markerId, size.address());
    }

    // --- [ xrCreateMarkerSpaceVARJO ] ---

    /** Unsafe version of: {@link #xrCreateMarkerSpaceVARJO CreateMarkerSpaceVARJO} */
    public static int nxrCreateMarkerSpaceVARJO(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateMarkerSpaceVARJO;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    /**
     * Creates marker space.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateMarkerSpaceVARJO CreateMarkerSpaceVARJO} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateMarkerSpaceVARJO(
     *     XrSession                                   session,
     *     const XrMarkerSpaceCreateInfoVARJO*         createInfo,
     *     XrSpace*                                    space);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrCreateMarkerSpaceVARJO CreateMarkerSpaceVARJO} function creates marker {@code XrSpace} for pose relative to the marker specified in {@link XrMarkerSpaceCreateInfoVARJO}. The runtime <b>must</b> return {@link #XR_ERROR_MARKER_ID_INVALID_VARJO ERROR_MARKER_ID_INVALID_VARJO} if the supplied {@code markerId} is invalid.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to calling {@link #xrCreateMarkerSpaceVARJO CreateMarkerSpaceVARJO}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrMarkerSpaceCreateInfoVARJO} structure</li>
     * <li>{@code space} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
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
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * <li>{@link #XR_ERROR_MARKER_ID_INVALID_VARJO ERROR_MARKER_ID_INVALID_VARJO}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrMarkerSpaceCreateInfoVARJO}</p>
     *
     * @param session    an {@code XrSession} handle previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param createInfo the structure containing information about how to create the space based on marker.
     * @param space      a pointer to a handle in which the created {@code XrSpace} is returned.
     */
    @NativeType("XrResult")
    public static int xrCreateMarkerSpaceVARJO(XrSession session, @NativeType("XrMarkerSpaceCreateInfoVARJO const *") XrMarkerSpaceCreateInfoVARJO createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateMarkerSpaceVARJO(session, createInfo.address(), memAddress(space));
    }

}