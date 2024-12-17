/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_alpha_to_coverage_dither_control = "NVAlphaToCoverageDitherControl".nativeClassGLES("NV_alpha_to_coverage_dither_control", postfix = NV) {
    IntConstant(
        "ALPHA_TO_COVERAGE_DITHER_DEFAULT_NV"..0x934D,
        "ALPHA_TO_COVERAGE_DITHER_ENABLE_NV"..0x934E,
        "ALPHA_TO_COVERAGE_DITHER_DISABLE_NV"..0x934F
    )

    IntConstant(
        "ALPHA_TO_COVERAGE_DITHER_MODE_NV"..0x92BF
    )

    void(
        "AlphaToCoverageDitherControlNV",

        GLenum("mode")
    )
}