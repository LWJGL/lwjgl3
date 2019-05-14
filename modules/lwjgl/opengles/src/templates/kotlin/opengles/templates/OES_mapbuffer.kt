/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_mapbuffer = "OESMapbuffer".nativeClassGLES("OES_mapbuffer", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds to the vertex buffer object functionality supported by OpenGL ES 1.1 or ES 2.0 by allowing the entire data storage of a buffer
        object to be mapped into the client's address space.
        """

    IntConstant(
        "Accepted by the {@code access} parameter of MapBufferOES.",

        "WRITE_ONLY_OES"..0x88B9
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetBufferParameteriv.",

        "BUFFER_ACCESS_OES"..0x88BB,
        "BUFFER_MAPPED_OES"..0x88BC
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBufferPointervOES.",

        "BUFFER_MAP_POINTER_OES"..0x88BD
    )

    MapPointer("GLES20.glGetBufferParameteri(target, GLES20.GL_BUFFER_SIZE)", oldBufferOverloads = true)..void.p(
        "MapBufferOES",
        "",

        GLenum("target", ""),
        GLenum("access", "")
    )

    GLboolean(
        "UnmapBufferOES",
        "",

        GLenum("target", "")
    )

    void(
        "GetBufferPointervOES",
        "",

        GLenum("target", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..void.p.p("params", "")
    )
}