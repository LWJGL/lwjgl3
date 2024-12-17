/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class MLSystemNotifications {

    public static final int XR_ML_system_notifications_SPEC_VERSION = 1;

    public static final String XR_ML_SYSTEM_NOTIFICATIONS_EXTENSION_NAME = "XR_ML_system_notifications";

    public static final int XR_TYPE_SYSTEM_NOTIFICATIONS_SET_INFO_ML = 1000473000;

    public static final int
        XR_ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML = -1000473000,
        XR_ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML  = -1000473001;

    protected MLSystemNotifications() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetSystemNotificationsML ] ---

    /** {@code XrResult xrSetSystemNotificationsML(XrInstance instance, XrSystemNotificationsSetInfoML const * info)} */
    public static int nxrSetSystemNotificationsML(XrInstance instance, long info) {
        long __functionAddress = instance.getCapabilities().xrSetSystemNotificationsML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(instance.address(), info, __functionAddress);
    }

    /** {@code XrResult xrSetSystemNotificationsML(XrInstance instance, XrSystemNotificationsSetInfoML const * info)} */
    @NativeType("XrResult")
    public static int xrSetSystemNotificationsML(XrInstance instance, @NativeType("XrSystemNotificationsSetInfoML const *") XrSystemNotificationsSetInfoML info) {
        return nxrSetSystemNotificationsML(instance, info.address());
    }

}