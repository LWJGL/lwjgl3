/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_point_sprite = "ARBPointSprite".nativeClassGL("ARB_point_sprite", postfix = ARB) {
    IntConstant(
        "POINT_SPRITE_ARB"..0x8861
    )

    IntConstant(
        "COORD_REPLACE_ARB"..0x8862
    )
}