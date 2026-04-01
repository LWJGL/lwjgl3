/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class ANDROIDTrackablesQrCode {

    public static final int XR_ANDROID_trackables_qr_code_SPEC_VERSION = 1;

    public static final String XR_ANDROID_TRACKABLES_QR_CODE_EXTENSION_NAME = "XR_ANDROID_trackables_qr_code";

    public static final int
        XR_TYPE_SYSTEM_QR_CODE_TRACKING_PROPERTIES_ANDROID = 1000708000,
        XR_TYPE_TRACKABLE_QR_CODE_CONFIGURATION_ANDROID    = 1000708001,
        XR_TYPE_TRACKABLE_QR_CODE_ANDROID                  = 1000708002;

    public static final int XR_TRACKABLE_TYPE_QR_CODE_ANDROID = 1000708000;

    public static final int
        XR_QR_CODE_TRACKING_MODE_DYNAMIC_ANDROID = 0,
        XR_QR_CODE_TRACKING_MODE_STATIC_ANDROID  = 1;

    protected ANDROIDTrackablesQrCode() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetTrackableQrCodeANDROID ] ---

    /** {@code XrResult xrGetTrackableQrCodeANDROID(XrTrackableTrackerANDROID tracker, XrTrackableGetInfoANDROID const * getInfo, XrTrackableQrCodeANDROID * qrCodeOutput)} */
    public static int nxrGetTrackableQrCodeANDROID(XrTrackableTrackerANDROID tracker, long getInfo, long qrCodeOutput) {
        long __functionAddress = tracker.getCapabilities().xrGetTrackableQrCodeANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrTrackableGetInfoANDROID.validate(getInfo);
        }
        return callPPPI(tracker.address(), getInfo, qrCodeOutput, __functionAddress);
    }

    /** {@code XrResult xrGetTrackableQrCodeANDROID(XrTrackableTrackerANDROID tracker, XrTrackableGetInfoANDROID const * getInfo, XrTrackableQrCodeANDROID * qrCodeOutput)} */
    @NativeType("XrResult")
    public static int xrGetTrackableQrCodeANDROID(XrTrackableTrackerANDROID tracker, @NativeType("XrTrackableGetInfoANDROID const *") XrTrackableGetInfoANDROID getInfo, @NativeType("XrTrackableQrCodeANDROID *") XrTrackableQrCodeANDROID qrCodeOutput) {
        return nxrGetTrackableQrCodeANDROID(tracker, getInfo.address(), qrCodeOutput.address());
    }

}