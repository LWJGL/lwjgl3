/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/3DFX/3DFX_texture_compression_FXT1.txt">3DFX_texture_compression_FXT1</a> extension.
 * 
 * <p>This extension additional texture compression functionality's FXT1 format, specific to 3dfxsubject to all the requirements and limitations described by
 * the extension {@code GL_ARB_texture_compression}. The FXT1 texture format supports only 2D and 3D images without borders.</p>
 * 
 * <p>Because 3dfx expects to make continual improvement to its FXT1 compressor implementation, 3dfx recommends that to achieve best visual quality
 * applications adopt the following procedure with respect to reuse of textures compressed by the GL:</p>
 * 
 * <ol>
 * <li>Save the RENDERER and VERSION strings along with images compressed by the GL;</li>
 * <li>Before reuse of the textures, compare the stored strings with strings newly returned from the current GL;</li>
 * <li>If out-of-date, repeat the compression and storage steps.</li>
 * </ol>
 * 
 * <p>Requires {@link ARBTextureCompression ARB_texture_compression}.</p>
 */
public final class _3DFXTextureCompressionFXT1 {

    /**
     * Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, TexImage3D, CopyTexImage3D, and by the {@code internalformat} and
     * {@code format} parameters of CompressedTexImage2D_ARB, CompressedTexSubImage2D_ARB, CompressedTexImage3D_ARB, CompressedTexSubImage3D_ARB.
     */
    public static final int
        GL_COMPRESSED_RGB_FXT1_3DFX  = 0x86B0,
        GL_COMPRESSED_RGBA_FXT1_3DFX = 0x86B1;

    private _3DFXTextureCompressionFXT1() {}

}