/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val qcom_perf_hint = "QCOMPerfHint".nativeClassCL("qcom_perf_hint", QCOM) {
    IntConstant(
        "PERF_HINT_HIGH_QCOM"..0x40C3,
        "PERF_HINT_NORMAL_QCOM"..0x40C4,
        "PERF_HINT_LOW_QCOM"..0x40C5
    )

    IntConstant(
        "CONTEXT_PERF_HINT_QCOM"..0x40C2
    )

    cl_int(
        "SetPerfHintQCOM",

        cl_context("context"),
        cl_perf_hint_qcom("perf_hint")
    )
}