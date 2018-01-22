/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val ANGLE_program_binary = "ANGLEProgramBinary".nativeClassGLES("ANGLE_program_binary", postfix = ANGLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension makes available a program binary format, PROGRAM_BINARY_ANGLE. It enables retrieving and loading of pre-linked ANGLE program objects.

        Requires ${GLES20.core} and ${OES_get_program_binary.link}.
        """

    IntConstant(
        "Accepted by the {@code binaryFormat} parameter of ProgramBinaryOES.",

        "PROGRAM_BINARY_ANGLE"..0x93A6
    )
}