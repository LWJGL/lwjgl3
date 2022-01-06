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

/** The EXT_thermal_query extension. */
public class EXTThermalQuery {

    /** The extension specification version. */
    public static final int XR_EXT_thermal_query_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_EXT_THERMAL_QUERY_EXTENSION_NAME = "XR_EXT_thermal_query";

    protected EXTThermalQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrThermalGetTemperatureTrendEXT ] ---

    /** Unsafe version of: {@link #xrThermalGetTemperatureTrendEXT ThermalGetTemperatureTrendEXT} */
    public static int nxrThermalGetTemperatureTrendEXT(XrSession session, int domain, long notificationLevel, long tempHeadroom, long tempSlope) {
        long __functionAddress = session.getCapabilities().xrThermalGetTemperatureTrendEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(session.address(), domain, notificationLevel, tempHeadroom, tempSlope, __functionAddress);
    }

    /**
     * xrThermalGetTemperatureTrendEXT.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrThermalGetTemperatureTrendEXT(
     *     XrSession                                   session,
     *     XrPerfSettingsDomainEXT                     domain,
     *     XrPerfSettingsNotificationLevelEXT*         notificationLevel,
     *     float*                                      tempHeadroom,
     *     float*                                      tempSlope);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTThermalQuery XR_EXT_thermal_query} extension <b>must</b> be enabled prior to calling {@link #xrThermalGetTemperatureTrendEXT ThermalGetTemperatureTrendEXT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code domain} <b>must</b> be a valid {@code XrPerfSettingsDomainEXT} value</li>
     * <li>{@code notificationLevel} <b>must</b> be a pointer to an {@code XrPerfSettingsNotificationLevelEXT} value</li>
     * <li>{@code tempHeadroom} <b>must</b> be a pointer to a {@code float} value</li>
     * <li>{@code tempSlope} <b>must</b> be a pointer to a {@code float} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * </ul></dd>
     * </dl>
     *
     * @param session           a valid {@code XrSession} handle.
     * @param domain            : the processing domain
     * @param notificationLevel : the current warning level
     * @param tempHeadroom      : temperature headroom in degrees Celsius, expressing how far the most-critical temperature of the domain is from its thermal throttling threshold temperature.
     * @param tempSlope         : the current trend in degrees Celsius per second of the most critical temperature of the domain.
     */
    @NativeType("XrResult")
    public static int xrThermalGetTemperatureTrendEXT(XrSession session, @NativeType("XrPerfSettingsDomainEXT") int domain, @NativeType("XrPerfSettingsNotificationLevelEXT *") IntBuffer notificationLevel, @NativeType("float *") FloatBuffer tempHeadroom, @NativeType("float *") FloatBuffer tempSlope) {
        if (CHECKS) {
            check(notificationLevel, 1);
            check(tempHeadroom, 1);
            check(tempSlope, 1);
        }
        return nxrThermalGetTemperatureTrendEXT(session, domain, memAddress(notificationLevel), memAddress(tempHeadroom), memAddress(tempSlope));
    }

}