/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val QCOM_binning_control = "QCOMBinningControl".nativeClassGLES("QCOM_binning_control", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds some new hints to give more control to application developers over the driver's binning algorithm.

        Only change this state right before changing rendertargets or right after a swap or there will be a large performance penalty.
        """

    IntConstant(
        "Accepted by the {@code target} parameter of Hint.",

        "BINNING_CONTROL_HINT_QCOM"..0x8FB0
    )

    IntConstant(
        "Accepted by the {@code hint} parameter of Hint.",

        "CPU_OPTIMIZED_QCOM"..0x8FB1,
        "GPU_OPTIMIZED_QCOM"..0x8FB2,
        "RENDER_DIRECT_TO_FRAMEBUFFER_QCOM"..0x8FB3,
        "DONT_CARE"..0x1100
    )
}