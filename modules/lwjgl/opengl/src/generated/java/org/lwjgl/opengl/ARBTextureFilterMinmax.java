/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_filter_minmax.txt">ARB_texture_filter_minmax</a> extension.
 * 
 * <p>In unextended OpenGL, minification and magnification filters such as {@link GL11#GL_LINEAR LINEAR} allow texture lookups to returned a filtered texel value produced by
 * computing an weighted average of a collection of texels in the neighborhood of the texture coordinate provided.</p>
 * 
 * <p>This extension provides a new texture and sampler parameter ({@link #GL_TEXTURE_REDUCTION_MODE_ARB TEXTURE_REDUCTION_MODE_ARB}) which allows applications to produce a filtered texel value
 * by computing a component-wise minimum ({@link GL14#GL_MIN MIN}) or maximum ({@link GL14#GL_MAX MAX}) of the texels that would normally be averaged. The reduction mode is orthogonal
 * to the minification and magnification filter parameters. The filter parameters are used to identify the set of texels used to produce a final filtered
 * value; the reduction mode identifies how these texels are combined.</p>
 * 
 * <p>Requires {@link GL33 OpenGL 3.3}.</p>
 */
public final class ARBTextureFilterMinmax {

    /**
     * Accepted by the {@code pname} parameter to SamplerParameter{i f}{v}, SamplerParameterI{u}iv, GetSamplerParameter{i f}v, GetSamplerParameterI{u}iv,
     * TexParameter{i f}{v}, TexParameterI{u}iv, GetTexParameter{i f}v, GetTexParameterI{u}iv, TextureParameter{i f}{v}, TextureParameterI{u}iv,
     * GetTextureParameter{i f}v, and GetTextureParameterI{u}iv.
     */
    public static final int GL_TEXTURE_REDUCTION_MODE_ARB = 0x9366;

    /**
     * Accepted by the {@code param} or {@code params} parameter to SamplerParameter{i f}{v}, SamplerParameterI{u}iv, TexParameter{i f}{v}, TexParameterI{u}iv,
     * TextureParameter{i f}{v}, and TextureParameterI{u}iv when {@code pname} is TEXTURE_REDUCTION_MODE_ARB.
     */
    public static final int GL_WEIGHTED_AVERAGE_ARB = 0x9367;

    private ARBTextureFilterMinmax() {}

}