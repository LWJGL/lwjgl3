/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_mirror_clamp_to_edge = "EXTTextureMirrorClampToEdge".nativeClassGLES("EXT_texture_mirror_clamp_to_edge", postfix = EXT) {
    IntConstant(
        "MIRROR_CLAMP_TO_EDGE_EXT"..0x8743
    )
}