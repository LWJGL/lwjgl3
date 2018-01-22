/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val IMG_shader_binary = "IMGShaderBinary".nativeClassGLES("IMG_shader_binary", postfix = IMG) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables loading precompiled binary shaders compatible with chips designed by Imagination Technologies.
        """

    IntConstant(
        "Accepted by the {@code binaryformat} parameter of ShaderBinary.",

        "SGX_BINARY_IMG"..0x8C0A
    )
}