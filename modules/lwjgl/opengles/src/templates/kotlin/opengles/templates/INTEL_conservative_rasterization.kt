/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val INTEL_conservative_rasterization = "INTELConservativeRasterization".nativeClassGLES("INTEL_conservative_rasterization", postfix = INTEL) {
    IntConstant(
        "CONSERVATIVE_RASTERIZATION_INTEL"..0x83FE
    )
}