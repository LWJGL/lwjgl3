/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_rgb10_a2ui = "ARBTextureRGB10_A2UI".nativeClassGL("ARB_texture_rgb10_a2ui") {
    IntConstant(
        "RGB10_A2UI"..0x906F
    )
}