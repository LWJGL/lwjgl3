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

import org.lwjgl.system.windows.*;

public class KHRWin32ConvertPerformanceCounterTime {

    public static final int XR_KHR_win32_convert_performance_counter_time_SPEC_VERSION = 1;

    public static final String XR_KHR_WIN32_CONVERT_PERFORMANCE_COUNTER_TIME_EXTENSION_NAME = "XR_KHR_win32_convert_performance_counter_time";

    protected KHRWin32ConvertPerformanceCounterTime() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrConvertWin32PerformanceCounterToTimeKHR ] ---

    /** {@code XrResult xrConvertWin32PerformanceCounterToTimeKHR(XrInstance instance, LARGE_INTEGER const * performanceCounter, XrTime * time)} */
    public static int nxrConvertWin32PerformanceCounterToTimeKHR(XrInstance instance, long performanceCounter, long time) {
        long __functionAddress = instance.getCapabilities().xrConvertWin32PerformanceCounterToTimeKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(instance.address(), performanceCounter, time, __functionAddress);
    }

    /** {@code XrResult xrConvertWin32PerformanceCounterToTimeKHR(XrInstance instance, LARGE_INTEGER const * performanceCounter, XrTime * time)} */
    @NativeType("XrResult")
    public static int xrConvertWin32PerformanceCounterToTimeKHR(XrInstance instance, @NativeType("LARGE_INTEGER const *") LARGE_INTEGER performanceCounter, @NativeType("XrTime *") LongBuffer time) {
        if (CHECKS) {
            check(time, 1);
        }
        return nxrConvertWin32PerformanceCounterToTimeKHR(instance, performanceCounter.address(), memAddress(time));
    }

    // --- [ xrConvertTimeToWin32PerformanceCounterKHR ] ---

    /** {@code XrResult xrConvertTimeToWin32PerformanceCounterKHR(XrInstance instance, XrTime time, LARGE_INTEGER * performanceCounter)} */
    public static int nxrConvertTimeToWin32PerformanceCounterKHR(XrInstance instance, long time, long performanceCounter) {
        long __functionAddress = instance.getCapabilities().xrConvertTimeToWin32PerformanceCounterKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(instance.address(), time, performanceCounter, __functionAddress);
    }

    /** {@code XrResult xrConvertTimeToWin32PerformanceCounterKHR(XrInstance instance, XrTime time, LARGE_INTEGER * performanceCounter)} */
    @NativeType("XrResult")
    public static int xrConvertTimeToWin32PerformanceCounterKHR(XrInstance instance, @NativeType("XrTime") long time, @NativeType("LARGE_INTEGER *") LARGE_INTEGER performanceCounter) {
        return nxrConvertTimeToWin32PerformanceCounterKHR(instance, time, performanceCounter.address());
    }

}