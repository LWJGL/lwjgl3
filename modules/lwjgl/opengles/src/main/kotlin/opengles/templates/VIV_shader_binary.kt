/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val VIV_shader_binary = "VIVShaderBinary".nativeClassGLES("VIV_shader_binary", postfix = VIV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables loading precompiled binary shaders compatible with chips designed by Vivante Corporation.
        """

    IntConstant(
        "Accepted by the {@code binaryformat} parameter of ShaderBinary.",

        "SHADER_BINARY_VIV"..0x8FC4
    )
}