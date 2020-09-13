/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val ARM_texture_unnormalized_coordinates = "ARMTextureUnnormalizedCoordinates".nativeClassGLES("ARM_texture_unnormalized_coordinates", postfix = ARM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides the option to switch to unnormalized coordinates for texture lookups using a sampler parameter.

        Texture lookup in OpenGL ES is done using normalized coordinates. For certain applications it is convenient to work with non-normalized coordinates
        instead. It also beneficial to keep support for bilinear filtering.

        Additional restrictions apply to textures with non-normalized coordinates that affect texture completeness and the available texture lookup functions.

        Requires ${GLES30.core}.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameter of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, SamplerParameteri, SamplerParameterf,
        SamplerParameteriv, SamplerParameterfv, TexParameterIivEXT, TexParameterIuivEXT, SamplerParameterIivEXT, SamplerParameterIuivEXT, GetTexParameteriv,
        GetTexParameterfv, GetTexParameterIivEXT, GetTexParameterIuivEXT, GetSamplerParameteriv, GetSamplerParameterfv, GetSamplerParameterIivEXT, and
        GetSamplerParameterIuivEXT.
        """,

        "TEXTURE_UNNORMALIZED_COORDINATES_ARM"..0x8F6A
    )
}
