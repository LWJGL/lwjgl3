/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_compressed_paletted_texture.txt">OES_compressed_paletted_texture</a> extension.
 * 
 * <p>The goal of this extension is to allow direct support of palettized textures in OpenGL ES.</p>
 * 
 * <p>Palettized textures are implemented in OpenGL ES using the CompressedTexImage2D call. The definition of the following parameters "level" and
 * "internalformat" in the CompressedTexImage2D call have been extended to support paletted textures.</p>
 */
public final class OESCompressedPalettedTexture {

    /** Accepted by the {@code internalformat} paramter of CompressedTexImage2D. */
    public static final int
        GL_PALETTE4_RGB8_OES     = 0x8B90,
        GL_PALETTE4_RGBA8_OES    = 0x8B91,
        GL_PALETTE4_R5_G6_B5_OES = 0x8B92,
        GL_PALETTE4_RGBA4_OES    = 0x8B93,
        GL_PALETTE4_RGB5_A1_OES  = 0x8B94,
        GL_PALETTE8_RGB8_OES     = 0x8B95,
        GL_PALETTE8_RGBA8_OES    = 0x8B96,
        GL_PALETTE8_R5_G6_B5_OES = 0x8B97,
        GL_PALETTE8_RGBA4_OES    = 0x8B98,
        GL_PALETTE8_RGB5_A1_OES  = 0x8B99;

    private OESCompressedPalettedTexture() {}

}