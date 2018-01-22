/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_copy_buffer = "NVCopyBuffer".nativeClassGLES("NV_copy_buffer", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a mechanism to do an accelerated copy from one buffer object to another. This may be useful to load buffer objects in a
        "loading thread" while minimizing cost and synchronization effort in the "rendering thread."
        """

    IntConstant(
        """
        Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBufferOES, UnmapBufferOES, GetBufferPointervOES, GetBufferParameteriv and
        CopyBufferSubDataNV.
        """,

        "COPY_READ_BUFFER_NV"..0x8F36,
        "COPY_WRITE_BUFFER_NV"..0x8F37
    )

    void(
        "CopyBufferSubDataNV",
        "",

        GLenum.IN("readTarget", ""),
        GLenum.IN("writeTarget", ""),
        GLintptr.IN("readOffset", ""),
        GLintptr.IN("writeOffset", ""),
        GLsizeiptr.IN("size", "")
    )
}