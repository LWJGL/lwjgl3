/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_clear_texture = "ARBClearTexture".nativeClassGL("ARB_clear_texture") {
    IntConstant(
        "CLEAR_TEXTURE"..0x9365
    )

    reuse(GL44C, "ClearTexSubImage")
    reuse(GL44C, "ClearTexImage")
}