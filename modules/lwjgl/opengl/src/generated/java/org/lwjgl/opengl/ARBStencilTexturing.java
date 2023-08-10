/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_stencil_texturing.txt">ARB_stencil_texturing</a> extension.
 * 
 * <p>This extension allows texturing of the stencil component of a packed depth stencil texture. Stencil values are returned as unsigned integers. It is not
 * possible to sample both depth and stencil values from the same texture, and this extension allows the app to select which is sampled for the bound
 * texture.</p>
 * 
 * <p>Requires {@link ARBDepthTexture ARB_depth_texture} and {@link EXTPackedDepthStencil EXT_packed_depth_stencil}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public final class ARBStencilTexturing {

    /** Accepted by the {@code pname} parameter of TexParameter and GetTexParameter*. */
    public static final int GL_DEPTH_STENCIL_TEXTURE_MODE = 0x90EA;

    private ARBStencilTexturing() {}

}