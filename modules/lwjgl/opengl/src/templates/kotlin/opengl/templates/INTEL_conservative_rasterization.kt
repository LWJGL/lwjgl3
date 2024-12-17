/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val INTEL_conservative_rasterization = "INTELConservativeRasterization".nativeClassGL("INTEL_conservative_rasterization", postfix = INTEL) {
    IntConstant(
        "CONSERVATIVE_RASTERIZATION_INTEL"..0x83FE
    )
}