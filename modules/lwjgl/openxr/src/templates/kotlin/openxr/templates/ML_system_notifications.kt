/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_system_notifications = "MLSystemNotifications".nativeClassXR("ML_system_notifications", type = "instance", postfix = "ML") {
    IntConstant(
        "ML_system_notifications_SPEC_VERSION".."1"
    )

    StringConstant(
        "ML_SYSTEM_NOTIFICATIONS_EXTENSION_NAME".."XR_ML_system_notifications"
    )

    EnumConstant(
        "TYPE_SYSTEM_NOTIFICATIONS_SET_INFO_ML".."1000473000"
    )

    EnumConstant(
        "ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML".."-1000473000",
        "ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML".."-1000473001"
    )

    XrResult(
        "SetSystemNotificationsML",

        XrInstance("instance"),
        XrSystemNotificationsSetInfoML.const.p("info")
    )
}