/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_alpha_to_coverage_dither_control = "NVAlphaToCoverageDitherControl".nativeClassGL("NV_alpha_to_coverage_dither_control", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        {@code NV_alpha_to_coverage_dither_control} provides a new mechanism to control whether dithering is applied when the existing alpha to coverage
        functionality is used.
        """

    IntConstant(
        "Accepted by the {@code param} parameter of #AlphaToCoverageDitherControlNV().",

        "ALPHA_TO_COVERAGE_DITHER_DEFAULT_NV"..0x934D,
        "ALPHA_TO_COVERAGE_DITHER_ENABLE_NV"..0x934E,
        "ALPHA_TO_COVERAGE_DITHER_DISABLE_NV"..0x934F
    )

    IntConstant(
        "Accepted by the {@code param} of #GetIntegerv().",

        "ALPHA_TO_COVERAGE_DITHER_MODE_NV"..0x92BF
    )

    void(
        "AlphaToCoverageDitherControlNV",
        "",

        GLenum.IN("mode", "")
    )
}