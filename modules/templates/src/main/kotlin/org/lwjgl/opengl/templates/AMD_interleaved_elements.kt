/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_interleaved_elements = "AMDInterleavedElements".nativeClassGL("AMD_interleaved_elements", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The glDrawElements function and its variants (instanced and indirect, for example) allow OpenGL to draw indexed arrays of vertices. Since its
        inception, OpenGL has supported unsigned bytes, unsigned shorts and unsigned integers as index types. However, all enabled vertex arrays may be
        represented by at most one shared index.

        A common scenario in graphics rendering is that several faces share a vertex where, for each face some properties of a vertex (position and texture
        coordinates, for example) should be common but others must be unique (colors, normals, and so on). Consider a mesh of a cube with per-face normals, for
        example. There are 8 vertices and 6 normals, and 12 triangles (where each face of the cube is represented as two triangles). To render this cube, we
        must compute the 24 unique permutations of position and normal and build a new element list to index into it. In fact, any advantage of indexed draw is
        lost here as the number of required permutations is equal to the final vertex count required to draw the object.

        This extension allows OpenGL to process multi-component packed element data. The maximum size of a vertex's index data is not increased, but the
        facility to store 2 16-bit or 2 or 4 8-bit indices per vertex is introduced. Each vertex attribute is given a swizzle property to allow its index to be
        sourced from one of up to 4 channels of index data. This effectively allows an application to supply multiple interleaved streams of index data to
        OpenGL. Each vertex attribute is given a 'channel selector' to select one of the up to 4 channels of vertex index information presented to OpenGL. This
        enables the use-case described above and many more. The swizzle parameter is also applied to vertex indices passed to shaders, and updates to the
        definition of base vertex parameters and primitive restart are applied.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of VertexAttribParameteriAMD and GetVertexAttrib{iv|dv|fv|Iiv|Iuiv|Ldv}.",

        "VERTEX_ELEMENT_SWIZZLE_AMD"..0x91A4
    )

    IntConstant(
        "Selected by the {@code pname} parameter of ProgramParameteri and GetProgramiv.",

        "VERTEX_ID_SWIZZLE_AMD"..0x91A5
    )

    void(
        "VertexAttribParameteriAMD",
        "",

        GLuint.IN("index", ""),
        GLenum.IN("pname", ""),
        GLint.IN("param", "")
    )
}