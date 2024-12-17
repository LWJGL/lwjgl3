/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_coverage_sample = "NVCoverageSample".nativeClassGLES("NV_coverage_sample", postfix = NV) {
    IntConstant(
        "COVERAGE_COMPONENT_NV"..0x8ED0
    )

    IntConstant(
        "COVERAGE_COMPONENT4_NV"..0x8ED1
    )

    IntConstant(
        "COVERAGE_ALL_FRAGMENTS_NV"..0x8ED5,
        "COVERAGE_EDGE_FRAGMENTS_NV"..0x8ED6,
        "COVERAGE_AUTOMATIC_NV"..0x8ED7
    )

    IntConstant(
        "COVERAGE_ATTACHMENT_NV"..0x8ED2
    )

    IntConstant(
        "COVERAGE_BUFFER_BIT_NV"..0x8000
    )

    IntConstant(
        "COVERAGE_BUFFERS_NV"..0x8ED3,
        "COVERAGE_SAMPLES_NV"..0x8ED4
    )

    void(
        "CoverageMaskNV",

        GLboolean("mask")
    )

    void(
        "CoverageOperationNV",

        GLenum("operation")
    )
}