/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_fragment_coverage_to_color = "NVFragmentCoverageToColor".nativeClassGLES("NV_fragment_coverage_to_color", postfix = NV) {
    IntConstant(
        "FRAGMENT_COVERAGE_TO_COLOR_NV"..0x92DD
    )

    IntConstant(
        "FRAGMENT_COVERAGE_COLOR_NV"..0x92DE
    )

    void(
        "FragmentCoverageColorNV",

        GLuint("color")
    )
}