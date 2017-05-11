/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_rgb10_a2ui = "ARBTextureRGB10_A2UI".nativeClassGL("ARB_texture_rgb10_a2ui") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds support for a new texturing format for unsigned 10.10.10.2 integer textures.

        OpenGL has supported #RGB10 and #RGB10_A2 formats for a very long time. This extension provides a variant of RGB10_A2 which supports unsigned
        integer data (in contrast to the above "unsigned normalized integer" formats).

        Requires ${GL30.core} or ${registryLinkTo("EXT", "texture_integer")}. ${GL33.promoted}
        """

    IntConstant(
        """
        Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, RenderbufferStorage and
        RenderbufferStorageMultisample.
        """,

        "RGB10_A2UI"..0x906F
    )
}