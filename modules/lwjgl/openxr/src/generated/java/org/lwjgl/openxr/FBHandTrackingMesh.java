/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The FB_hand_tracking_mesh extension. */
public class FBHandTrackingMesh {

    /** The extension specification version. */
    public static final int XR_FB_hand_tracking_mesh_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_HAND_TRACKING_MESH_EXTENSION_NAME = "XR_FB_hand_tracking_mesh";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_HAND_TRACKING_MESH_FB TYPE_HAND_TRACKING_MESH_FB}</li>
     * <li>{@link #XR_TYPE_HAND_TRACKING_SCALE_FB TYPE_HAND_TRACKING_SCALE_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_HAND_TRACKING_MESH_FB  = 1000110001,
        XR_TYPE_HAND_TRACKING_SCALE_FB = 1000110003;

    protected FBHandTrackingMesh() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetHandMeshFB ] ---

    /** Unsafe version of: {@link #xrGetHandMeshFB GetHandMeshFB} */
    public static int nxrGetHandMeshFB(XrHandTrackerEXT handTracker, long mesh) {
        long __functionAddress = handTracker.getCapabilities().xrGetHandMeshFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(handTracker.address(), mesh, __functionAddress);
    }

    /**
     * Create a foveation profile.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetHandMeshFB GetHandMeshFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetHandMeshFB(
     *     XrHandTrackerEXT                            handTracker,
     *     XrHandTrackingMeshFB*                       mesh);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetHandMeshFB GetHandMeshFB} function populates an {@link XrHandTrackingMeshFB} structure with enough information to render a skinned mesh driven by the hand joints. As discussed in the specification for that structure, the data enumerated by this call is constant during the lifetime of an {@code XrInstance}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBHandTrackingMesh XR_FB_hand_tracking_mesh} extension <b>must</b> be enabled prior to calling {@link #xrGetHandMeshFB GetHandMeshFB}</li>
     * <li>{@code handTracker} <b>must</b> be a valid {@code XrHandTrackerEXT} handle</li>
     * <li>{@code mesh} <b>must</b> be a pointer to an {@link XrHandTrackingMeshFB} structure</li>
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
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrHandTrackingMeshFB}</p>
     *
     * @param handTracker the {@code XrHandTrackerEXT} that is associated with a particular hand.
     * @param mesh        the {@link XrHandTrackingMeshFB} output structure.
     */
    @NativeType("XrResult")
    public static int xrGetHandMeshFB(XrHandTrackerEXT handTracker, @NativeType("XrHandTrackingMeshFB *") XrHandTrackingMeshFB mesh) {
        return nxrGetHandMeshFB(handTracker, mesh.address());
    }

}