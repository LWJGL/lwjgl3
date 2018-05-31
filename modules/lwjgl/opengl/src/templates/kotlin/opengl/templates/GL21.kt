/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL21 = "GL21".nativeClassGL("GL21") {
    extends = GL20
    documentation =
        """
        The OpenGL functionality up to version 2.1. Includes the deprecated symbols of the Compatibility Profile.

        OpenGL 2.1 implementations must support at least revision 1.20 of the OpenGL Shading Language.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "pixel_buffer_object"),
            registryLinkTo("EXT", "texture_sRGB")
        )}
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "CURRENT_RASTER_SECONDARY_COLOR"..0x845F
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "FLOAT_MAT2x3"..0x8B65,
        "FLOAT_MAT2x4"..0x8B66,
        "FLOAT_MAT3x2"..0x8B67,
        "FLOAT_MAT3x4"..0x8B68,
        "FLOAT_MAT4x2"..0x8B69,
        "FLOAT_MAT4x3"..0x8B6A
    )

    GL21C reuse "UniformMatrix2x3fv"
    GL21C reuse "UniformMatrix3x2fv"
    GL21C reuse "UniformMatrix2x4fv"
    GL21C reuse "UniformMatrix4x2fv"
    GL21C reuse "UniformMatrix3x4fv"
    GL21C reuse "UniformMatrix4x3fv"

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
        "SLUMINANCE_ALPHA"..0x8C44,
        "SLUMINANCE8_ALPHA8"..0x8C45,
        "SLUMINANCE"..0x8C46,
        "SLUMINANCE8"..0x8C47,
        "COMPRESSED_SRGB"..0x8C48,
        "COMPRESSED_SRGB_ALPHA"..0x8C49,
        "COMPRESSED_SLUMINANCE"..0x8C4A,
        "COMPRESSED_SLUMINANCE_ALPHA"..0x8C4B
    )
}