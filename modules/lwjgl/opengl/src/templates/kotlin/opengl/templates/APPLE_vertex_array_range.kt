/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val APPLE_vertex_array_range = "APPLEVertexArrayRange".nativeClassGL("APPLE_vertex_array_range") {
    IntConstant(
        "VERTEX_ARRAY_RANGE_APPLE"..0x851D
    )

    IntConstant(
        "VERTEX_ARRAY_RANGE_LENGTH_APPLE"..0x851E,
        "MAX_VERTEX_ARRAY_RANGE_ELEMENT_APPLE"..0x8520
    )

    IntConstant(
        "VERTEX_ARRAY_RANGE_POINTER_APPLE"..0x8521
    )

    IntConstant(
        "VERTEX_ARRAY_STORAGE_HINT_APPLE"..0x851F
    )

    IntConstant(
        "STORAGE_CLIENT_APPLE"..0x85B4,
        "STORAGE_CACHED_APPLE"..0x85BE,
        "STORAGE_SHARED_APPLE"..0x85BF
    )

    void(
        "VertexArrayRangeAPPLE",

        AutoSize("pointer")..GLsizei("length"),
        void.p("pointer")
    )

    void(
        "FlushVertexArrayRangeAPPLE",

        AutoSize("pointer")..GLsizei("length"),
        void.p("pointer")
    )

    void(
        "VertexArrayParameteriAPPLE",

        GLenum("pname"),
        GLint("param")
    )
}