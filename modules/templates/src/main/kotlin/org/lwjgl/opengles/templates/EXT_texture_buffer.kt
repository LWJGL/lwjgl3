/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_texture_buffer = "EXTTextureBuffer".nativeClassGLES("EXT_texture_buffer", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a new texture type, called a buffer texture. Buffer textures are one-dimensional arrays of texels whose storage comes from an
        attached buffer object. When a buffer object is bound to a buffer texture, a format is specified, and the data in the buffer object is treated as an
        array of texels of the specified format.

        The use of a buffer object to provide storage allows the texture data to be specified in a number of different ways: via buffer object loads
        (BufferData), direct CPU writes (MapBuffer), or framebuffer readbacks to pixel buffer objects (ReadPixels). A buffer object can also be loaded by
        transform feedback, which captures selected transformed attributes of vertices processed by the GL. Several of these mechanisms do not require an extra
        data copy, which would be required when using conventional TexImage-like entry points.

        Buffer textures do not support mipmapping, texture lookups with normalized floating-point texture coordinates, and texture filtering of any sort. They
        can be accessed via single texel fetch operations in programmable shaders, using a new sampler type and texel fetch function, and access can be
        controlled using the same memory barrier operations as for other texture types.

        Buffer textures are treated as (potentially large) one-dimensional textures; the maximum texture size supported for buffer textures in the initial
        implementation of this extension is 2<sup>27</sup> texels (note that this extension only guarantees support for buffer textures with 2<sup>16</sup>
        texels, but we expect most implementations to exceed that substantially). When a buffer object is attached to a buffer texture, a size is not
        specified; rather, the number of texels in the texture is taken by dividing the size of the buffer object by the size of each texel.

        This extension also allows a sub-range of the buffer's data store to be attached to a texture. This can be used, for example, to allow multiple buffer
        textures to be backed by independent sub-ranges of the same buffer object, or for different sub-ranges of a single buffer object to be used for
        different purposes.
        """

    IntConstant(
        """
        Accepted by the {@code target} parameter of BindBuffer, BufferData, BufferSubData, MapBufferRange, BindTexture, UnmapBuffer, GetBufferParameteriv,
        GetBufferPointerv, TexBufferEXT, and TexBufferRangeEXT.
        """,

        "TEXTURE_BUFFER_EXT"..0x8C2A
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetBooleanv, GetFloatv, and GetIntegerv.",

        "TEXTURE_BUFFER_BINDING_EXT"..0x8C2A,
        "MAX_TEXTURE_BUFFER_SIZE_EXT"..0x8C2B,
        "TEXTURE_BINDING_BUFFER_EXT"..0x8C2C,
        "TEXTURE_BUFFER_OFFSET_ALIGNMENT_EXT"..0x919F
    )

    IntConstant(
        """
        Returned in the {@code type} parameter of GetActiveUniform, the {@code params} parameter of GetActiveUniformsiv, and the {@code params} parameter of
        GetProgramResourceiv when the TYPE property is queried on the UNIFORM interface.
        """,

        "SAMPLER_BUFFER_EXT"..0x8DC2,
        "INT_SAMPLER_BUFFER_EXT"..0x8DD0,
        "UNSIGNED_INT_SAMPLER_BUFFER_EXT"..0x8DD8,
        "IMAGE_BUFFER_EXT"..0x9051,
        "INT_IMAGE_BUFFER_EXT"..0x905C,
        "UNSIGNED_INT_IMAGE_BUFFER_EXT"..0x9067
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTexLevelParameter.",

        "TEXTURE_BUFFER_DATA_STORE_BINDING_EXT"..0x8C2D,
        "TEXTURE_BUFFER_OFFSET_EXT"..0x919D,
        "TEXTURE_BUFFER_SIZE_EXT"..0x919E
    )

    void(
        "TexBufferEXT",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("internalformat", ""),
        GLuint.IN("buffer", "")
    )

    void(
        "TexBufferRangeEXT",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("internalformat", ""),
        GLuint.IN("buffer", ""),
        GLintptr.IN("offset", ""),
        GLsizeiptr.IN("size", "")
    )
}