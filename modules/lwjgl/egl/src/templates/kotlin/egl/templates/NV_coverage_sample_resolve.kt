/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_coverage_sample_resolve = "NVCoverageSampleResolve".nativeClassEGL("NV_coverage_sample_resolve", postfix = NV) {
    IntConstant(
        "COVERAGE_SAMPLE_RESOLVE_NV"..0x3131,
        "COVERAGE_SAMPLE_RESOLVE_DEFAULT_NV"..0x3132,
        "COVERAGE_SAMPLE_RESOLVE_NONE_NV"..0x3133
    )
}