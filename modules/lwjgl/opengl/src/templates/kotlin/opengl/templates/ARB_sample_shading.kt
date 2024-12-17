/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_sample_shading = "ARBSampleShading".nativeClassGL("ARB_sample_shading", postfix = ARB) {
    IntConstant(
        "SAMPLE_SHADING_ARB"..0x8C36
    )

    IntConstant(
        "MIN_SAMPLE_SHADING_VALUE_ARB"..0x8C37
    )

    void(
        "MinSampleShadingARB",

        GLfloat("value")
    )
}