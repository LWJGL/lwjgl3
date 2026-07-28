/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ANDROIDGeospatial {

    public static final int XR_ANDROID_geospatial_SPEC_VERSION = 1;

    public static final String XR_ANDROID_GEOSPATIAL_EXTENSION_NAME = "XR_ANDROID_geospatial";

    public static final int
        XR_TYPE_SYSTEM_GEOSPATIAL_PROPERTIES_ANDROID                = 1000789000,
        XR_TYPE_GEOSPATIAL_TRACKER_CREATE_INFO_ANDROID              = 1000789001,
        XR_TYPE_EVENT_DATA_GEOSPATIAL_TRACKER_STATE_CHANGED_ANDROID = 1000789002,
        XR_TYPE_GEOSPATIAL_POSE_FROM_POSE_LOCATE_INFO_ANDROID       = 1000789003,
        XR_TYPE_GEOSPATIAL_POSE_RESULT_ANDROID                      = 1000789004,
        XR_TYPE_GEOSPATIAL_POSE_LOCATE_INFO_ANDROID                 = 1000789005,
        XR_TYPE_VPS_AVAILABILITY_CHECK_COMPLETION_ANDROID           = 1000789006;

    public static final int XR_OBJECT_TYPE_GEOSPATIAL_TRACKER_ANDROID = 1000789000;

    public static final int
        XR_ERROR_GEOSPATIAL_TRACKER_NOT_RUNNING_ANDROID = -1000789000,
        XR_ERROR_GEOSPATIAL_COORDINATES_INVALID_ANDROID = -1000789001,
        XR_ERROR_GEOSPATIAL_CLOUD_AUTH_FAILED_ANDROID   = -1000789002;

    public static final int
        XR_GEOSPATIAL_TRACKER_STATE_STOPPED_ANDROID               = 0,
        XR_GEOSPATIAL_TRACKER_STATE_RUNNING_ANDROID               = 1,
        XR_GEOSPATIAL_TRACKER_STATE_INITIALIZATION_FAILED_ANDROID = 2;

    public static final int
        XR_GEOSPATIAL_POSE_ORIENTATION_VALID_BIT_ANDROID = 0x1,
        XR_GEOSPATIAL_POSE_POSITION_VALID_BIT_ANDROID    = 0x2;

    public static final int
        XR_VPS_AVAILABILITY_UNAVAILABLE_ANDROID = 1,
        XR_VPS_AVAILABILITY_AVAILABLE_ANDROID   = 2;

    protected ANDROIDGeospatial() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateGeospatialTrackerANDROID ] ---

    /** {@code XrResult xrCreateGeospatialTrackerANDROID(XrSession session, XrGeospatialTrackerCreateInfoANDROID const * createInfo, XrGeospatialTrackerANDROID * geospatialTrackerOutput)} */
    public static int nxrCreateGeospatialTrackerANDROID(XrSession session, long createInfo, long geospatialTrackerOutput) {
        long __functionAddress = session.getCapabilities().xrCreateGeospatialTrackerANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, geospatialTrackerOutput, __functionAddress);
    }

    /** {@code XrResult xrCreateGeospatialTrackerANDROID(XrSession session, XrGeospatialTrackerCreateInfoANDROID const * createInfo, XrGeospatialTrackerANDROID * geospatialTrackerOutput)} */
    @NativeType("XrResult")
    public static int xrCreateGeospatialTrackerANDROID(XrSession session, @NativeType("XrGeospatialTrackerCreateInfoANDROID const *") XrGeospatialTrackerCreateInfoANDROID createInfo, @NativeType("XrGeospatialTrackerANDROID *") PointerBuffer geospatialTrackerOutput) {
        if (CHECKS) {
            check(geospatialTrackerOutput, 1);
        }
        return nxrCreateGeospatialTrackerANDROID(session, createInfo.address(), memAddress(geospatialTrackerOutput));
    }

    // --- [ xrDestroyGeospatialTrackerANDROID ] ---

    /** {@code XrResult xrDestroyGeospatialTrackerANDROID(XrGeospatialTrackerANDROID geospatialTracker)} */
    @NativeType("XrResult")
    public static int xrDestroyGeospatialTrackerANDROID(XrGeospatialTrackerANDROID geospatialTracker) {
        long __functionAddress = geospatialTracker.getCapabilities().xrDestroyGeospatialTrackerANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(geospatialTracker.address(), __functionAddress);
    }

    // --- [ xrLocateGeospatialPoseFromPoseANDROID ] ---

    /** {@code XrResult xrLocateGeospatialPoseFromPoseANDROID(XrGeospatialTrackerANDROID geospatialTracker, XrGeospatialPoseFromPoseLocateInfoANDROID const * locateInfo, XrGeospatialPoseResultANDROID * geospatialPoseResult)} */
    public static int nxrLocateGeospatialPoseFromPoseANDROID(XrGeospatialTrackerANDROID geospatialTracker, long locateInfo, long geospatialPoseResult) {
        long __functionAddress = geospatialTracker.getCapabilities().xrLocateGeospatialPoseFromPoseANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrGeospatialPoseFromPoseLocateInfoANDROID.validate(locateInfo);
        }
        return callPPPI(geospatialTracker.address(), locateInfo, geospatialPoseResult, __functionAddress);
    }

    /** {@code XrResult xrLocateGeospatialPoseFromPoseANDROID(XrGeospatialTrackerANDROID geospatialTracker, XrGeospatialPoseFromPoseLocateInfoANDROID const * locateInfo, XrGeospatialPoseResultANDROID * geospatialPoseResult)} */
    @NativeType("XrResult")
    public static int xrLocateGeospatialPoseFromPoseANDROID(XrGeospatialTrackerANDROID geospatialTracker, @NativeType("XrGeospatialPoseFromPoseLocateInfoANDROID const *") XrGeospatialPoseFromPoseLocateInfoANDROID locateInfo, @NativeType("XrGeospatialPoseResultANDROID *") XrGeospatialPoseResultANDROID geospatialPoseResult) {
        return nxrLocateGeospatialPoseFromPoseANDROID(geospatialTracker, locateInfo.address(), geospatialPoseResult.address());
    }

    // --- [ xrLocateGeospatialPoseANDROID ] ---

    /** {@code XrResult xrLocateGeospatialPoseANDROID(XrGeospatialTrackerANDROID geospatialTracker, XrGeospatialPoseLocateInfoANDROID const * locateInfo, XrSpaceLocation * location)} */
    public static int nxrLocateGeospatialPoseANDROID(XrGeospatialTrackerANDROID geospatialTracker, long locateInfo, long location) {
        long __functionAddress = geospatialTracker.getCapabilities().xrLocateGeospatialPoseANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrGeospatialPoseLocateInfoANDROID.validate(locateInfo);
        }
        return callPPPI(geospatialTracker.address(), locateInfo, location, __functionAddress);
    }

    /** {@code XrResult xrLocateGeospatialPoseANDROID(XrGeospatialTrackerANDROID geospatialTracker, XrGeospatialPoseLocateInfoANDROID const * locateInfo, XrSpaceLocation * location)} */
    @NativeType("XrResult")
    public static int xrLocateGeospatialPoseANDROID(XrGeospatialTrackerANDROID geospatialTracker, @NativeType("XrGeospatialPoseLocateInfoANDROID const *") XrGeospatialPoseLocateInfoANDROID locateInfo, @NativeType("XrSpaceLocation *") XrSpaceLocation location) {
        return nxrLocateGeospatialPoseANDROID(geospatialTracker, locateInfo.address(), location.address());
    }

    // --- [ xrCheckVpsAvailabilityAsyncANDROID ] ---

    /** {@code XrResult xrCheckVpsAvailabilityAsyncANDROID(XrSession session, double latitude, double longitude, XrFutureEXT * future)} */
    public static int nxrCheckVpsAvailabilityAsyncANDROID(XrSession session, double latitude, double longitude, long future) {
        long __functionAddress = session.getCapabilities().xrCheckVpsAvailabilityAsyncANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), latitude, longitude, future, __functionAddress);
    }

    /** {@code XrResult xrCheckVpsAvailabilityAsyncANDROID(XrSession session, double latitude, double longitude, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrCheckVpsAvailabilityAsyncANDROID(XrSession session, double latitude, double longitude, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrCheckVpsAvailabilityAsyncANDROID(session, latitude, longitude, memAddress(future));
    }

    // --- [ xrCheckVpsAvailabilityCompleteANDROID ] ---

    /** {@code XrResult xrCheckVpsAvailabilityCompleteANDROID(XrSession session, XrFutureEXT future, XrVPSAvailabilityCheckCompletionANDROID * completion)} */
    public static int nxrCheckVpsAvailabilityCompleteANDROID(XrSession session, long future, long completion) {
        long __functionAddress = session.getCapabilities().xrCheckVpsAvailabilityCompleteANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrCheckVpsAvailabilityCompleteANDROID(XrSession session, XrFutureEXT future, XrVPSAvailabilityCheckCompletionANDROID * completion)} */
    @NativeType("XrResult")
    public static int xrCheckVpsAvailabilityCompleteANDROID(XrSession session, @NativeType("XrFutureEXT") long future, @NativeType("XrVPSAvailabilityCheckCompletionANDROID *") XrVPSAvailabilityCheckCompletionANDROID completion) {
        return nxrCheckVpsAvailabilityCompleteANDROID(session, future, completion.address());
    }

}