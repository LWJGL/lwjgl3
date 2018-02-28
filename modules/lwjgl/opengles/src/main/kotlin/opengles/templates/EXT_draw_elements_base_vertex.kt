/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*
import opengles.BufferType.*

val EXT_draw_elements_base_vertex = "EXTDrawElementsBaseVertex".nativeClassGLES("EXT_draw_elements_base_vertex", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a method to specify a "base vertex offset" value which is effectively added to every vertex index that is transferred through
        #DrawElements().

        This mechanism can be used to decouple a set of indices from the actual vertex array that it is referencing. This is useful if an application stores
        multiple indexed models in a single vertex array. The same index array can be used to draw the model no matter where it ends up in a larger vertex array
        simply by changing the base vertex value. Without this functionality, it would be necessary to rebind all the vertex attributes every time geometry is
        switched and this can have larger performance penalty.

        For example consider the (very contrived and simple) example of drawing two triangles to form a quad. In the typical example you have the following
        setup:
        ${codeBlock("""
    vertices         indices
   ----------        -----
0 | (-1,  1) |    0 |  0  |
1 | (-1, -1) |    1 |  1  |
2 | ( 1, -1) |    2 |  2  |
3 | ( 1,  1) |    3 |  3  |
   ----------     4 |  0  |
                  5 |  2  |
                     -----""")}
        which is normally rendered with the call
        ${codeBlock("DrawElements(TRIANGLES, 6, UNSIGNED_BYTE, &indices).")}
        Now consider the case where the vertices you want to draw are not at the start of a vertex array but are instead located at offset 100 into a larger
        array:
        ${codeBlock("""
     vertices2         indices2
     ----------        -----
        ....        0 | 100 |
100 | (-1,  1) |    1 | 101 |
101 | (-1, -1) |    2 | 102 |
102 | ( 1, -1) |    3 | 103 |
103 | ( 1,  1) |    4 | 100 |
        ....        5 | 102 |
     ----------        -----""")}
        The typical choices for rendering this are to rebind your vertex attributes with an additional offset of 100*stride, or to create an new array of
        indices (as indices2 in the example). However both rebinding vertex attributes and rebuilding index arrays can be quite costly activities.

        With the new drawing commands introduced by this extension you can instead draw using vertices2 and the new draw call:
        ${codeBlock("DrawElementsBaseVertexEXT(TRIANGLES, 6, UNSIGNED_BYTE, &indices, 100)")}

        Requires ${GLES20.core}.
        """

    void(
        "DrawElementsBaseVertexEXT",
        "",

        GLenum.IN("mode", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN("type", ""),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", ""),
        GLint.IN("basevertex", "")
    )

    DependsOn("GLES30")..void(
        "DrawRangeElementsBaseVertexEXT",
        "",

        GLenum.IN("mode", ""),
        GLuint.IN("start", ""),
        GLuint.IN("end", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN("type", ""),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", ""),
        GLint.IN("basevertex", "")
    )

    DependsOn("GLES30")..void(
        "DrawElementsInstancedBaseVertexEXT",
        "",

        GLenum.IN("mode", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN("type", ""),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", ""),
        GLsizei.IN("instancecount", ""),
        GLint.IN("basevertex", "")
    )

    DependsOn("GL_EXT_multi_draw_arrays")..void(
        "MultiDrawElementsBaseVertexEXT",
        "",

        GLenum.IN("mode", ""),
        GLsizei.const.p.IN("count", ""),
        GLenum.IN("type", ""),
        void.const.p.const.p.IN("indices", ""),
        AutoSize("count", "indices", "basevertex")..GLsizei.IN("primcount", ""),
        GLint.const.p.IN("basevertex", "")
    )
}