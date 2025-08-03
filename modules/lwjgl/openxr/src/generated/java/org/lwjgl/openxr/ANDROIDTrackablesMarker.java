/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class ANDROIDTrackablesMarker {

    public static final int XR_ANDROID_trackables_marker_SPEC_VERSION = 1;

    public static final String XR_ANDROID_TRACKABLES_MARKER_EXTENSION_NAME = "XR_ANDROID_trackables_marker";

    public static final int
        XR_TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_ANDROID = 1000707000,
        XR_TYPE_TRACKABLE_MARKER_CONFIGURATION_ANDROID    = 1000707001,
        XR_TYPE_TRACKABLE_MARKER_ANDROID                  = 1000707002;

    public static final int XR_TRACKABLE_TYPE_MARKER_ANDROID = 1000707000;

    public static final int
        XR_TRACKABLE_MARKER_TRACKING_MODE_DYNAMIC_ANDROID = 0,
        XR_TRACKABLE_MARKER_TRACKING_MODE_STATIC_ANDROID  = 1;

    public static final int
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_4X4_50_ANDROID   = 0,
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_4X4_100_ANDROID  = 1,
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_4X4_250_ANDROID  = 2,
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_4X4_1000_ANDROID = 3,
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_5X5_50_ANDROID   = 4,
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_5X5_100_ANDROID  = 5,
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_5X5_250_ANDROID  = 6,
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_5X5_1000_ANDROID = 7,
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_6X6_50_ANDROID   = 8,
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_6X6_100_ANDROID  = 9,
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_6X6_250_ANDROID  = 10,
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_6X6_1000_ANDROID = 11,
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_7X7_50_ANDROID   = 12,
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_7X7_100_ANDROID  = 13,
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_7X7_250_ANDROID  = 14,
        XR_TRACKABLE_MARKER_DICTIONARY_ARUCO_7X7_1000_ANDROID = 15,
        XR_TRACKABLE_MARKER_DICTIONARY_APRILTAG_16H5_ANDROID  = 16,
        XR_TRACKABLE_MARKER_DICTIONARY_APRILTAG_25H9_ANDROID  = 17,
        XR_TRACKABLE_MARKER_DICTIONARY_APRILTAG_36H10_ANDROID = 18,
        XR_TRACKABLE_MARKER_DICTIONARY_APRILTAG_36H11_ANDROID = 19;

    protected ANDROIDTrackablesMarker() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetTrackableMarkerANDROID ] ---

    /** {@code XrResult xrGetTrackableMarkerANDROID(XrTrackableTrackerANDROID tracker, XrTrackableGetInfoANDROID const * getInfo, XrTrackableMarkerANDROID * markerOutput)} */
    public static int nxrGetTrackableMarkerANDROID(XrTrackableTrackerANDROID tracker, long getInfo, long markerOutput) {
        long __functionAddress = tracker.getCapabilities().xrGetTrackableMarkerANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrTrackableGetInfoANDROID.validate(getInfo);
        }
        return callPPPI(tracker.address(), getInfo, markerOutput, __functionAddress);
    }

    /** {@code XrResult xrGetTrackableMarkerANDROID(XrTrackableTrackerANDROID tracker, XrTrackableGetInfoANDROID const * getInfo, XrTrackableMarkerANDROID * markerOutput)} */
    @NativeType("XrResult")
    public static int xrGetTrackableMarkerANDROID(XrTrackableTrackerANDROID tracker, @NativeType("XrTrackableGetInfoANDROID const *") XrTrackableGetInfoANDROID getInfo, @NativeType("XrTrackableMarkerANDROID *") XrTrackableMarkerANDROID markerOutput) {
        return nxrGetTrackableMarkerANDROID(tracker, getInfo.address(), markerOutput.address());
    }

}