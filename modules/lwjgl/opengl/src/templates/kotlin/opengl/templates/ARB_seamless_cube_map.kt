/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_seamless_cube_map = "ARBSeamlessCubeMap".nativeClassGL("ARB_seamless_cube_map") {
    IntConstant(
        "TEXTURE_CUBE_MAP_SEAMLESS"..0x884F
    )
}