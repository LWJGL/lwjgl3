/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val IMG_texture_filter_cubic = "IMGTextureFilterCubic".nativeClassGLES("IMG_texture_filter_cubic", postfix = IMG) {
    IntConstant(
        "CUBIC_IMG"..0x9139
    )

    IntConstant(
        "CUBIC_MIPMAP_NEAREST_IMG"..0x913A,
        "CUBIC_MIPMAP_LINEAR_IMG"..0x913B
    )
}