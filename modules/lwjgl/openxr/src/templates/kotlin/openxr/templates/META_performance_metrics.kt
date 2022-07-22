/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_performance_metrics = "METAPerformanceMetrics".nativeClassXR("META_performance_metrics", type = "instance", postfix = "META") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "META_performance_metrics_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "META_PERFORMANCE_METRICS_EXTENSION_NAME".."XR_META_performance_metrics"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_PERFORMANCE_METRICS_STATE_META".."1000232001",
        "TYPE_PERFORMANCE_METRICS_COUNTER_META".."1000232002"
    )

    EnumConstant(
        "XrPerformanceMetricsCounterFlagBitsMETA",

        "PERFORMANCE_METRICS_COUNTER_ANY_VALUE_VALID_BIT_META".enum(0x00000001),
        "PERFORMANCE_METRICS_COUNTER_UINT_VALUE_VALID_BIT_META".enum(0x00000002),
        "PERFORMANCE_METRICS_COUNTER_FLOAT_VALUE_VALID_BIT_META".enum(0x00000004)
    )

    EnumConstant(
        """
        XrPerformanceMetricsCounterUnitMETA - XrPerformanceMetricsCounterUnitMETA

        <h5>Description</h5>
        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#PERFORMANCE_METRICS_COUNTER_UNIT_GENERIC_META</td><td>the performance counter unit is generic (unspecified).</td></tr>
                <tr><td>#PERFORMANCE_METRICS_COUNTER_UNIT_PERCENTAGE_META</td><td>the performance counter unit is percentage (%).</td></tr>
                <tr><td>#PERFORMANCE_METRICS_COUNTER_UNIT_MILLISECONDS_META</td><td>the performance counter unit is millisecond.</td></tr>
                <tr><td>#PERFORMANCE_METRICS_COUNTER_UNIT_BYTES_META</td><td>the performance counter unit is byte.</td></tr>
                <tr><td>#PERFORMANCE_METRICS_COUNTER_UNIT_HERTZ_META</td><td>the performance counter unit is hertz (Hz).</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrPerformanceMetricsCounterMETA
        """,

        "PERFORMANCE_METRICS_COUNTER_UNIT_GENERIC_META".."0",
        "PERFORMANCE_METRICS_COUNTER_UNIT_PERCENTAGE_META".."1",
        "PERFORMANCE_METRICS_COUNTER_UNIT_MILLISECONDS_META".."2",
        "PERFORMANCE_METRICS_COUNTER_UNIT_BYTES_META".."3",
        "PERFORMANCE_METRICS_COUNTER_UNIT_HERTZ_META".."4"
    )

    XrResult(
        "EnumeratePerformanceMetricsCounterPathsMETA",
        """
        Enumerate all performance metrics counter paths that supported by the runtime.

        <h5>C Specification</h5>
        The #EnumeratePerformanceMetricsCounterPathsMETA() function enumerate all performance metrics counter paths that supported by the runtime, it is defined as:

        <pre><code>
￿XrResult xrEnumeratePerformanceMetricsCounterPathsMETA(
￿    XrInstance                                  instance,
￿    uint32_t                                    counterPathCapacityInput,
￿    uint32_t*                                   counterPathCountOutput,
￿    XrPath*                                     counterPaths);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPerformanceMetrics XR_META_performance_metrics} extension <b>must</b> be enabled prior to calling #EnumeratePerformanceMetricsCounterPathsMETA()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code counterPathCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code counterPathCapacityInput} is not 0, {@code counterPaths} <b>must</b> be a pointer to an array of {@code counterPathCapacityInput} {@code XrPath} values</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
            </ul></dd>
        </dl>
        """,

        XrInstance("instance", "an {@code XrInstance} handle previously created with #CreateInstance()."),
        AutoSize("counterPaths")..uint32_t("counterPathCapacityInput", "the capacity of the {@code counterPaths} array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("counterPathCountOutput", "filled in by the runtime with the count of {@code counterPaths} written or the required capacity in the case that {@code counterPathCapacityInput} is insufficient."),
        nullable..XrPath.p("counterPaths", "an array of {@code XrPath} filled in by the runtime which contains all the available performance metrics counters, but <b>can</b> be {@code NULL} if {@code counterPathCapacityInput} is 0.")
    )

    XrResult(
        "SetPerformanceMetricsStateMETA",
        """
        Enable/disable performance metrics.

        <h5>C Specification</h5>
        The #SetPerformanceMetricsStateMETA() function is defined as:

        <pre><code>
￿XrResult xrSetPerformanceMetricsStateMETA(
￿    XrSession                                   session,
￿    const XrPerformanceMetricsStateMETA*        state);</code></pre>

        <h5>Description</h5>
        The #SetPerformanceMetricsStateMETA() function enables or disables the performance metrics system.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPerformanceMetrics XR_META_performance_metrics} extension <b>must</b> be enabled prior to calling #SetPerformanceMetricsStateMETA()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code state} <b>must</b> be a pointer to a valid ##XrPerformanceMetricsStateMETA structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrPerformanceMetricsStateMETA, #GetPerformanceMetricsStateMETA()
        """,

        XrSession("session", "an {@code XrSession} handle previously created with #CreateSession()."),
        XrPerformanceMetricsStateMETA.const.p("state", "a pointer to an ##XrPerformanceMetricsStateMETA structure.")
    )

    XrResult(
        "GetPerformanceMetricsStateMETA",
        """
        Get current state of performance metrics.

        <h5>C Specification</h5>
        The #GetPerformanceMetricsStateMETA() function is defined as:

        <pre><code>
￿XrResult xrGetPerformanceMetricsStateMETA(
￿    XrSession                                   session,
￿    XrPerformanceMetricsStateMETA*              state);</code></pre>

        <h5>Description</h5>
        The #GetPerformanceMetricsStateMETA() function gets the current state of the performance metrics system.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPerformanceMetrics XR_META_performance_metrics} extension <b>must</b> be enabled prior to calling #GetPerformanceMetricsStateMETA()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code state} <b>must</b> be a pointer to an ##XrPerformanceMetricsStateMETA structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrPerformanceMetricsStateMETA, #SetPerformanceMetricsStateMETA()
        """,

        XrSession("session", "an {@code XrSession} handle previously created with #CreateSession()."),
        XrPerformanceMetricsStateMETA.p("state", "a pointer to an ##XrPerformanceMetricsStateMETA structure.")
    )

    XrResult(
        "QueryPerformanceMetricsCounterMETA",
        """
        Query performance metrics counter.

        <h5>C Specification</h5>
        The #QueryPerformanceMetricsCounterMETA() function is defined as:

        <pre><code>
￿XrResult xrQueryPerformanceMetricsCounterMETA(
￿    XrSession                                   session,
￿    XrPath                                      counterPath,
￿    XrPerformanceMetricsCounterMETA*            counter);</code></pre>

        <h5>Description</h5>
        The #QueryPerformanceMetricsCounterMETA() function queries a performance metrics counter.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPerformanceMetrics XR_META_performance_metrics} extension <b>must</b> be enabled prior to calling #QueryPerformanceMetricsCounterMETA()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code counter} <b>must</b> be a pointer to an ##XrPerformanceMetricsCounterMETA structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrPerformanceMetricsCounterMETA
        """,

        XrSession("session", "an {@code XrSession} handle previously created with #CreateSession()."),
        XrPath("counterPath", "a valid performance metrics counter path."),
        XrPerformanceMetricsCounterMETA.p("counter", "a pointer to an ##XrPerformanceMetricsCounterMETA structure.")
    )
}