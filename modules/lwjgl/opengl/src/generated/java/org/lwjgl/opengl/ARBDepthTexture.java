/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_depth_texture.txt">ARB_depth_texture</a> extension.
 * 
 * <p>This extension defines a new depth texture format. An important application of depth texture images is shadow casting, but separating this from the
 * shadow extension allows for the potential use of depth textures in other applications such as image-based rendering or displacement mapping. This
 * extension does not define new depth-texture environment functions, such as filtering or applying the depth values computed from a texture but leaves
 * this to other extensions, such as the shadow extension.</p>
 * 
 * <p>Promoted to core in {@link GL14 OpenGL 1.4}.</p>
 */
public final class ARBDepthTexture {

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, CopyTexImage1D and CopyTexImage2D. */
    public static final int
        GL_DEPTH_COMPONENT16_ARB = 0x81A5,
        GL_DEPTH_COMPONENT24_ARB = 0x81A6,
        GL_DEPTH_COMPONENT32_ARB = 0x81A7;

    /** Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv. */
    public static final int GL_TEXTURE_DEPTH_SIZE_ARB = 0x884A;

    /** Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv. */
    public static final int GL_DEPTH_TEXTURE_MODE_ARB = 0x884B;

    private ARBDepthTexture() {}

}