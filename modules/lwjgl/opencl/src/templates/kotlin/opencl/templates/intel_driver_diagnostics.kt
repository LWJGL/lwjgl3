/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_driver_diagnostics = "INTELDriverDiagnostics".nativeClassCL("intel_driver_diagnostics", INTEL) {
    LongConstant(
        "CONTEXT_SHOW_DIAGNOSTICS_INTEL"..0x4106L
    )

    LongConstant(
        "CONTEXT_DIAGNOSTICS_LEVEL_ALL_INTEL".."0xFF",
        "CONTEXT_DIAGNOSTICS_LEVEL_GOOD_INTEL".."1L << 0",
        "CONTEXT_DIAGNOSTICS_LEVEL_BAD_INTEL".."1L << 1",
        "CONTEXT_DIAGNOSTICS_LEVEL_NEUTRAL_INTEL".."1L << 2"
    )
}