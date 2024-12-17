/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_depth_clamp = "ARBDepthClamp".nativeClassGL("ARB_depth_clamp") {
    IntConstant(
        "DEPTH_CLAMP"..0x864F
    )

}