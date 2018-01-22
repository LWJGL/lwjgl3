/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_texture_cube_map_array = "OESTextureCubeMapArray".nativeClassGLES("OES_texture_cube_map_array", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        OpenGL ES 3.1 supports two-dimensional array textures. An array texture is an ordered set of images with the same size and format. Each image in an
        array texture has a unique level. This extension expands texture array support to include cube map textures.

        A cube map array texture is a two-dimensional array texture that may contain many cube map layers. Each cube map layer is a unique cube map image set.
        Images in a cube map array have the same size and format limitations as two-dimensional array textures. A cube map array texture is specified using
        TexImage3D or TexStorage3D in a similar manner to two-dimensional arrays. Cube map array textures can be bound to a render targets of a frame buffer
        object just as two-dimensional arrays are, using FramebufferTextureLayer.

        When accessed by a shader, a cube map array texture acts as a single unit. The "s", "t", "r" texture coordinates are treated as a regular cube map
        texture fetch. The "q" texture is treated as an unnormalized floating-point value identifying the layer of the cube map array texture. Cube map array
        texture lookups do not filter between layers.

        Requires ${GLES31.core} and ${OES_geometry_shader.link} or ${EXT_geometry_shader.link}.
        """

    IntConstant(
        """
        Accepted by the {@code target} parameter of TexParameter{if}, TexParameter{if}v, TexParameterI{i ui}vOES, BindTexture, GenerateMipmap, TexImage3D,
        TexSubImage3D, TexStorage3D, GetTexParameter{if}v, GetTexParameter{i ui}vOES, GetTexLevelParameter{if}v, CompressedTexImage3D, CompressedTexSubImage3D
        and CopyTexSubImage3D.
        """,

        "TEXTURE_CUBE_MAP_ARRAY_OES"..0x9009
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv and GetFloatv.",

        "TEXTURE_BINDING_CUBE_MAP_ARRAY_OES"..0x900A
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform, and by the {@code params} parameter of GetProgramResourceiv when {@code props} is TYPE.",

        "SAMPLER_CUBE_MAP_ARRAY_OES"..0x900C,
        "SAMPLER_CUBE_MAP_ARRAY_SHADOW_OES"..0x900D,
        "INT_SAMPLER_CUBE_MAP_ARRAY_OES"..0x900E,
        "UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_OES"..0x900F,
        "IMAGE_CUBE_MAP_ARRAY_OES"..0x9054,
        "INT_IMAGE_CUBE_MAP_ARRAY_OES"..0x905F,
        "UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY_OES"..0x906A
    )
}