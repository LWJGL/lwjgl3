/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VRNotifications {

    protected VRNotifications() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRNotifications_CreateNotification ] ---

    /** {@code EVRNotificationError VRNotifications_CreateNotification(VROverlayHandle_t ulOverlayHandle, uint64_t ulUserValue, EVRNotificationType type, char const * pchText, EVRNotificationStyle style, NotificationBitmap_t const * pImage, VRNotificationId * pNotificationId)} */
    public static int nVRNotifications_CreateNotification(long ulOverlayHandle, long ulUserValue, int type, long pchText, int style, long pImage, long pNotificationId) {
        long __functionAddress = OpenVR.VRNotifications.CreateNotification;
        if (CHECKS) {
            check(__functionAddress);
            if (pImage != NULL) { NotificationBitmap.validate(pImage); }
        }
        return callJJPPPI(ulOverlayHandle, ulUserValue, type, pchText, style, pImage, pNotificationId, __functionAddress);
    }

    /** {@code EVRNotificationError VRNotifications_CreateNotification(VROverlayHandle_t ulOverlayHandle, uint64_t ulUserValue, EVRNotificationType type, char const * pchText, EVRNotificationStyle style, NotificationBitmap_t const * pImage, VRNotificationId * pNotificationId)} */
    @NativeType("EVRNotificationError")
    public static int VRNotifications_CreateNotification(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint64_t") long ulUserValue, @NativeType("EVRNotificationType") int type, @NativeType("char const *") ByteBuffer pchText, @NativeType("EVRNotificationStyle") int style, @NativeType("NotificationBitmap_t const *") @Nullable NotificationBitmap pImage, @NativeType("VRNotificationId *") IntBuffer pNotificationId) {
        if (CHECKS) {
            checkNT1(pchText);
            check(pNotificationId, 1);
        }
        return nVRNotifications_CreateNotification(ulOverlayHandle, ulUserValue, type, memAddress(pchText), style, memAddressSafe(pImage), memAddress(pNotificationId));
    }

    /** {@code EVRNotificationError VRNotifications_CreateNotification(VROverlayHandle_t ulOverlayHandle, uint64_t ulUserValue, EVRNotificationType type, char const * pchText, EVRNotificationStyle style, NotificationBitmap_t const * pImage, VRNotificationId * pNotificationId)} */
    @NativeType("EVRNotificationError")
    public static int VRNotifications_CreateNotification(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint64_t") long ulUserValue, @NativeType("EVRNotificationType") int type, @NativeType("char const *") CharSequence pchText, @NativeType("EVRNotificationStyle") int style, @NativeType("NotificationBitmap_t const *") @Nullable NotificationBitmap pImage, @NativeType("VRNotificationId *") IntBuffer pNotificationId) {
        if (CHECKS) {
            check(pNotificationId, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchText, true);
            long pchTextEncoded = stack.getPointerAddress();
            return nVRNotifications_CreateNotification(ulOverlayHandle, ulUserValue, type, pchTextEncoded, style, memAddressSafe(pImage), memAddress(pNotificationId));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRNotifications_RemoveNotification ] ---

    /** {@code EVRNotificationError VRNotifications_RemoveNotification(VRNotificationId notificationId)} */
    @NativeType("EVRNotificationError")
    public static int VRNotifications_RemoveNotification(@NativeType("VRNotificationId") int notificationId) {
        long __functionAddress = OpenVR.VRNotifications.RemoveNotification;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(notificationId, __functionAddress);
    }

}