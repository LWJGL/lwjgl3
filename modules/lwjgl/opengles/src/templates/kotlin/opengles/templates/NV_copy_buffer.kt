/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_copy_buffer = "NVCopyBuffer".nativeClassGLES("NV_copy_buffer", postfix = NV) {
    IntConstant(
        "COPY_READ_BUFFER_NV"..0x8F36,
        "COPY_WRITE_BUFFER_NV"..0x8F37
    )

    void(
        "CopyBufferSubDataNV",

        GLenum("readTarget"),
        GLenum("writeTarget"),
        GLintptr("readOffset"),
        GLintptr("writeOffset"),
        GLsizeiptr("size")
    )
}