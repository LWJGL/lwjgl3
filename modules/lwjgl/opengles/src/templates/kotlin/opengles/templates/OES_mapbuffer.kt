/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_mapbuffer = "OESMapbuffer".nativeClassGLES("OES_mapbuffer", postfix = OES) {
    IntConstant(
        "WRITE_ONLY_OES"..0x88B9
    )

    IntConstant(
        "BUFFER_ACCESS_OES"..0x88BB,
        "BUFFER_MAPPED_OES"..0x88BC
    )

    IntConstant(
        "BUFFER_MAP_POINTER_OES"..0x88BD
    )

    MapPointer("GLES20.glGetBufferParameteri(target, GLES20.GL_BUFFER_SIZE)", oldBufferOverloads = true)..void.p(
        "MapBufferOES",

        GLenum("target"),
        GLenum("access")
    )

    GLboolean(
        "UnmapBufferOES",

        GLenum("target")
    )

    void(
        "GetBufferPointervOES",

        GLenum("target"),
        GLenum("pname"),
        ReturnParam..Check(1)..void.p.p("params")
    )
}