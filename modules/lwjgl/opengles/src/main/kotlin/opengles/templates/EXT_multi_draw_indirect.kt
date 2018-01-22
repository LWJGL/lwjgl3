/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_multi_draw_indirect = "EXTMultiDrawIndirect".nativeClassGLES("EXT_multi_draw_indirect", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The ARB_draw_indirect extension (included in OpenGL 4.0 and OpenGL ES 3.1) introduced mechanisms whereby the parameters for a draw function may be
        provided in a structure contained in a buffer object rather than as parameters to the drawing procedure. This is known as an indirect draw and is
        exposed as two new functions, glDrawArraysIndirect and glDrawElementsIndirect. Each of these functions generates a single batch of primitives.

        This extension builds on this functionality by providing procedures to invoke multiple draws from a single procedure call. This allows large batches of
        drawing commands to be assembled in server memory (via a buffer object) which may then be dispatched through a single function call.

        Requires ${GLES31.core}.
        """

    void(
        "MultiDrawArraysIndirectEXT",
        "",

        GLenum.IN("mode", ""),
        DRAW_INDIRECT_BUFFER..MultiType(
            PointerMapping.DATA_INT
        )..Check("drawcount * (stride == 0 ? (4 * 4) : stride)")..const..void_p.IN("indirect", ""),
        GLsizei.IN("drawcount", ""),
        GLsizei.IN("stride", "")
    )

    void(
        "MultiDrawElementsIndirectEXT",
        "",

        GLenum.IN("mode", ""),
        GLenum.IN("type", ""),
        DRAW_INDIRECT_BUFFER..MultiType(
            PointerMapping.DATA_INT
        )..Check("drawcount * (stride == 0 ? (5 * 4) : stride)")..const..void_p.IN("indirect", ""),
        GLsizei.IN("drawcount", ""),
        GLsizei.IN("stride", "")
    )
}