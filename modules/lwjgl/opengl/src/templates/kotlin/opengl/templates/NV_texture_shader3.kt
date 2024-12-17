/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_texture_shader3 = "NVTextureShader3".nativeClassGL("NV_texture_shader3", postfix = NV) {
    IntConstant(
        "OFFSET_PROJECTIVE_TEXTURE_2D_NV"..0x8850,
        "OFFSET_PROJECTIVE_TEXTURE_2D_SCALE_NV"..0x8851,
        "OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_NV"..0x8852,
        "OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_SCALE_NV"..0x8853,
        "OFFSET_HILO_TEXTURE_2D_NV"..0x8854,
        "OFFSET_HILO_TEXTURE_RECTANGLE_NV"..0x8855,
        "OFFSET_HILO_PROJECTIVE_TEXTURE_2D_NV"..0x8856,
        "OFFSET_HILO_PROJECTIVE_TEXTURE_RECTANGLE_NV"..0x8857,
        "DEPENDENT_HILO_TEXTURE_2D_NV"..0x8858,
        "DEPENDENT_RGB_TEXTURE_3D_NV"..0x8859,
        "DEPENDENT_RGB_TEXTURE_CUBE_MAP_NV"..0x885A,
        "DOT_PRODUCT_PASS_THROUGH_NV"..0x885B,
        "DOT_PRODUCT_TEXTURE_1D_NV"..0x885C,
        "DOT_PRODUCT_AFFINE_DEPTH_REPLACE_NV"..0x885D
    )

    IntConstant(
        "HILO8_NV"..0x885E,
        "SIGNED_HILO8_NV"..0x885F
    )

    IntConstant(
        "FORCE_BLUE_TO_ONE_NV"..0x8860
    )
}
