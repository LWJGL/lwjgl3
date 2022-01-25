/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_hand_tracking_mesh = "MSFTHandTrackingMesh".nativeClassXR("MSFT_hand_tracking_mesh", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_hand_tracking_mesh_SPEC_VERSION".."4"
    )

    StringConstant(
        "The extension name.",

        "MSFT_HAND_TRACKING_MESH_EXTENSION_NAME".."XR_MSFT_hand_tracking_mesh"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT".."1000052000",
        "TYPE_HAND_MESH_SPACE_CREATE_INFO_MSFT".."1000052001",
        "TYPE_HAND_MESH_UPDATE_INFO_MSFT".."1000052002",
        "TYPE_HAND_MESH_MSFT".."1000052003",
        "TYPE_HAND_POSE_TYPE_INFO_MSFT".."1000052004"
    )

    EnumConstant(
        """
        XrHandPoseTypeMSFT - Describe type of input hand pose

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#HAND_POSE_TYPE_TRACKED_MSFT represents a hand pose provided by actual tracking of the user’s hand.</li>
            <li>#HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT represents a stable reference hand pose in a relaxed open hand shape.</li>
        </ul>

        The #HAND_POSE_TYPE_TRACKED_MSFT input provides best fidelity to the user’s actual hand motion. When the hand tracking input requires the user to be holding a controller in their hand, the hand tracking input will appear as the user virtually holding the controller. This input can be used to render the hand shape together with the controller in hand.

        The #HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT input does not move with the user’s actual hand. Through this reference hand pose, an application <b>can</b> get a stable hand joint and mesh that has the same mesh topology as the tracked hand mesh using the same {@code XrHandTrackerEXT}, so that the application can apply the data computed from a reference hand pose to the corresponding tracked hand.

        Although a reference hand pose does not move with user’s hand motion, the bone length and hand thickness <b>may</b> be updated, for example when tracking result refines, or a different user’s hand is detected. The application <b>should</b> update reference hand joints and meshes when the tracked mesh’s {@code indexBufferKey} is changed or when the {@code isActive} value returned from #UpdateHandMeshMSFT() changes from #FALSE to #TRUE. It can use the returned {@code indexBufferKey} and {@code vertexUpdateTime} from #UpdateHandMeshMSFT() to avoid unnecessary CPU or GPU work to process the neutral hand inputs.

        <h5>See Also</h5>
        ##XrHandMeshSpaceCreateInfoMSFT, ##XrHandMeshUpdateInfoMSFT, ##XrHandPoseTypeInfoMSFT, ##XrHandTrackerCreateInfoEXT, #CreateHandTrackerEXT()
        """,

        "HAND_POSE_TYPE_TRACKED_MSFT".."0",
        "HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT".."1"
    )

    XrResult(
        "CreateHandMeshSpaceMSFT",
        """
        Create a space for hand mesh tracking.

        <h5>C Specification</h5>
        The application creates a hand mesh space using function #CreateHandMeshSpaceMSFT(). The position and normal of hand mesh vertices will be represented in this space.

        <pre><code>
￿XrResult xrCreateHandMeshSpaceMSFT(
￿    XrHandTrackerEXT                            handTracker,
￿    const XrHandMeshSpaceCreateInfoMSFT*        createInfo,
￿    XrSpace*                                    space);</code></pre>

        <h5>Description</h5>
        A hand mesh space location is specified by runtime preference to effectively represent hand mesh vertices without unnecessary transformations. For example, an optical hand tracking system <b>can</b> define the hand mesh space origin at the depth camera’s optical center.

        An application should create separate hand mesh space handles for each hand to retrieve the corresponding hand mesh data. The runtime <b>may</b> use the lifetime of this hand mesh space handle to manage the underlying device resources. Therefore, the application <b>should</b> destroy the hand mesh handle after it is finished using the hand mesh.

        The hand mesh space can be related to other spaces in the session, such as view reference space, or grip action space from the pathname:/interaction_profiles/khr/simple_controller interaction profile. The hand mesh space may be not locatable when the hand is outside of the tracking range, or if focus is removed from the application. In these cases, the runtime <b>must</b> not set the #SPACE_LOCATION_POSITION_VALID_BIT and #SPACE_LOCATION_ORIENTATION_VALID_BIT bits on calls to #LocateSpace() with the hand mesh space, and the application <b>should</b> avoid using the returned poses or query for hand mesh data.

        If the underlying {@code XrHandTrackerEXT} is destroyed, the runtime <b>must</b> continue to support #LocateSpace() using the hand mesh space, and it <b>must</b> return space location with #SPACE_LOCATION_POSITION_VALID_BIT and #SPACE_LOCATION_ORIENTATION_VALID_BIT unset.

        The application <b>may</b> create a mesh space for the reference hand by setting {@code handPoseType} to #HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT. Hand mesh spaces for the reference hand <b>must</b> only be locatable in reference to mesh spaces or joint spaces of the reference hand.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to calling #CreateHandMeshSpaceMSFT()</li>
            <li>{@code handTracker} <b>must</b> be a valid {@code XrHandTrackerEXT} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrHandMeshSpaceCreateInfoMSFT structure</li>
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
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_POSE_INVALID</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrHandMeshSpaceCreateInfoMSFT
        """,

        XrHandTrackerEXT("handTracker", "an {@code XrHandTrackerEXT} handle previously created with the #CreateHandTrackerEXT() function."),
        XrHandMeshSpaceCreateInfoMSFT.const.p("createInfo", "the ##XrHandMeshSpaceCreateInfoMSFT used to specify the hand mesh space."),
        Check(1)..XrSpace.p("space", "the returned {@code XrSpace} handle of the new hand mesh space.")
    )

    XrResult(
        "UpdateHandMeshMSFT",
        """
        Update hand mesh buffers.

        <h5>C Specification</h5>
        The application <b>can</b> use the #UpdateHandMeshMSFT() function to retrieve the hand mesh at a given timestamp. The hand mesh’s vertices position and normal are represented in the hand mesh space created by #CreateHandMeshSpaceMSFT() with a same {@code XrHandTrackerEXT}.

        <pre><code>
￿XrResult xrUpdateHandMeshMSFT(
￿    XrHandTrackerEXT                            handTracker,
￿    const XrHandMeshUpdateInfoMSFT*             updateInfo,
￿    XrHandMeshMSFT*                             handMesh);</code></pre>

        <h5>Description</h5>
        The application <b>should</b> preallocate the index buffer and vertex buffer in ##XrHandMeshMSFT using the {@code maxHandMeshIndexCount} and {@code maxHandMeshVertexCount} from the ##XrSystemHandTrackingMeshPropertiesMSFT returned from the #GetSystemProperties() function.

        The application <b>should</b> preallocate the ##XrHandMeshMSFT structure and reuse it for each frame so as to reduce the copies of data when underlying tracking data is not changed. The application should use {@code indexBufferChanged} and {@code vertexBufferChanged} in ##XrHandMeshMSFT to detect changes and avoid unnecessary data processing when there is no changes.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to calling #UpdateHandMeshMSFT()</li>
            <li>{@code handTracker} <b>must</b> be a valid {@code XrHandTrackerEXT} handle</li>
            <li>{@code updateInfo} <b>must</b> be a pointer to a valid ##XrHandMeshUpdateInfoMSFT structure</li>
            <li>{@code handMesh} <b>must</b> be a pointer to an ##XrHandMeshMSFT structure</li>
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
                <li>#ERROR_TIME_INVALID</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrHandMeshMSFT, ##XrHandMeshUpdateInfoMSFT, #CreateHandMeshSpaceMSFT()
        """,

        XrHandTrackerEXT("handTracker", "an {@code XrHandTrackerEXT} handle previously created with #CreateHandTrackerEXT()."),
        XrHandMeshUpdateInfoMSFT.const.p("updateInfo", "an ##XrHandMeshUpdateInfoMSFT which contains information to query the hand mesh."),
        XrHandMeshMSFT.p("handMesh", "an ##XrHandMeshMSFT structure to receive the updates of hand mesh data.")
    )
}