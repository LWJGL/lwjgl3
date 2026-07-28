/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ANDROIDGeospatialAnchor {

    public static final int XR_ANDROID_geospatial_anchor_SPEC_VERSION = 1;

    public static final String XR_ANDROID_GEOSPATIAL_ANCHOR_EXTENSION_NAME = "XR_ANDROID_geospatial_anchor";

    public static final int
        XR_TYPE_GEOSPATIAL_ANCHOR_CREATE_INFO_ANDROID           = 1000797000,
        XR_TYPE_SURFACE_ANCHOR_CREATE_INFO_ANDROID              = 1000797001,
        XR_TYPE_SURFACE_ANCHOR_CREATE_COMPLETION_ANDROID        = 1000797002,
        XR_TYPE_SYSTEM_GEOSPATIAL_ANCHOR_PROPERTIES_ANDROID     = 1000797003,
        XR_TYPE_GEOSPATIAL_TRACKER_ANCHOR_TRACKING_INFO_ANDROID = 1000797004;

    public static final int XR_ERROR_SURFACE_ANCHOR_LOCATION_UNSUPPORTED_ANDROID = -1000797000;

    public static final int
        XR_SURFACE_ANCHOR_TYPE_TERRAIN_ANDROID = 1,
        XR_SURFACE_ANCHOR_TYPE_ROOFTOP_ANDROID = 2;

    protected ANDROIDGeospatialAnchor() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateGeospatialAnchorANDROID ] ---

    /** {@code XrResult xrCreateGeospatialAnchorANDROID(XrSpatialContextEXT spatialContext, XrGeospatialAnchorCreateInfoANDROID const * createInfo, XrSpatialEntityIdEXT * anchorEntityId)} */
    public static int nxrCreateGeospatialAnchorANDROID(XrSpatialContextEXT spatialContext, long createInfo, long anchorEntityId) {
        long __functionAddress = spatialContext.getCapabilities().xrCreateGeospatialAnchorANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrGeospatialAnchorCreateInfoANDROID.validate(createInfo);
        }
        return callPPPI(spatialContext.address(), createInfo, anchorEntityId, __functionAddress);
    }

    /** {@code XrResult xrCreateGeospatialAnchorANDROID(XrSpatialContextEXT spatialContext, XrGeospatialAnchorCreateInfoANDROID const * createInfo, XrSpatialEntityIdEXT * anchorEntityId)} */
    @NativeType("XrResult")
    public static int xrCreateGeospatialAnchorANDROID(XrSpatialContextEXT spatialContext, @NativeType("XrGeospatialAnchorCreateInfoANDROID const *") XrGeospatialAnchorCreateInfoANDROID createInfo, @NativeType("XrSpatialEntityIdEXT *") LongBuffer anchorEntityId) {
        if (CHECKS) {
            check(anchorEntityId, 1);
        }
        return nxrCreateGeospatialAnchorANDROID(spatialContext, createInfo.address(), memAddress(anchorEntityId));
    }

    // --- [ xrCreateSurfaceAnchorAsyncANDROID ] ---

    /** {@code XrResult xrCreateSurfaceAnchorAsyncANDROID(XrSpatialContextEXT spatialContext, XrSurfaceAnchorCreateInfoANDROID const * createInfo, XrFutureEXT * future)} */
    public static int nxrCreateSurfaceAnchorAsyncANDROID(XrSpatialContextEXT spatialContext, long createInfo, long future) {
        long __functionAddress = spatialContext.getCapabilities().xrCreateSurfaceAnchorAsyncANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrSurfaceAnchorCreateInfoANDROID.validate(createInfo);
        }
        return callPPPI(spatialContext.address(), createInfo, future, __functionAddress);
    }

    /** {@code XrResult xrCreateSurfaceAnchorAsyncANDROID(XrSpatialContextEXT spatialContext, XrSurfaceAnchorCreateInfoANDROID const * createInfo, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrCreateSurfaceAnchorAsyncANDROID(XrSpatialContextEXT spatialContext, @NativeType("XrSurfaceAnchorCreateInfoANDROID const *") XrSurfaceAnchorCreateInfoANDROID createInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrCreateSurfaceAnchorAsyncANDROID(spatialContext, createInfo.address(), memAddress(future));
    }

    // --- [ xrCreateSurfaceAnchorCompleteANDROID ] ---

    /** {@code XrResult xrCreateSurfaceAnchorCompleteANDROID(XrSpatialContextEXT spatialContext, XrFutureEXT future, XrSurfaceAnchorCreateCompletionANDROID * completion)} */
    public static int nxrCreateSurfaceAnchorCompleteANDROID(XrSpatialContextEXT spatialContext, long future, long completion) {
        long __functionAddress = spatialContext.getCapabilities().xrCreateSurfaceAnchorCompleteANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(spatialContext.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrCreateSurfaceAnchorCompleteANDROID(XrSpatialContextEXT spatialContext, XrFutureEXT future, XrSurfaceAnchorCreateCompletionANDROID * completion)} */
    @NativeType("XrResult")
    public static int xrCreateSurfaceAnchorCompleteANDROID(XrSpatialContextEXT spatialContext, @NativeType("XrFutureEXT") long future, @NativeType("XrSurfaceAnchorCreateCompletionANDROID *") XrSurfaceAnchorCreateCompletionANDROID completion) {
        return nxrCreateSurfaceAnchorCompleteANDROID(spatialContext, future, completion.address());
    }

}