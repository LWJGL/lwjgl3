/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_422_pixels.txt">EXT_422_pixels</a> extension.
 * 
 * <p>This extension provides support for converting 422 pixels in host memory to 444 pixels as part of the pixel storage operation.</p>
 * 
 * <p>The pixel unpack storage operation treats a 422 pixel as a 2 element format where the first element is C (chrominance) and the second element is L
 * (luminance). Luminance is present on all pixels; a full chrominance value requires two pixels.</p>
 * 
 * <p>The pixel pack storage operation converts RGB to a 422 pixel defined as a 2 element format where the first element stored is C (chrominance) and the
 * second element stored is L (luminance). Luminance is present on all pixels; a full chrominance value requires two pixels.</p>
 * 
 * <p>Both averaging and non-averaging is supported for green and blue assignments for pack and unpack operations.</p>
 */
public final class EXT422Pixels {

    /**
     * Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
     * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
     * SeparableFilter3D, GetSeparableFilter, ColorTable, and GetColorTable.
     */
    public static final int
        GL_422_EXT             = 0x80CC,
        GL_422_REV_EXT         = 0x80CD,
        GL_422_AVERAGE_EXT     = 0x80CE,
        GL_422_REV_AVERAGE_EXT = 0x80CF;

    private EXT422Pixels() {}

}