/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_driver_diagnostics = "INTELDriverDiagnostics".nativeClassCL("intel_driver_diagnostics", INTEL) {
    IntConstant(
        "CONTEXT_SHOW_DIAGNOSTICS_INTEL"..0x4106
    )

    EnumConstant(
        "CONTEXT_DIAGNOSTICS_LEVEL_GOOD_INTEL".enum(
            0x1
        ),
        "CONTEXT_DIAGNOSTICS_LEVEL_BAD_INTEL".enum(
            0x2
        ),
        "CONTEXT_DIAGNOSTICS_LEVEL_NEUTRAL_INTEL".enum(
            0x4
        )
    )
}