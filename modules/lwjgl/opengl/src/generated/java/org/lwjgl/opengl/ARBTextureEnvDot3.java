/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_env_dot3.txt">ARB_texture_env_dot3</a> extension.
 * 
 * <p>Adds new dot product operation to the texture combiner operations.</p>
 * 
 * <p>Requires {@link ARBMultitexture ARB_multitexture} and {@link ARBTextureEnvCombine ARB_texture_env_combine}. Promoted to core in {@link GL13 OpenGL 1.3}.</p>
 */
public final class ARBTextureEnvDot3 {

    /** Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is COMBINE_RGB_ARB. */
    public static final int
        GL_DOT3_RGB_ARB  = 0x86AE,
        GL_DOT3_RGBA_ARB = 0x86AF;

    private ARBTextureEnvDot3() {}

}