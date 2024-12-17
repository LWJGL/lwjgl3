/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_perfmon_global_mode = "QCOMPerfmonGlobalMode".nativeClassGLES("QCOM_perfmon_global_mode", postfix = QCOM) {
    IntConstant(
        "PERFMON_GLOBAL_MODE_QCOM"..0x8FA0
    )
}