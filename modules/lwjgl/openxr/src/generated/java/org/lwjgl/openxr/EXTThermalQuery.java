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
    public static final int XR_EXT_thermal_query_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_EXT_THERMAL_QUERY_EXTENSION_NAME = "XR_EXT_thermal_query";

    protected EXTThermalQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrThermalGetTemperatureTrendEXT ] ---

    public static int nxrThermalGetTemperatureTrendEXT(XrSession session, int domain, long notificationLevel, long tempHeadroom, long tempSlope) {
        long __functionAddress = session.getCapabilities().xrThermalGetTemperatureTrendEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(session.address(), domain, notificationLevel, tempHeadroom, tempSlope, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrThermalGetTemperatureTrendEXT(XrSession session, @NativeType("XrPerfSettingsDomainEXT") int domain, @NativeType("XrPerfSettingsNotificationLevelEXT *") IntBuffer notificationLevel, @NativeType("float *") FloatBuffer tempHeadroom, @NativeType("float *") FloatBuffer tempSlope) {
        if (CHECKS) {
            check(notificationLevel, 1);
            check(tempHeadroom, 1);
            check(tempSlope, 1);
        }
        return nxrThermalGetTemperatureTrendEXT(session, domain, memAddress(notificationLevel), memAddress(tempHeadroom), memAddress(tempSlope));
    }

    /** Array version of: {@link #xrThermalGetTemperatureTrendEXT ThermalGetTemperatureTrendEXT} */
    @NativeType("XrResult")
    public static int xrThermalGetTemperatureTrendEXT(XrSession session, @NativeType("XrPerfSettingsDomainEXT") int domain, @NativeType("XrPerfSettingsNotificationLevelEXT *") int[] notificationLevel, @NativeType("float *") float[] tempHeadroom, @NativeType("float *") float[] tempSlope) {
        long __functionAddress = session.getCapabilities().xrThermalGetTemperatureTrendEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(notificationLevel, 1);
            check(tempHeadroom, 1);
            check(tempSlope, 1);
        }
        return callPPPPI(session.address(), domain, notificationLevel, tempHeadroom, tempSlope, __functionAddress);
    }

}