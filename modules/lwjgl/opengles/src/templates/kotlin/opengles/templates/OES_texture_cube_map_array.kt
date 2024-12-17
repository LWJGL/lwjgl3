/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_texture_cube_map_array = "OESTextureCubeMapArray".nativeClassGLES("OES_texture_cube_map_array", postfix = OES) {
    IntConstant(
        "TEXTURE_CUBE_MAP_ARRAY_OES"..0x9009
    )

    IntConstant(
        "TEXTURE_BINDING_CUBE_MAP_ARRAY_OES"..0x900A
    )

    IntConstant(
        "SAMPLER_CUBE_MAP_ARRAY_OES"..0x900C,
        "SAMPLER_CUBE_MAP_ARRAY_SHADOW_OES"..0x900D,
        "INT_SAMPLER_CUBE_MAP_ARRAY_OES"..0x900E,
        "UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_OES"..0x900F,
        "IMAGE_CUBE_MAP_ARRAY_OES"..0x9054,
        "INT_IMAGE_CUBE_MAP_ARRAY_OES"..0x905F,
        "UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY_OES"..0x906A
    )
}