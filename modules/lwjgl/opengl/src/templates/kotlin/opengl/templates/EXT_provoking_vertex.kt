/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_provoking_vertex = "EXTProvokingVertex".nativeClassGL("EXT_provoking_vertex", postfix = EXT) {
    IntConstant(
        "FIRST_VERTEX_CONVENTION_EXT"..0x8E4D,
        "LAST_VERTEX_CONVENTION_EXT"..0x8E4E
    )

    IntConstant(
        "PROVOKING_VERTEX_EXT"..0x8E4F,
        "QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION_EXT"..0x8E4C
    )

    void(
        "ProvokingVertexEXT",

        GLenum("mode")
    )
}