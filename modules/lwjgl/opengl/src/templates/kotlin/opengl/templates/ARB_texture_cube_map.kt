/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_cube_map = "ARBTextureCubeMap".nativeClassGL("ARB_texture_cube_map", postfix = ARB) {
    IntConstant(
        "NORMAL_MAP_ARB"..0x8511,
        "REFLECTION_MAP_ARB"..0x8512
    )

    IntConstant(
        "TEXTURE_CUBE_MAP_ARB"..0x8513
    )

    IntConstant(
        "TEXTURE_BINDING_CUBE_MAP_ARB"..0x8514
    )

    IntConstant(
        "TEXTURE_CUBE_MAP_POSITIVE_X_ARB"..0x8515,
        "TEXTURE_CUBE_MAP_NEGATIVE_X_ARB"..0x8516,
        "TEXTURE_CUBE_MAP_POSITIVE_Y_ARB"..0x8517,
        "TEXTURE_CUBE_MAP_NEGATIVE_Y_ARB"..0x8518,
        "TEXTURE_CUBE_MAP_POSITIVE_Z_ARB"..0x8519,
        "TEXTURE_CUBE_MAP_NEGATIVE_Z_ARB"..0x851A
    )

    IntConstant(
        "PROXY_TEXTURE_CUBE_MAP_ARB"..0x851B
    )

    IntConstant(
        "MAX_CUBE_MAP_TEXTURE_SIZE_ARB"..0x851C
    )

}