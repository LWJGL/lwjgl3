/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_ycbcr_degamma = "QCOMYCBCRDegamma".nativeClassGLES("QCOM_ycbcr_degamma", postfix = QCOM) {
    IntConstant(
        "TEXTURE_Y_DEGAMMA_QCOM"..0x9710,
        "TEXTURE_CBCR_DEGAMMA_QCOM"..0x9711
    )
}