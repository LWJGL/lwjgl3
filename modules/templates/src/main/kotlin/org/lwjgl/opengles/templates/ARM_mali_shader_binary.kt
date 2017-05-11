/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val ARM_mali_shader_binary = "ARMMaliShaderBinary".nativeClassGLES("ARM_mali_shader_binary", postfix = ARM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables OpenGL ES 2.0 applications running on ARM Mali graphics cores to use shaders precompiled with the Mali ESSL shader compiler.

        The shader objects loaded with this extension are equivalent to shaders created from source, i.e. there are no additional restrictions on which other
        shader objects they can be linked to, nor on which OpenGL ES states they can be used with.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code binaryFormat} parameter of ShaderBinary.",

        "MALI_SHADER_BINARY_ARM"..0x8F60
    )
}