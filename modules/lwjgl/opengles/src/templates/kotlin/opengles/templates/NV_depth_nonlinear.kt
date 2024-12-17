/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_depth_nonlinear = "NVDepthNonlinear".nativeClassGLES("NV_depth_nonlinear", postfix = NV) {
    IntConstant(
        "DEPTH_COMPONENT16_NONLINEAR_NV"..0x8E2C
    )
}