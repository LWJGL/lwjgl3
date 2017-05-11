/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_read_buffer = "NVReadBuffer".nativeClassGLES("NV_read_buffer", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Unextended OpenGL ES 2.0 only supports using ReadPixels to read from the default color buffer of the currently-bound framebuffer. However, it is useful
        for debugging to be able to read from non-default color buffers. Particularly, when the NV_draw_buffers extension is supported, each framebuffer may
        contain multiple color buffers. This extension provides a mechanism to select which color buffer to read from.

        The NV_read_buffer extension adds the command ReadBufferNV, which is used to select which color buffer of the currently-bound framebuffer to use as the
        source for subsequent calls to ReadPixels, CopyTexImage2D, and CopyTexSubImage2D. If the system-provided framebuffer is bound, then ReadBufferNV
        accepts value BACK. If a user-created FBO is bound, then ReadBufferNV accepts COLOR_ATTACHMENT0. Additionally, if the NV_draw_buffers extension is
        supported, ReadBufferNV accepts COLOR_ATTACHMENTn_NV (n is 0 to 15).
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv.",

        "READ_BUFFER_NV"..0x0C02
    )

    void(
        "ReadBufferNV",
        "",

        GLenum.IN("mode", "")
    )
}

val NV_read_buffer_front = EXT_FLAG.nativeClassGLES("NV_read_buffer_front", postfix = NV) {
    documentation =
        """
        When true, the ${registryLink("NV", "NV_read_buffer")} extension is supported.

        Adds the ability to select the system-provided FRONT color buffer as the source for read operations when the system-provided framebuffer is bound and
        contains both a front and back buffer.

        Requires ${NV_read_buffer.link}.
        """
}