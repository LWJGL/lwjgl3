/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val IMG_program_binary = "IMGProgramBinary".nativeClassGLES("IMG_program_binary", postfix = IMG) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension makes available a program binary format, SGX_PROGRAM_BINARY_IMG. It enables retrieving and loading of pre-linked program objects on
        chips designed by Imagination Technologies.

        Requires ${GLES20.core} and ${OES_get_program_binary.link}.
        """

    IntConstant(
        "Accepted by the {@code binaryFormat} parameter of ProgramBinaryOES.",

        "SGX_PROGRAM_BINARY_IMG"..0x9130
    )
}