/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_mirrored_repeat = "ARBTextureMirroredRepeat".nativeClassGL("ARB_texture_mirrored_repeat", postfix = ARB) {
    IntConstant(
        "MIRRORED_REPEAT_ARB"..0x8370
    )

}