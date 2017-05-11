/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_texture_filter_minmax = "EXTTextureFilterMinmax".nativeClassGLES("EXT_texture_filter_minmax", postfix = EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "texture_filter_minmax")} extension.

        In unextended OpenGL 4.3, minification and magnification filters such as LINEAR allow texture lookups to returned a filtered texel value produced by
        computing an weighted average of a collection of texels in the neighborhood of the texture coordinate provided.

        This extension provides a new texture and sampler parameter (TEXTURE_REDUCTION_MODE_EXT) which allows applications to produce a filtered texel value by
        computing a component-wise minimum (MIN) or maximum (MAX) of the texels that would normally be averaged. The reduction mode is orthogonal to the
        minification and magnification filter parameters. The filter parameters are used to identify the set of texels used to produce a final filtered value;
        the reduction mode identifies how these texels are combined.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameter to SamplerParameter{i f}{v}, SamplerParameterI{u}iv, GetSamplerParameter{i f}v, GetSamplerParameterI{u}iv,
        TexParameter{i f}{v}, TexParameterI{u}iv, GetTexParameter{i f}v, GetTexParameterI{u}iv, TextureParameter{i f}{v}EXT, TextureParameterI{u}ivEXT,
        GetTextureParameter{i f}vEXT, GetTextureParameterI{u}ivEXT, MultiTexParameter{i f}{v}EXT, MultiTexParameterI{u}ivEXT, GetMultiTexParameter{i f}vEXT, and
        GetMultiTexParameterI{u}ivEXT.
        """,

        "TEXTURE_REDUCTION_MODE_EXT"..0x9366
    )

    IntConstant(
        """
        Accepted by the {@code param} or {@code params} parameter to SamplerParameter{i f}{v}, SamplerParameterI{u}iv, TexParameter{i f}{v}, TexParameterI{u}iv,
        TextureParameter{i f}{v}EXT, TextureParameterI{u}ivEXT, MultiTexParameter{i f}{v}EXT, or MultiTexParameterI{u}ivEXT when {@code pname} is
        TEXTURE_REDUCTION_MODE_EXT.
        """,

        "WEIGHTED_AVERAGE_EXT"..0x9367
    )

    void(
        "RasterSamplesEXT",
        "",

        GLuint.IN("samples", ""),
        GLboolean.IN("fixedsamplelocations", "")
    )
}