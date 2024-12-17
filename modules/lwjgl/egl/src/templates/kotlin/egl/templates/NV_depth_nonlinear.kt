/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_depth_nonlinear = "NVDepthNonlinear".nativeClassEGL("NV_depth_nonlinear", postfix = NV) {
    IntConstant(
        "DEPTH_ENCODING_NV"..0x30E2,
        "DEPTH_ENCODING_NONE_NV".."0",
        "DEPTH_ENCODING_NONLINEAR_NV"..0x30E3
    )
}