/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

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

    /** Unsafe version of: {@link #VRNotifications_CreateNotification CreateNotification} */
    public static int nVRNotifications_CreateNotification(long ulOverlayHandle, long ulUserValue, int type, long pchText, int style, long pImage, long pNotificationId) {
        long __functionAddress = OpenVR.VRNotifications.CreateNotification;
        if (CHECKS) {
            check(__functionAddress);
            if (pImage != NULL) { NotificationBitmap.validate(pImage); }
        }
        return callJJPPPI(ulOverlayHandle, ulUserValue, type, pchText, style, pImage, pNotificationId, __functionAddress);
    }

    /**
     * Create a notification and enqueue it to be shown to the user.
     * 
     * <p>An overlay handle is required to create a notification, as otherwise it would be impossible for a user to act on it. To create a two-line notification,
     * use a line break ('\n') to split the text into two lines. The {@code pImage} argument may be {@code NULL}, in which case the specified overlay's icon will be
     * used instead.</p>
     *
     * @param type  one of:<br><table><tr><td>{@link VR#EVRNotificationType_Transient}</td><td>{@link VR#EVRNotificationType_Persistent}</td></tr><tr><td>{@link VR#EVRNotificationType_Transient_SystemWithUserValue}</td></tr></table>
     * @param style one of:<br><table><tr><td>{@link VR#EVRNotificationStyle_None}</td><td>{@link VR#EVRNotificationStyle_Application}</td></tr><tr><td>{@link VR#EVRNotificationStyle_Contact_Disabled}</td><td>{@link VR#EVRNotificationStyle_Contact_Enabled}</td></tr><tr><td>{@link VR#EVRNotificationStyle_Contact_Active}</td></tr></table>
     */
    @NativeType("EVRNotificationError")
    public static int VRNotifications_CreateNotification(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint64_t") long ulUserValue, @NativeType("EVRNotificationType") int type, @NativeType("char const *") ByteBuffer pchText, @NativeType("EVRNotificationStyle") int style, @Nullable @NativeType("NotificationBitmap_t const *") NotificationBitmap pImage, @NativeType("VRNotificationId *") IntBuffer pNotificationId) {
        if (CHECKS) {
            checkNT1(pchText);
            check(pNotificationId, 1);
        }
        return nVRNotifications_CreateNotification(ulOverlayHandle, ulUserValue, type, memAddress(pchText), style, memAddressSafe(pImage), memAddress(pNotificationId));
    }

    /**
     * Create a notification and enqueue it to be shown to the user.
     * 
     * <p>An overlay handle is required to create a notification, as otherwise it would be impossible for a user to act on it. To create a two-line notification,
     * use a line break ('\n') to split the text into two lines. The {@code pImage} argument may be {@code NULL}, in which case the specified overlay's icon will be
     * used instead.</p>
     *
     * @param type  one of:<br><table><tr><td>{@link VR#EVRNotificationType_Transient}</td><td>{@link VR#EVRNotificationType_Persistent}</td></tr><tr><td>{@link VR#EVRNotificationType_Transient_SystemWithUserValue}</td></tr></table>
     * @param style one of:<br><table><tr><td>{@link VR#EVRNotificationStyle_None}</td><td>{@link VR#EVRNotificationStyle_Application}</td></tr><tr><td>{@link VR#EVRNotificationStyle_Contact_Disabled}</td><td>{@link VR#EVRNotificationStyle_Contact_Enabled}</td></tr><tr><td>{@link VR#EVRNotificationStyle_Contact_Active}</td></tr></table>
     */
    @NativeType("EVRNotificationError")
    public static int VRNotifications_CreateNotification(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint64_t") long ulUserValue, @NativeType("EVRNotificationType") int type, @NativeType("char const *") CharSequence pchText, @NativeType("EVRNotificationStyle") int style, @Nullable @NativeType("NotificationBitmap_t const *") NotificationBitmap pImage, @NativeType("VRNotificationId *") IntBuffer pNotificationId) {
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

    /** Destroy a notification, hiding it first if it currently shown to the user. */
    @NativeType("EVRNotificationError")
    public static int VRNotifications_RemoveNotification(@NativeType("VRNotificationId") int notificationId) {
        long __functionAddress = OpenVR.VRNotifications.RemoveNotification;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(notificationId, __functionAddress);
    }

}