/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_occlusion_query2 = "ARBOcclusionQuery2".nativeClassGL("ARB_occlusion_query2") {
    IntConstant(
        "ANY_SAMPLES_PASSED"..0x8C2F
    )
}