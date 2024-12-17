/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_texture_foveated2 = "QCOMTextureFoveated2".nativeClassGLES("QCOM_texture_foveated2", postfix = QCOM) {
    IntConstant(
        "TEXTURE_FOVEATED_CUTOFF_DENSITY_QCOM"..0x96A0
    )
}