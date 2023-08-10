/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_depth_texture_cube_map.txt">OES_depth_texture_cube_map</a> extension.
 * 
 * <p>This extension extends OES_depth_texture and OES_packed_depth_stencil to support depth and depth-stencil cube-map textures.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0} and <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_depth_texture.txt">OES_depth_texture</a>.</p>
 */
public final class OESDepthTextureCubeMap {

    /**
     * Accepted by the {@code format} parameter of TexImage2D and TexSubImage2D and {@code internalFormat} parameter of TexImage2D when {@code target} is one
     * of the TEXTURE_CUBE_MAP_ targets.
     */
    public static final int GL_DEPTH_STENCIL_OES = 0x84F9;

    /** Accepted by the {@code type} parameter of TexImage2D, TexSubImage2D when {@code target} is one of the TEXTURE_CUBE_MAP_ targets. */
    public static final int GL_DEPTH24_STENCIL8_OES = 0x88F0;

    private OESDepthTextureCubeMap() {}

}