/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_ML_system_notifications">XR_ML_system_notifications</a> extension.
 * 
 * <p>This extension provides control over the system notifications. This extension allows system notifications that might obscure the field of view to be disabled.</p>
 * 
 * <p>Note that even when all system notifications have been suppressed, developers <b>can</b> still intercept certain events that allow them to properly react to the underlying reason of system notifications.</p>
 * 
 * <h5>Permissions</h5>
 * 
 * <p>Android applications <b>must</b> have the com.magicleap.permission.SYSTEM_NOTIFICATION permission listed in their manifest to use this extension. (protection level: normal)</p>
 */
public class MLSystemNotifications {

    /** The extension specification version. */
    public static final int XR_ML_system_notifications_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_ML_SYSTEM_NOTIFICATIONS_EXTENSION_NAME = "XR_ML_system_notifications";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_SYSTEM_NOTIFICATIONS_SET_INFO_ML = 1000473000;

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML}</li>
     * <li>{@link #XR_ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML = -1000473000,
        XR_ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML  = -1000473001;

    protected MLSystemNotifications() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetSystemNotificationsML ] ---

    /** Unsafe version of: {@link #xrSetSystemNotificationsML SetSystemNotificationsML} */
    public static int nxrSetSystemNotificationsML(XrInstance instance, long info) {
        long __functionAddress = instance.getCapabilities().xrSetSystemNotificationsML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(instance.address(), info, __functionAddress);
    }

    /**
     * Set system notification suppression state.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSetSystemNotificationsML SetSystemNotificationsML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSetSystemNotificationsML(
     *     XrInstance                                  instance,
     *     const XrSystemNotificationsSetInfoML*       info);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This API will work only on certain SKUs. When called on an incompatible SKU the {@link #XR_ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML} error <b>must</b> be returned.</p>
     * 
     * <p>If the com.magicleap.permission.SYSTEM_NOTIFICATION permission is not granted, the runtime <b>must</b> return {@link #XR_ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLSystemNotifications XR_ML_system_notifications} extension <b>must</b> be enabled prior to calling {@link #xrSetSystemNotificationsML SetSystemNotificationsML}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrSystemNotificationsSetInfoML} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML}</li>
     * <li>{@link #XR_ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSystemNotificationsSetInfoML}</p>
     *
     * @param instance {@code XrInstance}.
     * @param info     a pointer to an {@link XrSystemNotificationsSetInfoML} structure.
     */
    @NativeType("XrResult")
    public static int xrSetSystemNotificationsML(XrInstance instance, @NativeType("XrSystemNotificationsSetInfoML const *") XrSystemNotificationsSetInfoML info) {
        return nxrSetSystemNotificationsML(instance, info.address());
    }

}