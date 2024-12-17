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
    binding = OPENVR_FNTABLE_BINDING
) {
    EVRNotificationError(
        "CreateNotification",

        VROverlayHandle_t("ulOverlayHandle"),
        uint64_t("ulUserValue"),
        EVRNotificationType("type"),
        charASCII.const.p("pchText"),
        EVRNotificationStyle("style"),
        nullable..NotificationBitmap_t.const.p("pImage"),
        Check(1)..VRNotificationId.p("pNotificationId")
    )

    EVRNotificationError(
        "RemoveNotification",

        VRNotificationId("notificationId")
    )
}