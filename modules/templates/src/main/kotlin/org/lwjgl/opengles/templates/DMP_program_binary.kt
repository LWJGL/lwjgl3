/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val DMP_program_binary = "DMPProgramBinary".nativeClassGLES("DMP_program_binary", postfix = DMP) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables loading precompiled program binaries compatible with chips designed by Digital Media Professionals Inc.

        Requires ${GLES20.core} and ${OES_get_program_binary.link}.
        """

    IntConstant(
        "Accepted by the {@code binaryFormat} parameter of ProgramBinaryOES.",

        "SMAPHS30_PROGRAM_BINARY_DMP"..0x9251,
        "SMAPHS_PROGRAM_BINARY_DMP"..0x9252,
        "DMP_PROGRAM_BINARY_DMP"..0x9253
    )
}