/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_binning_control = "QCOMBinningControl".nativeClassGLES("QCOM_binning_control", postfix = QCOM) {
    IntConstant(
        "BINNING_CONTROL_HINT_QCOM"..0x8FB0
    )

    IntConstant(
        "CPU_OPTIMIZED_QCOM"..0x8FB1,
        "GPU_OPTIMIZED_QCOM"..0x8FB2,
        "RENDER_DIRECT_TO_FRAMEBUFFER_QCOM"..0x8FB3,
        "DONT_CARE"..0x1100
    )
}