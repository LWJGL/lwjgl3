/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*
import org.lwjgl.opengles.BufferType.*

val EXT_base_instance = "EXTBaseInstance".nativeClassGLES("EXT_base_instance", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows the offset within buffer objects used for instanced rendering to be specified. This is congruent with the {@code first} parameter
        in glDrawArrays and the {@code basevertex} parameter in glDrawElements. When instanced rendering is performed (for example, through
        glDrawArraysInstanced), instanced vertex attributes whose vertex attribute divisors are non-zero are fetched from enabled vertex arrays per-instance
        rather than per-vertex. However, in unextended OpenGL ES, there is no way to define the offset into those arrays from which the attributes are fetched.
        This extension adds that offset in the form of a {@code baseinstance} parameter to several new procedures.

        The {@code baseinstance} parameter is added to the index of the array element, after division by the vertex attribute divisor. This allows several sets of
        instanced vertex attribute data to be stored in a single vertex array, and the base offset of that data to be specified for each draw. Further, this
        extension exposes the {@code baseinstance} parameter as the final and previously undefined structure member of the draw-indirect data structure.

        Requires ${GLES30.core}.
        """

    void(
        "DrawArraysInstancedBaseInstanceEXT",
        "",

        GLenum.IN("mode", ""),
        GLint.IN("first", ""),
        GLsizei.IN("count", ""),
        GLsizei.IN("instancecount", ""),
        GLuint.IN("baseinstance", "")
    )

    void(
        "DrawElementsInstancedBaseInstanceEXT",
        "",

        GLenum.IN("mode", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN("type", ""),
        ELEMENT_ARRAY_BUFFER..const..void_p.IN("indices", ""),
        GLsizei.IN("instancecount", ""),
        GLuint.IN("baseinstance", "")
    )

    void(
        "DrawElementsInstancedBaseVertexBaseInstanceEXT",
        "",

        GLenum.IN("mode", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN("type", ""),
        ELEMENT_ARRAY_BUFFER..const..void_p.IN("indices", ""),
        GLsizei.IN("instancecount", ""),
        GLint.IN("basevertex", ""),
        GLuint.IN("baseinstance", "")
    )
}