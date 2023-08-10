/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_mirror_clamp_to_edge.txt">EXT_texture_mirror_clamp_to_edge</a> extension.
 * 
 * <p>{@code EXT_texture_mirror_clamp_to_edge} extends the set of texture wrap modes to include an additional mode ({@link #GL_MIRROR_CLAMP_TO_EDGE_EXT MIRROR_CLAMP_TO_EDGE_EXT}) that
 * effectively uses a texture map twice as large as the original image in which the additional half of the new image is a mirror image of the original
 * image.</p>
 * 
 * <p>This new mode relaxes the need to generate images whose opposite edges match by using the original image to generate a matching "mirror image". This
 * mode allows the texture to be mirrored only once in the negative s, t, and r directions.</p>
 */
public final class EXTTextureMirrorClampToEdge {

    /**
     * Accepted by the {@code param} parameter of TexParameter{if}, SamplerParameter{if} and SamplerParameter{if}v, and by the {@code params} parameter of
     * TexParameter{if}v, TexParameterI{i ui}v and SamplerParameterI{i ui}v when their {@code pname} parameter is {@link GLES20#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}, {@link GLES20#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}, or
     * {@link GLES30#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}.
     */
    public static final int GL_MIRROR_CLAMP_TO_EDGE_EXT = 0x8743;

    private EXTTextureMirrorClampToEdge() {}

}