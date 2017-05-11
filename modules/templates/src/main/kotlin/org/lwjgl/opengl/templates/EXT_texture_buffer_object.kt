/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_texture_buffer_object = "EXTTextureBufferObject".nativeClassGL("EXT_texture_buffer_object", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a new texture type, called a buffer texture. Buffer textures are one-dimensional arrays of texels whose storage comes from an
        attached buffer object. When a buffer object is bound to a buffer texture, a format is specified, and the data in the buffer object is treated as an
        array of texels of the specified format.

        The use of a buffer object to provide storage allows the texture data to be specified in a number of different ways: via buffer object loads
        (BufferData), direct CPU writes (MapBuffer), framebuffer readbacks (EXT_pixel_buffer_object extension). A buffer object can also be loaded by transform
        feedback (NV_transform_feedback extension), which captures selected transformed attributes of vertices processed by the GL. Several of these mechanisms
        do not require an extra data copy, which would be required when using conventional TexImage-like entry points.

        Buffer textures do not support mipmapping, texture lookups with normalized floating-point texture coordinates, and texture filtering of any sort, and
        may not be used in fixed-function fragment processing. They can be accessed via single texel fetch operations in programmable shaders. For assembly
        shaders (NV_gpu_program4), the TXF instruction is used. For GLSL (EXT_gpu_shader4), a new sampler type and texel fetch function are used.

        Buffer textures can be substantially larger than equivalent one-dimensional textures; the maximum texture size supported for buffer textures in the
        initial implementation of this extension is 2^27 texels, versus 2^13 (8192) texels for otherwise equivalent one-dimensional textures. (Note that this
        extension only guarantees support for buffer textures with 2^16 texels, but we expect most implementations to exceed that substantially.) When a buffer
        object is attached to a buffer texture, a size is not specified; rather, the number of texels in the texture is taken by dividing the size of the
        buffer object by the size of each texel.

        Requires ${GL20.core} and ${EXT_gpu_shader4.link} or ${registryLink("NV", "gpu_program4")}.
        """

    IntConstant(
        """
        Accepted by the {@code target} parameter of BindBuffer, BufferData, BufferSubData, MapBuffer, BindTexture, UnmapBuffer, GetBufferSubData,
        GetBufferParameteriv, GetBufferPointerv, and TexBufferEXT, and the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv.
        """,

        "TEXTURE_BUFFER_EXT"..0x8C2A
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv.",

        "MAX_TEXTURE_BUFFER_SIZE_EXT"..0x8C2B,
        "TEXTURE_BINDING_BUFFER_EXT"..0x8C2C,
        "TEXTURE_BUFFER_DATA_STORE_BINDING_EXT"..0x8C2D,
        "TEXTURE_BUFFER_FORMAT_EXT"..0x8C2E
    )

    void(
        "TexBufferEXT",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("internalformat", ""),
        GLuint.IN("buffer", "")
    )
}