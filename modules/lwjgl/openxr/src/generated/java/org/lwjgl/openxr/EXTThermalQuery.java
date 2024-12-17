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

public class EXTThermalQuery {

    public static final int XR_EXT_thermal_query_SPEC_VERSION = 2;

    public static final String XR_EXT_THERMAL_QUERY_EXTENSION_NAME = "XR_EXT_thermal_query";

    protected EXTThermalQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrThermalGetTemperatureTrendEXT ] ---

    /** {@code XrResult xrThermalGetTemperatureTrendEXT(XrSession session, XrPerfSettingsDomainEXT domain, XrPerfSettingsNotificationLevelEXT * notificationLevel, float * tempHeadroom, float * tempSlope)} */
    public static int nxrThermalGetTemperatureTrendEXT(XrSession session, int domain, long notificationLevel, long tempHeadroom, long tempSlope) {
        long __functionAddress = session.getCapabilities().xrThermalGetTemperatureTrendEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(session.address(), domain, notificationLevel, tempHeadroom, tempSlope, __functionAddress);
    }

    /** {@code XrResult xrThermalGetTemperatureTrendEXT(XrSession session, XrPerfSettingsDomainEXT domain, XrPerfSettingsNotificationLevelEXT * notificationLevel, float * tempHeadroom, float * tempSlope)} */
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