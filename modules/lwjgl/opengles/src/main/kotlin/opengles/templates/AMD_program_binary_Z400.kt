/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val AMD_program_binary_Z400 = "AMDProgramBinaryZ400".nativeClassGLES("AMD_program_binary_Z400", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        AMD provides an offline shader compiler as part of its suite of SDK tools for AMD's Z400 family of embedded graphics accelerator IP. This extension
        makes available a program binary format, Z400_BINARY_AMD.

        The offline shader compiler accepts a pair of OpenGL Shading Language (GLSL) source shaders: one vertex shader and one fragment shader. It outputs a
        compiled, optimized, and pre-linked program binary which can then be loaded into a program objects via the ProgramBinaryOES command.

        Applications are recommended to use the OES_get_program_binary extension's program binary retrieval mechanism for install-time shader compilation where
        applicable. That cross-vendor extension provides the performance benefits of loading pre-compiled program binaries, while providing the portability of
        deploying GLSL source shaders with the application rather than vendor- specific binaries. The details of this extension are obviated by the use of that
        extension.

        Requires ${GLES20.core} and ${OES_get_program_binary.link}.
        """

    IntConstant(
        "Accepted by the {@code binaryFormat} parameter of ProgramBinaryOES.",

        "Z400_BINARY_AMD"..0x8740
    )
}