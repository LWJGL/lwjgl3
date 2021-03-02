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

    public static int nxrConvertWin32PerformanceCounterToTimeKHR(XrInstance instance, long time) {
        long __functionAddress = NULL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(instance.address(), time, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrConvertWin32PerformanceCounterToTimeKHR(XrInstance instance, @NativeType("XrTime *") LongBuffer time) {
        if (CHECKS) {
            check(time, 1);
        }
        return nxrConvertWin32PerformanceCounterToTimeKHR(instance, memAddress(time));
    }

    /** Array version of: {@link #xrConvertWin32PerformanceCounterToTimeKHR ConvertWin32PerformanceCounterToTimeKHR} */
    @NativeType("XrResult")
    public static int xrConvertWin32PerformanceCounterToTimeKHR(XrInstance instance, @NativeType("XrTime *") long[] time) {
        long __functionAddress = NULL;
        if (CHECKS) {
            check(__functionAddress);
            check(time, 1);
        }
        return callPPI(instance.address(), time, __functionAddress);
    }

}