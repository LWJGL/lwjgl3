/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_sample_shading = "OESSampleShading".nativeClassGLES("OES_sample_shading", postfix = OES) {
    IntConstant(
        "SAMPLE_SHADING_OES"..0x8C36
    )

    IntConstant(
        "MIN_SAMPLE_SHADING_VALUE_OES"..0x8C37
    )

    void(
        "MinSampleShadingOES",

        GLfloat("value")
    )
}