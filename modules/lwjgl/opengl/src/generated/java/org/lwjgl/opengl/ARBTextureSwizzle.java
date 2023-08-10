/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_swizzle.txt">ARB_texture_swizzle</a> extension.
 * 
 * <p>Classic OpenGL texture formats conflate texture storage and interpretation, and assume that textures represent color. In modern applications, a
 * significant quantity of textures don't represent color, but rather data like shadow maps, normal maps, page tables, occlusion data, etc. For the latter
 * class of data, calling the data "RGBA" is just a convenient mapping of what the data is onto the current model, but isn't an accurate reflection of the
 * reality of the data.</p>
 * 
 * <p>The existing texture formats provide an almost orthogonal set of data types, sizes, and number of components, but the mappings of this storage into what
 * the shader or fixed-function pipeline fetches is very much non-orthogonal. Previous extensions have added some of the most demanded missing formats, but
 * the problem has not been solved once and for all.</p>
 * 
 * <p>This extension provides a mechanism to swizzle the components of a texture before they are applied according to the texture environment in
 * fixed-function or as they are returned to the shader.</p>
 * 
 * <p>Promoted to core in {@link GL33 OpenGL 3.3}.</p>
 */
public final class ARBTextureSwizzle {

    /** Accepted by the {@code pname} parameters of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameterfv, and GetTexParameteriv. */
    public static final int
        GL_TEXTURE_SWIZZLE_R = 0x8E42,
        GL_TEXTURE_SWIZZLE_G = 0x8E43,
        GL_TEXTURE_SWIZZLE_B = 0x8E44,
        GL_TEXTURE_SWIZZLE_A = 0x8E45;

    /** Accepted by the {@code pname} parameters of TexParameteriv, TexParameterfv, GetTexParameterfv, and GetTexParameteriv. */
    public static final int GL_TEXTURE_SWIZZLE_RGBA = 0x8E46;

    private ARBTextureSwizzle() {}

}