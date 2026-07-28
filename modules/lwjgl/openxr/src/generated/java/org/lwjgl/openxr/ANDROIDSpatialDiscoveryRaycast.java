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

public class ANDROIDSpatialDiscoveryRaycast {

    public static final int XR_ANDROID_spatial_discovery_raycast_SPEC_VERSION = 1;

    public static final String XR_ANDROID_SPATIAL_DISCOVERY_RAYCAST_EXTENSION_NAME = "XR_ANDROID_spatial_discovery_raycast";

    public static final int XR_SPATIAL_CAPABILITY_DEPTH_RAYCAST_ANDROID = 1000786000;

    public static final int XR_SPATIAL_COMPONENT_TYPE_RAYCAST_RESULT_ANDROID = 1000786000;

    public static final int
        XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_DEPTH_RAYCAST_ANDROID = 1000786000,
        XR_TYPE_SPATIAL_RAYCAST_INFO_ANDROID                           = 1000786001,
        XR_TYPE_SPATIAL_COMPONENT_RAYCAST_RESULT_LIST_ANDROID          = 1000786002,
        XR_TYPE_SPATIAL_RAYCAST_SNAPSHOT_CREATE_INFO_ANDROID           = 1000786003;

    protected ANDROIDSpatialDiscoveryRaycast() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialRaycastSnapshotANDROID ] ---

    /** {@code XrResult xrCreateSpatialRaycastSnapshotANDROID(XrSpatialContextEXT spatialContext, XrSpatialRaycastSnapshotCreateInfoANDROID const * createInfo, XrSpatialSnapshotEXT * snapshot)} */
    public static int nxrCreateSpatialRaycastSnapshotANDROID(XrSpatialContextEXT spatialContext, long createInfo, long snapshot) {
        long __functionAddress = spatialContext.getCapabilities().xrCreateSpatialRaycastSnapshotANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialRaycastSnapshotCreateInfoANDROID.validate(createInfo);
        }
        return callPPPI(spatialContext.address(), createInfo, snapshot, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialRaycastSnapshotANDROID(XrSpatialContextEXT spatialContext, XrSpatialRaycastSnapshotCreateInfoANDROID const * createInfo, XrSpatialSnapshotEXT * snapshot)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialRaycastSnapshotANDROID(XrSpatialContextEXT spatialContext, @NativeType("XrSpatialRaycastSnapshotCreateInfoANDROID const *") XrSpatialRaycastSnapshotCreateInfoANDROID createInfo, @NativeType("XrSpatialSnapshotEXT *") PointerBuffer snapshot) {
        if (CHECKS) {
            check(snapshot, 1);
        }
        return nxrCreateSpatialRaycastSnapshotANDROID(spatialContext, createInfo.address(), memAddress(snapshot));
    }

}