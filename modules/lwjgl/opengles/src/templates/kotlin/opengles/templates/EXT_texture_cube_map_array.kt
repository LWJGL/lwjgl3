/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_cube_map_array = "EXTTextureCubeMapArray".nativeClassGLES("EXT_texture_cube_map_array", postfix = EXT) {
    IntConstant(
        "TEXTURE_CUBE_MAP_ARRAY_EXT"..0x9009
    )

    IntConstant(
        "TEXTURE_BINDING_CUBE_MAP_ARRAY_EXT"..0x900A
    )

    IntConstant(
        "SAMPLER_CUBE_MAP_ARRAY_EXT"..0x900C,
        "SAMPLER_CUBE_MAP_ARRAY_SHADOW_EXT"..0x900D,
        "INT_SAMPLER_CUBE_MAP_ARRAY_EXT"..0x900E,
        "UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_EXT"..0x900F,
        "IMAGE_CUBE_MAP_ARRAY_EXT"..0x9054,
        "INT_IMAGE_CUBE_MAP_ARRAY_EXT"..0x905F,
        "UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY_EXT"..0x906A
    )
}