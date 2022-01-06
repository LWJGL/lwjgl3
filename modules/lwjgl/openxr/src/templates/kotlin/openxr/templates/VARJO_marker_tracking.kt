/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val VARJO_marker_tracking = "VARJOMarkerTracking".nativeClassXR("VARJO_marker_tracking", type = "instance", postfix = "VARJO") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "VARJO_marker_tracking_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "VARJO_MARKER_TRACKING_EXTENSION_NAME".."XR_VARJO_marker_tracking"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO".."1000124000",
        "TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO".."1000124001",
        "TYPE_MARKER_SPACE_CREATE_INFO_VARJO".."1000124002"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_MARKER_NOT_TRACKED_VARJO".."-1000124000",
        "ERROR_MARKER_ID_INVALID_VARJO".."-1000124001"
    )

    XrResult(
        "SetMarkerTrackingVARJO",
        """
        Enables marker tracking.

        <h5>C Specification</h5>
        The #SetMarkerTrackingVARJO() function is defined as:

        <pre><code>
￿XrResult  xrSetMarkerTrackingVARJO(
￿    XrSession                                   session,
￿    XrBool32                                    enabled);</code></pre>

        <h5>Description</h5>
        The #SetMarkerTrackingVARJO() function enables or disables marker tracking functionality. As soon as feature is become disabled all trackable markers become inactive and corresponding events will be generated. An application <b>may</b> call any of the functions in this extension regardless if the marker tracking functionality is enabled or disabled.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to calling #SetMarkerTrackingVARJO()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>
        """,

        XrSession("session", "an {@code XrSession} handle previously created with #CreateSession()."),
        XrBool32("enabled", "the flag to enable or disable marker tracking.")
    )

    XrResult(
        "SetMarkerTrackingTimeoutVARJO",
        """
        Sets marker lifetime duration.

        <h5>C Specification</h5>
        The #SetMarkerTrackingTimeoutVARJO() function is defined as:

        <pre><code>
￿XrResult xrSetMarkerTrackingTimeoutVARJO(
￿    XrSession                                   session,
￿    uint64_t                                    markerId,
￿    XrDuration                                  timeout);</code></pre>

        <h5>Description</h5>
        The #SetMarkerTrackingTimeoutVARJO() function sets a desired lifetime duration for a specified marker. The default value is #NO_DURATION. Negative value will be clamped to #NO_DURATION. It defines the time period during which the runtime <b>must</b> keep returning poses of previously tracked markers. The tracking may be lost if the marker went outside of the trackable field of view. In this case the runtime still will try to predict marker’s pose for the timeout period. The runtime <b>must</b> return #ERROR_MARKER_ID_INVALID_VARJO if the supplied {@code markerId} is invalid.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to calling #SetMarkerTrackingTimeoutVARJO()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_MARKER_ID_INVALID_VARJO</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>
        """,

        XrSession("session", "an {@code XrSession} handle previously created with #CreateSession()."),
        uint64_t("markerId", "the unique identifier of the marker for which the timeout will be updated."),
        XrDuration("timeout", "the desired lifetime duration for a specified marker.")
    )

    XrResult(
        "SetMarkerTrackingPredictionVARJO",
        """
        Sets marker tracking with prediction.

        <h5>C Specification</h5>
        The #SetMarkerTrackingPredictionVARJO() function is defined as:

        <pre><code>
￿XrResult xrSetMarkerTrackingPredictionVARJO(
￿    XrSession                                   session,
￿    uint64_t                                    markerId,
￿    XrBool32                                    enabled);</code></pre>

        <h5>Description</h5>
        The #SetMarkerTrackingPredictionVARJO() function enables or disables the prediction feature for a specified marker. By default, markers are created with disabled prediction. This works well for markers that are supposed to be stationary. The prediction <b>can</b> be used to improve tracking of movable markers. The runtime <b>must</b> return #ERROR_MARKER_ID_INVALID_VARJO if the supplied {@code markerId} is invalid.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to calling #SetMarkerTrackingPredictionVARJO()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_MARKER_ID_INVALID_VARJO</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>
        """,

        XrSession("session", "an {@code XrSession} handle previously created with #CreateSession()."),
        uint64_t("markerId", "the unique identifier of the marker which should be tracked with prediction."),
        XrBool32("enabled", "")
    )

    XrResult(
        "GetMarkerSizeVARJO",
        """
        Gets physical size of marker.

        <h5>C Specification</h5>
        The #GetMarkerSizeVARJO() function is defined as:

        <pre><code>
￿XrResult xrGetMarkerSizeVARJO(
￿    XrSession                                   session,
￿    uint64_t                                    markerId,
￿    XrExtent2Df*                                size);</code></pre>

        <h5>Description</h5>
        The #GetMarkerSizeVARJO() function retrieves the height and width of an active marker. The runtime <b>must</b> return #ERROR_MARKER_NOT_TRACKED_VARJO if marker tracking functionality is disabled or the marker with given {@code markerId} is inactive. The runtime <b>must</b> return #ERROR_MARKER_ID_INVALID_VARJO if the supplied {@code markerId} is invalid.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to calling #GetMarkerSizeVARJO()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code size} <b>must</b> be a pointer to an ##XrExtent2Df structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_MARKER_NOT_TRACKED_VARJO</li>
                <li>#ERROR_MARKER_ID_INVALID_VARJO</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrExtent2Df
        """,

        XrSession("session", "an {@code XrSession} handle previously created with #CreateSession()."),
        uint64_t("markerId", "the unique identifier of the marker for which size is requested."),
        XrExtent2Df.p("size", "pointer to the size to populate by the runtime with the physical size of plane marker in meters.")
    )

    XrResult(
        "CreateMarkerSpaceVARJO",
        """
        Creates marker space.

        <h5>C Specification</h5>
        The #CreateMarkerSpaceVARJO() function is defined as:

        <pre><code>
￿XrResult xrCreateMarkerSpaceVARJO(
￿    XrSession                                   session,
￿    const XrMarkerSpaceCreateInfoVARJO*         createInfo,
￿    XrSpace*                                    space);</code></pre>

        <h5>Description</h5>
        The #CreateMarkerSpaceVARJO() function creates marker {@code XrSpace} for pose relative to the marker specified in ##XrMarkerSpaceCreateInfoVARJO. The runtime <b>must</b> return #ERROR_MARKER_ID_INVALID_VARJO if the supplied {@code markerId} is invalid.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to calling #CreateMarkerSpaceVARJO()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrMarkerSpaceCreateInfoVARJO structure</li>
            <li>{@code space} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_POSE_INVALID</li>
                <li>#ERROR_MARKER_ID_INVALID_VARJO</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrMarkerSpaceCreateInfoVARJO
        """,

        XrSession("session", "an {@code XrSession} handle previously created with #CreateSession()."),
        XrMarkerSpaceCreateInfoVARJO.const.p("createInfo", "the structure containing information about how to create the space based on marker."),
        Check(1)..XrSpace.p("space", "a pointer to a handle in which the created {@code XrSpace} is returned.")
    )
}