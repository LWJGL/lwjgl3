/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_coverage_sample = "NVCoverageSample".nativeClassEGL("NV_coverage_sample", postfix = NV) {
    IntConstant(
        "COVERAGE_BUFFERS_NV"..0x30E0,
        "COVERAGE_SAMPLES_NV"..0x30E1
    )
}