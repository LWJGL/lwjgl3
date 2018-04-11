/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_env_dot3 = "ARBTextureEnvDot3".nativeClassGL("ARB_texture_env_dot3", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Adds new dot product operation to the texture combiner operations.

        Requires ${ARB_multitexture.link} and ${ARB_texture_env_combine.link}. ${GL13.promoted}
        """

    IntConstant(
        "Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is COMBINE_RGB_ARB.",

        "DOT3_RGB_ARB"..0x86AE,
        "DOT3_RGBA_ARB"..0x86AF
    )
}