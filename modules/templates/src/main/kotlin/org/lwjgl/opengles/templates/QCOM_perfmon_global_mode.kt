/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val QCOM_perfmon_global_mode = "QCOMPerfmonGlobalMode".nativeClassGLES("QCOM_perfmon_global_mode", postfix = QCOM) {
    documentation =
        """
        Native bindings to the ${registryLink("QCOM", "QCOM_performance_monitor_global_mode")} extension.

        This extension introduces a global tracking mode in the performance monitors. When enabled, the counters increment in all operations, including all
        "housekeeping" operations such as resolves/clears and operations performed by other concurrent applications. The normal operation is to track only the
        application's own operations.
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable and Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, and
        GetFloatv.
        """,

        "PERFMON_GLOBAL_MODE_QCOM"..0x8FA0
    )
}