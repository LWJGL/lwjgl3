/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ANDROIDTrackables {

    public static final int XR_ANDROID_trackables_SPEC_VERSION = 1;

    public static final String XR_ANDROID_TRACKABLES_EXTENSION_NAME = "XR_ANDROID_trackables";

    public static final int
        XR_TYPE_TRACKABLE_GET_INFO_ANDROID            = 1000455000,
        XR_TYPE_ANCHOR_SPACE_CREATE_INFO_ANDROID      = 1000455001,
        XR_TYPE_TRACKABLE_PLANE_ANDROID               = 1000455003,
        XR_TYPE_TRACKABLE_TRACKER_CREATE_INFO_ANDROID = 1000455004,
        XR_TYPE_SYSTEM_TRACKABLES_PROPERTIES_ANDROID  = 1000455005;

    public static final int XR_OBJECT_TYPE_TRACKABLE_TRACKER_ANDROID = 1000455001;

    public static final int
        XR_ERROR_MISMATCHING_TRACKABLE_TYPE_ANDROID   = -1000455000,
        XR_ERROR_TRACKABLE_TYPE_NOT_SUPPORTED_ANDROID = -1000455001;

    public static final int
        XR_TRACKING_STATE_PAUSED_ANDROID   = 0,
        XR_TRACKING_STATE_STOPPED_ANDROID  = 1,
        XR_TRACKING_STATE_TRACKING_ANDROID = 2;

    public static final int
        XR_TRACKABLE_TYPE_NOT_VALID_ANDROID = 0,
        XR_TRACKABLE_TYPE_PLANE_ANDROID     = 1;

    public static final int
        XR_PLANE_TYPE_HORIZONTAL_DOWNWARD_FACING_ANDROID = 0,
        XR_PLANE_TYPE_HORIZONTAL_UPWARD_FACING_ANDROID   = 1,
        XR_PLANE_TYPE_VERTICAL_ANDROID                   = 2,
        XR_PLANE_TYPE_ARBITRARY_ANDROID                  = 3;

    public static final int
        XR_PLANE_LABEL_UNKNOWN_ANDROID = 0,
        XR_PLANE_LABEL_WALL_ANDROID    = 1,
        XR_PLANE_LABEL_FLOOR_ANDROID   = 2,
        XR_PLANE_LABEL_CEILING_ANDROID = 3,
        XR_PLANE_LABEL_TABLE_ANDROID   = 4;

    protected ANDROIDTrackables() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateSupportedTrackableTypesANDROID ] ---

    /** {@code XrResult xrEnumerateSupportedTrackableTypesANDROID(XrInstance instance, XrSystemId systemId, uint32_t trackableTypeCapacityInput, uint32_t * trackableTypeCountOutput, XrTrackableTypeANDROID * trackableTypes)} */
    public static int nxrEnumerateSupportedTrackableTypesANDROID(XrInstance instance, long systemId, int trackableTypeCapacityInput, long trackableTypeCountOutput, long trackableTypes) {
        long __functionAddress = instance.getCapabilities().xrEnumerateSupportedTrackableTypesANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, trackableTypeCapacityInput, trackableTypeCountOutput, trackableTypes, __functionAddress);
    }

    /** {@code XrResult xrEnumerateSupportedTrackableTypesANDROID(XrInstance instance, XrSystemId systemId, uint32_t trackableTypeCapacityInput, uint32_t * trackableTypeCountOutput, XrTrackableTypeANDROID * trackableTypes)} */
    @NativeType("XrResult")
    public static int xrEnumerateSupportedTrackableTypesANDROID(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer trackableTypeCountOutput, @NativeType("XrTrackableTypeANDROID *") @Nullable IntBuffer trackableTypes) {
        if (CHECKS) {
            check(trackableTypeCountOutput, 1);
        }
        return nxrEnumerateSupportedTrackableTypesANDROID(instance, systemId, remainingSafe(trackableTypes), memAddress(trackableTypeCountOutput), memAddressSafe(trackableTypes));
    }

    // --- [ xrEnumerateSupportedAnchorTrackableTypesANDROID ] ---

    /** {@code XrResult xrEnumerateSupportedAnchorTrackableTypesANDROID(XrInstance instance, XrSystemId systemId, uint32_t trackableTypeCapacityInput, uint32_t * trackableTypeCountOutput, XrTrackableTypeANDROID * trackableTypes)} */
    public static int nxrEnumerateSupportedAnchorTrackableTypesANDROID(XrInstance instance, long systemId, int trackableTypeCapacityInput, long trackableTypeCountOutput, long trackableTypes) {
        long __functionAddress = instance.getCapabilities().xrEnumerateSupportedAnchorTrackableTypesANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, trackableTypeCapacityInput, trackableTypeCountOutput, trackableTypes, __functionAddress);
    }

    /** {@code XrResult xrEnumerateSupportedAnchorTrackableTypesANDROID(XrInstance instance, XrSystemId systemId, uint32_t trackableTypeCapacityInput, uint32_t * trackableTypeCountOutput, XrTrackableTypeANDROID * trackableTypes)} */
    @NativeType("XrResult")
    public static int xrEnumerateSupportedAnchorTrackableTypesANDROID(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer trackableTypeCountOutput, @NativeType("XrTrackableTypeANDROID *") @Nullable IntBuffer trackableTypes) {
        if (CHECKS) {
            check(trackableTypeCountOutput, 1);
        }
        return nxrEnumerateSupportedAnchorTrackableTypesANDROID(instance, systemId, remainingSafe(trackableTypes), memAddress(trackableTypeCountOutput), memAddressSafe(trackableTypes));
    }

    // --- [ xrCreateTrackableTrackerANDROID ] ---

    /** {@code XrResult xrCreateTrackableTrackerANDROID(XrSession session, XrTrackableTrackerCreateInfoANDROID const * createInfo, XrTrackableTrackerANDROID * trackableTracker)} */
    public static int nxrCreateTrackableTrackerANDROID(XrSession session, long createInfo, long trackableTracker) {
        long __functionAddress = session.getCapabilities().xrCreateTrackableTrackerANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, trackableTracker, __functionAddress);
    }

    /** {@code XrResult xrCreateTrackableTrackerANDROID(XrSession session, XrTrackableTrackerCreateInfoANDROID const * createInfo, XrTrackableTrackerANDROID * trackableTracker)} */
    @NativeType("XrResult")
    public static int xrCreateTrackableTrackerANDROID(XrSession session, @NativeType("XrTrackableTrackerCreateInfoANDROID const *") XrTrackableTrackerCreateInfoANDROID createInfo, @NativeType("XrTrackableTrackerANDROID *") PointerBuffer trackableTracker) {
        if (CHECKS) {
            check(trackableTracker, 1);
        }
        return nxrCreateTrackableTrackerANDROID(session, createInfo.address(), memAddress(trackableTracker));
    }

    // --- [ xrDestroyTrackableTrackerANDROID ] ---

    /** {@code XrResult xrDestroyTrackableTrackerANDROID(XrTrackableTrackerANDROID trackableTracker)} */
    @NativeType("XrResult")
    public static int xrDestroyTrackableTrackerANDROID(XrTrackableTrackerANDROID trackableTracker) {
        long __functionAddress = trackableTracker.getCapabilities().xrDestroyTrackableTrackerANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(trackableTracker.address(), __functionAddress);
    }

    // --- [ xrGetAllTrackablesANDROID ] ---

    /** {@code XrResult xrGetAllTrackablesANDROID(XrTrackableTrackerANDROID trackableTracker, uint32_t trackableCapacityInput, uint32_t * trackableCountOutput, XrTrackableANDROID * trackables)} */
    public static int nxrGetAllTrackablesANDROID(XrTrackableTrackerANDROID trackableTracker, int trackableCapacityInput, long trackableCountOutput, long trackables) {
        long __functionAddress = trackableTracker.getCapabilities().xrGetAllTrackablesANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(trackableTracker.address(), trackableCapacityInput, trackableCountOutput, trackables, __functionAddress);
    }

    /** {@code XrResult xrGetAllTrackablesANDROID(XrTrackableTrackerANDROID trackableTracker, uint32_t trackableCapacityInput, uint32_t * trackableCountOutput, XrTrackableANDROID * trackables)} */
    @NativeType("XrResult")
    public static int xrGetAllTrackablesANDROID(XrTrackableTrackerANDROID trackableTracker, @NativeType("uint32_t *") IntBuffer trackableCountOutput, @NativeType("XrTrackableANDROID *") @Nullable LongBuffer trackables) {
        if (CHECKS) {
            check(trackableCountOutput, 1);
        }
        return nxrGetAllTrackablesANDROID(trackableTracker, remainingSafe(trackables), memAddress(trackableCountOutput), memAddressSafe(trackables));
    }

    // --- [ xrGetTrackablePlaneANDROID ] ---

    /** {@code XrResult xrGetTrackablePlaneANDROID(XrTrackableTrackerANDROID trackableTracker, XrTrackableGetInfoANDROID const * getInfo, XrTrackablePlaneANDROID * planeOutput)} */
    public static int nxrGetTrackablePlaneANDROID(XrTrackableTrackerANDROID trackableTracker, long getInfo, long planeOutput) {
        long __functionAddress = trackableTracker.getCapabilities().xrGetTrackablePlaneANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrTrackableGetInfoANDROID.validate(getInfo);
        }
        return callPPPI(trackableTracker.address(), getInfo, planeOutput, __functionAddress);
    }

    /** {@code XrResult xrGetTrackablePlaneANDROID(XrTrackableTrackerANDROID trackableTracker, XrTrackableGetInfoANDROID const * getInfo, XrTrackablePlaneANDROID * planeOutput)} */
    @NativeType("XrResult")
    public static int xrGetTrackablePlaneANDROID(XrTrackableTrackerANDROID trackableTracker, @NativeType("XrTrackableGetInfoANDROID const *") XrTrackableGetInfoANDROID getInfo, @NativeType("XrTrackablePlaneANDROID *") XrTrackablePlaneANDROID planeOutput) {
        return nxrGetTrackablePlaneANDROID(trackableTracker, getInfo.address(), planeOutput.address());
    }

    // --- [ xrCreateAnchorSpaceANDROID ] ---

    /** {@code XrResult xrCreateAnchorSpaceANDROID(XrSession session, XrAnchorSpaceCreateInfoANDROID const * createInfo, XrSpace * anchorOutput)} */
    public static int nxrCreateAnchorSpaceANDROID(XrSession session, long createInfo, long anchorOutput) {
        long __functionAddress = session.getCapabilities().xrCreateAnchorSpaceANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrAnchorSpaceCreateInfoANDROID.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, anchorOutput, __functionAddress);
    }

    /** {@code XrResult xrCreateAnchorSpaceANDROID(XrSession session, XrAnchorSpaceCreateInfoANDROID const * createInfo, XrSpace * anchorOutput)} */
    @NativeType("XrResult")
    public static int xrCreateAnchorSpaceANDROID(XrSession session, @NativeType("XrAnchorSpaceCreateInfoANDROID const *") XrAnchorSpaceCreateInfoANDROID createInfo, @NativeType("XrSpace *") PointerBuffer anchorOutput) {
        if (CHECKS) {
            check(anchorOutput, 1);
        }
        return nxrCreateAnchorSpaceANDROID(session, createInfo.address(), memAddress(anchorOutput));
    }

}