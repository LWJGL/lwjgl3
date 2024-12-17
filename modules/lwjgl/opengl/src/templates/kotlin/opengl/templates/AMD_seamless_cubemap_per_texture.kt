/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_seamless_cubemap_per_texture = "AMDSeamlessCubemapPerTexture".nativeClassGL("AMD_seamless_cubemap_per_texture", postfix = AMD) {
    IntConstant(
        "TEXTURE_CUBE_MAP_SEAMLESS"..0x884F
    )
}