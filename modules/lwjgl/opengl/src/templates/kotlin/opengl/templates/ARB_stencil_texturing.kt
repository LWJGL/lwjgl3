/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_stencil_texturing = "ARBStencilTexturing".nativeClassGL("ARB_stencil_texturing") {
    IntConstant(
        "DEPTH_STENCIL_TEXTURE_MODE"..0x90EA
    )

}