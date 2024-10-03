/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_system_notifications = "MLSystemNotifications".nativeClassXR("ML_system_notifications", type = "instance", postfix = "ML") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_ML_system_notifications">XR_ML_system_notifications</a> extension.

        This extension provides control over the system notifications. This extension allows system notifications that might obscure the field of view to be disabled.

        Note that even when all system notifications have been suppressed, developers <b>can</b> still intercept certain events that allow them to properly react to the underlying reason of system notifications.

        <h5>Permissions</h5>
        Android applications <b>must</b> have the com.magicleap.permission.SYSTEM_NOTIFICATION permission listed in their manifest to use this extension. (protection level: normal)
        """

    IntConstant(
        "The extension specification version.",

        "ML_system_notifications_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ML_SYSTEM_NOTIFICATIONS_EXTENSION_NAME".."XR_ML_system_notifications"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_NOTIFICATIONS_SET_INFO_ML".."1000473000"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML".."-1000473000",
        "ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML".."-1000473001"
    )

    XrResult(
        "SetSystemNotificationsML",
        """
        Set system notification suppression state.

        <h5>C Specification</h5>
        The #SetSystemNotificationsML() function is defined as:

        <pre><code>
￿XrResult xrSetSystemNotificationsML(
￿    XrInstance                                  instance,
￿    const XrSystemNotificationsSetInfoML*       info);</code></pre>

        <h5>Description</h5>
        This API will work only on certain SKUs. When called on an incompatible SKU the #ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML error <b>must</b> be returned.

        If the com.magicleap.permission.SYSTEM_NOTIFICATION permission is not granted, the runtime <b>must</b> return #ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLSystemNotifications XR_ML_system_notifications} extension <b>must</b> be enabled prior to calling #SetSystemNotificationsML()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrSystemNotificationsSetInfoML structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML</li>
                <li>#ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSystemNotificationsSetInfoML
        """,

        XrInstance("instance", "{@code XrInstance}."),
        XrSystemNotificationsSetInfoML.const.p("info", "a pointer to an ##XrSystemNotificationsSetInfoML structure.")
    )
}