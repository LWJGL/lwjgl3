/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_texture_shader = "NVTextureShader".nativeClassGL("NV_texture_shader", postfix = NV) {
    IntConstant(
        "TEXTURE_SHADER_NV"..0x86DE
    )

    IntConstant(
        "RGBA_UNSIGNED_DOT_PRODUCT_MAPPING_NV"..0x86D9,
        "SHADER_OPERATION_NV"..0x86DF,
        "OFFSET_TEXTURE_SCALE_NV"..0x86E2,
        "OFFSET_TEXTURE_BIAS_NV"..0x86E3,
        "PREVIOUS_TEXTURE_INPUT_NV"..0x86E4
    )

    IntConstant(
        "CULL_MODES_NV"..0x86E0,
        "OFFSET_TEXTURE_MATRIX_NV"..0x86E1,
        "CONST_EYE_NV"..0x86E5
    )

    IntConstant(
        "SHADER_CONSISTENT_NV"..0x86DD
    )

    IntConstant(
        "PASS_THROUGH_NV"..0x86E6,
        "CULL_FRAGMENT_NV"..0x86E7,
        "OFFSET_TEXTURE_2D_NV"..0x86E8,
        "OFFSET_TEXTURE_RECTANGLE_NV"..0x864C,
        "OFFSET_TEXTURE_RECTANGLE_SCALE_NV"..0x864D,
        "DEPENDENT_AR_TEXTURE_2D_NV"..0x86E9,
        "DEPENDENT_GB_TEXTURE_2D_NV"..0x86EA,
        "DOT_PRODUCT_NV"..0x86EC,
        "DOT_PRODUCT_DEPTH_REPLACE_NV"..0x86ED,
        "DOT_PRODUCT_TEXTURE_2D_NV"..0x86EE,
        "DOT_PRODUCT_TEXTURE_RECTANGLE_NV"..0x864E,
        "DOT_PRODUCT_TEXTURE_CUBE_MAP_NV"..0x86F0,
        "DOT_PRODUCT_DIFFUSE_CUBE_MAP_NV"..0x86F1,
        "DOT_PRODUCT_REFLECT_CUBE_MAP_NV"..0x86F2,
        "DOT_PRODUCT_CONST_EYE_REFLECT_CUBE_MAP_NV"..0x86F3
    )

    IntConstant(
        "HILO_NV"..0x86F4,
        "DSDT_NV"..0x86F5,
        "DSDT_MAG_NV"..0x86F6,
        "DSDT_MAG_VIB_NV"..0x86F7
    )

    IntConstant(
        "UNSIGNED_INT_S8_S8_8_8_NV"..0x86DA,
        "UNSIGNED_INT_8_8_S8_S8_REV_NV"..0x86DB
    )

    IntConstant(
        "SIGNED_RGBA_NV"..0x86FB,
        "SIGNED_RGBA8_NV"..0x86FC,
        "SIGNED_RGB_NV"..0x86FE,
        "SIGNED_RGB8_NV"..0x86FF,
        "SIGNED_LUMINANCE_NV"..0x8701,
        "SIGNED_LUMINANCE8_NV"..0x8702,
        "SIGNED_LUMINANCE_ALPHA_NV"..0x8703,
        "SIGNED_LUMINANCE8_ALPHA8_NV"..0x8704,
        "SIGNED_ALPHA_NV"..0x8705,
        "SIGNED_ALPHA8_NV"..0x8706,
        "SIGNED_INTENSITY_NV"..0x8707,
        "SIGNED_INTENSITY8_NV"..0x8708,
        "SIGNED_RGB_UNSIGNED_ALPHA_NV"..0x870C,
        "SIGNED_RGB8_UNSIGNED_ALPHA8_NV"..0x870D
    )

    IntConstant(
        "HILO16_NV"..0x86F8,
        "SIGNED_HILO_NV"..0x86F9,
        "SIGNED_HILO16_NV"..0x86FA,
        "DSDT8_NV"..0x8709,
        "DSDT8_MAG8_NV"..0x870A,
        "DSDT_MAG_INTENSITY_NV"..0x86DC,
        "DSDT8_MAG8_INTENSITY8_NV"..0x870B
    )

    IntConstant(
        "HI_SCALE_NV"..0x870E,
        "LO_SCALE_NV"..0x870F,
        "DS_SCALE_NV"..0x8710,
        "DT_SCALE_NV"..0x8711,
        "MAGNITUDE_SCALE_NV"..0x8712,
        "VIBRANCE_SCALE_NV"..0x8713,
        "HI_BIAS_NV"..0x8714,
        "LO_BIAS_NV"..0x8715,
        "DS_BIAS_NV"..0x8716,
        "DT_BIAS_NV"..0x8717,
        "MAGNITUDE_BIAS_NV"..0x8718,
        "VIBRANCE_BIAS_NV"..0x8719
    )

    IntConstant(
        "TEXTURE_BORDER_VALUES_NV"..0x871A
    )

    IntConstant(
        "TEXTURE_HI_SIZE_NV"..0x871B,
        "TEXTURE_LO_SIZE_NV"..0x871C,
        "TEXTURE_DS_SIZE_NV"..0x871D,
        "TEXTURE_DT_SIZE_NV"..0x871E,
        "TEXTURE_MAG_SIZE_NV"..0x871F
    )
}
