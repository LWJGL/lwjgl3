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
    public static final int XR_EXT_performance_settings_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_EXT_PERFORMANCE_SETTINGS_EXTENSION_NAME = "XR_EXT_performance_settings";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_EVENT_DATA_PERF_SETTINGS_EXT = 1000015000;

    /**
     * XrPerfSettingsDomainEXT
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
     * XrPerfSettingsSubDomainEXT
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
     * XrPerfSettingsLevelEXT
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
     * XrPerfSettingsNotificationLevelEXT
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

    @NativeType("XrResult")
    public static int xrPerfSettingsSetPerformanceLevelEXT(XrSession session, @NativeType("XrPerfSettingsDomainEXT") int domain, @NativeType("XrPerfSettingsLevelEXT") int level) {
        long __functionAddress = session.getCapabilities().xrPerfSettingsSetPerformanceLevelEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), domain, level, __functionAddress);
    }

}