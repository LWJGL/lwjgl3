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

/** The KHR_win32_convert_performance_counter_time extension. */
public class KHRWin32ConvertPerformanceCounterTime {

    /** The extension specification version. */
    public static final int XR_KHR_win32_convert_performance_counter_time_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_KHR_WIN32_CONVERT_PERFORMANCE_COUNTER_TIME_EXTENSION_NAME = "XR_KHR_win32_convert_performance_counter_time";

    protected KHRWin32ConvertPerformanceCounterTime() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrConvertWin32PerformanceCounterToTimeKHR ] ---

    public static int nxrConvertWin32PerformanceCounterToTimeKHR(XrInstance instance, long performanceCounter, long time) {
        long __functionAddress = instance.getCapabilities().xrConvertWin32PerformanceCounterToTimeKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(instance.address(), performanceCounter, time, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrConvertWin32PerformanceCounterToTimeKHR(XrInstance instance, @NativeType("LARGE_INTEGER const *") LongBuffer performanceCounter, @NativeType("XrTime *") LongBuffer time) {
        if (CHECKS) {
            check(performanceCounter, 1);
            check(time, 1);
        }
        return nxrConvertWin32PerformanceCounterToTimeKHR(instance, memAddress(performanceCounter), memAddress(time));
    }

    // --- [ xrConvertTimeToWin32PerformanceCounterKHR ] ---

    public static int nxrConvertTimeToWin32PerformanceCounterKHR(XrInstance instance, long time, long performanceCounter) {
        long __functionAddress = instance.getCapabilities().xrConvertTimeToWin32PerformanceCounterKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(instance.address(), time, performanceCounter, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrConvertTimeToWin32PerformanceCounterKHR(XrInstance instance, @NativeType("XrTime") long time, @NativeType("LARGE_INTEGER *") LongBuffer performanceCounter) {
        if (CHECKS) {
            check(performanceCounter, 1);
        }
        return nxrConvertTimeToWin32PerformanceCounterKHR(instance, time, memAddress(performanceCounter));
    }

    /** Array version of: {@link #xrConvertWin32PerformanceCounterToTimeKHR ConvertWin32PerformanceCounterToTimeKHR} */
    @NativeType("XrResult")
    public static int xrConvertWin32PerformanceCounterToTimeKHR(XrInstance instance, @NativeType("LARGE_INTEGER const *") long[] performanceCounter, @NativeType("XrTime *") long[] time) {
        long __functionAddress = instance.getCapabilities().xrConvertWin32PerformanceCounterToTimeKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(performanceCounter, 1);
            check(time, 1);
        }
        return callPPPI(instance.address(), performanceCounter, time, __functionAddress);
    }

    /** Array version of: {@link #xrConvertTimeToWin32PerformanceCounterKHR ConvertTimeToWin32PerformanceCounterKHR} */
    @NativeType("XrResult")
    public static int xrConvertTimeToWin32PerformanceCounterKHR(XrInstance instance, @NativeType("XrTime") long time, @NativeType("LARGE_INTEGER *") long[] performanceCounter) {
        long __functionAddress = instance.getCapabilities().xrConvertTimeToWin32PerformanceCounterKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(performanceCounter, 1);
        }
        return callPJPI(instance.address(), time, performanceCounter, __functionAddress);
    }

}