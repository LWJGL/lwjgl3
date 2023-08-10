/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_sRGB_R8.txt">EXT_texture_sRGB_R8</a> extension.
 * 
 * <p>This extension introduces {@link #GL_SR8_EXT SR8_EXT} as an acceptable internal format. This allows efficient sRGB sampling for source images stored as a separate texture
 * per channel.</p>
 * 
 * <p>Requires {@link GL12 OpenGL 1.2}.</p>
 */
public final class EXTTextureSRGBR8 {

    /**
     * Accepted by the {@code internalformat} parameters of {@link GL12C#glTexImage3D TexImage3D}, {@link GL11C#glTexImage2D TexImage2D}, {@link GL11C#glTexImage1D TexImage1D}, {@link GL42C#glTexStorage3D TexStorage3D}, {@link GL42C#glTexStorage2D TexStorage2D}, {@link GL42C#glTexStorage1D TexStorage1D},
     * {@link GL45C#glTextureStorage3D TextureStorage3D}, {@link GL45C#glTextureStorage2D TextureStorage2D}, and {@link GL45C#glTextureStorage1D TextureStorage1D}.
     */
    public static final int GL_SR8_EXT = 0x8FBD;

    private EXTTextureSRGBR8() {}

}