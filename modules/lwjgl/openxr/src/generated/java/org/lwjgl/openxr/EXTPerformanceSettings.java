/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTPerformanceSettings {

    public static final int XR_EXT_performance_settings_SPEC_VERSION = 4;

    public static final String XR_EXT_PERFORMANCE_SETTINGS_EXTENSION_NAME = "XR_EXT_performance_settings";

    public static final int XR_TYPE_EVENT_DATA_PERF_SETTINGS_EXT = 1000015000;

    public static final int
        XR_PERF_SETTINGS_DOMAIN_CPU_EXT = 1,
        XR_PERF_SETTINGS_DOMAIN_GPU_EXT = 2;

    public static final int
        XR_PERF_SETTINGS_SUB_DOMAIN_COMPOSITING_EXT = 1,
        XR_PERF_SETTINGS_SUB_DOMAIN_RENDERING_EXT   = 2,
        XR_PERF_SETTINGS_SUB_DOMAIN_THERMAL_EXT     = 3;

    public static final int
        XR_PERF_SETTINGS_LEVEL_POWER_SAVINGS_EXT  = 0,
        XR_PERF_SETTINGS_LEVEL_SUSTAINED_LOW_EXT  = 25,
        XR_PERF_SETTINGS_LEVEL_SUSTAINED_HIGH_EXT = 50,
        XR_PERF_SETTINGS_LEVEL_BOOST_EXT          = 75;

    public static final int
        XR_PERF_SETTINGS_NOTIF_LEVEL_NORMAL_EXT   = 0,
        XR_PERF_SETTINGS_NOTIF_LEVEL_WARNING_EXT  = 25,
        XR_PERF_SETTINGS_NOTIF_LEVEL_IMPAIRED_EXT = 75;

    protected EXTPerformanceSettings() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrPerfSettingsSetPerformanceLevelEXT ] ---

    /** {@code XrResult xrPerfSettingsSetPerformanceLevelEXT(XrSession session, XrPerfSettingsDomainEXT domain, XrPerfSettingsLevelEXT level)} */
    @NativeType("XrResult")
    public static int xrPerfSettingsSetPerformanceLevelEXT(XrSession session, @NativeType("XrPerfSettingsDomainEXT") int domain, @NativeType("XrPerfSettingsLevelEXT") int level) {
        long __functionAddress = session.getCapabilities().xrPerfSettingsSetPerformanceLevelEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), domain, level, __functionAddress);
    }

}