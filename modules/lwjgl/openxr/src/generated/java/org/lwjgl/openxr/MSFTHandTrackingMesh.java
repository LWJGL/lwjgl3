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
    public static final int XR_MSFT_hand_tracking_mesh_SPEC_VERSION = 2;

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
     * XrHandPoseTypeMSFT
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_HAND_POSE_TYPE_TRACKED_MSFT HAND_POSE_TYPE_TRACKED_MSFT}</li>
     * <li>{@link #XR_HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_HAND_POSE_TYPE_TRACKED_MSFT             = 0,
        XR_HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT = 1;

    protected MSFTHandTrackingMesh() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateHandMeshSpaceMSFT ] ---

    public static int nxrCreateHandMeshSpaceMSFT(XrHandTrackerEXT handTracker, long createInfo, long space) {
        long __functionAddress = handTracker.getCapabilities().xrCreateHandMeshSpaceMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrHandMeshSpaceCreateInfoMSFT.validate(createInfo);
        }
        return callPPPI(handTracker.address(), createInfo, space, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrCreateHandMeshSpaceMSFT(XrHandTrackerEXT handTracker, @NativeType("XrHandMeshSpaceCreateInfoMSFT const *") XrHandMeshSpaceCreateInfoMSFT createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateHandMeshSpaceMSFT(handTracker, createInfo.address(), memAddress(space));
    }

    // --- [ xrUpdateHandMeshMSFT ] ---

    public static int nxrUpdateHandMeshMSFT(XrHandTrackerEXT handTracker, long updateInfo, long handMesh) {
        long __functionAddress = handTracker.getCapabilities().xrUpdateHandMeshMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrHandMeshUpdateInfoMSFT.validate(updateInfo);
        }
        return callPPPI(handTracker.address(), updateInfo, handMesh, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrUpdateHandMeshMSFT(XrHandTrackerEXT handTracker, @NativeType("XrHandMeshUpdateInfoMSFT const *") XrHandMeshUpdateInfoMSFT updateInfo, @NativeType("XrHandMeshMSFT *") XrHandMeshMSFT handMesh) {
        return nxrUpdateHandMeshMSFT(handTracker, updateInfo.address(), handMesh.address());
    }

}