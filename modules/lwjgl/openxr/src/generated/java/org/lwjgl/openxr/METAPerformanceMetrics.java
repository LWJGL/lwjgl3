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

public class METAPerformanceMetrics {

    public static final int XR_META_performance_metrics_SPEC_VERSION = 2;

    public static final String XR_META_PERFORMANCE_METRICS_EXTENSION_NAME = "XR_META_performance_metrics";

    public static final int
        XR_TYPE_PERFORMANCE_METRICS_STATE_META   = 1000232001,
        XR_TYPE_PERFORMANCE_METRICS_COUNTER_META = 1000232002;

    public static final int
        XR_PERFORMANCE_METRICS_COUNTER_ANY_VALUE_VALID_BIT_META   = 0x1,
        XR_PERFORMANCE_METRICS_COUNTER_UINT_VALUE_VALID_BIT_META  = 0x2,
        XR_PERFORMANCE_METRICS_COUNTER_FLOAT_VALUE_VALID_BIT_META = 0x4;

    public static final int
        XR_PERFORMANCE_METRICS_COUNTER_UNIT_GENERIC_META      = 0,
        XR_PERFORMANCE_METRICS_COUNTER_UNIT_PERCENTAGE_META   = 1,
        XR_PERFORMANCE_METRICS_COUNTER_UNIT_MILLISECONDS_META = 2,
        XR_PERFORMANCE_METRICS_COUNTER_UNIT_BYTES_META        = 3,
        XR_PERFORMANCE_METRICS_COUNTER_UNIT_HERTZ_META        = 4;

    protected METAPerformanceMetrics() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumeratePerformanceMetricsCounterPathsMETA ] ---

    /** {@code XrResult xrEnumeratePerformanceMetricsCounterPathsMETA(XrInstance instance, uint32_t counterPathCapacityInput, uint32_t * counterPathCountOutput, XrPath * counterPaths)} */
    public static int nxrEnumeratePerformanceMetricsCounterPathsMETA(XrInstance instance, int counterPathCapacityInput, long counterPathCountOutput, long counterPaths) {
        long __functionAddress = instance.getCapabilities().xrEnumeratePerformanceMetricsCounterPathsMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(instance.address(), counterPathCapacityInput, counterPathCountOutput, counterPaths, __functionAddress);
    }

    /** {@code XrResult xrEnumeratePerformanceMetricsCounterPathsMETA(XrInstance instance, uint32_t counterPathCapacityInput, uint32_t * counterPathCountOutput, XrPath * counterPaths)} */
    @NativeType("XrResult")
    public static int xrEnumeratePerformanceMetricsCounterPathsMETA(XrInstance instance, @NativeType("uint32_t *") IntBuffer counterPathCountOutput, @NativeType("XrPath *") @Nullable LongBuffer counterPaths) {
        if (CHECKS) {
            check(counterPathCountOutput, 1);
        }
        return nxrEnumeratePerformanceMetricsCounterPathsMETA(instance, remainingSafe(counterPaths), memAddress(counterPathCountOutput), memAddressSafe(counterPaths));
    }

    // --- [ xrSetPerformanceMetricsStateMETA ] ---

    /** {@code XrResult xrSetPerformanceMetricsStateMETA(XrSession session, XrPerformanceMetricsStateMETA const * state)} */
    public static int nxrSetPerformanceMetricsStateMETA(XrSession session, long state) {
        long __functionAddress = session.getCapabilities().xrSetPerformanceMetricsStateMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), state, __functionAddress);
    }

    /** {@code XrResult xrSetPerformanceMetricsStateMETA(XrSession session, XrPerformanceMetricsStateMETA const * state)} */
    @NativeType("XrResult")
    public static int xrSetPerformanceMetricsStateMETA(XrSession session, @NativeType("XrPerformanceMetricsStateMETA const *") XrPerformanceMetricsStateMETA state) {
        return nxrSetPerformanceMetricsStateMETA(session, state.address());
    }

    // --- [ xrGetPerformanceMetricsStateMETA ] ---

    /** {@code XrResult xrGetPerformanceMetricsStateMETA(XrSession session, XrPerformanceMetricsStateMETA * state)} */
    public static int nxrGetPerformanceMetricsStateMETA(XrSession session, long state) {
        long __functionAddress = session.getCapabilities().xrGetPerformanceMetricsStateMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), state, __functionAddress);
    }

    /** {@code XrResult xrGetPerformanceMetricsStateMETA(XrSession session, XrPerformanceMetricsStateMETA * state)} */
    @NativeType("XrResult")
    public static int xrGetPerformanceMetricsStateMETA(XrSession session, @NativeType("XrPerformanceMetricsStateMETA *") XrPerformanceMetricsStateMETA state) {
        return nxrGetPerformanceMetricsStateMETA(session, state.address());
    }

    // --- [ xrQueryPerformanceMetricsCounterMETA ] ---

    /** {@code XrResult xrQueryPerformanceMetricsCounterMETA(XrSession session, XrPath counterPath, XrPerformanceMetricsCounterMETA * counter)} */
    public static int nxrQueryPerformanceMetricsCounterMETA(XrSession session, long counterPath, long counter) {
        long __functionAddress = session.getCapabilities().xrQueryPerformanceMetricsCounterMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), counterPath, counter, __functionAddress);
    }

    /** {@code XrResult xrQueryPerformanceMetricsCounterMETA(XrSession session, XrPath counterPath, XrPerformanceMetricsCounterMETA * counter)} */
    @NativeType("XrResult")
    public static int xrQueryPerformanceMetricsCounterMETA(XrSession session, @NativeType("XrPath") long counterPath, @NativeType("XrPerformanceMetricsCounterMETA *") XrPerformanceMetricsCounterMETA counter) {
        return nxrQueryPerformanceMetricsCounterMETA(session, counterPath, counter.address());
    }

}