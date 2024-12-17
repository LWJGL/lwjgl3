/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_shading_rate = "QCOMShadingRate".nativeClassGLES("QCOM_shading_rate", postfix = QCOM) {
    IntConstant(
        "SHADING_RATE_QCOM"..0x96A4
    )

    IntConstant(
        "SHADING_RATE_PRESERVE_ASPECT_RATIO_QCOM"..0x96A5
    )

    IntConstant(
        "SHADING_RATE_1X1_PIXELS_QCOM"..0x96A6,
        "SHADING_RATE_1X2_PIXELS_QCOM"..0x96A7,
        "SHADING_RATE_2X1_PIXELS_QCOM"..0x96A8,
        "SHADING_RATE_2X2_PIXELS_QCOM"..0x96A9,
        "SHADING_RATE_4X2_PIXELS_QCOM"..0x96AC,
        "SHADING_RATE_4X4_PIXELS_QCOM"..0x96AE
    )
}
