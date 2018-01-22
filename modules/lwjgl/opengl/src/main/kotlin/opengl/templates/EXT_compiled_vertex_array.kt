/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_compiled_vertex_array = "EXTCompiledVertexArray".nativeClassGL("EXT_compiled_vertex_array", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines an interface which allows static vertex array data to be cached or pre-compiled for more efficient rendering. This is useful for
        implementations which can cache the transformed results of array data for reuse by several DrawArrays, ArrayElement, or DrawElements commands. It is
        also useful for implementations which can transfer array data to fast memory for more efficient processing.

        For example, rendering an M by N mesh of quadrilaterals can be accomplished by setting up vertex arrays containing all of the vertexes in the mesh and
        issuing M DrawElements commands each of which operate on 2 * N vertexes. Each DrawElements command after the first will share N vertexes with the
        preceding DrawElements command. If the vertex array data is locked while the DrawElements commands are executed, then OpenGL may be able to transform
        each of these shared vertexes just once.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "ARRAY_ELEMENT_LOCK_FIRST_EXT"..0x81A8,
        "ARRAY_ELEMENT_LOCK_COUNT_EXT"..0x81A9
    )

    void(
        "LockArraysEXT",
        "",

        GLint.IN("first", ""),
        GLsizei.IN("count", "")
    )

    void(
        "UnlockArraysEXT",
        ""
    )
}