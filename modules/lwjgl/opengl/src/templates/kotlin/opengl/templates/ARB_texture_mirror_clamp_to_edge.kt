/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_mirror_clamp_to_edge = "ARBTextureMirrorClampToEdge".nativeClassGL("ARB_texture_mirror_clamp_to_edge") {
    IntConstant(
        "MIRROR_CLAMP_TO_EDGE"..0x8743
    )

}