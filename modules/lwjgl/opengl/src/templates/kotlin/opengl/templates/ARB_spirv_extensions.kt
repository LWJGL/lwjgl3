/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_spirv_extensions = "ARBSPIRVExtensions".nativeClassGL("ARB_spirv_extensions") {
    IntConstant(
        "SPIR_V_EXTENSIONS"..0x9553
    )

    IntConstant(
        "NUM_SPIR_V_EXTENSIONS"..0x9554
    )
}