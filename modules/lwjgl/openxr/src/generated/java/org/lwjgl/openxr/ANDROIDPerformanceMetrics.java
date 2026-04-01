/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ANDROIDPerformanceMetrics {

    public static final int XR_ANDROID_performance_metrics_SPEC_VERSION = 1;

    public static final String XR_ANDROID_PERFORMANCE_METRICS_EXTENSION_NAME = "XR_ANDROID_performance_metrics";

    public static final int
        XR_TYPE_PERFORMANCE_METRICS_STATE_ANDROID   = 1000465000,
        XR_TYPE_PERFORMANCE_METRICS_COUNTER_ANDROID = 1000465001;

    public static final int
        XR_PERFORMANCE_METRICS_COUNTER_UNIT_GENERIC_ANDROID      = 0,
        XR_PERFORMANCE_METRICS_COUNTER_UNIT_PERCENTAGE_ANDROID   = 1,
        XR_PERFORMANCE_METRICS_COUNTER_UNIT_MILLISECONDS_ANDROID = 2,
        XR_PERFORMANCE_METRICS_COUNTER_UNIT_BYTES_ANDROID        = 3,
        XR_PERFORMANCE_METRICS_COUNTER_UNIT_HERTZ_ANDROID        = 4;

    public static final int
        XR_PERFORMANCE_METRICS_COUNTER_ANY_VALUE_VALID_BIT_ANDROID   = 0x1,
        XR_PERFORMANCE_METRICS_COUNTER_UINT_VALUE_VALID_BIT_ANDROID  = 0x2,
        XR_PERFORMANCE_METRICS_COUNTER_FLOAT_VALUE_VALID_BIT_ANDROID = 0x4;

    protected ANDROIDPerformanceMetrics() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumeratePerformanceMetricsCounterPathsANDROID ] ---

    /** {@code XrResult xrEnumeratePerformanceMetricsCounterPathsANDROID(XrInstance instance, uint32_t counterPathCapacityInput, uint32_t * counterPathCountOutput, XrPath * counterPaths)} */
    public static int nxrEnumeratePerformanceMetricsCounterPathsANDROID(XrInstance instance, int counterPathCapacityInput, long counterPathCountOutput, long counterPaths) {
        long __functionAddress = instance.getCapabilities().xrEnumeratePerformanceMetricsCounterPathsANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(instance.address(), counterPathCapacityInput, counterPathCountOutput, counterPaths, __functionAddress);
    }

    /** {@code XrResult xrEnumeratePerformanceMetricsCounterPathsANDROID(XrInstance instance, uint32_t counterPathCapacityInput, uint32_t * counterPathCountOutput, XrPath * counterPaths)} */
    @NativeType("XrResult")
    public static int xrEnumeratePerformanceMetricsCounterPathsANDROID(XrInstance instance, @NativeType("uint32_t *") IntBuffer counterPathCountOutput, @NativeType("XrPath *") @Nullable LongBuffer counterPaths) {
        if (CHECKS) {
            check(counterPathCountOutput, 1);
        }
        return nxrEnumeratePerformanceMetricsCounterPathsANDROID(instance, remainingSafe(counterPaths), memAddress(counterPathCountOutput), memAddressSafe(counterPaths));
    }

    // --- [ xrSetPerformanceMetricsStateANDROID ] ---

    /** {@code XrResult xrSetPerformanceMetricsStateANDROID(XrSession session, XrPerformanceMetricsStateANDROID const * state)} */
    public static int nxrSetPerformanceMetricsStateANDROID(XrSession session, long state) {
        long __functionAddress = session.getCapabilities().xrSetPerformanceMetricsStateANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), state, __functionAddress);
    }

    /** {@code XrResult xrSetPerformanceMetricsStateANDROID(XrSession session, XrPerformanceMetricsStateANDROID const * state)} */
    @NativeType("XrResult")
    public static int xrSetPerformanceMetricsStateANDROID(XrSession session, @NativeType("XrPerformanceMetricsStateANDROID const *") XrPerformanceMetricsStateANDROID state) {
        return nxrSetPerformanceMetricsStateANDROID(session, state.address());
    }

    // --- [ xrGetPerformanceMetricsStateANDROID ] ---

    /** {@code XrResult xrGetPerformanceMetricsStateANDROID(XrSession session, XrPerformanceMetricsStateANDROID * state)} */
    public static int nxrGetPerformanceMetricsStateANDROID(XrSession session, long state) {
        long __functionAddress = session.getCapabilities().xrGetPerformanceMetricsStateANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), state, __functionAddress);
    }

    /** {@code XrResult xrGetPerformanceMetricsStateANDROID(XrSession session, XrPerformanceMetricsStateANDROID * state)} */
    @NativeType("XrResult")
    public static int xrGetPerformanceMetricsStateANDROID(XrSession session, @NativeType("XrPerformanceMetricsStateANDROID *") XrPerformanceMetricsStateANDROID state) {
        return nxrGetPerformanceMetricsStateANDROID(session, state.address());
    }

    // --- [ xrQueryPerformanceMetricsCounterANDROID ] ---

    /** {@code XrResult xrQueryPerformanceMetricsCounterANDROID(XrSession session, XrPath counterPath, XrPerformanceMetricsCounterANDROID * counter)} */
    public static int nxrQueryPerformanceMetricsCounterANDROID(XrSession session, long counterPath, long counter) {
        long __functionAddress = session.getCapabilities().xrQueryPerformanceMetricsCounterANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), counterPath, counter, __functionAddress);
    }

    /** {@code XrResult xrQueryPerformanceMetricsCounterANDROID(XrSession session, XrPath counterPath, XrPerformanceMetricsCounterANDROID * counter)} */
    @NativeType("XrResult")
    public static int xrQueryPerformanceMetricsCounterANDROID(XrSession session, @NativeType("XrPath") long counterPath, @NativeType("XrPerformanceMetricsCounterANDROID *") XrPerformanceMetricsCounterANDROID counter) {
        return nxrQueryPerformanceMetricsCounterANDROID(session, counterPath, counter.address());
    }

}