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

    /** Unsafe version of: {@link #xrConvertWin32PerformanceCounterToTimeKHR ConvertWin32PerformanceCounterToTimeKHR} */
    public static int nxrConvertWin32PerformanceCounterToTimeKHR(XrInstance instance, long performanceCounter, long time) {
        long __functionAddress = instance.getCapabilities().xrConvertWin32PerformanceCounterToTimeKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(instance.address(), performanceCounter, time, __functionAddress);
    }

    /**
     * Convert Win32 {@code QueryPerformanceCounter} time to XrTime.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To convert from a Windows performance counter time stamp to {@code XrTime}, call:</p>
     * 
     * <pre><code>
     * XrResult xrConvertWin32PerformanceCounterToTimeKHR(
     *     XrInstance                                  instance,
     *     const LARGE_INTEGER*                        performanceCounter,
     *     XrTime*                                     time);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrConvertWin32PerformanceCounterToTimeKHR ConvertWin32PerformanceCounterToTimeKHR} function converts a time stamp obtained by the {@code QueryPerformanceCounter} Windows function to the equivalent {@code XrTime}.</p>
     * 
     * <p>If the output {@code time} cannot represent the input {@code performanceCounter}, the runtime <b>must</b> return {@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link KHRWin32ConvertPerformanceCounterTime XR_KHR_win32_convert_performance_counter_time} extension <b>must</b> be enabled prior to calling {@link #xrConvertWin32PerformanceCounterToTimeKHR ConvertWin32PerformanceCounterToTimeKHR}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code performanceCounter} <b>must</b> be a pointer to a valid {@code LARGE_INTEGER} value</li>
     * <li>{@code time} <b>must</b> be a pointer to an {@code XrTime} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * </ul></dd>
     * </dl>
     *
     * @param instance           an {@code XrInstance} handle previously created with {@link XR10#xrCreateInstance CreateInstance}.
     * @param performanceCounter a time returned by {@code QueryPerformanceCounter}.
     * @param time               the resulting {@code XrTime} that is equivalent to the {@code performanceCounter}.
     */
    @NativeType("XrResult")
    public static int xrConvertWin32PerformanceCounterToTimeKHR(XrInstance instance, @NativeType("LARGE_INTEGER const *") LARGE_INTEGER performanceCounter, @NativeType("XrTime *") LongBuffer time) {
        if (CHECKS) {
            check(time, 1);
        }
        return nxrConvertWin32PerformanceCounterToTimeKHR(instance, performanceCounter.address(), memAddress(time));
    }

    // --- [ xrConvertTimeToWin32PerformanceCounterKHR ] ---

    /** Unsafe version of: {@link #xrConvertTimeToWin32PerformanceCounterKHR ConvertTimeToWin32PerformanceCounterKHR} */
    public static int nxrConvertTimeToWin32PerformanceCounterKHR(XrInstance instance, long time, long performanceCounter) {
        long __functionAddress = instance.getCapabilities().xrConvertTimeToWin32PerformanceCounterKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(instance.address(), time, performanceCounter, __functionAddress);
    }

    /**
     * Convert XrTime to Win32 {@code QueryPerformanceCounter} time.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To convert from {@code XrTime} to a Windows performance counter time stamp, call:</p>
     * 
     * <pre><code>
     * XrResult xrConvertTimeToWin32PerformanceCounterKHR(
     *     XrInstance                                  instance,
     *     XrTime                                      time,
     *     LARGE_INTEGER*                              performanceCounter);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrConvertTimeToWin32PerformanceCounterKHR ConvertTimeToWin32PerformanceCounterKHR} function converts an {@code XrTime} to time as if generated by the {@code QueryPerformanceCounter} Windows function.</p>
     * 
     * <p>If the output {@code performanceCounter} cannot represent the input {@code time}, the runtime <b>must</b> return {@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link KHRWin32ConvertPerformanceCounterTime XR_KHR_win32_convert_performance_counter_time} extension <b>must</b> be enabled prior to calling {@link #xrConvertTimeToWin32PerformanceCounterKHR ConvertTimeToWin32PerformanceCounterKHR}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code performanceCounter} <b>must</b> be a pointer to a {@code LARGE_INTEGER} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * </ul></dd>
     * </dl>
     *
     * @param instance           an {@code XrInstance} handle previously created with {@link XR10#xrCreateInstance CreateInstance}.
     * @param time               an {@code XrTime}.
     * @param performanceCounter the resulting Windows performance counter time stamp that is equivalent to the {@code time}.
     */
    @NativeType("XrResult")
    public static int xrConvertTimeToWin32PerformanceCounterKHR(XrInstance instance, @NativeType("XrTime") long time, @NativeType("LARGE_INTEGER *") LARGE_INTEGER performanceCounter) {
        return nxrConvertTimeToWin32PerformanceCounterKHR(instance, time, performanceCounter.address());
    }

}