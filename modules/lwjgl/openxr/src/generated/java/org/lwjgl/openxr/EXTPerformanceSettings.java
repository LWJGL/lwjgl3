/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The EXT_performance_settings extension. */
public class EXTPerformanceSettings {

    /** The extension specification version. */
    public static final int XR_EXT_performance_settings_SPEC_VERSION = 3;

    /** The extension name. */
    public static final String XR_EXT_PERFORMANCE_SETTINGS_EXTENSION_NAME = "XR_EXT_performance_settings";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_EVENT_DATA_PERF_SETTINGS_EXT = 1000015000;

    /**
     * XrPerfSettingsDomainEXT - XrPerfSettingsDomainEXT
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEventDataPerfSettingsEXT}, {@link #xrPerfSettingsSetPerformanceLevelEXT PerfSettingsSetPerformanceLevelEXT}, {@link EXTThermalQuery#xrThermalGetTemperatureTrendEXT ThermalGetTemperatureTrendEXT}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_PERF_SETTINGS_DOMAIN_CPU_EXT PERF_SETTINGS_DOMAIN_CPU_EXT}</li>
     * <li>{@link #XR_PERF_SETTINGS_DOMAIN_GPU_EXT PERF_SETTINGS_DOMAIN_GPU_EXT}</li>
     * </ul>
     */
    public static final int
        XR_PERF_SETTINGS_DOMAIN_CPU_EXT = 1,
        XR_PERF_SETTINGS_DOMAIN_GPU_EXT = 2;

    /**
     * XrPerfSettingsSubDomainEXT - XrPerfSettingsSubDomainEXT
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEventDataPerfSettingsEXT}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_PERF_SETTINGS_SUB_DOMAIN_COMPOSITING_EXT PERF_SETTINGS_SUB_DOMAIN_COMPOSITING_EXT}</li>
     * <li>{@link #XR_PERF_SETTINGS_SUB_DOMAIN_RENDERING_EXT PERF_SETTINGS_SUB_DOMAIN_RENDERING_EXT}</li>
     * <li>{@link #XR_PERF_SETTINGS_SUB_DOMAIN_THERMAL_EXT PERF_SETTINGS_SUB_DOMAIN_THERMAL_EXT}</li>
     * </ul>
     */
    public static final int
        XR_PERF_SETTINGS_SUB_DOMAIN_COMPOSITING_EXT = 1,
        XR_PERF_SETTINGS_SUB_DOMAIN_RENDERING_EXT   = 2,
        XR_PERF_SETTINGS_SUB_DOMAIN_THERMAL_EXT     = 3;

    /**
     * XrPerfSettingsLevelEXT - XrPerfSettingsLevelEXT
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrPerfSettingsSetPerformanceLevelEXT PerfSettingsSetPerformanceLevelEXT}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_PERF_SETTINGS_LEVEL_POWER_SAVINGS_EXT PERF_SETTINGS_LEVEL_POWER_SAVINGS_EXT}</li>
     * <li>{@link #XR_PERF_SETTINGS_LEVEL_SUSTAINED_LOW_EXT PERF_SETTINGS_LEVEL_SUSTAINED_LOW_EXT}</li>
     * <li>{@link #XR_PERF_SETTINGS_LEVEL_SUSTAINED_HIGH_EXT PERF_SETTINGS_LEVEL_SUSTAINED_HIGH_EXT}</li>
     * <li>{@link #XR_PERF_SETTINGS_LEVEL_BOOST_EXT PERF_SETTINGS_LEVEL_BOOST_EXT}</li>
     * </ul>
     */
    public static final int
        XR_PERF_SETTINGS_LEVEL_POWER_SAVINGS_EXT  = 0,
        XR_PERF_SETTINGS_LEVEL_SUSTAINED_LOW_EXT  = 25,
        XR_PERF_SETTINGS_LEVEL_SUSTAINED_HIGH_EXT = 50,
        XR_PERF_SETTINGS_LEVEL_BOOST_EXT          = 75;

    /**
     * XrPerfSettingsNotificationLevelEXT - XrPerfSettingsNotificationLevelEXT
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEventDataPerfSettingsEXT}, {@link EXTThermalQuery#xrThermalGetTemperatureTrendEXT ThermalGetTemperatureTrendEXT}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_PERF_SETTINGS_NOTIF_LEVEL_NORMAL_EXT PERF_SETTINGS_NOTIF_LEVEL_NORMAL_EXT}</li>
     * <li>{@link #XR_PERF_SETTINGS_NOTIF_LEVEL_WARNING_EXT PERF_SETTINGS_NOTIF_LEVEL_WARNING_EXT}</li>
     * <li>{@link #XR_PERF_SETTINGS_NOTIF_LEVEL_IMPAIRED_EXT PERF_SETTINGS_NOTIF_LEVEL_IMPAIRED_EXT}</li>
     * </ul>
     */
    public static final int
        XR_PERF_SETTINGS_NOTIF_LEVEL_NORMAL_EXT   = 0,
        XR_PERF_SETTINGS_NOTIF_LEVEL_WARNING_EXT  = 25,
        XR_PERF_SETTINGS_NOTIF_LEVEL_IMPAIRED_EXT = 75;

    protected EXTPerformanceSettings() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrPerfSettingsSetPerformanceLevelEXT ] ---

    /**
     * xrPerfSettingsSetPerformanceLevelEXT.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrPerfSettingsSetPerformanceLevelEXT(
     *     XrSession                                   session,
     *     XrPerfSettingsDomainEXT                     domain,
     *     XrPerfSettingsLevelEXT                      level);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTPerformanceSettings XR_EXT_performance_settings} extension <b>must</b> be enabled prior to calling {@link #xrPerfSettingsSetPerformanceLevelEXT PerfSettingsSetPerformanceLevelEXT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code domain} <b>must</b> be a valid {@code XrPerfSettingsDomainEXT} value</li>
     * <li>{@code level} <b>must</b> be a valid {@code XrPerfSettingsLevelEXT} value</li>
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
     * @param session a valid {@code XrSession} handle.
     * @param domain  the processing domain for which the level hint is applied
     * @param level   the level hint to be applied
     */
    @NativeType("XrResult")
    public static int xrPerfSettingsSetPerformanceLevelEXT(XrSession session, @NativeType("XrPerfSettingsDomainEXT") int domain, @NativeType("XrPerfSettingsLevelEXT") int level) {
        long __functionAddress = session.getCapabilities().xrPerfSettingsSetPerformanceLevelEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), domain, level, __functionAddress);
    }

}