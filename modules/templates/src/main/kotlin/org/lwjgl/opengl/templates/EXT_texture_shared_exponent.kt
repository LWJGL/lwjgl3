/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_texture_shared_exponent = "EXTTextureSharedExponent".nativeClassGL("EXT_texture_shared_exponent", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Existing texture formats provide either fixed-point formats with limited range and precision but with compact encodings (allowing 32 or fewer bits per
        multi-component texel), or floating-point formats with tremendous range and precision but without compact encodings (typically 16 or 32 bits per
        component).

        This extension adds a new packed format and new internal texture format for encoding 3-component vectors (typically RGB colors) with a single 5-bit
        exponent (biased up by 15) and three 9-bit mantissas for each respective component. There is no sign bit so all three components must be non-negative.
        The fractional mantissas are stored without an implied 1 to the left of the decimal point. Neither infinity nor not-a-number (NaN) are representable in
        this shared exponent format.

        This 32 bits/texel shared exponent format is particularly well-suited to high dynamic range (HDR) applications where light intensity is typically stored
        as non-negative red, green, and blue components with considerable range.

        ${GL30.promoted}
        """

    IntConstant(
        "Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorageEXT.",

        "RGB9_E5_EXT"..0x8C3D
    )

    IntConstant(
        """
        Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
        TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
        GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
        """,

        "UNSIGNED_INT_5_9_9_9_REV_EXT"..0x8C3E
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv.",

        "TEXTURE_SHARED_SIZE_EXT"..0x8C3F
    )
}