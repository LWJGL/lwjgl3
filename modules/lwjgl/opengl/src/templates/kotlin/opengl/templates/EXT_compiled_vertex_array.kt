/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_compiled_vertex_array = "EXTCompiledVertexArray".nativeClassGL("EXT_compiled_vertex_array", postfix = EXT) {
    IntConstant(
        "ARRAY_ELEMENT_LOCK_FIRST_EXT"..0x81A8,
        "ARRAY_ELEMENT_LOCK_COUNT_EXT"..0x81A9
    )

    void(
        "LockArraysEXT",

        GLint("first"),
        GLsizei("count")
    )

    void("UnlockArraysEXT")
}