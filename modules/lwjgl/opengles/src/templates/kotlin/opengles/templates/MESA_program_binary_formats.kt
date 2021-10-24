/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val MESA_program_binary_formats = "MESAProgramBinaryFormats".nativeClassGLES("MESA_program_binary_formats", postfix = MESA) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The {@code get_program_binary} exensions require a {@code GLenum} {@code binaryFormat}. This extension documents that format for use with Mesa.
        """

    IntConstant(
        """
        For {@code ARB_get_program_binary}, {@code GL_PROGRAM_BINARY_FORMAT_MESA} may be returned from #GetProgramBinary() calls in the {@code binaryFormat}
        parameter and when retrieving the value of #PROGRAM_BINARY_FORMATS.
        
        For ${OES_get_program_binary.link}, {@code GL_PROGRAM_BINARY_FORMAT_MESA} may be returned from #GetProgramBinaryOES() calls in the {@code binaryFormat}
        parameter and when retrieving the value of #PROGRAM_BINARY_FORMATS_OES.
        """,

        "PROGRAM_BINARY_FORMAT_MESA"..0x875F
    )
}