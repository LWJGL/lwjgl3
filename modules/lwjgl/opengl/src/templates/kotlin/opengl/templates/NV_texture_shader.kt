/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_texture_shader = "NVTextureShader".nativeClassGL("NV_texture_shader", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Standard OpenGL and the ARB_multitexture extension define a straightforward direct mechanism for mapping sets of texture coordinates to filtered
        colors. This extension provides a more functional mechanism.

        OpenGL's standard texturing mechanism defines a set of texture targets. Each texture target defines how the texture image is specified and accessed via
        a set of texture coordinates. OpenGL 1.0 defines the 1D and 2D texture targets. OpenGL 1.2 (and/or the EXT_texture3D extension) defines the 3D texture
        target. The ARB_texture_cube_map extension defines the cube map texture target. Each texture unit's texture coordinate set is mapped to a color using
        the unit's highest priority enabled texture target.

        This extension introduces texture shader stages. A sequence of texture shader stages provides a more flexible mechanism for mapping sets of texture
        coordinates to texture unit RGBA results than standard OpenGL.

        When the texture shader enable is on, the extension replaces the conventional OpenGL mechanism for mapping sets of texture coordinates to filtered
        colors with this extension's sequence of texture shader stages. 

        Each texture shader stage runs one of 21 canned texture shader programs. These programs support conventional OpenGL texture mapping but also support
        dependent texture accesses, dot product texture programs, and special modes. (3D texture mapping texture shader operations are NOT provided by this
        extension; 3D texture mapping texture shader operations are added by the NV_texture_shader2 extension that is layered on this extension. See the
        NV_texture_shader2 specification.)

        To facilitate the new texture shader programs, this extension introduces several new texture formats and variations on existing formats. Existing color
        texture formats are extended by introducing new signed variants. Two new types of texture formats (beyond colors) are also introduced. Texture offset
        groups encode two signed offsets, and optionally a magnitude or a magnitude and an intensity. The new HILO (pronounced high-low) formats provide
        possibly signed, high precision (16-bit) two-component textures.

        Each program takes as input the stage's interpolated texture coordinate set (s,t,r,q). Each program generates two results: a shader stage result that
        may be used as an input to subsequent shader stage programs, and a texture unit RGBA result that becomes the texture color used by the texture unit's
        texture environment function or becomes the initial value for the corresponding texture register for register combiners. The texture unit RGBA result
        is always an RGBA color, but the shader stage result may be one of an RGBA color, a HILO value, a texture offset group, a floating-point value, or an
        invalid result. When both results are RGBA colors, the shader stage result and the texture unit RGBA result are usually identical (though not in all
        cases).

        Additionally, certain programs have a side-effect such as culling the fragment or replacing the fragment's depth value.
        
        Requires ${ARB_multitexture.link} and ${ARB_texture_cube_map.link}.
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev, and by the {@code target} parameter of TexEnvf, TexEnvfv, TexEnvi, TexEnviv, GetTexEnvfv, and GetTexEnviv.
        """,

        "TEXTURE_SHADER_NV"..0x86DE
    )

    IntConstant(
        """
        When the {@code target} parameter of TexEnvf, TexEnvfv, TexEnvi, TexEnviv, GetTexEnvfv, and GetTexEnviv is TEXTURE_SHADER_NV, then the value of
        {@code pname} may be.
        """,

        "RGBA_UNSIGNED_DOT_PRODUCT_MAPPING_NV"..0x86D9,
        "SHADER_OPERATION_NV"..0x86DF,
        "OFFSET_TEXTURE_SCALE_NV"..0x86E2,
        "OFFSET_TEXTURE_BIAS_NV"..0x86E3,
        "PREVIOUS_TEXTURE_INPUT_NV"..0x86E4
    )

    IntConstant(
        "When the {@code target} parameter of TexEnvfv, TexEnviv, GetTexEnvfv, and GetTexEnviv is TEXTURE_SHADER_NV, then the value of {@code pname} may be.",

        "CULL_MODES_NV"..0x86E0,
        "OFFSET_TEXTURE_MATRIX_NV"..0x86E1,
        "CONST_EYE_NV"..0x86E5
    )

    IntConstant(
        "When the {@code target} parameter GetTexEnvfv and GetTexEnviv is TEXTURE_SHADER_NV, then the value of {@code pname} may be.",

        "SHADER_CONSISTENT_NV"..0x86DD
    )

    IntConstant(
        """
        When the {@code target} and {@code pname} parameters of TexEnvf, TexEnvfv, TexEnvi, and TexEnviv are TEXTURE_SHADER_NV and SHADER_OPERATION_NV
        respectively, then the value of {@code param} or the value pointed to by {@code params} may be.
        """,

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
        "Accepted by the {@code format} parameter of GetTexImage, TexImage1D, TexImage2D, TexSubImage1D, and TexSubImage2D.",

        "HILO_NV"..0x86F4,
        "DSDT_NV"..0x86F5,
        "DSDT_MAG_NV"..0x86F6,
        "DSDT_MAG_VIB_NV"..0x86F7
    )

    IntConstant(
        "Accepted by the {@code type} parameter of GetTexImage, TexImage1D, TexImage2D, TexSubImage1D, and TexSubImage2D.",

        "UNSIGNED_INT_S8_S8_8_8_NV"..0x86DA,
        "UNSIGNED_INT_8_8_S8_S8_REV_NV"..0x86DB
    )

    IntConstant(
        "Accepted by the {@code internalformat} parameter of CopyTexImage1D, CopyTexImage2D, TexImage1D, and TexImage2D.",

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
        "Accepted by the {@code internalformat} parameter of TexImage1D and TexImage2D.",

        "HILO16_NV"..0x86F8,
        "SIGNED_HILO_NV"..0x86F9,
        "SIGNED_HILO16_NV"..0x86FA,
        "DSDT8_NV"..0x8709,
        "DSDT8_MAG8_NV"..0x870A,
        "DSDT_MAG_INTENSITY_NV"..0x86DC,
        "DSDT8_MAG8_INTENSITY8_NV"..0x870B
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, PixelTransferf, and PixelTransferi.",

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
        "Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, GetTexParameterfv and GetTexParameteriv.",

        "TEXTURE_BORDER_VALUES_NV"..0x871A
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv.",

        "TEXTURE_HI_SIZE_NV"..0x871B,
        "TEXTURE_LO_SIZE_NV"..0x871C,
        "TEXTURE_DS_SIZE_NV"..0x871D,
        "TEXTURE_DT_SIZE_NV"..0x871E,
        "TEXTURE_MAG_SIZE_NV"..0x871F
    )
}
