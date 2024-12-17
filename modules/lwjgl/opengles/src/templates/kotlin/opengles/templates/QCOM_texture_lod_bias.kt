/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_texture_lod_bias = "QCOMTextureLODBias".nativeClassGLES("QCOM_texture_lod_bias", postfix = QCOM) {
    IntConstant(
        "TEXTURE_LOD_BIAS_QCOM"..0x8C96
    )
}