/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The META_performance_metrics extension. */
public class METAPerformanceMetrics {

    /** The extension specification version. */
    public static final int XR_META_performance_metrics_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_META_PERFORMANCE_METRICS_EXTENSION_NAME = "XR_META_performance_metrics";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_PERFORMANCE_METRICS_STATE_META TYPE_PERFORMANCE_METRICS_STATE_META}</li>
     * <li>{@link #XR_TYPE_PERFORMANCE_METRICS_COUNTER_META TYPE_PERFORMANCE_METRICS_COUNTER_META}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_PERFORMANCE_METRICS_STATE_META   = 1000232001,
        XR_TYPE_PERFORMANCE_METRICS_COUNTER_META = 1000232002;

    /**
     * XrPerformanceMetricsCounterFlagBitsMETA
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_PERFORMANCE_METRICS_COUNTER_ANY_VALUE_VALID_BIT_META PERFORMANCE_METRICS_COUNTER_ANY_VALUE_VALID_BIT_META}</li>
     * <li>{@link #XR_PERFORMANCE_METRICS_COUNTER_UINT_VALUE_VALID_BIT_META PERFORMANCE_METRICS_COUNTER_UINT_VALUE_VALID_BIT_META}</li>
     * <li>{@link #XR_PERFORMANCE_METRICS_COUNTER_FLOAT_VALUE_VALID_BIT_META PERFORMANCE_METRICS_COUNTER_FLOAT_VALUE_VALID_BIT_META}</li>
     * </ul>
     */
    public static final int
        XR_PERFORMANCE_METRICS_COUNTER_ANY_VALUE_VALID_BIT_META   = 0x1,
        XR_PERFORMANCE_METRICS_COUNTER_UINT_VALUE_VALID_BIT_META  = 0x2,
        XR_PERFORMANCE_METRICS_COUNTER_FLOAT_VALUE_VALID_BIT_META = 0x4;

    /**
     * XrPerformanceMetricsCounterUnitMETA - XrPerformanceMetricsCounterUnitMETA
     * 
     * <h5>Description</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_PERFORMANCE_METRICS_COUNTER_UNIT_GENERIC_META PERFORMANCE_METRICS_COUNTER_UNIT_GENERIC_META}</td><td>the performance counter unit is generic (unspecified).</td></tr>
     * <tr><td>{@link #XR_PERFORMANCE_METRICS_COUNTER_UNIT_PERCENTAGE_META PERFORMANCE_METRICS_COUNTER_UNIT_PERCENTAGE_META}</td><td>the performance counter unit is percentage (%).</td></tr>
     * <tr><td>{@link #XR_PERFORMANCE_METRICS_COUNTER_UNIT_MILLISECONDS_META PERFORMANCE_METRICS_COUNTER_UNIT_MILLISECONDS_META}</td><td>the performance counter unit is millisecond.</td></tr>
     * <tr><td>{@link #XR_PERFORMANCE_METRICS_COUNTER_UNIT_BYTES_META PERFORMANCE_METRICS_COUNTER_UNIT_BYTES_META}</td><td>the performance counter unit is byte.</td></tr>
     * <tr><td>{@link #XR_PERFORMANCE_METRICS_COUNTER_UNIT_HERTZ_META PERFORMANCE_METRICS_COUNTER_UNIT_HERTZ_META}</td><td>the performance counter unit is hertz (Hz).</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPerformanceMetricsCounterMETA}</p>
     */
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

    /**
     * Unsafe version of: {@link #xrEnumeratePerformanceMetricsCounterPathsMETA EnumeratePerformanceMetricsCounterPathsMETA}
     *
     * @param counterPathCapacityInput the capacity of the {@code counterPaths} array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrEnumeratePerformanceMetricsCounterPathsMETA(XrInstance instance, int counterPathCapacityInput, long counterPathCountOutput, long counterPaths) {
        long __functionAddress = instance.getCapabilities().xrEnumeratePerformanceMetricsCounterPathsMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(instance.address(), counterPathCapacityInput, counterPathCountOutput, counterPaths, __functionAddress);
    }

    /**
     * Enumerate all performance metrics counter paths that supported by the runtime.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnumeratePerformanceMetricsCounterPathsMETA EnumeratePerformanceMetricsCounterPathsMETA} function enumerate all performance metrics counter paths that supported by the runtime, it is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnumeratePerformanceMetricsCounterPathsMETA(
     *     XrInstance                                  instance,
     *     uint32_t                                    counterPathCapacityInput,
     *     uint32_t*                                   counterPathCountOutput,
     *     XrPath*                                     counterPaths);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAPerformanceMetrics XR_META_performance_metrics} extension <b>must</b> be enabled prior to calling {@link #xrEnumeratePerformanceMetricsCounterPathsMETA EnumeratePerformanceMetricsCounterPathsMETA}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code counterPathCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code counterPathCapacityInput} is not 0, {@code counterPaths} <b>must</b> be a pointer to an array of {@code counterPathCapacityInput} {@code XrPath} values</li>
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
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * </ul></dd>
     * </dl>
     *
     * @param instance               an {@code XrInstance} handle previously created with {@link XR10#xrCreateInstance CreateInstance}.
     * @param counterPathCountOutput filled in by the runtime with the count of {@code counterPaths} written or the required capacity in the case that {@code counterPathCapacityInput} is insufficient.
     * @param counterPaths           an array of {@code XrPath} filled in by the runtime which contains all the available performance metrics counters, but <b>can</b> be {@code NULL} if {@code counterPathCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumeratePerformanceMetricsCounterPathsMETA(XrInstance instance, @NativeType("uint32_t *") IntBuffer counterPathCountOutput, @Nullable @NativeType("XrPath *") LongBuffer counterPaths) {
        if (CHECKS) {
            check(counterPathCountOutput, 1);
        }
        return nxrEnumeratePerformanceMetricsCounterPathsMETA(instance, remainingSafe(counterPaths), memAddress(counterPathCountOutput), memAddressSafe(counterPaths));
    }

    // --- [ xrSetPerformanceMetricsStateMETA ] ---

    /** Unsafe version of: {@link #xrSetPerformanceMetricsStateMETA SetPerformanceMetricsStateMETA} */
    public static int nxrSetPerformanceMetricsStateMETA(XrSession session, long state) {
        long __functionAddress = session.getCapabilities().xrSetPerformanceMetricsStateMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), state, __functionAddress);
    }

    /**
     * Enable/disable performance metrics.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSetPerformanceMetricsStateMETA SetPerformanceMetricsStateMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSetPerformanceMetricsStateMETA(
     *     XrSession                                   session,
     *     const XrPerformanceMetricsStateMETA*        state);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrSetPerformanceMetricsStateMETA SetPerformanceMetricsStateMETA} function enables or disables the performance metrics system.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAPerformanceMetrics XR_META_performance_metrics} extension <b>must</b> be enabled prior to calling {@link #xrSetPerformanceMetricsStateMETA SetPerformanceMetricsStateMETA}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code state} <b>must</b> be a pointer to a valid {@link XrPerformanceMetricsStateMETA} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPerformanceMetricsStateMETA}, {@link #xrGetPerformanceMetricsStateMETA GetPerformanceMetricsStateMETA}</p>
     *
     * @param session an {@code XrSession} handle previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param state   a pointer to an {@link XrPerformanceMetricsStateMETA} structure.
     */
    @NativeType("XrResult")
    public static int xrSetPerformanceMetricsStateMETA(XrSession session, @NativeType("XrPerformanceMetricsStateMETA const *") XrPerformanceMetricsStateMETA state) {
        return nxrSetPerformanceMetricsStateMETA(session, state.address());
    }

    // --- [ xrGetPerformanceMetricsStateMETA ] ---

    /** Unsafe version of: {@link #xrGetPerformanceMetricsStateMETA GetPerformanceMetricsStateMETA} */
    public static int nxrGetPerformanceMetricsStateMETA(XrSession session, long state) {
        long __functionAddress = session.getCapabilities().xrGetPerformanceMetricsStateMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), state, __functionAddress);
    }

    /**
     * Get current state of performance metrics.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetPerformanceMetricsStateMETA GetPerformanceMetricsStateMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetPerformanceMetricsStateMETA(
     *     XrSession                                   session,
     *     XrPerformanceMetricsStateMETA*              state);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetPerformanceMetricsStateMETA GetPerformanceMetricsStateMETA} function gets the current state of the performance metrics system.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAPerformanceMetrics XR_META_performance_metrics} extension <b>must</b> be enabled prior to calling {@link #xrGetPerformanceMetricsStateMETA GetPerformanceMetricsStateMETA}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code state} <b>must</b> be a pointer to an {@link XrPerformanceMetricsStateMETA} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPerformanceMetricsStateMETA}, {@link #xrSetPerformanceMetricsStateMETA SetPerformanceMetricsStateMETA}</p>
     *
     * @param session an {@code XrSession} handle previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param state   a pointer to an {@link XrPerformanceMetricsStateMETA} structure.
     */
    @NativeType("XrResult")
    public static int xrGetPerformanceMetricsStateMETA(XrSession session, @NativeType("XrPerformanceMetricsStateMETA *") XrPerformanceMetricsStateMETA state) {
        return nxrGetPerformanceMetricsStateMETA(session, state.address());
    }

    // --- [ xrQueryPerformanceMetricsCounterMETA ] ---

    /** Unsafe version of: {@link #xrQueryPerformanceMetricsCounterMETA QueryPerformanceMetricsCounterMETA} */
    public static int nxrQueryPerformanceMetricsCounterMETA(XrSession session, long counterPath, long counter) {
        long __functionAddress = session.getCapabilities().xrQueryPerformanceMetricsCounterMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), counterPath, counter, __functionAddress);
    }

    /**
     * Query performance metrics counter.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrQueryPerformanceMetricsCounterMETA QueryPerformanceMetricsCounterMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrQueryPerformanceMetricsCounterMETA(
     *     XrSession                                   session,
     *     XrPath                                      counterPath,
     *     XrPerformanceMetricsCounterMETA*            counter);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrQueryPerformanceMetricsCounterMETA QueryPerformanceMetricsCounterMETA} function queries a performance metrics counter.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAPerformanceMetrics XR_META_performance_metrics} extension <b>must</b> be enabled prior to calling {@link #xrQueryPerformanceMetricsCounterMETA QueryPerformanceMetricsCounterMETA}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code counter} <b>must</b> be a pointer to an {@link XrPerformanceMetricsCounterMETA} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPerformanceMetricsCounterMETA}</p>
     *
     * @param session     an {@code XrSession} handle previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param counterPath a valid performance metrics counter path.
     * @param counter     a pointer to an {@link XrPerformanceMetricsCounterMETA} structure.
     */
    @NativeType("XrResult")
    public static int xrQueryPerformanceMetricsCounterMETA(XrSession session, @NativeType("XrPath") long counterPath, @NativeType("XrPerformanceMetricsCounterMETA *") XrPerformanceMetricsCounterMETA counter) {
        return nxrQueryPerformanceMetricsCounterMETA(session, counterPath, counter.address());
    }

}