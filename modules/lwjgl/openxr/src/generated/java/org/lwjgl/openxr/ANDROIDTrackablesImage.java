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

public class ANDROIDTrackablesImage {

    public static final int XR_ANDROID_trackables_image_SPEC_VERSION = 1;

    public static final String XR_ANDROID_TRACKABLES_IMAGE_EXTENSION_NAME = "XR_ANDROID_trackables_image";

    public static final int
        XR_TYPE_SYSTEM_IMAGE_TRACKING_PROPERTIES_ANDROID           = 1000709000,
        XR_TYPE_TRACKABLE_IMAGE_DATABASE_ENTRY_ANDROID             = 1000709001,
        XR_TYPE_TRACKABLE_IMAGE_DATABASE_CREATE_INFO_ANDROID       = 1000709002,
        XR_TYPE_CREATE_TRACKABLE_IMAGE_DATABASE_COMPLETION_ANDROID = 1000709003,
        XR_TYPE_TRACKABLE_IMAGE_CONFIGURATION_ANDROID              = 1000709004,
        XR_TYPE_TRACKABLE_IMAGE_ANDROID                            = 1000709005,
        XR_TYPE_EVENT_DATA_IMAGE_TRACKING_LOST_ANDROID             = 1000709006;

    public static final int XR_OBJECT_TYPE_TRACKABLE_IMAGE_DATABASE_ANDROID = 1000709000;

    public static final int XR_ERROR_IMAGE_FORMAT_UNSUPPORTED_ANDROID = -1000709000;

    public static final int XR_TRACKABLE_TYPE_IMAGE_ANDROID = 1000709000;

    public static final int
        XR_TRACKABLE_IMAGE_TRACKING_MODE_DYNAMIC_ANDROID = 1,
        XR_TRACKABLE_IMAGE_TRACKING_MODE_STATIC_ANDROID  = 2;

    public static final int XR_TRACKABLE_IMAGE_FORMAT_R8G8B8A8_ANDROID = 1;

    protected ANDROIDTrackablesImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateTrackableImageDatabaseAsyncANDROID ] ---

    /** {@code XrResult xrCreateTrackableImageDatabaseAsyncANDROID(XrSession session, XrTrackableImageDatabaseCreateInfoANDROID const * createInfo, XrFutureEXT * future)} */
    public static int nxrCreateTrackableImageDatabaseAsyncANDROID(XrSession session, long createInfo, long future) {
        long __functionAddress = session.getCapabilities().xrCreateTrackableImageDatabaseAsyncANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrTrackableImageDatabaseCreateInfoANDROID.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, future, __functionAddress);
    }

    /** {@code XrResult xrCreateTrackableImageDatabaseAsyncANDROID(XrSession session, XrTrackableImageDatabaseCreateInfoANDROID const * createInfo, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrCreateTrackableImageDatabaseAsyncANDROID(XrSession session, @NativeType("XrTrackableImageDatabaseCreateInfoANDROID const *") XrTrackableImageDatabaseCreateInfoANDROID createInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrCreateTrackableImageDatabaseAsyncANDROID(session, createInfo.address(), memAddress(future));
    }

    // --- [ xrCreateTrackableImageDatabaseCompleteANDROID ] ---

    /** {@code XrResult xrCreateTrackableImageDatabaseCompleteANDROID(XrSession session, XrFutureEXT future, XrCreateTrackableImageDatabaseCompletionANDROID * completion)} */
    public static int nxrCreateTrackableImageDatabaseCompleteANDROID(XrSession session, long future, long completion) {
        long __functionAddress = session.getCapabilities().xrCreateTrackableImageDatabaseCompleteANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrCreateTrackableImageDatabaseCompleteANDROID(XrSession session, XrFutureEXT future, XrCreateTrackableImageDatabaseCompletionANDROID * completion)} */
    @NativeType("XrResult")
    public static int xrCreateTrackableImageDatabaseCompleteANDROID(XrSession session, @NativeType("XrFutureEXT") long future, @NativeType("XrCreateTrackableImageDatabaseCompletionANDROID *") XrCreateTrackableImageDatabaseCompletionANDROID completion) {
        return nxrCreateTrackableImageDatabaseCompleteANDROID(session, future, completion.address());
    }

    // --- [ xrDestroyTrackableImageDatabaseANDROID ] ---

    /** {@code XrResult xrDestroyTrackableImageDatabaseANDROID(XrTrackableImageDatabaseANDROID database)} */
    @NativeType("XrResult")
    public static int xrDestroyTrackableImageDatabaseANDROID(XrTrackableImageDatabaseANDROID database) {
        long __functionAddress = database.getCapabilities().xrDestroyTrackableImageDatabaseANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(database.address(), __functionAddress);
    }

    // --- [ xrAddTrackableImageDatabaseANDROID ] ---

    /** {@code XrResult xrAddTrackableImageDatabaseANDROID(XrTrackableTrackerANDROID tracker, XrTrackableImageDatabaseANDROID database)} */
    @NativeType("XrResult")
    public static int xrAddTrackableImageDatabaseANDROID(XrTrackableTrackerANDROID tracker, XrTrackableImageDatabaseANDROID database) {
        long __functionAddress = tracker.getCapabilities().xrAddTrackableImageDatabaseANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(tracker.address(), database.address(), __functionAddress);
    }

    // --- [ xrRemoveTrackableImageDatabaseANDROID ] ---

    /** {@code XrResult xrRemoveTrackableImageDatabaseANDROID(XrTrackableTrackerANDROID tracker, XrTrackableImageDatabaseANDROID database)} */
    @NativeType("XrResult")
    public static int xrRemoveTrackableImageDatabaseANDROID(XrTrackableTrackerANDROID tracker, XrTrackableImageDatabaseANDROID database) {
        long __functionAddress = tracker.getCapabilities().xrRemoveTrackableImageDatabaseANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(tracker.address(), database.address(), __functionAddress);
    }

    // --- [ xrGetTrackableImageANDROID ] ---

    /** {@code XrResult xrGetTrackableImageANDROID(XrTrackableTrackerANDROID tracker, XrTrackableGetInfoANDROID const * getInfo, XrTrackableImageANDROID * trackable)} */
    public static int nxrGetTrackableImageANDROID(XrTrackableTrackerANDROID tracker, long getInfo, long trackable) {
        long __functionAddress = tracker.getCapabilities().xrGetTrackableImageANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrTrackableGetInfoANDROID.validate(getInfo);
        }
        return callPPPI(tracker.address(), getInfo, trackable, __functionAddress);
    }

    /** {@code XrResult xrGetTrackableImageANDROID(XrTrackableTrackerANDROID tracker, XrTrackableGetInfoANDROID const * getInfo, XrTrackableImageANDROID * trackable)} */
    @NativeType("XrResult")
    public static int xrGetTrackableImageANDROID(XrTrackableTrackerANDROID tracker, @NativeType("XrTrackableGetInfoANDROID const *") XrTrackableGetInfoANDROID getInfo, @NativeType("XrTrackableImageANDROID *") XrTrackableImageANDROID trackable) {
        return nxrGetTrackableImageANDROID(tracker, getInfo.address(), trackable.address());
    }

}