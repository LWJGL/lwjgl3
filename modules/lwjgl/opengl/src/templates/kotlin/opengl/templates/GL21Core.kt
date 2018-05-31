/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL21C = "GL21C".nativeClassGL("GL21C") {
    extends = GL20C
    documentation =
        """
        The OpenGL functionality of a forward compatible context, up to version 2.1.

        OpenGL 2.1 implementations must support at least revision 1.20 of the OpenGL Shading Language.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "pixel_buffer_object"),
            registryLinkTo("EXT", "texture_sRGB")
        )}
        """

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "FLOAT_MAT2x3"..0x8B65,
        "FLOAT_MAT2x4"..0x8B66,
        "FLOAT_MAT3x2"..0x8B67,
        "FLOAT_MAT3x4"..0x8B68,
        "FLOAT_MAT4x2"..0x8B69,
        "FLOAT_MAT4x3"..0x8B6A
    )

    void(
        "UniformMatrix2x3fv",
        "Specifies the value of a single mat2x3 uniform variable or a mat2x3 uniform variable array for the current program object.",

        GLint.IN("location", "the location of the uniform variable to be modified"),
        AutoSize(2 x 3, "value")..GLsizei.IN("count", "the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices."),
        GLboolean.IN("transpose", "whether to transpose the matrix as the values are loaded into the uniform variable"),
        GLfloat.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "UniformMatrix3x2fv",
        "Specifies the value of a single mat3x2 uniform variable or a mat3x2 uniform variable array for the current program object.",

        GLint.IN("location", "the location of the uniform variable to be modified"),
        AutoSize(3 x 2, "value")..GLsizei.IN("count", "the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices."),
        GLboolean.IN("transpose", "whether to transpose the matrix as the values are loaded into the uniform variable"),
        GLfloat.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "UniformMatrix2x4fv",
        "Specifies the value of a single mat2x4 uniform variable or a mat2x4 uniform variable array for the current program object.",

        GLint.IN("location", "the location of the uniform variable to be modified"),
        AutoSize(2 x 4, "value")..GLsizei.IN("count", "the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices."),
        GLboolean.IN("transpose", "whether to transpose the matrix as the values are loaded into the uniform variable"),
        GLfloat.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "UniformMatrix4x2fv",
        "Specifies the value of a single mat4x2 uniform variable or a mat4x2 uniform variable array for the current program object.",

        GLint.IN("location", "the location of the uniform variable to be modified"),
        AutoSize(4 x 2, "value")..GLsizei.IN("count", "the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices."),
        GLboolean.IN("transpose", "whether to transpose the matrix as the values are loaded into the uniform variable"),
        GLfloat.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "UniformMatrix3x4fv",
        "Specifies the value of a single mat3x4 uniform variable or a mat3x4 uniform variable array for the current program object.",

        GLint.IN("location", "the location of the uniform variable to be modified"),
        AutoSize(3 x 4, "value")..GLsizei.IN("count", "the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices."),
        GLboolean.IN("transpose", "whether to transpose the matrix as the values are loaded into the uniform variable"),
        GLfloat.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "UniformMatrix4x3fv",
        "Specifies the value of a single mat4x3 uniform variable or a mat4x3 uniform variable array for the current program object.",

        GLint.IN("location", "the location of the uniform variable to be modified"),
        AutoSize(4 x 3, "value")..GLsizei.IN("count", "the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices."),
        GLboolean.IN("transpose", "whether to transpose the matrix as the values are loaded into the uniform variable"),
        GLfloat.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    // ARB_pixel_buffer_object

    IntConstant(
        """
        Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferParameteriv, and
        GetBufferPointerv.
        """,

        "PIXEL_PACK_BUFFER"..0x88EB,
        "PIXEL_UNPACK_BUFFER"..0x88EC
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "PIXEL_PACK_BUFFER_BINDING"..0x88ED,
        "PIXEL_UNPACK_BUFFER_BINDING"..0x88EF
    )

    // EXT_texture_sRGB

    IntConstant(
        "Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D.",

        "SRGB"..0x8C40,
        "SRGB8"..0x8C41,
        "SRGB_ALPHA"..0x8C42,
        "SRGB8_ALPHA8"..0x8C43,
        "COMPRESSED_SRGB"..0x8C48,
        "COMPRESSED_SRGB_ALPHA"..0x8C49
    )
}