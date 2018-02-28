/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRNotifications = "VRNotifications".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRNotifications_",
    library = OPENVR_LIBRARY,
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    EVRNotificationError(
        "CreateNotification",
        """
        Create a notification and enqueue it to be shown to the user.

        An overlay handle is required to create a notification, as otherwise it would be impossible for a user to act on it. To create a two-line notification,
        use a line break ('\n') to split the text into two lines. The {@code pImage} argument may be #NULL, in which case the specified overlay's icon will be
        used instead.
        """,

        VROverlayHandle_t.IN("ulOverlayHandle", ""),
        uint64_t.IN("ulUserValue", ""),
        EVRNotificationType.IN("type", "", "EVRNotificationType_\\w+"),
        charASCII.const.p.IN("pchText", ""),
        EVRNotificationStyle.IN("style", "", "EVRNotificationStyle_\\w+"),
        nullable..NotificationBitmap_t.const.p.IN("pImage", ""),
        Check(1)..VRNotificationId.p.OUT("pNotificationId", "")
    )

    EVRNotificationError(
        "RemoveNotification",
        "Destroy a notification, hiding it first if it currently shown to the user.",

        VRNotificationId.IN("notificationId", "")
    )
}