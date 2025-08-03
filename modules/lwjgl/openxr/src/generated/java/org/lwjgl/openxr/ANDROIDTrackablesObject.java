/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class ANDROIDTrackablesObject {

    public static final int XR_ANDROID_trackables_object_SPEC_VERSION = 1;

    public static final String XR_ANDROID_TRACKABLES_OBJECT_EXTENSION_NAME = "XR_ANDROID_trackables_object";

    public static final int
        XR_TYPE_TRACKABLE_OBJECT_ANDROID               = 1000466000,
        XR_TYPE_TRACKABLE_OBJECT_CONFIGURATION_ANDROID = 1000466001;

    public static final int XR_TRACKABLE_TYPE_OBJECT_ANDROID = 1000466000;

    public static final int
        XR_OBJECT_LABEL_UNKNOWN_ANDROID  = 0,
        XR_OBJECT_LABEL_KEYBOARD_ANDROID = 1,
        XR_OBJECT_LABEL_MOUSE_ANDROID    = 2,
        XR_OBJECT_LABEL_LAPTOP_ANDROID   = 3;

    protected ANDROIDTrackablesObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetTrackableObjectANDROID ] ---

    /** {@code XrResult xrGetTrackableObjectANDROID(XrTrackableTrackerANDROID tracker, XrTrackableGetInfoANDROID const * getInfo, XrTrackableObjectANDROID * objectOutput)} */
    public static int nxrGetTrackableObjectANDROID(XrTrackableTrackerANDROID tracker, long getInfo, long objectOutput) {
        long __functionAddress = tracker.getCapabilities().xrGetTrackableObjectANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrTrackableGetInfoANDROID.validate(getInfo);
        }
        return callPPPI(tracker.address(), getInfo, objectOutput, __functionAddress);
    }

    /** {@code XrResult xrGetTrackableObjectANDROID(XrTrackableTrackerANDROID tracker, XrTrackableGetInfoANDROID const * getInfo, XrTrackableObjectANDROID * objectOutput)} */
    @NativeType("XrResult")
    public static int xrGetTrackableObjectANDROID(XrTrackableTrackerANDROID tracker, @NativeType("XrTrackableGetInfoANDROID const *") XrTrackableGetInfoANDROID getInfo, @NativeType("XrTrackableObjectANDROID *") XrTrackableObjectANDROID objectOutput) {
        return nxrGetTrackableObjectANDROID(tracker, getInfo.address(), objectOutput.address());
    }

}