/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_texture_shader3 = "NVTextureShader3".nativeClassGL("NV_texture_shader3", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        {@code NV_texture_shader3} extends the {@code NV_texture_shader} functionality by adding several new texture shader operations, extending several
        existing texture shader operations, adding a new {@code HILO8} internal format, and adding new and more flexible re-mapping modes for dot product and
        dependent texture shader operations.
        
        Requires ${NV_texture_shader.link} and ${NV_texture_shader2.link}.
        """

    IntConstant(
        """
        When the {@code target} and {@code pname} parameters of TexEnvf, TexEnvfv, TexEnvi, and TexEnviv are TEXTURE_SHADER_NV and SHADER_OPERATION_NV
        respectively, then the value of {@code param} or the value pointed to by {@code params} may be.
        """,

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
        "Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, and TexImage3D.",

        "HILO8_NV"..0x885E,
        "SIGNED_HILO8_NV"..0x885F
    )

    IntConstant(
        """
        When the {@code target} and {@code pname} parameters of TexEnvf, TexEnvfv, TexEnvi, and TexEnviv are TEXTURE_SHADER_NV and
        RGBA_UNSIGNED_DOT_PRODUCT_MAPPING_NV respectively, then the value of {@code param} or the value pointed to by {@code params} may be.
        """,

        "FORCE_BLUE_TO_ONE_NV"..0x8860
    )
}
