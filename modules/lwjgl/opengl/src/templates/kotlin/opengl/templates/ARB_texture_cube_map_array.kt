/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_cube_map_array = "ARBTextureCubeMapArray".nativeClassGL("ARB_texture_cube_map_array", postfix = ARB) {
    IntConstant(
        "TEXTURE_CUBE_MAP_ARRAY_ARB"..0x9009
    )

    IntConstant(
        "TEXTURE_BINDING_CUBE_MAP_ARRAY_ARB"..0x900A
    )

    IntConstant(
        "PROXY_TEXTURE_CUBE_MAP_ARRAY_ARB"..0x900B
    )

    IntConstant(
        "SAMPLER_CUBE_MAP_ARRAY_ARB"..0x900C,
        "SAMPLER_CUBE_MAP_ARRAY_SHADOW_ARB"..0x900D,
        "INT_SAMPLER_CUBE_MAP_ARRAY_ARB"..0x900E,
        "UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_ARB"..0x900F
    )
}