/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_cube_map_array.txt">EXT_texture_cube_map_array</a> extension.
 * 
 * <p>OpenGL ES 3.1 supports two-dimensional array textures. An array texture is an ordered set of images with the same size and format. Each image in an
 * array texture has a unique level. This extension expands texture array support to include cube map textures.</p>
 * 
 * <p>A cube map array texture is a two-dimensional array texture that may contain many cube map layers. Each cube map layer is a unique cube map image set.
 * Images in a cube map array have the same size and format limitations as two-dimensional array textures. A cube map array texture is specified using
 * TexImage3D or TexStorage3D in a similar manner to two-dimensional arrays. Cube map array textures can be bound to a render targets of a frame buffer
 * object just as two-dimensional arrays are, using FramebufferTextureLayer.</p>
 * 
 * <p>When accessed by a shader, a cube map array texture acts as a single unit. The "s", "t", "r" texture coordinates are treated as a regular cube map
 * texture fetch. The "q" texture is treated as an unnormalized floating-point value identifying the layer of the cube map array texture. Cube map array
 * texture lookups do not filter between layers.</p>
 * 
 * <p>Requires {@link GLES31 GLES 3.1}.</p>
 */
public final class EXTTextureCubeMapArray {

    /**
     * Accepted by the {@code target} parameter of TexParameter{if}, TexParameter{if}v, TexParameterI{i ui}vEXT, BindTexture, GenerateMipmap, TexImage3D,
     * TexSubImage3D, TexStorage3D, GetTexParameter{if}v, GetTexParameter{i ui}vEXT, GetTexLevelParameter{if}v, CompressedTexImage3D, CompressedTexSubImage3D
     * and CopyTexSubImage3D.
     */
    public static final int GL_TEXTURE_CUBE_MAP_ARRAY_EXT = 0x9009;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv and GetFloatv. */
    public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY_EXT = 0x900A;

    /** Returned by the {@code type} parameter of GetActiveUniform, and by the {@code params} parameter of GetProgramResourceiv when {@code props} is TYPE. */
    public static final int
        GL_SAMPLER_CUBE_MAP_ARRAY_EXT              = 0x900C,
        GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW_EXT       = 0x900D,
        GL_INT_SAMPLER_CUBE_MAP_ARRAY_EXT          = 0x900E,
        GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_EXT = 0x900F,
        GL_IMAGE_CUBE_MAP_ARRAY_EXT                = 0x9054,
        GL_INT_IMAGE_CUBE_MAP_ARRAY_EXT            = 0x905F,
        GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY_EXT   = 0x906A;

    private EXTTextureCubeMapArray() {}

}