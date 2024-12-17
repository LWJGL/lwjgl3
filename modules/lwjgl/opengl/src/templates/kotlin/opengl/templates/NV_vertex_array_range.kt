/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_vertex_array_range = "NVVertexArrayRange".nativeClassGL("NV_vertex_array_range", postfix = NV) {
    IntConstant(
        "VERTEX_ARRAY_RANGE_NV"..0x851D
    )

    IntConstant(
        "VERTEX_ARRAY_RANGE_LENGTH_NV"..0x851E,
        "VERTEX_ARRAY_RANGE_VALID_NV"..0x851F,
        "MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV"..0x8520
    )

    IntConstant(
        "VERTEX_ARRAY_RANGE_POINTER_NV"..0x8521
    )

    void(
        "VertexArrayRangeNV",

        AutoSize("pointer")..GLsizei("length"),
        void.p("pointer")
    )

    void("FlushVertexArrayRangeNV")
}