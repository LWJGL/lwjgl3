/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val ARM_mali_program_binary = "ARMMaliProgramBinary".nativeClassGLES("ARM_mali_program_binary", postfix = ARM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The OES_get_program_binary extension enables applications to retrieve program binaries using GetProgramBinaryOES and reload them using
        ProgramBinaryOES.

        The mechanism for retrieval and reloading of program binaries is vendor agnostic, but the binary format itself is vendor specific.

        This extension adds a token to identify program binaries that are compatible with the ARM Mali family of GPUs.

        Requires ${GLES20.core} and ${OES_get_program_binary.link}.
        """

    IntConstant(
        "Accepted by the {@code binaryFormat} parameter of ProgramBinaryOES.",

        "MALI_PROGRAM_BINARY_ARM"..0x8F61
    )
}