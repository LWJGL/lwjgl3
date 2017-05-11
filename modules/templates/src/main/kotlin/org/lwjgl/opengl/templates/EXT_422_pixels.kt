/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_422_pixels = "EXT422Pixels".nativeClassGL("EXT_422_pixels", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides support for converting 422 pixels in host memory to 444 pixels as part of the pixel storage operation.

        The pixel unpack storage operation treats a 422 pixel as a 2 element format where the first element is C (chrominance) and the second element is L
        (luminance). Luminance is present on all pixels; a full chrominance value requires two pixels.

        The pixel pack storage operation converts RGB to a 422 pixel defined as a 2 element format where the first element stored is C (chrominance) and the
        second element stored is L (luminance). Luminance is present on all pixels; a full chrominance value requires two pixels.

        Both averaging and non-averaging is supported for green and blue assignments for pack and unpack operations.
        """

    IntConstant(
        """
        Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
        TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
        SeparableFilter3D, GetSeparableFilter, ColorTable, and GetColorTable.
        """,

        "422_EXT"..0x80CC,
        "422_REV_EXT"..0x80CD,
        "422_AVERAGE_EXT"..0x80CE,
        "422_REV_AVERAGE_EXT"..0x80CF
    )
}