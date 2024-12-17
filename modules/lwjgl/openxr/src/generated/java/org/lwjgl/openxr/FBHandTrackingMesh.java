/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class FBHandTrackingMesh {

    public static final int XR_FB_hand_tracking_mesh_SPEC_VERSION = 3;

    public static final String XR_FB_HAND_TRACKING_MESH_EXTENSION_NAME = "XR_FB_hand_tracking_mesh";

    public static final int
        XR_TYPE_HAND_TRACKING_MESH_FB  = 1000110001,
        XR_TYPE_HAND_TRACKING_SCALE_FB = 1000110003;

    protected FBHandTrackingMesh() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetHandMeshFB ] ---

    /** {@code XrResult xrGetHandMeshFB(XrHandTrackerEXT handTracker, XrHandTrackingMeshFB * mesh)} */
    public static int nxrGetHandMeshFB(XrHandTrackerEXT handTracker, long mesh) {
        long __functionAddress = handTracker.getCapabilities().xrGetHandMeshFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(handTracker.address(), mesh, __functionAddress);
    }

    /** {@code XrResult xrGetHandMeshFB(XrHandTrackerEXT handTracker, XrHandTrackingMeshFB * mesh)} */
    @NativeType("XrResult")
    public static int xrGetHandMeshFB(XrHandTrackerEXT handTracker, @NativeType("XrHandTrackingMeshFB *") XrHandTrackingMeshFB mesh) {
        return nxrGetHandMeshFB(handTracker, mesh.address());
    }

}