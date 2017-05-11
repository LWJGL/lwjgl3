/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val FJ_shader_binary_GCCSO = "FJShaderBinaryGCCSO".nativeClassGLES("FJ_shader_binary_GCCSO", postfix = FJ) {
    documentation =
        """
        Native bindings to the ${registryLink("FJ", "shader_binary_GCCSO")} extension.

        This extension enables loading precompiled binary shaders compatible with chips designed by Fujitsu Semiconductor.
        """

    IntConstant(
        "Accepted by the {@code binaryformat} parameter of ShaderBinary.",

        "GCCSO_SHADER_BINARY_FJ"..0x9260
    )
}