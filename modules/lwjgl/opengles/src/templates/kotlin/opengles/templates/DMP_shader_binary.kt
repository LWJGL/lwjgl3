/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val DMP_shader_binary = "DMPShaderBinary".nativeClassGLES("DMP_shader_binary", postfix = DMP) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables loading precompiled binary shaders compatible with chips designed by Digital Media Professionals Inc.
        """

    IntConstant(
        "Accepted by the {@code binaryformat} parameter of ShaderBinary.",

        "SHADER_BINARY_DMP"..0x9250
    )
}