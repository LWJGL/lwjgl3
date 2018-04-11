/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_stencil_texturing = "ARBStencilTexturing".nativeClassGL("ARB_stencil_texturing") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows texturing of the stencil component of a packed depth stencil texture. Stencil values are returned as unsigned integers. It is not
        possible to sample both depth and stencil values from the same texture, and this extension allows the app to select which is sampled for the bound
        texture.

        Requires ${ARB_depth_texture.link} and ${EXT_packed_depth_stencil.link}. ${GL43.promoted}
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameter and GetTexParameter*.",

        "DEPTH_STENCIL_TEXTURE_MODE"..0x90EA
    )

}