/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val APPLE_rgb_422 = "APPLERGB422".nativeClassGLES("APPLE_rgb_422", postfix = APPLE) {
    documentation =
        """
        Native bindings to the ${registryLink("APPLE", "rgb_422")} extension.

        A common storage format for video data is 8-bit 422, with every four bytes encoding two pixels. Within the four bytes there are two luminance samples,
        and two chrominance samples that are shared between both pixels.

        There is a previous extension, namely GL_APPLE_ycbcr_422 that provided transparent support for this kind of data. However, that extension left the
        exact conversion from Y'CbCr to RGB undefined. In reality, it really had always been based on the ITU-R BT.601 standard, which meant it was not
        particularly useful for dealing with high definition video data, which is encoded using the Rec. 709 standard.

        In some cases the original extension was implemented via fixed function hardware, but on more modern graphics processors this is done via a combination
        of 422 sampling formats and fragment shader instructions.

        This extension essentially exposes a "raw" 422 texture format that allows developers to access the raw pre-converted Y'CbCr components so that they
        have full control over the colorspace conversion.

        In order to avoid defining entirely new color channels within GL, the Y, Cb and Cr color channels within the 422 data are mapped into the existing
        green, blue and red color channels, respectively. Developers must write their own fragment shader/program to perform the desired color space
        transformation.

        Note: Because of the use of the packed UNSIGNED_SHORT_8_8[_REV] types, the correct type to use based on the layout of the data in memory (Cb Y Cr Y
        versus Y Cb Y Cr) will necessarily be sensitive to host endianness.

        This extension differs from the EXT_422_pixels extension in a couple of ways. First, this extension defines only a single new format, while relying on
        two new type arguments to differentiate between the two component orderings. Second, this extension provides no defined method of filtering the chroma
        values between adjacent pixels. And lastly, the color channel assignments are slightly different, essentially to match more closely the rough meanings
        of the Y, Cb and Cr values in 422 video data.

        Requires ${GLES20.core}.
        """

    IntConstant(
        """
        Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
        TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, GetConvolutionFilter, SeparableFilter2D, GetSeparableFilter,
        ColorTable, and GetColorTable.
        """,

        "RGB_422_APPLE"..0x8A1F
    )

    IntConstant(
        "Accepted by the {@code internalformat} parameter of TexImage2D, TexImage3D, CopyTexImage2D, TexStorage2D, and TexStorage3D.",

        "RGB_RAW_422_APPLE"..0x8A51
    )

    IntConstant(
        """
        Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
        TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, GetConvolutionFilter, SeparableFilter2D, GetSeparableFilter,
        ColorTable, and GetColorTable.
        """,

        "UNSIGNED_SHORT_8_8_APPLE"..0x85BA,
        "UNSIGNED_SHORT_8_8_REV_APPLE"..0x85BB
    )
}