/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_shader_pixel_local_storage = "EXTShaderPixelLocalStorage".nativeClassGLES("EXT_shader_pixel_local_storage", postfix = EXT) {
    IntConstant(
        "MAX_SHADER_PIXEL_LOCAL_STORAGE_FAST_SIZE_EXT"..0x8F63,
        "MAX_SHADER_PIXEL_LOCAL_STORAGE_SIZE_EXT"..0x8F67
    )

    IntConstant(
        "SHADER_PIXEL_LOCAL_STORAGE_EXT"..0x8F64
    )
}