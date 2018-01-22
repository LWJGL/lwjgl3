/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_texture_rg = "EXTTextureRG".nativeClassGLES("EXT_texture_rg", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Historically one- and two-component textures have been specified in OpenGL ES using the luminance or luminance-alpha (L/LA) formats. With the advent of
        programmable shaders and render-to-texture capabilities these legacy formats carry some historical artifacts which are no longer useful.

        For example, when sampling from such textures, the luminance values are replicated across the color components. This is no longer necessary with
        programmable shaders.

        It is also desirable to be able to render to one- and two-component format textures using capabilities such as framebuffer objects (FBO), but rendering
        to L/LA formats is under-specified (specifically how to map R/G/B/A values to L/A texture channels).

        This extension adds new base internal formats for one-component RED and two-component RG (red green) textures as well as sized RED and RG internal
        formats for renderbuffers. The RED and RG texture formats can be used for both texturing and rendering into with framebuffer objects.

        Requires ${GLES20.core}.
        """

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of TexImage2D and CopyTexImage2D, and the {@code format} parameter of TexImage2D, TexSubImage2D, and
        ReadPixels.
        """,

        "RED_EXT"..0x1903,
        "RG_EXT"..0x8227
    )

    IntConstant(
        "Accepted by the {@code internalformat} parameter of RenderbufferStorage and RenderbufferStorageMultisampleAPPLE.",

        "R8_EXT"..0x8229,
        "RG8_EXT"..0x822B
    )
}