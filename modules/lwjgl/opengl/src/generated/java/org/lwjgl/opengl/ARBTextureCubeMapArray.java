/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_cube_map_array.txt">ARB_texture_cube_map_array</a> extension.
 * 
 * <p>The {@link EXTTextureArray EXT_texture_array} extension, and subsequently OpenGL 3.0 have introduced the concept of one- and two-dimensional array textures. An array
 * texture is an ordered set of images with the same size and format. Each image in an array texture has a unique level. This extension expands texture
 * array support to include cube map textures.</p>
 * 
 * <p>A cube map array texture is a 2-dimensional array texture that may contain many cube map layers. Each cube map layer is a unique cube map image set.
 * Images in a cube map array have the same size and format limitations as one- and two-dimensional array textures. A cube map array texture is specified
 * using {@link GL12C#glTexImage3D TexImage3D} in a similar manner to two-dimensional arrays. Cube map array textures can be bound to a render targets of a frame buffer object
 * as two-dimensional arrays are using FramebufferTextureLayer.</p>
 * 
 * <p>When accessed by a programmable shader, a cube map array texture acts as a single unit. The "s", "t", "r" texture coordinates are treated as a regular
 * cube map texture fetch. The "q" texture is treated as an unnormalized floating-point value identifying the layer of the cube map array texture. Cube map
 * array texture lookups do not filter between layers.</p>
 * 
 * <p>This extension does not provide for the use of cube map array textures with fixed-function fragment processing.</p>
 * 
 * <p>Promoted to core in {@link GL40 OpenGL 4.0}.</p>
 */
public final class ARBTextureCubeMapArray {

    /** Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, BindTexture, and GenerateMipmap. */
    public static final int GL_TEXTURE_CUBE_MAP_ARRAY_ARB = 0x9009;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv. */
    public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY_ARB = 0x900A;

    /** Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CompressedTeximage3D, CompressedTexSubImage3D and CopyTexSubImage3D. */
    public static final int GL_PROXY_TEXTURE_CUBE_MAP_ARRAY_ARB = 0x900B;

    /** TEXTURE_CUBE_MAP_ARRAY_ARB Returned by the {@code type} parameter of GetActiveUniform. */
    public static final int
        GL_SAMPLER_CUBE_MAP_ARRAY_ARB              = 0x900C,
        GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW_ARB       = 0x900D,
        GL_INT_SAMPLER_CUBE_MAP_ARRAY_ARB          = 0x900E,
        GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_ARB = 0x900F;

    private ARBTextureCubeMapArray() {}

}