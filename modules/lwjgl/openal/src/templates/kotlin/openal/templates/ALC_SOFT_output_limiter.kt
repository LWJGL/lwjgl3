/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_SOFT_output_limiter = "SOFTOutputLimiter".nativeClassALC("SOFT_output_limiter") {
    IntConstant(
        "OUTPUT_LIMITER_SOFT"..0x199A
    )
}