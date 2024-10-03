/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_spatial_anchors = "MLSpatialAnchors".nativeClassXR("ML_spatial_anchors", type = "instance", postfix = "ML") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_ML_spatial_anchors">XR_ML_spatial_anchors</a> extension.

        Spatial anchors are {@code XrSpace} entities tied to a physical location. This allows the developer to place virtual content in real world locations.

        The runtime <b>should</b> then adjust the {@code XrSpace} over time as needed, independently of all other spaces and anchors, to ensure that it maintains its original mapping to the real world.

        <h5>Caution</h5>
        If head pose is lost and regained, spatial anchors <b>may</b> also be lost. It is therefore strongly recommended that once an anchor is created, it is also persisted using the {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension.

        <h5>Permissions</h5>
        Android applications <b>must</b> have the com.magicleap.permission.SPATIAL_ANCHOR permission listed in their manifest to use this extension. (protection level: normal)
        """

    IntConstant(
        "The extension specification version.",

        "ML_spatial_anchors_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ML_SPATIAL_ANCHORS_EXTENSION_NAME".."XR_ML_spatial_anchors"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_POSE_ML".."1000140000",
        "TYPE_CREATE_SPATIAL_ANCHORS_COMPLETION_ML".."1000140001",
        "TYPE_SPATIAL_ANCHOR_STATE_ML".."1000140002"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML".."-1000140000",
        "ERROR_SPATIAL_ANCHORS_NOT_LOCALIZED_ML".."-1000140001",
        "ERROR_SPATIAL_ANCHORS_OUT_OF_MAP_BOUNDS_ML".."-1000140002",
        "ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML".."-1000140003"
    )

    EnumConstant(
        """
        XrSpatialAnchorConfidenceML - Spatial anchor confidence

        <h5>Description</h5>
        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#SPATIAL_ANCHOR_CONFIDENCE_LOW_ML</td><td>Low quality, this anchor can be expected to move significantly.</td></tr>
                <tr><td>#SPATIAL_ANCHOR_CONFIDENCE_MEDIUM_ML</td><td>Medium quality, this anchor may move slightly.</td></tr>
                <tr><td>#SPATIAL_ANCHOR_CONFIDENCE_HIGH_ML</td><td>High quality, this anchor is stable and suitable for digital content attachment.</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrSpatialAnchorStateML
        """,

        "SPATIAL_ANCHOR_CONFIDENCE_LOW_ML".."0",
        "SPATIAL_ANCHOR_CONFIDENCE_MEDIUM_ML".."1",
        "SPATIAL_ANCHOR_CONFIDENCE_HIGH_ML".."2"
    )

    XrResult(
        "CreateSpatialAnchorsAsyncML",
        """
        Create spatial anchors.

        <h5>C Specification</h5>
        The #CreateSpatialAnchorsAsyncML() function is defined as:

        <pre><code>
￿XrResult xrCreateSpatialAnchorsAsyncML(
￿    XrSession                                   session,
￿    const XrSpatialAnchorsCreateInfoBaseHeaderML* createInfo,
￿    XrFutureEXT*                                future);</code></pre>

        <h5>Description</h5>
        This function starts an asynchronous spatial anchor creation. Call one of the #PollFutureEXT() functions to check the ready state on the future. Once the future is in ready state, call #CreateSpatialAnchorsCompleteML() to retrieve the results.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLSpatialAnchors XR_ML_spatial_anchors} extension <b>must</b> be enabled prior to calling #CreateSpatialAnchorsAsyncML()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrSpatialAnchorsCreateInfoBaseHeaderML-based structure. See also: ##XrSpatialAnchorsCreateInfoFromPoseML, ##XrSpatialAnchorsCreateInfoFromUuidsML</li>
            <li>{@code future} <b>must</b> be a pointer to an {@code XrFutureEXT} value</li>
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
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_TIME_INVALID</li>
                <li>#ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML</li>
                <li>#ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML</li>
                <li>#ERROR_POSE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorsCreateInfoBaseHeaderML, ##XrSpatialAnchorsCreateInfoFromPoseML, #CreateSpatialAnchorsCompleteML()
        """,

        XrSession("session", "a handle to an {@code XrSession} previously created with #CreateSession()."),
        XrSpatialAnchorsCreateInfoBaseHeaderML.const.p("createInfo", "a pointer to an ##XrSpatialAnchorsCreateInfoBaseHeaderML derived structure."),
        Check(1)..XrFutureEXT.p("future", "a pointer to an {@code XrFutureEXT}.")
    )

    XrResult(
        "CreateSpatialAnchorsCompleteML",
        """
        Completion function for spatial anchor creation.

        <h5>C Specification</h5>
        The #CreateSpatialAnchorsCompleteML() function is defined as:

        <pre><code>
￿XrResult xrCreateSpatialAnchorsCompleteML(
￿    XrSession                                   session,
￿    XrFutureEXT                                 future,
￿    XrCreateSpatialAnchorsCompletionML*         completion);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLSpatialAnchors XR_ML_spatial_anchors} extension <b>must</b> be enabled prior to calling #CreateSpatialAnchorsCompleteML()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code completion} <b>must</b> be a pointer to an ##XrCreateSpatialAnchorsCompletionML structure</li>
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
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_FUTURE_PENDING_EXT</li>
                <li>#ERROR_FUTURE_INVALID_EXT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrCreateSpatialAnchorsCompletionML, #CreateSpatialAnchorsAsyncML()
        """,

        XrSession("session", "a handle to an {@code XrSession} previously created with #CreateSession()."),
        XrFutureEXT("future", "the {@code XrFutureEXT} to complete."),
        XrCreateSpatialAnchorsCompletionML.p("completion", "a pointer to an ##XrCreateSpatialAnchorsCompletionML filled in by the runtime.")
    )

    XrResult(
        "GetSpatialAnchorStateML",
        """
        Retrieve spatial anchor state.

        <h5>C Specification</h5>
        The #GetSpatialAnchorStateML() function is defined as:

        <pre><code>
￿XrResult xrGetSpatialAnchorStateML(
￿    XrSpace                                     anchor,
￿    XrSpatialAnchorStateML*                     state);</code></pre>

        <h5>Description</h5>
        The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if the {@code XrSpace} is not an spatial anchor.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLSpatialAnchors XR_ML_spatial_anchors} extension <b>must</b> be enabled prior to calling #GetSpatialAnchorStateML()</li>
            <li>{@code anchor} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code state} <b>must</b> be a pointer to an ##XrSpatialAnchorStateML structure</li>
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
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrCreateSpatialAnchorsCompletionML, ##XrSpatialAnchorStateML, #CreateSpatialAnchorsAsyncML()
        """,

        XrSpace("anchor", "a handle to an {@code XrSpace} corresponding to a spatial anchor."),
        XrSpatialAnchorStateML.p("state", "a pointer to an ##XrSpatialAnchorStateML structure to populate with the spatial anchor state.")
    )
}