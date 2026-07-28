/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val APPLE_aux_depth_stencil = "APPLEAuxDepthStencil".nativeClassGL("APPLE_aux_depth_stencil") {
    IntConstant(
        "AUX_DEPTH_STENCIL_APPLE"..0x8A14
    )
}