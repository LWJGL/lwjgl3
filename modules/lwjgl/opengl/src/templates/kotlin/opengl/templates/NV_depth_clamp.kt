/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_depth_clamp = "NVDepthClamp".nativeClassGL("NV_depth_clamp", postfix = NV) {
    IntConstant(
        "DEPTH_CLAMP_NV"..0x864F
    )
}
