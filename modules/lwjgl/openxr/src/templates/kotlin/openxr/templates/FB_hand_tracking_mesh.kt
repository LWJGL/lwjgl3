/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_hand_tracking_mesh = "FBHandTrackingMesh".nativeClassXR("FB_hand_tracking_mesh", type = "instance", postfix = "FB") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "FB_hand_tracking_mesh_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_HAND_TRACKING_MESH_EXTENSION_NAME".."XR_FB_hand_tracking_mesh"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_HAND_TRACKING_MESH_FB".."1000110001",
        "TYPE_HAND_TRACKING_SCALE_FB".."1000110003"
    )

    XrResult(
        "GetHandMeshFB",
        """
        Create a foveation profile.

        <h5>C Specification</h5>
        The #GetHandMeshFB() function is defined as:

        <pre><code>
￿XrResult xrGetHandMeshFB(
￿    XrHandTrackerEXT                            handTracker,
￿    XrHandTrackingMeshFB*                       mesh);</code></pre>

        <h5>Description</h5>
        The #GetHandMeshFB() function populates an ##XrHandTrackingMeshFB structure with enough information to render a skinned mesh driven by the hand joints. As discussed in the specification for that structure, the data enumerated by this call is constant during the lifetime of an {@code XrInstance}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBHandTrackingMesh XR_FB_hand_tracking_mesh} extension <b>must</b> be enabled prior to calling #GetHandMeshFB()</li>
            <li>{@code handTracker} <b>must</b> be a valid {@code XrHandTrackerEXT} handle</li>
            <li>{@code mesh} <b>must</b> be a pointer to an ##XrHandTrackingMeshFB structure</li>
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
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrHandTrackingMeshFB
        """,

        XrHandTrackerEXT("handTracker", "the {@code XrHandTrackerEXT} that is associated with a particular hand."),
        XrHandTrackingMeshFB.p("mesh", "the ##XrHandTrackingMeshFB output structure.")
    )
}