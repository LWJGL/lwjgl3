/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_transform_feedback4 = "AMDTransformFeedback4".nativeClassGL("AMD_transform_feedback4", postfix = AMD) {
    IntConstant(
        "STREAM_RASTERIZATION_AMD"..0x91A0
    )
}