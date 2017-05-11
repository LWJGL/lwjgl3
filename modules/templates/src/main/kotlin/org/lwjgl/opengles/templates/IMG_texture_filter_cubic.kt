/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val IMG_texture_filter_cubic = "IMGTextureFilterCubic".nativeClassGLES("IMG_texture_filter_cubic", postfix = IMG) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        OpenGL ES provides two sampling methods available; nearest neighbor or linear filtering, with optional MIP Map sampling modes added to move between
        differently sized textures when downsampling.

        This extension adds an additional, high quality cubic filtering mode, using a Catmull-Rom bicubic filter. Performing this kind of filtering can be done
        in a shader by using 16 samples, but this can be inefficient. The cubic filter mode exposes an optimized high quality texture sampling using fixed
        functionality.

        This extension affects the way textures are sampled, by modifying the way texels within the same MIP-Map level are sampled and resolved. It does not
        affect MIP-Map filtering, which is still limited to linear or nearest.
        """


    IntConstant(
        """
        Accepted by the {@code params} parameters of TexParameterf, TexParameterfv, TexParameteri, TexParameteriv, SamplerParameterf, SamplerParameterfv,
        SamperParameteri and SamplerParameteriv, and returned in {@code params} by GetTexParameterfv, GetTexParameteriv, GetSamplerParameterfv and
        GetSamplerParameteriv when {@code pname} is TEXTURE_MIN_FILTER or TEXTURE_MAG_FILTER in either case.
        """,

        "CUBIC_IMG"..0x9139
    )

    IntConstant(
        "Accepted as above only when {@code pname} is TEXTURE_MIN_FILTER.",

        "CUBIC_MIPMAP_NEAREST_IMG"..0x913A,
        "CUBIC_MIPMAP_LINEAR_IMG"..0x913B
    )
}