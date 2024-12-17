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

public class KHRConvertTimespecTime {

    public static final int XR_KHR_convert_timespec_time_SPEC_VERSION = 1;

    public static final String XR_KHR_CONVERT_TIMESPEC_TIME_EXTENSION_NAME = "XR_KHR_convert_timespec_time";

    protected KHRConvertTimespecTime() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrConvertTimespecTimeToTimeKHR ] ---

    /** {@code XrResult xrConvertTimespecTimeToTimeKHR(XrInstance instance, struct timespec const * timespecTime, XrTime * time)} */
    public static int nxrConvertTimespecTimeToTimeKHR(XrInstance instance, long timespecTime, long time) {
        long __functionAddress = instance.getCapabilities().xrConvertTimespecTimeToTimeKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(timespecTime);
        }
        return callPPPI(instance.address(), timespecTime, time, __functionAddress);
    }

    /** {@code XrResult xrConvertTimespecTimeToTimeKHR(XrInstance instance, struct timespec const * timespecTime, XrTime * time)} */
    @NativeType("XrResult")
    public static int xrConvertTimespecTimeToTimeKHR(XrInstance instance, @NativeType("struct timespec const *") long timespecTime, @NativeType("XrTime *") LongBuffer time) {
        if (CHECKS) {
            check(time, 1);
        }
        return nxrConvertTimespecTimeToTimeKHR(instance, timespecTime, memAddress(time));
    }

    // --- [ xrConvertTimeToTimespecTimeKHR ] ---

    /** {@code XrResult xrConvertTimeToTimespecTimeKHR(XrInstance instance, XrTime time, struct timespec * timespecTime)} */
    @NativeType("XrResult")
    public static int xrConvertTimeToTimespecTimeKHR(XrInstance instance, @NativeType("XrTime") long time, @NativeType("struct timespec *") long timespecTime) {
        long __functionAddress = instance.getCapabilities().xrConvertTimeToTimespecTimeKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(timespecTime);
        }
        return callPJPI(instance.address(), time, timespecTime, __functionAddress);
    }

}