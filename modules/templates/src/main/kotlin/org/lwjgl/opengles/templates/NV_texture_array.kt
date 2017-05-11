/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_texture_array = "NVTextureArray".nativeClassGLES("NV_texture_array", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces the notion of two-dimensional array textures. An array texture is a collection of two-dimensional images of identical size
        and format, arranged in layers. Array textures are specified using TexImage3DNV, where the depth is used to indicate the number of layers in the image.

        An array texture is accessed as a single unit in a programmable shader, using a single coordinate vector. A single layer is selected, using the "p"
        texture coordinate, and that layer is then accessed as though it were a two-dimensional texture. The layer coordinate is provided as an unnormalized
        floating-point value in the range {@code [0,<n>-1]}, where {@code <n>} is the number of layers in the array texture. Texture lookups do not filter
        between layers, though such filtering can be achieved using programmable shaders. When mipmapping is used, each level of an array texture has the same
        number of layers as the base level; the number of layers is not reduced as the image size decreases.

        Single layers of array textures can be rendered to by binding them to a framebuffer object using the FramebufferTextureLayerNV function.
        """

    IntConstant(
        """
        Accepted by the {@code target} parameter of TexImage3DNV, TexSubImage3DNV, CopyTexSubImage3DNV, CompressedTexImage3DNV, CompressedTexSubImage3DNV,
        TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, GenerateMipmap, and BindTexture.
        """,

        "TEXTURE_2D_ARRAY_NV"..0x8C1A
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv and GetFloatv.",

        "TEXTURE_BINDING_2D_ARRAY_NV"..0x8C1D,
        "MAX_ARRAY_TEXTURE_LAYERS_NV"..0x88FF
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.",

        "FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_NV"..0x8CD4
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "SAMPLER_2D_ARRAY_NV"..0x8DC1
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of PixelStorei, GetBooleanv, GetIntegerv and GetFloatv.",

        "UNPACK_SKIP_IMAGES_NV"..0x806D,
        "UNPACK_IMAGE_HEIGHT_NV"..0x806E
    )

    void(
        "TexImage3DNV",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLint.IN("border", ""),
        GLenum.IN("format", ""),
        GLenum.IN("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("pixels", "")
    )

    void(
        "TexSubImage3DNV",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLint.IN("yoffset", ""),
        GLint.IN("zoffset", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLenum.IN("format", ""),
        GLenum.IN("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..PIXEL_UNPACK_BUFFER..const..void_p.IN("pixels", "")
    )

    void(
        "CopyTexSubImage3DNV",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLint.IN("yoffset", ""),
        GLint.IN("zoffset", ""),
        GLint.IN("x", ""),
        GLint.IN("y", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    void(
        "CompressedTexImage3DNV",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLint.IN("border", ""),
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("data", "")
    )

    void(
        "CompressedTexSubImage3DNV",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLint.IN("yoffset", ""),
        GLint.IN("zoffset", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLenum.IN("format", ""),
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..const..void_p.IN("data", "")
    )

    void(
        "FramebufferTextureLayerNV",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("attachment", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLint.IN("layer", "")
    )
}