/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_depth_clamp_separate = "AMDDepthClampSeparate".nativeClassGL("AMD_depth_clamp_separate", postfix = AMD) {
    IntConstant(
        "DEPTH_CLAMP_NEAR_AMD"..0x901E,
        "DEPTH_CLAMP_FAR_AMD"..0x901F
    )
}