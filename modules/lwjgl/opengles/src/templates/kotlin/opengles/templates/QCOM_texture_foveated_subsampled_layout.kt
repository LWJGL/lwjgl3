/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_texture_foveated_subsampled_layout = "QCOMTextureFoveatedSubsampledLayout".nativeClassGLES("QCOM_texture_foveated_subsampled_layout", postfix = QCOM) {
    IntConstant(
        "FOVEATION_SUBSAMPLED_LAYOUT_METHOD_BIT_QCOM"..0x4
    )

    IntConstant(
        "MAX_SHADER_SUBSAMPLED_IMAGE_UNITS_QCOM"..0x8FA1
    )

}