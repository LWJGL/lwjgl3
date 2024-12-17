/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_texture_shader2 = "NVTextureShader2".nativeClassGL("NV_texture_shader2", postfix = NV) {
    IntConstant(
        "DOT_PRODUCT_TEXTURE_3D_NV"..0x86EF
    )
}
