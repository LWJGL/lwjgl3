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

/** The MSFT_hand_tracking_mesh extension. */
public class MSFTHandTrackingMesh {

    /** The extension specification version. */
    public static final int XR_MSFT_hand_tracking_mesh_SPEC_VERSION = 4;

    /** The extension name. */
    public static final String XR_MSFT_HAND_TRACKING_MESH_EXTENSION_NAME = "XR_MSFT_hand_tracking_mesh";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT}</li>
     * <li>{@link #XR_TYPE_HAND_MESH_SPACE_CREATE_INFO_MSFT TYPE_HAND_MESH_SPACE_CREATE_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_HAND_MESH_UPDATE_INFO_MSFT TYPE_HAND_MESH_UPDATE_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_HAND_MESH_MSFT TYPE_HAND_MESH_MSFT}</li>
     * <li>{@link #XR_TYPE_HAND_POSE_TYPE_INFO_MSFT TYPE_HAND_POSE_TYPE_INFO_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT = 1000052000,
        XR_TYPE_HAND_MESH_SPACE_CREATE_INFO_MSFT          = 1000052001,
        XR_TYPE_HAND_MESH_UPDATE_INFO_MSFT                = 1000052002,
        XR_TYPE_HAND_MESH_MSFT                            = 1000052003,
        XR_TYPE_HAND_POSE_TYPE_INFO_MSFT                  = 1000052004;

    /**
     * XrHandPoseTypeMSFT - Describe type of input hand pose
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_HAND_POSE_TYPE_TRACKED_MSFT HAND_POSE_TYPE_TRACKED_MSFT} represents a hand pose provided by actual tracking of the user’s hand.</li>
     * <li>{@link #XR_HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT} represents a stable reference hand pose in a relaxed open hand shape.</li>
     * </ul>
     * 
     * <p>The {@link #XR_HAND_POSE_TYPE_TRACKED_MSFT HAND_POSE_TYPE_TRACKED_MSFT} input provides best fidelity to the user’s actual hand motion. When the hand tracking input requires the user to be holding a controller in their hand, the hand tracking input will appear as the user virtually holding the controller. This input can be used to render the hand shape together with the controller in hand.</p>
     * 
     * <p>The {@link #XR_HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT} input does not move with the user’s actual hand. Through this reference hand pose, an application <b>can</b> get a stable hand joint and mesh that has the same mesh topology as the tracked hand mesh using the same {@code XrHandTrackerEXT}, so that the application can apply the data computed from a reference hand pose to the corresponding tracked hand.</p>
     * 
     * <p>Although a reference hand pose does not move with user’s hand motion, the bone length and hand thickness <b>may</b> be updated, for example when tracking result refines, or a different user’s hand is detected. The application <b>should</b> update reference hand joints and meshes when the tracked mesh’s {@code indexBufferKey} is changed or when the {@code isActive} value returned from {@link #xrUpdateHandMeshMSFT UpdateHandMeshMSFT} changes from {@link XR10#XR_FALSE FALSE} to {@link XR10#XR_TRUE TRUE}. It can use the returned {@code indexBufferKey} and {@code vertexUpdateTime} from {@link #xrUpdateHandMeshMSFT UpdateHandMeshMSFT} to avoid unnecessary CPU or GPU work to process the neutral hand inputs.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrHandMeshSpaceCreateInfoMSFT}, {@link XrHandMeshUpdateInfoMSFT}, {@link XrHandPoseTypeInfoMSFT}, {@link XrHandTrackerCreateInfoEXT}, {@link EXTHandTracking#xrCreateHandTrackerEXT CreateHandTrackerEXT}</p>
     */
    public static final int
        XR_HAND_POSE_TYPE_TRACKED_MSFT             = 0,
        XR_HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT = 1;

    protected MSFTHandTrackingMesh() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateHandMeshSpaceMSFT ] ---

    /** Unsafe version of: {@link #xrCreateHandMeshSpaceMSFT CreateHandMeshSpaceMSFT} */
    public static int nxrCreateHandMeshSpaceMSFT(XrHandTrackerEXT handTracker, long createInfo, long space) {
        long __functionAddress = handTracker.getCapabilities().xrCreateHandMeshSpaceMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(handTracker.address(), createInfo, space, __functionAddress);
    }

    /**
     * Create a space for hand mesh tracking.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The application creates a hand mesh space using function {@link #xrCreateHandMeshSpaceMSFT CreateHandMeshSpaceMSFT}. The position and normal of hand mesh vertices will be represented in this space.</p>
     * 
     * <pre><code>
     * XrResult xrCreateHandMeshSpaceMSFT(
     *     XrHandTrackerEXT                            handTracker,
     *     const XrHandMeshSpaceCreateInfoMSFT*        createInfo,
     *     XrSpace*                                    space);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>A hand mesh space location is specified by runtime preference to effectively represent hand mesh vertices without unnecessary transformations. For example, an optical hand tracking system <b>can</b> define the hand mesh space origin at the depth camera’s optical center.</p>
     * 
     * <p>An application should create separate hand mesh space handles for each hand to retrieve the corresponding hand mesh data. The runtime <b>may</b> use the lifetime of this hand mesh space handle to manage the underlying device resources. Therefore, the application <b>should</b> destroy the hand mesh handle after it is finished using the hand mesh.</p>
     * 
     * <p>The hand mesh space can be related to other spaces in the session, such as view reference space, or grip action space from the pathname:/interaction_profiles/khr/simple_controller interaction profile. The hand mesh space may be not locatable when the hand is outside of the tracking range, or if focus is removed from the application. In these cases, the runtime <b>must</b> not set the {@link XR10#XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} and {@link XR10#XR_SPACE_LOCATION_ORIENTATION_VALID_BIT SPACE_LOCATION_ORIENTATION_VALID_BIT} bits on calls to {@link XR10#xrLocateSpace LocateSpace} with the hand mesh space, and the application <b>should</b> avoid using the returned poses or query for hand mesh data.</p>
     * 
     * <p>If the underlying {@code XrHandTrackerEXT} is destroyed, the runtime <b>must</b> continue to support {@link XR10#xrLocateSpace LocateSpace} using the hand mesh space, and it <b>must</b> return space location with {@link XR10#XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} and {@link XR10#XR_SPACE_LOCATION_ORIENTATION_VALID_BIT SPACE_LOCATION_ORIENTATION_VALID_BIT} unset.</p>
     * 
     * <p>The application <b>may</b> create a mesh space for the reference hand by setting {@code handPoseType} to {@link #XR_HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT}. Hand mesh spaces for the reference hand <b>must</b> only be locatable in reference to mesh spaces or joint spaces of the reference hand.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to calling {@link #xrCreateHandMeshSpaceMSFT CreateHandMeshSpaceMSFT}</li>
     * <li>{@code handTracker} <b>must</b> be a valid {@code XrHandTrackerEXT} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrHandMeshSpaceCreateInfoMSFT} structure</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrHandMeshSpaceCreateInfoMSFT}</p>
     *
     * @param handTracker an {@code XrHandTrackerEXT} handle previously created with the {@link EXTHandTracking#xrCreateHandTrackerEXT CreateHandTrackerEXT} function.
     * @param createInfo  the {@link XrHandMeshSpaceCreateInfoMSFT} used to specify the hand mesh space.
     * @param space       the returned {@code XrSpace} handle of the new hand mesh space.
     */
    @NativeType("XrResult")
    public static int xrCreateHandMeshSpaceMSFT(XrHandTrackerEXT handTracker, @NativeType("XrHandMeshSpaceCreateInfoMSFT const *") XrHandMeshSpaceCreateInfoMSFT createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateHandMeshSpaceMSFT(handTracker, createInfo.address(), memAddress(space));
    }

    // --- [ xrUpdateHandMeshMSFT ] ---

    /** Unsafe version of: {@link #xrUpdateHandMeshMSFT UpdateHandMeshMSFT} */
    public static int nxrUpdateHandMeshMSFT(XrHandTrackerEXT handTracker, long updateInfo, long handMesh) {
        long __functionAddress = handTracker.getCapabilities().xrUpdateHandMeshMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(handTracker.address(), updateInfo, handMesh, __functionAddress);
    }

    /**
     * Update hand mesh buffers.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The application <b>can</b> use the {@link #xrUpdateHandMeshMSFT UpdateHandMeshMSFT} function to retrieve the hand mesh at a given timestamp. The hand mesh’s vertices position and normal are represented in the hand mesh space created by {@link #xrCreateHandMeshSpaceMSFT CreateHandMeshSpaceMSFT} with a same {@code XrHandTrackerEXT}.</p>
     * 
     * <pre><code>
     * XrResult xrUpdateHandMeshMSFT(
     *     XrHandTrackerEXT                            handTracker,
     *     const XrHandMeshUpdateInfoMSFT*             updateInfo,
     *     XrHandMeshMSFT*                             handMesh);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The application <b>should</b> preallocate the index buffer and vertex buffer in {@link XrHandMeshMSFT} using the {@code maxHandMeshIndexCount} and {@code maxHandMeshVertexCount} from the {@link XrSystemHandTrackingMeshPropertiesMSFT} returned from the {@link XR10#xrGetSystemProperties GetSystemProperties} function.</p>
     * 
     * <p>The application <b>should</b> preallocate the {@link XrHandMeshMSFT} structure and reuse it for each frame so as to reduce the copies of data when underlying tracking data is not changed. The application should use {@code indexBufferChanged} and {@code vertexBufferChanged} in {@link XrHandMeshMSFT} to detect changes and avoid unnecessary data processing when there is no changes.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to calling {@link #xrUpdateHandMeshMSFT UpdateHandMeshMSFT}</li>
     * <li>{@code handTracker} <b>must</b> be a valid {@code XrHandTrackerEXT} handle</li>
     * <li>{@code updateInfo} <b>must</b> be a pointer to a valid {@link XrHandMeshUpdateInfoMSFT} structure</li>
     * <li>{@code handMesh} <b>must</b> be a pointer to an {@link XrHandMeshMSFT} structure</li>
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
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrHandMeshMSFT}, {@link XrHandMeshUpdateInfoMSFT}, {@link #xrCreateHandMeshSpaceMSFT CreateHandMeshSpaceMSFT}</p>
     *
     * @param handTracker an {@code XrHandTrackerEXT} handle previously created with {@link EXTHandTracking#xrCreateHandTrackerEXT CreateHandTrackerEXT}.
     * @param updateInfo  an {@link XrHandMeshUpdateInfoMSFT} which contains information to query the hand mesh.
     * @param handMesh    an {@link XrHandMeshMSFT} structure to receive the updates of hand mesh data.
     */
    @NativeType("XrResult")
    public static int xrUpdateHandMeshMSFT(XrHandTrackerEXT handTracker, @NativeType("XrHandMeshUpdateInfoMSFT const *") XrHandMeshUpdateInfoMSFT updateInfo, @NativeType("XrHandMeshMSFT *") XrHandMeshMSFT handMesh) {
        return nxrUpdateHandMeshMSFT(handTracker, updateInfo.address(), handMesh.address());
    }

}