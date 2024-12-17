/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_texture_mirror_clamp = "EXTTextureMirrorClamp".nativeClassGL("EXT_texture_mirror_clamp", postfix = EXT) {
    IntConstant(
        "MIRROR_CLAMP_EXT"..0x8742,
        "MIRROR_CLAMP_TO_EDGE_EXT"..0x8743,
        "MIRROR_CLAMP_TO_BORDER_EXT"..0x8912
    )
}