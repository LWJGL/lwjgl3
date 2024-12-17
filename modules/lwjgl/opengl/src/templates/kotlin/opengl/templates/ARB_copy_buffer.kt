/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_copy_buffer = "ARBCopyBuffer".nativeClassGL("ARB_copy_buffer") {
    IntConstant(
        "COPY_READ_BUFFER"..0x8F36,
        "COPY_WRITE_BUFFER"..0x8F37
    )

    reuse(GL31C, "CopyBufferSubData")
}