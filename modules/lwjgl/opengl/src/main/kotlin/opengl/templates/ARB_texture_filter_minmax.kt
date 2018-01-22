/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_filter_minmax = "ARBTextureFilterMinmax".nativeClassGL("ARB_texture_filter_minmax") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        In unextended OpenGL, minification and magnification filters such as #LINEAR allow texture lookups to returned a filtered texel value produced by
        computing an weighted average of a collection of texels in the neighborhood of the texture coordinate provided.

        This extension provides a new texture and sampler parameter (#TEXTURE_REDUCTION_MODE_ARB) which allows applications to produce a filtered texel value
        by computing a component-wise minimum (#MIN) or maximum (#MAX) of the texels that would normally be averaged. The reduction mode is orthogonal
        to the minification and magnification filter parameters. The filter parameters are used to identify the set of texels used to produce a final filtered
        value; the reduction mode identifies how these texels are combined.

        Requires ${GL33.core}.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameter to SamplerParameter{i f}{v}, SamplerParameterI{u}iv, GetSamplerParameter{i f}v, GetSamplerParameterI{u}iv,
        TexParameter{i f}{v}, TexParameterI{u}iv, GetTexParameter{i f}v, GetTexParameterI{u}iv, TextureParameter{i f}{v}, TextureParameterI{u}iv,
        GetTextureParameter{i f}v, and GetTextureParameterI{u}iv.
        """,

        "TEXTURE_REDUCTION_MODE_ARB"..0x9366
    )

    IntConstant(
        """
        Accepted by the {@code param} or {@code params} parameter to SamplerParameter{i f}{v}, SamplerParameterI{u}iv, TexParameter{i f}{v}, TexParameterI{u}iv,
        TextureParameter{i f}{v}, and TextureParameterI{u}iv when {@code pname} is TEXTURE_REDUCTION_MODE_ARB.
        """,

        "WEIGHTED_AVERAGE_ARB"..0x9367
    )
}